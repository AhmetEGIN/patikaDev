package patikaDev.genericsInterface;

public class StudentRepository implements IDatabase<Student> {

	@Override
	public void add(Student data) {
		System.out.println("Öðrenci eklendi ");
		
	}

	@Override
	public void delete(Student data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Student data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student getDataById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
