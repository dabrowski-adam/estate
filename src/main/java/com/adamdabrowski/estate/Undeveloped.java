package com.adamdabrowski.estate;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Undeveloped extends Lot {
    private double admissibleHouseSurface;

    public Undeveloped(double price, double surface, double admissibleHouseSurface) {
        super(price, surface);
        this.admissibleHouseSurface = admissibleHouseSurface;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) { return false; }
        if (obj.getClass() != getClass()) { return false; }

        Undeveloped rhs = (Undeveloped) obj;
        return new EqualsBuilder()
                .appendSuper(super.equals(obj))
                .append(admissibleHouseSurface, rhs.admissibleHouseSurface)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .appendSuper(super.hashCode())
                .append(admissibleHouseSurface)
                .hashCode();
    }
}
