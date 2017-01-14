package figures;


/**
 * Created by Администратор on 14.01.2017.
 */
public class Main {

    public static void main(String[] args) {

        double w = 2;
        double h = 3;
        double d = 4;

        System.out.println("width = " + w + "   height = " + h + "   depth = " + d);

        Box square = new Box(w);
        Box sameSquare = new Box();

        System.out.println("Ширина" + sameSquare.getWidth() + "Высота" + sameSquare.getHeight()
                            + "Глубина" + sameSquare.getDepth());

        System.out.println("Периметр square = " + square.perimetr());
        System.out.println("Объем square = " + square.volume());
        System.out.println("Площадь square = " + square.square());

        Box myBox = new Box(w, h, d);
        System.out.println("Периметр myBox = " + myBox.perimetr());
        System.out.println("Объем myBox = " + myBox.volume());
        System.out.println("Площадь myBox = " + myBox.square());

        Box myBox2 = new Box(myBox);
        Box myBox3 = new Box(myBox2, 10);

        System.out.println("Периметр myBox2 = " + myBox2.perimetr());
        System.out.println("Объем myBox2 = " + myBox2.volume());
        System.out.println("Площадь myBox2 = " + myBox2.square());

        System.out.println("Периметр myBox3 = " + myBox3.perimetr());
        System.out.println("Объем myBox3 = " + myBox3.volume());
        System.out.println("Площадь myBox3 = " + myBox3.square());
        


    }
}
