package map.rovnica;

public class Main
{

    public static void main(String[] args)
    {
	    Linearna Prva = new Linearna();
	    Prva.vypisRovnicu();
	    System.out.println(Prva);
	    float [] korenePrva = Prva.getKorene();
	    Prva.vypisKorene();
	    //System.out.print (korenePrva[0]);
    }
}
