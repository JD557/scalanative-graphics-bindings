package gl

import scalanative.native._

object Extras {
  import GL._

  /*
   * Constants
   */

  /* Boolean values */
  val GL_FALSE: UByte = 0.toUByte
  val GL_TRUE: UByte = 1.toUByte

  /* Data types */
  val GL_BYTE: UShort = 0x1400.toUShort
  val GL_UNSIGNED_BYTE: UShort = 0x1401.toUShort
  val GL_SHORT: UShort = 0x1402.toUShort
  val GL_UNSIGNED_SHORT: UShort = 0x1403.toUShort
  val GL_INT: UShort = 0x1404.toUShort
  val GL_UNSIGNED_INT: UShort = 0x1405.toUShort
  val GL_FLOAT: UShort = 0x1406.toUShort
  val GL_2_BYTES: UShort = 0x1407.toUShort
  val GL_3_BYTES: UShort = 0x1408.toUShort
  val GL_4_BYTES: UShort = 0x1409.toUShort
  val GL_DOUBLE: UShort = 0x140A.toUShort

  /* Primitives */
  val GL_POINTS: UShort = 0x0000.toUShort
  val GL_LINES: UShort = 0x0001.toUShort
  val GL_LINE_LOOP: UShort = 0x0002.toUShort
  val GL_LINE_STRIP: UShort = 0x0003.toUShort
  val GL_TRIANGLES: UShort = 0x0004.toUShort
  val GL_TRIANGLE_STRIP: UShort = 0x0005.toUShort
  val GL_TRIANGLE_FAN: UShort = 0x0006.toUShort
  val GL_QUADS: UShort = 0x0007.toUShort
  val GL_QUAD_STRIP: UShort = 0x0008.toUShort
  val GL_POLYGON: UShort = 0x0009.toUShort

  /* Vertex Arrays */
  val GL_VERTEX_ARRAY: UShort = 0x8074.toUShort
  val GL_NORMAL_ARRAY: UShort = 0x8075.toUShort
  val GL_COLOR_ARRAY: UShort = 0x8076.toUShort
  val GL_INDEX_ARRAY: UShort = 0x8077.toUShort
  val GL_TEXTURE_COORD_ARRAY: UShort = 0x8078.toUShort
  val GL_EDGE_FLAG_ARRAY: UShort = 0x8079.toUShort
  val GL_VERTEX_ARRAY_SIZE: UShort = 0x807A.toUShort
  val GL_VERTEX_ARRAY_TYPE: UShort = 0x807B.toUShort
  val GL_VERTEX_ARRAY_STRIDE: UShort = 0x807C.toUShort
  val GL_NORMAL_ARRAY_TYPE: UShort = 0x807E.toUShort
  val GL_NORMAL_ARRAY_STRIDE: UShort = 0x807F.toUShort
  val GL_COLOR_ARRAY_SIZE: UShort = 0x8081.toUShort
  val GL_COLOR_ARRAY_TYPE: UShort = 0x8082.toUShort
  val GL_COLOR_ARRAY_STRIDE: UShort = 0x8083.toUShort
  val GL_INDEX_ARRAY_TYPE: UShort = 0x8085.toUShort
  val GL_INDEX_ARRAY_STRIDE: UShort = 0x8086.toUShort
  val GL_TEXTURE_COORD_ARRAY_SIZE: UShort = 0x8088.toUShort
  val GL_TEXTURE_COORD_ARRAY_TYPE: UShort = 0x8089.toUShort
  val GL_TEXTURE_COORD_ARRAY_STRIDE: UShort = 0x808A.toUShort
  val GL_EDGE_FLAG_ARRAY_STRIDE: UShort = 0x808C.toUShort
  val GL_VERTEX_ARRAY_POINTER: UShort = 0x808E.toUShort
  val GL_NORMAL_ARRAY_POINTER: UShort = 0x808F.toUShort
  val GL_COLOR_ARRAY_POINTER: UShort = 0x8090.toUShort
  val GL_INDEX_ARRAY_POINTER: UShort = 0x8091.toUShort
  val GL_TEXTURE_COORD_ARRAY_POINTER: UShort = 0x8092.toUShort
  val GL_EDGE_FLAG_ARRAY_POINTER: UShort = 0x8093.toUShort
  val GL_V2F: UShort = 0x2A20.toUShort
  val GL_V3F: UShort = 0x2A21.toUShort
  val GL_C4UB_V2F: UShort = 0x2A22.toUShort
  val GL_C4UB_V3F: UShort = 0x2A23.toUShort
  val GL_C3F_V3F: UShort = 0x2A24.toUShort
  val GL_N3F_V3F: UShort = 0x2A25.toUShort
  val GL_C4F_N3F_V3F: UShort = 0x2A26.toUShort
  val GL_T2F_V3F: UShort = 0x2A27.toUShort
  val GL_T4F_V4F: UShort = 0x2A28.toUShort
  val GL_T2F_C4UB_V3F: UShort = 0x2A29.toUShort
  val GL_T2F_C3F_V3F: UShort = 0x2A2A.toUShort
  val GL_T2F_N3F_V3F: UShort = 0x2A2B.toUShort
  val GL_T2F_C4F_N3F_V3F: UShort = 0x2A2C.toUShort
  val GL_T4F_C4F_N3F_V4F: UShort = 0x2A2D.toUShort

  /* Matrix Mode */
  val GL_MATRIX_MODE: GLenum = 0x0BA0.toUInt
  val GL_MODELVIEW: GLenum = 0x1700.toUInt
  val GL_PROJECTION: GLenum = 0x1701.toUInt
  val GL_TEXTURE: GLenum = 0x1702.toUInt

  /* Points */
  val GL_POINT_SMOOTH: UShort = 0x0B10.toUShort
  val GL_POINT_SIZE: UShort = 0x0B11.toUShort
  val GL_POINT_SIZE_GRANULARITY: UShort = 0x0B13.toUShort
  val GL_POINT_SIZE_RANGE: UShort = 0x0B12.toUShort
  
  /* Lines */
  val GL_LINE_SMOOTH: UShort = 0x0B20.toUShort
  val GL_LINE_STIPPLE: UShort = 0x0B24.toUShort
  val GL_LINE_STIPPLE_PATTERN: UShort = 0x0B25.toUShort
  val GL_LINE_STIPPLE_REPEAT: UShort = 0x0B26.toUShort
  val GL_LINE_WIDTH: UShort = 0x0B21.toUShort
  val GL_LINE_WIDTH_GRANULARITY: UShort = 0x0B23.toUShort
  val GL_LINE_WIDTH_RANGE: UShort = 0x0B22.toUShort
  
  /* Polygons */
  val GL_POINT: UShort = 0x1B00.toUShort
  val GL_LINE: UShort = 0x1B01.toUShort
  val GL_FILL: UShort = 0x1B02.toUShort
  val GL_CW: UShort = 0x0900.toUShort
  val GL_CCW: UShort = 0x0901.toUShort
  val GL_FRONT: UShort = 0x0404.toUShort
  val GL_BACK: UShort = 0x0405.toUShort
  val GL_POLYGON_MODE: UShort = 0x0B40.toUShort
  val GL_POLYGON_SMOOTH: UShort = 0x0B41.toUShort
  val GL_POLYGON_STIPPLE: UShort = 0x0B42.toUShort
  val GL_EDGE_FLAG: UShort = 0x0B43.toUShort
  val GL_CULL_FACE: UShort = 0x0B44.toUShort
  val GL_CULL_FACE_MODE: UShort = 0x0B45.toUShort
  val GL_FRONT_FACE: UShort = 0x0B46.toUShort
  val GL_POLYGON_OFFSET_FACTOR: UShort = 0x8038.toUShort
  val GL_POLYGON_OFFSET_UNITS: UShort = 0x2A00.toUShort
  val GL_POLYGON_OFFSET_POINT: UShort = 0x2A01.toUShort
  val GL_POLYGON_OFFSET_LINE: UShort = 0x2A02.toUShort
  val GL_POLYGON_OFFSET_FILL: UShort = 0x8037.toUShort

  /* Display Lists */
  val GL_COMPILE: UShort = 0x1300.toUShort
  val GL_COMPILE_AND_EXECUTE: UShort = 0x1301.toUShort
  val GL_LIST_BASE: UShort = 0x0B32.toUShort
  val GL_LIST_INDEX: UShort = 0x0B33.toUShort
  val GL_LIST_MODE: UShort = 0x0B30.toUShort
  
  /* Depth buffer */
  val GL_NEVER: UShort = 0x0200.toUShort
  val GL_LESS: UShort = 0x0201.toUShort
  val GL_EQUAL: UShort = 0x0202.toUShort
  val GL_LEQUAL: UShort = 0x0203.toUShort
  val GL_GREATER: UShort = 0x0204.toUShort
  val GL_NOTEQUAL: UShort = 0x0205.toUShort
  val GL_GEQUAL: UShort = 0x0206.toUShort
  val GL_ALWAYS: UShort = 0x0207.toUShort
  val GL_DEPTH_TEST: UShort = 0x0B71.toUShort
  val GL_DEPTH_BITS: UShort = 0x0D56.toUShort
  val GL_DEPTH_CLEAR_VALUE: UShort = 0x0B73.toUShort
  val GL_DEPTH_FUNC: UShort = 0x0B74.toUShort
  val GL_DEPTH_RANGE: UShort = 0x0B70.toUShort
  val GL_DEPTH_WRITEMASK: UShort = 0x0B72.toUShort
  val GL_DEPTH_COMPONENT: UShort = 0x1902.toUShort
  
  /* Lighting */
  val GL_LIGHTING: UShort = 0x0B50.toUShort
  val GL_LIGHT0: UShort = 0x4000.toUShort
  val GL_LIGHT1: UShort = 0x4001.toUShort
  val GL_LIGHT2: UShort = 0x4002.toUShort
  val GL_LIGHT3: UShort = 0x4003.toUShort
  val GL_LIGHT4: UShort = 0x4004.toUShort
  val GL_LIGHT5: UShort = 0x4005.toUShort
  val GL_LIGHT6: UShort = 0x4006.toUShort
  val GL_LIGHT7: UShort = 0x4007.toUShort
  val GL_SPOT_EXPONENT: UShort = 0x1205.toUShort
  val GL_SPOT_CUTOFF: UShort = 0x1206.toUShort
  val GL_CONSTANT_ATTENUATION: UShort = 0x1207.toUShort
  val GL_LINEAR_ATTENUATION: UShort = 0x1208.toUShort
  val GL_QUADRATIC_ATTENUATION: UShort = 0x1209.toUShort
  val GL_AMBIENT: UShort = 0x1200.toUShort
  val GL_DIFFUSE: UShort = 0x1201.toUShort
  val GL_SPECULAR: UShort = 0x1202.toUShort
  val GL_SHININESS: UShort = 0x1601.toUShort
  val GL_EMISSION: UShort = 0x1600.toUShort
  val GL_POSITION: UShort = 0x1203.toUShort
  val GL_SPOT_DIRECTION: UShort = 0x1204.toUShort
  val GL_AMBIENT_AND_DIFFUSE: UShort = 0x1602.toUShort
  val GL_COLOR_INDEXES: UShort = 0x1603.toUShort
  val GL_LIGHT_MODEL_TWO_SIDE: UShort = 0x0B52.toUShort
  val GL_LIGHT_MODEL_LOCAL_VIEWER: UShort = 0x0B51.toUShort
  val GL_LIGHT_MODEL_AMBIENT: UShort = 0x0B53.toUShort
  val GL_FRONT_AND_BACK: UShort = 0x0408.toUShort
  val GL_SHADE_MODEL: UShort = 0x0B54.toUShort
  val GL_FLAT: UShort = 0x1D00.toUShort
  val GL_SMOOTH: UShort = 0x1D01.toUShort
  val GL_COLOR_MATERIAL: UShort = 0x0B57.toUShort
  val GL_COLOR_MATERIAL_FACE: UShort = 0x0B55.toUShort
  val GL_COLOR_MATERIAL_PARAMETER: UShort = 0x0B56.toUShort
  val GL_NORMALIZE: UShort = 0x0BA1.toUShort
  
  /* User clipping planes */
  val GL_CLIP_PLANE0: UShort = 0x3000.toUShort
  val GL_CLIP_PLANE1: UShort = 0x3001.toUShort
  val GL_CLIP_PLANE2: UShort = 0x3002.toUShort
  val GL_CLIP_PLANE3: UShort = 0x3003.toUShort
  val GL_CLIP_PLANE4: UShort = 0x3004.toUShort
  val GL_CLIP_PLANE5: UShort = 0x3005.toUShort

  /* Accumulation buffer */
  val GL_ACCUM_RED_BITS: UShort = 0x0D58.toUShort
  val GL_ACCUM_GREEN_BITS: UShort = 0x0D59.toUShort
  val GL_ACCUM_BLUE_BITS: UShort = 0x0D5A.toUShort
  val GL_ACCUM_ALPHA_BITS: UShort = 0x0D5B.toUShort
  val GL_ACCUM_CLEAR_VALUE: UShort = 0x0B80.toUShort
  val GL_ACCUM: UShort = 0x0100.toUShort
  val GL_ADD: UShort = 0x0104.toUShort
  val GL_LOAD: UShort = 0x0101.toUShort
  val GL_MULT: UShort = 0x0103.toUShort
  val GL_RETURN: UShort = 0x0102.toUShort
  
  /* Alpha testing */
  val GL_ALPHA_TEST: UShort = 0x0BC0.toUShort
  val GL_ALPHA_TEST_REF: UShort = 0x0BC2.toUShort
  val GL_ALPHA_TEST_FUNC: UShort = 0x0BC1.toUShort
  
  /* Blending */
  val GL_BLEND: UShort = 0x0BE2.toUShort
  val GL_BLEND_SRC: UShort = 0x0BE1.toUShort
  val GL_BLEND_DST: UShort = 0x0BE0.toUShort
  val GL_ZERO: UShort = 0.toUShort
  val GL_ONE: UShort = 1.toUShort
  val GL_SRC_COLOR: UShort = 0x0300.toUShort
  val GL_ONE_MINUS_SRC_COLOR: UShort = 0x0301.toUShort
  val GL_SRC_ALPHA: UShort = 0x0302.toUShort
  val GL_ONE_MINUS_SRC_ALPHA: UShort = 0x0303.toUShort
  val GL_DST_ALPHA: UShort = 0x0304.toUShort
  val GL_ONE_MINUS_DST_ALPHA: UShort = 0x0305.toUShort
  val GL_DST_COLOR: UShort = 0x0306.toUShort
  val GL_ONE_MINUS_DST_COLOR: UShort = 0x0307.toUShort
  val GL_SRC_ALPHA_SATURATE: UShort = 0x0308.toUShort
  
  /* Render Mode */
  val GL_FEEDBACK: UShort = 0x1C01.toUShort
  val GL_RENDER: UShort = 0x1C00.toUShort
  val GL_SELECT: UShort = 0x1C02.toUShort
  
  /* Feedback */
  val GL_2D: UShort = 0x0600.toUShort
  val GL_3D: UShort = 0x0601.toUShort
  val GL_3D_COLOR: UShort = 0x0602.toUShort
  val GL_3D_COLOR_TEXTURE: UShort = 0x0603.toUShort
  val GL_4D_COLOR_TEXTURE: UShort = 0x0604.toUShort
  val GL_POINT_TOKEN: UShort = 0x0701.toUShort
  val GL_LINE_TOKEN: UShort = 0x0702.toUShort
  val GL_LINE_RESET_TOKEN: UShort = 0x0707.toUShort
  val GL_POLYGON_TOKEN: UShort = 0x0703.toUShort
  val GL_BITMAP_TOKEN: UShort = 0x0704.toUShort
  val GL_DRAW_PIXEL_TOKEN: UShort = 0x0705.toUShort
  val GL_COPY_PIXEL_TOKEN: UShort = 0x0706.toUShort
  val GL_PASS_THROUGH_TOKEN: UShort = 0x0700.toUShort
  val GL_FEEDBACK_BUFFER_POINTER: UShort = 0x0DF0.toUShort
  val GL_FEEDBACK_BUFFER_SIZE: UShort = 0x0DF1.toUShort
  val GL_FEEDBACK_BUFFER_TYPE: UShort = 0x0DF2.toUShort
  
  /* Selection */
  val GL_SELECTION_BUFFER_POINTER: UShort = 0x0DF3.toUShort
  val GL_SELECTION_BUFFER_SIZE: UShort = 0x0DF4.toUShort

  /* Fog */
  val GL_FOG: Short = 0x0B60.toShort
  val GL_FOG_MODE: Short = 0x0B65.toShort
  val GL_FOG_DENSITY: Short = 0x0B62.toShort
  val GL_FOG_COLOR: Short = 0x0B66.toShort
  val GL_FOG_INDEX: Short = 0x0B61.toShort
  val GL_FOG_START: Short = 0x0B63.toShort
  val GL_FOG_END: Short = 0x0B64.toShort
  val GL_LINEAR: Short = 0x2601.toShort
  val GL_EXP: Short = 0x0800.toShort
  val GL_EXP2: Short = 0x0801.toShort
  
