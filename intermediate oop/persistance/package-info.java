package persistance;
abstract class persistance{
abstract void persist();
}
class filepersistance extends persistance{
	void persist() {
		System.out.println("this data is from filepersistance");
	}
}
class databasepersistance extends persistance{
	void persist() {
		System.out.println("this data is from databasepersistance");
	}
}