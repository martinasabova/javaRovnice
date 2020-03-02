package map.rovnica;

public class Kvadraticka extends Rovnica
{
    private float koefC;

    public Kvadraticka (float k1, float k2, float k3)
    {
        koefA=k1;
        koefB=k2;
        koefC=k3;
    }

    public Kvadraticka()
    {
        System.out.println("Zadaj koeficinety: ");
        koefA=getFloat(false, "Zadaj koeficient A: ");
        koefB=getFloat(true, "Zadaj koeficient B: ");
        koefC=getFloat(true, "Zadaj koeficient c: ");
    }

    @Override
    protected void vypisRovnicu()
    {
        System.out.printf("%.2fx^2 %+.2fx %+.2f = 0 \n", koefA, koefB, koefC);
    }

    @Override
    public float[] getKorene()
    {
		try
		{
			if (koefA==0)
			{
				throw new JeNula("Rovnica nie je kvadraticka.");
			}
		}
		catch (JeNula ex)
		{
			ex.getMsg();
			Linearna Nahrada = new Linearna(koefB, koefC);
			return Nahrada.getKorene();
		}
        float D=koefB*koefB-4*koefA*koefC;
        if(D<0)
        {
            System.out.println("Nema riesenie.\n");
            return new float [0];
        }
        if (D==0)
        {
            float []  pole = new float [1];
            pole[0]=-koefB/(2*koefA);
            return pole;
        }
        else
        {
            float []  pole = new float [2];
            pole[0]=(float)(-koefB+Math.sqrt(D))/(2*koefA);
            pole[1]=(float)(-koefB-Math.sqrt(D))/(2*koefA);
            return pole;
        }
    }

    @Override
    protected void vypisKorene()
    {
        int dlzka=getKorene().length;
        if(dlzka==1)
        {
            System.out.println(getKorene()[0]);
        }
        if(dlzka==2)
        {
            System.out.printf("prvy %f druhy %f\n",getKorene()[0], getKorene()[1]);
        }
    }

    @Override
    public String toString()
    {
        return koefA + "x^2 " + ((koefB>0)? "+":"")+koefB+ "x " +koefC+ " = 0\n";
    }
}