  /* Logic Ops */
  val GL_LOGIC_OP: UShort = 0x0BF1.toUShort
  val GL_INDEX_LOGIC_OP: UShort = 0x0BF1.toUShort
  val GL_COLOR_LOGIC_OP: UShort = 0x0BF2.toUShort
  val GL_LOGIC_OP_MODE: UShort = 0x0BF0.toUShort
  val GL_CLEAR: UShort = 0x1500.toUShort
  val GL_SET: UShort = 0x150F.toUShort
  val GL_COPY: UShort = 0x1503.toUShort
  val GL_COPY_INVERTED: UShort = 0x150C.toUShort
  val GL_NOOP: UShort = 0x1505.toUShort
  val GL_INVERT: UShort = 0x150A.toUShort
  val GL_AND: UShort = 0x1501.toUShort
  val GL_NAND: UShort = 0x150E.toUShort
  val GL_OR: UShort = 0x1507.toUShort
  val GL_NOR: UShort = 0x1508.toUShort
  val GL_XOR: UShort = 0x1506.toUShort
  val GL_EQUIV: UShort = 0x1509.toUShort
  val GL_AND_REVERSE: UShort = 0x1502.toUShort
  val GL_AND_INVERTED: UShort = 0x1504.toUShort
  val GL_OR_REVERSE: UShort = 0x150B.toUShort
  val GL_OR_INVERTED: UShort = 0x150D.toUShort
  
  /* Stencil */
  val GL_STENCIL_BITS: UShort = 0x0D57.toUShort
  val GL_STENCIL_TEST: UShort = 0x0B90.toUShort
  val GL_STENCIL_CLEAR_VALUE: UShort = 0x0B91.toUShort
  val GL_STENCIL_FUNC: UShort = 0x0B92.toUShort
  val GL_STENCIL_VALUE_MASK: UShort = 0x0B93.toUShort
  val GL_STENCIL_FAIL: UShort = 0x0B94.toUShort
  val GL_STENCIL_PASS_DEPTH_FAIL: UShort = 0x0B95.toUShort
  val GL_STENCIL_PASS_DEPTH_PASS: UShort = 0x0B96.toUShort
  val GL_STENCIL_REF: UShort = 0x0B97.toUShort
  val GL_STENCIL_WRITEMASK: UShort = 0x0B98.toUShort
  val GL_STENCIL_INDEX: UShort = 0x1901.toUShort
  val GL_KEEP: UShort = 0x1E00.toUShort
  val GL_REPLACE: UShort = 0x1E01.toUShort
  val GL_INCR: UShort = 0x1E02.toUShort
  val GL_DECR: UShort = 0x1E03.toUShort

  /* Buffers, Pixel Drawing/Reading */
  val GL_NONE: UShort = 0.toUShort
  val GL_LEFT: UShort = 0x0406.toUShort
  val GL_RIGHT: UShort = 0x0407.toUShort
  /*val GL_FRONT: UShort = 0x0404.toUShort*/
  /*val GL_BACK: UShort = 0x0405.toUShort*/
  /*val GL_FRONT_AND_BACK: UShort = 0x0408.toUShort*/
  val GL_FRONT_LEFT: UShort = 0x0400.toUShort
  val GL_FRONT_RIGHT: UShort = 0x0401.toUShort
  val GL_BACK_LEFT: UShort = 0x0402.toUShort
  val GL_BACK_RIGHT: UShort = 0x0403.toUShort
  val GL_AUX0: UShort = 0x0409.toUShort
  val GL_AUX1: UShort = 0x040A.toUShort
  val GL_AUX2: UShort = 0x040B.toUShort
  val GL_AUX3: UShort = 0x040C.toUShort
  val GL_COLOR_INDEX: UShort = 0x1900.toUShort
  val GL_RED: UShort = 0x1903.toUShort
  val GL_GREEN: UShort = 0x1904.toUShort
  val GL_BLUE: UShort = 0x1905.toUShort
  val GL_ALPHA: UShort = 0x1906.toUShort
  val GL_LUMINANCE: UShort = 0x1909.toUShort
  val GL_LUMINANCE_ALPHA: UShort = 0x190A.toUShort
  val GL_ALPHA_BITS: UShort = 0x0D55.toUShort
  val GL_RED_BITS: UShort = 0x0D52.toUShort
  val GL_GREEN_BITS: UShort = 0x0D53.toUShort
  val GL_BLUE_BITS: UShort = 0x0D54.toUShort
  val GL_INDEX_BITS: UShort = 0x0D51.toUShort
  val GL_SUBPIXEL_BITS: UShort = 0x0D50.toUShort
  val GL_AUX_BUFFERS: UShort = 0x0C00.toUShort
  val GL_READ_BUFFER: UShort = 0x0C02.toUShort
  val GL_DRAW_BUFFER: UShort = 0x0C01.toUShort
  val GL_DOUBLEBUFFER: UShort = 0x0C32.toUShort
  val GL_STEREO: UShort = 0x0C33.toUShort
  val GL_BITMAP: UShort = 0x1A00.toUShort
  val GL_COLOR: UShort = 0x1800.toUShort
  val GL_DEPTH: UShort = 0x1801.toUShort
  val GL_STENCIL: UShort = 0x1802.toUShort
  val GL_DITHER: UShort = 0x0BD0.toUShort
  val GL_RGB: UShort = 0x1907.toUShort
  val GL_RGBA: UShort = 0x1908.toUShort
  
  /* Implementation limits */
  val GL_MAX_LIST_NESTING: UShort = 0x0B31.toUShort
  val GL_MAX_EVAL_ORDER: UShort = 0x0D30.toUShort
  val GL_MAX_LIGHTS: UShort = 0x0D31.toUShort
  val GL_MAX_CLIP_PLANES: UShort = 0x0D32.toUShort
  val GL_MAX_TEXTURE_SIZE: UShort = 0x0D33.toUShort
  val GL_MAX_PIXEL_MAP_TABLE: UShort = 0x0D34.toUShort
  val GL_MAX_ATTRIB_STACK_DEPTH: UShort = 0x0D35.toUShort
  val GL_MAX_MODELVIEW_STACK_DEPTH: UShort = 0x0D36.toUShort
  val GL_MAX_NAME_STACK_DEPTH: UShort = 0x0D37.toUShort
  val GL_MAX_PROJECTION_STACK_DEPTH: UShort = 0x0D38.toUShort
  val GL_MAX_TEXTURE_STACK_DEPTH: UShort = 0x0D39.toUShort
  val GL_MAX_VIEWPORT_DIMS: UShort = 0x0D3A.toUShort
  val GL_MAX_CLIENT_ATTRIB_STACK_DEPTH: UShort = 0x0D3B.toUShort

  /* Gets */
  val GL_ATTRIB_STACK_DEPTH: UShort = 0x0BB0.toUShort
  val GL_CLIENT_ATTRIB_STACK_DEPTH: UShort = 0x0BB1.toUShort
  val GL_COLOR_CLEAR_VALUE: UShort = 0x0C22.toUShort
  val GL_COLOR_WRITEMASK: UShort = 0x0C23.toUShort
  val GL_CURRENT_INDEX: UShort = 0x0B01.toUShort
  val GL_CURRENT_COLOR: UShort = 0x0B00.toUShort
  val GL_CURRENT_NORMAL: UShort = 0x0B02.toUShort
  val GL_CURRENT_RASTER_COLOR: UShort = 0x0B04.toUShort
  val GL_CURRENT_RASTER_DISTANCE: UShort = 0x0B09.toUShort
  val GL_CURRENT_RASTER_INDEX: UShort = 0x0B05.toUShort
  val GL_CURRENT_RASTER_POSITION: UShort = 0x0B07.toUShort
  val GL_CURRENT_RASTER_TEXTURE_COORDS: UShort = 0x0B06.toUShort
  val GL_CURRENT_RASTER_POSITION_VALID: UShort = 0x0B08.toUShort
  val GL_CURRENT_TEXTURE_COORDS: UShort = 0x0B03.toUShort
  val GL_INDEX_CLEAR_VALUE: UShort = 0x0C20.toUShort
  val GL_INDEX_MODE: UShort = 0x0C30.toUShort
  val GL_INDEX_WRITEMASK: UShort = 0x0C21.toUShort
  val GL_MODELVIEW_MATRIX: UShort = 0x0BA6.toUShort
  val GL_MODELVIEW_STACK_DEPTH: UShort = 0x0BA3.toUShort
  val GL_NAME_STACK_DEPTH: UShort = 0x0D70.toUShort
  val GL_PROJECTION_MATRIX: UShort = 0x0BA7.toUShort
  val GL_PROJECTION_STACK_DEPTH: UShort = 0x0BA4.toUShort
  val GL_RENDER_MODE: UShort = 0x0C40.toUShort
  val GL_RGBA_MODE: UShort = 0x0C31.toUShort
  val GL_TEXTURE_MATRIX: UShort = 0x0BA8.toUShort
  val GL_TEXTURE_STACK_DEPTH: UShort = 0x0BA5.toUShort
  val GL_VIEWPORT: UShort = 0x0BA2.toUShort
  
  /* Evaluators */
  val GL_AUTO_NORMAL: UShort = 0x0D80.toUShort
  val GL_MAP1_COLOR_4: UShort = 0x0D90.toUShort
  val GL_MAP1_INDEX: UShort = 0x0D91.toUShort
  val GL_MAP1_NORMAL: UShort = 0x0D92.toUShort
  val GL_MAP1_TEXTURE_COORD_1: UShort = 0x0D93.toUShort
  val GL_MAP1_TEXTURE_COORD_2: UShort = 0x0D94.toUShort
  val GL_MAP1_TEXTURE_COORD_3: UShort = 0x0D95.toUShort
  val GL_MAP1_TEXTURE_COORD_4: UShort = 0x0D96.toUShort
  val GL_MAP1_VERTEX_3: UShort = 0x0D97.toUShort
  val GL_MAP1_VERTEX_4: UShort = 0x0D98.toUShort
  val GL_MAP2_COLOR_4: UShort = 0x0DB0.toUShort
  val GL_MAP2_INDEX: UShort = 0x0DB1.toUShort
  val GL_MAP2_NORMAL: UShort = 0x0DB2.toUShort
  val GL_MAP2_TEXTURE_COORD_1: UShort = 0x0DB3.toUShort
  val GL_MAP2_TEXTURE_COORD_2: UShort = 0x0DB4.toUShort
  val GL_MAP2_TEXTURE_COORD_3: UShort = 0x0DB5.toUShort
  val GL_MAP2_TEXTURE_COORD_4: UShort = 0x0DB6.toUShort
  val GL_MAP2_VERTEX_3: UShort = 0x0DB7.toUShort
  val GL_MAP2_VERTEX_4: UShort = 0x0DB8.toUShort
  val GL_MAP1_GRID_DOMAIN: UShort = 0x0DD0.toUShort
  val GL_MAP1_GRID_SEGMENTS: UShort = 0x0DD1.toUShort
  val GL_MAP2_GRID_DOMAIN: UShort = 0x0DD2.toUShort
  val GL_MAP2_GRID_SEGMENTS: UShort = 0x0DD3.toUShort
  val GL_COEFF: UShort = 0x0A00.toUShort
  val GL_ORDER: UShort = 0x0A01.toUShort
  val GL_DOMAIN: UShort = 0x0A02.toUShort

  /* Hints */
  val GL_PERSPECTIVE_CORRECTION_HINT: UShort = 0x0C50.toUShort
  val GL_POINT_SMOOTH_HINT: UShort = 0x0C51.toUShort
  val GL_LINE_SMOOTH_HINT: UShort = 0x0C52.toUShort
  val GL_POLYGON_SMOOTH_HINT: UShort = 0x0C53.toUShort
  val GL_FOG_HINT: UShort = 0x0C54.toUShort
  val GL_DONT_CARE: UShort = 0x1100.toUShort
  val GL_FASTEST: UShort = 0x1101.toUShort
  val GL_NICEST: UShort = 0x1102.toUShort
  
  /* Scissor box */
  val GL_SCISSOR_BOX: UShort = 0x0C10.toUShort
  val GL_SCISSOR_TEST: UShort = 0x0C11.toUShort
  
  /* Pixel Mode / Transfer */
  val GL_MAP_COLOR: UShort = 0x0D10.toUShort
  val GL_MAP_STENCIL: UShort = 0x0D11.toUShort
  val GL_INDEX_SHIFT: UShort = 0x0D12.toUShort
  val GL_INDEX_OFFSET: UShort = 0x0D13.toUShort
  val GL_RED_SCALE: UShort = 0x0D14.toUShort
  val GL_RED_BIAS: UShort = 0x0D15.toUShort
  val GL_GREEN_SCALE: UShort = 0x0D18.toUShort
  val GL_GREEN_BIAS: UShort = 0x0D19.toUShort
  val GL_BLUE_SCALE: UShort = 0x0D1A.toUShort
  val GL_BLUE_BIAS: UShort = 0x0D1B.toUShort
  val GL_ALPHA_SCALE: UShort = 0x0D1C.toUShort
  val GL_ALPHA_BIAS: UShort = 0x0D1D.toUShort
  val GL_DEPTH_SCALE: UShort = 0x0D1E.toUShort
  val GL_DEPTH_BIAS: UShort = 0x0D1F.toUShort
  val GL_PIXEL_MAP_S_TO_S_SIZE: UShort = 0x0CB1.toUShort
  val GL_PIXEL_MAP_I_TO_I_SIZE: UShort = 0x0CB0.toUShort
  val GL_PIXEL_MAP_I_TO_R_SIZE: UShort = 0x0CB2.toUShort
  val GL_PIXEL_MAP_I_TO_G_SIZE: UShort = 0x0CB3.toUShort
  val GL_PIXEL_MAP_I_TO_B_SIZE: UShort = 0x0CB4.toUShort
  val GL_PIXEL_MAP_I_TO_A_SIZE: UShort = 0x0CB5.toUShort
  val GL_PIXEL_MAP_R_TO_R_SIZE: UShort = 0x0CB6.toUShort
  val GL_PIXEL_MAP_G_TO_G_SIZE: UShort = 0x0CB7.toUShort
  val GL_PIXEL_MAP_B_TO_B_SIZE: UShort = 0x0CB8.toUShort
  val GL_PIXEL_MAP_A_TO_A_SIZE: UShort = 0x0CB9.toUShort
  val GL_PIXEL_MAP_S_TO_S: UShort = 0x0C71.toUShort
  val GL_PIXEL_MAP_I_TO_I: UShort = 0x0C70.toUShort
  val GL_PIXEL_MAP_I_TO_R: UShort = 0x0C72.toUShort
  val GL_PIXEL_MAP_I_TO_G: UShort = 0x0C73.toUShort
  val GL_PIXEL_MAP_I_TO_B: UShort = 0x0C74.toUShort
  val GL_PIXEL_MAP_I_TO_A: UShort = 0x0C75.toUShort
  val GL_PIXEL_MAP_R_TO_R: UShort = 0x0C76.toUShort
  val GL_PIXEL_MAP_G_TO_G: UShort = 0x0C77.toUShort
  val GL_PIXEL_MAP_B_TO_B: UShort = 0x0C78.toUShort
  val GL_PIXEL_MAP_A_TO_A: UShort = 0x0C79.toUShort
  val GL_PACK_ALIGNMENT: UShort = 0x0D05.toUShort
  val GL_PACK_LSB_FIRST: UShort = 0x0D01.toUShort
  val GL_PACK_ROW_LENGTH: UShort = 0x0D02.toUShort
  val GL_PACK_SKIP_PIXELS: UShort = 0x0D04.toUShort
  val GL_PACK_SKIP_ROWS: UShort = 0x0D03.toUShort
  val GL_PACK_SWAP_BYTES: UShort = 0x0D00.toUShort
  val GL_UNPACK_ALIGNMENT: UShort = 0x0CF5.toUShort
  val GL_UNPACK_LSB_FIRST: UShort = 0x0CF1.toUShort
  val GL_UNPACK_ROW_LENGTH: UShort = 0x0CF2.toUShort
  val GL_UNPACK_SKIP_PIXELS: UShort = 0x0CF4.toUShort
  val GL_UNPACK_SKIP_ROWS: UShort = 0x0CF3.toUShort
  val GL_UNPACK_SWAP_BYTES: UShort = 0x0CF0.toUShort
  val GL_ZOOM_X: UShort = 0x0D16.toUShort
  val GL_ZOOM_Y: UShort = 0x0D17.toUShort

