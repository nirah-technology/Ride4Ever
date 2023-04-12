package io.nirahtech.ride4ever.core.data;

public final class Email {
    private final String user;
    private final String domain;

    public Email(final String user, final String domain) {
        this(String.format("%s@%s", user, domain));
    }
    public Email(final String email) {
        String[] emailParts = email.split("@");
        this.user = emailParts[0];
        this.domain = emailParts[1];
    }
    public String getUser() {
        return this.user;
    }
    public String getDomain() {
        return this.domain;
    }

    @Override
    public String toString() {
        return String.format("%s@%s", user, domain);
    }
}
