<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/signUp/signUpResult" method="post">
		<table>
			<tr>
				<th colspan="2">회원가입</th>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name"/></td>
			</tr>
			<tr>
				<td>나이</td>
				<td><input type="text" name="age"/></td>
			</tr>
			<tr>
				<td>체중</td>
				<td><input type="text" name="weight"/></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="회원가입"></td>
			</tr>
		</table>
	</form>
</body>
</html>