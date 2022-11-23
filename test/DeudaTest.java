import java.time.LocalDate;
import pagame.domain.Deuda;
//@author Luis Najera & Dayana Machuca
public class DeudaTest {
       public static void main(String[] args){
           Deuda deuda = new Deuda (1, 30000, LocalDate.of(2022, 10, 30), 1);
           
           System.out.println("Deuda id:           "+ deuda.getId());
           System.out.println("Deuda cantidad:     "+ deuda.getCantidad());
           System.out.println("Deuda fecha:        "+ deuda.getFecha());
           System.out.println("Deuda idDeudor:     "+ deuda.getIdDeudor());
       }
}
