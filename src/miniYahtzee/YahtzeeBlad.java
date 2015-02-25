package miniYahtzee;

// Klasinn YahtzeeBlad heldur utan um stig í Yahtzee leiknum
// og getur skráð stig í reit eða skilað heildar stigafjölda.

public class YahtzeeBlad {
    
    private int[] reitir = new int[8];
    // reitir geymir stigafjölda í hverjum reit leiksins.
    
    // YahtzeeBlad() Smíðar hlut af tagi YahtzeeBlad
    public YahtzeeBlad(){
       for(int i = 0; i < reitir.length; i++){
           reitir[i] = 0;
       }
    }
    
    // setjaToluIReit setur stig i videigandi reit.
    public void setjaToluIReit(int reitur, int tala) {
        reitir[reitur] = tala;
    }
    
    // nidurstada() skilar summu allra stiga i leiknum.
    public int nidurstada() {
        int summa = 0;
        for(int i = 0; i < reitir.length; i++) {
           summa += reitir[i];
        }
        return summa;
    }
}
