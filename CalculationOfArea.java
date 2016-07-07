package dz4_1;

public class CalculationOfArea {

    public static void main(String[] args) {
        System.out.println("Площадь треугольника равна " + TriangleArea());
        System.out.println("Площадь круга равна " + RectangleArea());
        System.out.println("Площадь прямоугольника равна " + CircleArea());
    }



    public static double TriangleArea () {
        double a=5;
        double b=3.4;
        return ((a*b)/2);
}

    public static double  RectangleArea() {
        double a=123;
        double b=35.4;
        return (a*b);
    }
    public static double CircleArea () {
        double radius=5.7;

        return Math.PI*radius*radius;
    }
}


