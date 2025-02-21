/*
 * Copyright (c) 2022, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.ballerinalang.semver.checker.comparator;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.ballerinalang.semver.checker.exception.SemverTestException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

import static org.ballerinalang.semver.checker.util.TestUtils.executeTestData;

/**
 * Class declaration comparator related test cases.
 *
 * @since 2201.2.0
 */
public class ClassComparatorTest {

    private static final String TEST_ROOT = "src/test/resources/testcases/classDefinition/";
    private static final String MEMBER_TEST_ROOT = TEST_ROOT + "classMember/";
    private static final String METHOD_TEST_ROOT = MEMBER_TEST_ROOT + "methodDefinition/";
    private static final String REMOTE_METHOD_TEST_ROOT = MEMBER_TEST_ROOT + "remoteMethodDefinition/";
    private static final String RESOURCE_METHOD_TEST_ROOT = MEMBER_TEST_ROOT + "resourceMethodDefinition/";
    private static final String OBJECT_FIELD_TEST_ROOT = MEMBER_TEST_ROOT + "objectField/";

    private static final String CLASS_ANNOTATION_TESTCASE = TEST_ROOT + "annotation.json";
    private static final String CLASS_DOCUMENTATION_TESTCASE = TEST_ROOT + "documentation.json";
    private static final String CLASS_IDENTIFIER_TESTCASE = TEST_ROOT + "identifier.json";
    private static final String CLASS_QUALIFIER_TESTCASE = TEST_ROOT + "qualifier.json";
    private static final String ADVANCE_CLASS_TESTCASE = TEST_ROOT + "advanceClass.json";

    private static final String OBJECT_FIELD_ANNOTATION_TESTCASE = OBJECT_FIELD_TEST_ROOT + "annotation.json";
    private static final String OBJECT_FIELD_DOCUMENTATION_TESTCASE = OBJECT_FIELD_TEST_ROOT + "documentation.json";
    private static final String OBJECT_FIELD_IDENTIFIER_TESTCASE = OBJECT_FIELD_TEST_ROOT + "identifier.json";
    private static final String OBJECT_FIELD_QUALIFIER_TESTCASE = OBJECT_FIELD_TEST_ROOT + "qualifier.json";
    private static final String OBJECT_FIELD_TYPE_TESTCASE = OBJECT_FIELD_TEST_ROOT + "type.json";
    private static final String OBJECT_FIELD_VALUE_TESTCASE = OBJECT_FIELD_TEST_ROOT + "value.json";

    private static final String METHOD_ANNOTATION_TESTCASE = METHOD_TEST_ROOT + "annotation.json";
    private static final String METHOD_DOCUMENTATION_TESTCASE = METHOD_TEST_ROOT + "documentation.json";
    private static final String METHOD_BODY_TESTCASE = METHOD_TEST_ROOT + "body.json";
    private static final String METHOD_IDENTIFIER_TESTCASE = METHOD_TEST_ROOT + "identifier.json";
    private static final String METHOD_PARAMETER_TESTCASE = METHOD_TEST_ROOT + "parameter.json";
    private static final String METHOD_QUALIFIER_TESTCASE = METHOD_TEST_ROOT + "qualifier.json";
    private static final String METHOD_RETURN_TESTCASE = METHOD_TEST_ROOT + "returnType.json";

    private static final String REMOTE_METHOD_ANNOTATION_TESTCASE = REMOTE_METHOD_TEST_ROOT + "annotation.json";
    private static final String REMOTE_METHOD_DOCUMENTATION_TESTCASE = REMOTE_METHOD_TEST_ROOT + "documentation.json";
    private static final String REMOTE_METHOD_BODY_TESTCASE = REMOTE_METHOD_TEST_ROOT + "body.json";
    private static final String REMOTE_METHOD_IDENTIFIER_TESTCASE = REMOTE_METHOD_TEST_ROOT + "identifier.json";
    private static final String REMOTE_METHOD_PARAMETER_TESTCASE = REMOTE_METHOD_TEST_ROOT + "parameter.json";
    private static final String REMOTE_METHOD_QUALIFIER_TESTCASE = REMOTE_METHOD_TEST_ROOT + "qualifier.json";
    private static final String REMOTE_METHOD_RETURN_TESTCASE = REMOTE_METHOD_TEST_ROOT + "returnType.json";

    private static final String RESOURCE_METHOD_ANNOTATION_TESTCASE = RESOURCE_METHOD_TEST_ROOT + "annotation.json";
    private static final String RESOURCE_METHOD_DOC_TESTCASE = RESOURCE_METHOD_TEST_ROOT + "documentation.json";
    private static final String RESOURCE_METHOD_BODY_TESTCASE = RESOURCE_METHOD_TEST_ROOT + "body.json";
    private static final String RESOURCE_METHOD_IDENTIFIER_TESTCASE = RESOURCE_METHOD_TEST_ROOT + "identifier.json";
    private static final String RESOURCE_METHOD_PARAMETER_TESTCASE = RESOURCE_METHOD_TEST_ROOT + "parameter.json";
    private static final String RESOURCE_METHOD_QUALIFIER_TESTCASE = RESOURCE_METHOD_TEST_ROOT + "qualifier.json";
    private static final String RESOURCE_METHOD_RETURN_TESTCASE = RESOURCE_METHOD_TEST_ROOT + "returnType.json";

