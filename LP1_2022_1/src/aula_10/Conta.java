package aula_10;

public class Conta extends Conta_Abstrata {
    public Conta(String numero, double saldo){
        super(numero, saldo);
    }

    public void debitar(double valor) throws SIException{
        if (saldo > valor){
            saldo -= valor;
        }else{
            SIException e = new SIException(saldo);
            throw e;
        }

    }


}
