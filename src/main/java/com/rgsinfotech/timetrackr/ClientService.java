package com.rgsinfotech.timetrackr;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Retrieves customers that match a specific pattern.
 * 
 * @author rsingh
 *
 */
@WebService
public interface ClientService {
	/**
	 * Retrieves Clients by a given pattern.
	 * 
	 * @param name Customer name
	 * @return All matching clients
	 */
	public Client[] getClientsByName(@WebParam(name="name") String name) throws ClientNotFoundException;
}
