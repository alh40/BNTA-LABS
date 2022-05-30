stations = ["Dundee", "Edinburgh", "North Berwick", "Newcastle", "York", "Leeds", "Doncaster", "Peterborough"];


/**
 * Q1.
 * The East Coast Main Line doesn't stop at Peterborough! Add London Kings Cross to the end of the array to complete the line.
 */
stations.push("London Kings Cross");
console.log(stations);

/**
 * Q2.
 * It doesn't go as far as Dundee either, so remove it from the start of the array.
 */

 stations.shift(0);
 console.log(stations);

 /**
 * Q3.
 * How many stations are on the line?
 */

let stationCount = null;

for(let i = 0; i < stations.length; i++){
    stationCount++;
}

console.log("There are " + stationCount + " stations.");



/**
 * Q4.
 * Which station is the third stop?
 */

thirdStation = null;

for(let i = 0; i < stations.length; i++){
    if(i = 2){
        thirdStation = stations[i];
        break;
    }
}

console.log("The third station is " + thirdStation);



/**
 * Q5.
 * Someone put the wrong Berwick on the timetable! Update "North Berwick" to "Berwick-upon-Tweed".
 */

for(let i = 0; i < stations.length; i++){
    if(stations[i] === "North Berwick"){
        stations[i] = "Berwick-upon-Tweed";
        break;
    }
}

console.log(stations);



/**
 * Q6.
 * How did Leeds get on there? Better remove it.
 */
const elementToDelete = stations.indexOf("Leeds");
stations.splice(4, 1)
console.log(stations);



/**
 * Q7.
 * We forgot about Darlington! Add it to the route between Newcastle and York.
 */

stations.splice(3, 0, "Darlington");
console.log(stations);



/**
 * Q8.
 * Is Durham one of the stops?
 */

stoppingAtDurham = null;

for(let i = 0; i < stations.length; i++){
    if(stations[i] === "Durham"){
        stoppingAtDurham = true;
        break;
    }else{
        stoppingAtDurham = false;
    }
}

console.log(stoppingAtDurham);


/**
 * Q9.
 * If we are stopping at Durham, print "Yay Durham!" to the terminal. If not print "Aww...".
 */

 stoppingAtDurham = null;

 for(let i = 0; i < stations.length; i++){
     if(stations[i] === "Durham"){
         stoppingAtDurham = true;
         break;
     }else{
         stoppingAtDurham = false;
     }

     stoppingAtDurham === true ? console.log("Yay Durham!"): console.log("Aww..."); 
 }
 
 