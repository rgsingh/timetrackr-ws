package com.rgsinfotech.timetrackr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.ws.WebFault;

@WebFault(name="ClientNotFound")
@XmlAccessorType( XmlAccessType.FIELD )
public class ClientNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1593587636970543681L;
	String name;
}
