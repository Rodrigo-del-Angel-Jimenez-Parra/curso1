import javax.lang.model.element.VariableElement;
import javax.swing.JOptionPane;

public class Problems2Conditionals 
{
    public static void main(String[] args) 
    {
        float a,b,c=0,d, r;
        /* El programa te dice si el numero entero que ingresaste es multiplo de 10 o no */
        /* 
        int a;
        String r;
        a= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero entero: "));
        r= (a%10== 0) ? "El numero es multiplo de 10" : "El numero no es multiplo de 10";
        JOptionPane.showMessageDialog(null, r);
        */

        /* 
        String r1;
        a= Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el primer numero: "));
        b= Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el segundo numero: "));
        r1= (a>b) ? "El primer numero es el mayor" : "El segundo numero es el mayor";
        if (a==b)
        {
            JOptionPane.showMessageDialog(null, "Los numeros son iguales");
        }
        else
        {
            JOptionPane.showMessageDialog(null, r1);
        }
        */

        /*Este programa te dice si una letra es mayuscula o minuscula 
        char l;
        String r1;
        l= JOptionPane.showInputDialog(null, "Ingresa una letra").charAt(0);
        r1= (Character.isUpperCase(l)) ? "La letra es mayuscula" : "La letra es minuscula";
        JOptionPane.showMessageDialog(null, r1);
        */

        /*Este programa aplica un descuento del 20% al precio si la cantidad a pagar es mayor a 300 
        String r1;
        a=Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el monto a pagar: "));
        b= a*.20f;
        r= (a>300) ? a-b : a;
        r1= (a>300) ? "Se aplico el descuento el precio a pagar es: " : "No se aplico el descuento el precio a pagar es: ";
        JOptionPane.showMessageDialog(null, r1 +r);
        */

        /*Este programa calcula un salario semanal deacuerdo a las horas trabajadas las primeras 40 se les
        paga 16 si son mas de 40 a las extra se les paga 20
         
        a= Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el numero de horas que trabajo esta semana: "));
        if (a<=40)
        {
            r=a*16;
        }
        else
        {
            r= (40*16)+ ((a-40)*20);
        }
        JOptionPane.showMessageDialog(null, "Su salario de esta semana es: "+r);
        */

        /*Este programa te dice si 2 numeros son par o impar si no te dice que hay uno par y uno impar 
        String r1;
        a= Float.parseFloat(JOptionPane.showInputDialog(null, "Ingresa el primer numero: "));
        b= Float.parseFloat(JOptionPane.showInputDialog(null, "Ingresa el segundo numero: "));
        if (a%2==0 && b%2==0) 
        {
            JOptionPane.showMessageDialog(null, "Los numeros son pares");
        } 
        else if(a%2!=0 && b%2!=0)
        {
            JOptionPane.showMessageDialog(null, "Los numeros son impares");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Un numero es par y el otro impar");
        }
        */

        /*Este programa te ordena 3 numeros de mayor a menor 
        a= Float.parseFloat(JOptionPane.showInputDialog(null, "Ingresa el primer numero: "));
        b= Float.parseFloat(JOptionPane.showInputDialog(null, "Ingresa el segundo numero: "));
        d= Float.parseFloat(JOptionPane.showInputDialog(null, "Ingresa el tercer numero: "));
        if (a>b && a>d) 
        {
            if (b>d) 
            {
                JOptionPane.showMessageDialog(null, "Los numeros ordenados de mayor a menor son: " +a+ " " +b+ " " +d);
            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "Los numeros ordenados de mayor a menor son: " +a+ " " +d+ " " +b);
            }
            
        } 
        else if(b>a && b>d)
        {
            if (a>d) 
            {
                JOptionPane.showMessageDialog(null, "Los numeros ordenados de mayor a menor son: " +b+ " " +a+ " " +d);
            }
            else 
            {
                JOptionPane.showMessageDialog(null, "Los numeros ordenados de mayor a menor son: " +b+ " " +d+ " " +a);
            }
        }
        else
        {
            if (a>b) 
            {
                JOptionPane.showMessageDialog(null, "Los numeros ordenados de mayor a menor son: " +d+ " " +a+ " " +b);
            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "Los numeros ordenados de mayor a menor son: " +d+ " " +b+ " " +a);
            }
        }
        */
        /*Este programa te dice cuantas cifras tiene un numero entre 0 y 99 999 
        a= Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese un numero: "));

        if (a<10) 
        {
            JOptionPane.showMessageDialog(null, "El numero tiene una cifra");   
        } 
        else if (a<100)
        {
            JOptionPane.showMessageDialog(null, "El numero tiene dos cifras");
        }
        else if (a<1000)
        {
            JOptionPane.showMessageDialog(null, "El numero tiene tres cifras");
        }
        else if (a<10000)
        {
            JOptionPane.showMessageDialog(null, "El numero tiene cuatro cifras");
        }
        else if (a<100000)
        {
            JOptionPane.showMessageDialog(null, "El numero tiene cinco cifras");
        }
        */
        
        /*Este programa te pide una fecha y te dice si el año es bifiesto y si la fecha es correcta 
        float a, a2, a3, a4, b, d;
        a= Float.parseFloat(JOptionPane.showInputDialog(null, "Digita el año: "));
        a2=a%4;
        a3=a%100;
        a4=a%400;
        if (a>0) 
        {
            JOptionPane.showMessageDialog(null, "El año: " +a+ " Es correcto");
            JOptionPane.showMessageDialog(null, "a2= " +a2);
            JOptionPane.showMessageDialog(null, "a3= " +a3);
            JOptionPane.showMessageDialog(null, "a4= " +a4);
            if (a2==0) 
            {
                if (a3==0 && a4!=0) 
                {
                    JOptionPane.showMessageDialog(null, "El año no es bifiesto");
                    b= Float.parseFloat(JOptionPane.showInputDialog(null, "Digita el mes: "));
                    if (b==2) 
                    {
                        d= Float.parseFloat(JOptionPane.showInputDialog(null, "Digita el dia: "));
                        if (d>0 && d<=28) 
                        {
                            JOptionPane.showMessageDialog(null, "La fecha es correcta y el año no es bifiesto");
                        } 
                        else 
                        {
                            JOptionPane.showMessageDialog(null, "Error el año no es bifiesto digita un numero entre este rango 1-28");
                        }
                    } 
                    else if(b==1 || b==3 || b==5 || b==7 || b==8 || b==10 || b==12)
                    {
                        d= Float.parseFloat(JOptionPane.showInputDialog(null, "Digita el dia: "));
                        if (d>0 && d<=31)
                        {
                            JOptionPane.showMessageDialog(null, "La fecha es correcta y el año no es bifiesto");
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Error este mes tiene de 1-31 dias digita un numero entre ese rango");
                        }
                    }
                    else
                    {
                        d= Float.parseFloat(JOptionPane.showInputDialog(null, "Digita el dia: "));
                        if (d>0 && d<=30)
                        {
                            JOptionPane.showMessageDialog(null, "La fecha es correcta y el año no es bifiesto");

                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Error este mes tiene de 1-30 dias digita un numero entre ese rango");
                        }
                    }
                }
                else if(a3==0 && a4==0)
                {
                    JOptionPane.showMessageDialog(null, "El año es bifiesto");
                    b= Float.parseFloat(JOptionPane.showInputDialog(null, "Digita el mes: "));
                    if (b>0 && b<=12) 
                    {
                        if (b==2) 
                        {
                            d= Float.parseFloat(JOptionPane.showInputDialog(null, "Digita el dia: "));
                            if (d>0 && d<=29) 
                            {
                                JOptionPane.showMessageDialog(null, "La fecha es correcta y el año es bifiesto");
                            } 
                            else 
                            {
                                JOptionPane.showMessageDialog(null, "Error el año es bifiesto digita un numero entre este rango 1-29");
                            }
                        } 
                        else if(b==1 || b==3 || b==5 || b==7 || b==8 || b==10 || b==12)
                        {
                            d= Float.parseFloat(JOptionPane.showInputDialog(null, "Digita el dia: "));
                            if (d>0 && d<=31)
                            {
                                JOptionPane.showMessageDialog(null, "La fecha es correcta y el año es bifiesto");
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null, "Error este mes tiene de 0-31 dias digita un numero entre ese rango");
                            }
                        }
                        else
                        {
                            d= Float.parseFloat(JOptionPane.showInputDialog(null, "Digita el dia: "));
                            if (d>0 && d<=30)
                            {
                                JOptionPane.showMessageDialog(null, "La fecha es correcta y el año es bifiesto");
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null, "Error este mes tiene de 0-30 dias digita un numero entre ese rango");
                            }
                        }
                    }
                    else 
                    {
                        JOptionPane.showMessageDialog(null, "Error  digita un numero entre 1-12");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "El año es bifiesto puro");
                }
                JOptionPane.showMessageDialog(null, "El año es bifiesto");
                b= Float.parseFloat(JOptionPane.showInputDialog(null, "Digita el mes: "));
                if (b>0 && b<=12) 
                {
                    if (b==2) 
                    {
                        d= Float.parseFloat(JOptionPane.showInputDialog(null, "Digita el dia: "));
                        if (d>0 && d<=29) 
                        {
                            JOptionPane.showMessageDialog(null, "La fecha es correcta y el año es bifiesto");
                        } 
                        else 
                        {
                            JOptionPane.showMessageDialog(null, "Error el año es bifiesto digita un numero entre este rango 1-29");
                        }
                    } 
                    else if(b==1 || b==3 || b==5 || b==7 || b==8 || b==10 || b==12)
                    {
                        d= Float.parseFloat(JOptionPane.showInputDialog(null, "Digita el dia: "));
                        if (d>0 && d<=31)
                        {
                            JOptionPane.showMessageDialog(null, "La fecha es correcta y el año es bifiesto");
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Error este mes tiene de 1-31 dias digita un numero entre ese rango");
                        }
                    }
                    else
                    {
                        d= Float.parseFloat(JOptionPane.showInputDialog(null, "Digita el dia: "));
                        if (d>0 && d<=30)
                        {
                            JOptionPane.showMessageDialog(null, "La fecha es correcta y el año es bifiesto");

                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Error este mes tiene de 1-30 dias digita un numero entre ese rango");
                        }
                    }
                }
                else 
                {
                    JOptionPane.showMessageDialog(null, "Error  digita un numero entre 1-12");
                }
            }
            else 
            {
                JOptionPane.showMessageDialog(null, "El año no es bifiesto");
                b= Float.parseFloat(JOptionPane.showInputDialog(null, "Digita el mes: "));
                if (b==2) 
                    {
                        d= Float.parseFloat(JOptionPane.showInputDialog(null, "Digita el dia: "));
                        if (d>0 && d<=28) 
                        {
                            JOptionPane.showMessageDialog(null, "La fecha es correcta y el año no es bifiesto");
                        } 
                        else 
                        {
                            JOptionPane.showMessageDialog(null, "Error el año no es bifiesto digita un numero entre este rango 1-28");
                        }
                    } 
                else if(b==1 || b==3 || b==5 || b==7 || b==8 || b==10 || b==12)
                {
                    d= Float.parseFloat(JOptionPane.showInputDialog(null, "Digita el dia: "));
                    if (d>0 && d<=31)
                    {
                        JOptionPane.showMessageDialog(null, "La fecha es correcta y el año no es bifiesto");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Error este mes tiene de 1-31 dias digita un numero entre ese rango");
                    }
                    }
                else
                {
                    d= Float.parseFloat(JOptionPane.showInputDialog(null, "Digita el dia: "));
                    if (d>0 && d<=30)
                    {
                        JOptionPane.showMessageDialog(null, "La fecha es correcta y el año no es bifiesto");

                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Error este mes tiene de 1-30 dias digita un numero entre ese rango");
                    }
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Error ingrese un año mayor a 0");
        }
        */
        /* Este programa hace las operaciones artimeticas basicas de 2 numeros 
        String o;
        float s, m;
        a= Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer numero: "));
        b= Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
        s= a+b;
        r= a-b;
        m= a*b;
        d= a/b;
        o= JOptionPane.showInputDialog("Ingrese el nombre de la operacion a realizar");
        switch (o) 
        {
            //char o; JOptionPane.showInputDialog("Ingrese la operacion a realizar:").charAt(0); Case 's':
            case "Suma":
            case "suma":
            JOptionPane.showMessageDialog(null, "La suma de los 2 numeros es: " +s);
            break;
            case "resta":
            case "Resta":
            JOptionPane.showMessageDialog(null, "La resta de los 2 numeros es: " +r);
            break;
            case "Multiplicacion":
            case "Multiplicación":
            case"multiplicacion":
            case"multiplicación":
            JOptionPane.showMessageDialog(null, "La multiplicación de los 2 numeros es: " +m);
            break;
            case"División":
            case"Division":
            case"division":
            case"división":
            JOptionPane.showMessageDialog(null, "La división de los 2 numeros es: " +d);
            default:
            JOptionPane.showMessageDialog(null, "Intente denuevo, escriba una de las siguientes opciones: Suma, Resta, Multiplicación ó Division");
            break;
        }
        */
        /* Este programa evalua una nota del 0-10
        String o;
        o= JOptionPane.showInputDialog("Ingrese la nota a evaluar: ");
        switch (o) 
        {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            JOptionPane.showMessageDialog(null, "Su nota es insuficiente");
                break;
            case "7":
            JOptionPane.showMessageDialog(null, "Su nota es suficiente");
                break;
            case "8":
            JOptionPane.showMessageDialog(null, "Su nota esta bien");
                break;
            case "9":
            JOptionPane.showMessageDialog(null, "Su nota es notable");
                break;
            case "10":
            JOptionPane.showMessageDialog(null, "Su nota es sobresaliente");
                break;
            default:
            JOptionPane.showMessageDialog(null,"Ingrese un numero del: 0-10");
                break;
        }
         */
        /* Este programa hace la funcion de ingreso y retiro de un cajero 
        String o;
        o= JOptionPane.showInputDialog("Cuenta con un saldo de: $1000\n" +
        "1.- Ingresar dinero a la cuenta\n" + "2.- Retirar dinero de la cuaneta\n" + "3.- Salir");
        switch (o) 
        {
            case "1":
                a= Float.parseFloat(JOptionPane.showInputDialog("Ingrese la catidad a depositar: "));
                r= 1000+ a;
                JOptionPane.showMessageDialog(null, "Ahora su saldo es de: " +r);
            break;
            case "2":
                a= Float.parseFloat(JOptionPane.showInputDialog("Ingrese la catidad que desea retirar: "));
                r= 1000- a;
                JOptionPane.showMessageDialog(null, "Ahora su saldo es de: " +r);
            break;
            case "3":
            break;
            default:
                JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
            break;
        }
        */

        /*Este programa convierte gr en oz y lb
        double a1, r1;
        String o;
        a1= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero de gramos a convertir: "));
        o= JOptionPane.showInputDialog("Escoja a que unidad quiere convertir los " + a1 + "gr:\n" +
        "1.- lb\n" + "2.- oz");
        
        switch (o) {
            case "1":
                r1= a1*0.035273;
                JOptionPane.showMessageDialog(null, "Los " + a1 + "gr equivalen a " + r1 +"oz");
            break;
            case "2":
                r1= a1*0.002204;
                JOptionPane.showMessageDialog(null, "Los " + a1 + "gr equivalen a " + r1 +"lb");
            break;
            default:
                JOptionPane.showMessageDialog(null, "Ingrese oz ó lb para realizar la conversión");
            break;
        }
        */
        
    }
}