package calcularcuotasbanco;
import javax.swing.JOptionPane;

public class CalcularCuotasBanco {

    
    public static void main(String[] args) {
        
        String nombreApellido = JOptionPane.showInputDialog("Ingrese su Nombre y Apellido:");
        int dni = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su DNI: "));
        double sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su sueldo mensual:"));
        int prestamo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto solicitado: "));
        int cuotas = 0;
        double montoCuotas;
        boolean otorgado = false;

        while (cuotas == 0);
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingresar la cantidad de cuotas"));

            if (opcion > 0 && opcion <= 12) {
                cuotas = opcion;
            } else {
                JOptionPane.showMessageDialog(null, "Las cuotas deben estar entre 1 y 12 \nVuelva a intertarlo");
            }

       if (prestamo>200000){
            JOptionPane.showMessageDialog(null, "El banco solo puede dar hasta 200000 pesos");
            }
       
        if (200000 < (sueldo * 12)) {

            double montoPrestamo = sueldo * 10;
            if (prestamo <= montoPrestamo) {

                montoCuotas = prestamo / cuotas;
                otorgado = true;

                datosUsuario(nombreApellido, dni, sueldo);
                datosPrestamo(prestamo, montoCuotas, cuotas);
                validaOtorgado(otorgado);
            }

        } else {
            otorgado = false;
            validaOtorgado(otorgado);

        }

        
    }
        public static void datosUsuario(String nombreApellido,int dni,double sueldo){
            System.out.println("=================================\n"
                               +"========== BANCO CFP36 =========\n"
                               +"================================");
            System.out.println("Cliente: " + nombreApellido+ "\nDNI: " + dni + "\nSueldo"+sueldo);
            
             }
        public static void datosPrestamo(double prestamo,double montoCuotas,int cuotas){
            System.out.println("Monto solicitado: "+prestamo+ "\nCuotas a Pagar: "+montoCuotas+ "\nCantidad de Cuotas: "+cuotas);
                   
        }
        
        public static void validaOtorgado(boolean otorgado){
        if (otorgado){
            System.out.println("Prestamo APROBADO");
            System.out.println("=================================");
        }else{
            JOptionPane.showMessageDialog(null,"No se puede otorgar el prestamo\nDEDEGADO");
        }
        
        
        
        
        
        
        
        
        
    }
    
}
