package ua.ViewPackage;


public class FilesView {
    private String name;
    private String url;

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
            return url;
    }
    private boolean folder;

    public void setName( String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public boolean isFolder() {
        return folder;
    }

    public void setFolder(boolean folder) {
        this.folder = folder;
    }
}
