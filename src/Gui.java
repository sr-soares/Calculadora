import java.util.Scanner;

public class Gui {
    private char[][] desenhoCalculadora;
     private Calculadora calculadora;
  

    public Gui() {
        calculadora = new Calculadora();
        desenhoCalculadora = new char[][]
        {
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#' },
            {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#' },
            {'#', ' ', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', ' ', '#' },
            {'#', ' ', '*', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '*', ' ', '#' },
            {'#', ' ', '*', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '*', ' ', '#' },
            {'#', ' ', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', ' ', '#' },
            {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#' },
            {'#', ' ', 'O', 'p', 'e', 'r', 'a', 'ç', 'ã', 'o', ':', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#' },
            {'#', ' ', '1', '-', 'E', 'n', 't', 'r', 'a', 'r', ' ', 'D', 'a', 'd', 'o', 's', ' ', ' ', '#' },
            {'#', ' ', '2', '-', 'S', 'o', 'm', 'a', 'r', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#' },
            {'#', ' ', '3', '-', 'S', 'u', 'b', 't', 'r', 'a', 'i', 'r', ' ', ' ', ' ', ' ', ' ', ' ', '#' },
            {'#', ' ', '4', '-', 'M', 'u', 'l', 't', 'i', 'p', 'l', 'i', 'c', 'a', 'r', ' ', ' ', ' ', '#' },
            {'#', ' ', '5', '-', 'D', 'i', 'v', 'i', 'd', 'i', 'r', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#' },
            {'#', ' ', '6', '-', 'S', 'a', 'i', 'r', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#' },
            {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#' },
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#' }
        };
    }

    private void desenharCalc(String t1, String t2) {
      limparTela();

      for (int co = 0; co < 12; co++) { desenhoCalculadora[3][co + 3] = ' '; }

       for (int co = 0; co < 12; co++) { desenhoCalculadora[4][co + 3] = ' '; }

      for (int co = 0; co < t1.length(); co++)
      {
        desenhoCalculadora[3][co + 3] = t1.charAt(co);
      }
      for (int co = 0; co < t2.length(); co++) 
      {
        desenhoCalculadora[4][co + 3] = t2.charAt(co);
      }
        
      for(int li=0; li<16; li++)
      {
        for(int co=0; co<19; co++)
        {
          System.out.print(desenhoCalculadora[li][co]);
          if(co==18){ System.out.println(); }
        }
      }
    }

    private void redesenharCalc() {
       desenhoCalculadora = new char[][]
        {
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#' },
            {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#' },
            {'#', ' ', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', ' ', '#' },
            {'#', ' ', '*', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '*', ' ', '#' },
            {'#', ' ', '*', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '*', ' ', '#' },
            {'#', ' ', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', ' ', '#' },
            {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#' },
            {'#', ' ', 'O', 'p', 'e', 'r', 'a', 'ç', 'ã', 'o', ':', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#' },
            {'#', ' ', '1', '-', 'E', 'n', 't', 'r', 'a', 'r', ' ', 'D', 'a', 'd', 'o', 's', ' ', ' ', '#' },
            {'#', ' ', '2', '-', 'S', 'o', 'm', 'a', 'r', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#' },
            {'#', ' ', '3', '-', 'S', 'u', 'b', 't', 'r', 'a', 'i', 'r', ' ', ' ', ' ', ' ', ' ', ' ', '#' },
            {'#', ' ', '4', '-', 'M', 'u', 'l', 't', 'i', 'p', 'l', 'i', 'c', 'a', 'r', ' ', ' ', ' ', '#' },
            {'#', ' ', '5', '-', 'D', 'i', 'v', 'i', 'd', 'i', 'r', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#' },
            {'#', ' ', '6', '-', 'S', 'a', 'i', 'r', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#' },
            {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#' },
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#' }
        };
    }
    private void limparTela() {
      for(int i=0; i<=50; i++){
        System.out.println();
      }
       
    }
  public void execGui() {
    Scanner peruse = new Scanner(System.in);
    int numberEscolhido;
    double number1, number2, resultado;
    String stringNumber1, stringResultado;
    

    desenharCalc("Qual Opção?","");
    
    do{
      numberEscolhido = peruse.nextInt();
    }while(numberEscolhido < 1 || numberEscolhido > 6); 
    

    if(numberEscolhido == 1 || numberEscolhido == 6){ limparTela(); execGui(); }

    desenharCalc("num 1:", "");
    number1 = peruse.nextDouble();
    stringNumber1 = Double.toString(number1);

    desenharCalc(stringNumber1, "num 2:");
    number2 = peruse.nextDouble();

    calculadora.setOperando1(number1);
    calculadora.setOperando2(number2);

    numberEscolhido=numberEscolhido-1;
    calculadora.setOperacao(numberEscolhido);
    calculadora.realizarOperacao();
    
    resultado = calculadora.getResultado();
    stringResultado=Double.toString(resultado);

    System.out.println(resultado);
    System.out.println(numberEscolhido);
    if(resultado == 0.0 && numberEscolhido == 4){
     desenharCalc("Erro! Divisão", "OPRÇ: "+calculadora.getInformacoes());
    
    }else{
      desenharCalc("Result: "+stringResultado, "OPRÇ: "+calculadora.getInformacoes());
    }
   peruse.close();
  }
}
