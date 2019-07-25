package projetoCalculadora;

public class AritimeticaTabuada{
	
	public AritimeticaTabuada() {

	}
// Metodo soma
	public String soma(int op) {
		int i;
		String resultado = "";
		for (i = 0; i < 11; i++) {
			resultado = resultado + ("                " + op + "     +     " + i + "     =     " + (op + i) + "\n");
		}
		return resultado;
	}
// Metodo subtração
	public String subtracao(int op) {
		int i;
		int num = op;
		String resultado = "";
		for (i = 0; i < 11; i++) {
			resultado = resultado + ("                " + num + "     -     " + op + "     =     " + (num - op) + "\n");
			num = num + 1;
		}
		return resultado;
	}
// Metodo divisão
	public String divisao(int op) {
		int i;
		int num = op;
		String resultado = "";
		for (i = 1; i < 11; i++) {
			resultado = resultado + ("                " + num + "     /     " + op + "     =     " + (num / op) + "\n");
			num = num + op;
		}
		return resultado;
	}
// Metodo multiplicação
	public String multiplicacao(int op) {
		int i;
		String resultado = "";
		for (i = 0; i < 11; i++) {
			resultado = resultado + ("                " + i + "     *     " + op + "     =     " + (op * i) + "\n");
		}
		return resultado;
	}

}