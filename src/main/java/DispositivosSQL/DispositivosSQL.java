
package DispositivosSQL;

import ProyectoSemestre.ComputadoraPortatil;
import ProyectoSemestre.Smartphone;
import ProyectoSemestre.Smartwatch;
import ProyectoSemestre.Tablet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javafx.scene.control.TableView;

public class DispositivosSQL {
    
    private String mensaje="";
     
    
    public String agregarCompu(Connection conn,ComputadoraPortatil compu ){
         compu=new ComputadoraPortatil("", "", "", "", true, false, "", "", "", false, "", "", "",false,"","","");
         PreparedStatement pst=null;
         String sql="INSERT INTO ADMINISTRADOR.computadora_portatil (nombre_dispositivo,correo_electronico,visible_para_conexion,estado_dispositivo)"+
                 "VALUES (?,?,?,?)";
         try {
            pst=conn.prepareStatement(sql);
            pst.setString(1,compu.getNombreDispositivo());
            pst.setString(2,compu.getCorreoElectronico());
            pst.setString(3,compu.getVisible());
            pst.setString(4, compu.getEncender());
            mensaje="GUARDADO CORRECTAMENTE";
            pst.execute();
            pst.close();
        } catch (Exception e) {
            mensaje="NO SE PUDO GUARDAR CORRECTAMENTE \n "+e.getMessage();
        }
         return mensaje;
    }
    
    public String agregarPhone(Connection conn, Smartphone phone){
        phone=new Smartphone(0, "","", "", "", false,true, "", "","", false, "", "","","",false,false,"","","");
        PreparedStatement pst=null;
        String sql="INSERT INTO ADMINISTRADOR.smartphone (nombre_dispositivo,correo_electronico,visible_para_conexion,estado_dispositivo)"+
                "VALUES (?,?,?,?)";
        try {
            pst=conn.prepareStatement(sql);
            pst.setString(1,phone.getNombreDispositivo());
            pst.setString(2,phone.getCorreoElectronico());
            pst.setString(3,phone.getVisible());
            pst.setString(4, phone.getEncender());
            mensaje="GUARDADO CORRECTAMENTE";
            pst.execute();
            pst.close();
        } catch (Exception e) {
            mensaje="NO SE PUDO GUARDAR CORRECTAMENTE \n "+e.getMessage();
        }
        return mensaje;
    }
    
    public String agregarWatch (Connection conn, Smartwatch watch){
        watch=new Smartwatch("", "", "", "", true, false, "", "", "", false, "", "", "",false,"","","");
        PreparedStatement pst=null;
        String sql="INSERT INTO ADMINISTRADOR.smartwatch (nombre_dispositivo,correo_electronico,visible_para_conexion,estado_dispositivo)"+
                "VALUES (?,?,?,?)";
        try {
            pst=conn.prepareStatement(sql);
            pst.setString(1,watch.getNombreDispositivo());
            pst.setString(2,watch.getCorreoElectronico());
            pst.setString(3,watch.getVisible());
            pst.setString(4, watch.getEncender());
            mensaje="GUARDADO CORRECTAMENTE";
            pst.execute();
            pst.close();
        } catch (Exception e) {
            mensaje="NO SE PUDO GUARDAR CORRECTAMENTE \n "+e.getMessage();
        }
        return mensaje;
    }
    
    public String agregarTablet(Connection conn, Tablet tablet){
        tablet=new Tablet("", "", "", "", true, false, "", "", "", false, "", "", "",false,"","","");
        PreparedStatement pst=null;
        String sql="INSERT INTO ADMINISTRADOR.tablet (nombre_dispositivo,correo_electronico,visible_para_conexion,estado_dispositivo)"+
                "VALUES (?,?,?,?)";
        try {
            pst=conn.prepareStatement(sql);
            pst.setString(1,tablet.getNombreDispositivo());
            pst.setString(2,tablet.getCorreoElectronico());
            pst.setString(3,tablet.getVisible());
            pst.setString(4, tablet.getEncender());
            mensaje="GUARDADO CORRECTAMENTE";
            pst.execute();
            pst.close();
        } catch (Exception e) {
            mensaje="NO SE PUDO GUARDAR CORRECTAMENTE \n "+e.getMessage();
        }
        return mensaje;
    }
    
    
    public String modificarCompu(Connection conn,ComputadoraPortatil compu ){
        compu=new ComputadoraPortatil("", "", "", "", true, false, "", "", "", false, "", "", "",false,"","","");
         PreparedStatement pst=null;
         String sql="UPDATE ADMINISTARDOR.computadora_portatil SET nombre_dispositivo=?, correo_elctronico=?,visible_para_conexion=?,estado_dispositivo=?"+
                 "WHERE id_computadora=?";
         try {
            pst=conn.prepareStatement(sql);
            pst.setString(1,compu.getNombreDispositivo());
            pst.setString(2,compu.getCorreoElectronico());
            pst.setString(3,compu.getVisible());
            pst.setString(4, compu.getEncender());
            mensaje="MODIFICADO CORRECTAMENTE";
            pst.execute();
            pst.close();
        } catch (Exception e) {
            mensaje="NO SE PUDO MODIFICAR CORRECTAMENTE \n "+e.getMessage();
        }
         return mensaje;
    }
    
    
    public String modificarPhone(Connection conn, Smartphone phone){
        phone=new Smartphone(0, "","", "", "", false,true, "", "","", false, "", "","","",false,false,"","","");
        PreparedStatement pst=null;
        String sql="UPDATE ADMINISTARDOR.smartphone SET nombre_dispositivo=?, correo_elctronico=?,visible_para_conexion=?,estado_dispositivo=?,numero_telefono=?"+
                "WHERE id_computadora=?";
         try {
            pst=conn.prepareStatement(sql);
            pst.setString(1,phone.getNombreDispositivo());
            pst.setString(2,phone.getCorreoElectronico());
            pst.setString(3,phone.getVisible());
            pst.setString(4, phone.getEncender());
            pst.setInt(5, phone.getNumeroTelefono());
            mensaje="MODIFICADO CORRECTAMENTE";
            pst.execute();
            pst.close();
        } catch (Exception e) {
            mensaje="NO SE PUDO MODIFICAR CORRECTAMENTE \n "+e.getMessage();
        }
         return mensaje;
    }
    
