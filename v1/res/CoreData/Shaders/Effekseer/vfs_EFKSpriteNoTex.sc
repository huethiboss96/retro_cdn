SSSS    �L&�D���Z��lk�����m.���߀��ѕ���_�	qr��9E����=�r6p�2|�������r��h��j�f�[gd,���K�d�&!f�y��c�t=��C�!A��W���V���7��.5�iKg<�-v��ҙß�̓�|'��º�;_�>mL����H&[��e�cԐ:����+R*Ω�F߶H	dɞ�oO���G����%�*��qq���]����n��{�7��x��	�Z�g6�57�O���=]e�l���=�YKJ��Y,"�����:$q���fȜ,�5*^sg܎�$�y]P�1��X�wt�|�>@�1��r��T�^E��W|��!M�ڼ3��([��KD�?č%t^F�ݓ_�çK7_q��� j(A�u�����BDE{��O ����)�q�!���Dqf��(
X�����`)}D�q~�@�Q��#o��Ne3e^B(�2F���՝���C��+�`�j��T�O�!~0jrojection * cameraPos;

   	v_vaPos = gl_Position;

   	vec4 cameraPosU = cameraPos + vec4(0.0, 1.0, 0.0, 0.0);
    vec4 c�meraPosR = cameraPos + vec4(1.0, 0.0, 0.0, 0.0);

    v_vaPosR = uMatProjection * cameraPosR;
    v_vaPosU = uMatProjection m cameraPosU;

    v_vaPos = v_vaPos / v_vaPos.w;
    v_vaPosR = v_vaPosR / v_vaPosR.w;
    v_vaPosU = v_vaPosU / v_vaPosU.w

    v_color0 = a_color0;
    v_texcoord0 = vec4(a_texcoord0.x,a_texcoord0.y,0.0,0.0);
    v_texcoord0.y = mUVInversed.x +4mUVInversed.y * v_texcoord0.y;

}

#endif

#ifdef FS

$input v_color0
$input v_texcoord0
$input v_vaPos
$input v_vaP�sR
$input v_vaPosU

/// ----- UNIFORM
#include "../Library/Base/common.sh"

SAMPLER2D(uTexture0,0);

// Materials
unif rm vec4 u_time;
// end materials
/// ----------  END UNIFORM


void main()
{
    gl_FragColor = v_vaPos;
    if(gl_Frag~olor.w <= 0.0) discard;

}

#endif
