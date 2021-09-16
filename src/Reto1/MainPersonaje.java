/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto1;

import java.util.Arrays;

/**
 *
 * @author gabri
 */
public class MainPersonaje {
    
    public static void main(String[] args) {
        Personaje p1 = new Personaje("Pancho",'h');
        System.out.println(Arrays.asList(p1.info()));
        System.out.println(p1.nombre+"\nsexo: "+p1.sexo+"\nvida: "+p1.vida+"\nx: "+p1.posicionX+"\ny: "+p1.posicionY+"\nTotal: "+p1.distanciaTotal+"\nN°Botiquin: "+p1.numeroBotiquines);
        p1.moverDerecha(2);
        System.out.println(p1.nombre+"\nsexo: "+p1.sexo+"\nvida: "+p1.vida+"\nx: "+p1.posicionX+"\ny: "+p1.posicionY+"\nTotal: "+p1.distanciaTotal+"\nN°Botiquin: "+p1.numeroBotiquines);
        p1.moverAbajo(5);
        System.out.println(p1.nombre+"\nsexo: "+p1.sexo+"\nvida: "+p1.vida+"\nx: "+p1.posicionX+"\ny: "+p1.posicionY+"\nTotal: "+p1.distanciaTotal+"\nN°Botiquin: "+p1.numeroBotiquines);
        p1.moverIzquierda(1);
        System.out.println(p1.nombre+"\nsexo: "+p1.sexo+"\nvida: "+p1.vida+"\nx: "+p1.posicionX+"\ny: "+p1.posicionY+"\nTotal: "+p1.distanciaTotal+"\nN°Botiquin: "+p1.numeroBotiquines);
        System.out.println(p1.calcularDistanciaRespectoOrigen());
        p1.setVida(p1.getVida()-40);
        System.out.println(p1.nombre+"\nsexo: "+p1.sexo+"\nvida: "+p1.vida+"\nx: "+p1.posicionX+"\ny: "+p1.posicionY+"\nTotal: "+p1.distanciaTotal+"\nN°Botiquin: "+p1.numeroBotiquines);
        p1.recogerBotiquin();
        p1.recogerBotiquin();
        p1.recogerBotiquin();
        System.out.println(p1.nombre+"\nsexo: "+p1.sexo+"\nvida: "+p1.vida+"\nx: "+p1.posicionX+"\ny: "+p1.posicionY+"\nTotal: "+p1.distanciaTotal+"\nN°Botiquin: "+p1.numeroBotiquines);
        p1.usarBotiquin();
        p1.usarBotiquin();
        System.out.println(p1.nombre+"\nsexo: "+p1.sexo+"\nvida: "+p1.vida+"\nx: "+p1.posicionX+"\ny: "+p1.posicionY+"\nTotal: "+p1.distanciaTotal+"\nN°Botiquin: "+p1.numeroBotiquines);
        

        
    } 
}
