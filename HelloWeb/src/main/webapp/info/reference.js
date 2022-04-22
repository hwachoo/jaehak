//reference.js

//참조변수
const names = ['홍길동', '박철수', '김정숙', '이가자'];

for (let i=0; i<names.length; i++) {
  console.log((i+1) +'번째 이름:' + names[i]);
}

//enhanced for. for(String name : names) {}
for( let name of names) {
  console.log(name);
}

const numbers = [23, 44, 38, 12, 56];
for(let num of numbers){
  if(num > 40) {
    console.log(num);
  }
}

const inputs = []; //입력값 담을 배열 선언

for(let i=0; i<numbers.length; i++){
  var inputVal = prompt('값을 입력하세요...'); //사용자 입력값 받기
  console.log(typeof inputVal, inputVal);
  inputs[i] = parseInt(inputVal);
}
//합계, 평균 구하기

let sum = 0, avg;
for(let i=0; i<inputs.length; i++) {
  sum += inputs[i];  
}
avg = sum / inputs.length;

console.log(sum, avg);
