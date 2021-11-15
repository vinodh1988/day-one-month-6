
list=[12,2354,235,234,563,56326,346,34,5634,645,324]

passable=function(a,b){
	
	console.log(a,b)
	
	if(a>b)
	   return a
	else
	   return b
}


 result = list.reduce(passable)
 
 console.log("-----------------------------")
 
 console.log(result)
 
 /*
 
 https://1drv.ms/u/s!At0KVF4QsIBshYVKXDEh7tLv4uFTGQ?e=DXJjHo
 
 */