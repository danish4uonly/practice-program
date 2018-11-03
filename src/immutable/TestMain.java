package immutable;

import java.util.Date;


//http://howtodoinjava.com/core-java/related-concepts/how-to-make-a-java-class-immutable/

class TestMain
{
    public static void main(String[] args)
    {
        ImmutableClass im = ImmutableClass.createNewInstance(100, "test", new Date());
        //ImmutableClass im1 = ImmutableClass.createNewInstance(1000, "test1", new Date());
        System.out.println(im);
        //System.out.println(im1);
        tryModification(im.getImmutableField1(),im.getImmutableField2(),im.getMutableField());
        System.out.println(im);
    }
 
    private static void tryModification(Integer immutableField1, String immutableField2, Date mutableField)
    {
        immutableField1 = 10000;
        immutableField2 = "test changed";
        mutableField.setDate(10);
    }
}

//As it can be seen that even changing the instance 
//variables using their references does not change their value, so the class is immutable.