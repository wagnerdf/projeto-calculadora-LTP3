package projetoCalculadora;

public class OperacaoAritmetica {
	
	//Metodo soma
	public int soma(int variavel01, int variavel02){
		return variavel01+variavel02;
	}
	
	//Metodo dividir
	public double dividir(double variavel01, double variavel02){
		try{
			return (variavel01/variavel02);
			
		}catch (Exception e){
			
			return 00000;
		}
	}
	
	//Metodo multiplicar	
	public int multiplicar(int variavel01, int variavel02){
		return variavel01*variavel02;
	}
	
	//Metodo subtrair
	public int subtrair(int variavel01, int variavel02){
		return variavel01-variavel02;
	}
	
	
	
	

}
