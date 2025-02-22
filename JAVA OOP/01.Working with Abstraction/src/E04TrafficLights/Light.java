package E04TrafficLights;

public class Light {
    private Color color;

    public Light(Color color) {
        this.color = color;
    }

    public void changeColor() {
        switch (this.color) {
            case RED:
                this.color = Color.GREEN;
                break;
            case GREEN:
                this.color = Color.YELLOW;
                break;
            case YELLOW:
                this.color = Color.RED;
        }
    }

    public Color getColor() {
        return color;
    }
}
