public class FishRunner{
public static void main(String[]args){
Fish fish=new Fish();
System.out.println(fish.make);
System.out.println(fish.price);
System.out.println(fish.capacity);
System.out.println(fish.color);
System.out.println(fish.weight);
fish.make="paper fish";
fish.price=6000.f;
fish.capacity=9.0f;
fish.color="pink";
fish.weight=6.0f;
Fish fish2=new Fish();
System.out.println(fish2.price);
System.out.println(fish2.color);
Fish fish3=new Fish();
System.out.println(fish3.price);
System.out.println(fish3.color);
Fish fish4=new Fish();
System.out.println(fish4.price);
System.out.println(fish4.color);
}
}
