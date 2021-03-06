package cm.beni.main.julia.business.manager;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cm.beni.main.julia.business.controller.BusinessController;
import cm.beni.main.julia.dao.controller.repository.master.NavireRepository;
import cm.beni.main.julia.model.schema.navires.Navire;

@Component
public class NavireManager {

//	@Autowired
	private Navire navire;

	@Autowired
	private NavireRepository navireRepository;

	public Navire create(Navire navire) {
		navire.setIdentify(BusinessController.generateUIDPrimaryKey());
		this.navire = navire;
		navireRepository.save(this.navire);
		return this.navire;
	}

	public Navire update(Navire navire) {
		this.navire = navire;
		navireRepository.save(this.navire);
		return this.navire;
	}

	public Collection<Navire> getAllNavires(){
		return navireRepository.findAll();
	}
//	public Collection<Navire> getAllNaviresOrderByWithLimit(String orderBy, String sens, int limit){
//		return navireRepository.findAllOrderByLimit(orderBy, sens, limit, new PageRequest(0, 10, org.springframework.data.domain.Sort));
//	}
	
	public Collection<Navire> getNaviresByCode(String code) {
		return navireRepository.getNaviresByCode(code);
	}

}
