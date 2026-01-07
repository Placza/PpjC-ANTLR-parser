# PpjC-ANTLR-parser
Parser napisan u alatu ANTLR za stvaranje AST podskupa jezika C za potrebe 3. i 4. teže laboratorijske vježbe PPJ kolegija

# Za koga je ovaj repo
Svatko tko se našao u neugodnoj situaciji gdje je izabrao težu inačicu PPJ labosa (yikes) i došao do 3. i 4. labosa, a 1. i 2. nije predao/dobro riješio, worry not! Ovaj repozitorij sadrži PpjC parser! Unatoč velikom broju testnih primjera koje su naši dragi kolege za nas pripremili i podijelili na Discordu ili GitHub-u, nikad dovoljno primjera ako želite zaista biti sigurni da vaše rješenje "štima". Zato, umjesto da popravljate vaš pokvareni generator leksičkog i sintaksnog analizatora ili nepostojećeg leksičkog ili sintaksnog analizatora, samo skinete ovaj parser i radit moći ćete sve (i više) od toga što biste mogli i s potpunim rješenjem 1. i 2. vježbe (više-manje).

# Upute korištenja
Potrebno je skinuti ANTR kako biste mogli koristiti ova parser. [Ovjde možete naći official guide za skiadnje ANTLR programske podrške](https://github.com/antlr/antlr4/blob/4.13.2/doc/getting-started.md). Nakon skidanja, sve što trebate je u neki folder staviti kod parsera i u terminal upisati "java Cjezik". Nakon toga upišete kod za koji želite dobiti AST.

# Što nedostaje
Trenutačno ovaj parser ne prepoznaje cijelu definiciju znaka i niza znakova koji definira standardni PpjC. Niz znakova ne može zadržavati nikakve ostale znakove osim slova (velika i mala) i brojki (da, čak niti razmak!). Kod znaka je ista limitacija. Također, trenutačno parser ne broji u kojem se retku nalazi koji završni znak.
