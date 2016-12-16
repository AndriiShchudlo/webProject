
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="k"%>
<!DOCTYPE html>
<html>
<head>
   <title>com</title>
</head>
<body>
   <k:forEach items="${datas}" var="file">

              <p>  ${file} </p>

   </k:forEach>
</body>
</html>