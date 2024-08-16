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

@WebServlet(urlPatterns = {"/produk"})
public class ProdukServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Produk - Simple Camera Store</title>");
            out.println("<style>");
            out.println("body { font-family: Arial, sans-serif; margin: 0; padding: 0; }");
            out.println("header { background-color: #3b372e; color: white; padding: 10px; text-align: center; }");
            out.println("nav { background-color: #444; overflow: hidden; }");
            out.println("nav a { float: right; display: block; color: white; text-align: center; padding: 14px 16px; text-decoration: none; font-weight: bold; }");
            out.println("nav a:hover { background-color: #ddd; color: black; }");
            out.println("section { padding: 20px; background-color: white; }");
            out.println(".gallery, .additional { display: flex; align-items: center; margin-bottom: 20px; }");
            out.println(".gallery img, .additional img { border-radius: 8px; }");
            out.println(".gallery img { width: 40%; height: auto; }");
            out.println(".text { width: 60%; max-width: 600px; }");
            out.println(".text p { margin: 0 0 10px; line-height: 1.6; text-align: justify; }");
            out.println(".text b { font-weight: bold; }");
            out.println(".additional { margin: 20px 0; }");
            out.println(".additional img { width: 30%; height: auto; margin-right: 20px; }"); // Smaller size for the second image
            out.println(".additional.reverse { flex-direction: row-reverse; }"); // Reverse direction for alternating layout
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
            out.println("<div class=\"gallery\">");
            out.println("<img src=\"https://www.bhinneka.com/blog/wp-content/uploads/2022/05/Canon-EOS-Rebel-SL3.webp\" alt=\"Canon EOS Rebel SL3\">");
            out.println("<div class=\"text\">");
            out.println("<p>Yang pertama datang dari brand Canon dengan nama <b>Canon EOS Rebel SL3</b>. Kamera DSLR buatan Canon ini termasuk dalam kamera yang cukup ramah dengan para pemula. Jajaran DSLR Canon selalu membuat para pengguna merasakan kemajuan teknologi dengan sangat cepat.</p>");
            out.println("<p><b>EOS Rebel SL3</b> baru adalah produk pembaharuan dari pendahulunya Rebel SL2. Dengan fitur tambahan dan gaya desain yang lebih modern. Canon EOS Rebel SL3 menjadi kamera untuk pemula yang sangat direkomendasikan. Kisaran harga kamera ini di pasaran adalah Rp. 10 jutaan.</p>");
            out.println("</div>");
            out.println("</div>");
            out.println("<div class=\"additional reverse\">");
            out.println("<img src=\"https://www.bhinneka.com/blog/wp-content/uploads/2023/12/Canon-EOS-6D-Mark-II.webp\" alt=\"Canon EOS 6D Mark II\">");
            out.println("<div class=\"text\">");
            out.println("<p><b>Canon EOS 6D Mark II</b> adalah kamera Canon yang juga menjadi pilihan yang tidak bisa Anda kesampingkan. Kamera ini menawarkan body langsing serta fitur yang memudahkan pengambilan foto. Dikenal dengan sensor 26,2 megapixel dan layar sentuh LCD Vari-angle, kamera ini sangat cocok bagi mereka yang mencari kualitas gambar dan kemudahan penggunaan.</p>");
            out.println("</div>");
            out.println("</div>");
            out.println("<div class=\"additional\">");
            out.println("<img src=\"https://www.bhinneka.com/blog/wp-content/uploads/2022/05/Kamera-Untuk-Pemula-Fujifilm-X-T200.webp\" alt=\"Fujifilm X-T200\">");
            out.println("<div class=\"text\">");
            out.println("<p><b>Fujifilm X-T200</b> adalah kamera mirrorless yang direkomendasikan untuk pemula. Reputasi Fujifilm dalam urusan foto memfoto tidak diragukan lagi. Kamera ini menawarkan sensor APS-C, resolusi 24.4 MP, dan kecepatan burst maksimum 8 fps. Kisaran harga kamera ini di pasaran adalah Rp. 8 juta-an.</p>");
            out.println("</div>");
            out.println("</div>");
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
        return "ProdukServlet";
    }
}
