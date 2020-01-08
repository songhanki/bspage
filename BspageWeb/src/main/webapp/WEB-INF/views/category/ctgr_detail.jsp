
<h1>
	카테고리 세부
</h1>
<c:if test="${list eq null}  and ${list eq ''}">
	<h2>리스트가 없습니다.</h2>
</c:if>
	<c:forEach var="cList" items="${list}" varStatus="status">
		<tr>
			<td>ctgr_name : ${cList.ctgr_name}</td>
			<td>ctgr_cd : ${cList.ctgr_cd}</td>
			<td>ctgr_lvl : ${cList.ctgr_lvl}</td>
			<td>ctgr_seq : ${cList.ctgr_seq}</td>
		</tr>
	</c:forEach>
	<div id="detail">카테고리 선택해주세요</div>

