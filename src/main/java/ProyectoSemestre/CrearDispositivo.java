
package ProyectoSemestre;

import java.util.ArrayList;
import java.util.Scanner;

public class CrearDispositivo {
    
    private String correoElectronico;
    private String nombreDispositivo;
    private String  visible;
    private String encender;
    boolean encendido=true;
    boolean audifono=false;
    private String estadoAudifono;
    private String nombreAudifono;
    private String solicitarFoto;
    boolean fotoRecibida=false;
    private String palabraCopiar;
    private String palabraNoVisible;
    private String confirmacion;
    boolean llamadaRecibida=false;
    private String notificacionCorreo;
    private String notificacionFecha;
    private String nombreEvento;
    
    Scanner entrada=new Scanner(System.in);
    AccionesDispositivos acciones=new AccionesDispositivos("","","","","","","","","","");
    

    public CrearDispositivo(String correoElectronico, String nombreDispositivo, 
            String visible, String encender, boolean encendido, boolean audifono, 
            String estadoAudifono, String nombreAudifono, String solicitarFoto, 
            boolean fotoRecibida, String palabraCopiar, String palabraNoVisible, 
            String confirmacion, boolean llamadaRecibida, String notificacionCorreo,
            String notificacionFecha, String nombreEvento) {
        this.correoElectronico = correoElectronico;
        this.nombreDispositivo = nombreDispositivo;
        this.encender=encender;
        this.visible = visible;
        this.encendido=encendido;
        this.audifono=audifono;
        this.estadoAudifono=estadoAudifono;
        this.nombreAudifono=nombreAudifono;
        this.solicitarFoto=solicitarFoto;
        this.fotoRecibida=fotoRecibida;
        this.palabraCopiar=palabraCopiar;
        this.palabraNoVisible=palabraNoVisible;
        this.confirmacion=confirmacion;
        this.llamadaRecibida=llamadaRecibida;
        this.notificacionCorreo=notificacionCorreo;
        this.notificacionFecha=notificacionFecha;
        this.nombreEvento=nombreEvento;
    }

    public String getNotificacionCorreo() {
        return notificacionCorreo;
    }

    public void setNotificacionCorreo(String notificacionCorreo) {
        this.notificacionCorreo = notificacionCorreo;
    }

    public String getNotificacionFecha() {
        return notificacionFecha;
    }

    public void setNotificacionFecha(String notificacionFecha) {
        this.notificacionFecha = notificacionFecha;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }
    
    public boolean isLlamadaRecibida() {
        return llamadaRecibida;
    }

    public void setLlamadaRecibida(boolean llamadaRecibida) {
        this.llamadaRecibida = llamadaRecibida;
    }
    
    public String getConfirmacion() {
        return confirmacion;
    }

    public void setConfirmacion(String confirmacion) {
        this.confirmacion = confirmacion;
    }
    
    public String getPalabraCopiar() {
        return palabraCopiar;
    }

    public void setPalabraCopiar(String palabraCopiar) {
        this.palabraCopiar = palabraCopiar;
    }   

    public String getPalabraNoVisible() {
        return palabraNoVisible;
    }

    public void setPalabraNoVisible(String palabraNoVisible) {
        this.palabraNoVisible = palabraNoVisible;
    }
    
    public boolean isFotoRecibida() {
        return fotoRecibida;
    }

    public void setFotoRecibida(boolean fotoRecibida) {
        this.fotoRecibida = fotoRecibida;
    }    

    public String getSolicitarFoto() {
        return solicitarFoto;
    }

