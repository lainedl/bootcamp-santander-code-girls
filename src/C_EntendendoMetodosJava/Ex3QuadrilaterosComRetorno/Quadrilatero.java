package C_EntendendoMetodosJava.Ex3QuadrilaterosComRetorno; //Sobrecarga de métodos

public class Quadrilatero {

    public static double area(double lado){
        return lado * lado;
    }

    public static double area(double lado1, double lado2){
        return lado1 * lado2;
    }

    public static double area(double baseMaior, double baseMenor, double altura){
        return ((baseMaior + baseMenor) * altura) / 2;
    }

    public static float area(float diagoanl1, float diagoanl2){
        return ((diagoanl1 * diagoanl2)/2);
    }
}

