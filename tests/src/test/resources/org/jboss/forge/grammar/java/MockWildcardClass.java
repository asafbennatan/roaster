package org.jboss.forge.grammar.java;

import java.net.http.*;
import java.util.*;

public class MockWildcardClass {

    public List<String> getList(){
        return new ArrayList<>();
    }
    public HttpRequest getHttpRequest(){
        return new HttpRequest();
    }
    public Object getObject(){
        return new Object();
    }
}