package org.aquacoope.mo.exception;

public class StationNotFoundException extends RuntimeException {
    public StationNotFoundException(String id) {
        super("Could not find station " + id);
    }
}
