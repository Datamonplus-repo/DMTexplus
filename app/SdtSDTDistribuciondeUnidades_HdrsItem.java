package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTDistribuciondeUnidades_HdrsItem extends GxUserType
{
   public SdtSDTDistribuciondeUnidades_HdrsItem( )
   {
      this(  new ModelContext(SdtSDTDistribuciondeUnidades_HdrsItem.class));
   }

   public SdtSDTDistribuciondeUnidades_HdrsItem( ModelContext context )
   {
      super( context, "SdtSDTDistribuciondeUnidades_HdrsItem");
   }

   public SdtSDTDistribuciondeUnidades_HdrsItem( int remoteHandle ,
                                                 ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTDistribuciondeUnidades_HdrsItem");
   }

   public SdtSDTDistribuciondeUnidades_HdrsItem( StructSdtSDTDistribuciondeUnidades_HdrsItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Hdr") )
            {
               gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Hdr = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FechaHdr") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Fechahdr = GXutil.nullDate() ;
                  gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Fechahdr_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Fechahdr_N = (byte)(0) ;
                  gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Fechahdr = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Articulo") )
            {
               gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Articulo = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Descripcion") )
            {
               gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Descripcion = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Color") )
            {
               gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Color = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Numero") )
            {
               gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Numero = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ColorCliente") )
            {
               gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Colorcliente = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "NumeroCliente") )
            {
               gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Numerocliente = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "KilosHdr") )
            {
               gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Kiloshdr = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MetrosHdr") )
            {
               gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Metroshdr = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Albaranes") )
            {
               if ( gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Albaranes == null )
               {
                  gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Albaranes = new GXBaseCollection<app.SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem>(app.SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem.class, "SDTDistribuciondeUnidades.HdrsItem.AlbaranesItem", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Albaranes.readxmlcollection(oReader, "Albaranes", "AlbaranesItem") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Albaranes") )
               {
                  GXSoapError = oReader.read() ;
               }
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
         sName = "SDTDistribuciondeUnidades.HdrsItem" ;
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
      oWriter.writeElement("Hdr", gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Hdr);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Fechahdr)) && ( gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Fechahdr_N == 1 ) )
      {
         oWriter.writeElement("FechaHdr", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Fechahdr), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Fechahdr), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Fechahdr), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("FechaHdr", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("Articulo", gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Articulo);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Descripcion", gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Descripcion);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Color", gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Color);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Numero", GXutil.trim( GXutil.str( gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Numero, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ColorCliente", gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Colorcliente);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("NumeroCliente", GXutil.trim( GXutil.str( gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Numerocliente, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("KilosHdr", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Kiloshdr, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MetrosHdr", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Metroshdr, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Albaranes != null )
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
         gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Albaranes.writexmlcollection(oWriter, "Albaranes", sNameSpace1, "AlbaranesItem", sNameSpace1);
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
      AddObjectProperty("Hdr", gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Hdr, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Fechahdr), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Fechahdr), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Fechahdr), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("FechaHdr", sDateCnv, false, false);
      AddObjectProperty("Articulo", gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Articulo, false, false);
      AddObjectProperty("Descripcion", gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Descripcion, false, false);
      AddObjectProperty("Color", gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Color, false, false);
      AddObjectProperty("Numero", gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Numero, false, false);
      AddObjectProperty("ColorCliente", gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Colorcliente, false, false);
      AddObjectProperty("NumeroCliente", gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Numerocliente, false, false);
      AddObjectProperty("KilosHdr", gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Kiloshdr, false, false);
      AddObjectProperty("MetrosHdr", gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Metroshdr, false, false);
      if ( gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Albaranes != null )
      {
         AddObjectProperty("Albaranes", gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Albaranes, false, false);
      }
   }

   public String getgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Hdr( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Hdr ;
   }

   public void setgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Hdr( String value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Hdr = value ;
   }

   public java.util.Date getgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Fechahdr( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Fechahdr ;
   }

   public void setgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Fechahdr( java.util.Date value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Fechahdr_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Fechahdr = value ;
   }

   public String getgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Articulo( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Articulo ;
   }

   public void setgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Articulo( String value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Articulo = value ;
   }

   public String getgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Descripcion( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Descripcion ;
   }

   public void setgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Descripcion( String value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Descripcion = value ;
   }

   public String getgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Color( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Color ;
   }

   public void setgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Color( String value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Color = value ;
   }

   public int getgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Numero( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Numero ;
   }

   public void setgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Numero( int value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Numero = value ;
   }

   public String getgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Colorcliente( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Colorcliente ;
   }

   public void setgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Colorcliente( String value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Colorcliente = value ;
   }

   public int getgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Numerocliente( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Numerocliente ;
   }

   public void setgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Numerocliente( int value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Numerocliente = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Kiloshdr( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Kiloshdr ;
   }

   public void setgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Kiloshdr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Kiloshdr = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Metroshdr( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Metroshdr ;
   }

   public void setgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Metroshdr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Metroshdr = value ;
   }

   public GXBaseCollection<app.SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem> getgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Albaranes( )
   {
      if ( gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Albaranes == null )
      {
         gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Albaranes = new GXBaseCollection<app.SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem>(app.SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem.class, "SDTDistribuciondeUnidades.HdrsItem.AlbaranesItem", "TexplusNET", remoteHandle);
      }
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Albaranes_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_N = (byte)(0) ;
      return gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Albaranes ;
   }

   public void setgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Albaranes( GXBaseCollection<app.SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem> value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Albaranes_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Albaranes = value ;
   }

   public void setgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Albaranes_SetNull( )
   {
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Albaranes_N = (byte)(1) ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Albaranes = null ;
   }

   public boolean getgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Albaranes_IsNull( )
   {
      if ( gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Albaranes == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Albaranes_N( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Albaranes_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Hdr = "" ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_N = (byte)(1) ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Fechahdr = GXutil.nullDate() ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Fechahdr_N = (byte)(1) ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Articulo = "" ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Descripcion = "" ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Color = "" ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Colorcliente = "" ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Kiloshdr = DecimalUtil.ZERO ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Metroshdr = DecimalUtil.ZERO ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Albaranes_N = (byte)(1) ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_N ;
   }

   public app.SdtSDTDistribuciondeUnidades_HdrsItem Clone( )
   {
      return (app.SdtSDTDistribuciondeUnidades_HdrsItem)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTDistribuciondeUnidades_HdrsItem struct )
   {
      setgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Hdr(struct.getHdr());
      if ( struct.gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Fechahdr_N == 0 )
      {
         setgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Fechahdr(struct.getFechahdr());
      }
      setgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Articulo(struct.getArticulo());
      setgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Descripcion(struct.getDescripcion());
      setgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Color(struct.getColor());
      setgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Numero(struct.getNumero());
      setgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Colorcliente(struct.getColorcliente());
      setgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Numerocliente(struct.getNumerocliente());
      setgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Kiloshdr(struct.getKiloshdr());
      setgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Metroshdr(struct.getMetroshdr());
      GXBaseCollection<app.SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem> gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Albaranes_aux = new GXBaseCollection<app.SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem>(app.SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem.class, "SDTDistribuciondeUnidades.HdrsItem.AlbaranesItem", "TexplusNET", remoteHandle);
      Vector<app.StructSdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem> gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Albaranes_aux1 = struct.getAlbaranes();
      if (gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Albaranes_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Albaranes_aux1.size(); i++)
         {
            gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Albaranes_aux.add(new app.SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem(gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Albaranes_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Albaranes(gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Albaranes_aux);
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTDistribuciondeUnidades_HdrsItem getStruct( )
   {
      app.StructSdtSDTDistribuciondeUnidades_HdrsItem struct = new app.StructSdtSDTDistribuciondeUnidades_HdrsItem ();
      struct.setHdr(getgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Hdr());
      if ( gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Fechahdr_N == 0 )
      {
         struct.setFechahdr(getgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Fechahdr());
      }
      struct.setArticulo(getgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Articulo());
      struct.setDescripcion(getgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Descripcion());
      struct.setColor(getgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Color());
      struct.setNumero(getgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Numero());
      struct.setColorcliente(getgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Colorcliente());
      struct.setNumerocliente(getgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Numerocliente());
      struct.setKiloshdr(getgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Kiloshdr());
      struct.setMetroshdr(getgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Metroshdr());
      struct.setAlbaranes(getgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Albaranes().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_N ;
   protected byte gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Fechahdr_N ;
   protected byte gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Albaranes_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Numero ;
   protected int gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Numerocliente ;
   protected java.math.BigDecimal gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Kiloshdr ;
   protected java.math.BigDecimal gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Metroshdr ;
   protected String gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Hdr ;
   protected String gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Articulo ;
   protected String gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Descripcion ;
   protected String gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Color ;
   protected String gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Colorcliente ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Fechahdr ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<app.SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem> gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Albaranes_aux ;
   protected GXBaseCollection<app.SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem> gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_Albaranes=null ;
}

