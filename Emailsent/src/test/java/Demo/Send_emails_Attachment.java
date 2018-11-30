package Demo;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

public class Send_emails_Attachment {
	public static void main(String[] args) throws EmailException {

	  // Create the attachment
	  EmailAttachment attachment = new EmailAttachment();
	  attachment.setPath("C:\\Users\\all\\Desktop");
	  attachment.setDisposition(EmailAttachment.ATTACHMENT);
	  attachment.setDescription("Picture of mani");
	  attachment.setName("Mani");

	  // Create the email message
	  
	  MultiPartEmail email = new MultiPartEmail();
	  email.setHostName("smtp.gmail.com");
	  email.setSmtpPort(465);
	  email.setAuthenticator(new DefaultAuthenticator("mani20994@gmail.com", "pushpamani"));
	  email.addTo("mani20994@gmail.com", "mani");
	  email.setFrom("mani20994@gmail.com", "mani");
	  email.setSubject("The picture");
	  email.setMsg("Here is the picture you wanted");

	  // add the attachment
	  email.attach(attachment);

	  // send the email
	  email.send();
}
}
