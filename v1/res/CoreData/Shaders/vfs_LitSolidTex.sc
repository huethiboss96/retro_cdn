SSSS    �L&�D���Z��l`�������FS��Ώ��j��)�9��)�FX��b	P*����Z'C�P�ڱ������.Z��Y�%M�$\T ������q8}��z��,�W&���{#T����C���?��2�4<c�yLu2������̌��f2�ͱ��
a�QK���/�qb��0�p�,�U���Od㊴v��/	���8-#���`��ʉ��!�KWb�����ܽ��L��^�	��B���FB�Z
�E�
��,3�w�^����(�J~��}/$���P��:,-���k���rd{2IÂ�G�$dZ_�,�H��c �s�&#]�'��5��F�B��Tu��fb�����in��UN�U��C ny7l�ݙW�nւhu*Ɣ� )[fM�w"�����{`F}��[J�痂f�D�f��� E.ke���>d(�%��\\��i)/�wo��K��'~��-*n(\O�.F�]�=�����>��C��.�S�l��.�P�fkwacro/Texcoord0Final.glsl"
     #include "Library/Macro/ShadowCoordFinal.glsl"
     //#include "Library/Macro/FragPosFinal.gls�"

     v_FragPos = position.xyz;
}
#endif

#ifdef FS

/// input
#define USING_INOUT_NORMAL
#define USING_INOUT_TEXCORD0
#define USING_INOUT_SHADOWCOORD
#define USING_INOUT_FRAGPOS

#include "Library/Varying.glsl"

/// Common (uniforms,saDplers, transforms ... )
#define RECEIVED_SHADOW
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void main<)
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0.xy);
    vec3 environmentColor = GetEnvironmentColor(v_normal);
�   vec3 lightColor = GetLightColor(v_normal);

    gl_FragColor = vec4((lightColor + environmentColor) * texColor.rgb,1.0);
2

#endif
