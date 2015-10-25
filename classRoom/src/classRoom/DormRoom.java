package classRoom;
public class DormRoom {
	public static int roomTemp = 0;
	public static int roomLength = 0;
	public static int roomWidth = 0;			
	public static int roomSmell = 0;
	public static int roomArea = 0;
	public static int smellScale = 0;

	public static DormRoom joeRoom; //create an object named joeRoom
	public static DormRoom benRoom; //create an object named benRoom

	public static void main(String[] args) {
		System.out.println("Joe's Room:");
		joeRoom.RoomInfo(72, 10, 15, 0); //constructor of RoomInfo class for object joeRoom

		System.out.println(""); // print an empty line

		System.out.println("Ben's Room:");
		benRoom.RoomInfo(91, 22, 13, 2); //constructor of RoomInfo class for object benRoom
	}


	public static void RoomInfo (int T, int L, int W, int S) {
		//output what we know about the room
		roomTemp = T;
		roomLength = L;
		roomWidth = W;			
		roomSmell = S;

		System.out.println("My room temp is " + roomTemp );
		System.out.println("My room is " + roomLength + " long and " + roomWidth + " wide" );
		printArea(roomLength, roomWidth); //constructor for print area class
		int newSmell = joeRoom.applyFabreeze(roomSmell, 4);//constructor applyFabreeze(current smell, #of cans to spray)
		System.out.println("My room smells like " + newSmell);
	}


	public static int applyFabreeze (int roomSmell, int numCans){
		//input the initial room smell and the number of cans to spray
		//output the new smell
		int smellsBetter=numCans*2 ;
		int newRoomSmell = roomSmell + smellsBetter ;
		return newRoomSmell;
	}

	public static void printArea (int roomL, int roomW){
		//input room length and width
		//output room area
		roomLength = roomL;
		roomWidth = roomW;
		System.out.println("My room is " + roomLength*roomWidth + " metres square in area");
	}

}


