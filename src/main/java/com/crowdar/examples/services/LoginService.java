package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.ComunGeneralConstants;
import com.crowdar.examples.constants.LoginConstants;
import org.testng.Assert;

public class LoginService {
    public static void ingresoApp() {
        Assert.assertTrue(MobileActionManager.isVisible(ComunGeneralConstants.HOME_APP));
    }
    public static void salidaApp() {
        AyudasServices.tiempo(3000);
        Assert.assertTrue(MobileActionManager.isVisible(LoginConstants.LOGIN));
    }
}
