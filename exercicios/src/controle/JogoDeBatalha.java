package controle;
import java.util.Random;

public class JogoDeBatalha {
    public static void main(String[] args) {
        // Definindo os atributos dos jogadores
        int forcaJogador1 = 100;
        int defesaJogador1 = 50;
        int vidaJogador1 = 200;
        
        int forcaJogador2 = 120;
        int defesaJogador2 = 40;
        int vidaJogador2 = 180;
        
        Random rand = new Random();
        
        // Simulando a batalha até um dos jogadores perder
        while (vidaJogador1 > 0 && vidaJogador2 > 0) {
            // Jogador 1 ataca jogador 2
            int danoJogador1 = rand.nextInt(forcaJogador1);
            int danoCausadoJogador2 = danoJogador1 - defesaJogador2;
            if (danoCausadoJogador2 > 0) {
                vidaJogador2 -= danoCausadoJogador2;
                System.out.println("Jogador 1 atacou Jogador 2 e causou " + danoCausadoJogador2 + " de dano.");
            } else {
                System.out.println("Jogador 1 atacou Jogador 2, mas não causou dano.");
            }
            
            // Verifica se Jogador 2 ainda está vivo
            if (vidaJogador2 <= 0) {
                System.out.println("Jogador 1 venceu!");
                break;
            }
            
            // Jogador 2 ataca jogador 1
            int danoJogador2 = rand.nextInt(forcaJogador2);
            int danoCausadoJogador1 = danoJogador2 - defesaJogador1;
            if (danoCausadoJogador1 > 0) {
                vidaJogador1 -= danoCausadoJogador1;
                System.out.println("Jogador 2 atacou Jogador 1 e causou " + danoCausadoJogador1 + " de dano.");
            } else {
                System.out.println("Jogador 2 atacou Jogador 1, mas não causou dano.");
            }
            
            // Verifica se Jogador 1 ainda está vivo
            if (vidaJogador1 <= 0) {
                System.out.println("Jogador 2 venceu!");
                break;
            }
        }
    }
}
