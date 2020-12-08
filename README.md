# GAME SNAKE

This repository is a final project (Java GUI) from Object-Oriented Programming Class, Teknik Informatika Universitas Padjadjaran.

[Challenge Guidelines](challenge-guideline.md)

Game Snake adalah game dimana pemain mengendalikan sebuah garis yang tumbuh memanjang, dengan garis itu sendiri yang menjadi rintangan utama.

## Credits

| NPM          | Name                       |
| ------------ | -------------------------- |
| 140810190009 | Farhan Gunadi              |
| 140810190025 | Aghniya Abdurrahman Mannan |
| 140810190037 | Bagas Adi Firdaus          |

## Change log

- **[Sprint Planning](changelog/sprint-planning.md) - (18 November 2020)**

  - Bagi tugas untuk minggu pertama
  - Buat Sprint 1

- **[Sprint 1](changelog/sprint-1.md) - (18 November 2020 - 24 November 2020)**

  - Membuat board game
  - Membuat objek ular dan menempatkannya di board
  - Membuat objek apple dan menempatkannya di board secara acak
  - Membuat movement dari objek ular

- **[Sprint 2](changelog/sprint-2.md) - (25 November 2020 - 02 Desember 2020)**

  - Membuat sistem scoring
  - Membuat kondisi game berakhir
  - Membuat kondisi awal dan akhir aplikasi
- **[Sprint 3](changelog/sprint-3.md) - (03 Desember 2020 - 09 Desember 2020)**

  - Membuat kondisi awal dan akhir aplikasi
  - Membuat kondisi tambahan dimana pergerakan ular dipercepat jika user menekan tombol shift
  - Merapihkan kodingan dan melengkapi README.md

## Running The App
File utama yang digunakan dalam program ini adalah SnakeGame.java.

**1. Buka Terminal di IDE yang kalian gunakan**

**2. Jalankan class Gameplay.java**
```
javac src/Gameplay.java
```
```
java src/Gameplay.java
```
**3. Jalankan class SnakeGame.java**
```
javac src/SnakeGame.java
```
```
java src/SnakeGame.java
```
**4. Enjoy permainannya**

## Classes Used

**1.Main App** - `SnakeGame.java`
   - Main program untuk menghandle Tampilan dan Gameplay
   
**2. Gameplay** - `Gameplay.java`
   - Class untuk proses game berjalan
   - 13 Variabel Class
     - snakeHead: ImageIcon
     - Timer: Timer
     - delay: int
     - snakeBody: ImageIcon
     - speedUp: AtomicBoolean
     - snakeHeadXPos: int
     - appleImage: ImageIcon
     - xPos: int
     - yPos: int
     - titleImage: ImageIcon
     - highScore: String
     - arrowImage: ImageIcon
     - shiftImage: ImageIcon
   - 6 Method
     - **Gameplay()** - Untuk constructor class
     - **paint(g)** - Untuk desain frame/UI
     - **drawString(g, text, x, y)** - untuk menampilkan di layar string dengan \n di dalamnya
     - **actionPerformed(e)** - Digunakkan untuk mengatur pergerakkan ular
     - **keyPressed(e)** - Untuk mengatur kondisi ketika menekan tombol keyboard
     - **keyReleased (e)** - Untuk mengatur ketika user lepas/menekan shift
     
**3. Score** - `Score.java`
   - Class untuk mengatur score game
   - 1 Variabel Class
     - score: int
   - 7 Method
     - **Score()** - Untuk constructor class
     - **increaseScore()** - Untuk menambah/increase score
     - **resetScore()** - Untuk mereset score
     - **getScore()** - untuk mengembalikan nilai score ke tampilan Gameplay
     - **getHighScore()** - Fungsi buat ambil HighScore
     - **sortHighScore()** - untuk mengurutkan high score
     - **saveNewScore()** - Fungsi buat nulis score baru di file
     
**4. Snake** - `Snake.java`
   - Class untuk mengatur snake
   - 9 Variabel Class
     - snakexLength: int []
     - snakeyLength: int []
     - lengthOfSnake: int 
     - moves: int 
     - left: boolean 
     - right: boolean 
     - up: boolean 
     - down: boolean 
     - death: boolean 
   - 10 Method
     - **Snake()** - Untuk constructor class
     - **moveRight()** - Untuk gerak ular ke kanan
     - **moveLeft()** - Untuk gerak ular ke kiri
     - **moveUp()** - Untuk gerak ular ke atas
     - **moveDown()** - Untuk gerak ular ke bawah
     - **dead()** - Function mati agar tidak mengulang nulis kode berkali-kali
     - **movementRight()** - Untuk pergerakan ular ke kanan
     - **movementLeft()** - Untuk pergerakan ular ke kiri
     - **movementUp()** - Untuk pergerakan ular ke atas
     - **movementDown()** - Untuk pergerakan ular ke bawah
     
**5. Apple** - `Apple.java`
   - Class untuk mengatur posisi apel ketika game mulai
   - 2 Variabel Class
     - applexPos: int []
     - appleyPos: int []
   - 0 Method

## UML

![UML](/images/UML_Project_Snake.png)

## Notable Assumption and Design App Details

- Desain Aplikasi
  - Board game di desain dengan ukuran setiap cell nya 100x100.
  - Ular akan mati ketika menabrak tembok dan menabrak badannya
  - Ketika program dijalankan, baik score maupun highscore dimulai dari 0
  - Highscore akan disimpan ketika ular telah dimainkan
  - Highscore tidak akan hilang walaupun aplikasi sudah ditutup
