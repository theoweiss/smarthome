/**
 * Copyright (c) 2014 openHAB UG (haftungsbeschraenkt) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.core.thing.type;

import org.eclipse.smarthome.core.thing.UID;

/**
 * The {@link ChannelGroupTypeUID} represents a unique identifier for channel group types.
 *
 * @author Michael Grammling - Initial contribution.
 */
public class ChannelGroupTypeUID extends UID {

    /**
     * Creates a new instance of this class with the specified parameter.
     *
     * @param channelGroupUid the UID for the channel group
     */
    public ChannelGroupTypeUID(String channelGroupUid) {
        super(channelGroupUid);
    }

    /**
     * Creates a new instance of this class with the specified parameter.
     *
     * @param bindingId the binding ID (must neither be null, nor empty)
     * @param id the identifier of the channel group (must neither be null, nor empty)
     */
    public ChannelGroupTypeUID(String bindingId, String id) {
        super(bindingId, id);
    }

    /**
     * Returns the identifier of the channel group.
     *
     * @return the identifier of the channel group (neither null, nor empty)
     */
    public String getId() {
        return getSegment(1);
    }

    @Override
    protected int getMinimalNumberOfSegments() {
        return 2;
    }

}
