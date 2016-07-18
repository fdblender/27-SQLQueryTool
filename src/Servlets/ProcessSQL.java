package Servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetSQLstatement
 */
@WebServlet("/ProcessSQL")
public class ProcessSQL extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcessSQL() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		rows
		String sql = request.getParameter("query");
		
		ResultSet rs = JdbcQueryUtil.executeQuery(sql);
		
		
		
		request.setAttribute("rows", rs);		
		
		String nextURL = "/displaytable.jsp";
		
		response.sendRedirect(request.getContextPath() + nextURL);
		
		
		/*while(rs.next()){
			word = rs.getString(1);
			replacement = rs.getString(2);
			replacements.put(word, replacement);
			//System.out.println(word +" replacement: "+replacement + "\t");
			//System.out.println(rs.getString(2));
		}*/
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
