package com.romansg.curso3semana4.pojo;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * Created by roman on 24/03/18.
 */

public class SendMailTask extends AsyncTask<String, Void, Void> {
    private Context context;

    public SendMailTask(Context context) {
        this.context = context;
    }

    @Override
    protected Void doInBackground(String... params) {
        String username = MailConf.USER;
        String password = MailConf.PASSWORD;

        String subject = params[0];
        String recipient = params[1];
        String text = params[2];

        Properties props = new Properties();

        props.setProperty("mail.smtp.ssl.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");

        Session session = Session.getInstance(props);
        MimeMessage msg = new MimeMessage(session);

        try {
            msg.setFrom("roman.a.s.g@gmail.com");
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient, false));
            msg.setSubject(subject);
            msg.setText(text);
            msg.setHeader("X-Mailer", "Petagram");
            msg.setSentDate(new Date());

            Transport.send(msg, username, password);
        } catch (MessagingException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);

        Toast.makeText(context, "Mensaje enviado", Toast.LENGTH_SHORT).show();
    }
}
