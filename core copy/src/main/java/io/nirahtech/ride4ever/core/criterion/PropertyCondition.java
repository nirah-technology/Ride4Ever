package io.nirahtech.ride4ever.core.criterion;

public final class PropertyCondition {
    private final String property;
    private final Operator operator;
    private final Object value;
    
    public PropertyCondition(String property, Operator operator, Object value) {
        this.property = property;
        this.operator = operator;
        this.value = value;
    }

    public String getProperty() {
        return property;
    }

    public Operator getOperator() {
        return operator;
    }

    public Object getValue() {
        return value;
    }

    
}
