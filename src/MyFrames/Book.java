
package MyFrames;

public class Book {
    private int bid;
    private String btitle;
    private int ed;
    private int pubyear;
    private String publisher;
    private String author;
    private int quantity;
    private int price;
    
    public Book(int bid, String btitle, int ed,int pubyear, String publisher, String author, int quantity, int price)
    {
        this.bid=bid;
        this.btitle=btitle;
        this.ed=ed;
        this.pubyear=pubyear;
        this.publisher=publisher;
        this.author=author;
        this.quantity=quantity;
        this.price=price;
    }

    Book(int aInt, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getbid()
    {
        return bid;
    }
    public String getbtitle()
    {
        return btitle;
    }
    public int geted()
    {
        return ed;
    }
    public int getpubyear()
    {
        return pubyear;
    }
    public String getpublisher()
    {
        return publisher;
    }
    public String getauthor()
    {
        return author;
    }
    public int getquantity()
    {
        return quantity;
    }
    public int getprice()
    {
        return price;
    }
  }


