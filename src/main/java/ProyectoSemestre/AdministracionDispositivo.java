package ProyectoSemestre;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AdministracionDispositivo {
    ArrayList<ComputadoraPortatil>admCompu;
    ArrayList<Smartphone>admPhone;
    ArrayList<Smartwatch>admWatch;
    ArrayList<Tablet>admTablet;
    MenuPrincipal menu=new MenuPrincipal();
    Scanner entrada=new Scanner(System.in);
    AccionesDispositivos acciones= new AccionesDispositivos("","","","","","","","","","");
    CrearDispositivo dispositivo=new CrearDispositivo("", "", "", "", true, false, "", "", "", false, "", "", "",false,"","","");
    ComputadoraPortatil dispositivoC=new ComputadoraPortatil("", "", "", "", true, false, "", "", "", false, "", "", "",false,"","","");
    Smartphone dispositivoP=new Smartphone(0, "","", "", "", false,true, "", "","", false, "", "","","",false,false,"","","");
    Smartwatch dispositivoW=new Smartwatch("", "", "", "", true, false, "", "", "", false, "", "", "",false,"","","");
    Tablet dispositivoT=new Tablet("", "", "", "", true, false, "", "", "", false, "", "", "",false,"","","");
    Mensajes mensaje=new Mensajes(){};
    CargaMasiva carga=new CargaMasiva();
    
    
    public AdministracionDispositivo(){
        admCompu=new ArrayList<>();
        admPhone=new ArrayList<>();
        admWatch=new ArrayList<>();
        admTablet=new ArrayList<>();
    }
    
    public void addCompu (ComputadoraPortatil compu){
        admCompu.add(compu);
    }
    
    public void addPhone(Smartphone phone){
        admPhone.add(phone);
    }
    
    public void addWatch(Smartwatch watch){
        admWatch.add(watch);
    }
    
    public void addTablet(Tablet tablet){
        admTablet.add(tablet);
    }
    
    public void mostrarCompu(){
        for(ComputadoraPortatil compu: admCompu){
            compu.dispositivo();
            System.out.println("");
        }
    }
    
    public void mostrarPhone(){
        for(Smartphone phone: admPhone){
            phone.dispositivo();
            System.out.println("");
        }
    }
    
    public void mostrarWatch(){
        for(Smartwatch watch: admWatch){
            watch.dispositivo();
            System.out.println("");
        }
    }
    
    public void mostrarTablet(){
        for(Tablet tablet: admTablet){
            tablet.dispositivo();
            System.out.println("");
        }
    }
    
    public void editarCompu(){    
        
        int seleccion = 0;
        int indice=1;
        int opcion;
        String busqueda;
        
        System.out.println("\n****** Elementos Disponibles *******");
        
        for (CrearDispositivo device: admCompu){
            System.out.println("\n"+indice+". " + device.getNombreDispositivo()+ "     "+device.getEncender());
            indice++;
            
            System.out.println("\n1. Desea cambiar el nombre de un objeto: "+
                    "\n2. Desea cambiar el correo de un objeto:  "+
                    "\n3. Desea cambiar el estado de visibilidad: "+
                    "\n4. Desea cambiar si esta apagado o encendido"+
                    "\n5. Menu Principal");
            System.out.println("\nIngrese el numero de la accion que desea realizar");
            opcion=entrada.nextInt();
            
            switch (opcion){
                case 1 -> {
                    System.out.println("\nIngrese el nombre objeto a modificar: ");
                    busqueda=entrada.next();
                    if(device.getNombreDispositivo().equals(busqueda)){
                        System.out.println("Elemento econtrado, ingrese el nuevo nombre");
                        busqueda=entrada.next();
                        device.setNombreDispositivo(busqueda);
                        
                    }else{
                        System.out.println("Elemento no econtrado intente de nuevo");
                    }
                }
                case 2 -> {
                    System.out.println("\nIngrese el correo objeto a modificar: ");
                    busqueda=entrada.next();
                    if(device.getCorreoElectronico().equalsIgnoreCase(busqueda)){
                        System.out.println("Elemento econtrado, ingrese el nuevo correo");
                        busqueda=entrada.next();
                        device.setCorreoElectronico(busqueda);
                    }else{
                        System.out.println("Elemento no econtrado intente de nuevo");
                    }                    
                }
                case 3 -> {
                    System.out.println("\nEscriba el nombre a buscar");
                    busqueda=entrada.next();
                    if(device.getNombreDispositivo().equalsIgnoreCase(busqueda)){
                        System.out.println("\nNombre econtrado"+"\ningrese 'si', si el objeto es visible: "+
                            " ,o 'no' si el objeto estara oculto: ");
                        busqueda=entrada.next();
                        System.out.println("Estado se actualizo correctamente!!");
                        device.setVisible(busqueda);
                        
                    }else{
                        System.out.println("Estado invalido intente de nuevo");
                    }
                }
                case 4 -> {
                    System.out.println("\nEscriba el nombre a buscar");
                    busqueda=entrada.next();
                    if(device.getNombreDispositivo().equalsIgnoreCase(busqueda)){
                        System.out.println("Ingrese enceder o apagar, para cambiar el estado del equipo: ");
                        busqueda=entrada.next();
                        System.out.println("Estado atualizado correctamente!!");
                        device.setEncender(busqueda);                        
                    }else{
                        System.out.println("Estado invalido intente de nuevo");
                    }
                }
                case 5 -> {
                    menu.main();
                }
                default -> System.out.println("Seleccion incorrecta, intentelo de nuevo");                
            }
            
            
        }
        
    
    } // fin editarCompu
    
    public void editarPhone(){
        
        int seleccion = 0;
        int indice=1;
        int opcion;
        String busqueda;

        
        System.out.println("****** Elementos Disponibles *******");
        
         for (CrearDispositivo device: admPhone){
            System.out.println("\n"+indice+". " + device.getNombreDispositivo()+ "     "+device.getEncender());
            indice++;
            
            System.out.println("\n1. Desea cambiar el nombre de un objeto: "+
                    "\n2. Desea cambiar el correo de un objeto:  "+
                    "\n3. Desea cambiar el estado de visibilidad: "+
                    "\n4. Desea cambiar si esta apagado o encendido"+
                    "\n5. Menu Principal");
            System.out.println("\nIngrese el numero de la accion que desea realizar");
            opcion=entrada.nextInt();
            
            switch (opcion){
                case 1 -> {
                    System.out.println("\nIngrese el nombre objeto a modificar: ");
                    busqueda=entrada.next();
                    if(device.getNombreDispositivo().equals(busqueda)){
                        System.out.println("Elemento econtrado, ingrese el nuevo nombre");
                        busqueda=entrada.next();
                        device.setNombreDispositivo(busqueda);
                        
                    }else{
                        System.out.println("Elemento no econtrado intente de nuevo");
                    }
                }
                case 2 -> {
                    System.out.println("\nIngrese el correo objeto a modificar: ");
                    busqueda=entrada.next();
                    if(device.getCorreoElectronico().equalsIgnoreCase(busqueda)){
                        System.out.println("Elemento econtrado, ingrese el nuevo correo");
                        busqueda=entrada.next();
                        device.setCorreoElectronico(busqueda);
                    }else{
                        System.out.println("Elemento no econtrado intente de nuevo");
                    }                    
                }
                case 3 -> {
                    System.out.println("\nEscriba el nombre a buscar");
                    busqueda=entrada.next();
                    if(device.getNombreDispositivo().equalsIgnoreCase(busqueda)){
                        System.out.println("\nNombre econtrado"+"\ningrese 'si', si el objeto es visible: "+
                            " ,o 'no' si el objeto estara oculto: ");
                        busqueda=entrada.next();
                        System.out.println("Estado se actualizo correctamente!!");
                        device.setVisible(busqueda);
                        
                    }else{
                        System.out.println("Estado invalido intente de nuevo");
                    }
                }
                case 4 -> {
                    System.out.println("\nEscriba el nombre a buscar");
                    busqueda=entrada.next();
                    if(device.getNombreDispositivo().equalsIgnoreCase(busqueda)){
                        System.out.println("Ingrese enceder o apagar, para cambiar el estado del equipo: ");
                        busqueda=entrada.next();
                        System.out.println("Estado atualizado correctamente!!");
                        device.setEncender(busqueda);                        
                    }else{
                        System.out.println("Estado invalido intente de nuevo");
                    }
                }
                case 5 -> {
                    menu.main();
                }
                default -> System.out.println("Seleccion incorrecta, intentelo de nuevo");                
            }
            
            
        }
    } // fin editarPhone
    
    public void editarWatch(){
        int seleccion = 0;
        int indice=1;
        int opcion;
        String busqueda;

        
        System.out.println("****** Elementos Disponibles *******");
        
         for (CrearDispositivo device: admWatch){
            System.out.println("\n"+indice+". " + device.getNombreDispositivo()+ "     "+device.getEncender());
            indice++;
            
            System.out.println("\n1. Desea cambiar el nombre de un objeto: "+
                    "\n2. Desea cambiar el correo de un objeto:  "+
                    "\n3. Desea cambiar el estado de visibilidad: "+
                    "\n4. Desea cambiar si esta apagado o encendido"+
                    "\n5. Menu Principal");
            System.out.println("\nIngrese el numero de la accion que desea realizar");
            opcion=entrada.nextInt();
            
            switch (opcion){
                case 1 -> {
                    System.out.println("\nIngrese el nombre objeto a modificar: ");
                    busqueda=entrada.next();
                    if(device.getNombreDispositivo().equals(busqueda)){
                        System.out.println("Elemento econtrado, ingrese el nuevo nombre");
                        busqueda=entrada.next();
                        device.setNombreDispositivo(busqueda);
                        
                    }else{
                        System.out.println("Elemento no econtrado intente de nuevo");
                    }
                }
                case 2 -> {
                    System.out.println("\nIngrese el correo objeto a modificar: ");
                    busqueda=entrada.next();
                    if(device.getCorreoElectronico().equalsIgnoreCase(busqueda)){
                        System.out.println("Elemento econtrado, ingrese el nuevo correo");
                        busqueda=entrada.next();
                        device.setCorreoElectronico(busqueda);
                    }else{
                        System.out.println("Elemento no econtrado intente de nuevo");
                    }                    
                }
                case 3 -> {
                    System.out.println("\nEscriba el nombre a buscar");
                    busqueda=entrada.next();
                    if(device.getNombreDispositivo().equalsIgnoreCase(busqueda)){
                        System.out.println("\nNombre econtrado"+"\ningrese 'si', si el objeto es visible: "+
                            " ,o 'no' si el objeto estara oculto: ");
                        busqueda=entrada.next();
                        System.out.println("Estado se actualizo correctamente!!");
                        device.setVisible(busqueda);
                        
                    }else{
                        System.out.println("Estado invalido intente de nuevo");
                    }
                }
                case 4 -> {
                    System.out.println("\nEscriba el nombre a buscar");
                    busqueda=entrada.next();
                    if(device.getNombreDispositivo().equalsIgnoreCase(busqueda)){
                        System.out.println("Ingrese enceder o apagar, para cambiar el estado del equipo: ");
                        busqueda=entrada.next();
                        System.out.println("Estado atualizado correctamente!!");
                        device.setEncender(busqueda);                        
                    }else{
                        System.out.println("Estado invalido intente de nuevo");
                    }
                }
                case 5 -> {
                    menu.main();
                }
                default -> System.out.println("Seleccion incorrecta, intentelo de nuevo");                
            }
            
            
        }
    } // fin editarWatch
    
    public void editarTablet(){
        int seleccion = 0;
        int indice=1;
        int opcion;
        String busqueda;

        
        System.out.println("****** Elementos Disponibles *******");
        
         for (CrearDispositivo device: admTablet){
            System.out.println("\n"+indice+". " + device.getNombreDispositivo()+ "     "+device.getEncender());
            indice++;
            
            System.out.println("\n1. Desea cambiar el nombre de un objeto: "+
                    "\n2. Desea cambiar el correo de un objeto:  "+
                    "\n3. Desea cambiar el estado de visibilidad: "+
                    "\n4. Desea cambiar si esta apagado o encendido"+
                    "\n5. Menu Principal");
            System.out.println("\nIngrese el numero de la accion que desea realizar");
            opcion=entrada.nextInt();
            
            switch (opcion){
                case 1 -> {
                    System.out.println("\nIngrese el nombre objeto a modificar: ");
                    busqueda=entrada.next();
                    if(device.getNombreDispositivo().equals(busqueda)){
                        System.out.println("Elemento econtrado, ingrese el nuevo nombre");
                        busqueda=entrada.next();
                        device.setNombreDispositivo(busqueda);
                        
                    }else{
                        System.out.println("Elemento no econtrado intente de nuevo");
                    }
                }
                case 2 -> {
                    System.out.println("\nIngrese el correo objeto a modificar: ");
                    busqueda=entrada.next();
                    if(device.getCorreoElectronico().equalsIgnoreCase(busqueda)){
                        System.out.println("Elemento econtrado, ingrese el nuevo correo");
                        busqueda=entrada.next();
                        device.setCorreoElectronico(busqueda);
                    }else{
                        System.out.println("Elemento no econtrado intente de nuevo");
                    }                    
                }
                case 3 -> {
                    System.out.println("\nEscriba el nombre a buscar");
                    busqueda=entrada.next();
                    if(device.getNombreDispositivo().equalsIgnoreCase(busqueda)){
                        System.out.println("\nNombre econtrado"+"\ningrese 'si', si el objeto es visible: "+
                            " ,o 'no' si el objeto estara oculto: ");
                        busqueda=entrada.next();
                        System.out.println("Estado se actualizo correctamente!!");
                        device.setVisible(busqueda);
                        
                    }else{
                        System.out.println("Estado invalido intente de nuevo");
                    }
                }
                case 4 -> {
                    System.out.println("\nEscriba el nombre a buscar");
                    busqueda=entrada.next();
                    if(device.getNombreDispositivo().equalsIgnoreCase(busqueda)){
                        System.out.println("Ingrese enceder o apagar, para cambiar el estado del equipo: ");
                        busqueda=entrada.next();
                        System.out.println("Estado atualizado correctamente!!");
                        device.setEncender(busqueda);                        
                    }else{
                        System.out.println("Estado invalido intente de nuevo");
                    }
                }
                case 5 -> {
                    menu.main();
                }
                default -> System.out.println("Seleccion incorrecta, intentelo de nuevo");                
            }
            
            
        }
    } // fin editarTablet    
    
    public void crearAuricular(){
    
        
        
        String nombre;
        String nombreAuricular;
        System.out.println("");
        System.out.println("****** Dispositivos Disponibles ******");       
        
        for(ComputadoraPortatil pc: admCompu){
            if(pc.getVisible().equalsIgnoreCase("si")&&pc.isEncendido()==true){
                System.out.println(pc.getNombreDispositivo());
            }
            else{
                System.out.println("!!! Computadoras no disponibles !!!");
            }
        }
        for (Smartphone phone: admPhone){
            if(phone.getVisible().equalsIgnoreCase("si")&&phone.isEncendido()==true){
                System.out.println(phone.getNombreDispositivo());
            }
            else{
                System.out.println("!!! Smartphones no disponibles !!!");
            }
        }
        for (Smartwatch reloj:  admWatch){
            if(reloj.getVisible().equalsIgnoreCase("si")&& reloj.isEncendido()==true){
                System.out.println(reloj.getNombreDispositivo());
            }
            else{
                System.out.println("!!! Smartwatch no disponilbes !!!");
            }
        }
        for(Tablet tablet: admTablet){
            if(tablet.getVisible().equalsIgnoreCase("si")&&tablet.isEncendido()==true){
                System.out.println(tablet.getNombreDispositivo());
            }
            else{
                System.out.println("!!! Tablets no disponibles !!!");
            }
        }
        
        System.out.println("Escriba el nombre del objeto a enlazar: ");
        nombre=entrada.next();
        for(ComputadoraPortatil compu:admCompu){
            if(compu.getNombreDispositivo().equalsIgnoreCase(nombre)){
                compu.setAudifono(true);
                System.out.println("Escriba el nombre del auricular: ");
                nombreAuricular=entrada.next();
                compu.setNombreAudifono(nombreAuricular);                
                System.out.println("****** Dispositivo enlazado ******");
                compu.dispositivo();
                break;
            }
        }
        
        for(Smartphone phone: admPhone){
            if(phone.getNombreDispositivo().equalsIgnoreCase(nombre)){
                phone.setAudifono(true);
                System.out.println("Escriba el nombre del auricular: ");
                nombreAuricular=entrada.next();
                phone.setNombreAudifono(nombreAuricular);
                System.out.println("****** Dispositivo enlazado ******");
                phone.dispositivo();
                break;
            }
        }
        
        for(Smartwatch reloj: admWatch){
            if(reloj.getNombreDispositivo().equalsIgnoreCase(nombre))
            {
                reloj.setAudifono(true);
                System.out.println("Escriba el nombre del auricular: ");
                nombreAuricular=entrada.next();
                reloj.setNombreAudifono(nombreAuricular);
                System.out.println("****** Dispositivo enlazado ******");
                reloj.dispositivo();
            }
        }
        
        for(Tablet tablet: admTablet){
            if(tablet.getNombreDispositivo().equalsIgnoreCase(nombre)){
                tablet.setAudifono(true);
                System.out.println("Escriba el nombre del auricular: ");
                nombreAuricular=entrada.next();
                tablet.setNombreAudifono(nombreAuricular);
                System.out.println("****** Dispositivo enlazado ******");
                tablet.dispositivo();
            }
        }
    } // fin arrayAuri
    
    public void administrarAudifonos(){
        int seleccion;
        String busqueda;
        System.out.println("****** Administracion de Auriculares ******");
        System.out.println("Auriculares Disponibles: ");
        for(ComputadoraPortatil compu: admCompu){
            System.out.println(compu.getNombreAudifono()+" - Estado:"+compu.getEstadoAudifono());
        }
        for(Smartphone phone: admPhone){
            System.out.println(phone.getNombreAudifono()+" - Estado: "+phone.getEstadoAudifono());
        }
        for(Smartwatch reloj: admWatch){
            System.out.println(reloj.getNombreAudifono()+" - Estado: "+reloj.getEstadoAudifono());
        }
        for(Tablet tablet: admTablet){
            System.out.println(tablet.getNombreAudifono()+" - Estado: "+tablet.getEstadoAudifono());
        }
        System.out.println("\nAcciones que puede realizar: "+
                "\n1.Editar nombre del dispositivo: "+
                "\n2. Eliminar dispositivo sincronizado: "+
                "\n3. Apagar dispositivo"+
                "\n4. Menu");
        seleccion=entrada.nextInt();
        
        do{
            switch(seleccion){
                case 1:System.out.println("Escriba el nombre a editar: ");
                busqueda=entrada.next();
                for(ComputadoraPortatil compu: admCompu){
                    if(compu.getNombreAudifono().equalsIgnoreCase(busqueda)){
                        System.out.println("Nombre econtrado, escriba el nuevo nombre: ");
                        busqueda=entrada.next();
                        compu.setNombreAudifono(busqueda);
                        System.out.println("!!! Cambiado con exito !!!");
                        break;
                    }else{
                        System.out.println("Nombre no econtrado, intentelo de nuevo.");
                    }
                }
                for(Smartphone phone: admPhone){
                    if(phone.getNombreAudifono().equalsIgnoreCase(busqueda)){
                        System.out.println("Nombre econtrado, escriba el nuevo nombre: ");
                        busqueda=entrada.next();
                        phone.setNombreAudifono(busqueda);
                        System.out.println("!!! Cambiado con exito !!!");
                        break;
                    }else{
                        System.out.println("Nombre no econtrado, intentelo de nuevo.");
                    }
                }
                for(Smartwatch reloj: admWatch){
                    if(reloj.getNombreAudifono().equalsIgnoreCase(busqueda)){
                        System.out.println("Nombre econtrado, escriba el nuevo nombre: ");
                        busqueda=entrada.next();
                        reloj.setNombreAudifono(busqueda);
                        System.out.println("!!! Cambiado con exito !!!");
                        break;
                    }else{
                        System.out.println("Nombre no econtrado, intentelo de nuevo.");
                    }
                }
                for(Tablet tablet: admTablet){
                    if(tablet.getNombreAudifono().equalsIgnoreCase(busqueda)){
                        System.out.println("Nombre econtrado, escriba el nuevo nombre: ");
                        busqueda=entrada.next();
                        tablet.setNombreAudifono(busqueda);
                        System.out.println("!!! Cambiado con exito !!!");
                        break;
                    }else{
                        System.out.println("Nombre no econtrado, intentelo de nuevo.");
                    }
                }
                    break;
                case 2:System.out.println("Escriba el nombre a eliminar: ");
                busqueda=entrada.next();
                for(ComputadoraPortatil compu: admCompu){
                    if(compu.getNombreAudifono().equalsIgnoreCase(busqueda)){
                        seleccion=admCompu.indexOf(busqueda);
                        admCompu.remove(seleccion);
                        System.out.println("!!! Se elimino con exito !!!");
                    }else{
                        System.out.println("Nombre no econtrado, intentelo de nuevo.");
                    }
                }
                for(Smartphone phone: admPhone){
                    if(phone.getNombreAudifono().equalsIgnoreCase(busqueda)){
                        seleccion=admPhone.indexOf(busqueda);
                        admPhone.remove(seleccion);
                        System.out.println("!!! Se elimino con exito !!!");
                    }else{
                        System.out.println("Nombre no econtrado, intentelo de nuevo.");
                    }
                }
                for(Smartwatch reloj: admWatch){
                    if(reloj.getNombreAudifono().equalsIgnoreCase(busqueda)){
                        seleccion=admWatch.indexOf(busqueda);
                        admWatch.remove(seleccion);
                        System.out.println("!!! Se elimino con exito !!!");
                    }else{
                        System.out.println("Nombre no econtrado, intentelo de nuevo.");
                    }
                }
                for(Tablet tablet: admTablet){
                    if(tablet.getNombreAudifono().equalsIgnoreCase(busqueda)){
                        seleccion=admTablet.indexOf(busqueda);
                        admTablet.remove(seleccion);
                        System.out.println("!!! Se elimino con exito !!!");
                    }else{
                        System.out.println("Nombre no econtrado, intentelo de nuevo.");
                    }
                }
                    break;
                case 3:System.out.println("Escriba el nombre a apagar: ");
                busqueda=entrada.next();
                for(ComputadoraPortatil device: admCompu){
                    if(device.getNombreAudifono().equalsIgnoreCase(busqueda)&&device.isAudifono()==true){
                         device.setAudifono(false);
                        System.out.println("!!! Se apago con exito !!!");
                    }if(device.getNombreAudifono().equalsIgnoreCase(busqueda)&&device.isAudifono()==false){
                        device.setAudifono(true);
                        System.out.println("!!! Se encendio con exito !!!");
                    }
                    else{
                        System.out.println("Nombre no econtrado, intentelo de nuevo.");
                    }
                }
                for(Smartwatch device: admWatch){
                    if(device.getNombreAudifono().equalsIgnoreCase(busqueda)&&device.isAudifono()==true){
                         device.setAudifono(false);
                        System.out.println("!!! Se apago con exito !!!");
                    }if(device.getNombreAudifono().equalsIgnoreCase(busqueda)&&device.isAudifono()==false){
                        device.setAudifono(true);
                        System.out.println("!!! Se encendio con exito !!!");
                    }
                    else{
                        System.out.println("Nombre no econtrado, intentelo de nuevo.");
                    }
                }
                for(Smartphone device: admPhone){
                    if(device.getNombreAudifono().equalsIgnoreCase(busqueda)&&device.isAudifono()==true){
                         device.setAudifono(false);
                        System.out.println("!!! Se apago con exito !!!");
                    }if(device.getNombreAudifono().equalsIgnoreCase(busqueda)&&device.isAudifono()==false){
                        device.setAudifono(true);
                        System.out.println("!!! Se encendio con exito !!!");
                    }
                    else{
                        System.out.println("Nombre no econtrado, intentelo de nuevo.");
                    }
                }
                for(Tablet device: admTablet){
                    if(device.getNombreAudifono().equalsIgnoreCase(busqueda)&&device.isAudifono()==true){
                         device.setAudifono(false);
                        System.out.println("!!! Se apago con exito !!!");
                    }if(device.getNombreAudifono().equalsIgnoreCase(busqueda)&&device.isAudifono()==false){
                        device.setAudifono(true);
                        System.out.println("!!! Se encendio con exito !!!");
                    }
                    else{
                        System.out.println("Nombre no econtrado, intentelo de nuevo.");
                    }
                }
                    break;
                case 4: menu.main();
                    break;
                default: System.out.println("!!! Seleccion incorrecta, intente de nuevo !!!");
                    break;
            }
        }while(seleccion!=4);
    }    
    
    public void accionesInternasDispositivo(){
        int seleccion;
        String escoger;
        System.out.println("\n****** Acciones internas con Dispositivos ******");
        System.out.println("Seleccione el tipo de dispositivo: "+
                "\n1. Computadora portatil"+
                "\n2. Tablet"+
                "\n3. SmartWatch"+
                "\n4. Smartphone"+
                "\n5. Auriculares inalambricos"+
                "\n6. Menu");
        seleccion=entrada.nextInt();
        switch(seleccion){ // switch de dispositivios
            case 1: System.out.println("\n****** Tipo de Dispositivo: Computadora Portatil ******");
                System.out.println("\n///// Acciones que puede realizar /////");
                System.out.println("\n1. Tomar Foto"+"\n2. Copiar Texto"+"\n3. Pegar Texto"+
                        "\n4. Compartir Documentos"+"\n5. Reproducir Musica");
                seleccion=entrada.nextInt();
                switch(seleccion){
                    case 1: dispositivoC.tomarFotoCompou(admPhone, admCompu);
                        break;
                    case 2: dispositivoC.copiarTextoCompu(admCompu);
                        break;
                    case 3: dispositivoC.pegarTextoCompu(admCompu);
                        break;
                    case 4: dispositivo.compartirDocumetos(admCompu, admPhone, admWatch, admTablet);
                        break;
                    case 5: dispositivo.reproducirMusica(admCompu, admPhone, admWatch, admTablet);
                        break;
                    case 6: menu.main();
                        break;
                    default: System.out.println("!!! Seleccion incorrecta intentelo de nuevo !!!!");
                        break;
                
                }
                break;
            case 2: System.out.println("Tipo de Dispositivo: Tablet");
            System.out.println("\n///// Acciones que puede realizar /////");
            System.out.println("\n1. Tomar Foto"+"\n2. Copiar Texto"+"\n3. Pegar Texto"+
                    "\n4. Compartir Documentos"+"\n5. Reproducir Musica");
            seleccion=entrada.nextInt();
            switch(seleccion){
                case 1: dispositivoT.tomarFotoTablet(admPhone, admTablet);
                break;
                case 2: dispositivoT.copiarTextoTablet(admTablet);
                break;
                case 3: dispositivoT.pegarTextoTablet(admTablet);
                break;
                case 4: dispositivoT.compartirDocumetos(admCompu, admPhone, admWatch, admTablet);
                break;
                case 5: dispositivoT.reproducirMusica(admCompu, admPhone, admWatch, admTablet);
                break;
                case 6: menu.main();
                break;
                default: System.out.println("!!! Seleccion incorrecta intentelo de nuevo !!!!");
                break;                
            }
                break;
            case 3:System.out.println("Tipo de Dispositivo: Smartwatch");
            System.out.println("\n///// Acciones que puede realizar /////");
            System.out.println("\n1. Tomar Foto"+"\n2. Copiar Texto"+"\n3. Pegar Texto"+
                    "\n4. Compartir Documentos"+"\n5. Reproducir Musica");
            seleccion=entrada.nextInt();
            switch(seleccion){
                case 1: dispositivoW.tomarFotoWatch(admPhone, admWatch);
                break;
                case 2: dispositivoW.copiarTextoWatch(admWatch);
                break;
                case 3: System.out.println("\n!!! Accion no soportada !!!");
                break;
                case 4: System.out.println("\n!!! Accion no soportada !!!");
                break;
                case 5: dispositivo.reproducirMusica(admCompu, admPhone, admWatch, admTablet);
                break;
                case 6: menu.main();
                break;
                default: System.out.println("!!! Seleccion incorrecta intentelo de nuevo !!!!");
                break;                
            }
                break;
            case 4: System.out.println("Tipo de Dispositivo: Smartphone");
            System.out.println("\n///// Acciones que puede realizar /////");
            System.out.println("\n1. Tomar Foto"+"\n2. Copiar Texto"+"\n3. Pegar Texto"+
                    "\n4. Compartir Documentos"+"\n5. Reproducir Musica");
            seleccion=entrada.nextInt();
            switch(seleccion){
                case 1: dispositivoP.tomarFotoPhone(admPhone);
                break;
                case 2: dispositivoP.copiarTextoPhone(admPhone);
                break;
                case 3: dispositivoP.pegarTextoPhone(admPhone);
                break;
                case 4: dispositivo.compartirDocumetos(admCompu, admPhone, admWatch, admTablet);
                break;
                case 5: dispositivo.reproducirMusica(admCompu, admPhone, admWatch, admTablet);
                break;
                case 6: menu.main();
                break;
                default: System.out.println("!!! Seleccion incorrecta intentelo de nuevo !!!!");
                break;
            }
                break;
            case 5: System.out.println("Los auriculares no puede realizar ninguan accion");
                break;
            case 6: menu.main();
                break;
            default: System.out.println("!!! Seleccion Invalida, intentelo de nuevo !!!");
                break;
        }
        
    } // fin accionesDispositivos
    
    public void accionesExternasDispositivo(){
        int n;
        System.out.println("\n****** Acciones Exteternas de Dispositivos *******");
        System.out.println("\nSeleccione el tipo de accion a realizar:");
        System.out.println("\n1. Llamada Telefonica"+"\n2. Mensaje"+"\n3. Notificacion"+"\n4. Menu");
        System.out.println("\n Seleccione la accion a realizar: ");
        n=entrada.nextInt();
        
        switch(n){
            case 1 ->{dispositivoP.llamadaTelefonocia(admPhone, admCompu, admWatch, admTablet);}
            case 2 ->{System.out.println("\n****** Tipos de mensajes *****");
                System.out.println("\n1. Mensaje de Texto"+"\n2. Mensaje por red social"+
                        "\n3. Mensaje por mensajeria Instantanea"+"\n4. Mensaje por Videoconferencia");
                System.out.println("\nSeleccione una opcion: ");
                n=entrada.nextInt();
                switch(n){
                    case 1 ->{mensaje.mensajeTexto(admCompu, admPhone, admWatch, admTablet);}
                    case 2 ->{mensaje.mensajeRedSocial(admCompu, admPhone, admWatch, admTablet);}
                    case 3 ->{mensaje.mensajeInstantaneo(admCompu, admPhone, admWatch, admTablet);}
                    case 4 ->{mensaje.mensajeVideo(admCompu, admPhone, admWatch, admTablet);}
                    default ->{System.out.println("\n !!! Seleccion invalida, intentelo de nuevo !!!");}
                }}
            case 3 ->{System.out.println("\n****** Menu de notificaciones *****");
                System.out.println("\nTipos de notificaciones");
                System.out.println("\n1. Correo Electronico"+"\n2. Evento de Calendario");
                n=entrada.nextInt();
                switch(n){
                    case 1 ->{dispositivo.notificacionCorreo(admCompu, admPhone, admWatch, admTablet);}
                    case 2 ->{dispositivo.notificacionCalendario(admCompu, admPhone, admWatch, admTablet);}
                    default ->{System.out.println("\n !!! Seleccion invalida, intentelo de nuevo !!!");}
                }
            }
            case 4->{menu.main();}
            default ->{System.out.println("\n!!! Seleccion Incorrecta, intentelo de nuevo !!!");}
        }
        
    }
    
    public void cargasMasivas(){
        int numero;
        System.out.println("\n ******* Menu para carga masiva de datos ******");
        System.out.println("\nTipos de cargas: ");
        System.out.println("\n1. Carga de dispositivos"+"\n2. Administrar dispositivos"+
                "\n3. Cargar acciones con dispositivos"+"\n4. Cargar acciones externas de dispositivos");
        System.out.println("\nSeleccione una opcion: ");
        numero=entrada.nextInt();
        switch(numero){
            case 1 ->{carga.cargaDispositivos(admCompu, admPhone, admWatch, admTablet);}
            case 2 ->{}
            case 3 ->{}
            case 4 ->{}
            default ->{System.out.println("\n !!! Seleccion invalida, intentelo de nuevo");}
        }
    }
    
    
    
    
    
 }
