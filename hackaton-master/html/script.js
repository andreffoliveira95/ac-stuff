$(".inputBtn").click(function(e) {

    e.preventDefault();

    const url = 'http://192.168.2.220:8080/TransforMusic/api/listusers';

    let user = {};

    const userData = async() => {
        const response = await fetch(url);
        const data = await response.json();
        return data;

    }

    userData().then(data => {
        for (let i = 0; i < data.length; i++) {
            if ($('#name').val() === data[i].username && $('#password').val() === data[i].password) {
                user = data[i];
                $(".msg").append(user.username);
                break;
            } else {
                $(".msg").append("Guest")
                break;
            }

        }
    });

    $(this).parent().parent().fadeOut();

    setTimeout(function() {
        $("#mainContent").animate({
            marginLeft: "0px",
            opacity: "1"
        })
    }, 800)


})

$("#h2Choice").click(function() {
    this.classList.toggle("active");
    var content = this.nextElementSibling;
    if (content.style.maxHeight) {
        content.style.maxHeight = null;
    } else {
        content.style.maxHeight = content.scrollHeight + "px";
    }
})








// kim barreiros chupa teresa​
let kimChupa = `Chupa Teresa !
Chupa Teresa !
Que este gelado gostoso,
É feito de framboesa!
Há gelado de morango
Baunilha e abacaxi
As garotas do meu bairro
Vêm todas chupar aqui!
Há gelado de banana
Um fruto da natureza
Mas aqui tenho um gostoso
Que eu guardei prá Teresa !`;

// substiruir o nome Teresa
/************************************** */


let daMeOPito = `De todas as capoeiras, 
Lá da minha freguesia,
De todas as capoeiras,
Lá da minha freguesia,
Não há pito mais bonito,
Que o pito da Maria,
Não há pito mais bonito
Que o pito da Maria
Oh, Maria dá - me o pito
Oh, Maria dá - mo cá
Oh, Maria dá - me o pito
Toma lá, dá cá
Oh, Maria dá - me o pito
Oh, Maria dá - mo cá
Oh, Maria dá - me o pito
Toma lá, dá cá
Que pito tão rechunxudo
Tão bonito e cabeludo
Que pito tão rechunxudo
Tão bonito e cabeludo
Até houve que dissesse
Que o comia com penas e tudo
Até houve que dissesse
Que o comia com pena e tudo
Oh, Maria dá - me o pito
Oh, Maria dá - mo cá
Oh, Maria dá - me o pito
Toma lá, dá cá
`;





// Marco Paulo: Doce Paula

let marcoP = `
Paula
doce Paula
dizer teu nome
nesta ansiedade
Paula
lembrar teu sorriso
é paraíso
na tempestade.
Paula
és doce quimera
és a primavera
no meu Outono
Paula
rever o teu perfil
é semear Abril
neste abandono.
Paula, doce Paula
Paula, doce Paula.
Paula
lembrar o teu olhar
é desdobrar o mar
na luz da tarde
Paula
ouvir a tua voz
é desatar os nós
desta saudade.`;

// substituir paula e talvez alguns adjectivos

/*********************************************************************** */

// Marco Paulo: Joana

let MarcoPJoana = `
Tão longe
Contudo estivemos tão perto
Do amor que julgamos tão certo
Foi um sonho mais que por mim passou
Um véu de brancura se arrastou
Junto do altar ali ficou
Tu nem sabes bem quando eu te quis
Com outro vais ser mais feliz
Aqui fiquei a recordar...
    ...ar...ar...
Oh Joana!
Pensar que estivemos tão perto
Dos sonhos agora desperto
Só não quero ouvir
O sim que dirás...
    ...ás...ás...
Oh Joana !
Recordo agora os momentos
Passaram nos meus pensamentos
Mas longe de mim
Sei que ficarás
Era um tempo bom, cheio de paz
Como quem não espera horas más
Tu eras menina e tão mulher
Como quem já sabe o que quer
Eu era apenas um rapaz....
    ...az....az.... 
Oh Joana!
`;

// Substituir Joana, 

/******************************************************************************* */

// Marco Paulo: Anita

