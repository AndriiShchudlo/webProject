package logicForFolderStructure;


public class FoldersAndFilesdata {
    private String name;
    private String file;
    private String folder;

    public FoldersAndFilesdata(String name, String file, String folder) {
        this.name = name;
        this.file = file;
        this.folder = folder;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public String getName() {

        return name;
    }

    public String getFile() {
        return file;
    }

    public String getFolder() {
        return folder;
    }
}
