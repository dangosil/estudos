import express, {Request , Response} from "express";
import cors from "cors";

const app = express();

app.use(cors());
app.use(express.json());

interface Pokemon {
    id: number,
    nome: string,
    tipo: string
}

const pokemons:Pokemon[] = [
    {id: 1, nome: "Pikachu", tipo: "Elétrico"},
    {id: 2, nome: "Pikachu", tipo: "Elétrico"},
    {id: 3, nome: "Pikachu", tipo: "Elétrico"},
    {id: 4, nome: "Pikachu", tipo: "Elétrico"},
    {id: 5, nome: "Pikachu", tipo: "Elétrico"}
]


app.get("/pokemons", (req: Request, res: Response) => {
    res.status(200).json(pokemons);
})

app.get("/pokemons/:id", (req: Request, res: Response)=>{
    const id = Number(req.params.id);
    let pokemon;
    for(let i = 0; i < pokemons.length; i++) {
        if(pokemons[i]!.id === id) {
            pokemon = pokemons[i];
        }
    }
    res.status(200).json(pokemon);
})

app.post("/pokemons", (req: Request, res: Response)=> {
    // body -> id, nome e tipo
    // const nome= req.body.nome;
    // console.log(nome);
    const {id, nome, tipo} = req.body;
    let pokemonNovo:Pokemon = {
        id: id,
        nome: nome,
        tipo: tipo
    }
    pokemons.push(pokemonNovo);
    console.log(pokemonNovo);
    res.status(201).send("Pokemon criado");
})

app.listen(3000, () => {
    console.log("Servidor Executando")
})



// console.log("Olá Mundo!");
