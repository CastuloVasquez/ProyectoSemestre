
package ProyectoSemestre;

import java.util.ArrayList;

public class AccionesDispositivos {
    private String palabra;
    private String noVisible;
    private String nombreBuscar;
    private String documento;
    private String cancion;
    private String textoMensaje;
    private String nombreRedSocial;
    private String nombreAplicacionMensajeria;
    private String nombreAplicacionVideo;
    private String nombrePersonaMensaje;
    
    public AccionesDispositivos(String palabra, String noVisible, String nombreBuscar,
            String documento, String cancion, String textoMensaje, String nombreRedSocial,
            String nombreAplicacionMensajeria, String nombreAplicacionVideo, String nombrePersonaMensaje){
        this.palabra=palabra;
        this.noVisible=noVisible;
        this.nombreBuscar=nombreBuscar;
        this.documento=documento;
        this.cancion=cancion;
        this.textoMensaje=textoMensaje;
        this.nombreRedSocial=nombreRedSocial;
        this.nombreAplicacionMensajeria=nombreAplicacionMensajeria;
        this.nombreAplicacionVideo=nombreAplicacionVideo;
        this.nombrePersonaMensaje=nombrePersonaMensaje;
    }

    public String getNombreRedSocial() {
        return nombreRedSocial;
    }

    public void setNombreRedSocial(String nombreRedSocial) {
        this.nombreRedSocial = nombreRedSocial;
    }

    public String getNombreAplicacionMensajeria() {
        return nombreAplicacionMensajeria;
    }

    public void setNombreAplicacionMensajeria(String nombreAplicacionMensajeria) {
        this.nombreAplicacionMensajeria = nombreAplicacionMensajeria;
    }

    public String getNombreAplicacionVideo() {
        return nombreAplicacionVideo;
    }

    public void setNombreAplicacionVideo(String nombreAplicacionVideo) {
        this.nombreAplicacionVideo = nombreAplicacionVideo;
    }

    public String getNombrePersonaMensaje() {
        return nombrePersonaMensaje;
    }

    public void setNombrePersonaMensaje(String nombrePersonaMensaje) {
        this.nombrePersonaMensaje = nombrePersonaMensaje;
    }
    
    public String getTextoMensaje() {
        return textoMensaje;
    }

    public void setTextoMensaje(String textoMensaje) {
        this.textoMensaje = textoMensaje;
    }
    
    public String getCancion() {
        return cancion;
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }
    
    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
    
    
    public String getNombreBuscar() {
        return nombreBuscar;
    }

    public void setNombreBuscar(String nombreBuscar) {
        this.nombreBuscar = nombreBuscar;
    }
    
    public void setNoVisible(String noVisible) {
        this.noVisible = noVisible;
    }
    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    
    public String getNoVisible(){
        return noVisible;
    }
    
    
    
    
    
    
}
