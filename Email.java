public class Email implements Chamada
{
    String message;

    public void setMessage(String message)
    {
        this.message = message;
    }

    String getMessage()
    {
        return message;
    }
    public void sendMessage()
    {
        System.out.println("E-mail Enviado.");
        System.out.println(message);
    }
}