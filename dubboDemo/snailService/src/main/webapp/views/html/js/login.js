var loginUrl = "http://localhost:8080/snail/login.do";


function login() {
    /*if (!$(".loginBtn").hasClass("active")) {
        return;
    }*/
    var username = $("#username").val();
    var password = $("#password").val();
    $.ajax({
        type: "post",
        url: loginUrl,
        data: { username: username, password: password},
        dataType: "html",
        success:function(data,result){
        	alert(data);
        	alert(result);
        	window.parent.self.location.href='http://localhost:8080/snail/index.do'
        },
    
        error: function (xhr, status, result) {
            //dialog("网络繁忙，请稍后重试！");
           alert("失败"+xhr.status);
           alert("失败status："+status)
        }
    });
}