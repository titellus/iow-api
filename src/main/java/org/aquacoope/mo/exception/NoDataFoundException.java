package org.aquacoope.mo.exception;

public class NoDataFoundException extends RuntimeException {
    public NoDataFoundException(String stationId, String parameterId) {
        super(String.format("Could not find data for station %s and parameter %s.", stationId, parameterId));
    }
}
