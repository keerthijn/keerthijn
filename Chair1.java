public class Chair{
public static void main(String[]args){
Train train=new train();
train.make="metal";
train.price=6000.f;
train.capacity=9.0f;
train.color="blue";
train.weight=100.0f;
System.out.println(train.make);
System.out.println(train.price);
System.out.println(train.capacity);
System.out.println(train.color);
System.out.println(train.weight);
Train train2=new Train();
train2.speed=train.speed;
train2.price=train.price;
train2.capacity=train.capacity;
train.color=train.color;
train2.weight=train.weight;
System.out.println(train2.price);
System.out.println(train2.color);
Train train3=new Train();
System.out.println(train3.price);
System.out.println(train3.color);
Train train4=new Train();
System.out.println(train4.price);
System.out.println(train4.color);
}
}
