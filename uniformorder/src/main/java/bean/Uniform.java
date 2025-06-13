package bean;

public class Uniform {
	private int uniform_id;
	private String uniform_name;
	private int uniform_stock;
	private int uniform_price;
	private String uniform_image;
	
	public Uniform() {
		this.uniform_id = 0;
		this.uniform_name = null;
		this.uniform_stock = 0;
		this.uniform_price = 0;
		this.uniform_image =null;
	}

	public int getUniform_id() {
		return uniform_id;
	}

	public void setUniform_id(int uniform_id) {
		this.uniform_id = uniform_id;
	}

	public String getUniform_name() {
		return uniform_name;
	}

	public void setUniform_name(String uniform_name) {
		this.uniform_name = uniform_name;
	}

	public int getUniform_stock() {
		return uniform_stock;
	}

	public void setUniform_stock(int uniform_stock) {
		this.uniform_stock = uniform_stock;
	}

	public int getUniform_price() {
		return uniform_price;
	}

	public void setUniform_price(int uniform_price) {
		this.uniform_price = uniform_price;
	}

	public String getUniform_image() {
		return uniform_image;
	}

	public void setUniform_image(String uniform_image) {
		this.uniform_image = uniform_image;
	}
}
