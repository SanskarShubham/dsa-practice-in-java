let arr = [1, 2, 3, 4]
let count = 0;
for (let i = 0; i < arr.length; i++) {
    for (let j = 0; j < arr.length; j++) {
            if (arr[i] > arr[j] && i > j) {
              count++;  
            }        
    }
    
}
console.log(count)