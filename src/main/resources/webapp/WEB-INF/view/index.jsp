<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Investment Selection</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
    <h1>Investment Selection and Perception Behaviour Towards Mutual Funds</h1>
    <form action="submitPreferences" method="post">
        <label for="investmentAmount">Investment Amount:</label>
        <input type="number" id="investmentAmount" name="investmentAmount" required><br><br>
        
        <label for="riskTolerance">Risk Tolerance:</label>
        <select id="riskTolerance" name="riskTolerance" required>
            <option value="low">Low</option>
            <option value="medium">Medium</option>
            <option value="high">High</option>
        </select><br><br>
        
        <label for="investmentDuration">Investment Duration (years):</label>
        <input type="number" id="investmentDuration" name="investmentDuration" required><br><br>
        
        <input type="submit" value="Submit">
    </form>
</body>
</html>