package acme.features.administrator.customisation;

import org.springframework.beans.factory.annotation.Autowired;

import acme.entities.customisations.Customisation;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Administrator;
import acme.framework.services.AbstractCreateService;

public class AdministratorCustomisationCreateService implements AbstractCreateService<Administrator, Customisation>{

	@Autowired
	protected AdministratorCustomisationRepository repository;
	
	
	@Override
	public boolean authorise(final Request<Customisation> request) {
		assert request != null;

		return true;

	}

	@Override
	public void bind(final Request<Customisation> request, final Customisation entity, final Errors errors) {

		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);
		
	}

	@Override
	public void unbind(final Request<Customisation> request, final Customisation entity, final Model model) {

		assert request != null;
		assert entity != null;
		assert model != null;
		request.unbind(entity, model, "spamwordsEng", "spamwordsSpa", "threshold");
		
	}

	@Override
	public Customisation instantiate(final Request<Customisation> request) {

		assert request != null;
		
		Customisation result;
		
		result = new Customisation();
		result.setSpamwordsEng("sex,hard core,viagra,cialis,nigeria,you've won, million dollar");
		result.setSpamwordsSpa("sexo,duro,viagra, cialis, has ganado, millon de dolares");
		result.setThreshold(10.0);
		return result;
	}

	@Override
	public void validate(final Request<Customisation> request, final Customisation entity, final Errors errors) {

		assert request != null;
		assert entity != null;
		assert errors != null;
		
	}

	@Override
	public void create(final Request<Customisation> request, final Customisation entity) {

		assert request != null;
		assert entity != null;
		
		this.repository.save(entity);
		
	}

}
