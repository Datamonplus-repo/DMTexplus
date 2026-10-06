package app.ponteway.v1 ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtOgGuiaImport extends GxSilentTrnSdt
{
   public SdtOgGuiaImport( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtOgGuiaImport.class));
   }

   public SdtOgGuiaImport( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle, context, "SdtOgGuiaImport");
      initialize( remoteHandle) ;
   }

   public SdtOgGuiaImport( int remoteHandle ,
                           StructSdtOgGuiaImport struct )
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

   public void Load( long AV14503ogLinha ,
                     String AV14504ogEmprCod ,
                     long AV14505ogCliCod )
   {
      IGxSilentTrn obj;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {Long.valueOf(AV14503ogLinha),AV14504ogEmprCod,Long.valueOf(AV14505ogCliCod)});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"ogLinha", long.class}, new Object[]{"ogEmprCod", String.class}, new Object[]{"ogCliCod", long.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "PonteWay\\v1\\OgGuiaImport");
      metadata.set("BT", "TXPOGGUIA");
      metadata.set("PK", "[ \"ogLinha\",\"ogEmprCod\",\"ogCliCod\" ]");
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogLinha") )
            {
               gxTv_SdtOgGuiaImport_Oglinha = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogEmprCod") )
            {
               gxTv_SdtOgGuiaImport_Ogemprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogCliCod") )
            {
               gxTv_SdtOgGuiaImport_Ogclicod = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogNmrGuia") )
            {
               gxTv_SdtOgGuiaImport_Ognmrguia = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogSerie") )
            {
               gxTv_SdtOgGuiaImport_Ogserie = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogFecha") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtOgGuiaImport_Ogfecha = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtOgGuiaImport_Ogfecha = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogCodArt") )
            {
               gxTv_SdtOgGuiaImport_Ogcodart = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogRolos") )
            {
               gxTv_SdtOgGuiaImport_Ogrolos = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogRolos_") )
            {
               gxTv_SdtOgGuiaImport_Ogrolos_ = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogQuant") )
            {
               gxTv_SdtOgGuiaImport_Ogquant = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogQuant_") )
            {
               gxTv_SdtOgGuiaImport_Ogquant_ = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogUnidad") )
            {
               gxTv_SdtOgGuiaImport_Ogunidad = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogUnidad_") )
            {
               gxTv_SdtOgGuiaImport_Ogunidad_ = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogReferen") )
            {
               gxTv_SdtOgGuiaImport_Ogreferen = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogReclam") )
            {
               gxTv_SdtOgGuiaImport_Ogreclam = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogLote") )
            {
               gxTv_SdtOgGuiaImport_Oglote = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogJogo") )
            {
               gxTv_SdtOgGuiaImport_Ogjogo = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogPoleg") )
            {
               gxTv_SdtOgGuiaImport_Ogpoleg = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogFio") )
            {
               gxTv_SdtOgGuiaImport_Ogfio = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogFio_") )
            {
               gxTv_SdtOgGuiaImport_Ogfio_ = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogMaqui") )
            {
               gxTv_SdtOgGuiaImport_Ogmaqui = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogEntrada") )
            {
               gxTv_SdtOgGuiaImport_Ogentrada = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogVossaR") )
            {
               gxTv_SdtOgGuiaImport_Ogvossar = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogArtiCR") )
            {
               gxTv_SdtOgGuiaImport_Ogarticr = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogArtiAC") )
            {
               gxTv_SdtOgGuiaImport_Ogartiac = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogARecCod") )
            {
               gxTv_SdtOgGuiaImport_Ogareccod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogLocalizac") )
            {
               gxTv_SdtOgGuiaImport_Oglocalizac = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogLocalizc_") )
            {
               gxTv_SdtOgGuiaImport_Oglocalizc_ = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtOgGuiaImport_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtOgGuiaImport_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogLinha_Z") )
            {
               gxTv_SdtOgGuiaImport_Oglinha_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogEmprCod_Z") )
            {
               gxTv_SdtOgGuiaImport_Ogemprcod_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogCliCod_Z") )
            {
               gxTv_SdtOgGuiaImport_Ogclicod_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogNmrGuia_Z") )
            {
               gxTv_SdtOgGuiaImport_Ognmrguia_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogSerie_Z") )
            {
               gxTv_SdtOgGuiaImport_Ogserie_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogFecha_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtOgGuiaImport_Ogfecha_Z = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtOgGuiaImport_Ogfecha_Z = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogCodArt_Z") )
            {
               gxTv_SdtOgGuiaImport_Ogcodart_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogRolos_Z") )
            {
               gxTv_SdtOgGuiaImport_Ogrolos_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogRolos__Z") )
            {
               gxTv_SdtOgGuiaImport_Ogrolos__Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogQuant_Z") )
            {
               gxTv_SdtOgGuiaImport_Ogquant_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogQuant__Z") )
            {
               gxTv_SdtOgGuiaImport_Ogquant__Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogUnidad_Z") )
            {
               gxTv_SdtOgGuiaImport_Ogunidad_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogUnidad__Z") )
            {
               gxTv_SdtOgGuiaImport_Ogunidad__Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogReferen_Z") )
            {
               gxTv_SdtOgGuiaImport_Ogreferen_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogReclam_Z") )
            {
               gxTv_SdtOgGuiaImport_Ogreclam_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogLote_Z") )
            {
               gxTv_SdtOgGuiaImport_Oglote_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogJogo_Z") )
            {
               gxTv_SdtOgGuiaImport_Ogjogo_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogPoleg_Z") )
            {
               gxTv_SdtOgGuiaImport_Ogpoleg_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogFio_Z") )
            {
               gxTv_SdtOgGuiaImport_Ogfio_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogFio__Z") )
            {
               gxTv_SdtOgGuiaImport_Ogfio__Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogMaqui_Z") )
            {
               gxTv_SdtOgGuiaImport_Ogmaqui_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogEntrada_Z") )
            {
               gxTv_SdtOgGuiaImport_Ogentrada_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogVossaR_Z") )
            {
               gxTv_SdtOgGuiaImport_Ogvossar_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogArtiCR_Z") )
            {
               gxTv_SdtOgGuiaImport_Ogarticr_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogArtiAC_Z") )
            {
               gxTv_SdtOgGuiaImport_Ogartiac_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogARecCod_Z") )
            {
               gxTv_SdtOgGuiaImport_Ogareccod_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogLocalizac_Z") )
            {
               gxTv_SdtOgGuiaImport_Oglocalizac_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogLocalizc__Z") )
            {
               gxTv_SdtOgGuiaImport_Oglocalizc__Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogNmrGuia_N") )
            {
               gxTv_SdtOgGuiaImport_Ognmrguia_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogSerie_N") )
            {
               gxTv_SdtOgGuiaImport_Ogserie_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogFecha_N") )
            {
               gxTv_SdtOgGuiaImport_Ogfecha_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogCodArt_N") )
            {
               gxTv_SdtOgGuiaImport_Ogcodart_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogRolos_N") )
            {
               gxTv_SdtOgGuiaImport_Ogrolos_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogRolos__N") )
            {
               gxTv_SdtOgGuiaImport_Ogrolos__N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogQuant_N") )
            {
               gxTv_SdtOgGuiaImport_Ogquant_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogQuant__N") )
            {
               gxTv_SdtOgGuiaImport_Ogquant__N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogUnidad_N") )
            {
               gxTv_SdtOgGuiaImport_Ogunidad_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogUnidad__N") )
            {
               gxTv_SdtOgGuiaImport_Ogunidad__N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogReferen_N") )
            {
               gxTv_SdtOgGuiaImport_Ogreferen_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogReclam_N") )
            {
               gxTv_SdtOgGuiaImport_Ogreclam_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogLote_N") )
            {
               gxTv_SdtOgGuiaImport_Oglote_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogJogo_N") )
            {
               gxTv_SdtOgGuiaImport_Ogjogo_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogPoleg_N") )
            {
               gxTv_SdtOgGuiaImport_Ogpoleg_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogFio_N") )
            {
               gxTv_SdtOgGuiaImport_Ogfio_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogFio__N") )
            {
               gxTv_SdtOgGuiaImport_Ogfio__N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogMaqui_N") )
            {
               gxTv_SdtOgGuiaImport_Ogmaqui_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogEntrada_N") )
            {
               gxTv_SdtOgGuiaImport_Ogentrada_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogVossaR_N") )
            {
               gxTv_SdtOgGuiaImport_Ogvossar_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogArtiCR_N") )
            {
               gxTv_SdtOgGuiaImport_Ogarticr_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogArtiAC_N") )
            {
               gxTv_SdtOgGuiaImport_Ogartiac_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogARecCod_N") )
            {
               gxTv_SdtOgGuiaImport_Ogareccod_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogLocalizac_N") )
            {
               gxTv_SdtOgGuiaImport_Oglocalizac_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ogLocalizc__N") )
            {
               gxTv_SdtOgGuiaImport_Oglocalizc__N = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "OgGuiaImport" ;
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
      oWriter.writeElement("ogLinha", GXutil.trim( GXutil.str( gxTv_SdtOgGuiaImport_Oglinha, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ogEmprCod", gxTv_SdtOgGuiaImport_Ogemprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ogCliCod", GXutil.trim( GXutil.str( gxTv_SdtOgGuiaImport_Ogclicod, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ogNmrGuia", GXutil.trim( GXutil.str( gxTv_SdtOgGuiaImport_Ognmrguia, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ogSerie", GXutil.trim( GXutil.str( gxTv_SdtOgGuiaImport_Ogserie, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtOgGuiaImport_Ogfecha), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtOgGuiaImport_Ogfecha), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtOgGuiaImport_Ogfecha), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("ogFecha", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ogCodArt", gxTv_SdtOgGuiaImport_Ogcodart);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ogRolos", GXutil.trim( GXutil.str( gxTv_SdtOgGuiaImport_Ogrolos, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ogRolos_", GXutil.trim( GXutil.str( gxTv_SdtOgGuiaImport_Ogrolos_, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ogQuant", GXutil.trim( GXutil.strNoRound( gxTv_SdtOgGuiaImport_Ogquant, 7, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ogQuant_", GXutil.trim( GXutil.strNoRound( gxTv_SdtOgGuiaImport_Ogquant_, 7, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ogUnidad", gxTv_SdtOgGuiaImport_Ogunidad);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ogUnidad_", gxTv_SdtOgGuiaImport_Ogunidad_);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ogReferen", gxTv_SdtOgGuiaImport_Ogreferen);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ogReclam", gxTv_SdtOgGuiaImport_Ogreclam);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ogLote", gxTv_SdtOgGuiaImport_Oglote);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ogJogo", gxTv_SdtOgGuiaImport_Ogjogo);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ogPoleg", gxTv_SdtOgGuiaImport_Ogpoleg);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ogFio", gxTv_SdtOgGuiaImport_Ogfio);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ogFio_", gxTv_SdtOgGuiaImport_Ogfio_);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ogMaqui", gxTv_SdtOgGuiaImport_Ogmaqui);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ogEntrada", gxTv_SdtOgGuiaImport_Ogentrada);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ogVossaR", gxTv_SdtOgGuiaImport_Ogvossar);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ogArtiCR", gxTv_SdtOgGuiaImport_Ogarticr);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ogArtiAC", gxTv_SdtOgGuiaImport_Ogartiac);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ogARecCod", GXutil.trim( GXutil.str( gxTv_SdtOgGuiaImport_Ogareccod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ogLocalizac", gxTv_SdtOgGuiaImport_Oglocalizac);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ogLocalizc_", gxTv_SdtOgGuiaImport_Oglocalizc_);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", gxTv_SdtOgGuiaImport_Mode);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtOgGuiaImport_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogLinha_Z", GXutil.trim( GXutil.str( gxTv_SdtOgGuiaImport_Oglinha_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogEmprCod_Z", gxTv_SdtOgGuiaImport_Ogemprcod_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogCliCod_Z", GXutil.trim( GXutil.str( gxTv_SdtOgGuiaImport_Ogclicod_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogNmrGuia_Z", GXutil.trim( GXutil.str( gxTv_SdtOgGuiaImport_Ognmrguia_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogSerie_Z", GXutil.trim( GXutil.str( gxTv_SdtOgGuiaImport_Ogserie_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtOgGuiaImport_Ogfecha_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtOgGuiaImport_Ogfecha_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtOgGuiaImport_Ogfecha_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("ogFecha_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogCodArt_Z", gxTv_SdtOgGuiaImport_Ogcodart_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogRolos_Z", GXutil.trim( GXutil.str( gxTv_SdtOgGuiaImport_Ogrolos_Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogRolos__Z", GXutil.trim( GXutil.str( gxTv_SdtOgGuiaImport_Ogrolos__Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogQuant_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtOgGuiaImport_Ogquant_Z, 7, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogQuant__Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtOgGuiaImport_Ogquant__Z, 7, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogUnidad_Z", gxTv_SdtOgGuiaImport_Ogunidad_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogUnidad__Z", gxTv_SdtOgGuiaImport_Ogunidad__Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogReferen_Z", gxTv_SdtOgGuiaImport_Ogreferen_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogReclam_Z", gxTv_SdtOgGuiaImport_Ogreclam_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogLote_Z", gxTv_SdtOgGuiaImport_Oglote_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogJogo_Z", gxTv_SdtOgGuiaImport_Ogjogo_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogPoleg_Z", gxTv_SdtOgGuiaImport_Ogpoleg_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogFio_Z", gxTv_SdtOgGuiaImport_Ogfio_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogFio__Z", gxTv_SdtOgGuiaImport_Ogfio__Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogMaqui_Z", gxTv_SdtOgGuiaImport_Ogmaqui_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogEntrada_Z", gxTv_SdtOgGuiaImport_Ogentrada_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogVossaR_Z", gxTv_SdtOgGuiaImport_Ogvossar_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogArtiCR_Z", gxTv_SdtOgGuiaImport_Ogarticr_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogArtiAC_Z", gxTv_SdtOgGuiaImport_Ogartiac_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogARecCod_Z", GXutil.trim( GXutil.str( gxTv_SdtOgGuiaImport_Ogareccod_Z, 8, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogLocalizac_Z", gxTv_SdtOgGuiaImport_Oglocalizac_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogLocalizc__Z", gxTv_SdtOgGuiaImport_Oglocalizc__Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogNmrGuia_N", GXutil.trim( GXutil.str( gxTv_SdtOgGuiaImport_Ognmrguia_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogSerie_N", GXutil.trim( GXutil.str( gxTv_SdtOgGuiaImport_Ogserie_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogFecha_N", GXutil.trim( GXutil.str( gxTv_SdtOgGuiaImport_Ogfecha_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogCodArt_N", GXutil.trim( GXutil.str( gxTv_SdtOgGuiaImport_Ogcodart_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogRolos_N", GXutil.trim( GXutil.str( gxTv_SdtOgGuiaImport_Ogrolos_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogRolos__N", GXutil.trim( GXutil.str( gxTv_SdtOgGuiaImport_Ogrolos__N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogQuant_N", GXutil.trim( GXutil.str( gxTv_SdtOgGuiaImport_Ogquant_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogQuant__N", GXutil.trim( GXutil.str( gxTv_SdtOgGuiaImport_Ogquant__N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogUnidad_N", GXutil.trim( GXutil.str( gxTv_SdtOgGuiaImport_Ogunidad_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogUnidad__N", GXutil.trim( GXutil.str( gxTv_SdtOgGuiaImport_Ogunidad__N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogReferen_N", GXutil.trim( GXutil.str( gxTv_SdtOgGuiaImport_Ogreferen_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogReclam_N", GXutil.trim( GXutil.str( gxTv_SdtOgGuiaImport_Ogreclam_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogLote_N", GXutil.trim( GXutil.str( gxTv_SdtOgGuiaImport_Oglote_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogJogo_N", GXutil.trim( GXutil.str( gxTv_SdtOgGuiaImport_Ogjogo_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogPoleg_N", GXutil.trim( GXutil.str( gxTv_SdtOgGuiaImport_Ogpoleg_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogFio_N", GXutil.trim( GXutil.str( gxTv_SdtOgGuiaImport_Ogfio_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogFio__N", GXutil.trim( GXutil.str( gxTv_SdtOgGuiaImport_Ogfio__N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogMaqui_N", GXutil.trim( GXutil.str( gxTv_SdtOgGuiaImport_Ogmaqui_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogEntrada_N", GXutil.trim( GXutil.str( gxTv_SdtOgGuiaImport_Ogentrada_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogVossaR_N", GXutil.trim( GXutil.str( gxTv_SdtOgGuiaImport_Ogvossar_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogArtiCR_N", GXutil.trim( GXutil.str( gxTv_SdtOgGuiaImport_Ogarticr_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogArtiAC_N", GXutil.trim( GXutil.str( gxTv_SdtOgGuiaImport_Ogartiac_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogARecCod_N", GXutil.trim( GXutil.str( gxTv_SdtOgGuiaImport_Ogareccod_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogLocalizac_N", GXutil.trim( GXutil.str( gxTv_SdtOgGuiaImport_Oglocalizac_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ogLocalizc__N", GXutil.trim( GXutil.str( gxTv_SdtOgGuiaImport_Oglocalizc__N, 1, 0)));
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
      AddObjectProperty("ogLinha", gxTv_SdtOgGuiaImport_Oglinha, false, includeNonInitialized);
      AddObjectProperty("ogEmprCod", gxTv_SdtOgGuiaImport_Ogemprcod, false, includeNonInitialized);
      AddObjectProperty("ogCliCod", gxTv_SdtOgGuiaImport_Ogclicod, false, includeNonInitialized);
      AddObjectProperty("ogNmrGuia", gxTv_SdtOgGuiaImport_Ognmrguia, false, includeNonInitialized);
      AddObjectProperty("ogNmrGuia_N", gxTv_SdtOgGuiaImport_Ognmrguia_N, false, includeNonInitialized);
      AddObjectProperty("ogSerie", gxTv_SdtOgGuiaImport_Ogserie, false, includeNonInitialized);
      AddObjectProperty("ogSerie_N", gxTv_SdtOgGuiaImport_Ogserie_N, false, includeNonInitialized);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtOgGuiaImport_Ogfecha), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtOgGuiaImport_Ogfecha), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtOgGuiaImport_Ogfecha), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("ogFecha", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("ogFecha_N", gxTv_SdtOgGuiaImport_Ogfecha_N, false, includeNonInitialized);
      AddObjectProperty("ogCodArt", gxTv_SdtOgGuiaImport_Ogcodart, false, includeNonInitialized);
      AddObjectProperty("ogCodArt_N", gxTv_SdtOgGuiaImport_Ogcodart_N, false, includeNonInitialized);
      AddObjectProperty("ogRolos", gxTv_SdtOgGuiaImport_Ogrolos, false, includeNonInitialized);
      AddObjectProperty("ogRolos_N", gxTv_SdtOgGuiaImport_Ogrolos_N, false, includeNonInitialized);
      AddObjectProperty("ogRolos_", gxTv_SdtOgGuiaImport_Ogrolos_, false, includeNonInitialized);
      AddObjectProperty("ogRolos__N", gxTv_SdtOgGuiaImport_Ogrolos__N, false, includeNonInitialized);
      AddObjectProperty("ogQuant", gxTv_SdtOgGuiaImport_Ogquant, false, includeNonInitialized);
      AddObjectProperty("ogQuant_N", gxTv_SdtOgGuiaImport_Ogquant_N, false, includeNonInitialized);
      AddObjectProperty("ogQuant_", gxTv_SdtOgGuiaImport_Ogquant_, false, includeNonInitialized);
      AddObjectProperty("ogQuant__N", gxTv_SdtOgGuiaImport_Ogquant__N, false, includeNonInitialized);
      AddObjectProperty("ogUnidad", gxTv_SdtOgGuiaImport_Ogunidad, false, includeNonInitialized);
      AddObjectProperty("ogUnidad_N", gxTv_SdtOgGuiaImport_Ogunidad_N, false, includeNonInitialized);
      AddObjectProperty("ogUnidad_", gxTv_SdtOgGuiaImport_Ogunidad_, false, includeNonInitialized);
      AddObjectProperty("ogUnidad__N", gxTv_SdtOgGuiaImport_Ogunidad__N, false, includeNonInitialized);
      AddObjectProperty("ogReferen", gxTv_SdtOgGuiaImport_Ogreferen, false, includeNonInitialized);
      AddObjectProperty("ogReferen_N", gxTv_SdtOgGuiaImport_Ogreferen_N, false, includeNonInitialized);
      AddObjectProperty("ogReclam", gxTv_SdtOgGuiaImport_Ogreclam, false, includeNonInitialized);
      AddObjectProperty("ogReclam_N", gxTv_SdtOgGuiaImport_Ogreclam_N, false, includeNonInitialized);
      AddObjectProperty("ogLote", gxTv_SdtOgGuiaImport_Oglote, false, includeNonInitialized);
      AddObjectProperty("ogLote_N", gxTv_SdtOgGuiaImport_Oglote_N, false, includeNonInitialized);
      AddObjectProperty("ogJogo", gxTv_SdtOgGuiaImport_Ogjogo, false, includeNonInitialized);
      AddObjectProperty("ogJogo_N", gxTv_SdtOgGuiaImport_Ogjogo_N, false, includeNonInitialized);
      AddObjectProperty("ogPoleg", gxTv_SdtOgGuiaImport_Ogpoleg, false, includeNonInitialized);
      AddObjectProperty("ogPoleg_N", gxTv_SdtOgGuiaImport_Ogpoleg_N, false, includeNonInitialized);
      AddObjectProperty("ogFio", gxTv_SdtOgGuiaImport_Ogfio, false, includeNonInitialized);
      AddObjectProperty("ogFio_N", gxTv_SdtOgGuiaImport_Ogfio_N, false, includeNonInitialized);
      AddObjectProperty("ogFio_", gxTv_SdtOgGuiaImport_Ogfio_, false, includeNonInitialized);
      AddObjectProperty("ogFio__N", gxTv_SdtOgGuiaImport_Ogfio__N, false, includeNonInitialized);
      AddObjectProperty("ogMaqui", gxTv_SdtOgGuiaImport_Ogmaqui, false, includeNonInitialized);
      AddObjectProperty("ogMaqui_N", gxTv_SdtOgGuiaImport_Ogmaqui_N, false, includeNonInitialized);
      AddObjectProperty("ogEntrada", gxTv_SdtOgGuiaImport_Ogentrada, false, includeNonInitialized);
      AddObjectProperty("ogEntrada_N", gxTv_SdtOgGuiaImport_Ogentrada_N, false, includeNonInitialized);
      AddObjectProperty("ogVossaR", gxTv_SdtOgGuiaImport_Ogvossar, false, includeNonInitialized);
      AddObjectProperty("ogVossaR_N", gxTv_SdtOgGuiaImport_Ogvossar_N, false, includeNonInitialized);
      AddObjectProperty("ogArtiCR", gxTv_SdtOgGuiaImport_Ogarticr, false, includeNonInitialized);
      AddObjectProperty("ogArtiCR_N", gxTv_SdtOgGuiaImport_Ogarticr_N, false, includeNonInitialized);
      AddObjectProperty("ogArtiAC", gxTv_SdtOgGuiaImport_Ogartiac, false, includeNonInitialized);
      AddObjectProperty("ogArtiAC_N", gxTv_SdtOgGuiaImport_Ogartiac_N, false, includeNonInitialized);
      AddObjectProperty("ogARecCod", gxTv_SdtOgGuiaImport_Ogareccod, false, includeNonInitialized);
      AddObjectProperty("ogARecCod_N", gxTv_SdtOgGuiaImport_Ogareccod_N, false, includeNonInitialized);
      AddObjectProperty("ogLocalizac", gxTv_SdtOgGuiaImport_Oglocalizac, false, includeNonInitialized);
      AddObjectProperty("ogLocalizac_N", gxTv_SdtOgGuiaImport_Oglocalizac_N, false, includeNonInitialized);
      AddObjectProperty("ogLocalizc_", gxTv_SdtOgGuiaImport_Oglocalizc_, false, includeNonInitialized);
      AddObjectProperty("ogLocalizc__N", gxTv_SdtOgGuiaImport_Oglocalizc__N, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtOgGuiaImport_Mode, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_SdtOgGuiaImport_Initialized, false, includeNonInitialized);
         AddObjectProperty("ogLinha_Z", gxTv_SdtOgGuiaImport_Oglinha_Z, false, includeNonInitialized);
         AddObjectProperty("ogEmprCod_Z", gxTv_SdtOgGuiaImport_Ogemprcod_Z, false, includeNonInitialized);
         AddObjectProperty("ogCliCod_Z", gxTv_SdtOgGuiaImport_Ogclicod_Z, false, includeNonInitialized);
         AddObjectProperty("ogNmrGuia_Z", gxTv_SdtOgGuiaImport_Ognmrguia_Z, false, includeNonInitialized);
         AddObjectProperty("ogSerie_Z", gxTv_SdtOgGuiaImport_Ogserie_Z, false, includeNonInitialized);
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtOgGuiaImport_Ogfecha_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtOgGuiaImport_Ogfecha_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtOgGuiaImport_Ogfecha_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("ogFecha_Z", sDateCnv, false, includeNonInitialized);
         AddObjectProperty("ogCodArt_Z", gxTv_SdtOgGuiaImport_Ogcodart_Z, false, includeNonInitialized);
         AddObjectProperty("ogRolos_Z", gxTv_SdtOgGuiaImport_Ogrolos_Z, false, includeNonInitialized);
         AddObjectProperty("ogRolos__Z", gxTv_SdtOgGuiaImport_Ogrolos__Z, false, includeNonInitialized);
         AddObjectProperty("ogQuant_Z", gxTv_SdtOgGuiaImport_Ogquant_Z, false, includeNonInitialized);
         AddObjectProperty("ogQuant__Z", gxTv_SdtOgGuiaImport_Ogquant__Z, false, includeNonInitialized);
         AddObjectProperty("ogUnidad_Z", gxTv_SdtOgGuiaImport_Ogunidad_Z, false, includeNonInitialized);
         AddObjectProperty("ogUnidad__Z", gxTv_SdtOgGuiaImport_Ogunidad__Z, false, includeNonInitialized);
         AddObjectProperty("ogReferen_Z", gxTv_SdtOgGuiaImport_Ogreferen_Z, false, includeNonInitialized);
         AddObjectProperty("ogReclam_Z", gxTv_SdtOgGuiaImport_Ogreclam_Z, false, includeNonInitialized);
         AddObjectProperty("ogLote_Z", gxTv_SdtOgGuiaImport_Oglote_Z, false, includeNonInitialized);
         AddObjectProperty("ogJogo_Z", gxTv_SdtOgGuiaImport_Ogjogo_Z, false, includeNonInitialized);
         AddObjectProperty("ogPoleg_Z", gxTv_SdtOgGuiaImport_Ogpoleg_Z, false, includeNonInitialized);
         AddObjectProperty("ogFio_Z", gxTv_SdtOgGuiaImport_Ogfio_Z, false, includeNonInitialized);
         AddObjectProperty("ogFio__Z", gxTv_SdtOgGuiaImport_Ogfio__Z, false, includeNonInitialized);
         AddObjectProperty("ogMaqui_Z", gxTv_SdtOgGuiaImport_Ogmaqui_Z, false, includeNonInitialized);
         AddObjectProperty("ogEntrada_Z", gxTv_SdtOgGuiaImport_Ogentrada_Z, false, includeNonInitialized);
         AddObjectProperty("ogVossaR_Z", gxTv_SdtOgGuiaImport_Ogvossar_Z, false, includeNonInitialized);
         AddObjectProperty("ogArtiCR_Z", gxTv_SdtOgGuiaImport_Ogarticr_Z, false, includeNonInitialized);
         AddObjectProperty("ogArtiAC_Z", gxTv_SdtOgGuiaImport_Ogartiac_Z, false, includeNonInitialized);
         AddObjectProperty("ogARecCod_Z", gxTv_SdtOgGuiaImport_Ogareccod_Z, false, includeNonInitialized);
         AddObjectProperty("ogLocalizac_Z", gxTv_SdtOgGuiaImport_Oglocalizac_Z, false, includeNonInitialized);
         AddObjectProperty("ogLocalizc__Z", gxTv_SdtOgGuiaImport_Oglocalizc__Z, false, includeNonInitialized);
         AddObjectProperty("ogNmrGuia_N", gxTv_SdtOgGuiaImport_Ognmrguia_N, false, includeNonInitialized);
         AddObjectProperty("ogSerie_N", gxTv_SdtOgGuiaImport_Ogserie_N, false, includeNonInitialized);
         AddObjectProperty("ogFecha_N", gxTv_SdtOgGuiaImport_Ogfecha_N, false, includeNonInitialized);
         AddObjectProperty("ogCodArt_N", gxTv_SdtOgGuiaImport_Ogcodart_N, false, includeNonInitialized);
         AddObjectProperty("ogRolos_N", gxTv_SdtOgGuiaImport_Ogrolos_N, false, includeNonInitialized);
         AddObjectProperty("ogRolos__N", gxTv_SdtOgGuiaImport_Ogrolos__N, false, includeNonInitialized);
         AddObjectProperty("ogQuant_N", gxTv_SdtOgGuiaImport_Ogquant_N, false, includeNonInitialized);
         AddObjectProperty("ogQuant__N", gxTv_SdtOgGuiaImport_Ogquant__N, false, includeNonInitialized);
         AddObjectProperty("ogUnidad_N", gxTv_SdtOgGuiaImport_Ogunidad_N, false, includeNonInitialized);
         AddObjectProperty("ogUnidad__N", gxTv_SdtOgGuiaImport_Ogunidad__N, false, includeNonInitialized);
         AddObjectProperty("ogReferen_N", gxTv_SdtOgGuiaImport_Ogreferen_N, false, includeNonInitialized);
         AddObjectProperty("ogReclam_N", gxTv_SdtOgGuiaImport_Ogreclam_N, false, includeNonInitialized);
         AddObjectProperty("ogLote_N", gxTv_SdtOgGuiaImport_Oglote_N, false, includeNonInitialized);
         AddObjectProperty("ogJogo_N", gxTv_SdtOgGuiaImport_Ogjogo_N, false, includeNonInitialized);
         AddObjectProperty("ogPoleg_N", gxTv_SdtOgGuiaImport_Ogpoleg_N, false, includeNonInitialized);
         AddObjectProperty("ogFio_N", gxTv_SdtOgGuiaImport_Ogfio_N, false, includeNonInitialized);
         AddObjectProperty("ogFio__N", gxTv_SdtOgGuiaImport_Ogfio__N, false, includeNonInitialized);
         AddObjectProperty("ogMaqui_N", gxTv_SdtOgGuiaImport_Ogmaqui_N, false, includeNonInitialized);
         AddObjectProperty("ogEntrada_N", gxTv_SdtOgGuiaImport_Ogentrada_N, false, includeNonInitialized);
         AddObjectProperty("ogVossaR_N", gxTv_SdtOgGuiaImport_Ogvossar_N, false, includeNonInitialized);
         AddObjectProperty("ogArtiCR_N", gxTv_SdtOgGuiaImport_Ogarticr_N, false, includeNonInitialized);
         AddObjectProperty("ogArtiAC_N", gxTv_SdtOgGuiaImport_Ogartiac_N, false, includeNonInitialized);
         AddObjectProperty("ogARecCod_N", gxTv_SdtOgGuiaImport_Ogareccod_N, false, includeNonInitialized);
         AddObjectProperty("ogLocalizac_N", gxTv_SdtOgGuiaImport_Oglocalizac_N, false, includeNonInitialized);
         AddObjectProperty("ogLocalizc__N", gxTv_SdtOgGuiaImport_Oglocalizc__N, false, includeNonInitialized);
      }
   }

   public void updateDirties( app.ponteway.v1.SdtOgGuiaImport sdt )
   {
      if ( sdt.IsDirty("ogLinha") )
      {
         gxTv_SdtOgGuiaImport_N = (byte)(0) ;
         gxTv_SdtOgGuiaImport_Oglinha = sdt.getgxTv_SdtOgGuiaImport_Oglinha() ;
      }
      if ( sdt.IsDirty("ogEmprCod") )
      {
         gxTv_SdtOgGuiaImport_N = (byte)(0) ;
         gxTv_SdtOgGuiaImport_Ogemprcod = sdt.getgxTv_SdtOgGuiaImport_Ogemprcod() ;
      }
      if ( sdt.IsDirty("ogCliCod") )
      {
         gxTv_SdtOgGuiaImport_N = (byte)(0) ;
         gxTv_SdtOgGuiaImport_Ogclicod = sdt.getgxTv_SdtOgGuiaImport_Ogclicod() ;
      }
      if ( sdt.IsDirty("ogNmrGuia") )
      {
         gxTv_SdtOgGuiaImport_Ognmrguia_N = sdt.getgxTv_SdtOgGuiaImport_Ognmrguia_N() ;
         gxTv_SdtOgGuiaImport_N = (byte)(0) ;
         gxTv_SdtOgGuiaImport_Ognmrguia = sdt.getgxTv_SdtOgGuiaImport_Ognmrguia() ;
      }
      if ( sdt.IsDirty("ogSerie") )
      {
         gxTv_SdtOgGuiaImport_Ogserie_N = sdt.getgxTv_SdtOgGuiaImport_Ogserie_N() ;
         gxTv_SdtOgGuiaImport_N = (byte)(0) ;
         gxTv_SdtOgGuiaImport_Ogserie = sdt.getgxTv_SdtOgGuiaImport_Ogserie() ;
      }
      if ( sdt.IsDirty("ogFecha") )
      {
         gxTv_SdtOgGuiaImport_Ogfecha_N = sdt.getgxTv_SdtOgGuiaImport_Ogfecha_N() ;
         gxTv_SdtOgGuiaImport_N = (byte)(0) ;
         gxTv_SdtOgGuiaImport_Ogfecha = sdt.getgxTv_SdtOgGuiaImport_Ogfecha() ;
      }
      if ( sdt.IsDirty("ogCodArt") )
      {
         gxTv_SdtOgGuiaImport_Ogcodart_N = sdt.getgxTv_SdtOgGuiaImport_Ogcodart_N() ;
         gxTv_SdtOgGuiaImport_N = (byte)(0) ;
         gxTv_SdtOgGuiaImport_Ogcodart = sdt.getgxTv_SdtOgGuiaImport_Ogcodart() ;
      }
      if ( sdt.IsDirty("ogRolos") )
      {
         gxTv_SdtOgGuiaImport_Ogrolos_N = sdt.getgxTv_SdtOgGuiaImport_Ogrolos_N() ;
         gxTv_SdtOgGuiaImport_N = (byte)(0) ;
         gxTv_SdtOgGuiaImport_Ogrolos = sdt.getgxTv_SdtOgGuiaImport_Ogrolos() ;
      }
      if ( sdt.IsDirty("ogRolos_") )
      {
         gxTv_SdtOgGuiaImport_Ogrolos__N = sdt.getgxTv_SdtOgGuiaImport_Ogrolos__N() ;
         gxTv_SdtOgGuiaImport_N = (byte)(0) ;
         gxTv_SdtOgGuiaImport_Ogrolos_ = sdt.getgxTv_SdtOgGuiaImport_Ogrolos_() ;
      }
      if ( sdt.IsDirty("ogQuant") )
      {
         gxTv_SdtOgGuiaImport_Ogquant_N = sdt.getgxTv_SdtOgGuiaImport_Ogquant_N() ;
         gxTv_SdtOgGuiaImport_N = (byte)(0) ;
         gxTv_SdtOgGuiaImport_Ogquant = sdt.getgxTv_SdtOgGuiaImport_Ogquant() ;
      }
      if ( sdt.IsDirty("ogQuant_") )
      {
         gxTv_SdtOgGuiaImport_Ogquant__N = sdt.getgxTv_SdtOgGuiaImport_Ogquant__N() ;
         gxTv_SdtOgGuiaImport_N = (byte)(0) ;
         gxTv_SdtOgGuiaImport_Ogquant_ = sdt.getgxTv_SdtOgGuiaImport_Ogquant_() ;
      }
      if ( sdt.IsDirty("ogUnidad") )
      {
         gxTv_SdtOgGuiaImport_Ogunidad_N = sdt.getgxTv_SdtOgGuiaImport_Ogunidad_N() ;
         gxTv_SdtOgGuiaImport_N = (byte)(0) ;
         gxTv_SdtOgGuiaImport_Ogunidad = sdt.getgxTv_SdtOgGuiaImport_Ogunidad() ;
      }
      if ( sdt.IsDirty("ogUnidad_") )
      {
         gxTv_SdtOgGuiaImport_Ogunidad__N = sdt.getgxTv_SdtOgGuiaImport_Ogunidad__N() ;
         gxTv_SdtOgGuiaImport_N = (byte)(0) ;
         gxTv_SdtOgGuiaImport_Ogunidad_ = sdt.getgxTv_SdtOgGuiaImport_Ogunidad_() ;
      }
      if ( sdt.IsDirty("ogReferen") )
      {
         gxTv_SdtOgGuiaImport_Ogreferen_N = sdt.getgxTv_SdtOgGuiaImport_Ogreferen_N() ;
         gxTv_SdtOgGuiaImport_N = (byte)(0) ;
         gxTv_SdtOgGuiaImport_Ogreferen = sdt.getgxTv_SdtOgGuiaImport_Ogreferen() ;
      }
      if ( sdt.IsDirty("ogReclam") )
      {
         gxTv_SdtOgGuiaImport_Ogreclam_N = sdt.getgxTv_SdtOgGuiaImport_Ogreclam_N() ;
         gxTv_SdtOgGuiaImport_N = (byte)(0) ;
         gxTv_SdtOgGuiaImport_Ogreclam = sdt.getgxTv_SdtOgGuiaImport_Ogreclam() ;
      }
      if ( sdt.IsDirty("ogLote") )
      {
         gxTv_SdtOgGuiaImport_Oglote_N = sdt.getgxTv_SdtOgGuiaImport_Oglote_N() ;
         gxTv_SdtOgGuiaImport_N = (byte)(0) ;
         gxTv_SdtOgGuiaImport_Oglote = sdt.getgxTv_SdtOgGuiaImport_Oglote() ;
      }
      if ( sdt.IsDirty("ogJogo") )
      {
         gxTv_SdtOgGuiaImport_Ogjogo_N = sdt.getgxTv_SdtOgGuiaImport_Ogjogo_N() ;
         gxTv_SdtOgGuiaImport_N = (byte)(0) ;
         gxTv_SdtOgGuiaImport_Ogjogo = sdt.getgxTv_SdtOgGuiaImport_Ogjogo() ;
      }
      if ( sdt.IsDirty("ogPoleg") )
      {
         gxTv_SdtOgGuiaImport_Ogpoleg_N = sdt.getgxTv_SdtOgGuiaImport_Ogpoleg_N() ;
         gxTv_SdtOgGuiaImport_N = (byte)(0) ;
         gxTv_SdtOgGuiaImport_Ogpoleg = sdt.getgxTv_SdtOgGuiaImport_Ogpoleg() ;
      }
      if ( sdt.IsDirty("ogFio") )
      {
         gxTv_SdtOgGuiaImport_Ogfio_N = sdt.getgxTv_SdtOgGuiaImport_Ogfio_N() ;
         gxTv_SdtOgGuiaImport_N = (byte)(0) ;
         gxTv_SdtOgGuiaImport_Ogfio = sdt.getgxTv_SdtOgGuiaImport_Ogfio() ;
      }
      if ( sdt.IsDirty("ogFio_") )
      {
         gxTv_SdtOgGuiaImport_Ogfio__N = sdt.getgxTv_SdtOgGuiaImport_Ogfio__N() ;
         gxTv_SdtOgGuiaImport_N = (byte)(0) ;
         gxTv_SdtOgGuiaImport_Ogfio_ = sdt.getgxTv_SdtOgGuiaImport_Ogfio_() ;
      }
      if ( sdt.IsDirty("ogMaqui") )
      {
         gxTv_SdtOgGuiaImport_Ogmaqui_N = sdt.getgxTv_SdtOgGuiaImport_Ogmaqui_N() ;
         gxTv_SdtOgGuiaImport_N = (byte)(0) ;
         gxTv_SdtOgGuiaImport_Ogmaqui = sdt.getgxTv_SdtOgGuiaImport_Ogmaqui() ;
      }
      if ( sdt.IsDirty("ogEntrada") )
      {
         gxTv_SdtOgGuiaImport_Ogentrada_N = sdt.getgxTv_SdtOgGuiaImport_Ogentrada_N() ;
         gxTv_SdtOgGuiaImport_N = (byte)(0) ;
         gxTv_SdtOgGuiaImport_Ogentrada = sdt.getgxTv_SdtOgGuiaImport_Ogentrada() ;
      }
      if ( sdt.IsDirty("ogVossaR") )
      {
         gxTv_SdtOgGuiaImport_Ogvossar_N = sdt.getgxTv_SdtOgGuiaImport_Ogvossar_N() ;
         gxTv_SdtOgGuiaImport_N = (byte)(0) ;
         gxTv_SdtOgGuiaImport_Ogvossar = sdt.getgxTv_SdtOgGuiaImport_Ogvossar() ;
      }
      if ( sdt.IsDirty("ogArtiCR") )
      {
         gxTv_SdtOgGuiaImport_Ogarticr_N = sdt.getgxTv_SdtOgGuiaImport_Ogarticr_N() ;
         gxTv_SdtOgGuiaImport_N = (byte)(0) ;
         gxTv_SdtOgGuiaImport_Ogarticr = sdt.getgxTv_SdtOgGuiaImport_Ogarticr() ;
      }
      if ( sdt.IsDirty("ogArtiAC") )
      {
         gxTv_SdtOgGuiaImport_Ogartiac_N = sdt.getgxTv_SdtOgGuiaImport_Ogartiac_N() ;
         gxTv_SdtOgGuiaImport_N = (byte)(0) ;
         gxTv_SdtOgGuiaImport_Ogartiac = sdt.getgxTv_SdtOgGuiaImport_Ogartiac() ;
      }
      if ( sdt.IsDirty("ogARecCod") )
      {
         gxTv_SdtOgGuiaImport_Ogareccod_N = sdt.getgxTv_SdtOgGuiaImport_Ogareccod_N() ;
         gxTv_SdtOgGuiaImport_N = (byte)(0) ;
         gxTv_SdtOgGuiaImport_Ogareccod = sdt.getgxTv_SdtOgGuiaImport_Ogareccod() ;
      }
      if ( sdt.IsDirty("ogLocalizac") )
      {
         gxTv_SdtOgGuiaImport_Oglocalizac_N = sdt.getgxTv_SdtOgGuiaImport_Oglocalizac_N() ;
         gxTv_SdtOgGuiaImport_N = (byte)(0) ;
         gxTv_SdtOgGuiaImport_Oglocalizac = sdt.getgxTv_SdtOgGuiaImport_Oglocalizac() ;
      }
      if ( sdt.IsDirty("ogLocalizc_") )
      {
         gxTv_SdtOgGuiaImport_Oglocalizc__N = sdt.getgxTv_SdtOgGuiaImport_Oglocalizc__N() ;
         gxTv_SdtOgGuiaImport_N = (byte)(0) ;
         gxTv_SdtOgGuiaImport_Oglocalizc_ = sdt.getgxTv_SdtOgGuiaImport_Oglocalizc_() ;
      }
   }

   public long getgxTv_SdtOgGuiaImport_Oglinha( )
   {
      return gxTv_SdtOgGuiaImport_Oglinha ;
   }

   public void setgxTv_SdtOgGuiaImport_Oglinha( long value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      if ( gxTv_SdtOgGuiaImport_Oglinha != value )
      {
         gxTv_SdtOgGuiaImport_Mode = "INS" ;
         this.setgxTv_SdtOgGuiaImport_Oglinha_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogemprcod_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogclicod_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ognmrguia_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogserie_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogfecha_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogcodart_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogrolos_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogrolos__Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogquant_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogquant__Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogunidad_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogunidad__Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogreferen_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogreclam_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Oglote_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogjogo_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogpoleg_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogfio_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogfio__Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogmaqui_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogentrada_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogvossar_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogarticr_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogartiac_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogareccod_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Oglocalizac_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Oglocalizc__Z_SetNull( );
      }
      SetDirty("Oglinha");
      gxTv_SdtOgGuiaImport_Oglinha = value ;
   }

   public String getgxTv_SdtOgGuiaImport_Ogemprcod( )
   {
      return gxTv_SdtOgGuiaImport_Ogemprcod ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogemprcod( String value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      if ( GXutil.strcmp(gxTv_SdtOgGuiaImport_Ogemprcod, value) != 0 )
      {
         gxTv_SdtOgGuiaImport_Mode = "INS" ;
         this.setgxTv_SdtOgGuiaImport_Oglinha_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogemprcod_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogclicod_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ognmrguia_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogserie_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogfecha_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogcodart_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogrolos_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogrolos__Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogquant_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogquant__Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogunidad_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogunidad__Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogreferen_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogreclam_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Oglote_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogjogo_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogpoleg_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogfio_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogfio__Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogmaqui_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogentrada_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogvossar_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogarticr_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogartiac_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogareccod_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Oglocalizac_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Oglocalizc__Z_SetNull( );
      }
      SetDirty("Ogemprcod");
      gxTv_SdtOgGuiaImport_Ogemprcod = value ;
   }

   public long getgxTv_SdtOgGuiaImport_Ogclicod( )
   {
      return gxTv_SdtOgGuiaImport_Ogclicod ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogclicod( long value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      if ( gxTv_SdtOgGuiaImport_Ogclicod != value )
      {
         gxTv_SdtOgGuiaImport_Mode = "INS" ;
         this.setgxTv_SdtOgGuiaImport_Oglinha_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogemprcod_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogclicod_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ognmrguia_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogserie_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogfecha_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogcodart_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogrolos_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogrolos__Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogquant_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogquant__Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogunidad_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogunidad__Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogreferen_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogreclam_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Oglote_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogjogo_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogpoleg_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogfio_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogfio__Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogmaqui_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogentrada_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogvossar_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogarticr_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogartiac_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Ogareccod_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Oglocalizac_Z_SetNull( );
         this.setgxTv_SdtOgGuiaImport_Oglocalizc__Z_SetNull( );
      }
      SetDirty("Ogclicod");
      gxTv_SdtOgGuiaImport_Ogclicod = value ;
   }

   public long getgxTv_SdtOgGuiaImport_Ognmrguia( )
   {
      return gxTv_SdtOgGuiaImport_Ognmrguia ;
   }

   public void setgxTv_SdtOgGuiaImport_Ognmrguia( long value )
   {
      gxTv_SdtOgGuiaImport_Ognmrguia_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ognmrguia");
      gxTv_SdtOgGuiaImport_Ognmrguia = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ognmrguia_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ognmrguia_N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Ognmrguia = 0 ;
      SetDirty("Ognmrguia");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ognmrguia_IsNull( )
   {
      return (gxTv_SdtOgGuiaImport_Ognmrguia_N==1) ;
   }

   public short getgxTv_SdtOgGuiaImport_Ogserie( )
   {
      return gxTv_SdtOgGuiaImport_Ogserie ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogserie( short value )
   {
      gxTv_SdtOgGuiaImport_Ogserie_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogserie");
      gxTv_SdtOgGuiaImport_Ogserie = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogserie_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogserie_N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Ogserie = (short)(0) ;
      SetDirty("Ogserie");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogserie_IsNull( )
   {
      return (gxTv_SdtOgGuiaImport_Ogserie_N==1) ;
   }

   public java.util.Date getgxTv_SdtOgGuiaImport_Ogfecha( )
   {
      return gxTv_SdtOgGuiaImport_Ogfecha ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogfecha( java.util.Date value )
   {
      gxTv_SdtOgGuiaImport_Ogfecha_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogfecha");
      gxTv_SdtOgGuiaImport_Ogfecha = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogfecha_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogfecha_N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Ogfecha = GXutil.nullDate() ;
      SetDirty("Ogfecha");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogfecha_IsNull( )
   {
      return (gxTv_SdtOgGuiaImport_Ogfecha_N==1) ;
   }

   public String getgxTv_SdtOgGuiaImport_Ogcodart( )
   {
      return gxTv_SdtOgGuiaImport_Ogcodart ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogcodart( String value )
   {
      gxTv_SdtOgGuiaImport_Ogcodart_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogcodart");
      gxTv_SdtOgGuiaImport_Ogcodart = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogcodart_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogcodart_N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Ogcodart = "" ;
      SetDirty("Ogcodart");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogcodart_IsNull( )
   {
      return (gxTv_SdtOgGuiaImport_Ogcodart_N==1) ;
   }

   public short getgxTv_SdtOgGuiaImport_Ogrolos( )
   {
      return gxTv_SdtOgGuiaImport_Ogrolos ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogrolos( short value )
   {
      gxTv_SdtOgGuiaImport_Ogrolos_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogrolos");
      gxTv_SdtOgGuiaImport_Ogrolos = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogrolos_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogrolos_N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Ogrolos = (short)(0) ;
      SetDirty("Ogrolos");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogrolos_IsNull( )
   {
      return (gxTv_SdtOgGuiaImport_Ogrolos_N==1) ;
   }

   public short getgxTv_SdtOgGuiaImport_Ogrolos_( )
   {
      return gxTv_SdtOgGuiaImport_Ogrolos_ ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogrolos_( short value )
   {
      gxTv_SdtOgGuiaImport_Ogrolos__N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogrolos_");
      gxTv_SdtOgGuiaImport_Ogrolos_ = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogrolos__SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogrolos__N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Ogrolos_ = (short)(0) ;
      SetDirty("Ogrolos_");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogrolos__IsNull( )
   {
      return (gxTv_SdtOgGuiaImport_Ogrolos__N==1) ;
   }

   public java.math.BigDecimal getgxTv_SdtOgGuiaImport_Ogquant( )
   {
      return gxTv_SdtOgGuiaImport_Ogquant ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogquant( java.math.BigDecimal value )
   {
      gxTv_SdtOgGuiaImport_Ogquant_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogquant");
      gxTv_SdtOgGuiaImport_Ogquant = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogquant_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogquant_N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Ogquant = DecimalUtil.ZERO ;
      SetDirty("Ogquant");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogquant_IsNull( )
   {
      return (gxTv_SdtOgGuiaImport_Ogquant_N==1) ;
   }

   public java.math.BigDecimal getgxTv_SdtOgGuiaImport_Ogquant_( )
   {
      return gxTv_SdtOgGuiaImport_Ogquant_ ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogquant_( java.math.BigDecimal value )
   {
      gxTv_SdtOgGuiaImport_Ogquant__N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogquant_");
      gxTv_SdtOgGuiaImport_Ogquant_ = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogquant__SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogquant__N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Ogquant_ = DecimalUtil.ZERO ;
      SetDirty("Ogquant_");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogquant__IsNull( )
   {
      return (gxTv_SdtOgGuiaImport_Ogquant__N==1) ;
   }

   public String getgxTv_SdtOgGuiaImport_Ogunidad( )
   {
      return gxTv_SdtOgGuiaImport_Ogunidad ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogunidad( String value )
   {
      gxTv_SdtOgGuiaImport_Ogunidad_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogunidad");
      gxTv_SdtOgGuiaImport_Ogunidad = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogunidad_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogunidad_N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Ogunidad = "" ;
      SetDirty("Ogunidad");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogunidad_IsNull( )
   {
      return (gxTv_SdtOgGuiaImport_Ogunidad_N==1) ;
   }

   public String getgxTv_SdtOgGuiaImport_Ogunidad_( )
   {
      return gxTv_SdtOgGuiaImport_Ogunidad_ ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogunidad_( String value )
   {
      gxTv_SdtOgGuiaImport_Ogunidad__N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogunidad_");
      gxTv_SdtOgGuiaImport_Ogunidad_ = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogunidad__SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogunidad__N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Ogunidad_ = "" ;
      SetDirty("Ogunidad_");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogunidad__IsNull( )
   {
      return (gxTv_SdtOgGuiaImport_Ogunidad__N==1) ;
   }

   public String getgxTv_SdtOgGuiaImport_Ogreferen( )
   {
      return gxTv_SdtOgGuiaImport_Ogreferen ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogreferen( String value )
   {
      gxTv_SdtOgGuiaImport_Ogreferen_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogreferen");
      gxTv_SdtOgGuiaImport_Ogreferen = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogreferen_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogreferen_N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Ogreferen = "" ;
      SetDirty("Ogreferen");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogreferen_IsNull( )
   {
      return (gxTv_SdtOgGuiaImport_Ogreferen_N==1) ;
   }

   public String getgxTv_SdtOgGuiaImport_Ogreclam( )
   {
      return gxTv_SdtOgGuiaImport_Ogreclam ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogreclam( String value )
   {
      gxTv_SdtOgGuiaImport_Ogreclam_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogreclam");
      gxTv_SdtOgGuiaImport_Ogreclam = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogreclam_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogreclam_N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Ogreclam = "" ;
      SetDirty("Ogreclam");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogreclam_IsNull( )
   {
      return (gxTv_SdtOgGuiaImport_Ogreclam_N==1) ;
   }

   public String getgxTv_SdtOgGuiaImport_Oglote( )
   {
      return gxTv_SdtOgGuiaImport_Oglote ;
   }

   public void setgxTv_SdtOgGuiaImport_Oglote( String value )
   {
      gxTv_SdtOgGuiaImport_Oglote_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Oglote");
      gxTv_SdtOgGuiaImport_Oglote = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Oglote_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Oglote_N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Oglote = "" ;
      SetDirty("Oglote");
   }

   public boolean getgxTv_SdtOgGuiaImport_Oglote_IsNull( )
   {
      return (gxTv_SdtOgGuiaImport_Oglote_N==1) ;
   }

   public String getgxTv_SdtOgGuiaImport_Ogjogo( )
   {
      return gxTv_SdtOgGuiaImport_Ogjogo ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogjogo( String value )
   {
      gxTv_SdtOgGuiaImport_Ogjogo_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogjogo");
      gxTv_SdtOgGuiaImport_Ogjogo = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogjogo_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogjogo_N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Ogjogo = "" ;
      SetDirty("Ogjogo");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogjogo_IsNull( )
   {
      return (gxTv_SdtOgGuiaImport_Ogjogo_N==1) ;
   }

   public String getgxTv_SdtOgGuiaImport_Ogpoleg( )
   {
      return gxTv_SdtOgGuiaImport_Ogpoleg ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogpoleg( String value )
   {
      gxTv_SdtOgGuiaImport_Ogpoleg_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogpoleg");
      gxTv_SdtOgGuiaImport_Ogpoleg = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogpoleg_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogpoleg_N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Ogpoleg = "" ;
      SetDirty("Ogpoleg");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogpoleg_IsNull( )
   {
      return (gxTv_SdtOgGuiaImport_Ogpoleg_N==1) ;
   }

   public String getgxTv_SdtOgGuiaImport_Ogfio( )
   {
      return gxTv_SdtOgGuiaImport_Ogfio ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogfio( String value )
   {
      gxTv_SdtOgGuiaImport_Ogfio_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogfio");
      gxTv_SdtOgGuiaImport_Ogfio = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogfio_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogfio_N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Ogfio = "" ;
      SetDirty("Ogfio");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogfio_IsNull( )
   {
      return (gxTv_SdtOgGuiaImport_Ogfio_N==1) ;
   }

   public String getgxTv_SdtOgGuiaImport_Ogfio_( )
   {
      return gxTv_SdtOgGuiaImport_Ogfio_ ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogfio_( String value )
   {
      gxTv_SdtOgGuiaImport_Ogfio__N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogfio_");
      gxTv_SdtOgGuiaImport_Ogfio_ = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogfio__SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogfio__N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Ogfio_ = "" ;
      SetDirty("Ogfio_");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogfio__IsNull( )
   {
      return (gxTv_SdtOgGuiaImport_Ogfio__N==1) ;
   }

   public String getgxTv_SdtOgGuiaImport_Ogmaqui( )
   {
      return gxTv_SdtOgGuiaImport_Ogmaqui ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogmaqui( String value )
   {
      gxTv_SdtOgGuiaImport_Ogmaqui_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogmaqui");
      gxTv_SdtOgGuiaImport_Ogmaqui = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogmaqui_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogmaqui_N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Ogmaqui = "" ;
      SetDirty("Ogmaqui");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogmaqui_IsNull( )
   {
      return (gxTv_SdtOgGuiaImport_Ogmaqui_N==1) ;
   }

   public String getgxTv_SdtOgGuiaImport_Ogentrada( )
   {
      return gxTv_SdtOgGuiaImport_Ogentrada ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogentrada( String value )
   {
      gxTv_SdtOgGuiaImport_Ogentrada_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogentrada");
      gxTv_SdtOgGuiaImport_Ogentrada = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogentrada_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogentrada_N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Ogentrada = "" ;
      SetDirty("Ogentrada");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogentrada_IsNull( )
   {
      return (gxTv_SdtOgGuiaImport_Ogentrada_N==1) ;
   }

   public String getgxTv_SdtOgGuiaImport_Ogvossar( )
   {
      return gxTv_SdtOgGuiaImport_Ogvossar ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogvossar( String value )
   {
      gxTv_SdtOgGuiaImport_Ogvossar_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogvossar");
      gxTv_SdtOgGuiaImport_Ogvossar = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogvossar_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogvossar_N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Ogvossar = "" ;
      SetDirty("Ogvossar");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogvossar_IsNull( )
   {
      return (gxTv_SdtOgGuiaImport_Ogvossar_N==1) ;
   }

   public String getgxTv_SdtOgGuiaImport_Ogarticr( )
   {
      return gxTv_SdtOgGuiaImport_Ogarticr ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogarticr( String value )
   {
      gxTv_SdtOgGuiaImport_Ogarticr_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogarticr");
      gxTv_SdtOgGuiaImport_Ogarticr = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogarticr_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogarticr_N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Ogarticr = "" ;
      SetDirty("Ogarticr");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogarticr_IsNull( )
   {
      return (gxTv_SdtOgGuiaImport_Ogarticr_N==1) ;
   }

   public String getgxTv_SdtOgGuiaImport_Ogartiac( )
   {
      return gxTv_SdtOgGuiaImport_Ogartiac ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogartiac( String value )
   {
      gxTv_SdtOgGuiaImport_Ogartiac_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogartiac");
      gxTv_SdtOgGuiaImport_Ogartiac = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogartiac_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogartiac_N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Ogartiac = "" ;
      SetDirty("Ogartiac");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogartiac_IsNull( )
   {
      return (gxTv_SdtOgGuiaImport_Ogartiac_N==1) ;
   }

   public int getgxTv_SdtOgGuiaImport_Ogareccod( )
   {
      return gxTv_SdtOgGuiaImport_Ogareccod ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogareccod( int value )
   {
      gxTv_SdtOgGuiaImport_Ogareccod_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogareccod");
      gxTv_SdtOgGuiaImport_Ogareccod = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogareccod_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogareccod_N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Ogareccod = 0 ;
      SetDirty("Ogareccod");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogareccod_IsNull( )
   {
      return (gxTv_SdtOgGuiaImport_Ogareccod_N==1) ;
   }

   public String getgxTv_SdtOgGuiaImport_Oglocalizac( )
   {
      return gxTv_SdtOgGuiaImport_Oglocalizac ;
   }

   public void setgxTv_SdtOgGuiaImport_Oglocalizac( String value )
   {
      gxTv_SdtOgGuiaImport_Oglocalizac_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Oglocalizac");
      gxTv_SdtOgGuiaImport_Oglocalizac = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Oglocalizac_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Oglocalizac_N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Oglocalizac = "" ;
      SetDirty("Oglocalizac");
   }

   public boolean getgxTv_SdtOgGuiaImport_Oglocalizac_IsNull( )
   {
      return (gxTv_SdtOgGuiaImport_Oglocalizac_N==1) ;
   }

   public String getgxTv_SdtOgGuiaImport_Oglocalizc_( )
   {
      return gxTv_SdtOgGuiaImport_Oglocalizc_ ;
   }

   public void setgxTv_SdtOgGuiaImport_Oglocalizc_( String value )
   {
      gxTv_SdtOgGuiaImport_Oglocalizc__N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Oglocalizc_");
      gxTv_SdtOgGuiaImport_Oglocalizc_ = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Oglocalizc__SetNull( )
   {
      gxTv_SdtOgGuiaImport_Oglocalizc__N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Oglocalizc_ = "" ;
      SetDirty("Oglocalizc_");
   }

   public boolean getgxTv_SdtOgGuiaImport_Oglocalizc__IsNull( )
   {
      return (gxTv_SdtOgGuiaImport_Oglocalizc__N==1) ;
   }

   public String getgxTv_SdtOgGuiaImport_Mode( )
   {
      return gxTv_SdtOgGuiaImport_Mode ;
   }

   public void setgxTv_SdtOgGuiaImport_Mode( String value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Mode");
      gxTv_SdtOgGuiaImport_Mode = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Mode_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_SdtOgGuiaImport_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtOgGuiaImport_Initialized( )
   {
      return gxTv_SdtOgGuiaImport_Initialized ;
   }

   public void setgxTv_SdtOgGuiaImport_Initialized( short value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Initialized");
      gxTv_SdtOgGuiaImport_Initialized = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Initialized_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_SdtOgGuiaImport_Initialized_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtOgGuiaImport_Oglinha_Z( )
   {
      return gxTv_SdtOgGuiaImport_Oglinha_Z ;
   }

   public void setgxTv_SdtOgGuiaImport_Oglinha_Z( long value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Oglinha_Z");
      gxTv_SdtOgGuiaImport_Oglinha_Z = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Oglinha_Z_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Oglinha_Z = 0 ;
      SetDirty("Oglinha_Z");
   }

   public boolean getgxTv_SdtOgGuiaImport_Oglinha_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtOgGuiaImport_Ogemprcod_Z( )
   {
      return gxTv_SdtOgGuiaImport_Ogemprcod_Z ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogemprcod_Z( String value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogemprcod_Z");
      gxTv_SdtOgGuiaImport_Ogemprcod_Z = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogemprcod_Z_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogemprcod_Z = "" ;
      SetDirty("Ogemprcod_Z");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogemprcod_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtOgGuiaImport_Ogclicod_Z( )
   {
      return gxTv_SdtOgGuiaImport_Ogclicod_Z ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogclicod_Z( long value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogclicod_Z");
      gxTv_SdtOgGuiaImport_Ogclicod_Z = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogclicod_Z_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogclicod_Z = 0 ;
      SetDirty("Ogclicod_Z");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogclicod_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtOgGuiaImport_Ognmrguia_Z( )
   {
      return gxTv_SdtOgGuiaImport_Ognmrguia_Z ;
   }

   public void setgxTv_SdtOgGuiaImport_Ognmrguia_Z( long value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ognmrguia_Z");
      gxTv_SdtOgGuiaImport_Ognmrguia_Z = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ognmrguia_Z_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ognmrguia_Z = 0 ;
      SetDirty("Ognmrguia_Z");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ognmrguia_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtOgGuiaImport_Ogserie_Z( )
   {
      return gxTv_SdtOgGuiaImport_Ogserie_Z ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogserie_Z( short value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogserie_Z");
      gxTv_SdtOgGuiaImport_Ogserie_Z = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogserie_Z_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogserie_Z = (short)(0) ;
      SetDirty("Ogserie_Z");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogserie_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtOgGuiaImport_Ogfecha_Z( )
   {
      return gxTv_SdtOgGuiaImport_Ogfecha_Z ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogfecha_Z( java.util.Date value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogfecha_Z");
      gxTv_SdtOgGuiaImport_Ogfecha_Z = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogfecha_Z_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogfecha_Z = GXutil.nullDate() ;
      SetDirty("Ogfecha_Z");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogfecha_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtOgGuiaImport_Ogcodart_Z( )
   {
      return gxTv_SdtOgGuiaImport_Ogcodart_Z ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogcodart_Z( String value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogcodart_Z");
      gxTv_SdtOgGuiaImport_Ogcodart_Z = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogcodart_Z_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogcodart_Z = "" ;
      SetDirty("Ogcodart_Z");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogcodart_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtOgGuiaImport_Ogrolos_Z( )
   {
      return gxTv_SdtOgGuiaImport_Ogrolos_Z ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogrolos_Z( short value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogrolos_Z");
      gxTv_SdtOgGuiaImport_Ogrolos_Z = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogrolos_Z_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogrolos_Z = (short)(0) ;
      SetDirty("Ogrolos_Z");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogrolos_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtOgGuiaImport_Ogrolos__Z( )
   {
      return gxTv_SdtOgGuiaImport_Ogrolos__Z ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogrolos__Z( short value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogrolos__Z");
      gxTv_SdtOgGuiaImport_Ogrolos__Z = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogrolos__Z_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogrolos__Z = (short)(0) ;
      SetDirty("Ogrolos__Z");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogrolos__Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtOgGuiaImport_Ogquant_Z( )
   {
      return gxTv_SdtOgGuiaImport_Ogquant_Z ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogquant_Z( java.math.BigDecimal value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogquant_Z");
      gxTv_SdtOgGuiaImport_Ogquant_Z = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogquant_Z_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogquant_Z = DecimalUtil.ZERO ;
      SetDirty("Ogquant_Z");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogquant_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtOgGuiaImport_Ogquant__Z( )
   {
      return gxTv_SdtOgGuiaImport_Ogquant__Z ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogquant__Z( java.math.BigDecimal value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogquant__Z");
      gxTv_SdtOgGuiaImport_Ogquant__Z = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogquant__Z_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogquant__Z = DecimalUtil.ZERO ;
      SetDirty("Ogquant__Z");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogquant__Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtOgGuiaImport_Ogunidad_Z( )
   {
      return gxTv_SdtOgGuiaImport_Ogunidad_Z ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogunidad_Z( String value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogunidad_Z");
      gxTv_SdtOgGuiaImport_Ogunidad_Z = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogunidad_Z_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogunidad_Z = "" ;
      SetDirty("Ogunidad_Z");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogunidad_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtOgGuiaImport_Ogunidad__Z( )
   {
      return gxTv_SdtOgGuiaImport_Ogunidad__Z ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogunidad__Z( String value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogunidad__Z");
      gxTv_SdtOgGuiaImport_Ogunidad__Z = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogunidad__Z_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogunidad__Z = "" ;
      SetDirty("Ogunidad__Z");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogunidad__Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtOgGuiaImport_Ogreferen_Z( )
   {
      return gxTv_SdtOgGuiaImport_Ogreferen_Z ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogreferen_Z( String value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogreferen_Z");
      gxTv_SdtOgGuiaImport_Ogreferen_Z = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogreferen_Z_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogreferen_Z = "" ;
      SetDirty("Ogreferen_Z");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogreferen_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtOgGuiaImport_Ogreclam_Z( )
   {
      return gxTv_SdtOgGuiaImport_Ogreclam_Z ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogreclam_Z( String value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogreclam_Z");
      gxTv_SdtOgGuiaImport_Ogreclam_Z = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogreclam_Z_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogreclam_Z = "" ;
      SetDirty("Ogreclam_Z");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogreclam_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtOgGuiaImport_Oglote_Z( )
   {
      return gxTv_SdtOgGuiaImport_Oglote_Z ;
   }

   public void setgxTv_SdtOgGuiaImport_Oglote_Z( String value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Oglote_Z");
      gxTv_SdtOgGuiaImport_Oglote_Z = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Oglote_Z_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Oglote_Z = "" ;
      SetDirty("Oglote_Z");
   }

   public boolean getgxTv_SdtOgGuiaImport_Oglote_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtOgGuiaImport_Ogjogo_Z( )
   {
      return gxTv_SdtOgGuiaImport_Ogjogo_Z ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogjogo_Z( String value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogjogo_Z");
      gxTv_SdtOgGuiaImport_Ogjogo_Z = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogjogo_Z_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogjogo_Z = "" ;
      SetDirty("Ogjogo_Z");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogjogo_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtOgGuiaImport_Ogpoleg_Z( )
   {
      return gxTv_SdtOgGuiaImport_Ogpoleg_Z ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogpoleg_Z( String value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogpoleg_Z");
      gxTv_SdtOgGuiaImport_Ogpoleg_Z = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogpoleg_Z_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogpoleg_Z = "" ;
      SetDirty("Ogpoleg_Z");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogpoleg_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtOgGuiaImport_Ogfio_Z( )
   {
      return gxTv_SdtOgGuiaImport_Ogfio_Z ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogfio_Z( String value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogfio_Z");
      gxTv_SdtOgGuiaImport_Ogfio_Z = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogfio_Z_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogfio_Z = "" ;
      SetDirty("Ogfio_Z");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogfio_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtOgGuiaImport_Ogfio__Z( )
   {
      return gxTv_SdtOgGuiaImport_Ogfio__Z ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogfio__Z( String value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogfio__Z");
      gxTv_SdtOgGuiaImport_Ogfio__Z = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogfio__Z_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogfio__Z = "" ;
      SetDirty("Ogfio__Z");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogfio__Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtOgGuiaImport_Ogmaqui_Z( )
   {
      return gxTv_SdtOgGuiaImport_Ogmaqui_Z ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogmaqui_Z( String value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogmaqui_Z");
      gxTv_SdtOgGuiaImport_Ogmaqui_Z = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogmaqui_Z_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogmaqui_Z = "" ;
      SetDirty("Ogmaqui_Z");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogmaqui_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtOgGuiaImport_Ogentrada_Z( )
   {
      return gxTv_SdtOgGuiaImport_Ogentrada_Z ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogentrada_Z( String value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogentrada_Z");
      gxTv_SdtOgGuiaImport_Ogentrada_Z = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogentrada_Z_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogentrada_Z = "" ;
      SetDirty("Ogentrada_Z");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogentrada_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtOgGuiaImport_Ogvossar_Z( )
   {
      return gxTv_SdtOgGuiaImport_Ogvossar_Z ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogvossar_Z( String value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogvossar_Z");
      gxTv_SdtOgGuiaImport_Ogvossar_Z = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogvossar_Z_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogvossar_Z = "" ;
      SetDirty("Ogvossar_Z");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogvossar_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtOgGuiaImport_Ogarticr_Z( )
   {
      return gxTv_SdtOgGuiaImport_Ogarticr_Z ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogarticr_Z( String value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogarticr_Z");
      gxTv_SdtOgGuiaImport_Ogarticr_Z = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogarticr_Z_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogarticr_Z = "" ;
      SetDirty("Ogarticr_Z");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogarticr_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtOgGuiaImport_Ogartiac_Z( )
   {
      return gxTv_SdtOgGuiaImport_Ogartiac_Z ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogartiac_Z( String value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogartiac_Z");
      gxTv_SdtOgGuiaImport_Ogartiac_Z = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogartiac_Z_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogartiac_Z = "" ;
      SetDirty("Ogartiac_Z");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogartiac_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtOgGuiaImport_Ogareccod_Z( )
   {
      return gxTv_SdtOgGuiaImport_Ogareccod_Z ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogareccod_Z( int value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogareccod_Z");
      gxTv_SdtOgGuiaImport_Ogareccod_Z = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogareccod_Z_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogareccod_Z = 0 ;
      SetDirty("Ogareccod_Z");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogareccod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtOgGuiaImport_Oglocalizac_Z( )
   {
      return gxTv_SdtOgGuiaImport_Oglocalizac_Z ;
   }

   public void setgxTv_SdtOgGuiaImport_Oglocalizac_Z( String value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Oglocalizac_Z");
      gxTv_SdtOgGuiaImport_Oglocalizac_Z = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Oglocalizac_Z_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Oglocalizac_Z = "" ;
      SetDirty("Oglocalizac_Z");
   }

   public boolean getgxTv_SdtOgGuiaImport_Oglocalizac_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtOgGuiaImport_Oglocalizc__Z( )
   {
      return gxTv_SdtOgGuiaImport_Oglocalizc__Z ;
   }

   public void setgxTv_SdtOgGuiaImport_Oglocalizc__Z( String value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Oglocalizc__Z");
      gxTv_SdtOgGuiaImport_Oglocalizc__Z = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Oglocalizc__Z_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Oglocalizc__Z = "" ;
      SetDirty("Oglocalizc__Z");
   }

   public boolean getgxTv_SdtOgGuiaImport_Oglocalizc__Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtOgGuiaImport_Ognmrguia_N( )
   {
      return gxTv_SdtOgGuiaImport_Ognmrguia_N ;
   }

   public void setgxTv_SdtOgGuiaImport_Ognmrguia_N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ognmrguia_N");
      gxTv_SdtOgGuiaImport_Ognmrguia_N = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ognmrguia_N_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ognmrguia_N = (byte)(0) ;
      SetDirty("Ognmrguia_N");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ognmrguia_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtOgGuiaImport_Ogserie_N( )
   {
      return gxTv_SdtOgGuiaImport_Ogserie_N ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogserie_N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogserie_N");
      gxTv_SdtOgGuiaImport_Ogserie_N = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogserie_N_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogserie_N = (byte)(0) ;
      SetDirty("Ogserie_N");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogserie_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtOgGuiaImport_Ogfecha_N( )
   {
      return gxTv_SdtOgGuiaImport_Ogfecha_N ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogfecha_N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogfecha_N");
      gxTv_SdtOgGuiaImport_Ogfecha_N = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogfecha_N_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogfecha_N = (byte)(0) ;
      SetDirty("Ogfecha_N");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogfecha_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtOgGuiaImport_Ogcodart_N( )
   {
      return gxTv_SdtOgGuiaImport_Ogcodart_N ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogcodart_N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogcodart_N");
      gxTv_SdtOgGuiaImport_Ogcodart_N = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogcodart_N_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogcodart_N = (byte)(0) ;
      SetDirty("Ogcodart_N");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogcodart_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtOgGuiaImport_Ogrolos_N( )
   {
      return gxTv_SdtOgGuiaImport_Ogrolos_N ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogrolos_N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogrolos_N");
      gxTv_SdtOgGuiaImport_Ogrolos_N = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogrolos_N_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogrolos_N = (byte)(0) ;
      SetDirty("Ogrolos_N");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogrolos_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtOgGuiaImport_Ogrolos__N( )
   {
      return gxTv_SdtOgGuiaImport_Ogrolos__N ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogrolos__N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogrolos__N");
      gxTv_SdtOgGuiaImport_Ogrolos__N = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogrolos__N_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogrolos__N = (byte)(0) ;
      SetDirty("Ogrolos__N");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogrolos__N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtOgGuiaImport_Ogquant_N( )
   {
      return gxTv_SdtOgGuiaImport_Ogquant_N ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogquant_N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogquant_N");
      gxTv_SdtOgGuiaImport_Ogquant_N = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogquant_N_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogquant_N = (byte)(0) ;
      SetDirty("Ogquant_N");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogquant_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtOgGuiaImport_Ogquant__N( )
   {
      return gxTv_SdtOgGuiaImport_Ogquant__N ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogquant__N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogquant__N");
      gxTv_SdtOgGuiaImport_Ogquant__N = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogquant__N_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogquant__N = (byte)(0) ;
      SetDirty("Ogquant__N");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogquant__N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtOgGuiaImport_Ogunidad_N( )
   {
      return gxTv_SdtOgGuiaImport_Ogunidad_N ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogunidad_N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogunidad_N");
      gxTv_SdtOgGuiaImport_Ogunidad_N = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogunidad_N_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogunidad_N = (byte)(0) ;
      SetDirty("Ogunidad_N");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogunidad_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtOgGuiaImport_Ogunidad__N( )
   {
      return gxTv_SdtOgGuiaImport_Ogunidad__N ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogunidad__N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogunidad__N");
      gxTv_SdtOgGuiaImport_Ogunidad__N = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogunidad__N_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogunidad__N = (byte)(0) ;
      SetDirty("Ogunidad__N");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogunidad__N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtOgGuiaImport_Ogreferen_N( )
   {
      return gxTv_SdtOgGuiaImport_Ogreferen_N ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogreferen_N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogreferen_N");
      gxTv_SdtOgGuiaImport_Ogreferen_N = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogreferen_N_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogreferen_N = (byte)(0) ;
      SetDirty("Ogreferen_N");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogreferen_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtOgGuiaImport_Ogreclam_N( )
   {
      return gxTv_SdtOgGuiaImport_Ogreclam_N ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogreclam_N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogreclam_N");
      gxTv_SdtOgGuiaImport_Ogreclam_N = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogreclam_N_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogreclam_N = (byte)(0) ;
      SetDirty("Ogreclam_N");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogreclam_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtOgGuiaImport_Oglote_N( )
   {
      return gxTv_SdtOgGuiaImport_Oglote_N ;
   }

   public void setgxTv_SdtOgGuiaImport_Oglote_N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Oglote_N");
      gxTv_SdtOgGuiaImport_Oglote_N = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Oglote_N_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Oglote_N = (byte)(0) ;
      SetDirty("Oglote_N");
   }

   public boolean getgxTv_SdtOgGuiaImport_Oglote_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtOgGuiaImport_Ogjogo_N( )
   {
      return gxTv_SdtOgGuiaImport_Ogjogo_N ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogjogo_N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogjogo_N");
      gxTv_SdtOgGuiaImport_Ogjogo_N = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogjogo_N_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogjogo_N = (byte)(0) ;
      SetDirty("Ogjogo_N");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogjogo_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtOgGuiaImport_Ogpoleg_N( )
   {
      return gxTv_SdtOgGuiaImport_Ogpoleg_N ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogpoleg_N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogpoleg_N");
      gxTv_SdtOgGuiaImport_Ogpoleg_N = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogpoleg_N_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogpoleg_N = (byte)(0) ;
      SetDirty("Ogpoleg_N");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogpoleg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtOgGuiaImport_Ogfio_N( )
   {
      return gxTv_SdtOgGuiaImport_Ogfio_N ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogfio_N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogfio_N");
      gxTv_SdtOgGuiaImport_Ogfio_N = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogfio_N_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogfio_N = (byte)(0) ;
      SetDirty("Ogfio_N");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogfio_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtOgGuiaImport_Ogfio__N( )
   {
      return gxTv_SdtOgGuiaImport_Ogfio__N ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogfio__N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogfio__N");
      gxTv_SdtOgGuiaImport_Ogfio__N = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogfio__N_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogfio__N = (byte)(0) ;
      SetDirty("Ogfio__N");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogfio__N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtOgGuiaImport_Ogmaqui_N( )
   {
      return gxTv_SdtOgGuiaImport_Ogmaqui_N ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogmaqui_N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogmaqui_N");
      gxTv_SdtOgGuiaImport_Ogmaqui_N = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogmaqui_N_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogmaqui_N = (byte)(0) ;
      SetDirty("Ogmaqui_N");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogmaqui_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtOgGuiaImport_Ogentrada_N( )
   {
      return gxTv_SdtOgGuiaImport_Ogentrada_N ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogentrada_N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogentrada_N");
      gxTv_SdtOgGuiaImport_Ogentrada_N = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogentrada_N_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogentrada_N = (byte)(0) ;
      SetDirty("Ogentrada_N");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogentrada_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtOgGuiaImport_Ogvossar_N( )
   {
      return gxTv_SdtOgGuiaImport_Ogvossar_N ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogvossar_N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogvossar_N");
      gxTv_SdtOgGuiaImport_Ogvossar_N = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogvossar_N_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogvossar_N = (byte)(0) ;
      SetDirty("Ogvossar_N");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogvossar_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtOgGuiaImport_Ogarticr_N( )
   {
      return gxTv_SdtOgGuiaImport_Ogarticr_N ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogarticr_N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogarticr_N");
      gxTv_SdtOgGuiaImport_Ogarticr_N = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogarticr_N_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogarticr_N = (byte)(0) ;
      SetDirty("Ogarticr_N");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogarticr_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtOgGuiaImport_Ogartiac_N( )
   {
      return gxTv_SdtOgGuiaImport_Ogartiac_N ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogartiac_N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogartiac_N");
      gxTv_SdtOgGuiaImport_Ogartiac_N = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogartiac_N_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogartiac_N = (byte)(0) ;
      SetDirty("Ogartiac_N");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogartiac_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtOgGuiaImport_Ogareccod_N( )
   {
      return gxTv_SdtOgGuiaImport_Ogareccod_N ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogareccod_N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Ogareccod_N");
      gxTv_SdtOgGuiaImport_Ogareccod_N = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Ogareccod_N_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Ogareccod_N = (byte)(0) ;
      SetDirty("Ogareccod_N");
   }

   public boolean getgxTv_SdtOgGuiaImport_Ogareccod_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtOgGuiaImport_Oglocalizac_N( )
   {
      return gxTv_SdtOgGuiaImport_Oglocalizac_N ;
   }

   public void setgxTv_SdtOgGuiaImport_Oglocalizac_N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Oglocalizac_N");
      gxTv_SdtOgGuiaImport_Oglocalizac_N = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Oglocalizac_N_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Oglocalizac_N = (byte)(0) ;
      SetDirty("Oglocalizac_N");
   }

   public boolean getgxTv_SdtOgGuiaImport_Oglocalizac_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtOgGuiaImport_Oglocalizc__N( )
   {
      return gxTv_SdtOgGuiaImport_Oglocalizc__N ;
   }

   public void setgxTv_SdtOgGuiaImport_Oglocalizc__N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      SetDirty("Oglocalizc__N");
      gxTv_SdtOgGuiaImport_Oglocalizc__N = value ;
   }

   public void setgxTv_SdtOgGuiaImport_Oglocalizc__N_SetNull( )
   {
      gxTv_SdtOgGuiaImport_Oglocalizc__N = (byte)(0) ;
      SetDirty("Oglocalizc__N");
   }

   public boolean getgxTv_SdtOgGuiaImport_Oglocalizc__N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      app.ponteway.v1.ogguiaimport_bc obj;
      obj = new app.ponteway.v1.ogguiaimport_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Ogemprcod = "" ;
      gxTv_SdtOgGuiaImport_Ogfecha = GXutil.nullDate() ;
      gxTv_SdtOgGuiaImport_Ogcodart = "" ;
      gxTv_SdtOgGuiaImport_Ogquant = DecimalUtil.ZERO ;
      gxTv_SdtOgGuiaImport_Ogquant_ = DecimalUtil.ZERO ;
      gxTv_SdtOgGuiaImport_Ogunidad = "" ;
      gxTv_SdtOgGuiaImport_Ogunidad_ = "" ;
      gxTv_SdtOgGuiaImport_Ogreferen = "" ;
      gxTv_SdtOgGuiaImport_Ogreclam = "" ;
      gxTv_SdtOgGuiaImport_Oglote = "" ;
      gxTv_SdtOgGuiaImport_Ogjogo = "" ;
      gxTv_SdtOgGuiaImport_Ogpoleg = "" ;
      gxTv_SdtOgGuiaImport_Ogfio = "" ;
      gxTv_SdtOgGuiaImport_Ogfio_ = "" ;
      gxTv_SdtOgGuiaImport_Ogmaqui = "" ;
      gxTv_SdtOgGuiaImport_Ogentrada = "" ;
      gxTv_SdtOgGuiaImport_Ogvossar = "" ;
      gxTv_SdtOgGuiaImport_Ogarticr = "" ;
      gxTv_SdtOgGuiaImport_Ogartiac = "" ;
      gxTv_SdtOgGuiaImport_Oglocalizac = "" ;
      gxTv_SdtOgGuiaImport_Oglocalizc_ = "" ;
      gxTv_SdtOgGuiaImport_Mode = "" ;
      gxTv_SdtOgGuiaImport_Ogemprcod_Z = "" ;
      gxTv_SdtOgGuiaImport_Ogfecha_Z = GXutil.nullDate() ;
      gxTv_SdtOgGuiaImport_Ogcodart_Z = "" ;
      gxTv_SdtOgGuiaImport_Ogquant_Z = DecimalUtil.ZERO ;
      gxTv_SdtOgGuiaImport_Ogquant__Z = DecimalUtil.ZERO ;
      gxTv_SdtOgGuiaImport_Ogunidad_Z = "" ;
      gxTv_SdtOgGuiaImport_Ogunidad__Z = "" ;
      gxTv_SdtOgGuiaImport_Ogreferen_Z = "" ;
      gxTv_SdtOgGuiaImport_Ogreclam_Z = "" ;
      gxTv_SdtOgGuiaImport_Oglote_Z = "" ;
      gxTv_SdtOgGuiaImport_Ogjogo_Z = "" ;
      gxTv_SdtOgGuiaImport_Ogpoleg_Z = "" ;
      gxTv_SdtOgGuiaImport_Ogfio_Z = "" ;
      gxTv_SdtOgGuiaImport_Ogfio__Z = "" ;
      gxTv_SdtOgGuiaImport_Ogmaqui_Z = "" ;
      gxTv_SdtOgGuiaImport_Ogentrada_Z = "" ;
      gxTv_SdtOgGuiaImport_Ogvossar_Z = "" ;
      gxTv_SdtOgGuiaImport_Ogarticr_Z = "" ;
      gxTv_SdtOgGuiaImport_Ogartiac_Z = "" ;
      gxTv_SdtOgGuiaImport_Oglocalizac_Z = "" ;
      gxTv_SdtOgGuiaImport_Oglocalizc__Z = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtOgGuiaImport_N ;
   }

   public app.ponteway.v1.SdtOgGuiaImport Clone( )
   {
      app.ponteway.v1.SdtOgGuiaImport sdt;
      app.ponteway.v1.ogguiaimport_bc obj;
      sdt = (app.ponteway.v1.SdtOgGuiaImport)(clone()) ;
      obj = (app.ponteway.v1.ogguiaimport_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( app.ponteway.v1.StructSdtOgGuiaImport struct )
   {
      setgxTv_SdtOgGuiaImport_Oglinha(struct.getOglinha());
      setgxTv_SdtOgGuiaImport_Ogemprcod(struct.getOgemprcod());
      setgxTv_SdtOgGuiaImport_Ogclicod(struct.getOgclicod());
      setgxTv_SdtOgGuiaImport_Ognmrguia(struct.getOgnmrguia());
      setgxTv_SdtOgGuiaImport_Ogserie(struct.getOgserie());
      setgxTv_SdtOgGuiaImport_Ogfecha(struct.getOgfecha());
      setgxTv_SdtOgGuiaImport_Ogcodart(struct.getOgcodart());
      setgxTv_SdtOgGuiaImport_Ogrolos(struct.getOgrolos());
      setgxTv_SdtOgGuiaImport_Ogrolos_(struct.getOgrolos_());
      setgxTv_SdtOgGuiaImport_Ogquant(struct.getOgquant());
      setgxTv_SdtOgGuiaImport_Ogquant_(struct.getOgquant_());
      setgxTv_SdtOgGuiaImport_Ogunidad(struct.getOgunidad());
      setgxTv_SdtOgGuiaImport_Ogunidad_(struct.getOgunidad_());
      setgxTv_SdtOgGuiaImport_Ogreferen(struct.getOgreferen());
      setgxTv_SdtOgGuiaImport_Ogreclam(struct.getOgreclam());
      setgxTv_SdtOgGuiaImport_Oglote(struct.getOglote());
      setgxTv_SdtOgGuiaImport_Ogjogo(struct.getOgjogo());
      setgxTv_SdtOgGuiaImport_Ogpoleg(struct.getOgpoleg());
      setgxTv_SdtOgGuiaImport_Ogfio(struct.getOgfio());
      setgxTv_SdtOgGuiaImport_Ogfio_(struct.getOgfio_());
      setgxTv_SdtOgGuiaImport_Ogmaqui(struct.getOgmaqui());
      setgxTv_SdtOgGuiaImport_Ogentrada(struct.getOgentrada());
      setgxTv_SdtOgGuiaImport_Ogvossar(struct.getOgvossar());
      setgxTv_SdtOgGuiaImport_Ogarticr(struct.getOgarticr());
      setgxTv_SdtOgGuiaImport_Ogartiac(struct.getOgartiac());
      setgxTv_SdtOgGuiaImport_Ogareccod(struct.getOgareccod());
      setgxTv_SdtOgGuiaImport_Oglocalizac(struct.getOglocalizac());
      setgxTv_SdtOgGuiaImport_Oglocalizc_(struct.getOglocalizc_());
      setgxTv_SdtOgGuiaImport_Mode(struct.getMode());
      setgxTv_SdtOgGuiaImport_Initialized(struct.getInitialized());
      setgxTv_SdtOgGuiaImport_Oglinha_Z(struct.getOglinha_Z());
      setgxTv_SdtOgGuiaImport_Ogemprcod_Z(struct.getOgemprcod_Z());
      setgxTv_SdtOgGuiaImport_Ogclicod_Z(struct.getOgclicod_Z());
      setgxTv_SdtOgGuiaImport_Ognmrguia_Z(struct.getOgnmrguia_Z());
      setgxTv_SdtOgGuiaImport_Ogserie_Z(struct.getOgserie_Z());
      setgxTv_SdtOgGuiaImport_Ogfecha_Z(struct.getOgfecha_Z());
      setgxTv_SdtOgGuiaImport_Ogcodart_Z(struct.getOgcodart_Z());
      setgxTv_SdtOgGuiaImport_Ogrolos_Z(struct.getOgrolos_Z());
      setgxTv_SdtOgGuiaImport_Ogrolos__Z(struct.getOgrolos__Z());
      setgxTv_SdtOgGuiaImport_Ogquant_Z(struct.getOgquant_Z());
      setgxTv_SdtOgGuiaImport_Ogquant__Z(struct.getOgquant__Z());
      setgxTv_SdtOgGuiaImport_Ogunidad_Z(struct.getOgunidad_Z());
      setgxTv_SdtOgGuiaImport_Ogunidad__Z(struct.getOgunidad__Z());
      setgxTv_SdtOgGuiaImport_Ogreferen_Z(struct.getOgreferen_Z());
      setgxTv_SdtOgGuiaImport_Ogreclam_Z(struct.getOgreclam_Z());
      setgxTv_SdtOgGuiaImport_Oglote_Z(struct.getOglote_Z());
      setgxTv_SdtOgGuiaImport_Ogjogo_Z(struct.getOgjogo_Z());
      setgxTv_SdtOgGuiaImport_Ogpoleg_Z(struct.getOgpoleg_Z());
      setgxTv_SdtOgGuiaImport_Ogfio_Z(struct.getOgfio_Z());
      setgxTv_SdtOgGuiaImport_Ogfio__Z(struct.getOgfio__Z());
      setgxTv_SdtOgGuiaImport_Ogmaqui_Z(struct.getOgmaqui_Z());
      setgxTv_SdtOgGuiaImport_Ogentrada_Z(struct.getOgentrada_Z());
      setgxTv_SdtOgGuiaImport_Ogvossar_Z(struct.getOgvossar_Z());
      setgxTv_SdtOgGuiaImport_Ogarticr_Z(struct.getOgarticr_Z());
      setgxTv_SdtOgGuiaImport_Ogartiac_Z(struct.getOgartiac_Z());
      setgxTv_SdtOgGuiaImport_Ogareccod_Z(struct.getOgareccod_Z());
      setgxTv_SdtOgGuiaImport_Oglocalizac_Z(struct.getOglocalizac_Z());
      setgxTv_SdtOgGuiaImport_Oglocalizc__Z(struct.getOglocalizc__Z());
      setgxTv_SdtOgGuiaImport_Ognmrguia_N(struct.getOgnmrguia_N());
      setgxTv_SdtOgGuiaImport_Ogserie_N(struct.getOgserie_N());
      setgxTv_SdtOgGuiaImport_Ogfecha_N(struct.getOgfecha_N());
      setgxTv_SdtOgGuiaImport_Ogcodart_N(struct.getOgcodart_N());
      setgxTv_SdtOgGuiaImport_Ogrolos_N(struct.getOgrolos_N());
      setgxTv_SdtOgGuiaImport_Ogrolos__N(struct.getOgrolos__N());
      setgxTv_SdtOgGuiaImport_Ogquant_N(struct.getOgquant_N());
      setgxTv_SdtOgGuiaImport_Ogquant__N(struct.getOgquant__N());
      setgxTv_SdtOgGuiaImport_Ogunidad_N(struct.getOgunidad_N());
      setgxTv_SdtOgGuiaImport_Ogunidad__N(struct.getOgunidad__N());
      setgxTv_SdtOgGuiaImport_Ogreferen_N(struct.getOgreferen_N());
      setgxTv_SdtOgGuiaImport_Ogreclam_N(struct.getOgreclam_N());
      setgxTv_SdtOgGuiaImport_Oglote_N(struct.getOglote_N());
      setgxTv_SdtOgGuiaImport_Ogjogo_N(struct.getOgjogo_N());
      setgxTv_SdtOgGuiaImport_Ogpoleg_N(struct.getOgpoleg_N());
      setgxTv_SdtOgGuiaImport_Ogfio_N(struct.getOgfio_N());
      setgxTv_SdtOgGuiaImport_Ogfio__N(struct.getOgfio__N());
      setgxTv_SdtOgGuiaImport_Ogmaqui_N(struct.getOgmaqui_N());
      setgxTv_SdtOgGuiaImport_Ogentrada_N(struct.getOgentrada_N());
      setgxTv_SdtOgGuiaImport_Ogvossar_N(struct.getOgvossar_N());
      setgxTv_SdtOgGuiaImport_Ogarticr_N(struct.getOgarticr_N());
      setgxTv_SdtOgGuiaImport_Ogartiac_N(struct.getOgartiac_N());
      setgxTv_SdtOgGuiaImport_Ogareccod_N(struct.getOgareccod_N());
      setgxTv_SdtOgGuiaImport_Oglocalizac_N(struct.getOglocalizac_N());
      setgxTv_SdtOgGuiaImport_Oglocalizc__N(struct.getOglocalizc__N());
   }

   @SuppressWarnings("unchecked")
   public app.ponteway.v1.StructSdtOgGuiaImport getStruct( )
   {
      app.ponteway.v1.StructSdtOgGuiaImport struct = new app.ponteway.v1.StructSdtOgGuiaImport ();
      struct.setOglinha(getgxTv_SdtOgGuiaImport_Oglinha());
      struct.setOgemprcod(getgxTv_SdtOgGuiaImport_Ogemprcod());
      struct.setOgclicod(getgxTv_SdtOgGuiaImport_Ogclicod());
      struct.setOgnmrguia(getgxTv_SdtOgGuiaImport_Ognmrguia());
      struct.setOgserie(getgxTv_SdtOgGuiaImport_Ogserie());
      struct.setOgfecha(getgxTv_SdtOgGuiaImport_Ogfecha());
      struct.setOgcodart(getgxTv_SdtOgGuiaImport_Ogcodart());
      struct.setOgrolos(getgxTv_SdtOgGuiaImport_Ogrolos());
      struct.setOgrolos_(getgxTv_SdtOgGuiaImport_Ogrolos_());
      struct.setOgquant(getgxTv_SdtOgGuiaImport_Ogquant());
      struct.setOgquant_(getgxTv_SdtOgGuiaImport_Ogquant_());
      struct.setOgunidad(getgxTv_SdtOgGuiaImport_Ogunidad());
      struct.setOgunidad_(getgxTv_SdtOgGuiaImport_Ogunidad_());
      struct.setOgreferen(getgxTv_SdtOgGuiaImport_Ogreferen());
      struct.setOgreclam(getgxTv_SdtOgGuiaImport_Ogreclam());
      struct.setOglote(getgxTv_SdtOgGuiaImport_Oglote());
      struct.setOgjogo(getgxTv_SdtOgGuiaImport_Ogjogo());
      struct.setOgpoleg(getgxTv_SdtOgGuiaImport_Ogpoleg());
      struct.setOgfio(getgxTv_SdtOgGuiaImport_Ogfio());
      struct.setOgfio_(getgxTv_SdtOgGuiaImport_Ogfio_());
      struct.setOgmaqui(getgxTv_SdtOgGuiaImport_Ogmaqui());
      struct.setOgentrada(getgxTv_SdtOgGuiaImport_Ogentrada());
      struct.setOgvossar(getgxTv_SdtOgGuiaImport_Ogvossar());
      struct.setOgarticr(getgxTv_SdtOgGuiaImport_Ogarticr());
      struct.setOgartiac(getgxTv_SdtOgGuiaImport_Ogartiac());
      struct.setOgareccod(getgxTv_SdtOgGuiaImport_Ogareccod());
      struct.setOglocalizac(getgxTv_SdtOgGuiaImport_Oglocalizac());
      struct.setOglocalizc_(getgxTv_SdtOgGuiaImport_Oglocalizc_());
      struct.setMode(getgxTv_SdtOgGuiaImport_Mode());
      struct.setInitialized(getgxTv_SdtOgGuiaImport_Initialized());
      struct.setOglinha_Z(getgxTv_SdtOgGuiaImport_Oglinha_Z());
      struct.setOgemprcod_Z(getgxTv_SdtOgGuiaImport_Ogemprcod_Z());
      struct.setOgclicod_Z(getgxTv_SdtOgGuiaImport_Ogclicod_Z());
      struct.setOgnmrguia_Z(getgxTv_SdtOgGuiaImport_Ognmrguia_Z());
      struct.setOgserie_Z(getgxTv_SdtOgGuiaImport_Ogserie_Z());
      struct.setOgfecha_Z(getgxTv_SdtOgGuiaImport_Ogfecha_Z());
      struct.setOgcodart_Z(getgxTv_SdtOgGuiaImport_Ogcodart_Z());
      struct.setOgrolos_Z(getgxTv_SdtOgGuiaImport_Ogrolos_Z());
      struct.setOgrolos__Z(getgxTv_SdtOgGuiaImport_Ogrolos__Z());
      struct.setOgquant_Z(getgxTv_SdtOgGuiaImport_Ogquant_Z());
      struct.setOgquant__Z(getgxTv_SdtOgGuiaImport_Ogquant__Z());
      struct.setOgunidad_Z(getgxTv_SdtOgGuiaImport_Ogunidad_Z());
      struct.setOgunidad__Z(getgxTv_SdtOgGuiaImport_Ogunidad__Z());
      struct.setOgreferen_Z(getgxTv_SdtOgGuiaImport_Ogreferen_Z());
      struct.setOgreclam_Z(getgxTv_SdtOgGuiaImport_Ogreclam_Z());
      struct.setOglote_Z(getgxTv_SdtOgGuiaImport_Oglote_Z());
      struct.setOgjogo_Z(getgxTv_SdtOgGuiaImport_Ogjogo_Z());
      struct.setOgpoleg_Z(getgxTv_SdtOgGuiaImport_Ogpoleg_Z());
      struct.setOgfio_Z(getgxTv_SdtOgGuiaImport_Ogfio_Z());
      struct.setOgfio__Z(getgxTv_SdtOgGuiaImport_Ogfio__Z());
      struct.setOgmaqui_Z(getgxTv_SdtOgGuiaImport_Ogmaqui_Z());
      struct.setOgentrada_Z(getgxTv_SdtOgGuiaImport_Ogentrada_Z());
      struct.setOgvossar_Z(getgxTv_SdtOgGuiaImport_Ogvossar_Z());
      struct.setOgarticr_Z(getgxTv_SdtOgGuiaImport_Ogarticr_Z());
      struct.setOgartiac_Z(getgxTv_SdtOgGuiaImport_Ogartiac_Z());
      struct.setOgareccod_Z(getgxTv_SdtOgGuiaImport_Ogareccod_Z());
      struct.setOglocalizac_Z(getgxTv_SdtOgGuiaImport_Oglocalizac_Z());
      struct.setOglocalizc__Z(getgxTv_SdtOgGuiaImport_Oglocalizc__Z());
      struct.setOgnmrguia_N(getgxTv_SdtOgGuiaImport_Ognmrguia_N());
      struct.setOgserie_N(getgxTv_SdtOgGuiaImport_Ogserie_N());
      struct.setOgfecha_N(getgxTv_SdtOgGuiaImport_Ogfecha_N());
      struct.setOgcodart_N(getgxTv_SdtOgGuiaImport_Ogcodart_N());
      struct.setOgrolos_N(getgxTv_SdtOgGuiaImport_Ogrolos_N());
      struct.setOgrolos__N(getgxTv_SdtOgGuiaImport_Ogrolos__N());
      struct.setOgquant_N(getgxTv_SdtOgGuiaImport_Ogquant_N());
      struct.setOgquant__N(getgxTv_SdtOgGuiaImport_Ogquant__N());
      struct.setOgunidad_N(getgxTv_SdtOgGuiaImport_Ogunidad_N());
      struct.setOgunidad__N(getgxTv_SdtOgGuiaImport_Ogunidad__N());
      struct.setOgreferen_N(getgxTv_SdtOgGuiaImport_Ogreferen_N());
      struct.setOgreclam_N(getgxTv_SdtOgGuiaImport_Ogreclam_N());
      struct.setOglote_N(getgxTv_SdtOgGuiaImport_Oglote_N());
      struct.setOgjogo_N(getgxTv_SdtOgGuiaImport_Ogjogo_N());
      struct.setOgpoleg_N(getgxTv_SdtOgGuiaImport_Ogpoleg_N());
      struct.setOgfio_N(getgxTv_SdtOgGuiaImport_Ogfio_N());
      struct.setOgfio__N(getgxTv_SdtOgGuiaImport_Ogfio__N());
      struct.setOgmaqui_N(getgxTv_SdtOgGuiaImport_Ogmaqui_N());
      struct.setOgentrada_N(getgxTv_SdtOgGuiaImport_Ogentrada_N());
      struct.setOgvossar_N(getgxTv_SdtOgGuiaImport_Ogvossar_N());
      struct.setOgarticr_N(getgxTv_SdtOgGuiaImport_Ogarticr_N());
      struct.setOgartiac_N(getgxTv_SdtOgGuiaImport_Ogartiac_N());
      struct.setOgareccod_N(getgxTv_SdtOgGuiaImport_Ogareccod_N());
      struct.setOglocalizac_N(getgxTv_SdtOgGuiaImport_Oglocalizac_N());
      struct.setOglocalizc__N(getgxTv_SdtOgGuiaImport_Oglocalizc__N());
      return struct ;
   }

   private byte gxTv_SdtOgGuiaImport_N ;
   private byte gxTv_SdtOgGuiaImport_Ognmrguia_N ;
   private byte gxTv_SdtOgGuiaImport_Ogserie_N ;
   private byte gxTv_SdtOgGuiaImport_Ogfecha_N ;
   private byte gxTv_SdtOgGuiaImport_Ogcodart_N ;
   private byte gxTv_SdtOgGuiaImport_Ogrolos_N ;
   private byte gxTv_SdtOgGuiaImport_Ogrolos__N ;
   private byte gxTv_SdtOgGuiaImport_Ogquant_N ;
   private byte gxTv_SdtOgGuiaImport_Ogquant__N ;
   private byte gxTv_SdtOgGuiaImport_Ogunidad_N ;
   private byte gxTv_SdtOgGuiaImport_Ogunidad__N ;
   private byte gxTv_SdtOgGuiaImport_Ogreferen_N ;
   private byte gxTv_SdtOgGuiaImport_Ogreclam_N ;
   private byte gxTv_SdtOgGuiaImport_Oglote_N ;
   private byte gxTv_SdtOgGuiaImport_Ogjogo_N ;
   private byte gxTv_SdtOgGuiaImport_Ogpoleg_N ;
   private byte gxTv_SdtOgGuiaImport_Ogfio_N ;
   private byte gxTv_SdtOgGuiaImport_Ogfio__N ;
   private byte gxTv_SdtOgGuiaImport_Ogmaqui_N ;
   private byte gxTv_SdtOgGuiaImport_Ogentrada_N ;
   private byte gxTv_SdtOgGuiaImport_Ogvossar_N ;
   private byte gxTv_SdtOgGuiaImport_Ogarticr_N ;
   private byte gxTv_SdtOgGuiaImport_Ogartiac_N ;
   private byte gxTv_SdtOgGuiaImport_Ogareccod_N ;
   private byte gxTv_SdtOgGuiaImport_Oglocalizac_N ;
   private byte gxTv_SdtOgGuiaImport_Oglocalizc__N ;
   private short gxTv_SdtOgGuiaImport_Ogserie ;
   private short gxTv_SdtOgGuiaImport_Ogrolos ;
   private short gxTv_SdtOgGuiaImport_Ogrolos_ ;
   private short gxTv_SdtOgGuiaImport_Initialized ;
   private short gxTv_SdtOgGuiaImport_Ogserie_Z ;
   private short gxTv_SdtOgGuiaImport_Ogrolos_Z ;
   private short gxTv_SdtOgGuiaImport_Ogrolos__Z ;
   private short readOk ;
   private short nOutParmCount ;
   private int gxTv_SdtOgGuiaImport_Ogareccod ;
   private int gxTv_SdtOgGuiaImport_Ogareccod_Z ;
   private long gxTv_SdtOgGuiaImport_Oglinha ;
   private long gxTv_SdtOgGuiaImport_Ogclicod ;
   private long gxTv_SdtOgGuiaImport_Ognmrguia ;
   private long gxTv_SdtOgGuiaImport_Oglinha_Z ;
   private long gxTv_SdtOgGuiaImport_Ogclicod_Z ;
   private long gxTv_SdtOgGuiaImport_Ognmrguia_Z ;
   private java.math.BigDecimal gxTv_SdtOgGuiaImport_Ogquant ;
   private java.math.BigDecimal gxTv_SdtOgGuiaImport_Ogquant_ ;
   private java.math.BigDecimal gxTv_SdtOgGuiaImport_Ogquant_Z ;
   private java.math.BigDecimal gxTv_SdtOgGuiaImport_Ogquant__Z ;
   private String gxTv_SdtOgGuiaImport_Mode ;
   private String sTagName ;
   private String sDateCnv ;
   private String sNumToPad ;
   private java.util.Date gxTv_SdtOgGuiaImport_Ogfecha ;
   private java.util.Date gxTv_SdtOgGuiaImport_Ogfecha_Z ;
   private boolean readElement ;
   private boolean formatError ;
   private String gxTv_SdtOgGuiaImport_Ogemprcod ;
   private String gxTv_SdtOgGuiaImport_Ogcodart ;
   private String gxTv_SdtOgGuiaImport_Ogunidad ;
   private String gxTv_SdtOgGuiaImport_Ogunidad_ ;
   private String gxTv_SdtOgGuiaImport_Ogreferen ;
   private String gxTv_SdtOgGuiaImport_Ogreclam ;
   private String gxTv_SdtOgGuiaImport_Oglote ;
   private String gxTv_SdtOgGuiaImport_Ogjogo ;
   private String gxTv_SdtOgGuiaImport_Ogpoleg ;
   private String gxTv_SdtOgGuiaImport_Ogfio ;
   private String gxTv_SdtOgGuiaImport_Ogfio_ ;
   private String gxTv_SdtOgGuiaImport_Ogmaqui ;
   private String gxTv_SdtOgGuiaImport_Ogentrada ;
   private String gxTv_SdtOgGuiaImport_Ogvossar ;
   private String gxTv_SdtOgGuiaImport_Ogarticr ;
   private String gxTv_SdtOgGuiaImport_Ogartiac ;
   private String gxTv_SdtOgGuiaImport_Oglocalizac ;
   private String gxTv_SdtOgGuiaImport_Oglocalizc_ ;
   private String gxTv_SdtOgGuiaImport_Ogemprcod_Z ;
   private String gxTv_SdtOgGuiaImport_Ogcodart_Z ;
   private String gxTv_SdtOgGuiaImport_Ogunidad_Z ;
   private String gxTv_SdtOgGuiaImport_Ogunidad__Z ;
   private String gxTv_SdtOgGuiaImport_Ogreferen_Z ;
   private String gxTv_SdtOgGuiaImport_Ogreclam_Z ;
   private String gxTv_SdtOgGuiaImport_Oglote_Z ;
   private String gxTv_SdtOgGuiaImport_Ogjogo_Z ;
   private String gxTv_SdtOgGuiaImport_Ogpoleg_Z ;
   private String gxTv_SdtOgGuiaImport_Ogfio_Z ;
   private String gxTv_SdtOgGuiaImport_Ogfio__Z ;
   private String gxTv_SdtOgGuiaImport_Ogmaqui_Z ;
   private String gxTv_SdtOgGuiaImport_Ogentrada_Z ;
   private String gxTv_SdtOgGuiaImport_Ogvossar_Z ;
   private String gxTv_SdtOgGuiaImport_Ogarticr_Z ;
   private String gxTv_SdtOgGuiaImport_Ogartiac_Z ;
   private String gxTv_SdtOgGuiaImport_Oglocalizac_Z ;
   private String gxTv_SdtOgGuiaImport_Oglocalizc__Z ;
}

