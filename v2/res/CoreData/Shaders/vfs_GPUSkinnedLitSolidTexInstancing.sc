SSSS    �L&�D���Z��l`�������FS��Ώ��j��)�9��)�FX��b	P*����Z'C�P�ڱ������.Z��Y�%M�$\T ������q5v��a҄Y�R��!"�:~��F���W���6�P�pv�AaZ�bN����������}3�����/L�#g1����D@׫g�r��k�
���'d°�R��g-i���sK���L��,����(�PTlۜ�t������#�S�D��i��/�2R�P�H�H���&^ �X��"�7�{Og��U	��)�T�~�p&e���'��E�?c]_&�h�\^g;�`�K�U�'1S�Q�">N�-��z��m�L��TU��N���%��+B��T��T��BqC_�ڎ�}ˊo9Qqⓜ Dl,J�4	��օ�~GjF��/o�⑖`�q�\���.e+>K?���1JFK�I��GS��VN#bH�p#��^�L��N
!<(\J+�i*��[�����=�� ��#��U��Z�"�m+PositionFinal.glsl"
     #include "Library/Macro/NormalFinal.glsl"
     #include "Library/Macro/Texcoord0Final.glsl"
     #i�clude "Library/Macro/ShadowCoordFinal.glsl"

    //gl_Position =  mul(u_modelViewProj , vec4(a_position.xy,1.0,1.0));
}
#en#if

#ifdef FS

/// input
#define USING_INOUT_NORMAL
#define USING_INOUT_TEXCOORD0
#define USING_INOUT_SHADOWCOORD
#defiGe USING_INOUT_FRAGPOS
#include "Library/Varying.glsl"

/// Common (uniforms,samplers, transforms ... )
//#define RECEIVED_S\ADOW
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void main()
{
    vec4 texColor = texture2D(u_diffu�eTex,v_texcoord0);
    vec3 environmentColor = GetEnvironmentColor(v_normal);
    vec3 lightColor = GetLightColor(v_normal);E
    gl_FragColor = vec4((environmentColor + lightColor) * texColor.rgb,1.0);
}

#endif
