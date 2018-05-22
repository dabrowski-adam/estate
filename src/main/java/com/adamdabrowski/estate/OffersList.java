package com.adamdabrowski.estate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OffersList implements Container<Lot> {
    private List<Lot> lots;

    public OffersList() {
        lots = new ArrayList<>();
    }

    public boolean put(Lot obj) {
        return (obj != null) && lots.add(obj);
    }

    public boolean remove(Lot obj) {
        return lots.remove(obj);
    }

    public List<Lot> getAll() {
        return Collections.unmodifiableList(lots);
    }

    double getCheapestLotPrice() {
        return lots.stream()
                .mapToDouble(lot -> lot.price)
                .min()
                .orElse(0);
    }

    double getTheLowestPricePerSquareMeter() {
        return lots.stream()
                .mapToDouble(lot -> lot.price / lot.surface)
                .min()
                .orElse(0);
    }
}
