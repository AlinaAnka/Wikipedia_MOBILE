# Проект по автоматизации тестовых сценариев для сайта Wikipedia <a href="https://www.moscowbooks.ru"> <img src="images/logo.png" width="200" >

## 📔 Содержание:
- Технологии и инструменты
- Описание автоматизированных тестов 
- Сборка в Jenkins
- Запуск автотестов
- Allure отчет
- Allure TestOps
- Уведомления в Telegram
- Видео выполнения тестов на Selenoid

## 🛠 Технологии и инструменты: 

| Java | IntelliJ <br> Idea | GitHub | JUnit <br> 5 | Gradle | Selenide | Selenoid | Alurre <br> Report | Jenkins | Telegram | TestOps |
|------|--------------------|--------|--------------|--------|----------|----------|--------------------|---------|----------|---------|
|[<img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original.svg" width="50" height="50" />](https://www.java.com) | [<img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/intellij/intellij-original.svg" width="50" height="50" />](https://www.jetbrains.com/idea/) | [<img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/github/github-original.svg" width="50" height="50" />](https://github.com) | [<img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/junit/junit-original.svg" width="50" height="50" />](https://junit.org/junit5/) | [<img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/gradle/gradle-original.svg" width="50" height="50" />](https://gradle.org) | [<img src="images/Selenide.svg" width="50" height="50" />](https://selenide.org) | [<img src="images/Selenoid.svg" width="50" height="50" />](https://aerokube.com/selenoid/) | [<img src="images/Allure_Report.svg" width="50" height="50" />](https://docs.qameta.io/allure/) | [<img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/jenkins/jenkins-original.svg" width="50" height="50" />](https://www.jenkins.io) | [<img src="images/Telegram.svg" width="50" height="50" />](https://telegram.org) | [<img src="images/TestOps.svg" width="50" height="50" />](https://telegram.org) |

## ☑️ Описание автоматизированных тестов
- Все тесты помечены тегом @Tag("web")
- Используется степовый подход с описанием действий через step()
- Применен паттерн Page Object для работы с страницами
### Структура тестов
Тесты разделены на 3 основных класса по функциональным блокам:
- SearchTests - тестирование функционала поиска книг
- LoginTests - тестирование авторизации пользователя
- BasketTests - тестирование работы с корзиной
### Описание реализованных проверок
#### Класс SearchTests - Функционал поиска книг
- Поиск книги по автору
- Поиск книги по точному названию
#### Класс LoginTests - Функционал авторизации
- Успешная авторизация с валидными данными
- Авторизация с неверным паролем
- Авторизация с неверным email
#### Класс BasketTests - Функционал работы с корзиной
- Добавление книги в корзину
- Удаление книги из корзины

## <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/jenkins/jenkins-original.svg" width="50" height="50" /> Сборка в [Jenkins](https://jenkins.autotests.cloud/job/BooksShop/)
<p align="center">
<img src="images/Jenkins.png">
</p> 

### Параметры сборки в Jenkins:
- browser (браузер chrome)
- browser_version (версия браузера 127.0)
- screen_resolution (разрешение экрана 1920x1080)

## ▶️ Запуск автотестов

### Запуск тестов из терминала

```bash
gradle clean test
```

### Запуск тестов на удаленном браузере

```bash
-Dbrowser=${BROWSER}
-Dscreen_resolution=${SCREEN_RESOLUTION}
-Dbrowser_version=${BROWSER_VERSION}
-DremoteUrl="https://user1:1234@${SELENOID_URL}/wd/hub"
```

## <img src="images/Allure_Report.svg" width="50" height="50" /> [Allure Report](https://jenkins.autotests.cloud/job/BooksShop/allure/)
### Overview
<p align="center">  
<img src="images/Allure.png">
</p>  

### Тест-кейсы
<p align="center">  
<img src="images/Allure2.png">
</p>  

## <img src="images/TestOps.svg" width="50" height="50" /> [Allure TestOps](https://allure.autotests.cloud/project/4846/test-cases?treeId=0)
<p align="center">  
<img src="images/Dashboard.png">
</p>  

### Ручные и и автоматизированные тест кейсы
<p align="center">  
<img src="images/TestCase.png">
</p> 

## <img src="images/Telegram.svg" width="40" height="40" /> Уведомления в Telegram с использованием бота
<p align="center">  
<img src="images/Telegram.png" width="500">
</p>  
