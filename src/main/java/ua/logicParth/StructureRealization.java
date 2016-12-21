package ua.logicParth;

import ua.interfaces.SystemRealization;
import ua.ViewPackage.BackGetter;
import ua.ViewPackage.FilesView;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Service
public class StructureRealization implements SystemRealization{

   private Validator validator = new Validator();


    @Override
    public List<FilesView> getListFilesAndFolders(String path) {

        path = validator.isNull(path);

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

    @Override
    public BackGetter backFolder (String path){

        path = validator.isNull(path);

        BackGetter backGetter = new BackGetter();
        File file = new File(path);
        backGetter.setUrlBack(file.getParent());

        return backGetter;
    }

}
