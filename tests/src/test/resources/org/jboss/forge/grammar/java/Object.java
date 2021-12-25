package org.jboss.forge.grammar.java;


public class Object {

    private String fakeField;


    public String getFakeField() {
        return fakeField;
    }

    public <T extends Object> T setFakeField(String fakeField) {
        this.fakeField = fakeField;
        return (T) this;
    }
}