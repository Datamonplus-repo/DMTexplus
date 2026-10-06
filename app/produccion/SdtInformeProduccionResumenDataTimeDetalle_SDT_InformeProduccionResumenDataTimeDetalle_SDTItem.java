package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem extends GxUserType
{
   public SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem( )
   {
      this(  new ModelContext(SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem.class));
   }

   public SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem( ModelContext context )
   {
      super( context, "SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem");
   }

   public SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem( int remoteHandle ,
                                                                                                          ModelContext context )
   {
      super( remoteHandle, context, "SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem");
   }

   public SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem( StructSdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barnhdr") )
            {
               gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barnhdr = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Hisprolot") )
            {
               gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprolot = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Maqcod") )
            {
               gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Maqcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqDsc") )
            {
               gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Maqdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Hisprofec") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprofec = GXutil.nullDate() ;
                  gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprofec_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprofec_N = (byte)(0) ;
                  gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprofec = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Hisprolin") )
            {
               gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprolin = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Hisprokgr") )
            {
               gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprokgr = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Hispromtr") )
            {
               gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hispromtr = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Hispronpzs") )
            {
               gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hispronpzs = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Fase") )
            {
               gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fase = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Fasdsc") )
            {
               gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fasdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FasActTin") )
            {
               gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fasacttin = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barordlin") )
            {
               gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barordlin = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Hisprodti") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodti = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodti_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodti_N = (byte)(0) ;
                  gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodti = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Hisprodtf") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodtf = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodtf_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodtf_N = (byte)(0) ;
                  gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodtf = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Hisprotre2") )
            {
               gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprotre2 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Hisprotre3") )
            {
               gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprotre3 = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProEst") )
            {
               gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisproest = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FlagMarca") )
            {
               gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Flagmarca = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Minutos") )
            {
               gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Minutos = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Hisprotur") )
            {
               gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprotur = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Hisprof") )
            {
               gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprof = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Clicod") )
            {
               gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barser") )
            {
               gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barser = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barserdsc") )
            {
               gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barserdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Opecod") )
            {
               gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Opecod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OpeNom") )
            {
               gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Openom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Parcod") )
            {
               gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Parcod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Parcodnom") )
            {
               gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Parcodnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcolnom") )
            {
               gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barcolnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcolnum") )
            {
               gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barcolnum = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Bartipcol") )
            {
               gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Bartipcol = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarTipArt") )
            {
               gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Bartipart = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtdsc") )
            {
               gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Tipartdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MatCod") )
            {
               gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Matcod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MatDsc") )
            {
               gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Matdsc = oReader.getValue() ;
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
         sName = "InformeProduccionResumenDataTimeDetalle_SDT.InformeProduccionResumenDataTimeDetalle_SDTItem" ;
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
      oWriter.writeElement("Barnhdr", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barnhdr);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Hisprolot", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprolot);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Maqcod", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Maqcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqDsc", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Maqdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprofec)) && ( gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprofec_N == 1 ) )
      {
         oWriter.writeElement("Hisprofec", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprofec), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprofec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprofec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Hisprofec", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("Hisprolin", GXutil.trim( GXutil.str( gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprolin, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Hisprokgr", GXutil.trim( GXutil.strNoRound( gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprokgr, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Hispromtr", GXutil.trim( GXutil.strNoRound( gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hispromtr, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Hispronpzs", GXutil.trim( GXutil.str( gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hispronpzs, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Fase", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fase);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Fasdsc", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fasdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FasActTin", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fasacttin);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barordlin", GXutil.trim( GXutil.str( gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barordlin, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodti) && ( gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodti_N == 1 ) )
      {
         oWriter.writeElement("Hisprodti", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodti), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodti), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodti), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodti), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodti), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodti), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Hisprodti", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodtf) && ( gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodtf_N == 1 ) )
      {
         oWriter.writeElement("Hisprodtf", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Hisprodtf", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("Hisprotre2", GXutil.trim( GXutil.str( gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprotre2, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Hisprotre3", GXutil.trim( GXutil.strNoRound( gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprotre3, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProEst", GXutil.trim( GXutil.str( gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisproest, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FlagMarca", GXutil.trim( GXutil.str( gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Flagmarca, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Minutos", GXutil.trim( GXutil.str( gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Minutos, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Hisprotur", GXutil.trim( GXutil.str( gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprotur, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Hisprof", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprof);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Clicod", GXutil.trim( GXutil.str( gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNom", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barser", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barser);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barserdsc", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barserdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Opecod", GXutil.trim( GXutil.str( gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Opecod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("OpeNom", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Openom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Parcod", GXutil.trim( GXutil.str( gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Parcod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Parcodnom", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Parcodnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcolnom", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barcolnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcolnum", GXutil.trim( GXutil.str( gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barcolnum, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Bartipcol", GXutil.trim( GXutil.str( gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Bartipcol, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarTipArt", GXutil.trim( GXutil.str( gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Bartipart, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipArtdsc", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Tipartdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MatCod", GXutil.trim( GXutil.str( gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Matcod, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MatDsc", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Matdsc);
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
      AddObjectProperty("Barnhdr", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barnhdr, false, false);
      AddObjectProperty("Hisprolot", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprolot, false, false);
      AddObjectProperty("Maqcod", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Maqcod, false, false);
      AddObjectProperty("MaqDsc", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Maqdsc, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprofec), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprofec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprofec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("Hisprofec", sDateCnv, false, false);
      AddObjectProperty("Hisprolin", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprolin, false, false);
      AddObjectProperty("Hisprokgr", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprokgr, false, false);
      AddObjectProperty("Hispromtr", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hispromtr, false, false);
      AddObjectProperty("Hispronpzs", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hispronpzs, false, false);
      AddObjectProperty("Fase", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fase, false, false);
      AddObjectProperty("Fasdsc", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fasdsc, false, false);
      AddObjectProperty("FasActTin", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fasacttin, false, false);
      AddObjectProperty("Barordlin", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barordlin, false, false);
      datetime_STZ = gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodti ;
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
      AddObjectProperty("Hisprodti", sDateCnv, false, false);
      datetime_STZ = gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodtf ;
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
      AddObjectProperty("Hisprodtf", sDateCnv, false, false);
      AddObjectProperty("Hisprotre2", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprotre2, false, false);
      AddObjectProperty("Hisprotre3", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprotre3, false, false);
      AddObjectProperty("HisProEst", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisproest, false, false);
      AddObjectProperty("FlagMarca", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Flagmarca, false, false);
      AddObjectProperty("Minutos", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Minutos, false, false);
      AddObjectProperty("Hisprotur", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprotur, false, false);
      AddObjectProperty("Hisprof", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprof, false, false);
      AddObjectProperty("Clicod", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Clicod, false, false);
      AddObjectProperty("CliNom", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Clinom, false, false);
      AddObjectProperty("Barser", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barser, false, false);
      AddObjectProperty("Barserdsc", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barserdsc, false, false);
      AddObjectProperty("Opecod", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Opecod, false, false);
      AddObjectProperty("OpeNom", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Openom, false, false);
      AddObjectProperty("Parcod", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Parcod, false, false);
      AddObjectProperty("Parcodnom", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Parcodnom, false, false);
      AddObjectProperty("Barcolnom", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barcolnom, false, false);
      AddObjectProperty("Barcolnum", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barcolnum, false, false);
      AddObjectProperty("Bartipcol", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Bartipcol, false, false);
      AddObjectProperty("BarTipArt", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Bartipart, false, false);
      AddObjectProperty("TipArtdsc", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Tipartdsc, false, false);
      AddObjectProperty("MatCod", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Matcod, false, false);
      AddObjectProperty("MatDsc", gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Matdsc, false, false);
   }

   public String getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barnhdr( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barnhdr ;
   }

   public void setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barnhdr( String value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barnhdr = value ;
   }

   public String getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprolot( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprolot ;
   }

   public void setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprolot( String value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprolot = value ;
   }

   public String getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Maqcod( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Maqcod ;
   }

   public void setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Maqcod( String value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Maqcod = value ;
   }

   public String getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Maqdsc( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Maqdsc ;
   }

   public void setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Maqdsc( String value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Maqdsc = value ;
   }

   public java.util.Date getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprofec( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprofec ;
   }

   public void setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprofec( java.util.Date value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprofec_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprofec = value ;
   }

   public int getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprolin( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprolin ;
   }

   public void setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprolin( int value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprolin = value ;
   }

   public java.math.BigDecimal getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprokgr( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprokgr ;
   }

   public void setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprokgr( java.math.BigDecimal value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprokgr = value ;
   }

   public java.math.BigDecimal getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hispromtr( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hispromtr ;
   }

   public void setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hispromtr( java.math.BigDecimal value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hispromtr = value ;
   }

   public short getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hispronpzs( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hispronpzs ;
   }

   public void setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hispronpzs( short value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hispronpzs = value ;
   }

   public String getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fase( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fase ;
   }

   public void setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fase( String value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fase = value ;
   }

   public String getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fasdsc( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fasdsc ;
   }

   public void setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fasdsc( String value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fasdsc = value ;
   }

   public String getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fasacttin( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fasacttin ;
   }

   public void setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fasacttin( String value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fasacttin = value ;
   }

   public short getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barordlin( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barordlin ;
   }

   public void setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barordlin( short value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barordlin = value ;
   }

   public java.util.Date getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodti( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodti ;
   }

   public void setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodti( java.util.Date value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodti_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodti = value ;
   }

   public java.util.Date getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodtf( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodtf ;
   }

   public void setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodtf( java.util.Date value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodtf_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodtf = value ;
   }

   public short getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprotre2( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprotre2 ;
   }

   public void setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprotre2( short value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprotre2 = value ;
   }

   public java.math.BigDecimal getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprotre3( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprotre3 ;
   }

   public void setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprotre3( java.math.BigDecimal value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprotre3 = value ;
   }

   public byte getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisproest( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisproest ;
   }

   public void setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisproest( byte value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisproest = value ;
   }

   public byte getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Flagmarca( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Flagmarca ;
   }

   public void setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Flagmarca( byte value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Flagmarca = value ;
   }

   public int getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Minutos( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Minutos ;
   }

   public void setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Minutos( int value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Minutos = value ;
   }

   public byte getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprotur( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprotur ;
   }

   public void setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprotur( byte value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprotur = value ;
   }

   public String getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprof( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprof ;
   }

   public void setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprof( String value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprof = value ;
   }

   public int getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Clicod( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Clicod ;
   }

   public void setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Clicod( int value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Clicod = value ;
   }

   public String getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Clinom( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Clinom ;
   }

   public void setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Clinom( String value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Clinom = value ;
   }

   public String getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barser( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barser ;
   }

   public void setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barser( String value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barser = value ;
   }

   public String getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barserdsc( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barserdsc ;
   }

   public void setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barserdsc( String value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barserdsc = value ;
   }

   public int getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Opecod( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Opecod ;
   }

   public void setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Opecod( int value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Opecod = value ;
   }

   public String getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Openom( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Openom ;
   }

   public void setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Openom( String value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Openom = value ;
   }

   public short getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Parcod( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Parcod ;
   }

   public void setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Parcod( short value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Parcod = value ;
   }

   public String getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Parcodnom( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Parcodnom ;
   }

   public void setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Parcodnom( String value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Parcodnom = value ;
   }

   public String getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barcolnom( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barcolnom ;
   }

   public void setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barcolnom( String value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barcolnom = value ;
   }

   public int getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barcolnum( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barcolnum ;
   }

   public void setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barcolnum( int value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barcolnum = value ;
   }

   public byte getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Bartipcol( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Bartipcol ;
   }

   public void setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Bartipcol( byte value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Bartipcol = value ;
   }

   public short getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Bartipart( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Bartipart ;
   }

   public void setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Bartipart( short value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Bartipart = value ;
   }

   public String getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Tipartdsc( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Tipartdsc ;
   }

   public void setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Tipartdsc( String value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Tipartdsc = value ;
   }

   public short getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Matcod( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Matcod ;
   }

   public void setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Matcod( short value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Matcod = value ;
   }

   public String getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Matdsc( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Matdsc ;
   }

   public void setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Matdsc( String value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Matdsc = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barnhdr = "" ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(1) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprolot = "" ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Maqcod = "" ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Maqdsc = "" ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprofec = GXutil.nullDate() ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprofec_N = (byte)(1) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprokgr = DecimalUtil.ZERO ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hispromtr = DecimalUtil.ZERO ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fase = "" ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fasdsc = "" ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fasacttin = "" ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodti = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodti_N = (byte)(1) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodtf = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodtf_N = (byte)(1) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprotre3 = DecimalUtil.ZERO ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprof = "" ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Clinom = "" ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barser = "" ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barserdsc = "" ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Openom = "" ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Parcodnom = "" ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barcolnom = "" ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Tipartdsc = "" ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Matdsc = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N ;
   }

   public app.produccion.SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem Clone( )
   {
      return (app.produccion.SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem)(clone()) ;
   }

   public void setStruct( app.produccion.StructSdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem struct )
   {
      setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barnhdr(struct.getBarnhdr());
      setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprolot(struct.getHisprolot());
      setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Maqcod(struct.getMaqcod());
      setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Maqdsc(struct.getMaqdsc());
      if ( struct.gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprofec_N == 0 )
      {
         setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprofec(struct.getHisprofec());
      }
      setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprolin(struct.getHisprolin());
      setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprokgr(struct.getHisprokgr());
      setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hispromtr(struct.getHispromtr());
      setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hispronpzs(struct.getHispronpzs());
      setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fase(struct.getFase());
      setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fasdsc(struct.getFasdsc());
      setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fasacttin(struct.getFasacttin());
      setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barordlin(struct.getBarordlin());
      if ( struct.gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodti_N == 0 )
      {
         setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodti(struct.getHisprodti());
      }
      if ( struct.gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodtf_N == 0 )
      {
         setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodtf(struct.getHisprodtf());
      }
      setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprotre2(struct.getHisprotre2());
      setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprotre3(struct.getHisprotre3());
      setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisproest(struct.getHisproest());
      setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Flagmarca(struct.getFlagmarca());
      setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Minutos(struct.getMinutos());
      setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprotur(struct.getHisprotur());
      setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprof(struct.getHisprof());
      setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Clicod(struct.getClicod());
      setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Clinom(struct.getClinom());
      setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barser(struct.getBarser());
      setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barserdsc(struct.getBarserdsc());
      setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Opecod(struct.getOpecod());
      setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Openom(struct.getOpenom());
      setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Parcod(struct.getParcod());
      setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Parcodnom(struct.getParcodnom());
      setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barcolnom(struct.getBarcolnom());
      setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barcolnum(struct.getBarcolnum());
      setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Bartipcol(struct.getBartipcol());
      setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Bartipart(struct.getBartipart());
      setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Tipartdsc(struct.getTipartdsc());
      setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Matcod(struct.getMatcod());
      setgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Matdsc(struct.getMatdsc());
   }

   @SuppressWarnings("unchecked")
   public app.produccion.StructSdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem getStruct( )
   {
      app.produccion.StructSdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem struct = new app.produccion.StructSdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem ();
      struct.setBarnhdr(getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barnhdr());
      struct.setHisprolot(getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprolot());
      struct.setMaqcod(getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Maqcod());
      struct.setMaqdsc(getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Maqdsc());
      if ( gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprofec_N == 0 )
      {
         struct.setHisprofec(getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprofec());
      }
      struct.setHisprolin(getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprolin());
      struct.setHisprokgr(getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprokgr());
      struct.setHispromtr(getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hispromtr());
      struct.setHispronpzs(getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hispronpzs());
      struct.setFase(getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fase());
      struct.setFasdsc(getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fasdsc());
      struct.setFasacttin(getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fasacttin());
      struct.setBarordlin(getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barordlin());
      if ( gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodti_N == 0 )
      {
         struct.setHisprodti(getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodti());
      }
      if ( gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodtf_N == 0 )
      {
         struct.setHisprodtf(getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodtf());
      }
      struct.setHisprotre2(getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprotre2());
      struct.setHisprotre3(getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprotre3());
      struct.setHisproest(getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisproest());
      struct.setFlagmarca(getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Flagmarca());
      struct.setMinutos(getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Minutos());
      struct.setHisprotur(getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprotur());
      struct.setHisprof(getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprof());
      struct.setClicod(getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Clicod());
      struct.setClinom(getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Clinom());
      struct.setBarser(getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barser());
      struct.setBarserdsc(getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barserdsc());
      struct.setOpecod(getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Opecod());
      struct.setOpenom(getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Openom());
      struct.setParcod(getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Parcod());
      struct.setParcodnom(getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Parcodnom());
      struct.setBarcolnom(getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barcolnom());
      struct.setBarcolnum(getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barcolnum());
      struct.setBartipcol(getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Bartipcol());
      struct.setBartipart(getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Bartipart());
      struct.setTipartdsc(getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Tipartdsc());
      struct.setMatcod(getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Matcod());
      struct.setMatdsc(getgxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Matdsc());
      return struct ;
   }

   protected byte gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N ;
   protected byte gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprofec_N ;
   protected byte gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodti_N ;
   protected byte gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodtf_N ;
   protected byte gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisproest ;
   protected byte gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Flagmarca ;
   protected byte gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprotur ;
   protected byte gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Bartipcol ;
   protected short gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hispronpzs ;
   protected short gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barordlin ;
   protected short gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprotre2 ;
   protected short gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Parcod ;
   protected short gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Bartipart ;
   protected short gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Matcod ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprolin ;
   protected int gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Minutos ;
   protected int gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Clicod ;
   protected int gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Opecod ;
   protected int gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barcolnum ;
   protected java.math.BigDecimal gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprokgr ;
   protected java.math.BigDecimal gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hispromtr ;
   protected java.math.BigDecimal gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprotre3 ;
   protected String gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barnhdr ;
   protected String gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprolot ;
   protected String gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Maqcod ;
   protected String gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Maqdsc ;
   protected String gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fase ;
   protected String gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fasdsc ;
   protected String gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fasacttin ;
   protected String gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprof ;
   protected String gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Clinom ;
   protected String gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barser ;
   protected String gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barserdsc ;
   protected String gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Openom ;
   protected String gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Parcodnom ;
   protected String gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barcolnom ;
   protected String gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Tipartdsc ;
   protected String gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Matdsc ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodti ;
   protected java.util.Date gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodtf ;
   protected java.util.Date datetime_STZ ;
   protected java.util.Date gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprofec ;
   protected boolean readElement ;
   protected boolean formatError ;
}

