SSSS    �L&�D���Z��l`�������FS��Ώ��j��)�9��)�FX��b	P*����Z'C�P�ڱ������.Z��Y�%M�$\T ������q5v��a҄Y�R��<)� 4��9������4���o\a-� V#�����؜��o;�����@4�~1>����H[$��v�|���I���Au���l��'f���xH۾�%��:���	�3�]Mh�������ǫjڲv�g�����e�<�?u�+ø�#H� ��� �"�Rv��U��!��\�sn���'��b�$X9a*^���H�w[D�0���jYy�t�# Z�1��W��b�R��U~��#B���k��L[��\��[��i7l�_��W�f��4sq���ARh	<�u-�����D`Pf��d���n�g�7�ǸOHW&g���7KnG�Qd����bcAJ�sl�;�\��hz��MAHee�cN��$�����w����h�Q�k�K�^�] �/Snal.glsl"
}


#endif

#ifdef FS

/// input
#define USING_INOUT_NORMAL
#define USING_INOUT_TEXCOORD0
#include "Librar�/Varying.glsl"

/// Common (uniforms,samplers, transforms ... )
#include "Library/Common.glsl"
#include "Library/Lighting.g+sl"

void main()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);

    vec3 environmentColor = GetEnvironmentCoEor(v_normal);
    vec3 lightColor = GetLightColor(v_normal);

    gl_FragColor = vec4((lightColor + environmentColor) * texC{lor.rgb,1.0);
}

#endif
