package cm.beni.main.julia.navire.api.service;

import java.util.Collection;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cm.beni.main.julia.business.manager.NavireManager;
import cm.beni.main.julia.model.schema.navires.Navire;

@RestController
@RequestMapping("navire-api")
public class BillsNavireService {

	@Autowired
	private NavireManager navireManager;

	@RequestMapping("/")
	public String hello() {
		return "Hello";
	}

//	@RequestMapping("/hello/{name}")
//	public String helloName(@PathVariable("name") String name) {
//		return "Hello " + name;
//	}

	@GetMapping("/navires/{orderBy}")
	public ResponseEntity<Collection<Navire>> navires(@PathParam("orderBy") int orderBy) {
		Collection<Navire> navires = navireManager.getAllNaviresOrderBy(orderBy);

		if (navires == null || navires.size() == 0) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(navires, HttpStatus.OK);
	}

	@GetMapping("/navires/{orderBy}/{limit}")
	public ResponseEntity<Collection<Navire>> navires(@PathParam("orderBy") String orderBy, @PathParam("limit") int limit) {
		Collection<Navire> navires = navireManager.getAllNaviresOrderByWithLimit(limit, orderBy);

		if (navires == null || navires.size() == 0) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(navires, HttpStatus.OK);
	}

	@GetMapping("/navires")
	public ResponseEntity<Collection<Navire>> navires() {
		Collection<Navire> navires = navireManager.getAllNavires();

		if (navires == null || navires.size() == 0) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(navires, HttpStatus.OK);
	}

	@RequestMapping(value = "/navire/create", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, consumes = {
					MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Navire> create(@RequestBody Navire navire) {
		navire = navireManager.create(navire);
		return new ResponseEntity<>(navire, HttpStatus.OK);
	}

}
