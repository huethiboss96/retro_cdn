SSSS    �L&�D���Z��!�ヽ���]-���ć��n������f>=��EX �V���&�gq�ji��ʐ���(X�� �\�pR7���K��X$}��`��,�z;��6$�8P�����9���>��R�r
3�nu*��ԟ������z>��֑�@4�?wx���@�]"��P�X?ɞ=�iـ�N*ģ�P׶F>��?Bc��d��גG�2��mk@���#�۱��vإs�j��j��6�e�k�7�O���=]e�l��&�7�\vY��u9$��]���5-n���d��O�'C9w1���@�ccY�&��z��I�-)�^��r��n�]N��4R͋+]�����LX��^N����L6C0y9�ڙ�?D��Kur���OUme�:a��뤭EpM��GJ�陝f�:�}���Ej
d��	�f}X�Fr��ZX��%w�{����/s��,i>Oe�'K�#�"�ɱ��>����o�o�p��I��v<, vec4(a_position.xyz,1.0));
    v_fragmentColor = a_color0;
    v_texCoord = a_texcoord0;
}


#endif

#ifdef FS

$in�ut v_fragmentColor, v_texCoord

#include "../Library/Base/common.sh"

uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPM&trix[4];
uniform mat4 CC_MVMatrix;
uniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_Normaldatrix;
uniform vec4 CC_Time;
uniform vec4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;

SAMPLER2D (CC_Tqxture0,0);



void main()
{
    vec4 color = v_fragmentColor * texture2D(CC_Texture0,v_texCoord.xy);
    gl_FragColor = �olor;
//    gl_FragColor = vec4(v_texCoord.x,v_texCoord.y,0.0,1.0);
}


#endif
