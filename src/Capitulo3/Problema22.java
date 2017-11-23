
package Capitulo3;

import java.util.Scanner;

/**
 *
 * @author fabri
 */
public class Problema22 {
    
    public static void main(String[] args)
    {
        float DESC_G=0.15F;
        float DESC_A=0.20F;
        float REC_G=0.10F;
        float REC_A=0.05F;
        
        float mc;//monto compra
        float m;//monto de descuento
        float tp; // total a pagar
        String tc;//tipo cliente
        String fp;// forma de pago
        String r; //recargo
        
        //Leer datos 
        
        Scanner tecla=new Scanner(System.in);
        System.out.println("Ingrese el Monto de Compra:");
        mc=tecla.nextFloat();
        System.out.println("Seleccione el tipo de Cliente (G) o (A): ");
        tc=tecla.next();
        System.out.println("Seleccione forma de pago (Contado [C]) o (Plazos [P])");
        fp=tecla.next();
        
        if (tc.equals("G"))
        {
            if (fp.equals("C"))
            {
             m=mc *DESC_G;
             tp=mc -m;
             r="DESC DEL 15%";
            }
            else
            {
             m=mc *REC_G;
             tp=mc +m;
             r="REC DEL 10%";
            }
        }
        else
        {
          if (fp.equals("C"))
            {
             m=mc *DESC_A;
             tp=mc -m;
             r="DESC DEL 20%";
            }
            else
            {
             m=mc *REC_A;
             tp=mc +m;
             r="REC DEL 5%";
            }   
        }
        //Salida 
        System.out.println("");
        System.out.println(r +": "+m);
        System.out.println("Total a pagar: "+tp);
    }
}
