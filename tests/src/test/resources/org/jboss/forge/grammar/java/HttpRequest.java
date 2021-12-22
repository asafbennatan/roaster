package org.jboss.forge.grammar.java;


public class HttpRequest {

   private String fakeField;


    public String getFakeField() {
        return fakeField;
    }

    public <T extends HttpRequest> T setFakeField(String fakeField) {
        this.fakeField = fakeField;
        return (T) this;
    }
}