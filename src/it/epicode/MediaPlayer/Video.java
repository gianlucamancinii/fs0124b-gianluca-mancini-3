package it.epicode.MediaPlayer;

// Import necessario per utilizzare System.out.println
import java.sql.SQLOutput;

// Definizione della classe Video che estende Riproducibile e implementa ElementiVisualizzabili
public class Video extends Riproducibile implements ElementiVisualizzabili{

    // Attributo privato per memorizzare la luminosità del video
    private int luminosita =5;

    // Costruttore della classe Video che accetta titolo e durata come parametri
    public Video(String titolo, int durata){
        // Imposta il titolo e la durata del video utilizzando i metodi della classe Riproducibile
        this.setTitolo(titolo);
        this.setDurata(durata);
    }

    // Metodo per ottenere la luminosità del video
    public int getLuminosita() {
        return luminosita; // Restituisce la luminosità attuale del video
    }

    // Metodo per visualizzare il video con la luminosità corretta
    public void show() {
        // Stampa il titolo del video
        System.out.print(this.getTitolo());

        // Stampa un numero di asterischi corrispondente alla luminosità del video
        for (int i = 0;  i<this.getLuminosita(); i++){
            System.out.print("*");
        }
    }

    // Implementazione del metodo play per riprodurre il video
    @Override
    public void play() {
        // Ciclo per la durata del video
        for (int i=0; i<this.getDurata(); i++){
            // Stampa il titolo del video seguito da un trattino
            System.out.print(this.getTitolo() + " - ");

            // Stampa un numero di punti esclamativi corrispondente al volume del video
            for (int j = 0; j <this.getVolume(); j++){
                System.out.print("!");
            }

            // Stampa un trattino
            System.out.print(" - ");

            // Stampa un numero di asterischi corrispondente alla luminosità del video
            for (int k=0; k<this.getLuminosita(); k++){
                System.out.print("*");
            }

            // Vai alla riga successiva
            System.out.println(".");
        }
    }

    // Metodo per aumentare la luminosità del video
    @Override
    public void alzaLum() {
        // Verifica se la luminosità è inferiore a 100
        if (this.getLuminosita()<100){
            luminosita++; // Incrementa la luminosità
        }
        else {
            // Stampa un messaggio se la luminosità è già al massimo
            System.out.println("Luminosità al massimo");
        }
    }

    // Metodo per diminuire la luminosità del video
    @Override
    public void abbassaLum() {
        // Verifica se la luminosità è maggiore di 0
        if (this.getLuminosita()>0){
            luminosita--; // Decrementa la luminosità
        }
        else {
            // Stampa un messaggio se la luminosità è già al minimo
            System.out.println("Luminosità al minimo");
        }
    }
}
