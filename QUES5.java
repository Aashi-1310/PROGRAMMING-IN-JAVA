//Write a program to implement stack. Use exception handling to manage underflow and overflow conditions. 

class StackException extends Exception{
  
    String detail;
    StackException(String s)
    {
        detail = s;
    }
    
    public String toString(){
        return "Stack Exception - " + detail;
}
}
class Stack {
   private int stk[];
   private int tos;
   
   Stack(int size) 
   {
       stk = new int[size];
       tos = -1;
   }
   
   void push(int item) throws StackException
   {
           if(tos == stk.length - 1)
               throw new StackException("Stack Overflow");
            else
               stk[++tos]=item;
    }
   
   int pop() throws StackException
   {
       if(tos < 0)
           throw new StackException("Stack Overflow");
       else
           return stk[tos--];
   }
}
class StackDemo{
     public static void main(String args[])
     {
         Stack s = new Stack(5);

         try{
             //push
             for(int i=0; i<6; i++) s.push(i);
             
             //pop
             System.out.println("Stack:");
             for(int i=0; i<5; i++)
                 System.out.println(s.pop());
         }
         catch (StackException e)
         {
             System.out.print("Exception Caught: " + e);
         }
         
     }
}

