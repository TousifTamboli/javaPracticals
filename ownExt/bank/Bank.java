//4 types of access modifiers 
// public  - Accessible from everywhere.
// private - Accessible only within the same class.
// protected - Accessible within the same package and in subclasses.
// default - Accessible only within the same package.

class Account{
    //public
    public String name;
    //default
    String address;
    //protected
    protected String email;
    //private
    private String password;

    //for accessing private elements we use getters and setters
    
    //getter
    public String getPassword(){
        return this.password;
    }

    public void setPassword(String pass){
        this.password = pass;
    }
}

public class Bank {
    public static void main(String[] args){
        Account account1 = new Account();
        account1.name = "Tousif";
        account1.email = "tousiftamboli3@gmail.com";

        //accesing private elements
        account1.setPassword("123456");
        System.out.println(account1.getPassword());
    }
    
}
