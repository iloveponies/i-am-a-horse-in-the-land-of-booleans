package ohtu.verkkokauppa;

public class ViitegeneraattoriImpl implements Viitegeneraattori {
    
    private int seuraava;
    
    public ViitegeneraattoriImpl(){
        seuraava = 1;    
    }
    
    @Override
    public int uusi(){
        return seuraava++;
    }
}
