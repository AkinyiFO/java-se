// lastIndexOf() and substring() to isolate different parts of a file name
// Note: The methods in the following Filename class don't do any error checking and assume that their argument contains
//       a full directory path and a filenameProd with an extension.
//       If these methods were production code, they would verify that their arguments were properly constructed.
public class Filename {
    private String fullPath;
    private char pathSeparator,
            extensionSeparator;

    public Filename(String str, char sep, char ext) {
        fullPath = str;
        pathSeparator = sep;
        extensionSeparator = ext;
    }

    public String extension() {
        int dot = fullPath.lastIndexOf(extensionSeparator);
        return fullPath.substring(dot + 1);
    }

    // gets filenameProd without extension
    public String filename() {
        int dot = fullPath.lastIndexOf(extensionSeparator);
        int sep = fullPath.lastIndexOf(pathSeparator);
        return fullPath.substring(sep + 1, dot);
    }

    public String path() {
        int sep = fullPath.lastIndexOf(pathSeparator);
        return fullPath.substring(0, sep);
    }

    // code assumes that the file name has a period in it; if the file name does not have a period, lastIndexOf returns -1,
    // and the substring method throws a StringIndexOutOfBoundsException
    public static void main(String[] args) {
        final String FPATH = "/home/user/index.html";
        Filename myHomePage = new Filename(FPATH, '/', '.');
        System.out.println("Extension = " + myHomePage.extension());
        System.out.println("Filename = " + myHomePage.filename());
        System.out.println("Path = " + myHomePage.path());
    }
}
