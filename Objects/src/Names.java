
public class Names {
    private String password = "KINGKONG";

    public String confimation(String entered)
    {
        if(entered.equals(password))
        {
            System.out.println("the password is correct.");
            return "true";
        }else{
            System.out.println("incoreect password.");
            return "false";
        }
    }

}
