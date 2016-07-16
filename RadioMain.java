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
    public void changeFrequency(String estacion){
        if (estacion.equals ("FM")){
            this.FM = true;
        }else if (estacion.equals ("AM")){
            this.FM = false;
        }else {
            System.out.println("Error de ingreso");
        }
    }

}

