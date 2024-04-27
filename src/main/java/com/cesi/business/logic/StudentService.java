package com.cesi.business.logic;

import com.cesi.business.domain.Student;
import com.cesi.integration.StudentDAO;
import jakarta.inject.Inject;
import jakarta.ejb.Remove;
import jakarta.ejb.Stateful;

@Stateful
public class StudentService implements StudentServiceLocal {

    private Student student = new Student();

    @Inject
    StudentDAO studentDAO;

    @Override
    public void addStudent(String firstname, String lastname) {
        student.setFirstname(firstname);
        student.setLastname(lastname);
        System.out.println("identité de l'etudiant " + firstname + " " + lastname);
    }

    @Override
    public void addAuthenticationInformations(String email, String pwd) {
        student.setEmail(email);
        student.setPassword(pwd);
        System.out.println("ajout des informations d'authentification : " + email + " - " + pwd);
    }

    @Override
    @Remove
    public void save() {
        studentDAO.insert(student);
        System.out.println("sauvegarde de l'étudiant créé");
    }
}