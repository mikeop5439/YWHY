function queryOrderSupportGroup(user_id,path) {
    $.ajax({
        type:"POST",
        url:path+"/order/querySupportGroup.action",
        data:"user_id="+user_id,
        dataType:"json",
        success:function(data){
            $("#orderSupportId").empty();
            $.each(data,function(index,content){
                var option = $("<option></option>").attr("value",content.supportId).append(content.supportName);
                $("#orderSupportId").append(option);
            });
        }
    });
}
function chechkInputAfterSubmit(path){
    if(checkInput()){
        submitForm(path);
    }else{
        return false;
    }
}
function submitForm(path) {
    var option = {
        url : path+"/order/submitOrder.action",
        type : 'POST',
        dataType : 'json',
        headers : {"ClientCallMode" : "ajax"}, //添加请求头部
        success : function(data) {
                window.location.href=path+"/ywhy/success.html";
        }
    };
    $("#form1").ajaxSubmit(option);
}
function checkInput(){
    var flag = true;
    var reg = /^1(3|4|5|7|8|9)[0-9]{9}$/
    if($("#orderUserName").val()==null || $("#orderUserName").val()==""){
        alert("用户称呼不能等于空！");
        $("#orderUserName").focus();
        flag =false;
        return ;
    }else if($("#orderTele").val()==null || $("#orderTele").val()==""){
        alert("联系电话不能为空！");
        $("#orderTele").focus();
        flag =false;
        return ;
    }else if(!(reg.test($("#orderTele").val()))){
        alert("请输入11位有效手机号码！");
        $("#orderTele").focus();
        flag =false;
        return ;
    }else if($("#orderText").val()==null || $("#orderText").val()==""){
        alert("用户需求不能为空！");
        $("#orderText").focus();
        flag =false;
        return ;
    }
    return flag;
}
function logOut(path){
    $.ajax({
        headers : {"ClientCallMode" : "ajax"},
        type:"POST",
        url:path+"/user/logout.action",
        success:function(data){
            window.location.href=path+"/ywhy/login.jsp";
        }
    });
}
