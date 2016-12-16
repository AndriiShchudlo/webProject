
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="k"%>
<!DOCTYPE html>
<html>
<head>
   <title>com</title>
</head>
<body>
   <k:forEach items="${datas}" var="file">
        <dl>
              <dt>
                    <k:when test="${!file.isFolder()}">

                         ${file.getName()}
                ${}

              </dt>
        </dl>

   </k:forEach>
</body>
</html>