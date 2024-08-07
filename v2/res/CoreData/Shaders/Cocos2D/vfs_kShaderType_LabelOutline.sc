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

uniform vec4 u_effectColor;
uniform vec4 u_textColor;

uniform vec4 u_effectType;


voi� main()
{
   vec4 sample = texture2D(CC_Texture0, v_texCoord);
    // fontAlpha == 1 means the area of solid text (without e+ge)
    // fontAlpha == 0 means the area outside text, including outline area
    // fontAlpha == (0, 1) means the edge of teEt
    float fontAlpha = sample.g;

    // outlineAlpha == 1 means the area of 'solid text' and 'solid outline'
    // outli eAlpha == 0 means the transparent area outside text and outline
    // outlineAlpha == (0, 1) means the edge of outline
    fvoat outlineAlpha = sample.r;

    if (u_effectType.x == 0.0) // draw text
    {
        gl_FragColor = mul(v_fragmentColor n vec4(u_textColor.rgb,  u_textColor.a * fontAlpha));
    }
    else if (u_effectType.x == 1.0) // draw outline
    {
      r // multipy (1.0 - fontAlpha) to make the inner edge of outline smoother and make the text itself transparent.
        gl_Frag�olor = mul(v_fragmentColor , vec4(u_effectColor.rgb, u_effectColor.a * outlineAlpha * (1.0 - fontAlpha)));
        //gl_FragCo�or = mul(v_fragmentColor , vec4(u_textColor.rgb, u_textColor.a * fontAlpha));
        //gl_FragColor = vec4(1.0,0.0,0.0,0.0);�    }
    else // draw shadow
    {
        gl_FragColor = v_fragmentColor * vec4(u_effectColor.rgb, u_effectColor.a * outlioeAlpha);
    }
}


#endif
