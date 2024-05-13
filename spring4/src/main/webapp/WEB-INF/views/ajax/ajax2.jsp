<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<c:set var="path2" value="${pageContext.servletContext.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 객체 전송 - JSON으로 받기2</title>
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/axios/1.6.8/axios.min.js"></script>
</head>
<body>
	<h2>학생 객체 전송 - JSON으로 받기2 : org.json.simple.JSONObject</h2>
	<hr>
	<div class="form">
		<input type="number" name="stdNumber" id="num" placeholder="번호 입력" /><br><br>
		<input type="text" name="name" id="name" placeholder="학생명 입력" /><br><br>
		<input type="number" name="age" id="age" placeholder="나이 입력" /><br><br>
	</div>
<nav>
	<h2>01_Get 전송</h2>
	<hr>
	<ul>
		<li><a href="${path2}/ajax/">Home</a></li>
	</ul>	
		<button type="button" id="btn1">Get 전송</button>
	<script>
	$(document).ready(function(){
		var res = "post 전송";
		var fn2 = () => $.ajax({
			type:"post",
			url:"${path2}/ajax/ajax1pro.do",
			data:res, // get방식만 가능하다
			success:function(data) { console.log("성공", data); },
			error:function(err) {console.log("실패", err);}
		});
			$("#btn1").on("click", function() {fn1();});
	});
	</script>
</nav>	
</body>
</html>