package salary_calculator;

import externalServices.BaseSalaryService;
import externalServices.SaturdayBonusService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;

class SalaryCalculatorTest {

    @Test
    void calculateSalary() {
        int howManySaturdays = 4;
        BigDecimal oneTimeBonus = new BigDecimal("400.0");

        SaturdayBonusService saturdayBonusServiceMock = Mockito.mock(SaturdayBonusService.class);
        BaseSalaryService baseSalaryServiceMock = Mockito.mock(BaseSalaryService.class);

        Mockito.when(saturdayBonusServiceMock.getSaturdayBonus()).thenReturn(new BigDecimal("1000.0"));
        Mockito.when(baseSalaryServiceMock.getBaseSalary()).thenReturn(new BigDecimal("5000.0"));

        SalaryCalculator salaryCalculator = new SalaryCalculator(saturdayBonusServiceMock, baseSalaryServiceMock);

        BigDecimal salary = salaryCalculator.calculateSalary(howManySaturdays, oneTimeBonus);

        Assertions.assertEquals(new BigDecimal("9400.0"), salary);
    }
}