<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>

<h2 align="center">Calendario de Actividades</h2>
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
				<table alingn="center">					
					<tr align="center">
						<td align="right">Título  &nbsp;:&nbsp;</td>
						<td><input type="text" name="titulo" placeholder="Titulo del evento" class="input-xlarge"/></td>
					</tr>
					<tr align="center">
						<td align="right">Descripción  &nbsp;:&nbsp;</td>
						<td><textarea class="input-xlarge" name="descripcion" ></textarea></td>
					</tr>
					<tr align="center">
						<td align="right">Lugar  &nbsp;:&nbsp;</td>
						<td><input type="text" name="lugar" placeholder="Lugar del evento" class="input-xlarge"/></td>
					</tr>
					<tr align="center">
						<td align="right">Prioridad  &nbsp;:&nbsp;</td>
						<td>
							<select class="input-xlarge">
							  <option value="alta">Alta</option>
							  <option value="media">Media</option>
							  <option value="baja">Baja</option>							  
							</select>
						</td>
					</tr>
					<tr align="center">
						<td align="right">Invitar &nbsp;:&nbsp;</td>
						<td><input type="text" id="invitar" name="invitar" placeholder="Invitar a" ondblclick="cleanDniAndStudentId()" maxlength="14" class="input-xlarge"/ disabled></td><tr>											
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