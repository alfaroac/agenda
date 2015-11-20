<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>

<div class="row-fluid">


	<div class="span12">

		${calendar}

	</div>
</div>
<br>




<!-- Modal EVALUAR EXPEDIENTE -->
<div id="divFrmSetElector" class="modal hide fade" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal" aria-hidden="true">x</button>
		<h3 id="myModalLabel">
			Evento			
		</h3>
	</div>
	<div class="modal-body">

		<div id="divErrorExpeSet" style="display: none;" class="alert alert-error"></div>
		<div id="divSuccessExpeSet" style="display: none;" class="alert alert-success"></div>
		
		<div class="control-group">
			<div class="controls">
				<table>
					<tr align="center">
						<td align="right">D.N .I / Cod.  &nbsp;:&nbsp;</td>
						<td><input type="text" id="dni" name="dni" placeholder="DNI / Codigo Estudiante" ondblclick="cleanDniAndStudentId()" maxlength="14" class="input-xlarge"/></td>
						<td><input type="text" id="studentId" name="studentId" /></td>
						<td><input type="text" id="sessionElectionId_" name="sessionElectionId_" /></td>
						
					</tr>
					
				</table>
			</div>
		</div>
	</div>
	<div class="modal-footer">
		<button class="btn" data-dismiss="modal" aria-hidden="true">Cerrar</button>
		<button class="btn btn-primary" id="btnGuardarElector"  onclick="saveElectorToTable()">Guardar</button>
	</div>	
</div>