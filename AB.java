class A{
          static void m1(){
             System.out.println("A m1");
      }
}
class B{
          static void m1(){
              System.out.println("B m1");
       }
       public static void main(String[] args){
             System.out.println("B main");
           m1();
            A.m1();
       }
}