package Proyevto_02;

import java.util.EnumSet;

public class Variables 
{
    public static void main(String[] args) 
    {
        int numero1 =10;
        double numero2;
        numero2=3.14;
        float numero3;
        numero3=3.1616161F;
        char caractcer1='A' , Caracter2=66 ;
        boolean opcion=true;
        long numero4;
        numero4 = 9209908979L ;
        byte numero5 = 126;
        short numero6 = 128;

        System.out.println(numero1);
        System.out.println(numero2);
        System.out.println(numero3);
        System.out.println( caractcer1);
        System.out.println(Caracter2);
        System.out.println(opcion);
        System.out.println(numero4);
        System.out.println(numero5);
        System.out.println(numero6);

        String mensaje , mensaje2;
        mensaje="Estoy es un menaje ";
        mensaje2="""
                Este
                es
                un mensaje 
                multilneas
                """;
                System.out.println(mensaje);
                System.out.println(mensaje2);
                System.out.println(mensaje+""+numero1);
                System.out.println(mensaje.toUpperCase());
                String  numero1_string=Integer.toString(numero1);
                System.out.println(mensaje.concat(numero1_string));
    
                //variables generales
                var variable1 = 15L;
                var variable2 = 'F';
                var variable3 = 1.2939348F;


                //variales finales 

                final var PI = 3.14159;

                System.out.println(variable1);
                System.out.println(variable2);
                System.out.println(variable3);
                System.out.println(PI);





    }
}





