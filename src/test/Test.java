package test;

import map.rovnica.Linearna;

import static org.junit.jupiter.api.Assertions.*;

class Test
{
    private Linearna Prva;
    private Linearna Druha;
    private Linearna Tretia;

    @org.junit.jupiter.api.BeforeEach
    void setUp()
    {
        Prva = new Linearna(1,1);
        Druha = new Linearna(-3, 6);
        Tretia = new Linearna(0,3);
    }

    @org.junit.jupiter.api.Test
    void getKorene()
    {
        assertEquals(Prva.getKorene()[0], -1);
        assertEquals(Druha.getKorene()[0], 2);
        //assertNull(Tretia.getKorene());
        assertArrayEquals(Tretia.getKorene(), new float [0]);
    }
}