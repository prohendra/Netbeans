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

@WebServlet(urlPatterns = {"/home"})
public class HomeServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Home - Simple Camera Store</title>");
            out.println("<style>");
            out.println("body { font-family: Arial, sans-serif; margin: 0; padding: 0; }");
            out.println("header { background-color: #3b372e; color: white; padding: 10px; text-align: center; }");
            out.println("nav { background-color: #444; overflow: hidden; }");
            out.println("nav a { float: right; display: block; color: white; text-align: center; padding: 14px 16px; text-decoration: none; font-weight: bold; }");
            out.println("nav a:hover { background-color: #ddd; color: black; }");
            out.println("section { padding: 0; margin: 0; position: relative; }");
            out.println("img { width: 100%; height: auto; }");
            out.println(".banner-text { position: absolute; top: 30%; right: 10px; color: white; font-size: 16px; font-weight: bold; background-color: rgba(255, 255, 255, 0.5); padding: 10px; border-radius: 5px; text-align: justify; width: 300px; }");
            out.println(".info-text { background-color: #3b372e; color: #fff; padding: 20px; margin: 20px auto; max-width: 800px; text-align: center; border-radius: 8px; font-size: 16px; }");
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
            out.println("<img src=\"https://www.argiacyber.com/wp-content/uploads/2013/07/fotografer.jpg\" alt=\"Featured Image\" class=\"featured-image\">");
            out.println("<div class=\"banner-text\">");
            out.println("<h3>Anda Sudah Memutuskan Untuk<br>Melakukan Langkah Yang Sangat<br>Besar Dalam Perjalanan Fotografi Anda <b>- Hendra</b>.</h3>");
            out.println("</div>");
            out.println("</section>");
            out.println("<section class=\"info-text\">");
            out.println("<p>Website ini hanyalah website yang memberikan informasi terkait barang yang ada di toko kami dan juga memberikan penjelasan terkait spesifikasi detail kamera yang Anda sukai.</p>");
            out.println("<p>Jika Anda berminat membeli, bisa langsung datang ke toko kami.</p>");
            out.println("</section>");
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
        return "HomeServlet";
    }
}
