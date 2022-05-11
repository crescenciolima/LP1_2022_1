package aula_08;

public class ContaImposto extends ContaAbstrata {

    public ContaImposto(String numero, double saldo){
        super(numero, saldo);
    }

    public void debitar(double valor){
        if(saldo >= valor){
            saldo -= (valor + ((saldo+valor) * 0.01));
        } else {
            System.out.println("Saldo Insuficiente");
        }
        
    }

    
}
