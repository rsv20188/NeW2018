package ru.unlimit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServet
 */
//обычный джава класс,  сервлет java технология java файл который будет наследоваться от  класса
//HttpServlet
//класс будет находиться в пакете ru.unlimit
@WebServlet("/MyServet") //имя
public class MyServet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	//метод doGet содержит два параметра ниже
	//параметр request запрос  от браузера от клиента получать параметры от клиента 
	//response то что мы вернем обратно , возвращать что то пользователю
//обработчик гет запросов doGet
	protected void doGET(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	       String name = request.getParameter("firstName");
	       String surname = request.getParameter("secondName");
	       System.out.println(name);
	       System.out.println(surname);
	       
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
	  //     System.out.println("info");
	       //для русских слов кодировка
	       //1 cпособ
	      // response.setContentType("text/html");
	      // response.setCharacterEncoding("UTF-8");
	     //2 cпособ
	       response.setContentType("text/html;charset=utf-8");
	       //создаем объект вернуть что то пользовотелю 
	       //ctrl+ пробел жмем для вызова  PrintWriter
	       PrintWriter out = response.getWriter();
	       //вернули пользователю текст используя   PrintWriter
	       out.println("<h3>Привет от MyServet.GET"+name+" "+surname+"</h3>");
	       out.close();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   request.setCharacterEncoding("UTF-8");
	       String name = request.getParameter("firstName");
	       String surname = request.getParameter("secondName");
	       System.out.println(name);
	       System.out.println(surname);
	       ////
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
	  //     System.out.println("info");
	       //для русских слов кодировка
	       //1 cпособ
	      // response.setContentType("text/html");
	      // response.setCharacterEncoding("UTF-8");
	     //2 cпособ
	       response.setContentType("text/html;charset=utf-8");
	       //создаем объект вернуть что то пользовотелю 
	       //ctrl+ пробел жмем для вызова  PrintWriter
	       PrintWriter out = response.getWriter();
	       //вернули пользователю текст используя   PrintWriter
	       out.println("<h3>Привет от MyServet.POST"+name+" "+surname+"</h3>");
	       out.close();
	       
	}

}
