SSSS    �L&�D���Z��l`�������FS��Ώ��j��)�9��)�FX��b	P*����Z'C�Z�Կ����r��#Q��b�LV�2FV���� �H���f��`�*��9�&Cû!�׍V���(��DS�jF�0Mc*���֒�����z.�΃��$P�yr��m�1\��3�z�'�(���nT6�����F$���p]���+��~��.�!��"^}�����ֻ����~�e��B��5�2V�P�
�f���+Ue�A��2V�AvU��:*:��D��y�<+#���i���F t2*R���J�yuQ��G�X�:{>�~�/c�'��r��)j�JG�T}��N���I��)[��LN��D��_c 7l�_���n��a*_y���sOz1M�z`�Ƣ��9/��K����)�4�y���O]HJ%Pn��8�!OKA�|����P-c/�.6�w���*r��u<xV�!T��4����n��ֈ�=�9�D�W�FO�]?yu_cascadedViewport[1];
   float t2 = u_cascadedViewport[2];
   float t3 = u_cascadedViewport[3];

   u =  t0 + (t2 - t0) * �;
   v =  t1 + (t3 - t1) * v;

   gl_Position.x = u * 2.0 - 1.0;
   gl_Position.y = v * 2.0 - 1.0;
}

#endif


/// Fr&g shader
#ifdef FS

#include "Library/Common.glsl"

void main()
{
    gl_FragColor = vec4_splat(0.0);
}

#endif
