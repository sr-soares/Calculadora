import java.util.Scanner;
public class Teste{
    public static void main(String[] args) throws Exception {
        Scanner peruse = new Scanner(System.in);
        int valueDigitado, opercacao;
        double number2, number1;

        do{
            System.out.println("\nComo você deseja testar a calculadora?\nClasse Gui - 1 \nClasse Calculadora - 2" );
            valueDigitado = peruse.nextInt();
        }while(valueDigitado != 1 && valueDigitado !=2);
        if(valueDigitado == 1){
            Gui g1 = new Gui();
            g1.execGui();
        }
        else if(valueDigitado == 2){
            Calculadora c1 = new Calculadora();
            System.out.println("Digite o 1° número: ");
            number1 = peruse.nextDouble();
            c1.setOperando1(number1);
            System.out.println("Digite o 2° número: ");
            number2 = peruse.nextDouble();
            c1.setOperando2(number2);

            System.out.println("\nQual operação deseja?\n1-Somar\n2-Subtrair\n3-Multiplicar\n4-Divisão");
            opercacao = peruse.nextInt();
            c1.setOperacao(opercacao);
            c1.realizarOperacao();

            System.out.println("\nResultado: "+c1.getResultado() +"\nOperação: "+c1.getInformacoes());
            peruse.close();
        }
       

        
               
        
    }
}