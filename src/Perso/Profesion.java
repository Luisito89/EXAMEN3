
package Perso;


public class Profesion {
    String nombre;
    String titulo;
    public Profesion(){
    
    }
    
    public Profesion(String dedicacion,String titulo, String nombre){
        this.nombre=dedicacion;
        this.titulo=titulo;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Profesion" + "nombre=" + nombre + ", titulo=" + titulo ;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}
