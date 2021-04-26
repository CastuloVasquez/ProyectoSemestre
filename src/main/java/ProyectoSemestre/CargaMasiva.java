
package ProyectoSemestre;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class CargaMasiva {
    
    ///// OBJETOS ///////
    CrearDispositivo dispositivo=new CrearDispositivo("", "", "", "", true, false, "", "", "", false, "", "", "",false,"","","");
//    ComputadoraPortatil dispositivoC=new ComputadoraPortatil("", "", "", "", true, false, "", "", "", false, "", "", "",false,"","","");
    
    
    ArrayList<CrearDispositivo> nuevoDis;
    
    
    Scanner entrada=new Scanner(System.in);
    public CargaMasiva(){
        nuevoDis=new ArrayList<>();
    }
    
    // carga masiva de dispositivos
    public void cargaDispositivos(ArrayList<ComputadoraPortatil> compu,ArrayList<Smartphone>phone,
            ArrayList<Smartwatch> reloj, ArrayList<Tablet>tablet){
        
        try{
            ArrayList<String[]>lista=new ArrayList<>();
            String directorio;
            System.out.println("\n****** Carga masiva de dispositivos ******");
            System.out.println("\nIngrese el direcotiro del archivo: ");
            directorio=entrada.next();
            
            Scanner input= new Scanner(new File(directorio));
            
            while(input.hasNextLine()){
                String[] line =input.nextLine().split(",");
                lista.add(line);
             } // fin while
            
//            for (int i = 0; i < lista.size(); i++) { // fila 1, posicion 0
//                
//                if(i<=5){ // tiene que ser menor o igual al numero de columnas
//                    
//                    String nombre=lista.get(1)[i]; // ya se lee elemento por elemento, en fila
//                    System.out.println(nombre);
//                    
//                    
//                }
//            }
            agregarPortatil(lista);
            System.out.println("\n****** Dispositivos creados ******");
            mostrarCargaCompu();
            

        }catch (Exception e){
            System.err.println("Ocurrion un error: "+e.getMessage());
        }
    }
    
    // carga masiva de modificaciones
    public void cargaAdministracion(){}
    
    // carga masiva de acciones internas
    public void cargaAccionesInternas(){}
    
    
    // carga masiva de acciones externas
    public void cargaAccionesExternas(){}
    
    
    public void agregarPortatil(ArrayList<String[]> s){
        
        for (int i = 0; i < s.size(); i++) {
            if(s.get(i)[i].equalsIgnoreCase("computadora portail")){
                for (int j = 0; j < s.size(); j++) { // fila 1, posicion 0
//                    if(j<=5){ // tiene que ser menor o igual al numero de columnas
                        String nombre=s.get(i)[4]; // ya se lee elemento por elemento, en fila
                        String correo=s.get(i)[3];
                        String visible=s.get(i)[5];
                        dispositivo=new ComputadoraPortatil(correo, nombre, visible, "",true,false
                                ,"","","",false,"","","",false,"","","");
                        nuevoDis.add(dispositivo);
//                    }
                }
            }
        }
        
        
    } // fin computadoraPortatil
    
    public void mostrarCargaCompu(){
        for(CrearDispositivo c: nuevoDis){
            c.dispositivo();
            System.out.println("");
        }
    }
    
}
