package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtPedido_Proceso_Fase_Parametro extends GxSilentTrnSdt
{
   public SdtPedido_Proceso_Fase_Parametro( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtPedido_Proceso_Fase_Parametro.class));
   }

   public SdtPedido_Proceso_Fase_Parametro( int remoteHandle ,
                                            ModelContext context )
   {
      super( remoteHandle, context, "SdtPedido_Proceso_Fase_Parametro");
      initialize( remoteHandle) ;
   }

   public SdtPedido_Proceso_Fase_Parametro( int remoteHandle ,
                                            StructSdtPedido_Proceso_Fase_Parametro struct )
   {
      this(remoteHandle);
      setStruct(struct);
   }

   public SdtPedido_Proceso_Fase_Parametro( )
   {
      super( new ModelContext(SdtPedido_Proceso_Fase_Parametro.class), "SdtPedido_Proceso_Fase_Parametro");
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
      return (Object[][])(new Object[][]{new Object[]{"ParFasCod", short.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "Parametro");
      metadata.set("BT", "TXPDISPAR");
      metadata.set("PK", "[ \"ParFasCod\" ]");
      metadata.set("FKList", "[ { \"FK\":[ \"EmprCod\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"DisCod\",\"ProCod\",\"DisFasLin\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"ParFasCod\" ],\"FKMap\":[  ] } ]");
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "ParFasCod") )
            {
               gxTv_SdtPedido_Proceso_Fase_Parametro_Parfascod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisParVl2") )
            {
               gxTv_SdtPedido_Proceso_Fase_Parametro_Disparvl2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisParObs") )
            {
               gxTv_SdtPedido_Proceso_Fase_Parametro_Disparobs = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtPedido_Proceso_Fase_Parametro_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Modified") )
            {
               gxTv_SdtPedido_Proceso_Fase_Parametro_Modified = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtPedido_Proceso_Fase_Parametro_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ParFasCod_Z") )
            {
               gxTv_SdtPedido_Proceso_Fase_Parametro_Parfascod_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisParVl2_Z") )
            {
               gxTv_SdtPedido_Proceso_Fase_Parametro_Disparvl2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisParObs_Z") )
            {
               gxTv_SdtPedido_Proceso_Fase_Parametro_Disparobs_Z = oReader.getValue() ;
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
         sName = "Pedido.Proceso.Fase.Parametro" ;
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
      oWriter.writeElement("ParFasCod", GXutil.trim( GXutil.str( gxTv_SdtPedido_Proceso_Fase_Parametro_Parfascod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisParVl2", gxTv_SdtPedido_Proceso_Fase_Parametro_Disparvl2);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisParObs", gxTv_SdtPedido_Proceso_Fase_Parametro_Disparobs);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", gxTv_SdtPedido_Proceso_Fase_Parametro_Mode);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Modified", GXutil.trim( GXutil.str( gxTv_SdtPedido_Proceso_Fase_Parametro_Modified, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtPedido_Proceso_Fase_Parametro_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ParFasCod_Z", GXutil.trim( GXutil.str( gxTv_SdtPedido_Proceso_Fase_Parametro_Parfascod_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisParVl2_Z", gxTv_SdtPedido_Proceso_Fase_Parametro_Disparvl2_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisParObs_Z", gxTv_SdtPedido_Proceso_Fase_Parametro_Disparobs_Z);
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
      AddObjectProperty("ParFasCod", gxTv_SdtPedido_Proceso_Fase_Parametro_Parfascod, false, includeNonInitialized);
      AddObjectProperty("DisParVl2", gxTv_SdtPedido_Proceso_Fase_Parametro_Disparvl2, false, includeNonInitialized);
      AddObjectProperty("DisParObs", gxTv_SdtPedido_Proceso_Fase_Parametro_Disparobs, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtPedido_Proceso_Fase_Parametro_Mode, false, includeNonInitialized);
         AddObjectProperty("Modified", gxTv_SdtPedido_Proceso_Fase_Parametro_Modified, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_SdtPedido_Proceso_Fase_Parametro_Initialized, false, includeNonInitialized);
         AddObjectProperty("ParFasCod_Z", gxTv_SdtPedido_Proceso_Fase_Parametro_Parfascod_Z, false, includeNonInitialized);
         AddObjectProperty("DisParVl2_Z", gxTv_SdtPedido_Proceso_Fase_Parametro_Disparvl2_Z, false, includeNonInitialized);
         AddObjectProperty("DisParObs_Z", gxTv_SdtPedido_Proceso_Fase_Parametro_Disparobs_Z, false, includeNonInitialized);
      }
   }

   public void updateDirties( app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_Parametro sdt )
   {
      if ( sdt.IsDirty("ParFasCod") )
      {
         gxTv_SdtPedido_Proceso_Fase_Parametro_N = (byte)(0) ;
         gxTv_SdtPedido_Proceso_Fase_Parametro_Parfascod = sdt.getgxTv_SdtPedido_Proceso_Fase_Parametro_Parfascod() ;
      }
      if ( sdt.IsDirty("DisParVl2") )
      {
         gxTv_SdtPedido_Proceso_Fase_Parametro_N = (byte)(0) ;
         gxTv_SdtPedido_Proceso_Fase_Parametro_Disparvl2 = sdt.getgxTv_SdtPedido_Proceso_Fase_Parametro_Disparvl2() ;
      }
      if ( sdt.IsDirty("DisParObs") )
      {
         gxTv_SdtPedido_Proceso_Fase_Parametro_N = (byte)(0) ;
         gxTv_SdtPedido_Proceso_Fase_Parametro_Disparobs = sdt.getgxTv_SdtPedido_Proceso_Fase_Parametro_Disparobs() ;
      }
   }

   public short getgxTv_SdtPedido_Proceso_Fase_Parametro_Parfascod( )
   {
      return gxTv_SdtPedido_Proceso_Fase_Parametro_Parfascod ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_Parametro_Parfascod( short value )
   {
      gxTv_SdtPedido_Proceso_Fase_Parametro_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_Parametro_Modified = (short)(1) ;
      SetDirty("Parfascod");
      gxTv_SdtPedido_Proceso_Fase_Parametro_Parfascod = value ;
   }

   public String getgxTv_SdtPedido_Proceso_Fase_Parametro_Disparvl2( )
   {
      return gxTv_SdtPedido_Proceso_Fase_Parametro_Disparvl2 ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_Parametro_Disparvl2( String value )
   {
      gxTv_SdtPedido_Proceso_Fase_Parametro_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_Parametro_Modified = (short)(1) ;
      SetDirty("Disparvl2");
      gxTv_SdtPedido_Proceso_Fase_Parametro_Disparvl2 = value ;
   }

   public String getgxTv_SdtPedido_Proceso_Fase_Parametro_Disparobs( )
   {
      return gxTv_SdtPedido_Proceso_Fase_Parametro_Disparobs ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_Parametro_Disparobs( String value )
   {
      gxTv_SdtPedido_Proceso_Fase_Parametro_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_Parametro_Modified = (short)(1) ;
      SetDirty("Disparobs");
      gxTv_SdtPedido_Proceso_Fase_Parametro_Disparobs = value ;
   }

   public String getgxTv_SdtPedido_Proceso_Fase_Parametro_Mode( )
   {
      return gxTv_SdtPedido_Proceso_Fase_Parametro_Mode ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_Parametro_Mode( String value )
   {
      gxTv_SdtPedido_Proceso_Fase_Parametro_N = (byte)(0) ;
      SetDirty("Mode");
      gxTv_SdtPedido_Proceso_Fase_Parametro_Mode = value ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_Parametro_Mode_SetNull( )
   {
      gxTv_SdtPedido_Proceso_Fase_Parametro_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_SdtPedido_Proceso_Fase_Parametro_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPedido_Proceso_Fase_Parametro_Modified( )
   {
      return gxTv_SdtPedido_Proceso_Fase_Parametro_Modified ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_Parametro_Modified( short value )
   {
      gxTv_SdtPedido_Proceso_Fase_Parametro_N = (byte)(0) ;
      SetDirty("Modified");
      gxTv_SdtPedido_Proceso_Fase_Parametro_Modified = value ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_Parametro_Modified_SetNull( )
   {
      gxTv_SdtPedido_Proceso_Fase_Parametro_Modified = (short)(0) ;
      SetDirty("Modified");
   }

   public boolean getgxTv_SdtPedido_Proceso_Fase_Parametro_Modified_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPedido_Proceso_Fase_Parametro_Initialized( )
   {
      return gxTv_SdtPedido_Proceso_Fase_Parametro_Initialized ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_Parametro_Initialized( short value )
   {
      gxTv_SdtPedido_Proceso_Fase_Parametro_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_Parametro_Modified = (short)(1) ;
      SetDirty("Initialized");
      gxTv_SdtPedido_Proceso_Fase_Parametro_Initialized = value ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_Parametro_Initialized_SetNull( )
   {
      gxTv_SdtPedido_Proceso_Fase_Parametro_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_SdtPedido_Proceso_Fase_Parametro_Initialized_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPedido_Proceso_Fase_Parametro_Parfascod_Z( )
   {
      return gxTv_SdtPedido_Proceso_Fase_Parametro_Parfascod_Z ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_Parametro_Parfascod_Z( short value )
   {
      gxTv_SdtPedido_Proceso_Fase_Parametro_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_Parametro_Modified = (short)(1) ;
      SetDirty("Parfascod_Z");
      gxTv_SdtPedido_Proceso_Fase_Parametro_Parfascod_Z = value ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_Parametro_Parfascod_Z_SetNull( )
   {
      gxTv_SdtPedido_Proceso_Fase_Parametro_Parfascod_Z = (short)(0) ;
      SetDirty("Parfascod_Z");
   }

   public boolean getgxTv_SdtPedido_Proceso_Fase_Parametro_Parfascod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Proceso_Fase_Parametro_Disparvl2_Z( )
   {
      return gxTv_SdtPedido_Proceso_Fase_Parametro_Disparvl2_Z ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_Parametro_Disparvl2_Z( String value )
   {
      gxTv_SdtPedido_Proceso_Fase_Parametro_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_Parametro_Modified = (short)(1) ;
      SetDirty("Disparvl2_Z");
      gxTv_SdtPedido_Proceso_Fase_Parametro_Disparvl2_Z = value ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_Parametro_Disparvl2_Z_SetNull( )
   {
      gxTv_SdtPedido_Proceso_Fase_Parametro_Disparvl2_Z = "" ;
      SetDirty("Disparvl2_Z");
   }

   public boolean getgxTv_SdtPedido_Proceso_Fase_Parametro_Disparvl2_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Proceso_Fase_Parametro_Disparobs_Z( )
   {
      return gxTv_SdtPedido_Proceso_Fase_Parametro_Disparobs_Z ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_Parametro_Disparobs_Z( String value )
   {
      gxTv_SdtPedido_Proceso_Fase_Parametro_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_Parametro_Modified = (short)(1) ;
      SetDirty("Disparobs_Z");
      gxTv_SdtPedido_Proceso_Fase_Parametro_Disparobs_Z = value ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_Parametro_Disparobs_Z_SetNull( )
   {
      gxTv_SdtPedido_Proceso_Fase_Parametro_Disparobs_Z = "" ;
      SetDirty("Disparobs_Z");
   }

   public boolean getgxTv_SdtPedido_Proceso_Fase_Parametro_Disparobs_Z_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtPedido_Proceso_Fase_Parametro_N = (byte)(1) ;
      gxTv_SdtPedido_Proceso_Fase_Parametro_Disparvl2 = "" ;
      gxTv_SdtPedido_Proceso_Fase_Parametro_Disparobs = "" ;
      gxTv_SdtPedido_Proceso_Fase_Parametro_Mode = "" ;
      gxTv_SdtPedido_Proceso_Fase_Parametro_Disparvl2_Z = "" ;
      gxTv_SdtPedido_Proceso_Fase_Parametro_Disparobs_Z = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtPedido_Proceso_Fase_Parametro_N ;
   }

   public app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_Parametro Clone( )
   {
      return (app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_Parametro)(clone()) ;
   }

   public void setStruct( app.pedidosclientesindetalle.StructSdtPedido_Proceso_Fase_Parametro struct )
   {
      setgxTv_SdtPedido_Proceso_Fase_Parametro_Parfascod(struct.getParfascod());
      setgxTv_SdtPedido_Proceso_Fase_Parametro_Disparvl2(struct.getDisparvl2());
      setgxTv_SdtPedido_Proceso_Fase_Parametro_Disparobs(struct.getDisparobs());
      setgxTv_SdtPedido_Proceso_Fase_Parametro_Mode(struct.getMode());
      setgxTv_SdtPedido_Proceso_Fase_Parametro_Modified(struct.getModified());
      setgxTv_SdtPedido_Proceso_Fase_Parametro_Initialized(struct.getInitialized());
      setgxTv_SdtPedido_Proceso_Fase_Parametro_Parfascod_Z(struct.getParfascod_Z());
      setgxTv_SdtPedido_Proceso_Fase_Parametro_Disparvl2_Z(struct.getDisparvl2_Z());
      setgxTv_SdtPedido_Proceso_Fase_Parametro_Disparobs_Z(struct.getDisparobs_Z());
   }

   @SuppressWarnings("unchecked")
   public app.pedidosclientesindetalle.StructSdtPedido_Proceso_Fase_Parametro getStruct( )
   {
      app.pedidosclientesindetalle.StructSdtPedido_Proceso_Fase_Parametro struct = new app.pedidosclientesindetalle.StructSdtPedido_Proceso_Fase_Parametro ();
      struct.setParfascod(getgxTv_SdtPedido_Proceso_Fase_Parametro_Parfascod());
      struct.setDisparvl2(getgxTv_SdtPedido_Proceso_Fase_Parametro_Disparvl2());
      struct.setDisparobs(getgxTv_SdtPedido_Proceso_Fase_Parametro_Disparobs());
      struct.setMode(getgxTv_SdtPedido_Proceso_Fase_Parametro_Mode());
      struct.setModified(getgxTv_SdtPedido_Proceso_Fase_Parametro_Modified());
      struct.setInitialized(getgxTv_SdtPedido_Proceso_Fase_Parametro_Initialized());
      struct.setParfascod_Z(getgxTv_SdtPedido_Proceso_Fase_Parametro_Parfascod_Z());
      struct.setDisparvl2_Z(getgxTv_SdtPedido_Proceso_Fase_Parametro_Disparvl2_Z());
      struct.setDisparobs_Z(getgxTv_SdtPedido_Proceso_Fase_Parametro_Disparobs_Z());
      return struct ;
   }

   private byte gxTv_SdtPedido_Proceso_Fase_Parametro_N ;
   private short gxTv_SdtPedido_Proceso_Fase_Parametro_Parfascod ;
   private short gxTv_SdtPedido_Proceso_Fase_Parametro_Modified ;
   private short gxTv_SdtPedido_Proceso_Fase_Parametro_Initialized ;
   private short gxTv_SdtPedido_Proceso_Fase_Parametro_Parfascod_Z ;
   private short readOk ;
   private short nOutParmCount ;
   private String gxTv_SdtPedido_Proceso_Fase_Parametro_Disparvl2 ;
   private String gxTv_SdtPedido_Proceso_Fase_Parametro_Disparobs ;
   private String gxTv_SdtPedido_Proceso_Fase_Parametro_Mode ;
   private String gxTv_SdtPedido_Proceso_Fase_Parametro_Disparvl2_Z ;
   private String gxTv_SdtPedido_Proceso_Fase_Parametro_Disparobs_Z ;
   private String sTagName ;
   private boolean readElement ;
   private boolean formatError ;
}

