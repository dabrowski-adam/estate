package com.adamdabrowski.estate;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OffersListTest {

    @Test
    void TestCase1() {
        OffersList offers = new OffersList();
        BuiltUp lot1 = new BuiltUp(1000, 100, 100000);
        BuiltUp lot2 = new BuiltUp(2000, 150, 190000);
        Undeveloped lot3 = new Undeveloped(800, 100, 90000);

        offers.put(lot1);
        offers.put(lot2);
        offers.put(lot3);

        List<Lot> lots = offers.getAll();

        assertEquals(3, lots.size());

        offers.remove(lot2);

        assertTrue(lots.contains(lot1));
        assertFalse(lots.contains(lot2));
        assertTrue(lots.contains(lot3));
    }

    @Test
    void TestCase2() {
        OffersList offers = new OffersList();
        BuiltUp lot1 = new BuiltUp(1000, 100, 100000);
        BuiltUp lot2 = new BuiltUp(2000, 150, 190000);
        Undeveloped lot3 = new Undeveloped(800, 100, 90000);

        offers.put(lot1);
        offers.put(lot2);
        offers.put(lot3);

        assertEquals(800.0, offers.getCheapestLotPrice());
        assertEquals(800.0 / 100.0, offers.getTheLowestPricePerSquareMeter());
    }
}