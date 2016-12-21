package ua.interfaces;

import ua.ViewPackage.BackGetter;
import ua.ViewPackage.FilesView;

import java.util.List;

/**
 * Created by andriis on 12/21/16.
 */
public interface SystemRealization {
    List<FilesView> getListFilesAndFolders(String path);
    BackGetter backFolder (String path);
}
