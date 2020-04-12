package MyFrames;

public class User {

    private int id;
    private String username;
    private String name;
    private String mno;
    private String address;
    private String email;
    private String password;
    
    public User(int id,String username,String name,String mno,String address,String email, String password)
    {
        this.id=id;
        this.username=username;
        this.name=name;
        this.mno=mno;
        this.address=address;
        this.email=email;
        this.password=password;
    }
            
    public int getid()
    {
        return id;
    }
        public String getusername()
    {
        return username;
    }
    public String getname()
    {
        return name;
    }
    public String getmno()
    {
        return mno;
    }
    public String getaddress()
    {
        return address;
    }
    public String getemail()
    {
        return email;
    }
    public String getpassword()
    {
        return password;
    }
}
