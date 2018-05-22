package com.adamdabrowski.estate;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class BuiltUp extends Lot {
    private double houseSurface;

    public BuiltUp(double price, double surface, double houseSurface) {
        super(price, surface);
        this.houseSurface = houseSurface;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) { return false; }
        if (obj.getClass() != getClass()) { return false; }

        BuiltUp rhs = (BuiltUp) obj;
        return new EqualsBuilder()
                .appendSuper(super.equals(obj))
                .append(houseSurface, rhs.houseSurface)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .appendSuper(super.hashCode())
                .append(houseSurface)
                .hashCode();
    }
}
