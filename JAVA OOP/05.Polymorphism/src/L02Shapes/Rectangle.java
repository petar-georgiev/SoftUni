package L02Shapes;

public class Rectangle extends Shape {
    private Double height;
    private Double width;

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;

    }

    @Override
    protected void calculatePerimeter() {
        Double result = 2 * height + 2 * width;
        super.setPerimeter(result);
    }

    @Override
    protected void calculateArea() {
        Double result = height * width;
        super.setArea(result);
    }

    public Double getHeight() {
        return height;
    }

    public Double getWidth() {
        return width;
    }
}
