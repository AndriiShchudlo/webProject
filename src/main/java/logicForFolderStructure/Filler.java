package logicForFolderStructure;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Filler {



    public List<String> getListFilesAndFolders(String path) {



        List<String> listWithFileNames;
        listWithFileNames = new ArrayList<>();
        File f = new File(path);

        for (File s : f.listFiles()) {
            if (s.isDirectory()) {
                listWithFileNames.add(s.getName());

                } else if (s.isDirectory()) {

                  
                }
        }

        return listWithFileNames;
    }
}
