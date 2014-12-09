<%@ page language="java"  pageEncoding="GB2312"%>
<%@ taglib prefix="s"  uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//CN">
<html>
  <head>
      <title>login2</title>
  </head>
    
  <body>
          <div>
              <h4>»¶Ó­Äã!</h4><font color="red">${username}</font>
              <br/>
              <h4>ÄãµÇÂ¼µÄÃÜÂëÊÇ<h4><font color="red">${password} ${txt} </font>;
              <s:property value="txt"/>
              
              <s:iterator value="cats" status="st"> 
    <s:property value="name"/>  
</s:iterator>
          </div>
  </body>
</html>
