package map.rovnica;
import java.util.InputMismatchException;
import java.util.Scanner;

abstract public class Rovnica
{
    protected float koefA;
    protected float koefB;

    abstract protected void vypisRovnicu();
    abstract protected float [] getKorene ();
    abstract protected void vypisKorene ();
    abstract public String toString();
    public static class JeNula extends Exception
    {
        private String msg;
        public JeNula(String sprava)
        {
            msg=sprava;
        }
        public void getMsg ()
        {
            System.out.println(msg);
        }
    }
    float getFloat(boolean ajNula, String text)
    {
        Scanner sc= new Scanner(System.in);
        float x;
        while (true)
        {
            try
            {
                System.out.println(text);
                x=sc.nextFloat();
                if (!ajNula && x==0)
                {
                    throw new JeNula("Nemoze byt nula");
                }
            }
            catch (InputMismatchException e)
            {
                System.out.println("Nie je to cislo.");
                sc.nextLine();
                continue;
            }
            catch (JeNula ex)
            {
                ex.getMsg();
                continue;
            }
            break;
        }
        return x;
    }
}