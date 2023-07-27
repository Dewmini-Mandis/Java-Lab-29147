
 
package com.mycompany.q1;


public interface MyFirstInterface
{
//int x;  
//error :- A value must be assigned for a final variable.
    
int x=10;

//public static final int x = 10;
/*There is no difference between these two approaches.Because with or without the keywords public static final, the variable x in the interface is implicitly considered as a constant.*/
  
  void display();
  //abstract void display();
  /*There is no difference between these two approaches.Because when declaring a method in an interface, it is automatically considered as an abstract method, even if you don't explicitly use the abstract keyword.*/
  
}
