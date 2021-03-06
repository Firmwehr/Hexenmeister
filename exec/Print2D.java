class Print2D {

  public void action() {
    Img img = new Img();
    img.init(1);

    Alphabet abc = new Alphabet();
    abc.color = 8;
    abc.HelloWorld(img);
  }

  public static void main(String[] args) {
    Print2D printer = new Print2D();
    printer.action();
  }
}

class Img {
  public int[][] data;

  public int size;   /* Set by init */
  public int prefix; /* Set by init */
  public int blank;  /* Set by init */

  public void init(int blank) {
    size = 9;
    data = new int[size][];
    prefix = 1;
    this.blank = blank;
    int i = 0;
    while (i < size) {
      /* This is not necessary in minijava, but in java it is: */
      data[i] = new int[size];
      prefix = prefix * 10;
      i = i + 1;
    }
    clear();
  }

  public void drawVerticalLine(int color, int x, int y1, int y2) {
    if (y1 > y2) {
      int s = y1;
      y1 = y2;
      y2 = s;
    }
    int i = y1;
    while (i <= y2) {
      data[i][x] = color;
      i = i + 1;
    }
  }
  public void drawHorizontalLine(int color, int x1, int x2, int y) {
    if (x1 > x2) {
      int s = x1;
      x1 = x2;
      x2 = s;
    }
    int i = x1;
    while (i <= x2) {
      data[y][i] = color;
      i = i + 1;
    }
  }

  public void drawLine(int color, int x1, int y1, int x2, int y2) {
    if (x1 == x2) {
      drawVerticalLine(color, x1, y1, y2);
      return;
    }
    if (y1 == y2) {
      drawHorizontalLine(color, x1, x2, y1);
      return;
    }
    if (x1 > x2) {
      int s = x1;
      x1 = x2;
      x2 = s;
      s = y1;
      y1 = y2;
      y2 = s;
    }
    int dx = x2 - x1 + 1;
    int dy = y2 - y1;
    int dir = 1;
    if (dy < 0) {
      dy = dy * -1;
      dir = -1;
    }
    dy = dy + 1;
    int x = x1;
    int y = y1;
    if (dx >= dy) {
      int ppl = dx / dy;
      int rest = dx % dy;
      while (y != y2 + dir) {
        int thisline = ppl;
        if (rest > 0) {
          rest = rest - 1;
          thisline = thisline + 1;
        }
        drawHorizontalLine(color, x, x + thisline - 1, y);
        x = x + thisline;
        y = y + dir;
      }
    } else {
      int ppr = dy / dx;
      int rest = dy % dx;
      while (y != y2 + dir) {
        int thisrow = ppr;
        if (rest > 0) {
          rest = rest - 1;
          thisrow = thisrow + 1;
        }
        drawVerticalLine(color, x, y, y + thisrow - 1);
        x = x + 1;
        y = y + dir * thisrow;
      }
    }
  }

  public void clear() {
    int i = 0;
    while (i < size) {
      int j = 0;
      while (j < size) {
        data [i][j] = blank;
        j = j + 1;
      }
      i = i + 1;
    }
  }

  public int convertLine(int l) {
    int i = size - 1;
    int pow = 1;
    int res = 0;
    while (i >= 0) {
      res = res + data[l][i] * pow;
      pow = pow * 10;
      i = i - 1;
    }
    return res + prefix;
  }

  public void print() {
    int i = 0;
    while (i < size) {
      System.out.println(convertLine(i));
      i = i + 1;
    }
  }
}

class Alphabet {
  public int color;

  public void H(Img img) {
    img.drawLine(color, 0, 0, 0, img.size - 1);
    img.drawLine(color, img.size - 1, 0, img.size - 1, img.size - 1);
    img.drawLine(color, 0, img.size / 2, img.size - 1, img.size / 2);
  }

  public void E(Img img) {
    img.drawLine(color, 0, 0, 0, img.size - 1);
    img.drawLine(color, 0, 0, img.size - 1, 0);
    img.drawLine(color, 0, img.size / 2, img.size - 1, img.size / 2);
    img.drawLine(color, 0, img.size -1, img.size - 1, img.size -1);
  }

  public void L(Img img) {
    img.drawLine(color, 0, 0, 0, img.size - 1);
    img.drawLine(color, 0, img.size -1, img.size - 1, img.size -1);
  }

  public void O(Img img) {
    img.drawLine(color, 0, img.size / 2, img.size / 2, 0);
    img.drawLine(color, img.size / 2, 0, img.size - 1, img.size / 2);
    img.drawLine(color, 0, img.size / 2, img.size / 2, img.size - 1);
    img.drawLine(color, img.size / 2, img.size - 1, img.size - 1, img.size / 2);
  }

  public void W(Img img) {
    img.drawLine(color, 0, 0, 0, img.size - 1);
    img.drawLine(color, img.size - 1, 0, img.size - 1, img.size - 1);
    img.drawLine(color, 0, img.size - 1, img.size / 2, img.size / 2);
    img.drawLine(color, img.size / 2, img.size / 2, img.size - 1, img.size - 1);
  }

  public void R(Img img) {
    img.drawLine(color, 0, 0, 0, img.size - 1);
    img.drawLine(color, 0, 0, img.size - 1, 0);
    img.drawLine(color, 0, img.size / 2, img.size - 1, img.size / 2);
    img.drawLine(color, img.size - 1, 0, img.size - 1, img.size / 2);
    img.drawLine(color, 0, img.size / 2, img.size - 1, img.size - 1);
  }

  public void D(Img img) {
    img.drawLine(color, 0, 0, 0, img.size - 1);
    img.drawLine(color, 0, 0, img.size - 1, img.size / 2);
    img.drawLine(color, 0, img.size - 1, img.size - 1, img.size / 2);
  }

  public void print(Img img) {
    img.print();
    img.clear();
    System.out.println(-1);
  }

  public void HelloWorld(Img img) {
    H(img); print(img);
    E(img); print(img);
    L(img); print(img);
    L(img); print(img);
    O(img); print(img);
    print(img);
    W(img); print(img);
    O(img); print(img);
    R(img); print(img);
    L(img); print(img);
    D(img); img.print();
  }
}

