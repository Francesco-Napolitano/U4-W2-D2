package Es3;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Rubrica {
    private static Map <String, String> rubrica = new HashMap<>();

    //1 metodo per inserire un contatto in rubrica
    public static void aggiungiContatto (String nome, String telefono){
        rubrica.put(nome,telefono);
    }
    //2 cancella un contatto
    public static void eliminaContatto (String nome){
        rubrica.remove((nome));
    }

    //3 ricerca di una persona con il telefono
    private static void trovaPersonaNome (String telefono){
        for(String nome : rubrica.keySet()){
            if (Objects.equals(nome, telefono)) {
                System.out.println("Telefono trovato, per " + nome);
                return;
            }
        }
    }

    //4 ricerca di un telefono a partire dalla persona
    private static void trovaNumeroTelefono (String nome){
        String telefono = rubrica.get(nome);
        if (telefono != null) System.out.println("Ecco: " + telefono);
        else System.out.println("Non presente in rubrica. ");
    }

    //5 stampa i contatti in rubrica
    private static void stampaRubrica(){
        for (String nome : rubrica.keySet()) System.out.println(nome + rubrica.get(nome));
    }
}
