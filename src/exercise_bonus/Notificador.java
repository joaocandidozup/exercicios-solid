package exercise_bonus;

public class Notificador implements INotificador {

    public void enviarNotificacao(String mensagem) {
        System.out.println("Notificação: " + mensagem);
    }
}