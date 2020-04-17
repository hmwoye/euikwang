<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
* {
	margin: 0;
	padding: 0;
}
img {
	vertical-align: center;
	border: 0;
}

#galleryWrap {
	width: 530px;
	margin: 0 auto;
	text-align: center;
	padding-top: 180px; 
}

#galleryWrap img {
	vertical-align: middle;
}
</style>
<script type="text/javascript">
	//<![CDATA[
	var num = 1;
	function nextGallery() {
		num++;
		if (num >= 7){
			return false
		}
		document.getElementById("gallery").src = "./img" + num + ".jpg";		
	}

	function prevGallery() {
		num--;
		if (num <= 1){
			return false
		}
		document.getElementById("gallery").src = "./img" + num + ".jpg";		
	}
	//]]>
</script>
<title>new document</title>
</head>
<body>
	<div id="galleryWrap">
		<h1>이미지 넘기기</h1>
		<p>
			<a href="#prev" onclick="prevGallery();" 
				style="text-decoration: none;">
					<img class="pic" src="./left_btn.png" alt="이전 그림"/>
			</a> 
			<img src="./img1.jpg" alt="갤러리 그림" id="gallery"/> 
			<a href="#next"	onclick="nextGallery();">
				<img src="./right_btn.png" alt="다음 그림"/>
			</a>
		</p>
	</div>
</body>
</html>
