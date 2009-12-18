/*
 * This file is provided to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.basho.riak.client.response;

import java.util.Collection;

import com.basho.riak.client.RiakObject;

/**
 * Response from a HEAD or GET request for an object
 */
public interface FetchResponse extends HttpResponse {

    /**
     * @return Whether response contained a Riak object
     */
    public boolean hasObject();

    /**
     * @return The first Riak object contained in the response. Equivalent to
     *         the first object in getSiblings() when hasSiblings() is true.
     */
    public RiakObject getObject();

    /**
     * @return Whether response contained a multiple Riak objects
     */
    public boolean hasSiblings();

    /**
     * @return A collection of the Riak objects contained in the response.
     */
    public Collection<? extends RiakObject> getSiblings();
}