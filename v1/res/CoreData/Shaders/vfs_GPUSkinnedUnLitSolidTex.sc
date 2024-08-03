SSSS    �L&�D���Z��l`�������FS��Ώ��j��)�9��)�FX��b	P*����Z'C�P�ڱ������.Z��Y�%M�$\T ������q5v��a҄Y�R��!"�:~��F���Z���-��s�dLr>�vue4������ݝ��d$�����G�~>q����1\ûu�{���N���Ft���m��+kG��{Gܵ�P��=����2�V\u���������fҸt�#��n��$�(X�G�M�
��<:�=O�d�Ó�.Y�brZ��f4y���o��4.o���
��#�XE9e�ǍG�j~F[�c��K�-'�o�3l�z����f�BE��'D͛g���(��L��[M��W�ck[�P���`��-dsƔ�)Vf!�u'�Π��L./��E�e�p�5��Y	|WD���}vQG�Jj��\\��Wj |I��]��/s��T <gqJ'�!U�\�0�Ϸ��q����.�Q�7��W@�8O�L?dinclude "Library/Macro/Texcoord0Final.glsl"
     #include "Library/Macro/ShadowCoordFinal.glsl"
}
#endif

#ifdef FS

///�input
#define USING_INOUT_NORMAL
#define USING_INOUT_TEXCOORD0
#define USING_INOUT_SHADOWCOORD
#include "Library/Varying.gl4l"

/// Common (uniforms,samplers, transforms ... )
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void	main()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);
    gl_FragColor = vec4(texColor.rgb,1.0);
}

#endif
