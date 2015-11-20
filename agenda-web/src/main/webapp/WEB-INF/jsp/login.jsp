<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>
<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@ page session="false"%>
<!DOCTYPE html>

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>Agenda Ugel</title>
<link rel="icon" href="images/favicon.ico" type="image/x-icon" />
</head>

<link href="<%=request.getContextPath()%>/bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/bootstrap/css/bootstrap-responsive.css" rel="stylesheet" type="text/css" />


<body>

	<table width="100%">
		<tr>
			<td valign="middle" height="400" align="center">


				<div class="row">
					<div class="span6">
						<ul class="breadcrumb">
							<br>
							<form id="form-login" action="<%=request.getContextPath()%>/j_spring_security_check" method="post" AUTOCOMPLETE="off">
								<table>
								
									<tr>
										<td colspan="2" align="center"><img src="<%=request.getContextPath()%>/images/seguridad.jpg"></td>
									</tr>
									<tr>
										<td align="right">Usuario&nbsp;:&nbsp;</td>
										<td><input type="text" name="j_username" id="username" class="textInput" placeholder="Usuario" autocomplete="off"></td>
									</tr>
									<tr>
										<td align="right">Clave&nbsp;:&nbsp;</td>
										<td><input type="password" name="j_password" id="password" class="textInput" placeholder="Clave"
											autocomplete="off"></td>
									</tr>
									
									
									<tr>
										<td colspan="2">
											<div class="error_message">
												<c:if test="${not empty param.login_error}">
													<c:if test="${param.login_error==1}">
													    <div class="alert alert-error">
															Informaci&oacute;n Inv&aacute;lida. Por favor intente nuevamente.
													    </div>
													</c:if>
													<c:if test="${param.login_error==2}">
														* Please login, your session has expired.
													</c:if>
													<c:if test="${param.login_error==3}">
														* Invalid login information, you have another session started.
													</c:if>
												</c:if>
											</div>									

										</td>
									</tr>
								</table>
								<input type="submit" name="submit" class="btn btn-primary" value="Ingresar" />
							</form>

						</ul>

					</div>
				</div>

			</td>
		</tr>
	</table>



</body>

</html>
