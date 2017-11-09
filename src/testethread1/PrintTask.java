package testethread1;

import java.util.Random;

public class PrintTask implements Runnable {
    
    private final int TEMPO_DORMIR; // Tempo de adormecimento da thread
    private final String NOME; // Nome da thread
    private final static Random GERADOR = new Random ();
    
    public PrintTask (String nome) {
        NOME = nome; // Configura o nome 
        
        // O tempo de dormir é aleatório entre 0 e 5 segundos
        TEMPO_DORMIR = GERADOR.nextInt (5000);
    }

    @Override
    public void run() {
        
        try {
            // Mensagem informando que a thread vai dormir
            System.out.printf ("%s indo dormir por %d segundos.\n", NOME, TEMPO_DORMIR/1000);
            
            // Coloca a thread para dormir por TEMPO_DORMIR/1000 segundos
            Thread.sleep (TEMPO_DORMIR);
            
        } catch (Exception e) {
            
            System.out.printf ("%s terminou por interrupção!\n", NOME);
            
        }
        
        // Imprime a mensagem que a thread acordou!
        System.out.printf ("%s acordou!\n", NOME);
        
    }
    
}
