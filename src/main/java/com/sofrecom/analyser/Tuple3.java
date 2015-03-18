package com.sofrecom.analyser;


/**
 *
 * @author z.benrhouma
 */
public class Tuple3<M,R,I> {
    public M method;
    public R route;
    public I invocation;

    @Override
    public String toString() {
        return "Tuple3{" + "method=" + method + ", route=" + route + ", invocation=" + invocation + '}';
    }
    
    
    
    
}
