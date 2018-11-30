package Demo;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Send_Email {
public static void main(String[] args) throws EmailException {
	System.out.println("=====Test Started======");
	sent_email();
	System.out.println("=====Email Sent======");
}

public static void sent_email() throws EmailException {
	Email email = new SimpleEmail();
	email.setHostName("smtp.gmail.com");
	email.setSmtpPort(465);
	email.setAuthenticator(new DefaultAuthenticator("mani20994@gmail.com", "pushpamani"));
	email.setSSLOnConnect(true);
	email.setFrom("mani20994@gmail.com");
	email.setSubject("Selenium test report");
	email.setMsg("This is a test mail from selenium");
	email.addTo("mani20994@gamil.com");
	email.send();
	
	
	
	
	
}
}

