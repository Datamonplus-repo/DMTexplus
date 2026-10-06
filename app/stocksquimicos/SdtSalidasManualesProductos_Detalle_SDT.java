package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSalidasManualesProductos_Detalle_SDT extends GxUserType
{
   public SdtSalidasManualesProductos_Detalle_SDT( )
   {
      this(  new ModelContext(SdtSalidasManualesProductos_Detalle_SDT.class));
   }

   public SdtSalidasManualesProductos_Detalle_SDT( ModelContext context )
   {
      super( context, "SdtSalidasManualesProductos_Detalle_SDT");
   }

   public SdtSalidasManualesProductos_Detalle_SDT( int remoteHandle ,
                                                   ModelContext context )
   {
      super( remoteHandle, context, "SdtSalidasManualesProductos_Detalle_SDT");
   }

   public SdtSalidasManualesProductos_Detalle_SDT( StructSdtSalidasManualesProductos_Detalle_SDT struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprCod") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_SDT_Emprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CumCodCont") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumcodcont = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_SDT_Emprnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdNum") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdnum = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdNom") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CumConCant") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconcant = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CumConCbis") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconcbis = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CumCosPro") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumcospro = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdPreAct") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdpreact = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdExiAlm") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdexialm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdExiCC") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdexicc = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdCanRes") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdcanres = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdPreMed") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdpremed = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UltFecCCs") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSalidasManualesProductos_Detalle_SDT_Ultfecccs = GXutil.nullDate() ;
                  gxTv_SdtSalidasManualesProductos_Detalle_SDT_Ultfecccs_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSalidasManualesProductos_Detalle_SDT_Ultfecccs_N = (byte)(0) ;
                  gxTv_SdtSalidasManualesProductos_Detalle_SDT_Ultfecccs = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdFacCon") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdfaccon = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CumConLot") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconlot = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdValStk") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdvalstk = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ForPrdUMe") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_SDT_Forprdume = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ForPrdDsc") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_SDT_Forprddsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CumUnidad") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumunidad = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdComID") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdcomid = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdLote") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdlote = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CumUMed") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumumed = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Eliminar") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_SDT_Eliminar = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
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
         sName = "SalidasManualesProductos_Detalle_SDT" ;
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
      oWriter.writeElement("EmprCod", gxTv_SdtSalidasManualesProductos_Detalle_SDT_Emprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CumCodCont", GXutil.trim( GXutil.str( gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumcodcont, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EmprNom", gxTv_SdtSalidasManualesProductos_Detalle_SDT_Emprnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdNum", gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdnum);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdNom", gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CumConCant", GXutil.trim( GXutil.strNoRound( gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconcant, 12, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CumConCbis", GXutil.trim( GXutil.strNoRound( gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconcbis, 12, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CumCosPro", GXutil.trim( GXutil.strNoRound( gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumcospro, 10, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdPreAct", GXutil.trim( GXutil.strNoRound( gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdpreact, 14, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdExiAlm", GXutil.trim( GXutil.strNoRound( gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdexialm, 12, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdExiCC", GXutil.trim( GXutil.strNoRound( gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdexicc, 12, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdCanRes", GXutil.trim( GXutil.strNoRound( gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdcanres, 12, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdPreMed", GXutil.trim( GXutil.strNoRound( gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdpremed, 14, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSalidasManualesProductos_Detalle_SDT_Ultfecccs)) && ( gxTv_SdtSalidasManualesProductos_Detalle_SDT_Ultfecccs_N == 1 ) )
      {
         oWriter.writeElement("UltFecCCs", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSalidasManualesProductos_Detalle_SDT_Ultfecccs), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSalidasManualesProductos_Detalle_SDT_Ultfecccs), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSalidasManualesProductos_Detalle_SDT_Ultfecccs), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("UltFecCCs", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("PrdFacCon", GXutil.trim( GXutil.strNoRound( gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdfaccon, 7, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CumConLot", gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconlot);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdValStk", GXutil.trim( GXutil.strNoRound( gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdvalstk, 11, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ForPrdUMe", GXutil.trim( GXutil.str( gxTv_SdtSalidasManualesProductos_Detalle_SDT_Forprdume, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ForPrdDsc", gxTv_SdtSalidasManualesProductos_Detalle_SDT_Forprddsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CumUnidad", GXutil.trim( GXutil.str( gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumunidad, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdComID", gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdcomid);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdLote", gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdlote);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CumUMed", GXutil.trim( GXutil.str( gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumumed, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Eliminar", GXutil.booltostr( gxTv_SdtSalidasManualesProductos_Detalle_SDT_Eliminar));
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
      AddObjectProperty("EmprCod", gxTv_SdtSalidasManualesProductos_Detalle_SDT_Emprcod, false, false);
      AddObjectProperty("CumCodCont", gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumcodcont, false, false);
      AddObjectProperty("EmprNom", gxTv_SdtSalidasManualesProductos_Detalle_SDT_Emprnom, false, false);
      AddObjectProperty("PrdNum", gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdnum, false, false);
      AddObjectProperty("PrdNom", gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdnom, false, false);
      AddObjectProperty("CumConCant", gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconcant, false, false);
      AddObjectProperty("CumConCbis", gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconcbis, false, false);
      AddObjectProperty("CumCosPro", gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumcospro, false, false);
      AddObjectProperty("PrdPreAct", gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdpreact, false, false);
      AddObjectProperty("PrdExiAlm", gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdexialm, false, false);
      AddObjectProperty("PrdExiCC", gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdexicc, false, false);
      AddObjectProperty("PrdCanRes", gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdcanres, false, false);
      AddObjectProperty("PrdPreMed", gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdpremed, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSalidasManualesProductos_Detalle_SDT_Ultfecccs), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSalidasManualesProductos_Detalle_SDT_Ultfecccs), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSalidasManualesProductos_Detalle_SDT_Ultfecccs), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("UltFecCCs", sDateCnv, false, false);
      AddObjectProperty("PrdFacCon", gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdfaccon, false, false);
      AddObjectProperty("CumConLot", gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconlot, false, false);
      AddObjectProperty("PrdValStk", gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdvalstk, false, false);
      AddObjectProperty("ForPrdUMe", gxTv_SdtSalidasManualesProductos_Detalle_SDT_Forprdume, false, false);
      AddObjectProperty("ForPrdDsc", gxTv_SdtSalidasManualesProductos_Detalle_SDT_Forprddsc, false, false);
      AddObjectProperty("CumUnidad", gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumunidad, false, false);
      AddObjectProperty("PrdComID", gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdcomid, false, false);
      AddObjectProperty("PrdLote", gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdlote, false, false);
      AddObjectProperty("CumUMed", gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumumed, false, false);
      AddObjectProperty("Eliminar", gxTv_SdtSalidasManualesProductos_Detalle_SDT_Eliminar, false, false);
   }

   public String getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Emprcod( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_SDT_Emprcod ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Emprcod( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Emprcod = value ;
   }

   public int getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumcodcont( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumcodcont ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumcodcont( int value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumcodcont = value ;
   }

   public String getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Emprnom( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_SDT_Emprnom ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Emprnom( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Emprnom = value ;
   }

   public String getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdnum( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdnum ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdnum( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdnum = value ;
   }

   public String getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdnom( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdnom ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdnom( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdnom = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconcant( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconcant ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconcant( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconcant = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconcbis( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconcbis ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconcbis( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconcbis = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumcospro( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumcospro ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumcospro( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumcospro = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdpreact( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdpreact ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdpreact( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdpreact = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdexialm( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdexialm ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdexialm( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdexialm = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdexicc( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdexicc ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdexicc( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdexicc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdcanres( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdcanres ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdcanres( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdcanres = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdpremed( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdpremed ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdpremed( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdpremed = value ;
   }

   public java.util.Date getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Ultfecccs( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_SDT_Ultfecccs ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Ultfecccs( java.util.Date value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Ultfecccs_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Ultfecccs = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdfaccon( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdfaccon ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdfaccon( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdfaccon = value ;
   }

   public String getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconlot( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconlot ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconlot( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconlot = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdvalstk( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdvalstk ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdvalstk( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdvalstk = value ;
   }

   public byte getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Forprdume( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_SDT_Forprdume ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Forprdume( byte value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Forprdume = value ;
   }

   public String getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Forprddsc( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_SDT_Forprddsc ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Forprddsc( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Forprddsc = value ;
   }

   public byte getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumunidad( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumunidad ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumunidad( byte value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumunidad = value ;
   }

   public String getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdcomid( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdcomid ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdcomid( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdcomid = value ;
   }

   public String getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdlote( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdlote ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdlote( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdlote = value ;
   }

   public byte getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumumed( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumumed ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumumed( byte value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumumed = value ;
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Eliminar( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_SDT_Eliminar ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Eliminar( boolean value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Eliminar = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Emprcod = "" ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_N = (byte)(1) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Emprnom = "" ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdnum = "" ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdnom = "" ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconcant = DecimalUtil.ZERO ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconcbis = DecimalUtil.ZERO ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumcospro = DecimalUtil.ZERO ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdpreact = DecimalUtil.ZERO ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdexialm = DecimalUtil.ZERO ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdexicc = DecimalUtil.ZERO ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdcanres = DecimalUtil.ZERO ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdpremed = DecimalUtil.ZERO ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Ultfecccs = GXutil.nullDate() ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Ultfecccs_N = (byte)(1) ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdfaccon = DecimalUtil.ZERO ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconlot = "" ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdvalstk = DecimalUtil.ZERO ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Forprddsc = "" ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdcomid = "" ;
      gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdlote = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_SDT_N ;
   }

   public app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT Clone( )
   {
      return (app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)(clone()) ;
   }

   public void setStruct( app.stocksquimicos.StructSdtSalidasManualesProductos_Detalle_SDT struct )
   {
      setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Emprcod(struct.getEmprcod());
      setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumcodcont(struct.getCumcodcont());
      setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Emprnom(struct.getEmprnom());
      setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdnum(struct.getPrdnum());
      setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdnom(struct.getPrdnom());
      setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconcant(struct.getCumconcant());
      setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconcbis(struct.getCumconcbis());
      setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumcospro(struct.getCumcospro());
      setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdpreact(struct.getPrdpreact());
      setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdexialm(struct.getPrdexialm());
      setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdexicc(struct.getPrdexicc());
      setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdcanres(struct.getPrdcanres());
      setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdpremed(struct.getPrdpremed());
      if ( struct.gxTv_SdtSalidasManualesProductos_Detalle_SDT_Ultfecccs_N == 0 )
      {
         setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Ultfecccs(struct.getUltfecccs());
      }
      setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdfaccon(struct.getPrdfaccon());
      setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconlot(struct.getCumconlot());
      setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdvalstk(struct.getPrdvalstk());
      setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Forprdume(struct.getForprdume());
      setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Forprddsc(struct.getForprddsc());
      setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumunidad(struct.getCumunidad());
      setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdcomid(struct.getPrdcomid());
      setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdlote(struct.getPrdlote());
      setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumumed(struct.getCumumed());
      setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Eliminar(struct.getEliminar());
   }

   @SuppressWarnings("unchecked")
   public app.stocksquimicos.StructSdtSalidasManualesProductos_Detalle_SDT getStruct( )
   {
      app.stocksquimicos.StructSdtSalidasManualesProductos_Detalle_SDT struct = new app.stocksquimicos.StructSdtSalidasManualesProductos_Detalle_SDT ();
      struct.setEmprcod(getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Emprcod());
      struct.setCumcodcont(getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumcodcont());
      struct.setEmprnom(getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Emprnom());
      struct.setPrdnum(getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdnum());
      struct.setPrdnom(getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdnom());
      struct.setCumconcant(getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconcant());
      struct.setCumconcbis(getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconcbis());
      struct.setCumcospro(getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumcospro());
      struct.setPrdpreact(getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdpreact());
      struct.setPrdexialm(getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdexialm());
      struct.setPrdexicc(getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdexicc());
      struct.setPrdcanres(getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdcanres());
      struct.setPrdpremed(getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdpremed());
      if ( gxTv_SdtSalidasManualesProductos_Detalle_SDT_Ultfecccs_N == 0 )
      {
         struct.setUltfecccs(getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Ultfecccs());
      }
      struct.setPrdfaccon(getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdfaccon());
      struct.setCumconlot(getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconlot());
      struct.setPrdvalstk(getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdvalstk());
      struct.setForprdume(getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Forprdume());
      struct.setForprddsc(getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Forprddsc());
      struct.setCumunidad(getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumunidad());
      struct.setPrdcomid(getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdcomid());
      struct.setPrdlote(getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdlote());
      struct.setCumumed(getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumumed());
      struct.setEliminar(getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Eliminar());
      return struct ;
   }

   protected byte gxTv_SdtSalidasManualesProductos_Detalle_SDT_N ;
   protected byte gxTv_SdtSalidasManualesProductos_Detalle_SDT_Ultfecccs_N ;
   protected byte gxTv_SdtSalidasManualesProductos_Detalle_SDT_Forprdume ;
   protected byte gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumunidad ;
   protected byte gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumumed ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumcodcont ;
   protected java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconcant ;
   protected java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconcbis ;
   protected java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumcospro ;
   protected java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdpreact ;
   protected java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdexialm ;
   protected java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdexicc ;
   protected java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdcanres ;
   protected java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdpremed ;
   protected java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdfaccon ;
   protected java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdvalstk ;
   protected String gxTv_SdtSalidasManualesProductos_Detalle_SDT_Emprcod ;
   protected String gxTv_SdtSalidasManualesProductos_Detalle_SDT_Emprnom ;
   protected String gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdnum ;
   protected String gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdnom ;
   protected String gxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconlot ;
   protected String gxTv_SdtSalidasManualesProductos_Detalle_SDT_Forprddsc ;
   protected String gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdcomid ;
   protected String gxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdlote ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSalidasManualesProductos_Detalle_SDT_Ultfecccs ;
   protected boolean gxTv_SdtSalidasManualesProductos_Detalle_SDT_Eliminar ;
   protected boolean readElement ;
   protected boolean formatError ;
}

