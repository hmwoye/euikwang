<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
	function Fnc(dan) {

		var num = 0;
		var result = '';

		num = dan.charAt(0+);

		for (var i = 1; i <= 9; i++) {
			result += num * i + '\n';
		}
		alert(result);
	}
</script>

</head>

<body>

	<input type="button" onclick="Fnc('2단');" value="2단">
	<input type="button" onclick="Fnc('3단');" value="3단">
	<input type="button" onclick="Fnc('4단');" value="4단">




</body>
</html>