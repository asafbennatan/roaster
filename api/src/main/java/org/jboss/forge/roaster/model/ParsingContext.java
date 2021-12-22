package org.jboss.forge.roaster.model;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public interface ParsingContext {

    <T extends JavaType<?>> T parse(final Class<T> type, final String data);
    <T extends JavaType<?>> T parse(final Class<T> type, final File data) throws IOException;
    <T extends JavaType<?>> T parse(final Class<T> type, final InputStream data);

    <T extends JavaType<?>> T getType(String canonicalName);


}
