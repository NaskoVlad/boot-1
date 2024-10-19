package ru.netology.boot1.server;

public class DevProfile implements SystemProfile {
    @Override

    public String getProfile() {
        return "Current profile is dev";
    }
}