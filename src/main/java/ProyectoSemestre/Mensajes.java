
package ProyectoSemestre;

import java.util.Scanner;
import java.util.ArrayList;

public class Mensajes {
    
    Scanner entrada=new Scanner(System.in);
    AccionesDispositivos acciones= new AccionesDispositivos("","","","","","","","","","");
    
    public Mensajes(){}
    
    public void mensajeTexto(ArrayList<ComputadoraPortatil> compu,ArrayList<Smartphone>phone,
            ArrayList<Smartwatch> reloj, ArrayList<Tablet>tablet){
        String texto;
        String busqueda;
        System.out.println("\n ////// Opcion para mandar mensajes //////");
        
        if(phone.isEmpty()){System.out.println("\n !!! Smartphones no disponibles, crear uno primero !!!");}else{
        
            for(CrearDispositivo p: phone){
                System.out.println("\n ////// Dispositivos Disponibles //////");
                int i=0;
                System.out.println(phone.get(i++).getNombreDispositivo());
                System.out.println("\nEscriba el nombre del smartphone a utilizar: ");
                busqueda=entrada.next();
                if(p.getNombreDispositivo().equals(busqueda)){
                    System.out.println("\nEscriba el mensaje a enviar: ");
                    texto=entrada.next();
                    acciones.setTextoMensaje(texto);
                    System.out.println("\nNombre del Telefono: "+p.getNombreDispositivo());
                    System.out.println(p.textoMensaje(""));
                    for(CrearDispositivo c:compu){
                        if(c.getCorreoElectronico().equals(p.getCorreoElectronico())){
                            System.out.println("\nNombre de computadora: "+c.getNombreDispositivo());
                            System.out.println(c.textoMensaje(""));
                        }
                    }
                    for(CrearDispositivo w: reloj){
                        if(w.getCorreoElectronico().equals(p.getCorreoElectronico())){
                            System.out.println("\nNombre de computadora: "+w.getNombreDispositivo());
                            System.out.println(w.textoMensaje(""));
                        }
                    }
                    for(CrearDispositivo t: tablet){
                        System.out.println("\nNombre de computadora: "+t.getNombreDispositivo());
                        System.out.println(t.textoMensaje(""));
                    }
                }else{System.out.println("\n !!! Dispositivo no econtrado, intentelo de nuevo");}
            }
        } // fin else
    }
    
    public void mensajeRedSocial(ArrayList<ComputadoraPortatil> compu,ArrayList<Smartphone>phone,
            ArrayList<Smartwatch> reloj, ArrayList<Tablet>tablet){
    
        String texto;
        String busqueda;
        System.out.println("\n ////// Opcion para mandar mensajes por Redes Sociales //////");
        System.out.println("\nEscriba el mensaje a enviar: ");
        texto=entrada.next();
        acciones.setTextoMensaje(texto);
        System.out.println("\nEscriba el nombre de la Red Social ");
        texto=entrada.next();
        acciones.setNombreRedSocial(texto);
        
        System.out.println("\n****** Menu para realizar mensajes ******");
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
                System.out.println("\nNombre del Telefono: "+p.getNombreDispositivo());
                System.out.println(p.textoRedSocial(""));
            }else{System.out.println("\n !!! Dispositivo no econtrado, intentelo de nuevo !!!");}
            
