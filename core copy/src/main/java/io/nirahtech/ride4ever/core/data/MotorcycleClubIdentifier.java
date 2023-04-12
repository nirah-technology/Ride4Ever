package io.nirahtech.ride4ever.core.data;

public final class MotorcycleClubIdentifier extends AbstractIdentifier<Integer> {

    private Integer identifier = super.identifier;

    public MotorcycleClubIdentifier() {
        super();
    }

    public MotorcycleClubIdentifier(Integer identifier) {
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
