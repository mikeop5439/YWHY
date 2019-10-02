function queryOrderCount(user_id,path){
    $.ajax({
        type:"POST",
        url:path+"/order/queryCount.action",
        data:"user_id="+user_id,
        dataType:"json",
        success:function(data){
            $("#order_all_count").empty();
            $("#order_all_count").append(data.order_all_count);
            $("#order_end_count").empty();
            $("#order_end_count").append(data.order_ent_count);
        }
    });
}
function queryHistoryOrder(user_id,path){
    $.ajax({
        type:"POST",
        url:path+"/order/queryHistoryOrder.action",
        data:"user_id="+user_id,
        dataType:"json",
        success:function(data){
            if (data.length==0){
                $("#gzdiv").empty();
                var div1=$("<div></div>").attr("align","center").attr("href","#modal");
                var h3=$("<h3></h3>")
                $("#gzdiv").append(div1).append(h3.append("没有查询到历史商机！"));
            }else {
                $("#information-area").empty();
                $.each(data, function (index, content) {
                    var path1 = "'" + path + "'";
                    var date = SetTime(content.orderStartDate);
                    var text_centent = content.orderText;
                    var titel_centent = content.orderUserName + "," + date + "  (发单人：" + content.userName + ")";
                    var index1 = index % 4 + 1;
                    var text1 = "ac-" + index1;
                    var text2 = "grid" + index1;
                    var div1 = $("<div></div>");
                    var input = $("<input />").attr("id", text1).attr("name", "accordion-1").attr("type", "checkbox");
                    var i = $("<i />").attr("id", "kkk");
                    var label = $("<label></label>").attr("for", text1).addClass(text2).append(i).append(titel_centent);
                    var article = $("<article></article>").addClass("ac-small");
                    var p = $("<p></p>").append(text_centent);
                    var a = $("<a></a>").attr("href", "#modal").attr("onClick", "queryOrderDetil(" + content.orderId + "," + path1 + ")");
                    var div2 = $("<div></div>").attr("align", "center").attr("href", "#modal").css({"background-color": "#E259C6"});
                    var font = $("<font></font>").attr("color", "#FFFFFF").attr("size", "4").append("查看详情");
                    var information = div1.append(input).append(label).append(article.append(p).append(div2.append(a.append(font))));
                    $("#information-area").append(information);
                });
            }
        }
    });
}
function queryOrderDetil(orderId,path){
    window.open(path+"/order/queryHistoryOrderByOrderId.action?orderId="+orderId);
}