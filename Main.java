/*
1 - Escreva um código para enviar mensagens de marketing, para isso você deve ter a possibilidade de enviar
    a mesma mensagem para serviços diferentes, esses serviços devem ter um método para receber a mensagem
    como parâmetro, os serviços que devem estar disponíveis são:

    SMS;
    E-mail;
    Redes Sociais;
    WhatsApp;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
 */


// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
   public static void main(String [] args)
    {
        var sms = new SMS();
        var email = new Email();
        var redesSociais = new RedesSociais();
        var whatsApp = new WhatsApp();

        sms.setMessage("SMS");
        sms.sendMessage();

        email.setMessage("Email");
        email.sendMessage();

        redesSociais.setMessage("Instagram");
        redesSociais.sendMessage();

        whatsApp.setMessage("WhatsApp");
        whatsApp.sendMessage();

    }
}
