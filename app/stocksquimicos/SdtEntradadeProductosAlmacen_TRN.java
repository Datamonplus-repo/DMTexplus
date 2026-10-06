package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtEntradadeProductosAlmacen_TRN extends GxSilentTrnSdt
{
   public SdtEntradadeProductosAlmacen_TRN( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtEntradadeProductosAlmacen_TRN.class));
   }

   public SdtEntradadeProductosAlmacen_TRN( int remoteHandle ,
                                            ModelContext context )
   {
      super( remoteHandle, context, "SdtEntradadeProductosAlmacen_TRN");
      initialize( remoteHandle) ;
   }

   public SdtEntradadeProductosAlmacen_TRN( int remoteHandle ,
                                            StructSdtEntradadeProductosAlmacen_TRN struct )
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
                     String AV719PrdNum ,
                     short AV597LinEnt )
   {
      IGxSilentTrn obj;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {AV396EmprCod,AV719PrdNum,Short.valueOf(AV597LinEnt)});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"EmprCod", String.class}, new Object[]{"PrdNum", String.class}, new Object[]{"LinEnt", short.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "StocksQuimicos\\EntradadeProductosAlmacen_TRN");
      metadata.set("BT", "TXPENTALM");
      metadata.set("PK", "[ \"PrdNum\",\"LinEnt\" ]");
      metadata.set("FKList", "[ { \"FK\":[ \"EmprCod\",\"PedCod\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"PedCod\",\"PrdNum\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"PrdNum\" ],\"FKMap\":[  ] } ]");
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
               gxTv_SdtEntradadeProductosAlmacen_TRN_Emprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdNum") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Prdnum = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "LinEnt") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Linent = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntFecEnt") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Albaran") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Albaran = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntNAlbar") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Entnalbar = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PedCod") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntPrvNum") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntUniEnt") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Entunient = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntPre") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Entpre = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntUniRem") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Entunirem = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntLotN") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Entlotn = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntFVal") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtEntradadeProductosAlmacen_TRN_Entfval = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtEntradadeProductosAlmacen_TRN_Entfval = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntObs") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Entobs = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntNumCon") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Entnumcon = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntEti") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Enteti = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntCon") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Entcon = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntConIni") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Entconini = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntConFin") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Entconfin = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntNro") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Entnro = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntUniAlb") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Entunialb = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntPedCum") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Entpedcum = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntBnc") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Entbnc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PedFec") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PedNumLin") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Pednumlin = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PedPri") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Pedpri = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PedSit") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Pedsit = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PedCum") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcum = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PedFulEnt") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PedCanEnt") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcanent = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PedUni") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Peduni = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PedPre") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Pedpre = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CantPdte") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Cantpdte = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntCC") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Entcc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntCCoCod") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Entccocod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntRemNro") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Entremnro = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntRemFch") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntRemSuc") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Entremsuc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntRemTpo") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Entremtpo = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntFabId") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Entfabid = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntLoteID") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Entloteid = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntUbicacion") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Entubicacion = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrvNum") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Prvnum = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdExiAlm") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Prdexialm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdCanPen") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Prdcanpen = DecimalUtil.stringToDec( oReader.getValue()) ;
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
                  gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
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
                  gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
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
               gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreant = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdPreAct") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreact = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdValStk") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Prdvalstk = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PedDto") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Peddto = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdExiCC") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Prdexicc = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdDetPar") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Prddetpar = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdNom") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Prdnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdRec") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Prdrec = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ValCod") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Valcod = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdPreMed") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpremed = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntNEmb") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Entnemb = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprCod_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Emprcod_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdNum_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Prdnum_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "LinEnt_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Linent_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntFecEnt_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent_Z = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent_Z = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Albaran_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Albaran_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntNAlbar_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Entnalbar_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PedCod_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntPrvNum_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntUniEnt_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Entunient_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntPre_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Entpre_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntUniRem_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Entunirem_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntLotN_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Entlotn_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntFVal_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtEntradadeProductosAlmacen_TRN_Entfval_Z = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtEntradadeProductosAlmacen_TRN_Entfval_Z = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntObs_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Entobs_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntNumCon_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Entnumcon_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntEti_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Enteti_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntCon_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Entcon_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntConIni_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Entconini_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntConFin_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Entconfin_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntNro_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Entnro_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntUniAlb_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Entunialb_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntPedCum_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Entpedcum_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntBnc_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Entbnc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PedFec_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec_Z = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec_Z = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PedNumLin_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Pednumlin_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PedPri_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Pedpri_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PedSit_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Pedsit_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PedCum_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcum_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PedFulEnt_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent_Z = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent_Z = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PedCanEnt_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcanent_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PedUni_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Peduni_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PedPre_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Pedpre_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CantPdte_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Cantpdte_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntCC_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Entcc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntCCoCod_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Entccocod_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntRemNro_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Entremnro_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntRemFch_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch_Z = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch_Z = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntRemSuc_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Entremsuc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntRemTpo_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Entremtpo_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntFabId_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Entfabid_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntLoteID_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Entloteid_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntUbicacion_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Entubicacion_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrvNum_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Prvnum_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdExiAlm_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Prdexialm_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdCanPen_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Prdcanpen_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
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
                  gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent_Z = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent_Z = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
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
                  gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre_Z = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre_Z = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
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
               gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreant_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdPreAct_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreact_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdValStk_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Prdvalstk_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PedDto_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Peddto_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdExiCC_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Prdexicc_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdDetPar_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Prddetpar_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdNom_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Prdnom_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdRec_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Prdrec_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ValCod_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Valcod_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdPreMed_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpremed_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntNEmb_Z") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Entnemb_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PedCod_N") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EntPrvNum_N") )
            {
               gxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum_N = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "EntradadeProductosAlmacen_TRN" ;
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
      oWriter.writeElement("EmprCod", gxTv_SdtEntradadeProductosAlmacen_TRN_Emprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdNum", gxTv_SdtEntradadeProductosAlmacen_TRN_Prdnum);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("LinEnt", GXutil.trim( GXutil.str( gxTv_SdtEntradadeProductosAlmacen_TRN_Linent, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("EntFecEnt", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Albaran", gxTv_SdtEntradadeProductosAlmacen_TRN_Albaran);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EntNAlbar", gxTv_SdtEntradadeProductosAlmacen_TRN_Entnalbar);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PedCod", GXutil.trim( GXutil.str( gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EntPrvNum", GXutil.trim( GXutil.str( gxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EntUniEnt", GXutil.trim( GXutil.strNoRound( gxTv_SdtEntradadeProductosAlmacen_TRN_Entunient, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EntPre", GXutil.trim( GXutil.strNoRound( gxTv_SdtEntradadeProductosAlmacen_TRN_Entpre, 14, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EntUniRem", GXutil.trim( GXutil.strNoRound( gxTv_SdtEntradadeProductosAlmacen_TRN_Entunirem, 11, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EntLotN", gxTv_SdtEntradadeProductosAlmacen_TRN_Entlotn);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtEntradadeProductosAlmacen_TRN_Entfval), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtEntradadeProductosAlmacen_TRN_Entfval), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtEntradadeProductosAlmacen_TRN_Entfval), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("EntFVal", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EntObs", gxTv_SdtEntradadeProductosAlmacen_TRN_Entobs);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EntNumCon", GXutil.trim( GXutil.str( gxTv_SdtEntradadeProductosAlmacen_TRN_Entnumcon, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EntEti", GXutil.trim( GXutil.str( gxTv_SdtEntradadeProductosAlmacen_TRN_Enteti, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EntCon", GXutil.trim( GXutil.str( gxTv_SdtEntradadeProductosAlmacen_TRN_Entcon, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EntConIni", GXutil.trim( GXutil.str( gxTv_SdtEntradadeProductosAlmacen_TRN_Entconini, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EntConFin", GXutil.trim( GXutil.str( gxTv_SdtEntradadeProductosAlmacen_TRN_Entconfin, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EntNro", GXutil.trim( GXutil.str( gxTv_SdtEntradadeProductosAlmacen_TRN_Entnro, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EntUniAlb", GXutil.trim( GXutil.strNoRound( gxTv_SdtEntradadeProductosAlmacen_TRN_Entunialb, 11, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EntPedCum", gxTv_SdtEntradadeProductosAlmacen_TRN_Entpedcum);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EntBnc", gxTv_SdtEntradadeProductosAlmacen_TRN_Entbnc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("PedFec", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PedNumLin", GXutil.trim( GXutil.str( gxTv_SdtEntradadeProductosAlmacen_TRN_Pednumlin, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PedPri", gxTv_SdtEntradadeProductosAlmacen_TRN_Pedpri);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PedSit", gxTv_SdtEntradadeProductosAlmacen_TRN_Pedsit);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PedCum", gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcum);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("PedFulEnt", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PedCanEnt", GXutil.trim( GXutil.strNoRound( gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcanent, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PedUni", GXutil.trim( GXutil.strNoRound( gxTv_SdtEntradadeProductosAlmacen_TRN_Peduni, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PedPre", GXutil.trim( GXutil.strNoRound( gxTv_SdtEntradadeProductosAlmacen_TRN_Pedpre, 14, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CantPdte", GXutil.trim( GXutil.strNoRound( gxTv_SdtEntradadeProductosAlmacen_TRN_Cantpdte, 12, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EntCC", gxTv_SdtEntradadeProductosAlmacen_TRN_Entcc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EntCCoCod", GXutil.trim( GXutil.str( gxTv_SdtEntradadeProductosAlmacen_TRN_Entccocod, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EntRemNro", gxTv_SdtEntradadeProductosAlmacen_TRN_Entremnro);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("EntRemFch", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EntRemSuc", gxTv_SdtEntradadeProductosAlmacen_TRN_Entremsuc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EntRemTpo", gxTv_SdtEntradadeProductosAlmacen_TRN_Entremtpo);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EntFabId", GXutil.trim( GXutil.str( gxTv_SdtEntradadeProductosAlmacen_TRN_Entfabid, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EntLoteID", GXutil.trim( GXutil.str( gxTv_SdtEntradadeProductosAlmacen_TRN_Entloteid, 12, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EntUbicacion", gxTv_SdtEntradadeProductosAlmacen_TRN_Entubicacion);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrvNum", GXutil.trim( GXutil.str( gxTv_SdtEntradadeProductosAlmacen_TRN_Prvnum, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdExiAlm", GXutil.trim( GXutil.strNoRound( gxTv_SdtEntradadeProductosAlmacen_TRN_Prdexialm, 12, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdCanPen", GXutil.trim( GXutil.strNoRound( gxTv_SdtEntradadeProductosAlmacen_TRN_Prdcanpen, 12, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("PrdFulEnt", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("PrdFecPre", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdPreAnt", GXutil.trim( GXutil.strNoRound( gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreant, 14, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdPreAct", GXutil.trim( GXutil.strNoRound( gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreact, 14, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdValStk", GXutil.trim( GXutil.strNoRound( gxTv_SdtEntradadeProductosAlmacen_TRN_Prdvalstk, 11, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PedDto", GXutil.trim( GXutil.strNoRound( gxTv_SdtEntradadeProductosAlmacen_TRN_Peddto, 5, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdExiCC", GXutil.trim( GXutil.strNoRound( gxTv_SdtEntradadeProductosAlmacen_TRN_Prdexicc, 12, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdDetPar", gxTv_SdtEntradadeProductosAlmacen_TRN_Prddetpar);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdNom", gxTv_SdtEntradadeProductosAlmacen_TRN_Prdnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdRec", gxTv_SdtEntradadeProductosAlmacen_TRN_Prdrec);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ValCod", GXutil.trim( GXutil.str( gxTv_SdtEntradadeProductosAlmacen_TRN_Valcod, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdPreMed", GXutil.trim( GXutil.strNoRound( gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpremed, 14, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EntNEmb", GXutil.trim( GXutil.str( gxTv_SdtEntradadeProductosAlmacen_TRN_Entnemb, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", gxTv_SdtEntradadeProductosAlmacen_TRN_Mode);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtEntradadeProductosAlmacen_TRN_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprCod_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Emprcod_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdNum_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Prdnum_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("LinEnt_Z", GXutil.trim( GXutil.str( gxTv_SdtEntradadeProductosAlmacen_TRN_Linent_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("EntFecEnt_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Albaran_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Albaran_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EntNAlbar_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Entnalbar_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PedCod_Z", GXutil.trim( GXutil.str( gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod_Z, 8, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EntPrvNum_Z", GXutil.trim( GXutil.str( gxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum_Z, 6, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EntUniEnt_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtEntradadeProductosAlmacen_TRN_Entunient_Z, 9, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EntPre_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtEntradadeProductosAlmacen_TRN_Entpre_Z, 14, 5)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EntUniRem_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtEntradadeProductosAlmacen_TRN_Entunirem_Z, 11, 4)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EntLotN_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Entlotn_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtEntradadeProductosAlmacen_TRN_Entfval_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtEntradadeProductosAlmacen_TRN_Entfval_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtEntradadeProductosAlmacen_TRN_Entfval_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("EntFVal_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EntObs_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Entobs_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EntNumCon_Z", GXutil.trim( GXutil.str( gxTv_SdtEntradadeProductosAlmacen_TRN_Entnumcon_Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EntEti_Z", GXutil.trim( GXutil.str( gxTv_SdtEntradadeProductosAlmacen_TRN_Enteti_Z, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EntCon_Z", GXutil.trim( GXutil.str( gxTv_SdtEntradadeProductosAlmacen_TRN_Entcon_Z, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EntConIni_Z", GXutil.trim( GXutil.str( gxTv_SdtEntradadeProductosAlmacen_TRN_Entconini_Z, 8, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EntConFin_Z", GXutil.trim( GXutil.str( gxTv_SdtEntradadeProductosAlmacen_TRN_Entconfin_Z, 8, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EntNro_Z", GXutil.trim( GXutil.str( gxTv_SdtEntradadeProductosAlmacen_TRN_Entnro_Z, 6, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EntUniAlb_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtEntradadeProductosAlmacen_TRN_Entunialb_Z, 11, 4)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EntPedCum_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Entpedcum_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EntBnc_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Entbnc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("PedFec_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PedNumLin_Z", GXutil.trim( GXutil.str( gxTv_SdtEntradadeProductosAlmacen_TRN_Pednumlin_Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PedPri_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Pedpri_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PedSit_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Pedsit_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PedCum_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcum_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("PedFulEnt_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PedCanEnt_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcanent_Z, 9, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PedUni_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtEntradadeProductosAlmacen_TRN_Peduni_Z, 9, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PedPre_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtEntradadeProductosAlmacen_TRN_Pedpre_Z, 14, 5)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CantPdte_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtEntradadeProductosAlmacen_TRN_Cantpdte_Z, 12, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EntCC_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Entcc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EntCCoCod_Z", GXutil.trim( GXutil.str( gxTv_SdtEntradadeProductosAlmacen_TRN_Entccocod_Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EntRemNro_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Entremnro_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("EntRemFch_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EntRemSuc_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Entremsuc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EntRemTpo_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Entremtpo_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EntFabId_Z", GXutil.trim( GXutil.str( gxTv_SdtEntradadeProductosAlmacen_TRN_Entfabid_Z, 6, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EntLoteID_Z", GXutil.trim( GXutil.str( gxTv_SdtEntradadeProductosAlmacen_TRN_Entloteid_Z, 12, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EntUbicacion_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Entubicacion_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrvNum_Z", GXutil.trim( GXutil.str( gxTv_SdtEntradadeProductosAlmacen_TRN_Prvnum_Z, 6, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdExiAlm_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtEntradadeProductosAlmacen_TRN_Prdexialm_Z, 12, 4)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdCanPen_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtEntradadeProductosAlmacen_TRN_Prdcanpen_Z, 12, 4)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("PrdFulEnt_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("PrdFecPre_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdPreAnt_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreant_Z, 14, 5)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdPreAct_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreact_Z, 14, 5)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdValStk_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtEntradadeProductosAlmacen_TRN_Prdvalstk_Z, 11, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PedDto_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtEntradadeProductosAlmacen_TRN_Peddto_Z, 5, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdExiCC_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtEntradadeProductosAlmacen_TRN_Prdexicc_Z, 12, 4)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdDetPar_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Prddetpar_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdNom_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Prdnom_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdRec_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Prdrec_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ValCod_Z", GXutil.trim( GXutil.str( gxTv_SdtEntradadeProductosAlmacen_TRN_Valcod_Z, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrdPreMed_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpremed_Z, 14, 5)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EntNEmb_Z", GXutil.trim( GXutil.str( gxTv_SdtEntradadeProductosAlmacen_TRN_Entnemb_Z, 2, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PedCod_N", GXutil.trim( GXutil.str( gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EntPrvNum_N", GXutil.trim( GXutil.str( gxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum_N, 1, 0)));
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
      AddObjectProperty("EmprCod", gxTv_SdtEntradadeProductosAlmacen_TRN_Emprcod, false, includeNonInitialized);
      AddObjectProperty("PrdNum", gxTv_SdtEntradadeProductosAlmacen_TRN_Prdnum, false, includeNonInitialized);
      AddObjectProperty("LinEnt", gxTv_SdtEntradadeProductosAlmacen_TRN_Linent, false, includeNonInitialized);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("EntFecEnt", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("Albaran", gxTv_SdtEntradadeProductosAlmacen_TRN_Albaran, false, includeNonInitialized);
      AddObjectProperty("EntNAlbar", gxTv_SdtEntradadeProductosAlmacen_TRN_Entnalbar, false, includeNonInitialized);
      AddObjectProperty("PedCod", gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod, false, includeNonInitialized);
      AddObjectProperty("PedCod_N", gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod_N, false, includeNonInitialized);
      AddObjectProperty("EntPrvNum", gxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum, false, includeNonInitialized);
      AddObjectProperty("EntPrvNum_N", gxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum_N, false, includeNonInitialized);
      AddObjectProperty("EntUniEnt", gxTv_SdtEntradadeProductosAlmacen_TRN_Entunient, false, includeNonInitialized);
      AddObjectProperty("EntPre", gxTv_SdtEntradadeProductosAlmacen_TRN_Entpre, false, includeNonInitialized);
      AddObjectProperty("EntUniRem", gxTv_SdtEntradadeProductosAlmacen_TRN_Entunirem, false, includeNonInitialized);
      AddObjectProperty("EntLotN", gxTv_SdtEntradadeProductosAlmacen_TRN_Entlotn, false, includeNonInitialized);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtEntradadeProductosAlmacen_TRN_Entfval), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtEntradadeProductosAlmacen_TRN_Entfval), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtEntradadeProductosAlmacen_TRN_Entfval), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("EntFVal", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("EntObs", gxTv_SdtEntradadeProductosAlmacen_TRN_Entobs, false, includeNonInitialized);
      AddObjectProperty("EntNumCon", gxTv_SdtEntradadeProductosAlmacen_TRN_Entnumcon, false, includeNonInitialized);
      AddObjectProperty("EntEti", gxTv_SdtEntradadeProductosAlmacen_TRN_Enteti, false, includeNonInitialized);
      AddObjectProperty("EntCon", gxTv_SdtEntradadeProductosAlmacen_TRN_Entcon, false, includeNonInitialized);
      AddObjectProperty("EntConIni", gxTv_SdtEntradadeProductosAlmacen_TRN_Entconini, false, includeNonInitialized);
      AddObjectProperty("EntConFin", gxTv_SdtEntradadeProductosAlmacen_TRN_Entconfin, false, includeNonInitialized);
      AddObjectProperty("EntNro", gxTv_SdtEntradadeProductosAlmacen_TRN_Entnro, false, includeNonInitialized);
      AddObjectProperty("EntUniAlb", gxTv_SdtEntradadeProductosAlmacen_TRN_Entunialb, false, includeNonInitialized);
      AddObjectProperty("EntPedCum", gxTv_SdtEntradadeProductosAlmacen_TRN_Entpedcum, false, includeNonInitialized);
      AddObjectProperty("EntBnc", gxTv_SdtEntradadeProductosAlmacen_TRN_Entbnc, false, includeNonInitialized);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("PedFec", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("PedNumLin", gxTv_SdtEntradadeProductosAlmacen_TRN_Pednumlin, false, includeNonInitialized);
      AddObjectProperty("PedPri", gxTv_SdtEntradadeProductosAlmacen_TRN_Pedpri, false, includeNonInitialized);
      AddObjectProperty("PedSit", gxTv_SdtEntradadeProductosAlmacen_TRN_Pedsit, false, includeNonInitialized);
      AddObjectProperty("PedCum", gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcum, false, includeNonInitialized);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("PedFulEnt", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("PedCanEnt", gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcanent, false, includeNonInitialized);
      AddObjectProperty("PedUni", gxTv_SdtEntradadeProductosAlmacen_TRN_Peduni, false, includeNonInitialized);
      AddObjectProperty("PedPre", gxTv_SdtEntradadeProductosAlmacen_TRN_Pedpre, false, includeNonInitialized);
      AddObjectProperty("CantPdte", gxTv_SdtEntradadeProductosAlmacen_TRN_Cantpdte, false, includeNonInitialized);
      AddObjectProperty("EntCC", gxTv_SdtEntradadeProductosAlmacen_TRN_Entcc, false, includeNonInitialized);
      AddObjectProperty("EntCCoCod", gxTv_SdtEntradadeProductosAlmacen_TRN_Entccocod, false, includeNonInitialized);
      AddObjectProperty("EntRemNro", gxTv_SdtEntradadeProductosAlmacen_TRN_Entremnro, false, includeNonInitialized);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("EntRemFch", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("EntRemSuc", gxTv_SdtEntradadeProductosAlmacen_TRN_Entremsuc, false, includeNonInitialized);
      AddObjectProperty("EntRemTpo", gxTv_SdtEntradadeProductosAlmacen_TRN_Entremtpo, false, includeNonInitialized);
      AddObjectProperty("EntFabId", gxTv_SdtEntradadeProductosAlmacen_TRN_Entfabid, false, includeNonInitialized);
      AddObjectProperty("EntLoteID", gxTv_SdtEntradadeProductosAlmacen_TRN_Entloteid, false, includeNonInitialized);
      AddObjectProperty("EntUbicacion", gxTv_SdtEntradadeProductosAlmacen_TRN_Entubicacion, false, includeNonInitialized);
      AddObjectProperty("PrvNum", gxTv_SdtEntradadeProductosAlmacen_TRN_Prvnum, false, includeNonInitialized);
      AddObjectProperty("PrdExiAlm", gxTv_SdtEntradadeProductosAlmacen_TRN_Prdexialm, false, includeNonInitialized);
      AddObjectProperty("PrdCanPen", gxTv_SdtEntradadeProductosAlmacen_TRN_Prdcanpen, false, includeNonInitialized);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("PrdFulEnt", sDateCnv, false, includeNonInitialized);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("PrdFecPre", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("PrdPreAnt", gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreant, false, includeNonInitialized);
      AddObjectProperty("PrdPreAct", gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreact, false, includeNonInitialized);
      AddObjectProperty("PrdValStk", gxTv_SdtEntradadeProductosAlmacen_TRN_Prdvalstk, false, includeNonInitialized);
      AddObjectProperty("PedDto", gxTv_SdtEntradadeProductosAlmacen_TRN_Peddto, false, includeNonInitialized);
      AddObjectProperty("PrdExiCC", gxTv_SdtEntradadeProductosAlmacen_TRN_Prdexicc, false, includeNonInitialized);
      AddObjectProperty("PrdDetPar", gxTv_SdtEntradadeProductosAlmacen_TRN_Prddetpar, false, includeNonInitialized);
      AddObjectProperty("PrdNom", gxTv_SdtEntradadeProductosAlmacen_TRN_Prdnom, false, includeNonInitialized);
      AddObjectProperty("PrdRec", gxTv_SdtEntradadeProductosAlmacen_TRN_Prdrec, false, includeNonInitialized);
      AddObjectProperty("ValCod", gxTv_SdtEntradadeProductosAlmacen_TRN_Valcod, false, includeNonInitialized);
      AddObjectProperty("PrdPreMed", gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpremed, false, includeNonInitialized);
      AddObjectProperty("EntNEmb", gxTv_SdtEntradadeProductosAlmacen_TRN_Entnemb, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtEntradadeProductosAlmacen_TRN_Mode, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_SdtEntradadeProductosAlmacen_TRN_Initialized, false, includeNonInitialized);
         AddObjectProperty("EmprCod_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Emprcod_Z, false, includeNonInitialized);
         AddObjectProperty("PrdNum_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Prdnum_Z, false, includeNonInitialized);
         AddObjectProperty("LinEnt_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Linent_Z, false, includeNonInitialized);
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("EntFecEnt_Z", sDateCnv, false, includeNonInitialized);
         AddObjectProperty("Albaran_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Albaran_Z, false, includeNonInitialized);
         AddObjectProperty("EntNAlbar_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Entnalbar_Z, false, includeNonInitialized);
         AddObjectProperty("PedCod_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod_Z, false, includeNonInitialized);
         AddObjectProperty("EntPrvNum_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum_Z, false, includeNonInitialized);
         AddObjectProperty("EntUniEnt_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Entunient_Z, false, includeNonInitialized);
         AddObjectProperty("EntPre_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Entpre_Z, false, includeNonInitialized);
         AddObjectProperty("EntUniRem_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Entunirem_Z, false, includeNonInitialized);
         AddObjectProperty("EntLotN_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Entlotn_Z, false, includeNonInitialized);
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtEntradadeProductosAlmacen_TRN_Entfval_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtEntradadeProductosAlmacen_TRN_Entfval_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtEntradadeProductosAlmacen_TRN_Entfval_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("EntFVal_Z", sDateCnv, false, includeNonInitialized);
         AddObjectProperty("EntObs_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Entobs_Z, false, includeNonInitialized);
         AddObjectProperty("EntNumCon_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Entnumcon_Z, false, includeNonInitialized);
         AddObjectProperty("EntEti_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Enteti_Z, false, includeNonInitialized);
         AddObjectProperty("EntCon_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Entcon_Z, false, includeNonInitialized);
         AddObjectProperty("EntConIni_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Entconini_Z, false, includeNonInitialized);
         AddObjectProperty("EntConFin_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Entconfin_Z, false, includeNonInitialized);
         AddObjectProperty("EntNro_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Entnro_Z, false, includeNonInitialized);
         AddObjectProperty("EntUniAlb_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Entunialb_Z, false, includeNonInitialized);
         AddObjectProperty("EntPedCum_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Entpedcum_Z, false, includeNonInitialized);
         AddObjectProperty("EntBnc_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Entbnc_Z, false, includeNonInitialized);
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("PedFec_Z", sDateCnv, false, includeNonInitialized);
         AddObjectProperty("PedNumLin_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Pednumlin_Z, false, includeNonInitialized);
         AddObjectProperty("PedPri_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Pedpri_Z, false, includeNonInitialized);
         AddObjectProperty("PedSit_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Pedsit_Z, false, includeNonInitialized);
         AddObjectProperty("PedCum_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcum_Z, false, includeNonInitialized);
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("PedFulEnt_Z", sDateCnv, false, includeNonInitialized);
         AddObjectProperty("PedCanEnt_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcanent_Z, false, includeNonInitialized);
         AddObjectProperty("PedUni_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Peduni_Z, false, includeNonInitialized);
         AddObjectProperty("PedPre_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Pedpre_Z, false, includeNonInitialized);
         AddObjectProperty("CantPdte_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Cantpdte_Z, false, includeNonInitialized);
         AddObjectProperty("EntCC_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Entcc_Z, false, includeNonInitialized);
         AddObjectProperty("EntCCoCod_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Entccocod_Z, false, includeNonInitialized);
         AddObjectProperty("EntRemNro_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Entremnro_Z, false, includeNonInitialized);
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("EntRemFch_Z", sDateCnv, false, includeNonInitialized);
         AddObjectProperty("EntRemSuc_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Entremsuc_Z, false, includeNonInitialized);
         AddObjectProperty("EntRemTpo_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Entremtpo_Z, false, includeNonInitialized);
         AddObjectProperty("EntFabId_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Entfabid_Z, false, includeNonInitialized);
         AddObjectProperty("EntLoteID_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Entloteid_Z, false, includeNonInitialized);
         AddObjectProperty("EntUbicacion_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Entubicacion_Z, false, includeNonInitialized);
         AddObjectProperty("PrvNum_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Prvnum_Z, false, includeNonInitialized);
         AddObjectProperty("PrdExiAlm_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Prdexialm_Z, false, includeNonInitialized);
         AddObjectProperty("PrdCanPen_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Prdcanpen_Z, false, includeNonInitialized);
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("PrdFulEnt_Z", sDateCnv, false, includeNonInitialized);
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("PrdFecPre_Z", sDateCnv, false, includeNonInitialized);
         AddObjectProperty("PrdPreAnt_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreant_Z, false, includeNonInitialized);
         AddObjectProperty("PrdPreAct_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreact_Z, false, includeNonInitialized);
         AddObjectProperty("PrdValStk_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Prdvalstk_Z, false, includeNonInitialized);
         AddObjectProperty("PedDto_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Peddto_Z, false, includeNonInitialized);
         AddObjectProperty("PrdExiCC_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Prdexicc_Z, false, includeNonInitialized);
         AddObjectProperty("PrdDetPar_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Prddetpar_Z, false, includeNonInitialized);
         AddObjectProperty("PrdNom_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Prdnom_Z, false, includeNonInitialized);
         AddObjectProperty("PrdRec_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Prdrec_Z, false, includeNonInitialized);
         AddObjectProperty("ValCod_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Valcod_Z, false, includeNonInitialized);
         AddObjectProperty("PrdPreMed_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpremed_Z, false, includeNonInitialized);
         AddObjectProperty("EntNEmb_Z", gxTv_SdtEntradadeProductosAlmacen_TRN_Entnemb_Z, false, includeNonInitialized);
         AddObjectProperty("PedCod_N", gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod_N, false, includeNonInitialized);
         AddObjectProperty("EntPrvNum_N", gxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum_N, false, includeNonInitialized);
      }
   }

   public void updateDirties( app.stocksquimicos.SdtEntradadeProductosAlmacen_TRN sdt )
   {
      if ( sdt.IsDirty("EmprCod") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Emprcod = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Emprcod() ;
      }
      if ( sdt.IsDirty("PrdNum") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Prdnum = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdnum() ;
      }
      if ( sdt.IsDirty("LinEnt") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Linent = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Linent() ;
      }
      if ( sdt.IsDirty("EntFecEnt") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent() ;
      }
      if ( sdt.IsDirty("Albaran") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Albaran = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Albaran() ;
      }
      if ( sdt.IsDirty("EntNAlbar") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Entnalbar = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entnalbar() ;
      }
      if ( sdt.IsDirty("PedCod") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod_N = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod_N() ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod() ;
      }
      if ( sdt.IsDirty("EntPrvNum") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum_N = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum_N() ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum() ;
      }
      if ( sdt.IsDirty("EntUniEnt") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Entunient = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entunient() ;
      }
      if ( sdt.IsDirty("EntPre") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Entpre = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entpre() ;
      }
      if ( sdt.IsDirty("EntUniRem") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Entunirem = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entunirem() ;
      }
      if ( sdt.IsDirty("EntLotN") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Entlotn = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entlotn() ;
      }
      if ( sdt.IsDirty("EntFVal") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Entfval = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entfval() ;
      }
      if ( sdt.IsDirty("EntObs") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Entobs = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entobs() ;
      }
      if ( sdt.IsDirty("EntNumCon") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Entnumcon = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entnumcon() ;
      }
      if ( sdt.IsDirty("EntEti") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Enteti = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Enteti() ;
      }
      if ( sdt.IsDirty("EntCon") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Entcon = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entcon() ;
      }
      if ( sdt.IsDirty("EntConIni") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Entconini = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entconini() ;
      }
      if ( sdt.IsDirty("EntConFin") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Entconfin = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entconfin() ;
      }
      if ( sdt.IsDirty("EntNro") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Entnro = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entnro() ;
      }
      if ( sdt.IsDirty("EntUniAlb") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Entunialb = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entunialb() ;
      }
      if ( sdt.IsDirty("EntPedCum") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Entpedcum = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entpedcum() ;
      }
      if ( sdt.IsDirty("EntBnc") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Entbnc = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entbnc() ;
      }
      if ( sdt.IsDirty("PedFec") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec() ;
      }
      if ( sdt.IsDirty("PedNumLin") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Pednumlin = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Pednumlin() ;
      }
      if ( sdt.IsDirty("PedPri") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Pedpri = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedpri() ;
      }
      if ( sdt.IsDirty("PedSit") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Pedsit = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedsit() ;
      }
      if ( sdt.IsDirty("PedCum") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcum = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcum() ;
      }
      if ( sdt.IsDirty("PedFulEnt") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent() ;
      }
      if ( sdt.IsDirty("PedCanEnt") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcanent = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcanent() ;
      }
      if ( sdt.IsDirty("PedUni") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Peduni = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Peduni() ;
      }
      if ( sdt.IsDirty("PedPre") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Pedpre = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedpre() ;
      }
      if ( sdt.IsDirty("CantPdte") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Cantpdte = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Cantpdte() ;
      }
      if ( sdt.IsDirty("EntCC") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Entcc = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entcc() ;
      }
      if ( sdt.IsDirty("EntCCoCod") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Entccocod = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entccocod() ;
      }
      if ( sdt.IsDirty("EntRemNro") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Entremnro = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entremnro() ;
      }
      if ( sdt.IsDirty("EntRemFch") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch() ;
      }
      if ( sdt.IsDirty("EntRemSuc") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Entremsuc = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entremsuc() ;
      }
      if ( sdt.IsDirty("EntRemTpo") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Entremtpo = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entremtpo() ;
      }
      if ( sdt.IsDirty("EntFabId") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Entfabid = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entfabid() ;
      }
      if ( sdt.IsDirty("EntLoteID") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Entloteid = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entloteid() ;
      }
      if ( sdt.IsDirty("EntUbicacion") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Entubicacion = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entubicacion() ;
      }
      if ( sdt.IsDirty("PrvNum") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Prvnum = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Prvnum() ;
      }
      if ( sdt.IsDirty("PrdExiAlm") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Prdexialm = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdexialm() ;
      }
      if ( sdt.IsDirty("PrdCanPen") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Prdcanpen = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdcanpen() ;
      }
      if ( sdt.IsDirty("PrdFulEnt") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent() ;
      }
      if ( sdt.IsDirty("PrdFecPre") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre() ;
      }
      if ( sdt.IsDirty("PrdPreAnt") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreant = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreant() ;
      }
      if ( sdt.IsDirty("PrdPreAct") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreact = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreact() ;
      }
      if ( sdt.IsDirty("PrdValStk") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Prdvalstk = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdvalstk() ;
      }
      if ( sdt.IsDirty("PedDto") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Peddto = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Peddto() ;
      }
      if ( sdt.IsDirty("PrdExiCC") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Prdexicc = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdexicc() ;
      }
      if ( sdt.IsDirty("PrdDetPar") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Prddetpar = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Prddetpar() ;
      }
      if ( sdt.IsDirty("PrdNom") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Prdnom = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdnom() ;
      }
      if ( sdt.IsDirty("PrdRec") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Prdrec = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdrec() ;
      }
      if ( sdt.IsDirty("ValCod") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Valcod = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Valcod() ;
      }
      if ( sdt.IsDirty("PrdPreMed") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpremed = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpremed() ;
      }
      if ( sdt.IsDirty("EntNEmb") )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
         gxTv_SdtEntradadeProductosAlmacen_TRN_Entnemb = sdt.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entnemb() ;
      }
   }

   public String getgxTv_SdtEntradadeProductosAlmacen_TRN_Emprcod( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Emprcod ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Emprcod( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      if ( GXutil.strcmp(gxTv_SdtEntradadeProductosAlmacen_TRN_Emprcod, value) != 0 )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_Mode = "INS" ;
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Emprcod_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdnum_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Linent_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Albaran_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entnalbar_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entunient_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entpre_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entunirem_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entlotn_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entfval_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entobs_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entnumcon_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Enteti_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entcon_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entconini_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entconfin_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entnro_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entunialb_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entpedcum_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entbnc_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Pednumlin_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedpri_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedsit_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcum_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcanent_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Peduni_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedpre_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Cantpdte_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entcc_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entccocod_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entremnro_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entremsuc_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entremtpo_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entfabid_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entloteid_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entubicacion_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prvnum_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdexialm_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdcanpen_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreant_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreact_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdvalstk_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Peddto_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdexicc_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prddetpar_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdnom_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdrec_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Valcod_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpremed_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entnemb_Z_SetNull( );
      }
      SetDirty("Emprcod");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Emprcod = value ;
   }

   public String getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdnum( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prdnum ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdnum( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      if ( GXutil.strcmp(gxTv_SdtEntradadeProductosAlmacen_TRN_Prdnum, value) != 0 )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_Mode = "INS" ;
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Emprcod_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdnum_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Linent_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Albaran_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entnalbar_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entunient_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entpre_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entunirem_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entlotn_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entfval_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entobs_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entnumcon_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Enteti_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entcon_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entconini_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entconfin_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entnro_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entunialb_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entpedcum_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entbnc_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Pednumlin_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedpri_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedsit_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcum_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcanent_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Peduni_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedpre_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Cantpdte_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entcc_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entccocod_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entremnro_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entremsuc_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entremtpo_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entfabid_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entloteid_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entubicacion_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prvnum_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdexialm_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdcanpen_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreant_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreact_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdvalstk_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Peddto_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdexicc_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prddetpar_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdnom_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdrec_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Valcod_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpremed_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entnemb_Z_SetNull( );
      }
      SetDirty("Prdnum");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdnum = value ;
   }

   public short getgxTv_SdtEntradadeProductosAlmacen_TRN_Linent( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Linent ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Linent( short value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      if ( gxTv_SdtEntradadeProductosAlmacen_TRN_Linent != value )
      {
         gxTv_SdtEntradadeProductosAlmacen_TRN_Mode = "INS" ;
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Emprcod_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdnum_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Linent_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Albaran_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entnalbar_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entunient_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entpre_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entunirem_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entlotn_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entfval_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entobs_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entnumcon_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Enteti_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entcon_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entconini_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entconfin_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entnro_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entunialb_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entpedcum_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entbnc_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Pednumlin_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedpri_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedsit_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcum_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcanent_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Peduni_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedpre_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Cantpdte_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entcc_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entccocod_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entremnro_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entremsuc_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entremtpo_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entfabid_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entloteid_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entubicacion_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prvnum_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdexialm_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdcanpen_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreant_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreact_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdvalstk_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Peddto_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdexicc_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prddetpar_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdnom_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdrec_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Valcod_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpremed_Z_SetNull( );
         this.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entnemb_Z_SetNull( );
      }
      SetDirty("Linent");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Linent = value ;
   }

   public java.util.Date getgxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent( java.util.Date value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entfecent");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent = value ;
   }

   public String getgxTv_SdtEntradadeProductosAlmacen_TRN_Albaran( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Albaran ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Albaran( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Albaran");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Albaran = value ;
   }

   public String getgxTv_SdtEntradadeProductosAlmacen_TRN_Entnalbar( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entnalbar ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entnalbar( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entnalbar");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entnalbar = value ;
   }

   public int getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod( int value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Pedcod");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod_N = (byte)(1) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod = 0 ;
      SetDirty("Pedcod");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod_IsNull( )
   {
      return (gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod_N==1) ;
   }

   public int getgxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum( int value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entprvnum");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum_N = (byte)(1) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum = 0 ;
      SetDirty("Entprvnum");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum_IsNull( )
   {
      return (gxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum_N==1) ;
   }

   public java.math.BigDecimal getgxTv_SdtEntradadeProductosAlmacen_TRN_Entunient( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entunient ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entunient( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entunient");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entunient = value ;
   }

   public java.math.BigDecimal getgxTv_SdtEntradadeProductosAlmacen_TRN_Entpre( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entpre ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entpre( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entpre");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entpre = value ;
   }

   public java.math.BigDecimal getgxTv_SdtEntradadeProductosAlmacen_TRN_Entunirem( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entunirem ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entunirem( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entunirem");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entunirem = value ;
   }

   public String getgxTv_SdtEntradadeProductosAlmacen_TRN_Entlotn( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entlotn ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entlotn( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entlotn");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entlotn = value ;
   }

   public java.util.Date getgxTv_SdtEntradadeProductosAlmacen_TRN_Entfval( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entfval ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entfval( java.util.Date value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entfval");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entfval = value ;
   }

   public String getgxTv_SdtEntradadeProductosAlmacen_TRN_Entobs( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entobs ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entobs( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entobs");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entobs = value ;
   }

   public short getgxTv_SdtEntradadeProductosAlmacen_TRN_Entnumcon( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entnumcon ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entnumcon( short value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entnumcon");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entnumcon = value ;
   }

   public byte getgxTv_SdtEntradadeProductosAlmacen_TRN_Enteti( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Enteti ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Enteti( byte value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Enteti");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Enteti = value ;
   }

   public byte getgxTv_SdtEntradadeProductosAlmacen_TRN_Entcon( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entcon ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entcon( byte value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entcon");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entcon = value ;
   }

   public int getgxTv_SdtEntradadeProductosAlmacen_TRN_Entconini( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entconini ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entconini( int value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entconini");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entconini = value ;
   }

   public int getgxTv_SdtEntradadeProductosAlmacen_TRN_Entconfin( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entconfin ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entconfin( int value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entconfin");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entconfin = value ;
   }

   public int getgxTv_SdtEntradadeProductosAlmacen_TRN_Entnro( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entnro ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entnro( int value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entnro");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entnro = value ;
   }

   public java.math.BigDecimal getgxTv_SdtEntradadeProductosAlmacen_TRN_Entunialb( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entunialb ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entunialb( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entunialb");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entunialb = value ;
   }

   public String getgxTv_SdtEntradadeProductosAlmacen_TRN_Entpedcum( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entpedcum ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entpedcum( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entpedcum");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entpedcum = value ;
   }

   public String getgxTv_SdtEntradadeProductosAlmacen_TRN_Entbnc( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entbnc ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entbnc( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entbnc");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entbnc = value ;
   }

   public java.util.Date getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec( java.util.Date value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Pedfec");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec = value ;
   }

   public short getgxTv_SdtEntradadeProductosAlmacen_TRN_Pednumlin( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Pednumlin ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Pednumlin( short value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Pednumlin");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pednumlin = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Pednumlin_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pednumlin = (short)(0) ;
      SetDirty("Pednumlin");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Pednumlin_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedpri( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Pedpri ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedpri( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Pedpri");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedpri = value ;
   }

   public String getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedsit( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Pedsit ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedsit( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Pedsit");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedsit = value ;
   }

   public String getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcum( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcum ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcum( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Pedcum");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcum = value ;
   }

   public java.util.Date getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent( java.util.Date value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Pedfulent");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent = value ;
   }

   public java.math.BigDecimal getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcanent( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcanent ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcanent( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Pedcanent");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcanent = value ;
   }

   public java.math.BigDecimal getgxTv_SdtEntradadeProductosAlmacen_TRN_Peduni( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Peduni ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Peduni( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Peduni");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Peduni = value ;
   }

   public java.math.BigDecimal getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedpre( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Pedpre ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedpre( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Pedpre");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedpre = value ;
   }

   public java.math.BigDecimal getgxTv_SdtEntradadeProductosAlmacen_TRN_Cantpdte( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Cantpdte ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Cantpdte( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Cantpdte");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Cantpdte = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Cantpdte_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Cantpdte = DecimalUtil.ZERO ;
      SetDirty("Cantpdte");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Cantpdte_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtEntradadeProductosAlmacen_TRN_Entcc( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entcc ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entcc( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entcc");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entcc = value ;
   }

   public short getgxTv_SdtEntradadeProductosAlmacen_TRN_Entccocod( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entccocod ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entccocod( short value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entccocod");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entccocod = value ;
   }

   public String getgxTv_SdtEntradadeProductosAlmacen_TRN_Entremnro( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entremnro ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entremnro( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entremnro");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entremnro = value ;
   }

   public java.util.Date getgxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch( java.util.Date value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entremfch");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch = value ;
   }

   public String getgxTv_SdtEntradadeProductosAlmacen_TRN_Entremsuc( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entremsuc ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entremsuc( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entremsuc");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entremsuc = value ;
   }

   public String getgxTv_SdtEntradadeProductosAlmacen_TRN_Entremtpo( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entremtpo ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entremtpo( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entremtpo");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entremtpo = value ;
   }

   public int getgxTv_SdtEntradadeProductosAlmacen_TRN_Entfabid( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entfabid ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entfabid( int value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entfabid");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entfabid = value ;
   }

   public long getgxTv_SdtEntradadeProductosAlmacen_TRN_Entloteid( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entloteid ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entloteid( long value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entloteid");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entloteid = value ;
   }

   public String getgxTv_SdtEntradadeProductosAlmacen_TRN_Entubicacion( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entubicacion ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entubicacion( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entubicacion");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entubicacion = value ;
   }

   public int getgxTv_SdtEntradadeProductosAlmacen_TRN_Prvnum( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prvnum ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Prvnum( int value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Prvnum");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prvnum = value ;
   }

   public java.math.BigDecimal getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdexialm( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prdexialm ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdexialm( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Prdexialm");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdexialm = value ;
   }

   public java.math.BigDecimal getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdcanpen( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prdcanpen ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdcanpen( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Prdcanpen");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdcanpen = value ;
   }

   public java.util.Date getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent( java.util.Date value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Prdfulent");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent = value ;
   }

   public java.util.Date getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre( java.util.Date value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Prdfecpre");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre = value ;
   }

   public java.math.BigDecimal getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreant( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreant ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreant( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Prdpreant");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreant = value ;
   }

   public java.math.BigDecimal getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreact( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreact ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreact( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Prdpreact");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreact = value ;
   }

   public java.math.BigDecimal getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdvalstk( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prdvalstk ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdvalstk( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Prdvalstk");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdvalstk = value ;
   }

   public java.math.BigDecimal getgxTv_SdtEntradadeProductosAlmacen_TRN_Peddto( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Peddto ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Peddto( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Peddto");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Peddto = value ;
   }

   public java.math.BigDecimal getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdexicc( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prdexicc ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdexicc( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Prdexicc");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdexicc = value ;
   }

   public String getgxTv_SdtEntradadeProductosAlmacen_TRN_Prddetpar( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prddetpar ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Prddetpar( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Prddetpar");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prddetpar = value ;
   }

   public String getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdnom( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prdnom ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdnom( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Prdnom");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdnom = value ;
   }

   public String getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdrec( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prdrec ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdrec( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Prdrec");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdrec = value ;
   }

   public byte getgxTv_SdtEntradadeProductosAlmacen_TRN_Valcod( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Valcod ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Valcod( byte value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Valcod");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Valcod = value ;
   }

   public java.math.BigDecimal getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpremed( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpremed ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpremed( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Prdpremed");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpremed = value ;
   }

   public byte getgxTv_SdtEntradadeProductosAlmacen_TRN_Entnemb( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entnemb ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entnemb( byte value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entnemb");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entnemb = value ;
   }

   public String getgxTv_SdtEntradadeProductosAlmacen_TRN_Mode( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Mode ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Mode( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Mode");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Mode = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Mode_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtEntradadeProductosAlmacen_TRN_Initialized( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Initialized ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Initialized( short value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Initialized");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Initialized = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Initialized_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Initialized_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtEntradadeProductosAlmacen_TRN_Emprcod_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Emprcod_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Emprcod_Z( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Emprcod_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Emprcod_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Emprcod_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Emprcod_Z = "" ;
      SetDirty("Emprcod_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Emprcod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdnum_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prdnum_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdnum_Z( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Prdnum_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdnum_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdnum_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdnum_Z = "" ;
      SetDirty("Prdnum_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdnum_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtEntradadeProductosAlmacen_TRN_Linent_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Linent_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Linent_Z( short value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Linent_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Linent_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Linent_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Linent_Z = (short)(0) ;
      SetDirty("Linent_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Linent_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent_Z( java.util.Date value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entfecent_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent_Z = GXutil.nullDate() ;
      SetDirty("Entfecent_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtEntradadeProductosAlmacen_TRN_Albaran_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Albaran_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Albaran_Z( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Albaran_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Albaran_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Albaran_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Albaran_Z = "" ;
      SetDirty("Albaran_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Albaran_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtEntradadeProductosAlmacen_TRN_Entnalbar_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entnalbar_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entnalbar_Z( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entnalbar_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entnalbar_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entnalbar_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entnalbar_Z = "" ;
      SetDirty("Entnalbar_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Entnalbar_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod_Z( int value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Pedcod_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod_Z = 0 ;
      SetDirty("Pedcod_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum_Z( int value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entprvnum_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum_Z = 0 ;
      SetDirty("Entprvnum_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtEntradadeProductosAlmacen_TRN_Entunient_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entunient_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entunient_Z( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entunient_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entunient_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entunient_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entunient_Z = DecimalUtil.ZERO ;
      SetDirty("Entunient_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Entunient_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtEntradadeProductosAlmacen_TRN_Entpre_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entpre_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entpre_Z( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entpre_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entpre_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entpre_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entpre_Z = DecimalUtil.ZERO ;
      SetDirty("Entpre_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Entpre_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtEntradadeProductosAlmacen_TRN_Entunirem_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entunirem_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entunirem_Z( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entunirem_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entunirem_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entunirem_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entunirem_Z = DecimalUtil.ZERO ;
      SetDirty("Entunirem_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Entunirem_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtEntradadeProductosAlmacen_TRN_Entlotn_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entlotn_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entlotn_Z( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entlotn_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entlotn_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entlotn_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entlotn_Z = "" ;
      SetDirty("Entlotn_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Entlotn_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtEntradadeProductosAlmacen_TRN_Entfval_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entfval_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entfval_Z( java.util.Date value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entfval_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entfval_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entfval_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entfval_Z = GXutil.nullDate() ;
      SetDirty("Entfval_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Entfval_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtEntradadeProductosAlmacen_TRN_Entobs_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entobs_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entobs_Z( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entobs_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entobs_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entobs_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entobs_Z = "" ;
      SetDirty("Entobs_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Entobs_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtEntradadeProductosAlmacen_TRN_Entnumcon_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entnumcon_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entnumcon_Z( short value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entnumcon_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entnumcon_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entnumcon_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entnumcon_Z = (short)(0) ;
      SetDirty("Entnumcon_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Entnumcon_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtEntradadeProductosAlmacen_TRN_Enteti_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Enteti_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Enteti_Z( byte value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Enteti_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Enteti_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Enteti_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Enteti_Z = (byte)(0) ;
      SetDirty("Enteti_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Enteti_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtEntradadeProductosAlmacen_TRN_Entcon_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entcon_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entcon_Z( byte value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entcon_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entcon_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entcon_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entcon_Z = (byte)(0) ;
      SetDirty("Entcon_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Entcon_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtEntradadeProductosAlmacen_TRN_Entconini_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entconini_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entconini_Z( int value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entconini_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entconini_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entconini_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entconini_Z = 0 ;
      SetDirty("Entconini_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Entconini_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtEntradadeProductosAlmacen_TRN_Entconfin_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entconfin_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entconfin_Z( int value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entconfin_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entconfin_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entconfin_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entconfin_Z = 0 ;
      SetDirty("Entconfin_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Entconfin_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtEntradadeProductosAlmacen_TRN_Entnro_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entnro_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entnro_Z( int value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entnro_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entnro_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entnro_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entnro_Z = 0 ;
      SetDirty("Entnro_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Entnro_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtEntradadeProductosAlmacen_TRN_Entunialb_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entunialb_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entunialb_Z( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entunialb_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entunialb_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entunialb_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entunialb_Z = DecimalUtil.ZERO ;
      SetDirty("Entunialb_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Entunialb_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtEntradadeProductosAlmacen_TRN_Entpedcum_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entpedcum_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entpedcum_Z( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entpedcum_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entpedcum_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entpedcum_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entpedcum_Z = "" ;
      SetDirty("Entpedcum_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Entpedcum_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtEntradadeProductosAlmacen_TRN_Entbnc_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entbnc_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entbnc_Z( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entbnc_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entbnc_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entbnc_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entbnc_Z = "" ;
      SetDirty("Entbnc_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Entbnc_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec_Z( java.util.Date value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Pedfec_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec_Z = GXutil.nullDate() ;
      SetDirty("Pedfec_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtEntradadeProductosAlmacen_TRN_Pednumlin_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Pednumlin_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Pednumlin_Z( short value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Pednumlin_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pednumlin_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Pednumlin_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pednumlin_Z = (short)(0) ;
      SetDirty("Pednumlin_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Pednumlin_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedpri_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Pedpri_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedpri_Z( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Pedpri_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedpri_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedpri_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedpri_Z = "" ;
      SetDirty("Pedpri_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedpri_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedsit_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Pedsit_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedsit_Z( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Pedsit_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedsit_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedsit_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedsit_Z = "" ;
      SetDirty("Pedsit_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedsit_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcum_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcum_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcum_Z( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Pedcum_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcum_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcum_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcum_Z = "" ;
      SetDirty("Pedcum_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcum_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent_Z( java.util.Date value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Pedfulent_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent_Z = GXutil.nullDate() ;
      SetDirty("Pedfulent_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcanent_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcanent_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcanent_Z( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Pedcanent_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcanent_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcanent_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcanent_Z = DecimalUtil.ZERO ;
      SetDirty("Pedcanent_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcanent_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtEntradadeProductosAlmacen_TRN_Peduni_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Peduni_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Peduni_Z( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Peduni_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Peduni_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Peduni_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Peduni_Z = DecimalUtil.ZERO ;
      SetDirty("Peduni_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Peduni_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedpre_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Pedpre_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedpre_Z( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Pedpre_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedpre_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedpre_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedpre_Z = DecimalUtil.ZERO ;
      SetDirty("Pedpre_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedpre_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtEntradadeProductosAlmacen_TRN_Cantpdte_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Cantpdte_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Cantpdte_Z( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Cantpdte_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Cantpdte_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Cantpdte_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Cantpdte_Z = DecimalUtil.ZERO ;
      SetDirty("Cantpdte_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Cantpdte_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtEntradadeProductosAlmacen_TRN_Entcc_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entcc_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entcc_Z( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entcc_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entcc_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entcc_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entcc_Z = "" ;
      SetDirty("Entcc_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Entcc_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtEntradadeProductosAlmacen_TRN_Entccocod_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entccocod_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entccocod_Z( short value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entccocod_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entccocod_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entccocod_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entccocod_Z = (short)(0) ;
      SetDirty("Entccocod_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Entccocod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtEntradadeProductosAlmacen_TRN_Entremnro_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entremnro_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entremnro_Z( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entremnro_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entremnro_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entremnro_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entremnro_Z = "" ;
      SetDirty("Entremnro_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Entremnro_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch_Z( java.util.Date value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entremfch_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch_Z = GXutil.nullDate() ;
      SetDirty("Entremfch_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtEntradadeProductosAlmacen_TRN_Entremsuc_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entremsuc_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entremsuc_Z( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entremsuc_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entremsuc_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entremsuc_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entremsuc_Z = "" ;
      SetDirty("Entremsuc_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Entremsuc_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtEntradadeProductosAlmacen_TRN_Entremtpo_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entremtpo_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entremtpo_Z( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entremtpo_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entremtpo_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entremtpo_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entremtpo_Z = "" ;
      SetDirty("Entremtpo_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Entremtpo_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtEntradadeProductosAlmacen_TRN_Entfabid_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entfabid_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entfabid_Z( int value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entfabid_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entfabid_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entfabid_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entfabid_Z = 0 ;
      SetDirty("Entfabid_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Entfabid_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtEntradadeProductosAlmacen_TRN_Entloteid_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entloteid_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entloteid_Z( long value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entloteid_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entloteid_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entloteid_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entloteid_Z = 0 ;
      SetDirty("Entloteid_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Entloteid_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtEntradadeProductosAlmacen_TRN_Entubicacion_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entubicacion_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entubicacion_Z( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entubicacion_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entubicacion_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entubicacion_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entubicacion_Z = "" ;
      SetDirty("Entubicacion_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Entubicacion_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtEntradadeProductosAlmacen_TRN_Prvnum_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prvnum_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Prvnum_Z( int value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Prvnum_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prvnum_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Prvnum_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prvnum_Z = 0 ;
      SetDirty("Prvnum_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Prvnum_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdexialm_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prdexialm_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdexialm_Z( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Prdexialm_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdexialm_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdexialm_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdexialm_Z = DecimalUtil.ZERO ;
      SetDirty("Prdexialm_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdexialm_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdcanpen_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prdcanpen_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdcanpen_Z( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Prdcanpen_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdcanpen_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdcanpen_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdcanpen_Z = DecimalUtil.ZERO ;
      SetDirty("Prdcanpen_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdcanpen_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent_Z( java.util.Date value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Prdfulent_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent_Z = GXutil.nullDate() ;
      SetDirty("Prdfulent_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre_Z( java.util.Date value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Prdfecpre_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre_Z = GXutil.nullDate() ;
      SetDirty("Prdfecpre_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreant_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreant_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreant_Z( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Prdpreant_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreant_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreant_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreant_Z = DecimalUtil.ZERO ;
      SetDirty("Prdpreant_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreant_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreact_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreact_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreact_Z( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Prdpreact_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreact_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreact_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreact_Z = DecimalUtil.ZERO ;
      SetDirty("Prdpreact_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreact_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdvalstk_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prdvalstk_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdvalstk_Z( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Prdvalstk_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdvalstk_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdvalstk_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdvalstk_Z = DecimalUtil.ZERO ;
      SetDirty("Prdvalstk_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdvalstk_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtEntradadeProductosAlmacen_TRN_Peddto_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Peddto_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Peddto_Z( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Peddto_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Peddto_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Peddto_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Peddto_Z = DecimalUtil.ZERO ;
      SetDirty("Peddto_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Peddto_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdexicc_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prdexicc_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdexicc_Z( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Prdexicc_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdexicc_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdexicc_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdexicc_Z = DecimalUtil.ZERO ;
      SetDirty("Prdexicc_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdexicc_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtEntradadeProductosAlmacen_TRN_Prddetpar_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prddetpar_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Prddetpar_Z( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Prddetpar_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prddetpar_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Prddetpar_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prddetpar_Z = "" ;
      SetDirty("Prddetpar_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Prddetpar_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdnom_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prdnom_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdnom_Z( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Prdnom_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdnom_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdnom_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdnom_Z = "" ;
      SetDirty("Prdnom_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdnom_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdrec_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prdrec_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdrec_Z( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Prdrec_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdrec_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdrec_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdrec_Z = "" ;
      SetDirty("Prdrec_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdrec_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtEntradadeProductosAlmacen_TRN_Valcod_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Valcod_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Valcod_Z( byte value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Valcod_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Valcod_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Valcod_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Valcod_Z = (byte)(0) ;
      SetDirty("Valcod_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Valcod_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpremed_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpremed_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpremed_Z( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Prdpremed_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpremed_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpremed_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpremed_Z = DecimalUtil.ZERO ;
      SetDirty("Prdpremed_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpremed_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtEntradadeProductosAlmacen_TRN_Entnemb_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entnemb_Z ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entnemb_Z( byte value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entnemb_Z");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entnemb_Z = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entnemb_Z_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entnemb_Z = (byte)(0) ;
      SetDirty("Entnemb_Z");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Entnemb_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod_N( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod_N ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod_N( byte value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Pedcod_N");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod_N = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod_N_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod_N = (byte)(0) ;
      SetDirty("Pedcod_N");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum_N( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum_N ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum_N( byte value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      SetDirty("Entprvnum_N");
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum_N = value ;
   }

   public void setgxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum_N_SetNull( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum_N = (byte)(0) ;
      SetDirty("Entprvnum_N");
   }

   public boolean getgxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      app.stocksquimicos.entradadeproductosalmacen_trn_bc obj;
      obj = new app.stocksquimicos.entradadeproductosalmacen_trn_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Emprcod = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(1) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdnum = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent = GXutil.nullDate() ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Albaran = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entnalbar = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entunient = DecimalUtil.ZERO ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entpre = DecimalUtil.ZERO ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entunirem = DecimalUtil.ZERO ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entlotn = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entfval = GXutil.nullDate() ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entobs = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entunialb = DecimalUtil.ZERO ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entpedcum = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entbnc = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec = GXutil.nullDate() ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedpri = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedsit = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcum = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent = GXutil.nullDate() ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcanent = DecimalUtil.ZERO ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Peduni = DecimalUtil.ZERO ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedpre = DecimalUtil.ZERO ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Cantpdte = DecimalUtil.ZERO ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entcc = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entremnro = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch = GXutil.nullDate() ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entremsuc = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entremtpo = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entubicacion = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdexialm = DecimalUtil.ZERO ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdcanpen = DecimalUtil.ZERO ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent = GXutil.nullDate() ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre = GXutil.nullDate() ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreant = DecimalUtil.ZERO ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreact = DecimalUtil.ZERO ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdvalstk = DecimalUtil.ZERO ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Peddto = DecimalUtil.ZERO ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdexicc = DecimalUtil.ZERO ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prddetpar = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdnom = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdrec = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpremed = DecimalUtil.ZERO ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Mode = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Emprcod_Z = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdnum_Z = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent_Z = GXutil.nullDate() ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Albaran_Z = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entnalbar_Z = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entunient_Z = DecimalUtil.ZERO ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entpre_Z = DecimalUtil.ZERO ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entunirem_Z = DecimalUtil.ZERO ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entlotn_Z = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entfval_Z = GXutil.nullDate() ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entobs_Z = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entunialb_Z = DecimalUtil.ZERO ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entpedcum_Z = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entbnc_Z = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec_Z = GXutil.nullDate() ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedpri_Z = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedsit_Z = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcum_Z = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent_Z = GXutil.nullDate() ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcanent_Z = DecimalUtil.ZERO ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Peduni_Z = DecimalUtil.ZERO ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedpre_Z = DecimalUtil.ZERO ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Cantpdte_Z = DecimalUtil.ZERO ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entcc_Z = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entremnro_Z = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch_Z = GXutil.nullDate() ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entremsuc_Z = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entremtpo_Z = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entubicacion_Z = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdexialm_Z = DecimalUtil.ZERO ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdcanpen_Z = DecimalUtil.ZERO ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent_Z = GXutil.nullDate() ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre_Z = GXutil.nullDate() ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreant_Z = DecimalUtil.ZERO ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreact_Z = DecimalUtil.ZERO ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdvalstk_Z = DecimalUtil.ZERO ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Peddto_Z = DecimalUtil.ZERO ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdexicc_Z = DecimalUtil.ZERO ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prddetpar_Z = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdnom_Z = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdrec_Z = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpremed_Z = DecimalUtil.ZERO ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_N ;
   }

   public app.stocksquimicos.SdtEntradadeProductosAlmacen_TRN Clone( )
   {
      app.stocksquimicos.SdtEntradadeProductosAlmacen_TRN sdt;
      app.stocksquimicos.entradadeproductosalmacen_trn_bc obj;
      sdt = (app.stocksquimicos.SdtEntradadeProductosAlmacen_TRN)(clone()) ;
      obj = (app.stocksquimicos.entradadeproductosalmacen_trn_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( app.stocksquimicos.StructSdtEntradadeProductosAlmacen_TRN struct )
   {
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Emprcod(struct.getEmprcod());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdnum(struct.getPrdnum());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Linent(struct.getLinent());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent(struct.getEntfecent());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Albaran(struct.getAlbaran());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entnalbar(struct.getEntnalbar());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod(struct.getPedcod());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum(struct.getEntprvnum());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entunient(struct.getEntunient());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entpre(struct.getEntpre());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entunirem(struct.getEntunirem());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entlotn(struct.getEntlotn());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entfval(struct.getEntfval());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entobs(struct.getEntobs());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entnumcon(struct.getEntnumcon());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Enteti(struct.getEnteti());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entcon(struct.getEntcon());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entconini(struct.getEntconini());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entconfin(struct.getEntconfin());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entnro(struct.getEntnro());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entunialb(struct.getEntunialb());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entpedcum(struct.getEntpedcum());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entbnc(struct.getEntbnc());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec(struct.getPedfec());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Pednumlin(struct.getPednumlin());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedpri(struct.getPedpri());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedsit(struct.getPedsit());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcum(struct.getPedcum());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent(struct.getPedfulent());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcanent(struct.getPedcanent());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Peduni(struct.getPeduni());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedpre(struct.getPedpre());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Cantpdte(struct.getCantpdte());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entcc(struct.getEntcc());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entccocod(struct.getEntccocod());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entremnro(struct.getEntremnro());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch(struct.getEntremfch());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entremsuc(struct.getEntremsuc());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entremtpo(struct.getEntremtpo());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entfabid(struct.getEntfabid());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entloteid(struct.getEntloteid());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entubicacion(struct.getEntubicacion());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Prvnum(struct.getPrvnum());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdexialm(struct.getPrdexialm());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdcanpen(struct.getPrdcanpen());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent(struct.getPrdfulent());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre(struct.getPrdfecpre());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreant(struct.getPrdpreant());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreact(struct.getPrdpreact());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdvalstk(struct.getPrdvalstk());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Peddto(struct.getPeddto());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdexicc(struct.getPrdexicc());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Prddetpar(struct.getPrddetpar());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdnom(struct.getPrdnom());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdrec(struct.getPrdrec());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Valcod(struct.getValcod());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpremed(struct.getPrdpremed());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entnemb(struct.getEntnemb());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Mode(struct.getMode());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Initialized(struct.getInitialized());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Emprcod_Z(struct.getEmprcod_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdnum_Z(struct.getPrdnum_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Linent_Z(struct.getLinent_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent_Z(struct.getEntfecent_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Albaran_Z(struct.getAlbaran_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entnalbar_Z(struct.getEntnalbar_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod_Z(struct.getPedcod_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum_Z(struct.getEntprvnum_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entunient_Z(struct.getEntunient_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entpre_Z(struct.getEntpre_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entunirem_Z(struct.getEntunirem_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entlotn_Z(struct.getEntlotn_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entfval_Z(struct.getEntfval_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entobs_Z(struct.getEntobs_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entnumcon_Z(struct.getEntnumcon_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Enteti_Z(struct.getEnteti_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entcon_Z(struct.getEntcon_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entconini_Z(struct.getEntconini_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entconfin_Z(struct.getEntconfin_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entnro_Z(struct.getEntnro_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entunialb_Z(struct.getEntunialb_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entpedcum_Z(struct.getEntpedcum_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entbnc_Z(struct.getEntbnc_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec_Z(struct.getPedfec_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Pednumlin_Z(struct.getPednumlin_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedpri_Z(struct.getPedpri_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedsit_Z(struct.getPedsit_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcum_Z(struct.getPedcum_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent_Z(struct.getPedfulent_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcanent_Z(struct.getPedcanent_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Peduni_Z(struct.getPeduni_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedpre_Z(struct.getPedpre_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Cantpdte_Z(struct.getCantpdte_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entcc_Z(struct.getEntcc_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entccocod_Z(struct.getEntccocod_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entremnro_Z(struct.getEntremnro_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch_Z(struct.getEntremfch_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entremsuc_Z(struct.getEntremsuc_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entremtpo_Z(struct.getEntremtpo_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entfabid_Z(struct.getEntfabid_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entloteid_Z(struct.getEntloteid_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entubicacion_Z(struct.getEntubicacion_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Prvnum_Z(struct.getPrvnum_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdexialm_Z(struct.getPrdexialm_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdcanpen_Z(struct.getPrdcanpen_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent_Z(struct.getPrdfulent_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre_Z(struct.getPrdfecpre_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreant_Z(struct.getPrdpreant_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreact_Z(struct.getPrdpreact_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdvalstk_Z(struct.getPrdvalstk_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Peddto_Z(struct.getPeddto_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdexicc_Z(struct.getPrdexicc_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Prddetpar_Z(struct.getPrddetpar_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdnom_Z(struct.getPrdnom_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdrec_Z(struct.getPrdrec_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Valcod_Z(struct.getValcod_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpremed_Z(struct.getPrdpremed_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entnemb_Z(struct.getEntnemb_Z());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod_N(struct.getPedcod_N());
      setgxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum_N(struct.getEntprvnum_N());
   }

   @SuppressWarnings("unchecked")
   public app.stocksquimicos.StructSdtEntradadeProductosAlmacen_TRN getStruct( )
   {
      app.stocksquimicos.StructSdtEntradadeProductosAlmacen_TRN struct = new app.stocksquimicos.StructSdtEntradadeProductosAlmacen_TRN ();
      struct.setEmprcod(getgxTv_SdtEntradadeProductosAlmacen_TRN_Emprcod());
      struct.setPrdnum(getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdnum());
      struct.setLinent(getgxTv_SdtEntradadeProductosAlmacen_TRN_Linent());
      struct.setEntfecent(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent());
      struct.setAlbaran(getgxTv_SdtEntradadeProductosAlmacen_TRN_Albaran());
      struct.setEntnalbar(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entnalbar());
      struct.setPedcod(getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod());
      struct.setEntprvnum(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum());
      struct.setEntunient(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entunient());
      struct.setEntpre(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entpre());
      struct.setEntunirem(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entunirem());
      struct.setEntlotn(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entlotn());
      struct.setEntfval(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entfval());
      struct.setEntobs(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entobs());
      struct.setEntnumcon(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entnumcon());
      struct.setEnteti(getgxTv_SdtEntradadeProductosAlmacen_TRN_Enteti());
      struct.setEntcon(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entcon());
      struct.setEntconini(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entconini());
      struct.setEntconfin(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entconfin());
      struct.setEntnro(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entnro());
      struct.setEntunialb(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entunialb());
      struct.setEntpedcum(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entpedcum());
      struct.setEntbnc(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entbnc());
      struct.setPedfec(getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec());
      struct.setPednumlin(getgxTv_SdtEntradadeProductosAlmacen_TRN_Pednumlin());
      struct.setPedpri(getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedpri());
      struct.setPedsit(getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedsit());
      struct.setPedcum(getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcum());
      struct.setPedfulent(getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent());
      struct.setPedcanent(getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcanent());
      struct.setPeduni(getgxTv_SdtEntradadeProductosAlmacen_TRN_Peduni());
      struct.setPedpre(getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedpre());
      struct.setCantpdte(getgxTv_SdtEntradadeProductosAlmacen_TRN_Cantpdte());
      struct.setEntcc(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entcc());
      struct.setEntccocod(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entccocod());
      struct.setEntremnro(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entremnro());
      struct.setEntremfch(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch());
      struct.setEntremsuc(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entremsuc());
      struct.setEntremtpo(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entremtpo());
      struct.setEntfabid(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entfabid());
      struct.setEntloteid(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entloteid());
      struct.setEntubicacion(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entubicacion());
      struct.setPrvnum(getgxTv_SdtEntradadeProductosAlmacen_TRN_Prvnum());
      struct.setPrdexialm(getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdexialm());
      struct.setPrdcanpen(getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdcanpen());
      struct.setPrdfulent(getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent());
      struct.setPrdfecpre(getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre());
      struct.setPrdpreant(getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreant());
      struct.setPrdpreact(getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreact());
      struct.setPrdvalstk(getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdvalstk());
      struct.setPeddto(getgxTv_SdtEntradadeProductosAlmacen_TRN_Peddto());
      struct.setPrdexicc(getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdexicc());
      struct.setPrddetpar(getgxTv_SdtEntradadeProductosAlmacen_TRN_Prddetpar());
      struct.setPrdnom(getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdnom());
      struct.setPrdrec(getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdrec());
      struct.setValcod(getgxTv_SdtEntradadeProductosAlmacen_TRN_Valcod());
      struct.setPrdpremed(getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpremed());
      struct.setEntnemb(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entnemb());
      struct.setMode(getgxTv_SdtEntradadeProductosAlmacen_TRN_Mode());
      struct.setInitialized(getgxTv_SdtEntradadeProductosAlmacen_TRN_Initialized());
      struct.setEmprcod_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Emprcod_Z());
      struct.setPrdnum_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdnum_Z());
      struct.setLinent_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Linent_Z());
      struct.setEntfecent_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent_Z());
      struct.setAlbaran_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Albaran_Z());
      struct.setEntnalbar_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entnalbar_Z());
      struct.setPedcod_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod_Z());
      struct.setEntprvnum_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum_Z());
      struct.setEntunient_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entunient_Z());
      struct.setEntpre_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entpre_Z());
      struct.setEntunirem_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entunirem_Z());
      struct.setEntlotn_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entlotn_Z());
      struct.setEntfval_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entfval_Z());
      struct.setEntobs_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entobs_Z());
      struct.setEntnumcon_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entnumcon_Z());
      struct.setEnteti_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Enteti_Z());
      struct.setEntcon_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entcon_Z());
      struct.setEntconini_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entconini_Z());
      struct.setEntconfin_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entconfin_Z());
      struct.setEntnro_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entnro_Z());
      struct.setEntunialb_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entunialb_Z());
      struct.setEntpedcum_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entpedcum_Z());
      struct.setEntbnc_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entbnc_Z());
      struct.setPedfec_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec_Z());
      struct.setPednumlin_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Pednumlin_Z());
      struct.setPedpri_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedpri_Z());
      struct.setPedsit_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedsit_Z());
      struct.setPedcum_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcum_Z());
      struct.setPedfulent_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent_Z());
      struct.setPedcanent_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcanent_Z());
      struct.setPeduni_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Peduni_Z());
      struct.setPedpre_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedpre_Z());
      struct.setCantpdte_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Cantpdte_Z());
      struct.setEntcc_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entcc_Z());
      struct.setEntccocod_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entccocod_Z());
      struct.setEntremnro_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entremnro_Z());
      struct.setEntremfch_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch_Z());
      struct.setEntremsuc_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entremsuc_Z());
      struct.setEntremtpo_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entremtpo_Z());
      struct.setEntfabid_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entfabid_Z());
      struct.setEntloteid_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entloteid_Z());
      struct.setEntubicacion_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entubicacion_Z());
      struct.setPrvnum_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Prvnum_Z());
      struct.setPrdexialm_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdexialm_Z());
      struct.setPrdcanpen_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdcanpen_Z());
      struct.setPrdfulent_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent_Z());
      struct.setPrdfecpre_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre_Z());
      struct.setPrdpreant_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreant_Z());
      struct.setPrdpreact_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreact_Z());
      struct.setPrdvalstk_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdvalstk_Z());
      struct.setPeddto_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Peddto_Z());
      struct.setPrdexicc_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdexicc_Z());
      struct.setPrddetpar_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Prddetpar_Z());
      struct.setPrdnom_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdnom_Z());
      struct.setPrdrec_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdrec_Z());
      struct.setValcod_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Valcod_Z());
      struct.setPrdpremed_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpremed_Z());
      struct.setEntnemb_Z(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entnemb_Z());
      struct.setPedcod_N(getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod_N());
      struct.setEntprvnum_N(getgxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum_N());
      return struct ;
   }

   private byte gxTv_SdtEntradadeProductosAlmacen_TRN_N ;
   private byte gxTv_SdtEntradadeProductosAlmacen_TRN_Enteti ;
   private byte gxTv_SdtEntradadeProductosAlmacen_TRN_Entcon ;
   private byte gxTv_SdtEntradadeProductosAlmacen_TRN_Valcod ;
   private byte gxTv_SdtEntradadeProductosAlmacen_TRN_Entnemb ;
   private byte gxTv_SdtEntradadeProductosAlmacen_TRN_Enteti_Z ;
   private byte gxTv_SdtEntradadeProductosAlmacen_TRN_Entcon_Z ;
   private byte gxTv_SdtEntradadeProductosAlmacen_TRN_Valcod_Z ;
   private byte gxTv_SdtEntradadeProductosAlmacen_TRN_Entnemb_Z ;
   private byte gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod_N ;
   private byte gxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum_N ;
   private short gxTv_SdtEntradadeProductosAlmacen_TRN_Linent ;
   private short gxTv_SdtEntradadeProductosAlmacen_TRN_Entnumcon ;
   private short gxTv_SdtEntradadeProductosAlmacen_TRN_Pednumlin ;
   private short gxTv_SdtEntradadeProductosAlmacen_TRN_Entccocod ;
   private short gxTv_SdtEntradadeProductosAlmacen_TRN_Initialized ;
   private short gxTv_SdtEntradadeProductosAlmacen_TRN_Linent_Z ;
   private short gxTv_SdtEntradadeProductosAlmacen_TRN_Entnumcon_Z ;
   private short gxTv_SdtEntradadeProductosAlmacen_TRN_Pednumlin_Z ;
   private short gxTv_SdtEntradadeProductosAlmacen_TRN_Entccocod_Z ;
   private short readOk ;
   private short nOutParmCount ;
   private int gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod ;
   private int gxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum ;
   private int gxTv_SdtEntradadeProductosAlmacen_TRN_Entconini ;
   private int gxTv_SdtEntradadeProductosAlmacen_TRN_Entconfin ;
   private int gxTv_SdtEntradadeProductosAlmacen_TRN_Entnro ;
   private int gxTv_SdtEntradadeProductosAlmacen_TRN_Entfabid ;
   private int gxTv_SdtEntradadeProductosAlmacen_TRN_Prvnum ;
   private int gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod_Z ;
   private int gxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum_Z ;
   private int gxTv_SdtEntradadeProductosAlmacen_TRN_Entconini_Z ;
   private int gxTv_SdtEntradadeProductosAlmacen_TRN_Entconfin_Z ;
   private int gxTv_SdtEntradadeProductosAlmacen_TRN_Entnro_Z ;
   private int gxTv_SdtEntradadeProductosAlmacen_TRN_Entfabid_Z ;
   private int gxTv_SdtEntradadeProductosAlmacen_TRN_Prvnum_Z ;
   private long gxTv_SdtEntradadeProductosAlmacen_TRN_Entloteid ;
   private long gxTv_SdtEntradadeProductosAlmacen_TRN_Entloteid_Z ;
   private java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Entunient ;
   private java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Entpre ;
   private java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Entunirem ;
   private java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Entunialb ;
   private java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcanent ;
   private java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Peduni ;
   private java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Pedpre ;
   private java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Cantpdte ;
   private java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Prdexialm ;
   private java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Prdcanpen ;
   private java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreant ;
   private java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreact ;
   private java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Prdvalstk ;
   private java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Peddto ;
   private java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Prdexicc ;
   private java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpremed ;
   private java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Entunient_Z ;
   private java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Entpre_Z ;
   private java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Entunirem_Z ;
   private java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Entunialb_Z ;
   private java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcanent_Z ;
   private java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Peduni_Z ;
   private java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Pedpre_Z ;
   private java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Cantpdte_Z ;
   private java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Prdexialm_Z ;
   private java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Prdcanpen_Z ;
   private java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreant_Z ;
   private java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreact_Z ;
   private java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Prdvalstk_Z ;
   private java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Peddto_Z ;
   private java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Prdexicc_Z ;
   private java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpremed_Z ;
   private String gxTv_SdtEntradadeProductosAlmacen_TRN_Emprcod ;
   private String gxTv_SdtEntradadeProductosAlmacen_TRN_Prdnum ;
   private String gxTv_SdtEntradadeProductosAlmacen_TRN_Albaran ;
   private String gxTv_SdtEntradadeProductosAlmacen_TRN_Entnalbar ;
   private String gxTv_SdtEntradadeProductosAlmacen_TRN_Entlotn ;
   private String gxTv_SdtEntradadeProductosAlmacen_TRN_Entobs ;
   private String gxTv_SdtEntradadeProductosAlmacen_TRN_Entpedcum ;
   private String gxTv_SdtEntradadeProductosAlmacen_TRN_Entbnc ;
   private String gxTv_SdtEntradadeProductosAlmacen_TRN_Pedpri ;
   private String gxTv_SdtEntradadeProductosAlmacen_TRN_Pedsit ;
   private String gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcum ;
   private String gxTv_SdtEntradadeProductosAlmacen_TRN_Entcc ;
   private String gxTv_SdtEntradadeProductosAlmacen_TRN_Entremnro ;
   private String gxTv_SdtEntradadeProductosAlmacen_TRN_Entremsuc ;
   private String gxTv_SdtEntradadeProductosAlmacen_TRN_Entremtpo ;
   private String gxTv_SdtEntradadeProductosAlmacen_TRN_Entubicacion ;
   private String gxTv_SdtEntradadeProductosAlmacen_TRN_Prddetpar ;
   private String gxTv_SdtEntradadeProductosAlmacen_TRN_Prdnom ;
   private String gxTv_SdtEntradadeProductosAlmacen_TRN_Prdrec ;
   private String gxTv_SdtEntradadeProductosAlmacen_TRN_Mode ;
   private String gxTv_SdtEntradadeProductosAlmacen_TRN_Emprcod_Z ;
   private String gxTv_SdtEntradadeProductosAlmacen_TRN_Prdnum_Z ;
   private String gxTv_SdtEntradadeProductosAlmacen_TRN_Albaran_Z ;
   private String gxTv_SdtEntradadeProductosAlmacen_TRN_Entnalbar_Z ;
   private String gxTv_SdtEntradadeProductosAlmacen_TRN_Entlotn_Z ;
   private String gxTv_SdtEntradadeProductosAlmacen_TRN_Entobs_Z ;
   private String gxTv_SdtEntradadeProductosAlmacen_TRN_Entpedcum_Z ;
   private String gxTv_SdtEntradadeProductosAlmacen_TRN_Entbnc_Z ;
   private String gxTv_SdtEntradadeProductosAlmacen_TRN_Pedpri_Z ;
   private String gxTv_SdtEntradadeProductosAlmacen_TRN_Pedsit_Z ;
   private String gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcum_Z ;
   private String gxTv_SdtEntradadeProductosAlmacen_TRN_Entcc_Z ;
   private String gxTv_SdtEntradadeProductosAlmacen_TRN_Entremnro_Z ;
   private String gxTv_SdtEntradadeProductosAlmacen_TRN_Entremsuc_Z ;
   private String gxTv_SdtEntradadeProductosAlmacen_TRN_Entremtpo_Z ;
   private String gxTv_SdtEntradadeProductosAlmacen_TRN_Entubicacion_Z ;
   private String gxTv_SdtEntradadeProductosAlmacen_TRN_Prddetpar_Z ;
   private String gxTv_SdtEntradadeProductosAlmacen_TRN_Prdnom_Z ;
   private String gxTv_SdtEntradadeProductosAlmacen_TRN_Prdrec_Z ;
   private String sTagName ;
   private String sDateCnv ;
   private String sNumToPad ;
   private java.util.Date gxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent ;
   private java.util.Date gxTv_SdtEntradadeProductosAlmacen_TRN_Entfval ;
   private java.util.Date gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec ;
   private java.util.Date gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent ;
   private java.util.Date gxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch ;
   private java.util.Date gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent ;
   private java.util.Date gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre ;
   private java.util.Date gxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent_Z ;
   private java.util.Date gxTv_SdtEntradadeProductosAlmacen_TRN_Entfval_Z ;
   private java.util.Date gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec_Z ;
   private java.util.Date gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent_Z ;
   private java.util.Date gxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch_Z ;
   private java.util.Date gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent_Z ;
   private java.util.Date gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre_Z ;
   private boolean readElement ;
   private boolean formatError ;
}

