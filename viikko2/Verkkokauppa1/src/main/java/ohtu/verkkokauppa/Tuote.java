
package ohtu.verkkokauppa;

public class Tuote {
    private int id;
    private String nimi;
    private int hinta;

    public Tuote(int id, String nimi, int hinta) {
        this.id = id;
        this.nimi = nimi;
        this.hinta = hinta;
    }

    @Override
    public boolean equals(Object o) {
        Tuote t = (Tuote)o;
        
        return id==t.id;
    }

    public int getId() {
        return id;
    }

    public int getHinta() {
        return hinta;
    }

    @Override
    public String toString() {
        return nimi;
    }            
    
}
