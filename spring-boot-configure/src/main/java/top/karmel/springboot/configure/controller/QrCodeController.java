package top.karmel.springboot.configure.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.karmel.springboot.configure.service.QrCodeService;

/**
 * @ClassName QrCodeController
 * @Description TODO
 * @Author BC
 * @Date 2024/9/25 15:51
 * @Version 1.0
 */
@RestController
@AllArgsConstructor
public class QrCodeController {
    private final QrCodeService qrCodeService;

    @GetMapping("/qrcode")
    public void qrcode(){
        qrCodeService.generateQrCode();
    }
}
