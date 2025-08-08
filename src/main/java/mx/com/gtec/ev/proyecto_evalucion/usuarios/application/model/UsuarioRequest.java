package mx.com.gtec.ev.proyecto_evalucion.usuarios.application.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Clase que representa una solicitud de usuario.
 * Esta clase puede ser utilizada para encapsular los datos necesarios
 * al crear o actualizar un usuario en el sistema.
 */
@Getter
@Setter
public class UsuarioRequest {


    private String correoElectronico;


}
