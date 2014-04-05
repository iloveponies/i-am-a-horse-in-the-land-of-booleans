
package ohtu.laskin;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class KonsoliIO implements IO {
    private Scanner lukija;

    public KonsoliIO() {
        lukija = new Scanner(System.in);
    }    
    
    public int nextInt() {
        return lukija.nextInt();
    }

    public void print(String m) {
        System.out.print(m);
    }
    
}
