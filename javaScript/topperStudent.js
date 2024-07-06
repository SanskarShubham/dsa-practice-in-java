
let arr = [1,2,3,4,0]
let res =[]
for(let i =0;i<arr.length-1;i++){
    let j
    for ( j =i+1 ; j < arr.length; j++) {
        if(arr[i] < arr[j]){
            break
        }    
    }
    if (j == arr.length ) {
        res.push(arr[i])
    }
}
res.push(arr[arr.length-1])
console.log(res)