package map.rovnica;

public class Main
{
    public static void main(String[] args)
    {
		Rovnica [] pole = new Rovnica [4];
		pole[0]= new Linearna(3, 4);
		pole[1]= new Kvadraticka(1, -5, 6);
		pole[2]= new Linearna(1,-8);
		pole[3]= new Kvadraticka(1,-4, 4);

		for (Rovnica i:pole)
		{
			i.vypisRovnicu();
			i.vypisKorene();
		}
    }
}