            for(CrearDispositivo c:compu){
                if(c.getCorreoElectronico().equals(p.getCorreoElectronico())){
                    System.out.println("\nNombre de computadora: "+c.getNombreDispositivo());
                    System.out.println(c.textoRedSocial(""));
                }
            }
            for(CrearDispositivo w: reloj){
                if(w.getCorreoElectronico().equals(p.getCorreoElectronico())){
                    System.out.println("\nNombre de computadora: "+w.getNombreDispositivo());
                    System.out.println(w.textoRedSocial(""));
                }
            }
            for(CrearDispositivo t: tablet){
                System.out.println("\nNombre de computadora: "+t.getNombreDispositivo());
                System.out.println(t.textoRedSocial(""));
            }
        } // busquda telefono
        
        for(CrearDispositivo p: compu){
            if(p.getNombreDispositivo().equals(busqueda)){
                System.out.println("\nNombre de la computadora: "+p.getNombreDispositivo());
                System.out.println(p.textoRedSocial(""));
            }else{System.out.println("\n !!! Dispositivo no econtrado, intentelo de nuevo !!!");}
            
            for(CrearDispositivo c:phone){
                if(c.getCorreoElectronico().equals(p.getCorreoElectronico())){
                    System.out.println("\nNombre del smartphone: "+c.getNombreDispositivo());
                    System.out.println(c.textoRedSocial(""));
                }
            }
            for(CrearDispositivo w: reloj){
                if(w.getCorreoElectronico().equals(p.getCorreoElectronico())){
                    System.out.println("\nNombre del smartwatch: "+w.getNombreDispositivo());
                    System.out.println(w.textoRedSocial(""));
                }
            }
            for(CrearDispositivo t: tablet){
                System.out.println("\nNombre del tablet: "+t.getNombreDispositivo());
                System.out.println(t.textoRedSocial(""));
            }
        } // busqueda computadora
        
        for(CrearDispositivo p: reloj){
            if(p.getNombreDispositivo().equals(busqueda)){
                System.out.println("\nNombre del smartwatch: "+p.getNombreDispositivo());
                System.out.println(p.textoRedSocial(""));
            }else{System.out.println("\n !!! Dispositivo no econtrado, intentelo de nuevo !!!");}
            
            for(CrearDispositivo c:compu){
                if(c.getCorreoElectronico().equals(p.getCorreoElectronico())){
                    System.out.println("\nNombre de computadora: "+c.getNombreDispositivo());
                    System.out.println(c.textoRedSocial(""));
                }
            }
            for(CrearDispositivo w: phone){
                if(w.getCorreoElectronico().equals(p.getCorreoElectronico())){
                    System.out.println("\nNombre del smartphone: "+w.getNombreDispositivo());
                    System.out.println(w.textoRedSocial(""));
                }
            }
            for(CrearDispositivo t: tablet){
                System.out.println("\nNombre del tablet: "+t.getNombreDispositivo());
                System.out.println(t.textoRedSocial(""));
            }
        } // busqueda reloj
        
        for(CrearDispositivo p: tablet){
            if(p.getNombreDispositivo().equals(busqueda)){
                System.out.println("\nNombre de la tablet: "+p.getNombreDispositivo());
                System.out.println(p.textoRedSocial(""));
            }else{System.out.println("\n !!! Dispositivo no econtrado, intentelo de nuevo !!!");}
            
            for(CrearDispositivo c:compu){
                if(c.getCorreoElectronico().equals(p.getCorreoElectronico())){
                    System.out.println("\nNombre de computadora: "+c.getNombreDispositivo());
                    System.out.println(c.textoRedSocial(""));
                }
            }
            for(CrearDispositivo w: reloj){
                if(w.getCorreoElectronico().equals(p.getCorreoElectronico())){
                    System.out.println("\nNombre del smartwatch: "+w.getNombreDispositivo());
                    System.out.println(w.textoRedSocial(""));
                }
            }
            for(CrearDispositivo t: phone){
                if(t.getCorreoElectronico().equals(p.getCorreoElectronico())){
                System.out.println("\nNombre del smartphone: "+t.getNombreDispositivo());
                System.out.println(t.textoRedSocial(""));
                }
            }
        } // busqueda tablet 
    } // fin mensajeRedSocial
    
    public void mensajeInstantaneo(ArrayList<ComputadoraPortatil> compu,ArrayList<Smartphone>phone,
            ArrayList<Smartwatch> reloj, ArrayList<Tablet>tablet){
        String texto;
        String busqueda;
        System.out.println("\n ////// Opcion para mandar mensajes por Mensajeria Instantanea //////");
        System.out.println("\nEscriba el mensaje a enviar: ");
        texto=entrada.next();
        acciones.setTextoMensaje(texto);
        System.out.println("\nEscriba el nombre de la aplicacion de mensajeria instantanea ");
        texto=entrada.next();
        acciones.setNombreAplicacionMensajeria(texto);
        System.out.println("\nEscriba el nombre de la persona quien manda el mensaje");
        texto=entrada.next();
        acciones.setNombrePersonaMensaje(texto);        
        
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
                System.out.println("\nNombre del Telefono: "+p.getNombreDispositivo());
                System.out.println(p.textoInstantanea(""));
            }else{System.out.println("\n !!! Dispositivo no econtrado, intentelo de nuevo !!!");}
            
            for(CrearDispositivo c:compu){
                if(c.getCorreoElectronico().equals(p.getCorreoElectronico())){
                    System.out.println("\nNombre de computadora: "+c.getNombreDispositivo());
                    System.out.println(c.textoInstantanea(""));
                }
            }
            for(CrearDispositivo w: reloj){
                if(w.getCorreoElectronico().equals(p.getCorreoElectronico())){
                    System.out.println("\nNombre de computadora: "+w.getNombreDispositivo());
                    System.out.println(w.textoInstantanea(""));
                }
            }
            for(CrearDispositivo t: tablet){
                System.out.println("\nNombre de computadora: "+t.getNombreDispositivo());
                System.out.println(t.textoInstantanea(""));
            }
        } // busquda telefono
        
        for(CrearDispositivo p: compu){
            if(p.getNombreDispositivo().equals(busqueda)){
                System.out.println("\nNombre de la computadora: "+p.getNombreDispositivo());
                System.out.println(p.textoInstantanea(""));
            }else{System.out.println("\n !!! Dispositivo no econtrado, intentelo de nuevo !!!");}
            
            for(CrearDispositivo c:phone){
                if(c.getCorreoElectronico().equals(p.getCorreoElectronico())){
                    System.out.println("\nNombre del smartphone: "+c.getNombreDispositivo());
                    System.out.println(c.textoInstantanea(""));
                }
            }
            for(CrearDispositivo w: reloj){
                if(w.getCorreoElectronico().equals(p.getCorreoElectronico())){
                    System.out.println("\nNombre del smartwatch: "+w.getNombreDispositivo());
                    System.out.println(w.textoInstantanea(""));
                }
            }
            for(CrearDispositivo t: tablet){
                System.out.println("\nNombre del tablet: "+t.getNombreDispositivo());
                System.out.println(t.textoInstantanea(""));
            }
        } // busqueda computadora
        
        for(CrearDispositivo p: reloj){
            if(p.getNombreDispositivo().equals(busqueda)){
                System.out.println("\nNombre del smartwatch: "+p.getNombreDispositivo());
                System.out.println(p.textoInstantanea(""));
            }else{System.out.println("\n !!! Dispositivo no econtrado, intentelo de nuevo !!!");}
            
            for(CrearDispositivo c:compu){
                if(c.getCorreoElectronico().equals(p.getCorreoElectronico())){
                    System.out.println("\nNombre de computadora: "+c.getNombreDispositivo());
                    System.out.println(c.textoInstantanea(""));
                }
            }
            for(CrearDispositivo w: phone){
                if(w.getCorreoElectronico().equals(p.getCorreoElectronico())){
                    System.out.println("\nNombre del smartphone: "+w.getNombreDispositivo());
                    System.out.println(w.textoInstantanea(""));
                }
            }
            for(CrearDispositivo t: tablet){
                System.out.println("\nNombre del tablet: "+t.getNombreDispositivo());
                System.out.println(t.textoInstantanea(""));
            }
        } // busqueda reloj
        
        for(CrearDispositivo p: tablet){
            if(p.getNombreDispositivo().equals(busqueda)){
                System.out.println("\nNombre de la tablet: "+p.getNombreDispositivo());
                System.out.println(p.textoInstantanea(""));
            }else{System.out.println("\n !!! Dispositivo no econtrado, intentelo de nuevo !!!");}
            
            for(CrearDispositivo c:compu){
                if(c.getCorreoElectronico().equals(p.getCorreoElectronico())){
                    System.out.println("\nNombre de computadora: "+c.getNombreDispositivo());
                    System.out.println(c.textoInstantanea(""));
                }
            }
            for(CrearDispositivo w: reloj){
                if(w.getCorreoElectronico().equals(p.getCorreoElectronico())){
                    System.out.println("\nNombre del smartwatch: "+w.getNombreDispositivo());
                    System.out.println(w.textoInstantanea(""));
                }
            }
            for(CrearDispositivo t: phone){
                if(t.getCorreoElectronico().equals(p.getCorreoElectronico())){
                System.out.println("\nNombre del smartphone: "+t.getNombreDispositivo());
                System.out.println(t.textoInstantanea(""));
                }
            }
        } // busqueda tablet 
    
    } // fin mensajeInstantaneo
    
    public void mensajeVideo(ArrayList<ComputadoraPortatil> compu,ArrayList<Smartphone>phone,
            ArrayList<Smartwatch> reloj, ArrayList<Tablet>tablet){
        String texto;
        String busqueda;
        System.out.println("\n ////// Opcion para mandar mensajes por Mensaje de videoconferencia //////");
        System.out.println("\nEscriba el mensaje a enviar: ");
        texto=entrada.next();
        acciones.setTextoMensaje(texto);
        System.out.println("\nEscriba el nombre de la aplicacion de videoconferencia");
        texto=entrada.next();
        acciones.setNombreAplicacionVideo(texto);
        System.out.println("\nEscriba el nombre de la persona quien manda el mensaje");
        texto=entrada.next();
        acciones.setNombrePersonaMensaje(texto);        
        
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
                System.out.println("\nNombre del Telefono: "+p.getNombreDispositivo());
                System.out.println(p.textoVideo(""));
            }else{System.out.println("\n !!! Dispositivo no econtrado, intentelo de nuevo !!!");}
            
            for(CrearDispositivo c:compu){
                if(c.getCorreoElectronico().equals(p.getCorreoElectronico())){
                    System.out.println("\nNombre de computadora: "+c.getNombreDispositivo());
                    System.out.println(c.textoVideo(""));
                }
            }
            for(CrearDispositivo w: reloj){
                if(w.getCorreoElectronico().equals(p.getCorreoElectronico())){
                    System.out.println("\nNombre de computadora: "+w.getNombreDispositivo());
                    System.out.println(w.textoVideo(""));
                }
            }
            for(CrearDispositivo t: tablet){
                System.out.println("\nNombre de computadora: "+t.getNombreDispositivo());
                System.out.println(t.textoVideo(""));
            }
        } // busquda telefono
        
        for(CrearDispositivo p: compu){
            if(p.getNombreDispositivo().equals(busqueda)){
                System.out.println("\nNombre de la computadora: "+p.getNombreDispositivo());
                System.out.println(p.textoVideo(""));
            }else{System.out.println("\n !!! Dispositivo no econtrado, intentelo de nuevo !!!");}
            
            for(CrearDispositivo c:phone){
                if(c.getCorreoElectronico().equals(p.getCorreoElectronico())){
                    System.out.println("\nNombre del smartphone: "+c.getNombreDispositivo());
                    System.out.println(c.textoVideo(""));
                }
            }
            for(CrearDispositivo w: reloj){
                if(w.getCorreoElectronico().equals(p.getCorreoElectronico())){
                    System.out.println("\nNombre del smartwatch: "+w.getNombreDispositivo());
                    System.out.println(w.textoVideo(""));
                }
            }
            for(CrearDispositivo t: tablet){
                System.out.println("\nNombre del tablet: "+t.getNombreDispositivo());
                System.out.println(t.textoVideo(""));
            }
        } // busqueda computadora
        
        for(CrearDispositivo p: reloj){
            if(p.getNombreDispositivo().equals(busqueda)){
                System.out.println("\nNombre del smartwatch: "+p.getNombreDispositivo());
                System.out.println(p.textoVideo(""));
            }else{System.out.println("\n !!! Dispositivo no econtrado, intentelo de nuevo !!!");}
            
            for(CrearDispositivo c:compu){
                if(c.getCorreoElectronico().equals(p.getCorreoElectronico())){
                    System.out.println("\nNombre de computadora: "+c.getNombreDispositivo());
                    System.out.println(c.textoVideo(""));
                }
            }
            for(CrearDispositivo w: phone){
                if(w.getCorreoElectronico().equals(p.getCorreoElectronico())){
                    System.out.println("\nNombre del smartphone: "+w.getNombreDispositivo());
                    System.out.println(w.textoVideo(""));
                }
            }
            for(CrearDispositivo t: tablet){
                System.out.println("\nNombre del tablet: "+t.getNombreDispositivo());
                System.out.println(t.textoVideo(""));
            }
        } // busqueda reloj
        
        for(CrearDispositivo p: tablet){
            if(p.getNombreDispositivo().equals(busqueda)){
                System.out.println("\nNombre de la tablet: "+p.getNombreDispositivo());
                System.out.println(p.textoVideo(""));
            }else{System.out.println("\n !!! Dispositivo no econtrado, intentelo de nuevo !!!");}
            
            for(CrearDispositivo c:compu){
                if(c.getCorreoElectronico().equals(p.getCorreoElectronico())){
                    System.out.println("\nNombre de computadora: "+c.getNombreDispositivo());
                    System.out.println(c.textoVideo(""));
                }
            }
            for(CrearDispositivo w: reloj){
                if(w.getCorreoElectronico().equals(p.getCorreoElectronico())){
                    System.out.println("\nNombre del smartwatch: "+w.getNombreDispositivo());
                    System.out.println(w.textoVideo(""));
                }
            }
            for(CrearDispositivo t: phone){
                if(t.getCorreoElectronico().equals(p.getCorreoElectronico())){
                System.out.println("\nNombre del smartphone: "+t.getNombreDispositivo());
                System.out.println(t.textoVideo(""));
                }
            }
        } // busqueda tablet 
    } // fin mensajeVideo
    
    
}
