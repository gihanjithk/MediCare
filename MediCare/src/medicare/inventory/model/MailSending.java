/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicare.inventory.model;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import jakarta.mail.*;
import jakarta.activation.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMultipart;
import java.io.File;
import javax.swing.JTable;
import medicare.inventory.gui.InventoryOrder;

/**
 *
 * @author AN
 */
public class MailSending {

    public static void sendMail(String recepient,JTable table) throws Exception {
        System.out.println("prepair message");

        Properties properties = new Properties();

        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.transport.protocol", "smtp");

//        String Myaccount = "medicare.official2024@gmail.com";
//        String password = "cyberunity";
        String Myaccount = "gihanjithk@gmail.com";
        String password = "zjkh pfcj ngbl jpoy";

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(Myaccount, password);

            }

        });

        // Debugging
        session.setDebug(true);
        Message message = prepareMessege(session, Myaccount, recepient,table);

        if (message != null) {
            Transport.send(message);
            System.out.println("Message sent successfully!");
        } else {
            System.out.println("Message preparation failed.");
        }
    }

    private static Message prepareMessege(Session session, String myaccountemail, String recepiant,JTable table) {

        try {
            Message message = new jakarta.mail.internet.MimeMessage(session);
            message.setFrom(new jakarta.mail.internet.InternetAddress(myaccountemail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepiant));
            message.setSubject("MEdicare+ Order Request");
            
             // HTML content
            String htmlContent = generateHTMLFromJTable(table);
                    

            // Set the content type to HTML
            message.setContent(htmlContent, "text/html");
            
            return message;
        } catch (Exception ex) {
            Logger.getLogger(MailSending.class.getName()).log(Level.SEVERE, null, ex);

        }
        return null;

    }
    private static String generateHTMLFromJTable(JTable table) {
        StringBuilder html = new StringBuilder();

        html.append("<html>");
        html.append("<body>");
        html.append("<h2>JTable Data</h2>");
        html.append("<table border='1' style='border-collapse: collapse; width: 100%;'>");

        // Add table headers
        html.append("<thead><tr>");
        for (int col = 0; col < table.getColumnCount(); col++) {
            html.append("<th style='padding: 8px;'>").append(table.getColumnName(col)).append("</th>");
        }
        html.append("</tr></thead>");

        // Add table rows
        html.append("<tbody>");
        for (int row = 0; row < table.getRowCount(); row++) {
            html.append("<tr>");
            for (int col = 0; col < table.getColumnCount(); col++) {
                html.append("<td style='padding: 8px;'>")
                        .append(table.getValueAt(row, col))
                        .append("</td>");
            }
            html.append("</tr>");
        }
        html.append("</tbody>");

        html.append("</table>");
        html.append("</body>");
        html.append("</html>");

        return html.toString();
    }

}
