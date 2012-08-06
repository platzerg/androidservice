package com.platzerworld.biergarten;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.platzerworld.biergarten.model.Biergarten;


@SuppressWarnings("serial")
public class BiergartenServiceServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		List<Biergarten> biergartenTOs = new ArrayList<Biergarten>();
		
		resp.setContentType("application/json");
		PrintWriter out = resp.getWriter();
		
		Biergarten bg = null;
		bg = new Biergarten();bg.name="Zum Aumeister";
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
		out.println(data);	
	}
	
	private String checkNull(String s) {
		if (s == null) {
			return "";
		}
		return s;
	}
	
}
