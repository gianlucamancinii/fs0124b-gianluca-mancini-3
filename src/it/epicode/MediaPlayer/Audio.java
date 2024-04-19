package it.epicode.MediaPlayer;

// Definizione della classe Audio che estende Riproducibile
public class Audio extends Riproducibile {

    // Costruttore della classe Audio che accetta titolo e durata come parametri
    public Audio(String titolo, int durata) {
        // Imposta il titolo e la durata dell'audio utilizzando i metodi della classe Riproducibile
        this.setTitolo(titolo);
        this.setDurata(durata);
    }

    // Implementazione del metodo play per riprodurre l'audio
    @Override
    public void play() {
        // Richiama il metodo play della classe padre per eseguire le operazioni comuni
        super.play();

        // Ciclo per la durata dell'audio
        for (int i = 0; i < this.getDurata(); i++) {
            // Stampa il titolo dell'audio
            System.out.print(this.getTitolo());

            // Stampa un numero di punti esclamativi corrispondente al volume dell'audio
            for (int j = 0; j < this.getVolume(); j++) {
                System.out.print("!");
            }

            // Vai alla riga successiva
            System.out.println(".");
        }
    }
}

