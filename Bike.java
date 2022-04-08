class Bike{

Bike(){
System.out.println("Bike is created");
}

Bike(String color){
	this("black",1234);
System.out.println("Bike color is"+color);
}

Bike(String color, int number){
System.out.println("Bike color is"+color);
}

public static void main(String args[]){
//Bike b = new Bike();
Bike b1 = new Bike("red");
Bike b2 = new Bike("red",5005);


}

}