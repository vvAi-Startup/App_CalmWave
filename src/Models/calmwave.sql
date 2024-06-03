create database CalmWave;
use calmwave;

create table desenvolvedores(
id_dev int auto_increment,
nome_usuario varchar(20) not null,
senha varchar(15) not null,
nome_completo varchar(50) not null,
email varchar(40) unique not null,
telefone bigint unique not null, 
tipo_dev int not null,
primary key(id_dev)
);
create table usuarios(
id_usuario int auto_increment,
nome_usuario varchar(20) not null,
senha varchar(15) not null,
nome_completo varchar(50) not null,
email varchar(40) unique not null,
telefone bigint unique not null, 
primary key(id_usuario)
);
create table suporte(
id_suporte int auto_increment,
chat varchar(300) not null,
usuario int,
dev int,
foreign key(dev) references desenvolvedores(id_dev),
foreign key(usuario) references usuarios(id_usuario),
primary key(id_suporte)
);
create table playlists(
id_playlist int auto_increment,
nome_playlist varchar(25) not null,
criacao_playlist datetime not null,
qtd_musicas int,
tempo_duracao time,
dev int,
usuario int,
foreign key(usuario) references usuarios(id_usuario),
foreign key(dev) references desenvolvedores(id_dev),
primary key(id_playlist)
);
create table musicas(
id_musica int auto_increment,
nome_musica varchar(45) not null,
nome_musicaCripto varchar(50),
artista varchar(20),
duracao time not null,
ano int,
playlist int,
foreign key(playlist)references playlists(id_playlist),  
primary key(id_musica)
);
create table pasta_ruidos(
id_ruido int auto_increment,
nome_ruido varchar(20) not null,
nome_ruidoCripto varchar(50),
duracao time not null,
frequencia double,
loop_ boolean,
playlist int,
foreign key(playlist)references playlists(id_playlist),  
primary key(id_ruido)
);

-- Inserindo dados na tabela desenvolvedores
INSERT INTO desenvolvedores (nome_usuario, senha, nome_completo, email, telefone, tipo_dev) VALUES
('dev1', 'senha123', 'Leonardo', 'dev1@example.com', 1234567890, 1),
('dev2', 'senha456', 'Marcelo', 'dev2@example.com', 9876543210, 1),
('dev3', 'senha789', 'Marlon', 'dev3@example.com', 1112223333, 0),
('dev4', 'senhaabc', 'Victor', 'dev4@example.com', 4445556666, 0);

-- Inserindo dados na tabela usuarios
INSERT INTO usuarios (nome_usuario, senha, nome_completo, email, telefone) VALUES
('user1', 'password1', 'José', 'user1@example.com', 5551112222),
('user2', 'password2', 'Amanda', 'user2@example.com', 9998887777),
('user3', 'password3', 'Luisa', 'user3@example.com', 7778889999),
('user4', 'password4', 'Wagner', 'user4@example.com', 6665554444);

-- Inserindo dados na tabela suporte
INSERT INTO suporte (chat, usuario) VALUES
('Problema técnico', 1),
('Dúvida sobre funcionalidade', 2),
('Problema de login', 3),
('Dúvida sobre pagamento', 4);

-- Inserindo dados na tabela playlists
INSERT INTO playlists (nome_playlist, criacao_playlist, qtd_musicas, tempo_duracao, dev) VALUES
('Playlist 1', NOW(), 10, '01:00:00', 1),
('Playlist 2', NOW(), 15, '01:30:00', 2),
('Playlist 3', NOW(), 8, '00:45:00', 3),
('Playlist 4', NOW(), 20, '02:15:00', 4);

-- Inserindo dados na tabela musicas
INSERT INTO musicas (nome_musica, artista, duracao, ano, playlist) VALUES
('Música 1', 'Artista 1', '00:03:30', 2020, 1),
('Música 2', 'Artista 2', '00:04:15', 2019, 1),
('Música 3', 'Artista 3', '00:02:45', 2021, 2),
('Música 4', 'Artista 4', '00:03:00', 2018, 3),
('Música 5', 'Artista 5', '00:05:30', 2022, 3),
('Música 6', 'Artista 6', '00:04:00', 2020, 4),
('Música 7', 'Artista 7', '00:04:45', 2017, 4);

-- Inserindo dados na tabela pasta_ruidos
INSERT INTO pasta_ruidos (nome_ruido, duracao, playlist, frequencia, loop_) VALUES
('Ruído 1', '00:01:00', 2, 440, true),
('Ruído 2', '00:00:45', 2, 550, false),
('Ruído 3', '00:01:30', 3, 660, false),
('Ruído 4', '00:02:00', 3, 770, true),
('Ruído 5', '00:00:45', 4, 880, false),
('Ruído 6', '00:01:15', 4, 990, true);

SELECT nome_completo, email, telefone
FROM desenvolvedores
WHERE tipo_dev = 1;

SELECT nome_completo, email, telefone
FROM desenvolvedores
WHERE tipo_dev = 0;

select * from desenvolvedores;




    
