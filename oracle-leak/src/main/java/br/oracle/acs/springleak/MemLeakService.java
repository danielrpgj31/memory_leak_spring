package br.oracle.acs.springleak;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("memLeakService")
public class MemLeakService {
 
	@Autowired
	private LeakMock leak;

	private void fillHeap() {
		leak.fillHeap(100, 1000000);
	}

	public void initOOM() {
		
		fillHeap();
	
	}
}