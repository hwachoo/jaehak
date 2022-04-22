//object.js
let member1 = {
 fullName : 'Hong',
 age : 20,
score : 80
};
let member2 = {
  fullName : "hwang",
  age : 22,
  score : 88
}
let member3 = {
  fullName : "park",
  age : 25,
  score : 92
}
member1.fullName = "홍";
console.log(member1.fullName)
console.log(member1.age + member2.age)
//{key: value}, {key: value}

const members = [member1, member2, member3];
//홍의 나이는 20, 점수 80
//hwang의 나이는 22, 점수 88
//park의 나이는 25, 점수 92

//document = 문서 영역에 대한 명령
document.write('<ul>');
for(let i = 0; i < members.length; i++){
//document.write('<li>'+ members[i].fullName +', ' + members[i].age +', '+ members[i].score + '</li>');

document.write(`<li>${members[i].fullName}, ${members[i].age}, ${members[i].score}</li>`);
}
document.write('</ul>');
let welcome = `안녕하세요. 반갑습니다`;
console.log(welcome)

console.log(member1.fullName+"의 나이는" + member1.age + "의 점수는" + member1.score);
console.log(member2.fullName+"의 나이는" + member2.age + "의 점수는" + member2.score);
console.log(member3.fullName+"의 나이는" + member3.age + "의 점수는" + member3.score);