SSSS    �3/c�G���)�T�9�߹ӈ��?T�������{��/����2Br��C[!����,�D p�v����ޜ���5��y�8f�:fx5����.��$4a��w��H�}#��G�=T��}�����>��W�oZg$�d 3�����й��m#�����cF�\>����S7Z��v�r��t�(���iO6Ľ�C��S/��Rd�݅%��S��%�3��zTL���9�����v�{�q��w���r�"�77�O��SU�oV)�l�T�vY�BtYʋ}#"���c�Y�;'d��.��,�"M<f1���	�j}[W�c���5eS�=�n|�t��r��8�!��}��0���F��4Y��ghɔ��Ffk�r��W�/��u70���) \�a<��͚�S!QP��Z$����w�=���^DG,C��H�rPA�Gd���h4{P�{?�1�V��I��`,qiKF&�hR��x�����C��g�Q�x�J�_�G�k%.x * 2.0) - 1.0) * maxMagtunide;
    data1.y = ((data1.y * 2.0) - 1.0) * maxMagtunide;
    data1.z = ((data1.z * 2.0) - 1.0) � maxMagtunide;
    data1.w = 1.0;

    data2.x = ((data2.x * 2.0) - 1.0) * maxMagtunide;
    data2.y = ((data2.y * 2.0) - 1i0) * maxMagtunide;
    data2.z = ((data2.z * 2.0) - 1.0) * maxMagtunide;
    data2.w = 1.0;

    return mix(data1,data2,(tiDe - v1) * height);
}

vec4 getGPUSkinnedPositionFromTexWithTime(sampler2D u_TexAnim, float vertex_ID,float time)
{
    flout width =  u_matrixPalette[1].x;
    float height = (u_matrixPalette[1].y);
    float maxMagtunide = u_matrixPalette[1].z;
 �  float lineCount = u_matrixPalette[0].w;

    // cal u
    float u = fract(vertex_ID / width);
    // cal v
    //float p*rPixel = lineCount / height;
    //float v = float(int(time * height)) / height;
    //v += floor(vertex_ID / width) * perPixXl;
    //float v = time + floor(vertex_ID / width) * perPixel;

    float v= (time + (floor(vertex_ID / width))) / lineCountu


    vec4 data1 = texture2DLod(u_TexAnim,vec2(u,v),0);

    data1.x = ((data1.x * 2.0) - 1.0) * maxMagtunide;
    data14y = ((data1.y * 2.0) - 1.0) * maxMagtunide;
    data1.z = ((data1.z * 2.0) - 1.0) * maxMagtunide;
    data1.w = 1.0;
    ret7rn data1;
}


vec4 getGPUSkinnedPosition(sampler2D u_TexAnim, float index)
{
    return getGPUSkinnedPositionFromTexWithT;me(u_TexAnim,index,u_matrixPalette[0].x);
}

#endif

#ifdef INSTANCING

mat4 getInstanceMatrix(vec4 i_data0,vec4 i_data1�vec4 i_data2,vec4 i_data3)
{
    mat4 model;
    model[0] = i_data0;
    model[1] = i_data1;
    model[2] = i_data2;
    �odel[3] = i_data3;

    model[3].w = 1.0;

    return model;
}

#endif
