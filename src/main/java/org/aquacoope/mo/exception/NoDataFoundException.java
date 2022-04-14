package org.aquacoope.mo.exception;

import java.util.Date;

public class NoDataFoundException extends RuntimeException {
    public NoDataFoundException(String stationId, String parameterId) {
        super(String.format("Could not find data for station %s and parameter %s.", stationId, parameterId));
    }
    public NoDataFoundException(String networkId, Date start, Date end) {
        super(String.format("Could not find parameter for network %s in period %s - %s.", networkId, start, end));
    }
}
