import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> nomes = new ArrayList<>();

        //adiciona elementos a lista add()
        nomes.add("Lucas");
        nomes.add("Dias");
        nomes.add("Cruz");


        //Acessar um elemento get(indice)
        //System.out.println(nomes.get(2));

        //Alterar um item
        nomes.set(2, "Cruzz");
        //System.out.println(nomes);

        //Remover um item da lista
        nomes.add("Maria");
        //System.out.println(nomes);
        //nomes.remove(3);
        //System.out.println(nomes);

        //tamanho da lista
        //System.out.println(nomes.size());

        //apagar lista
        //nomes.clear();
        //System.out.println(nomes);

        //Verefica se existe
        //nomes.contains(nomes)
    }
}
