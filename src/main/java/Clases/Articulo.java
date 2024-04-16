
package Clases;


public class Articulo {
    private String nombre;
    private Integer cantidad;
    private Double valor;

    public Articulo(String nombre, Integer cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getCantidad() {
        return cantidad;
    }

   

    public String getNombre() {
        return nombre;
    }

 

    public Double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Articulo{" + "nombre=" + nombre + ", precio=" + cantidad + ", valor=" + valor + '}';
    }

    
    
    
    
    
    
    
}
