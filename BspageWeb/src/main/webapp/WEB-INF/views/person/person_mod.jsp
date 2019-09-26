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

    <title>person_create</title>
  </head>
  <body>
	<div class="wrap">
		<div class="container">
			<h1>회원 생성</h1>
			<form id="person_mod" method="post">
			<c:forEach var="list" items="${list}" varStatus="status">
 				<div class="form-group">
					<label>아이디</label> 
					<input type="text" class="form-control" id="id_input" value='${list.p_id}' readonly="readonly">
				</div>
				<div class="form-group">
					<label>패스워드</label> 
					<input type="password" class="form-control" id="pw_input">
				</div>
 				<div class="form-group">
					<label>닉네임</label> 
					<input type="text" class="form-control" id="nm_input" value='${list.p_nm}'>
				</div>
			</c:forEach>
			</form>
			<button type="button" class="btn btn-light" id="modperson">수정하기</button>
		</div>
	</div>
	<!-- Optional JavaScript -->

	
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    	
	<script type="text/javascript">

		$('#modperson').on('click', function() {
			//var formData = $("#person_create").serialize();
			var formData = {
				"p_id" : $('#id_input').val() , 
				"p_pw" : $('#pw_input').val() , 
				"p_nm" : $('#nm_input').val() 
			};

console.log("formData: "+formData);
			$.ajax({
				url : "/person_mod/modify",
				type : "POST",
				data : formData,
				async : true,
				success : function(data) {
					//var jsonObj = JSON.parse(data);
					alert("정보 수정 완료");
					location.href = '/person_list';
				}, // success 

				error : function(xhr, status) {
					//location.href = '/person_list';
					 //alert(JSON.stringify(xhr) + " : " + status);
				}
			});
		});
	</script>
	
  </body>
</html>