package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtBC_ALBREC_Level1Item extends GxSilentTrnSdt
{
   public SdtBC_ALBREC_Level1Item( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtBC_ALBREC_Level1Item.class));
   }

   public SdtBC_ALBREC_Level1Item( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle, context, "SdtBC_ALBREC_Level1Item");
      initialize( remoteHandle) ;
   }

   public SdtBC_ALBREC_Level1Item( int remoteHandle ,
                                   StructSdtBC_ALBREC_Level1Item struct )
   {
      this(remoteHandle);
      setStruct(struct);
   }

   public SdtBC_ALBREC_Level1Item( )
   {
      super( new ModelContext(SdtBC_ALBREC_Level1Item.class), "SdtBC_ALBREC_Level1Item");
      initialize( ) ;
   }

   private static java.util.HashMap mapper = new java.util.HashMap();
   static
   {
   }

   public String getJsonMap( String value )
   {
      return (String) mapper.get(value);
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"AlbRLin", byte.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "Level1Item");
      metadata.set("BT", "TXPALBROB");
      metadata.set("PK", "[ \"AlbRLin\" ]");
      metadata.set("PKAssigned", "[ \"AlbRLin\" ]");
      metadata.set("FKList", "[ { \"FK\":[ \"EmprCod\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"AlbRecCod\" ],\"FKMap\":[  ] } ]");
      metadata.set("AllowInsert", "True");
      metadata.set("AllowUpdate", "True");
      metadata.set("AllowDelete", "True");
      return metadata ;
   }

   public short readxml( com.genexus.xml.XMLReader oReader ,
                         String sName )
   {
      short GXSoapError = 1;
      formatError = false ;
      sTagName = oReader.getName() ;
      if ( oReader.getIsSimple() == 0 )
      {
         GXSoapError = oReader.read() ;
         nOutParmCount = (short)(0) ;
         while ( ( ( GXutil.strcmp(oReader.getName(), sTagName) != 0 ) || ( oReader.getNodeType() == 1 ) ) && ( GXSoapError > 0 ) )
         {
            readOk = (short)(0) ;
            readElement = false ;
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRLin") )
            {
               gxTv_SdtBC_ALBREC_Level1Item_Albrlin = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRObs") )
            {
               gxTv_SdtBC_ALBREC_Level1Item_Albrobs = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtBC_ALBREC_Level1Item_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Modified") )
            {
               gxTv_SdtBC_ALBREC_Level1Item_Modified = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtBC_ALBREC_Level1Item_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRLin_Z") )
            {
               gxTv_SdtBC_ALBREC_Level1Item_Albrlin_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRObs_Z") )
            {
               gxTv_SdtBC_ALBREC_Level1Item_Albrobs_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( ! readElement )
            {
               readOk = (short)(1) ;
               GXSoapError = oReader.read() ;
            }
            nOutParmCount = (short)(nOutParmCount+1) ;
            if ( ( readOk == 0 ) || formatError )
            {
               context.globals.sSOAPErrMsg += "Error reading " + sTagName + GXutil.newLine( ) ;
               context.globals.sSOAPErrMsg += "Message: " + oReader.readRawXML() ;
               GXSoapError = (short)(nOutParmCount*-1) ;
            }
         }
      }
      return GXSoapError ;
   }

   public void writexml( com.genexus.xml.XMLWriter oWriter ,
                         String sName ,
                         String sNameSpace )
   {
      writexml(oWriter, sName, sNameSpace, true);
   }

   public void writexml( com.genexus.xml.XMLWriter oWriter ,
                         String sName ,
                         String sNameSpace ,
                         boolean sIncludeState )
   {
      if ( (GXutil.strcmp("", sName)==0) )
      {
         sName = "BC_ALBREC.Level1Item" ;
      }
      oWriter.writeStartElement(sName);
      if ( GXutil.strcmp(GXutil.left( sNameSpace, 10), "[*:nosend]") != 0 )
      {
         oWriter.writeAttribute("xmlns", sNameSpace);
      }
      else
      {
         sNameSpace = GXutil.right( sNameSpace, GXutil.len( sNameSpace)-10) ;
      }
      oWriter.writeElement("AlbRLin", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Level1Item_Albrlin, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRObs", gxTv_SdtBC_ALBREC_Level1Item_Albrobs);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", gxTv_SdtBC_ALBREC_Level1Item_Mode);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Modified", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Level1Item_Modified, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Level1Item_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRLin_Z", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Level1Item_Albrlin_Z, 2, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRObs_Z", gxTv_SdtBC_ALBREC_Level1Item_Albrobs_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeEndElement();
   }

   public long getnumericvalue( String value )
   {
      if ( GXutil.notNumeric( value) )
      {
         formatError = true ;
      }
      return GXutil.lval( value) ;
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      tojson( includeState, true) ;
   }

   public void tojson( boolean includeState ,
                       boolean includeNonInitialized )
   {
      AddObjectProperty("AlbRLin", gxTv_SdtBC_ALBREC_Level1Item_Albrlin, false, includeNonInitialized);
      AddObjectProperty("AlbRObs", gxTv_SdtBC_ALBREC_Level1Item_Albrobs, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtBC_ALBREC_Level1Item_Mode, false, includeNonInitialized);
         AddObjectProperty("Modified", gxTv_SdtBC_ALBREC_Level1Item_Modified, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_SdtBC_ALBREC_Level1Item_Initialized, false, includeNonInitialized);
         AddObjectProperty("AlbRLin_Z", gxTv_SdtBC_ALBREC_Level1Item_Albrlin_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRObs_Z", gxTv_SdtBC_ALBREC_Level1Item_Albrobs_Z, false, includeNonInitialized);
      }
   }

   public void updateDirties( app.SdtBC_ALBREC_Level1Item sdt )
   {
      if ( sdt.IsDirty("AlbRLin") )
      {
         gxTv_SdtBC_ALBREC_Level1Item_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Level1Item_Albrlin = sdt.getgxTv_SdtBC_ALBREC_Level1Item_Albrlin() ;
      }
      if ( sdt.IsDirty("AlbRObs") )
      {
         gxTv_SdtBC_ALBREC_Level1Item_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Level1Item_Albrobs = sdt.getgxTv_SdtBC_ALBREC_Level1Item_Albrobs() ;
      }
   }

   public byte getgxTv_SdtBC_ALBREC_Level1Item_Albrlin( )
   {
      return gxTv_SdtBC_ALBREC_Level1Item_Albrlin ;
   }

   public void setgxTv_SdtBC_ALBREC_Level1Item_Albrlin( byte value )
   {
      gxTv_SdtBC_ALBREC_Level1Item_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Level1Item_Modified = (short)(1) ;
      SetDirty("Albrlin");
      gxTv_SdtBC_ALBREC_Level1Item_Albrlin = value ;
   }

   public String getgxTv_SdtBC_ALBREC_Level1Item_Albrobs( )
   {
      return gxTv_SdtBC_ALBREC_Level1Item_Albrobs ;
   }

   public void setgxTv_SdtBC_ALBREC_Level1Item_Albrobs( String value )
   {
      gxTv_SdtBC_ALBREC_Level1Item_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Level1Item_Modified = (short)(1) ;
      SetDirty("Albrobs");
      gxTv_SdtBC_ALBREC_Level1Item_Albrobs = value ;
   }

   public String getgxTv_SdtBC_ALBREC_Level1Item_Mode( )
   {
      return gxTv_SdtBC_ALBREC_Level1Item_Mode ;
   }

   public void setgxTv_SdtBC_ALBREC_Level1Item_Mode( String value )
   {
      gxTv_SdtBC_ALBREC_Level1Item_N = (byte)(0) ;
      SetDirty("Mode");
      gxTv_SdtBC_ALBREC_Level1Item_Mode = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Level1Item_Mode_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Level1Item_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_SdtBC_ALBREC_Level1Item_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtBC_ALBREC_Level1Item_Modified( )
   {
      return gxTv_SdtBC_ALBREC_Level1Item_Modified ;
   }

   public void setgxTv_SdtBC_ALBREC_Level1Item_Modified( short value )
   {
      gxTv_SdtBC_ALBREC_Level1Item_N = (byte)(0) ;
      SetDirty("Modified");
      gxTv_SdtBC_ALBREC_Level1Item_Modified = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Level1Item_Modified_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Level1Item_Modified = (short)(0) ;
      SetDirty("Modified");
   }

   public boolean getgxTv_SdtBC_ALBREC_Level1Item_Modified_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtBC_ALBREC_Level1Item_Initialized( )
   {
      return gxTv_SdtBC_ALBREC_Level1Item_Initialized ;
   }

   public void setgxTv_SdtBC_ALBREC_Level1Item_Initialized( short value )
   {
      gxTv_SdtBC_ALBREC_Level1Item_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Level1Item_Modified = (short)(1) ;
      SetDirty("Initialized");
      gxTv_SdtBC_ALBREC_Level1Item_Initialized = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Level1Item_Initialized_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Level1Item_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_SdtBC_ALBREC_Level1Item_Initialized_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtBC_ALBREC_Level1Item_Albrlin_Z( )
   {
      return gxTv_SdtBC_ALBREC_Level1Item_Albrlin_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Level1Item_Albrlin_Z( byte value )
   {
      gxTv_SdtBC_ALBREC_Level1Item_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Level1Item_Modified = (short)(1) ;
      SetDirty("Albrlin_Z");
      gxTv_SdtBC_ALBREC_Level1Item_Albrlin_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Level1Item_Albrlin_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Level1Item_Albrlin_Z = (byte)(0) ;
      SetDirty("Albrlin_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Level1Item_Albrlin_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtBC_ALBREC_Level1Item_Albrobs_Z( )
   {
      return gxTv_SdtBC_ALBREC_Level1Item_Albrobs_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Level1Item_Albrobs_Z( String value )
   {
      gxTv_SdtBC_ALBREC_Level1Item_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Level1Item_Modified = (short)(1) ;
      SetDirty("Albrobs_Z");
      gxTv_SdtBC_ALBREC_Level1Item_Albrobs_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Level1Item_Albrobs_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Level1Item_Albrobs_Z = "" ;
      SetDirty("Albrobs_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Level1Item_Albrobs_Z_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtBC_ALBREC_Level1Item_N = (byte)(1) ;
      gxTv_SdtBC_ALBREC_Level1Item_Albrobs = "" ;
      gxTv_SdtBC_ALBREC_Level1Item_Mode = "" ;
      gxTv_SdtBC_ALBREC_Level1Item_Albrobs_Z = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtBC_ALBREC_Level1Item_N ;
   }

   public app.SdtBC_ALBREC_Level1Item Clone( )
   {
      return (app.SdtBC_ALBREC_Level1Item)(clone()) ;
   }

   public void setStruct( app.StructSdtBC_ALBREC_Level1Item struct )
   {
      setgxTv_SdtBC_ALBREC_Level1Item_Albrlin(struct.getAlbrlin());
      setgxTv_SdtBC_ALBREC_Level1Item_Albrobs(struct.getAlbrobs());
      setgxTv_SdtBC_ALBREC_Level1Item_Mode(struct.getMode());
      setgxTv_SdtBC_ALBREC_Level1Item_Modified(struct.getModified());
      setgxTv_SdtBC_ALBREC_Level1Item_Initialized(struct.getInitialized());
      setgxTv_SdtBC_ALBREC_Level1Item_Albrlin_Z(struct.getAlbrlin_Z());
      setgxTv_SdtBC_ALBREC_Level1Item_Albrobs_Z(struct.getAlbrobs_Z());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtBC_ALBREC_Level1Item getStruct( )
   {
      app.StructSdtBC_ALBREC_Level1Item struct = new app.StructSdtBC_ALBREC_Level1Item ();
      struct.setAlbrlin(getgxTv_SdtBC_ALBREC_Level1Item_Albrlin());
      struct.setAlbrobs(getgxTv_SdtBC_ALBREC_Level1Item_Albrobs());
      struct.setMode(getgxTv_SdtBC_ALBREC_Level1Item_Mode());
      struct.setModified(getgxTv_SdtBC_ALBREC_Level1Item_Modified());
      struct.setInitialized(getgxTv_SdtBC_ALBREC_Level1Item_Initialized());
      struct.setAlbrlin_Z(getgxTv_SdtBC_ALBREC_Level1Item_Albrlin_Z());
      struct.setAlbrobs_Z(getgxTv_SdtBC_ALBREC_Level1Item_Albrobs_Z());
      return struct ;
   }

   private byte gxTv_SdtBC_ALBREC_Level1Item_Albrlin ;
   private byte gxTv_SdtBC_ALBREC_Level1Item_N ;
   private byte gxTv_SdtBC_ALBREC_Level1Item_Albrlin_Z ;
   private short gxTv_SdtBC_ALBREC_Level1Item_Modified ;
   private short gxTv_SdtBC_ALBREC_Level1Item_Initialized ;
   private short readOk ;
   private short nOutParmCount ;
   private String gxTv_SdtBC_ALBREC_Level1Item_Albrobs ;
   private String gxTv_SdtBC_ALBREC_Level1Item_Mode ;
   private String gxTv_SdtBC_ALBREC_Level1Item_Albrobs_Z ;
   private String sTagName ;
   private boolean readElement ;
   private boolean formatError ;
}

