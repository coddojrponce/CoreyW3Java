public class Apple{

    public String shape;
    public String taste;
    public int redness;
    public double radius;
    public boolean isFruit;
    public boolean didThrow = false;


    public Apple(){
        
    };

    public Apple(String shape,String taste, int redness,double radius,boolean isFruit){
        this.shape = shape;
        this.taste = taste;
        this.redness = redness;
        this.radius = radius;
        this.isFruit = isFruit;

    }

    public void throwApple(){
        if(this.didThrow ==true){
            System.out.println("Already thrown");
        }
        System.out.println("Throwing an apple");
        this.didThrow = true;
    }




}