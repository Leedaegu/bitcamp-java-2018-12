<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
  trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>게시물 목록</title>
<jsp:include page="../commonCss.jsp" />
</head>
<body>

  <jsp:include page="../header.jsp" />

  <div class="container">
    <h1>게시물 목록</h1>
    <p class="bit-btn">
      <a href='form' class="btn btn-primary btn-sm">새 글</a>
    </p>
    <div class="bit-list">
      <table class="table table-hover">
        <thead>
          <tr>
            <th scope="col">번호</th>
            <th scope="col">제목</th>
            <th scope="col">등록일</th>
            <th scope="col">조회수</th>
          </tr>
        </thead>
        <tbody>
          <c:forEach items="${list}" var="board">
            <tr>
              <th scope="row">${board.no}</th>
              <td><a href='${board.no}'>${board.contents}</a></td>
              <td>${board.createdDate}</td>
              <td>${board.viewCount}</td>
            </tr>
          </c:forEach>
        </tbody>
      </table>
    </div>
    <nav aria-label="목록 페이지 이동">
      <ul class="pagination justify-content-center">
        <li class="page-item ${pageNo <=1 ? 'disabled' : ''}"><a class="page-link"
          href="?pageNo=${pageNo - 1}&pageSize=${pageSize}">이전</a></li>

        <c:choose>
          <c:when test="${rowCount == 1}">
            <li class="page-item active"><span class="page-link">1</span></li>
          </c:when>
          <c:when test="${pageNo == 1}">
            <c:forEach var="i" begin="0" end="2" step="1">
              <li class="page-item"><a class="page-link"
                href="?pageNo=${pageNo + i}&pageSize=${pageSize}">${pageNo + i}</a></li>
            </c:forEach>
          </c:when>
          <c:when test="${pageNo == totalPage}">
            <c:forEach var="i" begin="${pageNo - 2}" end="${pageNo}" step="1">
              <li class="page-item"><a class="page-link"
                href="?pageNo=${i}&pageSize=${pageSize}">${i}</a></li>
            </c:forEach>
          </c:when>
          <c:otherwise>
            <li class="page-item"><a class="page-link"
              href="?pageNo=${pageNo -1}&pageSize=${pageSize}">${pageNo - 1}</a></li>
            <li class="page-item active"><span class="page-link">${pageNo}</span></li>
            <li class="page-item"><a class="page-link"
              href="?pageNo=${pageNo +1}&pageSize=${pageSize}">${pageNo + 1}</a></li>
          </c:otherwise>
        </c:choose>

        <li class="page-item ${pageNo >= totalPage ? 'disabled' : ''}"><a class="page-link"
          href="?pageNo=${pageNo + 1}&pageSize=${pageSize}">다음</a></li>
      </ul>
    </nav>
  </div>
  <!-- .container -->

  <jsp:include page="../javascript.jsp" />
</body>
</html>







