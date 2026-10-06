package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtPedido extends GxSilentTrnSdt
{
   public SdtPedido( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtPedido.class));
   }

   public SdtPedido( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle, context, "SdtPedido");
      initialize( remoteHandle) ;
   }

   public SdtPedido( int remoteHandle ,
                     StructSdtPedido struct )
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
                     int AV361DisCod )
   {
      IGxSilentTrn obj;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {AV396EmprCod,Integer.valueOf(AV361DisCod)});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"EmprCod", String.class}, new Object[]{"DisCod", int.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "PedidosClienteSinDetalle\\Pedido");
      metadata.set("BT", "TXPDISPOS");
      metadata.set("PK", "[ \"DisCod\" ]");
      metadata.set("PKAssigned", "[ \"DisCod\" ]");
      metadata.set("Levels", "[ \"AlmacenTejido\",\"Defecto\",\"Norma\",\"Proceso\" ]");
      metadata.set("FKList", "[ { \"FK\":[ \"EmprCod\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"CliCod\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"Cod_Idtx\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"Cod_Idtx\" ],\"FKMap\":[ \"DisIdtx2-Cod_Idtx\" ] },{ \"FK\":[ \"EmprCod\",\"CpteId\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"DesaID\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"DptoID\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"MarcaId\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"RevenID\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"TipColCod\" ],\"FKMap\":[ \"DisTipCol-TipColCod\" ] } ]");
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
               gxTv_SdtPedido_Emprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom") )
            {
               gxTv_SdtPedido_Emprnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PriCod") )
            {
               gxTv_SdtPedido_Pricod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisCod") )
            {
               gxTv_SdtPedido_Discod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisTipDis") )
            {
               gxTv_SdtPedido_Distipdis = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisEncCli") )
            {
               gxTv_SdtPedido_Disenccli = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliCod") )
            {
               gxTv_SdtPedido_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtPedido_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisCliDes") )
            {
               gxTv_SdtPedido_Disclides = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNomDes") )
            {
               gxTv_SdtPedido_Clinomdes = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "E_DisCliDes") )
            {
               gxTv_SdtPedido_E_disclides = (short)(getnumericvalue(oReader.getValue())) ;
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
                  gxTv_SdtPedido_Disfec = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtPedido_Disfec = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
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
                  gxTv_SdtPedido_Disfeccli = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtPedido_Disfeccli = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
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
                  gxTv_SdtPedido_Disfecent = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtPedido_Disfecent = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtCod") )
            {
               gxTv_SdtPedido_Disartcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "E_DisArtCod") )
            {
               gxTv_SdtPedido_E_disartcod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtDsc") )
            {
               gxTv_SdtPedido_Disartdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtTip") )
            {
               gxTv_SdtPedido_Disarttip = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtTipD") )
            {
               gxTv_SdtPedido_Disarttipd = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtMat") )
            {
               gxTv_SdtPedido_Disartmat = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtTr1") )
            {
               gxTv_SdtPedido_Disarttr1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtPt1") )
            {
               gxTv_SdtPedido_Disartpt1 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtTr2") )
            {
               gxTv_SdtPedido_Disarttr2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtPt2") )
            {
               gxTv_SdtPedido_Disartpt2 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtTr3") )
            {
               gxTv_SdtPedido_Disarttr3 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtPt3") )
            {
               gxTv_SdtPedido_Disartpt3 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtUr1") )
            {
               gxTv_SdtPedido_Disartur1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtPu1") )
            {
               gxTv_SdtPedido_Disartpu1 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtUr2") )
            {
               gxTv_SdtPedido_Disartur2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtPu2") )
            {
               gxTv_SdtPedido_Disartpu2 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtUr3") )
            {
               gxTv_SdtPedido_Disartur3 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtPu3") )
            {
               gxTv_SdtPedido_Disartpu3 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisColNom") )
            {
               gxTv_SdtPedido_Discolnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisColNum") )
            {
               gxTv_SdtPedido_Discolnum = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisTipCol") )
            {
               gxTv_SdtPedido_Distipcol = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisEst") )
            {
               gxTv_SdtPedido_Disest = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisDes") )
            {
               gxTv_SdtPedido_Disdes = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtDsc2") )
            {
               gxTv_SdtPedido_Disartdsc2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisPle2") )
            {
               gxTv_SdtPedido_Disple2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtLar") )
            {
               gxTv_SdtPedido_Disartlar = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtSua") )
            {
               gxTv_SdtPedido_Disartsua = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtAca") )
            {
               gxTv_SdtPedido_Disartaca = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtEnc") )
            {
               gxTv_SdtPedido_Disartenc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtCor") )
            {
               gxTv_SdtPedido_Disartcor = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtPes") )
            {
               gxTv_SdtPedido_Disartpes = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtRdt") )
            {
               gxTv_SdtPedido_Disartrdt = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtUrg") )
            {
               gxTv_SdtPedido_Disarturg = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisGraCru") )
            {
               gxTv_SdtPedido_Disgracru = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtAnh") )
            {
               gxTv_SdtPedido_Disartanh = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtAn1") )
            {
               gxTv_SdtPedido_Disartan1 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtAcb") )
            {
               gxTv_SdtPedido_Disartacb = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtAc2") )
            {
               gxTv_SdtPedido_Disartac2 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisEncCom") )
            {
               gxTv_SdtPedido_Disenccom = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisEncAnh") )
            {
               gxTv_SdtPedido_Disencanh = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisNumCor") )
            {
               gxTv_SdtPedido_Disnumcor = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisAncSal1") )
            {
               gxTv_SdtPedido_Disancsal1 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisAncSal2") )
            {
               gxTv_SdtPedido_Disancsal2 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisAncSal3") )
            {
               gxTv_SdtPedido_Disancsal3 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisGraAca2") )
            {
               gxTv_SdtPedido_Disgraaca2 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisGraCru2") )
            {
               gxTv_SdtPedido_Disgracru2 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisGraAca") )
            {
               gxTv_SdtPedido_Disgraaca = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisRdoA") )
            {
               gxTv_SdtPedido_Disrdoa = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisRdoN") )
            {
               gxTv_SdtPedido_Disrdon = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisObsGrm") )
            {
               gxTv_SdtPedido_Disobsgrm = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisObsAnc") )
            {
               gxTv_SdtPedido_Disobsanc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisItem5") )
            {
               gxTv_SdtPedido_Disitem5 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtPle") )
            {
               gxTv_SdtPedido_Disartple = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisUniMed") )
            {
               gxTv_SdtPedido_Disunimed = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Cod_Idtx") )
            {
               gxTv_SdtPedido_Cod_idtx = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Dsc_Idtx") )
            {
               gxTv_SdtPedido_Dsc_idtx = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisOrdComp") )
            {
               gxTv_SdtPedido_Disordcomp = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RevenID") )
            {
               gxTv_SdtPedido_Revenid = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RevenNm") )
            {
               gxTv_SdtPedido_Revennm = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MarcaId") )
            {
               gxTv_SdtPedido_Marcaid = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MarcaDsc") )
            {
               gxTv_SdtPedido_Marcadsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisIdtx2") )
            {
               gxTv_SdtPedido_Disidtx2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisPriorid") )
            {
               gxTv_SdtPedido_Dispriorid = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Nxt_modelo") )
            {
               gxTv_SdtPedido_Nxt_modelo = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CpteId") )
            {
               gxTv_SdtPedido_Cpteid = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CpteDsc") )
            {
               gxTv_SdtPedido_Cptedsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Nxt_statio") )
            {
               gxTv_SdtPedido_Nxt_statio = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DesaID") )
            {
               gxTv_SdtPedido_Desaid = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DesaDsc") )
            {
               gxTv_SdtPedido_Desadsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DptoID") )
            {
               gxTv_SdtPedido_Dptoid = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DptoDsc") )
            {
               gxTv_SdtPedido_Dptodsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Nxt_artcli") )
            {
               gxTv_SdtPedido_Nxt_artcli = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisExp") )
            {
               gxTv_SdtPedido_Disexp = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Norma") )
            {
               if ( gxTv_SdtPedido_Norma == null )
               {
                  gxTv_SdtPedido_Norma = new GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Norma>(app.pedidosclientesindetalle.SdtPedido_Norma.class, "Pedido.Norma", "TexplusNET", remoteHandle);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtPedido_Norma.readxml(oReader, "Norma") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Norma") )
               {
                  GXSoapError = oReader.read() ;
               }
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlmacenTejido") )
            {
               if ( gxTv_SdtPedido_Almacentejido == null )
               {
                  gxTv_SdtPedido_Almacentejido = new GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_AlmacenTejido>(app.pedidosclientesindetalle.SdtPedido_AlmacenTejido.class, "Pedido.AlmacenTejido", "TexplusNET", remoteHandle);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtPedido_Almacentejido.readxml(oReader, "AlmacenTejido") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "AlmacenTejido") )
               {
                  GXSoapError = oReader.read() ;
               }
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Defecto") )
            {
               if ( gxTv_SdtPedido_Defecto == null )
               {
                  gxTv_SdtPedido_Defecto = new GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Defecto>(app.pedidosclientesindetalle.SdtPedido_Defecto.class, "Pedido.Defecto", "TexplusNET", remoteHandle);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtPedido_Defecto.readxml(oReader, "Defecto") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Defecto") )
               {
                  GXSoapError = oReader.read() ;
               }
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Proceso") )
            {
               if ( gxTv_SdtPedido_Proceso == null )
               {
                  gxTv_SdtPedido_Proceso = new GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Proceso>(app.pedidosclientesindetalle.SdtPedido_Proceso.class, "Pedido.Proceso", "TexplusNET", remoteHandle);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtPedido_Proceso.readxml(oReader, "Proceso") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Proceso") )
               {
                  GXSoapError = oReader.read() ;
               }
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtPedido_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtPedido_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprCod_Z") )
            {
               gxTv_SdtPedido_Emprcod_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom_Z") )
            {
               gxTv_SdtPedido_Emprnom_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PriCod_Z") )
            {
               gxTv_SdtPedido_Pricod_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisCod_Z") )
            {
               gxTv_SdtPedido_Discod_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisTipDis_Z") )
            {
               gxTv_SdtPedido_Distipdis_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisEncCli_Z") )
            {
               gxTv_SdtPedido_Disenccli_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliCod_Z") )
            {
               gxTv_SdtPedido_Clicod_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom_Z") )
            {
               gxTv_SdtPedido_Clinom_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisCliDes_Z") )
            {
               gxTv_SdtPedido_Disclides_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNomDes_Z") )
            {
               gxTv_SdtPedido_Clinomdes_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "E_DisCliDes_Z") )
            {
               gxTv_SdtPedido_E_disclides_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisFec_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtPedido_Disfec_Z = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtPedido_Disfec_Z = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisFecCli_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtPedido_Disfeccli_Z = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtPedido_Disfeccli_Z = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisFecEnt_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtPedido_Disfecent_Z = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtPedido_Disfecent_Z = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtCod_Z") )
            {
               gxTv_SdtPedido_Disartcod_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "E_DisArtCod_Z") )
            {
               gxTv_SdtPedido_E_disartcod_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtDsc_Z") )
            {
               gxTv_SdtPedido_Disartdsc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtTip_Z") )
            {
               gxTv_SdtPedido_Disarttip_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtTipD_Z") )
            {
               gxTv_SdtPedido_Disarttipd_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtMat_Z") )
            {
               gxTv_SdtPedido_Disartmat_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtTr1_Z") )
            {
               gxTv_SdtPedido_Disarttr1_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtPt1_Z") )
            {
               gxTv_SdtPedido_Disartpt1_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtTr2_Z") )
            {
               gxTv_SdtPedido_Disarttr2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtPt2_Z") )
            {
               gxTv_SdtPedido_Disartpt2_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtTr3_Z") )
            {
               gxTv_SdtPedido_Disarttr3_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtPt3_Z") )
            {
               gxTv_SdtPedido_Disartpt3_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtUr1_Z") )
            {
               gxTv_SdtPedido_Disartur1_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtPu1_Z") )
            {
               gxTv_SdtPedido_Disartpu1_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtUr2_Z") )
            {
               gxTv_SdtPedido_Disartur2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtPu2_Z") )
            {
               gxTv_SdtPedido_Disartpu2_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtUr3_Z") )
            {
               gxTv_SdtPedido_Disartur3_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtPu3_Z") )
            {
               gxTv_SdtPedido_Disartpu3_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisColNom_Z") )
            {
               gxTv_SdtPedido_Discolnom_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisColNum_Z") )
            {
               gxTv_SdtPedido_Discolnum_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisTipCol_Z") )
            {
               gxTv_SdtPedido_Distipcol_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisEst_Z") )
            {
               gxTv_SdtPedido_Disest_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisDes_Z") )
            {
               gxTv_SdtPedido_Disdes_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtDsc2_Z") )
            {
               gxTv_SdtPedido_Disartdsc2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisPle2_Z") )
            {
               gxTv_SdtPedido_Disple2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtLar_Z") )
            {
               gxTv_SdtPedido_Disartlar_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtSua_Z") )
            {
               gxTv_SdtPedido_Disartsua_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtAca_Z") )
            {
               gxTv_SdtPedido_Disartaca_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtEnc_Z") )
            {
               gxTv_SdtPedido_Disartenc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtCor_Z") )
            {
               gxTv_SdtPedido_Disartcor_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtPes_Z") )
            {
               gxTv_SdtPedido_Disartpes_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtRdt_Z") )
            {
               gxTv_SdtPedido_Disartrdt_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtUrg_Z") )
            {
               gxTv_SdtPedido_Disarturg_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisGraCru_Z") )
            {
               gxTv_SdtPedido_Disgracru_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtAnh_Z") )
            {
               gxTv_SdtPedido_Disartanh_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtAn1_Z") )
            {
               gxTv_SdtPedido_Disartan1_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtAcb_Z") )
            {
               gxTv_SdtPedido_Disartacb_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtAc2_Z") )
            {
               gxTv_SdtPedido_Disartac2_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisEncCom_Z") )
            {
               gxTv_SdtPedido_Disenccom_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisEncAnh_Z") )
            {
               gxTv_SdtPedido_Disencanh_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisNumCor_Z") )
            {
               gxTv_SdtPedido_Disnumcor_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisAncSal1_Z") )
            {
               gxTv_SdtPedido_Disancsal1_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisAncSal2_Z") )
            {
               gxTv_SdtPedido_Disancsal2_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisAncSal3_Z") )
            {
               gxTv_SdtPedido_Disancsal3_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisGraAca2_Z") )
            {
               gxTv_SdtPedido_Disgraaca2_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisGraCru2_Z") )
            {
               gxTv_SdtPedido_Disgracru2_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisGraAca_Z") )
            {
               gxTv_SdtPedido_Disgraaca_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisRdoA_Z") )
            {
               gxTv_SdtPedido_Disrdoa_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisRdoN_Z") )
            {
               gxTv_SdtPedido_Disrdon_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisObsGrm_Z") )
            {
               gxTv_SdtPedido_Disobsgrm_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisObsAnc_Z") )
            {
               gxTv_SdtPedido_Disobsanc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisItem5_Z") )
            {
               gxTv_SdtPedido_Disitem5_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtPle_Z") )
            {
               gxTv_SdtPedido_Disartple_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisUniMed_Z") )
            {
               gxTv_SdtPedido_Disunimed_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Cod_Idtx_Z") )
            {
               gxTv_SdtPedido_Cod_idtx_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Dsc_Idtx_Z") )
            {
               gxTv_SdtPedido_Dsc_idtx_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisOrdComp_Z") )
            {
               gxTv_SdtPedido_Disordcomp_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RevenID_Z") )
            {
               gxTv_SdtPedido_Revenid_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RevenNm_Z") )
            {
               gxTv_SdtPedido_Revennm_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MarcaId_Z") )
            {
               gxTv_SdtPedido_Marcaid_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MarcaDsc_Z") )
            {
               gxTv_SdtPedido_Marcadsc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisIdtx2_Z") )
            {
               gxTv_SdtPedido_Disidtx2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisPriorid_Z") )
            {
               gxTv_SdtPedido_Dispriorid_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Nxt_modelo_Z") )
            {
               gxTv_SdtPedido_Nxt_modelo_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CpteId_Z") )
            {
               gxTv_SdtPedido_Cpteid_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CpteDsc_Z") )
            {
               gxTv_SdtPedido_Cptedsc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Nxt_statio_Z") )
            {
               gxTv_SdtPedido_Nxt_statio_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DesaID_Z") )
            {
               gxTv_SdtPedido_Desaid_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DesaDsc_Z") )
            {
               gxTv_SdtPedido_Desadsc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DptoID_Z") )
            {
               gxTv_SdtPedido_Dptoid_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DptoDsc_Z") )
            {
               gxTv_SdtPedido_Dptodsc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Nxt_artcli_Z") )
            {
               gxTv_SdtPedido_Nxt_artcli_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisExp_Z") )
            {
               gxTv_SdtPedido_Disexp_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom_N") )
            {
               gxTv_SdtPedido_Emprnom_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisTipDis_N") )
            {
               gxTv_SdtPedido_Distipdis_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "E_DisCliDes_N") )
            {
               gxTv_SdtPedido_E_disclides_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "E_DisArtCod_N") )
            {
               gxTv_SdtPedido_E_disartcod_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtPu3_N") )
            {
               gxTv_SdtPedido_Disartpu3_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisColNom_N") )
            {
               gxTv_SdtPedido_Discolnom_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisColNum_N") )
            {
               gxTv_SdtPedido_Discolnum_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisTipCol_N") )
            {
               gxTv_SdtPedido_Distipcol_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Cod_Idtx_N") )
            {
               gxTv_SdtPedido_Cod_idtx_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Dsc_Idtx_N") )
            {
               gxTv_SdtPedido_Dsc_idtx_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RevenID_N") )
            {
               gxTv_SdtPedido_Revenid_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RevenNm_N") )
            {
               gxTv_SdtPedido_Revennm_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MarcaId_N") )
            {
               gxTv_SdtPedido_Marcaid_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MarcaDsc_N") )
            {
               gxTv_SdtPedido_Marcadsc_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisIdtx2_N") )
            {
               gxTv_SdtPedido_Disidtx2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CpteId_N") )
            {
               gxTv_SdtPedido_Cpteid_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CpteDsc_N") )
            {
               gxTv_SdtPedido_Cptedsc_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DesaID_N") )
            {
               gxTv_SdtPedido_Desaid_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DesaDsc_N") )
            {
               gxTv_SdtPedido_Desadsc_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DptoID_N") )
            {
               gxTv_SdtPedido_Dptoid_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DptoDsc_N") )
            {
               gxTv_SdtPedido_Dptodsc_N = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "Pedido" ;
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
      oWriter.writeElement("EmprCod", gxTv_SdtPedido_Emprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EmprNom", gxTv_SdtPedido_Emprnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PriCod", gxTv_SdtPedido_Pricod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisCod", GXutil.trim( GXutil.str( gxTv_SdtPedido_Discod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisTipDis", gxTv_SdtPedido_Distipdis);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisEncCli", gxTv_SdtPedido_Disenccli);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliCod", GXutil.trim( GXutil.str( gxTv_SdtPedido_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNom", gxTv_SdtPedido_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisCliDes", GXutil.trim( GXutil.str( gxTv_SdtPedido_Disclides, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNomDes", gxTv_SdtPedido_Clinomdes);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("E_DisCliDes", GXutil.trim( GXutil.str( gxTv_SdtPedido_E_disclides, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPedido_Disfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPedido_Disfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPedido_Disfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("DisFec", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPedido_Disfeccli), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPedido_Disfeccli), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPedido_Disfeccli), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("DisFecCli", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPedido_Disfecent), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPedido_Disfecent), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPedido_Disfecent), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("DisFecEnt", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtCod", gxTv_SdtPedido_Disartcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("E_DisArtCod", GXutil.trim( GXutil.str( gxTv_SdtPedido_E_disartcod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtDsc", gxTv_SdtPedido_Disartdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtTip", GXutil.trim( GXutil.str( gxTv_SdtPedido_Disarttip, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtTipD", gxTv_SdtPedido_Disarttipd);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtMat", gxTv_SdtPedido_Disartmat);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtTr1", gxTv_SdtPedido_Disarttr1);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtPt1", GXutil.trim( GXutil.str( gxTv_SdtPedido_Disartpt1, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtTr2", gxTv_SdtPedido_Disarttr2);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtPt2", GXutil.trim( GXutil.str( gxTv_SdtPedido_Disartpt2, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtTr3", gxTv_SdtPedido_Disarttr3);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtPt3", GXutil.trim( GXutil.str( gxTv_SdtPedido_Disartpt3, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtUr1", gxTv_SdtPedido_Disartur1);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtPu1", GXutil.trim( GXutil.str( gxTv_SdtPedido_Disartpu1, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtUr2", gxTv_SdtPedido_Disartur2);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtPu2", GXutil.trim( GXutil.str( gxTv_SdtPedido_Disartpu2, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtUr3", gxTv_SdtPedido_Disartur3);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtPu3", GXutil.trim( GXutil.str( gxTv_SdtPedido_Disartpu3, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisColNom", gxTv_SdtPedido_Discolnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisColNum", GXutil.trim( GXutil.str( gxTv_SdtPedido_Discolnum, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisTipCol", GXutil.trim( GXutil.str( gxTv_SdtPedido_Distipcol, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisEst", GXutil.trim( GXutil.str( gxTv_SdtPedido_Disest, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisDes", gxTv_SdtPedido_Disdes);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtDsc2", gxTv_SdtPedido_Disartdsc2);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisPle2", gxTv_SdtPedido_Disple2);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtLar", gxTv_SdtPedido_Disartlar);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtSua", gxTv_SdtPedido_Disartsua);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtAca", gxTv_SdtPedido_Disartaca);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtEnc", gxTv_SdtPedido_Disartenc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtCor", gxTv_SdtPedido_Disartcor);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtPes", GXutil.trim( GXutil.str( gxTv_SdtPedido_Disartpes, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtRdt", GXutil.trim( GXutil.strNoRound( gxTv_SdtPedido_Disartrdt, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtUrg", GXutil.trim( GXutil.str( gxTv_SdtPedido_Disarturg, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisGraCru", GXutil.trim( GXutil.str( gxTv_SdtPedido_Disgracru, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtAnh", GXutil.trim( GXutil.str( gxTv_SdtPedido_Disartanh, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtAn1", GXutil.trim( GXutil.str( gxTv_SdtPedido_Disartan1, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtAcb", GXutil.trim( GXutil.str( gxTv_SdtPedido_Disartacb, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtAc2", GXutil.trim( GXutil.str( gxTv_SdtPedido_Disartac2, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisEncCom", GXutil.trim( GXutil.strNoRound( gxTv_SdtPedido_Disenccom, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisEncAnh", GXutil.trim( GXutil.strNoRound( gxTv_SdtPedido_Disencanh, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisNumCor", GXutil.trim( GXutil.str( gxTv_SdtPedido_Disnumcor, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisAncSal1", GXutil.trim( GXutil.str( gxTv_SdtPedido_Disancsal1, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisAncSal2", GXutil.trim( GXutil.str( gxTv_SdtPedido_Disancsal2, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisAncSal3", GXutil.trim( GXutil.str( gxTv_SdtPedido_Disancsal3, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisGraAca2", GXutil.trim( GXutil.str( gxTv_SdtPedido_Disgraaca2, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisGraCru2", GXutil.trim( GXutil.str( gxTv_SdtPedido_Disgracru2, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisGraAca", GXutil.trim( GXutil.str( gxTv_SdtPedido_Disgraaca, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisRdoA", GXutil.trim( GXutil.strNoRound( gxTv_SdtPedido_Disrdoa, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisRdoN", GXutil.trim( GXutil.strNoRound( gxTv_SdtPedido_Disrdon, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisObsGrm", gxTv_SdtPedido_Disobsgrm);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisObsAnc", gxTv_SdtPedido_Disobsanc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisItem5", gxTv_SdtPedido_Disitem5);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtPle", gxTv_SdtPedido_Disartple);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisUniMed", gxTv_SdtPedido_Disunimed);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Cod_Idtx", gxTv_SdtPedido_Cod_idtx);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Dsc_Idtx", gxTv_SdtPedido_Dsc_idtx);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisOrdComp", gxTv_SdtPedido_Disordcomp);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("RevenID", gxTv_SdtPedido_Revenid);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("RevenNm", gxTv_SdtPedido_Revennm);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MarcaId", gxTv_SdtPedido_Marcaid);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MarcaDsc", gxTv_SdtPedido_Marcadsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisIdtx2", gxTv_SdtPedido_Disidtx2);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisPriorid", GXutil.trim( GXutil.str( gxTv_SdtPedido_Dispriorid, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Nxt_modelo", gxTv_SdtPedido_Nxt_modelo);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CpteId", GXutil.trim( GXutil.str( gxTv_SdtPedido_Cpteid, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CpteDsc", gxTv_SdtPedido_Cptedsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Nxt_statio", gxTv_SdtPedido_Nxt_statio);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DesaID", GXutil.trim( GXutil.str( gxTv_SdtPedido_Desaid, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DesaDsc", gxTv_SdtPedido_Desadsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DptoID", GXutil.trim( GXutil.str( gxTv_SdtPedido_Dptoid, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DptoDsc", gxTv_SdtPedido_Dptodsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Nxt_artcli", gxTv_SdtPedido_Nxt_artcli);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisExp", gxTv_SdtPedido_Disexp);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtPedido_Norma != null )
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
         gxTv_SdtPedido_Norma.writexml(oWriter, "Norma", sNameSpace1, sIncludeState);
      }
      if ( gxTv_SdtPedido_Almacentejido != null )
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
         gxTv_SdtPedido_Almacentejido.writexml(oWriter, "AlmacenTejido", sNameSpace1, sIncludeState);
      }
      if ( gxTv_SdtPedido_Defecto != null )
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
         gxTv_SdtPedido_Defecto.writexml(oWriter, "Defecto", sNameSpace1, sIncludeState);
      }
      if ( gxTv_SdtPedido_Proceso != null )
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
         gxTv_SdtPedido_Proceso.writexml(oWriter, "Proceso", sNameSpace1, sIncludeState);
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", gxTv_SdtPedido_Mode);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtPedido_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprCod_Z", gxTv_SdtPedido_Emprcod_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprNom_Z", gxTv_SdtPedido_Emprnom_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PriCod_Z", gxTv_SdtPedido_Pricod_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisCod_Z", GXutil.trim( GXutil.str( gxTv_SdtPedido_Discod_Z, 8, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisTipDis_Z", gxTv_SdtPedido_Distipdis_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisEncCli_Z", gxTv_SdtPedido_Disenccli_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CliCod_Z", GXutil.trim( GXutil.str( gxTv_SdtPedido_Clicod_Z, 6, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CliNom_Z", gxTv_SdtPedido_Clinom_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisCliDes_Z", GXutil.trim( GXutil.str( gxTv_SdtPedido_Disclides_Z, 6, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CliNomDes_Z", gxTv_SdtPedido_Clinomdes_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("E_DisCliDes_Z", GXutil.trim( GXutil.str( gxTv_SdtPedido_E_disclides_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPedido_Disfec_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPedido_Disfec_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPedido_Disfec_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("DisFec_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPedido_Disfeccli_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPedido_Disfeccli_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPedido_Disfeccli_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("DisFecCli_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPedido_Disfecent_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPedido_Disfecent_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPedido_Disfecent_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("DisFecEnt_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisArtCod_Z", gxTv_SdtPedido_Disartcod_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("E_DisArtCod_Z", GXutil.trim( GXutil.str( gxTv_SdtPedido_E_disartcod_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisArtDsc_Z", gxTv_SdtPedido_Disartdsc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisArtTip_Z", GXutil.trim( GXutil.str( gxTv_SdtPedido_Disarttip_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisArtTipD_Z", gxTv_SdtPedido_Disarttipd_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisArtMat_Z", gxTv_SdtPedido_Disartmat_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisArtTr1_Z", gxTv_SdtPedido_Disarttr1_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisArtPt1_Z", GXutil.trim( GXutil.str( gxTv_SdtPedido_Disartpt1_Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisArtTr2_Z", gxTv_SdtPedido_Disarttr2_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisArtPt2_Z", GXutil.trim( GXutil.str( gxTv_SdtPedido_Disartpt2_Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisArtTr3_Z", gxTv_SdtPedido_Disarttr3_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisArtPt3_Z", GXutil.trim( GXutil.str( gxTv_SdtPedido_Disartpt3_Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisArtUr1_Z", gxTv_SdtPedido_Disartur1_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisArtPu1_Z", GXutil.trim( GXutil.str( gxTv_SdtPedido_Disartpu1_Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisArtUr2_Z", gxTv_SdtPedido_Disartur2_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisArtPu2_Z", GXutil.trim( GXutil.str( gxTv_SdtPedido_Disartpu2_Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisArtUr3_Z", gxTv_SdtPedido_Disartur3_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisArtPu3_Z", GXutil.trim( GXutil.str( gxTv_SdtPedido_Disartpu3_Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisColNom_Z", gxTv_SdtPedido_Discolnom_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisColNum_Z", GXutil.trim( GXutil.str( gxTv_SdtPedido_Discolnum_Z, 6, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisTipCol_Z", GXutil.trim( GXutil.str( gxTv_SdtPedido_Distipcol_Z, 2, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisEst_Z", GXutil.trim( GXutil.str( gxTv_SdtPedido_Disest_Z, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisDes_Z", gxTv_SdtPedido_Disdes_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisArtDsc2_Z", gxTv_SdtPedido_Disartdsc2_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisPle2_Z", gxTv_SdtPedido_Disple2_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisArtLar_Z", gxTv_SdtPedido_Disartlar_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisArtSua_Z", gxTv_SdtPedido_Disartsua_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisArtAca_Z", gxTv_SdtPedido_Disartaca_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisArtEnc_Z", gxTv_SdtPedido_Disartenc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisArtCor_Z", gxTv_SdtPedido_Disartcor_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisArtPes_Z", GXutil.trim( GXutil.str( gxTv_SdtPedido_Disartpes_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisArtRdt_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtPedido_Disartrdt_Z, 6, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisArtUrg_Z", GXutil.trim( GXutil.str( gxTv_SdtPedido_Disarturg_Z, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisGraCru_Z", GXutil.trim( GXutil.str( gxTv_SdtPedido_Disgracru_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisArtAnh_Z", GXutil.trim( GXutil.str( gxTv_SdtPedido_Disartanh_Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisArtAn1_Z", GXutil.trim( GXutil.str( gxTv_SdtPedido_Disartan1_Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisArtAcb_Z", GXutil.trim( GXutil.str( gxTv_SdtPedido_Disartacb_Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisArtAc2_Z", GXutil.trim( GXutil.str( gxTv_SdtPedido_Disartac2_Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisEncCom_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtPedido_Disenccom_Z, 6, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisEncAnh_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtPedido_Disencanh_Z, 6, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisNumCor_Z", GXutil.trim( GXutil.str( gxTv_SdtPedido_Disnumcor_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisAncSal1_Z", GXutil.trim( GXutil.str( gxTv_SdtPedido_Disancsal1_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisAncSal2_Z", GXutil.trim( GXutil.str( gxTv_SdtPedido_Disancsal2_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisAncSal3_Z", GXutil.trim( GXutil.str( gxTv_SdtPedido_Disancsal3_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisGraAca2_Z", GXutil.trim( GXutil.str( gxTv_SdtPedido_Disgraaca2_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisGraCru2_Z", GXutil.trim( GXutil.str( gxTv_SdtPedido_Disgracru2_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisGraAca_Z", GXutil.trim( GXutil.str( gxTv_SdtPedido_Disgraaca_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisRdoA_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtPedido_Disrdoa_Z, 6, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisRdoN_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtPedido_Disrdon_Z, 6, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisObsGrm_Z", gxTv_SdtPedido_Disobsgrm_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisObsAnc_Z", gxTv_SdtPedido_Disobsanc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisItem5_Z", gxTv_SdtPedido_Disitem5_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisArtPle_Z", gxTv_SdtPedido_Disartple_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisUniMed_Z", gxTv_SdtPedido_Disunimed_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Cod_Idtx_Z", gxTv_SdtPedido_Cod_idtx_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Dsc_Idtx_Z", gxTv_SdtPedido_Dsc_idtx_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisOrdComp_Z", gxTv_SdtPedido_Disordcomp_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("RevenID_Z", gxTv_SdtPedido_Revenid_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("RevenNm_Z", gxTv_SdtPedido_Revennm_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("MarcaId_Z", gxTv_SdtPedido_Marcaid_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("MarcaDsc_Z", gxTv_SdtPedido_Marcadsc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisIdtx2_Z", gxTv_SdtPedido_Disidtx2_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisPriorid_Z", GXutil.trim( GXutil.str( gxTv_SdtPedido_Dispriorid_Z, 2, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Nxt_modelo_Z", gxTv_SdtPedido_Nxt_modelo_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CpteId_Z", GXutil.trim( GXutil.str( gxTv_SdtPedido_Cpteid_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CpteDsc_Z", gxTv_SdtPedido_Cptedsc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Nxt_statio_Z", gxTv_SdtPedido_Nxt_statio_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DesaID_Z", GXutil.trim( GXutil.str( gxTv_SdtPedido_Desaid_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DesaDsc_Z", gxTv_SdtPedido_Desadsc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DptoID_Z", GXutil.trim( GXutil.str( gxTv_SdtPedido_Dptoid_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DptoDsc_Z", gxTv_SdtPedido_Dptodsc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Nxt_artcli_Z", gxTv_SdtPedido_Nxt_artcli_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisExp_Z", gxTv_SdtPedido_Disexp_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprNom_N", GXutil.trim( GXutil.str( gxTv_SdtPedido_Emprnom_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisTipDis_N", GXutil.trim( GXutil.str( gxTv_SdtPedido_Distipdis_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("E_DisCliDes_N", GXutil.trim( GXutil.str( gxTv_SdtPedido_E_disclides_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("E_DisArtCod_N", GXutil.trim( GXutil.str( gxTv_SdtPedido_E_disartcod_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisArtPu3_N", GXutil.trim( GXutil.str( gxTv_SdtPedido_Disartpu3_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisColNom_N", GXutil.trim( GXutil.str( gxTv_SdtPedido_Discolnom_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisColNum_N", GXutil.trim( GXutil.str( gxTv_SdtPedido_Discolnum_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisTipCol_N", GXutil.trim( GXutil.str( gxTv_SdtPedido_Distipcol_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Cod_Idtx_N", GXutil.trim( GXutil.str( gxTv_SdtPedido_Cod_idtx_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Dsc_Idtx_N", GXutil.trim( GXutil.str( gxTv_SdtPedido_Dsc_idtx_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("RevenID_N", GXutil.trim( GXutil.str( gxTv_SdtPedido_Revenid_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("RevenNm_N", GXutil.trim( GXutil.str( gxTv_SdtPedido_Revennm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("MarcaId_N", GXutil.trim( GXutil.str( gxTv_SdtPedido_Marcaid_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("MarcaDsc_N", GXutil.trim( GXutil.str( gxTv_SdtPedido_Marcadsc_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisIdtx2_N", GXutil.trim( GXutil.str( gxTv_SdtPedido_Disidtx2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CpteId_N", GXutil.trim( GXutil.str( gxTv_SdtPedido_Cpteid_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CpteDsc_N", GXutil.trim( GXutil.str( gxTv_SdtPedido_Cptedsc_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DesaID_N", GXutil.trim( GXutil.str( gxTv_SdtPedido_Desaid_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DesaDsc_N", GXutil.trim( GXutil.str( gxTv_SdtPedido_Desadsc_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DptoID_N", GXutil.trim( GXutil.str( gxTv_SdtPedido_Dptoid_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DptoDsc_N", GXutil.trim( GXutil.str( gxTv_SdtPedido_Dptodsc_N, 1, 0)));
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
      AddObjectProperty("EmprCod", gxTv_SdtPedido_Emprcod, false, includeNonInitialized);
      AddObjectProperty("EmprNom", gxTv_SdtPedido_Emprnom, false, includeNonInitialized);
      AddObjectProperty("EmprNom_N", gxTv_SdtPedido_Emprnom_N, false, includeNonInitialized);
      AddObjectProperty("PriCod", gxTv_SdtPedido_Pricod, false, includeNonInitialized);
      AddObjectProperty("DisCod", gxTv_SdtPedido_Discod, false, includeNonInitialized);
      AddObjectProperty("DisTipDis", gxTv_SdtPedido_Distipdis, false, includeNonInitialized);
      AddObjectProperty("DisTipDis_N", gxTv_SdtPedido_Distipdis_N, false, includeNonInitialized);
      AddObjectProperty("DisEncCli", gxTv_SdtPedido_Disenccli, false, includeNonInitialized);
      AddObjectProperty("CliCod", gxTv_SdtPedido_Clicod, false, includeNonInitialized);
      AddObjectProperty("CliNom", gxTv_SdtPedido_Clinom, false, includeNonInitialized);
      AddObjectProperty("DisCliDes", gxTv_SdtPedido_Disclides, false, includeNonInitialized);
      AddObjectProperty("CliNomDes", gxTv_SdtPedido_Clinomdes, false, includeNonInitialized);
      AddObjectProperty("E_DisCliDes", gxTv_SdtPedido_E_disclides, false, includeNonInitialized);
      AddObjectProperty("E_DisCliDes_N", gxTv_SdtPedido_E_disclides_N, false, includeNonInitialized);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPedido_Disfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPedido_Disfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPedido_Disfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("DisFec", sDateCnv, false, includeNonInitialized);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPedido_Disfeccli), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPedido_Disfeccli), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPedido_Disfeccli), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("DisFecCli", sDateCnv, false, includeNonInitialized);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPedido_Disfecent), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPedido_Disfecent), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPedido_Disfecent), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("DisFecEnt", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("DisArtCod", gxTv_SdtPedido_Disartcod, false, includeNonInitialized);
      AddObjectProperty("E_DisArtCod", gxTv_SdtPedido_E_disartcod, false, includeNonInitialized);
      AddObjectProperty("E_DisArtCod_N", gxTv_SdtPedido_E_disartcod_N, false, includeNonInitialized);
      AddObjectProperty("DisArtDsc", gxTv_SdtPedido_Disartdsc, false, includeNonInitialized);
      AddObjectProperty("DisArtTip", gxTv_SdtPedido_Disarttip, false, includeNonInitialized);
      AddObjectProperty("DisArtTipD", gxTv_SdtPedido_Disarttipd, false, includeNonInitialized);
      AddObjectProperty("DisArtMat", gxTv_SdtPedido_Disartmat, false, includeNonInitialized);
      AddObjectProperty("DisArtTr1", gxTv_SdtPedido_Disarttr1, false, includeNonInitialized);
      AddObjectProperty("DisArtPt1", gxTv_SdtPedido_Disartpt1, false, includeNonInitialized);
      AddObjectProperty("DisArtTr2", gxTv_SdtPedido_Disarttr2, false, includeNonInitialized);
      AddObjectProperty("DisArtPt2", gxTv_SdtPedido_Disartpt2, false, includeNonInitialized);
      AddObjectProperty("DisArtTr3", gxTv_SdtPedido_Disarttr3, false, includeNonInitialized);
      AddObjectProperty("DisArtPt3", gxTv_SdtPedido_Disartpt3, false, includeNonInitialized);
      AddObjectProperty("DisArtUr1", gxTv_SdtPedido_Disartur1, false, includeNonInitialized);
      AddObjectProperty("DisArtPu1", gxTv_SdtPedido_Disartpu1, false, includeNonInitialized);
      AddObjectProperty("DisArtUr2", gxTv_SdtPedido_Disartur2, false, includeNonInitialized);
      AddObjectProperty("DisArtPu2", gxTv_SdtPedido_Disartpu2, false, includeNonInitialized);
      AddObjectProperty("DisArtUr3", gxTv_SdtPedido_Disartur3, false, includeNonInitialized);
      AddObjectProperty("DisArtPu3", gxTv_SdtPedido_Disartpu3, false, includeNonInitialized);
      AddObjectProperty("DisArtPu3_N", gxTv_SdtPedido_Disartpu3_N, false, includeNonInitialized);
      AddObjectProperty("DisColNom", gxTv_SdtPedido_Discolnom, false, includeNonInitialized);
      AddObjectProperty("DisColNom_N", gxTv_SdtPedido_Discolnom_N, false, includeNonInitialized);
      AddObjectProperty("DisColNum", gxTv_SdtPedido_Discolnum, false, includeNonInitialized);
      AddObjectProperty("DisColNum_N", gxTv_SdtPedido_Discolnum_N, false, includeNonInitialized);
      AddObjectProperty("DisTipCol", gxTv_SdtPedido_Distipcol, false, includeNonInitialized);
      AddObjectProperty("DisTipCol_N", gxTv_SdtPedido_Distipcol_N, false, includeNonInitialized);
      AddObjectProperty("DisEst", gxTv_SdtPedido_Disest, false, includeNonInitialized);
      AddObjectProperty("DisDes", gxTv_SdtPedido_Disdes, false, includeNonInitialized);
      AddObjectProperty("DisArtDsc2", gxTv_SdtPedido_Disartdsc2, false, includeNonInitialized);
      AddObjectProperty("DisPle2", gxTv_SdtPedido_Disple2, false, includeNonInitialized);
      AddObjectProperty("DisArtLar", gxTv_SdtPedido_Disartlar, false, includeNonInitialized);
      AddObjectProperty("DisArtSua", gxTv_SdtPedido_Disartsua, false, includeNonInitialized);
      AddObjectProperty("DisArtAca", gxTv_SdtPedido_Disartaca, false, includeNonInitialized);
      AddObjectProperty("DisArtEnc", gxTv_SdtPedido_Disartenc, false, includeNonInitialized);
      AddObjectProperty("DisArtCor", gxTv_SdtPedido_Disartcor, false, includeNonInitialized);
      AddObjectProperty("DisArtPes", gxTv_SdtPedido_Disartpes, false, includeNonInitialized);
      AddObjectProperty("DisArtRdt", gxTv_SdtPedido_Disartrdt, false, includeNonInitialized);
      AddObjectProperty("DisArtUrg", gxTv_SdtPedido_Disarturg, false, includeNonInitialized);
      AddObjectProperty("DisGraCru", gxTv_SdtPedido_Disgracru, false, includeNonInitialized);
      AddObjectProperty("DisArtAnh", gxTv_SdtPedido_Disartanh, false, includeNonInitialized);
      AddObjectProperty("DisArtAn1", gxTv_SdtPedido_Disartan1, false, includeNonInitialized);
      AddObjectProperty("DisArtAcb", gxTv_SdtPedido_Disartacb, false, includeNonInitialized);
      AddObjectProperty("DisArtAc2", gxTv_SdtPedido_Disartac2, false, includeNonInitialized);
      AddObjectProperty("DisEncCom", gxTv_SdtPedido_Disenccom, false, includeNonInitialized);
      AddObjectProperty("DisEncAnh", gxTv_SdtPedido_Disencanh, false, includeNonInitialized);
      AddObjectProperty("DisNumCor", gxTv_SdtPedido_Disnumcor, false, includeNonInitialized);
      AddObjectProperty("DisAncSal1", gxTv_SdtPedido_Disancsal1, false, includeNonInitialized);
      AddObjectProperty("DisAncSal2", gxTv_SdtPedido_Disancsal2, false, includeNonInitialized);
      AddObjectProperty("DisAncSal3", gxTv_SdtPedido_Disancsal3, false, includeNonInitialized);
      AddObjectProperty("DisGraAca2", gxTv_SdtPedido_Disgraaca2, false, includeNonInitialized);
      AddObjectProperty("DisGraCru2", gxTv_SdtPedido_Disgracru2, false, includeNonInitialized);
      AddObjectProperty("DisGraAca", gxTv_SdtPedido_Disgraaca, false, includeNonInitialized);
      AddObjectProperty("DisRdoA", gxTv_SdtPedido_Disrdoa, false, includeNonInitialized);
      AddObjectProperty("DisRdoN", gxTv_SdtPedido_Disrdon, false, includeNonInitialized);
      AddObjectProperty("DisObsGrm", gxTv_SdtPedido_Disobsgrm, false, includeNonInitialized);
      AddObjectProperty("DisObsAnc", gxTv_SdtPedido_Disobsanc, false, includeNonInitialized);
      AddObjectProperty("DisItem5", gxTv_SdtPedido_Disitem5, false, includeNonInitialized);
      AddObjectProperty("DisArtPle", gxTv_SdtPedido_Disartple, false, includeNonInitialized);
      AddObjectProperty("DisUniMed", gxTv_SdtPedido_Disunimed, false, includeNonInitialized);
      AddObjectProperty("Cod_Idtx", gxTv_SdtPedido_Cod_idtx, false, includeNonInitialized);
      AddObjectProperty("Cod_Idtx_N", gxTv_SdtPedido_Cod_idtx_N, false, includeNonInitialized);
      AddObjectProperty("Dsc_Idtx", gxTv_SdtPedido_Dsc_idtx, false, includeNonInitialized);
      AddObjectProperty("Dsc_Idtx_N", gxTv_SdtPedido_Dsc_idtx_N, false, includeNonInitialized);
      AddObjectProperty("DisOrdComp", gxTv_SdtPedido_Disordcomp, false, includeNonInitialized);
      AddObjectProperty("RevenID", gxTv_SdtPedido_Revenid, false, includeNonInitialized);
      AddObjectProperty("RevenID_N", gxTv_SdtPedido_Revenid_N, false, includeNonInitialized);
      AddObjectProperty("RevenNm", gxTv_SdtPedido_Revennm, false, includeNonInitialized);
      AddObjectProperty("RevenNm_N", gxTv_SdtPedido_Revennm_N, false, includeNonInitialized);
      AddObjectProperty("MarcaId", gxTv_SdtPedido_Marcaid, false, includeNonInitialized);
      AddObjectProperty("MarcaId_N", gxTv_SdtPedido_Marcaid_N, false, includeNonInitialized);
      AddObjectProperty("MarcaDsc", gxTv_SdtPedido_Marcadsc, false, includeNonInitialized);
      AddObjectProperty("MarcaDsc_N", gxTv_SdtPedido_Marcadsc_N, false, includeNonInitialized);
      AddObjectProperty("DisIdtx2", gxTv_SdtPedido_Disidtx2, false, includeNonInitialized);
      AddObjectProperty("DisIdtx2_N", gxTv_SdtPedido_Disidtx2_N, false, includeNonInitialized);
      AddObjectProperty("DisPriorid", gxTv_SdtPedido_Dispriorid, false, includeNonInitialized);
      AddObjectProperty("Nxt_modelo", gxTv_SdtPedido_Nxt_modelo, false, includeNonInitialized);
      AddObjectProperty("CpteId", gxTv_SdtPedido_Cpteid, false, includeNonInitialized);
      AddObjectProperty("CpteId_N", gxTv_SdtPedido_Cpteid_N, false, includeNonInitialized);
      AddObjectProperty("CpteDsc", gxTv_SdtPedido_Cptedsc, false, includeNonInitialized);
      AddObjectProperty("CpteDsc_N", gxTv_SdtPedido_Cptedsc_N, false, includeNonInitialized);
      AddObjectProperty("Nxt_statio", gxTv_SdtPedido_Nxt_statio, false, includeNonInitialized);
      AddObjectProperty("DesaID", gxTv_SdtPedido_Desaid, false, includeNonInitialized);
      AddObjectProperty("DesaID_N", gxTv_SdtPedido_Desaid_N, false, includeNonInitialized);
      AddObjectProperty("DesaDsc", gxTv_SdtPedido_Desadsc, false, includeNonInitialized);
      AddObjectProperty("DesaDsc_N", gxTv_SdtPedido_Desadsc_N, false, includeNonInitialized);
      AddObjectProperty("DptoID", gxTv_SdtPedido_Dptoid, false, includeNonInitialized);
      AddObjectProperty("DptoID_N", gxTv_SdtPedido_Dptoid_N, false, includeNonInitialized);
      AddObjectProperty("DptoDsc", gxTv_SdtPedido_Dptodsc, false, includeNonInitialized);
      AddObjectProperty("DptoDsc_N", gxTv_SdtPedido_Dptodsc_N, false, includeNonInitialized);
      AddObjectProperty("Nxt_artcli", gxTv_SdtPedido_Nxt_artcli, false, includeNonInitialized);
      AddObjectProperty("DisExp", gxTv_SdtPedido_Disexp, false, includeNonInitialized);
      if ( gxTv_SdtPedido_Norma != null )
      {
         AddObjectProperty("Norma", gxTv_SdtPedido_Norma, includeState, includeNonInitialized);
      }
      if ( gxTv_SdtPedido_Almacentejido != null )
      {
         AddObjectProperty("AlmacenTejido", gxTv_SdtPedido_Almacentejido, includeState, includeNonInitialized);
      }
      if ( gxTv_SdtPedido_Defecto != null )
      {
         AddObjectProperty("Defecto", gxTv_SdtPedido_Defecto, includeState, includeNonInitialized);
      }
      if ( gxTv_SdtPedido_Proceso != null )
      {
         AddObjectProperty("Proceso", gxTv_SdtPedido_Proceso, includeState, includeNonInitialized);
      }
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtPedido_Mode, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_SdtPedido_Initialized, false, includeNonInitialized);
         AddObjectProperty("EmprCod_Z", gxTv_SdtPedido_Emprcod_Z, false, includeNonInitialized);
         AddObjectProperty("EmprNom_Z", gxTv_SdtPedido_Emprnom_Z, false, includeNonInitialized);
         AddObjectProperty("PriCod_Z", gxTv_SdtPedido_Pricod_Z, false, includeNonInitialized);
         AddObjectProperty("DisCod_Z", gxTv_SdtPedido_Discod_Z, false, includeNonInitialized);
         AddObjectProperty("DisTipDis_Z", gxTv_SdtPedido_Distipdis_Z, false, includeNonInitialized);
         AddObjectProperty("DisEncCli_Z", gxTv_SdtPedido_Disenccli_Z, false, includeNonInitialized);
         AddObjectProperty("CliCod_Z", gxTv_SdtPedido_Clicod_Z, false, includeNonInitialized);
         AddObjectProperty("CliNom_Z", gxTv_SdtPedido_Clinom_Z, false, includeNonInitialized);
         AddObjectProperty("DisCliDes_Z", gxTv_SdtPedido_Disclides_Z, false, includeNonInitialized);
         AddObjectProperty("CliNomDes_Z", gxTv_SdtPedido_Clinomdes_Z, false, includeNonInitialized);
         AddObjectProperty("E_DisCliDes_Z", gxTv_SdtPedido_E_disclides_Z, false, includeNonInitialized);
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPedido_Disfec_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPedido_Disfec_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPedido_Disfec_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("DisFec_Z", sDateCnv, false, includeNonInitialized);
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPedido_Disfeccli_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPedido_Disfeccli_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPedido_Disfeccli_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("DisFecCli_Z", sDateCnv, false, includeNonInitialized);
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPedido_Disfecent_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPedido_Disfecent_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPedido_Disfecent_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("DisFecEnt_Z", sDateCnv, false, includeNonInitialized);
         AddObjectProperty("DisArtCod_Z", gxTv_SdtPedido_Disartcod_Z, false, includeNonInitialized);
         AddObjectProperty("E_DisArtCod_Z", gxTv_SdtPedido_E_disartcod_Z, false, includeNonInitialized);
         AddObjectProperty("DisArtDsc_Z", gxTv_SdtPedido_Disartdsc_Z, false, includeNonInitialized);
         AddObjectProperty("DisArtTip_Z", gxTv_SdtPedido_Disarttip_Z, false, includeNonInitialized);
         AddObjectProperty("DisArtTipD_Z", gxTv_SdtPedido_Disarttipd_Z, false, includeNonInitialized);
         AddObjectProperty("DisArtMat_Z", gxTv_SdtPedido_Disartmat_Z, false, includeNonInitialized);
         AddObjectProperty("DisArtTr1_Z", gxTv_SdtPedido_Disarttr1_Z, false, includeNonInitialized);
         AddObjectProperty("DisArtPt1_Z", gxTv_SdtPedido_Disartpt1_Z, false, includeNonInitialized);
         AddObjectProperty("DisArtTr2_Z", gxTv_SdtPedido_Disarttr2_Z, false, includeNonInitialized);
         AddObjectProperty("DisArtPt2_Z", gxTv_SdtPedido_Disartpt2_Z, false, includeNonInitialized);
         AddObjectProperty("DisArtTr3_Z", gxTv_SdtPedido_Disarttr3_Z, false, includeNonInitialized);
         AddObjectProperty("DisArtPt3_Z", gxTv_SdtPedido_Disartpt3_Z, false, includeNonInitialized);
         AddObjectProperty("DisArtUr1_Z", gxTv_SdtPedido_Disartur1_Z, false, includeNonInitialized);
         AddObjectProperty("DisArtPu1_Z", gxTv_SdtPedido_Disartpu1_Z, false, includeNonInitialized);
         AddObjectProperty("DisArtUr2_Z", gxTv_SdtPedido_Disartur2_Z, false, includeNonInitialized);
         AddObjectProperty("DisArtPu2_Z", gxTv_SdtPedido_Disartpu2_Z, false, includeNonInitialized);
         AddObjectProperty("DisArtUr3_Z", gxTv_SdtPedido_Disartur3_Z, false, includeNonInitialized);
         AddObjectProperty("DisArtPu3_Z", gxTv_SdtPedido_Disartpu3_Z, false, includeNonInitialized);
         AddObjectProperty("DisColNom_Z", gxTv_SdtPedido_Discolnom_Z, false, includeNonInitialized);
         AddObjectProperty("DisColNum_Z", gxTv_SdtPedido_Discolnum_Z, false, includeNonInitialized);
         AddObjectProperty("DisTipCol_Z", gxTv_SdtPedido_Distipcol_Z, false, includeNonInitialized);
         AddObjectProperty("DisEst_Z", gxTv_SdtPedido_Disest_Z, false, includeNonInitialized);
         AddObjectProperty("DisDes_Z", gxTv_SdtPedido_Disdes_Z, false, includeNonInitialized);
         AddObjectProperty("DisArtDsc2_Z", gxTv_SdtPedido_Disartdsc2_Z, false, includeNonInitialized);
         AddObjectProperty("DisPle2_Z", gxTv_SdtPedido_Disple2_Z, false, includeNonInitialized);
         AddObjectProperty("DisArtLar_Z", gxTv_SdtPedido_Disartlar_Z, false, includeNonInitialized);
         AddObjectProperty("DisArtSua_Z", gxTv_SdtPedido_Disartsua_Z, false, includeNonInitialized);
         AddObjectProperty("DisArtAca_Z", gxTv_SdtPedido_Disartaca_Z, false, includeNonInitialized);
         AddObjectProperty("DisArtEnc_Z", gxTv_SdtPedido_Disartenc_Z, false, includeNonInitialized);
         AddObjectProperty("DisArtCor_Z", gxTv_SdtPedido_Disartcor_Z, false, includeNonInitialized);
         AddObjectProperty("DisArtPes_Z", gxTv_SdtPedido_Disartpes_Z, false, includeNonInitialized);
         AddObjectProperty("DisArtRdt_Z", gxTv_SdtPedido_Disartrdt_Z, false, includeNonInitialized);
         AddObjectProperty("DisArtUrg_Z", gxTv_SdtPedido_Disarturg_Z, false, includeNonInitialized);
         AddObjectProperty("DisGraCru_Z", gxTv_SdtPedido_Disgracru_Z, false, includeNonInitialized);
         AddObjectProperty("DisArtAnh_Z", gxTv_SdtPedido_Disartanh_Z, false, includeNonInitialized);
         AddObjectProperty("DisArtAn1_Z", gxTv_SdtPedido_Disartan1_Z, false, includeNonInitialized);
         AddObjectProperty("DisArtAcb_Z", gxTv_SdtPedido_Disartacb_Z, false, includeNonInitialized);
         AddObjectProperty("DisArtAc2_Z", gxTv_SdtPedido_Disartac2_Z, false, includeNonInitialized);
         AddObjectProperty("DisEncCom_Z", gxTv_SdtPedido_Disenccom_Z, false, includeNonInitialized);
         AddObjectProperty("DisEncAnh_Z", gxTv_SdtPedido_Disencanh_Z, false, includeNonInitialized);
         AddObjectProperty("DisNumCor_Z", gxTv_SdtPedido_Disnumcor_Z, false, includeNonInitialized);
         AddObjectProperty("DisAncSal1_Z", gxTv_SdtPedido_Disancsal1_Z, false, includeNonInitialized);
         AddObjectProperty("DisAncSal2_Z", gxTv_SdtPedido_Disancsal2_Z, false, includeNonInitialized);
         AddObjectProperty("DisAncSal3_Z", gxTv_SdtPedido_Disancsal3_Z, false, includeNonInitialized);
         AddObjectProperty("DisGraAca2_Z", gxTv_SdtPedido_Disgraaca2_Z, false, includeNonInitialized);
         AddObjectProperty("DisGraCru2_Z", gxTv_SdtPedido_Disgracru2_Z, false, includeNonInitialized);
         AddObjectProperty("DisGraAca_Z", gxTv_SdtPedido_Disgraaca_Z, false, includeNonInitialized);
         AddObjectProperty("DisRdoA_Z", gxTv_SdtPedido_Disrdoa_Z, false, includeNonInitialized);
         AddObjectProperty("DisRdoN_Z", gxTv_SdtPedido_Disrdon_Z, false, includeNonInitialized);
         AddObjectProperty("DisObsGrm_Z", gxTv_SdtPedido_Disobsgrm_Z, false, includeNonInitialized);
         AddObjectProperty("DisObsAnc_Z", gxTv_SdtPedido_Disobsanc_Z, false, includeNonInitialized);
         AddObjectProperty("DisItem5_Z", gxTv_SdtPedido_Disitem5_Z, false, includeNonInitialized);
         AddObjectProperty("DisArtPle_Z", gxTv_SdtPedido_Disartple_Z, false, includeNonInitialized);
         AddObjectProperty("DisUniMed_Z", gxTv_SdtPedido_Disunimed_Z, false, includeNonInitialized);
         AddObjectProperty("Cod_Idtx_Z", gxTv_SdtPedido_Cod_idtx_Z, false, includeNonInitialized);
         AddObjectProperty("Dsc_Idtx_Z", gxTv_SdtPedido_Dsc_idtx_Z, false, includeNonInitialized);
         AddObjectProperty("DisOrdComp_Z", gxTv_SdtPedido_Disordcomp_Z, false, includeNonInitialized);
         AddObjectProperty("RevenID_Z", gxTv_SdtPedido_Revenid_Z, false, includeNonInitialized);
         AddObjectProperty("RevenNm_Z", gxTv_SdtPedido_Revennm_Z, false, includeNonInitialized);
         AddObjectProperty("MarcaId_Z", gxTv_SdtPedido_Marcaid_Z, false, includeNonInitialized);
         AddObjectProperty("MarcaDsc_Z", gxTv_SdtPedido_Marcadsc_Z, false, includeNonInitialized);
         AddObjectProperty("DisIdtx2_Z", gxTv_SdtPedido_Disidtx2_Z, false, includeNonInitialized);
         AddObjectProperty("DisPriorid_Z", gxTv_SdtPedido_Dispriorid_Z, false, includeNonInitialized);
         AddObjectProperty("Nxt_modelo_Z", gxTv_SdtPedido_Nxt_modelo_Z, false, includeNonInitialized);
         AddObjectProperty("CpteId_Z", gxTv_SdtPedido_Cpteid_Z, false, includeNonInitialized);
         AddObjectProperty("CpteDsc_Z", gxTv_SdtPedido_Cptedsc_Z, false, includeNonInitialized);
         AddObjectProperty("Nxt_statio_Z", gxTv_SdtPedido_Nxt_statio_Z, false, includeNonInitialized);
         AddObjectProperty("DesaID_Z", gxTv_SdtPedido_Desaid_Z, false, includeNonInitialized);
         AddObjectProperty("DesaDsc_Z", gxTv_SdtPedido_Desadsc_Z, false, includeNonInitialized);
         AddObjectProperty("DptoID_Z", gxTv_SdtPedido_Dptoid_Z, false, includeNonInitialized);
         AddObjectProperty("DptoDsc_Z", gxTv_SdtPedido_Dptodsc_Z, false, includeNonInitialized);
         AddObjectProperty("Nxt_artcli_Z", gxTv_SdtPedido_Nxt_artcli_Z, false, includeNonInitialized);
         AddObjectProperty("DisExp_Z", gxTv_SdtPedido_Disexp_Z, false, includeNonInitialized);
         AddObjectProperty("EmprNom_N", gxTv_SdtPedido_Emprnom_N, false, includeNonInitialized);
         AddObjectProperty("DisTipDis_N", gxTv_SdtPedido_Distipdis_N, false, includeNonInitialized);
         AddObjectProperty("E_DisCliDes_N", gxTv_SdtPedido_E_disclides_N, false, includeNonInitialized);
         AddObjectProperty("E_DisArtCod_N", gxTv_SdtPedido_E_disartcod_N, false, includeNonInitialized);
         AddObjectProperty("DisArtPu3_N", gxTv_SdtPedido_Disartpu3_N, false, includeNonInitialized);
         AddObjectProperty("DisColNom_N", gxTv_SdtPedido_Discolnom_N, false, includeNonInitialized);
         AddObjectProperty("DisColNum_N", gxTv_SdtPedido_Discolnum_N, false, includeNonInitialized);
         AddObjectProperty("DisTipCol_N", gxTv_SdtPedido_Distipcol_N, false, includeNonInitialized);
         AddObjectProperty("Cod_Idtx_N", gxTv_SdtPedido_Cod_idtx_N, false, includeNonInitialized);
         AddObjectProperty("Dsc_Idtx_N", gxTv_SdtPedido_Dsc_idtx_N, false, includeNonInitialized);
         AddObjectProperty("RevenID_N", gxTv_SdtPedido_Revenid_N, false, includeNonInitialized);
         AddObjectProperty("RevenNm_N", gxTv_SdtPedido_Revennm_N, false, includeNonInitialized);
         AddObjectProperty("MarcaId_N", gxTv_SdtPedido_Marcaid_N, false, includeNonInitialized);
         AddObjectProperty("MarcaDsc_N", gxTv_SdtPedido_Marcadsc_N, false, includeNonInitialized);
         AddObjectProperty("DisIdtx2_N", gxTv_SdtPedido_Disidtx2_N, false, includeNonInitialized);
         AddObjectProperty("CpteId_N", gxTv_SdtPedido_Cpteid_N, false, includeNonInitialized);
         AddObjectProperty("CpteDsc_N", gxTv_SdtPedido_Cptedsc_N, false, includeNonInitialized);
         AddObjectProperty("DesaID_N", gxTv_SdtPedido_Desaid_N, false, includeNonInitialized);
         AddObjectProperty("DesaDsc_N", gxTv_SdtPedido_Desadsc_N, false, includeNonInitialized);
         AddObjectProperty("DptoID_N", gxTv_SdtPedido_Dptoid_N, false, includeNonInitialized);
         AddObjectProperty("DptoDsc_N", gxTv_SdtPedido_Dptodsc_N, false, includeNonInitialized);
      }
   }

   public void updateDirties( app.pedidosclientesindetalle.SdtPedido sdt )
   {
      if ( sdt.IsDirty("EmprCod") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Emprcod = sdt.getgxTv_SdtPedido_Emprcod() ;
      }
      if ( sdt.IsDirty("EmprNom") )
      {
         gxTv_SdtPedido_Emprnom_N = sdt.getgxTv_SdtPedido_Emprnom_N() ;
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Emprnom = sdt.getgxTv_SdtPedido_Emprnom() ;
      }
      if ( sdt.IsDirty("PriCod") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Pricod = sdt.getgxTv_SdtPedido_Pricod() ;
      }
      if ( sdt.IsDirty("DisCod") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Discod = sdt.getgxTv_SdtPedido_Discod() ;
      }
      if ( sdt.IsDirty("DisTipDis") )
      {
         gxTv_SdtPedido_Distipdis_N = sdt.getgxTv_SdtPedido_Distipdis_N() ;
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Distipdis = sdt.getgxTv_SdtPedido_Distipdis() ;
      }
      if ( sdt.IsDirty("DisEncCli") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disenccli = sdt.getgxTv_SdtPedido_Disenccli() ;
      }
      if ( sdt.IsDirty("CliCod") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Clicod = sdt.getgxTv_SdtPedido_Clicod() ;
      }
      if ( sdt.IsDirty("CliNom") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Clinom = sdt.getgxTv_SdtPedido_Clinom() ;
      }
      if ( sdt.IsDirty("DisCliDes") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disclides = sdt.getgxTv_SdtPedido_Disclides() ;
      }
      if ( sdt.IsDirty("CliNomDes") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Clinomdes = sdt.getgxTv_SdtPedido_Clinomdes() ;
      }
      if ( sdt.IsDirty("E_DisCliDes") )
      {
         gxTv_SdtPedido_E_disclides_N = sdt.getgxTv_SdtPedido_E_disclides_N() ;
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_E_disclides = sdt.getgxTv_SdtPedido_E_disclides() ;
      }
      if ( sdt.IsDirty("DisFec") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disfec = sdt.getgxTv_SdtPedido_Disfec() ;
      }
      if ( sdt.IsDirty("DisFecCli") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disfeccli = sdt.getgxTv_SdtPedido_Disfeccli() ;
      }
      if ( sdt.IsDirty("DisFecEnt") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disfecent = sdt.getgxTv_SdtPedido_Disfecent() ;
      }
      if ( sdt.IsDirty("DisArtCod") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disartcod = sdt.getgxTv_SdtPedido_Disartcod() ;
      }
      if ( sdt.IsDirty("E_DisArtCod") )
      {
         gxTv_SdtPedido_E_disartcod_N = sdt.getgxTv_SdtPedido_E_disartcod_N() ;
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_E_disartcod = sdt.getgxTv_SdtPedido_E_disartcod() ;
      }
      if ( sdt.IsDirty("DisArtDsc") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disartdsc = sdt.getgxTv_SdtPedido_Disartdsc() ;
      }
      if ( sdt.IsDirty("DisArtTip") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disarttip = sdt.getgxTv_SdtPedido_Disarttip() ;
      }
      if ( sdt.IsDirty("DisArtTipD") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disarttipd = sdt.getgxTv_SdtPedido_Disarttipd() ;
      }
      if ( sdt.IsDirty("DisArtMat") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disartmat = sdt.getgxTv_SdtPedido_Disartmat() ;
      }
      if ( sdt.IsDirty("DisArtTr1") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disarttr1 = sdt.getgxTv_SdtPedido_Disarttr1() ;
      }
      if ( sdt.IsDirty("DisArtPt1") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disartpt1 = sdt.getgxTv_SdtPedido_Disartpt1() ;
      }
      if ( sdt.IsDirty("DisArtTr2") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disarttr2 = sdt.getgxTv_SdtPedido_Disarttr2() ;
      }
      if ( sdt.IsDirty("DisArtPt2") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disartpt2 = sdt.getgxTv_SdtPedido_Disartpt2() ;
      }
      if ( sdt.IsDirty("DisArtTr3") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disarttr3 = sdt.getgxTv_SdtPedido_Disarttr3() ;
      }
      if ( sdt.IsDirty("DisArtPt3") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disartpt3 = sdt.getgxTv_SdtPedido_Disartpt3() ;
      }
      if ( sdt.IsDirty("DisArtUr1") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disartur1 = sdt.getgxTv_SdtPedido_Disartur1() ;
      }
      if ( sdt.IsDirty("DisArtPu1") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disartpu1 = sdt.getgxTv_SdtPedido_Disartpu1() ;
      }
      if ( sdt.IsDirty("DisArtUr2") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disartur2 = sdt.getgxTv_SdtPedido_Disartur2() ;
      }
      if ( sdt.IsDirty("DisArtPu2") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disartpu2 = sdt.getgxTv_SdtPedido_Disartpu2() ;
      }
      if ( sdt.IsDirty("DisArtUr3") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disartur3 = sdt.getgxTv_SdtPedido_Disartur3() ;
      }
      if ( sdt.IsDirty("DisArtPu3") )
      {
         gxTv_SdtPedido_Disartpu3_N = sdt.getgxTv_SdtPedido_Disartpu3_N() ;
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disartpu3 = sdt.getgxTv_SdtPedido_Disartpu3() ;
      }
      if ( sdt.IsDirty("DisColNom") )
      {
         gxTv_SdtPedido_Discolnom_N = sdt.getgxTv_SdtPedido_Discolnom_N() ;
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Discolnom = sdt.getgxTv_SdtPedido_Discolnom() ;
      }
      if ( sdt.IsDirty("DisColNum") )
      {
         gxTv_SdtPedido_Discolnum_N = sdt.getgxTv_SdtPedido_Discolnum_N() ;
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Discolnum = sdt.getgxTv_SdtPedido_Discolnum() ;
      }
      if ( sdt.IsDirty("DisTipCol") )
      {
         gxTv_SdtPedido_Distipcol_N = sdt.getgxTv_SdtPedido_Distipcol_N() ;
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Distipcol = sdt.getgxTv_SdtPedido_Distipcol() ;
      }
      if ( sdt.IsDirty("DisEst") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disest = sdt.getgxTv_SdtPedido_Disest() ;
      }
      if ( sdt.IsDirty("DisDes") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disdes = sdt.getgxTv_SdtPedido_Disdes() ;
      }
      if ( sdt.IsDirty("DisArtDsc2") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disartdsc2 = sdt.getgxTv_SdtPedido_Disartdsc2() ;
      }
      if ( sdt.IsDirty("DisPle2") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disple2 = sdt.getgxTv_SdtPedido_Disple2() ;
      }
      if ( sdt.IsDirty("DisArtLar") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disartlar = sdt.getgxTv_SdtPedido_Disartlar() ;
      }
      if ( sdt.IsDirty("DisArtSua") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disartsua = sdt.getgxTv_SdtPedido_Disartsua() ;
      }
      if ( sdt.IsDirty("DisArtAca") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disartaca = sdt.getgxTv_SdtPedido_Disartaca() ;
      }
      if ( sdt.IsDirty("DisArtEnc") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disartenc = sdt.getgxTv_SdtPedido_Disartenc() ;
      }
      if ( sdt.IsDirty("DisArtCor") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disartcor = sdt.getgxTv_SdtPedido_Disartcor() ;
      }
      if ( sdt.IsDirty("DisArtPes") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disartpes = sdt.getgxTv_SdtPedido_Disartpes() ;
      }
      if ( sdt.IsDirty("DisArtRdt") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disartrdt = sdt.getgxTv_SdtPedido_Disartrdt() ;
      }
      if ( sdt.IsDirty("DisArtUrg") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disarturg = sdt.getgxTv_SdtPedido_Disarturg() ;
      }
      if ( sdt.IsDirty("DisGraCru") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disgracru = sdt.getgxTv_SdtPedido_Disgracru() ;
      }
      if ( sdt.IsDirty("DisArtAnh") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disartanh = sdt.getgxTv_SdtPedido_Disartanh() ;
      }
      if ( sdt.IsDirty("DisArtAn1") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disartan1 = sdt.getgxTv_SdtPedido_Disartan1() ;
      }
      if ( sdt.IsDirty("DisArtAcb") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disartacb = sdt.getgxTv_SdtPedido_Disartacb() ;
      }
      if ( sdt.IsDirty("DisArtAc2") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disartac2 = sdt.getgxTv_SdtPedido_Disartac2() ;
      }
      if ( sdt.IsDirty("DisEncCom") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disenccom = sdt.getgxTv_SdtPedido_Disenccom() ;
      }
      if ( sdt.IsDirty("DisEncAnh") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disencanh = sdt.getgxTv_SdtPedido_Disencanh() ;
      }
      if ( sdt.IsDirty("DisNumCor") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disnumcor = sdt.getgxTv_SdtPedido_Disnumcor() ;
      }
      if ( sdt.IsDirty("DisAncSal1") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disancsal1 = sdt.getgxTv_SdtPedido_Disancsal1() ;
      }
      if ( sdt.IsDirty("DisAncSal2") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disancsal2 = sdt.getgxTv_SdtPedido_Disancsal2() ;
      }
      if ( sdt.IsDirty("DisAncSal3") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disancsal3 = sdt.getgxTv_SdtPedido_Disancsal3() ;
      }
      if ( sdt.IsDirty("DisGraAca2") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disgraaca2 = sdt.getgxTv_SdtPedido_Disgraaca2() ;
      }
      if ( sdt.IsDirty("DisGraCru2") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disgracru2 = sdt.getgxTv_SdtPedido_Disgracru2() ;
      }
      if ( sdt.IsDirty("DisGraAca") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disgraaca = sdt.getgxTv_SdtPedido_Disgraaca() ;
      }
      if ( sdt.IsDirty("DisRdoA") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disrdoa = sdt.getgxTv_SdtPedido_Disrdoa() ;
      }
      if ( sdt.IsDirty("DisRdoN") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disrdon = sdt.getgxTv_SdtPedido_Disrdon() ;
      }
      if ( sdt.IsDirty("DisObsGrm") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disobsgrm = sdt.getgxTv_SdtPedido_Disobsgrm() ;
      }
      if ( sdt.IsDirty("DisObsAnc") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disobsanc = sdt.getgxTv_SdtPedido_Disobsanc() ;
      }
      if ( sdt.IsDirty("DisItem5") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disitem5 = sdt.getgxTv_SdtPedido_Disitem5() ;
      }
      if ( sdt.IsDirty("DisArtPle") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disartple = sdt.getgxTv_SdtPedido_Disartple() ;
      }
      if ( sdt.IsDirty("DisUniMed") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disunimed = sdt.getgxTv_SdtPedido_Disunimed() ;
      }
      if ( sdt.IsDirty("Cod_Idtx") )
      {
         gxTv_SdtPedido_Cod_idtx_N = sdt.getgxTv_SdtPedido_Cod_idtx_N() ;
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Cod_idtx = sdt.getgxTv_SdtPedido_Cod_idtx() ;
      }
      if ( sdt.IsDirty("Dsc_Idtx") )
      {
         gxTv_SdtPedido_Dsc_idtx_N = sdt.getgxTv_SdtPedido_Dsc_idtx_N() ;
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Dsc_idtx = sdt.getgxTv_SdtPedido_Dsc_idtx() ;
      }
      if ( sdt.IsDirty("DisOrdComp") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disordcomp = sdt.getgxTv_SdtPedido_Disordcomp() ;
      }
      if ( sdt.IsDirty("RevenID") )
      {
         gxTv_SdtPedido_Revenid_N = sdt.getgxTv_SdtPedido_Revenid_N() ;
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Revenid = sdt.getgxTv_SdtPedido_Revenid() ;
      }
      if ( sdt.IsDirty("RevenNm") )
      {
         gxTv_SdtPedido_Revennm_N = sdt.getgxTv_SdtPedido_Revennm_N() ;
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Revennm = sdt.getgxTv_SdtPedido_Revennm() ;
      }
      if ( sdt.IsDirty("MarcaId") )
      {
         gxTv_SdtPedido_Marcaid_N = sdt.getgxTv_SdtPedido_Marcaid_N() ;
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Marcaid = sdt.getgxTv_SdtPedido_Marcaid() ;
      }
      if ( sdt.IsDirty("MarcaDsc") )
      {
         gxTv_SdtPedido_Marcadsc_N = sdt.getgxTv_SdtPedido_Marcadsc_N() ;
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Marcadsc = sdt.getgxTv_SdtPedido_Marcadsc() ;
      }
      if ( sdt.IsDirty("DisIdtx2") )
      {
         gxTv_SdtPedido_Disidtx2_N = sdt.getgxTv_SdtPedido_Disidtx2_N() ;
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disidtx2 = sdt.getgxTv_SdtPedido_Disidtx2() ;
      }
      if ( sdt.IsDirty("DisPriorid") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Dispriorid = sdt.getgxTv_SdtPedido_Dispriorid() ;
      }
      if ( sdt.IsDirty("Nxt_modelo") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Nxt_modelo = sdt.getgxTv_SdtPedido_Nxt_modelo() ;
      }
      if ( sdt.IsDirty("CpteId") )
      {
         gxTv_SdtPedido_Cpteid_N = sdt.getgxTv_SdtPedido_Cpteid_N() ;
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Cpteid = sdt.getgxTv_SdtPedido_Cpteid() ;
      }
      if ( sdt.IsDirty("CpteDsc") )
      {
         gxTv_SdtPedido_Cptedsc_N = sdt.getgxTv_SdtPedido_Cptedsc_N() ;
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Cptedsc = sdt.getgxTv_SdtPedido_Cptedsc() ;
      }
      if ( sdt.IsDirty("Nxt_statio") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Nxt_statio = sdt.getgxTv_SdtPedido_Nxt_statio() ;
      }
      if ( sdt.IsDirty("DesaID") )
      {
         gxTv_SdtPedido_Desaid_N = sdt.getgxTv_SdtPedido_Desaid_N() ;
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Desaid = sdt.getgxTv_SdtPedido_Desaid() ;
      }
      if ( sdt.IsDirty("DesaDsc") )
      {
         gxTv_SdtPedido_Desadsc_N = sdt.getgxTv_SdtPedido_Desadsc_N() ;
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Desadsc = sdt.getgxTv_SdtPedido_Desadsc() ;
      }
      if ( sdt.IsDirty("DptoID") )
      {
         gxTv_SdtPedido_Dptoid_N = sdt.getgxTv_SdtPedido_Dptoid_N() ;
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Dptoid = sdt.getgxTv_SdtPedido_Dptoid() ;
      }
      if ( sdt.IsDirty("DptoDsc") )
      {
         gxTv_SdtPedido_Dptodsc_N = sdt.getgxTv_SdtPedido_Dptodsc_N() ;
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Dptodsc = sdt.getgxTv_SdtPedido_Dptodsc() ;
      }
      if ( sdt.IsDirty("Nxt_artcli") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Nxt_artcli = sdt.getgxTv_SdtPedido_Nxt_artcli() ;
      }
      if ( sdt.IsDirty("DisExp") )
      {
         gxTv_SdtPedido_N = (byte)(0) ;
         gxTv_SdtPedido_Disexp = sdt.getgxTv_SdtPedido_Disexp() ;
      }
      if ( gxTv_SdtPedido_Norma != null )
      {
         GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Norma> newCollectionNorma = sdt.getgxTv_SdtPedido_Norma();
         app.pedidosclientesindetalle.SdtPedido_Norma currItemNorma;
         app.pedidosclientesindetalle.SdtPedido_Norma newItemNorma;
         short idx = 1;
         while ( idx <= newCollectionNorma.size() )
         {
            newItemNorma = (app.pedidosclientesindetalle.SdtPedido_Norma)((app.pedidosclientesindetalle.SdtPedido_Norma)newCollectionNorma.elementAt(-1+idx));
            currItemNorma = (app.pedidosclientesindetalle.SdtPedido_Norma)gxTv_SdtPedido_Norma.getByKey(newItemNorma.getgxTv_SdtPedido_Norma_Disnormid());
            if ( GXutil.strcmp(currItemNorma.getgxTv_SdtPedido_Norma_Mode(), "UPD") == 0 )
            {
               currItemNorma.updateDirties(newItemNorma);
               if ( GXutil.strcmp(newItemNorma.getgxTv_SdtPedido_Norma_Mode(), "DLT") == 0 )
               {
                  currItemNorma.setgxTv_SdtPedido_Norma_Mode( "DLT" );
               }
               currItemNorma.setgxTv_SdtPedido_Norma_Modified( (short)(1) );
            }
            else
            {
               gxTv_SdtPedido_Norma.add(newItemNorma, 0);
            }
            idx = (short)(idx+1) ;
         }
      }
      if ( gxTv_SdtPedido_Almacentejido != null )
      {
         GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_AlmacenTejido> newCollectionAlmacentejido = sdt.getgxTv_SdtPedido_Almacentejido();
         app.pedidosclientesindetalle.SdtPedido_AlmacenTejido currItemAlmacentejido;
         app.pedidosclientesindetalle.SdtPedido_AlmacenTejido newItemAlmacentejido;
         short idx = 1;
         while ( idx <= newCollectionAlmacentejido.size() )
         {
            newItemAlmacentejido = (app.pedidosclientesindetalle.SdtPedido_AlmacenTejido)((app.pedidosclientesindetalle.SdtPedido_AlmacenTejido)newCollectionAlmacentejido.elementAt(-1+idx));
            currItemAlmacentejido = (app.pedidosclientesindetalle.SdtPedido_AlmacenTejido)gxTv_SdtPedido_Almacentejido.getByKey(newItemAlmacentejido.getgxTv_SdtPedido_AlmacenTejido_Albreccod());
            if ( GXutil.strcmp(currItemAlmacentejido.getgxTv_SdtPedido_AlmacenTejido_Mode(), "UPD") == 0 )
            {
               currItemAlmacentejido.updateDirties(newItemAlmacentejido);
               if ( GXutil.strcmp(newItemAlmacentejido.getgxTv_SdtPedido_AlmacenTejido_Mode(), "DLT") == 0 )
               {
                  currItemAlmacentejido.setgxTv_SdtPedido_AlmacenTejido_Mode( "DLT" );
               }
               currItemAlmacentejido.setgxTv_SdtPedido_AlmacenTejido_Modified( (short)(1) );
            }
            else
            {
               gxTv_SdtPedido_Almacentejido.add(newItemAlmacentejido, 0);
            }
            idx = (short)(idx+1) ;
         }
      }
      if ( gxTv_SdtPedido_Defecto != null )
      {
         GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Defecto> newCollectionDefecto = sdt.getgxTv_SdtPedido_Defecto();
         app.pedidosclientesindetalle.SdtPedido_Defecto currItemDefecto;
         app.pedidosclientesindetalle.SdtPedido_Defecto newItemDefecto;
         short idx = 1;
         while ( idx <= newCollectionDefecto.size() )
         {
            newItemDefecto = (app.pedidosclientesindetalle.SdtPedido_Defecto)((app.pedidosclientesindetalle.SdtPedido_Defecto)newCollectionDefecto.elementAt(-1+idx));
            currItemDefecto = (app.pedidosclientesindetalle.SdtPedido_Defecto)gxTv_SdtPedido_Defecto.getByKey(newItemDefecto.getgxTv_SdtPedido_Defecto_Tipdefcod());
            if ( GXutil.strcmp(currItemDefecto.getgxTv_SdtPedido_Defecto_Mode(), "UPD") == 0 )
            {
               currItemDefecto.updateDirties(newItemDefecto);
               if ( GXutil.strcmp(newItemDefecto.getgxTv_SdtPedido_Defecto_Mode(), "DLT") == 0 )
               {
                  currItemDefecto.setgxTv_SdtPedido_Defecto_Mode( "DLT" );
               }
               currItemDefecto.setgxTv_SdtPedido_Defecto_Modified( (short)(1) );
            }
            else
            {
               gxTv_SdtPedido_Defecto.add(newItemDefecto, 0);
            }
            idx = (short)(idx+1) ;
         }
      }
      if ( gxTv_SdtPedido_Proceso != null )
      {
         GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Proceso> newCollectionProceso = sdt.getgxTv_SdtPedido_Proceso();
         app.pedidosclientesindetalle.SdtPedido_Proceso currItemProceso;
         app.pedidosclientesindetalle.SdtPedido_Proceso newItemProceso;
         short idx = 1;
         while ( idx <= newCollectionProceso.size() )
         {
            newItemProceso = (app.pedidosclientesindetalle.SdtPedido_Proceso)((app.pedidosclientesindetalle.SdtPedido_Proceso)newCollectionProceso.elementAt(-1+idx));
            currItemProceso = (app.pedidosclientesindetalle.SdtPedido_Proceso)gxTv_SdtPedido_Proceso.getByKey(newItemProceso.getgxTv_SdtPedido_Proceso_Procod());
            if ( GXutil.strcmp(currItemProceso.getgxTv_SdtPedido_Proceso_Mode(), "UPD") == 0 )
            {
               currItemProceso.updateDirties(newItemProceso);
               if ( GXutil.strcmp(newItemProceso.getgxTv_SdtPedido_Proceso_Mode(), "DLT") == 0 )
               {
                  currItemProceso.setgxTv_SdtPedido_Proceso_Mode( "DLT" );
               }
               currItemProceso.setgxTv_SdtPedido_Proceso_Modified( (short)(1) );
            }
            else
            {
               gxTv_SdtPedido_Proceso.add(newItemProceso, 0);
            }
            idx = (short)(idx+1) ;
         }
      }
   }

   public String getgxTv_SdtPedido_Emprcod( )
   {
      return gxTv_SdtPedido_Emprcod ;
   }

   public void setgxTv_SdtPedido_Emprcod( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      if ( GXutil.strcmp(gxTv_SdtPedido_Emprcod, value) != 0 )
      {
         gxTv_SdtPedido_Mode = "INS" ;
         this.setgxTv_SdtPedido_Emprcod_Z_SetNull( );
         this.setgxTv_SdtPedido_Emprnom_Z_SetNull( );
         this.setgxTv_SdtPedido_Pricod_Z_SetNull( );
         this.setgxTv_SdtPedido_Discod_Z_SetNull( );
         this.setgxTv_SdtPedido_Distipdis_Z_SetNull( );
         this.setgxTv_SdtPedido_Disenccli_Z_SetNull( );
         this.setgxTv_SdtPedido_Clicod_Z_SetNull( );
         this.setgxTv_SdtPedido_Clinom_Z_SetNull( );
         this.setgxTv_SdtPedido_Disclides_Z_SetNull( );
         this.setgxTv_SdtPedido_Clinomdes_Z_SetNull( );
         this.setgxTv_SdtPedido_E_disclides_Z_SetNull( );
         this.setgxTv_SdtPedido_Disfec_Z_SetNull( );
         this.setgxTv_SdtPedido_Disfeccli_Z_SetNull( );
         this.setgxTv_SdtPedido_Disfecent_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartcod_Z_SetNull( );
         this.setgxTv_SdtPedido_E_disartcod_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartdsc_Z_SetNull( );
         this.setgxTv_SdtPedido_Disarttip_Z_SetNull( );
         this.setgxTv_SdtPedido_Disarttipd_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartmat_Z_SetNull( );
         this.setgxTv_SdtPedido_Disarttr1_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartpt1_Z_SetNull( );
         this.setgxTv_SdtPedido_Disarttr2_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartpt2_Z_SetNull( );
         this.setgxTv_SdtPedido_Disarttr3_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartpt3_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartur1_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartpu1_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartur2_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartpu2_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartur3_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartpu3_Z_SetNull( );
         this.setgxTv_SdtPedido_Discolnom_Z_SetNull( );
         this.setgxTv_SdtPedido_Discolnum_Z_SetNull( );
         this.setgxTv_SdtPedido_Distipcol_Z_SetNull( );
         this.setgxTv_SdtPedido_Disest_Z_SetNull( );
         this.setgxTv_SdtPedido_Disdes_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartdsc2_Z_SetNull( );
         this.setgxTv_SdtPedido_Disple2_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartlar_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartsua_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartaca_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartenc_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartcor_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartpes_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartrdt_Z_SetNull( );
         this.setgxTv_SdtPedido_Disarturg_Z_SetNull( );
         this.setgxTv_SdtPedido_Disgracru_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartanh_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartan1_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartacb_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartac2_Z_SetNull( );
         this.setgxTv_SdtPedido_Disenccom_Z_SetNull( );
         this.setgxTv_SdtPedido_Disencanh_Z_SetNull( );
         this.setgxTv_SdtPedido_Disnumcor_Z_SetNull( );
         this.setgxTv_SdtPedido_Disancsal1_Z_SetNull( );
         this.setgxTv_SdtPedido_Disancsal2_Z_SetNull( );
         this.setgxTv_SdtPedido_Disancsal3_Z_SetNull( );
         this.setgxTv_SdtPedido_Disgraaca2_Z_SetNull( );
         this.setgxTv_SdtPedido_Disgracru2_Z_SetNull( );
         this.setgxTv_SdtPedido_Disgraaca_Z_SetNull( );
         this.setgxTv_SdtPedido_Disrdoa_Z_SetNull( );
         this.setgxTv_SdtPedido_Disrdon_Z_SetNull( );
         this.setgxTv_SdtPedido_Disobsgrm_Z_SetNull( );
         this.setgxTv_SdtPedido_Disobsanc_Z_SetNull( );
         this.setgxTv_SdtPedido_Disitem5_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartple_Z_SetNull( );
         this.setgxTv_SdtPedido_Disunimed_Z_SetNull( );
         this.setgxTv_SdtPedido_Cod_idtx_Z_SetNull( );
         this.setgxTv_SdtPedido_Dsc_idtx_Z_SetNull( );
         this.setgxTv_SdtPedido_Disordcomp_Z_SetNull( );
         this.setgxTv_SdtPedido_Revenid_Z_SetNull( );
         this.setgxTv_SdtPedido_Revennm_Z_SetNull( );
         this.setgxTv_SdtPedido_Marcaid_Z_SetNull( );
         this.setgxTv_SdtPedido_Marcadsc_Z_SetNull( );
         this.setgxTv_SdtPedido_Disidtx2_Z_SetNull( );
         this.setgxTv_SdtPedido_Dispriorid_Z_SetNull( );
         this.setgxTv_SdtPedido_Nxt_modelo_Z_SetNull( );
         this.setgxTv_SdtPedido_Cpteid_Z_SetNull( );
         this.setgxTv_SdtPedido_Cptedsc_Z_SetNull( );
         this.setgxTv_SdtPedido_Nxt_statio_Z_SetNull( );
         this.setgxTv_SdtPedido_Desaid_Z_SetNull( );
         this.setgxTv_SdtPedido_Desadsc_Z_SetNull( );
         this.setgxTv_SdtPedido_Dptoid_Z_SetNull( );
         this.setgxTv_SdtPedido_Dptodsc_Z_SetNull( );
         this.setgxTv_SdtPedido_Nxt_artcli_Z_SetNull( );
         this.setgxTv_SdtPedido_Disexp_Z_SetNull( );
         if ( gxTv_SdtPedido_Norma != null )
         {
            GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Norma> collectionNorma = gxTv_SdtPedido_Norma;
            app.pedidosclientesindetalle.SdtPedido_Norma currItemNorma;
            short idx = 1;
            while ( idx <= collectionNorma.size() )
            {
               currItemNorma = (app.pedidosclientesindetalle.SdtPedido_Norma)((app.pedidosclientesindetalle.SdtPedido_Norma)collectionNorma.elementAt(-1+idx));
               currItemNorma.setgxTv_SdtPedido_Norma_Mode( "INS" );
               currItemNorma.setgxTv_SdtPedido_Norma_Modified( (short)(1) );
               idx = (short)(idx+1) ;
            }
         }
         if ( gxTv_SdtPedido_Almacentejido != null )
         {
            GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_AlmacenTejido> collectionAlmacentejido = gxTv_SdtPedido_Almacentejido;
            app.pedidosclientesindetalle.SdtPedido_AlmacenTejido currItemAlmacentejido;
            short idx = 1;
            while ( idx <= collectionAlmacentejido.size() )
            {
               currItemAlmacentejido = (app.pedidosclientesindetalle.SdtPedido_AlmacenTejido)((app.pedidosclientesindetalle.SdtPedido_AlmacenTejido)collectionAlmacentejido.elementAt(-1+idx));
               currItemAlmacentejido.setgxTv_SdtPedido_AlmacenTejido_Mode( "INS" );
               currItemAlmacentejido.setgxTv_SdtPedido_AlmacenTejido_Modified( (short)(1) );
               idx = (short)(idx+1) ;
            }
         }
         if ( gxTv_SdtPedido_Defecto != null )
         {
            GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Defecto> collectionDefecto = gxTv_SdtPedido_Defecto;
            app.pedidosclientesindetalle.SdtPedido_Defecto currItemDefecto;
            short idx = 1;
            while ( idx <= collectionDefecto.size() )
            {
               currItemDefecto = (app.pedidosclientesindetalle.SdtPedido_Defecto)((app.pedidosclientesindetalle.SdtPedido_Defecto)collectionDefecto.elementAt(-1+idx));
               currItemDefecto.setgxTv_SdtPedido_Defecto_Mode( "INS" );
               currItemDefecto.setgxTv_SdtPedido_Defecto_Modified( (short)(1) );
               idx = (short)(idx+1) ;
            }
         }
         if ( gxTv_SdtPedido_Proceso != null )
         {
            GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Proceso> collectionProceso = gxTv_SdtPedido_Proceso;
            app.pedidosclientesindetalle.SdtPedido_Proceso currItemProceso;
            short idx = 1;
            while ( idx <= collectionProceso.size() )
            {
               currItemProceso = (app.pedidosclientesindetalle.SdtPedido_Proceso)((app.pedidosclientesindetalle.SdtPedido_Proceso)collectionProceso.elementAt(-1+idx));
               currItemProceso.setgxTv_SdtPedido_Proceso_Mode( "INS" );
               currItemProceso.setgxTv_SdtPedido_Proceso_Modified( (short)(1) );
               idx = (short)(idx+1) ;
            }
         }
      }
      SetDirty("Emprcod");
      gxTv_SdtPedido_Emprcod = value ;
   }

   public String getgxTv_SdtPedido_Emprnom( )
   {
      return gxTv_SdtPedido_Emprnom ;
   }

   public void setgxTv_SdtPedido_Emprnom( String value )
   {
      gxTv_SdtPedido_Emprnom_N = (byte)(0) ;
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Emprnom");
      gxTv_SdtPedido_Emprnom = value ;
   }

   public void setgxTv_SdtPedido_Emprnom_SetNull( )
   {
      gxTv_SdtPedido_Emprnom_N = (byte)(1) ;
      gxTv_SdtPedido_Emprnom = "" ;
      SetDirty("Emprnom");
   }

   public boolean getgxTv_SdtPedido_Emprnom_IsNull( )
   {
      return (gxTv_SdtPedido_Emprnom_N==1) ;
   }

   public String getgxTv_SdtPedido_Pricod( )
   {
      return gxTv_SdtPedido_Pricod ;
   }

   public void setgxTv_SdtPedido_Pricod( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Pricod");
      gxTv_SdtPedido_Pricod = value ;
   }

   public int getgxTv_SdtPedido_Discod( )
   {
      return gxTv_SdtPedido_Discod ;
   }

   public void setgxTv_SdtPedido_Discod( int value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      if ( gxTv_SdtPedido_Discod != value )
      {
         gxTv_SdtPedido_Mode = "INS" ;
         this.setgxTv_SdtPedido_Emprcod_Z_SetNull( );
         this.setgxTv_SdtPedido_Emprnom_Z_SetNull( );
         this.setgxTv_SdtPedido_Pricod_Z_SetNull( );
         this.setgxTv_SdtPedido_Discod_Z_SetNull( );
         this.setgxTv_SdtPedido_Distipdis_Z_SetNull( );
         this.setgxTv_SdtPedido_Disenccli_Z_SetNull( );
         this.setgxTv_SdtPedido_Clicod_Z_SetNull( );
         this.setgxTv_SdtPedido_Clinom_Z_SetNull( );
         this.setgxTv_SdtPedido_Disclides_Z_SetNull( );
         this.setgxTv_SdtPedido_Clinomdes_Z_SetNull( );
         this.setgxTv_SdtPedido_E_disclides_Z_SetNull( );
         this.setgxTv_SdtPedido_Disfec_Z_SetNull( );
         this.setgxTv_SdtPedido_Disfeccli_Z_SetNull( );
         this.setgxTv_SdtPedido_Disfecent_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartcod_Z_SetNull( );
         this.setgxTv_SdtPedido_E_disartcod_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartdsc_Z_SetNull( );
         this.setgxTv_SdtPedido_Disarttip_Z_SetNull( );
         this.setgxTv_SdtPedido_Disarttipd_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartmat_Z_SetNull( );
         this.setgxTv_SdtPedido_Disarttr1_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartpt1_Z_SetNull( );
         this.setgxTv_SdtPedido_Disarttr2_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartpt2_Z_SetNull( );
         this.setgxTv_SdtPedido_Disarttr3_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartpt3_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartur1_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartpu1_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartur2_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartpu2_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartur3_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartpu3_Z_SetNull( );
         this.setgxTv_SdtPedido_Discolnom_Z_SetNull( );
         this.setgxTv_SdtPedido_Discolnum_Z_SetNull( );
         this.setgxTv_SdtPedido_Distipcol_Z_SetNull( );
         this.setgxTv_SdtPedido_Disest_Z_SetNull( );
         this.setgxTv_SdtPedido_Disdes_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartdsc2_Z_SetNull( );
         this.setgxTv_SdtPedido_Disple2_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartlar_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartsua_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartaca_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartenc_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartcor_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartpes_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartrdt_Z_SetNull( );
         this.setgxTv_SdtPedido_Disarturg_Z_SetNull( );
         this.setgxTv_SdtPedido_Disgracru_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartanh_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartan1_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartacb_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartac2_Z_SetNull( );
         this.setgxTv_SdtPedido_Disenccom_Z_SetNull( );
         this.setgxTv_SdtPedido_Disencanh_Z_SetNull( );
         this.setgxTv_SdtPedido_Disnumcor_Z_SetNull( );
         this.setgxTv_SdtPedido_Disancsal1_Z_SetNull( );
         this.setgxTv_SdtPedido_Disancsal2_Z_SetNull( );
         this.setgxTv_SdtPedido_Disancsal3_Z_SetNull( );
         this.setgxTv_SdtPedido_Disgraaca2_Z_SetNull( );
         this.setgxTv_SdtPedido_Disgracru2_Z_SetNull( );
         this.setgxTv_SdtPedido_Disgraaca_Z_SetNull( );
         this.setgxTv_SdtPedido_Disrdoa_Z_SetNull( );
         this.setgxTv_SdtPedido_Disrdon_Z_SetNull( );
         this.setgxTv_SdtPedido_Disobsgrm_Z_SetNull( );
         this.setgxTv_SdtPedido_Disobsanc_Z_SetNull( );
         this.setgxTv_SdtPedido_Disitem5_Z_SetNull( );
         this.setgxTv_SdtPedido_Disartple_Z_SetNull( );
         this.setgxTv_SdtPedido_Disunimed_Z_SetNull( );
         this.setgxTv_SdtPedido_Cod_idtx_Z_SetNull( );
         this.setgxTv_SdtPedido_Dsc_idtx_Z_SetNull( );
         this.setgxTv_SdtPedido_Disordcomp_Z_SetNull( );
         this.setgxTv_SdtPedido_Revenid_Z_SetNull( );
         this.setgxTv_SdtPedido_Revennm_Z_SetNull( );
         this.setgxTv_SdtPedido_Marcaid_Z_SetNull( );
         this.setgxTv_SdtPedido_Marcadsc_Z_SetNull( );
         this.setgxTv_SdtPedido_Disidtx2_Z_SetNull( );
         this.setgxTv_SdtPedido_Dispriorid_Z_SetNull( );
         this.setgxTv_SdtPedido_Nxt_modelo_Z_SetNull( );
         this.setgxTv_SdtPedido_Cpteid_Z_SetNull( );
         this.setgxTv_SdtPedido_Cptedsc_Z_SetNull( );
         this.setgxTv_SdtPedido_Nxt_statio_Z_SetNull( );
         this.setgxTv_SdtPedido_Desaid_Z_SetNull( );
         this.setgxTv_SdtPedido_Desadsc_Z_SetNull( );
         this.setgxTv_SdtPedido_Dptoid_Z_SetNull( );
         this.setgxTv_SdtPedido_Dptodsc_Z_SetNull( );
         this.setgxTv_SdtPedido_Nxt_artcli_Z_SetNull( );
         this.setgxTv_SdtPedido_Disexp_Z_SetNull( );
         if ( gxTv_SdtPedido_Norma != null )
         {
            GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Norma> collectionNorma = gxTv_SdtPedido_Norma;
            app.pedidosclientesindetalle.SdtPedido_Norma currItemNorma;
            short idx = 1;
            while ( idx <= collectionNorma.size() )
            {
               currItemNorma = (app.pedidosclientesindetalle.SdtPedido_Norma)((app.pedidosclientesindetalle.SdtPedido_Norma)collectionNorma.elementAt(-1+idx));
               currItemNorma.setgxTv_SdtPedido_Norma_Mode( "INS" );
               currItemNorma.setgxTv_SdtPedido_Norma_Modified( (short)(1) );
               idx = (short)(idx+1) ;
            }
         }
         if ( gxTv_SdtPedido_Almacentejido != null )
         {
            GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_AlmacenTejido> collectionAlmacentejido = gxTv_SdtPedido_Almacentejido;
            app.pedidosclientesindetalle.SdtPedido_AlmacenTejido currItemAlmacentejido;
            short idx = 1;
            while ( idx <= collectionAlmacentejido.size() )
            {
               currItemAlmacentejido = (app.pedidosclientesindetalle.SdtPedido_AlmacenTejido)((app.pedidosclientesindetalle.SdtPedido_AlmacenTejido)collectionAlmacentejido.elementAt(-1+idx));
               currItemAlmacentejido.setgxTv_SdtPedido_AlmacenTejido_Mode( "INS" );
               currItemAlmacentejido.setgxTv_SdtPedido_AlmacenTejido_Modified( (short)(1) );
               idx = (short)(idx+1) ;
            }
         }
         if ( gxTv_SdtPedido_Defecto != null )
         {
            GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Defecto> collectionDefecto = gxTv_SdtPedido_Defecto;
            app.pedidosclientesindetalle.SdtPedido_Defecto currItemDefecto;
            short idx = 1;
            while ( idx <= collectionDefecto.size() )
            {
               currItemDefecto = (app.pedidosclientesindetalle.SdtPedido_Defecto)((app.pedidosclientesindetalle.SdtPedido_Defecto)collectionDefecto.elementAt(-1+idx));
               currItemDefecto.setgxTv_SdtPedido_Defecto_Mode( "INS" );
               currItemDefecto.setgxTv_SdtPedido_Defecto_Modified( (short)(1) );
               idx = (short)(idx+1) ;
            }
         }
         if ( gxTv_SdtPedido_Proceso != null )
         {
            GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Proceso> collectionProceso = gxTv_SdtPedido_Proceso;
            app.pedidosclientesindetalle.SdtPedido_Proceso currItemProceso;
            short idx = 1;
            while ( idx <= collectionProceso.size() )
            {
               currItemProceso = (app.pedidosclientesindetalle.SdtPedido_Proceso)((app.pedidosclientesindetalle.SdtPedido_Proceso)collectionProceso.elementAt(-1+idx));
               currItemProceso.setgxTv_SdtPedido_Proceso_Mode( "INS" );
               currItemProceso.setgxTv_SdtPedido_Proceso_Modified( (short)(1) );
               idx = (short)(idx+1) ;
            }
         }
      }
      SetDirty("Discod");
      gxTv_SdtPedido_Discod = value ;
   }

   public String getgxTv_SdtPedido_Distipdis( )
   {
      return gxTv_SdtPedido_Distipdis ;
   }

   public void setgxTv_SdtPedido_Distipdis( String value )
   {
      gxTv_SdtPedido_Distipdis_N = (byte)(0) ;
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Distipdis");
      gxTv_SdtPedido_Distipdis = value ;
   }

   public void setgxTv_SdtPedido_Distipdis_SetNull( )
   {
      gxTv_SdtPedido_Distipdis_N = (byte)(1) ;
      gxTv_SdtPedido_Distipdis = "" ;
      SetDirty("Distipdis");
   }

   public boolean getgxTv_SdtPedido_Distipdis_IsNull( )
   {
      return (gxTv_SdtPedido_Distipdis_N==1) ;
   }

   public String getgxTv_SdtPedido_Disenccli( )
   {
      return gxTv_SdtPedido_Disenccli ;
   }

   public void setgxTv_SdtPedido_Disenccli( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disenccli");
      gxTv_SdtPedido_Disenccli = value ;
   }

   public int getgxTv_SdtPedido_Clicod( )
   {
      return gxTv_SdtPedido_Clicod ;
   }

   public void setgxTv_SdtPedido_Clicod( int value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Clicod");
      gxTv_SdtPedido_Clicod = value ;
   }

   public String getgxTv_SdtPedido_Clinom( )
   {
      return gxTv_SdtPedido_Clinom ;
   }

   public void setgxTv_SdtPedido_Clinom( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Clinom");
      gxTv_SdtPedido_Clinom = value ;
   }

   public int getgxTv_SdtPedido_Disclides( )
   {
      return gxTv_SdtPedido_Disclides ;
   }

   public void setgxTv_SdtPedido_Disclides( int value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disclides");
      gxTv_SdtPedido_Disclides = value ;
   }

   public String getgxTv_SdtPedido_Clinomdes( )
   {
      return gxTv_SdtPedido_Clinomdes ;
   }

   public void setgxTv_SdtPedido_Clinomdes( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Clinomdes");
      gxTv_SdtPedido_Clinomdes = value ;
   }

   public void setgxTv_SdtPedido_Clinomdes_SetNull( )
   {
      gxTv_SdtPedido_Clinomdes = "" ;
      SetDirty("Clinomdes");
   }

   public boolean getgxTv_SdtPedido_Clinomdes_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPedido_E_disclides( )
   {
      return gxTv_SdtPedido_E_disclides ;
   }

   public void setgxTv_SdtPedido_E_disclides( short value )
   {
      gxTv_SdtPedido_E_disclides_N = (byte)(0) ;
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("E_disclides");
      gxTv_SdtPedido_E_disclides = value ;
   }

   public void setgxTv_SdtPedido_E_disclides_SetNull( )
   {
      gxTv_SdtPedido_E_disclides_N = (byte)(1) ;
      gxTv_SdtPedido_E_disclides = (short)(0) ;
      SetDirty("E_disclides");
   }

   public boolean getgxTv_SdtPedido_E_disclides_IsNull( )
   {
      return (gxTv_SdtPedido_E_disclides_N==1) ;
   }

   public java.util.Date getgxTv_SdtPedido_Disfec( )
   {
      return gxTv_SdtPedido_Disfec ;
   }

   public void setgxTv_SdtPedido_Disfec( java.util.Date value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disfec");
      gxTv_SdtPedido_Disfec = value ;
   }

   public java.util.Date getgxTv_SdtPedido_Disfeccli( )
   {
      return gxTv_SdtPedido_Disfeccli ;
   }

   public void setgxTv_SdtPedido_Disfeccli( java.util.Date value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disfeccli");
      gxTv_SdtPedido_Disfeccli = value ;
   }

   public java.util.Date getgxTv_SdtPedido_Disfecent( )
   {
      return gxTv_SdtPedido_Disfecent ;
   }

   public void setgxTv_SdtPedido_Disfecent( java.util.Date value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disfecent");
      gxTv_SdtPedido_Disfecent = value ;
   }

   public String getgxTv_SdtPedido_Disartcod( )
   {
      return gxTv_SdtPedido_Disartcod ;
   }

   public void setgxTv_SdtPedido_Disartcod( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartcod");
      gxTv_SdtPedido_Disartcod = value ;
   }

   public short getgxTv_SdtPedido_E_disartcod( )
   {
      return gxTv_SdtPedido_E_disartcod ;
   }

   public void setgxTv_SdtPedido_E_disartcod( short value )
   {
      gxTv_SdtPedido_E_disartcod_N = (byte)(0) ;
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("E_disartcod");
      gxTv_SdtPedido_E_disartcod = value ;
   }

   public void setgxTv_SdtPedido_E_disartcod_SetNull( )
   {
      gxTv_SdtPedido_E_disartcod_N = (byte)(1) ;
      gxTv_SdtPedido_E_disartcod = (short)(0) ;
      SetDirty("E_disartcod");
   }

   public boolean getgxTv_SdtPedido_E_disartcod_IsNull( )
   {
      return (gxTv_SdtPedido_E_disartcod_N==1) ;
   }

   public String getgxTv_SdtPedido_Disartdsc( )
   {
      return gxTv_SdtPedido_Disartdsc ;
   }

   public void setgxTv_SdtPedido_Disartdsc( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartdsc");
      gxTv_SdtPedido_Disartdsc = value ;
   }

   public short getgxTv_SdtPedido_Disarttip( )
   {
      return gxTv_SdtPedido_Disarttip ;
   }

   public void setgxTv_SdtPedido_Disarttip( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disarttip");
      gxTv_SdtPedido_Disarttip = value ;
   }

   public String getgxTv_SdtPedido_Disarttipd( )
   {
      return gxTv_SdtPedido_Disarttipd ;
   }

   public void setgxTv_SdtPedido_Disarttipd( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disarttipd");
      gxTv_SdtPedido_Disarttipd = value ;
   }

   public void setgxTv_SdtPedido_Disarttipd_SetNull( )
   {
      gxTv_SdtPedido_Disarttipd = "" ;
      SetDirty("Disarttipd");
   }

   public boolean getgxTv_SdtPedido_Disarttipd_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Disartmat( )
   {
      return gxTv_SdtPedido_Disartmat ;
   }

   public void setgxTv_SdtPedido_Disartmat( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartmat");
      gxTv_SdtPedido_Disartmat = value ;
   }

   public String getgxTv_SdtPedido_Disarttr1( )
   {
      return gxTv_SdtPedido_Disarttr1 ;
   }

   public void setgxTv_SdtPedido_Disarttr1( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disarttr1");
      gxTv_SdtPedido_Disarttr1 = value ;
   }

   public short getgxTv_SdtPedido_Disartpt1( )
   {
      return gxTv_SdtPedido_Disartpt1 ;
   }

   public void setgxTv_SdtPedido_Disartpt1( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartpt1");
      gxTv_SdtPedido_Disartpt1 = value ;
   }

   public String getgxTv_SdtPedido_Disarttr2( )
   {
      return gxTv_SdtPedido_Disarttr2 ;
   }

   public void setgxTv_SdtPedido_Disarttr2( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disarttr2");
      gxTv_SdtPedido_Disarttr2 = value ;
   }

   public short getgxTv_SdtPedido_Disartpt2( )
   {
      return gxTv_SdtPedido_Disartpt2 ;
   }

   public void setgxTv_SdtPedido_Disartpt2( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartpt2");
      gxTv_SdtPedido_Disartpt2 = value ;
   }

   public String getgxTv_SdtPedido_Disarttr3( )
   {
      return gxTv_SdtPedido_Disarttr3 ;
   }

   public void setgxTv_SdtPedido_Disarttr3( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disarttr3");
      gxTv_SdtPedido_Disarttr3 = value ;
   }

   public short getgxTv_SdtPedido_Disartpt3( )
   {
      return gxTv_SdtPedido_Disartpt3 ;
   }

   public void setgxTv_SdtPedido_Disartpt3( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartpt3");
      gxTv_SdtPedido_Disartpt3 = value ;
   }

   public String getgxTv_SdtPedido_Disartur1( )
   {
      return gxTv_SdtPedido_Disartur1 ;
   }

   public void setgxTv_SdtPedido_Disartur1( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartur1");
      gxTv_SdtPedido_Disartur1 = value ;
   }

   public short getgxTv_SdtPedido_Disartpu1( )
   {
      return gxTv_SdtPedido_Disartpu1 ;
   }

   public void setgxTv_SdtPedido_Disartpu1( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartpu1");
      gxTv_SdtPedido_Disartpu1 = value ;
   }

   public String getgxTv_SdtPedido_Disartur2( )
   {
      return gxTv_SdtPedido_Disartur2 ;
   }

   public void setgxTv_SdtPedido_Disartur2( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartur2");
      gxTv_SdtPedido_Disartur2 = value ;
   }

   public short getgxTv_SdtPedido_Disartpu2( )
   {
      return gxTv_SdtPedido_Disartpu2 ;
   }

   public void setgxTv_SdtPedido_Disartpu2( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartpu2");
      gxTv_SdtPedido_Disartpu2 = value ;
   }

   public String getgxTv_SdtPedido_Disartur3( )
   {
      return gxTv_SdtPedido_Disartur3 ;
   }

   public void setgxTv_SdtPedido_Disartur3( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartur3");
      gxTv_SdtPedido_Disartur3 = value ;
   }

   public short getgxTv_SdtPedido_Disartpu3( )
   {
      return gxTv_SdtPedido_Disartpu3 ;
   }

   public void setgxTv_SdtPedido_Disartpu3( short value )
   {
      gxTv_SdtPedido_Disartpu3_N = (byte)(0) ;
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartpu3");
      gxTv_SdtPedido_Disartpu3 = value ;
   }

   public void setgxTv_SdtPedido_Disartpu3_SetNull( )
   {
      gxTv_SdtPedido_Disartpu3_N = (byte)(1) ;
      gxTv_SdtPedido_Disartpu3 = (short)(0) ;
      SetDirty("Disartpu3");
   }

   public boolean getgxTv_SdtPedido_Disartpu3_IsNull( )
   {
      return (gxTv_SdtPedido_Disartpu3_N==1) ;
   }

   public String getgxTv_SdtPedido_Discolnom( )
   {
      return gxTv_SdtPedido_Discolnom ;
   }

   public void setgxTv_SdtPedido_Discolnom( String value )
   {
      gxTv_SdtPedido_Discolnom_N = (byte)(0) ;
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Discolnom");
      gxTv_SdtPedido_Discolnom = value ;
   }

   public void setgxTv_SdtPedido_Discolnom_SetNull( )
   {
      gxTv_SdtPedido_Discolnom_N = (byte)(1) ;
      gxTv_SdtPedido_Discolnom = "" ;
      SetDirty("Discolnom");
   }

   public boolean getgxTv_SdtPedido_Discolnom_IsNull( )
   {
      return (gxTv_SdtPedido_Discolnom_N==1) ;
   }

   public int getgxTv_SdtPedido_Discolnum( )
   {
      return gxTv_SdtPedido_Discolnum ;
   }

   public void setgxTv_SdtPedido_Discolnum( int value )
   {
      gxTv_SdtPedido_Discolnum_N = (byte)(0) ;
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Discolnum");
      gxTv_SdtPedido_Discolnum = value ;
   }

   public void setgxTv_SdtPedido_Discolnum_SetNull( )
   {
      gxTv_SdtPedido_Discolnum_N = (byte)(1) ;
      gxTv_SdtPedido_Discolnum = 0 ;
      SetDirty("Discolnum");
   }

   public boolean getgxTv_SdtPedido_Discolnum_IsNull( )
   {
      return (gxTv_SdtPedido_Discolnum_N==1) ;
   }

   public byte getgxTv_SdtPedido_Distipcol( )
   {
      return gxTv_SdtPedido_Distipcol ;
   }

   public void setgxTv_SdtPedido_Distipcol( byte value )
   {
      gxTv_SdtPedido_Distipcol_N = (byte)(0) ;
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Distipcol");
      gxTv_SdtPedido_Distipcol = value ;
   }

   public void setgxTv_SdtPedido_Distipcol_SetNull( )
   {
      gxTv_SdtPedido_Distipcol_N = (byte)(1) ;
      gxTv_SdtPedido_Distipcol = (byte)(0) ;
      SetDirty("Distipcol");
   }

   public boolean getgxTv_SdtPedido_Distipcol_IsNull( )
   {
      return (gxTv_SdtPedido_Distipcol_N==1) ;
   }

   public byte getgxTv_SdtPedido_Disest( )
   {
      return gxTv_SdtPedido_Disest ;
   }

   public void setgxTv_SdtPedido_Disest( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disest");
      gxTv_SdtPedido_Disest = value ;
   }

   public String getgxTv_SdtPedido_Disdes( )
   {
      return gxTv_SdtPedido_Disdes ;
   }

   public void setgxTv_SdtPedido_Disdes( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disdes");
      gxTv_SdtPedido_Disdes = value ;
   }

   public String getgxTv_SdtPedido_Disartdsc2( )
   {
      return gxTv_SdtPedido_Disartdsc2 ;
   }

   public void setgxTv_SdtPedido_Disartdsc2( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartdsc2");
      gxTv_SdtPedido_Disartdsc2 = value ;
   }

   public String getgxTv_SdtPedido_Disple2( )
   {
      return gxTv_SdtPedido_Disple2 ;
   }

   public void setgxTv_SdtPedido_Disple2( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disple2");
      gxTv_SdtPedido_Disple2 = value ;
   }

   public String getgxTv_SdtPedido_Disartlar( )
   {
      return gxTv_SdtPedido_Disartlar ;
   }

   public void setgxTv_SdtPedido_Disartlar( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartlar");
      gxTv_SdtPedido_Disartlar = value ;
   }

   public String getgxTv_SdtPedido_Disartsua( )
   {
      return gxTv_SdtPedido_Disartsua ;
   }

   public void setgxTv_SdtPedido_Disartsua( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartsua");
      gxTv_SdtPedido_Disartsua = value ;
   }

   public String getgxTv_SdtPedido_Disartaca( )
   {
      return gxTv_SdtPedido_Disartaca ;
   }

   public void setgxTv_SdtPedido_Disartaca( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartaca");
      gxTv_SdtPedido_Disartaca = value ;
   }

   public String getgxTv_SdtPedido_Disartenc( )
   {
      return gxTv_SdtPedido_Disartenc ;
   }

   public void setgxTv_SdtPedido_Disartenc( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartenc");
      gxTv_SdtPedido_Disartenc = value ;
   }

   public String getgxTv_SdtPedido_Disartcor( )
   {
      return gxTv_SdtPedido_Disartcor ;
   }

   public void setgxTv_SdtPedido_Disartcor( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartcor");
      gxTv_SdtPedido_Disartcor = value ;
   }

   public short getgxTv_SdtPedido_Disartpes( )
   {
      return gxTv_SdtPedido_Disartpes ;
   }

   public void setgxTv_SdtPedido_Disartpes( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartpes");
      gxTv_SdtPedido_Disartpes = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPedido_Disartrdt( )
   {
      return gxTv_SdtPedido_Disartrdt ;
   }

   public void setgxTv_SdtPedido_Disartrdt( java.math.BigDecimal value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartrdt");
      gxTv_SdtPedido_Disartrdt = value ;
   }

   public byte getgxTv_SdtPedido_Disarturg( )
   {
      return gxTv_SdtPedido_Disarturg ;
   }

   public void setgxTv_SdtPedido_Disarturg( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disarturg");
      gxTv_SdtPedido_Disarturg = value ;
   }

   public short getgxTv_SdtPedido_Disgracru( )
   {
      return gxTv_SdtPedido_Disgracru ;
   }

   public void setgxTv_SdtPedido_Disgracru( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disgracru");
      gxTv_SdtPedido_Disgracru = value ;
   }

   public short getgxTv_SdtPedido_Disartanh( )
   {
      return gxTv_SdtPedido_Disartanh ;
   }

   public void setgxTv_SdtPedido_Disartanh( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartanh");
      gxTv_SdtPedido_Disartanh = value ;
   }

   public short getgxTv_SdtPedido_Disartan1( )
   {
      return gxTv_SdtPedido_Disartan1 ;
   }

   public void setgxTv_SdtPedido_Disartan1( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartan1");
      gxTv_SdtPedido_Disartan1 = value ;
   }

   public short getgxTv_SdtPedido_Disartacb( )
   {
      return gxTv_SdtPedido_Disartacb ;
   }

   public void setgxTv_SdtPedido_Disartacb( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartacb");
      gxTv_SdtPedido_Disartacb = value ;
   }

   public short getgxTv_SdtPedido_Disartac2( )
   {
      return gxTv_SdtPedido_Disartac2 ;
   }

   public void setgxTv_SdtPedido_Disartac2( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartac2");
      gxTv_SdtPedido_Disartac2 = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPedido_Disenccom( )
   {
      return gxTv_SdtPedido_Disenccom ;
   }

   public void setgxTv_SdtPedido_Disenccom( java.math.BigDecimal value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disenccom");
      gxTv_SdtPedido_Disenccom = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPedido_Disencanh( )
   {
      return gxTv_SdtPedido_Disencanh ;
   }

   public void setgxTv_SdtPedido_Disencanh( java.math.BigDecimal value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disencanh");
      gxTv_SdtPedido_Disencanh = value ;
   }

   public short getgxTv_SdtPedido_Disnumcor( )
   {
      return gxTv_SdtPedido_Disnumcor ;
   }

   public void setgxTv_SdtPedido_Disnumcor( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disnumcor");
      gxTv_SdtPedido_Disnumcor = value ;
   }

   public short getgxTv_SdtPedido_Disancsal1( )
   {
      return gxTv_SdtPedido_Disancsal1 ;
   }

   public void setgxTv_SdtPedido_Disancsal1( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disancsal1");
      gxTv_SdtPedido_Disancsal1 = value ;
   }

   public short getgxTv_SdtPedido_Disancsal2( )
   {
      return gxTv_SdtPedido_Disancsal2 ;
   }

   public void setgxTv_SdtPedido_Disancsal2( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disancsal2");
      gxTv_SdtPedido_Disancsal2 = value ;
   }

   public short getgxTv_SdtPedido_Disancsal3( )
   {
      return gxTv_SdtPedido_Disancsal3 ;
   }

   public void setgxTv_SdtPedido_Disancsal3( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disancsal3");
      gxTv_SdtPedido_Disancsal3 = value ;
   }

   public short getgxTv_SdtPedido_Disgraaca2( )
   {
      return gxTv_SdtPedido_Disgraaca2 ;
   }

   public void setgxTv_SdtPedido_Disgraaca2( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disgraaca2");
      gxTv_SdtPedido_Disgraaca2 = value ;
   }

   public short getgxTv_SdtPedido_Disgracru2( )
   {
      return gxTv_SdtPedido_Disgracru2 ;
   }

   public void setgxTv_SdtPedido_Disgracru2( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disgracru2");
      gxTv_SdtPedido_Disgracru2 = value ;
   }

   public short getgxTv_SdtPedido_Disgraaca( )
   {
      return gxTv_SdtPedido_Disgraaca ;
   }

   public void setgxTv_SdtPedido_Disgraaca( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disgraaca");
      gxTv_SdtPedido_Disgraaca = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPedido_Disrdoa( )
   {
      return gxTv_SdtPedido_Disrdoa ;
   }

   public void setgxTv_SdtPedido_Disrdoa( java.math.BigDecimal value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disrdoa");
      gxTv_SdtPedido_Disrdoa = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPedido_Disrdon( )
   {
      return gxTv_SdtPedido_Disrdon ;
   }

   public void setgxTv_SdtPedido_Disrdon( java.math.BigDecimal value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disrdon");
      gxTv_SdtPedido_Disrdon = value ;
   }

   public String getgxTv_SdtPedido_Disobsgrm( )
   {
      return gxTv_SdtPedido_Disobsgrm ;
   }

   public void setgxTv_SdtPedido_Disobsgrm( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disobsgrm");
      gxTv_SdtPedido_Disobsgrm = value ;
   }

   public String getgxTv_SdtPedido_Disobsanc( )
   {
      return gxTv_SdtPedido_Disobsanc ;
   }

   public void setgxTv_SdtPedido_Disobsanc( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disobsanc");
      gxTv_SdtPedido_Disobsanc = value ;
   }

   public String getgxTv_SdtPedido_Disitem5( )
   {
      return gxTv_SdtPedido_Disitem5 ;
   }

   public void setgxTv_SdtPedido_Disitem5( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disitem5");
      gxTv_SdtPedido_Disitem5 = value ;
   }

   public String getgxTv_SdtPedido_Disartple( )
   {
      return gxTv_SdtPedido_Disartple ;
   }

   public void setgxTv_SdtPedido_Disartple( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartple");
      gxTv_SdtPedido_Disartple = value ;
   }

   public String getgxTv_SdtPedido_Disunimed( )
   {
      return gxTv_SdtPedido_Disunimed ;
   }

   public void setgxTv_SdtPedido_Disunimed( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disunimed");
      gxTv_SdtPedido_Disunimed = value ;
   }

   public String getgxTv_SdtPedido_Cod_idtx( )
   {
      return gxTv_SdtPedido_Cod_idtx ;
   }

   public void setgxTv_SdtPedido_Cod_idtx( String value )
   {
      gxTv_SdtPedido_Cod_idtx_N = (byte)(0) ;
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Cod_idtx");
      gxTv_SdtPedido_Cod_idtx = value ;
   }

   public void setgxTv_SdtPedido_Cod_idtx_SetNull( )
   {
      gxTv_SdtPedido_Cod_idtx_N = (byte)(1) ;
      gxTv_SdtPedido_Cod_idtx = "" ;
      SetDirty("Cod_idtx");
   }

   public boolean getgxTv_SdtPedido_Cod_idtx_IsNull( )
   {
      return (gxTv_SdtPedido_Cod_idtx_N==1) ;
   }

   public String getgxTv_SdtPedido_Dsc_idtx( )
   {
      return gxTv_SdtPedido_Dsc_idtx ;
   }

   public void setgxTv_SdtPedido_Dsc_idtx( String value )
   {
      gxTv_SdtPedido_Dsc_idtx_N = (byte)(0) ;
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Dsc_idtx");
      gxTv_SdtPedido_Dsc_idtx = value ;
   }

   public void setgxTv_SdtPedido_Dsc_idtx_SetNull( )
   {
      gxTv_SdtPedido_Dsc_idtx_N = (byte)(1) ;
      gxTv_SdtPedido_Dsc_idtx = "" ;
      SetDirty("Dsc_idtx");
   }

   public boolean getgxTv_SdtPedido_Dsc_idtx_IsNull( )
   {
      return (gxTv_SdtPedido_Dsc_idtx_N==1) ;
   }

   public String getgxTv_SdtPedido_Disordcomp( )
   {
      return gxTv_SdtPedido_Disordcomp ;
   }

   public void setgxTv_SdtPedido_Disordcomp( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disordcomp");
      gxTv_SdtPedido_Disordcomp = value ;
   }

   public String getgxTv_SdtPedido_Revenid( )
   {
      return gxTv_SdtPedido_Revenid ;
   }

   public void setgxTv_SdtPedido_Revenid( String value )
   {
      gxTv_SdtPedido_Revenid_N = (byte)(0) ;
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Revenid");
      gxTv_SdtPedido_Revenid = value ;
   }

   public void setgxTv_SdtPedido_Revenid_SetNull( )
   {
      gxTv_SdtPedido_Revenid_N = (byte)(1) ;
      gxTv_SdtPedido_Revenid = "" ;
      SetDirty("Revenid");
   }

   public boolean getgxTv_SdtPedido_Revenid_IsNull( )
   {
      return (gxTv_SdtPedido_Revenid_N==1) ;
   }

   public String getgxTv_SdtPedido_Revennm( )
   {
      return gxTv_SdtPedido_Revennm ;
   }

   public void setgxTv_SdtPedido_Revennm( String value )
   {
      gxTv_SdtPedido_Revennm_N = (byte)(0) ;
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Revennm");
      gxTv_SdtPedido_Revennm = value ;
   }

   public void setgxTv_SdtPedido_Revennm_SetNull( )
   {
      gxTv_SdtPedido_Revennm_N = (byte)(1) ;
      gxTv_SdtPedido_Revennm = "" ;
      SetDirty("Revennm");
   }

   public boolean getgxTv_SdtPedido_Revennm_IsNull( )
   {
      return (gxTv_SdtPedido_Revennm_N==1) ;
   }

   public String getgxTv_SdtPedido_Marcaid( )
   {
      return gxTv_SdtPedido_Marcaid ;
   }

   public void setgxTv_SdtPedido_Marcaid( String value )
   {
      gxTv_SdtPedido_Marcaid_N = (byte)(0) ;
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Marcaid");
      gxTv_SdtPedido_Marcaid = value ;
   }

   public void setgxTv_SdtPedido_Marcaid_SetNull( )
   {
      gxTv_SdtPedido_Marcaid_N = (byte)(1) ;
      gxTv_SdtPedido_Marcaid = "" ;
      SetDirty("Marcaid");
   }

   public boolean getgxTv_SdtPedido_Marcaid_IsNull( )
   {
      return (gxTv_SdtPedido_Marcaid_N==1) ;
   }

   public String getgxTv_SdtPedido_Marcadsc( )
   {
      return gxTv_SdtPedido_Marcadsc ;
   }

   public void setgxTv_SdtPedido_Marcadsc( String value )
   {
      gxTv_SdtPedido_Marcadsc_N = (byte)(0) ;
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Marcadsc");
      gxTv_SdtPedido_Marcadsc = value ;
   }

   public void setgxTv_SdtPedido_Marcadsc_SetNull( )
   {
      gxTv_SdtPedido_Marcadsc_N = (byte)(1) ;
      gxTv_SdtPedido_Marcadsc = "" ;
      SetDirty("Marcadsc");
   }

   public boolean getgxTv_SdtPedido_Marcadsc_IsNull( )
   {
      return (gxTv_SdtPedido_Marcadsc_N==1) ;
   }

   public String getgxTv_SdtPedido_Disidtx2( )
   {
      return gxTv_SdtPedido_Disidtx2 ;
   }

   public void setgxTv_SdtPedido_Disidtx2( String value )
   {
      gxTv_SdtPedido_Disidtx2_N = (byte)(0) ;
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disidtx2");
      gxTv_SdtPedido_Disidtx2 = value ;
   }

   public void setgxTv_SdtPedido_Disidtx2_SetNull( )
   {
      gxTv_SdtPedido_Disidtx2_N = (byte)(1) ;
      gxTv_SdtPedido_Disidtx2 = "" ;
      SetDirty("Disidtx2");
   }

   public boolean getgxTv_SdtPedido_Disidtx2_IsNull( )
   {
      return (gxTv_SdtPedido_Disidtx2_N==1) ;
   }

   public byte getgxTv_SdtPedido_Dispriorid( )
   {
      return gxTv_SdtPedido_Dispriorid ;
   }

   public void setgxTv_SdtPedido_Dispriorid( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Dispriorid");
      gxTv_SdtPedido_Dispriorid = value ;
   }

   public String getgxTv_SdtPedido_Nxt_modelo( )
   {
      return gxTv_SdtPedido_Nxt_modelo ;
   }

   public void setgxTv_SdtPedido_Nxt_modelo( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Nxt_modelo");
      gxTv_SdtPedido_Nxt_modelo = value ;
   }

   public short getgxTv_SdtPedido_Cpteid( )
   {
      return gxTv_SdtPedido_Cpteid ;
   }

   public void setgxTv_SdtPedido_Cpteid( short value )
   {
      gxTv_SdtPedido_Cpteid_N = (byte)(0) ;
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Cpteid");
      gxTv_SdtPedido_Cpteid = value ;
   }

   public void setgxTv_SdtPedido_Cpteid_SetNull( )
   {
      gxTv_SdtPedido_Cpteid_N = (byte)(1) ;
      gxTv_SdtPedido_Cpteid = (short)(0) ;
      SetDirty("Cpteid");
   }

   public boolean getgxTv_SdtPedido_Cpteid_IsNull( )
   {
      return (gxTv_SdtPedido_Cpteid_N==1) ;
   }

   public String getgxTv_SdtPedido_Cptedsc( )
   {
      return gxTv_SdtPedido_Cptedsc ;
   }

   public void setgxTv_SdtPedido_Cptedsc( String value )
   {
      gxTv_SdtPedido_Cptedsc_N = (byte)(0) ;
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Cptedsc");
      gxTv_SdtPedido_Cptedsc = value ;
   }

   public void setgxTv_SdtPedido_Cptedsc_SetNull( )
   {
      gxTv_SdtPedido_Cptedsc_N = (byte)(1) ;
      gxTv_SdtPedido_Cptedsc = "" ;
      SetDirty("Cptedsc");
   }

   public boolean getgxTv_SdtPedido_Cptedsc_IsNull( )
   {
      return (gxTv_SdtPedido_Cptedsc_N==1) ;
   }

   public String getgxTv_SdtPedido_Nxt_statio( )
   {
      return gxTv_SdtPedido_Nxt_statio ;
   }

   public void setgxTv_SdtPedido_Nxt_statio( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Nxt_statio");
      gxTv_SdtPedido_Nxt_statio = value ;
   }

   public short getgxTv_SdtPedido_Desaid( )
   {
      return gxTv_SdtPedido_Desaid ;
   }

   public void setgxTv_SdtPedido_Desaid( short value )
   {
      gxTv_SdtPedido_Desaid_N = (byte)(0) ;
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Desaid");
      gxTv_SdtPedido_Desaid = value ;
   }

   public void setgxTv_SdtPedido_Desaid_SetNull( )
   {
      gxTv_SdtPedido_Desaid_N = (byte)(1) ;
      gxTv_SdtPedido_Desaid = (short)(0) ;
      SetDirty("Desaid");
   }

   public boolean getgxTv_SdtPedido_Desaid_IsNull( )
   {
      return (gxTv_SdtPedido_Desaid_N==1) ;
   }

   public String getgxTv_SdtPedido_Desadsc( )
   {
      return gxTv_SdtPedido_Desadsc ;
   }

   public void setgxTv_SdtPedido_Desadsc( String value )
   {
      gxTv_SdtPedido_Desadsc_N = (byte)(0) ;
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Desadsc");
      gxTv_SdtPedido_Desadsc = value ;
   }

   public void setgxTv_SdtPedido_Desadsc_SetNull( )
   {
      gxTv_SdtPedido_Desadsc_N = (byte)(1) ;
      gxTv_SdtPedido_Desadsc = "" ;
      SetDirty("Desadsc");
   }

   public boolean getgxTv_SdtPedido_Desadsc_IsNull( )
   {
      return (gxTv_SdtPedido_Desadsc_N==1) ;
   }

   public short getgxTv_SdtPedido_Dptoid( )
   {
      return gxTv_SdtPedido_Dptoid ;
   }

   public void setgxTv_SdtPedido_Dptoid( short value )
   {
      gxTv_SdtPedido_Dptoid_N = (byte)(0) ;
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Dptoid");
      gxTv_SdtPedido_Dptoid = value ;
   }

   public void setgxTv_SdtPedido_Dptoid_SetNull( )
   {
      gxTv_SdtPedido_Dptoid_N = (byte)(1) ;
      gxTv_SdtPedido_Dptoid = (short)(0) ;
      SetDirty("Dptoid");
   }

   public boolean getgxTv_SdtPedido_Dptoid_IsNull( )
   {
      return (gxTv_SdtPedido_Dptoid_N==1) ;
   }

   public String getgxTv_SdtPedido_Dptodsc( )
   {
      return gxTv_SdtPedido_Dptodsc ;
   }

   public void setgxTv_SdtPedido_Dptodsc( String value )
   {
      gxTv_SdtPedido_Dptodsc_N = (byte)(0) ;
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Dptodsc");
      gxTv_SdtPedido_Dptodsc = value ;
   }

   public void setgxTv_SdtPedido_Dptodsc_SetNull( )
   {
      gxTv_SdtPedido_Dptodsc_N = (byte)(1) ;
      gxTv_SdtPedido_Dptodsc = "" ;
      SetDirty("Dptodsc");
   }

   public boolean getgxTv_SdtPedido_Dptodsc_IsNull( )
   {
      return (gxTv_SdtPedido_Dptodsc_N==1) ;
   }

   public String getgxTv_SdtPedido_Nxt_artcli( )
   {
      return gxTv_SdtPedido_Nxt_artcli ;
   }

   public void setgxTv_SdtPedido_Nxt_artcli( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Nxt_artcli");
      gxTv_SdtPedido_Nxt_artcli = value ;
   }

   public String getgxTv_SdtPedido_Disexp( )
   {
      return gxTv_SdtPedido_Disexp ;
   }

   public void setgxTv_SdtPedido_Disexp( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disexp");
      gxTv_SdtPedido_Disexp = value ;
   }

   public GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Norma> getgxTv_SdtPedido_Norma( )
   {
      if ( gxTv_SdtPedido_Norma == null )
      {
         gxTv_SdtPedido_Norma = new GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Norma>(app.pedidosclientesindetalle.SdtPedido_Norma.class, "Pedido.Norma", "TexplusNET", remoteHandle);
      }
      gxTv_SdtPedido_N = (byte)(0) ;
      return gxTv_SdtPedido_Norma ;
   }

   public void setgxTv_SdtPedido_Norma( GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Norma> value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Norma");
      gxTv_SdtPedido_Norma = value ;
   }

   public void setgxTv_SdtPedido_Norma_SetNull( )
   {
      gxTv_SdtPedido_Norma = null ;
      SetDirty("Norma");
   }

   public boolean getgxTv_SdtPedido_Norma_IsNull( )
   {
      if ( gxTv_SdtPedido_Norma == null )
      {
         return true ;
      }
      return false ;
   }

   public GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_AlmacenTejido> getgxTv_SdtPedido_Almacentejido( )
   {
      if ( gxTv_SdtPedido_Almacentejido == null )
      {
         gxTv_SdtPedido_Almacentejido = new GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_AlmacenTejido>(app.pedidosclientesindetalle.SdtPedido_AlmacenTejido.class, "Pedido.AlmacenTejido", "TexplusNET", remoteHandle);
      }
      gxTv_SdtPedido_N = (byte)(0) ;
      return gxTv_SdtPedido_Almacentejido ;
   }

   public void setgxTv_SdtPedido_Almacentejido( GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_AlmacenTejido> value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Almacentejido");
      gxTv_SdtPedido_Almacentejido = value ;
   }

   public void setgxTv_SdtPedido_Almacentejido_SetNull( )
   {
      gxTv_SdtPedido_Almacentejido = null ;
      SetDirty("Almacentejido");
   }

   public boolean getgxTv_SdtPedido_Almacentejido_IsNull( )
   {
      if ( gxTv_SdtPedido_Almacentejido == null )
      {
         return true ;
      }
      return false ;
   }

   public GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Defecto> getgxTv_SdtPedido_Defecto( )
   {
      if ( gxTv_SdtPedido_Defecto == null )
      {
         gxTv_SdtPedido_Defecto = new GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Defecto>(app.pedidosclientesindetalle.SdtPedido_Defecto.class, "Pedido.Defecto", "TexplusNET", remoteHandle);
      }
      gxTv_SdtPedido_N = (byte)(0) ;
      return gxTv_SdtPedido_Defecto ;
   }

   public void setgxTv_SdtPedido_Defecto( GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Defecto> value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Defecto");
      gxTv_SdtPedido_Defecto = value ;
   }

   public void setgxTv_SdtPedido_Defecto_SetNull( )
   {
      gxTv_SdtPedido_Defecto = null ;
      SetDirty("Defecto");
   }

   public boolean getgxTv_SdtPedido_Defecto_IsNull( )
   {
      if ( gxTv_SdtPedido_Defecto == null )
      {
         return true ;
      }
      return false ;
   }

   public GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Proceso> getgxTv_SdtPedido_Proceso( )
   {
      if ( gxTv_SdtPedido_Proceso == null )
      {
         gxTv_SdtPedido_Proceso = new GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Proceso>(app.pedidosclientesindetalle.SdtPedido_Proceso.class, "Pedido.Proceso", "TexplusNET", remoteHandle);
      }
      gxTv_SdtPedido_N = (byte)(0) ;
      return gxTv_SdtPedido_Proceso ;
   }

   public void setgxTv_SdtPedido_Proceso( GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Proceso> value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Proceso");
      gxTv_SdtPedido_Proceso = value ;
   }

   public void setgxTv_SdtPedido_Proceso_SetNull( )
   {
      gxTv_SdtPedido_Proceso = null ;
      SetDirty("Proceso");
   }

   public boolean getgxTv_SdtPedido_Proceso_IsNull( )
   {
      if ( gxTv_SdtPedido_Proceso == null )
      {
         return true ;
      }
      return false ;
   }

   public String getgxTv_SdtPedido_Mode( )
   {
      return gxTv_SdtPedido_Mode ;
   }

   public void setgxTv_SdtPedido_Mode( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Mode");
      gxTv_SdtPedido_Mode = value ;
   }

   public void setgxTv_SdtPedido_Mode_SetNull( )
   {
      gxTv_SdtPedido_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_SdtPedido_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPedido_Initialized( )
   {
      return gxTv_SdtPedido_Initialized ;
   }

   public void setgxTv_SdtPedido_Initialized( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Initialized");
      gxTv_SdtPedido_Initialized = value ;
   }

   public void setgxTv_SdtPedido_Initialized_SetNull( )
   {
      gxTv_SdtPedido_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_SdtPedido_Initialized_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Emprcod_Z( )
   {
      return gxTv_SdtPedido_Emprcod_Z ;
   }

   public void setgxTv_SdtPedido_Emprcod_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Emprcod_Z");
      gxTv_SdtPedido_Emprcod_Z = value ;
   }

   public void setgxTv_SdtPedido_Emprcod_Z_SetNull( )
   {
      gxTv_SdtPedido_Emprcod_Z = "" ;
      SetDirty("Emprcod_Z");
   }

   public boolean getgxTv_SdtPedido_Emprcod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Emprnom_Z( )
   {
      return gxTv_SdtPedido_Emprnom_Z ;
   }

   public void setgxTv_SdtPedido_Emprnom_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Emprnom_Z");
      gxTv_SdtPedido_Emprnom_Z = value ;
   }

   public void setgxTv_SdtPedido_Emprnom_Z_SetNull( )
   {
      gxTv_SdtPedido_Emprnom_Z = "" ;
      SetDirty("Emprnom_Z");
   }

   public boolean getgxTv_SdtPedido_Emprnom_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Pricod_Z( )
   {
      return gxTv_SdtPedido_Pricod_Z ;
   }

   public void setgxTv_SdtPedido_Pricod_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Pricod_Z");
      gxTv_SdtPedido_Pricod_Z = value ;
   }

   public void setgxTv_SdtPedido_Pricod_Z_SetNull( )
   {
      gxTv_SdtPedido_Pricod_Z = "" ;
      SetDirty("Pricod_Z");
   }

   public boolean getgxTv_SdtPedido_Pricod_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtPedido_Discod_Z( )
   {
      return gxTv_SdtPedido_Discod_Z ;
   }

   public void setgxTv_SdtPedido_Discod_Z( int value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Discod_Z");
      gxTv_SdtPedido_Discod_Z = value ;
   }

   public void setgxTv_SdtPedido_Discod_Z_SetNull( )
   {
      gxTv_SdtPedido_Discod_Z = 0 ;
      SetDirty("Discod_Z");
   }

   public boolean getgxTv_SdtPedido_Discod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Distipdis_Z( )
   {
      return gxTv_SdtPedido_Distipdis_Z ;
   }

   public void setgxTv_SdtPedido_Distipdis_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Distipdis_Z");
      gxTv_SdtPedido_Distipdis_Z = value ;
   }

   public void setgxTv_SdtPedido_Distipdis_Z_SetNull( )
   {
      gxTv_SdtPedido_Distipdis_Z = "" ;
      SetDirty("Distipdis_Z");
   }

   public boolean getgxTv_SdtPedido_Distipdis_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Disenccli_Z( )
   {
      return gxTv_SdtPedido_Disenccli_Z ;
   }

   public void setgxTv_SdtPedido_Disenccli_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disenccli_Z");
      gxTv_SdtPedido_Disenccli_Z = value ;
   }

   public void setgxTv_SdtPedido_Disenccli_Z_SetNull( )
   {
      gxTv_SdtPedido_Disenccli_Z = "" ;
      SetDirty("Disenccli_Z");
   }

   public boolean getgxTv_SdtPedido_Disenccli_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtPedido_Clicod_Z( )
   {
      return gxTv_SdtPedido_Clicod_Z ;
   }

   public void setgxTv_SdtPedido_Clicod_Z( int value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Clicod_Z");
      gxTv_SdtPedido_Clicod_Z = value ;
   }

   public void setgxTv_SdtPedido_Clicod_Z_SetNull( )
   {
      gxTv_SdtPedido_Clicod_Z = 0 ;
      SetDirty("Clicod_Z");
   }

   public boolean getgxTv_SdtPedido_Clicod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Clinom_Z( )
   {
      return gxTv_SdtPedido_Clinom_Z ;
   }

   public void setgxTv_SdtPedido_Clinom_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Clinom_Z");
      gxTv_SdtPedido_Clinom_Z = value ;
   }

   public void setgxTv_SdtPedido_Clinom_Z_SetNull( )
   {
      gxTv_SdtPedido_Clinom_Z = "" ;
      SetDirty("Clinom_Z");
   }

   public boolean getgxTv_SdtPedido_Clinom_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtPedido_Disclides_Z( )
   {
      return gxTv_SdtPedido_Disclides_Z ;
   }

   public void setgxTv_SdtPedido_Disclides_Z( int value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disclides_Z");
      gxTv_SdtPedido_Disclides_Z = value ;
   }

   public void setgxTv_SdtPedido_Disclides_Z_SetNull( )
   {
      gxTv_SdtPedido_Disclides_Z = 0 ;
      SetDirty("Disclides_Z");
   }

   public boolean getgxTv_SdtPedido_Disclides_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Clinomdes_Z( )
   {
      return gxTv_SdtPedido_Clinomdes_Z ;
   }

   public void setgxTv_SdtPedido_Clinomdes_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Clinomdes_Z");
      gxTv_SdtPedido_Clinomdes_Z = value ;
   }

   public void setgxTv_SdtPedido_Clinomdes_Z_SetNull( )
   {
      gxTv_SdtPedido_Clinomdes_Z = "" ;
      SetDirty("Clinomdes_Z");
   }

   public boolean getgxTv_SdtPedido_Clinomdes_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPedido_E_disclides_Z( )
   {
      return gxTv_SdtPedido_E_disclides_Z ;
   }

   public void setgxTv_SdtPedido_E_disclides_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("E_disclides_Z");
      gxTv_SdtPedido_E_disclides_Z = value ;
   }

   public void setgxTv_SdtPedido_E_disclides_Z_SetNull( )
   {
      gxTv_SdtPedido_E_disclides_Z = (short)(0) ;
      SetDirty("E_disclides_Z");
   }

   public boolean getgxTv_SdtPedido_E_disclides_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtPedido_Disfec_Z( )
   {
      return gxTv_SdtPedido_Disfec_Z ;
   }

   public void setgxTv_SdtPedido_Disfec_Z( java.util.Date value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disfec_Z");
      gxTv_SdtPedido_Disfec_Z = value ;
   }

   public void setgxTv_SdtPedido_Disfec_Z_SetNull( )
   {
      gxTv_SdtPedido_Disfec_Z = GXutil.nullDate() ;
      SetDirty("Disfec_Z");
   }

   public boolean getgxTv_SdtPedido_Disfec_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtPedido_Disfeccli_Z( )
   {
      return gxTv_SdtPedido_Disfeccli_Z ;
   }

   public void setgxTv_SdtPedido_Disfeccli_Z( java.util.Date value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disfeccli_Z");
      gxTv_SdtPedido_Disfeccli_Z = value ;
   }

   public void setgxTv_SdtPedido_Disfeccli_Z_SetNull( )
   {
      gxTv_SdtPedido_Disfeccli_Z = GXutil.nullDate() ;
      SetDirty("Disfeccli_Z");
   }

   public boolean getgxTv_SdtPedido_Disfeccli_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtPedido_Disfecent_Z( )
   {
      return gxTv_SdtPedido_Disfecent_Z ;
   }

   public void setgxTv_SdtPedido_Disfecent_Z( java.util.Date value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disfecent_Z");
      gxTv_SdtPedido_Disfecent_Z = value ;
   }

   public void setgxTv_SdtPedido_Disfecent_Z_SetNull( )
   {
      gxTv_SdtPedido_Disfecent_Z = GXutil.nullDate() ;
      SetDirty("Disfecent_Z");
   }

   public boolean getgxTv_SdtPedido_Disfecent_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Disartcod_Z( )
   {
      return gxTv_SdtPedido_Disartcod_Z ;
   }

   public void setgxTv_SdtPedido_Disartcod_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartcod_Z");
      gxTv_SdtPedido_Disartcod_Z = value ;
   }

   public void setgxTv_SdtPedido_Disartcod_Z_SetNull( )
   {
      gxTv_SdtPedido_Disartcod_Z = "" ;
      SetDirty("Disartcod_Z");
   }

   public boolean getgxTv_SdtPedido_Disartcod_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPedido_E_disartcod_Z( )
   {
      return gxTv_SdtPedido_E_disartcod_Z ;
   }

   public void setgxTv_SdtPedido_E_disartcod_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("E_disartcod_Z");
      gxTv_SdtPedido_E_disartcod_Z = value ;
   }

   public void setgxTv_SdtPedido_E_disartcod_Z_SetNull( )
   {
      gxTv_SdtPedido_E_disartcod_Z = (short)(0) ;
      SetDirty("E_disartcod_Z");
   }

   public boolean getgxTv_SdtPedido_E_disartcod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Disartdsc_Z( )
   {
      return gxTv_SdtPedido_Disartdsc_Z ;
   }

   public void setgxTv_SdtPedido_Disartdsc_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartdsc_Z");
      gxTv_SdtPedido_Disartdsc_Z = value ;
   }

   public void setgxTv_SdtPedido_Disartdsc_Z_SetNull( )
   {
      gxTv_SdtPedido_Disartdsc_Z = "" ;
      SetDirty("Disartdsc_Z");
   }

   public boolean getgxTv_SdtPedido_Disartdsc_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPedido_Disarttip_Z( )
   {
      return gxTv_SdtPedido_Disarttip_Z ;
   }

   public void setgxTv_SdtPedido_Disarttip_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disarttip_Z");
      gxTv_SdtPedido_Disarttip_Z = value ;
   }

   public void setgxTv_SdtPedido_Disarttip_Z_SetNull( )
   {
      gxTv_SdtPedido_Disarttip_Z = (short)(0) ;
      SetDirty("Disarttip_Z");
   }

   public boolean getgxTv_SdtPedido_Disarttip_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Disarttipd_Z( )
   {
      return gxTv_SdtPedido_Disarttipd_Z ;
   }

   public void setgxTv_SdtPedido_Disarttipd_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disarttipd_Z");
      gxTv_SdtPedido_Disarttipd_Z = value ;
   }

   public void setgxTv_SdtPedido_Disarttipd_Z_SetNull( )
   {
      gxTv_SdtPedido_Disarttipd_Z = "" ;
      SetDirty("Disarttipd_Z");
   }

   public boolean getgxTv_SdtPedido_Disarttipd_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Disartmat_Z( )
   {
      return gxTv_SdtPedido_Disartmat_Z ;
   }

   public void setgxTv_SdtPedido_Disartmat_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartmat_Z");
      gxTv_SdtPedido_Disartmat_Z = value ;
   }

   public void setgxTv_SdtPedido_Disartmat_Z_SetNull( )
   {
      gxTv_SdtPedido_Disartmat_Z = "" ;
      SetDirty("Disartmat_Z");
   }

   public boolean getgxTv_SdtPedido_Disartmat_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Disarttr1_Z( )
   {
      return gxTv_SdtPedido_Disarttr1_Z ;
   }

   public void setgxTv_SdtPedido_Disarttr1_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disarttr1_Z");
      gxTv_SdtPedido_Disarttr1_Z = value ;
   }

   public void setgxTv_SdtPedido_Disarttr1_Z_SetNull( )
   {
      gxTv_SdtPedido_Disarttr1_Z = "" ;
      SetDirty("Disarttr1_Z");
   }

   public boolean getgxTv_SdtPedido_Disarttr1_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPedido_Disartpt1_Z( )
   {
      return gxTv_SdtPedido_Disartpt1_Z ;
   }

   public void setgxTv_SdtPedido_Disartpt1_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartpt1_Z");
      gxTv_SdtPedido_Disartpt1_Z = value ;
   }

   public void setgxTv_SdtPedido_Disartpt1_Z_SetNull( )
   {
      gxTv_SdtPedido_Disartpt1_Z = (short)(0) ;
      SetDirty("Disartpt1_Z");
   }

   public boolean getgxTv_SdtPedido_Disartpt1_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Disarttr2_Z( )
   {
      return gxTv_SdtPedido_Disarttr2_Z ;
   }

   public void setgxTv_SdtPedido_Disarttr2_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disarttr2_Z");
      gxTv_SdtPedido_Disarttr2_Z = value ;
   }

   public void setgxTv_SdtPedido_Disarttr2_Z_SetNull( )
   {
      gxTv_SdtPedido_Disarttr2_Z = "" ;
      SetDirty("Disarttr2_Z");
   }

   public boolean getgxTv_SdtPedido_Disarttr2_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPedido_Disartpt2_Z( )
   {
      return gxTv_SdtPedido_Disartpt2_Z ;
   }

   public void setgxTv_SdtPedido_Disartpt2_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartpt2_Z");
      gxTv_SdtPedido_Disartpt2_Z = value ;
   }

   public void setgxTv_SdtPedido_Disartpt2_Z_SetNull( )
   {
      gxTv_SdtPedido_Disartpt2_Z = (short)(0) ;
      SetDirty("Disartpt2_Z");
   }

   public boolean getgxTv_SdtPedido_Disartpt2_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Disarttr3_Z( )
   {
      return gxTv_SdtPedido_Disarttr3_Z ;
   }

   public void setgxTv_SdtPedido_Disarttr3_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disarttr3_Z");
      gxTv_SdtPedido_Disarttr3_Z = value ;
   }

   public void setgxTv_SdtPedido_Disarttr3_Z_SetNull( )
   {
      gxTv_SdtPedido_Disarttr3_Z = "" ;
      SetDirty("Disarttr3_Z");
   }

   public boolean getgxTv_SdtPedido_Disarttr3_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPedido_Disartpt3_Z( )
   {
      return gxTv_SdtPedido_Disartpt3_Z ;
   }

   public void setgxTv_SdtPedido_Disartpt3_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartpt3_Z");
      gxTv_SdtPedido_Disartpt3_Z = value ;
   }

   public void setgxTv_SdtPedido_Disartpt3_Z_SetNull( )
   {
      gxTv_SdtPedido_Disartpt3_Z = (short)(0) ;
      SetDirty("Disartpt3_Z");
   }

   public boolean getgxTv_SdtPedido_Disartpt3_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Disartur1_Z( )
   {
      return gxTv_SdtPedido_Disartur1_Z ;
   }

   public void setgxTv_SdtPedido_Disartur1_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartur1_Z");
      gxTv_SdtPedido_Disartur1_Z = value ;
   }

   public void setgxTv_SdtPedido_Disartur1_Z_SetNull( )
   {
      gxTv_SdtPedido_Disartur1_Z = "" ;
      SetDirty("Disartur1_Z");
   }

   public boolean getgxTv_SdtPedido_Disartur1_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPedido_Disartpu1_Z( )
   {
      return gxTv_SdtPedido_Disartpu1_Z ;
   }

   public void setgxTv_SdtPedido_Disartpu1_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartpu1_Z");
      gxTv_SdtPedido_Disartpu1_Z = value ;
   }

   public void setgxTv_SdtPedido_Disartpu1_Z_SetNull( )
   {
      gxTv_SdtPedido_Disartpu1_Z = (short)(0) ;
      SetDirty("Disartpu1_Z");
   }

   public boolean getgxTv_SdtPedido_Disartpu1_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Disartur2_Z( )
   {
      return gxTv_SdtPedido_Disartur2_Z ;
   }

   public void setgxTv_SdtPedido_Disartur2_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartur2_Z");
      gxTv_SdtPedido_Disartur2_Z = value ;
   }

   public void setgxTv_SdtPedido_Disartur2_Z_SetNull( )
   {
      gxTv_SdtPedido_Disartur2_Z = "" ;
      SetDirty("Disartur2_Z");
   }

   public boolean getgxTv_SdtPedido_Disartur2_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPedido_Disartpu2_Z( )
   {
      return gxTv_SdtPedido_Disartpu2_Z ;
   }

   public void setgxTv_SdtPedido_Disartpu2_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartpu2_Z");
      gxTv_SdtPedido_Disartpu2_Z = value ;
   }

   public void setgxTv_SdtPedido_Disartpu2_Z_SetNull( )
   {
      gxTv_SdtPedido_Disartpu2_Z = (short)(0) ;
      SetDirty("Disartpu2_Z");
   }

   public boolean getgxTv_SdtPedido_Disartpu2_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Disartur3_Z( )
   {
      return gxTv_SdtPedido_Disartur3_Z ;
   }

   public void setgxTv_SdtPedido_Disartur3_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartur3_Z");
      gxTv_SdtPedido_Disartur3_Z = value ;
   }

   public void setgxTv_SdtPedido_Disartur3_Z_SetNull( )
   {
      gxTv_SdtPedido_Disartur3_Z = "" ;
      SetDirty("Disartur3_Z");
   }

   public boolean getgxTv_SdtPedido_Disartur3_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPedido_Disartpu3_Z( )
   {
      return gxTv_SdtPedido_Disartpu3_Z ;
   }

   public void setgxTv_SdtPedido_Disartpu3_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartpu3_Z");
      gxTv_SdtPedido_Disartpu3_Z = value ;
   }

   public void setgxTv_SdtPedido_Disartpu3_Z_SetNull( )
   {
      gxTv_SdtPedido_Disartpu3_Z = (short)(0) ;
      SetDirty("Disartpu3_Z");
   }

   public boolean getgxTv_SdtPedido_Disartpu3_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Discolnom_Z( )
   {
      return gxTv_SdtPedido_Discolnom_Z ;
   }

   public void setgxTv_SdtPedido_Discolnom_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Discolnom_Z");
      gxTv_SdtPedido_Discolnom_Z = value ;
   }

   public void setgxTv_SdtPedido_Discolnom_Z_SetNull( )
   {
      gxTv_SdtPedido_Discolnom_Z = "" ;
      SetDirty("Discolnom_Z");
   }

   public boolean getgxTv_SdtPedido_Discolnom_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtPedido_Discolnum_Z( )
   {
      return gxTv_SdtPedido_Discolnum_Z ;
   }

   public void setgxTv_SdtPedido_Discolnum_Z( int value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Discolnum_Z");
      gxTv_SdtPedido_Discolnum_Z = value ;
   }

   public void setgxTv_SdtPedido_Discolnum_Z_SetNull( )
   {
      gxTv_SdtPedido_Discolnum_Z = 0 ;
      SetDirty("Discolnum_Z");
   }

   public boolean getgxTv_SdtPedido_Discolnum_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPedido_Distipcol_Z( )
   {
      return gxTv_SdtPedido_Distipcol_Z ;
   }

   public void setgxTv_SdtPedido_Distipcol_Z( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Distipcol_Z");
      gxTv_SdtPedido_Distipcol_Z = value ;
   }

   public void setgxTv_SdtPedido_Distipcol_Z_SetNull( )
   {
      gxTv_SdtPedido_Distipcol_Z = (byte)(0) ;
      SetDirty("Distipcol_Z");
   }

   public boolean getgxTv_SdtPedido_Distipcol_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPedido_Disest_Z( )
   {
      return gxTv_SdtPedido_Disest_Z ;
   }

   public void setgxTv_SdtPedido_Disest_Z( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disest_Z");
      gxTv_SdtPedido_Disest_Z = value ;
   }

   public void setgxTv_SdtPedido_Disest_Z_SetNull( )
   {
      gxTv_SdtPedido_Disest_Z = (byte)(0) ;
      SetDirty("Disest_Z");
   }

   public boolean getgxTv_SdtPedido_Disest_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Disdes_Z( )
   {
      return gxTv_SdtPedido_Disdes_Z ;
   }

   public void setgxTv_SdtPedido_Disdes_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disdes_Z");
      gxTv_SdtPedido_Disdes_Z = value ;
   }

   public void setgxTv_SdtPedido_Disdes_Z_SetNull( )
   {
      gxTv_SdtPedido_Disdes_Z = "" ;
      SetDirty("Disdes_Z");
   }

   public boolean getgxTv_SdtPedido_Disdes_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Disartdsc2_Z( )
   {
      return gxTv_SdtPedido_Disartdsc2_Z ;
   }

   public void setgxTv_SdtPedido_Disartdsc2_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartdsc2_Z");
      gxTv_SdtPedido_Disartdsc2_Z = value ;
   }

   public void setgxTv_SdtPedido_Disartdsc2_Z_SetNull( )
   {
      gxTv_SdtPedido_Disartdsc2_Z = "" ;
      SetDirty("Disartdsc2_Z");
   }

   public boolean getgxTv_SdtPedido_Disartdsc2_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Disple2_Z( )
   {
      return gxTv_SdtPedido_Disple2_Z ;
   }

   public void setgxTv_SdtPedido_Disple2_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disple2_Z");
      gxTv_SdtPedido_Disple2_Z = value ;
   }

   public void setgxTv_SdtPedido_Disple2_Z_SetNull( )
   {
      gxTv_SdtPedido_Disple2_Z = "" ;
      SetDirty("Disple2_Z");
   }

   public boolean getgxTv_SdtPedido_Disple2_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Disartlar_Z( )
   {
      return gxTv_SdtPedido_Disartlar_Z ;
   }

   public void setgxTv_SdtPedido_Disartlar_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartlar_Z");
      gxTv_SdtPedido_Disartlar_Z = value ;
   }

   public void setgxTv_SdtPedido_Disartlar_Z_SetNull( )
   {
      gxTv_SdtPedido_Disartlar_Z = "" ;
      SetDirty("Disartlar_Z");
   }

   public boolean getgxTv_SdtPedido_Disartlar_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Disartsua_Z( )
   {
      return gxTv_SdtPedido_Disartsua_Z ;
   }

   public void setgxTv_SdtPedido_Disartsua_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartsua_Z");
      gxTv_SdtPedido_Disartsua_Z = value ;
   }

   public void setgxTv_SdtPedido_Disartsua_Z_SetNull( )
   {
      gxTv_SdtPedido_Disartsua_Z = "" ;
      SetDirty("Disartsua_Z");
   }

   public boolean getgxTv_SdtPedido_Disartsua_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Disartaca_Z( )
   {
      return gxTv_SdtPedido_Disartaca_Z ;
   }

   public void setgxTv_SdtPedido_Disartaca_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartaca_Z");
      gxTv_SdtPedido_Disartaca_Z = value ;
   }

   public void setgxTv_SdtPedido_Disartaca_Z_SetNull( )
   {
      gxTv_SdtPedido_Disartaca_Z = "" ;
      SetDirty("Disartaca_Z");
   }

   public boolean getgxTv_SdtPedido_Disartaca_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Disartenc_Z( )
   {
      return gxTv_SdtPedido_Disartenc_Z ;
   }

   public void setgxTv_SdtPedido_Disartenc_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartenc_Z");
      gxTv_SdtPedido_Disartenc_Z = value ;
   }

   public void setgxTv_SdtPedido_Disartenc_Z_SetNull( )
   {
      gxTv_SdtPedido_Disartenc_Z = "" ;
      SetDirty("Disartenc_Z");
   }

   public boolean getgxTv_SdtPedido_Disartenc_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Disartcor_Z( )
   {
      return gxTv_SdtPedido_Disartcor_Z ;
   }

   public void setgxTv_SdtPedido_Disartcor_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartcor_Z");
      gxTv_SdtPedido_Disartcor_Z = value ;
   }

   public void setgxTv_SdtPedido_Disartcor_Z_SetNull( )
   {
      gxTv_SdtPedido_Disartcor_Z = "" ;
      SetDirty("Disartcor_Z");
   }

   public boolean getgxTv_SdtPedido_Disartcor_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPedido_Disartpes_Z( )
   {
      return gxTv_SdtPedido_Disartpes_Z ;
   }

   public void setgxTv_SdtPedido_Disartpes_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartpes_Z");
      gxTv_SdtPedido_Disartpes_Z = value ;
   }

   public void setgxTv_SdtPedido_Disartpes_Z_SetNull( )
   {
      gxTv_SdtPedido_Disartpes_Z = (short)(0) ;
      SetDirty("Disartpes_Z");
   }

   public boolean getgxTv_SdtPedido_Disartpes_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtPedido_Disartrdt_Z( )
   {
      return gxTv_SdtPedido_Disartrdt_Z ;
   }

   public void setgxTv_SdtPedido_Disartrdt_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartrdt_Z");
      gxTv_SdtPedido_Disartrdt_Z = value ;
   }

   public void setgxTv_SdtPedido_Disartrdt_Z_SetNull( )
   {
      gxTv_SdtPedido_Disartrdt_Z = DecimalUtil.ZERO ;
      SetDirty("Disartrdt_Z");
   }

   public boolean getgxTv_SdtPedido_Disartrdt_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPedido_Disarturg_Z( )
   {
      return gxTv_SdtPedido_Disarturg_Z ;
   }

   public void setgxTv_SdtPedido_Disarturg_Z( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disarturg_Z");
      gxTv_SdtPedido_Disarturg_Z = value ;
   }

   public void setgxTv_SdtPedido_Disarturg_Z_SetNull( )
   {
      gxTv_SdtPedido_Disarturg_Z = (byte)(0) ;
      SetDirty("Disarturg_Z");
   }

   public boolean getgxTv_SdtPedido_Disarturg_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPedido_Disgracru_Z( )
   {
      return gxTv_SdtPedido_Disgracru_Z ;
   }

   public void setgxTv_SdtPedido_Disgracru_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disgracru_Z");
      gxTv_SdtPedido_Disgracru_Z = value ;
   }

   public void setgxTv_SdtPedido_Disgracru_Z_SetNull( )
   {
      gxTv_SdtPedido_Disgracru_Z = (short)(0) ;
      SetDirty("Disgracru_Z");
   }

   public boolean getgxTv_SdtPedido_Disgracru_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPedido_Disartanh_Z( )
   {
      return gxTv_SdtPedido_Disartanh_Z ;
   }

   public void setgxTv_SdtPedido_Disartanh_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartanh_Z");
      gxTv_SdtPedido_Disartanh_Z = value ;
   }

   public void setgxTv_SdtPedido_Disartanh_Z_SetNull( )
   {
      gxTv_SdtPedido_Disartanh_Z = (short)(0) ;
      SetDirty("Disartanh_Z");
   }

   public boolean getgxTv_SdtPedido_Disartanh_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPedido_Disartan1_Z( )
   {
      return gxTv_SdtPedido_Disartan1_Z ;
   }

   public void setgxTv_SdtPedido_Disartan1_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartan1_Z");
      gxTv_SdtPedido_Disartan1_Z = value ;
   }

   public void setgxTv_SdtPedido_Disartan1_Z_SetNull( )
   {
      gxTv_SdtPedido_Disartan1_Z = (short)(0) ;
      SetDirty("Disartan1_Z");
   }

   public boolean getgxTv_SdtPedido_Disartan1_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPedido_Disartacb_Z( )
   {
      return gxTv_SdtPedido_Disartacb_Z ;
   }

   public void setgxTv_SdtPedido_Disartacb_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartacb_Z");
      gxTv_SdtPedido_Disartacb_Z = value ;
   }

   public void setgxTv_SdtPedido_Disartacb_Z_SetNull( )
   {
      gxTv_SdtPedido_Disartacb_Z = (short)(0) ;
      SetDirty("Disartacb_Z");
   }

   public boolean getgxTv_SdtPedido_Disartacb_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPedido_Disartac2_Z( )
   {
      return gxTv_SdtPedido_Disartac2_Z ;
   }

   public void setgxTv_SdtPedido_Disartac2_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartac2_Z");
      gxTv_SdtPedido_Disartac2_Z = value ;
   }

   public void setgxTv_SdtPedido_Disartac2_Z_SetNull( )
   {
      gxTv_SdtPedido_Disartac2_Z = (short)(0) ;
      SetDirty("Disartac2_Z");
   }

   public boolean getgxTv_SdtPedido_Disartac2_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtPedido_Disenccom_Z( )
   {
      return gxTv_SdtPedido_Disenccom_Z ;
   }

   public void setgxTv_SdtPedido_Disenccom_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disenccom_Z");
      gxTv_SdtPedido_Disenccom_Z = value ;
   }

   public void setgxTv_SdtPedido_Disenccom_Z_SetNull( )
   {
      gxTv_SdtPedido_Disenccom_Z = DecimalUtil.ZERO ;
      SetDirty("Disenccom_Z");
   }

   public boolean getgxTv_SdtPedido_Disenccom_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtPedido_Disencanh_Z( )
   {
      return gxTv_SdtPedido_Disencanh_Z ;
   }

   public void setgxTv_SdtPedido_Disencanh_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disencanh_Z");
      gxTv_SdtPedido_Disencanh_Z = value ;
   }

   public void setgxTv_SdtPedido_Disencanh_Z_SetNull( )
   {
      gxTv_SdtPedido_Disencanh_Z = DecimalUtil.ZERO ;
      SetDirty("Disencanh_Z");
   }

   public boolean getgxTv_SdtPedido_Disencanh_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPedido_Disnumcor_Z( )
   {
      return gxTv_SdtPedido_Disnumcor_Z ;
   }

   public void setgxTv_SdtPedido_Disnumcor_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disnumcor_Z");
      gxTv_SdtPedido_Disnumcor_Z = value ;
   }

   public void setgxTv_SdtPedido_Disnumcor_Z_SetNull( )
   {
      gxTv_SdtPedido_Disnumcor_Z = (short)(0) ;
      SetDirty("Disnumcor_Z");
   }

   public boolean getgxTv_SdtPedido_Disnumcor_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPedido_Disancsal1_Z( )
   {
      return gxTv_SdtPedido_Disancsal1_Z ;
   }

   public void setgxTv_SdtPedido_Disancsal1_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disancsal1_Z");
      gxTv_SdtPedido_Disancsal1_Z = value ;
   }

   public void setgxTv_SdtPedido_Disancsal1_Z_SetNull( )
   {
      gxTv_SdtPedido_Disancsal1_Z = (short)(0) ;
      SetDirty("Disancsal1_Z");
   }

   public boolean getgxTv_SdtPedido_Disancsal1_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPedido_Disancsal2_Z( )
   {
      return gxTv_SdtPedido_Disancsal2_Z ;
   }

   public void setgxTv_SdtPedido_Disancsal2_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disancsal2_Z");
      gxTv_SdtPedido_Disancsal2_Z = value ;
   }

   public void setgxTv_SdtPedido_Disancsal2_Z_SetNull( )
   {
      gxTv_SdtPedido_Disancsal2_Z = (short)(0) ;
      SetDirty("Disancsal2_Z");
   }

   public boolean getgxTv_SdtPedido_Disancsal2_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPedido_Disancsal3_Z( )
   {
      return gxTv_SdtPedido_Disancsal3_Z ;
   }

   public void setgxTv_SdtPedido_Disancsal3_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disancsal3_Z");
      gxTv_SdtPedido_Disancsal3_Z = value ;
   }

   public void setgxTv_SdtPedido_Disancsal3_Z_SetNull( )
   {
      gxTv_SdtPedido_Disancsal3_Z = (short)(0) ;
      SetDirty("Disancsal3_Z");
   }

   public boolean getgxTv_SdtPedido_Disancsal3_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPedido_Disgraaca2_Z( )
   {
      return gxTv_SdtPedido_Disgraaca2_Z ;
   }

   public void setgxTv_SdtPedido_Disgraaca2_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disgraaca2_Z");
      gxTv_SdtPedido_Disgraaca2_Z = value ;
   }

   public void setgxTv_SdtPedido_Disgraaca2_Z_SetNull( )
   {
      gxTv_SdtPedido_Disgraaca2_Z = (short)(0) ;
      SetDirty("Disgraaca2_Z");
   }

   public boolean getgxTv_SdtPedido_Disgraaca2_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPedido_Disgracru2_Z( )
   {
      return gxTv_SdtPedido_Disgracru2_Z ;
   }

   public void setgxTv_SdtPedido_Disgracru2_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disgracru2_Z");
      gxTv_SdtPedido_Disgracru2_Z = value ;
   }

   public void setgxTv_SdtPedido_Disgracru2_Z_SetNull( )
   {
      gxTv_SdtPedido_Disgracru2_Z = (short)(0) ;
      SetDirty("Disgracru2_Z");
   }

   public boolean getgxTv_SdtPedido_Disgracru2_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPedido_Disgraaca_Z( )
   {
      return gxTv_SdtPedido_Disgraaca_Z ;
   }

   public void setgxTv_SdtPedido_Disgraaca_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disgraaca_Z");
      gxTv_SdtPedido_Disgraaca_Z = value ;
   }

   public void setgxTv_SdtPedido_Disgraaca_Z_SetNull( )
   {
      gxTv_SdtPedido_Disgraaca_Z = (short)(0) ;
      SetDirty("Disgraaca_Z");
   }

   public boolean getgxTv_SdtPedido_Disgraaca_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtPedido_Disrdoa_Z( )
   {
      return gxTv_SdtPedido_Disrdoa_Z ;
   }

   public void setgxTv_SdtPedido_Disrdoa_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disrdoa_Z");
      gxTv_SdtPedido_Disrdoa_Z = value ;
   }

   public void setgxTv_SdtPedido_Disrdoa_Z_SetNull( )
   {
      gxTv_SdtPedido_Disrdoa_Z = DecimalUtil.ZERO ;
      SetDirty("Disrdoa_Z");
   }

   public boolean getgxTv_SdtPedido_Disrdoa_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtPedido_Disrdon_Z( )
   {
      return gxTv_SdtPedido_Disrdon_Z ;
   }

   public void setgxTv_SdtPedido_Disrdon_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disrdon_Z");
      gxTv_SdtPedido_Disrdon_Z = value ;
   }

   public void setgxTv_SdtPedido_Disrdon_Z_SetNull( )
   {
      gxTv_SdtPedido_Disrdon_Z = DecimalUtil.ZERO ;
      SetDirty("Disrdon_Z");
   }

   public boolean getgxTv_SdtPedido_Disrdon_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Disobsgrm_Z( )
   {
      return gxTv_SdtPedido_Disobsgrm_Z ;
   }

   public void setgxTv_SdtPedido_Disobsgrm_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disobsgrm_Z");
      gxTv_SdtPedido_Disobsgrm_Z = value ;
   }

   public void setgxTv_SdtPedido_Disobsgrm_Z_SetNull( )
   {
      gxTv_SdtPedido_Disobsgrm_Z = "" ;
      SetDirty("Disobsgrm_Z");
   }

   public boolean getgxTv_SdtPedido_Disobsgrm_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Disobsanc_Z( )
   {
      return gxTv_SdtPedido_Disobsanc_Z ;
   }

   public void setgxTv_SdtPedido_Disobsanc_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disobsanc_Z");
      gxTv_SdtPedido_Disobsanc_Z = value ;
   }

   public void setgxTv_SdtPedido_Disobsanc_Z_SetNull( )
   {
      gxTv_SdtPedido_Disobsanc_Z = "" ;
      SetDirty("Disobsanc_Z");
   }

   public boolean getgxTv_SdtPedido_Disobsanc_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Disitem5_Z( )
   {
      return gxTv_SdtPedido_Disitem5_Z ;
   }

   public void setgxTv_SdtPedido_Disitem5_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disitem5_Z");
      gxTv_SdtPedido_Disitem5_Z = value ;
   }

   public void setgxTv_SdtPedido_Disitem5_Z_SetNull( )
   {
      gxTv_SdtPedido_Disitem5_Z = "" ;
      SetDirty("Disitem5_Z");
   }

   public boolean getgxTv_SdtPedido_Disitem5_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Disartple_Z( )
   {
      return gxTv_SdtPedido_Disartple_Z ;
   }

   public void setgxTv_SdtPedido_Disartple_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartple_Z");
      gxTv_SdtPedido_Disartple_Z = value ;
   }

   public void setgxTv_SdtPedido_Disartple_Z_SetNull( )
   {
      gxTv_SdtPedido_Disartple_Z = "" ;
      SetDirty("Disartple_Z");
   }

   public boolean getgxTv_SdtPedido_Disartple_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Disunimed_Z( )
   {
      return gxTv_SdtPedido_Disunimed_Z ;
   }

   public void setgxTv_SdtPedido_Disunimed_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disunimed_Z");
      gxTv_SdtPedido_Disunimed_Z = value ;
   }

   public void setgxTv_SdtPedido_Disunimed_Z_SetNull( )
   {
      gxTv_SdtPedido_Disunimed_Z = "" ;
      SetDirty("Disunimed_Z");
   }

   public boolean getgxTv_SdtPedido_Disunimed_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Cod_idtx_Z( )
   {
      return gxTv_SdtPedido_Cod_idtx_Z ;
   }

   public void setgxTv_SdtPedido_Cod_idtx_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Cod_idtx_Z");
      gxTv_SdtPedido_Cod_idtx_Z = value ;
   }

   public void setgxTv_SdtPedido_Cod_idtx_Z_SetNull( )
   {
      gxTv_SdtPedido_Cod_idtx_Z = "" ;
      SetDirty("Cod_idtx_Z");
   }

   public boolean getgxTv_SdtPedido_Cod_idtx_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Dsc_idtx_Z( )
   {
      return gxTv_SdtPedido_Dsc_idtx_Z ;
   }

   public void setgxTv_SdtPedido_Dsc_idtx_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Dsc_idtx_Z");
      gxTv_SdtPedido_Dsc_idtx_Z = value ;
   }

   public void setgxTv_SdtPedido_Dsc_idtx_Z_SetNull( )
   {
      gxTv_SdtPedido_Dsc_idtx_Z = "" ;
      SetDirty("Dsc_idtx_Z");
   }

   public boolean getgxTv_SdtPedido_Dsc_idtx_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Disordcomp_Z( )
   {
      return gxTv_SdtPedido_Disordcomp_Z ;
   }

   public void setgxTv_SdtPedido_Disordcomp_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disordcomp_Z");
      gxTv_SdtPedido_Disordcomp_Z = value ;
   }

   public void setgxTv_SdtPedido_Disordcomp_Z_SetNull( )
   {
      gxTv_SdtPedido_Disordcomp_Z = "" ;
      SetDirty("Disordcomp_Z");
   }

   public boolean getgxTv_SdtPedido_Disordcomp_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Revenid_Z( )
   {
      return gxTv_SdtPedido_Revenid_Z ;
   }

   public void setgxTv_SdtPedido_Revenid_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Revenid_Z");
      gxTv_SdtPedido_Revenid_Z = value ;
   }

   public void setgxTv_SdtPedido_Revenid_Z_SetNull( )
   {
      gxTv_SdtPedido_Revenid_Z = "" ;
      SetDirty("Revenid_Z");
   }

   public boolean getgxTv_SdtPedido_Revenid_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Revennm_Z( )
   {
      return gxTv_SdtPedido_Revennm_Z ;
   }

   public void setgxTv_SdtPedido_Revennm_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Revennm_Z");
      gxTv_SdtPedido_Revennm_Z = value ;
   }

   public void setgxTv_SdtPedido_Revennm_Z_SetNull( )
   {
      gxTv_SdtPedido_Revennm_Z = "" ;
      SetDirty("Revennm_Z");
   }

   public boolean getgxTv_SdtPedido_Revennm_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Marcaid_Z( )
   {
      return gxTv_SdtPedido_Marcaid_Z ;
   }

   public void setgxTv_SdtPedido_Marcaid_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Marcaid_Z");
      gxTv_SdtPedido_Marcaid_Z = value ;
   }

   public void setgxTv_SdtPedido_Marcaid_Z_SetNull( )
   {
      gxTv_SdtPedido_Marcaid_Z = "" ;
      SetDirty("Marcaid_Z");
   }

   public boolean getgxTv_SdtPedido_Marcaid_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Marcadsc_Z( )
   {
      return gxTv_SdtPedido_Marcadsc_Z ;
   }

   public void setgxTv_SdtPedido_Marcadsc_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Marcadsc_Z");
      gxTv_SdtPedido_Marcadsc_Z = value ;
   }

   public void setgxTv_SdtPedido_Marcadsc_Z_SetNull( )
   {
      gxTv_SdtPedido_Marcadsc_Z = "" ;
      SetDirty("Marcadsc_Z");
   }

   public boolean getgxTv_SdtPedido_Marcadsc_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Disidtx2_Z( )
   {
      return gxTv_SdtPedido_Disidtx2_Z ;
   }

   public void setgxTv_SdtPedido_Disidtx2_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disidtx2_Z");
      gxTv_SdtPedido_Disidtx2_Z = value ;
   }

   public void setgxTv_SdtPedido_Disidtx2_Z_SetNull( )
   {
      gxTv_SdtPedido_Disidtx2_Z = "" ;
      SetDirty("Disidtx2_Z");
   }

   public boolean getgxTv_SdtPedido_Disidtx2_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPedido_Dispriorid_Z( )
   {
      return gxTv_SdtPedido_Dispriorid_Z ;
   }

   public void setgxTv_SdtPedido_Dispriorid_Z( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Dispriorid_Z");
      gxTv_SdtPedido_Dispriorid_Z = value ;
   }

   public void setgxTv_SdtPedido_Dispriorid_Z_SetNull( )
   {
      gxTv_SdtPedido_Dispriorid_Z = (byte)(0) ;
      SetDirty("Dispriorid_Z");
   }

   public boolean getgxTv_SdtPedido_Dispriorid_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Nxt_modelo_Z( )
   {
      return gxTv_SdtPedido_Nxt_modelo_Z ;
   }

   public void setgxTv_SdtPedido_Nxt_modelo_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Nxt_modelo_Z");
      gxTv_SdtPedido_Nxt_modelo_Z = value ;
   }

   public void setgxTv_SdtPedido_Nxt_modelo_Z_SetNull( )
   {
      gxTv_SdtPedido_Nxt_modelo_Z = "" ;
      SetDirty("Nxt_modelo_Z");
   }

   public boolean getgxTv_SdtPedido_Nxt_modelo_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPedido_Cpteid_Z( )
   {
      return gxTv_SdtPedido_Cpteid_Z ;
   }

   public void setgxTv_SdtPedido_Cpteid_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Cpteid_Z");
      gxTv_SdtPedido_Cpteid_Z = value ;
   }

   public void setgxTv_SdtPedido_Cpteid_Z_SetNull( )
   {
      gxTv_SdtPedido_Cpteid_Z = (short)(0) ;
      SetDirty("Cpteid_Z");
   }

   public boolean getgxTv_SdtPedido_Cpteid_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Cptedsc_Z( )
   {
      return gxTv_SdtPedido_Cptedsc_Z ;
   }

   public void setgxTv_SdtPedido_Cptedsc_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Cptedsc_Z");
      gxTv_SdtPedido_Cptedsc_Z = value ;
   }

   public void setgxTv_SdtPedido_Cptedsc_Z_SetNull( )
   {
      gxTv_SdtPedido_Cptedsc_Z = "" ;
      SetDirty("Cptedsc_Z");
   }

   public boolean getgxTv_SdtPedido_Cptedsc_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Nxt_statio_Z( )
   {
      return gxTv_SdtPedido_Nxt_statio_Z ;
   }

   public void setgxTv_SdtPedido_Nxt_statio_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Nxt_statio_Z");
      gxTv_SdtPedido_Nxt_statio_Z = value ;
   }

   public void setgxTv_SdtPedido_Nxt_statio_Z_SetNull( )
   {
      gxTv_SdtPedido_Nxt_statio_Z = "" ;
      SetDirty("Nxt_statio_Z");
   }

   public boolean getgxTv_SdtPedido_Nxt_statio_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPedido_Desaid_Z( )
   {
      return gxTv_SdtPedido_Desaid_Z ;
   }

   public void setgxTv_SdtPedido_Desaid_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Desaid_Z");
      gxTv_SdtPedido_Desaid_Z = value ;
   }

   public void setgxTv_SdtPedido_Desaid_Z_SetNull( )
   {
      gxTv_SdtPedido_Desaid_Z = (short)(0) ;
      SetDirty("Desaid_Z");
   }

   public boolean getgxTv_SdtPedido_Desaid_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Desadsc_Z( )
   {
      return gxTv_SdtPedido_Desadsc_Z ;
   }

   public void setgxTv_SdtPedido_Desadsc_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Desadsc_Z");
      gxTv_SdtPedido_Desadsc_Z = value ;
   }

   public void setgxTv_SdtPedido_Desadsc_Z_SetNull( )
   {
      gxTv_SdtPedido_Desadsc_Z = "" ;
      SetDirty("Desadsc_Z");
   }

   public boolean getgxTv_SdtPedido_Desadsc_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPedido_Dptoid_Z( )
   {
      return gxTv_SdtPedido_Dptoid_Z ;
   }

   public void setgxTv_SdtPedido_Dptoid_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Dptoid_Z");
      gxTv_SdtPedido_Dptoid_Z = value ;
   }

   public void setgxTv_SdtPedido_Dptoid_Z_SetNull( )
   {
      gxTv_SdtPedido_Dptoid_Z = (short)(0) ;
      SetDirty("Dptoid_Z");
   }

   public boolean getgxTv_SdtPedido_Dptoid_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Dptodsc_Z( )
   {
      return gxTv_SdtPedido_Dptodsc_Z ;
   }

   public void setgxTv_SdtPedido_Dptodsc_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Dptodsc_Z");
      gxTv_SdtPedido_Dptodsc_Z = value ;
   }

   public void setgxTv_SdtPedido_Dptodsc_Z_SetNull( )
   {
      gxTv_SdtPedido_Dptodsc_Z = "" ;
      SetDirty("Dptodsc_Z");
   }

   public boolean getgxTv_SdtPedido_Dptodsc_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Nxt_artcli_Z( )
   {
      return gxTv_SdtPedido_Nxt_artcli_Z ;
   }

   public void setgxTv_SdtPedido_Nxt_artcli_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Nxt_artcli_Z");
      gxTv_SdtPedido_Nxt_artcli_Z = value ;
   }

   public void setgxTv_SdtPedido_Nxt_artcli_Z_SetNull( )
   {
      gxTv_SdtPedido_Nxt_artcli_Z = "" ;
      SetDirty("Nxt_artcli_Z");
   }

   public boolean getgxTv_SdtPedido_Nxt_artcli_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Disexp_Z( )
   {
      return gxTv_SdtPedido_Disexp_Z ;
   }

   public void setgxTv_SdtPedido_Disexp_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disexp_Z");
      gxTv_SdtPedido_Disexp_Z = value ;
   }

   public void setgxTv_SdtPedido_Disexp_Z_SetNull( )
   {
      gxTv_SdtPedido_Disexp_Z = "" ;
      SetDirty("Disexp_Z");
   }

   public boolean getgxTv_SdtPedido_Disexp_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPedido_Emprnom_N( )
   {
      return gxTv_SdtPedido_Emprnom_N ;
   }

   public void setgxTv_SdtPedido_Emprnom_N( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Emprnom_N");
      gxTv_SdtPedido_Emprnom_N = value ;
   }

   public void setgxTv_SdtPedido_Emprnom_N_SetNull( )
   {
      gxTv_SdtPedido_Emprnom_N = (byte)(0) ;
      SetDirty("Emprnom_N");
   }

   public boolean getgxTv_SdtPedido_Emprnom_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPedido_Distipdis_N( )
   {
      return gxTv_SdtPedido_Distipdis_N ;
   }

   public void setgxTv_SdtPedido_Distipdis_N( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Distipdis_N");
      gxTv_SdtPedido_Distipdis_N = value ;
   }

   public void setgxTv_SdtPedido_Distipdis_N_SetNull( )
   {
      gxTv_SdtPedido_Distipdis_N = (byte)(0) ;
      SetDirty("Distipdis_N");
   }

   public boolean getgxTv_SdtPedido_Distipdis_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPedido_E_disclides_N( )
   {
      return gxTv_SdtPedido_E_disclides_N ;
   }

   public void setgxTv_SdtPedido_E_disclides_N( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("E_disclides_N");
      gxTv_SdtPedido_E_disclides_N = value ;
   }

   public void setgxTv_SdtPedido_E_disclides_N_SetNull( )
   {
      gxTv_SdtPedido_E_disclides_N = (byte)(0) ;
      SetDirty("E_disclides_N");
   }

   public boolean getgxTv_SdtPedido_E_disclides_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPedido_E_disartcod_N( )
   {
      return gxTv_SdtPedido_E_disartcod_N ;
   }

   public void setgxTv_SdtPedido_E_disartcod_N( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("E_disartcod_N");
      gxTv_SdtPedido_E_disartcod_N = value ;
   }

   public void setgxTv_SdtPedido_E_disartcod_N_SetNull( )
   {
      gxTv_SdtPedido_E_disartcod_N = (byte)(0) ;
      SetDirty("E_disartcod_N");
   }

   public boolean getgxTv_SdtPedido_E_disartcod_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPedido_Disartpu3_N( )
   {
      return gxTv_SdtPedido_Disartpu3_N ;
   }

   public void setgxTv_SdtPedido_Disartpu3_N( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disartpu3_N");
      gxTv_SdtPedido_Disartpu3_N = value ;
   }

   public void setgxTv_SdtPedido_Disartpu3_N_SetNull( )
   {
      gxTv_SdtPedido_Disartpu3_N = (byte)(0) ;
      SetDirty("Disartpu3_N");
   }

   public boolean getgxTv_SdtPedido_Disartpu3_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPedido_Discolnom_N( )
   {
      return gxTv_SdtPedido_Discolnom_N ;
   }

   public void setgxTv_SdtPedido_Discolnom_N( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Discolnom_N");
      gxTv_SdtPedido_Discolnom_N = value ;
   }

   public void setgxTv_SdtPedido_Discolnom_N_SetNull( )
   {
      gxTv_SdtPedido_Discolnom_N = (byte)(0) ;
      SetDirty("Discolnom_N");
   }

   public boolean getgxTv_SdtPedido_Discolnom_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPedido_Discolnum_N( )
   {
      return gxTv_SdtPedido_Discolnum_N ;
   }

   public void setgxTv_SdtPedido_Discolnum_N( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Discolnum_N");
      gxTv_SdtPedido_Discolnum_N = value ;
   }

   public void setgxTv_SdtPedido_Discolnum_N_SetNull( )
   {
      gxTv_SdtPedido_Discolnum_N = (byte)(0) ;
      SetDirty("Discolnum_N");
   }

   public boolean getgxTv_SdtPedido_Discolnum_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPedido_Distipcol_N( )
   {
      return gxTv_SdtPedido_Distipcol_N ;
   }

   public void setgxTv_SdtPedido_Distipcol_N( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Distipcol_N");
      gxTv_SdtPedido_Distipcol_N = value ;
   }

   public void setgxTv_SdtPedido_Distipcol_N_SetNull( )
   {
      gxTv_SdtPedido_Distipcol_N = (byte)(0) ;
      SetDirty("Distipcol_N");
   }

   public boolean getgxTv_SdtPedido_Distipcol_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPedido_Cod_idtx_N( )
   {
      return gxTv_SdtPedido_Cod_idtx_N ;
   }

   public void setgxTv_SdtPedido_Cod_idtx_N( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Cod_idtx_N");
      gxTv_SdtPedido_Cod_idtx_N = value ;
   }

   public void setgxTv_SdtPedido_Cod_idtx_N_SetNull( )
   {
      gxTv_SdtPedido_Cod_idtx_N = (byte)(0) ;
      SetDirty("Cod_idtx_N");
   }

   public boolean getgxTv_SdtPedido_Cod_idtx_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPedido_Dsc_idtx_N( )
   {
      return gxTv_SdtPedido_Dsc_idtx_N ;
   }

   public void setgxTv_SdtPedido_Dsc_idtx_N( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Dsc_idtx_N");
      gxTv_SdtPedido_Dsc_idtx_N = value ;
   }

   public void setgxTv_SdtPedido_Dsc_idtx_N_SetNull( )
   {
      gxTv_SdtPedido_Dsc_idtx_N = (byte)(0) ;
      SetDirty("Dsc_idtx_N");
   }

   public boolean getgxTv_SdtPedido_Dsc_idtx_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPedido_Revenid_N( )
   {
      return gxTv_SdtPedido_Revenid_N ;
   }

   public void setgxTv_SdtPedido_Revenid_N( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Revenid_N");
      gxTv_SdtPedido_Revenid_N = value ;
   }

   public void setgxTv_SdtPedido_Revenid_N_SetNull( )
   {
      gxTv_SdtPedido_Revenid_N = (byte)(0) ;
      SetDirty("Revenid_N");
   }

   public boolean getgxTv_SdtPedido_Revenid_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPedido_Revennm_N( )
   {
      return gxTv_SdtPedido_Revennm_N ;
   }

   public void setgxTv_SdtPedido_Revennm_N( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Revennm_N");
      gxTv_SdtPedido_Revennm_N = value ;
   }

   public void setgxTv_SdtPedido_Revennm_N_SetNull( )
   {
      gxTv_SdtPedido_Revennm_N = (byte)(0) ;
      SetDirty("Revennm_N");
   }

   public boolean getgxTv_SdtPedido_Revennm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPedido_Marcaid_N( )
   {
      return gxTv_SdtPedido_Marcaid_N ;
   }

   public void setgxTv_SdtPedido_Marcaid_N( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Marcaid_N");
      gxTv_SdtPedido_Marcaid_N = value ;
   }

   public void setgxTv_SdtPedido_Marcaid_N_SetNull( )
   {
      gxTv_SdtPedido_Marcaid_N = (byte)(0) ;
      SetDirty("Marcaid_N");
   }

   public boolean getgxTv_SdtPedido_Marcaid_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPedido_Marcadsc_N( )
   {
      return gxTv_SdtPedido_Marcadsc_N ;
   }

   public void setgxTv_SdtPedido_Marcadsc_N( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Marcadsc_N");
      gxTv_SdtPedido_Marcadsc_N = value ;
   }

   public void setgxTv_SdtPedido_Marcadsc_N_SetNull( )
   {
      gxTv_SdtPedido_Marcadsc_N = (byte)(0) ;
      SetDirty("Marcadsc_N");
   }

   public boolean getgxTv_SdtPedido_Marcadsc_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPedido_Disidtx2_N( )
   {
      return gxTv_SdtPedido_Disidtx2_N ;
   }

   public void setgxTv_SdtPedido_Disidtx2_N( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Disidtx2_N");
      gxTv_SdtPedido_Disidtx2_N = value ;
   }

   public void setgxTv_SdtPedido_Disidtx2_N_SetNull( )
   {
      gxTv_SdtPedido_Disidtx2_N = (byte)(0) ;
      SetDirty("Disidtx2_N");
   }

   public boolean getgxTv_SdtPedido_Disidtx2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPedido_Cpteid_N( )
   {
      return gxTv_SdtPedido_Cpteid_N ;
   }

   public void setgxTv_SdtPedido_Cpteid_N( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Cpteid_N");
      gxTv_SdtPedido_Cpteid_N = value ;
   }

   public void setgxTv_SdtPedido_Cpteid_N_SetNull( )
   {
      gxTv_SdtPedido_Cpteid_N = (byte)(0) ;
      SetDirty("Cpteid_N");
   }

   public boolean getgxTv_SdtPedido_Cpteid_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPedido_Cptedsc_N( )
   {
      return gxTv_SdtPedido_Cptedsc_N ;
   }

   public void setgxTv_SdtPedido_Cptedsc_N( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Cptedsc_N");
      gxTv_SdtPedido_Cptedsc_N = value ;
   }

   public void setgxTv_SdtPedido_Cptedsc_N_SetNull( )
   {
      gxTv_SdtPedido_Cptedsc_N = (byte)(0) ;
      SetDirty("Cptedsc_N");
   }

   public boolean getgxTv_SdtPedido_Cptedsc_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPedido_Desaid_N( )
   {
      return gxTv_SdtPedido_Desaid_N ;
   }

   public void setgxTv_SdtPedido_Desaid_N( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Desaid_N");
      gxTv_SdtPedido_Desaid_N = value ;
   }

   public void setgxTv_SdtPedido_Desaid_N_SetNull( )
   {
      gxTv_SdtPedido_Desaid_N = (byte)(0) ;
      SetDirty("Desaid_N");
   }

   public boolean getgxTv_SdtPedido_Desaid_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPedido_Desadsc_N( )
   {
      return gxTv_SdtPedido_Desadsc_N ;
   }

   public void setgxTv_SdtPedido_Desadsc_N( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Desadsc_N");
      gxTv_SdtPedido_Desadsc_N = value ;
   }

   public void setgxTv_SdtPedido_Desadsc_N_SetNull( )
   {
      gxTv_SdtPedido_Desadsc_N = (byte)(0) ;
      SetDirty("Desadsc_N");
   }

   public boolean getgxTv_SdtPedido_Desadsc_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPedido_Dptoid_N( )
   {
      return gxTv_SdtPedido_Dptoid_N ;
   }

   public void setgxTv_SdtPedido_Dptoid_N( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Dptoid_N");
      gxTv_SdtPedido_Dptoid_N = value ;
   }

   public void setgxTv_SdtPedido_Dptoid_N_SetNull( )
   {
      gxTv_SdtPedido_Dptoid_N = (byte)(0) ;
      SetDirty("Dptoid_N");
   }

   public boolean getgxTv_SdtPedido_Dptoid_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPedido_Dptodsc_N( )
   {
      return gxTv_SdtPedido_Dptodsc_N ;
   }

   public void setgxTv_SdtPedido_Dptodsc_N( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      SetDirty("Dptodsc_N");
      gxTv_SdtPedido_Dptodsc_N = value ;
   }

   public void setgxTv_SdtPedido_Dptodsc_N_SetNull( )
   {
      gxTv_SdtPedido_Dptodsc_N = (byte)(0) ;
      SetDirty("Dptodsc_N");
   }

   public boolean getgxTv_SdtPedido_Dptodsc_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      app.pedidosclientesindetalle.pedido_bc obj;
      obj = new app.pedidosclientesindetalle.pedido_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtPedido_Emprcod = "" ;
      gxTv_SdtPedido_N = (byte)(1) ;
      gxTv_SdtPedido_Emprnom = "" ;
      gxTv_SdtPedido_Pricod = "" ;
      gxTv_SdtPedido_Distipdis = "" ;
      gxTv_SdtPedido_Disenccli = "" ;
      gxTv_SdtPedido_Clinom = "" ;
      gxTv_SdtPedido_Clinomdes = "" ;
      gxTv_SdtPedido_Disfec = GXutil.nullDate() ;
      gxTv_SdtPedido_Disfeccli = GXutil.nullDate() ;
      gxTv_SdtPedido_Disfecent = GXutil.nullDate() ;
      gxTv_SdtPedido_Disartcod = "" ;
      gxTv_SdtPedido_Disartdsc = "" ;
      gxTv_SdtPedido_Disarttipd = "" ;
      gxTv_SdtPedido_Disartmat = "" ;
      gxTv_SdtPedido_Disarttr1 = "" ;
      gxTv_SdtPedido_Disarttr2 = "" ;
      gxTv_SdtPedido_Disarttr3 = "" ;
      gxTv_SdtPedido_Disartur1 = "" ;
      gxTv_SdtPedido_Disartur2 = "" ;
      gxTv_SdtPedido_Disartur3 = "" ;
      gxTv_SdtPedido_Discolnom = "" ;
      gxTv_SdtPedido_Disdes = "" ;
      gxTv_SdtPedido_Disartdsc2 = "" ;
      gxTv_SdtPedido_Disple2 = "" ;
      gxTv_SdtPedido_Disartlar = "" ;
      gxTv_SdtPedido_Disartsua = "" ;
      gxTv_SdtPedido_Disartaca = "" ;
      gxTv_SdtPedido_Disartenc = "" ;
      gxTv_SdtPedido_Disartcor = "" ;
      gxTv_SdtPedido_Disartrdt = DecimalUtil.ZERO ;
      gxTv_SdtPedido_Disenccom = DecimalUtil.ZERO ;
      gxTv_SdtPedido_Disencanh = DecimalUtil.ZERO ;
      gxTv_SdtPedido_Disrdoa = DecimalUtil.ZERO ;
      gxTv_SdtPedido_Disrdon = DecimalUtil.ZERO ;
      gxTv_SdtPedido_Disobsgrm = "" ;
      gxTv_SdtPedido_Disobsanc = "" ;
      gxTv_SdtPedido_Disitem5 = "" ;
      gxTv_SdtPedido_Disartple = "" ;
      gxTv_SdtPedido_Disunimed = "" ;
      gxTv_SdtPedido_Cod_idtx = "" ;
      gxTv_SdtPedido_Dsc_idtx = "" ;
      gxTv_SdtPedido_Disordcomp = "" ;
      gxTv_SdtPedido_Revenid = "" ;
      gxTv_SdtPedido_Revennm = "" ;
      gxTv_SdtPedido_Marcaid = "" ;
      gxTv_SdtPedido_Marcadsc = "" ;
      gxTv_SdtPedido_Disidtx2 = "" ;
      gxTv_SdtPedido_Nxt_modelo = "" ;
      gxTv_SdtPedido_Cptedsc = "" ;
      gxTv_SdtPedido_Nxt_statio = "" ;
      gxTv_SdtPedido_Desadsc = "" ;
      gxTv_SdtPedido_Dptodsc = "" ;
      gxTv_SdtPedido_Nxt_artcli = "" ;
      gxTv_SdtPedido_Disexp = "" ;
      gxTv_SdtPedido_Mode = "" ;
      gxTv_SdtPedido_Emprcod_Z = "" ;
      gxTv_SdtPedido_Emprnom_Z = "" ;
      gxTv_SdtPedido_Pricod_Z = "" ;
      gxTv_SdtPedido_Distipdis_Z = "" ;
      gxTv_SdtPedido_Disenccli_Z = "" ;
      gxTv_SdtPedido_Clinom_Z = "" ;
      gxTv_SdtPedido_Clinomdes_Z = "" ;
      gxTv_SdtPedido_Disfec_Z = GXutil.nullDate() ;
      gxTv_SdtPedido_Disfeccli_Z = GXutil.nullDate() ;
      gxTv_SdtPedido_Disfecent_Z = GXutil.nullDate() ;
      gxTv_SdtPedido_Disartcod_Z = "" ;
      gxTv_SdtPedido_Disartdsc_Z = "" ;
      gxTv_SdtPedido_Disarttipd_Z = "" ;
      gxTv_SdtPedido_Disartmat_Z = "" ;
      gxTv_SdtPedido_Disarttr1_Z = "" ;
      gxTv_SdtPedido_Disarttr2_Z = "" ;
      gxTv_SdtPedido_Disarttr3_Z = "" ;
      gxTv_SdtPedido_Disartur1_Z = "" ;
      gxTv_SdtPedido_Disartur2_Z = "" ;
      gxTv_SdtPedido_Disartur3_Z = "" ;
      gxTv_SdtPedido_Discolnom_Z = "" ;
      gxTv_SdtPedido_Disdes_Z = "" ;
      gxTv_SdtPedido_Disartdsc2_Z = "" ;
      gxTv_SdtPedido_Disple2_Z = "" ;
      gxTv_SdtPedido_Disartlar_Z = "" ;
      gxTv_SdtPedido_Disartsua_Z = "" ;
      gxTv_SdtPedido_Disartaca_Z = "" ;
      gxTv_SdtPedido_Disartenc_Z = "" ;
      gxTv_SdtPedido_Disartcor_Z = "" ;
      gxTv_SdtPedido_Disartrdt_Z = DecimalUtil.ZERO ;
      gxTv_SdtPedido_Disenccom_Z = DecimalUtil.ZERO ;
      gxTv_SdtPedido_Disencanh_Z = DecimalUtil.ZERO ;
      gxTv_SdtPedido_Disrdoa_Z = DecimalUtil.ZERO ;
      gxTv_SdtPedido_Disrdon_Z = DecimalUtil.ZERO ;
      gxTv_SdtPedido_Disobsgrm_Z = "" ;
      gxTv_SdtPedido_Disobsanc_Z = "" ;
      gxTv_SdtPedido_Disitem5_Z = "" ;
      gxTv_SdtPedido_Disartple_Z = "" ;
      gxTv_SdtPedido_Disunimed_Z = "" ;
      gxTv_SdtPedido_Cod_idtx_Z = "" ;
      gxTv_SdtPedido_Dsc_idtx_Z = "" ;
      gxTv_SdtPedido_Disordcomp_Z = "" ;
      gxTv_SdtPedido_Revenid_Z = "" ;
      gxTv_SdtPedido_Revennm_Z = "" ;
      gxTv_SdtPedido_Marcaid_Z = "" ;
      gxTv_SdtPedido_Marcadsc_Z = "" ;
      gxTv_SdtPedido_Disidtx2_Z = "" ;
      gxTv_SdtPedido_Nxt_modelo_Z = "" ;
      gxTv_SdtPedido_Cptedsc_Z = "" ;
      gxTv_SdtPedido_Nxt_statio_Z = "" ;
      gxTv_SdtPedido_Desadsc_Z = "" ;
      gxTv_SdtPedido_Dptodsc_Z = "" ;
      gxTv_SdtPedido_Nxt_artcli_Z = "" ;
      gxTv_SdtPedido_Disexp_Z = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtPedido_N ;
   }

   public app.pedidosclientesindetalle.SdtPedido Clone( )
   {
      app.pedidosclientesindetalle.SdtPedido sdt;
      app.pedidosclientesindetalle.pedido_bc obj;
      sdt = (app.pedidosclientesindetalle.SdtPedido)(clone()) ;
      obj = (app.pedidosclientesindetalle.pedido_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( app.pedidosclientesindetalle.StructSdtPedido struct )
   {
      setgxTv_SdtPedido_Emprcod(struct.getEmprcod());
      setgxTv_SdtPedido_Emprnom(struct.getEmprnom());
      setgxTv_SdtPedido_Pricod(struct.getPricod());
      setgxTv_SdtPedido_Discod(struct.getDiscod());
      setgxTv_SdtPedido_Distipdis(struct.getDistipdis());
      setgxTv_SdtPedido_Disenccli(struct.getDisenccli());
      setgxTv_SdtPedido_Clicod(struct.getClicod());
      setgxTv_SdtPedido_Clinom(struct.getClinom());
      setgxTv_SdtPedido_Disclides(struct.getDisclides());
      setgxTv_SdtPedido_Clinomdes(struct.getClinomdes());
      setgxTv_SdtPedido_E_disclides(struct.getE_disclides());
      setgxTv_SdtPedido_Disfec(struct.getDisfec());
      setgxTv_SdtPedido_Disfeccli(struct.getDisfeccli());
      setgxTv_SdtPedido_Disfecent(struct.getDisfecent());
      setgxTv_SdtPedido_Disartcod(struct.getDisartcod());
      setgxTv_SdtPedido_E_disartcod(struct.getE_disartcod());
      setgxTv_SdtPedido_Disartdsc(struct.getDisartdsc());
      setgxTv_SdtPedido_Disarttip(struct.getDisarttip());
      setgxTv_SdtPedido_Disarttipd(struct.getDisarttipd());
      setgxTv_SdtPedido_Disartmat(struct.getDisartmat());
      setgxTv_SdtPedido_Disarttr1(struct.getDisarttr1());
      setgxTv_SdtPedido_Disartpt1(struct.getDisartpt1());
      setgxTv_SdtPedido_Disarttr2(struct.getDisarttr2());
      setgxTv_SdtPedido_Disartpt2(struct.getDisartpt2());
      setgxTv_SdtPedido_Disarttr3(struct.getDisarttr3());
      setgxTv_SdtPedido_Disartpt3(struct.getDisartpt3());
      setgxTv_SdtPedido_Disartur1(struct.getDisartur1());
      setgxTv_SdtPedido_Disartpu1(struct.getDisartpu1());
      setgxTv_SdtPedido_Disartur2(struct.getDisartur2());
      setgxTv_SdtPedido_Disartpu2(struct.getDisartpu2());
      setgxTv_SdtPedido_Disartur3(struct.getDisartur3());
      setgxTv_SdtPedido_Disartpu3(struct.getDisartpu3());
      setgxTv_SdtPedido_Discolnom(struct.getDiscolnom());
      setgxTv_SdtPedido_Discolnum(struct.getDiscolnum());
      setgxTv_SdtPedido_Distipcol(struct.getDistipcol());
      setgxTv_SdtPedido_Disest(struct.getDisest());
      setgxTv_SdtPedido_Disdes(struct.getDisdes());
      setgxTv_SdtPedido_Disartdsc2(struct.getDisartdsc2());
      setgxTv_SdtPedido_Disple2(struct.getDisple2());
      setgxTv_SdtPedido_Disartlar(struct.getDisartlar());
      setgxTv_SdtPedido_Disartsua(struct.getDisartsua());
      setgxTv_SdtPedido_Disartaca(struct.getDisartaca());
      setgxTv_SdtPedido_Disartenc(struct.getDisartenc());
      setgxTv_SdtPedido_Disartcor(struct.getDisartcor());
      setgxTv_SdtPedido_Disartpes(struct.getDisartpes());
      setgxTv_SdtPedido_Disartrdt(struct.getDisartrdt());
      setgxTv_SdtPedido_Disarturg(struct.getDisarturg());
      setgxTv_SdtPedido_Disgracru(struct.getDisgracru());
      setgxTv_SdtPedido_Disartanh(struct.getDisartanh());
      setgxTv_SdtPedido_Disartan1(struct.getDisartan1());
      setgxTv_SdtPedido_Disartacb(struct.getDisartacb());
      setgxTv_SdtPedido_Disartac2(struct.getDisartac2());
      setgxTv_SdtPedido_Disenccom(struct.getDisenccom());
      setgxTv_SdtPedido_Disencanh(struct.getDisencanh());
      setgxTv_SdtPedido_Disnumcor(struct.getDisnumcor());
      setgxTv_SdtPedido_Disancsal1(struct.getDisancsal1());
      setgxTv_SdtPedido_Disancsal2(struct.getDisancsal2());
      setgxTv_SdtPedido_Disancsal3(struct.getDisancsal3());
      setgxTv_SdtPedido_Disgraaca2(struct.getDisgraaca2());
      setgxTv_SdtPedido_Disgracru2(struct.getDisgracru2());
      setgxTv_SdtPedido_Disgraaca(struct.getDisgraaca());
      setgxTv_SdtPedido_Disrdoa(struct.getDisrdoa());
      setgxTv_SdtPedido_Disrdon(struct.getDisrdon());
      setgxTv_SdtPedido_Disobsgrm(struct.getDisobsgrm());
      setgxTv_SdtPedido_Disobsanc(struct.getDisobsanc());
      setgxTv_SdtPedido_Disitem5(struct.getDisitem5());
      setgxTv_SdtPedido_Disartple(struct.getDisartple());
      setgxTv_SdtPedido_Disunimed(struct.getDisunimed());
      setgxTv_SdtPedido_Cod_idtx(struct.getCod_idtx());
      setgxTv_SdtPedido_Dsc_idtx(struct.getDsc_idtx());
      setgxTv_SdtPedido_Disordcomp(struct.getDisordcomp());
      setgxTv_SdtPedido_Revenid(struct.getRevenid());
      setgxTv_SdtPedido_Revennm(struct.getRevennm());
      setgxTv_SdtPedido_Marcaid(struct.getMarcaid());
      setgxTv_SdtPedido_Marcadsc(struct.getMarcadsc());
      setgxTv_SdtPedido_Disidtx2(struct.getDisidtx2());
      setgxTv_SdtPedido_Dispriorid(struct.getDispriorid());
      setgxTv_SdtPedido_Nxt_modelo(struct.getNxt_modelo());
      setgxTv_SdtPedido_Cpteid(struct.getCpteid());
      setgxTv_SdtPedido_Cptedsc(struct.getCptedsc());
      setgxTv_SdtPedido_Nxt_statio(struct.getNxt_statio());
      setgxTv_SdtPedido_Desaid(struct.getDesaid());
      setgxTv_SdtPedido_Desadsc(struct.getDesadsc());
      setgxTv_SdtPedido_Dptoid(struct.getDptoid());
      setgxTv_SdtPedido_Dptodsc(struct.getDptodsc());
      setgxTv_SdtPedido_Nxt_artcli(struct.getNxt_artcli());
      setgxTv_SdtPedido_Disexp(struct.getDisexp());
      GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Norma> gxTv_SdtPedido_Norma_aux = new GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Norma>(app.pedidosclientesindetalle.SdtPedido_Norma.class, "Pedido.Norma", "TexplusNET", remoteHandle);
      Vector<app.pedidosclientesindetalle.StructSdtPedido_Norma> gxTv_SdtPedido_Norma_aux1 = struct.getNorma();
      if (gxTv_SdtPedido_Norma_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtPedido_Norma_aux1.size(); i++)
         {
            gxTv_SdtPedido_Norma_aux.add(new app.pedidosclientesindetalle.SdtPedido_Norma(remoteHandle, gxTv_SdtPedido_Norma_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtPedido_Norma(gxTv_SdtPedido_Norma_aux);
      GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_AlmacenTejido> gxTv_SdtPedido_Almacentejido_aux = new GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_AlmacenTejido>(app.pedidosclientesindetalle.SdtPedido_AlmacenTejido.class, "Pedido.AlmacenTejido", "TexplusNET", remoteHandle);
      Vector<app.pedidosclientesindetalle.StructSdtPedido_AlmacenTejido> gxTv_SdtPedido_Almacentejido_aux1 = struct.getAlmacentejido();
      if (gxTv_SdtPedido_Almacentejido_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtPedido_Almacentejido_aux1.size(); i++)
         {
            gxTv_SdtPedido_Almacentejido_aux.add(new app.pedidosclientesindetalle.SdtPedido_AlmacenTejido(remoteHandle, gxTv_SdtPedido_Almacentejido_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtPedido_Almacentejido(gxTv_SdtPedido_Almacentejido_aux);
      GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Defecto> gxTv_SdtPedido_Defecto_aux = new GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Defecto>(app.pedidosclientesindetalle.SdtPedido_Defecto.class, "Pedido.Defecto", "TexplusNET", remoteHandle);
      Vector<app.pedidosclientesindetalle.StructSdtPedido_Defecto> gxTv_SdtPedido_Defecto_aux1 = struct.getDefecto();
      if (gxTv_SdtPedido_Defecto_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtPedido_Defecto_aux1.size(); i++)
         {
            gxTv_SdtPedido_Defecto_aux.add(new app.pedidosclientesindetalle.SdtPedido_Defecto(remoteHandle, gxTv_SdtPedido_Defecto_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtPedido_Defecto(gxTv_SdtPedido_Defecto_aux);
      GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Proceso> gxTv_SdtPedido_Proceso_aux = new GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Proceso>(app.pedidosclientesindetalle.SdtPedido_Proceso.class, "Pedido.Proceso", "TexplusNET", remoteHandle);
      Vector<app.pedidosclientesindetalle.StructSdtPedido_Proceso> gxTv_SdtPedido_Proceso_aux1 = struct.getProceso();
      if (gxTv_SdtPedido_Proceso_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtPedido_Proceso_aux1.size(); i++)
         {
            gxTv_SdtPedido_Proceso_aux.add(new app.pedidosclientesindetalle.SdtPedido_Proceso(remoteHandle, gxTv_SdtPedido_Proceso_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtPedido_Proceso(gxTv_SdtPedido_Proceso_aux);
      setgxTv_SdtPedido_Mode(struct.getMode());
      setgxTv_SdtPedido_Initialized(struct.getInitialized());
      setgxTv_SdtPedido_Emprcod_Z(struct.getEmprcod_Z());
      setgxTv_SdtPedido_Emprnom_Z(struct.getEmprnom_Z());
      setgxTv_SdtPedido_Pricod_Z(struct.getPricod_Z());
      setgxTv_SdtPedido_Discod_Z(struct.getDiscod_Z());
      setgxTv_SdtPedido_Distipdis_Z(struct.getDistipdis_Z());
      setgxTv_SdtPedido_Disenccli_Z(struct.getDisenccli_Z());
      setgxTv_SdtPedido_Clicod_Z(struct.getClicod_Z());
      setgxTv_SdtPedido_Clinom_Z(struct.getClinom_Z());
      setgxTv_SdtPedido_Disclides_Z(struct.getDisclides_Z());
      setgxTv_SdtPedido_Clinomdes_Z(struct.getClinomdes_Z());
      setgxTv_SdtPedido_E_disclides_Z(struct.getE_disclides_Z());
      setgxTv_SdtPedido_Disfec_Z(struct.getDisfec_Z());
      setgxTv_SdtPedido_Disfeccli_Z(struct.getDisfeccli_Z());
      setgxTv_SdtPedido_Disfecent_Z(struct.getDisfecent_Z());
      setgxTv_SdtPedido_Disartcod_Z(struct.getDisartcod_Z());
      setgxTv_SdtPedido_E_disartcod_Z(struct.getE_disartcod_Z());
      setgxTv_SdtPedido_Disartdsc_Z(struct.getDisartdsc_Z());
      setgxTv_SdtPedido_Disarttip_Z(struct.getDisarttip_Z());
      setgxTv_SdtPedido_Disarttipd_Z(struct.getDisarttipd_Z());
      setgxTv_SdtPedido_Disartmat_Z(struct.getDisartmat_Z());
      setgxTv_SdtPedido_Disarttr1_Z(struct.getDisarttr1_Z());
      setgxTv_SdtPedido_Disartpt1_Z(struct.getDisartpt1_Z());
      setgxTv_SdtPedido_Disarttr2_Z(struct.getDisarttr2_Z());
      setgxTv_SdtPedido_Disartpt2_Z(struct.getDisartpt2_Z());
      setgxTv_SdtPedido_Disarttr3_Z(struct.getDisarttr3_Z());
      setgxTv_SdtPedido_Disartpt3_Z(struct.getDisartpt3_Z());
      setgxTv_SdtPedido_Disartur1_Z(struct.getDisartur1_Z());
      setgxTv_SdtPedido_Disartpu1_Z(struct.getDisartpu1_Z());
      setgxTv_SdtPedido_Disartur2_Z(struct.getDisartur2_Z());
      setgxTv_SdtPedido_Disartpu2_Z(struct.getDisartpu2_Z());
      setgxTv_SdtPedido_Disartur3_Z(struct.getDisartur3_Z());
      setgxTv_SdtPedido_Disartpu3_Z(struct.getDisartpu3_Z());
      setgxTv_SdtPedido_Discolnom_Z(struct.getDiscolnom_Z());
      setgxTv_SdtPedido_Discolnum_Z(struct.getDiscolnum_Z());
      setgxTv_SdtPedido_Distipcol_Z(struct.getDistipcol_Z());
      setgxTv_SdtPedido_Disest_Z(struct.getDisest_Z());
      setgxTv_SdtPedido_Disdes_Z(struct.getDisdes_Z());
      setgxTv_SdtPedido_Disartdsc2_Z(struct.getDisartdsc2_Z());
      setgxTv_SdtPedido_Disple2_Z(struct.getDisple2_Z());
      setgxTv_SdtPedido_Disartlar_Z(struct.getDisartlar_Z());
      setgxTv_SdtPedido_Disartsua_Z(struct.getDisartsua_Z());
      setgxTv_SdtPedido_Disartaca_Z(struct.getDisartaca_Z());
      setgxTv_SdtPedido_Disartenc_Z(struct.getDisartenc_Z());
      setgxTv_SdtPedido_Disartcor_Z(struct.getDisartcor_Z());
      setgxTv_SdtPedido_Disartpes_Z(struct.getDisartpes_Z());
      setgxTv_SdtPedido_Disartrdt_Z(struct.getDisartrdt_Z());
      setgxTv_SdtPedido_Disarturg_Z(struct.getDisarturg_Z());
      setgxTv_SdtPedido_Disgracru_Z(struct.getDisgracru_Z());
      setgxTv_SdtPedido_Disartanh_Z(struct.getDisartanh_Z());
      setgxTv_SdtPedido_Disartan1_Z(struct.getDisartan1_Z());
      setgxTv_SdtPedido_Disartacb_Z(struct.getDisartacb_Z());
      setgxTv_SdtPedido_Disartac2_Z(struct.getDisartac2_Z());
      setgxTv_SdtPedido_Disenccom_Z(struct.getDisenccom_Z());
      setgxTv_SdtPedido_Disencanh_Z(struct.getDisencanh_Z());
      setgxTv_SdtPedido_Disnumcor_Z(struct.getDisnumcor_Z());
      setgxTv_SdtPedido_Disancsal1_Z(struct.getDisancsal1_Z());
      setgxTv_SdtPedido_Disancsal2_Z(struct.getDisancsal2_Z());
      setgxTv_SdtPedido_Disancsal3_Z(struct.getDisancsal3_Z());
      setgxTv_SdtPedido_Disgraaca2_Z(struct.getDisgraaca2_Z());
      setgxTv_SdtPedido_Disgracru2_Z(struct.getDisgracru2_Z());
      setgxTv_SdtPedido_Disgraaca_Z(struct.getDisgraaca_Z());
      setgxTv_SdtPedido_Disrdoa_Z(struct.getDisrdoa_Z());
      setgxTv_SdtPedido_Disrdon_Z(struct.getDisrdon_Z());
      setgxTv_SdtPedido_Disobsgrm_Z(struct.getDisobsgrm_Z());
      setgxTv_SdtPedido_Disobsanc_Z(struct.getDisobsanc_Z());
      setgxTv_SdtPedido_Disitem5_Z(struct.getDisitem5_Z());
      setgxTv_SdtPedido_Disartple_Z(struct.getDisartple_Z());
      setgxTv_SdtPedido_Disunimed_Z(struct.getDisunimed_Z());
      setgxTv_SdtPedido_Cod_idtx_Z(struct.getCod_idtx_Z());
      setgxTv_SdtPedido_Dsc_idtx_Z(struct.getDsc_idtx_Z());
      setgxTv_SdtPedido_Disordcomp_Z(struct.getDisordcomp_Z());
      setgxTv_SdtPedido_Revenid_Z(struct.getRevenid_Z());
      setgxTv_SdtPedido_Revennm_Z(struct.getRevennm_Z());
      setgxTv_SdtPedido_Marcaid_Z(struct.getMarcaid_Z());
      setgxTv_SdtPedido_Marcadsc_Z(struct.getMarcadsc_Z());
      setgxTv_SdtPedido_Disidtx2_Z(struct.getDisidtx2_Z());
      setgxTv_SdtPedido_Dispriorid_Z(struct.getDispriorid_Z());
      setgxTv_SdtPedido_Nxt_modelo_Z(struct.getNxt_modelo_Z());
      setgxTv_SdtPedido_Cpteid_Z(struct.getCpteid_Z());
      setgxTv_SdtPedido_Cptedsc_Z(struct.getCptedsc_Z());
      setgxTv_SdtPedido_Nxt_statio_Z(struct.getNxt_statio_Z());
      setgxTv_SdtPedido_Desaid_Z(struct.getDesaid_Z());
      setgxTv_SdtPedido_Desadsc_Z(struct.getDesadsc_Z());
      setgxTv_SdtPedido_Dptoid_Z(struct.getDptoid_Z());
      setgxTv_SdtPedido_Dptodsc_Z(struct.getDptodsc_Z());
      setgxTv_SdtPedido_Nxt_artcli_Z(struct.getNxt_artcli_Z());
      setgxTv_SdtPedido_Disexp_Z(struct.getDisexp_Z());
      setgxTv_SdtPedido_Emprnom_N(struct.getEmprnom_N());
      setgxTv_SdtPedido_Distipdis_N(struct.getDistipdis_N());
      setgxTv_SdtPedido_E_disclides_N(struct.getE_disclides_N());
      setgxTv_SdtPedido_E_disartcod_N(struct.getE_disartcod_N());
      setgxTv_SdtPedido_Disartpu3_N(struct.getDisartpu3_N());
      setgxTv_SdtPedido_Discolnom_N(struct.getDiscolnom_N());
      setgxTv_SdtPedido_Discolnum_N(struct.getDiscolnum_N());
      setgxTv_SdtPedido_Distipcol_N(struct.getDistipcol_N());
      setgxTv_SdtPedido_Cod_idtx_N(struct.getCod_idtx_N());
      setgxTv_SdtPedido_Dsc_idtx_N(struct.getDsc_idtx_N());
      setgxTv_SdtPedido_Revenid_N(struct.getRevenid_N());
      setgxTv_SdtPedido_Revennm_N(struct.getRevennm_N());
      setgxTv_SdtPedido_Marcaid_N(struct.getMarcaid_N());
      setgxTv_SdtPedido_Marcadsc_N(struct.getMarcadsc_N());
      setgxTv_SdtPedido_Disidtx2_N(struct.getDisidtx2_N());
      setgxTv_SdtPedido_Cpteid_N(struct.getCpteid_N());
      setgxTv_SdtPedido_Cptedsc_N(struct.getCptedsc_N());
      setgxTv_SdtPedido_Desaid_N(struct.getDesaid_N());
      setgxTv_SdtPedido_Desadsc_N(struct.getDesadsc_N());
      setgxTv_SdtPedido_Dptoid_N(struct.getDptoid_N());
      setgxTv_SdtPedido_Dptodsc_N(struct.getDptodsc_N());
   }

   @SuppressWarnings("unchecked")
   public app.pedidosclientesindetalle.StructSdtPedido getStruct( )
   {
      app.pedidosclientesindetalle.StructSdtPedido struct = new app.pedidosclientesindetalle.StructSdtPedido ();
      struct.setEmprcod(getgxTv_SdtPedido_Emprcod());
      struct.setEmprnom(getgxTv_SdtPedido_Emprnom());
      struct.setPricod(getgxTv_SdtPedido_Pricod());
      struct.setDiscod(getgxTv_SdtPedido_Discod());
      struct.setDistipdis(getgxTv_SdtPedido_Distipdis());
      struct.setDisenccli(getgxTv_SdtPedido_Disenccli());
      struct.setClicod(getgxTv_SdtPedido_Clicod());
      struct.setClinom(getgxTv_SdtPedido_Clinom());
      struct.setDisclides(getgxTv_SdtPedido_Disclides());
      struct.setClinomdes(getgxTv_SdtPedido_Clinomdes());
      struct.setE_disclides(getgxTv_SdtPedido_E_disclides());
      struct.setDisfec(getgxTv_SdtPedido_Disfec());
      struct.setDisfeccli(getgxTv_SdtPedido_Disfeccli());
      struct.setDisfecent(getgxTv_SdtPedido_Disfecent());
      struct.setDisartcod(getgxTv_SdtPedido_Disartcod());
      struct.setE_disartcod(getgxTv_SdtPedido_E_disartcod());
      struct.setDisartdsc(getgxTv_SdtPedido_Disartdsc());
      struct.setDisarttip(getgxTv_SdtPedido_Disarttip());
      struct.setDisarttipd(getgxTv_SdtPedido_Disarttipd());
      struct.setDisartmat(getgxTv_SdtPedido_Disartmat());
      struct.setDisarttr1(getgxTv_SdtPedido_Disarttr1());
      struct.setDisartpt1(getgxTv_SdtPedido_Disartpt1());
      struct.setDisarttr2(getgxTv_SdtPedido_Disarttr2());
      struct.setDisartpt2(getgxTv_SdtPedido_Disartpt2());
      struct.setDisarttr3(getgxTv_SdtPedido_Disarttr3());
      struct.setDisartpt3(getgxTv_SdtPedido_Disartpt3());
      struct.setDisartur1(getgxTv_SdtPedido_Disartur1());
      struct.setDisartpu1(getgxTv_SdtPedido_Disartpu1());
      struct.setDisartur2(getgxTv_SdtPedido_Disartur2());
      struct.setDisartpu2(getgxTv_SdtPedido_Disartpu2());
      struct.setDisartur3(getgxTv_SdtPedido_Disartur3());
      struct.setDisartpu3(getgxTv_SdtPedido_Disartpu3());
      struct.setDiscolnom(getgxTv_SdtPedido_Discolnom());
      struct.setDiscolnum(getgxTv_SdtPedido_Discolnum());
      struct.setDistipcol(getgxTv_SdtPedido_Distipcol());
      struct.setDisest(getgxTv_SdtPedido_Disest());
      struct.setDisdes(getgxTv_SdtPedido_Disdes());
      struct.setDisartdsc2(getgxTv_SdtPedido_Disartdsc2());
      struct.setDisple2(getgxTv_SdtPedido_Disple2());
      struct.setDisartlar(getgxTv_SdtPedido_Disartlar());
      struct.setDisartsua(getgxTv_SdtPedido_Disartsua());
      struct.setDisartaca(getgxTv_SdtPedido_Disartaca());
      struct.setDisartenc(getgxTv_SdtPedido_Disartenc());
      struct.setDisartcor(getgxTv_SdtPedido_Disartcor());
      struct.setDisartpes(getgxTv_SdtPedido_Disartpes());
      struct.setDisartrdt(getgxTv_SdtPedido_Disartrdt());
      struct.setDisarturg(getgxTv_SdtPedido_Disarturg());
      struct.setDisgracru(getgxTv_SdtPedido_Disgracru());
      struct.setDisartanh(getgxTv_SdtPedido_Disartanh());
      struct.setDisartan1(getgxTv_SdtPedido_Disartan1());
      struct.setDisartacb(getgxTv_SdtPedido_Disartacb());
      struct.setDisartac2(getgxTv_SdtPedido_Disartac2());
      struct.setDisenccom(getgxTv_SdtPedido_Disenccom());
      struct.setDisencanh(getgxTv_SdtPedido_Disencanh());
      struct.setDisnumcor(getgxTv_SdtPedido_Disnumcor());
      struct.setDisancsal1(getgxTv_SdtPedido_Disancsal1());
      struct.setDisancsal2(getgxTv_SdtPedido_Disancsal2());
      struct.setDisancsal3(getgxTv_SdtPedido_Disancsal3());
      struct.setDisgraaca2(getgxTv_SdtPedido_Disgraaca2());
      struct.setDisgracru2(getgxTv_SdtPedido_Disgracru2());
      struct.setDisgraaca(getgxTv_SdtPedido_Disgraaca());
      struct.setDisrdoa(getgxTv_SdtPedido_Disrdoa());
      struct.setDisrdon(getgxTv_SdtPedido_Disrdon());
      struct.setDisobsgrm(getgxTv_SdtPedido_Disobsgrm());
      struct.setDisobsanc(getgxTv_SdtPedido_Disobsanc());
      struct.setDisitem5(getgxTv_SdtPedido_Disitem5());
      struct.setDisartple(getgxTv_SdtPedido_Disartple());
      struct.setDisunimed(getgxTv_SdtPedido_Disunimed());
      struct.setCod_idtx(getgxTv_SdtPedido_Cod_idtx());
      struct.setDsc_idtx(getgxTv_SdtPedido_Dsc_idtx());
      struct.setDisordcomp(getgxTv_SdtPedido_Disordcomp());
      struct.setRevenid(getgxTv_SdtPedido_Revenid());
      struct.setRevennm(getgxTv_SdtPedido_Revennm());
      struct.setMarcaid(getgxTv_SdtPedido_Marcaid());
      struct.setMarcadsc(getgxTv_SdtPedido_Marcadsc());
      struct.setDisidtx2(getgxTv_SdtPedido_Disidtx2());
      struct.setDispriorid(getgxTv_SdtPedido_Dispriorid());
      struct.setNxt_modelo(getgxTv_SdtPedido_Nxt_modelo());
      struct.setCpteid(getgxTv_SdtPedido_Cpteid());
      struct.setCptedsc(getgxTv_SdtPedido_Cptedsc());
      struct.setNxt_statio(getgxTv_SdtPedido_Nxt_statio());
      struct.setDesaid(getgxTv_SdtPedido_Desaid());
      struct.setDesadsc(getgxTv_SdtPedido_Desadsc());
      struct.setDptoid(getgxTv_SdtPedido_Dptoid());
      struct.setDptodsc(getgxTv_SdtPedido_Dptodsc());
      struct.setNxt_artcli(getgxTv_SdtPedido_Nxt_artcli());
      struct.setDisexp(getgxTv_SdtPedido_Disexp());
      struct.setNorma(getgxTv_SdtPedido_Norma().getStruct());
      struct.setAlmacentejido(getgxTv_SdtPedido_Almacentejido().getStruct());
      struct.setDefecto(getgxTv_SdtPedido_Defecto().getStruct());
      struct.setProceso(getgxTv_SdtPedido_Proceso().getStruct());
      struct.setMode(getgxTv_SdtPedido_Mode());
      struct.setInitialized(getgxTv_SdtPedido_Initialized());
      struct.setEmprcod_Z(getgxTv_SdtPedido_Emprcod_Z());
      struct.setEmprnom_Z(getgxTv_SdtPedido_Emprnom_Z());
      struct.setPricod_Z(getgxTv_SdtPedido_Pricod_Z());
      struct.setDiscod_Z(getgxTv_SdtPedido_Discod_Z());
      struct.setDistipdis_Z(getgxTv_SdtPedido_Distipdis_Z());
      struct.setDisenccli_Z(getgxTv_SdtPedido_Disenccli_Z());
      struct.setClicod_Z(getgxTv_SdtPedido_Clicod_Z());
      struct.setClinom_Z(getgxTv_SdtPedido_Clinom_Z());
      struct.setDisclides_Z(getgxTv_SdtPedido_Disclides_Z());
      struct.setClinomdes_Z(getgxTv_SdtPedido_Clinomdes_Z());
      struct.setE_disclides_Z(getgxTv_SdtPedido_E_disclides_Z());
      struct.setDisfec_Z(getgxTv_SdtPedido_Disfec_Z());
      struct.setDisfeccli_Z(getgxTv_SdtPedido_Disfeccli_Z());
      struct.setDisfecent_Z(getgxTv_SdtPedido_Disfecent_Z());
      struct.setDisartcod_Z(getgxTv_SdtPedido_Disartcod_Z());
      struct.setE_disartcod_Z(getgxTv_SdtPedido_E_disartcod_Z());
      struct.setDisartdsc_Z(getgxTv_SdtPedido_Disartdsc_Z());
      struct.setDisarttip_Z(getgxTv_SdtPedido_Disarttip_Z());
      struct.setDisarttipd_Z(getgxTv_SdtPedido_Disarttipd_Z());
      struct.setDisartmat_Z(getgxTv_SdtPedido_Disartmat_Z());
      struct.setDisarttr1_Z(getgxTv_SdtPedido_Disarttr1_Z());
      struct.setDisartpt1_Z(getgxTv_SdtPedido_Disartpt1_Z());
      struct.setDisarttr2_Z(getgxTv_SdtPedido_Disarttr2_Z());
      struct.setDisartpt2_Z(getgxTv_SdtPedido_Disartpt2_Z());
      struct.setDisarttr3_Z(getgxTv_SdtPedido_Disarttr3_Z());
      struct.setDisartpt3_Z(getgxTv_SdtPedido_Disartpt3_Z());
      struct.setDisartur1_Z(getgxTv_SdtPedido_Disartur1_Z());
      struct.setDisartpu1_Z(getgxTv_SdtPedido_Disartpu1_Z());
      struct.setDisartur2_Z(getgxTv_SdtPedido_Disartur2_Z());
      struct.setDisartpu2_Z(getgxTv_SdtPedido_Disartpu2_Z());
      struct.setDisartur3_Z(getgxTv_SdtPedido_Disartur3_Z());
      struct.setDisartpu3_Z(getgxTv_SdtPedido_Disartpu3_Z());
      struct.setDiscolnom_Z(getgxTv_SdtPedido_Discolnom_Z());
      struct.setDiscolnum_Z(getgxTv_SdtPedido_Discolnum_Z());
      struct.setDistipcol_Z(getgxTv_SdtPedido_Distipcol_Z());
      struct.setDisest_Z(getgxTv_SdtPedido_Disest_Z());
      struct.setDisdes_Z(getgxTv_SdtPedido_Disdes_Z());
      struct.setDisartdsc2_Z(getgxTv_SdtPedido_Disartdsc2_Z());
      struct.setDisple2_Z(getgxTv_SdtPedido_Disple2_Z());
      struct.setDisartlar_Z(getgxTv_SdtPedido_Disartlar_Z());
      struct.setDisartsua_Z(getgxTv_SdtPedido_Disartsua_Z());
      struct.setDisartaca_Z(getgxTv_SdtPedido_Disartaca_Z());
      struct.setDisartenc_Z(getgxTv_SdtPedido_Disartenc_Z());
      struct.setDisartcor_Z(getgxTv_SdtPedido_Disartcor_Z());
      struct.setDisartpes_Z(getgxTv_SdtPedido_Disartpes_Z());
      struct.setDisartrdt_Z(getgxTv_SdtPedido_Disartrdt_Z());
      struct.setDisarturg_Z(getgxTv_SdtPedido_Disarturg_Z());
      struct.setDisgracru_Z(getgxTv_SdtPedido_Disgracru_Z());
      struct.setDisartanh_Z(getgxTv_SdtPedido_Disartanh_Z());
      struct.setDisartan1_Z(getgxTv_SdtPedido_Disartan1_Z());
      struct.setDisartacb_Z(getgxTv_SdtPedido_Disartacb_Z());
      struct.setDisartac2_Z(getgxTv_SdtPedido_Disartac2_Z());
      struct.setDisenccom_Z(getgxTv_SdtPedido_Disenccom_Z());
      struct.setDisencanh_Z(getgxTv_SdtPedido_Disencanh_Z());
      struct.setDisnumcor_Z(getgxTv_SdtPedido_Disnumcor_Z());
      struct.setDisancsal1_Z(getgxTv_SdtPedido_Disancsal1_Z());
      struct.setDisancsal2_Z(getgxTv_SdtPedido_Disancsal2_Z());
      struct.setDisancsal3_Z(getgxTv_SdtPedido_Disancsal3_Z());
      struct.setDisgraaca2_Z(getgxTv_SdtPedido_Disgraaca2_Z());
      struct.setDisgracru2_Z(getgxTv_SdtPedido_Disgracru2_Z());
      struct.setDisgraaca_Z(getgxTv_SdtPedido_Disgraaca_Z());
      struct.setDisrdoa_Z(getgxTv_SdtPedido_Disrdoa_Z());
      struct.setDisrdon_Z(getgxTv_SdtPedido_Disrdon_Z());
      struct.setDisobsgrm_Z(getgxTv_SdtPedido_Disobsgrm_Z());
      struct.setDisobsanc_Z(getgxTv_SdtPedido_Disobsanc_Z());
      struct.setDisitem5_Z(getgxTv_SdtPedido_Disitem5_Z());
      struct.setDisartple_Z(getgxTv_SdtPedido_Disartple_Z());
      struct.setDisunimed_Z(getgxTv_SdtPedido_Disunimed_Z());
      struct.setCod_idtx_Z(getgxTv_SdtPedido_Cod_idtx_Z());
      struct.setDsc_idtx_Z(getgxTv_SdtPedido_Dsc_idtx_Z());
      struct.setDisordcomp_Z(getgxTv_SdtPedido_Disordcomp_Z());
      struct.setRevenid_Z(getgxTv_SdtPedido_Revenid_Z());
      struct.setRevennm_Z(getgxTv_SdtPedido_Revennm_Z());
      struct.setMarcaid_Z(getgxTv_SdtPedido_Marcaid_Z());
      struct.setMarcadsc_Z(getgxTv_SdtPedido_Marcadsc_Z());
      struct.setDisidtx2_Z(getgxTv_SdtPedido_Disidtx2_Z());
      struct.setDispriorid_Z(getgxTv_SdtPedido_Dispriorid_Z());
      struct.setNxt_modelo_Z(getgxTv_SdtPedido_Nxt_modelo_Z());
      struct.setCpteid_Z(getgxTv_SdtPedido_Cpteid_Z());
      struct.setCptedsc_Z(getgxTv_SdtPedido_Cptedsc_Z());
      struct.setNxt_statio_Z(getgxTv_SdtPedido_Nxt_statio_Z());
      struct.setDesaid_Z(getgxTv_SdtPedido_Desaid_Z());
      struct.setDesadsc_Z(getgxTv_SdtPedido_Desadsc_Z());
      struct.setDptoid_Z(getgxTv_SdtPedido_Dptoid_Z());
      struct.setDptodsc_Z(getgxTv_SdtPedido_Dptodsc_Z());
      struct.setNxt_artcli_Z(getgxTv_SdtPedido_Nxt_artcli_Z());
      struct.setDisexp_Z(getgxTv_SdtPedido_Disexp_Z());
      struct.setEmprnom_N(getgxTv_SdtPedido_Emprnom_N());
      struct.setDistipdis_N(getgxTv_SdtPedido_Distipdis_N());
      struct.setE_disclides_N(getgxTv_SdtPedido_E_disclides_N());
      struct.setE_disartcod_N(getgxTv_SdtPedido_E_disartcod_N());
      struct.setDisartpu3_N(getgxTv_SdtPedido_Disartpu3_N());
      struct.setDiscolnom_N(getgxTv_SdtPedido_Discolnom_N());
      struct.setDiscolnum_N(getgxTv_SdtPedido_Discolnum_N());
      struct.setDistipcol_N(getgxTv_SdtPedido_Distipcol_N());
      struct.setCod_idtx_N(getgxTv_SdtPedido_Cod_idtx_N());
      struct.setDsc_idtx_N(getgxTv_SdtPedido_Dsc_idtx_N());
      struct.setRevenid_N(getgxTv_SdtPedido_Revenid_N());
      struct.setRevennm_N(getgxTv_SdtPedido_Revennm_N());
      struct.setMarcaid_N(getgxTv_SdtPedido_Marcaid_N());
      struct.setMarcadsc_N(getgxTv_SdtPedido_Marcadsc_N());
      struct.setDisidtx2_N(getgxTv_SdtPedido_Disidtx2_N());
      struct.setCpteid_N(getgxTv_SdtPedido_Cpteid_N());
      struct.setCptedsc_N(getgxTv_SdtPedido_Cptedsc_N());
      struct.setDesaid_N(getgxTv_SdtPedido_Desaid_N());
      struct.setDesadsc_N(getgxTv_SdtPedido_Desadsc_N());
      struct.setDptoid_N(getgxTv_SdtPedido_Dptoid_N());
      struct.setDptodsc_N(getgxTv_SdtPedido_Dptodsc_N());
      return struct ;
   }

   private byte gxTv_SdtPedido_N ;
   private byte gxTv_SdtPedido_Distipcol ;
   private byte gxTv_SdtPedido_Disest ;
   private byte gxTv_SdtPedido_Disarturg ;
   private byte gxTv_SdtPedido_Dispriorid ;
   private byte gxTv_SdtPedido_Distipcol_Z ;
   private byte gxTv_SdtPedido_Disest_Z ;
   private byte gxTv_SdtPedido_Disarturg_Z ;
   private byte gxTv_SdtPedido_Dispriorid_Z ;
   private byte gxTv_SdtPedido_Emprnom_N ;
   private byte gxTv_SdtPedido_Distipdis_N ;
   private byte gxTv_SdtPedido_E_disclides_N ;
   private byte gxTv_SdtPedido_E_disartcod_N ;
   private byte gxTv_SdtPedido_Disartpu3_N ;
   private byte gxTv_SdtPedido_Discolnom_N ;
   private byte gxTv_SdtPedido_Discolnum_N ;
   private byte gxTv_SdtPedido_Distipcol_N ;
   private byte gxTv_SdtPedido_Cod_idtx_N ;
   private byte gxTv_SdtPedido_Dsc_idtx_N ;
   private byte gxTv_SdtPedido_Revenid_N ;
   private byte gxTv_SdtPedido_Revennm_N ;
   private byte gxTv_SdtPedido_Marcaid_N ;
   private byte gxTv_SdtPedido_Marcadsc_N ;
   private byte gxTv_SdtPedido_Disidtx2_N ;
   private byte gxTv_SdtPedido_Cpteid_N ;
   private byte gxTv_SdtPedido_Cptedsc_N ;
   private byte gxTv_SdtPedido_Desaid_N ;
   private byte gxTv_SdtPedido_Desadsc_N ;
   private byte gxTv_SdtPedido_Dptoid_N ;
   private byte gxTv_SdtPedido_Dptodsc_N ;
   private short gxTv_SdtPedido_E_disclides ;
   private short gxTv_SdtPedido_E_disartcod ;
   private short gxTv_SdtPedido_Disarttip ;
   private short gxTv_SdtPedido_Disartpt1 ;
   private short gxTv_SdtPedido_Disartpt2 ;
   private short gxTv_SdtPedido_Disartpt3 ;
   private short gxTv_SdtPedido_Disartpu1 ;
   private short gxTv_SdtPedido_Disartpu2 ;
   private short gxTv_SdtPedido_Disartpu3 ;
   private short gxTv_SdtPedido_Disartpes ;
   private short gxTv_SdtPedido_Disgracru ;
   private short gxTv_SdtPedido_Disartanh ;
   private short gxTv_SdtPedido_Disartan1 ;
   private short gxTv_SdtPedido_Disartacb ;
   private short gxTv_SdtPedido_Disartac2 ;
   private short gxTv_SdtPedido_Disnumcor ;
   private short gxTv_SdtPedido_Disancsal1 ;
   private short gxTv_SdtPedido_Disancsal2 ;
   private short gxTv_SdtPedido_Disancsal3 ;
   private short gxTv_SdtPedido_Disgraaca2 ;
   private short gxTv_SdtPedido_Disgracru2 ;
   private short gxTv_SdtPedido_Disgraaca ;
   private short gxTv_SdtPedido_Cpteid ;
   private short gxTv_SdtPedido_Desaid ;
   private short gxTv_SdtPedido_Dptoid ;
   private short gxTv_SdtPedido_Initialized ;
   private short gxTv_SdtPedido_E_disclides_Z ;
   private short gxTv_SdtPedido_E_disartcod_Z ;
   private short gxTv_SdtPedido_Disarttip_Z ;
   private short gxTv_SdtPedido_Disartpt1_Z ;
   private short gxTv_SdtPedido_Disartpt2_Z ;
   private short gxTv_SdtPedido_Disartpt3_Z ;
   private short gxTv_SdtPedido_Disartpu1_Z ;
   private short gxTv_SdtPedido_Disartpu2_Z ;
   private short gxTv_SdtPedido_Disartpu3_Z ;
   private short gxTv_SdtPedido_Disartpes_Z ;
   private short gxTv_SdtPedido_Disgracru_Z ;
   private short gxTv_SdtPedido_Disartanh_Z ;
   private short gxTv_SdtPedido_Disartan1_Z ;
   private short gxTv_SdtPedido_Disartacb_Z ;
   private short gxTv_SdtPedido_Disartac2_Z ;
   private short gxTv_SdtPedido_Disnumcor_Z ;
   private short gxTv_SdtPedido_Disancsal1_Z ;
   private short gxTv_SdtPedido_Disancsal2_Z ;
   private short gxTv_SdtPedido_Disancsal3_Z ;
   private short gxTv_SdtPedido_Disgraaca2_Z ;
   private short gxTv_SdtPedido_Disgracru2_Z ;
   private short gxTv_SdtPedido_Disgraaca_Z ;
   private short gxTv_SdtPedido_Cpteid_Z ;
   private short gxTv_SdtPedido_Desaid_Z ;
   private short gxTv_SdtPedido_Dptoid_Z ;
   private short readOk ;
   private short nOutParmCount ;
   private int gxTv_SdtPedido_Discod ;
   private int gxTv_SdtPedido_Clicod ;
   private int gxTv_SdtPedido_Disclides ;
   private int gxTv_SdtPedido_Discolnum ;
   private int gxTv_SdtPedido_Discod_Z ;
   private int gxTv_SdtPedido_Clicod_Z ;
   private int gxTv_SdtPedido_Disclides_Z ;
   private int gxTv_SdtPedido_Discolnum_Z ;
   private java.math.BigDecimal gxTv_SdtPedido_Disartrdt ;
   private java.math.BigDecimal gxTv_SdtPedido_Disenccom ;
   private java.math.BigDecimal gxTv_SdtPedido_Disencanh ;
   private java.math.BigDecimal gxTv_SdtPedido_Disrdoa ;
   private java.math.BigDecimal gxTv_SdtPedido_Disrdon ;
   private java.math.BigDecimal gxTv_SdtPedido_Disartrdt_Z ;
   private java.math.BigDecimal gxTv_SdtPedido_Disenccom_Z ;
   private java.math.BigDecimal gxTv_SdtPedido_Disencanh_Z ;
   private java.math.BigDecimal gxTv_SdtPedido_Disrdoa_Z ;
   private java.math.BigDecimal gxTv_SdtPedido_Disrdon_Z ;
   private String gxTv_SdtPedido_Emprcod ;
   private String gxTv_SdtPedido_Emprnom ;
   private String gxTv_SdtPedido_Pricod ;
   private String gxTv_SdtPedido_Distipdis ;
   private String gxTv_SdtPedido_Disenccli ;
   private String gxTv_SdtPedido_Clinom ;
   private String gxTv_SdtPedido_Clinomdes ;
   private String gxTv_SdtPedido_Disartcod ;
   private String gxTv_SdtPedido_Disartdsc ;
   private String gxTv_SdtPedido_Disarttipd ;
   private String gxTv_SdtPedido_Disartmat ;
   private String gxTv_SdtPedido_Disarttr1 ;
   private String gxTv_SdtPedido_Disarttr2 ;
   private String gxTv_SdtPedido_Disarttr3 ;
   private String gxTv_SdtPedido_Disartur1 ;
   private String gxTv_SdtPedido_Disartur2 ;
   private String gxTv_SdtPedido_Disartur3 ;
   private String gxTv_SdtPedido_Discolnom ;
   private String gxTv_SdtPedido_Disdes ;
   private String gxTv_SdtPedido_Disple2 ;
   private String gxTv_SdtPedido_Disartlar ;
   private String gxTv_SdtPedido_Disartsua ;
   private String gxTv_SdtPedido_Disartaca ;
   private String gxTv_SdtPedido_Disartenc ;
   private String gxTv_SdtPedido_Disartcor ;
   private String gxTv_SdtPedido_Disobsgrm ;
   private String gxTv_SdtPedido_Disobsanc ;
   private String gxTv_SdtPedido_Disitem5 ;
   private String gxTv_SdtPedido_Disartple ;
   private String gxTv_SdtPedido_Disunimed ;
   private String gxTv_SdtPedido_Cod_idtx ;
   private String gxTv_SdtPedido_Dsc_idtx ;
   private String gxTv_SdtPedido_Revenid ;
   private String gxTv_SdtPedido_Revennm ;
   private String gxTv_SdtPedido_Marcaid ;
   private String gxTv_SdtPedido_Marcadsc ;
   private String gxTv_SdtPedido_Disidtx2 ;
   private String gxTv_SdtPedido_Nxt_modelo ;
   private String gxTv_SdtPedido_Cptedsc ;
   private String gxTv_SdtPedido_Nxt_statio ;
   private String gxTv_SdtPedido_Desadsc ;
   private String gxTv_SdtPedido_Dptodsc ;
   private String gxTv_SdtPedido_Nxt_artcli ;
   private String gxTv_SdtPedido_Disexp ;
   private String gxTv_SdtPedido_Mode ;
   private String gxTv_SdtPedido_Emprcod_Z ;
   private String gxTv_SdtPedido_Emprnom_Z ;
   private String gxTv_SdtPedido_Pricod_Z ;
   private String gxTv_SdtPedido_Distipdis_Z ;
   private String gxTv_SdtPedido_Disenccli_Z ;
   private String gxTv_SdtPedido_Clinom_Z ;
   private String gxTv_SdtPedido_Clinomdes_Z ;
   private String gxTv_SdtPedido_Disartcod_Z ;
   private String gxTv_SdtPedido_Disartdsc_Z ;
   private String gxTv_SdtPedido_Disarttipd_Z ;
   private String gxTv_SdtPedido_Disartmat_Z ;
   private String gxTv_SdtPedido_Disarttr1_Z ;
   private String gxTv_SdtPedido_Disarttr2_Z ;
   private String gxTv_SdtPedido_Disarttr3_Z ;
   private String gxTv_SdtPedido_Disartur1_Z ;
   private String gxTv_SdtPedido_Disartur2_Z ;
   private String gxTv_SdtPedido_Disartur3_Z ;
   private String gxTv_SdtPedido_Discolnom_Z ;
   private String gxTv_SdtPedido_Disdes_Z ;
   private String gxTv_SdtPedido_Disple2_Z ;
   private String gxTv_SdtPedido_Disartlar_Z ;
   private String gxTv_SdtPedido_Disartsua_Z ;
   private String gxTv_SdtPedido_Disartaca_Z ;
   private String gxTv_SdtPedido_Disartenc_Z ;
   private String gxTv_SdtPedido_Disartcor_Z ;
   private String gxTv_SdtPedido_Disobsgrm_Z ;
   private String gxTv_SdtPedido_Disobsanc_Z ;
   private String gxTv_SdtPedido_Disitem5_Z ;
   private String gxTv_SdtPedido_Disartple_Z ;
   private String gxTv_SdtPedido_Disunimed_Z ;
   private String gxTv_SdtPedido_Cod_idtx_Z ;
   private String gxTv_SdtPedido_Dsc_idtx_Z ;
   private String gxTv_SdtPedido_Revenid_Z ;
   private String gxTv_SdtPedido_Revennm_Z ;
   private String gxTv_SdtPedido_Marcaid_Z ;
   private String gxTv_SdtPedido_Marcadsc_Z ;
   private String gxTv_SdtPedido_Disidtx2_Z ;
   private String gxTv_SdtPedido_Nxt_modelo_Z ;
   private String gxTv_SdtPedido_Cptedsc_Z ;
   private String gxTv_SdtPedido_Nxt_statio_Z ;
   private String gxTv_SdtPedido_Desadsc_Z ;
   private String gxTv_SdtPedido_Dptodsc_Z ;
   private String gxTv_SdtPedido_Nxt_artcli_Z ;
   private String gxTv_SdtPedido_Disexp_Z ;
   private String sTagName ;
   private String sDateCnv ;
   private String sNumToPad ;
   private java.util.Date gxTv_SdtPedido_Disfec ;
   private java.util.Date gxTv_SdtPedido_Disfeccli ;
   private java.util.Date gxTv_SdtPedido_Disfecent ;
   private java.util.Date gxTv_SdtPedido_Disfec_Z ;
   private java.util.Date gxTv_SdtPedido_Disfeccli_Z ;
   private java.util.Date gxTv_SdtPedido_Disfecent_Z ;
   private boolean readElement ;
   private boolean formatError ;
   private String gxTv_SdtPedido_Disartdsc2 ;
   private String gxTv_SdtPedido_Disordcomp ;
   private String gxTv_SdtPedido_Disartdsc2_Z ;
   private String gxTv_SdtPedido_Disordcomp_Z ;
   private GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Norma> gxTv_SdtPedido_Norma_aux ;
   private GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_AlmacenTejido> gxTv_SdtPedido_Almacentejido_aux ;
   private GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Defecto> gxTv_SdtPedido_Defecto_aux ;
   private GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Proceso> gxTv_SdtPedido_Proceso_aux ;
   private GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Norma> gxTv_SdtPedido_Norma=null ;
   private GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_AlmacenTejido> gxTv_SdtPedido_Almacentejido=null ;
   private GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Defecto> gxTv_SdtPedido_Defecto=null ;
   private GXBCLevelCollection<app.pedidosclientesindetalle.SdtPedido_Proceso> gxTv_SdtPedido_Proceso=null ;
}

