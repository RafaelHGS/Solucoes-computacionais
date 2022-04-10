package projetogarrafa;

public class UsaGarrafa {
    public static void main(String[] args) {
        Garrafa cocaCola = new Garrafa();
        
        cocaCola.setCor("Vermelha e Branca");
        cocaCola.setMaterial("Vidro");
        cocaCola.setPreco(8.40f);

        cocaCola.Beber();
    }
}
