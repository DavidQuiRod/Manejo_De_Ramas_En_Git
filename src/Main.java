import java.awt.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        System.out.println(mensajeDeBienvenida("David"));
        System.out.println(operacionSuma(2,5));
        System.out.println(funcionesClass.operacionResta(19,8));
    }
    public static String mensajeDeBienvenida(String nombre){
        return "Hola "+nombre +" bienvenido";
    }

    public static String operacionSuma(int num1, int num2){
        int res= num1+num2;
        return  "El resultado de la sumas es "+ res;
    }
}