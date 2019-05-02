//자바 스크립트가 알아서 boolean으로 형변환한다,
//리턴값이 null이거나 undefined면 false로 바꾼다.
if (window.localStorage.getItem('email')) {
//document.querySelector('#email').value = localStorage.getItem('email')
  document.querySelector('#email').value = localStorage.email
}

document.querySelector('#login-btn').onclick = () => {
  var xhr = new XMLHttpRequest()
  xhr.onreadystatechange = function() {
    if (xhr.readyState != 4 || xhr.status != 200)
      return;

    var data = JSON.parse(xhr.responseText);
    if (data.status == 'success'){
      location.href = "../index.html"

    } else {
      alert('로그인 실패입니다!\n' + data.message)
    }
  };
  xhr.open('POST', '../../app/json/auth/login', true)
  xhr.setRequestHeader('Content-Type' ,'application/x-www-form-urlencoded');

  var email = document.querySelector('#email').value;
  var password = document.querySelector('#password').value;

  if (document.querySelector('#saveEmail:checked') != null) {
    // 웹 브라우저의 로컬 스토리지에 이메일을 저장한다.
//  window.localStorage.setItem('email', email);
    window.localStorage.email = email;

  } else {
    window.localStorage.removeItem("email");
  }

  var  qs = 'email=' + email + '&password=' + password;
  xhr.send(qs);
};



