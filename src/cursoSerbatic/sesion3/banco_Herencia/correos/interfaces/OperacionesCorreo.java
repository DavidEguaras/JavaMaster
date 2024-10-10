package cursoSerbatic.sesion3.banco_Herencia.correos.interfaces;

import cursoSerbatic.sesion3.banco_Herencia.tiposUsuario.Cliente;
import cursoSerbatic.sesion3.banco_Herencia.tiposUsuario.Usuario;

public interface OperacionesCorreo extends EmisorCorreo<Usuario>, ReceptorCorreo<Usuario> {
}
