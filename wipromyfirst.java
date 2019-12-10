class Animal
{
public void eat()
{System.out.println("The animal is eating ");
}
public void sleep()
{System.out.println("The animal is sleeping ");
}
}

class Bird extends Animal
{ 
public void eat()
{System.out.println("The bird is eating ");
}
public void sleep()
{System.out.println("The bird is sleeping ");
}
}
class Test 
{
public static void main(String [] args)
{Animal a=new Animal();
Bird b=new Bird();
a.eat();
a.sleep();
b.eat();
b.sleep();
}
}