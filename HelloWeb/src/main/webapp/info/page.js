//page.js
console.log(member1);

let field = 'fullName';
console.log(member1.fullName);
console.log(member2['fullName'])
console.log(member3[field]);

//배열요소를 반복적으로 읽어올 때 for.. of
for(let member of members) {
  console.log(`이름은 ${member['fullName']}이고 나이는 ${member['age']}이고 점수는 ${member['score']} 입니다.`);
}//members의 속성들을 배열순으로 가져옴

//오브젝트의 속성(필드)을 반복적으로 for.. in
for(let field in member1) {
  console.log(`${field} => ${member1[field]}`);
}console.log(`-----------------------------------`)
//member1의 속성을 반복하여서 전부 가져옴

//각 배열요소의 각 필드를 출력
for(let member of members) {
  for(let prop in member){
    console.log(`${prop} => ${member[prop]}`);
  }
  console.log(`-----------------------------------`)
}

document.write('<table border=1');
let fields = ['fullName', 'score']; //필드 하나를 제외하면 제외한 값 출력되지 않음
//순서를 바꾸면 바꾼 순서대로 출력
for(let member of members) {
  document.write('<tr>');
  for(let prop of fields){
    console.log(`${prop} => ${member[prop]}`);
    document.write(`<td>${member[prop]}</td>`);
  }
  document.write('<td><button>클릭</button></td>');
  document.write('</tr>');
  console.log(`-----------------------------------`)
}
document.write('</table>');