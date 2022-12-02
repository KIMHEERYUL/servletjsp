<%@ page contentType="text/html; charset=UTF-8" %>

<%@ include file="/WEB-INF/views/common/header.jsp" %>

<div class="card m-2">
	<div class="card-header">
		 content.jsp
	</div>
	<div class="card-body">
		<a href="${pageContext.request.contextPath}/exam04/HtmlResponseController" class="btn btn-info">HTML 응답생성</a>
		<a href="${pageContext.request.contextPath}/exam04/JsonResponseController" class="btn btn-info">JSON 응답생성</a>
		<a href="${pageContext.request.contextPath}/exam04/FileResponseController" class="btn btn-info">파일 다운로드 응답생성</a>
	</div>

<%@ include file="/WEB-INF/views/common/footer.jsp" %>