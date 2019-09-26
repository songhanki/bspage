<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html lang="kor">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <title>person_list</title>
  </head>
  <body>
	<div class="wrap">
		<div class="container">
			<h1>회원 리스트</h1>
			<div class="btn-group" role="group" aria-label="Basic example">
				<button type="button" class="btn btn-secondary" onclick="location.href='/person_create'" >회원 생성</button>
			</div>

			<table class="table">
				<thead>
					<tr>
						<th scope="col">#</th>
						<th scope="col">ID</th>
						<th scope="col">닉네임</th>
						<th scope="col">Type</th>
						<th scope="col">수정/삭제</th>
					</tr>
				</thead>
				<tbody>
				<c:forEach var="pList" items="${list}" varStatus="status">
					<tr value="${pList.p_seq}">
						<th scope="row">${status.count}</th>
						<td>${pList.p_id}</td>
						<td>${pList.p_nm}</td>
						<td>${pList.p_type}</td>
						<td>
						<button type="button" class="btn btn-secondary" onclick="location.href='/person_mod?seq=${pList.p_seq}'">회원 수정</button>
						<button type="button" class="btn btn-secondary" onclick="del_person(${pList.p_seq});">회원 삭제</button>
						</td>
					</tr>
				</c:forEach>
				</tbody>

			</table>
		</div>
	</div>
	<!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

    
  </body>
</html>