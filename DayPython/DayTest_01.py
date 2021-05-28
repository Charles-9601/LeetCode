# -*- coding: utf-8 -*-
# @Time     : 2021/5/26 23:59
# @Author   : 张其鹏
# @File     : DayTest_01.py


# 生成手绘图片
from PIL import Image
import numpy

# 原始图片路径
original_image_path = input('请输入一张图片：')
handdrawn_image_path = '/Users/zhangqipeng/Desktop/Test.JPG'

a = numpy.asarray(Image.open(original_image_path).convert('L')).astype('float')
depth = 10.

grad = numpy.gradient(a)

grad_x, grad_y = grad
grad_x = grad_x * depth / 100.
grad_y = grad_y * depth / 100.
A = numpy.sqrt(grad_x ** 2 + grad_y ** 2 + 1.)
uni_x = grad_x / A
uni_y = grad_y / A
uni_z = 1. / A

vec_el = numpy.pi / 2.2

vec_az = numpy.pi / 4.

dx = numpy.cos(vec_el) * numpy.cos(vec_az)
dy = numpy.cos(vec_el) * numpy.sin(vec_az)
dz = numpy.sin(vec_el)

b = 255 * (dx * uni_x + dy * uni_y + dz * uni_z)

b = b.clip(0, 255)

im = Image.fromarray(b.astype('uint8'))

print('OK')

im.save(handdrawn_image_path)
