package uap.bases;

public abstract class shape {
  private String name;

  public void setName(String name){
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  public abstract void printInfo();

}
