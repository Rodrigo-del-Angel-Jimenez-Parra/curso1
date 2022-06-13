//para mas ejemplos buscar en google metodos de la clase math en java
import java.util.Scanner;

public class code6ClassMath 
{
    public static void main(String[] args) 
    {
        Scanner e= new Scanner(System.in);
        //raiz cuadrada deben ser double tanto el numero a sacar raiz como el resultado
        double n=36.67, n1, r;
        int n2;
        n1= Math.sqrt(n);
        /*
        System.out.println(n1);
        n2= (int) Math.sqrt(n);
        /System.out.println(n2);

        //exponentes deben ser double la base la potencia y el resultado
        n=5; n1=2;
        r= Math.pow(n, n1);
        System.out.println(r);
        
        //redondear un numero puede ser con long-double o con int-float
        float n3;
        n=5.5;
        long r1= Math.round(n);
        System.out.println(r1);
        n3=5.4999f;
        int r2= Math.round(n3);
        System.out.println(r2);
        */
        //numero random debe ser double el resultado
        n=0;
        n= Math.random();
        System.out.println(n);
    }

    
}
