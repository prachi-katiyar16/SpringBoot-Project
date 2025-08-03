package com.example.demo.controller;

import com.example.demo.dto.UserDTO;
import com.example.demo.service.UserAdminService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
//@PreAuthorize("hasRole('USER1')")
public class UserController {

    private final UserAdminService userService;

    public UserController(UserAdminService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    public List<UserDTO> getAllUsersDTO() {
        return userService.getAllUsersDTO();
    }

    @GetMapping("/paging")
    public Page<UserDTO> getUsers(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "asc") String sortDir
    ) {
        return userService.getUsers(page, size, sortBy, sortDir);
    }

    // POST /users (Accepts UserDTO, Returns UserDTO)
    @PostMapping
    public UserDTO createUserDTO(@Valid @RequestBody UserDTO dto) {
        return userService.createUserDTO(dto);
    }
}

















