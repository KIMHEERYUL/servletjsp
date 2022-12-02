<%@ page contentType="text/html; charset=UTF-8" %>

<%@ include file="/WEB-INF/views/common/header.jsp" %>

<div class="card m-2">
   <div class="card-header">
      content.jsp
   </div>
   <div class="card-body">
   
   		<h4 class="mt-3">값 출력</h4>
   		1. ${5} <br/>
   		2. ${"홍길동"} <br/>
   		<!-- 하나의 값이 나오는 식도 쓸 수 있다 (7, false) -->
   		3. ${2 + 5} <br/>

   		
   		<h4 class="mt-3">산술연산자</h4>
   		4. ${7 mod 3} <br/>
   		5. ${7 % 3} <br/>
   		
   		<h4 class="mt-3">논리연산자</h4>
   		6. ${true && false} <br/>
   		7. ${true and false} <br/>
   		
   		8. ${true || false} <br/>
   		9. ${true or false} <br/>
   		
   		10. ${!true} <br/>
   		11. ${not true} <br/>
   		
   		<h4 class="mt-3">비교연산자</h4>
   		12. ${2 < 5}, ${2 lt 5}<br/>
   		13. ${2 > 5}, ${2 gt 5} <br/>
   		
   		14. ${2 <= 5}, ${2 le 5} <br/>
   		15. ${2 >= 5}, ${2 ge 5} <br/>
   		
   		16. ${2 != 5}, <%-- ${2 ne 5} --%> <br/>
   		
   		17.★empty  ${empty null}<br/>
   		18.★ empty ${empty ""}<br/>
   		
   		<h4 class="mt-3">pageContext를 이용해서 request, response, session의 Getter 리턴값 얻기</h4>
   		19. ${pageContext.request.contextPath} <br>
   		<%-- 20. ${pageContext.request.queryString} <br> --%>

   		<h4 class="mt-3"> request 범위->session 범위 application 범위 순으로 저장된 이름의 값 출력</h4>
   		20. ${user.userId}, ${user.userName} <br/>
   		21. ${board.bno}, ${board.btitle}, ${board.bcontent} <br/>
   		22. ${info} <br/>
   		
   </div>
</div>

<%@ include file="/WEB-INF/views/common/footer.jsp" %>