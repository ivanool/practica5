//Tiene el main,

import java.util.Scanner;
public class PruebaVoltajes{

    static int nivel1=20;
    static int nivel2=120; 
    static int nivel3=140;
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in); 

        
        
        while(true){
            System.out.println("Ingrese el voltaje: ");
            int voltaje  = sc.nextInt();
            Dispositivo dis= new Dispositivo(voltaje);
            dis.capturar_voltaje();
            dis.margen_error();
            System.out.println(dis.get_nivel());
            System.out.println(dis.get_margenerror());
            System.out.println(dis.get_voltaje());
        }

    }





}