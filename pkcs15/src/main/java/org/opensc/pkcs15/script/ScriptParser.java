/***********************************************************
 * $Id$
 * 
 * PKCS#15 cryptographic provider of the opensc project.
 * http://www.opensc-project.org
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
 *
 * Created: 29.12.2008
 * 
 ***********************************************************/

package org.opensc.pkcs15.script;

import java.io.IOException;

/**
 * This interface is implemented by parsers of card scripts.
 * 
 * @author wglas
 */
public interface ScriptParser {

    /**
     * @param resource The script resource to parse-
     * @return The first command of the script.
     * @throws IOException Upon errors reading or parsing the script.
     */
    public Command parseScript(ScriptResource resource) throws IOException;
}
