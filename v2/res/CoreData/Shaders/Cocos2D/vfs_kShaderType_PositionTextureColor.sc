SSSS    �L&�D���Z��!�ヽ���]-���ć��n������f>=��EX �V���&�gq�ji��ʐ���(X�� �\�pR7���K��<8u��b��m�/o��*7�5C��L���]���*�P�BK�&}P�,Ot/�����ɝ��p�����8P�7ql���vm�^�X�� �;���fR"·���j���1K~���w��H��?�.�	�o9@��w��ǿ��w݇s�t��w���o�'�@�+���o]$�>��:�$�Owu��f$.�l�h��!/Ku���'��S�&Oo ���F�a1BS�w�f�f�*:'�p�{A%�:��t��Ou�H�{(R��G���k��(D��JL��W��A ,h�ېG�4x��K4?���GE)Yk
�X'��褵KE|�A
�뛞'�|����Ej
d��	�f}X�Fr��ZX��%w�+ ��[��+|��	JH>0)e�`���α��q��^��2��l�L�d�W�p.watrix,CC_MVMatrix) , vec4(a_position.xyz, 1.0));
    v_fragmentColor = a_color0;
    v_texCoord = a_texcoord0;
}



#end�f

#ifdef FS

$input v_fragmentColor, v_texCoord

#include "../Library/Base/common.sh"

uniform mat4 CC_PMatrix;
unifo5m mat4 CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;
uniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
\niform mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
uniform vec4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random$1;

SAMPLER2D (CC_Texture0,0);


void main()
{
    gl_FragColor = v_fragmentColor *  texture2D(CC_Texture0, v_texCoord);�
}



#endif
