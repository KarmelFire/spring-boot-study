package top.karmel.springboot.exception.annotation;

import io.micrometer.common.util.StringUtils;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import jakarta.validation.constraints.NotBlank;

import java.util.regex.Pattern;

/**
 * @ClassName PhoneValidator
 * @Description TODO
 * @Author BC
 * @Date 2024/10/15 14:36
 * @Version 1.0
 */
public class PhoneValidator implements ConstraintValidator<Phone, String>
{
    //⼿机号正则表达式
    private static final String REGEX_PHONE = "^1[3456789]\\d{9}$";
    @Override
    public void initialize(Phone phone) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
    if (StringUtils.isBlank(value)) {
        //忽略空值，由@NotBlank注解校验
        return true;
    }
    return Pattern.matches(REGEX_PHONE, value);
    }
}
