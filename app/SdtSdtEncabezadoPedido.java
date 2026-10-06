package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSdtEncabezadoPedido extends GxUserType
{
   public SdtSdtEncabezadoPedido( )
   {
      this(  new ModelContext(SdtSdtEncabezadoPedido.class));
   }

   public SdtSdtEncabezadoPedido( ModelContext context )
   {
      super( context, "SdtSdtEncabezadoPedido");
   }

   public SdtSdtEncabezadoPedido( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle, context, "SdtSdtEncabezadoPedido");
   }

   public SdtSdtEncabezadoPedido( StructSdtSdtEncabezadoPedido struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliCod") )
            {
               gxTv_SdtSdtEncabezadoPedido_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisEncCli") )
            {
               gxTv_SdtSdtEncabezadoPedido_Disenccli = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisFec") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSdtEncabezadoPedido_Disfec = GXutil.nullDate() ;
                  gxTv_SdtSdtEncabezadoPedido_Disfec_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSdtEncabezadoPedido_Disfec_N = (byte)(0) ;
                  gxTv_SdtSdtEncabezadoPedido_Disfec = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisFecCli") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSdtEncabezadoPedido_Disfeccli = GXutil.nullDate() ;
                  gxTv_SdtSdtEncabezadoPedido_Disfeccli_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSdtEncabezadoPedido_Disfeccli_N = (byte)(0) ;
                  gxTv_SdtSdtEncabezadoPedido_Disfeccli = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisFecEnt") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSdtEncabezadoPedido_Disfecent = GXutil.nullDate() ;
                  gxTv_SdtSdtEncabezadoPedido_Disfecent_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSdtEncabezadoPedido_Disfecent_N = (byte)(0) ;
                  gxTv_SdtSdtEncabezadoPedido_Disfecent = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRReo") )
            {
               gxTv_SdtSdtEncabezadoPedido_Albrreo = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisPla") )
            {
               gxTv_SdtSdtEncabezadoPedido_Displa = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Observaciones") )
            {
               gxTv_SdtSdtEncabezadoPedido_Observaciones = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisColNom") )
            {
               gxTv_SdtSdtEncabezadoPedido_Discolnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisColNum") )
            {
               gxTv_SdtSdtEncabezadoPedido_Discolnum = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisTipCol") )
            {
               gxTv_SdtSdtEncabezadoPedido_Distipcol = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisObs") )
            {
               gxTv_SdtSdtEncabezadoPedido_Disobs = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisNomCli") )
            {
               gxTv_SdtSdtEncabezadoPedido_Disnomcli = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisNumCli") )
            {
               gxTv_SdtSdtEncabezadoPedido_Disnumcli = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Cod_Idtx") )
            {
               gxTv_SdtSdtEncabezadoPedido_Cod_idtx = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Nxt_modelo") )
            {
               gxTv_SdtSdtEncabezadoPedido_Nxt_modelo = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Nxt_statio") )
            {
               gxTv_SdtSdtEncabezadoPedido_Nxt_statio = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisExp") )
            {
               gxTv_SdtSdtEncabezadoPedido_Disexp = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Nxt_artcli") )
            {
               gxTv_SdtSdtEncabezadoPedido_Nxt_artcli = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisItem3") )
            {
               gxTv_SdtSdtEncabezadoPedido_Disitem3 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisPart") )
            {
               gxTv_SdtSdtEncabezadoPedido_Dispart = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisNormId01") )
            {
               gxTv_SdtSdtEncabezadoPedido_Disnormid01 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisNormSt01") )
            {
               gxTv_SdtSdtEncabezadoPedido_Disnormst01 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisNormID02") )
            {
               gxTv_SdtSdtEncabezadoPedido_Disnormid02 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisNormSt02") )
            {
               gxTv_SdtSdtEncabezadoPedido_Disnormst02 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisNormID03") )
            {
               gxTv_SdtSdtEncabezadoPedido_Disnormid03 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisNormSt03") )
            {
               gxTv_SdtSdtEncabezadoPedido_Disnormst03 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisNormID04") )
            {
               gxTv_SdtSdtEncabezadoPedido_Disnormid04 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisNormSt04") )
            {
               gxTv_SdtSdtEncabezadoPedido_Disnormst04 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisNormID05") )
            {
               gxTv_SdtSdtEncabezadoPedido_Disnormid05 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisNormSt05") )
            {
               gxTv_SdtSdtEncabezadoPedido_Disnormst05 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ProceCod") )
            {
               gxTv_SdtSdtEncabezadoPedido_Procecod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisOrdComp") )
            {
               gxTv_SdtSdtEncabezadoPedido_Disordcomp = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisRec") )
            {
               gxTv_SdtSdtEncabezadoPedido_Disrec = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisDest") )
            {
               gxTv_SdtSdtEncabezadoPedido_Disdest = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisDes") )
            {
               gxTv_SdtSdtEncabezadoPedido_Disdes = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisTipDis") )
            {
               gxTv_SdtSdtEncabezadoPedido_Distipdis = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PriCod") )
            {
               gxTv_SdtSdtEncabezadoPedido_Pricod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisEst") )
            {
               gxTv_SdtSdtEncabezadoPedido_Disest = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArticuloPedido") )
            {
               if ( gxTv_SdtSdtEncabezadoPedido_Articulopedido == null )
               {
                  gxTv_SdtSdtEncabezadoPedido_Articulopedido = new GXBaseCollection<app.SdtSdtArticuloPedido>(app.SdtSdtArticuloPedido.class, "SdtArticuloPedido", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSdtEncabezadoPedido_Articulopedido.readxmlcollection(oReader, "ArticuloPedido", "Item") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "ArticuloPedido") )
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
         sName = "SdtEncabezadoPedido" ;
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
      oWriter.writeElement("CliCod", GXutil.trim( GXutil.str( gxTv_SdtSdtEncabezadoPedido_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisEncCli", gxTv_SdtSdtEncabezadoPedido_Disenccli);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSdtEncabezadoPedido_Disfec)) && ( gxTv_SdtSdtEncabezadoPedido_Disfec_N == 1 ) )
      {
         oWriter.writeElement("DisFec", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSdtEncabezadoPedido_Disfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSdtEncabezadoPedido_Disfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSdtEncabezadoPedido_Disfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("DisFec", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSdtEncabezadoPedido_Disfeccli)) && ( gxTv_SdtSdtEncabezadoPedido_Disfeccli_N == 1 ) )
      {
         oWriter.writeElement("DisFecCli", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSdtEncabezadoPedido_Disfeccli), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSdtEncabezadoPedido_Disfeccli), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSdtEncabezadoPedido_Disfeccli), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("DisFecCli", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSdtEncabezadoPedido_Disfecent)) && ( gxTv_SdtSdtEncabezadoPedido_Disfecent_N == 1 ) )
      {
         oWriter.writeElement("DisFecEnt", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSdtEncabezadoPedido_Disfecent), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSdtEncabezadoPedido_Disfecent), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSdtEncabezadoPedido_Disfecent), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("DisFecEnt", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("AlbRReo", gxTv_SdtSdtEncabezadoPedido_Albrreo);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisPla", gxTv_SdtSdtEncabezadoPedido_Displa);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Observaciones", gxTv_SdtSdtEncabezadoPedido_Observaciones);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisColNom", gxTv_SdtSdtEncabezadoPedido_Discolnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisColNum", GXutil.trim( GXutil.str( gxTv_SdtSdtEncabezadoPedido_Discolnum, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisTipCol", GXutil.trim( GXutil.str( gxTv_SdtSdtEncabezadoPedido_Distipcol, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisObs", gxTv_SdtSdtEncabezadoPedido_Disobs);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisNomCli", gxTv_SdtSdtEncabezadoPedido_Disnomcli);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisNumCli", GXutil.trim( GXutil.str( gxTv_SdtSdtEncabezadoPedido_Disnumcli, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Cod_Idtx", gxTv_SdtSdtEncabezadoPedido_Cod_idtx);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Nxt_modelo", gxTv_SdtSdtEncabezadoPedido_Nxt_modelo);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Nxt_statio", gxTv_SdtSdtEncabezadoPedido_Nxt_statio);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisExp", gxTv_SdtSdtEncabezadoPedido_Disexp);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Nxt_artcli", gxTv_SdtSdtEncabezadoPedido_Nxt_artcli);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisItem3", gxTv_SdtSdtEncabezadoPedido_Disitem3);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisPart", GXutil.trim( GXutil.str( gxTv_SdtSdtEncabezadoPedido_Dispart, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisNormId01", gxTv_SdtSdtEncabezadoPedido_Disnormid01);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisNormSt01", gxTv_SdtSdtEncabezadoPedido_Disnormst01);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisNormID02", gxTv_SdtSdtEncabezadoPedido_Disnormid02);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisNormSt02", gxTv_SdtSdtEncabezadoPedido_Disnormst02);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisNormID03", gxTv_SdtSdtEncabezadoPedido_Disnormid03);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisNormSt03", gxTv_SdtSdtEncabezadoPedido_Disnormst03);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisNormID04", gxTv_SdtSdtEncabezadoPedido_Disnormid04);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisNormSt04", gxTv_SdtSdtEncabezadoPedido_Disnormst04);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisNormID05", gxTv_SdtSdtEncabezadoPedido_Disnormid05);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisNormSt05", gxTv_SdtSdtEncabezadoPedido_Disnormst05);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ProceCod", GXutil.trim( GXutil.str( gxTv_SdtSdtEncabezadoPedido_Procecod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisOrdComp", gxTv_SdtSdtEncabezadoPedido_Disordcomp);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisRec", gxTv_SdtSdtEncabezadoPedido_Disrec);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisDest", gxTv_SdtSdtEncabezadoPedido_Disdest);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisDes", gxTv_SdtSdtEncabezadoPedido_Disdes);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisTipDis", gxTv_SdtSdtEncabezadoPedido_Distipdis);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PriCod", gxTv_SdtSdtEncabezadoPedido_Pricod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisEst", GXutil.trim( GXutil.str( gxTv_SdtSdtEncabezadoPedido_Disest, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtSdtEncabezadoPedido_Articulopedido != null )
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
         gxTv_SdtSdtEncabezadoPedido_Articulopedido.writexmlcollection(oWriter, "ArticuloPedido", sNameSpace1, "Item", sNameSpace1);
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
      AddObjectProperty("CliCod", gxTv_SdtSdtEncabezadoPedido_Clicod, false, false);
      AddObjectProperty("DisEncCli", gxTv_SdtSdtEncabezadoPedido_Disenccli, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSdtEncabezadoPedido_Disfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSdtEncabezadoPedido_Disfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSdtEncabezadoPedido_Disfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("DisFec", sDateCnv, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSdtEncabezadoPedido_Disfeccli), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSdtEncabezadoPedido_Disfeccli), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSdtEncabezadoPedido_Disfeccli), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("DisFecCli", sDateCnv, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSdtEncabezadoPedido_Disfecent), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSdtEncabezadoPedido_Disfecent), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSdtEncabezadoPedido_Disfecent), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("DisFecEnt", sDateCnv, false, false);
      AddObjectProperty("AlbRReo", gxTv_SdtSdtEncabezadoPedido_Albrreo, false, false);
      AddObjectProperty("DisPla", gxTv_SdtSdtEncabezadoPedido_Displa, false, false);
      AddObjectProperty("Observaciones", gxTv_SdtSdtEncabezadoPedido_Observaciones, false, false);
      AddObjectProperty("DisColNom", gxTv_SdtSdtEncabezadoPedido_Discolnom, false, false);
      AddObjectProperty("DisColNum", gxTv_SdtSdtEncabezadoPedido_Discolnum, false, false);
      AddObjectProperty("DisTipCol", gxTv_SdtSdtEncabezadoPedido_Distipcol, false, false);
      AddObjectProperty("DisObs", gxTv_SdtSdtEncabezadoPedido_Disobs, false, false);
      AddObjectProperty("DisNomCli", gxTv_SdtSdtEncabezadoPedido_Disnomcli, false, false);
      AddObjectProperty("DisNumCli", gxTv_SdtSdtEncabezadoPedido_Disnumcli, false, false);
      AddObjectProperty("Cod_Idtx", gxTv_SdtSdtEncabezadoPedido_Cod_idtx, false, false);
      AddObjectProperty("Nxt_modelo", gxTv_SdtSdtEncabezadoPedido_Nxt_modelo, false, false);
      AddObjectProperty("Nxt_statio", gxTv_SdtSdtEncabezadoPedido_Nxt_statio, false, false);
      AddObjectProperty("DisExp", gxTv_SdtSdtEncabezadoPedido_Disexp, false, false);
      AddObjectProperty("Nxt_artcli", gxTv_SdtSdtEncabezadoPedido_Nxt_artcli, false, false);
      AddObjectProperty("DisItem3", gxTv_SdtSdtEncabezadoPedido_Disitem3, false, false);
      AddObjectProperty("DisPart", gxTv_SdtSdtEncabezadoPedido_Dispart, false, false);
      AddObjectProperty("DisNormId01", gxTv_SdtSdtEncabezadoPedido_Disnormid01, false, false);
      AddObjectProperty("DisNormSt01", gxTv_SdtSdtEncabezadoPedido_Disnormst01, false, false);
      AddObjectProperty("DisNormID02", gxTv_SdtSdtEncabezadoPedido_Disnormid02, false, false);
      AddObjectProperty("DisNormSt02", gxTv_SdtSdtEncabezadoPedido_Disnormst02, false, false);
      AddObjectProperty("DisNormID03", gxTv_SdtSdtEncabezadoPedido_Disnormid03, false, false);
      AddObjectProperty("DisNormSt03", gxTv_SdtSdtEncabezadoPedido_Disnormst03, false, false);
      AddObjectProperty("DisNormID04", gxTv_SdtSdtEncabezadoPedido_Disnormid04, false, false);
      AddObjectProperty("DisNormSt04", gxTv_SdtSdtEncabezadoPedido_Disnormst04, false, false);
      AddObjectProperty("DisNormID05", gxTv_SdtSdtEncabezadoPedido_Disnormid05, false, false);
      AddObjectProperty("DisNormSt05", gxTv_SdtSdtEncabezadoPedido_Disnormst05, false, false);
      AddObjectProperty("ProceCod", gxTv_SdtSdtEncabezadoPedido_Procecod, false, false);
      AddObjectProperty("DisOrdComp", gxTv_SdtSdtEncabezadoPedido_Disordcomp, false, false);
      AddObjectProperty("DisRec", gxTv_SdtSdtEncabezadoPedido_Disrec, false, false);
      AddObjectProperty("DisDest", gxTv_SdtSdtEncabezadoPedido_Disdest, false, false);
      AddObjectProperty("DisDes", gxTv_SdtSdtEncabezadoPedido_Disdes, false, false);
      AddObjectProperty("DisTipDis", gxTv_SdtSdtEncabezadoPedido_Distipdis, false, false);
      AddObjectProperty("PriCod", gxTv_SdtSdtEncabezadoPedido_Pricod, false, false);
      AddObjectProperty("DisEst", gxTv_SdtSdtEncabezadoPedido_Disest, false, false);
      if ( gxTv_SdtSdtEncabezadoPedido_Articulopedido != null )
      {
         AddObjectProperty("ArticuloPedido", gxTv_SdtSdtEncabezadoPedido_Articulopedido, false, false);
      }
   }

   public int getgxTv_SdtSdtEncabezadoPedido_Clicod( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Clicod ;
   }

   public void setgxTv_SdtSdtEncabezadoPedido_Clicod( int value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Clicod = value ;
   }

   public String getgxTv_SdtSdtEncabezadoPedido_Disenccli( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Disenccli ;
   }

   public void setgxTv_SdtSdtEncabezadoPedido_Disenccli( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Disenccli = value ;
   }

   public java.util.Date getgxTv_SdtSdtEncabezadoPedido_Disfec( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Disfec ;
   }

   public void setgxTv_SdtSdtEncabezadoPedido_Disfec( java.util.Date value )
   {
      gxTv_SdtSdtEncabezadoPedido_Disfec_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Disfec = value ;
   }

   public java.util.Date getgxTv_SdtSdtEncabezadoPedido_Disfeccli( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Disfeccli ;
   }

   public void setgxTv_SdtSdtEncabezadoPedido_Disfeccli( java.util.Date value )
   {
      gxTv_SdtSdtEncabezadoPedido_Disfeccli_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Disfeccli = value ;
   }

   public java.util.Date getgxTv_SdtSdtEncabezadoPedido_Disfecent( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Disfecent ;
   }

   public void setgxTv_SdtSdtEncabezadoPedido_Disfecent( java.util.Date value )
   {
      gxTv_SdtSdtEncabezadoPedido_Disfecent_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Disfecent = value ;
   }

   public String getgxTv_SdtSdtEncabezadoPedido_Albrreo( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Albrreo ;
   }

   public void setgxTv_SdtSdtEncabezadoPedido_Albrreo( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Albrreo = value ;
   }

   public String getgxTv_SdtSdtEncabezadoPedido_Displa( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Displa ;
   }

   public void setgxTv_SdtSdtEncabezadoPedido_Displa( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Displa = value ;
   }

   public String getgxTv_SdtSdtEncabezadoPedido_Observaciones( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Observaciones ;
   }

   public void setgxTv_SdtSdtEncabezadoPedido_Observaciones( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Observaciones = value ;
   }

   public String getgxTv_SdtSdtEncabezadoPedido_Discolnom( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Discolnom ;
   }

   public void setgxTv_SdtSdtEncabezadoPedido_Discolnom( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Discolnom = value ;
   }

   public int getgxTv_SdtSdtEncabezadoPedido_Discolnum( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Discolnum ;
   }

   public void setgxTv_SdtSdtEncabezadoPedido_Discolnum( int value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Discolnum = value ;
   }

   public byte getgxTv_SdtSdtEncabezadoPedido_Distipcol( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Distipcol ;
   }

   public void setgxTv_SdtSdtEncabezadoPedido_Distipcol( byte value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Distipcol = value ;
   }

   public String getgxTv_SdtSdtEncabezadoPedido_Disobs( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Disobs ;
   }

   public void setgxTv_SdtSdtEncabezadoPedido_Disobs( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Disobs = value ;
   }

   public String getgxTv_SdtSdtEncabezadoPedido_Disnomcli( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Disnomcli ;
   }

   public void setgxTv_SdtSdtEncabezadoPedido_Disnomcli( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Disnomcli = value ;
   }

   public int getgxTv_SdtSdtEncabezadoPedido_Disnumcli( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Disnumcli ;
   }

   public void setgxTv_SdtSdtEncabezadoPedido_Disnumcli( int value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Disnumcli = value ;
   }

   public String getgxTv_SdtSdtEncabezadoPedido_Cod_idtx( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Cod_idtx ;
   }

   public void setgxTv_SdtSdtEncabezadoPedido_Cod_idtx( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Cod_idtx = value ;
   }

   public String getgxTv_SdtSdtEncabezadoPedido_Nxt_modelo( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Nxt_modelo ;
   }

   public void setgxTv_SdtSdtEncabezadoPedido_Nxt_modelo( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Nxt_modelo = value ;
   }

   public String getgxTv_SdtSdtEncabezadoPedido_Nxt_statio( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Nxt_statio ;
   }

   public void setgxTv_SdtSdtEncabezadoPedido_Nxt_statio( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Nxt_statio = value ;
   }

   public String getgxTv_SdtSdtEncabezadoPedido_Disexp( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Disexp ;
   }

   public void setgxTv_SdtSdtEncabezadoPedido_Disexp( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Disexp = value ;
   }

   public String getgxTv_SdtSdtEncabezadoPedido_Nxt_artcli( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Nxt_artcli ;
   }

   public void setgxTv_SdtSdtEncabezadoPedido_Nxt_artcli( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Nxt_artcli = value ;
   }

   public String getgxTv_SdtSdtEncabezadoPedido_Disitem3( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Disitem3 ;
   }

   public void setgxTv_SdtSdtEncabezadoPedido_Disitem3( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Disitem3 = value ;
   }

   public short getgxTv_SdtSdtEncabezadoPedido_Dispart( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Dispart ;
   }

   public void setgxTv_SdtSdtEncabezadoPedido_Dispart( short value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Dispart = value ;
   }

   public String getgxTv_SdtSdtEncabezadoPedido_Disnormid01( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Disnormid01 ;
   }

   public void setgxTv_SdtSdtEncabezadoPedido_Disnormid01( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Disnormid01 = value ;
   }

   public String getgxTv_SdtSdtEncabezadoPedido_Disnormst01( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Disnormst01 ;
   }

   public void setgxTv_SdtSdtEncabezadoPedido_Disnormst01( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Disnormst01 = value ;
   }

   public String getgxTv_SdtSdtEncabezadoPedido_Disnormid02( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Disnormid02 ;
   }

   public void setgxTv_SdtSdtEncabezadoPedido_Disnormid02( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Disnormid02 = value ;
   }

   public String getgxTv_SdtSdtEncabezadoPedido_Disnormst02( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Disnormst02 ;
   }

   public void setgxTv_SdtSdtEncabezadoPedido_Disnormst02( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Disnormst02 = value ;
   }

   public String getgxTv_SdtSdtEncabezadoPedido_Disnormid03( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Disnormid03 ;
   }

   public void setgxTv_SdtSdtEncabezadoPedido_Disnormid03( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Disnormid03 = value ;
   }

   public String getgxTv_SdtSdtEncabezadoPedido_Disnormst03( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Disnormst03 ;
   }

   public void setgxTv_SdtSdtEncabezadoPedido_Disnormst03( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Disnormst03 = value ;
   }

   public String getgxTv_SdtSdtEncabezadoPedido_Disnormid04( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Disnormid04 ;
   }

   public void setgxTv_SdtSdtEncabezadoPedido_Disnormid04( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Disnormid04 = value ;
   }

   public String getgxTv_SdtSdtEncabezadoPedido_Disnormst04( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Disnormst04 ;
   }

   public void setgxTv_SdtSdtEncabezadoPedido_Disnormst04( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Disnormst04 = value ;
   }

   public String getgxTv_SdtSdtEncabezadoPedido_Disnormid05( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Disnormid05 ;
   }

   public void setgxTv_SdtSdtEncabezadoPedido_Disnormid05( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Disnormid05 = value ;
   }

   public String getgxTv_SdtSdtEncabezadoPedido_Disnormst05( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Disnormst05 ;
   }

   public void setgxTv_SdtSdtEncabezadoPedido_Disnormst05( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Disnormst05 = value ;
   }

   public short getgxTv_SdtSdtEncabezadoPedido_Procecod( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Procecod ;
   }

   public void setgxTv_SdtSdtEncabezadoPedido_Procecod( short value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Procecod = value ;
   }

   public String getgxTv_SdtSdtEncabezadoPedido_Disordcomp( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Disordcomp ;
   }

   public void setgxTv_SdtSdtEncabezadoPedido_Disordcomp( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Disordcomp = value ;
   }

   public String getgxTv_SdtSdtEncabezadoPedido_Disrec( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Disrec ;
   }

   public void setgxTv_SdtSdtEncabezadoPedido_Disrec( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Disrec = value ;
   }

   public String getgxTv_SdtSdtEncabezadoPedido_Disdest( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Disdest ;
   }

   public void setgxTv_SdtSdtEncabezadoPedido_Disdest( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Disdest = value ;
   }

   public String getgxTv_SdtSdtEncabezadoPedido_Disdes( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Disdes ;
   }

   public void setgxTv_SdtSdtEncabezadoPedido_Disdes( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Disdes = value ;
   }

   public String getgxTv_SdtSdtEncabezadoPedido_Distipdis( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Distipdis ;
   }

   public void setgxTv_SdtSdtEncabezadoPedido_Distipdis( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Distipdis = value ;
   }

   public String getgxTv_SdtSdtEncabezadoPedido_Pricod( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Pricod ;
   }

   public void setgxTv_SdtSdtEncabezadoPedido_Pricod( String value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Pricod = value ;
   }

   public byte getgxTv_SdtSdtEncabezadoPedido_Disest( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Disest ;
   }

   public void setgxTv_SdtSdtEncabezadoPedido_Disest( byte value )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Disest = value ;
   }

   public GXBaseCollection<app.SdtSdtArticuloPedido> getgxTv_SdtSdtEncabezadoPedido_Articulopedido( )
   {
      if ( gxTv_SdtSdtEncabezadoPedido_Articulopedido == null )
      {
         gxTv_SdtSdtEncabezadoPedido_Articulopedido = new GXBaseCollection<app.SdtSdtArticuloPedido>(app.SdtSdtArticuloPedido.class, "SdtArticuloPedido", "TexplusNET", remoteHandle);
      }
      gxTv_SdtSdtEncabezadoPedido_Articulopedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      return gxTv_SdtSdtEncabezadoPedido_Articulopedido ;
   }

   public void setgxTv_SdtSdtEncabezadoPedido_Articulopedido( GXBaseCollection<app.SdtSdtArticuloPedido> value )
   {
      gxTv_SdtSdtEncabezadoPedido_Articulopedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(0) ;
      gxTv_SdtSdtEncabezadoPedido_Articulopedido = value ;
   }

   public void setgxTv_SdtSdtEncabezadoPedido_Articulopedido_SetNull( )
   {
      gxTv_SdtSdtEncabezadoPedido_Articulopedido_N = (byte)(1) ;
      gxTv_SdtSdtEncabezadoPedido_Articulopedido = null ;
   }

   public boolean getgxTv_SdtSdtEncabezadoPedido_Articulopedido_IsNull( )
   {
      if ( gxTv_SdtSdtEncabezadoPedido_Articulopedido == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSdtEncabezadoPedido_Articulopedido_N( )
   {
      return gxTv_SdtSdtEncabezadoPedido_Articulopedido_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSdtEncabezadoPedido_N = (byte)(1) ;
      gxTv_SdtSdtEncabezadoPedido_Disenccli = "" ;
      gxTv_SdtSdtEncabezadoPedido_Disfec = GXutil.nullDate() ;
      gxTv_SdtSdtEncabezadoPedido_Disfec_N = (byte)(1) ;
      gxTv_SdtSdtEncabezadoPedido_Disfeccli = GXutil.nullDate() ;
      gxTv_SdtSdtEncabezadoPedido_Disfeccli_N = (byte)(1) ;
      gxTv_SdtSdtEncabezadoPedido_Disfecent = GXutil.nullDate() ;
      gxTv_SdtSdtEncabezadoPedido_Disfecent_N = (byte)(1) ;
      gxTv_SdtSdtEncabezadoPedido_Albrreo = "" ;
      gxTv_SdtSdtEncabezadoPedido_Displa = "" ;
      gxTv_SdtSdtEncabezadoPedido_Observaciones = "" ;
      gxTv_SdtSdtEncabezadoPedido_Discolnom = "" ;
      gxTv_SdtSdtEncabezadoPedido_Disobs = "" ;
      gxTv_SdtSdtEncabezadoPedido_Disnomcli = "" ;
      gxTv_SdtSdtEncabezadoPedido_Cod_idtx = "" ;
      gxTv_SdtSdtEncabezadoPedido_Nxt_modelo = "" ;
      gxTv_SdtSdtEncabezadoPedido_Nxt_statio = "" ;
      gxTv_SdtSdtEncabezadoPedido_Disexp = "" ;
      gxTv_SdtSdtEncabezadoPedido_Nxt_artcli = "" ;
      gxTv_SdtSdtEncabezadoPedido_Disitem3 = "" ;
      gxTv_SdtSdtEncabezadoPedido_Disnormid01 = "" ;
      gxTv_SdtSdtEncabezadoPedido_Disnormst01 = "" ;
      gxTv_SdtSdtEncabezadoPedido_Disnormid02 = "" ;
      gxTv_SdtSdtEncabezadoPedido_Disnormst02 = "" ;
      gxTv_SdtSdtEncabezadoPedido_Disnormid03 = "" ;
      gxTv_SdtSdtEncabezadoPedido_Disnormst03 = "" ;
      gxTv_SdtSdtEncabezadoPedido_Disnormid04 = "" ;
      gxTv_SdtSdtEncabezadoPedido_Disnormst04 = "" ;
      gxTv_SdtSdtEncabezadoPedido_Disnormid05 = "" ;
      gxTv_SdtSdtEncabezadoPedido_Disnormst05 = "" ;
      gxTv_SdtSdtEncabezadoPedido_Disordcomp = "" ;
      gxTv_SdtSdtEncabezadoPedido_Disrec = "" ;
      gxTv_SdtSdtEncabezadoPedido_Disdest = "" ;
      gxTv_SdtSdtEncabezadoPedido_Disdes = "" ;
      gxTv_SdtSdtEncabezadoPedido_Distipdis = "" ;
      gxTv_SdtSdtEncabezadoPedido_Pricod = "" ;
      gxTv_SdtSdtEncabezadoPedido_Articulopedido_N = (byte)(1) ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSdtEncabezadoPedido_N ;
   }

   public app.SdtSdtEncabezadoPedido Clone( )
   {
      return (app.SdtSdtEncabezadoPedido)(clone()) ;
   }

   public void setStruct( app.StructSdtSdtEncabezadoPedido struct )
   {
      setgxTv_SdtSdtEncabezadoPedido_Clicod(struct.getClicod());
      setgxTv_SdtSdtEncabezadoPedido_Disenccli(struct.getDisenccli());
      if ( struct.gxTv_SdtSdtEncabezadoPedido_Disfec_N == 0 )
      {
         setgxTv_SdtSdtEncabezadoPedido_Disfec(struct.getDisfec());
      }
      if ( struct.gxTv_SdtSdtEncabezadoPedido_Disfeccli_N == 0 )
      {
         setgxTv_SdtSdtEncabezadoPedido_Disfeccli(struct.getDisfeccli());
      }
      if ( struct.gxTv_SdtSdtEncabezadoPedido_Disfecent_N == 0 )
      {
         setgxTv_SdtSdtEncabezadoPedido_Disfecent(struct.getDisfecent());
      }
      setgxTv_SdtSdtEncabezadoPedido_Albrreo(struct.getAlbrreo());
      setgxTv_SdtSdtEncabezadoPedido_Displa(struct.getDispla());
      setgxTv_SdtSdtEncabezadoPedido_Observaciones(struct.getObservaciones());
      setgxTv_SdtSdtEncabezadoPedido_Discolnom(struct.getDiscolnom());
      setgxTv_SdtSdtEncabezadoPedido_Discolnum(struct.getDiscolnum());
      setgxTv_SdtSdtEncabezadoPedido_Distipcol(struct.getDistipcol());
      setgxTv_SdtSdtEncabezadoPedido_Disobs(struct.getDisobs());
      setgxTv_SdtSdtEncabezadoPedido_Disnomcli(struct.getDisnomcli());
      setgxTv_SdtSdtEncabezadoPedido_Disnumcli(struct.getDisnumcli());
      setgxTv_SdtSdtEncabezadoPedido_Cod_idtx(struct.getCod_idtx());
      setgxTv_SdtSdtEncabezadoPedido_Nxt_modelo(struct.getNxt_modelo());
      setgxTv_SdtSdtEncabezadoPedido_Nxt_statio(struct.getNxt_statio());
      setgxTv_SdtSdtEncabezadoPedido_Disexp(struct.getDisexp());
      setgxTv_SdtSdtEncabezadoPedido_Nxt_artcli(struct.getNxt_artcli());
      setgxTv_SdtSdtEncabezadoPedido_Disitem3(struct.getDisitem3());
      setgxTv_SdtSdtEncabezadoPedido_Dispart(struct.getDispart());
      setgxTv_SdtSdtEncabezadoPedido_Disnormid01(struct.getDisnormid01());
      setgxTv_SdtSdtEncabezadoPedido_Disnormst01(struct.getDisnormst01());
      setgxTv_SdtSdtEncabezadoPedido_Disnormid02(struct.getDisnormid02());
      setgxTv_SdtSdtEncabezadoPedido_Disnormst02(struct.getDisnormst02());
      setgxTv_SdtSdtEncabezadoPedido_Disnormid03(struct.getDisnormid03());
      setgxTv_SdtSdtEncabezadoPedido_Disnormst03(struct.getDisnormst03());
      setgxTv_SdtSdtEncabezadoPedido_Disnormid04(struct.getDisnormid04());
      setgxTv_SdtSdtEncabezadoPedido_Disnormst04(struct.getDisnormst04());
      setgxTv_SdtSdtEncabezadoPedido_Disnormid05(struct.getDisnormid05());
      setgxTv_SdtSdtEncabezadoPedido_Disnormst05(struct.getDisnormst05());
      setgxTv_SdtSdtEncabezadoPedido_Procecod(struct.getProcecod());
      setgxTv_SdtSdtEncabezadoPedido_Disordcomp(struct.getDisordcomp());
      setgxTv_SdtSdtEncabezadoPedido_Disrec(struct.getDisrec());
      setgxTv_SdtSdtEncabezadoPedido_Disdest(struct.getDisdest());
      setgxTv_SdtSdtEncabezadoPedido_Disdes(struct.getDisdes());
      setgxTv_SdtSdtEncabezadoPedido_Distipdis(struct.getDistipdis());
      setgxTv_SdtSdtEncabezadoPedido_Pricod(struct.getPricod());
      setgxTv_SdtSdtEncabezadoPedido_Disest(struct.getDisest());
      GXBaseCollection<app.SdtSdtArticuloPedido> gxTv_SdtSdtEncabezadoPedido_Articulopedido_aux = new GXBaseCollection<app.SdtSdtArticuloPedido>(app.SdtSdtArticuloPedido.class, "SdtArticuloPedido", "TexplusNET", remoteHandle);
      Vector<app.StructSdtSdtArticuloPedido> gxTv_SdtSdtEncabezadoPedido_Articulopedido_aux1 = struct.getArticulopedido();
      if (gxTv_SdtSdtEncabezadoPedido_Articulopedido_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtSdtEncabezadoPedido_Articulopedido_aux1.size(); i++)
         {
            gxTv_SdtSdtEncabezadoPedido_Articulopedido_aux.add(new app.SdtSdtArticuloPedido(gxTv_SdtSdtEncabezadoPedido_Articulopedido_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtSdtEncabezadoPedido_Articulopedido(gxTv_SdtSdtEncabezadoPedido_Articulopedido_aux);
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSdtEncabezadoPedido getStruct( )
   {
      app.StructSdtSdtEncabezadoPedido struct = new app.StructSdtSdtEncabezadoPedido ();
      struct.setClicod(getgxTv_SdtSdtEncabezadoPedido_Clicod());
      struct.setDisenccli(getgxTv_SdtSdtEncabezadoPedido_Disenccli());
      if ( gxTv_SdtSdtEncabezadoPedido_Disfec_N == 0 )
      {
         struct.setDisfec(getgxTv_SdtSdtEncabezadoPedido_Disfec());
      }
      if ( gxTv_SdtSdtEncabezadoPedido_Disfeccli_N == 0 )
      {
         struct.setDisfeccli(getgxTv_SdtSdtEncabezadoPedido_Disfeccli());
      }
      if ( gxTv_SdtSdtEncabezadoPedido_Disfecent_N == 0 )
      {
         struct.setDisfecent(getgxTv_SdtSdtEncabezadoPedido_Disfecent());
      }
      struct.setAlbrreo(getgxTv_SdtSdtEncabezadoPedido_Albrreo());
      struct.setDispla(getgxTv_SdtSdtEncabezadoPedido_Displa());
      struct.setObservaciones(getgxTv_SdtSdtEncabezadoPedido_Observaciones());
      struct.setDiscolnom(getgxTv_SdtSdtEncabezadoPedido_Discolnom());
      struct.setDiscolnum(getgxTv_SdtSdtEncabezadoPedido_Discolnum());
      struct.setDistipcol(getgxTv_SdtSdtEncabezadoPedido_Distipcol());
      struct.setDisobs(getgxTv_SdtSdtEncabezadoPedido_Disobs());
      struct.setDisnomcli(getgxTv_SdtSdtEncabezadoPedido_Disnomcli());
      struct.setDisnumcli(getgxTv_SdtSdtEncabezadoPedido_Disnumcli());
      struct.setCod_idtx(getgxTv_SdtSdtEncabezadoPedido_Cod_idtx());
      struct.setNxt_modelo(getgxTv_SdtSdtEncabezadoPedido_Nxt_modelo());
      struct.setNxt_statio(getgxTv_SdtSdtEncabezadoPedido_Nxt_statio());
      struct.setDisexp(getgxTv_SdtSdtEncabezadoPedido_Disexp());
      struct.setNxt_artcli(getgxTv_SdtSdtEncabezadoPedido_Nxt_artcli());
      struct.setDisitem3(getgxTv_SdtSdtEncabezadoPedido_Disitem3());
      struct.setDispart(getgxTv_SdtSdtEncabezadoPedido_Dispart());
      struct.setDisnormid01(getgxTv_SdtSdtEncabezadoPedido_Disnormid01());
      struct.setDisnormst01(getgxTv_SdtSdtEncabezadoPedido_Disnormst01());
      struct.setDisnormid02(getgxTv_SdtSdtEncabezadoPedido_Disnormid02());
      struct.setDisnormst02(getgxTv_SdtSdtEncabezadoPedido_Disnormst02());
      struct.setDisnormid03(getgxTv_SdtSdtEncabezadoPedido_Disnormid03());
      struct.setDisnormst03(getgxTv_SdtSdtEncabezadoPedido_Disnormst03());
      struct.setDisnormid04(getgxTv_SdtSdtEncabezadoPedido_Disnormid04());
      struct.setDisnormst04(getgxTv_SdtSdtEncabezadoPedido_Disnormst04());
      struct.setDisnormid05(getgxTv_SdtSdtEncabezadoPedido_Disnormid05());
      struct.setDisnormst05(getgxTv_SdtSdtEncabezadoPedido_Disnormst05());
      struct.setProcecod(getgxTv_SdtSdtEncabezadoPedido_Procecod());
      struct.setDisordcomp(getgxTv_SdtSdtEncabezadoPedido_Disordcomp());
      struct.setDisrec(getgxTv_SdtSdtEncabezadoPedido_Disrec());
      struct.setDisdest(getgxTv_SdtSdtEncabezadoPedido_Disdest());
      struct.setDisdes(getgxTv_SdtSdtEncabezadoPedido_Disdes());
      struct.setDistipdis(getgxTv_SdtSdtEncabezadoPedido_Distipdis());
      struct.setPricod(getgxTv_SdtSdtEncabezadoPedido_Pricod());
      struct.setDisest(getgxTv_SdtSdtEncabezadoPedido_Disest());
      struct.setArticulopedido(getgxTv_SdtSdtEncabezadoPedido_Articulopedido().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtSdtEncabezadoPedido_N ;
   protected byte gxTv_SdtSdtEncabezadoPedido_Disfec_N ;
   protected byte gxTv_SdtSdtEncabezadoPedido_Disfeccli_N ;
   protected byte gxTv_SdtSdtEncabezadoPedido_Disfecent_N ;
   protected byte gxTv_SdtSdtEncabezadoPedido_Distipcol ;
   protected byte gxTv_SdtSdtEncabezadoPedido_Disest ;
   protected byte gxTv_SdtSdtEncabezadoPedido_Articulopedido_N ;
   protected short gxTv_SdtSdtEncabezadoPedido_Dispart ;
   protected short gxTv_SdtSdtEncabezadoPedido_Procecod ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSdtEncabezadoPedido_Clicod ;
   protected int gxTv_SdtSdtEncabezadoPedido_Discolnum ;
   protected int gxTv_SdtSdtEncabezadoPedido_Disnumcli ;
   protected String gxTv_SdtSdtEncabezadoPedido_Disenccli ;
   protected String gxTv_SdtSdtEncabezadoPedido_Albrreo ;
   protected String gxTv_SdtSdtEncabezadoPedido_Displa ;
   protected String gxTv_SdtSdtEncabezadoPedido_Discolnom ;
   protected String gxTv_SdtSdtEncabezadoPedido_Disobs ;
   protected String gxTv_SdtSdtEncabezadoPedido_Disnomcli ;
   protected String gxTv_SdtSdtEncabezadoPedido_Cod_idtx ;
   protected String gxTv_SdtSdtEncabezadoPedido_Nxt_modelo ;
   protected String gxTv_SdtSdtEncabezadoPedido_Nxt_statio ;
   protected String gxTv_SdtSdtEncabezadoPedido_Disexp ;
   protected String gxTv_SdtSdtEncabezadoPedido_Nxt_artcli ;
   protected String gxTv_SdtSdtEncabezadoPedido_Disitem3 ;
   protected String gxTv_SdtSdtEncabezadoPedido_Disnormid01 ;
   protected String gxTv_SdtSdtEncabezadoPedido_Disnormst01 ;
   protected String gxTv_SdtSdtEncabezadoPedido_Disnormid02 ;
   protected String gxTv_SdtSdtEncabezadoPedido_Disnormst02 ;
   protected String gxTv_SdtSdtEncabezadoPedido_Disnormid03 ;
   protected String gxTv_SdtSdtEncabezadoPedido_Disnormst03 ;
   protected String gxTv_SdtSdtEncabezadoPedido_Disnormid04 ;
   protected String gxTv_SdtSdtEncabezadoPedido_Disnormst04 ;
   protected String gxTv_SdtSdtEncabezadoPedido_Disnormid05 ;
   protected String gxTv_SdtSdtEncabezadoPedido_Disnormst05 ;
   protected String gxTv_SdtSdtEncabezadoPedido_Disrec ;
   protected String gxTv_SdtSdtEncabezadoPedido_Disdest ;
   protected String gxTv_SdtSdtEncabezadoPedido_Disdes ;
   protected String gxTv_SdtSdtEncabezadoPedido_Distipdis ;
   protected String gxTv_SdtSdtEncabezadoPedido_Pricod ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSdtEncabezadoPedido_Disfec ;
   protected java.util.Date gxTv_SdtSdtEncabezadoPedido_Disfeccli ;
   protected java.util.Date gxTv_SdtSdtEncabezadoPedido_Disfecent ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSdtEncabezadoPedido_Observaciones ;
   protected String gxTv_SdtSdtEncabezadoPedido_Disordcomp ;
   protected GXBaseCollection<app.SdtSdtArticuloPedido> gxTv_SdtSdtEncabezadoPedido_Articulopedido_aux ;
   protected GXBaseCollection<app.SdtSdtArticuloPedido> gxTv_SdtSdtEncabezadoPedido_Articulopedido=null ;
}

