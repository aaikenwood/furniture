package com.qa;

import com.qa.exceptions.InvalidToggleException;

public interface ISwitchable {
    String switchOn() throws InvalidToggleException;
    String switchOff() throws InvalidToggleException;
    String pluggedIn();
}
