<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


</head>

<body>

<!-- 	숫자를 입력해주세요 -->
	<input id='yourNumberObj' type="text">


	<input type="button" value="계산 버튼" onclick="numFnc();"> 
<!-- 	버튼을 누르면 누군가 적은
	숫자를 + 10 해준다. -->

</body>

<script type="text/javascript">
	
	var sum = 0;
	var num = 0;
	
	
	function numFnc() {
		
		num = document.getElementById('yourNumberObj').value
		
		sum = 10 + Number(num);
		
		alert(sum);
	}
	
	
</script>
</html>


