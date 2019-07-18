/**
 * Copyright 2019 Kaspar Scherrer
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ch.carnet.kasparscherrer;

import com.vaadin.flow.component.Html;

public class EmptyFormLayoutItem extends Html {
    public EmptyFormLayoutItem(){
        super("<span>&nbsp;</span>");
        getElement().getStyle().set("height", "36px"); // the heigth of input fields
    }
    public EmptyFormLayoutItem(String height){
        super("<span>&nbsp;</span>");
        getElement().getStyle().set("height", height);
    }
}