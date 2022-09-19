package polimorphysm.overload;

class Polygon {
    public void perimeter (int a, int b, int c) {
        System.out.println("Triângulo de perímetro: " + (a+b+c));
    }
    public void perimeter (int a, int b, int c, int d) {
        System.out.println("Quadrilátero de perímetro: " + (a+b+c+d));
    }
    public void perimeter (int a, int b, int c, int d, int e) {
        System.out.println("Pentágono de perímetro> " + (a+b+c+d+e));
    }
}

public class Polygons {
    
    public static void main(String[] args) throws Exception {
        Polygon pol = new Polygon();

        pol.perimeter(1, 2, 3);
        pol.perimeter(5,9, 5, 5);
        pol.perimeter(5, 9, 5, 6, 8);
    }
}
