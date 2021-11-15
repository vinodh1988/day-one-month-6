
 a=function(x){
   return x.length>5?true:false
}

console.log(a("ravishankar"))
console.log(a("roger"))

p=["Roger","Rakesh","Sanjay","Nareshkumar","Josesph","Prakash","Vivek","Varunkumar"]

output=p.filter(a)

console.log(output)

mapoutput=p.map(x=>"Hello!"+x)

console.log(mapoutput)

 reduceoutput=p.reduce(
 (a,b)=>{
		console.log(a,b)
		return a.length>b.length?a:b
	}
)
console.log(reduceoutput)

//console.log(reduceoutput)