package mx.com.gtec.ev.proyecto_evalucion.usuarios.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import mx.com.gtec.ev.proyecto_evalucion.common.domain.model.AuditData;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "USUARIOS")
public class UsuarioEntity extends AuditData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long idUsuario;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "EMAIL", unique = true)
    private String correoElectronico;

    @Column(name = "FECHA_NACIMIENTO")
    private Date fechaNacimiento;

}
