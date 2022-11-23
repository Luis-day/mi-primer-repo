package pagame.domain;
import java.time.LocalDate;
//@author Luis Najera & Dayana Machuca
public class Deuda {
    private int         id;
    private float       cantidad;    
    private LocalDate   fecha;
    private int         idDeudor;

    public Deuda(int id, float cantidad, LocalDate fecha, int idDeudor) {
        this.id         = id;
        this.cantidad   = cantidad;
        this.fecha      = fecha;
        this.idDeudor   = idDeudor;
    }
    public int getId() {
        return id;
    }
    public float getCantidad() {
        return cantidad;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public int getIdDeudor() {
        return idDeudor;
    }    
}