package com.sahil.RestfulWebServiceAssignment2.Service;

import com.sahil.RestfulWebServiceAssignment2.Entity.ProtectedUser;

import java.util.List;

public interface ProtectedUserService {
    public List<ProtectedUser> getAllProtectedUsers();

    public ProtectedUser addProtectedUser(ProtectedUser protectedUser);


}
