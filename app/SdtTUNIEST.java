package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtTUNIEST extends GxSilentTrnSdt
{
   public SdtTUNIEST( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtTUNIEST.class));
   }

   public SdtTUNIEST( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle, context, "SdtTUNIEST");
      initialize( remoteHandle) ;
   }

   public SdtTUNIEST( int remoteHandle ,
                      StructSdtTUNIEST struct )
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

   public void Load( String AV2144UniEstCod )
   {
      IGxSilentTrn obj;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {AV2144UniEstCod});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"UniEstCod", String.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "TUNIEST");
      metadata.set("BT", "TXPUNIEST");
      metadata.set("PK", "[ \"UniEstCod\" ]");
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "UniEstCod") )
            {
               gxTv_SdtTUNIEST_Uniestcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UniEstDes") )
            {
               gxTv_SdtTUNIEST_Uniestdes = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UniEstCDes") )
            {
               gxTv_SdtTUNIEST_Uniestcdes = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtTUNIEST_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtTUNIEST_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UniEstCod_Z") )
            {
               gxTv_SdtTUNIEST_Uniestcod_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UniEstDes_Z") )
            {
               gxTv_SdtTUNIEST_Uniestdes_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UniEstCDes_Z") )
            {
               gxTv_SdtTUNIEST_Uniestcdes_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UniEstCod_N") )
            {
               gxTv_SdtTUNIEST_Uniestcod_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UniEstDes_N") )
            {
               gxTv_SdtTUNIEST_Uniestdes_N = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "TUNIEST" ;
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
      oWriter.writeElement("UniEstCod", gxTv_SdtTUNIEST_Uniestcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("UniEstDes", gxTv_SdtTUNIEST_Uniestdes);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("UniEstCDes", gxTv_SdtTUNIEST_Uniestcdes);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", gxTv_SdtTUNIEST_Mode);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtTUNIEST_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("UniEstCod_Z", gxTv_SdtTUNIEST_Uniestcod_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("UniEstDes_Z", gxTv_SdtTUNIEST_Uniestdes_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("UniEstCDes_Z", gxTv_SdtTUNIEST_Uniestcdes_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("UniEstCod_N", GXutil.trim( GXutil.str( gxTv_SdtTUNIEST_Uniestcod_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("UniEstDes_N", GXutil.trim( GXutil.str( gxTv_SdtTUNIEST_Uniestdes_N, 1, 0)));
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
      AddObjectProperty("UniEstCod", gxTv_SdtTUNIEST_Uniestcod, false, includeNonInitialized);
      AddObjectProperty("UniEstCod_N", gxTv_SdtTUNIEST_Uniestcod_N, false, includeNonInitialized);
      AddObjectProperty("UniEstDes", gxTv_SdtTUNIEST_Uniestdes, false, includeNonInitialized);
      AddObjectProperty("UniEstDes_N", gxTv_SdtTUNIEST_Uniestdes_N, false, includeNonInitialized);
      AddObjectProperty("UniEstCDes", gxTv_SdtTUNIEST_Uniestcdes, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtTUNIEST_Mode, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_SdtTUNIEST_Initialized, false, includeNonInitialized);
         AddObjectProperty("UniEstCod_Z", gxTv_SdtTUNIEST_Uniestcod_Z, false, includeNonInitialized);
         AddObjectProperty("UniEstDes_Z", gxTv_SdtTUNIEST_Uniestdes_Z, false, includeNonInitialized);
         AddObjectProperty("UniEstCDes_Z", gxTv_SdtTUNIEST_Uniestcdes_Z, false, includeNonInitialized);
         AddObjectProperty("UniEstCod_N", gxTv_SdtTUNIEST_Uniestcod_N, false, includeNonInitialized);
         AddObjectProperty("UniEstDes_N", gxTv_SdtTUNIEST_Uniestdes_N, false, includeNonInitialized);
      }
   }

   public void updateDirties( app.SdtTUNIEST sdt )
   {
      if ( sdt.IsDirty("UniEstCod") )
      {
         gxTv_SdtTUNIEST_N = (byte)(0) ;
         gxTv_SdtTUNIEST_Uniestcod = sdt.getgxTv_SdtTUNIEST_Uniestcod() ;
      }
      if ( sdt.IsDirty("UniEstDes") )
      {
         gxTv_SdtTUNIEST_Uniestdes_N = sdt.getgxTv_SdtTUNIEST_Uniestdes_N() ;
         gxTv_SdtTUNIEST_N = (byte)(0) ;
         gxTv_SdtTUNIEST_Uniestdes = sdt.getgxTv_SdtTUNIEST_Uniestdes() ;
      }
      if ( sdt.IsDirty("UniEstCDes") )
      {
         gxTv_SdtTUNIEST_N = (byte)(0) ;
         gxTv_SdtTUNIEST_Uniestcdes = sdt.getgxTv_SdtTUNIEST_Uniestcdes() ;
      }
   }

   public String getgxTv_SdtTUNIEST_Uniestcod( )
   {
      return gxTv_SdtTUNIEST_Uniestcod ;
   }

   public void setgxTv_SdtTUNIEST_Uniestcod( String value )
   {
      gxTv_SdtTUNIEST_N = (byte)(0) ;
      if ( GXutil.strcmp(gxTv_SdtTUNIEST_Uniestcod, value) != 0 )
      {
         gxTv_SdtTUNIEST_Mode = "INS" ;
         this.setgxTv_SdtTUNIEST_Uniestcod_Z_SetNull( );
         this.setgxTv_SdtTUNIEST_Uniestdes_Z_SetNull( );
         this.setgxTv_SdtTUNIEST_Uniestcdes_Z_SetNull( );
      }
      SetDirty("Uniestcod");
      gxTv_SdtTUNIEST_Uniestcod = value ;
   }

   public String getgxTv_SdtTUNIEST_Uniestdes( )
   {
      return gxTv_SdtTUNIEST_Uniestdes ;
   }

   public void setgxTv_SdtTUNIEST_Uniestdes( String value )
   {
      gxTv_SdtTUNIEST_Uniestdes_N = (byte)(0) ;
      gxTv_SdtTUNIEST_N = (byte)(0) ;
      SetDirty("Uniestdes");
      gxTv_SdtTUNIEST_Uniestdes = value ;
   }

   public void setgxTv_SdtTUNIEST_Uniestdes_SetNull( )
   {
      gxTv_SdtTUNIEST_Uniestdes_N = (byte)(1) ;
      gxTv_SdtTUNIEST_Uniestdes = "" ;
      SetDirty("Uniestdes");
   }

   public boolean getgxTv_SdtTUNIEST_Uniestdes_IsNull( )
   {
      return (gxTv_SdtTUNIEST_Uniestdes_N==1) ;
   }

   public String getgxTv_SdtTUNIEST_Uniestcdes( )
   {
      return gxTv_SdtTUNIEST_Uniestcdes ;
   }

   public void setgxTv_SdtTUNIEST_Uniestcdes( String value )
   {
      gxTv_SdtTUNIEST_N = (byte)(0) ;
      SetDirty("Uniestcdes");
      gxTv_SdtTUNIEST_Uniestcdes = value ;
   }

   public void setgxTv_SdtTUNIEST_Uniestcdes_SetNull( )
   {
      gxTv_SdtTUNIEST_Uniestcdes = "" ;
      SetDirty("Uniestcdes");
   }

   public boolean getgxTv_SdtTUNIEST_Uniestcdes_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTUNIEST_Mode( )
   {
      return gxTv_SdtTUNIEST_Mode ;
   }

   public void setgxTv_SdtTUNIEST_Mode( String value )
   {
      gxTv_SdtTUNIEST_N = (byte)(0) ;
      SetDirty("Mode");
      gxTv_SdtTUNIEST_Mode = value ;
   }

   public void setgxTv_SdtTUNIEST_Mode_SetNull( )
   {
      gxTv_SdtTUNIEST_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_SdtTUNIEST_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTUNIEST_Initialized( )
   {
      return gxTv_SdtTUNIEST_Initialized ;
   }

   public void setgxTv_SdtTUNIEST_Initialized( short value )
   {
      gxTv_SdtTUNIEST_N = (byte)(0) ;
      SetDirty("Initialized");
      gxTv_SdtTUNIEST_Initialized = value ;
   }

   public void setgxTv_SdtTUNIEST_Initialized_SetNull( )
   {
      gxTv_SdtTUNIEST_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_SdtTUNIEST_Initialized_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTUNIEST_Uniestcod_Z( )
   {
      return gxTv_SdtTUNIEST_Uniestcod_Z ;
   }

   public void setgxTv_SdtTUNIEST_Uniestcod_Z( String value )
   {
      gxTv_SdtTUNIEST_N = (byte)(0) ;
      SetDirty("Uniestcod_Z");
      gxTv_SdtTUNIEST_Uniestcod_Z = value ;
   }

   public void setgxTv_SdtTUNIEST_Uniestcod_Z_SetNull( )
   {
      gxTv_SdtTUNIEST_Uniestcod_Z = "" ;
      SetDirty("Uniestcod_Z");
   }

   public boolean getgxTv_SdtTUNIEST_Uniestcod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTUNIEST_Uniestdes_Z( )
   {
      return gxTv_SdtTUNIEST_Uniestdes_Z ;
   }

   public void setgxTv_SdtTUNIEST_Uniestdes_Z( String value )
   {
      gxTv_SdtTUNIEST_N = (byte)(0) ;
      SetDirty("Uniestdes_Z");
      gxTv_SdtTUNIEST_Uniestdes_Z = value ;
   }

   public void setgxTv_SdtTUNIEST_Uniestdes_Z_SetNull( )
   {
      gxTv_SdtTUNIEST_Uniestdes_Z = "" ;
      SetDirty("Uniestdes_Z");
   }

   public boolean getgxTv_SdtTUNIEST_Uniestdes_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTUNIEST_Uniestcdes_Z( )
   {
      return gxTv_SdtTUNIEST_Uniestcdes_Z ;
   }

   public void setgxTv_SdtTUNIEST_Uniestcdes_Z( String value )
   {
      gxTv_SdtTUNIEST_N = (byte)(0) ;
      SetDirty("Uniestcdes_Z");
      gxTv_SdtTUNIEST_Uniestcdes_Z = value ;
   }

   public void setgxTv_SdtTUNIEST_Uniestcdes_Z_SetNull( )
   {
      gxTv_SdtTUNIEST_Uniestcdes_Z = "" ;
      SetDirty("Uniestcdes_Z");
   }

   public boolean getgxTv_SdtTUNIEST_Uniestcdes_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTUNIEST_Uniestcod_N( )
   {
      return gxTv_SdtTUNIEST_Uniestcod_N ;
   }

   public void setgxTv_SdtTUNIEST_Uniestcod_N( byte value )
   {
      gxTv_SdtTUNIEST_N = (byte)(0) ;
      SetDirty("Uniestcod_N");
      gxTv_SdtTUNIEST_Uniestcod_N = value ;
   }

   public void setgxTv_SdtTUNIEST_Uniestcod_N_SetNull( )
   {
      gxTv_SdtTUNIEST_Uniestcod_N = (byte)(0) ;
      SetDirty("Uniestcod_N");
   }

   public boolean getgxTv_SdtTUNIEST_Uniestcod_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTUNIEST_Uniestdes_N( )
   {
      return gxTv_SdtTUNIEST_Uniestdes_N ;
   }

   public void setgxTv_SdtTUNIEST_Uniestdes_N( byte value )
   {
      gxTv_SdtTUNIEST_N = (byte)(0) ;
      SetDirty("Uniestdes_N");
      gxTv_SdtTUNIEST_Uniestdes_N = value ;
   }

   public void setgxTv_SdtTUNIEST_Uniestdes_N_SetNull( )
   {
      gxTv_SdtTUNIEST_Uniestdes_N = (byte)(0) ;
      SetDirty("Uniestdes_N");
   }

   public boolean getgxTv_SdtTUNIEST_Uniestdes_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      app.tuniest_bc obj;
      obj = new app.tuniest_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtTUNIEST_Uniestcod = "" ;
      gxTv_SdtTUNIEST_N = (byte)(1) ;
      gxTv_SdtTUNIEST_Uniestdes = "" ;
      gxTv_SdtTUNIEST_Uniestcdes = "" ;
      gxTv_SdtTUNIEST_Mode = "" ;
      gxTv_SdtTUNIEST_Uniestcod_Z = "" ;
      gxTv_SdtTUNIEST_Uniestdes_Z = "" ;
      gxTv_SdtTUNIEST_Uniestcdes_Z = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtTUNIEST_N ;
   }

   public app.SdtTUNIEST Clone( )
   {
      app.SdtTUNIEST sdt;
      app.tuniest_bc obj;
      sdt = (app.SdtTUNIEST)(clone()) ;
      obj = (app.tuniest_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( app.StructSdtTUNIEST struct )
   {
      setgxTv_SdtTUNIEST_Uniestcod(struct.getUniestcod());
      setgxTv_SdtTUNIEST_Uniestdes(struct.getUniestdes());
      setgxTv_SdtTUNIEST_Uniestcdes(struct.getUniestcdes());
      setgxTv_SdtTUNIEST_Mode(struct.getMode());
      setgxTv_SdtTUNIEST_Initialized(struct.getInitialized());
      setgxTv_SdtTUNIEST_Uniestcod_Z(struct.getUniestcod_Z());
      setgxTv_SdtTUNIEST_Uniestdes_Z(struct.getUniestdes_Z());
      setgxTv_SdtTUNIEST_Uniestcdes_Z(struct.getUniestcdes_Z());
      setgxTv_SdtTUNIEST_Uniestcod_N(struct.getUniestcod_N());
      setgxTv_SdtTUNIEST_Uniestdes_N(struct.getUniestdes_N());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtTUNIEST getStruct( )
   {
      app.StructSdtTUNIEST struct = new app.StructSdtTUNIEST ();
      struct.setUniestcod(getgxTv_SdtTUNIEST_Uniestcod());
      struct.setUniestdes(getgxTv_SdtTUNIEST_Uniestdes());
      struct.setUniestcdes(getgxTv_SdtTUNIEST_Uniestcdes());
      struct.setMode(getgxTv_SdtTUNIEST_Mode());
      struct.setInitialized(getgxTv_SdtTUNIEST_Initialized());
      struct.setUniestcod_Z(getgxTv_SdtTUNIEST_Uniestcod_Z());
      struct.setUniestdes_Z(getgxTv_SdtTUNIEST_Uniestdes_Z());
      struct.setUniestcdes_Z(getgxTv_SdtTUNIEST_Uniestcdes_Z());
      struct.setUniestcod_N(getgxTv_SdtTUNIEST_Uniestcod_N());
      struct.setUniestdes_N(getgxTv_SdtTUNIEST_Uniestdes_N());
      return struct ;
   }

   private byte gxTv_SdtTUNIEST_N ;
   private byte gxTv_SdtTUNIEST_Uniestcod_N ;
   private byte gxTv_SdtTUNIEST_Uniestdes_N ;
   private short gxTv_SdtTUNIEST_Initialized ;
   private short readOk ;
   private short nOutParmCount ;
   private String gxTv_SdtTUNIEST_Uniestcod ;
   private String gxTv_SdtTUNIEST_Uniestdes ;
   private String gxTv_SdtTUNIEST_Mode ;
   private String gxTv_SdtTUNIEST_Uniestcod_Z ;
   private String gxTv_SdtTUNIEST_Uniestdes_Z ;
   private String sTagName ;
   private boolean readElement ;
   private boolean formatError ;
   private String gxTv_SdtTUNIEST_Uniestcdes ;
   private String gxTv_SdtTUNIEST_Uniestcdes_Z ;
}