  /* Texture mapping */
  val GL_TEXTURE_ENV: UShort = 0x2300.toUShort
  val GL_TEXTURE_ENV_MODE: UShort = 0x2200.toUShort
  val GL_TEXTURE_1D: UShort = 0x0DE0.toUShort
  val GL_TEXTURE_2D: UShort = 0x0DE1.toUShort
  val GL_TEXTURE_WRAP_S: UShort = 0x2802.toUShort
  val GL_TEXTURE_WRAP_T: UShort = 0x2803.toUShort
  val GL_TEXTURE_MAG_FILTER: UShort = 0x2800.toUShort
  val GL_TEXTURE_MIN_FILTER: UShort = 0x2801.toUShort
  val GL_TEXTURE_ENV_COLOR: UShort = 0x2201.toUShort
  val GL_TEXTURE_GEN_S: UShort = 0x0C60.toUShort
  val GL_TEXTURE_GEN_T: UShort = 0x0C61.toUShort
  val GL_TEXTURE_GEN_R: UShort = 0x0C62.toUShort
  val GL_TEXTURE_GEN_Q: UShort = 0x0C63.toUShort
  val GL_TEXTURE_GEN_MODE: UShort = 0x2500.toUShort
  val GL_TEXTURE_BORDER_COLOR: UShort = 0x1004.toUShort
  val GL_TEXTURE_WIDTH: UShort = 0x1000.toUShort
  val GL_TEXTURE_HEIGHT: UShort = 0x1001.toUShort
  val GL_TEXTURE_BORDER: UShort = 0x1005.toUShort
  val GL_TEXTURE_COMPONENTS: UShort = 0x1003.toUShort
  val GL_TEXTURE_RED_SIZE: UShort = 0x805C.toUShort
  val GL_TEXTURE_GREEN_SIZE: UShort = 0x805D.toUShort
  val GL_TEXTURE_BLUE_SIZE: UShort = 0x805E.toUShort
  val GL_TEXTURE_ALPHA_SIZE: UShort = 0x805F.toUShort
  val GL_TEXTURE_LUMINANCE_SIZE: UShort = 0x8060.toUShort
  val GL_TEXTURE_INTENSITY_SIZE: UShort = 0x8061.toUShort
  val GL_NEAREST_MIPMAP_NEAREST: UShort = 0x2700.toUShort
  val GL_NEAREST_MIPMAP_LINEAR: UShort = 0x2702.toUShort
  val GL_LINEAR_MIPMAP_NEAREST: UShort = 0x2701.toUShort
  val GL_LINEAR_MIPMAP_LINEAR: UShort = 0x2703.toUShort
  val GL_OBJECT_LINEAR: UShort = 0x2401.toUShort
  val GL_OBJECT_PLANE: UShort = 0x2501.toUShort
  val GL_EYE_LINEAR: UShort = 0x2400.toUShort
  val GL_EYE_PLANE: UShort = 0x2502.toUShort
  val GL_SPHERE_MAP: UShort = 0x2402.toUShort
  val GL_DECAL: UShort = 0x2101.toUShort
  val GL_MODULATE: UShort = 0x2100.toUShort
  val GL_NEAREST: UShort = 0x2600.toUShort
  val GL_REPEAT: UShort = 0x2901.toUShort
  val GL_CLAMP: UShort = 0x2900.toUShort
  val GL_S: UShort = 0x2000.toUShort
  val GL_T: UShort = 0x2001.toUShort
  val GL_R: UShort = 0x2002.toUShort
  val GL_Q: UShort = 0x2003.toUShort
  
  /* Utility */
  val GL_VENDOR: UShort = 0x1F00.toUShort
  val GL_RENDERER: UShort = 0x1F01.toUShort
  val GL_VERSION: UShort = 0x1F02.toUShort
  val GL_EXTENSIONS: UShort = 0x1F03.toUShort
  
  /* Errors */
  val GL_NO_ERROR: UShort = 0.toUShort
  val GL_INVALID_ENUM: UShort = 0x0500.toUShort
  val GL_INVALID_VALUE: UShort = 0x0501.toUShort
  val GL_INVALID_OPERATION: UShort = 0x0502.toUShort
  val GL_STACK_OVERFLOW: UShort = 0x0503.toUShort
  val GL_STACK_UNDERFLOW: UShort = 0x0504.toUShort
  val GL_OUT_OF_MEMORY: UShort = 0x0505.toUShort

  /* glPush/PopAttrib bits */
  val GL_CURRENT_BIT: GLbitfield =         0x00000001
  val GL_POINT_BIT: GLbitfield =           0x00000002
  val GL_LINE_BIT: GLbitfield =            0x00000004
  val GL_POLYGON_BIT: GLbitfield =         0x00000008
  val GL_POLYGON_STIPPLE_BIT: GLbitfield = 0x00000010
  val GL_PIXEL_MODE_BIT: GLbitfield =      0x00000020
  val GL_LIGHTING_BIT: GLbitfield =        0x00000040
  val GL_FOG_BIT: GLbitfield =             0x00000080
  val GL_DEPTH_BUFFER_BIT: GLbitfield =    0x00000100
  val GL_ACCUM_BUFFER_BIT: GLbitfield =    0x00000200
  val GL_STENCIL_BUFFER_BIT: GLbitfield =  0x00000400
  val GL_VIEWPORT_BIT: GLbitfield =        0x00000800
  val GL_TRANSFORM_BIT: GLbitfield =       0x00001000
  val GL_ENABLE_BIT: GLbitfield =          0x00002000
  val GL_COLOR_BUFFER_BIT: GLbitfield =    0x00004000
  val GL_HINT_BIT: GLbitfield =            0x00008000
  val GL_EVAL_BIT: GLbitfield =            0x00010000
  val GL_LIST_BIT: GLbitfield =            0x00020000
  val GL_TEXTURE_BIT: GLbitfield =         0x00040000
  val GL_SCISSOR_BIT: GLbitfield =         0x00080000
  val GL_ALL_ATTRIB_BITS: GLbitfield =     0x000FFFFF

  /* OpenGL 1.1 */
  val GL_PROXY_TEXTURE_1D: UShort = 0x8063.toUShort
  val GL_PROXY_TEXTURE_2D: UShort = 0x8064.toUShort
  val GL_TEXTURE_PRIORITY: UShort = 0x8066.toUShort
  val GL_TEXTURE_RESIDENT: UShort = 0x8067.toUShort
  val GL_TEXTURE_BINDING_1D: UShort = 0x8068.toUShort
  val GL_TEXTURE_BINDING_2D: UShort = 0x8069.toUShort
  val GL_TEXTURE_INTERNAL_FORMAT: UShort = 0x1003.toUShort
  val GL_ALPHA4: UShort = 0x803B.toUShort
  val GL_ALPHA8: UShort = 0x803C.toUShort
  val GL_ALPHA12: UShort = 0x803D.toUShort
  val GL_ALPHA16: UShort = 0x803E.toUShort
  val GL_LUMINANCE4: UShort = 0x803F.toUShort
  val GL_LUMINANCE8: UShort = 0x8040.toUShort
  val GL_LUMINANCE12: UShort = 0x8041.toUShort
  val GL_LUMINANCE16: UShort = 0x8042.toUShort
  val GL_LUMINANCE4_ALPHA4: UShort = 0x8043.toUShort
  val GL_LUMINANCE6_ALPHA2: UShort = 0x8044.toUShort
  val GL_LUMINANCE8_ALPHA8: UShort = 0x8045.toUShort
  val GL_LUMINANCE12_ALPHA4: UShort = 0x8046.toUShort
  val GL_LUMINANCE12_ALPHA12: UShort = 0x8047.toUShort
  val GL_LUMINANCE16_ALPHA16: UShort = 0x8048.toUShort
  val GL_INTENSITY: UShort = 0x8049.toUShort
  val GL_INTENSITY4: UShort = 0x804A.toUShort
  val GL_INTENSITY8: UShort = 0x804B.toUShort
  val GL_INTENSITY12: UShort = 0x804C.toUShort
  val GL_INTENSITY16: UShort = 0x804D.toUShort
  val GL_R3_G3_B2: UShort = 0x2A10.toUShort
  val GL_RGB4: UShort = 0x804F.toUShort
  val GL_RGB5: UShort = 0x8050.toUShort
  val GL_RGB8: UShort = 0x8051.toUShort
  val GL_RGB10: UShort = 0x8052.toUShort
  val GL_RGB12: UShort = 0x8053.toUShort
  val GL_RGB16: UShort = 0x8054.toUShort
  val GL_RGBA2: UShort = 0x8055.toUShort
  val GL_RGBA4: UShort = 0x8056.toUShort
  val GL_RGB5_A1: UShort = 0x8057.toUShort
  val GL_RGBA8: UShort = 0x8058.toUShort
  val GL_RGB10_A2: UShort = 0x8059.toUShort
  val GL_RGBA12: UShort = 0x805A.toUShort
  val GL_RGBA16: UShort = 0x805B.toUShort
  val GL_CLIENT_PIXEL_STORE_BIT: UInt = 0x00000001.toUInt
  val GL_CLIENT_VERTEX_ARRAY_BIT: UInt = 0x00000002.toUInt
  val GL_ALL_CLIENT_ATTRIB_BITS: UInt = 0xFFFFFFFF.toUInt
  val GL_CLIENT_ALL_ATTRIB_BITS: UInt = 0xFFFFFFFF.toUInt

  /*
   * OpenGL 1.2
   */
  val GL_RESCALE_NORMAL: UShort = 0x803A.toUShort
  val GL_CLAMP_TO_EDGE: UShort = 0x812F.toUShort
  val GL_MAX_ELEMENTS_VERTICES: UShort = 0x80E8.toUShort
  val GL_MAX_ELEMENTS_INDICES: UShort = 0x80E9.toUShort
  val GL_BGR: UShort = 0x80E0.toUShort
  val GL_BGRA: UShort = 0x80E1.toUShort
  val GL_UNSIGNED_BYTE_3_3_2: UShort = 0x8032.toUShort
  val GL_UNSIGNED_BYTE_2_3_3_REV: UShort = 0x8362.toUShort
  val GL_UNSIGNED_SHORT_5_6_5: UShort = 0x8363.toUShort
  val GL_UNSIGNED_SHORT_5_6_5_REV: UShort = 0x8364.toUShort
  val GL_UNSIGNED_SHORT_4_4_4_4: UShort = 0x8033.toUShort
  val GL_UNSIGNED_SHORT_4_4_4_4_REV: UShort = 0x8365.toUShort
  val GL_UNSIGNED_SHORT_5_5_5_1: UShort = 0x8034.toUShort
  val GL_UNSIGNED_SHORT_1_5_5_5_REV: UShort = 0x8366.toUShort
  val GL_UNSIGNED_INT_8_8_8_8: UShort = 0x8035.toUShort
  val GL_UNSIGNED_INT_8_8_8_8_REV: UShort = 0x8367.toUShort
  val GL_UNSIGNED_INT_10_10_10_2: UShort = 0x8036.toUShort
  val GL_UNSIGNED_INT_2_10_10_10_REV: UShort = 0x8368.toUShort
  val GL_LIGHT_MODEL_COLOR_CONTROL: UShort = 0x81F8.toUShort
  val GL_SINGLE_COLOR: UShort = 0x81F9.toUShort
  val GL_SEPARATE_SPECULAR_COLOR: UShort = 0x81FA.toUShort
  val GL_TEXTURE_MIN_LOD: UShort = 0x813A.toUShort
  val GL_TEXTURE_MAX_LOD: UShort = 0x813B.toUShort
  val GL_TEXTURE_BASE_LEVEL: UShort = 0x813C.toUShort
  val GL_TEXTURE_MAX_LEVEL: UShort = 0x813D.toUShort
  val GL_SMOOTH_POINT_SIZE_RANGE: UShort = 0x0B12.toUShort
  val GL_SMOOTH_POINT_SIZE_GRANULARITY: UShort = 0x0B13.toUShort
  val GL_SMOOTH_LINE_WIDTH_RANGE: UShort = 0x0B22.toUShort
  val GL_SMOOTH_LINE_WIDTH_GRANULARITY: UShort = 0x0B23.toUShort
  val GL_ALIASED_POINT_SIZE_RANGE: UShort = 0x846D.toUShort
  val GL_ALIASED_LINE_WIDTH_RANGE: UShort = 0x846E.toUShort
  val GL_PACK_SKIP_IMAGES: UShort = 0x806B.toUShort
  val GL_PACK_IMAGE_HEIGHT: UShort = 0x806C.toUShort
  val GL_UNPACK_SKIP_IMAGES: UShort = 0x806D.toUShort
  val GL_UNPACK_IMAGE_HEIGHT: UShort = 0x806E.toUShort
  val GL_TEXTURE_3D: UShort = 0x806F.toUShort
  val GL_PROXY_TEXTURE_3D: UShort = 0x8070.toUShort
  val GL_TEXTURE_DEPTH: UShort = 0x8071.toUShort
  val GL_TEXTURE_WRAP_R: UShort = 0x8072.toUShort
  val GL_MAX_3D_TEXTURE_SIZE: UShort = 0x8073.toUShort
  val GL_TEXTURE_BINDING_3D: UShort = 0x806A.toUShort

  /*
   * GL_ARB_imaging
   */
  val GL_CONSTANT_COLOR: UShort = 0x8001.toUShort
  val GL_ONE_MINUS_CONSTANT_COLOR: UShort = 0x8002.toUShort
  val GL_CONSTANT_ALPHA: UShort = 0x8003.toUShort
  val GL_ONE_MINUS_CONSTANT_ALPHA: UShort = 0x8004.toUShort
  val GL_COLOR_TABLE: UShort = 0x80D0.toUShort
  val GL_POST_CONVOLUTION_COLOR_TABLE: UShort = 0x80D1.toUShort
  val GL_POST_COLOR_MATRIX_COLOR_TABLE: UShort = 0x80D2.toUShort
  val GL_PROXY_COLOR_TABLE: UShort = 0x80D3.toUShort
  val GL_PROXY_POST_CONVOLUTION_COLOR_TABLE: UShort = 0x80D4.toUShort
  val GL_PROXY_POST_COLOR_MATRIX_COLOR_TABLE: UShort = 0x80D5.toUShort
  val GL_COLOR_TABLE_SCALE: UShort = 0x80D6.toUShort
  val GL_COLOR_TABLE_BIAS: UShort = 0x80D7.toUShort
  val GL_COLOR_TABLE_FORMAT: UShort = 0x80D8.toUShort
  val GL_COLOR_TABLE_WIDTH: UShort = 0x80D9.toUShort
  val GL_COLOR_TABLE_RED_SIZE: UShort = 0x80DA.toUShort
  val GL_COLOR_TABLE_GREEN_SIZE: UShort = 0x80DB.toUShort
  val GL_COLOR_TABLE_BLUE_SIZE: UShort = 0x80DC.toUShort
  val GL_COLOR_TABLE_ALPHA_SIZE: UShort = 0x80DD.toUShort
  val GL_COLOR_TABLE_LUMINANCE_SIZE: UShort = 0x80DE.toUShort
  val GL_COLOR_TABLE_INTENSITY_SIZE: UShort = 0x80DF.toUShort
  val GL_CONVOLUTION_1D: UShort = 0x8010.toUShort
  val GL_CONVOLUTION_2D: UShort = 0x8011.toUShort
  val GL_SEPARABLE_2D: UShort = 0x8012.toUShort
  val GL_CONVOLUTION_BORDER_MODE: UShort = 0x8013.toUShort
  val GL_CONVOLUTION_FILTER_SCALE: UShort = 0x8014.toUShort
  val GL_CONVOLUTION_FILTER_BIAS: UShort = 0x8015.toUShort
  val GL_REDUCE: UShort = 0x8016.toUShort
  val GL_CONVOLUTION_FORMAT: UShort = 0x8017.toUShort
  val GL_CONVOLUTION_WIDTH: UShort = 0x8018.toUShort
  val GL_CONVOLUTION_HEIGHT: UShort = 0x8019.toUShort
  val GL_MAX_CONVOLUTION_WIDTH: UShort = 0x801A.toUShort
  val GL_MAX_CONVOLUTION_HEIGHT: UShort = 0x801B.toUShort
  val GL_POST_CONVOLUTION_RED_SCALE: UShort = 0x801C.toUShort
  val GL_POST_CONVOLUTION_GREEN_SCALE: UShort = 0x801D.toUShort
  val GL_POST_CONVOLUTION_BLUE_SCALE: UShort = 0x801E.toUShort
  val GL_POST_CONVOLUTION_ALPHA_SCALE: UShort = 0x801F.toUShort
  val GL_POST_CONVOLUTION_RED_BIAS: UShort = 0x8020.toUShort
  val GL_POST_CONVOLUTION_GREEN_BIAS: UShort = 0x8021.toUShort
  val GL_POST_CONVOLUTION_BLUE_BIAS: UShort = 0x8022.toUShort
  val GL_POST_CONVOLUTION_ALPHA_BIAS: UShort = 0x8023.toUShort
  val GL_CONSTANT_BORDER: UShort = 0x8151.toUShort
  val GL_REPLICATE_BORDER: UShort = 0x8153.toUShort
  val GL_CONVOLUTION_BORDER_COLOR: UShort = 0x8154.toUShort
  val GL_COLOR_MATRIX: UShort = 0x80B1.toUShort
  val GL_COLOR_MATRIX_STACK_DEPTH: UShort = 0x80B2.toUShort
  val GL_MAX_COLOR_MATRIX_STACK_DEPTH: UShort = 0x80B3.toUShort
  val GL_POST_COLOR_MATRIX_RED_SCALE: UShort = 0x80B4.toUShort
  val GL_POST_COLOR_MATRIX_GREEN_SCALE: UShort = 0x80B5.toUShort
  val GL_POST_COLOR_MATRIX_BLUE_SCALE: UShort = 0x80B6.toUShort
  val GL_POST_COLOR_MATRIX_ALPHA_SCALE: UShort = 0x80B7.toUShort
  val GL_POST_COLOR_MATRIX_RED_BIAS: UShort = 0x80B8.toUShort
  val GL_POST_COLOR_MATRIX_GREEN_BIAS: UShort = 0x80B9.toUShort
  val GL_POST_COLOR_MATRIX_BLUE_BIAS: UShort = 0x80BA.toUShort
  val GL_POST_COLOR_MATRIX_ALPHA_BIAS: UShort = 0x80BB.toUShort
  val GL_HISTOGRAM: UShort = 0x8024.toUShort
  val GL_PROXY_HISTOGRAM: UShort = 0x8025.toUShort
  val GL_HISTOGRAM_WIDTH: UShort = 0x8026.toUShort
  val GL_HISTOGRAM_FORMAT: UShort = 0x8027.toUShort
  val GL_HISTOGRAM_RED_SIZE: UShort = 0x8028.toUShort
  val GL_HISTOGRAM_GREEN_SIZE: UShort = 0x8029.toUShort
  val GL_HISTOGRAM_BLUE_SIZE: UShort = 0x802A.toUShort
  val GL_HISTOGRAM_ALPHA_SIZE: UShort = 0x802B.toUShort
  val GL_HISTOGRAM_LUMINANCE_SIZE: UShort = 0x802C.toUShort
  val GL_HISTOGRAM_SINK: UShort = 0x802D.toUShort
  val GL_MINMAX: UShort = 0x802E.toUShort
  val GL_MINMAX_FORMAT: UShort = 0x802F.toUShort
  val GL_MINMAX_SINK: UShort = 0x8030.toUShort
  val GL_TABLE_TOO_LARGE: UShort = 0x8031.toUShort
  val GL_BLEND_EQUATION: UShort = 0x8009.toUShort
  val GL_MIN: UShort = 0x8007.toUShort
  val GL_MAX: UShort = 0x8008.toUShort
  val GL_FUNC_ADD: UShort = 0x8006.toUShort
  val GL_FUNC_SUBTRACT: UShort = 0x800A.toUShort
  val GL_FUNC_REVERSE_SUBTRACT: UShort = 0x800B.toUShort
  val GL_BLEND_COLOR: UShort = 0x8005.toUShort

