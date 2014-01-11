package com.rgsinfotech.timetrackr;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType( XmlAccessType.FIELD )
public class Client {
	String name;
	Contact primaryContact;
	Contact secondaryContact;
	String[] address;
	TaskStatusType taskStatusType;
	Date lastBillingDate;
	Date lastPaymentReceivedDate;
	ClientType customerType;
	double revenue;
}
