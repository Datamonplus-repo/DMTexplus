package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtTDevPie1_Level2Item extends GxSilentTrnSdt
{
   public SdtTDevPie1_Level2Item( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtTDevPie1_Level2Item.class));
   }

   public SdtTDevPie1_Level2Item( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle, context, "SdtTDevPie1_Level2Item");
      initialize( remoteHandle) ;
   }

   public SdtTDevPie1_Level2Item( int remoteHandle ,
                                  StructSdtTDevPie1_Level2Item struct )
   {
      this(remoteHandle);
      setStruct(struct);
   }

   public SdtTDevPie1_Level2Item( )
   {
      super( new ModelContext(SdtTDevPie1_Level2Item.class), "SdtTDevPie1_Level2Item");
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
      return (Object[][])(new Object[][]{new Object[]{"DevLin", byte.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "Level2Item");
      metadata.set("BT", "TXPDEVOBS");
      metadata.set("PK", "[ \"DevLin\" ]");
      metadata.set("PKAssigned", "[ \"DevLin\" ]");
      metadata.set("FKList", "[ { \"FK\":[ \"EmprCod\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"DevGenCod\" ],\"FKMap\":[  ] } ]");
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "DevLin") )
            {
               gxTv_SdtTDevPie1_Level2Item_Devlin = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DevObs") )
            {
               gxTv_SdtTDevPie1_Level2Item_Devobs = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtTDevPie1_Level2Item_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Modified") )
            {
               gxTv_SdtTDevPie1_Level2Item_Modified = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtTDevPie1_Level2Item_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DevLin_Z") )
            {
               gxTv_SdtTDevPie1_Level2Item_Devlin_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DevObs_Z") )
            {
               gxTv_SdtTDevPie1_Level2Item_Devobs_Z = oReader.getValue() ;
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
         sName = "TDevPie1.Level2Item" ;
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
      oWriter.writeElement("DevLin", GXutil.trim( GXutil.str( gxTv_SdtTDevPie1_Level2Item_Devlin, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DevObs", gxTv_SdtTDevPie1_Level2Item_Devobs);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", gxTv_SdtTDevPie1_Level2Item_Mode);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Modified", GXutil.trim( GXutil.str( gxTv_SdtTDevPie1_Level2Item_Modified, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtTDevPie1_Level2Item_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DevLin_Z", GXutil.trim( GXutil.str( gxTv_SdtTDevPie1_Level2Item_Devlin_Z, 2, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DevObs_Z", gxTv_SdtTDevPie1_Level2Item_Devobs_Z);
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
      AddObjectProperty("DevLin", gxTv_SdtTDevPie1_Level2Item_Devlin, false, includeNonInitialized);
      AddObjectProperty("DevObs", gxTv_SdtTDevPie1_Level2Item_Devobs, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtTDevPie1_Level2Item_Mode, false, includeNonInitialized);
         AddObjectProperty("Modified", gxTv_SdtTDevPie1_Level2Item_Modified, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_SdtTDevPie1_Level2Item_Initialized, false, includeNonInitialized);
         AddObjectProperty("DevLin_Z", gxTv_SdtTDevPie1_Level2Item_Devlin_Z, false, includeNonInitialized);
         AddObjectProperty("DevObs_Z", gxTv_SdtTDevPie1_Level2Item_Devobs_Z, false, includeNonInitialized);
      }
   }

   public void updateDirties( app.SdtTDevPie1_Level2Item sdt )
   {
      if ( sdt.IsDirty("DevLin") )
      {
         gxTv_SdtTDevPie1_Level2Item_N = (byte)(0) ;
         gxTv_SdtTDevPie1_Level2Item_Devlin = sdt.getgxTv_SdtTDevPie1_Level2Item_Devlin() ;
      }
      if ( sdt.IsDirty("DevObs") )
      {
         gxTv_SdtTDevPie1_Level2Item_N = (byte)(0) ;
         gxTv_SdtTDevPie1_Level2Item_Devobs = sdt.getgxTv_SdtTDevPie1_Level2Item_Devobs() ;
      }
   }

   public byte getgxTv_SdtTDevPie1_Level2Item_Devlin( )
   {
      return gxTv_SdtTDevPie1_Level2Item_Devlin ;
   }

   public void setgxTv_SdtTDevPie1_Level2Item_Devlin( byte value )
   {
      gxTv_SdtTDevPie1_Level2Item_N = (byte)(0) ;
      gxTv_SdtTDevPie1_Level2Item_Modified = (short)(1) ;
      SetDirty("Devlin");
      gxTv_SdtTDevPie1_Level2Item_Devlin = value ;
   }

   public String getgxTv_SdtTDevPie1_Level2Item_Devobs( )
   {
      return gxTv_SdtTDevPie1_Level2Item_Devobs ;
   }

   public void setgxTv_SdtTDevPie1_Level2Item_Devobs( String value )
   {
      gxTv_SdtTDevPie1_Level2Item_N = (byte)(0) ;
      gxTv_SdtTDevPie1_Level2Item_Modified = (short)(1) ;
      SetDirty("Devobs");
      gxTv_SdtTDevPie1_Level2Item_Devobs = value ;
   }

   public String getgxTv_SdtTDevPie1_Level2Item_Mode( )
   {
      return gxTv_SdtTDevPie1_Level2Item_Mode ;
   }

   public void setgxTv_SdtTDevPie1_Level2Item_Mode( String value )
   {
      gxTv_SdtTDevPie1_Level2Item_N = (byte)(0) ;
      SetDirty("Mode");
      gxTv_SdtTDevPie1_Level2Item_Mode = value ;
   }

   public void setgxTv_SdtTDevPie1_Level2Item_Mode_SetNull( )
   {
      gxTv_SdtTDevPie1_Level2Item_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_SdtTDevPie1_Level2Item_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTDevPie1_Level2Item_Modified( )
   {
      return gxTv_SdtTDevPie1_Level2Item_Modified ;
   }

   public void setgxTv_SdtTDevPie1_Level2Item_Modified( short value )
   {
      gxTv_SdtTDevPie1_Level2Item_N = (byte)(0) ;
      SetDirty("Modified");
      gxTv_SdtTDevPie1_Level2Item_Modified = value ;
   }

   public void setgxTv_SdtTDevPie1_Level2Item_Modified_SetNull( )
   {
      gxTv_SdtTDevPie1_Level2Item_Modified = (short)(0) ;
      SetDirty("Modified");
   }

   public boolean getgxTv_SdtTDevPie1_Level2Item_Modified_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTDevPie1_Level2Item_Initialized( )
   {
      return gxTv_SdtTDevPie1_Level2Item_Initialized ;
   }

   public void setgxTv_SdtTDevPie1_Level2Item_Initialized( short value )
   {
      gxTv_SdtTDevPie1_Level2Item_N = (byte)(0) ;
      gxTv_SdtTDevPie1_Level2Item_Modified = (short)(1) ;
      SetDirty("Initialized");
      gxTv_SdtTDevPie1_Level2Item_Initialized = value ;
   }

   public void setgxTv_SdtTDevPie1_Level2Item_Initialized_SetNull( )
   {
      gxTv_SdtTDevPie1_Level2Item_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_SdtTDevPie1_Level2Item_Initialized_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTDevPie1_Level2Item_Devlin_Z( )
   {
      return gxTv_SdtTDevPie1_Level2Item_Devlin_Z ;
   }

   public void setgxTv_SdtTDevPie1_Level2Item_Devlin_Z( byte value )
   {
      gxTv_SdtTDevPie1_Level2Item_N = (byte)(0) ;
      gxTv_SdtTDevPie1_Level2Item_Modified = (short)(1) ;
      SetDirty("Devlin_Z");
      gxTv_SdtTDevPie1_Level2Item_Devlin_Z = value ;
   }

   public void setgxTv_SdtTDevPie1_Level2Item_Devlin_Z_SetNull( )
   {
      gxTv_SdtTDevPie1_Level2Item_Devlin_Z = (byte)(0) ;
      SetDirty("Devlin_Z");
   }

   public boolean getgxTv_SdtTDevPie1_Level2Item_Devlin_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTDevPie1_Level2Item_Devobs_Z( )
   {
      return gxTv_SdtTDevPie1_Level2Item_Devobs_Z ;
   }

   public void setgxTv_SdtTDevPie1_Level2Item_Devobs_Z( String value )
   {
      gxTv_SdtTDevPie1_Level2Item_N = (byte)(0) ;
      gxTv_SdtTDevPie1_Level2Item_Modified = (short)(1) ;
      SetDirty("Devobs_Z");
      gxTv_SdtTDevPie1_Level2Item_Devobs_Z = value ;
   }

   public void setgxTv_SdtTDevPie1_Level2Item_Devobs_Z_SetNull( )
   {
      gxTv_SdtTDevPie1_Level2Item_Devobs_Z = "" ;
      SetDirty("Devobs_Z");
   }

   public boolean getgxTv_SdtTDevPie1_Level2Item_Devobs_Z_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtTDevPie1_Level2Item_N = (byte)(1) ;
      gxTv_SdtTDevPie1_Level2Item_Devobs = "" ;
      gxTv_SdtTDevPie1_Level2Item_Mode = "" ;
      gxTv_SdtTDevPie1_Level2Item_Devobs_Z = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtTDevPie1_Level2Item_N ;
   }

   public app.SdtTDevPie1_Level2Item Clone( )
   {
      return (app.SdtTDevPie1_Level2Item)(clone()) ;
   }

   public void setStruct( app.StructSdtTDevPie1_Level2Item struct )
   {
      setgxTv_SdtTDevPie1_Level2Item_Devlin(struct.getDevlin());
      setgxTv_SdtTDevPie1_Level2Item_Devobs(struct.getDevobs());
      setgxTv_SdtTDevPie1_Level2Item_Mode(struct.getMode());
      setgxTv_SdtTDevPie1_Level2Item_Modified(struct.getModified());
      setgxTv_SdtTDevPie1_Level2Item_Initialized(struct.getInitialized());
      setgxTv_SdtTDevPie1_Level2Item_Devlin_Z(struct.getDevlin_Z());
      setgxTv_SdtTDevPie1_Level2Item_Devobs_Z(struct.getDevobs_Z());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtTDevPie1_Level2Item getStruct( )
   {
      app.StructSdtTDevPie1_Level2Item struct = new app.StructSdtTDevPie1_Level2Item ();
      struct.setDevlin(getgxTv_SdtTDevPie1_Level2Item_Devlin());
      struct.setDevobs(getgxTv_SdtTDevPie1_Level2Item_Devobs());
      struct.setMode(getgxTv_SdtTDevPie1_Level2Item_Mode());
      struct.setModified(getgxTv_SdtTDevPie1_Level2Item_Modified());
      struct.setInitialized(getgxTv_SdtTDevPie1_Level2Item_Initialized());
      struct.setDevlin_Z(getgxTv_SdtTDevPie1_Level2Item_Devlin_Z());
      struct.setDevobs_Z(getgxTv_SdtTDevPie1_Level2Item_Devobs_Z());
      return struct ;
   }

   private byte gxTv_SdtTDevPie1_Level2Item_Devlin ;
   private byte gxTv_SdtTDevPie1_Level2Item_N ;
   private byte gxTv_SdtTDevPie1_Level2Item_Devlin_Z ;
   private short gxTv_SdtTDevPie1_Level2Item_Modified ;
   private short gxTv_SdtTDevPie1_Level2Item_Initialized ;
   private short readOk ;
   private short nOutParmCount ;
   private String gxTv_SdtTDevPie1_Level2Item_Devobs ;
   private String gxTv_SdtTDevPie1_Level2Item_Mode ;
   private String gxTv_SdtTDevPie1_Level2Item_Devobs_Z ;
   private String sTagName ;
   private boolean readElement ;
   private boolean formatError ;
}

