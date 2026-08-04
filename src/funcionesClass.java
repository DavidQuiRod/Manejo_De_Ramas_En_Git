public class funcionesClass{
  //Ejemplo de clase

    /**
     * 31/07/2026
     * Nombre: operacionResta
     * @autor: David Quiroz 
     * 
     */
    public static String operacionResta(int num1, int num2){

        return "El resultado de la resta es: "+ (num1-num2);
    }

    public static String operacionMultiplicacion(int num1, int num2){
        return "Resultado";
    }

    public static  String operacionDivision(int num1, int num2){
        return "Hola";
    }
    public static String ejemplo2(String Rutas){
        return "hola";
    }
    /**
     * 04/08/2026
     * Nombre: elNumeroEsParOImpar
     * @autor: David Quiroz 
     * 
     */
    public static void elNumeroEsParOImpar(int numeroIngresado){
        if(numeroIngresado % 2==0){
            System.out.println("El numero "+ numeroIngresado+" es par");
        } else {
            System.out.println("El numero "+numeroIngresado+" es impar");
        }
    }
}
