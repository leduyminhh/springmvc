<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../common/taglibs.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trang chủ</title>

<link rel="stylesheet" type="text/css"
	href="<c:url value = '/template/web/styles/bootstrap4/bootstrap.min.css'/>">
<link
	href="<c:url value = '/template/web/plugins/fontawesome-free-5.0.1/css/fontawesome-all.css'/>"
	rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css"
	href="<c:url value = '/template/web/plugins/OwlCarousel2-2.2.1/owl.carousel.css'/>">
<link rel="stylesheet" type="text/css"
	href="<c:url value = '/template/web/plugins/OwlCarousel2-2.2.1/owl.theme.default.css'/>">
<link rel="stylesheet" type="text/css"
	href="<c:url value = '/template/web/plugins/OwlCarousel2-2.2.1/animate.css'/>">
<link rel="stylesheet" type="text/css"
	href="<c:url value = '/template/web/plugins/slick-1.8.0/slick.css'/>">
<link rel="stylesheet" type="text/css"
	href="<c:url value = '/template/web/styles/main_styles.css'/>">
<link rel="stylesheet" type="text/css"
	href="<c:url value = '/template/web/styles/responsive.css'/>">
</head>
<body>
	<div class="super_container">
		<!-- Navigation -->
		<%@ include file="/common/web/header.jsp"%>

		<dec:body />

		<!-- Footer -->
		<%@ include file="/common/web/footer.jsp"%>
	</div>

	<!-- Bootstrap core JavaScript -->
	<script src="<c:url value = '/template/web/js/jquery-3.3.1.min.js'/>"></script>
	<script
		src="<c:url value = '/template/web/styles/bootstrap4/popper.js'/>"></script>
	<script
		src="<c:url value = '/template/web/styles/bootstrap4/bootstrap.min.js'/>"></script>
	<script
		src="<c:url value = '/template/web/plugins/greensock/TweenMax.min.js'/>"></script>
	<script
		src="<c:url value = '/template/web/plugins/greensock/TimelineMax.min.js'/>"></script>
	<script
		src="<c:url value = '/template/web/plugins/scrollmagic/ScrollMagic.min.js'/>"></script>
	<script
		src="<c:url value = '/template/web/plugins/greensock/animation.gsap.min.js'/>"></script>
	<script
		src="<c:url value = '/template/web/plugins/greensock/ScrollToPlugin.min.js'/>"></script>
	<script
		src="<c:url value = '/template/web/plugins/OwlCarousel2-2.2.1/owl.carousel.js'/>"></script>
	<script
		src="<c:url value = '/template/web/plugins/slick-1.8.0/slick.js'/>"></script>
	<script src="<c:url value = '/template/web/plugins/easing/easing.js'/>"></script>
	<script src="<c:url value = '/template/web/js/custom.js'/>"></script>
</body>
</html>