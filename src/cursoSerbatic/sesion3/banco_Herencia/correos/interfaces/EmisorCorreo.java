
package cursoSerbatic.sesion3.banco_Herencia.correos.interfaces;

import cursoSerbatic.sesion3.banco_Herencia.correos.clases.Correo;
import cursoSerbatic.sesion3.banco_Herencia.correos.clases.ListaCorreos;
import cursoSerbatic.sesion3.banco_Herencia.tiposUsuario.Usuario;

public interface EmisorCorreo <TipoUsuario extends Usuario>{

    public default boolean enviarCorreo(Usuario usuarioEmisor, String mensaje, Usuario usuarioReceptor, ListaCorreos listaCorreosEnviados){
        if(usuarioReceptor instanceof ReceptorCorreo){
            Correo correo = new Correo(usuarioEmisor, usuarioReceptor, mensaje, false);
            return true;
        }
        return false;
    }
}