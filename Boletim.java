import java.util.Scanner;
public class Boletim {
    public static void main (String[]args){
        //ler 2 notas do usoario, vamos usar classe Scanner
        //declara o objeto Scanner e instacinia 
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite a primera nota: ");
        double  nota1 = scanner.nextDouble();

        System.out.println("digite a segunda nota: ");
        double  nota2 = scanner.nextDouble();

        //processamento: calculo da media
        double media = (nota1 + nota2) / 2;

        //saida:dependene da media 
        if (media >=6.0){
            System.out.println("aprovado com" + media);
        }

        else{
            System.out.println("reprovado com" + media);
        }


        scanner.close (); //liberação de memoria
        
    }
}
