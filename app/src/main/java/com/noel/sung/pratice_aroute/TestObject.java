package com.noel.sung.pratice_aroute;

import android.os.Parcel;
import android.os.Parcelable;

public class TestObject implements Parcelable {


    /**
     * name :
     * age : 10
     * isEnable : false
     */

    private String name;
    private int age;
    private boolean isEnable;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isIsEnable() {
        return isEnable;
    }

    public void setIsEnable(boolean isEnable) {
        this.isEnable = isEnable;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeInt(this.age);
        dest.writeByte(this.isEnable ? (byte) 1 : (byte) 0);
    }

    public TestObject() {
    }

    protected TestObject(Parcel in) {
        this.name = in.readString();
        this.age = in.readInt();
        this.isEnable = in.readByte() != 0;
    }

    public static final Parcelable.Creator<TestObject> CREATOR = new Parcelable.Creator<TestObject>() {
        @Override
        public TestObject createFromParcel(Parcel source) {
            return new TestObject(source);
        }

        @Override
        public TestObject[] newArray(int size) {
            return new TestObject[size];
        }
    };
}
