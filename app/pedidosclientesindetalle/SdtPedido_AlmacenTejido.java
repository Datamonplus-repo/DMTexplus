package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtPedido_AlmacenTejido extends GxSilentTrnSdt
{
   public SdtPedido_AlmacenTejido( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtPedido_AlmacenTejido.class));
   }

   public SdtPedido_AlmacenTejido( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle, context, "SdtPedido_AlmacenTejido");
      initialize( remoteHandle) ;
   }

   public SdtPedido_AlmacenTejido( int remoteHandle ,
                                   StructSdtPedido_AlmacenTejido struct )
   {
      this(remoteHandle);
      setStruct(struct);
   }

   public SdtPedido_AlmacenTejido( )
   {
      super( new ModelContext(SdtPedido_AlmacenTejido.class), "SdtPedido_AlmacenTejido");
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
      return (Object[][])(new Object[][]{new Object[]{"AlbRecCod", int.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "AlmacenTejido");
      metadata.set("BT", "TXPDISALB");
      metadata.set("PK", "[ \"AlbRecCod\" ]");
      metadata.set("FKList", "[ { \"FK\":[ \"EmprCod\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"AlbRecCod\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"DisCod\" ],\"FKMap\":[  ] } ]");
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRecCod") )
            {
               gxTv_SdtPedido_AlmacenTejido_Albreccod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRefDsc") )
            {
               gxTv_SdtPedido_AlmacenTejido_Albrefdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRReo") )
            {
               gxTv_SdtPedido_AlmacenTejido_Albrreo = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Piezas") )
            {
               gxTv_SdtPedido_AlmacenTejido_Piezas = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRPieDis") )
            {
               gxTv_SdtPedido_AlmacenTejido_Albrpiedis = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Kilos") )
            {
               gxTv_SdtPedido_AlmacenTejido_Kilos = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Metros") )
            {
               gxTv_SdtPedido_AlmacenTejido_Metros = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRUniDis") )
            {
               gxTv_SdtPedido_AlmacenTejido_Albrunidis = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtPedido_AlmacenTejido_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Modified") )
            {
               gxTv_SdtPedido_AlmacenTejido_Modified = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtPedido_AlmacenTejido_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRecCod_Z") )
            {
               gxTv_SdtPedido_AlmacenTejido_Albreccod_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRefDsc_Z") )
            {
               gxTv_SdtPedido_AlmacenTejido_Albrefdsc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRReo_Z") )
            {
               gxTv_SdtPedido_AlmacenTejido_Albrreo_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Piezas_Z") )
            {
               gxTv_SdtPedido_AlmacenTejido_Piezas_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRPieDis_Z") )
            {
               gxTv_SdtPedido_AlmacenTejido_Albrpiedis_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Kilos_Z") )
            {
               gxTv_SdtPedido_AlmacenTejido_Kilos_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Metros_Z") )
            {
               gxTv_SdtPedido_AlmacenTejido_Metros_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRUniDis_Z") )
            {
               gxTv_SdtPedido_AlmacenTejido_Albrunidis_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "Pedido.AlmacenTejido" ;
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
      oWriter.writeElement("AlbRecCod", GXutil.trim( GXutil.str( gxTv_SdtPedido_AlmacenTejido_Albreccod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRefDsc", gxTv_SdtPedido_AlmacenTejido_Albrefdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRReo", gxTv_SdtPedido_AlmacenTejido_Albrreo);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Piezas", GXutil.trim( GXutil.str( gxTv_SdtPedido_AlmacenTejido_Piezas, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRPieDis", GXutil.trim( GXutil.str( gxTv_SdtPedido_AlmacenTejido_Albrpiedis, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Kilos", GXutil.trim( GXutil.strNoRound( gxTv_SdtPedido_AlmacenTejido_Kilos, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Metros", GXutil.trim( GXutil.strNoRound( gxTv_SdtPedido_AlmacenTejido_Metros, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRUniDis", GXutil.trim( GXutil.strNoRound( gxTv_SdtPedido_AlmacenTejido_Albrunidis, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", gxTv_SdtPedido_AlmacenTejido_Mode);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Modified", GXutil.trim( GXutil.str( gxTv_SdtPedido_AlmacenTejido_Modified, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtPedido_AlmacenTejido_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRecCod_Z", GXutil.trim( GXutil.str( gxTv_SdtPedido_AlmacenTejido_Albreccod_Z, 8, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRefDsc_Z", gxTv_SdtPedido_AlmacenTejido_Albrefdsc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRReo_Z", gxTv_SdtPedido_AlmacenTejido_Albrreo_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Piezas_Z", GXutil.trim( GXutil.str( gxTv_SdtPedido_AlmacenTejido_Piezas_Z, 6, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRPieDis_Z", GXutil.trim( GXutil.str( gxTv_SdtPedido_AlmacenTejido_Albrpiedis_Z, 6, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Kilos_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtPedido_AlmacenTejido_Kilos_Z, 9, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Metros_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtPedido_AlmacenTejido_Metros_Z, 9, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRUniDis_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtPedido_AlmacenTejido_Albrunidis_Z, 9, 2)));
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
      AddObjectProperty("AlbRecCod", gxTv_SdtPedido_AlmacenTejido_Albreccod, false, includeNonInitialized);
      AddObjectProperty("AlbRefDsc", gxTv_SdtPedido_AlmacenTejido_Albrefdsc, false, includeNonInitialized);
      AddObjectProperty("AlbRReo", gxTv_SdtPedido_AlmacenTejido_Albrreo, false, includeNonInitialized);
      AddObjectProperty("Piezas", gxTv_SdtPedido_AlmacenTejido_Piezas, false, includeNonInitialized);
      AddObjectProperty("AlbRPieDis", gxTv_SdtPedido_AlmacenTejido_Albrpiedis, false, includeNonInitialized);
      AddObjectProperty("Kilos", gxTv_SdtPedido_AlmacenTejido_Kilos, false, includeNonInitialized);
      AddObjectProperty("Metros", gxTv_SdtPedido_AlmacenTejido_Metros, false, includeNonInitialized);
      AddObjectProperty("AlbRUniDis", gxTv_SdtPedido_AlmacenTejido_Albrunidis, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtPedido_AlmacenTejido_Mode, false, includeNonInitialized);
         AddObjectProperty("Modified", gxTv_SdtPedido_AlmacenTejido_Modified, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_SdtPedido_AlmacenTejido_Initialized, false, includeNonInitialized);
         AddObjectProperty("AlbRecCod_Z", gxTv_SdtPedido_AlmacenTejido_Albreccod_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRefDsc_Z", gxTv_SdtPedido_AlmacenTejido_Albrefdsc_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRReo_Z", gxTv_SdtPedido_AlmacenTejido_Albrreo_Z, false, includeNonInitialized);
         AddObjectProperty("Piezas_Z", gxTv_SdtPedido_AlmacenTejido_Piezas_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRPieDis_Z", gxTv_SdtPedido_AlmacenTejido_Albrpiedis_Z, false, includeNonInitialized);
         AddObjectProperty("Kilos_Z", gxTv_SdtPedido_AlmacenTejido_Kilos_Z, false, includeNonInitialized);
         AddObjectProperty("Metros_Z", gxTv_SdtPedido_AlmacenTejido_Metros_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRUniDis_Z", gxTv_SdtPedido_AlmacenTejido_Albrunidis_Z, false, includeNonInitialized);
      }
   }

   public void updateDirties( app.pedidosclientesindetalle.SdtPedido_AlmacenTejido sdt )
   {
      if ( sdt.IsDirty("AlbRecCod") )
      {
         gxTv_SdtPedido_AlmacenTejido_N = (byte)(0) ;
         gxTv_SdtPedido_AlmacenTejido_Albreccod = sdt.getgxTv_SdtPedido_AlmacenTejido_Albreccod() ;
      }
      if ( sdt.IsDirty("AlbRefDsc") )
      {
         gxTv_SdtPedido_AlmacenTejido_N = (byte)(0) ;
         gxTv_SdtPedido_AlmacenTejido_Albrefdsc = sdt.getgxTv_SdtPedido_AlmacenTejido_Albrefdsc() ;
      }
      if ( sdt.IsDirty("AlbRReo") )
      {
         gxTv_SdtPedido_AlmacenTejido_N = (byte)(0) ;
         gxTv_SdtPedido_AlmacenTejido_Albrreo = sdt.getgxTv_SdtPedido_AlmacenTejido_Albrreo() ;
      }
      if ( sdt.IsDirty("Piezas") )
      {
         gxTv_SdtPedido_AlmacenTejido_N = (byte)(0) ;
         gxTv_SdtPedido_AlmacenTejido_Piezas = sdt.getgxTv_SdtPedido_AlmacenTejido_Piezas() ;
      }
      if ( sdt.IsDirty("AlbRPieDis") )
      {
         gxTv_SdtPedido_AlmacenTejido_N = (byte)(0) ;
         gxTv_SdtPedido_AlmacenTejido_Albrpiedis = sdt.getgxTv_SdtPedido_AlmacenTejido_Albrpiedis() ;
      }
      if ( sdt.IsDirty("Kilos") )
      {
         gxTv_SdtPedido_AlmacenTejido_N = (byte)(0) ;
         gxTv_SdtPedido_AlmacenTejido_Kilos = sdt.getgxTv_SdtPedido_AlmacenTejido_Kilos() ;
      }
      if ( sdt.IsDirty("Metros") )
      {
         gxTv_SdtPedido_AlmacenTejido_N = (byte)(0) ;
         gxTv_SdtPedido_AlmacenTejido_Metros = sdt.getgxTv_SdtPedido_AlmacenTejido_Metros() ;
      }
      if ( sdt.IsDirty("AlbRUniDis") )
      {
         gxTv_SdtPedido_AlmacenTejido_N = (byte)(0) ;
         gxTv_SdtPedido_AlmacenTejido_Albrunidis = sdt.getgxTv_SdtPedido_AlmacenTejido_Albrunidis() ;
      }
   }

   public int getgxTv_SdtPedido_AlmacenTejido_Albreccod( )
   {
      return gxTv_SdtPedido_AlmacenTejido_Albreccod ;
   }

   public void setgxTv_SdtPedido_AlmacenTejido_Albreccod( int value )
   {
      gxTv_SdtPedido_AlmacenTejido_N = (byte)(0) ;
      gxTv_SdtPedido_AlmacenTejido_Modified = (short)(1) ;
      SetDirty("Albreccod");
      gxTv_SdtPedido_AlmacenTejido_Albreccod = value ;
   }

   public String getgxTv_SdtPedido_AlmacenTejido_Albrefdsc( )
   {
      return gxTv_SdtPedido_AlmacenTejido_Albrefdsc ;
   }

   public void setgxTv_SdtPedido_AlmacenTejido_Albrefdsc( String value )
   {
      gxTv_SdtPedido_AlmacenTejido_N = (byte)(0) ;
      gxTv_SdtPedido_AlmacenTejido_Modified = (short)(1) ;
      SetDirty("Albrefdsc");
      gxTv_SdtPedido_AlmacenTejido_Albrefdsc = value ;
   }

   public String getgxTv_SdtPedido_AlmacenTejido_Albrreo( )
   {
      return gxTv_SdtPedido_AlmacenTejido_Albrreo ;
   }

   public void setgxTv_SdtPedido_AlmacenTejido_Albrreo( String value )
   {
      gxTv_SdtPedido_AlmacenTejido_N = (byte)(0) ;
      gxTv_SdtPedido_AlmacenTejido_Modified = (short)(1) ;
      SetDirty("Albrreo");
      gxTv_SdtPedido_AlmacenTejido_Albrreo = value ;
   }

   public int getgxTv_SdtPedido_AlmacenTejido_Piezas( )
   {
      return gxTv_SdtPedido_AlmacenTejido_Piezas ;
   }

   public void setgxTv_SdtPedido_AlmacenTejido_Piezas( int value )
   {
      gxTv_SdtPedido_AlmacenTejido_N = (byte)(0) ;
      gxTv_SdtPedido_AlmacenTejido_Modified = (short)(1) ;
      SetDirty("Piezas");
      gxTv_SdtPedido_AlmacenTejido_Piezas = value ;
   }

   public int getgxTv_SdtPedido_AlmacenTejido_Albrpiedis( )
   {
      return gxTv_SdtPedido_AlmacenTejido_Albrpiedis ;
   }

   public void setgxTv_SdtPedido_AlmacenTejido_Albrpiedis( int value )
   {
      gxTv_SdtPedido_AlmacenTejido_N = (byte)(0) ;
      gxTv_SdtPedido_AlmacenTejido_Modified = (short)(1) ;
      SetDirty("Albrpiedis");
      gxTv_SdtPedido_AlmacenTejido_Albrpiedis = value ;
   }

   public void setgxTv_SdtPedido_AlmacenTejido_Albrpiedis_SetNull( )
   {
      gxTv_SdtPedido_AlmacenTejido_Albrpiedis = 0 ;
      SetDirty("Albrpiedis");
   }

   public boolean getgxTv_SdtPedido_AlmacenTejido_Albrpiedis_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtPedido_AlmacenTejido_Kilos( )
   {
      return gxTv_SdtPedido_AlmacenTejido_Kilos ;
   }

   public void setgxTv_SdtPedido_AlmacenTejido_Kilos( java.math.BigDecimal value )
   {
      gxTv_SdtPedido_AlmacenTejido_N = (byte)(0) ;
      gxTv_SdtPedido_AlmacenTejido_Modified = (short)(1) ;
      SetDirty("Kilos");
      gxTv_SdtPedido_AlmacenTejido_Kilos = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPedido_AlmacenTejido_Metros( )
   {
      return gxTv_SdtPedido_AlmacenTejido_Metros ;
   }

   public void setgxTv_SdtPedido_AlmacenTejido_Metros( java.math.BigDecimal value )
   {
      gxTv_SdtPedido_AlmacenTejido_N = (byte)(0) ;
      gxTv_SdtPedido_AlmacenTejido_Modified = (short)(1) ;
      SetDirty("Metros");
      gxTv_SdtPedido_AlmacenTejido_Metros = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPedido_AlmacenTejido_Albrunidis( )
   {
      return gxTv_SdtPedido_AlmacenTejido_Albrunidis ;
   }

   public void setgxTv_SdtPedido_AlmacenTejido_Albrunidis( java.math.BigDecimal value )
   {
      gxTv_SdtPedido_AlmacenTejido_N = (byte)(0) ;
      gxTv_SdtPedido_AlmacenTejido_Modified = (short)(1) ;
      SetDirty("Albrunidis");
      gxTv_SdtPedido_AlmacenTejido_Albrunidis = value ;
   }

   public void setgxTv_SdtPedido_AlmacenTejido_Albrunidis_SetNull( )
   {
      gxTv_SdtPedido_AlmacenTejido_Albrunidis = DecimalUtil.ZERO ;
      SetDirty("Albrunidis");
   }

   public boolean getgxTv_SdtPedido_AlmacenTejido_Albrunidis_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_AlmacenTejido_Mode( )
   {
      return gxTv_SdtPedido_AlmacenTejido_Mode ;
   }

   public void setgxTv_SdtPedido_AlmacenTejido_Mode( String value )
   {
      gxTv_SdtPedido_AlmacenTejido_N = (byte)(0) ;
      SetDirty("Mode");
      gxTv_SdtPedido_AlmacenTejido_Mode = value ;
   }

   public void setgxTv_SdtPedido_AlmacenTejido_Mode_SetNull( )
   {
      gxTv_SdtPedido_AlmacenTejido_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_SdtPedido_AlmacenTejido_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPedido_AlmacenTejido_Modified( )
   {
      return gxTv_SdtPedido_AlmacenTejido_Modified ;
   }

   public void setgxTv_SdtPedido_AlmacenTejido_Modified( short value )
   {
      gxTv_SdtPedido_AlmacenTejido_N = (byte)(0) ;
      SetDirty("Modified");
      gxTv_SdtPedido_AlmacenTejido_Modified = value ;
   }

   public void setgxTv_SdtPedido_AlmacenTejido_Modified_SetNull( )
   {
      gxTv_SdtPedido_AlmacenTejido_Modified = (short)(0) ;
      SetDirty("Modified");
   }

   public boolean getgxTv_SdtPedido_AlmacenTejido_Modified_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPedido_AlmacenTejido_Initialized( )
   {
      return gxTv_SdtPedido_AlmacenTejido_Initialized ;
   }

   public void setgxTv_SdtPedido_AlmacenTejido_Initialized( short value )
   {
      gxTv_SdtPedido_AlmacenTejido_N = (byte)(0) ;
      gxTv_SdtPedido_AlmacenTejido_Modified = (short)(1) ;
      SetDirty("Initialized");
      gxTv_SdtPedido_AlmacenTejido_Initialized = value ;
   }

   public void setgxTv_SdtPedido_AlmacenTejido_Initialized_SetNull( )
   {
      gxTv_SdtPedido_AlmacenTejido_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_SdtPedido_AlmacenTejido_Initialized_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtPedido_AlmacenTejido_Albreccod_Z( )
   {
      return gxTv_SdtPedido_AlmacenTejido_Albreccod_Z ;
   }

   public void setgxTv_SdtPedido_AlmacenTejido_Albreccod_Z( int value )
   {
      gxTv_SdtPedido_AlmacenTejido_N = (byte)(0) ;
      gxTv_SdtPedido_AlmacenTejido_Modified = (short)(1) ;
      SetDirty("Albreccod_Z");
      gxTv_SdtPedido_AlmacenTejido_Albreccod_Z = value ;
   }

   public void setgxTv_SdtPedido_AlmacenTejido_Albreccod_Z_SetNull( )
   {
      gxTv_SdtPedido_AlmacenTejido_Albreccod_Z = 0 ;
      SetDirty("Albreccod_Z");
   }

   public boolean getgxTv_SdtPedido_AlmacenTejido_Albreccod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_AlmacenTejido_Albrefdsc_Z( )
   {
      return gxTv_SdtPedido_AlmacenTejido_Albrefdsc_Z ;
   }

   public void setgxTv_SdtPedido_AlmacenTejido_Albrefdsc_Z( String value )
   {
      gxTv_SdtPedido_AlmacenTejido_N = (byte)(0) ;
      gxTv_SdtPedido_AlmacenTejido_Modified = (short)(1) ;
      SetDirty("Albrefdsc_Z");
      gxTv_SdtPedido_AlmacenTejido_Albrefdsc_Z = value ;
   }

   public void setgxTv_SdtPedido_AlmacenTejido_Albrefdsc_Z_SetNull( )
   {
      gxTv_SdtPedido_AlmacenTejido_Albrefdsc_Z = "" ;
      SetDirty("Albrefdsc_Z");
   }

   public boolean getgxTv_SdtPedido_AlmacenTejido_Albrefdsc_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_AlmacenTejido_Albrreo_Z( )
   {
      return gxTv_SdtPedido_AlmacenTejido_Albrreo_Z ;
   }

   public void setgxTv_SdtPedido_AlmacenTejido_Albrreo_Z( String value )
   {
      gxTv_SdtPedido_AlmacenTejido_N = (byte)(0) ;
      gxTv_SdtPedido_AlmacenTejido_Modified = (short)(1) ;
      SetDirty("Albrreo_Z");
      gxTv_SdtPedido_AlmacenTejido_Albrreo_Z = value ;
   }

   public void setgxTv_SdtPedido_AlmacenTejido_Albrreo_Z_SetNull( )
   {
      gxTv_SdtPedido_AlmacenTejido_Albrreo_Z = "" ;
      SetDirty("Albrreo_Z");
   }

   public boolean getgxTv_SdtPedido_AlmacenTejido_Albrreo_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtPedido_AlmacenTejido_Piezas_Z( )
   {
      return gxTv_SdtPedido_AlmacenTejido_Piezas_Z ;
   }

   public void setgxTv_SdtPedido_AlmacenTejido_Piezas_Z( int value )
   {
      gxTv_SdtPedido_AlmacenTejido_N = (byte)(0) ;
      gxTv_SdtPedido_AlmacenTejido_Modified = (short)(1) ;
      SetDirty("Piezas_Z");
      gxTv_SdtPedido_AlmacenTejido_Piezas_Z = value ;
   }

   public void setgxTv_SdtPedido_AlmacenTejido_Piezas_Z_SetNull( )
   {
      gxTv_SdtPedido_AlmacenTejido_Piezas_Z = 0 ;
      SetDirty("Piezas_Z");
   }

   public boolean getgxTv_SdtPedido_AlmacenTejido_Piezas_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtPedido_AlmacenTejido_Albrpiedis_Z( )
   {
      return gxTv_SdtPedido_AlmacenTejido_Albrpiedis_Z ;
   }

   public void setgxTv_SdtPedido_AlmacenTejido_Albrpiedis_Z( int value )
   {
      gxTv_SdtPedido_AlmacenTejido_N = (byte)(0) ;
      gxTv_SdtPedido_AlmacenTejido_Modified = (short)(1) ;
      SetDirty("Albrpiedis_Z");
      gxTv_SdtPedido_AlmacenTejido_Albrpiedis_Z = value ;
   }

   public void setgxTv_SdtPedido_AlmacenTejido_Albrpiedis_Z_SetNull( )
   {
      gxTv_SdtPedido_AlmacenTejido_Albrpiedis_Z = 0 ;
      SetDirty("Albrpiedis_Z");
   }

   public boolean getgxTv_SdtPedido_AlmacenTejido_Albrpiedis_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtPedido_AlmacenTejido_Kilos_Z( )
   {
      return gxTv_SdtPedido_AlmacenTejido_Kilos_Z ;
   }

   public void setgxTv_SdtPedido_AlmacenTejido_Kilos_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPedido_AlmacenTejido_N = (byte)(0) ;
      gxTv_SdtPedido_AlmacenTejido_Modified = (short)(1) ;
      SetDirty("Kilos_Z");
      gxTv_SdtPedido_AlmacenTejido_Kilos_Z = value ;
   }

   public void setgxTv_SdtPedido_AlmacenTejido_Kilos_Z_SetNull( )
   {
      gxTv_SdtPedido_AlmacenTejido_Kilos_Z = DecimalUtil.ZERO ;
      SetDirty("Kilos_Z");
   }

   public boolean getgxTv_SdtPedido_AlmacenTejido_Kilos_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtPedido_AlmacenTejido_Metros_Z( )
   {
      return gxTv_SdtPedido_AlmacenTejido_Metros_Z ;
   }

   public void setgxTv_SdtPedido_AlmacenTejido_Metros_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPedido_AlmacenTejido_N = (byte)(0) ;
      gxTv_SdtPedido_AlmacenTejido_Modified = (short)(1) ;
      SetDirty("Metros_Z");
      gxTv_SdtPedido_AlmacenTejido_Metros_Z = value ;
   }

   public void setgxTv_SdtPedido_AlmacenTejido_Metros_Z_SetNull( )
   {
      gxTv_SdtPedido_AlmacenTejido_Metros_Z = DecimalUtil.ZERO ;
      SetDirty("Metros_Z");
   }

   public boolean getgxTv_SdtPedido_AlmacenTejido_Metros_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtPedido_AlmacenTejido_Albrunidis_Z( )
   {
      return gxTv_SdtPedido_AlmacenTejido_Albrunidis_Z ;
   }

   public void setgxTv_SdtPedido_AlmacenTejido_Albrunidis_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPedido_AlmacenTejido_N = (byte)(0) ;
      gxTv_SdtPedido_AlmacenTejido_Modified = (short)(1) ;
      SetDirty("Albrunidis_Z");
      gxTv_SdtPedido_AlmacenTejido_Albrunidis_Z = value ;
   }

   public void setgxTv_SdtPedido_AlmacenTejido_Albrunidis_Z_SetNull( )
   {
      gxTv_SdtPedido_AlmacenTejido_Albrunidis_Z = DecimalUtil.ZERO ;
      SetDirty("Albrunidis_Z");
   }

   public boolean getgxTv_SdtPedido_AlmacenTejido_Albrunidis_Z_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtPedido_AlmacenTejido_N = (byte)(1) ;
      gxTv_SdtPedido_AlmacenTejido_Albrefdsc = "" ;
      gxTv_SdtPedido_AlmacenTejido_Albrreo = "" ;
      gxTv_SdtPedido_AlmacenTejido_Kilos = DecimalUtil.ZERO ;
      gxTv_SdtPedido_AlmacenTejido_Metros = DecimalUtil.ZERO ;
      gxTv_SdtPedido_AlmacenTejido_Albrunidis = DecimalUtil.ZERO ;
      gxTv_SdtPedido_AlmacenTejido_Mode = "" ;
      gxTv_SdtPedido_AlmacenTejido_Albrefdsc_Z = "" ;
      gxTv_SdtPedido_AlmacenTejido_Albrreo_Z = "" ;
      gxTv_SdtPedido_AlmacenTejido_Kilos_Z = DecimalUtil.ZERO ;
      gxTv_SdtPedido_AlmacenTejido_Metros_Z = DecimalUtil.ZERO ;
      gxTv_SdtPedido_AlmacenTejido_Albrunidis_Z = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtPedido_AlmacenTejido_N ;
   }

   public app.pedidosclientesindetalle.SdtPedido_AlmacenTejido Clone( )
   {
      return (app.pedidosclientesindetalle.SdtPedido_AlmacenTejido)(clone()) ;
   }

   public void setStruct( app.pedidosclientesindetalle.StructSdtPedido_AlmacenTejido struct )
   {
      setgxTv_SdtPedido_AlmacenTejido_Albreccod(struct.getAlbreccod());
      setgxTv_SdtPedido_AlmacenTejido_Albrefdsc(struct.getAlbrefdsc());
      setgxTv_SdtPedido_AlmacenTejido_Albrreo(struct.getAlbrreo());
      setgxTv_SdtPedido_AlmacenTejido_Piezas(struct.getPiezas());
      setgxTv_SdtPedido_AlmacenTejido_Albrpiedis(struct.getAlbrpiedis());
      setgxTv_SdtPedido_AlmacenTejido_Kilos(struct.getKilos());
      setgxTv_SdtPedido_AlmacenTejido_Metros(struct.getMetros());
      setgxTv_SdtPedido_AlmacenTejido_Albrunidis(struct.getAlbrunidis());
      setgxTv_SdtPedido_AlmacenTejido_Mode(struct.getMode());
      setgxTv_SdtPedido_AlmacenTejido_Modified(struct.getModified());
      setgxTv_SdtPedido_AlmacenTejido_Initialized(struct.getInitialized());
      setgxTv_SdtPedido_AlmacenTejido_Albreccod_Z(struct.getAlbreccod_Z());
      setgxTv_SdtPedido_AlmacenTejido_Albrefdsc_Z(struct.getAlbrefdsc_Z());
      setgxTv_SdtPedido_AlmacenTejido_Albrreo_Z(struct.getAlbrreo_Z());
      setgxTv_SdtPedido_AlmacenTejido_Piezas_Z(struct.getPiezas_Z());
      setgxTv_SdtPedido_AlmacenTejido_Albrpiedis_Z(struct.getAlbrpiedis_Z());
      setgxTv_SdtPedido_AlmacenTejido_Kilos_Z(struct.getKilos_Z());
      setgxTv_SdtPedido_AlmacenTejido_Metros_Z(struct.getMetros_Z());
      setgxTv_SdtPedido_AlmacenTejido_Albrunidis_Z(struct.getAlbrunidis_Z());
   }

   @SuppressWarnings("unchecked")
   public app.pedidosclientesindetalle.StructSdtPedido_AlmacenTejido getStruct( )
   {
      app.pedidosclientesindetalle.StructSdtPedido_AlmacenTejido struct = new app.pedidosclientesindetalle.StructSdtPedido_AlmacenTejido ();
      struct.setAlbreccod(getgxTv_SdtPedido_AlmacenTejido_Albreccod());
      struct.setAlbrefdsc(getgxTv_SdtPedido_AlmacenTejido_Albrefdsc());
      struct.setAlbrreo(getgxTv_SdtPedido_AlmacenTejido_Albrreo());
      struct.setPiezas(getgxTv_SdtPedido_AlmacenTejido_Piezas());
      struct.setAlbrpiedis(getgxTv_SdtPedido_AlmacenTejido_Albrpiedis());
      struct.setKilos(getgxTv_SdtPedido_AlmacenTejido_Kilos());
      struct.setMetros(getgxTv_SdtPedido_AlmacenTejido_Metros());
      struct.setAlbrunidis(getgxTv_SdtPedido_AlmacenTejido_Albrunidis());
      struct.setMode(getgxTv_SdtPedido_AlmacenTejido_Mode());
      struct.setModified(getgxTv_SdtPedido_AlmacenTejido_Modified());
      struct.setInitialized(getgxTv_SdtPedido_AlmacenTejido_Initialized());
      struct.setAlbreccod_Z(getgxTv_SdtPedido_AlmacenTejido_Albreccod_Z());
      struct.setAlbrefdsc_Z(getgxTv_SdtPedido_AlmacenTejido_Albrefdsc_Z());
      struct.setAlbrreo_Z(getgxTv_SdtPedido_AlmacenTejido_Albrreo_Z());
      struct.setPiezas_Z(getgxTv_SdtPedido_AlmacenTejido_Piezas_Z());
      struct.setAlbrpiedis_Z(getgxTv_SdtPedido_AlmacenTejido_Albrpiedis_Z());
      struct.setKilos_Z(getgxTv_SdtPedido_AlmacenTejido_Kilos_Z());
      struct.setMetros_Z(getgxTv_SdtPedido_AlmacenTejido_Metros_Z());
      struct.setAlbrunidis_Z(getgxTv_SdtPedido_AlmacenTejido_Albrunidis_Z());
      return struct ;
   }

   private byte gxTv_SdtPedido_AlmacenTejido_N ;
   private short gxTv_SdtPedido_AlmacenTejido_Modified ;
   private short gxTv_SdtPedido_AlmacenTejido_Initialized ;
   private short readOk ;
   private short nOutParmCount ;
   private int gxTv_SdtPedido_AlmacenTejido_Albreccod ;
   private int gxTv_SdtPedido_AlmacenTejido_Piezas ;
   private int gxTv_SdtPedido_AlmacenTejido_Albrpiedis ;
   private int gxTv_SdtPedido_AlmacenTejido_Albreccod_Z ;
   private int gxTv_SdtPedido_AlmacenTejido_Piezas_Z ;
   private int gxTv_SdtPedido_AlmacenTejido_Albrpiedis_Z ;
   private java.math.BigDecimal gxTv_SdtPedido_AlmacenTejido_Kilos ;
   private java.math.BigDecimal gxTv_SdtPedido_AlmacenTejido_Metros ;
   private java.math.BigDecimal gxTv_SdtPedido_AlmacenTejido_Albrunidis ;
   private java.math.BigDecimal gxTv_SdtPedido_AlmacenTejido_Kilos_Z ;
   private java.math.BigDecimal gxTv_SdtPedido_AlmacenTejido_Metros_Z ;
   private java.math.BigDecimal gxTv_SdtPedido_AlmacenTejido_Albrunidis_Z ;
   private String gxTv_SdtPedido_AlmacenTejido_Albrefdsc ;
   private String gxTv_SdtPedido_AlmacenTejido_Albrreo ;
   private String gxTv_SdtPedido_AlmacenTejido_Mode ;
   private String gxTv_SdtPedido_AlmacenTejido_Albrefdsc_Z ;
   private String gxTv_SdtPedido_AlmacenTejido_Albrreo_Z ;
   private String sTagName ;
   private boolean readElement ;
   private boolean formatError ;
}

