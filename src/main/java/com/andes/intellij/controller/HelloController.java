package com.andes.intellij.controller;

import com.andes.intellij.model.Delete_DB_UserInfo_Model;
import com.andes.intellij.model.Insert_DB_UserInfo_Model;
import com.andes.intellij.model.Return_DB_Json_Model;
import com.andes.intellij.model.Update_DB_UserInfo_Model;
import com.andes.intellij.service.TestService;
import com.andes.intellij.vo.MmbrVO;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/user")
public class HelloController {
    private final TestService userService;

    @ApiResponses({
            @ApiResponse(code = 200, message = "ok"),
            @ApiResponse(code = 404, message = "page not found")
    })
    @ApiOperation(value= "목록 조회", notes = "목록 조회 API")

    @GetMapping("/listUser")
    public ResponseEntity<List<MmbrVO>> getTest()
    {
        List<MmbrVO> res = userService.listUser();
        return new ResponseEntity<List<MmbrVO>>(res, HttpStatus.OK);
    }

    @PostMapping("/createUser")
    public ResponseEntity<String> createUser(@RequestBody Insert_DB_UserInfo_Model user){
        try {
            int res = userService.insertUser(user);
            if (res > 0) return new ResponseEntity<String>("success", HttpStatus.OK);
            else return new ResponseEntity<String>("failed", HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity<String>("failed", HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/deleteUser")
    public ResponseEntity<String> deleteUser(@RequestBody Delete_DB_UserInfo_Model user) {
        try {
            int res = userService.deleteUser(user);
            if (res > 0) return new ResponseEntity<String>("success", HttpStatus.OK);
            else return new ResponseEntity<String>("failed", HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity<String>("failed", HttpStatus.BAD_REQUEST);
        }
    }

    @PatchMapping("/updateUser")
    public ResponseEntity<String> updateUser(@RequestBody Update_DB_UserInfo_Model user) {
        try {
            int res = userService.updateUser(user);
            if (res > 0) return new ResponseEntity<String>("success", HttpStatus.OK);
            else return new ResponseEntity<String>("failed", HttpStatus.BAD_REQUEST);
        }catch (Exception e) {
            return new ResponseEntity<String>("failed", HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/0002")
    public String getSimpleInfo(Model model)
    {
        model.addAttribute("message", "test hello world");
        return "simple_info";
    }
}
