<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Hit Counter</title>
</head>
<body>
    <h1>Hit Counter</h1>
    <p>This page has been accessed <%= request.getAttribute("hitCount") %> times.</p>
</body>
</html>
