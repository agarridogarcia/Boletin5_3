
package boletin5_3;

import javax.swing.JOptionPane;

public class Boletin5_3 {

    
    public static void main(String[] args) {
       Negativo resultado=new Negativo();
       int n1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
       resultado.resultado(n1);
    }
    
}
