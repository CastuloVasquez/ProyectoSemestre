
package ProyectoSemestre;

import java.util.ArrayList;


public class Tablet extends CrearDispositivo {

    public Tablet(String correoElectronico, String nombreDispositivo, 
            String visible, String encender, boolean encendido, boolean audifono, 
            String estadoAudifono, String nombreAudifono, String solicitarFoto, 
            boolean fotoRecibida, String palabraCopiar,String palabraNoVisible,
            String confirmacion, boolean llamadaRecibida, String notificacionCorreo,
            String notificacionFecha, String nombreEvento) {
        super(correoElectronico, nombreDispositivo, visible, encender, encendido, 
                audifono, estadoAudifono, nombreAudifono, solicitarFoto, 
                fotoRecibida, palabraCopiar,palabraNoVisible, confirmacion, 
                llamadaRecibida, notificacionCorreo, notificacionFecha, nombreEvento);
    }
    
    
    public void tomarFotoTablet(ArrayList<Smartphone> listaP, ArrayList<Tablet> listaC){
        String busqueda;
        String escoger;
        int numero;
        boolean arrayList=listaP.isEmpty();
        if(arrayList){ // evalucaion no exite dispositivo
                System.out.println("\n****** Menu para tomar Fotografias ******"+
                        "\n !!! No existen telefonos, es necesario crear uno !!!");
            }else{
                for(Smartphone deviceP: listaP){
                if(deviceP.getVisible().equalsIgnoreCase("si")){ // if para tomar fotos
                    System.out.println("\n****** Menu para tomar Fotografias ******");
                    for(CrearDispositivo deviceC: listaC ){
                        if(deviceC.getCorreoElectronico().equals(deviceP.getCorreoElectronico())&&deviceC.isEncendido()){
                            System.out.println("\n///// Dispositivos Disponibles /////");
                            System.out.println("Nombre: "+deviceC.getNombreDispositivo()+"\nEstado visible: "+
                                    deviceC.getVisible());
                            System.out.println("Escriba el nombre del dispositivo a usar: ");
                            busqueda=entrada.next();
                            if(deviceC.getNombreDispositivo().equalsIgnoreCase(busqueda)){
                                System.out.println("\n***** Tomar Fotografia *****"+"\n1. Camara Frontal"+"\n2. Camara Posterior");
                                numero=entrada.nextInt();
                                switch(numero){
                                    case 1:
                                        deviceC.setFotoRecibida(true);
                                        System.out.println("\nAccion Obtenida: ");
                                        System.out.println("\nNombre dispositivo: "+deviceC.getNombreDispositivo()+
                                                "\nFoto: "+deviceC.fotoRecibida(""));
                                        break;
                                    case 2:
                                        deviceC.setFotoRecibida(true);
                                        System.out.println("\nAccion Obtenida: ");
                                        System.out.println("\nNombre dispositivo: "+deviceC.getNombreDispositivo()+
                                                "\nFoto: "+deviceC.fotoRecibida(""));
                                        break;
                                    default:
                                        break;
                                }
                            }
                        }else{System.out.println("\n!!! Debe de exister al menos 1 una computadora con el mismo correo del telefono !!!");}
                        
                    } // for para tomar fotografias
                }
            }
        }
    }
    
    public void copiarTextoTablet(ArrayList<Tablet> lista){
        String busqueda;
        String escoger;
        System.out.println("\n******* Menu para copiar Texto ******");
        System.out.println("\n///// Dispositivos Disponibles /////");
        for(CrearDispositivo device: lista){
            System.out.println("\n"+device.getNombreDispositivo()+" - Estado Visible: "+device.getVisible());
            System.out.println("\nEscriba el nombre del dispositivo para copiar texto: ");
            busqueda=entrada.next();
            if(device.getNombreDispositivo().equalsIgnoreCase(busqueda) && device.isEncendido()){
                if(device.getVisible().equalsIgnoreCase("si")){
                    System.out.println("\nEscriba el texto a copira: ");
                    escoger=entrada.next();
                    device.setPalabraCopiar(escoger);
                    acciones.setPalabra(escoger);
                    System.out.println("\nPalabra copiada: ");
                    System.out.println(device.getPalabraCopiar());
                }else{
                    System.out.println("\nEscriba el texto a copira: ");
                    escoger=entrada.next();
                    device.setPalabraNoVisible(escoger);
                    acciones.setNoVisible(escoger);
                    System.out.println("\nPalabra copiada: ");
                    System.out.println(device.getPalabraNoVisible());
                }
            }else{
                System.out.println("\n !!! Dispositivo no disponible, intentelo de nuevo");
            }
        }
    }
    
    public void pegarTextoTablet(ArrayList<Tablet> compu){
        System.out.println("\n****** Menu para pegar texto ******");
        for(CrearDispositivo deviceC: compu){
            if(deviceC.getVisible().equalsIgnoreCase("si")){
                System.out.println("\nNombre del Dispositivo: "+deviceC.getNombreDispositivo()+"\nTexto Disponible: "
                        + deviceC.getPalabraCopiar());
            }else{
                System.out.println("\nNombre del Dispositivo: "+deviceC.getNombreDispositivo()+"\nTexto Disponible: "+ deviceC.getPalabraNoVisible());
            }
        }
    }

    
}
