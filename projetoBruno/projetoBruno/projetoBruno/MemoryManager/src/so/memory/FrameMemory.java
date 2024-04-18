package so.memory;

public class FrameMemory {
	private int pageNumber;
	private int displacement;
		
	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public int getDisplacement() {
		return displacement;
	}

	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}

	public FrameMemory(int pageNumber, int displacement) {
		this.pageNumber = pageNumber;
		this.displacement = displacement;
	}

	public FrameMemory(int pageNumber) {
		this(pageNumber, 0);
	}
	
	
	


}
