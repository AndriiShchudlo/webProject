package logicForFolderStructure;


public class FoldersAndFiles {
    private String name;
    private String url;

    public void setUrlBack(String urlBack) {
        this.urlBack = urlBack;
    }

    public String getUrlBack() {

        return urlBack;
    }

    private String urlBack;



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