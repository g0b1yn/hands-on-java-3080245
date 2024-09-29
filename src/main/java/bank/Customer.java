 package bank;

public class Customer
{
  private int id;
  private String name;
  private String username;
  private String password;
  private int accountId;
  private boolean authenticated;

  public void setId (int id)
  {
      this.id = id;
  }

  public int getId()
  {
    return this.id;
  }

  public void setName (String name)
  {
      this.name = name;
  }

  public String getName()
  {
    return this.name;
  }

  public void setUsername (String username)
  {
      this.username = username;
  }

  public String getUsername()
  {
    return this.username;
  }

  public void setPassword (String password)
  {
    this.password = password;
  }

  public String getPassword()
  {
    return this.password;
  }

  public void setAccountId (int accountId)
  {
    this.accountId = accountId;
  }

  public int getAcconutId()
  {
    return this.accountId;
  }


  public int getAccountId() {
    return this.accountId;
  }

  public void setAuthenticated(boolean authenticated)
  {
    this.authenticated = authenticated;
  }

  public boolean isAuthenticated()
  {
    return this.authenticated;
  }

  public Customer(int id, String name, String username,
      String password, int acoountId)
  {
    setId(id);
    setName(name);
    setUsername(username);
    setPassword(password);
    setAccountId(acoountId);
    setAuthenticated(false);
  }

}
