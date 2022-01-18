class A{
     static void m1(){
          System.out.printlln("A m1");
        }
}

class B{
     static void m2(){
           System.out.println("B m2");        
                 A.m1();
        } 
}