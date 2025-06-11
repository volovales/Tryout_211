import java.util.Scanner;
public class trabajo 
{
 public static void main(String[] args) 
    {
        String[][] dias = 
        {
            //si trabajas 
            {
                "lunes", "martes", "miércoles", "jueves", "viernes"
            }, 
            //no se trabaja
            {
                "sábado", "domingo"
            }                                  
        };
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un día de la semana: ");
        String dia = sc.nextLine().toLowerCase(); 
        boolean esLaboral = false; 
        for (int i = 0; i < dias[0].length; i++) 
        {
            if (dias[0][i].equals(dia)) 
            {
                esLaboral = true;
                break;
            }
        }
        if (esLaboral) 
        {
            System.out.println("El día " + dia + " es laboral: true");
        } else 
        {
            System.out.println("El día " + dia + " no es laboral: false");
        }
        sc.close();
    }
}