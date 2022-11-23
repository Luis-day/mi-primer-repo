
import pagame.domain.Deudor;
//@author Luis Najera & Dayana Machuca
public class DeudorTest {
    public static void main(String[] args){
        Deudor deudor1 = new Deudor(1, "Miguel Perez", "Calle Test 123", -4000.1f);
        Deudor deudor2 = new Deudor(1, "Andres Manuel Lopez Obrador", "Calle Prueba 321");   
    printDeudor(deudor1);
    printDeudor(deudor2);
    }   
    public static void printDeudor(Deudor deudor){
        System.out.println("       Deudor id:   "   + deudor.getId());
        System.out.println("   Deudor nombre:   "   + deudor.getNombre());
        System.out.println("Deudor Direccion:   "   + deudor.getDireccion());
        System.out.println(" Deudor cantidad:   "   + deudor.getSaldo());
    }   
}