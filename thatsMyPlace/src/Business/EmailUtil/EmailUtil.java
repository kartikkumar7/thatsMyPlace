/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EmailUtil;

import java.util.*;  
import javax.mail.*;  
import javax.mail.internet.*;  
import javax.activation.*;  


public class EmailUtil {
    
    /**
     * Test for send email.
     * @param args 
     */
//    public static void main(String[] args) {
//        GmailSender("kartikkumar403@gmail.com","thatsMyPlaceApp", "Hi KK, Congratulations!!");
//    }
    
    private static void GmailSSL(Properties props) {
        final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
        props.put("mail.debug", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.ssl.enable", "true");
        props.put("mail.smtp.socketFactory.class", SSL_FACTORY);
        props.put("mail.smtp.port", "465");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.auth", "true");
    }
 
    // Gmail TLS authentication
    private static void GmailTLS(Properties props) {
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
    }
 
    /*
     * Send email through Gmail
     */
    public static void GmailSender(String toEmail, String sub, String body) {
 
        // Get a Properties object
        Properties props = new Properties();
        
        // Choose for SSL
        GmailSSL(props);
 
        final String username = "thatsmyplaceapp@gmail.com";  // Gmail username
        final String password = "thatsmyplace5100";  // Password
        
        Session session = Session.getDefaultInstance(props,
                new Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });
        
        // Create a new message
        Message msg = new MimeMessage(session);
        
        // Set the FROM and TO fields
        try {
            
            msg.setFrom(new InternetAddress(username));
            msg.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(toEmail));
            msg.setSubject(sub);
            msg.setText(body);
            msg.setSentDate(new Date());
            Transport.send(msg);
            
        } catch (AddressException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
            e.printStackTrace();
        }
 
        System.out.println("Message sent.");
    }

}
