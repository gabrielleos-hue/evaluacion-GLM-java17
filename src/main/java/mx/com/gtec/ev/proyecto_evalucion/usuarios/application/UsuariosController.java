package mx.com.gtec.ev.proyecto_evalucion.usuarios.application;

import mx.com.gtec.ev.proyecto_evalucion.usuarios.application.model.Usuario;
import mx.com.gtec.ev.proyecto_evalucion.usuarios.application.model.UsuarioRequest;
import mx.com.gtec.ev.proyecto_evalucion.usuarios.domain.outgoing.UsuarioLogic;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {

    private final UsuarioLogic usuarioService;

    public UsuariosController(UsuarioLogic usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public List<Usuario> listar() {
        return usuarioService.listarUsuarios();
    }

    @PostMapping
    public Usuario crear(@RequestBody UsuarioRequest usuario) {
        return usuarioService.guardarUsuario(usuario);
    }


}
