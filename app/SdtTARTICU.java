package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtTARTICU extends GxSilentTrnSdt
{
   public SdtTARTICU( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtTARTICU.class));
   }

   public SdtTARTICU( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle, context, "SdtTARTICU");
      initialize( remoteHandle) ;
   }

   public SdtTARTICU( int remoteHandle ,
                      StructSdtTARTICU struct )
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
                     int AV252CliCod ,
                     String AV65ArtCod )
   {
      IGxSilentTrn obj;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {AV396EmprCod,Integer.valueOf(AV252CliCod),AV65ArtCod});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"EmprCod", String.class}, new Object[]{"CliCod", int.class}, new Object[]{"ArtCod", String.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "TARTICU");
      metadata.set("BT", "TXPARTICU");
      metadata.set("PK", "[ \"EmprCod\",\"CliCod\",\"ArtCod\" ]");
      metadata.set("FKList", "[ { \"FK\":[ \"EmprCod\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"Art_Cd\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"ClaBolCod\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"ClaTubCod\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"ClasCod\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"CliCod\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"ProceCod\" ],\"FKMap\":[ \"ArtTh-ProceCod\" ] },{ \"FK\":[ \"EmprCod\",\"TipArtCod\" ],\"FKMap\":[  ] } ]");
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
               gxTv_SdtTARTICU_Emprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliCod") )
            {
               gxTv_SdtTARTICU_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtCod") )
            {
               gxTv_SdtTARTICU_Artcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtDsc") )
            {
               gxTv_SdtTARTICU_Artdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtTARTICU_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtCodExt") )
            {
               gxTv_SdtTARTICU_Artcodext = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom") )
            {
               gxTv_SdtTARTICU_Emprnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtMat") )
            {
               gxTv_SdtTARTICU_Artmat = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtCod") )
            {
               gxTv_SdtTARTICU_Tipartcod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtDsc") )
            {
               gxTv_SdtTARTICU_Tipartdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtPml") )
            {
               gxTv_SdtTARTICU_Artpml = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtGraCru") )
            {
               gxTv_SdtTARTICU_Artgracru = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtCruMin") )
            {
               gxTv_SdtTARTICU_Artcrumin = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtCruMax") )
            {
               gxTv_SdtTARTICU_Artcrumax = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtAcaMin") )
            {
               gxTv_SdtTARTICU_Artacamin = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtAcaMax") )
            {
               gxTv_SdtTARTICU_Artacamax = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtRen") )
            {
               gxTv_SdtTARTICU_Artren = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtTipPle") )
            {
               gxTv_SdtTARTICU_Arttipple = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtTipLar") )
            {
               gxTv_SdtTARTICU_Arttiplar = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtCorOri") )
            {
               gxTv_SdtTARTICU_Artcorori = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtEncOri") )
            {
               gxTv_SdtTARTICU_Artencori = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtSua") )
            {
               gxTv_SdtTARTICU_Artsua = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtAcaQui") )
            {
               gxTv_SdtTARTICU_Artacaqui = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtEti") )
            {
               gxTv_SdtTARTICU_Arteti = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliEti") )
            {
               gxTv_SdtTARTICU_Clieti = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliUrg") )
            {
               gxTv_SdtTARTICU_Cliurg = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtUrg") )
            {
               gxTv_SdtTARTICU_Arturg = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtMer") )
            {
               gxTv_SdtTARTICU_Artmer = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtTra1") )
            {
               gxTv_SdtTARTICU_Arttra1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtTra2") )
            {
               gxTv_SdtTARTICU_Arttra2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtTra3") )
            {
               gxTv_SdtTARTICU_Arttra3 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtTraP1") )
            {
               gxTv_SdtTARTICU_Arttrap1 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtTraP2") )
            {
               gxTv_SdtTARTICU_Arttrap2 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtTraP3") )
            {
               gxTv_SdtTARTICU_Arttrap3 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtUrd1") )
            {
               gxTv_SdtTARTICU_Arturd1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtUrd2") )
            {
               gxTv_SdtTARTICU_Arturd2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtUrd3") )
            {
               gxTv_SdtTARTICU_Arturd3 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtUrdP1") )
            {
               gxTv_SdtTARTICU_Arturdp1 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtUrdP2") )
            {
               gxTv_SdtTARTICU_Arturdp2 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtUrdP3") )
            {
               gxTv_SdtTARTICU_Arturdp3 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtEncCom") )
            {
               gxTv_SdtTARTICU_Artenccom = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtEncAnh") )
            {
               gxTv_SdtTARTICU_Artencanh = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtGraAca") )
            {
               gxTv_SdtTARTICU_Artgraaca = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtRdoA") )
            {
               gxTv_SdtTARTICU_Artrdoa = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtRdoN") )
            {
               gxTv_SdtTARTICU_Artrdon = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtFacAbs") )
            {
               gxTv_SdtTARTICU_Artfacabs = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtPle2") )
            {
               gxTv_SdtTARTICU_Artple2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtNumCor") )
            {
               gxTv_SdtTARTICU_Artnumcor = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtAncSal1") )
            {
               gxTv_SdtTARTICU_Artancsal1 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtAncSal2") )
            {
               gxTv_SdtTARTICU_Artancsal2 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtAncSal3") )
            {
               gxTv_SdtTARTICU_Artancsal3 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtGraAca2") )
            {
               gxTv_SdtTARTICU_Artgraaca2 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtGraCru2") )
            {
               gxTv_SdtTARTICU_Artgracru2 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClasCod") )
            {
               gxTv_SdtTARTICU_Clascod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtPmPPza") )
            {
               gxTv_SdtTARTICU_Artpmppza = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtFecCre") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTARTICU_Artfeccre = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtTARTICU_Artfeccre = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtUsrCod") )
            {
               gxTv_SdtTARTICU_Artusrcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtFecMod") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTARTICU_Artfecmod = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtTARTICU_Artfecmod = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClasDsc") )
            {
               gxTv_SdtTARTICU_Clasdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtComer") )
            {
               gxTv_SdtTARTICU_Artcomer = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClaTubCod") )
            {
               gxTv_SdtTARTICU_Clatubcod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClaTubDsc") )
            {
               gxTv_SdtTARTICU_Clatubdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClaBolCod") )
            {
               gxTv_SdtTARTICU_Clabolcod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClaBolDsc") )
            {
               gxTv_SdtTARTICU_Claboldsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtRdoCru1") )
            {
               gxTv_SdtTARTICU_Artrdocru1 = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtRdoCru2") )
            {
               gxTv_SdtTARTICU_Artrdocru2 = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtNMtr") )
            {
               gxTv_SdtTARTICU_Artnmtr = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtLu") )
            {
               gxTv_SdtTARTICU_Artlu = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtRb") )
            {
               gxTv_SdtTARTICU_Artrb = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtPelAnh") )
            {
               gxTv_SdtTARTICU_Artpelanh = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Artgrm2Sc") )
            {
               gxTv_SdtTARTICU_Artgrm2sc = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtPmlSc") )
            {
               gxTv_SdtTARTICU_Artpmlsc = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtAncSc") )
            {
               gxTv_SdtTARTICU_Artancsc = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtPmlCru") )
            {
               gxTv_SdtTARTICU_Artpmlcru = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtRdtSc") )
            {
               gxTv_SdtTARTICU_Artrdtsc = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtUnd") )
            {
               gxTv_SdtTARTICU_Artund = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtBlo") )
            {
               gxTv_SdtTARTICU_Artblo = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtCla") )
            {
               gxTv_SdtTARTICU_Artcla = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtDsc2") )
            {
               gxTv_SdtTARTICU_Tipartdsc2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtFabsH") )
            {
               gxTv_SdtTARTICU_Artfabsh = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtFabsT") )
            {
               gxTv_SdtTARTICU_Artfabst = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtNProg") )
            {
               gxTv_SdtTARTICU_Artnprog = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtVbd") )
            {
               gxTv_SdtTARTICU_Artvbd = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtVbn") )
            {
               gxTv_SdtTARTICU_Artvbn = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtAb") )
            {
               gxTv_SdtTARTICU_Artab = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtObsGrm") )
            {
               gxTv_SdtTARTICU_Artobsgrm = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtObsAnc") )
            {
               gxTv_SdtTARTICU_Artobsanc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtCdb") )
            {
               gxTv_SdtTARTICU_Artcdb = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtGalga") )
            {
               gxTv_SdtTARTICU_Artgalga = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtPlatina") )
            {
               gxTv_SdtTARTICU_Artplatina = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtPgd") )
            {
               gxTv_SdtTARTICU_Artpgd = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtTh") )
            {
               gxTv_SdtTARTICU_Artth = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtThN") )
            {
               gxTv_SdtTARTICU_Artthn = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Art_Cd") )
            {
               gxTv_SdtTARTICU_Art_cd = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Art_Dc") )
            {
               gxTv_SdtTARTICU_Art_dc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtHilos") )
            {
               gxTv_SdtTARTICU_Arthilos = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtPasad") )
            {
               gxTv_SdtTARTICU_Artpasad = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtAncC") )
            {
               gxTv_SdtTARTICU_Artancc = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtGrm2C") )
            {
               gxTv_SdtTARTICU_Artgrm2c = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtRdoC") )
            {
               gxTv_SdtTARTICU_Artrdoc = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtAcaFor") )
            {
               gxTv_SdtTARTICU_Artacafor = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtAnu") )
            {
               gxTv_SdtTARTICU_Artanu = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtFacUti") )
            {
               gxTv_SdtTARTICU_Artfacuti = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtNumTip") )
            {
               gxTv_SdtTARTICU_Artnumtip = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtMT") )
            {
               gxTv_SdtTARTICU_Artmt = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtTRabs") )
            {
               gxTv_SdtTARTICU_Arttrabs = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtKgMn") )
            {
               gxTv_SdtTARTICU_Artkgmn = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtAcaMar") )
            {
               gxTv_SdtTARTICU_Artacamar = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtAcaBak") )
            {
               gxTv_SdtTARTICU_Artacabak = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtElgAnc") )
            {
               gxTv_SdtTARTICU_Artelganc = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtElgLar") )
            {
               gxTv_SdtTARTICU_Artelglar = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtRdoCru") )
            {
               gxTv_SdtTARTICU_Artrdocru = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtEncLarg") )
            {
               gxTv_SdtTARTICU_Artenclarg = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtEncAnc") )
            {
               gxTv_SdtTARTICU_Artencanc = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtRdto4") )
            {
               gxTv_SdtTARTICU_Artrdto4 = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Artdsc2") )
            {
               gxTv_SdtTARTICU_Artdsc2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtgrComp") )
            {
               gxTv_SdtTARTICU_Artgrcomp = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtKgspp") )
            {
               gxTv_SdtTARTICU_Artkgspp = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtPrepp") )
            {
               gxTv_SdtTARTICU_Artprepp = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtCDsc") )
            {
               gxTv_SdtTARTICU_Artcdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtObsLon") )
            {
               gxTv_SdtTARTICU_Artobslon = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtObsFac") )
            {
               gxTv_SdtTARTICU_Artobsfac = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtObsOtras") )
            {
               gxTv_SdtTARTICU_Artobsotras = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtActivo") )
            {
               gxTv_SdtTARTICU_Artactivo = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtTARTICU_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtTARTICU_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprCod_Z") )
            {
               gxTv_SdtTARTICU_Emprcod_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliCod_Z") )
            {
               gxTv_SdtTARTICU_Clicod_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtCod_Z") )
            {
               gxTv_SdtTARTICU_Artcod_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtDsc_Z") )
            {
               gxTv_SdtTARTICU_Artdsc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom_Z") )
            {
               gxTv_SdtTARTICU_Clinom_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtCodExt_Z") )
            {
               gxTv_SdtTARTICU_Artcodext_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom_Z") )
            {
               gxTv_SdtTARTICU_Emprnom_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtMat_Z") )
            {
               gxTv_SdtTARTICU_Artmat_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtCod_Z") )
            {
               gxTv_SdtTARTICU_Tipartcod_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtDsc_Z") )
            {
               gxTv_SdtTARTICU_Tipartdsc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtPml_Z") )
            {
               gxTv_SdtTARTICU_Artpml_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtGraCru_Z") )
            {
               gxTv_SdtTARTICU_Artgracru_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtCruMin_Z") )
            {
               gxTv_SdtTARTICU_Artcrumin_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtCruMax_Z") )
            {
               gxTv_SdtTARTICU_Artcrumax_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtAcaMin_Z") )
            {
               gxTv_SdtTARTICU_Artacamin_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtAcaMax_Z") )
            {
               gxTv_SdtTARTICU_Artacamax_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtRen_Z") )
            {
               gxTv_SdtTARTICU_Artren_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtTipPle_Z") )
            {
               gxTv_SdtTARTICU_Arttipple_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtTipLar_Z") )
            {
               gxTv_SdtTARTICU_Arttiplar_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtCorOri_Z") )
            {
               gxTv_SdtTARTICU_Artcorori_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtEncOri_Z") )
            {
               gxTv_SdtTARTICU_Artencori_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtSua_Z") )
            {
               gxTv_SdtTARTICU_Artsua_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtAcaQui_Z") )
            {
               gxTv_SdtTARTICU_Artacaqui_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtEti_Z") )
            {
               gxTv_SdtTARTICU_Arteti_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliEti_Z") )
            {
               gxTv_SdtTARTICU_Clieti_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliUrg_Z") )
            {
               gxTv_SdtTARTICU_Cliurg_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtUrg_Z") )
            {
               gxTv_SdtTARTICU_Arturg_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtMer_Z") )
            {
               gxTv_SdtTARTICU_Artmer_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtTra1_Z") )
            {
               gxTv_SdtTARTICU_Arttra1_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtTra2_Z") )
            {
               gxTv_SdtTARTICU_Arttra2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtTra3_Z") )
            {
               gxTv_SdtTARTICU_Arttra3_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtTraP1_Z") )
            {
               gxTv_SdtTARTICU_Arttrap1_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtTraP2_Z") )
            {
               gxTv_SdtTARTICU_Arttrap2_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtTraP3_Z") )
            {
               gxTv_SdtTARTICU_Arttrap3_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtUrd1_Z") )
            {
               gxTv_SdtTARTICU_Arturd1_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtUrd2_Z") )
            {
               gxTv_SdtTARTICU_Arturd2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtUrd3_Z") )
            {
               gxTv_SdtTARTICU_Arturd3_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtUrdP1_Z") )
            {
               gxTv_SdtTARTICU_Arturdp1_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtUrdP2_Z") )
            {
               gxTv_SdtTARTICU_Arturdp2_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtUrdP3_Z") )
            {
               gxTv_SdtTARTICU_Arturdp3_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtEncCom_Z") )
            {
               gxTv_SdtTARTICU_Artenccom_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtEncAnh_Z") )
            {
               gxTv_SdtTARTICU_Artencanh_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtGraAca_Z") )
            {
               gxTv_SdtTARTICU_Artgraaca_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtRdoA_Z") )
            {
               gxTv_SdtTARTICU_Artrdoa_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtRdoN_Z") )
            {
               gxTv_SdtTARTICU_Artrdon_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtFacAbs_Z") )
            {
               gxTv_SdtTARTICU_Artfacabs_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtPle2_Z") )
            {
               gxTv_SdtTARTICU_Artple2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtNumCor_Z") )
            {
               gxTv_SdtTARTICU_Artnumcor_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtAncSal1_Z") )
            {
               gxTv_SdtTARTICU_Artancsal1_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtAncSal2_Z") )
            {
               gxTv_SdtTARTICU_Artancsal2_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtAncSal3_Z") )
            {
               gxTv_SdtTARTICU_Artancsal3_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtGraAca2_Z") )
            {
               gxTv_SdtTARTICU_Artgraaca2_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtGraCru2_Z") )
            {
               gxTv_SdtTARTICU_Artgracru2_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClasCod_Z") )
            {
               gxTv_SdtTARTICU_Clascod_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtPmPPza_Z") )
            {
               gxTv_SdtTARTICU_Artpmppza_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtFecCre_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTARTICU_Artfeccre_Z = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtTARTICU_Artfeccre_Z = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtUsrCod_Z") )
            {
               gxTv_SdtTARTICU_Artusrcod_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtFecMod_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTARTICU_Artfecmod_Z = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtTARTICU_Artfecmod_Z = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClasDsc_Z") )
            {
               gxTv_SdtTARTICU_Clasdsc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtComer_Z") )
            {
               gxTv_SdtTARTICU_Artcomer_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClaTubCod_Z") )
            {
               gxTv_SdtTARTICU_Clatubcod_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClaTubDsc_Z") )
            {
               gxTv_SdtTARTICU_Clatubdsc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClaBolCod_Z") )
            {
               gxTv_SdtTARTICU_Clabolcod_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClaBolDsc_Z") )
            {
               gxTv_SdtTARTICU_Claboldsc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtRdoCru1_Z") )
            {
               gxTv_SdtTARTICU_Artrdocru1_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtRdoCru2_Z") )
            {
               gxTv_SdtTARTICU_Artrdocru2_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtNMtr_Z") )
            {
               gxTv_SdtTARTICU_Artnmtr_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtLu_Z") )
            {
               gxTv_SdtTARTICU_Artlu_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtRb_Z") )
            {
               gxTv_SdtTARTICU_Artrb_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtPelAnh_Z") )
            {
               gxTv_SdtTARTICU_Artpelanh_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Artgrm2Sc_Z") )
            {
               gxTv_SdtTARTICU_Artgrm2sc_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtPmlSc_Z") )
            {
               gxTv_SdtTARTICU_Artpmlsc_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtAncSc_Z") )
            {
               gxTv_SdtTARTICU_Artancsc_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtPmlCru_Z") )
            {
               gxTv_SdtTARTICU_Artpmlcru_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtRdtSc_Z") )
            {
               gxTv_SdtTARTICU_Artrdtsc_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtUnd_Z") )
            {
               gxTv_SdtTARTICU_Artund_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtBlo_Z") )
            {
               gxTv_SdtTARTICU_Artblo_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtCla_Z") )
            {
               gxTv_SdtTARTICU_Artcla_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtDsc2_Z") )
            {
               gxTv_SdtTARTICU_Tipartdsc2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtFabsH_Z") )
            {
               gxTv_SdtTARTICU_Artfabsh_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtFabsT_Z") )
            {
               gxTv_SdtTARTICU_Artfabst_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtNProg_Z") )
            {
               gxTv_SdtTARTICU_Artnprog_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtVbd_Z") )
            {
               gxTv_SdtTARTICU_Artvbd_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtVbn_Z") )
            {
               gxTv_SdtTARTICU_Artvbn_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtAb_Z") )
            {
               gxTv_SdtTARTICU_Artab_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtObsGrm_Z") )
            {
               gxTv_SdtTARTICU_Artobsgrm_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtObsAnc_Z") )
            {
               gxTv_SdtTARTICU_Artobsanc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtCdb_Z") )
            {
               gxTv_SdtTARTICU_Artcdb_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtGalga_Z") )
            {
               gxTv_SdtTARTICU_Artgalga_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtPlatina_Z") )
            {
               gxTv_SdtTARTICU_Artplatina_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtPgd_Z") )
            {
               gxTv_SdtTARTICU_Artpgd_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtTh_Z") )
            {
               gxTv_SdtTARTICU_Artth_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtThN_Z") )
            {
               gxTv_SdtTARTICU_Artthn_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Art_Cd_Z") )
            {
               gxTv_SdtTARTICU_Art_cd_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Art_Dc_Z") )
            {
               gxTv_SdtTARTICU_Art_dc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtHilos_Z") )
            {
               gxTv_SdtTARTICU_Arthilos_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtPasad_Z") )
            {
               gxTv_SdtTARTICU_Artpasad_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtAncC_Z") )
            {
               gxTv_SdtTARTICU_Artancc_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtGrm2C_Z") )
            {
               gxTv_SdtTARTICU_Artgrm2c_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtRdoC_Z") )
            {
               gxTv_SdtTARTICU_Artrdoc_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtAcaFor_Z") )
            {
               gxTv_SdtTARTICU_Artacafor_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtAnu_Z") )
            {
               gxTv_SdtTARTICU_Artanu_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtFacUti_Z") )
            {
               gxTv_SdtTARTICU_Artfacuti_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtNumTip_Z") )
            {
               gxTv_SdtTARTICU_Artnumtip_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtMT_Z") )
            {
               gxTv_SdtTARTICU_Artmt_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtTRabs_Z") )
            {
               gxTv_SdtTARTICU_Arttrabs_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtKgMn_Z") )
            {
               gxTv_SdtTARTICU_Artkgmn_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtAcaMar_Z") )
            {
               gxTv_SdtTARTICU_Artacamar_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtAcaBak_Z") )
            {
               gxTv_SdtTARTICU_Artacabak_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtElgAnc_Z") )
            {
               gxTv_SdtTARTICU_Artelganc_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtElgLar_Z") )
            {
               gxTv_SdtTARTICU_Artelglar_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtRdoCru_Z") )
            {
               gxTv_SdtTARTICU_Artrdocru_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtEncLarg_Z") )
            {
               gxTv_SdtTARTICU_Artenclarg_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtEncAnc_Z") )
            {
               gxTv_SdtTARTICU_Artencanc_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtRdto4_Z") )
            {
               gxTv_SdtTARTICU_Artrdto4_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Artdsc2_Z") )
            {
               gxTv_SdtTARTICU_Artdsc2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtgrComp_Z") )
            {
               gxTv_SdtTARTICU_Artgrcomp_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtKgspp_Z") )
            {
               gxTv_SdtTARTICU_Artkgspp_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtPrepp_Z") )
            {
               gxTv_SdtTARTICU_Artprepp_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtCDsc_Z") )
            {
               gxTv_SdtTARTICU_Artcdsc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtObsFac_Z") )
            {
               gxTv_SdtTARTICU_Artobsfac_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtObsOtras_Z") )
            {
               gxTv_SdtTARTICU_Artobsotras_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtActivo_Z") )
            {
               gxTv_SdtTARTICU_Artactivo_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliCod_N") )
            {
               gxTv_SdtTARTICU_Clicod_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtCod_N") )
            {
               gxTv_SdtTARTICU_Artcod_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtDsc_N") )
            {
               gxTv_SdtTARTICU_Artdsc_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtCodExt_N") )
            {
               gxTv_SdtTARTICU_Artcodext_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom_N") )
            {
               gxTv_SdtTARTICU_Emprnom_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtMat_N") )
            {
               gxTv_SdtTARTICU_Artmat_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtDsc_N") )
            {
               gxTv_SdtTARTICU_Tipartdsc_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtPml_N") )
            {
               gxTv_SdtTARTICU_Artpml_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtGraCru_N") )
            {
               gxTv_SdtTARTICU_Artgracru_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtCruMin_N") )
            {
               gxTv_SdtTARTICU_Artcrumin_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtCruMax_N") )
            {
               gxTv_SdtTARTICU_Artcrumax_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtAcaMin_N") )
            {
               gxTv_SdtTARTICU_Artacamin_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtAcaMax_N") )
            {
               gxTv_SdtTARTICU_Artacamax_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtRen_N") )
            {
               gxTv_SdtTARTICU_Artren_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtTipPle_N") )
            {
               gxTv_SdtTARTICU_Arttipple_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtTipLar_N") )
            {
               gxTv_SdtTARTICU_Arttiplar_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtCorOri_N") )
            {
               gxTv_SdtTARTICU_Artcorori_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtEncOri_N") )
            {
               gxTv_SdtTARTICU_Artencori_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtSua_N") )
            {
               gxTv_SdtTARTICU_Artsua_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtAcaQui_N") )
            {
               gxTv_SdtTARTICU_Artacaqui_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtEti_N") )
            {
               gxTv_SdtTARTICU_Arteti_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtUrg_N") )
            {
               gxTv_SdtTARTICU_Arturg_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtMer_N") )
            {
               gxTv_SdtTARTICU_Artmer_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtTra1_N") )
            {
               gxTv_SdtTARTICU_Arttra1_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtTra2_N") )
            {
               gxTv_SdtTARTICU_Arttra2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtTra3_N") )
            {
               gxTv_SdtTARTICU_Arttra3_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtTraP1_N") )
            {
               gxTv_SdtTARTICU_Arttrap1_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtTraP2_N") )
            {
               gxTv_SdtTARTICU_Arttrap2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtTraP3_N") )
            {
               gxTv_SdtTARTICU_Arttrap3_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtUrd1_N") )
            {
               gxTv_SdtTARTICU_Arturd1_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtUrd2_N") )
            {
               gxTv_SdtTARTICU_Arturd2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtUrd3_N") )
            {
               gxTv_SdtTARTICU_Arturd3_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtUrdP1_N") )
            {
               gxTv_SdtTARTICU_Arturdp1_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtUrdP2_N") )
            {
               gxTv_SdtTARTICU_Arturdp2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtUrdP3_N") )
            {
               gxTv_SdtTARTICU_Arturdp3_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtEncCom_N") )
            {
               gxTv_SdtTARTICU_Artenccom_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtEncAnh_N") )
            {
               gxTv_SdtTARTICU_Artencanh_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtGraAca_N") )
            {
               gxTv_SdtTARTICU_Artgraaca_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtRdoA_N") )
            {
               gxTv_SdtTARTICU_Artrdoa_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtRdoN_N") )
            {
               gxTv_SdtTARTICU_Artrdon_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtFacAbs_N") )
            {
               gxTv_SdtTARTICU_Artfacabs_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtPle2_N") )
            {
               gxTv_SdtTARTICU_Artple2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtNumCor_N") )
            {
               gxTv_SdtTARTICU_Artnumcor_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtAncSal1_N") )
            {
               gxTv_SdtTARTICU_Artancsal1_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtAncSal2_N") )
            {
               gxTv_SdtTARTICU_Artancsal2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtAncSal3_N") )
            {
               gxTv_SdtTARTICU_Artancsal3_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtGraAca2_N") )
            {
               gxTv_SdtTARTICU_Artgraaca2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtGraCru2_N") )
            {
               gxTv_SdtTARTICU_Artgracru2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClasCod_N") )
            {
               gxTv_SdtTARTICU_Clascod_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtPmPPza_N") )
            {
               gxTv_SdtTARTICU_Artpmppza_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtFecCre_N") )
            {
               gxTv_SdtTARTICU_Artfeccre_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtUsrCod_N") )
            {
               gxTv_SdtTARTICU_Artusrcod_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtFecMod_N") )
            {
               gxTv_SdtTARTICU_Artfecmod_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClasDsc_N") )
            {
               gxTv_SdtTARTICU_Clasdsc_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtComer_N") )
            {
               gxTv_SdtTARTICU_Artcomer_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClaTubCod_N") )
            {
               gxTv_SdtTARTICU_Clatubcod_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClaTubDsc_N") )
            {
               gxTv_SdtTARTICU_Clatubdsc_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClaBolCod_N") )
            {
               gxTv_SdtTARTICU_Clabolcod_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClaBolDsc_N") )
            {
               gxTv_SdtTARTICU_Claboldsc_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtRdoCru1_N") )
            {
               gxTv_SdtTARTICU_Artrdocru1_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtRdoCru2_N") )
            {
               gxTv_SdtTARTICU_Artrdocru2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtNMtr_N") )
            {
               gxTv_SdtTARTICU_Artnmtr_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtLu_N") )
            {
               gxTv_SdtTARTICU_Artlu_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtRb_N") )
            {
               gxTv_SdtTARTICU_Artrb_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtPelAnh_N") )
            {
               gxTv_SdtTARTICU_Artpelanh_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Artgrm2Sc_N") )
            {
               gxTv_SdtTARTICU_Artgrm2sc_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtPmlSc_N") )
            {
               gxTv_SdtTARTICU_Artpmlsc_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtAncSc_N") )
            {
               gxTv_SdtTARTICU_Artancsc_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtPmlCru_N") )
            {
               gxTv_SdtTARTICU_Artpmlcru_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtRdtSc_N") )
            {
               gxTv_SdtTARTICU_Artrdtsc_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtUnd_N") )
            {
               gxTv_SdtTARTICU_Artund_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtBlo_N") )
            {
               gxTv_SdtTARTICU_Artblo_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtCla_N") )
            {
               gxTv_SdtTARTICU_Artcla_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtDsc2_N") )
            {
               gxTv_SdtTARTICU_Tipartdsc2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtFabsH_N") )
            {
               gxTv_SdtTARTICU_Artfabsh_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtFabsT_N") )
            {
               gxTv_SdtTARTICU_Artfabst_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtNProg_N") )
            {
               gxTv_SdtTARTICU_Artnprog_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtVbd_N") )
            {
               gxTv_SdtTARTICU_Artvbd_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtVbn_N") )
            {
               gxTv_SdtTARTICU_Artvbn_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtAb_N") )
            {
               gxTv_SdtTARTICU_Artab_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtObsGrm_N") )
            {
               gxTv_SdtTARTICU_Artobsgrm_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtObsAnc_N") )
            {
               gxTv_SdtTARTICU_Artobsanc_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtCdb_N") )
            {
               gxTv_SdtTARTICU_Artcdb_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtGalga_N") )
            {
               gxTv_SdtTARTICU_Artgalga_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtPlatina_N") )
            {
               gxTv_SdtTARTICU_Artplatina_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtPgd_N") )
            {
               gxTv_SdtTARTICU_Artpgd_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtTh_N") )
            {
               gxTv_SdtTARTICU_Artth_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtThN_N") )
            {
               gxTv_SdtTARTICU_Artthn_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Art_Cd_N") )
            {
               gxTv_SdtTARTICU_Art_cd_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Art_Dc_N") )
            {
               gxTv_SdtTARTICU_Art_dc_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtHilos_N") )
            {
               gxTv_SdtTARTICU_Arthilos_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtPasad_N") )
            {
               gxTv_SdtTARTICU_Artpasad_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtAncC_N") )
            {
               gxTv_SdtTARTICU_Artancc_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtGrm2C_N") )
            {
               gxTv_SdtTARTICU_Artgrm2c_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtRdoC_N") )
            {
               gxTv_SdtTARTICU_Artrdoc_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtAcaFor_N") )
            {
               gxTv_SdtTARTICU_Artacafor_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtAnu_N") )
            {
               gxTv_SdtTARTICU_Artanu_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtFacUti_N") )
            {
               gxTv_SdtTARTICU_Artfacuti_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtNumTip_N") )
            {
               gxTv_SdtTARTICU_Artnumtip_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtMT_N") )
            {
               gxTv_SdtTARTICU_Artmt_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtTRabs_N") )
            {
               gxTv_SdtTARTICU_Arttrabs_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtKgMn_N") )
            {
               gxTv_SdtTARTICU_Artkgmn_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtAcaMar_N") )
            {
               gxTv_SdtTARTICU_Artacamar_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtAcaBak_N") )
            {
               gxTv_SdtTARTICU_Artacabak_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtElgAnc_N") )
            {
               gxTv_SdtTARTICU_Artelganc_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtElgLar_N") )
            {
               gxTv_SdtTARTICU_Artelglar_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtRdoCru_N") )
            {
               gxTv_SdtTARTICU_Artrdocru_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtEncLarg_N") )
            {
               gxTv_SdtTARTICU_Artenclarg_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtEncAnc_N") )
            {
               gxTv_SdtTARTICU_Artencanc_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtRdto4_N") )
            {
               gxTv_SdtTARTICU_Artrdto4_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Artdsc2_N") )
            {
               gxTv_SdtTARTICU_Artdsc2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtgrComp_N") )
            {
               gxTv_SdtTARTICU_Artgrcomp_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtKgspp_N") )
            {
               gxTv_SdtTARTICU_Artkgspp_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtPrepp_N") )
            {
               gxTv_SdtTARTICU_Artprepp_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtObsLon_N") )
            {
               gxTv_SdtTARTICU_Artobslon_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtObsFac_N") )
            {
               gxTv_SdtTARTICU_Artobsfac_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtObsOtras_N") )
            {
               gxTv_SdtTARTICU_Artobsotras_N = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "TARTICU" ;
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
      oWriter.writeElement("EmprCod", gxTv_SdtTARTICU_Emprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliCod", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtCod", gxTv_SdtTARTICU_Artcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtDsc", gxTv_SdtTARTICU_Artdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNom", gxTv_SdtTARTICU_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtCodExt", gxTv_SdtTARTICU_Artcodext);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EmprNom", gxTv_SdtTARTICU_Emprnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtMat", gxTv_SdtTARTICU_Artmat);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipArtCod", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Tipartcod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipArtDsc", gxTv_SdtTARTICU_Tipartdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtPml", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artpml, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtGraCru", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artgracru, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtCruMin", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artcrumin, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtCruMax", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artcrumax, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtAcaMin", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artacamin, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtAcaMax", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artacamax, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtRen", GXutil.trim( GXutil.strNoRound( gxTv_SdtTARTICU_Artren, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtTipPle", gxTv_SdtTARTICU_Arttipple);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtTipLar", gxTv_SdtTARTICU_Arttiplar);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtCorOri", gxTv_SdtTARTICU_Artcorori);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtEncOri", gxTv_SdtTARTICU_Artencori);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtSua", gxTv_SdtTARTICU_Artsua);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtAcaQui", gxTv_SdtTARTICU_Artacaqui);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtEti", gxTv_SdtTARTICU_Arteti);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliEti", gxTv_SdtTARTICU_Clieti);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliUrg", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Cliurg, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtUrg", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Arturg, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtMer", GXutil.trim( GXutil.strNoRound( gxTv_SdtTARTICU_Artmer, 5, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtTra1", gxTv_SdtTARTICU_Arttra1);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtTra2", gxTv_SdtTARTICU_Arttra2);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtTra3", gxTv_SdtTARTICU_Arttra3);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtTraP1", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Arttrap1, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtTraP2", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Arttrap2, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtTraP3", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Arttrap3, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtUrd1", gxTv_SdtTARTICU_Arturd1);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtUrd2", gxTv_SdtTARTICU_Arturd2);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtUrd3", gxTv_SdtTARTICU_Arturd3);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtUrdP1", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Arturdp1, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtUrdP2", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Arturdp2, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtUrdP3", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Arturdp3, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtEncCom", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artenccom, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtEncAnh", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artencanh, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtGraAca", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artgraaca, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtRdoA", GXutil.trim( GXutil.strNoRound( gxTv_SdtTARTICU_Artrdoa, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtRdoN", GXutil.trim( GXutil.strNoRound( gxTv_SdtTARTICU_Artrdon, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtFacAbs", GXutil.trim( GXutil.strNoRound( gxTv_SdtTARTICU_Artfacabs, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtPle2", gxTv_SdtTARTICU_Artple2);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtNumCor", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artnumcor, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtAncSal1", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artancsal1, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtAncSal2", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artancsal2, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtAncSal3", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artancsal3, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtGraAca2", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artgraaca2, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtGraCru2", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artgracru2, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ClasCod", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Clascod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtPmPPza", GXutil.trim( GXutil.strNoRound( gxTv_SdtTARTICU_Artpmppza, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTARTICU_Artfeccre), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTARTICU_Artfeccre), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTARTICU_Artfeccre), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("ArtFecCre", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtUsrCod", gxTv_SdtTARTICU_Artusrcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTARTICU_Artfecmod), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTARTICU_Artfecmod), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTARTICU_Artfecmod), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("ArtFecMod", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ClasDsc", gxTv_SdtTARTICU_Clasdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtComer", gxTv_SdtTARTICU_Artcomer);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ClaTubCod", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Clatubcod, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ClaTubDsc", gxTv_SdtTARTICU_Clatubdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ClaBolCod", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Clabolcod, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ClaBolDsc", gxTv_SdtTARTICU_Claboldsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtRdoCru1", GXutil.trim( GXutil.strNoRound( gxTv_SdtTARTICU_Artrdocru1, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtRdoCru2", GXutil.trim( GXutil.strNoRound( gxTv_SdtTARTICU_Artrdocru2, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtNMtr", gxTv_SdtTARTICU_Artnmtr);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtLu", GXutil.trim( GXutil.strNoRound( gxTv_SdtTARTICU_Artlu, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtRb", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artrb, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtPelAnh", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artpelanh, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Artgrm2Sc", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artgrm2sc, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtPmlSc", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artpmlsc, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtAncSc", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artancsc, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtPmlCru", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artpmlcru, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtRdtSc", GXutil.trim( GXutil.strNoRound( gxTv_SdtTARTICU_Artrdtsc, 5, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtUnd", gxTv_SdtTARTICU_Artund);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtBlo", gxTv_SdtTARTICU_Artblo);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtCla", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artcla, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipArtDsc2", gxTv_SdtTARTICU_Tipartdsc2);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtFabsH", GXutil.trim( GXutil.strNoRound( gxTv_SdtTARTICU_Artfabsh, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtFabsT", GXutil.trim( GXutil.strNoRound( gxTv_SdtTARTICU_Artfabst, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtNProg", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artnprog, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtVbd", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artvbd, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtVbn", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artvbn, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtAb", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artab, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtObsGrm", gxTv_SdtTARTICU_Artobsgrm);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtObsAnc", gxTv_SdtTARTICU_Artobsanc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtCdb", gxTv_SdtTARTICU_Artcdb);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtGalga", gxTv_SdtTARTICU_Artgalga);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtPlatina", gxTv_SdtTARTICU_Artplatina);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtPgd", gxTv_SdtTARTICU_Artpgd);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtTh", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artth, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtThN", gxTv_SdtTARTICU_Artthn);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Art_Cd", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Art_cd, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Art_Dc", gxTv_SdtTARTICU_Art_dc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtHilos", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Arthilos, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtPasad", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artpasad, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtAncC", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artancc, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtGrm2C", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artgrm2c, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtRdoC", GXutil.trim( GXutil.strNoRound( gxTv_SdtTARTICU_Artrdoc, 5, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtAcaFor", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artacafor, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtAnu", gxTv_SdtTARTICU_Artanu);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtFacUti", GXutil.trim( GXutil.strNoRound( gxTv_SdtTARTICU_Artfacuti, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtNumTip", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artnumtip, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtMT", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artmt, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtTRabs", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Arttrabs, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtKgMn", GXutil.trim( GXutil.strNoRound( gxTv_SdtTARTICU_Artkgmn, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtAcaMar", gxTv_SdtTARTICU_Artacamar);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtAcaBak", gxTv_SdtTARTICU_Artacabak);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtElgAnc", GXutil.trim( GXutil.strNoRound( gxTv_SdtTARTICU_Artelganc, 7, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtElgLar", GXutil.trim( GXutil.strNoRound( gxTv_SdtTARTICU_Artelglar, 7, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtRdoCru", GXutil.trim( GXutil.strNoRound( gxTv_SdtTARTICU_Artrdocru, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtEncLarg", GXutil.trim( GXutil.strNoRound( gxTv_SdtTARTICU_Artenclarg, 7, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtEncAnc", GXutil.trim( GXutil.strNoRound( gxTv_SdtTARTICU_Artencanc, 7, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtRdto4", GXutil.trim( GXutil.strNoRound( gxTv_SdtTARTICU_Artrdto4, 7, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Artdsc2", gxTv_SdtTARTICU_Artdsc2);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtgrComp", GXutil.trim( GXutil.strNoRound( gxTv_SdtTARTICU_Artgrcomp, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtKgspp", GXutil.trim( GXutil.strNoRound( gxTv_SdtTARTICU_Artkgspp, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtPrepp", GXutil.trim( GXutil.strNoRound( gxTv_SdtTARTICU_Artprepp, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtCDsc", gxTv_SdtTARTICU_Artcdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtObsLon", gxTv_SdtTARTICU_Artobslon);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtObsFac", gxTv_SdtTARTICU_Artobsfac);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtObsOtras", gxTv_SdtTARTICU_Artobsotras);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtActivo", gxTv_SdtTARTICU_Artactivo);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", gxTv_SdtTARTICU_Mode);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprCod_Z", gxTv_SdtTARTICU_Emprcod_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CliCod_Z", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Clicod_Z, 6, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtCod_Z", gxTv_SdtTARTICU_Artcod_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtDsc_Z", gxTv_SdtTARTICU_Artdsc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CliNom_Z", gxTv_SdtTARTICU_Clinom_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtCodExt_Z", gxTv_SdtTARTICU_Artcodext_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprNom_Z", gxTv_SdtTARTICU_Emprnom_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtMat_Z", gxTv_SdtTARTICU_Artmat_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TipArtCod_Z", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Tipartcod_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TipArtDsc_Z", gxTv_SdtTARTICU_Tipartdsc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtPml_Z", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artpml_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtGraCru_Z", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artgracru_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtCruMin_Z", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artcrumin_Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtCruMax_Z", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artcrumax_Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtAcaMin_Z", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artacamin_Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtAcaMax_Z", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artacamax_Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtRen_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtTARTICU_Artren_Z, 6, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtTipPle_Z", gxTv_SdtTARTICU_Arttipple_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtTipLar_Z", gxTv_SdtTARTICU_Arttiplar_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtCorOri_Z", gxTv_SdtTARTICU_Artcorori_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtEncOri_Z", gxTv_SdtTARTICU_Artencori_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtSua_Z", gxTv_SdtTARTICU_Artsua_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtAcaQui_Z", gxTv_SdtTARTICU_Artacaqui_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtEti_Z", gxTv_SdtTARTICU_Arteti_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CliEti_Z", gxTv_SdtTARTICU_Clieti_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CliUrg_Z", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Cliurg_Z, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtUrg_Z", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Arturg_Z, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtMer_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtTARTICU_Artmer_Z, 5, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtTra1_Z", gxTv_SdtTARTICU_Arttra1_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtTra2_Z", gxTv_SdtTARTICU_Arttra2_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtTra3_Z", gxTv_SdtTARTICU_Arttra3_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtTraP1_Z", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Arttrap1_Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtTraP2_Z", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Arttrap2_Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtTraP3_Z", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Arttrap3_Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtUrd1_Z", gxTv_SdtTARTICU_Arturd1_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtUrd2_Z", gxTv_SdtTARTICU_Arturd2_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtUrd3_Z", gxTv_SdtTARTICU_Arturd3_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtUrdP1_Z", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Arturdp1_Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtUrdP2_Z", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Arturdp2_Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtUrdP3_Z", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Arturdp3_Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtEncCom_Z", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artenccom_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtEncAnh_Z", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artencanh_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtGraAca_Z", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artgraaca_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtRdoA_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtTARTICU_Artrdoa_Z, 6, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtRdoN_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtTARTICU_Artrdon_Z, 6, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtFacAbs_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtTARTICU_Artfacabs_Z, 6, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtPle2_Z", gxTv_SdtTARTICU_Artple2_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtNumCor_Z", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artnumcor_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtAncSal1_Z", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artancsal1_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtAncSal2_Z", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artancsal2_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtAncSal3_Z", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artancsal3_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtGraAca2_Z", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artgraaca2_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtGraCru2_Z", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artgracru2_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ClasCod_Z", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Clascod_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtPmPPza_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtTARTICU_Artpmppza_Z, 9, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTARTICU_Artfeccre_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTARTICU_Artfeccre_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTARTICU_Artfeccre_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("ArtFecCre_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtUsrCod_Z", gxTv_SdtTARTICU_Artusrcod_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTARTICU_Artfecmod_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTARTICU_Artfecmod_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTARTICU_Artfecmod_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("ArtFecMod_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ClasDsc_Z", gxTv_SdtTARTICU_Clasdsc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtComer_Z", gxTv_SdtTARTICU_Artcomer_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ClaTubCod_Z", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Clatubcod_Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ClaTubDsc_Z", gxTv_SdtTARTICU_Clatubdsc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ClaBolCod_Z", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Clabolcod_Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ClaBolDsc_Z", gxTv_SdtTARTICU_Claboldsc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtRdoCru1_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtTARTICU_Artrdocru1_Z, 6, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtRdoCru2_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtTARTICU_Artrdocru2_Z, 6, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtNMtr_Z", gxTv_SdtTARTICU_Artnmtr_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtLu_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtTARTICU_Artlu_Z, 6, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtRb_Z", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artrb_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtPelAnh_Z", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artpelanh_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Artgrm2Sc_Z", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artgrm2sc_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtPmlSc_Z", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artpmlsc_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtAncSc_Z", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artancsc_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtPmlCru_Z", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artpmlcru_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtRdtSc_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtTARTICU_Artrdtsc_Z, 5, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtUnd_Z", gxTv_SdtTARTICU_Artund_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtBlo_Z", gxTv_SdtTARTICU_Artblo_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtCla_Z", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artcla_Z, 2, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TipArtDsc2_Z", gxTv_SdtTARTICU_Tipartdsc2_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtFabsH_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtTARTICU_Artfabsh_Z, 6, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtFabsT_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtTARTICU_Artfabst_Z, 6, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtNProg_Z", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artnprog_Z, 2, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtVbd_Z", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artvbd_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtVbn_Z", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artvbn_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtAb_Z", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artab_Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtObsGrm_Z", gxTv_SdtTARTICU_Artobsgrm_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtObsAnc_Z", gxTv_SdtTARTICU_Artobsanc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtCdb_Z", gxTv_SdtTARTICU_Artcdb_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtGalga_Z", gxTv_SdtTARTICU_Artgalga_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtPlatina_Z", gxTv_SdtTARTICU_Artplatina_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtPgd_Z", gxTv_SdtTARTICU_Artpgd_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtTh_Z", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artth_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtThN_Z", gxTv_SdtTARTICU_Artthn_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Art_Cd_Z", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Art_cd_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Art_Dc_Z", gxTv_SdtTARTICU_Art_dc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtHilos_Z", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Arthilos_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtPasad_Z", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artpasad_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtAncC_Z", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artancc_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtGrm2C_Z", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artgrm2c_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtRdoC_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtTARTICU_Artrdoc_Z, 5, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtAcaFor_Z", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artacafor_Z, 8, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtAnu_Z", gxTv_SdtTARTICU_Artanu_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtFacUti_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtTARTICU_Artfacuti_Z, 6, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtNumTip_Z", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artnumtip_Z, 6, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtMT_Z", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artmt_Z, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtTRabs_Z", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Arttrabs_Z, 2, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtKgMn_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtTARTICU_Artkgmn_Z, 9, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtAcaMar_Z", gxTv_SdtTARTICU_Artacamar_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtAcaBak_Z", gxTv_SdtTARTICU_Artacabak_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtElgAnc_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtTARTICU_Artelganc_Z, 7, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtElgLar_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtTARTICU_Artelglar_Z, 7, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtRdoCru_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtTARTICU_Artrdocru_Z, 6, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtEncLarg_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtTARTICU_Artenclarg_Z, 7, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtEncAnc_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtTARTICU_Artencanc_Z, 7, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtRdto4_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtTARTICU_Artrdto4_Z, 7, 4)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Artdsc2_Z", gxTv_SdtTARTICU_Artdsc2_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtgrComp_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtTARTICU_Artgrcomp_Z, 9, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtKgspp_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtTARTICU_Artkgspp_Z, 9, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtPrepp_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtTARTICU_Artprepp_Z, 9, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtCDsc_Z", gxTv_SdtTARTICU_Artcdsc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtObsFac_Z", gxTv_SdtTARTICU_Artobsfac_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtObsOtras_Z", gxTv_SdtTARTICU_Artobsotras_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtActivo_Z", gxTv_SdtTARTICU_Artactivo_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CliCod_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Clicod_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtCod_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artcod_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtDsc_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artdsc_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtCodExt_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artcodext_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprNom_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Emprnom_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtMat_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artmat_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TipArtDsc_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Tipartdsc_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtPml_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artpml_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtGraCru_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artgracru_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtCruMin_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artcrumin_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtCruMax_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artcrumax_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtAcaMin_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artacamin_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtAcaMax_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artacamax_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtRen_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artren_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtTipPle_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Arttipple_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtTipLar_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Arttiplar_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtCorOri_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artcorori_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtEncOri_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artencori_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtSua_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artsua_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtAcaQui_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artacaqui_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtEti_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Arteti_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtUrg_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Arturg_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtMer_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artmer_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtTra1_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Arttra1_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtTra2_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Arttra2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtTra3_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Arttra3_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtTraP1_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Arttrap1_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtTraP2_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Arttrap2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtTraP3_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Arttrap3_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtUrd1_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Arturd1_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtUrd2_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Arturd2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtUrd3_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Arturd3_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtUrdP1_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Arturdp1_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtUrdP2_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Arturdp2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtUrdP3_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Arturdp3_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtEncCom_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artenccom_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtEncAnh_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artencanh_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtGraAca_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artgraaca_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtRdoA_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artrdoa_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtRdoN_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artrdon_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtFacAbs_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artfacabs_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtPle2_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artple2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtNumCor_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artnumcor_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtAncSal1_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artancsal1_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtAncSal2_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artancsal2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtAncSal3_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artancsal3_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtGraAca2_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artgraaca2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtGraCru2_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artgracru2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ClasCod_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Clascod_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtPmPPza_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artpmppza_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtFecCre_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artfeccre_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtUsrCod_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artusrcod_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtFecMod_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artfecmod_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ClasDsc_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Clasdsc_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtComer_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artcomer_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ClaTubCod_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Clatubcod_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ClaTubDsc_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Clatubdsc_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ClaBolCod_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Clabolcod_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ClaBolDsc_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Claboldsc_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtRdoCru1_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artrdocru1_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtRdoCru2_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artrdocru2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtNMtr_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artnmtr_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtLu_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artlu_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtRb_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artrb_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtPelAnh_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artpelanh_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Artgrm2Sc_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artgrm2sc_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtPmlSc_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artpmlsc_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtAncSc_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artancsc_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtPmlCru_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artpmlcru_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtRdtSc_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artrdtsc_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtUnd_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artund_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtBlo_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artblo_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtCla_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artcla_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TipArtDsc2_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Tipartdsc2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtFabsH_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artfabsh_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtFabsT_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artfabst_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtNProg_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artnprog_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtVbd_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artvbd_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtVbn_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artvbn_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtAb_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artab_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtObsGrm_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artobsgrm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtObsAnc_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artobsanc_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtCdb_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artcdb_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtGalga_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artgalga_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtPlatina_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artplatina_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtPgd_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artpgd_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtTh_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artth_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtThN_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artthn_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Art_Cd_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Art_cd_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Art_Dc_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Art_dc_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtHilos_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Arthilos_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtPasad_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artpasad_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtAncC_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artancc_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtGrm2C_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artgrm2c_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtRdoC_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artrdoc_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtAcaFor_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artacafor_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtAnu_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artanu_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtFacUti_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artfacuti_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtNumTip_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artnumtip_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtMT_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artmt_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtTRabs_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Arttrabs_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtKgMn_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artkgmn_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtAcaMar_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artacamar_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtAcaBak_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artacabak_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtElgAnc_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artelganc_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtElgLar_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artelglar_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtRdoCru_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artrdocru_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtEncLarg_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artenclarg_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtEncAnc_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artencanc_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtRdto4_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artrdto4_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Artdsc2_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artdsc2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtgrComp_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artgrcomp_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtKgspp_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artkgspp_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtPrepp_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artprepp_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtObsLon_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artobslon_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtObsFac_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artobsfac_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ArtObsOtras_N", GXutil.trim( GXutil.str( gxTv_SdtTARTICU_Artobsotras_N, 1, 0)));
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
      AddObjectProperty("EmprCod", gxTv_SdtTARTICU_Emprcod, false, includeNonInitialized);
      AddObjectProperty("CliCod", gxTv_SdtTARTICU_Clicod, false, includeNonInitialized);
      AddObjectProperty("CliCod_N", gxTv_SdtTARTICU_Clicod_N, false, includeNonInitialized);
      AddObjectProperty("ArtCod", gxTv_SdtTARTICU_Artcod, false, includeNonInitialized);
      AddObjectProperty("ArtCod_N", gxTv_SdtTARTICU_Artcod_N, false, includeNonInitialized);
      AddObjectProperty("ArtDsc", gxTv_SdtTARTICU_Artdsc, false, includeNonInitialized);
      AddObjectProperty("ArtDsc_N", gxTv_SdtTARTICU_Artdsc_N, false, includeNonInitialized);
      AddObjectProperty("CliNom", gxTv_SdtTARTICU_Clinom, false, includeNonInitialized);
      AddObjectProperty("ArtCodExt", gxTv_SdtTARTICU_Artcodext, false, includeNonInitialized);
      AddObjectProperty("ArtCodExt_N", gxTv_SdtTARTICU_Artcodext_N, false, includeNonInitialized);
      AddObjectProperty("EmprNom", gxTv_SdtTARTICU_Emprnom, false, includeNonInitialized);
      AddObjectProperty("EmprNom_N", gxTv_SdtTARTICU_Emprnom_N, false, includeNonInitialized);
      AddObjectProperty("ArtMat", gxTv_SdtTARTICU_Artmat, false, includeNonInitialized);
      AddObjectProperty("ArtMat_N", gxTv_SdtTARTICU_Artmat_N, false, includeNonInitialized);
      AddObjectProperty("TipArtCod", gxTv_SdtTARTICU_Tipartcod, false, includeNonInitialized);
      AddObjectProperty("TipArtDsc", gxTv_SdtTARTICU_Tipartdsc, false, includeNonInitialized);
      AddObjectProperty("TipArtDsc_N", gxTv_SdtTARTICU_Tipartdsc_N, false, includeNonInitialized);
      AddObjectProperty("ArtPml", gxTv_SdtTARTICU_Artpml, false, includeNonInitialized);
      AddObjectProperty("ArtPml_N", gxTv_SdtTARTICU_Artpml_N, false, includeNonInitialized);
      AddObjectProperty("ArtGraCru", gxTv_SdtTARTICU_Artgracru, false, includeNonInitialized);
      AddObjectProperty("ArtGraCru_N", gxTv_SdtTARTICU_Artgracru_N, false, includeNonInitialized);
      AddObjectProperty("ArtCruMin", gxTv_SdtTARTICU_Artcrumin, false, includeNonInitialized);
      AddObjectProperty("ArtCruMin_N", gxTv_SdtTARTICU_Artcrumin_N, false, includeNonInitialized);
      AddObjectProperty("ArtCruMax", gxTv_SdtTARTICU_Artcrumax, false, includeNonInitialized);
      AddObjectProperty("ArtCruMax_N", gxTv_SdtTARTICU_Artcrumax_N, false, includeNonInitialized);
      AddObjectProperty("ArtAcaMin", gxTv_SdtTARTICU_Artacamin, false, includeNonInitialized);
      AddObjectProperty("ArtAcaMin_N", gxTv_SdtTARTICU_Artacamin_N, false, includeNonInitialized);
      AddObjectProperty("ArtAcaMax", gxTv_SdtTARTICU_Artacamax, false, includeNonInitialized);
      AddObjectProperty("ArtAcaMax_N", gxTv_SdtTARTICU_Artacamax_N, false, includeNonInitialized);
      AddObjectProperty("ArtRen", gxTv_SdtTARTICU_Artren, false, includeNonInitialized);
      AddObjectProperty("ArtRen_N", gxTv_SdtTARTICU_Artren_N, false, includeNonInitialized);
      AddObjectProperty("ArtTipPle", gxTv_SdtTARTICU_Arttipple, false, includeNonInitialized);
      AddObjectProperty("ArtTipPle_N", gxTv_SdtTARTICU_Arttipple_N, false, includeNonInitialized);
      AddObjectProperty("ArtTipLar", gxTv_SdtTARTICU_Arttiplar, false, includeNonInitialized);
      AddObjectProperty("ArtTipLar_N", gxTv_SdtTARTICU_Arttiplar_N, false, includeNonInitialized);
      AddObjectProperty("ArtCorOri", gxTv_SdtTARTICU_Artcorori, false, includeNonInitialized);
      AddObjectProperty("ArtCorOri_N", gxTv_SdtTARTICU_Artcorori_N, false, includeNonInitialized);
      AddObjectProperty("ArtEncOri", gxTv_SdtTARTICU_Artencori, false, includeNonInitialized);
      AddObjectProperty("ArtEncOri_N", gxTv_SdtTARTICU_Artencori_N, false, includeNonInitialized);
      AddObjectProperty("ArtSua", gxTv_SdtTARTICU_Artsua, false, includeNonInitialized);
      AddObjectProperty("ArtSua_N", gxTv_SdtTARTICU_Artsua_N, false, includeNonInitialized);
      AddObjectProperty("ArtAcaQui", gxTv_SdtTARTICU_Artacaqui, false, includeNonInitialized);
      AddObjectProperty("ArtAcaQui_N", gxTv_SdtTARTICU_Artacaqui_N, false, includeNonInitialized);
      AddObjectProperty("ArtEti", gxTv_SdtTARTICU_Arteti, false, includeNonInitialized);
      AddObjectProperty("ArtEti_N", gxTv_SdtTARTICU_Arteti_N, false, includeNonInitialized);
      AddObjectProperty("CliEti", gxTv_SdtTARTICU_Clieti, false, includeNonInitialized);
      AddObjectProperty("CliUrg", gxTv_SdtTARTICU_Cliurg, false, includeNonInitialized);
      AddObjectProperty("ArtUrg", gxTv_SdtTARTICU_Arturg, false, includeNonInitialized);
      AddObjectProperty("ArtUrg_N", gxTv_SdtTARTICU_Arturg_N, false, includeNonInitialized);
      AddObjectProperty("ArtMer", gxTv_SdtTARTICU_Artmer, false, includeNonInitialized);
      AddObjectProperty("ArtMer_N", gxTv_SdtTARTICU_Artmer_N, false, includeNonInitialized);
      AddObjectProperty("ArtTra1", gxTv_SdtTARTICU_Arttra1, false, includeNonInitialized);
      AddObjectProperty("ArtTra1_N", gxTv_SdtTARTICU_Arttra1_N, false, includeNonInitialized);
      AddObjectProperty("ArtTra2", gxTv_SdtTARTICU_Arttra2, false, includeNonInitialized);
      AddObjectProperty("ArtTra2_N", gxTv_SdtTARTICU_Arttra2_N, false, includeNonInitialized);
      AddObjectProperty("ArtTra3", gxTv_SdtTARTICU_Arttra3, false, includeNonInitialized);
      AddObjectProperty("ArtTra3_N", gxTv_SdtTARTICU_Arttra3_N, false, includeNonInitialized);
      AddObjectProperty("ArtTraP1", gxTv_SdtTARTICU_Arttrap1, false, includeNonInitialized);
      AddObjectProperty("ArtTraP1_N", gxTv_SdtTARTICU_Arttrap1_N, false, includeNonInitialized);
      AddObjectProperty("ArtTraP2", gxTv_SdtTARTICU_Arttrap2, false, includeNonInitialized);
      AddObjectProperty("ArtTraP2_N", gxTv_SdtTARTICU_Arttrap2_N, false, includeNonInitialized);
      AddObjectProperty("ArtTraP3", gxTv_SdtTARTICU_Arttrap3, false, includeNonInitialized);
      AddObjectProperty("ArtTraP3_N", gxTv_SdtTARTICU_Arttrap3_N, false, includeNonInitialized);
      AddObjectProperty("ArtUrd1", gxTv_SdtTARTICU_Arturd1, false, includeNonInitialized);
      AddObjectProperty("ArtUrd1_N", gxTv_SdtTARTICU_Arturd1_N, false, includeNonInitialized);
      AddObjectProperty("ArtUrd2", gxTv_SdtTARTICU_Arturd2, false, includeNonInitialized);
      AddObjectProperty("ArtUrd2_N", gxTv_SdtTARTICU_Arturd2_N, false, includeNonInitialized);
      AddObjectProperty("ArtUrd3", gxTv_SdtTARTICU_Arturd3, false, includeNonInitialized);
      AddObjectProperty("ArtUrd3_N", gxTv_SdtTARTICU_Arturd3_N, false, includeNonInitialized);
      AddObjectProperty("ArtUrdP1", gxTv_SdtTARTICU_Arturdp1, false, includeNonInitialized);
      AddObjectProperty("ArtUrdP1_N", gxTv_SdtTARTICU_Arturdp1_N, false, includeNonInitialized);
      AddObjectProperty("ArtUrdP2", gxTv_SdtTARTICU_Arturdp2, false, includeNonInitialized);
      AddObjectProperty("ArtUrdP2_N", gxTv_SdtTARTICU_Arturdp2_N, false, includeNonInitialized);
      AddObjectProperty("ArtUrdP3", gxTv_SdtTARTICU_Arturdp3, false, includeNonInitialized);
      AddObjectProperty("ArtUrdP3_N", gxTv_SdtTARTICU_Arturdp3_N, false, includeNonInitialized);
      AddObjectProperty("ArtEncCom", gxTv_SdtTARTICU_Artenccom, false, includeNonInitialized);
      AddObjectProperty("ArtEncCom_N", gxTv_SdtTARTICU_Artenccom_N, false, includeNonInitialized);
      AddObjectProperty("ArtEncAnh", gxTv_SdtTARTICU_Artencanh, false, includeNonInitialized);
      AddObjectProperty("ArtEncAnh_N", gxTv_SdtTARTICU_Artencanh_N, false, includeNonInitialized);
      AddObjectProperty("ArtGraAca", gxTv_SdtTARTICU_Artgraaca, false, includeNonInitialized);
      AddObjectProperty("ArtGraAca_N", gxTv_SdtTARTICU_Artgraaca_N, false, includeNonInitialized);
      AddObjectProperty("ArtRdoA", gxTv_SdtTARTICU_Artrdoa, false, includeNonInitialized);
      AddObjectProperty("ArtRdoA_N", gxTv_SdtTARTICU_Artrdoa_N, false, includeNonInitialized);
      AddObjectProperty("ArtRdoN", gxTv_SdtTARTICU_Artrdon, false, includeNonInitialized);
      AddObjectProperty("ArtRdoN_N", gxTv_SdtTARTICU_Artrdon_N, false, includeNonInitialized);
      AddObjectProperty("ArtFacAbs", gxTv_SdtTARTICU_Artfacabs, false, includeNonInitialized);
      AddObjectProperty("ArtFacAbs_N", gxTv_SdtTARTICU_Artfacabs_N, false, includeNonInitialized);
      AddObjectProperty("ArtPle2", gxTv_SdtTARTICU_Artple2, false, includeNonInitialized);
      AddObjectProperty("ArtPle2_N", gxTv_SdtTARTICU_Artple2_N, false, includeNonInitialized);
      AddObjectProperty("ArtNumCor", gxTv_SdtTARTICU_Artnumcor, false, includeNonInitialized);
      AddObjectProperty("ArtNumCor_N", gxTv_SdtTARTICU_Artnumcor_N, false, includeNonInitialized);
      AddObjectProperty("ArtAncSal1", gxTv_SdtTARTICU_Artancsal1, false, includeNonInitialized);
      AddObjectProperty("ArtAncSal1_N", gxTv_SdtTARTICU_Artancsal1_N, false, includeNonInitialized);
      AddObjectProperty("ArtAncSal2", gxTv_SdtTARTICU_Artancsal2, false, includeNonInitialized);
      AddObjectProperty("ArtAncSal2_N", gxTv_SdtTARTICU_Artancsal2_N, false, includeNonInitialized);
      AddObjectProperty("ArtAncSal3", gxTv_SdtTARTICU_Artancsal3, false, includeNonInitialized);
      AddObjectProperty("ArtAncSal3_N", gxTv_SdtTARTICU_Artancsal3_N, false, includeNonInitialized);
      AddObjectProperty("ArtGraAca2", gxTv_SdtTARTICU_Artgraaca2, false, includeNonInitialized);
      AddObjectProperty("ArtGraAca2_N", gxTv_SdtTARTICU_Artgraaca2_N, false, includeNonInitialized);
      AddObjectProperty("ArtGraCru2", gxTv_SdtTARTICU_Artgracru2, false, includeNonInitialized);
      AddObjectProperty("ArtGraCru2_N", gxTv_SdtTARTICU_Artgracru2_N, false, includeNonInitialized);
      AddObjectProperty("ClasCod", gxTv_SdtTARTICU_Clascod, false, includeNonInitialized);
      AddObjectProperty("ClasCod_N", gxTv_SdtTARTICU_Clascod_N, false, includeNonInitialized);
      AddObjectProperty("ArtPmPPza", gxTv_SdtTARTICU_Artpmppza, false, includeNonInitialized);
      AddObjectProperty("ArtPmPPza_N", gxTv_SdtTARTICU_Artpmppza_N, false, includeNonInitialized);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTARTICU_Artfeccre), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTARTICU_Artfeccre), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTARTICU_Artfeccre), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("ArtFecCre", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("ArtFecCre_N", gxTv_SdtTARTICU_Artfeccre_N, false, includeNonInitialized);
      AddObjectProperty("ArtUsrCod", gxTv_SdtTARTICU_Artusrcod, false, includeNonInitialized);
      AddObjectProperty("ArtUsrCod_N", gxTv_SdtTARTICU_Artusrcod_N, false, includeNonInitialized);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTARTICU_Artfecmod), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTARTICU_Artfecmod), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTARTICU_Artfecmod), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("ArtFecMod", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("ArtFecMod_N", gxTv_SdtTARTICU_Artfecmod_N, false, includeNonInitialized);
      AddObjectProperty("ClasDsc", gxTv_SdtTARTICU_Clasdsc, false, includeNonInitialized);
      AddObjectProperty("ClasDsc_N", gxTv_SdtTARTICU_Clasdsc_N, false, includeNonInitialized);
      AddObjectProperty("ArtComer", gxTv_SdtTARTICU_Artcomer, false, includeNonInitialized);
      AddObjectProperty("ArtComer_N", gxTv_SdtTARTICU_Artcomer_N, false, includeNonInitialized);
      AddObjectProperty("ClaTubCod", gxTv_SdtTARTICU_Clatubcod, false, includeNonInitialized);
      AddObjectProperty("ClaTubCod_N", gxTv_SdtTARTICU_Clatubcod_N, false, includeNonInitialized);
      AddObjectProperty("ClaTubDsc", gxTv_SdtTARTICU_Clatubdsc, false, includeNonInitialized);
      AddObjectProperty("ClaTubDsc_N", gxTv_SdtTARTICU_Clatubdsc_N, false, includeNonInitialized);
      AddObjectProperty("ClaBolCod", gxTv_SdtTARTICU_Clabolcod, false, includeNonInitialized);
      AddObjectProperty("ClaBolCod_N", gxTv_SdtTARTICU_Clabolcod_N, false, includeNonInitialized);
      AddObjectProperty("ClaBolDsc", gxTv_SdtTARTICU_Claboldsc, false, includeNonInitialized);
      AddObjectProperty("ClaBolDsc_N", gxTv_SdtTARTICU_Claboldsc_N, false, includeNonInitialized);
      AddObjectProperty("ArtRdoCru1", gxTv_SdtTARTICU_Artrdocru1, false, includeNonInitialized);
      AddObjectProperty("ArtRdoCru1_N", gxTv_SdtTARTICU_Artrdocru1_N, false, includeNonInitialized);
      AddObjectProperty("ArtRdoCru2", gxTv_SdtTARTICU_Artrdocru2, false, includeNonInitialized);
      AddObjectProperty("ArtRdoCru2_N", gxTv_SdtTARTICU_Artrdocru2_N, false, includeNonInitialized);
      AddObjectProperty("ArtNMtr", gxTv_SdtTARTICU_Artnmtr, false, includeNonInitialized);
      AddObjectProperty("ArtNMtr_N", gxTv_SdtTARTICU_Artnmtr_N, false, includeNonInitialized);
      AddObjectProperty("ArtLu", gxTv_SdtTARTICU_Artlu, false, includeNonInitialized);
      AddObjectProperty("ArtLu_N", gxTv_SdtTARTICU_Artlu_N, false, includeNonInitialized);
      AddObjectProperty("ArtRb", gxTv_SdtTARTICU_Artrb, false, includeNonInitialized);
      AddObjectProperty("ArtRb_N", gxTv_SdtTARTICU_Artrb_N, false, includeNonInitialized);
      AddObjectProperty("ArtPelAnh", gxTv_SdtTARTICU_Artpelanh, false, includeNonInitialized);
      AddObjectProperty("ArtPelAnh_N", gxTv_SdtTARTICU_Artpelanh_N, false, includeNonInitialized);
      AddObjectProperty("Artgrm2Sc", gxTv_SdtTARTICU_Artgrm2sc, false, includeNonInitialized);
      AddObjectProperty("Artgrm2Sc_N", gxTv_SdtTARTICU_Artgrm2sc_N, false, includeNonInitialized);
      AddObjectProperty("ArtPmlSc", gxTv_SdtTARTICU_Artpmlsc, false, includeNonInitialized);
      AddObjectProperty("ArtPmlSc_N", gxTv_SdtTARTICU_Artpmlsc_N, false, includeNonInitialized);
      AddObjectProperty("ArtAncSc", gxTv_SdtTARTICU_Artancsc, false, includeNonInitialized);
      AddObjectProperty("ArtAncSc_N", gxTv_SdtTARTICU_Artancsc_N, false, includeNonInitialized);
      AddObjectProperty("ArtPmlCru", gxTv_SdtTARTICU_Artpmlcru, false, includeNonInitialized);
      AddObjectProperty("ArtPmlCru_N", gxTv_SdtTARTICU_Artpmlcru_N, false, includeNonInitialized);
      AddObjectProperty("ArtRdtSc", gxTv_SdtTARTICU_Artrdtsc, false, includeNonInitialized);
      AddObjectProperty("ArtRdtSc_N", gxTv_SdtTARTICU_Artrdtsc_N, false, includeNonInitialized);
      AddObjectProperty("ArtUnd", gxTv_SdtTARTICU_Artund, false, includeNonInitialized);
      AddObjectProperty("ArtUnd_N", gxTv_SdtTARTICU_Artund_N, false, includeNonInitialized);
      AddObjectProperty("ArtBlo", gxTv_SdtTARTICU_Artblo, false, includeNonInitialized);
      AddObjectProperty("ArtBlo_N", gxTv_SdtTARTICU_Artblo_N, false, includeNonInitialized);
      AddObjectProperty("ArtCla", gxTv_SdtTARTICU_Artcla, false, includeNonInitialized);
      AddObjectProperty("ArtCla_N", gxTv_SdtTARTICU_Artcla_N, false, includeNonInitialized);
      AddObjectProperty("TipArtDsc2", gxTv_SdtTARTICU_Tipartdsc2, false, includeNonInitialized);
      AddObjectProperty("TipArtDsc2_N", gxTv_SdtTARTICU_Tipartdsc2_N, false, includeNonInitialized);
      AddObjectProperty("ArtFabsH", gxTv_SdtTARTICU_Artfabsh, false, includeNonInitialized);
      AddObjectProperty("ArtFabsH_N", gxTv_SdtTARTICU_Artfabsh_N, false, includeNonInitialized);
      AddObjectProperty("ArtFabsT", gxTv_SdtTARTICU_Artfabst, false, includeNonInitialized);
      AddObjectProperty("ArtFabsT_N", gxTv_SdtTARTICU_Artfabst_N, false, includeNonInitialized);
      AddObjectProperty("ArtNProg", gxTv_SdtTARTICU_Artnprog, false, includeNonInitialized);
      AddObjectProperty("ArtNProg_N", gxTv_SdtTARTICU_Artnprog_N, false, includeNonInitialized);
      AddObjectProperty("ArtVbd", gxTv_SdtTARTICU_Artvbd, false, includeNonInitialized);
      AddObjectProperty("ArtVbd_N", gxTv_SdtTARTICU_Artvbd_N, false, includeNonInitialized);
      AddObjectProperty("ArtVbn", gxTv_SdtTARTICU_Artvbn, false, includeNonInitialized);
      AddObjectProperty("ArtVbn_N", gxTv_SdtTARTICU_Artvbn_N, false, includeNonInitialized);
      AddObjectProperty("ArtAb", gxTv_SdtTARTICU_Artab, false, includeNonInitialized);
      AddObjectProperty("ArtAb_N", gxTv_SdtTARTICU_Artab_N, false, includeNonInitialized);
      AddObjectProperty("ArtObsGrm", gxTv_SdtTARTICU_Artobsgrm, false, includeNonInitialized);
      AddObjectProperty("ArtObsGrm_N", gxTv_SdtTARTICU_Artobsgrm_N, false, includeNonInitialized);
      AddObjectProperty("ArtObsAnc", gxTv_SdtTARTICU_Artobsanc, false, includeNonInitialized);
      AddObjectProperty("ArtObsAnc_N", gxTv_SdtTARTICU_Artobsanc_N, false, includeNonInitialized);
      AddObjectProperty("ArtCdb", gxTv_SdtTARTICU_Artcdb, false, includeNonInitialized);
      AddObjectProperty("ArtCdb_N", gxTv_SdtTARTICU_Artcdb_N, false, includeNonInitialized);
      AddObjectProperty("ArtGalga", gxTv_SdtTARTICU_Artgalga, false, includeNonInitialized);
      AddObjectProperty("ArtGalga_N", gxTv_SdtTARTICU_Artgalga_N, false, includeNonInitialized);
      AddObjectProperty("ArtPlatina", gxTv_SdtTARTICU_Artplatina, false, includeNonInitialized);
      AddObjectProperty("ArtPlatina_N", gxTv_SdtTARTICU_Artplatina_N, false, includeNonInitialized);
      AddObjectProperty("ArtPgd", gxTv_SdtTARTICU_Artpgd, false, includeNonInitialized);
      AddObjectProperty("ArtPgd_N", gxTv_SdtTARTICU_Artpgd_N, false, includeNonInitialized);
      AddObjectProperty("ArtTh", gxTv_SdtTARTICU_Artth, false, includeNonInitialized);
      AddObjectProperty("ArtTh_N", gxTv_SdtTARTICU_Artth_N, false, includeNonInitialized);
      AddObjectProperty("ArtThN", gxTv_SdtTARTICU_Artthn, false, includeNonInitialized);
      AddObjectProperty("ArtThN_N", gxTv_SdtTARTICU_Artthn_N, false, includeNonInitialized);
      AddObjectProperty("Art_Cd", gxTv_SdtTARTICU_Art_cd, false, includeNonInitialized);
      AddObjectProperty("Art_Cd_N", gxTv_SdtTARTICU_Art_cd_N, false, includeNonInitialized);
      AddObjectProperty("Art_Dc", gxTv_SdtTARTICU_Art_dc, false, includeNonInitialized);
      AddObjectProperty("Art_Dc_N", gxTv_SdtTARTICU_Art_dc_N, false, includeNonInitialized);
      AddObjectProperty("ArtHilos", gxTv_SdtTARTICU_Arthilos, false, includeNonInitialized);
      AddObjectProperty("ArtHilos_N", gxTv_SdtTARTICU_Arthilos_N, false, includeNonInitialized);
      AddObjectProperty("ArtPasad", gxTv_SdtTARTICU_Artpasad, false, includeNonInitialized);
      AddObjectProperty("ArtPasad_N", gxTv_SdtTARTICU_Artpasad_N, false, includeNonInitialized);
      AddObjectProperty("ArtAncC", gxTv_SdtTARTICU_Artancc, false, includeNonInitialized);
      AddObjectProperty("ArtAncC_N", gxTv_SdtTARTICU_Artancc_N, false, includeNonInitialized);
      AddObjectProperty("ArtGrm2C", gxTv_SdtTARTICU_Artgrm2c, false, includeNonInitialized);
      AddObjectProperty("ArtGrm2C_N", gxTv_SdtTARTICU_Artgrm2c_N, false, includeNonInitialized);
      AddObjectProperty("ArtRdoC", gxTv_SdtTARTICU_Artrdoc, false, includeNonInitialized);
      AddObjectProperty("ArtRdoC_N", gxTv_SdtTARTICU_Artrdoc_N, false, includeNonInitialized);
      AddObjectProperty("ArtAcaFor", gxTv_SdtTARTICU_Artacafor, false, includeNonInitialized);
      AddObjectProperty("ArtAcaFor_N", gxTv_SdtTARTICU_Artacafor_N, false, includeNonInitialized);
      AddObjectProperty("ArtAnu", gxTv_SdtTARTICU_Artanu, false, includeNonInitialized);
      AddObjectProperty("ArtAnu_N", gxTv_SdtTARTICU_Artanu_N, false, includeNonInitialized);
      AddObjectProperty("ArtFacUti", gxTv_SdtTARTICU_Artfacuti, false, includeNonInitialized);
      AddObjectProperty("ArtFacUti_N", gxTv_SdtTARTICU_Artfacuti_N, false, includeNonInitialized);
      AddObjectProperty("ArtNumTip", gxTv_SdtTARTICU_Artnumtip, false, includeNonInitialized);
      AddObjectProperty("ArtNumTip_N", gxTv_SdtTARTICU_Artnumtip_N, false, includeNonInitialized);
      AddObjectProperty("ArtMT", gxTv_SdtTARTICU_Artmt, false, includeNonInitialized);
      AddObjectProperty("ArtMT_N", gxTv_SdtTARTICU_Artmt_N, false, includeNonInitialized);
      AddObjectProperty("ArtTRabs", gxTv_SdtTARTICU_Arttrabs, false, includeNonInitialized);
      AddObjectProperty("ArtTRabs_N", gxTv_SdtTARTICU_Arttrabs_N, false, includeNonInitialized);
      AddObjectProperty("ArtKgMn", gxTv_SdtTARTICU_Artkgmn, false, includeNonInitialized);
      AddObjectProperty("ArtKgMn_N", gxTv_SdtTARTICU_Artkgmn_N, false, includeNonInitialized);
      AddObjectProperty("ArtAcaMar", gxTv_SdtTARTICU_Artacamar, false, includeNonInitialized);
      AddObjectProperty("ArtAcaMar_N", gxTv_SdtTARTICU_Artacamar_N, false, includeNonInitialized);
      AddObjectProperty("ArtAcaBak", gxTv_SdtTARTICU_Artacabak, false, includeNonInitialized);
      AddObjectProperty("ArtAcaBak_N", gxTv_SdtTARTICU_Artacabak_N, false, includeNonInitialized);
      AddObjectProperty("ArtElgAnc", gxTv_SdtTARTICU_Artelganc, false, includeNonInitialized);
      AddObjectProperty("ArtElgAnc_N", gxTv_SdtTARTICU_Artelganc_N, false, includeNonInitialized);
      AddObjectProperty("ArtElgLar", gxTv_SdtTARTICU_Artelglar, false, includeNonInitialized);
      AddObjectProperty("ArtElgLar_N", gxTv_SdtTARTICU_Artelglar_N, false, includeNonInitialized);
      AddObjectProperty("ArtRdoCru", gxTv_SdtTARTICU_Artrdocru, false, includeNonInitialized);
      AddObjectProperty("ArtRdoCru_N", gxTv_SdtTARTICU_Artrdocru_N, false, includeNonInitialized);
      AddObjectProperty("ArtEncLarg", gxTv_SdtTARTICU_Artenclarg, false, includeNonInitialized);
      AddObjectProperty("ArtEncLarg_N", gxTv_SdtTARTICU_Artenclarg_N, false, includeNonInitialized);
      AddObjectProperty("ArtEncAnc", gxTv_SdtTARTICU_Artencanc, false, includeNonInitialized);
      AddObjectProperty("ArtEncAnc_N", gxTv_SdtTARTICU_Artencanc_N, false, includeNonInitialized);
      AddObjectProperty("ArtRdto4", gxTv_SdtTARTICU_Artrdto4, false, includeNonInitialized);
      AddObjectProperty("ArtRdto4_N", gxTv_SdtTARTICU_Artrdto4_N, false, includeNonInitialized);
      AddObjectProperty("Artdsc2", gxTv_SdtTARTICU_Artdsc2, false, includeNonInitialized);
      AddObjectProperty("Artdsc2_N", gxTv_SdtTARTICU_Artdsc2_N, false, includeNonInitialized);
      AddObjectProperty("ArtgrComp", gxTv_SdtTARTICU_Artgrcomp, false, includeNonInitialized);
      AddObjectProperty("ArtgrComp_N", gxTv_SdtTARTICU_Artgrcomp_N, false, includeNonInitialized);
      AddObjectProperty("ArtKgspp", gxTv_SdtTARTICU_Artkgspp, false, includeNonInitialized);
      AddObjectProperty("ArtKgspp_N", gxTv_SdtTARTICU_Artkgspp_N, false, includeNonInitialized);
      AddObjectProperty("ArtPrepp", gxTv_SdtTARTICU_Artprepp, false, includeNonInitialized);
      AddObjectProperty("ArtPrepp_N", gxTv_SdtTARTICU_Artprepp_N, false, includeNonInitialized);
      AddObjectProperty("ArtCDsc", gxTv_SdtTARTICU_Artcdsc, false, includeNonInitialized);
      AddObjectProperty("ArtObsLon", gxTv_SdtTARTICU_Artobslon, false, includeNonInitialized);
      AddObjectProperty("ArtObsLon_N", gxTv_SdtTARTICU_Artobslon_N, false, includeNonInitialized);
      AddObjectProperty("ArtObsFac", gxTv_SdtTARTICU_Artobsfac, false, includeNonInitialized);
      AddObjectProperty("ArtObsFac_N", gxTv_SdtTARTICU_Artobsfac_N, false, includeNonInitialized);
      AddObjectProperty("ArtObsOtras", gxTv_SdtTARTICU_Artobsotras, false, includeNonInitialized);
      AddObjectProperty("ArtObsOtras_N", gxTv_SdtTARTICU_Artobsotras_N, false, includeNonInitialized);
      AddObjectProperty("ArtActivo", gxTv_SdtTARTICU_Artactivo, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtTARTICU_Mode, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_SdtTARTICU_Initialized, false, includeNonInitialized);
         AddObjectProperty("EmprCod_Z", gxTv_SdtTARTICU_Emprcod_Z, false, includeNonInitialized);
         AddObjectProperty("CliCod_Z", gxTv_SdtTARTICU_Clicod_Z, false, includeNonInitialized);
         AddObjectProperty("ArtCod_Z", gxTv_SdtTARTICU_Artcod_Z, false, includeNonInitialized);
         AddObjectProperty("ArtDsc_Z", gxTv_SdtTARTICU_Artdsc_Z, false, includeNonInitialized);
         AddObjectProperty("CliNom_Z", gxTv_SdtTARTICU_Clinom_Z, false, includeNonInitialized);
         AddObjectProperty("ArtCodExt_Z", gxTv_SdtTARTICU_Artcodext_Z, false, includeNonInitialized);
         AddObjectProperty("EmprNom_Z", gxTv_SdtTARTICU_Emprnom_Z, false, includeNonInitialized);
         AddObjectProperty("ArtMat_Z", gxTv_SdtTARTICU_Artmat_Z, false, includeNonInitialized);
         AddObjectProperty("TipArtCod_Z", gxTv_SdtTARTICU_Tipartcod_Z, false, includeNonInitialized);
         AddObjectProperty("TipArtDsc_Z", gxTv_SdtTARTICU_Tipartdsc_Z, false, includeNonInitialized);
         AddObjectProperty("ArtPml_Z", gxTv_SdtTARTICU_Artpml_Z, false, includeNonInitialized);
         AddObjectProperty("ArtGraCru_Z", gxTv_SdtTARTICU_Artgracru_Z, false, includeNonInitialized);
         AddObjectProperty("ArtCruMin_Z", gxTv_SdtTARTICU_Artcrumin_Z, false, includeNonInitialized);
         AddObjectProperty("ArtCruMax_Z", gxTv_SdtTARTICU_Artcrumax_Z, false, includeNonInitialized);
         AddObjectProperty("ArtAcaMin_Z", gxTv_SdtTARTICU_Artacamin_Z, false, includeNonInitialized);
         AddObjectProperty("ArtAcaMax_Z", gxTv_SdtTARTICU_Artacamax_Z, false, includeNonInitialized);
         AddObjectProperty("ArtRen_Z", gxTv_SdtTARTICU_Artren_Z, false, includeNonInitialized);
         AddObjectProperty("ArtTipPle_Z", gxTv_SdtTARTICU_Arttipple_Z, false, includeNonInitialized);
         AddObjectProperty("ArtTipLar_Z", gxTv_SdtTARTICU_Arttiplar_Z, false, includeNonInitialized);
         AddObjectProperty("ArtCorOri_Z", gxTv_SdtTARTICU_Artcorori_Z, false, includeNonInitialized);
         AddObjectProperty("ArtEncOri_Z", gxTv_SdtTARTICU_Artencori_Z, false, includeNonInitialized);
         AddObjectProperty("ArtSua_Z", gxTv_SdtTARTICU_Artsua_Z, false, includeNonInitialized);
         AddObjectProperty("ArtAcaQui_Z", gxTv_SdtTARTICU_Artacaqui_Z, false, includeNonInitialized);
         AddObjectProperty("ArtEti_Z", gxTv_SdtTARTICU_Arteti_Z, false, includeNonInitialized);
         AddObjectProperty("CliEti_Z", gxTv_SdtTARTICU_Clieti_Z, false, includeNonInitialized);
         AddObjectProperty("CliUrg_Z", gxTv_SdtTARTICU_Cliurg_Z, false, includeNonInitialized);
         AddObjectProperty("ArtUrg_Z", gxTv_SdtTARTICU_Arturg_Z, false, includeNonInitialized);
         AddObjectProperty("ArtMer_Z", gxTv_SdtTARTICU_Artmer_Z, false, includeNonInitialized);
         AddObjectProperty("ArtTra1_Z", gxTv_SdtTARTICU_Arttra1_Z, false, includeNonInitialized);
         AddObjectProperty("ArtTra2_Z", gxTv_SdtTARTICU_Arttra2_Z, false, includeNonInitialized);
         AddObjectProperty("ArtTra3_Z", gxTv_SdtTARTICU_Arttra3_Z, false, includeNonInitialized);
         AddObjectProperty("ArtTraP1_Z", gxTv_SdtTARTICU_Arttrap1_Z, false, includeNonInitialized);
         AddObjectProperty("ArtTraP2_Z", gxTv_SdtTARTICU_Arttrap2_Z, false, includeNonInitialized);
         AddObjectProperty("ArtTraP3_Z", gxTv_SdtTARTICU_Arttrap3_Z, false, includeNonInitialized);
         AddObjectProperty("ArtUrd1_Z", gxTv_SdtTARTICU_Arturd1_Z, false, includeNonInitialized);
         AddObjectProperty("ArtUrd2_Z", gxTv_SdtTARTICU_Arturd2_Z, false, includeNonInitialized);
         AddObjectProperty("ArtUrd3_Z", gxTv_SdtTARTICU_Arturd3_Z, false, includeNonInitialized);
         AddObjectProperty("ArtUrdP1_Z", gxTv_SdtTARTICU_Arturdp1_Z, false, includeNonInitialized);
         AddObjectProperty("ArtUrdP2_Z", gxTv_SdtTARTICU_Arturdp2_Z, false, includeNonInitialized);
         AddObjectProperty("ArtUrdP3_Z", gxTv_SdtTARTICU_Arturdp3_Z, false, includeNonInitialized);
         AddObjectProperty("ArtEncCom_Z", gxTv_SdtTARTICU_Artenccom_Z, false, includeNonInitialized);
         AddObjectProperty("ArtEncAnh_Z", gxTv_SdtTARTICU_Artencanh_Z, false, includeNonInitialized);
         AddObjectProperty("ArtGraAca_Z", gxTv_SdtTARTICU_Artgraaca_Z, false, includeNonInitialized);
         AddObjectProperty("ArtRdoA_Z", gxTv_SdtTARTICU_Artrdoa_Z, false, includeNonInitialized);
         AddObjectProperty("ArtRdoN_Z", gxTv_SdtTARTICU_Artrdon_Z, false, includeNonInitialized);
         AddObjectProperty("ArtFacAbs_Z", gxTv_SdtTARTICU_Artfacabs_Z, false, includeNonInitialized);
         AddObjectProperty("ArtPle2_Z", gxTv_SdtTARTICU_Artple2_Z, false, includeNonInitialized);
         AddObjectProperty("ArtNumCor_Z", gxTv_SdtTARTICU_Artnumcor_Z, false, includeNonInitialized);
         AddObjectProperty("ArtAncSal1_Z", gxTv_SdtTARTICU_Artancsal1_Z, false, includeNonInitialized);
         AddObjectProperty("ArtAncSal2_Z", gxTv_SdtTARTICU_Artancsal2_Z, false, includeNonInitialized);
         AddObjectProperty("ArtAncSal3_Z", gxTv_SdtTARTICU_Artancsal3_Z, false, includeNonInitialized);
         AddObjectProperty("ArtGraAca2_Z", gxTv_SdtTARTICU_Artgraaca2_Z, false, includeNonInitialized);
         AddObjectProperty("ArtGraCru2_Z", gxTv_SdtTARTICU_Artgracru2_Z, false, includeNonInitialized);
         AddObjectProperty("ClasCod_Z", gxTv_SdtTARTICU_Clascod_Z, false, includeNonInitialized);
         AddObjectProperty("ArtPmPPza_Z", gxTv_SdtTARTICU_Artpmppza_Z, false, includeNonInitialized);
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTARTICU_Artfeccre_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTARTICU_Artfeccre_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTARTICU_Artfeccre_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("ArtFecCre_Z", sDateCnv, false, includeNonInitialized);
         AddObjectProperty("ArtUsrCod_Z", gxTv_SdtTARTICU_Artusrcod_Z, false, includeNonInitialized);
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTARTICU_Artfecmod_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTARTICU_Artfecmod_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTARTICU_Artfecmod_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("ArtFecMod_Z", sDateCnv, false, includeNonInitialized);
         AddObjectProperty("ClasDsc_Z", gxTv_SdtTARTICU_Clasdsc_Z, false, includeNonInitialized);
         AddObjectProperty("ArtComer_Z", gxTv_SdtTARTICU_Artcomer_Z, false, includeNonInitialized);
         AddObjectProperty("ClaTubCod_Z", gxTv_SdtTARTICU_Clatubcod_Z, false, includeNonInitialized);
         AddObjectProperty("ClaTubDsc_Z", gxTv_SdtTARTICU_Clatubdsc_Z, false, includeNonInitialized);
         AddObjectProperty("ClaBolCod_Z", gxTv_SdtTARTICU_Clabolcod_Z, false, includeNonInitialized);
         AddObjectProperty("ClaBolDsc_Z", gxTv_SdtTARTICU_Claboldsc_Z, false, includeNonInitialized);
         AddObjectProperty("ArtRdoCru1_Z", gxTv_SdtTARTICU_Artrdocru1_Z, false, includeNonInitialized);
         AddObjectProperty("ArtRdoCru2_Z", gxTv_SdtTARTICU_Artrdocru2_Z, false, includeNonInitialized);
         AddObjectProperty("ArtNMtr_Z", gxTv_SdtTARTICU_Artnmtr_Z, false, includeNonInitialized);
         AddObjectProperty("ArtLu_Z", gxTv_SdtTARTICU_Artlu_Z, false, includeNonInitialized);
         AddObjectProperty("ArtRb_Z", gxTv_SdtTARTICU_Artrb_Z, false, includeNonInitialized);
         AddObjectProperty("ArtPelAnh_Z", gxTv_SdtTARTICU_Artpelanh_Z, false, includeNonInitialized);
         AddObjectProperty("Artgrm2Sc_Z", gxTv_SdtTARTICU_Artgrm2sc_Z, false, includeNonInitialized);
         AddObjectProperty("ArtPmlSc_Z", gxTv_SdtTARTICU_Artpmlsc_Z, false, includeNonInitialized);
         AddObjectProperty("ArtAncSc_Z", gxTv_SdtTARTICU_Artancsc_Z, false, includeNonInitialized);
         AddObjectProperty("ArtPmlCru_Z", gxTv_SdtTARTICU_Artpmlcru_Z, false, includeNonInitialized);
         AddObjectProperty("ArtRdtSc_Z", gxTv_SdtTARTICU_Artrdtsc_Z, false, includeNonInitialized);
         AddObjectProperty("ArtUnd_Z", gxTv_SdtTARTICU_Artund_Z, false, includeNonInitialized);
         AddObjectProperty("ArtBlo_Z", gxTv_SdtTARTICU_Artblo_Z, false, includeNonInitialized);
         AddObjectProperty("ArtCla_Z", gxTv_SdtTARTICU_Artcla_Z, false, includeNonInitialized);
         AddObjectProperty("TipArtDsc2_Z", gxTv_SdtTARTICU_Tipartdsc2_Z, false, includeNonInitialized);
         AddObjectProperty("ArtFabsH_Z", gxTv_SdtTARTICU_Artfabsh_Z, false, includeNonInitialized);
         AddObjectProperty("ArtFabsT_Z", gxTv_SdtTARTICU_Artfabst_Z, false, includeNonInitialized);
         AddObjectProperty("ArtNProg_Z", gxTv_SdtTARTICU_Artnprog_Z, false, includeNonInitialized);
         AddObjectProperty("ArtVbd_Z", gxTv_SdtTARTICU_Artvbd_Z, false, includeNonInitialized);
         AddObjectProperty("ArtVbn_Z", gxTv_SdtTARTICU_Artvbn_Z, false, includeNonInitialized);
         AddObjectProperty("ArtAb_Z", gxTv_SdtTARTICU_Artab_Z, false, includeNonInitialized);
         AddObjectProperty("ArtObsGrm_Z", gxTv_SdtTARTICU_Artobsgrm_Z, false, includeNonInitialized);
         AddObjectProperty("ArtObsAnc_Z", gxTv_SdtTARTICU_Artobsanc_Z, false, includeNonInitialized);
         AddObjectProperty("ArtCdb_Z", gxTv_SdtTARTICU_Artcdb_Z, false, includeNonInitialized);
         AddObjectProperty("ArtGalga_Z", gxTv_SdtTARTICU_Artgalga_Z, false, includeNonInitialized);
         AddObjectProperty("ArtPlatina_Z", gxTv_SdtTARTICU_Artplatina_Z, false, includeNonInitialized);
         AddObjectProperty("ArtPgd_Z", gxTv_SdtTARTICU_Artpgd_Z, false, includeNonInitialized);
         AddObjectProperty("ArtTh_Z", gxTv_SdtTARTICU_Artth_Z, false, includeNonInitialized);
         AddObjectProperty("ArtThN_Z", gxTv_SdtTARTICU_Artthn_Z, false, includeNonInitialized);
         AddObjectProperty("Art_Cd_Z", gxTv_SdtTARTICU_Art_cd_Z, false, includeNonInitialized);
         AddObjectProperty("Art_Dc_Z", gxTv_SdtTARTICU_Art_dc_Z, false, includeNonInitialized);
         AddObjectProperty("ArtHilos_Z", gxTv_SdtTARTICU_Arthilos_Z, false, includeNonInitialized);
         AddObjectProperty("ArtPasad_Z", gxTv_SdtTARTICU_Artpasad_Z, false, includeNonInitialized);
         AddObjectProperty("ArtAncC_Z", gxTv_SdtTARTICU_Artancc_Z, false, includeNonInitialized);
         AddObjectProperty("ArtGrm2C_Z", gxTv_SdtTARTICU_Artgrm2c_Z, false, includeNonInitialized);
         AddObjectProperty("ArtRdoC_Z", gxTv_SdtTARTICU_Artrdoc_Z, false, includeNonInitialized);
         AddObjectProperty("ArtAcaFor_Z", gxTv_SdtTARTICU_Artacafor_Z, false, includeNonInitialized);
         AddObjectProperty("ArtAnu_Z", gxTv_SdtTARTICU_Artanu_Z, false, includeNonInitialized);
         AddObjectProperty("ArtFacUti_Z", gxTv_SdtTARTICU_Artfacuti_Z, false, includeNonInitialized);
         AddObjectProperty("ArtNumTip_Z", gxTv_SdtTARTICU_Artnumtip_Z, false, includeNonInitialized);
         AddObjectProperty("ArtMT_Z", gxTv_SdtTARTICU_Artmt_Z, false, includeNonInitialized);
         AddObjectProperty("ArtTRabs_Z", gxTv_SdtTARTICU_Arttrabs_Z, false, includeNonInitialized);
         AddObjectProperty("ArtKgMn_Z", gxTv_SdtTARTICU_Artkgmn_Z, false, includeNonInitialized);
         AddObjectProperty("ArtAcaMar_Z", gxTv_SdtTARTICU_Artacamar_Z, false, includeNonInitialized);
         AddObjectProperty("ArtAcaBak_Z", gxTv_SdtTARTICU_Artacabak_Z, false, includeNonInitialized);
         AddObjectProperty("ArtElgAnc_Z", gxTv_SdtTARTICU_Artelganc_Z, false, includeNonInitialized);
         AddObjectProperty("ArtElgLar_Z", gxTv_SdtTARTICU_Artelglar_Z, false, includeNonInitialized);
         AddObjectProperty("ArtRdoCru_Z", gxTv_SdtTARTICU_Artrdocru_Z, false, includeNonInitialized);
         AddObjectProperty("ArtEncLarg_Z", gxTv_SdtTARTICU_Artenclarg_Z, false, includeNonInitialized);
         AddObjectProperty("ArtEncAnc_Z", gxTv_SdtTARTICU_Artencanc_Z, false, includeNonInitialized);
         AddObjectProperty("ArtRdto4_Z", gxTv_SdtTARTICU_Artrdto4_Z, false, includeNonInitialized);
         AddObjectProperty("Artdsc2_Z", gxTv_SdtTARTICU_Artdsc2_Z, false, includeNonInitialized);
         AddObjectProperty("ArtgrComp_Z", gxTv_SdtTARTICU_Artgrcomp_Z, false, includeNonInitialized);
         AddObjectProperty("ArtKgspp_Z", gxTv_SdtTARTICU_Artkgspp_Z, false, includeNonInitialized);
         AddObjectProperty("ArtPrepp_Z", gxTv_SdtTARTICU_Artprepp_Z, false, includeNonInitialized);
         AddObjectProperty("ArtCDsc_Z", gxTv_SdtTARTICU_Artcdsc_Z, false, includeNonInitialized);
         AddObjectProperty("ArtObsFac_Z", gxTv_SdtTARTICU_Artobsfac_Z, false, includeNonInitialized);
         AddObjectProperty("ArtObsOtras_Z", gxTv_SdtTARTICU_Artobsotras_Z, false, includeNonInitialized);
         AddObjectProperty("ArtActivo_Z", gxTv_SdtTARTICU_Artactivo_Z, false, includeNonInitialized);
         AddObjectProperty("CliCod_N", gxTv_SdtTARTICU_Clicod_N, false, includeNonInitialized);
         AddObjectProperty("ArtCod_N", gxTv_SdtTARTICU_Artcod_N, false, includeNonInitialized);
         AddObjectProperty("ArtDsc_N", gxTv_SdtTARTICU_Artdsc_N, false, includeNonInitialized);
         AddObjectProperty("ArtCodExt_N", gxTv_SdtTARTICU_Artcodext_N, false, includeNonInitialized);
         AddObjectProperty("EmprNom_N", gxTv_SdtTARTICU_Emprnom_N, false, includeNonInitialized);
         AddObjectProperty("ArtMat_N", gxTv_SdtTARTICU_Artmat_N, false, includeNonInitialized);
         AddObjectProperty("TipArtDsc_N", gxTv_SdtTARTICU_Tipartdsc_N, false, includeNonInitialized);
         AddObjectProperty("ArtPml_N", gxTv_SdtTARTICU_Artpml_N, false, includeNonInitialized);
         AddObjectProperty("ArtGraCru_N", gxTv_SdtTARTICU_Artgracru_N, false, includeNonInitialized);
         AddObjectProperty("ArtCruMin_N", gxTv_SdtTARTICU_Artcrumin_N, false, includeNonInitialized);
         AddObjectProperty("ArtCruMax_N", gxTv_SdtTARTICU_Artcrumax_N, false, includeNonInitialized);
         AddObjectProperty("ArtAcaMin_N", gxTv_SdtTARTICU_Artacamin_N, false, includeNonInitialized);
         AddObjectProperty("ArtAcaMax_N", gxTv_SdtTARTICU_Artacamax_N, false, includeNonInitialized);
         AddObjectProperty("ArtRen_N", gxTv_SdtTARTICU_Artren_N, false, includeNonInitialized);
         AddObjectProperty("ArtTipPle_N", gxTv_SdtTARTICU_Arttipple_N, false, includeNonInitialized);
         AddObjectProperty("ArtTipLar_N", gxTv_SdtTARTICU_Arttiplar_N, false, includeNonInitialized);
         AddObjectProperty("ArtCorOri_N", gxTv_SdtTARTICU_Artcorori_N, false, includeNonInitialized);
         AddObjectProperty("ArtEncOri_N", gxTv_SdtTARTICU_Artencori_N, false, includeNonInitialized);
         AddObjectProperty("ArtSua_N", gxTv_SdtTARTICU_Artsua_N, false, includeNonInitialized);
         AddObjectProperty("ArtAcaQui_N", gxTv_SdtTARTICU_Artacaqui_N, false, includeNonInitialized);
         AddObjectProperty("ArtEti_N", gxTv_SdtTARTICU_Arteti_N, false, includeNonInitialized);
         AddObjectProperty("ArtUrg_N", gxTv_SdtTARTICU_Arturg_N, false, includeNonInitialized);
         AddObjectProperty("ArtMer_N", gxTv_SdtTARTICU_Artmer_N, false, includeNonInitialized);
         AddObjectProperty("ArtTra1_N", gxTv_SdtTARTICU_Arttra1_N, false, includeNonInitialized);
         AddObjectProperty("ArtTra2_N", gxTv_SdtTARTICU_Arttra2_N, false, includeNonInitialized);
         AddObjectProperty("ArtTra3_N", gxTv_SdtTARTICU_Arttra3_N, false, includeNonInitialized);
         AddObjectProperty("ArtTraP1_N", gxTv_SdtTARTICU_Arttrap1_N, false, includeNonInitialized);
         AddObjectProperty("ArtTraP2_N", gxTv_SdtTARTICU_Arttrap2_N, false, includeNonInitialized);
         AddObjectProperty("ArtTraP3_N", gxTv_SdtTARTICU_Arttrap3_N, false, includeNonInitialized);
         AddObjectProperty("ArtUrd1_N", gxTv_SdtTARTICU_Arturd1_N, false, includeNonInitialized);
         AddObjectProperty("ArtUrd2_N", gxTv_SdtTARTICU_Arturd2_N, false, includeNonInitialized);
         AddObjectProperty("ArtUrd3_N", gxTv_SdtTARTICU_Arturd3_N, false, includeNonInitialized);
         AddObjectProperty("ArtUrdP1_N", gxTv_SdtTARTICU_Arturdp1_N, false, includeNonInitialized);
         AddObjectProperty("ArtUrdP2_N", gxTv_SdtTARTICU_Arturdp2_N, false, includeNonInitialized);
         AddObjectProperty("ArtUrdP3_N", gxTv_SdtTARTICU_Arturdp3_N, false, includeNonInitialized);
         AddObjectProperty("ArtEncCom_N", gxTv_SdtTARTICU_Artenccom_N, false, includeNonInitialized);
         AddObjectProperty("ArtEncAnh_N", gxTv_SdtTARTICU_Artencanh_N, false, includeNonInitialized);
         AddObjectProperty("ArtGraAca_N", gxTv_SdtTARTICU_Artgraaca_N, false, includeNonInitialized);
         AddObjectProperty("ArtRdoA_N", gxTv_SdtTARTICU_Artrdoa_N, false, includeNonInitialized);
         AddObjectProperty("ArtRdoN_N", gxTv_SdtTARTICU_Artrdon_N, false, includeNonInitialized);
         AddObjectProperty("ArtFacAbs_N", gxTv_SdtTARTICU_Artfacabs_N, false, includeNonInitialized);
         AddObjectProperty("ArtPle2_N", gxTv_SdtTARTICU_Artple2_N, false, includeNonInitialized);
         AddObjectProperty("ArtNumCor_N", gxTv_SdtTARTICU_Artnumcor_N, false, includeNonInitialized);
         AddObjectProperty("ArtAncSal1_N", gxTv_SdtTARTICU_Artancsal1_N, false, includeNonInitialized);
         AddObjectProperty("ArtAncSal2_N", gxTv_SdtTARTICU_Artancsal2_N, false, includeNonInitialized);
         AddObjectProperty("ArtAncSal3_N", gxTv_SdtTARTICU_Artancsal3_N, false, includeNonInitialized);
         AddObjectProperty("ArtGraAca2_N", gxTv_SdtTARTICU_Artgraaca2_N, false, includeNonInitialized);
         AddObjectProperty("ArtGraCru2_N", gxTv_SdtTARTICU_Artgracru2_N, false, includeNonInitialized);
         AddObjectProperty("ClasCod_N", gxTv_SdtTARTICU_Clascod_N, false, includeNonInitialized);
         AddObjectProperty("ArtPmPPza_N", gxTv_SdtTARTICU_Artpmppza_N, false, includeNonInitialized);
         AddObjectProperty("ArtFecCre_N", gxTv_SdtTARTICU_Artfeccre_N, false, includeNonInitialized);
         AddObjectProperty("ArtUsrCod_N", gxTv_SdtTARTICU_Artusrcod_N, false, includeNonInitialized);
         AddObjectProperty("ArtFecMod_N", gxTv_SdtTARTICU_Artfecmod_N, false, includeNonInitialized);
         AddObjectProperty("ClasDsc_N", gxTv_SdtTARTICU_Clasdsc_N, false, includeNonInitialized);
         AddObjectProperty("ArtComer_N", gxTv_SdtTARTICU_Artcomer_N, false, includeNonInitialized);
         AddObjectProperty("ClaTubCod_N", gxTv_SdtTARTICU_Clatubcod_N, false, includeNonInitialized);
         AddObjectProperty("ClaTubDsc_N", gxTv_SdtTARTICU_Clatubdsc_N, false, includeNonInitialized);
         AddObjectProperty("ClaBolCod_N", gxTv_SdtTARTICU_Clabolcod_N, false, includeNonInitialized);
         AddObjectProperty("ClaBolDsc_N", gxTv_SdtTARTICU_Claboldsc_N, false, includeNonInitialized);
         AddObjectProperty("ArtRdoCru1_N", gxTv_SdtTARTICU_Artrdocru1_N, false, includeNonInitialized);
         AddObjectProperty("ArtRdoCru2_N", gxTv_SdtTARTICU_Artrdocru2_N, false, includeNonInitialized);
         AddObjectProperty("ArtNMtr_N", gxTv_SdtTARTICU_Artnmtr_N, false, includeNonInitialized);
         AddObjectProperty("ArtLu_N", gxTv_SdtTARTICU_Artlu_N, false, includeNonInitialized);
         AddObjectProperty("ArtRb_N", gxTv_SdtTARTICU_Artrb_N, false, includeNonInitialized);
         AddObjectProperty("ArtPelAnh_N", gxTv_SdtTARTICU_Artpelanh_N, false, includeNonInitialized);
         AddObjectProperty("Artgrm2Sc_N", gxTv_SdtTARTICU_Artgrm2sc_N, false, includeNonInitialized);
         AddObjectProperty("ArtPmlSc_N", gxTv_SdtTARTICU_Artpmlsc_N, false, includeNonInitialized);
         AddObjectProperty("ArtAncSc_N", gxTv_SdtTARTICU_Artancsc_N, false, includeNonInitialized);
         AddObjectProperty("ArtPmlCru_N", gxTv_SdtTARTICU_Artpmlcru_N, false, includeNonInitialized);
         AddObjectProperty("ArtRdtSc_N", gxTv_SdtTARTICU_Artrdtsc_N, false, includeNonInitialized);
         AddObjectProperty("ArtUnd_N", gxTv_SdtTARTICU_Artund_N, false, includeNonInitialized);
         AddObjectProperty("ArtBlo_N", gxTv_SdtTARTICU_Artblo_N, false, includeNonInitialized);
         AddObjectProperty("ArtCla_N", gxTv_SdtTARTICU_Artcla_N, false, includeNonInitialized);
         AddObjectProperty("TipArtDsc2_N", gxTv_SdtTARTICU_Tipartdsc2_N, false, includeNonInitialized);
         AddObjectProperty("ArtFabsH_N", gxTv_SdtTARTICU_Artfabsh_N, false, includeNonInitialized);
         AddObjectProperty("ArtFabsT_N", gxTv_SdtTARTICU_Artfabst_N, false, includeNonInitialized);
         AddObjectProperty("ArtNProg_N", gxTv_SdtTARTICU_Artnprog_N, false, includeNonInitialized);
         AddObjectProperty("ArtVbd_N", gxTv_SdtTARTICU_Artvbd_N, false, includeNonInitialized);
         AddObjectProperty("ArtVbn_N", gxTv_SdtTARTICU_Artvbn_N, false, includeNonInitialized);
         AddObjectProperty("ArtAb_N", gxTv_SdtTARTICU_Artab_N, false, includeNonInitialized);
         AddObjectProperty("ArtObsGrm_N", gxTv_SdtTARTICU_Artobsgrm_N, false, includeNonInitialized);
         AddObjectProperty("ArtObsAnc_N", gxTv_SdtTARTICU_Artobsanc_N, false, includeNonInitialized);
         AddObjectProperty("ArtCdb_N", gxTv_SdtTARTICU_Artcdb_N, false, includeNonInitialized);
         AddObjectProperty("ArtGalga_N", gxTv_SdtTARTICU_Artgalga_N, false, includeNonInitialized);
         AddObjectProperty("ArtPlatina_N", gxTv_SdtTARTICU_Artplatina_N, false, includeNonInitialized);
         AddObjectProperty("ArtPgd_N", gxTv_SdtTARTICU_Artpgd_N, false, includeNonInitialized);
         AddObjectProperty("ArtTh_N", gxTv_SdtTARTICU_Artth_N, false, includeNonInitialized);
         AddObjectProperty("ArtThN_N", gxTv_SdtTARTICU_Artthn_N, false, includeNonInitialized);
         AddObjectProperty("Art_Cd_N", gxTv_SdtTARTICU_Art_cd_N, false, includeNonInitialized);
         AddObjectProperty("Art_Dc_N", gxTv_SdtTARTICU_Art_dc_N, false, includeNonInitialized);
         AddObjectProperty("ArtHilos_N", gxTv_SdtTARTICU_Arthilos_N, false, includeNonInitialized);
         AddObjectProperty("ArtPasad_N", gxTv_SdtTARTICU_Artpasad_N, false, includeNonInitialized);
         AddObjectProperty("ArtAncC_N", gxTv_SdtTARTICU_Artancc_N, false, includeNonInitialized);
         AddObjectProperty("ArtGrm2C_N", gxTv_SdtTARTICU_Artgrm2c_N, false, includeNonInitialized);
         AddObjectProperty("ArtRdoC_N", gxTv_SdtTARTICU_Artrdoc_N, false, includeNonInitialized);
         AddObjectProperty("ArtAcaFor_N", gxTv_SdtTARTICU_Artacafor_N, false, includeNonInitialized);
         AddObjectProperty("ArtAnu_N", gxTv_SdtTARTICU_Artanu_N, false, includeNonInitialized);
         AddObjectProperty("ArtFacUti_N", gxTv_SdtTARTICU_Artfacuti_N, false, includeNonInitialized);
         AddObjectProperty("ArtNumTip_N", gxTv_SdtTARTICU_Artnumtip_N, false, includeNonInitialized);
         AddObjectProperty("ArtMT_N", gxTv_SdtTARTICU_Artmt_N, false, includeNonInitialized);
         AddObjectProperty("ArtTRabs_N", gxTv_SdtTARTICU_Arttrabs_N, false, includeNonInitialized);
         AddObjectProperty("ArtKgMn_N", gxTv_SdtTARTICU_Artkgmn_N, false, includeNonInitialized);
         AddObjectProperty("ArtAcaMar_N", gxTv_SdtTARTICU_Artacamar_N, false, includeNonInitialized);
         AddObjectProperty("ArtAcaBak_N", gxTv_SdtTARTICU_Artacabak_N, false, includeNonInitialized);
         AddObjectProperty("ArtElgAnc_N", gxTv_SdtTARTICU_Artelganc_N, false, includeNonInitialized);
         AddObjectProperty("ArtElgLar_N", gxTv_SdtTARTICU_Artelglar_N, false, includeNonInitialized);
         AddObjectProperty("ArtRdoCru_N", gxTv_SdtTARTICU_Artrdocru_N, false, includeNonInitialized);
         AddObjectProperty("ArtEncLarg_N", gxTv_SdtTARTICU_Artenclarg_N, false, includeNonInitialized);
         AddObjectProperty("ArtEncAnc_N", gxTv_SdtTARTICU_Artencanc_N, false, includeNonInitialized);
         AddObjectProperty("ArtRdto4_N", gxTv_SdtTARTICU_Artrdto4_N, false, includeNonInitialized);
         AddObjectProperty("Artdsc2_N", gxTv_SdtTARTICU_Artdsc2_N, false, includeNonInitialized);
         AddObjectProperty("ArtgrComp_N", gxTv_SdtTARTICU_Artgrcomp_N, false, includeNonInitialized);
         AddObjectProperty("ArtKgspp_N", gxTv_SdtTARTICU_Artkgspp_N, false, includeNonInitialized);
         AddObjectProperty("ArtPrepp_N", gxTv_SdtTARTICU_Artprepp_N, false, includeNonInitialized);
         AddObjectProperty("ArtObsLon_N", gxTv_SdtTARTICU_Artobslon_N, false, includeNonInitialized);
         AddObjectProperty("ArtObsFac_N", gxTv_SdtTARTICU_Artobsfac_N, false, includeNonInitialized);
         AddObjectProperty("ArtObsOtras_N", gxTv_SdtTARTICU_Artobsotras_N, false, includeNonInitialized);
      }
   }

   public void updateDirties( app.SdtTARTICU sdt )
   {
      if ( sdt.IsDirty("EmprCod") )
      {
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Emprcod = sdt.getgxTv_SdtTARTICU_Emprcod() ;
      }
      if ( sdt.IsDirty("CliCod") )
      {
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Clicod = sdt.getgxTv_SdtTARTICU_Clicod() ;
      }
      if ( sdt.IsDirty("ArtCod") )
      {
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artcod = sdt.getgxTv_SdtTARTICU_Artcod() ;
      }
      if ( sdt.IsDirty("ArtDsc") )
      {
         gxTv_SdtTARTICU_Artdsc_N = sdt.getgxTv_SdtTARTICU_Artdsc_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artdsc = sdt.getgxTv_SdtTARTICU_Artdsc() ;
      }
      if ( sdt.IsDirty("CliNom") )
      {
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Clinom = sdt.getgxTv_SdtTARTICU_Clinom() ;
      }
      if ( sdt.IsDirty("ArtCodExt") )
      {
         gxTv_SdtTARTICU_Artcodext_N = sdt.getgxTv_SdtTARTICU_Artcodext_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artcodext = sdt.getgxTv_SdtTARTICU_Artcodext() ;
      }
      if ( sdt.IsDirty("EmprNom") )
      {
         gxTv_SdtTARTICU_Emprnom_N = sdt.getgxTv_SdtTARTICU_Emprnom_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Emprnom = sdt.getgxTv_SdtTARTICU_Emprnom() ;
      }
      if ( sdt.IsDirty("ArtMat") )
      {
         gxTv_SdtTARTICU_Artmat_N = sdt.getgxTv_SdtTARTICU_Artmat_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artmat = sdt.getgxTv_SdtTARTICU_Artmat() ;
      }
      if ( sdt.IsDirty("TipArtCod") )
      {
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Tipartcod = sdt.getgxTv_SdtTARTICU_Tipartcod() ;
      }
      if ( sdt.IsDirty("TipArtDsc") )
      {
         gxTv_SdtTARTICU_Tipartdsc_N = sdt.getgxTv_SdtTARTICU_Tipartdsc_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Tipartdsc = sdt.getgxTv_SdtTARTICU_Tipartdsc() ;
      }
      if ( sdt.IsDirty("ArtPml") )
      {
         gxTv_SdtTARTICU_Artpml_N = sdt.getgxTv_SdtTARTICU_Artpml_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artpml = sdt.getgxTv_SdtTARTICU_Artpml() ;
      }
      if ( sdt.IsDirty("ArtGraCru") )
      {
         gxTv_SdtTARTICU_Artgracru_N = sdt.getgxTv_SdtTARTICU_Artgracru_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artgracru = sdt.getgxTv_SdtTARTICU_Artgracru() ;
      }
      if ( sdt.IsDirty("ArtCruMin") )
      {
         gxTv_SdtTARTICU_Artcrumin_N = sdt.getgxTv_SdtTARTICU_Artcrumin_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artcrumin = sdt.getgxTv_SdtTARTICU_Artcrumin() ;
      }
      if ( sdt.IsDirty("ArtCruMax") )
      {
         gxTv_SdtTARTICU_Artcrumax_N = sdt.getgxTv_SdtTARTICU_Artcrumax_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artcrumax = sdt.getgxTv_SdtTARTICU_Artcrumax() ;
      }
      if ( sdt.IsDirty("ArtAcaMin") )
      {
         gxTv_SdtTARTICU_Artacamin_N = sdt.getgxTv_SdtTARTICU_Artacamin_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artacamin = sdt.getgxTv_SdtTARTICU_Artacamin() ;
      }
      if ( sdt.IsDirty("ArtAcaMax") )
      {
         gxTv_SdtTARTICU_Artacamax_N = sdt.getgxTv_SdtTARTICU_Artacamax_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artacamax = sdt.getgxTv_SdtTARTICU_Artacamax() ;
      }
      if ( sdt.IsDirty("ArtRen") )
      {
         gxTv_SdtTARTICU_Artren_N = sdt.getgxTv_SdtTARTICU_Artren_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artren = sdt.getgxTv_SdtTARTICU_Artren() ;
      }
      if ( sdt.IsDirty("ArtTipPle") )
      {
         gxTv_SdtTARTICU_Arttipple_N = sdt.getgxTv_SdtTARTICU_Arttipple_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Arttipple = sdt.getgxTv_SdtTARTICU_Arttipple() ;
      }
      if ( sdt.IsDirty("ArtTipLar") )
      {
         gxTv_SdtTARTICU_Arttiplar_N = sdt.getgxTv_SdtTARTICU_Arttiplar_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Arttiplar = sdt.getgxTv_SdtTARTICU_Arttiplar() ;
      }
      if ( sdt.IsDirty("ArtCorOri") )
      {
         gxTv_SdtTARTICU_Artcorori_N = sdt.getgxTv_SdtTARTICU_Artcorori_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artcorori = sdt.getgxTv_SdtTARTICU_Artcorori() ;
      }
      if ( sdt.IsDirty("ArtEncOri") )
      {
         gxTv_SdtTARTICU_Artencori_N = sdt.getgxTv_SdtTARTICU_Artencori_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artencori = sdt.getgxTv_SdtTARTICU_Artencori() ;
      }
      if ( sdt.IsDirty("ArtSua") )
      {
         gxTv_SdtTARTICU_Artsua_N = sdt.getgxTv_SdtTARTICU_Artsua_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artsua = sdt.getgxTv_SdtTARTICU_Artsua() ;
      }
      if ( sdt.IsDirty("ArtAcaQui") )
      {
         gxTv_SdtTARTICU_Artacaqui_N = sdt.getgxTv_SdtTARTICU_Artacaqui_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artacaqui = sdt.getgxTv_SdtTARTICU_Artacaqui() ;
      }
      if ( sdt.IsDirty("ArtEti") )
      {
         gxTv_SdtTARTICU_Arteti_N = sdt.getgxTv_SdtTARTICU_Arteti_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Arteti = sdt.getgxTv_SdtTARTICU_Arteti() ;
      }
      if ( sdt.IsDirty("CliEti") )
      {
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Clieti = sdt.getgxTv_SdtTARTICU_Clieti() ;
      }
      if ( sdt.IsDirty("CliUrg") )
      {
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Cliurg = sdt.getgxTv_SdtTARTICU_Cliurg() ;
      }
      if ( sdt.IsDirty("ArtUrg") )
      {
         gxTv_SdtTARTICU_Arturg_N = sdt.getgxTv_SdtTARTICU_Arturg_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Arturg = sdt.getgxTv_SdtTARTICU_Arturg() ;
      }
      if ( sdt.IsDirty("ArtMer") )
      {
         gxTv_SdtTARTICU_Artmer_N = sdt.getgxTv_SdtTARTICU_Artmer_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artmer = sdt.getgxTv_SdtTARTICU_Artmer() ;
      }
      if ( sdt.IsDirty("ArtTra1") )
      {
         gxTv_SdtTARTICU_Arttra1_N = sdt.getgxTv_SdtTARTICU_Arttra1_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Arttra1 = sdt.getgxTv_SdtTARTICU_Arttra1() ;
      }
      if ( sdt.IsDirty("ArtTra2") )
      {
         gxTv_SdtTARTICU_Arttra2_N = sdt.getgxTv_SdtTARTICU_Arttra2_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Arttra2 = sdt.getgxTv_SdtTARTICU_Arttra2() ;
      }
      if ( sdt.IsDirty("ArtTra3") )
      {
         gxTv_SdtTARTICU_Arttra3_N = sdt.getgxTv_SdtTARTICU_Arttra3_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Arttra3 = sdt.getgxTv_SdtTARTICU_Arttra3() ;
      }
      if ( sdt.IsDirty("ArtTraP1") )
      {
         gxTv_SdtTARTICU_Arttrap1_N = sdt.getgxTv_SdtTARTICU_Arttrap1_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Arttrap1 = sdt.getgxTv_SdtTARTICU_Arttrap1() ;
      }
      if ( sdt.IsDirty("ArtTraP2") )
      {
         gxTv_SdtTARTICU_Arttrap2_N = sdt.getgxTv_SdtTARTICU_Arttrap2_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Arttrap2 = sdt.getgxTv_SdtTARTICU_Arttrap2() ;
      }
      if ( sdt.IsDirty("ArtTraP3") )
      {
         gxTv_SdtTARTICU_Arttrap3_N = sdt.getgxTv_SdtTARTICU_Arttrap3_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Arttrap3 = sdt.getgxTv_SdtTARTICU_Arttrap3() ;
      }
      if ( sdt.IsDirty("ArtUrd1") )
      {
         gxTv_SdtTARTICU_Arturd1_N = sdt.getgxTv_SdtTARTICU_Arturd1_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Arturd1 = sdt.getgxTv_SdtTARTICU_Arturd1() ;
      }
      if ( sdt.IsDirty("ArtUrd2") )
      {
         gxTv_SdtTARTICU_Arturd2_N = sdt.getgxTv_SdtTARTICU_Arturd2_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Arturd2 = sdt.getgxTv_SdtTARTICU_Arturd2() ;
      }
      if ( sdt.IsDirty("ArtUrd3") )
      {
         gxTv_SdtTARTICU_Arturd3_N = sdt.getgxTv_SdtTARTICU_Arturd3_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Arturd3 = sdt.getgxTv_SdtTARTICU_Arturd3() ;
      }
      if ( sdt.IsDirty("ArtUrdP1") )
      {
         gxTv_SdtTARTICU_Arturdp1_N = sdt.getgxTv_SdtTARTICU_Arturdp1_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Arturdp1 = sdt.getgxTv_SdtTARTICU_Arturdp1() ;
      }
      if ( sdt.IsDirty("ArtUrdP2") )
      {
         gxTv_SdtTARTICU_Arturdp2_N = sdt.getgxTv_SdtTARTICU_Arturdp2_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Arturdp2 = sdt.getgxTv_SdtTARTICU_Arturdp2() ;
      }
      if ( sdt.IsDirty("ArtUrdP3") )
      {
         gxTv_SdtTARTICU_Arturdp3_N = sdt.getgxTv_SdtTARTICU_Arturdp3_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Arturdp3 = sdt.getgxTv_SdtTARTICU_Arturdp3() ;
      }
      if ( sdt.IsDirty("ArtEncCom") )
      {
         gxTv_SdtTARTICU_Artenccom_N = sdt.getgxTv_SdtTARTICU_Artenccom_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artenccom = sdt.getgxTv_SdtTARTICU_Artenccom() ;
      }
      if ( sdt.IsDirty("ArtEncAnh") )
      {
         gxTv_SdtTARTICU_Artencanh_N = sdt.getgxTv_SdtTARTICU_Artencanh_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artencanh = sdt.getgxTv_SdtTARTICU_Artencanh() ;
      }
      if ( sdt.IsDirty("ArtGraAca") )
      {
         gxTv_SdtTARTICU_Artgraaca_N = sdt.getgxTv_SdtTARTICU_Artgraaca_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artgraaca = sdt.getgxTv_SdtTARTICU_Artgraaca() ;
      }
      if ( sdt.IsDirty("ArtRdoA") )
      {
         gxTv_SdtTARTICU_Artrdoa_N = sdt.getgxTv_SdtTARTICU_Artrdoa_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artrdoa = sdt.getgxTv_SdtTARTICU_Artrdoa() ;
      }
      if ( sdt.IsDirty("ArtRdoN") )
      {
         gxTv_SdtTARTICU_Artrdon_N = sdt.getgxTv_SdtTARTICU_Artrdon_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artrdon = sdt.getgxTv_SdtTARTICU_Artrdon() ;
      }
      if ( sdt.IsDirty("ArtFacAbs") )
      {
         gxTv_SdtTARTICU_Artfacabs_N = sdt.getgxTv_SdtTARTICU_Artfacabs_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artfacabs = sdt.getgxTv_SdtTARTICU_Artfacabs() ;
      }
      if ( sdt.IsDirty("ArtPle2") )
      {
         gxTv_SdtTARTICU_Artple2_N = sdt.getgxTv_SdtTARTICU_Artple2_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artple2 = sdt.getgxTv_SdtTARTICU_Artple2() ;
      }
      if ( sdt.IsDirty("ArtNumCor") )
      {
         gxTv_SdtTARTICU_Artnumcor_N = sdt.getgxTv_SdtTARTICU_Artnumcor_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artnumcor = sdt.getgxTv_SdtTARTICU_Artnumcor() ;
      }
      if ( sdt.IsDirty("ArtAncSal1") )
      {
         gxTv_SdtTARTICU_Artancsal1_N = sdt.getgxTv_SdtTARTICU_Artancsal1_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artancsal1 = sdt.getgxTv_SdtTARTICU_Artancsal1() ;
      }
      if ( sdt.IsDirty("ArtAncSal2") )
      {
         gxTv_SdtTARTICU_Artancsal2_N = sdt.getgxTv_SdtTARTICU_Artancsal2_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artancsal2 = sdt.getgxTv_SdtTARTICU_Artancsal2() ;
      }
      if ( sdt.IsDirty("ArtAncSal3") )
      {
         gxTv_SdtTARTICU_Artancsal3_N = sdt.getgxTv_SdtTARTICU_Artancsal3_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artancsal3 = sdt.getgxTv_SdtTARTICU_Artancsal3() ;
      }
      if ( sdt.IsDirty("ArtGraAca2") )
      {
         gxTv_SdtTARTICU_Artgraaca2_N = sdt.getgxTv_SdtTARTICU_Artgraaca2_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artgraaca2 = sdt.getgxTv_SdtTARTICU_Artgraaca2() ;
      }
      if ( sdt.IsDirty("ArtGraCru2") )
      {
         gxTv_SdtTARTICU_Artgracru2_N = sdt.getgxTv_SdtTARTICU_Artgracru2_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artgracru2 = sdt.getgxTv_SdtTARTICU_Artgracru2() ;
      }
      if ( sdt.IsDirty("ClasCod") )
      {
         gxTv_SdtTARTICU_Clascod_N = sdt.getgxTv_SdtTARTICU_Clascod_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Clascod = sdt.getgxTv_SdtTARTICU_Clascod() ;
      }
      if ( sdt.IsDirty("ArtPmPPza") )
      {
         gxTv_SdtTARTICU_Artpmppza_N = sdt.getgxTv_SdtTARTICU_Artpmppza_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artpmppza = sdt.getgxTv_SdtTARTICU_Artpmppza() ;
      }
      if ( sdt.IsDirty("ArtFecCre") )
      {
         gxTv_SdtTARTICU_Artfeccre_N = sdt.getgxTv_SdtTARTICU_Artfeccre_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artfeccre = sdt.getgxTv_SdtTARTICU_Artfeccre() ;
      }
      if ( sdt.IsDirty("ArtUsrCod") )
      {
         gxTv_SdtTARTICU_Artusrcod_N = sdt.getgxTv_SdtTARTICU_Artusrcod_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artusrcod = sdt.getgxTv_SdtTARTICU_Artusrcod() ;
      }
      if ( sdt.IsDirty("ArtFecMod") )
      {
         gxTv_SdtTARTICU_Artfecmod_N = sdt.getgxTv_SdtTARTICU_Artfecmod_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artfecmod = sdt.getgxTv_SdtTARTICU_Artfecmod() ;
      }
      if ( sdt.IsDirty("ClasDsc") )
      {
         gxTv_SdtTARTICU_Clasdsc_N = sdt.getgxTv_SdtTARTICU_Clasdsc_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Clasdsc = sdt.getgxTv_SdtTARTICU_Clasdsc() ;
      }
      if ( sdt.IsDirty("ArtComer") )
      {
         gxTv_SdtTARTICU_Artcomer_N = sdt.getgxTv_SdtTARTICU_Artcomer_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artcomer = sdt.getgxTv_SdtTARTICU_Artcomer() ;
      }
      if ( sdt.IsDirty("ClaTubCod") )
      {
         gxTv_SdtTARTICU_Clatubcod_N = sdt.getgxTv_SdtTARTICU_Clatubcod_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Clatubcod = sdt.getgxTv_SdtTARTICU_Clatubcod() ;
      }
      if ( sdt.IsDirty("ClaTubDsc") )
      {
         gxTv_SdtTARTICU_Clatubdsc_N = sdt.getgxTv_SdtTARTICU_Clatubdsc_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Clatubdsc = sdt.getgxTv_SdtTARTICU_Clatubdsc() ;
      }
      if ( sdt.IsDirty("ClaBolCod") )
      {
         gxTv_SdtTARTICU_Clabolcod_N = sdt.getgxTv_SdtTARTICU_Clabolcod_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Clabolcod = sdt.getgxTv_SdtTARTICU_Clabolcod() ;
      }
      if ( sdt.IsDirty("ClaBolDsc") )
      {
         gxTv_SdtTARTICU_Claboldsc_N = sdt.getgxTv_SdtTARTICU_Claboldsc_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Claboldsc = sdt.getgxTv_SdtTARTICU_Claboldsc() ;
      }
      if ( sdt.IsDirty("ArtRdoCru1") )
      {
         gxTv_SdtTARTICU_Artrdocru1_N = sdt.getgxTv_SdtTARTICU_Artrdocru1_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artrdocru1 = sdt.getgxTv_SdtTARTICU_Artrdocru1() ;
      }
      if ( sdt.IsDirty("ArtRdoCru2") )
      {
         gxTv_SdtTARTICU_Artrdocru2_N = sdt.getgxTv_SdtTARTICU_Artrdocru2_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artrdocru2 = sdt.getgxTv_SdtTARTICU_Artrdocru2() ;
      }
      if ( sdt.IsDirty("ArtNMtr") )
      {
         gxTv_SdtTARTICU_Artnmtr_N = sdt.getgxTv_SdtTARTICU_Artnmtr_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artnmtr = sdt.getgxTv_SdtTARTICU_Artnmtr() ;
      }
      if ( sdt.IsDirty("ArtLu") )
      {
         gxTv_SdtTARTICU_Artlu_N = sdt.getgxTv_SdtTARTICU_Artlu_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artlu = sdt.getgxTv_SdtTARTICU_Artlu() ;
      }
      if ( sdt.IsDirty("ArtRb") )
      {
         gxTv_SdtTARTICU_Artrb_N = sdt.getgxTv_SdtTARTICU_Artrb_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artrb = sdt.getgxTv_SdtTARTICU_Artrb() ;
      }
      if ( sdt.IsDirty("ArtPelAnh") )
      {
         gxTv_SdtTARTICU_Artpelanh_N = sdt.getgxTv_SdtTARTICU_Artpelanh_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artpelanh = sdt.getgxTv_SdtTARTICU_Artpelanh() ;
      }
      if ( sdt.IsDirty("Artgrm2Sc") )
      {
         gxTv_SdtTARTICU_Artgrm2sc_N = sdt.getgxTv_SdtTARTICU_Artgrm2sc_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artgrm2sc = sdt.getgxTv_SdtTARTICU_Artgrm2sc() ;
      }
      if ( sdt.IsDirty("ArtPmlSc") )
      {
         gxTv_SdtTARTICU_Artpmlsc_N = sdt.getgxTv_SdtTARTICU_Artpmlsc_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artpmlsc = sdt.getgxTv_SdtTARTICU_Artpmlsc() ;
      }
      if ( sdt.IsDirty("ArtAncSc") )
      {
         gxTv_SdtTARTICU_Artancsc_N = sdt.getgxTv_SdtTARTICU_Artancsc_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artancsc = sdt.getgxTv_SdtTARTICU_Artancsc() ;
      }
      if ( sdt.IsDirty("ArtPmlCru") )
      {
         gxTv_SdtTARTICU_Artpmlcru_N = sdt.getgxTv_SdtTARTICU_Artpmlcru_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artpmlcru = sdt.getgxTv_SdtTARTICU_Artpmlcru() ;
      }
      if ( sdt.IsDirty("ArtRdtSc") )
      {
         gxTv_SdtTARTICU_Artrdtsc_N = sdt.getgxTv_SdtTARTICU_Artrdtsc_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artrdtsc = sdt.getgxTv_SdtTARTICU_Artrdtsc() ;
      }
      if ( sdt.IsDirty("ArtUnd") )
      {
         gxTv_SdtTARTICU_Artund_N = sdt.getgxTv_SdtTARTICU_Artund_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artund = sdt.getgxTv_SdtTARTICU_Artund() ;
      }
      if ( sdt.IsDirty("ArtBlo") )
      {
         gxTv_SdtTARTICU_Artblo_N = sdt.getgxTv_SdtTARTICU_Artblo_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artblo = sdt.getgxTv_SdtTARTICU_Artblo() ;
      }
      if ( sdt.IsDirty("ArtCla") )
      {
         gxTv_SdtTARTICU_Artcla_N = sdt.getgxTv_SdtTARTICU_Artcla_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artcla = sdt.getgxTv_SdtTARTICU_Artcla() ;
      }
      if ( sdt.IsDirty("TipArtDsc2") )
      {
         gxTv_SdtTARTICU_Tipartdsc2_N = sdt.getgxTv_SdtTARTICU_Tipartdsc2_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Tipartdsc2 = sdt.getgxTv_SdtTARTICU_Tipartdsc2() ;
      }
      if ( sdt.IsDirty("ArtFabsH") )
      {
         gxTv_SdtTARTICU_Artfabsh_N = sdt.getgxTv_SdtTARTICU_Artfabsh_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artfabsh = sdt.getgxTv_SdtTARTICU_Artfabsh() ;
      }
      if ( sdt.IsDirty("ArtFabsT") )
      {
         gxTv_SdtTARTICU_Artfabst_N = sdt.getgxTv_SdtTARTICU_Artfabst_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artfabst = sdt.getgxTv_SdtTARTICU_Artfabst() ;
      }
      if ( sdt.IsDirty("ArtNProg") )
      {
         gxTv_SdtTARTICU_Artnprog_N = sdt.getgxTv_SdtTARTICU_Artnprog_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artnprog = sdt.getgxTv_SdtTARTICU_Artnprog() ;
      }
      if ( sdt.IsDirty("ArtVbd") )
      {
         gxTv_SdtTARTICU_Artvbd_N = sdt.getgxTv_SdtTARTICU_Artvbd_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artvbd = sdt.getgxTv_SdtTARTICU_Artvbd() ;
      }
      if ( sdt.IsDirty("ArtVbn") )
      {
         gxTv_SdtTARTICU_Artvbn_N = sdt.getgxTv_SdtTARTICU_Artvbn_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artvbn = sdt.getgxTv_SdtTARTICU_Artvbn() ;
      }
      if ( sdt.IsDirty("ArtAb") )
      {
         gxTv_SdtTARTICU_Artab_N = sdt.getgxTv_SdtTARTICU_Artab_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artab = sdt.getgxTv_SdtTARTICU_Artab() ;
      }
      if ( sdt.IsDirty("ArtObsGrm") )
      {
         gxTv_SdtTARTICU_Artobsgrm_N = sdt.getgxTv_SdtTARTICU_Artobsgrm_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artobsgrm = sdt.getgxTv_SdtTARTICU_Artobsgrm() ;
      }
      if ( sdt.IsDirty("ArtObsAnc") )
      {
         gxTv_SdtTARTICU_Artobsanc_N = sdt.getgxTv_SdtTARTICU_Artobsanc_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artobsanc = sdt.getgxTv_SdtTARTICU_Artobsanc() ;
      }
      if ( sdt.IsDirty("ArtCdb") )
      {
         gxTv_SdtTARTICU_Artcdb_N = sdt.getgxTv_SdtTARTICU_Artcdb_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artcdb = sdt.getgxTv_SdtTARTICU_Artcdb() ;
      }
      if ( sdt.IsDirty("ArtGalga") )
      {
         gxTv_SdtTARTICU_Artgalga_N = sdt.getgxTv_SdtTARTICU_Artgalga_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artgalga = sdt.getgxTv_SdtTARTICU_Artgalga() ;
      }
      if ( sdt.IsDirty("ArtPlatina") )
      {
         gxTv_SdtTARTICU_Artplatina_N = sdt.getgxTv_SdtTARTICU_Artplatina_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artplatina = sdt.getgxTv_SdtTARTICU_Artplatina() ;
      }
      if ( sdt.IsDirty("ArtPgd") )
      {
         gxTv_SdtTARTICU_Artpgd_N = sdt.getgxTv_SdtTARTICU_Artpgd_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artpgd = sdt.getgxTv_SdtTARTICU_Artpgd() ;
      }
      if ( sdt.IsDirty("ArtTh") )
      {
         gxTv_SdtTARTICU_Artth_N = sdt.getgxTv_SdtTARTICU_Artth_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artth = sdt.getgxTv_SdtTARTICU_Artth() ;
      }
      if ( sdt.IsDirty("ArtThN") )
      {
         gxTv_SdtTARTICU_Artthn_N = sdt.getgxTv_SdtTARTICU_Artthn_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artthn = sdt.getgxTv_SdtTARTICU_Artthn() ;
      }
      if ( sdt.IsDirty("Art_Cd") )
      {
         gxTv_SdtTARTICU_Art_cd_N = sdt.getgxTv_SdtTARTICU_Art_cd_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Art_cd = sdt.getgxTv_SdtTARTICU_Art_cd() ;
      }
      if ( sdt.IsDirty("Art_Dc") )
      {
         gxTv_SdtTARTICU_Art_dc_N = sdt.getgxTv_SdtTARTICU_Art_dc_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Art_dc = sdt.getgxTv_SdtTARTICU_Art_dc() ;
      }
      if ( sdt.IsDirty("ArtHilos") )
      {
         gxTv_SdtTARTICU_Arthilos_N = sdt.getgxTv_SdtTARTICU_Arthilos_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Arthilos = sdt.getgxTv_SdtTARTICU_Arthilos() ;
      }
      if ( sdt.IsDirty("ArtPasad") )
      {
         gxTv_SdtTARTICU_Artpasad_N = sdt.getgxTv_SdtTARTICU_Artpasad_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artpasad = sdt.getgxTv_SdtTARTICU_Artpasad() ;
      }
      if ( sdt.IsDirty("ArtAncC") )
      {
         gxTv_SdtTARTICU_Artancc_N = sdt.getgxTv_SdtTARTICU_Artancc_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artancc = sdt.getgxTv_SdtTARTICU_Artancc() ;
      }
      if ( sdt.IsDirty("ArtGrm2C") )
      {
         gxTv_SdtTARTICU_Artgrm2c_N = sdt.getgxTv_SdtTARTICU_Artgrm2c_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artgrm2c = sdt.getgxTv_SdtTARTICU_Artgrm2c() ;
      }
      if ( sdt.IsDirty("ArtRdoC") )
      {
         gxTv_SdtTARTICU_Artrdoc_N = sdt.getgxTv_SdtTARTICU_Artrdoc_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artrdoc = sdt.getgxTv_SdtTARTICU_Artrdoc() ;
      }
      if ( sdt.IsDirty("ArtAcaFor") )
      {
         gxTv_SdtTARTICU_Artacafor_N = sdt.getgxTv_SdtTARTICU_Artacafor_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artacafor = sdt.getgxTv_SdtTARTICU_Artacafor() ;
      }
      if ( sdt.IsDirty("ArtAnu") )
      {
         gxTv_SdtTARTICU_Artanu_N = sdt.getgxTv_SdtTARTICU_Artanu_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artanu = sdt.getgxTv_SdtTARTICU_Artanu() ;
      }
      if ( sdt.IsDirty("ArtFacUti") )
      {
         gxTv_SdtTARTICU_Artfacuti_N = sdt.getgxTv_SdtTARTICU_Artfacuti_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artfacuti = sdt.getgxTv_SdtTARTICU_Artfacuti() ;
      }
      if ( sdt.IsDirty("ArtNumTip") )
      {
         gxTv_SdtTARTICU_Artnumtip_N = sdt.getgxTv_SdtTARTICU_Artnumtip_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artnumtip = sdt.getgxTv_SdtTARTICU_Artnumtip() ;
      }
      if ( sdt.IsDirty("ArtMT") )
      {
         gxTv_SdtTARTICU_Artmt_N = sdt.getgxTv_SdtTARTICU_Artmt_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artmt = sdt.getgxTv_SdtTARTICU_Artmt() ;
      }
      if ( sdt.IsDirty("ArtTRabs") )
      {
         gxTv_SdtTARTICU_Arttrabs_N = sdt.getgxTv_SdtTARTICU_Arttrabs_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Arttrabs = sdt.getgxTv_SdtTARTICU_Arttrabs() ;
      }
      if ( sdt.IsDirty("ArtKgMn") )
      {
         gxTv_SdtTARTICU_Artkgmn_N = sdt.getgxTv_SdtTARTICU_Artkgmn_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artkgmn = sdt.getgxTv_SdtTARTICU_Artkgmn() ;
      }
      if ( sdt.IsDirty("ArtAcaMar") )
      {
         gxTv_SdtTARTICU_Artacamar_N = sdt.getgxTv_SdtTARTICU_Artacamar_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artacamar = sdt.getgxTv_SdtTARTICU_Artacamar() ;
      }
      if ( sdt.IsDirty("ArtAcaBak") )
      {
         gxTv_SdtTARTICU_Artacabak_N = sdt.getgxTv_SdtTARTICU_Artacabak_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artacabak = sdt.getgxTv_SdtTARTICU_Artacabak() ;
      }
      if ( sdt.IsDirty("ArtElgAnc") )
      {
         gxTv_SdtTARTICU_Artelganc_N = sdt.getgxTv_SdtTARTICU_Artelganc_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artelganc = sdt.getgxTv_SdtTARTICU_Artelganc() ;
      }
      if ( sdt.IsDirty("ArtElgLar") )
      {
         gxTv_SdtTARTICU_Artelglar_N = sdt.getgxTv_SdtTARTICU_Artelglar_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artelglar = sdt.getgxTv_SdtTARTICU_Artelglar() ;
      }
      if ( sdt.IsDirty("ArtRdoCru") )
      {
         gxTv_SdtTARTICU_Artrdocru_N = sdt.getgxTv_SdtTARTICU_Artrdocru_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artrdocru = sdt.getgxTv_SdtTARTICU_Artrdocru() ;
      }
      if ( sdt.IsDirty("ArtEncLarg") )
      {
         gxTv_SdtTARTICU_Artenclarg_N = sdt.getgxTv_SdtTARTICU_Artenclarg_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artenclarg = sdt.getgxTv_SdtTARTICU_Artenclarg() ;
      }
      if ( sdt.IsDirty("ArtEncAnc") )
      {
         gxTv_SdtTARTICU_Artencanc_N = sdt.getgxTv_SdtTARTICU_Artencanc_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artencanc = sdt.getgxTv_SdtTARTICU_Artencanc() ;
      }
      if ( sdt.IsDirty("ArtRdto4") )
      {
         gxTv_SdtTARTICU_Artrdto4_N = sdt.getgxTv_SdtTARTICU_Artrdto4_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artrdto4 = sdt.getgxTv_SdtTARTICU_Artrdto4() ;
      }
      if ( sdt.IsDirty("Artdsc2") )
      {
         gxTv_SdtTARTICU_Artdsc2_N = sdt.getgxTv_SdtTARTICU_Artdsc2_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artdsc2 = sdt.getgxTv_SdtTARTICU_Artdsc2() ;
      }
      if ( sdt.IsDirty("ArtgrComp") )
      {
         gxTv_SdtTARTICU_Artgrcomp_N = sdt.getgxTv_SdtTARTICU_Artgrcomp_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artgrcomp = sdt.getgxTv_SdtTARTICU_Artgrcomp() ;
      }
      if ( sdt.IsDirty("ArtKgspp") )
      {
         gxTv_SdtTARTICU_Artkgspp_N = sdt.getgxTv_SdtTARTICU_Artkgspp_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artkgspp = sdt.getgxTv_SdtTARTICU_Artkgspp() ;
      }
      if ( sdt.IsDirty("ArtPrepp") )
      {
         gxTv_SdtTARTICU_Artprepp_N = sdt.getgxTv_SdtTARTICU_Artprepp_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artprepp = sdt.getgxTv_SdtTARTICU_Artprepp() ;
      }
      if ( sdt.IsDirty("ArtCDsc") )
      {
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artcdsc = sdt.getgxTv_SdtTARTICU_Artcdsc() ;
      }
      if ( sdt.IsDirty("ArtObsLon") )
      {
         gxTv_SdtTARTICU_Artobslon_N = sdt.getgxTv_SdtTARTICU_Artobslon_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artobslon = sdt.getgxTv_SdtTARTICU_Artobslon() ;
      }
      if ( sdt.IsDirty("ArtObsFac") )
      {
         gxTv_SdtTARTICU_Artobsfac_N = sdt.getgxTv_SdtTARTICU_Artobsfac_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artobsfac = sdt.getgxTv_SdtTARTICU_Artobsfac() ;
      }
      if ( sdt.IsDirty("ArtObsOtras") )
      {
         gxTv_SdtTARTICU_Artobsotras_N = sdt.getgxTv_SdtTARTICU_Artobsotras_N() ;
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artobsotras = sdt.getgxTv_SdtTARTICU_Artobsotras() ;
      }
      if ( sdt.IsDirty("ArtActivo") )
      {
         gxTv_SdtTARTICU_N = (byte)(0) ;
         gxTv_SdtTARTICU_Artactivo = sdt.getgxTv_SdtTARTICU_Artactivo() ;
      }
   }

   public String getgxTv_SdtTARTICU_Emprcod( )
   {
      return gxTv_SdtTARTICU_Emprcod ;
   }

   public void setgxTv_SdtTARTICU_Emprcod( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      if ( GXutil.strcmp(gxTv_SdtTARTICU_Emprcod, value) != 0 )
      {
         gxTv_SdtTARTICU_Mode = "INS" ;
         this.setgxTv_SdtTARTICU_Emprcod_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Clicod_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artcod_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artdsc_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Clinom_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artcodext_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Emprnom_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artmat_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Tipartcod_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Tipartdsc_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artpml_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artgracru_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artcrumin_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artcrumax_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artacamin_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artacamax_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artren_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arttipple_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arttiplar_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artcorori_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artencori_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artsua_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artacaqui_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arteti_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Clieti_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Cliurg_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arturg_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artmer_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arttra1_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arttra2_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arttra3_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arttrap1_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arttrap2_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arttrap3_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arturd1_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arturd2_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arturd3_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arturdp1_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arturdp2_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arturdp3_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artenccom_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artencanh_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artgraaca_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artrdoa_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artrdon_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artfacabs_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artple2_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artnumcor_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artancsal1_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artancsal2_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artancsal3_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artgraaca2_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artgracru2_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Clascod_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artpmppza_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artfeccre_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artusrcod_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artfecmod_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Clasdsc_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artcomer_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Clatubcod_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Clatubdsc_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Clabolcod_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Claboldsc_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artrdocru1_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artrdocru2_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artnmtr_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artlu_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artrb_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artpelanh_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artgrm2sc_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artpmlsc_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artancsc_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artpmlcru_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artrdtsc_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artund_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artblo_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artcla_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Tipartdsc2_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artfabsh_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artfabst_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artnprog_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artvbd_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artvbn_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artab_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artobsgrm_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artobsanc_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artcdb_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artgalga_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artplatina_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artpgd_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artth_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artthn_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Art_cd_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Art_dc_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arthilos_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artpasad_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artancc_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artgrm2c_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artrdoc_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artacafor_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artanu_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artfacuti_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artnumtip_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artmt_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arttrabs_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artkgmn_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artacamar_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artacabak_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artelganc_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artelglar_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artrdocru_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artenclarg_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artencanc_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artrdto4_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artdsc2_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artgrcomp_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artkgspp_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artprepp_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artcdsc_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artobsfac_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artobsotras_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artactivo_Z_SetNull( );
      }
      SetDirty("Emprcod");
      gxTv_SdtTARTICU_Emprcod = value ;
   }

   public int getgxTv_SdtTARTICU_Clicod( )
   {
      return gxTv_SdtTARTICU_Clicod ;
   }

   public void setgxTv_SdtTARTICU_Clicod( int value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      if ( gxTv_SdtTARTICU_Clicod != value )
      {
         gxTv_SdtTARTICU_Mode = "INS" ;
         this.setgxTv_SdtTARTICU_Emprcod_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Clicod_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artcod_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artdsc_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Clinom_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artcodext_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Emprnom_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artmat_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Tipartcod_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Tipartdsc_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artpml_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artgracru_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artcrumin_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artcrumax_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artacamin_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artacamax_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artren_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arttipple_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arttiplar_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artcorori_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artencori_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artsua_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artacaqui_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arteti_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Clieti_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Cliurg_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arturg_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artmer_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arttra1_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arttra2_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arttra3_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arttrap1_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arttrap2_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arttrap3_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arturd1_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arturd2_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arturd3_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arturdp1_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arturdp2_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arturdp3_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artenccom_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artencanh_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artgraaca_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artrdoa_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artrdon_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artfacabs_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artple2_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artnumcor_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artancsal1_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artancsal2_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artancsal3_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artgraaca2_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artgracru2_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Clascod_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artpmppza_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artfeccre_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artusrcod_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artfecmod_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Clasdsc_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artcomer_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Clatubcod_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Clatubdsc_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Clabolcod_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Claboldsc_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artrdocru1_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artrdocru2_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artnmtr_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artlu_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artrb_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artpelanh_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artgrm2sc_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artpmlsc_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artancsc_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artpmlcru_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artrdtsc_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artund_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artblo_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artcla_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Tipartdsc2_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artfabsh_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artfabst_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artnprog_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artvbd_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artvbn_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artab_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artobsgrm_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artobsanc_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artcdb_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artgalga_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artplatina_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artpgd_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artth_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artthn_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Art_cd_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Art_dc_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arthilos_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artpasad_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artancc_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artgrm2c_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artrdoc_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artacafor_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artanu_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artfacuti_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artnumtip_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artmt_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arttrabs_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artkgmn_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artacamar_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artacabak_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artelganc_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artelglar_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artrdocru_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artenclarg_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artencanc_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artrdto4_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artdsc2_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artgrcomp_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artkgspp_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artprepp_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artcdsc_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artobsfac_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artobsotras_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artactivo_Z_SetNull( );
      }
      SetDirty("Clicod");
      gxTv_SdtTARTICU_Clicod = value ;
   }

   public String getgxTv_SdtTARTICU_Artcod( )
   {
      return gxTv_SdtTARTICU_Artcod ;
   }

   public void setgxTv_SdtTARTICU_Artcod( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      if ( GXutil.strcmp(gxTv_SdtTARTICU_Artcod, value) != 0 )
      {
         gxTv_SdtTARTICU_Mode = "INS" ;
         this.setgxTv_SdtTARTICU_Emprcod_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Clicod_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artcod_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artdsc_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Clinom_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artcodext_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Emprnom_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artmat_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Tipartcod_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Tipartdsc_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artpml_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artgracru_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artcrumin_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artcrumax_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artacamin_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artacamax_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artren_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arttipple_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arttiplar_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artcorori_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artencori_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artsua_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artacaqui_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arteti_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Clieti_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Cliurg_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arturg_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artmer_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arttra1_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arttra2_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arttra3_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arttrap1_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arttrap2_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arttrap3_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arturd1_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arturd2_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arturd3_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arturdp1_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arturdp2_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arturdp3_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artenccom_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artencanh_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artgraaca_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artrdoa_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artrdon_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artfacabs_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artple2_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artnumcor_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artancsal1_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artancsal2_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artancsal3_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artgraaca2_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artgracru2_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Clascod_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artpmppza_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artfeccre_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artusrcod_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artfecmod_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Clasdsc_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artcomer_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Clatubcod_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Clatubdsc_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Clabolcod_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Claboldsc_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artrdocru1_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artrdocru2_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artnmtr_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artlu_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artrb_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artpelanh_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artgrm2sc_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artpmlsc_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artancsc_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artpmlcru_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artrdtsc_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artund_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artblo_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artcla_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Tipartdsc2_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artfabsh_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artfabst_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artnprog_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artvbd_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artvbn_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artab_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artobsgrm_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artobsanc_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artcdb_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artgalga_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artplatina_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artpgd_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artth_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artthn_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Art_cd_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Art_dc_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arthilos_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artpasad_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artancc_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artgrm2c_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artrdoc_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artacafor_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artanu_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artfacuti_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artnumtip_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artmt_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Arttrabs_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artkgmn_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artacamar_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artacabak_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artelganc_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artelglar_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artrdocru_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artenclarg_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artencanc_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artrdto4_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artdsc2_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artgrcomp_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artkgspp_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artprepp_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artcdsc_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artobsfac_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artobsotras_Z_SetNull( );
         this.setgxTv_SdtTARTICU_Artactivo_Z_SetNull( );
      }
      SetDirty("Artcod");
      gxTv_SdtTARTICU_Artcod = value ;
   }

   public String getgxTv_SdtTARTICU_Artdsc( )
   {
      return gxTv_SdtTARTICU_Artdsc ;
   }

   public void setgxTv_SdtTARTICU_Artdsc( String value )
   {
      gxTv_SdtTARTICU_Artdsc_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artdsc");
      gxTv_SdtTARTICU_Artdsc = value ;
   }

   public void setgxTv_SdtTARTICU_Artdsc_SetNull( )
   {
      gxTv_SdtTARTICU_Artdsc_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artdsc = "" ;
      SetDirty("Artdsc");
   }

   public boolean getgxTv_SdtTARTICU_Artdsc_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artdsc_N==1) ;
   }

   public String getgxTv_SdtTARTICU_Clinom( )
   {
      return gxTv_SdtTARTICU_Clinom ;
   }

   public void setgxTv_SdtTARTICU_Clinom( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Clinom");
      gxTv_SdtTARTICU_Clinom = value ;
   }

   public String getgxTv_SdtTARTICU_Artcodext( )
   {
      return gxTv_SdtTARTICU_Artcodext ;
   }

   public void setgxTv_SdtTARTICU_Artcodext( String value )
   {
      gxTv_SdtTARTICU_Artcodext_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artcodext");
      gxTv_SdtTARTICU_Artcodext = value ;
   }

   public void setgxTv_SdtTARTICU_Artcodext_SetNull( )
   {
      gxTv_SdtTARTICU_Artcodext_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artcodext = "" ;
      SetDirty("Artcodext");
   }

   public boolean getgxTv_SdtTARTICU_Artcodext_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artcodext_N==1) ;
   }

   public String getgxTv_SdtTARTICU_Emprnom( )
   {
      return gxTv_SdtTARTICU_Emprnom ;
   }

   public void setgxTv_SdtTARTICU_Emprnom( String value )
   {
      gxTv_SdtTARTICU_Emprnom_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Emprnom");
      gxTv_SdtTARTICU_Emprnom = value ;
   }

   public void setgxTv_SdtTARTICU_Emprnom_SetNull( )
   {
      gxTv_SdtTARTICU_Emprnom_N = (byte)(1) ;
      gxTv_SdtTARTICU_Emprnom = "" ;
      SetDirty("Emprnom");
   }

   public boolean getgxTv_SdtTARTICU_Emprnom_IsNull( )
   {
      return (gxTv_SdtTARTICU_Emprnom_N==1) ;
   }

   public String getgxTv_SdtTARTICU_Artmat( )
   {
      return gxTv_SdtTARTICU_Artmat ;
   }

   public void setgxTv_SdtTARTICU_Artmat( String value )
   {
      gxTv_SdtTARTICU_Artmat_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artmat");
      gxTv_SdtTARTICU_Artmat = value ;
   }

   public void setgxTv_SdtTARTICU_Artmat_SetNull( )
   {
      gxTv_SdtTARTICU_Artmat_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artmat = "" ;
      SetDirty("Artmat");
   }

   public boolean getgxTv_SdtTARTICU_Artmat_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artmat_N==1) ;
   }

   public short getgxTv_SdtTARTICU_Tipartcod( )
   {
      return gxTv_SdtTARTICU_Tipartcod ;
   }

   public void setgxTv_SdtTARTICU_Tipartcod( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Tipartcod");
      gxTv_SdtTARTICU_Tipartcod = value ;
   }

   public String getgxTv_SdtTARTICU_Tipartdsc( )
   {
      return gxTv_SdtTARTICU_Tipartdsc ;
   }

   public void setgxTv_SdtTARTICU_Tipartdsc( String value )
   {
      gxTv_SdtTARTICU_Tipartdsc_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Tipartdsc");
      gxTv_SdtTARTICU_Tipartdsc = value ;
   }

   public void setgxTv_SdtTARTICU_Tipartdsc_SetNull( )
   {
      gxTv_SdtTARTICU_Tipartdsc_N = (byte)(1) ;
      gxTv_SdtTARTICU_Tipartdsc = "" ;
      SetDirty("Tipartdsc");
   }

   public boolean getgxTv_SdtTARTICU_Tipartdsc_IsNull( )
   {
      return (gxTv_SdtTARTICU_Tipartdsc_N==1) ;
   }

   public short getgxTv_SdtTARTICU_Artpml( )
   {
      return gxTv_SdtTARTICU_Artpml ;
   }

   public void setgxTv_SdtTARTICU_Artpml( short value )
   {
      gxTv_SdtTARTICU_Artpml_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artpml");
      gxTv_SdtTARTICU_Artpml = value ;
   }

   public void setgxTv_SdtTARTICU_Artpml_SetNull( )
   {
      gxTv_SdtTARTICU_Artpml_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artpml = (short)(0) ;
      SetDirty("Artpml");
   }

   public boolean getgxTv_SdtTARTICU_Artpml_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artpml_N==1) ;
   }

   public short getgxTv_SdtTARTICU_Artgracru( )
   {
      return gxTv_SdtTARTICU_Artgracru ;
   }

   public void setgxTv_SdtTARTICU_Artgracru( short value )
   {
      gxTv_SdtTARTICU_Artgracru_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artgracru");
      gxTv_SdtTARTICU_Artgracru = value ;
   }

   public void setgxTv_SdtTARTICU_Artgracru_SetNull( )
   {
      gxTv_SdtTARTICU_Artgracru_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artgracru = (short)(0) ;
      SetDirty("Artgracru");
   }

   public boolean getgxTv_SdtTARTICU_Artgracru_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artgracru_N==1) ;
   }

   public short getgxTv_SdtTARTICU_Artcrumin( )
   {
      return gxTv_SdtTARTICU_Artcrumin ;
   }

   public void setgxTv_SdtTARTICU_Artcrumin( short value )
   {
      gxTv_SdtTARTICU_Artcrumin_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artcrumin");
      gxTv_SdtTARTICU_Artcrumin = value ;
   }

   public void setgxTv_SdtTARTICU_Artcrumin_SetNull( )
   {
      gxTv_SdtTARTICU_Artcrumin_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artcrumin = (short)(0) ;
      SetDirty("Artcrumin");
   }

   public boolean getgxTv_SdtTARTICU_Artcrumin_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artcrumin_N==1) ;
   }

   public short getgxTv_SdtTARTICU_Artcrumax( )
   {
      return gxTv_SdtTARTICU_Artcrumax ;
   }

   public void setgxTv_SdtTARTICU_Artcrumax( short value )
   {
      gxTv_SdtTARTICU_Artcrumax_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artcrumax");
      gxTv_SdtTARTICU_Artcrumax = value ;
   }

   public void setgxTv_SdtTARTICU_Artcrumax_SetNull( )
   {
      gxTv_SdtTARTICU_Artcrumax_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artcrumax = (short)(0) ;
      SetDirty("Artcrumax");
   }

   public boolean getgxTv_SdtTARTICU_Artcrumax_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artcrumax_N==1) ;
   }

   public short getgxTv_SdtTARTICU_Artacamin( )
   {
      return gxTv_SdtTARTICU_Artacamin ;
   }

   public void setgxTv_SdtTARTICU_Artacamin( short value )
   {
      gxTv_SdtTARTICU_Artacamin_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artacamin");
      gxTv_SdtTARTICU_Artacamin = value ;
   }

   public void setgxTv_SdtTARTICU_Artacamin_SetNull( )
   {
      gxTv_SdtTARTICU_Artacamin_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artacamin = (short)(0) ;
      SetDirty("Artacamin");
   }

   public boolean getgxTv_SdtTARTICU_Artacamin_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artacamin_N==1) ;
   }

   public short getgxTv_SdtTARTICU_Artacamax( )
   {
      return gxTv_SdtTARTICU_Artacamax ;
   }

   public void setgxTv_SdtTARTICU_Artacamax( short value )
   {
      gxTv_SdtTARTICU_Artacamax_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artacamax");
      gxTv_SdtTARTICU_Artacamax = value ;
   }

   public void setgxTv_SdtTARTICU_Artacamax_SetNull( )
   {
      gxTv_SdtTARTICU_Artacamax_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artacamax = (short)(0) ;
      SetDirty("Artacamax");
   }

   public boolean getgxTv_SdtTARTICU_Artacamax_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artacamax_N==1) ;
   }

   public java.math.BigDecimal getgxTv_SdtTARTICU_Artren( )
   {
      return gxTv_SdtTARTICU_Artren ;
   }

   public void setgxTv_SdtTARTICU_Artren( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_Artren_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artren");
      gxTv_SdtTARTICU_Artren = value ;
   }

   public void setgxTv_SdtTARTICU_Artren_SetNull( )
   {
      gxTv_SdtTARTICU_Artren_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artren = DecimalUtil.ZERO ;
      SetDirty("Artren");
   }

   public boolean getgxTv_SdtTARTICU_Artren_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artren_N==1) ;
   }

   public String getgxTv_SdtTARTICU_Arttipple( )
   {
      return gxTv_SdtTARTICU_Arttipple ;
   }

   public void setgxTv_SdtTARTICU_Arttipple( String value )
   {
      gxTv_SdtTARTICU_Arttipple_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arttipple");
      gxTv_SdtTARTICU_Arttipple = value ;
   }

   public void setgxTv_SdtTARTICU_Arttipple_SetNull( )
   {
      gxTv_SdtTARTICU_Arttipple_N = (byte)(1) ;
      gxTv_SdtTARTICU_Arttipple = "" ;
      SetDirty("Arttipple");
   }

   public boolean getgxTv_SdtTARTICU_Arttipple_IsNull( )
   {
      return (gxTv_SdtTARTICU_Arttipple_N==1) ;
   }

   public String getgxTv_SdtTARTICU_Arttiplar( )
   {
      return gxTv_SdtTARTICU_Arttiplar ;
   }

   public void setgxTv_SdtTARTICU_Arttiplar( String value )
   {
      gxTv_SdtTARTICU_Arttiplar_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arttiplar");
      gxTv_SdtTARTICU_Arttiplar = value ;
   }

   public void setgxTv_SdtTARTICU_Arttiplar_SetNull( )
   {
      gxTv_SdtTARTICU_Arttiplar_N = (byte)(1) ;
      gxTv_SdtTARTICU_Arttiplar = "" ;
      SetDirty("Arttiplar");
   }

   public boolean getgxTv_SdtTARTICU_Arttiplar_IsNull( )
   {
      return (gxTv_SdtTARTICU_Arttiplar_N==1) ;
   }

   public String getgxTv_SdtTARTICU_Artcorori( )
   {
      return gxTv_SdtTARTICU_Artcorori ;
   }

   public void setgxTv_SdtTARTICU_Artcorori( String value )
   {
      gxTv_SdtTARTICU_Artcorori_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artcorori");
      gxTv_SdtTARTICU_Artcorori = value ;
   }

   public void setgxTv_SdtTARTICU_Artcorori_SetNull( )
   {
      gxTv_SdtTARTICU_Artcorori_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artcorori = "" ;
      SetDirty("Artcorori");
   }

   public boolean getgxTv_SdtTARTICU_Artcorori_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artcorori_N==1) ;
   }

   public String getgxTv_SdtTARTICU_Artencori( )
   {
      return gxTv_SdtTARTICU_Artencori ;
   }

   public void setgxTv_SdtTARTICU_Artencori( String value )
   {
      gxTv_SdtTARTICU_Artencori_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artencori");
      gxTv_SdtTARTICU_Artencori = value ;
   }

   public void setgxTv_SdtTARTICU_Artencori_SetNull( )
   {
      gxTv_SdtTARTICU_Artencori_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artencori = "" ;
      SetDirty("Artencori");
   }

   public boolean getgxTv_SdtTARTICU_Artencori_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artencori_N==1) ;
   }

   public String getgxTv_SdtTARTICU_Artsua( )
   {
      return gxTv_SdtTARTICU_Artsua ;
   }

   public void setgxTv_SdtTARTICU_Artsua( String value )
   {
      gxTv_SdtTARTICU_Artsua_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artsua");
      gxTv_SdtTARTICU_Artsua = value ;
   }

   public void setgxTv_SdtTARTICU_Artsua_SetNull( )
   {
      gxTv_SdtTARTICU_Artsua_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artsua = "" ;
      SetDirty("Artsua");
   }

   public boolean getgxTv_SdtTARTICU_Artsua_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artsua_N==1) ;
   }

   public String getgxTv_SdtTARTICU_Artacaqui( )
   {
      return gxTv_SdtTARTICU_Artacaqui ;
   }

   public void setgxTv_SdtTARTICU_Artacaqui( String value )
   {
      gxTv_SdtTARTICU_Artacaqui_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artacaqui");
      gxTv_SdtTARTICU_Artacaqui = value ;
   }

   public void setgxTv_SdtTARTICU_Artacaqui_SetNull( )
   {
      gxTv_SdtTARTICU_Artacaqui_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artacaqui = "" ;
      SetDirty("Artacaqui");
   }

   public boolean getgxTv_SdtTARTICU_Artacaqui_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artacaqui_N==1) ;
   }

   public String getgxTv_SdtTARTICU_Arteti( )
   {
      return gxTv_SdtTARTICU_Arteti ;
   }

   public void setgxTv_SdtTARTICU_Arteti( String value )
   {
      gxTv_SdtTARTICU_Arteti_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arteti");
      gxTv_SdtTARTICU_Arteti = value ;
   }

   public void setgxTv_SdtTARTICU_Arteti_SetNull( )
   {
      gxTv_SdtTARTICU_Arteti_N = (byte)(1) ;
      gxTv_SdtTARTICU_Arteti = "" ;
      SetDirty("Arteti");
   }

   public boolean getgxTv_SdtTARTICU_Arteti_IsNull( )
   {
      return (gxTv_SdtTARTICU_Arteti_N==1) ;
   }

   public String getgxTv_SdtTARTICU_Clieti( )
   {
      return gxTv_SdtTARTICU_Clieti ;
   }

   public void setgxTv_SdtTARTICU_Clieti( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Clieti");
      gxTv_SdtTARTICU_Clieti = value ;
   }

   public byte getgxTv_SdtTARTICU_Cliurg( )
   {
      return gxTv_SdtTARTICU_Cliurg ;
   }

   public void setgxTv_SdtTARTICU_Cliurg( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Cliurg");
      gxTv_SdtTARTICU_Cliurg = value ;
   }

   public byte getgxTv_SdtTARTICU_Arturg( )
   {
      return gxTv_SdtTARTICU_Arturg ;
   }

   public void setgxTv_SdtTARTICU_Arturg( byte value )
   {
      gxTv_SdtTARTICU_Arturg_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arturg");
      gxTv_SdtTARTICU_Arturg = value ;
   }

   public void setgxTv_SdtTARTICU_Arturg_SetNull( )
   {
      gxTv_SdtTARTICU_Arturg_N = (byte)(1) ;
      gxTv_SdtTARTICU_Arturg = (byte)(0) ;
      SetDirty("Arturg");
   }

   public boolean getgxTv_SdtTARTICU_Arturg_IsNull( )
   {
      return (gxTv_SdtTARTICU_Arturg_N==1) ;
   }

   public java.math.BigDecimal getgxTv_SdtTARTICU_Artmer( )
   {
      return gxTv_SdtTARTICU_Artmer ;
   }

   public void setgxTv_SdtTARTICU_Artmer( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_Artmer_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artmer");
      gxTv_SdtTARTICU_Artmer = value ;
   }

   public void setgxTv_SdtTARTICU_Artmer_SetNull( )
   {
      gxTv_SdtTARTICU_Artmer_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artmer = DecimalUtil.ZERO ;
      SetDirty("Artmer");
   }

   public boolean getgxTv_SdtTARTICU_Artmer_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artmer_N==1) ;
   }

   public String getgxTv_SdtTARTICU_Arttra1( )
   {
      return gxTv_SdtTARTICU_Arttra1 ;
   }

   public void setgxTv_SdtTARTICU_Arttra1( String value )
   {
      gxTv_SdtTARTICU_Arttra1_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arttra1");
      gxTv_SdtTARTICU_Arttra1 = value ;
   }

   public void setgxTv_SdtTARTICU_Arttra1_SetNull( )
   {
      gxTv_SdtTARTICU_Arttra1_N = (byte)(1) ;
      gxTv_SdtTARTICU_Arttra1 = "" ;
      SetDirty("Arttra1");
   }

   public boolean getgxTv_SdtTARTICU_Arttra1_IsNull( )
   {
      return (gxTv_SdtTARTICU_Arttra1_N==1) ;
   }

   public String getgxTv_SdtTARTICU_Arttra2( )
   {
      return gxTv_SdtTARTICU_Arttra2 ;
   }

   public void setgxTv_SdtTARTICU_Arttra2( String value )
   {
      gxTv_SdtTARTICU_Arttra2_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arttra2");
      gxTv_SdtTARTICU_Arttra2 = value ;
   }

   public void setgxTv_SdtTARTICU_Arttra2_SetNull( )
   {
      gxTv_SdtTARTICU_Arttra2_N = (byte)(1) ;
      gxTv_SdtTARTICU_Arttra2 = "" ;
      SetDirty("Arttra2");
   }

   public boolean getgxTv_SdtTARTICU_Arttra2_IsNull( )
   {
      return (gxTv_SdtTARTICU_Arttra2_N==1) ;
   }

   public String getgxTv_SdtTARTICU_Arttra3( )
   {
      return gxTv_SdtTARTICU_Arttra3 ;
   }

   public void setgxTv_SdtTARTICU_Arttra3( String value )
   {
      gxTv_SdtTARTICU_Arttra3_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arttra3");
      gxTv_SdtTARTICU_Arttra3 = value ;
   }

   public void setgxTv_SdtTARTICU_Arttra3_SetNull( )
   {
      gxTv_SdtTARTICU_Arttra3_N = (byte)(1) ;
      gxTv_SdtTARTICU_Arttra3 = "" ;
      SetDirty("Arttra3");
   }

   public boolean getgxTv_SdtTARTICU_Arttra3_IsNull( )
   {
      return (gxTv_SdtTARTICU_Arttra3_N==1) ;
   }

   public short getgxTv_SdtTARTICU_Arttrap1( )
   {
      return gxTv_SdtTARTICU_Arttrap1 ;
   }

   public void setgxTv_SdtTARTICU_Arttrap1( short value )
   {
      gxTv_SdtTARTICU_Arttrap1_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arttrap1");
      gxTv_SdtTARTICU_Arttrap1 = value ;
   }

   public void setgxTv_SdtTARTICU_Arttrap1_SetNull( )
   {
      gxTv_SdtTARTICU_Arttrap1_N = (byte)(1) ;
      gxTv_SdtTARTICU_Arttrap1 = (short)(0) ;
      SetDirty("Arttrap1");
   }

   public boolean getgxTv_SdtTARTICU_Arttrap1_IsNull( )
   {
      return (gxTv_SdtTARTICU_Arttrap1_N==1) ;
   }

   public short getgxTv_SdtTARTICU_Arttrap2( )
   {
      return gxTv_SdtTARTICU_Arttrap2 ;
   }

   public void setgxTv_SdtTARTICU_Arttrap2( short value )
   {
      gxTv_SdtTARTICU_Arttrap2_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arttrap2");
      gxTv_SdtTARTICU_Arttrap2 = value ;
   }

   public void setgxTv_SdtTARTICU_Arttrap2_SetNull( )
   {
      gxTv_SdtTARTICU_Arttrap2_N = (byte)(1) ;
      gxTv_SdtTARTICU_Arttrap2 = (short)(0) ;
      SetDirty("Arttrap2");
   }

   public boolean getgxTv_SdtTARTICU_Arttrap2_IsNull( )
   {
      return (gxTv_SdtTARTICU_Arttrap2_N==1) ;
   }

   public short getgxTv_SdtTARTICU_Arttrap3( )
   {
      return gxTv_SdtTARTICU_Arttrap3 ;
   }

   public void setgxTv_SdtTARTICU_Arttrap3( short value )
   {
      gxTv_SdtTARTICU_Arttrap3_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arttrap3");
      gxTv_SdtTARTICU_Arttrap3 = value ;
   }

   public void setgxTv_SdtTARTICU_Arttrap3_SetNull( )
   {
      gxTv_SdtTARTICU_Arttrap3_N = (byte)(1) ;
      gxTv_SdtTARTICU_Arttrap3 = (short)(0) ;
      SetDirty("Arttrap3");
   }

   public boolean getgxTv_SdtTARTICU_Arttrap3_IsNull( )
   {
      return (gxTv_SdtTARTICU_Arttrap3_N==1) ;
   }

   public String getgxTv_SdtTARTICU_Arturd1( )
   {
      return gxTv_SdtTARTICU_Arturd1 ;
   }

   public void setgxTv_SdtTARTICU_Arturd1( String value )
   {
      gxTv_SdtTARTICU_Arturd1_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arturd1");
      gxTv_SdtTARTICU_Arturd1 = value ;
   }

   public void setgxTv_SdtTARTICU_Arturd1_SetNull( )
   {
      gxTv_SdtTARTICU_Arturd1_N = (byte)(1) ;
      gxTv_SdtTARTICU_Arturd1 = "" ;
      SetDirty("Arturd1");
   }

   public boolean getgxTv_SdtTARTICU_Arturd1_IsNull( )
   {
      return (gxTv_SdtTARTICU_Arturd1_N==1) ;
   }

   public String getgxTv_SdtTARTICU_Arturd2( )
   {
      return gxTv_SdtTARTICU_Arturd2 ;
   }

   public void setgxTv_SdtTARTICU_Arturd2( String value )
   {
      gxTv_SdtTARTICU_Arturd2_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arturd2");
      gxTv_SdtTARTICU_Arturd2 = value ;
   }

   public void setgxTv_SdtTARTICU_Arturd2_SetNull( )
   {
      gxTv_SdtTARTICU_Arturd2_N = (byte)(1) ;
      gxTv_SdtTARTICU_Arturd2 = "" ;
      SetDirty("Arturd2");
   }

   public boolean getgxTv_SdtTARTICU_Arturd2_IsNull( )
   {
      return (gxTv_SdtTARTICU_Arturd2_N==1) ;
   }

   public String getgxTv_SdtTARTICU_Arturd3( )
   {
      return gxTv_SdtTARTICU_Arturd3 ;
   }

   public void setgxTv_SdtTARTICU_Arturd3( String value )
   {
      gxTv_SdtTARTICU_Arturd3_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arturd3");
      gxTv_SdtTARTICU_Arturd3 = value ;
   }

   public void setgxTv_SdtTARTICU_Arturd3_SetNull( )
   {
      gxTv_SdtTARTICU_Arturd3_N = (byte)(1) ;
      gxTv_SdtTARTICU_Arturd3 = "" ;
      SetDirty("Arturd3");
   }

   public boolean getgxTv_SdtTARTICU_Arturd3_IsNull( )
   {
      return (gxTv_SdtTARTICU_Arturd3_N==1) ;
   }

   public short getgxTv_SdtTARTICU_Arturdp1( )
   {
      return gxTv_SdtTARTICU_Arturdp1 ;
   }

   public void setgxTv_SdtTARTICU_Arturdp1( short value )
   {
      gxTv_SdtTARTICU_Arturdp1_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arturdp1");
      gxTv_SdtTARTICU_Arturdp1 = value ;
   }

   public void setgxTv_SdtTARTICU_Arturdp1_SetNull( )
   {
      gxTv_SdtTARTICU_Arturdp1_N = (byte)(1) ;
      gxTv_SdtTARTICU_Arturdp1 = (short)(0) ;
      SetDirty("Arturdp1");
   }

   public boolean getgxTv_SdtTARTICU_Arturdp1_IsNull( )
   {
      return (gxTv_SdtTARTICU_Arturdp1_N==1) ;
   }

   public short getgxTv_SdtTARTICU_Arturdp2( )
   {
      return gxTv_SdtTARTICU_Arturdp2 ;
   }

   public void setgxTv_SdtTARTICU_Arturdp2( short value )
   {
      gxTv_SdtTARTICU_Arturdp2_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arturdp2");
      gxTv_SdtTARTICU_Arturdp2 = value ;
   }

   public void setgxTv_SdtTARTICU_Arturdp2_SetNull( )
   {
      gxTv_SdtTARTICU_Arturdp2_N = (byte)(1) ;
      gxTv_SdtTARTICU_Arturdp2 = (short)(0) ;
      SetDirty("Arturdp2");
   }

   public boolean getgxTv_SdtTARTICU_Arturdp2_IsNull( )
   {
      return (gxTv_SdtTARTICU_Arturdp2_N==1) ;
   }

   public short getgxTv_SdtTARTICU_Arturdp3( )
   {
      return gxTv_SdtTARTICU_Arturdp3 ;
   }

   public void setgxTv_SdtTARTICU_Arturdp3( short value )
   {
      gxTv_SdtTARTICU_Arturdp3_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arturdp3");
      gxTv_SdtTARTICU_Arturdp3 = value ;
   }

   public void setgxTv_SdtTARTICU_Arturdp3_SetNull( )
   {
      gxTv_SdtTARTICU_Arturdp3_N = (byte)(1) ;
      gxTv_SdtTARTICU_Arturdp3 = (short)(0) ;
      SetDirty("Arturdp3");
   }

   public boolean getgxTv_SdtTARTICU_Arturdp3_IsNull( )
   {
      return (gxTv_SdtTARTICU_Arturdp3_N==1) ;
   }

   public short getgxTv_SdtTARTICU_Artenccom( )
   {
      return gxTv_SdtTARTICU_Artenccom ;
   }

   public void setgxTv_SdtTARTICU_Artenccom( short value )
   {
      gxTv_SdtTARTICU_Artenccom_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artenccom");
      gxTv_SdtTARTICU_Artenccom = value ;
   }

   public void setgxTv_SdtTARTICU_Artenccom_SetNull( )
   {
      gxTv_SdtTARTICU_Artenccom_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artenccom = (short)(0) ;
      SetDirty("Artenccom");
   }

   public boolean getgxTv_SdtTARTICU_Artenccom_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artenccom_N==1) ;
   }

   public short getgxTv_SdtTARTICU_Artencanh( )
   {
      return gxTv_SdtTARTICU_Artencanh ;
   }

   public void setgxTv_SdtTARTICU_Artencanh( short value )
   {
      gxTv_SdtTARTICU_Artencanh_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artencanh");
      gxTv_SdtTARTICU_Artencanh = value ;
   }

   public void setgxTv_SdtTARTICU_Artencanh_SetNull( )
   {
      gxTv_SdtTARTICU_Artencanh_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artencanh = (short)(0) ;
      SetDirty("Artencanh");
   }

   public boolean getgxTv_SdtTARTICU_Artencanh_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artencanh_N==1) ;
   }

   public short getgxTv_SdtTARTICU_Artgraaca( )
   {
      return gxTv_SdtTARTICU_Artgraaca ;
   }

   public void setgxTv_SdtTARTICU_Artgraaca( short value )
   {
      gxTv_SdtTARTICU_Artgraaca_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artgraaca");
      gxTv_SdtTARTICU_Artgraaca = value ;
   }

   public void setgxTv_SdtTARTICU_Artgraaca_SetNull( )
   {
      gxTv_SdtTARTICU_Artgraaca_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artgraaca = (short)(0) ;
      SetDirty("Artgraaca");
   }

   public boolean getgxTv_SdtTARTICU_Artgraaca_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artgraaca_N==1) ;
   }

   public java.math.BigDecimal getgxTv_SdtTARTICU_Artrdoa( )
   {
      return gxTv_SdtTARTICU_Artrdoa ;
   }

   public void setgxTv_SdtTARTICU_Artrdoa( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_Artrdoa_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artrdoa");
      gxTv_SdtTARTICU_Artrdoa = value ;
   }

   public void setgxTv_SdtTARTICU_Artrdoa_SetNull( )
   {
      gxTv_SdtTARTICU_Artrdoa_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artrdoa = DecimalUtil.ZERO ;
      SetDirty("Artrdoa");
   }

   public boolean getgxTv_SdtTARTICU_Artrdoa_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artrdoa_N==1) ;
   }

   public java.math.BigDecimal getgxTv_SdtTARTICU_Artrdon( )
   {
      return gxTv_SdtTARTICU_Artrdon ;
   }

   public void setgxTv_SdtTARTICU_Artrdon( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_Artrdon_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artrdon");
      gxTv_SdtTARTICU_Artrdon = value ;
   }

   public void setgxTv_SdtTARTICU_Artrdon_SetNull( )
   {
      gxTv_SdtTARTICU_Artrdon_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artrdon = DecimalUtil.ZERO ;
      SetDirty("Artrdon");
   }

   public boolean getgxTv_SdtTARTICU_Artrdon_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artrdon_N==1) ;
   }

   public java.math.BigDecimal getgxTv_SdtTARTICU_Artfacabs( )
   {
      return gxTv_SdtTARTICU_Artfacabs ;
   }

   public void setgxTv_SdtTARTICU_Artfacabs( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_Artfacabs_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artfacabs");
      gxTv_SdtTARTICU_Artfacabs = value ;
   }

   public void setgxTv_SdtTARTICU_Artfacabs_SetNull( )
   {
      gxTv_SdtTARTICU_Artfacabs_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artfacabs = DecimalUtil.ZERO ;
      SetDirty("Artfacabs");
   }

   public boolean getgxTv_SdtTARTICU_Artfacabs_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artfacabs_N==1) ;
   }

   public String getgxTv_SdtTARTICU_Artple2( )
   {
      return gxTv_SdtTARTICU_Artple2 ;
   }

   public void setgxTv_SdtTARTICU_Artple2( String value )
   {
      gxTv_SdtTARTICU_Artple2_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artple2");
      gxTv_SdtTARTICU_Artple2 = value ;
   }

   public void setgxTv_SdtTARTICU_Artple2_SetNull( )
   {
      gxTv_SdtTARTICU_Artple2_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artple2 = "" ;
      SetDirty("Artple2");
   }

   public boolean getgxTv_SdtTARTICU_Artple2_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artple2_N==1) ;
   }

   public short getgxTv_SdtTARTICU_Artnumcor( )
   {
      return gxTv_SdtTARTICU_Artnumcor ;
   }

   public void setgxTv_SdtTARTICU_Artnumcor( short value )
   {
      gxTv_SdtTARTICU_Artnumcor_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artnumcor");
      gxTv_SdtTARTICU_Artnumcor = value ;
   }

   public void setgxTv_SdtTARTICU_Artnumcor_SetNull( )
   {
      gxTv_SdtTARTICU_Artnumcor_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artnumcor = (short)(0) ;
      SetDirty("Artnumcor");
   }

   public boolean getgxTv_SdtTARTICU_Artnumcor_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artnumcor_N==1) ;
   }

   public short getgxTv_SdtTARTICU_Artancsal1( )
   {
      return gxTv_SdtTARTICU_Artancsal1 ;
   }

   public void setgxTv_SdtTARTICU_Artancsal1( short value )
   {
      gxTv_SdtTARTICU_Artancsal1_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artancsal1");
      gxTv_SdtTARTICU_Artancsal1 = value ;
   }

   public void setgxTv_SdtTARTICU_Artancsal1_SetNull( )
   {
      gxTv_SdtTARTICU_Artancsal1_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artancsal1 = (short)(0) ;
      SetDirty("Artancsal1");
   }

   public boolean getgxTv_SdtTARTICU_Artancsal1_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artancsal1_N==1) ;
   }

   public short getgxTv_SdtTARTICU_Artancsal2( )
   {
      return gxTv_SdtTARTICU_Artancsal2 ;
   }

   public void setgxTv_SdtTARTICU_Artancsal2( short value )
   {
      gxTv_SdtTARTICU_Artancsal2_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artancsal2");
      gxTv_SdtTARTICU_Artancsal2 = value ;
   }

   public void setgxTv_SdtTARTICU_Artancsal2_SetNull( )
   {
      gxTv_SdtTARTICU_Artancsal2_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artancsal2 = (short)(0) ;
      SetDirty("Artancsal2");
   }

   public boolean getgxTv_SdtTARTICU_Artancsal2_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artancsal2_N==1) ;
   }

   public short getgxTv_SdtTARTICU_Artancsal3( )
   {
      return gxTv_SdtTARTICU_Artancsal3 ;
   }

   public void setgxTv_SdtTARTICU_Artancsal3( short value )
   {
      gxTv_SdtTARTICU_Artancsal3_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artancsal3");
      gxTv_SdtTARTICU_Artancsal3 = value ;
   }

   public void setgxTv_SdtTARTICU_Artancsal3_SetNull( )
   {
      gxTv_SdtTARTICU_Artancsal3_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artancsal3 = (short)(0) ;
      SetDirty("Artancsal3");
   }

   public boolean getgxTv_SdtTARTICU_Artancsal3_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artancsal3_N==1) ;
   }

   public short getgxTv_SdtTARTICU_Artgraaca2( )
   {
      return gxTv_SdtTARTICU_Artgraaca2 ;
   }

   public void setgxTv_SdtTARTICU_Artgraaca2( short value )
   {
      gxTv_SdtTARTICU_Artgraaca2_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artgraaca2");
      gxTv_SdtTARTICU_Artgraaca2 = value ;
   }

   public void setgxTv_SdtTARTICU_Artgraaca2_SetNull( )
   {
      gxTv_SdtTARTICU_Artgraaca2_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artgraaca2 = (short)(0) ;
      SetDirty("Artgraaca2");
   }

   public boolean getgxTv_SdtTARTICU_Artgraaca2_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artgraaca2_N==1) ;
   }

   public short getgxTv_SdtTARTICU_Artgracru2( )
   {
      return gxTv_SdtTARTICU_Artgracru2 ;
   }

   public void setgxTv_SdtTARTICU_Artgracru2( short value )
   {
      gxTv_SdtTARTICU_Artgracru2_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artgracru2");
      gxTv_SdtTARTICU_Artgracru2 = value ;
   }

   public void setgxTv_SdtTARTICU_Artgracru2_SetNull( )
   {
      gxTv_SdtTARTICU_Artgracru2_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artgracru2 = (short)(0) ;
      SetDirty("Artgracru2");
   }

   public boolean getgxTv_SdtTARTICU_Artgracru2_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artgracru2_N==1) ;
   }

   public short getgxTv_SdtTARTICU_Clascod( )
   {
      return gxTv_SdtTARTICU_Clascod ;
   }

   public void setgxTv_SdtTARTICU_Clascod( short value )
   {
      gxTv_SdtTARTICU_Clascod_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Clascod");
      gxTv_SdtTARTICU_Clascod = value ;
   }

   public void setgxTv_SdtTARTICU_Clascod_SetNull( )
   {
      gxTv_SdtTARTICU_Clascod_N = (byte)(1) ;
      gxTv_SdtTARTICU_Clascod = (short)(0) ;
      SetDirty("Clascod");
   }

   public boolean getgxTv_SdtTARTICU_Clascod_IsNull( )
   {
      return (gxTv_SdtTARTICU_Clascod_N==1) ;
   }

   public java.math.BigDecimal getgxTv_SdtTARTICU_Artpmppza( )
   {
      return gxTv_SdtTARTICU_Artpmppza ;
   }

   public void setgxTv_SdtTARTICU_Artpmppza( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_Artpmppza_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artpmppza");
      gxTv_SdtTARTICU_Artpmppza = value ;
   }

   public void setgxTv_SdtTARTICU_Artpmppza_SetNull( )
   {
      gxTv_SdtTARTICU_Artpmppza_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artpmppza = DecimalUtil.ZERO ;
      SetDirty("Artpmppza");
   }

   public boolean getgxTv_SdtTARTICU_Artpmppza_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artpmppza_N==1) ;
   }

   public java.util.Date getgxTv_SdtTARTICU_Artfeccre( )
   {
      return gxTv_SdtTARTICU_Artfeccre ;
   }

   public void setgxTv_SdtTARTICU_Artfeccre( java.util.Date value )
   {
      gxTv_SdtTARTICU_Artfeccre_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artfeccre");
      gxTv_SdtTARTICU_Artfeccre = value ;
   }

   public void setgxTv_SdtTARTICU_Artfeccre_SetNull( )
   {
      gxTv_SdtTARTICU_Artfeccre_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artfeccre = GXutil.nullDate() ;
      SetDirty("Artfeccre");
   }

   public boolean getgxTv_SdtTARTICU_Artfeccre_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artfeccre_N==1) ;
   }

   public String getgxTv_SdtTARTICU_Artusrcod( )
   {
      return gxTv_SdtTARTICU_Artusrcod ;
   }

   public void setgxTv_SdtTARTICU_Artusrcod( String value )
   {
      gxTv_SdtTARTICU_Artusrcod_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artusrcod");
      gxTv_SdtTARTICU_Artusrcod = value ;
   }

   public void setgxTv_SdtTARTICU_Artusrcod_SetNull( )
   {
      gxTv_SdtTARTICU_Artusrcod_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artusrcod = "" ;
      SetDirty("Artusrcod");
   }

   public boolean getgxTv_SdtTARTICU_Artusrcod_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artusrcod_N==1) ;
   }

   public java.util.Date getgxTv_SdtTARTICU_Artfecmod( )
   {
      return gxTv_SdtTARTICU_Artfecmod ;
   }

   public void setgxTv_SdtTARTICU_Artfecmod( java.util.Date value )
   {
      gxTv_SdtTARTICU_Artfecmod_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artfecmod");
      gxTv_SdtTARTICU_Artfecmod = value ;
   }

   public void setgxTv_SdtTARTICU_Artfecmod_SetNull( )
   {
      gxTv_SdtTARTICU_Artfecmod_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artfecmod = GXutil.nullDate() ;
      SetDirty("Artfecmod");
   }

   public boolean getgxTv_SdtTARTICU_Artfecmod_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artfecmod_N==1) ;
   }

   public String getgxTv_SdtTARTICU_Clasdsc( )
   {
      return gxTv_SdtTARTICU_Clasdsc ;
   }

   public void setgxTv_SdtTARTICU_Clasdsc( String value )
   {
      gxTv_SdtTARTICU_Clasdsc_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Clasdsc");
      gxTv_SdtTARTICU_Clasdsc = value ;
   }

   public void setgxTv_SdtTARTICU_Clasdsc_SetNull( )
   {
      gxTv_SdtTARTICU_Clasdsc_N = (byte)(1) ;
      gxTv_SdtTARTICU_Clasdsc = "" ;
      SetDirty("Clasdsc");
   }

   public boolean getgxTv_SdtTARTICU_Clasdsc_IsNull( )
   {
      return (gxTv_SdtTARTICU_Clasdsc_N==1) ;
   }

   public String getgxTv_SdtTARTICU_Artcomer( )
   {
      return gxTv_SdtTARTICU_Artcomer ;
   }

   public void setgxTv_SdtTARTICU_Artcomer( String value )
   {
      gxTv_SdtTARTICU_Artcomer_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artcomer");
      gxTv_SdtTARTICU_Artcomer = value ;
   }

   public void setgxTv_SdtTARTICU_Artcomer_SetNull( )
   {
      gxTv_SdtTARTICU_Artcomer_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artcomer = "" ;
      SetDirty("Artcomer");
   }

   public boolean getgxTv_SdtTARTICU_Artcomer_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artcomer_N==1) ;
   }

   public short getgxTv_SdtTARTICU_Clatubcod( )
   {
      return gxTv_SdtTARTICU_Clatubcod ;
   }

   public void setgxTv_SdtTARTICU_Clatubcod( short value )
   {
      gxTv_SdtTARTICU_Clatubcod_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Clatubcod");
      gxTv_SdtTARTICU_Clatubcod = value ;
   }

   public void setgxTv_SdtTARTICU_Clatubcod_SetNull( )
   {
      gxTv_SdtTARTICU_Clatubcod_N = (byte)(1) ;
      gxTv_SdtTARTICU_Clatubcod = (short)(0) ;
      SetDirty("Clatubcod");
   }

   public boolean getgxTv_SdtTARTICU_Clatubcod_IsNull( )
   {
      return (gxTv_SdtTARTICU_Clatubcod_N==1) ;
   }

   public String getgxTv_SdtTARTICU_Clatubdsc( )
   {
      return gxTv_SdtTARTICU_Clatubdsc ;
   }

   public void setgxTv_SdtTARTICU_Clatubdsc( String value )
   {
      gxTv_SdtTARTICU_Clatubdsc_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Clatubdsc");
      gxTv_SdtTARTICU_Clatubdsc = value ;
   }

   public void setgxTv_SdtTARTICU_Clatubdsc_SetNull( )
   {
      gxTv_SdtTARTICU_Clatubdsc_N = (byte)(1) ;
      gxTv_SdtTARTICU_Clatubdsc = "" ;
      SetDirty("Clatubdsc");
   }

   public boolean getgxTv_SdtTARTICU_Clatubdsc_IsNull( )
   {
      return (gxTv_SdtTARTICU_Clatubdsc_N==1) ;
   }

   public short getgxTv_SdtTARTICU_Clabolcod( )
   {
      return gxTv_SdtTARTICU_Clabolcod ;
   }

   public void setgxTv_SdtTARTICU_Clabolcod( short value )
   {
      gxTv_SdtTARTICU_Clabolcod_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Clabolcod");
      gxTv_SdtTARTICU_Clabolcod = value ;
   }

   public void setgxTv_SdtTARTICU_Clabolcod_SetNull( )
   {
      gxTv_SdtTARTICU_Clabolcod_N = (byte)(1) ;
      gxTv_SdtTARTICU_Clabolcod = (short)(0) ;
      SetDirty("Clabolcod");
   }

   public boolean getgxTv_SdtTARTICU_Clabolcod_IsNull( )
   {
      return (gxTv_SdtTARTICU_Clabolcod_N==1) ;
   }

   public String getgxTv_SdtTARTICU_Claboldsc( )
   {
      return gxTv_SdtTARTICU_Claboldsc ;
   }

   public void setgxTv_SdtTARTICU_Claboldsc( String value )
   {
      gxTv_SdtTARTICU_Claboldsc_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Claboldsc");
      gxTv_SdtTARTICU_Claboldsc = value ;
   }

   public void setgxTv_SdtTARTICU_Claboldsc_SetNull( )
   {
      gxTv_SdtTARTICU_Claboldsc_N = (byte)(1) ;
      gxTv_SdtTARTICU_Claboldsc = "" ;
      SetDirty("Claboldsc");
   }

   public boolean getgxTv_SdtTARTICU_Claboldsc_IsNull( )
   {
      return (gxTv_SdtTARTICU_Claboldsc_N==1) ;
   }

   public java.math.BigDecimal getgxTv_SdtTARTICU_Artrdocru1( )
   {
      return gxTv_SdtTARTICU_Artrdocru1 ;
   }

   public void setgxTv_SdtTARTICU_Artrdocru1( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_Artrdocru1_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artrdocru1");
      gxTv_SdtTARTICU_Artrdocru1 = value ;
   }

   public void setgxTv_SdtTARTICU_Artrdocru1_SetNull( )
   {
      gxTv_SdtTARTICU_Artrdocru1_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artrdocru1 = DecimalUtil.ZERO ;
      SetDirty("Artrdocru1");
   }

   public boolean getgxTv_SdtTARTICU_Artrdocru1_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artrdocru1_N==1) ;
   }

   public java.math.BigDecimal getgxTv_SdtTARTICU_Artrdocru2( )
   {
      return gxTv_SdtTARTICU_Artrdocru2 ;
   }

   public void setgxTv_SdtTARTICU_Artrdocru2( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_Artrdocru2_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artrdocru2");
      gxTv_SdtTARTICU_Artrdocru2 = value ;
   }

   public void setgxTv_SdtTARTICU_Artrdocru2_SetNull( )
   {
      gxTv_SdtTARTICU_Artrdocru2_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artrdocru2 = DecimalUtil.ZERO ;
      SetDirty("Artrdocru2");
   }

   public boolean getgxTv_SdtTARTICU_Artrdocru2_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artrdocru2_N==1) ;
   }

   public String getgxTv_SdtTARTICU_Artnmtr( )
   {
      return gxTv_SdtTARTICU_Artnmtr ;
   }

   public void setgxTv_SdtTARTICU_Artnmtr( String value )
   {
      gxTv_SdtTARTICU_Artnmtr_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artnmtr");
      gxTv_SdtTARTICU_Artnmtr = value ;
   }

   public void setgxTv_SdtTARTICU_Artnmtr_SetNull( )
   {
      gxTv_SdtTARTICU_Artnmtr_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artnmtr = "" ;
      SetDirty("Artnmtr");
   }

   public boolean getgxTv_SdtTARTICU_Artnmtr_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artnmtr_N==1) ;
   }

   public java.math.BigDecimal getgxTv_SdtTARTICU_Artlu( )
   {
      return gxTv_SdtTARTICU_Artlu ;
   }

   public void setgxTv_SdtTARTICU_Artlu( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_Artlu_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artlu");
      gxTv_SdtTARTICU_Artlu = value ;
   }

   public void setgxTv_SdtTARTICU_Artlu_SetNull( )
   {
      gxTv_SdtTARTICU_Artlu_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artlu = DecimalUtil.ZERO ;
      SetDirty("Artlu");
   }

   public boolean getgxTv_SdtTARTICU_Artlu_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artlu_N==1) ;
   }

   public short getgxTv_SdtTARTICU_Artrb( )
   {
      return gxTv_SdtTARTICU_Artrb ;
   }

   public void setgxTv_SdtTARTICU_Artrb( short value )
   {
      gxTv_SdtTARTICU_Artrb_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artrb");
      gxTv_SdtTARTICU_Artrb = value ;
   }

   public void setgxTv_SdtTARTICU_Artrb_SetNull( )
   {
      gxTv_SdtTARTICU_Artrb_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artrb = (short)(0) ;
      SetDirty("Artrb");
   }

   public boolean getgxTv_SdtTARTICU_Artrb_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artrb_N==1) ;
   }

   public short getgxTv_SdtTARTICU_Artpelanh( )
   {
      return gxTv_SdtTARTICU_Artpelanh ;
   }

   public void setgxTv_SdtTARTICU_Artpelanh( short value )
   {
      gxTv_SdtTARTICU_Artpelanh_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artpelanh");
      gxTv_SdtTARTICU_Artpelanh = value ;
   }

   public void setgxTv_SdtTARTICU_Artpelanh_SetNull( )
   {
      gxTv_SdtTARTICU_Artpelanh_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artpelanh = (short)(0) ;
      SetDirty("Artpelanh");
   }

   public boolean getgxTv_SdtTARTICU_Artpelanh_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artpelanh_N==1) ;
   }

   public short getgxTv_SdtTARTICU_Artgrm2sc( )
   {
      return gxTv_SdtTARTICU_Artgrm2sc ;
   }

   public void setgxTv_SdtTARTICU_Artgrm2sc( short value )
   {
      gxTv_SdtTARTICU_Artgrm2sc_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artgrm2sc");
      gxTv_SdtTARTICU_Artgrm2sc = value ;
   }

   public void setgxTv_SdtTARTICU_Artgrm2sc_SetNull( )
   {
      gxTv_SdtTARTICU_Artgrm2sc_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artgrm2sc = (short)(0) ;
      SetDirty("Artgrm2sc");
   }

   public boolean getgxTv_SdtTARTICU_Artgrm2sc_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artgrm2sc_N==1) ;
   }

   public short getgxTv_SdtTARTICU_Artpmlsc( )
   {
      return gxTv_SdtTARTICU_Artpmlsc ;
   }

   public void setgxTv_SdtTARTICU_Artpmlsc( short value )
   {
      gxTv_SdtTARTICU_Artpmlsc_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artpmlsc");
      gxTv_SdtTARTICU_Artpmlsc = value ;
   }

   public void setgxTv_SdtTARTICU_Artpmlsc_SetNull( )
   {
      gxTv_SdtTARTICU_Artpmlsc_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artpmlsc = (short)(0) ;
      SetDirty("Artpmlsc");
   }

   public boolean getgxTv_SdtTARTICU_Artpmlsc_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artpmlsc_N==1) ;
   }

   public short getgxTv_SdtTARTICU_Artancsc( )
   {
      return gxTv_SdtTARTICU_Artancsc ;
   }

   public void setgxTv_SdtTARTICU_Artancsc( short value )
   {
      gxTv_SdtTARTICU_Artancsc_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artancsc");
      gxTv_SdtTARTICU_Artancsc = value ;
   }

   public void setgxTv_SdtTARTICU_Artancsc_SetNull( )
   {
      gxTv_SdtTARTICU_Artancsc_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artancsc = (short)(0) ;
      SetDirty("Artancsc");
   }

   public boolean getgxTv_SdtTARTICU_Artancsc_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artancsc_N==1) ;
   }

   public short getgxTv_SdtTARTICU_Artpmlcru( )
   {
      return gxTv_SdtTARTICU_Artpmlcru ;
   }

   public void setgxTv_SdtTARTICU_Artpmlcru( short value )
   {
      gxTv_SdtTARTICU_Artpmlcru_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artpmlcru");
      gxTv_SdtTARTICU_Artpmlcru = value ;
   }

   public void setgxTv_SdtTARTICU_Artpmlcru_SetNull( )
   {
      gxTv_SdtTARTICU_Artpmlcru_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artpmlcru = (short)(0) ;
      SetDirty("Artpmlcru");
   }

   public boolean getgxTv_SdtTARTICU_Artpmlcru_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artpmlcru_N==1) ;
   }

   public java.math.BigDecimal getgxTv_SdtTARTICU_Artrdtsc( )
   {
      return gxTv_SdtTARTICU_Artrdtsc ;
   }

   public void setgxTv_SdtTARTICU_Artrdtsc( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_Artrdtsc_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artrdtsc");
      gxTv_SdtTARTICU_Artrdtsc = value ;
   }

   public void setgxTv_SdtTARTICU_Artrdtsc_SetNull( )
   {
      gxTv_SdtTARTICU_Artrdtsc_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artrdtsc = DecimalUtil.ZERO ;
      SetDirty("Artrdtsc");
   }

   public boolean getgxTv_SdtTARTICU_Artrdtsc_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artrdtsc_N==1) ;
   }

   public String getgxTv_SdtTARTICU_Artund( )
   {
      return gxTv_SdtTARTICU_Artund ;
   }

   public void setgxTv_SdtTARTICU_Artund( String value )
   {
      gxTv_SdtTARTICU_Artund_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artund");
      gxTv_SdtTARTICU_Artund = value ;
   }

   public void setgxTv_SdtTARTICU_Artund_SetNull( )
   {
      gxTv_SdtTARTICU_Artund_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artund = "" ;
      SetDirty("Artund");
   }

   public boolean getgxTv_SdtTARTICU_Artund_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artund_N==1) ;
   }

   public String getgxTv_SdtTARTICU_Artblo( )
   {
      return gxTv_SdtTARTICU_Artblo ;
   }

   public void setgxTv_SdtTARTICU_Artblo( String value )
   {
      gxTv_SdtTARTICU_Artblo_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artblo");
      gxTv_SdtTARTICU_Artblo = value ;
   }

   public void setgxTv_SdtTARTICU_Artblo_SetNull( )
   {
      gxTv_SdtTARTICU_Artblo_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artblo = "" ;
      SetDirty("Artblo");
   }

   public boolean getgxTv_SdtTARTICU_Artblo_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artblo_N==1) ;
   }

   public byte getgxTv_SdtTARTICU_Artcla( )
   {
      return gxTv_SdtTARTICU_Artcla ;
   }

   public void setgxTv_SdtTARTICU_Artcla( byte value )
   {
      gxTv_SdtTARTICU_Artcla_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artcla");
      gxTv_SdtTARTICU_Artcla = value ;
   }

   public void setgxTv_SdtTARTICU_Artcla_SetNull( )
   {
      gxTv_SdtTARTICU_Artcla_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artcla = (byte)(0) ;
      SetDirty("Artcla");
   }

   public boolean getgxTv_SdtTARTICU_Artcla_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artcla_N==1) ;
   }

   public String getgxTv_SdtTARTICU_Tipartdsc2( )
   {
      return gxTv_SdtTARTICU_Tipartdsc2 ;
   }

   public void setgxTv_SdtTARTICU_Tipartdsc2( String value )
   {
      gxTv_SdtTARTICU_Tipartdsc2_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Tipartdsc2");
      gxTv_SdtTARTICU_Tipartdsc2 = value ;
   }

   public void setgxTv_SdtTARTICU_Tipartdsc2_SetNull( )
   {
      gxTv_SdtTARTICU_Tipartdsc2_N = (byte)(1) ;
      gxTv_SdtTARTICU_Tipartdsc2 = "" ;
      SetDirty("Tipartdsc2");
   }

   public boolean getgxTv_SdtTARTICU_Tipartdsc2_IsNull( )
   {
      return (gxTv_SdtTARTICU_Tipartdsc2_N==1) ;
   }

   public java.math.BigDecimal getgxTv_SdtTARTICU_Artfabsh( )
   {
      return gxTv_SdtTARTICU_Artfabsh ;
   }

   public void setgxTv_SdtTARTICU_Artfabsh( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_Artfabsh_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artfabsh");
      gxTv_SdtTARTICU_Artfabsh = value ;
   }

   public void setgxTv_SdtTARTICU_Artfabsh_SetNull( )
   {
      gxTv_SdtTARTICU_Artfabsh_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artfabsh = DecimalUtil.ZERO ;
      SetDirty("Artfabsh");
   }

   public boolean getgxTv_SdtTARTICU_Artfabsh_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artfabsh_N==1) ;
   }

   public java.math.BigDecimal getgxTv_SdtTARTICU_Artfabst( )
   {
      return gxTv_SdtTARTICU_Artfabst ;
   }

   public void setgxTv_SdtTARTICU_Artfabst( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_Artfabst_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artfabst");
      gxTv_SdtTARTICU_Artfabst = value ;
   }

   public void setgxTv_SdtTARTICU_Artfabst_SetNull( )
   {
      gxTv_SdtTARTICU_Artfabst_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artfabst = DecimalUtil.ZERO ;
      SetDirty("Artfabst");
   }

   public boolean getgxTv_SdtTARTICU_Artfabst_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artfabst_N==1) ;
   }

   public byte getgxTv_SdtTARTICU_Artnprog( )
   {
      return gxTv_SdtTARTICU_Artnprog ;
   }

   public void setgxTv_SdtTARTICU_Artnprog( byte value )
   {
      gxTv_SdtTARTICU_Artnprog_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artnprog");
      gxTv_SdtTARTICU_Artnprog = value ;
   }

   public void setgxTv_SdtTARTICU_Artnprog_SetNull( )
   {
      gxTv_SdtTARTICU_Artnprog_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artnprog = (byte)(0) ;
      SetDirty("Artnprog");
   }

   public boolean getgxTv_SdtTARTICU_Artnprog_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artnprog_N==1) ;
   }

   public short getgxTv_SdtTARTICU_Artvbd( )
   {
      return gxTv_SdtTARTICU_Artvbd ;
   }

   public void setgxTv_SdtTARTICU_Artvbd( short value )
   {
      gxTv_SdtTARTICU_Artvbd_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artvbd");
      gxTv_SdtTARTICU_Artvbd = value ;
   }

   public void setgxTv_SdtTARTICU_Artvbd_SetNull( )
   {
      gxTv_SdtTARTICU_Artvbd_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artvbd = (short)(0) ;
      SetDirty("Artvbd");
   }

   public boolean getgxTv_SdtTARTICU_Artvbd_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artvbd_N==1) ;
   }

   public short getgxTv_SdtTARTICU_Artvbn( )
   {
      return gxTv_SdtTARTICU_Artvbn ;
   }

   public void setgxTv_SdtTARTICU_Artvbn( short value )
   {
      gxTv_SdtTARTICU_Artvbn_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artvbn");
      gxTv_SdtTARTICU_Artvbn = value ;
   }

   public void setgxTv_SdtTARTICU_Artvbn_SetNull( )
   {
      gxTv_SdtTARTICU_Artvbn_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artvbn = (short)(0) ;
      SetDirty("Artvbn");
   }

   public boolean getgxTv_SdtTARTICU_Artvbn_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artvbn_N==1) ;
   }

   public short getgxTv_SdtTARTICU_Artab( )
   {
      return gxTv_SdtTARTICU_Artab ;
   }

   public void setgxTv_SdtTARTICU_Artab( short value )
   {
      gxTv_SdtTARTICU_Artab_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artab");
      gxTv_SdtTARTICU_Artab = value ;
   }

   public void setgxTv_SdtTARTICU_Artab_SetNull( )
   {
      gxTv_SdtTARTICU_Artab_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artab = (short)(0) ;
      SetDirty("Artab");
   }

   public boolean getgxTv_SdtTARTICU_Artab_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artab_N==1) ;
   }

   public String getgxTv_SdtTARTICU_Artobsgrm( )
   {
      return gxTv_SdtTARTICU_Artobsgrm ;
   }

   public void setgxTv_SdtTARTICU_Artobsgrm( String value )
   {
      gxTv_SdtTARTICU_Artobsgrm_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artobsgrm");
      gxTv_SdtTARTICU_Artobsgrm = value ;
   }

   public void setgxTv_SdtTARTICU_Artobsgrm_SetNull( )
   {
      gxTv_SdtTARTICU_Artobsgrm_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artobsgrm = "" ;
      SetDirty("Artobsgrm");
   }

   public boolean getgxTv_SdtTARTICU_Artobsgrm_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artobsgrm_N==1) ;
   }

   public String getgxTv_SdtTARTICU_Artobsanc( )
   {
      return gxTv_SdtTARTICU_Artobsanc ;
   }

   public void setgxTv_SdtTARTICU_Artobsanc( String value )
   {
      gxTv_SdtTARTICU_Artobsanc_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artobsanc");
      gxTv_SdtTARTICU_Artobsanc = value ;
   }

   public void setgxTv_SdtTARTICU_Artobsanc_SetNull( )
   {
      gxTv_SdtTARTICU_Artobsanc_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artobsanc = "" ;
      SetDirty("Artobsanc");
   }

   public boolean getgxTv_SdtTARTICU_Artobsanc_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artobsanc_N==1) ;
   }

   public String getgxTv_SdtTARTICU_Artcdb( )
   {
      return gxTv_SdtTARTICU_Artcdb ;
   }

   public void setgxTv_SdtTARTICU_Artcdb( String value )
   {
      gxTv_SdtTARTICU_Artcdb_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artcdb");
      gxTv_SdtTARTICU_Artcdb = value ;
   }

   public void setgxTv_SdtTARTICU_Artcdb_SetNull( )
   {
      gxTv_SdtTARTICU_Artcdb_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artcdb = "" ;
      SetDirty("Artcdb");
   }

   public boolean getgxTv_SdtTARTICU_Artcdb_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artcdb_N==1) ;
   }

   public String getgxTv_SdtTARTICU_Artgalga( )
   {
      return gxTv_SdtTARTICU_Artgalga ;
   }

   public void setgxTv_SdtTARTICU_Artgalga( String value )
   {
      gxTv_SdtTARTICU_Artgalga_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artgalga");
      gxTv_SdtTARTICU_Artgalga = value ;
   }

   public void setgxTv_SdtTARTICU_Artgalga_SetNull( )
   {
      gxTv_SdtTARTICU_Artgalga_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artgalga = "" ;
      SetDirty("Artgalga");
   }

   public boolean getgxTv_SdtTARTICU_Artgalga_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artgalga_N==1) ;
   }

   public String getgxTv_SdtTARTICU_Artplatina( )
   {
      return gxTv_SdtTARTICU_Artplatina ;
   }

   public void setgxTv_SdtTARTICU_Artplatina( String value )
   {
      gxTv_SdtTARTICU_Artplatina_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artplatina");
      gxTv_SdtTARTICU_Artplatina = value ;
   }

   public void setgxTv_SdtTARTICU_Artplatina_SetNull( )
   {
      gxTv_SdtTARTICU_Artplatina_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artplatina = "" ;
      SetDirty("Artplatina");
   }

   public boolean getgxTv_SdtTARTICU_Artplatina_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artplatina_N==1) ;
   }

   public String getgxTv_SdtTARTICU_Artpgd( )
   {
      return gxTv_SdtTARTICU_Artpgd ;
   }

   public void setgxTv_SdtTARTICU_Artpgd( String value )
   {
      gxTv_SdtTARTICU_Artpgd_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artpgd");
      gxTv_SdtTARTICU_Artpgd = value ;
   }

   public void setgxTv_SdtTARTICU_Artpgd_SetNull( )
   {
      gxTv_SdtTARTICU_Artpgd_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artpgd = "" ;
      SetDirty("Artpgd");
   }

   public boolean getgxTv_SdtTARTICU_Artpgd_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artpgd_N==1) ;
   }

   public short getgxTv_SdtTARTICU_Artth( )
   {
      return gxTv_SdtTARTICU_Artth ;
   }

   public void setgxTv_SdtTARTICU_Artth( short value )
   {
      gxTv_SdtTARTICU_Artth_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artth");
      gxTv_SdtTARTICU_Artth = value ;
   }

   public void setgxTv_SdtTARTICU_Artth_SetNull( )
   {
      gxTv_SdtTARTICU_Artth_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artth = (short)(0) ;
      SetDirty("Artth");
   }

   public boolean getgxTv_SdtTARTICU_Artth_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artth_N==1) ;
   }

   public String getgxTv_SdtTARTICU_Artthn( )
   {
      return gxTv_SdtTARTICU_Artthn ;
   }

   public void setgxTv_SdtTARTICU_Artthn( String value )
   {
      gxTv_SdtTARTICU_Artthn_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artthn");
      gxTv_SdtTARTICU_Artthn = value ;
   }

   public void setgxTv_SdtTARTICU_Artthn_SetNull( )
   {
      gxTv_SdtTARTICU_Artthn_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artthn = "" ;
      SetDirty("Artthn");
   }

   public boolean getgxTv_SdtTARTICU_Artthn_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artthn_N==1) ;
   }

   public short getgxTv_SdtTARTICU_Art_cd( )
   {
      return gxTv_SdtTARTICU_Art_cd ;
   }

   public void setgxTv_SdtTARTICU_Art_cd( short value )
   {
      gxTv_SdtTARTICU_Art_cd_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Art_cd");
      gxTv_SdtTARTICU_Art_cd = value ;
   }

   public void setgxTv_SdtTARTICU_Art_cd_SetNull( )
   {
      gxTv_SdtTARTICU_Art_cd_N = (byte)(1) ;
      gxTv_SdtTARTICU_Art_cd = (short)(0) ;
      SetDirty("Art_cd");
   }

   public boolean getgxTv_SdtTARTICU_Art_cd_IsNull( )
   {
      return (gxTv_SdtTARTICU_Art_cd_N==1) ;
   }

   public String getgxTv_SdtTARTICU_Art_dc( )
   {
      return gxTv_SdtTARTICU_Art_dc ;
   }

   public void setgxTv_SdtTARTICU_Art_dc( String value )
   {
      gxTv_SdtTARTICU_Art_dc_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Art_dc");
      gxTv_SdtTARTICU_Art_dc = value ;
   }

   public void setgxTv_SdtTARTICU_Art_dc_SetNull( )
   {
      gxTv_SdtTARTICU_Art_dc_N = (byte)(1) ;
      gxTv_SdtTARTICU_Art_dc = "" ;
      SetDirty("Art_dc");
   }

   public boolean getgxTv_SdtTARTICU_Art_dc_IsNull( )
   {
      return (gxTv_SdtTARTICU_Art_dc_N==1) ;
   }

   public short getgxTv_SdtTARTICU_Arthilos( )
   {
      return gxTv_SdtTARTICU_Arthilos ;
   }

   public void setgxTv_SdtTARTICU_Arthilos( short value )
   {
      gxTv_SdtTARTICU_Arthilos_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arthilos");
      gxTv_SdtTARTICU_Arthilos = value ;
   }

   public void setgxTv_SdtTARTICU_Arthilos_SetNull( )
   {
      gxTv_SdtTARTICU_Arthilos_N = (byte)(1) ;
      gxTv_SdtTARTICU_Arthilos = (short)(0) ;
      SetDirty("Arthilos");
   }

   public boolean getgxTv_SdtTARTICU_Arthilos_IsNull( )
   {
      return (gxTv_SdtTARTICU_Arthilos_N==1) ;
   }

   public short getgxTv_SdtTARTICU_Artpasad( )
   {
      return gxTv_SdtTARTICU_Artpasad ;
   }

   public void setgxTv_SdtTARTICU_Artpasad( short value )
   {
      gxTv_SdtTARTICU_Artpasad_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artpasad");
      gxTv_SdtTARTICU_Artpasad = value ;
   }

   public void setgxTv_SdtTARTICU_Artpasad_SetNull( )
   {
      gxTv_SdtTARTICU_Artpasad_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artpasad = (short)(0) ;
      SetDirty("Artpasad");
   }

   public boolean getgxTv_SdtTARTICU_Artpasad_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artpasad_N==1) ;
   }

   public short getgxTv_SdtTARTICU_Artancc( )
   {
      return gxTv_SdtTARTICU_Artancc ;
   }

   public void setgxTv_SdtTARTICU_Artancc( short value )
   {
      gxTv_SdtTARTICU_Artancc_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artancc");
      gxTv_SdtTARTICU_Artancc = value ;
   }

   public void setgxTv_SdtTARTICU_Artancc_SetNull( )
   {
      gxTv_SdtTARTICU_Artancc_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artancc = (short)(0) ;
      SetDirty("Artancc");
   }

   public boolean getgxTv_SdtTARTICU_Artancc_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artancc_N==1) ;
   }

   public short getgxTv_SdtTARTICU_Artgrm2c( )
   {
      return gxTv_SdtTARTICU_Artgrm2c ;
   }

   public void setgxTv_SdtTARTICU_Artgrm2c( short value )
   {
      gxTv_SdtTARTICU_Artgrm2c_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artgrm2c");
      gxTv_SdtTARTICU_Artgrm2c = value ;
   }

   public void setgxTv_SdtTARTICU_Artgrm2c_SetNull( )
   {
      gxTv_SdtTARTICU_Artgrm2c_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artgrm2c = (short)(0) ;
      SetDirty("Artgrm2c");
   }

   public boolean getgxTv_SdtTARTICU_Artgrm2c_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artgrm2c_N==1) ;
   }

   public java.math.BigDecimal getgxTv_SdtTARTICU_Artrdoc( )
   {
      return gxTv_SdtTARTICU_Artrdoc ;
   }

   public void setgxTv_SdtTARTICU_Artrdoc( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_Artrdoc_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artrdoc");
      gxTv_SdtTARTICU_Artrdoc = value ;
   }

   public void setgxTv_SdtTARTICU_Artrdoc_SetNull( )
   {
      gxTv_SdtTARTICU_Artrdoc_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artrdoc = DecimalUtil.ZERO ;
      SetDirty("Artrdoc");
   }

   public boolean getgxTv_SdtTARTICU_Artrdoc_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artrdoc_N==1) ;
   }

   public int getgxTv_SdtTARTICU_Artacafor( )
   {
      return gxTv_SdtTARTICU_Artacafor ;
   }

   public void setgxTv_SdtTARTICU_Artacafor( int value )
   {
      gxTv_SdtTARTICU_Artacafor_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artacafor");
      gxTv_SdtTARTICU_Artacafor = value ;
   }

   public void setgxTv_SdtTARTICU_Artacafor_SetNull( )
   {
      gxTv_SdtTARTICU_Artacafor_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artacafor = 0 ;
      SetDirty("Artacafor");
   }

   public boolean getgxTv_SdtTARTICU_Artacafor_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artacafor_N==1) ;
   }

   public String getgxTv_SdtTARTICU_Artanu( )
   {
      return gxTv_SdtTARTICU_Artanu ;
   }

   public void setgxTv_SdtTARTICU_Artanu( String value )
   {
      gxTv_SdtTARTICU_Artanu_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artanu");
      gxTv_SdtTARTICU_Artanu = value ;
   }

   public void setgxTv_SdtTARTICU_Artanu_SetNull( )
   {
      gxTv_SdtTARTICU_Artanu_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artanu = "" ;
      SetDirty("Artanu");
   }

   public boolean getgxTv_SdtTARTICU_Artanu_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artanu_N==1) ;
   }

   public java.math.BigDecimal getgxTv_SdtTARTICU_Artfacuti( )
   {
      return gxTv_SdtTARTICU_Artfacuti ;
   }

   public void setgxTv_SdtTARTICU_Artfacuti( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_Artfacuti_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artfacuti");
      gxTv_SdtTARTICU_Artfacuti = value ;
   }

   public void setgxTv_SdtTARTICU_Artfacuti_SetNull( )
   {
      gxTv_SdtTARTICU_Artfacuti_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artfacuti = DecimalUtil.ZERO ;
      SetDirty("Artfacuti");
   }

   public boolean getgxTv_SdtTARTICU_Artfacuti_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artfacuti_N==1) ;
   }

   public int getgxTv_SdtTARTICU_Artnumtip( )
   {
      return gxTv_SdtTARTICU_Artnumtip ;
   }

   public void setgxTv_SdtTARTICU_Artnumtip( int value )
   {
      gxTv_SdtTARTICU_Artnumtip_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artnumtip");
      gxTv_SdtTARTICU_Artnumtip = value ;
   }

   public void setgxTv_SdtTARTICU_Artnumtip_SetNull( )
   {
      gxTv_SdtTARTICU_Artnumtip_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artnumtip = 0 ;
      SetDirty("Artnumtip");
   }

   public boolean getgxTv_SdtTARTICU_Artnumtip_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artnumtip_N==1) ;
   }

   public byte getgxTv_SdtTARTICU_Artmt( )
   {
      return gxTv_SdtTARTICU_Artmt ;
   }

   public void setgxTv_SdtTARTICU_Artmt( byte value )
   {
      gxTv_SdtTARTICU_Artmt_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artmt");
      gxTv_SdtTARTICU_Artmt = value ;
   }

   public void setgxTv_SdtTARTICU_Artmt_SetNull( )
   {
      gxTv_SdtTARTICU_Artmt_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artmt = (byte)(0) ;
      SetDirty("Artmt");
   }

   public boolean getgxTv_SdtTARTICU_Artmt_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artmt_N==1) ;
   }

   public byte getgxTv_SdtTARTICU_Arttrabs( )
   {
      return gxTv_SdtTARTICU_Arttrabs ;
   }

   public void setgxTv_SdtTARTICU_Arttrabs( byte value )
   {
      gxTv_SdtTARTICU_Arttrabs_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arttrabs");
      gxTv_SdtTARTICU_Arttrabs = value ;
   }

   public void setgxTv_SdtTARTICU_Arttrabs_SetNull( )
   {
      gxTv_SdtTARTICU_Arttrabs_N = (byte)(1) ;
      gxTv_SdtTARTICU_Arttrabs = (byte)(0) ;
      SetDirty("Arttrabs");
   }

   public boolean getgxTv_SdtTARTICU_Arttrabs_IsNull( )
   {
      return (gxTv_SdtTARTICU_Arttrabs_N==1) ;
   }

   public java.math.BigDecimal getgxTv_SdtTARTICU_Artkgmn( )
   {
      return gxTv_SdtTARTICU_Artkgmn ;
   }

   public void setgxTv_SdtTARTICU_Artkgmn( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_Artkgmn_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artkgmn");
      gxTv_SdtTARTICU_Artkgmn = value ;
   }

   public void setgxTv_SdtTARTICU_Artkgmn_SetNull( )
   {
      gxTv_SdtTARTICU_Artkgmn_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artkgmn = DecimalUtil.ZERO ;
      SetDirty("Artkgmn");
   }

   public boolean getgxTv_SdtTARTICU_Artkgmn_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artkgmn_N==1) ;
   }

   public String getgxTv_SdtTARTICU_Artacamar( )
   {
      return gxTv_SdtTARTICU_Artacamar ;
   }

   public void setgxTv_SdtTARTICU_Artacamar( String value )
   {
      gxTv_SdtTARTICU_Artacamar_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artacamar");
      gxTv_SdtTARTICU_Artacamar = value ;
   }

   public void setgxTv_SdtTARTICU_Artacamar_SetNull( )
   {
      gxTv_SdtTARTICU_Artacamar_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artacamar = "" ;
      SetDirty("Artacamar");
   }

   public boolean getgxTv_SdtTARTICU_Artacamar_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artacamar_N==1) ;
   }

   public String getgxTv_SdtTARTICU_Artacabak( )
   {
      return gxTv_SdtTARTICU_Artacabak ;
   }

   public void setgxTv_SdtTARTICU_Artacabak( String value )
   {
      gxTv_SdtTARTICU_Artacabak_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artacabak");
      gxTv_SdtTARTICU_Artacabak = value ;
   }

   public void setgxTv_SdtTARTICU_Artacabak_SetNull( )
   {
      gxTv_SdtTARTICU_Artacabak_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artacabak = "" ;
      SetDirty("Artacabak");
   }

   public boolean getgxTv_SdtTARTICU_Artacabak_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artacabak_N==1) ;
   }

   public java.math.BigDecimal getgxTv_SdtTARTICU_Artelganc( )
   {
      return gxTv_SdtTARTICU_Artelganc ;
   }

   public void setgxTv_SdtTARTICU_Artelganc( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_Artelganc_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artelganc");
      gxTv_SdtTARTICU_Artelganc = value ;
   }

   public void setgxTv_SdtTARTICU_Artelganc_SetNull( )
   {
      gxTv_SdtTARTICU_Artelganc_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artelganc = DecimalUtil.ZERO ;
      SetDirty("Artelganc");
   }

   public boolean getgxTv_SdtTARTICU_Artelganc_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artelganc_N==1) ;
   }

   public java.math.BigDecimal getgxTv_SdtTARTICU_Artelglar( )
   {
      return gxTv_SdtTARTICU_Artelglar ;
   }

   public void setgxTv_SdtTARTICU_Artelglar( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_Artelglar_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artelglar");
      gxTv_SdtTARTICU_Artelglar = value ;
   }

   public void setgxTv_SdtTARTICU_Artelglar_SetNull( )
   {
      gxTv_SdtTARTICU_Artelglar_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artelglar = DecimalUtil.ZERO ;
      SetDirty("Artelglar");
   }

   public boolean getgxTv_SdtTARTICU_Artelglar_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artelglar_N==1) ;
   }

   public java.math.BigDecimal getgxTv_SdtTARTICU_Artrdocru( )
   {
      return gxTv_SdtTARTICU_Artrdocru ;
   }

   public void setgxTv_SdtTARTICU_Artrdocru( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_Artrdocru_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artrdocru");
      gxTv_SdtTARTICU_Artrdocru = value ;
   }

   public void setgxTv_SdtTARTICU_Artrdocru_SetNull( )
   {
      gxTv_SdtTARTICU_Artrdocru_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artrdocru = DecimalUtil.ZERO ;
      SetDirty("Artrdocru");
   }

   public boolean getgxTv_SdtTARTICU_Artrdocru_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artrdocru_N==1) ;
   }

   public java.math.BigDecimal getgxTv_SdtTARTICU_Artenclarg( )
   {
      return gxTv_SdtTARTICU_Artenclarg ;
   }

   public void setgxTv_SdtTARTICU_Artenclarg( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_Artenclarg_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artenclarg");
      gxTv_SdtTARTICU_Artenclarg = value ;
   }

   public void setgxTv_SdtTARTICU_Artenclarg_SetNull( )
   {
      gxTv_SdtTARTICU_Artenclarg_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artenclarg = DecimalUtil.ZERO ;
      SetDirty("Artenclarg");
   }

   public boolean getgxTv_SdtTARTICU_Artenclarg_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artenclarg_N==1) ;
   }

   public java.math.BigDecimal getgxTv_SdtTARTICU_Artencanc( )
   {
      return gxTv_SdtTARTICU_Artencanc ;
   }

   public void setgxTv_SdtTARTICU_Artencanc( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_Artencanc_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artencanc");
      gxTv_SdtTARTICU_Artencanc = value ;
   }

   public void setgxTv_SdtTARTICU_Artencanc_SetNull( )
   {
      gxTv_SdtTARTICU_Artencanc_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artencanc = DecimalUtil.ZERO ;
      SetDirty("Artencanc");
   }

   public boolean getgxTv_SdtTARTICU_Artencanc_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artencanc_N==1) ;
   }

   public java.math.BigDecimal getgxTv_SdtTARTICU_Artrdto4( )
   {
      return gxTv_SdtTARTICU_Artrdto4 ;
   }

   public void setgxTv_SdtTARTICU_Artrdto4( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_Artrdto4_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artrdto4");
      gxTv_SdtTARTICU_Artrdto4 = value ;
   }

   public void setgxTv_SdtTARTICU_Artrdto4_SetNull( )
   {
      gxTv_SdtTARTICU_Artrdto4_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artrdto4 = DecimalUtil.ZERO ;
      SetDirty("Artrdto4");
   }

   public boolean getgxTv_SdtTARTICU_Artrdto4_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artrdto4_N==1) ;
   }

   public String getgxTv_SdtTARTICU_Artdsc2( )
   {
      return gxTv_SdtTARTICU_Artdsc2 ;
   }

   public void setgxTv_SdtTARTICU_Artdsc2( String value )
   {
      gxTv_SdtTARTICU_Artdsc2_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artdsc2");
      gxTv_SdtTARTICU_Artdsc2 = value ;
   }

   public void setgxTv_SdtTARTICU_Artdsc2_SetNull( )
   {
      gxTv_SdtTARTICU_Artdsc2_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artdsc2 = "" ;
      SetDirty("Artdsc2");
   }

   public boolean getgxTv_SdtTARTICU_Artdsc2_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artdsc2_N==1) ;
   }

   public java.math.BigDecimal getgxTv_SdtTARTICU_Artgrcomp( )
   {
      return gxTv_SdtTARTICU_Artgrcomp ;
   }

   public void setgxTv_SdtTARTICU_Artgrcomp( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_Artgrcomp_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artgrcomp");
      gxTv_SdtTARTICU_Artgrcomp = value ;
   }

   public void setgxTv_SdtTARTICU_Artgrcomp_SetNull( )
   {
      gxTv_SdtTARTICU_Artgrcomp_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artgrcomp = DecimalUtil.ZERO ;
      SetDirty("Artgrcomp");
   }

   public boolean getgxTv_SdtTARTICU_Artgrcomp_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artgrcomp_N==1) ;
   }

   public java.math.BigDecimal getgxTv_SdtTARTICU_Artkgspp( )
   {
      return gxTv_SdtTARTICU_Artkgspp ;
   }

   public void setgxTv_SdtTARTICU_Artkgspp( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_Artkgspp_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artkgspp");
      gxTv_SdtTARTICU_Artkgspp = value ;
   }

   public void setgxTv_SdtTARTICU_Artkgspp_SetNull( )
   {
      gxTv_SdtTARTICU_Artkgspp_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artkgspp = DecimalUtil.ZERO ;
      SetDirty("Artkgspp");
   }

   public boolean getgxTv_SdtTARTICU_Artkgspp_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artkgspp_N==1) ;
   }

   public java.math.BigDecimal getgxTv_SdtTARTICU_Artprepp( )
   {
      return gxTv_SdtTARTICU_Artprepp ;
   }

   public void setgxTv_SdtTARTICU_Artprepp( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_Artprepp_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artprepp");
      gxTv_SdtTARTICU_Artprepp = value ;
   }

   public void setgxTv_SdtTARTICU_Artprepp_SetNull( )
   {
      gxTv_SdtTARTICU_Artprepp_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artprepp = DecimalUtil.ZERO ;
      SetDirty("Artprepp");
   }

   public boolean getgxTv_SdtTARTICU_Artprepp_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artprepp_N==1) ;
   }

   public String getgxTv_SdtTARTICU_Artcdsc( )
   {
      return gxTv_SdtTARTICU_Artcdsc ;
   }

   public void setgxTv_SdtTARTICU_Artcdsc( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artcdsc");
      gxTv_SdtTARTICU_Artcdsc = value ;
   }

   public void setgxTv_SdtTARTICU_Artcdsc_SetNull( )
   {
      gxTv_SdtTARTICU_Artcdsc = "" ;
      SetDirty("Artcdsc");
   }

   public boolean getgxTv_SdtTARTICU_Artcdsc_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTARTICU_Artobslon( )
   {
      return gxTv_SdtTARTICU_Artobslon ;
   }

   public void setgxTv_SdtTARTICU_Artobslon( String value )
   {
      gxTv_SdtTARTICU_Artobslon_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artobslon");
      gxTv_SdtTARTICU_Artobslon = value ;
   }

   public void setgxTv_SdtTARTICU_Artobslon_SetNull( )
   {
      gxTv_SdtTARTICU_Artobslon_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artobslon = "" ;
      SetDirty("Artobslon");
   }

   public boolean getgxTv_SdtTARTICU_Artobslon_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artobslon_N==1) ;
   }

   public String getgxTv_SdtTARTICU_Artobsfac( )
   {
      return gxTv_SdtTARTICU_Artobsfac ;
   }

   public void setgxTv_SdtTARTICU_Artobsfac( String value )
   {
      gxTv_SdtTARTICU_Artobsfac_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artobsfac");
      gxTv_SdtTARTICU_Artobsfac = value ;
   }

   public void setgxTv_SdtTARTICU_Artobsfac_SetNull( )
   {
      gxTv_SdtTARTICU_Artobsfac_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artobsfac = "" ;
      SetDirty("Artobsfac");
   }

   public boolean getgxTv_SdtTARTICU_Artobsfac_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artobsfac_N==1) ;
   }

   public String getgxTv_SdtTARTICU_Artobsotras( )
   {
      return gxTv_SdtTARTICU_Artobsotras ;
   }

   public void setgxTv_SdtTARTICU_Artobsotras( String value )
   {
      gxTv_SdtTARTICU_Artobsotras_N = (byte)(0) ;
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artobsotras");
      gxTv_SdtTARTICU_Artobsotras = value ;
   }

   public void setgxTv_SdtTARTICU_Artobsotras_SetNull( )
   {
      gxTv_SdtTARTICU_Artobsotras_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artobsotras = "" ;
      SetDirty("Artobsotras");
   }

   public boolean getgxTv_SdtTARTICU_Artobsotras_IsNull( )
   {
      return (gxTv_SdtTARTICU_Artobsotras_N==1) ;
   }

   public String getgxTv_SdtTARTICU_Artactivo( )
   {
      return gxTv_SdtTARTICU_Artactivo ;
   }

   public void setgxTv_SdtTARTICU_Artactivo( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artactivo");
      gxTv_SdtTARTICU_Artactivo = value ;
   }

   public String getgxTv_SdtTARTICU_Mode( )
   {
      return gxTv_SdtTARTICU_Mode ;
   }

   public void setgxTv_SdtTARTICU_Mode( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Mode");
      gxTv_SdtTARTICU_Mode = value ;
   }

   public void setgxTv_SdtTARTICU_Mode_SetNull( )
   {
      gxTv_SdtTARTICU_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_SdtTARTICU_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTARTICU_Initialized( )
   {
      return gxTv_SdtTARTICU_Initialized ;
   }

   public void setgxTv_SdtTARTICU_Initialized( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Initialized");
      gxTv_SdtTARTICU_Initialized = value ;
   }

   public void setgxTv_SdtTARTICU_Initialized_SetNull( )
   {
      gxTv_SdtTARTICU_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_SdtTARTICU_Initialized_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTARTICU_Emprcod_Z( )
   {
      return gxTv_SdtTARTICU_Emprcod_Z ;
   }

   public void setgxTv_SdtTARTICU_Emprcod_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Emprcod_Z");
      gxTv_SdtTARTICU_Emprcod_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Emprcod_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Emprcod_Z = "" ;
      SetDirty("Emprcod_Z");
   }

   public boolean getgxTv_SdtTARTICU_Emprcod_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtTARTICU_Clicod_Z( )
   {
      return gxTv_SdtTARTICU_Clicod_Z ;
   }

   public void setgxTv_SdtTARTICU_Clicod_Z( int value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Clicod_Z");
      gxTv_SdtTARTICU_Clicod_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Clicod_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Clicod_Z = 0 ;
      SetDirty("Clicod_Z");
   }

   public boolean getgxTv_SdtTARTICU_Clicod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTARTICU_Artcod_Z( )
   {
      return gxTv_SdtTARTICU_Artcod_Z ;
   }

   public void setgxTv_SdtTARTICU_Artcod_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artcod_Z");
      gxTv_SdtTARTICU_Artcod_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artcod_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artcod_Z = "" ;
      SetDirty("Artcod_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artcod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTARTICU_Artdsc_Z( )
   {
      return gxTv_SdtTARTICU_Artdsc_Z ;
   }

   public void setgxTv_SdtTARTICU_Artdsc_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artdsc_Z");
      gxTv_SdtTARTICU_Artdsc_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artdsc_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artdsc_Z = "" ;
      SetDirty("Artdsc_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artdsc_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTARTICU_Clinom_Z( )
   {
      return gxTv_SdtTARTICU_Clinom_Z ;
   }

   public void setgxTv_SdtTARTICU_Clinom_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Clinom_Z");
      gxTv_SdtTARTICU_Clinom_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Clinom_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Clinom_Z = "" ;
      SetDirty("Clinom_Z");
   }

   public boolean getgxTv_SdtTARTICU_Clinom_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTARTICU_Artcodext_Z( )
   {
      return gxTv_SdtTARTICU_Artcodext_Z ;
   }

   public void setgxTv_SdtTARTICU_Artcodext_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artcodext_Z");
      gxTv_SdtTARTICU_Artcodext_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artcodext_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artcodext_Z = "" ;
      SetDirty("Artcodext_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artcodext_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTARTICU_Emprnom_Z( )
   {
      return gxTv_SdtTARTICU_Emprnom_Z ;
   }

   public void setgxTv_SdtTARTICU_Emprnom_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Emprnom_Z");
      gxTv_SdtTARTICU_Emprnom_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Emprnom_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Emprnom_Z = "" ;
      SetDirty("Emprnom_Z");
   }

   public boolean getgxTv_SdtTARTICU_Emprnom_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTARTICU_Artmat_Z( )
   {
      return gxTv_SdtTARTICU_Artmat_Z ;
   }

   public void setgxTv_SdtTARTICU_Artmat_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artmat_Z");
      gxTv_SdtTARTICU_Artmat_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artmat_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artmat_Z = "" ;
      SetDirty("Artmat_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artmat_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTARTICU_Tipartcod_Z( )
   {
      return gxTv_SdtTARTICU_Tipartcod_Z ;
   }

   public void setgxTv_SdtTARTICU_Tipartcod_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Tipartcod_Z");
      gxTv_SdtTARTICU_Tipartcod_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Tipartcod_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Tipartcod_Z = (short)(0) ;
      SetDirty("Tipartcod_Z");
   }

   public boolean getgxTv_SdtTARTICU_Tipartcod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTARTICU_Tipartdsc_Z( )
   {
      return gxTv_SdtTARTICU_Tipartdsc_Z ;
   }

   public void setgxTv_SdtTARTICU_Tipartdsc_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Tipartdsc_Z");
      gxTv_SdtTARTICU_Tipartdsc_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Tipartdsc_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Tipartdsc_Z = "" ;
      SetDirty("Tipartdsc_Z");
   }

   public boolean getgxTv_SdtTARTICU_Tipartdsc_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTARTICU_Artpml_Z( )
   {
      return gxTv_SdtTARTICU_Artpml_Z ;
   }

   public void setgxTv_SdtTARTICU_Artpml_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artpml_Z");
      gxTv_SdtTARTICU_Artpml_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artpml_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artpml_Z = (short)(0) ;
      SetDirty("Artpml_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artpml_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTARTICU_Artgracru_Z( )
   {
      return gxTv_SdtTARTICU_Artgracru_Z ;
   }

   public void setgxTv_SdtTARTICU_Artgracru_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artgracru_Z");
      gxTv_SdtTARTICU_Artgracru_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artgracru_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artgracru_Z = (short)(0) ;
      SetDirty("Artgracru_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artgracru_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTARTICU_Artcrumin_Z( )
   {
      return gxTv_SdtTARTICU_Artcrumin_Z ;
   }

   public void setgxTv_SdtTARTICU_Artcrumin_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artcrumin_Z");
      gxTv_SdtTARTICU_Artcrumin_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artcrumin_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artcrumin_Z = (short)(0) ;
      SetDirty("Artcrumin_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artcrumin_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTARTICU_Artcrumax_Z( )
   {
      return gxTv_SdtTARTICU_Artcrumax_Z ;
   }

   public void setgxTv_SdtTARTICU_Artcrumax_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artcrumax_Z");
      gxTv_SdtTARTICU_Artcrumax_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artcrumax_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artcrumax_Z = (short)(0) ;
      SetDirty("Artcrumax_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artcrumax_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTARTICU_Artacamin_Z( )
   {
      return gxTv_SdtTARTICU_Artacamin_Z ;
   }

   public void setgxTv_SdtTARTICU_Artacamin_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artacamin_Z");
      gxTv_SdtTARTICU_Artacamin_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artacamin_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artacamin_Z = (short)(0) ;
      SetDirty("Artacamin_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artacamin_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTARTICU_Artacamax_Z( )
   {
      return gxTv_SdtTARTICU_Artacamax_Z ;
   }

   public void setgxTv_SdtTARTICU_Artacamax_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artacamax_Z");
      gxTv_SdtTARTICU_Artacamax_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artacamax_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artacamax_Z = (short)(0) ;
      SetDirty("Artacamax_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artacamax_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtTARTICU_Artren_Z( )
   {
      return gxTv_SdtTARTICU_Artren_Z ;
   }

   public void setgxTv_SdtTARTICU_Artren_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artren_Z");
      gxTv_SdtTARTICU_Artren_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artren_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artren_Z = DecimalUtil.ZERO ;
      SetDirty("Artren_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artren_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTARTICU_Arttipple_Z( )
   {
      return gxTv_SdtTARTICU_Arttipple_Z ;
   }

   public void setgxTv_SdtTARTICU_Arttipple_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arttipple_Z");
      gxTv_SdtTARTICU_Arttipple_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Arttipple_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Arttipple_Z = "" ;
      SetDirty("Arttipple_Z");
   }

   public boolean getgxTv_SdtTARTICU_Arttipple_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTARTICU_Arttiplar_Z( )
   {
      return gxTv_SdtTARTICU_Arttiplar_Z ;
   }

   public void setgxTv_SdtTARTICU_Arttiplar_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arttiplar_Z");
      gxTv_SdtTARTICU_Arttiplar_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Arttiplar_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Arttiplar_Z = "" ;
      SetDirty("Arttiplar_Z");
   }

   public boolean getgxTv_SdtTARTICU_Arttiplar_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTARTICU_Artcorori_Z( )
   {
      return gxTv_SdtTARTICU_Artcorori_Z ;
   }

   public void setgxTv_SdtTARTICU_Artcorori_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artcorori_Z");
      gxTv_SdtTARTICU_Artcorori_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artcorori_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artcorori_Z = "" ;
      SetDirty("Artcorori_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artcorori_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTARTICU_Artencori_Z( )
   {
      return gxTv_SdtTARTICU_Artencori_Z ;
   }

   public void setgxTv_SdtTARTICU_Artencori_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artencori_Z");
      gxTv_SdtTARTICU_Artencori_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artencori_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artencori_Z = "" ;
      SetDirty("Artencori_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artencori_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTARTICU_Artsua_Z( )
   {
      return gxTv_SdtTARTICU_Artsua_Z ;
   }

   public void setgxTv_SdtTARTICU_Artsua_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artsua_Z");
      gxTv_SdtTARTICU_Artsua_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artsua_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artsua_Z = "" ;
      SetDirty("Artsua_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artsua_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTARTICU_Artacaqui_Z( )
   {
      return gxTv_SdtTARTICU_Artacaqui_Z ;
   }

   public void setgxTv_SdtTARTICU_Artacaqui_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artacaqui_Z");
      gxTv_SdtTARTICU_Artacaqui_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artacaqui_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artacaqui_Z = "" ;
      SetDirty("Artacaqui_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artacaqui_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTARTICU_Arteti_Z( )
   {
      return gxTv_SdtTARTICU_Arteti_Z ;
   }

   public void setgxTv_SdtTARTICU_Arteti_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arteti_Z");
      gxTv_SdtTARTICU_Arteti_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Arteti_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Arteti_Z = "" ;
      SetDirty("Arteti_Z");
   }

   public boolean getgxTv_SdtTARTICU_Arteti_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTARTICU_Clieti_Z( )
   {
      return gxTv_SdtTARTICU_Clieti_Z ;
   }

   public void setgxTv_SdtTARTICU_Clieti_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Clieti_Z");
      gxTv_SdtTARTICU_Clieti_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Clieti_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Clieti_Z = "" ;
      SetDirty("Clieti_Z");
   }

   public boolean getgxTv_SdtTARTICU_Clieti_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Cliurg_Z( )
   {
      return gxTv_SdtTARTICU_Cliurg_Z ;
   }

   public void setgxTv_SdtTARTICU_Cliurg_Z( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Cliurg_Z");
      gxTv_SdtTARTICU_Cliurg_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Cliurg_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Cliurg_Z = (byte)(0) ;
      SetDirty("Cliurg_Z");
   }

   public boolean getgxTv_SdtTARTICU_Cliurg_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Arturg_Z( )
   {
      return gxTv_SdtTARTICU_Arturg_Z ;
   }

   public void setgxTv_SdtTARTICU_Arturg_Z( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arturg_Z");
      gxTv_SdtTARTICU_Arturg_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Arturg_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Arturg_Z = (byte)(0) ;
      SetDirty("Arturg_Z");
   }

   public boolean getgxTv_SdtTARTICU_Arturg_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtTARTICU_Artmer_Z( )
   {
      return gxTv_SdtTARTICU_Artmer_Z ;
   }

   public void setgxTv_SdtTARTICU_Artmer_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artmer_Z");
      gxTv_SdtTARTICU_Artmer_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artmer_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artmer_Z = DecimalUtil.ZERO ;
      SetDirty("Artmer_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artmer_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTARTICU_Arttra1_Z( )
   {
      return gxTv_SdtTARTICU_Arttra1_Z ;
   }

   public void setgxTv_SdtTARTICU_Arttra1_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arttra1_Z");
      gxTv_SdtTARTICU_Arttra1_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Arttra1_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Arttra1_Z = "" ;
      SetDirty("Arttra1_Z");
   }

   public boolean getgxTv_SdtTARTICU_Arttra1_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTARTICU_Arttra2_Z( )
   {
      return gxTv_SdtTARTICU_Arttra2_Z ;
   }

   public void setgxTv_SdtTARTICU_Arttra2_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arttra2_Z");
      gxTv_SdtTARTICU_Arttra2_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Arttra2_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Arttra2_Z = "" ;
      SetDirty("Arttra2_Z");
   }

   public boolean getgxTv_SdtTARTICU_Arttra2_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTARTICU_Arttra3_Z( )
   {
      return gxTv_SdtTARTICU_Arttra3_Z ;
   }

   public void setgxTv_SdtTARTICU_Arttra3_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arttra3_Z");
      gxTv_SdtTARTICU_Arttra3_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Arttra3_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Arttra3_Z = "" ;
      SetDirty("Arttra3_Z");
   }

   public boolean getgxTv_SdtTARTICU_Arttra3_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTARTICU_Arttrap1_Z( )
   {
      return gxTv_SdtTARTICU_Arttrap1_Z ;
   }

   public void setgxTv_SdtTARTICU_Arttrap1_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arttrap1_Z");
      gxTv_SdtTARTICU_Arttrap1_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Arttrap1_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Arttrap1_Z = (short)(0) ;
      SetDirty("Arttrap1_Z");
   }

   public boolean getgxTv_SdtTARTICU_Arttrap1_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTARTICU_Arttrap2_Z( )
   {
      return gxTv_SdtTARTICU_Arttrap2_Z ;
   }

   public void setgxTv_SdtTARTICU_Arttrap2_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arttrap2_Z");
      gxTv_SdtTARTICU_Arttrap2_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Arttrap2_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Arttrap2_Z = (short)(0) ;
      SetDirty("Arttrap2_Z");
   }

   public boolean getgxTv_SdtTARTICU_Arttrap2_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTARTICU_Arttrap3_Z( )
   {
      return gxTv_SdtTARTICU_Arttrap3_Z ;
   }

   public void setgxTv_SdtTARTICU_Arttrap3_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arttrap3_Z");
      gxTv_SdtTARTICU_Arttrap3_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Arttrap3_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Arttrap3_Z = (short)(0) ;
      SetDirty("Arttrap3_Z");
   }

   public boolean getgxTv_SdtTARTICU_Arttrap3_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTARTICU_Arturd1_Z( )
   {
      return gxTv_SdtTARTICU_Arturd1_Z ;
   }

   public void setgxTv_SdtTARTICU_Arturd1_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arturd1_Z");
      gxTv_SdtTARTICU_Arturd1_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Arturd1_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Arturd1_Z = "" ;
      SetDirty("Arturd1_Z");
   }

   public boolean getgxTv_SdtTARTICU_Arturd1_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTARTICU_Arturd2_Z( )
   {
      return gxTv_SdtTARTICU_Arturd2_Z ;
   }

   public void setgxTv_SdtTARTICU_Arturd2_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arturd2_Z");
      gxTv_SdtTARTICU_Arturd2_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Arturd2_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Arturd2_Z = "" ;
      SetDirty("Arturd2_Z");
   }

   public boolean getgxTv_SdtTARTICU_Arturd2_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTARTICU_Arturd3_Z( )
   {
      return gxTv_SdtTARTICU_Arturd3_Z ;
   }

   public void setgxTv_SdtTARTICU_Arturd3_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arturd3_Z");
      gxTv_SdtTARTICU_Arturd3_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Arturd3_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Arturd3_Z = "" ;
      SetDirty("Arturd3_Z");
   }

   public boolean getgxTv_SdtTARTICU_Arturd3_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTARTICU_Arturdp1_Z( )
   {
      return gxTv_SdtTARTICU_Arturdp1_Z ;
   }

   public void setgxTv_SdtTARTICU_Arturdp1_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arturdp1_Z");
      gxTv_SdtTARTICU_Arturdp1_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Arturdp1_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Arturdp1_Z = (short)(0) ;
      SetDirty("Arturdp1_Z");
   }

   public boolean getgxTv_SdtTARTICU_Arturdp1_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTARTICU_Arturdp2_Z( )
   {
      return gxTv_SdtTARTICU_Arturdp2_Z ;
   }

   public void setgxTv_SdtTARTICU_Arturdp2_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arturdp2_Z");
      gxTv_SdtTARTICU_Arturdp2_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Arturdp2_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Arturdp2_Z = (short)(0) ;
      SetDirty("Arturdp2_Z");
   }

   public boolean getgxTv_SdtTARTICU_Arturdp2_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTARTICU_Arturdp3_Z( )
   {
      return gxTv_SdtTARTICU_Arturdp3_Z ;
   }

   public void setgxTv_SdtTARTICU_Arturdp3_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arturdp3_Z");
      gxTv_SdtTARTICU_Arturdp3_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Arturdp3_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Arturdp3_Z = (short)(0) ;
      SetDirty("Arturdp3_Z");
   }

   public boolean getgxTv_SdtTARTICU_Arturdp3_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTARTICU_Artenccom_Z( )
   {
      return gxTv_SdtTARTICU_Artenccom_Z ;
   }

   public void setgxTv_SdtTARTICU_Artenccom_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artenccom_Z");
      gxTv_SdtTARTICU_Artenccom_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artenccom_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artenccom_Z = (short)(0) ;
      SetDirty("Artenccom_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artenccom_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTARTICU_Artencanh_Z( )
   {
      return gxTv_SdtTARTICU_Artencanh_Z ;
   }

   public void setgxTv_SdtTARTICU_Artencanh_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artencanh_Z");
      gxTv_SdtTARTICU_Artencanh_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artencanh_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artencanh_Z = (short)(0) ;
      SetDirty("Artencanh_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artencanh_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTARTICU_Artgraaca_Z( )
   {
      return gxTv_SdtTARTICU_Artgraaca_Z ;
   }

   public void setgxTv_SdtTARTICU_Artgraaca_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artgraaca_Z");
      gxTv_SdtTARTICU_Artgraaca_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artgraaca_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artgraaca_Z = (short)(0) ;
      SetDirty("Artgraaca_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artgraaca_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtTARTICU_Artrdoa_Z( )
   {
      return gxTv_SdtTARTICU_Artrdoa_Z ;
   }

   public void setgxTv_SdtTARTICU_Artrdoa_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artrdoa_Z");
      gxTv_SdtTARTICU_Artrdoa_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artrdoa_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artrdoa_Z = DecimalUtil.ZERO ;
      SetDirty("Artrdoa_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artrdoa_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtTARTICU_Artrdon_Z( )
   {
      return gxTv_SdtTARTICU_Artrdon_Z ;
   }

   public void setgxTv_SdtTARTICU_Artrdon_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artrdon_Z");
      gxTv_SdtTARTICU_Artrdon_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artrdon_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artrdon_Z = DecimalUtil.ZERO ;
      SetDirty("Artrdon_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artrdon_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtTARTICU_Artfacabs_Z( )
   {
      return gxTv_SdtTARTICU_Artfacabs_Z ;
   }

   public void setgxTv_SdtTARTICU_Artfacabs_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artfacabs_Z");
      gxTv_SdtTARTICU_Artfacabs_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artfacabs_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artfacabs_Z = DecimalUtil.ZERO ;
      SetDirty("Artfacabs_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artfacabs_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTARTICU_Artple2_Z( )
   {
      return gxTv_SdtTARTICU_Artple2_Z ;
   }

   public void setgxTv_SdtTARTICU_Artple2_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artple2_Z");
      gxTv_SdtTARTICU_Artple2_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artple2_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artple2_Z = "" ;
      SetDirty("Artple2_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artple2_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTARTICU_Artnumcor_Z( )
   {
      return gxTv_SdtTARTICU_Artnumcor_Z ;
   }

   public void setgxTv_SdtTARTICU_Artnumcor_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artnumcor_Z");
      gxTv_SdtTARTICU_Artnumcor_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artnumcor_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artnumcor_Z = (short)(0) ;
      SetDirty("Artnumcor_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artnumcor_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTARTICU_Artancsal1_Z( )
   {
      return gxTv_SdtTARTICU_Artancsal1_Z ;
   }

   public void setgxTv_SdtTARTICU_Artancsal1_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artancsal1_Z");
      gxTv_SdtTARTICU_Artancsal1_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artancsal1_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artancsal1_Z = (short)(0) ;
      SetDirty("Artancsal1_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artancsal1_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTARTICU_Artancsal2_Z( )
   {
      return gxTv_SdtTARTICU_Artancsal2_Z ;
   }

   public void setgxTv_SdtTARTICU_Artancsal2_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artancsal2_Z");
      gxTv_SdtTARTICU_Artancsal2_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artancsal2_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artancsal2_Z = (short)(0) ;
      SetDirty("Artancsal2_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artancsal2_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTARTICU_Artancsal3_Z( )
   {
      return gxTv_SdtTARTICU_Artancsal3_Z ;
   }

   public void setgxTv_SdtTARTICU_Artancsal3_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artancsal3_Z");
      gxTv_SdtTARTICU_Artancsal3_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artancsal3_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artancsal3_Z = (short)(0) ;
      SetDirty("Artancsal3_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artancsal3_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTARTICU_Artgraaca2_Z( )
   {
      return gxTv_SdtTARTICU_Artgraaca2_Z ;
   }

   public void setgxTv_SdtTARTICU_Artgraaca2_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artgraaca2_Z");
      gxTv_SdtTARTICU_Artgraaca2_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artgraaca2_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artgraaca2_Z = (short)(0) ;
      SetDirty("Artgraaca2_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artgraaca2_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTARTICU_Artgracru2_Z( )
   {
      return gxTv_SdtTARTICU_Artgracru2_Z ;
   }

   public void setgxTv_SdtTARTICU_Artgracru2_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artgracru2_Z");
      gxTv_SdtTARTICU_Artgracru2_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artgracru2_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artgracru2_Z = (short)(0) ;
      SetDirty("Artgracru2_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artgracru2_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTARTICU_Clascod_Z( )
   {
      return gxTv_SdtTARTICU_Clascod_Z ;
   }

   public void setgxTv_SdtTARTICU_Clascod_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Clascod_Z");
      gxTv_SdtTARTICU_Clascod_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Clascod_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Clascod_Z = (short)(0) ;
      SetDirty("Clascod_Z");
   }

   public boolean getgxTv_SdtTARTICU_Clascod_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtTARTICU_Artpmppza_Z( )
   {
      return gxTv_SdtTARTICU_Artpmppza_Z ;
   }

   public void setgxTv_SdtTARTICU_Artpmppza_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artpmppza_Z");
      gxTv_SdtTARTICU_Artpmppza_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artpmppza_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artpmppza_Z = DecimalUtil.ZERO ;
      SetDirty("Artpmppza_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artpmppza_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTARTICU_Artfeccre_Z( )
   {
      return gxTv_SdtTARTICU_Artfeccre_Z ;
   }

   public void setgxTv_SdtTARTICU_Artfeccre_Z( java.util.Date value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artfeccre_Z");
      gxTv_SdtTARTICU_Artfeccre_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artfeccre_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artfeccre_Z = GXutil.nullDate() ;
      SetDirty("Artfeccre_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artfeccre_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTARTICU_Artusrcod_Z( )
   {
      return gxTv_SdtTARTICU_Artusrcod_Z ;
   }

   public void setgxTv_SdtTARTICU_Artusrcod_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artusrcod_Z");
      gxTv_SdtTARTICU_Artusrcod_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artusrcod_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artusrcod_Z = "" ;
      SetDirty("Artusrcod_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artusrcod_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTARTICU_Artfecmod_Z( )
   {
      return gxTv_SdtTARTICU_Artfecmod_Z ;
   }

   public void setgxTv_SdtTARTICU_Artfecmod_Z( java.util.Date value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artfecmod_Z");
      gxTv_SdtTARTICU_Artfecmod_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artfecmod_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artfecmod_Z = GXutil.nullDate() ;
      SetDirty("Artfecmod_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artfecmod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTARTICU_Clasdsc_Z( )
   {
      return gxTv_SdtTARTICU_Clasdsc_Z ;
   }

   public void setgxTv_SdtTARTICU_Clasdsc_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Clasdsc_Z");
      gxTv_SdtTARTICU_Clasdsc_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Clasdsc_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Clasdsc_Z = "" ;
      SetDirty("Clasdsc_Z");
   }

   public boolean getgxTv_SdtTARTICU_Clasdsc_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTARTICU_Artcomer_Z( )
   {
      return gxTv_SdtTARTICU_Artcomer_Z ;
   }

   public void setgxTv_SdtTARTICU_Artcomer_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artcomer_Z");
      gxTv_SdtTARTICU_Artcomer_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artcomer_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artcomer_Z = "" ;
      SetDirty("Artcomer_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artcomer_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTARTICU_Clatubcod_Z( )
   {
      return gxTv_SdtTARTICU_Clatubcod_Z ;
   }

   public void setgxTv_SdtTARTICU_Clatubcod_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Clatubcod_Z");
      gxTv_SdtTARTICU_Clatubcod_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Clatubcod_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Clatubcod_Z = (short)(0) ;
      SetDirty("Clatubcod_Z");
   }

   public boolean getgxTv_SdtTARTICU_Clatubcod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTARTICU_Clatubdsc_Z( )
   {
      return gxTv_SdtTARTICU_Clatubdsc_Z ;
   }

   public void setgxTv_SdtTARTICU_Clatubdsc_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Clatubdsc_Z");
      gxTv_SdtTARTICU_Clatubdsc_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Clatubdsc_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Clatubdsc_Z = "" ;
      SetDirty("Clatubdsc_Z");
   }

   public boolean getgxTv_SdtTARTICU_Clatubdsc_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTARTICU_Clabolcod_Z( )
   {
      return gxTv_SdtTARTICU_Clabolcod_Z ;
   }

   public void setgxTv_SdtTARTICU_Clabolcod_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Clabolcod_Z");
      gxTv_SdtTARTICU_Clabolcod_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Clabolcod_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Clabolcod_Z = (short)(0) ;
      SetDirty("Clabolcod_Z");
   }

   public boolean getgxTv_SdtTARTICU_Clabolcod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTARTICU_Claboldsc_Z( )
   {
      return gxTv_SdtTARTICU_Claboldsc_Z ;
   }

   public void setgxTv_SdtTARTICU_Claboldsc_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Claboldsc_Z");
      gxTv_SdtTARTICU_Claboldsc_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Claboldsc_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Claboldsc_Z = "" ;
      SetDirty("Claboldsc_Z");
   }

   public boolean getgxTv_SdtTARTICU_Claboldsc_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtTARTICU_Artrdocru1_Z( )
   {
      return gxTv_SdtTARTICU_Artrdocru1_Z ;
   }

   public void setgxTv_SdtTARTICU_Artrdocru1_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artrdocru1_Z");
      gxTv_SdtTARTICU_Artrdocru1_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artrdocru1_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artrdocru1_Z = DecimalUtil.ZERO ;
      SetDirty("Artrdocru1_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artrdocru1_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtTARTICU_Artrdocru2_Z( )
   {
      return gxTv_SdtTARTICU_Artrdocru2_Z ;
   }

   public void setgxTv_SdtTARTICU_Artrdocru2_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artrdocru2_Z");
      gxTv_SdtTARTICU_Artrdocru2_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artrdocru2_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artrdocru2_Z = DecimalUtil.ZERO ;
      SetDirty("Artrdocru2_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artrdocru2_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTARTICU_Artnmtr_Z( )
   {
      return gxTv_SdtTARTICU_Artnmtr_Z ;
   }

   public void setgxTv_SdtTARTICU_Artnmtr_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artnmtr_Z");
      gxTv_SdtTARTICU_Artnmtr_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artnmtr_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artnmtr_Z = "" ;
      SetDirty("Artnmtr_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artnmtr_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtTARTICU_Artlu_Z( )
   {
      return gxTv_SdtTARTICU_Artlu_Z ;
   }

   public void setgxTv_SdtTARTICU_Artlu_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artlu_Z");
      gxTv_SdtTARTICU_Artlu_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artlu_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artlu_Z = DecimalUtil.ZERO ;
      SetDirty("Artlu_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artlu_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTARTICU_Artrb_Z( )
   {
      return gxTv_SdtTARTICU_Artrb_Z ;
   }

   public void setgxTv_SdtTARTICU_Artrb_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artrb_Z");
      gxTv_SdtTARTICU_Artrb_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artrb_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artrb_Z = (short)(0) ;
      SetDirty("Artrb_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artrb_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTARTICU_Artpelanh_Z( )
   {
      return gxTv_SdtTARTICU_Artpelanh_Z ;
   }

   public void setgxTv_SdtTARTICU_Artpelanh_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artpelanh_Z");
      gxTv_SdtTARTICU_Artpelanh_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artpelanh_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artpelanh_Z = (short)(0) ;
      SetDirty("Artpelanh_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artpelanh_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTARTICU_Artgrm2sc_Z( )
   {
      return gxTv_SdtTARTICU_Artgrm2sc_Z ;
   }

   public void setgxTv_SdtTARTICU_Artgrm2sc_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artgrm2sc_Z");
      gxTv_SdtTARTICU_Artgrm2sc_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artgrm2sc_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artgrm2sc_Z = (short)(0) ;
      SetDirty("Artgrm2sc_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artgrm2sc_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTARTICU_Artpmlsc_Z( )
   {
      return gxTv_SdtTARTICU_Artpmlsc_Z ;
   }

   public void setgxTv_SdtTARTICU_Artpmlsc_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artpmlsc_Z");
      gxTv_SdtTARTICU_Artpmlsc_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artpmlsc_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artpmlsc_Z = (short)(0) ;
      SetDirty("Artpmlsc_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artpmlsc_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTARTICU_Artancsc_Z( )
   {
      return gxTv_SdtTARTICU_Artancsc_Z ;
   }

   public void setgxTv_SdtTARTICU_Artancsc_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artancsc_Z");
      gxTv_SdtTARTICU_Artancsc_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artancsc_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artancsc_Z = (short)(0) ;
      SetDirty("Artancsc_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artancsc_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTARTICU_Artpmlcru_Z( )
   {
      return gxTv_SdtTARTICU_Artpmlcru_Z ;
   }

   public void setgxTv_SdtTARTICU_Artpmlcru_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artpmlcru_Z");
      gxTv_SdtTARTICU_Artpmlcru_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artpmlcru_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artpmlcru_Z = (short)(0) ;
      SetDirty("Artpmlcru_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artpmlcru_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtTARTICU_Artrdtsc_Z( )
   {
      return gxTv_SdtTARTICU_Artrdtsc_Z ;
   }

   public void setgxTv_SdtTARTICU_Artrdtsc_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artrdtsc_Z");
      gxTv_SdtTARTICU_Artrdtsc_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artrdtsc_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artrdtsc_Z = DecimalUtil.ZERO ;
      SetDirty("Artrdtsc_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artrdtsc_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTARTICU_Artund_Z( )
   {
      return gxTv_SdtTARTICU_Artund_Z ;
   }

   public void setgxTv_SdtTARTICU_Artund_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artund_Z");
      gxTv_SdtTARTICU_Artund_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artund_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artund_Z = "" ;
      SetDirty("Artund_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artund_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTARTICU_Artblo_Z( )
   {
      return gxTv_SdtTARTICU_Artblo_Z ;
   }

   public void setgxTv_SdtTARTICU_Artblo_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artblo_Z");
      gxTv_SdtTARTICU_Artblo_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artblo_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artblo_Z = "" ;
      SetDirty("Artblo_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artblo_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artcla_Z( )
   {
      return gxTv_SdtTARTICU_Artcla_Z ;
   }

   public void setgxTv_SdtTARTICU_Artcla_Z( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artcla_Z");
      gxTv_SdtTARTICU_Artcla_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artcla_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artcla_Z = (byte)(0) ;
      SetDirty("Artcla_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artcla_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTARTICU_Tipartdsc2_Z( )
   {
      return gxTv_SdtTARTICU_Tipartdsc2_Z ;
   }

   public void setgxTv_SdtTARTICU_Tipartdsc2_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Tipartdsc2_Z");
      gxTv_SdtTARTICU_Tipartdsc2_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Tipartdsc2_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Tipartdsc2_Z = "" ;
      SetDirty("Tipartdsc2_Z");
   }

   public boolean getgxTv_SdtTARTICU_Tipartdsc2_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtTARTICU_Artfabsh_Z( )
   {
      return gxTv_SdtTARTICU_Artfabsh_Z ;
   }

   public void setgxTv_SdtTARTICU_Artfabsh_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artfabsh_Z");
      gxTv_SdtTARTICU_Artfabsh_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artfabsh_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artfabsh_Z = DecimalUtil.ZERO ;
      SetDirty("Artfabsh_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artfabsh_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtTARTICU_Artfabst_Z( )
   {
      return gxTv_SdtTARTICU_Artfabst_Z ;
   }

   public void setgxTv_SdtTARTICU_Artfabst_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artfabst_Z");
      gxTv_SdtTARTICU_Artfabst_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artfabst_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artfabst_Z = DecimalUtil.ZERO ;
      SetDirty("Artfabst_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artfabst_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artnprog_Z( )
   {
      return gxTv_SdtTARTICU_Artnprog_Z ;
   }

   public void setgxTv_SdtTARTICU_Artnprog_Z( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artnprog_Z");
      gxTv_SdtTARTICU_Artnprog_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artnprog_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artnprog_Z = (byte)(0) ;
      SetDirty("Artnprog_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artnprog_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTARTICU_Artvbd_Z( )
   {
      return gxTv_SdtTARTICU_Artvbd_Z ;
   }

   public void setgxTv_SdtTARTICU_Artvbd_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artvbd_Z");
      gxTv_SdtTARTICU_Artvbd_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artvbd_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artvbd_Z = (short)(0) ;
      SetDirty("Artvbd_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artvbd_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTARTICU_Artvbn_Z( )
   {
      return gxTv_SdtTARTICU_Artvbn_Z ;
   }

   public void setgxTv_SdtTARTICU_Artvbn_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artvbn_Z");
      gxTv_SdtTARTICU_Artvbn_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artvbn_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artvbn_Z = (short)(0) ;
      SetDirty("Artvbn_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artvbn_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTARTICU_Artab_Z( )
   {
      return gxTv_SdtTARTICU_Artab_Z ;
   }

   public void setgxTv_SdtTARTICU_Artab_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artab_Z");
      gxTv_SdtTARTICU_Artab_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artab_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artab_Z = (short)(0) ;
      SetDirty("Artab_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artab_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTARTICU_Artobsgrm_Z( )
   {
      return gxTv_SdtTARTICU_Artobsgrm_Z ;
   }

   public void setgxTv_SdtTARTICU_Artobsgrm_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artobsgrm_Z");
      gxTv_SdtTARTICU_Artobsgrm_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artobsgrm_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artobsgrm_Z = "" ;
      SetDirty("Artobsgrm_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artobsgrm_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTARTICU_Artobsanc_Z( )
   {
      return gxTv_SdtTARTICU_Artobsanc_Z ;
   }

   public void setgxTv_SdtTARTICU_Artobsanc_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artobsanc_Z");
      gxTv_SdtTARTICU_Artobsanc_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artobsanc_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artobsanc_Z = "" ;
      SetDirty("Artobsanc_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artobsanc_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTARTICU_Artcdb_Z( )
   {
      return gxTv_SdtTARTICU_Artcdb_Z ;
   }

   public void setgxTv_SdtTARTICU_Artcdb_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artcdb_Z");
      gxTv_SdtTARTICU_Artcdb_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artcdb_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artcdb_Z = "" ;
      SetDirty("Artcdb_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artcdb_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTARTICU_Artgalga_Z( )
   {
      return gxTv_SdtTARTICU_Artgalga_Z ;
   }

   public void setgxTv_SdtTARTICU_Artgalga_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artgalga_Z");
      gxTv_SdtTARTICU_Artgalga_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artgalga_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artgalga_Z = "" ;
      SetDirty("Artgalga_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artgalga_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTARTICU_Artplatina_Z( )
   {
      return gxTv_SdtTARTICU_Artplatina_Z ;
   }

   public void setgxTv_SdtTARTICU_Artplatina_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artplatina_Z");
      gxTv_SdtTARTICU_Artplatina_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artplatina_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artplatina_Z = "" ;
      SetDirty("Artplatina_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artplatina_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTARTICU_Artpgd_Z( )
   {
      return gxTv_SdtTARTICU_Artpgd_Z ;
   }

   public void setgxTv_SdtTARTICU_Artpgd_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artpgd_Z");
      gxTv_SdtTARTICU_Artpgd_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artpgd_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artpgd_Z = "" ;
      SetDirty("Artpgd_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artpgd_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTARTICU_Artth_Z( )
   {
      return gxTv_SdtTARTICU_Artth_Z ;
   }

   public void setgxTv_SdtTARTICU_Artth_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artth_Z");
      gxTv_SdtTARTICU_Artth_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artth_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artth_Z = (short)(0) ;
      SetDirty("Artth_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artth_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTARTICU_Artthn_Z( )
   {
      return gxTv_SdtTARTICU_Artthn_Z ;
   }

   public void setgxTv_SdtTARTICU_Artthn_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artthn_Z");
      gxTv_SdtTARTICU_Artthn_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artthn_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artthn_Z = "" ;
      SetDirty("Artthn_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artthn_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTARTICU_Art_cd_Z( )
   {
      return gxTv_SdtTARTICU_Art_cd_Z ;
   }

   public void setgxTv_SdtTARTICU_Art_cd_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Art_cd_Z");
      gxTv_SdtTARTICU_Art_cd_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Art_cd_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Art_cd_Z = (short)(0) ;
      SetDirty("Art_cd_Z");
   }

   public boolean getgxTv_SdtTARTICU_Art_cd_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTARTICU_Art_dc_Z( )
   {
      return gxTv_SdtTARTICU_Art_dc_Z ;
   }

   public void setgxTv_SdtTARTICU_Art_dc_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Art_dc_Z");
      gxTv_SdtTARTICU_Art_dc_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Art_dc_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Art_dc_Z = "" ;
      SetDirty("Art_dc_Z");
   }

   public boolean getgxTv_SdtTARTICU_Art_dc_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTARTICU_Arthilos_Z( )
   {
      return gxTv_SdtTARTICU_Arthilos_Z ;
   }

   public void setgxTv_SdtTARTICU_Arthilos_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arthilos_Z");
      gxTv_SdtTARTICU_Arthilos_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Arthilos_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Arthilos_Z = (short)(0) ;
      SetDirty("Arthilos_Z");
   }

   public boolean getgxTv_SdtTARTICU_Arthilos_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTARTICU_Artpasad_Z( )
   {
      return gxTv_SdtTARTICU_Artpasad_Z ;
   }

   public void setgxTv_SdtTARTICU_Artpasad_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artpasad_Z");
      gxTv_SdtTARTICU_Artpasad_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artpasad_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artpasad_Z = (short)(0) ;
      SetDirty("Artpasad_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artpasad_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTARTICU_Artancc_Z( )
   {
      return gxTv_SdtTARTICU_Artancc_Z ;
   }

   public void setgxTv_SdtTARTICU_Artancc_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artancc_Z");
      gxTv_SdtTARTICU_Artancc_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artancc_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artancc_Z = (short)(0) ;
      SetDirty("Artancc_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artancc_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTARTICU_Artgrm2c_Z( )
   {
      return gxTv_SdtTARTICU_Artgrm2c_Z ;
   }

   public void setgxTv_SdtTARTICU_Artgrm2c_Z( short value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artgrm2c_Z");
      gxTv_SdtTARTICU_Artgrm2c_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artgrm2c_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artgrm2c_Z = (short)(0) ;
      SetDirty("Artgrm2c_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artgrm2c_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtTARTICU_Artrdoc_Z( )
   {
      return gxTv_SdtTARTICU_Artrdoc_Z ;
   }

   public void setgxTv_SdtTARTICU_Artrdoc_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artrdoc_Z");
      gxTv_SdtTARTICU_Artrdoc_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artrdoc_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artrdoc_Z = DecimalUtil.ZERO ;
      SetDirty("Artrdoc_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artrdoc_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtTARTICU_Artacafor_Z( )
   {
      return gxTv_SdtTARTICU_Artacafor_Z ;
   }

   public void setgxTv_SdtTARTICU_Artacafor_Z( int value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artacafor_Z");
      gxTv_SdtTARTICU_Artacafor_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artacafor_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artacafor_Z = 0 ;
      SetDirty("Artacafor_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artacafor_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTARTICU_Artanu_Z( )
   {
      return gxTv_SdtTARTICU_Artanu_Z ;
   }

   public void setgxTv_SdtTARTICU_Artanu_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artanu_Z");
      gxTv_SdtTARTICU_Artanu_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artanu_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artanu_Z = "" ;
      SetDirty("Artanu_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artanu_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtTARTICU_Artfacuti_Z( )
   {
      return gxTv_SdtTARTICU_Artfacuti_Z ;
   }

   public void setgxTv_SdtTARTICU_Artfacuti_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artfacuti_Z");
      gxTv_SdtTARTICU_Artfacuti_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artfacuti_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artfacuti_Z = DecimalUtil.ZERO ;
      SetDirty("Artfacuti_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artfacuti_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtTARTICU_Artnumtip_Z( )
   {
      return gxTv_SdtTARTICU_Artnumtip_Z ;
   }

   public void setgxTv_SdtTARTICU_Artnumtip_Z( int value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artnumtip_Z");
      gxTv_SdtTARTICU_Artnumtip_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artnumtip_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artnumtip_Z = 0 ;
      SetDirty("Artnumtip_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artnumtip_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artmt_Z( )
   {
      return gxTv_SdtTARTICU_Artmt_Z ;
   }

   public void setgxTv_SdtTARTICU_Artmt_Z( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artmt_Z");
      gxTv_SdtTARTICU_Artmt_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artmt_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artmt_Z = (byte)(0) ;
      SetDirty("Artmt_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artmt_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Arttrabs_Z( )
   {
      return gxTv_SdtTARTICU_Arttrabs_Z ;
   }

   public void setgxTv_SdtTARTICU_Arttrabs_Z( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arttrabs_Z");
      gxTv_SdtTARTICU_Arttrabs_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Arttrabs_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Arttrabs_Z = (byte)(0) ;
      SetDirty("Arttrabs_Z");
   }

   public boolean getgxTv_SdtTARTICU_Arttrabs_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtTARTICU_Artkgmn_Z( )
   {
      return gxTv_SdtTARTICU_Artkgmn_Z ;
   }

   public void setgxTv_SdtTARTICU_Artkgmn_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artkgmn_Z");
      gxTv_SdtTARTICU_Artkgmn_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artkgmn_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artkgmn_Z = DecimalUtil.ZERO ;
      SetDirty("Artkgmn_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artkgmn_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTARTICU_Artacamar_Z( )
   {
      return gxTv_SdtTARTICU_Artacamar_Z ;
   }

   public void setgxTv_SdtTARTICU_Artacamar_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artacamar_Z");
      gxTv_SdtTARTICU_Artacamar_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artacamar_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artacamar_Z = "" ;
      SetDirty("Artacamar_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artacamar_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTARTICU_Artacabak_Z( )
   {
      return gxTv_SdtTARTICU_Artacabak_Z ;
   }

   public void setgxTv_SdtTARTICU_Artacabak_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artacabak_Z");
      gxTv_SdtTARTICU_Artacabak_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artacabak_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artacabak_Z = "" ;
      SetDirty("Artacabak_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artacabak_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtTARTICU_Artelganc_Z( )
   {
      return gxTv_SdtTARTICU_Artelganc_Z ;
   }

   public void setgxTv_SdtTARTICU_Artelganc_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artelganc_Z");
      gxTv_SdtTARTICU_Artelganc_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artelganc_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artelganc_Z = DecimalUtil.ZERO ;
      SetDirty("Artelganc_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artelganc_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtTARTICU_Artelglar_Z( )
   {
      return gxTv_SdtTARTICU_Artelglar_Z ;
   }

   public void setgxTv_SdtTARTICU_Artelglar_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artelglar_Z");
      gxTv_SdtTARTICU_Artelglar_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artelglar_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artelglar_Z = DecimalUtil.ZERO ;
      SetDirty("Artelglar_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artelglar_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtTARTICU_Artrdocru_Z( )
   {
      return gxTv_SdtTARTICU_Artrdocru_Z ;
   }

   public void setgxTv_SdtTARTICU_Artrdocru_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artrdocru_Z");
      gxTv_SdtTARTICU_Artrdocru_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artrdocru_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artrdocru_Z = DecimalUtil.ZERO ;
      SetDirty("Artrdocru_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artrdocru_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtTARTICU_Artenclarg_Z( )
   {
      return gxTv_SdtTARTICU_Artenclarg_Z ;
   }

   public void setgxTv_SdtTARTICU_Artenclarg_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artenclarg_Z");
      gxTv_SdtTARTICU_Artenclarg_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artenclarg_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artenclarg_Z = DecimalUtil.ZERO ;
      SetDirty("Artenclarg_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artenclarg_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtTARTICU_Artencanc_Z( )
   {
      return gxTv_SdtTARTICU_Artencanc_Z ;
   }

   public void setgxTv_SdtTARTICU_Artencanc_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artencanc_Z");
      gxTv_SdtTARTICU_Artencanc_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artencanc_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artencanc_Z = DecimalUtil.ZERO ;
      SetDirty("Artencanc_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artencanc_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtTARTICU_Artrdto4_Z( )
   {
      return gxTv_SdtTARTICU_Artrdto4_Z ;
   }

   public void setgxTv_SdtTARTICU_Artrdto4_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artrdto4_Z");
      gxTv_SdtTARTICU_Artrdto4_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artrdto4_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artrdto4_Z = DecimalUtil.ZERO ;
      SetDirty("Artrdto4_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artrdto4_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTARTICU_Artdsc2_Z( )
   {
      return gxTv_SdtTARTICU_Artdsc2_Z ;
   }

   public void setgxTv_SdtTARTICU_Artdsc2_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artdsc2_Z");
      gxTv_SdtTARTICU_Artdsc2_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artdsc2_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artdsc2_Z = "" ;
      SetDirty("Artdsc2_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artdsc2_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtTARTICU_Artgrcomp_Z( )
   {
      return gxTv_SdtTARTICU_Artgrcomp_Z ;
   }

   public void setgxTv_SdtTARTICU_Artgrcomp_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artgrcomp_Z");
      gxTv_SdtTARTICU_Artgrcomp_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artgrcomp_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artgrcomp_Z = DecimalUtil.ZERO ;
      SetDirty("Artgrcomp_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artgrcomp_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtTARTICU_Artkgspp_Z( )
   {
      return gxTv_SdtTARTICU_Artkgspp_Z ;
   }

   public void setgxTv_SdtTARTICU_Artkgspp_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artkgspp_Z");
      gxTv_SdtTARTICU_Artkgspp_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artkgspp_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artkgspp_Z = DecimalUtil.ZERO ;
      SetDirty("Artkgspp_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artkgspp_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtTARTICU_Artprepp_Z( )
   {
      return gxTv_SdtTARTICU_Artprepp_Z ;
   }

   public void setgxTv_SdtTARTICU_Artprepp_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artprepp_Z");
      gxTv_SdtTARTICU_Artprepp_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artprepp_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artprepp_Z = DecimalUtil.ZERO ;
      SetDirty("Artprepp_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artprepp_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTARTICU_Artcdsc_Z( )
   {
      return gxTv_SdtTARTICU_Artcdsc_Z ;
   }

   public void setgxTv_SdtTARTICU_Artcdsc_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artcdsc_Z");
      gxTv_SdtTARTICU_Artcdsc_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artcdsc_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artcdsc_Z = "" ;
      SetDirty("Artcdsc_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artcdsc_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTARTICU_Artobsfac_Z( )
   {
      return gxTv_SdtTARTICU_Artobsfac_Z ;
   }

   public void setgxTv_SdtTARTICU_Artobsfac_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artobsfac_Z");
      gxTv_SdtTARTICU_Artobsfac_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artobsfac_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artobsfac_Z = "" ;
      SetDirty("Artobsfac_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artobsfac_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTARTICU_Artobsotras_Z( )
   {
      return gxTv_SdtTARTICU_Artobsotras_Z ;
   }

   public void setgxTv_SdtTARTICU_Artobsotras_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artobsotras_Z");
      gxTv_SdtTARTICU_Artobsotras_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artobsotras_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artobsotras_Z = "" ;
      SetDirty("Artobsotras_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artobsotras_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTARTICU_Artactivo_Z( )
   {
      return gxTv_SdtTARTICU_Artactivo_Z ;
   }

   public void setgxTv_SdtTARTICU_Artactivo_Z( String value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artactivo_Z");
      gxTv_SdtTARTICU_Artactivo_Z = value ;
   }

   public void setgxTv_SdtTARTICU_Artactivo_Z_SetNull( )
   {
      gxTv_SdtTARTICU_Artactivo_Z = "" ;
      SetDirty("Artactivo_Z");
   }

   public boolean getgxTv_SdtTARTICU_Artactivo_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Clicod_N( )
   {
      return gxTv_SdtTARTICU_Clicod_N ;
   }

   public void setgxTv_SdtTARTICU_Clicod_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Clicod_N");
      gxTv_SdtTARTICU_Clicod_N = value ;
   }

   public void setgxTv_SdtTARTICU_Clicod_N_SetNull( )
   {
      gxTv_SdtTARTICU_Clicod_N = (byte)(0) ;
      SetDirty("Clicod_N");
   }

   public boolean getgxTv_SdtTARTICU_Clicod_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artcod_N( )
   {
      return gxTv_SdtTARTICU_Artcod_N ;
   }

   public void setgxTv_SdtTARTICU_Artcod_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artcod_N");
      gxTv_SdtTARTICU_Artcod_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artcod_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artcod_N = (byte)(0) ;
      SetDirty("Artcod_N");
   }

   public boolean getgxTv_SdtTARTICU_Artcod_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artdsc_N( )
   {
      return gxTv_SdtTARTICU_Artdsc_N ;
   }

   public void setgxTv_SdtTARTICU_Artdsc_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artdsc_N");
      gxTv_SdtTARTICU_Artdsc_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artdsc_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artdsc_N = (byte)(0) ;
      SetDirty("Artdsc_N");
   }

   public boolean getgxTv_SdtTARTICU_Artdsc_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artcodext_N( )
   {
      return gxTv_SdtTARTICU_Artcodext_N ;
   }

   public void setgxTv_SdtTARTICU_Artcodext_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artcodext_N");
      gxTv_SdtTARTICU_Artcodext_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artcodext_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artcodext_N = (byte)(0) ;
      SetDirty("Artcodext_N");
   }

   public boolean getgxTv_SdtTARTICU_Artcodext_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Emprnom_N( )
   {
      return gxTv_SdtTARTICU_Emprnom_N ;
   }

   public void setgxTv_SdtTARTICU_Emprnom_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Emprnom_N");
      gxTv_SdtTARTICU_Emprnom_N = value ;
   }

   public void setgxTv_SdtTARTICU_Emprnom_N_SetNull( )
   {
      gxTv_SdtTARTICU_Emprnom_N = (byte)(0) ;
      SetDirty("Emprnom_N");
   }

   public boolean getgxTv_SdtTARTICU_Emprnom_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artmat_N( )
   {
      return gxTv_SdtTARTICU_Artmat_N ;
   }

   public void setgxTv_SdtTARTICU_Artmat_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artmat_N");
      gxTv_SdtTARTICU_Artmat_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artmat_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artmat_N = (byte)(0) ;
      SetDirty("Artmat_N");
   }

   public boolean getgxTv_SdtTARTICU_Artmat_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Tipartdsc_N( )
   {
      return gxTv_SdtTARTICU_Tipartdsc_N ;
   }

   public void setgxTv_SdtTARTICU_Tipartdsc_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Tipartdsc_N");
      gxTv_SdtTARTICU_Tipartdsc_N = value ;
   }

   public void setgxTv_SdtTARTICU_Tipartdsc_N_SetNull( )
   {
      gxTv_SdtTARTICU_Tipartdsc_N = (byte)(0) ;
      SetDirty("Tipartdsc_N");
   }

   public boolean getgxTv_SdtTARTICU_Tipartdsc_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artpml_N( )
   {
      return gxTv_SdtTARTICU_Artpml_N ;
   }

   public void setgxTv_SdtTARTICU_Artpml_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artpml_N");
      gxTv_SdtTARTICU_Artpml_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artpml_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artpml_N = (byte)(0) ;
      SetDirty("Artpml_N");
   }

   public boolean getgxTv_SdtTARTICU_Artpml_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artgracru_N( )
   {
      return gxTv_SdtTARTICU_Artgracru_N ;
   }

   public void setgxTv_SdtTARTICU_Artgracru_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artgracru_N");
      gxTv_SdtTARTICU_Artgracru_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artgracru_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artgracru_N = (byte)(0) ;
      SetDirty("Artgracru_N");
   }

   public boolean getgxTv_SdtTARTICU_Artgracru_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artcrumin_N( )
   {
      return gxTv_SdtTARTICU_Artcrumin_N ;
   }

   public void setgxTv_SdtTARTICU_Artcrumin_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artcrumin_N");
      gxTv_SdtTARTICU_Artcrumin_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artcrumin_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artcrumin_N = (byte)(0) ;
      SetDirty("Artcrumin_N");
   }

   public boolean getgxTv_SdtTARTICU_Artcrumin_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artcrumax_N( )
   {
      return gxTv_SdtTARTICU_Artcrumax_N ;
   }

   public void setgxTv_SdtTARTICU_Artcrumax_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artcrumax_N");
      gxTv_SdtTARTICU_Artcrumax_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artcrumax_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artcrumax_N = (byte)(0) ;
      SetDirty("Artcrumax_N");
   }

   public boolean getgxTv_SdtTARTICU_Artcrumax_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artacamin_N( )
   {
      return gxTv_SdtTARTICU_Artacamin_N ;
   }

   public void setgxTv_SdtTARTICU_Artacamin_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artacamin_N");
      gxTv_SdtTARTICU_Artacamin_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artacamin_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artacamin_N = (byte)(0) ;
      SetDirty("Artacamin_N");
   }

   public boolean getgxTv_SdtTARTICU_Artacamin_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artacamax_N( )
   {
      return gxTv_SdtTARTICU_Artacamax_N ;
   }

   public void setgxTv_SdtTARTICU_Artacamax_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artacamax_N");
      gxTv_SdtTARTICU_Artacamax_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artacamax_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artacamax_N = (byte)(0) ;
      SetDirty("Artacamax_N");
   }

   public boolean getgxTv_SdtTARTICU_Artacamax_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artren_N( )
   {
      return gxTv_SdtTARTICU_Artren_N ;
   }

   public void setgxTv_SdtTARTICU_Artren_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artren_N");
      gxTv_SdtTARTICU_Artren_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artren_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artren_N = (byte)(0) ;
      SetDirty("Artren_N");
   }

   public boolean getgxTv_SdtTARTICU_Artren_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Arttipple_N( )
   {
      return gxTv_SdtTARTICU_Arttipple_N ;
   }

   public void setgxTv_SdtTARTICU_Arttipple_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arttipple_N");
      gxTv_SdtTARTICU_Arttipple_N = value ;
   }

   public void setgxTv_SdtTARTICU_Arttipple_N_SetNull( )
   {
      gxTv_SdtTARTICU_Arttipple_N = (byte)(0) ;
      SetDirty("Arttipple_N");
   }

   public boolean getgxTv_SdtTARTICU_Arttipple_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Arttiplar_N( )
   {
      return gxTv_SdtTARTICU_Arttiplar_N ;
   }

   public void setgxTv_SdtTARTICU_Arttiplar_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arttiplar_N");
      gxTv_SdtTARTICU_Arttiplar_N = value ;
   }

   public void setgxTv_SdtTARTICU_Arttiplar_N_SetNull( )
   {
      gxTv_SdtTARTICU_Arttiplar_N = (byte)(0) ;
      SetDirty("Arttiplar_N");
   }

   public boolean getgxTv_SdtTARTICU_Arttiplar_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artcorori_N( )
   {
      return gxTv_SdtTARTICU_Artcorori_N ;
   }

   public void setgxTv_SdtTARTICU_Artcorori_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artcorori_N");
      gxTv_SdtTARTICU_Artcorori_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artcorori_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artcorori_N = (byte)(0) ;
      SetDirty("Artcorori_N");
   }

   public boolean getgxTv_SdtTARTICU_Artcorori_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artencori_N( )
   {
      return gxTv_SdtTARTICU_Artencori_N ;
   }

   public void setgxTv_SdtTARTICU_Artencori_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artencori_N");
      gxTv_SdtTARTICU_Artencori_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artencori_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artencori_N = (byte)(0) ;
      SetDirty("Artencori_N");
   }

   public boolean getgxTv_SdtTARTICU_Artencori_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artsua_N( )
   {
      return gxTv_SdtTARTICU_Artsua_N ;
   }

   public void setgxTv_SdtTARTICU_Artsua_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artsua_N");
      gxTv_SdtTARTICU_Artsua_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artsua_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artsua_N = (byte)(0) ;
      SetDirty("Artsua_N");
   }

   public boolean getgxTv_SdtTARTICU_Artsua_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artacaqui_N( )
   {
      return gxTv_SdtTARTICU_Artacaqui_N ;
   }

   public void setgxTv_SdtTARTICU_Artacaqui_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artacaqui_N");
      gxTv_SdtTARTICU_Artacaqui_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artacaqui_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artacaqui_N = (byte)(0) ;
      SetDirty("Artacaqui_N");
   }

   public boolean getgxTv_SdtTARTICU_Artacaqui_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Arteti_N( )
   {
      return gxTv_SdtTARTICU_Arteti_N ;
   }

   public void setgxTv_SdtTARTICU_Arteti_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arteti_N");
      gxTv_SdtTARTICU_Arteti_N = value ;
   }

   public void setgxTv_SdtTARTICU_Arteti_N_SetNull( )
   {
      gxTv_SdtTARTICU_Arteti_N = (byte)(0) ;
      SetDirty("Arteti_N");
   }

   public boolean getgxTv_SdtTARTICU_Arteti_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Arturg_N( )
   {
      return gxTv_SdtTARTICU_Arturg_N ;
   }

   public void setgxTv_SdtTARTICU_Arturg_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arturg_N");
      gxTv_SdtTARTICU_Arturg_N = value ;
   }

   public void setgxTv_SdtTARTICU_Arturg_N_SetNull( )
   {
      gxTv_SdtTARTICU_Arturg_N = (byte)(0) ;
      SetDirty("Arturg_N");
   }

   public boolean getgxTv_SdtTARTICU_Arturg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artmer_N( )
   {
      return gxTv_SdtTARTICU_Artmer_N ;
   }

   public void setgxTv_SdtTARTICU_Artmer_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artmer_N");
      gxTv_SdtTARTICU_Artmer_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artmer_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artmer_N = (byte)(0) ;
      SetDirty("Artmer_N");
   }

   public boolean getgxTv_SdtTARTICU_Artmer_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Arttra1_N( )
   {
      return gxTv_SdtTARTICU_Arttra1_N ;
   }

   public void setgxTv_SdtTARTICU_Arttra1_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arttra1_N");
      gxTv_SdtTARTICU_Arttra1_N = value ;
   }

   public void setgxTv_SdtTARTICU_Arttra1_N_SetNull( )
   {
      gxTv_SdtTARTICU_Arttra1_N = (byte)(0) ;
      SetDirty("Arttra1_N");
   }

   public boolean getgxTv_SdtTARTICU_Arttra1_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Arttra2_N( )
   {
      return gxTv_SdtTARTICU_Arttra2_N ;
   }

   public void setgxTv_SdtTARTICU_Arttra2_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arttra2_N");
      gxTv_SdtTARTICU_Arttra2_N = value ;
   }

   public void setgxTv_SdtTARTICU_Arttra2_N_SetNull( )
   {
      gxTv_SdtTARTICU_Arttra2_N = (byte)(0) ;
      SetDirty("Arttra2_N");
   }

   public boolean getgxTv_SdtTARTICU_Arttra2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Arttra3_N( )
   {
      return gxTv_SdtTARTICU_Arttra3_N ;
   }

   public void setgxTv_SdtTARTICU_Arttra3_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arttra3_N");
      gxTv_SdtTARTICU_Arttra3_N = value ;
   }

   public void setgxTv_SdtTARTICU_Arttra3_N_SetNull( )
   {
      gxTv_SdtTARTICU_Arttra3_N = (byte)(0) ;
      SetDirty("Arttra3_N");
   }

   public boolean getgxTv_SdtTARTICU_Arttra3_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Arttrap1_N( )
   {
      return gxTv_SdtTARTICU_Arttrap1_N ;
   }

   public void setgxTv_SdtTARTICU_Arttrap1_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arttrap1_N");
      gxTv_SdtTARTICU_Arttrap1_N = value ;
   }

   public void setgxTv_SdtTARTICU_Arttrap1_N_SetNull( )
   {
      gxTv_SdtTARTICU_Arttrap1_N = (byte)(0) ;
      SetDirty("Arttrap1_N");
   }

   public boolean getgxTv_SdtTARTICU_Arttrap1_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Arttrap2_N( )
   {
      return gxTv_SdtTARTICU_Arttrap2_N ;
   }

   public void setgxTv_SdtTARTICU_Arttrap2_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arttrap2_N");
      gxTv_SdtTARTICU_Arttrap2_N = value ;
   }

   public void setgxTv_SdtTARTICU_Arttrap2_N_SetNull( )
   {
      gxTv_SdtTARTICU_Arttrap2_N = (byte)(0) ;
      SetDirty("Arttrap2_N");
   }

   public boolean getgxTv_SdtTARTICU_Arttrap2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Arttrap3_N( )
   {
      return gxTv_SdtTARTICU_Arttrap3_N ;
   }

   public void setgxTv_SdtTARTICU_Arttrap3_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arttrap3_N");
      gxTv_SdtTARTICU_Arttrap3_N = value ;
   }

   public void setgxTv_SdtTARTICU_Arttrap3_N_SetNull( )
   {
      gxTv_SdtTARTICU_Arttrap3_N = (byte)(0) ;
      SetDirty("Arttrap3_N");
   }

   public boolean getgxTv_SdtTARTICU_Arttrap3_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Arturd1_N( )
   {
      return gxTv_SdtTARTICU_Arturd1_N ;
   }

   public void setgxTv_SdtTARTICU_Arturd1_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arturd1_N");
      gxTv_SdtTARTICU_Arturd1_N = value ;
   }

   public void setgxTv_SdtTARTICU_Arturd1_N_SetNull( )
   {
      gxTv_SdtTARTICU_Arturd1_N = (byte)(0) ;
      SetDirty("Arturd1_N");
   }

   public boolean getgxTv_SdtTARTICU_Arturd1_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Arturd2_N( )
   {
      return gxTv_SdtTARTICU_Arturd2_N ;
   }

   public void setgxTv_SdtTARTICU_Arturd2_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arturd2_N");
      gxTv_SdtTARTICU_Arturd2_N = value ;
   }

   public void setgxTv_SdtTARTICU_Arturd2_N_SetNull( )
   {
      gxTv_SdtTARTICU_Arturd2_N = (byte)(0) ;
      SetDirty("Arturd2_N");
   }

   public boolean getgxTv_SdtTARTICU_Arturd2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Arturd3_N( )
   {
      return gxTv_SdtTARTICU_Arturd3_N ;
   }

   public void setgxTv_SdtTARTICU_Arturd3_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arturd3_N");
      gxTv_SdtTARTICU_Arturd3_N = value ;
   }

   public void setgxTv_SdtTARTICU_Arturd3_N_SetNull( )
   {
      gxTv_SdtTARTICU_Arturd3_N = (byte)(0) ;
      SetDirty("Arturd3_N");
   }

   public boolean getgxTv_SdtTARTICU_Arturd3_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Arturdp1_N( )
   {
      return gxTv_SdtTARTICU_Arturdp1_N ;
   }

   public void setgxTv_SdtTARTICU_Arturdp1_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arturdp1_N");
      gxTv_SdtTARTICU_Arturdp1_N = value ;
   }

   public void setgxTv_SdtTARTICU_Arturdp1_N_SetNull( )
   {
      gxTv_SdtTARTICU_Arturdp1_N = (byte)(0) ;
      SetDirty("Arturdp1_N");
   }

   public boolean getgxTv_SdtTARTICU_Arturdp1_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Arturdp2_N( )
   {
      return gxTv_SdtTARTICU_Arturdp2_N ;
   }

   public void setgxTv_SdtTARTICU_Arturdp2_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arturdp2_N");
      gxTv_SdtTARTICU_Arturdp2_N = value ;
   }

   public void setgxTv_SdtTARTICU_Arturdp2_N_SetNull( )
   {
      gxTv_SdtTARTICU_Arturdp2_N = (byte)(0) ;
      SetDirty("Arturdp2_N");
   }

   public boolean getgxTv_SdtTARTICU_Arturdp2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Arturdp3_N( )
   {
      return gxTv_SdtTARTICU_Arturdp3_N ;
   }

   public void setgxTv_SdtTARTICU_Arturdp3_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arturdp3_N");
      gxTv_SdtTARTICU_Arturdp3_N = value ;
   }

   public void setgxTv_SdtTARTICU_Arturdp3_N_SetNull( )
   {
      gxTv_SdtTARTICU_Arturdp3_N = (byte)(0) ;
      SetDirty("Arturdp3_N");
   }

   public boolean getgxTv_SdtTARTICU_Arturdp3_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artenccom_N( )
   {
      return gxTv_SdtTARTICU_Artenccom_N ;
   }

   public void setgxTv_SdtTARTICU_Artenccom_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artenccom_N");
      gxTv_SdtTARTICU_Artenccom_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artenccom_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artenccom_N = (byte)(0) ;
      SetDirty("Artenccom_N");
   }

   public boolean getgxTv_SdtTARTICU_Artenccom_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artencanh_N( )
   {
      return gxTv_SdtTARTICU_Artencanh_N ;
   }

   public void setgxTv_SdtTARTICU_Artencanh_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artencanh_N");
      gxTv_SdtTARTICU_Artencanh_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artencanh_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artencanh_N = (byte)(0) ;
      SetDirty("Artencanh_N");
   }

   public boolean getgxTv_SdtTARTICU_Artencanh_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artgraaca_N( )
   {
      return gxTv_SdtTARTICU_Artgraaca_N ;
   }

   public void setgxTv_SdtTARTICU_Artgraaca_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artgraaca_N");
      gxTv_SdtTARTICU_Artgraaca_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artgraaca_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artgraaca_N = (byte)(0) ;
      SetDirty("Artgraaca_N");
   }

   public boolean getgxTv_SdtTARTICU_Artgraaca_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artrdoa_N( )
   {
      return gxTv_SdtTARTICU_Artrdoa_N ;
   }

   public void setgxTv_SdtTARTICU_Artrdoa_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artrdoa_N");
      gxTv_SdtTARTICU_Artrdoa_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artrdoa_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artrdoa_N = (byte)(0) ;
      SetDirty("Artrdoa_N");
   }

   public boolean getgxTv_SdtTARTICU_Artrdoa_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artrdon_N( )
   {
      return gxTv_SdtTARTICU_Artrdon_N ;
   }

   public void setgxTv_SdtTARTICU_Artrdon_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artrdon_N");
      gxTv_SdtTARTICU_Artrdon_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artrdon_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artrdon_N = (byte)(0) ;
      SetDirty("Artrdon_N");
   }

   public boolean getgxTv_SdtTARTICU_Artrdon_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artfacabs_N( )
   {
      return gxTv_SdtTARTICU_Artfacabs_N ;
   }

   public void setgxTv_SdtTARTICU_Artfacabs_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artfacabs_N");
      gxTv_SdtTARTICU_Artfacabs_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artfacabs_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artfacabs_N = (byte)(0) ;
      SetDirty("Artfacabs_N");
   }

   public boolean getgxTv_SdtTARTICU_Artfacabs_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artple2_N( )
   {
      return gxTv_SdtTARTICU_Artple2_N ;
   }

   public void setgxTv_SdtTARTICU_Artple2_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artple2_N");
      gxTv_SdtTARTICU_Artple2_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artple2_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artple2_N = (byte)(0) ;
      SetDirty("Artple2_N");
   }

   public boolean getgxTv_SdtTARTICU_Artple2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artnumcor_N( )
   {
      return gxTv_SdtTARTICU_Artnumcor_N ;
   }

   public void setgxTv_SdtTARTICU_Artnumcor_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artnumcor_N");
      gxTv_SdtTARTICU_Artnumcor_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artnumcor_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artnumcor_N = (byte)(0) ;
      SetDirty("Artnumcor_N");
   }

   public boolean getgxTv_SdtTARTICU_Artnumcor_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artancsal1_N( )
   {
      return gxTv_SdtTARTICU_Artancsal1_N ;
   }

   public void setgxTv_SdtTARTICU_Artancsal1_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artancsal1_N");
      gxTv_SdtTARTICU_Artancsal1_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artancsal1_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artancsal1_N = (byte)(0) ;
      SetDirty("Artancsal1_N");
   }

   public boolean getgxTv_SdtTARTICU_Artancsal1_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artancsal2_N( )
   {
      return gxTv_SdtTARTICU_Artancsal2_N ;
   }

   public void setgxTv_SdtTARTICU_Artancsal2_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artancsal2_N");
      gxTv_SdtTARTICU_Artancsal2_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artancsal2_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artancsal2_N = (byte)(0) ;
      SetDirty("Artancsal2_N");
   }

   public boolean getgxTv_SdtTARTICU_Artancsal2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artancsal3_N( )
   {
      return gxTv_SdtTARTICU_Artancsal3_N ;
   }

   public void setgxTv_SdtTARTICU_Artancsal3_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artancsal3_N");
      gxTv_SdtTARTICU_Artancsal3_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artancsal3_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artancsal3_N = (byte)(0) ;
      SetDirty("Artancsal3_N");
   }

   public boolean getgxTv_SdtTARTICU_Artancsal3_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artgraaca2_N( )
   {
      return gxTv_SdtTARTICU_Artgraaca2_N ;
   }

   public void setgxTv_SdtTARTICU_Artgraaca2_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artgraaca2_N");
      gxTv_SdtTARTICU_Artgraaca2_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artgraaca2_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artgraaca2_N = (byte)(0) ;
      SetDirty("Artgraaca2_N");
   }

   public boolean getgxTv_SdtTARTICU_Artgraaca2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artgracru2_N( )
   {
      return gxTv_SdtTARTICU_Artgracru2_N ;
   }

   public void setgxTv_SdtTARTICU_Artgracru2_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artgracru2_N");
      gxTv_SdtTARTICU_Artgracru2_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artgracru2_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artgracru2_N = (byte)(0) ;
      SetDirty("Artgracru2_N");
   }

   public boolean getgxTv_SdtTARTICU_Artgracru2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Clascod_N( )
   {
      return gxTv_SdtTARTICU_Clascod_N ;
   }

   public void setgxTv_SdtTARTICU_Clascod_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Clascod_N");
      gxTv_SdtTARTICU_Clascod_N = value ;
   }

   public void setgxTv_SdtTARTICU_Clascod_N_SetNull( )
   {
      gxTv_SdtTARTICU_Clascod_N = (byte)(0) ;
      SetDirty("Clascod_N");
   }

   public boolean getgxTv_SdtTARTICU_Clascod_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artpmppza_N( )
   {
      return gxTv_SdtTARTICU_Artpmppza_N ;
   }

   public void setgxTv_SdtTARTICU_Artpmppza_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artpmppza_N");
      gxTv_SdtTARTICU_Artpmppza_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artpmppza_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artpmppza_N = (byte)(0) ;
      SetDirty("Artpmppza_N");
   }

   public boolean getgxTv_SdtTARTICU_Artpmppza_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artfeccre_N( )
   {
      return gxTv_SdtTARTICU_Artfeccre_N ;
   }

   public void setgxTv_SdtTARTICU_Artfeccre_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artfeccre_N");
      gxTv_SdtTARTICU_Artfeccre_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artfeccre_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artfeccre_N = (byte)(0) ;
      SetDirty("Artfeccre_N");
   }

   public boolean getgxTv_SdtTARTICU_Artfeccre_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artusrcod_N( )
   {
      return gxTv_SdtTARTICU_Artusrcod_N ;
   }

   public void setgxTv_SdtTARTICU_Artusrcod_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artusrcod_N");
      gxTv_SdtTARTICU_Artusrcod_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artusrcod_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artusrcod_N = (byte)(0) ;
      SetDirty("Artusrcod_N");
   }

   public boolean getgxTv_SdtTARTICU_Artusrcod_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artfecmod_N( )
   {
      return gxTv_SdtTARTICU_Artfecmod_N ;
   }

   public void setgxTv_SdtTARTICU_Artfecmod_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artfecmod_N");
      gxTv_SdtTARTICU_Artfecmod_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artfecmod_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artfecmod_N = (byte)(0) ;
      SetDirty("Artfecmod_N");
   }

   public boolean getgxTv_SdtTARTICU_Artfecmod_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Clasdsc_N( )
   {
      return gxTv_SdtTARTICU_Clasdsc_N ;
   }

   public void setgxTv_SdtTARTICU_Clasdsc_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Clasdsc_N");
      gxTv_SdtTARTICU_Clasdsc_N = value ;
   }

   public void setgxTv_SdtTARTICU_Clasdsc_N_SetNull( )
   {
      gxTv_SdtTARTICU_Clasdsc_N = (byte)(0) ;
      SetDirty("Clasdsc_N");
   }

   public boolean getgxTv_SdtTARTICU_Clasdsc_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artcomer_N( )
   {
      return gxTv_SdtTARTICU_Artcomer_N ;
   }

   public void setgxTv_SdtTARTICU_Artcomer_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artcomer_N");
      gxTv_SdtTARTICU_Artcomer_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artcomer_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artcomer_N = (byte)(0) ;
      SetDirty("Artcomer_N");
   }

   public boolean getgxTv_SdtTARTICU_Artcomer_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Clatubcod_N( )
   {
      return gxTv_SdtTARTICU_Clatubcod_N ;
   }

   public void setgxTv_SdtTARTICU_Clatubcod_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Clatubcod_N");
      gxTv_SdtTARTICU_Clatubcod_N = value ;
   }

   public void setgxTv_SdtTARTICU_Clatubcod_N_SetNull( )
   {
      gxTv_SdtTARTICU_Clatubcod_N = (byte)(0) ;
      SetDirty("Clatubcod_N");
   }

   public boolean getgxTv_SdtTARTICU_Clatubcod_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Clatubdsc_N( )
   {
      return gxTv_SdtTARTICU_Clatubdsc_N ;
   }

   public void setgxTv_SdtTARTICU_Clatubdsc_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Clatubdsc_N");
      gxTv_SdtTARTICU_Clatubdsc_N = value ;
   }

   public void setgxTv_SdtTARTICU_Clatubdsc_N_SetNull( )
   {
      gxTv_SdtTARTICU_Clatubdsc_N = (byte)(0) ;
      SetDirty("Clatubdsc_N");
   }

   public boolean getgxTv_SdtTARTICU_Clatubdsc_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Clabolcod_N( )
   {
      return gxTv_SdtTARTICU_Clabolcod_N ;
   }

   public void setgxTv_SdtTARTICU_Clabolcod_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Clabolcod_N");
      gxTv_SdtTARTICU_Clabolcod_N = value ;
   }

   public void setgxTv_SdtTARTICU_Clabolcod_N_SetNull( )
   {
      gxTv_SdtTARTICU_Clabolcod_N = (byte)(0) ;
      SetDirty("Clabolcod_N");
   }

   public boolean getgxTv_SdtTARTICU_Clabolcod_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Claboldsc_N( )
   {
      return gxTv_SdtTARTICU_Claboldsc_N ;
   }

   public void setgxTv_SdtTARTICU_Claboldsc_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Claboldsc_N");
      gxTv_SdtTARTICU_Claboldsc_N = value ;
   }

   public void setgxTv_SdtTARTICU_Claboldsc_N_SetNull( )
   {
      gxTv_SdtTARTICU_Claboldsc_N = (byte)(0) ;
      SetDirty("Claboldsc_N");
   }

   public boolean getgxTv_SdtTARTICU_Claboldsc_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artrdocru1_N( )
   {
      return gxTv_SdtTARTICU_Artrdocru1_N ;
   }

   public void setgxTv_SdtTARTICU_Artrdocru1_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artrdocru1_N");
      gxTv_SdtTARTICU_Artrdocru1_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artrdocru1_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artrdocru1_N = (byte)(0) ;
      SetDirty("Artrdocru1_N");
   }

   public boolean getgxTv_SdtTARTICU_Artrdocru1_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artrdocru2_N( )
   {
      return gxTv_SdtTARTICU_Artrdocru2_N ;
   }

   public void setgxTv_SdtTARTICU_Artrdocru2_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artrdocru2_N");
      gxTv_SdtTARTICU_Artrdocru2_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artrdocru2_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artrdocru2_N = (byte)(0) ;
      SetDirty("Artrdocru2_N");
   }

   public boolean getgxTv_SdtTARTICU_Artrdocru2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artnmtr_N( )
   {
      return gxTv_SdtTARTICU_Artnmtr_N ;
   }

   public void setgxTv_SdtTARTICU_Artnmtr_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artnmtr_N");
      gxTv_SdtTARTICU_Artnmtr_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artnmtr_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artnmtr_N = (byte)(0) ;
      SetDirty("Artnmtr_N");
   }

   public boolean getgxTv_SdtTARTICU_Artnmtr_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artlu_N( )
   {
      return gxTv_SdtTARTICU_Artlu_N ;
   }

   public void setgxTv_SdtTARTICU_Artlu_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artlu_N");
      gxTv_SdtTARTICU_Artlu_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artlu_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artlu_N = (byte)(0) ;
      SetDirty("Artlu_N");
   }

   public boolean getgxTv_SdtTARTICU_Artlu_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artrb_N( )
   {
      return gxTv_SdtTARTICU_Artrb_N ;
   }

   public void setgxTv_SdtTARTICU_Artrb_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artrb_N");
      gxTv_SdtTARTICU_Artrb_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artrb_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artrb_N = (byte)(0) ;
      SetDirty("Artrb_N");
   }

   public boolean getgxTv_SdtTARTICU_Artrb_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artpelanh_N( )
   {
      return gxTv_SdtTARTICU_Artpelanh_N ;
   }

   public void setgxTv_SdtTARTICU_Artpelanh_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artpelanh_N");
      gxTv_SdtTARTICU_Artpelanh_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artpelanh_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artpelanh_N = (byte)(0) ;
      SetDirty("Artpelanh_N");
   }

   public boolean getgxTv_SdtTARTICU_Artpelanh_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artgrm2sc_N( )
   {
      return gxTv_SdtTARTICU_Artgrm2sc_N ;
   }

   public void setgxTv_SdtTARTICU_Artgrm2sc_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artgrm2sc_N");
      gxTv_SdtTARTICU_Artgrm2sc_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artgrm2sc_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artgrm2sc_N = (byte)(0) ;
      SetDirty("Artgrm2sc_N");
   }

   public boolean getgxTv_SdtTARTICU_Artgrm2sc_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artpmlsc_N( )
   {
      return gxTv_SdtTARTICU_Artpmlsc_N ;
   }

   public void setgxTv_SdtTARTICU_Artpmlsc_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artpmlsc_N");
      gxTv_SdtTARTICU_Artpmlsc_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artpmlsc_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artpmlsc_N = (byte)(0) ;
      SetDirty("Artpmlsc_N");
   }

   public boolean getgxTv_SdtTARTICU_Artpmlsc_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artancsc_N( )
   {
      return gxTv_SdtTARTICU_Artancsc_N ;
   }

   public void setgxTv_SdtTARTICU_Artancsc_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artancsc_N");
      gxTv_SdtTARTICU_Artancsc_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artancsc_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artancsc_N = (byte)(0) ;
      SetDirty("Artancsc_N");
   }

   public boolean getgxTv_SdtTARTICU_Artancsc_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artpmlcru_N( )
   {
      return gxTv_SdtTARTICU_Artpmlcru_N ;
   }

   public void setgxTv_SdtTARTICU_Artpmlcru_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artpmlcru_N");
      gxTv_SdtTARTICU_Artpmlcru_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artpmlcru_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artpmlcru_N = (byte)(0) ;
      SetDirty("Artpmlcru_N");
   }

   public boolean getgxTv_SdtTARTICU_Artpmlcru_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artrdtsc_N( )
   {
      return gxTv_SdtTARTICU_Artrdtsc_N ;
   }

   public void setgxTv_SdtTARTICU_Artrdtsc_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artrdtsc_N");
      gxTv_SdtTARTICU_Artrdtsc_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artrdtsc_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artrdtsc_N = (byte)(0) ;
      SetDirty("Artrdtsc_N");
   }

   public boolean getgxTv_SdtTARTICU_Artrdtsc_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artund_N( )
   {
      return gxTv_SdtTARTICU_Artund_N ;
   }

   public void setgxTv_SdtTARTICU_Artund_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artund_N");
      gxTv_SdtTARTICU_Artund_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artund_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artund_N = (byte)(0) ;
      SetDirty("Artund_N");
   }

   public boolean getgxTv_SdtTARTICU_Artund_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artblo_N( )
   {
      return gxTv_SdtTARTICU_Artblo_N ;
   }

   public void setgxTv_SdtTARTICU_Artblo_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artblo_N");
      gxTv_SdtTARTICU_Artblo_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artblo_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artblo_N = (byte)(0) ;
      SetDirty("Artblo_N");
   }

   public boolean getgxTv_SdtTARTICU_Artblo_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artcla_N( )
   {
      return gxTv_SdtTARTICU_Artcla_N ;
   }

   public void setgxTv_SdtTARTICU_Artcla_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artcla_N");
      gxTv_SdtTARTICU_Artcla_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artcla_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artcla_N = (byte)(0) ;
      SetDirty("Artcla_N");
   }

   public boolean getgxTv_SdtTARTICU_Artcla_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Tipartdsc2_N( )
   {
      return gxTv_SdtTARTICU_Tipartdsc2_N ;
   }

   public void setgxTv_SdtTARTICU_Tipartdsc2_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Tipartdsc2_N");
      gxTv_SdtTARTICU_Tipartdsc2_N = value ;
   }

   public void setgxTv_SdtTARTICU_Tipartdsc2_N_SetNull( )
   {
      gxTv_SdtTARTICU_Tipartdsc2_N = (byte)(0) ;
      SetDirty("Tipartdsc2_N");
   }

   public boolean getgxTv_SdtTARTICU_Tipartdsc2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artfabsh_N( )
   {
      return gxTv_SdtTARTICU_Artfabsh_N ;
   }

   public void setgxTv_SdtTARTICU_Artfabsh_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artfabsh_N");
      gxTv_SdtTARTICU_Artfabsh_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artfabsh_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artfabsh_N = (byte)(0) ;
      SetDirty("Artfabsh_N");
   }

   public boolean getgxTv_SdtTARTICU_Artfabsh_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artfabst_N( )
   {
      return gxTv_SdtTARTICU_Artfabst_N ;
   }

   public void setgxTv_SdtTARTICU_Artfabst_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artfabst_N");
      gxTv_SdtTARTICU_Artfabst_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artfabst_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artfabst_N = (byte)(0) ;
      SetDirty("Artfabst_N");
   }

   public boolean getgxTv_SdtTARTICU_Artfabst_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artnprog_N( )
   {
      return gxTv_SdtTARTICU_Artnprog_N ;
   }

   public void setgxTv_SdtTARTICU_Artnprog_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artnprog_N");
      gxTv_SdtTARTICU_Artnprog_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artnprog_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artnprog_N = (byte)(0) ;
      SetDirty("Artnprog_N");
   }

   public boolean getgxTv_SdtTARTICU_Artnprog_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artvbd_N( )
   {
      return gxTv_SdtTARTICU_Artvbd_N ;
   }

   public void setgxTv_SdtTARTICU_Artvbd_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artvbd_N");
      gxTv_SdtTARTICU_Artvbd_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artvbd_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artvbd_N = (byte)(0) ;
      SetDirty("Artvbd_N");
   }

   public boolean getgxTv_SdtTARTICU_Artvbd_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artvbn_N( )
   {
      return gxTv_SdtTARTICU_Artvbn_N ;
   }

   public void setgxTv_SdtTARTICU_Artvbn_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artvbn_N");
      gxTv_SdtTARTICU_Artvbn_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artvbn_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artvbn_N = (byte)(0) ;
      SetDirty("Artvbn_N");
   }

   public boolean getgxTv_SdtTARTICU_Artvbn_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artab_N( )
   {
      return gxTv_SdtTARTICU_Artab_N ;
   }

   public void setgxTv_SdtTARTICU_Artab_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artab_N");
      gxTv_SdtTARTICU_Artab_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artab_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artab_N = (byte)(0) ;
      SetDirty("Artab_N");
   }

   public boolean getgxTv_SdtTARTICU_Artab_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artobsgrm_N( )
   {
      return gxTv_SdtTARTICU_Artobsgrm_N ;
   }

   public void setgxTv_SdtTARTICU_Artobsgrm_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artobsgrm_N");
      gxTv_SdtTARTICU_Artobsgrm_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artobsgrm_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artobsgrm_N = (byte)(0) ;
      SetDirty("Artobsgrm_N");
   }

   public boolean getgxTv_SdtTARTICU_Artobsgrm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artobsanc_N( )
   {
      return gxTv_SdtTARTICU_Artobsanc_N ;
   }

   public void setgxTv_SdtTARTICU_Artobsanc_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artobsanc_N");
      gxTv_SdtTARTICU_Artobsanc_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artobsanc_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artobsanc_N = (byte)(0) ;
      SetDirty("Artobsanc_N");
   }

   public boolean getgxTv_SdtTARTICU_Artobsanc_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artcdb_N( )
   {
      return gxTv_SdtTARTICU_Artcdb_N ;
   }

   public void setgxTv_SdtTARTICU_Artcdb_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artcdb_N");
      gxTv_SdtTARTICU_Artcdb_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artcdb_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artcdb_N = (byte)(0) ;
      SetDirty("Artcdb_N");
   }

   public boolean getgxTv_SdtTARTICU_Artcdb_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artgalga_N( )
   {
      return gxTv_SdtTARTICU_Artgalga_N ;
   }

   public void setgxTv_SdtTARTICU_Artgalga_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artgalga_N");
      gxTv_SdtTARTICU_Artgalga_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artgalga_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artgalga_N = (byte)(0) ;
      SetDirty("Artgalga_N");
   }

   public boolean getgxTv_SdtTARTICU_Artgalga_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artplatina_N( )
   {
      return gxTv_SdtTARTICU_Artplatina_N ;
   }

   public void setgxTv_SdtTARTICU_Artplatina_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artplatina_N");
      gxTv_SdtTARTICU_Artplatina_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artplatina_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artplatina_N = (byte)(0) ;
      SetDirty("Artplatina_N");
   }

   public boolean getgxTv_SdtTARTICU_Artplatina_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artpgd_N( )
   {
      return gxTv_SdtTARTICU_Artpgd_N ;
   }

   public void setgxTv_SdtTARTICU_Artpgd_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artpgd_N");
      gxTv_SdtTARTICU_Artpgd_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artpgd_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artpgd_N = (byte)(0) ;
      SetDirty("Artpgd_N");
   }

   public boolean getgxTv_SdtTARTICU_Artpgd_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artth_N( )
   {
      return gxTv_SdtTARTICU_Artth_N ;
   }

   public void setgxTv_SdtTARTICU_Artth_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artth_N");
      gxTv_SdtTARTICU_Artth_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artth_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artth_N = (byte)(0) ;
      SetDirty("Artth_N");
   }

   public boolean getgxTv_SdtTARTICU_Artth_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artthn_N( )
   {
      return gxTv_SdtTARTICU_Artthn_N ;
   }

   public void setgxTv_SdtTARTICU_Artthn_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artthn_N");
      gxTv_SdtTARTICU_Artthn_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artthn_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artthn_N = (byte)(0) ;
      SetDirty("Artthn_N");
   }

   public boolean getgxTv_SdtTARTICU_Artthn_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Art_cd_N( )
   {
      return gxTv_SdtTARTICU_Art_cd_N ;
   }

   public void setgxTv_SdtTARTICU_Art_cd_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Art_cd_N");
      gxTv_SdtTARTICU_Art_cd_N = value ;
   }

   public void setgxTv_SdtTARTICU_Art_cd_N_SetNull( )
   {
      gxTv_SdtTARTICU_Art_cd_N = (byte)(0) ;
      SetDirty("Art_cd_N");
   }

   public boolean getgxTv_SdtTARTICU_Art_cd_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Art_dc_N( )
   {
      return gxTv_SdtTARTICU_Art_dc_N ;
   }

   public void setgxTv_SdtTARTICU_Art_dc_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Art_dc_N");
      gxTv_SdtTARTICU_Art_dc_N = value ;
   }

   public void setgxTv_SdtTARTICU_Art_dc_N_SetNull( )
   {
      gxTv_SdtTARTICU_Art_dc_N = (byte)(0) ;
      SetDirty("Art_dc_N");
   }

   public boolean getgxTv_SdtTARTICU_Art_dc_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Arthilos_N( )
   {
      return gxTv_SdtTARTICU_Arthilos_N ;
   }

   public void setgxTv_SdtTARTICU_Arthilos_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arthilos_N");
      gxTv_SdtTARTICU_Arthilos_N = value ;
   }

   public void setgxTv_SdtTARTICU_Arthilos_N_SetNull( )
   {
      gxTv_SdtTARTICU_Arthilos_N = (byte)(0) ;
      SetDirty("Arthilos_N");
   }

   public boolean getgxTv_SdtTARTICU_Arthilos_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artpasad_N( )
   {
      return gxTv_SdtTARTICU_Artpasad_N ;
   }

   public void setgxTv_SdtTARTICU_Artpasad_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artpasad_N");
      gxTv_SdtTARTICU_Artpasad_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artpasad_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artpasad_N = (byte)(0) ;
      SetDirty("Artpasad_N");
   }

   public boolean getgxTv_SdtTARTICU_Artpasad_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artancc_N( )
   {
      return gxTv_SdtTARTICU_Artancc_N ;
   }

   public void setgxTv_SdtTARTICU_Artancc_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artancc_N");
      gxTv_SdtTARTICU_Artancc_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artancc_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artancc_N = (byte)(0) ;
      SetDirty("Artancc_N");
   }

   public boolean getgxTv_SdtTARTICU_Artancc_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artgrm2c_N( )
   {
      return gxTv_SdtTARTICU_Artgrm2c_N ;
   }

   public void setgxTv_SdtTARTICU_Artgrm2c_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artgrm2c_N");
      gxTv_SdtTARTICU_Artgrm2c_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artgrm2c_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artgrm2c_N = (byte)(0) ;
      SetDirty("Artgrm2c_N");
   }

   public boolean getgxTv_SdtTARTICU_Artgrm2c_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artrdoc_N( )
   {
      return gxTv_SdtTARTICU_Artrdoc_N ;
   }

   public void setgxTv_SdtTARTICU_Artrdoc_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artrdoc_N");
      gxTv_SdtTARTICU_Artrdoc_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artrdoc_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artrdoc_N = (byte)(0) ;
      SetDirty("Artrdoc_N");
   }

   public boolean getgxTv_SdtTARTICU_Artrdoc_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artacafor_N( )
   {
      return gxTv_SdtTARTICU_Artacafor_N ;
   }

   public void setgxTv_SdtTARTICU_Artacafor_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artacafor_N");
      gxTv_SdtTARTICU_Artacafor_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artacafor_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artacafor_N = (byte)(0) ;
      SetDirty("Artacafor_N");
   }

   public boolean getgxTv_SdtTARTICU_Artacafor_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artanu_N( )
   {
      return gxTv_SdtTARTICU_Artanu_N ;
   }

   public void setgxTv_SdtTARTICU_Artanu_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artanu_N");
      gxTv_SdtTARTICU_Artanu_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artanu_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artanu_N = (byte)(0) ;
      SetDirty("Artanu_N");
   }

   public boolean getgxTv_SdtTARTICU_Artanu_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artfacuti_N( )
   {
      return gxTv_SdtTARTICU_Artfacuti_N ;
   }

   public void setgxTv_SdtTARTICU_Artfacuti_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artfacuti_N");
      gxTv_SdtTARTICU_Artfacuti_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artfacuti_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artfacuti_N = (byte)(0) ;
      SetDirty("Artfacuti_N");
   }

   public boolean getgxTv_SdtTARTICU_Artfacuti_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artnumtip_N( )
   {
      return gxTv_SdtTARTICU_Artnumtip_N ;
   }

   public void setgxTv_SdtTARTICU_Artnumtip_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artnumtip_N");
      gxTv_SdtTARTICU_Artnumtip_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artnumtip_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artnumtip_N = (byte)(0) ;
      SetDirty("Artnumtip_N");
   }

   public boolean getgxTv_SdtTARTICU_Artnumtip_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artmt_N( )
   {
      return gxTv_SdtTARTICU_Artmt_N ;
   }

   public void setgxTv_SdtTARTICU_Artmt_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artmt_N");
      gxTv_SdtTARTICU_Artmt_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artmt_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artmt_N = (byte)(0) ;
      SetDirty("Artmt_N");
   }

   public boolean getgxTv_SdtTARTICU_Artmt_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Arttrabs_N( )
   {
      return gxTv_SdtTARTICU_Arttrabs_N ;
   }

   public void setgxTv_SdtTARTICU_Arttrabs_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Arttrabs_N");
      gxTv_SdtTARTICU_Arttrabs_N = value ;
   }

   public void setgxTv_SdtTARTICU_Arttrabs_N_SetNull( )
   {
      gxTv_SdtTARTICU_Arttrabs_N = (byte)(0) ;
      SetDirty("Arttrabs_N");
   }

   public boolean getgxTv_SdtTARTICU_Arttrabs_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artkgmn_N( )
   {
      return gxTv_SdtTARTICU_Artkgmn_N ;
   }

   public void setgxTv_SdtTARTICU_Artkgmn_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artkgmn_N");
      gxTv_SdtTARTICU_Artkgmn_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artkgmn_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artkgmn_N = (byte)(0) ;
      SetDirty("Artkgmn_N");
   }

   public boolean getgxTv_SdtTARTICU_Artkgmn_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artacamar_N( )
   {
      return gxTv_SdtTARTICU_Artacamar_N ;
   }

   public void setgxTv_SdtTARTICU_Artacamar_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artacamar_N");
      gxTv_SdtTARTICU_Artacamar_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artacamar_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artacamar_N = (byte)(0) ;
      SetDirty("Artacamar_N");
   }

   public boolean getgxTv_SdtTARTICU_Artacamar_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artacabak_N( )
   {
      return gxTv_SdtTARTICU_Artacabak_N ;
   }

   public void setgxTv_SdtTARTICU_Artacabak_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artacabak_N");
      gxTv_SdtTARTICU_Artacabak_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artacabak_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artacabak_N = (byte)(0) ;
      SetDirty("Artacabak_N");
   }

   public boolean getgxTv_SdtTARTICU_Artacabak_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artelganc_N( )
   {
      return gxTv_SdtTARTICU_Artelganc_N ;
   }

   public void setgxTv_SdtTARTICU_Artelganc_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artelganc_N");
      gxTv_SdtTARTICU_Artelganc_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artelganc_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artelganc_N = (byte)(0) ;
      SetDirty("Artelganc_N");
   }

   public boolean getgxTv_SdtTARTICU_Artelganc_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artelglar_N( )
   {
      return gxTv_SdtTARTICU_Artelglar_N ;
   }

   public void setgxTv_SdtTARTICU_Artelglar_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artelglar_N");
      gxTv_SdtTARTICU_Artelglar_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artelglar_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artelglar_N = (byte)(0) ;
      SetDirty("Artelglar_N");
   }

   public boolean getgxTv_SdtTARTICU_Artelglar_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artrdocru_N( )
   {
      return gxTv_SdtTARTICU_Artrdocru_N ;
   }

   public void setgxTv_SdtTARTICU_Artrdocru_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artrdocru_N");
      gxTv_SdtTARTICU_Artrdocru_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artrdocru_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artrdocru_N = (byte)(0) ;
      SetDirty("Artrdocru_N");
   }

   public boolean getgxTv_SdtTARTICU_Artrdocru_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artenclarg_N( )
   {
      return gxTv_SdtTARTICU_Artenclarg_N ;
   }

   public void setgxTv_SdtTARTICU_Artenclarg_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artenclarg_N");
      gxTv_SdtTARTICU_Artenclarg_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artenclarg_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artenclarg_N = (byte)(0) ;
      SetDirty("Artenclarg_N");
   }

   public boolean getgxTv_SdtTARTICU_Artenclarg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artencanc_N( )
   {
      return gxTv_SdtTARTICU_Artencanc_N ;
   }

   public void setgxTv_SdtTARTICU_Artencanc_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artencanc_N");
      gxTv_SdtTARTICU_Artencanc_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artencanc_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artencanc_N = (byte)(0) ;
      SetDirty("Artencanc_N");
   }

   public boolean getgxTv_SdtTARTICU_Artencanc_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artrdto4_N( )
   {
      return gxTv_SdtTARTICU_Artrdto4_N ;
   }

   public void setgxTv_SdtTARTICU_Artrdto4_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artrdto4_N");
      gxTv_SdtTARTICU_Artrdto4_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artrdto4_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artrdto4_N = (byte)(0) ;
      SetDirty("Artrdto4_N");
   }

   public boolean getgxTv_SdtTARTICU_Artrdto4_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artdsc2_N( )
   {
      return gxTv_SdtTARTICU_Artdsc2_N ;
   }

   public void setgxTv_SdtTARTICU_Artdsc2_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artdsc2_N");
      gxTv_SdtTARTICU_Artdsc2_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artdsc2_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artdsc2_N = (byte)(0) ;
      SetDirty("Artdsc2_N");
   }

   public boolean getgxTv_SdtTARTICU_Artdsc2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artgrcomp_N( )
   {
      return gxTv_SdtTARTICU_Artgrcomp_N ;
   }

   public void setgxTv_SdtTARTICU_Artgrcomp_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artgrcomp_N");
      gxTv_SdtTARTICU_Artgrcomp_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artgrcomp_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artgrcomp_N = (byte)(0) ;
      SetDirty("Artgrcomp_N");
   }

   public boolean getgxTv_SdtTARTICU_Artgrcomp_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artkgspp_N( )
   {
      return gxTv_SdtTARTICU_Artkgspp_N ;
   }

   public void setgxTv_SdtTARTICU_Artkgspp_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artkgspp_N");
      gxTv_SdtTARTICU_Artkgspp_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artkgspp_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artkgspp_N = (byte)(0) ;
      SetDirty("Artkgspp_N");
   }

   public boolean getgxTv_SdtTARTICU_Artkgspp_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artprepp_N( )
   {
      return gxTv_SdtTARTICU_Artprepp_N ;
   }

   public void setgxTv_SdtTARTICU_Artprepp_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artprepp_N");
      gxTv_SdtTARTICU_Artprepp_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artprepp_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artprepp_N = (byte)(0) ;
      SetDirty("Artprepp_N");
   }

   public boolean getgxTv_SdtTARTICU_Artprepp_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artobslon_N( )
   {
      return gxTv_SdtTARTICU_Artobslon_N ;
   }

   public void setgxTv_SdtTARTICU_Artobslon_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artobslon_N");
      gxTv_SdtTARTICU_Artobslon_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artobslon_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artobslon_N = (byte)(0) ;
      SetDirty("Artobslon_N");
   }

   public boolean getgxTv_SdtTARTICU_Artobslon_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artobsfac_N( )
   {
      return gxTv_SdtTARTICU_Artobsfac_N ;
   }

   public void setgxTv_SdtTARTICU_Artobsfac_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artobsfac_N");
      gxTv_SdtTARTICU_Artobsfac_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artobsfac_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artobsfac_N = (byte)(0) ;
      SetDirty("Artobsfac_N");
   }

   public boolean getgxTv_SdtTARTICU_Artobsfac_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTARTICU_Artobsotras_N( )
   {
      return gxTv_SdtTARTICU_Artobsotras_N ;
   }

   public void setgxTv_SdtTARTICU_Artobsotras_N( byte value )
   {
      gxTv_SdtTARTICU_N = (byte)(0) ;
      SetDirty("Artobsotras_N");
      gxTv_SdtTARTICU_Artobsotras_N = value ;
   }

   public void setgxTv_SdtTARTICU_Artobsotras_N_SetNull( )
   {
      gxTv_SdtTARTICU_Artobsotras_N = (byte)(0) ;
      SetDirty("Artobsotras_N");
   }

   public boolean getgxTv_SdtTARTICU_Artobsotras_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      app.tarticu_bc obj;
      obj = new app.tarticu_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtTARTICU_Emprcod = "" ;
      gxTv_SdtTARTICU_N = (byte)(1) ;
      gxTv_SdtTARTICU_Artcod = "" ;
      gxTv_SdtTARTICU_Artdsc = "" ;
      gxTv_SdtTARTICU_Clinom = "" ;
      gxTv_SdtTARTICU_Artcodext = "" ;
      gxTv_SdtTARTICU_Emprnom = "" ;
      gxTv_SdtTARTICU_Artmat = "" ;
      gxTv_SdtTARTICU_Tipartdsc = "" ;
      gxTv_SdtTARTICU_Artren = DecimalUtil.ZERO ;
      gxTv_SdtTARTICU_Arttipple = "" ;
      gxTv_SdtTARTICU_Arttiplar = "" ;
      gxTv_SdtTARTICU_Artcorori = "" ;
      gxTv_SdtTARTICU_Artencori = "" ;
      gxTv_SdtTARTICU_Artsua = "" ;
      gxTv_SdtTARTICU_Artacaqui = "" ;
      gxTv_SdtTARTICU_Arteti = "" ;
      gxTv_SdtTARTICU_Clieti = "" ;
      gxTv_SdtTARTICU_Artmer = DecimalUtil.ZERO ;
      gxTv_SdtTARTICU_Arttra1 = "" ;
      gxTv_SdtTARTICU_Arttra2 = "" ;
      gxTv_SdtTARTICU_Arttra3 = "" ;
      gxTv_SdtTARTICU_Arturd1 = "" ;
      gxTv_SdtTARTICU_Arturd2 = "" ;
      gxTv_SdtTARTICU_Arturd3 = "" ;
      gxTv_SdtTARTICU_Artrdoa = DecimalUtil.ZERO ;
      gxTv_SdtTARTICU_Artrdon = DecimalUtil.ZERO ;
      gxTv_SdtTARTICU_Artfacabs = DecimalUtil.ZERO ;
      gxTv_SdtTARTICU_Artple2 = "" ;
      gxTv_SdtTARTICU_Artpmppza = DecimalUtil.ZERO ;
      gxTv_SdtTARTICU_Artfeccre = GXutil.nullDate() ;
      gxTv_SdtTARTICU_Artusrcod = "" ;
      gxTv_SdtTARTICU_Artfecmod = GXutil.nullDate() ;
      gxTv_SdtTARTICU_Clasdsc = "" ;
      gxTv_SdtTARTICU_Artcomer = "" ;
      gxTv_SdtTARTICU_Clatubdsc = "" ;
      gxTv_SdtTARTICU_Claboldsc = "" ;
      gxTv_SdtTARTICU_Artrdocru1 = DecimalUtil.ZERO ;
      gxTv_SdtTARTICU_Artrdocru2 = DecimalUtil.ZERO ;
      gxTv_SdtTARTICU_Artnmtr = "" ;
      gxTv_SdtTARTICU_Artlu = DecimalUtil.ZERO ;
      gxTv_SdtTARTICU_Artrdtsc = DecimalUtil.ZERO ;
      gxTv_SdtTARTICU_Artund = "" ;
      gxTv_SdtTARTICU_Artblo = "" ;
      gxTv_SdtTARTICU_Tipartdsc2 = "" ;
      gxTv_SdtTARTICU_Artfabsh = DecimalUtil.ZERO ;
      gxTv_SdtTARTICU_Artfabst = DecimalUtil.ZERO ;
      gxTv_SdtTARTICU_Artobsgrm = "" ;
      gxTv_SdtTARTICU_Artobsanc = "" ;
      gxTv_SdtTARTICU_Artcdb = "" ;
      gxTv_SdtTARTICU_Artgalga = "" ;
      gxTv_SdtTARTICU_Artplatina = "" ;
      gxTv_SdtTARTICU_Artpgd = "" ;
      gxTv_SdtTARTICU_Artthn = "" ;
      gxTv_SdtTARTICU_Art_dc = "" ;
      gxTv_SdtTARTICU_Artrdoc = DecimalUtil.ZERO ;
      gxTv_SdtTARTICU_Artanu = "" ;
      gxTv_SdtTARTICU_Artfacuti = DecimalUtil.ZERO ;
      gxTv_SdtTARTICU_Artkgmn = DecimalUtil.ZERO ;
      gxTv_SdtTARTICU_Artacamar = "" ;
      gxTv_SdtTARTICU_Artacabak = "" ;
      gxTv_SdtTARTICU_Artelganc = DecimalUtil.ZERO ;
      gxTv_SdtTARTICU_Artelglar = DecimalUtil.ZERO ;
      gxTv_SdtTARTICU_Artrdocru = DecimalUtil.ZERO ;
      gxTv_SdtTARTICU_Artenclarg = DecimalUtil.ZERO ;
      gxTv_SdtTARTICU_Artencanc = DecimalUtil.ZERO ;
      gxTv_SdtTARTICU_Artrdto4 = DecimalUtil.ZERO ;
      gxTv_SdtTARTICU_Artdsc2 = "" ;
      gxTv_SdtTARTICU_Artgrcomp = DecimalUtil.ZERO ;
      gxTv_SdtTARTICU_Artkgspp = DecimalUtil.ZERO ;
      gxTv_SdtTARTICU_Artprepp = DecimalUtil.ZERO ;
      gxTv_SdtTARTICU_Artcdsc = "" ;
      gxTv_SdtTARTICU_Artobslon = "" ;
      gxTv_SdtTARTICU_Artobsfac = "" ;
      gxTv_SdtTARTICU_Artobsotras = "" ;
      gxTv_SdtTARTICU_Artactivo = "" ;
      gxTv_SdtTARTICU_Mode = "" ;
      gxTv_SdtTARTICU_Emprcod_Z = "" ;
      gxTv_SdtTARTICU_Artcod_Z = "" ;
      gxTv_SdtTARTICU_Artdsc_Z = "" ;
      gxTv_SdtTARTICU_Clinom_Z = "" ;
      gxTv_SdtTARTICU_Artcodext_Z = "" ;
      gxTv_SdtTARTICU_Emprnom_Z = "" ;
      gxTv_SdtTARTICU_Artmat_Z = "" ;
      gxTv_SdtTARTICU_Tipartdsc_Z = "" ;
      gxTv_SdtTARTICU_Artren_Z = DecimalUtil.ZERO ;
      gxTv_SdtTARTICU_Arttipple_Z = "" ;
      gxTv_SdtTARTICU_Arttiplar_Z = "" ;
      gxTv_SdtTARTICU_Artcorori_Z = "" ;
      gxTv_SdtTARTICU_Artencori_Z = "" ;
      gxTv_SdtTARTICU_Artsua_Z = "" ;
      gxTv_SdtTARTICU_Artacaqui_Z = "" ;
      gxTv_SdtTARTICU_Arteti_Z = "" ;
      gxTv_SdtTARTICU_Clieti_Z = "" ;
      gxTv_SdtTARTICU_Artmer_Z = DecimalUtil.ZERO ;
      gxTv_SdtTARTICU_Arttra1_Z = "" ;
      gxTv_SdtTARTICU_Arttra2_Z = "" ;
      gxTv_SdtTARTICU_Arttra3_Z = "" ;
      gxTv_SdtTARTICU_Arturd1_Z = "" ;
      gxTv_SdtTARTICU_Arturd2_Z = "" ;
      gxTv_SdtTARTICU_Arturd3_Z = "" ;
      gxTv_SdtTARTICU_Artrdoa_Z = DecimalUtil.ZERO ;
      gxTv_SdtTARTICU_Artrdon_Z = DecimalUtil.ZERO ;
      gxTv_SdtTARTICU_Artfacabs_Z = DecimalUtil.ZERO ;
      gxTv_SdtTARTICU_Artple2_Z = "" ;
      gxTv_SdtTARTICU_Artpmppza_Z = DecimalUtil.ZERO ;
      gxTv_SdtTARTICU_Artfeccre_Z = GXutil.nullDate() ;
      gxTv_SdtTARTICU_Artusrcod_Z = "" ;
      gxTv_SdtTARTICU_Artfecmod_Z = GXutil.nullDate() ;
      gxTv_SdtTARTICU_Clasdsc_Z = "" ;
      gxTv_SdtTARTICU_Artcomer_Z = "" ;
      gxTv_SdtTARTICU_Clatubdsc_Z = "" ;
      gxTv_SdtTARTICU_Claboldsc_Z = "" ;
      gxTv_SdtTARTICU_Artrdocru1_Z = DecimalUtil.ZERO ;
      gxTv_SdtTARTICU_Artrdocru2_Z = DecimalUtil.ZERO ;
      gxTv_SdtTARTICU_Artnmtr_Z = "" ;
      gxTv_SdtTARTICU_Artlu_Z = DecimalUtil.ZERO ;
      gxTv_SdtTARTICU_Artrdtsc_Z = DecimalUtil.ZERO ;
      gxTv_SdtTARTICU_Artund_Z = "" ;
      gxTv_SdtTARTICU_Artblo_Z = "" ;
      gxTv_SdtTARTICU_Tipartdsc2_Z = "" ;
      gxTv_SdtTARTICU_Artfabsh_Z = DecimalUtil.ZERO ;
      gxTv_SdtTARTICU_Artfabst_Z = DecimalUtil.ZERO ;
      gxTv_SdtTARTICU_Artobsgrm_Z = "" ;
      gxTv_SdtTARTICU_Artobsanc_Z = "" ;
      gxTv_SdtTARTICU_Artcdb_Z = "" ;
      gxTv_SdtTARTICU_Artgalga_Z = "" ;
      gxTv_SdtTARTICU_Artplatina_Z = "" ;
      gxTv_SdtTARTICU_Artpgd_Z = "" ;
      gxTv_SdtTARTICU_Artthn_Z = "" ;
      gxTv_SdtTARTICU_Art_dc_Z = "" ;
      gxTv_SdtTARTICU_Artrdoc_Z = DecimalUtil.ZERO ;
      gxTv_SdtTARTICU_Artanu_Z = "" ;
      gxTv_SdtTARTICU_Artfacuti_Z = DecimalUtil.ZERO ;
      gxTv_SdtTARTICU_Artkgmn_Z = DecimalUtil.ZERO ;
      gxTv_SdtTARTICU_Artacamar_Z = "" ;
      gxTv_SdtTARTICU_Artacabak_Z = "" ;
      gxTv_SdtTARTICU_Artelganc_Z = DecimalUtil.ZERO ;
      gxTv_SdtTARTICU_Artelglar_Z = DecimalUtil.ZERO ;
      gxTv_SdtTARTICU_Artrdocru_Z = DecimalUtil.ZERO ;
      gxTv_SdtTARTICU_Artenclarg_Z = DecimalUtil.ZERO ;
      gxTv_SdtTARTICU_Artencanc_Z = DecimalUtil.ZERO ;
      gxTv_SdtTARTICU_Artrdto4_Z = DecimalUtil.ZERO ;
      gxTv_SdtTARTICU_Artdsc2_Z = "" ;
      gxTv_SdtTARTICU_Artgrcomp_Z = DecimalUtil.ZERO ;
      gxTv_SdtTARTICU_Artkgspp_Z = DecimalUtil.ZERO ;
      gxTv_SdtTARTICU_Artprepp_Z = DecimalUtil.ZERO ;
      gxTv_SdtTARTICU_Artcdsc_Z = "" ;
      gxTv_SdtTARTICU_Artobsfac_Z = "" ;
      gxTv_SdtTARTICU_Artobsotras_Z = "" ;
      gxTv_SdtTARTICU_Artactivo_Z = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtTARTICU_N ;
   }

   public app.SdtTARTICU Clone( )
   {
      app.SdtTARTICU sdt;
      app.tarticu_bc obj;
      sdt = (app.SdtTARTICU)(clone()) ;
      obj = (app.tarticu_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( app.StructSdtTARTICU struct )
   {
      setgxTv_SdtTARTICU_Emprcod(struct.getEmprcod());
      setgxTv_SdtTARTICU_Clicod(struct.getClicod());
      setgxTv_SdtTARTICU_Artcod(struct.getArtcod());
      setgxTv_SdtTARTICU_Artdsc(struct.getArtdsc());
      setgxTv_SdtTARTICU_Clinom(struct.getClinom());
      setgxTv_SdtTARTICU_Artcodext(struct.getArtcodext());
      setgxTv_SdtTARTICU_Emprnom(struct.getEmprnom());
      setgxTv_SdtTARTICU_Artmat(struct.getArtmat());
      setgxTv_SdtTARTICU_Tipartcod(struct.getTipartcod());
      setgxTv_SdtTARTICU_Tipartdsc(struct.getTipartdsc());
      setgxTv_SdtTARTICU_Artpml(struct.getArtpml());
      setgxTv_SdtTARTICU_Artgracru(struct.getArtgracru());
      setgxTv_SdtTARTICU_Artcrumin(struct.getArtcrumin());
      setgxTv_SdtTARTICU_Artcrumax(struct.getArtcrumax());
      setgxTv_SdtTARTICU_Artacamin(struct.getArtacamin());
      setgxTv_SdtTARTICU_Artacamax(struct.getArtacamax());
      setgxTv_SdtTARTICU_Artren(struct.getArtren());
      setgxTv_SdtTARTICU_Arttipple(struct.getArttipple());
      setgxTv_SdtTARTICU_Arttiplar(struct.getArttiplar());
      setgxTv_SdtTARTICU_Artcorori(struct.getArtcorori());
      setgxTv_SdtTARTICU_Artencori(struct.getArtencori());
      setgxTv_SdtTARTICU_Artsua(struct.getArtsua());
      setgxTv_SdtTARTICU_Artacaqui(struct.getArtacaqui());
      setgxTv_SdtTARTICU_Arteti(struct.getArteti());
      setgxTv_SdtTARTICU_Clieti(struct.getClieti());
      setgxTv_SdtTARTICU_Cliurg(struct.getCliurg());
      setgxTv_SdtTARTICU_Arturg(struct.getArturg());
      setgxTv_SdtTARTICU_Artmer(struct.getArtmer());
      setgxTv_SdtTARTICU_Arttra1(struct.getArttra1());
      setgxTv_SdtTARTICU_Arttra2(struct.getArttra2());
      setgxTv_SdtTARTICU_Arttra3(struct.getArttra3());
      setgxTv_SdtTARTICU_Arttrap1(struct.getArttrap1());
      setgxTv_SdtTARTICU_Arttrap2(struct.getArttrap2());
      setgxTv_SdtTARTICU_Arttrap3(struct.getArttrap3());
      setgxTv_SdtTARTICU_Arturd1(struct.getArturd1());
      setgxTv_SdtTARTICU_Arturd2(struct.getArturd2());
      setgxTv_SdtTARTICU_Arturd3(struct.getArturd3());
      setgxTv_SdtTARTICU_Arturdp1(struct.getArturdp1());
      setgxTv_SdtTARTICU_Arturdp2(struct.getArturdp2());
      setgxTv_SdtTARTICU_Arturdp3(struct.getArturdp3());
      setgxTv_SdtTARTICU_Artenccom(struct.getArtenccom());
      setgxTv_SdtTARTICU_Artencanh(struct.getArtencanh());
      setgxTv_SdtTARTICU_Artgraaca(struct.getArtgraaca());
      setgxTv_SdtTARTICU_Artrdoa(struct.getArtrdoa());
      setgxTv_SdtTARTICU_Artrdon(struct.getArtrdon());
      setgxTv_SdtTARTICU_Artfacabs(struct.getArtfacabs());
      setgxTv_SdtTARTICU_Artple2(struct.getArtple2());
      setgxTv_SdtTARTICU_Artnumcor(struct.getArtnumcor());
      setgxTv_SdtTARTICU_Artancsal1(struct.getArtancsal1());
      setgxTv_SdtTARTICU_Artancsal2(struct.getArtancsal2());
      setgxTv_SdtTARTICU_Artancsal3(struct.getArtancsal3());
      setgxTv_SdtTARTICU_Artgraaca2(struct.getArtgraaca2());
      setgxTv_SdtTARTICU_Artgracru2(struct.getArtgracru2());
      setgxTv_SdtTARTICU_Clascod(struct.getClascod());
      setgxTv_SdtTARTICU_Artpmppza(struct.getArtpmppza());
      setgxTv_SdtTARTICU_Artfeccre(struct.getArtfeccre());
      setgxTv_SdtTARTICU_Artusrcod(struct.getArtusrcod());
      setgxTv_SdtTARTICU_Artfecmod(struct.getArtfecmod());
      setgxTv_SdtTARTICU_Clasdsc(struct.getClasdsc());
      setgxTv_SdtTARTICU_Artcomer(struct.getArtcomer());
      setgxTv_SdtTARTICU_Clatubcod(struct.getClatubcod());
      setgxTv_SdtTARTICU_Clatubdsc(struct.getClatubdsc());
      setgxTv_SdtTARTICU_Clabolcod(struct.getClabolcod());
      setgxTv_SdtTARTICU_Claboldsc(struct.getClaboldsc());
      setgxTv_SdtTARTICU_Artrdocru1(struct.getArtrdocru1());
      setgxTv_SdtTARTICU_Artrdocru2(struct.getArtrdocru2());
      setgxTv_SdtTARTICU_Artnmtr(struct.getArtnmtr());
      setgxTv_SdtTARTICU_Artlu(struct.getArtlu());
      setgxTv_SdtTARTICU_Artrb(struct.getArtrb());
      setgxTv_SdtTARTICU_Artpelanh(struct.getArtpelanh());
      setgxTv_SdtTARTICU_Artgrm2sc(struct.getArtgrm2sc());
      setgxTv_SdtTARTICU_Artpmlsc(struct.getArtpmlsc());
      setgxTv_SdtTARTICU_Artancsc(struct.getArtancsc());
      setgxTv_SdtTARTICU_Artpmlcru(struct.getArtpmlcru());
      setgxTv_SdtTARTICU_Artrdtsc(struct.getArtrdtsc());
      setgxTv_SdtTARTICU_Artund(struct.getArtund());
      setgxTv_SdtTARTICU_Artblo(struct.getArtblo());
      setgxTv_SdtTARTICU_Artcla(struct.getArtcla());
      setgxTv_SdtTARTICU_Tipartdsc2(struct.getTipartdsc2());
      setgxTv_SdtTARTICU_Artfabsh(struct.getArtfabsh());
      setgxTv_SdtTARTICU_Artfabst(struct.getArtfabst());
      setgxTv_SdtTARTICU_Artnprog(struct.getArtnprog());
      setgxTv_SdtTARTICU_Artvbd(struct.getArtvbd());
      setgxTv_SdtTARTICU_Artvbn(struct.getArtvbn());
      setgxTv_SdtTARTICU_Artab(struct.getArtab());
      setgxTv_SdtTARTICU_Artobsgrm(struct.getArtobsgrm());
      setgxTv_SdtTARTICU_Artobsanc(struct.getArtobsanc());
      setgxTv_SdtTARTICU_Artcdb(struct.getArtcdb());
      setgxTv_SdtTARTICU_Artgalga(struct.getArtgalga());
      setgxTv_SdtTARTICU_Artplatina(struct.getArtplatina());
      setgxTv_SdtTARTICU_Artpgd(struct.getArtpgd());
      setgxTv_SdtTARTICU_Artth(struct.getArtth());
      setgxTv_SdtTARTICU_Artthn(struct.getArtthn());
      setgxTv_SdtTARTICU_Art_cd(struct.getArt_cd());
      setgxTv_SdtTARTICU_Art_dc(struct.getArt_dc());
      setgxTv_SdtTARTICU_Arthilos(struct.getArthilos());
      setgxTv_SdtTARTICU_Artpasad(struct.getArtpasad());
      setgxTv_SdtTARTICU_Artancc(struct.getArtancc());
      setgxTv_SdtTARTICU_Artgrm2c(struct.getArtgrm2c());
      setgxTv_SdtTARTICU_Artrdoc(struct.getArtrdoc());
      setgxTv_SdtTARTICU_Artacafor(struct.getArtacafor());
      setgxTv_SdtTARTICU_Artanu(struct.getArtanu());
      setgxTv_SdtTARTICU_Artfacuti(struct.getArtfacuti());
      setgxTv_SdtTARTICU_Artnumtip(struct.getArtnumtip());
      setgxTv_SdtTARTICU_Artmt(struct.getArtmt());
      setgxTv_SdtTARTICU_Arttrabs(struct.getArttrabs());
      setgxTv_SdtTARTICU_Artkgmn(struct.getArtkgmn());
      setgxTv_SdtTARTICU_Artacamar(struct.getArtacamar());
      setgxTv_SdtTARTICU_Artacabak(struct.getArtacabak());
      setgxTv_SdtTARTICU_Artelganc(struct.getArtelganc());
      setgxTv_SdtTARTICU_Artelglar(struct.getArtelglar());
      setgxTv_SdtTARTICU_Artrdocru(struct.getArtrdocru());
      setgxTv_SdtTARTICU_Artenclarg(struct.getArtenclarg());
      setgxTv_SdtTARTICU_Artencanc(struct.getArtencanc());
      setgxTv_SdtTARTICU_Artrdto4(struct.getArtrdto4());
      setgxTv_SdtTARTICU_Artdsc2(struct.getArtdsc2());
      setgxTv_SdtTARTICU_Artgrcomp(struct.getArtgrcomp());
      setgxTv_SdtTARTICU_Artkgspp(struct.getArtkgspp());
      setgxTv_SdtTARTICU_Artprepp(struct.getArtprepp());
      setgxTv_SdtTARTICU_Artcdsc(struct.getArtcdsc());
      setgxTv_SdtTARTICU_Artobslon(struct.getArtobslon());
      setgxTv_SdtTARTICU_Artobsfac(struct.getArtobsfac());
      setgxTv_SdtTARTICU_Artobsotras(struct.getArtobsotras());
      setgxTv_SdtTARTICU_Artactivo(struct.getArtactivo());
      setgxTv_SdtTARTICU_Mode(struct.getMode());
      setgxTv_SdtTARTICU_Initialized(struct.getInitialized());
      setgxTv_SdtTARTICU_Emprcod_Z(struct.getEmprcod_Z());
      setgxTv_SdtTARTICU_Clicod_Z(struct.getClicod_Z());
      setgxTv_SdtTARTICU_Artcod_Z(struct.getArtcod_Z());
      setgxTv_SdtTARTICU_Artdsc_Z(struct.getArtdsc_Z());
      setgxTv_SdtTARTICU_Clinom_Z(struct.getClinom_Z());
      setgxTv_SdtTARTICU_Artcodext_Z(struct.getArtcodext_Z());
      setgxTv_SdtTARTICU_Emprnom_Z(struct.getEmprnom_Z());
      setgxTv_SdtTARTICU_Artmat_Z(struct.getArtmat_Z());
      setgxTv_SdtTARTICU_Tipartcod_Z(struct.getTipartcod_Z());
      setgxTv_SdtTARTICU_Tipartdsc_Z(struct.getTipartdsc_Z());
      setgxTv_SdtTARTICU_Artpml_Z(struct.getArtpml_Z());
      setgxTv_SdtTARTICU_Artgracru_Z(struct.getArtgracru_Z());
      setgxTv_SdtTARTICU_Artcrumin_Z(struct.getArtcrumin_Z());
      setgxTv_SdtTARTICU_Artcrumax_Z(struct.getArtcrumax_Z());
      setgxTv_SdtTARTICU_Artacamin_Z(struct.getArtacamin_Z());
      setgxTv_SdtTARTICU_Artacamax_Z(struct.getArtacamax_Z());
      setgxTv_SdtTARTICU_Artren_Z(struct.getArtren_Z());
      setgxTv_SdtTARTICU_Arttipple_Z(struct.getArttipple_Z());
      setgxTv_SdtTARTICU_Arttiplar_Z(struct.getArttiplar_Z());
      setgxTv_SdtTARTICU_Artcorori_Z(struct.getArtcorori_Z());
      setgxTv_SdtTARTICU_Artencori_Z(struct.getArtencori_Z());
      setgxTv_SdtTARTICU_Artsua_Z(struct.getArtsua_Z());
      setgxTv_SdtTARTICU_Artacaqui_Z(struct.getArtacaqui_Z());
      setgxTv_SdtTARTICU_Arteti_Z(struct.getArteti_Z());
      setgxTv_SdtTARTICU_Clieti_Z(struct.getClieti_Z());
      setgxTv_SdtTARTICU_Cliurg_Z(struct.getCliurg_Z());
      setgxTv_SdtTARTICU_Arturg_Z(struct.getArturg_Z());
      setgxTv_SdtTARTICU_Artmer_Z(struct.getArtmer_Z());
      setgxTv_SdtTARTICU_Arttra1_Z(struct.getArttra1_Z());
      setgxTv_SdtTARTICU_Arttra2_Z(struct.getArttra2_Z());
      setgxTv_SdtTARTICU_Arttra3_Z(struct.getArttra3_Z());
      setgxTv_SdtTARTICU_Arttrap1_Z(struct.getArttrap1_Z());
      setgxTv_SdtTARTICU_Arttrap2_Z(struct.getArttrap2_Z());
      setgxTv_SdtTARTICU_Arttrap3_Z(struct.getArttrap3_Z());
      setgxTv_SdtTARTICU_Arturd1_Z(struct.getArturd1_Z());
      setgxTv_SdtTARTICU_Arturd2_Z(struct.getArturd2_Z());
      setgxTv_SdtTARTICU_Arturd3_Z(struct.getArturd3_Z());
      setgxTv_SdtTARTICU_Arturdp1_Z(struct.getArturdp1_Z());
      setgxTv_SdtTARTICU_Arturdp2_Z(struct.getArturdp2_Z());
      setgxTv_SdtTARTICU_Arturdp3_Z(struct.getArturdp3_Z());
      setgxTv_SdtTARTICU_Artenccom_Z(struct.getArtenccom_Z());
      setgxTv_SdtTARTICU_Artencanh_Z(struct.getArtencanh_Z());
      setgxTv_SdtTARTICU_Artgraaca_Z(struct.getArtgraaca_Z());
      setgxTv_SdtTARTICU_Artrdoa_Z(struct.getArtrdoa_Z());
      setgxTv_SdtTARTICU_Artrdon_Z(struct.getArtrdon_Z());
      setgxTv_SdtTARTICU_Artfacabs_Z(struct.getArtfacabs_Z());
      setgxTv_SdtTARTICU_Artple2_Z(struct.getArtple2_Z());
      setgxTv_SdtTARTICU_Artnumcor_Z(struct.getArtnumcor_Z());
      setgxTv_SdtTARTICU_Artancsal1_Z(struct.getArtancsal1_Z());
      setgxTv_SdtTARTICU_Artancsal2_Z(struct.getArtancsal2_Z());
      setgxTv_SdtTARTICU_Artancsal3_Z(struct.getArtancsal3_Z());
      setgxTv_SdtTARTICU_Artgraaca2_Z(struct.getArtgraaca2_Z());
      setgxTv_SdtTARTICU_Artgracru2_Z(struct.getArtgracru2_Z());
      setgxTv_SdtTARTICU_Clascod_Z(struct.getClascod_Z());
      setgxTv_SdtTARTICU_Artpmppza_Z(struct.getArtpmppza_Z());
      setgxTv_SdtTARTICU_Artfeccre_Z(struct.getArtfeccre_Z());
      setgxTv_SdtTARTICU_Artusrcod_Z(struct.getArtusrcod_Z());
      setgxTv_SdtTARTICU_Artfecmod_Z(struct.getArtfecmod_Z());
      setgxTv_SdtTARTICU_Clasdsc_Z(struct.getClasdsc_Z());
      setgxTv_SdtTARTICU_Artcomer_Z(struct.getArtcomer_Z());
      setgxTv_SdtTARTICU_Clatubcod_Z(struct.getClatubcod_Z());
      setgxTv_SdtTARTICU_Clatubdsc_Z(struct.getClatubdsc_Z());
      setgxTv_SdtTARTICU_Clabolcod_Z(struct.getClabolcod_Z());
      setgxTv_SdtTARTICU_Claboldsc_Z(struct.getClaboldsc_Z());
      setgxTv_SdtTARTICU_Artrdocru1_Z(struct.getArtrdocru1_Z());
      setgxTv_SdtTARTICU_Artrdocru2_Z(struct.getArtrdocru2_Z());
      setgxTv_SdtTARTICU_Artnmtr_Z(struct.getArtnmtr_Z());
      setgxTv_SdtTARTICU_Artlu_Z(struct.getArtlu_Z());
      setgxTv_SdtTARTICU_Artrb_Z(struct.getArtrb_Z());
      setgxTv_SdtTARTICU_Artpelanh_Z(struct.getArtpelanh_Z());
      setgxTv_SdtTARTICU_Artgrm2sc_Z(struct.getArtgrm2sc_Z());
      setgxTv_SdtTARTICU_Artpmlsc_Z(struct.getArtpmlsc_Z());
      setgxTv_SdtTARTICU_Artancsc_Z(struct.getArtancsc_Z());
      setgxTv_SdtTARTICU_Artpmlcru_Z(struct.getArtpmlcru_Z());
      setgxTv_SdtTARTICU_Artrdtsc_Z(struct.getArtrdtsc_Z());
      setgxTv_SdtTARTICU_Artund_Z(struct.getArtund_Z());
      setgxTv_SdtTARTICU_Artblo_Z(struct.getArtblo_Z());
      setgxTv_SdtTARTICU_Artcla_Z(struct.getArtcla_Z());
      setgxTv_SdtTARTICU_Tipartdsc2_Z(struct.getTipartdsc2_Z());
      setgxTv_SdtTARTICU_Artfabsh_Z(struct.getArtfabsh_Z());
      setgxTv_SdtTARTICU_Artfabst_Z(struct.getArtfabst_Z());
      setgxTv_SdtTARTICU_Artnprog_Z(struct.getArtnprog_Z());
      setgxTv_SdtTARTICU_Artvbd_Z(struct.getArtvbd_Z());
      setgxTv_SdtTARTICU_Artvbn_Z(struct.getArtvbn_Z());
      setgxTv_SdtTARTICU_Artab_Z(struct.getArtab_Z());
      setgxTv_SdtTARTICU_Artobsgrm_Z(struct.getArtobsgrm_Z());
      setgxTv_SdtTARTICU_Artobsanc_Z(struct.getArtobsanc_Z());
      setgxTv_SdtTARTICU_Artcdb_Z(struct.getArtcdb_Z());
      setgxTv_SdtTARTICU_Artgalga_Z(struct.getArtgalga_Z());
      setgxTv_SdtTARTICU_Artplatina_Z(struct.getArtplatina_Z());
      setgxTv_SdtTARTICU_Artpgd_Z(struct.getArtpgd_Z());
      setgxTv_SdtTARTICU_Artth_Z(struct.getArtth_Z());
      setgxTv_SdtTARTICU_Artthn_Z(struct.getArtthn_Z());
      setgxTv_SdtTARTICU_Art_cd_Z(struct.getArt_cd_Z());
      setgxTv_SdtTARTICU_Art_dc_Z(struct.getArt_dc_Z());
      setgxTv_SdtTARTICU_Arthilos_Z(struct.getArthilos_Z());
      setgxTv_SdtTARTICU_Artpasad_Z(struct.getArtpasad_Z());
      setgxTv_SdtTARTICU_Artancc_Z(struct.getArtancc_Z());
      setgxTv_SdtTARTICU_Artgrm2c_Z(struct.getArtgrm2c_Z());
      setgxTv_SdtTARTICU_Artrdoc_Z(struct.getArtrdoc_Z());
      setgxTv_SdtTARTICU_Artacafor_Z(struct.getArtacafor_Z());
      setgxTv_SdtTARTICU_Artanu_Z(struct.getArtanu_Z());
      setgxTv_SdtTARTICU_Artfacuti_Z(struct.getArtfacuti_Z());
      setgxTv_SdtTARTICU_Artnumtip_Z(struct.getArtnumtip_Z());
      setgxTv_SdtTARTICU_Artmt_Z(struct.getArtmt_Z());
      setgxTv_SdtTARTICU_Arttrabs_Z(struct.getArttrabs_Z());
      setgxTv_SdtTARTICU_Artkgmn_Z(struct.getArtkgmn_Z());
      setgxTv_SdtTARTICU_Artacamar_Z(struct.getArtacamar_Z());
      setgxTv_SdtTARTICU_Artacabak_Z(struct.getArtacabak_Z());
      setgxTv_SdtTARTICU_Artelganc_Z(struct.getArtelganc_Z());
      setgxTv_SdtTARTICU_Artelglar_Z(struct.getArtelglar_Z());
      setgxTv_SdtTARTICU_Artrdocru_Z(struct.getArtrdocru_Z());
      setgxTv_SdtTARTICU_Artenclarg_Z(struct.getArtenclarg_Z());
      setgxTv_SdtTARTICU_Artencanc_Z(struct.getArtencanc_Z());
      setgxTv_SdtTARTICU_Artrdto4_Z(struct.getArtrdto4_Z());
      setgxTv_SdtTARTICU_Artdsc2_Z(struct.getArtdsc2_Z());
      setgxTv_SdtTARTICU_Artgrcomp_Z(struct.getArtgrcomp_Z());
      setgxTv_SdtTARTICU_Artkgspp_Z(struct.getArtkgspp_Z());
      setgxTv_SdtTARTICU_Artprepp_Z(struct.getArtprepp_Z());
      setgxTv_SdtTARTICU_Artcdsc_Z(struct.getArtcdsc_Z());
      setgxTv_SdtTARTICU_Artobsfac_Z(struct.getArtobsfac_Z());
      setgxTv_SdtTARTICU_Artobsotras_Z(struct.getArtobsotras_Z());
      setgxTv_SdtTARTICU_Artactivo_Z(struct.getArtactivo_Z());
      setgxTv_SdtTARTICU_Clicod_N(struct.getClicod_N());
      setgxTv_SdtTARTICU_Artcod_N(struct.getArtcod_N());
      setgxTv_SdtTARTICU_Artdsc_N(struct.getArtdsc_N());
      setgxTv_SdtTARTICU_Artcodext_N(struct.getArtcodext_N());
      setgxTv_SdtTARTICU_Emprnom_N(struct.getEmprnom_N());
      setgxTv_SdtTARTICU_Artmat_N(struct.getArtmat_N());
      setgxTv_SdtTARTICU_Tipartdsc_N(struct.getTipartdsc_N());
      setgxTv_SdtTARTICU_Artpml_N(struct.getArtpml_N());
      setgxTv_SdtTARTICU_Artgracru_N(struct.getArtgracru_N());
      setgxTv_SdtTARTICU_Artcrumin_N(struct.getArtcrumin_N());
      setgxTv_SdtTARTICU_Artcrumax_N(struct.getArtcrumax_N());
      setgxTv_SdtTARTICU_Artacamin_N(struct.getArtacamin_N());
      setgxTv_SdtTARTICU_Artacamax_N(struct.getArtacamax_N());
      setgxTv_SdtTARTICU_Artren_N(struct.getArtren_N());
      setgxTv_SdtTARTICU_Arttipple_N(struct.getArttipple_N());
      setgxTv_SdtTARTICU_Arttiplar_N(struct.getArttiplar_N());
      setgxTv_SdtTARTICU_Artcorori_N(struct.getArtcorori_N());
      setgxTv_SdtTARTICU_Artencori_N(struct.getArtencori_N());
      setgxTv_SdtTARTICU_Artsua_N(struct.getArtsua_N());
      setgxTv_SdtTARTICU_Artacaqui_N(struct.getArtacaqui_N());
      setgxTv_SdtTARTICU_Arteti_N(struct.getArteti_N());
      setgxTv_SdtTARTICU_Arturg_N(struct.getArturg_N());
      setgxTv_SdtTARTICU_Artmer_N(struct.getArtmer_N());
      setgxTv_SdtTARTICU_Arttra1_N(struct.getArttra1_N());
      setgxTv_SdtTARTICU_Arttra2_N(struct.getArttra2_N());
      setgxTv_SdtTARTICU_Arttra3_N(struct.getArttra3_N());
      setgxTv_SdtTARTICU_Arttrap1_N(struct.getArttrap1_N());
      setgxTv_SdtTARTICU_Arttrap2_N(struct.getArttrap2_N());
      setgxTv_SdtTARTICU_Arttrap3_N(struct.getArttrap3_N());
      setgxTv_SdtTARTICU_Arturd1_N(struct.getArturd1_N());
      setgxTv_SdtTARTICU_Arturd2_N(struct.getArturd2_N());
      setgxTv_SdtTARTICU_Arturd3_N(struct.getArturd3_N());
      setgxTv_SdtTARTICU_Arturdp1_N(struct.getArturdp1_N());
      setgxTv_SdtTARTICU_Arturdp2_N(struct.getArturdp2_N());
      setgxTv_SdtTARTICU_Arturdp3_N(struct.getArturdp3_N());
      setgxTv_SdtTARTICU_Artenccom_N(struct.getArtenccom_N());
      setgxTv_SdtTARTICU_Artencanh_N(struct.getArtencanh_N());
      setgxTv_SdtTARTICU_Artgraaca_N(struct.getArtgraaca_N());
      setgxTv_SdtTARTICU_Artrdoa_N(struct.getArtrdoa_N());
      setgxTv_SdtTARTICU_Artrdon_N(struct.getArtrdon_N());
      setgxTv_SdtTARTICU_Artfacabs_N(struct.getArtfacabs_N());
      setgxTv_SdtTARTICU_Artple2_N(struct.getArtple2_N());
      setgxTv_SdtTARTICU_Artnumcor_N(struct.getArtnumcor_N());
      setgxTv_SdtTARTICU_Artancsal1_N(struct.getArtancsal1_N());
      setgxTv_SdtTARTICU_Artancsal2_N(struct.getArtancsal2_N());
      setgxTv_SdtTARTICU_Artancsal3_N(struct.getArtancsal3_N());
      setgxTv_SdtTARTICU_Artgraaca2_N(struct.getArtgraaca2_N());
      setgxTv_SdtTARTICU_Artgracru2_N(struct.getArtgracru2_N());
      setgxTv_SdtTARTICU_Clascod_N(struct.getClascod_N());
      setgxTv_SdtTARTICU_Artpmppza_N(struct.getArtpmppza_N());
      setgxTv_SdtTARTICU_Artfeccre_N(struct.getArtfeccre_N());
      setgxTv_SdtTARTICU_Artusrcod_N(struct.getArtusrcod_N());
      setgxTv_SdtTARTICU_Artfecmod_N(struct.getArtfecmod_N());
      setgxTv_SdtTARTICU_Clasdsc_N(struct.getClasdsc_N());
      setgxTv_SdtTARTICU_Artcomer_N(struct.getArtcomer_N());
      setgxTv_SdtTARTICU_Clatubcod_N(struct.getClatubcod_N());
      setgxTv_SdtTARTICU_Clatubdsc_N(struct.getClatubdsc_N());
      setgxTv_SdtTARTICU_Clabolcod_N(struct.getClabolcod_N());
      setgxTv_SdtTARTICU_Claboldsc_N(struct.getClaboldsc_N());
      setgxTv_SdtTARTICU_Artrdocru1_N(struct.getArtrdocru1_N());
      setgxTv_SdtTARTICU_Artrdocru2_N(struct.getArtrdocru2_N());
      setgxTv_SdtTARTICU_Artnmtr_N(struct.getArtnmtr_N());
      setgxTv_SdtTARTICU_Artlu_N(struct.getArtlu_N());
      setgxTv_SdtTARTICU_Artrb_N(struct.getArtrb_N());
      setgxTv_SdtTARTICU_Artpelanh_N(struct.getArtpelanh_N());
      setgxTv_SdtTARTICU_Artgrm2sc_N(struct.getArtgrm2sc_N());
      setgxTv_SdtTARTICU_Artpmlsc_N(struct.getArtpmlsc_N());
      setgxTv_SdtTARTICU_Artancsc_N(struct.getArtancsc_N());
      setgxTv_SdtTARTICU_Artpmlcru_N(struct.getArtpmlcru_N());
      setgxTv_SdtTARTICU_Artrdtsc_N(struct.getArtrdtsc_N());
      setgxTv_SdtTARTICU_Artund_N(struct.getArtund_N());
      setgxTv_SdtTARTICU_Artblo_N(struct.getArtblo_N());
      setgxTv_SdtTARTICU_Artcla_N(struct.getArtcla_N());
      setgxTv_SdtTARTICU_Tipartdsc2_N(struct.getTipartdsc2_N());
      setgxTv_SdtTARTICU_Artfabsh_N(struct.getArtfabsh_N());
      setgxTv_SdtTARTICU_Artfabst_N(struct.getArtfabst_N());
      setgxTv_SdtTARTICU_Artnprog_N(struct.getArtnprog_N());
      setgxTv_SdtTARTICU_Artvbd_N(struct.getArtvbd_N());
      setgxTv_SdtTARTICU_Artvbn_N(struct.getArtvbn_N());
      setgxTv_SdtTARTICU_Artab_N(struct.getArtab_N());
      setgxTv_SdtTARTICU_Artobsgrm_N(struct.getArtobsgrm_N());
      setgxTv_SdtTARTICU_Artobsanc_N(struct.getArtobsanc_N());
      setgxTv_SdtTARTICU_Artcdb_N(struct.getArtcdb_N());
      setgxTv_SdtTARTICU_Artgalga_N(struct.getArtgalga_N());
      setgxTv_SdtTARTICU_Artplatina_N(struct.getArtplatina_N());
      setgxTv_SdtTARTICU_Artpgd_N(struct.getArtpgd_N());
      setgxTv_SdtTARTICU_Artth_N(struct.getArtth_N());
      setgxTv_SdtTARTICU_Artthn_N(struct.getArtthn_N());
      setgxTv_SdtTARTICU_Art_cd_N(struct.getArt_cd_N());
      setgxTv_SdtTARTICU_Art_dc_N(struct.getArt_dc_N());
      setgxTv_SdtTARTICU_Arthilos_N(struct.getArthilos_N());
      setgxTv_SdtTARTICU_Artpasad_N(struct.getArtpasad_N());
      setgxTv_SdtTARTICU_Artancc_N(struct.getArtancc_N());
      setgxTv_SdtTARTICU_Artgrm2c_N(struct.getArtgrm2c_N());
      setgxTv_SdtTARTICU_Artrdoc_N(struct.getArtrdoc_N());
      setgxTv_SdtTARTICU_Artacafor_N(struct.getArtacafor_N());
      setgxTv_SdtTARTICU_Artanu_N(struct.getArtanu_N());
      setgxTv_SdtTARTICU_Artfacuti_N(struct.getArtfacuti_N());
      setgxTv_SdtTARTICU_Artnumtip_N(struct.getArtnumtip_N());
      setgxTv_SdtTARTICU_Artmt_N(struct.getArtmt_N());
      setgxTv_SdtTARTICU_Arttrabs_N(struct.getArttrabs_N());
      setgxTv_SdtTARTICU_Artkgmn_N(struct.getArtkgmn_N());
      setgxTv_SdtTARTICU_Artacamar_N(struct.getArtacamar_N());
      setgxTv_SdtTARTICU_Artacabak_N(struct.getArtacabak_N());
      setgxTv_SdtTARTICU_Artelganc_N(struct.getArtelganc_N());
      setgxTv_SdtTARTICU_Artelglar_N(struct.getArtelglar_N());
      setgxTv_SdtTARTICU_Artrdocru_N(struct.getArtrdocru_N());
      setgxTv_SdtTARTICU_Artenclarg_N(struct.getArtenclarg_N());
      setgxTv_SdtTARTICU_Artencanc_N(struct.getArtencanc_N());
      setgxTv_SdtTARTICU_Artrdto4_N(struct.getArtrdto4_N());
      setgxTv_SdtTARTICU_Artdsc2_N(struct.getArtdsc2_N());
      setgxTv_SdtTARTICU_Artgrcomp_N(struct.getArtgrcomp_N());
      setgxTv_SdtTARTICU_Artkgspp_N(struct.getArtkgspp_N());
      setgxTv_SdtTARTICU_Artprepp_N(struct.getArtprepp_N());
      setgxTv_SdtTARTICU_Artobslon_N(struct.getArtobslon_N());
      setgxTv_SdtTARTICU_Artobsfac_N(struct.getArtobsfac_N());
      setgxTv_SdtTARTICU_Artobsotras_N(struct.getArtobsotras_N());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtTARTICU getStruct( )
   {
      app.StructSdtTARTICU struct = new app.StructSdtTARTICU ();
      struct.setEmprcod(getgxTv_SdtTARTICU_Emprcod());
      struct.setClicod(getgxTv_SdtTARTICU_Clicod());
      struct.setArtcod(getgxTv_SdtTARTICU_Artcod());
      struct.setArtdsc(getgxTv_SdtTARTICU_Artdsc());
      struct.setClinom(getgxTv_SdtTARTICU_Clinom());
      struct.setArtcodext(getgxTv_SdtTARTICU_Artcodext());
      struct.setEmprnom(getgxTv_SdtTARTICU_Emprnom());
      struct.setArtmat(getgxTv_SdtTARTICU_Artmat());
      struct.setTipartcod(getgxTv_SdtTARTICU_Tipartcod());
      struct.setTipartdsc(getgxTv_SdtTARTICU_Tipartdsc());
      struct.setArtpml(getgxTv_SdtTARTICU_Artpml());
      struct.setArtgracru(getgxTv_SdtTARTICU_Artgracru());
      struct.setArtcrumin(getgxTv_SdtTARTICU_Artcrumin());
      struct.setArtcrumax(getgxTv_SdtTARTICU_Artcrumax());
      struct.setArtacamin(getgxTv_SdtTARTICU_Artacamin());
      struct.setArtacamax(getgxTv_SdtTARTICU_Artacamax());
      struct.setArtren(getgxTv_SdtTARTICU_Artren());
      struct.setArttipple(getgxTv_SdtTARTICU_Arttipple());
      struct.setArttiplar(getgxTv_SdtTARTICU_Arttiplar());
      struct.setArtcorori(getgxTv_SdtTARTICU_Artcorori());
      struct.setArtencori(getgxTv_SdtTARTICU_Artencori());
      struct.setArtsua(getgxTv_SdtTARTICU_Artsua());
      struct.setArtacaqui(getgxTv_SdtTARTICU_Artacaqui());
      struct.setArteti(getgxTv_SdtTARTICU_Arteti());
      struct.setClieti(getgxTv_SdtTARTICU_Clieti());
      struct.setCliurg(getgxTv_SdtTARTICU_Cliurg());
      struct.setArturg(getgxTv_SdtTARTICU_Arturg());
      struct.setArtmer(getgxTv_SdtTARTICU_Artmer());
      struct.setArttra1(getgxTv_SdtTARTICU_Arttra1());
      struct.setArttra2(getgxTv_SdtTARTICU_Arttra2());
      struct.setArttra3(getgxTv_SdtTARTICU_Arttra3());
      struct.setArttrap1(getgxTv_SdtTARTICU_Arttrap1());
      struct.setArttrap2(getgxTv_SdtTARTICU_Arttrap2());
      struct.setArttrap3(getgxTv_SdtTARTICU_Arttrap3());
      struct.setArturd1(getgxTv_SdtTARTICU_Arturd1());
      struct.setArturd2(getgxTv_SdtTARTICU_Arturd2());
      struct.setArturd3(getgxTv_SdtTARTICU_Arturd3());
      struct.setArturdp1(getgxTv_SdtTARTICU_Arturdp1());
      struct.setArturdp2(getgxTv_SdtTARTICU_Arturdp2());
      struct.setArturdp3(getgxTv_SdtTARTICU_Arturdp3());
      struct.setArtenccom(getgxTv_SdtTARTICU_Artenccom());
      struct.setArtencanh(getgxTv_SdtTARTICU_Artencanh());
      struct.setArtgraaca(getgxTv_SdtTARTICU_Artgraaca());
      struct.setArtrdoa(getgxTv_SdtTARTICU_Artrdoa());
      struct.setArtrdon(getgxTv_SdtTARTICU_Artrdon());
      struct.setArtfacabs(getgxTv_SdtTARTICU_Artfacabs());
      struct.setArtple2(getgxTv_SdtTARTICU_Artple2());
      struct.setArtnumcor(getgxTv_SdtTARTICU_Artnumcor());
      struct.setArtancsal1(getgxTv_SdtTARTICU_Artancsal1());
      struct.setArtancsal2(getgxTv_SdtTARTICU_Artancsal2());
      struct.setArtancsal3(getgxTv_SdtTARTICU_Artancsal3());
      struct.setArtgraaca2(getgxTv_SdtTARTICU_Artgraaca2());
      struct.setArtgracru2(getgxTv_SdtTARTICU_Artgracru2());
      struct.setClascod(getgxTv_SdtTARTICU_Clascod());
      struct.setArtpmppza(getgxTv_SdtTARTICU_Artpmppza());
      struct.setArtfeccre(getgxTv_SdtTARTICU_Artfeccre());
      struct.setArtusrcod(getgxTv_SdtTARTICU_Artusrcod());
      struct.setArtfecmod(getgxTv_SdtTARTICU_Artfecmod());
      struct.setClasdsc(getgxTv_SdtTARTICU_Clasdsc());
      struct.setArtcomer(getgxTv_SdtTARTICU_Artcomer());
      struct.setClatubcod(getgxTv_SdtTARTICU_Clatubcod());
      struct.setClatubdsc(getgxTv_SdtTARTICU_Clatubdsc());
      struct.setClabolcod(getgxTv_SdtTARTICU_Clabolcod());
      struct.setClaboldsc(getgxTv_SdtTARTICU_Claboldsc());
      struct.setArtrdocru1(getgxTv_SdtTARTICU_Artrdocru1());
      struct.setArtrdocru2(getgxTv_SdtTARTICU_Artrdocru2());
      struct.setArtnmtr(getgxTv_SdtTARTICU_Artnmtr());
      struct.setArtlu(getgxTv_SdtTARTICU_Artlu());
      struct.setArtrb(getgxTv_SdtTARTICU_Artrb());
      struct.setArtpelanh(getgxTv_SdtTARTICU_Artpelanh());
      struct.setArtgrm2sc(getgxTv_SdtTARTICU_Artgrm2sc());
      struct.setArtpmlsc(getgxTv_SdtTARTICU_Artpmlsc());
      struct.setArtancsc(getgxTv_SdtTARTICU_Artancsc());
      struct.setArtpmlcru(getgxTv_SdtTARTICU_Artpmlcru());
      struct.setArtrdtsc(getgxTv_SdtTARTICU_Artrdtsc());
      struct.setArtund(getgxTv_SdtTARTICU_Artund());
      struct.setArtblo(getgxTv_SdtTARTICU_Artblo());
      struct.setArtcla(getgxTv_SdtTARTICU_Artcla());
      struct.setTipartdsc2(getgxTv_SdtTARTICU_Tipartdsc2());
      struct.setArtfabsh(getgxTv_SdtTARTICU_Artfabsh());
      struct.setArtfabst(getgxTv_SdtTARTICU_Artfabst());
      struct.setArtnprog(getgxTv_SdtTARTICU_Artnprog());
      struct.setArtvbd(getgxTv_SdtTARTICU_Artvbd());
      struct.setArtvbn(getgxTv_SdtTARTICU_Artvbn());
      struct.setArtab(getgxTv_SdtTARTICU_Artab());
      struct.setArtobsgrm(getgxTv_SdtTARTICU_Artobsgrm());
      struct.setArtobsanc(getgxTv_SdtTARTICU_Artobsanc());
      struct.setArtcdb(getgxTv_SdtTARTICU_Artcdb());
      struct.setArtgalga(getgxTv_SdtTARTICU_Artgalga());
      struct.setArtplatina(getgxTv_SdtTARTICU_Artplatina());
      struct.setArtpgd(getgxTv_SdtTARTICU_Artpgd());
      struct.setArtth(getgxTv_SdtTARTICU_Artth());
      struct.setArtthn(getgxTv_SdtTARTICU_Artthn());
      struct.setArt_cd(getgxTv_SdtTARTICU_Art_cd());
      struct.setArt_dc(getgxTv_SdtTARTICU_Art_dc());
      struct.setArthilos(getgxTv_SdtTARTICU_Arthilos());
      struct.setArtpasad(getgxTv_SdtTARTICU_Artpasad());
      struct.setArtancc(getgxTv_SdtTARTICU_Artancc());
      struct.setArtgrm2c(getgxTv_SdtTARTICU_Artgrm2c());
      struct.setArtrdoc(getgxTv_SdtTARTICU_Artrdoc());
      struct.setArtacafor(getgxTv_SdtTARTICU_Artacafor());
      struct.setArtanu(getgxTv_SdtTARTICU_Artanu());
      struct.setArtfacuti(getgxTv_SdtTARTICU_Artfacuti());
      struct.setArtnumtip(getgxTv_SdtTARTICU_Artnumtip());
      struct.setArtmt(getgxTv_SdtTARTICU_Artmt());
      struct.setArttrabs(getgxTv_SdtTARTICU_Arttrabs());
      struct.setArtkgmn(getgxTv_SdtTARTICU_Artkgmn());
      struct.setArtacamar(getgxTv_SdtTARTICU_Artacamar());
      struct.setArtacabak(getgxTv_SdtTARTICU_Artacabak());
      struct.setArtelganc(getgxTv_SdtTARTICU_Artelganc());
      struct.setArtelglar(getgxTv_SdtTARTICU_Artelglar());
      struct.setArtrdocru(getgxTv_SdtTARTICU_Artrdocru());
      struct.setArtenclarg(getgxTv_SdtTARTICU_Artenclarg());
      struct.setArtencanc(getgxTv_SdtTARTICU_Artencanc());
      struct.setArtrdto4(getgxTv_SdtTARTICU_Artrdto4());
      struct.setArtdsc2(getgxTv_SdtTARTICU_Artdsc2());
      struct.setArtgrcomp(getgxTv_SdtTARTICU_Artgrcomp());
      struct.setArtkgspp(getgxTv_SdtTARTICU_Artkgspp());
      struct.setArtprepp(getgxTv_SdtTARTICU_Artprepp());
      struct.setArtcdsc(getgxTv_SdtTARTICU_Artcdsc());
      struct.setArtobslon(getgxTv_SdtTARTICU_Artobslon());
      struct.setArtobsfac(getgxTv_SdtTARTICU_Artobsfac());
      struct.setArtobsotras(getgxTv_SdtTARTICU_Artobsotras());
      struct.setArtactivo(getgxTv_SdtTARTICU_Artactivo());
      struct.setMode(getgxTv_SdtTARTICU_Mode());
      struct.setInitialized(getgxTv_SdtTARTICU_Initialized());
      struct.setEmprcod_Z(getgxTv_SdtTARTICU_Emprcod_Z());
      struct.setClicod_Z(getgxTv_SdtTARTICU_Clicod_Z());
      struct.setArtcod_Z(getgxTv_SdtTARTICU_Artcod_Z());
      struct.setArtdsc_Z(getgxTv_SdtTARTICU_Artdsc_Z());
      struct.setClinom_Z(getgxTv_SdtTARTICU_Clinom_Z());
      struct.setArtcodext_Z(getgxTv_SdtTARTICU_Artcodext_Z());
      struct.setEmprnom_Z(getgxTv_SdtTARTICU_Emprnom_Z());
      struct.setArtmat_Z(getgxTv_SdtTARTICU_Artmat_Z());
      struct.setTipartcod_Z(getgxTv_SdtTARTICU_Tipartcod_Z());
      struct.setTipartdsc_Z(getgxTv_SdtTARTICU_Tipartdsc_Z());
      struct.setArtpml_Z(getgxTv_SdtTARTICU_Artpml_Z());
      struct.setArtgracru_Z(getgxTv_SdtTARTICU_Artgracru_Z());
      struct.setArtcrumin_Z(getgxTv_SdtTARTICU_Artcrumin_Z());
      struct.setArtcrumax_Z(getgxTv_SdtTARTICU_Artcrumax_Z());
      struct.setArtacamin_Z(getgxTv_SdtTARTICU_Artacamin_Z());
      struct.setArtacamax_Z(getgxTv_SdtTARTICU_Artacamax_Z());
      struct.setArtren_Z(getgxTv_SdtTARTICU_Artren_Z());
      struct.setArttipple_Z(getgxTv_SdtTARTICU_Arttipple_Z());
      struct.setArttiplar_Z(getgxTv_SdtTARTICU_Arttiplar_Z());
      struct.setArtcorori_Z(getgxTv_SdtTARTICU_Artcorori_Z());
      struct.setArtencori_Z(getgxTv_SdtTARTICU_Artencori_Z());
      struct.setArtsua_Z(getgxTv_SdtTARTICU_Artsua_Z());
      struct.setArtacaqui_Z(getgxTv_SdtTARTICU_Artacaqui_Z());
      struct.setArteti_Z(getgxTv_SdtTARTICU_Arteti_Z());
      struct.setClieti_Z(getgxTv_SdtTARTICU_Clieti_Z());
      struct.setCliurg_Z(getgxTv_SdtTARTICU_Cliurg_Z());
      struct.setArturg_Z(getgxTv_SdtTARTICU_Arturg_Z());
      struct.setArtmer_Z(getgxTv_SdtTARTICU_Artmer_Z());
      struct.setArttra1_Z(getgxTv_SdtTARTICU_Arttra1_Z());
      struct.setArttra2_Z(getgxTv_SdtTARTICU_Arttra2_Z());
      struct.setArttra3_Z(getgxTv_SdtTARTICU_Arttra3_Z());
      struct.setArttrap1_Z(getgxTv_SdtTARTICU_Arttrap1_Z());
      struct.setArttrap2_Z(getgxTv_SdtTARTICU_Arttrap2_Z());
      struct.setArttrap3_Z(getgxTv_SdtTARTICU_Arttrap3_Z());
      struct.setArturd1_Z(getgxTv_SdtTARTICU_Arturd1_Z());
      struct.setArturd2_Z(getgxTv_SdtTARTICU_Arturd2_Z());
      struct.setArturd3_Z(getgxTv_SdtTARTICU_Arturd3_Z());
      struct.setArturdp1_Z(getgxTv_SdtTARTICU_Arturdp1_Z());
      struct.setArturdp2_Z(getgxTv_SdtTARTICU_Arturdp2_Z());
      struct.setArturdp3_Z(getgxTv_SdtTARTICU_Arturdp3_Z());
      struct.setArtenccom_Z(getgxTv_SdtTARTICU_Artenccom_Z());
      struct.setArtencanh_Z(getgxTv_SdtTARTICU_Artencanh_Z());
      struct.setArtgraaca_Z(getgxTv_SdtTARTICU_Artgraaca_Z());
      struct.setArtrdoa_Z(getgxTv_SdtTARTICU_Artrdoa_Z());
      struct.setArtrdon_Z(getgxTv_SdtTARTICU_Artrdon_Z());
      struct.setArtfacabs_Z(getgxTv_SdtTARTICU_Artfacabs_Z());
      struct.setArtple2_Z(getgxTv_SdtTARTICU_Artple2_Z());
      struct.setArtnumcor_Z(getgxTv_SdtTARTICU_Artnumcor_Z());
      struct.setArtancsal1_Z(getgxTv_SdtTARTICU_Artancsal1_Z());
      struct.setArtancsal2_Z(getgxTv_SdtTARTICU_Artancsal2_Z());
      struct.setArtancsal3_Z(getgxTv_SdtTARTICU_Artancsal3_Z());
      struct.setArtgraaca2_Z(getgxTv_SdtTARTICU_Artgraaca2_Z());
      struct.setArtgracru2_Z(getgxTv_SdtTARTICU_Artgracru2_Z());
      struct.setClascod_Z(getgxTv_SdtTARTICU_Clascod_Z());
      struct.setArtpmppza_Z(getgxTv_SdtTARTICU_Artpmppza_Z());
      struct.setArtfeccre_Z(getgxTv_SdtTARTICU_Artfeccre_Z());
      struct.setArtusrcod_Z(getgxTv_SdtTARTICU_Artusrcod_Z());
      struct.setArtfecmod_Z(getgxTv_SdtTARTICU_Artfecmod_Z());
      struct.setClasdsc_Z(getgxTv_SdtTARTICU_Clasdsc_Z());
      struct.setArtcomer_Z(getgxTv_SdtTARTICU_Artcomer_Z());
      struct.setClatubcod_Z(getgxTv_SdtTARTICU_Clatubcod_Z());
      struct.setClatubdsc_Z(getgxTv_SdtTARTICU_Clatubdsc_Z());
      struct.setClabolcod_Z(getgxTv_SdtTARTICU_Clabolcod_Z());
      struct.setClaboldsc_Z(getgxTv_SdtTARTICU_Claboldsc_Z());
      struct.setArtrdocru1_Z(getgxTv_SdtTARTICU_Artrdocru1_Z());
      struct.setArtrdocru2_Z(getgxTv_SdtTARTICU_Artrdocru2_Z());
      struct.setArtnmtr_Z(getgxTv_SdtTARTICU_Artnmtr_Z());
      struct.setArtlu_Z(getgxTv_SdtTARTICU_Artlu_Z());
      struct.setArtrb_Z(getgxTv_SdtTARTICU_Artrb_Z());
      struct.setArtpelanh_Z(getgxTv_SdtTARTICU_Artpelanh_Z());
      struct.setArtgrm2sc_Z(getgxTv_SdtTARTICU_Artgrm2sc_Z());
      struct.setArtpmlsc_Z(getgxTv_SdtTARTICU_Artpmlsc_Z());
      struct.setArtancsc_Z(getgxTv_SdtTARTICU_Artancsc_Z());
      struct.setArtpmlcru_Z(getgxTv_SdtTARTICU_Artpmlcru_Z());
      struct.setArtrdtsc_Z(getgxTv_SdtTARTICU_Artrdtsc_Z());
      struct.setArtund_Z(getgxTv_SdtTARTICU_Artund_Z());
      struct.setArtblo_Z(getgxTv_SdtTARTICU_Artblo_Z());
      struct.setArtcla_Z(getgxTv_SdtTARTICU_Artcla_Z());
      struct.setTipartdsc2_Z(getgxTv_SdtTARTICU_Tipartdsc2_Z());
      struct.setArtfabsh_Z(getgxTv_SdtTARTICU_Artfabsh_Z());
      struct.setArtfabst_Z(getgxTv_SdtTARTICU_Artfabst_Z());
      struct.setArtnprog_Z(getgxTv_SdtTARTICU_Artnprog_Z());
      struct.setArtvbd_Z(getgxTv_SdtTARTICU_Artvbd_Z());
      struct.setArtvbn_Z(getgxTv_SdtTARTICU_Artvbn_Z());
      struct.setArtab_Z(getgxTv_SdtTARTICU_Artab_Z());
      struct.setArtobsgrm_Z(getgxTv_SdtTARTICU_Artobsgrm_Z());
      struct.setArtobsanc_Z(getgxTv_SdtTARTICU_Artobsanc_Z());
      struct.setArtcdb_Z(getgxTv_SdtTARTICU_Artcdb_Z());
      struct.setArtgalga_Z(getgxTv_SdtTARTICU_Artgalga_Z());
      struct.setArtplatina_Z(getgxTv_SdtTARTICU_Artplatina_Z());
      struct.setArtpgd_Z(getgxTv_SdtTARTICU_Artpgd_Z());
      struct.setArtth_Z(getgxTv_SdtTARTICU_Artth_Z());
      struct.setArtthn_Z(getgxTv_SdtTARTICU_Artthn_Z());
      struct.setArt_cd_Z(getgxTv_SdtTARTICU_Art_cd_Z());
      struct.setArt_dc_Z(getgxTv_SdtTARTICU_Art_dc_Z());
      struct.setArthilos_Z(getgxTv_SdtTARTICU_Arthilos_Z());
      struct.setArtpasad_Z(getgxTv_SdtTARTICU_Artpasad_Z());
      struct.setArtancc_Z(getgxTv_SdtTARTICU_Artancc_Z());
      struct.setArtgrm2c_Z(getgxTv_SdtTARTICU_Artgrm2c_Z());
      struct.setArtrdoc_Z(getgxTv_SdtTARTICU_Artrdoc_Z());
      struct.setArtacafor_Z(getgxTv_SdtTARTICU_Artacafor_Z());
      struct.setArtanu_Z(getgxTv_SdtTARTICU_Artanu_Z());
      struct.setArtfacuti_Z(getgxTv_SdtTARTICU_Artfacuti_Z());
      struct.setArtnumtip_Z(getgxTv_SdtTARTICU_Artnumtip_Z());
      struct.setArtmt_Z(getgxTv_SdtTARTICU_Artmt_Z());
      struct.setArttrabs_Z(getgxTv_SdtTARTICU_Arttrabs_Z());
      struct.setArtkgmn_Z(getgxTv_SdtTARTICU_Artkgmn_Z());
      struct.setArtacamar_Z(getgxTv_SdtTARTICU_Artacamar_Z());
      struct.setArtacabak_Z(getgxTv_SdtTARTICU_Artacabak_Z());
      struct.setArtelganc_Z(getgxTv_SdtTARTICU_Artelganc_Z());
      struct.setArtelglar_Z(getgxTv_SdtTARTICU_Artelglar_Z());
      struct.setArtrdocru_Z(getgxTv_SdtTARTICU_Artrdocru_Z());
      struct.setArtenclarg_Z(getgxTv_SdtTARTICU_Artenclarg_Z());
      struct.setArtencanc_Z(getgxTv_SdtTARTICU_Artencanc_Z());
      struct.setArtrdto4_Z(getgxTv_SdtTARTICU_Artrdto4_Z());
      struct.setArtdsc2_Z(getgxTv_SdtTARTICU_Artdsc2_Z());
      struct.setArtgrcomp_Z(getgxTv_SdtTARTICU_Artgrcomp_Z());
      struct.setArtkgspp_Z(getgxTv_SdtTARTICU_Artkgspp_Z());
      struct.setArtprepp_Z(getgxTv_SdtTARTICU_Artprepp_Z());
      struct.setArtcdsc_Z(getgxTv_SdtTARTICU_Artcdsc_Z());
      struct.setArtobsfac_Z(getgxTv_SdtTARTICU_Artobsfac_Z());
      struct.setArtobsotras_Z(getgxTv_SdtTARTICU_Artobsotras_Z());
      struct.setArtactivo_Z(getgxTv_SdtTARTICU_Artactivo_Z());
      struct.setClicod_N(getgxTv_SdtTARTICU_Clicod_N());
      struct.setArtcod_N(getgxTv_SdtTARTICU_Artcod_N());
      struct.setArtdsc_N(getgxTv_SdtTARTICU_Artdsc_N());
      struct.setArtcodext_N(getgxTv_SdtTARTICU_Artcodext_N());
      struct.setEmprnom_N(getgxTv_SdtTARTICU_Emprnom_N());
      struct.setArtmat_N(getgxTv_SdtTARTICU_Artmat_N());
      struct.setTipartdsc_N(getgxTv_SdtTARTICU_Tipartdsc_N());
      struct.setArtpml_N(getgxTv_SdtTARTICU_Artpml_N());
      struct.setArtgracru_N(getgxTv_SdtTARTICU_Artgracru_N());
      struct.setArtcrumin_N(getgxTv_SdtTARTICU_Artcrumin_N());
      struct.setArtcrumax_N(getgxTv_SdtTARTICU_Artcrumax_N());
      struct.setArtacamin_N(getgxTv_SdtTARTICU_Artacamin_N());
      struct.setArtacamax_N(getgxTv_SdtTARTICU_Artacamax_N());
      struct.setArtren_N(getgxTv_SdtTARTICU_Artren_N());
      struct.setArttipple_N(getgxTv_SdtTARTICU_Arttipple_N());
      struct.setArttiplar_N(getgxTv_SdtTARTICU_Arttiplar_N());
      struct.setArtcorori_N(getgxTv_SdtTARTICU_Artcorori_N());
      struct.setArtencori_N(getgxTv_SdtTARTICU_Artencori_N());
      struct.setArtsua_N(getgxTv_SdtTARTICU_Artsua_N());
      struct.setArtacaqui_N(getgxTv_SdtTARTICU_Artacaqui_N());
      struct.setArteti_N(getgxTv_SdtTARTICU_Arteti_N());
      struct.setArturg_N(getgxTv_SdtTARTICU_Arturg_N());
      struct.setArtmer_N(getgxTv_SdtTARTICU_Artmer_N());
      struct.setArttra1_N(getgxTv_SdtTARTICU_Arttra1_N());
      struct.setArttra2_N(getgxTv_SdtTARTICU_Arttra2_N());
      struct.setArttra3_N(getgxTv_SdtTARTICU_Arttra3_N());
      struct.setArttrap1_N(getgxTv_SdtTARTICU_Arttrap1_N());
      struct.setArttrap2_N(getgxTv_SdtTARTICU_Arttrap2_N());
      struct.setArttrap3_N(getgxTv_SdtTARTICU_Arttrap3_N());
      struct.setArturd1_N(getgxTv_SdtTARTICU_Arturd1_N());
      struct.setArturd2_N(getgxTv_SdtTARTICU_Arturd2_N());
      struct.setArturd3_N(getgxTv_SdtTARTICU_Arturd3_N());
      struct.setArturdp1_N(getgxTv_SdtTARTICU_Arturdp1_N());
      struct.setArturdp2_N(getgxTv_SdtTARTICU_Arturdp2_N());
      struct.setArturdp3_N(getgxTv_SdtTARTICU_Arturdp3_N());
      struct.setArtenccom_N(getgxTv_SdtTARTICU_Artenccom_N());
      struct.setArtencanh_N(getgxTv_SdtTARTICU_Artencanh_N());
      struct.setArtgraaca_N(getgxTv_SdtTARTICU_Artgraaca_N());
      struct.setArtrdoa_N(getgxTv_SdtTARTICU_Artrdoa_N());
      struct.setArtrdon_N(getgxTv_SdtTARTICU_Artrdon_N());
      struct.setArtfacabs_N(getgxTv_SdtTARTICU_Artfacabs_N());
      struct.setArtple2_N(getgxTv_SdtTARTICU_Artple2_N());
      struct.setArtnumcor_N(getgxTv_SdtTARTICU_Artnumcor_N());
      struct.setArtancsal1_N(getgxTv_SdtTARTICU_Artancsal1_N());
      struct.setArtancsal2_N(getgxTv_SdtTARTICU_Artancsal2_N());
      struct.setArtancsal3_N(getgxTv_SdtTARTICU_Artancsal3_N());
      struct.setArtgraaca2_N(getgxTv_SdtTARTICU_Artgraaca2_N());
      struct.setArtgracru2_N(getgxTv_SdtTARTICU_Artgracru2_N());
      struct.setClascod_N(getgxTv_SdtTARTICU_Clascod_N());
      struct.setArtpmppza_N(getgxTv_SdtTARTICU_Artpmppza_N());
      struct.setArtfeccre_N(getgxTv_SdtTARTICU_Artfeccre_N());
      struct.setArtusrcod_N(getgxTv_SdtTARTICU_Artusrcod_N());
      struct.setArtfecmod_N(getgxTv_SdtTARTICU_Artfecmod_N());
      struct.setClasdsc_N(getgxTv_SdtTARTICU_Clasdsc_N());
      struct.setArtcomer_N(getgxTv_SdtTARTICU_Artcomer_N());
      struct.setClatubcod_N(getgxTv_SdtTARTICU_Clatubcod_N());
      struct.setClatubdsc_N(getgxTv_SdtTARTICU_Clatubdsc_N());
      struct.setClabolcod_N(getgxTv_SdtTARTICU_Clabolcod_N());
      struct.setClaboldsc_N(getgxTv_SdtTARTICU_Claboldsc_N());
      struct.setArtrdocru1_N(getgxTv_SdtTARTICU_Artrdocru1_N());
      struct.setArtrdocru2_N(getgxTv_SdtTARTICU_Artrdocru2_N());
      struct.setArtnmtr_N(getgxTv_SdtTARTICU_Artnmtr_N());
      struct.setArtlu_N(getgxTv_SdtTARTICU_Artlu_N());
      struct.setArtrb_N(getgxTv_SdtTARTICU_Artrb_N());
      struct.setArtpelanh_N(getgxTv_SdtTARTICU_Artpelanh_N());
      struct.setArtgrm2sc_N(getgxTv_SdtTARTICU_Artgrm2sc_N());
      struct.setArtpmlsc_N(getgxTv_SdtTARTICU_Artpmlsc_N());
      struct.setArtancsc_N(getgxTv_SdtTARTICU_Artancsc_N());
      struct.setArtpmlcru_N(getgxTv_SdtTARTICU_Artpmlcru_N());
      struct.setArtrdtsc_N(getgxTv_SdtTARTICU_Artrdtsc_N());
      struct.setArtund_N(getgxTv_SdtTARTICU_Artund_N());
      struct.setArtblo_N(getgxTv_SdtTARTICU_Artblo_N());
      struct.setArtcla_N(getgxTv_SdtTARTICU_Artcla_N());
      struct.setTipartdsc2_N(getgxTv_SdtTARTICU_Tipartdsc2_N());
      struct.setArtfabsh_N(getgxTv_SdtTARTICU_Artfabsh_N());
      struct.setArtfabst_N(getgxTv_SdtTARTICU_Artfabst_N());
      struct.setArtnprog_N(getgxTv_SdtTARTICU_Artnprog_N());
      struct.setArtvbd_N(getgxTv_SdtTARTICU_Artvbd_N());
      struct.setArtvbn_N(getgxTv_SdtTARTICU_Artvbn_N());
      struct.setArtab_N(getgxTv_SdtTARTICU_Artab_N());
      struct.setArtobsgrm_N(getgxTv_SdtTARTICU_Artobsgrm_N());
      struct.setArtobsanc_N(getgxTv_SdtTARTICU_Artobsanc_N());
      struct.setArtcdb_N(getgxTv_SdtTARTICU_Artcdb_N());
      struct.setArtgalga_N(getgxTv_SdtTARTICU_Artgalga_N());
      struct.setArtplatina_N(getgxTv_SdtTARTICU_Artplatina_N());
      struct.setArtpgd_N(getgxTv_SdtTARTICU_Artpgd_N());
      struct.setArtth_N(getgxTv_SdtTARTICU_Artth_N());
      struct.setArtthn_N(getgxTv_SdtTARTICU_Artthn_N());
      struct.setArt_cd_N(getgxTv_SdtTARTICU_Art_cd_N());
      struct.setArt_dc_N(getgxTv_SdtTARTICU_Art_dc_N());
      struct.setArthilos_N(getgxTv_SdtTARTICU_Arthilos_N());
      struct.setArtpasad_N(getgxTv_SdtTARTICU_Artpasad_N());
      struct.setArtancc_N(getgxTv_SdtTARTICU_Artancc_N());
      struct.setArtgrm2c_N(getgxTv_SdtTARTICU_Artgrm2c_N());
      struct.setArtrdoc_N(getgxTv_SdtTARTICU_Artrdoc_N());
      struct.setArtacafor_N(getgxTv_SdtTARTICU_Artacafor_N());
      struct.setArtanu_N(getgxTv_SdtTARTICU_Artanu_N());
      struct.setArtfacuti_N(getgxTv_SdtTARTICU_Artfacuti_N());
      struct.setArtnumtip_N(getgxTv_SdtTARTICU_Artnumtip_N());
      struct.setArtmt_N(getgxTv_SdtTARTICU_Artmt_N());
      struct.setArttrabs_N(getgxTv_SdtTARTICU_Arttrabs_N());
      struct.setArtkgmn_N(getgxTv_SdtTARTICU_Artkgmn_N());
      struct.setArtacamar_N(getgxTv_SdtTARTICU_Artacamar_N());
      struct.setArtacabak_N(getgxTv_SdtTARTICU_Artacabak_N());
      struct.setArtelganc_N(getgxTv_SdtTARTICU_Artelganc_N());
      struct.setArtelglar_N(getgxTv_SdtTARTICU_Artelglar_N());
      struct.setArtrdocru_N(getgxTv_SdtTARTICU_Artrdocru_N());
      struct.setArtenclarg_N(getgxTv_SdtTARTICU_Artenclarg_N());
      struct.setArtencanc_N(getgxTv_SdtTARTICU_Artencanc_N());
      struct.setArtrdto4_N(getgxTv_SdtTARTICU_Artrdto4_N());
      struct.setArtdsc2_N(getgxTv_SdtTARTICU_Artdsc2_N());
      struct.setArtgrcomp_N(getgxTv_SdtTARTICU_Artgrcomp_N());
      struct.setArtkgspp_N(getgxTv_SdtTARTICU_Artkgspp_N());
      struct.setArtprepp_N(getgxTv_SdtTARTICU_Artprepp_N());
      struct.setArtobslon_N(getgxTv_SdtTARTICU_Artobslon_N());
      struct.setArtobsfac_N(getgxTv_SdtTARTICU_Artobsfac_N());
      struct.setArtobsotras_N(getgxTv_SdtTARTICU_Artobsotras_N());
      return struct ;
   }

   private byte gxTv_SdtTARTICU_N ;
   private byte gxTv_SdtTARTICU_Cliurg ;
   private byte gxTv_SdtTARTICU_Arturg ;
   private byte gxTv_SdtTARTICU_Artcla ;
   private byte gxTv_SdtTARTICU_Artnprog ;
   private byte gxTv_SdtTARTICU_Artmt ;
   private byte gxTv_SdtTARTICU_Arttrabs ;
   private byte gxTv_SdtTARTICU_Cliurg_Z ;
   private byte gxTv_SdtTARTICU_Arturg_Z ;
   private byte gxTv_SdtTARTICU_Artcla_Z ;
   private byte gxTv_SdtTARTICU_Artnprog_Z ;
   private byte gxTv_SdtTARTICU_Artmt_Z ;
   private byte gxTv_SdtTARTICU_Arttrabs_Z ;
   private byte gxTv_SdtTARTICU_Clicod_N ;
   private byte gxTv_SdtTARTICU_Artcod_N ;
   private byte gxTv_SdtTARTICU_Artdsc_N ;
   private byte gxTv_SdtTARTICU_Artcodext_N ;
   private byte gxTv_SdtTARTICU_Emprnom_N ;
   private byte gxTv_SdtTARTICU_Artmat_N ;
   private byte gxTv_SdtTARTICU_Tipartdsc_N ;
   private byte gxTv_SdtTARTICU_Artpml_N ;
   private byte gxTv_SdtTARTICU_Artgracru_N ;
   private byte gxTv_SdtTARTICU_Artcrumin_N ;
   private byte gxTv_SdtTARTICU_Artcrumax_N ;
   private byte gxTv_SdtTARTICU_Artacamin_N ;
   private byte gxTv_SdtTARTICU_Artacamax_N ;
   private byte gxTv_SdtTARTICU_Artren_N ;
   private byte gxTv_SdtTARTICU_Arttipple_N ;
   private byte gxTv_SdtTARTICU_Arttiplar_N ;
   private byte gxTv_SdtTARTICU_Artcorori_N ;
   private byte gxTv_SdtTARTICU_Artencori_N ;
   private byte gxTv_SdtTARTICU_Artsua_N ;
   private byte gxTv_SdtTARTICU_Artacaqui_N ;
   private byte gxTv_SdtTARTICU_Arteti_N ;
   private byte gxTv_SdtTARTICU_Arturg_N ;
   private byte gxTv_SdtTARTICU_Artmer_N ;
   private byte gxTv_SdtTARTICU_Arttra1_N ;
   private byte gxTv_SdtTARTICU_Arttra2_N ;
   private byte gxTv_SdtTARTICU_Arttra3_N ;
   private byte gxTv_SdtTARTICU_Arttrap1_N ;
   private byte gxTv_SdtTARTICU_Arttrap2_N ;
   private byte gxTv_SdtTARTICU_Arttrap3_N ;
   private byte gxTv_SdtTARTICU_Arturd1_N ;
   private byte gxTv_SdtTARTICU_Arturd2_N ;
   private byte gxTv_SdtTARTICU_Arturd3_N ;
   private byte gxTv_SdtTARTICU_Arturdp1_N ;
   private byte gxTv_SdtTARTICU_Arturdp2_N ;
   private byte gxTv_SdtTARTICU_Arturdp3_N ;
   private byte gxTv_SdtTARTICU_Artenccom_N ;
   private byte gxTv_SdtTARTICU_Artencanh_N ;
   private byte gxTv_SdtTARTICU_Artgraaca_N ;
   private byte gxTv_SdtTARTICU_Artrdoa_N ;
   private byte gxTv_SdtTARTICU_Artrdon_N ;
   private byte gxTv_SdtTARTICU_Artfacabs_N ;
   private byte gxTv_SdtTARTICU_Artple2_N ;
   private byte gxTv_SdtTARTICU_Artnumcor_N ;
   private byte gxTv_SdtTARTICU_Artancsal1_N ;
   private byte gxTv_SdtTARTICU_Artancsal2_N ;
   private byte gxTv_SdtTARTICU_Artancsal3_N ;
   private byte gxTv_SdtTARTICU_Artgraaca2_N ;
   private byte gxTv_SdtTARTICU_Artgracru2_N ;
   private byte gxTv_SdtTARTICU_Clascod_N ;
   private byte gxTv_SdtTARTICU_Artpmppza_N ;
   private byte gxTv_SdtTARTICU_Artfeccre_N ;
   private byte gxTv_SdtTARTICU_Artusrcod_N ;
   private byte gxTv_SdtTARTICU_Artfecmod_N ;
   private byte gxTv_SdtTARTICU_Clasdsc_N ;
   private byte gxTv_SdtTARTICU_Artcomer_N ;
   private byte gxTv_SdtTARTICU_Clatubcod_N ;
   private byte gxTv_SdtTARTICU_Clatubdsc_N ;
   private byte gxTv_SdtTARTICU_Clabolcod_N ;
   private byte gxTv_SdtTARTICU_Claboldsc_N ;
   private byte gxTv_SdtTARTICU_Artrdocru1_N ;
   private byte gxTv_SdtTARTICU_Artrdocru2_N ;
   private byte gxTv_SdtTARTICU_Artnmtr_N ;
   private byte gxTv_SdtTARTICU_Artlu_N ;
   private byte gxTv_SdtTARTICU_Artrb_N ;
   private byte gxTv_SdtTARTICU_Artpelanh_N ;
   private byte gxTv_SdtTARTICU_Artgrm2sc_N ;
   private byte gxTv_SdtTARTICU_Artpmlsc_N ;
   private byte gxTv_SdtTARTICU_Artancsc_N ;
   private byte gxTv_SdtTARTICU_Artpmlcru_N ;
   private byte gxTv_SdtTARTICU_Artrdtsc_N ;
   private byte gxTv_SdtTARTICU_Artund_N ;
   private byte gxTv_SdtTARTICU_Artblo_N ;
   private byte gxTv_SdtTARTICU_Artcla_N ;
   private byte gxTv_SdtTARTICU_Tipartdsc2_N ;
   private byte gxTv_SdtTARTICU_Artfabsh_N ;
   private byte gxTv_SdtTARTICU_Artfabst_N ;
   private byte gxTv_SdtTARTICU_Artnprog_N ;
   private byte gxTv_SdtTARTICU_Artvbd_N ;
   private byte gxTv_SdtTARTICU_Artvbn_N ;
   private byte gxTv_SdtTARTICU_Artab_N ;
   private byte gxTv_SdtTARTICU_Artobsgrm_N ;
   private byte gxTv_SdtTARTICU_Artobsanc_N ;
   private byte gxTv_SdtTARTICU_Artcdb_N ;
   private byte gxTv_SdtTARTICU_Artgalga_N ;
   private byte gxTv_SdtTARTICU_Artplatina_N ;
   private byte gxTv_SdtTARTICU_Artpgd_N ;
   private byte gxTv_SdtTARTICU_Artth_N ;
   private byte gxTv_SdtTARTICU_Artthn_N ;
   private byte gxTv_SdtTARTICU_Art_cd_N ;
   private byte gxTv_SdtTARTICU_Art_dc_N ;
   private byte gxTv_SdtTARTICU_Arthilos_N ;
   private byte gxTv_SdtTARTICU_Artpasad_N ;
   private byte gxTv_SdtTARTICU_Artancc_N ;
   private byte gxTv_SdtTARTICU_Artgrm2c_N ;
   private byte gxTv_SdtTARTICU_Artrdoc_N ;
   private byte gxTv_SdtTARTICU_Artacafor_N ;
   private byte gxTv_SdtTARTICU_Artanu_N ;
   private byte gxTv_SdtTARTICU_Artfacuti_N ;
   private byte gxTv_SdtTARTICU_Artnumtip_N ;
   private byte gxTv_SdtTARTICU_Artmt_N ;
   private byte gxTv_SdtTARTICU_Arttrabs_N ;
   private byte gxTv_SdtTARTICU_Artkgmn_N ;
   private byte gxTv_SdtTARTICU_Artacamar_N ;
   private byte gxTv_SdtTARTICU_Artacabak_N ;
   private byte gxTv_SdtTARTICU_Artelganc_N ;
   private byte gxTv_SdtTARTICU_Artelglar_N ;
   private byte gxTv_SdtTARTICU_Artrdocru_N ;
   private byte gxTv_SdtTARTICU_Artenclarg_N ;
   private byte gxTv_SdtTARTICU_Artencanc_N ;
   private byte gxTv_SdtTARTICU_Artrdto4_N ;
   private byte gxTv_SdtTARTICU_Artdsc2_N ;
   private byte gxTv_SdtTARTICU_Artgrcomp_N ;
   private byte gxTv_SdtTARTICU_Artkgspp_N ;
   private byte gxTv_SdtTARTICU_Artprepp_N ;
   private byte gxTv_SdtTARTICU_Artobslon_N ;
   private byte gxTv_SdtTARTICU_Artobsfac_N ;
   private byte gxTv_SdtTARTICU_Artobsotras_N ;
   private short gxTv_SdtTARTICU_Tipartcod ;
   private short gxTv_SdtTARTICU_Artpml ;
   private short gxTv_SdtTARTICU_Artgracru ;
   private short gxTv_SdtTARTICU_Artcrumin ;
   private short gxTv_SdtTARTICU_Artcrumax ;
   private short gxTv_SdtTARTICU_Artacamin ;
   private short gxTv_SdtTARTICU_Artacamax ;
   private short gxTv_SdtTARTICU_Arttrap1 ;
   private short gxTv_SdtTARTICU_Arttrap2 ;
   private short gxTv_SdtTARTICU_Arttrap3 ;
   private short gxTv_SdtTARTICU_Arturdp1 ;
   private short gxTv_SdtTARTICU_Arturdp2 ;
   private short gxTv_SdtTARTICU_Arturdp3 ;
   private short gxTv_SdtTARTICU_Artenccom ;
   private short gxTv_SdtTARTICU_Artencanh ;
   private short gxTv_SdtTARTICU_Artgraaca ;
   private short gxTv_SdtTARTICU_Artnumcor ;
   private short gxTv_SdtTARTICU_Artancsal1 ;
   private short gxTv_SdtTARTICU_Artancsal2 ;
   private short gxTv_SdtTARTICU_Artancsal3 ;
   private short gxTv_SdtTARTICU_Artgraaca2 ;
   private short gxTv_SdtTARTICU_Artgracru2 ;
   private short gxTv_SdtTARTICU_Clascod ;
   private short gxTv_SdtTARTICU_Clatubcod ;
   private short gxTv_SdtTARTICU_Clabolcod ;
   private short gxTv_SdtTARTICU_Artrb ;
   private short gxTv_SdtTARTICU_Artpelanh ;
   private short gxTv_SdtTARTICU_Artgrm2sc ;
   private short gxTv_SdtTARTICU_Artpmlsc ;
   private short gxTv_SdtTARTICU_Artancsc ;
   private short gxTv_SdtTARTICU_Artpmlcru ;
   private short gxTv_SdtTARTICU_Artvbd ;
   private short gxTv_SdtTARTICU_Artvbn ;
   private short gxTv_SdtTARTICU_Artab ;
   private short gxTv_SdtTARTICU_Artth ;
   private short gxTv_SdtTARTICU_Art_cd ;
   private short gxTv_SdtTARTICU_Arthilos ;
   private short gxTv_SdtTARTICU_Artpasad ;
   private short gxTv_SdtTARTICU_Artancc ;
   private short gxTv_SdtTARTICU_Artgrm2c ;
   private short gxTv_SdtTARTICU_Initialized ;
   private short gxTv_SdtTARTICU_Tipartcod_Z ;
   private short gxTv_SdtTARTICU_Artpml_Z ;
   private short gxTv_SdtTARTICU_Artgracru_Z ;
   private short gxTv_SdtTARTICU_Artcrumin_Z ;
   private short gxTv_SdtTARTICU_Artcrumax_Z ;
   private short gxTv_SdtTARTICU_Artacamin_Z ;
   private short gxTv_SdtTARTICU_Artacamax_Z ;
   private short gxTv_SdtTARTICU_Arttrap1_Z ;
   private short gxTv_SdtTARTICU_Arttrap2_Z ;
   private short gxTv_SdtTARTICU_Arttrap3_Z ;
   private short gxTv_SdtTARTICU_Arturdp1_Z ;
   private short gxTv_SdtTARTICU_Arturdp2_Z ;
   private short gxTv_SdtTARTICU_Arturdp3_Z ;
   private short gxTv_SdtTARTICU_Artenccom_Z ;
   private short gxTv_SdtTARTICU_Artencanh_Z ;
   private short gxTv_SdtTARTICU_Artgraaca_Z ;
   private short gxTv_SdtTARTICU_Artnumcor_Z ;
   private short gxTv_SdtTARTICU_Artancsal1_Z ;
   private short gxTv_SdtTARTICU_Artancsal2_Z ;
   private short gxTv_SdtTARTICU_Artancsal3_Z ;
   private short gxTv_SdtTARTICU_Artgraaca2_Z ;
   private short gxTv_SdtTARTICU_Artgracru2_Z ;
   private short gxTv_SdtTARTICU_Clascod_Z ;
   private short gxTv_SdtTARTICU_Clatubcod_Z ;
   private short gxTv_SdtTARTICU_Clabolcod_Z ;
   private short gxTv_SdtTARTICU_Artrb_Z ;
   private short gxTv_SdtTARTICU_Artpelanh_Z ;
   private short gxTv_SdtTARTICU_Artgrm2sc_Z ;
   private short gxTv_SdtTARTICU_Artpmlsc_Z ;
   private short gxTv_SdtTARTICU_Artancsc_Z ;
   private short gxTv_SdtTARTICU_Artpmlcru_Z ;
   private short gxTv_SdtTARTICU_Artvbd_Z ;
   private short gxTv_SdtTARTICU_Artvbn_Z ;
   private short gxTv_SdtTARTICU_Artab_Z ;
   private short gxTv_SdtTARTICU_Artth_Z ;
   private short gxTv_SdtTARTICU_Art_cd_Z ;
   private short gxTv_SdtTARTICU_Arthilos_Z ;
   private short gxTv_SdtTARTICU_Artpasad_Z ;
   private short gxTv_SdtTARTICU_Artancc_Z ;
   private short gxTv_SdtTARTICU_Artgrm2c_Z ;
   private short readOk ;
   private short nOutParmCount ;
   private int gxTv_SdtTARTICU_Clicod ;
   private int gxTv_SdtTARTICU_Artacafor ;
   private int gxTv_SdtTARTICU_Artnumtip ;
   private int gxTv_SdtTARTICU_Clicod_Z ;
   private int gxTv_SdtTARTICU_Artacafor_Z ;
   private int gxTv_SdtTARTICU_Artnumtip_Z ;
   private java.math.BigDecimal gxTv_SdtTARTICU_Artren ;
   private java.math.BigDecimal gxTv_SdtTARTICU_Artmer ;
   private java.math.BigDecimal gxTv_SdtTARTICU_Artrdoa ;
   private java.math.BigDecimal gxTv_SdtTARTICU_Artrdon ;
   private java.math.BigDecimal gxTv_SdtTARTICU_Artfacabs ;
   private java.math.BigDecimal gxTv_SdtTARTICU_Artpmppza ;
   private java.math.BigDecimal gxTv_SdtTARTICU_Artrdocru1 ;
   private java.math.BigDecimal gxTv_SdtTARTICU_Artrdocru2 ;
   private java.math.BigDecimal gxTv_SdtTARTICU_Artlu ;
   private java.math.BigDecimal gxTv_SdtTARTICU_Artrdtsc ;
   private java.math.BigDecimal gxTv_SdtTARTICU_Artfabsh ;
   private java.math.BigDecimal gxTv_SdtTARTICU_Artfabst ;
   private java.math.BigDecimal gxTv_SdtTARTICU_Artrdoc ;
   private java.math.BigDecimal gxTv_SdtTARTICU_Artfacuti ;
   private java.math.BigDecimal gxTv_SdtTARTICU_Artkgmn ;
   private java.math.BigDecimal gxTv_SdtTARTICU_Artelganc ;
   private java.math.BigDecimal gxTv_SdtTARTICU_Artelglar ;
   private java.math.BigDecimal gxTv_SdtTARTICU_Artrdocru ;
   private java.math.BigDecimal gxTv_SdtTARTICU_Artenclarg ;
   private java.math.BigDecimal gxTv_SdtTARTICU_Artencanc ;
   private java.math.BigDecimal gxTv_SdtTARTICU_Artrdto4 ;
   private java.math.BigDecimal gxTv_SdtTARTICU_Artgrcomp ;
   private java.math.BigDecimal gxTv_SdtTARTICU_Artkgspp ;
   private java.math.BigDecimal gxTv_SdtTARTICU_Artprepp ;
   private java.math.BigDecimal gxTv_SdtTARTICU_Artren_Z ;
   private java.math.BigDecimal gxTv_SdtTARTICU_Artmer_Z ;
   private java.math.BigDecimal gxTv_SdtTARTICU_Artrdoa_Z ;
   private java.math.BigDecimal gxTv_SdtTARTICU_Artrdon_Z ;
   private java.math.BigDecimal gxTv_SdtTARTICU_Artfacabs_Z ;
   private java.math.BigDecimal gxTv_SdtTARTICU_Artpmppza_Z ;
   private java.math.BigDecimal gxTv_SdtTARTICU_Artrdocru1_Z ;
   private java.math.BigDecimal gxTv_SdtTARTICU_Artrdocru2_Z ;
   private java.math.BigDecimal gxTv_SdtTARTICU_Artlu_Z ;
   private java.math.BigDecimal gxTv_SdtTARTICU_Artrdtsc_Z ;
   private java.math.BigDecimal gxTv_SdtTARTICU_Artfabsh_Z ;
   private java.math.BigDecimal gxTv_SdtTARTICU_Artfabst_Z ;
   private java.math.BigDecimal gxTv_SdtTARTICU_Artrdoc_Z ;
   private java.math.BigDecimal gxTv_SdtTARTICU_Artfacuti_Z ;
   private java.math.BigDecimal gxTv_SdtTARTICU_Artkgmn_Z ;
   private java.math.BigDecimal gxTv_SdtTARTICU_Artelganc_Z ;
   private java.math.BigDecimal gxTv_SdtTARTICU_Artelglar_Z ;
   private java.math.BigDecimal gxTv_SdtTARTICU_Artrdocru_Z ;
   private java.math.BigDecimal gxTv_SdtTARTICU_Artenclarg_Z ;
   private java.math.BigDecimal gxTv_SdtTARTICU_Artencanc_Z ;
   private java.math.BigDecimal gxTv_SdtTARTICU_Artrdto4_Z ;
   private java.math.BigDecimal gxTv_SdtTARTICU_Artgrcomp_Z ;
   private java.math.BigDecimal gxTv_SdtTARTICU_Artkgspp_Z ;
   private java.math.BigDecimal gxTv_SdtTARTICU_Artprepp_Z ;
   private String gxTv_SdtTARTICU_Emprcod ;
   private String gxTv_SdtTARTICU_Artcod ;
   private String gxTv_SdtTARTICU_Artdsc ;
   private String gxTv_SdtTARTICU_Clinom ;
   private String gxTv_SdtTARTICU_Artcodext ;
   private String gxTv_SdtTARTICU_Emprnom ;
   private String gxTv_SdtTARTICU_Artmat ;
   private String gxTv_SdtTARTICU_Tipartdsc ;
   private String gxTv_SdtTARTICU_Arttipple ;
   private String gxTv_SdtTARTICU_Arttiplar ;
   private String gxTv_SdtTARTICU_Artcorori ;
   private String gxTv_SdtTARTICU_Artencori ;
   private String gxTv_SdtTARTICU_Artsua ;
   private String gxTv_SdtTARTICU_Artacaqui ;
   private String gxTv_SdtTARTICU_Arteti ;
   private String gxTv_SdtTARTICU_Clieti ;
   private String gxTv_SdtTARTICU_Arttra1 ;
   private String gxTv_SdtTARTICU_Arttra2 ;
   private String gxTv_SdtTARTICU_Arttra3 ;
   private String gxTv_SdtTARTICU_Arturd1 ;
   private String gxTv_SdtTARTICU_Arturd2 ;
   private String gxTv_SdtTARTICU_Arturd3 ;
   private String gxTv_SdtTARTICU_Artple2 ;
   private String gxTv_SdtTARTICU_Artusrcod ;
   private String gxTv_SdtTARTICU_Clasdsc ;
   private String gxTv_SdtTARTICU_Artcomer ;
   private String gxTv_SdtTARTICU_Clatubdsc ;
   private String gxTv_SdtTARTICU_Claboldsc ;
   private String gxTv_SdtTARTICU_Artnmtr ;
   private String gxTv_SdtTARTICU_Artund ;
   private String gxTv_SdtTARTICU_Artblo ;
   private String gxTv_SdtTARTICU_Tipartdsc2 ;
   private String gxTv_SdtTARTICU_Artobsgrm ;
   private String gxTv_SdtTARTICU_Artobsanc ;
   private String gxTv_SdtTARTICU_Artcdb ;
   private String gxTv_SdtTARTICU_Artgalga ;
   private String gxTv_SdtTARTICU_Artplatina ;
   private String gxTv_SdtTARTICU_Artpgd ;
   private String gxTv_SdtTARTICU_Artthn ;
   private String gxTv_SdtTARTICU_Art_dc ;
   private String gxTv_SdtTARTICU_Artanu ;
   private String gxTv_SdtTARTICU_Artacamar ;
   private String gxTv_SdtTARTICU_Artacabak ;
   private String gxTv_SdtTARTICU_Artobsfac ;
   private String gxTv_SdtTARTICU_Artactivo ;
   private String gxTv_SdtTARTICU_Mode ;
   private String gxTv_SdtTARTICU_Emprcod_Z ;
   private String gxTv_SdtTARTICU_Artcod_Z ;
   private String gxTv_SdtTARTICU_Artdsc_Z ;
   private String gxTv_SdtTARTICU_Clinom_Z ;
   private String gxTv_SdtTARTICU_Artcodext_Z ;
   private String gxTv_SdtTARTICU_Emprnom_Z ;
   private String gxTv_SdtTARTICU_Artmat_Z ;
   private String gxTv_SdtTARTICU_Tipartdsc_Z ;
   private String gxTv_SdtTARTICU_Arttipple_Z ;
   private String gxTv_SdtTARTICU_Arttiplar_Z ;
   private String gxTv_SdtTARTICU_Artcorori_Z ;
   private String gxTv_SdtTARTICU_Artencori_Z ;
   private String gxTv_SdtTARTICU_Artsua_Z ;
   private String gxTv_SdtTARTICU_Artacaqui_Z ;
   private String gxTv_SdtTARTICU_Arteti_Z ;
   private String gxTv_SdtTARTICU_Clieti_Z ;
   private String gxTv_SdtTARTICU_Arttra1_Z ;
   private String gxTv_SdtTARTICU_Arttra2_Z ;
   private String gxTv_SdtTARTICU_Arttra3_Z ;
   private String gxTv_SdtTARTICU_Arturd1_Z ;
   private String gxTv_SdtTARTICU_Arturd2_Z ;
   private String gxTv_SdtTARTICU_Arturd3_Z ;
   private String gxTv_SdtTARTICU_Artple2_Z ;
   private String gxTv_SdtTARTICU_Artusrcod_Z ;
   private String gxTv_SdtTARTICU_Clasdsc_Z ;
   private String gxTv_SdtTARTICU_Artcomer_Z ;
   private String gxTv_SdtTARTICU_Clatubdsc_Z ;
   private String gxTv_SdtTARTICU_Claboldsc_Z ;
   private String gxTv_SdtTARTICU_Artnmtr_Z ;
   private String gxTv_SdtTARTICU_Artund_Z ;
   private String gxTv_SdtTARTICU_Artblo_Z ;
   private String gxTv_SdtTARTICU_Tipartdsc2_Z ;
   private String gxTv_SdtTARTICU_Artobsgrm_Z ;
   private String gxTv_SdtTARTICU_Artobsanc_Z ;
   private String gxTv_SdtTARTICU_Artcdb_Z ;
   private String gxTv_SdtTARTICU_Artgalga_Z ;
   private String gxTv_SdtTARTICU_Artplatina_Z ;
   private String gxTv_SdtTARTICU_Artpgd_Z ;
   private String gxTv_SdtTARTICU_Artthn_Z ;
   private String gxTv_SdtTARTICU_Art_dc_Z ;
   private String gxTv_SdtTARTICU_Artanu_Z ;
   private String gxTv_SdtTARTICU_Artacamar_Z ;
   private String gxTv_SdtTARTICU_Artacabak_Z ;
   private String gxTv_SdtTARTICU_Artobsfac_Z ;
   private String gxTv_SdtTARTICU_Artactivo_Z ;
   private String sTagName ;
   private String sDateCnv ;
   private String sNumToPad ;
   private java.util.Date gxTv_SdtTARTICU_Artfeccre ;
   private java.util.Date gxTv_SdtTARTICU_Artfecmod ;
   private java.util.Date gxTv_SdtTARTICU_Artfeccre_Z ;
   private java.util.Date gxTv_SdtTARTICU_Artfecmod_Z ;
   private boolean readElement ;
   private boolean formatError ;
   private String gxTv_SdtTARTICU_Artobslon ;
   private String gxTv_SdtTARTICU_Artdsc2 ;
   private String gxTv_SdtTARTICU_Artcdsc ;
   private String gxTv_SdtTARTICU_Artobsotras ;
   private String gxTv_SdtTARTICU_Artdsc2_Z ;
   private String gxTv_SdtTARTICU_Artcdsc_Z ;
   private String gxTv_SdtTARTICU_Artobsotras_Z ;
}

