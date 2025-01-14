package Es2;

public class Es2Main {
    public static  void main (String[] args){
        NumeriCasuali generatoreRandom = new NumeriCasuali();
        generatoreRandom.nCasuali();
        System.out.println("A capo mostriamo la lista di numeri, ma invertita");
        generatoreRandom.nuovaLista();
        System.out.println("Ed ora scegli se stampare i numeri pari o dispari");
        generatoreRandom.stampaPariDispari();
    }
}
