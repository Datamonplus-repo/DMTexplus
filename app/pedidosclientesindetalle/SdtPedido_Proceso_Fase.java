package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtPedido_Proceso_Fase extends GxSilentTrnSdt
{
   public SdtPedido_Proceso_Fase( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtPedido_Proceso_Fase.class));
   }

   public SdtPedido_Proceso_Fase( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle, context, "SdtPedido_Proceso_Fase");
      initialize( remoteHandle) ;
   }

   public SdtPedido_Proceso_Fase( int remoteHandle ,
                                  StructSdtPedido_Proceso_Fase struct )
   {
      this(remoteHandle);
      setStruct(struct);
   }

   public SdtPedido_Proceso_Fase( )
   {
      super( new ModelContext(SdtPedido_Proceso_Fase.class), "SdtPedido_Proceso_Fase");
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
      return (Object[][])(new Object[][]{new Object[]{"DisFasLin", short.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "Fase");
      metadata.set("BT", "TXPDISFAS");
      metadata.set("PK", "[ \"DisFasLin\" ]");
      metadata.set("Levels", "[ \"Parametro\",\"TratamientoQuimico\" ]");
      metadata.set("FKList", "[ { \"FK\":[ \"EmprCod\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"DisCod\",\"ProCod\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"FasCod\" ],\"FKMap\":[  ] } ]");
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisFasLin") )
            {
               gxTv_SdtPedido_Proceso_Fase_Disfaslin = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FasCod") )
            {
               gxTv_SdtPedido_Proceso_Fase_Fascod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FasDsc") )
            {
               gxTv_SdtPedido_Proceso_Fase_Fasdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisQuiUl") )
            {
               gxTv_SdtPedido_Proceso_Fase_Disquiul = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TratamientoQuimico") )
            {
               if ( gxTv_SdtPedido_Proceso_Fase_Tratamientoquimico == null )
               {
                  gxTv_SdtPedido_Proceso_Fase_Tratamientoquimico = new GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_TratamientoQuimico>(app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_TratamientoQuimico.class, "Pedido.Proceso.Fase.TratamientoQuimico", "TexplusNET", remoteHandle);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtPedido_Proceso_Fase_Tratamientoquimico.readxml(oReader, "TratamientoQuimico") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "TratamientoQuimico") )
               {
                  GXSoapError = oReader.read() ;
               }
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Parametro") )
            {
               if ( gxTv_SdtPedido_Proceso_Fase_Parametro == null )
               {
                  gxTv_SdtPedido_Proceso_Fase_Parametro = new GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_Parametro>(app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_Parametro.class, "Pedido.Proceso.Fase.Parametro", "TexplusNET", remoteHandle);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtPedido_Proceso_Fase_Parametro.readxml(oReader, "Parametro") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Parametro") )
               {
                  GXSoapError = oReader.read() ;
               }
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtPedido_Proceso_Fase_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Modified") )
            {
               gxTv_SdtPedido_Proceso_Fase_Modified = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtPedido_Proceso_Fase_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisFasLin_Z") )
            {
               gxTv_SdtPedido_Proceso_Fase_Disfaslin_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FasCod_Z") )
            {
               gxTv_SdtPedido_Proceso_Fase_Fascod_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FasDsc_Z") )
            {
               gxTv_SdtPedido_Proceso_Fase_Fasdsc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisQuiUl_Z") )
            {
               gxTv_SdtPedido_Proceso_Fase_Disquiul_Z = (short)(getnumericvalue(oReader.getValue())) ;
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
         sName = "Pedido.Proceso.Fase" ;
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
      oWriter.writeElement("DisFasLin", GXutil.trim( GXutil.str( gxTv_SdtPedido_Proceso_Fase_Disfaslin, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FasCod", gxTv_SdtPedido_Proceso_Fase_Fascod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FasDsc", gxTv_SdtPedido_Proceso_Fase_Fasdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisQuiUl", GXutil.trim( GXutil.str( gxTv_SdtPedido_Proceso_Fase_Disquiul, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtPedido_Proceso_Fase_Tratamientoquimico != null )
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
         gxTv_SdtPedido_Proceso_Fase_Tratamientoquimico.writexml(oWriter, "TratamientoQuimico", sNameSpace1, sIncludeState);
      }
      if ( gxTv_SdtPedido_Proceso_Fase_Parametro != null )
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
         gxTv_SdtPedido_Proceso_Fase_Parametro.writexml(oWriter, "Parametro", sNameSpace1, sIncludeState);
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", gxTv_SdtPedido_Proceso_Fase_Mode);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Modified", GXutil.trim( GXutil.str( gxTv_SdtPedido_Proceso_Fase_Modified, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtPedido_Proceso_Fase_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisFasLin_Z", GXutil.trim( GXutil.str( gxTv_SdtPedido_Proceso_Fase_Disfaslin_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("FasCod_Z", gxTv_SdtPedido_Proceso_Fase_Fascod_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("FasDsc_Z", gxTv_SdtPedido_Proceso_Fase_Fasdsc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisQuiUl_Z", GXutil.trim( GXutil.str( gxTv_SdtPedido_Proceso_Fase_Disquiul_Z, 4, 0)));
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
      AddObjectProperty("DisFasLin", gxTv_SdtPedido_Proceso_Fase_Disfaslin, false, includeNonInitialized);
      AddObjectProperty("FasCod", gxTv_SdtPedido_Proceso_Fase_Fascod, false, includeNonInitialized);
      AddObjectProperty("FasDsc", gxTv_SdtPedido_Proceso_Fase_Fasdsc, false, includeNonInitialized);
      AddObjectProperty("DisQuiUl", gxTv_SdtPedido_Proceso_Fase_Disquiul, false, includeNonInitialized);
      if ( gxTv_SdtPedido_Proceso_Fase_Tratamientoquimico != null )
      {
         AddObjectProperty("TratamientoQuimico", gxTv_SdtPedido_Proceso_Fase_Tratamientoquimico, includeState, includeNonInitialized);
      }
      if ( gxTv_SdtPedido_Proceso_Fase_Parametro != null )
      {
         AddObjectProperty("Parametro", gxTv_SdtPedido_Proceso_Fase_Parametro, includeState, includeNonInitialized);
      }
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtPedido_Proceso_Fase_Mode, false, includeNonInitialized);
         AddObjectProperty("Modified", gxTv_SdtPedido_Proceso_Fase_Modified, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_SdtPedido_Proceso_Fase_Initialized, false, includeNonInitialized);
         AddObjectProperty("DisFasLin_Z", gxTv_SdtPedido_Proceso_Fase_Disfaslin_Z, false, includeNonInitialized);
         AddObjectProperty("FasCod_Z", gxTv_SdtPedido_Proceso_Fase_Fascod_Z, false, includeNonInitialized);
         AddObjectProperty("FasDsc_Z", gxTv_SdtPedido_Proceso_Fase_Fasdsc_Z, false, includeNonInitialized);
         AddObjectProperty("DisQuiUl_Z", gxTv_SdtPedido_Proceso_Fase_Disquiul_Z, false, includeNonInitialized);
      }
   }

   public void updateDirties( app.pedidosclientesindetalle.SdtPedido_Proceso_Fase sdt )
   {
      if ( sdt.IsDirty("DisFasLin") )
      {
         gxTv_SdtPedido_Proceso_Fase_N = (byte)(0) ;
         gxTv_SdtPedido_Proceso_Fase_Disfaslin = sdt.getgxTv_SdtPedido_Proceso_Fase_Disfaslin() ;
      }
      if ( sdt.IsDirty("FasCod") )
      {
         gxTv_SdtPedido_Proceso_Fase_N = (byte)(0) ;
         gxTv_SdtPedido_Proceso_Fase_Fascod = sdt.getgxTv_SdtPedido_Proceso_Fase_Fascod() ;
      }
      if ( sdt.IsDirty("FasDsc") )
      {
         gxTv_SdtPedido_Proceso_Fase_N = (byte)(0) ;
         gxTv_SdtPedido_Proceso_Fase_Fasdsc = sdt.getgxTv_SdtPedido_Proceso_Fase_Fasdsc() ;
      }
      if ( sdt.IsDirty("DisQuiUl") )
      {
         gxTv_SdtPedido_Proceso_Fase_N = (byte)(0) ;
         gxTv_SdtPedido_Proceso_Fase_Disquiul = sdt.getgxTv_SdtPedido_Proceso_Fase_Disquiul() ;
      }
      if ( gxTv_SdtPedido_Proceso_Fase_Tratamientoquimico != null )
      {
         GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_TratamientoQuimico> newCollectionTratamientoquimico = sdt.getgxTv_SdtPedido_Proceso_Fase_Tratamientoquimico();
         app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_TratamientoQuimico currItemTratamientoquimico;
         app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_TratamientoQuimico newItemTratamientoquimico;
         short idx = 1;
         while ( idx <= newCollectionTratamientoquimico.size() )
         {
            newItemTratamientoquimico = (app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_TratamientoQuimico)((app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_TratamientoQuimico)newCollectionTratamientoquimico.elementAt(-1+idx));
            currItemTratamientoquimico = (app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_TratamientoQuimico)gxTv_SdtPedido_Proceso_Fase_Tratamientoquimico.getByKey(newItemTratamientoquimico.getgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Disquilin());
            if ( GXutil.strcmp(currItemTratamientoquimico.getgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Mode(), "UPD") == 0 )
            {
               currItemTratamientoquimico.updateDirties(newItemTratamientoquimico);
               if ( GXutil.strcmp(newItemTratamientoquimico.getgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Mode(), "DLT") == 0 )
               {
                  currItemTratamientoquimico.setgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Mode( "DLT" );
               }
               currItemTratamientoquimico.setgxTv_SdtPedido_Proceso_Fase_TratamientoQuimico_Modified( (short)(1) );
            }
            else
            {
               gxTv_SdtPedido_Proceso_Fase_Tratamientoquimico.add(newItemTratamientoquimico, 0);
            }
            idx = (short)(idx+1) ;
         }
      }
      if ( gxTv_SdtPedido_Proceso_Fase_Parametro != null )
      {
         GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_Parametro> newCollectionParametro = sdt.getgxTv_SdtPedido_Proceso_Fase_Parametro();
         app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_Parametro currItemParametro;
         app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_Parametro newItemParametro;
         short idx = 1;
         while ( idx <= newCollectionParametro.size() )
         {
            newItemParametro = (app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_Parametro)((app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_Parametro)newCollectionParametro.elementAt(-1+idx));
            currItemParametro = (app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_Parametro)gxTv_SdtPedido_Proceso_Fase_Parametro.getByKey(newItemParametro.getgxTv_SdtPedido_Proceso_Fase_Parametro_Parfascod());
            if ( GXutil.strcmp(currItemParametro.getgxTv_SdtPedido_Proceso_Fase_Parametro_Mode(), "UPD") == 0 )
            {
               currItemParametro.updateDirties(newItemParametro);
               if ( GXutil.strcmp(newItemParametro.getgxTv_SdtPedido_Proceso_Fase_Parametro_Mode(), "DLT") == 0 )
               {
                  currItemParametro.setgxTv_SdtPedido_Proceso_Fase_Parametro_Mode( "DLT" );
               }
               currItemParametro.setgxTv_SdtPedido_Proceso_Fase_Parametro_Modified( (short)(1) );
            }
            else
            {
               gxTv_SdtPedido_Proceso_Fase_Parametro.add(newItemParametro, 0);
            }
            idx = (short)(idx+1) ;
         }
      }
   }

   public short getgxTv_SdtPedido_Proceso_Fase_Disfaslin( )
   {
      return gxTv_SdtPedido_Proceso_Fase_Disfaslin ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_Disfaslin( short value )
   {
      gxTv_SdtPedido_Proceso_Fase_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_Modified = (short)(1) ;
      SetDirty("Disfaslin");
      gxTv_SdtPedido_Proceso_Fase_Disfaslin = value ;
   }

   public String getgxTv_SdtPedido_Proceso_Fase_Fascod( )
   {
      return gxTv_SdtPedido_Proceso_Fase_Fascod ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_Fascod( String value )
   {
      gxTv_SdtPedido_Proceso_Fase_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_Modified = (short)(1) ;
      SetDirty("Fascod");
      gxTv_SdtPedido_Proceso_Fase_Fascod = value ;
   }

   public String getgxTv_SdtPedido_Proceso_Fase_Fasdsc( )
   {
      return gxTv_SdtPedido_Proceso_Fase_Fasdsc ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_Fasdsc( String value )
   {
      gxTv_SdtPedido_Proceso_Fase_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_Modified = (short)(1) ;
      SetDirty("Fasdsc");
      gxTv_SdtPedido_Proceso_Fase_Fasdsc = value ;
   }

   public short getgxTv_SdtPedido_Proceso_Fase_Disquiul( )
   {
      return gxTv_SdtPedido_Proceso_Fase_Disquiul ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_Disquiul( short value )
   {
      gxTv_SdtPedido_Proceso_Fase_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_Modified = (short)(1) ;
      SetDirty("Disquiul");
      gxTv_SdtPedido_Proceso_Fase_Disquiul = value ;
   }

   public GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_TratamientoQuimico> getgxTv_SdtPedido_Proceso_Fase_Tratamientoquimico( )
   {
      if ( gxTv_SdtPedido_Proceso_Fase_Tratamientoquimico == null )
      {
         gxTv_SdtPedido_Proceso_Fase_Tratamientoquimico = new GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_TratamientoQuimico>(app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_TratamientoQuimico.class, "Pedido.Proceso.Fase.TratamientoQuimico", "TexplusNET", remoteHandle);
      }
      gxTv_SdtPedido_Proceso_Fase_N = (byte)(0) ;
      return gxTv_SdtPedido_Proceso_Fase_Tratamientoquimico ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_Tratamientoquimico( GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_TratamientoQuimico> value )
   {
      gxTv_SdtPedido_Proceso_Fase_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_Modified = (short)(1) ;
      SetDirty("Tratamientoquimico");
      gxTv_SdtPedido_Proceso_Fase_Tratamientoquimico = value ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_Tratamientoquimico_SetNull( )
   {
      gxTv_SdtPedido_Proceso_Fase_Tratamientoquimico = null ;
      SetDirty("Tratamientoquimico");
   }

   public boolean getgxTv_SdtPedido_Proceso_Fase_Tratamientoquimico_IsNull( )
   {
      if ( gxTv_SdtPedido_Proceso_Fase_Tratamientoquimico == null )
      {
         return true ;
      }
      return false ;
   }

   public GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_Parametro> getgxTv_SdtPedido_Proceso_Fase_Parametro( )
   {
      if ( gxTv_SdtPedido_Proceso_Fase_Parametro == null )
      {
         gxTv_SdtPedido_Proceso_Fase_Parametro = new GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_Parametro>(app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_Parametro.class, "Pedido.Proceso.Fase.Parametro", "TexplusNET", remoteHandle);
      }
      gxTv_SdtPedido_Proceso_Fase_N = (byte)(0) ;
      return gxTv_SdtPedido_Proceso_Fase_Parametro ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_Parametro( GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_Parametro> value )
   {
      gxTv_SdtPedido_Proceso_Fase_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_Modified = (short)(1) ;
      SetDirty("Parametro");
      gxTv_SdtPedido_Proceso_Fase_Parametro = value ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_Parametro_SetNull( )
   {
      gxTv_SdtPedido_Proceso_Fase_Parametro = null ;
      SetDirty("Parametro");
   }

   public boolean getgxTv_SdtPedido_Proceso_Fase_Parametro_IsNull( )
   {
      if ( gxTv_SdtPedido_Proceso_Fase_Parametro == null )
      {
         return true ;
      }
      return false ;
   }

   public String getgxTv_SdtPedido_Proceso_Fase_Mode( )
   {
      return gxTv_SdtPedido_Proceso_Fase_Mode ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_Mode( String value )
   {
      gxTv_SdtPedido_Proceso_Fase_N = (byte)(0) ;
      SetDirty("Mode");
      gxTv_SdtPedido_Proceso_Fase_Mode = value ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_Mode_SetNull( )
   {
      gxTv_SdtPedido_Proceso_Fase_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_SdtPedido_Proceso_Fase_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPedido_Proceso_Fase_Modified( )
   {
      return gxTv_SdtPedido_Proceso_Fase_Modified ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_Modified( short value )
   {
      gxTv_SdtPedido_Proceso_Fase_N = (byte)(0) ;
      SetDirty("Modified");
      gxTv_SdtPedido_Proceso_Fase_Modified = value ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_Modified_SetNull( )
   {
      gxTv_SdtPedido_Proceso_Fase_Modified = (short)(0) ;
      SetDirty("Modified");
   }

   public boolean getgxTv_SdtPedido_Proceso_Fase_Modified_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPedido_Proceso_Fase_Initialized( )
   {
      return gxTv_SdtPedido_Proceso_Fase_Initialized ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_Initialized( short value )
   {
      gxTv_SdtPedido_Proceso_Fase_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_Modified = (short)(1) ;
      SetDirty("Initialized");
      gxTv_SdtPedido_Proceso_Fase_Initialized = value ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_Initialized_SetNull( )
   {
      gxTv_SdtPedido_Proceso_Fase_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_SdtPedido_Proceso_Fase_Initialized_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPedido_Proceso_Fase_Disfaslin_Z( )
   {
      return gxTv_SdtPedido_Proceso_Fase_Disfaslin_Z ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_Disfaslin_Z( short value )
   {
      gxTv_SdtPedido_Proceso_Fase_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_Modified = (short)(1) ;
      SetDirty("Disfaslin_Z");
      gxTv_SdtPedido_Proceso_Fase_Disfaslin_Z = value ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_Disfaslin_Z_SetNull( )
   {
      gxTv_SdtPedido_Proceso_Fase_Disfaslin_Z = (short)(0) ;
      SetDirty("Disfaslin_Z");
   }

   public boolean getgxTv_SdtPedido_Proceso_Fase_Disfaslin_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Proceso_Fase_Fascod_Z( )
   {
      return gxTv_SdtPedido_Proceso_Fase_Fascod_Z ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_Fascod_Z( String value )
   {
      gxTv_SdtPedido_Proceso_Fase_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_Modified = (short)(1) ;
      SetDirty("Fascod_Z");
      gxTv_SdtPedido_Proceso_Fase_Fascod_Z = value ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_Fascod_Z_SetNull( )
   {
      gxTv_SdtPedido_Proceso_Fase_Fascod_Z = "" ;
      SetDirty("Fascod_Z");
   }

   public boolean getgxTv_SdtPedido_Proceso_Fase_Fascod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Proceso_Fase_Fasdsc_Z( )
   {
      return gxTv_SdtPedido_Proceso_Fase_Fasdsc_Z ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_Fasdsc_Z( String value )
   {
      gxTv_SdtPedido_Proceso_Fase_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_Modified = (short)(1) ;
      SetDirty("Fasdsc_Z");
      gxTv_SdtPedido_Proceso_Fase_Fasdsc_Z = value ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_Fasdsc_Z_SetNull( )
   {
      gxTv_SdtPedido_Proceso_Fase_Fasdsc_Z = "" ;
      SetDirty("Fasdsc_Z");
   }

   public boolean getgxTv_SdtPedido_Proceso_Fase_Fasdsc_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPedido_Proceso_Fase_Disquiul_Z( )
   {
      return gxTv_SdtPedido_Proceso_Fase_Disquiul_Z ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_Disquiul_Z( short value )
   {
      gxTv_SdtPedido_Proceso_Fase_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso_Fase_Modified = (short)(1) ;
      SetDirty("Disquiul_Z");
      gxTv_SdtPedido_Proceso_Fase_Disquiul_Z = value ;
   }

   public void setgxTv_SdtPedido_Proceso_Fase_Disquiul_Z_SetNull( )
   {
      gxTv_SdtPedido_Proceso_Fase_Disquiul_Z = (short)(0) ;
      SetDirty("Disquiul_Z");
   }

   public boolean getgxTv_SdtPedido_Proceso_Fase_Disquiul_Z_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtPedido_Proceso_Fase_N = (byte)(1) ;
      gxTv_SdtPedido_Proceso_Fase_Fascod = "" ;
      gxTv_SdtPedido_Proceso_Fase_Fasdsc = "" ;
      gxTv_SdtPedido_Proceso_Fase_Mode = "" ;
      gxTv_SdtPedido_Proceso_Fase_Fascod_Z = "" ;
      gxTv_SdtPedido_Proceso_Fase_Fasdsc_Z = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtPedido_Proceso_Fase_N ;
   }

   public app.pedidosclientesindetalle.SdtPedido_Proceso_Fase Clone( )
   {
      return (app.pedidosclientesindetalle.SdtPedido_Proceso_Fase)(clone()) ;
   }

   public void setStruct( app.pedidosclientesindetalle.StructSdtPedido_Proceso_Fase struct )
   {
      setgxTv_SdtPedido_Proceso_Fase_Disfaslin(struct.getDisfaslin());
      setgxTv_SdtPedido_Proceso_Fase_Fascod(struct.getFascod());
      setgxTv_SdtPedido_Proceso_Fase_Fasdsc(struct.getFasdsc());
      setgxTv_SdtPedido_Proceso_Fase_Disquiul(struct.getDisquiul());
      GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_TratamientoQuimico> gxTv_SdtPedido_Proceso_Fase_Tratamientoquimico_aux = new GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_TratamientoQuimico>(app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_TratamientoQuimico.class, "Pedido.Proceso.Fase.TratamientoQuimico", "TexplusNET", remoteHandle);
      Vector<app.pedidosclientesindetalle.StructSdtPedido_Proceso_Fase_TratamientoQuimico> gxTv_SdtPedido_Proceso_Fase_Tratamientoquimico_aux1 = struct.getTratamientoquimico();
      if (gxTv_SdtPedido_Proceso_Fase_Tratamientoquimico_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtPedido_Proceso_Fase_Tratamientoquimico_aux1.size(); i++)
         {
            gxTv_SdtPedido_Proceso_Fase_Tratamientoquimico_aux.add(new app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_TratamientoQuimico(remoteHandle, gxTv_SdtPedido_Proceso_Fase_Tratamientoquimico_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtPedido_Proceso_Fase_Tratamientoquimico(gxTv_SdtPedido_Proceso_Fase_Tratamientoquimico_aux);
      GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_Parametro> gxTv_SdtPedido_Proceso_Fase_Parametro_aux = new GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_Parametro>(app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_Parametro.class, "Pedido.Proceso.Fase.Parametro", "TexplusNET", remoteHandle);
      Vector<app.pedidosclientesindetalle.StructSdtPedido_Proceso_Fase_Parametro> gxTv_SdtPedido_Proceso_Fase_Parametro_aux1 = struct.getParametro();
      if (gxTv_SdtPedido_Proceso_Fase_Parametro_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtPedido_Proceso_Fase_Parametro_aux1.size(); i++)
         {
            gxTv_SdtPedido_Proceso_Fase_Parametro_aux.add(new app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_Parametro(remoteHandle, gxTv_SdtPedido_Proceso_Fase_Parametro_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtPedido_Proceso_Fase_Parametro(gxTv_SdtPedido_Proceso_Fase_Parametro_aux);
      setgxTv_SdtPedido_Proceso_Fase_Mode(struct.getMode());
      setgxTv_SdtPedido_Proceso_Fase_Modified(struct.getModified());
      setgxTv_SdtPedido_Proceso_Fase_Initialized(struct.getInitialized());
      setgxTv_SdtPedido_Proceso_Fase_Disfaslin_Z(struct.getDisfaslin_Z());
      setgxTv_SdtPedido_Proceso_Fase_Fascod_Z(struct.getFascod_Z());
      setgxTv_SdtPedido_Proceso_Fase_Fasdsc_Z(struct.getFasdsc_Z());
      setgxTv_SdtPedido_Proceso_Fase_Disquiul_Z(struct.getDisquiul_Z());
   }

   @SuppressWarnings("unchecked")
   public app.pedidosclientesindetalle.StructSdtPedido_Proceso_Fase getStruct( )
   {
      app.pedidosclientesindetalle.StructSdtPedido_Proceso_Fase struct = new app.pedidosclientesindetalle.StructSdtPedido_Proceso_Fase ();
      struct.setDisfaslin(getgxTv_SdtPedido_Proceso_Fase_Disfaslin());
      struct.setFascod(getgxTv_SdtPedido_Proceso_Fase_Fascod());
      struct.setFasdsc(getgxTv_SdtPedido_Proceso_Fase_Fasdsc());
      struct.setDisquiul(getgxTv_SdtPedido_Proceso_Fase_Disquiul());
      struct.setTratamientoquimico(getgxTv_SdtPedido_Proceso_Fase_Tratamientoquimico().getStruct());
      struct.setParametro(getgxTv_SdtPedido_Proceso_Fase_Parametro().getStruct());
      struct.setMode(getgxTv_SdtPedido_Proceso_Fase_Mode());
      struct.setModified(getgxTv_SdtPedido_Proceso_Fase_Modified());
      struct.setInitialized(getgxTv_SdtPedido_Proceso_Fase_Initialized());
      struct.setDisfaslin_Z(getgxTv_SdtPedido_Proceso_Fase_Disfaslin_Z());
      struct.setFascod_Z(getgxTv_SdtPedido_Proceso_Fase_Fascod_Z());
      struct.setFasdsc_Z(getgxTv_SdtPedido_Proceso_Fase_Fasdsc_Z());
      struct.setDisquiul_Z(getgxTv_SdtPedido_Proceso_Fase_Disquiul_Z());
      return struct ;
   }

   private byte gxTv_SdtPedido_Proceso_Fase_N ;
   private short gxTv_SdtPedido_Proceso_Fase_Disfaslin ;
   private short gxTv_SdtPedido_Proceso_Fase_Disquiul ;
   private short gxTv_SdtPedido_Proceso_Fase_Modified ;
   private short gxTv_SdtPedido_Proceso_Fase_Initialized ;
   private short gxTv_SdtPedido_Proceso_Fase_Disfaslin_Z ;
   private short gxTv_SdtPedido_Proceso_Fase_Disquiul_Z ;
   private short readOk ;
   private short nOutParmCount ;
   private String gxTv_SdtPedido_Proceso_Fase_Fascod ;
   private String gxTv_SdtPedido_Proceso_Fase_Fasdsc ;
   private String gxTv_SdtPedido_Proceso_Fase_Mode ;
   private String gxTv_SdtPedido_Proceso_Fase_Fascod_Z ;
   private String gxTv_SdtPedido_Proceso_Fase_Fasdsc_Z ;
   private String sTagName ;
   private boolean readElement ;
   private boolean formatError ;
   private GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_TratamientoQuimico> gxTv_SdtPedido_Proceso_Fase_Tratamientoquimico_aux ;
   private GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_Parametro> gxTv_SdtPedido_Proceso_Fase_Parametro_aux ;
   private GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_TratamientoQuimico> gxTv_SdtPedido_Proceso_Fase_Tratamientoquimico=null ;
   private GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Proceso_Fase_Parametro> gxTv_SdtPedido_Proceso_Fase_Parametro=null ;
}

