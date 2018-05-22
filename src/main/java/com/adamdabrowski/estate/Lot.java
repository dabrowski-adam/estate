package com.adamdabrowski.estate;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Lot {
    double price;
    double surface;

    public Lot(double price, double surface) {
        this.price = price;
        this.surface = surface;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append(price)
                .append(surface)
                .toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) { return false; }
        if (obj.getClass() != getClass()) { return false; }

        Lot rhs = (Lot) obj;
        return new EqualsBuilder()
                .appendSuper(super.equals(obj))
                .append(price, rhs.price)
                .append(surface, rhs.price)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .appendSuper(super.hashCode())
                .append(price)
                .append(surface)
                .toHashCode();
    }
}
