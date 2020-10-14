package net.osgg.trianglerest;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class ControllerRest {
	
	@RequestMapping("/triangle/msg")
	public Mensaje getTriangleGet(Triangle triangle) {
		TriangleUtils tu = new TriangleUtils();
		return tu.getTriangleType(triangle.getSidea(), triangle.getSideb(), triangle.getSidec());
	}

	
	@PostMapping("/triangle/set")
	public Mensaje getTrianglePost(@RequestBody Triangle t) {
		TriangleUtils tu = new TriangleUtils();
		return tu.getTriangleType(t.getSidea(), t.getSideb(), t.getSidec());
	}
}
