<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원가입</h1>
	<form action="/helloweb/join" method="post">
		이메일 : <input type="text" name="email" value=""/>
		<br/>
		<br/>
		비밀번호 : <input type="password" name="password" value=""/>
		<br/>
		<br/>
		이름 : <input type="text" name="name" value=""/>
		<br/>
		<br/>
		성별 : <input type="radio" name="gender" value="male"> 남
				<input type="radio" name="gender" value="female" checked> 여
		<br/>
		<br/>
		생년 :
		<select name="birth-year">
			<option value="2000">2000년</option>
			<option	value="2001">2001년</option>
			<option value="2002">2002년</option>
			<option value="2003">2003년</option>
			<option value="2004">2004년</option>
		</select>
		월 :
		<select name="birth-month">
		<%
		for (int i = 1; i <= 12; i++) {
		%>
			<option value="<%=i%>"><%=i%>월</option>
		<%
		}
		%>	
		</select>
		<br/>
		<br/>
		<input type="submit" value="회원가입"/>
	</form>
</body>
</html>