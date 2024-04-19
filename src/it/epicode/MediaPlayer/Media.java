package it.epicode.MediaPlayer;

// Definizione della classe astratta Media
public abstract class Media {

    // Attributo privato per memorizzare il titolo del media
    private String titolo;

    // Metodo per ottenere il titolo del media
    public String getTitolo() {
        return titolo; // Restituisce il titolo corrente del media
    }

    // Metodo per impostare il titolo del media
    public void setTitolo(String titolo) {
        this.titolo = titolo; // Imposta il titolo del media con il valore fornito
    }
}