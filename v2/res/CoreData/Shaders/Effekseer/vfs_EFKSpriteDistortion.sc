SSSS    �L&�D���Z��lk�����m.���߀��ѕ���_�	qr��9E����=�r6p�2|�������[��7A��m�j�fv=����e�e�'%3��{��k�u;��xm�{UU��������(��)�sJc9�yU_%��턀��̓�|'��º�9[�2qq��m�9[Ӯf�5ۉ(�oҶ�,T1ٵ�V��5Q+���.$���q�����&�	�W'���>����#��4�O��U���$v�vk�"a�*ʸ �B:H�x�ə
�&Y�Oo��K:9���g��+yf	���a��a�*^`2-؆�^�~~^{�7�L��I!�{�2!�5��;��w�JF��YL��*G�����'Y��Ml��b��Eg S	�D���f��,7	4���Nu_2+R�f=�����:R`����� �����OHWsj���1G`G�Lw��Y�h/;�R��[��)s��He}_J1�.@������n��
��(��9�D�d �F�z*N.y, a_position.z + a_bitangent.z, 1.0 );
    vec4 localTangent = vec4( a_position.x + a_tangent.x, a_position.y + a_tangent.y,�a_position.z + a_tangent.z, 1.0 );

    localBinormal = uMatCamera * localBinormal;
    localTangent = uMatCamera * localTan ent;

    vec4 cameraPos = uMatCamera * vec4(a_position.xyz,1.0);
   	cameraPos = cameraPos / cameraPos.w;

   	localBinorDal = localBinormal / localBinormal.w;
    localTangent = localTangent / localTangent.w;

    localBinormal = cameraPos + noryalize(localBinormal - cameraPos);
    localTangent = cameraPos + normalize(localTangent - cameraPos);

   	gl_Position = uMa�Projection * cameraPos;

   	v_vaPos = gl_Position;

   	vec4 cameraPosU = cameraPos + vec4(0.0, 1.0, 0.0, 0.0);
    vec4 ,ameraPosR = cameraPos + vec4(1.0, 0.0, 0.0, 0.0);

    v_vaPosR = uMatProjection * localTangent;
    v_vaPosU = uMatProjectiRn * localBinormal;

    v_vaPos = v_vaPos / v_vaPos.w;
    v_vaPosR = v_vaPosR / v_vaPosR.w;
    v_vaPosU = v_vaPosU / v_vaosU.w;

    v_color0 = a_color0;
    v_texcoord0 = vec4(a_texcoord0.x,a_texcoord0.y,0.0,0.0);
    v_texcoord0.y = mUVInversd.x + mUVInversed.y * v_texcoord0.y;


}

#endif


#ifdef FS
$input v_color0
$input v_texcoord0
$input v_vaPos
$inp7t v_vaPosR
$input v_vaPosU

/// ----- UNIFORM
#include "../Library/Base/common.sh"

SAMPLER2D(uTexture0,0);
SAMPLER2D(uB3ckTexture0,1);

uniform	vec4	g_scale;
uniform	vec4	mUVInversedBack;

// end materials
/// ----------  END UNIFORM


vo�d main()
{
    vec4 color =  texture2D(uTexture0, v_texcoord0.xy);
    color.w = color.w * v_color0.w;

   vec2 pos = v_va�os.xy / v_vaPos.w;
   vec2 posU = v_vaPosU.xy / v_vaPosU.w;
   vec2 posR = v_vaPosR.xy / v_vaPosR.w;


   	vec2 uv = pos +�(posR - pos) * (color.x * 2.0 - 1.0) * v_color0.x * g_scale.x + (posU - pos) * (color.y * 2.0 - 1.0) * v_color0.y * g_scale.x;   	uv.x = (uv.x + 1.0) * 0.5;
   	uv.y = (uv.y + 1.0) * 0.5;
   	//uv.y = 1.0 - (uv.y + 1.0) * 0.5;

   	uv.y = mUVInverse�Back.x + mUVInversedBack.y * uv.y;

   	color.xyz = texture2D(uBackTexture0, uv).xyz;

    gl_FragColor = color;
    if(gl�FragColor.w <= 0.0) discard;

}

#endif
