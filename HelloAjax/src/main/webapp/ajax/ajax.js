/**
 * ajax.js
 */

//비동기방식

let val = 10;
setTimeout(function() {
	val += 5;
	console.log('hello -> ' + val);

	setTimeout(function() {
		val += 3;
		console.log('hello1 -> ' + val);

		setTimeout(function() {
			val += 4;
			console.log('hello2 -> ' + val);
		}, 1000);

	}, 1000);

}, 2000); //2개의 매개값을 받음 (실행할 함수, 딜레이 줄 시간(1000 = 1초)) 


let success = true;
let promise = new Promise(function(resolve, reject) { //매개값을 함수로 받음 (정상처리 시, 에러발생 시)
	if (success) {
		resolve('success');
	} else {
		reject('error');
	}
});

promise.then(function(result) { //성공했을 시
	console.log(result);
	}) //성공
	.then(function(result) {
		console.log(result);
	})
	.then(function(result) {
		console.log(result);
	})
	.catch(function(err) { //실패했을 시
		console.log(err);
	}); //실패