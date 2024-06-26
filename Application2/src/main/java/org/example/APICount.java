package org.example;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class APICount {

    @Id
    private Long employeeId;
    private Integer count = 0;

    public APICount() {}

    public APICount(Long employeeId, Integer count) {
        this.employeeId = employeeId;
        this.count = count;
    }

    // getters and setters
    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

}
