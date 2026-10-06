package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSdtArticuloPedido extends GxUserType
{
   public SdtSdtArticuloPedido( )
   {
      this(  new ModelContext(SdtSdtArticuloPedido.class));
   }

   public SdtSdtArticuloPedido( ModelContext context )
   {
      super( context, "SdtSdtArticuloPedido");
   }

   public SdtSdtArticuloPedido( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle, context, "SdtSdtArticuloPedido");
   }

   public SdtSdtArticuloPedido( StructSdtSdtArticuloPedido struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtCod") )
            {
               gxTv_SdtSdtArticuloPedido_Disartcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtDsc") )
            {
               gxTv_SdtSdtArticuloPedido_Artdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ProCod") )
            {
               gxTv_SdtSdtArticuloPedido_Procod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ProDsc") )
            {
               gxTv_SdtSdtArticuloPedido_Prodsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisNumPie") )
            {
               gxTv_SdtSdtArticuloPedido_Disnumpie = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Kilos") )
            {
               gxTv_SdtSdtArticuloPedido_Kilos = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Metros") )
            {
               gxTv_SdtSdtArticuloPedido_Metros = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtAnh") )
            {
               gxTv_SdtSdtArticuloPedido_Disartanh = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisGraAca") )
            {
               gxTv_SdtSdtArticuloPedido_Disgraaca = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UltFasLin") )
            {
               gxTv_SdtSdtArticuloPedido_Ultfaslin = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisFasApr") )
            {
               gxTv_SdtSdtArticuloPedido_Disfasapr = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ProSts") )
            {
               gxTv_SdtSdtArticuloPedido_Prosts = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ProStsFec") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSdtArticuloPedido_Prostsfec = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtSdtArticuloPedido_Prostsfec_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSdtArticuloPedido_Prostsfec_N = (byte)(0) ;
                  gxTv_SdtSdtArticuloPedido_Prostsfec = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisCod") )
            {
               gxTv_SdtSdtArticuloPedido_Discod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Fases") )
            {
               if ( gxTv_SdtSdtArticuloPedido_Fases == null )
               {
                  gxTv_SdtSdtArticuloPedido_Fases = new GXBaseCollection<app.SdtSdtFasePedido>(app.SdtSdtFasePedido.class, "SdtFasePedido", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSdtArticuloPedido_Fases.readxmlcollection(oReader, "Fases", "Item") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Fases") )
               {
                  GXSoapError = oReader.read() ;
               }
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ConsultaAlmacen") )
            {
               if ( gxTv_SdtSdtArticuloPedido_Consultaalmacen == null )
               {
                  gxTv_SdtSdtArticuloPedido_Consultaalmacen = new GXBaseCollection<app.SdtSdtRecepcionPedido>(app.SdtSdtRecepcionPedido.class, "SdtRecepcionPedido", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSdtArticuloPedido_Consultaalmacen.readxmlcollection(oReader, "ConsultaAlmacen", "Item") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "ConsultaAlmacen") )
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
         sName = "SdtArticuloPedido" ;
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
      oWriter.writeElement("DisArtCod", gxTv_SdtSdtArticuloPedido_Disartcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtDsc", gxTv_SdtSdtArticuloPedido_Artdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ProCod", gxTv_SdtSdtArticuloPedido_Procod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ProDsc", gxTv_SdtSdtArticuloPedido_Prodsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisNumPie", GXutil.trim( GXutil.str( gxTv_SdtSdtArticuloPedido_Disnumpie, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Kilos", GXutil.trim( GXutil.strNoRound( gxTv_SdtSdtArticuloPedido_Kilos, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Metros", GXutil.trim( GXutil.strNoRound( gxTv_SdtSdtArticuloPedido_Metros, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtAnh", GXutil.trim( GXutil.str( gxTv_SdtSdtArticuloPedido_Disartanh, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisGraAca", GXutil.trim( GXutil.str( gxTv_SdtSdtArticuloPedido_Disgraaca, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("UltFasLin", GXutil.trim( GXutil.str( gxTv_SdtSdtArticuloPedido_Ultfaslin, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisFasApr", gxTv_SdtSdtArticuloPedido_Disfasapr);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ProSts", GXutil.trim( GXutil.str( gxTv_SdtSdtArticuloPedido_Prosts, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtSdtArticuloPedido_Prostsfec) && ( gxTv_SdtSdtArticuloPedido_Prostsfec_N == 1 ) )
      {
         oWriter.writeElement("ProStsFec", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSdtArticuloPedido_Prostsfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSdtArticuloPedido_Prostsfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSdtArticuloPedido_Prostsfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtSdtArticuloPedido_Prostsfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtSdtArticuloPedido_Prostsfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtSdtArticuloPedido_Prostsfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("ProStsFec", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("DisCod", GXutil.trim( GXutil.str( gxTv_SdtSdtArticuloPedido_Discod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtSdtArticuloPedido_Fases != null )
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
         gxTv_SdtSdtArticuloPedido_Fases.writexmlcollection(oWriter, "Fases", sNameSpace1, "Item", sNameSpace1);
      }
      if ( gxTv_SdtSdtArticuloPedido_Consultaalmacen != null )
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
         gxTv_SdtSdtArticuloPedido_Consultaalmacen.writexmlcollection(oWriter, "ConsultaAlmacen", sNameSpace1, "Item", sNameSpace1);
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
      AddObjectProperty("DisArtCod", gxTv_SdtSdtArticuloPedido_Disartcod, false, false);
      AddObjectProperty("ArtDsc", gxTv_SdtSdtArticuloPedido_Artdsc, false, false);
      AddObjectProperty("ProCod", gxTv_SdtSdtArticuloPedido_Procod, false, false);
      AddObjectProperty("ProDsc", gxTv_SdtSdtArticuloPedido_Prodsc, false, false);
      AddObjectProperty("DisNumPie", gxTv_SdtSdtArticuloPedido_Disnumpie, false, false);
      AddObjectProperty("Kilos", gxTv_SdtSdtArticuloPedido_Kilos, false, false);
      AddObjectProperty("Metros", gxTv_SdtSdtArticuloPedido_Metros, false, false);
      AddObjectProperty("DisArtAnh", gxTv_SdtSdtArticuloPedido_Disartanh, false, false);
      AddObjectProperty("DisGraAca", gxTv_SdtSdtArticuloPedido_Disgraaca, false, false);
      AddObjectProperty("UltFasLin", gxTv_SdtSdtArticuloPedido_Ultfaslin, false, false);
      AddObjectProperty("DisFasApr", gxTv_SdtSdtArticuloPedido_Disfasapr, false, false);
      AddObjectProperty("ProSts", gxTv_SdtSdtArticuloPedido_Prosts, false, false);
      datetime_STZ = gxTv_SdtSdtArticuloPedido_Prostsfec ;
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("ProStsFec", sDateCnv, false, false);
      AddObjectProperty("DisCod", gxTv_SdtSdtArticuloPedido_Discod, false, false);
      if ( gxTv_SdtSdtArticuloPedido_Fases != null )
      {
         AddObjectProperty("Fases", gxTv_SdtSdtArticuloPedido_Fases, false, false);
      }
      if ( gxTv_SdtSdtArticuloPedido_Consultaalmacen != null )
      {
         AddObjectProperty("ConsultaAlmacen", gxTv_SdtSdtArticuloPedido_Consultaalmacen, false, false);
      }
   }

   public String getgxTv_SdtSdtArticuloPedido_Disartcod( )
   {
      return gxTv_SdtSdtArticuloPedido_Disartcod ;
   }

   public void setgxTv_SdtSdtArticuloPedido_Disartcod( String value )
   {
      gxTv_SdtSdtArticuloPedido_N = (byte)(0) ;
      gxTv_SdtSdtArticuloPedido_Disartcod = value ;
   }

   public String getgxTv_SdtSdtArticuloPedido_Artdsc( )
   {
      return gxTv_SdtSdtArticuloPedido_Artdsc ;
   }

   public void setgxTv_SdtSdtArticuloPedido_Artdsc( String value )
   {
      gxTv_SdtSdtArticuloPedido_N = (byte)(0) ;
      gxTv_SdtSdtArticuloPedido_Artdsc = value ;
   }

   public String getgxTv_SdtSdtArticuloPedido_Procod( )
   {
      return gxTv_SdtSdtArticuloPedido_Procod ;
   }

   public void setgxTv_SdtSdtArticuloPedido_Procod( String value )
   {
      gxTv_SdtSdtArticuloPedido_N = (byte)(0) ;
      gxTv_SdtSdtArticuloPedido_Procod = value ;
   }

   public String getgxTv_SdtSdtArticuloPedido_Prodsc( )
   {
      return gxTv_SdtSdtArticuloPedido_Prodsc ;
   }

   public void setgxTv_SdtSdtArticuloPedido_Prodsc( String value )
   {
      gxTv_SdtSdtArticuloPedido_N = (byte)(0) ;
      gxTv_SdtSdtArticuloPedido_Prodsc = value ;
   }

   public short getgxTv_SdtSdtArticuloPedido_Disnumpie( )
   {
      return gxTv_SdtSdtArticuloPedido_Disnumpie ;
   }

   public void setgxTv_SdtSdtArticuloPedido_Disnumpie( short value )
   {
      gxTv_SdtSdtArticuloPedido_N = (byte)(0) ;
      gxTv_SdtSdtArticuloPedido_Disnumpie = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSdtArticuloPedido_Kilos( )
   {
      return gxTv_SdtSdtArticuloPedido_Kilos ;
   }

   public void setgxTv_SdtSdtArticuloPedido_Kilos( java.math.BigDecimal value )
   {
      gxTv_SdtSdtArticuloPedido_N = (byte)(0) ;
      gxTv_SdtSdtArticuloPedido_Kilos = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSdtArticuloPedido_Metros( )
   {
      return gxTv_SdtSdtArticuloPedido_Metros ;
   }

   public void setgxTv_SdtSdtArticuloPedido_Metros( java.math.BigDecimal value )
   {
      gxTv_SdtSdtArticuloPedido_N = (byte)(0) ;
      gxTv_SdtSdtArticuloPedido_Metros = value ;
   }

   public short getgxTv_SdtSdtArticuloPedido_Disartanh( )
   {
      return gxTv_SdtSdtArticuloPedido_Disartanh ;
   }

   public void setgxTv_SdtSdtArticuloPedido_Disartanh( short value )
   {
      gxTv_SdtSdtArticuloPedido_N = (byte)(0) ;
      gxTv_SdtSdtArticuloPedido_Disartanh = value ;
   }

   public short getgxTv_SdtSdtArticuloPedido_Disgraaca( )
   {
      return gxTv_SdtSdtArticuloPedido_Disgraaca ;
   }

   public void setgxTv_SdtSdtArticuloPedido_Disgraaca( short value )
   {
      gxTv_SdtSdtArticuloPedido_N = (byte)(0) ;
      gxTv_SdtSdtArticuloPedido_Disgraaca = value ;
   }

   public short getgxTv_SdtSdtArticuloPedido_Ultfaslin( )
   {
      return gxTv_SdtSdtArticuloPedido_Ultfaslin ;
   }

   public void setgxTv_SdtSdtArticuloPedido_Ultfaslin( short value )
   {
      gxTv_SdtSdtArticuloPedido_N = (byte)(0) ;
      gxTv_SdtSdtArticuloPedido_Ultfaslin = value ;
   }

   public String getgxTv_SdtSdtArticuloPedido_Disfasapr( )
   {
      return gxTv_SdtSdtArticuloPedido_Disfasapr ;
   }

   public void setgxTv_SdtSdtArticuloPedido_Disfasapr( String value )
   {
      gxTv_SdtSdtArticuloPedido_N = (byte)(0) ;
      gxTv_SdtSdtArticuloPedido_Disfasapr = value ;
   }

   public byte getgxTv_SdtSdtArticuloPedido_Prosts( )
   {
      return gxTv_SdtSdtArticuloPedido_Prosts ;
   }

   public void setgxTv_SdtSdtArticuloPedido_Prosts( byte value )
   {
      gxTv_SdtSdtArticuloPedido_N = (byte)(0) ;
      gxTv_SdtSdtArticuloPedido_Prosts = value ;
   }

   public java.util.Date getgxTv_SdtSdtArticuloPedido_Prostsfec( )
   {
      return gxTv_SdtSdtArticuloPedido_Prostsfec ;
   }

   public void setgxTv_SdtSdtArticuloPedido_Prostsfec( java.util.Date value )
   {
      gxTv_SdtSdtArticuloPedido_Prostsfec_N = (byte)(0) ;
      gxTv_SdtSdtArticuloPedido_N = (byte)(0) ;
      gxTv_SdtSdtArticuloPedido_Prostsfec = value ;
   }

   public int getgxTv_SdtSdtArticuloPedido_Discod( )
   {
      return gxTv_SdtSdtArticuloPedido_Discod ;
   }

   public void setgxTv_SdtSdtArticuloPedido_Discod( int value )
   {
      gxTv_SdtSdtArticuloPedido_N = (byte)(0) ;
      gxTv_SdtSdtArticuloPedido_Discod = value ;
   }

   public GXBaseCollection<app.SdtSdtFasePedido> getgxTv_SdtSdtArticuloPedido_Fases( )
   {
      if ( gxTv_SdtSdtArticuloPedido_Fases == null )
      {
         gxTv_SdtSdtArticuloPedido_Fases = new GXBaseCollection<app.SdtSdtFasePedido>(app.SdtSdtFasePedido.class, "SdtFasePedido", "TexplusNET", remoteHandle);
      }
      gxTv_SdtSdtArticuloPedido_Fases_N = (byte)(0) ;
      gxTv_SdtSdtArticuloPedido_N = (byte)(0) ;
      return gxTv_SdtSdtArticuloPedido_Fases ;
   }

   public void setgxTv_SdtSdtArticuloPedido_Fases( GXBaseCollection<app.SdtSdtFasePedido> value )
   {
      gxTv_SdtSdtArticuloPedido_Fases_N = (byte)(0) ;
      gxTv_SdtSdtArticuloPedido_N = (byte)(0) ;
      gxTv_SdtSdtArticuloPedido_Fases = value ;
   }

   public void setgxTv_SdtSdtArticuloPedido_Fases_SetNull( )
   {
      gxTv_SdtSdtArticuloPedido_Fases_N = (byte)(1) ;
      gxTv_SdtSdtArticuloPedido_Fases = null ;
   }

   public boolean getgxTv_SdtSdtArticuloPedido_Fases_IsNull( )
   {
      if ( gxTv_SdtSdtArticuloPedido_Fases == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSdtArticuloPedido_Fases_N( )
   {
      return gxTv_SdtSdtArticuloPedido_Fases_N ;
   }

   public GXBaseCollection<app.SdtSdtRecepcionPedido> getgxTv_SdtSdtArticuloPedido_Consultaalmacen( )
   {
      if ( gxTv_SdtSdtArticuloPedido_Consultaalmacen == null )
      {
         gxTv_SdtSdtArticuloPedido_Consultaalmacen = new GXBaseCollection<app.SdtSdtRecepcionPedido>(app.SdtSdtRecepcionPedido.class, "SdtRecepcionPedido", "TexplusNET", remoteHandle);
      }
      gxTv_SdtSdtArticuloPedido_Consultaalmacen_N = (byte)(0) ;
      gxTv_SdtSdtArticuloPedido_N = (byte)(0) ;
      return gxTv_SdtSdtArticuloPedido_Consultaalmacen ;
   }

   public void setgxTv_SdtSdtArticuloPedido_Consultaalmacen( GXBaseCollection<app.SdtSdtRecepcionPedido> value )
   {
      gxTv_SdtSdtArticuloPedido_Consultaalmacen_N = (byte)(0) ;
      gxTv_SdtSdtArticuloPedido_N = (byte)(0) ;
      gxTv_SdtSdtArticuloPedido_Consultaalmacen = value ;
   }

   public void setgxTv_SdtSdtArticuloPedido_Consultaalmacen_SetNull( )
   {
      gxTv_SdtSdtArticuloPedido_Consultaalmacen_N = (byte)(1) ;
      gxTv_SdtSdtArticuloPedido_Consultaalmacen = null ;
   }

   public boolean getgxTv_SdtSdtArticuloPedido_Consultaalmacen_IsNull( )
   {
      if ( gxTv_SdtSdtArticuloPedido_Consultaalmacen == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSdtArticuloPedido_Consultaalmacen_N( )
   {
      return gxTv_SdtSdtArticuloPedido_Consultaalmacen_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSdtArticuloPedido_Disartcod = "" ;
      gxTv_SdtSdtArticuloPedido_N = (byte)(1) ;
      gxTv_SdtSdtArticuloPedido_Artdsc = "" ;
      gxTv_SdtSdtArticuloPedido_Procod = "" ;
      gxTv_SdtSdtArticuloPedido_Prodsc = "" ;
      gxTv_SdtSdtArticuloPedido_Kilos = DecimalUtil.ZERO ;
      gxTv_SdtSdtArticuloPedido_Metros = DecimalUtil.ZERO ;
      gxTv_SdtSdtArticuloPedido_Disfasapr = "" ;
      gxTv_SdtSdtArticuloPedido_Prostsfec = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtSdtArticuloPedido_Prostsfec_N = (byte)(1) ;
      gxTv_SdtSdtArticuloPedido_Fases_N = (byte)(1) ;
      gxTv_SdtSdtArticuloPedido_Consultaalmacen_N = (byte)(1) ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtSdtArticuloPedido_N ;
   }

   public app.SdtSdtArticuloPedido Clone( )
   {
      return (app.SdtSdtArticuloPedido)(clone()) ;
   }

   public void setStruct( app.StructSdtSdtArticuloPedido struct )
   {
      setgxTv_SdtSdtArticuloPedido_Disartcod(struct.getDisartcod());
      setgxTv_SdtSdtArticuloPedido_Artdsc(struct.getArtdsc());
      setgxTv_SdtSdtArticuloPedido_Procod(struct.getProcod());
      setgxTv_SdtSdtArticuloPedido_Prodsc(struct.getProdsc());
      setgxTv_SdtSdtArticuloPedido_Disnumpie(struct.getDisnumpie());
      setgxTv_SdtSdtArticuloPedido_Kilos(struct.getKilos());
      setgxTv_SdtSdtArticuloPedido_Metros(struct.getMetros());
      setgxTv_SdtSdtArticuloPedido_Disartanh(struct.getDisartanh());
      setgxTv_SdtSdtArticuloPedido_Disgraaca(struct.getDisgraaca());
      setgxTv_SdtSdtArticuloPedido_Ultfaslin(struct.getUltfaslin());
      setgxTv_SdtSdtArticuloPedido_Disfasapr(struct.getDisfasapr());
      setgxTv_SdtSdtArticuloPedido_Prosts(struct.getProsts());
      if ( struct.gxTv_SdtSdtArticuloPedido_Prostsfec_N == 0 )
      {
         setgxTv_SdtSdtArticuloPedido_Prostsfec(struct.getProstsfec());
      }
      setgxTv_SdtSdtArticuloPedido_Discod(struct.getDiscod());
      GXBaseCollection<app.SdtSdtFasePedido> gxTv_SdtSdtArticuloPedido_Fases_aux = new GXBaseCollection<app.SdtSdtFasePedido>(app.SdtSdtFasePedido.class, "SdtFasePedido", "TexplusNET", remoteHandle);
      Vector<app.StructSdtSdtFasePedido> gxTv_SdtSdtArticuloPedido_Fases_aux1 = struct.getFases();
      if (gxTv_SdtSdtArticuloPedido_Fases_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtSdtArticuloPedido_Fases_aux1.size(); i++)
         {
            gxTv_SdtSdtArticuloPedido_Fases_aux.add(new app.SdtSdtFasePedido(gxTv_SdtSdtArticuloPedido_Fases_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtSdtArticuloPedido_Fases(gxTv_SdtSdtArticuloPedido_Fases_aux);
      GXBaseCollection<app.SdtSdtRecepcionPedido> gxTv_SdtSdtArticuloPedido_Consultaalmacen_aux = new GXBaseCollection<app.SdtSdtRecepcionPedido>(app.SdtSdtRecepcionPedido.class, "SdtRecepcionPedido", "TexplusNET", remoteHandle);
      Vector<app.StructSdtSdtRecepcionPedido> gxTv_SdtSdtArticuloPedido_Consultaalmacen_aux1 = struct.getConsultaalmacen();
      if (gxTv_SdtSdtArticuloPedido_Consultaalmacen_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtSdtArticuloPedido_Consultaalmacen_aux1.size(); i++)
         {
            gxTv_SdtSdtArticuloPedido_Consultaalmacen_aux.add(new app.SdtSdtRecepcionPedido(gxTv_SdtSdtArticuloPedido_Consultaalmacen_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtSdtArticuloPedido_Consultaalmacen(gxTv_SdtSdtArticuloPedido_Consultaalmacen_aux);
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSdtArticuloPedido getStruct( )
   {
      app.StructSdtSdtArticuloPedido struct = new app.StructSdtSdtArticuloPedido ();
      struct.setDisartcod(getgxTv_SdtSdtArticuloPedido_Disartcod());
      struct.setArtdsc(getgxTv_SdtSdtArticuloPedido_Artdsc());
      struct.setProcod(getgxTv_SdtSdtArticuloPedido_Procod());
      struct.setProdsc(getgxTv_SdtSdtArticuloPedido_Prodsc());
      struct.setDisnumpie(getgxTv_SdtSdtArticuloPedido_Disnumpie());
      struct.setKilos(getgxTv_SdtSdtArticuloPedido_Kilos());
      struct.setMetros(getgxTv_SdtSdtArticuloPedido_Metros());
      struct.setDisartanh(getgxTv_SdtSdtArticuloPedido_Disartanh());
      struct.setDisgraaca(getgxTv_SdtSdtArticuloPedido_Disgraaca());
      struct.setUltfaslin(getgxTv_SdtSdtArticuloPedido_Ultfaslin());
      struct.setDisfasapr(getgxTv_SdtSdtArticuloPedido_Disfasapr());
      struct.setProsts(getgxTv_SdtSdtArticuloPedido_Prosts());
      if ( gxTv_SdtSdtArticuloPedido_Prostsfec_N == 0 )
      {
         struct.setProstsfec(getgxTv_SdtSdtArticuloPedido_Prostsfec());
      }
      struct.setDiscod(getgxTv_SdtSdtArticuloPedido_Discod());
      struct.setFases(getgxTv_SdtSdtArticuloPedido_Fases().getStruct());
      struct.setConsultaalmacen(getgxTv_SdtSdtArticuloPedido_Consultaalmacen().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtSdtArticuloPedido_N ;
   protected byte gxTv_SdtSdtArticuloPedido_Prosts ;
   protected byte gxTv_SdtSdtArticuloPedido_Prostsfec_N ;
   protected byte gxTv_SdtSdtArticuloPedido_Fases_N ;
   protected byte gxTv_SdtSdtArticuloPedido_Consultaalmacen_N ;
   protected short gxTv_SdtSdtArticuloPedido_Disnumpie ;
   protected short gxTv_SdtSdtArticuloPedido_Disartanh ;
   protected short gxTv_SdtSdtArticuloPedido_Disgraaca ;
   protected short gxTv_SdtSdtArticuloPedido_Ultfaslin ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSdtArticuloPedido_Discod ;
   protected java.math.BigDecimal gxTv_SdtSdtArticuloPedido_Kilos ;
   protected java.math.BigDecimal gxTv_SdtSdtArticuloPedido_Metros ;
   protected String gxTv_SdtSdtArticuloPedido_Disartcod ;
   protected String gxTv_SdtSdtArticuloPedido_Artdsc ;
   protected String gxTv_SdtSdtArticuloPedido_Procod ;
   protected String gxTv_SdtSdtArticuloPedido_Prodsc ;
   protected String gxTv_SdtSdtArticuloPedido_Disfasapr ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSdtArticuloPedido_Prostsfec ;
   protected java.util.Date datetime_STZ ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<app.SdtSdtFasePedido> gxTv_SdtSdtArticuloPedido_Fases_aux ;
   protected GXBaseCollection<app.SdtSdtRecepcionPedido> gxTv_SdtSdtArticuloPedido_Consultaalmacen_aux ;
   protected GXBaseCollection<app.SdtSdtFasePedido> gxTv_SdtSdtArticuloPedido_Fases=null ;
   protected GXBaseCollection<app.SdtSdtRecepcionPedido> gxTv_SdtSdtArticuloPedido_Consultaalmacen=null ;
}

