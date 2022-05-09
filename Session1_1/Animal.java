public class Animal {
    
    // instance variables
    private int height;
    private int weight;

    public Animal() {}
    public Animal(int h, int w){
        height = h;
        weight = w;
    }
    
    public int getHeight(){
        return height;
    }

    public void setHeight(int h){
        if(h>0){
            height = h;
        }
    }

    // methods
    public void MakeNoise(){
        System.out.println("I am an animal");
    }

    //abstract public void MakeNoise();
}
