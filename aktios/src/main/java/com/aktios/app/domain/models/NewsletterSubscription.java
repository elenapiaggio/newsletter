package com.aktios.app.domain.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import com.aktios.app.annotations.ExcludeFromJacocoGeneratedReport;

/**
 * Newsletter Subscription.
 * @author juanmafe.
 */
@ExcludeFromJacocoGeneratedReport
public class NewsletterSubscription extends AbstractModel {

	/** {@link String} name */
	private String name;

	/** {@link String} surname */
	private String surname;

	/** {@link LocalDate} birthday */
	private LocalDate birthday;

	/** {@link NewsletterFrequency} frequency */
	private NewsletterFrequency frequency;

	/** {@link NewsletterTechnologies} {@link List} technologies */
	private List<NewsletterTechnologies> technologies;

	public NewsletterSubscription(String name, String surname, LocalDate birthday, NewsletterFrequency frequency, List<NewsletterTechnologies> technologies) {
		this.name = name;
		this.surname = surname;
		this.birthday = birthday;
		this.frequency = frequency;
		this.technologies = technologies;
	}

	public NewsletterSubscription() {

	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * @return the birthday
	 */
	public LocalDate getBirthday() {
		return birthday;
	}

	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	/**
	 * @return the frequency
	 */
	public NewsletterFrequency getFrequency() {
		return frequency;
	}

	/**
	 * @param frequency the frequency to set
	 */
	public void setFrequency(NewsletterFrequency frequency) {
		this.frequency = frequency;
	}

	/**
	 * @return the technologies
	 */
	public List<NewsletterTechnologies> getTechnologies() {
		return technologies != null ? new ArrayList<>(technologies) : new ArrayList<>();
	}

	/**
	 * @param technologies the technologies to set
	 */
	public void setTechnologies(List<NewsletterTechnologies> technologies) {
		if (technologies != null) {
			this.technologies = new ArrayList<>(technologies);
		} else {
			this.technologies = new ArrayList<>();	
		}
	}

	@Override
	public int hashCode() {
		final var prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(name, surname);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof NewsletterSubscription)) {
			return false;
		}
		NewsletterSubscription other = (NewsletterSubscription) obj;
		return Objects.equals(name, other.name) && Objects.equals(surname, other.surname);
	}

}