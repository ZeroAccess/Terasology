/*
 * Copyright 2013 Moving Blocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.terasology.logic.inventory.events;

import org.terasology.entitySystem.AbstractEvent;
import org.terasology.entitySystem.EntityRef;

/**
 * @author Immortius
 */
public class ReceivedItemEvent extends AbstractEvent {
    private EntityRef item;
    private int slot = -1;

    public ReceivedItemEvent(EntityRef item) {
        this.item = item;
    }

    public ReceivedItemEvent(EntityRef item, int slot) {
        this.item = item;
        this.slot = slot;
    }

    public EntityRef getItem() {
        return item;
    }

    public int getSlot() {
        return slot;
    }
}
