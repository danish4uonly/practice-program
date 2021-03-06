package hererover;

public class HereRover {
	
	/*public static final Integer N = 1;
	public static final Integer E = 2;
	public static final Integer S = 3;
	public static final Integer W = 4;*/
	
	Integer x = 0;
	Integer y = 0;
	Integer facing = RoverEnum.N.getKey();
	
	public HereRover() {
		
	}
	
	public void setPosition(Integer x, Integer y, String d) {
		this.x = x;
		this.y = y;
		
		if (d.equals(RoverEnum.N.getValue()))
			this.facing = RoverEnum.N.getKey();
		else if (d.equals(RoverEnum.E.getValue()))
			this.facing = RoverEnum.E.getKey();
		else if (d.equals(RoverEnum.S.getValue()))
			this.facing = RoverEnum.S.getKey();
		else if (d.equals(RoverEnum.W.getValue()))
			this.facing = RoverEnum.W.getKey();
	}
	
	public void printPosition() {
		char dir = 'N';
		if (facing == 1) {
			dir = 'N';
		} else if (facing == 2) {
			dir = 'E';
		} else if (facing == 3) {
			dir = 'S';
		} else if (facing == 4) {
			dir = 'W';
		}
		System.out.println(x   +" "+   y  + " "+   dir);
	}
	
	public void process(String commands) {
		for (int idx = 0; idx < commands.length(); idx++) {
			process(commands.charAt(idx));
		}
	}
	private void process(Character command) {
		if (command.equals('L')) {
			turnLeft();
		} else if (command.equals('R')) {
			turnRight();
		} else if (command.equals('M')) {
			move();
		} else {
			throw new IllegalArgumentException(
					"Speak in Mars language, please!");
		}
	}
	
	private void move() {
		if (facing == RoverEnum.N.getKey()) {
			this.y++;
		} else if (facing == RoverEnum.E.getKey()) {
			this.x++;
		} else if (facing == RoverEnum.S.getKey()) {
			this.y--;
		} else if (facing == RoverEnum.W.getKey()) {
			this.x--;
		}
	}
	
	private void turnLeft() {
		facing = (facing - 1) < RoverEnum.N.getKey() ? RoverEnum.W.getKey() : facing - 1;
	}
	
	private void turnRight() {
		facing = (facing + 1) > RoverEnum.W.getKey() ? RoverEnum.N.getKey() : facing + 1;
	}
	
	public static void main(String args[]) {
		HereRover rover = new HereRover();
		
		rover.setPosition(1, 2, "N");
		rover.process("LMLMLMLMM");
		rover.printPosition(); // prints 1 3 N
		
		rover.setPosition(3, 3, "E");
		rover.process("MMRMMRMRRM");
		rover.printPosition(); // prints 5 1 E
	}
}
