package yaejae;

class Circle {
    private int x;
    private int y;
    private int radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle(" + x + "," + y + ")반지름" + radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Circle otherCircle = (Circle) obj;
        return this.x == otherCircle.x && this.y == otherCircle.y;
    }

    public static void main(String[] args) {
        Circle a = new Circle(2, 3, 5);
        Circle b = new Circle(2, 3, 30);
        System.out.println("원 a : " + a);
        System.out.println("원 b : " + b);
        if (a.equals(b))
            System.out.println("같은 원");
        else
            System.out.println("다른 원");
    }
}
