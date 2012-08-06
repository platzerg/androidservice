package com.platzerworld.biergarten.services;

import java.lang.reflect.Type;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.platzerworld.biergarten.dao.EMFService;
import com.platzerworld.biergarten.model.Biergarten;
import com.platzerworld.biergarten.vo.BiergartenVO;

// http://biergartenservice.appspot.com/platzerworld/biergarten/holebiergarten

@Path("/biergarten/")
public class BiergartenService {
	@GET
	@Produces("text/plain")
	@Path("/insertbiergarten")
	public String insertBiergarten() {
		EntityManager em = EMFService.get().createEntityManager();
		Biergarten bg = null;
		bg = new Biergarten();bg.name="Zum Aumeister";
		bg.strasse="Sondermeierstrasse 1";
		bg.plz="80939";
		bg.ort="M�nchen (Schwabing)";
		bg.telefon="089 / 18 93 142 0";
		bg.email="aumeister@aumeister.de";
		bg.url="www.aumeister.de";
		bg.latitude="48,185977";
		bg.longitude="11,620038";
		bg.desc="Am Nordrand des Englischen Gartens gelegen";
		bg.favorit=false;
		//em.persist(bg);
		
		em.close();
		return "Hello Biergarten OK!";
		
	}
	
	@GET
	@Produces("text/plain")
	@Path("/holebiergarten")
	public String getBiergarten() {
		//return "holebiergarten";
		
		
		List<BiergartenVO> biergartenTOs = new ArrayList<BiergartenVO>();
		BiergartenVO bg = null;
		bg = new BiergartenVO();
		bg.name="Zum Aumeister";
		bg.strasse="Sondermeierstrasse 1";
		bg.plz="80939";
		bg.ort="München (Schwabing)";
		bg.telefon="089 / 18 93 142 0";
		bg.email="aumeister@aumeister.de";
		bg.url="www.aumeister.de";
		bg.latitude="48.185977";
		bg.longitude="11.620038";
		bg.desc="Am Nordrand des Englischen Gartens gelegen";
		bg.favorit=false;
		biergartenTOs.add(bg);
		
		com.google.appengine.repackaged.com.google.gson.Gson gson = new com.google.appengine.repackaged.com.google.gson.Gson();
		String data = gson.toJson(biergartenTOs);
		
		return data;
		
	}
}






/*
 * http://[your-application-id].appspot.com/resources/hr/employee or
 * http://[your-application-id].appspot.com/rest/hr/employee
 * 
 * http://127.0.0.1:8888/resources/biergarten/all/tug@grallandco.com
 * 
 * 
 * http://127.0.0.1:8888/resources/hr/employee
 * 
 * http://biergartenservice.appspot.com/resources/platzerworld/biergarten
 * 
 * http://biergartenservice.appspot.com/
 * 
 * http://localhost:8080/com.platzerworld.biergarten.jersey/rest/hello
 * 
 * http://127.0.0.1:8888/com.platzerworld.biergarten.jersey/rest/hello
 * 
 * http://biergartenservice.appspot.com/resources/hr/employee or
 * http://biergartenservice.appspot.com/rest/hr/employee
 * 
 * http://platzerworld.appspot.com/resources/hr/employee
 * 
 * 
 * http://biergartenservice.appspot.com/resources/biergarten/all/tug@grallandco.com
 */
