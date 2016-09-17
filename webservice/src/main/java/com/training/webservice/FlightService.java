/**
 * 
 */
package com.training.webservice;

import java.util.List;

import javax.jws.WebService;

import com.training.model.Flight;

/**
 * @author pbalwani
 *
 */
@WebService
public interface FlightService {

	 public Flight findFlight(String destination);
	 public List<Flight> listAllFlights();
}
