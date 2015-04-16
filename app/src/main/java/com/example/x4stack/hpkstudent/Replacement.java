package com.example.x4stack.hpkstudent;

/**
 * Created by shpak on 16.04.15.
 */
public class Replacement {
    public Replacement(String group, String lessonNumber, String whosRaplacement, String lesson, String teacher, String classRoom) {
        this.group = group;
        this.lessonNumber = lessonNumber;
        this.lesson = lesson;
        this.teacher = teacher;
        this.classRoom = classRoom;
    }

    public String getGroup() {

        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getLessonNumber() {
        return lessonNumber;
    }

    public void setLessonNumber(String lessonNumber) {
        this.lessonNumber = lessonNumber;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    private String group, lessonNumber,lesson,teacher,classRoom;


}
