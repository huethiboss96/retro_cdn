SSSS    �L&�D���Z��!�ヽ���]-���ć��n�����r�r}h��^9����;�d�$v���������w��A�q�3R����.�f�?0g��L��A�w;���8P�����n�ů-��LM�&Sr8�y`C��ϗ����׳"�񄣝 �0j*���?�jcƪa�mR��<�i���e)̱���5j?���*tKŝ�U����2�s�]�lC���%������#��E�l��F���~�(I�8b�#��U�*Sq�N����.B�$nV��{?;���2�0�m���b���"L;`gR؊��ORku�0�L�\�N^�t�/>B�"��/��,\�JE��UG ��N#�ٸ��3I����~��]c
$����b��odsƔ�)Ug#K�yn�����BVS`��F(��q��`��� YWh}���$OU~�Lo��A@��B F/�qd�]�S��n4��ZnO<e"�w� �%�Ҷ��>����2��F��L2�]�@?1eworldMatrix), vec4(a_position.xyz, 1.0));
    v_color = a_color0;
}



#endif

#ifdef FS
$input v_color
#include "../�ibrary/Base/common.sh"

uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;
uniform ma34 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
uniform vec4 CC_zinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;

//SAMPLER2D (CC_Texture0,0);

uniform vec4 u_color;


void4main()
{
    gl_FragColor = vec4(v_color.rgb,1.0);
}


#endif
