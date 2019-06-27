import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Deck newdeck = new Deck();
        Player miles = new Player(newdeck.deal4(), "miles");
        Player dane = new Player(newdeck.deal4(), "dane");
        System.out.println(miles.whatsInMyHand());
        System.out.println(dane.whatsInMyHand());
        miles.swap(1, newdeck.pop());
        System.out.println(newdeck.size());
        System.out.println(miles.whatsInMyHand());
        System.out.println(miles.skip(dane, newdeck.pop()));
        System.out.println(miles.haveSame());
        int count = 0;
        while (!miles.haveSame()) {
            newdeck = new Deck();
            miles = new Player(newdeck.deal4(), "miles");
            if (miles.haveSame()) {
                System.out.println(miles.whatsInMyHand());
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
