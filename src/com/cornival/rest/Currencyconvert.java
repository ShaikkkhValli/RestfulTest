package com.cornival.rest;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/")
public class Currencyconvert 
{
 
	
	@Path("{gbp}")
	@GET
	@Produces("text/html")
	public String convertGBPtoUSD(@PathParam("gbp") Double gbp) {
		Double gbpC = gbp*1.31;
		 
		String output = "<h1>Currency Conversion!<h1>" +
				"<p>GBP to USD " + gbpC + "</p<br>";
		return output;
 
		 
	}
}