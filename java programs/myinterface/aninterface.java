//variables are final static public by default//
//interface like an abstract,so object can not be instantiated under the interface [aninterface c = new aninteface()] //
//although we can declare an object [aninterface c[]= c [4]]//
//instantiation means creating an object with constructor--[()]//
//declaration of instant variables are NOT allowed, such as int x// 
//private and protected are not allowed in interface as it will be used by any kind of programs//
package myinterface;

public interface aninterface
{
	int a = 10;
	void display();
}