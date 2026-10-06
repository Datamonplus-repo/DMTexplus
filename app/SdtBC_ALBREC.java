package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtBC_ALBREC extends GxSilentTrnSdt
{
   public SdtBC_ALBREC( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtBC_ALBREC.class));
   }

   public SdtBC_ALBREC( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle, context, "SdtBC_ALBREC");
      initialize( remoteHandle) ;
   }

   public SdtBC_ALBREC( int remoteHandle ,
                        StructSdtBC_ALBREC struct )
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
                     int AV44AlbRecCod )
   {
      IGxSilentTrn obj;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {AV396EmprCod,Integer.valueOf(AV44AlbRecCod)});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"EmprCod", String.class}, new Object[]{"AlbRecCod", int.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "BC_ALBREC");
      metadata.set("BT", "TXPALBREC");
      metadata.set("PK", "[ \"EmprCod\",\"AlbRecCod\" ]");
      metadata.set("PKAssigned", "[ \"AlbRecCod\" ]");
      metadata.set("Levels", "[ \"Level1Item\" ]");
      metadata.set("Serial", "[ [ \"Same\",\"TXPALBREC\",\"AlbRUlin\",\"AlbRLin\",\"EmprCod\",\"EmprCod\",\"AlbRecCod\",\"AlbRecCod\" ] ]");
      metadata.set("FKList", "[ { \"FK\":[ \"EmprCod\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"AlmCod\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"CliCod\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"ProceCod\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"TipArtCod\" ],\"FKMap\":[ \"AlbRTartC-TipArtCod\" ] },{ \"FK\":[ \"EmprCod\",\"TipEntCod\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"TrnCod\" ],\"FKMap\":[  ] } ]");
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
               gxTv_SdtBC_ALBREC_Emprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRecCod") )
            {
               gxTv_SdtBC_ALBREC_Albreccod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom") )
            {
               gxTv_SdtBC_ALBREC_Emprnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliCod") )
            {
               gxTv_SdtBC_ALBREC_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtBC_ALBREC_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRef") )
            {
               gxTv_SdtBC_ALBREC_Albref = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TrnCod") )
            {
               gxTv_SdtBC_ALBREC_Trncod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TrnNom") )
            {
               gxTv_SdtBC_ALBREC_Trnnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbREnt") )
            {
               gxTv_SdtBC_ALBREC_Albrent = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRPieEnt") )
            {
               gxTv_SdtBC_ALBREC_Albrpieent = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRUni") )
            {
               gxTv_SdtBC_ALBREC_Albruni = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRLoc") )
            {
               gxTv_SdtBC_ALBREC_Albrloc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRFen") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtBC_ALBREC_Albrfen = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtBC_ALBREC_Albrfen = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRUniEnt") )
            {
               gxTv_SdtBC_ALBREC_Albrunient = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRTam") )
            {
               gxTv_SdtBC_ALBREC_Albrtam = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Emp_Item1") )
            {
               gxTv_SdtBC_ALBREC_Emp_item1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRReo") )
            {
               gxTv_SdtBC_ALBREC_Albrreo = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRPieUti") )
            {
               gxTv_SdtBC_ALBREC_Albrpieuti = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRPieReb") )
            {
               gxTv_SdtBC_ALBREC_Albrpiereb = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRUniUti") )
            {
               gxTv_SdtBC_ALBREC_Albruniuti = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRUniReb") )
            {
               gxTv_SdtBC_ALBREC_Albrunireb = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRPieDis") )
            {
               gxTv_SdtBC_ALBREC_Albrpiedis = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRUniDis") )
            {
               gxTv_SdtBC_ALBREC_Albrunidis = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRFecUlt") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtBC_ALBREC_Albrfecult = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtBC_ALBREC_Albrfecult = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbREst") )
            {
               gxTv_SdtBC_ALBREC_Albrest = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipEntCod") )
            {
               gxTv_SdtBC_ALBREC_Tipentcod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipEntNom") )
            {
               gxTv_SdtBC_ALBREC_Tipentnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbNumEti") )
            {
               gxTv_SdtBC_ALBREC_Albnumeti = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRDes") )
            {
               gxTv_SdtBC_ALBREC_Albrdes = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ProceCod") )
            {
               gxTv_SdtBC_ALBREC_Procecod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ProceNom") )
            {
               gxTv_SdtBC_ALBREC_Procenom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRUlin") )
            {
               gxTv_SdtBC_ALBREC_Albrulin = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRefDsc") )
            {
               gxTv_SdtBC_ALBREC_Albrefdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbPmPPza") )
            {
               gxTv_SdtBC_ALBREC_Albpmppza = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbPzaEst") )
            {
               gxTv_SdtBC_ALBREC_Albpzaest = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRGrm2") )
            {
               gxTv_SdtBC_ALBREC_Albrgrm2 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRAnc") )
            {
               gxTv_SdtBC_ALBREC_Albranc = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbPml") )
            {
               gxTv_SdtBC_ALBREC_Albpml = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRPre") )
            {
               gxTv_SdtBC_ALBREC_Albrpre = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRAju") )
            {
               gxTv_SdtBC_ALBREC_Albraju = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRRep") )
            {
               gxTv_SdtBC_ALBREC_Albrrep = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbREnt2") )
            {
               gxTv_SdtBC_ALBREC_Albrent2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbrUsu") )
            {
               gxTv_SdtBC_ALBREC_Albrusu = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbrHor") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtBC_ALBREC_Albrhor = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtBC_ALBREC_Albrhor = GXutil.resetDate(localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), "."))))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbrUniC") )
            {
               gxTv_SdtBC_ALBREC_Albrunic = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbrPieC") )
            {
               gxTv_SdtBC_ALBREC_Albrpiec = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbrNF") )
            {
               gxTv_SdtBC_ALBREC_Albrnf = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbrFeNf") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtBC_ALBREC_Albrfenf = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtBC_ALBREC_Albrfenf = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbrCfop") )
            {
               gxTv_SdtBC_ALBREC_Albrcfop = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRDisCli") )
            {
               gxTv_SdtBC_ALBREC_Albrdiscli = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRTartC") )
            {
               gxTv_SdtBC_ALBREC_Albrtartc = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRTartD") )
            {
               gxTv_SdtBC_ALBREC_Albrtartd = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRImp") )
            {
               gxTv_SdtBC_ALBREC_Albrimp = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRLote") )
            {
               gxTv_SdtBC_ALBREC_Albrlote = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRTelar") )
            {
               gxTv_SdtBC_ALBREC_Albrtelar = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRLot2") )
            {
               gxTv_SdtBC_ALBREC_Albrlot2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRLu") )
            {
               gxTv_SdtBC_ALBREC_Albrlu = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRMdlCod") )
            {
               gxTv_SdtBC_ALBREC_Albrmdlcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRTara") )
            {
               gxTv_SdtBC_ALBREC_Albrtara = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRUniB") )
            {
               gxTv_SdtBC_ALBREC_Albrunib = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbDocPrv") )
            {
               gxTv_SdtBC_ALBREC_Albdocprv = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRUdas") )
            {
               gxTv_SdtBC_ALBREC_Albrudas = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlmCod") )
            {
               gxTv_SdtBC_ALBREC_Almcod = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlmNom") )
            {
               gxTv_SdtBC_ALBREC_Almnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbColor") )
            {
               gxTv_SdtBC_ALBREC_Albcolor = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbOpsT") )
            {
               gxTv_SdtBC_ALBREC_Albopst = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbOpsC") )
            {
               gxTv_SdtBC_ALBREC_Albopsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbOC") )
            {
               gxTv_SdtBC_ALBREC_Alboc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbHdri") )
            {
               gxTv_SdtBC_ALBREC_Albhdri = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbNumB") )
            {
               gxTv_SdtBC_ALBREC_Albnumb = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbNumM") )
            {
               gxTv_SdtBC_ALBREC_Albnumm = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbAncC") )
            {
               gxTv_SdtBC_ALBREC_Albancc = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbDndC") )
            {
               gxTv_SdtBC_ALBREC_Albdndc = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbAncCr") )
            {
               gxTv_SdtBC_ALBREC_Albanccr = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbDndCr") )
            {
               gxTv_SdtBC_ALBREC_Albdndcr = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbGalga") )
            {
               gxTv_SdtBC_ALBREC_Albgalga = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbMaqTej") )
            {
               gxTv_SdtBC_ALBREC_Albmaqtej = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbDmt") )
            {
               gxTv_SdtBC_ALBREC_Albdmt = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbPdaC") )
            {
               gxTv_SdtBC_ALBREC_Albpdac = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbOStj") )
            {
               gxTv_SdtBC_ALBREC_Albostj = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbStLot") )
            {
               gxTv_SdtBC_ALBREC_Albstlot = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbTurno") )
            {
               gxTv_SdtBC_ALBREC_Albturno = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliEst") )
            {
               gxTv_SdtBC_ALBREC_Cliest = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbOEKOTEX") )
            {
               gxTv_SdtBC_ALBREC_Alboekotex = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbREnt_3") )
            {
               gxTv_SdtBC_ALBREC_Albrent_3 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRArtLu") )
            {
               gxTv_SdtBC_ALBREC_Albrartlu = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Level1") )
            {
               if ( gxTv_SdtBC_ALBREC_Level1 == null )
               {
                  gxTv_SdtBC_ALBREC_Level1 = new GXBCLevelCollection<app.SdtBC_ALBREC_Level1Item>(app.SdtBC_ALBREC_Level1Item.class, "BC_ALBREC.Level1Item", "TexplusNET", remoteHandle);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtBC_ALBREC_Level1.readxml(oReader, "Level1") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Level1") )
               {
                  GXSoapError = oReader.read() ;
               }
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtBC_ALBREC_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtBC_ALBREC_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprCod_Z") )
            {
               gxTv_SdtBC_ALBREC_Emprcod_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRecCod_Z") )
            {
               gxTv_SdtBC_ALBREC_Albreccod_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom_Z") )
            {
               gxTv_SdtBC_ALBREC_Emprnom_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliCod_Z") )
            {
               gxTv_SdtBC_ALBREC_Clicod_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom_Z") )
            {
               gxTv_SdtBC_ALBREC_Clinom_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRef_Z") )
            {
               gxTv_SdtBC_ALBREC_Albref_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TrnCod_Z") )
            {
               gxTv_SdtBC_ALBREC_Trncod_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TrnNom_Z") )
            {
               gxTv_SdtBC_ALBREC_Trnnom_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbREnt_Z") )
            {
               gxTv_SdtBC_ALBREC_Albrent_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRPieEnt_Z") )
            {
               gxTv_SdtBC_ALBREC_Albrpieent_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRUni_Z") )
            {
               gxTv_SdtBC_ALBREC_Albruni_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRLoc_Z") )
            {
               gxTv_SdtBC_ALBREC_Albrloc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRFen_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtBC_ALBREC_Albrfen_Z = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtBC_ALBREC_Albrfen_Z = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRUniEnt_Z") )
            {
               gxTv_SdtBC_ALBREC_Albrunient_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRTam_Z") )
            {
               gxTv_SdtBC_ALBREC_Albrtam_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Emp_Item1_Z") )
            {
               gxTv_SdtBC_ALBREC_Emp_item1_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRReo_Z") )
            {
               gxTv_SdtBC_ALBREC_Albrreo_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRPieUti_Z") )
            {
               gxTv_SdtBC_ALBREC_Albrpieuti_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRPieReb_Z") )
            {
               gxTv_SdtBC_ALBREC_Albrpiereb_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRUniUti_Z") )
            {
               gxTv_SdtBC_ALBREC_Albruniuti_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRUniReb_Z") )
            {
               gxTv_SdtBC_ALBREC_Albrunireb_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRPieDis_Z") )
            {
               gxTv_SdtBC_ALBREC_Albrpiedis_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRUniDis_Z") )
            {
               gxTv_SdtBC_ALBREC_Albrunidis_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRFecUlt_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtBC_ALBREC_Albrfecult_Z = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtBC_ALBREC_Albrfecult_Z = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbREst_Z") )
            {
               gxTv_SdtBC_ALBREC_Albrest_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipEntCod_Z") )
            {
               gxTv_SdtBC_ALBREC_Tipentcod_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipEntNom_Z") )
            {
               gxTv_SdtBC_ALBREC_Tipentnom_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbNumEti_Z") )
            {
               gxTv_SdtBC_ALBREC_Albnumeti_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRDes_Z") )
            {
               gxTv_SdtBC_ALBREC_Albrdes_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ProceCod_Z") )
            {
               gxTv_SdtBC_ALBREC_Procecod_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ProceNom_Z") )
            {
               gxTv_SdtBC_ALBREC_Procenom_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRUlin_Z") )
            {
               gxTv_SdtBC_ALBREC_Albrulin_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRefDsc_Z") )
            {
               gxTv_SdtBC_ALBREC_Albrefdsc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbPmPPza_Z") )
            {
               gxTv_SdtBC_ALBREC_Albpmppza_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbPzaEst_Z") )
            {
               gxTv_SdtBC_ALBREC_Albpzaest_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRGrm2_Z") )
            {
               gxTv_SdtBC_ALBREC_Albrgrm2_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRAnc_Z") )
            {
               gxTv_SdtBC_ALBREC_Albranc_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbPml_Z") )
            {
               gxTv_SdtBC_ALBREC_Albpml_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRPre_Z") )
            {
               gxTv_SdtBC_ALBREC_Albrpre_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRAju_Z") )
            {
               gxTv_SdtBC_ALBREC_Albraju_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRRep_Z") )
            {
               gxTv_SdtBC_ALBREC_Albrrep_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbREnt2_Z") )
            {
               gxTv_SdtBC_ALBREC_Albrent2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbrUsu_Z") )
            {
               gxTv_SdtBC_ALBREC_Albrusu_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbrHor_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtBC_ALBREC_Albrhor_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtBC_ALBREC_Albrhor_Z = GXutil.resetDate(localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), "."))))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbrUniC_Z") )
            {
               gxTv_SdtBC_ALBREC_Albrunic_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbrPieC_Z") )
            {
               gxTv_SdtBC_ALBREC_Albrpiec_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbrNF_Z") )
            {
               gxTv_SdtBC_ALBREC_Albrnf_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbrFeNf_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtBC_ALBREC_Albrfenf_Z = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtBC_ALBREC_Albrfenf_Z = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbrCfop_Z") )
            {
               gxTv_SdtBC_ALBREC_Albrcfop_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRDisCli_Z") )
            {
               gxTv_SdtBC_ALBREC_Albrdiscli_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRTartC_Z") )
            {
               gxTv_SdtBC_ALBREC_Albrtartc_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRTartD_Z") )
            {
               gxTv_SdtBC_ALBREC_Albrtartd_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRImp_Z") )
            {
               gxTv_SdtBC_ALBREC_Albrimp_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRLote_Z") )
            {
               gxTv_SdtBC_ALBREC_Albrlote_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRTelar_Z") )
            {
               gxTv_SdtBC_ALBREC_Albrtelar_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRLot2_Z") )
            {
               gxTv_SdtBC_ALBREC_Albrlot2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRLu_Z") )
            {
               gxTv_SdtBC_ALBREC_Albrlu_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRMdlCod_Z") )
            {
               gxTv_SdtBC_ALBREC_Albrmdlcod_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRTara_Z") )
            {
               gxTv_SdtBC_ALBREC_Albrtara_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRUniB_Z") )
            {
               gxTv_SdtBC_ALBREC_Albrunib_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbDocPrv_Z") )
            {
               gxTv_SdtBC_ALBREC_Albdocprv_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRUdas_Z") )
            {
               gxTv_SdtBC_ALBREC_Albrudas_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlmCod_Z") )
            {
               gxTv_SdtBC_ALBREC_Almcod_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlmNom_Z") )
            {
               gxTv_SdtBC_ALBREC_Almnom_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbColor_Z") )
            {
               gxTv_SdtBC_ALBREC_Albcolor_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbOpsT_Z") )
            {
               gxTv_SdtBC_ALBREC_Albopst_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbOpsC_Z") )
            {
               gxTv_SdtBC_ALBREC_Albopsc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbOC_Z") )
            {
               gxTv_SdtBC_ALBREC_Alboc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbHdri_Z") )
            {
               gxTv_SdtBC_ALBREC_Albhdri_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbNumB_Z") )
            {
               gxTv_SdtBC_ALBREC_Albnumb_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbNumM_Z") )
            {
               gxTv_SdtBC_ALBREC_Albnumm_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbAncC_Z") )
            {
               gxTv_SdtBC_ALBREC_Albancc_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbDndC_Z") )
            {
               gxTv_SdtBC_ALBREC_Albdndc_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbAncCr_Z") )
            {
               gxTv_SdtBC_ALBREC_Albanccr_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbDndCr_Z") )
            {
               gxTv_SdtBC_ALBREC_Albdndcr_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbGalga_Z") )
            {
               gxTv_SdtBC_ALBREC_Albgalga_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbMaqTej_Z") )
            {
               gxTv_SdtBC_ALBREC_Albmaqtej_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbDmt_Z") )
            {
               gxTv_SdtBC_ALBREC_Albdmt_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbPdaC_Z") )
            {
               gxTv_SdtBC_ALBREC_Albpdac_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbOStj_Z") )
            {
               gxTv_SdtBC_ALBREC_Albostj_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbStLot_Z") )
            {
               gxTv_SdtBC_ALBREC_Albstlot_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbTurno_Z") )
            {
               gxTv_SdtBC_ALBREC_Albturno_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliEst_Z") )
            {
               gxTv_SdtBC_ALBREC_Cliest_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbOEKOTEX_Z") )
            {
               gxTv_SdtBC_ALBREC_Alboekotex_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbREnt_3_Z") )
            {
               gxTv_SdtBC_ALBREC_Albrent_3_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRArtLu_Z") )
            {
               gxTv_SdtBC_ALBREC_Albrartlu_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRecCod_N") )
            {
               gxTv_SdtBC_ALBREC_Albreccod_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom_N") )
            {
               gxTv_SdtBC_ALBREC_Emprnom_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TrnCod_N") )
            {
               gxTv_SdtBC_ALBREC_Trncod_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TrnNom_N") )
            {
               gxTv_SdtBC_ALBREC_Trnnom_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipEntCod_N") )
            {
               gxTv_SdtBC_ALBREC_Tipentcod_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipEntNom_N") )
            {
               gxTv_SdtBC_ALBREC_Tipentnom_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ProceCod_N") )
            {
               gxTv_SdtBC_ALBREC_Procecod_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ProceNom_N") )
            {
               gxTv_SdtBC_ALBREC_Procenom_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRTartC_N") )
            {
               gxTv_SdtBC_ALBREC_Albrtartc_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRTartD_N") )
            {
               gxTv_SdtBC_ALBREC_Albrtartd_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlmCod_N") )
            {
               gxTv_SdtBC_ALBREC_Almcod_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlmNom_N") )
            {
               gxTv_SdtBC_ALBREC_Almnom_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRArtLu_N") )
            {
               gxTv_SdtBC_ALBREC_Albrartlu_N = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "BC_ALBREC" ;
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
      oWriter.writeElement("EmprCod", gxTv_SdtBC_ALBREC_Emprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRecCod", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Albreccod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EmprNom", gxTv_SdtBC_ALBREC_Emprnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliCod", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNom", gxTv_SdtBC_ALBREC_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRef", gxTv_SdtBC_ALBREC_Albref);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TrnCod", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Trncod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TrnNom", gxTv_SdtBC_ALBREC_Trnnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbREnt", gxTv_SdtBC_ALBREC_Albrent);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRPieEnt", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Albrpieent, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRUni", gxTv_SdtBC_ALBREC_Albruni);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRLoc", gxTv_SdtBC_ALBREC_Albrloc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtBC_ALBREC_Albrfen), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtBC_ALBREC_Albrfen), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtBC_ALBREC_Albrfen), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("AlbRFen", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRUniEnt", GXutil.trim( GXutil.strNoRound( gxTv_SdtBC_ALBREC_Albrunient, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRTam", gxTv_SdtBC_ALBREC_Albrtam);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Emp_Item1", gxTv_SdtBC_ALBREC_Emp_item1);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRReo", gxTv_SdtBC_ALBREC_Albrreo);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRPieUti", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Albrpieuti, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRPieReb", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Albrpiereb, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRUniUti", GXutil.trim( GXutil.strNoRound( gxTv_SdtBC_ALBREC_Albruniuti, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRUniReb", GXutil.trim( GXutil.strNoRound( gxTv_SdtBC_ALBREC_Albrunireb, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRPieDis", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Albrpiedis, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRUniDis", GXutil.trim( GXutil.strNoRound( gxTv_SdtBC_ALBREC_Albrunidis, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtBC_ALBREC_Albrfecult), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtBC_ALBREC_Albrfecult), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtBC_ALBREC_Albrfecult), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("AlbRFecUlt", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbREst", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Albrest, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipEntCod", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Tipentcod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipEntNom", gxTv_SdtBC_ALBREC_Tipentnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbNumEti", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Albnumeti, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRDes", gxTv_SdtBC_ALBREC_Albrdes);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ProceCod", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Procecod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ProceNom", gxTv_SdtBC_ALBREC_Procenom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRUlin", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Albrulin, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRefDsc", gxTv_SdtBC_ALBREC_Albrefdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbPmPPza", GXutil.trim( GXutil.strNoRound( gxTv_SdtBC_ALBREC_Albpmppza, 6, 3)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbPzaEst", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Albpzaest, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRGrm2", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Albrgrm2, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRAnc", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Albranc, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbPml", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Albpml, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRPre", GXutil.trim( GXutil.strNoRound( gxTv_SdtBC_ALBREC_Albrpre, 12, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRAju", GXutil.trim( GXutil.strNoRound( gxTv_SdtBC_ALBREC_Albraju, 8, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRRep", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Albrrep, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbREnt2", gxTv_SdtBC_ALBREC_Albrent2);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbrUsu", gxTv_SdtBC_ALBREC_Albrusu);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtBC_ALBREC_Albrhor), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtBC_ALBREC_Albrhor), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtBC_ALBREC_Albrhor), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtBC_ALBREC_Albrhor), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtBC_ALBREC_Albrhor), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtBC_ALBREC_Albrhor), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("AlbrHor", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbrUniC", GXutil.trim( GXutil.strNoRound( gxTv_SdtBC_ALBREC_Albrunic, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbrPieC", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Albrpiec, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbrNF", gxTv_SdtBC_ALBREC_Albrnf);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtBC_ALBREC_Albrfenf), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtBC_ALBREC_Albrfenf), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtBC_ALBREC_Albrfenf), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("AlbrFeNf", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbrCfop", gxTv_SdtBC_ALBREC_Albrcfop);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRDisCli", gxTv_SdtBC_ALBREC_Albrdiscli);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRTartC", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Albrtartc, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRTartD", gxTv_SdtBC_ALBREC_Albrtartd);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRImp", gxTv_SdtBC_ALBREC_Albrimp);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRLote", gxTv_SdtBC_ALBREC_Albrlote);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRTelar", gxTv_SdtBC_ALBREC_Albrtelar);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRLot2", gxTv_SdtBC_ALBREC_Albrlot2);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRLu", GXutil.trim( GXutil.strNoRound( gxTv_SdtBC_ALBREC_Albrlu, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRMdlCod", gxTv_SdtBC_ALBREC_Albrmdlcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRTara", GXutil.trim( GXutil.strNoRound( gxTv_SdtBC_ALBREC_Albrtara, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRUniB", GXutil.trim( GXutil.strNoRound( gxTv_SdtBC_ALBREC_Albrunib, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbDocPrv", gxTv_SdtBC_ALBREC_Albdocprv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRUdas", GXutil.trim( GXutil.strNoRound( gxTv_SdtBC_ALBREC_Albrudas, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlmCod", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Almcod, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlmNom", gxTv_SdtBC_ALBREC_Almnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbColor", gxTv_SdtBC_ALBREC_Albcolor);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbOpsT", gxTv_SdtBC_ALBREC_Albopst);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbOpsC", gxTv_SdtBC_ALBREC_Albopsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbOC", gxTv_SdtBC_ALBREC_Alboc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbHdri", gxTv_SdtBC_ALBREC_Albhdri);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbNumB", gxTv_SdtBC_ALBREC_Albnumb);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbNumM", gxTv_SdtBC_ALBREC_Albnumm);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbAncC", GXutil.trim( GXutil.strNoRound( gxTv_SdtBC_ALBREC_Albancc, 5, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbDndC", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Albdndc, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbAncCr", GXutil.trim( GXutil.strNoRound( gxTv_SdtBC_ALBREC_Albanccr, 5, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbDndCr", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Albdndcr, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbGalga", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Albgalga, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbMaqTej", gxTv_SdtBC_ALBREC_Albmaqtej);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbDmt", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Albdmt, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbPdaC", gxTv_SdtBC_ALBREC_Albpdac);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbOStj", gxTv_SdtBC_ALBREC_Albostj);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbStLot", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Albstlot, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbTurno", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Albturno, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliEst", gxTv_SdtBC_ALBREC_Cliest);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbOEKOTEX", gxTv_SdtBC_ALBREC_Alboekotex);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbREnt_3", gxTv_SdtBC_ALBREC_Albrent_3);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRArtLu", GXutil.trim( GXutil.strNoRound( gxTv_SdtBC_ALBREC_Albrartlu, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtBC_ALBREC_Level1 != null )
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
         gxTv_SdtBC_ALBREC_Level1.writexml(oWriter, "Level1", sNameSpace1, sIncludeState);
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", gxTv_SdtBC_ALBREC_Mode);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprCod_Z", gxTv_SdtBC_ALBREC_Emprcod_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRecCod_Z", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Albreccod_Z, 8, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprNom_Z", gxTv_SdtBC_ALBREC_Emprnom_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CliCod_Z", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Clicod_Z, 6, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CliNom_Z", gxTv_SdtBC_ALBREC_Clinom_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRef_Z", gxTv_SdtBC_ALBREC_Albref_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TrnCod_Z", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Trncod_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TrnNom_Z", gxTv_SdtBC_ALBREC_Trnnom_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbREnt_Z", gxTv_SdtBC_ALBREC_Albrent_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRPieEnt_Z", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Albrpieent_Z, 6, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRUni_Z", gxTv_SdtBC_ALBREC_Albruni_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRLoc_Z", gxTv_SdtBC_ALBREC_Albrloc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtBC_ALBREC_Albrfen_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtBC_ALBREC_Albrfen_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtBC_ALBREC_Albrfen_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("AlbRFen_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRUniEnt_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtBC_ALBREC_Albrunient_Z, 9, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRTam_Z", gxTv_SdtBC_ALBREC_Albrtam_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Emp_Item1_Z", gxTv_SdtBC_ALBREC_Emp_item1_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRReo_Z", gxTv_SdtBC_ALBREC_Albrreo_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRPieUti_Z", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Albrpieuti_Z, 6, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRPieReb_Z", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Albrpiereb_Z, 6, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRUniUti_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtBC_ALBREC_Albruniuti_Z, 9, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRUniReb_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtBC_ALBREC_Albrunireb_Z, 9, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRPieDis_Z", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Albrpiedis_Z, 6, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRUniDis_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtBC_ALBREC_Albrunidis_Z, 9, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtBC_ALBREC_Albrfecult_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtBC_ALBREC_Albrfecult_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtBC_ALBREC_Albrfecult_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("AlbRFecUlt_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbREst_Z", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Albrest_Z, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TipEntCod_Z", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Tipentcod_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TipEntNom_Z", gxTv_SdtBC_ALBREC_Tipentnom_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbNumEti_Z", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Albnumeti_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRDes_Z", gxTv_SdtBC_ALBREC_Albrdes_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ProceCod_Z", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Procecod_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ProceNom_Z", gxTv_SdtBC_ALBREC_Procenom_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRUlin_Z", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Albrulin_Z, 2, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRefDsc_Z", gxTv_SdtBC_ALBREC_Albrefdsc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbPmPPza_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtBC_ALBREC_Albpmppza_Z, 6, 3)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbPzaEst_Z", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Albpzaest_Z, 8, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRGrm2_Z", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Albrgrm2_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRAnc_Z", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Albranc_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbPml_Z", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Albpml_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRPre_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtBC_ALBREC_Albrpre_Z, 12, 5)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRAju_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtBC_ALBREC_Albraju_Z, 8, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRRep_Z", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Albrrep_Z, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbREnt2_Z", gxTv_SdtBC_ALBREC_Albrent2_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbrUsu_Z", gxTv_SdtBC_ALBREC_Albrusu_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtBC_ALBREC_Albrhor_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtBC_ALBREC_Albrhor_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtBC_ALBREC_Albrhor_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtBC_ALBREC_Albrhor_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtBC_ALBREC_Albrhor_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtBC_ALBREC_Albrhor_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("AlbrHor_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbrUniC_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtBC_ALBREC_Albrunic_Z, 9, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbrPieC_Z", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Albrpiec_Z, 6, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbrNF_Z", gxTv_SdtBC_ALBREC_Albrnf_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtBC_ALBREC_Albrfenf_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtBC_ALBREC_Albrfenf_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtBC_ALBREC_Albrfenf_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("AlbrFeNf_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbrCfop_Z", gxTv_SdtBC_ALBREC_Albrcfop_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRDisCli_Z", gxTv_SdtBC_ALBREC_Albrdiscli_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRTartC_Z", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Albrtartc_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRTartD_Z", gxTv_SdtBC_ALBREC_Albrtartd_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRImp_Z", gxTv_SdtBC_ALBREC_Albrimp_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRLote_Z", gxTv_SdtBC_ALBREC_Albrlote_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRTelar_Z", gxTv_SdtBC_ALBREC_Albrtelar_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRLot2_Z", gxTv_SdtBC_ALBREC_Albrlot2_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRLu_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtBC_ALBREC_Albrlu_Z, 6, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRMdlCod_Z", gxTv_SdtBC_ALBREC_Albrmdlcod_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRTara_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtBC_ALBREC_Albrtara_Z, 6, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRUniB_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtBC_ALBREC_Albrunib_Z, 9, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbDocPrv_Z", gxTv_SdtBC_ALBREC_Albdocprv_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRUdas_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtBC_ALBREC_Albrudas_Z, 9, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlmCod_Z", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Almcod_Z, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlmNom_Z", gxTv_SdtBC_ALBREC_Almnom_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbColor_Z", gxTv_SdtBC_ALBREC_Albcolor_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbOpsT_Z", gxTv_SdtBC_ALBREC_Albopst_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbOpsC_Z", gxTv_SdtBC_ALBREC_Albopsc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbOC_Z", gxTv_SdtBC_ALBREC_Alboc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbHdri_Z", gxTv_SdtBC_ALBREC_Albhdri_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbNumB_Z", gxTv_SdtBC_ALBREC_Albnumb_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbNumM_Z", gxTv_SdtBC_ALBREC_Albnumm_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbAncC_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtBC_ALBREC_Albancc_Z, 5, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbDndC_Z", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Albdndc_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbAncCr_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtBC_ALBREC_Albanccr_Z, 5, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbDndCr_Z", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Albdndcr_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbGalga_Z", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Albgalga_Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbMaqTej_Z", gxTv_SdtBC_ALBREC_Albmaqtej_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbDmt_Z", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Albdmt_Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbPdaC_Z", gxTv_SdtBC_ALBREC_Albpdac_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbOStj_Z", gxTv_SdtBC_ALBREC_Albostj_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbStLot_Z", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Albstlot_Z, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbTurno_Z", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Albturno_Z, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CliEst_Z", gxTv_SdtBC_ALBREC_Cliest_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbOEKOTEX_Z", gxTv_SdtBC_ALBREC_Alboekotex_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbREnt_3_Z", gxTv_SdtBC_ALBREC_Albrent_3_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRArtLu_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtBC_ALBREC_Albrartlu_Z, 6, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRecCod_N", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Albreccod_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprNom_N", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Emprnom_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TrnCod_N", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Trncod_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TrnNom_N", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Trnnom_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TipEntCod_N", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Tipentcod_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TipEntNom_N", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Tipentnom_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ProceCod_N", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Procecod_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ProceNom_N", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Procenom_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRTartC_N", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Albrtartc_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRTartD_N", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Albrtartd_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlmCod_N", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Almcod_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlmNom_N", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Almnom_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRArtLu_N", GXutil.trim( GXutil.str( gxTv_SdtBC_ALBREC_Albrartlu_N, 1, 0)));
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
      AddObjectProperty("EmprCod", gxTv_SdtBC_ALBREC_Emprcod, false, includeNonInitialized);
      AddObjectProperty("AlbRecCod", gxTv_SdtBC_ALBREC_Albreccod, false, includeNonInitialized);
      AddObjectProperty("AlbRecCod_N", gxTv_SdtBC_ALBREC_Albreccod_N, false, includeNonInitialized);
      AddObjectProperty("EmprNom", gxTv_SdtBC_ALBREC_Emprnom, false, includeNonInitialized);
      AddObjectProperty("EmprNom_N", gxTv_SdtBC_ALBREC_Emprnom_N, false, includeNonInitialized);
      AddObjectProperty("CliCod", gxTv_SdtBC_ALBREC_Clicod, false, includeNonInitialized);
      AddObjectProperty("CliNom", gxTv_SdtBC_ALBREC_Clinom, false, includeNonInitialized);
      AddObjectProperty("AlbRef", gxTv_SdtBC_ALBREC_Albref, false, includeNonInitialized);
      AddObjectProperty("TrnCod", gxTv_SdtBC_ALBREC_Trncod, false, includeNonInitialized);
      AddObjectProperty("TrnCod_N", gxTv_SdtBC_ALBREC_Trncod_N, false, includeNonInitialized);
      AddObjectProperty("TrnNom", gxTv_SdtBC_ALBREC_Trnnom, false, includeNonInitialized);
      AddObjectProperty("TrnNom_N", gxTv_SdtBC_ALBREC_Trnnom_N, false, includeNonInitialized);
      AddObjectProperty("AlbREnt", gxTv_SdtBC_ALBREC_Albrent, false, includeNonInitialized);
      AddObjectProperty("AlbRPieEnt", gxTv_SdtBC_ALBREC_Albrpieent, false, includeNonInitialized);
      AddObjectProperty("AlbRUni", gxTv_SdtBC_ALBREC_Albruni, false, includeNonInitialized);
      AddObjectProperty("AlbRLoc", gxTv_SdtBC_ALBREC_Albrloc, false, includeNonInitialized);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtBC_ALBREC_Albrfen), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtBC_ALBREC_Albrfen), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtBC_ALBREC_Albrfen), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("AlbRFen", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("AlbRUniEnt", gxTv_SdtBC_ALBREC_Albrunient, false, includeNonInitialized);
      AddObjectProperty("AlbRTam", gxTv_SdtBC_ALBREC_Albrtam, false, includeNonInitialized);
      AddObjectProperty("Emp_Item1", gxTv_SdtBC_ALBREC_Emp_item1, false, includeNonInitialized);
      AddObjectProperty("AlbRReo", gxTv_SdtBC_ALBREC_Albrreo, false, includeNonInitialized);
      AddObjectProperty("AlbRPieUti", gxTv_SdtBC_ALBREC_Albrpieuti, false, includeNonInitialized);
      AddObjectProperty("AlbRPieReb", gxTv_SdtBC_ALBREC_Albrpiereb, false, includeNonInitialized);
      AddObjectProperty("AlbRUniUti", gxTv_SdtBC_ALBREC_Albruniuti, false, includeNonInitialized);
      AddObjectProperty("AlbRUniReb", gxTv_SdtBC_ALBREC_Albrunireb, false, includeNonInitialized);
      AddObjectProperty("AlbRPieDis", gxTv_SdtBC_ALBREC_Albrpiedis, false, includeNonInitialized);
      AddObjectProperty("AlbRUniDis", gxTv_SdtBC_ALBREC_Albrunidis, false, includeNonInitialized);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtBC_ALBREC_Albrfecult), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtBC_ALBREC_Albrfecult), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtBC_ALBREC_Albrfecult), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("AlbRFecUlt", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("AlbREst", gxTv_SdtBC_ALBREC_Albrest, false, includeNonInitialized);
      AddObjectProperty("TipEntCod", gxTv_SdtBC_ALBREC_Tipentcod, false, includeNonInitialized);
      AddObjectProperty("TipEntCod_N", gxTv_SdtBC_ALBREC_Tipentcod_N, false, includeNonInitialized);
      AddObjectProperty("TipEntNom", gxTv_SdtBC_ALBREC_Tipentnom, false, includeNonInitialized);
      AddObjectProperty("TipEntNom_N", gxTv_SdtBC_ALBREC_Tipentnom_N, false, includeNonInitialized);
      AddObjectProperty("AlbNumEti", gxTv_SdtBC_ALBREC_Albnumeti, false, includeNonInitialized);
      AddObjectProperty("AlbRDes", gxTv_SdtBC_ALBREC_Albrdes, false, includeNonInitialized);
      AddObjectProperty("ProceCod", gxTv_SdtBC_ALBREC_Procecod, false, includeNonInitialized);
      AddObjectProperty("ProceCod_N", gxTv_SdtBC_ALBREC_Procecod_N, false, includeNonInitialized);
      AddObjectProperty("ProceNom", gxTv_SdtBC_ALBREC_Procenom, false, includeNonInitialized);
      AddObjectProperty("ProceNom_N", gxTv_SdtBC_ALBREC_Procenom_N, false, includeNonInitialized);
      AddObjectProperty("AlbRUlin", gxTv_SdtBC_ALBREC_Albrulin, false, includeNonInitialized);
      AddObjectProperty("AlbRefDsc", gxTv_SdtBC_ALBREC_Albrefdsc, false, includeNonInitialized);
      AddObjectProperty("AlbPmPPza", gxTv_SdtBC_ALBREC_Albpmppza, false, includeNonInitialized);
      AddObjectProperty("AlbPzaEst", gxTv_SdtBC_ALBREC_Albpzaest, false, includeNonInitialized);
      AddObjectProperty("AlbRGrm2", gxTv_SdtBC_ALBREC_Albrgrm2, false, includeNonInitialized);
      AddObjectProperty("AlbRAnc", gxTv_SdtBC_ALBREC_Albranc, false, includeNonInitialized);
      AddObjectProperty("AlbPml", gxTv_SdtBC_ALBREC_Albpml, false, includeNonInitialized);
      AddObjectProperty("AlbRPre", gxTv_SdtBC_ALBREC_Albrpre, false, includeNonInitialized);
      AddObjectProperty("AlbRAju", gxTv_SdtBC_ALBREC_Albraju, false, includeNonInitialized);
      AddObjectProperty("AlbRRep", gxTv_SdtBC_ALBREC_Albrrep, false, includeNonInitialized);
      AddObjectProperty("AlbREnt2", gxTv_SdtBC_ALBREC_Albrent2, false, includeNonInitialized);
      AddObjectProperty("AlbrUsu", gxTv_SdtBC_ALBREC_Albrusu, false, includeNonInitialized);
      datetime_STZ = gxTv_SdtBC_ALBREC_Albrhor ;
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
      AddObjectProperty("AlbrHor", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("AlbrUniC", gxTv_SdtBC_ALBREC_Albrunic, false, includeNonInitialized);
      AddObjectProperty("AlbrPieC", gxTv_SdtBC_ALBREC_Albrpiec, false, includeNonInitialized);
      AddObjectProperty("AlbrNF", gxTv_SdtBC_ALBREC_Albrnf, false, includeNonInitialized);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtBC_ALBREC_Albrfenf), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtBC_ALBREC_Albrfenf), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtBC_ALBREC_Albrfenf), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("AlbrFeNf", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("AlbrCfop", gxTv_SdtBC_ALBREC_Albrcfop, false, includeNonInitialized);
      AddObjectProperty("AlbRDisCli", gxTv_SdtBC_ALBREC_Albrdiscli, false, includeNonInitialized);
      AddObjectProperty("AlbRTartC", gxTv_SdtBC_ALBREC_Albrtartc, false, includeNonInitialized);
      AddObjectProperty("AlbRTartC_N", gxTv_SdtBC_ALBREC_Albrtartc_N, false, includeNonInitialized);
      AddObjectProperty("AlbRTartD", gxTv_SdtBC_ALBREC_Albrtartd, false, includeNonInitialized);
      AddObjectProperty("AlbRTartD_N", gxTv_SdtBC_ALBREC_Albrtartd_N, false, includeNonInitialized);
      AddObjectProperty("AlbRImp", gxTv_SdtBC_ALBREC_Albrimp, false, includeNonInitialized);
      AddObjectProperty("AlbRLote", gxTv_SdtBC_ALBREC_Albrlote, false, includeNonInitialized);
      AddObjectProperty("AlbRTelar", gxTv_SdtBC_ALBREC_Albrtelar, false, includeNonInitialized);
      AddObjectProperty("AlbRLot2", gxTv_SdtBC_ALBREC_Albrlot2, false, includeNonInitialized);
      AddObjectProperty("AlbRLu", gxTv_SdtBC_ALBREC_Albrlu, false, includeNonInitialized);
      AddObjectProperty("AlbRMdlCod", gxTv_SdtBC_ALBREC_Albrmdlcod, false, includeNonInitialized);
      AddObjectProperty("AlbRTara", gxTv_SdtBC_ALBREC_Albrtara, false, includeNonInitialized);
      AddObjectProperty("AlbRUniB", gxTv_SdtBC_ALBREC_Albrunib, false, includeNonInitialized);
      AddObjectProperty("AlbDocPrv", gxTv_SdtBC_ALBREC_Albdocprv, false, includeNonInitialized);
      AddObjectProperty("AlbRUdas", gxTv_SdtBC_ALBREC_Albrudas, false, includeNonInitialized);
      AddObjectProperty("AlmCod", gxTv_SdtBC_ALBREC_Almcod, false, includeNonInitialized);
      AddObjectProperty("AlmCod_N", gxTv_SdtBC_ALBREC_Almcod_N, false, includeNonInitialized);
      AddObjectProperty("AlmNom", gxTv_SdtBC_ALBREC_Almnom, false, includeNonInitialized);
      AddObjectProperty("AlmNom_N", gxTv_SdtBC_ALBREC_Almnom_N, false, includeNonInitialized);
      AddObjectProperty("AlbColor", gxTv_SdtBC_ALBREC_Albcolor, false, includeNonInitialized);
      AddObjectProperty("AlbOpsT", gxTv_SdtBC_ALBREC_Albopst, false, includeNonInitialized);
      AddObjectProperty("AlbOpsC", gxTv_SdtBC_ALBREC_Albopsc, false, includeNonInitialized);
      AddObjectProperty("AlbOC", gxTv_SdtBC_ALBREC_Alboc, false, includeNonInitialized);
      AddObjectProperty("AlbHdri", gxTv_SdtBC_ALBREC_Albhdri, false, includeNonInitialized);
      AddObjectProperty("AlbNumB", gxTv_SdtBC_ALBREC_Albnumb, false, includeNonInitialized);
      AddObjectProperty("AlbNumM", gxTv_SdtBC_ALBREC_Albnumm, false, includeNonInitialized);
      AddObjectProperty("AlbAncC", gxTv_SdtBC_ALBREC_Albancc, false, includeNonInitialized);
      AddObjectProperty("AlbDndC", gxTv_SdtBC_ALBREC_Albdndc, false, includeNonInitialized);
      AddObjectProperty("AlbAncCr", gxTv_SdtBC_ALBREC_Albanccr, false, includeNonInitialized);
      AddObjectProperty("AlbDndCr", gxTv_SdtBC_ALBREC_Albdndcr, false, includeNonInitialized);
      AddObjectProperty("AlbGalga", gxTv_SdtBC_ALBREC_Albgalga, false, includeNonInitialized);
      AddObjectProperty("AlbMaqTej", gxTv_SdtBC_ALBREC_Albmaqtej, false, includeNonInitialized);
      AddObjectProperty("AlbDmt", gxTv_SdtBC_ALBREC_Albdmt, false, includeNonInitialized);
      AddObjectProperty("AlbPdaC", gxTv_SdtBC_ALBREC_Albpdac, false, includeNonInitialized);
      AddObjectProperty("AlbOStj", gxTv_SdtBC_ALBREC_Albostj, false, includeNonInitialized);
      AddObjectProperty("AlbStLot", gxTv_SdtBC_ALBREC_Albstlot, false, includeNonInitialized);
      AddObjectProperty("AlbTurno", gxTv_SdtBC_ALBREC_Albturno, false, includeNonInitialized);
      AddObjectProperty("CliEst", gxTv_SdtBC_ALBREC_Cliest, false, includeNonInitialized);
      AddObjectProperty("AlbOEKOTEX", gxTv_SdtBC_ALBREC_Alboekotex, false, includeNonInitialized);
      AddObjectProperty("AlbREnt_3", gxTv_SdtBC_ALBREC_Albrent_3, false, includeNonInitialized);
      AddObjectProperty("AlbRArtLu", gxTv_SdtBC_ALBREC_Albrartlu, false, includeNonInitialized);
      AddObjectProperty("AlbRArtLu_N", gxTv_SdtBC_ALBREC_Albrartlu_N, false, includeNonInitialized);
      if ( gxTv_SdtBC_ALBREC_Level1 != null )
      {
         AddObjectProperty("Level1", gxTv_SdtBC_ALBREC_Level1, includeState, includeNonInitialized);
      }
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtBC_ALBREC_Mode, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_SdtBC_ALBREC_Initialized, false, includeNonInitialized);
         AddObjectProperty("EmprCod_Z", gxTv_SdtBC_ALBREC_Emprcod_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRecCod_Z", gxTv_SdtBC_ALBREC_Albreccod_Z, false, includeNonInitialized);
         AddObjectProperty("EmprNom_Z", gxTv_SdtBC_ALBREC_Emprnom_Z, false, includeNonInitialized);
         AddObjectProperty("CliCod_Z", gxTv_SdtBC_ALBREC_Clicod_Z, false, includeNonInitialized);
         AddObjectProperty("CliNom_Z", gxTv_SdtBC_ALBREC_Clinom_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRef_Z", gxTv_SdtBC_ALBREC_Albref_Z, false, includeNonInitialized);
         AddObjectProperty("TrnCod_Z", gxTv_SdtBC_ALBREC_Trncod_Z, false, includeNonInitialized);
         AddObjectProperty("TrnNom_Z", gxTv_SdtBC_ALBREC_Trnnom_Z, false, includeNonInitialized);
         AddObjectProperty("AlbREnt_Z", gxTv_SdtBC_ALBREC_Albrent_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRPieEnt_Z", gxTv_SdtBC_ALBREC_Albrpieent_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRUni_Z", gxTv_SdtBC_ALBREC_Albruni_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRLoc_Z", gxTv_SdtBC_ALBREC_Albrloc_Z, false, includeNonInitialized);
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtBC_ALBREC_Albrfen_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtBC_ALBREC_Albrfen_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtBC_ALBREC_Albrfen_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("AlbRFen_Z", sDateCnv, false, includeNonInitialized);
         AddObjectProperty("AlbRUniEnt_Z", gxTv_SdtBC_ALBREC_Albrunient_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRTam_Z", gxTv_SdtBC_ALBREC_Albrtam_Z, false, includeNonInitialized);
         AddObjectProperty("Emp_Item1_Z", gxTv_SdtBC_ALBREC_Emp_item1_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRReo_Z", gxTv_SdtBC_ALBREC_Albrreo_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRPieUti_Z", gxTv_SdtBC_ALBREC_Albrpieuti_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRPieReb_Z", gxTv_SdtBC_ALBREC_Albrpiereb_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRUniUti_Z", gxTv_SdtBC_ALBREC_Albruniuti_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRUniReb_Z", gxTv_SdtBC_ALBREC_Albrunireb_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRPieDis_Z", gxTv_SdtBC_ALBREC_Albrpiedis_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRUniDis_Z", gxTv_SdtBC_ALBREC_Albrunidis_Z, false, includeNonInitialized);
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtBC_ALBREC_Albrfecult_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtBC_ALBREC_Albrfecult_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtBC_ALBREC_Albrfecult_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("AlbRFecUlt_Z", sDateCnv, false, includeNonInitialized);
         AddObjectProperty("AlbREst_Z", gxTv_SdtBC_ALBREC_Albrest_Z, false, includeNonInitialized);
         AddObjectProperty("TipEntCod_Z", gxTv_SdtBC_ALBREC_Tipentcod_Z, false, includeNonInitialized);
         AddObjectProperty("TipEntNom_Z", gxTv_SdtBC_ALBREC_Tipentnom_Z, false, includeNonInitialized);
         AddObjectProperty("AlbNumEti_Z", gxTv_SdtBC_ALBREC_Albnumeti_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRDes_Z", gxTv_SdtBC_ALBREC_Albrdes_Z, false, includeNonInitialized);
         AddObjectProperty("ProceCod_Z", gxTv_SdtBC_ALBREC_Procecod_Z, false, includeNonInitialized);
         AddObjectProperty("ProceNom_Z", gxTv_SdtBC_ALBREC_Procenom_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRUlin_Z", gxTv_SdtBC_ALBREC_Albrulin_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRefDsc_Z", gxTv_SdtBC_ALBREC_Albrefdsc_Z, false, includeNonInitialized);
         AddObjectProperty("AlbPmPPza_Z", gxTv_SdtBC_ALBREC_Albpmppza_Z, false, includeNonInitialized);
         AddObjectProperty("AlbPzaEst_Z", gxTv_SdtBC_ALBREC_Albpzaest_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRGrm2_Z", gxTv_SdtBC_ALBREC_Albrgrm2_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRAnc_Z", gxTv_SdtBC_ALBREC_Albranc_Z, false, includeNonInitialized);
         AddObjectProperty("AlbPml_Z", gxTv_SdtBC_ALBREC_Albpml_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRPre_Z", gxTv_SdtBC_ALBREC_Albrpre_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRAju_Z", gxTv_SdtBC_ALBREC_Albraju_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRRep_Z", gxTv_SdtBC_ALBREC_Albrrep_Z, false, includeNonInitialized);
         AddObjectProperty("AlbREnt2_Z", gxTv_SdtBC_ALBREC_Albrent2_Z, false, includeNonInitialized);
         AddObjectProperty("AlbrUsu_Z", gxTv_SdtBC_ALBREC_Albrusu_Z, false, includeNonInitialized);
         datetime_STZ = gxTv_SdtBC_ALBREC_Albrhor_Z ;
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
         AddObjectProperty("AlbrHor_Z", sDateCnv, false, includeNonInitialized);
         AddObjectProperty("AlbrUniC_Z", gxTv_SdtBC_ALBREC_Albrunic_Z, false, includeNonInitialized);
         AddObjectProperty("AlbrPieC_Z", gxTv_SdtBC_ALBREC_Albrpiec_Z, false, includeNonInitialized);
         AddObjectProperty("AlbrNF_Z", gxTv_SdtBC_ALBREC_Albrnf_Z, false, includeNonInitialized);
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtBC_ALBREC_Albrfenf_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtBC_ALBREC_Albrfenf_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtBC_ALBREC_Albrfenf_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("AlbrFeNf_Z", sDateCnv, false, includeNonInitialized);
         AddObjectProperty("AlbrCfop_Z", gxTv_SdtBC_ALBREC_Albrcfop_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRDisCli_Z", gxTv_SdtBC_ALBREC_Albrdiscli_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRTartC_Z", gxTv_SdtBC_ALBREC_Albrtartc_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRTartD_Z", gxTv_SdtBC_ALBREC_Albrtartd_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRImp_Z", gxTv_SdtBC_ALBREC_Albrimp_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRLote_Z", gxTv_SdtBC_ALBREC_Albrlote_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRTelar_Z", gxTv_SdtBC_ALBREC_Albrtelar_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRLot2_Z", gxTv_SdtBC_ALBREC_Albrlot2_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRLu_Z", gxTv_SdtBC_ALBREC_Albrlu_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRMdlCod_Z", gxTv_SdtBC_ALBREC_Albrmdlcod_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRTara_Z", gxTv_SdtBC_ALBREC_Albrtara_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRUniB_Z", gxTv_SdtBC_ALBREC_Albrunib_Z, false, includeNonInitialized);
         AddObjectProperty("AlbDocPrv_Z", gxTv_SdtBC_ALBREC_Albdocprv_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRUdas_Z", gxTv_SdtBC_ALBREC_Albrudas_Z, false, includeNonInitialized);
         AddObjectProperty("AlmCod_Z", gxTv_SdtBC_ALBREC_Almcod_Z, false, includeNonInitialized);
         AddObjectProperty("AlmNom_Z", gxTv_SdtBC_ALBREC_Almnom_Z, false, includeNonInitialized);
         AddObjectProperty("AlbColor_Z", gxTv_SdtBC_ALBREC_Albcolor_Z, false, includeNonInitialized);
         AddObjectProperty("AlbOpsT_Z", gxTv_SdtBC_ALBREC_Albopst_Z, false, includeNonInitialized);
         AddObjectProperty("AlbOpsC_Z", gxTv_SdtBC_ALBREC_Albopsc_Z, false, includeNonInitialized);
         AddObjectProperty("AlbOC_Z", gxTv_SdtBC_ALBREC_Alboc_Z, false, includeNonInitialized);
         AddObjectProperty("AlbHdri_Z", gxTv_SdtBC_ALBREC_Albhdri_Z, false, includeNonInitialized);
         AddObjectProperty("AlbNumB_Z", gxTv_SdtBC_ALBREC_Albnumb_Z, false, includeNonInitialized);
         AddObjectProperty("AlbNumM_Z", gxTv_SdtBC_ALBREC_Albnumm_Z, false, includeNonInitialized);
         AddObjectProperty("AlbAncC_Z", gxTv_SdtBC_ALBREC_Albancc_Z, false, includeNonInitialized);
         AddObjectProperty("AlbDndC_Z", gxTv_SdtBC_ALBREC_Albdndc_Z, false, includeNonInitialized);
         AddObjectProperty("AlbAncCr_Z", gxTv_SdtBC_ALBREC_Albanccr_Z, false, includeNonInitialized);
         AddObjectProperty("AlbDndCr_Z", gxTv_SdtBC_ALBREC_Albdndcr_Z, false, includeNonInitialized);
         AddObjectProperty("AlbGalga_Z", gxTv_SdtBC_ALBREC_Albgalga_Z, false, includeNonInitialized);
         AddObjectProperty("AlbMaqTej_Z", gxTv_SdtBC_ALBREC_Albmaqtej_Z, false, includeNonInitialized);
         AddObjectProperty("AlbDmt_Z", gxTv_SdtBC_ALBREC_Albdmt_Z, false, includeNonInitialized);
         AddObjectProperty("AlbPdaC_Z", gxTv_SdtBC_ALBREC_Albpdac_Z, false, includeNonInitialized);
         AddObjectProperty("AlbOStj_Z", gxTv_SdtBC_ALBREC_Albostj_Z, false, includeNonInitialized);
         AddObjectProperty("AlbStLot_Z", gxTv_SdtBC_ALBREC_Albstlot_Z, false, includeNonInitialized);
         AddObjectProperty("AlbTurno_Z", gxTv_SdtBC_ALBREC_Albturno_Z, false, includeNonInitialized);
         AddObjectProperty("CliEst_Z", gxTv_SdtBC_ALBREC_Cliest_Z, false, includeNonInitialized);
         AddObjectProperty("AlbOEKOTEX_Z", gxTv_SdtBC_ALBREC_Alboekotex_Z, false, includeNonInitialized);
         AddObjectProperty("AlbREnt_3_Z", gxTv_SdtBC_ALBREC_Albrent_3_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRArtLu_Z", gxTv_SdtBC_ALBREC_Albrartlu_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRecCod_N", gxTv_SdtBC_ALBREC_Albreccod_N, false, includeNonInitialized);
         AddObjectProperty("EmprNom_N", gxTv_SdtBC_ALBREC_Emprnom_N, false, includeNonInitialized);
         AddObjectProperty("TrnCod_N", gxTv_SdtBC_ALBREC_Trncod_N, false, includeNonInitialized);
         AddObjectProperty("TrnNom_N", gxTv_SdtBC_ALBREC_Trnnom_N, false, includeNonInitialized);
         AddObjectProperty("TipEntCod_N", gxTv_SdtBC_ALBREC_Tipentcod_N, false, includeNonInitialized);
         AddObjectProperty("TipEntNom_N", gxTv_SdtBC_ALBREC_Tipentnom_N, false, includeNonInitialized);
         AddObjectProperty("ProceCod_N", gxTv_SdtBC_ALBREC_Procecod_N, false, includeNonInitialized);
         AddObjectProperty("ProceNom_N", gxTv_SdtBC_ALBREC_Procenom_N, false, includeNonInitialized);
         AddObjectProperty("AlbRTartC_N", gxTv_SdtBC_ALBREC_Albrtartc_N, false, includeNonInitialized);
         AddObjectProperty("AlbRTartD_N", gxTv_SdtBC_ALBREC_Albrtartd_N, false, includeNonInitialized);
         AddObjectProperty("AlmCod_N", gxTv_SdtBC_ALBREC_Almcod_N, false, includeNonInitialized);
         AddObjectProperty("AlmNom_N", gxTv_SdtBC_ALBREC_Almnom_N, false, includeNonInitialized);
         AddObjectProperty("AlbRArtLu_N", gxTv_SdtBC_ALBREC_Albrartlu_N, false, includeNonInitialized);
      }
   }

   public void updateDirties( app.SdtBC_ALBREC sdt )
   {
      if ( sdt.IsDirty("EmprCod") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Emprcod = sdt.getgxTv_SdtBC_ALBREC_Emprcod() ;
      }
      if ( sdt.IsDirty("AlbRecCod") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albreccod = sdt.getgxTv_SdtBC_ALBREC_Albreccod() ;
      }
      if ( sdt.IsDirty("EmprNom") )
      {
         gxTv_SdtBC_ALBREC_Emprnom_N = sdt.getgxTv_SdtBC_ALBREC_Emprnom_N() ;
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Emprnom = sdt.getgxTv_SdtBC_ALBREC_Emprnom() ;
      }
      if ( sdt.IsDirty("CliCod") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Clicod = sdt.getgxTv_SdtBC_ALBREC_Clicod() ;
      }
      if ( sdt.IsDirty("CliNom") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Clinom = sdt.getgxTv_SdtBC_ALBREC_Clinom() ;
      }
      if ( sdt.IsDirty("AlbRef") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albref = sdt.getgxTv_SdtBC_ALBREC_Albref() ;
      }
      if ( sdt.IsDirty("TrnCod") )
      {
         gxTv_SdtBC_ALBREC_Trncod_N = sdt.getgxTv_SdtBC_ALBREC_Trncod_N() ;
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Trncod = sdt.getgxTv_SdtBC_ALBREC_Trncod() ;
      }
      if ( sdt.IsDirty("TrnNom") )
      {
         gxTv_SdtBC_ALBREC_Trnnom_N = sdt.getgxTv_SdtBC_ALBREC_Trnnom_N() ;
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Trnnom = sdt.getgxTv_SdtBC_ALBREC_Trnnom() ;
      }
      if ( sdt.IsDirty("AlbREnt") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albrent = sdt.getgxTv_SdtBC_ALBREC_Albrent() ;
      }
      if ( sdt.IsDirty("AlbRPieEnt") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albrpieent = sdt.getgxTv_SdtBC_ALBREC_Albrpieent() ;
      }
      if ( sdt.IsDirty("AlbRUni") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albruni = sdt.getgxTv_SdtBC_ALBREC_Albruni() ;
      }
      if ( sdt.IsDirty("AlbRLoc") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albrloc = sdt.getgxTv_SdtBC_ALBREC_Albrloc() ;
      }
      if ( sdt.IsDirty("AlbRFen") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albrfen = sdt.getgxTv_SdtBC_ALBREC_Albrfen() ;
      }
      if ( sdt.IsDirty("AlbRUniEnt") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albrunient = sdt.getgxTv_SdtBC_ALBREC_Albrunient() ;
      }
      if ( sdt.IsDirty("AlbRTam") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albrtam = sdt.getgxTv_SdtBC_ALBREC_Albrtam() ;
      }
      if ( sdt.IsDirty("Emp_Item1") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Emp_item1 = sdt.getgxTv_SdtBC_ALBREC_Emp_item1() ;
      }
      if ( sdt.IsDirty("AlbRReo") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albrreo = sdt.getgxTv_SdtBC_ALBREC_Albrreo() ;
      }
      if ( sdt.IsDirty("AlbRPieUti") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albrpieuti = sdt.getgxTv_SdtBC_ALBREC_Albrpieuti() ;
      }
      if ( sdt.IsDirty("AlbRPieReb") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albrpiereb = sdt.getgxTv_SdtBC_ALBREC_Albrpiereb() ;
      }
      if ( sdt.IsDirty("AlbRUniUti") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albruniuti = sdt.getgxTv_SdtBC_ALBREC_Albruniuti() ;
      }
      if ( sdt.IsDirty("AlbRUniReb") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albrunireb = sdt.getgxTv_SdtBC_ALBREC_Albrunireb() ;
      }
      if ( sdt.IsDirty("AlbRPieDis") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albrpiedis = sdt.getgxTv_SdtBC_ALBREC_Albrpiedis() ;
      }
      if ( sdt.IsDirty("AlbRUniDis") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albrunidis = sdt.getgxTv_SdtBC_ALBREC_Albrunidis() ;
      }
      if ( sdt.IsDirty("AlbRFecUlt") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albrfecult = sdt.getgxTv_SdtBC_ALBREC_Albrfecult() ;
      }
      if ( sdt.IsDirty("AlbREst") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albrest = sdt.getgxTv_SdtBC_ALBREC_Albrest() ;
      }
      if ( sdt.IsDirty("TipEntCod") )
      {
         gxTv_SdtBC_ALBREC_Tipentcod_N = sdt.getgxTv_SdtBC_ALBREC_Tipentcod_N() ;
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Tipentcod = sdt.getgxTv_SdtBC_ALBREC_Tipentcod() ;
      }
      if ( sdt.IsDirty("TipEntNom") )
      {
         gxTv_SdtBC_ALBREC_Tipentnom_N = sdt.getgxTv_SdtBC_ALBREC_Tipentnom_N() ;
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Tipentnom = sdt.getgxTv_SdtBC_ALBREC_Tipentnom() ;
      }
      if ( sdt.IsDirty("AlbNumEti") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albnumeti = sdt.getgxTv_SdtBC_ALBREC_Albnumeti() ;
      }
      if ( sdt.IsDirty("AlbRDes") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albrdes = sdt.getgxTv_SdtBC_ALBREC_Albrdes() ;
      }
      if ( sdt.IsDirty("ProceCod") )
      {
         gxTv_SdtBC_ALBREC_Procecod_N = sdt.getgxTv_SdtBC_ALBREC_Procecod_N() ;
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Procecod = sdt.getgxTv_SdtBC_ALBREC_Procecod() ;
      }
      if ( sdt.IsDirty("ProceNom") )
      {
         gxTv_SdtBC_ALBREC_Procenom_N = sdt.getgxTv_SdtBC_ALBREC_Procenom_N() ;
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Procenom = sdt.getgxTv_SdtBC_ALBREC_Procenom() ;
      }
      if ( sdt.IsDirty("AlbRUlin") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albrulin = sdt.getgxTv_SdtBC_ALBREC_Albrulin() ;
      }
      if ( sdt.IsDirty("AlbRefDsc") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albrefdsc = sdt.getgxTv_SdtBC_ALBREC_Albrefdsc() ;
      }
      if ( sdt.IsDirty("AlbPmPPza") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albpmppza = sdt.getgxTv_SdtBC_ALBREC_Albpmppza() ;
      }
      if ( sdt.IsDirty("AlbPzaEst") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albpzaest = sdt.getgxTv_SdtBC_ALBREC_Albpzaest() ;
      }
      if ( sdt.IsDirty("AlbRGrm2") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albrgrm2 = sdt.getgxTv_SdtBC_ALBREC_Albrgrm2() ;
      }
      if ( sdt.IsDirty("AlbRAnc") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albranc = sdt.getgxTv_SdtBC_ALBREC_Albranc() ;
      }
      if ( sdt.IsDirty("AlbPml") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albpml = sdt.getgxTv_SdtBC_ALBREC_Albpml() ;
      }
      if ( sdt.IsDirty("AlbRPre") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albrpre = sdt.getgxTv_SdtBC_ALBREC_Albrpre() ;
      }
      if ( sdt.IsDirty("AlbRAju") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albraju = sdt.getgxTv_SdtBC_ALBREC_Albraju() ;
      }
      if ( sdt.IsDirty("AlbRRep") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albrrep = sdt.getgxTv_SdtBC_ALBREC_Albrrep() ;
      }
      if ( sdt.IsDirty("AlbREnt2") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albrent2 = sdt.getgxTv_SdtBC_ALBREC_Albrent2() ;
      }
      if ( sdt.IsDirty("AlbrUsu") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albrusu = sdt.getgxTv_SdtBC_ALBREC_Albrusu() ;
      }
      if ( sdt.IsDirty("AlbrHor") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albrhor = sdt.getgxTv_SdtBC_ALBREC_Albrhor() ;
      }
      if ( sdt.IsDirty("AlbrUniC") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albrunic = sdt.getgxTv_SdtBC_ALBREC_Albrunic() ;
      }
      if ( sdt.IsDirty("AlbrPieC") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albrpiec = sdt.getgxTv_SdtBC_ALBREC_Albrpiec() ;
      }
      if ( sdt.IsDirty("AlbrNF") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albrnf = sdt.getgxTv_SdtBC_ALBREC_Albrnf() ;
      }
      if ( sdt.IsDirty("AlbrFeNf") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albrfenf = sdt.getgxTv_SdtBC_ALBREC_Albrfenf() ;
      }
      if ( sdt.IsDirty("AlbrCfop") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albrcfop = sdt.getgxTv_SdtBC_ALBREC_Albrcfop() ;
      }
      if ( sdt.IsDirty("AlbRDisCli") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albrdiscli = sdt.getgxTv_SdtBC_ALBREC_Albrdiscli() ;
      }
      if ( sdt.IsDirty("AlbRTartC") )
      {
         gxTv_SdtBC_ALBREC_Albrtartc_N = sdt.getgxTv_SdtBC_ALBREC_Albrtartc_N() ;
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albrtartc = sdt.getgxTv_SdtBC_ALBREC_Albrtartc() ;
      }
      if ( sdt.IsDirty("AlbRTartD") )
      {
         gxTv_SdtBC_ALBREC_Albrtartd_N = sdt.getgxTv_SdtBC_ALBREC_Albrtartd_N() ;
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albrtartd = sdt.getgxTv_SdtBC_ALBREC_Albrtartd() ;
      }
      if ( sdt.IsDirty("AlbRImp") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albrimp = sdt.getgxTv_SdtBC_ALBREC_Albrimp() ;
      }
      if ( sdt.IsDirty("AlbRLote") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albrlote = sdt.getgxTv_SdtBC_ALBREC_Albrlote() ;
      }
      if ( sdt.IsDirty("AlbRTelar") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albrtelar = sdt.getgxTv_SdtBC_ALBREC_Albrtelar() ;
      }
      if ( sdt.IsDirty("AlbRLot2") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albrlot2 = sdt.getgxTv_SdtBC_ALBREC_Albrlot2() ;
      }
      if ( sdt.IsDirty("AlbRLu") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albrlu = sdt.getgxTv_SdtBC_ALBREC_Albrlu() ;
      }
      if ( sdt.IsDirty("AlbRMdlCod") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albrmdlcod = sdt.getgxTv_SdtBC_ALBREC_Albrmdlcod() ;
      }
      if ( sdt.IsDirty("AlbRTara") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albrtara = sdt.getgxTv_SdtBC_ALBREC_Albrtara() ;
      }
      if ( sdt.IsDirty("AlbRUniB") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albrunib = sdt.getgxTv_SdtBC_ALBREC_Albrunib() ;
      }
      if ( sdt.IsDirty("AlbDocPrv") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albdocprv = sdt.getgxTv_SdtBC_ALBREC_Albdocprv() ;
      }
      if ( sdt.IsDirty("AlbRUdas") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albrudas = sdt.getgxTv_SdtBC_ALBREC_Albrudas() ;
      }
      if ( sdt.IsDirty("AlmCod") )
      {
         gxTv_SdtBC_ALBREC_Almcod_N = sdt.getgxTv_SdtBC_ALBREC_Almcod_N() ;
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Almcod = sdt.getgxTv_SdtBC_ALBREC_Almcod() ;
      }
      if ( sdt.IsDirty("AlmNom") )
      {
         gxTv_SdtBC_ALBREC_Almnom_N = sdt.getgxTv_SdtBC_ALBREC_Almnom_N() ;
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Almnom = sdt.getgxTv_SdtBC_ALBREC_Almnom() ;
      }
      if ( sdt.IsDirty("AlbColor") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albcolor = sdt.getgxTv_SdtBC_ALBREC_Albcolor() ;
      }
      if ( sdt.IsDirty("AlbOpsT") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albopst = sdt.getgxTv_SdtBC_ALBREC_Albopst() ;
      }
      if ( sdt.IsDirty("AlbOpsC") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albopsc = sdt.getgxTv_SdtBC_ALBREC_Albopsc() ;
      }
      if ( sdt.IsDirty("AlbOC") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Alboc = sdt.getgxTv_SdtBC_ALBREC_Alboc() ;
      }
      if ( sdt.IsDirty("AlbHdri") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albhdri = sdt.getgxTv_SdtBC_ALBREC_Albhdri() ;
      }
      if ( sdt.IsDirty("AlbNumB") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albnumb = sdt.getgxTv_SdtBC_ALBREC_Albnumb() ;
      }
      if ( sdt.IsDirty("AlbNumM") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albnumm = sdt.getgxTv_SdtBC_ALBREC_Albnumm() ;
      }
      if ( sdt.IsDirty("AlbAncC") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albancc = sdt.getgxTv_SdtBC_ALBREC_Albancc() ;
      }
      if ( sdt.IsDirty("AlbDndC") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albdndc = sdt.getgxTv_SdtBC_ALBREC_Albdndc() ;
      }
      if ( sdt.IsDirty("AlbAncCr") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albanccr = sdt.getgxTv_SdtBC_ALBREC_Albanccr() ;
      }
      if ( sdt.IsDirty("AlbDndCr") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albdndcr = sdt.getgxTv_SdtBC_ALBREC_Albdndcr() ;
      }
      if ( sdt.IsDirty("AlbGalga") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albgalga = sdt.getgxTv_SdtBC_ALBREC_Albgalga() ;
      }
      if ( sdt.IsDirty("AlbMaqTej") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albmaqtej = sdt.getgxTv_SdtBC_ALBREC_Albmaqtej() ;
      }
      if ( sdt.IsDirty("AlbDmt") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albdmt = sdt.getgxTv_SdtBC_ALBREC_Albdmt() ;
      }
      if ( sdt.IsDirty("AlbPdaC") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albpdac = sdt.getgxTv_SdtBC_ALBREC_Albpdac() ;
      }
      if ( sdt.IsDirty("AlbOStj") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albostj = sdt.getgxTv_SdtBC_ALBREC_Albostj() ;
      }
      if ( sdt.IsDirty("AlbStLot") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albstlot = sdt.getgxTv_SdtBC_ALBREC_Albstlot() ;
      }
      if ( sdt.IsDirty("AlbTurno") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albturno = sdt.getgxTv_SdtBC_ALBREC_Albturno() ;
      }
      if ( sdt.IsDirty("CliEst") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Cliest = sdt.getgxTv_SdtBC_ALBREC_Cliest() ;
      }
      if ( sdt.IsDirty("AlbOEKOTEX") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Alboekotex = sdt.getgxTv_SdtBC_ALBREC_Alboekotex() ;
      }
      if ( sdt.IsDirty("AlbREnt_3") )
      {
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albrent_3 = sdt.getgxTv_SdtBC_ALBREC_Albrent_3() ;
      }
      if ( sdt.IsDirty("AlbRArtLu") )
      {
         gxTv_SdtBC_ALBREC_Albrartlu_N = sdt.getgxTv_SdtBC_ALBREC_Albrartlu_N() ;
         gxTv_SdtBC_ALBREC_N = (byte)(0) ;
         gxTv_SdtBC_ALBREC_Albrartlu = sdt.getgxTv_SdtBC_ALBREC_Albrartlu() ;
      }
      if ( gxTv_SdtBC_ALBREC_Level1 != null )
      {
         GXBCLevelCollection<app.SdtBC_ALBREC_Level1Item> newCollectionLevel1 = sdt.getgxTv_SdtBC_ALBREC_Level1();
         app.SdtBC_ALBREC_Level1Item currItemLevel1;
         app.SdtBC_ALBREC_Level1Item newItemLevel1;
         short idx = 1;
         while ( idx <= newCollectionLevel1.size() )
         {
            newItemLevel1 = (app.SdtBC_ALBREC_Level1Item)((app.SdtBC_ALBREC_Level1Item)newCollectionLevel1.elementAt(-1+idx));
            currItemLevel1 = (app.SdtBC_ALBREC_Level1Item)gxTv_SdtBC_ALBREC_Level1.getByKey(newItemLevel1.getgxTv_SdtBC_ALBREC_Level1Item_Albrlin());
            if ( GXutil.strcmp(currItemLevel1.getgxTv_SdtBC_ALBREC_Level1Item_Mode(), "UPD") == 0 )
            {
               currItemLevel1.updateDirties(newItemLevel1);
               if ( GXutil.strcmp(newItemLevel1.getgxTv_SdtBC_ALBREC_Level1Item_Mode(), "DLT") == 0 )
               {
                  currItemLevel1.setgxTv_SdtBC_ALBREC_Level1Item_Mode( "DLT" );
               }
               currItemLevel1.setgxTv_SdtBC_ALBREC_Level1Item_Modified( (short)(1) );
            }
            else
            {
               gxTv_SdtBC_ALBREC_Level1.add(newItemLevel1, 0);
            }
            idx = (short)(idx+1) ;
         }
      }
   }

   public String getgxTv_SdtBC_ALBREC_Emprcod( )
   {
      return gxTv_SdtBC_ALBREC_Emprcod ;
   }

   public void setgxTv_SdtBC_ALBREC_Emprcod( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      if ( GXutil.strcmp(gxTv_SdtBC_ALBREC_Emprcod, value) != 0 )
      {
         gxTv_SdtBC_ALBREC_Mode = "INS" ;
         this.setgxTv_SdtBC_ALBREC_Emprcod_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albreccod_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Emprnom_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Clicod_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Clinom_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albref_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Trncod_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Trnnom_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrent_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrpieent_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albruni_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrloc_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrfen_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrunient_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrtam_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Emp_item1_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrreo_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrpieuti_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrpiereb_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albruniuti_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrunireb_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrpiedis_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrunidis_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrfecult_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrest_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Tipentcod_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Tipentnom_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albnumeti_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrdes_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Procecod_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Procenom_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrulin_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrefdsc_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albpmppza_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albpzaest_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrgrm2_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albranc_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albpml_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrpre_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albraju_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrrep_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrent2_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrusu_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrhor_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrunic_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrpiec_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrnf_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrfenf_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrcfop_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrdiscli_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrtartc_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrtartd_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrimp_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrlote_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrtelar_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrlot2_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrlu_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrmdlcod_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrtara_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrunib_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albdocprv_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrudas_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Almcod_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Almnom_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albcolor_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albopst_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albopsc_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Alboc_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albhdri_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albnumb_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albnumm_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albancc_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albdndc_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albanccr_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albdndcr_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albgalga_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albmaqtej_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albdmt_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albpdac_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albostj_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albstlot_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albturno_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Cliest_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Alboekotex_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrent_3_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrartlu_Z_SetNull( );
         if ( gxTv_SdtBC_ALBREC_Level1 != null )
         {
            GXBCLevelCollection<app.SdtBC_ALBREC_Level1Item> collectionLevel1 = gxTv_SdtBC_ALBREC_Level1;
            app.SdtBC_ALBREC_Level1Item currItemLevel1;
            short idx = 1;
            while ( idx <= collectionLevel1.size() )
            {
               currItemLevel1 = (app.SdtBC_ALBREC_Level1Item)((app.SdtBC_ALBREC_Level1Item)collectionLevel1.elementAt(-1+idx));
               currItemLevel1.setgxTv_SdtBC_ALBREC_Level1Item_Mode( "INS" );
               currItemLevel1.setgxTv_SdtBC_ALBREC_Level1Item_Modified( (short)(1) );
               idx = (short)(idx+1) ;
            }
         }
      }
      SetDirty("Emprcod");
      gxTv_SdtBC_ALBREC_Emprcod = value ;
   }

   public int getgxTv_SdtBC_ALBREC_Albreccod( )
   {
      return gxTv_SdtBC_ALBREC_Albreccod ;
   }

   public void setgxTv_SdtBC_ALBREC_Albreccod( int value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      if ( gxTv_SdtBC_ALBREC_Albreccod != value )
      {
         gxTv_SdtBC_ALBREC_Mode = "INS" ;
         this.setgxTv_SdtBC_ALBREC_Emprcod_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albreccod_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Emprnom_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Clicod_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Clinom_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albref_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Trncod_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Trnnom_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrent_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrpieent_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albruni_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrloc_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrfen_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrunient_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrtam_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Emp_item1_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrreo_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrpieuti_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrpiereb_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albruniuti_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrunireb_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrpiedis_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrunidis_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrfecult_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrest_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Tipentcod_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Tipentnom_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albnumeti_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrdes_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Procecod_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Procenom_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrulin_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrefdsc_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albpmppza_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albpzaest_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrgrm2_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albranc_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albpml_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrpre_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albraju_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrrep_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrent2_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrusu_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrhor_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrunic_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrpiec_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrnf_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrfenf_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrcfop_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrdiscli_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrtartc_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrtartd_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrimp_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrlote_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrtelar_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrlot2_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrlu_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrmdlcod_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrtara_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrunib_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albdocprv_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrudas_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Almcod_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Almnom_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albcolor_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albopst_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albopsc_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Alboc_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albhdri_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albnumb_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albnumm_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albancc_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albdndc_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albanccr_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albdndcr_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albgalga_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albmaqtej_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albdmt_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albpdac_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albostj_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albstlot_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albturno_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Cliest_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Alboekotex_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrent_3_Z_SetNull( );
         this.setgxTv_SdtBC_ALBREC_Albrartlu_Z_SetNull( );
         if ( gxTv_SdtBC_ALBREC_Level1 != null )
         {
            GXBCLevelCollection<app.SdtBC_ALBREC_Level1Item> collectionLevel1 = gxTv_SdtBC_ALBREC_Level1;
            app.SdtBC_ALBREC_Level1Item currItemLevel1;
            short idx = 1;
            while ( idx <= collectionLevel1.size() )
            {
               currItemLevel1 = (app.SdtBC_ALBREC_Level1Item)((app.SdtBC_ALBREC_Level1Item)collectionLevel1.elementAt(-1+idx));
               currItemLevel1.setgxTv_SdtBC_ALBREC_Level1Item_Mode( "INS" );
               currItemLevel1.setgxTv_SdtBC_ALBREC_Level1Item_Modified( (short)(1) );
               idx = (short)(idx+1) ;
            }
         }
      }
      SetDirty("Albreccod");
      gxTv_SdtBC_ALBREC_Albreccod = value ;
   }

   public String getgxTv_SdtBC_ALBREC_Emprnom( )
   {
      return gxTv_SdtBC_ALBREC_Emprnom ;
   }

   public void setgxTv_SdtBC_ALBREC_Emprnom( String value )
   {
      gxTv_SdtBC_ALBREC_Emprnom_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Emprnom");
      gxTv_SdtBC_ALBREC_Emprnom = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Emprnom_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Emprnom_N = (byte)(1) ;
      gxTv_SdtBC_ALBREC_Emprnom = "" ;
      SetDirty("Emprnom");
   }

   public boolean getgxTv_SdtBC_ALBREC_Emprnom_IsNull( )
   {
      return (gxTv_SdtBC_ALBREC_Emprnom_N==1) ;
   }

   public int getgxTv_SdtBC_ALBREC_Clicod( )
   {
      return gxTv_SdtBC_ALBREC_Clicod ;
   }

   public void setgxTv_SdtBC_ALBREC_Clicod( int value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Clicod");
      gxTv_SdtBC_ALBREC_Clicod = value ;
   }

   public String getgxTv_SdtBC_ALBREC_Clinom( )
   {
      return gxTv_SdtBC_ALBREC_Clinom ;
   }

   public void setgxTv_SdtBC_ALBREC_Clinom( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Clinom");
      gxTv_SdtBC_ALBREC_Clinom = value ;
   }

   public String getgxTv_SdtBC_ALBREC_Albref( )
   {
      return gxTv_SdtBC_ALBREC_Albref ;
   }

   public void setgxTv_SdtBC_ALBREC_Albref( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albref");
      gxTv_SdtBC_ALBREC_Albref = value ;
   }

   public short getgxTv_SdtBC_ALBREC_Trncod( )
   {
      return gxTv_SdtBC_ALBREC_Trncod ;
   }

   public void setgxTv_SdtBC_ALBREC_Trncod( short value )
   {
      gxTv_SdtBC_ALBREC_Trncod_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Trncod");
      gxTv_SdtBC_ALBREC_Trncod = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Trncod_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Trncod_N = (byte)(1) ;
      gxTv_SdtBC_ALBREC_Trncod = (short)(0) ;
      SetDirty("Trncod");
   }

   public boolean getgxTv_SdtBC_ALBREC_Trncod_IsNull( )
   {
      return (gxTv_SdtBC_ALBREC_Trncod_N==1) ;
   }

   public String getgxTv_SdtBC_ALBREC_Trnnom( )
   {
      return gxTv_SdtBC_ALBREC_Trnnom ;
   }

   public void setgxTv_SdtBC_ALBREC_Trnnom( String value )
   {
      gxTv_SdtBC_ALBREC_Trnnom_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Trnnom");
      gxTv_SdtBC_ALBREC_Trnnom = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Trnnom_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Trnnom_N = (byte)(1) ;
      gxTv_SdtBC_ALBREC_Trnnom = "" ;
      SetDirty("Trnnom");
   }

   public boolean getgxTv_SdtBC_ALBREC_Trnnom_IsNull( )
   {
      return (gxTv_SdtBC_ALBREC_Trnnom_N==1) ;
   }

   public String getgxTv_SdtBC_ALBREC_Albrent( )
   {
      return gxTv_SdtBC_ALBREC_Albrent ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrent( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrent");
      gxTv_SdtBC_ALBREC_Albrent = value ;
   }

   public int getgxTv_SdtBC_ALBREC_Albrpieent( )
   {
      return gxTv_SdtBC_ALBREC_Albrpieent ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrpieent( int value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrpieent");
      gxTv_SdtBC_ALBREC_Albrpieent = value ;
   }

   public String getgxTv_SdtBC_ALBREC_Albruni( )
   {
      return gxTv_SdtBC_ALBREC_Albruni ;
   }

   public void setgxTv_SdtBC_ALBREC_Albruni( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albruni");
      gxTv_SdtBC_ALBREC_Albruni = value ;
   }

   public String getgxTv_SdtBC_ALBREC_Albrloc( )
   {
      return gxTv_SdtBC_ALBREC_Albrloc ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrloc( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrloc");
      gxTv_SdtBC_ALBREC_Albrloc = value ;
   }

   public java.util.Date getgxTv_SdtBC_ALBREC_Albrfen( )
   {
      return gxTv_SdtBC_ALBREC_Albrfen ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrfen( java.util.Date value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrfen");
      gxTv_SdtBC_ALBREC_Albrfen = value ;
   }

   public java.math.BigDecimal getgxTv_SdtBC_ALBREC_Albrunient( )
   {
      return gxTv_SdtBC_ALBREC_Albrunient ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrunient( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrunient");
      gxTv_SdtBC_ALBREC_Albrunient = value ;
   }

   public String getgxTv_SdtBC_ALBREC_Albrtam( )
   {
      return gxTv_SdtBC_ALBREC_Albrtam ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrtam( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrtam");
      gxTv_SdtBC_ALBREC_Albrtam = value ;
   }

   public String getgxTv_SdtBC_ALBREC_Emp_item1( )
   {
      return gxTv_SdtBC_ALBREC_Emp_item1 ;
   }

   public void setgxTv_SdtBC_ALBREC_Emp_item1( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Emp_item1");
      gxTv_SdtBC_ALBREC_Emp_item1 = value ;
   }

   public String getgxTv_SdtBC_ALBREC_Albrreo( )
   {
      return gxTv_SdtBC_ALBREC_Albrreo ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrreo( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrreo");
      gxTv_SdtBC_ALBREC_Albrreo = value ;
   }

   public int getgxTv_SdtBC_ALBREC_Albrpieuti( )
   {
      return gxTv_SdtBC_ALBREC_Albrpieuti ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrpieuti( int value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrpieuti");
      gxTv_SdtBC_ALBREC_Albrpieuti = value ;
   }

   public int getgxTv_SdtBC_ALBREC_Albrpiereb( )
   {
      return gxTv_SdtBC_ALBREC_Albrpiereb ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrpiereb( int value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrpiereb");
      gxTv_SdtBC_ALBREC_Albrpiereb = value ;
   }

   public java.math.BigDecimal getgxTv_SdtBC_ALBREC_Albruniuti( )
   {
      return gxTv_SdtBC_ALBREC_Albruniuti ;
   }

   public void setgxTv_SdtBC_ALBREC_Albruniuti( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albruniuti");
      gxTv_SdtBC_ALBREC_Albruniuti = value ;
   }

   public java.math.BigDecimal getgxTv_SdtBC_ALBREC_Albrunireb( )
   {
      return gxTv_SdtBC_ALBREC_Albrunireb ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrunireb( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrunireb");
      gxTv_SdtBC_ALBREC_Albrunireb = value ;
   }

   public int getgxTv_SdtBC_ALBREC_Albrpiedis( )
   {
      return gxTv_SdtBC_ALBREC_Albrpiedis ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrpiedis( int value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrpiedis");
      gxTv_SdtBC_ALBREC_Albrpiedis = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrpiedis_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrpiedis = 0 ;
      SetDirty("Albrpiedis");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrpiedis_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtBC_ALBREC_Albrunidis( )
   {
      return gxTv_SdtBC_ALBREC_Albrunidis ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrunidis( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrunidis");
      gxTv_SdtBC_ALBREC_Albrunidis = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrunidis_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrunidis = DecimalUtil.ZERO ;
      SetDirty("Albrunidis");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrunidis_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtBC_ALBREC_Albrfecult( )
   {
      return gxTv_SdtBC_ALBREC_Albrfecult ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrfecult( java.util.Date value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrfecult");
      gxTv_SdtBC_ALBREC_Albrfecult = value ;
   }

   public byte getgxTv_SdtBC_ALBREC_Albrest( )
   {
      return gxTv_SdtBC_ALBREC_Albrest ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrest( byte value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrest");
      gxTv_SdtBC_ALBREC_Albrest = value ;
   }

   public short getgxTv_SdtBC_ALBREC_Tipentcod( )
   {
      return gxTv_SdtBC_ALBREC_Tipentcod ;
   }

   public void setgxTv_SdtBC_ALBREC_Tipentcod( short value )
   {
      gxTv_SdtBC_ALBREC_Tipentcod_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Tipentcod");
      gxTv_SdtBC_ALBREC_Tipentcod = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Tipentcod_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Tipentcod_N = (byte)(1) ;
      gxTv_SdtBC_ALBREC_Tipentcod = (short)(0) ;
      SetDirty("Tipentcod");
   }

   public boolean getgxTv_SdtBC_ALBREC_Tipentcod_IsNull( )
   {
      return (gxTv_SdtBC_ALBREC_Tipentcod_N==1) ;
   }

   public String getgxTv_SdtBC_ALBREC_Tipentnom( )
   {
      return gxTv_SdtBC_ALBREC_Tipentnom ;
   }

   public void setgxTv_SdtBC_ALBREC_Tipentnom( String value )
   {
      gxTv_SdtBC_ALBREC_Tipentnom_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Tipentnom");
      gxTv_SdtBC_ALBREC_Tipentnom = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Tipentnom_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Tipentnom_N = (byte)(1) ;
      gxTv_SdtBC_ALBREC_Tipentnom = "" ;
      SetDirty("Tipentnom");
   }

   public boolean getgxTv_SdtBC_ALBREC_Tipentnom_IsNull( )
   {
      return (gxTv_SdtBC_ALBREC_Tipentnom_N==1) ;
   }

   public short getgxTv_SdtBC_ALBREC_Albnumeti( )
   {
      return gxTv_SdtBC_ALBREC_Albnumeti ;
   }

   public void setgxTv_SdtBC_ALBREC_Albnumeti( short value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albnumeti");
      gxTv_SdtBC_ALBREC_Albnumeti = value ;
   }

   public String getgxTv_SdtBC_ALBREC_Albrdes( )
   {
      return gxTv_SdtBC_ALBREC_Albrdes ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrdes( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrdes");
      gxTv_SdtBC_ALBREC_Albrdes = value ;
   }

   public short getgxTv_SdtBC_ALBREC_Procecod( )
   {
      return gxTv_SdtBC_ALBREC_Procecod ;
   }

   public void setgxTv_SdtBC_ALBREC_Procecod( short value )
   {
      gxTv_SdtBC_ALBREC_Procecod_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Procecod");
      gxTv_SdtBC_ALBREC_Procecod = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Procecod_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Procecod_N = (byte)(1) ;
      gxTv_SdtBC_ALBREC_Procecod = (short)(0) ;
      SetDirty("Procecod");
   }

   public boolean getgxTv_SdtBC_ALBREC_Procecod_IsNull( )
   {
      return (gxTv_SdtBC_ALBREC_Procecod_N==1) ;
   }

   public String getgxTv_SdtBC_ALBREC_Procenom( )
   {
      return gxTv_SdtBC_ALBREC_Procenom ;
   }

   public void setgxTv_SdtBC_ALBREC_Procenom( String value )
   {
      gxTv_SdtBC_ALBREC_Procenom_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Procenom");
      gxTv_SdtBC_ALBREC_Procenom = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Procenom_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Procenom_N = (byte)(1) ;
      gxTv_SdtBC_ALBREC_Procenom = "" ;
      SetDirty("Procenom");
   }

   public boolean getgxTv_SdtBC_ALBREC_Procenom_IsNull( )
   {
      return (gxTv_SdtBC_ALBREC_Procenom_N==1) ;
   }

   public byte getgxTv_SdtBC_ALBREC_Albrulin( )
   {
      return gxTv_SdtBC_ALBREC_Albrulin ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrulin( byte value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrulin");
      gxTv_SdtBC_ALBREC_Albrulin = value ;
   }

   public String getgxTv_SdtBC_ALBREC_Albrefdsc( )
   {
      return gxTv_SdtBC_ALBREC_Albrefdsc ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrefdsc( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrefdsc");
      gxTv_SdtBC_ALBREC_Albrefdsc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtBC_ALBREC_Albpmppza( )
   {
      return gxTv_SdtBC_ALBREC_Albpmppza ;
   }

   public void setgxTv_SdtBC_ALBREC_Albpmppza( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albpmppza");
      gxTv_SdtBC_ALBREC_Albpmppza = value ;
   }

   public int getgxTv_SdtBC_ALBREC_Albpzaest( )
   {
      return gxTv_SdtBC_ALBREC_Albpzaest ;
   }

   public void setgxTv_SdtBC_ALBREC_Albpzaest( int value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albpzaest");
      gxTv_SdtBC_ALBREC_Albpzaest = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albpzaest_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albpzaest = 0 ;
      SetDirty("Albpzaest");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albpzaest_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtBC_ALBREC_Albrgrm2( )
   {
      return gxTv_SdtBC_ALBREC_Albrgrm2 ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrgrm2( short value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrgrm2");
      gxTv_SdtBC_ALBREC_Albrgrm2 = value ;
   }

   public short getgxTv_SdtBC_ALBREC_Albranc( )
   {
      return gxTv_SdtBC_ALBREC_Albranc ;
   }

   public void setgxTv_SdtBC_ALBREC_Albranc( short value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albranc");
      gxTv_SdtBC_ALBREC_Albranc = value ;
   }

   public short getgxTv_SdtBC_ALBREC_Albpml( )
   {
      return gxTv_SdtBC_ALBREC_Albpml ;
   }

   public void setgxTv_SdtBC_ALBREC_Albpml( short value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albpml");
      gxTv_SdtBC_ALBREC_Albpml = value ;
   }

   public java.math.BigDecimal getgxTv_SdtBC_ALBREC_Albrpre( )
   {
      return gxTv_SdtBC_ALBREC_Albrpre ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrpre( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrpre");
      gxTv_SdtBC_ALBREC_Albrpre = value ;
   }

   public java.math.BigDecimal getgxTv_SdtBC_ALBREC_Albraju( )
   {
      return gxTv_SdtBC_ALBREC_Albraju ;
   }

   public void setgxTv_SdtBC_ALBREC_Albraju( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albraju");
      gxTv_SdtBC_ALBREC_Albraju = value ;
   }

   public byte getgxTv_SdtBC_ALBREC_Albrrep( )
   {
      return gxTv_SdtBC_ALBREC_Albrrep ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrrep( byte value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrrep");
      gxTv_SdtBC_ALBREC_Albrrep = value ;
   }

   public String getgxTv_SdtBC_ALBREC_Albrent2( )
   {
      return gxTv_SdtBC_ALBREC_Albrent2 ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrent2( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrent2");
      gxTv_SdtBC_ALBREC_Albrent2 = value ;
   }

   public String getgxTv_SdtBC_ALBREC_Albrusu( )
   {
      return gxTv_SdtBC_ALBREC_Albrusu ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrusu( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrusu");
      gxTv_SdtBC_ALBREC_Albrusu = value ;
   }

   public java.util.Date getgxTv_SdtBC_ALBREC_Albrhor( )
   {
      return gxTv_SdtBC_ALBREC_Albrhor ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrhor( java.util.Date value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrhor");
      gxTv_SdtBC_ALBREC_Albrhor = value ;
   }

   public java.math.BigDecimal getgxTv_SdtBC_ALBREC_Albrunic( )
   {
      return gxTv_SdtBC_ALBREC_Albrunic ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrunic( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrunic");
      gxTv_SdtBC_ALBREC_Albrunic = value ;
   }

   public int getgxTv_SdtBC_ALBREC_Albrpiec( )
   {
      return gxTv_SdtBC_ALBREC_Albrpiec ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrpiec( int value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrpiec");
      gxTv_SdtBC_ALBREC_Albrpiec = value ;
   }

   public String getgxTv_SdtBC_ALBREC_Albrnf( )
   {
      return gxTv_SdtBC_ALBREC_Albrnf ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrnf( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrnf");
      gxTv_SdtBC_ALBREC_Albrnf = value ;
   }

   public java.util.Date getgxTv_SdtBC_ALBREC_Albrfenf( )
   {
      return gxTv_SdtBC_ALBREC_Albrfenf ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrfenf( java.util.Date value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrfenf");
      gxTv_SdtBC_ALBREC_Albrfenf = value ;
   }

   public String getgxTv_SdtBC_ALBREC_Albrcfop( )
   {
      return gxTv_SdtBC_ALBREC_Albrcfop ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrcfop( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrcfop");
      gxTv_SdtBC_ALBREC_Albrcfop = value ;
   }

   public String getgxTv_SdtBC_ALBREC_Albrdiscli( )
   {
      return gxTv_SdtBC_ALBREC_Albrdiscli ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrdiscli( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrdiscli");
      gxTv_SdtBC_ALBREC_Albrdiscli = value ;
   }

   public short getgxTv_SdtBC_ALBREC_Albrtartc( )
   {
      return gxTv_SdtBC_ALBREC_Albrtartc ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrtartc( short value )
   {
      gxTv_SdtBC_ALBREC_Albrtartc_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrtartc");
      gxTv_SdtBC_ALBREC_Albrtartc = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrtartc_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrtartc_N = (byte)(1) ;
      gxTv_SdtBC_ALBREC_Albrtartc = (short)(0) ;
      SetDirty("Albrtartc");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrtartc_IsNull( )
   {
      return (gxTv_SdtBC_ALBREC_Albrtartc_N==1) ;
   }

   public String getgxTv_SdtBC_ALBREC_Albrtartd( )
   {
      return gxTv_SdtBC_ALBREC_Albrtartd ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrtartd( String value )
   {
      gxTv_SdtBC_ALBREC_Albrtartd_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrtartd");
      gxTv_SdtBC_ALBREC_Albrtartd = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrtartd_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrtartd_N = (byte)(1) ;
      gxTv_SdtBC_ALBREC_Albrtartd = "" ;
      SetDirty("Albrtartd");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrtartd_IsNull( )
   {
      return (gxTv_SdtBC_ALBREC_Albrtartd_N==1) ;
   }

   public String getgxTv_SdtBC_ALBREC_Albrimp( )
   {
      return gxTv_SdtBC_ALBREC_Albrimp ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrimp( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrimp");
      gxTv_SdtBC_ALBREC_Albrimp = value ;
   }

   public String getgxTv_SdtBC_ALBREC_Albrlote( )
   {
      return gxTv_SdtBC_ALBREC_Albrlote ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrlote( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrlote");
      gxTv_SdtBC_ALBREC_Albrlote = value ;
   }

   public String getgxTv_SdtBC_ALBREC_Albrtelar( )
   {
      return gxTv_SdtBC_ALBREC_Albrtelar ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrtelar( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrtelar");
      gxTv_SdtBC_ALBREC_Albrtelar = value ;
   }

   public String getgxTv_SdtBC_ALBREC_Albrlot2( )
   {
      return gxTv_SdtBC_ALBREC_Albrlot2 ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrlot2( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrlot2");
      gxTv_SdtBC_ALBREC_Albrlot2 = value ;
   }

   public java.math.BigDecimal getgxTv_SdtBC_ALBREC_Albrlu( )
   {
      return gxTv_SdtBC_ALBREC_Albrlu ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrlu( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrlu");
      gxTv_SdtBC_ALBREC_Albrlu = value ;
   }

   public String getgxTv_SdtBC_ALBREC_Albrmdlcod( )
   {
      return gxTv_SdtBC_ALBREC_Albrmdlcod ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrmdlcod( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrmdlcod");
      gxTv_SdtBC_ALBREC_Albrmdlcod = value ;
   }

   public java.math.BigDecimal getgxTv_SdtBC_ALBREC_Albrtara( )
   {
      return gxTv_SdtBC_ALBREC_Albrtara ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrtara( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrtara");
      gxTv_SdtBC_ALBREC_Albrtara = value ;
   }

   public java.math.BigDecimal getgxTv_SdtBC_ALBREC_Albrunib( )
   {
      return gxTv_SdtBC_ALBREC_Albrunib ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrunib( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrunib");
      gxTv_SdtBC_ALBREC_Albrunib = value ;
   }

   public String getgxTv_SdtBC_ALBREC_Albdocprv( )
   {
      return gxTv_SdtBC_ALBREC_Albdocprv ;
   }

   public void setgxTv_SdtBC_ALBREC_Albdocprv( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albdocprv");
      gxTv_SdtBC_ALBREC_Albdocprv = value ;
   }

   public java.math.BigDecimal getgxTv_SdtBC_ALBREC_Albrudas( )
   {
      return gxTv_SdtBC_ALBREC_Albrudas ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrudas( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrudas");
      gxTv_SdtBC_ALBREC_Albrudas = value ;
   }

   public byte getgxTv_SdtBC_ALBREC_Almcod( )
   {
      return gxTv_SdtBC_ALBREC_Almcod ;
   }

   public void setgxTv_SdtBC_ALBREC_Almcod( byte value )
   {
      gxTv_SdtBC_ALBREC_Almcod_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Almcod");
      gxTv_SdtBC_ALBREC_Almcod = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Almcod_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Almcod_N = (byte)(1) ;
      gxTv_SdtBC_ALBREC_Almcod = (byte)(0) ;
      SetDirty("Almcod");
   }

   public boolean getgxTv_SdtBC_ALBREC_Almcod_IsNull( )
   {
      return (gxTv_SdtBC_ALBREC_Almcod_N==1) ;
   }

   public String getgxTv_SdtBC_ALBREC_Almnom( )
   {
      return gxTv_SdtBC_ALBREC_Almnom ;
   }

   public void setgxTv_SdtBC_ALBREC_Almnom( String value )
   {
      gxTv_SdtBC_ALBREC_Almnom_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Almnom");
      gxTv_SdtBC_ALBREC_Almnom = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Almnom_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Almnom_N = (byte)(1) ;
      gxTv_SdtBC_ALBREC_Almnom = "" ;
      SetDirty("Almnom");
   }

   public boolean getgxTv_SdtBC_ALBREC_Almnom_IsNull( )
   {
      return (gxTv_SdtBC_ALBREC_Almnom_N==1) ;
   }

   public String getgxTv_SdtBC_ALBREC_Albcolor( )
   {
      return gxTv_SdtBC_ALBREC_Albcolor ;
   }

   public void setgxTv_SdtBC_ALBREC_Albcolor( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albcolor");
      gxTv_SdtBC_ALBREC_Albcolor = value ;
   }

   public String getgxTv_SdtBC_ALBREC_Albopst( )
   {
      return gxTv_SdtBC_ALBREC_Albopst ;
   }

   public void setgxTv_SdtBC_ALBREC_Albopst( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albopst");
      gxTv_SdtBC_ALBREC_Albopst = value ;
   }

   public String getgxTv_SdtBC_ALBREC_Albopsc( )
   {
      return gxTv_SdtBC_ALBREC_Albopsc ;
   }

   public void setgxTv_SdtBC_ALBREC_Albopsc( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albopsc");
      gxTv_SdtBC_ALBREC_Albopsc = value ;
   }

   public String getgxTv_SdtBC_ALBREC_Alboc( )
   {
      return gxTv_SdtBC_ALBREC_Alboc ;
   }

   public void setgxTv_SdtBC_ALBREC_Alboc( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Alboc");
      gxTv_SdtBC_ALBREC_Alboc = value ;
   }

   public String getgxTv_SdtBC_ALBREC_Albhdri( )
   {
      return gxTv_SdtBC_ALBREC_Albhdri ;
   }

   public void setgxTv_SdtBC_ALBREC_Albhdri( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albhdri");
      gxTv_SdtBC_ALBREC_Albhdri = value ;
   }

   public String getgxTv_SdtBC_ALBREC_Albnumb( )
   {
      return gxTv_SdtBC_ALBREC_Albnumb ;
   }

   public void setgxTv_SdtBC_ALBREC_Albnumb( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albnumb");
      gxTv_SdtBC_ALBREC_Albnumb = value ;
   }

   public String getgxTv_SdtBC_ALBREC_Albnumm( )
   {
      return gxTv_SdtBC_ALBREC_Albnumm ;
   }

   public void setgxTv_SdtBC_ALBREC_Albnumm( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albnumm");
      gxTv_SdtBC_ALBREC_Albnumm = value ;
   }

   public java.math.BigDecimal getgxTv_SdtBC_ALBREC_Albancc( )
   {
      return gxTv_SdtBC_ALBREC_Albancc ;
   }

   public void setgxTv_SdtBC_ALBREC_Albancc( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albancc");
      gxTv_SdtBC_ALBREC_Albancc = value ;
   }

   public short getgxTv_SdtBC_ALBREC_Albdndc( )
   {
      return gxTv_SdtBC_ALBREC_Albdndc ;
   }

   public void setgxTv_SdtBC_ALBREC_Albdndc( short value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albdndc");
      gxTv_SdtBC_ALBREC_Albdndc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtBC_ALBREC_Albanccr( )
   {
      return gxTv_SdtBC_ALBREC_Albanccr ;
   }

   public void setgxTv_SdtBC_ALBREC_Albanccr( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albanccr");
      gxTv_SdtBC_ALBREC_Albanccr = value ;
   }

   public short getgxTv_SdtBC_ALBREC_Albdndcr( )
   {
      return gxTv_SdtBC_ALBREC_Albdndcr ;
   }

   public void setgxTv_SdtBC_ALBREC_Albdndcr( short value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albdndcr");
      gxTv_SdtBC_ALBREC_Albdndcr = value ;
   }

   public short getgxTv_SdtBC_ALBREC_Albgalga( )
   {
      return gxTv_SdtBC_ALBREC_Albgalga ;
   }

   public void setgxTv_SdtBC_ALBREC_Albgalga( short value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albgalga");
      gxTv_SdtBC_ALBREC_Albgalga = value ;
   }

   public String getgxTv_SdtBC_ALBREC_Albmaqtej( )
   {
      return gxTv_SdtBC_ALBREC_Albmaqtej ;
   }

   public void setgxTv_SdtBC_ALBREC_Albmaqtej( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albmaqtej");
      gxTv_SdtBC_ALBREC_Albmaqtej = value ;
   }

   public short getgxTv_SdtBC_ALBREC_Albdmt( )
   {
      return gxTv_SdtBC_ALBREC_Albdmt ;
   }

   public void setgxTv_SdtBC_ALBREC_Albdmt( short value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albdmt");
      gxTv_SdtBC_ALBREC_Albdmt = value ;
   }

   public String getgxTv_SdtBC_ALBREC_Albpdac( )
   {
      return gxTv_SdtBC_ALBREC_Albpdac ;
   }

   public void setgxTv_SdtBC_ALBREC_Albpdac( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albpdac");
      gxTv_SdtBC_ALBREC_Albpdac = value ;
   }

   public String getgxTv_SdtBC_ALBREC_Albostj( )
   {
      return gxTv_SdtBC_ALBREC_Albostj ;
   }

   public void setgxTv_SdtBC_ALBREC_Albostj( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albostj");
      gxTv_SdtBC_ALBREC_Albostj = value ;
   }

   public byte getgxTv_SdtBC_ALBREC_Albstlot( )
   {
      return gxTv_SdtBC_ALBREC_Albstlot ;
   }

   public void setgxTv_SdtBC_ALBREC_Albstlot( byte value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albstlot");
      gxTv_SdtBC_ALBREC_Albstlot = value ;
   }

   public byte getgxTv_SdtBC_ALBREC_Albturno( )
   {
      return gxTv_SdtBC_ALBREC_Albturno ;
   }

   public void setgxTv_SdtBC_ALBREC_Albturno( byte value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albturno");
      gxTv_SdtBC_ALBREC_Albturno = value ;
   }

   public String getgxTv_SdtBC_ALBREC_Cliest( )
   {
      return gxTv_SdtBC_ALBREC_Cliest ;
   }

   public void setgxTv_SdtBC_ALBREC_Cliest( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Cliest");
      gxTv_SdtBC_ALBREC_Cliest = value ;
   }

   public String getgxTv_SdtBC_ALBREC_Alboekotex( )
   {
      return gxTv_SdtBC_ALBREC_Alboekotex ;
   }

   public void setgxTv_SdtBC_ALBREC_Alboekotex( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Alboekotex");
      gxTv_SdtBC_ALBREC_Alboekotex = value ;
   }

   public String getgxTv_SdtBC_ALBREC_Albrent_3( )
   {
      return gxTv_SdtBC_ALBREC_Albrent_3 ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrent_3( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrent_3");
      gxTv_SdtBC_ALBREC_Albrent_3 = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrent_3_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrent_3 = "" ;
      SetDirty("Albrent_3");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrent_3_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtBC_ALBREC_Albrartlu( )
   {
      return gxTv_SdtBC_ALBREC_Albrartlu ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrartlu( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_Albrartlu_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrartlu");
      gxTv_SdtBC_ALBREC_Albrartlu = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrartlu_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrartlu_N = (byte)(1) ;
      gxTv_SdtBC_ALBREC_Albrartlu = DecimalUtil.ZERO ;
      SetDirty("Albrartlu");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrartlu_IsNull( )
   {
      return (gxTv_SdtBC_ALBREC_Albrartlu_N==1) ;
   }

   public GXBCLevelCollection<app.SdtBC_ALBREC_Level1Item> getgxTv_SdtBC_ALBREC_Level1( )
   {
      if ( gxTv_SdtBC_ALBREC_Level1 == null )
      {
         gxTv_SdtBC_ALBREC_Level1 = new GXBCLevelCollection<app.SdtBC_ALBREC_Level1Item>(app.SdtBC_ALBREC_Level1Item.class, "BC_ALBREC.Level1Item", "TexplusNET", remoteHandle);
      }
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      return gxTv_SdtBC_ALBREC_Level1 ;
   }

   public void setgxTv_SdtBC_ALBREC_Level1( GXBCLevelCollection<app.SdtBC_ALBREC_Level1Item> value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Level1");
      gxTv_SdtBC_ALBREC_Level1 = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Level1_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Level1 = null ;
      SetDirty("Level1");
   }

   public boolean getgxTv_SdtBC_ALBREC_Level1_IsNull( )
   {
      if ( gxTv_SdtBC_ALBREC_Level1 == null )
      {
         return true ;
      }
      return false ;
   }

   public String getgxTv_SdtBC_ALBREC_Mode( )
   {
      return gxTv_SdtBC_ALBREC_Mode ;
   }

   public void setgxTv_SdtBC_ALBREC_Mode( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Mode");
      gxTv_SdtBC_ALBREC_Mode = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Mode_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_SdtBC_ALBREC_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtBC_ALBREC_Initialized( )
   {
      return gxTv_SdtBC_ALBREC_Initialized ;
   }

   public void setgxTv_SdtBC_ALBREC_Initialized( short value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Initialized");
      gxTv_SdtBC_ALBREC_Initialized = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Initialized_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_SdtBC_ALBREC_Initialized_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtBC_ALBREC_Emprcod_Z( )
   {
      return gxTv_SdtBC_ALBREC_Emprcod_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Emprcod_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Emprcod_Z");
      gxTv_SdtBC_ALBREC_Emprcod_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Emprcod_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Emprcod_Z = "" ;
      SetDirty("Emprcod_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Emprcod_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtBC_ALBREC_Albreccod_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albreccod_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albreccod_Z( int value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albreccod_Z");
      gxTv_SdtBC_ALBREC_Albreccod_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albreccod_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albreccod_Z = 0 ;
      SetDirty("Albreccod_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albreccod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtBC_ALBREC_Emprnom_Z( )
   {
      return gxTv_SdtBC_ALBREC_Emprnom_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Emprnom_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Emprnom_Z");
      gxTv_SdtBC_ALBREC_Emprnom_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Emprnom_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Emprnom_Z = "" ;
      SetDirty("Emprnom_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Emprnom_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtBC_ALBREC_Clicod_Z( )
   {
      return gxTv_SdtBC_ALBREC_Clicod_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Clicod_Z( int value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Clicod_Z");
      gxTv_SdtBC_ALBREC_Clicod_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Clicod_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Clicod_Z = 0 ;
      SetDirty("Clicod_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Clicod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtBC_ALBREC_Clinom_Z( )
   {
      return gxTv_SdtBC_ALBREC_Clinom_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Clinom_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Clinom_Z");
      gxTv_SdtBC_ALBREC_Clinom_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Clinom_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Clinom_Z = "" ;
      SetDirty("Clinom_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Clinom_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtBC_ALBREC_Albref_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albref_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albref_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albref_Z");
      gxTv_SdtBC_ALBREC_Albref_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albref_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albref_Z = "" ;
      SetDirty("Albref_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albref_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtBC_ALBREC_Trncod_Z( )
   {
      return gxTv_SdtBC_ALBREC_Trncod_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Trncod_Z( short value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Trncod_Z");
      gxTv_SdtBC_ALBREC_Trncod_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Trncod_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Trncod_Z = (short)(0) ;
      SetDirty("Trncod_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Trncod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtBC_ALBREC_Trnnom_Z( )
   {
      return gxTv_SdtBC_ALBREC_Trnnom_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Trnnom_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Trnnom_Z");
      gxTv_SdtBC_ALBREC_Trnnom_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Trnnom_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Trnnom_Z = "" ;
      SetDirty("Trnnom_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Trnnom_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtBC_ALBREC_Albrent_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrent_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrent_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrent_Z");
      gxTv_SdtBC_ALBREC_Albrent_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrent_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrent_Z = "" ;
      SetDirty("Albrent_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrent_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtBC_ALBREC_Albrpieent_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrpieent_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrpieent_Z( int value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrpieent_Z");
      gxTv_SdtBC_ALBREC_Albrpieent_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrpieent_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrpieent_Z = 0 ;
      SetDirty("Albrpieent_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrpieent_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtBC_ALBREC_Albruni_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albruni_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albruni_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albruni_Z");
      gxTv_SdtBC_ALBREC_Albruni_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albruni_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albruni_Z = "" ;
      SetDirty("Albruni_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albruni_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtBC_ALBREC_Albrloc_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrloc_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrloc_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrloc_Z");
      gxTv_SdtBC_ALBREC_Albrloc_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrloc_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrloc_Z = "" ;
      SetDirty("Albrloc_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrloc_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtBC_ALBREC_Albrfen_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrfen_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrfen_Z( java.util.Date value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrfen_Z");
      gxTv_SdtBC_ALBREC_Albrfen_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrfen_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrfen_Z = GXutil.nullDate() ;
      SetDirty("Albrfen_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrfen_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtBC_ALBREC_Albrunient_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrunient_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrunient_Z( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrunient_Z");
      gxTv_SdtBC_ALBREC_Albrunient_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrunient_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrunient_Z = DecimalUtil.ZERO ;
      SetDirty("Albrunient_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrunient_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtBC_ALBREC_Albrtam_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrtam_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrtam_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrtam_Z");
      gxTv_SdtBC_ALBREC_Albrtam_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrtam_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrtam_Z = "" ;
      SetDirty("Albrtam_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrtam_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtBC_ALBREC_Emp_item1_Z( )
   {
      return gxTv_SdtBC_ALBREC_Emp_item1_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Emp_item1_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Emp_item1_Z");
      gxTv_SdtBC_ALBREC_Emp_item1_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Emp_item1_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Emp_item1_Z = "" ;
      SetDirty("Emp_item1_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Emp_item1_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtBC_ALBREC_Albrreo_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrreo_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrreo_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrreo_Z");
      gxTv_SdtBC_ALBREC_Albrreo_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrreo_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrreo_Z = "" ;
      SetDirty("Albrreo_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrreo_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtBC_ALBREC_Albrpieuti_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrpieuti_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrpieuti_Z( int value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrpieuti_Z");
      gxTv_SdtBC_ALBREC_Albrpieuti_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrpieuti_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrpieuti_Z = 0 ;
      SetDirty("Albrpieuti_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrpieuti_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtBC_ALBREC_Albrpiereb_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrpiereb_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrpiereb_Z( int value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrpiereb_Z");
      gxTv_SdtBC_ALBREC_Albrpiereb_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrpiereb_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrpiereb_Z = 0 ;
      SetDirty("Albrpiereb_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrpiereb_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtBC_ALBREC_Albruniuti_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albruniuti_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albruniuti_Z( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albruniuti_Z");
      gxTv_SdtBC_ALBREC_Albruniuti_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albruniuti_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albruniuti_Z = DecimalUtil.ZERO ;
      SetDirty("Albruniuti_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albruniuti_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtBC_ALBREC_Albrunireb_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrunireb_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrunireb_Z( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrunireb_Z");
      gxTv_SdtBC_ALBREC_Albrunireb_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrunireb_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrunireb_Z = DecimalUtil.ZERO ;
      SetDirty("Albrunireb_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrunireb_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtBC_ALBREC_Albrpiedis_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrpiedis_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrpiedis_Z( int value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrpiedis_Z");
      gxTv_SdtBC_ALBREC_Albrpiedis_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrpiedis_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrpiedis_Z = 0 ;
      SetDirty("Albrpiedis_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrpiedis_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtBC_ALBREC_Albrunidis_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrunidis_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrunidis_Z( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrunidis_Z");
      gxTv_SdtBC_ALBREC_Albrunidis_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrunidis_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrunidis_Z = DecimalUtil.ZERO ;
      SetDirty("Albrunidis_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrunidis_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtBC_ALBREC_Albrfecult_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrfecult_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrfecult_Z( java.util.Date value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrfecult_Z");
      gxTv_SdtBC_ALBREC_Albrfecult_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrfecult_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrfecult_Z = GXutil.nullDate() ;
      SetDirty("Albrfecult_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrfecult_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtBC_ALBREC_Albrest_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrest_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrest_Z( byte value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrest_Z");
      gxTv_SdtBC_ALBREC_Albrest_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrest_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrest_Z = (byte)(0) ;
      SetDirty("Albrest_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrest_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtBC_ALBREC_Tipentcod_Z( )
   {
      return gxTv_SdtBC_ALBREC_Tipentcod_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Tipentcod_Z( short value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Tipentcod_Z");
      gxTv_SdtBC_ALBREC_Tipentcod_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Tipentcod_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Tipentcod_Z = (short)(0) ;
      SetDirty("Tipentcod_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Tipentcod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtBC_ALBREC_Tipentnom_Z( )
   {
      return gxTv_SdtBC_ALBREC_Tipentnom_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Tipentnom_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Tipentnom_Z");
      gxTv_SdtBC_ALBREC_Tipentnom_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Tipentnom_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Tipentnom_Z = "" ;
      SetDirty("Tipentnom_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Tipentnom_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtBC_ALBREC_Albnumeti_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albnumeti_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albnumeti_Z( short value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albnumeti_Z");
      gxTv_SdtBC_ALBREC_Albnumeti_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albnumeti_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albnumeti_Z = (short)(0) ;
      SetDirty("Albnumeti_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albnumeti_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtBC_ALBREC_Albrdes_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrdes_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrdes_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrdes_Z");
      gxTv_SdtBC_ALBREC_Albrdes_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrdes_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrdes_Z = "" ;
      SetDirty("Albrdes_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrdes_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtBC_ALBREC_Procecod_Z( )
   {
      return gxTv_SdtBC_ALBREC_Procecod_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Procecod_Z( short value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Procecod_Z");
      gxTv_SdtBC_ALBREC_Procecod_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Procecod_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Procecod_Z = (short)(0) ;
      SetDirty("Procecod_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Procecod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtBC_ALBREC_Procenom_Z( )
   {
      return gxTv_SdtBC_ALBREC_Procenom_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Procenom_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Procenom_Z");
      gxTv_SdtBC_ALBREC_Procenom_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Procenom_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Procenom_Z = "" ;
      SetDirty("Procenom_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Procenom_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtBC_ALBREC_Albrulin_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrulin_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrulin_Z( byte value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrulin_Z");
      gxTv_SdtBC_ALBREC_Albrulin_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrulin_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrulin_Z = (byte)(0) ;
      SetDirty("Albrulin_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrulin_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtBC_ALBREC_Albrefdsc_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrefdsc_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrefdsc_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrefdsc_Z");
      gxTv_SdtBC_ALBREC_Albrefdsc_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrefdsc_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrefdsc_Z = "" ;
      SetDirty("Albrefdsc_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrefdsc_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtBC_ALBREC_Albpmppza_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albpmppza_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albpmppza_Z( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albpmppza_Z");
      gxTv_SdtBC_ALBREC_Albpmppza_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albpmppza_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albpmppza_Z = DecimalUtil.ZERO ;
      SetDirty("Albpmppza_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albpmppza_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtBC_ALBREC_Albpzaest_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albpzaest_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albpzaest_Z( int value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albpzaest_Z");
      gxTv_SdtBC_ALBREC_Albpzaest_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albpzaest_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albpzaest_Z = 0 ;
      SetDirty("Albpzaest_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albpzaest_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtBC_ALBREC_Albrgrm2_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrgrm2_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrgrm2_Z( short value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrgrm2_Z");
      gxTv_SdtBC_ALBREC_Albrgrm2_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrgrm2_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrgrm2_Z = (short)(0) ;
      SetDirty("Albrgrm2_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrgrm2_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtBC_ALBREC_Albranc_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albranc_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albranc_Z( short value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albranc_Z");
      gxTv_SdtBC_ALBREC_Albranc_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albranc_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albranc_Z = (short)(0) ;
      SetDirty("Albranc_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albranc_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtBC_ALBREC_Albpml_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albpml_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albpml_Z( short value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albpml_Z");
      gxTv_SdtBC_ALBREC_Albpml_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albpml_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albpml_Z = (short)(0) ;
      SetDirty("Albpml_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albpml_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtBC_ALBREC_Albrpre_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrpre_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrpre_Z( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrpre_Z");
      gxTv_SdtBC_ALBREC_Albrpre_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrpre_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrpre_Z = DecimalUtil.ZERO ;
      SetDirty("Albrpre_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrpre_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtBC_ALBREC_Albraju_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albraju_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albraju_Z( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albraju_Z");
      gxTv_SdtBC_ALBREC_Albraju_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albraju_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albraju_Z = DecimalUtil.ZERO ;
      SetDirty("Albraju_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albraju_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtBC_ALBREC_Albrrep_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrrep_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrrep_Z( byte value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrrep_Z");
      gxTv_SdtBC_ALBREC_Albrrep_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrrep_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrrep_Z = (byte)(0) ;
      SetDirty("Albrrep_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrrep_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtBC_ALBREC_Albrent2_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrent2_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrent2_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrent2_Z");
      gxTv_SdtBC_ALBREC_Albrent2_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrent2_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrent2_Z = "" ;
      SetDirty("Albrent2_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrent2_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtBC_ALBREC_Albrusu_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrusu_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrusu_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrusu_Z");
      gxTv_SdtBC_ALBREC_Albrusu_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrusu_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrusu_Z = "" ;
      SetDirty("Albrusu_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrusu_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtBC_ALBREC_Albrhor_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrhor_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrhor_Z( java.util.Date value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrhor_Z");
      gxTv_SdtBC_ALBREC_Albrhor_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrhor_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrhor_Z = GXutil.resetTime( GXutil.nullDate() );
      SetDirty("Albrhor_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrhor_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtBC_ALBREC_Albrunic_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrunic_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrunic_Z( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrunic_Z");
      gxTv_SdtBC_ALBREC_Albrunic_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrunic_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrunic_Z = DecimalUtil.ZERO ;
      SetDirty("Albrunic_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrunic_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtBC_ALBREC_Albrpiec_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrpiec_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrpiec_Z( int value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrpiec_Z");
      gxTv_SdtBC_ALBREC_Albrpiec_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrpiec_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrpiec_Z = 0 ;
      SetDirty("Albrpiec_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrpiec_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtBC_ALBREC_Albrnf_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrnf_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrnf_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrnf_Z");
      gxTv_SdtBC_ALBREC_Albrnf_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrnf_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrnf_Z = "" ;
      SetDirty("Albrnf_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrnf_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtBC_ALBREC_Albrfenf_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrfenf_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrfenf_Z( java.util.Date value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrfenf_Z");
      gxTv_SdtBC_ALBREC_Albrfenf_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrfenf_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrfenf_Z = GXutil.nullDate() ;
      SetDirty("Albrfenf_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrfenf_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtBC_ALBREC_Albrcfop_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrcfop_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrcfop_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrcfop_Z");
      gxTv_SdtBC_ALBREC_Albrcfop_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrcfop_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrcfop_Z = "" ;
      SetDirty("Albrcfop_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrcfop_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtBC_ALBREC_Albrdiscli_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrdiscli_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrdiscli_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrdiscli_Z");
      gxTv_SdtBC_ALBREC_Albrdiscli_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrdiscli_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrdiscli_Z = "" ;
      SetDirty("Albrdiscli_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrdiscli_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtBC_ALBREC_Albrtartc_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrtartc_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrtartc_Z( short value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrtartc_Z");
      gxTv_SdtBC_ALBREC_Albrtartc_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrtartc_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrtartc_Z = (short)(0) ;
      SetDirty("Albrtartc_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrtartc_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtBC_ALBREC_Albrtartd_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrtartd_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrtartd_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrtartd_Z");
      gxTv_SdtBC_ALBREC_Albrtartd_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrtartd_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrtartd_Z = "" ;
      SetDirty("Albrtartd_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrtartd_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtBC_ALBREC_Albrimp_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrimp_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrimp_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrimp_Z");
      gxTv_SdtBC_ALBREC_Albrimp_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrimp_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrimp_Z = "" ;
      SetDirty("Albrimp_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrimp_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtBC_ALBREC_Albrlote_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrlote_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrlote_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrlote_Z");
      gxTv_SdtBC_ALBREC_Albrlote_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrlote_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrlote_Z = "" ;
      SetDirty("Albrlote_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrlote_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtBC_ALBREC_Albrtelar_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrtelar_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrtelar_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrtelar_Z");
      gxTv_SdtBC_ALBREC_Albrtelar_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrtelar_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrtelar_Z = "" ;
      SetDirty("Albrtelar_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrtelar_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtBC_ALBREC_Albrlot2_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrlot2_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrlot2_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrlot2_Z");
      gxTv_SdtBC_ALBREC_Albrlot2_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrlot2_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrlot2_Z = "" ;
      SetDirty("Albrlot2_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrlot2_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtBC_ALBREC_Albrlu_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrlu_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrlu_Z( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrlu_Z");
      gxTv_SdtBC_ALBREC_Albrlu_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrlu_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrlu_Z = DecimalUtil.ZERO ;
      SetDirty("Albrlu_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrlu_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtBC_ALBREC_Albrmdlcod_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrmdlcod_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrmdlcod_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrmdlcod_Z");
      gxTv_SdtBC_ALBREC_Albrmdlcod_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrmdlcod_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrmdlcod_Z = "" ;
      SetDirty("Albrmdlcod_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrmdlcod_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtBC_ALBREC_Albrtara_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrtara_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrtara_Z( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrtara_Z");
      gxTv_SdtBC_ALBREC_Albrtara_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrtara_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrtara_Z = DecimalUtil.ZERO ;
      SetDirty("Albrtara_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrtara_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtBC_ALBREC_Albrunib_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrunib_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrunib_Z( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrunib_Z");
      gxTv_SdtBC_ALBREC_Albrunib_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrunib_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrunib_Z = DecimalUtil.ZERO ;
      SetDirty("Albrunib_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrunib_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtBC_ALBREC_Albdocprv_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albdocprv_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albdocprv_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albdocprv_Z");
      gxTv_SdtBC_ALBREC_Albdocprv_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albdocprv_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albdocprv_Z = "" ;
      SetDirty("Albdocprv_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albdocprv_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtBC_ALBREC_Albrudas_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrudas_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrudas_Z( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrudas_Z");
      gxTv_SdtBC_ALBREC_Albrudas_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrudas_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrudas_Z = DecimalUtil.ZERO ;
      SetDirty("Albrudas_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrudas_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtBC_ALBREC_Almcod_Z( )
   {
      return gxTv_SdtBC_ALBREC_Almcod_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Almcod_Z( byte value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Almcod_Z");
      gxTv_SdtBC_ALBREC_Almcod_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Almcod_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Almcod_Z = (byte)(0) ;
      SetDirty("Almcod_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Almcod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtBC_ALBREC_Almnom_Z( )
   {
      return gxTv_SdtBC_ALBREC_Almnom_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Almnom_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Almnom_Z");
      gxTv_SdtBC_ALBREC_Almnom_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Almnom_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Almnom_Z = "" ;
      SetDirty("Almnom_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Almnom_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtBC_ALBREC_Albcolor_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albcolor_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albcolor_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albcolor_Z");
      gxTv_SdtBC_ALBREC_Albcolor_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albcolor_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albcolor_Z = "" ;
      SetDirty("Albcolor_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albcolor_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtBC_ALBREC_Albopst_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albopst_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albopst_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albopst_Z");
      gxTv_SdtBC_ALBREC_Albopst_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albopst_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albopst_Z = "" ;
      SetDirty("Albopst_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albopst_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtBC_ALBREC_Albopsc_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albopsc_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albopsc_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albopsc_Z");
      gxTv_SdtBC_ALBREC_Albopsc_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albopsc_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albopsc_Z = "" ;
      SetDirty("Albopsc_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albopsc_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtBC_ALBREC_Alboc_Z( )
   {
      return gxTv_SdtBC_ALBREC_Alboc_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Alboc_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Alboc_Z");
      gxTv_SdtBC_ALBREC_Alboc_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Alboc_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Alboc_Z = "" ;
      SetDirty("Alboc_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Alboc_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtBC_ALBREC_Albhdri_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albhdri_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albhdri_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albhdri_Z");
      gxTv_SdtBC_ALBREC_Albhdri_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albhdri_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albhdri_Z = "" ;
      SetDirty("Albhdri_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albhdri_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtBC_ALBREC_Albnumb_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albnumb_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albnumb_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albnumb_Z");
      gxTv_SdtBC_ALBREC_Albnumb_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albnumb_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albnumb_Z = "" ;
      SetDirty("Albnumb_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albnumb_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtBC_ALBREC_Albnumm_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albnumm_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albnumm_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albnumm_Z");
      gxTv_SdtBC_ALBREC_Albnumm_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albnumm_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albnumm_Z = "" ;
      SetDirty("Albnumm_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albnumm_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtBC_ALBREC_Albancc_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albancc_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albancc_Z( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albancc_Z");
      gxTv_SdtBC_ALBREC_Albancc_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albancc_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albancc_Z = DecimalUtil.ZERO ;
      SetDirty("Albancc_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albancc_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtBC_ALBREC_Albdndc_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albdndc_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albdndc_Z( short value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albdndc_Z");
      gxTv_SdtBC_ALBREC_Albdndc_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albdndc_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albdndc_Z = (short)(0) ;
      SetDirty("Albdndc_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albdndc_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtBC_ALBREC_Albanccr_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albanccr_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albanccr_Z( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albanccr_Z");
      gxTv_SdtBC_ALBREC_Albanccr_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albanccr_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albanccr_Z = DecimalUtil.ZERO ;
      SetDirty("Albanccr_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albanccr_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtBC_ALBREC_Albdndcr_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albdndcr_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albdndcr_Z( short value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albdndcr_Z");
      gxTv_SdtBC_ALBREC_Albdndcr_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albdndcr_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albdndcr_Z = (short)(0) ;
      SetDirty("Albdndcr_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albdndcr_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtBC_ALBREC_Albgalga_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albgalga_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albgalga_Z( short value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albgalga_Z");
      gxTv_SdtBC_ALBREC_Albgalga_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albgalga_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albgalga_Z = (short)(0) ;
      SetDirty("Albgalga_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albgalga_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtBC_ALBREC_Albmaqtej_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albmaqtej_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albmaqtej_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albmaqtej_Z");
      gxTv_SdtBC_ALBREC_Albmaqtej_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albmaqtej_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albmaqtej_Z = "" ;
      SetDirty("Albmaqtej_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albmaqtej_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtBC_ALBREC_Albdmt_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albdmt_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albdmt_Z( short value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albdmt_Z");
      gxTv_SdtBC_ALBREC_Albdmt_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albdmt_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albdmt_Z = (short)(0) ;
      SetDirty("Albdmt_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albdmt_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtBC_ALBREC_Albpdac_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albpdac_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albpdac_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albpdac_Z");
      gxTv_SdtBC_ALBREC_Albpdac_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albpdac_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albpdac_Z = "" ;
      SetDirty("Albpdac_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albpdac_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtBC_ALBREC_Albostj_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albostj_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albostj_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albostj_Z");
      gxTv_SdtBC_ALBREC_Albostj_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albostj_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albostj_Z = "" ;
      SetDirty("Albostj_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albostj_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtBC_ALBREC_Albstlot_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albstlot_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albstlot_Z( byte value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albstlot_Z");
      gxTv_SdtBC_ALBREC_Albstlot_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albstlot_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albstlot_Z = (byte)(0) ;
      SetDirty("Albstlot_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albstlot_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtBC_ALBREC_Albturno_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albturno_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albturno_Z( byte value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albturno_Z");
      gxTv_SdtBC_ALBREC_Albturno_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albturno_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albturno_Z = (byte)(0) ;
      SetDirty("Albturno_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albturno_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtBC_ALBREC_Cliest_Z( )
   {
      return gxTv_SdtBC_ALBREC_Cliest_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Cliest_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Cliest_Z");
      gxTv_SdtBC_ALBREC_Cliest_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Cliest_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Cliest_Z = "" ;
      SetDirty("Cliest_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Cliest_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtBC_ALBREC_Alboekotex_Z( )
   {
      return gxTv_SdtBC_ALBREC_Alboekotex_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Alboekotex_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Alboekotex_Z");
      gxTv_SdtBC_ALBREC_Alboekotex_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Alboekotex_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Alboekotex_Z = "" ;
      SetDirty("Alboekotex_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Alboekotex_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtBC_ALBREC_Albrent_3_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrent_3_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrent_3_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrent_3_Z");
      gxTv_SdtBC_ALBREC_Albrent_3_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrent_3_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrent_3_Z = "" ;
      SetDirty("Albrent_3_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrent_3_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtBC_ALBREC_Albrartlu_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrartlu_Z ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrartlu_Z( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrartlu_Z");
      gxTv_SdtBC_ALBREC_Albrartlu_Z = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrartlu_Z_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrartlu_Z = DecimalUtil.ZERO ;
      SetDirty("Albrartlu_Z");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrartlu_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtBC_ALBREC_Albreccod_N( )
   {
      return gxTv_SdtBC_ALBREC_Albreccod_N ;
   }

   public void setgxTv_SdtBC_ALBREC_Albreccod_N( byte value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albreccod_N");
      gxTv_SdtBC_ALBREC_Albreccod_N = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albreccod_N_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albreccod_N = (byte)(0) ;
      SetDirty("Albreccod_N");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albreccod_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtBC_ALBREC_Emprnom_N( )
   {
      return gxTv_SdtBC_ALBREC_Emprnom_N ;
   }

   public void setgxTv_SdtBC_ALBREC_Emprnom_N( byte value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Emprnom_N");
      gxTv_SdtBC_ALBREC_Emprnom_N = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Emprnom_N_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Emprnom_N = (byte)(0) ;
      SetDirty("Emprnom_N");
   }

   public boolean getgxTv_SdtBC_ALBREC_Emprnom_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtBC_ALBREC_Trncod_N( )
   {
      return gxTv_SdtBC_ALBREC_Trncod_N ;
   }

   public void setgxTv_SdtBC_ALBREC_Trncod_N( byte value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Trncod_N");
      gxTv_SdtBC_ALBREC_Trncod_N = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Trncod_N_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Trncod_N = (byte)(0) ;
      SetDirty("Trncod_N");
   }

   public boolean getgxTv_SdtBC_ALBREC_Trncod_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtBC_ALBREC_Trnnom_N( )
   {
      return gxTv_SdtBC_ALBREC_Trnnom_N ;
   }

   public void setgxTv_SdtBC_ALBREC_Trnnom_N( byte value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Trnnom_N");
      gxTv_SdtBC_ALBREC_Trnnom_N = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Trnnom_N_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Trnnom_N = (byte)(0) ;
      SetDirty("Trnnom_N");
   }

   public boolean getgxTv_SdtBC_ALBREC_Trnnom_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtBC_ALBREC_Tipentcod_N( )
   {
      return gxTv_SdtBC_ALBREC_Tipentcod_N ;
   }

   public void setgxTv_SdtBC_ALBREC_Tipentcod_N( byte value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Tipentcod_N");
      gxTv_SdtBC_ALBREC_Tipentcod_N = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Tipentcod_N_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Tipentcod_N = (byte)(0) ;
      SetDirty("Tipentcod_N");
   }

   public boolean getgxTv_SdtBC_ALBREC_Tipentcod_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtBC_ALBREC_Tipentnom_N( )
   {
      return gxTv_SdtBC_ALBREC_Tipentnom_N ;
   }

   public void setgxTv_SdtBC_ALBREC_Tipentnom_N( byte value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Tipentnom_N");
      gxTv_SdtBC_ALBREC_Tipentnom_N = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Tipentnom_N_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Tipentnom_N = (byte)(0) ;
      SetDirty("Tipentnom_N");
   }

   public boolean getgxTv_SdtBC_ALBREC_Tipentnom_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtBC_ALBREC_Procecod_N( )
   {
      return gxTv_SdtBC_ALBREC_Procecod_N ;
   }

   public void setgxTv_SdtBC_ALBREC_Procecod_N( byte value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Procecod_N");
      gxTv_SdtBC_ALBREC_Procecod_N = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Procecod_N_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Procecod_N = (byte)(0) ;
      SetDirty("Procecod_N");
   }

   public boolean getgxTv_SdtBC_ALBREC_Procecod_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtBC_ALBREC_Procenom_N( )
   {
      return gxTv_SdtBC_ALBREC_Procenom_N ;
   }

   public void setgxTv_SdtBC_ALBREC_Procenom_N( byte value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Procenom_N");
      gxTv_SdtBC_ALBREC_Procenom_N = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Procenom_N_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Procenom_N = (byte)(0) ;
      SetDirty("Procenom_N");
   }

   public boolean getgxTv_SdtBC_ALBREC_Procenom_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtBC_ALBREC_Albrtartc_N( )
   {
      return gxTv_SdtBC_ALBREC_Albrtartc_N ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrtartc_N( byte value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrtartc_N");
      gxTv_SdtBC_ALBREC_Albrtartc_N = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrtartc_N_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrtartc_N = (byte)(0) ;
      SetDirty("Albrtartc_N");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrtartc_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtBC_ALBREC_Albrtartd_N( )
   {
      return gxTv_SdtBC_ALBREC_Albrtartd_N ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrtartd_N( byte value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrtartd_N");
      gxTv_SdtBC_ALBREC_Albrtartd_N = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrtartd_N_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrtartd_N = (byte)(0) ;
      SetDirty("Albrtartd_N");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrtartd_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtBC_ALBREC_Almcod_N( )
   {
      return gxTv_SdtBC_ALBREC_Almcod_N ;
   }

   public void setgxTv_SdtBC_ALBREC_Almcod_N( byte value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Almcod_N");
      gxTv_SdtBC_ALBREC_Almcod_N = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Almcod_N_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Almcod_N = (byte)(0) ;
      SetDirty("Almcod_N");
   }

   public boolean getgxTv_SdtBC_ALBREC_Almcod_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtBC_ALBREC_Almnom_N( )
   {
      return gxTv_SdtBC_ALBREC_Almnom_N ;
   }

   public void setgxTv_SdtBC_ALBREC_Almnom_N( byte value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Almnom_N");
      gxTv_SdtBC_ALBREC_Almnom_N = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Almnom_N_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Almnom_N = (byte)(0) ;
      SetDirty("Almnom_N");
   }

   public boolean getgxTv_SdtBC_ALBREC_Almnom_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtBC_ALBREC_Albrartlu_N( )
   {
      return gxTv_SdtBC_ALBREC_Albrartlu_N ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrartlu_N( byte value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      SetDirty("Albrartlu_N");
      gxTv_SdtBC_ALBREC_Albrartlu_N = value ;
   }

   public void setgxTv_SdtBC_ALBREC_Albrartlu_N_SetNull( )
   {
      gxTv_SdtBC_ALBREC_Albrartlu_N = (byte)(0) ;
      SetDirty("Albrartlu_N");
   }

   public boolean getgxTv_SdtBC_ALBREC_Albrartlu_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      app.bc_albrec_bc obj;
      obj = new app.bc_albrec_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtBC_ALBREC_Emprcod = "" ;
      gxTv_SdtBC_ALBREC_N = (byte)(1) ;
      gxTv_SdtBC_ALBREC_Emprnom = "" ;
      gxTv_SdtBC_ALBREC_Clinom = "" ;
      gxTv_SdtBC_ALBREC_Albref = "" ;
      gxTv_SdtBC_ALBREC_Trnnom = "" ;
      gxTv_SdtBC_ALBREC_Albrent = "" ;
      gxTv_SdtBC_ALBREC_Albruni = "" ;
      gxTv_SdtBC_ALBREC_Albrloc = "" ;
      gxTv_SdtBC_ALBREC_Albrfen = GXutil.nullDate() ;
      gxTv_SdtBC_ALBREC_Albrunient = DecimalUtil.ZERO ;
      gxTv_SdtBC_ALBREC_Albrtam = "" ;
      gxTv_SdtBC_ALBREC_Emp_item1 = "" ;
      gxTv_SdtBC_ALBREC_Albrreo = "" ;
      gxTv_SdtBC_ALBREC_Albruniuti = DecimalUtil.ZERO ;
      gxTv_SdtBC_ALBREC_Albrunireb = DecimalUtil.ZERO ;
      gxTv_SdtBC_ALBREC_Albrunidis = DecimalUtil.ZERO ;
      gxTv_SdtBC_ALBREC_Albrfecult = GXutil.nullDate() ;
      gxTv_SdtBC_ALBREC_Tipentnom = "" ;
      gxTv_SdtBC_ALBREC_Albrdes = "" ;
      gxTv_SdtBC_ALBREC_Procenom = "" ;
      gxTv_SdtBC_ALBREC_Albrefdsc = "" ;
      gxTv_SdtBC_ALBREC_Albpmppza = DecimalUtil.ZERO ;
      gxTv_SdtBC_ALBREC_Albrpre = DecimalUtil.ZERO ;
      gxTv_SdtBC_ALBREC_Albraju = DecimalUtil.ZERO ;
      gxTv_SdtBC_ALBREC_Albrent2 = "" ;
      gxTv_SdtBC_ALBREC_Albrusu = "" ;
      gxTv_SdtBC_ALBREC_Albrhor = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtBC_ALBREC_Albrunic = DecimalUtil.ZERO ;
      gxTv_SdtBC_ALBREC_Albrnf = "" ;
      gxTv_SdtBC_ALBREC_Albrfenf = GXutil.nullDate() ;
      gxTv_SdtBC_ALBREC_Albrcfop = "" ;
      gxTv_SdtBC_ALBREC_Albrdiscli = "" ;
      gxTv_SdtBC_ALBREC_Albrtartd = "" ;
      gxTv_SdtBC_ALBREC_Albrimp = "" ;
      gxTv_SdtBC_ALBREC_Albrlote = "" ;
      gxTv_SdtBC_ALBREC_Albrtelar = "" ;
      gxTv_SdtBC_ALBREC_Albrlot2 = "" ;
      gxTv_SdtBC_ALBREC_Albrlu = DecimalUtil.ZERO ;
      gxTv_SdtBC_ALBREC_Albrmdlcod = "" ;
      gxTv_SdtBC_ALBREC_Albrtara = DecimalUtil.ZERO ;
      gxTv_SdtBC_ALBREC_Albrunib = DecimalUtil.ZERO ;
      gxTv_SdtBC_ALBREC_Albdocprv = "" ;
      gxTv_SdtBC_ALBREC_Albrudas = DecimalUtil.ZERO ;
      gxTv_SdtBC_ALBREC_Almnom = "" ;
      gxTv_SdtBC_ALBREC_Albcolor = "" ;
      gxTv_SdtBC_ALBREC_Albopst = "" ;
      gxTv_SdtBC_ALBREC_Albopsc = "" ;
      gxTv_SdtBC_ALBREC_Alboc = "" ;
      gxTv_SdtBC_ALBREC_Albhdri = "" ;
      gxTv_SdtBC_ALBREC_Albnumb = "" ;
      gxTv_SdtBC_ALBREC_Albnumm = "" ;
      gxTv_SdtBC_ALBREC_Albancc = DecimalUtil.ZERO ;
      gxTv_SdtBC_ALBREC_Albanccr = DecimalUtil.ZERO ;
      gxTv_SdtBC_ALBREC_Albmaqtej = "" ;
      gxTv_SdtBC_ALBREC_Albpdac = "" ;
      gxTv_SdtBC_ALBREC_Albostj = "" ;
      gxTv_SdtBC_ALBREC_Cliest = "" ;
      gxTv_SdtBC_ALBREC_Alboekotex = "" ;
      gxTv_SdtBC_ALBREC_Albrent_3 = "" ;
      gxTv_SdtBC_ALBREC_Albrartlu = DecimalUtil.ZERO ;
      gxTv_SdtBC_ALBREC_Mode = "" ;
      gxTv_SdtBC_ALBREC_Emprcod_Z = "" ;
      gxTv_SdtBC_ALBREC_Emprnom_Z = "" ;
      gxTv_SdtBC_ALBREC_Clinom_Z = "" ;
      gxTv_SdtBC_ALBREC_Albref_Z = "" ;
      gxTv_SdtBC_ALBREC_Trnnom_Z = "" ;
      gxTv_SdtBC_ALBREC_Albrent_Z = "" ;
      gxTv_SdtBC_ALBREC_Albruni_Z = "" ;
      gxTv_SdtBC_ALBREC_Albrloc_Z = "" ;
      gxTv_SdtBC_ALBREC_Albrfen_Z = GXutil.nullDate() ;
      gxTv_SdtBC_ALBREC_Albrunient_Z = DecimalUtil.ZERO ;
      gxTv_SdtBC_ALBREC_Albrtam_Z = "" ;
      gxTv_SdtBC_ALBREC_Emp_item1_Z = "" ;
      gxTv_SdtBC_ALBREC_Albrreo_Z = "" ;
      gxTv_SdtBC_ALBREC_Albruniuti_Z = DecimalUtil.ZERO ;
      gxTv_SdtBC_ALBREC_Albrunireb_Z = DecimalUtil.ZERO ;
      gxTv_SdtBC_ALBREC_Albrunidis_Z = DecimalUtil.ZERO ;
      gxTv_SdtBC_ALBREC_Albrfecult_Z = GXutil.nullDate() ;
      gxTv_SdtBC_ALBREC_Tipentnom_Z = "" ;
      gxTv_SdtBC_ALBREC_Albrdes_Z = "" ;
      gxTv_SdtBC_ALBREC_Procenom_Z = "" ;
      gxTv_SdtBC_ALBREC_Albrefdsc_Z = "" ;
      gxTv_SdtBC_ALBREC_Albpmppza_Z = DecimalUtil.ZERO ;
      gxTv_SdtBC_ALBREC_Albrpre_Z = DecimalUtil.ZERO ;
      gxTv_SdtBC_ALBREC_Albraju_Z = DecimalUtil.ZERO ;
      gxTv_SdtBC_ALBREC_Albrent2_Z = "" ;
      gxTv_SdtBC_ALBREC_Albrusu_Z = "" ;
      gxTv_SdtBC_ALBREC_Albrhor_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtBC_ALBREC_Albrunic_Z = DecimalUtil.ZERO ;
      gxTv_SdtBC_ALBREC_Albrnf_Z = "" ;
      gxTv_SdtBC_ALBREC_Albrfenf_Z = GXutil.nullDate() ;
      gxTv_SdtBC_ALBREC_Albrcfop_Z = "" ;
      gxTv_SdtBC_ALBREC_Albrdiscli_Z = "" ;
      gxTv_SdtBC_ALBREC_Albrtartd_Z = "" ;
      gxTv_SdtBC_ALBREC_Albrimp_Z = "" ;
      gxTv_SdtBC_ALBREC_Albrlote_Z = "" ;
      gxTv_SdtBC_ALBREC_Albrtelar_Z = "" ;
      gxTv_SdtBC_ALBREC_Albrlot2_Z = "" ;
      gxTv_SdtBC_ALBREC_Albrlu_Z = DecimalUtil.ZERO ;
      gxTv_SdtBC_ALBREC_Albrmdlcod_Z = "" ;
      gxTv_SdtBC_ALBREC_Albrtara_Z = DecimalUtil.ZERO ;
      gxTv_SdtBC_ALBREC_Albrunib_Z = DecimalUtil.ZERO ;
      gxTv_SdtBC_ALBREC_Albdocprv_Z = "" ;
      gxTv_SdtBC_ALBREC_Albrudas_Z = DecimalUtil.ZERO ;
      gxTv_SdtBC_ALBREC_Almnom_Z = "" ;
      gxTv_SdtBC_ALBREC_Albcolor_Z = "" ;
      gxTv_SdtBC_ALBREC_Albopst_Z = "" ;
      gxTv_SdtBC_ALBREC_Albopsc_Z = "" ;
      gxTv_SdtBC_ALBREC_Alboc_Z = "" ;
      gxTv_SdtBC_ALBREC_Albhdri_Z = "" ;
      gxTv_SdtBC_ALBREC_Albnumb_Z = "" ;
      gxTv_SdtBC_ALBREC_Albnumm_Z = "" ;
      gxTv_SdtBC_ALBREC_Albancc_Z = DecimalUtil.ZERO ;
      gxTv_SdtBC_ALBREC_Albanccr_Z = DecimalUtil.ZERO ;
      gxTv_SdtBC_ALBREC_Albmaqtej_Z = "" ;
      gxTv_SdtBC_ALBREC_Albpdac_Z = "" ;
      gxTv_SdtBC_ALBREC_Albostj_Z = "" ;
      gxTv_SdtBC_ALBREC_Cliest_Z = "" ;
      gxTv_SdtBC_ALBREC_Alboekotex_Z = "" ;
      gxTv_SdtBC_ALBREC_Albrent_3_Z = "" ;
      gxTv_SdtBC_ALBREC_Albrartlu_Z = DecimalUtil.ZERO ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtBC_ALBREC_N ;
   }

   public app.SdtBC_ALBREC Clone( )
   {
      app.SdtBC_ALBREC sdt;
      app.bc_albrec_bc obj;
      sdt = (app.SdtBC_ALBREC)(clone()) ;
      obj = (app.bc_albrec_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( app.StructSdtBC_ALBREC struct )
   {
      setgxTv_SdtBC_ALBREC_Emprcod(struct.getEmprcod());
      setgxTv_SdtBC_ALBREC_Albreccod(struct.getAlbreccod());
      setgxTv_SdtBC_ALBREC_Emprnom(struct.getEmprnom());
      setgxTv_SdtBC_ALBREC_Clicod(struct.getClicod());
      setgxTv_SdtBC_ALBREC_Clinom(struct.getClinom());
      setgxTv_SdtBC_ALBREC_Albref(struct.getAlbref());
      setgxTv_SdtBC_ALBREC_Trncod(struct.getTrncod());
      setgxTv_SdtBC_ALBREC_Trnnom(struct.getTrnnom());
      setgxTv_SdtBC_ALBREC_Albrent(struct.getAlbrent());
      setgxTv_SdtBC_ALBREC_Albrpieent(struct.getAlbrpieent());
      setgxTv_SdtBC_ALBREC_Albruni(struct.getAlbruni());
      setgxTv_SdtBC_ALBREC_Albrloc(struct.getAlbrloc());
      setgxTv_SdtBC_ALBREC_Albrfen(struct.getAlbrfen());
      setgxTv_SdtBC_ALBREC_Albrunient(struct.getAlbrunient());
      setgxTv_SdtBC_ALBREC_Albrtam(struct.getAlbrtam());
      setgxTv_SdtBC_ALBREC_Emp_item1(struct.getEmp_item1());
      setgxTv_SdtBC_ALBREC_Albrreo(struct.getAlbrreo());
      setgxTv_SdtBC_ALBREC_Albrpieuti(struct.getAlbrpieuti());
      setgxTv_SdtBC_ALBREC_Albrpiereb(struct.getAlbrpiereb());
      setgxTv_SdtBC_ALBREC_Albruniuti(struct.getAlbruniuti());
      setgxTv_SdtBC_ALBREC_Albrunireb(struct.getAlbrunireb());
      setgxTv_SdtBC_ALBREC_Albrpiedis(struct.getAlbrpiedis());
      setgxTv_SdtBC_ALBREC_Albrunidis(struct.getAlbrunidis());
      setgxTv_SdtBC_ALBREC_Albrfecult(struct.getAlbrfecult());
      setgxTv_SdtBC_ALBREC_Albrest(struct.getAlbrest());
      setgxTv_SdtBC_ALBREC_Tipentcod(struct.getTipentcod());
      setgxTv_SdtBC_ALBREC_Tipentnom(struct.getTipentnom());
      setgxTv_SdtBC_ALBREC_Albnumeti(struct.getAlbnumeti());
      setgxTv_SdtBC_ALBREC_Albrdes(struct.getAlbrdes());
      setgxTv_SdtBC_ALBREC_Procecod(struct.getProcecod());
      setgxTv_SdtBC_ALBREC_Procenom(struct.getProcenom());
      setgxTv_SdtBC_ALBREC_Albrulin(struct.getAlbrulin());
      setgxTv_SdtBC_ALBREC_Albrefdsc(struct.getAlbrefdsc());
      setgxTv_SdtBC_ALBREC_Albpmppza(struct.getAlbpmppza());
      setgxTv_SdtBC_ALBREC_Albpzaest(struct.getAlbpzaest());
      setgxTv_SdtBC_ALBREC_Albrgrm2(struct.getAlbrgrm2());
      setgxTv_SdtBC_ALBREC_Albranc(struct.getAlbranc());
      setgxTv_SdtBC_ALBREC_Albpml(struct.getAlbpml());
      setgxTv_SdtBC_ALBREC_Albrpre(struct.getAlbrpre());
      setgxTv_SdtBC_ALBREC_Albraju(struct.getAlbraju());
      setgxTv_SdtBC_ALBREC_Albrrep(struct.getAlbrrep());
      setgxTv_SdtBC_ALBREC_Albrent2(struct.getAlbrent2());
      setgxTv_SdtBC_ALBREC_Albrusu(struct.getAlbrusu());
      setgxTv_SdtBC_ALBREC_Albrhor(struct.getAlbrhor());
      setgxTv_SdtBC_ALBREC_Albrunic(struct.getAlbrunic());
      setgxTv_SdtBC_ALBREC_Albrpiec(struct.getAlbrpiec());
      setgxTv_SdtBC_ALBREC_Albrnf(struct.getAlbrnf());
      setgxTv_SdtBC_ALBREC_Albrfenf(struct.getAlbrfenf());
      setgxTv_SdtBC_ALBREC_Albrcfop(struct.getAlbrcfop());
      setgxTv_SdtBC_ALBREC_Albrdiscli(struct.getAlbrdiscli());
      setgxTv_SdtBC_ALBREC_Albrtartc(struct.getAlbrtartc());
      setgxTv_SdtBC_ALBREC_Albrtartd(struct.getAlbrtartd());
      setgxTv_SdtBC_ALBREC_Albrimp(struct.getAlbrimp());
      setgxTv_SdtBC_ALBREC_Albrlote(struct.getAlbrlote());
      setgxTv_SdtBC_ALBREC_Albrtelar(struct.getAlbrtelar());
      setgxTv_SdtBC_ALBREC_Albrlot2(struct.getAlbrlot2());
      setgxTv_SdtBC_ALBREC_Albrlu(struct.getAlbrlu());
      setgxTv_SdtBC_ALBREC_Albrmdlcod(struct.getAlbrmdlcod());
      setgxTv_SdtBC_ALBREC_Albrtara(struct.getAlbrtara());
      setgxTv_SdtBC_ALBREC_Albrunib(struct.getAlbrunib());
      setgxTv_SdtBC_ALBREC_Albdocprv(struct.getAlbdocprv());
      setgxTv_SdtBC_ALBREC_Albrudas(struct.getAlbrudas());
      setgxTv_SdtBC_ALBREC_Almcod(struct.getAlmcod());
      setgxTv_SdtBC_ALBREC_Almnom(struct.getAlmnom());
      setgxTv_SdtBC_ALBREC_Albcolor(struct.getAlbcolor());
      setgxTv_SdtBC_ALBREC_Albopst(struct.getAlbopst());
      setgxTv_SdtBC_ALBREC_Albopsc(struct.getAlbopsc());
      setgxTv_SdtBC_ALBREC_Alboc(struct.getAlboc());
      setgxTv_SdtBC_ALBREC_Albhdri(struct.getAlbhdri());
      setgxTv_SdtBC_ALBREC_Albnumb(struct.getAlbnumb());
      setgxTv_SdtBC_ALBREC_Albnumm(struct.getAlbnumm());
      setgxTv_SdtBC_ALBREC_Albancc(struct.getAlbancc());
      setgxTv_SdtBC_ALBREC_Albdndc(struct.getAlbdndc());
      setgxTv_SdtBC_ALBREC_Albanccr(struct.getAlbanccr());
      setgxTv_SdtBC_ALBREC_Albdndcr(struct.getAlbdndcr());
      setgxTv_SdtBC_ALBREC_Albgalga(struct.getAlbgalga());
      setgxTv_SdtBC_ALBREC_Albmaqtej(struct.getAlbmaqtej());
      setgxTv_SdtBC_ALBREC_Albdmt(struct.getAlbdmt());
      setgxTv_SdtBC_ALBREC_Albpdac(struct.getAlbpdac());
      setgxTv_SdtBC_ALBREC_Albostj(struct.getAlbostj());
      setgxTv_SdtBC_ALBREC_Albstlot(struct.getAlbstlot());
      setgxTv_SdtBC_ALBREC_Albturno(struct.getAlbturno());
      setgxTv_SdtBC_ALBREC_Cliest(struct.getCliest());
      setgxTv_SdtBC_ALBREC_Alboekotex(struct.getAlboekotex());
      setgxTv_SdtBC_ALBREC_Albrent_3(struct.getAlbrent_3());
      setgxTv_SdtBC_ALBREC_Albrartlu(struct.getAlbrartlu());
      GXBCLevelCollection<app.SdtBC_ALBREC_Level1Item> gxTv_SdtBC_ALBREC_Level1_aux = new GXBCLevelCollection<app.SdtBC_ALBREC_Level1Item>(app.SdtBC_ALBREC_Level1Item.class, "BC_ALBREC.Level1Item", "TexplusNET", remoteHandle);
      Vector<app.StructSdtBC_ALBREC_Level1Item> gxTv_SdtBC_ALBREC_Level1_aux1 = struct.getLevel1();
      if (gxTv_SdtBC_ALBREC_Level1_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtBC_ALBREC_Level1_aux1.size(); i++)
         {
            gxTv_SdtBC_ALBREC_Level1_aux.add(new app.SdtBC_ALBREC_Level1Item(remoteHandle, gxTv_SdtBC_ALBREC_Level1_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtBC_ALBREC_Level1(gxTv_SdtBC_ALBREC_Level1_aux);
      setgxTv_SdtBC_ALBREC_Mode(struct.getMode());
      setgxTv_SdtBC_ALBREC_Initialized(struct.getInitialized());
      setgxTv_SdtBC_ALBREC_Emprcod_Z(struct.getEmprcod_Z());
      setgxTv_SdtBC_ALBREC_Albreccod_Z(struct.getAlbreccod_Z());
      setgxTv_SdtBC_ALBREC_Emprnom_Z(struct.getEmprnom_Z());
      setgxTv_SdtBC_ALBREC_Clicod_Z(struct.getClicod_Z());
      setgxTv_SdtBC_ALBREC_Clinom_Z(struct.getClinom_Z());
      setgxTv_SdtBC_ALBREC_Albref_Z(struct.getAlbref_Z());
      setgxTv_SdtBC_ALBREC_Trncod_Z(struct.getTrncod_Z());
      setgxTv_SdtBC_ALBREC_Trnnom_Z(struct.getTrnnom_Z());
      setgxTv_SdtBC_ALBREC_Albrent_Z(struct.getAlbrent_Z());
      setgxTv_SdtBC_ALBREC_Albrpieent_Z(struct.getAlbrpieent_Z());
      setgxTv_SdtBC_ALBREC_Albruni_Z(struct.getAlbruni_Z());
      setgxTv_SdtBC_ALBREC_Albrloc_Z(struct.getAlbrloc_Z());
      setgxTv_SdtBC_ALBREC_Albrfen_Z(struct.getAlbrfen_Z());
      setgxTv_SdtBC_ALBREC_Albrunient_Z(struct.getAlbrunient_Z());
      setgxTv_SdtBC_ALBREC_Albrtam_Z(struct.getAlbrtam_Z());
      setgxTv_SdtBC_ALBREC_Emp_item1_Z(struct.getEmp_item1_Z());
      setgxTv_SdtBC_ALBREC_Albrreo_Z(struct.getAlbrreo_Z());
      setgxTv_SdtBC_ALBREC_Albrpieuti_Z(struct.getAlbrpieuti_Z());
      setgxTv_SdtBC_ALBREC_Albrpiereb_Z(struct.getAlbrpiereb_Z());
      setgxTv_SdtBC_ALBREC_Albruniuti_Z(struct.getAlbruniuti_Z());
      setgxTv_SdtBC_ALBREC_Albrunireb_Z(struct.getAlbrunireb_Z());
      setgxTv_SdtBC_ALBREC_Albrpiedis_Z(struct.getAlbrpiedis_Z());
      setgxTv_SdtBC_ALBREC_Albrunidis_Z(struct.getAlbrunidis_Z());
      setgxTv_SdtBC_ALBREC_Albrfecult_Z(struct.getAlbrfecult_Z());
      setgxTv_SdtBC_ALBREC_Albrest_Z(struct.getAlbrest_Z());
      setgxTv_SdtBC_ALBREC_Tipentcod_Z(struct.getTipentcod_Z());
      setgxTv_SdtBC_ALBREC_Tipentnom_Z(struct.getTipentnom_Z());
      setgxTv_SdtBC_ALBREC_Albnumeti_Z(struct.getAlbnumeti_Z());
      setgxTv_SdtBC_ALBREC_Albrdes_Z(struct.getAlbrdes_Z());
      setgxTv_SdtBC_ALBREC_Procecod_Z(struct.getProcecod_Z());
      setgxTv_SdtBC_ALBREC_Procenom_Z(struct.getProcenom_Z());
      setgxTv_SdtBC_ALBREC_Albrulin_Z(struct.getAlbrulin_Z());
      setgxTv_SdtBC_ALBREC_Albrefdsc_Z(struct.getAlbrefdsc_Z());
      setgxTv_SdtBC_ALBREC_Albpmppza_Z(struct.getAlbpmppza_Z());
      setgxTv_SdtBC_ALBREC_Albpzaest_Z(struct.getAlbpzaest_Z());
      setgxTv_SdtBC_ALBREC_Albrgrm2_Z(struct.getAlbrgrm2_Z());
      setgxTv_SdtBC_ALBREC_Albranc_Z(struct.getAlbranc_Z());
      setgxTv_SdtBC_ALBREC_Albpml_Z(struct.getAlbpml_Z());
      setgxTv_SdtBC_ALBREC_Albrpre_Z(struct.getAlbrpre_Z());
      setgxTv_SdtBC_ALBREC_Albraju_Z(struct.getAlbraju_Z());
      setgxTv_SdtBC_ALBREC_Albrrep_Z(struct.getAlbrrep_Z());
      setgxTv_SdtBC_ALBREC_Albrent2_Z(struct.getAlbrent2_Z());
      setgxTv_SdtBC_ALBREC_Albrusu_Z(struct.getAlbrusu_Z());
      setgxTv_SdtBC_ALBREC_Albrhor_Z(struct.getAlbrhor_Z());
      setgxTv_SdtBC_ALBREC_Albrunic_Z(struct.getAlbrunic_Z());
      setgxTv_SdtBC_ALBREC_Albrpiec_Z(struct.getAlbrpiec_Z());
      setgxTv_SdtBC_ALBREC_Albrnf_Z(struct.getAlbrnf_Z());
      setgxTv_SdtBC_ALBREC_Albrfenf_Z(struct.getAlbrfenf_Z());
      setgxTv_SdtBC_ALBREC_Albrcfop_Z(struct.getAlbrcfop_Z());
      setgxTv_SdtBC_ALBREC_Albrdiscli_Z(struct.getAlbrdiscli_Z());
      setgxTv_SdtBC_ALBREC_Albrtartc_Z(struct.getAlbrtartc_Z());
      setgxTv_SdtBC_ALBREC_Albrtartd_Z(struct.getAlbrtartd_Z());
      setgxTv_SdtBC_ALBREC_Albrimp_Z(struct.getAlbrimp_Z());
      setgxTv_SdtBC_ALBREC_Albrlote_Z(struct.getAlbrlote_Z());
      setgxTv_SdtBC_ALBREC_Albrtelar_Z(struct.getAlbrtelar_Z());
      setgxTv_SdtBC_ALBREC_Albrlot2_Z(struct.getAlbrlot2_Z());
      setgxTv_SdtBC_ALBREC_Albrlu_Z(struct.getAlbrlu_Z());
      setgxTv_SdtBC_ALBREC_Albrmdlcod_Z(struct.getAlbrmdlcod_Z());
      setgxTv_SdtBC_ALBREC_Albrtara_Z(struct.getAlbrtara_Z());
      setgxTv_SdtBC_ALBREC_Albrunib_Z(struct.getAlbrunib_Z());
      setgxTv_SdtBC_ALBREC_Albdocprv_Z(struct.getAlbdocprv_Z());
      setgxTv_SdtBC_ALBREC_Albrudas_Z(struct.getAlbrudas_Z());
      setgxTv_SdtBC_ALBREC_Almcod_Z(struct.getAlmcod_Z());
      setgxTv_SdtBC_ALBREC_Almnom_Z(struct.getAlmnom_Z());
      setgxTv_SdtBC_ALBREC_Albcolor_Z(struct.getAlbcolor_Z());
      setgxTv_SdtBC_ALBREC_Albopst_Z(struct.getAlbopst_Z());
      setgxTv_SdtBC_ALBREC_Albopsc_Z(struct.getAlbopsc_Z());
      setgxTv_SdtBC_ALBREC_Alboc_Z(struct.getAlboc_Z());
      setgxTv_SdtBC_ALBREC_Albhdri_Z(struct.getAlbhdri_Z());
      setgxTv_SdtBC_ALBREC_Albnumb_Z(struct.getAlbnumb_Z());
      setgxTv_SdtBC_ALBREC_Albnumm_Z(struct.getAlbnumm_Z());
      setgxTv_SdtBC_ALBREC_Albancc_Z(struct.getAlbancc_Z());
      setgxTv_SdtBC_ALBREC_Albdndc_Z(struct.getAlbdndc_Z());
      setgxTv_SdtBC_ALBREC_Albanccr_Z(struct.getAlbanccr_Z());
      setgxTv_SdtBC_ALBREC_Albdndcr_Z(struct.getAlbdndcr_Z());
      setgxTv_SdtBC_ALBREC_Albgalga_Z(struct.getAlbgalga_Z());
      setgxTv_SdtBC_ALBREC_Albmaqtej_Z(struct.getAlbmaqtej_Z());
      setgxTv_SdtBC_ALBREC_Albdmt_Z(struct.getAlbdmt_Z());
      setgxTv_SdtBC_ALBREC_Albpdac_Z(struct.getAlbpdac_Z());
      setgxTv_SdtBC_ALBREC_Albostj_Z(struct.getAlbostj_Z());
      setgxTv_SdtBC_ALBREC_Albstlot_Z(struct.getAlbstlot_Z());
      setgxTv_SdtBC_ALBREC_Albturno_Z(struct.getAlbturno_Z());
      setgxTv_SdtBC_ALBREC_Cliest_Z(struct.getCliest_Z());
      setgxTv_SdtBC_ALBREC_Alboekotex_Z(struct.getAlboekotex_Z());
      setgxTv_SdtBC_ALBREC_Albrent_3_Z(struct.getAlbrent_3_Z());
      setgxTv_SdtBC_ALBREC_Albrartlu_Z(struct.getAlbrartlu_Z());
      setgxTv_SdtBC_ALBREC_Albreccod_N(struct.getAlbreccod_N());
      setgxTv_SdtBC_ALBREC_Emprnom_N(struct.getEmprnom_N());
      setgxTv_SdtBC_ALBREC_Trncod_N(struct.getTrncod_N());
      setgxTv_SdtBC_ALBREC_Trnnom_N(struct.getTrnnom_N());
      setgxTv_SdtBC_ALBREC_Tipentcod_N(struct.getTipentcod_N());
      setgxTv_SdtBC_ALBREC_Tipentnom_N(struct.getTipentnom_N());
      setgxTv_SdtBC_ALBREC_Procecod_N(struct.getProcecod_N());
      setgxTv_SdtBC_ALBREC_Procenom_N(struct.getProcenom_N());
      setgxTv_SdtBC_ALBREC_Albrtartc_N(struct.getAlbrtartc_N());
      setgxTv_SdtBC_ALBREC_Albrtartd_N(struct.getAlbrtartd_N());
      setgxTv_SdtBC_ALBREC_Almcod_N(struct.getAlmcod_N());
      setgxTv_SdtBC_ALBREC_Almnom_N(struct.getAlmnom_N());
      setgxTv_SdtBC_ALBREC_Albrartlu_N(struct.getAlbrartlu_N());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtBC_ALBREC getStruct( )
   {
      app.StructSdtBC_ALBREC struct = new app.StructSdtBC_ALBREC ();
      struct.setEmprcod(getgxTv_SdtBC_ALBREC_Emprcod());
      struct.setAlbreccod(getgxTv_SdtBC_ALBREC_Albreccod());
      struct.setEmprnom(getgxTv_SdtBC_ALBREC_Emprnom());
      struct.setClicod(getgxTv_SdtBC_ALBREC_Clicod());
      struct.setClinom(getgxTv_SdtBC_ALBREC_Clinom());
      struct.setAlbref(getgxTv_SdtBC_ALBREC_Albref());
      struct.setTrncod(getgxTv_SdtBC_ALBREC_Trncod());
      struct.setTrnnom(getgxTv_SdtBC_ALBREC_Trnnom());
      struct.setAlbrent(getgxTv_SdtBC_ALBREC_Albrent());
      struct.setAlbrpieent(getgxTv_SdtBC_ALBREC_Albrpieent());
      struct.setAlbruni(getgxTv_SdtBC_ALBREC_Albruni());
      struct.setAlbrloc(getgxTv_SdtBC_ALBREC_Albrloc());
      struct.setAlbrfen(getgxTv_SdtBC_ALBREC_Albrfen());
      struct.setAlbrunient(getgxTv_SdtBC_ALBREC_Albrunient());
      struct.setAlbrtam(getgxTv_SdtBC_ALBREC_Albrtam());
      struct.setEmp_item1(getgxTv_SdtBC_ALBREC_Emp_item1());
      struct.setAlbrreo(getgxTv_SdtBC_ALBREC_Albrreo());
      struct.setAlbrpieuti(getgxTv_SdtBC_ALBREC_Albrpieuti());
      struct.setAlbrpiereb(getgxTv_SdtBC_ALBREC_Albrpiereb());
      struct.setAlbruniuti(getgxTv_SdtBC_ALBREC_Albruniuti());
      struct.setAlbrunireb(getgxTv_SdtBC_ALBREC_Albrunireb());
      struct.setAlbrpiedis(getgxTv_SdtBC_ALBREC_Albrpiedis());
      struct.setAlbrunidis(getgxTv_SdtBC_ALBREC_Albrunidis());
      struct.setAlbrfecult(getgxTv_SdtBC_ALBREC_Albrfecult());
      struct.setAlbrest(getgxTv_SdtBC_ALBREC_Albrest());
      struct.setTipentcod(getgxTv_SdtBC_ALBREC_Tipentcod());
      struct.setTipentnom(getgxTv_SdtBC_ALBREC_Tipentnom());
      struct.setAlbnumeti(getgxTv_SdtBC_ALBREC_Albnumeti());
      struct.setAlbrdes(getgxTv_SdtBC_ALBREC_Albrdes());
      struct.setProcecod(getgxTv_SdtBC_ALBREC_Procecod());
      struct.setProcenom(getgxTv_SdtBC_ALBREC_Procenom());
      struct.setAlbrulin(getgxTv_SdtBC_ALBREC_Albrulin());
      struct.setAlbrefdsc(getgxTv_SdtBC_ALBREC_Albrefdsc());
      struct.setAlbpmppza(getgxTv_SdtBC_ALBREC_Albpmppza());
      struct.setAlbpzaest(getgxTv_SdtBC_ALBREC_Albpzaest());
      struct.setAlbrgrm2(getgxTv_SdtBC_ALBREC_Albrgrm2());
      struct.setAlbranc(getgxTv_SdtBC_ALBREC_Albranc());
      struct.setAlbpml(getgxTv_SdtBC_ALBREC_Albpml());
      struct.setAlbrpre(getgxTv_SdtBC_ALBREC_Albrpre());
      struct.setAlbraju(getgxTv_SdtBC_ALBREC_Albraju());
      struct.setAlbrrep(getgxTv_SdtBC_ALBREC_Albrrep());
      struct.setAlbrent2(getgxTv_SdtBC_ALBREC_Albrent2());
      struct.setAlbrusu(getgxTv_SdtBC_ALBREC_Albrusu());
      struct.setAlbrhor(getgxTv_SdtBC_ALBREC_Albrhor());
      struct.setAlbrunic(getgxTv_SdtBC_ALBREC_Albrunic());
      struct.setAlbrpiec(getgxTv_SdtBC_ALBREC_Albrpiec());
      struct.setAlbrnf(getgxTv_SdtBC_ALBREC_Albrnf());
      struct.setAlbrfenf(getgxTv_SdtBC_ALBREC_Albrfenf());
      struct.setAlbrcfop(getgxTv_SdtBC_ALBREC_Albrcfop());
      struct.setAlbrdiscli(getgxTv_SdtBC_ALBREC_Albrdiscli());
      struct.setAlbrtartc(getgxTv_SdtBC_ALBREC_Albrtartc());
      struct.setAlbrtartd(getgxTv_SdtBC_ALBREC_Albrtartd());
      struct.setAlbrimp(getgxTv_SdtBC_ALBREC_Albrimp());
      struct.setAlbrlote(getgxTv_SdtBC_ALBREC_Albrlote());
      struct.setAlbrtelar(getgxTv_SdtBC_ALBREC_Albrtelar());
      struct.setAlbrlot2(getgxTv_SdtBC_ALBREC_Albrlot2());
      struct.setAlbrlu(getgxTv_SdtBC_ALBREC_Albrlu());
      struct.setAlbrmdlcod(getgxTv_SdtBC_ALBREC_Albrmdlcod());
      struct.setAlbrtara(getgxTv_SdtBC_ALBREC_Albrtara());
      struct.setAlbrunib(getgxTv_SdtBC_ALBREC_Albrunib());
      struct.setAlbdocprv(getgxTv_SdtBC_ALBREC_Albdocprv());
      struct.setAlbrudas(getgxTv_SdtBC_ALBREC_Albrudas());
      struct.setAlmcod(getgxTv_SdtBC_ALBREC_Almcod());
      struct.setAlmnom(getgxTv_SdtBC_ALBREC_Almnom());
      struct.setAlbcolor(getgxTv_SdtBC_ALBREC_Albcolor());
      struct.setAlbopst(getgxTv_SdtBC_ALBREC_Albopst());
      struct.setAlbopsc(getgxTv_SdtBC_ALBREC_Albopsc());
      struct.setAlboc(getgxTv_SdtBC_ALBREC_Alboc());
      struct.setAlbhdri(getgxTv_SdtBC_ALBREC_Albhdri());
      struct.setAlbnumb(getgxTv_SdtBC_ALBREC_Albnumb());
      struct.setAlbnumm(getgxTv_SdtBC_ALBREC_Albnumm());
      struct.setAlbancc(getgxTv_SdtBC_ALBREC_Albancc());
      struct.setAlbdndc(getgxTv_SdtBC_ALBREC_Albdndc());
      struct.setAlbanccr(getgxTv_SdtBC_ALBREC_Albanccr());
      struct.setAlbdndcr(getgxTv_SdtBC_ALBREC_Albdndcr());
      struct.setAlbgalga(getgxTv_SdtBC_ALBREC_Albgalga());
      struct.setAlbmaqtej(getgxTv_SdtBC_ALBREC_Albmaqtej());
      struct.setAlbdmt(getgxTv_SdtBC_ALBREC_Albdmt());
      struct.setAlbpdac(getgxTv_SdtBC_ALBREC_Albpdac());
      struct.setAlbostj(getgxTv_SdtBC_ALBREC_Albostj());
      struct.setAlbstlot(getgxTv_SdtBC_ALBREC_Albstlot());
      struct.setAlbturno(getgxTv_SdtBC_ALBREC_Albturno());
      struct.setCliest(getgxTv_SdtBC_ALBREC_Cliest());
      struct.setAlboekotex(getgxTv_SdtBC_ALBREC_Alboekotex());
      struct.setAlbrent_3(getgxTv_SdtBC_ALBREC_Albrent_3());
      struct.setAlbrartlu(getgxTv_SdtBC_ALBREC_Albrartlu());
      struct.setLevel1(getgxTv_SdtBC_ALBREC_Level1().getStruct());
      struct.setMode(getgxTv_SdtBC_ALBREC_Mode());
      struct.setInitialized(getgxTv_SdtBC_ALBREC_Initialized());
      struct.setEmprcod_Z(getgxTv_SdtBC_ALBREC_Emprcod_Z());
      struct.setAlbreccod_Z(getgxTv_SdtBC_ALBREC_Albreccod_Z());
      struct.setEmprnom_Z(getgxTv_SdtBC_ALBREC_Emprnom_Z());
      struct.setClicod_Z(getgxTv_SdtBC_ALBREC_Clicod_Z());
      struct.setClinom_Z(getgxTv_SdtBC_ALBREC_Clinom_Z());
      struct.setAlbref_Z(getgxTv_SdtBC_ALBREC_Albref_Z());
      struct.setTrncod_Z(getgxTv_SdtBC_ALBREC_Trncod_Z());
      struct.setTrnnom_Z(getgxTv_SdtBC_ALBREC_Trnnom_Z());
      struct.setAlbrent_Z(getgxTv_SdtBC_ALBREC_Albrent_Z());
      struct.setAlbrpieent_Z(getgxTv_SdtBC_ALBREC_Albrpieent_Z());
      struct.setAlbruni_Z(getgxTv_SdtBC_ALBREC_Albruni_Z());
      struct.setAlbrloc_Z(getgxTv_SdtBC_ALBREC_Albrloc_Z());
      struct.setAlbrfen_Z(getgxTv_SdtBC_ALBREC_Albrfen_Z());
      struct.setAlbrunient_Z(getgxTv_SdtBC_ALBREC_Albrunient_Z());
      struct.setAlbrtam_Z(getgxTv_SdtBC_ALBREC_Albrtam_Z());
      struct.setEmp_item1_Z(getgxTv_SdtBC_ALBREC_Emp_item1_Z());
      struct.setAlbrreo_Z(getgxTv_SdtBC_ALBREC_Albrreo_Z());
      struct.setAlbrpieuti_Z(getgxTv_SdtBC_ALBREC_Albrpieuti_Z());
      struct.setAlbrpiereb_Z(getgxTv_SdtBC_ALBREC_Albrpiereb_Z());
      struct.setAlbruniuti_Z(getgxTv_SdtBC_ALBREC_Albruniuti_Z());
      struct.setAlbrunireb_Z(getgxTv_SdtBC_ALBREC_Albrunireb_Z());
      struct.setAlbrpiedis_Z(getgxTv_SdtBC_ALBREC_Albrpiedis_Z());
      struct.setAlbrunidis_Z(getgxTv_SdtBC_ALBREC_Albrunidis_Z());
      struct.setAlbrfecult_Z(getgxTv_SdtBC_ALBREC_Albrfecult_Z());
      struct.setAlbrest_Z(getgxTv_SdtBC_ALBREC_Albrest_Z());
      struct.setTipentcod_Z(getgxTv_SdtBC_ALBREC_Tipentcod_Z());
      struct.setTipentnom_Z(getgxTv_SdtBC_ALBREC_Tipentnom_Z());
      struct.setAlbnumeti_Z(getgxTv_SdtBC_ALBREC_Albnumeti_Z());
      struct.setAlbrdes_Z(getgxTv_SdtBC_ALBREC_Albrdes_Z());
      struct.setProcecod_Z(getgxTv_SdtBC_ALBREC_Procecod_Z());
      struct.setProcenom_Z(getgxTv_SdtBC_ALBREC_Procenom_Z());
      struct.setAlbrulin_Z(getgxTv_SdtBC_ALBREC_Albrulin_Z());
      struct.setAlbrefdsc_Z(getgxTv_SdtBC_ALBREC_Albrefdsc_Z());
      struct.setAlbpmppza_Z(getgxTv_SdtBC_ALBREC_Albpmppza_Z());
      struct.setAlbpzaest_Z(getgxTv_SdtBC_ALBREC_Albpzaest_Z());
      struct.setAlbrgrm2_Z(getgxTv_SdtBC_ALBREC_Albrgrm2_Z());
      struct.setAlbranc_Z(getgxTv_SdtBC_ALBREC_Albranc_Z());
      struct.setAlbpml_Z(getgxTv_SdtBC_ALBREC_Albpml_Z());
      struct.setAlbrpre_Z(getgxTv_SdtBC_ALBREC_Albrpre_Z());
      struct.setAlbraju_Z(getgxTv_SdtBC_ALBREC_Albraju_Z());
      struct.setAlbrrep_Z(getgxTv_SdtBC_ALBREC_Albrrep_Z());
      struct.setAlbrent2_Z(getgxTv_SdtBC_ALBREC_Albrent2_Z());
      struct.setAlbrusu_Z(getgxTv_SdtBC_ALBREC_Albrusu_Z());
      struct.setAlbrhor_Z(getgxTv_SdtBC_ALBREC_Albrhor_Z());
      struct.setAlbrunic_Z(getgxTv_SdtBC_ALBREC_Albrunic_Z());
      struct.setAlbrpiec_Z(getgxTv_SdtBC_ALBREC_Albrpiec_Z());
      struct.setAlbrnf_Z(getgxTv_SdtBC_ALBREC_Albrnf_Z());
      struct.setAlbrfenf_Z(getgxTv_SdtBC_ALBREC_Albrfenf_Z());
      struct.setAlbrcfop_Z(getgxTv_SdtBC_ALBREC_Albrcfop_Z());
      struct.setAlbrdiscli_Z(getgxTv_SdtBC_ALBREC_Albrdiscli_Z());
      struct.setAlbrtartc_Z(getgxTv_SdtBC_ALBREC_Albrtartc_Z());
      struct.setAlbrtartd_Z(getgxTv_SdtBC_ALBREC_Albrtartd_Z());
      struct.setAlbrimp_Z(getgxTv_SdtBC_ALBREC_Albrimp_Z());
      struct.setAlbrlote_Z(getgxTv_SdtBC_ALBREC_Albrlote_Z());
      struct.setAlbrtelar_Z(getgxTv_SdtBC_ALBREC_Albrtelar_Z());
      struct.setAlbrlot2_Z(getgxTv_SdtBC_ALBREC_Albrlot2_Z());
      struct.setAlbrlu_Z(getgxTv_SdtBC_ALBREC_Albrlu_Z());
      struct.setAlbrmdlcod_Z(getgxTv_SdtBC_ALBREC_Albrmdlcod_Z());
      struct.setAlbrtara_Z(getgxTv_SdtBC_ALBREC_Albrtara_Z());
      struct.setAlbrunib_Z(getgxTv_SdtBC_ALBREC_Albrunib_Z());
      struct.setAlbdocprv_Z(getgxTv_SdtBC_ALBREC_Albdocprv_Z());
      struct.setAlbrudas_Z(getgxTv_SdtBC_ALBREC_Albrudas_Z());
      struct.setAlmcod_Z(getgxTv_SdtBC_ALBREC_Almcod_Z());
      struct.setAlmnom_Z(getgxTv_SdtBC_ALBREC_Almnom_Z());
      struct.setAlbcolor_Z(getgxTv_SdtBC_ALBREC_Albcolor_Z());
      struct.setAlbopst_Z(getgxTv_SdtBC_ALBREC_Albopst_Z());
      struct.setAlbopsc_Z(getgxTv_SdtBC_ALBREC_Albopsc_Z());
      struct.setAlboc_Z(getgxTv_SdtBC_ALBREC_Alboc_Z());
      struct.setAlbhdri_Z(getgxTv_SdtBC_ALBREC_Albhdri_Z());
      struct.setAlbnumb_Z(getgxTv_SdtBC_ALBREC_Albnumb_Z());
      struct.setAlbnumm_Z(getgxTv_SdtBC_ALBREC_Albnumm_Z());
      struct.setAlbancc_Z(getgxTv_SdtBC_ALBREC_Albancc_Z());
      struct.setAlbdndc_Z(getgxTv_SdtBC_ALBREC_Albdndc_Z());
      struct.setAlbanccr_Z(getgxTv_SdtBC_ALBREC_Albanccr_Z());
      struct.setAlbdndcr_Z(getgxTv_SdtBC_ALBREC_Albdndcr_Z());
      struct.setAlbgalga_Z(getgxTv_SdtBC_ALBREC_Albgalga_Z());
      struct.setAlbmaqtej_Z(getgxTv_SdtBC_ALBREC_Albmaqtej_Z());
      struct.setAlbdmt_Z(getgxTv_SdtBC_ALBREC_Albdmt_Z());
      struct.setAlbpdac_Z(getgxTv_SdtBC_ALBREC_Albpdac_Z());
      struct.setAlbostj_Z(getgxTv_SdtBC_ALBREC_Albostj_Z());
      struct.setAlbstlot_Z(getgxTv_SdtBC_ALBREC_Albstlot_Z());
      struct.setAlbturno_Z(getgxTv_SdtBC_ALBREC_Albturno_Z());
      struct.setCliest_Z(getgxTv_SdtBC_ALBREC_Cliest_Z());
      struct.setAlboekotex_Z(getgxTv_SdtBC_ALBREC_Alboekotex_Z());
      struct.setAlbrent_3_Z(getgxTv_SdtBC_ALBREC_Albrent_3_Z());
      struct.setAlbrartlu_Z(getgxTv_SdtBC_ALBREC_Albrartlu_Z());
      struct.setAlbreccod_N(getgxTv_SdtBC_ALBREC_Albreccod_N());
      struct.setEmprnom_N(getgxTv_SdtBC_ALBREC_Emprnom_N());
      struct.setTrncod_N(getgxTv_SdtBC_ALBREC_Trncod_N());
      struct.setTrnnom_N(getgxTv_SdtBC_ALBREC_Trnnom_N());
      struct.setTipentcod_N(getgxTv_SdtBC_ALBREC_Tipentcod_N());
      struct.setTipentnom_N(getgxTv_SdtBC_ALBREC_Tipentnom_N());
      struct.setProcecod_N(getgxTv_SdtBC_ALBREC_Procecod_N());
      struct.setProcenom_N(getgxTv_SdtBC_ALBREC_Procenom_N());
      struct.setAlbrtartc_N(getgxTv_SdtBC_ALBREC_Albrtartc_N());
      struct.setAlbrtartd_N(getgxTv_SdtBC_ALBREC_Albrtartd_N());
      struct.setAlmcod_N(getgxTv_SdtBC_ALBREC_Almcod_N());
      struct.setAlmnom_N(getgxTv_SdtBC_ALBREC_Almnom_N());
      struct.setAlbrartlu_N(getgxTv_SdtBC_ALBREC_Albrartlu_N());
      return struct ;
   }

   private byte gxTv_SdtBC_ALBREC_N ;
   private byte gxTv_SdtBC_ALBREC_Albrest ;
   private byte gxTv_SdtBC_ALBREC_Albrulin ;
   private byte gxTv_SdtBC_ALBREC_Albrrep ;
   private byte gxTv_SdtBC_ALBREC_Almcod ;
   private byte gxTv_SdtBC_ALBREC_Albstlot ;
   private byte gxTv_SdtBC_ALBREC_Albturno ;
   private byte gxTv_SdtBC_ALBREC_Albrest_Z ;
   private byte gxTv_SdtBC_ALBREC_Albrulin_Z ;
   private byte gxTv_SdtBC_ALBREC_Albrrep_Z ;
   private byte gxTv_SdtBC_ALBREC_Almcod_Z ;
   private byte gxTv_SdtBC_ALBREC_Albstlot_Z ;
   private byte gxTv_SdtBC_ALBREC_Albturno_Z ;
   private byte gxTv_SdtBC_ALBREC_Albreccod_N ;
   private byte gxTv_SdtBC_ALBREC_Emprnom_N ;
   private byte gxTv_SdtBC_ALBREC_Trncod_N ;
   private byte gxTv_SdtBC_ALBREC_Trnnom_N ;
   private byte gxTv_SdtBC_ALBREC_Tipentcod_N ;
   private byte gxTv_SdtBC_ALBREC_Tipentnom_N ;
   private byte gxTv_SdtBC_ALBREC_Procecod_N ;
   private byte gxTv_SdtBC_ALBREC_Procenom_N ;
   private byte gxTv_SdtBC_ALBREC_Albrtartc_N ;
   private byte gxTv_SdtBC_ALBREC_Albrtartd_N ;
   private byte gxTv_SdtBC_ALBREC_Almcod_N ;
   private byte gxTv_SdtBC_ALBREC_Almnom_N ;
   private byte gxTv_SdtBC_ALBREC_Albrartlu_N ;
   private short gxTv_SdtBC_ALBREC_Trncod ;
   private short gxTv_SdtBC_ALBREC_Tipentcod ;
   private short gxTv_SdtBC_ALBREC_Albnumeti ;
   private short gxTv_SdtBC_ALBREC_Procecod ;
   private short gxTv_SdtBC_ALBREC_Albrgrm2 ;
   private short gxTv_SdtBC_ALBREC_Albranc ;
   private short gxTv_SdtBC_ALBREC_Albpml ;
   private short gxTv_SdtBC_ALBREC_Albrtartc ;
   private short gxTv_SdtBC_ALBREC_Albdndc ;
   private short gxTv_SdtBC_ALBREC_Albdndcr ;
   private short gxTv_SdtBC_ALBREC_Albgalga ;
   private short gxTv_SdtBC_ALBREC_Albdmt ;
   private short gxTv_SdtBC_ALBREC_Initialized ;
   private short gxTv_SdtBC_ALBREC_Trncod_Z ;
   private short gxTv_SdtBC_ALBREC_Tipentcod_Z ;
   private short gxTv_SdtBC_ALBREC_Albnumeti_Z ;
   private short gxTv_SdtBC_ALBREC_Procecod_Z ;
   private short gxTv_SdtBC_ALBREC_Albrgrm2_Z ;
   private short gxTv_SdtBC_ALBREC_Albranc_Z ;
   private short gxTv_SdtBC_ALBREC_Albpml_Z ;
   private short gxTv_SdtBC_ALBREC_Albrtartc_Z ;
   private short gxTv_SdtBC_ALBREC_Albdndc_Z ;
   private short gxTv_SdtBC_ALBREC_Albdndcr_Z ;
   private short gxTv_SdtBC_ALBREC_Albgalga_Z ;
   private short gxTv_SdtBC_ALBREC_Albdmt_Z ;
   private short readOk ;
   private short nOutParmCount ;
   private int gxTv_SdtBC_ALBREC_Albreccod ;
   private int gxTv_SdtBC_ALBREC_Clicod ;
   private int gxTv_SdtBC_ALBREC_Albrpieent ;
   private int gxTv_SdtBC_ALBREC_Albrpieuti ;
   private int gxTv_SdtBC_ALBREC_Albrpiereb ;
   private int gxTv_SdtBC_ALBREC_Albrpiedis ;
   private int gxTv_SdtBC_ALBREC_Albpzaest ;
   private int gxTv_SdtBC_ALBREC_Albrpiec ;
   private int gxTv_SdtBC_ALBREC_Albreccod_Z ;
   private int gxTv_SdtBC_ALBREC_Clicod_Z ;
   private int gxTv_SdtBC_ALBREC_Albrpieent_Z ;
   private int gxTv_SdtBC_ALBREC_Albrpieuti_Z ;
   private int gxTv_SdtBC_ALBREC_Albrpiereb_Z ;
   private int gxTv_SdtBC_ALBREC_Albrpiedis_Z ;
   private int gxTv_SdtBC_ALBREC_Albpzaest_Z ;
   private int gxTv_SdtBC_ALBREC_Albrpiec_Z ;
   private java.math.BigDecimal gxTv_SdtBC_ALBREC_Albrunient ;
   private java.math.BigDecimal gxTv_SdtBC_ALBREC_Albruniuti ;
   private java.math.BigDecimal gxTv_SdtBC_ALBREC_Albrunireb ;
   private java.math.BigDecimal gxTv_SdtBC_ALBREC_Albrunidis ;
   private java.math.BigDecimal gxTv_SdtBC_ALBREC_Albpmppza ;
   private java.math.BigDecimal gxTv_SdtBC_ALBREC_Albrpre ;
   private java.math.BigDecimal gxTv_SdtBC_ALBREC_Albraju ;
   private java.math.BigDecimal gxTv_SdtBC_ALBREC_Albrunic ;
   private java.math.BigDecimal gxTv_SdtBC_ALBREC_Albrlu ;
   private java.math.BigDecimal gxTv_SdtBC_ALBREC_Albrtara ;
   private java.math.BigDecimal gxTv_SdtBC_ALBREC_Albrunib ;
   private java.math.BigDecimal gxTv_SdtBC_ALBREC_Albrudas ;
   private java.math.BigDecimal gxTv_SdtBC_ALBREC_Albancc ;
   private java.math.BigDecimal gxTv_SdtBC_ALBREC_Albanccr ;
   private java.math.BigDecimal gxTv_SdtBC_ALBREC_Albrartlu ;
   private java.math.BigDecimal gxTv_SdtBC_ALBREC_Albrunient_Z ;
   private java.math.BigDecimal gxTv_SdtBC_ALBREC_Albruniuti_Z ;
   private java.math.BigDecimal gxTv_SdtBC_ALBREC_Albrunireb_Z ;
   private java.math.BigDecimal gxTv_SdtBC_ALBREC_Albrunidis_Z ;
   private java.math.BigDecimal gxTv_SdtBC_ALBREC_Albpmppza_Z ;
   private java.math.BigDecimal gxTv_SdtBC_ALBREC_Albrpre_Z ;
   private java.math.BigDecimal gxTv_SdtBC_ALBREC_Albraju_Z ;
   private java.math.BigDecimal gxTv_SdtBC_ALBREC_Albrunic_Z ;
   private java.math.BigDecimal gxTv_SdtBC_ALBREC_Albrlu_Z ;
   private java.math.BigDecimal gxTv_SdtBC_ALBREC_Albrtara_Z ;
   private java.math.BigDecimal gxTv_SdtBC_ALBREC_Albrunib_Z ;
   private java.math.BigDecimal gxTv_SdtBC_ALBREC_Albrudas_Z ;
   private java.math.BigDecimal gxTv_SdtBC_ALBREC_Albancc_Z ;
   private java.math.BigDecimal gxTv_SdtBC_ALBREC_Albanccr_Z ;
   private java.math.BigDecimal gxTv_SdtBC_ALBREC_Albrartlu_Z ;
   private String gxTv_SdtBC_ALBREC_Emprcod ;
   private String gxTv_SdtBC_ALBREC_Emprnom ;
   private String gxTv_SdtBC_ALBREC_Clinom ;
   private String gxTv_SdtBC_ALBREC_Albref ;
   private String gxTv_SdtBC_ALBREC_Trnnom ;
   private String gxTv_SdtBC_ALBREC_Albrent ;
   private String gxTv_SdtBC_ALBREC_Albruni ;
   private String gxTv_SdtBC_ALBREC_Albrloc ;
   private String gxTv_SdtBC_ALBREC_Albrtam ;
   private String gxTv_SdtBC_ALBREC_Emp_item1 ;
   private String gxTv_SdtBC_ALBREC_Albrreo ;
   private String gxTv_SdtBC_ALBREC_Tipentnom ;
   private String gxTv_SdtBC_ALBREC_Albrdes ;
   private String gxTv_SdtBC_ALBREC_Procenom ;
   private String gxTv_SdtBC_ALBREC_Albrefdsc ;
   private String gxTv_SdtBC_ALBREC_Albrent2 ;
   private String gxTv_SdtBC_ALBREC_Albrusu ;
   private String gxTv_SdtBC_ALBREC_Albrnf ;
   private String gxTv_SdtBC_ALBREC_Albrcfop ;
   private String gxTv_SdtBC_ALBREC_Albrdiscli ;
   private String gxTv_SdtBC_ALBREC_Albrtartd ;
   private String gxTv_SdtBC_ALBREC_Albrimp ;
   private String gxTv_SdtBC_ALBREC_Albrlote ;
   private String gxTv_SdtBC_ALBREC_Albrtelar ;
   private String gxTv_SdtBC_ALBREC_Albrmdlcod ;
   private String gxTv_SdtBC_ALBREC_Albdocprv ;
   private String gxTv_SdtBC_ALBREC_Almnom ;
   private String gxTv_SdtBC_ALBREC_Albcolor ;
   private String gxTv_SdtBC_ALBREC_Albopst ;
   private String gxTv_SdtBC_ALBREC_Albopsc ;
   private String gxTv_SdtBC_ALBREC_Alboc ;
   private String gxTv_SdtBC_ALBREC_Albhdri ;
   private String gxTv_SdtBC_ALBREC_Albnumb ;
   private String gxTv_SdtBC_ALBREC_Albnumm ;
   private String gxTv_SdtBC_ALBREC_Albmaqtej ;
   private String gxTv_SdtBC_ALBREC_Albpdac ;
   private String gxTv_SdtBC_ALBREC_Albostj ;
   private String gxTv_SdtBC_ALBREC_Cliest ;
   private String gxTv_SdtBC_ALBREC_Alboekotex ;
   private String gxTv_SdtBC_ALBREC_Albrent_3 ;
   private String gxTv_SdtBC_ALBREC_Mode ;
   private String gxTv_SdtBC_ALBREC_Emprcod_Z ;
   private String gxTv_SdtBC_ALBREC_Emprnom_Z ;
   private String gxTv_SdtBC_ALBREC_Clinom_Z ;
   private String gxTv_SdtBC_ALBREC_Albref_Z ;
   private String gxTv_SdtBC_ALBREC_Trnnom_Z ;
   private String gxTv_SdtBC_ALBREC_Albrent_Z ;
   private String gxTv_SdtBC_ALBREC_Albruni_Z ;
   private String gxTv_SdtBC_ALBREC_Albrloc_Z ;
   private String gxTv_SdtBC_ALBREC_Albrtam_Z ;
   private String gxTv_SdtBC_ALBREC_Emp_item1_Z ;
   private String gxTv_SdtBC_ALBREC_Albrreo_Z ;
   private String gxTv_SdtBC_ALBREC_Tipentnom_Z ;
   private String gxTv_SdtBC_ALBREC_Albrdes_Z ;
   private String gxTv_SdtBC_ALBREC_Procenom_Z ;
   private String gxTv_SdtBC_ALBREC_Albrefdsc_Z ;
   private String gxTv_SdtBC_ALBREC_Albrent2_Z ;
   private String gxTv_SdtBC_ALBREC_Albrusu_Z ;
   private String gxTv_SdtBC_ALBREC_Albrnf_Z ;
   private String gxTv_SdtBC_ALBREC_Albrcfop_Z ;
   private String gxTv_SdtBC_ALBREC_Albrdiscli_Z ;
   private String gxTv_SdtBC_ALBREC_Albrtartd_Z ;
   private String gxTv_SdtBC_ALBREC_Albrimp_Z ;
   private String gxTv_SdtBC_ALBREC_Albrlote_Z ;
   private String gxTv_SdtBC_ALBREC_Albrtelar_Z ;
   private String gxTv_SdtBC_ALBREC_Albrmdlcod_Z ;
   private String gxTv_SdtBC_ALBREC_Albdocprv_Z ;
   private String gxTv_SdtBC_ALBREC_Almnom_Z ;
   private String gxTv_SdtBC_ALBREC_Albcolor_Z ;
   private String gxTv_SdtBC_ALBREC_Albopst_Z ;
   private String gxTv_SdtBC_ALBREC_Albopsc_Z ;
   private String gxTv_SdtBC_ALBREC_Alboc_Z ;
   private String gxTv_SdtBC_ALBREC_Albhdri_Z ;
   private String gxTv_SdtBC_ALBREC_Albnumb_Z ;
   private String gxTv_SdtBC_ALBREC_Albnumm_Z ;
   private String gxTv_SdtBC_ALBREC_Albmaqtej_Z ;
   private String gxTv_SdtBC_ALBREC_Albpdac_Z ;
   private String gxTv_SdtBC_ALBREC_Albostj_Z ;
   private String gxTv_SdtBC_ALBREC_Cliest_Z ;
   private String gxTv_SdtBC_ALBREC_Alboekotex_Z ;
   private String gxTv_SdtBC_ALBREC_Albrent_3_Z ;
   private String sTagName ;
   private String sDateCnv ;
   private String sNumToPad ;
   private java.util.Date gxTv_SdtBC_ALBREC_Albrhor ;
   private java.util.Date gxTv_SdtBC_ALBREC_Albrhor_Z ;
   private java.util.Date datetime_STZ ;
   private java.util.Date gxTv_SdtBC_ALBREC_Albrfen ;
   private java.util.Date gxTv_SdtBC_ALBREC_Albrfecult ;
   private java.util.Date gxTv_SdtBC_ALBREC_Albrfenf ;
   private java.util.Date gxTv_SdtBC_ALBREC_Albrfen_Z ;
   private java.util.Date gxTv_SdtBC_ALBREC_Albrfecult_Z ;
   private java.util.Date gxTv_SdtBC_ALBREC_Albrfenf_Z ;
   private boolean readElement ;
   private boolean formatError ;
   private String gxTv_SdtBC_ALBREC_Albrlot2 ;
   private String gxTv_SdtBC_ALBREC_Albrlot2_Z ;
   private GXBCLevelCollection<app.SdtBC_ALBREC_Level1Item> gxTv_SdtBC_ALBREC_Level1_aux ;
   private GXBCLevelCollection<app.SdtBC_ALBREC_Level1Item> gxTv_SdtBC_ALBREC_Level1=null ;
}

