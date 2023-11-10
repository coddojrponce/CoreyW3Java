
import java.util.Random;

public class Cookie{
    private String flavor;
    private String toppings;
    private boolean sugarFree;
    private int size;
    private String texture;
    private int numberOfImperfections;
    private String shape;

    public Cookie(){

    }

    public Cookie(String flavor,String toppings,boolean sugarFree,int size,String texture, String shape){
        this.flavor = flavor;
        this.toppings = toppings;
        this.sugarFree = sugarFree;
        this.size = size;
        this.texture = texture;
        this.shape = shape;
        Random num = new Random();
        this.numberOfImperfections=num.nextInt();

    }

    public void getInfo(){

        System.out.println("This is the cookie flavor");
        System.out.println(this.flavor);
        System.out.println("This is the cookie toppings");
        System.out.println(this.toppings);
        System.out.println("This is the cookie size");
        System.out.println(this.size);
        System.out.println("This is the cookie imperfections");
        System.out.println(this.numberOfImperfections);
    }

    public String getFlavor(){
        return this.flavor;
    }

    public void setFlavor(String flavor){
        this.flavor = flavor;
    }









}