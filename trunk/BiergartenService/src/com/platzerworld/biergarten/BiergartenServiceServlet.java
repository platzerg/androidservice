package com.platzerworld.biergarten;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.persistence.EntityManager;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.platzerworld.biergarten.dao.EMFService;
import com.platzerworld.biergarten.model.Biergarten;


@SuppressWarnings("serial")
public class BiergartenServiceServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// resp.setContentType("application/json");
		PrintWriter out = resp.getWriter();
		
		//EntityManager em = EMFService.get().createEntityManager();
		//Query q = em.createQuery("select t from Todo t where t.author = :userId");
		//q.setParameter("userId", userId);
		
		//javax.persistence.Query q = em.createQuery("select b from Biergarten b");
		//List<Biergarten> todos = q.getResultList();
		
		out.println("Finish!");
	}
	
	private String checkNull(String s) {
		if (s == null) {
			return "";
		}
		return s;
	}
	
}
