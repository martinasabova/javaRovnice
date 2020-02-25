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
        System.out.printf("%.2fx %+.2f %+.2f = 0 \n", koefA, koefB, koefC);
    }

    @Override
    protected float[] getKorene()
    {
        float D=koefB*koefB-4*koefA*koefC;
        if(D<0)
        {
            System.out.println("Nema riesenie.");
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

    }

    @Override
    public String toString()
    {
        return null;
    }
}
