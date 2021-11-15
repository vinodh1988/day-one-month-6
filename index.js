

function fun(p){
   a=1
   console.log("I have five random numbers to send i ll send it "
   +" every 2 seconds and you have to get it using call back")
   
   x=setInterval(function(){
	   p(Math.round(Math.random()*100000))
	   a++
	   if(a==6)
	   clearInterval(x)
   },2000)
   
}
//p can be number, string, boolean, object , array , function

function caller(){

    fun( function(random){
		
	   console.log('received random value',random);
	} )
	
}


caller()