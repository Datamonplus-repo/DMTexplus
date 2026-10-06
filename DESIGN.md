# Texplus Design System

Diretrizes visuais para criar e evoluir as telas web do Texplus no Google Stitch. O sistema deve parecer uma aplicação empresarial já estabelecida: clara, eficiente e consistente com o tema `WorkWithPlusThemeDS` usado pelo produto.

## Produto e contexto

- **Produto:** Texplus, aplicação web empresarial para operações e gestão.
- **Público:** equipes que consultam e atualizam dados operacionais durante o trabalho.
- **Plataforma:** aplicação web responsiva, orientada a desktop e utilizável em tablets e celulares.
- **Idioma:** priorizar português; permitir textos localizados sem depender de tamanho fixo para rótulos ou botões.
- **Referência visual existente:** `WorkWithPlusThemeDS`, Bootstrap e Font Awesome 5.
- **Escopo de marca:** uma marca, Texplus.

## Princípios de design

1. **Clareza operacional:** priorizar dados, estados e ações frequentes; evitar decoração que compita com o trabalho.
2. **Consistência:** repetir padrões de navegação, formulários, tabelas, ações e mensagens.
3. **Densidade com legibilidade:** permitir leitura e comparação eficientes sem comprimir alvos interativos ou rótulos.
4. **Ação previsível:** diferenciar claramente ações primárias, secundárias e destrutivas; mostrar feedback após cada ação.
5. **Acessibilidade inclusiva:** atender WCAG 2.2 AA, com teclado, foco visível, contraste adequado e informação que não dependa apenas de cor.

## Identidade visual

Use a paleta abaixo como referência fiel ao tema da aplicação. O vinho é a cor de ação e destaque, não uma cor de fundo para grandes áreas. A navegação lateral usa azul-ardósia escuro para se distinguir do conteúdo principal.

### Cores de referência

| Papel | Valor | Uso |
|---|---|---|
| Primária | `#950000` | Ação principal, seleção e identidade |
| Primária em hover | `#7C0000` | Hover de ações primárias |
| Borda de ação e foco | `#8B0000` | Foco e contorno de ações, sempre com indicador de foco claramente visível |
| Texto sobre primária | `#FFFFFF` | Texto e ícones sobre superfícies primárias |
| Fundo da aplicação | `#EEEEEE` | Fundo atrás de painéis e conteúdo |
| Superfície de dados | `#FFFFFF` | Formulários, cartões, tabelas e diálogos |
| Navegação lateral | `#222D32` | Fundo da sidebar |
| Navegação secundária | `#2C3B41` | Submenus |
| Item selecionado/aberto | `#1E282C` | Estado atual da navegação |
| Texto principal | `#575B5D` | Texto de atributos e conteúdo |
| Rótulos e metadados | `#627077` | Rótulos de campos e informação auxiliar |
| Linhas de tabela | `#D9D9D9` | Divisores discretos |
| Realce de linha | `#F7F7F7` | Hover ou seleção de linha |
| Sucesso | `#00A65A` | Confirmações e estados bem-sucedidos |
| Atenção | `#F39C12` | Avisos que requerem atenção |
| Erro | `#DD4B39` | Erros e ações destrutivas |
| Informação | `#3C8DBC` | Mensagens e estados informativos |

### Tokens semânticos

Ao criar telas, pense em tokens pelo papel que desempenham, não pelo nome ou valor hexadecimal. Manter valores consistentes com a tabela acima:

- `color.action.primary`, `color.action.primary.hover`, `color.action.on-primary`
- `color.canvas`, `color.surface`, `color.surface.subtle`
- `color.navigation.background`, `color.navigation.item`, `color.navigation.selected`
- `color.text.primary`, `color.text.secondary`, `color.text.inverse`
- `color.border.default`, `color.border.focus`, `color.row.hover`
- `color.feedback.success`, `color.feedback.warning`, `color.feedback.danger`, `color.feedback.info`