  /*
   * OpenGL 1.3
   */

  /* multitexture */
  val GL_TEXTURE0: UShort = 0x84C0.toUShort
  val GL_TEXTURE1: UShort = 0x84C1.toUShort
  val GL_TEXTURE2: UShort = 0x84C2.toUShort
  val GL_TEXTURE3: UShort = 0x84C3.toUShort
  val GL_TEXTURE4: UShort = 0x84C4.toUShort
  val GL_TEXTURE5: UShort = 0x84C5.toUShort
  val GL_TEXTURE6: UShort = 0x84C6.toUShort
  val GL_TEXTURE7: UShort = 0x84C7.toUShort
  val GL_TEXTURE8: UShort = 0x84C8.toUShort
  val GL_TEXTURE9: UShort = 0x84C9.toUShort
  val GL_TEXTURE10: UShort = 0x84CA.toUShort
  val GL_TEXTURE11: UShort = 0x84CB.toUShort
  val GL_TEXTURE12: UShort = 0x84CC.toUShort
  val GL_TEXTURE13: UShort = 0x84CD.toUShort
  val GL_TEXTURE14: UShort = 0x84CE.toUShort
  val GL_TEXTURE15: UShort = 0x84CF.toUShort
  val GL_TEXTURE16: UShort = 0x84D0.toUShort
  val GL_TEXTURE17: UShort = 0x84D1.toUShort
  val GL_TEXTURE18: UShort = 0x84D2.toUShort
  val GL_TEXTURE19: UShort = 0x84D3.toUShort
  val GL_TEXTURE20: UShort = 0x84D4.toUShort
  val GL_TEXTURE21: UShort = 0x84D5.toUShort
  val GL_TEXTURE22: UShort = 0x84D6.toUShort
  val GL_TEXTURE23: UShort = 0x84D7.toUShort
  val GL_TEXTURE24: UShort = 0x84D8.toUShort
  val GL_TEXTURE25: UShort = 0x84D9.toUShort
  val GL_TEXTURE26: UShort = 0x84DA.toUShort
  val GL_TEXTURE27: UShort = 0x84DB.toUShort
  val GL_TEXTURE28: UShort = 0x84DC.toUShort
  val GL_TEXTURE29: UShort = 0x84DD.toUShort
  val GL_TEXTURE30: UShort = 0x84DE.toUShort
  val GL_TEXTURE31: UShort = 0x84DF.toUShort
  val GL_ACTIVE_TEXTURE: UShort = 0x84E0.toUShort
  val GL_CLIENT_ACTIVE_TEXTURE: UShort = 0x84E1.toUShort
  val GL_MAX_TEXTURE_UNITS: UShort = 0x84E2.toUShort
  /* texture_cube_map */
  val GL_NORMAL_MAP: UShort = 0x8511.toUShort
  val GL_REFLECTION_MAP: UShort = 0x8512.toUShort
  val GL_TEXTURE_CUBE_MAP: UShort = 0x8513.toUShort
  val GL_TEXTURE_BINDING_CUBE_MAP: UShort = 0x8514.toUShort
  val GL_TEXTURE_CUBE_MAP_POSITIVE_X: UShort = 0x8515.toUShort
  val GL_TEXTURE_CUBE_MAP_NEGATIVE_X: UShort = 0x8516.toUShort
  val GL_TEXTURE_CUBE_MAP_POSITIVE_Y: UShort = 0x8517.toUShort
  val GL_TEXTURE_CUBE_MAP_NEGATIVE_Y: UShort = 0x8518.toUShort
  val GL_TEXTURE_CUBE_MAP_POSITIVE_Z: UShort = 0x8519.toUShort
  val GL_TEXTURE_CUBE_MAP_NEGATIVE_Z: UShort = 0x851A.toUShort
  val GL_PROXY_TEXTURE_CUBE_MAP: UShort = 0x851B.toUShort
  val GL_MAX_CUBE_MAP_TEXTURE_SIZE: UShort = 0x851C.toUShort
  /* texture_compression */
  val GL_COMPRESSED_ALPHA: UShort = 0x84E9.toUShort
  val GL_COMPRESSED_LUMINANCE: UShort = 0x84EA.toUShort
  val GL_COMPRESSED_LUMINANCE_ALPHA: UShort = 0x84EB.toUShort
  val GL_COMPRESSED_INTENSITY: UShort = 0x84EC.toUShort
  val GL_COMPRESSED_RGB: UShort = 0x84ED.toUShort
  val GL_COMPRESSED_RGBA: UShort = 0x84EE.toUShort
  val GL_TEXTURE_COMPRESSION_HINT: UShort = 0x84EF.toUShort
  val GL_TEXTURE_COMPRESSED_IMAGE_SIZE: UShort = 0x86A0.toUShort
  val GL_TEXTURE_COMPRESSED: UShort = 0x86A1.toUShort
  val GL_NUM_COMPRESSED_TEXTURE_FORMATS: UShort = 0x86A2.toUShort
  val GL_COMPRESSED_TEXTURE_FORMATS: UShort = 0x86A3.toUShort
  /* multisample */
  val GL_MULTISAMPLE: UShort = 0x809D.toUShort
  val GL_SAMPLE_ALPHA_TO_COVERAGE: UShort = 0x809E.toUShort
  val GL_SAMPLE_ALPHA_TO_ONE: UShort = 0x809F.toUShort
  val GL_SAMPLE_COVERAGE: UShort = 0x80A0.toUShort
  val GL_SAMPLE_BUFFERS: UShort = 0x80A8.toUShort
  val GL_SAMPLES: UShort = 0x80A9.toUShort
  val GL_SAMPLE_COVERAGE_VALUE: UShort = 0x80AA.toUShort
  val GL_SAMPLE_COVERAGE_INVERT: UShort = 0x80AB.toUShort
  val GL_MULTISAMPLE_BIT: UInt = 0x20000000.toUInt
  /* transpose_matrix */
  val GL_TRANSPOSE_MODELVIEW_MATRIX: UShort = 0x84E3.toUShort
  val GL_TRANSPOSE_PROJECTION_MATRIX: UShort = 0x84E4.toUShort
  val GL_TRANSPOSE_TEXTURE_MATRIX: UShort = 0x84E5.toUShort
  val GL_TRANSPOSE_COLOR_MATRIX: UShort = 0x84E6.toUShort
  /* texture_env_combine */
  val GL_COMBINE: UShort = 0x8570.toUShort
  val GL_COMBINE_RGB: UShort = 0x8571.toUShort
  val GL_COMBINE_ALPHA: UShort = 0x8572.toUShort
  val GL_SOURCE0_RGB: UShort = 0x8580.toUShort
  val GL_SOURCE1_RGB: UShort = 0x8581.toUShort
  val GL_SOURCE2_RGB: UShort = 0x8582.toUShort
  val GL_SOURCE0_ALPHA: UShort = 0x8588.toUShort
  val GL_SOURCE1_ALPHA: UShort = 0x8589.toUShort
  val GL_SOURCE2_ALPHA: UShort = 0x858A.toUShort
  val GL_OPERAND0_RGB: UShort = 0x8590.toUShort
  val GL_OPERAND1_RGB: UShort = 0x8591.toUShort
  val GL_OPERAND2_RGB: UShort = 0x8592.toUShort
  val GL_OPERAND0_ALPHA: UShort = 0x8598.toUShort
  val GL_OPERAND1_ALPHA: UShort = 0x8599.toUShort
  val GL_OPERAND2_ALPHA: UShort = 0x859A.toUShort
  val GL_RGB_SCALE: UShort = 0x8573.toUShort
  val GL_ADD_SIGNED: UShort = 0x8574.toUShort
  val GL_INTERPOLATE: UShort = 0x8575.toUShort
  val GL_SUBTRACT: UShort = 0x84E7.toUShort
  val GL_CONSTANT: UShort = 0x8576.toUShort
  val GL_PRIMARY_COLOR: UShort = 0x8577.toUShort
  val GL_PREVIOUS: UShort = 0x8578.toUShort
  /* texture_env_dot3 */
  val GL_DOT3_RGB: UShort = 0x86AE.toUShort
  val GL_DOT3_RGBA: UShort = 0x86AF.toUShort
  /* texture_border_clamp */
  val GL_CLAMP_TO_BORDER: UShort = 0x812D.toUShort

  /*
   * OpenGL 1.2.1 ARB extension
   */
  val GL_TEXTURE0_ARB: UShort = 0x84C0.toUShort
  val GL_TEXTURE1_ARB: UShort = 0x84C1.toUShort
  val GL_TEXTURE2_ARB: UShort = 0x84C2.toUShort
  val GL_TEXTURE3_ARB: UShort = 0x84C3.toUShort
  val GL_TEXTURE4_ARB: UShort = 0x84C4.toUShort
  val GL_TEXTURE5_ARB: UShort = 0x84C5.toUShort
  val GL_TEXTURE6_ARB: UShort = 0x84C6.toUShort
  val GL_TEXTURE7_ARB: UShort = 0x84C7.toUShort
  val GL_TEXTURE8_ARB: UShort = 0x84C8.toUShort
  val GL_TEXTURE9_ARB: UShort = 0x84C9.toUShort
  val GL_TEXTURE10_ARB: UShort = 0x84CA.toUShort
  val GL_TEXTURE11_ARB: UShort = 0x84CB.toUShort
  val GL_TEXTURE12_ARB: UShort = 0x84CC.toUShort
  val GL_TEXTURE13_ARB: UShort = 0x84CD.toUShort
  val GL_TEXTURE14_ARB: UShort = 0x84CE.toUShort
  val GL_TEXTURE15_ARB: UShort = 0x84CF.toUShort
  val GL_TEXTURE16_ARB: UShort = 0x84D0.toUShort
  val GL_TEXTURE17_ARB: UShort = 0x84D1.toUShort
  val GL_TEXTURE18_ARB: UShort = 0x84D2.toUShort
  val GL_TEXTURE19_ARB: UShort = 0x84D3.toUShort
  val GL_TEXTURE20_ARB: UShort = 0x84D4.toUShort
  val GL_TEXTURE21_ARB: UShort = 0x84D5.toUShort
  val GL_TEXTURE22_ARB: UShort = 0x84D6.toUShort
  val GL_TEXTURE23_ARB: UShort = 0x84D7.toUShort
  val GL_TEXTURE24_ARB: UShort = 0x84D8.toUShort
  val GL_TEXTURE25_ARB: UShort = 0x84D9.toUShort
  val GL_TEXTURE26_ARB: UShort = 0x84DA.toUShort
  val GL_TEXTURE27_ARB: UShort = 0x84DB.toUShort
  val GL_TEXTURE28_ARB: UShort = 0x84DC.toUShort
  val GL_TEXTURE29_ARB: UShort = 0x84DD.toUShort
  val GL_TEXTURE30_ARB: UShort = 0x84DE.toUShort
  val GL_TEXTURE31_ARB: UShort = 0x84DF.toUShort
  val GL_ACTIVE_TEXTURE_ARB: UShort = 0x84E0.toUShort
  val GL_CLIENT_ACTIVE_TEXTURE_ARB: UShort = 0x84E1.toUShort
  val GL_MAX_TEXTURE_UNITS_ARB: UShort = 0x84E2.toUShort

  /*
   * OpenGL 1.4
   */
  val GL_BLEND_DST_RGB: UShort = 0x80C8.toUShort
  val GL_BLEND_SRC_RGB: UShort = 0x80C9.toUShort
  val GL_BLEND_DST_ALPHA: UShort = 0x80CA.toUShort
  val GL_BLEND_SRC_ALPHA: UShort = 0x80CB.toUShort
  val GL_POINT_FADE_THRESHOLD_SIZE: UShort = 0x8128.toUShort
  val GL_DEPTH_COMPONENT16: UShort = 0x81A5.toUShort
  val GL_DEPTH_COMPONENT24: UShort = 0x81A6.toUShort
  val GL_DEPTH_COMPONENT32: UShort = 0x81A7.toUShort
  val GL_MIRRORED_REPEAT: UShort = 0x8370.toUShort
  val GL_MAX_TEXTURE_LOD_BIAS: UShort = 0x84FD.toUShort
  val GL_TEXTURE_LOD_BIAS: UShort = 0x8501.toUShort
  val GL_INCR_WRAP: UShort = 0x8507.toUShort
  val GL_DECR_WRAP: UShort = 0x8508.toUShort
  val GL_TEXTURE_DEPTH_SIZE: UShort = 0x884A.toUShort
  val GL_TEXTURE_COMPARE_MODE: UShort = 0x884C.toUShort
  val GL_TEXTURE_COMPARE_FUNC: UShort = 0x884D.toUShort
  val GL_POINT_SIZE_MIN: UShort = 0x8126.toUShort
  val GL_POINT_SIZE_MAX: UShort = 0x8127.toUShort
  val GL_POINT_DISTANCE_ATTENUATION: UShort = 0x8129.toUShort
  val GL_GENERATE_MIPMAP: UShort = 0x8191.toUShort
  val GL_GENERATE_MIPMAP_HINT: UShort = 0x8192.toUShort
  val GL_FOG_COORDINATE_SOURCE: UShort = 0x8450.toUShort
  val GL_FOG_COORDINATE: UShort = 0x8451.toUShort
  val GL_FRAGMENT_DEPTH: UShort = 0x8452.toUShort
  val GL_CURRENT_FOG_COORDINATE: UShort = 0x8453.toUShort
  val GL_FOG_COORDINATE_ARRAY_TYPE: UShort = 0x8454.toUShort
  val GL_FOG_COORDINATE_ARRAY_STRIDE: UShort = 0x8455.toUShort
  val GL_FOG_COORDINATE_ARRAY_POINTER: UShort = 0x8456.toUShort
  val GL_FOG_COORDINATE_ARRAY: UShort = 0x8457.toUShort
  val GL_COLOR_SUM: UShort = 0x8458.toUShort
  val GL_CURRENT_SECONDARY_COLOR: UShort = 0x8459.toUShort
  val GL_SECONDARY_COLOR_ARRAY_SIZE: UShort = 0x845A.toUShort
  val GL_SECONDARY_COLOR_ARRAY_TYPE: UShort = 0x845B.toUShort
  val GL_SECONDARY_COLOR_ARRAY_STRIDE: UShort = 0x845C.toUShort
  val GL_SECONDARY_COLOR_ARRAY_POINTER: UShort = 0x845D.toUShort
  val GL_SECONDARY_COLOR_ARRAY: UShort = 0x845E.toUShort
  val GL_TEXTURE_FILTER_CONTROL: UShort = 0x8500.toUShort
  val GL_DEPTH_TEXTURE_MODE: UShort = 0x884B.toUShort
  val GL_COMPARE_R_TO_TEXTURE: UShort = 0x884E.toUShort

