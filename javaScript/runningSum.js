let nums = [1,2,3,4]
let runningSum = [0,0,0,0]
for(let i = 0;i<nums.length;i++){
    let sum = 0;
for(let j = 0;j <= i;j++){
    sum += nums[j];
}
runningSum[i] = sum;
}
console.log(runningSum);