    public void setSolicitarFoto(String solicitarFoto) {
        this.solicitarFoto = solicitarFoto;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getNombreDispositivo() {
        return nombreDispositivo;
    }

    public String getVisible() {
        return visible;
    }

    public String getEncender() {
        return encender; 
    }

    public boolean isEncendido() {
        return encendido;
    }

    public boolean isAudifono() {
        return audifono;
    }

    public void setAudifono(boolean audifono) {
        this.audifono = audifono;
    }   

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setNombreDispositivo(String nombreDispositivo) {
        this.nombreDispositivo = nombreDispositivo;
    }

    public void setVisible(String visible) {
        this.visible = visible;
    }

    public void setEncender(String encender) {
        this.encender = encender;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public String getEstadoAudifono() {
        return estadoAudifono;
    }

    public void setEstadoAudifono(String estadoAudifono) {
        this.estadoAudifono = estadoAudifono;
    }

    public String getNombreAudifono() {
        return nombreAudifono;
    }

    public void setNombreAudifono(String nombreAudifono) {
        this.nombreAudifono = nombreAudifono;
    }
    
    public void dispositivo(){
        System.out.println("Correo Electronico: " + getCorreoElectronico()+
                "\nNombre del dispositivo: "+ getNombreDispositivo()+
                "\nVisible para conexion: "+ getVisible()+
                "\nEl dipositivo esta: " +encendido("")+
                "\n"+audifonoConectado("")+
                "\n"+fotoRecibida(""));
    }
    
    ////////////////// METODOS ACTIVACION ///////////////////
    
    public String llamadaRecibida(String s){
        if(llamadaRecibida){
            s="\n !!! Se esta recibiendo una llamada !!!";
        }
        return s;
    }
    
    public String encendido(String encender){
        if (encendido)
            encender="Encendido";
        else
            encender="Apagado";       
        return encender;
    }
    
    public String audifonoConectado(String estadoAudifono){
        
        if(audifono){
            estadoAudifono="Audifonos conectados"+"\nNombre de Audifonos: "
                    +getNombreAudifono();
            setEstadoAudifono("Conectado");             
        }
        else
            estadoAudifono="\n";
        return estadoAudifono;
    } 
    
    public String fotoRecibida(String foto){
        if(fotoRecibida){
            foto="foto disponible en almacenamiento";
        }else{
            foto="";
        }
        return foto;
    }
    
    public String palabraCopiada(String palabra){
        palabra=getPalabraCopiar();
        return palabra;
    }
    
    public String noVisible(String palabra){
        palabra=getPalabraNoVisible();
        return palabra;
    }
    
    public String confirmacion(String conf){
        if(getConfirmacion().equalsIgnoreCase("si")){
            conf="\n!!! Accion Aceptada !!!";
        }else{
            conf="\n!!! Accion Denegada !!!";
        }
        return conf;
    }
    
    //////////////// METODOS DE MENSAJES /////////////////////
    
    public String textoMensaje(String texto){
        texto="\nMensaje recibido: "+acciones.getTextoMensaje();
        return texto;
    }
    
    public String textoRedSocial(String texto){
        texto="\nNombre de la Red Social: "+acciones.getNombreRedSocial()+"\nMensaje Recibido: "+
                acciones.getTextoMensaje();
        return texto;
    } 
    
    public String textoInstantanea(String texto){
        texto="\nNombre de la aplicacion de Mensajeria: "+acciones.getNombreAplicacionMensajeria()+
                "\nNombre de la persona quien envia el mensaje: "+acciones.getNombrePersonaMensaje()+
                "\nMensaje recibido: "+acciones.getTextoMensaje();
        return texto;
    }
    
    public String textoVideo(String texto){
        texto="\nNombre de la aplicacion de Videoconferencia: "+acciones.getNombreAplicacionVideo()+
                "\nNombre de la persona quien envia el mensaje: "+acciones.getNombrePersonaMensaje()+
                "\nMensaje recibido: "+acciones.getTextoMensaje();
        return texto;
    }
    
    /////////////// METODOS DE ACCIONES INTERNAS /////////////
    
    public void compartirDocumetos(ArrayList<ComputadoraPortatil> compu,ArrayList<Smartphone>phone,
            ArrayList<Smartwatch> reloj, ArrayList<Tablet>tablet){
        String busqueda;
        String compartir;
        System.out.println("\n****** Compartir Documentos ******");
        System.out.println("\n !!! Solo se mostraran dispositivos que sean visibles !!!");
        System.out.println("Escriba el nombre del documento a compartir: ");
        compartir=entrada.next();
        acciones.setDocumento(compartir);
        System.out.println("\n////// Dispositivos Disponibles /////");
        for (CrearDispositivo deviceC: compu){
            if(deviceC.getVisible().equalsIgnoreCase("si")){
                System.out.println("Nombre dispositivo: "+deviceC.getNombreDispositivo());
            }
        }
        for (CrearDispositivo deviceP: phone ){
            if(deviceP.getVisible().equalsIgnoreCase("si")){
                System.out.println("Nombre Disposivito: "+deviceP.getNombreDispositivo());
            }
        }
        for(CrearDispositivo deviceW: reloj){
            if(deviceW.getVisible().equalsIgnoreCase("si")){
                System.out.println("Nombre Dispositivo: "+deviceW.getNombreDispositivo());
            }
        }
        for(CrearDispositivo deviceT: tablet){
            if(deviceT.getVisible().equalsIgnoreCase("si")){
                System.out.println("Nombre Dispositivo: "+deviceT.getNombreDispositivo());
            }
        }
        System.out.println("\nEscriba el nombre del dispositivo al que desea compartir el Documento: ");
        busqueda=entrada.next();
        
        for (CrearDispositivo deviceC: compu){
            if(deviceC.getNombreDispositivo().equalsIgnoreCase(busqueda)){
                System.out.println("\n!!! Dispositivo econtrado, mensaje de confirmacion !!!");
                System.out.println("\n¿Desea recibir el ducumento en este dispositivo?");
                System.out.println("\nEscriba 'si' o 'no'");
                busqueda=entrada.next();
                setConfirmacion(busqueda);
                confirmacion("");
            }
        }
        for (CrearDispositivo deviceP: phone ){
            if(deviceP.getNombreDispositivo().equals(busqueda)){
                System.out.println("\n!!! Dispositivo econtrado, mensaje de confirmacion !!!");
                System.out.println("\n¿Desea recibir el ducumento en este dispositivo?");
                System.out.println("\nEscriba 'si' o 'no'");
                busqueda=entrada.next();
                setConfirmacion(busqueda);
                confirmacion("");
            }
        }
        for(CrearDispositivo deviceW: reloj){
            if(deviceW.getNombreDispositivo().equals(busqueda)){
                System.out.println("!!! Dispositivo econtrado, mensaje de confirmacion !!!");
                System.out.println("\n¿Desea recibir el ducumento en este dispositivo?");
                System.out.println("\nEscriba 'si' o 'no'");
                busqueda=entrada.next();
                setConfirmacion(busqueda);
                confirmacion("");
            }
        }
        for(CrearDispositivo deviceT: tablet){
            if(deviceT.getNombreDispositivo().equals(busqueda)){
                System.out.println("!!! Dispositivo econtrado, mensaje de confirmacion !!!");
                System.out.println("\n¿Desea recibir el ducumento en este dispositivo?");
                System.out.println("\nEscriba 'si' o 'no'");
                busqueda=entrada.next();
                setConfirmacion(busqueda);
                confirmacion("");
            }
        }
    }
    
    public void reproducirMusica(ArrayList<ComputadoraPortatil> compu,ArrayList<Smartphone>phone,
            ArrayList<Smartwatch> reloj, ArrayList<Tablet>tablet){
        String busqueda;
        System.out.println("\n****** Menu para Reproducir Muscia ******");
        System.out.println("\n///// Lista de Dispositivos /////");
        for (CrearDispositivo deviceC: compu){
            System.out.println("Nombre dispositivo: "+deviceC.getNombreDispositivo());
        }
        for (CrearDispositivo deviceP: phone ){
            System.out.println("Nombre Disposivito: "+deviceP.getNombreDispositivo());
        }
        for(CrearDispositivo deviceW: reloj){
            System.out.println("Nombre Dispositivo: "+deviceW.getNombreDispositivo());
        }
        for(CrearDispositivo deviceT: tablet){
            System.out.println("Nombre Dispositivo: "+deviceT.getNombreDispositivo());
        }
        System.out.println("\nSeleccion un dispositivo para reproducir musica: ");
        busqueda=entrada.next();
        
        for (CrearDispositivo deviceC: compu){
            if(deviceC.getNombreDispositivo().equals(busqueda)){
                if(deviceC.isAudifono()){
                    System.out.println("Escriba la cancion a reproducir: ");
                    busqueda=entrada.next();
                    acciones.setCancion(busqueda);
                    System.out.println("\nReproduciendo con los audifonos");
                    System.out.println("Cancion a Reproducir: "+acciones.getCancion());
                }else{
                    System.out.println("Escriba la cancion a reproducir: ");
                    busqueda=entrada.next();
                    acciones.setCancion(busqueda);
                    System.out.println("\nReproduciendo con los parlantes");
                    System.out.println("Cancion a Reproducir: "+acciones.getCancion());
                }
            }else{System.out.println("\n !!! Disposivito no econtrado !!!");}            
        }
        for (CrearDispositivo deviceP: phone ){
            if(deviceP.getNombreDispositivo().equals(busqueda)){
            if(deviceP.isAudifono()){
                System.out.println("Escriba la cancion a reproducir: ");
                busqueda=entrada.next();
                acciones.setCancion(busqueda);
                System.out.println("\nReproduciendo con los audifonos");
                System.out.println("Cancion a Reproducir: "+acciones.getCancion());
            }else{
                System.out.println("Escriba la cancion a reproducir: ");
                busqueda=entrada.next();
                acciones.setCancion(busqueda);
                System.out.println("\nReproduciendo con los parlantes");
                System.out.println("Cancion a Reproducir: "+acciones.getCancion());
            }
            }else{System.out.println("\n !!! Disposivito no econtrado !!!");}
        }
        for(CrearDispositivo deviceW: reloj){
            if(deviceW.getNombreDispositivo().equals(busqueda)){
            if(deviceW.isAudifono()){
                System.out.println("Escriba la cancion a reproducir: ");
                busqueda=entrada.next();
                acciones.setCancion(busqueda);
                System.out.println("\nReproduciendo con los audifonos");
                System.out.println("Cancion a Reproducir: "+acciones.getCancion());
            }else{
                System.out.println("Escriba la cancion a reproducir: ");
                busqueda=entrada.next();
                acciones.setCancion(busqueda);
                System.out.println("\nReproduciendo con los parlantes");
                System.out.println("Cancion a Reproducir: "+acciones.getCancion());
            }
        }else{System.out.println("\n !!! Disposivito no econtrado !!!");}
        }
        for(CrearDispositivo deviceT: tablet){
            if(deviceT.getNombreDispositivo().equals(busqueda)){
            if(deviceT.isAudifono()){
                System.out.println("Escriba la cancion a reproducir: ");
                busqueda=entrada.next();
                acciones.setCancion(busqueda);
                System.out.println("\nReproduciendo con los audifonos");
                System.out.println("Cancion a Reproducir: "+acciones.getCancion());
            }else{
                System.out.println("Escriba la cancion a reproducir: ");
                busqueda=entrada.next();
                acciones.setCancion(busqueda);
                System.out.println("\nReproduciendo con los parlantes");
                System.out.println("Cancion a Reproducir: "+acciones.getCancion());
            }
            }else{System.out.println("\n !!! Disposivito no econtrado !!!");}
        }
    }
    
    public void notificacionCorreo(ArrayList<ComputadoraPortatil> compu,ArrayList<Smartphone>phone,
            ArrayList<Smartwatch> reloj, ArrayList<Tablet>tablet){
        String busqueda;
        System.out.println("\n******* Menu para notificaciones de correo *******");
        System.out.println("\n////// Dispositivos Disponibles /////");
        for (CrearDispositivo deviceC: compu){
            if(deviceC.getNombreDispositivo()!=""){
            System.out.println("Nombre dispositivo: "+deviceC.getNombreDispositivo());
            }else{System.out.println("\n!!! Computadoras no existentes !!!");}
        }
        for (CrearDispositivo deviceP: phone ){
            if(deviceP.getNombreDispositivo()!=""){
            System.out.println("Nombre Disposivito: "+deviceP.getNombreDispositivo());
            }else{System.out.println("\n !!! Smartphones no disponibles !!!");}            
        }
        for(CrearDispositivo deviceW: reloj){
            if(deviceW.getNombreDispositivo()!=""){
            System.out.println("Nombre Dispositivo: "+deviceW.getNombreDispositivo());
            }else{System.out.println("\n !!! Smartwatch no disponibles !!!");}
        }
        for(CrearDispositivo deviceT: tablet){
            if(deviceT.getNombreDispositivo()!=""){
             System.out.println("Nombre Dispositivo: "+deviceT.getNombreDispositivo());
            }else{System.out.println("\n !!! Tablets no disponibles !!!");}
        }
        
        System.out.println("\nEscriba el nombre del dispositivo al que desea realizar una accion: ");
        busqueda=entrada.next();
        
        for(CrearDispositivo p: phone){
            if(p.getNombreDispositivo().equals(busqueda)){
                System.out.println("\nDispositivo econtrado");
                System.out.println("Escriba el asunto del correo electronico: ");
                busqueda=entrada.next();
                setNotificacionCorreo(busqueda);
                System.out.println("\nNombre del dispositivo: "+p.getNombreDispositivo()+
                        "\nNotificacion: "+p.getNotificacionCorreo());
            }else{System.out.println("\n !!! Dispositivo no econtrado, intentelo de nuevo !!!");}
            
            for(CrearDispositivo c:compu){
                if(c.getCorreoElectronico().equals(p.getCorreoElectronico())){
                    setNotificacionCorreo(busqueda);
                System.out.println("\nNombre del dispositivo: "+p.getNombreDispositivo()+
                        "\nNotificacion: "+p.getNotificacionCorreo());
                }
            }
            for(CrearDispositivo w: reloj){
                if(w.getCorreoElectronico().equals(p.getCorreoElectronico())){
                    setNotificacionCorreo(busqueda);
                    System.out.println("\nNombre del dispositivo: "+p.getNombreDispositivo()+
                            "\nNotificacion: "+p.getNotificacionCorreo());
                }
            }
            for(CrearDispositivo t: tablet){
                if(t.getCorreoElectronico().equals(p.getCorreoElectronico())){
                    setNotificacionCorreo(busqueda);
                    System.out.println("\nNombre del dispositivo: "+p.getNombreDispositivo()+
                            "\nNotificacion: "+p.getNotificacionCorreo());
                }
            }
        } // busquda telefono
        
        for(CrearDispositivo p: compu){
            if(p.getNombreDispositivo().equals(busqueda)){
                System.out.println("\nDispositivo econtrado");
                System.out.println("Escriba el asunto del correo electronico: ");
                busqueda=entrada.next();
                setNotificacionCorreo(busqueda);
                System.out.println("\nNombre del dispositivo: "+p.getNombreDispositivo()+
                        "\nNotificacion: "+p.getNotificacionCorreo());
            }else{System.out.println("\n !!! Dispositivo no econtrado, intentelo de nuevo !!!");}
            
            for(CrearDispositivo c:phone){
                if(c.getCorreoElectronico().equals(p.getCorreoElectronico())){
                    setNotificacionCorreo(busqueda);
                    System.out.println("\nNombre del dispositivo: "+p.getNombreDispositivo()+
                            "\nNotificacion: "+p.getNotificacionCorreo());
                }
            }
            for(CrearDispositivo w: reloj){
                if(w.getCorreoElectronico().equals(p.getCorreoElectronico())){
                    setNotificacionCorreo(busqueda);
                    System.out.println("\nNombre del dispositivo: "+p.getNombreDispositivo()+
                            "\nNotificacion: "+p.getNotificacionCorreo());
                }
            }
            for(CrearDispositivo t: tablet){
                if(t.getCorreoElectronico().equals(p.getCorreoElectronico())){
                setNotificacionCorreo(busqueda);
                    System.out.println("\nNombre del dispositivo: "+p.getNombreDispositivo()+
                            "\nNotificacion: "+p.getNotificacionCorreo());
                }
            }
        } // busqueda computadora
        
        for(CrearDispositivo p: reloj){
            if(p.getNombreDispositivo().equals(busqueda)){
                System.out.println("\nDispositivo econtrado");
                System.out.println("Escriba el asunto del correo electronico: ");
                busqueda=entrada.next();
                setNotificacionCorreo(busqueda);
                System.out.println("\nNombre del dispositivo: "+p.getNombreDispositivo()+
                        "\nNotificacion: "+p.getNotificacionCorreo());
            }else{System.out.println("\n !!! Dispositivo no econtrado, intentelo de nuevo !!!");}
            
            for(CrearDispositivo c:compu){
                if(c.getCorreoElectronico().equals(p.getCorreoElectronico())){
                    setNotificacionCorreo(busqueda);
                    System.out.println("\nNombre del dispositivo: "+p.getNombreDispositivo()+
                            "\nNotificacion: "+p.getNotificacionCorreo());
                }
            }
            for(CrearDispositivo w: phone){
                if(w.getCorreoElectronico().equals(p.getCorreoElectronico())){
                   setNotificacionCorreo(busqueda);
                    System.out.println("\nNombre del dispositivo: "+p.getNombreDispositivo()+
                            "\nNotificacion: "+p.getNotificacionCorreo());
                }
            }
            for(CrearDispositivo t: tablet){
                if(t.getCorreoElectronico().equals(p.getCorreoElectronico())){
                setNotificacionCorreo(busqueda);
                    System.out.println("\nNombre del dispositivo: "+p.getNombreDispositivo()+
                            "\nNotificacion: "+p.getNotificacionCorreo());
                }
            }
        } // busqueda reloj
        
        for(CrearDispositivo p: tablet){
            if(p.getNombreDispositivo().equals(busqueda)){
                System.out.println("\nDispositivo econtrado");
                System.out.println("Escriba el asunto del correo electronico: ");
                busqueda=entrada.next();
                setNotificacionCorreo(busqueda);
                System.out.println("\nNombre del dispositivo: "+p.getNombreDispositivo()+
                        "\nNotificacion: "+p.getNotificacionCorreo());
            }else{System.out.println("\n !!! Dispositivo no econtrado, intentelo de nuevo !!!");}
            
            for(CrearDispositivo c:compu){
                if(c.getCorreoElectronico().equals(p.getCorreoElectronico())){
                    setNotificacionCorreo(busqueda);
                    System.out.println("\nNombre del dispositivo: "+p.getNombreDispositivo()+
                            "\nNotificacion: "+p.getNotificacionCorreo());
                }
            }
            for(CrearDispositivo w: reloj){
                if(w.getCorreoElectronico().equals(p.getCorreoElectronico())){
                    setNotificacionCorreo(busqueda);
                    System.out.println("\nNombre del dispositivo: "+p.getNombreDispositivo()+
                            "\nNotificacion: "+p.getNotificacionCorreo());
                }
            }
            for(CrearDispositivo t: phone){
                if(t.getCorreoElectronico().equals(p.getCorreoElectronico())){
                setNotificacionCorreo(busqueda);
                    System.out.println("\nNombre del dispositivo: "+p.getNombreDispositivo()+
                            "\nNotificacion: "+p.getNotificacionCorreo());
                }
            }
        } // busqueda tablet 
        
    }
    
    public void notificacionCalendario(ArrayList<ComputadoraPortatil> compu,ArrayList<Smartphone>phone,
            ArrayList<Smartwatch> reloj, ArrayList<Tablet>tablet){
        String busqueda;
        System.out.println("\n******* Menu para notificaciones de calendario *******");
        System.out.println("\n////// Dispositivos Disponibles /////");
        for (CrearDispositivo deviceC: compu){
            if(deviceC.getNombreDispositivo()!=""){
                System.out.println("Nombre dispositivo: "+deviceC.getNombreDispositivo());
            }else{System.out.println("\n!!! Computadoras no existentes !!!");}
        }
        for (CrearDispositivo deviceP: phone ){
            if(deviceP.getNombreDispositivo()!=""){
                System.out.println("Nombre Disposivito: "+deviceP.getNombreDispositivo());
            }else{System.out.println("\n !!! Smartphones no disponibles !!!");}
        }
        for(CrearDispositivo deviceW: reloj){
            if(deviceW.getNombreDispositivo()!=""){
                System.out.println("Nombre Dispositivo: "+deviceW.getNombreDispositivo());
            }else{System.out.println("\n !!! Smartwatch no disponibles !!!");}
        }
        for(CrearDispositivo deviceT: tablet){
            if(deviceT.getNombreDispositivo()!=""){
                System.out.println("Nombre Dispositivo: "+deviceT.getNombreDispositivo());
            }else{System.out.println("\n !!! Tablets no disponibles !!!");}
        }
        
        System.out.println("\nEscriba el nombre del dispositivo al que desea realizar una accion: ");
        busqueda=entrada.next();
        
        for(CrearDispositivo p: phone){
            if(p.getNombreDispositivo().equals(busqueda)){
                System.out.println("\nDispositivo econtrado");
                System.out.println("Escriba la fecha: ");
                busqueda=entrada.next();
                setNotificacionFecha(busqueda);
                System.out.println("Escibra el nombre del evento: ");
                busqueda=entrada.next();
                setNombreEvento(busqueda);
                System.out.println("\nNombre del dispositivo: "+p.getNombreDispositivo()+
                        "\nFecha de la notificacion: "+p.getNotificacionFecha()+
                        "\nNombre del evento: "+p.getNombreEvento());
                
                for(CrearDispositivo c:compu){
                    if(c.getCorreoElectronico().equals(p.getCorreoElectronico())){
                        setNombreEvento(busqueda);
                        setNotificacionFecha(busqueda);
                        System.out.println("\nNombre del dispositivo: "+p.getNombreDispositivo()+
                                "\nFecha de la notificacion: "+p.getNotificacionFecha()+
                                "\nNombre del evento: "+p.getNombreEvento());
                    }
                }
                for(CrearDispositivo w: reloj){
                    if(w.getCorreoElectronico().equals(p.getCorreoElectronico())){
                        setNombreEvento(busqueda);
                        setNotificacionFecha(busqueda);
                        System.out.println("\nNombre del dispositivo: "+p.getNombreDispositivo()+
                                "\nFecha de la notificacion: "+p.getNotificacionFecha()+
                                "\nNombre del evento: "+p.getNombreEvento());
                    }
                }
                for(CrearDispositivo t: tablet){
                    if(t.getCorreoElectronico().equals(p.getCorreoElectronico())){
                        setNombreEvento(busqueda);
                        setNotificacionFecha(busqueda);
                        System.out.println("\nNombre del dispositivo: "+p.getNombreDispositivo()+
                                "\nFecha de la notificacion: "+p.getNotificacionFecha()+
                                "\nNombre del evento: "+p.getNombreEvento());
                    }
                }
            }else{System.out.println("\n !!! Dispositivo no econtrado, intentelo de nuevo !!!");}
            
            
        } // busquda telefono
        
        for(CrearDispositivo p: compu){
            if(p.getNombreDispositivo().equals(busqueda)){
                System.out.println("\nDispositivo econtrado");
                System.out.println("Escriba la fecha: ");
                busqueda=entrada.next();
                setNotificacionFecha(busqueda);
                System.out.println("Escibra el nombre del evento: ");
                busqueda=entrada.next();
                setNombreEvento(busqueda);
                System.out.println("\nNombre del dispositivo: "+p.getNombreDispositivo()+
                        "\nFecha de la notificacion: "+p.getNotificacionFecha()+
                        "\nNombre del evento: "+p.getNombreEvento());
                
                for(CrearDispositivo c:phone){
                    if(c.getCorreoElectronico().equals(p.getCorreoElectronico())){
                        setNombreEvento(busqueda);
                        setNotificacionFecha(busqueda);
                        System.out.println("\nNombre del dispositivo: "+p.getNombreDispositivo()+
                                "\nFecha de la notificacion: "+p.getNotificacionFecha()+
                                "\nNombre del evento: "+p.getNombreEvento());
                    }
                }
                for(CrearDispositivo w: reloj){
                    if(w.getCorreoElectronico().equals(p.getCorreoElectronico())){
                        setNombreEvento(busqueda);
                        setNotificacionFecha(busqueda);
                        System.out.println("\nNombre del dispositivo: "+p.getNombreDispositivo()+
                                "\nFecha de la notificacion: "+p.getNotificacionFecha()+
                                "\nNombre del evento: "+p.getNombreEvento());
                    }
                }
                for(CrearDispositivo t: tablet){
                    if(t.getCorreoElectronico().equals(p.getCorreoElectronico())){
                        setNombreEvento(busqueda);
                        setNotificacionFecha(busqueda);
                        System.out.println("\nNombre del dispositivo: "+p.getNombreDispositivo()+
                                "\nFecha de la notificacion: "+p.getNotificacionFecha()+
                                "\nNombre del evento: "+p.getNombreEvento());
                    }
                }
            }else{System.out.println("\n !!! Dispositivo no econtrado, intentelo de nuevo !!!");}
        } // busqueda computadora
        
        for(CrearDispositivo p: reloj){
            if(p.getNombreDispositivo().equals(busqueda)){
                System.out.println("\nDispositivo econtrado");
                System.out.println("Escriba la fecha: ");
                busqueda=entrada.next();
                setNotificacionFecha(busqueda);
                System.out.println("Escibra el nombre del evento: ");
                busqueda=entrada.next();
                setNombreEvento(busqueda);
                System.out.println("\nNombre del dispositivo: "+p.getNombreDispositivo()+
                        "\nFecha de la notificacion: "+p.getNotificacionFecha()+
                        "\nNombre del evento: "+p.getNombreEvento());
                
                for(CrearDispositivo c:compu){
                    if(c.getCorreoElectronico().equals(p.getCorreoElectronico())){
                        setNombreEvento(busqueda);
                        setNotificacionFecha(busqueda);
                        System.out.println("\nNombre del dispositivo: "+p.getNombreDispositivo()+
                                "\nFecha de la notificacion: "+p.getNotificacionFecha()+
                                "\nNombre del evento: "+p.getNombreEvento());
                    }
                }
                for(CrearDispositivo w: phone){
                    if(w.getCorreoElectronico().equals(p.getCorreoElectronico())){
                        setNombreEvento(busqueda);
                        setNotificacionFecha(busqueda);
                        System.out.println("\nNombre del dispositivo: "+p.getNombreDispositivo()+
                                "\nFecha de la notificacion: "+p.getNotificacionFecha()+
                                "\nNombre del evento: "+p.getNombreEvento());
                    }
                }
                for(CrearDispositivo t: tablet){
                    if(t.getCorreoElectronico().equals(p.getCorreoElectronico())){
                        setNombreEvento(busqueda);
                        setNotificacionFecha(busqueda);
                        System.out.println("\nNombre del dispositivo: "+p.getNombreDispositivo()+
                                "\nFecha de la notificacion: "+p.getNotificacionFecha()+
                                "\nNombre del evento: "+p.getNombreEvento());
                    }
                }
            }else{System.out.println("\n !!! Dispositivo no econtrado, intentelo de nuevo !!!");}
            
            
        } // busqueda reloj
        
        for(CrearDispositivo p: tablet){
            if(p.getNombreDispositivo().equals(busqueda)){
                System.out.println("\nDispositivo econtrado");
                System.out.println("Escriba la fecha: ");
                busqueda=entrada.next();
                setNotificacionFecha(busqueda);
                System.out.println("Escibra el nombre del evento: ");
                busqueda=entrada.next();
                setNombreEvento(busqueda);
                System.out.println("\nNombre del dispositivo: "+p.getNombreDispositivo()+
                        "\nFecha de la notificacion: "+p.getNotificacionFecha()+
                        "\nNombre del evento: "+p.getNombreEvento());
                
                for(CrearDispositivo c:compu){
                    if(c.getCorreoElectronico().equals(p.getCorreoElectronico())){
                        setNombreEvento(busqueda);
                        setNotificacionFecha(busqueda);
                        System.out.println("\nNombre del dispositivo: "+p.getNombreDispositivo()+
                                "\nFecha de la notificacion: "+p.getNotificacionFecha()+
                                "\nNombre del evento: "+p.getNombreEvento());
                    }
                }
                for(CrearDispositivo w: reloj){
                    if(w.getCorreoElectronico().equals(p.getCorreoElectronico())){
                        setNombreEvento(busqueda);
                        setNotificacionFecha(busqueda);
                        System.out.println("\nNombre del dispositivo: "+p.getNombreDispositivo()+
                                "\nFecha de la notificacion: "+p.getNotificacionFecha()+
                                "\nNombre del evento: "+p.getNombreEvento());
                    }
                }
                for(CrearDispositivo t: phone){
                    if(t.getCorreoElectronico().equals(p.getCorreoElectronico())){
                        setNombreEvento(busqueda);
                        setNotificacionFecha(busqueda);
                        System.out.println("\nNombre del dispositivo: "+p.getNombreDispositivo()+
                                "\nFecha de la notificacion: "+p.getNotificacionFecha()+
                                "\nNombre del evento: "+p.getNombreEvento());
                    }
                }
            }else{System.out.println("\n !!! Dispositivo no econtrado, intentelo de nuevo !!!");}
            
            
        } // busqueda tablet
    }// fin notificacionCorreo
    
    
}
