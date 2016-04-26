package mainpackage;

import java.util.ArrayList;

public class Requirements {

    public static ArrayList<ImageRequirement> iOSRequirements = new ArrayList<ImageRequirement>();
    public static ArrayList<ImageRequirement> androidRequirements = new ArrayList<ImageRequirement>();

    public static void setup(){
        iOSRequirements.add(new ImageRequirement("Icon-60@3x.png", 180,180));
        iOSRequirements.add(new ImageRequirement("Icon-Small-40@3x.png", 120, 120));
        iOSRequirements.add(new ImageRequirement("Icon-Small@3x.png", 87, 87));
        iOSRequirements.add(new ImageRequirement("Icon-60.png", 60, 60));
        iOSRequirements.add(new ImageRequirement("Icon-60@2x.png", 120,120));
        iOSRequirements.add(new ImageRequirement("Icon-76.png", 76,76));
        iOSRequirements.add(new ImageRequirement("Icon-76@2x.png", 152, 152));
        iOSRequirements.add(new ImageRequirement("Icon-Small-40.png", 40, 40));
        iOSRequirements.add(new ImageRequirement("Icon-Small-40@2x.png",80,80));
        iOSRequirements.add(new ImageRequirement("Icon.png",57,57));
        iOSRequirements.add(new ImageRequirement("Icon@2x.png",114,114));
        iOSRequirements.add(new ImageRequirement("Icon-72.png",72,72));
        iOSRequirements.add(new ImageRequirement("Icon-72@2x.png",144,144));
        iOSRequirements.add(new ImageRequirement("Icon-Small-50.png",50,50));
        iOSRequirements.add(new ImageRequirement("Icon-Small-50@2x.png",100,100));
        iOSRequirements.add(new ImageRequirement("Icon-Small.png",29,29));
        iOSRequirements.add(new ImageRequirement("Icon-Small@2x.png",58,58));

        androidRequirements.add(new ImageRequirement("Icon_512.png",512,512));
        androidRequirements.add(new ImageRequirement("Icon-xxxhdpi.png",192,192));
        androidRequirements.add(new ImageRequirement("Icon-xhdpi.png",96,96));
        androidRequirements.add(new ImageRequirement("Icon-hdpi.png",72,72));
        androidRequirements.add(new ImageRequirement("Icon-mdpi.png",48,48));
        androidRequirements.add(new ImageRequirement("Icon-ldpi.png",36,36));
    }
}
