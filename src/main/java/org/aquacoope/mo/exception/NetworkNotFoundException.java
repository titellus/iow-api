package org.aquacoope.mo.exception;

public class NetworkNotFoundException extends RuntimeException {
    public NetworkNotFoundException(String id) {
        super("Could not find network " + id);
    }
}
