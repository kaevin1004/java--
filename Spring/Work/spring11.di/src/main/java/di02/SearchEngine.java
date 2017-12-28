package di02;

import java.util.ArrayList;
import java.util.List;

public class SearchEngine implements ISearchEngine {

    @Override
    public List<Document> findByType(Type documentType) {
        
        List<Document> rs = new ArrayList<Document>();
        
        rs = storage();
        
        return rs;
    }

    @Override
    public List<Document> listAll() {
        
        return null;
    }
    
    private List<Document> storage(){
    
    List<Document> rs = new ArrayList<Document>();
    Type pdfType = new Type();
    pdfType.setName("PDF");
    pdfType.setDesc("Portable Doucment");
    pdfType.setExtension(".pdf");
    
    Document doc1 = new Document();
    
    doc1.setLocation("/book/Book.pdf");
    doc1.setName("Book");
    doc1.setType(pdfType);
    rs.add(doc1);
    
    Document doc2 = new Document();
    
    doc2.setLocation("/book/Sample.pdf");
    doc2.setName("Sample");
    doc2.setType(pdfType);
    rs.add(doc2);
    
    
    return rs;
    
    }
}