  /*
   * OpenGL 1.5
   */
  val GL_BUFFER_SIZE: UShort = 0x8764.toUShort
  val GL_BUFFER_USAGE: UShort = 0x8765.toUShort
  val GL_QUERY_COUNTER_BITS: UShort = 0x8864.toUShort
  val GL_CURRENT_QUERY: UShort = 0x8865.toUShort
  val GL_QUERY_RESULT: UShort = 0x8866.toUShort
  val GL_QUERY_RESULT_AVAILABLE: UShort = 0x8867.toUShort
  val GL_ARRAY_BUFFER: UShort = 0x8892.toUShort
  val GL_ELEMENT_ARRAY_BUFFER: UShort = 0x8893.toUShort
  val GL_ARRAY_BUFFER_BINDING: UShort = 0x8894.toUShort
  val GL_ELEMENT_ARRAY_BUFFER_BINDING: UShort = 0x8895.toUShort
  val GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING: UShort = 0x889F.toUShort
  val GL_READ_ONLY: UShort = 0x88B8.toUShort
  val GL_WRITE_ONLY: UShort = 0x88B9.toUShort
  val GL_READ_WRITE: UShort = 0x88BA.toUShort
  val GL_BUFFER_ACCESS: UShort = 0x88BB.toUShort
  val GL_BUFFER_MAPPED: UShort = 0x88BC.toUShort
  val GL_BUFFER_MAP_POINTER: UShort = 0x88BD.toUShort
  val GL_STREAM_DRAW: UShort = 0x88E0.toUShort
  val GL_STREAM_READ: UShort = 0x88E1.toUShort
  val GL_STREAM_COPY: UShort = 0x88E2.toUShort
  val GL_STATIC_DRAW: UShort = 0x88E4.toUShort
  val GL_STATIC_READ: UShort = 0x88E5.toUShort
  val GL_STATIC_COPY: UShort = 0x88E6.toUShort
  val GL_DYNAMIC_DRAW: UShort = 0x88E8.toUShort
  val GL_DYNAMIC_READ: UShort = 0x88E9.toUShort
  val GL_DYNAMIC_COPY: UShort = 0x88EA.toUShort
  val GL_SAMPLES_PASSED: UShort = 0x8914.toUShort
  val GL_SRC1_ALPHA: UShort = 0x8589.toUShort
  val GL_VERTEX_ARRAY_BUFFER_BINDING: UShort = 0x8896.toUShort
  val GL_NORMAL_ARRAY_BUFFER_BINDING: UShort = 0x8897.toUShort
  val GL_COLOR_ARRAY_BUFFER_BINDING: UShort = 0x8898.toUShort
  val GL_INDEX_ARRAY_BUFFER_BINDING: UShort = 0x8899.toUShort
  val GL_TEXTURE_COORD_ARRAY_BUFFER_BINDING: UShort = 0x889A.toUShort
  val GL_EDGE_FLAG_ARRAY_BUFFER_BINDING: UShort = 0x889B.toUShort
  val GL_SECONDARY_COLOR_ARRAY_BUFFER_BINDING: UShort = 0x889C.toUShort
  val GL_FOG_COORDINATE_ARRAY_BUFFER_BINDING: UShort = 0x889D.toUShort
  val GL_WEIGHT_ARRAY_BUFFER_BINDING: UShort = 0x889E.toUShort
  val GL_FOG_COORD_SRC: UShort = 0x8450.toUShort
  val GL_FOG_COORD: UShort = 0x8451.toUShort
  val GL_CURRENT_FOG_COORD: UShort = 0x8453.toUShort
  val GL_FOG_COORD_ARRAY_TYPE: UShort = 0x8454.toUShort
  val GL_FOG_COORD_ARRAY_STRIDE: UShort = 0x8455.toUShort
  val GL_FOG_COORD_ARRAY_POINTER: UShort = 0x8456.toUShort
  val GL_FOG_COORD_ARRAY: UShort = 0x8457.toUShort
  val GL_FOG_COORD_ARRAY_BUFFER_BINDING: UShort = 0x889D.toUShort
  val GL_SRC0_RGB: UShort = 0x8580.toUShort
  val GL_SRC1_RGB: UShort = 0x8581.toUShort
  val GL_SRC2_RGB: UShort = 0x8582.toUShort
  val GL_SRC0_ALPHA: UShort = 0x8588.toUShort
  val GL_SRC2_ALPHA: UShort = 0x858A.toUShort
  /*
   * End OpenGL 1.5
   */

  /*
   * OpenGL 2.0
   */
  val GL_BLEND_EQUATION_RGB: UShort = 0x8009.toUShort
  val GL_VERTEX_ATTRIB_ARRAY_ENABLED: UShort = 0x8622.toUShort
  val GL_VERTEX_ATTRIB_ARRAY_SIZE: UShort = 0x8623.toUShort
  val GL_VERTEX_ATTRIB_ARRAY_STRIDE: UShort = 0x8624.toUShort
  val GL_VERTEX_ATTRIB_ARRAY_TYPE: UShort = 0x8625.toUShort
  val GL_CURRENT_VERTEX_ATTRIB: UShort = 0x8626.toUShort
  val GL_VERTEX_PROGRAM_POINT_SIZE: UShort = 0x8642.toUShort
  val GL_VERTEX_ATTRIB_ARRAY_POINTER: UShort = 0x8645.toUShort
  val GL_STENCIL_BACK_FUNC: UShort = 0x8800.toUShort
  val GL_STENCIL_BACK_FAIL: UShort = 0x8801.toUShort
  val GL_STENCIL_BACK_PASS_DEPTH_FAIL: UShort = 0x8802.toUShort
  val GL_STENCIL_BACK_PASS_DEPTH_PASS: UShort = 0x8803.toUShort
  val GL_MAX_DRAW_BUFFERS: UShort = 0x8824.toUShort
  val GL_DRAW_BUFFER0: UShort = 0x8825.toUShort
  val GL_DRAW_BUFFER1: UShort = 0x8826.toUShort
  val GL_DRAW_BUFFER2: UShort = 0x8827.toUShort
  val GL_DRAW_BUFFER3: UShort = 0x8828.toUShort
  val GL_DRAW_BUFFER4: UShort = 0x8829.toUShort
  val GL_DRAW_BUFFER5: UShort = 0x882A.toUShort
  val GL_DRAW_BUFFER6: UShort = 0x882B.toUShort
  val GL_DRAW_BUFFER7: UShort = 0x882C.toUShort
  val GL_DRAW_BUFFER8: UShort = 0x882D.toUShort
  val GL_DRAW_BUFFER9: UShort = 0x882E.toUShort
  val GL_DRAW_BUFFER10: UShort = 0x882F.toUShort
  val GL_DRAW_BUFFER11: UShort = 0x8830.toUShort
  val GL_DRAW_BUFFER12: UShort = 0x8831.toUShort
  val GL_DRAW_BUFFER13: UShort = 0x8832.toUShort
  val GL_DRAW_BUFFER14: UShort = 0x8833.toUShort
  val GL_DRAW_BUFFER15: UShort = 0x8834.toUShort
  val GL_BLEND_EQUATION_ALPHA: UShort = 0x883D.toUShort
  val GL_MAX_VERTEX_ATTRIBS: UShort = 0x8869.toUShort
  val GL_VERTEX_ATTRIB_ARRAY_NORMALIZED: UShort = 0x886A.toUShort
  val GL_MAX_TEXTURE_IMAGE_UNITS: UShort = 0x8872.toUShort
  val GL_FRAGMENT_SHADER: UShort = 0x8B30.toUShort
  val GL_VERTEX_SHADER: UShort = 0x8B31.toUShort
  val GL_MAX_FRAGMENT_UNIFORM_COMPONENTS: UShort = 0x8B49.toUShort
  val GL_MAX_VERTEX_UNIFORM_COMPONENTS: UShort = 0x8B4A.toUShort
  val GL_MAX_VARYING_FLOATS: UShort = 0x8B4B.toUShort
  val GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS: UShort = 0x8B4C.toUShort
  val GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS: UShort = 0x8B4D.toUShort
  val GL_SHADER_TYPE: UShort = 0x8B4F.toUShort
  val GL_FLOAT_VEC2: UShort = 0x8B50.toUShort
  val GL_FLOAT_VEC3: UShort = 0x8B51.toUShort
  val GL_FLOAT_VEC4: UShort = 0x8B52.toUShort
  val GL_INT_VEC2: UShort = 0x8B53.toUShort
  val GL_INT_VEC3: UShort = 0x8B54.toUShort
  val GL_INT_VEC4: UShort = 0x8B55.toUShort
  val GL_BOOL: UShort = 0x8B56.toUShort
  val GL_BOOL_VEC2: UShort = 0x8B57.toUShort
  val GL_BOOL_VEC3: UShort = 0x8B58.toUShort
  val GL_BOOL_VEC4: UShort = 0x8B59.toUShort
  val GL_FLOAT_MAT2: UShort = 0x8B5A.toUShort
  val GL_FLOAT_MAT3: UShort = 0x8B5B.toUShort
  val GL_FLOAT_MAT4: UShort = 0x8B5C.toUShort
  val GL_SAMPLER_1D: UShort = 0x8B5D.toUShort
  val GL_SAMPLER_2D: UShort = 0x8B5E.toUShort
  val GL_SAMPLER_3D: UShort = 0x8B5F.toUShort
  val GL_SAMPLER_CUBE: UShort = 0x8B60.toUShort
  val GL_SAMPLER_1D_SHADOW: UShort = 0x8B61.toUShort
  val GL_SAMPLER_2D_SHADOW: UShort = 0x8B62.toUShort
  val GL_DELETE_STATUS: UShort = 0x8B80.toUShort
  val GL_COMPILE_STATUS: UShort = 0x8B81.toUShort
  val GL_LINK_STATUS: UShort = 0x8B82.toUShort
  val GL_VALIDATE_STATUS: UShort = 0x8B83.toUShort
  val GL_INFO_LOG_LENGTH: UShort = 0x8B84.toUShort
  val GL_ATTACHED_SHADERS: UShort = 0x8B85.toUShort
  val GL_ACTIVE_UNIFORMS: UShort = 0x8B86.toUShort
  val GL_ACTIVE_UNIFORM_MAX_LENGTH: UShort = 0x8B87.toUShort
  val GL_SHADER_SOURCE_LENGTH: UShort = 0x8B88.toUShort
  val GL_ACTIVE_ATTRIBUTES: UShort = 0x8B89.toUShort
  val GL_ACTIVE_ATTRIBUTE_MAX_LENGTH: UShort = 0x8B8A.toUShort
  val GL_FRAGMENT_SHADER_DERIVATIVE_HINT: UShort = 0x8B8B.toUShort
  val GL_SHADING_LANGUAGE_VERSION: UShort = 0x8B8C.toUShort
  val GL_CURRENT_PROGRAM: UShort = 0x8B8D.toUShort
  val GL_POINT_SPRITE_COORD_ORIGIN: UShort = 0x8CA0.toUShort
  val GL_LOWER_LEFT: UShort = 0x8CA1.toUShort
  val GL_UPPER_LEFT: UShort = 0x8CA2.toUShort
  val GL_STENCIL_BACK_REF: UShort = 0x8CA3.toUShort
  val GL_STENCIL_BACK_VALUE_MASK: UShort = 0x8CA4.toUShort
  val GL_STENCIL_BACK_WRITEMASK: UShort = 0x8CA5.toUShort
  val GL_VERTEX_PROGRAM_TWO_SIDE: UShort = 0x8643.toUShort
  val GL_POINT_SPRITE: UShort = 0x8861.toUShort
  val GL_COORD_REPLACE: UShort = 0x8862.toUShort
  val GL_MAX_TEXTURE_COORDS: UShort = 0x8871.toUShort
  /*
   * End OpenGL 2.0
   */

  /*
   * OpenGL 2.1
   */
  val GL_PIXEL_PACK_BUFFER: UShort = 0x88EB.toUShort
  val GL_PIXEL_UNPACK_BUFFER: UShort = 0x88EC.toUShort
  val GL_PIXEL_PACK_BUFFER_BINDING: UShort = 0x88ED.toUShort
  val GL_PIXEL_UNPACK_BUFFER_BINDING: UShort = 0x88EF.toUShort
  val GL_FLOAT_MAT2x3: UShort = 0x8B65.toUShort
  val GL_FLOAT_MAT2x4: UShort = 0x8B66.toUShort
  val GL_FLOAT_MAT3x2: UShort = 0x8B67.toUShort
  val GL_FLOAT_MAT3x4: UShort = 0x8B68.toUShort
  val GL_FLOAT_MAT4x2: UShort = 0x8B69.toUShort
  val GL_FLOAT_MAT4x3: UShort = 0x8B6A.toUShort
  val GL_SRGB: UShort = 0x8C40.toUShort
  val GL_SRGB8: UShort = 0x8C41.toUShort
  val GL_SRGB_ALPHA: UShort = 0x8C42.toUShort
  val GL_SRGB8_ALPHA8: UShort = 0x8C43.toUShort
  val GL_COMPRESSED_SRGB: UShort = 0x8C48.toUShort
  val GL_COMPRESSED_SRGB_ALPHA: UShort = 0x8C49.toUShort
  val GL_CURRENT_RASTER_SECONDARY_COLOR: UShort = 0x845F.toUShort
  val GL_SLUMINANCE_ALPHA: UShort = 0x8C44.toUShort
  val GL_SLUMINANCE8_ALPHA8: UShort = 0x8C45.toUShort
  val GL_SLUMINANCE: UShort = 0x8C46.toUShort
  val GL_SLUMINANCE8: UShort = 0x8C47.toUShort
  val GL_COMPRESSED_SLUMINANCE: UShort = 0x8C4A.toUShort
  val GL_COMPRESSED_SLUMINANCE_ALPHA: UShort = 0x8C4B.toUShort
  /*
   * End OpenGL 2.1
   */

