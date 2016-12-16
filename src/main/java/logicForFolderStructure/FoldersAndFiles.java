package logicForFolderStructure;


public class FoldersAndFiles {
    private String name;
    private String url;

    private String file;



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

    public void setFile(String file) {
        this.file = file;
    }

    public String getFile() {
        return file;
    }

    public boolean isFolder() {
        return folder;
    }


    public void setFolder(boolean folder) {
        this.folder = folder;
    }

}
