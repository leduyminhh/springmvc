<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglibs.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Đăng nhập</title>
</head>

<body>
	<div class="container">
		<div class="d-flex justify-content-center h-100">
			<div class="card">
				<div class="card-header">
					<h3>Đăng Nhập</h3>
					<div class="d-flex justify-content-end social_icon">
						<span><i class="fab fa-facebook-square"></i></span> <span><i
							class="fab fa-google-plus-square"></i></span> <span><i
							class="fab fa-twitter-square"></i></span>
					</div>
				</div>
				<div class="card-body">
					<form method="POST" id="formSubmit"
						action="<c:url value='/j_spring_security_check'></c:url>">
						<div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text"><i class="fas fa-user"></i></span>
							</div>
							<input type="text" class="form-control"
								placeholder="Tên tài khoản" id="userName" name="j_username">
						</div>
						<div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text"><i class="fas fa-key"></i></span>
							</div>
							<input type="password" class="form-control"
								placeholder="Mật khẩu" id="passWord" name="j_password">
						</div>
						<c:if test="${param.incorrectAccount != null}">
							<div class="alert alert-danger" role="alert">
								UserName or Password incorrect
							</div>
						</c:if>
						<c:if test="${param.accessDenied != null}">
							<div class="alert alert-danger" role="alert">
								You not authorize
							</div>
						</c:if>
						<div class="row align-items-center remember">
							<input type="checkbox">Lưu tài khoản
						</div>
						<div class="form-group">
							<input type="submit" value="Đăng nhập"
								class="btn float-right login_btn">
						</div>
					</form>
				</div>
				<div class="card-footer">
					<div class="d-flex justify-content-center links">
						Don't have an account?<a href="#">Sign Up</a>
					</div>
					<div class="d-flex justify-content-center">
						<a href="#">Forgot your password?</a>
					</div>
				</div>

			</div>

		</div>
	</div>
</body>
</html>