package mx.com.gtec.ev.proyecto_evalucion.usuarios.infrastructure.adapter;

import mx.com.gtec.ev.proyecto_evalucion.usuarios.domain.model.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity,Integer> {
}