let MarcoPAnita = `
Verdade ilusão 
Primavera canção 
Anita
O mundo ri quando fala de si, mal ou bem 
É linda de blue - jeans e blusão de cetim 
Anita 
Doce tormento, de cabelos ao vento, mais livre que ninguém 
Tanto aprendeu dos livros que já leu e até na própria vida 
Faz amizades, não escolhe idades, mas anda sempre só, oh - oh
É linda de blue - jeans e blusão de cetim
Anita
Doce tormento, de cabelos ao vento, mais livre que ninguém
Não, namoros não tem, perde o tempo a estudar
Tantos lhe querem bem, tem mais em que pensar
Quando vai dançar, a gente tem de olhar
Anita

`;
//Substituir Anita, blue-jeans e blusão de cetim

/****************************************************** */
// Marco paulo: Chiquitita

let marcoPChiquitita = `
Chiquitita
Diz - me quem és
Que tristeza esconde o riso
só tu tens
um sabor de paraíso.
Não suporto ver - te chorar
teu segredo tem olhos de água
só tu és
um sabor de amor e mágoa.
Chiquitita
diz - me que pôs
nos teus olhos tal neblina
só tu tens
um sabor de tangerina.
Chiquitita
diz - me quem foi
que roubou a tua alegria
só tu és
um sabor a nostalgia.
Chiquitita
diz - me porquê
nos teus olhos cor de avelã
dancei com o vento
só tu és meu talismã
namorada, irmã
minha paz, meu sentimento.
Chiquitita
diz - me porquê
nos teus olhos cor de avelã
marés e saudades
só tu és meu talismã
namorada, irmã
diz - me quem és Chiquitita.
Talismã
namorada, irmã
diz - me quem és Chiquitita.
`;

// Substituir: Chiquitita
/********************************************************************** */

// Marco paulo: isabel​
let marcoPIsabel = `
Agora quero saber
porque te vejo mudada
mas tu não queres entender mais nada.
Agora quero pedir
ao menos o teu carinho
mas tu só pensas seguir
um outro caminho, Isabel.
Isabel mulher fatal
não me queiras tanto mal
Isabel meu sol de inverno
que juraste amor eterno
Isabel até o fim
tens na pele sabor a mim
Isabel minha alegria
meu amor de cada dia
Isabel
Não partas, Isabel.
Agora quero beijar
a tua face morena
mas tu desvias o olhar
sem pena.
Agora quero sentir
o que te vai no sentido
porque me deixas assim
sozinho e perdido
Isabel...
`;

// Substituir: Isabel
/************************************************************* */
// Marco Paulo: Dalila
let marcoPDalila = `
Vi - te no lume da aurora entrar nua nas águas
vi teus cabelos molhados espalhados no ar
és maravilha
chama - te o vento Dalila, Dalila do mar.
Ai, ai, ai, Dalila
vai, vai, vai, Dalila
Sem saber
se és sal, sereia ou mulher
eu quero deitar - me contigo
num sonho qualquer.
A caminhar como a Vénus saída das ondas
vi - te passar nessa praia vestida de mar
deusa de espuma
são os teus passos de bruma que eu quero tocar.
Ai, ai, ai, Dalila
vai, vai, vai, Dalila
Sem saber
se és sal, sereia ou mulher
eu quero deitar - me contigo
num sonho qualquer.
és maravilha
chama - te o vento Dalila, Dalila do mar.
Ai, ai, ai, Dalila
vai, vai, vai, Dalila
Sem saber
se és sal, sereia ou mulher
eu quero deitar - me contigo
num sonho qualquer.
"`;
let kimCu = `E eu nasci p'ra bombeiro
P'ra ajudar a minha gente
Ando sempre num vai-e-vem
P'ra acudir quem está doente
Ajudar pessoas carentes
É humano, faz tão bem
Porque será que há homens
Que não vão acudir ninguém?
Fazer bem, ser generoso
É a obrigação de um qualquer
Acreditem, deixo tudo
Para ir acudir mulher
Amigo, um conselho
Que te vai fazer bem:
Experimenta com jeitinho
Ir acudir alguém

Já fui acudir Helena
Já fui acudir tantas
Nem me lembro muito bem
Já fui acudir Helena
Ó mulher, não tenhas medo
Que eu vou-te acudir também`;

