## Refatorações necessárias

**Criar**: 
AbstractPerson com todos os atributos e métodos de person. 

**Extender**:
1. Person<A extends Address> extends AbstractPerson<A>
2. PersonContext<A extends AddressContext> extends Person<A>
3. AddressContext extends Address

Classe main possui 2 testes.

Classe PersonCore não precisou alterar.
