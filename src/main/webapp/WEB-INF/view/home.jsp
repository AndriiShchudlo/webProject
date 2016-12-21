
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
   <title>com</title>
</head>
<p>

<p><h3> <a href="/index"> "H O M E"</a></h3></p>

<h4> <a href="#" onclick="history.back()"> <- Back history </a> </h4>


<c:if test="${back.isRoot()}">
<h4> <a href="?path=${back.getUrlBack()}"> Back </a> </h4>
</c:if>

<ul>

   <c:forEach items="${datas}" var="file">

        <c:choose>
            <c:when test = "${!file.isFolder()}">
                 <li> ${file.getName()}</li>
            </c:when>
            <c:otherwise>
               <li type='none'> <a href="?path=${file.getUrl()}">${file.getName()}</a> </li>
            </c:otherwise>
        </c:choose>

   </c:forEach>
</ul>
</body>
</html>