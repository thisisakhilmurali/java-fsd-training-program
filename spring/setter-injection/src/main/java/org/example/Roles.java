package org.example;

public class Roles {
    public String characterName;
    public String responsibility;

    @Override
    public String toString() {
        return "Roles{" +
                "characterName='" + characterName + '\'' +
                ", responsibility='" + responsibility + '\'' +
                '}';
    }

    public String getCharacterName() {
		return characterName;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}


	public String getResponsibility() {
		return responsibility;
	}

	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}

	public void display() {
        System.out.println("My name is " + characterName + " " + "and my responsibility is " + responsibility);
    }
}
