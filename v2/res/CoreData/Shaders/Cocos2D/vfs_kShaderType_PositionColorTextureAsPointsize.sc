SSSS    �L&�D���Z��!�ヽ���]-���ć��n������f>=��EX �V���&�gq�ji��ʐ���(X���a	�fr4���c�%�8q��}΋N�h*��
�;��U���9���>��R�r
3�sM'��뎋�����n8��¡�9
�]A����j?KЎ^�a��]���}U-˪�O��S~Ƒ�#Px���w��H��?�.�	�o9@��w��ǿ��Nեh�{�-���	e�3)�98���> �;Y�h���5�*�Gcc��/@\���i��>#0���X��~�'g5fx���#�bxRY�.�S�Z�c0�I�-)�^��r��n�]N��4R͛-@�����LX��^N����L6C0y9�ǩ�jN��4y7���Vlq�W��粣Z94��/o�蝖f�y�c���O^7ia�e�_,LG�Lw��XS��YxyL�i]����4t­,iH3RJ!�-F��x�����>��C���_�p��UB�� 7)Ol(u_viewProjMatrix,CC_MVMatrix) , vec4(a_position.xyz,1.0));
    //gl_PointSize = a_texcoord0.x;
    v_fragmentColor = vec4(a�color0.rgb * a_color0.a * u_alpha.x, a_color0.a * u_alpha.x);
}


#endif

#ifdef FS
$input v_fragmentColor


#includeg"../Library/Base/common.sh"


uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;
uniOorm mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
uniform vqc4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;


void main()
{
    gl_FragColor = v_fragmentColor;
}�


#endif
