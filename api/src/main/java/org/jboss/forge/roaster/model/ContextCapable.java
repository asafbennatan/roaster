package org.jboss.forge.roaster.model;

public interface ContextCapable<T extends JavaType<T>> {

    ParsingContext getParsingContext();
    void setParsingContext(ParsingContext parsingContext);

}
