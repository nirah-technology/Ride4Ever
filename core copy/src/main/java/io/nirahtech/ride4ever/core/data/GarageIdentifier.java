package io.nirahtech.ride4ever.core.data;

import jakarta.persistence.Embeddable;

@Embeddable
public final class GarageIdentifier extends AbstractIdentifier<Integer> {

    private Integer identifier = super.identifier;

    public GarageIdentifier() {
        super();
    }

    public GarageIdentifier(Integer identifier) {
        super(identifier);
        this.setIdentifier(identifier);
    }

    public Integer getIdentifier() {
        return this.identifier;
    }

    public void setIdentifier(Integer identifier) {
        super.identifier = identifier;
        this.identifier = super.identifier;
    }
}
