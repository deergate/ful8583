/* 
 * Copyright 2021 Shang Yehua <niceshang@outlook.com>
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
package io.github.deergate.ful8583;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * TODO AbstraceFieldDefinition说明
 *
 * @author Shang Yehua <niceshang@outlook.com>
 * @since 2021-08-26  14:29
 *
 */
public abstract class AbstractFieldDefinition implements FieldProccessor {
    
    /**
     * 域描述信息
     */
    @Setter @Getter
    protected String desctiption;
    
    /**
     * 域定义
     */
    protected final String definition;

    public AbstractFieldDefinition(String definition) {
        this.definition = definition;
        this.parseDefinition();
    }

    protected abstract void parseDefinition();
    
}
