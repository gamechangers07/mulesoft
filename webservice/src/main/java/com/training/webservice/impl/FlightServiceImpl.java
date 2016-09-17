/**
 * 
 */
package com.training.webservice.impl;

import java.util.List;

import javax.jws.WebService;

import com.training.model.Flight;
import com.training.webservice.FlightService;

/**
 * @author pbalwani
 *
 */
@WebService(endpointInterface = "com.training.webservice.FlightService",serviceName = "FlightService")
public class FlightServiceImpl implements FlightService {

	/* (non-Javadoc)
	 * @see com.training.webservice.FlightService#findFlight()
	 */
	@Override
	public Flight findFlight(String destination) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.training.webservice.FlightService#listAllFlights()
	 */
	@Override
	public List<Flight> listAllFlights() {
		// TODO Auto-generated method stub
		return null;
	}

}
