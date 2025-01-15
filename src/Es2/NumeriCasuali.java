package Es2;

import java.util.*;

public class NumeriCasuali {
    private int numeroScelto;
    private List<Integer> listaCasuali;

    public NumeriCasuali() {
        this.listaCasuali = new ArrayList<Integer>();
    }

    void nCasuali() {
        System.out.println("Inserisci quanti numeri casuali vuoi che vengano generati.");
        Scanner myScanner = new Scanner(System.in);
        numeroScelto = myScanner.nextInt();
        myScanner.nextLine();
        for (int i = 0; i < numeroScelto; i++) {
            int nScelto = (int) (Math.random() * 101);
            listaCasuali.add(nScelto);
            System.out.println(nScelto);
        }
    }

    void nuovaLista() {
        Collections.reverse(listaCasuali);
        System.out.println(listaCasuali);
    }

    void stampaPariDispari() {
        Scanner myScanner = new Scanner(System.in);
        boolean c = myScanner.nextBoolean();
        for (int i = 0; i < listaCasuali.size(); i++) {
            if (c && i % 2 == 0) System.out.println("Indice pari, " + listaCasuali.get(i));
            else if (c) System.out.println("Indice dispari, " + listaCasuali.get(i));
        }
    }
}
