package it.epicode.MediaPlayer;

// Definizione della classe Immagine che estende la classe Media e implementa l'interfaccia ElementiVisualizzabili
public class Immagine extends Media implements ElementiVisualizzabili {

    // Attributo privato per memorizzare la luminosità dell'immagine
    private int luminosita = 5;

    // Costruttore che accetta il titolo dell'immagine come parametro
    public Immagine(String titolo) {
        // Imposta il titolo dell'immagine utilizzando il metodo setTitolo della classe Media
        this.setTitolo(titolo);
    }

    // Metodo per ottenere la luminosità corrente dell'immagine
    public int getLuminosita() {
        return luminosita;
    }

    // Metodo per visualizzare l'immagine con la luminosità corretta
    public void show() {
        // Stampa il titolo dell'immagine
        System.out.print(this.getTitolo() + ": ");

        // Stampa un numero di asterischi corrispondente alla luminosità dell'immagine
        for (int i = 0; i < this.getLuminosita(); i++) {
            System.out.print("*");
        }

        // Vai alla riga successiva
        System.out.println();
    }

    // Metodo per aumentare la luminosità dell'immagine
    @Override
    public void alzaLum() {
        // Verifica se la luminosità è inferiore al massimo (100)
        if (this.getLuminosita() < 100) {
            // Incrementa la luminosità
            luminosita++;
        } else {
            // Stampa un messaggio se la luminosità è già al massimo
            System.out.println("Luminosità al massimo");
        }
    }

    // Metodo per diminuire la luminosità dell'immagine
    @Override
    public void abbassaLum() {
        // Verifica se la luminosità è superiore al minimo (0)
        if (this.getLuminosita() > 0) {
            // Decrementa la luminosità
            luminosita--;
        } else {
            // Stampa un messaggio se la luminosità è già al minimo
            System.out.println("Luminosità al minimo");
        }
    }
}

