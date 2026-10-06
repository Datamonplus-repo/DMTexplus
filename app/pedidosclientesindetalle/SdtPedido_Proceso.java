package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtPedido_Proceso extends GxSilentTrnSdt
{
   public SdtPedido_Proceso( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtPedido_Proceso.class));
   }

   public SdtPedido_Proceso( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle, context, "SdtPedido_Proceso");
      initialize( remoteHandle) ;
   }

   public SdtPedido_Proceso( int remoteHandle ,
                             StructSdtPedido_Proceso struct )
   {
      this(remoteHandle);
      setStruct(struct);
   }

   public SdtPedido_Proceso( )
   {
      super( new ModelContext(SdtPedido_Proceso.class), "SdtPedido_Proceso");
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
      return (Object[][])(new Object[][]{new Object[]{"ProCod", String.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "Proceso");
      metadata.set("BT", "TXPDISLIN");
      metadata.set("PK", "[ \"ProCod\" ]");
      metadata.set("Levels", "[ \"Fase\" ]");
      metadata.set("FKList", "[ { \"FK\":[ \"EmprCod\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"DisCod\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"ProCod\" ],\"FKMap\":[  ] } ]");
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "ProCod") )
            {
               gxTv_SdtPedido_Proceso_Procod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ProDsc") )
            {
               gxTv_SdtPedido_Proceso_Prodsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UltFasLin") )
            {
               gxTv_SdtPedido_Proceso_Ultfaslin = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Fase") )
            {
               if ( gxTv_SdtPedido_Proceso_Fase == null )
               {
                  gxTv_SdtPedido_Proceso_Fase = new GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Proceso_Fase>(app.pedidosclientesindetalle.SdtPedido_Proceso_Fase.class, "Pedido.Proceso.Fase", "TexplusNET", remoteHandle);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtPedido_Proceso_Fase.readxml(oReader, "Fase") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Fase") )
               {
                  GXSoapError = oReader.read() ;
               }
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtPedido_Proceso_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Modified") )
            {
               gxTv_SdtPedido_Proceso_Modified = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtPedido_Proceso_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ProCod_Z") )
            {
               gxTv_SdtPedido_Proceso_Procod_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ProDsc_Z") )
            {
               gxTv_SdtPedido_Proceso_Prodsc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UltFasLin_Z") )
            {
               gxTv_SdtPedido_Proceso_Ultfaslin_Z = (short)(getnumericvalue(oReader.getValue())) ;
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
         sName = "Pedido.Proceso" ;
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
      oWriter.writeElement("ProCod", gxTv_SdtPedido_Proceso_Procod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ProDsc", gxTv_SdtPedido_Proceso_Prodsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("UltFasLin", GXutil.trim( GXutil.str( gxTv_SdtPedido_Proceso_Ultfaslin, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtPedido_Proceso_Fase != null )
      {
         String sNameSpace1;
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "TexplusNET" ;
         }
         else
         {
            sNameSpace1 = "TexplusNET" ;
         }
         gxTv_SdtPedido_Proceso_Fase.writexml(oWriter, "Fase", sNameSpace1, sIncludeState);
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", gxTv_SdtPedido_Proceso_Mode);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Modified", GXutil.trim( GXutil.str( gxTv_SdtPedido_Proceso_Modified, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtPedido_Proceso_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ProCod_Z", gxTv_SdtPedido_Proceso_Procod_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ProDsc_Z", gxTv_SdtPedido_Proceso_Prodsc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("UltFasLin_Z", GXutil.trim( GXutil.str( gxTv_SdtPedido_Proceso_Ultfaslin_Z, 4, 0)));
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
      AddObjectProperty("ProCod", gxTv_SdtPedido_Proceso_Procod, false, includeNonInitialized);
      AddObjectProperty("ProDsc", gxTv_SdtPedido_Proceso_Prodsc, false, includeNonInitialized);
      AddObjectProperty("UltFasLin", gxTv_SdtPedido_Proceso_Ultfaslin, false, includeNonInitialized);
      if ( gxTv_SdtPedido_Proceso_Fase != null )
      {
         AddObjectProperty("Fase", gxTv_SdtPedido_Proceso_Fase, includeState, includeNonInitialized);
      }
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtPedido_Proceso_Mode, false, includeNonInitialized);
         AddObjectProperty("Modified", gxTv_SdtPedido_Proceso_Modified, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_SdtPedido_Proceso_Initialized, false, includeNonInitialized);
         AddObjectProperty("ProCod_Z", gxTv_SdtPedido_Proceso_Procod_Z, false, includeNonInitialized);
         AddObjectProperty("ProDsc_Z", gxTv_SdtPedido_Proceso_Prodsc_Z, false, includeNonInitialized);
         AddObjectProperty("UltFasLin_Z", gxTv_SdtPedido_Proceso_Ultfaslin_Z, false, includeNonInitialized);
      }
   }

   public void updateDirties( app.pedidosclientesindetalle.SdtPedido_Proceso sdt )
   {
      if ( sdt.IsDirty("ProCod") )
      {
         gxTv_SdtPedido_Proceso_N = (byte)(0) ;
         gxTv_SdtPedido_Proceso_Procod = sdt.getgxTv_SdtPedido_Proceso_Procod() ;
      }
      if ( sdt.IsDirty("ProDsc") )
      {
         gxTv_SdtPedido_Proceso_N = (byte)(0) ;
         gxTv_SdtPedido_Proceso_Prodsc = sdt.getgxTv_SdtPedido_Proceso_Prodsc() ;
      }
      if ( sdt.IsDirty("UltFasLin") )
      {
         gxTv_SdtPedido_Proceso_N = (byte)(0) ;
         gxTv_SdtPedido_Proceso_Ultfaslin = sdt.getgxTv_SdtPedido_Proceso_Ultfaslin() ;
      }
      if ( gxTv_SdtPedido_Proceso_Fase != null )
      {
         GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Proceso_Fase> newCollectionFase = sdt.getgxTv_SdtPedido_Proceso_Fase();
         app.pedidosclientesindetalle.SdtPedido_Proceso_Fase currItemFase;
         app.pedidosclientesindetalle.SdtPedido_Proceso_Fase newItemFase;
         short idx = 1;
         while ( idx <= newCollectionFase.size() )
         {
            newItemFase = (app.pedidosclientesindetalle.SdtPedido_Proceso_Fase)((app.pedidosclientesindetalle.SdtPedido_Proceso_Fase)newCollectionFase.elementAt(-1+idx));
            currItemFase = (app.pedidosclientesindetalle.SdtPedido_Proceso_Fase)gxTv_SdtPedido_Proceso_Fase.getByKey(newItemFase.getgxTv_SdtPedido_Proceso_Fase_Disfaslin());
            if ( GXutil.strcmp(currItemFase.getgxTv_SdtPedido_Proceso_Fase_Mode(), "UPD") == 0 )
            {
               currItemFase.updateDirties(newItemFase);
               if ( GXutil.strcmp(newItemFase.getgxTv_SdtPedido_Proceso_Fase_Mode(), "DLT") == 0 )
               {
                  currItemFase.setgxTv_SdtPedido_Proceso_Fase_Mode( "DLT" );
               }
               currItemFase.setgxTv_SdtPedido_Proceso_Fase_Modified( (short)(1) );
            }
            else
            {
               gxTv_SdtPedido_Proceso_Fase.add(newItemFase, 0);
            }
            idx = (short)(idx+1) ;
         }
      }
   }

   public String getgxTv_SdtPedido_Proceso_Procod( )
   {
      return gxTv_SdtPedido_Proceso_Procod ;
   }

   public void setgxTv_SdtPedido_Proceso_Procod( String value )
   {
      gxTv_SdtPedido_Proceso_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Modified = (short)(1) ;
      SetDirty("Procod");
      gxTv_SdtPedido_Proceso_Procod = value ;
   }

   public String getgxTv_SdtPedido_Proceso_Prodsc( )
   {
      return gxTv_SdtPedido_Proceso_Prodsc ;
   }

   public void setgxTv_SdtPedido_Proceso_Prodsc( String value )
   {
      gxTv_SdtPedido_Proceso_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Modified = (short)(1) ;
      SetDirty("Prodsc");
      gxTv_SdtPedido_Proceso_Prodsc = value ;
   }

   public short getgxTv_SdtPedido_Proceso_Ultfaslin( )
   {
      return gxTv_SdtPedido_Proceso_Ultfaslin ;
   }

   public void setgxTv_SdtPedido_Proceso_Ultfaslin( short value )
   {
      gxTv_SdtPedido_Proceso_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Modified = (short)(1) ;
      SetDirty("Ultfaslin");
      gxTv_SdtPedido_Proceso_Ultfaslin = value ;
   }

   public GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Proceso_Fase> getgxTv_SdtPedido_Proceso_Fase( )
   {
      if ( gxTv_SdtPedido_Proceso_Fase == null )
      {
         gxTv_SdtPedido_Proceso_Fase = new GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Proceso_Fase>(app.pedidosclientesindetalle.SdtPedido_Proceso_Fase.class, "Pedido.Proceso.Fase", "TexplusNET", remoteHandle);
      }
      gxTv_SdtPedido_Proceso_N = (byte)(0) ;
      return gxTv_SdtPedido_Proceso_Fase ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase( GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Proceso_Fase> value )
   {
      gxTv_SdtPedido_Proceso_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Modified = (short)(1) ;
      SetDirty("Fase");
      gxTv_SdtPedido_Proceso_Fase = value ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_SetNull( )
   {
      gxTv_SdtPedido_Proceso_Fase = null ;
      SetDirty("Fase");
   }

   public boolean getgxTv_SdtPedido_Proceso_Fase_IsNull( )
   {
      if ( gxTv_SdtPedido_Proceso_Fase == null )
      {
         return true ;
      }
      return false ;
   }

   public String getgxTv_SdtPedido_Proceso_Mode( )
   {
      return gxTv_SdtPedido_Proceso_Mode ;
   }

   public void setgxTv_SdtPedido_Proceso_Mode( String value )
   {
      gxTv_SdtPedido_Proceso_N = (byte)(0) ;
      SetDirty("Mode");
      gxTv_SdtPedido_Proceso_Mode = value ;
   }

   public void setgxTv_SdtPedido_Proceso_Mode_SetNull( )
   {
      gxTv_SdtPedido_Proceso_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_SdtPedido_Proceso_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPedido_Proceso_Modified( )
   {
      return gxTv_SdtPedido_Proceso_Modified ;
   }

   public void setgxTv_SdtPedido_Proceso_Modified( short value )
   {
      gxTv_SdtPedido_Proceso_N = (byte)(0) ;
      SetDirty("Modified");
      gxTv_SdtPedido_Proceso_Modified = value ;
   }

   public void setgxTv_SdtPedido_Proceso_Modified_SetNull( )
   {
      gxTv_SdtPedido_Proceso_Modified = (short)(0) ;
      SetDirty("Modified");
   }

   public boolean getgxTv_SdtPedido_Proceso_Modified_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPedido_Proceso_Initialized( )
   {
      return gxTv_SdtPedido_Proceso_Initialized ;
   }

   public void setgxTv_SdtPedido_Proceso_Initialized( short value )
   {
      gxTv_SdtPedido_Proceso_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Modified = (short)(1) ;
      SetDirty("Initialized");
      gxTv_SdtPedido_Proceso_Initialized = value ;
   }

   public void setgxTv_SdtPedido_Proceso_Initialized_SetNull( )
   {
      gxTv_SdtPedido_Proceso_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_SdtPedido_Proceso_Initialized_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Proceso_Procod_Z( )
   {
      return gxTv_SdtPedido_Proceso_Procod_Z ;
   }

   public void setgxTv_SdtPedido_Proceso_Procod_Z( String value )
   {
      gxTv_SdtPedido_Proceso_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Modified = (short)(1) ;
      SetDirty("Procod_Z");
      gxTv_SdtPedido_Proceso_Procod_Z = value ;
   }

   public void setgxTv_SdtPedido_Proceso_Procod_Z_SetNull( )
   {
      gxTv_SdtPedido_Proceso_Procod_Z = "" ;
      SetDirty("Procod_Z");
   }

   public boolean getgxTv_SdtPedido_Proceso_Procod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Proceso_Prodsc_Z( )
   {
      return gxTv_SdtPedido_Proceso_Prodsc_Z ;
   }

   public void setgxTv_SdtPedido_Proceso_Prodsc_Z( String value )
   {
      gxTv_SdtPedido_Proceso_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Modified = (short)(1) ;
      SetDirty("Prodsc_Z");
      gxTv_SdtPedido_Proceso_Prodsc_Z = value ;
   }

   public void setgxTv_SdtPedido_Proceso_Prodsc_Z_SetNull( )
   {
      gxTv_SdtPedido_Proceso_Prodsc_Z = "" ;
      SetDirty("Prodsc_Z");
   }

   public boolean getgxTv_SdtPedido_Proceso_Prodsc_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPedido_Proceso_Ultfaslin_Z( )
   {
      return gxTv_SdtPedido_Proceso_Ultfaslin_Z ;
   }

   public void setgxTv_SdtPedido_Proceso_Ultfaslin_Z( short value )
   {
      gxTv_SdtPedido_Proceso_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Modified = (short)(1) ;
      SetDirty("Ultfaslin_Z");
      gxTv_SdtPedido_Proceso_Ultfaslin_Z = value ;
   }

   public void setgxTv_SdtPedido_Proceso_Ultfaslin_Z_SetNull( )
   {
      gxTv_SdtPedido_Proceso_Ultfaslin_Z = (short)(0) ;
      SetDirty("Ultfaslin_Z");
   }

   public boolean getgxTv_SdtPedido_Proceso_Ultfaslin_Z_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtPedido_Proceso_Procod = "" ;
      gxTv_SdtPedido_Proceso_N = (byte)(1) ;
      gxTv_SdtPedido_Proceso_Prodsc = "" ;
      gxTv_SdtPedido_Proceso_Mode = "" ;
      gxTv_SdtPedido_Proceso_Procod_Z = "" ;
      gxTv_SdtPedido_Proceso_Prodsc_Z = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtPedido_Proceso_N ;
   }

   public app.pedidosclientesindetalle.SdtPedido_Proceso Clone( )
   {
      return (app.pedidosclientesindetalle.SdtPedido_Proceso)(clone()) ;
   }

   public void setStruct( app.pedidosclientesindetalle.StructSdtPedido_Proceso struct )
   {
      setgxTv_SdtPedido_Proceso_Procod(struct.getProcod());
      setgxTv_SdtPedido_Proceso_Prodsc(struct.getProdsc());
      setgxTv_SdtPedido_Proceso_Ultfaslin(struct.getUltfaslin());
      GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Proceso_Fase> gxTv_SdtPedido_Proceso_Fase_aux = new GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Proceso_Fase>(app.pedidosclientesindetalle.SdtPedido_Proceso_Fase.class, "Pedido.Proceso.Fase", "TexplusNET", remoteHandle);
      Vector<app.pedidosclientesindetalle.StructSdtPedido_Proceso_Fase> gxTv_SdtPedido_Proceso_Fase_aux1 = struct.getFase();
      if (gxTv_SdtPedido_Proceso_Fase_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtPedido_Proceso_Fase_aux1.size(); i++)
         {
            gxTv_SdtPedido_Proceso_Fase_aux.add(new app.pedidosclientesindetalle.SdtPedido_Proceso_Fase(remoteHandle, gxTv_SdtPedido_Proceso_Fase_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtPedido_Proceso_Fase(gxTv_SdtPedido_Proceso_Fase_aux);
      setgxTv_SdtPedido_Proceso_Mode(struct.getMode());
      setgxTv_SdtPedido_Proceso_Modified(struct.getModified());
      setgxTv_SdtPedido_Proceso_Initialized(struct.getInitialized());
      setgxTv_SdtPedido_Proceso_Procod_Z(struct.getProcod_Z());
      setgxTv_SdtPedido_Proceso_Prodsc_Z(struct.getProdsc_Z());
      setgxTv_SdtPedido_Proceso_Ultfaslin_Z(struct.getUltfaslin_Z());
   }

   @SuppressWarnings("unchecked")
   public app.pedidosclientesindetalle.StructSdtPedido_Proceso getStruct( )
   {
      app.pedidosclientesindetalle.StructSdtPedido_Proceso struct = new app.pedidosclientesindetalle.StructSdtPedido_Proceso ();
      struct.setProcod(getgxTv_SdtPedido_Proceso_Procod());
      struct.setProdsc(getgxTv_SdtPedido_Proceso_Prodsc());
      struct.setUltfaslin(getgxTv_SdtPedido_Proceso_Ultfaslin());
      struct.setFase(getgxTv_SdtPedido_Proceso_Fase().getStruct());
      struct.setMode(getgxTv_SdtPedido_Proceso_Mode());
      struct.setModified(getgxTv_SdtPedido_Proceso_Modified());
      struct.setInitialized(getgxTv_SdtPedido_Proceso_Initialized());
      struct.setProcod_Z(getgxTv_SdtPedido_Proceso_Procod_Z());
      struct.setProdsc_Z(getgxTv_SdtPedido_Proceso_Prodsc_Z());
      struct.setUltfaslin_Z(getgxTv_SdtPedido_Proceso_Ultfaslin_Z());
      return struct ;
   }

   private byte gxTv_SdtPedido_Proceso_N ;
   private short gxTv_SdtPedido_Proceso_Ultfaslin ;
   private short gxTv_SdtPedido_Proceso_Modified ;
   private short gxTv_SdtPedido_Proceso_Initialized ;
   private short gxTv_SdtPedido_Proceso_Ultfaslin_Z ;
   private short readOk ;
   private short nOutParmCount ;
   private String gxTv_SdtPedido_Proceso_Procod ;
   private String gxTv_SdtPedido_Proceso_Prodsc ;
   private String gxTv_SdtPedido_Proceso_Mode ;
   private String gxTv_SdtPedido_Proceso_Procod_Z ;
   private String gxTv_SdtPedido_Proceso_Prodsc_Z ;
   private String sTagName ;
   private boolean readElement ;
   private boolean formatError ;
   private GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Proceso_Fase> gxTv_SdtPedido_Proceso_Fase_aux ;
   private GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Proceso_Fase> gxTv_SdtPedido_Proceso_Fase=null ;
}

