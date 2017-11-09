package testethread1;

public class TesteThread1 {

    public static void main(String[] args) {
        
        // Mensagem informando que as threads serão criadas
        System.out.println ("Criando as threads...");
        
        // Cria cada uma das threads
        Thread thread1 = new Thread (new PrintTask ("Thread 1"));
        Thread thread2 = new Thread (new PrintTask ("Thread 2"));
        Thread thread3 = new Thread (new PrintTask ("Thread 3"));
        Thread thread4 = new Thread (new PrintTask ("Thread 4"));
        Thread thread5 = new Thread (new PrintTask ("Thread 5"));
        
        // Mensagem informando que as threads foram criadas
        System.out.println ("As threads foram criadas...");
        
        // Inicia cada thread e coloca em execução
        thread1.start ();
        thread2.start ();
        thread3.start ();
        thread4.start ();
        thread5.start ();
        
        // Mensagem informando que as threads iniciaram e main terminou
        System.out.println ("As threads iniciaram, mas main() terminou!");
        
    }
    
}
