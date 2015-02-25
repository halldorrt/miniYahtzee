package miniYahtzee;

// Klasinn Yahtzeeleikur heldur utan um vinnslu hluta leiksins
// miniYahtzee.

public class YahtzeeLeikur {
    
    public Teningur[] teningar = new Teningur[3];
    public YahtzeeBlad yahtzeeBlad = new YahtzeeBlad();
    
    public YahtzeeLeikur() {
        for(int i = 0; i < teningar.length; i++){
            teningar[i] = new Teningur();
        }
    }
    
    public void kastaTeningum() {
        for(int i = 0; i < teningar.length; i++) {
            teningar[i].kastaTening();
        }
    }
    
    public void nyrLeikur() {
        for(int i = 0; i < teningar.length; i++){
            teningar[i] = new Teningur();
        }
        yahtzeeBlad = new YahtzeeBlad();
    }
    
    public int nidurstada() {
        return yahtzeeBlad.nidurstada();
    }
    
    public int stigFyrirGildi(int gildi) {
        int summa = 0;
        for (int i = 0; i < 3; i++) {
            if (teningar[i].lesaGildi() == gildi) {
                summa += teningar[i].lesaGildi();
            }
        }
        return summa;
    }
    
    public int takaSensinnStig() {
        return teningar[0].lesaGildi() + teningar[1].lesaGildi() + teningar[2].lesaGildi();
    }
    
    public int yahtzeeStig(){
        if (teningar[0].lesaGildi() == teningar[1].lesaGildi() && teningar[1].lesaGildi() == teningar[2].lesaGildi()) {
            return 30;
        }
        return 0;
    } 
}
