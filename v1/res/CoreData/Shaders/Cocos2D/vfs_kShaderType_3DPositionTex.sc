SSSS    �L&�D���Z��!�ヽ���]-���ć��n������f>=��EF"�
���&�gq�ji�㕓�M9��b�
l�(|9�����[�3%a��4��y�r)��G�5��4��_���1��n^�tWk�L������Ɂ�|c�ۡ��s�%lw���j�R?HȬ~�x��i�C���Xv%ٷ�Z��`R$���p߱�1ǝ0��?�3�0�gn`���6��񊖼^���m��H��[�c�3�B�7��8�;B,�6����-�C;N�� m��2�k�H�Y7j���j��i�LkiMY���D�7>C�*�J�T�51�=�l�'��vҲb	�EB��J1�'չ�9��(I����8ÊkV���Y� 9��3v(���PE&*I�{ �����=.z��D
��Ԇl� �`���
E?``�� � O
aA�Lw��h	ڪc%iJ�s-����q��Iu7X@1�/I�~�$�Ծ��s���g�o�p��x�]�aI0
uniform mat4 u_viewProjMatrix;

void main()
{
    gl_Position = mul(mul(u_viewProj,CC_MVMatrix) , vec4(a_position.xyz, 1.�));
    v_texCoord = a_texcoord0;
    v_texCoord.y = 1.0 - v_texCoord.y;

    vec3 _normalVector = a_normal;
}



#end.f

#ifdef FS
$input v_texCoord

#include "../Library/Base/common.sh"

uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiVie^PMatrix[4];
uniform mat4 CC_MVMatrix;
uniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NoryalMatrix;
uniform vec4 CC_Time;
uniform vec4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;

SAMPLER2D (C�_Texture0,0);

uniform vec4 u_color;


void main()
{
    gl_FragColor = vec4(texture2D(CC_Texture0, v_texCoord).rgb,1.0)t
}


#endif
