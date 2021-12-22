package org.jboss.forge.roaster;

import org.jboss.forge.roaster.model.JavaType;
import org.jboss.forge.roaster.model.ParsingContext;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ParsingContextImpl implements ParsingContext {

    private final Map<String,JavaType<?>> types=new ConcurrentHashMap<>();

    @Override
    public <T extends JavaType<?>> T parse(Class<T> type, String data) {
        T parse = Roaster.parse(type, data);
        parse.setParsingContext(this);
        types.put(parse.getCanonicalName(),parse);
        return parse;
    }

    @Override
    public <T extends JavaType<?>> T parse(Class<T> type, File data) throws IOException {
        T parse = Roaster.parse(type, data);
        parse.setParsingContext(this);
        types.put(parse.getCanonicalName(),parse);
        return parse;
    }

    @Override
    public <T extends JavaType<?>> T parse(Class<T> type, InputStream data) {
        T parse = Roaster.parse(type, data);
        parse.setParsingContext(this);
        types.put(parse.getCanonicalName(),parse);
        return parse;
    }

    @Override
    public <T extends JavaType<?>> T getType(String canonicalName) {
        return (T) types.get(canonicalName);
    }
}
