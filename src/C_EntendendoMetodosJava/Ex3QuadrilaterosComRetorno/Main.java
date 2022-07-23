package C_EntendendoMetodosJava.Ex3QuadrilaterosComRetorno;

public class Main {

    public static void main(String[] args) {

        System.out.println("Exercicio retornos");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Area do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5,5);
        System.out.println("Area do retângulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7, 8, 9);
        System.out.println("Area do trapézio: " + areaTrapezio);

        float areaLosango = Quadrilatero.area(5,6);
        System.out.println("Area do losango: " + areaLosango);
    }
}

