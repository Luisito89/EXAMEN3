
package Perso;


public class Ingeniero extends Profesion{

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    String trabajo;
    int sueldo;
    public Ingeniero(){
    
    }
    public Ingeniero(String trabajo,int sueldo, String nombre){
        this.nombre = nombre;
        this.trabajo=trabajo;
        this.sueldo=sueldo;  
        System.out.println("El ingeniero se dedica a = "+this.nombre+", "+trabajo+ "y gana aproximadamente "+sueldo+"guaranies");
    }
    
    @Override
    public String toString(){
    return "El ingeniero se dedica a = "+trabajo+ "y gana aproximadamente "+sueldo+"guaranies"; 

    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}

