const student={
    name:"Rao",
    greetings:function()
    {
        console.log(`Welcome ${this.name} Sahab`);
    }
};
 
 
 
// setTimeout(student.greetings,1000);
 let a=()=> student.greetings();
setTimeout(function(){
 student.greetings();  
},2000);

setTimeout(()=> student.greetings(),2000);

setTimeout(a,2000);

let b= student.greetings.bind(student);
setTimeout(b,2000);

