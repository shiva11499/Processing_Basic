import processing.core.PApplet;

public class FourBallsOOP extends PApplet {

    public static final int HEIGHT = 600;
    public static final int DISTANCE = HEIGHT / 5;
    public static final int WIDTH = 800;
    public static final int DIAMETER = 10;
    public static final int STARTING_POINT = 0;

    Circle circle, circle1, circle2, circle3;

    public static void main(String[] args) {
        PApplet.main("FourBallsOOP", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        circle = new Circle(STARTING_POINT, DISTANCE, DIAMETER, DIAMETER, 1);
        circle1 = new Circle(STARTING_POINT, 2 * DISTANCE, DIAMETER, DIAMETER, 2);
        circle2 = new Circle(STARTING_POINT, 3 * DISTANCE, DIAMETER, DIAMETER, 3);
        circle3 = new Circle(STARTING_POINT, 4 * DISTANCE, DIAMETER, DIAMETER, 4);
    }

    @Override
    public void draw() {
        displayCircles();
        moveCircles();
    }

    private void moveCircles() {
        circle.move();
        circle1.move();
        circle2.move();
        circle3.move();
    }

    private void displayCircles() {
        circle.display();
        circle1.display();
        circle2.display();
        circle3.display();
    }


    public class Circle {
        int starting_point;
        int distance;
        int diameter;
        int speed;


        public Circle(int starting_point, int distance, int diameter, int diameter1, int speed) {
            this.starting_point = starting_point;
            this.distance = distance;
            this.diameter = diameter;
            this.diameter = diameter1;
            this.speed = speed;
        }

        void display() {
            ellipse(starting_point, distance, diameter, diameter);
        }

        void move() {
            starting_point += speed;
        }
    }

}