  /*
   * OpenGL 3.0
   */
  val GL_COMPARE_REF_TO_TEXTURE: UShort = 0x884E.toUShort
  val GL_CLIP_DISTANCE0: UShort = 0x3000.toUShort
  val GL_CLIP_DISTANCE1: UShort = 0x3001.toUShort
  val GL_CLIP_DISTANCE2: UShort = 0x3002.toUShort
  val GL_CLIP_DISTANCE3: UShort = 0x3003.toUShort
  val GL_CLIP_DISTANCE4: UShort = 0x3004.toUShort
  val GL_CLIP_DISTANCE5: UShort = 0x3005.toUShort
  val GL_CLIP_DISTANCE6: UShort = 0x3006.toUShort
  val GL_CLIP_DISTANCE7: UShort = 0x3007.toUShort
  val GL_MAX_CLIP_DISTANCES: UShort = 0x0D32.toUShort
  val GL_MAJOR_VERSION: UShort = 0x821B.toUShort
  val GL_MINOR_VERSION: UShort = 0x821C.toUShort
  val GL_NUM_EXTENSIONS: UShort = 0x821D.toUShort
  val GL_CONTEXT_FLAGS: UShort = 0x821E.toUShort
  val GL_COMPRESSED_RED: UShort = 0x8225.toUShort
  val GL_COMPRESSED_RG: UShort = 0x8226.toUShort
  val GL_CONTEXT_FLAG_FORWARD_COMPATIBLE_BIT: UInt = 0x00000001.toUInt
  val GL_RGBA32F: UShort = 0x8814.toUShort
  val GL_RGB32F: UShort = 0x8815.toUShort
  val GL_RGBA16F: UShort = 0x881A.toUShort
  val GL_RGB16F: UShort = 0x881B.toUShort
  val GL_VERTEX_ATTRIB_ARRAY_INTEGER: UShort = 0x88FD.toUShort
  val GL_MAX_ARRAY_TEXTURE_LAYERS: UShort = 0x88FF.toUShort
  val GL_MIN_PROGRAM_TEXEL_OFFSET: UShort = 0x8904.toUShort
  val GL_MAX_PROGRAM_TEXEL_OFFSET: UShort = 0x8905.toUShort
  val GL_CLAMP_READ_COLOR: UShort = 0x891C.toUShort
  val GL_FIXED_ONLY: UShort = 0x891D.toUShort
  val GL_MAX_VARYING_COMPONENTS: UShort = 0x8B4B.toUShort
  val GL_TEXTURE_1D_ARRAY: UShort = 0x8C18.toUShort
  val GL_PROXY_TEXTURE_1D_ARRAY: UShort = 0x8C19.toUShort
  val GL_TEXTURE_2D_ARRAY: UShort = 0x8C1A.toUShort
  val GL_PROXY_TEXTURE_2D_ARRAY: UShort = 0x8C1B.toUShort
  val GL_TEXTURE_BINDING_1D_ARRAY: UShort = 0x8C1C.toUShort
  val GL_TEXTURE_BINDING_2D_ARRAY: UShort = 0x8C1D.toUShort
  val GL_R11F_G11F_B10F: UShort = 0x8C3A.toUShort
  val GL_UNSIGNED_INT_10F_11F_11F_REV: UShort = 0x8C3B.toUShort
  val GL_RGB9_E5: UShort = 0x8C3D.toUShort
  val GL_UNSIGNED_INT_5_9_9_9_REV: UShort = 0x8C3E.toUShort
  val GL_TEXTURE_SHARED_SIZE: UShort = 0x8C3F.toUShort
  val GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH: UShort = 0x8C76.toUShort
  val GL_TRANSFORM_FEEDBACK_BUFFER_MODE: UShort = 0x8C7F.toUShort
  val GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS: UShort = 0x8C80.toUShort
  val GL_TRANSFORM_FEEDBACK_VARYINGS: UShort = 0x8C83.toUShort
  val GL_TRANSFORM_FEEDBACK_BUFFER_START: UShort = 0x8C84.toUShort
  val GL_TRANSFORM_FEEDBACK_BUFFER_SIZE: UShort = 0x8C85.toUShort
  val GL_PRIMITIVES_GENERATED: UShort = 0x8C87.toUShort
  val GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN: UShort = 0x8C88.toUShort
  val GL_RASTERIZER_DISCARD: UShort = 0x8C89.toUShort
  val GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS: UShort = 0x8C8A.toUShort
  val GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS: UShort = 0x8C8B.toUShort
  val GL_INTERLEAVED_ATTRIBS: UShort = 0x8C8C.toUShort
  val GL_SEPARATE_ATTRIBS: UShort = 0x8C8D.toUShort
  val GL_TRANSFORM_FEEDBACK_BUFFER: UShort = 0x8C8E.toUShort
  val GL_TRANSFORM_FEEDBACK_BUFFER_BINDING: UShort = 0x8C8F.toUShort
  val GL_RGBA32UI: UShort = 0x8D70.toUShort
  val GL_RGB32UI: UShort = 0x8D71.toUShort
  val GL_RGBA16UI: UShort = 0x8D76.toUShort
  val GL_RGB16UI: UShort = 0x8D77.toUShort
  val GL_RGBA8UI: UShort = 0x8D7C.toUShort
  val GL_RGB8UI: UShort = 0x8D7D.toUShort
  val GL_RGBA32I: UShort = 0x8D82.toUShort
  val GL_RGB32I: UShort = 0x8D83.toUShort
  val GL_RGBA16I: UShort = 0x8D88.toUShort
  val GL_RGB16I: UShort = 0x8D89.toUShort
  val GL_RGBA8I: UShort = 0x8D8E.toUShort
  val GL_RGB8I: UShort = 0x8D8F.toUShort
  val GL_RED_INTEGER: UShort = 0x8D94.toUShort
  val GL_GREEN_INTEGER: UShort = 0x8D95.toUShort
  val GL_BLUE_INTEGER: UShort = 0x8D96.toUShort
  val GL_RGB_INTEGER: UShort = 0x8D98.toUShort
  val GL_RGBA_INTEGER: UShort = 0x8D99.toUShort
  val GL_BGR_INTEGER: UShort = 0x8D9A.toUShort
  val GL_BGRA_INTEGER: UShort = 0x8D9B.toUShort
  val GL_SAMPLER_1D_ARRAY: UShort = 0x8DC0.toUShort
  val GL_SAMPLER_2D_ARRAY: UShort = 0x8DC1.toUShort
  val GL_SAMPLER_1D_ARRAY_SHADOW: UShort = 0x8DC3.toUShort
  val GL_SAMPLER_2D_ARRAY_SHADOW: UShort = 0x8DC4.toUShort
  val GL_SAMPLER_CUBE_SHADOW: UShort = 0x8DC5.toUShort
  val GL_UNSIGNED_INT_VEC2: UShort = 0x8DC6.toUShort
  val GL_UNSIGNED_INT_VEC3: UShort = 0x8DC7.toUShort
  val GL_UNSIGNED_INT_VEC4: UShort = 0x8DC8.toUShort
  val GL_INT_SAMPLER_1D: UShort = 0x8DC9.toUShort
  val GL_INT_SAMPLER_2D: UShort = 0x8DCA.toUShort
  val GL_INT_SAMPLER_3D: UShort = 0x8DCB.toUShort
  val GL_INT_SAMPLER_CUBE: UShort = 0x8DCC.toUShort
  val GL_INT_SAMPLER_1D_ARRAY: UShort = 0x8DCE.toUShort
  val GL_INT_SAMPLER_2D_ARRAY: UShort = 0x8DCF.toUShort
  val GL_UNSIGNED_INT_SAMPLER_1D: UShort = 0x8DD1.toUShort
  val GL_UNSIGNED_INT_SAMPLER_2D: UShort = 0x8DD2.toUShort
  val GL_UNSIGNED_INT_SAMPLER_3D: UShort = 0x8DD3.toUShort
  val GL_UNSIGNED_INT_SAMPLER_CUBE: UShort = 0x8DD4.toUShort
  val GL_UNSIGNED_INT_SAMPLER_1D_ARRAY: UShort = 0x8DD6.toUShort
  val GL_UNSIGNED_INT_SAMPLER_2D_ARRAY: UShort = 0x8DD7.toUShort
  val GL_QUERY_WAIT: UShort = 0x8E13.toUShort
  val GL_QUERY_NO_WAIT: UShort = 0x8E14.toUShort
  val GL_QUERY_BY_REGION_WAIT: UShort = 0x8E15.toUShort
  val GL_QUERY_BY_REGION_NO_WAIT: UShort = 0x8E16.toUShort
  val GL_BUFFER_ACCESS_FLAGS: UShort = 0x911F.toUShort
  val GL_BUFFER_MAP_LENGTH: UShort = 0x9120.toUShort
  val GL_BUFFER_MAP_OFFSET: UShort = 0x9121.toUShort
  val GL_DEPTH_COMPONENT32F: UShort = 0x8CAC.toUShort
  val GL_DEPTH32F_STENCIL8: UShort = 0x8CAD.toUShort
  val GL_FLOAT_32_UNSIGNED_INT_24_8_REV: UShort = 0x8DAD.toUShort
  val GL_INVALID_FRAMEBUFFER_OPERATION: UShort = 0x0506.toUShort
  val GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING: UShort = 0x8210.toUShort
  val GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE: UShort = 0x8211.toUShort
  val GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE: UShort = 0x8212.toUShort
  val GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE: UShort = 0x8213.toUShort
  val GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE: UShort = 0x8214.toUShort
  val GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE: UShort = 0x8215.toUShort
  val GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE: UShort = 0x8216.toUShort
  val GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE: UShort = 0x8217.toUShort
  val GL_FRAMEBUFFER_DEFAULT: UShort = 0x8218.toUShort
  val GL_FRAMEBUFFER_UNDEFINED: UShort = 0x8219.toUShort
  val GL_DEPTH_STENCIL_ATTACHMENT: UShort = 0x821A.toUShort
  val GL_MAX_RENDERBUFFER_SIZE: UShort = 0x84E8.toUShort
  val GL_DEPTH_STENCIL: UShort = 0x84F9.toUShort
  val GL_UNSIGNED_INT_24_8: UShort = 0x84FA.toUShort
  val GL_DEPTH24_STENCIL8: UShort = 0x88F0.toUShort
  val GL_TEXTURE_STENCIL_SIZE: UShort = 0x88F1.toUShort
  val GL_TEXTURE_RED_TYPE: UShort = 0x8C10.toUShort
  val GL_TEXTURE_GREEN_TYPE: UShort = 0x8C11.toUShort
  val GL_TEXTURE_BLUE_TYPE: UShort = 0x8C12.toUShort
  val GL_TEXTURE_ALPHA_TYPE: UShort = 0x8C13.toUShort
  val GL_TEXTURE_DEPTH_TYPE: UShort = 0x8C16.toUShort
  val GL_UNSIGNED_NORMALIZED: UShort = 0x8C17.toUShort
  val GL_FRAMEBUFFER_BINDING: UShort = 0x8CA6.toUShort
  val GL_DRAW_FRAMEBUFFER_BINDING: UShort = 0x8CA6.toUShort
  val GL_RENDERBUFFER_BINDING: UShort = 0x8CA7.toUShort
  val GL_READ_FRAMEBUFFER: UShort = 0x8CA8.toUShort
  val GL_DRAW_FRAMEBUFFER: UShort = 0x8CA9.toUShort
  val GL_READ_FRAMEBUFFER_BINDING: UShort = 0x8CAA.toUShort
  val GL_RENDERBUFFER_SAMPLES: UShort = 0x8CAB.toUShort
  val GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE: UShort = 0x8CD0.toUShort
  val GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME: UShort = 0x8CD1.toUShort
  val GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL: UShort = 0x8CD2.toUShort
  val GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE: UShort = 0x8CD3.toUShort
  val GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER: UShort = 0x8CD4.toUShort
  val GL_FRAMEBUFFER_COMPLETE: UShort = 0x8CD5.toUShort
  val GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT: UShort = 0x8CD6.toUShort
  val GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT: UShort = 0x8CD7.toUShort
  val GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER: UShort = 0x8CDB.toUShort
  val GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER: UShort = 0x8CDC.toUShort
  val GL_FRAMEBUFFER_UNSUPPORTED: UShort = 0x8CDD.toUShort
  val GL_MAX_COLOR_ATTACHMENTS: UShort = 0x8CDF.toUShort
  val GL_COLOR_ATTACHMENT0: UShort = 0x8CE0.toUShort
  val GL_COLOR_ATTACHMENT1: UShort = 0x8CE1.toUShort
  val GL_COLOR_ATTACHMENT2: UShort = 0x8CE2.toUShort
  val GL_COLOR_ATTACHMENT3: UShort = 0x8CE3.toUShort
  val GL_COLOR_ATTACHMENT4: UShort = 0x8CE4.toUShort
  val GL_COLOR_ATTACHMENT5: UShort = 0x8CE5.toUShort
  val GL_COLOR_ATTACHMENT6: UShort = 0x8CE6.toUShort
  val GL_COLOR_ATTACHMENT7: UShort = 0x8CE7.toUShort
  val GL_COLOR_ATTACHMENT8: UShort = 0x8CE8.toUShort
  val GL_COLOR_ATTACHMENT9: UShort = 0x8CE9.toUShort
  val GL_COLOR_ATTACHMENT10: UShort = 0x8CEA.toUShort
  val GL_COLOR_ATTACHMENT11: UShort = 0x8CEB.toUShort
  val GL_COLOR_ATTACHMENT12: UShort = 0x8CEC.toUShort
  val GL_COLOR_ATTACHMENT13: UShort = 0x8CED.toUShort
  val GL_COLOR_ATTACHMENT14: UShort = 0x8CEE.toUShort
  val GL_COLOR_ATTACHMENT15: UShort = 0x8CEF.toUShort
  val GL_DEPTH_ATTACHMENT: UShort = 0x8D00.toUShort
  val GL_STENCIL_ATTACHMENT: UShort = 0x8D20.toUShort
  val GL_FRAMEBUFFER: UShort = 0x8D40.toUShort
  val GL_RENDERBUFFER: UShort = 0x8D41.toUShort
  val GL_RENDERBUFFER_WIDTH: UShort = 0x8D42.toUShort
  val GL_RENDERBUFFER_HEIGHT: UShort = 0x8D43.toUShort
  val GL_RENDERBUFFER_INTERNAL_FORMAT: UShort = 0x8D44.toUShort
  val GL_STENCIL_INDEX1: UShort = 0x8D46.toUShort
  val GL_STENCIL_INDEX4: UShort = 0x8D47.toUShort
  val GL_STENCIL_INDEX8: UShort = 0x8D48.toUShort
  val GL_STENCIL_INDEX16: UShort = 0x8D49.toUShort
  val GL_RENDERBUFFER_RED_SIZE: UShort = 0x8D50.toUShort
  val GL_RENDERBUFFER_GREEN_SIZE: UShort = 0x8D51.toUShort
  val GL_RENDERBUFFER_BLUE_SIZE: UShort = 0x8D52.toUShort
  val GL_RENDERBUFFER_ALPHA_SIZE: UShort = 0x8D53.toUShort
  val GL_RENDERBUFFER_DEPTH_SIZE: UShort = 0x8D54.toUShort
  val GL_RENDERBUFFER_STENCIL_SIZE: UShort = 0x8D55.toUShort
  val GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE: UShort = 0x8D56.toUShort
  val GL_MAX_SAMPLES: UShort = 0x8D57.toUShort
  val GL_INDEX: UShort = 0x8222.toUShort
  val GL_TEXTURE_LUMINANCE_TYPE: UShort = 0x8C14.toUShort
  val GL_TEXTURE_INTENSITY_TYPE: UShort = 0x8C15.toUShort
  val GL_FRAMEBUFFER_SRGB: UShort = 0x8DB9.toUShort
  val GL_HALF_FLOAT: UShort = 0x140B.toUShort
  val GL_MAP_READ_BIT: UShort = 0x0001.toUShort
  val GL_MAP_WRITE_BIT: UShort = 0x0002.toUShort
  val GL_MAP_INVALIDATE_RANGE_BIT: UShort = 0x0004.toUShort
  val GL_MAP_INVALIDATE_BUFFER_BIT: UShort = 0x0008.toUShort
  val GL_MAP_FLUSH_EXPLICIT_BIT: UShort = 0x0010.toUShort
  val GL_MAP_UNSYNCHRONIZED_BIT: UShort = 0x0020.toUShort
  val GL_COMPRESSED_RED_RGTC1: UShort = 0x8DBB.toUShort
  val GL_COMPRESSED_SIGNED_RED_RGTC1: UShort = 0x8DBC.toUShort
  val GL_COMPRESSED_RG_RGTC2: UShort = 0x8DBD.toUShort
  val GL_COMPRESSED_SIGNED_RG_RGTC2: UShort = 0x8DBE.toUShort
  val GL_RG: UShort = 0x8227.toUShort
  val GL_RG_INTEGER: UShort = 0x8228.toUShort
  val GL_R8: UShort = 0x8229.toUShort
  val GL_R16: UShort = 0x822A.toUShort
  val GL_RG8: UShort = 0x822B.toUShort
  val GL_RG16: UShort = 0x822C.toUShort
  val GL_R16F: UShort = 0x822D.toUShort
  val GL_R32F: UShort = 0x822E.toUShort
  val GL_RG16F: UShort = 0x822F.toUShort
  val GL_RG32F: UShort = 0x8230.toUShort
  val GL_R8I: UShort = 0x8231.toUShort
  val GL_R8UI: UShort = 0x8232.toUShort
  val GL_R16I: UShort = 0x8233.toUShort
  val GL_R16UI: UShort = 0x8234.toUShort
  val GL_R32I: UShort = 0x8235.toUShort
  val GL_R32UI: UShort = 0x8236.toUShort
  val GL_RG8I: UShort = 0x8237.toUShort
  val GL_RG8UI: UShort = 0x8238.toUShort
  val GL_RG16I: UShort = 0x8239.toUShort
  val GL_RG16UI: UShort = 0x823A.toUShort
  val GL_RG32I: UShort = 0x823B.toUShort
  val GL_RG32UI: UShort = 0x823C.toUShort
  val GL_VERTEX_ARRAY_BINDING: UShort = 0x85B5.toUShort
  val GL_CLAMP_VERTEX_COLOR: UShort = 0x891A.toUShort
  val GL_CLAMP_FRAGMENT_COLOR: UShort = 0x891B.toUShort
  val GL_ALPHA_INTEGER: UShort = 0x8D97.toUShort
  /*
   * End OpenGL 3.0
   */

