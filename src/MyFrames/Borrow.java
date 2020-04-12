package MyFrames;

public class Borrow {

    private int borrowid;
    private int uidf;
    private int bidf;
    private int qbb;
    private String db;
    private String dr;
    
    public Borrow(int borrowid, int uidf, int bidf, int qbb, String db, String dr)
    {
        this.borrowid=borrowid;
        this.uidf=uidf;
        this.bidf=bidf;
        this.qbb=qbb;
        this.db=db;
        this.dr=dr;
    }

    Borrow(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            
    public int getborrowid()
    {
        return borrowid;
    }
    public int getuidf()
    {
        return uidf;
    }
    public int getbidf()
    {
        return bidf;
    }
    public int getqbb()
    {
        return qbb;
    }
    public String getdb()
    {
        return db;
    }
    public String getdr()
    {
        return dr;
    }
  }
