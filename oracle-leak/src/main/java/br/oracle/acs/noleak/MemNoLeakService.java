package br.oracle.acs.noleak;

public class MemNoLeakService {
	
	//private LeakMock leak = new LeakMock();

	private void fillHeap() {
		LeakMock leak = new LeakMock();
		leak.fillHeap(100, 1000000);
	}

	public void initOOM() {
		fillHeap();
	}
}