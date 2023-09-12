import javax.swing.JOptionPane;

public class TesteValor {
    public static void main (String[]args) {
        int n = Integer.parseInt(

            JOptionPane.showInputDialog("digite um intero")
        );

        if (n >= 100) {

            JOptionPane.showMessageDialog(null, n + "maior que 100");
        }

        else{
       
         JOptionPane.showMessageDialog(null, n + "menor que 100");

        }    

    }
}