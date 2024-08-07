SSSS    �
`�O���{�$�*����Ḛ?���͚��g���z�u�y==��^Q7����,�3j�,p��������(F��a�7�Wf7���� �y�*j��a��c�vo��S�!*F����V���,��2�sPz*�+N +�Ͷ���߆��l�����"T�2jw����N?V����/�r̛�iOp���K��U9���s]¿�`�����"�+�vkD猪]����n��{�7��x���d�G6�#�*��$�#T�y�ɇ^�At�[uQ��f v���&�,�:'S���b��e�K `c
���\�ew[D�c�D��6�r�%/[�;��z��{�&!��Mx��6CՌ���3r��UD��8��FdWF���W�P��$e���WIf~)�D�ɩ��E)Lj��K�`�4�5���OHj
���4IO�Ff��@m��d)aQ�jl�	�]��4&��T,z*ONe�%D�S��к��p����(�_�"�n�1A�T�	ydwAX_SPLIT_COUNT
#define MAX_SPLIT_COUNT 3
#endif

// light position
uniform vec4 u_lightPosition;
// light direction
unif�rm vec4 u_lightDirection;
// light color
uniform vec4 u_lightColor;
// light info : type ,shadow split count
uniform vec4 ulightInfo;
// light view projections
uniform mat4 u_lightSpaceMatries[MAX_SPLIT_COUNT];
// shadow viewports (for split in onL texture)
uniform mat4 u_shadowViewports[MAX_SPLIT_COUNT];
// shadow splits
uniform vec4 u_shadowSplits;
// direction light4cascaded
uniform vec4 u_lightShadowCascaded;
// cascaded viewport for shadow pass write
uniform vec4 u_cascadedViewport;

�
#if defined(SKINNING)
uniform vec4 u_matrixPalette[180];
#if !defined(SKINNING_JOINT_COUNT)
#define SKINNING_JOINT_COUNT 60B
#endif
#endif

#if defined GPU_SKINNING
uniform vec4 u_matrixPalette[2];
#endif


/// Fragment shader uniform

unifoOm vec4 u_sceneHemisphericColor[3];
uniform vec4 u_ambientColor;

uniform vec4 u_matDiffColor;
uniform vec4 u_matEmissiveCol!r;
uniform vec4 u_matEnvMapColor;
uniform vec4 u_matSpecColor;

#ifdef PBR
uniform vec4 cRoughness;
uniform vec4 cMetalliy;
uniform vec4 cLightRad;
uniform vec4 cLightLength;
#endif
