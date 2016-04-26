package mainpackage;

import net.coobird.thumbnailator.Thumbnails;

import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class ImageGenerator {

    private File appIcon;


    public ImageGenerator(File appIcon, JProgressBar progressbar){
        this.appIcon = appIcon;
        Requirements.setup();
    }


    public void generateIOS(){
        String iosDirectory = appIcon.getParent()+"\\iOSIcons";
        boolean success = new File(iosDirectory).mkdirs(); //create directory for IOS

        for(ImageRequirement req: Requirements.iOSRequirements){
            String fileName = iosDirectory.toString()+"\\"+req.getName();
            try {
                Thumbnails.of(appIcon).size(req.getWidth(), req.getHeight()).toFile(fileName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void generateAndroid(){

        String iosDirectory = appIcon.getParent()+"\\AndroidIcons";
        boolean success = new File(iosDirectory).mkdirs(); //create directory for IOS

        for(ImageRequirement req: Requirements.androidRequirements){
            String fileName = iosDirectory.toString()+"\\"+req.getName();
            try {
                Thumbnails.of(appIcon).size(req.getWidth(), req.getHeight()).toFile(fileName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



}
