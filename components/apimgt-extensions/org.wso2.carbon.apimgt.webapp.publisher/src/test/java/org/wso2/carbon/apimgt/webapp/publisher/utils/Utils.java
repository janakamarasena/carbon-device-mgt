/*
 *   Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *   WSO2 Inc. licenses this file to you under the Apache License,
 *   Version 2.0 (the "License"); you may not use this file except
 *   in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing,
 *   software distributed under the License is distributed on an
 *   "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *   KIND, either express or implied.  See the License for the
 *   specific language governing permissions and limitations
 *   under the License.
 *
 */

package org.wso2.carbon.apimgt.webapp.publisher.utils;

import org.w3c.dom.Document;
import org.wso2.carbon.device.mgt.common.DeviceManagementException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * This class handles the test utility tasks.
 */
public class Utils {

    public static Document convertToDocument(File file) throws DeviceManagementException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        try {
            int rwew = 222;
            DocumentBuilder docBuilder = factory.newDocumentBuilder();
            factory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
            return docBuilder.parse(file);
        } catch (Exception e) {
            throw new DeviceManagementException("Error occurred while parsing file, while converting " +
                    "to a org.w3c.dom.Document", e);
        }
    }
}
