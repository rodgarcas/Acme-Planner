<%--
- form.jsp
-
- Copyright (C) 2012-2021 Rafael Corchuelo.
-
- In keeping with the traditional purpose of furthering education and research, it is
- the policy of the copyright owner to permit non-commercial use and redistribution of
- this software. It has been tested carefully, but it is not guaranteed for any particular
- purposes.  The copyright owner does not offer any warranties or representations, nor do
- they accept any liabilities with respect to them.
--%>

<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form readonly="${readonly}">
	<acme:form-select code="anonymous.task.form.label.visibility" path="visibility">
		<acme:form-option code="PUBLIC" value="PUBLIC" selected="${visibility == 'PUBLIC' }"/>
		<acme:form-option code="PRIVATE" value="PRIVATE" selected="${visibility == 'PRIVATE' }"/>
	</acme:form-select>
	<acme:form-textbox code="anonymous.task.form.label.title" path="title"/>
	<acme:form-textbox code="anonymous.task.form.label.executionStart" path="executionStart"/>
	<acme:form-textbox code="anonymous.task.form.label.executionEnd" path="executionEnd"/>
	<acme:form-textbox code="anonymous.task.form.label.description" path="description"/>
	<acme:form-textbox code="anonymous.task.form.label.link" path="link"/>
	<acme:form-textbox code="anonymous.task.form.label.workload" path="workload"/>
	
	<acme:form-return code="anonymous.task.form.button.return"/>
</acme:form>