let KimBacalhau = `Quero cheirar teu bacalhau, Maria
Quero cheirar teu bacalhau,
Maria deixa-me ir à cozinha
Deixa-me ir à cozinha
Pra cheirar teu bacalhau

Quero cheirar teu bacalhau, Maria
Quero cheirar teu bacalhau,
Maria deixa-me ir à cozinha
Deixa-me ir à cozinha
Pra cheirar teu bacalhau
Teu bacalhau é mesmo uma beleza
És a portuguesa com teu prato especial
Se o cheiro é bom, mais gostoso é o cozido
É o prato preferido do povo de portugal

Teu bacalhau, demolhadinho
Diz-mo se é da noruéga ou aqui de portugal
Maria deixa-mo cheirar
Que coisa tão gostosa
Nunca cheirei nada igual

Quero cheirar teu bacalhau, maria
Quero cheirar teu bacalhau,
Maria deixa-me ir à cozinha
Deixa-me ir à cozinha
Pra cheirar teu bacalhau

Teu bacalhau é mesmo uma beleza
És a portuguesa com teu prato especial
Se o cheiro é bom, mais gostoso é o cozido
É o prato preferido do povo de portugal
`;

let KimCabritinha = `Quando eu nasci a minha mãe não tinha leite
Fui criado como um bezerro enjeitado
Mamei em vacas e em tudo que tinha peito
Cresci assim deste jeito
Fiquei mal habituado
Hoje sou homem e arranjei uma cabritinha
E passo o dia a mamar
Nos peitinhos da Fofinha
Eu gosto de mamar
Nos peitos da Cabritinha
Eu gosto de mamar
Nos peitos da cabritinha

Eu gosto de mamar
Nos peitos da cabritinha
Mamo à hora que eu quero porque a cabrita é minha.

Eu gosto de mamar
Ai, nos peitos da cabritinha
Eu gosto de mamar
Ai, nos peitos da cabritinha
Eu gosto de mamar
Só nos peitos da cabritinha
Mamo à hora que eu quero porque a cabrita é minha`;

let annaJ = `Quem te vê passar assim por mim
Não sabe o que é sofrer
Ter que ver você, assim, sempre tão linda
Contemplar o Sol do teu olhar, perder você no ar
Na certeza de um amor
Me achar um nada
Pois sem ter teu carinho
Eu me sinto sozinho
Eu me afogo em solidão

Oh, Anna Júlia
Oh, Anna Júlia

Nunca acreditei na ilusão de ter você pra mim
Me atormenta a previsão do nosso destino
Eu passando o dia a te esperar
Você sem me notar
Quando tudo tiver fim, você vai estar com um cara
Um alguém sem carinho
Será sempre um espinho
Dentro do meu coração

Oh, Anna Júlia
Oh, Anna Júlia`;


//array de musicas 
let arrMusics = [kimChupa, daMeOPito, marcoP, MarcoPJoana, MarcoPAnita, marcoPChiquitita, marcoPIsabel, marcoPDalila, kimCu, KimBacalhau, KimCabritinha, annaJ];
let names = ['Teresa', 'Maria', 'Paula', 'Joana', 'Anita', 'Chiquitita', 'Isabel', 'Dalila', 'Helena', 'Maria', 'cabritinha', 'Anna Júlia'];

let linksMusic = $(".aMusic");
var namesIndex;
linksMusic.each(function(index, element) {

    $(this).click(function() {
        //element.text(element.text().replace(/Hi|Hello|Hey/g, "Bye"));
        let input = $("#string").val();
        $(".pLyrics").text(arrMusics[index]);
        namesIndex = names[index];
        return namesIndex;
    })

})
let arrayInput = [];

$(".btnChange").click(function() {

        let input = $("#string").val();

        if ($(".pLyrics").text()) {
            $(".btnPlay").css({
                opacity: "1"
            })
        }

        $(".pLyrics").text(function() {
            strInput = $(this).text().replaceAll(namesIndex, input)
            arrayInput.push(strInput);
            $(function() {
                $('a.say').on('click', function(e) {

                    let text = $('.pLyrics').text();
                    let language = document.getElementById('languages').value;
                    text = encodeURIComponent(text);
                    let url = 'https://api.voicerss.org/?key=e64b54d7c40c4d77bf550a5e14b3af8d&hl=' + language + '&src=' + text;
                    $('audio').attr('src', url).get(0).play();
                })
            })
            return strInput;
        }); // pLyrics function end

    }) // btnChange end 

$('.stop').click(function() {

})