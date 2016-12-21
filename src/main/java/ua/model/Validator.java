package ua.model;

/**
 * Created by andriis on 12/16/16.
 */
public class Validator {

    public String isNull (String path){
        if (path == null) path = "/";
        return path;
    }
}
