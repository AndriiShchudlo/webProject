package logicForFolderStructure;
import ViewPackage.BackGetter;

import java.io.File;

public class BackFolder {
    public BackGetter backFolder (String path){

            BackGetter backGetter = new BackGetter();
            File file = new File(path);
           backGetter.setUrlBack(file.getParent());

        return backGetter;
    }
}
