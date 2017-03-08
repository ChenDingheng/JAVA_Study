/**
 * Created by dell on 2017/3/8.
 */
public enum Suit {
    CLUBS("black"),DIAMONDS("red"),HEARTS("red"),SPADES("black");
    private final String color;
    private Suit(String suitColor){
        color=suitColor;
    }
    public String getColor(){
        return color;
    }
    public static void main(String[] args){
        Suit s=Suit.CLUBS;
        String a=s.getColor();
        System.out.println(a);

    }
}
