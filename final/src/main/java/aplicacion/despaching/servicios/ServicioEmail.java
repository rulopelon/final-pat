package aplicacion.despaching.servicios;


import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;


@Component
public class ServicioEmail{

    @Autowired
    private JavaMailSender emailSender;

    public void enviarEmail(String email,String destinatario,String subject,String texto){
		MimeMessage message = emailSender.createMimeMessage();
	     
	    MimeMessageHelper helper;
		try {
			helper = new MimeMessageHelper(message, true);
		
	    
			helper.setFrom(email);
			helper.setTo(destinatario);
			helper.setSubject(subject);
			helper.setText(texto);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        emailSender.send(message);
    }

	
}