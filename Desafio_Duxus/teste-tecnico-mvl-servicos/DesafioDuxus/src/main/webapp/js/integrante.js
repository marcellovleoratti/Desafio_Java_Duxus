$('#confirmaRemocaoModal').on('show.bs.modal', function(event) {
	var button = $(event.relatedTarget);
	
	var id = button.data('whatever');
	
	var modal = $(this);
	var form = modal.find('form');
	var action = form.attr('action');

	action = '/integrante/';
	form.attr('action', action + id);
	
	modal.find('.modal-body span').html('Tem certeza que deseja excluir a despesa <strong>' + id + '</strong>?');
});

