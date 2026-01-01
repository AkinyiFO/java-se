public class FilenameProd {
    private final String fullPath;
    private final char pathSeparator;
    private final char extensionSeparator;

    public FilenameProd(String str, char sep, char ext) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Path must not be null or empty");
        }
        this.fullPath = str;
        this.pathSeparator = sep;
        this.extensionSeparator = ext;
    }

    public String extension() {
        int dot = fullPath.lastIndexOf(extensionSeparator);
        int sep = fullPath.lastIndexOf(pathSeparator);

        if (dot == -1 || dot < sep + 1 || dot == fullPath.length() - 1) {
            throw new IllegalStateException("No valid file extension found");
        }

        return fullPath.substring(dot + 1);
    }

    public String filenameProd() {
        int sep = fullPath.lastIndexOf(pathSeparator);
        int dot = fullPath.lastIndexOf(extensionSeparator);

        if (sep == -1) {
            throw new IllegalStateException("No path separator found");
        }

        if (dot == -1 || dot <= sep + 1) {
            throw new IllegalStateException("No valid file extension found");
        }

        return fullPath.substring(sep + 1, dot);
    }

    public String path() {
        int sep = fullPath.lastIndexOf(pathSeparator);

        if (sep <= 0) {
            throw new IllegalStateException("No valid directory path found");
        }

        return fullPath.substring(0, sep);
    }
}

