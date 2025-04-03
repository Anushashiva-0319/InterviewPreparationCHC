package ObjectCloningEx;

public final class ObjectCloningEx {

	private final int id;
	private final Address address;

	public int getId() {
		return id;
	}
	

	public Address getAddress() {
		return new Address();
	}
	public ObjectCloningEx(int id, Address address) {
		this.id = id;
		this.address = address;
	}


	@Override
	public String toString() {
		return "ObjectCloningEx [id=" + id + ", address=" + address + "]";
	}

}
