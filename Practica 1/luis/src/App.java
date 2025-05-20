public class App 
{
    private Marca_patito;
    private capacidad_cincokilos;
    private  color_verde;
    private  resistencia_dur;
    private  bolsas_3; 
    private  sierre_2;
    //Atrivutos del objeto
    public void asignarNombre(String guardar_objetos);
    {
        if (guardar_objetos.length( ) == 0)
        {
            System.out.println("Error: Cadena vacia");
            return;
        }
        nombre = guardar_objetos;
    }
    public void asignarNombre(String Trasportar_objeto);
    {
        if (Trasportar_objeto.length( ) == 0)
        {
            System.out.println("Error: Cadena vacia");
            return;
        }
        nombre = Trasportar_objeto;
    }
     public void asignarNombre(String cerrar_bolsas);
    {
        if (cerrar_bolsas.length( ) == 0)
        {
            System.out.println("Error: Cadena vacia");
            return;
        }
        nombre = cerrar_bolsas;
    }
    public void asignarNombre(String bajar_sierre);
    {
        if (bajar_sierre.length( ) == 0)
        {
            System.out.println("Error: Cadena vacia");
            return;
        }
        nombre = bajar_sierre;
    }
    public void asignarNombre(String subir_sierre);
    {
        if (subir_sierre.length( ) == 0)
        {
            System.out.println("Error: Cadena vacia");
            return;
        }
        nombre = subir_sierre;
    }
    public void asignarNombre(String sacar_objeto);
    {
        if (sacar_objeto.length( ) == 0)
        {
            System.out.println("Error: Cadena vacia");
            return;
        }
        nombre = sacar_objeto;
    }
    public static void main(String[]args)
    {
        App = new App01[];
        App01 = asignarMarca("_patito");
        App01 = asignarcapacidad("_cincokilos");
        App01 = asignarcolor("_Verde");
        App01 = asignarresistencia("_dura");
        App01 = asignarbolsas("_3");
        App01 = asignarsierre("_2");
        System.out.println(App01.obtenerMarca());
        System.out.println(App01.obtenercapacidad());
        System.out.println(App01.obtenercolor());
        System.out.println(App01.obtenerresistencia());
        System.out.println(App01.obtenerbolsas());
        System.out.println(App01.obtenersierre());
    }
}

