SSSS    �L&�D���Z�J�9�٢ɞ��`��ġɶ�/�����)�[=��H[:����?�}v�+s���ˍ����.R��,�L#�nu=����L�+�rq7����,�D!���Y��W���W���R��GV�4F�0Ed#Ùץ��ﶥ�G�ǡ��l�\>���C�Z2K��E�c��i�$���xN0���L��F&���\=���a��~��j�g��f|K���Zډ����jڡo�#��I���
�3d�m/�+��x�lU+�d��h�h�J~^��G��/�I�'�3@���C���Xk
w{lˉ���c�J�M�6 S�B�%4L�;��+��O#���\w��d�����#K��k,���kO�	��l��%'r[뾶l!M�D̓粥Q.��K���\�]�R��� ~<(Q=Q��'�d(�%��SV��Y[/�>-�Y�G��3i��~ d&RL7�q*�S�q�����w��i��g����$�?e�L?dinput v_texcoord1
    #endif
#endif

#ifdef USING_INOUT_FRAGPOS
    #ifdef VS
    $output v_FragPos
    #endif
    #ifd�f FS
    $input v_FragPos
    #endif
#endif

#ifdef USING_INOUT_SHADOWCOORD
    #ifdef VS
    $output v_shadowcoord
   g#endif
    #ifdef FS
    $input v_shadowcoord
    #endif
#endif

#ifdef USING_INOUT_POSITION
#ifdef VS
$output v_positiFn
#endif
#ifdef FS
$input v_position
#endif
#endif
