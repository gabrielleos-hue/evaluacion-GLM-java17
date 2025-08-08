package mx.com.gtec.ev.proyecto_evalucion.usuarios.application;

import mx.com.gtec.ev.proyecto_evalucion.usuarios.application.model.Usuario;
import mx.com.gtec.ev.proyecto_evalucion.usuarios.application.model.UsuarioRequest;
import mx.com.gtec.ev.proyecto_evalucion.usuarios.domain.outgoing.UsuarioLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UsuariosController {

    @Autowired
    private UsuarioLogic usuarioService;


    @RequestMapping(value = "/usuarios", method = RequestMethod.GET)
    @ResponseBody
    public List<Usuario> listar() {
        return usuarioService.listarUsuarios();
    }

    @RequestMapping(value = "/usuarios", method = RequestMethod.POST)
    @ResponseBody
    public Usuario crear(@RequestBody UsuarioRequest usuario) {
        return usuarioService.guardarUsuario(usuario);
    }


}
