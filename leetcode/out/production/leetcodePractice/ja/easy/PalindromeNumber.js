
var isPalindrome = function (x){
    let str = x.toString();
    let i = 0;
    let j = str.length;

    while(i<x.length){
        if(str[i]===str[j]){
            i++;
            j--;
        }
        else return false;
    }
    return true;

}
console.log(isPalindrome(32));