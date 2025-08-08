package mx.com.gtec.ev.proyecto_evalucion.usuarios.domain.core;

import lombok.RequiredArgsConstructor;
import mx.com.gtec.ev.proyecto_evalucion.usuarios.application.model.Usuario;
import mx.com.gtec.ev.proyecto_evalucion.usuarios.application.model.UsuarioRequest;
import mx.com.gtec.ev.proyecto_evalucion.usuarios.domain.model.UsuarioEntity;
import mx.com.gtec.ev.proyecto_evalucion.usuarios.domain.outgoing.UsuarioLogic;
import mx.com.gtec.ev.proyecto_evalucion.usuarios.infrastructure.adapter.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UsuarioService implements UsuarioLogic {

    private final UsuarioRepository usuarioRepository;


    private Usuario mapToUsuario(UsuarioEntity entity) {
        Usuario usuario = new Usuario();
        usuario.setCorreo(entity.getCorreoElectronico());
        usuario.setNombre(entity.getNombre());
        usuario.setFechaNacimiento(entity.getFechaNacimiento().toString());
        return usuario;
    }

    public List<Usuario> listarUsuarios() {

        List<Usuario> usrLst = usuarioRepository.findAll().stream()
                .map(this::mapToUsuario)
                .collect(Collectors.toList());

        return usrLst;
    }

    @Override
    public Usuario guardarUsuario(UsuarioRequest usuarioRequest) {
        UsuarioEntity usuario = new UsuarioEntity();

        usuario.setCorreoElectronico(usuarioRequest.getCorreoElectronico());
        UsuarioEntity saved = usuarioRepository.save(usuario);
        return mapToUsuario(saved);
    }


    public Usuario obtenerUsuarioPorId(Integer id) {
        UsuarioEntity usuario = usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado con id: " + id));

        return mapToUsuario(usuario);
    }





}
