// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NetMgrDefine.proto

package com.ceiv.communication;

public final class NetMgrDefine {
  private NetMgrDefine() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code com.ceiv.communication.MulticastOptEnum}
   */
  public enum MulticastOptEnum
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * set corresponding content to 0
     * </pre>
     *
     * <code>SEARCH_DEV = 0;</code>
     */
    SEARCH_DEV(0),
    /**
     * <pre>
     * set content to 1 when open, to 0 when close
     * </pre>
     *
     * <code>DBG_MODE = 1;</code>
     */
    DBG_MODE(1),
    ;

    /**
     * <pre>
     * set corresponding content to 0
     * </pre>
     *
     * <code>SEARCH_DEV = 0;</code>
     */
    public static final int SEARCH_DEV_VALUE = 0;
    /**
     * <pre>
     * set content to 1 when open, to 0 when close
     * </pre>
     *
     * <code>DBG_MODE = 1;</code>
     */
    public static final int DBG_MODE_VALUE = 1;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static MulticastOptEnum valueOf(int value) {
      return forNumber(value);
    }

    public static MulticastOptEnum forNumber(int value) {
      switch (value) {
        case 0: return SEARCH_DEV;
        case 1: return DBG_MODE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MulticastOptEnum>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MulticastOptEnum> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MulticastOptEnum>() {
            public MulticastOptEnum findValueByNumber(int number) {
              return MulticastOptEnum.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.ceiv.communication.NetMgrDefine.getDescriptor().getEnumTypes().get(0);
    }

    private static final MulticastOptEnum[] VALUES = values();

    public static MulticastOptEnum valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private MulticastOptEnum(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:com.ceiv.communication.MulticastOptEnum)
  }

  /**
   * Protobuf enum {@code com.ceiv.communication.LoggerLevelEnum}
   */
  public enum LoggerLevelEnum
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>INVALID_LOG = 0;</code>
     */
    INVALID_LOG(0),
    /**
     * <code>CLOSE = 1;</code>
     */
    CLOSE(1),
    /**
     * <code>DBG = 2;</code>
     */
    DBG(2),
    /**
     * <code>INFO = 3;</code>
     */
    INFO(3),
    /**
     * <code>WARN = 4;</code>
     */
    WARN(4),
    /**
     * <code>ERROR = 5;</code>
     */
    ERROR(5),
    /**
     * <code>FATAL = 6;</code>
     */
    FATAL(6),
    ;

    /**
     * <code>INVALID_LOG = 0;</code>
     */
    public static final int INVALID_LOG_VALUE = 0;
    /**
     * <code>CLOSE = 1;</code>
     */
    public static final int CLOSE_VALUE = 1;
    /**
     * <code>DBG = 2;</code>
     */
    public static final int DBG_VALUE = 2;
    /**
     * <code>INFO = 3;</code>
     */
    public static final int INFO_VALUE = 3;
    /**
     * <code>WARN = 4;</code>
     */
    public static final int WARN_VALUE = 4;
    /**
     * <code>ERROR = 5;</code>
     */
    public static final int ERROR_VALUE = 5;
    /**
     * <code>FATAL = 6;</code>
     */
    public static final int FATAL_VALUE = 6;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static LoggerLevelEnum valueOf(int value) {
      return forNumber(value);
    }

    public static LoggerLevelEnum forNumber(int value) {
      switch (value) {
        case 0: return INVALID_LOG;
        case 1: return CLOSE;
        case 2: return DBG;
        case 3: return INFO;
        case 4: return WARN;
        case 5: return ERROR;
        case 6: return FATAL;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<LoggerLevelEnum>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        LoggerLevelEnum> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<LoggerLevelEnum>() {
            public LoggerLevelEnum findValueByNumber(int number) {
              return LoggerLevelEnum.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.ceiv.communication.NetMgrDefine.getDescriptor().getEnumTypes().get(1);
    }

    private static final LoggerLevelEnum[] VALUES = values();

    public static LoggerLevelEnum valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private LoggerLevelEnum(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:com.ceiv.communication.LoggerLevelEnum)
  }

  /**
   * Protobuf enum {@code com.ceiv.communication.DevCtrlEnum}
   */
  public enum DevCtrlEnum
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>INVALID_DEVCTRL = 0;</code>
     */
    INVALID_DEVCTRL(0),
    /**
     * <code>RESET_DEV = 1;</code>
     */
    RESET_DEV(1),
    /**
     * <code>RESET_APP = 2;</code>
     */
    RESET_APP(2),
    /**
     * <pre>
     * set corresponding content with update_addr
     * </pre>
     *
     * <code>UPDATE_APP = 3;</code>
     */
    UPDATE_APP(3),
    /**
     * <code>UPDATE_SYS = 4;</code>
     */
    UPDATE_SYS(4),
    /**
     * <code>SCREEN_SHOT = 5;</code>
     */
    SCREEN_SHOT(5),
    /**
     * <code>LOG_EXPORT = 6;</code>
     */
    LOG_EXPORT(6),
    ;

    /**
     * <code>INVALID_DEVCTRL = 0;</code>
     */
    public static final int INVALID_DEVCTRL_VALUE = 0;
    /**
     * <code>RESET_DEV = 1;</code>
     */
    public static final int RESET_DEV_VALUE = 1;
    /**
     * <code>RESET_APP = 2;</code>
     */
    public static final int RESET_APP_VALUE = 2;
    /**
     * <pre>
     * set corresponding content with update_addr
     * </pre>
     *
     * <code>UPDATE_APP = 3;</code>
     */
    public static final int UPDATE_APP_VALUE = 3;
    /**
     * <code>UPDATE_SYS = 4;</code>
     */
    public static final int UPDATE_SYS_VALUE = 4;
    /**
     * <code>SCREEN_SHOT = 5;</code>
     */
    public static final int SCREEN_SHOT_VALUE = 5;
    /**
     * <code>LOG_EXPORT = 6;</code>
     */
    public static final int LOG_EXPORT_VALUE = 6;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DevCtrlEnum valueOf(int value) {
      return forNumber(value);
    }

    public static DevCtrlEnum forNumber(int value) {
      switch (value) {
        case 0: return INVALID_DEVCTRL;
        case 1: return RESET_DEV;
        case 2: return RESET_APP;
        case 3: return UPDATE_APP;
        case 4: return UPDATE_SYS;
        case 5: return SCREEN_SHOT;
        case 6: return LOG_EXPORT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DevCtrlEnum>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        DevCtrlEnum> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DevCtrlEnum>() {
            public DevCtrlEnum findValueByNumber(int number) {
              return DevCtrlEnum.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.ceiv.communication.NetMgrDefine.getDescriptor().getEnumTypes().get(2);
    }

    private static final DevCtrlEnum[] VALUES = values();

    public static DevCtrlEnum valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private DevCtrlEnum(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:com.ceiv.communication.DevCtrlEnum)
  }

  /**
   * Protobuf enum {@code com.ceiv.communication.MediaOptEnum}
   */
  public enum MediaOptEnum
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>Invalid_MediaOpt = 0;</code>
     */
    Invalid_MediaOpt(0),
    /**
     * <code>Inquire_Media_All = 1;</code>
     */
    Inquire_Media_All(1),
    /**
     * <code>Remove_Media = 2;</code>
     */
    Remove_Media(2),
    /**
     * <code>Empty_Media_ByType = 3;</code>
     */
    Empty_Media_ByType(3),
    /**
     * <code>Download_Media_ByName = 4;</code>
     */
    Download_Media_ByName(4),
    /**
     * <code>Upload_Media_ByAddr = 5;</code>
     */
    Upload_Media_ByAddr(5),
    ;

    /**
     * <code>Invalid_MediaOpt = 0;</code>
     */
    public static final int Invalid_MediaOpt_VALUE = 0;
    /**
     * <code>Inquire_Media_All = 1;</code>
     */
    public static final int Inquire_Media_All_VALUE = 1;
    /**
     * <code>Remove_Media = 2;</code>
     */
    public static final int Remove_Media_VALUE = 2;
    /**
     * <code>Empty_Media_ByType = 3;</code>
     */
    public static final int Empty_Media_ByType_VALUE = 3;
    /**
     * <code>Download_Media_ByName = 4;</code>
     */
    public static final int Download_Media_ByName_VALUE = 4;
    /**
     * <code>Upload_Media_ByAddr = 5;</code>
     */
    public static final int Upload_Media_ByAddr_VALUE = 5;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static MediaOptEnum valueOf(int value) {
      return forNumber(value);
    }

    public static MediaOptEnum forNumber(int value) {
      switch (value) {
        case 0: return Invalid_MediaOpt;
        case 1: return Inquire_Media_All;
        case 2: return Remove_Media;
        case 3: return Empty_Media_ByType;
        case 4: return Download_Media_ByName;
        case 5: return Upload_Media_ByAddr;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MediaOptEnum>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MediaOptEnum> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MediaOptEnum>() {
            public MediaOptEnum findValueByNumber(int number) {
              return MediaOptEnum.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.ceiv.communication.NetMgrDefine.getDescriptor().getEnumTypes().get(3);
    }

    private static final MediaOptEnum[] VALUES = values();

    public static MediaOptEnum valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private MediaOptEnum(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:com.ceiv.communication.MediaOptEnum)
  }

  /**
   * Protobuf enum {@code com.ceiv.communication.MediaTypeEnum}
   */
  public enum MediaTypeEnum
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>VIDEO = 0;</code>
     */
    VIDEO(0),
    /**
     * <code>PIC = 1;</code>
     */
    PIC(1),
    /**
     * <code>TEXT = 2;</code>
     */
    TEXT(2),
    ;

    /**
     * <code>VIDEO = 0;</code>
     */
    public static final int VIDEO_VALUE = 0;
    /**
     * <code>PIC = 1;</code>
     */
    public static final int PIC_VALUE = 1;
    /**
     * <code>TEXT = 2;</code>
     */
    public static final int TEXT_VALUE = 2;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static MediaTypeEnum valueOf(int value) {
      return forNumber(value);
    }

    public static MediaTypeEnum forNumber(int value) {
      switch (value) {
        case 0: return VIDEO;
        case 1: return PIC;
        case 2: return TEXT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MediaTypeEnum>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MediaTypeEnum> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MediaTypeEnum>() {
            public MediaTypeEnum findValueByNumber(int number) {
              return MediaTypeEnum.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.ceiv.communication.NetMgrDefine.getDescriptor().getEnumTypes().get(4);
    }

    private static final MediaTypeEnum[] VALUES = values();

    public static MediaTypeEnum valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private MediaTypeEnum(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:com.ceiv.communication.MediaTypeEnum)
  }

  /**
   * Protobuf enum {@code com.ceiv.communication.PlayListOptEnum}
   */
  public enum PlayListOptEnum
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>Invalid_PlaylistOpt = 0;</code>
     */
    Invalid_PlaylistOpt(0),
    /**
     * <code>Inquire_PlayList_All = 1;</code>
     */
    Inquire_PlayList_All(1),
    /**
     * <code>Remove_PlayList_ByName = 2;</code>
     */
    Remove_PlayList_ByName(2),
    /**
     * <code>Empty_PlayList = 3;</code>
     */
    Empty_PlayList(3),
    /**
     * <code>Add_PlayList_ByName = 4;</code>
     */
    Add_PlayList_ByName(4),
    ;

    /**
     * <code>Invalid_PlaylistOpt = 0;</code>
     */
    public static final int Invalid_PlaylistOpt_VALUE = 0;
    /**
     * <code>Inquire_PlayList_All = 1;</code>
     */
    public static final int Inquire_PlayList_All_VALUE = 1;
    /**
     * <code>Remove_PlayList_ByName = 2;</code>
     */
    public static final int Remove_PlayList_ByName_VALUE = 2;
    /**
     * <code>Empty_PlayList = 3;</code>
     */
    public static final int Empty_PlayList_VALUE = 3;
    /**
     * <code>Add_PlayList_ByName = 4;</code>
     */
    public static final int Add_PlayList_ByName_VALUE = 4;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static PlayListOptEnum valueOf(int value) {
      return forNumber(value);
    }

    public static PlayListOptEnum forNumber(int value) {
      switch (value) {
        case 0: return Invalid_PlaylistOpt;
        case 1: return Inquire_PlayList_All;
        case 2: return Remove_PlayList_ByName;
        case 3: return Empty_PlayList;
        case 4: return Add_PlayList_ByName;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PlayListOptEnum>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PlayListOptEnum> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PlayListOptEnum>() {
            public PlayListOptEnum findValueByNumber(int number) {
              return PlayListOptEnum.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.ceiv.communication.NetMgrDefine.getDescriptor().getEnumTypes().get(5);
    }

    private static final PlayListOptEnum[] VALUES = values();

    public static PlayListOptEnum valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private PlayListOptEnum(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:com.ceiv.communication.PlayListOptEnum)
  }

  /**
   * Protobuf enum {@code com.ceiv.communication.StatisticOptEnum}
   */
  public enum StatisticOptEnum
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>INVALID_StaOpt = 0;</code>
     */
    INVALID_StaOpt(0),
    /**
     * <code>Inquire_Count_All = 1;</code>
     */
    Inquire_Count_All(1),
    /**
     * <code>Inquire_Count_ByPlayList = 2;</code>
     */
    Inquire_Count_ByPlayList(2),
    /**
     * <code>Inquire_Count_ByPlayList_AndMedia = 3;</code>
     */
    Inquire_Count_ByPlayList_AndMedia(3),
    ;

    /**
     * <code>INVALID_StaOpt = 0;</code>
     */
    public static final int INVALID_StaOpt_VALUE = 0;
    /**
     * <code>Inquire_Count_All = 1;</code>
     */
    public static final int Inquire_Count_All_VALUE = 1;
    /**
     * <code>Inquire_Count_ByPlayList = 2;</code>
     */
    public static final int Inquire_Count_ByPlayList_VALUE = 2;
    /**
     * <code>Inquire_Count_ByPlayList_AndMedia = 3;</code>
     */
    public static final int Inquire_Count_ByPlayList_AndMedia_VALUE = 3;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static StatisticOptEnum valueOf(int value) {
      return forNumber(value);
    }

    public static StatisticOptEnum forNumber(int value) {
      switch (value) {
        case 0: return INVALID_StaOpt;
        case 1: return Inquire_Count_All;
        case 2: return Inquire_Count_ByPlayList;
        case 3: return Inquire_Count_ByPlayList_AndMedia;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<StatisticOptEnum>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        StatisticOptEnum> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<StatisticOptEnum>() {
            public StatisticOptEnum findValueByNumber(int number) {
              return StatisticOptEnum.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.ceiv.communication.NetMgrDefine.getDescriptor().getEnumTypes().get(6);
    }

    private static final StatisticOptEnum[] VALUES = values();

    public static StatisticOptEnum valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private StatisticOptEnum(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:com.ceiv.communication.StatisticOptEnum)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022NetMgrDefine.proto\022\026com.ceiv.communica" +
      "tion*0\n\020MulticastOptEnum\022\016\n\nSEARCH_DEV\020\000" +
      "\022\014\n\010DBG_MODE\020\001*`\n\017LoggerLevelEnum\022\017\n\013INV" +
      "ALID_LOG\020\000\022\t\n\005CLOSE\020\001\022\007\n\003DBG\020\002\022\010\n\004INFO\020\003" +
      "\022\010\n\004WARN\020\004\022\t\n\005ERROR\020\005\022\t\n\005FATAL\020\006*\201\001\n\013Dev" +
      "CtrlEnum\022\023\n\017INVALID_DEVCTRL\020\000\022\r\n\tRESET_D" +
      "EV\020\001\022\r\n\tRESET_APP\020\002\022\016\n\nUPDATE_APP\020\003\022\016\n\nU" +
      "PDATE_SYS\020\004\022\017\n\013SCREEN_SHOT\020\005\022\016\n\nLOG_EXPO" +
      "RT\020\006*\231\001\n\014MediaOptEnum\022\024\n\020Invalid_MediaOp" +
      "t\020\000\022\025\n\021Inquire_Media_All\020\001\022\020\n\014Remove_Med" +
      "ia\020\002\022\026\n\022Empty_Media_ByType\020\003\022\031\n\025Download" +
      "_Media_ByName\020\004\022\027\n\023Upload_Media_ByAddr\020\005" +
      "*-\n\rMediaTypeEnum\022\t\n\005VIDEO\020\000\022\007\n\003PIC\020\001\022\010\n" +
      "\004TEXT\020\002*\215\001\n\017PlayListOptEnum\022\027\n\023Invalid_P" +
      "laylistOpt\020\000\022\030\n\024Inquire_PlayList_All\020\001\022\032" +
      "\n\026Remove_PlayList_ByName\020\002\022\022\n\016Empty_Play" +
      "List\020\003\022\027\n\023Add_PlayList_ByName\020\004*\202\001\n\020Stat" +
      "isticOptEnum\022\022\n\016INVALID_StaOpt\020\000\022\025\n\021Inqu" +
      "ire_Count_All\020\001\022\034\n\030Inquire_Count_ByPlayL" +
      "ist\020\002\022%\n!Inquire_Count_ByPlayList_AndMed" +
      "ia\020\003"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
