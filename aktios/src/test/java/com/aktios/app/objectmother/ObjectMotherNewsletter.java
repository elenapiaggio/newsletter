package com.aktios.app.objectmother;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import com.aktios.app.domain.models.NewsletterFrequency;
import com.aktios.app.domain.models.NewsletterSubscription;
import com.aktios.app.domain.models.NewsletterTechnologies;

/**
 * Object Mother Newsletter.
 * @author juanmafe
 */
public final class ObjectMotherNewsletter {

	public static final String NEWSLETTER_JSON = "{\r\n"
			+ "\"name\" : \"Prueba\",\r\n"
			+ "\"surname\" : \"Insert\",\r\n"
			+ "\"frequency\" : {\"id\" : \"1\"},\r\n"
			+ "\"technologies\" : [{\"id\" : \"1\"}, {\"id\" : \"2\"}]\r\n"
			+ "}";

	public static Stream<NewsletterSubscription>getNewsletterSubscriptionStream() {
		return Arrays.asList(getNewsletterSubscription()).stream();
	}

	public static NewsletterSubscription getEmptyNewsletterSubscription() {
		return new NewsletterSubscription();
	}

	public static NewsletterSubscription getNewsletterSubscriptionName() {
		var newsletterSubscription = new NewsletterSubscription();
		newsletterSubscription.setName("Juan");
		return newsletterSubscription;
	}

	public static NewsletterSubscription getNewsletterSubscriptionNameSurname() {
		var newsletterSubscription = new NewsletterSubscription();
		newsletterSubscription.setName("Juan");
		newsletterSubscription.setSurname("Pablo");
		return newsletterSubscription;
	}

	public static NewsletterSubscription getNewsletterSubscriptionNameSurnameFrecuency() {
		var newsletterSubscription = new NewsletterSubscription();
		newsletterSubscription.setName("Juan");
		newsletterSubscription.setSurname("Pablo");
		newsletterSubscription.setFrequency(getNewsletterFrequency());
		return newsletterSubscription;
	}

	public static NewsletterSubscription getNewsletterSubscriptionNameSurnameFrecuencyEmptyTech() {
		var newsletterSubscription = new NewsletterSubscription();
		newsletterSubscription.setName("Juan");
		newsletterSubscription.setSurname("Pablo");
		newsletterSubscription.setFrequency(getNewsletterFrequency());
		newsletterSubscription.setTechnologies(new ArrayList<>());
		return newsletterSubscription;
	}

	public static NewsletterSubscription getNewsletterSubscription() {
		var newsletterSubscription = new NewsletterSubscription();
		newsletterSubscription.setName("Juan");
		newsletterSubscription.setSurname("Pablo");
		newsletterSubscription.setFrequency(getNewsletterFrequency());
		newsletterSubscription.setTechnologies(getNewsletterTechnologies());
		return newsletterSubscription;
	}

	public static NewsletterFrequency getNewsletterFrequency() {
		var newsletterSubscription = new NewsletterFrequency();
		newsletterSubscription.setName("Weekly");
		return newsletterSubscription;
	}

	public static List<NewsletterTechnologies> getNewsletterTechnologies() {
		var newsletterTechnologies = new NewsletterTechnologies();
		newsletterTechnologies.setName("Java");
		return Arrays.asList(newsletterTechnologies);
	}

}