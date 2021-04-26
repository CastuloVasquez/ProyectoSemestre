
package ProyectoSemestre;

import java.util.ArrayList;
import java.util.Scanner;

public class Smartphone extends CrearDispositivo{
    private int numeroTelefono;
    private String fotoTomada;
    boolean llamadaEntrante=false;
    
    Scanner entrada=new Scanner(System.in);
    public Smartphone(int numeroTelefono, String correoElectronico, 
            String nombreDispositivo, String visible, String encender, boolean encendido,
            boolean audifono, String estadoAudifono, String nombreAudifono, 
            String solicitarFoto, boolean fotoRecibida, String palabraCopiar, String palabraNoVisible,
            String confirmacion,String fotoTomada, boolean llamadaEntrante, boolean llamadaRecibida,
            String notificacionCorreo, String notificacionFecha, String nombreEvento) {
        super(correoElectronico, nombreDispositivo, visible, encender, encendido, 
                audifono, estadoAudifono, nombreAudifono, solicitarFoto, fotoRecibida, 
                palabraCopiar, palabraNoVisible, confirmacion, llamadaRecibida, 
                notificacionCorreo, notificacionFecha, nombreEvento);
        this.numeroTelefono=numeroTelefono;
        this.fotoTomada=fotoTomada;
        this.llamadaEntrante=llamadaEntrante;
    }

    @Override
    public void dispositivo()
    {
        System.out.println("Correo Electronico: " + getCorreoElectronico()+
                "\nNombre del dispositivo: "+ getNombreDispositivo()+
                "\nVisible para conexion: "+ getVisible()+
                "\nEl dipositivo esta: " +encendido("")+
                "\nNumero de telefono: "+ getNumeroTelefono()+
                "\n"+audifonoConectado(""));
    }

    public String getFotoTomada() {
        return fotoTomada;
    }

    public void setFotoTomada(String fotoTomada) {
        this.fotoTomada = fotoTomada;
    }
    
    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public boolean isLlamadaEntrante() {
        return llamadaEntrante;
    }

    public void setLlamadaEntrante(boolean llamadaEntrante) {
        this.llamadaEntrante = llamadaEntrante;
    }
    /////////////////////////////////////////////////////////////////////////////
    
    public void copiarTextoPhone(ArrayList<Smartphone> listaP){
        String busqueda;
        String escoger;
        System.out.println("\n******* Menu para copiar Texto ******");
        System.out.println("\n///// Dispositivos Disponibles /////");
        for(CrearDispositivo device: listaP){
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
    
    public void tomarFotoPhone(ArrayList<Smartphone> listaP){
        String busqueda;
        String escoger;
        int numero;
        boolean arrayList=listaP.isEmpty();
        for(Smartphone deviceP: listaP){
                if(deviceP.getVisible().equalsIgnoreCase("si")){ // if para tomar fotos
                    System.out.println("\n****** Menu para tomar Fotografias ******");
                    System.out.println("\n///// Dispositivos Disponibles /////");
                            System.out.println("Nombre: "+deviceP.getNombreDispositivo()+"\nEstado visible: "+
                                    deviceP.getVisible());
                            System.out.println("Escriba el nombre del dispositivo a usar: ");
                            busqueda=entrada.next();
                            if(deviceP.getNombreDispositivo().equalsIgnoreCase(busqueda)){
                                System.out.println("\n***** Tomar Fotografia *****"+"\n1. Camara Frontal"+"\n2. Camara Posterior");
                                numero=entrada.nextInt();
                                switch(numero){
                                    case 1:
                                        setFotoTomada("\nFoto almacenada");
                                        System.out.println("Accion Obtenida: ");
                                        System.out.println("Nombre dispositivo: "+deviceP.getNombreDispositivo()+
                                                "\nFoto: "+getFotoTomada());
                                        break;
                                    case 2:
                                        setFotoTomada("\nFoto almacenada");
                                        System.out.println("Accion Obtenida: ");
                                        System.out.println("Nombre dispositivo: "+deviceP.getNombreDispositivo()+
                                                "\nFoto: "+getFotoTomada());
                                        break;
                                    default:
                                        break;
                                }
                            }
                }else{System.out.println("\n !!! Los dispositivos deben de estar visibles !!!!");}
        }
    }
    
    public void pegarTextoPhone(ArrayList<Smartphone> listaP){
        System.out.println("\n****** Menu para pegar texto ******");
        for(CrearDispositivo deviceC: listaP){
            if(deviceC.getVisible().equalsIgnoreCase("si")){
                System.out.println("\nNombre del Dispositivo: "+deviceC.getNombreDispositivo()+"\nTexto Disponible: "
                        + deviceC.getPalabraCopiar());
            }else{
                System.out.println("\nNombre del Dispositivo: "+deviceC.getNombreDispositivo()+"\nTexto Disponible: "+ deviceC.getPalabraNoVisible());
            }
        }
    }
    
    public String llamadaEntrante(String s){
        if(llamadaEntrante){
            s="!!! Llamada Entrante !!!";
        }
        return s;
    }
    
    
    public void llamadaTelefonocia(ArrayList<Smartphone> listaP, ArrayList<ComputadoraPortatil> c1,
            ArrayList<Smartwatch> w, ArrayList<Tablet> t){
        System.out.println("\n****** Menu para llamadas Telefonicas ******");
        System.out.println("\nIngrese el numero de telefono al que desea llamar: ");
        int numero=entrada.nextInt();
        for(Smartphone p: listaP){
            if(p.getNumeroTelefono()==numero && p.isEncendido()){
                System.out.println("\nSe realizo la llamada");
                System.out.println("Nombre dispositivo: "+p.getNombreDispositivo()+ " - "+ llamadaEntrante(""));
                for(CrearDispositivo c: c1){
                    if(c.getCorreoElectronico().equals(p.getCorreoElectronico())){
                        c.setLlamadaRecibida(true);
                        System.out.println("\nNombre dispositivo: "+c.getNombreDispositivo());
                        System.out.println(c.llamadaRecibida(""));
                    }
                }
                for(CrearDispositivo w1: w){
                    if(w1.getCorreoElectronico().equals(p.getCorreoElectronico())){
                        w1.setLlamadaRecibida(true);
                        System.out.println("\nNombre dispositivo: "+w1.getNombreDispositivo());
                        System.out.println(w1.llamadaRecibida(""));
                    }
                }
                for(CrearDispositivo t1: t){
                    if(t1.getCorreoElectronico().equals(p.getCorreoElectronico())){
                        t1.setLlamadaRecibida(true);
                        System.out.println("\nNombre dispositivo: "+t1.getNombreDispositivo());
                        System.out.println(t1.llamadaRecibida(""));
                    }
                }
            }else{
                System.out.println("\n !!! No existe el numero de telefono en los dispositivos !!!");
            }
        }
    }
    
    
}
