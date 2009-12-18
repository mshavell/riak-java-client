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
package com.basho.riak.client;

/**
 * Represents a link to a Riak object. The target object is identified by its
 * bucket and key and the link is classified by a tag.
 */
public class RiakLink {

    private String bucket;
    private String key;
    private String tag;

    public RiakLink(String bucket, String key, String tag) {
        this.bucket = bucket;
        this.key = key;
        this.tag = tag;
    }

    /**
     * Bucket of the target object being linked to.
     */
    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * Key of the target object being linked to.
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Tag to classify the link.
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}