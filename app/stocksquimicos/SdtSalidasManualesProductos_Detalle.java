package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSalidasManualesProductos_Detalle extends GxSilentTrnSdt
{
   public SdtSalidasManualesProductos_Detalle( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtSalidasManualesProductos_Detalle.class));
   }

   public SdtSalidasManualesProductos_Detalle( int remoteHandle ,
                                               ModelContext context )
   {
      super( remoteHandle, context, "SdtSalidasManualesProductos_Detalle");
      initialize( remoteHandle) ;
   }

   public SdtSalidasManualesProductos_Detalle( int remoteHandle ,
                                               StructSdtSalidasManualesProductos_Detalle struct )
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
                     int AV859CumCodCont ,
                     String AV719PrdNum )
   {
      IGxSilentTrn obj;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {AV396EmprCod,Integer.valueOf(AV859CumCodCont),AV719PrdNum});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"EmprCod", String.class}, new Object[]{"CumCodCont", int.class}, new Object[]{"PrdNum", String.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "StocksQuimicos\\SalidasManualesProductos_Detalle");
      metadata.set("BT", "TXPLCUMCO");
      metadata.set("PK", "[ \"EmprCod\",\"CumCodCont\",\"PrdNum\" ]");
      metadata.set("FKList", "[ { \"FK\":[ \"EmprCod\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"CumCodCont\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"ForPrdUMe\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"PrdNum\" ],\"FKMap\":[  ] } ]");
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
               gxTv_SdtSalidasManualesProductos_Detalle_Emprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CumCodCont") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_Cumcodcont = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_Emprnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdNum") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_Prdnum = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdNom") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_Prdnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CumConCant") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_Cumconcant = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CumConCbis") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_Cumconcbis = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CumCosPro") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_Cumcospro = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdPreAct") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_Prdpreact = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdExiAlm") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_Prdexialm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdExiCC") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_Prdexicc = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdCanRes") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_Prdcanres = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdPreMed") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_Prdpremed = DecimalUtil.stringToDec( oReader.getValue()) ;
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
                  gxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
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
               gxTv_SdtSalidasManualesProductos_Detalle_Prdfaccon = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CumConLot") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_Cumconlot = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdValStk") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_Prdvalstk = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ForPrdUMe") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_Forprdume = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ForPrdDsc") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_Forprddsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CumUnidad") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_Cumunidad = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdComID") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_Prdcomid = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdLote") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_Prdlote = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CumUMed") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_Cumumed = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprCod_Z") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_Emprcod_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CumCodCont_Z") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_Cumcodcont_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom_Z") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_Emprnom_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdNum_Z") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_Prdnum_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdNom_Z") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_Prdnom_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CumConCant_Z") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_Cumconcant_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CumConCbis_Z") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_Cumconcbis_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CumCosPro_Z") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_Cumcospro_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdPreAct_Z") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_Prdpreact_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdExiAlm_Z") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_Prdexialm_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdExiCC_Z") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_Prdexicc_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdCanRes_Z") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_Prdcanres_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdPreMed_Z") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_Prdpremed_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UltFecCCs_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs_Z = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs_Z = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdFacCon_Z") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_Prdfaccon_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CumConLot_Z") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_Cumconlot_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdValStk_Z") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_Prdvalstk_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ForPrdUMe_Z") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_Forprdume_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ForPrdDsc_Z") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CumUnidad_Z") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_Cumunidad_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdComID_Z") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_Prdcomid_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdLote_Z") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_Prdlote_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CumUMed_Z") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_Cumumed_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom_N") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_Emprnom_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ForPrdDsc_N") )
            {
               gxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_N = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "SalidasManualesProductos_Detalle" ;
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
      oWriter.writeElement("EmprCod", gxTv_SdtSalidasManualesProductos_Detalle_Emprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CumCodCont", GXutil.trim( GXutil.str( gxTv_SdtSalidasManualesProductos_Detalle_Cumcodcont, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EmprNom", gxTv_SdtSalidasManualesProductos_Detalle_Emprnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdNum", gxTv_SdtSalidasManualesProductos_Detalle_Prdnum);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdNom", gxTv_SdtSalidasManualesProductos_Detalle_Prdnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CumConCant", GXutil.trim( GXutil.strNoRound( gxTv_SdtSalidasManualesProductos_Detalle_Cumconcant, 12, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CumConCbis", GXutil.trim( GXutil.strNoRound( gxTv_SdtSalidasManualesProductos_Detalle_Cumconcbis, 12, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CumCosPro", GXutil.trim( GXutil.strNoRound( gxTv_SdtSalidasManualesProductos_Detalle_Cumcospro, 10, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdPreAct", GXutil.trim( GXutil.strNoRound( gxTv_SdtSalidasManualesProductos_Detalle_Prdpreact, 14, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdExiAlm", GXutil.trim( GXutil.strNoRound( gxTv_SdtSalidasManualesProductos_Detalle_Prdexialm, 12, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdExiCC", GXutil.trim( GXutil.strNoRound( gxTv_SdtSalidasManualesProductos_Detalle_Prdexicc, 12, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdCanRes", GXutil.trim( GXutil.strNoRound( gxTv_SdtSalidasManualesProductos_Detalle_Prdcanres, 12, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdPreMed", GXutil.trim( GXutil.strNoRound( gxTv_SdtSalidasManualesProductos_Detalle_Prdpremed, 14, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("UltFecCCs", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdFacCon", GXutil.trim( GXutil.strNoRound( gxTv_SdtSalidasManualesProductos_Detalle_Prdfaccon, 7, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CumConLot", gxTv_SdtSalidasManualesProductos_Detalle_Cumconlot);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdValStk", GXutil.trim( GXutil.strNoRound( gxTv_SdtSalidasManualesProductos_Detalle_Prdvalstk, 11, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ForPrdUMe", GXutil.trim( GXutil.str( gxTv_SdtSalidasManualesProductos_Detalle_Forprdume, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ForPrdDsc", gxTv_SdtSalidasManualesProductos_Detalle_Forprddsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CumUnidad", GXutil.trim( GXutil.str( gxTv_SdtSalidasManualesProductos_Detalle_Cumunidad, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdComID", gxTv_SdtSalidasManualesProductos_Detalle_Prdcomid);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdLote", gxTv_SdtSalidasManualesProductos_Detalle_Prdlote);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CumUMed", GXutil.trim( GXutil.str( gxTv_SdtSalidasManualesProductos_Detalle_Cumumed, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", gxTv_SdtSalidasManualesProductos_Detalle_Mode);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtSalidasManualesProductos_Detalle_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprCod_Z", gxTv_SdtSalidasManualesProductos_Detalle_Emprcod_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CumCodCont_Z", GXutil.trim( GXutil.str( gxTv_SdtSalidasManualesProductos_Detalle_Cumcodcont_Z, 8, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprNom_Z", gxTv_SdtSalidasManualesProductos_Detalle_Emprnom_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdNum_Z", gxTv_SdtSalidasManualesProductos_Detalle_Prdnum_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdNom_Z", gxTv_SdtSalidasManualesProductos_Detalle_Prdnom_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CumConCant_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtSalidasManualesProductos_Detalle_Cumconcant_Z, 12, 4)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CumConCbis_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtSalidasManualesProductos_Detalle_Cumconcbis_Z, 12, 4)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CumCosPro_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtSalidasManualesProductos_Detalle_Cumcospro_Z, 10, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdPreAct_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtSalidasManualesProductos_Detalle_Prdpreact_Z, 14, 5)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdExiAlm_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtSalidasManualesProductos_Detalle_Prdexialm_Z, 12, 4)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdExiCC_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtSalidasManualesProductos_Detalle_Prdexicc_Z, 12, 4)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdCanRes_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtSalidasManualesProductos_Detalle_Prdcanres_Z, 12, 4)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdPreMed_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtSalidasManualesProductos_Detalle_Prdpremed_Z, 14, 5)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("UltFecCCs_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdFacCon_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtSalidasManualesProductos_Detalle_Prdfaccon_Z, 7, 4)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CumConLot_Z", gxTv_SdtSalidasManualesProductos_Detalle_Cumconlot_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdValStk_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtSalidasManualesProductos_Detalle_Prdvalstk_Z, 11, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ForPrdUMe_Z", GXutil.trim( GXutil.str( gxTv_SdtSalidasManualesProductos_Detalle_Forprdume_Z, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ForPrdDsc_Z", gxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CumUnidad_Z", GXutil.trim( GXutil.str( gxTv_SdtSalidasManualesProductos_Detalle_Cumunidad_Z, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdComID_Z", gxTv_SdtSalidasManualesProductos_Detalle_Prdcomid_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdLote_Z", gxTv_SdtSalidasManualesProductos_Detalle_Prdlote_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CumUMed_Z", GXutil.trim( GXutil.str( gxTv_SdtSalidasManualesProductos_Detalle_Cumumed_Z, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprNom_N", GXutil.trim( GXutil.str( gxTv_SdtSalidasManualesProductos_Detalle_Emprnom_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ForPrdDsc_N", GXutil.trim( GXutil.str( gxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_N, 1, 0)));
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
      AddObjectProperty("EmprCod", gxTv_SdtSalidasManualesProductos_Detalle_Emprcod, false, includeNonInitialized);
      AddObjectProperty("CumCodCont", gxTv_SdtSalidasManualesProductos_Detalle_Cumcodcont, false, includeNonInitialized);
      AddObjectProperty("EmprNom", gxTv_SdtSalidasManualesProductos_Detalle_Emprnom, false, includeNonInitialized);
      AddObjectProperty("EmprNom_N", gxTv_SdtSalidasManualesProductos_Detalle_Emprnom_N, false, includeNonInitialized);
      AddObjectProperty("PrdNum", gxTv_SdtSalidasManualesProductos_Detalle_Prdnum, false, includeNonInitialized);
      AddObjectProperty("PrdNom", gxTv_SdtSalidasManualesProductos_Detalle_Prdnom, false, includeNonInitialized);
      AddObjectProperty("CumConCant", gxTv_SdtSalidasManualesProductos_Detalle_Cumconcant, false, includeNonInitialized);
      AddObjectProperty("CumConCbis", gxTv_SdtSalidasManualesProductos_Detalle_Cumconcbis, false, includeNonInitialized);
      AddObjectProperty("CumCosPro", gxTv_SdtSalidasManualesProductos_Detalle_Cumcospro, false, includeNonInitialized);
      AddObjectProperty("PrdPreAct", gxTv_SdtSalidasManualesProductos_Detalle_Prdpreact, false, includeNonInitialized);
      AddObjectProperty("PrdExiAlm", gxTv_SdtSalidasManualesProductos_Detalle_Prdexialm, false, includeNonInitialized);
      AddObjectProperty("PrdExiCC", gxTv_SdtSalidasManualesProductos_Detalle_Prdexicc, false, includeNonInitialized);
      AddObjectProperty("PrdCanRes", gxTv_SdtSalidasManualesProductos_Detalle_Prdcanres, false, includeNonInitialized);
      AddObjectProperty("PrdPreMed", gxTv_SdtSalidasManualesProductos_Detalle_Prdpremed, false, includeNonInitialized);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("UltFecCCs", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("PrdFacCon", gxTv_SdtSalidasManualesProductos_Detalle_Prdfaccon, false, includeNonInitialized);
      AddObjectProperty("CumConLot", gxTv_SdtSalidasManualesProductos_Detalle_Cumconlot, false, includeNonInitialized);
      AddObjectProperty("PrdValStk", gxTv_SdtSalidasManualesProductos_Detalle_Prdvalstk, false, includeNonInitialized);
      AddObjectProperty("ForPrdUMe", gxTv_SdtSalidasManualesProductos_Detalle_Forprdume, false, includeNonInitialized);
      AddObjectProperty("ForPrdDsc", gxTv_SdtSalidasManualesProductos_Detalle_Forprddsc, false, includeNonInitialized);
      AddObjectProperty("ForPrdDsc_N", gxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_N, false, includeNonInitialized);
      AddObjectProperty("CumUnidad", gxTv_SdtSalidasManualesProductos_Detalle_Cumunidad, false, includeNonInitialized);
      AddObjectProperty("PrdComID", gxTv_SdtSalidasManualesProductos_Detalle_Prdcomid, false, includeNonInitialized);
      AddObjectProperty("PrdLote", gxTv_SdtSalidasManualesProductos_Detalle_Prdlote, false, includeNonInitialized);
      AddObjectProperty("CumUMed", gxTv_SdtSalidasManualesProductos_Detalle_Cumumed, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtSalidasManualesProductos_Detalle_Mode, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_SdtSalidasManualesProductos_Detalle_Initialized, false, includeNonInitialized);
         AddObjectProperty("EmprCod_Z", gxTv_SdtSalidasManualesProductos_Detalle_Emprcod_Z, false, includeNonInitialized);
         AddObjectProperty("CumCodCont_Z", gxTv_SdtSalidasManualesProductos_Detalle_Cumcodcont_Z, false, includeNonInitialized);
         AddObjectProperty("EmprNom_Z", gxTv_SdtSalidasManualesProductos_Detalle_Emprnom_Z, false, includeNonInitialized);
         AddObjectProperty("PrdNum_Z", gxTv_SdtSalidasManualesProductos_Detalle_Prdnum_Z, false, includeNonInitialized);
         AddObjectProperty("PrdNom_Z", gxTv_SdtSalidasManualesProductos_Detalle_Prdnom_Z, false, includeNonInitialized);
         AddObjectProperty("CumConCant_Z", gxTv_SdtSalidasManualesProductos_Detalle_Cumconcant_Z, false, includeNonInitialized);
         AddObjectProperty("CumConCbis_Z", gxTv_SdtSalidasManualesProductos_Detalle_Cumconcbis_Z, false, includeNonInitialized);
         AddObjectProperty("CumCosPro_Z", gxTv_SdtSalidasManualesProductos_Detalle_Cumcospro_Z, false, includeNonInitialized);
         AddObjectProperty("PrdPreAct_Z", gxTv_SdtSalidasManualesProductos_Detalle_Prdpreact_Z, false, includeNonInitialized);
         AddObjectProperty("PrdExiAlm_Z", gxTv_SdtSalidasManualesProductos_Detalle_Prdexialm_Z, false, includeNonInitialized);
         AddObjectProperty("PrdExiCC_Z", gxTv_SdtSalidasManualesProductos_Detalle_Prdexicc_Z, false, includeNonInitialized);
         AddObjectProperty("PrdCanRes_Z", gxTv_SdtSalidasManualesProductos_Detalle_Prdcanres_Z, false, includeNonInitialized);
         AddObjectProperty("PrdPreMed_Z", gxTv_SdtSalidasManualesProductos_Detalle_Prdpremed_Z, false, includeNonInitialized);
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("UltFecCCs_Z", sDateCnv, false, includeNonInitialized);
         AddObjectProperty("PrdFacCon_Z", gxTv_SdtSalidasManualesProductos_Detalle_Prdfaccon_Z, false, includeNonInitialized);
         AddObjectProperty("CumConLot_Z", gxTv_SdtSalidasManualesProductos_Detalle_Cumconlot_Z, false, includeNonInitialized);
         AddObjectProperty("PrdValStk_Z", gxTv_SdtSalidasManualesProductos_Detalle_Prdvalstk_Z, false, includeNonInitialized);
         AddObjectProperty("ForPrdUMe_Z", gxTv_SdtSalidasManualesProductos_Detalle_Forprdume_Z, false, includeNonInitialized);
         AddObjectProperty("ForPrdDsc_Z", gxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_Z, false, includeNonInitialized);
         AddObjectProperty("CumUnidad_Z", gxTv_SdtSalidasManualesProductos_Detalle_Cumunidad_Z, false, includeNonInitialized);
         AddObjectProperty("PrdComID_Z", gxTv_SdtSalidasManualesProductos_Detalle_Prdcomid_Z, false, includeNonInitialized);
         AddObjectProperty("PrdLote_Z", gxTv_SdtSalidasManualesProductos_Detalle_Prdlote_Z, false, includeNonInitialized);
         AddObjectProperty("CumUMed_Z", gxTv_SdtSalidasManualesProductos_Detalle_Cumumed_Z, false, includeNonInitialized);
         AddObjectProperty("EmprNom_N", gxTv_SdtSalidasManualesProductos_Detalle_Emprnom_N, false, includeNonInitialized);
         AddObjectProperty("ForPrdDsc_N", gxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_N, false, includeNonInitialized);
      }
   }

   public void updateDirties( app.stocksquimicos.SdtSalidasManualesProductos_Detalle sdt )
   {
      if ( sdt.IsDirty("EmprCod") )
      {
         gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
         gxTv_SdtSalidasManualesProductos_Detalle_Emprcod = sdt.getgxTv_SdtSalidasManualesProductos_Detalle_Emprcod() ;
      }
      if ( sdt.IsDirty("CumCodCont") )
      {
         gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
         gxTv_SdtSalidasManualesProductos_Detalle_Cumcodcont = sdt.getgxTv_SdtSalidasManualesProductos_Detalle_Cumcodcont() ;
      }
      if ( sdt.IsDirty("EmprNom") )
      {
         gxTv_SdtSalidasManualesProductos_Detalle_Emprnom_N = sdt.getgxTv_SdtSalidasManualesProductos_Detalle_Emprnom_N() ;
         gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
         gxTv_SdtSalidasManualesProductos_Detalle_Emprnom = sdt.getgxTv_SdtSalidasManualesProductos_Detalle_Emprnom() ;
      }
      if ( sdt.IsDirty("PrdNum") )
      {
         gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
         gxTv_SdtSalidasManualesProductos_Detalle_Prdnum = sdt.getgxTv_SdtSalidasManualesProductos_Detalle_Prdnum() ;
      }
      if ( sdt.IsDirty("PrdNom") )
      {
         gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
         gxTv_SdtSalidasManualesProductos_Detalle_Prdnom = sdt.getgxTv_SdtSalidasManualesProductos_Detalle_Prdnom() ;
      }
      if ( sdt.IsDirty("CumConCant") )
      {
         gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
         gxTv_SdtSalidasManualesProductos_Detalle_Cumconcant = sdt.getgxTv_SdtSalidasManualesProductos_Detalle_Cumconcant() ;
      }
      if ( sdt.IsDirty("CumConCbis") )
      {
         gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
         gxTv_SdtSalidasManualesProductos_Detalle_Cumconcbis = sdt.getgxTv_SdtSalidasManualesProductos_Detalle_Cumconcbis() ;
      }
      if ( sdt.IsDirty("CumCosPro") )
      {
         gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
         gxTv_SdtSalidasManualesProductos_Detalle_Cumcospro = sdt.getgxTv_SdtSalidasManualesProductos_Detalle_Cumcospro() ;
      }
      if ( sdt.IsDirty("PrdPreAct") )
      {
         gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
         gxTv_SdtSalidasManualesProductos_Detalle_Prdpreact = sdt.getgxTv_SdtSalidasManualesProductos_Detalle_Prdpreact() ;
      }
      if ( sdt.IsDirty("PrdExiAlm") )
      {
         gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
         gxTv_SdtSalidasManualesProductos_Detalle_Prdexialm = sdt.getgxTv_SdtSalidasManualesProductos_Detalle_Prdexialm() ;
      }
      if ( sdt.IsDirty("PrdExiCC") )
      {
         gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
         gxTv_SdtSalidasManualesProductos_Detalle_Prdexicc = sdt.getgxTv_SdtSalidasManualesProductos_Detalle_Prdexicc() ;
      }
      if ( sdt.IsDirty("PrdCanRes") )
      {
         gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
         gxTv_SdtSalidasManualesProductos_Detalle_Prdcanres = sdt.getgxTv_SdtSalidasManualesProductos_Detalle_Prdcanres() ;
      }
      if ( sdt.IsDirty("PrdPreMed") )
      {
         gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
         gxTv_SdtSalidasManualesProductos_Detalle_Prdpremed = sdt.getgxTv_SdtSalidasManualesProductos_Detalle_Prdpremed() ;
      }
      if ( sdt.IsDirty("UltFecCCs") )
      {
         gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
         gxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs = sdt.getgxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs() ;
      }
      if ( sdt.IsDirty("PrdFacCon") )
      {
         gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
         gxTv_SdtSalidasManualesProductos_Detalle_Prdfaccon = sdt.getgxTv_SdtSalidasManualesProductos_Detalle_Prdfaccon() ;
      }
      if ( sdt.IsDirty("CumConLot") )
      {
         gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
         gxTv_SdtSalidasManualesProductos_Detalle_Cumconlot = sdt.getgxTv_SdtSalidasManualesProductos_Detalle_Cumconlot() ;
      }
      if ( sdt.IsDirty("PrdValStk") )
      {
         gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
         gxTv_SdtSalidasManualesProductos_Detalle_Prdvalstk = sdt.getgxTv_SdtSalidasManualesProductos_Detalle_Prdvalstk() ;
      }
      if ( sdt.IsDirty("ForPrdUMe") )
      {
         gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
         gxTv_SdtSalidasManualesProductos_Detalle_Forprdume = sdt.getgxTv_SdtSalidasManualesProductos_Detalle_Forprdume() ;
      }
      if ( sdt.IsDirty("ForPrdDsc") )
      {
         gxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_N = sdt.getgxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_N() ;
         gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
         gxTv_SdtSalidasManualesProductos_Detalle_Forprddsc = sdt.getgxTv_SdtSalidasManualesProductos_Detalle_Forprddsc() ;
      }
      if ( sdt.IsDirty("CumUnidad") )
      {
         gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
         gxTv_SdtSalidasManualesProductos_Detalle_Cumunidad = sdt.getgxTv_SdtSalidasManualesProductos_Detalle_Cumunidad() ;
      }
      if ( sdt.IsDirty("PrdComID") )
      {
         gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
         gxTv_SdtSalidasManualesProductos_Detalle_Prdcomid = sdt.getgxTv_SdtSalidasManualesProductos_Detalle_Prdcomid() ;
      }
      if ( sdt.IsDirty("PrdLote") )
      {
         gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
         gxTv_SdtSalidasManualesProductos_Detalle_Prdlote = sdt.getgxTv_SdtSalidasManualesProductos_Detalle_Prdlote() ;
      }
      if ( sdt.IsDirty("CumUMed") )
      {
         gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
         gxTv_SdtSalidasManualesProductos_Detalle_Cumumed = sdt.getgxTv_SdtSalidasManualesProductos_Detalle_Cumumed() ;
      }
   }

   public String getgxTv_SdtSalidasManualesProductos_Detalle_Emprcod( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Emprcod ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Emprcod( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      if ( GXutil.strcmp(gxTv_SdtSalidasManualesProductos_Detalle_Emprcod, value) != 0 )
      {
         gxTv_SdtSalidasManualesProductos_Detalle_Mode = "INS" ;
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Emprcod_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Cumcodcont_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Emprnom_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Prdnum_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Prdnom_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Cumconcant_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Cumconcbis_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Cumcospro_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Prdpreact_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Prdexialm_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Prdexicc_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Prdcanres_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Prdpremed_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Prdfaccon_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Cumconlot_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Prdvalstk_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Forprdume_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Cumunidad_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Prdcomid_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Prdlote_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Cumumed_Z_SetNull( );
      }
      SetDirty("Emprcod");
      gxTv_SdtSalidasManualesProductos_Detalle_Emprcod = value ;
   }

   public int getgxTv_SdtSalidasManualesProductos_Detalle_Cumcodcont( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Cumcodcont ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Cumcodcont( int value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      if ( gxTv_SdtSalidasManualesProductos_Detalle_Cumcodcont != value )
      {
         gxTv_SdtSalidasManualesProductos_Detalle_Mode = "INS" ;
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Emprcod_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Cumcodcont_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Emprnom_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Prdnum_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Prdnom_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Cumconcant_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Cumconcbis_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Cumcospro_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Prdpreact_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Prdexialm_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Prdexicc_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Prdcanres_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Prdpremed_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Prdfaccon_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Cumconlot_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Prdvalstk_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Forprdume_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Cumunidad_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Prdcomid_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Prdlote_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Cumumed_Z_SetNull( );
      }
      SetDirty("Cumcodcont");
      gxTv_SdtSalidasManualesProductos_Detalle_Cumcodcont = value ;
   }

   public String getgxTv_SdtSalidasManualesProductos_Detalle_Emprnom( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Emprnom ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Emprnom( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_Emprnom_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      SetDirty("Emprnom");
      gxTv_SdtSalidasManualesProductos_Detalle_Emprnom = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Emprnom_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_Emprnom_N = (byte)(1) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Emprnom = "" ;
      SetDirty("Emprnom");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Detalle_Emprnom_IsNull( )
   {
      return (gxTv_SdtSalidasManualesProductos_Detalle_Emprnom_N==1) ;
   }

   public String getgxTv_SdtSalidasManualesProductos_Detalle_Prdnum( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Prdnum ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Prdnum( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      if ( GXutil.strcmp(gxTv_SdtSalidasManualesProductos_Detalle_Prdnum, value) != 0 )
      {
         gxTv_SdtSalidasManualesProductos_Detalle_Mode = "INS" ;
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Emprcod_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Cumcodcont_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Emprnom_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Prdnum_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Prdnom_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Cumconcant_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Cumconcbis_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Cumcospro_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Prdpreact_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Prdexialm_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Prdexicc_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Prdcanres_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Prdpremed_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Prdfaccon_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Cumconlot_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Prdvalstk_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Forprdume_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Cumunidad_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Prdcomid_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Prdlote_Z_SetNull( );
         this.setgxTv_SdtSalidasManualesProductos_Detalle_Cumumed_Z_SetNull( );
      }
      SetDirty("Prdnum");
      gxTv_SdtSalidasManualesProductos_Detalle_Prdnum = value ;
   }

   public String getgxTv_SdtSalidasManualesProductos_Detalle_Prdnom( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Prdnom ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Prdnom( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      SetDirty("Prdnom");
      gxTv_SdtSalidasManualesProductos_Detalle_Prdnom = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSalidasManualesProductos_Detalle_Cumconcant( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Cumconcant ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Cumconcant( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      SetDirty("Cumconcant");
      gxTv_SdtSalidasManualesProductos_Detalle_Cumconcant = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSalidasManualesProductos_Detalle_Cumconcbis( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Cumconcbis ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Cumconcbis( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      SetDirty("Cumconcbis");
      gxTv_SdtSalidasManualesProductos_Detalle_Cumconcbis = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSalidasManualesProductos_Detalle_Cumcospro( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Cumcospro ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Cumcospro( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      SetDirty("Cumcospro");
      gxTv_SdtSalidasManualesProductos_Detalle_Cumcospro = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Cumcospro_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_Cumcospro = DecimalUtil.ZERO ;
      SetDirty("Cumcospro");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Detalle_Cumcospro_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtSalidasManualesProductos_Detalle_Prdpreact( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Prdpreact ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Prdpreact( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      SetDirty("Prdpreact");
      gxTv_SdtSalidasManualesProductos_Detalle_Prdpreact = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSalidasManualesProductos_Detalle_Prdexialm( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Prdexialm ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Prdexialm( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      SetDirty("Prdexialm");
      gxTv_SdtSalidasManualesProductos_Detalle_Prdexialm = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSalidasManualesProductos_Detalle_Prdexicc( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Prdexicc ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Prdexicc( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      SetDirty("Prdexicc");
      gxTv_SdtSalidasManualesProductos_Detalle_Prdexicc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSalidasManualesProductos_Detalle_Prdcanres( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Prdcanres ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Prdcanres( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      SetDirty("Prdcanres");
      gxTv_SdtSalidasManualesProductos_Detalle_Prdcanres = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSalidasManualesProductos_Detalle_Prdpremed( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Prdpremed ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Prdpremed( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      SetDirty("Prdpremed");
      gxTv_SdtSalidasManualesProductos_Detalle_Prdpremed = value ;
   }

   public java.util.Date getgxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs( java.util.Date value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      SetDirty("Ultfecccs");
      gxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs = GXutil.nullDate() ;
      SetDirty("Ultfecccs");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtSalidasManualesProductos_Detalle_Prdfaccon( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Prdfaccon ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Prdfaccon( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      SetDirty("Prdfaccon");
      gxTv_SdtSalidasManualesProductos_Detalle_Prdfaccon = value ;
   }

   public String getgxTv_SdtSalidasManualesProductos_Detalle_Cumconlot( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Cumconlot ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Cumconlot( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      SetDirty("Cumconlot");
      gxTv_SdtSalidasManualesProductos_Detalle_Cumconlot = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSalidasManualesProductos_Detalle_Prdvalstk( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Prdvalstk ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Prdvalstk( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      SetDirty("Prdvalstk");
      gxTv_SdtSalidasManualesProductos_Detalle_Prdvalstk = value ;
   }

   public byte getgxTv_SdtSalidasManualesProductos_Detalle_Forprdume( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Forprdume ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Forprdume( byte value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      SetDirty("Forprdume");
      gxTv_SdtSalidasManualesProductos_Detalle_Forprdume = value ;
   }

   public String getgxTv_SdtSalidasManualesProductos_Detalle_Forprddsc( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Forprddsc ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Forprddsc( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      SetDirty("Forprddsc");
      gxTv_SdtSalidasManualesProductos_Detalle_Forprddsc = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_N = (byte)(1) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Forprddsc = "" ;
      SetDirty("Forprddsc");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_IsNull( )
   {
      return (gxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_N==1) ;
   }

   public byte getgxTv_SdtSalidasManualesProductos_Detalle_Cumunidad( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Cumunidad ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Cumunidad( byte value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      SetDirty("Cumunidad");
      gxTv_SdtSalidasManualesProductos_Detalle_Cumunidad = value ;
   }

   public String getgxTv_SdtSalidasManualesProductos_Detalle_Prdcomid( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Prdcomid ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Prdcomid( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      SetDirty("Prdcomid");
      gxTv_SdtSalidasManualesProductos_Detalle_Prdcomid = value ;
   }

   public String getgxTv_SdtSalidasManualesProductos_Detalle_Prdlote( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Prdlote ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Prdlote( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      SetDirty("Prdlote");
      gxTv_SdtSalidasManualesProductos_Detalle_Prdlote = value ;
   }

   public byte getgxTv_SdtSalidasManualesProductos_Detalle_Cumumed( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Cumumed ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Cumumed( byte value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      SetDirty("Cumumed");
      gxTv_SdtSalidasManualesProductos_Detalle_Cumumed = value ;
   }

   public String getgxTv_SdtSalidasManualesProductos_Detalle_Mode( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Mode ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Mode( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      SetDirty("Mode");
      gxTv_SdtSalidasManualesProductos_Detalle_Mode = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Mode_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Detalle_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtSalidasManualesProductos_Detalle_Initialized( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Initialized ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Initialized( short value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      SetDirty("Initialized");
      gxTv_SdtSalidasManualesProductos_Detalle_Initialized = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Initialized_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Detalle_Initialized_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtSalidasManualesProductos_Detalle_Emprcod_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Emprcod_Z ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Emprcod_Z( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      SetDirty("Emprcod_Z");
      gxTv_SdtSalidasManualesProductos_Detalle_Emprcod_Z = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Emprcod_Z_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_Emprcod_Z = "" ;
      SetDirty("Emprcod_Z");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Detalle_Emprcod_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtSalidasManualesProductos_Detalle_Cumcodcont_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Cumcodcont_Z ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Cumcodcont_Z( int value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      SetDirty("Cumcodcont_Z");
      gxTv_SdtSalidasManualesProductos_Detalle_Cumcodcont_Z = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Cumcodcont_Z_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_Cumcodcont_Z = 0 ;
      SetDirty("Cumcodcont_Z");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Detalle_Cumcodcont_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtSalidasManualesProductos_Detalle_Emprnom_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Emprnom_Z ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Emprnom_Z( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      SetDirty("Emprnom_Z");
      gxTv_SdtSalidasManualesProductos_Detalle_Emprnom_Z = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Emprnom_Z_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_Emprnom_Z = "" ;
      SetDirty("Emprnom_Z");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Detalle_Emprnom_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtSalidasManualesProductos_Detalle_Prdnum_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Prdnum_Z ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Prdnum_Z( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      SetDirty("Prdnum_Z");
      gxTv_SdtSalidasManualesProductos_Detalle_Prdnum_Z = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Prdnum_Z_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_Prdnum_Z = "" ;
      SetDirty("Prdnum_Z");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Detalle_Prdnum_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtSalidasManualesProductos_Detalle_Prdnom_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Prdnom_Z ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Prdnom_Z( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      SetDirty("Prdnom_Z");
      gxTv_SdtSalidasManualesProductos_Detalle_Prdnom_Z = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Prdnom_Z_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_Prdnom_Z = "" ;
      SetDirty("Prdnom_Z");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Detalle_Prdnom_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtSalidasManualesProductos_Detalle_Cumconcant_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Cumconcant_Z ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Cumconcant_Z( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      SetDirty("Cumconcant_Z");
      gxTv_SdtSalidasManualesProductos_Detalle_Cumconcant_Z = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Cumconcant_Z_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_Cumconcant_Z = DecimalUtil.ZERO ;
      SetDirty("Cumconcant_Z");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Detalle_Cumconcant_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtSalidasManualesProductos_Detalle_Cumconcbis_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Cumconcbis_Z ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Cumconcbis_Z( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      SetDirty("Cumconcbis_Z");
      gxTv_SdtSalidasManualesProductos_Detalle_Cumconcbis_Z = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Cumconcbis_Z_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_Cumconcbis_Z = DecimalUtil.ZERO ;
      SetDirty("Cumconcbis_Z");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Detalle_Cumconcbis_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtSalidasManualesProductos_Detalle_Cumcospro_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Cumcospro_Z ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Cumcospro_Z( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      SetDirty("Cumcospro_Z");
      gxTv_SdtSalidasManualesProductos_Detalle_Cumcospro_Z = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Cumcospro_Z_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_Cumcospro_Z = DecimalUtil.ZERO ;
      SetDirty("Cumcospro_Z");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Detalle_Cumcospro_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtSalidasManualesProductos_Detalle_Prdpreact_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Prdpreact_Z ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Prdpreact_Z( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      SetDirty("Prdpreact_Z");
      gxTv_SdtSalidasManualesProductos_Detalle_Prdpreact_Z = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Prdpreact_Z_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_Prdpreact_Z = DecimalUtil.ZERO ;
      SetDirty("Prdpreact_Z");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Detalle_Prdpreact_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtSalidasManualesProductos_Detalle_Prdexialm_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Prdexialm_Z ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Prdexialm_Z( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      SetDirty("Prdexialm_Z");
      gxTv_SdtSalidasManualesProductos_Detalle_Prdexialm_Z = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Prdexialm_Z_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_Prdexialm_Z = DecimalUtil.ZERO ;
      SetDirty("Prdexialm_Z");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Detalle_Prdexialm_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtSalidasManualesProductos_Detalle_Prdexicc_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Prdexicc_Z ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Prdexicc_Z( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      SetDirty("Prdexicc_Z");
      gxTv_SdtSalidasManualesProductos_Detalle_Prdexicc_Z = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Prdexicc_Z_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_Prdexicc_Z = DecimalUtil.ZERO ;
      SetDirty("Prdexicc_Z");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Detalle_Prdexicc_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtSalidasManualesProductos_Detalle_Prdcanres_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Prdcanres_Z ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Prdcanres_Z( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      SetDirty("Prdcanres_Z");
      gxTv_SdtSalidasManualesProductos_Detalle_Prdcanres_Z = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Prdcanres_Z_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_Prdcanres_Z = DecimalUtil.ZERO ;
      SetDirty("Prdcanres_Z");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Detalle_Prdcanres_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtSalidasManualesProductos_Detalle_Prdpremed_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Prdpremed_Z ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Prdpremed_Z( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      SetDirty("Prdpremed_Z");
      gxTv_SdtSalidasManualesProductos_Detalle_Prdpremed_Z = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Prdpremed_Z_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_Prdpremed_Z = DecimalUtil.ZERO ;
      SetDirty("Prdpremed_Z");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Detalle_Prdpremed_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs_Z ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs_Z( java.util.Date value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      SetDirty("Ultfecccs_Z");
      gxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs_Z = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs_Z_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs_Z = GXutil.nullDate() ;
      SetDirty("Ultfecccs_Z");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtSalidasManualesProductos_Detalle_Prdfaccon_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Prdfaccon_Z ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Prdfaccon_Z( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      SetDirty("Prdfaccon_Z");
      gxTv_SdtSalidasManualesProductos_Detalle_Prdfaccon_Z = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Prdfaccon_Z_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_Prdfaccon_Z = DecimalUtil.ZERO ;
      SetDirty("Prdfaccon_Z");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Detalle_Prdfaccon_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtSalidasManualesProductos_Detalle_Cumconlot_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Cumconlot_Z ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Cumconlot_Z( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      SetDirty("Cumconlot_Z");
      gxTv_SdtSalidasManualesProductos_Detalle_Cumconlot_Z = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Cumconlot_Z_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_Cumconlot_Z = "" ;
      SetDirty("Cumconlot_Z");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Detalle_Cumconlot_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtSalidasManualesProductos_Detalle_Prdvalstk_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Prdvalstk_Z ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Prdvalstk_Z( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      SetDirty("Prdvalstk_Z");
      gxTv_SdtSalidasManualesProductos_Detalle_Prdvalstk_Z = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Prdvalstk_Z_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_Prdvalstk_Z = DecimalUtil.ZERO ;
      SetDirty("Prdvalstk_Z");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Detalle_Prdvalstk_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtSalidasManualesProductos_Detalle_Forprdume_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Forprdume_Z ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Forprdume_Z( byte value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      SetDirty("Forprdume_Z");
      gxTv_SdtSalidasManualesProductos_Detalle_Forprdume_Z = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Forprdume_Z_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_Forprdume_Z = (byte)(0) ;
      SetDirty("Forprdume_Z");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Detalle_Forprdume_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_Z ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_Z( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      SetDirty("Forprddsc_Z");
      gxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_Z = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_Z_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_Z = "" ;
      SetDirty("Forprddsc_Z");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtSalidasManualesProductos_Detalle_Cumunidad_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Cumunidad_Z ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Cumunidad_Z( byte value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      SetDirty("Cumunidad_Z");
      gxTv_SdtSalidasManualesProductos_Detalle_Cumunidad_Z = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Cumunidad_Z_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_Cumunidad_Z = (byte)(0) ;
      SetDirty("Cumunidad_Z");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Detalle_Cumunidad_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtSalidasManualesProductos_Detalle_Prdcomid_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Prdcomid_Z ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Prdcomid_Z( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      SetDirty("Prdcomid_Z");
      gxTv_SdtSalidasManualesProductos_Detalle_Prdcomid_Z = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Prdcomid_Z_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_Prdcomid_Z = "" ;
      SetDirty("Prdcomid_Z");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Detalle_Prdcomid_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtSalidasManualesProductos_Detalle_Prdlote_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Prdlote_Z ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Prdlote_Z( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      SetDirty("Prdlote_Z");
      gxTv_SdtSalidasManualesProductos_Detalle_Prdlote_Z = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Prdlote_Z_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_Prdlote_Z = "" ;
      SetDirty("Prdlote_Z");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Detalle_Prdlote_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtSalidasManualesProductos_Detalle_Cumumed_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Cumumed_Z ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Cumumed_Z( byte value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      SetDirty("Cumumed_Z");
      gxTv_SdtSalidasManualesProductos_Detalle_Cumumed_Z = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Cumumed_Z_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_Cumumed_Z = (byte)(0) ;
      SetDirty("Cumumed_Z");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Detalle_Cumumed_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtSalidasManualesProductos_Detalle_Emprnom_N( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Emprnom_N ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Emprnom_N( byte value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      SetDirty("Emprnom_N");
      gxTv_SdtSalidasManualesProductos_Detalle_Emprnom_N = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Emprnom_N_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_Emprnom_N = (byte)(0) ;
      SetDirty("Emprnom_N");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Detalle_Emprnom_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_N( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_N ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_N( byte value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      SetDirty("Forprddsc_N");
      gxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_N = value ;
   }

   public void setgxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_N_SetNull( )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_N = (byte)(0) ;
      SetDirty("Forprddsc_N");
   }

   public boolean getgxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      app.stocksquimicos.salidasmanualesproductos_detalle_bc obj;
      obj = new app.stocksquimicos.salidasmanualesproductos_detalle_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_Emprcod = "" ;
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(1) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Emprnom = "" ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdnum = "" ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdnom = "" ;
      gxTv_SdtSalidasManualesProductos_Detalle_Cumconcant = DecimalUtil.ZERO ;
      gxTv_SdtSalidasManualesProductos_Detalle_Cumconcbis = DecimalUtil.ZERO ;
      gxTv_SdtSalidasManualesProductos_Detalle_Cumcospro = DecimalUtil.ZERO ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdpreact = DecimalUtil.ZERO ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdexialm = DecimalUtil.ZERO ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdexicc = DecimalUtil.ZERO ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdcanres = DecimalUtil.ZERO ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdpremed = DecimalUtil.ZERO ;
      gxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs = GXutil.nullDate() ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdfaccon = DecimalUtil.ZERO ;
      gxTv_SdtSalidasManualesProductos_Detalle_Cumconlot = "" ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdvalstk = DecimalUtil.ZERO ;
      gxTv_SdtSalidasManualesProductos_Detalle_Forprddsc = "" ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdcomid = "" ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdlote = "" ;
      gxTv_SdtSalidasManualesProductos_Detalle_Mode = "" ;
      gxTv_SdtSalidasManualesProductos_Detalle_Emprcod_Z = "" ;
      gxTv_SdtSalidasManualesProductos_Detalle_Emprnom_Z = "" ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdnum_Z = "" ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdnom_Z = "" ;
      gxTv_SdtSalidasManualesProductos_Detalle_Cumconcant_Z = DecimalUtil.ZERO ;
      gxTv_SdtSalidasManualesProductos_Detalle_Cumconcbis_Z = DecimalUtil.ZERO ;
      gxTv_SdtSalidasManualesProductos_Detalle_Cumcospro_Z = DecimalUtil.ZERO ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdpreact_Z = DecimalUtil.ZERO ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdexialm_Z = DecimalUtil.ZERO ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdexicc_Z = DecimalUtil.ZERO ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdcanres_Z = DecimalUtil.ZERO ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdpremed_Z = DecimalUtil.ZERO ;
      gxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs_Z = GXutil.nullDate() ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdfaccon_Z = DecimalUtil.ZERO ;
      gxTv_SdtSalidasManualesProductos_Detalle_Cumconlot_Z = "" ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdvalstk_Z = DecimalUtil.ZERO ;
      gxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_Z = "" ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdcomid_Z = "" ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdlote_Z = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_N ;
   }

   public app.stocksquimicos.SdtSalidasManualesProductos_Detalle Clone( )
   {
      app.stocksquimicos.SdtSalidasManualesProductos_Detalle sdt;
      app.stocksquimicos.salidasmanualesproductos_detalle_bc obj;
      sdt = (app.stocksquimicos.SdtSalidasManualesProductos_Detalle)(clone()) ;
      obj = (app.stocksquimicos.salidasmanualesproductos_detalle_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( app.stocksquimicos.StructSdtSalidasManualesProductos_Detalle struct )
   {
      setgxTv_SdtSalidasManualesProductos_Detalle_Emprcod(struct.getEmprcod());
      setgxTv_SdtSalidasManualesProductos_Detalle_Cumcodcont(struct.getCumcodcont());
      setgxTv_SdtSalidasManualesProductos_Detalle_Emprnom(struct.getEmprnom());
      setgxTv_SdtSalidasManualesProductos_Detalle_Prdnum(struct.getPrdnum());
      setgxTv_SdtSalidasManualesProductos_Detalle_Prdnom(struct.getPrdnom());
      setgxTv_SdtSalidasManualesProductos_Detalle_Cumconcant(struct.getCumconcant());
      setgxTv_SdtSalidasManualesProductos_Detalle_Cumconcbis(struct.getCumconcbis());
      setgxTv_SdtSalidasManualesProductos_Detalle_Cumcospro(struct.getCumcospro());
      setgxTv_SdtSalidasManualesProductos_Detalle_Prdpreact(struct.getPrdpreact());
      setgxTv_SdtSalidasManualesProductos_Detalle_Prdexialm(struct.getPrdexialm());
      setgxTv_SdtSalidasManualesProductos_Detalle_Prdexicc(struct.getPrdexicc());
      setgxTv_SdtSalidasManualesProductos_Detalle_Prdcanres(struct.getPrdcanres());
      setgxTv_SdtSalidasManualesProductos_Detalle_Prdpremed(struct.getPrdpremed());
      setgxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs(struct.getUltfecccs());
      setgxTv_SdtSalidasManualesProductos_Detalle_Prdfaccon(struct.getPrdfaccon());
      setgxTv_SdtSalidasManualesProductos_Detalle_Cumconlot(struct.getCumconlot());
      setgxTv_SdtSalidasManualesProductos_Detalle_Prdvalstk(struct.getPrdvalstk());
      setgxTv_SdtSalidasManualesProductos_Detalle_Forprdume(struct.getForprdume());
      setgxTv_SdtSalidasManualesProductos_Detalle_Forprddsc(struct.getForprddsc());
      setgxTv_SdtSalidasManualesProductos_Detalle_Cumunidad(struct.getCumunidad());
      setgxTv_SdtSalidasManualesProductos_Detalle_Prdcomid(struct.getPrdcomid());
      setgxTv_SdtSalidasManualesProductos_Detalle_Prdlote(struct.getPrdlote());
      setgxTv_SdtSalidasManualesProductos_Detalle_Cumumed(struct.getCumumed());
      setgxTv_SdtSalidasManualesProductos_Detalle_Mode(struct.getMode());
      setgxTv_SdtSalidasManualesProductos_Detalle_Initialized(struct.getInitialized());
      setgxTv_SdtSalidasManualesProductos_Detalle_Emprcod_Z(struct.getEmprcod_Z());
      setgxTv_SdtSalidasManualesProductos_Detalle_Cumcodcont_Z(struct.getCumcodcont_Z());
      setgxTv_SdtSalidasManualesProductos_Detalle_Emprnom_Z(struct.getEmprnom_Z());
      setgxTv_SdtSalidasManualesProductos_Detalle_Prdnum_Z(struct.getPrdnum_Z());
      setgxTv_SdtSalidasManualesProductos_Detalle_Prdnom_Z(struct.getPrdnom_Z());
      setgxTv_SdtSalidasManualesProductos_Detalle_Cumconcant_Z(struct.getCumconcant_Z());
      setgxTv_SdtSalidasManualesProductos_Detalle_Cumconcbis_Z(struct.getCumconcbis_Z());
      setgxTv_SdtSalidasManualesProductos_Detalle_Cumcospro_Z(struct.getCumcospro_Z());
      setgxTv_SdtSalidasManualesProductos_Detalle_Prdpreact_Z(struct.getPrdpreact_Z());
      setgxTv_SdtSalidasManualesProductos_Detalle_Prdexialm_Z(struct.getPrdexialm_Z());
      setgxTv_SdtSalidasManualesProductos_Detalle_Prdexicc_Z(struct.getPrdexicc_Z());
      setgxTv_SdtSalidasManualesProductos_Detalle_Prdcanres_Z(struct.getPrdcanres_Z());
      setgxTv_SdtSalidasManualesProductos_Detalle_Prdpremed_Z(struct.getPrdpremed_Z());
      setgxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs_Z(struct.getUltfecccs_Z());
      setgxTv_SdtSalidasManualesProductos_Detalle_Prdfaccon_Z(struct.getPrdfaccon_Z());
      setgxTv_SdtSalidasManualesProductos_Detalle_Cumconlot_Z(struct.getCumconlot_Z());
      setgxTv_SdtSalidasManualesProductos_Detalle_Prdvalstk_Z(struct.getPrdvalstk_Z());
      setgxTv_SdtSalidasManualesProductos_Detalle_Forprdume_Z(struct.getForprdume_Z());
      setgxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_Z(struct.getForprddsc_Z());
      setgxTv_SdtSalidasManualesProductos_Detalle_Cumunidad_Z(struct.getCumunidad_Z());
      setgxTv_SdtSalidasManualesProductos_Detalle_Prdcomid_Z(struct.getPrdcomid_Z());
      setgxTv_SdtSalidasManualesProductos_Detalle_Prdlote_Z(struct.getPrdlote_Z());
      setgxTv_SdtSalidasManualesProductos_Detalle_Cumumed_Z(struct.getCumumed_Z());
      setgxTv_SdtSalidasManualesProductos_Detalle_Emprnom_N(struct.getEmprnom_N());
      setgxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_N(struct.getForprddsc_N());
   }

   @SuppressWarnings("unchecked")
   public app.stocksquimicos.StructSdtSalidasManualesProductos_Detalle getStruct( )
   {
      app.stocksquimicos.StructSdtSalidasManualesProductos_Detalle struct = new app.stocksquimicos.StructSdtSalidasManualesProductos_Detalle ();
      struct.setEmprcod(getgxTv_SdtSalidasManualesProductos_Detalle_Emprcod());
      struct.setCumcodcont(getgxTv_SdtSalidasManualesProductos_Detalle_Cumcodcont());
      struct.setEmprnom(getgxTv_SdtSalidasManualesProductos_Detalle_Emprnom());
      struct.setPrdnum(getgxTv_SdtSalidasManualesProductos_Detalle_Prdnum());
      struct.setPrdnom(getgxTv_SdtSalidasManualesProductos_Detalle_Prdnom());
      struct.setCumconcant(getgxTv_SdtSalidasManualesProductos_Detalle_Cumconcant());
      struct.setCumconcbis(getgxTv_SdtSalidasManualesProductos_Detalle_Cumconcbis());
      struct.setCumcospro(getgxTv_SdtSalidasManualesProductos_Detalle_Cumcospro());
      struct.setPrdpreact(getgxTv_SdtSalidasManualesProductos_Detalle_Prdpreact());
      struct.setPrdexialm(getgxTv_SdtSalidasManualesProductos_Detalle_Prdexialm());
      struct.setPrdexicc(getgxTv_SdtSalidasManualesProductos_Detalle_Prdexicc());
      struct.setPrdcanres(getgxTv_SdtSalidasManualesProductos_Detalle_Prdcanres());
      struct.setPrdpremed(getgxTv_SdtSalidasManualesProductos_Detalle_Prdpremed());
      struct.setUltfecccs(getgxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs());
      struct.setPrdfaccon(getgxTv_SdtSalidasManualesProductos_Detalle_Prdfaccon());
      struct.setCumconlot(getgxTv_SdtSalidasManualesProductos_Detalle_Cumconlot());
      struct.setPrdvalstk(getgxTv_SdtSalidasManualesProductos_Detalle_Prdvalstk());
      struct.setForprdume(getgxTv_SdtSalidasManualesProductos_Detalle_Forprdume());
      struct.setForprddsc(getgxTv_SdtSalidasManualesProductos_Detalle_Forprddsc());
      struct.setCumunidad(getgxTv_SdtSalidasManualesProductos_Detalle_Cumunidad());
      struct.setPrdcomid(getgxTv_SdtSalidasManualesProductos_Detalle_Prdcomid());
      struct.setPrdlote(getgxTv_SdtSalidasManualesProductos_Detalle_Prdlote());
      struct.setCumumed(getgxTv_SdtSalidasManualesProductos_Detalle_Cumumed());
      struct.setMode(getgxTv_SdtSalidasManualesProductos_Detalle_Mode());
      struct.setInitialized(getgxTv_SdtSalidasManualesProductos_Detalle_Initialized());
      struct.setEmprcod_Z(getgxTv_SdtSalidasManualesProductos_Detalle_Emprcod_Z());
      struct.setCumcodcont_Z(getgxTv_SdtSalidasManualesProductos_Detalle_Cumcodcont_Z());
      struct.setEmprnom_Z(getgxTv_SdtSalidasManualesProductos_Detalle_Emprnom_Z());
      struct.setPrdnum_Z(getgxTv_SdtSalidasManualesProductos_Detalle_Prdnum_Z());
      struct.setPrdnom_Z(getgxTv_SdtSalidasManualesProductos_Detalle_Prdnom_Z());
      struct.setCumconcant_Z(getgxTv_SdtSalidasManualesProductos_Detalle_Cumconcant_Z());
      struct.setCumconcbis_Z(getgxTv_SdtSalidasManualesProductos_Detalle_Cumconcbis_Z());
      struct.setCumcospro_Z(getgxTv_SdtSalidasManualesProductos_Detalle_Cumcospro_Z());
      struct.setPrdpreact_Z(getgxTv_SdtSalidasManualesProductos_Detalle_Prdpreact_Z());
      struct.setPrdexialm_Z(getgxTv_SdtSalidasManualesProductos_Detalle_Prdexialm_Z());
      struct.setPrdexicc_Z(getgxTv_SdtSalidasManualesProductos_Detalle_Prdexicc_Z());
      struct.setPrdcanres_Z(getgxTv_SdtSalidasManualesProductos_Detalle_Prdcanres_Z());
      struct.setPrdpremed_Z(getgxTv_SdtSalidasManualesProductos_Detalle_Prdpremed_Z());
      struct.setUltfecccs_Z(getgxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs_Z());
      struct.setPrdfaccon_Z(getgxTv_SdtSalidasManualesProductos_Detalle_Prdfaccon_Z());
      struct.setCumconlot_Z(getgxTv_SdtSalidasManualesProductos_Detalle_Cumconlot_Z());
      struct.setPrdvalstk_Z(getgxTv_SdtSalidasManualesProductos_Detalle_Prdvalstk_Z());
      struct.setForprdume_Z(getgxTv_SdtSalidasManualesProductos_Detalle_Forprdume_Z());
      struct.setForprddsc_Z(getgxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_Z());
      struct.setCumunidad_Z(getgxTv_SdtSalidasManualesProductos_Detalle_Cumunidad_Z());
      struct.setPrdcomid_Z(getgxTv_SdtSalidasManualesProductos_Detalle_Prdcomid_Z());
      struct.setPrdlote_Z(getgxTv_SdtSalidasManualesProductos_Detalle_Prdlote_Z());
      struct.setCumumed_Z(getgxTv_SdtSalidasManualesProductos_Detalle_Cumumed_Z());
      struct.setEmprnom_N(getgxTv_SdtSalidasManualesProductos_Detalle_Emprnom_N());
      struct.setForprddsc_N(getgxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_N());
      return struct ;
   }

   private byte gxTv_SdtSalidasManualesProductos_Detalle_N ;
   private byte gxTv_SdtSalidasManualesProductos_Detalle_Forprdume ;
   private byte gxTv_SdtSalidasManualesProductos_Detalle_Cumunidad ;
   private byte gxTv_SdtSalidasManualesProductos_Detalle_Cumumed ;
   private byte gxTv_SdtSalidasManualesProductos_Detalle_Forprdume_Z ;
   private byte gxTv_SdtSalidasManualesProductos_Detalle_Cumunidad_Z ;
   private byte gxTv_SdtSalidasManualesProductos_Detalle_Cumumed_Z ;
   private byte gxTv_SdtSalidasManualesProductos_Detalle_Emprnom_N ;
   private byte gxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_N ;
   private short gxTv_SdtSalidasManualesProductos_Detalle_Initialized ;
   private short readOk ;
   private short nOutParmCount ;
   private int gxTv_SdtSalidasManualesProductos_Detalle_Cumcodcont ;
   private int gxTv_SdtSalidasManualesProductos_Detalle_Cumcodcont_Z ;
   private java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_Cumconcant ;
   private java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_Cumconcbis ;
   private java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_Cumcospro ;
   private java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_Prdpreact ;
   private java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_Prdexialm ;
   private java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_Prdexicc ;
   private java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_Prdcanres ;
   private java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_Prdpremed ;
   private java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_Prdfaccon ;
   private java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_Prdvalstk ;
   private java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_Cumconcant_Z ;
   private java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_Cumconcbis_Z ;
   private java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_Cumcospro_Z ;
   private java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_Prdpreact_Z ;
   private java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_Prdexialm_Z ;
   private java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_Prdexicc_Z ;
   private java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_Prdcanres_Z ;
   private java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_Prdpremed_Z ;
   private java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_Prdfaccon_Z ;
   private java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_Prdvalstk_Z ;
   private String gxTv_SdtSalidasManualesProductos_Detalle_Emprcod ;
   private String gxTv_SdtSalidasManualesProductos_Detalle_Emprnom ;
   private String gxTv_SdtSalidasManualesProductos_Detalle_Prdnum ;
   private String gxTv_SdtSalidasManualesProductos_Detalle_Prdnom ;
   private String gxTv_SdtSalidasManualesProductos_Detalle_Cumconlot ;
   private String gxTv_SdtSalidasManualesProductos_Detalle_Forprddsc ;
   private String gxTv_SdtSalidasManualesProductos_Detalle_Prdcomid ;
   private String gxTv_SdtSalidasManualesProductos_Detalle_Prdlote ;
   private String gxTv_SdtSalidasManualesProductos_Detalle_Mode ;
   private String gxTv_SdtSalidasManualesProductos_Detalle_Emprcod_Z ;
   private String gxTv_SdtSalidasManualesProductos_Detalle_Emprnom_Z ;
   private String gxTv_SdtSalidasManualesProductos_Detalle_Prdnum_Z ;
   private String gxTv_SdtSalidasManualesProductos_Detalle_Prdnom_Z ;
   private String gxTv_SdtSalidasManualesProductos_Detalle_Cumconlot_Z ;
   private String gxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_Z ;
   private String gxTv_SdtSalidasManualesProductos_Detalle_Prdcomid_Z ;
   private String gxTv_SdtSalidasManualesProductos_Detalle_Prdlote_Z ;
   private String sTagName ;
   private String sDateCnv ;
   private String sNumToPad ;
   private java.util.Date gxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs ;
   private java.util.Date gxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs_Z ;
   private boolean readElement ;
   private boolean formatError ;
}

