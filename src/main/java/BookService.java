import java.util.List;

public class BookService {
    private BookDao bookDao = new BookDao();

    public List<Book> query(String cid) {
        try {
            if (cid == null || cid.isEmpty()) {
                return bookDao.query();
            } else {
                return bookDao.query(cid);
            }
        } catch (Exception e){
            throw new RuntimeException();
        }
    }

    public Book findById(String bid){
        try {
            return bookDao.findById(bid);
        } catch (Exception e){
            throw new RuntimeException();
        }
    }
}
