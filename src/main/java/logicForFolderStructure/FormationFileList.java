package logicForFolderStructure;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FormationFileList {

    public List<FoldersAndFiles> getListFilesAndFolders(String path) {

        List<FoldersAndFiles> files = new ArrayList<>();

        File file = new File(path);

        for (File i : file.listFiles()) {
            FoldersAndFiles fileAndFolder = new FoldersAndFiles();

                fileAndFolder.setName(i.getName());
                fileAndFolder.setFolder(i.isDirectory());
                fileAndFolder.setUrl(i.getAbsolutePath());

                fileAndFolder.setUrlBack(i.getParent());


                files.add(fileAndFolder);
            }
            return files;
    }

}
