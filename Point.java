class Point {
	String id
	double x,y;
	String boja

	//TODO add new variable

	//TODO constructor
    public Tocka(int x, int y) {
    this.x=x;
    this.y=y;
  }
	//TODO setters and getters

public String getId() {

		return id;

	}

	public void setId(String id) {

		this.id = id;

	}

	public double getX() {

		return x;

	}

	public void setX(double x) {

		this.x = x;

	}

	public double getY() {

		return y;

	}



	public void setY(double y) {

		this.y = y;

	}
	public void move (char xDirection, char yDirection) {
		//TODO
		if(xDirection=='R')
            x=x+1;
        if(xDirection=='L')
            x=x-1;
        if(yDirection=='U')
            y=y+1;
        if(yDirection=='D')
            y=y-1;
	}

	public void draw () {
		//TODO
		System.out.println(getX()+","+ getY());
	}



}
class Canvas {
    List<Points> tocki;

    tocki.delete();
}
