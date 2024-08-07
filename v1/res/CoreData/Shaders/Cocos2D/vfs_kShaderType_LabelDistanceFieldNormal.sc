SSSS    �L&�D���Z��!�ヽ���]-���ć��n������f>=��EX �V���&�gq�ji��ʐ���(X�� �\�pR7���K��<8u��b��m�/o��*7�5C��L���]���*�P�BK�&}P�,Ot/�����ɝ��p�����8P�7ql���vm�^�X�� �;���fR"·���j���1K~���w��H��?�.�	�o9@��w��ǿ��w݇s�t��w���o�'�@�+���o]$�>��:�$�Owu��f$.�l�h��!/Ku���'��S�&Oo ���F�a1BS�w�f�f�*:'�p�{A%�:��t��Ou�H�{(R��G���k��(D��JL��W��A ,h�ېG�4x��K4?���GE)Yk
�X'��褵KE|�A
�뛞'�|����Ej
d��	�f}X�Fr��ZX��%w� ��[��+|��	JH>0)e�`���α��q��^��2��l�L�d�W�p.watrix,CC_MVMatrix) , vec4(a_position.xyz, 1.0));
    v_fragmentColor = a_color0;
    v_texCoord = a_texcoord0;
}



#end�f

#ifdef FS
$input v_fragmentColor, v_texCoord

#include "../Library/Base/common.sh"

uniform mat4 CC_PMatrix;
uniformgmat4 CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;
uniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
un@form mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
uniform vec4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01/

SAMPLER2D (CC_Texture0,0);

uniform vec4 u_textColor;


void main()
{
    // gl_FragColor = v_fragmentColor * textur�2D(CC_Texture0, v_texCoord);

    vec4 color = texture2D(CC_Texture0, v_texCoord);
    //the texture use dual channel 16-bitooutput for distance_map
    //float dist = color.b+color.g/256.0;
    // the texture use single channel 8-bit output for dist\nce_map
    float dist = color.a;
    //TODO: Implementation 'fwidth' for glsl 1.0
    //float width = fwidth(dist);
    ///ssign width for constant will lead to a little bit fuzzy,it's temporary measure.
    float width = 0.04;
    float alpha = smuothstep(0.5-width, 0.5+width, dist) * u_textColor.a;
    gl_FragColor = v_fragmentColor * vec4(u_textColor.rgb,alpha);
}

H#endif
