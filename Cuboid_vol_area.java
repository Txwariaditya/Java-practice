class Cuboid {
    int length;
    int width;
    int height;

    Cuboid(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int volume() {
        System.out.println("Volume of the Cuboid");
        return length * width * height;
    }

    public int area() {
        System.out.println("Area of the Cuboid");
        return 2 * (length * width + width * height + height * length);
    }
}

public class Cuboid_vol_area {
    public static void main(String[] args) {
        Cuboid cuboid1 = new Cuboid(10, 10, 10);
        System.out.println("Volume of the Cuboid: " + cuboid1.volume());

        Cuboid cuboid2 = new Cuboid(10, 20, 30);
        System.out.println("Area of the Cuboid: " + cuboid2.area());
    }
}