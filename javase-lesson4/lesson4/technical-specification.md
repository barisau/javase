# Arrays
Массивы:
- Одномерные массивы
- Многомерные массивы
- Массив массивов
- Работа с массивами и класс Arrays



## Theory
[Arrays](https://github.com/rakavets/javase/wiki/Arrays)


## Statement of work 1
Написать программу, которая сохраняет 10 `nickname` игроков. Нужно помнить, что число игроков (в данной задаче `10`) указано условно. После сохранения выводит все `nickname` в `Console`.

### Input
`Nickname` игрока может состоять из латинских букв и цифр. Длина `nickname` не более 20 символов.

### Output
Каждый `nickname` в новой строчке. Строка с `nickname` игрока в формате `Nickname: ${nickname}.`


## Statement of work 2
Написать программу, которая сохраняет статистику о 10 игроках. Нужно помнить, что число игроков (в данной задаче `10`) указано условно. После сохранения выводит статистику в `Console`.

Под статистикой понимает:

- `nickname`
- `email`
- `winrate`
- `rating`
- `date last game`

### Input
`nickname` состоит из латинских букв и цифр. Длина не более 20 символов.

`email` состоит из латинских букв, цифр, символов `@` и `.`. Длина не более 40 символов.

`winrate` - вещественное число. 0 <= `winrate` <= 100.

`rating` - целое число. 0 <= `rating` <= 10000.

`date last game` - дата в формате `dd.MM.yyyy hh:mm`.

### Output
Статистика игрока в новой строчке. Строка с статистикой игрока в формате `Nickname: ${nickname}. Email: ${email}. Winrate: ${winrate}. Rating: ${rating}. Date last game: ${dateLastGame}`.

Статистику игрока лучше оформить в отдельный класс.


## Statement of work 3
Написать программу, которая сохраняет 16 четвертных `mark` ученика. Нужно помнить, что число отметок (в данной задаче `16`) указано условно. После сохранения выводит все `mark` в `Console`.

### Input
`Mark` - целое число. 0 <= `mark` <= 100.

### Output
Каждый предмет в новой строчке. Строка с `mark` ученика в формате `${markForFirstSemester} {markForSecondSemester} {markForThirdSemester} {markForFourthSemester} ${totalMark}`.


## Statement of work 4
Написать программу, которая сохраняет информацию о 5 `student`. Нужно помнить, что число `student` (в данной задаче `5`) указано условно. После сохранения выводит все `student` в `Console`.

Под статистикой понимает:

- `name`
- `surname`
- `email`
- `class`
- `marks for the semester`

### Input
`name` состоит из латинских букв и цифр. Длина не более 30 символов.

`surname` состоит из латинских букв и цифр. Длина не более 40 символов.

`email` состоит из латинских букв, цифр, символов `@` и `.` . Длина не более 40 символов.

`class` состоит из латинских букв и цифр. Длина не более 30 символов.

`marks for the semester` массив размерностью 16 * 5. Элементы массива целые числа. 0 <= `mark` <= 100.

### Output
Информация о `student` в новом абзаце. Строка с информацией в формате `Name: ${name}. Surname: ${surname}. Email: ${email}. Class: ${class}. Marks for the semester: ${marks}`.

Каждый предмет в новой строчке. Строка с `mark` ученика в формате `${markForFirstSemester} {markForSecondSemester} {markForThirdSemester} {markForFourthSemester} ${totalMark}`.