  /*
   * OpenGL 3.1
   */
  val GL_SAMPLER_2D_RECT: UShort = 0x8B63.toUShort
  val GL_SAMPLER_2D_RECT_SHADOW: UShort = 0x8B64.toUShort
  val GL_SAMPLER_BUFFER: UShort = 0x8DC2.toUShort
  val GL_INT_SAMPLER_2D_RECT: UShort = 0x8DCD.toUShort
  val GL_INT_SAMPLER_BUFFER: UShort = 0x8DD0.toUShort
  val GL_UNSIGNED_INT_SAMPLER_2D_RECT: UShort = 0x8DD5.toUShort
  val GL_UNSIGNED_INT_SAMPLER_BUFFER: UShort = 0x8DD8.toUShort
  val GL_TEXTURE_BUFFER: UShort = 0x8C2A.toUShort
  val GL_MAX_TEXTURE_BUFFER_SIZE: UShort = 0x8C2B.toUShort
  val GL_TEXTURE_BINDING_BUFFER: UShort = 0x8C2C.toUShort
  val GL_TEXTURE_BUFFER_DATA_STORE_BINDING: UShort = 0x8C2D.toUShort
  val GL_TEXTURE_RECTANGLE: UShort = 0x84F5.toUShort
  val GL_TEXTURE_BINDING_RECTANGLE: UShort = 0x84F6.toUShort
  val GL_PROXY_TEXTURE_RECTANGLE: UShort = 0x84F7.toUShort
  val GL_MAX_RECTANGLE_TEXTURE_SIZE: UShort = 0x84F8.toUShort
  val GL_R8_SNORM: UShort = 0x8F94.toUShort
  val GL_RG8_SNORM: UShort = 0x8F95.toUShort
  val GL_RGB8_SNORM: UShort = 0x8F96.toUShort
  val GL_RGBA8_SNORM: UShort = 0x8F97.toUShort
  val GL_R16_SNORM: UShort = 0x8F98.toUShort
  val GL_RG16_SNORM: UShort = 0x8F99.toUShort
  val GL_RGB16_SNORM: UShort = 0x8F9A.toUShort
  val GL_RGBA16_SNORM: UShort = 0x8F9B.toUShort
  val GL_SIGNED_NORMALIZED: UShort = 0x8F9C.toUShort
  val GL_PRIMITIVE_RESTART: UShort = 0x8F9D.toUShort
  val GL_PRIMITIVE_RESTART_INDEX: UShort = 0x8F9E.toUShort
  val GL_COPY_READ_BUFFER: UShort = 0x8F36.toUShort
  val GL_COPY_WRITE_BUFFER: UShort = 0x8F37.toUShort
  val GL_UNIFORM_BUFFER: UShort = 0x8A11.toUShort
  val GL_UNIFORM_BUFFER_BINDING: UShort = 0x8A28.toUShort
  val GL_UNIFORM_BUFFER_START: UShort = 0x8A29.toUShort
  val GL_UNIFORM_BUFFER_SIZE: UShort = 0x8A2A.toUShort
  val GL_MAX_VERTEX_UNIFORM_BLOCKS: UShort = 0x8A2B.toUShort
  val GL_MAX_FRAGMENT_UNIFORM_BLOCKS: UShort = 0x8A2D.toUShort
  val GL_MAX_COMBINED_UNIFORM_BLOCKS: UShort = 0x8A2E.toUShort
  val GL_MAX_UNIFORM_BUFFER_BINDINGS: UShort = 0x8A2F.toUShort
  val GL_MAX_UNIFORM_BLOCK_SIZE: UShort = 0x8A30.toUShort
  val GL_MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS: UShort = 0x8A31.toUShort
  val GL_MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS: UShort = 0x8A33.toUShort
  val GL_UNIFORM_BUFFER_OFFSET_ALIGNMENT: UShort = 0x8A34.toUShort
  val GL_ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH: UShort = 0x8A35.toUShort
  val GL_ACTIVE_UNIFORM_BLOCKS: UShort = 0x8A36.toUShort
  val GL_UNIFORM_TYPE: UShort = 0x8A37.toUShort
  val GL_UNIFORM_SIZE: UShort = 0x8A38.toUShort
  val GL_UNIFORM_NAME_LENGTH: UShort = 0x8A39.toUShort
  val GL_UNIFORM_BLOCK_INDEX: UShort = 0x8A3A.toUShort
  val GL_UNIFORM_OFFSET: UShort = 0x8A3B.toUShort
  val GL_UNIFORM_ARRAY_STRIDE: UShort = 0x8A3C.toUShort
  val GL_UNIFORM_MATRIX_STRIDE: UShort = 0x8A3D.toUShort
  val GL_UNIFORM_IS_ROW_MAJOR: UShort = 0x8A3E.toUShort
  val GL_UNIFORM_BLOCK_BINDING: UShort = 0x8A3F.toUShort
  val GL_UNIFORM_BLOCK_DATA_SIZE: UShort = 0x8A40.toUShort
  val GL_UNIFORM_BLOCK_NAME_LENGTH: UShort = 0x8A41.toUShort
  val GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS: UShort = 0x8A42.toUShort
  val GL_UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES: UShort = 0x8A43.toUShort
  val GL_UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER: UShort = 0x8A44.toUShort
  val GL_UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER: UShort = 0x8A46.toUShort
  val GL_INVALID_INDEX: UInt = 0xFFFFFFFF.toUInt
  /*
   * End OpenGL 3.1
   */

  /*
   * OpenGL 3.2
   */
  val GL_CONTEXT_CORE_PROFILE_BIT: UInt = 0x00000001.toUInt
  val GL_CONTEXT_COMPATIBILITY_PROFILE_BIT: UInt = 0x00000002.toUInt
  val GL_LINES_ADJACENCY: UShort = 0x000A.toUShort
  val GL_LINE_STRIP_ADJACENCY: UShort = 0x000B.toUShort
  val GL_TRIANGLES_ADJACENCY: UShort = 0x000C.toUShort
  val GL_TRIANGLE_STRIP_ADJACENCY: UShort = 0x000D.toUShort
  val GL_PROGRAM_POINT_SIZE: UShort = 0x8642.toUShort
  val GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS: UShort = 0x8C29.toUShort
  val GL_FRAMEBUFFER_ATTACHMENT_LAYERED: UShort = 0x8DA7.toUShort
  val GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS: UShort = 0x8DA8.toUShort
  val GL_GEOMETRY_SHADER: UShort = 0x8DD9.toUShort
  val GL_GEOMETRY_VERTICES_OUT: UShort = 0x8916.toUShort
  val GL_GEOMETRY_INPUT_TYPE: UShort = 0x8917.toUShort
  val GL_GEOMETRY_OUTPUT_TYPE: UShort = 0x8918.toUShort
  val GL_MAX_GEOMETRY_UNIFORM_COMPONENTS: UShort = 0x8DDF.toUShort
  val GL_MAX_GEOMETRY_OUTPUT_VERTICES: UShort = 0x8DE0.toUShort
  val GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS: UShort = 0x8DE1.toUShort
  val GL_MAX_VERTEX_OUTPUT_COMPONENTS: UShort = 0x9122.toUShort
  val GL_MAX_GEOMETRY_INPUT_COMPONENTS: UShort = 0x9123.toUShort
  val GL_MAX_GEOMETRY_OUTPUT_COMPONENTS: UShort = 0x9124.toUShort
  val GL_MAX_FRAGMENT_INPUT_COMPONENTS: UShort = 0x9125.toUShort
  val GL_CONTEXT_PROFILE_MASK: UShort = 0x9126.toUShort
  val GL_DEPTH_CLAMP: UShort = 0x864F.toUShort
  val GL_QUADS_FOLLOW_PROVOKING_VERTEX_CONVENTION: UShort = 0x8E4C.toUShort
  val GL_FIRST_VERTEX_CONVENTION: UShort = 0x8E4D.toUShort
  val GL_LAST_VERTEX_CONVENTION: UShort = 0x8E4E.toUShort
  val GL_PROVOKING_VERTEX: UShort = 0x8E4F.toUShort
  val GL_TEXTURE_CUBE_MAP_SEAMLESS: UShort = 0x884F.toUShort
  val GL_MAX_SERVER_WAIT_TIMEOUT: UShort = 0x9111.toUShort
  val GL_OBJECT_TYPE: UShort = 0x9112.toUShort
  val GL_SYNC_CONDITION: UShort = 0x9113.toUShort
  val GL_SYNC_STATUS: UShort = 0x9114.toUShort
  val GL_SYNC_FLAGS: UShort = 0x9115.toUShort
  val GL_SYNC_FENCE: UShort = 0x9116.toUShort
  val GL_SYNC_GPU_COMMANDS_COMPLETE: UShort = 0x9117.toUShort
  val GL_UNSIGNALED: UShort = 0x9118.toUShort
  val GL_SIGNALED: UShort = 0x9119.toUShort
  val GL_ALREADY_SIGNALED: UShort = 0x911A.toUShort
  val GL_TIMEOUT_EXPIRED: UShort = 0x911B.toUShort
  val GL_CONDITION_SATISFIED: UShort = 0x911C.toUShort
  val GL_WAIT_FAILED: UShort = 0x911D.toUShort
  val GL_TIMEOUT_IGNORED: ULong = 0xFFFFFFFFFFFFFFFFL.toULong
  val GL_SYNC_FLUSH_COMMANDS_BIT: UInt = 0x00000001.toUInt
  val GL_SAMPLE_POSITION: UShort = 0x8E50.toUShort
  val GL_SAMPLE_MASK: UShort = 0x8E51.toUShort
  val GL_SAMPLE_MASK_VALUE: UShort = 0x8E52.toUShort
  val GL_MAX_SAMPLE_MASK_WORDS: UShort = 0x8E59.toUShort
  val GL_TEXTURE_2D_MULTISAMPLE: UShort = 0x9100.toUShort
  val GL_PROXY_TEXTURE_2D_MULTISAMPLE: UShort = 0x9101.toUShort
  val GL_TEXTURE_2D_MULTISAMPLE_ARRAY: UShort = 0x9102.toUShort
  val GL_PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY: UShort = 0x9103.toUShort
  val GL_TEXTURE_BINDING_2D_MULTISAMPLE: UShort = 0x9104.toUShort
  val GL_TEXTURE_BINDING_2D_MULTISAMPLE_ARRAY: UShort = 0x9105.toUShort
  val GL_TEXTURE_SAMPLES: UShort = 0x9106.toUShort
  val GL_TEXTURE_FIXED_SAMPLE_LOCATIONS: UShort = 0x9107.toUShort
  val GL_SAMPLER_2D_MULTISAMPLE: UShort = 0x9108.toUShort
  val GL_INT_SAMPLER_2D_MULTISAMPLE: UShort = 0x9109.toUShort
  val GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE: UShort = 0x910A.toUShort
  val GL_SAMPLER_2D_MULTISAMPLE_ARRAY: UShort = 0x910B.toUShort
  val GL_INT_SAMPLER_2D_MULTISAMPLE_ARRAY: UShort = 0x910C.toUShort
  val GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE_ARRAY: UShort = 0x910D.toUShort
  val GL_MAX_COLOR_TEXTURE_SAMPLES: UShort = 0x910E.toUShort
  val GL_MAX_DEPTH_TEXTURE_SAMPLES: UShort = 0x910F.toUShort
  val GL_MAX_INTEGER_SAMPLES: UShort = 0x9110.toUShort
  /*
   * End OpenGL 3.2
   */

  /*
   * OpenGL 3.3
   */
  val GL_VERTEX_ATTRIB_ARRAY_DIVISOR: UShort = 0x88FE.toUShort
  val GL_SRC1_COLOR: UShort = 0x88F9.toUShort
  val GL_ONE_MINUS_SRC1_COLOR: UShort = 0x88FA.toUShort
  val GL_ONE_MINUS_SRC1_ALPHA: UShort = 0x88FB.toUShort
  val GL_MAX_DUAL_SOURCE_DRAW_BUFFERS: UShort = 0x88FC.toUShort
  val GL_ANY_SAMPLES_PASSED: UShort = 0x8C2F.toUShort
  val GL_SAMPLER_BINDING: UShort = 0x8919.toUShort
  val GL_RGB10_A2UI: UShort = 0x906F.toUShort
  val GL_TEXTURE_SWIZZLE_R: UShort = 0x8E42.toUShort
  val GL_TEXTURE_SWIZZLE_G: UShort = 0x8E43.toUShort
  val GL_TEXTURE_SWIZZLE_B: UShort = 0x8E44.toUShort
  val GL_TEXTURE_SWIZZLE_A: UShort = 0x8E45.toUShort
  val GL_TEXTURE_SWIZZLE_RGBA: UShort = 0x8E46.toUShort
  val GL_TIME_ELAPSED: UShort = 0x88BF.toUShort
  val GL_TIMESTAMP: UShort = 0x8E28.toUShort
  val GL_INT_2_10_10_10_REV: UShort = 0x8D9F.toUShort
  /*
   * End OpenGL 3.3
   */

   /*
    * OpenGL 4.0
    */
  val GL_SAMPLE_SHADING: UShort = 0x8C36.toUShort
  val GL_MIN_SAMPLE_SHADING_VALUE: UShort = 0x8C37.toUShort
  val GL_MIN_PROGRAM_TEXTURE_GATHER_OFFSET: UShort = 0x8E5E.toUShort
  val GL_MAX_PROGRAM_TEXTURE_GATHER_OFFSET: UShort = 0x8E5F.toUShort
  val GL_TEXTURE_CUBE_MAP_ARRAY: UShort = 0x9009.toUShort
  val GL_TEXTURE_BINDING_CUBE_MAP_ARRAY: UShort = 0x900A.toUShort
  val GL_PROXY_TEXTURE_CUBE_MAP_ARRAY: UShort = 0x900B.toUShort
  val GL_SAMPLER_CUBE_MAP_ARRAY: UShort = 0x900C.toUShort
  val GL_SAMPLER_CUBE_MAP_ARRAY_SHADOW: UShort = 0x900D.toUShort
  val GL_INT_SAMPLER_CUBE_MAP_ARRAY: UShort = 0x900E.toUShort
  val GL_UNSIGNED_INT_SAMPLER_CUBE_MAP_ARRAY: UShort = 0x900F.toUShort
  val GL_DRAW_INDIRECT_BUFFER: UShort = 0x8F3F.toUShort
  val GL_DRAW_INDIRECT_BUFFER_BINDING: UShort = 0x8F43.toUShort
  val GL_GEOMETRY_SHADER_INVOCATIONS: UShort = 0x887F.toUShort
  val GL_MAX_GEOMETRY_SHADER_INVOCATIONS: UShort = 0x8E5A.toUShort
  val GL_MIN_FRAGMENT_INTERPOLATION_OFFSET: UShort = 0x8E5B.toUShort
  val GL_MAX_FRAGMENT_INTERPOLATION_OFFSET: UShort = 0x8E5C.toUShort
  val GL_FRAGMENT_INTERPOLATION_OFFSET_BITS: UShort = 0x8E5D.toUShort
  val GL_MAX_VERTEX_STREAMS: UShort = 0x8E71.toUShort
  val GL_DOUBLE_VEC2: UShort = 0x8FFC.toUShort
  val GL_DOUBLE_VEC3: UShort = 0x8FFD.toUShort
  val GL_DOUBLE_VEC4: UShort = 0x8FFE.toUShort
  val GL_DOUBLE_MAT2: UShort = 0x8F46.toUShort
  val GL_DOUBLE_MAT3: UShort = 0x8F47.toUShort
  val GL_DOUBLE_MAT4: UShort = 0x8F48.toUShort
  val GL_DOUBLE_MAT2x3: UShort = 0x8F49.toUShort
  val GL_DOUBLE_MAT2x4: UShort = 0x8F4A.toUShort
  val GL_DOUBLE_MAT3x2: UShort = 0x8F4B.toUShort
  val GL_DOUBLE_MAT3x4: UShort = 0x8F4C.toUShort
  val GL_DOUBLE_MAT4x2: UShort = 0x8F4D.toUShort
  val GL_DOUBLE_MAT4x3: UShort = 0x8F4E.toUShort
  val GL_ACTIVE_SUBROUTINES: UShort = 0x8DE5.toUShort
  val GL_ACTIVE_SUBROUTINE_UNIFORMS: UShort = 0x8DE6.toUShort
  val GL_ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS: UShort = 0x8E47.toUShort
  val GL_ACTIVE_SUBROUTINE_MAX_LENGTH: UShort = 0x8E48.toUShort
  val GL_ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH: UShort = 0x8E49.toUShort
  val GL_MAX_SUBROUTINES: UShort = 0x8DE7.toUShort
  val GL_MAX_SUBROUTINE_UNIFORM_LOCATIONS: UShort = 0x8DE8.toUShort
  val GL_NUM_COMPATIBLE_SUBROUTINES: UShort = 0x8E4A.toUShort
  val GL_COMPATIBLE_SUBROUTINES: UShort = 0x8E4B.toUShort
  val GL_PATCHES: UShort = 0x000E.toUShort
  val GL_PATCH_VERTICES: UShort = 0x8E72.toUShort
  val GL_PATCH_DEFAULT_INNER_LEVEL: UShort = 0x8E73.toUShort
  val GL_PATCH_DEFAULT_OUTER_LEVEL: UShort = 0x8E74.toUShort
  val GL_TESS_CONTROL_OUTPUT_VERTICES: UShort = 0x8E75.toUShort
  val GL_TESS_GEN_MODE: UShort = 0x8E76.toUShort
  val GL_TESS_GEN_SPACING: UShort = 0x8E77.toUShort
  val GL_TESS_GEN_VERTEX_ORDER: UShort = 0x8E78.toUShort
  val GL_TESS_GEN_POINT_MODE: UShort = 0x8E79.toUShort
  val GL_ISOLINES: UShort = 0x8E7A.toUShort
  val GL_FRACTIONAL_ODD: UShort = 0x8E7B.toUShort
  val GL_FRACTIONAL_EVEN: UShort = 0x8E7C.toUShort
  val GL_MAX_PATCH_VERTICES: UShort = 0x8E7D.toUShort
  val GL_MAX_TESS_GEN_LEVEL: UShort = 0x8E7E.toUShort
  val GL_MAX_TESS_CONTROL_UNIFORM_COMPONENTS: UShort = 0x8E7F.toUShort
  val GL_MAX_TESS_EVALUATION_UNIFORM_COMPONENTS: UShort = 0x8E80.toUShort
  val GL_MAX_TESS_CONTROL_TEXTURE_IMAGE_UNITS: UShort = 0x8E81.toUShort
  val GL_MAX_TESS_EVALUATION_TEXTURE_IMAGE_UNITS: UShort = 0x8E82.toUShort
  val GL_MAX_TESS_CONTROL_OUTPUT_COMPONENTS: UShort = 0x8E83.toUShort
  val GL_MAX_TESS_PATCH_COMPONENTS: UShort = 0x8E84.toUShort
  val GL_MAX_TESS_CONTROL_TOTAL_OUTPUT_COMPONENTS: UShort = 0x8E85.toUShort
  val GL_MAX_TESS_EVALUATION_OUTPUT_COMPONENTS: UShort = 0x8E86.toUShort
  val GL_MAX_TESS_CONTROL_UNIFORM_BLOCKS: UShort = 0x8E89.toUShort
  val GL_MAX_TESS_EVALUATION_UNIFORM_BLOCKS: UShort = 0x8E8A.toUShort
  val GL_MAX_TESS_CONTROL_INPUT_COMPONENTS: UShort = 0x886C.toUShort
  val GL_MAX_TESS_EVALUATION_INPUT_COMPONENTS: UShort = 0x886D.toUShort
  val GL_MAX_COMBINED_TESS_CONTROL_UNIFORM_COMPONENTS: UShort = 0x8E1E.toUShort
  val GL_MAX_COMBINED_TESS_EVALUATION_UNIFORM_COMPONENTS: UShort = 0x8E1F.toUShort
  val GL_UNIFORM_BLOCK_REFERENCED_BY_TESS_CONTROL_SHADER: UShort = 0x84F0.toUShort
  val GL_UNIFORM_BLOCK_REFERENCED_BY_TESS_EVALUATION_SHADER: UShort = 0x84F1.toUShort
  val GL_TESS_EVALUATION_SHADER: UShort = 0x8E87.toUShort
  val GL_TESS_CONTROL_SHADER: UShort = 0x8E88.toUShort
  val GL_TRANSFORM_FEEDBACK: UShort = 0x8E22.toUShort
  val GL_TRANSFORM_FEEDBACK_BUFFER_PAUSED: UShort = 0x8E23.toUShort
  val GL_TRANSFORM_FEEDBACK_BUFFER_ACTIVE: UShort = 0x8E24.toUShort
  val GL_TRANSFORM_FEEDBACK_BINDING: UShort = 0x8E25.toUShort
  val GL_MAX_TRANSFORM_FEEDBACK_BUFFERS: UShort = 0x8E70.toUShort
  /*
   * End OpenGL 4.0
   */

