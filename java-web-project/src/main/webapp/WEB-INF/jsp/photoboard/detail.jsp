<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
  trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>사진 조회</title>
<link rel="stylesheet"
  href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
  integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
  crossorigin="anonymous">
<link rel="stylesheet" href="${contextRootPath}/css/common.css">
</head>
<body>

  <jsp:include page="../header.jsp" />
  <div class="container">
    <h1>사진 조회</h1>
    <c:choose>
      <c:when test="${empty board}">
        <p>해당 사진을 찾을 수 없습니다.</p>
      </c:when>
      <c:otherwise>
        <form action='update' method='post' enctype='multipart/form-data'>

          <div class="form-group row">
            <label for="no" class="col-sm-2 col-form-label">번호</label>
            <div class="col-sm-10">
              <input type="text" class="form-control-plaintext" id="no" name='no'
                value='${board.no}' readonly>
            </div>
          </div>
          <div class="form-group row">
            <label for="title" class="col-sm-2 col-form-label">제목</label>
            <div class="col-sm-8">
              <input type="text" class="form-control" id="title" name='title' value='${board.title}'>
            </div>
          </div>
          <div class="form-group row">
            <label for="startDate" class="col-sm-2 col-form-label">등록일</label>
            <div class="col-sm-6">
              <input type="date" class="form-control" id="startDate" name='startDate'
                value='${board.createdDate}'>
            </div>
          </div>
          <div class="form-group row">
            <label for="viewCount" class="col-sm-2 col-form-label">조회수</label>
            <div class="col-sm-10">
              <input type="text" readonly class="form-control-plaintext" id="viewCount"
                value="${board.viewCount}" readonly>
            </div>
          </div>
          <div class="form-group row">
            <label for="viewCount" class="col-sm-2 col-form-label">수업</label>
            <div class="col-sm-10">
              <select name='lessonNo' class="form-control">
                <c:forEach items="${lessons}" var="lesson">
                  <option value="${lesson.no}" ${board.lessonNo == lesson.no ? "selected" : ""}>${lesson.title}(${lesson.startDate}
                    ~ ${lesson.endDate})</option>
                </c:forEach>
              </select>
            </div>
          </div>
          <div class="form-group row">
            <label for="photo" class="col-sm-2 col-form-label">사진</label>
            <div class="col-sm-6">
            <p>최소 한개의 사진파일을 등록해야 합니다.</p>
              <input type="file" class="form-control" id="photo" name='photo'>
              <input type="file" class="form-control" id="photo" name='photo'> 
              <input type="file" class="form-control" id="photo" name='photo'>
              <input type="file" class="form-control" id="photo" name='photo'> 
              <input type="file" class="form-control" id="photo" name='photo'>
              <br>
              <c:set var="contextRootPath" value="${pageContext.servletContext.contextPath}"></c:set>
              <c:forEach items="${board.files}" var="file">
                <img src='${contextRootPath}/upload/photoboard/${file.filePath}'
                  style='height: 80px'>
              </c:forEach>
            </div>
          </div>

          <div class="form-group row">
            <div class="col-sm-10 bit-btn">
              <a class="btn btn-primary" href='.'>목록</a>
              <button class="btn btn-primary">변경</button>
              <a class="btn btn-primary" href='delete/${board.no}'>삭제</a>
            </div>
          </div>
        </form>
      </c:otherwise>
    </c:choose>
  </div>
  <jsp:include page="../javascript.jsp" />

</body>
</html>