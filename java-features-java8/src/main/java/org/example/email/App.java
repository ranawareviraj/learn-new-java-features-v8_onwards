package org.example.email;

//import org.apache.commons.mail.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) /*throws EmailException*/ {
//        extracted();
        test();
    }

/*
    private static void extracted() throws EmailException {
        System.out.println("==============TestStart==============");

        Email email = new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("bsadhana401@gmail.com", "Password@1234"));
        email.setSSLOnConnect(true);
        email.setFrom("bsadhana401@gmail.com");
        email.setSubject("TestMail");
        email.setMsg("This is a test mail ... :-)");
        email.addTo("bsadhana401@gmail.com");
        email.send();
        System.out.println("====================EmailSend===============");
    }
*/

    static void test() {
        // Email configuration
        String host = "smtp.gmail.com";
        int port = 465; // Gmail SMTP port
        String username = "<EMAIL>"; // Your Gmail address
        String password = "<PASSWORD>"; // Your Gmail password
        boolean ssl = true;

        // Recipient's email address
        String toAddress = "xpertittesting@gmail.com";

        // Email content
        String subject = "Test Email";
        String message = "This is a test email sent using Apache Commons Email.";
/*
        try {
            // Create the email message
            Email email = new HtmlEmail();
            email.setHostName(host);
            email.setSmtpPort(port);
            email.setAuthenticator(new DefaultAuthenticator(username, password));
            email.setSSLOnConnect(ssl);
            email.setFrom(username);
            email.setSubject(subject);
            email.setMsg(message);
            email.addTo(toAddress);

            // Send the email
            email.send();

            System.out.println("Email sent successfully!");
        } catch (EmailException e) {
            System.err.println("Email sending failed!");
            e.printStackTrace();
        }*/
    }
}

