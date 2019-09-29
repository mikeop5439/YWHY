function SetTime(a) {
        var date = new Date(parseInt(a, 10));
        var month = date.getMonth() + 1 < 10 ? "0" + (date.getMonth() + 1) : date.getMonth() + 1;
        var currentDate = date.getDate() < 10 ? "0" + date.getDate() : date.getDate();

        return date.getFullYear()
            + "年"
            + month
            + "月"
            + currentDate
            + "日"
            + " "
            + date.getHours()
            + ":"
            + date.getMinutes();
    }
