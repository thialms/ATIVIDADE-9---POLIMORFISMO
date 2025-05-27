// 2. Sobrecarga de métodos

class Calculadora {

    int somar(int a, int b) {
        return a + b;
    }

    int somar(int a, int b, int c) {
        return a + b + c;
    }

    double somar(double a, double b) {
        return a + b;
    }
}

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(calc.somar(2, 3));
        System.out.println(calc.somar(1, 2, 3));
        System.out.println(calc.somar(5.5, 2.3));
    }
}

/*
Pergunta:
A sobrecarga de métodos permite definir várias versões de um mesmo método, desde que com assinaturas diferentes
(tipos ou quantidade de parâmetros). Diferente da sobrescrita que atua entre classes, a sobrecarga ocorre na mesma classe.
Isso implementa polimorfismo em tempo de compilação (estático).
*/
