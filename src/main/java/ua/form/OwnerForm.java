package ua.form;

import org.springframework.web.multipart.MultipartFile;

import ua.entity.Cvartura;

public class OwnerForm {

	private int id;
	
	private String time;
	
	private String name;
	
	private Cvartura cvartura;
	
	private String path;
	
	private int version;
	
	private MultipartFile file;
	
	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Cvartura getCountry() {
		return cvartura;
	}

	public void setCountry(Cvartura cvartura) {
		this.cvartura = cvartura;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
}
