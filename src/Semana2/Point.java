/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana2;

/**
 *
 * @author gabri
 */
public class Point {
 
    private double x;
    private double y;
 
    //1 constructor
    public Point() {
        this(0,0);
        //this.x = 0;
        //this.y = 0;
    }
    
    //2 constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    //3 constructor
    public Point(Point p) {//clonar punto
        this(p.getX(),p.getY());
        //this.x = p.getX();
        //this.y = p.getY();
    }
 
    public double getX() {
        return this.x;
    }
 
    public double getY() {
        return this.y;
    }
 
    public void setX(double x) {
        this.x = x;
    }
 
    public void setY(double y) {
        this.y = y;
    }
    
    public double distance(double x, double y){
        double dist=Math.sqrt(Math.pow(this.x - x,2)+Math.pow(this.y - y,2));
        return dist;
    }
    
    public double distance(Point p){
        double dist=Math.sqrt(Math.pow(this.x - p.getX(),2)+Math.pow(this.y - p.getY(),2));
        return dist;
    }
    
    public Point midPoint(Point p){
        double xx = (this.x + p.getX())/2;
        double yy = (this.y + p.getY())/2;
        Point p3 =new Point(xx,yy);
        return p3;
    }
    
    @Override
    public String toString(){
        return ("x= "+x +"y= "+y);
    }
    
    
}