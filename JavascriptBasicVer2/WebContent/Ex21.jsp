<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	var numArr = [];

	var nList = new Array();

	for (var i = 0; i < 100; i++) {
		if (i % 10 == 0) {
			document.write('<br/>')
		}
		nList[i] = i + 1
		document.write(nList[i] + '&nbsp');
	}
	document.write('<br/>');

	for (var i = 0; i < 100; i++) {
		if (i % 10 == 0) {
			document.write('<br/>')
		}
		numArr[i] = i + 1
		document.write(numArr[i] + '&nbsp'); 
	}
</script>

</head>

<body>

</body>
</html>