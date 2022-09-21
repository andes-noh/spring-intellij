package com.andes.intellij.controller;

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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/test")
public class HelloController {
    private final TestService testService;

    @ApiResponses({
            @ApiResponse(code = 200, message = "ok"),
            @ApiResponse(code = 404, message = "page not found")
    })
    @ApiOperation(value= "목록 조회", notes = "목록 조회 API")
    @GetMapping("/0001")
    public ResponseEntity<List<MmbrVO>> getTest()
    {
        List<MmbrVO> res = testService.helloWorld();
        return new ResponseEntity<List<MmbrVO>>(res, HttpStatus.OK);
    }

    @GetMapping("/0002")
    public String getSimpleInfo(Model model)
    {
        model.addAttribute("message", "test hello world");
        return "simple_info";
    }
}
