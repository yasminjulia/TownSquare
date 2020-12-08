package model;

import java.io.File;

public class Circular {
    public String title;
    public String description;
    public File file;

    public Circular(String title, String description){
        this.title=title;
        this.description=description;
        this.file = new File((this.filePath()+file));
    }
    private String filePath(){
        String executionPath = System.getProperty("user.dir");
        String os = System.getProperty("os.name");
        String target;

        if(os.contains("Windows")){
            target = executionPath + "\\src\\main\\resources\\fileUpload.pdf\\";
        }else {
            target = executionPath + "/src/main/resources/fileUpload.pdf/";
        }
        return target;
    }
}
