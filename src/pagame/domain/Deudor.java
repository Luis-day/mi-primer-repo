package pagame.domain;
//@author Luis Najera & Dayana Machuca
public class Deudor {
    private int             id=0;
    private String          nombre ="";
    private String          direccion = "";
    private float           saldo = 0.0f;

    public Deudor(int id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    } 
    public Deudor(int id, String nombre, String direccion, float saldo) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.saldo = saldo;
    }
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }   
}