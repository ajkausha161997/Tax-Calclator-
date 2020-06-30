package com.tax;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class TaxCalculator extends HttpServlet {
	
	
	public void doPost(HttpServletRequest req , HttpServletResponse res){
		System.out.println("Class found");
		int exixting_slab, new_slab , totaldeduction=0 ;
		int anualincome = Integer.parseInt(req.getParameter("anualincome"));
		int age = Integer.parseInt(req.getParameter("age"));
		String mariatlstatus = req.getParameter("mariatlstatus");
		int hra = Integer.parseInt(req.getParameter("hra"));
		int lta = Integer.parseInt(req.getParameter("lta"));
		int pt = Integer.parseInt(req.getParameter("pt"));
		
		if(anualincome <= 500000)
		{
			new_slab = 0;
			exixting_slab = 0;
		}
		else
		{
		totaldeduction = hra + lta + pt ;
		exixting_slab = (anualincome - totaldeduction -50000);
		new_slab = anualincome - 50000;
		
		}
		if(new_slab> 500000)
		{
		
		if(new_slab>500000 && new_slab<750000)
		{
			new_slab = (new_slab * 10)/100;
		}
		else if(new_slab>=750000 && new_slab<1000000)
		{
			new_slab = (new_slab * 15)/100;
		}
		else if(new_slab>=1000000 && new_slab<1250000)
		{
			new_slab = (new_slab * 20)/100;
		}
		else if(new_slab>=1250000 && new_slab<1500000)
		{
			new_slab = (new_slab * 25)/100;
		}
		else
		{
			new_slab = (new_slab * 30)/100;
		}
		
		}
		//existing slab
		 if(exixting_slab >500000)
		 {
		
		if(exixting_slab>500000 && exixting_slab<750000)
		{
			exixting_slab = (exixting_slab * 10)/100;
		}
		else if(exixting_slab>=500000 && exixting_slab<1000000)
		{
			exixting_slab = (exixting_slab * 20)/100;
		}
		else
		{
			exixting_slab = (exixting_slab * 20)/100;
		}
		 }
		req.setAttribute("ex_slab", exixting_slab);
		req.setAttribute("new_slab", new_slab);
		req.setAttribute("rebatenew", 50000);
		req.setAttribute("rebate_ex",(totaldeduction + 50000));
		System.out.println(exixting_slab);
		RequestDispatcher rs = req.getRequestDispatcher("/Taxresult.jsp");
		try {
			rs.forward(req, res);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
