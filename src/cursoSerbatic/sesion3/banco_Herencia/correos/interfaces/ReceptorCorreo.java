
package cursoSerbatic.sesion3.banco_Herencia.correos.interfaces;

import cursoSerbatic.sesion3.banco_Herencia.tiposUsuario.Usuario;

public interface ReceptorCorreo <T extends Usuario>{
    public default void recibirCorreo(){

    }
}
