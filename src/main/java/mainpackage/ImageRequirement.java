package mainpackage;

public class ImageRequirement {
    private int width;
    private int height;
    private String name;

    public ImageRequirement( String name, int width, int height) {
        this.width = width;
        this.height = height;
        this.name = name;
    }

    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public String getName() {
        return name;
    }

}
