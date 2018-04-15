package operacoes;
import calculadora.Calculator;

public class Operacoes {
	
	public double n1;
	public double n2;
	public double res;
	public String operacao;
	
	public double Soma(double n1, double n2) {
		res = n1 + n2;
		return res;
	}
	
	public double Subtracao(double n1, double n2) {
		res = n1 - n2;
		return res;
	}
	
	public double Multiplicacao(double n1, double n2) {
		res = n1 * n2;
		return res;
	}
	
	public double Divisao(double n1, double n2) {
		res = n1 / n2;
		return res;
	}
	
	public double MaisMenos(double n1) {
		n1 *= (-1);
		return n1;
	}
	
	public double Raiz(double n1) {
		res = Math.sqrt(n1);
		return res;
	}
	
	public double Reciprocal(double n1) {
		res = 1/n1;
		return res;
	}
	
	public double Porcento(double n2) {
		
		res = n1*(n2/100);
		
		return res;
	}
	
}
