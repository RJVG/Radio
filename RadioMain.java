/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class RadioMain implements Radio{
    //declaramos atributos.
    private boolean ON;
    private boolean FM;
    private double estacion;
    private double b1;
    private double b2;
    private double b3;
    private double b4;
    private double b5;
    private double b6;
    private double b7;
    private double b8;
    private double b9;
    private double b10;
    private double b11;
    private double b12;
    private int boton_elegido;
    
    public RadioMain() {
        this.ON = false;
        this.FM = true;
        this.b1 = 87.9;
        this.b2 = 87.9;
        this.b3 = 87.9;
        this.b4 = 87.9;
        this.b5 = 87.9;
        this.b6 = 87.9;
        this.b7 = 87.9;
        this.b8 = 87.9;
        this.b9 = 87.9;
        this.b10 = 87.9;
        this.b11 = 87.9;
        this.b12 = 87.9;
        this.estacion = 87.9;
        this.boton_elegido = 0;
    }
    //iniciar el radio (encendido y/o apagado)
    public void ON(){
        this.ON = true;
    }
    //saber el estado de la radio (encedido y/o apagado)
    public boolean isON(){
        boolean on = this.ON;
        return on;
    }
    //frecuencia en la que se encuentra el radio.
    public String getFrequency(){
        String fm = "FM";
        String am = "AM";
        if (FM){
            return fm;
        }else{
            return am;
        }
    }
    public void changeFrequency(String fre){
        if (fre.equals ("FM")){
            this.FM = true;
        }else if (fre.equals ("AM")){
            this.FM = false;
        }else {
            System.out.println("Error de ingreso");
        }
    }
    public String getStation(){
        String station = Double.toString(estacion);
        return station;
    }
    public void setStation(){
        switch(this.boton_elegido){
            case 1:
                this.b1 = estacion;
            case 2:
                this.b2 = estacion;
            case 3:
                this.b3 = estacion;
            case 4:
                this.b4 = estacion;
            case 5:
                this.b5 = estacion;
            case 6:
                this.b6 = estacion;
            case 7:
                this.b7 = estacion;
            case 8: 
                this.b8 = estacion;
            case 9:
                this.b9 = estacion;
            case 10:
                this.b10 = estacion;
            case 11:
                this.b11 = estacion;
            case 12:
                this.b12 = estacion;
        }
    }
    public void Forward(){
        if (FM){
            if(this.estacion < 107.9){
                this.estacion = this.estacion + 0.2;
            } else if (this.estacion == 107.9){
                this.estacion = 87.9;
            }
        }else {
            if (this.estacion < 1610){
                this.estacion = this.estacion + 10;
            }else if(this.estacion == 1610){
                this.estacion = 530;
            }
        }
    }
    public void Backward(){
        if (FM){
            if (this.estacion > 87.9){
                this.estacion = this.estacion - 0.2;
            }else if (this.estacion == 87.9){
                this.estacion = 107.9;
            }
        }else{
            if (this.estacion > 530){
                this.estacion = this.estacion -10;
            }else if (this.estacion == 530){
                this.estacion = 1610;
            }
        }
    }
    public void setMemory(String station, int position, String fre){
        throw new UnsupportedOperationException ("Not supported yet.");        
    }
}

