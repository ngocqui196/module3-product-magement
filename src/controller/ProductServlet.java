package controller;

import model.Product;
import org.omg.IOP.RMICustomMaxStreamFormat;
import service.IProductService;
import service.ProductServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet",urlPatterns = "/products")
public class ProductServlet extends HttpServlet {
    IProductService service=new ProductServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action=request.getParameter("action");
        if(action==null)
            action="";
        switch(action){
            case "create":
                addProduct(request,response);
                break;
            case "edit":
                break;
            default:
                listProduct(request,response);
        }
    }

    private void addProduct(HttpServletRequest request, HttpServletResponse response) {
        int id=Integer.parseInt(request.getParameter("id"));
        String name=request.getParameter("name");
        String desc=request.getParameter("desc");
        Product product=new Product(id,name,desc);
        service.save(product);
        request.setAttribute("message","Them thanh cong");
        RequestDispatcher dispatcher=request.getRequestDispatcher("WEB-INF/views/create.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action=request.getParameter("action");
        if(action==null)
            action="";
        switch(action){
            case "create":
                showCreateForm(request,response);
                break;
            case "edit":
                showEditForm(request,response);
                break;
            default:
                listProduct(request,response);
        }

    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
        int id=Integer.parseInt(request.getParameter("id"));
        Product product=service.findById(id);
        if(product!=null) {
            request.setAttribute("product",product);
            RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/edit.jsp");
            try {
                dispatcher.forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher=request.getRequestDispatcher("WEB-INF/views/create.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void listProduct(HttpServletRequest request, HttpServletResponse response) {
       List<Product> products= service.findAll();
       request.setAttribute("products",products);
        RequestDispatcher dispatcher=request.getRequestDispatcher("WEB-INF/views/list.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
