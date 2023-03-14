package br.com.silva.cars;

import java.io.IOException;

import br.com.silva.cars.util.JPAFactory;
import jakarta.persistence.EntityManager;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/testeservlet")
public class TesteServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Teste Servelet");

		EntityManager em = JPAFactory.getEntityManager();
		System.out.println("EM " + em);

		RequestDispatcher reqDispatcher = req.getRequestDispatcher("cars.jsp");
		reqDispatcher.forward(req, resp);

	}

}
