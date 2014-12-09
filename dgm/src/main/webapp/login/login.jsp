<%@ page language="java"  pageEncoding="GB2312"%>
<%@ taglib prefix="s"  uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//CN">
<html>
  <head>
      <title>login/login2</title>
  </head>

  <body>
      <s:form name="login" action="/login/show.do" method="post" >
          <s:textfield name="username" label="ÕÊºÅ"></s:textfield>
          <s:password name="password"  label="ÃÜÂë"></s:password>
          <s:submit></s:submit>
      </s:form>
  </body>
</html>