<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>

<c:set var="authentication" value="${sessionScope['SPRING_SECURITY_CONTEXT'].authentication}" />
<c:set var="user" value="${authentication.details}" />	

<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/notification_menu/style_light.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/notification_menu/perfect-scrollbar.css">

<script src="<%=request.getContextPath()%>/js/customize-autocomplete-player-header.js"></script>
<script src="<%=request.getContextPath()%>/js/notification_menu/jquery-ui-1.8.14.custom.min.js"></script>
<script src="<%=request.getContextPath()%>/js/notification_menu/ttw-notification-menu.js"></script>
<script src="<%=request.getContextPath()%>/js/notification_menu/perfect-scrollbar.js"></script>
<script src="<%=request.getContextPath()%>/js/notification_menu.js"></script>


<script type="text/javascript">
contextPath = "${pageContext.servletContext.contextPath}";

// para que no recarge el primer request de notificacion
// setTimeout(function(){ getAllNotificacion(); }, 3000);

//setInterval(function() {
//	getAllNotificacion();
//}, 20000); //5 seconds
//5000 		5 Seg.
//60000 	60 Seg.
//120000 	2 Mini.
//240000 	4 Mini.
//480000 	8 Mini.

</script>


<div class="navbar navbar-fixed-top">
	<div class="navbar-inner">
        <div class="container">
        	
		
			<div class="btn-group pull-right">
	            <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
	            	<i>
	            	<img class="icon-user" src="..." width="25" height="25"/>
	            	</i>
					<c:out value='${user.userName}'/>
					<span class="caret"></span>
	            </a>
	            <ul class="dropdown-menu">
				  <li <c:if test="${menuHeader eq 'editarUsuario'}"> class="active"</c:if>><a href="<%=request.getContextPath() %>/usuario/editarUsuario.html">Cambiar Clave</a></li>
	              <li class="divider"></li>
	              <li><a href="<%=request.getContextPath()%>/logout">Salir</a></li>
	            </ul>
			</div>

<!-- 			<div class="navbar-search pull-right"> -->
<!-- 				<input type="text" class="search-query span3" id="header_search_input" placeholder="Buscar"> -->
<!-- 			</div> -->
			<form class="navbar-search pull-right" action="<%=request.getContextPath()%>/profile/dashboard.html" method="post" name="profileFormHeader">
				<!--	Search for players, teams and fields	-->
				<input type="hidden" name="playerId">
			</form>
			
			<div class="nav-collapse">
			<nav class="nav">
				<ul class="nav">
					<li <c:if test="${menuHeader eq 'agenda'}"> class="active"</c:if>><a href="<%=request.getContextPath() %>/agenda/dashboard.html">Home/Agenda</a></li>
				</ul>
				
			</nav>
			</div>
		</div>
	</div>
</div>
