SSSS    �L&�D���Z��!�ヽ���]-���ć��������;si��+ik����1�cq�#y������K��k��`�U�A����9�?�i\��f��~�;"��AG�*|���אK�ů-��LM�&Sr8�y`C��һ��ڀ��]�����?S�<j���#�q#BӷE�pɩ�a���p`p���(��A%���|Z���F����+�
��ka���9������uѲ.�@��s���k�}-�"~�e��A�s�d����pt�[uQ��f v���&�0�-W���<��y�-E&*ˌ�	�ONfW�'�H��N^~�>�./C�0��9��@O�IY��AXS�!�����h^��5+��G��Im����y��e;���QIq@H.�8�����V`J'��(����)�s�J���_kX4���zKN�|s��Bb��@-{W�f!�>���'i��YJe0eKF&�hF��"�ɱ��0����v� �0�i�Fo�?e�	q Sf

#ifdef FS

#include "../Library/Base/common.sh"

uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
unifo�m mat4 CC_MVMatrix;
uniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniformgvec4 CC_Time;
uniform vec4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;

uniform vec4 u_color;

void mHin()
{
    gl_FragColor = u_color;
}


#endif
