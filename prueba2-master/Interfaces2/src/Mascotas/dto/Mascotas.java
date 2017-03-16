
package Mascotas.dto;

//eeeeeeeeeeeee salgo en la tele

public class Mascotas {
    private String fecha;
    private String nombre;
    private String raza;
    private String provincia;

    public Mascotas(String fecha, String nombre, String raza, String provincia) {
        this.fecha = fecha;
        this.nombre = nombre;
        this.raza = raza;
        this.provincia = provincia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
    public String[] toArrayString(){
        String[] array = new String[4];
        array[0]=nombre;
        array[1]=raza;
        array[2]=fecha;
        array[3]=provincia;
        
        return array;
    }  
}
