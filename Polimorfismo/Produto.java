// 3. Sobrecarga de construtores

class Produto {
    String nome;
    double preco;
    int quantidade;

    Produto(String nome) {
        this.nome = nome;
    }

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    void exibirInfo() {
        System.out.println("Produto: " + nome + ", Preço: " + preco + ", Quantidade: " + quantidade);
    }
}

public class TesteProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto("Caneta");
        Produto p2 = new Produto("Caderno", 12.5);
        Produto p3 = new Produto("Lápis", 1.5, 50);

        p1.exibirInfo();
        p2.exibirInfo();
        p3.exibirInfo();
    }
}

/*
Pergunta:
A sobrecarga de construtores permite criar objetos com diferentes combinações de informações.
Assim, dá flexibilidade na instânciação, adaptando-se às informações disponíveis no momento da criação do objeto.
*/
