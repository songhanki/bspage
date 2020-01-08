<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>카테고리 테스트</title>
</head>
<body>
<h1>
	카테고리 테스트중
</h1>
	<c:forEach var="cList" items="${list}" varStatus="status">
	<!-- 
		<tr onclick="go_detail(${cList.ctgr_cd})">
			<th></th>
			<td>${cList.ctgr_name}</td>
		</tr>
	 -->
		 <ul value="${cList.p_seq}">
		 	<li>${cList.ctgr_name}</li>
		 </ul>
	 </c:forEach>
	<div id="detail">카테고리 선택해주세요</div>
</body>

<script type="text/javascript">
	function go_detail(ctgr_cd){
		var ctgr_cd = '';
		$.ajax({
			url : "/ctgrDetail",
			type : "POST",
			data : "ctgr_cd="+ctgr_cd,
			"success" : function(data) {
				$('#detail').html(data);
			}
		})
	}
</script>
</html>
