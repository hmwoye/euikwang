<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">

	

	var arr = [[],[]];
	
	
	for (var i = 0; i < 2; i++) {
		for (var n = 0; n < 3; n++) {
			arr[i][n]= i;
	}
	for (var i = 0; i < 2; i++) {
		for (var n = 0; n < 3; n++) {
			document.write(arr[i][n]);
		}
		document.write('<br/>');
	}
</script>

</head>

<body>



</body>
</html>