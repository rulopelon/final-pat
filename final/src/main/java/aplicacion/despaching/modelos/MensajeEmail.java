package aplicacion.despaching.modelos;

public class MensajeEmail {
	private String From;
	private String To;
	private String Subject;
	private String Text;
	
	public MensajeEmail(String from, String to, String subject, String text) {
		From = from;
		To = to;
		Subject = subject;
		Text = text;
	}
	public String getFrom() {
		return From;
	}
	public void setFrom(String from) {
		From = from;
	}
	public String getTo() {
		return To;
	}
	public void setTo(String to) {
		To = to;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public String getText() {
		return Text;
	}
	public void setText(String text) {
		Text = text;
	}
	
}
