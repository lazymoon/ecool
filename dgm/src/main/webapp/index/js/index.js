$(function() {
//	$("#templatemo_modal").modal({show:true});
});

$("#login").click(
	function(){
		$.ajax({
            type: "get",//使用get方法访问后台
            dataType: "json",//返回json格式的数据
            url: "/dgm/user/login.do",//要访问的后台地址
            data: "username=" + $("#username").val() + "&password=" + $("#password").val(),//要发送的数据
            success: function(msg){//msg为返回的数据，在这里做数据绑定
                var loginMessage = msg.actionMessage;
                if(loginMessage == "success"){
                	$("#templatemo_modal").modal({show: false});
                	location.reload();
                } else{
                	$("#loginMessage").html(loginMessage);
                	$("#loginMessage").show();
                }
            }
		});
});



