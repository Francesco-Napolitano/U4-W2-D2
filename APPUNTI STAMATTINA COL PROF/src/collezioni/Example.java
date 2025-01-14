package collezioni;

import java.util.*; //importo tutto il contenuto del package

public class Example {

/*
* Jav collections : framework per gestire organizzare e lavorare dati raggruppati
* vivono dentro java.util (package)
* Collection : la radice, l'interfaccia padre
* implementata da: List, Set e Queue
* List : ho un ordine, permette duplicati, ogni elemento può essere raggiunto da indice - dimensione dinamica
* ArrayList e LinkedList
* uso le liste quando ho bisogno di accedere a dati attraverso un indice
* */

    public static void main (String[] args) {

        //creo una lista -> oggetto di tipo List
        List<String> studenti = new ArrayList<String>(); //chiamndo il costruttore di ArrayList (CLASSE)
        //studenti è un oggetto di tipo ArrayList, è un'istanza di ArrayList

        //studenti.add è un metodo offerto dalla classe ArrayList
        //avrò a disposizione una lista di Stringhe chiamata studenti
        studenti.add("Valentina"); //ho aggiunto alla lista una Stringa
        studenti.add("Giulio");
        studenti.add("Anna");
        studenti.add("Patricia");
        studenti.add(2,"Gabriele"); //aggiungo ad una posizione ben specifica
        studenti.remove(1); //Rimuove un elemento alla posizione specificata
        //stampo la dimensione della lista
        System.out.println("Nella lista dei studenti hai "+ studenti.size() + "persone"); // quanti elementi ho nella lista
        System.out.println("---");
        System.out.println("---");
        //voglio stampare il 3 studente
        System.out.println("elemento terza posizioni pari a: "+studenti.get(3)); //get restituisce elemento i-esimo della lista
        //voglio stampare la lista di studenti
        //utilizzo un for each (per ogni)
        for (String studente : studenti) {  //per ogni iterazione contiene lo studente i esimo della lista
            System.out.println(studente);
        }
        System.out.println("---");
        System.out.println("---");
       /* for (int i=0; i<studenti.size();i++)
            System.out.println(studenti.get(i)); */

        studenti.remove("Patricia");    //posso fare un remove sia per indice sia per oggetto contenuto

        for (String studente : studenti) {  //per ogni iterazione contiene lo studente i esimo della lista
            System.out.println(studente);
        }
        System.out.println("---");
        System.out.println("---");

        //SET
        /*
        * evitare duplicati
        */

        //creo un set
        Set<String> coloriPreferiti = new HashSet<>();

        coloriPreferiti.add("Rosso");
        coloriPreferiti.add("Blu");
        coloriPreferiti.add("Verde");
        coloriPreferiti.add("Rosso");   //provo ad inserire un duplicato
        //non posso fare una get(posizione) su un set - NON ho accesso by indice
        System.out.println("I miei colori preferiti sono:");
        for(String colore : coloriPreferiti) {
            //per ogni iterazione del for avrò colore che è il colore i-esimo dentro l set
            System.out.println(colore);
        }
        System.out.println("----");

        //trasformo un SET in una lista
        List<String> listaColoriPreferiti = new ArrayList<>(coloriPreferiti);
        for(String col : listaColoriPreferiti)
            System.out.println(col);


        //definire una mappa Hashmap
        /*
        * classi WRAPPER (involucro)
        * abbraccia il suo tipo primitivo e offre funzionalità come se fosse un oggetto (trattandolo come oggetto)
        * int -> Integer
        * double -> Double
        * ..
        */
        //ESEMPIO: definire delle Automobili per targa (chiave)
       // Map<String, Automobile> parcoMacchine = HashMap<>();
       // parcoMacchine.put("GB488XX",Autonobile)

        //definisco una mappa dove ho coppia chiave valore, dove la chiave sarà intero e il valore stringa
        Map<Integer, String> elencoNumeri = new HashMap<>();
        elencoNumeri.put(1,"Valore alla posizione 1");  //aggiungo elementi alla Mappa con chiave valore
        elencoNumeri.put(2,"Valore alla posizione 2");
        elencoNumeri.put(3,"Valore alla posizione 3");
        elencoNumeri.put(1,"Valore nuovo"); //sovrascrivo il valore alla chiave 1, perchè mappa non ammette duplicati di chiave
        elencoNumeri.put(4,"Valore alla posizione 2");  //ammette duplicati per contenuto

        elencoNumeri.remove(3); //rimuovo un elemento dalla mappa
        System.out.println("Elementi presenti nella mappa");
        //for each, per ogni elemento presente nella mappa
        for(Map.Entry<Integer,String> valore : elencoNumeri.entrySet()) {
            //valore, inteso come elemento i-esimo della mappa
            //è costituito non solo dal valore, cioè dalla stringa contenuta
            //ma anche dalla chiave
            System.out.println("Chiave: " + valore.getKey() + " contenuto: "+ valore.getValue());
        }

        //coda FIFO First In First Out (quando andate alla posta o a prendere il pane)

        Queue<String> filaAllaPosta = new LinkedList<>();

        filaAllaPosta.add("Francesco"); //il primo della fila
        filaAllaPosta.add("Maria");
        filaAllaPosta.add("Giacomo");   //l'ultimo della fila

        System.out.println("Vediamo come è composta la coda");
        //voglio smaltire la mia coda
        while(!filaAllaPosta.isEmpty()) {   //fino a che ci sono persone in coda
            System.out.println("Servo la persona :" + filaAllaPosta.poll());
        }
        System.out.println("Coda finita, sono stati tutti serviti");

        //poll() rimuove e restituisce elemento in testa - se vuota ritorna null
        //remove() come poll ma se la coda è vuota lancia eccezione
        //peek() restituisce il primo della fila, senza rimuoverlo


    }




}
