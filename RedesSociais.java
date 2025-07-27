public class RedesSociais implements Chamada
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
        System.out.println("Mensagem encaminhada para as Redes Sociais.");
        System.out.println(message);
    }
}