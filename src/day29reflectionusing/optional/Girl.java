package day29reflectionusing.optional;

/**
 * @author: chenwei
 * @date: 2021/9/20 2:04
 * @description: 描述
 */
public class Girl {
	private String name;

	public Girl() {
	}

	public Girl(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Girl{" +
				"name='" + name + '\'' +
				'}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
