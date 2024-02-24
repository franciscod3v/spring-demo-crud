package com.franciscod3v.model.dto;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDto implements Serializable {
    private Integer idCliente;
    private String nombre;
    private String apellido;
    private String correo;
    private Date fechaRegistro;

}
