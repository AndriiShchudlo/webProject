
<a  href="?path=${files.get(0).getParentUri()}">Back</a>

    <ul>
        <c:forEach items="${files}" var="file">
             <c:choose>
                <c:when test="${!file.isFolder()}">
                    <li class = "file"> ${file.getName()} </li>
                </c:when>
                <c:otherwise>
                    <li ><a class = "folder" href="?path=${file.getUri()}">${file.getName()}</a></li>
                </c:otherwise>
