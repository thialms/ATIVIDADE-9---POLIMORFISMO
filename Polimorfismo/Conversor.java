// 5. Sobrecarga de métodos em uma classe de conversão

class Conversor {

    double converter(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    double converter(double km, boolean isKmToMiles) {
        if (isKmToMiles) {
            return km * 0.621371;
        } else {
            return km;
        }
    }

    String converter(String texto) {
        return texto.toUpperCase();
    }
}

public class TesteConversor {
    public static void main(String[] args) {
        Conversor conv = new Conversor();

        System.out.println("25°C em Fahrenheit: " + conv.converter(25.0));
        System.out.println("10 km em milhas: " + conv.converter(10.0, true));
        System.out.println("Texto em maiúsculas: " + conv.converter("mano gpt"));
    }
}

/*
Pergunta:
A sobrecarga de métodos permite criar diferentes versões de um mesmo método, variando os parâmetros e comportamentos.
Isso oferece uma interface intuitiva e única, enquanto possibilita múltiplas funcionalidades para tipos e situações diferentes.
*/
