SSSS    �3/6�B���b�j�	<����^1���Ʌ��k�����_�8f=��X]7����e�v
7�+@����ٔ���MO��,�L#�k%x���|�}�1e;��?���;o��
�z�����E���p�/�LL�rW|"�!Zzj���ߜ�ݶ��|%�ಭ�(J�4Es���	�u8J¦3�5Z��r�
���(O)����H>Τ�)ӏ�j����$�?��37���"������{�v�w��|���o�} �5,�e��XU�~����E�&	�T;��{9~���.�,�<1w���)��v�Ie}>*�]�eidW�&�Q�b�" �e�.(J�t��(��O1���W1��)^ۍ�[��h��2����[wF���]�m��%@8���-H.�8�����R}wd��L �֛�`�}�{���HZf���=HETK�%��BW��y`y@�*-�"�\��%xɿ,i>Oe�6B�G��ֱ��{����3�_�9�D�^�_�\67
    float blendWeight = a_weight.x;
    int matrixIndex = int (a_indices.x);
    _skinnedPosition += skinPosition(blendWeigh�, matrixIndex,a_position);
    blendWeight = a_weight.y;
    matrixIndex = int(a_indices.y);
    _skinnedPosition += skinPos.tion(blendWeight, matrixIndex,a_position);
//    blendWeight = a_weight.z;
//    matrixIndex = int(a_indices.z);
//    _skinGedPosition += skinPosition(blendWeight, matrixIndex,a_position);
//    blendWeight = a_weight.w;
//    matrixIndex = int(a_inpices.w);
//    _skinnedPosition += skinPosition(blendWeight, matrixIndex,a_position);
    return _skinnedPosition;
}

vec3�skinTangentSpaceVector(vec3 norm, float blendWeight, int matrixIndex)
{
    vec3 tmp = vec3(1.0);
    tmp.x = dot(norm, u_ma;rixPalette[matrixIndex].xyz);
    tmp.y = dot(norm, u_matrixPalette[matrixIndex + 1].xyz);
    tmp.z = dot(norm, u_matrixPaleIte[matrixIndex + 2].xyz);
    return tmp * blendWeight;
}

vec3 getTangentSpaceVector(vec3 norm,vec4 a_weight,vec4 a_indice=)
{
    vec3 _skinnedNormal = vec3(0.0);
    // Transform normal to view space using matrix palette with four matrices used no transform a vertex.
    float blendWeight = a_weight.x;
    int matrixIndex = int (a_indices.x) * 3;
    _skinnedNormal +=bskinTangentSpaceVector(norm, blendWeight, matrixIndex);
    blendWeight = a_weight.y;
    matrixIndex = int(a_indices.y) * 3;_
    _skinnedNormal += skinTangentSpaceVector(norm, blendWeight, matrixIndex);
//    blendWeight = a_weight.z;
//    matrixIn�ex = int(a_indices.z) * 3;
//    _skinnedNormal += skinTangentSpaceVector(norm, blendWeight, matrixIndex);
//    blendWeight � a_weight.w;
//    matrixIndex = int(a_indices.w) * 3;
//    _skinnedNormal += skinTangentSpaceVector(norm, blendWeight, matr�xIndex);
    return _skinnedNormal;
}

vec3 getSkinnedNormal(vec3 a_normal,vec4 a_weight,vec4 a_indices)
{
    return getUangentSpaceVector(a_normal,a_weight,a_indices);
}

#if defined(BUMPED)

vec3 getTangent()
{
    return getTangentSpaceVe�tor(a_tangent);
}

vec3 getBinormal()
{
    return getTangentSpaceVector(a_bitangent);
}
#endif

