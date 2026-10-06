package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSalidasManualesProductos_Cabecera extends GxSilentTrnSdt
{
   public SdtSalidasManualesProductos_Cabecera( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtSalidasManualesProductos_Cabecera.class));
   }

   public SdtSalidasManualesProductos_Cabecera( int remoteHandle ,
                                                ModelContext context )
   {
      super( remoteHandle, context, "SdtSalidasManualesProductos_Cabecera");
      initialize( remoteHandle) ;
   }

   public SdtSalidasManualesProductos_Cabecera( int remoteHandle ,
                                                StructSdtSalidasManualesProductos_Cabecera struct )
   {
      this(remoteHandle);
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

   public void Load( String AV396EmprCod ,
                     int AV859CumCodCont )
   {
      IGxSilentTrn obj;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {AV396EmprCod,Integer.valueOf(AV859CumCodCont)});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"EmprCod", String.class}, new Object[]{"CumCodCont", int.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "StocksQuimicos\\SalidasManualesProductos_Cabecera");
      metadata.set("BT", "TXPCCUMCO");
      metadata.set("PK", "[ \"CumCodCont\" ]");
      metadata.set("PKAssigned", "[ \"CumCodCont\" ]");
      metadata.set("FKList", "[ { \"FK\":[ \"CcoCod\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"BarCod\",\"BarCodReo\",\"BarCodPar\" ],\"FKMap\":[  ] } ]");
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprCod") )
            {
               gxTv_SdtSalidasManualesProductos_Cabecera_Emprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CumCodCont") )
            {
               gxTv_SdtSalidasManualesProductos_Cabecera_Cumcodcont = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom") )
            {
               gxTv_SdtSalidasManualesProductos_Cabecera_Emprnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CumConFec") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CcoCod") )
            {
               gxTv_SdtSalidasManualesProductos_Cabecera_Ccocod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CumCCos") )
            {
               gxTv_SdtSalidasManualesProductos_Cabecera_Cumccos = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CumCCosD") )
            {
               gxTv_SdtSalidasManualesProductos_Cabecera_Cumccosd = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CumConTipo") )
            {
               gxTv_SdtSalidasManualesProductos_Cabecera_Cumcontipo = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CC_AlmCd") )
            {
               gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CC_AlmDc") )
            {
               gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almdc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarCod") )
            {
               gxTv_SdtSalidasManualesProductos_Cabecera_Barcod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarCodReo") )
            {
               gxTv_SdtSalidasManualesProductos_Cabecera_Barcodreo = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarCodPar") )
            {
               gxTv_SdtSalidasManualesProductos_Cabecera_Barcodpar = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtSalidasManualesProductos_Cabecera_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtSalidasManualesProductos_Cabecera_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprCod_Z") )
            {
               gxTv_SdtSalidasManualesProductos_Cabecera_Emprcod_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CumCodCont_Z") )
            {
               gxTv_SdtSalidasManualesProductos_Cabecera_Cumcodcont_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom_Z") )
            {
               gxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CumConFec_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec_Z = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec_Z = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CcoCod_Z") )
            {
               gxTv_SdtSalidasManualesProductos_Cabecera_Ccocod_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CumCCos_Z") )
            {
               gxTv_SdtSalidasManualesProductos_Cabecera_Cumccos_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CumCCosD_Z") )
            {
               gxTv_SdtSalidasManualesProductos_Cabecera_Cumccosd_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CumConTipo_Z") )
            {
               gxTv_SdtSalidasManualesProductos_Cabecera_Cumcontipo_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CC_AlmCd_Z") )
            {
               gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CC_AlmDc_Z") )
            {
               gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almdc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarCod_Z") )
            {
               gxTv_SdtSalidasManualesProductos_Cabecera_Barcod_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarCodReo_Z") )
            {
               gxTv_SdtSalidasManualesProductos_Cabecera_Barcodreo_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarCodPar_Z") )
            {
               gxTv_SdtSalidasManualesProductos_Cabecera_Barcodpar_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom_N") )
            {
               gxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CcoCod_N") )
            {
               gxTv_SdtSalidasManualesProductos_Cabecera_Ccocod_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CC_AlmCd_N") )
            {
               gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd_N = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "SalidasManualesProductos_Cabecera" ;
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
      oWriter.writeElement("EmprCod", gxTv_SdtSalidasManualesProductos_Cabecera_Emprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CumCodCont", GXutil.trim( GXutil.str( gxTv_SdtSalidasManualesProductos_Cabecera_Cumcodcont, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EmprNom", gxTv_SdtSalidasManualesProductos_Cabecera_Emprnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("CumConFec", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CcoCod", GXutil.trim( GXutil.str( gxTv_SdtSalidasManualesProductos_Cabecera_Ccocod, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CumCCos", GXutil.trim( GXutil.str( gxTv_SdtSalidasManualesProductos_Cabecera_Cumccos, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CumCCosD", gxTv_SdtSalidasManualesProductos_Cabecera_Cumccosd);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CumConTipo", GXutil.trim( GXutil.str( gxTv_SdtSalidasManualesProductos_Cabecera_Cumcontipo, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CC_AlmCd", GXutil.trim( GXutil.str( gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CC_AlmDc", gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almdc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarCod", GXutil.trim( GXutil.str( gxTv_SdtSalidasManualesProductos_Cabecera_Barcod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarCodReo", GXutil.trim( GXutil.str( gxTv_SdtSalidasManualesProductos_Cabecera_Barcodreo, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarCodPar", gxTv_SdtSalidasManualesProductos_Cabecera_Barcodpar);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", gxTv_SdtSalidasManualesProductos_Cabecera_Mode);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtSalidasManualesProductos_Cabecera_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprCod_Z", gxTv_SdtSalidasManualesProductos_Cabecera_Emprcod_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CumCodCont_Z", GXutil.trim( GXutil.str( gxTv_SdtSalidasManualesProductos_Cabecera_Cumcodcont_Z, 8, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprNom_Z", gxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("CumConFec_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CcoCod_Z", GXutil.trim( GXutil.str( gxTv_SdtSalidasManualesProductos_Cabecera_Ccocod_Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CumCCos_Z", GXutil.trim( GXutil.str( gxTv_SdtSalidasManualesProductos_Cabecera_Cumccos_Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CumCCosD_Z", gxTv_SdtSalidasManualesProductos_Cabecera_Cumccosd_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CumConTipo_Z", GXutil.trim( GXutil.str( gxTv_SdtSalidasManualesProductos_Cabecera_Cumcontipo_Z, 2, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CC_AlmCd_Z", GXutil.trim( GXutil.str( gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd_Z, 2, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CC_AlmDc_Z", gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almdc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("BarCod_Z", GXutil.trim( GXutil.str( gxTv_SdtSalidasManualesProductos_Cabecera_Barcod_Z, 8, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("BarCodReo_Z", GXutil.trim( GXutil.str( gxTv_SdtSalidasManualesProductos_Cabecera_Barcodreo_Z, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("BarCodPar_Z", gxTv_SdtSalidasManualesProductos_Cabecera_Barcodpar_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprNom_N", GXutil.trim( GXutil.str( gxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CcoCod_N", GXutil.trim( GXutil.str( gxTv_SdtSalidasManualesProductos_Cabecera_Ccocod_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CC_AlmCd_N", GXutil.trim( GXutil.str( gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd_N, 1, 0)));
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
      AddObjectProperty("EmprCod", gxTv_SdtSalidasManualesProductos_Cabecera_Emprcod, false, includeNonInitialized);
      AddObjectProperty("CumCodCont", gxTv_SdtSalidasManualesProductos_Cabecera_Cumcodcont, false, includeNonInitialized);
      AddObjectProperty("EmprNom", gxTv_SdtSalidasManualesProductos_Cabecera_Emprnom, false, includeNonInitialized);
      AddObjectProperty("EmprNom_N", gxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_N, false, includeNonInitialized);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("CumConFec", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("CcoCod", gxTv_SdtSalidasManualesProductos_Cabecera_Ccocod, false, includeNonInitialized);
      AddObjectProperty("CcoCod_N", gxTv_SdtSalidasManualesProductos_Cabecera_Ccocod_N, false, includeNonInitialized);
      AddObjectProperty("CumCCos", gxTv_SdtSalidasManualesProductos_Cabecera_Cumccos, false, includeNonInitialized);
      AddObjectProperty("CumCCosD", gxTv_SdtSalidasManualesProductos_Cabecera_Cumccosd, false, includeNonInitialized);
      AddObjectProperty("CumConTipo", gxTv_SdtSalidasManualesProductos_Cabecera_Cumcontipo, false, includeNonInitialized);
      AddObjectProperty("CC_AlmCd", gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd, false, includeNonInitialized);
      AddObjectProperty("CC_AlmCd_N", gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd_N, false, includeNonInitialized);
      AddObjectProperty("CC_AlmDc", gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almdc, false, includeNonInitialized);
      AddObjectProperty("BarCod", gxTv_SdtSalidasManualesProductos_Cabecera_Barcod, false, includeNonInitialized);
      AddObjectProperty("BarCodReo", gxTv_SdtSalidasManualesProductos_Cabecera_Barcodreo, false, includeNonInitialized);
      AddObjectProperty("BarCodPar", gxTv_SdtSalidasManualesProductos_Cabecera_Barcodpar, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtSalidasManualesProductos_Cabecera_Mode, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_SdtSalidasManualesProductos_Cabecera_Initialized, false, includeNonInitialized);
         AddObjectProperty("EmprCod_Z", gxTv_SdtSalidasManualesProductos_Cabecera_Emprcod_Z, false, includeNonInitialized);
         AddObjectProperty("CumCodCont_Z", gxTv_SdtSalidasManualesProductos_Cabecera_Cumcodcont_Z, false, includeNonInitialized);
         AddObjectProperty("EmprNom_Z", gxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_Z, false, includeNonInitialized);
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("CumConFec_Z", sDateCnv, false, includeNonInitialized);
         AddObjectProperty("CcoCod_Z", gxTv_SdtSalidasManualesProductos_Cabecera_Ccocod_Z, false, includeNonInitialized);
         AddObjectProperty("CumCCos_Z", gxTv_SdtSalidasManualesProductos_Cabecera_Cumccos_Z, false, includeNonInitialized);
         AddObjectProperty("CumCCosD_Z", gxTv_SdtSalidasManualesProductos_Cabecera_Cumccosd_Z, false, includeNonInitialized);
         AddObjectProperty("CumConTipo_Z", gxTv_SdtSalidasManualesProductos_Cabecera_Cumcontipo_Z, false, includeNonInitialized);
         AddObjectProperty("CC_AlmCd_Z", gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd_Z, false, includeNonInitialized);
         AddObjectProperty("CC_AlmDc_Z", gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almdc_Z, false, includeNonInitialized);
         AddObjectProperty("BarCod_Z", gxTv_SdtSalidasManualesProductos_Cabecera_Barcod_Z, false, includeNonInitialized);
         AddObjectProperty("BarCodReo_Z", gxTv_SdtSalidasManualesProductos_Cabecera_Barcodreo_Z, false, includeNonInitialized);
         AddObjectProperty("BarCodPar_Z", gxTv_SdtSalidasManualesProductos_Cabecera_Barcodpar_Z, false, includeNonInitialized);
         AddObjectProperty("EmprNom_N", gxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_N, false, includeNonInitialized);
         AddObjectProperty("CcoCod_N", gxTv_SdtSalidasManualesProductos_Cabecera_Ccocod_N, false, includeNonInitialized);
         AddObjectProperty("CC_AlmCd_N", gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd_N, false, includeNonInitialized);
      }
   }

   public void updateDirties( app.stocksquimicos.SdtSalidasManualesProductos_Cabecera sdt )
   {
      if ( sdt.IsDirty("EmprCod") )
      {
         gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
         gxTv_SdtSalidasManualesProductos_Cabecera_Emprcod = sdt.getgxTv_SdtSalidasManualesProductos_Cabecera_Emprcod() ;
      }
      if ( sdt.IsDirty("CumCodCont") )
      {
         gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
         gxTv_SdtSalidasManualesProductos_Cabecera_Cumcodcont = sdt.getgxTv_SdtSalidasManualesProductos_Cabecera_Cumcodcont() ;
      }
      if ( sdt.IsDirty("EmprNom") )
      {
         gxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_N = sdt.getgxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_N() ;
         gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
         gxTv_SdtSalidasManualesProductos_Cabecera_Emprnom = sdt.getgxTv_SdtSalidasManualesProductos_Cabecera_Emprnom() ;
      }
      if ( sdt.IsDirty("CumConFec") )
      {
         gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
         gxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec = sdt.getgxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec() ;
      }
      if ( sdt.IsDirty("CcoCod") )
      {
         gxTv_SdtSalidasManualesProductos_Cabecera_Ccocod_N = sdt.getgxTv_SdtSalidasManualesProductos_Cabecera_Ccocod_N() ;
         gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
         gxTv_SdtSalidasManualesProductos_Cabecera_Ccocod = sdt.getgxTv_SdtSalidasManualesProductos_Cabecera_Ccocod() ;
      }
      if ( sdt.IsDirty("CumCCos") )
      {
         gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
         gxTv_SdtSalidasManualesProductos_Cabecera_Cumccos = sdt.getgxTv_SdtSalidasManualesProductos_Cabecera_Cumccos() ;
      }
      if ( sdt.IsDirty("CumCCosD") )
      {
         gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
         gxTv_SdtSalidasManualesProductos_Cabecera_Cumccosd = sdt.getgxTv_SdtSalidasManualesProductos_Cabecera_Cumccosd() ;
      }
      if ( sdt.IsDirty("CumConTipo") )
      {
         gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
         gxTv_SdtSalidasManualesProductos_Cabecera_Cumcontipo = sdt.getgxTv_SdtSalidasManualesProductos_Cabecera_Cumcontipo() ;
      }
      if ( sdt.IsDirty("CC_AlmCd") )
      {
         gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd_N = sdt.getgxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd_N() ;
         gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
         gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd = sdt.getgxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd() ;
      }
      if ( sdt.IsDirty("CC_AlmDc") )
      {
         gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
         gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almdc = sdt.getgxTv_SdtSalidasManualesProductos_Cabecera_Cc_almdc() ;
      }
      if ( sdt.IsDirty("BarCod") )
      {
         gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
         gxTv_SdtSalidasManualesProductos_Cabecera_Barcod = sdt.getgxTv_SdtSalidasManualesProductos_Cabecera_Barcod() ;
      }
      if ( sdt.IsDirty("BarCodReo") )
      {
         gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
         gxTv_SdtSalidasManualesProductos_Cabecera_Barcodreo = sdt.getgxTv_SdtSalidasManualesProductos_Cabecera_Barcodreo() ;
      }
      if ( sdt.IsDirty("BarCodPar") )
      {
         gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
         gxTv_SdtSalidasManualesProductos_Cabecera_Barcodpar = sdt.getgxTv_SdtSalidasManualesProductos_Cabecera_Barcodpar() ;
      }
   }

   public String getgxTv_SdtSalidasManualesProductos_Cabecera_Emprcod( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Emprcod ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Emprcod( String value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      if ( GXutil.strcmp(gxTv_SdtSalidasManualesProductos_Cabecera_Emprcod, value) != 0 )
      {
         gxTv_SdtSalidasManualesProductos_Cabecera_Mode = "INS" ;
         this.setgxTv_SdtSalidasManualesProductos_Cabecera_Emprcod_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Cabecera_Cumcodcont_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Cabecera_Ccocod_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Cabecera_Cumccos_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Cabecera_Cumccosd_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Cabecera_Cumcontipo_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Cabecera_Cc_almdc_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Cabecera_Barcod_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Cabecera_Barcodreo_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Cabecera_Barcodpar_Z_SetNull( );
      }
      SetDirty("Emprcod");
      gxTv_SdtSalidasManualesProductos_Cabecera_Emprcod = value ;
   }

   public int getgxTv_SdtSalidasManualesProductos_Cabecera_Cumcodcont( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Cumcodcont ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Cumcodcont( int value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      if ( gxTv_SdtSalidasManualesProductos_Cabecera_Cumcodcont != value )
      {
         gxTv_SdtSalidasManualesProductos_Cabecera_Mode = "INS" ;
         this.setgxTv_SdtSalidasManualesProductos_Cabecera_Emprcod_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Cabecera_Cumcodcont_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Cabecera_Ccocod_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Cabecera_Cumccos_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Cabecera_Cumccosd_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Cabecera_Cumcontipo_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Cabecera_Cc_almdc_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Cabecera_Barcod_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Cabecera_Barcodreo_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Cabecera_Barcodpar_Z_SetNull( );
      }
      SetDirty("Cumcodcont");
      gxTv_SdtSalidasManualesProductos_Cabecera_Cumcodcont = value ;
   }

   public String getgxTv_SdtSalidasManualesProductos_Cabecera_Emprnom( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Emprnom ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Emprnom( String value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      SetDirty("Emprnom");
      gxTv_SdtSalidasManualesProductos_Cabecera_Emprnom = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_N = (byte)(1) ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Emprnom = "" ;
      SetDirty("Emprnom");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_IsNull( )
   {
      return (gxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_N==1) ;
   }

   public java.util.Date getgxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec( java.util.Date value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      SetDirty("Cumconfec");
      gxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec = value ;
   }

   public short getgxTv_SdtSalidasManualesProductos_Cabecera_Ccocod( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Ccocod ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Ccocod( short value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_Ccocod_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      SetDirty("Ccocod");
      gxTv_SdtSalidasManualesProductos_Cabecera_Ccocod = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Ccocod_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_Ccocod_N = (byte)(1) ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Ccocod = (short)(0) ;
      SetDirty("Ccocod");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Cabecera_Ccocod_IsNull( )
   {
      return (gxTv_SdtSalidasManualesProductos_Cabecera_Ccocod_N==1) ;
   }

   public short getgxTv_SdtSalidasManualesProductos_Cabecera_Cumccos( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Cumccos ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Cumccos( short value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      SetDirty("Cumccos");
      gxTv_SdtSalidasManualesProductos_Cabecera_Cumccos = value ;
   }

   public String getgxTv_SdtSalidasManualesProductos_Cabecera_Cumccosd( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Cumccosd ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Cumccosd( String value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      SetDirty("Cumccosd");
      gxTv_SdtSalidasManualesProductos_Cabecera_Cumccosd = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Cumccosd_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_Cumccosd = "" ;
      SetDirty("Cumccosd");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Cabecera_Cumccosd_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtSalidasManualesProductos_Cabecera_Cumcontipo( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Cumcontipo ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Cumcontipo( byte value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      SetDirty("Cumcontipo");
      gxTv_SdtSalidasManualesProductos_Cabecera_Cumcontipo = value ;
   }

   public byte getgxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd( byte value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      SetDirty("Cc_almcd");
      gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd_N = (byte)(1) ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd = (byte)(0) ;
      SetDirty("Cc_almcd");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd_IsNull( )
   {
      return (gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd_N==1) ;
   }

   public String getgxTv_SdtSalidasManualesProductos_Cabecera_Cc_almdc( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almdc ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Cc_almdc( String value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      SetDirty("Cc_almdc");
      gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almdc = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Cc_almdc_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almdc = "" ;
      SetDirty("Cc_almdc");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Cabecera_Cc_almdc_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtSalidasManualesProductos_Cabecera_Barcod( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Barcod ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Barcod( int value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      SetDirty("Barcod");
      gxTv_SdtSalidasManualesProductos_Cabecera_Barcod = value ;
   }

   public byte getgxTv_SdtSalidasManualesProductos_Cabecera_Barcodreo( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Barcodreo ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Barcodreo( byte value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      SetDirty("Barcodreo");
      gxTv_SdtSalidasManualesProductos_Cabecera_Barcodreo = value ;
   }

   public String getgxTv_SdtSalidasManualesProductos_Cabecera_Barcodpar( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Barcodpar ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Barcodpar( String value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      SetDirty("Barcodpar");
      gxTv_SdtSalidasManualesProductos_Cabecera_Barcodpar = value ;
   }

   public String getgxTv_SdtSalidasManualesProductos_Cabecera_Mode( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Mode ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Mode( String value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      SetDirty("Mode");
      gxTv_SdtSalidasManualesProductos_Cabecera_Mode = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Mode_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Cabecera_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtSalidasManualesProductos_Cabecera_Initialized( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Initialized ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Initialized( short value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      SetDirty("Initialized");
      gxTv_SdtSalidasManualesProductos_Cabecera_Initialized = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Initialized_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Cabecera_Initialized_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtSalidasManualesProductos_Cabecera_Emprcod_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Emprcod_Z ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Emprcod_Z( String value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      SetDirty("Emprcod_Z");
      gxTv_SdtSalidasManualesProductos_Cabecera_Emprcod_Z = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Emprcod_Z_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_Emprcod_Z = "" ;
      SetDirty("Emprcod_Z");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Cabecera_Emprcod_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtSalidasManualesProductos_Cabecera_Cumcodcont_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Cumcodcont_Z ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Cumcodcont_Z( int value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      SetDirty("Cumcodcont_Z");
      gxTv_SdtSalidasManualesProductos_Cabecera_Cumcodcont_Z = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Cumcodcont_Z_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_Cumcodcont_Z = 0 ;
      SetDirty("Cumcodcont_Z");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Cabecera_Cumcodcont_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_Z ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_Z( String value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      SetDirty("Emprnom_Z");
      gxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_Z = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_Z_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_Z = "" ;
      SetDirty("Emprnom_Z");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec_Z ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec_Z( java.util.Date value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      SetDirty("Cumconfec_Z");
      gxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec_Z = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec_Z_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec_Z = GXutil.nullDate() ;
      SetDirty("Cumconfec_Z");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtSalidasManualesProductos_Cabecera_Ccocod_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Ccocod_Z ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Ccocod_Z( short value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      SetDirty("Ccocod_Z");
      gxTv_SdtSalidasManualesProductos_Cabecera_Ccocod_Z = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Ccocod_Z_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_Ccocod_Z = (short)(0) ;
      SetDirty("Ccocod_Z");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Cabecera_Ccocod_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtSalidasManualesProductos_Cabecera_Cumccos_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Cumccos_Z ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Cumccos_Z( short value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      SetDirty("Cumccos_Z");
      gxTv_SdtSalidasManualesProductos_Cabecera_Cumccos_Z = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Cumccos_Z_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_Cumccos_Z = (short)(0) ;
      SetDirty("Cumccos_Z");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Cabecera_Cumccos_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtSalidasManualesProductos_Cabecera_Cumccosd_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Cumccosd_Z ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Cumccosd_Z( String value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      SetDirty("Cumccosd_Z");
      gxTv_SdtSalidasManualesProductos_Cabecera_Cumccosd_Z = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Cumccosd_Z_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_Cumccosd_Z = "" ;
      SetDirty("Cumccosd_Z");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Cabecera_Cumccosd_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtSalidasManualesProductos_Cabecera_Cumcontipo_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Cumcontipo_Z ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Cumcontipo_Z( byte value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      SetDirty("Cumcontipo_Z");
      gxTv_SdtSalidasManualesProductos_Cabecera_Cumcontipo_Z = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Cumcontipo_Z_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_Cumcontipo_Z = (byte)(0) ;
      SetDirty("Cumcontipo_Z");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Cabecera_Cumcontipo_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd_Z ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd_Z( byte value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      SetDirty("Cc_almcd_Z");
      gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd_Z = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd_Z_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd_Z = (byte)(0) ;
      SetDirty("Cc_almcd_Z");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtSalidasManualesProductos_Cabecera_Cc_almdc_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almdc_Z ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Cc_almdc_Z( String value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      SetDirty("Cc_almdc_Z");
      gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almdc_Z = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Cc_almdc_Z_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almdc_Z = "" ;
      SetDirty("Cc_almdc_Z");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Cabecera_Cc_almdc_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtSalidasManualesProductos_Cabecera_Barcod_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Barcod_Z ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Barcod_Z( int value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      SetDirty("Barcod_Z");
      gxTv_SdtSalidasManualesProductos_Cabecera_Barcod_Z = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Barcod_Z_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_Barcod_Z = 0 ;
      SetDirty("Barcod_Z");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Cabecera_Barcod_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtSalidasManualesProductos_Cabecera_Barcodreo_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Barcodreo_Z ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Barcodreo_Z( byte value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      SetDirty("Barcodreo_Z");
      gxTv_SdtSalidasManualesProductos_Cabecera_Barcodreo_Z = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Barcodreo_Z_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_Barcodreo_Z = (byte)(0) ;
      SetDirty("Barcodreo_Z");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Cabecera_Barcodreo_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtSalidasManualesProductos_Cabecera_Barcodpar_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Barcodpar_Z ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Barcodpar_Z( String value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      SetDirty("Barcodpar_Z");
      gxTv_SdtSalidasManualesProductos_Cabecera_Barcodpar_Z = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Barcodpar_Z_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_Barcodpar_Z = "" ;
      SetDirty("Barcodpar_Z");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Cabecera_Barcodpar_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_N( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_N ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_N( byte value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      SetDirty("Emprnom_N");
      gxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_N = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_N_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_N = (byte)(0) ;
      SetDirty("Emprnom_N");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtSalidasManualesProductos_Cabecera_Ccocod_N( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Ccocod_N ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Ccocod_N( byte value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      SetDirty("Ccocod_N");
      gxTv_SdtSalidasManualesProductos_Cabecera_Ccocod_N = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Ccocod_N_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_Ccocod_N = (byte)(0) ;
      SetDirty("Ccocod_N");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Cabecera_Ccocod_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd_N( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd_N ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd_N( byte value )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(0) ;
      SetDirty("Cc_almcd_N");
      gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd_N = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd_N_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd_N = (byte)(0) ;
      SetDirty("Cc_almcd_N");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      app.stocksquimicos.salidasmanualesproductos_cabecera_bc obj;
      obj = new app.stocksquimicos.salidasmanualesproductos_cabecera_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtSalidasManualesProductos_Cabecera_Emprcod = "" ;
      gxTv_SdtSalidasManualesProductos_Cabecera_N = (byte)(1) ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Emprnom = "" ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec = GXutil.nullDate() ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Cumccosd = "" ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almdc = "" ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Barcodpar = "" ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Mode = "" ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Emprcod_Z = "" ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_Z = "" ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec_Z = GXutil.nullDate() ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Cumccosd_Z = "" ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almdc_Z = "" ;
      gxTv_SdtSalidasManualesProductos_Cabecera_Barcodpar_Z = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSalidasManualesProductos_Cabecera_N ;
   }

   public app.stocksquimicos.SdtSalidasManualesProductos_Cabecera Clone( )
   {
      app.stocksquimicos.SdtSalidasManualesProductos_Cabecera sdt;
      app.stocksquimicos.salidasmanualesproductos_cabecera_bc obj;
      sdt = (app.stocksquimicos.SdtSalidasManualesProductos_Cabecera)(clone()) ;
      obj = (app.stocksquimicos.salidasmanualesproductos_cabecera_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( app.stocksquimicos.StructSdtSalidasManualesProductos_Cabecera struct )
   {
      setgxTv_SdtSalidasManualesProductos_Cabecera_Emprcod(struct.getEmprcod());
      setgxTv_SdtSalidasManualesProductos_Cabecera_Cumcodcont(struct.getCumcodcont());
      setgxTv_SdtSalidasManualesProductos_Cabecera_Emprnom(struct.getEmprnom());
      setgxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec(struct.getCumconfec());
      setgxTv_SdtSalidasManualesProductos_Cabecera_Ccocod(struct.getCcocod());
      setgxTv_SdtSalidasManualesProductos_Cabecera_Cumccos(struct.getCumccos());
      setgxTv_SdtSalidasManualesProductos_Cabecera_Cumccosd(struct.getCumccosd());
      setgxTv_SdtSalidasManualesProductos_Cabecera_Cumcontipo(struct.getCumcontipo());
      setgxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd(struct.getCc_almcd());
      setgxTv_SdtSalidasManualesProductos_Cabecera_Cc_almdc(struct.getCc_almdc());
      setgxTv_SdtSalidasManualesProductos_Cabecera_Barcod(struct.getBarcod());
      setgxTv_SdtSalidasManualesProductos_Cabecera_Barcodreo(struct.getBarcodreo());
      setgxTv_SdtSalidasManualesProductos_Cabecera_Barcodpar(struct.getBarcodpar());
      setgxTv_SdtSalidasManualesProductos_Cabecera_Mode(struct.getMode());
      setgxTv_SdtSalidasManualesProductos_Cabecera_Initialized(struct.getInitialized());
      setgxTv_SdtSalidasManualesProductos_Cabecera_Emprcod_Z(struct.getEmprcod_Z());
      setgxTv_SdtSalidasManualesProductos_Cabecera_Cumcodcont_Z(struct.getCumcodcont_Z());
      setgxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_Z(struct.getEmprnom_Z());
      setgxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec_Z(struct.getCumconfec_Z());
      setgxTv_SdtSalidasManualesProductos_Cabecera_Ccocod_Z(struct.getCcocod_Z());
      setgxTv_SdtSalidasManualesProductos_Cabecera_Cumccos_Z(struct.getCumccos_Z());
      setgxTv_SdtSalidasManualesProductos_Cabecera_Cumccosd_Z(struct.getCumccosd_Z());
      setgxTv_SdtSalidasManualesProductos_Cabecera_Cumcontipo_Z(struct.getCumcontipo_Z());
      setgxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd_Z(struct.getCc_almcd_Z());
      setgxTv_SdtSalidasManualesProductos_Cabecera_Cc_almdc_Z(struct.getCc_almdc_Z());
      setgxTv_SdtSalidasManualesProductos_Cabecera_Barcod_Z(struct.getBarcod_Z());
      setgxTv_SdtSalidasManualesProductos_Cabecera_Barcodreo_Z(struct.getBarcodreo_Z());
      setgxTv_SdtSalidasManualesProductos_Cabecera_Barcodpar_Z(struct.getBarcodpar_Z());
      setgxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_N(struct.getEmprnom_N());
      setgxTv_SdtSalidasManualesProductos_Cabecera_Ccocod_N(struct.getCcocod_N());
      setgxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd_N(struct.getCc_almcd_N());
   }

   @SuppressWarnings("unchecked")
   public app.stocksquimicos.StructSdtSalidasManualesProductos_Cabecera getStruct( )
   {
      app.stocksquimicos.StructSdtSalidasManualesProductos_Cabecera struct = new app.stocksquimicos.StructSdtSalidasManualesProductos_Cabecera ();
      struct.setEmprcod(getgxTv_SdtSalidasManualesProductos_Cabecera_Emprcod());
      struct.setCumcodcont(getgxTv_SdtSalidasManualesProductos_Cabecera_Cumcodcont());
      struct.setEmprnom(getgxTv_SdtSalidasManualesProductos_Cabecera_Emprnom());
      struct.setCumconfec(getgxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec());
      struct.setCcocod(getgxTv_SdtSalidasManualesProductos_Cabecera_Ccocod());
      struct.setCumccos(getgxTv_SdtSalidasManualesProductos_Cabecera_Cumccos());
      struct.setCumccosd(getgxTv_SdtSalidasManualesProductos_Cabecera_Cumccosd());
      struct.setCumcontipo(getgxTv_SdtSalidasManualesProductos_Cabecera_Cumcontipo());
      struct.setCc_almcd(getgxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd());
      struct.setCc_almdc(getgxTv_SdtSalidasManualesProductos_Cabecera_Cc_almdc());
      struct.setBarcod(getgxTv_SdtSalidasManualesProductos_Cabecera_Barcod());
      struct.setBarcodreo(getgxTv_SdtSalidasManualesProductos_Cabecera_Barcodreo());
      struct.setBarcodpar(getgxTv_SdtSalidasManualesProductos_Cabecera_Barcodpar());
      struct.setMode(getgxTv_SdtSalidasManualesProductos_Cabecera_Mode());
      struct.setInitialized(getgxTv_SdtSalidasManualesProductos_Cabecera_Initialized());
      struct.setEmprcod_Z(getgxTv_SdtSalidasManualesProductos_Cabecera_Emprcod_Z());
      struct.setCumcodcont_Z(getgxTv_SdtSalidasManualesProductos_Cabecera_Cumcodcont_Z());
      struct.setEmprnom_Z(getgxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_Z());
      struct.setCumconfec_Z(getgxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec_Z());
      struct.setCcocod_Z(getgxTv_SdtSalidasManualesProductos_Cabecera_Ccocod_Z());
      struct.setCumccos_Z(getgxTv_SdtSalidasManualesProductos_Cabecera_Cumccos_Z());
      struct.setCumccosd_Z(getgxTv_SdtSalidasManualesProductos_Cabecera_Cumccosd_Z());
      struct.setCumcontipo_Z(getgxTv_SdtSalidasManualesProductos_Cabecera_Cumcontipo_Z());
      struct.setCc_almcd_Z(getgxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd_Z());
      struct.setCc_almdc_Z(getgxTv_SdtSalidasManualesProductos_Cabecera_Cc_almdc_Z());
      struct.setBarcod_Z(getgxTv_SdtSalidasManualesProductos_Cabecera_Barcod_Z());
      struct.setBarcodreo_Z(getgxTv_SdtSalidasManualesProductos_Cabecera_Barcodreo_Z());
      struct.setBarcodpar_Z(getgxTv_SdtSalidasManualesProductos_Cabecera_Barcodpar_Z());
      struct.setEmprnom_N(getgxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_N());
      struct.setCcocod_N(getgxTv_SdtSalidasManualesProductos_Cabecera_Ccocod_N());
      struct.setCc_almcd_N(getgxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd_N());
      return struct ;
   }

   private byte gxTv_SdtSalidasManualesProductos_Cabecera_N ;
   private byte gxTv_SdtSalidasManualesProductos_Cabecera_Cumcontipo ;
   private byte gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd ;
   private byte gxTv_SdtSalidasManualesProductos_Cabecera_Barcodreo ;
   private byte gxTv_SdtSalidasManualesProductos_Cabecera_Cumcontipo_Z ;
   private byte gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd_Z ;
   private byte gxTv_SdtSalidasManualesProductos_Cabecera_Barcodreo_Z ;
   private byte gxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_N ;
   private byte gxTv_SdtSalidasManualesProductos_Cabecera_Ccocod_N ;
   private byte gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd_N ;
   private short gxTv_SdtSalidasManualesProductos_Cabecera_Ccocod ;
   private short gxTv_SdtSalidasManualesProductos_Cabecera_Cumccos ;
   private short gxTv_SdtSalidasManualesProductos_Cabecera_Initialized ;
   private short gxTv_SdtSalidasManualesProductos_Cabecera_Ccocod_Z ;
   private short gxTv_SdtSalidasManualesProductos_Cabecera_Cumccos_Z ;
   private short readOk ;
   private short nOutParmCount ;
   private int gxTv_SdtSalidasManualesProductos_Cabecera_Cumcodcont ;
   private int gxTv_SdtSalidasManualesProductos_Cabecera_Barcod ;
   private int gxTv_SdtSalidasManualesProductos_Cabecera_Cumcodcont_Z ;
   private int gxTv_SdtSalidasManualesProductos_Cabecera_Barcod_Z ;
   private String gxTv_SdtSalidasManualesProductos_Cabecera_Emprcod ;
   private String gxTv_SdtSalidasManualesProductos_Cabecera_Emprnom ;
   private String gxTv_SdtSalidasManualesProductos_Cabecera_Cumccosd ;
   private String gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almdc ;
   private String gxTv_SdtSalidasManualesProductos_Cabecera_Barcodpar ;
   private String gxTv_SdtSalidasManualesProductos_Cabecera_Mode ;
   private String gxTv_SdtSalidasManualesProductos_Cabecera_Emprcod_Z ;
   private String gxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_Z ;
   private String gxTv_SdtSalidasManualesProductos_Cabecera_Cumccosd_Z ;
   private String gxTv_SdtSalidasManualesProductos_Cabecera_Cc_almdc_Z ;
   private String gxTv_SdtSalidasManualesProductos_Cabecera_Barcodpar_Z ;
   private String sTagName ;
   private String sDateCnv ;
   private String sNumToPad ;
   private java.util.Date gxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec ;
   private java.util.Date gxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec_Z ;
   private boolean readElement ;
   private boolean formatError ;
}

