/**
 * @program: empTest
 * @description: 员工信息表
 * @author: 王璐
 * @create: 2018-12-08 13:46
 **/

package com.wl.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Emp {
    private int empno;
    private String ename;
    private String job;
    private int mgr;
    @DateTimeFormat(pattern = "YYYY-MM-DD HH:mm:ss")
    private Date hiredate;
    private double sal;
    private double comm;
    private double deptno;

    public Emp() {
    }

    public Emp(int empno, String ename, String job, int mgr, Date hiredate, double sal, double comm, double deptno) {
        this.empno = empno;
        this.ename = ename;
        this.job = job;
        this.mgr = mgr;
        this.hiredate = hiredate;
        this.sal = sal;
        this.comm = comm;
        this.deptno = deptno;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getMgr() {
        return mgr;
    }

    public void setMgr(int mgr) {
        this.mgr = mgr;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public double getComm() {
        return comm;
    }

    public void setComm(double comm) {
        this.comm = comm;
    }

    public double getDeptno() {
        return deptno;
    }

    public void setDeptno(double deptno) {
        this.deptno = deptno;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", mgr=" + mgr +
                ", hiredate=" + hiredate +
                ", sal=" + sal +
                ", comm=" + comm +
                ", deptno=" + deptno +
                '}';
    }
}
