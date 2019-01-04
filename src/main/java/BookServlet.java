import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@WebServlet(urlPatterns = "/show")
public class BookServlet extends BaseServlet {
    private BookService bookService = new BookService();

    public String query(HttpServletRequest request , HttpServletResponse response){
        String cid = request.getParameter("cid");
        List<Book> bookList = bookService.query(cid);
        request.setAttribute("bookList",bookList);
        return "/booklist.jsp";
    }

    public String desc(HttpServletRequest request,HttpServletResponse response){
        String bid = request.getParameter("bid");
        Book book = bookService.findById(bid);
        request.setAttribute("book",book);
        return "/booklist.jsp";
    }


}
