public class SMS implements Chamada
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
        System.out.println("SMS Enviado.");
        System.out.println(message);
    }
}