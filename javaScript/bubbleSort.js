let arr = [4,3,2,5,1]

for(let i= 0;i< arr.length;i++){
    for (let j = 0; j < arr.length-1-i; j++) {
        if (arr[j+1] < arr[j]) {
            let temp = arr[j+1];
            arr[j+1] = arr[j];
            arr[j] = temp
        }
        
    }
}
console.log(arr);