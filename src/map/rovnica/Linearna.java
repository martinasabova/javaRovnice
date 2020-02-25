package map.rovnica;
import java.util.Scanner;
//java.util.* importuje vsetko z java.util


public class Linearna extends Rovnica
{
    //private float koefA;
    //private float koefB;
    //private float koren;
    //public static Scanner sc= new Scanner(System.in);

    public Linearna(float k1, float k2)
    {
        this.koefA=k1;
        koefB=k2;
    }

    public Linearna(float k)
    {
        this(k,k);
        //koefA=koefB=k;
    }

    public Linearna()
    {
        System.out.println("Zadaj koeficinety: ");
        koefA=getFloat(false, "Zadaj koeficient A: ");          //sc.nextFloat();
        koefB=getFloat(true, "Zadaj koeficient B: ");          //sc.nextFloat();
    }

    @Override
    protected void vypisRovnicu()
    {
        System.out.printf("%.2fx %+.2f = 0 \n", koefA, koefB);
    }

    @Override
    protected float[] getKorene()
    {
        float []  pole = new float [1];
        pole[0]=-koefB/koefA;
        return pole;
    }

    @Override
    protected void vypisKorene()
    {
        System.out.println(getKorene()[0]);
    }

    @Override
    public String toString()
    {
        return koefA + "x " + ((koefB>0)? "+":"")+koefB+ " = 0";
    }

}
