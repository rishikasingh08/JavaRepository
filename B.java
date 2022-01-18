class B{
      static void m1(){
         System.out.println("B m1");
       } 
}

class A{
       static void m2(){
           System.out.println("A m2");
                 B.m1();
       }
}