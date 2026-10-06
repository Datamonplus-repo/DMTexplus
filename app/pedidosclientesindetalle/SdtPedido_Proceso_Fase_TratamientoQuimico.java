package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtPedido_Proceso_Fase_TratamientoQuimico extends GxSilentTrnSdt
{
   public SdtPedido_Proceso_Fase_TratamientoQuimico( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtPedido_Proceso_Fase_TratamientoQuimico.class));
   }

   public SdtPedido_Proceso_Fase_TratamientoQuimico( int remoteHandle ,
                                                     ModelContext context )
   {
      super( remoteHandle, context, "SdtPedido_Proceso_Fase_TratamientoQuimico");
      initialize( remoteHandle) ;
   }

   public SdtPedido_Proceso_Fase_TratamientoQuimico( int remoteHandle ,
                                                     StructSdtPedido_Proceso_Fase_TratamientoQuimico struct )
   {
      this(remoteHandle);
      setStruct(struct);
   }

   public SdtPedido_Proceso_Fase_TratamientoQuimico( )
   {
      super( new ModelContext(SdtPedido_Proceso_Fase_TratamientoQuimico.class), "SdtPedido_Proceso_Fase_TratamientoQuimico");
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
      return (Object[][])(new Object[][]{new Object[]{"DisQuiLin", short.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "TratamientoQuimico");
      metadata.set("BT", "TXPDISQUI");
      metadata.set("PK", "[ \"DisQuiLin\" ]");
      metadata.set("FKList", "[ { \"FK\":[ \"EmprCod\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"DisCod\",\"ProCod\",\"DisFasLin\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"ProForCod\" ],\"FKMap\":[  ] } ]");
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisQuiLin") )
            {
               gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Disquilin = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ProForCod") )
            {
               gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Proforcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ProForDsc") )
            {
               gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Profordsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Modified") )
            {
               gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Modified = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisQuiLin_Z") )
            {
               gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Disquilin_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ProForCod_Z") )
            {
               gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Proforcod_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ProForDsc_Z") )
            {
               gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Profordsc_Z = oReader.getValue() ;
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
         sName = "Pedido.Proceso.Fase.TratamientoQuimico" ;
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
      oWriter.writeElement("DisQuiLin", GXutil.trim( GXutil.str( gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Disquilin, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ProForCod", gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Proforcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ProForDsc", gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Profordsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Mode);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Modified", GXutil.trim( GXutil.str( gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Modified, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisQuiLin_Z", GXutil.trim( GXutil.str( gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Disquilin_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ProForCod_Z", gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Proforcod_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ProForDsc_Z", gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Profordsc_Z);
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
      AddObjectProperty("DisQuiLin", gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Disquilin, false, includeNonInitialized);
      AddObjectProperty("ProForCod", gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Proforcod, false, includeNonInitialized);
      AddObjectProperty("ProForDsc", gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Profordsc, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Mode, false, includeNonInitialized);
         AddObjectProperty("Modified", gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Modified, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Initialized, false, includeNonInitialized);
         AddObjectProperty("DisQuiLin_Z", gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Disquilin_Z, false, includeNonInitialized);
         AddObjectProperty("ProForCod_Z", gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Proforcod_Z, false, includeNonInitialized);
         AddObjectProperty("ProForDsc_Z", gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Profordsc_Z, false, includeNonInitialized);
      }
   }

   public void updateDirties( app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_TratamientoQuimico sdt )
   {
      if ( sdt.IsDirty("DisQuiLin") )
      {
         gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_N = (byte)(0) ;
         gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Disquilin = sdt.getgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Disquilin() ;
      }
      if ( sdt.IsDirty("ProForCod") )
      {
         gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_N = (byte)(0) ;
         gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Proforcod = sdt.getgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Proforcod() ;
      }
      if ( sdt.IsDirty("ProForDsc") )
      {
         gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_N = (byte)(0) ;
         gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Profordsc = sdt.getgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Profordsc() ;
      }
   }

   public short getgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Disquilin( )
   {
      return gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Disquilin ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Disquilin( short value )
   {
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Modified = (short)(1) ;
      SetDirty("Disquilin");
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Disquilin = value ;
   }

   public String getgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Proforcod( )
   {
      return gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Proforcod ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Proforcod( String value )
   {
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Modified = (short)(1) ;
      SetDirty("Proforcod");
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Proforcod = value ;
   }

   public String getgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Profordsc( )
   {
      return gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Profordsc ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Profordsc( String value )
   {
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Modified = (short)(1) ;
      SetDirty("Profordsc");
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Profordsc = value ;
   }

   public String getgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Mode( )
   {
      return gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Mode ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Mode( String value )
   {
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_N = (byte)(0) ;
      SetDirty("Mode");
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Mode = value ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Mode_SetNull( )
   {
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Modified( )
   {
      return gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Modified ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Modified( short value )
   {
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_N = (byte)(0) ;
      SetDirty("Modified");
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Modified = value ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Modified_SetNull( )
   {
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Modified = (short)(0) ;
      SetDirty("Modified");
   }

   public boolean getgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Modified_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Initialized( )
   {
      return gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Initialized ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Initialized( short value )
   {
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Modified = (short)(1) ;
      SetDirty("Initialized");
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Initialized = value ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Initialized_SetNull( )
   {
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Initialized_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Disquilin_Z( )
   {
      return gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Disquilin_Z ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Disquilin_Z( short value )
   {
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Modified = (short)(1) ;
      SetDirty("Disquilin_Z");
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Disquilin_Z = value ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Disquilin_Z_SetNull( )
   {
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Disquilin_Z = (short)(0) ;
      SetDirty("Disquilin_Z");
   }

   public boolean getgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Disquilin_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Proforcod_Z( )
   {
      return gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Proforcod_Z ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Proforcod_Z( String value )
   {
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Modified = (short)(1) ;
      SetDirty("Proforcod_Z");
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Proforcod_Z = value ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Proforcod_Z_SetNull( )
   {
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Proforcod_Z = "" ;
      SetDirty("Proforcod_Z");
   }

   public boolean getgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Proforcod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Profordsc_Z( )
   {
      return gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Profordsc_Z ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Profordsc_Z( String value )
   {
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Modified = (short)(1) ;
      SetDirty("Profordsc_Z");
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Profordsc_Z = value ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Profordsc_Z_SetNull( )
   {
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Profordsc_Z = "" ;
      SetDirty("Profordsc_Z");
   }

   public boolean getgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Profordsc_Z_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_N = (byte)(1) ;
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Proforcod = "" ;
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Profordsc = "" ;
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Mode = "" ;
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Proforcod_Z = "" ;
      gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Profordsc_Z = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_N ;
   }

   public app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_TratamientoQuimico Clone( )
   {
      return (app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_TratamientoQuimico)(clone()) ;
   }

   public void setStruct( app.pedidosclientesindetalle.StructSdtPedido_Proceso_Fase_TratamientoQuimico struct )
   {
      setgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Disquilin(struct.getDisquilin());
      setgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Proforcod(struct.getProforcod());
      setgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Profordsc(struct.getProfordsc());
      setgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Mode(struct.getMode());
      setgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Modified(struct.getModified());
      setgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Initialized(struct.getInitialized());
      setgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Disquilin_Z(struct.getDisquilin_Z());
      setgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Proforcod_Z(struct.getProforcod_Z());
      setgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Profordsc_Z(struct.getProfordsc_Z());
   }

   @SuppressWarnings("unchecked")
   public app.pedidosclientesindetalle.StructSdtPedido_Proceso_Fase_TratamientoQuimico getStruct( )
   {
      app.pedidosclientesindetalle.StructSdtPedido_Proceso_Fase_TratamientoQuimico struct = new app.pedidosclientesindetalle.StructSdtPedido_Proceso_Fase_TratamientoQuimico ();
      struct.setDisquilin(getgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Disquilin());
      struct.setProforcod(getgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Proforcod());
      struct.setProfordsc(getgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Profordsc());
      struct.setMode(getgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Mode());
      struct.setModified(getgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Modified());
      struct.setInitialized(getgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Initialized());
      struct.setDisquilin_Z(getgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Disquilin_Z());
      struct.setProforcod_Z(getgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Proforcod_Z());
      struct.setProfordsc_Z(getgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Profordsc_Z());
      return struct ;
   }

   private byte gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_N ;
   private short gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Disquilin ;
   private short gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Modified ;
   private short gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Initialized ;
   private short gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Disquilin_Z ;
   private short readOk ;
   private short nOutParmCount ;
   private String gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Proforcod ;
   private String gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Profordsc ;
   private String gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Mode ;
   private String gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Proforcod_Z ;
   private String gxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Profordsc_Z ;
   private String sTagName ;
   private boolean readElement ;
   private boolean formatError ;
}

