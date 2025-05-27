// 4. Sobrescrita de métodos em uma classe de pagamento

class Pagamento {
    void processarPagamento() {
        System.out.println("Processando pagamento genérico.");
    }
}

class PagamentoCartao extends Pagamento {
    @Override
    void processarPagamento() {
        System.out.println("Processando pagamento via cartão de crédito.");
    }
}

class PagamentoBoleto extends Pagamento {
    @Override
    void processarPagamento() {
        System.out.println("Processando pagamento via boleto bancário.");
    }
}

public class TestePagamento {
    public static void main(String[] args) {
        Pagamento p1 = new PagamentoCartao();
        Pagamento p2 = new PagamentoBoleto();

        p1.processarPagamento();
        p2.processarPagamento();
    }
}

/*
Pergunta:
O polimorfismo por sobrescrita permite que as subclasses forneçam implementações específicas para métodos herdados.
Isso facilita adicionar novos tipos de pagamento sem alterar a classe base, garantindo flexibilidade e expansão do sistema.
*/
