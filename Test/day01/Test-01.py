# coding: utf-8
from PIL import Image

ascii_char = list("0 ")


def get_char(r, g, b, alpha=256):
    if alpha == 0:
        return ''
    length = len(ascii_char)
    gray = int(0.2126*r + 0.7152*g + 0.0722*b)
    unit = (256.0 + 1) / length
    return ascii_char[int(gray/unit)]


def main():
    image_name = 'Test.jpeg'
    WIDTH = 60
    HEIGHT = 45
    im = Image.open(image_name)
    im = im.resize((WIDTH, HEIGHT), Image.NEAREST)
    txt = ""
    for i in range(HEIGHT):
        for j in range(WIDTH):
            txt += get_char(*im.getpixel((j, i)))
        txt += '\n'
    print(txt)
    with open('output.txt', 'w') as f_object:
        f_object.write(txt)


if __name__ == '__main__':
    main()
