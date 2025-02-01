package demo;

import java.io.BufferedReader;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;


/**
 * Servlet implementation class LoginJ
 */

public class LoginJ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginJ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		StringBuilder sb = new StringBuilder();
		
		BufferedReader reader = request.getReader();
		
		String line;
		
		while((line=reader.readLine())!=null) {
			sb.append(line);
		}
		
		
		JSONObject jsonData=new JSONObject(sb.toString());
		
		String username=jsonData.getString("username");
		String password=jsonData.getString("password");

		System.out.println("Username: "+ username+"\nPassword: "+password);
		response.setStatus(200);
		response.setContentType("text/plaintext");
		response.getWriter().write("Good");
	}

}
