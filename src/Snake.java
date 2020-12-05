package src;

public class Snake {
    // menentukan letak ular
    int[] snakexLength = new int[750];
    int[] snakeyLength = new int[750];

    //panjang ular dan apakah ular sudah bergerak atau belum
    int lengthOfSnake;
    int moves;

    // arah ular
    boolean left;
    boolean right;
    boolean up;
    boolean down;

    //apakah ular sudah mati atau belum
    boolean death;

    //konstruktor
    public Snake(){
        this.left=false;
        this.right=false;
        this.up=false;
        this.down=false;
        this.death=false;
        this.lengthOfSnake=5;
        this.moves=0;
    }

    //gerak ke kanan
    public void moveRight(){
        if (this.moves != 0 && !this.death) {
                this.moves++;
                if (!this.left) {
                    this.right = true;
                } else {
                    this.right = false;
                    this.left = true;
                }
                this.up = false;
                this.down = false;
        }
    }

    //gerak ke kiri
    public void moveLeft(){
        if (this.moves != 0 && !this.death) {
            this.moves++;
            if (!this.right) {
                this.left = true;
            } else {
                this.left = false;
                this.right = true;
            }
            this.up = false;
            this.down = false;
        }
    }

    //gerak ke atas
    public void moveUp(){
        if (this.moves != 0 && !this.death) {
            this.moves++;
            if (!this.down) {
                this.up = true;
            } else {
                this.up = false;
                this.down = true;
            }
            this.left = false;
            this.right = false;
        }
    }

    //gerak ke bawah
    public void moveDown(){
        if (this.moves != 0 && !this.death) {
            this.moves++;
            if (!this.up) {
                this.down = true;
            } else {
                this.down = false;
                this.up = true;
            }
            this.left = false;
            this.right = false;
        }
    }

    // function mati biar ga ngulang nulis kode berkali-kali
    public void dead() {
        // membuat ular tidak bisa bergerak
        this.right = false;
        this.left = false;
        this.up = false;
        this.down = false;
        this.death = true;
    }

    //pergerakan ular ke kanan
    public void movementRight(){
        // pindahkan posisi head ke index selanjutnya
        for (int i = this.lengthOfSnake - 1; i >= 0; i--) {
            // pindahkan posisi snakeyLength
            this.snakeyLength[i + 1] = this.snakeyLength[i];
        }
        for (int i = this.lengthOfSnake - 1; i >= 0; i--) {
            // pindahkan posisi snakexLength
            if (i == 0) {
                this.snakexLength[i] = this.snakexLength[i] + 6;
            } else {
                this.snakexLength[i] = this.snakexLength[i - 1];
            }
            // jika sudah lewat ujung kanan
            if (this.snakexLength[0] > 637) {
                // pindahkan kepala kembali ke dalam board
                this.snakexLength[0] -= 6;
                // maot
                dead();
            }
        }
    }

    //pergerakan ular ke kiri
    public void movementLeft(){
        // pindahkan posisi head ke index selanjutnya
        for (int i = this.lengthOfSnake - 1; i >= 0; i--) {
            // pindahkan posisi snakeyLength
            this.snakeyLength[i + 1] = this.snakeyLength[i];
        }
        for (int i = this.lengthOfSnake - 1; i >= 0; i--) {
            // pindahkan posisi snakexLength
            if (i == 0) {
                this.snakexLength[i] = this.snakexLength[i] - 6;
            } else {
                this.snakexLength[i] = this.snakexLength[i - 1];
            }
            // jika sudah lewat ujung kiri
            if (this.snakexLength[0] < 25) {
                // pindahkan kepala kembali ke dalam board
                this.snakexLength[0] += 6;
                // maot
                dead();
            }
        }
    }

    //pergerakan ular ke atas
    public void movementUp(){
        // pindahkan posisi head ke index selanjutnya
        for (int i = this.lengthOfSnake - 1; i >= 0; i--) {
            // pindahkan posisi snakexLength
            this.snakexLength[i + 1] = this.snakexLength[i];
        }
        for (int i = this.lengthOfSnake - 1; i >= 0; i--) {
            // pindahkan posisi snakeyLength
            if (i == 0) {
                this.snakeyLength[i] = this.snakeyLength[i] - 6;
            } else {
                this.snakeyLength[i] = this.snakeyLength[i - 1];
            }
            // jika sudah lewat ujung atas
            if (this.snakeyLength[0] < 73) {
                // pindahkan kepala kembali ke dalam board
                this.snakeyLength[0] += 6;
                // maot
                dead();
            }
        }
    }

    //pergerakan ular ke bawah
    public void movementDown(){
        // pindahkan posisi head ke index selanjutnya
        for (int i = this.lengthOfSnake - 1; i >= 0; i--) {
            // pindahkan posisi snakexLength
            this.snakexLength[i + 1] = this.snakexLength[i];
        }
        for (int i = this.lengthOfSnake - 1; i >= 0; i--) {
            // pindahkan posisi snakeyLength
            if (i == 0) {
                this.snakeyLength[i] = this.snakeyLength[i] + 6;
            } else {
                this.snakeyLength[i] = this.snakeyLength[i - 1];
            }
            // jika sudah lewat ujung bawah
            if (this.snakeyLength[0] > 679) {
                // pindahkan kepala kembali ke dalam board
                this.snakeyLength[0] -= 6;
                // maot
                dead();
            }
        }
    }
}