import javax.swing.JOptionPane;

public class Boletim2 {
    public static void main(String[]args){

        //ler as duas notas, ultilizando a classe jOptinPane
        double nota1 = Double.parseDouble(
            JOptionPane.showInputDialog("digite a primeira notas")
        );
          double nota2 = Double.parseDouble(
            JOptionPane.showInputDialog("digite a segunda notas")
        );

        // calculo da media 
        double media = (nota1 + nota2) / 2;
        //saida com 3 opcoes 
        if (media >= 6) {
            JOptionPane.showMessageDialog(null, "aprovado com" + media);

        }
        else if(media >= 4) {
            JOptionPane.showMessageDialog(null, "voce tem media" +  "fazer segunda chamada de exame");


        }

        else{
            JOptionPane.showMessageDialog(null,"Reprovado",
            "resultado", JOptionPane.ERROR_MESSAGE);
            

        }
    }
    
}
