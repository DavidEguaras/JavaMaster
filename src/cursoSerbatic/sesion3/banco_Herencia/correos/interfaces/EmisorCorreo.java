
package cursoSerbatic.sesion3.banco_Herencia.correos.interfaces;

import cursoSerbatic.sesion3.banco_Herencia.correos.clases.Correo;
import cursoSerbatic.sesion3.banco_Herencia.correos.clases.ListaCorreos;
import cursoSerbatic.sesion3.banco_Herencia.tiposUsuario.Usuario;

public interface EmisorCorreo <TipoUsuario extends Usuario>{
    public default boolean enviarCorreo(Usuario usuarioEmisor, ListaCorreos correosEnviados, String asunto, String mensaje, Usuario usuarioReceptor){
        if(usuarioEmisor.puedeRecibirCorreo()){
            Correo correo = new Correo(usuarioEmisor, usuarioReceptor, asunto, mensaje, false);
            usuarioEmisor.getCorreosEnviados().agregarCorreo(correo);
            usuarioReceptor.getCorreosRecibidos().agregarCorreo(correo);
            return true;
        }
        return false;
    }
}