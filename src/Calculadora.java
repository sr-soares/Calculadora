public class Calculadora {

    private double operando1, operando2, resultado;
    private int operacao; 
    private String informacoes;

    private void somar()
    {
        resultado=(operando1)+(operando2);
        setInformacoes( "Feita"); 
    }
    private void subtrair()
    {
        resultado=(operando1)-(operando2);
        setInformacoes( "Feita");
    }

    private void multiplicar()
    {
        resultado=(operando1)*(operando2);
        setInformacoes( "Feita");
    }

    private void dividir()
    {
        try{
            if(operando1/operando2 < Double.MAX_VALUE){
                resultado=(operando1)/(operando2);
                setInformacoes( "Feita");
            }else{
                setInformacoes(this.operando1+"/0");
                resultado=0;
            }
        }catch(Exception e)
        {
            resultado=0;
        }
    }
    public void realizarOperacao()
    {
        switch (operacao) {
            case 1: somar(); break;
           
            case 2: subtrair(); break;

            case 3: multiplicar(); break;
                
            case 4: dividir(); break;
            
            default: System.out.println("operação inexistente!");   
        }
    }

    public void setInformacoes( String info){this.informacoes=info;}
    public String getInformacoes( ){return this.informacoes;}

    public void setOperando1(double operando){this.operando1 = operando;}
    public double getOperando1( ){return this.operando1;}

    public void setOperando2(double operando){this.operando2 = operando;}
    public double getOperando2(){return this.operando2;}

    public void setOperacao(int operacao){this.operacao = operacao;}
    public int getOperacao(){return this.operacao;}

    public double getResultado() {return resultado;}
}