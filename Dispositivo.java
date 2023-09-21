import java.util.Scanner;

class Dispositivo{
    private int voltaje;
    private int nivel;
    private Scanner sc;
    private int voltaje_entrada;
    private int margen_error;

    public Dispositivo(int voltaje_entrada){
        this.voltaje_entrada = voltaje_entrada;
        sc = new Scanner(System.in);
    }

    // validar voltaje

    private int validar_voltaje(){
        if(this.voltaje_entrada >= 15 && this.voltaje_entrada <= 25){
            this.nivel = 1;
            return 1;
        }
        else if(this.voltaje_entrada >= 110 && this.voltaje_entrada <= 130){
            this.nivel = 2;
            return 1;
        }
        else if(this.voltaje_entrada >=230 && this.voltaje_entrada <=250){
            this.nivel =3;
            return 1;
       }
       else{
        return -1;
       }
    }

    //capturar voltaje
    
    public void capturar_voltaje(){
        int valido = validar_voltaje();
        if(valido == 1){
            System.out.println("Voltaje valido");
            this.voltaje  = this.voltaje_entrada;
        }
        else if(valido == -1){
            System.out.println("El voltaje no es valido");
        }
    }

    public void margen_error(){
        if(this.nivel == 1){
            this.margen_error = this.voltaje - 20;
        }
        else if(this.nivel ==2){
            this.margen_error = this.voltaje -120;
        }
        else if(this.nivel == 3){
            this.margen_error =  this.voltaje- 240;
        }
        
    }

    public int get_margenerror(){
        return this.margen_error;
    }

    public int get_nivel(){
        return this.nivel;
    }
    public int get_voltaje(){
        return this.voltaje;
    }
}