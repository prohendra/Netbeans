/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/hubungi"})
public class HubungiKamiServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Hubungi Kami - Simple Camera Store</title>");
            out.println("<style>");
            out.println("body { font-family: Arial, sans-serif; margin: 0; padding: 0; background-color: #f4f4f4; }");
            out.println("header { background-color: #3b372e; color: white; padding: 10px; text-align: center; }");
            out.println("nav { background-color: #444; overflow: hidden; }");
            out.println("nav a { float: right; display: block; color: white; text-align: center; padding: 14px 16px; text-decoration: none; font-weight: bold; }");
            out.println("nav a:hover { background-color: #ddd; color: black; }");
            out.println("section { padding: 20px; text-align: center; background-color: #fff; margin: 20px auto; max-width: 800px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); border-radius: 8px; }");
            out.println("h2 { color: #3b372e; font-size: 24px; margin-bottom: 20px; }");
            out.println("p { font-size: 18px; line-height: 1.6; }");
            out.println("footer { background-color: #3b372e; color: white; padding: 10px; text-align: center; position: fixed; bottom: 0; width: 100%; }");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<header>");
            out.println("<h1>Panca Info Camera</h1>");
            out.println("</header>");
            out.println("<nav>");
            out.println("<a href=\"hubungi\">Hubungi Kami</a>");
            out.println("<a href=\"produk\">Produk</a>");
            out.println("<a href=\"home\">Home</a>");
            out.println("</nav>");
            out.println("<section>");
            out.println("<h2>Hubungi Kami</h2>");
            out.println("<p>Apakah Anda memiliki pertanyaan atau membutuhkan informasi lebih lanjut? </p>");
            out.println("<p>Hubungi kami melalui WhatsApp: <strong>088219566360</strong></p>");
            out.println("<p>Kami akan dengan senang hati membantu Anda!</p>");
            out.println("</section>");
            out.println("<footer>");
            out.println("<p>&copy; 2024 Panca Info Camera. All rights reserved.</p>");
            out.println("</footer>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "HubungiKamiServlet";
    }
}
