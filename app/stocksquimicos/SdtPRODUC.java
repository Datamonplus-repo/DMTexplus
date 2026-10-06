package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtPRODUC extends GxSilentTrnSdt
{
   public SdtPRODUC( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtPRODUC.class));
   }

   public SdtPRODUC( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle, context, "SdtPRODUC");
      initialize( remoteHandle) ;
   }

   public SdtPRODUC( int remoteHandle ,
                     StructSdtPRODUC struct )
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
                     String AV719PrdNum )
   {
      IGxSilentTrn obj;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {AV396EmprCod,AV719PrdNum});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"EmprCod", String.class}, new Object[]{"PrdNum", String.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "StocksQuimicos\\PRODUC");
      metadata.set("BT", "TXPPRODUC");
      metadata.set("PK", "[ \"PrdNum\" ]");
      metadata.set("FKList", "[ { \"FK\":[ \"EmprCod\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"AlmPrdID\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"GrpFamCod\" ],\"FKMap\":[ \"PrdGruFamId-GrpFamCod\" ] },{ \"FK\":[ \"EmprCod\",\"MetCod\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"PrdFabId\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"PrvNum\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"SubFamCod\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"TipDtoCod\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"TipPrdCod\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"UniCod\" ],\"FKMap\":[ \"PrdUniCom-UniCod\" ] },{ \"FK\":[ \"EmprCod\",\"UniCod\" ],\"FKMap\":[ \"PrdUniCon-UniCod\" ] },{ \"FK\":[ \"EmprCod\",\"ValCod\" ],\"FKMap\":[  ] } ]");
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
               gxTv_SdtPRODUC_Emprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom") )
            {
               gxTv_SdtPRODUC_Emprnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdNum") )
            {
               gxTv_SdtPRODUC_Prdnum = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdNom") )
            {
               gxTv_SdtPRODUC_Prdnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrvNum") )
            {
               gxTv_SdtPRODUC_Prvnum = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrvNom") )
            {
               gxTv_SdtPRODUC_Prvnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdRefPrv") )
            {
               gxTv_SdtPRODUC_Prdrefprv = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdDscTec") )
            {
               gxTv_SdtPRODUC_Prddsctec = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdUniCom") )
            {
               gxTv_SdtPRODUC_Prdunicom = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdUcpDsc") )
            {
               gxTv_SdtPRODUC_Prducpdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdUniCon") )
            {
               gxTv_SdtPRODUC_Prdunicon = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdUcoDsc") )
            {
               gxTv_SdtPRODUC_Prducodsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdFacCon") )
            {
               gxTv_SdtPRODUC_Prdfaccon = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ValCod") )
            {
               gxTv_SdtPRODUC_Valcod = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ValDsc") )
            {
               gxTv_SdtPRODUC_Valdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdRec") )
            {
               gxTv_SdtPRODUC_Prdrec = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdCalNec") )
            {
               gxTv_SdtPRODUC_Prdcalnec = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdDetPar") )
            {
               gxTv_SdtPRODUC_Prddetpar = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdSit") )
            {
               gxTv_SdtPRODUC_Prdsit = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdRotRea") )
            {
               gxTv_SdtPRODUC_Prdrotrea = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipDtoCod") )
            {
               gxTv_SdtPRODUC_Tipdtocod = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipDtoDto") )
            {
               gxTv_SdtPRODUC_Tipdtodto = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdPreAct") )
            {
               gxTv_SdtPRODUC_Prdpreact = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdFecPre") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtPRODUC_Prdfecpre = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtPRODUC_Prdfecpre = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdPreAnt") )
            {
               gxTv_SdtPRODUC_Prdpreant = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdPreMed") )
            {
               gxTv_SdtPRODUC_Prdpremed = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdConDia") )
            {
               gxTv_SdtPRODUC_Prdcondia = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdStkMinD") )
            {
               gxTv_SdtPRODUC_Prdstkmind = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdStkMinU") )
            {
               gxTv_SdtPRODUC_Prdstkminu = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdDiaRot") )
            {
               gxTv_SdtPRODUC_Prddiarot = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdPlaEnt") )
            {
               gxTv_SdtPRODUC_Prdplaent = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MetCod") )
            {
               gxTv_SdtPRODUC_Metcod = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MetDsc") )
            {
               gxTv_SdtPRODUC_Metdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdLotMin") )
            {
               gxTv_SdtPRODUC_Prdlotmin = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdNumUco") )
            {
               gxTv_SdtPRODUC_Prdnumuco = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdExiAlm") )
            {
               gxTv_SdtPRODUC_Prdexialm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdExiCC") )
            {
               gxTv_SdtPRODUC_Prdexicc = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdCanRes") )
            {
               gxTv_SdtPRODUC_Prdcanres = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdCanPen") )
            {
               gxTv_SdtPRODUC_Prdcanpen = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdFulEnt") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtPRODUC_Prdfulent = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtPRODUC_Prdfulent = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdFulPed") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtPRODUC_Prdfulped = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtPRODUC_Prdfulped = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdFulCC") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtPRODUC_Prdfulcc = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtPRODUC_Prdfulcc = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdExiCCP") )
            {
               gxTv_SdtPRODUC_Prdexiccp = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdUltECC") )
            {
               gxTv_SdtPRODUC_Prdultecc = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdUltCCC") )
            {
               gxTv_SdtPRODUC_Prdultccc = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdUltDCC") )
            {
               gxTv_SdtPRODUC_Prdultdcc = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdDifCC") )
            {
               gxTv_SdtPRODUC_Prddifcc = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdConCC") )
            {
               gxTv_SdtPRODUC_Prdconcc = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdValStk") )
            {
               gxTv_SdtPRODUC_Prdvalstk = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DifValStk") )
            {
               gxTv_SdtPRODUC_Difvalstk = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdFecEnt") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtPRODUC_Prdfecent = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtPRODUC_Prdfecent = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdPosX") )
            {
               gxTv_SdtPRODUC_Prdposx = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdPosY") )
            {
               gxTv_SdtPRODUC_Prdposy = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdTip") )
            {
               gxTv_SdtPRODUC_Prdtip = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdDqo") )
            {
               gxTv_SdtPRODUC_Prddqo = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdRev") )
            {
               gxTv_SdtPRODUC_Prdrev = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdTnq") )
            {
               gxTv_SdtPRODUC_Prdtnq = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdNom2") )
            {
               gxTv_SdtPRODUC_Prdnom2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdNum2") )
            {
               gxTv_SdtPRODUC_Prdnum2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdObs") )
            {
               gxTv_SdtPRODUC_Prdobs = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdUMeFo") )
            {
               gxTv_SdtPRODUC_Prdumefo = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdPreAc2") )
            {
               gxTv_SdtPRODUC_Prdpreac2 = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdDensS") )
            {
               gxTv_SdtPRODUC_Prddenss = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdConcS") )
            {
               gxTv_SdtPRODUC_Prdconcs = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdSalM") )
            {
               gxTv_SdtPRODUC_Prdsalm = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdSolub") )
            {
               gxTv_SdtPRODUC_Prdsolub = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipPrdCod") )
            {
               gxTv_SdtPRODUC_Tipprdcod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipPrdDsc") )
            {
               gxTv_SdtPRODUC_Tipprddsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdNumCentra") )
            {
               gxTv_SdtPRODUC_Prdnumcentra = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdNumct1") )
            {
               gxTv_SdtPRODUC_Prdnumct1 = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdNumct2") )
            {
               gxTv_SdtPRODUC_Prdnumct2 = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdHorMad") )
            {
               gxTv_SdtPRODUC_Prdhormad = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdExiAlmc") )
            {
               gxTv_SdtPRODUC_Prdexialmc = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdPesTerm") )
            {
               gxTv_SdtPRODUC_Prdpesterm = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdSal") )
            {
               gxTv_SdtPRODUC_Prdsal = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SubFamCod") )
            {
               gxTv_SdtPRODUC_Subfamcod = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SubFamDsc") )
            {
               gxTv_SdtPRODUC_Subfamdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdInc") )
            {
               gxTv_SdtPRODUC_Prdinc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdComp") )
            {
               gxTv_SdtPRODUC_Prdcomp = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdAox") )
            {
               gxTv_SdtPRODUC_Prdaox = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdNCAS") )
            {
               gxTv_SdtPRODUC_Prdncas = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdFT") )
            {
               gxTv_SdtPRODUC_Prdft = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdFFT") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtPRODUC_Prdfft = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtPRODUC_Prdfft = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdHS") )
            {
               gxTv_SdtPRODUC_Prdhs = oReader.getValue() ;
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
                  gxTv_SdtPRODUC_Prdfhs = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtPRODUC_Prdfhs = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdColIdx") )
            {
               gxTv_SdtPRODUC_Prdcolidx = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdOkotex") )
            {
               gxTv_SdtPRODUC_Prdokotex = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdReach") )
            {
               gxTv_SdtPRODUC_Prdreach = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdLote") )
            {
               gxTv_SdtPRODUC_Prdlote = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdRTM") )
            {
               gxTv_SdtPRODUC_Prdrtm = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdCtw1") )
            {
               gxTv_SdtPRODUC_Prdctw1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdCtw2") )
            {
               gxTv_SdtPRODUC_Prdctw2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdCtw3") )
            {
               gxTv_SdtPRODUC_Prdctw3 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdCtw4") )
            {
               gxTv_SdtPRODUC_Prdctw4 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdNroCAS") )
            {
               gxTv_SdtPRODUC_Prdnrocas = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdGots") )
            {
               gxTv_SdtPRODUC_Prdgots = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdHm") )
            {
               gxTv_SdtPRODUC_Prdhm = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdConct") )
            {
               gxTv_SdtPRODUC_Prdconct = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdEINECS") )
            {
               gxTv_SdtPRODUC_Prdeinecs = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdFuncion") )
            {
               gxTv_SdtPRODUC_Prdfuncion = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdNmQu") )
            {
               gxTv_SdtPRODUC_Prdnmqu = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdList") )
            {
               gxTv_SdtPRODUC_Prdlist = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdFabId") )
            {
               gxTv_SdtPRODUC_Prdfabid = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdFabNm") )
            {
               gxTv_SdtPRODUC_Prdfabnm = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdLoteOb") )
            {
               gxTv_SdtPRODUC_Prdloteob = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdRGB") )
            {
               gxTv_SdtPRODUC_Prdrgb = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdZDHC") )
            {
               gxTv_SdtPRODUC_Prdzdhc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdTHELIST") )
            {
               gxTv_SdtPRODUC_Prdthelist = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdUbicacion") )
            {
               gxTv_SdtPRODUC_Prdubicacion = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdEqLP") )
            {
               gxTv_SdtPRODUC_Prdeqlp = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdPesCon") )
            {
               gxTv_SdtPRODUC_Prdpescon = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdCantAtM") )
            {
               gxTv_SdtPRODUC_Prdcantatm = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdGruFamId") )
            {
               gxTv_SdtPRODUC_Prdgrufamid = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdMatSeca") )
            {
               gxTv_SdtPRODUC_Prdmatseca = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlmPrdID") )
            {
               gxTv_SdtPRODUC_Almprdid = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdLoteFch") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtPRODUC_Prdlotefch = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtPRODUC_Prdlotefch = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdFTdoc") )
            {
               gxTv_SdtPRODUC_Prdftdoc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdFSdoc") )
            {
               gxTv_SdtPRODUC_Prdfsdoc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdGRS") )
            {
               gxTv_SdtPRODUC_Prdgrs = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdCDsc") )
            {
               gxTv_SdtPRODUC_Prdcdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdDisponible") )
            {
               gxTv_SdtPRODUC_Prddisponible = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdDiasInactivo") )
            {
               gxTv_SdtPRODUC_Prddiasinactivo = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdUltMovCC") )
            {
               gxTv_SdtPRODUC_Prdultmovcc = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdFecUltMov") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtPRODUC_Prdfecultmov = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtPRODUC_Prdfecultmov = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdTipMovUlt") )
            {
               gxTv_SdtPRODUC_Prdtipmovult = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdLastLineaCC") )
            {
               gxTv_SdtPRODUC_Prdlastlineacc = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdLastFechCC") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtPRODUC_Prdlastfechcc = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtPRODUC_Prdlastfechcc = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdLastTipMovCC") )
            {
               gxTv_SdtPRODUC_Prdlasttipmovcc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdEsCompuesto") )
            {
               gxTv_SdtPRODUC_Prdescompuesto = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdDiaSinMov") )
            {
               gxTv_SdtPRODUC_Prddiasinmov = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtPRODUC_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtPRODUC_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprCod_Z") )
            {
               gxTv_SdtPRODUC_Emprcod_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom_Z") )
            {
               gxTv_SdtPRODUC_Emprnom_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdNum_Z") )
            {
               gxTv_SdtPRODUC_Prdnum_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdNom_Z") )
            {
               gxTv_SdtPRODUC_Prdnom_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrvNum_Z") )
            {
               gxTv_SdtPRODUC_Prvnum_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrvNom_Z") )
            {
               gxTv_SdtPRODUC_Prvnom_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdRefPrv_Z") )
            {
               gxTv_SdtPRODUC_Prdrefprv_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdDscTec_Z") )
            {
               gxTv_SdtPRODUC_Prddsctec_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdUniCom_Z") )
            {
               gxTv_SdtPRODUC_Prdunicom_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdUcpDsc_Z") )
            {
               gxTv_SdtPRODUC_Prducpdsc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdUniCon_Z") )
            {
               gxTv_SdtPRODUC_Prdunicon_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdUcoDsc_Z") )
            {
               gxTv_SdtPRODUC_Prducodsc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdFacCon_Z") )
            {
               gxTv_SdtPRODUC_Prdfaccon_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ValCod_Z") )
            {
               gxTv_SdtPRODUC_Valcod_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ValDsc_Z") )
            {
               gxTv_SdtPRODUC_Valdsc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdRec_Z") )
            {
               gxTv_SdtPRODUC_Prdrec_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdCalNec_Z") )
            {
               gxTv_SdtPRODUC_Prdcalnec_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdDetPar_Z") )
            {
               gxTv_SdtPRODUC_Prddetpar_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdSit_Z") )
            {
               gxTv_SdtPRODUC_Prdsit_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdRotRea_Z") )
            {
               gxTv_SdtPRODUC_Prdrotrea_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipDtoCod_Z") )
            {
               gxTv_SdtPRODUC_Tipdtocod_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipDtoDto_Z") )
            {
               gxTv_SdtPRODUC_Tipdtodto_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdPreAct_Z") )
            {
               gxTv_SdtPRODUC_Prdpreact_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdFecPre_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtPRODUC_Prdfecpre_Z = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtPRODUC_Prdfecpre_Z = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdPreAnt_Z") )
            {
               gxTv_SdtPRODUC_Prdpreant_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdPreMed_Z") )
            {
               gxTv_SdtPRODUC_Prdpremed_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdConDia_Z") )
            {
               gxTv_SdtPRODUC_Prdcondia_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdStkMinD_Z") )
            {
               gxTv_SdtPRODUC_Prdstkmind_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdStkMinU_Z") )
            {
               gxTv_SdtPRODUC_Prdstkminu_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdDiaRot_Z") )
            {
               gxTv_SdtPRODUC_Prddiarot_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdPlaEnt_Z") )
            {
               gxTv_SdtPRODUC_Prdplaent_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MetCod_Z") )
            {
               gxTv_SdtPRODUC_Metcod_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MetDsc_Z") )
            {
               gxTv_SdtPRODUC_Metdsc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdLotMin_Z") )
            {
               gxTv_SdtPRODUC_Prdlotmin_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdNumUco_Z") )
            {
               gxTv_SdtPRODUC_Prdnumuco_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdExiAlm_Z") )
            {
               gxTv_SdtPRODUC_Prdexialm_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdExiCC_Z") )
            {
               gxTv_SdtPRODUC_Prdexicc_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdCanRes_Z") )
            {
               gxTv_SdtPRODUC_Prdcanres_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdCanPen_Z") )
            {
               gxTv_SdtPRODUC_Prdcanpen_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdFulEnt_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtPRODUC_Prdfulent_Z = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtPRODUC_Prdfulent_Z = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdFulPed_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtPRODUC_Prdfulped_Z = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtPRODUC_Prdfulped_Z = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdFulCC_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtPRODUC_Prdfulcc_Z = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtPRODUC_Prdfulcc_Z = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdExiCCP_Z") )
            {
               gxTv_SdtPRODUC_Prdexiccp_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdUltECC_Z") )
            {
               gxTv_SdtPRODUC_Prdultecc_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdUltCCC_Z") )
            {
               gxTv_SdtPRODUC_Prdultccc_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdUltDCC_Z") )
            {
               gxTv_SdtPRODUC_Prdultdcc_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdDifCC_Z") )
            {
               gxTv_SdtPRODUC_Prddifcc_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdConCC_Z") )
            {
               gxTv_SdtPRODUC_Prdconcc_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdValStk_Z") )
            {
               gxTv_SdtPRODUC_Prdvalstk_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DifValStk_Z") )
            {
               gxTv_SdtPRODUC_Difvalstk_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdFecEnt_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtPRODUC_Prdfecent_Z = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtPRODUC_Prdfecent_Z = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdPosX_Z") )
            {
               gxTv_SdtPRODUC_Prdposx_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdPosY_Z") )
            {
               gxTv_SdtPRODUC_Prdposy_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdTip_Z") )
            {
               gxTv_SdtPRODUC_Prdtip_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdDqo_Z") )
            {
               gxTv_SdtPRODUC_Prddqo_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdRev_Z") )
            {
               gxTv_SdtPRODUC_Prdrev_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdTnq_Z") )
            {
               gxTv_SdtPRODUC_Prdtnq_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdNom2_Z") )
            {
               gxTv_SdtPRODUC_Prdnom2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdNum2_Z") )
            {
               gxTv_SdtPRODUC_Prdnum2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdObs_Z") )
            {
               gxTv_SdtPRODUC_Prdobs_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdUMeFo_Z") )
            {
               gxTv_SdtPRODUC_Prdumefo_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdPreAc2_Z") )
            {
               gxTv_SdtPRODUC_Prdpreac2_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdDensS_Z") )
            {
               gxTv_SdtPRODUC_Prddenss_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdConcS_Z") )
            {
               gxTv_SdtPRODUC_Prdconcs_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdSalM_Z") )
            {
               gxTv_SdtPRODUC_Prdsalm_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdSolub_Z") )
            {
               gxTv_SdtPRODUC_Prdsolub_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipPrdCod_Z") )
            {
               gxTv_SdtPRODUC_Tipprdcod_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipPrdDsc_Z") )
            {
               gxTv_SdtPRODUC_Tipprddsc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdNumCentra_Z") )
            {
               gxTv_SdtPRODUC_Prdnumcentra_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdNumct1_Z") )
            {
               gxTv_SdtPRODUC_Prdnumct1_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdNumct2_Z") )
            {
               gxTv_SdtPRODUC_Prdnumct2_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdHorMad_Z") )
            {
               gxTv_SdtPRODUC_Prdhormad_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdExiAlmc_Z") )
            {
               gxTv_SdtPRODUC_Prdexialmc_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdPesTerm_Z") )
            {
               gxTv_SdtPRODUC_Prdpesterm_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdSal_Z") )
            {
               gxTv_SdtPRODUC_Prdsal_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SubFamCod_Z") )
            {
               gxTv_SdtPRODUC_Subfamcod_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SubFamDsc_Z") )
            {
               gxTv_SdtPRODUC_Subfamdsc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdInc_Z") )
            {
               gxTv_SdtPRODUC_Prdinc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdComp_Z") )
            {
               gxTv_SdtPRODUC_Prdcomp_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdAox_Z") )
            {
               gxTv_SdtPRODUC_Prdaox_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdNCAS_Z") )
            {
               gxTv_SdtPRODUC_Prdncas_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdFT_Z") )
            {
               gxTv_SdtPRODUC_Prdft_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdFFT_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtPRODUC_Prdfft_Z = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtPRODUC_Prdfft_Z = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdHS_Z") )
            {
               gxTv_SdtPRODUC_Prdhs_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdFHS_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtPRODUC_Prdfhs_Z = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtPRODUC_Prdfhs_Z = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdColIdx_Z") )
            {
               gxTv_SdtPRODUC_Prdcolidx_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdOkotex_Z") )
            {
               gxTv_SdtPRODUC_Prdokotex_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdReach_Z") )
            {
               gxTv_SdtPRODUC_Prdreach_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdLote_Z") )
            {
               gxTv_SdtPRODUC_Prdlote_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdRTM_Z") )
            {
               gxTv_SdtPRODUC_Prdrtm_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdCtw1_Z") )
            {
               gxTv_SdtPRODUC_Prdctw1_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdCtw2_Z") )
            {
               gxTv_SdtPRODUC_Prdctw2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdCtw3_Z") )
            {
               gxTv_SdtPRODUC_Prdctw3_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdCtw4_Z") )
            {
               gxTv_SdtPRODUC_Prdctw4_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdNroCAS_Z") )
            {
               gxTv_SdtPRODUC_Prdnrocas_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdGots_Z") )
            {
               gxTv_SdtPRODUC_Prdgots_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdHm_Z") )
            {
               gxTv_SdtPRODUC_Prdhm_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdConct_Z") )
            {
               gxTv_SdtPRODUC_Prdconct_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdEINECS_Z") )
            {
               gxTv_SdtPRODUC_Prdeinecs_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdFuncion_Z") )
            {
               gxTv_SdtPRODUC_Prdfuncion_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdNmQu_Z") )
            {
               gxTv_SdtPRODUC_Prdnmqu_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdList_Z") )
            {
               gxTv_SdtPRODUC_Prdlist_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdFabId_Z") )
            {
               gxTv_SdtPRODUC_Prdfabid_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdFabNm_Z") )
            {
               gxTv_SdtPRODUC_Prdfabnm_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdLoteOb_Z") )
            {
               gxTv_SdtPRODUC_Prdloteob_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdRGB_Z") )
            {
               gxTv_SdtPRODUC_Prdrgb_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdZDHC_Z") )
            {
               gxTv_SdtPRODUC_Prdzdhc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdTHELIST_Z") )
            {
               gxTv_SdtPRODUC_Prdthelist_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdUbicacion_Z") )
            {
               gxTv_SdtPRODUC_Prdubicacion_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdEqLP_Z") )
            {
               gxTv_SdtPRODUC_Prdeqlp_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdPesCon_Z") )
            {
               gxTv_SdtPRODUC_Prdpescon_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdCantAtM_Z") )
            {
               gxTv_SdtPRODUC_Prdcantatm_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdGruFamId_Z") )
            {
               gxTv_SdtPRODUC_Prdgrufamid_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdMatSeca_Z") )
            {
               gxTv_SdtPRODUC_Prdmatseca_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlmPrdID_Z") )
            {
               gxTv_SdtPRODUC_Almprdid_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdLoteFch_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtPRODUC_Prdlotefch_Z = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtPRODUC_Prdlotefch_Z = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdFTdoc_Z") )
            {
               gxTv_SdtPRODUC_Prdftdoc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdFSdoc_Z") )
            {
               gxTv_SdtPRODUC_Prdfsdoc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdGRS_Z") )
            {
               gxTv_SdtPRODUC_Prdgrs_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdCDsc_Z") )
            {
               gxTv_SdtPRODUC_Prdcdsc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdDisponible_Z") )
            {
               gxTv_SdtPRODUC_Prddisponible_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdDiasInactivo_Z") )
            {
               gxTv_SdtPRODUC_Prddiasinactivo_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdUltMovCC_Z") )
            {
               gxTv_SdtPRODUC_Prdultmovcc_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdFecUltMov_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtPRODUC_Prdfecultmov_Z = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtPRODUC_Prdfecultmov_Z = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdTipMovUlt_Z") )
            {
               gxTv_SdtPRODUC_Prdtipmovult_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdLastLineaCC_Z") )
            {
               gxTv_SdtPRODUC_Prdlastlineacc_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdLastFechCC_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtPRODUC_Prdlastfechcc_Z = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtPRODUC_Prdlastfechcc_Z = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdLastTipMovCC_Z") )
            {
               gxTv_SdtPRODUC_Prdlasttipmovcc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdEsCompuesto_Z") )
            {
               gxTv_SdtPRODUC_Prdescompuesto_Z = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdDiaSinMov_Z") )
            {
               gxTv_SdtPRODUC_Prddiasinmov_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom_N") )
            {
               gxTv_SdtPRODUC_Emprnom_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdNum_N") )
            {
               gxTv_SdtPRODUC_Prdnum_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrvNom_N") )
            {
               gxTv_SdtPRODUC_Prvnom_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdUcpDsc_N") )
            {
               gxTv_SdtPRODUC_Prducpdsc_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdUcoDsc_N") )
            {
               gxTv_SdtPRODUC_Prducodsc_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ValDsc_N") )
            {
               gxTv_SdtPRODUC_Valdsc_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipDtoCod_N") )
            {
               gxTv_SdtPRODUC_Tipdtocod_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipDtoDto_N") )
            {
               gxTv_SdtPRODUC_Tipdtodto_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MetCod_N") )
            {
               gxTv_SdtPRODUC_Metcod_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MetDsc_N") )
            {
               gxTv_SdtPRODUC_Metdsc_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipPrdCod_N") )
            {
               gxTv_SdtPRODUC_Tipprdcod_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipPrdDsc_N") )
            {
               gxTv_SdtPRODUC_Tipprddsc_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SubFamCod_N") )
            {
               gxTv_SdtPRODUC_Subfamcod_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SubFamDsc_N") )
            {
               gxTv_SdtPRODUC_Subfamdsc_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdFabId_N") )
            {
               gxTv_SdtPRODUC_Prdfabid_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdFabNm_N") )
            {
               gxTv_SdtPRODUC_Prdfabnm_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdTHELIST_N") )
            {
               gxTv_SdtPRODUC_Prdthelist_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdCantAtM_N") )
            {
               gxTv_SdtPRODUC_Prdcantatm_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdGruFamId_N") )
            {
               gxTv_SdtPRODUC_Prdgrufamid_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdMatSeca_N") )
            {
               gxTv_SdtPRODUC_Prdmatseca_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlmPrdID_N") )
            {
               gxTv_SdtPRODUC_Almprdid_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdLoteFch_N") )
            {
               gxTv_SdtPRODUC_Prdlotefch_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdFTdoc_N") )
            {
               gxTv_SdtPRODUC_Prdftdoc_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdFSdoc_N") )
            {
               gxTv_SdtPRODUC_Prdfsdoc_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdGRS_N") )
            {
               gxTv_SdtPRODUC_Prdgrs_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdLastLineaCC_N") )
            {
               gxTv_SdtPRODUC_Prdlastlineacc_N = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "PRODUC" ;
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
      oWriter.writeElement("EmprCod", gxTv_SdtPRODUC_Emprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EmprNom", gxTv_SdtPRODUC_Emprnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdNum", gxTv_SdtPRODUC_Prdnum);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdNom", gxTv_SdtPRODUC_Prdnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrvNum", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prvnum, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrvNom", gxTv_SdtPRODUC_Prvnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdRefPrv", gxTv_SdtPRODUC_Prdrefprv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdDscTec", gxTv_SdtPRODUC_Prddsctec);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdUniCom", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdunicom, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdUcpDsc", gxTv_SdtPRODUC_Prducpdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdUniCon", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdunicon, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdUcoDsc", gxTv_SdtPRODUC_Prducodsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdFacCon", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prdfaccon, 7, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ValCod", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Valcod, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ValDsc", gxTv_SdtPRODUC_Valdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdRec", gxTv_SdtPRODUC_Prdrec);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdCalNec", gxTv_SdtPRODUC_Prdcalnec);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdDetPar", gxTv_SdtPRODUC_Prddetpar);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdSit", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdsit, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdRotRea", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prdrotrea, 12, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipDtoCod", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Tipdtocod, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipDtoDto", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Tipdtodto, 5, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdPreAct", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prdpreact, 14, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPRODUC_Prdfecpre), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPRODUC_Prdfecpre), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPRODUC_Prdfecpre), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("PrdFecPre", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdPreAnt", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prdpreant, 14, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdPreMed", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prdpremed, 14, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdConDia", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prdcondia, 7, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdStkMinD", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdstkmind, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdStkMinU", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prdstkminu, 8, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdDiaRot", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prddiarot, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdPlaEnt", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdplaent, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MetCod", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Metcod, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MetDsc", gxTv_SdtPRODUC_Metdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdLotMin", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdlotmin, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdNumUco", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prdnumuco, 7, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdExiAlm", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prdexialm, 12, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdExiCC", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prdexicc, 12, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdCanRes", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prdcanres, 12, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdCanPen", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prdcanpen, 12, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPRODUC_Prdfulent), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPRODUC_Prdfulent), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPRODUC_Prdfulent), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("PrdFulEnt", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPRODUC_Prdfulped), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPRODUC_Prdfulped), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPRODUC_Prdfulped), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("PrdFulPed", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPRODUC_Prdfulcc), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPRODUC_Prdfulcc), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPRODUC_Prdfulcc), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("PrdFulCC", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdExiCCP", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prdexiccp, 8, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdUltECC", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prdultecc, 8, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdUltCCC", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdultccc, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdUltDCC", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prdultdcc, 8, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdDifCC", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prddifcc, 8, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdConCC", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdconcc, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdValStk", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prdvalstk, 11, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DifValStk", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Difvalstk, 11, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPRODUC_Prdfecent), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPRODUC_Prdfecent), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPRODUC_Prdfecent), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("PrdFecEnt", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdPosX", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdposx, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdPosY", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdposy, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdTip", gxTv_SdtPRODUC_Prdtip);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdDqo", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prddqo, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdRev", gxTv_SdtPRODUC_Prdrev);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdTnq", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdtnq, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdNom2", gxTv_SdtPRODUC_Prdnom2);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdNum2", gxTv_SdtPRODUC_Prdnum2);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdObs", gxTv_SdtPRODUC_Prdobs);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdUMeFo", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdumefo, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdPreAc2", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prdpreac2, 14, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdDensS", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prddenss, 7, 3)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdConcS", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prdconcs, 7, 3)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdSalM", gxTv_SdtPRODUC_Prdsalm);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdSolub", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prdsolub, 7, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipPrdCod", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Tipprdcod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipPrdDsc", gxTv_SdtPRODUC_Tipprddsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdNumCentra", gxTv_SdtPRODUC_Prdnumcentra);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdNumct1", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prdnumct1, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdNumct2", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prdnumct2, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdHorMad", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdhormad, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdExiAlmc", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prdexialmc, 12, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdPesTerm", gxTv_SdtPRODUC_Prdpesterm);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdSal", gxTv_SdtPRODUC_Prdsal);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("SubFamCod", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Subfamcod, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("SubFamDsc", gxTv_SdtPRODUC_Subfamdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdInc", gxTv_SdtPRODUC_Prdinc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdComp", gxTv_SdtPRODUC_Prdcomp);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdAox", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prdaox, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdNCAS", gxTv_SdtPRODUC_Prdncas);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdFT", gxTv_SdtPRODUC_Prdft);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPRODUC_Prdfft), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPRODUC_Prdfft), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPRODUC_Prdfft), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("PrdFFT", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdHS", gxTv_SdtPRODUC_Prdhs);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPRODUC_Prdfhs), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPRODUC_Prdfhs), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPRODUC_Prdfhs), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("PrdFHS", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdColIdx", gxTv_SdtPRODUC_Prdcolidx);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdOkotex", gxTv_SdtPRODUC_Prdokotex);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdReach", gxTv_SdtPRODUC_Prdreach);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdLote", gxTv_SdtPRODUC_Prdlote);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdRTM", gxTv_SdtPRODUC_Prdrtm);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdCtw1", gxTv_SdtPRODUC_Prdctw1);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdCtw2", gxTv_SdtPRODUC_Prdctw2);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdCtw3", gxTv_SdtPRODUC_Prdctw3);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdCtw4", gxTv_SdtPRODUC_Prdctw4);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdNroCAS", gxTv_SdtPRODUC_Prdnrocas);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdGots", gxTv_SdtPRODUC_Prdgots);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdHm", gxTv_SdtPRODUC_Prdhm);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdConct", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdconct, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdEINECS", gxTv_SdtPRODUC_Prdeinecs);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdFuncion", gxTv_SdtPRODUC_Prdfuncion);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdNmQu", gxTv_SdtPRODUC_Prdnmqu);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdList", gxTv_SdtPRODUC_Prdlist);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdFabId", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdfabid, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdFabNm", gxTv_SdtPRODUC_Prdfabnm);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdLoteOb", gxTv_SdtPRODUC_Prdloteob);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdRGB", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdrgb, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdZDHC", gxTv_SdtPRODUC_Prdzdhc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdTHELIST", gxTv_SdtPRODUC_Prdthelist);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdUbicacion", gxTv_SdtPRODUC_Prdubicacion);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdEqLP", gxTv_SdtPRODUC_Prdeqlp);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdPesCon", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdpescon, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdCantAtM", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdcantatm, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdGruFamId", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdgrufamid, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdMatSeca", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prdmatseca, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlmPrdID", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Almprdid, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPRODUC_Prdlotefch), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPRODUC_Prdlotefch), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPRODUC_Prdlotefch), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("PrdLoteFch", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdFTdoc", gxTv_SdtPRODUC_Prdftdoc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdFSdoc", gxTv_SdtPRODUC_Prdfsdoc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdGRS", gxTv_SdtPRODUC_Prdgrs);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdCDsc", gxTv_SdtPRODUC_Prdcdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdDisponible", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prddisponible, 12, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdDiasInactivo", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prddiasinactivo, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdUltMovCC", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdultmovcc, 12, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPRODUC_Prdfecultmov), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPRODUC_Prdfecultmov), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPRODUC_Prdfecultmov), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("PrdFecUltMov", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdTipMovUlt", gxTv_SdtPRODUC_Prdtipmovult);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdLastLineaCC", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdlastlineacc, 12, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPRODUC_Prdlastfechcc), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPRODUC_Prdlastfechcc), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPRODUC_Prdlastfechcc), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("PrdLastFechCC", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdLastTipMovCC", gxTv_SdtPRODUC_Prdlasttipmovcc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdEsCompuesto", GXutil.booltostr( gxTv_SdtPRODUC_Prdescompuesto));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdDiaSinMov", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prddiasinmov, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", gxTv_SdtPRODUC_Mode);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprCod_Z", gxTv_SdtPRODUC_Emprcod_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprNom_Z", gxTv_SdtPRODUC_Emprnom_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdNum_Z", gxTv_SdtPRODUC_Prdnum_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdNom_Z", gxTv_SdtPRODUC_Prdnom_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrvNum_Z", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prvnum_Z, 6, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrvNom_Z", gxTv_SdtPRODUC_Prvnom_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdRefPrv_Z", gxTv_SdtPRODUC_Prdrefprv_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdDscTec_Z", gxTv_SdtPRODUC_Prddsctec_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdUniCom_Z", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdunicom_Z, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdUcpDsc_Z", gxTv_SdtPRODUC_Prducpdsc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdUniCon_Z", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdunicon_Z, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdUcoDsc_Z", gxTv_SdtPRODUC_Prducodsc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdFacCon_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prdfaccon_Z, 7, 4)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ValCod_Z", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Valcod_Z, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ValDsc_Z", gxTv_SdtPRODUC_Valdsc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdRec_Z", gxTv_SdtPRODUC_Prdrec_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdCalNec_Z", gxTv_SdtPRODUC_Prdcalnec_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdDetPar_Z", gxTv_SdtPRODUC_Prddetpar_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdSit_Z", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdsit_Z, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdRotRea_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prdrotrea_Z, 12, 5)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TipDtoCod_Z", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Tipdtocod_Z, 2, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TipDtoDto_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Tipdtodto_Z, 5, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdPreAct_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prdpreact_Z, 14, 5)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPRODUC_Prdfecpre_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPRODUC_Prdfecpre_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPRODUC_Prdfecpre_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("PrdFecPre_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdPreAnt_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prdpreant_Z, 14, 5)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdPreMed_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prdpremed_Z, 14, 5)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdConDia_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prdcondia_Z, 7, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdStkMinD_Z", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdstkmind_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdStkMinU_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prdstkminu_Z, 8, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdDiaRot_Z", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prddiarot_Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdPlaEnt_Z", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdplaent_Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("MetCod_Z", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Metcod_Z, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("MetDsc_Z", gxTv_SdtPRODUC_Metdsc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdLotMin_Z", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdlotmin_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdNumUco_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prdnumuco_Z, 7, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdExiAlm_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prdexialm_Z, 12, 4)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdExiCC_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prdexicc_Z, 12, 4)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdCanRes_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prdcanres_Z, 12, 4)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdCanPen_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prdcanpen_Z, 12, 4)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPRODUC_Prdfulent_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPRODUC_Prdfulent_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPRODUC_Prdfulent_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("PrdFulEnt_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPRODUC_Prdfulped_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPRODUC_Prdfulped_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPRODUC_Prdfulped_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("PrdFulPed_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPRODUC_Prdfulcc_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPRODUC_Prdfulcc_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPRODUC_Prdfulcc_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("PrdFulCC_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdExiCCP_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prdexiccp_Z, 8, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdUltECC_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prdultecc_Z, 8, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdUltCCC_Z", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdultccc_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdUltDCC_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prdultdcc_Z, 8, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdDifCC_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prddifcc_Z, 8, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdConCC_Z", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdconcc_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdValStk_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prdvalstk_Z, 11, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DifValStk_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Difvalstk_Z, 11, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPRODUC_Prdfecent_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPRODUC_Prdfecent_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPRODUC_Prdfecent_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("PrdFecEnt_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdPosX_Z", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdposx_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdPosY_Z", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdposy_Z, 2, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdTip_Z", gxTv_SdtPRODUC_Prdtip_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdDqo_Z", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prddqo_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdRev_Z", gxTv_SdtPRODUC_Prdrev_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdTnq_Z", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdtnq_Z, 2, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdNom2_Z", gxTv_SdtPRODUC_Prdnom2_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdNum2_Z", gxTv_SdtPRODUC_Prdnum2_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdObs_Z", gxTv_SdtPRODUC_Prdobs_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdUMeFo_Z", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdumefo_Z, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdPreAc2_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prdpreac2_Z, 14, 5)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdDensS_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prddenss_Z, 7, 3)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdConcS_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prdconcs_Z, 7, 3)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdSalM_Z", gxTv_SdtPRODUC_Prdsalm_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdSolub_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prdsolub_Z, 7, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TipPrdCod_Z", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Tipprdcod_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TipPrdDsc_Z", gxTv_SdtPRODUC_Tipprddsc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdNumCentra_Z", gxTv_SdtPRODUC_Prdnumcentra_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdNumct1_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prdnumct1_Z, 6, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdNumct2_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prdnumct2_Z, 6, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdHorMad_Z", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdhormad_Z, 2, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdExiAlmc_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prdexialmc_Z, 12, 4)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdPesTerm_Z", gxTv_SdtPRODUC_Prdpesterm_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdSal_Z", gxTv_SdtPRODUC_Prdsal_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("SubFamCod_Z", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Subfamcod_Z, 2, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("SubFamDsc_Z", gxTv_SdtPRODUC_Subfamdsc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdInc_Z", gxTv_SdtPRODUC_Prdinc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdComp_Z", gxTv_SdtPRODUC_Prdcomp_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdAox_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prdaox_Z, 6, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdNCAS_Z", gxTv_SdtPRODUC_Prdncas_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdFT_Z", gxTv_SdtPRODUC_Prdft_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPRODUC_Prdfft_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPRODUC_Prdfft_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPRODUC_Prdfft_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("PrdFFT_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdHS_Z", gxTv_SdtPRODUC_Prdhs_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPRODUC_Prdfhs_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPRODUC_Prdfhs_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPRODUC_Prdfhs_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("PrdFHS_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdColIdx_Z", gxTv_SdtPRODUC_Prdcolidx_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdOkotex_Z", gxTv_SdtPRODUC_Prdokotex_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdReach_Z", gxTv_SdtPRODUC_Prdreach_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdLote_Z", gxTv_SdtPRODUC_Prdlote_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdRTM_Z", gxTv_SdtPRODUC_Prdrtm_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdCtw1_Z", gxTv_SdtPRODUC_Prdctw1_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdCtw2_Z", gxTv_SdtPRODUC_Prdctw2_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdCtw3_Z", gxTv_SdtPRODUC_Prdctw3_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdCtw4_Z", gxTv_SdtPRODUC_Prdctw4_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdNroCAS_Z", gxTv_SdtPRODUC_Prdnrocas_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdGots_Z", gxTv_SdtPRODUC_Prdgots_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdHm_Z", gxTv_SdtPRODUC_Prdhm_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdConct_Z", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdconct_Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdEINECS_Z", gxTv_SdtPRODUC_Prdeinecs_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdFuncion_Z", gxTv_SdtPRODUC_Prdfuncion_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdNmQu_Z", gxTv_SdtPRODUC_Prdnmqu_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdList_Z", gxTv_SdtPRODUC_Prdlist_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdFabId_Z", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdfabid_Z, 6, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdFabNm_Z", gxTv_SdtPRODUC_Prdfabnm_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdLoteOb_Z", gxTv_SdtPRODUC_Prdloteob_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdRGB_Z", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdrgb_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdZDHC_Z", gxTv_SdtPRODUC_Prdzdhc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdTHELIST_Z", gxTv_SdtPRODUC_Prdthelist_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdUbicacion_Z", gxTv_SdtPRODUC_Prdubicacion_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdEqLP_Z", gxTv_SdtPRODUC_Prdeqlp_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdPesCon_Z", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdpescon_Z, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdCantAtM_Z", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdcantatm_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdGruFamId_Z", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdgrufamid_Z, 2, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdMatSeca_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prdmatseca_Z, 6, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlmPrdID_Z", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Almprdid_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPRODUC_Prdlotefch_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPRODUC_Prdlotefch_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPRODUC_Prdlotefch_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("PrdLoteFch_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdFTdoc_Z", gxTv_SdtPRODUC_Prdftdoc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdFSdoc_Z", gxTv_SdtPRODUC_Prdfsdoc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdGRS_Z", gxTv_SdtPRODUC_Prdgrs_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdCDsc_Z", gxTv_SdtPRODUC_Prdcdsc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdDisponible_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtPRODUC_Prddisponible_Z, 12, 4)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdDiasInactivo_Z", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prddiasinactivo_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdUltMovCC_Z", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdultmovcc_Z, 12, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPRODUC_Prdfecultmov_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPRODUC_Prdfecultmov_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPRODUC_Prdfecultmov_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("PrdFecUltMov_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdTipMovUlt_Z", gxTv_SdtPRODUC_Prdtipmovult_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdLastLineaCC_Z", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdlastlineacc_Z, 12, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPRODUC_Prdlastfechcc_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPRODUC_Prdlastfechcc_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPRODUC_Prdlastfechcc_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("PrdLastFechCC_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdLastTipMovCC_Z", gxTv_SdtPRODUC_Prdlasttipmovcc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdEsCompuesto_Z", GXutil.booltostr( gxTv_SdtPRODUC_Prdescompuesto_Z));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdDiaSinMov_Z", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prddiasinmov_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprNom_N", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Emprnom_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdNum_N", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdnum_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrvNom_N", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prvnom_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdUcpDsc_N", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prducpdsc_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdUcoDsc_N", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prducodsc_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ValDsc_N", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Valdsc_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TipDtoCod_N", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Tipdtocod_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TipDtoDto_N", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Tipdtodto_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("MetCod_N", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Metcod_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("MetDsc_N", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Metdsc_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TipPrdCod_N", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Tipprdcod_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TipPrdDsc_N", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Tipprddsc_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("SubFamCod_N", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Subfamcod_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("SubFamDsc_N", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Subfamdsc_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdFabId_N", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdfabid_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdFabNm_N", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdfabnm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdTHELIST_N", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdthelist_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdCantAtM_N", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdcantatm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdGruFamId_N", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdgrufamid_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdMatSeca_N", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdmatseca_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlmPrdID_N", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Almprdid_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdLoteFch_N", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdlotefch_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdFTdoc_N", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdftdoc_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdFSdoc_N", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdfsdoc_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdGRS_N", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdgrs_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdLastLineaCC_N", GXutil.trim( GXutil.str( gxTv_SdtPRODUC_Prdlastlineacc_N, 1, 0)));
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
      AddObjectProperty("EmprCod", gxTv_SdtPRODUC_Emprcod, false, includeNonInitialized);
      AddObjectProperty("EmprNom", gxTv_SdtPRODUC_Emprnom, false, includeNonInitialized);
      AddObjectProperty("EmprNom_N", gxTv_SdtPRODUC_Emprnom_N, false, includeNonInitialized);
      AddObjectProperty("PrdNum", gxTv_SdtPRODUC_Prdnum, false, includeNonInitialized);
      AddObjectProperty("PrdNum_N", gxTv_SdtPRODUC_Prdnum_N, false, includeNonInitialized);
      AddObjectProperty("PrdNom", gxTv_SdtPRODUC_Prdnom, false, includeNonInitialized);
      AddObjectProperty("PrvNum", gxTv_SdtPRODUC_Prvnum, false, includeNonInitialized);
      AddObjectProperty("PrvNom", gxTv_SdtPRODUC_Prvnom, false, includeNonInitialized);
      AddObjectProperty("PrvNom_N", gxTv_SdtPRODUC_Prvnom_N, false, includeNonInitialized);
      AddObjectProperty("PrdRefPrv", gxTv_SdtPRODUC_Prdrefprv, false, includeNonInitialized);
      AddObjectProperty("PrdDscTec", gxTv_SdtPRODUC_Prddsctec, false, includeNonInitialized);
      AddObjectProperty("PrdUniCom", gxTv_SdtPRODUC_Prdunicom, false, includeNonInitialized);
      AddObjectProperty("PrdUcpDsc", gxTv_SdtPRODUC_Prducpdsc, false, includeNonInitialized);
      AddObjectProperty("PrdUcpDsc_N", gxTv_SdtPRODUC_Prducpdsc_N, false, includeNonInitialized);
      AddObjectProperty("PrdUniCon", gxTv_SdtPRODUC_Prdunicon, false, includeNonInitialized);
      AddObjectProperty("PrdUcoDsc", gxTv_SdtPRODUC_Prducodsc, false, includeNonInitialized);
      AddObjectProperty("PrdUcoDsc_N", gxTv_SdtPRODUC_Prducodsc_N, false, includeNonInitialized);
      AddObjectProperty("PrdFacCon", gxTv_SdtPRODUC_Prdfaccon, false, includeNonInitialized);
      AddObjectProperty("ValCod", gxTv_SdtPRODUC_Valcod, false, includeNonInitialized);
      AddObjectProperty("ValDsc", gxTv_SdtPRODUC_Valdsc, false, includeNonInitialized);
      AddObjectProperty("ValDsc_N", gxTv_SdtPRODUC_Valdsc_N, false, includeNonInitialized);
      AddObjectProperty("PrdRec", gxTv_SdtPRODUC_Prdrec, false, includeNonInitialized);
      AddObjectProperty("PrdCalNec", gxTv_SdtPRODUC_Prdcalnec, false, includeNonInitialized);
      AddObjectProperty("PrdDetPar", gxTv_SdtPRODUC_Prddetpar, false, includeNonInitialized);
      AddObjectProperty("PrdSit", gxTv_SdtPRODUC_Prdsit, false, includeNonInitialized);
      AddObjectProperty("PrdRotRea", gxTv_SdtPRODUC_Prdrotrea, false, includeNonInitialized);
      AddObjectProperty("TipDtoCod", gxTv_SdtPRODUC_Tipdtocod, false, includeNonInitialized);
      AddObjectProperty("TipDtoCod_N", gxTv_SdtPRODUC_Tipdtocod_N, false, includeNonInitialized);
      AddObjectProperty("TipDtoDto", gxTv_SdtPRODUC_Tipdtodto, false, includeNonInitialized);
      AddObjectProperty("TipDtoDto_N", gxTv_SdtPRODUC_Tipdtodto_N, false, includeNonInitialized);
      AddObjectProperty("PrdPreAct", gxTv_SdtPRODUC_Prdpreact, false, includeNonInitialized);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPRODUC_Prdfecpre), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPRODUC_Prdfecpre), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPRODUC_Prdfecpre), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("PrdFecPre", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("PrdPreAnt", gxTv_SdtPRODUC_Prdpreant, false, includeNonInitialized);
      AddObjectProperty("PrdPreMed", gxTv_SdtPRODUC_Prdpremed, false, includeNonInitialized);
      AddObjectProperty("PrdConDia", gxTv_SdtPRODUC_Prdcondia, false, includeNonInitialized);
      AddObjectProperty("PrdStkMinD", gxTv_SdtPRODUC_Prdstkmind, false, includeNonInitialized);
      AddObjectProperty("PrdStkMinU", gxTv_SdtPRODUC_Prdstkminu, false, includeNonInitialized);
      AddObjectProperty("PrdDiaRot", gxTv_SdtPRODUC_Prddiarot, false, includeNonInitialized);
      AddObjectProperty("PrdPlaEnt", gxTv_SdtPRODUC_Prdplaent, false, includeNonInitialized);
      AddObjectProperty("MetCod", gxTv_SdtPRODUC_Metcod, false, includeNonInitialized);
      AddObjectProperty("MetCod_N", gxTv_SdtPRODUC_Metcod_N, false, includeNonInitialized);
      AddObjectProperty("MetDsc", gxTv_SdtPRODUC_Metdsc, false, includeNonInitialized);
      AddObjectProperty("MetDsc_N", gxTv_SdtPRODUC_Metdsc_N, false, includeNonInitialized);
      AddObjectProperty("PrdLotMin", gxTv_SdtPRODUC_Prdlotmin, false, includeNonInitialized);
      AddObjectProperty("PrdNumUco", gxTv_SdtPRODUC_Prdnumuco, false, includeNonInitialized);
      AddObjectProperty("PrdExiAlm", gxTv_SdtPRODUC_Prdexialm, false, includeNonInitialized);
      AddObjectProperty("PrdExiCC", gxTv_SdtPRODUC_Prdexicc, false, includeNonInitialized);
      AddObjectProperty("PrdCanRes", gxTv_SdtPRODUC_Prdcanres, false, includeNonInitialized);
      AddObjectProperty("PrdCanPen", gxTv_SdtPRODUC_Prdcanpen, false, includeNonInitialized);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPRODUC_Prdfulent), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPRODUC_Prdfulent), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPRODUC_Prdfulent), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("PrdFulEnt", sDateCnv, false, includeNonInitialized);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPRODUC_Prdfulped), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPRODUC_Prdfulped), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPRODUC_Prdfulped), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("PrdFulPed", sDateCnv, false, includeNonInitialized);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPRODUC_Prdfulcc), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPRODUC_Prdfulcc), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPRODUC_Prdfulcc), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("PrdFulCC", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("PrdExiCCP", gxTv_SdtPRODUC_Prdexiccp, false, includeNonInitialized);
      AddObjectProperty("PrdUltECC", gxTv_SdtPRODUC_Prdultecc, false, includeNonInitialized);
      AddObjectProperty("PrdUltCCC", gxTv_SdtPRODUC_Prdultccc, false, includeNonInitialized);
      AddObjectProperty("PrdUltDCC", gxTv_SdtPRODUC_Prdultdcc, false, includeNonInitialized);
      AddObjectProperty("PrdDifCC", gxTv_SdtPRODUC_Prddifcc, false, includeNonInitialized);
      AddObjectProperty("PrdConCC", gxTv_SdtPRODUC_Prdconcc, false, includeNonInitialized);
      AddObjectProperty("PrdValStk", gxTv_SdtPRODUC_Prdvalstk, false, includeNonInitialized);
      AddObjectProperty("DifValStk", gxTv_SdtPRODUC_Difvalstk, false, includeNonInitialized);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPRODUC_Prdfecent), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPRODUC_Prdfecent), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPRODUC_Prdfecent), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("PrdFecEnt", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("PrdPosX", gxTv_SdtPRODUC_Prdposx, false, includeNonInitialized);
      AddObjectProperty("PrdPosY", gxTv_SdtPRODUC_Prdposy, false, includeNonInitialized);
      AddObjectProperty("PrdTip", gxTv_SdtPRODUC_Prdtip, false, includeNonInitialized);
      AddObjectProperty("PrdDqo", gxTv_SdtPRODUC_Prddqo, false, includeNonInitialized);
      AddObjectProperty("PrdRev", gxTv_SdtPRODUC_Prdrev, false, includeNonInitialized);
      AddObjectProperty("PrdTnq", gxTv_SdtPRODUC_Prdtnq, false, includeNonInitialized);
      AddObjectProperty("PrdNom2", gxTv_SdtPRODUC_Prdnom2, false, includeNonInitialized);
      AddObjectProperty("PrdNum2", gxTv_SdtPRODUC_Prdnum2, false, includeNonInitialized);
      AddObjectProperty("PrdObs", gxTv_SdtPRODUC_Prdobs, false, includeNonInitialized);
      AddObjectProperty("PrdUMeFo", gxTv_SdtPRODUC_Prdumefo, false, includeNonInitialized);
      AddObjectProperty("PrdPreAc2", gxTv_SdtPRODUC_Prdpreac2, false, includeNonInitialized);
      AddObjectProperty("PrdDensS", gxTv_SdtPRODUC_Prddenss, false, includeNonInitialized);
      AddObjectProperty("PrdConcS", gxTv_SdtPRODUC_Prdconcs, false, includeNonInitialized);
      AddObjectProperty("PrdSalM", gxTv_SdtPRODUC_Prdsalm, false, includeNonInitialized);
      AddObjectProperty("PrdSolub", gxTv_SdtPRODUC_Prdsolub, false, includeNonInitialized);
      AddObjectProperty("TipPrdCod", gxTv_SdtPRODUC_Tipprdcod, false, includeNonInitialized);
      AddObjectProperty("TipPrdCod_N", gxTv_SdtPRODUC_Tipprdcod_N, false, includeNonInitialized);
      AddObjectProperty("TipPrdDsc", gxTv_SdtPRODUC_Tipprddsc, false, includeNonInitialized);
      AddObjectProperty("TipPrdDsc_N", gxTv_SdtPRODUC_Tipprddsc_N, false, includeNonInitialized);
      AddObjectProperty("PrdNumCentra", gxTv_SdtPRODUC_Prdnumcentra, false, includeNonInitialized);
      AddObjectProperty("PrdNumct1", gxTv_SdtPRODUC_Prdnumct1, false, includeNonInitialized);
      AddObjectProperty("PrdNumct2", gxTv_SdtPRODUC_Prdnumct2, false, includeNonInitialized);
      AddObjectProperty("PrdHorMad", gxTv_SdtPRODUC_Prdhormad, false, includeNonInitialized);
      AddObjectProperty("PrdExiAlmc", gxTv_SdtPRODUC_Prdexialmc, false, includeNonInitialized);
      AddObjectProperty("PrdPesTerm", gxTv_SdtPRODUC_Prdpesterm, false, includeNonInitialized);
      AddObjectProperty("PrdSal", gxTv_SdtPRODUC_Prdsal, false, includeNonInitialized);
      AddObjectProperty("SubFamCod", gxTv_SdtPRODUC_Subfamcod, false, includeNonInitialized);
      AddObjectProperty("SubFamCod_N", gxTv_SdtPRODUC_Subfamcod_N, false, includeNonInitialized);
      AddObjectProperty("SubFamDsc", gxTv_SdtPRODUC_Subfamdsc, false, includeNonInitialized);
      AddObjectProperty("SubFamDsc_N", gxTv_SdtPRODUC_Subfamdsc_N, false, includeNonInitialized);
      AddObjectProperty("PrdInc", gxTv_SdtPRODUC_Prdinc, false, includeNonInitialized);
      AddObjectProperty("PrdComp", gxTv_SdtPRODUC_Prdcomp, false, includeNonInitialized);
      AddObjectProperty("PrdAox", gxTv_SdtPRODUC_Prdaox, false, includeNonInitialized);
      AddObjectProperty("PrdNCAS", gxTv_SdtPRODUC_Prdncas, false, includeNonInitialized);
      AddObjectProperty("PrdFT", gxTv_SdtPRODUC_Prdft, false, includeNonInitialized);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPRODUC_Prdfft), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPRODUC_Prdfft), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPRODUC_Prdfft), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("PrdFFT", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("PrdHS", gxTv_SdtPRODUC_Prdhs, false, includeNonInitialized);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPRODUC_Prdfhs), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPRODUC_Prdfhs), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPRODUC_Prdfhs), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("PrdFHS", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("PrdColIdx", gxTv_SdtPRODUC_Prdcolidx, false, includeNonInitialized);
      AddObjectProperty("PrdOkotex", gxTv_SdtPRODUC_Prdokotex, false, includeNonInitialized);
      AddObjectProperty("PrdReach", gxTv_SdtPRODUC_Prdreach, false, includeNonInitialized);
      AddObjectProperty("PrdLote", gxTv_SdtPRODUC_Prdlote, false, includeNonInitialized);
      AddObjectProperty("PrdRTM", gxTv_SdtPRODUC_Prdrtm, false, includeNonInitialized);
      AddObjectProperty("PrdCtw1", gxTv_SdtPRODUC_Prdctw1, false, includeNonInitialized);
      AddObjectProperty("PrdCtw2", gxTv_SdtPRODUC_Prdctw2, false, includeNonInitialized);
      AddObjectProperty("PrdCtw3", gxTv_SdtPRODUC_Prdctw3, false, includeNonInitialized);
      AddObjectProperty("PrdCtw4", gxTv_SdtPRODUC_Prdctw4, false, includeNonInitialized);
      AddObjectProperty("PrdNroCAS", gxTv_SdtPRODUC_Prdnrocas, false, includeNonInitialized);
      AddObjectProperty("PrdGots", gxTv_SdtPRODUC_Prdgots, false, includeNonInitialized);
      AddObjectProperty("PrdHm", gxTv_SdtPRODUC_Prdhm, false, includeNonInitialized);
      AddObjectProperty("PrdConct", gxTv_SdtPRODUC_Prdconct, false, includeNonInitialized);
      AddObjectProperty("PrdEINECS", gxTv_SdtPRODUC_Prdeinecs, false, includeNonInitialized);
      AddObjectProperty("PrdFuncion", gxTv_SdtPRODUC_Prdfuncion, false, includeNonInitialized);
      AddObjectProperty("PrdNmQu", gxTv_SdtPRODUC_Prdnmqu, false, includeNonInitialized);
      AddObjectProperty("PrdList", gxTv_SdtPRODUC_Prdlist, false, includeNonInitialized);
      AddObjectProperty("PrdFabId", gxTv_SdtPRODUC_Prdfabid, false, includeNonInitialized);
      AddObjectProperty("PrdFabId_N", gxTv_SdtPRODUC_Prdfabid_N, false, includeNonInitialized);
      AddObjectProperty("PrdFabNm", gxTv_SdtPRODUC_Prdfabnm, false, includeNonInitialized);
      AddObjectProperty("PrdFabNm_N", gxTv_SdtPRODUC_Prdfabnm_N, false, includeNonInitialized);
      AddObjectProperty("PrdLoteOb", gxTv_SdtPRODUC_Prdloteob, false, includeNonInitialized);
      AddObjectProperty("PrdRGB", gxTv_SdtPRODUC_Prdrgb, false, includeNonInitialized);
      AddObjectProperty("PrdZDHC", gxTv_SdtPRODUC_Prdzdhc, false, includeNonInitialized);
      AddObjectProperty("PrdTHELIST", gxTv_SdtPRODUC_Prdthelist, false, includeNonInitialized);
      AddObjectProperty("PrdTHELIST_N", gxTv_SdtPRODUC_Prdthelist_N, false, includeNonInitialized);
      AddObjectProperty("PrdUbicacion", gxTv_SdtPRODUC_Prdubicacion, false, includeNonInitialized);
      AddObjectProperty("PrdEqLP", gxTv_SdtPRODUC_Prdeqlp, false, includeNonInitialized);
      AddObjectProperty("PrdPesCon", gxTv_SdtPRODUC_Prdpescon, false, includeNonInitialized);
      AddObjectProperty("PrdCantAtM", gxTv_SdtPRODUC_Prdcantatm, false, includeNonInitialized);
      AddObjectProperty("PrdCantAtM_N", gxTv_SdtPRODUC_Prdcantatm_N, false, includeNonInitialized);
      AddObjectProperty("PrdGruFamId", gxTv_SdtPRODUC_Prdgrufamid, false, includeNonInitialized);
      AddObjectProperty("PrdGruFamId_N", gxTv_SdtPRODUC_Prdgrufamid_N, false, includeNonInitialized);
      AddObjectProperty("PrdMatSeca", gxTv_SdtPRODUC_Prdmatseca, false, includeNonInitialized);
      AddObjectProperty("PrdMatSeca_N", gxTv_SdtPRODUC_Prdmatseca_N, false, includeNonInitialized);
      AddObjectProperty("AlmPrdID", gxTv_SdtPRODUC_Almprdid, false, includeNonInitialized);
      AddObjectProperty("AlmPrdID_N", gxTv_SdtPRODUC_Almprdid_N, false, includeNonInitialized);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPRODUC_Prdlotefch), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPRODUC_Prdlotefch), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPRODUC_Prdlotefch), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("PrdLoteFch", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("PrdLoteFch_N", gxTv_SdtPRODUC_Prdlotefch_N, false, includeNonInitialized);
      AddObjectProperty("PrdFTdoc", gxTv_SdtPRODUC_Prdftdoc, false, includeNonInitialized);
      AddObjectProperty("PrdFTdoc_N", gxTv_SdtPRODUC_Prdftdoc_N, false, includeNonInitialized);
      AddObjectProperty("PrdFSdoc", gxTv_SdtPRODUC_Prdfsdoc, false, includeNonInitialized);
      AddObjectProperty("PrdFSdoc_N", gxTv_SdtPRODUC_Prdfsdoc_N, false, includeNonInitialized);
      AddObjectProperty("PrdGRS", gxTv_SdtPRODUC_Prdgrs, false, includeNonInitialized);
      AddObjectProperty("PrdGRS_N", gxTv_SdtPRODUC_Prdgrs_N, false, includeNonInitialized);
      AddObjectProperty("PrdCDsc", gxTv_SdtPRODUC_Prdcdsc, false, includeNonInitialized);
      AddObjectProperty("PrdDisponible", gxTv_SdtPRODUC_Prddisponible, false, includeNonInitialized);
      AddObjectProperty("PrdDiasInactivo", gxTv_SdtPRODUC_Prddiasinactivo, false, includeNonInitialized);
      AddObjectProperty("PrdUltMovCC", gxTv_SdtPRODUC_Prdultmovcc, false, includeNonInitialized);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPRODUC_Prdfecultmov), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPRODUC_Prdfecultmov), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPRODUC_Prdfecultmov), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("PrdFecUltMov", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("PrdTipMovUlt", gxTv_SdtPRODUC_Prdtipmovult, false, includeNonInitialized);
      AddObjectProperty("PrdLastLineaCC", gxTv_SdtPRODUC_Prdlastlineacc, false, includeNonInitialized);
      AddObjectProperty("PrdLastLineaCC_N", gxTv_SdtPRODUC_Prdlastlineacc_N, false, includeNonInitialized);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPRODUC_Prdlastfechcc), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPRODUC_Prdlastfechcc), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPRODUC_Prdlastfechcc), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("PrdLastFechCC", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("PrdLastTipMovCC", gxTv_SdtPRODUC_Prdlasttipmovcc, false, includeNonInitialized);
      AddObjectProperty("PrdEsCompuesto", gxTv_SdtPRODUC_Prdescompuesto, false, includeNonInitialized);
      AddObjectProperty("PrdDiaSinMov", gxTv_SdtPRODUC_Prddiasinmov, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtPRODUC_Mode, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_SdtPRODUC_Initialized, false, includeNonInitialized);
         AddObjectProperty("EmprCod_Z", gxTv_SdtPRODUC_Emprcod_Z, false, includeNonInitialized);
         AddObjectProperty("EmprNom_Z", gxTv_SdtPRODUC_Emprnom_Z, false, includeNonInitialized);
         AddObjectProperty("PrdNum_Z", gxTv_SdtPRODUC_Prdnum_Z, false, includeNonInitialized);
         AddObjectProperty("PrdNom_Z", gxTv_SdtPRODUC_Prdnom_Z, false, includeNonInitialized);
         AddObjectProperty("PrvNum_Z", gxTv_SdtPRODUC_Prvnum_Z, false, includeNonInitialized);
         AddObjectProperty("PrvNom_Z", gxTv_SdtPRODUC_Prvnom_Z, false, includeNonInitialized);
         AddObjectProperty("PrdRefPrv_Z", gxTv_SdtPRODUC_Prdrefprv_Z, false, includeNonInitialized);
         AddObjectProperty("PrdDscTec_Z", gxTv_SdtPRODUC_Prddsctec_Z, false, includeNonInitialized);
         AddObjectProperty("PrdUniCom_Z", gxTv_SdtPRODUC_Prdunicom_Z, false, includeNonInitialized);
         AddObjectProperty("PrdUcpDsc_Z", gxTv_SdtPRODUC_Prducpdsc_Z, false, includeNonInitialized);
         AddObjectProperty("PrdUniCon_Z", gxTv_SdtPRODUC_Prdunicon_Z, false, includeNonInitialized);
         AddObjectProperty("PrdUcoDsc_Z", gxTv_SdtPRODUC_Prducodsc_Z, false, includeNonInitialized);
         AddObjectProperty("PrdFacCon_Z", gxTv_SdtPRODUC_Prdfaccon_Z, false, includeNonInitialized);
         AddObjectProperty("ValCod_Z", gxTv_SdtPRODUC_Valcod_Z, false, includeNonInitialized);
         AddObjectProperty("ValDsc_Z", gxTv_SdtPRODUC_Valdsc_Z, false, includeNonInitialized);
         AddObjectProperty("PrdRec_Z", gxTv_SdtPRODUC_Prdrec_Z, false, includeNonInitialized);
         AddObjectProperty("PrdCalNec_Z", gxTv_SdtPRODUC_Prdcalnec_Z, false, includeNonInitialized);
         AddObjectProperty("PrdDetPar_Z", gxTv_SdtPRODUC_Prddetpar_Z, false, includeNonInitialized);
         AddObjectProperty("PrdSit_Z", gxTv_SdtPRODUC_Prdsit_Z, false, includeNonInitialized);
         AddObjectProperty("PrdRotRea_Z", gxTv_SdtPRODUC_Prdrotrea_Z, false, includeNonInitialized);
         AddObjectProperty("TipDtoCod_Z", gxTv_SdtPRODUC_Tipdtocod_Z, false, includeNonInitialized);
         AddObjectProperty("TipDtoDto_Z", gxTv_SdtPRODUC_Tipdtodto_Z, false, includeNonInitialized);
         AddObjectProperty("PrdPreAct_Z", gxTv_SdtPRODUC_Prdpreact_Z, false, includeNonInitialized);
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPRODUC_Prdfecpre_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPRODUC_Prdfecpre_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPRODUC_Prdfecpre_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("PrdFecPre_Z", sDateCnv, false, includeNonInitialized);
         AddObjectProperty("PrdPreAnt_Z", gxTv_SdtPRODUC_Prdpreant_Z, false, includeNonInitialized);
         AddObjectProperty("PrdPreMed_Z", gxTv_SdtPRODUC_Prdpremed_Z, false, includeNonInitialized);
         AddObjectProperty("PrdConDia_Z", gxTv_SdtPRODUC_Prdcondia_Z, false, includeNonInitialized);
         AddObjectProperty("PrdStkMinD_Z", gxTv_SdtPRODUC_Prdstkmind_Z, false, includeNonInitialized);
         AddObjectProperty("PrdStkMinU_Z", gxTv_SdtPRODUC_Prdstkminu_Z, false, includeNonInitialized);
         AddObjectProperty("PrdDiaRot_Z", gxTv_SdtPRODUC_Prddiarot_Z, false, includeNonInitialized);
         AddObjectProperty("PrdPlaEnt_Z", gxTv_SdtPRODUC_Prdplaent_Z, false, includeNonInitialized);
         AddObjectProperty("MetCod_Z", gxTv_SdtPRODUC_Metcod_Z, false, includeNonInitialized);
         AddObjectProperty("MetDsc_Z", gxTv_SdtPRODUC_Metdsc_Z, false, includeNonInitialized);
         AddObjectProperty("PrdLotMin_Z", gxTv_SdtPRODUC_Prdlotmin_Z, false, includeNonInitialized);
         AddObjectProperty("PrdNumUco_Z", gxTv_SdtPRODUC_Prdnumuco_Z, false, includeNonInitialized);
         AddObjectProperty("PrdExiAlm_Z", gxTv_SdtPRODUC_Prdexialm_Z, false, includeNonInitialized);
         AddObjectProperty("PrdExiCC_Z", gxTv_SdtPRODUC_Prdexicc_Z, false, includeNonInitialized);
         AddObjectProperty("PrdCanRes_Z", gxTv_SdtPRODUC_Prdcanres_Z, false, includeNonInitialized);
         AddObjectProperty("PrdCanPen_Z", gxTv_SdtPRODUC_Prdcanpen_Z, false, includeNonInitialized);
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPRODUC_Prdfulent_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPRODUC_Prdfulent_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPRODUC_Prdfulent_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("PrdFulEnt_Z", sDateCnv, false, includeNonInitialized);
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPRODUC_Prdfulped_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPRODUC_Prdfulped_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPRODUC_Prdfulped_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("PrdFulPed_Z", sDateCnv, false, includeNonInitialized);
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPRODUC_Prdfulcc_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPRODUC_Prdfulcc_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPRODUC_Prdfulcc_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("PrdFulCC_Z", sDateCnv, false, includeNonInitialized);
         AddObjectProperty("PrdExiCCP_Z", gxTv_SdtPRODUC_Prdexiccp_Z, false, includeNonInitialized);
         AddObjectProperty("PrdUltECC_Z", gxTv_SdtPRODUC_Prdultecc_Z, false, includeNonInitialized);
         AddObjectProperty("PrdUltCCC_Z", gxTv_SdtPRODUC_Prdultccc_Z, false, includeNonInitialized);
         AddObjectProperty("PrdUltDCC_Z", gxTv_SdtPRODUC_Prdultdcc_Z, false, includeNonInitialized);
         AddObjectProperty("PrdDifCC_Z", gxTv_SdtPRODUC_Prddifcc_Z, false, includeNonInitialized);
         AddObjectProperty("PrdConCC_Z", gxTv_SdtPRODUC_Prdconcc_Z, false, includeNonInitialized);
         AddObjectProperty("PrdValStk_Z", gxTv_SdtPRODUC_Prdvalstk_Z, false, includeNonInitialized);
         AddObjectProperty("DifValStk_Z", gxTv_SdtPRODUC_Difvalstk_Z, false, includeNonInitialized);
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPRODUC_Prdfecent_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPRODUC_Prdfecent_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPRODUC_Prdfecent_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("PrdFecEnt_Z", sDateCnv, false, includeNonInitialized);
         AddObjectProperty("PrdPosX_Z", gxTv_SdtPRODUC_Prdposx_Z, false, includeNonInitialized);
         AddObjectProperty("PrdPosY_Z", gxTv_SdtPRODUC_Prdposy_Z, false, includeNonInitialized);
         AddObjectProperty("PrdTip_Z", gxTv_SdtPRODUC_Prdtip_Z, false, includeNonInitialized);
         AddObjectProperty("PrdDqo_Z", gxTv_SdtPRODUC_Prddqo_Z, false, includeNonInitialized);
         AddObjectProperty("PrdRev_Z", gxTv_SdtPRODUC_Prdrev_Z, false, includeNonInitialized);
         AddObjectProperty("PrdTnq_Z", gxTv_SdtPRODUC_Prdtnq_Z, false, includeNonInitialized);
         AddObjectProperty("PrdNom2_Z", gxTv_SdtPRODUC_Prdnom2_Z, false, includeNonInitialized);
         AddObjectProperty("PrdNum2_Z", gxTv_SdtPRODUC_Prdnum2_Z, false, includeNonInitialized);
         AddObjectProperty("PrdObs_Z", gxTv_SdtPRODUC_Prdobs_Z, false, includeNonInitialized);
         AddObjectProperty("PrdUMeFo_Z", gxTv_SdtPRODUC_Prdumefo_Z, false, includeNonInitialized);
         AddObjectProperty("PrdPreAc2_Z", gxTv_SdtPRODUC_Prdpreac2_Z, false, includeNonInitialized);
         AddObjectProperty("PrdDensS_Z", gxTv_SdtPRODUC_Prddenss_Z, false, includeNonInitialized);
         AddObjectProperty("PrdConcS_Z", gxTv_SdtPRODUC_Prdconcs_Z, false, includeNonInitialized);
         AddObjectProperty("PrdSalM_Z", gxTv_SdtPRODUC_Prdsalm_Z, false, includeNonInitialized);
         AddObjectProperty("PrdSolub_Z", gxTv_SdtPRODUC_Prdsolub_Z, false, includeNonInitialized);
         AddObjectProperty("TipPrdCod_Z", gxTv_SdtPRODUC_Tipprdcod_Z, false, includeNonInitialized);
         AddObjectProperty("TipPrdDsc_Z", gxTv_SdtPRODUC_Tipprddsc_Z, false, includeNonInitialized);
         AddObjectProperty("PrdNumCentra_Z", gxTv_SdtPRODUC_Prdnumcentra_Z, false, includeNonInitialized);
         AddObjectProperty("PrdNumct1_Z", gxTv_SdtPRODUC_Prdnumct1_Z, false, includeNonInitialized);
         AddObjectProperty("PrdNumct2_Z", gxTv_SdtPRODUC_Prdnumct2_Z, false, includeNonInitialized);
         AddObjectProperty("PrdHorMad_Z", gxTv_SdtPRODUC_Prdhormad_Z, false, includeNonInitialized);
         AddObjectProperty("PrdExiAlmc_Z", gxTv_SdtPRODUC_Prdexialmc_Z, false, includeNonInitialized);
         AddObjectProperty("PrdPesTerm_Z", gxTv_SdtPRODUC_Prdpesterm_Z, false, includeNonInitialized);
         AddObjectProperty("PrdSal_Z", gxTv_SdtPRODUC_Prdsal_Z, false, includeNonInitialized);
         AddObjectProperty("SubFamCod_Z", gxTv_SdtPRODUC_Subfamcod_Z, false, includeNonInitialized);
         AddObjectProperty("SubFamDsc_Z", gxTv_SdtPRODUC_Subfamdsc_Z, false, includeNonInitialized);
         AddObjectProperty("PrdInc_Z", gxTv_SdtPRODUC_Prdinc_Z, false, includeNonInitialized);
         AddObjectProperty("PrdComp_Z", gxTv_SdtPRODUC_Prdcomp_Z, false, includeNonInitialized);
         AddObjectProperty("PrdAox_Z", gxTv_SdtPRODUC_Prdaox_Z, false, includeNonInitialized);
         AddObjectProperty("PrdNCAS_Z", gxTv_SdtPRODUC_Prdncas_Z, false, includeNonInitialized);
         AddObjectProperty("PrdFT_Z", gxTv_SdtPRODUC_Prdft_Z, false, includeNonInitialized);
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPRODUC_Prdfft_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPRODUC_Prdfft_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPRODUC_Prdfft_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("PrdFFT_Z", sDateCnv, false, includeNonInitialized);
         AddObjectProperty("PrdHS_Z", gxTv_SdtPRODUC_Prdhs_Z, false, includeNonInitialized);
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPRODUC_Prdfhs_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPRODUC_Prdfhs_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPRODUC_Prdfhs_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("PrdFHS_Z", sDateCnv, false, includeNonInitialized);
         AddObjectProperty("PrdColIdx_Z", gxTv_SdtPRODUC_Prdcolidx_Z, false, includeNonInitialized);
         AddObjectProperty("PrdOkotex_Z", gxTv_SdtPRODUC_Prdokotex_Z, false, includeNonInitialized);
         AddObjectProperty("PrdReach_Z", gxTv_SdtPRODUC_Prdreach_Z, false, includeNonInitialized);
         AddObjectProperty("PrdLote_Z", gxTv_SdtPRODUC_Prdlote_Z, false, includeNonInitialized);
         AddObjectProperty("PrdRTM_Z", gxTv_SdtPRODUC_Prdrtm_Z, false, includeNonInitialized);
         AddObjectProperty("PrdCtw1_Z", gxTv_SdtPRODUC_Prdctw1_Z, false, includeNonInitialized);
         AddObjectProperty("PrdCtw2_Z", gxTv_SdtPRODUC_Prdctw2_Z, false, includeNonInitialized);
         AddObjectProperty("PrdCtw3_Z", gxTv_SdtPRODUC_Prdctw3_Z, false, includeNonInitialized);
         AddObjectProperty("PrdCtw4_Z", gxTv_SdtPRODUC_Prdctw4_Z, false, includeNonInitialized);
         AddObjectProperty("PrdNroCAS_Z", gxTv_SdtPRODUC_Prdnrocas_Z, false, includeNonInitialized);
         AddObjectProperty("PrdGots_Z", gxTv_SdtPRODUC_Prdgots_Z, false, includeNonInitialized);
         AddObjectProperty("PrdHm_Z", gxTv_SdtPRODUC_Prdhm_Z, false, includeNonInitialized);
         AddObjectProperty("PrdConct_Z", gxTv_SdtPRODUC_Prdconct_Z, false, includeNonInitialized);
         AddObjectProperty("PrdEINECS_Z", gxTv_SdtPRODUC_Prdeinecs_Z, false, includeNonInitialized);
         AddObjectProperty("PrdFuncion_Z", gxTv_SdtPRODUC_Prdfuncion_Z, false, includeNonInitialized);
         AddObjectProperty("PrdNmQu_Z", gxTv_SdtPRODUC_Prdnmqu_Z, false, includeNonInitialized);
         AddObjectProperty("PrdList_Z", gxTv_SdtPRODUC_Prdlist_Z, false, includeNonInitialized);
         AddObjectProperty("PrdFabId_Z", gxTv_SdtPRODUC_Prdfabid_Z, false, includeNonInitialized);
         AddObjectProperty("PrdFabNm_Z", gxTv_SdtPRODUC_Prdfabnm_Z, false, includeNonInitialized);
         AddObjectProperty("PrdLoteOb_Z", gxTv_SdtPRODUC_Prdloteob_Z, false, includeNonInitialized);
         AddObjectProperty("PrdRGB_Z", gxTv_SdtPRODUC_Prdrgb_Z, false, includeNonInitialized);
         AddObjectProperty("PrdZDHC_Z", gxTv_SdtPRODUC_Prdzdhc_Z, false, includeNonInitialized);
         AddObjectProperty("PrdTHELIST_Z", gxTv_SdtPRODUC_Prdthelist_Z, false, includeNonInitialized);
         AddObjectProperty("PrdUbicacion_Z", gxTv_SdtPRODUC_Prdubicacion_Z, false, includeNonInitialized);
         AddObjectProperty("PrdEqLP_Z", gxTv_SdtPRODUC_Prdeqlp_Z, false, includeNonInitialized);
         AddObjectProperty("PrdPesCon_Z", gxTv_SdtPRODUC_Prdpescon_Z, false, includeNonInitialized);
         AddObjectProperty("PrdCantAtM_Z", gxTv_SdtPRODUC_Prdcantatm_Z, false, includeNonInitialized);
         AddObjectProperty("PrdGruFamId_Z", gxTv_SdtPRODUC_Prdgrufamid_Z, false, includeNonInitialized);
         AddObjectProperty("PrdMatSeca_Z", gxTv_SdtPRODUC_Prdmatseca_Z, false, includeNonInitialized);
         AddObjectProperty("AlmPrdID_Z", gxTv_SdtPRODUC_Almprdid_Z, false, includeNonInitialized);
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPRODUC_Prdlotefch_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPRODUC_Prdlotefch_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPRODUC_Prdlotefch_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("PrdLoteFch_Z", sDateCnv, false, includeNonInitialized);
         AddObjectProperty("PrdFTdoc_Z", gxTv_SdtPRODUC_Prdftdoc_Z, false, includeNonInitialized);
         AddObjectProperty("PrdFSdoc_Z", gxTv_SdtPRODUC_Prdfsdoc_Z, false, includeNonInitialized);
         AddObjectProperty("PrdGRS_Z", gxTv_SdtPRODUC_Prdgrs_Z, false, includeNonInitialized);
         AddObjectProperty("PrdCDsc_Z", gxTv_SdtPRODUC_Prdcdsc_Z, false, includeNonInitialized);
         AddObjectProperty("PrdDisponible_Z", gxTv_SdtPRODUC_Prddisponible_Z, false, includeNonInitialized);
         AddObjectProperty("PrdDiasInactivo_Z", gxTv_SdtPRODUC_Prddiasinactivo_Z, false, includeNonInitialized);
         AddObjectProperty("PrdUltMovCC_Z", gxTv_SdtPRODUC_Prdultmovcc_Z, false, includeNonInitialized);
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPRODUC_Prdfecultmov_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPRODUC_Prdfecultmov_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPRODUC_Prdfecultmov_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("PrdFecUltMov_Z", sDateCnv, false, includeNonInitialized);
         AddObjectProperty("PrdTipMovUlt_Z", gxTv_SdtPRODUC_Prdtipmovult_Z, false, includeNonInitialized);
         AddObjectProperty("PrdLastLineaCC_Z", gxTv_SdtPRODUC_Prdlastlineacc_Z, false, includeNonInitialized);
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPRODUC_Prdlastfechcc_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPRODUC_Prdlastfechcc_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPRODUC_Prdlastfechcc_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("PrdLastFechCC_Z", sDateCnv, false, includeNonInitialized);
         AddObjectProperty("PrdLastTipMovCC_Z", gxTv_SdtPRODUC_Prdlasttipmovcc_Z, false, includeNonInitialized);
         AddObjectProperty("PrdEsCompuesto_Z", gxTv_SdtPRODUC_Prdescompuesto_Z, false, includeNonInitialized);
         AddObjectProperty("PrdDiaSinMov_Z", gxTv_SdtPRODUC_Prddiasinmov_Z, false, includeNonInitialized);
         AddObjectProperty("EmprNom_N", gxTv_SdtPRODUC_Emprnom_N, false, includeNonInitialized);
         AddObjectProperty("PrdNum_N", gxTv_SdtPRODUC_Prdnum_N, false, includeNonInitialized);
         AddObjectProperty("PrvNom_N", gxTv_SdtPRODUC_Prvnom_N, false, includeNonInitialized);
         AddObjectProperty("PrdUcpDsc_N", gxTv_SdtPRODUC_Prducpdsc_N, false, includeNonInitialized);
         AddObjectProperty("PrdUcoDsc_N", gxTv_SdtPRODUC_Prducodsc_N, false, includeNonInitialized);
         AddObjectProperty("ValDsc_N", gxTv_SdtPRODUC_Valdsc_N, false, includeNonInitialized);
         AddObjectProperty("TipDtoCod_N", gxTv_SdtPRODUC_Tipdtocod_N, false, includeNonInitialized);
         AddObjectProperty("TipDtoDto_N", gxTv_SdtPRODUC_Tipdtodto_N, false, includeNonInitialized);
         AddObjectProperty("MetCod_N", gxTv_SdtPRODUC_Metcod_N, false, includeNonInitialized);
         AddObjectProperty("MetDsc_N", gxTv_SdtPRODUC_Metdsc_N, false, includeNonInitialized);
         AddObjectProperty("TipPrdCod_N", gxTv_SdtPRODUC_Tipprdcod_N, false, includeNonInitialized);
         AddObjectProperty("TipPrdDsc_N", gxTv_SdtPRODUC_Tipprddsc_N, false, includeNonInitialized);
         AddObjectProperty("SubFamCod_N", gxTv_SdtPRODUC_Subfamcod_N, false, includeNonInitialized);
         AddObjectProperty("SubFamDsc_N", gxTv_SdtPRODUC_Subfamdsc_N, false, includeNonInitialized);
         AddObjectProperty("PrdFabId_N", gxTv_SdtPRODUC_Prdfabid_N, false, includeNonInitialized);
         AddObjectProperty("PrdFabNm_N", gxTv_SdtPRODUC_Prdfabnm_N, false, includeNonInitialized);
         AddObjectProperty("PrdTHELIST_N", gxTv_SdtPRODUC_Prdthelist_N, false, includeNonInitialized);
         AddObjectProperty("PrdCantAtM_N", gxTv_SdtPRODUC_Prdcantatm_N, false, includeNonInitialized);
         AddObjectProperty("PrdGruFamId_N", gxTv_SdtPRODUC_Prdgrufamid_N, false, includeNonInitialized);
         AddObjectProperty("PrdMatSeca_N", gxTv_SdtPRODUC_Prdmatseca_N, false, includeNonInitialized);
         AddObjectProperty("AlmPrdID_N", gxTv_SdtPRODUC_Almprdid_N, false, includeNonInitialized);
         AddObjectProperty("PrdLoteFch_N", gxTv_SdtPRODUC_Prdlotefch_N, false, includeNonInitialized);
         AddObjectProperty("PrdFTdoc_N", gxTv_SdtPRODUC_Prdftdoc_N, false, includeNonInitialized);
         AddObjectProperty("PrdFSdoc_N", gxTv_SdtPRODUC_Prdfsdoc_N, false, includeNonInitialized);
         AddObjectProperty("PrdGRS_N", gxTv_SdtPRODUC_Prdgrs_N, false, includeNonInitialized);
         AddObjectProperty("PrdLastLineaCC_N", gxTv_SdtPRODUC_Prdlastlineacc_N, false, includeNonInitialized);
      }
   }

   public void updateDirties( app.stocksquimicos.SdtPRODUC sdt )
   {
      if ( sdt.IsDirty("EmprCod") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Emprcod = sdt.getgxTv_SdtPRODUC_Emprcod() ;
      }
      if ( sdt.IsDirty("EmprNom") )
      {
         gxTv_SdtPRODUC_Emprnom_N = sdt.getgxTv_SdtPRODUC_Emprnom_N() ;
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Emprnom = sdt.getgxTv_SdtPRODUC_Emprnom() ;
      }
      if ( sdt.IsDirty("PrdNum") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdnum = sdt.getgxTv_SdtPRODUC_Prdnum() ;
      }
      if ( sdt.IsDirty("PrdNom") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdnom = sdt.getgxTv_SdtPRODUC_Prdnom() ;
      }
      if ( sdt.IsDirty("PrvNum") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prvnum = sdt.getgxTv_SdtPRODUC_Prvnum() ;
      }
      if ( sdt.IsDirty("PrvNom") )
      {
         gxTv_SdtPRODUC_Prvnom_N = sdt.getgxTv_SdtPRODUC_Prvnom_N() ;
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prvnom = sdt.getgxTv_SdtPRODUC_Prvnom() ;
      }
      if ( sdt.IsDirty("PrdRefPrv") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdrefprv = sdt.getgxTv_SdtPRODUC_Prdrefprv() ;
      }
      if ( sdt.IsDirty("PrdDscTec") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prddsctec = sdt.getgxTv_SdtPRODUC_Prddsctec() ;
      }
      if ( sdt.IsDirty("PrdUniCom") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdunicom = sdt.getgxTv_SdtPRODUC_Prdunicom() ;
      }
      if ( sdt.IsDirty("PrdUcpDsc") )
      {
         gxTv_SdtPRODUC_Prducpdsc_N = sdt.getgxTv_SdtPRODUC_Prducpdsc_N() ;
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prducpdsc = sdt.getgxTv_SdtPRODUC_Prducpdsc() ;
      }
      if ( sdt.IsDirty("PrdUniCon") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdunicon = sdt.getgxTv_SdtPRODUC_Prdunicon() ;
      }
      if ( sdt.IsDirty("PrdUcoDsc") )
      {
         gxTv_SdtPRODUC_Prducodsc_N = sdt.getgxTv_SdtPRODUC_Prducodsc_N() ;
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prducodsc = sdt.getgxTv_SdtPRODUC_Prducodsc() ;
      }
      if ( sdt.IsDirty("PrdFacCon") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdfaccon = sdt.getgxTv_SdtPRODUC_Prdfaccon() ;
      }
      if ( sdt.IsDirty("ValCod") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Valcod = sdt.getgxTv_SdtPRODUC_Valcod() ;
      }
      if ( sdt.IsDirty("ValDsc") )
      {
         gxTv_SdtPRODUC_Valdsc_N = sdt.getgxTv_SdtPRODUC_Valdsc_N() ;
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Valdsc = sdt.getgxTv_SdtPRODUC_Valdsc() ;
      }
      if ( sdt.IsDirty("PrdRec") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdrec = sdt.getgxTv_SdtPRODUC_Prdrec() ;
      }
      if ( sdt.IsDirty("PrdCalNec") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdcalnec = sdt.getgxTv_SdtPRODUC_Prdcalnec() ;
      }
      if ( sdt.IsDirty("PrdDetPar") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prddetpar = sdt.getgxTv_SdtPRODUC_Prddetpar() ;
      }
      if ( sdt.IsDirty("PrdSit") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdsit = sdt.getgxTv_SdtPRODUC_Prdsit() ;
      }
      if ( sdt.IsDirty("PrdRotRea") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdrotrea = sdt.getgxTv_SdtPRODUC_Prdrotrea() ;
      }
      if ( sdt.IsDirty("TipDtoCod") )
      {
         gxTv_SdtPRODUC_Tipdtocod_N = sdt.getgxTv_SdtPRODUC_Tipdtocod_N() ;
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Tipdtocod = sdt.getgxTv_SdtPRODUC_Tipdtocod() ;
      }
      if ( sdt.IsDirty("TipDtoDto") )
      {
         gxTv_SdtPRODUC_Tipdtodto_N = sdt.getgxTv_SdtPRODUC_Tipdtodto_N() ;
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Tipdtodto = sdt.getgxTv_SdtPRODUC_Tipdtodto() ;
      }
      if ( sdt.IsDirty("PrdPreAct") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdpreact = sdt.getgxTv_SdtPRODUC_Prdpreact() ;
      }
      if ( sdt.IsDirty("PrdFecPre") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdfecpre = sdt.getgxTv_SdtPRODUC_Prdfecpre() ;
      }
      if ( sdt.IsDirty("PrdPreAnt") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdpreant = sdt.getgxTv_SdtPRODUC_Prdpreant() ;
      }
      if ( sdt.IsDirty("PrdPreMed") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdpremed = sdt.getgxTv_SdtPRODUC_Prdpremed() ;
      }
      if ( sdt.IsDirty("PrdConDia") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdcondia = sdt.getgxTv_SdtPRODUC_Prdcondia() ;
      }
      if ( sdt.IsDirty("PrdStkMinD") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdstkmind = sdt.getgxTv_SdtPRODUC_Prdstkmind() ;
      }
      if ( sdt.IsDirty("PrdStkMinU") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdstkminu = sdt.getgxTv_SdtPRODUC_Prdstkminu() ;
      }
      if ( sdt.IsDirty("PrdDiaRot") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prddiarot = sdt.getgxTv_SdtPRODUC_Prddiarot() ;
      }
      if ( sdt.IsDirty("PrdPlaEnt") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdplaent = sdt.getgxTv_SdtPRODUC_Prdplaent() ;
      }
      if ( sdt.IsDirty("MetCod") )
      {
         gxTv_SdtPRODUC_Metcod_N = sdt.getgxTv_SdtPRODUC_Metcod_N() ;
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Metcod = sdt.getgxTv_SdtPRODUC_Metcod() ;
      }
      if ( sdt.IsDirty("MetDsc") )
      {
         gxTv_SdtPRODUC_Metdsc_N = sdt.getgxTv_SdtPRODUC_Metdsc_N() ;
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Metdsc = sdt.getgxTv_SdtPRODUC_Metdsc() ;
      }
      if ( sdt.IsDirty("PrdLotMin") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdlotmin = sdt.getgxTv_SdtPRODUC_Prdlotmin() ;
      }
      if ( sdt.IsDirty("PrdNumUco") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdnumuco = sdt.getgxTv_SdtPRODUC_Prdnumuco() ;
      }
      if ( sdt.IsDirty("PrdExiAlm") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdexialm = sdt.getgxTv_SdtPRODUC_Prdexialm() ;
      }
      if ( sdt.IsDirty("PrdExiCC") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdexicc = sdt.getgxTv_SdtPRODUC_Prdexicc() ;
      }
      if ( sdt.IsDirty("PrdCanRes") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdcanres = sdt.getgxTv_SdtPRODUC_Prdcanres() ;
      }
      if ( sdt.IsDirty("PrdCanPen") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdcanpen = sdt.getgxTv_SdtPRODUC_Prdcanpen() ;
      }
      if ( sdt.IsDirty("PrdFulEnt") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdfulent = sdt.getgxTv_SdtPRODUC_Prdfulent() ;
      }
      if ( sdt.IsDirty("PrdFulPed") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdfulped = sdt.getgxTv_SdtPRODUC_Prdfulped() ;
      }
      if ( sdt.IsDirty("PrdFulCC") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdfulcc = sdt.getgxTv_SdtPRODUC_Prdfulcc() ;
      }
      if ( sdt.IsDirty("PrdExiCCP") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdexiccp = sdt.getgxTv_SdtPRODUC_Prdexiccp() ;
      }
      if ( sdt.IsDirty("PrdUltECC") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdultecc = sdt.getgxTv_SdtPRODUC_Prdultecc() ;
      }
      if ( sdt.IsDirty("PrdUltCCC") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdultccc = sdt.getgxTv_SdtPRODUC_Prdultccc() ;
      }
      if ( sdt.IsDirty("PrdUltDCC") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdultdcc = sdt.getgxTv_SdtPRODUC_Prdultdcc() ;
      }
      if ( sdt.IsDirty("PrdDifCC") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prddifcc = sdt.getgxTv_SdtPRODUC_Prddifcc() ;
      }
      if ( sdt.IsDirty("PrdConCC") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdconcc = sdt.getgxTv_SdtPRODUC_Prdconcc() ;
      }
      if ( sdt.IsDirty("PrdValStk") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdvalstk = sdt.getgxTv_SdtPRODUC_Prdvalstk() ;
      }
      if ( sdt.IsDirty("DifValStk") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Difvalstk = sdt.getgxTv_SdtPRODUC_Difvalstk() ;
      }
      if ( sdt.IsDirty("PrdFecEnt") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdfecent = sdt.getgxTv_SdtPRODUC_Prdfecent() ;
      }
      if ( sdt.IsDirty("PrdPosX") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdposx = sdt.getgxTv_SdtPRODUC_Prdposx() ;
      }
      if ( sdt.IsDirty("PrdPosY") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdposy = sdt.getgxTv_SdtPRODUC_Prdposy() ;
      }
      if ( sdt.IsDirty("PrdTip") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdtip = sdt.getgxTv_SdtPRODUC_Prdtip() ;
      }
      if ( sdt.IsDirty("PrdDqo") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prddqo = sdt.getgxTv_SdtPRODUC_Prddqo() ;
      }
      if ( sdt.IsDirty("PrdRev") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdrev = sdt.getgxTv_SdtPRODUC_Prdrev() ;
      }
      if ( sdt.IsDirty("PrdTnq") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdtnq = sdt.getgxTv_SdtPRODUC_Prdtnq() ;
      }
      if ( sdt.IsDirty("PrdNom2") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdnom2 = sdt.getgxTv_SdtPRODUC_Prdnom2() ;
      }
      if ( sdt.IsDirty("PrdNum2") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdnum2 = sdt.getgxTv_SdtPRODUC_Prdnum2() ;
      }
      if ( sdt.IsDirty("PrdObs") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdobs = sdt.getgxTv_SdtPRODUC_Prdobs() ;
      }
      if ( sdt.IsDirty("PrdUMeFo") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdumefo = sdt.getgxTv_SdtPRODUC_Prdumefo() ;
      }
      if ( sdt.IsDirty("PrdPreAc2") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdpreac2 = sdt.getgxTv_SdtPRODUC_Prdpreac2() ;
      }
      if ( sdt.IsDirty("PrdDensS") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prddenss = sdt.getgxTv_SdtPRODUC_Prddenss() ;
      }
      if ( sdt.IsDirty("PrdConcS") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdconcs = sdt.getgxTv_SdtPRODUC_Prdconcs() ;
      }
      if ( sdt.IsDirty("PrdSalM") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdsalm = sdt.getgxTv_SdtPRODUC_Prdsalm() ;
      }
      if ( sdt.IsDirty("PrdSolub") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdsolub = sdt.getgxTv_SdtPRODUC_Prdsolub() ;
      }
      if ( sdt.IsDirty("TipPrdCod") )
      {
         gxTv_SdtPRODUC_Tipprdcod_N = sdt.getgxTv_SdtPRODUC_Tipprdcod_N() ;
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Tipprdcod = sdt.getgxTv_SdtPRODUC_Tipprdcod() ;
      }
      if ( sdt.IsDirty("TipPrdDsc") )
      {
         gxTv_SdtPRODUC_Tipprddsc_N = sdt.getgxTv_SdtPRODUC_Tipprddsc_N() ;
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Tipprddsc = sdt.getgxTv_SdtPRODUC_Tipprddsc() ;
      }
      if ( sdt.IsDirty("PrdNumCentra") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdnumcentra = sdt.getgxTv_SdtPRODUC_Prdnumcentra() ;
      }
      if ( sdt.IsDirty("PrdNumct1") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdnumct1 = sdt.getgxTv_SdtPRODUC_Prdnumct1() ;
      }
      if ( sdt.IsDirty("PrdNumct2") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdnumct2 = sdt.getgxTv_SdtPRODUC_Prdnumct2() ;
      }
      if ( sdt.IsDirty("PrdHorMad") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdhormad = sdt.getgxTv_SdtPRODUC_Prdhormad() ;
      }
      if ( sdt.IsDirty("PrdExiAlmc") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdexialmc = sdt.getgxTv_SdtPRODUC_Prdexialmc() ;
      }
      if ( sdt.IsDirty("PrdPesTerm") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdpesterm = sdt.getgxTv_SdtPRODUC_Prdpesterm() ;
      }
      if ( sdt.IsDirty("PrdSal") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdsal = sdt.getgxTv_SdtPRODUC_Prdsal() ;
      }
      if ( sdt.IsDirty("SubFamCod") )
      {
         gxTv_SdtPRODUC_Subfamcod_N = sdt.getgxTv_SdtPRODUC_Subfamcod_N() ;
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Subfamcod = sdt.getgxTv_SdtPRODUC_Subfamcod() ;
      }
      if ( sdt.IsDirty("SubFamDsc") )
      {
         gxTv_SdtPRODUC_Subfamdsc_N = sdt.getgxTv_SdtPRODUC_Subfamdsc_N() ;
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Subfamdsc = sdt.getgxTv_SdtPRODUC_Subfamdsc() ;
      }
      if ( sdt.IsDirty("PrdInc") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdinc = sdt.getgxTv_SdtPRODUC_Prdinc() ;
      }
      if ( sdt.IsDirty("PrdComp") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdcomp = sdt.getgxTv_SdtPRODUC_Prdcomp() ;
      }
      if ( sdt.IsDirty("PrdAox") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdaox = sdt.getgxTv_SdtPRODUC_Prdaox() ;
      }
      if ( sdt.IsDirty("PrdNCAS") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdncas = sdt.getgxTv_SdtPRODUC_Prdncas() ;
      }
      if ( sdt.IsDirty("PrdFT") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdft = sdt.getgxTv_SdtPRODUC_Prdft() ;
      }
      if ( sdt.IsDirty("PrdFFT") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdfft = sdt.getgxTv_SdtPRODUC_Prdfft() ;
      }
      if ( sdt.IsDirty("PrdHS") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdhs = sdt.getgxTv_SdtPRODUC_Prdhs() ;
      }
      if ( sdt.IsDirty("PrdFHS") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdfhs = sdt.getgxTv_SdtPRODUC_Prdfhs() ;
      }
      if ( sdt.IsDirty("PrdColIdx") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdcolidx = sdt.getgxTv_SdtPRODUC_Prdcolidx() ;
      }
      if ( sdt.IsDirty("PrdOkotex") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdokotex = sdt.getgxTv_SdtPRODUC_Prdokotex() ;
      }
      if ( sdt.IsDirty("PrdReach") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdreach = sdt.getgxTv_SdtPRODUC_Prdreach() ;
      }
      if ( sdt.IsDirty("PrdLote") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdlote = sdt.getgxTv_SdtPRODUC_Prdlote() ;
      }
      if ( sdt.IsDirty("PrdRTM") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdrtm = sdt.getgxTv_SdtPRODUC_Prdrtm() ;
      }
      if ( sdt.IsDirty("PrdCtw1") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdctw1 = sdt.getgxTv_SdtPRODUC_Prdctw1() ;
      }
      if ( sdt.IsDirty("PrdCtw2") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdctw2 = sdt.getgxTv_SdtPRODUC_Prdctw2() ;
      }
      if ( sdt.IsDirty("PrdCtw3") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdctw3 = sdt.getgxTv_SdtPRODUC_Prdctw3() ;
      }
      if ( sdt.IsDirty("PrdCtw4") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdctw4 = sdt.getgxTv_SdtPRODUC_Prdctw4() ;
      }
      if ( sdt.IsDirty("PrdNroCAS") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdnrocas = sdt.getgxTv_SdtPRODUC_Prdnrocas() ;
      }
      if ( sdt.IsDirty("PrdGots") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdgots = sdt.getgxTv_SdtPRODUC_Prdgots() ;
      }
      if ( sdt.IsDirty("PrdHm") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdhm = sdt.getgxTv_SdtPRODUC_Prdhm() ;
      }
      if ( sdt.IsDirty("PrdConct") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdconct = sdt.getgxTv_SdtPRODUC_Prdconct() ;
      }
      if ( sdt.IsDirty("PrdEINECS") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdeinecs = sdt.getgxTv_SdtPRODUC_Prdeinecs() ;
      }
      if ( sdt.IsDirty("PrdFuncion") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdfuncion = sdt.getgxTv_SdtPRODUC_Prdfuncion() ;
      }
      if ( sdt.IsDirty("PrdNmQu") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdnmqu = sdt.getgxTv_SdtPRODUC_Prdnmqu() ;
      }
      if ( sdt.IsDirty("PrdList") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdlist = sdt.getgxTv_SdtPRODUC_Prdlist() ;
      }
      if ( sdt.IsDirty("PrdFabId") )
      {
         gxTv_SdtPRODUC_Prdfabid_N = sdt.getgxTv_SdtPRODUC_Prdfabid_N() ;
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdfabid = sdt.getgxTv_SdtPRODUC_Prdfabid() ;
      }
      if ( sdt.IsDirty("PrdFabNm") )
      {
         gxTv_SdtPRODUC_Prdfabnm_N = sdt.getgxTv_SdtPRODUC_Prdfabnm_N() ;
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdfabnm = sdt.getgxTv_SdtPRODUC_Prdfabnm() ;
      }
      if ( sdt.IsDirty("PrdLoteOb") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdloteob = sdt.getgxTv_SdtPRODUC_Prdloteob() ;
      }
      if ( sdt.IsDirty("PrdRGB") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdrgb = sdt.getgxTv_SdtPRODUC_Prdrgb() ;
      }
      if ( sdt.IsDirty("PrdZDHC") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdzdhc = sdt.getgxTv_SdtPRODUC_Prdzdhc() ;
      }
      if ( sdt.IsDirty("PrdTHELIST") )
      {
         gxTv_SdtPRODUC_Prdthelist_N = sdt.getgxTv_SdtPRODUC_Prdthelist_N() ;
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdthelist = sdt.getgxTv_SdtPRODUC_Prdthelist() ;
      }
      if ( sdt.IsDirty("PrdUbicacion") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdubicacion = sdt.getgxTv_SdtPRODUC_Prdubicacion() ;
      }
      if ( sdt.IsDirty("PrdEqLP") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdeqlp = sdt.getgxTv_SdtPRODUC_Prdeqlp() ;
      }
      if ( sdt.IsDirty("PrdPesCon") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdpescon = sdt.getgxTv_SdtPRODUC_Prdpescon() ;
      }
      if ( sdt.IsDirty("PrdCantAtM") )
      {
         gxTv_SdtPRODUC_Prdcantatm_N = sdt.getgxTv_SdtPRODUC_Prdcantatm_N() ;
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdcantatm = sdt.getgxTv_SdtPRODUC_Prdcantatm() ;
      }
      if ( sdt.IsDirty("PrdGruFamId") )
      {
         gxTv_SdtPRODUC_Prdgrufamid_N = sdt.getgxTv_SdtPRODUC_Prdgrufamid_N() ;
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdgrufamid = sdt.getgxTv_SdtPRODUC_Prdgrufamid() ;
      }
      if ( sdt.IsDirty("PrdMatSeca") )
      {
         gxTv_SdtPRODUC_Prdmatseca_N = sdt.getgxTv_SdtPRODUC_Prdmatseca_N() ;
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdmatseca = sdt.getgxTv_SdtPRODUC_Prdmatseca() ;
      }
      if ( sdt.IsDirty("AlmPrdID") )
      {
         gxTv_SdtPRODUC_Almprdid_N = sdt.getgxTv_SdtPRODUC_Almprdid_N() ;
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Almprdid = sdt.getgxTv_SdtPRODUC_Almprdid() ;
      }
      if ( sdt.IsDirty("PrdLoteFch") )
      {
         gxTv_SdtPRODUC_Prdlotefch_N = sdt.getgxTv_SdtPRODUC_Prdlotefch_N() ;
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdlotefch = sdt.getgxTv_SdtPRODUC_Prdlotefch() ;
      }
      if ( sdt.IsDirty("PrdFTdoc") )
      {
         gxTv_SdtPRODUC_Prdftdoc_N = sdt.getgxTv_SdtPRODUC_Prdftdoc_N() ;
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdftdoc = sdt.getgxTv_SdtPRODUC_Prdftdoc() ;
      }
      if ( sdt.IsDirty("PrdFSdoc") )
      {
         gxTv_SdtPRODUC_Prdfsdoc_N = sdt.getgxTv_SdtPRODUC_Prdfsdoc_N() ;
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdfsdoc = sdt.getgxTv_SdtPRODUC_Prdfsdoc() ;
      }
      if ( sdt.IsDirty("PrdGRS") )
      {
         gxTv_SdtPRODUC_Prdgrs_N = sdt.getgxTv_SdtPRODUC_Prdgrs_N() ;
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdgrs = sdt.getgxTv_SdtPRODUC_Prdgrs() ;
      }
      if ( sdt.IsDirty("PrdCDsc") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdcdsc = sdt.getgxTv_SdtPRODUC_Prdcdsc() ;
      }
      if ( sdt.IsDirty("PrdDisponible") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prddisponible = sdt.getgxTv_SdtPRODUC_Prddisponible() ;
      }
      if ( sdt.IsDirty("PrdDiasInactivo") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prddiasinactivo = sdt.getgxTv_SdtPRODUC_Prddiasinactivo() ;
      }
      if ( sdt.IsDirty("PrdUltMovCC") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdultmovcc = sdt.getgxTv_SdtPRODUC_Prdultmovcc() ;
      }
      if ( sdt.IsDirty("PrdFecUltMov") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdfecultmov = sdt.getgxTv_SdtPRODUC_Prdfecultmov() ;
      }
      if ( sdt.IsDirty("PrdTipMovUlt") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdtipmovult = sdt.getgxTv_SdtPRODUC_Prdtipmovult() ;
      }
      if ( sdt.IsDirty("PrdLastLineaCC") )
      {
         gxTv_SdtPRODUC_Prdlastlineacc_N = sdt.getgxTv_SdtPRODUC_Prdlastlineacc_N() ;
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdlastlineacc = sdt.getgxTv_SdtPRODUC_Prdlastlineacc() ;
      }
      if ( sdt.IsDirty("PrdLastFechCC") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdlastfechcc = sdt.getgxTv_SdtPRODUC_Prdlastfechcc() ;
      }
      if ( sdt.IsDirty("PrdLastTipMovCC") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdlasttipmovcc = sdt.getgxTv_SdtPRODUC_Prdlasttipmovcc() ;
      }
      if ( sdt.IsDirty("PrdEsCompuesto") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prdescompuesto = sdt.getgxTv_SdtPRODUC_Prdescompuesto() ;
      }
      if ( sdt.IsDirty("PrdDiaSinMov") )
      {
         gxTv_SdtPRODUC_N = (byte)(0) ;
         gxTv_SdtPRODUC_Prddiasinmov = sdt.getgxTv_SdtPRODUC_Prddiasinmov() ;
      }
   }

   public String getgxTv_SdtPRODUC_Emprcod( )
   {
      return gxTv_SdtPRODUC_Emprcod ;
   }

   public void setgxTv_SdtPRODUC_Emprcod( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      if ( GXutil.strcmp(gxTv_SdtPRODUC_Emprcod, value) != 0 )
      {
         gxTv_SdtPRODUC_Mode = "INS" ;
         this.setgxTv_SdtPRODUC_Emprcod_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Emprnom_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdnum_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdnom_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prvnum_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prvnom_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdrefprv_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prddsctec_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdunicom_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prducpdsc_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdunicon_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prducodsc_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdfaccon_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Valcod_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Valdsc_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdrec_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdcalnec_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prddetpar_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdsit_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdrotrea_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Tipdtocod_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Tipdtodto_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdpreact_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdfecpre_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdpreant_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdpremed_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdcondia_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdstkmind_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdstkminu_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prddiarot_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdplaent_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Metcod_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Metdsc_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdlotmin_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdnumuco_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdexialm_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdexicc_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdcanres_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdcanpen_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdfulent_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdfulped_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdfulcc_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdexiccp_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdultecc_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdultccc_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdultdcc_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prddifcc_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdconcc_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdvalstk_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Difvalstk_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdfecent_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdposx_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdposy_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdtip_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prddqo_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdrev_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdtnq_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdnom2_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdnum2_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdobs_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdumefo_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdpreac2_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prddenss_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdconcs_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdsalm_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdsolub_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Tipprdcod_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Tipprddsc_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdnumcentra_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdnumct1_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdnumct2_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdhormad_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdexialmc_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdpesterm_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdsal_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Subfamcod_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Subfamdsc_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdinc_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdcomp_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdaox_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdncas_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdft_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdfft_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdhs_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdfhs_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdcolidx_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdokotex_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdreach_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdlote_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdrtm_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdctw1_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdctw2_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdctw3_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdctw4_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdnrocas_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdgots_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdhm_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdconct_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdeinecs_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdfuncion_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdnmqu_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdlist_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdfabid_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdfabnm_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdloteob_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdrgb_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdzdhc_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdthelist_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdubicacion_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdeqlp_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdpescon_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdcantatm_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdgrufamid_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdmatseca_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Almprdid_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdlotefch_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdftdoc_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdfsdoc_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdgrs_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdcdsc_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prddisponible_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prddiasinactivo_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdultmovcc_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdfecultmov_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdtipmovult_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdlastlineacc_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdlastfechcc_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdlasttipmovcc_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdescompuesto_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prddiasinmov_Z_SetNull( );
      }
      SetDirty("Emprcod");
      gxTv_SdtPRODUC_Emprcod = value ;
   }

   public String getgxTv_SdtPRODUC_Emprnom( )
   {
      return gxTv_SdtPRODUC_Emprnom ;
   }

   public void setgxTv_SdtPRODUC_Emprnom( String value )
   {
      gxTv_SdtPRODUC_Emprnom_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Emprnom");
      gxTv_SdtPRODUC_Emprnom = value ;
   }

   public void setgxTv_SdtPRODUC_Emprnom_SetNull( )
   {
      gxTv_SdtPRODUC_Emprnom_N = (byte)(1) ;
      gxTv_SdtPRODUC_Emprnom = "" ;
      SetDirty("Emprnom");
   }

   public boolean getgxTv_SdtPRODUC_Emprnom_IsNull( )
   {
      return (gxTv_SdtPRODUC_Emprnom_N==1) ;
   }

   public String getgxTv_SdtPRODUC_Prdnum( )
   {
      return gxTv_SdtPRODUC_Prdnum ;
   }

   public void setgxTv_SdtPRODUC_Prdnum( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      if ( GXutil.strcmp(gxTv_SdtPRODUC_Prdnum, value) != 0 )
      {
         gxTv_SdtPRODUC_Mode = "INS" ;
         this.setgxTv_SdtPRODUC_Emprcod_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Emprnom_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdnum_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdnom_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prvnum_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prvnom_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdrefprv_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prddsctec_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdunicom_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prducpdsc_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdunicon_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prducodsc_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdfaccon_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Valcod_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Valdsc_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdrec_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdcalnec_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prddetpar_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdsit_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdrotrea_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Tipdtocod_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Tipdtodto_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdpreact_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdfecpre_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdpreant_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdpremed_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdcondia_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdstkmind_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdstkminu_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prddiarot_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdplaent_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Metcod_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Metdsc_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdlotmin_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdnumuco_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdexialm_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdexicc_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdcanres_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdcanpen_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdfulent_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdfulped_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdfulcc_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdexiccp_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdultecc_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdultccc_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdultdcc_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prddifcc_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdconcc_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdvalstk_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Difvalstk_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdfecent_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdposx_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdposy_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdtip_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prddqo_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdrev_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdtnq_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdnom2_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdnum2_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdobs_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdumefo_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdpreac2_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prddenss_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdconcs_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdsalm_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdsolub_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Tipprdcod_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Tipprddsc_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdnumcentra_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdnumct1_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdnumct2_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdhormad_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdexialmc_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdpesterm_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdsal_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Subfamcod_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Subfamdsc_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdinc_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdcomp_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdaox_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdncas_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdft_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdfft_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdhs_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdfhs_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdcolidx_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdokotex_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdreach_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdlote_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdrtm_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdctw1_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdctw2_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdctw3_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdctw4_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdnrocas_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdgots_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdhm_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdconct_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdeinecs_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdfuncion_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdnmqu_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdlist_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdfabid_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdfabnm_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdloteob_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdrgb_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdzdhc_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdthelist_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdubicacion_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdeqlp_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdpescon_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdcantatm_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdgrufamid_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdmatseca_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Almprdid_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdlotefch_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdftdoc_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdfsdoc_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdgrs_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdcdsc_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prddisponible_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prddiasinactivo_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdultmovcc_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdfecultmov_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdtipmovult_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdlastlineacc_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdlastfechcc_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdlasttipmovcc_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prdescompuesto_Z_SetNull( );
         this.setgxTv_SdtPRODUC_Prddiasinmov_Z_SetNull( );
      }
      SetDirty("Prdnum");
      gxTv_SdtPRODUC_Prdnum = value ;
   }

   public String getgxTv_SdtPRODUC_Prdnom( )
   {
      return gxTv_SdtPRODUC_Prdnom ;
   }

   public void setgxTv_SdtPRODUC_Prdnom( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdnom");
      gxTv_SdtPRODUC_Prdnom = value ;
   }

   public int getgxTv_SdtPRODUC_Prvnum( )
   {
      return gxTv_SdtPRODUC_Prvnum ;
   }

   public void setgxTv_SdtPRODUC_Prvnum( int value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prvnum");
      gxTv_SdtPRODUC_Prvnum = value ;
   }

   public String getgxTv_SdtPRODUC_Prvnom( )
   {
      return gxTv_SdtPRODUC_Prvnom ;
   }

   public void setgxTv_SdtPRODUC_Prvnom( String value )
   {
      gxTv_SdtPRODUC_Prvnom_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prvnom");
      gxTv_SdtPRODUC_Prvnom = value ;
   }

   public void setgxTv_SdtPRODUC_Prvnom_SetNull( )
   {
      gxTv_SdtPRODUC_Prvnom_N = (byte)(1) ;
      gxTv_SdtPRODUC_Prvnom = "" ;
      SetDirty("Prvnom");
   }

   public boolean getgxTv_SdtPRODUC_Prvnom_IsNull( )
   {
      return (gxTv_SdtPRODUC_Prvnom_N==1) ;
   }

   public String getgxTv_SdtPRODUC_Prdrefprv( )
   {
      return gxTv_SdtPRODUC_Prdrefprv ;
   }

   public void setgxTv_SdtPRODUC_Prdrefprv( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdrefprv");
      gxTv_SdtPRODUC_Prdrefprv = value ;
   }

   public String getgxTv_SdtPRODUC_Prddsctec( )
   {
      return gxTv_SdtPRODUC_Prddsctec ;
   }

   public void setgxTv_SdtPRODUC_Prddsctec( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prddsctec");
      gxTv_SdtPRODUC_Prddsctec = value ;
   }

   public byte getgxTv_SdtPRODUC_Prdunicom( )
   {
      return gxTv_SdtPRODUC_Prdunicom ;
   }

   public void setgxTv_SdtPRODUC_Prdunicom( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdunicom");
      gxTv_SdtPRODUC_Prdunicom = value ;
   }

   public String getgxTv_SdtPRODUC_Prducpdsc( )
   {
      return gxTv_SdtPRODUC_Prducpdsc ;
   }

   public void setgxTv_SdtPRODUC_Prducpdsc( String value )
   {
      gxTv_SdtPRODUC_Prducpdsc_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prducpdsc");
      gxTv_SdtPRODUC_Prducpdsc = value ;
   }

   public void setgxTv_SdtPRODUC_Prducpdsc_SetNull( )
   {
      gxTv_SdtPRODUC_Prducpdsc_N = (byte)(1) ;
      gxTv_SdtPRODUC_Prducpdsc = "" ;
      SetDirty("Prducpdsc");
   }

   public boolean getgxTv_SdtPRODUC_Prducpdsc_IsNull( )
   {
      return (gxTv_SdtPRODUC_Prducpdsc_N==1) ;
   }

   public byte getgxTv_SdtPRODUC_Prdunicon( )
   {
      return gxTv_SdtPRODUC_Prdunicon ;
   }

   public void setgxTv_SdtPRODUC_Prdunicon( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdunicon");
      gxTv_SdtPRODUC_Prdunicon = value ;
   }

   public String getgxTv_SdtPRODUC_Prducodsc( )
   {
      return gxTv_SdtPRODUC_Prducodsc ;
   }

   public void setgxTv_SdtPRODUC_Prducodsc( String value )
   {
      gxTv_SdtPRODUC_Prducodsc_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prducodsc");
      gxTv_SdtPRODUC_Prducodsc = value ;
   }

   public void setgxTv_SdtPRODUC_Prducodsc_SetNull( )
   {
      gxTv_SdtPRODUC_Prducodsc_N = (byte)(1) ;
      gxTv_SdtPRODUC_Prducodsc = "" ;
      SetDirty("Prducodsc");
   }

   public boolean getgxTv_SdtPRODUC_Prducodsc_IsNull( )
   {
      return (gxTv_SdtPRODUC_Prducodsc_N==1) ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prdfaccon( )
   {
      return gxTv_SdtPRODUC_Prdfaccon ;
   }

   public void setgxTv_SdtPRODUC_Prdfaccon( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdfaccon");
      gxTv_SdtPRODUC_Prdfaccon = value ;
   }

   public byte getgxTv_SdtPRODUC_Valcod( )
   {
      return gxTv_SdtPRODUC_Valcod ;
   }

   public void setgxTv_SdtPRODUC_Valcod( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Valcod");
      gxTv_SdtPRODUC_Valcod = value ;
   }

   public String getgxTv_SdtPRODUC_Valdsc( )
   {
      return gxTv_SdtPRODUC_Valdsc ;
   }

   public void setgxTv_SdtPRODUC_Valdsc( String value )
   {
      gxTv_SdtPRODUC_Valdsc_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Valdsc");
      gxTv_SdtPRODUC_Valdsc = value ;
   }

   public void setgxTv_SdtPRODUC_Valdsc_SetNull( )
   {
      gxTv_SdtPRODUC_Valdsc_N = (byte)(1) ;
      gxTv_SdtPRODUC_Valdsc = "" ;
      SetDirty("Valdsc");
   }

   public boolean getgxTv_SdtPRODUC_Valdsc_IsNull( )
   {
      return (gxTv_SdtPRODUC_Valdsc_N==1) ;
   }

   public String getgxTv_SdtPRODUC_Prdrec( )
   {
      return gxTv_SdtPRODUC_Prdrec ;
   }

   public void setgxTv_SdtPRODUC_Prdrec( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdrec");
      gxTv_SdtPRODUC_Prdrec = value ;
   }

   public String getgxTv_SdtPRODUC_Prdcalnec( )
   {
      return gxTv_SdtPRODUC_Prdcalnec ;
   }

   public void setgxTv_SdtPRODUC_Prdcalnec( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdcalnec");
      gxTv_SdtPRODUC_Prdcalnec = value ;
   }

   public String getgxTv_SdtPRODUC_Prddetpar( )
   {
      return gxTv_SdtPRODUC_Prddetpar ;
   }

   public void setgxTv_SdtPRODUC_Prddetpar( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prddetpar");
      gxTv_SdtPRODUC_Prddetpar = value ;
   }

   public byte getgxTv_SdtPRODUC_Prdsit( )
   {
      return gxTv_SdtPRODUC_Prdsit ;
   }

   public void setgxTv_SdtPRODUC_Prdsit( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdsit");
      gxTv_SdtPRODUC_Prdsit = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prdrotrea( )
   {
      return gxTv_SdtPRODUC_Prdrotrea ;
   }

   public void setgxTv_SdtPRODUC_Prdrotrea( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdrotrea");
      gxTv_SdtPRODUC_Prdrotrea = value ;
   }

   public byte getgxTv_SdtPRODUC_Tipdtocod( )
   {
      return gxTv_SdtPRODUC_Tipdtocod ;
   }

   public void setgxTv_SdtPRODUC_Tipdtocod( byte value )
   {
      gxTv_SdtPRODUC_Tipdtocod_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Tipdtocod");
      gxTv_SdtPRODUC_Tipdtocod = value ;
   }

   public void setgxTv_SdtPRODUC_Tipdtocod_SetNull( )
   {
      gxTv_SdtPRODUC_Tipdtocod_N = (byte)(1) ;
      gxTv_SdtPRODUC_Tipdtocod = (byte)(0) ;
      SetDirty("Tipdtocod");
   }

   public boolean getgxTv_SdtPRODUC_Tipdtocod_IsNull( )
   {
      return (gxTv_SdtPRODUC_Tipdtocod_N==1) ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Tipdtodto( )
   {
      return gxTv_SdtPRODUC_Tipdtodto ;
   }

   public void setgxTv_SdtPRODUC_Tipdtodto( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_Tipdtodto_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Tipdtodto");
      gxTv_SdtPRODUC_Tipdtodto = value ;
   }

   public void setgxTv_SdtPRODUC_Tipdtodto_SetNull( )
   {
      gxTv_SdtPRODUC_Tipdtodto_N = (byte)(1) ;
      gxTv_SdtPRODUC_Tipdtodto = DecimalUtil.ZERO ;
      SetDirty("Tipdtodto");
   }

   public boolean getgxTv_SdtPRODUC_Tipdtodto_IsNull( )
   {
      return (gxTv_SdtPRODUC_Tipdtodto_N==1) ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prdpreact( )
   {
      return gxTv_SdtPRODUC_Prdpreact ;
   }

   public void setgxTv_SdtPRODUC_Prdpreact( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdpreact");
      gxTv_SdtPRODUC_Prdpreact = value ;
   }

   public java.util.Date getgxTv_SdtPRODUC_Prdfecpre( )
   {
      return gxTv_SdtPRODUC_Prdfecpre ;
   }

   public void setgxTv_SdtPRODUC_Prdfecpre( java.util.Date value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdfecpre");
      gxTv_SdtPRODUC_Prdfecpre = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prdpreant( )
   {
      return gxTv_SdtPRODUC_Prdpreant ;
   }

   public void setgxTv_SdtPRODUC_Prdpreant( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdpreant");
      gxTv_SdtPRODUC_Prdpreant = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prdpremed( )
   {
      return gxTv_SdtPRODUC_Prdpremed ;
   }

   public void setgxTv_SdtPRODUC_Prdpremed( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdpremed");
      gxTv_SdtPRODUC_Prdpremed = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prdcondia( )
   {
      return gxTv_SdtPRODUC_Prdcondia ;
   }

   public void setgxTv_SdtPRODUC_Prdcondia( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdcondia");
      gxTv_SdtPRODUC_Prdcondia = value ;
   }

   public short getgxTv_SdtPRODUC_Prdstkmind( )
   {
      return gxTv_SdtPRODUC_Prdstkmind ;
   }

   public void setgxTv_SdtPRODUC_Prdstkmind( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdstkmind");
      gxTv_SdtPRODUC_Prdstkmind = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prdstkminu( )
   {
      return gxTv_SdtPRODUC_Prdstkminu ;
   }

   public void setgxTv_SdtPRODUC_Prdstkminu( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdstkminu");
      gxTv_SdtPRODUC_Prdstkminu = value ;
   }

   public short getgxTv_SdtPRODUC_Prddiarot( )
   {
      return gxTv_SdtPRODUC_Prddiarot ;
   }

   public void setgxTv_SdtPRODUC_Prddiarot( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prddiarot");
      gxTv_SdtPRODUC_Prddiarot = value ;
   }

   public short getgxTv_SdtPRODUC_Prdplaent( )
   {
      return gxTv_SdtPRODUC_Prdplaent ;
   }

   public void setgxTv_SdtPRODUC_Prdplaent( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdplaent");
      gxTv_SdtPRODUC_Prdplaent = value ;
   }

   public byte getgxTv_SdtPRODUC_Metcod( )
   {
      return gxTv_SdtPRODUC_Metcod ;
   }

   public void setgxTv_SdtPRODUC_Metcod( byte value )
   {
      gxTv_SdtPRODUC_Metcod_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Metcod");
      gxTv_SdtPRODUC_Metcod = value ;
   }

   public void setgxTv_SdtPRODUC_Metcod_SetNull( )
   {
      gxTv_SdtPRODUC_Metcod_N = (byte)(1) ;
      gxTv_SdtPRODUC_Metcod = (byte)(0) ;
      SetDirty("Metcod");
   }

   public boolean getgxTv_SdtPRODUC_Metcod_IsNull( )
   {
      return (gxTv_SdtPRODUC_Metcod_N==1) ;
   }

   public String getgxTv_SdtPRODUC_Metdsc( )
   {
      return gxTv_SdtPRODUC_Metdsc ;
   }

   public void setgxTv_SdtPRODUC_Metdsc( String value )
   {
      gxTv_SdtPRODUC_Metdsc_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Metdsc");
      gxTv_SdtPRODUC_Metdsc = value ;
   }

   public void setgxTv_SdtPRODUC_Metdsc_SetNull( )
   {
      gxTv_SdtPRODUC_Metdsc_N = (byte)(1) ;
      gxTv_SdtPRODUC_Metdsc = "" ;
      SetDirty("Metdsc");
   }

   public boolean getgxTv_SdtPRODUC_Metdsc_IsNull( )
   {
      return (gxTv_SdtPRODUC_Metdsc_N==1) ;
   }

   public short getgxTv_SdtPRODUC_Prdlotmin( )
   {
      return gxTv_SdtPRODUC_Prdlotmin ;
   }

   public void setgxTv_SdtPRODUC_Prdlotmin( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdlotmin");
      gxTv_SdtPRODUC_Prdlotmin = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prdnumuco( )
   {
      return gxTv_SdtPRODUC_Prdnumuco ;
   }

   public void setgxTv_SdtPRODUC_Prdnumuco( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdnumuco");
      gxTv_SdtPRODUC_Prdnumuco = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prdexialm( )
   {
      return gxTv_SdtPRODUC_Prdexialm ;
   }

   public void setgxTv_SdtPRODUC_Prdexialm( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdexialm");
      gxTv_SdtPRODUC_Prdexialm = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prdexicc( )
   {
      return gxTv_SdtPRODUC_Prdexicc ;
   }

   public void setgxTv_SdtPRODUC_Prdexicc( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdexicc");
      gxTv_SdtPRODUC_Prdexicc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prdcanres( )
   {
      return gxTv_SdtPRODUC_Prdcanres ;
   }

   public void setgxTv_SdtPRODUC_Prdcanres( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdcanres");
      gxTv_SdtPRODUC_Prdcanres = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prdcanpen( )
   {
      return gxTv_SdtPRODUC_Prdcanpen ;
   }

   public void setgxTv_SdtPRODUC_Prdcanpen( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdcanpen");
      gxTv_SdtPRODUC_Prdcanpen = value ;
   }

   public java.util.Date getgxTv_SdtPRODUC_Prdfulent( )
   {
      return gxTv_SdtPRODUC_Prdfulent ;
   }

   public void setgxTv_SdtPRODUC_Prdfulent( java.util.Date value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdfulent");
      gxTv_SdtPRODUC_Prdfulent = value ;
   }

   public java.util.Date getgxTv_SdtPRODUC_Prdfulped( )
   {
      return gxTv_SdtPRODUC_Prdfulped ;
   }

   public void setgxTv_SdtPRODUC_Prdfulped( java.util.Date value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdfulped");
      gxTv_SdtPRODUC_Prdfulped = value ;
   }

   public java.util.Date getgxTv_SdtPRODUC_Prdfulcc( )
   {
      return gxTv_SdtPRODUC_Prdfulcc ;
   }

   public void setgxTv_SdtPRODUC_Prdfulcc( java.util.Date value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdfulcc");
      gxTv_SdtPRODUC_Prdfulcc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prdexiccp( )
   {
      return gxTv_SdtPRODUC_Prdexiccp ;
   }

   public void setgxTv_SdtPRODUC_Prdexiccp( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdexiccp");
      gxTv_SdtPRODUC_Prdexiccp = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prdultecc( )
   {
      return gxTv_SdtPRODUC_Prdultecc ;
   }

   public void setgxTv_SdtPRODUC_Prdultecc( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdultecc");
      gxTv_SdtPRODUC_Prdultecc = value ;
   }

   public short getgxTv_SdtPRODUC_Prdultccc( )
   {
      return gxTv_SdtPRODUC_Prdultccc ;
   }

   public void setgxTv_SdtPRODUC_Prdultccc( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdultccc");
      gxTv_SdtPRODUC_Prdultccc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prdultdcc( )
   {
      return gxTv_SdtPRODUC_Prdultdcc ;
   }

   public void setgxTv_SdtPRODUC_Prdultdcc( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdultdcc");
      gxTv_SdtPRODUC_Prdultdcc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prddifcc( )
   {
      return gxTv_SdtPRODUC_Prddifcc ;
   }

   public void setgxTv_SdtPRODUC_Prddifcc( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prddifcc");
      gxTv_SdtPRODUC_Prddifcc = value ;
   }

   public short getgxTv_SdtPRODUC_Prdconcc( )
   {
      return gxTv_SdtPRODUC_Prdconcc ;
   }

   public void setgxTv_SdtPRODUC_Prdconcc( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdconcc");
      gxTv_SdtPRODUC_Prdconcc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prdvalstk( )
   {
      return gxTv_SdtPRODUC_Prdvalstk ;
   }

   public void setgxTv_SdtPRODUC_Prdvalstk( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdvalstk");
      gxTv_SdtPRODUC_Prdvalstk = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Difvalstk( )
   {
      return gxTv_SdtPRODUC_Difvalstk ;
   }

   public void setgxTv_SdtPRODUC_Difvalstk( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Difvalstk");
      gxTv_SdtPRODUC_Difvalstk = value ;
   }

   public java.util.Date getgxTv_SdtPRODUC_Prdfecent( )
   {
      return gxTv_SdtPRODUC_Prdfecent ;
   }

   public void setgxTv_SdtPRODUC_Prdfecent( java.util.Date value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdfecent");
      gxTv_SdtPRODUC_Prdfecent = value ;
   }

   public short getgxTv_SdtPRODUC_Prdposx( )
   {
      return gxTv_SdtPRODUC_Prdposx ;
   }

   public void setgxTv_SdtPRODUC_Prdposx( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdposx");
      gxTv_SdtPRODUC_Prdposx = value ;
   }

   public byte getgxTv_SdtPRODUC_Prdposy( )
   {
      return gxTv_SdtPRODUC_Prdposy ;
   }

   public void setgxTv_SdtPRODUC_Prdposy( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdposy");
      gxTv_SdtPRODUC_Prdposy = value ;
   }

   public String getgxTv_SdtPRODUC_Prdtip( )
   {
      return gxTv_SdtPRODUC_Prdtip ;
   }

   public void setgxTv_SdtPRODUC_Prdtip( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdtip");
      gxTv_SdtPRODUC_Prdtip = value ;
   }

   public short getgxTv_SdtPRODUC_Prddqo( )
   {
      return gxTv_SdtPRODUC_Prddqo ;
   }

   public void setgxTv_SdtPRODUC_Prddqo( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prddqo");
      gxTv_SdtPRODUC_Prddqo = value ;
   }

   public String getgxTv_SdtPRODUC_Prdrev( )
   {
      return gxTv_SdtPRODUC_Prdrev ;
   }

   public void setgxTv_SdtPRODUC_Prdrev( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdrev");
      gxTv_SdtPRODUC_Prdrev = value ;
   }

   public byte getgxTv_SdtPRODUC_Prdtnq( )
   {
      return gxTv_SdtPRODUC_Prdtnq ;
   }

   public void setgxTv_SdtPRODUC_Prdtnq( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdtnq");
      gxTv_SdtPRODUC_Prdtnq = value ;
   }

   public String getgxTv_SdtPRODUC_Prdnom2( )
   {
      return gxTv_SdtPRODUC_Prdnom2 ;
   }

   public void setgxTv_SdtPRODUC_Prdnom2( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdnom2");
      gxTv_SdtPRODUC_Prdnom2 = value ;
   }

   public String getgxTv_SdtPRODUC_Prdnum2( )
   {
      return gxTv_SdtPRODUC_Prdnum2 ;
   }

   public void setgxTv_SdtPRODUC_Prdnum2( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdnum2");
      gxTv_SdtPRODUC_Prdnum2 = value ;
   }

   public String getgxTv_SdtPRODUC_Prdobs( )
   {
      return gxTv_SdtPRODUC_Prdobs ;
   }

   public void setgxTv_SdtPRODUC_Prdobs( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdobs");
      gxTv_SdtPRODUC_Prdobs = value ;
   }

   public byte getgxTv_SdtPRODUC_Prdumefo( )
   {
      return gxTv_SdtPRODUC_Prdumefo ;
   }

   public void setgxTv_SdtPRODUC_Prdumefo( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdumefo");
      gxTv_SdtPRODUC_Prdumefo = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prdpreac2( )
   {
      return gxTv_SdtPRODUC_Prdpreac2 ;
   }

   public void setgxTv_SdtPRODUC_Prdpreac2( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdpreac2");
      gxTv_SdtPRODUC_Prdpreac2 = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prddenss( )
   {
      return gxTv_SdtPRODUC_Prddenss ;
   }

   public void setgxTv_SdtPRODUC_Prddenss( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prddenss");
      gxTv_SdtPRODUC_Prddenss = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prdconcs( )
   {
      return gxTv_SdtPRODUC_Prdconcs ;
   }

   public void setgxTv_SdtPRODUC_Prdconcs( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdconcs");
      gxTv_SdtPRODUC_Prdconcs = value ;
   }

   public String getgxTv_SdtPRODUC_Prdsalm( )
   {
      return gxTv_SdtPRODUC_Prdsalm ;
   }

   public void setgxTv_SdtPRODUC_Prdsalm( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdsalm");
      gxTv_SdtPRODUC_Prdsalm = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prdsolub( )
   {
      return gxTv_SdtPRODUC_Prdsolub ;
   }

   public void setgxTv_SdtPRODUC_Prdsolub( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdsolub");
      gxTv_SdtPRODUC_Prdsolub = value ;
   }

   public short getgxTv_SdtPRODUC_Tipprdcod( )
   {
      return gxTv_SdtPRODUC_Tipprdcod ;
   }

   public void setgxTv_SdtPRODUC_Tipprdcod( short value )
   {
      gxTv_SdtPRODUC_Tipprdcod_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Tipprdcod");
      gxTv_SdtPRODUC_Tipprdcod = value ;
   }

   public void setgxTv_SdtPRODUC_Tipprdcod_SetNull( )
   {
      gxTv_SdtPRODUC_Tipprdcod_N = (byte)(1) ;
      gxTv_SdtPRODUC_Tipprdcod = (short)(0) ;
      SetDirty("Tipprdcod");
   }

   public boolean getgxTv_SdtPRODUC_Tipprdcod_IsNull( )
   {
      return (gxTv_SdtPRODUC_Tipprdcod_N==1) ;
   }

   public String getgxTv_SdtPRODUC_Tipprddsc( )
   {
      return gxTv_SdtPRODUC_Tipprddsc ;
   }

   public void setgxTv_SdtPRODUC_Tipprddsc( String value )
   {
      gxTv_SdtPRODUC_Tipprddsc_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Tipprddsc");
      gxTv_SdtPRODUC_Tipprddsc = value ;
   }

   public void setgxTv_SdtPRODUC_Tipprddsc_SetNull( )
   {
      gxTv_SdtPRODUC_Tipprddsc_N = (byte)(1) ;
      gxTv_SdtPRODUC_Tipprddsc = "" ;
      SetDirty("Tipprddsc");
   }

   public boolean getgxTv_SdtPRODUC_Tipprddsc_IsNull( )
   {
      return (gxTv_SdtPRODUC_Tipprddsc_N==1) ;
   }

   public String getgxTv_SdtPRODUC_Prdnumcentra( )
   {
      return gxTv_SdtPRODUC_Prdnumcentra ;
   }

   public void setgxTv_SdtPRODUC_Prdnumcentra( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdnumcentra");
      gxTv_SdtPRODUC_Prdnumcentra = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prdnumct1( )
   {
      return gxTv_SdtPRODUC_Prdnumct1 ;
   }

   public void setgxTv_SdtPRODUC_Prdnumct1( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdnumct1");
      gxTv_SdtPRODUC_Prdnumct1 = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prdnumct2( )
   {
      return gxTv_SdtPRODUC_Prdnumct2 ;
   }

   public void setgxTv_SdtPRODUC_Prdnumct2( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdnumct2");
      gxTv_SdtPRODUC_Prdnumct2 = value ;
   }

   public byte getgxTv_SdtPRODUC_Prdhormad( )
   {
      return gxTv_SdtPRODUC_Prdhormad ;
   }

   public void setgxTv_SdtPRODUC_Prdhormad( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdhormad");
      gxTv_SdtPRODUC_Prdhormad = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prdexialmc( )
   {
      return gxTv_SdtPRODUC_Prdexialmc ;
   }

   public void setgxTv_SdtPRODUC_Prdexialmc( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdexialmc");
      gxTv_SdtPRODUC_Prdexialmc = value ;
   }

   public String getgxTv_SdtPRODUC_Prdpesterm( )
   {
      return gxTv_SdtPRODUC_Prdpesterm ;
   }

   public void setgxTv_SdtPRODUC_Prdpesterm( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdpesterm");
      gxTv_SdtPRODUC_Prdpesterm = value ;
   }

   public String getgxTv_SdtPRODUC_Prdsal( )
   {
      return gxTv_SdtPRODUC_Prdsal ;
   }

   public void setgxTv_SdtPRODUC_Prdsal( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdsal");
      gxTv_SdtPRODUC_Prdsal = value ;
   }

   public byte getgxTv_SdtPRODUC_Subfamcod( )
   {
      return gxTv_SdtPRODUC_Subfamcod ;
   }

   public void setgxTv_SdtPRODUC_Subfamcod( byte value )
   {
      gxTv_SdtPRODUC_Subfamcod_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Subfamcod");
      gxTv_SdtPRODUC_Subfamcod = value ;
   }

   public void setgxTv_SdtPRODUC_Subfamcod_SetNull( )
   {
      gxTv_SdtPRODUC_Subfamcod_N = (byte)(1) ;
      gxTv_SdtPRODUC_Subfamcod = (byte)(0) ;
      SetDirty("Subfamcod");
   }

   public boolean getgxTv_SdtPRODUC_Subfamcod_IsNull( )
   {
      return (gxTv_SdtPRODUC_Subfamcod_N==1) ;
   }

   public String getgxTv_SdtPRODUC_Subfamdsc( )
   {
      return gxTv_SdtPRODUC_Subfamdsc ;
   }

   public void setgxTv_SdtPRODUC_Subfamdsc( String value )
   {
      gxTv_SdtPRODUC_Subfamdsc_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Subfamdsc");
      gxTv_SdtPRODUC_Subfamdsc = value ;
   }

   public void setgxTv_SdtPRODUC_Subfamdsc_SetNull( )
   {
      gxTv_SdtPRODUC_Subfamdsc_N = (byte)(1) ;
      gxTv_SdtPRODUC_Subfamdsc = "" ;
      SetDirty("Subfamdsc");
   }

   public boolean getgxTv_SdtPRODUC_Subfamdsc_IsNull( )
   {
      return (gxTv_SdtPRODUC_Subfamdsc_N==1) ;
   }

   public String getgxTv_SdtPRODUC_Prdinc( )
   {
      return gxTv_SdtPRODUC_Prdinc ;
   }

   public void setgxTv_SdtPRODUC_Prdinc( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdinc");
      gxTv_SdtPRODUC_Prdinc = value ;
   }

   public String getgxTv_SdtPRODUC_Prdcomp( )
   {
      return gxTv_SdtPRODUC_Prdcomp ;
   }

   public void setgxTv_SdtPRODUC_Prdcomp( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdcomp");
      gxTv_SdtPRODUC_Prdcomp = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prdaox( )
   {
      return gxTv_SdtPRODUC_Prdaox ;
   }

   public void setgxTv_SdtPRODUC_Prdaox( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdaox");
      gxTv_SdtPRODUC_Prdaox = value ;
   }

   public String getgxTv_SdtPRODUC_Prdncas( )
   {
      return gxTv_SdtPRODUC_Prdncas ;
   }

   public void setgxTv_SdtPRODUC_Prdncas( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdncas");
      gxTv_SdtPRODUC_Prdncas = value ;
   }

   public String getgxTv_SdtPRODUC_Prdft( )
   {
      return gxTv_SdtPRODUC_Prdft ;
   }

   public void setgxTv_SdtPRODUC_Prdft( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdft");
      gxTv_SdtPRODUC_Prdft = value ;
   }

   public java.util.Date getgxTv_SdtPRODUC_Prdfft( )
   {
      return gxTv_SdtPRODUC_Prdfft ;
   }

   public void setgxTv_SdtPRODUC_Prdfft( java.util.Date value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdfft");
      gxTv_SdtPRODUC_Prdfft = value ;
   }

   public String getgxTv_SdtPRODUC_Prdhs( )
   {
      return gxTv_SdtPRODUC_Prdhs ;
   }

   public void setgxTv_SdtPRODUC_Prdhs( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdhs");
      gxTv_SdtPRODUC_Prdhs = value ;
   }

   public java.util.Date getgxTv_SdtPRODUC_Prdfhs( )
   {
      return gxTv_SdtPRODUC_Prdfhs ;
   }

   public void setgxTv_SdtPRODUC_Prdfhs( java.util.Date value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdfhs");
      gxTv_SdtPRODUC_Prdfhs = value ;
   }

   public String getgxTv_SdtPRODUC_Prdcolidx( )
   {
      return gxTv_SdtPRODUC_Prdcolidx ;
   }

   public void setgxTv_SdtPRODUC_Prdcolidx( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdcolidx");
      gxTv_SdtPRODUC_Prdcolidx = value ;
   }

   public String getgxTv_SdtPRODUC_Prdokotex( )
   {
      return gxTv_SdtPRODUC_Prdokotex ;
   }

   public void setgxTv_SdtPRODUC_Prdokotex( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdokotex");
      gxTv_SdtPRODUC_Prdokotex = value ;
   }

   public String getgxTv_SdtPRODUC_Prdreach( )
   {
      return gxTv_SdtPRODUC_Prdreach ;
   }

   public void setgxTv_SdtPRODUC_Prdreach( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdreach");
      gxTv_SdtPRODUC_Prdreach = value ;
   }

   public String getgxTv_SdtPRODUC_Prdlote( )
   {
      return gxTv_SdtPRODUC_Prdlote ;
   }

   public void setgxTv_SdtPRODUC_Prdlote( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdlote");
      gxTv_SdtPRODUC_Prdlote = value ;
   }

   public String getgxTv_SdtPRODUC_Prdrtm( )
   {
      return gxTv_SdtPRODUC_Prdrtm ;
   }

   public void setgxTv_SdtPRODUC_Prdrtm( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdrtm");
      gxTv_SdtPRODUC_Prdrtm = value ;
   }

   public String getgxTv_SdtPRODUC_Prdctw1( )
   {
      return gxTv_SdtPRODUC_Prdctw1 ;
   }

   public void setgxTv_SdtPRODUC_Prdctw1( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdctw1");
      gxTv_SdtPRODUC_Prdctw1 = value ;
   }

   public String getgxTv_SdtPRODUC_Prdctw2( )
   {
      return gxTv_SdtPRODUC_Prdctw2 ;
   }

   public void setgxTv_SdtPRODUC_Prdctw2( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdctw2");
      gxTv_SdtPRODUC_Prdctw2 = value ;
   }

   public String getgxTv_SdtPRODUC_Prdctw3( )
   {
      return gxTv_SdtPRODUC_Prdctw3 ;
   }

   public void setgxTv_SdtPRODUC_Prdctw3( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdctw3");
      gxTv_SdtPRODUC_Prdctw3 = value ;
   }

   public String getgxTv_SdtPRODUC_Prdctw4( )
   {
      return gxTv_SdtPRODUC_Prdctw4 ;
   }

   public void setgxTv_SdtPRODUC_Prdctw4( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdctw4");
      gxTv_SdtPRODUC_Prdctw4 = value ;
   }

   public String getgxTv_SdtPRODUC_Prdnrocas( )
   {
      return gxTv_SdtPRODUC_Prdnrocas ;
   }

   public void setgxTv_SdtPRODUC_Prdnrocas( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdnrocas");
      gxTv_SdtPRODUC_Prdnrocas = value ;
   }

   public String getgxTv_SdtPRODUC_Prdgots( )
   {
      return gxTv_SdtPRODUC_Prdgots ;
   }

   public void setgxTv_SdtPRODUC_Prdgots( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdgots");
      gxTv_SdtPRODUC_Prdgots = value ;
   }

   public String getgxTv_SdtPRODUC_Prdhm( )
   {
      return gxTv_SdtPRODUC_Prdhm ;
   }

   public void setgxTv_SdtPRODUC_Prdhm( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdhm");
      gxTv_SdtPRODUC_Prdhm = value ;
   }

   public short getgxTv_SdtPRODUC_Prdconct( )
   {
      return gxTv_SdtPRODUC_Prdconct ;
   }

   public void setgxTv_SdtPRODUC_Prdconct( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdconct");
      gxTv_SdtPRODUC_Prdconct = value ;
   }

   public String getgxTv_SdtPRODUC_Prdeinecs( )
   {
      return gxTv_SdtPRODUC_Prdeinecs ;
   }

   public void setgxTv_SdtPRODUC_Prdeinecs( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdeinecs");
      gxTv_SdtPRODUC_Prdeinecs = value ;
   }

   public String getgxTv_SdtPRODUC_Prdfuncion( )
   {
      return gxTv_SdtPRODUC_Prdfuncion ;
   }

   public void setgxTv_SdtPRODUC_Prdfuncion( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdfuncion");
      gxTv_SdtPRODUC_Prdfuncion = value ;
   }

   public String getgxTv_SdtPRODUC_Prdnmqu( )
   {
      return gxTv_SdtPRODUC_Prdnmqu ;
   }

   public void setgxTv_SdtPRODUC_Prdnmqu( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdnmqu");
      gxTv_SdtPRODUC_Prdnmqu = value ;
   }

   public String getgxTv_SdtPRODUC_Prdlist( )
   {
      return gxTv_SdtPRODUC_Prdlist ;
   }

   public void setgxTv_SdtPRODUC_Prdlist( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdlist");
      gxTv_SdtPRODUC_Prdlist = value ;
   }

   public int getgxTv_SdtPRODUC_Prdfabid( )
   {
      return gxTv_SdtPRODUC_Prdfabid ;
   }

   public void setgxTv_SdtPRODUC_Prdfabid( int value )
   {
      gxTv_SdtPRODUC_Prdfabid_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdfabid");
      gxTv_SdtPRODUC_Prdfabid = value ;
   }

   public void setgxTv_SdtPRODUC_Prdfabid_SetNull( )
   {
      gxTv_SdtPRODUC_Prdfabid_N = (byte)(1) ;
      gxTv_SdtPRODUC_Prdfabid = 0 ;
      SetDirty("Prdfabid");
   }

   public boolean getgxTv_SdtPRODUC_Prdfabid_IsNull( )
   {
      return (gxTv_SdtPRODUC_Prdfabid_N==1) ;
   }

   public String getgxTv_SdtPRODUC_Prdfabnm( )
   {
      return gxTv_SdtPRODUC_Prdfabnm ;
   }

   public void setgxTv_SdtPRODUC_Prdfabnm( String value )
   {
      gxTv_SdtPRODUC_Prdfabnm_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdfabnm");
      gxTv_SdtPRODUC_Prdfabnm = value ;
   }

   public void setgxTv_SdtPRODUC_Prdfabnm_SetNull( )
   {
      gxTv_SdtPRODUC_Prdfabnm_N = (byte)(1) ;
      gxTv_SdtPRODUC_Prdfabnm = "" ;
      SetDirty("Prdfabnm");
   }

   public boolean getgxTv_SdtPRODUC_Prdfabnm_IsNull( )
   {
      return (gxTv_SdtPRODUC_Prdfabnm_N==1) ;
   }

   public String getgxTv_SdtPRODUC_Prdloteob( )
   {
      return gxTv_SdtPRODUC_Prdloteob ;
   }

   public void setgxTv_SdtPRODUC_Prdloteob( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdloteob");
      gxTv_SdtPRODUC_Prdloteob = value ;
   }

   public long getgxTv_SdtPRODUC_Prdrgb( )
   {
      return gxTv_SdtPRODUC_Prdrgb ;
   }

   public void setgxTv_SdtPRODUC_Prdrgb( long value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdrgb");
      gxTv_SdtPRODUC_Prdrgb = value ;
   }

   public String getgxTv_SdtPRODUC_Prdzdhc( )
   {
      return gxTv_SdtPRODUC_Prdzdhc ;
   }

   public void setgxTv_SdtPRODUC_Prdzdhc( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdzdhc");
      gxTv_SdtPRODUC_Prdzdhc = value ;
   }

   public String getgxTv_SdtPRODUC_Prdthelist( )
   {
      return gxTv_SdtPRODUC_Prdthelist ;
   }

   public void setgxTv_SdtPRODUC_Prdthelist( String value )
   {
      gxTv_SdtPRODUC_Prdthelist_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdthelist");
      gxTv_SdtPRODUC_Prdthelist = value ;
   }

   public void setgxTv_SdtPRODUC_Prdthelist_SetNull( )
   {
      gxTv_SdtPRODUC_Prdthelist_N = (byte)(1) ;
      gxTv_SdtPRODUC_Prdthelist = "" ;
      SetDirty("Prdthelist");
   }

   public boolean getgxTv_SdtPRODUC_Prdthelist_IsNull( )
   {
      return (gxTv_SdtPRODUC_Prdthelist_N==1) ;
   }

   public String getgxTv_SdtPRODUC_Prdubicacion( )
   {
      return gxTv_SdtPRODUC_Prdubicacion ;
   }

   public void setgxTv_SdtPRODUC_Prdubicacion( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdubicacion");
      gxTv_SdtPRODUC_Prdubicacion = value ;
   }

   public String getgxTv_SdtPRODUC_Prdeqlp( )
   {
      return gxTv_SdtPRODUC_Prdeqlp ;
   }

   public void setgxTv_SdtPRODUC_Prdeqlp( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdeqlp");
      gxTv_SdtPRODUC_Prdeqlp = value ;
   }

   public byte getgxTv_SdtPRODUC_Prdpescon( )
   {
      return gxTv_SdtPRODUC_Prdpescon ;
   }

   public void setgxTv_SdtPRODUC_Prdpescon( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdpescon");
      gxTv_SdtPRODUC_Prdpescon = value ;
   }

   public short getgxTv_SdtPRODUC_Prdcantatm( )
   {
      return gxTv_SdtPRODUC_Prdcantatm ;
   }

   public void setgxTv_SdtPRODUC_Prdcantatm( short value )
   {
      gxTv_SdtPRODUC_Prdcantatm_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdcantatm");
      gxTv_SdtPRODUC_Prdcantatm = value ;
   }

   public void setgxTv_SdtPRODUC_Prdcantatm_SetNull( )
   {
      gxTv_SdtPRODUC_Prdcantatm_N = (byte)(1) ;
      gxTv_SdtPRODUC_Prdcantatm = (short)(0) ;
      SetDirty("Prdcantatm");
   }

   public boolean getgxTv_SdtPRODUC_Prdcantatm_IsNull( )
   {
      return (gxTv_SdtPRODUC_Prdcantatm_N==1) ;
   }

   public byte getgxTv_SdtPRODUC_Prdgrufamid( )
   {
      return gxTv_SdtPRODUC_Prdgrufamid ;
   }

   public void setgxTv_SdtPRODUC_Prdgrufamid( byte value )
   {
      gxTv_SdtPRODUC_Prdgrufamid_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdgrufamid");
      gxTv_SdtPRODUC_Prdgrufamid = value ;
   }

   public void setgxTv_SdtPRODUC_Prdgrufamid_SetNull( )
   {
      gxTv_SdtPRODUC_Prdgrufamid_N = (byte)(1) ;
      gxTv_SdtPRODUC_Prdgrufamid = (byte)(0) ;
      SetDirty("Prdgrufamid");
   }

   public boolean getgxTv_SdtPRODUC_Prdgrufamid_IsNull( )
   {
      return (gxTv_SdtPRODUC_Prdgrufamid_N==1) ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prdmatseca( )
   {
      return gxTv_SdtPRODUC_Prdmatseca ;
   }

   public void setgxTv_SdtPRODUC_Prdmatseca( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_Prdmatseca_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdmatseca");
      gxTv_SdtPRODUC_Prdmatseca = value ;
   }

   public void setgxTv_SdtPRODUC_Prdmatseca_SetNull( )
   {
      gxTv_SdtPRODUC_Prdmatseca_N = (byte)(1) ;
      gxTv_SdtPRODUC_Prdmatseca = DecimalUtil.ZERO ;
      SetDirty("Prdmatseca");
   }

   public boolean getgxTv_SdtPRODUC_Prdmatseca_IsNull( )
   {
      return (gxTv_SdtPRODUC_Prdmatseca_N==1) ;
   }

   public short getgxTv_SdtPRODUC_Almprdid( )
   {
      return gxTv_SdtPRODUC_Almprdid ;
   }

   public void setgxTv_SdtPRODUC_Almprdid( short value )
   {
      gxTv_SdtPRODUC_Almprdid_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Almprdid");
      gxTv_SdtPRODUC_Almprdid = value ;
   }

   public void setgxTv_SdtPRODUC_Almprdid_SetNull( )
   {
      gxTv_SdtPRODUC_Almprdid_N = (byte)(1) ;
      gxTv_SdtPRODUC_Almprdid = (short)(0) ;
      SetDirty("Almprdid");
   }

   public boolean getgxTv_SdtPRODUC_Almprdid_IsNull( )
   {
      return (gxTv_SdtPRODUC_Almprdid_N==1) ;
   }

   public java.util.Date getgxTv_SdtPRODUC_Prdlotefch( )
   {
      return gxTv_SdtPRODUC_Prdlotefch ;
   }

   public void setgxTv_SdtPRODUC_Prdlotefch( java.util.Date value )
   {
      gxTv_SdtPRODUC_Prdlotefch_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdlotefch");
      gxTv_SdtPRODUC_Prdlotefch = value ;
   }

   public void setgxTv_SdtPRODUC_Prdlotefch_SetNull( )
   {
      gxTv_SdtPRODUC_Prdlotefch_N = (byte)(1) ;
      gxTv_SdtPRODUC_Prdlotefch = GXutil.nullDate() ;
      SetDirty("Prdlotefch");
   }

   public boolean getgxTv_SdtPRODUC_Prdlotefch_IsNull( )
   {
      return (gxTv_SdtPRODUC_Prdlotefch_N==1) ;
   }

   public String getgxTv_SdtPRODUC_Prdftdoc( )
   {
      return gxTv_SdtPRODUC_Prdftdoc ;
   }

   public void setgxTv_SdtPRODUC_Prdftdoc( String value )
   {
      gxTv_SdtPRODUC_Prdftdoc_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdftdoc");
      gxTv_SdtPRODUC_Prdftdoc = value ;
   }

   public void setgxTv_SdtPRODUC_Prdftdoc_SetNull( )
   {
      gxTv_SdtPRODUC_Prdftdoc_N = (byte)(1) ;
      gxTv_SdtPRODUC_Prdftdoc = "" ;
      SetDirty("Prdftdoc");
   }

   public boolean getgxTv_SdtPRODUC_Prdftdoc_IsNull( )
   {
      return (gxTv_SdtPRODUC_Prdftdoc_N==1) ;
   }

   public String getgxTv_SdtPRODUC_Prdfsdoc( )
   {
      return gxTv_SdtPRODUC_Prdfsdoc ;
   }

   public void setgxTv_SdtPRODUC_Prdfsdoc( String value )
   {
      gxTv_SdtPRODUC_Prdfsdoc_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdfsdoc");
      gxTv_SdtPRODUC_Prdfsdoc = value ;
   }

   public void setgxTv_SdtPRODUC_Prdfsdoc_SetNull( )
   {
      gxTv_SdtPRODUC_Prdfsdoc_N = (byte)(1) ;
      gxTv_SdtPRODUC_Prdfsdoc = "" ;
      SetDirty("Prdfsdoc");
   }

   public boolean getgxTv_SdtPRODUC_Prdfsdoc_IsNull( )
   {
      return (gxTv_SdtPRODUC_Prdfsdoc_N==1) ;
   }

   public String getgxTv_SdtPRODUC_Prdgrs( )
   {
      return gxTv_SdtPRODUC_Prdgrs ;
   }

   public void setgxTv_SdtPRODUC_Prdgrs( String value )
   {
      gxTv_SdtPRODUC_Prdgrs_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdgrs");
      gxTv_SdtPRODUC_Prdgrs = value ;
   }

   public void setgxTv_SdtPRODUC_Prdgrs_SetNull( )
   {
      gxTv_SdtPRODUC_Prdgrs_N = (byte)(1) ;
      gxTv_SdtPRODUC_Prdgrs = "" ;
      SetDirty("Prdgrs");
   }

   public boolean getgxTv_SdtPRODUC_Prdgrs_IsNull( )
   {
      return (gxTv_SdtPRODUC_Prdgrs_N==1) ;
   }

   public String getgxTv_SdtPRODUC_Prdcdsc( )
   {
      return gxTv_SdtPRODUC_Prdcdsc ;
   }

   public void setgxTv_SdtPRODUC_Prdcdsc( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdcdsc");
      gxTv_SdtPRODUC_Prdcdsc = value ;
   }

   public void setgxTv_SdtPRODUC_Prdcdsc_SetNull( )
   {
      gxTv_SdtPRODUC_Prdcdsc = "" ;
      SetDirty("Prdcdsc");
   }

   public boolean getgxTv_SdtPRODUC_Prdcdsc_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prddisponible( )
   {
      return gxTv_SdtPRODUC_Prddisponible ;
   }

   public void setgxTv_SdtPRODUC_Prddisponible( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prddisponible");
      gxTv_SdtPRODUC_Prddisponible = value ;
   }

   public void setgxTv_SdtPRODUC_Prddisponible_SetNull( )
   {
      gxTv_SdtPRODUC_Prddisponible = DecimalUtil.ZERO ;
      SetDirty("Prddisponible");
   }

   public boolean getgxTv_SdtPRODUC_Prddisponible_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPRODUC_Prddiasinactivo( )
   {
      return gxTv_SdtPRODUC_Prddiasinactivo ;
   }

   public void setgxTv_SdtPRODUC_Prddiasinactivo( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prddiasinactivo");
      gxTv_SdtPRODUC_Prddiasinactivo = value ;
   }

   public void setgxTv_SdtPRODUC_Prddiasinactivo_SetNull( )
   {
      gxTv_SdtPRODUC_Prddiasinactivo = (short)(0) ;
      SetDirty("Prddiasinactivo");
   }

   public boolean getgxTv_SdtPRODUC_Prddiasinactivo_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtPRODUC_Prdultmovcc( )
   {
      return gxTv_SdtPRODUC_Prdultmovcc ;
   }

   public void setgxTv_SdtPRODUC_Prdultmovcc( long value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdultmovcc");
      gxTv_SdtPRODUC_Prdultmovcc = value ;
   }

   public void setgxTv_SdtPRODUC_Prdultmovcc_SetNull( )
   {
      gxTv_SdtPRODUC_Prdultmovcc = 0 ;
      SetDirty("Prdultmovcc");
   }

   public boolean getgxTv_SdtPRODUC_Prdultmovcc_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtPRODUC_Prdfecultmov( )
   {
      return gxTv_SdtPRODUC_Prdfecultmov ;
   }

   public void setgxTv_SdtPRODUC_Prdfecultmov( java.util.Date value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdfecultmov");
      gxTv_SdtPRODUC_Prdfecultmov = value ;
   }

   public void setgxTv_SdtPRODUC_Prdfecultmov_SetNull( )
   {
      gxTv_SdtPRODUC_Prdfecultmov = GXutil.nullDate() ;
      SetDirty("Prdfecultmov");
   }

   public boolean getgxTv_SdtPRODUC_Prdfecultmov_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prdtipmovult( )
   {
      return gxTv_SdtPRODUC_Prdtipmovult ;
   }

   public void setgxTv_SdtPRODUC_Prdtipmovult( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdtipmovult");
      gxTv_SdtPRODUC_Prdtipmovult = value ;
   }

   public void setgxTv_SdtPRODUC_Prdtipmovult_SetNull( )
   {
      gxTv_SdtPRODUC_Prdtipmovult = "" ;
      SetDirty("Prdtipmovult");
   }

   public boolean getgxTv_SdtPRODUC_Prdtipmovult_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtPRODUC_Prdlastlineacc( )
   {
      return gxTv_SdtPRODUC_Prdlastlineacc ;
   }

   public void setgxTv_SdtPRODUC_Prdlastlineacc( long value )
   {
      gxTv_SdtPRODUC_Prdlastlineacc_N = (byte)(0) ;
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdlastlineacc");
      gxTv_SdtPRODUC_Prdlastlineacc = value ;
   }

   public void setgxTv_SdtPRODUC_Prdlastlineacc_SetNull( )
   {
      gxTv_SdtPRODUC_Prdlastlineacc_N = (byte)(1) ;
      gxTv_SdtPRODUC_Prdlastlineacc = 0 ;
      SetDirty("Prdlastlineacc");
   }

   public boolean getgxTv_SdtPRODUC_Prdlastlineacc_IsNull( )
   {
      return (gxTv_SdtPRODUC_Prdlastlineacc_N==1) ;
   }

   public java.util.Date getgxTv_SdtPRODUC_Prdlastfechcc( )
   {
      return gxTv_SdtPRODUC_Prdlastfechcc ;
   }

   public void setgxTv_SdtPRODUC_Prdlastfechcc( java.util.Date value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdlastfechcc");
      gxTv_SdtPRODUC_Prdlastfechcc = value ;
   }

   public void setgxTv_SdtPRODUC_Prdlastfechcc_SetNull( )
   {
      gxTv_SdtPRODUC_Prdlastfechcc = GXutil.nullDate() ;
      SetDirty("Prdlastfechcc");
   }

   public boolean getgxTv_SdtPRODUC_Prdlastfechcc_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prdlasttipmovcc( )
   {
      return gxTv_SdtPRODUC_Prdlasttipmovcc ;
   }

   public void setgxTv_SdtPRODUC_Prdlasttipmovcc( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdlasttipmovcc");
      gxTv_SdtPRODUC_Prdlasttipmovcc = value ;
   }

   public void setgxTv_SdtPRODUC_Prdlasttipmovcc_SetNull( )
   {
      gxTv_SdtPRODUC_Prdlasttipmovcc = "" ;
      SetDirty("Prdlasttipmovcc");
   }

   public boolean getgxTv_SdtPRODUC_Prdlasttipmovcc_IsNull( )
   {
      return false ;
   }

   public boolean getgxTv_SdtPRODUC_Prdescompuesto( )
   {
      return gxTv_SdtPRODUC_Prdescompuesto ;
   }

   public void setgxTv_SdtPRODUC_Prdescompuesto( boolean value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdescompuesto");
      gxTv_SdtPRODUC_Prdescompuesto = value ;
   }

   public void setgxTv_SdtPRODUC_Prdescompuesto_SetNull( )
   {
      gxTv_SdtPRODUC_Prdescompuesto = false ;
      SetDirty("Prdescompuesto");
   }

   public boolean getgxTv_SdtPRODUC_Prdescompuesto_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPRODUC_Prddiasinmov( )
   {
      return gxTv_SdtPRODUC_Prddiasinmov ;
   }

   public void setgxTv_SdtPRODUC_Prddiasinmov( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prddiasinmov");
      gxTv_SdtPRODUC_Prddiasinmov = value ;
   }

   public void setgxTv_SdtPRODUC_Prddiasinmov_SetNull( )
   {
      gxTv_SdtPRODUC_Prddiasinmov = (short)(0) ;
      SetDirty("Prddiasinmov");
   }

   public boolean getgxTv_SdtPRODUC_Prddiasinmov_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Mode( )
   {
      return gxTv_SdtPRODUC_Mode ;
   }

   public void setgxTv_SdtPRODUC_Mode( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Mode");
      gxTv_SdtPRODUC_Mode = value ;
   }

   public void setgxTv_SdtPRODUC_Mode_SetNull( )
   {
      gxTv_SdtPRODUC_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_SdtPRODUC_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPRODUC_Initialized( )
   {
      return gxTv_SdtPRODUC_Initialized ;
   }

   public void setgxTv_SdtPRODUC_Initialized( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Initialized");
      gxTv_SdtPRODUC_Initialized = value ;
   }

   public void setgxTv_SdtPRODUC_Initialized_SetNull( )
   {
      gxTv_SdtPRODUC_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_SdtPRODUC_Initialized_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Emprcod_Z( )
   {
      return gxTv_SdtPRODUC_Emprcod_Z ;
   }

   public void setgxTv_SdtPRODUC_Emprcod_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Emprcod_Z");
      gxTv_SdtPRODUC_Emprcod_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Emprcod_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Emprcod_Z = "" ;
      SetDirty("Emprcod_Z");
   }

   public boolean getgxTv_SdtPRODUC_Emprcod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Emprnom_Z( )
   {
      return gxTv_SdtPRODUC_Emprnom_Z ;
   }

   public void setgxTv_SdtPRODUC_Emprnom_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Emprnom_Z");
      gxTv_SdtPRODUC_Emprnom_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Emprnom_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Emprnom_Z = "" ;
      SetDirty("Emprnom_Z");
   }

   public boolean getgxTv_SdtPRODUC_Emprnom_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prdnum_Z( )
   {
      return gxTv_SdtPRODUC_Prdnum_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdnum_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdnum_Z");
      gxTv_SdtPRODUC_Prdnum_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdnum_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdnum_Z = "" ;
      SetDirty("Prdnum_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdnum_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prdnom_Z( )
   {
      return gxTv_SdtPRODUC_Prdnom_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdnom_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdnom_Z");
      gxTv_SdtPRODUC_Prdnom_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdnom_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdnom_Z = "" ;
      SetDirty("Prdnom_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdnom_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtPRODUC_Prvnum_Z( )
   {
      return gxTv_SdtPRODUC_Prvnum_Z ;
   }

   public void setgxTv_SdtPRODUC_Prvnum_Z( int value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prvnum_Z");
      gxTv_SdtPRODUC_Prvnum_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prvnum_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prvnum_Z = 0 ;
      SetDirty("Prvnum_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prvnum_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prvnom_Z( )
   {
      return gxTv_SdtPRODUC_Prvnom_Z ;
   }

   public void setgxTv_SdtPRODUC_Prvnom_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prvnom_Z");
      gxTv_SdtPRODUC_Prvnom_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prvnom_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prvnom_Z = "" ;
      SetDirty("Prvnom_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prvnom_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prdrefprv_Z( )
   {
      return gxTv_SdtPRODUC_Prdrefprv_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdrefprv_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdrefprv_Z");
      gxTv_SdtPRODUC_Prdrefprv_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdrefprv_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdrefprv_Z = "" ;
      SetDirty("Prdrefprv_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdrefprv_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prddsctec_Z( )
   {
      return gxTv_SdtPRODUC_Prddsctec_Z ;
   }

   public void setgxTv_SdtPRODUC_Prddsctec_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prddsctec_Z");
      gxTv_SdtPRODUC_Prddsctec_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prddsctec_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prddsctec_Z = "" ;
      SetDirty("Prddsctec_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prddsctec_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPRODUC_Prdunicom_Z( )
   {
      return gxTv_SdtPRODUC_Prdunicom_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdunicom_Z( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdunicom_Z");
      gxTv_SdtPRODUC_Prdunicom_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdunicom_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdunicom_Z = (byte)(0) ;
      SetDirty("Prdunicom_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdunicom_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prducpdsc_Z( )
   {
      return gxTv_SdtPRODUC_Prducpdsc_Z ;
   }

   public void setgxTv_SdtPRODUC_Prducpdsc_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prducpdsc_Z");
      gxTv_SdtPRODUC_Prducpdsc_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prducpdsc_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prducpdsc_Z = "" ;
      SetDirty("Prducpdsc_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prducpdsc_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPRODUC_Prdunicon_Z( )
   {
      return gxTv_SdtPRODUC_Prdunicon_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdunicon_Z( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdunicon_Z");
      gxTv_SdtPRODUC_Prdunicon_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdunicon_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdunicon_Z = (byte)(0) ;
      SetDirty("Prdunicon_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdunicon_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prducodsc_Z( )
   {
      return gxTv_SdtPRODUC_Prducodsc_Z ;
   }

   public void setgxTv_SdtPRODUC_Prducodsc_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prducodsc_Z");
      gxTv_SdtPRODUC_Prducodsc_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prducodsc_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prducodsc_Z = "" ;
      SetDirty("Prducodsc_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prducodsc_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prdfaccon_Z( )
   {
      return gxTv_SdtPRODUC_Prdfaccon_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdfaccon_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdfaccon_Z");
      gxTv_SdtPRODUC_Prdfaccon_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdfaccon_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdfaccon_Z = DecimalUtil.ZERO ;
      SetDirty("Prdfaccon_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdfaccon_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPRODUC_Valcod_Z( )
   {
      return gxTv_SdtPRODUC_Valcod_Z ;
   }

   public void setgxTv_SdtPRODUC_Valcod_Z( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Valcod_Z");
      gxTv_SdtPRODUC_Valcod_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Valcod_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Valcod_Z = (byte)(0) ;
      SetDirty("Valcod_Z");
   }

   public boolean getgxTv_SdtPRODUC_Valcod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Valdsc_Z( )
   {
      return gxTv_SdtPRODUC_Valdsc_Z ;
   }

   public void setgxTv_SdtPRODUC_Valdsc_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Valdsc_Z");
      gxTv_SdtPRODUC_Valdsc_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Valdsc_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Valdsc_Z = "" ;
      SetDirty("Valdsc_Z");
   }

   public boolean getgxTv_SdtPRODUC_Valdsc_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prdrec_Z( )
   {
      return gxTv_SdtPRODUC_Prdrec_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdrec_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdrec_Z");
      gxTv_SdtPRODUC_Prdrec_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdrec_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdrec_Z = "" ;
      SetDirty("Prdrec_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdrec_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prdcalnec_Z( )
   {
      return gxTv_SdtPRODUC_Prdcalnec_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdcalnec_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdcalnec_Z");
      gxTv_SdtPRODUC_Prdcalnec_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdcalnec_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdcalnec_Z = "" ;
      SetDirty("Prdcalnec_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdcalnec_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prddetpar_Z( )
   {
      return gxTv_SdtPRODUC_Prddetpar_Z ;
   }

   public void setgxTv_SdtPRODUC_Prddetpar_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prddetpar_Z");
      gxTv_SdtPRODUC_Prddetpar_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prddetpar_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prddetpar_Z = "" ;
      SetDirty("Prddetpar_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prddetpar_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPRODUC_Prdsit_Z( )
   {
      return gxTv_SdtPRODUC_Prdsit_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdsit_Z( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdsit_Z");
      gxTv_SdtPRODUC_Prdsit_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdsit_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdsit_Z = (byte)(0) ;
      SetDirty("Prdsit_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdsit_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prdrotrea_Z( )
   {
      return gxTv_SdtPRODUC_Prdrotrea_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdrotrea_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdrotrea_Z");
      gxTv_SdtPRODUC_Prdrotrea_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdrotrea_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdrotrea_Z = DecimalUtil.ZERO ;
      SetDirty("Prdrotrea_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdrotrea_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPRODUC_Tipdtocod_Z( )
   {
      return gxTv_SdtPRODUC_Tipdtocod_Z ;
   }

   public void setgxTv_SdtPRODUC_Tipdtocod_Z( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Tipdtocod_Z");
      gxTv_SdtPRODUC_Tipdtocod_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Tipdtocod_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Tipdtocod_Z = (byte)(0) ;
      SetDirty("Tipdtocod_Z");
   }

   public boolean getgxTv_SdtPRODUC_Tipdtocod_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Tipdtodto_Z( )
   {
      return gxTv_SdtPRODUC_Tipdtodto_Z ;
   }

   public void setgxTv_SdtPRODUC_Tipdtodto_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Tipdtodto_Z");
      gxTv_SdtPRODUC_Tipdtodto_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Tipdtodto_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Tipdtodto_Z = DecimalUtil.ZERO ;
      SetDirty("Tipdtodto_Z");
   }

   public boolean getgxTv_SdtPRODUC_Tipdtodto_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prdpreact_Z( )
   {
      return gxTv_SdtPRODUC_Prdpreact_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdpreact_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdpreact_Z");
      gxTv_SdtPRODUC_Prdpreact_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdpreact_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdpreact_Z = DecimalUtil.ZERO ;
      SetDirty("Prdpreact_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdpreact_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtPRODUC_Prdfecpre_Z( )
   {
      return gxTv_SdtPRODUC_Prdfecpre_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdfecpre_Z( java.util.Date value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdfecpre_Z");
      gxTv_SdtPRODUC_Prdfecpre_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdfecpre_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdfecpre_Z = GXutil.nullDate() ;
      SetDirty("Prdfecpre_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdfecpre_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prdpreant_Z( )
   {
      return gxTv_SdtPRODUC_Prdpreant_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdpreant_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdpreant_Z");
      gxTv_SdtPRODUC_Prdpreant_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdpreant_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdpreant_Z = DecimalUtil.ZERO ;
      SetDirty("Prdpreant_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdpreant_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prdpremed_Z( )
   {
      return gxTv_SdtPRODUC_Prdpremed_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdpremed_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdpremed_Z");
      gxTv_SdtPRODUC_Prdpremed_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdpremed_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdpremed_Z = DecimalUtil.ZERO ;
      SetDirty("Prdpremed_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdpremed_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prdcondia_Z( )
   {
      return gxTv_SdtPRODUC_Prdcondia_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdcondia_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdcondia_Z");
      gxTv_SdtPRODUC_Prdcondia_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdcondia_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdcondia_Z = DecimalUtil.ZERO ;
      SetDirty("Prdcondia_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdcondia_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPRODUC_Prdstkmind_Z( )
   {
      return gxTv_SdtPRODUC_Prdstkmind_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdstkmind_Z( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdstkmind_Z");
      gxTv_SdtPRODUC_Prdstkmind_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdstkmind_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdstkmind_Z = (short)(0) ;
      SetDirty("Prdstkmind_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdstkmind_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prdstkminu_Z( )
   {
      return gxTv_SdtPRODUC_Prdstkminu_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdstkminu_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdstkminu_Z");
      gxTv_SdtPRODUC_Prdstkminu_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdstkminu_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdstkminu_Z = DecimalUtil.ZERO ;
      SetDirty("Prdstkminu_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdstkminu_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPRODUC_Prddiarot_Z( )
   {
      return gxTv_SdtPRODUC_Prddiarot_Z ;
   }

   public void setgxTv_SdtPRODUC_Prddiarot_Z( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prddiarot_Z");
      gxTv_SdtPRODUC_Prddiarot_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prddiarot_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prddiarot_Z = (short)(0) ;
      SetDirty("Prddiarot_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prddiarot_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPRODUC_Prdplaent_Z( )
   {
      return gxTv_SdtPRODUC_Prdplaent_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdplaent_Z( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdplaent_Z");
      gxTv_SdtPRODUC_Prdplaent_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdplaent_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdplaent_Z = (short)(0) ;
      SetDirty("Prdplaent_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdplaent_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPRODUC_Metcod_Z( )
   {
      return gxTv_SdtPRODUC_Metcod_Z ;
   }

   public void setgxTv_SdtPRODUC_Metcod_Z( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Metcod_Z");
      gxTv_SdtPRODUC_Metcod_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Metcod_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Metcod_Z = (byte)(0) ;
      SetDirty("Metcod_Z");
   }

   public boolean getgxTv_SdtPRODUC_Metcod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Metdsc_Z( )
   {
      return gxTv_SdtPRODUC_Metdsc_Z ;
   }

   public void setgxTv_SdtPRODUC_Metdsc_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Metdsc_Z");
      gxTv_SdtPRODUC_Metdsc_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Metdsc_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Metdsc_Z = "" ;
      SetDirty("Metdsc_Z");
   }

   public boolean getgxTv_SdtPRODUC_Metdsc_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPRODUC_Prdlotmin_Z( )
   {
      return gxTv_SdtPRODUC_Prdlotmin_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdlotmin_Z( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdlotmin_Z");
      gxTv_SdtPRODUC_Prdlotmin_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdlotmin_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdlotmin_Z = (short)(0) ;
      SetDirty("Prdlotmin_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdlotmin_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prdnumuco_Z( )
   {
      return gxTv_SdtPRODUC_Prdnumuco_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdnumuco_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdnumuco_Z");
      gxTv_SdtPRODUC_Prdnumuco_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdnumuco_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdnumuco_Z = DecimalUtil.ZERO ;
      SetDirty("Prdnumuco_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdnumuco_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prdexialm_Z( )
   {
      return gxTv_SdtPRODUC_Prdexialm_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdexialm_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdexialm_Z");
      gxTv_SdtPRODUC_Prdexialm_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdexialm_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdexialm_Z = DecimalUtil.ZERO ;
      SetDirty("Prdexialm_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdexialm_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prdexicc_Z( )
   {
      return gxTv_SdtPRODUC_Prdexicc_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdexicc_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdexicc_Z");
      gxTv_SdtPRODUC_Prdexicc_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdexicc_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdexicc_Z = DecimalUtil.ZERO ;
      SetDirty("Prdexicc_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdexicc_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prdcanres_Z( )
   {
      return gxTv_SdtPRODUC_Prdcanres_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdcanres_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdcanres_Z");
      gxTv_SdtPRODUC_Prdcanres_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdcanres_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdcanres_Z = DecimalUtil.ZERO ;
      SetDirty("Prdcanres_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdcanres_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prdcanpen_Z( )
   {
      return gxTv_SdtPRODUC_Prdcanpen_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdcanpen_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdcanpen_Z");
      gxTv_SdtPRODUC_Prdcanpen_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdcanpen_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdcanpen_Z = DecimalUtil.ZERO ;
      SetDirty("Prdcanpen_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdcanpen_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtPRODUC_Prdfulent_Z( )
   {
      return gxTv_SdtPRODUC_Prdfulent_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdfulent_Z( java.util.Date value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdfulent_Z");
      gxTv_SdtPRODUC_Prdfulent_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdfulent_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdfulent_Z = GXutil.nullDate() ;
      SetDirty("Prdfulent_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdfulent_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtPRODUC_Prdfulped_Z( )
   {
      return gxTv_SdtPRODUC_Prdfulped_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdfulped_Z( java.util.Date value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdfulped_Z");
      gxTv_SdtPRODUC_Prdfulped_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdfulped_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdfulped_Z = GXutil.nullDate() ;
      SetDirty("Prdfulped_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdfulped_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtPRODUC_Prdfulcc_Z( )
   {
      return gxTv_SdtPRODUC_Prdfulcc_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdfulcc_Z( java.util.Date value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdfulcc_Z");
      gxTv_SdtPRODUC_Prdfulcc_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdfulcc_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdfulcc_Z = GXutil.nullDate() ;
      SetDirty("Prdfulcc_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdfulcc_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prdexiccp_Z( )
   {
      return gxTv_SdtPRODUC_Prdexiccp_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdexiccp_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdexiccp_Z");
      gxTv_SdtPRODUC_Prdexiccp_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdexiccp_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdexiccp_Z = DecimalUtil.ZERO ;
      SetDirty("Prdexiccp_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdexiccp_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prdultecc_Z( )
   {
      return gxTv_SdtPRODUC_Prdultecc_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdultecc_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdultecc_Z");
      gxTv_SdtPRODUC_Prdultecc_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdultecc_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdultecc_Z = DecimalUtil.ZERO ;
      SetDirty("Prdultecc_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdultecc_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPRODUC_Prdultccc_Z( )
   {
      return gxTv_SdtPRODUC_Prdultccc_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdultccc_Z( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdultccc_Z");
      gxTv_SdtPRODUC_Prdultccc_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdultccc_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdultccc_Z = (short)(0) ;
      SetDirty("Prdultccc_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdultccc_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prdultdcc_Z( )
   {
      return gxTv_SdtPRODUC_Prdultdcc_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdultdcc_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdultdcc_Z");
      gxTv_SdtPRODUC_Prdultdcc_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdultdcc_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdultdcc_Z = DecimalUtil.ZERO ;
      SetDirty("Prdultdcc_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdultdcc_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prddifcc_Z( )
   {
      return gxTv_SdtPRODUC_Prddifcc_Z ;
   }

   public void setgxTv_SdtPRODUC_Prddifcc_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prddifcc_Z");
      gxTv_SdtPRODUC_Prddifcc_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prddifcc_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prddifcc_Z = DecimalUtil.ZERO ;
      SetDirty("Prddifcc_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prddifcc_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPRODUC_Prdconcc_Z( )
   {
      return gxTv_SdtPRODUC_Prdconcc_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdconcc_Z( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdconcc_Z");
      gxTv_SdtPRODUC_Prdconcc_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdconcc_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdconcc_Z = (short)(0) ;
      SetDirty("Prdconcc_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdconcc_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prdvalstk_Z( )
   {
      return gxTv_SdtPRODUC_Prdvalstk_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdvalstk_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdvalstk_Z");
      gxTv_SdtPRODUC_Prdvalstk_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdvalstk_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdvalstk_Z = DecimalUtil.ZERO ;
      SetDirty("Prdvalstk_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdvalstk_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Difvalstk_Z( )
   {
      return gxTv_SdtPRODUC_Difvalstk_Z ;
   }

   public void setgxTv_SdtPRODUC_Difvalstk_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Difvalstk_Z");
      gxTv_SdtPRODUC_Difvalstk_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Difvalstk_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Difvalstk_Z = DecimalUtil.ZERO ;
      SetDirty("Difvalstk_Z");
   }

   public boolean getgxTv_SdtPRODUC_Difvalstk_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtPRODUC_Prdfecent_Z( )
   {
      return gxTv_SdtPRODUC_Prdfecent_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdfecent_Z( java.util.Date value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdfecent_Z");
      gxTv_SdtPRODUC_Prdfecent_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdfecent_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdfecent_Z = GXutil.nullDate() ;
      SetDirty("Prdfecent_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdfecent_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPRODUC_Prdposx_Z( )
   {
      return gxTv_SdtPRODUC_Prdposx_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdposx_Z( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdposx_Z");
      gxTv_SdtPRODUC_Prdposx_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdposx_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdposx_Z = (short)(0) ;
      SetDirty("Prdposx_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdposx_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPRODUC_Prdposy_Z( )
   {
      return gxTv_SdtPRODUC_Prdposy_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdposy_Z( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdposy_Z");
      gxTv_SdtPRODUC_Prdposy_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdposy_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdposy_Z = (byte)(0) ;
      SetDirty("Prdposy_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdposy_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prdtip_Z( )
   {
      return gxTv_SdtPRODUC_Prdtip_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdtip_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdtip_Z");
      gxTv_SdtPRODUC_Prdtip_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdtip_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdtip_Z = "" ;
      SetDirty("Prdtip_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdtip_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPRODUC_Prddqo_Z( )
   {
      return gxTv_SdtPRODUC_Prddqo_Z ;
   }

   public void setgxTv_SdtPRODUC_Prddqo_Z( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prddqo_Z");
      gxTv_SdtPRODUC_Prddqo_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prddqo_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prddqo_Z = (short)(0) ;
      SetDirty("Prddqo_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prddqo_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prdrev_Z( )
   {
      return gxTv_SdtPRODUC_Prdrev_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdrev_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdrev_Z");
      gxTv_SdtPRODUC_Prdrev_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdrev_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdrev_Z = "" ;
      SetDirty("Prdrev_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdrev_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPRODUC_Prdtnq_Z( )
   {
      return gxTv_SdtPRODUC_Prdtnq_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdtnq_Z( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdtnq_Z");
      gxTv_SdtPRODUC_Prdtnq_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdtnq_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdtnq_Z = (byte)(0) ;
      SetDirty("Prdtnq_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdtnq_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prdnom2_Z( )
   {
      return gxTv_SdtPRODUC_Prdnom2_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdnom2_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdnom2_Z");
      gxTv_SdtPRODUC_Prdnom2_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdnom2_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdnom2_Z = "" ;
      SetDirty("Prdnom2_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdnom2_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prdnum2_Z( )
   {
      return gxTv_SdtPRODUC_Prdnum2_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdnum2_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdnum2_Z");
      gxTv_SdtPRODUC_Prdnum2_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdnum2_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdnum2_Z = "" ;
      SetDirty("Prdnum2_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdnum2_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prdobs_Z( )
   {
      return gxTv_SdtPRODUC_Prdobs_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdobs_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdobs_Z");
      gxTv_SdtPRODUC_Prdobs_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdobs_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdobs_Z = "" ;
      SetDirty("Prdobs_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdobs_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPRODUC_Prdumefo_Z( )
   {
      return gxTv_SdtPRODUC_Prdumefo_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdumefo_Z( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdumefo_Z");
      gxTv_SdtPRODUC_Prdumefo_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdumefo_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdumefo_Z = (byte)(0) ;
      SetDirty("Prdumefo_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdumefo_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prdpreac2_Z( )
   {
      return gxTv_SdtPRODUC_Prdpreac2_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdpreac2_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdpreac2_Z");
      gxTv_SdtPRODUC_Prdpreac2_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdpreac2_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdpreac2_Z = DecimalUtil.ZERO ;
      SetDirty("Prdpreac2_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdpreac2_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prddenss_Z( )
   {
      return gxTv_SdtPRODUC_Prddenss_Z ;
   }

   public void setgxTv_SdtPRODUC_Prddenss_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prddenss_Z");
      gxTv_SdtPRODUC_Prddenss_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prddenss_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prddenss_Z = DecimalUtil.ZERO ;
      SetDirty("Prddenss_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prddenss_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prdconcs_Z( )
   {
      return gxTv_SdtPRODUC_Prdconcs_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdconcs_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdconcs_Z");
      gxTv_SdtPRODUC_Prdconcs_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdconcs_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdconcs_Z = DecimalUtil.ZERO ;
      SetDirty("Prdconcs_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdconcs_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prdsalm_Z( )
   {
      return gxTv_SdtPRODUC_Prdsalm_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdsalm_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdsalm_Z");
      gxTv_SdtPRODUC_Prdsalm_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdsalm_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdsalm_Z = "" ;
      SetDirty("Prdsalm_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdsalm_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prdsolub_Z( )
   {
      return gxTv_SdtPRODUC_Prdsolub_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdsolub_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdsolub_Z");
      gxTv_SdtPRODUC_Prdsolub_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdsolub_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdsolub_Z = DecimalUtil.ZERO ;
      SetDirty("Prdsolub_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdsolub_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPRODUC_Tipprdcod_Z( )
   {
      return gxTv_SdtPRODUC_Tipprdcod_Z ;
   }

   public void setgxTv_SdtPRODUC_Tipprdcod_Z( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Tipprdcod_Z");
      gxTv_SdtPRODUC_Tipprdcod_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Tipprdcod_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Tipprdcod_Z = (short)(0) ;
      SetDirty("Tipprdcod_Z");
   }

   public boolean getgxTv_SdtPRODUC_Tipprdcod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Tipprddsc_Z( )
   {
      return gxTv_SdtPRODUC_Tipprddsc_Z ;
   }

   public void setgxTv_SdtPRODUC_Tipprddsc_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Tipprddsc_Z");
      gxTv_SdtPRODUC_Tipprddsc_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Tipprddsc_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Tipprddsc_Z = "" ;
      SetDirty("Tipprddsc_Z");
   }

   public boolean getgxTv_SdtPRODUC_Tipprddsc_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prdnumcentra_Z( )
   {
      return gxTv_SdtPRODUC_Prdnumcentra_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdnumcentra_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdnumcentra_Z");
      gxTv_SdtPRODUC_Prdnumcentra_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdnumcentra_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdnumcentra_Z = "" ;
      SetDirty("Prdnumcentra_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdnumcentra_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prdnumct1_Z( )
   {
      return gxTv_SdtPRODUC_Prdnumct1_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdnumct1_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdnumct1_Z");
      gxTv_SdtPRODUC_Prdnumct1_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdnumct1_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdnumct1_Z = DecimalUtil.ZERO ;
      SetDirty("Prdnumct1_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdnumct1_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prdnumct2_Z( )
   {
      return gxTv_SdtPRODUC_Prdnumct2_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdnumct2_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdnumct2_Z");
      gxTv_SdtPRODUC_Prdnumct2_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdnumct2_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdnumct2_Z = DecimalUtil.ZERO ;
      SetDirty("Prdnumct2_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdnumct2_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPRODUC_Prdhormad_Z( )
   {
      return gxTv_SdtPRODUC_Prdhormad_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdhormad_Z( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdhormad_Z");
      gxTv_SdtPRODUC_Prdhormad_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdhormad_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdhormad_Z = (byte)(0) ;
      SetDirty("Prdhormad_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdhormad_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prdexialmc_Z( )
   {
      return gxTv_SdtPRODUC_Prdexialmc_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdexialmc_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdexialmc_Z");
      gxTv_SdtPRODUC_Prdexialmc_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdexialmc_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdexialmc_Z = DecimalUtil.ZERO ;
      SetDirty("Prdexialmc_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdexialmc_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prdpesterm_Z( )
   {
      return gxTv_SdtPRODUC_Prdpesterm_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdpesterm_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdpesterm_Z");
      gxTv_SdtPRODUC_Prdpesterm_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdpesterm_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdpesterm_Z = "" ;
      SetDirty("Prdpesterm_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdpesterm_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prdsal_Z( )
   {
      return gxTv_SdtPRODUC_Prdsal_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdsal_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdsal_Z");
      gxTv_SdtPRODUC_Prdsal_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdsal_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdsal_Z = "" ;
      SetDirty("Prdsal_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdsal_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPRODUC_Subfamcod_Z( )
   {
      return gxTv_SdtPRODUC_Subfamcod_Z ;
   }

   public void setgxTv_SdtPRODUC_Subfamcod_Z( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Subfamcod_Z");
      gxTv_SdtPRODUC_Subfamcod_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Subfamcod_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Subfamcod_Z = (byte)(0) ;
      SetDirty("Subfamcod_Z");
   }

   public boolean getgxTv_SdtPRODUC_Subfamcod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Subfamdsc_Z( )
   {
      return gxTv_SdtPRODUC_Subfamdsc_Z ;
   }

   public void setgxTv_SdtPRODUC_Subfamdsc_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Subfamdsc_Z");
      gxTv_SdtPRODUC_Subfamdsc_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Subfamdsc_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Subfamdsc_Z = "" ;
      SetDirty("Subfamdsc_Z");
   }

   public boolean getgxTv_SdtPRODUC_Subfamdsc_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prdinc_Z( )
   {
      return gxTv_SdtPRODUC_Prdinc_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdinc_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdinc_Z");
      gxTv_SdtPRODUC_Prdinc_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdinc_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdinc_Z = "" ;
      SetDirty("Prdinc_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdinc_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prdcomp_Z( )
   {
      return gxTv_SdtPRODUC_Prdcomp_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdcomp_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdcomp_Z");
      gxTv_SdtPRODUC_Prdcomp_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdcomp_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdcomp_Z = "" ;
      SetDirty("Prdcomp_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdcomp_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prdaox_Z( )
   {
      return gxTv_SdtPRODUC_Prdaox_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdaox_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdaox_Z");
      gxTv_SdtPRODUC_Prdaox_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdaox_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdaox_Z = DecimalUtil.ZERO ;
      SetDirty("Prdaox_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdaox_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prdncas_Z( )
   {
      return gxTv_SdtPRODUC_Prdncas_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdncas_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdncas_Z");
      gxTv_SdtPRODUC_Prdncas_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdncas_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdncas_Z = "" ;
      SetDirty("Prdncas_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdncas_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prdft_Z( )
   {
      return gxTv_SdtPRODUC_Prdft_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdft_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdft_Z");
      gxTv_SdtPRODUC_Prdft_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdft_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdft_Z = "" ;
      SetDirty("Prdft_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdft_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtPRODUC_Prdfft_Z( )
   {
      return gxTv_SdtPRODUC_Prdfft_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdfft_Z( java.util.Date value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdfft_Z");
      gxTv_SdtPRODUC_Prdfft_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdfft_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdfft_Z = GXutil.nullDate() ;
      SetDirty("Prdfft_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdfft_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prdhs_Z( )
   {
      return gxTv_SdtPRODUC_Prdhs_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdhs_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdhs_Z");
      gxTv_SdtPRODUC_Prdhs_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdhs_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdhs_Z = "" ;
      SetDirty("Prdhs_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdhs_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtPRODUC_Prdfhs_Z( )
   {
      return gxTv_SdtPRODUC_Prdfhs_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdfhs_Z( java.util.Date value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdfhs_Z");
      gxTv_SdtPRODUC_Prdfhs_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdfhs_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdfhs_Z = GXutil.nullDate() ;
      SetDirty("Prdfhs_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdfhs_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prdcolidx_Z( )
   {
      return gxTv_SdtPRODUC_Prdcolidx_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdcolidx_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdcolidx_Z");
      gxTv_SdtPRODUC_Prdcolidx_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdcolidx_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdcolidx_Z = "" ;
      SetDirty("Prdcolidx_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdcolidx_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prdokotex_Z( )
   {
      return gxTv_SdtPRODUC_Prdokotex_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdokotex_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdokotex_Z");
      gxTv_SdtPRODUC_Prdokotex_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdokotex_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdokotex_Z = "" ;
      SetDirty("Prdokotex_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdokotex_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prdreach_Z( )
   {
      return gxTv_SdtPRODUC_Prdreach_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdreach_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdreach_Z");
      gxTv_SdtPRODUC_Prdreach_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdreach_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdreach_Z = "" ;
      SetDirty("Prdreach_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdreach_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prdlote_Z( )
   {
      return gxTv_SdtPRODUC_Prdlote_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdlote_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdlote_Z");
      gxTv_SdtPRODUC_Prdlote_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdlote_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdlote_Z = "" ;
      SetDirty("Prdlote_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdlote_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prdrtm_Z( )
   {
      return gxTv_SdtPRODUC_Prdrtm_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdrtm_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdrtm_Z");
      gxTv_SdtPRODUC_Prdrtm_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdrtm_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdrtm_Z = "" ;
      SetDirty("Prdrtm_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdrtm_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prdctw1_Z( )
   {
      return gxTv_SdtPRODUC_Prdctw1_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdctw1_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdctw1_Z");
      gxTv_SdtPRODUC_Prdctw1_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdctw1_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdctw1_Z = "" ;
      SetDirty("Prdctw1_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdctw1_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prdctw2_Z( )
   {
      return gxTv_SdtPRODUC_Prdctw2_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdctw2_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdctw2_Z");
      gxTv_SdtPRODUC_Prdctw2_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdctw2_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdctw2_Z = "" ;
      SetDirty("Prdctw2_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdctw2_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prdctw3_Z( )
   {
      return gxTv_SdtPRODUC_Prdctw3_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdctw3_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdctw3_Z");
      gxTv_SdtPRODUC_Prdctw3_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdctw3_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdctw3_Z = "" ;
      SetDirty("Prdctw3_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdctw3_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prdctw4_Z( )
   {
      return gxTv_SdtPRODUC_Prdctw4_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdctw4_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdctw4_Z");
      gxTv_SdtPRODUC_Prdctw4_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdctw4_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdctw4_Z = "" ;
      SetDirty("Prdctw4_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdctw4_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prdnrocas_Z( )
   {
      return gxTv_SdtPRODUC_Prdnrocas_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdnrocas_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdnrocas_Z");
      gxTv_SdtPRODUC_Prdnrocas_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdnrocas_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdnrocas_Z = "" ;
      SetDirty("Prdnrocas_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdnrocas_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prdgots_Z( )
   {
      return gxTv_SdtPRODUC_Prdgots_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdgots_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdgots_Z");
      gxTv_SdtPRODUC_Prdgots_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdgots_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdgots_Z = "" ;
      SetDirty("Prdgots_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdgots_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prdhm_Z( )
   {
      return gxTv_SdtPRODUC_Prdhm_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdhm_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdhm_Z");
      gxTv_SdtPRODUC_Prdhm_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdhm_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdhm_Z = "" ;
      SetDirty("Prdhm_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdhm_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPRODUC_Prdconct_Z( )
   {
      return gxTv_SdtPRODUC_Prdconct_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdconct_Z( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdconct_Z");
      gxTv_SdtPRODUC_Prdconct_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdconct_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdconct_Z = (short)(0) ;
      SetDirty("Prdconct_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdconct_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prdeinecs_Z( )
   {
      return gxTv_SdtPRODUC_Prdeinecs_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdeinecs_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdeinecs_Z");
      gxTv_SdtPRODUC_Prdeinecs_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdeinecs_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdeinecs_Z = "" ;
      SetDirty("Prdeinecs_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdeinecs_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prdfuncion_Z( )
   {
      return gxTv_SdtPRODUC_Prdfuncion_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdfuncion_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdfuncion_Z");
      gxTv_SdtPRODUC_Prdfuncion_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdfuncion_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdfuncion_Z = "" ;
      SetDirty("Prdfuncion_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdfuncion_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prdnmqu_Z( )
   {
      return gxTv_SdtPRODUC_Prdnmqu_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdnmqu_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdnmqu_Z");
      gxTv_SdtPRODUC_Prdnmqu_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdnmqu_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdnmqu_Z = "" ;
      SetDirty("Prdnmqu_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdnmqu_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prdlist_Z( )
   {
      return gxTv_SdtPRODUC_Prdlist_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdlist_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdlist_Z");
      gxTv_SdtPRODUC_Prdlist_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdlist_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdlist_Z = "" ;
      SetDirty("Prdlist_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdlist_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtPRODUC_Prdfabid_Z( )
   {
      return gxTv_SdtPRODUC_Prdfabid_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdfabid_Z( int value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdfabid_Z");
      gxTv_SdtPRODUC_Prdfabid_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdfabid_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdfabid_Z = 0 ;
      SetDirty("Prdfabid_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdfabid_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prdfabnm_Z( )
   {
      return gxTv_SdtPRODUC_Prdfabnm_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdfabnm_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdfabnm_Z");
      gxTv_SdtPRODUC_Prdfabnm_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdfabnm_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdfabnm_Z = "" ;
      SetDirty("Prdfabnm_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdfabnm_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prdloteob_Z( )
   {
      return gxTv_SdtPRODUC_Prdloteob_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdloteob_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdloteob_Z");
      gxTv_SdtPRODUC_Prdloteob_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdloteob_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdloteob_Z = "" ;
      SetDirty("Prdloteob_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdloteob_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtPRODUC_Prdrgb_Z( )
   {
      return gxTv_SdtPRODUC_Prdrgb_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdrgb_Z( long value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdrgb_Z");
      gxTv_SdtPRODUC_Prdrgb_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdrgb_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdrgb_Z = 0 ;
      SetDirty("Prdrgb_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdrgb_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prdzdhc_Z( )
   {
      return gxTv_SdtPRODUC_Prdzdhc_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdzdhc_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdzdhc_Z");
      gxTv_SdtPRODUC_Prdzdhc_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdzdhc_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdzdhc_Z = "" ;
      SetDirty("Prdzdhc_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdzdhc_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prdthelist_Z( )
   {
      return gxTv_SdtPRODUC_Prdthelist_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdthelist_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdthelist_Z");
      gxTv_SdtPRODUC_Prdthelist_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdthelist_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdthelist_Z = "" ;
      SetDirty("Prdthelist_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdthelist_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prdubicacion_Z( )
   {
      return gxTv_SdtPRODUC_Prdubicacion_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdubicacion_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdubicacion_Z");
      gxTv_SdtPRODUC_Prdubicacion_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdubicacion_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdubicacion_Z = "" ;
      SetDirty("Prdubicacion_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdubicacion_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prdeqlp_Z( )
   {
      return gxTv_SdtPRODUC_Prdeqlp_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdeqlp_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdeqlp_Z");
      gxTv_SdtPRODUC_Prdeqlp_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdeqlp_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdeqlp_Z = "" ;
      SetDirty("Prdeqlp_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdeqlp_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPRODUC_Prdpescon_Z( )
   {
      return gxTv_SdtPRODUC_Prdpescon_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdpescon_Z( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdpescon_Z");
      gxTv_SdtPRODUC_Prdpescon_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdpescon_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdpescon_Z = (byte)(0) ;
      SetDirty("Prdpescon_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdpescon_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPRODUC_Prdcantatm_Z( )
   {
      return gxTv_SdtPRODUC_Prdcantatm_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdcantatm_Z( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdcantatm_Z");
      gxTv_SdtPRODUC_Prdcantatm_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdcantatm_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdcantatm_Z = (short)(0) ;
      SetDirty("Prdcantatm_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdcantatm_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPRODUC_Prdgrufamid_Z( )
   {
      return gxTv_SdtPRODUC_Prdgrufamid_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdgrufamid_Z( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdgrufamid_Z");
      gxTv_SdtPRODUC_Prdgrufamid_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdgrufamid_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdgrufamid_Z = (byte)(0) ;
      SetDirty("Prdgrufamid_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdgrufamid_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prdmatseca_Z( )
   {
      return gxTv_SdtPRODUC_Prdmatseca_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdmatseca_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdmatseca_Z");
      gxTv_SdtPRODUC_Prdmatseca_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdmatseca_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdmatseca_Z = DecimalUtil.ZERO ;
      SetDirty("Prdmatseca_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdmatseca_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPRODUC_Almprdid_Z( )
   {
      return gxTv_SdtPRODUC_Almprdid_Z ;
   }

   public void setgxTv_SdtPRODUC_Almprdid_Z( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Almprdid_Z");
      gxTv_SdtPRODUC_Almprdid_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Almprdid_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Almprdid_Z = (short)(0) ;
      SetDirty("Almprdid_Z");
   }

   public boolean getgxTv_SdtPRODUC_Almprdid_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtPRODUC_Prdlotefch_Z( )
   {
      return gxTv_SdtPRODUC_Prdlotefch_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdlotefch_Z( java.util.Date value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdlotefch_Z");
      gxTv_SdtPRODUC_Prdlotefch_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdlotefch_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdlotefch_Z = GXutil.nullDate() ;
      SetDirty("Prdlotefch_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdlotefch_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prdftdoc_Z( )
   {
      return gxTv_SdtPRODUC_Prdftdoc_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdftdoc_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdftdoc_Z");
      gxTv_SdtPRODUC_Prdftdoc_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdftdoc_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdftdoc_Z = "" ;
      SetDirty("Prdftdoc_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdftdoc_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prdfsdoc_Z( )
   {
      return gxTv_SdtPRODUC_Prdfsdoc_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdfsdoc_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdfsdoc_Z");
      gxTv_SdtPRODUC_Prdfsdoc_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdfsdoc_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdfsdoc_Z = "" ;
      SetDirty("Prdfsdoc_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdfsdoc_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prdgrs_Z( )
   {
      return gxTv_SdtPRODUC_Prdgrs_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdgrs_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdgrs_Z");
      gxTv_SdtPRODUC_Prdgrs_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdgrs_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdgrs_Z = "" ;
      SetDirty("Prdgrs_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdgrs_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prdcdsc_Z( )
   {
      return gxTv_SdtPRODUC_Prdcdsc_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdcdsc_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdcdsc_Z");
      gxTv_SdtPRODUC_Prdcdsc_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdcdsc_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdcdsc_Z = "" ;
      SetDirty("Prdcdsc_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdcdsc_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtPRODUC_Prddisponible_Z( )
   {
      return gxTv_SdtPRODUC_Prddisponible_Z ;
   }

   public void setgxTv_SdtPRODUC_Prddisponible_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prddisponible_Z");
      gxTv_SdtPRODUC_Prddisponible_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prddisponible_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prddisponible_Z = DecimalUtil.ZERO ;
      SetDirty("Prddisponible_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prddisponible_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPRODUC_Prddiasinactivo_Z( )
   {
      return gxTv_SdtPRODUC_Prddiasinactivo_Z ;
   }

   public void setgxTv_SdtPRODUC_Prddiasinactivo_Z( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prddiasinactivo_Z");
      gxTv_SdtPRODUC_Prddiasinactivo_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prddiasinactivo_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prddiasinactivo_Z = (short)(0) ;
      SetDirty("Prddiasinactivo_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prddiasinactivo_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtPRODUC_Prdultmovcc_Z( )
   {
      return gxTv_SdtPRODUC_Prdultmovcc_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdultmovcc_Z( long value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdultmovcc_Z");
      gxTv_SdtPRODUC_Prdultmovcc_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdultmovcc_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdultmovcc_Z = 0 ;
      SetDirty("Prdultmovcc_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdultmovcc_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtPRODUC_Prdfecultmov_Z( )
   {
      return gxTv_SdtPRODUC_Prdfecultmov_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdfecultmov_Z( java.util.Date value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdfecultmov_Z");
      gxTv_SdtPRODUC_Prdfecultmov_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdfecultmov_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdfecultmov_Z = GXutil.nullDate() ;
      SetDirty("Prdfecultmov_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdfecultmov_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prdtipmovult_Z( )
   {
      return gxTv_SdtPRODUC_Prdtipmovult_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdtipmovult_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdtipmovult_Z");
      gxTv_SdtPRODUC_Prdtipmovult_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdtipmovult_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdtipmovult_Z = "" ;
      SetDirty("Prdtipmovult_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdtipmovult_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtPRODUC_Prdlastlineacc_Z( )
   {
      return gxTv_SdtPRODUC_Prdlastlineacc_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdlastlineacc_Z( long value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdlastlineacc_Z");
      gxTv_SdtPRODUC_Prdlastlineacc_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdlastlineacc_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdlastlineacc_Z = 0 ;
      SetDirty("Prdlastlineacc_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdlastlineacc_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtPRODUC_Prdlastfechcc_Z( )
   {
      return gxTv_SdtPRODUC_Prdlastfechcc_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdlastfechcc_Z( java.util.Date value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdlastfechcc_Z");
      gxTv_SdtPRODUC_Prdlastfechcc_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdlastfechcc_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdlastfechcc_Z = GXutil.nullDate() ;
      SetDirty("Prdlastfechcc_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdlastfechcc_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPRODUC_Prdlasttipmovcc_Z( )
   {
      return gxTv_SdtPRODUC_Prdlasttipmovcc_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdlasttipmovcc_Z( String value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdlasttipmovcc_Z");
      gxTv_SdtPRODUC_Prdlasttipmovcc_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdlasttipmovcc_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdlasttipmovcc_Z = "" ;
      SetDirty("Prdlasttipmovcc_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdlasttipmovcc_Z_IsNull( )
   {
      return false ;
   }

   public boolean getgxTv_SdtPRODUC_Prdescompuesto_Z( )
   {
      return gxTv_SdtPRODUC_Prdescompuesto_Z ;
   }

   public void setgxTv_SdtPRODUC_Prdescompuesto_Z( boolean value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdescompuesto_Z");
      gxTv_SdtPRODUC_Prdescompuesto_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prdescompuesto_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prdescompuesto_Z = false ;
      SetDirty("Prdescompuesto_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prdescompuesto_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPRODUC_Prddiasinmov_Z( )
   {
      return gxTv_SdtPRODUC_Prddiasinmov_Z ;
   }

   public void setgxTv_SdtPRODUC_Prddiasinmov_Z( short value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prddiasinmov_Z");
      gxTv_SdtPRODUC_Prddiasinmov_Z = value ;
   }

   public void setgxTv_SdtPRODUC_Prddiasinmov_Z_SetNull( )
   {
      gxTv_SdtPRODUC_Prddiasinmov_Z = (short)(0) ;
      SetDirty("Prddiasinmov_Z");
   }

   public boolean getgxTv_SdtPRODUC_Prddiasinmov_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPRODUC_Emprnom_N( )
   {
      return gxTv_SdtPRODUC_Emprnom_N ;
   }

   public void setgxTv_SdtPRODUC_Emprnom_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Emprnom_N");
      gxTv_SdtPRODUC_Emprnom_N = value ;
   }

   public void setgxTv_SdtPRODUC_Emprnom_N_SetNull( )
   {
      gxTv_SdtPRODUC_Emprnom_N = (byte)(0) ;
      SetDirty("Emprnom_N");
   }

   public boolean getgxTv_SdtPRODUC_Emprnom_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPRODUC_Prdnum_N( )
   {
      return gxTv_SdtPRODUC_Prdnum_N ;
   }

   public void setgxTv_SdtPRODUC_Prdnum_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdnum_N");
      gxTv_SdtPRODUC_Prdnum_N = value ;
   }

   public void setgxTv_SdtPRODUC_Prdnum_N_SetNull( )
   {
      gxTv_SdtPRODUC_Prdnum_N = (byte)(0) ;
      SetDirty("Prdnum_N");
   }

   public boolean getgxTv_SdtPRODUC_Prdnum_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPRODUC_Prvnom_N( )
   {
      return gxTv_SdtPRODUC_Prvnom_N ;
   }

   public void setgxTv_SdtPRODUC_Prvnom_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prvnom_N");
      gxTv_SdtPRODUC_Prvnom_N = value ;
   }

   public void setgxTv_SdtPRODUC_Prvnom_N_SetNull( )
   {
      gxTv_SdtPRODUC_Prvnom_N = (byte)(0) ;
      SetDirty("Prvnom_N");
   }

   public boolean getgxTv_SdtPRODUC_Prvnom_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPRODUC_Prducpdsc_N( )
   {
      return gxTv_SdtPRODUC_Prducpdsc_N ;
   }

   public void setgxTv_SdtPRODUC_Prducpdsc_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prducpdsc_N");
      gxTv_SdtPRODUC_Prducpdsc_N = value ;
   }

   public void setgxTv_SdtPRODUC_Prducpdsc_N_SetNull( )
   {
      gxTv_SdtPRODUC_Prducpdsc_N = (byte)(0) ;
      SetDirty("Prducpdsc_N");
   }

   public boolean getgxTv_SdtPRODUC_Prducpdsc_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPRODUC_Prducodsc_N( )
   {
      return gxTv_SdtPRODUC_Prducodsc_N ;
   }

   public void setgxTv_SdtPRODUC_Prducodsc_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prducodsc_N");
      gxTv_SdtPRODUC_Prducodsc_N = value ;
   }

   public void setgxTv_SdtPRODUC_Prducodsc_N_SetNull( )
   {
      gxTv_SdtPRODUC_Prducodsc_N = (byte)(0) ;
      SetDirty("Prducodsc_N");
   }

   public boolean getgxTv_SdtPRODUC_Prducodsc_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPRODUC_Valdsc_N( )
   {
      return gxTv_SdtPRODUC_Valdsc_N ;
   }

   public void setgxTv_SdtPRODUC_Valdsc_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Valdsc_N");
      gxTv_SdtPRODUC_Valdsc_N = value ;
   }

   public void setgxTv_SdtPRODUC_Valdsc_N_SetNull( )
   {
      gxTv_SdtPRODUC_Valdsc_N = (byte)(0) ;
      SetDirty("Valdsc_N");
   }

   public boolean getgxTv_SdtPRODUC_Valdsc_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPRODUC_Tipdtocod_N( )
   {
      return gxTv_SdtPRODUC_Tipdtocod_N ;
   }

   public void setgxTv_SdtPRODUC_Tipdtocod_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Tipdtocod_N");
      gxTv_SdtPRODUC_Tipdtocod_N = value ;
   }

   public void setgxTv_SdtPRODUC_Tipdtocod_N_SetNull( )
   {
      gxTv_SdtPRODUC_Tipdtocod_N = (byte)(0) ;
      SetDirty("Tipdtocod_N");
   }

   public boolean getgxTv_SdtPRODUC_Tipdtocod_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPRODUC_Tipdtodto_N( )
   {
      return gxTv_SdtPRODUC_Tipdtodto_N ;
   }

   public void setgxTv_SdtPRODUC_Tipdtodto_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Tipdtodto_N");
      gxTv_SdtPRODUC_Tipdtodto_N = value ;
   }

   public void setgxTv_SdtPRODUC_Tipdtodto_N_SetNull( )
   {
      gxTv_SdtPRODUC_Tipdtodto_N = (byte)(0) ;
      SetDirty("Tipdtodto_N");
   }

   public boolean getgxTv_SdtPRODUC_Tipdtodto_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPRODUC_Metcod_N( )
   {
      return gxTv_SdtPRODUC_Metcod_N ;
   }

   public void setgxTv_SdtPRODUC_Metcod_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Metcod_N");
      gxTv_SdtPRODUC_Metcod_N = value ;
   }

   public void setgxTv_SdtPRODUC_Metcod_N_SetNull( )
   {
      gxTv_SdtPRODUC_Metcod_N = (byte)(0) ;
      SetDirty("Metcod_N");
   }

   public boolean getgxTv_SdtPRODUC_Metcod_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPRODUC_Metdsc_N( )
   {
      return gxTv_SdtPRODUC_Metdsc_N ;
   }

   public void setgxTv_SdtPRODUC_Metdsc_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Metdsc_N");
      gxTv_SdtPRODUC_Metdsc_N = value ;
   }

   public void setgxTv_SdtPRODUC_Metdsc_N_SetNull( )
   {
      gxTv_SdtPRODUC_Metdsc_N = (byte)(0) ;
      SetDirty("Metdsc_N");
   }

   public boolean getgxTv_SdtPRODUC_Metdsc_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPRODUC_Tipprdcod_N( )
   {
      return gxTv_SdtPRODUC_Tipprdcod_N ;
   }

   public void setgxTv_SdtPRODUC_Tipprdcod_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Tipprdcod_N");
      gxTv_SdtPRODUC_Tipprdcod_N = value ;
   }

   public void setgxTv_SdtPRODUC_Tipprdcod_N_SetNull( )
   {
      gxTv_SdtPRODUC_Tipprdcod_N = (byte)(0) ;
      SetDirty("Tipprdcod_N");
   }

   public boolean getgxTv_SdtPRODUC_Tipprdcod_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPRODUC_Tipprddsc_N( )
   {
      return gxTv_SdtPRODUC_Tipprddsc_N ;
   }

   public void setgxTv_SdtPRODUC_Tipprddsc_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Tipprddsc_N");
      gxTv_SdtPRODUC_Tipprddsc_N = value ;
   }

   public void setgxTv_SdtPRODUC_Tipprddsc_N_SetNull( )
   {
      gxTv_SdtPRODUC_Tipprddsc_N = (byte)(0) ;
      SetDirty("Tipprddsc_N");
   }

   public boolean getgxTv_SdtPRODUC_Tipprddsc_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPRODUC_Subfamcod_N( )
   {
      return gxTv_SdtPRODUC_Subfamcod_N ;
   }

   public void setgxTv_SdtPRODUC_Subfamcod_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Subfamcod_N");
      gxTv_SdtPRODUC_Subfamcod_N = value ;
   }

   public void setgxTv_SdtPRODUC_Subfamcod_N_SetNull( )
   {
      gxTv_SdtPRODUC_Subfamcod_N = (byte)(0) ;
      SetDirty("Subfamcod_N");
   }

   public boolean getgxTv_SdtPRODUC_Subfamcod_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPRODUC_Subfamdsc_N( )
   {
      return gxTv_SdtPRODUC_Subfamdsc_N ;
   }

   public void setgxTv_SdtPRODUC_Subfamdsc_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Subfamdsc_N");
      gxTv_SdtPRODUC_Subfamdsc_N = value ;
   }

   public void setgxTv_SdtPRODUC_Subfamdsc_N_SetNull( )
   {
      gxTv_SdtPRODUC_Subfamdsc_N = (byte)(0) ;
      SetDirty("Subfamdsc_N");
   }

   public boolean getgxTv_SdtPRODUC_Subfamdsc_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPRODUC_Prdfabid_N( )
   {
      return gxTv_SdtPRODUC_Prdfabid_N ;
   }

   public void setgxTv_SdtPRODUC_Prdfabid_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdfabid_N");
      gxTv_SdtPRODUC_Prdfabid_N = value ;
   }

   public void setgxTv_SdtPRODUC_Prdfabid_N_SetNull( )
   {
      gxTv_SdtPRODUC_Prdfabid_N = (byte)(0) ;
      SetDirty("Prdfabid_N");
   }

   public boolean getgxTv_SdtPRODUC_Prdfabid_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPRODUC_Prdfabnm_N( )
   {
      return gxTv_SdtPRODUC_Prdfabnm_N ;
   }

   public void setgxTv_SdtPRODUC_Prdfabnm_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdfabnm_N");
      gxTv_SdtPRODUC_Prdfabnm_N = value ;
   }

   public void setgxTv_SdtPRODUC_Prdfabnm_N_SetNull( )
   {
      gxTv_SdtPRODUC_Prdfabnm_N = (byte)(0) ;
      SetDirty("Prdfabnm_N");
   }

   public boolean getgxTv_SdtPRODUC_Prdfabnm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPRODUC_Prdthelist_N( )
   {
      return gxTv_SdtPRODUC_Prdthelist_N ;
   }

   public void setgxTv_SdtPRODUC_Prdthelist_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdthelist_N");
      gxTv_SdtPRODUC_Prdthelist_N = value ;
   }

   public void setgxTv_SdtPRODUC_Prdthelist_N_SetNull( )
   {
      gxTv_SdtPRODUC_Prdthelist_N = (byte)(0) ;
      SetDirty("Prdthelist_N");
   }

   public boolean getgxTv_SdtPRODUC_Prdthelist_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPRODUC_Prdcantatm_N( )
   {
      return gxTv_SdtPRODUC_Prdcantatm_N ;
   }

   public void setgxTv_SdtPRODUC_Prdcantatm_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdcantatm_N");
      gxTv_SdtPRODUC_Prdcantatm_N = value ;
   }

   public void setgxTv_SdtPRODUC_Prdcantatm_N_SetNull( )
   {
      gxTv_SdtPRODUC_Prdcantatm_N = (byte)(0) ;
      SetDirty("Prdcantatm_N");
   }

   public boolean getgxTv_SdtPRODUC_Prdcantatm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPRODUC_Prdgrufamid_N( )
   {
      return gxTv_SdtPRODUC_Prdgrufamid_N ;
   }

   public void setgxTv_SdtPRODUC_Prdgrufamid_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdgrufamid_N");
      gxTv_SdtPRODUC_Prdgrufamid_N = value ;
   }

   public void setgxTv_SdtPRODUC_Prdgrufamid_N_SetNull( )
   {
      gxTv_SdtPRODUC_Prdgrufamid_N = (byte)(0) ;
      SetDirty("Prdgrufamid_N");
   }

   public boolean getgxTv_SdtPRODUC_Prdgrufamid_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPRODUC_Prdmatseca_N( )
   {
      return gxTv_SdtPRODUC_Prdmatseca_N ;
   }

   public void setgxTv_SdtPRODUC_Prdmatseca_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdmatseca_N");
      gxTv_SdtPRODUC_Prdmatseca_N = value ;
   }

   public void setgxTv_SdtPRODUC_Prdmatseca_N_SetNull( )
   {
      gxTv_SdtPRODUC_Prdmatseca_N = (byte)(0) ;
      SetDirty("Prdmatseca_N");
   }

   public boolean getgxTv_SdtPRODUC_Prdmatseca_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPRODUC_Almprdid_N( )
   {
      return gxTv_SdtPRODUC_Almprdid_N ;
   }

   public void setgxTv_SdtPRODUC_Almprdid_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Almprdid_N");
      gxTv_SdtPRODUC_Almprdid_N = value ;
   }

   public void setgxTv_SdtPRODUC_Almprdid_N_SetNull( )
   {
      gxTv_SdtPRODUC_Almprdid_N = (byte)(0) ;
      SetDirty("Almprdid_N");
   }

   public boolean getgxTv_SdtPRODUC_Almprdid_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPRODUC_Prdlotefch_N( )
   {
      return gxTv_SdtPRODUC_Prdlotefch_N ;
   }

   public void setgxTv_SdtPRODUC_Prdlotefch_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdlotefch_N");
      gxTv_SdtPRODUC_Prdlotefch_N = value ;
   }

   public void setgxTv_SdtPRODUC_Prdlotefch_N_SetNull( )
   {
      gxTv_SdtPRODUC_Prdlotefch_N = (byte)(0) ;
      SetDirty("Prdlotefch_N");
   }

   public boolean getgxTv_SdtPRODUC_Prdlotefch_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPRODUC_Prdftdoc_N( )
   {
      return gxTv_SdtPRODUC_Prdftdoc_N ;
   }

   public void setgxTv_SdtPRODUC_Prdftdoc_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdftdoc_N");
      gxTv_SdtPRODUC_Prdftdoc_N = value ;
   }

   public void setgxTv_SdtPRODUC_Prdftdoc_N_SetNull( )
   {
      gxTv_SdtPRODUC_Prdftdoc_N = (byte)(0) ;
      SetDirty("Prdftdoc_N");
   }

   public boolean getgxTv_SdtPRODUC_Prdftdoc_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPRODUC_Prdfsdoc_N( )
   {
      return gxTv_SdtPRODUC_Prdfsdoc_N ;
   }

   public void setgxTv_SdtPRODUC_Prdfsdoc_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdfsdoc_N");
      gxTv_SdtPRODUC_Prdfsdoc_N = value ;
   }

   public void setgxTv_SdtPRODUC_Prdfsdoc_N_SetNull( )
   {
      gxTv_SdtPRODUC_Prdfsdoc_N = (byte)(0) ;
      SetDirty("Prdfsdoc_N");
   }

   public boolean getgxTv_SdtPRODUC_Prdfsdoc_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPRODUC_Prdgrs_N( )
   {
      return gxTv_SdtPRODUC_Prdgrs_N ;
   }

   public void setgxTv_SdtPRODUC_Prdgrs_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdgrs_N");
      gxTv_SdtPRODUC_Prdgrs_N = value ;
   }

   public void setgxTv_SdtPRODUC_Prdgrs_N_SetNull( )
   {
      gxTv_SdtPRODUC_Prdgrs_N = (byte)(0) ;
      SetDirty("Prdgrs_N");
   }

   public boolean getgxTv_SdtPRODUC_Prdgrs_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPRODUC_Prdlastlineacc_N( )
   {
      return gxTv_SdtPRODUC_Prdlastlineacc_N ;
   }

   public void setgxTv_SdtPRODUC_Prdlastlineacc_N( byte value )
   {
      gxTv_SdtPRODUC_N = (byte)(0) ;
      SetDirty("Prdlastlineacc_N");
      gxTv_SdtPRODUC_Prdlastlineacc_N = value ;
   }

   public void setgxTv_SdtPRODUC_Prdlastlineacc_N_SetNull( )
   {
      gxTv_SdtPRODUC_Prdlastlineacc_N = (byte)(0) ;
      SetDirty("Prdlastlineacc_N");
   }

   public boolean getgxTv_SdtPRODUC_Prdlastlineacc_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      app.stocksquimicos.produc_bc obj;
      obj = new app.stocksquimicos.produc_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtPRODUC_Emprcod = "" ;
      gxTv_SdtPRODUC_N = (byte)(1) ;
      gxTv_SdtPRODUC_Emprnom = "" ;
      gxTv_SdtPRODUC_Prdnum = "" ;
      gxTv_SdtPRODUC_Prdnom = "" ;
      gxTv_SdtPRODUC_Prvnom = "" ;
      gxTv_SdtPRODUC_Prdrefprv = "" ;
      gxTv_SdtPRODUC_Prddsctec = "" ;
      gxTv_SdtPRODUC_Prducpdsc = "" ;
      gxTv_SdtPRODUC_Prducodsc = "" ;
      gxTv_SdtPRODUC_Prdfaccon = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Valdsc = "" ;
      gxTv_SdtPRODUC_Prdrec = "" ;
      gxTv_SdtPRODUC_Prdcalnec = "" ;
      gxTv_SdtPRODUC_Prddetpar = "" ;
      gxTv_SdtPRODUC_Prdrotrea = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Tipdtodto = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Prdpreact = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Prdfecpre = GXutil.nullDate() ;
      gxTv_SdtPRODUC_Prdpreant = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Prdpremed = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Prdcondia = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Prdstkminu = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Metdsc = "" ;
      gxTv_SdtPRODUC_Prdnumuco = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Prdexialm = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Prdexicc = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Prdcanres = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Prdcanpen = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Prdfulent = GXutil.nullDate() ;
      gxTv_SdtPRODUC_Prdfulped = GXutil.nullDate() ;
      gxTv_SdtPRODUC_Prdfulcc = GXutil.nullDate() ;
      gxTv_SdtPRODUC_Prdexiccp = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Prdultecc = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Prdultdcc = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Prddifcc = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Prdvalstk = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Difvalstk = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Prdfecent = GXutil.nullDate() ;
      gxTv_SdtPRODUC_Prdtip = "" ;
      gxTv_SdtPRODUC_Prdrev = "" ;
      gxTv_SdtPRODUC_Prdnom2 = "" ;
      gxTv_SdtPRODUC_Prdnum2 = "" ;
      gxTv_SdtPRODUC_Prdobs = "" ;
      gxTv_SdtPRODUC_Prdpreac2 = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Prddenss = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Prdconcs = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Prdsalm = "" ;
      gxTv_SdtPRODUC_Prdsolub = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Tipprddsc = "" ;
      gxTv_SdtPRODUC_Prdnumcentra = "" ;
      gxTv_SdtPRODUC_Prdnumct1 = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Prdnumct2 = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Prdexialmc = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Prdpesterm = "" ;
      gxTv_SdtPRODUC_Prdsal = "" ;
      gxTv_SdtPRODUC_Subfamdsc = "" ;
      gxTv_SdtPRODUC_Prdinc = "" ;
      gxTv_SdtPRODUC_Prdcomp = "" ;
      gxTv_SdtPRODUC_Prdaox = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Prdncas = "" ;
      gxTv_SdtPRODUC_Prdft = "" ;
      gxTv_SdtPRODUC_Prdfft = GXutil.nullDate() ;
      gxTv_SdtPRODUC_Prdhs = "" ;
      gxTv_SdtPRODUC_Prdfhs = GXutil.nullDate() ;
      gxTv_SdtPRODUC_Prdcolidx = "" ;
      gxTv_SdtPRODUC_Prdokotex = "" ;
      gxTv_SdtPRODUC_Prdreach = "" ;
      gxTv_SdtPRODUC_Prdlote = "" ;
      gxTv_SdtPRODUC_Prdrtm = "" ;
      gxTv_SdtPRODUC_Prdctw1 = "" ;
      gxTv_SdtPRODUC_Prdctw2 = "" ;
      gxTv_SdtPRODUC_Prdctw3 = "" ;
      gxTv_SdtPRODUC_Prdctw4 = "" ;
      gxTv_SdtPRODUC_Prdnrocas = "" ;
      gxTv_SdtPRODUC_Prdgots = "" ;
      gxTv_SdtPRODUC_Prdhm = "" ;
      gxTv_SdtPRODUC_Prdeinecs = "" ;
      gxTv_SdtPRODUC_Prdfuncion = "" ;
      gxTv_SdtPRODUC_Prdnmqu = "" ;
      gxTv_SdtPRODUC_Prdlist = "" ;
      gxTv_SdtPRODUC_Prdfabnm = "" ;
      gxTv_SdtPRODUC_Prdloteob = "" ;
      gxTv_SdtPRODUC_Prdzdhc = "" ;
      gxTv_SdtPRODUC_Prdthelist = "" ;
      gxTv_SdtPRODUC_Prdubicacion = "" ;
      gxTv_SdtPRODUC_Prdeqlp = "" ;
      gxTv_SdtPRODUC_Prdmatseca = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Prdlotefch = GXutil.nullDate() ;
      gxTv_SdtPRODUC_Prdftdoc = "" ;
      gxTv_SdtPRODUC_Prdfsdoc = "" ;
      gxTv_SdtPRODUC_Prdgrs = "" ;
      gxTv_SdtPRODUC_Prdcdsc = "" ;
      gxTv_SdtPRODUC_Prddisponible = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Prdfecultmov = GXutil.nullDate() ;
      gxTv_SdtPRODUC_Prdtipmovult = "" ;
      gxTv_SdtPRODUC_Prdlastfechcc = GXutil.nullDate() ;
      gxTv_SdtPRODUC_Prdlasttipmovcc = "" ;
      gxTv_SdtPRODUC_Mode = "" ;
      gxTv_SdtPRODUC_Emprcod_Z = "" ;
      gxTv_SdtPRODUC_Emprnom_Z = "" ;
      gxTv_SdtPRODUC_Prdnum_Z = "" ;
      gxTv_SdtPRODUC_Prdnom_Z = "" ;
      gxTv_SdtPRODUC_Prvnom_Z = "" ;
      gxTv_SdtPRODUC_Prdrefprv_Z = "" ;
      gxTv_SdtPRODUC_Prddsctec_Z = "" ;
      gxTv_SdtPRODUC_Prducpdsc_Z = "" ;
      gxTv_SdtPRODUC_Prducodsc_Z = "" ;
      gxTv_SdtPRODUC_Prdfaccon_Z = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Valdsc_Z = "" ;
      gxTv_SdtPRODUC_Prdrec_Z = "" ;
      gxTv_SdtPRODUC_Prdcalnec_Z = "" ;
      gxTv_SdtPRODUC_Prddetpar_Z = "" ;
      gxTv_SdtPRODUC_Prdrotrea_Z = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Tipdtodto_Z = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Prdpreact_Z = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Prdfecpre_Z = GXutil.nullDate() ;
      gxTv_SdtPRODUC_Prdpreant_Z = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Prdpremed_Z = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Prdcondia_Z = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Prdstkminu_Z = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Metdsc_Z = "" ;
      gxTv_SdtPRODUC_Prdnumuco_Z = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Prdexialm_Z = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Prdexicc_Z = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Prdcanres_Z = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Prdcanpen_Z = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Prdfulent_Z = GXutil.nullDate() ;
      gxTv_SdtPRODUC_Prdfulped_Z = GXutil.nullDate() ;
      gxTv_SdtPRODUC_Prdfulcc_Z = GXutil.nullDate() ;
      gxTv_SdtPRODUC_Prdexiccp_Z = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Prdultecc_Z = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Prdultdcc_Z = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Prddifcc_Z = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Prdvalstk_Z = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Difvalstk_Z = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Prdfecent_Z = GXutil.nullDate() ;
      gxTv_SdtPRODUC_Prdtip_Z = "" ;
      gxTv_SdtPRODUC_Prdrev_Z = "" ;
      gxTv_SdtPRODUC_Prdnom2_Z = "" ;
      gxTv_SdtPRODUC_Prdnum2_Z = "" ;
      gxTv_SdtPRODUC_Prdobs_Z = "" ;
      gxTv_SdtPRODUC_Prdpreac2_Z = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Prddenss_Z = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Prdconcs_Z = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Prdsalm_Z = "" ;
      gxTv_SdtPRODUC_Prdsolub_Z = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Tipprddsc_Z = "" ;
      gxTv_SdtPRODUC_Prdnumcentra_Z = "" ;
      gxTv_SdtPRODUC_Prdnumct1_Z = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Prdnumct2_Z = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Prdexialmc_Z = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Prdpesterm_Z = "" ;
      gxTv_SdtPRODUC_Prdsal_Z = "" ;
      gxTv_SdtPRODUC_Subfamdsc_Z = "" ;
      gxTv_SdtPRODUC_Prdinc_Z = "" ;
      gxTv_SdtPRODUC_Prdcomp_Z = "" ;
      gxTv_SdtPRODUC_Prdaox_Z = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Prdncas_Z = "" ;
      gxTv_SdtPRODUC_Prdft_Z = "" ;
      gxTv_SdtPRODUC_Prdfft_Z = GXutil.nullDate() ;
      gxTv_SdtPRODUC_Prdhs_Z = "" ;
      gxTv_SdtPRODUC_Prdfhs_Z = GXutil.nullDate() ;
      gxTv_SdtPRODUC_Prdcolidx_Z = "" ;
      gxTv_SdtPRODUC_Prdokotex_Z = "" ;
      gxTv_SdtPRODUC_Prdreach_Z = "" ;
      gxTv_SdtPRODUC_Prdlote_Z = "" ;
      gxTv_SdtPRODUC_Prdrtm_Z = "" ;
      gxTv_SdtPRODUC_Prdctw1_Z = "" ;
      gxTv_SdtPRODUC_Prdctw2_Z = "" ;
      gxTv_SdtPRODUC_Prdctw3_Z = "" ;
      gxTv_SdtPRODUC_Prdctw4_Z = "" ;
      gxTv_SdtPRODUC_Prdnrocas_Z = "" ;
      gxTv_SdtPRODUC_Prdgots_Z = "" ;
      gxTv_SdtPRODUC_Prdhm_Z = "" ;
      gxTv_SdtPRODUC_Prdeinecs_Z = "" ;
      gxTv_SdtPRODUC_Prdfuncion_Z = "" ;
      gxTv_SdtPRODUC_Prdnmqu_Z = "" ;
      gxTv_SdtPRODUC_Prdlist_Z = "" ;
      gxTv_SdtPRODUC_Prdfabnm_Z = "" ;
      gxTv_SdtPRODUC_Prdloteob_Z = "" ;
      gxTv_SdtPRODUC_Prdzdhc_Z = "" ;
      gxTv_SdtPRODUC_Prdthelist_Z = "" ;
      gxTv_SdtPRODUC_Prdubicacion_Z = "" ;
      gxTv_SdtPRODUC_Prdeqlp_Z = "" ;
      gxTv_SdtPRODUC_Prdmatseca_Z = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Prdlotefch_Z = GXutil.nullDate() ;
      gxTv_SdtPRODUC_Prdftdoc_Z = "" ;
      gxTv_SdtPRODUC_Prdfsdoc_Z = "" ;
      gxTv_SdtPRODUC_Prdgrs_Z = "" ;
      gxTv_SdtPRODUC_Prdcdsc_Z = "" ;
      gxTv_SdtPRODUC_Prddisponible_Z = DecimalUtil.ZERO ;
      gxTv_SdtPRODUC_Prdfecultmov_Z = GXutil.nullDate() ;
      gxTv_SdtPRODUC_Prdtipmovult_Z = "" ;
      gxTv_SdtPRODUC_Prdlastfechcc_Z = GXutil.nullDate() ;
      gxTv_SdtPRODUC_Prdlasttipmovcc_Z = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtPRODUC_N ;
   }

   public app.stocksquimicos.SdtPRODUC Clone( )
   {
      app.stocksquimicos.SdtPRODUC sdt;
      app.stocksquimicos.produc_bc obj;
      sdt = (app.stocksquimicos.SdtPRODUC)(clone()) ;
      obj = (app.stocksquimicos.produc_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( app.stocksquimicos.StructSdtPRODUC struct )
   {
      setgxTv_SdtPRODUC_Emprcod(struct.getEmprcod());
      setgxTv_SdtPRODUC_Emprnom(struct.getEmprnom());
      setgxTv_SdtPRODUC_Prdnum(struct.getPrdnum());
      setgxTv_SdtPRODUC_Prdnom(struct.getPrdnom());
      setgxTv_SdtPRODUC_Prvnum(struct.getPrvnum());
      setgxTv_SdtPRODUC_Prvnom(struct.getPrvnom());
      setgxTv_SdtPRODUC_Prdrefprv(struct.getPrdrefprv());
      setgxTv_SdtPRODUC_Prddsctec(struct.getPrddsctec());
      setgxTv_SdtPRODUC_Prdunicom(struct.getPrdunicom());
      setgxTv_SdtPRODUC_Prducpdsc(struct.getPrducpdsc());
      setgxTv_SdtPRODUC_Prdunicon(struct.getPrdunicon());
      setgxTv_SdtPRODUC_Prducodsc(struct.getPrducodsc());
      setgxTv_SdtPRODUC_Prdfaccon(struct.getPrdfaccon());
      setgxTv_SdtPRODUC_Valcod(struct.getValcod());
      setgxTv_SdtPRODUC_Valdsc(struct.getValdsc());
      setgxTv_SdtPRODUC_Prdrec(struct.getPrdrec());
      setgxTv_SdtPRODUC_Prdcalnec(struct.getPrdcalnec());
      setgxTv_SdtPRODUC_Prddetpar(struct.getPrddetpar());
      setgxTv_SdtPRODUC_Prdsit(struct.getPrdsit());
      setgxTv_SdtPRODUC_Prdrotrea(struct.getPrdrotrea());
      setgxTv_SdtPRODUC_Tipdtocod(struct.getTipdtocod());
      setgxTv_SdtPRODUC_Tipdtodto(struct.getTipdtodto());
      setgxTv_SdtPRODUC_Prdpreact(struct.getPrdpreact());
      setgxTv_SdtPRODUC_Prdfecpre(struct.getPrdfecpre());
      setgxTv_SdtPRODUC_Prdpreant(struct.getPrdpreant());
      setgxTv_SdtPRODUC_Prdpremed(struct.getPrdpremed());
      setgxTv_SdtPRODUC_Prdcondia(struct.getPrdcondia());
      setgxTv_SdtPRODUC_Prdstkmind(struct.getPrdstkmind());
      setgxTv_SdtPRODUC_Prdstkminu(struct.getPrdstkminu());
      setgxTv_SdtPRODUC_Prddiarot(struct.getPrddiarot());
      setgxTv_SdtPRODUC_Prdplaent(struct.getPrdplaent());
      setgxTv_SdtPRODUC_Metcod(struct.getMetcod());
      setgxTv_SdtPRODUC_Metdsc(struct.getMetdsc());
      setgxTv_SdtPRODUC_Prdlotmin(struct.getPrdlotmin());
      setgxTv_SdtPRODUC_Prdnumuco(struct.getPrdnumuco());
      setgxTv_SdtPRODUC_Prdexialm(struct.getPrdexialm());
      setgxTv_SdtPRODUC_Prdexicc(struct.getPrdexicc());
      setgxTv_SdtPRODUC_Prdcanres(struct.getPrdcanres());
      setgxTv_SdtPRODUC_Prdcanpen(struct.getPrdcanpen());
      setgxTv_SdtPRODUC_Prdfulent(struct.getPrdfulent());
      setgxTv_SdtPRODUC_Prdfulped(struct.getPrdfulped());
      setgxTv_SdtPRODUC_Prdfulcc(struct.getPrdfulcc());
      setgxTv_SdtPRODUC_Prdexiccp(struct.getPrdexiccp());
      setgxTv_SdtPRODUC_Prdultecc(struct.getPrdultecc());
      setgxTv_SdtPRODUC_Prdultccc(struct.getPrdultccc());
      setgxTv_SdtPRODUC_Prdultdcc(struct.getPrdultdcc());
      setgxTv_SdtPRODUC_Prddifcc(struct.getPrddifcc());
      setgxTv_SdtPRODUC_Prdconcc(struct.getPrdconcc());
      setgxTv_SdtPRODUC_Prdvalstk(struct.getPrdvalstk());
      setgxTv_SdtPRODUC_Difvalstk(struct.getDifvalstk());
      setgxTv_SdtPRODUC_Prdfecent(struct.getPrdfecent());
      setgxTv_SdtPRODUC_Prdposx(struct.getPrdposx());
      setgxTv_SdtPRODUC_Prdposy(struct.getPrdposy());
      setgxTv_SdtPRODUC_Prdtip(struct.getPrdtip());
      setgxTv_SdtPRODUC_Prddqo(struct.getPrddqo());
      setgxTv_SdtPRODUC_Prdrev(struct.getPrdrev());
      setgxTv_SdtPRODUC_Prdtnq(struct.getPrdtnq());
      setgxTv_SdtPRODUC_Prdnom2(struct.getPrdnom2());
      setgxTv_SdtPRODUC_Prdnum2(struct.getPrdnum2());
      setgxTv_SdtPRODUC_Prdobs(struct.getPrdobs());
      setgxTv_SdtPRODUC_Prdumefo(struct.getPrdumefo());
      setgxTv_SdtPRODUC_Prdpreac2(struct.getPrdpreac2());
      setgxTv_SdtPRODUC_Prddenss(struct.getPrddenss());
      setgxTv_SdtPRODUC_Prdconcs(struct.getPrdconcs());
      setgxTv_SdtPRODUC_Prdsalm(struct.getPrdsalm());
      setgxTv_SdtPRODUC_Prdsolub(struct.getPrdsolub());
      setgxTv_SdtPRODUC_Tipprdcod(struct.getTipprdcod());
      setgxTv_SdtPRODUC_Tipprddsc(struct.getTipprddsc());
      setgxTv_SdtPRODUC_Prdnumcentra(struct.getPrdnumcentra());
      setgxTv_SdtPRODUC_Prdnumct1(struct.getPrdnumct1());
      setgxTv_SdtPRODUC_Prdnumct2(struct.getPrdnumct2());
      setgxTv_SdtPRODUC_Prdhormad(struct.getPrdhormad());
      setgxTv_SdtPRODUC_Prdexialmc(struct.getPrdexialmc());
      setgxTv_SdtPRODUC_Prdpesterm(struct.getPrdpesterm());
      setgxTv_SdtPRODUC_Prdsal(struct.getPrdsal());
      setgxTv_SdtPRODUC_Subfamcod(struct.getSubfamcod());
      setgxTv_SdtPRODUC_Subfamdsc(struct.getSubfamdsc());
      setgxTv_SdtPRODUC_Prdinc(struct.getPrdinc());
      setgxTv_SdtPRODUC_Prdcomp(struct.getPrdcomp());
      setgxTv_SdtPRODUC_Prdaox(struct.getPrdaox());
      setgxTv_SdtPRODUC_Prdncas(struct.getPrdncas());
      setgxTv_SdtPRODUC_Prdft(struct.getPrdft());
      setgxTv_SdtPRODUC_Prdfft(struct.getPrdfft());
      setgxTv_SdtPRODUC_Prdhs(struct.getPrdhs());
      setgxTv_SdtPRODUC_Prdfhs(struct.getPrdfhs());
      setgxTv_SdtPRODUC_Prdcolidx(struct.getPrdcolidx());
      setgxTv_SdtPRODUC_Prdokotex(struct.getPrdokotex());
      setgxTv_SdtPRODUC_Prdreach(struct.getPrdreach());
      setgxTv_SdtPRODUC_Prdlote(struct.getPrdlote());
      setgxTv_SdtPRODUC_Prdrtm(struct.getPrdrtm());
      setgxTv_SdtPRODUC_Prdctw1(struct.getPrdctw1());
      setgxTv_SdtPRODUC_Prdctw2(struct.getPrdctw2());
      setgxTv_SdtPRODUC_Prdctw3(struct.getPrdctw3());
      setgxTv_SdtPRODUC_Prdctw4(struct.getPrdctw4());
      setgxTv_SdtPRODUC_Prdnrocas(struct.getPrdnrocas());
      setgxTv_SdtPRODUC_Prdgots(struct.getPrdgots());
      setgxTv_SdtPRODUC_Prdhm(struct.getPrdhm());
      setgxTv_SdtPRODUC_Prdconct(struct.getPrdconct());
      setgxTv_SdtPRODUC_Prdeinecs(struct.getPrdeinecs());
      setgxTv_SdtPRODUC_Prdfuncion(struct.getPrdfuncion());
      setgxTv_SdtPRODUC_Prdnmqu(struct.getPrdnmqu());
      setgxTv_SdtPRODUC_Prdlist(struct.getPrdlist());
      setgxTv_SdtPRODUC_Prdfabid(struct.getPrdfabid());
      setgxTv_SdtPRODUC_Prdfabnm(struct.getPrdfabnm());
      setgxTv_SdtPRODUC_Prdloteob(struct.getPrdloteob());
      setgxTv_SdtPRODUC_Prdrgb(struct.getPrdrgb());
      setgxTv_SdtPRODUC_Prdzdhc(struct.getPrdzdhc());
      setgxTv_SdtPRODUC_Prdthelist(struct.getPrdthelist());
      setgxTv_SdtPRODUC_Prdubicacion(struct.getPrdubicacion());
      setgxTv_SdtPRODUC_Prdeqlp(struct.getPrdeqlp());
      setgxTv_SdtPRODUC_Prdpescon(struct.getPrdpescon());
      setgxTv_SdtPRODUC_Prdcantatm(struct.getPrdcantatm());
      setgxTv_SdtPRODUC_Prdgrufamid(struct.getPrdgrufamid());
      setgxTv_SdtPRODUC_Prdmatseca(struct.getPrdmatseca());
      setgxTv_SdtPRODUC_Almprdid(struct.getAlmprdid());
      setgxTv_SdtPRODUC_Prdlotefch(struct.getPrdlotefch());
      setgxTv_SdtPRODUC_Prdftdoc(struct.getPrdftdoc());
      setgxTv_SdtPRODUC_Prdfsdoc(struct.getPrdfsdoc());
      setgxTv_SdtPRODUC_Prdgrs(struct.getPrdgrs());
      setgxTv_SdtPRODUC_Prdcdsc(struct.getPrdcdsc());
      setgxTv_SdtPRODUC_Prddisponible(struct.getPrddisponible());
      setgxTv_SdtPRODUC_Prddiasinactivo(struct.getPrddiasinactivo());
      setgxTv_SdtPRODUC_Prdultmovcc(struct.getPrdultmovcc());
      setgxTv_SdtPRODUC_Prdfecultmov(struct.getPrdfecultmov());
      setgxTv_SdtPRODUC_Prdtipmovult(struct.getPrdtipmovult());
      setgxTv_SdtPRODUC_Prdlastlineacc(struct.getPrdlastlineacc());
      setgxTv_SdtPRODUC_Prdlastfechcc(struct.getPrdlastfechcc());
      setgxTv_SdtPRODUC_Prdlasttipmovcc(struct.getPrdlasttipmovcc());
      setgxTv_SdtPRODUC_Prdescompuesto(struct.getPrdescompuesto());
      setgxTv_SdtPRODUC_Prddiasinmov(struct.getPrddiasinmov());
      setgxTv_SdtPRODUC_Mode(struct.getMode());
      setgxTv_SdtPRODUC_Initialized(struct.getInitialized());
      setgxTv_SdtPRODUC_Emprcod_Z(struct.getEmprcod_Z());
      setgxTv_SdtPRODUC_Emprnom_Z(struct.getEmprnom_Z());
      setgxTv_SdtPRODUC_Prdnum_Z(struct.getPrdnum_Z());
      setgxTv_SdtPRODUC_Prdnom_Z(struct.getPrdnom_Z());
      setgxTv_SdtPRODUC_Prvnum_Z(struct.getPrvnum_Z());
      setgxTv_SdtPRODUC_Prvnom_Z(struct.getPrvnom_Z());
      setgxTv_SdtPRODUC_Prdrefprv_Z(struct.getPrdrefprv_Z());
      setgxTv_SdtPRODUC_Prddsctec_Z(struct.getPrddsctec_Z());
      setgxTv_SdtPRODUC_Prdunicom_Z(struct.getPrdunicom_Z());
      setgxTv_SdtPRODUC_Prducpdsc_Z(struct.getPrducpdsc_Z());
      setgxTv_SdtPRODUC_Prdunicon_Z(struct.getPrdunicon_Z());
      setgxTv_SdtPRODUC_Prducodsc_Z(struct.getPrducodsc_Z());
      setgxTv_SdtPRODUC_Prdfaccon_Z(struct.getPrdfaccon_Z());
      setgxTv_SdtPRODUC_Valcod_Z(struct.getValcod_Z());
      setgxTv_SdtPRODUC_Valdsc_Z(struct.getValdsc_Z());
      setgxTv_SdtPRODUC_Prdrec_Z(struct.getPrdrec_Z());
      setgxTv_SdtPRODUC_Prdcalnec_Z(struct.getPrdcalnec_Z());
      setgxTv_SdtPRODUC_Prddetpar_Z(struct.getPrddetpar_Z());
      setgxTv_SdtPRODUC_Prdsit_Z(struct.getPrdsit_Z());
      setgxTv_SdtPRODUC_Prdrotrea_Z(struct.getPrdrotrea_Z());
      setgxTv_SdtPRODUC_Tipdtocod_Z(struct.getTipdtocod_Z());
      setgxTv_SdtPRODUC_Tipdtodto_Z(struct.getTipdtodto_Z());
      setgxTv_SdtPRODUC_Prdpreact_Z(struct.getPrdpreact_Z());
      setgxTv_SdtPRODUC_Prdfecpre_Z(struct.getPrdfecpre_Z());
      setgxTv_SdtPRODUC_Prdpreant_Z(struct.getPrdpreant_Z());
      setgxTv_SdtPRODUC_Prdpremed_Z(struct.getPrdpremed_Z());
      setgxTv_SdtPRODUC_Prdcondia_Z(struct.getPrdcondia_Z());
      setgxTv_SdtPRODUC_Prdstkmind_Z(struct.getPrdstkmind_Z());
      setgxTv_SdtPRODUC_Prdstkminu_Z(struct.getPrdstkminu_Z());
      setgxTv_SdtPRODUC_Prddiarot_Z(struct.getPrddiarot_Z());
      setgxTv_SdtPRODUC_Prdplaent_Z(struct.getPrdplaent_Z());
      setgxTv_SdtPRODUC_Metcod_Z(struct.getMetcod_Z());
      setgxTv_SdtPRODUC_Metdsc_Z(struct.getMetdsc_Z());
      setgxTv_SdtPRODUC_Prdlotmin_Z(struct.getPrdlotmin_Z());
      setgxTv_SdtPRODUC_Prdnumuco_Z(struct.getPrdnumuco_Z());
      setgxTv_SdtPRODUC_Prdexialm_Z(struct.getPrdexialm_Z());
      setgxTv_SdtPRODUC_Prdexicc_Z(struct.getPrdexicc_Z());
      setgxTv_SdtPRODUC_Prdcanres_Z(struct.getPrdcanres_Z());
      setgxTv_SdtPRODUC_Prdcanpen_Z(struct.getPrdcanpen_Z());
      setgxTv_SdtPRODUC_Prdfulent_Z(struct.getPrdfulent_Z());
      setgxTv_SdtPRODUC_Prdfulped_Z(struct.getPrdfulped_Z());
      setgxTv_SdtPRODUC_Prdfulcc_Z(struct.getPrdfulcc_Z());
      setgxTv_SdtPRODUC_Prdexiccp_Z(struct.getPrdexiccp_Z());
      setgxTv_SdtPRODUC_Prdultecc_Z(struct.getPrdultecc_Z());
      setgxTv_SdtPRODUC_Prdultccc_Z(struct.getPrdultccc_Z());
      setgxTv_SdtPRODUC_Prdultdcc_Z(struct.getPrdultdcc_Z());
      setgxTv_SdtPRODUC_Prddifcc_Z(struct.getPrddifcc_Z());
      setgxTv_SdtPRODUC_Prdconcc_Z(struct.getPrdconcc_Z());
      setgxTv_SdtPRODUC_Prdvalstk_Z(struct.getPrdvalstk_Z());
      setgxTv_SdtPRODUC_Difvalstk_Z(struct.getDifvalstk_Z());
      setgxTv_SdtPRODUC_Prdfecent_Z(struct.getPrdfecent_Z());
      setgxTv_SdtPRODUC_Prdposx_Z(struct.getPrdposx_Z());
      setgxTv_SdtPRODUC_Prdposy_Z(struct.getPrdposy_Z());
      setgxTv_SdtPRODUC_Prdtip_Z(struct.getPrdtip_Z());
      setgxTv_SdtPRODUC_Prddqo_Z(struct.getPrddqo_Z());
      setgxTv_SdtPRODUC_Prdrev_Z(struct.getPrdrev_Z());
      setgxTv_SdtPRODUC_Prdtnq_Z(struct.getPrdtnq_Z());
      setgxTv_SdtPRODUC_Prdnom2_Z(struct.getPrdnom2_Z());
      setgxTv_SdtPRODUC_Prdnum2_Z(struct.getPrdnum2_Z());
      setgxTv_SdtPRODUC_Prdobs_Z(struct.getPrdobs_Z());
      setgxTv_SdtPRODUC_Prdumefo_Z(struct.getPrdumefo_Z());
      setgxTv_SdtPRODUC_Prdpreac2_Z(struct.getPrdpreac2_Z());
      setgxTv_SdtPRODUC_Prddenss_Z(struct.getPrddenss_Z());
      setgxTv_SdtPRODUC_Prdconcs_Z(struct.getPrdconcs_Z());
      setgxTv_SdtPRODUC_Prdsalm_Z(struct.getPrdsalm_Z());
      setgxTv_SdtPRODUC_Prdsolub_Z(struct.getPrdsolub_Z());
      setgxTv_SdtPRODUC_Tipprdcod_Z(struct.getTipprdcod_Z());
      setgxTv_SdtPRODUC_Tipprddsc_Z(struct.getTipprddsc_Z());
      setgxTv_SdtPRODUC_Prdnumcentra_Z(struct.getPrdnumcentra_Z());
      setgxTv_SdtPRODUC_Prdnumct1_Z(struct.getPrdnumct1_Z());
      setgxTv_SdtPRODUC_Prdnumct2_Z(struct.getPrdnumct2_Z());
      setgxTv_SdtPRODUC_Prdhormad_Z(struct.getPrdhormad_Z());
      setgxTv_SdtPRODUC_Prdexialmc_Z(struct.getPrdexialmc_Z());
      setgxTv_SdtPRODUC_Prdpesterm_Z(struct.getPrdpesterm_Z());
      setgxTv_SdtPRODUC_Prdsal_Z(struct.getPrdsal_Z());
      setgxTv_SdtPRODUC_Subfamcod_Z(struct.getSubfamcod_Z());
      setgxTv_SdtPRODUC_Subfamdsc_Z(struct.getSubfamdsc_Z());
      setgxTv_SdtPRODUC_Prdinc_Z(struct.getPrdinc_Z());
      setgxTv_SdtPRODUC_Prdcomp_Z(struct.getPrdcomp_Z());
      setgxTv_SdtPRODUC_Prdaox_Z(struct.getPrdaox_Z());
      setgxTv_SdtPRODUC_Prdncas_Z(struct.getPrdncas_Z());
      setgxTv_SdtPRODUC_Prdft_Z(struct.getPrdft_Z());
      setgxTv_SdtPRODUC_Prdfft_Z(struct.getPrdfft_Z());
      setgxTv_SdtPRODUC_Prdhs_Z(struct.getPrdhs_Z());
      setgxTv_SdtPRODUC_Prdfhs_Z(struct.getPrdfhs_Z());
      setgxTv_SdtPRODUC_Prdcolidx_Z(struct.getPrdcolidx_Z());
      setgxTv_SdtPRODUC_Prdokotex_Z(struct.getPrdokotex_Z());
      setgxTv_SdtPRODUC_Prdreach_Z(struct.getPrdreach_Z());
      setgxTv_SdtPRODUC_Prdlote_Z(struct.getPrdlote_Z());
      setgxTv_SdtPRODUC_Prdrtm_Z(struct.getPrdrtm_Z());
      setgxTv_SdtPRODUC_Prdctw1_Z(struct.getPrdctw1_Z());
      setgxTv_SdtPRODUC_Prdctw2_Z(struct.getPrdctw2_Z());
      setgxTv_SdtPRODUC_Prdctw3_Z(struct.getPrdctw3_Z());
      setgxTv_SdtPRODUC_Prdctw4_Z(struct.getPrdctw4_Z());
      setgxTv_SdtPRODUC_Prdnrocas_Z(struct.getPrdnrocas_Z());
      setgxTv_SdtPRODUC_Prdgots_Z(struct.getPrdgots_Z());
      setgxTv_SdtPRODUC_Prdhm_Z(struct.getPrdhm_Z());
      setgxTv_SdtPRODUC_Prdconct_Z(struct.getPrdconct_Z());
      setgxTv_SdtPRODUC_Prdeinecs_Z(struct.getPrdeinecs_Z());
      setgxTv_SdtPRODUC_Prdfuncion_Z(struct.getPrdfuncion_Z());
      setgxTv_SdtPRODUC_Prdnmqu_Z(struct.getPrdnmqu_Z());
      setgxTv_SdtPRODUC_Prdlist_Z(struct.getPrdlist_Z());
      setgxTv_SdtPRODUC_Prdfabid_Z(struct.getPrdfabid_Z());
      setgxTv_SdtPRODUC_Prdfabnm_Z(struct.getPrdfabnm_Z());
      setgxTv_SdtPRODUC_Prdloteob_Z(struct.getPrdloteob_Z());
      setgxTv_SdtPRODUC_Prdrgb_Z(struct.getPrdrgb_Z());
      setgxTv_SdtPRODUC_Prdzdhc_Z(struct.getPrdzdhc_Z());
      setgxTv_SdtPRODUC_Prdthelist_Z(struct.getPrdthelist_Z());
      setgxTv_SdtPRODUC_Prdubicacion_Z(struct.getPrdubicacion_Z());
      setgxTv_SdtPRODUC_Prdeqlp_Z(struct.getPrdeqlp_Z());
      setgxTv_SdtPRODUC_Prdpescon_Z(struct.getPrdpescon_Z());
      setgxTv_SdtPRODUC_Prdcantatm_Z(struct.getPrdcantatm_Z());
      setgxTv_SdtPRODUC_Prdgrufamid_Z(struct.getPrdgrufamid_Z());
      setgxTv_SdtPRODUC_Prdmatseca_Z(struct.getPrdmatseca_Z());
      setgxTv_SdtPRODUC_Almprdid_Z(struct.getAlmprdid_Z());
      setgxTv_SdtPRODUC_Prdlotefch_Z(struct.getPrdlotefch_Z());
      setgxTv_SdtPRODUC_Prdftdoc_Z(struct.getPrdftdoc_Z());
      setgxTv_SdtPRODUC_Prdfsdoc_Z(struct.getPrdfsdoc_Z());
      setgxTv_SdtPRODUC_Prdgrs_Z(struct.getPrdgrs_Z());
      setgxTv_SdtPRODUC_Prdcdsc_Z(struct.getPrdcdsc_Z());
      setgxTv_SdtPRODUC_Prddisponible_Z(struct.getPrddisponible_Z());
      setgxTv_SdtPRODUC_Prddiasinactivo_Z(struct.getPrddiasinactivo_Z());
      setgxTv_SdtPRODUC_Prdultmovcc_Z(struct.getPrdultmovcc_Z());
      setgxTv_SdtPRODUC_Prdfecultmov_Z(struct.getPrdfecultmov_Z());
      setgxTv_SdtPRODUC_Prdtipmovult_Z(struct.getPrdtipmovult_Z());
      setgxTv_SdtPRODUC_Prdlastlineacc_Z(struct.getPrdlastlineacc_Z());
      setgxTv_SdtPRODUC_Prdlastfechcc_Z(struct.getPrdlastfechcc_Z());
      setgxTv_SdtPRODUC_Prdlasttipmovcc_Z(struct.getPrdlasttipmovcc_Z());
      setgxTv_SdtPRODUC_Prdescompuesto_Z(struct.getPrdescompuesto_Z());
      setgxTv_SdtPRODUC_Prddiasinmov_Z(struct.getPrddiasinmov_Z());
      setgxTv_SdtPRODUC_Emprnom_N(struct.getEmprnom_N());
      setgxTv_SdtPRODUC_Prdnum_N(struct.getPrdnum_N());
      setgxTv_SdtPRODUC_Prvnom_N(struct.getPrvnom_N());
      setgxTv_SdtPRODUC_Prducpdsc_N(struct.getPrducpdsc_N());
      setgxTv_SdtPRODUC_Prducodsc_N(struct.getPrducodsc_N());
      setgxTv_SdtPRODUC_Valdsc_N(struct.getValdsc_N());
      setgxTv_SdtPRODUC_Tipdtocod_N(struct.getTipdtocod_N());
      setgxTv_SdtPRODUC_Tipdtodto_N(struct.getTipdtodto_N());
      setgxTv_SdtPRODUC_Metcod_N(struct.getMetcod_N());
      setgxTv_SdtPRODUC_Metdsc_N(struct.getMetdsc_N());
      setgxTv_SdtPRODUC_Tipprdcod_N(struct.getTipprdcod_N());
      setgxTv_SdtPRODUC_Tipprddsc_N(struct.getTipprddsc_N());
      setgxTv_SdtPRODUC_Subfamcod_N(struct.getSubfamcod_N());
      setgxTv_SdtPRODUC_Subfamdsc_N(struct.getSubfamdsc_N());
      setgxTv_SdtPRODUC_Prdfabid_N(struct.getPrdfabid_N());
      setgxTv_SdtPRODUC_Prdfabnm_N(struct.getPrdfabnm_N());
      setgxTv_SdtPRODUC_Prdthelist_N(struct.getPrdthelist_N());
      setgxTv_SdtPRODUC_Prdcantatm_N(struct.getPrdcantatm_N());
      setgxTv_SdtPRODUC_Prdgrufamid_N(struct.getPrdgrufamid_N());
      setgxTv_SdtPRODUC_Prdmatseca_N(struct.getPrdmatseca_N());
      setgxTv_SdtPRODUC_Almprdid_N(struct.getAlmprdid_N());
      setgxTv_SdtPRODUC_Prdlotefch_N(struct.getPrdlotefch_N());
      setgxTv_SdtPRODUC_Prdftdoc_N(struct.getPrdftdoc_N());
      setgxTv_SdtPRODUC_Prdfsdoc_N(struct.getPrdfsdoc_N());
      setgxTv_SdtPRODUC_Prdgrs_N(struct.getPrdgrs_N());
      setgxTv_SdtPRODUC_Prdlastlineacc_N(struct.getPrdlastlineacc_N());
   }

   @SuppressWarnings("unchecked")
   public app.stocksquimicos.StructSdtPRODUC getStruct( )
   {
      app.stocksquimicos.StructSdtPRODUC struct = new app.stocksquimicos.StructSdtPRODUC ();
      struct.setEmprcod(getgxTv_SdtPRODUC_Emprcod());
      struct.setEmprnom(getgxTv_SdtPRODUC_Emprnom());
      struct.setPrdnum(getgxTv_SdtPRODUC_Prdnum());
      struct.setPrdnom(getgxTv_SdtPRODUC_Prdnom());
      struct.setPrvnum(getgxTv_SdtPRODUC_Prvnum());
      struct.setPrvnom(getgxTv_SdtPRODUC_Prvnom());
      struct.setPrdrefprv(getgxTv_SdtPRODUC_Prdrefprv());
      struct.setPrddsctec(getgxTv_SdtPRODUC_Prddsctec());
      struct.setPrdunicom(getgxTv_SdtPRODUC_Prdunicom());
      struct.setPrducpdsc(getgxTv_SdtPRODUC_Prducpdsc());
      struct.setPrdunicon(getgxTv_SdtPRODUC_Prdunicon());
      struct.setPrducodsc(getgxTv_SdtPRODUC_Prducodsc());
      struct.setPrdfaccon(getgxTv_SdtPRODUC_Prdfaccon());
      struct.setValcod(getgxTv_SdtPRODUC_Valcod());
      struct.setValdsc(getgxTv_SdtPRODUC_Valdsc());
      struct.setPrdrec(getgxTv_SdtPRODUC_Prdrec());
      struct.setPrdcalnec(getgxTv_SdtPRODUC_Prdcalnec());
      struct.setPrddetpar(getgxTv_SdtPRODUC_Prddetpar());
      struct.setPrdsit(getgxTv_SdtPRODUC_Prdsit());
      struct.setPrdrotrea(getgxTv_SdtPRODUC_Prdrotrea());
      struct.setTipdtocod(getgxTv_SdtPRODUC_Tipdtocod());
      struct.setTipdtodto(getgxTv_SdtPRODUC_Tipdtodto());
      struct.setPrdpreact(getgxTv_SdtPRODUC_Prdpreact());
      struct.setPrdfecpre(getgxTv_SdtPRODUC_Prdfecpre());
      struct.setPrdpreant(getgxTv_SdtPRODUC_Prdpreant());
      struct.setPrdpremed(getgxTv_SdtPRODUC_Prdpremed());
      struct.setPrdcondia(getgxTv_SdtPRODUC_Prdcondia());
      struct.setPrdstkmind(getgxTv_SdtPRODUC_Prdstkmind());
      struct.setPrdstkminu(getgxTv_SdtPRODUC_Prdstkminu());
      struct.setPrddiarot(getgxTv_SdtPRODUC_Prddiarot());
      struct.setPrdplaent(getgxTv_SdtPRODUC_Prdplaent());
      struct.setMetcod(getgxTv_SdtPRODUC_Metcod());
      struct.setMetdsc(getgxTv_SdtPRODUC_Metdsc());
      struct.setPrdlotmin(getgxTv_SdtPRODUC_Prdlotmin());
      struct.setPrdnumuco(getgxTv_SdtPRODUC_Prdnumuco());
      struct.setPrdexialm(getgxTv_SdtPRODUC_Prdexialm());
      struct.setPrdexicc(getgxTv_SdtPRODUC_Prdexicc());
      struct.setPrdcanres(getgxTv_SdtPRODUC_Prdcanres());
      struct.setPrdcanpen(getgxTv_SdtPRODUC_Prdcanpen());
      struct.setPrdfulent(getgxTv_SdtPRODUC_Prdfulent());
      struct.setPrdfulped(getgxTv_SdtPRODUC_Prdfulped());
      struct.setPrdfulcc(getgxTv_SdtPRODUC_Prdfulcc());
      struct.setPrdexiccp(getgxTv_SdtPRODUC_Prdexiccp());
      struct.setPrdultecc(getgxTv_SdtPRODUC_Prdultecc());
      struct.setPrdultccc(getgxTv_SdtPRODUC_Prdultccc());
      struct.setPrdultdcc(getgxTv_SdtPRODUC_Prdultdcc());
      struct.setPrddifcc(getgxTv_SdtPRODUC_Prddifcc());
      struct.setPrdconcc(getgxTv_SdtPRODUC_Prdconcc());
      struct.setPrdvalstk(getgxTv_SdtPRODUC_Prdvalstk());
      struct.setDifvalstk(getgxTv_SdtPRODUC_Difvalstk());
      struct.setPrdfecent(getgxTv_SdtPRODUC_Prdfecent());
      struct.setPrdposx(getgxTv_SdtPRODUC_Prdposx());
      struct.setPrdposy(getgxTv_SdtPRODUC_Prdposy());
      struct.setPrdtip(getgxTv_SdtPRODUC_Prdtip());
      struct.setPrddqo(getgxTv_SdtPRODUC_Prddqo());
      struct.setPrdrev(getgxTv_SdtPRODUC_Prdrev());
      struct.setPrdtnq(getgxTv_SdtPRODUC_Prdtnq());
      struct.setPrdnom2(getgxTv_SdtPRODUC_Prdnom2());
      struct.setPrdnum2(getgxTv_SdtPRODUC_Prdnum2());
      struct.setPrdobs(getgxTv_SdtPRODUC_Prdobs());
      struct.setPrdumefo(getgxTv_SdtPRODUC_Prdumefo());
      struct.setPrdpreac2(getgxTv_SdtPRODUC_Prdpreac2());
      struct.setPrddenss(getgxTv_SdtPRODUC_Prddenss());
      struct.setPrdconcs(getgxTv_SdtPRODUC_Prdconcs());
      struct.setPrdsalm(getgxTv_SdtPRODUC_Prdsalm());
      struct.setPrdsolub(getgxTv_SdtPRODUC_Prdsolub());
      struct.setTipprdcod(getgxTv_SdtPRODUC_Tipprdcod());
      struct.setTipprddsc(getgxTv_SdtPRODUC_Tipprddsc());
      struct.setPrdnumcentra(getgxTv_SdtPRODUC_Prdnumcentra());
      struct.setPrdnumct1(getgxTv_SdtPRODUC_Prdnumct1());
      struct.setPrdnumct2(getgxTv_SdtPRODUC_Prdnumct2());
      struct.setPrdhormad(getgxTv_SdtPRODUC_Prdhormad());
      struct.setPrdexialmc(getgxTv_SdtPRODUC_Prdexialmc());
      struct.setPrdpesterm(getgxTv_SdtPRODUC_Prdpesterm());
      struct.setPrdsal(getgxTv_SdtPRODUC_Prdsal());
      struct.setSubfamcod(getgxTv_SdtPRODUC_Subfamcod());
      struct.setSubfamdsc(getgxTv_SdtPRODUC_Subfamdsc());
      struct.setPrdinc(getgxTv_SdtPRODUC_Prdinc());
      struct.setPrdcomp(getgxTv_SdtPRODUC_Prdcomp());
      struct.setPrdaox(getgxTv_SdtPRODUC_Prdaox());
      struct.setPrdncas(getgxTv_SdtPRODUC_Prdncas());
      struct.setPrdft(getgxTv_SdtPRODUC_Prdft());
      struct.setPrdfft(getgxTv_SdtPRODUC_Prdfft());
      struct.setPrdhs(getgxTv_SdtPRODUC_Prdhs());
      struct.setPrdfhs(getgxTv_SdtPRODUC_Prdfhs());
      struct.setPrdcolidx(getgxTv_SdtPRODUC_Prdcolidx());
      struct.setPrdokotex(getgxTv_SdtPRODUC_Prdokotex());
      struct.setPrdreach(getgxTv_SdtPRODUC_Prdreach());
      struct.setPrdlote(getgxTv_SdtPRODUC_Prdlote());
      struct.setPrdrtm(getgxTv_SdtPRODUC_Prdrtm());
      struct.setPrdctw1(getgxTv_SdtPRODUC_Prdctw1());
      struct.setPrdctw2(getgxTv_SdtPRODUC_Prdctw2());
      struct.setPrdctw3(getgxTv_SdtPRODUC_Prdctw3());
      struct.setPrdctw4(getgxTv_SdtPRODUC_Prdctw4());
      struct.setPrdnrocas(getgxTv_SdtPRODUC_Prdnrocas());
      struct.setPrdgots(getgxTv_SdtPRODUC_Prdgots());
      struct.setPrdhm(getgxTv_SdtPRODUC_Prdhm());
      struct.setPrdconct(getgxTv_SdtPRODUC_Prdconct());
      struct.setPrdeinecs(getgxTv_SdtPRODUC_Prdeinecs());
      struct.setPrdfuncion(getgxTv_SdtPRODUC_Prdfuncion());
      struct.setPrdnmqu(getgxTv_SdtPRODUC_Prdnmqu());
      struct.setPrdlist(getgxTv_SdtPRODUC_Prdlist());
      struct.setPrdfabid(getgxTv_SdtPRODUC_Prdfabid());
      struct.setPrdfabnm(getgxTv_SdtPRODUC_Prdfabnm());
      struct.setPrdloteob(getgxTv_SdtPRODUC_Prdloteob());
      struct.setPrdrgb(getgxTv_SdtPRODUC_Prdrgb());
      struct.setPrdzdhc(getgxTv_SdtPRODUC_Prdzdhc());
      struct.setPrdthelist(getgxTv_SdtPRODUC_Prdthelist());
      struct.setPrdubicacion(getgxTv_SdtPRODUC_Prdubicacion());
      struct.setPrdeqlp(getgxTv_SdtPRODUC_Prdeqlp());
      struct.setPrdpescon(getgxTv_SdtPRODUC_Prdpescon());
      struct.setPrdcantatm(getgxTv_SdtPRODUC_Prdcantatm());
      struct.setPrdgrufamid(getgxTv_SdtPRODUC_Prdgrufamid());
      struct.setPrdmatseca(getgxTv_SdtPRODUC_Prdmatseca());
      struct.setAlmprdid(getgxTv_SdtPRODUC_Almprdid());
      struct.setPrdlotefch(getgxTv_SdtPRODUC_Prdlotefch());
      struct.setPrdftdoc(getgxTv_SdtPRODUC_Prdftdoc());
      struct.setPrdfsdoc(getgxTv_SdtPRODUC_Prdfsdoc());
      struct.setPrdgrs(getgxTv_SdtPRODUC_Prdgrs());
      struct.setPrdcdsc(getgxTv_SdtPRODUC_Prdcdsc());
      struct.setPrddisponible(getgxTv_SdtPRODUC_Prddisponible());
      struct.setPrddiasinactivo(getgxTv_SdtPRODUC_Prddiasinactivo());
      struct.setPrdultmovcc(getgxTv_SdtPRODUC_Prdultmovcc());
      struct.setPrdfecultmov(getgxTv_SdtPRODUC_Prdfecultmov());
      struct.setPrdtipmovult(getgxTv_SdtPRODUC_Prdtipmovult());
      struct.setPrdlastlineacc(getgxTv_SdtPRODUC_Prdlastlineacc());
      struct.setPrdlastfechcc(getgxTv_SdtPRODUC_Prdlastfechcc());
      struct.setPrdlasttipmovcc(getgxTv_SdtPRODUC_Prdlasttipmovcc());
      struct.setPrdescompuesto(getgxTv_SdtPRODUC_Prdescompuesto());
      struct.setPrddiasinmov(getgxTv_SdtPRODUC_Prddiasinmov());
      struct.setMode(getgxTv_SdtPRODUC_Mode());
      struct.setInitialized(getgxTv_SdtPRODUC_Initialized());
      struct.setEmprcod_Z(getgxTv_SdtPRODUC_Emprcod_Z());
      struct.setEmprnom_Z(getgxTv_SdtPRODUC_Emprnom_Z());
      struct.setPrdnum_Z(getgxTv_SdtPRODUC_Prdnum_Z());
      struct.setPrdnom_Z(getgxTv_SdtPRODUC_Prdnom_Z());
      struct.setPrvnum_Z(getgxTv_SdtPRODUC_Prvnum_Z());
      struct.setPrvnom_Z(getgxTv_SdtPRODUC_Prvnom_Z());
      struct.setPrdrefprv_Z(getgxTv_SdtPRODUC_Prdrefprv_Z());
      struct.setPrddsctec_Z(getgxTv_SdtPRODUC_Prddsctec_Z());
      struct.setPrdunicom_Z(getgxTv_SdtPRODUC_Prdunicom_Z());
      struct.setPrducpdsc_Z(getgxTv_SdtPRODUC_Prducpdsc_Z());
      struct.setPrdunicon_Z(getgxTv_SdtPRODUC_Prdunicon_Z());
      struct.setPrducodsc_Z(getgxTv_SdtPRODUC_Prducodsc_Z());
      struct.setPrdfaccon_Z(getgxTv_SdtPRODUC_Prdfaccon_Z());
      struct.setValcod_Z(getgxTv_SdtPRODUC_Valcod_Z());
      struct.setValdsc_Z(getgxTv_SdtPRODUC_Valdsc_Z());
      struct.setPrdrec_Z(getgxTv_SdtPRODUC_Prdrec_Z());
      struct.setPrdcalnec_Z(getgxTv_SdtPRODUC_Prdcalnec_Z());
      struct.setPrddetpar_Z(getgxTv_SdtPRODUC_Prddetpar_Z());
      struct.setPrdsit_Z(getgxTv_SdtPRODUC_Prdsit_Z());
      struct.setPrdrotrea_Z(getgxTv_SdtPRODUC_Prdrotrea_Z());
      struct.setTipdtocod_Z(getgxTv_SdtPRODUC_Tipdtocod_Z());
      struct.setTipdtodto_Z(getgxTv_SdtPRODUC_Tipdtodto_Z());
      struct.setPrdpreact_Z(getgxTv_SdtPRODUC_Prdpreact_Z());
      struct.setPrdfecpre_Z(getgxTv_SdtPRODUC_Prdfecpre_Z());
      struct.setPrdpreant_Z(getgxTv_SdtPRODUC_Prdpreant_Z());
      struct.setPrdpremed_Z(getgxTv_SdtPRODUC_Prdpremed_Z());
      struct.setPrdcondia_Z(getgxTv_SdtPRODUC_Prdcondia_Z());
      struct.setPrdstkmind_Z(getgxTv_SdtPRODUC_Prdstkmind_Z());
      struct.setPrdstkminu_Z(getgxTv_SdtPRODUC_Prdstkminu_Z());
      struct.setPrddiarot_Z(getgxTv_SdtPRODUC_Prddiarot_Z());
      struct.setPrdplaent_Z(getgxTv_SdtPRODUC_Prdplaent_Z());
      struct.setMetcod_Z(getgxTv_SdtPRODUC_Metcod_Z());
      struct.setMetdsc_Z(getgxTv_SdtPRODUC_Metdsc_Z());
      struct.setPrdlotmin_Z(getgxTv_SdtPRODUC_Prdlotmin_Z());
      struct.setPrdnumuco_Z(getgxTv_SdtPRODUC_Prdnumuco_Z());
      struct.setPrdexialm_Z(getgxTv_SdtPRODUC_Prdexialm_Z());
      struct.setPrdexicc_Z(getgxTv_SdtPRODUC_Prdexicc_Z());
      struct.setPrdcanres_Z(getgxTv_SdtPRODUC_Prdcanres_Z());
      struct.setPrdcanpen_Z(getgxTv_SdtPRODUC_Prdcanpen_Z());
      struct.setPrdfulent_Z(getgxTv_SdtPRODUC_Prdfulent_Z());
      struct.setPrdfulped_Z(getgxTv_SdtPRODUC_Prdfulped_Z());
      struct.setPrdfulcc_Z(getgxTv_SdtPRODUC_Prdfulcc_Z());
      struct.setPrdexiccp_Z(getgxTv_SdtPRODUC_Prdexiccp_Z());
      struct.setPrdultecc_Z(getgxTv_SdtPRODUC_Prdultecc_Z());
      struct.setPrdultccc_Z(getgxTv_SdtPRODUC_Prdultccc_Z());
      struct.setPrdultdcc_Z(getgxTv_SdtPRODUC_Prdultdcc_Z());
      struct.setPrddifcc_Z(getgxTv_SdtPRODUC_Prddifcc_Z());
      struct.setPrdconcc_Z(getgxTv_SdtPRODUC_Prdconcc_Z());
      struct.setPrdvalstk_Z(getgxTv_SdtPRODUC_Prdvalstk_Z());
      struct.setDifvalstk_Z(getgxTv_SdtPRODUC_Difvalstk_Z());
      struct.setPrdfecent_Z(getgxTv_SdtPRODUC_Prdfecent_Z());
      struct.setPrdposx_Z(getgxTv_SdtPRODUC_Prdposx_Z());
      struct.setPrdposy_Z(getgxTv_SdtPRODUC_Prdposy_Z());
      struct.setPrdtip_Z(getgxTv_SdtPRODUC_Prdtip_Z());
      struct.setPrddqo_Z(getgxTv_SdtPRODUC_Prddqo_Z());
      struct.setPrdrev_Z(getgxTv_SdtPRODUC_Prdrev_Z());
      struct.setPrdtnq_Z(getgxTv_SdtPRODUC_Prdtnq_Z());
      struct.setPrdnom2_Z(getgxTv_SdtPRODUC_Prdnom2_Z());
      struct.setPrdnum2_Z(getgxTv_SdtPRODUC_Prdnum2_Z());
      struct.setPrdobs_Z(getgxTv_SdtPRODUC_Prdobs_Z());
      struct.setPrdumefo_Z(getgxTv_SdtPRODUC_Prdumefo_Z());
      struct.setPrdpreac2_Z(getgxTv_SdtPRODUC_Prdpreac2_Z());
      struct.setPrddenss_Z(getgxTv_SdtPRODUC_Prddenss_Z());
      struct.setPrdconcs_Z(getgxTv_SdtPRODUC_Prdconcs_Z());
      struct.setPrdsalm_Z(getgxTv_SdtPRODUC_Prdsalm_Z());
      struct.setPrdsolub_Z(getgxTv_SdtPRODUC_Prdsolub_Z());
      struct.setTipprdcod_Z(getgxTv_SdtPRODUC_Tipprdcod_Z());
      struct.setTipprddsc_Z(getgxTv_SdtPRODUC_Tipprddsc_Z());
      struct.setPrdnumcentra_Z(getgxTv_SdtPRODUC_Prdnumcentra_Z());
      struct.setPrdnumct1_Z(getgxTv_SdtPRODUC_Prdnumct1_Z());
      struct.setPrdnumct2_Z(getgxTv_SdtPRODUC_Prdnumct2_Z());
      struct.setPrdhormad_Z(getgxTv_SdtPRODUC_Prdhormad_Z());
      struct.setPrdexialmc_Z(getgxTv_SdtPRODUC_Prdexialmc_Z());
      struct.setPrdpesterm_Z(getgxTv_SdtPRODUC_Prdpesterm_Z());
      struct.setPrdsal_Z(getgxTv_SdtPRODUC_Prdsal_Z());
      struct.setSubfamcod_Z(getgxTv_SdtPRODUC_Subfamcod_Z());
      struct.setSubfamdsc_Z(getgxTv_SdtPRODUC_Subfamdsc_Z());
      struct.setPrdinc_Z(getgxTv_SdtPRODUC_Prdinc_Z());
      struct.setPrdcomp_Z(getgxTv_SdtPRODUC_Prdcomp_Z());
      struct.setPrdaox_Z(getgxTv_SdtPRODUC_Prdaox_Z());
      struct.setPrdncas_Z(getgxTv_SdtPRODUC_Prdncas_Z());
      struct.setPrdft_Z(getgxTv_SdtPRODUC_Prdft_Z());
      struct.setPrdfft_Z(getgxTv_SdtPRODUC_Prdfft_Z());
      struct.setPrdhs_Z(getgxTv_SdtPRODUC_Prdhs_Z());
      struct.setPrdfhs_Z(getgxTv_SdtPRODUC_Prdfhs_Z());
      struct.setPrdcolidx_Z(getgxTv_SdtPRODUC_Prdcolidx_Z());
      struct.setPrdokotex_Z(getgxTv_SdtPRODUC_Prdokotex_Z());
      struct.setPrdreach_Z(getgxTv_SdtPRODUC_Prdreach_Z());
      struct.setPrdlote_Z(getgxTv_SdtPRODUC_Prdlote_Z());
      struct.setPrdrtm_Z(getgxTv_SdtPRODUC_Prdrtm_Z());
      struct.setPrdctw1_Z(getgxTv_SdtPRODUC_Prdctw1_Z());
      struct.setPrdctw2_Z(getgxTv_SdtPRODUC_Prdctw2_Z());
      struct.setPrdctw3_Z(getgxTv_SdtPRODUC_Prdctw3_Z());
      struct.setPrdctw4_Z(getgxTv_SdtPRODUC_Prdctw4_Z());
      struct.setPrdnrocas_Z(getgxTv_SdtPRODUC_Prdnrocas_Z());
      struct.setPrdgots_Z(getgxTv_SdtPRODUC_Prdgots_Z());
      struct.setPrdhm_Z(getgxTv_SdtPRODUC_Prdhm_Z());
      struct.setPrdconct_Z(getgxTv_SdtPRODUC_Prdconct_Z());
      struct.setPrdeinecs_Z(getgxTv_SdtPRODUC_Prdeinecs_Z());
      struct.setPrdfuncion_Z(getgxTv_SdtPRODUC_Prdfuncion_Z());
      struct.setPrdnmqu_Z(getgxTv_SdtPRODUC_Prdnmqu_Z());
      struct.setPrdlist_Z(getgxTv_SdtPRODUC_Prdlist_Z());
      struct.setPrdfabid_Z(getgxTv_SdtPRODUC_Prdfabid_Z());
      struct.setPrdfabnm_Z(getgxTv_SdtPRODUC_Prdfabnm_Z());
      struct.setPrdloteob_Z(getgxTv_SdtPRODUC_Prdloteob_Z());
      struct.setPrdrgb_Z(getgxTv_SdtPRODUC_Prdrgb_Z());
      struct.setPrdzdhc_Z(getgxTv_SdtPRODUC_Prdzdhc_Z());
      struct.setPrdthelist_Z(getgxTv_SdtPRODUC_Prdthelist_Z());
      struct.setPrdubicacion_Z(getgxTv_SdtPRODUC_Prdubicacion_Z());
      struct.setPrdeqlp_Z(getgxTv_SdtPRODUC_Prdeqlp_Z());
      struct.setPrdpescon_Z(getgxTv_SdtPRODUC_Prdpescon_Z());
      struct.setPrdcantatm_Z(getgxTv_SdtPRODUC_Prdcantatm_Z());
      struct.setPrdgrufamid_Z(getgxTv_SdtPRODUC_Prdgrufamid_Z());
      struct.setPrdmatseca_Z(getgxTv_SdtPRODUC_Prdmatseca_Z());
      struct.setAlmprdid_Z(getgxTv_SdtPRODUC_Almprdid_Z());
      struct.setPrdlotefch_Z(getgxTv_SdtPRODUC_Prdlotefch_Z());
      struct.setPrdftdoc_Z(getgxTv_SdtPRODUC_Prdftdoc_Z());
      struct.setPrdfsdoc_Z(getgxTv_SdtPRODUC_Prdfsdoc_Z());
      struct.setPrdgrs_Z(getgxTv_SdtPRODUC_Prdgrs_Z());
      struct.setPrdcdsc_Z(getgxTv_SdtPRODUC_Prdcdsc_Z());
      struct.setPrddisponible_Z(getgxTv_SdtPRODUC_Prddisponible_Z());
      struct.setPrddiasinactivo_Z(getgxTv_SdtPRODUC_Prddiasinactivo_Z());
      struct.setPrdultmovcc_Z(getgxTv_SdtPRODUC_Prdultmovcc_Z());
      struct.setPrdfecultmov_Z(getgxTv_SdtPRODUC_Prdfecultmov_Z());
      struct.setPrdtipmovult_Z(getgxTv_SdtPRODUC_Prdtipmovult_Z());
      struct.setPrdlastlineacc_Z(getgxTv_SdtPRODUC_Prdlastlineacc_Z());
      struct.setPrdlastfechcc_Z(getgxTv_SdtPRODUC_Prdlastfechcc_Z());
      struct.setPrdlasttipmovcc_Z(getgxTv_SdtPRODUC_Prdlasttipmovcc_Z());
      struct.setPrdescompuesto_Z(getgxTv_SdtPRODUC_Prdescompuesto_Z());
      struct.setPrddiasinmov_Z(getgxTv_SdtPRODUC_Prddiasinmov_Z());
      struct.setEmprnom_N(getgxTv_SdtPRODUC_Emprnom_N());
      struct.setPrdnum_N(getgxTv_SdtPRODUC_Prdnum_N());
      struct.setPrvnom_N(getgxTv_SdtPRODUC_Prvnom_N());
      struct.setPrducpdsc_N(getgxTv_SdtPRODUC_Prducpdsc_N());
      struct.setPrducodsc_N(getgxTv_SdtPRODUC_Prducodsc_N());
      struct.setValdsc_N(getgxTv_SdtPRODUC_Valdsc_N());
      struct.setTipdtocod_N(getgxTv_SdtPRODUC_Tipdtocod_N());
      struct.setTipdtodto_N(getgxTv_SdtPRODUC_Tipdtodto_N());
      struct.setMetcod_N(getgxTv_SdtPRODUC_Metcod_N());
      struct.setMetdsc_N(getgxTv_SdtPRODUC_Metdsc_N());
      struct.setTipprdcod_N(getgxTv_SdtPRODUC_Tipprdcod_N());
      struct.setTipprddsc_N(getgxTv_SdtPRODUC_Tipprddsc_N());
      struct.setSubfamcod_N(getgxTv_SdtPRODUC_Subfamcod_N());
      struct.setSubfamdsc_N(getgxTv_SdtPRODUC_Subfamdsc_N());
      struct.setPrdfabid_N(getgxTv_SdtPRODUC_Prdfabid_N());
      struct.setPrdfabnm_N(getgxTv_SdtPRODUC_Prdfabnm_N());
      struct.setPrdthelist_N(getgxTv_SdtPRODUC_Prdthelist_N());
      struct.setPrdcantatm_N(getgxTv_SdtPRODUC_Prdcantatm_N());
      struct.setPrdgrufamid_N(getgxTv_SdtPRODUC_Prdgrufamid_N());
      struct.setPrdmatseca_N(getgxTv_SdtPRODUC_Prdmatseca_N());
      struct.setAlmprdid_N(getgxTv_SdtPRODUC_Almprdid_N());
      struct.setPrdlotefch_N(getgxTv_SdtPRODUC_Prdlotefch_N());
      struct.setPrdftdoc_N(getgxTv_SdtPRODUC_Prdftdoc_N());
      struct.setPrdfsdoc_N(getgxTv_SdtPRODUC_Prdfsdoc_N());
      struct.setPrdgrs_N(getgxTv_SdtPRODUC_Prdgrs_N());
      struct.setPrdlastlineacc_N(getgxTv_SdtPRODUC_Prdlastlineacc_N());
      return struct ;
   }

   private byte gxTv_SdtPRODUC_N ;
   private byte gxTv_SdtPRODUC_Prdunicom ;
   private byte gxTv_SdtPRODUC_Prdunicon ;
   private byte gxTv_SdtPRODUC_Valcod ;
   private byte gxTv_SdtPRODUC_Prdsit ;
   private byte gxTv_SdtPRODUC_Tipdtocod ;
   private byte gxTv_SdtPRODUC_Metcod ;
   private byte gxTv_SdtPRODUC_Prdposy ;
   private byte gxTv_SdtPRODUC_Prdtnq ;
   private byte gxTv_SdtPRODUC_Prdumefo ;
   private byte gxTv_SdtPRODUC_Prdhormad ;
   private byte gxTv_SdtPRODUC_Subfamcod ;
   private byte gxTv_SdtPRODUC_Prdpescon ;
   private byte gxTv_SdtPRODUC_Prdgrufamid ;
   private byte gxTv_SdtPRODUC_Prdunicom_Z ;
   private byte gxTv_SdtPRODUC_Prdunicon_Z ;
   private byte gxTv_SdtPRODUC_Valcod_Z ;
   private byte gxTv_SdtPRODUC_Prdsit_Z ;
   private byte gxTv_SdtPRODUC_Tipdtocod_Z ;
   private byte gxTv_SdtPRODUC_Metcod_Z ;
   private byte gxTv_SdtPRODUC_Prdposy_Z ;
   private byte gxTv_SdtPRODUC_Prdtnq_Z ;
   private byte gxTv_SdtPRODUC_Prdumefo_Z ;
   private byte gxTv_SdtPRODUC_Prdhormad_Z ;
   private byte gxTv_SdtPRODUC_Subfamcod_Z ;
   private byte gxTv_SdtPRODUC_Prdpescon_Z ;
   private byte gxTv_SdtPRODUC_Prdgrufamid_Z ;
   private byte gxTv_SdtPRODUC_Emprnom_N ;
   private byte gxTv_SdtPRODUC_Prdnum_N ;
   private byte gxTv_SdtPRODUC_Prvnom_N ;
   private byte gxTv_SdtPRODUC_Prducpdsc_N ;
   private byte gxTv_SdtPRODUC_Prducodsc_N ;
   private byte gxTv_SdtPRODUC_Valdsc_N ;
   private byte gxTv_SdtPRODUC_Tipdtocod_N ;
   private byte gxTv_SdtPRODUC_Tipdtodto_N ;
   private byte gxTv_SdtPRODUC_Metcod_N ;
   private byte gxTv_SdtPRODUC_Metdsc_N ;
   private byte gxTv_SdtPRODUC_Tipprdcod_N ;
   private byte gxTv_SdtPRODUC_Tipprddsc_N ;
   private byte gxTv_SdtPRODUC_Subfamcod_N ;
   private byte gxTv_SdtPRODUC_Subfamdsc_N ;
   private byte gxTv_SdtPRODUC_Prdfabid_N ;
   private byte gxTv_SdtPRODUC_Prdfabnm_N ;
   private byte gxTv_SdtPRODUC_Prdthelist_N ;
   private byte gxTv_SdtPRODUC_Prdcantatm_N ;
   private byte gxTv_SdtPRODUC_Prdgrufamid_N ;
   private byte gxTv_SdtPRODUC_Prdmatseca_N ;
   private byte gxTv_SdtPRODUC_Almprdid_N ;
   private byte gxTv_SdtPRODUC_Prdlotefch_N ;
   private byte gxTv_SdtPRODUC_Prdftdoc_N ;
   private byte gxTv_SdtPRODUC_Prdfsdoc_N ;
   private byte gxTv_SdtPRODUC_Prdgrs_N ;
   private byte gxTv_SdtPRODUC_Prdlastlineacc_N ;
   private short gxTv_SdtPRODUC_Prdstkmind ;
   private short gxTv_SdtPRODUC_Prddiarot ;
   private short gxTv_SdtPRODUC_Prdplaent ;
   private short gxTv_SdtPRODUC_Prdlotmin ;
   private short gxTv_SdtPRODUC_Prdultccc ;
   private short gxTv_SdtPRODUC_Prdconcc ;
   private short gxTv_SdtPRODUC_Prdposx ;
   private short gxTv_SdtPRODUC_Prddqo ;
   private short gxTv_SdtPRODUC_Tipprdcod ;
   private short gxTv_SdtPRODUC_Prdconct ;
   private short gxTv_SdtPRODUC_Prdcantatm ;
   private short gxTv_SdtPRODUC_Almprdid ;
   private short gxTv_SdtPRODUC_Prddiasinactivo ;
   private short gxTv_SdtPRODUC_Prddiasinmov ;
   private short gxTv_SdtPRODUC_Initialized ;
   private short gxTv_SdtPRODUC_Prdstkmind_Z ;
   private short gxTv_SdtPRODUC_Prddiarot_Z ;
   private short gxTv_SdtPRODUC_Prdplaent_Z ;
   private short gxTv_SdtPRODUC_Prdlotmin_Z ;
   private short gxTv_SdtPRODUC_Prdultccc_Z ;
   private short gxTv_SdtPRODUC_Prdconcc_Z ;
   private short gxTv_SdtPRODUC_Prdposx_Z ;
   private short gxTv_SdtPRODUC_Prddqo_Z ;
   private short gxTv_SdtPRODUC_Tipprdcod_Z ;
   private short gxTv_SdtPRODUC_Prdconct_Z ;
   private short gxTv_SdtPRODUC_Prdcantatm_Z ;
   private short gxTv_SdtPRODUC_Almprdid_Z ;
   private short gxTv_SdtPRODUC_Prddiasinactivo_Z ;
   private short gxTv_SdtPRODUC_Prddiasinmov_Z ;
   private short readOk ;
   private short nOutParmCount ;
   private int gxTv_SdtPRODUC_Prvnum ;
   private int gxTv_SdtPRODUC_Prdfabid ;
   private int gxTv_SdtPRODUC_Prvnum_Z ;
   private int gxTv_SdtPRODUC_Prdfabid_Z ;
   private long gxTv_SdtPRODUC_Prdrgb ;
   private long gxTv_SdtPRODUC_Prdultmovcc ;
   private long gxTv_SdtPRODUC_Prdlastlineacc ;
   private long gxTv_SdtPRODUC_Prdrgb_Z ;
   private long gxTv_SdtPRODUC_Prdultmovcc_Z ;
   private long gxTv_SdtPRODUC_Prdlastlineacc_Z ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prdfaccon ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prdrotrea ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Tipdtodto ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prdpreact ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prdpreant ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prdpremed ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prdcondia ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prdstkminu ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prdnumuco ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prdexialm ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prdexicc ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prdcanres ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prdcanpen ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prdexiccp ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prdultecc ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prdultdcc ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prddifcc ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prdvalstk ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Difvalstk ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prdpreac2 ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prddenss ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prdconcs ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prdsolub ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prdnumct1 ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prdnumct2 ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prdexialmc ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prdaox ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prdmatseca ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prddisponible ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prdfaccon_Z ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prdrotrea_Z ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Tipdtodto_Z ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prdpreact_Z ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prdpreant_Z ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prdpremed_Z ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prdcondia_Z ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prdstkminu_Z ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prdnumuco_Z ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prdexialm_Z ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prdexicc_Z ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prdcanres_Z ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prdcanpen_Z ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prdexiccp_Z ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prdultecc_Z ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prdultdcc_Z ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prddifcc_Z ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prdvalstk_Z ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Difvalstk_Z ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prdpreac2_Z ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prddenss_Z ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prdconcs_Z ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prdsolub_Z ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prdnumct1_Z ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prdnumct2_Z ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prdexialmc_Z ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prdaox_Z ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prdmatseca_Z ;
   private java.math.BigDecimal gxTv_SdtPRODUC_Prddisponible_Z ;
   private String gxTv_SdtPRODUC_Emprcod ;
   private String gxTv_SdtPRODUC_Emprnom ;
   private String gxTv_SdtPRODUC_Prdnum ;
   private String gxTv_SdtPRODUC_Prdnom ;
   private String gxTv_SdtPRODUC_Prvnom ;
   private String gxTv_SdtPRODUC_Prdrefprv ;
   private String gxTv_SdtPRODUC_Prddsctec ;
   private String gxTv_SdtPRODUC_Prducpdsc ;
   private String gxTv_SdtPRODUC_Prducodsc ;
   private String gxTv_SdtPRODUC_Valdsc ;
   private String gxTv_SdtPRODUC_Prdrec ;
   private String gxTv_SdtPRODUC_Prdcalnec ;
   private String gxTv_SdtPRODUC_Prddetpar ;
   private String gxTv_SdtPRODUC_Metdsc ;
   private String gxTv_SdtPRODUC_Prdtip ;
   private String gxTv_SdtPRODUC_Prdrev ;
   private String gxTv_SdtPRODUC_Prdnom2 ;
   private String gxTv_SdtPRODUC_Prdnum2 ;
   private String gxTv_SdtPRODUC_Prdsalm ;
   private String gxTv_SdtPRODUC_Tipprddsc ;
   private String gxTv_SdtPRODUC_Prdnumcentra ;
   private String gxTv_SdtPRODUC_Prdpesterm ;
   private String gxTv_SdtPRODUC_Prdsal ;
   private String gxTv_SdtPRODUC_Subfamdsc ;
   private String gxTv_SdtPRODUC_Prdinc ;
   private String gxTv_SdtPRODUC_Prdcomp ;
   private String gxTv_SdtPRODUC_Prdncas ;
   private String gxTv_SdtPRODUC_Prdft ;
   private String gxTv_SdtPRODUC_Prdhs ;
   private String gxTv_SdtPRODUC_Prdcolidx ;
   private String gxTv_SdtPRODUC_Prdokotex ;
   private String gxTv_SdtPRODUC_Prdreach ;
   private String gxTv_SdtPRODUC_Prdlote ;
   private String gxTv_SdtPRODUC_Prdrtm ;
   private String gxTv_SdtPRODUC_Prdctw1 ;
   private String gxTv_SdtPRODUC_Prdctw2 ;
   private String gxTv_SdtPRODUC_Prdctw3 ;
   private String gxTv_SdtPRODUC_Prdctw4 ;
   private String gxTv_SdtPRODUC_Prdnrocas ;
   private String gxTv_SdtPRODUC_Prdgots ;
   private String gxTv_SdtPRODUC_Prdhm ;
   private String gxTv_SdtPRODUC_Prdeinecs ;
   private String gxTv_SdtPRODUC_Prdfuncion ;
   private String gxTv_SdtPRODUC_Prdlist ;
   private String gxTv_SdtPRODUC_Prdfabnm ;
   private String gxTv_SdtPRODUC_Prdloteob ;
   private String gxTv_SdtPRODUC_Prdzdhc ;
   private String gxTv_SdtPRODUC_Prdthelist ;
   private String gxTv_SdtPRODUC_Prdubicacion ;
   private String gxTv_SdtPRODUC_Prdeqlp ;
   private String gxTv_SdtPRODUC_Prdgrs ;
   private String gxTv_SdtPRODUC_Prdtipmovult ;
   private String gxTv_SdtPRODUC_Prdlasttipmovcc ;
   private String gxTv_SdtPRODUC_Mode ;
   private String gxTv_SdtPRODUC_Emprcod_Z ;
   private String gxTv_SdtPRODUC_Emprnom_Z ;
   private String gxTv_SdtPRODUC_Prdnum_Z ;
   private String gxTv_SdtPRODUC_Prdnom_Z ;
   private String gxTv_SdtPRODUC_Prvnom_Z ;
   private String gxTv_SdtPRODUC_Prdrefprv_Z ;
   private String gxTv_SdtPRODUC_Prddsctec_Z ;
   private String gxTv_SdtPRODUC_Prducpdsc_Z ;
   private String gxTv_SdtPRODUC_Prducodsc_Z ;
   private String gxTv_SdtPRODUC_Valdsc_Z ;
   private String gxTv_SdtPRODUC_Prdrec_Z ;
   private String gxTv_SdtPRODUC_Prdcalnec_Z ;
   private String gxTv_SdtPRODUC_Prddetpar_Z ;
   private String gxTv_SdtPRODUC_Metdsc_Z ;
   private String gxTv_SdtPRODUC_Prdtip_Z ;
   private String gxTv_SdtPRODUC_Prdrev_Z ;
   private String gxTv_SdtPRODUC_Prdnom2_Z ;
   private String gxTv_SdtPRODUC_Prdnum2_Z ;
   private String gxTv_SdtPRODUC_Prdsalm_Z ;
   private String gxTv_SdtPRODUC_Tipprddsc_Z ;
   private String gxTv_SdtPRODUC_Prdnumcentra_Z ;
   private String gxTv_SdtPRODUC_Prdpesterm_Z ;
   private String gxTv_SdtPRODUC_Prdsal_Z ;
   private String gxTv_SdtPRODUC_Subfamdsc_Z ;
   private String gxTv_SdtPRODUC_Prdinc_Z ;
   private String gxTv_SdtPRODUC_Prdcomp_Z ;
   private String gxTv_SdtPRODUC_Prdncas_Z ;
   private String gxTv_SdtPRODUC_Prdft_Z ;
   private String gxTv_SdtPRODUC_Prdhs_Z ;
   private String gxTv_SdtPRODUC_Prdcolidx_Z ;
   private String gxTv_SdtPRODUC_Prdokotex_Z ;
   private String gxTv_SdtPRODUC_Prdreach_Z ;
   private String gxTv_SdtPRODUC_Prdlote_Z ;
   private String gxTv_SdtPRODUC_Prdrtm_Z ;
   private String gxTv_SdtPRODUC_Prdctw1_Z ;
   private String gxTv_SdtPRODUC_Prdctw2_Z ;
   private String gxTv_SdtPRODUC_Prdctw3_Z ;
   private String gxTv_SdtPRODUC_Prdctw4_Z ;
   private String gxTv_SdtPRODUC_Prdnrocas_Z ;
   private String gxTv_SdtPRODUC_Prdgots_Z ;
   private String gxTv_SdtPRODUC_Prdhm_Z ;
   private String gxTv_SdtPRODUC_Prdeinecs_Z ;
   private String gxTv_SdtPRODUC_Prdfuncion_Z ;
   private String gxTv_SdtPRODUC_Prdlist_Z ;
   private String gxTv_SdtPRODUC_Prdfabnm_Z ;
   private String gxTv_SdtPRODUC_Prdloteob_Z ;
   private String gxTv_SdtPRODUC_Prdzdhc_Z ;
   private String gxTv_SdtPRODUC_Prdthelist_Z ;
   private String gxTv_SdtPRODUC_Prdubicacion_Z ;
   private String gxTv_SdtPRODUC_Prdeqlp_Z ;
   private String gxTv_SdtPRODUC_Prdgrs_Z ;
   private String gxTv_SdtPRODUC_Prdtipmovult_Z ;
   private String gxTv_SdtPRODUC_Prdlasttipmovcc_Z ;
   private String sTagName ;
   private String sDateCnv ;
   private String sNumToPad ;
   private java.util.Date gxTv_SdtPRODUC_Prdfecpre ;
   private java.util.Date gxTv_SdtPRODUC_Prdfulent ;
   private java.util.Date gxTv_SdtPRODUC_Prdfulped ;
   private java.util.Date gxTv_SdtPRODUC_Prdfulcc ;
   private java.util.Date gxTv_SdtPRODUC_Prdfecent ;
   private java.util.Date gxTv_SdtPRODUC_Prdfft ;
   private java.util.Date gxTv_SdtPRODUC_Prdfhs ;
   private java.util.Date gxTv_SdtPRODUC_Prdlotefch ;
   private java.util.Date gxTv_SdtPRODUC_Prdfecultmov ;
   private java.util.Date gxTv_SdtPRODUC_Prdlastfechcc ;
   private java.util.Date gxTv_SdtPRODUC_Prdfecpre_Z ;
   private java.util.Date gxTv_SdtPRODUC_Prdfulent_Z ;
   private java.util.Date gxTv_SdtPRODUC_Prdfulped_Z ;
   private java.util.Date gxTv_SdtPRODUC_Prdfulcc_Z ;
   private java.util.Date gxTv_SdtPRODUC_Prdfecent_Z ;
   private java.util.Date gxTv_SdtPRODUC_Prdfft_Z ;
   private java.util.Date gxTv_SdtPRODUC_Prdfhs_Z ;
   private java.util.Date gxTv_SdtPRODUC_Prdlotefch_Z ;
   private java.util.Date gxTv_SdtPRODUC_Prdfecultmov_Z ;
   private java.util.Date gxTv_SdtPRODUC_Prdlastfechcc_Z ;
   private boolean gxTv_SdtPRODUC_Prdescompuesto ;
   private boolean gxTv_SdtPRODUC_Prdescompuesto_Z ;
   private boolean readElement ;
   private boolean formatError ;
   private String gxTv_SdtPRODUC_Prdobs ;
   private String gxTv_SdtPRODUC_Prdnmqu ;
   private String gxTv_SdtPRODUC_Prdftdoc ;
   private String gxTv_SdtPRODUC_Prdfsdoc ;
   private String gxTv_SdtPRODUC_Prdcdsc ;
   private String gxTv_SdtPRODUC_Prdobs_Z ;
   private String gxTv_SdtPRODUC_Prdnmqu_Z ;
   private String gxTv_SdtPRODUC_Prdftdoc_Z ;
   private String gxTv_SdtPRODUC_Prdfsdoc_Z ;
   private String gxTv_SdtPRODUC_Prdcdsc_Z ;
}

