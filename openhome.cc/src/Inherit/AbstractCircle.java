package Inherit;

public abstract class AbstractCircle {
    protected double radius;
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public abstract void render();
}
