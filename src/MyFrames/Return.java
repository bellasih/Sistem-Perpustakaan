
package MyFrames;

public class Return {
    private int rid;
    private int userid;
    private int borrow_id;
    private int rquantity;
    private String rdate;
    private int ransom;
    
    public Return(int rid,int userid,int borrow_id,int rquantity,String rdate, int ransom)
    {
        this.rid=rid;
        this.userid=userid;
        this.borrow_id=borrow_id;
        this.rquantity=rquantity;
        this.rdate=rdate;
        this.ransom=ransom;
    }
            
    public int getrid()
    {
        return rid;
    }
    public int getuserid()
    {
        return userid;
    }
    public int getborrow_id()
    {
        return borrow_id;
    }
    public int getrquantity()
    {
        return rquantity;
    }
    public String getrdate()
    {
        return rdate;
    }
    public int getransom()
    {
        return ransom;
    }
  }


