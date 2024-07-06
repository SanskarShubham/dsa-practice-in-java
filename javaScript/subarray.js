let arr = [5,2,-4,-5, 3,-1,2,3,1]
let maxSum  =arr[0];
for (let i = 0; i < arr.length; i++) {
    for(let j = i; j < arr.length; j++){
        let sum = 0;
        for(let k =i; k<=j;k++){
            sum += arr[k];
        }
       if (sum > maxSum) {
           maxSum = sum
       }
    }
    
}
console.log(maxSum);