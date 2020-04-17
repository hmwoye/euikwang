<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
	/*2차원 배열_2*/

	var arr = [];

	arr[0] = new Array();
	arr[1] = new Array();
	arr[2] = new Array();
	arr[3] = new Array();
	arr[4] = new Array();
	
	for (var i = 0; i < arr.length; i++) {
		for (var n = 0; n < 3; n++) {
			arr[i][n] = i + ',' + n + ' ';
		}
	}

	for (var i = 0; i < arr.length; i++) {
		for (var n = 0; n < arr[i].length; n++) {
			document.write(arr[i][n]);
		}
		document.write('<br/>');
	}
</script>

</head>

<body>



</body>
</html>