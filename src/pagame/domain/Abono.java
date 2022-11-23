/*
PagaMe proyecto desarrollado por TI-701 itess (2019-2023)
Visite el sitio https://www.pagame.com.mx
 */
package pagame.domain;
import java.time.LocalDate;
//@author Luis Najera & Dayana Machuca
public class Abono {
    private int         id;
    private float       cantidad;    
    private LocalDate   fecha;
    private int         idCobrador;
    private int         idDeudor;

    public Abono(int id, float cantidad, LocalDate fecha, int idCobrador, int idDeudor) {
        this.id         = id        ;
        this.cantidad   = cantidad  ;
        this.fecha      = fecha     ;
        this.idCobrador = idCobrador;
        this.idDeudor   = idDeudor  ;
    }
//GETS
    public int getId() {
       return id;
    }
    public float getCantidad() {
        return cantidad;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public int getIdCobrador() {
        return idCobrador;
    }
    public int getIdDeudor() {
        return idDeudor;
    }   
}