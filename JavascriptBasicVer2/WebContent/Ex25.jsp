<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">

	var guguList= new Array();
	var count=0;
	
	function Fnc(dan) {
		
		guguList= new Array();
			
		for (var i = 1; i <= 9; i++) {
				guguList[count] = dan * i;
				count++;
			
		}	
		
	var result = 0;
	
		for (var i = 0; i < guguList.length; i++) {
			result += guguList[i] + ' ' ;
			
		}
		
		
		alert(result);
	}

	
</script>

</head>

<body>

	<input  type="button" onclick="Fnc(2);" value="2단">
	<input  type="button" onclick="Fnc(3);" value="3단">
	<input  type="button" onclick="Fnc(4);" value="4단">
	
	 


</body>
</html>