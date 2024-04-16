
package Servlets;

import Clases.Articulo;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;

@WebServlet("/carrito")
public class Carrito extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession sesion = req.getSession();
        PrintWriter out = resp.getWriter();
        ArrayList<Articulo> listaArticulos;
        listaArticulos = (ArrayList<Articulo>)sesion.getAttribute("articulos");
        
        out.print("<html>");
        
        out.print("<head>");
        
        out.print("<head>");
        out.print("<body>");
        out.print("<table>");
        out.print("<caption>");
        out.print("Lista del Carrito final");
        out.print("</caption>");
      
        if(listaArticulos != null && !listaArticulos.isEmpty()){
            for(Articulo e : listaArticulos){ 
                out.print("<tr>");
                out.print("<td style='border: 1px solid black' collapse='collapse'>");
                out.print(e.getNombre() +":");
                out.print("</td>");
                out.print("<td style='border: 1px solid black' collapse='collapse'>");
                out.print(e.getCantidad());
                out.print("</td>");
             } 
        }else{
            out.print("<h3>");
            out.print("lista de articulos null o vacio");
            out.print("</h3>");
        }
        out.print("</table>");
        out.print("<body>");      
        out.print("</html>");
     
    }  
}
