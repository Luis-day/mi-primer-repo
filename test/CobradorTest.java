
import pagame.domain.Deudor;
import pagame.domain.Cobrador;
//@author Luis Najera & Dayana Machuca
public class CobradorTest {
    public static void main(String[] args){
        Cobrador cobrador = new Cobrador(1, "Jun JJ");
        
        Deudor deudor1 = new Deudor(1, "Miguel Perez", "Calle Test 123", -4000.1f);
        Deudor deudor2 = new Deudor(1, "Andres Manuel Lopez Obrador", "Calle Prueba 321");
        
        cobrador.addDeudor(deudor1);
        cobrador.addDeudor(deudor2);

    }  
    public static void printDeudor(Deudor deudor){
        System.out.println("       Deudor id:   "   + deudor.getId());
        System.out.println("   Deudor nombre:   "   + deudor.getNombre());
        System.out.println("Deudor Direccion:   "   + deudor.getDireccion());
        System.out.println(" Deudor cantidad:   "   + deudor.getSaldo());
    }
}