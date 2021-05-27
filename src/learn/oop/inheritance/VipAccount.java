package learn.oop.inheritance;

public class VipAccount {
    private String name;
    private double credit;
    private String email;

    public VipAccount() {
      this("Defaul name",500000,"default@email.com");
    }
    public VipAccount(String name, double credit) {
       this(name,credit,"unknown@email.com");
    }

    public String getName() {
        return name;
    }

    public double getCredit() {
        return credit;
    }

    public String getEmail() {
        return email;
    }

    public VipAccount(String name, double credit, String email) {
        this.name = name;
        this.credit = credit;
        this.email = email;
    }
}
