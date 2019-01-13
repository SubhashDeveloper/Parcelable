package com.example.subhash.parcelable;

import android.os.Parcel;
import android.os.Parcelable;

public class Pojo implements Parcelable {
    String name;
    String lastname;
    String profile;
    public Pojo()
    {

    }
    protected Pojo(Parcel in) {
        name = in.readString();
        lastname = in.readString();
        profile = in.readString();
    }

    public static final Creator<Pojo> CREATOR = new Creator<Pojo>() {
        @Override
        public Pojo createFromParcel(Parcel in) {
            return new Pojo(in);
        }

        @Override
        public Pojo[] newArray(int size) {
            return new Pojo[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(lastname);
        parcel.writeString(profile);
    }
}