Não introduzir gradientes, novas cores de marca ou um tema escuro sem uma decisão explícita de produto. Não comunicar estados exclusivamente pela cor: combinar cor com rótulo, ícone ou texto.

## Tipografia

- **Família:** Roboto, conforme o tema existente; usar uma pilha sans-serif de sistema como fallback.
- **Títulos de página:** claros e concisos, com peso médio ou forte; reservar o maior tamanho para a página, não para cada seção.
- **Títulos de seção e cartões:** distinguir por tamanho e peso, mantendo hierarquia consistente.
- **Texto e controles:** legíveis em tamanhos confortáveis para uso prolongado.
- **Metadados e texto auxiliar:** menores que o corpo, mas nunca difíceis de ler nem com contraste insuficiente.
- **Números e dados:** alinhar valores comparáveis e preservar a legibilidade de identificadores e quantidades.

Use texto direto e rótulos familiares ao domínio. Evite caixa alta em frases inteiras, excesso de pesos tipográficos e texto de interface fictício ou sem significado.

## Espaçamento, forma e elevação

- **Grade:** múltiplos de 4 px. Usar incrementos consistentes para espaçamento interno, distância entre controles e separação entre seções.
- **Agrupamento:** manter rótulo próximo do respectivo campo; separar grupos relacionados com espaçamento ou divisores.
- **Densidade:** listas e telas operacionais podem ser compactas, mas preservam alvos confortáveis, leitura e separação entre ações.
- **Bordas:** retas ou discretamente arredondadas, compatíveis com uma interface administrativa Bootstrap; reservar contornos mais fortes para foco e seleção.
- **Elevação:** baixa e funcional. Usar sombra apenas para estabelecer camadas como menu suspenso, popover ou diálogo; preferir bordas para separar cartões no fluxo normal.
- **Consistência:** reutilizar a mesma forma e espaçamento para componentes com a mesma função.

## Estrutura e navegação

- Usar uma **sidebar escura** para a navegação principal, com grupos e hierarquia de itens fáceis de percorrer.
- Destacar a localização atual com fundo e texto contrastantes; incluir um segundo indicador visual, como ícone ou marcador, quando necessário.
- Reservar o **conteúdo claro** para a área de trabalho, com título de página e ações relevantes no topo.
- Manter ações frequentes próximas do conteúdo a que se aplicam.
- Em telas menores, recolher ou transformar a navegação lateral sem ocultar a localização atual ou as ações essenciais.
- Evitar cabeçalhos excessivamente altos, navegação duplicada e áreas vazias sem propósito.

## Componentes e padrões

### Botões e ações

- **Primário:** vinho `#950000`, texto branco; uma ação primária dominante por contexto.
- **Secundário:** superfície neutra com contorno discreto; usar para ações complementares.
- **Destrutivo:** usar a cor de erro e um rótulo explícito; pedir confirmação quando a consequência for relevante ou difícil de reverter.
- Manter texto de ação específico e orientado a verbos, como “Salvar”, “Cancelar” e “Excluir”.
- Ícones podem acompanhar o texto; ações apenas com ícone precisam de nome acessível e tooltip quando o significado não for óbvio.
- Mostrar estados de hover, pressionado, foco, desabilitado e carregamento sem deslocar o layout.

### Formulários

- Organizar campos em grupos com títulos claros e ordem de preenchimento previsível.
- Preferir rótulos persistentes acima dos campos; não depender de placeholder como único rótulo.
- Distinguir visualmente campo editável, somente leitura e desabilitado.
- Indicar campos obrigatórios, validação e erros junto ao campo correspondente, com mensagem útil para correção.
- Preservar os valores preenchidos quando houver erro; identificar o campo inválido sem depender apenas de borda colorida.
- Evitar formulários excessivamente longos em uma única coluna quando o espaço permitir agrupamento lógico.

### Tabelas e listas

