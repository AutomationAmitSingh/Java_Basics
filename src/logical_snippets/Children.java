package logical_snippets;

/* If Children class do not extend to the Parent Class then Up casting will
 * not possible and throw a compilation error that Type Mismatch : cannot convert
 * from Children to Parent (Compile Time).
 * 
 *  Parent calling Parent have access to Parent methods only
 *  
 *  Parent calling Children have access to Parent methods and Children methods can only
 *  be accessed by using down casting as Children object is up casted.
 *  
 *  Child class object up cast to super class reference. Using super class reference , sub class object can not use methods
	of sub class despite of being object of that class. Up casting restricts access or visibility of methods downwards
	
	To access sub class methods, super class reference needs to be downcast to sub class reference. Note here we can down cast
	to a up cast reference only.
	
	Children calling Children have access to child methods and parents methods if extended to it then only
	
	Children calling parent even extended to it still Type Mismatch error show : cannot convert from parent to children
	(Compile Time)
	
	Children calling Parent even extended to it with Down casting, then Compile time error will not come. But error will
	come at (Run Time)
	
	Exception in thread "main" java.lang.ClassCastException: logical_snippets.Parent cannot be cast to logical_snippets.Children
	at logical_snippets.Children.main(Children.java:83)
 *  
 *  If a super class method is overridden in sub class then up cast reference will use overridden method without downcast.
 *  
 *  Static method cannot be overridden in Child class from Parent class 
 */

class Parent
{
	
	public void parent_Print() 
	{
		System.out.println("<---Inside parent print method--->");
	}
	
	public void parent_Show() 
	{
		System.out.println("<---Inside parent show method--->");
	}
	
	public void print() 
	{
		System.out.println("<---Inside parent print method overriding--->");
	}
	
}

public class Children extends Parent {
	
	public void child_Print() 
	{
		System.out.println("<---Inside child print method--->");
	}
	
	public void child_Show() 
	{
		System.out.println("<---Inside child show method--->");
	}
	
	public void print() 
	{
		System.out.println("<---Inside child print method overriding--->");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
		p.parent_Print();
		p.parent_Show();
		
		Parent c = new Children();
		c.parent_Print();
		c.parent_Show();
		((Children) c).child_Print();
		((Children) c).child_Show();
		c.print();
		
		Children c2 = (Children) c;
		c2.parent_Print();
		c2.parent_Show();
		c2.child_Print();
		c2.child_Show();
		
		
		Children c1 = new Children();
		c1.child_Print();
        c1.child_Show();
        c1.parent_Print();
        c1.parent_Show();
        
        Children p1 = (Children) new Parent();
        p1.child_Print();
        p1.child_Show();
        p1.parent_Print();
        p1.parent_Show();
	

	}

}
