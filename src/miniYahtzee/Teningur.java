package miniYahtzee;

// Klasinn Teningur býr til hlut af tagi Teningur sem inniheldur gildi
// tenings og möguleikann á að kasta honum og sækja gildið.

public class Teningur {
    
    private int gildi = 1;
    // gildi er heiltala sem heldur utan um gildi á tening.

    // kastaTening() breytir gildi í heiltölu af handahófi milli 1 og 6.
    public void kastaTening() {
        gildi = (1 + (int)(Math.random()*6));
    }
    
    // LesaGildi() skilar heiltölunni gildi
    public int lesaGildi() {
        return gildi;
    }
}
