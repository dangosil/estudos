import express, {Request , Response} from "express";
import cors from "cors";

const app = express();

app.use(cors());
app.use(express.json());

interface Pokemon {
    id: number,
    nome: string,
    tipo: string,
    hp: number
}

const pokemons:Pokemon[] = [
    {id: 1, nome: "Pikachu", tipo: "Elétrico", hp: 120},
    {id: 2, nome: "Bulbassauro", tipo: "Planta", hp: 80},
    {id: 3, nome: "Pikachu", tipo: "Elétrico", hp: 30},
    {id: 4, nome: "Pikachu", tipo: "Elétrico", hp: 40},
    {id: 5, nome: "Pikachu", tipo: "Elétrico", hp: 100}
]

app.delete("/pokemons/:id", (req: Request, res: Response) => {
    const id = Number(req.params.id);
    const pkmonEncontrado = pokemons.find((pokemon) => pokemon.id === id);
    if(!pokemons) {
        res.status(404).send("Pokemon não encontrado");
    };

    pokemons.filter((pokemon) => {
        return pokemon.id !== id;
    });
    res.status(200).send("Pokemon deletado!")

});


// app.delete("/pokemons/:id", (req: Request, res: Response) => {
//     const id = Number(req.params.id);

//     // Verifica se o Pokémon existe antes de filtrar
//     const pkmonEncontrado = pokemons.find(pokemon => pokemon.id === id);

//     if (!pkmonEncontrado) {
//         return res.status(404).json({ message: "Pokémon não encontrado." });
//     }

//     // Filtra e mantém só os pokémons com ID diferente
//     pokemons = pokemons.filter(pokemon => pokemon.id !== id);

//     return res.status(200).json({ message: "Pokémon deletado com sucesso." });
// });



app.get("/pokemons", (req: Request, res: Response) => {
    res.status(200).json(pokemons);
    console.log(pokemons);
});

app.get("/pokemons/:id", (req: Request, res: Response)=>{
    const id = Number(req.params.id);
    let pokemon;
    for(let i = 0; i < pokemons.length; i++) {
        if(pokemons[i]!.id === id) {
            pokemon = pokemons[i];
            break;
        }
    }
    res.status(200).json(pokemon);
    console.log(pokemon);
});

app.post("/pokemons", (req: Request, res: Response)=> {
    // body -> id, nome e tipo
    // const nome= req.body.nome;
    // console.log(nome);
    const {id, nome, tipo, hp} = req.body;
    let pokemonNovo:Pokemon = {
        id: id,
        nome: nome,
        tipo: tipo,
        hp: hp
    }
    pokemons.push(pokemonNovo);
    console.log(pokemonNovo);
    res.status(201).send("Pokemon criado");
});

app.listen(3000, () => {
    console.log("Servidor Executando")
});



// console.log("Olá Mundo!");
