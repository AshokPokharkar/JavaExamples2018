package my.sample.example;

public class BoxComparable<T extends Comparable<T>> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}
