SSSS    �L&�D���Z��!�ヽ���]-���ć��n������f>=��EX �V���&�gq�ji�㕓�gB��~�n�|R7���K��X$}��`��,�z;��6$�8P�����9���>��R�r
3�nu*��ԟ������z>��֑�@4�?wx���@�]"��P�X?ɞ=�iـ�N*ģ�P׶F>��?Bc��d��גG�2��mk@���#�۱��vإs�j��j��6�e�k�7�O���=]e�l��&�7�\vY��u9$��]���5-n���d��O�'C9w1���@�ccY�&��z��I�-)�^��r��n�]N��4R͋+]�����LX��^N����L6C0y9�ڙ�?D��Kur���OUme�:a��뤭EpM��GJ�陝f�:�}���Ej
d��	�f}X�Fr��ZX��%w�{����/s��,i>Oe�'K�#�"�ɱ��>����o�E�1�;�R�b�R%Nrix,CC_MVMatrix) , vec4(a_position.xyz,1.0));
    v_texCoord = a_texcoord0;
    v_fragmentColor = a_color0;
}


#endif
�#ifdef FS
$input v_texCoord, v_fragmentColor

#include "../Library/Base/common.sh"

uniform mat4 CC_PMatrix;
uniform mat4gCC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;
uniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform	mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
uniform vec4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;

GAMPLER2D (CC_Texture0,0);




void main()
{
     gl_FragColor = vec4( v_fragmentColor.rgb,v_fragmentColor.a) * texture2D�CC_Texture0, v_texCoord).a ;
}



#endif
