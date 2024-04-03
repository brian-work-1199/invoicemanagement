package io.guywithglasses.invoicemanagement.repository;

import io.guywithglasses.invoicemanagement.domain.UserEvent;
import io.guywithglasses.invoicemanagement.enumeration.EventType;

import java.util.Collection;

/**
 * @author Junior RT
 * @version 1.0
 * @license Get Arrays, LLC (https://getarrays.io)
 * @since 3/21/2023
 */
public interface EventRepository {
    Collection<UserEvent> getEventsByUserId(Long userId);
    void addUserEvent(String email, EventType eventType, String device, String ipAddress);
    void addUserEvent(Long userId, EventType eventType, String device, String ipAddress);
}
