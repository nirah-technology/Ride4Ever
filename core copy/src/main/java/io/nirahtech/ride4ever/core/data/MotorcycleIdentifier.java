package io.nirahtech.ride4ever.core.data;

public final class MotorcycleIdentifier extends AbstractIdentifier<String> {
    private String identifier = super.identifier;

    public MotorcycleIdentifier() {
        super();
    }

    public MotorcycleIdentifier(String identifier) {
        super(identifier);
        this.setIdentifier(identifier);
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public void setIdentifier(String identifier) {
        super.identifier = identifier;
        this.identifier = super.identifier;
    }
}
