public class User {

    private String email;
    private String password;
    private String fulName;
    private double balance;
    private Ticket[] ticketList;

    public java.lang.int  maxTicket()

    public User (String email, String password, String fullName, double balance);
    public  boolean adTicket (Ticket ticket);
    public void displayAllTicket();
    Public boolean isMatch (String email. String password);

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setFulName(String fulName) {
        this.fulName = fulName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
