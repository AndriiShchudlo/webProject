package logicForFolderStructure;
import java.io.File;
/**
 * Created by andriis on 12/19/16.
 */
public class BackFolder {
    public void backFolder (String path){
        if (path == null) path = "/";
        else {
            FoldersAndFiles back = new FoldersAndFiles();
            back.setUrlBack(new File(path).getParent());
        }
    }
}