    @Test(dataProvider = "classTestDataProvider")
    public void testClassAnnotation(JsonElement testData) throws Exception {
        executeTestData(testData);
    }

    @Test(dataProvider = "classTestDataProvider")
    public void testClassDocumentation(JsonElement testData) throws Exception {
        executeTestData(testData);
    }

    @Test(dataProvider = "classTestDataProvider")
    public void testClassIdentifier(JsonElement testData) throws Exception {
        executeTestData(testData);
    }

    @Test(dataProvider = "classTestDataProvider")
    public void testClassQualifier(JsonElement testData) throws Exception {
        executeTestData(testData);
    }

    @Test(dataProvider = "classTestDataProvider")
    public void testAdvanceClass(JsonElement testData) throws Exception {
        executeTestData(testData);
    }

    @Test(dataProvider = "classTestDataProvider")
    public void testClassMemberObjectFieldAnnotation(JsonElement testData) throws Exception {
        executeTestData(testData);
    }

    @Test(dataProvider = "classTestDataProvider")
    public void testClassMemberObjectFieldDocumentation(JsonElement testData) throws Exception {
        executeTestData(testData);
    }

    @Test(dataProvider = "classTestDataProvider")
    public void testClassMemberObjectFieldIdentifier(JsonElement testData) throws Exception {
        executeTestData(testData);
    }

    @Test(dataProvider = "classTestDataProvider")
    public void testClassMemberObjectFieldQualifier(JsonElement testData) throws Exception {
        executeTestData(testData);
    }

    @Test(dataProvider = "classTestDataProvider")
    public void testClassMemberObjectFieldType(JsonElement testData) throws Exception {
        executeTestData(testData);
    }

    @Test(dataProvider = "classTestDataProvider")
    public void testClassMemberObjectFieldValue(JsonElement testData) throws Exception {
        executeTestData(testData);
    }

    @Test(dataProvider = "classTestDataProvider")
    public void testClassMethodAnnotation(JsonElement testData) throws Exception {
        executeTestData(testData);
    }

    @Test(dataProvider = "classTestDataProvider")
    public void testClassMethodDocumentation(JsonElement testData) throws Exception {
        executeTestData(testData);
    }

    @Test(dataProvider = "classTestDataProvider")
    public void testClassMethodBody(JsonElement testData) throws Exception {
        executeTestData(testData);
    }

    @Test(dataProvider = "classTestDataProvider")
    public void testClassMethodIdentifier(JsonElement testData) throws Exception {
        executeTestData(testData);
    }

    @Test(dataProvider = "classTestDataProvider")
    public void testClassMethodParameter(JsonElement testData) throws Exception {
        executeTestData(testData);
    }

    @Test(dataProvider = "classTestDataProvider")
    public void testClassMethodQualifier(JsonElement testData) throws Exception {
        executeTestData(testData);
    }

    @Test(dataProvider = "classTestDataProvider")
    public void testClassMethodReturn(JsonElement testData) throws Exception {
        executeTestData(testData);
    }

    @Test(dataProvider = "classTestDataProvider")
    public void testClassRemoteMethodAnnotation(JsonElement testData) throws Exception {
        executeTestData(testData);
    }

    @Test(dataProvider = "classTestDataProvider")
    public void testClassRemoteMethodDocumentation(JsonElement testData) throws Exception {
        executeTestData(testData);
    }

    @Test(dataProvider = "classTestDataProvider")
    public void testClassRemoteMethodBody(JsonElement testData) throws Exception {
        executeTestData(testData);
    }

    @Test(dataProvider = "classTestDataProvider")
    public void testClassRemoteMethodIdentifier(JsonElement testData) throws Exception {
        executeTestData(testData);
    }

    @Test(dataProvider = "classTestDataProvider")
    public void testClassRemoteMethodParameter(JsonElement testData) throws Exception {
        executeTestData(testData);
    }

    @Test(dataProvider = "classTestDataProvider")
    public void testClassRemoteMethodQualifier(JsonElement testData) throws Exception {
        executeTestData(testData);
    }

    @Test(dataProvider = "classTestDataProvider")
    public void testClassRemoteMethodReturn(JsonElement testData) throws Exception {
        executeTestData(testData);
    }

    @Test(dataProvider = "classTestDataProvider")
    public void testClassResourceMethodAnnotation(JsonElement testData) throws Exception {
        executeTestData(testData);
    }

    @Test(dataProvider = "classTestDataProvider")
    public void testClassResourceMethodDocumentation(JsonElement testData) throws Exception {
        executeTestData(testData);
    }

