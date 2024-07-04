# RPG
## Консольная игра
### Идея
Сделать простенький текстовый бесконечный квест, где создается главный герой
и где можно драться на разных локациях с разными врагами и изредка одним боссом.

### Структура программы
При запуске `main`, запускается стартовое меню, в котором
- [x] есть функция "Новая игра", которая запускает саму игру(основную программу)
- [ ] есть функция "Продолжить", которая вытаскивала бы счет врагов и сокровищ игрока
  и запускала бы программу без вступления
- [x] есть функция "Выйти из игры", которая завершала бы программу

После запуска `main` и выбора "Новая игра" создается главный герой `MainCharacter`, а
затем главного героя программа начинает гнать по локациям `GameLocation` и боям `battle` `fight` с помощью метода
`adventureGenerator`.

Выбор локации осуществляется с помощью ограниченного генератора случайных чисел `numberGenerator.

На локации спавнится список со случайным количеством врагов с ограниченным максимальным
значением, и игрок должен сражаться с каждым поочереди.

Игрок имеет возможность:

- [x] Атаковать врагов, в следствии чего враг получал бы урон
- [ ] Уклоняться от ударов врагов. (С технической точки зрения эта функция не имеет смысла, но разбавляет бой для игрока)
- [ ] Блокировать удары (Имеет такую же функцию, как и уклонение)

Когда у врага кончалось здоровье, игроку должно перекидывать следующего по списку.

Как только список "живых" `alive` врагов закончится, игроку :

- [ ] должно сообщаться об этом и начислять сокровище
- [x] должна передаваться новая локация

Игрок в любой момент имеет:

- [x] Возможность выйти из игры (завершить программу)
- [ ] Сохранить игру

# Стадия проекта
# НЕ ЗАВЕРШЕН
## Причина:
1. Ошибка, из-за которой программа в бою берет того же противника и уменьшает значение его здоровье(плюс уменьшает в отрицательное значение)
   и не переходит к следующему по списку оппоненту.
2. Нехватка времени