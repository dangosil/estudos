// DANIEL, ARTHUR VARIZI

import express, { Request, Response } from 'express';
import cors from 'cors';


const app = express();

app.use(cors());
app.use(express.json());

interface usuarios {
    id: number,
    name: string,
    playlist: number
};

interface playlists {
    id: number,
    name: string,
    tracks: string
};

const usuarios = [
    {id: 1, name: 'Niltão', playlists: [1, 2]},
    {id: 2, name: 'Nick', playlists: [3]},
    {id: 3, name: 'Will I Am', playlists: [] }
];

const playlists = [
    { id: 1, name: 'Forróck', tracks: ['Foguete não tem ré', 'O golpe taí', 'Forrock das aranhas'] },
    { id: 2, name: 'Funk dos cria', tracks: ['Vida Louca', 'Deu Onda', 'Ela Só Quer Paz'] },
    { id: 3, name: 'K-pop', tracks: ['Dynamite', 'Lovesick Girls', 'Gee'] }
];

// 1
app.get("/", (req: Request, res: Response) => {
    console.log("Hello, Express!");
});

// 2
app.get("/usuarios", (req: Request , res: Response) => {
    res.status(200).json(usuarios);
    console.log(usuarios);
});

// 3
app.get("/usuarios/:id", (req: Request, res: Response) => {
    const id = Number(req.params.id);
    let usuario;
    for(let i = 0; i < usuarios.length; i++) {
        if(usuarios[i]!.id === id ) {
            usuario = usuarios[i];
        }
    }
    res.status(200).json(usuario);
    console.log(usuario);
});

// 4

app.get("/playlists", (req: Request, res: Response) => {
    res.status(200).json(playlists);
    console.log(playlists);
});

// 5

app.get("/playlists/search", (req: Request, res: Response) => {
    const {name} = req.query;
    const playlistsRetornadas = playlists.find((playlist) => playlist.name === name)
    console.log(playlistsRetornadas);
});


const PORT = 3003;
app.listen(PORT, () => {
    console.log(`Servidor rodando na porta ${PORT}`);
});
