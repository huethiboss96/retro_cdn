SSSS    �L&�D���Z��l`�������FS��Ώ��j��)�9��)�FX��b	P*����Z'C�P�ڱ������.Z��Y�%M�$\T ������q5v��a҄Y�R��!"�:~��F���W���6�P�pv�AaZ�bN����������}3�����/L�#g1����D@׫g�r��k�
���'d°�R��g-i���sK���L��,����2�ZZb���gݣ����m׽o�f�k��	�n�E%�4e�"���m=O����E�$�Au��z$0���&�S�!#p���jψ"�VkY)ˉ�G�,Vdc��l�w�~�>�%*F�1�U��.M�be��2Tx��([���D��$_��A��_��A,I
�r��}�`܊,v?㷛)[qe�4n͏絠BmA/��K�熉&�u�g��� Xlg���>N]�����Zd"lI�zh�_�[��'oùl&n*w �#H��a�Զ��0���J�M���_�?e�f<-\def FS

/// input
#define USING_INOUT_TEXCOORD0
#include "Library/Varying.glsl"

/// Common (uniforms,samplers, transform� ... )
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void main()
{
    vec4 texColor = texture2D(u_dif!useTex,v_texcoord0);
    gl_FragColor = vec4(texColor.rgb,1.0);
}

#endif
