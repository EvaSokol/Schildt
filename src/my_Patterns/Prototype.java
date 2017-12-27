package my_Patterns;

/**
 * Created by Eva Sokolyanskaya on 27/07/2017.
 * Pattern Prototype realization.
 */
public class Prototype
{
  public static void main(String[] args){
    Copyable prototype = new SpecificObject();
    SpecificObject clone = (SpecificObject)prototype.copy();
    clone.setType(SpecificObject.Type.FIRST_TYPE);
    clone.printInfo();
  }
}

interface Copyable {
  Copyable copy();
}

class SpecificObject implements Copyable {

    public enum Type {FIRST_TYPE, SECOND_TYPE}

    Type type;

    public Copyable copy() {
        return new SpecificObject();
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void printInfo() {
        System.out.println(this.getClass().toString());
    }
}
