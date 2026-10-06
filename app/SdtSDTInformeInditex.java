package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTInformeInditex extends GxUserType
{
   public SdtSDTInformeInditex( )
   {
      this(  new ModelContext(SdtSDTInformeInditex.class));
   }

   public SdtSDTInformeInditex( ModelContext context )
   {
      super( context, "SdtSDTInformeInditex");
   }

   public SdtSDTInformeInditex( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTInformeInditex");
   }

   public SdtSDTInformeInditex( StructSdtSDTInformeInditex struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Producto") )
            {
               gxTv_SdtSDTInformeInditex_Producto = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Descripcion") )
            {
               gxTv_SdtSDTInformeInditex_Descripcion = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CantC") )
            {
               gxTv_SdtSDTInformeInditex_Cantc = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CantCM") )
            {
               gxTv_SdtSDTInformeInditex_Cantcm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lote") )
            {
               gxTv_SdtSDTInformeInditex_Lote = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Fabricante") )
            {
               gxTv_SdtSDTInformeInditex_Fabricante = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Proveedor") )
            {
               gxTv_SdtSDTInformeInditex_Proveedor = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "StockInicial") )
            {
               gxTv_SdtSDTInformeInditex_Stockinicial = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "StockFinal") )
            {
               gxTv_SdtSDTInformeInditex_Stockfinal = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Categoria") )
            {
               gxTv_SdtSDTInformeInditex_Categoria = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Prdfuncion") )
            {
               gxTv_SdtSDTInformeInditex_Prdfuncion = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdNroCAS") )
            {
               gxTv_SdtSDTInformeInditex_Prdnrocas = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdEINECS") )
            {
               gxTv_SdtSDTInformeInditex_Prdeinecs = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdNmQu") )
            {
               gxTv_SdtSDTInformeInditex_Prdnmqu = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdZDHC") )
            {
               gxTv_SdtSDTInformeInditex_Prdzdhc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdFHS") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTInformeInditex_Prdfhs = GXutil.nullDate() ;
                  gxTv_SdtSDTInformeInditex_Prdfhs_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTInformeInditex_Prdfhs_N = (byte)(0) ;
                  gxTv_SdtSDTInformeInditex_Prdfhs = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "LocUtiDc") )
            {
               gxTv_SdtSDTInformeInditex_Locutidc = oReader.getValue() ;
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
         sName = "SDTInformeInditex" ;
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
      oWriter.writeElement("Producto", gxTv_SdtSDTInformeInditex_Producto);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Descripcion", gxTv_SdtSDTInformeInditex_Descripcion);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CantC", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeInditex_Cantc, 11, 3)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CantCM", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeInditex_Cantcm, 11, 3)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Lote", gxTv_SdtSDTInformeInditex_Lote);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Fabricante", gxTv_SdtSDTInformeInditex_Fabricante);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Proveedor", gxTv_SdtSDTInformeInditex_Proveedor);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("StockInicial", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeInditex_Stockinicial, 11, 3)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("StockFinal", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeInditex_Stockfinal, 11, 3)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Categoria", gxTv_SdtSDTInformeInditex_Categoria);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Prdfuncion", gxTv_SdtSDTInformeInditex_Prdfuncion);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdNroCAS", gxTv_SdtSDTInformeInditex_Prdnrocas);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdEINECS", gxTv_SdtSDTInformeInditex_Prdeinecs);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdNmQu", gxTv_SdtSDTInformeInditex_Prdnmqu);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdZDHC", gxTv_SdtSDTInformeInditex_Prdzdhc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSDTInformeInditex_Prdfhs)) && ( gxTv_SdtSDTInformeInditex_Prdfhs_N == 1 ) )
      {
         oWriter.writeElement("PrdFHS", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTInformeInditex_Prdfhs), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTInformeInditex_Prdfhs), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTInformeInditex_Prdfhs), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("PrdFHS", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("LocUtiDc", gxTv_SdtSDTInformeInditex_Locutidc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeEndElement();
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
      AddObjectProperty("Producto", gxTv_SdtSDTInformeInditex_Producto, false, false);
      AddObjectProperty("Descripcion", gxTv_SdtSDTInformeInditex_Descripcion, false, false);
      AddObjectProperty("CantC", gxTv_SdtSDTInformeInditex_Cantc, false, false);
      AddObjectProperty("CantCM", gxTv_SdtSDTInformeInditex_Cantcm, false, false);
      AddObjectProperty("Lote", gxTv_SdtSDTInformeInditex_Lote, false, false);
      AddObjectProperty("Fabricante", gxTv_SdtSDTInformeInditex_Fabricante, false, false);
      AddObjectProperty("Proveedor", gxTv_SdtSDTInformeInditex_Proveedor, false, false);
      AddObjectProperty("StockInicial", gxTv_SdtSDTInformeInditex_Stockinicial, false, false);
      AddObjectProperty("StockFinal", gxTv_SdtSDTInformeInditex_Stockfinal, false, false);
      AddObjectProperty("Categoria", gxTv_SdtSDTInformeInditex_Categoria, false, false);
      AddObjectProperty("Prdfuncion", gxTv_SdtSDTInformeInditex_Prdfuncion, false, false);
      AddObjectProperty("PrdNroCAS", gxTv_SdtSDTInformeInditex_Prdnrocas, false, false);
      AddObjectProperty("PrdEINECS", gxTv_SdtSDTInformeInditex_Prdeinecs, false, false);
      AddObjectProperty("PrdNmQu", gxTv_SdtSDTInformeInditex_Prdnmqu, false, false);
      AddObjectProperty("PrdZDHC", gxTv_SdtSDTInformeInditex_Prdzdhc, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTInformeInditex_Prdfhs), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTInformeInditex_Prdfhs), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTInformeInditex_Prdfhs), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("PrdFHS", sDateCnv, false, false);
      AddObjectProperty("LocUtiDc", gxTv_SdtSDTInformeInditex_Locutidc, false, false);
   }

   public String getgxTv_SdtSDTInformeInditex_Producto( )
   {
      return gxTv_SdtSDTInformeInditex_Producto ;
   }

   public void setgxTv_SdtSDTInformeInditex_Producto( String value )
   {
      gxTv_SdtSDTInformeInditex_N = (byte)(0) ;
      gxTv_SdtSDTInformeInditex_Producto = value ;
   }

   public String getgxTv_SdtSDTInformeInditex_Descripcion( )
   {
      return gxTv_SdtSDTInformeInditex_Descripcion ;
   }

   public void setgxTv_SdtSDTInformeInditex_Descripcion( String value )
   {
      gxTv_SdtSDTInformeInditex_N = (byte)(0) ;
      gxTv_SdtSDTInformeInditex_Descripcion = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeInditex_Cantc( )
   {
      return gxTv_SdtSDTInformeInditex_Cantc ;
   }

   public void setgxTv_SdtSDTInformeInditex_Cantc( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeInditex_N = (byte)(0) ;
      gxTv_SdtSDTInformeInditex_Cantc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeInditex_Cantcm( )
   {
      return gxTv_SdtSDTInformeInditex_Cantcm ;
   }

   public void setgxTv_SdtSDTInformeInditex_Cantcm( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeInditex_N = (byte)(0) ;
      gxTv_SdtSDTInformeInditex_Cantcm = value ;
   }

   public String getgxTv_SdtSDTInformeInditex_Lote( )
   {
      return gxTv_SdtSDTInformeInditex_Lote ;
   }

   public void setgxTv_SdtSDTInformeInditex_Lote( String value )
   {
      gxTv_SdtSDTInformeInditex_N = (byte)(0) ;
      gxTv_SdtSDTInformeInditex_Lote = value ;
   }

   public String getgxTv_SdtSDTInformeInditex_Fabricante( )
   {
      return gxTv_SdtSDTInformeInditex_Fabricante ;
   }

   public void setgxTv_SdtSDTInformeInditex_Fabricante( String value )
   {
      gxTv_SdtSDTInformeInditex_N = (byte)(0) ;
      gxTv_SdtSDTInformeInditex_Fabricante = value ;
   }

   public String getgxTv_SdtSDTInformeInditex_Proveedor( )
   {
      return gxTv_SdtSDTInformeInditex_Proveedor ;
   }

   public void setgxTv_SdtSDTInformeInditex_Proveedor( String value )
   {
      gxTv_SdtSDTInformeInditex_N = (byte)(0) ;
      gxTv_SdtSDTInformeInditex_Proveedor = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeInditex_Stockinicial( )
   {
      return gxTv_SdtSDTInformeInditex_Stockinicial ;
   }

   public void setgxTv_SdtSDTInformeInditex_Stockinicial( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeInditex_N = (byte)(0) ;
      gxTv_SdtSDTInformeInditex_Stockinicial = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeInditex_Stockfinal( )
   {
      return gxTv_SdtSDTInformeInditex_Stockfinal ;
   }

   public void setgxTv_SdtSDTInformeInditex_Stockfinal( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeInditex_N = (byte)(0) ;
      gxTv_SdtSDTInformeInditex_Stockfinal = value ;
   }

   public String getgxTv_SdtSDTInformeInditex_Categoria( )
   {
      return gxTv_SdtSDTInformeInditex_Categoria ;
   }

   public void setgxTv_SdtSDTInformeInditex_Categoria( String value )
   {
      gxTv_SdtSDTInformeInditex_N = (byte)(0) ;
      gxTv_SdtSDTInformeInditex_Categoria = value ;
   }

   public String getgxTv_SdtSDTInformeInditex_Prdfuncion( )
   {
      return gxTv_SdtSDTInformeInditex_Prdfuncion ;
   }

   public void setgxTv_SdtSDTInformeInditex_Prdfuncion( String value )
   {
      gxTv_SdtSDTInformeInditex_N = (byte)(0) ;
      gxTv_SdtSDTInformeInditex_Prdfuncion = value ;
   }

   public String getgxTv_SdtSDTInformeInditex_Prdnrocas( )
   {
      return gxTv_SdtSDTInformeInditex_Prdnrocas ;
   }

   public void setgxTv_SdtSDTInformeInditex_Prdnrocas( String value )
   {
      gxTv_SdtSDTInformeInditex_N = (byte)(0) ;
      gxTv_SdtSDTInformeInditex_Prdnrocas = value ;
   }

   public String getgxTv_SdtSDTInformeInditex_Prdeinecs( )
   {
      return gxTv_SdtSDTInformeInditex_Prdeinecs ;
   }

   public void setgxTv_SdtSDTInformeInditex_Prdeinecs( String value )
   {
      gxTv_SdtSDTInformeInditex_N = (byte)(0) ;
      gxTv_SdtSDTInformeInditex_Prdeinecs = value ;
   }

   public String getgxTv_SdtSDTInformeInditex_Prdnmqu( )
   {
      return gxTv_SdtSDTInformeInditex_Prdnmqu ;
   }

   public void setgxTv_SdtSDTInformeInditex_Prdnmqu( String value )
   {
      gxTv_SdtSDTInformeInditex_N = (byte)(0) ;
      gxTv_SdtSDTInformeInditex_Prdnmqu = value ;
   }

   public String getgxTv_SdtSDTInformeInditex_Prdzdhc( )
   {
      return gxTv_SdtSDTInformeInditex_Prdzdhc ;
   }

   public void setgxTv_SdtSDTInformeInditex_Prdzdhc( String value )
   {
      gxTv_SdtSDTInformeInditex_N = (byte)(0) ;
      gxTv_SdtSDTInformeInditex_Prdzdhc = value ;
   }

   public java.util.Date getgxTv_SdtSDTInformeInditex_Prdfhs( )
   {
      return gxTv_SdtSDTInformeInditex_Prdfhs ;
   }

   public void setgxTv_SdtSDTInformeInditex_Prdfhs( java.util.Date value )
   {
      gxTv_SdtSDTInformeInditex_Prdfhs_N = (byte)(0) ;
      gxTv_SdtSDTInformeInditex_N = (byte)(0) ;
      gxTv_SdtSDTInformeInditex_Prdfhs = value ;
   }

   public String getgxTv_SdtSDTInformeInditex_Locutidc( )
   {
      return gxTv_SdtSDTInformeInditex_Locutidc ;
   }

   public void setgxTv_SdtSDTInformeInditex_Locutidc( String value )
   {
      gxTv_SdtSDTInformeInditex_N = (byte)(0) ;
      gxTv_SdtSDTInformeInditex_Locutidc = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTInformeInditex_Producto = "" ;
      gxTv_SdtSDTInformeInditex_N = (byte)(1) ;
      gxTv_SdtSDTInformeInditex_Descripcion = "" ;
      gxTv_SdtSDTInformeInditex_Cantc = DecimalUtil.ZERO ;
      gxTv_SdtSDTInformeInditex_Cantcm = DecimalUtil.ZERO ;
      gxTv_SdtSDTInformeInditex_Lote = "" ;
      gxTv_SdtSDTInformeInditex_Fabricante = "" ;
      gxTv_SdtSDTInformeInditex_Proveedor = "" ;
      gxTv_SdtSDTInformeInditex_Stockinicial = DecimalUtil.ZERO ;
      gxTv_SdtSDTInformeInditex_Stockfinal = DecimalUtil.ZERO ;
      gxTv_SdtSDTInformeInditex_Categoria = "" ;
      gxTv_SdtSDTInformeInditex_Prdfuncion = "" ;
      gxTv_SdtSDTInformeInditex_Prdnrocas = "" ;
      gxTv_SdtSDTInformeInditex_Prdeinecs = "" ;
      gxTv_SdtSDTInformeInditex_Prdnmqu = "" ;
      gxTv_SdtSDTInformeInditex_Prdzdhc = "" ;
      gxTv_SdtSDTInformeInditex_Prdfhs = GXutil.nullDate() ;
      gxTv_SdtSDTInformeInditex_Prdfhs_N = (byte)(1) ;
      gxTv_SdtSDTInformeInditex_Locutidc = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTInformeInditex_N ;
   }

   public app.SdtSDTInformeInditex Clone( )
   {
      return (app.SdtSDTInformeInditex)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTInformeInditex struct )
   {
      setgxTv_SdtSDTInformeInditex_Producto(struct.getProducto());
      setgxTv_SdtSDTInformeInditex_Descripcion(struct.getDescripcion());
      setgxTv_SdtSDTInformeInditex_Cantc(struct.getCantc());
      setgxTv_SdtSDTInformeInditex_Cantcm(struct.getCantcm());
      setgxTv_SdtSDTInformeInditex_Lote(struct.getLote());
      setgxTv_SdtSDTInformeInditex_Fabricante(struct.getFabricante());
      setgxTv_SdtSDTInformeInditex_Proveedor(struct.getProveedor());
      setgxTv_SdtSDTInformeInditex_Stockinicial(struct.getStockinicial());
      setgxTv_SdtSDTInformeInditex_Stockfinal(struct.getStockfinal());
      setgxTv_SdtSDTInformeInditex_Categoria(struct.getCategoria());
      setgxTv_SdtSDTInformeInditex_Prdfuncion(struct.getPrdfuncion());
      setgxTv_SdtSDTInformeInditex_Prdnrocas(struct.getPrdnrocas());
      setgxTv_SdtSDTInformeInditex_Prdeinecs(struct.getPrdeinecs());
      setgxTv_SdtSDTInformeInditex_Prdnmqu(struct.getPrdnmqu());
      setgxTv_SdtSDTInformeInditex_Prdzdhc(struct.getPrdzdhc());
      if ( struct.gxTv_SdtSDTInformeInditex_Prdfhs_N == 0 )
      {
         setgxTv_SdtSDTInformeInditex_Prdfhs(struct.getPrdfhs());
      }
      setgxTv_SdtSDTInformeInditex_Locutidc(struct.getLocutidc());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTInformeInditex getStruct( )
   {
      app.StructSdtSDTInformeInditex struct = new app.StructSdtSDTInformeInditex ();
      struct.setProducto(getgxTv_SdtSDTInformeInditex_Producto());
      struct.setDescripcion(getgxTv_SdtSDTInformeInditex_Descripcion());
      struct.setCantc(getgxTv_SdtSDTInformeInditex_Cantc());
      struct.setCantcm(getgxTv_SdtSDTInformeInditex_Cantcm());
      struct.setLote(getgxTv_SdtSDTInformeInditex_Lote());
      struct.setFabricante(getgxTv_SdtSDTInformeInditex_Fabricante());
      struct.setProveedor(getgxTv_SdtSDTInformeInditex_Proveedor());
      struct.setStockinicial(getgxTv_SdtSDTInformeInditex_Stockinicial());
      struct.setStockfinal(getgxTv_SdtSDTInformeInditex_Stockfinal());
      struct.setCategoria(getgxTv_SdtSDTInformeInditex_Categoria());
      struct.setPrdfuncion(getgxTv_SdtSDTInformeInditex_Prdfuncion());
      struct.setPrdnrocas(getgxTv_SdtSDTInformeInditex_Prdnrocas());
      struct.setPrdeinecs(getgxTv_SdtSDTInformeInditex_Prdeinecs());
      struct.setPrdnmqu(getgxTv_SdtSDTInformeInditex_Prdnmqu());
      struct.setPrdzdhc(getgxTv_SdtSDTInformeInditex_Prdzdhc());
      if ( gxTv_SdtSDTInformeInditex_Prdfhs_N == 0 )
      {
         struct.setPrdfhs(getgxTv_SdtSDTInformeInditex_Prdfhs());
      }
      struct.setLocutidc(getgxTv_SdtSDTInformeInditex_Locutidc());
      return struct ;
   }

   protected byte gxTv_SdtSDTInformeInditex_N ;
   protected byte gxTv_SdtSDTInformeInditex_Prdfhs_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeInditex_Cantc ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeInditex_Cantcm ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeInditex_Stockinicial ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeInditex_Stockfinal ;
   protected String gxTv_SdtSDTInformeInditex_Producto ;
   protected String gxTv_SdtSDTInformeInditex_Descripcion ;
   protected String gxTv_SdtSDTInformeInditex_Lote ;
   protected String gxTv_SdtSDTInformeInditex_Fabricante ;
   protected String gxTv_SdtSDTInformeInditex_Proveedor ;
   protected String gxTv_SdtSDTInformeInditex_Categoria ;
   protected String gxTv_SdtSDTInformeInditex_Prdfuncion ;
   protected String gxTv_SdtSDTInformeInditex_Prdnrocas ;
   protected String gxTv_SdtSDTInformeInditex_Prdeinecs ;
   protected String gxTv_SdtSDTInformeInditex_Prdzdhc ;
   protected String gxTv_SdtSDTInformeInditex_Locutidc ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDTInformeInditex_Prdfhs ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSDTInformeInditex_Prdnmqu ;
}

