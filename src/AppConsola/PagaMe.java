/*
 * 
 * 
 */
package AppConsola;

import pagame.domain.*;
import java.util.Scanner;


 //@author Luis Najera & Dayana Machuca
public class PagaMe {
    //Datos Clase
    Deudor [] deudor = new Deudor [100];
    int numDeudor = 0;
    
    public static void main (String [] args) {
        PagaMe pagame = new PagaMe();
        
        int opcion = pagame.menuPrincipal();       
        switch(opcion){
            case 1:
                pagame.crearDeudor();
                break;
            case 2:
                pagame.mostrarDeudores();
                break;
            case 0: 
                return;
        }
    }
    
    public PagaMe(){
        init();
    }
    
    public int menuPrincipal(){
        System.out.println("-------------------------PagaMe-------------------------");    
        System.out.println("1. Crear deudor.");
        System.out.println("2. Ver deudores.");
        System.out.println("0. Salir");
        
        System.out.println();
        System.out.println("Introduzca opcion: ");
        
        Scanner sc = new Scanner (System.in);
        String opcion= sc.nextLine();
        
        //System.out.println("Tu opcion es: " + opcion);
        
        return Integer.parseInt(opcion);
    }
    
    public void crearDeudor(){
        System.out.println("---------------------PagaMe: Crear deudor---------------------");
    }
    
    public void mostrarDeudores(){
        System.out.println("---------------------PagaMe: Mostrar deudores--------------------");
        for(int i = 0; i < numDeudor; i++){
            System.out.println("       Deudor id:   "   + deudor[i].getId());
            System.out.println("   Deudor nombre:   "   + deudor[i].getNombre());
            System.out.println("Deudor Direccion:   "   + deudor[i].getDireccion());
            System.out.println(" Deudor cantidad:   "   + deudor[i].getSaldo());
            System.out.println();
        }
    }
    
    public void init(){ //Inicializacion
       deudor [numDeudor] = new Deudor(1, "Miguel Perez", "Calle Test 123", -4000.1f);
       numDeudor++;
       deudor [numDeudor++] = new Deudor(1, "Andres Manuel Lopez Obrador", "Calle Prueba 321");
    }
}
