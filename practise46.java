
class Cylinder {

    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getRadius() {
        return radius;
    }
}

public class practise46 {

    public static void main(String[] args) {
        Cylinder cy = new Cylinder(5, 3);
        System.out.println("height: " + cy.getHeight());
        System.out.println("radies" + cy.getRadius());
    }
}
