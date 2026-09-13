# 🔧 Mekanism Mod

Um mod Minecraft que adiciona itens e blocos avançados relacionados a energia nuclear e engenharia!

## 📋 Features

- ⚡ **Steel Ingot** - Ligas de aço para crafting avançado
- 💎 **Reinforced Alloy** - Material reforçado com diamante
- 🔌 **Advanced Circuit** - Circuito avançado para maquinário
- ☢️ **Enriched Uranium** - Urânio enriquecido radioativo
- 💥 **Fission Fuel Pellet** - Combustível para reatores nucleares
- ⚙️ **Fission Reactor Core** - Núcleo de reator nuclear
- 🏠 **Fission Reactor Casing** - Blindagem de reator

## 🛠️ Requisitos

- **Java 17+** instalado
- **Gradle** (opcional, o mod inclui gradle wrapper)
- **Minecraft Forge** 1.20.1+

## 📦 Compilação

### Windows
```bash
cd mekanism-mod
gradlew.bat build
```

### Linux/Mac
```bash
cd mekanism-mod
./gradlew build
```

O arquivo `.jar` compilado estará em: `build/libs/mekanism-mod-1.0.0.jar`

## 🎮 Instalação Local

1. Compile o mod:
```bash
./gradlew build
```

2. Copie o arquivo JAR para a pasta de mods do Minecraft:
```
%APPDATA%\.minecraft\mods\  (Windows)
~/.minecraft/mods/            (Linux)
~/Library/Application Support/minecraft/mods/  (Mac)
```

3. Inicie o Minecraft com Forge instalado

## 🚀 Upload no CurseForge

### Passo 1: Criar Conta e Projeto
1. Acesse [CurseForge](https://www.curseforge.com/)
2. Clique em **"Log In"** ou crie uma conta
3. Vá para **"Dashboard"** → **"Create Project"**

### Passo 2: Preencher Informações do Projeto
- **Project Name**: `Mekanism Mod`
- **Project Summary**: "Um mod que adiciona itens e blocos nucleares avançados"
- **Project Description**: 
```
Mekanism Mod adiciona:
✨ Itens de engenharia nuclear
✨ Crafting recipes complexas
✨ Novos materiais e ligas
```
- **Category**: `Mods` → `Minecraft Java Edition`
- **Game Version**: Selecione `1.20.1`

### Passo 3: Upload do JAR
1. Clique em **"Upload File"**
2. Selecione `build/libs/mekanism-mod-1.0.0.jar`
3. Preencha:
   - **Release Type**: `Release` (ou `Beta`)
   - **Changelog**: Descreva mudanças
   - **Game Versions**: `1.20.1`
   - **Loaders**: `Forge`

### Passo 4: Publicar
1. Clique em **"Upload"**
2. Aguarde processamento
3. Clique em **"Publish"** quando pedido

## 📝 Receitas de Crafting

### Steel Ingot
- 1x Iron Ingot + 1x Coal = 1x Steel Ingot

### Reinforced Alloy
- 1x Steel Ingot + 1x Diamond = 1x Reinforced Alloy

### Advanced Circuit
```
R G R
G D G
R G R
```
- R = Redstone, G = Gold Ingot, D = Diamond

### Fission Fuel Pellet
- 1x Enriched Uranium + 1x Glowstone Dust + 1x Nether Star = 1x Fission Fuel Pellet

### Fission Reactor Core
```
R E R
E A E
R E R
```
- R = Reinforced Alloy, E = Enriched Uranium, A = Advanced Circuit

### Fission Reactor Casing
```
S S S
S   S
S S S
```
- S = Steel Ingot

## 📂 Estrutura do Projeto

```
mekanism-mod/
├── src/main/java/com/invictus/mekanismmod/
│   ├── MekanismMod.java
│   ├── item/
│   │   └── ModItems.java
│   ├── block/
│   │   └── ModBlocks.java
│   └── recipe/
│       └── ModRecipes.java
├── src/main/resources/
│   ├── assets/mekanism_mod/
│   │   ├── lang/
│   │   │   ├── en_us.json
│   │   │   └── pt_br.json
│   │   ├── models/
│   │   │   ├── item/
│   │   │   └── block/
│   │   └── textures/
│   │       ├── item/
│   │       └── block/
│   └── data/mekanism_mod/recipes/
├── build.gradle
└── README.md
```

## 🐛 Solução de Problemas

### Mod não aparece no Minecraft
- Certifique-se de que Forge está instalado
- Coloque o JAR na pasta correta de mods
- Reinicie o Minecraft

### Erro de compilação
```bash
./gradlew clean build
```

### Forge não instalado
1. Baixe de [minecraftforge.net](https://minecraftforge.net/)
2. Execute o instalador
3. Selecione `Install client`

## 📄 Licença

Este projeto está disponível sob licença MIT.

## 👨‍💻 Autor

Desenvolvido por **Invictus0000**

## 📞 Suporte

Para reportar bugs ou sugerir features, abra uma issue no [GitHub](https://github.com/Invictus0000/mekanism-mod)

---

**Aproveite o mod! 🚀**
