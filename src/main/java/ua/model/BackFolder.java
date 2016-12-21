package ua.model;
import ua.ViewPackage.BackGetter;

import java.io.File;

public class BackFolder {

    public BackGetter backFolder (String path){
            Validator validator = new Validator();
            path = validator.isNull(path);

            BackGetter backGetter = new BackGetter();
            File file = new File(path);
           backGetter.setUrlBack(file.getParent());

        return backGetter;
    }
}
