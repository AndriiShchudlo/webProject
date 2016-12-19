package logicForFolderStructure;
import java.io.File;

public class BackFolder {
    public String backFolder (String path){
        Validator validator = new Validator();
        path =  validator.isNull(path);

            FoldersAndFiles back = new FoldersAndFiles();
            File file = new File(path);


        return  file.getParent();
    }
}
