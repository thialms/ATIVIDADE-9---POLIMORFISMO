// 1. Sobrescrita de métodos em uma hierarquia de veículos

class Veiculo {
    void mover() {
        System.out.println("O veículo está se movendo.");
    }
}

class Carro extends Veiculo {
    @Override
    void mover() {
        System.out.println("O carro está dirigindo.");
    }
}

class Bicicleta extends Veiculo {
    @Override
    void mover() {
        System.out.println("A bicicleta está pedalando.");
    }
}

public class TesteVeiculo {
    public static void main(String[] args) {
        Veiculo carro = new Carro();
        Veiculo bicicleta = new Bicicleta();

        carro.mover();
        bicicleta.mover();
    }
}

/*
Pergunta:
A sobrescrita de métodos permite que subclasses definam comportamentos específicos para métodos herdados da superclasse.
Assim, mesmo objetos sendo da mesma hierarquia (Veiculo), o método mover() se comporta de forma diferente dependendo do tipo real
do objeto, possibilitando polimorfismo dinâmico.
*/
