/*
 * Copyright 2020 Red Hat
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

package io.apicurio.tests.serdes.json;

/**
 * @author eric.wittmann@gmail.com
 */
public class InvalidMessage extends Msg {
    
    private String foo;
    private String bar;
    
    /**
     * Constructor.
     */
    public InvalidMessage() {
    }

    /**
     * @return the foo
     */
    public String getFoo() {
        return foo;
    }

    /**
     * @param foo the foo to set
     */
    public void setFoo(String foo) {
        this.foo = foo;
    }

    /**
     * @return the bar
     */
    public String getBar() {
        return bar;
    }

    /**
     * @param bar the bar to set
     */
    public void setBar(String bar) {
        this.bar = bar;
    }

}
