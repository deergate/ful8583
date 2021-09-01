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

/**
 *
 * TODO FieldDefinition说明
 *
 * @author Shang Yehua <niceshang@outlook.com>
 * @since 2021-08-24  17:14
 *
 */
public interface FieldProccessor {
    /**
     * 从源报文中解析域
     * 
     * @param source 源报文
     * @param start 要解析的域的起始位置
     * @return 生成的域
     */
    Filed decode(byte[] source,int start);
    
    /**
     * 将field编码成byte[]
     * @param filed 要编码的域
     * @return 域的byte[]
     */
    byte[] encode(Filed filed);
}
