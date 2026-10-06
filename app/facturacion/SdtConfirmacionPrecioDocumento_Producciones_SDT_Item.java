package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtConfirmacionPrecioDocumento_Producciones_SDT_Item extends GxUserType
{
   public SdtConfirmacionPrecioDocumento_Producciones_SDT_Item( )
   {
      this(  new ModelContext(SdtConfirmacionPrecioDocumento_Producciones_SDT_Item.class));
   }

   public SdtConfirmacionPrecioDocumento_Producciones_SDT_Item( ModelContext context )
   {
      super( context, "SdtConfirmacionPrecioDocumento_Producciones_SDT_Item");
   }

   public SdtConfirmacionPrecioDocumento_Producciones_SDT_Item( int remoteHandle ,
                                                                ModelContext context )
   {
      super( remoteHandle, context, "SdtConfirmacionPrecioDocumento_Producciones_SDT_Item");
   }

   public SdtConfirmacionPrecioDocumento_Producciones_SDT_Item( StructSdtConfirmacionPrecioDocumento_Producciones_SDT_Item struct )
   {
      this();
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Seleccion") )
            {
               gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Seleccion = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tabla") )
            {
               gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Tabla = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbEncCli") )
            {
               gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albenccli = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcod") )
            {
               gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcodreo") )
            {
               gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcodreo = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcodpar") )
            {
               gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcodpar = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barser") )
            {
               gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barser = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barserdsc") )
            {
               gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barserdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcolnom") )
            {
               gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcolnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcolnum") )
            {
               gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcolnum = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarTipcol") )
            {
               gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Bartipcol = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Baralbmtre") )
            {
               gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Baralbmtre = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarPreMtr") )
            {
               gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barpremtr = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarAlbKgmE") )
            {
               gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Baralbkgme = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarPreKgm") )
            {
               gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barprekgm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbProEsp") )
            {
               gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albproesp = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbImpMan") )
            {
               gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albimpman = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbProRec") )
            {
               gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albprorec = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "GuiFasLin") )
            {
               gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Guifaslin = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Fascod") )
            {
               gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Fascod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FasDsc") )
            {
               gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Fasdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbBarRec") )
            {
               gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albbarrec = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "ConfirmacionPrecioDocumento_Producciones_SDT.Item" ;
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
      oWriter.writeElement("Seleccion", GXutil.booltostr( gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Seleccion));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Tabla", gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Tabla);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbEncCli", gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albenccli);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcod", GXutil.trim( GXutil.str( gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcodreo", GXutil.trim( GXutil.str( gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcodreo, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcodpar", gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcodpar);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barser", gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barser);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barserdsc", gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barserdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcolnom", gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcolnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcolnum", GXutil.trim( GXutil.str( gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcolnum, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarTipcol", GXutil.trim( GXutil.str( gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Bartipcol, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Baralbmtre", GXutil.trim( GXutil.strNoRound( gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Baralbmtre, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarPreMtr", GXutil.trim( GXutil.strNoRound( gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barpremtr, 13, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarAlbKgmE", GXutil.trim( GXutil.strNoRound( gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Baralbkgme, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarPreKgm", GXutil.trim( GXutil.strNoRound( gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barprekgm, 13, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbProEsp", GXutil.trim( GXutil.str( gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albproesp, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbImpMan", GXutil.trim( GXutil.strNoRound( gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albimpman, 11, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbProRec", GXutil.trim( GXutil.strNoRound( gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albprorec, 13, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("GuiFasLin", GXutil.trim( GXutil.str( gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Guifaslin, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Fascod", gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Fascod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FasDsc", gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Fasdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbBarRec", GXutil.trim( GXutil.strNoRound( gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albbarrec, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
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
      AddObjectProperty("Seleccion", gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Seleccion, false, false);
      AddObjectProperty("Tabla", gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Tabla, false, false);
      AddObjectProperty("AlbEncCli", gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albenccli, false, false);
      AddObjectProperty("Barcod", gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcod, false, false);
      AddObjectProperty("Barcodreo", gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcodreo, false, false);
      AddObjectProperty("Barcodpar", gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcodpar, false, false);
      AddObjectProperty("Barser", gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barser, false, false);
      AddObjectProperty("Barserdsc", gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barserdsc, false, false);
      AddObjectProperty("Barcolnom", gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcolnom, false, false);
      AddObjectProperty("Barcolnum", gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcolnum, false, false);
      AddObjectProperty("BarTipcol", gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Bartipcol, false, false);
      AddObjectProperty("Baralbmtre", gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Baralbmtre, false, false);
      AddObjectProperty("BarPreMtr", gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barpremtr, false, false);
      AddObjectProperty("BarAlbKgmE", gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Baralbkgme, false, false);
      AddObjectProperty("BarPreKgm", gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barprekgm, false, false);
      AddObjectProperty("AlbProEsp", gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albproesp, false, false);
      AddObjectProperty("AlbImpMan", gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albimpman, false, false);
      AddObjectProperty("AlbProRec", gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albprorec, false, false);
      AddObjectProperty("GuiFasLin", gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Guifaslin, false, false);
      AddObjectProperty("Fascod", gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Fascod, false, false);
      AddObjectProperty("FasDsc", gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Fasdsc, false, false);
      AddObjectProperty("AlbBarRec", gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albbarrec, false, false);
   }

   public boolean getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Seleccion( )
   {
      return gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Seleccion ;
   }

   public void setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Seleccion( boolean value )
   {
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Seleccion = value ;
   }

   public String getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Tabla( )
   {
      return gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Tabla ;
   }

   public void setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Tabla( String value )
   {
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Tabla = value ;
   }

   public String getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albenccli( )
   {
      return gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albenccli ;
   }

   public void setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albenccli( String value )
   {
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albenccli = value ;
   }

   public int getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcod( )
   {
      return gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcod ;
   }

   public void setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcod( int value )
   {
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcod = value ;
   }

   public byte getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcodreo( )
   {
      return gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcodreo ;
   }

   public void setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcodreo( byte value )
   {
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcodreo = value ;
   }

   public String getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcodpar( )
   {
      return gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcodpar ;
   }

   public void setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcodpar( String value )
   {
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcodpar = value ;
   }

   public String getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barser( )
   {
      return gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barser ;
   }

   public void setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barser( String value )
   {
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barser = value ;
   }

   public String getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barserdsc( )
   {
      return gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barserdsc ;
   }

   public void setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barserdsc( String value )
   {
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barserdsc = value ;
   }

   public String getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcolnom( )
   {
      return gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcolnom ;
   }

   public void setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcolnom( String value )
   {
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcolnom = value ;
   }

   public int getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcolnum( )
   {
      return gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcolnum ;
   }

   public void setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcolnum( int value )
   {
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcolnum = value ;
   }

   public byte getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Bartipcol( )
   {
      return gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Bartipcol ;
   }

   public void setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Bartipcol( byte value )
   {
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Bartipcol = value ;
   }

   public java.math.BigDecimal getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Baralbmtre( )
   {
      return gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Baralbmtre ;
   }

   public void setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Baralbmtre( java.math.BigDecimal value )
   {
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Baralbmtre = value ;
   }

   public java.math.BigDecimal getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barpremtr( )
   {
      return gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barpremtr ;
   }

   public void setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barpremtr( java.math.BigDecimal value )
   {
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barpremtr = value ;
   }

   public java.math.BigDecimal getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Baralbkgme( )
   {
      return gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Baralbkgme ;
   }

   public void setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Baralbkgme( java.math.BigDecimal value )
   {
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Baralbkgme = value ;
   }

   public java.math.BigDecimal getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barprekgm( )
   {
      return gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barprekgm ;
   }

   public void setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barprekgm( java.math.BigDecimal value )
   {
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barprekgm = value ;
   }

   public byte getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albproesp( )
   {
      return gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albproesp ;
   }

   public void setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albproesp( byte value )
   {
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albproesp = value ;
   }

   public java.math.BigDecimal getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albimpman( )
   {
      return gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albimpman ;
   }

   public void setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albimpman( java.math.BigDecimal value )
   {
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albimpman = value ;
   }

   public java.math.BigDecimal getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albprorec( )
   {
      return gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albprorec ;
   }

   public void setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albprorec( java.math.BigDecimal value )
   {
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albprorec = value ;
   }

   public short getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Guifaslin( )
   {
      return gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Guifaslin ;
   }

   public void setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Guifaslin( short value )
   {
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Guifaslin = value ;
   }

   public String getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Fascod( )
   {
      return gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Fascod ;
   }

   public void setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Fascod( String value )
   {
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Fascod = value ;
   }

   public String getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Fasdsc( )
   {
      return gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Fasdsc ;
   }

   public void setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Fasdsc( String value )
   {
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Fasdsc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albbarrec( )
   {
      return gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albbarrec ;
   }

   public void setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albbarrec( java.math.BigDecimal value )
   {
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albbarrec = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_N = (byte)(1) ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Tabla = "" ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albenccli = "" ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcodpar = "" ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barser = "" ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barserdsc = "" ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcolnom = "" ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Baralbmtre = DecimalUtil.ZERO ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barpremtr = DecimalUtil.ZERO ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Baralbkgme = DecimalUtil.ZERO ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barprekgm = DecimalUtil.ZERO ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albimpman = DecimalUtil.ZERO ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albprorec = DecimalUtil.ZERO ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Fascod = "" ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Fasdsc = "" ;
      gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albbarrec = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_N ;
   }

   public app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item Clone( )
   {
      return (app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)(clone()) ;
   }

   public void setStruct( app.facturacion.StructSdtConfirmacionPrecioDocumento_Producciones_SDT_Item struct )
   {
      setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Seleccion(struct.getSeleccion());
      setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Tabla(struct.getTabla());
      setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albenccli(struct.getAlbenccli());
      setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcod(struct.getBarcod());
      setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcodreo(struct.getBarcodreo());
      setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcodpar(struct.getBarcodpar());
      setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barser(struct.getBarser());
      setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barserdsc(struct.getBarserdsc());
      setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcolnom(struct.getBarcolnom());
      setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcolnum(struct.getBarcolnum());
      setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Bartipcol(struct.getBartipcol());
      setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Baralbmtre(struct.getBaralbmtre());
      setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barpremtr(struct.getBarpremtr());
      setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Baralbkgme(struct.getBaralbkgme());
      setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barprekgm(struct.getBarprekgm());
      setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albproesp(struct.getAlbproesp());
      setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albimpman(struct.getAlbimpman());
      setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albprorec(struct.getAlbprorec());
      setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Guifaslin(struct.getGuifaslin());
      setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Fascod(struct.getFascod());
      setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Fasdsc(struct.getFasdsc());
      setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albbarrec(struct.getAlbbarrec());
   }

   @SuppressWarnings("unchecked")
   public app.facturacion.StructSdtConfirmacionPrecioDocumento_Producciones_SDT_Item getStruct( )
   {
      app.facturacion.StructSdtConfirmacionPrecioDocumento_Producciones_SDT_Item struct = new app.facturacion.StructSdtConfirmacionPrecioDocumento_Producciones_SDT_Item ();
      struct.setSeleccion(getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Seleccion());
      struct.setTabla(getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Tabla());
      struct.setAlbenccli(getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albenccli());
      struct.setBarcod(getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcod());
      struct.setBarcodreo(getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcodreo());
      struct.setBarcodpar(getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcodpar());
      struct.setBarser(getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barser());
      struct.setBarserdsc(getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barserdsc());
      struct.setBarcolnom(getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcolnom());
      struct.setBarcolnum(getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcolnum());
      struct.setBartipcol(getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Bartipcol());
      struct.setBaralbmtre(getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Baralbmtre());
      struct.setBarpremtr(getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barpremtr());
      struct.setBaralbkgme(getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Baralbkgme());
      struct.setBarprekgm(getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barprekgm());
      struct.setAlbproesp(getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albproesp());
      struct.setAlbimpman(getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albimpman());
      struct.setAlbprorec(getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albprorec());
      struct.setGuifaslin(getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Guifaslin());
      struct.setFascod(getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Fascod());
      struct.setFasdsc(getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Fasdsc());
      struct.setAlbbarrec(getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albbarrec());
      return struct ;
   }

   protected byte gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_N ;
   protected byte gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcodreo ;
   protected byte gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Bartipcol ;
   protected byte gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albproesp ;
   protected short gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Guifaslin ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcod ;
   protected int gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcolnum ;
   protected java.math.BigDecimal gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Baralbmtre ;
   protected java.math.BigDecimal gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barpremtr ;
   protected java.math.BigDecimal gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Baralbkgme ;
   protected java.math.BigDecimal gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barprekgm ;
   protected java.math.BigDecimal gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albimpman ;
   protected java.math.BigDecimal gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albprorec ;
   protected java.math.BigDecimal gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albbarrec ;
   protected String gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Tabla ;
   protected String gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albenccli ;
   protected String gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcodpar ;
   protected String gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barser ;
   protected String gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barserdsc ;
   protected String gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcolnom ;
   protected String gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Fascod ;
   protected String gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Fasdsc ;
   protected String sTagName ;
   protected boolean gxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Seleccion ;
   protected boolean readElement ;
   protected boolean formatError ;
}

