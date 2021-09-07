package com.aktios.app.objectmother;

import java.util.Arrays;
import java.util.List;
import com.aktios.app.adapters.jpa.entities.NewsletterFrequencyEntity;
import com.aktios.app.adapters.jpa.entities.NewsletterSubscriptionEntity;
import com.aktios.app.adapters.jpa.entities.NewsletterTechnologiesEntity;

/**
 * Object Mother Newsletter Entity.
 * @author juanmafe
 */
public class ObjectMotherNewsletterEntity {

	public static List<NewsletterSubscriptionEntity>getNewsletterSubscriptionEntityList() {
		return Arrays.asList(getNewsletterSubscriptionEntity());
	}

	public static NewsletterSubscriptionEntity getNewsletterSubscriptionEntity() {
		var newsletterSubscriptionEntity = new NewsletterSubscriptionEntity();
		newsletterSubscriptionEntity.setId("");
		newsletterSubscriptionEntity.setName("Juan");
		newsletterSubscriptionEntity.setSurname("Pablo");
		newsletterSubscriptionEntity.setFrequency(getNewsletterFrequencyEntity());
		newsletterSubscriptionEntity.setTechnologies(getNewsletterTechnologiesEntity());
		return newsletterSubscriptionEntity;
	}

	public static NewsletterFrequencyEntity getNewsletterFrequencyEntity() {
		var newsletterSubscriptionEntity = new NewsletterFrequencyEntity();
		newsletterSubscriptionEntity.setName("Weekly");
		return newsletterSubscriptionEntity;
	}

	public static List<NewsletterTechnologiesEntity> getNewsletterTechnologiesEntity() {
		var newsletterTechnologiesEntity = new NewsletterTechnologiesEntity();
		newsletterTechnologiesEntity.setName("Java");
		return Arrays.asList(newsletterTechnologiesEntity);
	}

}