    @Test(dataProvider = "classTestDataProvider")
    public void testClassResourceMethodBody(JsonElement testData) throws Exception {
        executeTestData(testData);
    }

    @Test(dataProvider = "classTestDataProvider")
    public void testClassResourceMethodIdentifier(JsonElement testData) throws Exception {
        executeTestData(testData);
    }

    @Test(dataProvider = "classTestDataProvider")
    public void testClassResourceMethodParameter(JsonElement testData) throws Exception {
        executeTestData(testData);
    }

    @Test(dataProvider = "classTestDataProvider")
    public void testClassResourceMethodQualifier(JsonElement testData) throws Exception {
        executeTestData(testData);
    }

    @Test(dataProvider = "classTestDataProvider")
    public void testClassResourceMethodReturn(JsonElement testData) throws Exception {
        executeTestData(testData);
    }

    @DataProvider(name = "classTestDataProvider")
    public Object[] classTestDataProvider(Method method) throws SemverTestException {
        String filePath = switch (method.getName()) {
            case "testClassAnnotation" -> CLASS_ANNOTATION_TESTCASE;
            case "testClassDocumentation" -> CLASS_DOCUMENTATION_TESTCASE;
            case "testClassIdentifier" -> CLASS_IDENTIFIER_TESTCASE;
            case "testClassQualifier" -> CLASS_QUALIFIER_TESTCASE;
            case "testAdvanceClass" -> ADVANCE_CLASS_TESTCASE;
            case "testClassMemberObjectFieldAnnotation" -> OBJECT_FIELD_ANNOTATION_TESTCASE;
            case "testClassMemberObjectFieldDocumentation" -> OBJECT_FIELD_DOCUMENTATION_TESTCASE;
            case "testClassMemberObjectFieldIdentifier" -> OBJECT_FIELD_IDENTIFIER_TESTCASE;
            case "testClassMemberObjectFieldQualifier" -> OBJECT_FIELD_QUALIFIER_TESTCASE;
            case "testClassMemberObjectFieldType" -> OBJECT_FIELD_TYPE_TESTCASE;
            case "testClassMemberObjectFieldValue" -> OBJECT_FIELD_VALUE_TESTCASE;
            case "testClassMethodDocumentation" -> METHOD_DOCUMENTATION_TESTCASE;
            case "testClassMethodBody" -> METHOD_BODY_TESTCASE;
            case "testClassMethodIdentifier" -> METHOD_IDENTIFIER_TESTCASE;
            case "testClassMethodParameter" -> METHOD_PARAMETER_TESTCASE;
            case "testClassMethodQualifier" -> METHOD_QUALIFIER_TESTCASE;
            case "testClassMethodReturn" -> METHOD_RETURN_TESTCASE;
            case "testClassMethodAnnotation" -> METHOD_ANNOTATION_TESTCASE;
            case "testClassRemoteMethodDocumentation" -> REMOTE_METHOD_DOCUMENTATION_TESTCASE;
            case "testClassRemoteMethodBody" -> REMOTE_METHOD_BODY_TESTCASE;
            case "testClassRemoteMethodIdentifier" -> REMOTE_METHOD_IDENTIFIER_TESTCASE;
            case "testClassRemoteMethodParameter" -> REMOTE_METHOD_PARAMETER_TESTCASE;
            case "testClassRemoteMethodQualifier" -> REMOTE_METHOD_QUALIFIER_TESTCASE;
            case "testClassRemoteMethodReturn" -> REMOTE_METHOD_RETURN_TESTCASE;
            case "testClassRemoteMethodAnnotation" -> REMOTE_METHOD_ANNOTATION_TESTCASE;
            case "testClassResourceMethodDocumentation" -> RESOURCE_METHOD_DOC_TESTCASE;
            case "testClassResourceMethodBody" -> RESOURCE_METHOD_BODY_TESTCASE;
            case "testClassResourceMethodIdentifier" -> RESOURCE_METHOD_IDENTIFIER_TESTCASE;
            case "testClassResourceMethodParameter" -> RESOURCE_METHOD_PARAMETER_TESTCASE;
            case "testClassResourceMethodQualifier" -> RESOURCE_METHOD_QUALIFIER_TESTCASE;
            case "testClassResourceMethodReturn" -> RESOURCE_METHOD_RETURN_TESTCASE;
            case "testClassResourceMethodAnnotation" -> RESOURCE_METHOD_ANNOTATION_TESTCASE;
            default -> throw new SemverTestException("Failed to load dataset for method: " + method.getName());
        };

        try (FileReader reader = new FileReader(filePath)) {
            Object testCaseObject = JsonParser.parseReader(reader);
            JsonArray fileData = (JsonArray) testCaseObject;
            List<JsonElement> elementList = new LinkedList<>();
            fileData.forEach(elementList::add);
            return elementList.toArray();
        } catch (IOException e) {
            throw new SemverTestException("failed to load test data");
        }
    }
}
