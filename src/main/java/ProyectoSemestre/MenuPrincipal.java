
package ProyectoSemestre;
import java.io.IOException;
import java.util.Scanner;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class MenuPrincipal {
    static Scanner entrada = new Scanner(System.in);
    static AdministracionDispositivo array=new AdministracionDispositivo();
    static CrearDispositivo device;
    
    
    
    public static void main(String... args)
    {
        
        int seleccion;
        do
        {
            System.out.println("\n----------- Ecosistma de Dispositivos -----------");
            System.out.println("1. Crear dispositivos"+
                    "\n2. Administrar dispositivos"+
                    "\n3. Acciones con dispositivos"+
                    "\n4. Acciones Internas de dispositivos"+
                    "\n5. Acciones externas de dispositivos"+
                    "\n6. Cargas Masivas"+
                    "\n7. Logs"+
                    "\n8. Salir");
            
            System.out.println("Seleccione la opción ejecutar: ");
            seleccion=entrada.nextInt();
        
            switch(seleccion)
            {
                case 1: crearDispositivo();
                    break;
                case 2: administrarDispositivo();
                    break;
                case 3: accionesExternasDeDispositivos();
                    break;
                case 4: accionesInternasDispositivos();
                    break;
                case 5: accionesExternasDeDispositivos();
                    break;
                case 6: cargasMasivas();
                    break;
                case 7:logs();
                    break;
                case 8: System.exit(0);
                    break;
                default: System.out.println("Seleccion Incorrecta");
                    break;                    
            }
                
        }while(seleccion !=7);
    }
    
    public static void crearDispositivo(){
        int seleccion;
        do
        {
        System.out.println("\n-------- Crear Dispositivo --------");
        System.out.println("1. Computadora portatil");
        System.out.println("2. Tablet");
        System.out.println("3. SmartWatch");
        System.out.println("4. SmartPhone");
        System.out.println("5. Auriculares");
        System.out.println("6. Menu Principal");
        
        System.out.println("Seleccione el tipo de dispositivo a crear: ");
        seleccion=entrada.nextInt();
        
        
        switch(seleccion)
        {
            case 1: crearComputadora();
                break;
            case 2: crearTablet();
                break;
            case 3: crearWatch();
                break;
            case 4: crearPhone();
                break;
            case 5: array.crearAuricular();
                break;
            case 6: MenuPrincipal.main();
                break;
            default: System.out.println("Seleccion Iconrrecta");
                break;
        }
        }while(seleccion!=6);
    } // fin crearDispositivo
    
    public static void administrarDispositivo(){
        int seleccion;
        do{
            System.out.println("\n---------- Administrar Dispositivos ----------");
            System.out.println("1. Computadora portátil"+
                    "\n2. Tablet"+
                    "\n3. SmartWatch"+
                    "\n4. Smartphone"+
                    "\n5. Auriculares"+
                    "\n6. Menu");
            System.out.println("Seleccione un dispositivo a adminstrar: ");
            seleccion=entrada.nextInt();
            
            switch(seleccion){
                case 1: array.editarCompu();
                    break;
                case 2: array.editarTablet();
                    break;
                case 3: array.editarWatch();
                    break;
                case 4: array.editarPhone();
                    break;
                case 5: array.administrarAudifonos();
                    break;
                case 6: MenuPrincipal.main();
                    break;
                default: System.out.println("Seleccion Invalida");
                    break;
            }
        }while(seleccion != 6);
    } // fin administrarDispositivo
    
    public static void crearComputadora(){
        String email;
        String nombre;
        String visible;
        System.out.println("\n***** Creación de nueva Computadora Portatil *****");
        System.out.println("Correo Electronico: ");
        email=entrada.next();
        System.out.println("Nombre del Dispositivo: ");
        nombre=entrada.next();
        System.out.println("Visible para Conexion -- si, no --: ");
        visible=entrada.next();
        
        device= new ComputadoraPortatil(email, nombre, visible, "",true,false
                ,"","","",false,"","","",false,"","","");
        array.addCompu((ComputadoraPortatil) device);
        System.out.println("\n****** Computadoras Creadas ******");
        System.out.println("");
        array.mostrarCompu();
    } // fin crearComputadora
    
    public static void crearPhone(){
    
        String email;
        String nombre;
        String visible;
        int numero;
        System.out.println("\n***** Creación de un Nuevo Telefono *****");
        System.out.println("Correo Electronico: ");
        email=entrada.next();
        System.out.println("Nombre del Dispositivo: ");
        nombre=entrada.next();
        System.out.println("Visible para Conexion -- si, no --: ");
        visible=entrada.next();
        System.out.println("Numero de telefono: ");
        numero=entrada.nextInt();
        
        device = new Smartphone(numero, email, nombre, visible,"",true,false,"",
                "","",false,"","","","",false,false,"","","");
        array.addPhone((Smartphone)device);
        System.out.println("\n******* Smartphon Creados ******");
        System.out.println("");
        array.mostrarPhone();
    } // fin crearPhone
    
    public static void crearWatch(){
        
        String email;
        String nombre;
        String visible;
        int numero;
        System.out.println("\n***** Creación de un Reloj Inteligente *****");
        System.out.println("Correo Electronico: ");
        email=entrada.next();
        System.out.println("Nombre del Dispositivo: ");
        nombre=entrada.next();
        System.out.println("Visible para Conexion -- si, no --: ");
        visible=entrada.next();
        
        device= new Smartwatch(email, nombre, visible, "", true,false,"","","",
                false,"","","",false,"","","");
        array.addWatch((Smartwatch)device);
        System.out.println("\n****** Smartwatchs Creados ******");
        System.out.println("");
        array.mostrarWatch();
    } // fin crearWatch
    
    public static void crearTablet(){
    
        String email;
        String nombre;
        String visible;
        System.out.println("***** Creación de nueva Computadora Portatil *****");
        System.out.println("Correo Electronico: ");
        email=entrada.next();
        System.out.println("Nombre del Dispositivo: ");
        nombre=entrada.next();
        System.out.println("Visible para Conexion -- si, no --: ");
        visible=entrada.next();
        
        device= new Tablet(email, nombre, visible, "", true,false,"","","",
                false,"","","",false,"","","");        
        array.addTablet((Tablet)device);
        System.out.println("\n****** Tablets Creadas ******");
        System.out.println("");
        array.mostrarTablet();
    } // fin crearTablet
    
    public static void accionesInternasDispositivos(){
        array.accionesInternasDispositivo();
    } // fin accionesInternasDispositivos
    
    
    
    public static void accionesExternasDeDispositivos(){
        array.accionesExternasDispositivo();
    }
    
    public static void cargasMasivas(){
        array.cargasMasivas();
    }
    
    public static void logs(){}
    
}
