package mx.com.gtec.ev.proyecto_evalucion.usuarios.domain.outgoing;

import mx.com.gtec.ev.proyecto_evalucion.usuarios.application.model.Usuario;
import mx.com.gtec.ev.proyecto_evalucion.usuarios.application.model.UsuarioRequest;

import java.util.List;

public interface UsuarioLogic {

    List<Usuario> listarUsuarios();

    Usuario guardarUsuario(UsuarioRequest usuarioRequest);

    Usuario obtenerUsuarioPorId(Integer id);


}
