package aula_05;

public class RepositorioContasArray {
	private Conta [] contasBD;
	private int indice;
	private final static int tamCache = 5;
	
	public RepositorioContasArray(){
		indice = 0;
		contasBD = new Conta[tamCache];
	}
	
	public void inserir(Conta c){
		contasBD[indice] = c;
		indice++;
	}
	
	public void imprimir(){
		for(int i=0; i<indice; i++){
			System.out.println("----------");
			contasBD[i].relatorio();
		}
	}
	
	public void remover(String numero){
		for(int i = 0; i < indice; i++){
			if(contasBD[i].getNumero() == numero){
//			if(contasBD[i].getNumero().equals(numero)){
				contasBD[i] = contasBD[indice-1];
				contasBD[indice-1] = null;
				indice--;
			}
		}
		
	}
	
	
	
}
