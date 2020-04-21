package app;

import java.util.Arrays;

public class TheStack {
	
	private String[] stackArray;
	private int stackSize;
	
	// Sets stack as empty
	
	private int topOfStack = -1;
    
    /**
     * 
     * @param size
     */
	TheStack(int size){
		
		stackSize = size;
		
		stackArray = new String[size];
		
		// Assigns the value of -1 to every value in the array
		// so I control what gets printed to screen
		
		Arrays.fill(stackArray, "-1");
		
	} // end TheStack

    /**
     * 
     * @param input
     */
	public void push(String input){
		
		if(topOfStack+1 < stackSize){
			
			topOfStack++;
			
			stackArray[topOfStack] = input;
			
        } // end if 
        else { System.out.println("Sorry But the Stack is Full"); } // end else
		
		displayTheStack();
		
		System.out.println("PUSH " + input + " Was Added to the Stack\n");
		
	} // end push
    
    /**
     * 
     * @return
     */
	public String pop(){
		
		if(topOfStack >= 0){
			
			displayTheStack();
			
			System.out.println("POP " + stackArray[topOfStack] + " Was Removed From the Stack\n");
			
			// Just like in memory an item isn't deleted, but instead is just not available
			
			stackArray[topOfStack] = "-1"; // Assigns -1 so the value won't appear
			
			return stackArray[topOfStack--];
	
        } // end if 
        else {
			
			displayTheStack();
			
			System.out.println("Sorry But the Stack is Empty");
			
			return "-1";
		} // end else
		
	} // end pop
    
    /**
     * 
     * @return
     */
	public String peek(){
		
		displayTheStack();
		
		System.out.println("PEEK " + stackArray[topOfStack] + " Is at the Top of the Stack\n");
		
		return stackArray[topOfStack];
		
	} // end peek
    
    /**
     * 
     * @param multipleValues
     */
	public void pushMany(String multipleValues){
		
		String[] tempString = multipleValues.split(" ");
		
		for(int i = 0; i < tempString.length; i++){ push(tempString[i]); } // end for
		
	} // end pushMany
    
    /**
     * 
     */
	public void popAll(){
		
		for(int i = topOfStack; i >= 0; i--){ pop(); } // end for
		
	} // end popAll
    
    /**
     * 
     */
	public void popDisplayAll(){
		
		String theReverse = "";
		
		for(int i = topOfStack; i >= 0; i--){ theReverse += stackArray[i]; } // end for
		
		System.out.println("The Reverse: " + theReverse);
		
		popAll();
		
	} // end popDisplayAll
    
    /**
     * 
     */
	public void displayTheStack(){
		
        for(int n = 0; n < 61; n++)System.out.print("-"); // end for
        
        System.out.println();
        
        for(int n = 0; n < stackSize; n++){ System.out.format("| %2s "+ " ", n); } // end for
        
        System.out.println("|");
        
        for(int n = 0; n < 61; n++)System.out.print("-"); // end for
        
        System.out.println();
        
        for(int n = 0; n < stackSize; n++){
            
            if(stackArray[n].equals("-1")) System.out.print("|     ");
            
            else System.out.print(String.format("| %2s "+ " ", stackArray[n]));
            
        } // end for
        
        System.out.println("|");
        
        for(int n = 0; n < 61; n++)System.out.print("-");
        
        System.out.println();
		
	} // displayTheStack

    /**
     * 
     * @param args
     */
	public static void main(String[] args){
		
		TheStack theStack = new TheStack(10);
		
		theStack.push("10");
		theStack.push("17");
		theStack.push("13");
		
		// Look at the top value on the stack
		
		theStack.peek();
		
		// Remove values from the stack (LIFO)
		
		theStack.pop();
		theStack.pop();
		theStack.pop();
		
		// Add many to the stack
		
		theStack.pushMany("R E D R U M");
		
		// Remove all from the stack
		
		// theStack.popAll();
		
		// Remove all from the stack and print them
		
		theStack.popDisplayAll();
		
		theStack.displayTheStack();
		
	} // end main
	
} // end TheStack