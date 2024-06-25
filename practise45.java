
class Cylinder {

    // question 1
    private int radius;
    private int height;

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    // question 2
    public double volume() {
        return (2 * Math.PI * radius * radius * height);
    }

    public double area() {
        return (2 * (Math.PI * radius * radius) + (2 * 3.14 * radius * height));
    }
}

// question 5
class sphere {

    int spradius;

    public void setspRadius(int spradius) {
        this.spradius = spradius;
    }

    public int getspRadius() {
        return spradius;
    }
}

public class practise45 {

    public static void main(String[] args) {
        // question 1
        Cylinder cy = new Cylinder();
        cy.setHeight(5);
        System.out.println("height: " + cy.getHeight());
        cy.setRadius(2);
        System.out.println("radies" + cy.getRadius());

        // question 2
        System.out.println("Surface area: " + cy.area());
        System.out.println("volume: " + cy.volume());

        // question 5
        sphere sp = new sphere();
        sp.setspRadius(6);
        System.out.println("spreher radius " + sp.getspRadius());

    }
}
