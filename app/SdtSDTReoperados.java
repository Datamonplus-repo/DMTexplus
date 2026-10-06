package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTReoperados extends GxUserType
{
   public SdtSDTReoperados( )
   {
      this(  new ModelContext(SdtSDTReoperados.class));
   }

   public SdtSDTReoperados( ModelContext context )
   {
      super( context, "SdtSDTReoperados");
   }

   public SdtSDTReoperados( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTReoperados");
   }

   public SdtSDTReoperados( StructSdtSDTReoperados struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipoReoperado") )
            {
               gxTv_SdtSDTReoperados_Tiporeoperado = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisReoFec") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTReoperados_Hisreofec = GXutil.nullDate() ;
                  gxTv_SdtSDTReoperados_Hisreofec_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTReoperados_Hisreofec_N = (byte)(0) ;
                  gxTv_SdtSDTReoperados_Hisreofec = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisHorReo") )
            {
               gxTv_SdtSDTReoperados_Hishorreo = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisReoHDR") )
            {
               gxTv_SdtSDTReoperados_Hisreohdr = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisreoLote") )
            {
               gxTv_SdtSDTReoperados_Hisreolote = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tipdefcod") )
            {
               gxTv_SdtSDTReoperados_Tipdefcod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipDefDsc") )
            {
               gxTv_SdtSDTReoperados_Tipdefdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CodCausa") )
            {
               gxTv_SdtSDTReoperados_Codcausa = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DscCausa") )
            {
               gxTv_SdtSDTReoperados_Dsccausa = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Rps_Cod") )
            {
               gxTv_SdtSDTReoperados_Rps_cod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Rps_Dsc") )
            {
               gxTv_SdtSDTReoperados_Rps_dsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqCod") )
            {
               gxTv_SdtSDTReoperados_Maqcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqDsc") )
            {
               gxTv_SdtSDTReoperados_Maqdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliCod") )
            {
               gxTv_SdtSDTReoperados_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtSDTReoperados_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisBarSer") )
            {
               gxTv_SdtSDTReoperados_Hisbarser = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisReoDsc") )
            {
               gxTv_SdtSDTReoperados_Hisreodsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisTipArt") )
            {
               gxTv_SdtSDTReoperados_Histipart = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisColNom") )
            {
               gxTv_SdtSDTReoperados_Hiscolnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisColNum") )
            {
               gxTv_SdtSDTReoperados_Hiscolnum = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisTipCol") )
            {
               gxTv_SdtSDTReoperados_Histipcol = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisNomCli") )
            {
               gxTv_SdtSDTReoperados_Hisnomcli = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisNumCli") )
            {
               gxTv_SdtSDTReoperados_Hisnumcli = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisBarKgm") )
            {
               gxTv_SdtSDTReoperados_Hisbarkgm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisBarMtr") )
            {
               gxTv_SdtSDTReoperados_Hisbarmtr = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisNumPie") )
            {
               gxTv_SdtSDTReoperados_Hisnumpie = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisOpeTur") )
            {
               gxTv_SdtSDTReoperados_Hisopetur = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisOpecod") )
            {
               gxTv_SdtSDTReoperados_Hisopecod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisUsu") )
            {
               gxTv_SdtSDTReoperados_Hisusu = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisAdeObs") )
            {
               gxTv_SdtSDTReoperados_Hisadeobs = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisAdeSN") )
            {
               gxTv_SdtSDTReoperados_Hisadesn = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisAcCot") )
            {
               gxTv_SdtSDTReoperados_Hisaccot = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisAcCo") )
            {
               gxTv_SdtSDTReoperados_Hisacco = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisAdEAcCt") )
            {
               gxTv_SdtSDTReoperados_Hisadeacct = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisAdEAcCo") )
            {
               gxTv_SdtSDTReoperados_Hisadeacco = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisReoTn") )
            {
               gxTv_SdtSDTReoperados_Hisreotn = (int)(getnumericvalue(oReader.getValue())) ;
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
         sName = "SDTReoperados" ;
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
      oWriter.writeElement("TipoReoperado", gxTv_SdtSDTReoperados_Tiporeoperado);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSDTReoperados_Hisreofec)) && ( gxTv_SdtSDTReoperados_Hisreofec_N == 1 ) )
      {
         oWriter.writeElement("HisReoFec", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTReoperados_Hisreofec), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTReoperados_Hisreofec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTReoperados_Hisreofec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("HisReoFec", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("HisHorReo", gxTv_SdtSDTReoperados_Hishorreo);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisReoHDR", gxTv_SdtSDTReoperados_Hisreohdr);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisreoLote", gxTv_SdtSDTReoperados_Hisreolote);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Tipdefcod", GXutil.trim( GXutil.str( gxTv_SdtSDTReoperados_Tipdefcod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipDefDsc", gxTv_SdtSDTReoperados_Tipdefdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CodCausa", GXutil.trim( GXutil.str( gxTv_SdtSDTReoperados_Codcausa, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DscCausa", gxTv_SdtSDTReoperados_Dsccausa);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Rps_Cod", GXutil.trim( GXutil.str( gxTv_SdtSDTReoperados_Rps_cod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Rps_Dsc", gxTv_SdtSDTReoperados_Rps_dsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqCod", gxTv_SdtSDTReoperados_Maqcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqDsc", gxTv_SdtSDTReoperados_Maqdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliCod", GXutil.trim( GXutil.str( gxTv_SdtSDTReoperados_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNom", gxTv_SdtSDTReoperados_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisBarSer", gxTv_SdtSDTReoperados_Hisbarser);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisReoDsc", gxTv_SdtSDTReoperados_Hisreodsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisTipArt", GXutil.trim( GXutil.str( gxTv_SdtSDTReoperados_Histipart, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisColNom", gxTv_SdtSDTReoperados_Hiscolnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisColNum", GXutil.trim( GXutil.str( gxTv_SdtSDTReoperados_Hiscolnum, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisTipCol", GXutil.trim( GXutil.str( gxTv_SdtSDTReoperados_Histipcol, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisNomCli", gxTv_SdtSDTReoperados_Hisnomcli);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisNumCli", GXutil.trim( GXutil.str( gxTv_SdtSDTReoperados_Hisnumcli, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisBarKgm", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTReoperados_Hisbarkgm, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisBarMtr", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTReoperados_Hisbarmtr, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisNumPie", GXutil.trim( GXutil.str( gxTv_SdtSDTReoperados_Hisnumpie, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisOpeTur", GXutil.trim( GXutil.str( gxTv_SdtSDTReoperados_Hisopetur, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisOpecod", GXutil.trim( GXutil.str( gxTv_SdtSDTReoperados_Hisopecod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisUsu", gxTv_SdtSDTReoperados_Hisusu);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisAdeObs", gxTv_SdtSDTReoperados_Hisadeobs);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisAdeSN", gxTv_SdtSDTReoperados_Hisadesn);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisAcCot", gxTv_SdtSDTReoperados_Hisaccot);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisAcCo", gxTv_SdtSDTReoperados_Hisacco);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisAdEAcCt", gxTv_SdtSDTReoperados_Hisadeacct);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisAdEAcCo", gxTv_SdtSDTReoperados_Hisadeacco);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisReoTn", GXutil.trim( GXutil.str( gxTv_SdtSDTReoperados_Hisreotn, 6, 0)));
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
      AddObjectProperty("TipoReoperado", gxTv_SdtSDTReoperados_Tiporeoperado, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTReoperados_Hisreofec), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTReoperados_Hisreofec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTReoperados_Hisreofec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("HisReoFec", sDateCnv, false, false);
      AddObjectProperty("HisHorReo", gxTv_SdtSDTReoperados_Hishorreo, false, false);
      AddObjectProperty("HisReoHDR", gxTv_SdtSDTReoperados_Hisreohdr, false, false);
      AddObjectProperty("HisreoLote", gxTv_SdtSDTReoperados_Hisreolote, false, false);
      AddObjectProperty("Tipdefcod", gxTv_SdtSDTReoperados_Tipdefcod, false, false);
      AddObjectProperty("TipDefDsc", gxTv_SdtSDTReoperados_Tipdefdsc, false, false);
      AddObjectProperty("CodCausa", gxTv_SdtSDTReoperados_Codcausa, false, false);
      AddObjectProperty("DscCausa", gxTv_SdtSDTReoperados_Dsccausa, false, false);
      AddObjectProperty("Rps_Cod", gxTv_SdtSDTReoperados_Rps_cod, false, false);
      AddObjectProperty("Rps_Dsc", gxTv_SdtSDTReoperados_Rps_dsc, false, false);
      AddObjectProperty("MaqCod", gxTv_SdtSDTReoperados_Maqcod, false, false);
      AddObjectProperty("MaqDsc", gxTv_SdtSDTReoperados_Maqdsc, false, false);
      AddObjectProperty("CliCod", gxTv_SdtSDTReoperados_Clicod, false, false);
      AddObjectProperty("CliNom", gxTv_SdtSDTReoperados_Clinom, false, false);
      AddObjectProperty("HisBarSer", gxTv_SdtSDTReoperados_Hisbarser, false, false);
      AddObjectProperty("HisReoDsc", gxTv_SdtSDTReoperados_Hisreodsc, false, false);
      AddObjectProperty("HisTipArt", gxTv_SdtSDTReoperados_Histipart, false, false);
      AddObjectProperty("HisColNom", gxTv_SdtSDTReoperados_Hiscolnom, false, false);
      AddObjectProperty("HisColNum", gxTv_SdtSDTReoperados_Hiscolnum, false, false);
      AddObjectProperty("HisTipCol", gxTv_SdtSDTReoperados_Histipcol, false, false);
      AddObjectProperty("HisNomCli", gxTv_SdtSDTReoperados_Hisnomcli, false, false);
      AddObjectProperty("HisNumCli", gxTv_SdtSDTReoperados_Hisnumcli, false, false);
      AddObjectProperty("HisBarKgm", gxTv_SdtSDTReoperados_Hisbarkgm, false, false);
      AddObjectProperty("HisBarMtr", gxTv_SdtSDTReoperados_Hisbarmtr, false, false);
      AddObjectProperty("HisNumPie", gxTv_SdtSDTReoperados_Hisnumpie, false, false);
      AddObjectProperty("HisOpeTur", gxTv_SdtSDTReoperados_Hisopetur, false, false);
      AddObjectProperty("HisOpecod", gxTv_SdtSDTReoperados_Hisopecod, false, false);
      AddObjectProperty("HisUsu", gxTv_SdtSDTReoperados_Hisusu, false, false);
      AddObjectProperty("HisAdeObs", gxTv_SdtSDTReoperados_Hisadeobs, false, false);
      AddObjectProperty("HisAdeSN", gxTv_SdtSDTReoperados_Hisadesn, false, false);
      AddObjectProperty("HisAcCot", gxTv_SdtSDTReoperados_Hisaccot, false, false);
      AddObjectProperty("HisAcCo", gxTv_SdtSDTReoperados_Hisacco, false, false);
      AddObjectProperty("HisAdEAcCt", gxTv_SdtSDTReoperados_Hisadeacct, false, false);
      AddObjectProperty("HisAdEAcCo", gxTv_SdtSDTReoperados_Hisadeacco, false, false);
      AddObjectProperty("HisReoTn", gxTv_SdtSDTReoperados_Hisreotn, false, false);
   }

   public String getgxTv_SdtSDTReoperados_Tiporeoperado( )
   {
      return gxTv_SdtSDTReoperados_Tiporeoperado ;
   }

   public void setgxTv_SdtSDTReoperados_Tiporeoperado( String value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Tiporeoperado = value ;
   }

   public java.util.Date getgxTv_SdtSDTReoperados_Hisreofec( )
   {
      return gxTv_SdtSDTReoperados_Hisreofec ;
   }

   public void setgxTv_SdtSDTReoperados_Hisreofec( java.util.Date value )
   {
      gxTv_SdtSDTReoperados_Hisreofec_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Hisreofec = value ;
   }

   public String getgxTv_SdtSDTReoperados_Hishorreo( )
   {
      return gxTv_SdtSDTReoperados_Hishorreo ;
   }

   public void setgxTv_SdtSDTReoperados_Hishorreo( String value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Hishorreo = value ;
   }

   public String getgxTv_SdtSDTReoperados_Hisreohdr( )
   {
      return gxTv_SdtSDTReoperados_Hisreohdr ;
   }

   public void setgxTv_SdtSDTReoperados_Hisreohdr( String value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Hisreohdr = value ;
   }

   public String getgxTv_SdtSDTReoperados_Hisreolote( )
   {
      return gxTv_SdtSDTReoperados_Hisreolote ;
   }

   public void setgxTv_SdtSDTReoperados_Hisreolote( String value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Hisreolote = value ;
   }

   public short getgxTv_SdtSDTReoperados_Tipdefcod( )
   {
      return gxTv_SdtSDTReoperados_Tipdefcod ;
   }

   public void setgxTv_SdtSDTReoperados_Tipdefcod( short value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Tipdefcod = value ;
   }

   public String getgxTv_SdtSDTReoperados_Tipdefdsc( )
   {
      return gxTv_SdtSDTReoperados_Tipdefdsc ;
   }

   public void setgxTv_SdtSDTReoperados_Tipdefdsc( String value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Tipdefdsc = value ;
   }

   public short getgxTv_SdtSDTReoperados_Codcausa( )
   {
      return gxTv_SdtSDTReoperados_Codcausa ;
   }

   public void setgxTv_SdtSDTReoperados_Codcausa( short value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Codcausa = value ;
   }

   public String getgxTv_SdtSDTReoperados_Dsccausa( )
   {
      return gxTv_SdtSDTReoperados_Dsccausa ;
   }

   public void setgxTv_SdtSDTReoperados_Dsccausa( String value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Dsccausa = value ;
   }

   public short getgxTv_SdtSDTReoperados_Rps_cod( )
   {
      return gxTv_SdtSDTReoperados_Rps_cod ;
   }

   public void setgxTv_SdtSDTReoperados_Rps_cod( short value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Rps_cod = value ;
   }

   public String getgxTv_SdtSDTReoperados_Rps_dsc( )
   {
      return gxTv_SdtSDTReoperados_Rps_dsc ;
   }

   public void setgxTv_SdtSDTReoperados_Rps_dsc( String value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Rps_dsc = value ;
   }

   public String getgxTv_SdtSDTReoperados_Maqcod( )
   {
      return gxTv_SdtSDTReoperados_Maqcod ;
   }

   public void setgxTv_SdtSDTReoperados_Maqcod( String value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Maqcod = value ;
   }

   public String getgxTv_SdtSDTReoperados_Maqdsc( )
   {
      return gxTv_SdtSDTReoperados_Maqdsc ;
   }

   public void setgxTv_SdtSDTReoperados_Maqdsc( String value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Maqdsc = value ;
   }

   public int getgxTv_SdtSDTReoperados_Clicod( )
   {
      return gxTv_SdtSDTReoperados_Clicod ;
   }

   public void setgxTv_SdtSDTReoperados_Clicod( int value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Clicod = value ;
   }

   public String getgxTv_SdtSDTReoperados_Clinom( )
   {
      return gxTv_SdtSDTReoperados_Clinom ;
   }

   public void setgxTv_SdtSDTReoperados_Clinom( String value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Clinom = value ;
   }

   public String getgxTv_SdtSDTReoperados_Hisbarser( )
   {
      return gxTv_SdtSDTReoperados_Hisbarser ;
   }

   public void setgxTv_SdtSDTReoperados_Hisbarser( String value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Hisbarser = value ;
   }

   public String getgxTv_SdtSDTReoperados_Hisreodsc( )
   {
      return gxTv_SdtSDTReoperados_Hisreodsc ;
   }

   public void setgxTv_SdtSDTReoperados_Hisreodsc( String value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Hisreodsc = value ;
   }

   public short getgxTv_SdtSDTReoperados_Histipart( )
   {
      return gxTv_SdtSDTReoperados_Histipart ;
   }

   public void setgxTv_SdtSDTReoperados_Histipart( short value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Histipart = value ;
   }

   public String getgxTv_SdtSDTReoperados_Hiscolnom( )
   {
      return gxTv_SdtSDTReoperados_Hiscolnom ;
   }

   public void setgxTv_SdtSDTReoperados_Hiscolnom( String value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Hiscolnom = value ;
   }

   public int getgxTv_SdtSDTReoperados_Hiscolnum( )
   {
      return gxTv_SdtSDTReoperados_Hiscolnum ;
   }

   public void setgxTv_SdtSDTReoperados_Hiscolnum( int value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Hiscolnum = value ;
   }

   public byte getgxTv_SdtSDTReoperados_Histipcol( )
   {
      return gxTv_SdtSDTReoperados_Histipcol ;
   }

   public void setgxTv_SdtSDTReoperados_Histipcol( byte value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Histipcol = value ;
   }

   public String getgxTv_SdtSDTReoperados_Hisnomcli( )
   {
      return gxTv_SdtSDTReoperados_Hisnomcli ;
   }

   public void setgxTv_SdtSDTReoperados_Hisnomcli( String value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Hisnomcli = value ;
   }

   public int getgxTv_SdtSDTReoperados_Hisnumcli( )
   {
      return gxTv_SdtSDTReoperados_Hisnumcli ;
   }

   public void setgxTv_SdtSDTReoperados_Hisnumcli( int value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Hisnumcli = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTReoperados_Hisbarkgm( )
   {
      return gxTv_SdtSDTReoperados_Hisbarkgm ;
   }

   public void setgxTv_SdtSDTReoperados_Hisbarkgm( java.math.BigDecimal value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Hisbarkgm = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTReoperados_Hisbarmtr( )
   {
      return gxTv_SdtSDTReoperados_Hisbarmtr ;
   }

   public void setgxTv_SdtSDTReoperados_Hisbarmtr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Hisbarmtr = value ;
   }

   public short getgxTv_SdtSDTReoperados_Hisnumpie( )
   {
      return gxTv_SdtSDTReoperados_Hisnumpie ;
   }

   public void setgxTv_SdtSDTReoperados_Hisnumpie( short value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Hisnumpie = value ;
   }

   public byte getgxTv_SdtSDTReoperados_Hisopetur( )
   {
      return gxTv_SdtSDTReoperados_Hisopetur ;
   }

   public void setgxTv_SdtSDTReoperados_Hisopetur( byte value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Hisopetur = value ;
   }

   public int getgxTv_SdtSDTReoperados_Hisopecod( )
   {
      return gxTv_SdtSDTReoperados_Hisopecod ;
   }

   public void setgxTv_SdtSDTReoperados_Hisopecod( int value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Hisopecod = value ;
   }

   public String getgxTv_SdtSDTReoperados_Hisusu( )
   {
      return gxTv_SdtSDTReoperados_Hisusu ;
   }

   public void setgxTv_SdtSDTReoperados_Hisusu( String value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Hisusu = value ;
   }

   public String getgxTv_SdtSDTReoperados_Hisadeobs( )
   {
      return gxTv_SdtSDTReoperados_Hisadeobs ;
   }

   public void setgxTv_SdtSDTReoperados_Hisadeobs( String value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Hisadeobs = value ;
   }

   public String getgxTv_SdtSDTReoperados_Hisadesn( )
   {
      return gxTv_SdtSDTReoperados_Hisadesn ;
   }

   public void setgxTv_SdtSDTReoperados_Hisadesn( String value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Hisadesn = value ;
   }

   public String getgxTv_SdtSDTReoperados_Hisaccot( )
   {
      return gxTv_SdtSDTReoperados_Hisaccot ;
   }

   public void setgxTv_SdtSDTReoperados_Hisaccot( String value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Hisaccot = value ;
   }

   public String getgxTv_SdtSDTReoperados_Hisacco( )
   {
      return gxTv_SdtSDTReoperados_Hisacco ;
   }

   public void setgxTv_SdtSDTReoperados_Hisacco( String value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Hisacco = value ;
   }

   public String getgxTv_SdtSDTReoperados_Hisadeacct( )
   {
      return gxTv_SdtSDTReoperados_Hisadeacct ;
   }

   public void setgxTv_SdtSDTReoperados_Hisadeacct( String value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Hisadeacct = value ;
   }

   public String getgxTv_SdtSDTReoperados_Hisadeacco( )
   {
      return gxTv_SdtSDTReoperados_Hisadeacco ;
   }

   public void setgxTv_SdtSDTReoperados_Hisadeacco( String value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Hisadeacco = value ;
   }

   public int getgxTv_SdtSDTReoperados_Hisreotn( )
   {
      return gxTv_SdtSDTReoperados_Hisreotn ;
   }

   public void setgxTv_SdtSDTReoperados_Hisreotn( int value )
   {
      gxTv_SdtSDTReoperados_N = (byte)(0) ;
      gxTv_SdtSDTReoperados_Hisreotn = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTReoperados_Tiporeoperado = "" ;
      gxTv_SdtSDTReoperados_N = (byte)(1) ;
      gxTv_SdtSDTReoperados_Hisreofec = GXutil.nullDate() ;
      gxTv_SdtSDTReoperados_Hisreofec_N = (byte)(1) ;
      gxTv_SdtSDTReoperados_Hishorreo = "" ;
      gxTv_SdtSDTReoperados_Hisreohdr = "" ;
      gxTv_SdtSDTReoperados_Hisreolote = "" ;
      gxTv_SdtSDTReoperados_Tipdefdsc = "" ;
      gxTv_SdtSDTReoperados_Dsccausa = "" ;
      gxTv_SdtSDTReoperados_Rps_dsc = "" ;
      gxTv_SdtSDTReoperados_Maqcod = "" ;
      gxTv_SdtSDTReoperados_Maqdsc = "" ;
      gxTv_SdtSDTReoperados_Clinom = "" ;
      gxTv_SdtSDTReoperados_Hisbarser = "" ;
      gxTv_SdtSDTReoperados_Hisreodsc = "" ;
      gxTv_SdtSDTReoperados_Hiscolnom = "" ;
      gxTv_SdtSDTReoperados_Hisnomcli = "" ;
      gxTv_SdtSDTReoperados_Hisbarkgm = DecimalUtil.ZERO ;
      gxTv_SdtSDTReoperados_Hisbarmtr = DecimalUtil.ZERO ;
      gxTv_SdtSDTReoperados_Hisusu = "" ;
      gxTv_SdtSDTReoperados_Hisadeobs = "" ;
      gxTv_SdtSDTReoperados_Hisadesn = "" ;
      gxTv_SdtSDTReoperados_Hisaccot = "" ;
      gxTv_SdtSDTReoperados_Hisacco = "" ;
      gxTv_SdtSDTReoperados_Hisadeacct = "" ;
      gxTv_SdtSDTReoperados_Hisadeacco = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTReoperados_N ;
   }

   public app.SdtSDTReoperados Clone( )
   {
      return (app.SdtSDTReoperados)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTReoperados struct )
   {
      setgxTv_SdtSDTReoperados_Tiporeoperado(struct.getTiporeoperado());
      if ( struct.gxTv_SdtSDTReoperados_Hisreofec_N == 0 )
      {
         setgxTv_SdtSDTReoperados_Hisreofec(struct.getHisreofec());
      }
      setgxTv_SdtSDTReoperados_Hishorreo(struct.getHishorreo());
      setgxTv_SdtSDTReoperados_Hisreohdr(struct.getHisreohdr());
      setgxTv_SdtSDTReoperados_Hisreolote(struct.getHisreolote());
      setgxTv_SdtSDTReoperados_Tipdefcod(struct.getTipdefcod());
      setgxTv_SdtSDTReoperados_Tipdefdsc(struct.getTipdefdsc());
      setgxTv_SdtSDTReoperados_Codcausa(struct.getCodcausa());
      setgxTv_SdtSDTReoperados_Dsccausa(struct.getDsccausa());
      setgxTv_SdtSDTReoperados_Rps_cod(struct.getRps_cod());
      setgxTv_SdtSDTReoperados_Rps_dsc(struct.getRps_dsc());
      setgxTv_SdtSDTReoperados_Maqcod(struct.getMaqcod());
      setgxTv_SdtSDTReoperados_Maqdsc(struct.getMaqdsc());
      setgxTv_SdtSDTReoperados_Clicod(struct.getClicod());
      setgxTv_SdtSDTReoperados_Clinom(struct.getClinom());
      setgxTv_SdtSDTReoperados_Hisbarser(struct.getHisbarser());
      setgxTv_SdtSDTReoperados_Hisreodsc(struct.getHisreodsc());
      setgxTv_SdtSDTReoperados_Histipart(struct.getHistipart());
      setgxTv_SdtSDTReoperados_Hiscolnom(struct.getHiscolnom());
      setgxTv_SdtSDTReoperados_Hiscolnum(struct.getHiscolnum());
      setgxTv_SdtSDTReoperados_Histipcol(struct.getHistipcol());
      setgxTv_SdtSDTReoperados_Hisnomcli(struct.getHisnomcli());
      setgxTv_SdtSDTReoperados_Hisnumcli(struct.getHisnumcli());
      setgxTv_SdtSDTReoperados_Hisbarkgm(struct.getHisbarkgm());
      setgxTv_SdtSDTReoperados_Hisbarmtr(struct.getHisbarmtr());
      setgxTv_SdtSDTReoperados_Hisnumpie(struct.getHisnumpie());
      setgxTv_SdtSDTReoperados_Hisopetur(struct.getHisopetur());
      setgxTv_SdtSDTReoperados_Hisopecod(struct.getHisopecod());
      setgxTv_SdtSDTReoperados_Hisusu(struct.getHisusu());
      setgxTv_SdtSDTReoperados_Hisadeobs(struct.getHisadeobs());
      setgxTv_SdtSDTReoperados_Hisadesn(struct.getHisadesn());
      setgxTv_SdtSDTReoperados_Hisaccot(struct.getHisaccot());
      setgxTv_SdtSDTReoperados_Hisacco(struct.getHisacco());
      setgxTv_SdtSDTReoperados_Hisadeacct(struct.getHisadeacct());
      setgxTv_SdtSDTReoperados_Hisadeacco(struct.getHisadeacco());
      setgxTv_SdtSDTReoperados_Hisreotn(struct.getHisreotn());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTReoperados getStruct( )
   {
      app.StructSdtSDTReoperados struct = new app.StructSdtSDTReoperados ();
      struct.setTiporeoperado(getgxTv_SdtSDTReoperados_Tiporeoperado());
      if ( gxTv_SdtSDTReoperados_Hisreofec_N == 0 )
      {
         struct.setHisreofec(getgxTv_SdtSDTReoperados_Hisreofec());
      }
      struct.setHishorreo(getgxTv_SdtSDTReoperados_Hishorreo());
      struct.setHisreohdr(getgxTv_SdtSDTReoperados_Hisreohdr());
      struct.setHisreolote(getgxTv_SdtSDTReoperados_Hisreolote());
      struct.setTipdefcod(getgxTv_SdtSDTReoperados_Tipdefcod());
      struct.setTipdefdsc(getgxTv_SdtSDTReoperados_Tipdefdsc());
      struct.setCodcausa(getgxTv_SdtSDTReoperados_Codcausa());
      struct.setDsccausa(getgxTv_SdtSDTReoperados_Dsccausa());
      struct.setRps_cod(getgxTv_SdtSDTReoperados_Rps_cod());
      struct.setRps_dsc(getgxTv_SdtSDTReoperados_Rps_dsc());
      struct.setMaqcod(getgxTv_SdtSDTReoperados_Maqcod());
      struct.setMaqdsc(getgxTv_SdtSDTReoperados_Maqdsc());
      struct.setClicod(getgxTv_SdtSDTReoperados_Clicod());
      struct.setClinom(getgxTv_SdtSDTReoperados_Clinom());
      struct.setHisbarser(getgxTv_SdtSDTReoperados_Hisbarser());
      struct.setHisreodsc(getgxTv_SdtSDTReoperados_Hisreodsc());
      struct.setHistipart(getgxTv_SdtSDTReoperados_Histipart());
      struct.setHiscolnom(getgxTv_SdtSDTReoperados_Hiscolnom());
      struct.setHiscolnum(getgxTv_SdtSDTReoperados_Hiscolnum());
      struct.setHistipcol(getgxTv_SdtSDTReoperados_Histipcol());
      struct.setHisnomcli(getgxTv_SdtSDTReoperados_Hisnomcli());
      struct.setHisnumcli(getgxTv_SdtSDTReoperados_Hisnumcli());
      struct.setHisbarkgm(getgxTv_SdtSDTReoperados_Hisbarkgm());
      struct.setHisbarmtr(getgxTv_SdtSDTReoperados_Hisbarmtr());
      struct.setHisnumpie(getgxTv_SdtSDTReoperados_Hisnumpie());
      struct.setHisopetur(getgxTv_SdtSDTReoperados_Hisopetur());
      struct.setHisopecod(getgxTv_SdtSDTReoperados_Hisopecod());
      struct.setHisusu(getgxTv_SdtSDTReoperados_Hisusu());
      struct.setHisadeobs(getgxTv_SdtSDTReoperados_Hisadeobs());
      struct.setHisadesn(getgxTv_SdtSDTReoperados_Hisadesn());
      struct.setHisaccot(getgxTv_SdtSDTReoperados_Hisaccot());
      struct.setHisacco(getgxTv_SdtSDTReoperados_Hisacco());
      struct.setHisadeacct(getgxTv_SdtSDTReoperados_Hisadeacct());
      struct.setHisadeacco(getgxTv_SdtSDTReoperados_Hisadeacco());
      struct.setHisreotn(getgxTv_SdtSDTReoperados_Hisreotn());
      return struct ;
   }

   protected byte gxTv_SdtSDTReoperados_N ;
   protected byte gxTv_SdtSDTReoperados_Hisreofec_N ;
   protected byte gxTv_SdtSDTReoperados_Histipcol ;
   protected byte gxTv_SdtSDTReoperados_Hisopetur ;
   protected short gxTv_SdtSDTReoperados_Tipdefcod ;
   protected short gxTv_SdtSDTReoperados_Codcausa ;
   protected short gxTv_SdtSDTReoperados_Rps_cod ;
   protected short gxTv_SdtSDTReoperados_Histipart ;
   protected short gxTv_SdtSDTReoperados_Hisnumpie ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTReoperados_Clicod ;
   protected int gxTv_SdtSDTReoperados_Hiscolnum ;
   protected int gxTv_SdtSDTReoperados_Hisnumcli ;
   protected int gxTv_SdtSDTReoperados_Hisopecod ;
   protected int gxTv_SdtSDTReoperados_Hisreotn ;
   protected java.math.BigDecimal gxTv_SdtSDTReoperados_Hisbarkgm ;
   protected java.math.BigDecimal gxTv_SdtSDTReoperados_Hisbarmtr ;
   protected String gxTv_SdtSDTReoperados_Tiporeoperado ;
   protected String gxTv_SdtSDTReoperados_Hishorreo ;
   protected String gxTv_SdtSDTReoperados_Hisreohdr ;
   protected String gxTv_SdtSDTReoperados_Hisreolote ;
   protected String gxTv_SdtSDTReoperados_Tipdefdsc ;
   protected String gxTv_SdtSDTReoperados_Dsccausa ;
   protected String gxTv_SdtSDTReoperados_Rps_dsc ;
   protected String gxTv_SdtSDTReoperados_Maqcod ;
   protected String gxTv_SdtSDTReoperados_Maqdsc ;
   protected String gxTv_SdtSDTReoperados_Clinom ;
   protected String gxTv_SdtSDTReoperados_Hisbarser ;
   protected String gxTv_SdtSDTReoperados_Hisreodsc ;
   protected String gxTv_SdtSDTReoperados_Hiscolnom ;
   protected String gxTv_SdtSDTReoperados_Hisnomcli ;
   protected String gxTv_SdtSDTReoperados_Hisusu ;
   protected String gxTv_SdtSDTReoperados_Hisadesn ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDTReoperados_Hisreofec ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSDTReoperados_Hisadeobs ;
   protected String gxTv_SdtSDTReoperados_Hisaccot ;
   protected String gxTv_SdtSDTReoperados_Hisacco ;
   protected String gxTv_SdtSDTReoperados_Hisadeacct ;
   protected String gxTv_SdtSDTReoperados_Hisadeacco ;
}

