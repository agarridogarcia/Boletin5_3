
package boletin5_3;


public class Negativo {
    //atributos
    private int num1, num2;
    //constructores
    public Negativo (){
        num1=0;
        num2=0;
        
    }
    public Negativo (int n1, int n2){
       num1=n1;
        num2=n2;
        
        
    }
    public void resultado (int n1){
        if (n1<0)
            System.out.println( " é negativo" );
        else if (n1>0)
            System.out.println( " é positivo" );
        else 
            System.out.println("é cero");
         
    }
            
}
