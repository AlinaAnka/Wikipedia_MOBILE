# Проект по автоматизации тестовых сценариев для мобильного приложения Wikipedia <a href="https://www.wikipedia.org"> <img src="images/logo.png" width="200" >

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

| Java |IntelliJ<br>Idea| GitHub | JUnit <br> 5 | Gradle | Selenide | Selenoid | Alurre <br> Report | Jenkins |
|------|----------------|--------|--------------|--------|----------|----------|--------------------|---------|
|[<img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original.svg" width="50" height="50" />](https://www.java.com) | [<img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/intellij/intellij-original.svg" width="50" height="50" />](https://www.jetbrains.com/idea/) | [<img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/github/github-original.svg" width="50" height="50" />](https://github.com) | [<img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/junit/junit-original.svg" width="50" height="50" />](https://junit.org/junit5/) | [<img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/gradle/gradle-original.svg" width="50" height="50" />](https://gradle.org) | [<img src="images/Selenide.svg" width="50" height="50" />](https://selenide.org) | [<img src="images/Selenoid.svg" width="50" height="50" />](https://aerokube.com/selenoid/) | [<img src="images/Allure_Report.svg" width="50" height="50" />](https://docs.qameta.io/allure/) | [<img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/jenkins/jenkins-original.svg" width="50" height="50" />](https://www.jenkins.io) | 
| TestOps |Brawserstack| Appium |Android <br> Studio| Android |REST <br> Assured|Appium <br> Inspector| Telegram |
| [<img src="images/TestOps.svg" width="50" height="50" />](https://qameta.io) | [<img src="images/Browserstack.svg" width="50" height="50" />](https://www.browserstack.com) | [<img src="images/Appium.png" width="50" height="50" />](https://appium.io/docs/en/latest/) | [<img src="images/Androidstudio.svg" width="50" height="50" />](https://developer.android.com/studio?hl=ru) | [<img src="images/Android.svg" width="50" height="50" />](https://www.android.com) | [<img src="images/RestAssured.svg" width="50" height="50" />](https://reqres.in) | [<img src="images/AppiumInspector.png" width="50" height="50" />](https://appium.github.io/appium-inspector/2024.12/quickstart/) | [<img src="images/Telegram.svg" width="50" height="50" />](https://telegram.org) |

## ☑️ Описание автоматизированных тестов
- Все тесты помечены тегами
- Шаговый подход через step()
- Четкое разделение тестов по функционалу
### Структура тестов
Тесты разделены на 3 класса по функциональным блокам:
- SearchTests - тестирование поиска статей
- SavedTests - работа с избранными статьями
- HistoryTests - проверка истории просмотров
### Описание реализованных проверок
#### SearchTests - Функционал поиска
- Успешный поиск статьи по ключевому слову
#### SavedTests - Работа с избранным
- Добавление статьи в избранное
#### HistoryTests - История просмотров
- Проверка сохранения истории

## <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/jenkins/jenkins-original.svg" width="50" height="50" /> Сборка в [Jenkins](https://jenkins.autotests.cloud/job/BooksShop/)
<p align="center">
<img src="images/Jenkins.png">
</p> 

### Параметры сборки в Jenkins:
- deviceHost (local, browserstack)

## ▶️ Запуск автотестов

### Запуск тестов из терминала
```bash
gradle clean test
```
#### Локально на эмуляторе:
```bash
gradle clean android_emulation
```
#### На BrowserStack:
```bash
gradle clean android_browserstack
```
#### Для работы тестов необходимо:
- Для локальных тестов - запущенный Appium сервер и эмулятор
- Для BrowserStack - корректные учетные данные в browserstack.properties

### Запуск тестов на удаленном браузере

```bash
clean test
-DdeviceHost=${deviceHost}
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

## <img src="images/Selenoid.svg" width="50" height="50" /> Примеры видео выполнения тестов на Selenoid
<p align="center">  
<img src="images/Video.gif" width="900">
</p>
