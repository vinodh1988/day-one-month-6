interface Activity{
    public void receive(long x);
}

class Process{

    public static void fun(Activity fun){
         try{
             int i=1;
            while(i<=5){
                  fun.receive(Math.round(Math.random()*100000));
                  i++;
                  Thread.sleep(2000);
            }
         }
         catch(InterruptedException e){
             e.printStackTrace();
         }

    }
}

class First{
    public static void main(String n[]){
       /* Process.fun(new Activity(){
            
            public void receive(long x){
                System.out.println("Received "+x);
            }
        });*/

        Process.fun((x)->{
            System.out.println("Received "+x);
        });
    }

}