package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/formurl")
public class FormCompsServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// get PrintWriter
		PrintWriter pw = res.getWriter();
		// set response content type
		res.setContentType("text/html");
		// read form data
		String name = req.getParameter("pname");
		int age = Integer.parseInt(req.getParameter("page"));
		String addr = req.getParameter("addr");
		String gender = req.getParameter("gen");
		String ms = req.getParameter("ms");
		ms = (ms == null) ? "single" : ms;
		String quly = req.getParameter("quli");
		String courses[] = req.getParameterValues("course");
		String lang[] = req.getParameterValues("lang");
		String mail = req.getParameter("email");
		String dob = req.getParameter("dob");
		String tob = req.getParameter("tob");
		String wob = req.getParameter("wb");
		String fburl = req.getParameter("fburl");
		long mobNo = Long.parseLong(req.getParameter("mobno"));
		String favColor = req.getParameter("favcolor");

		int favNo = Integer.parseInt(req.getParameter("favno"));
		float salary = Float.parseFloat(req.getParameter("sal"));
		String item = req.getParameter("ss");

		// write B.logic
		if (gender.equalsIgnoreCase("M")) {
			if (age < 5)
				pw.println("<h1 style='color:red;text-align:center;'>Master  " + name + "  you are a baby boy</h1>");
			else if (age < 12)
				pw.println("<h1 style='color:red;text-align:center;'>Master " + name + "   you are a small boy</h1>");
			else if (age < 22)
				pw.println("<h1 style='color:red;text-align:center;'>Master " + name + "you are a Teanage boy</h1>");
			else if (age < 35)
				pw.println("<h1 style='color:red;text-align:center;'>Master " + name + "you are a young man</h1>");
			else if (age < 55)
				pw.println("<h1 style='color:red;text-align:center;'>Master " + name + "you are a  middle age man</h1>");
			else
				pw.println("<h1 style='color:red;text-align:center;'>Master " + name + "you are a old man</h1>");
		} else {
			if (age < 5)
				pw.println("<h1 style='color:red;text-align:center;'>Master " + name + "you are a baby girl</h1>");
			else if (age < 12)
				pw.println("<h1 style='color:red;text-align:center;'>Master " + name + "you are a small girl</h1>");
			else if (age < 22) {
				if (ms.equalsIgnoreCase("married"))
					pw.println("<h1 style='color:red;text-align:center;'>Master " + name
							+ "you are a Teanage married girl</h1>");
				else
					pw.println("<h1 style='color:red;text-align:center;'>Master " + name + "you are a young women</h1>");
			}
			else if (age < 35) {
				if (ms.equalsIgnoreCase("married"))
					pw.println("<h1 style='color:red;text-align:center;'>Master " + name
							+ "you are a  married women</h1>");
				else
					pw.println(
							"<h1 style='color:red;text-align:center;'>Master " + name + "you are a young women</h1>");
			}

			else if (age < 50) {
				if (ms.equalsIgnoreCase("married"))
					pw.println("<h1 style='color:red;text-align:center;'>Master " + name
							+ "you are a  middle age married women</h1>");
				else
					pw.println("<h1 style='color:red;text-align:center;'>Master " + name
							+ "you are amiddle age women</h1>");
			}

			else {
				if (ms.equalsIgnoreCase("married"))
					pw.println(
							"<h1 style='color:red;text-align:center;'>Master " + name + "you are a  married dadi</h1>");
				else
					pw.println(
							"<h1 style='color:red;text-align:center;'>Master " + name + "you are a married buddi</h1>");
		    	}
		} // else
		// display form data
		pw.println("<h1 style='color:blue;text-algin:center'>Form Data is::</h1>");
		pw.println("<table border='1' bgcolor='cyan' align='center>");
		 pw.println("<h1 style='color:blue;text-algin:center'>"+name+" </h1>");
		pw.println("<tr><th>name</th><th>" + name + "</th></tr>");
		pw.println("<tr><th>Age</th><th>" + age + "</th></tr>");
		pw.println("<tr><th>Address</th><th>" + addr + "</th></tr>");
		pw.println("<tr><th>Gender</th><th>" + gender + "</th></tr>");
		pw.println("<tr><th>Marital Status</th><th>" + ms + "</th></tr>");
		pw.println("<tr><th>Qualification</th><th>" + quly + "</th></tr>");
		pw.println("<tr><th>Known Languages</th><th>" + Arrays.toString(lang) + "</th></tr>");
		pw.println("<tr><th>person salary</th><th>" + salary + "</th></tr>");
		pw.println("<tr><th>Date Of Birth</th><th>" + dob + "</th></tr>");
		pw.println("<tr><th>Time Of Birth</th><th>" + tob + "</th></tr>");
		pw.println("<tr><th>Week Of Birth</th><th>" + wob + "</th></tr>");
		pw.println("<tr><th>Email</th><th>" + mail + "</th></tr>");
		pw.println("<tr><th>Person Favorite color</th><th>" + favColor + "</th></tr>");
		pw.println("<tr><th>Person Favorite Number</th><th>" + favNo + "</th></tr>");
		pw.println("<tr><th>Person Mobile Number</th><th>" + mobNo + "</th></tr>");
		pw.println("<tr><th>Person Typed Url</th><th>" + fburl + "</th></tr>");
		pw.println("</table>");

		pw.println("<hr>");

		pw.println("<b>name::"+name+"</b>"); pw.println("<b>age::"+age+"</b>");
		pw.println("<b>address::"+addr+"</b>");
		pw.println("<b>Qulification::"+quly+"</b>");
		pw.println("<b>Marrital Status::"+ms+"</b>");
		pw.println("<b>Gender::"+gender+"</b>");
		pw.println("<b>Known Languages::"+lang+"</b>");
		pw.println("<b>Mail::"+mail+"</b>"); pw.println("<b>DOB::"+dob+"</b>");
		pw.println("<b>Time of birth::"+tob+"</b>");
		pw.println("<b>WEEK OF BIRTH::"+wob+"</b>");
		pw.println("<b>FAVORITE COLOR::"+favColor+"</b>");
		pw.println("<b>Facebook Url::"+fburl+"</b>");
		pw.println("<b>person mob number::"+mobNo+"</b>");
		pw.println("<b>person salary:::"+salary+"</b>");
		pw.println("<b>person search item:::"+item+"</b>");
		pw.println("<b>person salary:::"+ms+"</b>");

		// add homehyperlink
		pw.println("<a href='Person_details.html'>Home</a>");

		//Close stream
		pw.close();
	}//doGet

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}