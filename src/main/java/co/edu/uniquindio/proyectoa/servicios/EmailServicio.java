package co.edu.uniquindio.proyectoa.servicios;

import co.edu.uniquindio.proyectoa.dto.MailDTO;

public interface EmailServicio {
    String enviarCorreo(MailDTO emailDTO) throws Exception;
}
