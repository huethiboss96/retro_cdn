SSSS    �3/6�B���f�i�
tߜ�����T~������HֻZ�W���;sq��HMQ;����,�]v�+s������?M��m�f�`et����%�h�!x(��/��,�4!���tH���הR��R��PZ�3l�7Lr+�բː�����e6�����(P�8x���C�Z2K��Z�F=ű
�N涌(d���V��H8���i\ۨ�8ǹ��$�3��gTL���/��ǖ��b��s�g��F���v�rv�$S�$��@\�B:e�-�ΐ�*�;U��<:9���g��+bG#���3��c�*Fx"$B���Q�v*9<�&�V�4�N^S�=�c%I�1��U��"B�tf��j>I��d�ڼ̩fD��]S��f��AqI�Ƒ�n��97Bq���|$,J�q<��ݤ�YzT`��u
�ꐽh�f�m���AS)X|���7TGz�Bk��ZA�� kh�j����>d��u+KF7�%s��"�ҫ��q����3�Y�B�9�C�T�f?d normal = mul(inverseTransposeWorldMatrix , normal);
    #else
    normal = mul(u_model[0], vec4(normal,0.0)).xyz;
    #endi�
#endif

    v_normal = normalize(normal.xyz);
