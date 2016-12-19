package model;

import ViewPackage.FilesView;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FormationFileList {

    public List<FilesView> getListFilesAndFolders(String path) {

        List<FilesView> files = new ArrayList<>();
        File file = new File(path);

        for (File i : file.listFiles()) {
            FilesView fileAndFolder = new FilesView();

                fileAndFolder.setName(i.getName());
                fileAndFolder.setFolder(i.isDirectory());
                fileAndFolder.setUrl(i.getAbsolutePath());

                files.add(fileAndFolder);
            }

            return files;
    }

}
