
class rectangle {

    int length;
    int width;

    public void setlength(int length) {
        this.length = length;
    }

    public int getlength() {
        return length;
    }

    public void setwidth(int width) {
        this.width = width;
    }

    public int getwidth() {
        return width;
    }

    public double getrectarea() {
        return length * width;
    }
}

class cuboid extends rectangle {

    int height;

    public void setheight(int height) {
        this.height = height;
    }

    public double getcuboidarea() {
        return (width * width * 2) + (width * length * 4);
    }

    public double getcuboidvolume() {
        return length * width * height;
    }
}

public class practise49 {

    public static void main(String[] args) {
        rectangle rect = new rectangle();
        rect.setlength(3);
        rect.setwidth(5);
        cuboid cub = new cuboid();
        cub.setlength(5);
        cub.setwidth(8);
        System.out.println("area of rectangle: " + rect.getrectarea());
        System.out.println("area of cuboid: " + cub.getcuboidarea());
        System.out.println("volume of cuboid: " + cub.getcuboidvolume());
    }
}
