public class Dog{
public static void main(String[]args){
Fish fish=new Fish();
fish.make="paper fish";
fish.price=6000.f;
fish.capacity=9.0f;
fish.color="pink";
fish.weight=6.0f;
System.out.println(fish.make);
System.out.println(fish.price);
System.out.println(fish.capacity);
System.out.println(fish.color);
System.out.println(fish.weight);
Fish fish2=new Fish();
fish2.make=fish.make;
fish2.price=fish.price;
fish2.capacity=fish.capacity;
fish2.color=fish.color;
fish2.weight=fish.weight;
System.out.println(fish2.price);
System.out.println(fish2.color);
Train train=new Train();
train.make="metal";
train.price=6000000.f;
System.out.println(train.make);
System.out.println(train.price);
Train train=new Train();
train.make=fish.make;
train.price=fish.price;
System.out.println(train.make);
System.out.println(train.price);
}
}
