package pbasedatos;

public class Alumno {

    private String nombre;
    private int nota;
    private String ref;

    public Alumno() {
    }

    public Alumno(String nombre, int nota, String ref) {
        this.nombre=nombre;
        this.nota=nota;
        this.ref=ref;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota=nota;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref=ref;
    }

    @Override
    public String toString() {
        return "Alumno: "+"nombre="+nombre+", nota:  "+nota+", ref: "+ref;
    }

}
