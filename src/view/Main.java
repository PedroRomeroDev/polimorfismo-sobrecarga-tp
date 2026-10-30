package view;
import model.Pagamento;
import model.PagamentoBoleto;
import model.PagamentoCartao;
import model.Produto;
import model.Conversor;

public class Main {

	public static void main(String[] args) {
		// ATV1
		Produto prod1 = new Produto("Arroz");
		Produto prod2 = new Produto("Feijao", 12.99);
		Produto prod3 = new Produto("Farinha", 6.80, 10);
		
		// A sobrecarga ela facilita a criação de diferentes objetos, instanciando diferentes informações pelo mesmo metodo. O mesmo metodo abrange	diversos contextos
		
		// ATV2
		Pagamento pagamento = new Pagamento();
		PagamentoBoleto pagamentoBol = new PagamentoBoleto();
		PagamentoCartao pagamentoCard = new PagamentoCartao();
		
		pagamento.processarPagamento();
		pagamentoBol.processarPagamento();
		pagamentoCard.processarPagamento();
		
		// O polimorfismo mantem a organização de ser o mesmo método e esse método se adequar a aquela classe, por isso o polimorfismo e a subescrita de metodos é tão usual.
		// Nao precisamos criar o mesmo metodo pra cada, apenas o adequamos ao contexto da classe.
		
		// ATV3
		System.out.println("10 graus em fahrenheit: " + Conversor.converter(10));
		System.out.println("1Km em milhas: " + Conversor.converter(1000.0));
		System.out.println("MAIUSCULO EM: " + Conversor.converter("MINUSCULO"));
	}

}
