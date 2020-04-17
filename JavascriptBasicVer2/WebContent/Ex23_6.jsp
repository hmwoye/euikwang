<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">

	var obj = new Array();
	
	obj[0] = {
			name : '류제건',	
			age : '25',
			grade : '팀장'
	}
	obj[1] = {
			name : '김윤진',	
			age : '30',
			grade : '팀원'
	}
	obj[2] = {
			name : '오현석',	
			age : '27',
			grade : '팀원'
	}	
	obj[3] = {
			name : '정의광',	
			age : '29',
			grade : '팀원'
	}


	var Str = '';
	
	for (var i = 0; i < obj.length; i++) {
		Str = obj[i].name + '\n' + obj[i].age + '\n' + obj[i].grade;
		alert(Str);
	}
	
	

	
	

	
</script>

</head>

<body>



</body>
</html>