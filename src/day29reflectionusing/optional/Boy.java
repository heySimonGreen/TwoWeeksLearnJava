package day29reflectionusing.optional;

/**
 * @author: chenwei
 * @date: 2021/9/20 2:04
 * @description: 描述
 */
public class Boy {
	private Girl girl;

	public Boy() {
	}

	public Boy(Girl girl) {
		this.girl = girl;
	}

	@Override
	public String toString() {
		return "Boy{" +
				"girl=" + girl +
				'}';
	}

	public Girl getGirl() {
		return girl;
	}

	public void setGirl(Girl girl) {
		this.girl = girl;
	}
}
