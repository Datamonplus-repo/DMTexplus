package app.wwpbaseobjects ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtUserCustom extends GxSilentTrnSdt
{
   public SdtUserCustom( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtUserCustom.class));
   }

   public SdtUserCustom( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle, context, "SdtUserCustom");
      initialize( remoteHandle) ;
   }

   public SdtUserCustom( int remoteHandle ,
                         StructSdtUserCustom struct )
   {
      this(remoteHandle);
      setStruct(struct);
   }

   private static java.util.HashMap mapper = new java.util.HashMap();
   static
   {
   }

   public String getJsonMap( String value )
   {
      return (String) mapper.get(value);
   }

   public void Load( String AV14365SecUserId ,
                     String AV14369UsrCusKey )
   {
      IGxSilentTrn obj;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {AV14365SecUserId,AV14369UsrCusKey});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"SecUserId", String.class}, new Object[]{"UsrCusKey", String.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "WWPBaseObjects\\UserCustom");
      metadata.set("BT", "TXPUSRECU");
      metadata.set("PK", "[ \"SecUserId\",\"UsrCusKey\" ]");
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "SecUserId") )
            {
               gxTv_SdtUserCustom_Secuserid = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsrCusKey") )
            {
               gxTv_SdtUserCustom_Usrcuskey = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsrCusVal") )
            {
               gxTv_SdtUserCustom_Usrcusval = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtUserCustom_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtUserCustom_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SecUserId_Z") )
            {
               gxTv_SdtUserCustom_Secuserid_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsrCusKey_Z") )
            {
               gxTv_SdtUserCustom_Usrcuskey_Z = oReader.getValue() ;
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
         sName = "UserCustom" ;
      }
      if ( (GXutil.strcmp("", sNameSpace)==0) )
      {
         sNameSpace = "TexplusNET" ;
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
      oWriter.writeElement("SecUserId", gxTv_SdtUserCustom_Secuserid);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("UsrCusKey", gxTv_SdtUserCustom_Usrcuskey);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("UsrCusVal", gxTv_SdtUserCustom_Usrcusval);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", gxTv_SdtUserCustom_Mode);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtUserCustom_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("SecUserId_Z", gxTv_SdtUserCustom_Secuserid_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("UsrCusKey_Z", gxTv_SdtUserCustom_Usrcuskey_Z);
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
      AddObjectProperty("SecUserId", gxTv_SdtUserCustom_Secuserid, false, includeNonInitialized);
      AddObjectProperty("UsrCusKey", gxTv_SdtUserCustom_Usrcuskey, false, includeNonInitialized);
      AddObjectProperty("UsrCusVal", gxTv_SdtUserCustom_Usrcusval, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtUserCustom_Mode, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_SdtUserCustom_Initialized, false, includeNonInitialized);
         AddObjectProperty("SecUserId_Z", gxTv_SdtUserCustom_Secuserid_Z, false, includeNonInitialized);
         AddObjectProperty("UsrCusKey_Z", gxTv_SdtUserCustom_Usrcuskey_Z, false, includeNonInitialized);
      }
   }

   public void updateDirties( app.wwpbaseobjects.SdtUserCustom sdt )
   {
      if ( sdt.IsDirty("SecUserId") )
      {
         gxTv_SdtUserCustom_N = (byte)(0) ;
         gxTv_SdtUserCustom_Secuserid = sdt.getgxTv_SdtUserCustom_Secuserid() ;
      }
      if ( sdt.IsDirty("UsrCusKey") )
      {
         gxTv_SdtUserCustom_N = (byte)(0) ;
         gxTv_SdtUserCustom_Usrcuskey = sdt.getgxTv_SdtUserCustom_Usrcuskey() ;
      }
      if ( sdt.IsDirty("UsrCusVal") )
      {
         gxTv_SdtUserCustom_N = (byte)(0) ;
         gxTv_SdtUserCustom_Usrcusval = sdt.getgxTv_SdtUserCustom_Usrcusval() ;
      }
   }

   public String getgxTv_SdtUserCustom_Secuserid( )
   {
      return gxTv_SdtUserCustom_Secuserid ;
   }

   public void setgxTv_SdtUserCustom_Secuserid( String value )
   {
      gxTv_SdtUserCustom_N = (byte)(0) ;
      if ( GXutil.strcmp(gxTv_SdtUserCustom_Secuserid, value) != 0 )
      {
         gxTv_SdtUserCustom_Mode = "INS" ;
         this.setgxTv_SdtUserCustom_Secuserid_Z_SetNull( );
         this.setgxTv_SdtUserCustom_Usrcuskey_Z_SetNull( );
      }
      SetDirty("Secuserid");
      gxTv_SdtUserCustom_Secuserid = value ;
   }

   public String getgxTv_SdtUserCustom_Usrcuskey( )
   {
      return gxTv_SdtUserCustom_Usrcuskey ;
   }

   public void setgxTv_SdtUserCustom_Usrcuskey( String value )
   {
      gxTv_SdtUserCustom_N = (byte)(0) ;
      if ( GXutil.strcmp(gxTv_SdtUserCustom_Usrcuskey, value) != 0 )
      {
         gxTv_SdtUserCustom_Mode = "INS" ;
         this.setgxTv_SdtUserCustom_Secuserid_Z_SetNull( );
         this.setgxTv_SdtUserCustom_Usrcuskey_Z_SetNull( );
      }
      SetDirty("Usrcuskey");
      gxTv_SdtUserCustom_Usrcuskey = value ;
   }

   public String getgxTv_SdtUserCustom_Usrcusval( )
   {
      return gxTv_SdtUserCustom_Usrcusval ;
   }

   public void setgxTv_SdtUserCustom_Usrcusval( String value )
   {
      gxTv_SdtUserCustom_N = (byte)(0) ;
      SetDirty("Usrcusval");
      gxTv_SdtUserCustom_Usrcusval = value ;
   }

   public String getgxTv_SdtUserCustom_Mode( )
   {
      return gxTv_SdtUserCustom_Mode ;
   }

   public void setgxTv_SdtUserCustom_Mode( String value )
   {
      gxTv_SdtUserCustom_N = (byte)(0) ;
      SetDirty("Mode");
      gxTv_SdtUserCustom_Mode = value ;
   }

   public void setgxTv_SdtUserCustom_Mode_SetNull( )
   {
      gxTv_SdtUserCustom_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_SdtUserCustom_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtUserCustom_Initialized( )
   {
      return gxTv_SdtUserCustom_Initialized ;
   }

   public void setgxTv_SdtUserCustom_Initialized( short value )
   {
      gxTv_SdtUserCustom_N = (byte)(0) ;
      SetDirty("Initialized");
      gxTv_SdtUserCustom_Initialized = value ;
   }

   public void setgxTv_SdtUserCustom_Initialized_SetNull( )
   {
      gxTv_SdtUserCustom_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_SdtUserCustom_Initialized_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUserCustom_Secuserid_Z( )
   {
      return gxTv_SdtUserCustom_Secuserid_Z ;
   }

   public void setgxTv_SdtUserCustom_Secuserid_Z( String value )
   {
      gxTv_SdtUserCustom_N = (byte)(0) ;
      SetDirty("Secuserid_Z");
      gxTv_SdtUserCustom_Secuserid_Z = value ;
   }

   public void setgxTv_SdtUserCustom_Secuserid_Z_SetNull( )
   {
      gxTv_SdtUserCustom_Secuserid_Z = "" ;
      SetDirty("Secuserid_Z");
   }

   public boolean getgxTv_SdtUserCustom_Secuserid_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUserCustom_Usrcuskey_Z( )
   {
      return gxTv_SdtUserCustom_Usrcuskey_Z ;
   }

   public void setgxTv_SdtUserCustom_Usrcuskey_Z( String value )
   {
      gxTv_SdtUserCustom_N = (byte)(0) ;
      SetDirty("Usrcuskey_Z");
      gxTv_SdtUserCustom_Usrcuskey_Z = value ;
   }

   public void setgxTv_SdtUserCustom_Usrcuskey_Z_SetNull( )
   {
      gxTv_SdtUserCustom_Usrcuskey_Z = "" ;
      SetDirty("Usrcuskey_Z");
   }

   public boolean getgxTv_SdtUserCustom_Usrcuskey_Z_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      app.wwpbaseobjects.usercustom_bc obj;
      obj = new app.wwpbaseobjects.usercustom_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtUserCustom_Secuserid = "" ;
      gxTv_SdtUserCustom_N = (byte)(1) ;
      gxTv_SdtUserCustom_Usrcuskey = "" ;
      gxTv_SdtUserCustom_Usrcusval = "" ;
      gxTv_SdtUserCustom_Mode = "" ;
      gxTv_SdtUserCustom_Secuserid_Z = "" ;
      gxTv_SdtUserCustom_Usrcuskey_Z = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtUserCustom_N ;
   }

   public app.wwpbaseobjects.SdtUserCustom Clone( )
   {
      app.wwpbaseobjects.SdtUserCustom sdt;
      app.wwpbaseobjects.usercustom_bc obj;
      sdt = (app.wwpbaseobjects.SdtUserCustom)(clone()) ;
      obj = (app.wwpbaseobjects.usercustom_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( app.wwpbaseobjects.StructSdtUserCustom struct )
   {
      setgxTv_SdtUserCustom_Secuserid(struct.getSecuserid());
      setgxTv_SdtUserCustom_Usrcuskey(struct.getUsrcuskey());
      setgxTv_SdtUserCustom_Usrcusval(struct.getUsrcusval());
      setgxTv_SdtUserCustom_Mode(struct.getMode());
      setgxTv_SdtUserCustom_Initialized(struct.getInitialized());
      setgxTv_SdtUserCustom_Secuserid_Z(struct.getSecuserid_Z());
      setgxTv_SdtUserCustom_Usrcuskey_Z(struct.getUsrcuskey_Z());
   }

   @SuppressWarnings("unchecked")
   public app.wwpbaseobjects.StructSdtUserCustom getStruct( )
   {
      app.wwpbaseobjects.StructSdtUserCustom struct = new app.wwpbaseobjects.StructSdtUserCustom ();
      struct.setSecuserid(getgxTv_SdtUserCustom_Secuserid());
      struct.setUsrcuskey(getgxTv_SdtUserCustom_Usrcuskey());
      struct.setUsrcusval(getgxTv_SdtUserCustom_Usrcusval());
      struct.setMode(getgxTv_SdtUserCustom_Mode());
      struct.setInitialized(getgxTv_SdtUserCustom_Initialized());
      struct.setSecuserid_Z(getgxTv_SdtUserCustom_Secuserid_Z());
      struct.setUsrcuskey_Z(getgxTv_SdtUserCustom_Usrcuskey_Z());
      return struct ;
   }

   private byte gxTv_SdtUserCustom_N ;
   private short gxTv_SdtUserCustom_Initialized ;
   private short readOk ;
   private short nOutParmCount ;
   private String gxTv_SdtUserCustom_Mode ;
   private String sTagName ;
   private boolean readElement ;
   private boolean formatError ;
   private String gxTv_SdtUserCustom_Usrcusval ;
   private String gxTv_SdtUserCustom_Secuserid ;
   private String gxTv_SdtUserCustom_Usrcuskey ;
   private String gxTv_SdtUserCustom_Secuserid_Z ;
   private String gxTv_SdtUserCustom_Usrcuskey_Z ;
}

