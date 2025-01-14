package Es2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumeriCasuali {
    private int numeroScelto;
    private List <Integer> listaCasuali;

    public NumeriCasuali(){
        this.listaCasuali= new ArrayList<Integer>();
    }

    void nCasuali (){
        System.out.println("Inserisci quanti numeri casuali vuoi che vengano generati.");
        Scanner myScanner = new Scanner(System.in);
        numeroScelto = myScanner.nextInt();
        myScanner.nextLine();
        for (int i =0; i< numeroScelto; i++){
            int nScelto = (int) (Math.random() * 101);
            listaCasuali.add(nScelto);
            System.out.println(nScelto);
        }
    }

    void nuovaLista (List <Integer> n){
        n = listaCasuali;
    }


}
