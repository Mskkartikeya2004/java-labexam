<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Investment Results</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
    <h1>Recommended Mutual Funds</h1>
    <table border="1">
        <tr>
            <th>Fund Name</th>
            <th>Type</th>
            <th>NAV</th>
            <th>Risk Level</th>
            <th>Expected Return</th>
        </tr>
        <c:forEach var="fund" items="${mutualFunds}">
            <tr>
                <td>${fund.name}</td>
                <td>${fund.type}</td>
                <td>${fund.nav}</td>
                <td>${fund.riskLevel}</td>
                <td>${fund.expectedReturn}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>