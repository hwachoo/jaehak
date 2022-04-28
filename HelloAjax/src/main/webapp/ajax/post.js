/**
 * post.js
 */

document.addEventListener('DOMContentLoaded', init);

//리스트
function init() {
	let xhtp = new XMLHttpRequest();
	xhtp.open('get', '../studentList.json');
	xhtp.send();
	xhtp.onload = function() {
		let data = JSON.parse(xhtp.responseText);
		console.log(data);
		let tbodyList = document.getElementById('list');
		data.forEach(function(elem) {
			let newTr = makeTr(elem);
			tbodyList.appendChild(newTr);
		})
	}//end of onload

	let modBtn = document.querySelector('input[type=button]');
	modBtn.addEventListener('click', function() {
		let no = document.querySelector('input[name=sno]').value;
		let name = document.querySelector('input[name=snm]').value;
		let engScore = document.querySelector('input[name=eng]').value;
		let korScore = document.querySelector('input[name=kor]').value;

		let xhtp = new XMLHttpRequest();
		xhtp.open('get', `modStudentServlet?a=${no}&b=${name}&c=${engScore}&d=${korScore}`);
		xhtp.send();
		xhtp.onload = function() {
			let result = JSON.parse(xhtp.responseText);
			if (result.retCode == 'success') {
				//결과값으로 받은 학생정보로 새로운 tr생성
				let obj = {
					studentNo: result.studentNo,
					studentName: result.studentName,
					engScore: result.engScore,
					korScore: result.korScore
				}
				let newTr = makeTr(obj);
				let oldTr = document.getElementById(result.studentNo);
				document.getElementById('list').replaceChild(newTr, oldTr); //새로운 tr -> 이전 tr 대체

			} else {
				alert('변경 중 오류 발생');

			}
		}
	})
}//end of init

//변경처리
function modStudent() {

}//end of modify

function addStudent(e) {
	e.preventDefault(); // submit 기본기능 차단
	console.log(e);

	let no = document.querySelector('input[name="sno"]').value;
	let name = document.querySelector('input[name="snm"]').value;
	let eng = document.querySelector('input[name="eng"]').value;
	let kor = document.querySelector('input[name="kor"]').value;

	let xhtp = new XMLHttpRequest();//비동기방식, 서버의 파일 요청
	xhtp.open('get', `addStudentServlet?sno=${no}&snm=${name}&eng=${eng}&kor=${kor}`);
	xhtp.send();
	xhtp.onload = function() { //xhtp가 열렸을 때 사용할 기능
		console.log(xhtp.responseText); //{"retCode":"success"}
		let result = JSON.parse(xhtp.responseText); //{"retCode":"Success"}
		if (result.retCode == 'success') {
			//리스트에 새로운 값 추가
			successCallBack2(result);
		} else if (result.retCode == 'Fail') {
			//처리중 에러 발생
			failCallBack();
		}
	}//end of onload function
}//end of addStudent(e)

function makeTr(student) {
	let tr = document.createElement('tr'); //document에 tr생성
	tr.setAttribute('id', student.studentNo); //라인삭제 시 id값을 기준으로 getElementById(id).remove();
	for (let field in student) {  //student['studNo'], student의 수만큼 반복
		let td = document.createElement('td'); //document에 td생성
		td.innerHTML = student[field]; //student의 필드값이 td에 삽입
		tr.appendChild(td); //tr의 하위요소 td
	}
	//삭제버튼생성
	let delBtn = document.createElement('button');
	delBtn.innerHTML = '삭제';

	//이벤트 등록
	delBtn.addEventListener('click', function() {
		//삭제 ==id파악, ajax호출 (this = 이벤트 대상 요소(버튼))
		let id = this.parentElement.parentElement.firstChild.innerHTML;
		console.log(id);
		let xhtp = new XMLHttpRequest();
		xhtp.open('get', 'delStudentServlet?delId=' + id);
		xhtp.send();
		xhtp.onload = function() {
			let result = JSON.parse(xhtp.responseText);
			if (result.retCode == 'OK') {
				alert(result.retVal + "번이 삭제되었습니다."); //result.retVal = studNo
				document.getElementById(result.retVal).remove();
			} else {
				console.log(result.retVal);
			}
		}
	})

	let td = document.createElement('td');
	td.appendChild(delBtn);
	tr.appendChild(td);

	return tr; //return값이 있어야 함
}

function successCallBack2(retObj) { //{retCode:?, studNo:?, studName:?, engScore:?, korScore:?}
	console.log(retObj);
	let obj = {
		studentNo: retObj.studentNo,
		studentName: retObj.studentName,
		engScore: retObj.engScore,
		korScore: retObj.korScore
	}
	document.getElementById('list').appendChild(makeTr(obj));
}//end of successCallBack2()

function successCallBack() {
	//사용자 입력값 id='list' 하위에 추가
	let studentNo = document.querySelector('input[name="sno"]').value;
	let studentName = document.querySelector('input[name="snm"]').value;
	let engScore = document.querySelector('input[name="eng"]').value;
	let korScore = document.querySelector('input[name="kor"]').value;

	let obj = {};
	obj.studentNo = studentNo;
	obj.studentName = studentName;
	obj.engScore = engScore;
	obj.korScore = korScore;

	document.getElementById('list').appendChild((makeTr(obj)));
}

function failCallBack() {
	alert('처리 중 에러발생');
}

