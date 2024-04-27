package com.cesi.business.logic;

import jakarta.ejb.Local;

import java.io.Serializable;

@Local
public interface StudentServiceLocal extends Serializable {
    public void addStudent(String firstname, String lastname);

    public void addAuthenticationInformations(String email, String pwd);

    public void save();
}
