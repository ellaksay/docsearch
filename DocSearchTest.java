import static org.junit.Assert.*;
import org.junit.*;
import java.net.URI;
import java.net.URISyntaxException;

public class DocSearchTest{
    @Test 
    public void docSearchTest() throws URISyntaxException{
        Handler h = new Handler("/Users/ellasay/Documents/GitHub/docsearch/technical");
        URI doc = new URI("http://localhost/");
        URI searchTerm = new URI("http://localhost/search?q=base-pair");
        assertEquals(h.handleRequest(doc), "There are 1391 files to search");
        assertEquals(h.handleRequest(searchTerm), "There were NNNN files found: ");
    }
}