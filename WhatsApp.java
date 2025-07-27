public class WhatsApp implements Chamada
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
        System.out.println("Mensagem encaminhada por WhatsApp.");
        System.out.println(message);
    }
}