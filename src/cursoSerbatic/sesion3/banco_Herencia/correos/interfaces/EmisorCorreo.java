
package cursoSerbatic.sesion3.banco_Herencia.correos.interfaces;

import cursoSerbatic.sesion3.banco_Herencia.correos.clases.Correo;
import cursoSerbatic.sesion3.banco_Herencia.tiposUsuario.Usuario;

public interface EmisorCorreo <TipoUsuario extends Usuario>{

    public default boolean enviarCorreo(String mensaje, Usuario usuarioReceptor){
        if(usuarioReceptor instanceof ReceptorCorreo){
            Correo correo = new Correo(usuarioReceptor, (TipoUsuario) this, mensaje);
            return true;
        }
        return false;
    }
}