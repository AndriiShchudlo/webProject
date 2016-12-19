package ViewPackage;


public class BackGetter {
    private  String urlBack;


    public void setUrlBack(String urlBack) {
        this.urlBack = urlBack;
    }

      public String getUrlBack() {

        return urlBack;
    }

    public boolean isRoot() {
        return !(urlBack == null);
    }
}
