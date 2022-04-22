// variable.js

var myName = '이재학'; //String
var yourName; //undefined
myName = 100; //number
myName = true; //boolean
myName = null; //object

console.log(typeof myName);
var yourName = "홍길동";
console.log(typeof yourName);

//전역변수, 지역변수로 구분
//전역변수 : 스크립트 변수 
//지역변수 : 함수 안에서의 변수

function checkInfo(){ //지역변수
  var myName = 'Leejaehak';
  console.log(myName);
}
checkInfo(); //전역변수
console.log(myName);

//ES6 (Ecma Script)
// let 블럭레벨 변수선언.

function info() {
let myName = 'Hong';
console.log(myName);
}
info();

{
  let myName = 'Hong';
  console.log(myName);
}

{
  let myName = 'Hwang';
  console.log(myName);
}

const otherName = 'Hong';//한 번 선언한 값은 바꾸지 못함
//otherName = 'hwang';

//var, let -> 변수선언
//const -> 상수선언.
//