# [������������ ������ #1](https://github.com/KiVorobev/Methods-and-means-of-software-engineering/tree/main/Lab1)
### �������: 2106

***
������� �2106: Nastol.com.ua - ���� ��� �������� �����. �������� �� ������� ���� ���������� ��� ����������. ���������� ���������� �����, ������� ���������� �������� - http://www.nastol.com.ua/
***

��������� ������ ����������, ������������� � ���������������� ���-����� (� ������������ � ���������). ���������� ������ �������� �� ��������� ���������:
- ��������������.
    - ���������� ������������� �����.
    - ���������� ���������� �����.
- ����������������.

���������� ���������� �������� � ������������ � ��������� RUP (�������� SRS - Software Requirements Specification). ��� ������� �� ���������� ����� ������� ��� �������� (� ������������ � ������������ RUP), � ����� ������� � ��������������� ��������������� ���������� �����, ����������� �� ���������� ����� ����������.

��� �������������� ���������� ����� ��������� UML UseCase-���������, ����������� ����������� �� ���������� �������������.

# [������������ ������ #2](https://github.com/KiVorobev/Methods-and-means-of-software-engineering/tree/main/Lab2)
### �������: 2220

![task](./Lab2/img/Working%20model.jpg)

���������������� � ���� �������� �������� ����������� svn � git � ��������� � ��� ��������� ������� ������ � ��������� ������ (� ������������ � �������� ���������).

������������� ������������������ ������ ��� ������ �������� ������ svn � git, �������������� �������� ��� �������� �����, ���������� �� ����-�����.

��� ����������� ������������������ ������ ���������� ��������� ��������� �������:

- ���� ��������� ����� ��������� �� ������������, ������������ �������� (������� - ������, ����� - ������).
- ����� ��� ������ - ����� �������. ������� ��������� ���������������.
- ���������� ��������� ��������� ����� ��������, ���� ��� ���������.

# [������������ ������ #3](https://github.com/KiVorobev/Methods-and-means-of-software-engineering/tree/main/Lab3)
### �������: 1


�������� �������� ��� ������� [Apache Ant](https://ant.apache.org/), ����������� ����������, ������������ � �������� � jar-����� ���� ������� �� [������������ ������ �3](https://se.ifmo.ru/en/courses/web#lab3) �� ���������� "���-����������������".

������ ���� ������ ���� ������� � ��������� ���� ��������; ��� ���������� � ���������, ������������ � ��������, ������ ���� �������� � ��������� ���� ����������; MANIFEST.MF ������ ��������� ���������� � ������ � � ����������� ������.

__C������� ������ ������������� ��������� ���� (targets):__

1. __compile__ -- ���������� �������� ����� �������.
2. __build__ -- ���������� �������� ����� ������� � �� �������� � ����������� jar-�����. ���������� �������� ����� ����������� ����������� ������ ���� __compile__.
3. __clean__ -- �������� ���������������� ������� ������� � ���� ��������� ������ (���� ��� ����).
4. __test__ -- ������ junit-������ �������. ����� �������� ������ ���������� ����������� ������ ������� (���� __build__).
5. __doc__ - ���������� � MANIFEST.MF MD5 � SHA-1 ������ �������, � ����� ��������� � ���������� � ����� javadoc �� ���� ������� �������.
6. __alt__ - ������ �������������� ������ ��������� � ����������� ������� ���������� � ������� (��������� ������� replace/replaceregexp � ������ ����������) � ����������� � � jar-�����. ��� �������� jar-������ ���������� ���� __build__.

# [������������ ������ #4](https://github.com/KiVorobev/Methods-and-means-of-software-engineering/tree/main/Lab4)

### �������: -1

1. ��� ����� ��������� �� [������������ ������ #3](https://se.ifmo.ru/en/courses/web#lab3) �� ���������� "
   ���-����������������" �����������:

- MBean, ��������� ����� ����� ������������� ������������� �����, � ����� ����� �����, �� ���������� � �������. �
  ������, ���� ���������� ������������� ������������� ����� ����� ������ 5, ������������� MBean ������ ����������
  ���������� �� ���� �������.
- MBean, ������������ ������� ������������ ������.

2. � ������� ������� JConsole �������� ���������� ���������:

- ����� ��������� MBean-�������, ������������� � ���� ���������� ������� 1.
- ���������� ������ Java Language Specification, ����������� ������ ������ ����������.

3. � ������� ������� VisualVM �������� ���������� � �������������� ���������:

- ����� ������ ��������� ��������� MBean-�������, ������������� � ���� ���������� ������� 1, � �������� �������.
- ���������� ��� ������, ������������� ���������� ������� ������� CPU.

4. � ������� ������� VisualVM � �������������� IDE NetBeans, Eclipse ��� Idea ������������ � ��������� �������� �
   ������������������� � [���������](./lab4/docs/HttpUnit.tar.gz). �� ����������� ����������� � ���������� �������� ���������� ��������� �����, �
   ������� ������ ����������� ��������� ����������:

- �������� ���������� ��������.
- �������� ����� ���������� ���������� ��������.
- ��������� (�� �����������) �������� ��������� ��������, ������� �������� ������� � ������������ ��������.

������� ������ ���������� ����������� ��������������� �������� ������ � ����������� �������� �� ���������� �������������.