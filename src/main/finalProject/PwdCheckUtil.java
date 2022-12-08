package main.finalProject;


import com.xiaoleilu.hutool.util.StrUtil;

public class PwdCheckUtil {

    //���������ַ�
    public static String SPECIAL_CHAR = "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";

    /**
     * @brief   ����������ַ�����
     * @param[in] password            �����ַ���
     * @return  ���ϳ���Ҫ�� ����true
     */
    public static boolean checkLength(String password, String minNum, String maxNum) {
        boolean flag =false;
        if (StrUtil.isBlank(maxNum))  {
            minNum = StrUtil.isBlank(minNum) ? "0":minNum;
            if (password.length() >= Integer.parseInt(minNum)) {
                flag = true;
            }
        } else {
            minNum = StrUtil.isBlank(minNum) ? "0":minNum;
            if (password.length() >= Integer.parseInt(minNum) &&
                    password.length() <= Integer.parseInt(maxNum)) {
                flag = true;
            }
        }
        return flag;
    }

    /**
     * @brief   ����������Ƿ��������
     * @param[in] password            �����ַ���
     * @return  �������� ����true
     */
    public static boolean checkContainDigit(String password) {
        char[] chPass = password.toCharArray();
        for (int i = 0; i < chPass.length; i++) {
            if (Character.isDigit(chPass[i])) {
                return true;
            }
        }
        return false;
    }

    /**
     * @brief   ����������Ƿ������ĸ�������ִ�Сд��
     * @param[in] password            �����ַ���
     * @return  ������ĸ ����true
     */
    public static boolean checkContainCase(String password) {
        char[] chPass = password.toCharArray();
        for (int i = 0; i < chPass.length; i++) {
            if (Character.isLetter(chPass[i])) {
                return true;
            }
        }
        return false;
    }


    /**
     * @brief   ����������Ƿ����Сд��ĸ
     * @param[in] password            �����ַ���
     * @return  ����Сд��ĸ ����true
     */
    public static boolean checkContainLowerCase(String password) {
        char[] chPass = password.toCharArray();
        for (int i = 0; i < chPass.length; i++) {
            if (Character.isLowerCase(chPass[i])) {
                return true;
            }
        }
        return false;
    }


    /**
     * @brief   ����������Ƿ������д��ĸ
     * @param[in] password            �����ַ���
     * @return  ������д��ĸ ����true
     */
    public static boolean checkContainUpperCase(String password) {
        char[] chPass = password.toCharArray();
        for (int i = 0; i < chPass.length; i++) {
            if (Character.isUpperCase(chPass[i])) {
                return true;
            }
        }
        return false;
    }


    /**
     * @brief   ����������Ƿ�����������
     * @param[in] password            �����ַ���
     * @return  ����������� ����true
     */
    public static boolean checkContainSpecialChar(String password) {
        char[] chPass = password.toCharArray();
        for (int i = 0; i < chPass.length; i++) {
            if (SPECIAL_CHAR.indexOf(chPass[i]) != -1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
    }

}

