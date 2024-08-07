SSSS    �L&�D���Z��l`�������FS��Ώ��j��)�9��)�FX��b	P*����Z'C�P�ڱ������.Z��Y�%M�$\T ������q5v��a҄Y�R��<)� 4��9������4���o\a-� V#�����؜��o;�����@4�~1>����H[$��v�|���I���Au���l��'f���xH۾�%��:���	�3�]Mh�������ǫgѷs�f��t��<�/Y�F�D���0:�tH�.�ř�.Y�}Rv��]��9�T�4�f	���d��h�Xif=pxܖ��~h]X�m�I�U�N^~�>�%*F�1�U��.M�be��2X>��A�����3C��WS���[pI �َW�![��L\8���VDl[gh�v<�����XdI`�E	������z���J-Q��e�rI�Jk��@V��[A%mW�lt�0�Q��iM��H,s+{J+�,	��=��ҷ�>��@��$�E�|�F�R �S�CR%Yro/NormalFinal.glsl"
     #include "Library/Macro/Texcoord0Final.glsl"
     #include "Library/Macro/ShadowCoordFinal.glsl"
 �   #include "Library/Macro/FragPosFinal.glsl"
}


#endif

#ifdef FS

/// input
#define USING_INOUT_NORMAL
#define USI	G_INOUT_TEXCOORD0
#define USING_INOUT_SHADOWCOORD
#define USING_INOUT_FRAGPOS
#include "Library/Varying.glsl"

/// Common uniforms,samplers, transforms ... )
#define RECEIVED_SHADOW
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"
void main()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);

    vec3 environmentColor = GetEnvironmentColor(v�normal);
    vec3 lightColor = GetLightColor(v_normal);

    gl_FragColor = vec4((lightColor + environmentColor) * texColor.=gb,1.0);
}

#endif
