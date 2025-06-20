package questoes_extra_casa.batalha_robos;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Robo> listRobos = new ArrayList<>();//usando polimorfismo de list

        try {
            // intancia pra poder usar get direto, se precisar dps e melhor reuso
            Robo r1 = new RoboArena("Titan", "Ataque", "100");
            Robo r2 = new RoboArena("Guardian", "Defesa", "80");
            Robo r3 = new RoboArena("Medic", "Suporte", "60");

            listRobos.add(r1);
            listRobos.add(r2);
            listRobos.add(r3);

             for (Robo robo : listRobos) {
                System.out.println("Robô: " + robo.getNome() + ", Tipo: " + robo.getTipo() + ", Energia: " + robo.getEnergia());
                robo.executarAcao();
                System.out.println("-------------------");
            }

            Robo rInvalido = new RoboArena("Bug", "Explorador", "50");
                listRobos.add(rInvalido);
        } catch (AcaoInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
}
