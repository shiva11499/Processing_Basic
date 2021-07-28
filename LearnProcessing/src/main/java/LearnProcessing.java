import processing.core.PApplet;

public class LearnProcessing extends PApplet {

    public static final int HEIGHT = 600;
    public static final int DISTANCE = HEIGHT / 5;
    public static final int WIDTH = 800;
    public static final int DIAMETER = 10;
    int p = 0, q = 0, r = 0, s = 0;

    public static void main(String[] args) {
        PApplet.main("LearnProcessing",args);

    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        drawCircles();
    }

    private void drawCircles() {
        ellipse(p, DISTANCE, DIAMETER, DIAMETER);
        ellipse(q, 2*DISTANCE, DIAMETER, DIAMETER);
        ellipse(r, 3*DISTANCE, DIAMETER, DIAMETER);
        ellipse(s, 4*DISTANCE, DIAMETER, DIAMETER);
        setSpeeds();

    }

    private void setSpeeds() {
        p++;
        q+=2;
        r+=3;
        s+=4;
    }
}
