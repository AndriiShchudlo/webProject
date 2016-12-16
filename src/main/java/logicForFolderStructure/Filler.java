package logicForFolderStructure;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class Filler {



    public List<FoldersAndFilesdata> getListFilesAndFolders(String path) {
        File file = new File(path);
        List<FoldersAndFilesdata> files = new ArrayList<>();


            for (File i : file.listFiles()) {
                FoldersAndFilesdata fileAndFolder = new FoldersAndFilesdata();
               fileAndFolder.setName(i.getName());
               fileAndFolder.setFolder(i.isDirectory());

               files.add(fileAndFolder);


            }
            return files;

    }
}
