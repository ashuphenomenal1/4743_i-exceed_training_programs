function display(...args){

    for(i in args){

        if(args[i]=="Karnataka"){
            console.log(`${args[i]} is the commercial capital of India`)
        }

    }



}

setTimeout(display,4000,"Andra","Tamil Nadu","Karnataka","Kerala");