- Dar prioridade à comparação e leitura rápida: cabeçalhos claros, alinhamento consistente e linhas separadas discretamente.
- Usar hover/seleção com fundo próximo de `#F7F7F7`, preservando contraste do texto e indicação inequívoca de seleção.
- Manter ordenação, filtros, seleção, ações por linha e paginação visualmente distintas.
- Alinhar números e datas de forma consistente; evitar truncar informação essencial sem alternativa para consultá-la.
- Em telas estreitas, preservar as colunas e ações mais importantes ou oferecer uma apresentação adaptada; evitar encolher a tabela até ficar ilegível.
- Diferenciar lista vazia, ausência de resultados após filtro, carregamento e erro de carregamento.

### Dashboard e cartões

- Apresentar primeiro os indicadores e tarefas prioritários para o usuário.
- Usar cartões para agrupar informação relacionada, sem transformar cada valor em um cartão independente.
- Identificar unidades, períodos e contexto de cada indicador; não depender apenas de gráficos.
- Usar gráficos simples e rótulos legíveis; disponibilizar valores ou resumo textual para a informação essencial.

### Diálogos e feedback

- Usar diálogos para decisões contextualizadas e curtas, com título, consequência e ações explícitas.
- Não usar diálogo para mensagens rotineiras ou conteúdo que possa permanecer na página.
- Exibir feedback de sucesso, aviso, erro e informação com ícone e texto, além da cor.
- Mensagens de erro explicam o que ocorreu e como prosseguir; mensagens de sucesso confirmam o resultado em linguagem simples.
- Indicar carregamento em operações demoradas e bloquear apenas a ação que está em andamento.

## Ícones

- Usar **Font Awesome 5**, já presente na aplicação.
- Preferir uma única família de ícones e traço visual consistente; não misturar emojis com ícones de interface.
- Ícones devem reforçar rótulos, não substituí-los quando a ação não for universalmente reconhecível.
- Manter tamanho e alinhamento consistentes com o texto adjacente; evitar ícones puramente decorativos em excesso.

## Responsividade e interação

- Projetar primeiro para as telas administrativas desktop existentes, adaptando o fluxo para tablet e celular.
- Em telas estreitas, priorizar conteúdo e ações essenciais; reorganizar layouts em vez de reduzir texto ou alvos de toque.
- Garantir navegação por teclado, ordem de foco previsível, foco visível e operação sem mouse.
- Respeitar preferência de movimento reduzido; animações, se usadas, devem ser discretas e funcionais.
- Não fazer conteúdo depender de hover para ficar visível ou acionável.

## Acessibilidade e conteúdo

- Atender **WCAG 2.2 nível AA** para contraste, foco visível, teclado e nomes acessíveis.
- Usar contraste suficiente para texto, controles, bordas informativas e foco; verificar o contraste final sobre cada superfície.
- Manter alvos interativos confortáveis, com espaçamento para reduzir ativações acidentais.
- Usar títulos, rótulos e mensagens concisos, consistentes e localizáveis.
- Identificar cada controle por seu propósito e comunicar erros de forma associada ao campo ou ação.
- Não usar cor, posição, forma ou ícone isoladamente para transmitir informação crítica.

## Direção para telas geradas no Stitch

Ao gerar ou atualizar uma tela:

1. Reutilizar a identidade do Texplus e os tokens deste documento; não criar uma marca ou paleta alternativa.
2. Manter sidebar azul-ardósia, conteúdo em superfícies claras e vinho reservado às ações e seleções importantes.
3. Preferir padrões empresariais familiares de WorkWithPlus: lista com busca/filtros e paginação, formulário agrupado, confirmação contextual e feedback explícito.
4. Usar conteúdo plausível e em português para demonstrar a hierarquia visual; evitar texto de preenchimento genérico.
5. Entregar layouts responsivos e visualmente consistentes, respeitando a grade de 4 px e WCAG 2.2 AA.
6. Não inventar funcionalidades, dados de negócio, logotipos ou padrões de navegação que não sejam sustentados pelo contexto da tela.
