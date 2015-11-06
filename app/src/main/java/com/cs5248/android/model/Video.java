package com.cs5248.android.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

import org.parceler.Parcel;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lpthanh
 */
@Table(name = "videos", id = "id")
@Parcel(value = Parcel.Serialization.FIELD, analyze = Video.class) // do not analyze superclass
public class Video extends Model {

    @Getter
    @Setter
    @Column(name = "video_id", unique = true, onUniqueConflict = Column.ConflictAction.REPLACE)
    private Long videoId;

    @Getter
    @Setter
    @Column
    private String title;

    @Getter
    @Setter
    @Column
    private VideoStatus status;

    @Getter
    @Setter
    @Column
    private VideoType type;

    @Setter
    @Getter
    @Column
    private Date createdAt;

}
