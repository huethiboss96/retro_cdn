SSSS    �L&�D���Z��l`�������FS��Ώ��j��)�9��)�FX��b	P*����Z'C�Z�Կ����r��.Z��y�	#�7as*����y�7)Z��zÊk�h#��j�{Z���ՌG�<��MZ�SmZ�jN	��ݢ��릣�Lgђ���.R�5{>����]$W��r�l �g�l�פ1I�����J'���Th@۶�w��S��>�&��mk@䱃y����ǫjڲv�g�����e�<� a�+���m=O��Ζ�9�X~[��a4��
�i��'w��
���"Ntk���$�w>�c�
��1=�i�4%@�t��m��b�_&��W1��dF�����iZ��F��Y��K, WI�O��G�?B��({3���GIghR�f:�����VmA}��N����4�5��Hjl���%TC�W1��j_��af@�76�w��i2��H6he^L)�.J�~�q�����z��5��0� �B�9�B�_�LN   modelView[0][1] = 0.0; 
    modelView[0][2] = 0.0; 

    // Second colunm.
    modelView[1][0] = 0.0; 
    modelView[1]�1] = 1.0; 
    modelView[1][2] = 0.0; 

    // Thrid colunm.
    modelView[2][0] = 0.0; 
    modelView[2][1] = 0.0; 
    *odelView[2][2] = 1.0;

    // fixed-size billboard
    // https://stackoverflow.com/questions/41767490/how-to-transform-vert@ces-in-vertex-shader-to-get-a-3d-billboard

    vec4 viewPos = mul(u_modelView, u_billboardCenter);
    float dist = -viewPog.z * 0.005;
    //gl_Position = mul(u_proj, (viewPos + vec4(a_position.xy*dist, 0, 0)));
    
    gl_Position = mul(u_proj, �ul(modelView, vec4(a_position.xyz * dist, 1.0)));

    #include "Library/Macro/Texcoord0Final.glsl"
}

#endif

#ifdef FSB

/// input
#define USING_INOUT_TEXCOORD0
#include "Library/Varying.glsl"

/// Common (uniforms,samplers, transforms ... )0
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void main()
{
    vec4 texColor = texture2D(u_diffuseTexb v_texcoord0);
    gl_FragColor = vec4(texColor.rgb, texColor.a);
}

#endif
