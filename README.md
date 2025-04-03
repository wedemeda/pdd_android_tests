# 🚦 Тестирование Android-приложения "Билеты ПДД 2025 и Экзамен ПДД" 📱
# 📌 ***Тест-кейсы

**Предусловия:**  
- Открыть приложение
- Выбрать радио кнопку: **"Автомобиль Категория B"**
- Нажать на кнопку: **"К обучению"**
- Нажать **"Разрешить"**

### **1. Проверка названия кнопки 'Билеты' после выбора в настройках категорий AB**
**Описание:** Проверяем, что после выбора в настройках категорий AB - текст кнопки 'Билеты' на главном экране меняется на 'Билеты AB'.  
**Метод:** `abCategoryCheck()`
 
 **Шаги:**
  1. Нажать на значок **"шестеренки"**
  2. Выбрать радио кнопку **"AB"**
  3. Нажать на стрелочку **"Назад"**

**Ожидаемый результат:**
- Текст кнопки **"Билеты"** поменялся на **"Билеты AB"**  

### **2. Проверка названия кнопки 'Билеты' после выбора в настройках категорий CD**
**Описание:** Проверяем, что после выбора в настройках категорий CD - текст кнопки 'Билеты' на главном экране меняется на 'Билеты CD'.  
**Метод:** `cdCategoryCheck()`
 
 **Шаги:**
  1. Нажать на значок **"шестеренки"**
  2. Выбрать радио кнопку **"CD"**
  3. Нажать на стрелочку **"Назад"**

**Ожидаемый результат:**
- Текст кнопки **"Билеты"** поменялся на **"Билеты CD"**  

### **3. Проверка отображения сообщения при выборе билетов экзамена категорий BC**
**Описание:** Проверяем, что при выборе билетов экзамена по категориям BC выводится сообщение, что их не существует.  
**Метод:** `infoTextBCCheck()`
 
 **Шаги:**
  1. Нажать на кнопку **"Экзамен"**
  2. Нажать на кнопку **"МНЕ НУЖНА КАТЕГОРИЯ BC"**

**Ожидаемый результат:**
- Отображается сообщение  **"Билетов BC не существует"**


### **4. Проверка подтверждения ответа после ответа на вопрос при его включении в настройках**
**Описание:** Проверяем, что при включенном в настройках подтверждении ответа на вопрос - после ответа появляется кнопка 'ПОДТВЕРДИТЬ ОТВЕТ'.  
**Метод:** `confirmAnswerButtonCheck()`
 
 **Шаги:**
  1. Нажать на значок **"шестеренки"**
  2. Выбрать радио кнопку **"AB"**
  3. Выбрать радио кнопку **"Дополнительно подтверждать выбранный ответ"**
  4. Нажать на стрелочку **"Назад"**
  5. Нажать на кнопку **"Экзамен"**
  6. Нажать на кнопку **"Начать экзамен"**
  7. Выбрать **"первый"** вариант ответа

**Ожидаемый результат:**
- Отображается кнопка **"ПОДТВЕРДИТЬ ОТВЕТ"**

### **5. Проверка переключения экрана вопроса на следующий при ответе с выключенным подтверждением**
**Описание:** Проверка, что при выключенном в настройках подтверждении ответа - после ответа на вопрос открывается экран следующего вопроса.  
**Метод:** `nextQuestionCheck()`
 
 **Шаги:**
  1. Нажать на кнопку **"Экзамен"**
  2. Нажать на кнопку **"AB"**
  3. Нажать на кнопку **"Начать экзамен"**
  4. Выбрать **"первый"** вариант ответа

**Ожидаемый результат:**
- На экране отображается **"вопрос №2"** 