  /*
   * OpenGL 4.1
   */
  val GL_FIXED: UInt = 0x140C.toUInt
  val GL_IMPLEMENTATION_COLOR_READ_TYPE: UInt = 0x8B9A.toUInt
  val GL_IMPLEMENTATION_COLOR_READ_FORMAT: UInt = 0x8B9B.toUInt
  val GL_LOW_FLOAT: UInt = 0x8DF0.toUInt
  val GL_MEDIUM_FLOAT: UInt = 0x8DF1.toUInt
  val GL_HIGH_FLOAT: UInt = 0x8DF2.toUInt
  val GL_LOW_INT: UInt = 0x8DF3.toUInt
  val GL_MEDIUM_INT: UInt = 0x8DF4.toUInt
  val GL_HIGH_INT: UInt = 0x8DF5.toUInt
  val GL_SHADER_COMPILER: UInt = 0x8DFA.toUInt
  val GL_SHADER_BINARY_FORMATS: UInt = 0x8DF8.toUInt
  val GL_NUM_SHADER_BINARY_FORMATS: UInt = 0x8DF9.toUInt
  val GL_MAX_VERTEX_UNIFORM_VECTORS: UInt = 0x8DFB.toUInt
  val GL_MAX_VARYING_VECTORS: UInt = 0x8DFC.toUInt
  val GL_MAX_FRAGMENT_UNIFORM_VECTORS: UInt = 0x8DFD.toUInt
  val GL_RGB565: UInt = 0x8D62.toUInt
  val GL_PROGRAM_BINARY_RETRIEVABLE_HINT: UInt = 0x8257.toUInt
  val GL_PROGRAM_BINARY_LENGTH: UInt = 0x8741.toUInt
  val GL_NUM_PROGRAM_BINARY_FORMATS: UInt = 0x87FE.toUInt
  val GL_PROGRAM_BINARY_FORMATS: UInt = 0x87FF.toUInt
  val GL_VERTEX_SHADER_BIT: UInt = 0x00000001.toUInt
  val GL_FRAGMENT_SHADER_BIT: UInt = 0x00000002.toUInt
  val GL_GEOMETRY_SHADER_BIT: UInt = 0x00000004.toUInt
  val GL_TESS_CONTROL_SHADER_BIT: UInt = 0x00000008.toUInt
  val GL_TESS_EVALUATION_SHADER_BIT: UInt = 0x00000010.toUInt
  val GL_ALL_SHADER_BITS: UInt = 0xFFFFFFFF.toUInt
  val GL_PROGRAM_SEPARABLE: UInt = 0x8258.toUInt
  val GL_ACTIVE_PROGRAM: UInt = 0x8259.toUInt
  val GL_PROGRAM_PIPELINE_BINDING: UInt = 0x825A.toUInt
  val GL_MAX_VIEWPORTS: UInt = 0x825B.toUInt
  val GL_VIEWPORT_SUBPIXEL_BITS: UInt = 0x825C.toUInt
  val GL_VIEWPORT_BOUNDS_RANGE: UInt = 0x825D.toUInt
  val GL_LAYER_PROVOKING_VERTEX: UInt = 0x825E.toUInt
  val GL_VIEWPORT_INDEX_PROVOKING_VERTEX: UInt = 0x825F.toUInt
  val GL_UNDEFINED_VERTEX: UInt = 0x8260.toUInt
  /*
   * End OpenGL 4.1
   */

  /*
   * OpenGL 4.2
   */
  val GL_COPY_READ_BUFFER_BINDING: UInt = 0x8F36.toUInt
  val GL_COPY_WRITE_BUFFER_BINDING: UInt = 0x8F37.toUInt
  val GL_TRANSFORM_FEEDBACK_ACTIVE: UInt = 0x8E24.toUInt
  val GL_TRANSFORM_FEEDBACK_PAUSED: UInt = 0x8E23.toUInt
  val GL_UNPACK_COMPRESSED_BLOCK_WIDTH: UInt = 0x9127.toUInt
  val GL_UNPACK_COMPRESSED_BLOCK_HEIGHT: UInt = 0x9128.toUInt
  val GL_UNPACK_COMPRESSED_BLOCK_DEPTH: UInt = 0x9129.toUInt
  val GL_UNPACK_COMPRESSED_BLOCK_SIZE: UInt = 0x912A.toUInt
  val GL_PACK_COMPRESSED_BLOCK_WIDTH: UInt = 0x912B.toUInt
  val GL_PACK_COMPRESSED_BLOCK_HEIGHT: UInt = 0x912C.toUInt
  val GL_PACK_COMPRESSED_BLOCK_DEPTH: UInt = 0x912D.toUInt
  val GL_PACK_COMPRESSED_BLOCK_SIZE: UInt = 0x912E.toUInt
  val GL_NUM_SAMPLE_COUNTS: UInt = 0x9380.toUInt
  val GL_MIN_MAP_BUFFER_ALIGNMENT: UInt = 0x90BC.toUInt
  val GL_ATOMIC_COUNTER_BUFFER: UInt = 0x92C0.toUInt
  val GL_ATOMIC_COUNTER_BUFFER_BINDING: UInt = 0x92C1.toUInt
  val GL_ATOMIC_COUNTER_BUFFER_START: UInt = 0x92C2.toUInt
  val GL_ATOMIC_COUNTER_BUFFER_SIZE: UInt = 0x92C3.toUInt
  val GL_ATOMIC_COUNTER_BUFFER_DATA_SIZE: UInt = 0x92C4.toUInt
  val GL_ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTERS: UInt = 0x92C5.toUInt
  val GL_ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTER_INDICES: UInt = 0x92C6.toUInt
  val GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_VERTEX_SHADER: UInt = 0x92C7.toUInt
  val GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_CONTROL_SHADER: UInt = 0x92C8.toUInt
  val GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_EVALUATION_SHADER: UInt = 0x92C9.toUInt
  val GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_GEOMETRY_SHADER: UInt = 0x92CA.toUInt
  val GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_FRAGMENT_SHADER: UInt = 0x92CB.toUInt
  val GL_MAX_VERTEX_ATOMIC_COUNTER_BUFFERS: UInt = 0x92CC.toUInt
  val GL_MAX_TESS_CONTROL_ATOMIC_COUNTER_BUFFERS: UInt = 0x92CD.toUInt
  val GL_MAX_TESS_EVALUATION_ATOMIC_COUNTER_BUFFERS: UInt = 0x92CE.toUInt
  val GL_MAX_GEOMETRY_ATOMIC_COUNTER_BUFFERS: UInt = 0x92CF.toUInt
  val GL_MAX_FRAGMENT_ATOMIC_COUNTER_BUFFERS: UInt = 0x92D0.toUInt
  val GL_MAX_COMBINED_ATOMIC_COUNTER_BUFFERS: UInt = 0x92D1.toUInt
  val GL_MAX_VERTEX_ATOMIC_COUNTERS: UInt = 0x92D2.toUInt
  val GL_MAX_TESS_CONTROL_ATOMIC_COUNTERS: UInt = 0x92D3.toUInt
  val GL_MAX_TESS_EVALUATION_ATOMIC_COUNTERS: UInt = 0x92D4.toUInt
  val GL_MAX_GEOMETRY_ATOMIC_COUNTERS: UInt = 0x92D5.toUInt
  val GL_MAX_FRAGMENT_ATOMIC_COUNTERS: UInt = 0x92D6.toUInt
  val GL_MAX_COMBINED_ATOMIC_COUNTERS: UInt = 0x92D7.toUInt
  val GL_MAX_ATOMIC_COUNTER_BUFFER_SIZE: UInt = 0x92D8.toUInt
  val GL_MAX_ATOMIC_COUNTER_BUFFER_BINDINGS: UInt = 0x92DC.toUInt
  val GL_ACTIVE_ATOMIC_COUNTER_BUFFERS: UInt = 0x92D9.toUInt
  val GL_UNIFORM_ATOMIC_COUNTER_BUFFER_INDEX: UInt = 0x92DA.toUInt
  val GL_UNSIGNED_INT_ATOMIC_COUNTER: UInt = 0x92DB.toUInt
  val GL_VERTEX_ATTRIB_ARRAY_BARRIER_BIT: ULong = 0x00000001.toULong
  val GL_ELEMENT_ARRAY_BARRIER_BIT: ULong = 0x00000002.toULong
  val GL_UNIFORM_BARRIER_BIT: ULong = 0x00000004.toULong
  val GL_TEXTURE_FETCH_BARRIER_BIT: ULong = 0x00000008.toULong
  val GL_SHADER_IMAGE_ACCESS_BARRIER_BIT: ULong = 0x00000020.toULong
  val GL_COMMAND_BARRIER_BIT: ULong = 0x00000040.toULong
  val GL_PIXEL_BUFFER_BARRIER_BIT: ULong = 0x00000080.toULong
  val GL_TEXTURE_UPDATE_BARRIER_BIT: ULong = 0x00000100.toULong
  val GL_BUFFER_UPDATE_BARRIER_BIT: ULong = 0x00000200.toULong
  val GL_FRAMEBUFFER_BARRIER_BIT: ULong = 0x00000400.toULong
  val GL_TRANSFORM_FEEDBACK_BARRIER_BIT: ULong = 0x00000800.toULong
  val GL_ATOMIC_COUNTER_BARRIER_BIT: ULong = 0x00001000.toULong
  val GL_ALL_BARRIER_BITS: ULong = 0xFFFFFFFF.toULong
  val GL_MAX_IMAGE_UNITS: UInt = 0x8F38.toUInt
  val GL_MAX_COMBINED_IMAGE_UNITS_AND_FRAGMENT_OUTPUTS: UInt = 0x8F39.toUInt
  val GL_IMAGE_BINDING_NAME: UInt = 0x8F3A.toUInt
  val GL_IMAGE_BINDING_LEVEL: UInt = 0x8F3B.toUInt
  val GL_IMAGE_BINDING_LAYERED: UInt = 0x8F3C.toUInt
  val GL_IMAGE_BINDING_LAYER: UInt = 0x8F3D.toUInt
  val GL_IMAGE_BINDING_ACCESS: UInt = 0x8F3E.toUInt
  val GL_IMAGE_1D: UInt = 0x904C.toUInt
  val GL_IMAGE_2D: UInt = 0x904D.toUInt
  val GL_IMAGE_3D: UInt = 0x904E.toUInt
  val GL_IMAGE_2D_RECT: UInt = 0x904F.toUInt
  val GL_IMAGE_CUBE: UInt = 0x9050.toUInt
  val GL_IMAGE_BUFFER: UInt = 0x9051.toUInt
  val GL_IMAGE_1D_ARRAY: UInt = 0x9052.toUInt
  val GL_IMAGE_2D_ARRAY: UInt = 0x9053.toUInt
  val GL_IMAGE_CUBE_MAP_ARRAY: UInt = 0x9054.toUInt
  val GL_IMAGE_2D_MULTISAMPLE: UInt = 0x9055.toUInt
  val GL_IMAGE_2D_MULTISAMPLE_ARRAY: UInt = 0x9056.toUInt
  val GL_INT_IMAGE_1D: UInt = 0x9057.toUInt
  val GL_INT_IMAGE_2D: UInt = 0x9058.toUInt
  val GL_INT_IMAGE_3D: UInt = 0x9059.toUInt
  val GL_INT_IMAGE_2D_RECT: UInt = 0x905A.toUInt
  val GL_INT_IMAGE_CUBE: UInt = 0x905B.toUInt
  val GL_INT_IMAGE_BUFFER: UInt = 0x905C.toUInt
  val GL_INT_IMAGE_1D_ARRAY: UInt = 0x905D.toUInt
  val GL_INT_IMAGE_2D_ARRAY: UInt = 0x905E.toUInt
  val GL_INT_IMAGE_CUBE_MAP_ARRAY: UInt = 0x905F.toUInt
  val GL_INT_IMAGE_2D_MULTISAMPLE: UInt = 0x9060.toUInt
  val GL_INT_IMAGE_2D_MULTISAMPLE_ARRAY: UInt = 0x9061.toUInt
  val GL_UNSIGNED_INT_IMAGE_1D: UInt = 0x9062.toUInt
  val GL_UNSIGNED_INT_IMAGE_2D: UInt = 0x9063.toUInt
  val GL_UNSIGNED_INT_IMAGE_3D: UInt = 0x9064.toUInt
  val GL_UNSIGNED_INT_IMAGE_2D_RECT: UInt = 0x9065.toUInt
  val GL_UNSIGNED_INT_IMAGE_CUBE: UInt = 0x9066.toUInt
  val GL_UNSIGNED_INT_IMAGE_BUFFER: UInt = 0x9067.toUInt
  val GL_UNSIGNED_INT_IMAGE_1D_ARRAY: UInt = 0x9068.toUInt
  val GL_UNSIGNED_INT_IMAGE_2D_ARRAY: UInt = 0x9069.toUInt
  val GL_UNSIGNED_INT_IMAGE_CUBE_MAP_ARRAY: UInt = 0x906A.toUInt
  val GL_UNSIGNED_INT_IMAGE_2D_MULTISAMPLE: UInt = 0x906B.toUInt
  val GL_UNSIGNED_INT_IMAGE_2D_MULTISAMPLE_ARRAY: UInt = 0x906C.toUInt
  val GL_MAX_IMAGE_SAMPLES: UInt = 0x906D.toUInt
  val GL_IMAGE_BINDING_FORMAT: UInt = 0x906E.toUInt
  val GL_IMAGE_FORMAT_COMPATIBILITY_TYPE: UInt = 0x90C7.toUInt
  val GL_IMAGE_FORMAT_COMPATIBILITY_BY_SIZE: UInt = 0x90C8.toUInt
  val GL_IMAGE_FORMAT_COMPATIBILITY_BY_CLASS: UInt = 0x90C9.toUInt
  val GL_MAX_VERTEX_IMAGE_UNIFORMS: UInt = 0x90CA.toUInt
  val GL_MAX_TESS_CONTROL_IMAGE_UNIFORMS: UInt = 0x90CB.toUInt
  val GL_MAX_TESS_EVALUATION_IMAGE_UNIFORMS: UInt = 0x90CC.toUInt
  val GL_MAX_GEOMETRY_IMAGE_UNIFORMS: UInt = 0x90CD.toUInt
  val GL_MAX_FRAGMENT_IMAGE_UNIFORMS: UInt = 0x90CE.toUInt
  val GL_MAX_COMBINED_IMAGE_UNIFORMS: UInt = 0x90CF.toUInt
  val GL_COMPRESSED_RGBA_BPTC_UNORM: UInt = 0x8E8C.toUInt
  val GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM: UInt = 0x8E8D.toUInt
  val GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT: UInt = 0x8E8E.toUInt
  val GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT: UInt = 0x8E8F.toUInt
  val GL_TEXTURE_IMMUTABLE_FORMAT: UInt = 0x912F.toUInt
  /*
   * End OpenGL 4.2
   */
}