    public String modificarWatch(Connection conn, Smartwatch watch){
        watch=new Smartwatch("", "", "", "", true, false, "", "", "", false, "", "", "",false,"","","");
        PreparedStatement pst=null;
        String sql="UPDATE ADMINISTARDOR.smartwatch SET nombre_dispositivo=?, correo_elctronico=?,visible_para_conexion=?,estado_dispositivo=?"+
                "WHERE id_computadora=?";
        try {
            pst=conn.prepareStatement(sql);
            pst.setString(1,watch.getNombreDispositivo());
            pst.setString(2,watch.getCorreoElectronico());
            pst.setString(3,watch.getVisible());
            pst.setString(4, watch.getEncender());
            mensaje="MODIFICAR CORRECTAMENTE";
            pst.execute();
            pst.close();
        } catch (Exception e) {
            mensaje="NO SE PUDO MODIFICAR CORRECTAMENTE \n "+e.getMessage();
        }
        return mensaje;
    
    }
    
    public String modificarTablet(Connection conn, Tablet tablet){
        tablet=new Tablet("", "", "", "", true, false, "", "", "", false, "", "", "",false,"","","");
        PreparedStatement pst=null;
        String sql="UPDATE ADMINISTARDOR.tablet SET nombre_dispositivo=?, correo_elctronico=?,visible_para_conexion=?,estado_dispositivo=?"+
                "WHERE id_computadora=?";
        try {
            pst=conn.prepareStatement(sql);
            pst.setString(1,tablet.getNombreDispositivo());
            pst.setString(2,tablet.getCorreoElectronico());
            pst.setString(3,tablet.getVisible());
            pst.setString(4, tablet.getEncender());
            mensaje="MODIFICAR CORRECTAMENTE";
            pst.execute();
            pst.close();
        } catch (Exception e) {
            mensaje="NO SE PUDO MODIFICAR CORRECTAMENTE \n "+e.getMessage();
        }
        return mensaje;
    
    }
    
    public String eliminarCompu(Connection conn, int id){
        PreparedStatement pst=null;
        String sql="DELETE FROM ADMINISTRADO.computadora_portatil WHERE id_computadora=?";
        try {
            pst=conn.prepareStatement(sql);
            pst.setInt(1, id);
            mensaje="ELIMINADO CORRECTAMENTE";
            pst.execute();
            pst.close();
        } catch (Exception e) {
            mensaje="NO SE PUDE GUARDAR CORRECTAMENTE \n"+e.getMessage();
        }
        return mensaje;
    }
    
    
    public String eliminarPhone(Connection conn, int id){
        PreparedStatement pst=null;
        String sql="DELETE FROM ADMINISTRADO.smartphone WHERE id_computadora=?";
        try {
            pst=conn.prepareStatement(sql);
            pst.setInt(1, id);
            mensaje="ELIMINADO CORRECTAMENTE";
            pst.execute();
            pst.close();
        } catch (Exception e) {
            mensaje="NO SE PUDE GUARDAR CORRECTAMENTE \n"+e.getMessage();
        }
        return mensaje;
    }
    
    public String eliminarWatch(Connection conn, int id){
        PreparedStatement pst=null;
        String sql="DELETE FROM ADMINISTRADO.smartwatch WHERE id_computadora=?";
        try {
            pst=conn.prepareStatement(sql);
            pst.setInt(1, id);
            mensaje="ELIMINADO CORRECTAMENTE";
            pst.execute();
            pst.close();
        } catch (Exception e) {
            mensaje="NO SE PUDE GUARDAR CORRECTAMENTE \n"+e.getMessage();
        }
        return mensaje;
    }
    
    public String eliminarTablet(Connection conn, int id){
        PreparedStatement pst=null;
        String sql="DELETE FROM ADMINISTRADO.tablet WHERE id_computadora=?";
        try {
            pst=conn.prepareStatement(sql);
            pst.setInt(1, id);
            mensaje="ELIMINADO CORRECTAMENTE";
            pst.execute();
            pst.close();
        } catch (Exception e) {
            mensaje="NO SE PUDE GUARDAR CORRECTAMENTE \n"+e.getMessage();
        }
        return mensaje;
    }
    
    
    
    
}
