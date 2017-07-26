package java.Patterns;

/**
 * Created by esokolyanskaya on 26/07/2017.
 */
public class Singleton
{
  private Singleton instance = null;
  private Singleton() {}
  
  public Singleton getInstance() {
    if (instance == null)
      return new Singleton();
    else return instance;
  }
}
