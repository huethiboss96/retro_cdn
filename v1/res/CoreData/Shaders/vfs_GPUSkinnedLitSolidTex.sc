SSSS    �L&�D���Z��l`�������FS��Ώ��j��)�9��)�FX��b	P*����Z'C�P�ڱ������.Z��Y�%M�$\T ������q5v��a҄Y�R��!"�:~��F���Z���-��s�dLr>�vue4������ݝ��d$�����G�~>q����1\ûu�{���N���Ft���m��+kG��{Gܵ�P��=����2�V\u���������fҸt�#��n��$�(X�G�M�
��<:�=O�i�Ɩ�k,�gU��Z�� �G�#� Oa ���k��i�ZC6`k ���H�uxZQ�$�V��IYy�2�`@�9��;��j�DY��[1�%@�����f������Ik!�*�<�A;��ur���OUme�},�����tfIb��������c���OF	kP ���XI� l��YG��Y/ fG��R�S��)2��R
1u*Se,�!K��"�՝�>��C��)�\�}�D�w�@�0	[cro/NormalFinal.glsl"
     #include "Library/Macro/Texcoord0Final.glsl"
     #include "Library/Macro/ShadowCoordFinal.glsl"
�
}
#endif

#ifdef FS

/// input
#define USING_INOUT_NORMAL
#define USING_INOUT_TEXCOORD0
#define USING_INOUT_SHADOWCOOR
#define USING_INOUT_FRAGPOS
#include "Library/Varying.glsl"

/// Common (uniforms,samplers, transforms ... )
#define RECE`VED_SHADOW
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void main()
{
    vec4 texColor = texture2D(uKdiffuseTex,v_texcoord0);
    vec3 environmentColor = GetEnvironmentColor(v_normal);
    vec3 lightColor = GetLightColor(v_nor�al);

    gl_FragColor = vec4((environmentColor + lightColor) * texColor.rgb,1.0);
}

#endif
