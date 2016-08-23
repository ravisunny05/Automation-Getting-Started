package org.automation.UnitTests;

import org.automation.core.DataDrivenTest;
import org.automation.MyDataType;
import org.automation.MyDataEditor;
import org.junit.BeforeClass;

import java.beans.PropertyEditorManager;

/**
 * Created by shantonu on 7/16/16.
 */
//todo , writing tests
    // http://docs.oracle.com/javase/6/docs/api/java/beans/PropertyEditorManager.html
public class CustomDataEditing extends DataDrivenTest{

    @BeforeClass
    public static void initClass(){
        PropertyEditorManager.registerEditor(MyDataType.class, MyDataEditor.class);
}
}
