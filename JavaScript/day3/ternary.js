function callMarks(marks){
    let res=marks<40 ? "Failed and re-appear" : marks>=40 && marks<50 ? "Just passed do hard work" :marks>=50 && marks<70 ? "Passed as an average" : marks>=70 && marks<80 ? "passed with good numbers"
    : marks>=80 && marks<=90 ? "Passed with excellent numbers" : marks>90 && marks<100 ? "Amazing stuff bro" : "Enter valid marks." ;
    return res;
}

console.log(callMarks(91));