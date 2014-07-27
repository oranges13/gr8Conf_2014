<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<meta content="main" name="layout" />
	<title>Most Recent Questions</title>
</head>

<body>

<div class="page-header">
		<h2>Recent questions</h2>
	</div>
	<g:each in="${questionInstanceList}" status="i" var="questionInstance">
		<div class="fourteen columns offset-by-one">
			<div class="well well-lg">
				<h3><g:link controller="question" action="show" id="${questionInstance.id}">${questionInstance.title}</g:link></h3>
				<p>Submitted by ${questionInstance.user} | ${questionInstance.voteCount} Votes</p> 
			</div>
		</div>
	</g:each>
</body>
</html>