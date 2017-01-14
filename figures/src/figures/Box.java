package figures;

/**
 * Created by Администратор on 14.01.2017.
 */
public class Box {
    private double width;
    private double height;
    private double depth;

    static {
        System.out.println("просто строка");
    }

    public Box() {
        //width = 0.0;
        //height = 0.0;
        //depth = 0.0;
    }

    public Box(double length) {
        width = height = depth = length;
    }

    public Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    public Box(Box tmpObj) {
        width = tmpObj.getWidth();
        height = tmpObj.getHeight();
        depth = tmpObj.getDepth();
    }

    public Box(Box tmpObj, double size) {
        width = tmpObj.getWidth() + size;
        height = tmpObj.getHeight() + size;
        depth = tmpObj.getDepth() + size;
    }

    public double perimetr() {              // perimetr =))
        return 2 * (width + height);
    }

    public double square() {
        return width * height;
    }

    public double volume() {
        return width * height * depth;
    }



    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
        return depth;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    protected void finalize() {
        System.out.println("");
        System.out.println("Сбор мусора");
        System.out.println("");
    }
}
