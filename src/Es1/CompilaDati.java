package Es1;

import java.util.*;

public class CompilaDati {
    private int numero;
    private final Set<String> parole;
    private final Set<String> paroleDuplicate;

     public CompilaDati (){
         this.parole = new HashSet<>();
         this.paroleDuplicate = new HashSet<>();
     }

     public void inserimentoDati(){
         System.out.print("Inserisci il numero di elementi da inserire: ");
         Scanner myScanner = new Scanner(System.in);
         numero = myScanner.nextInt();
         myScanner.nextLine();
         System.out.println("Inserisci ora gli elementi da aggiungere alla lista. ");
         for (int i= 0; i< numero; i++){
             System.out.println("Inserisci la parola: ");
             String parolaAggiunta = myScanner.nextLine();
             if(!parole.add(parolaAggiunta)){
                 paroleDuplicate.add(parolaAggiunta);
             }
         }
         System.out.println("Queste sono le parole duplicate: " + paroleDuplicate);
         System.out.println("Hai stampato le seguenti parole: " + parole);
         System.out.println("In tutto sono " + numero + " parole.");
     }
}
