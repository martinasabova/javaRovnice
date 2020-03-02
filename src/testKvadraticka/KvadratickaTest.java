package testKvadraticka;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import map.rovnica.Kvadraticka;

import static org.junit.jupiter.api.Assertions.*;

class KvadratickaTest
{
    Kvadraticka K1;
    Kvadraticka K2;
    Kvadraticka K3;
    //Kvadraticka K4;

    @BeforeEach
    void setUp()
    {
        K1 = new Kvadraticka(1, -5, 6);

        K2 = new Kvadraticka(1, 4, 6);
        K3 = new Kvadraticka(1, 4, 4);
    }

    @Test
    void getKorene()
    {
        float [] korene1 = new float [2];
        assertArrayEquals(K1.getKorene(), );
    }
}