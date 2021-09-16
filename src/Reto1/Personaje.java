/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto1;


/**
 *
 * @author gabri
 */
public class Personaje {
    //Atributos
    

    
    public String nombre = "";
    public char sexo;
    public double posicionX;
    public double posicionY;
    public double distanciaTotal;
    public int numeroBotiquines;
    public double vida;
    
    //Constructor
    public Personaje(String nombre, char sexo){
        this.nombre = nombre;      
        this.sexo = sexo;   
        this.posicionX = 0;
        this.posicionY = 0;
        this.distanciaTotal = 0;
        this.numeroBotiquines = 0;
        this.vida = 100;
    }
    
    //SETTER


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPosicionX(double posicionX) {
        this.posicionX = posicionX;
    }

    public void setPosicionY(double posicionY) {
        this.posicionY = posicionY;
    }

    public void setDistanciaTotal(double distanciaTotal) {
        this.distanciaTotal = distanciaTotal;
    }

    public void setNumeroBotiquines(int numeroBotiquines) {
        this.numeroBotiquines = numeroBotiquines;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }
    
    
    //GETTER

    public String getNombre() {
        return nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPosicionX() {
        return posicionX;
    }

    public double getPosicionY() {
        return posicionY;
    }

    public double getDistanciaTotal() {
        return distanciaTotal;
    }

    public int getNumeroBotiquines() {
        return numeroBotiquines;
    }

    public double getVida() {
        return vida;
    }
    
    //Metodos
    
    public void usarBotiquin(){
        if (numeroBotiquines > 0){
            numeroBotiquines--;
            vida=vida+5;
        }
        
    }
    
    public void recogerBotiquin(){
        numeroBotiquines++;
    }
    
    public void moverDerecha(double d){
        posicionX=posicionX+d;
        distanciaTotal=distanciaTotal+d;
    }
    
    public void moverIzquierda(double d){
        posicionX=posicionX-d;
        distanciaTotal=distanciaTotal+d;
    }
    
    public void moverArriba(double d){
        posicionY=posicionY+d;
        distanciaTotal=distanciaTotal+d;       
    }
    
    public void moverAbajo(double d){
        posicionY=posicionY-d;
        distanciaTotal=distanciaTotal+d;
    }
    
    public double calcularDistanciaRespectoOrigen(){
        double dis;
        dis = Math.sqrt(Math.pow(posicionY,2)+Math.pow(posicionX,2));
        return dis;
    }
    
   public Object[] info(){
        Object [] info = new Object[7];
        info[0] = this.nombre;      
        info[0] = this.sexo;   
        info[0] = this.posicionX;
        info[0] = this.posicionY;
        info[0] = this.distanciaTotal;
        info[0] = this.numeroBotiquines;
        info[0] = this.vida;
        
        return info;
              
   }
 
    
    
    
}
