Create table user_info(
user_id int NOT NULL auto_increment,
first_name varchar(255) not null,
last_name varchar(255) not null,
primary key (user_id)
);


select * from viddler.user_info;

insert into viddler.user_info (first_name, last_name)
values ('test2','test_lastName2');

Create table video_info(
movie_id int not null,
movie_location varchar(255) not null,
primary key (movie_id)
);

select * from viddler.video_info;

drop table viddler.video_info;

create table user_video(
user_id int not null,
movie_id int not null,
foreign key (user_id) references user_info(user_id),
foreign key (movie_id) references video_info(movie_id)
);

select * from viddler.user_video;

