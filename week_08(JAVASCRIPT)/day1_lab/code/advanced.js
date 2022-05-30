unitedKingdom = [
    {
        name: "Scotland",
        capital: "Edinburgh",
        population: 5454000,
        touristAttractions: [
            "Stirling Castle",
            "Loch Ness"
        ]
    },
    {
        name: "England",
        capital: "London",
        population: 55980000
    },
    {
        name: "Wales",
        capital: "Swansea",
        population: 3163000,
        touristAttractions: [
            "Snowdonia"
        ]
    },
    {
        name: "Northern Ireland",
        capital: "Belfast",
        population: 1885000,
        touristAttractions: [
            "Titanic Museum",
            "Giant's Causeway"
        ]
    }
]

/**
 * Q1. Add some tourist attractions to England
 */

 england = unitedKingdom[1].touristAttractions = ["Buckingham Palace", "BlackPool Tower"];

 console.log(england);

 /**
 * Q2. Change the capital of Wales to "Cardiff"
 */



 for(let i = 0; i < unitedKingdom.length; i++){
    if(unitedKingdom[i].name === "Wales"){
        unitedKingdom[i].capital = "Cardiff";
        wales = [i];
        unitedKingdom.indexOf
        break;
    }
 }
console.log(unitedKingdom[wales]);



/**
 * Q3. Find a method in the documentation which will give you all of the available keys for Northern Ireland
 */

northernIrelandKeys = null;
keyArray =[];
countryName = unitedKingdom[3].name;
for(i in unitedKingdom){
    if(unitedKingdom[i].name === countryName){
    for(item in unitedKingdom[i]){
        keyArray.push(item);
    }
}
}
northernIrelandKeys = `All available keys for ${countryName} = ${keyArray}`;
console.log(northernIrelandKeys);


/**
 * Q4. Use an if statement to compare the population of Scotland to the other countries and print out if it is the biggest, smallest or somewhere in the middle.
 */
let scotlandPopulation = unitedKingdom[0].population;
let biggest = 0;
let smallest = 0;
let somewhereInTheMiddle = 0;
for(i in unitedKingdom){
    if(unitedKingdom[i].name !== "Scotland"){
        if(scotlandPopulation > unitedKingdom[i].population){
            smallest = unitedKingdom[i].population;
        } else if(unitedKingdom[i].population > scotlandPopulation){
            biggest  = unitedKingdom[i].population;
        }
        }
    }
    for(i in unitedKingdom){
        if(unitedKingdom[i].name !== "Scotland"){
        if(unitedKingdom[i].population < biggest && unitedKingdom[i].population > smallest){
            somewhereInTheMiddle = unitedKingdom[i].population;
        }
    }
    }

console.log(smallest)
console.log(somewhereInTheMiddle)
console.log(biggest)
