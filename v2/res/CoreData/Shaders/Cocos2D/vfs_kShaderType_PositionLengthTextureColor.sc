SSSS    �L&�D���Z��!�ヽ���]-���ć��n������f>=��EX �V���&�gq�ji��ʐ���(X�� �\�pR7���K��<8u��b��m�/o��*7�5C��L���]���*�P�BK�&}P�,Ot/�����ɝ��p�����8P�7ql���vm�^�X�� �;���fR"·���j���1K~���w��H��?�.�	�o9@��w��ǿ��w݇s�t��w���o�'�@�+���o]$�>��:�$�Owu��f$.�l�h��!/Ku���'��S�&Oo ���F�a1BS�w�f�f�*:'�p�{A%�:��t��Ou�H�{(R��G���k��(D��JL��W��A ,h�ېG�4x��Kb8���N &�a�����.��K�ꁔl�6�;���Y	|WK���1IOA�v��88ڪc%iJ�s-����k��V37s/pB1�)_�~�\�˷��>��
�n�:��D�B�^0�l-Nion = mul(mul(u_viewProjMatrix,CC_MVMatrix) , vec4(a_position.xyz, 1.0));
    v_fragmentColor = vec4(a_color0.rgb * a_color0.a�* u_alpha.x, a_color0.a * u_alpha.x);;
    v_texCoord = a_texcoord0;
}



#endif

#ifdef FS
$input v_fragmentColor, v_3exCoord

#include "../Library/Base/common.sh"

uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
uniform mat4	CC_MVMatrix;
uniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform vec4 CW_Time;
uniform vec4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;

//SAMPLER2D (CC_Texture0,0);


void�main()
{
    // gl_FragColor = v_fragmentColor * texture2D(CC_Texture0, v_texCoord);

    gl_FragColor = v_fragmentColor * <tep(0.0, 1.0 - length(v_texCoord));
}


#endif
