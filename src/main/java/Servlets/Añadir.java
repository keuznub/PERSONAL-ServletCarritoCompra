
package Servlets;

import Clases.Articulo;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/añadir")
public class Añadir extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String articulo = req.getParameter("articulo");
        Integer cantidad = Integer.valueOf(req.getParameter("cantidad"));
        HttpSession sesion = req.getSession();
        ArrayList<Articulo> listaArticulos;
        listaArticulos = (ArrayList<Articulo>)sesion.getAttribute("articulos");
        listaArticulos = addArticle(listaArticulos, articulo, cantidad);
        sesion.setAttribute("articulos", listaArticulos);
        
        resp.sendRedirect(req.getContextPath());     
    }  
    
    
    
    private ArrayList<Articulo> addArticle(ArrayList<Articulo> listaArticulos,String articulo, Integer cantidad){
        if(listaArticulos != null){
            for(Articulo a : listaArticulos){
                if(a.getNombre().equals(articulo)){
                    a.setCantidad(a.getCantidad()+cantidad);
                    return listaArticulos;
                }
            } 
        }else{
           listaArticulos = new ArrayList<Articulo>(); 
        }
        listaArticulos.add(new Articulo(articulo, cantidad));
        return listaArticulos;
        
    }
}
