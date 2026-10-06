package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class penalizaciones_cargar_sdt extends GXProcedure
{
   public penalizaciones_cargar_sdt( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( penalizaciones_cargar_sdt.class ), "" );
   }

   public penalizaciones_cargar_sdt( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.facturacion.SdtPenalizaciones_SDT_Item> executeUdp( String aP0 ,
                                                                                   int aP1 ,
                                                                                   int aP2 ,
                                                                                   java.util.Date aP3 ,
                                                                                   java.util.Date aP4 ,
                                                                                   short aP5 ,
                                                                                   String aP6 ,
                                                                                   byte aP7 ,
                                                                                   String[] aP8 )
   {
      penalizaciones_cargar_sdt.this.aP9 = new GXBaseCollection[] {new GXBaseCollection<app.facturacion.SdtPenalizaciones_SDT_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int aP2 ,
                        java.util.Date aP3 ,
                        java.util.Date aP4 ,
                        short aP5 ,
                        String aP6 ,
                        byte aP7 ,
                        String[] aP8 ,
                        GXBaseCollection<app.facturacion.SdtPenalizaciones_SDT_Item>[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             short aP5 ,
                             String aP6 ,
                             byte aP7 ,
                             String[] aP8 ,
                             GXBaseCollection<app.facturacion.SdtPenalizaciones_SDT_Item>[] aP9 )
   {
      penalizaciones_cargar_sdt.this.AV12Emprcod = aP0;
      penalizaciones_cargar_sdt.this.AV10Clicodfrom = aP1;
      penalizaciones_cargar_sdt.this.AV11Clicodto = aP2;
      penalizaciones_cargar_sdt.this.AV8Albprofchfrom = aP3;
      penalizaciones_cargar_sdt.this.AV9Albprofchto = aP4;
      penalizaciones_cargar_sdt.this.AV14Inbarmancod1 = aP5;
      penalizaciones_cargar_sdt.this.AV13InBarcolnom = aP6;
      penalizaciones_cargar_sdt.this.AV16NoVerPen = aP7;
      penalizaciones_cargar_sdt.this.aP8 = aP8;
      penalizaciones_cargar_sdt.this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV10Clicodfrom) ,
                                           Integer.valueOf(AV11Clicodto) ,
                                           AV8Albprofchfrom ,
                                           AV9Albprofchto ,
                                           AV13InBarcolnom ,
                                           Short.valueOf(AV14Inbarmancod1) ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           A34AlbProfch ,
                                           A135BarColNom ,
                                           Short.valueOf(A3311BarManCod1) ,
                                           Byte.valueOf(A32AlbProEsp) ,
                                           A5253BarAcc ,
                                           Byte.valueOf(A33AlbProEst) ,
                                           A39AlbProPri ,
                                           Integer.valueOf(A2395BarAlbExt) ,
                                           Boolean.valueOf(A14267Fase_618) ,
                                           AV12Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P0A4G3 */
      pr_default.execute(0, new Object[] {AV12Emprcod, Integer.valueOf(AV10Clicodfrom), Integer.valueOf(AV11Clicodto), AV8Albprofchfrom, AV9Albprofchto, AV13InBarcolnom, Short.valueOf(AV14Inbarmancod1)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A33AlbProEst = P0A4G3_A33AlbProEst[0] ;
         A39AlbProPri = P0A4G3_A39AlbProPri[0] ;
         A2395BarAlbExt = P0A4G3_A2395BarAlbExt[0] ;
         n2395BarAlbExt = P0A4G3_n2395BarAlbExt[0] ;
         A5253BarAcc = P0A4G3_A5253BarAcc[0] ;
         A3311BarManCod1 = P0A4G3_A3311BarManCod1[0] ;
         A135BarColNom = P0A4G3_A135BarColNom[0] ;
         A32AlbProEsp = P0A4G3_A32AlbProEsp[0] ;
         A34AlbProfch = P0A4G3_A34AlbProfch[0] ;
         A1243GuiRemCli = P0A4G3_A1243GuiRemCli[0] ;
         A1262BarPreKgm = P0A4G3_A1262BarPreKgm[0] ;
         A5019AlbHdrgm2 = P0A4G3_A5019AlbHdrgm2[0] ;
         A3271AlbHdrAnc = P0A4G3_A3271AlbHdrAnc[0] ;
         A1909BarGraAca = P0A4G3_A1909BarGraAca[0] ;
         A125BarAncAca1 = P0A4G3_A125BarAncAca1[0] ;
         A252CliCod = P0A4G3_A252CliCod[0] ;
         n252CliCod = P0A4G3_n252CliCod[0] ;
         A4836BarAudSup = P0A4G3_A4836BarAudSup[0] ;
         A1261BarAlbKgmE = P0A4G3_A1261BarAlbKgmE[0] ;
         A279CliNom = P0A4G3_A279CliNom[0] ;
         A30AlbProCod = P0A4G3_A30AlbProCod[0] ;
         A166BarKgm = P0A4G3_A166BarKgm[0] ;
         n166BarKgm = P0A4G3_n166BarKgm[0] ;
         A130BarCodPar = P0A4G3_A130BarCodPar[0] ;
         A132BarCodReo = P0A4G3_A132BarCodReo[0] ;
         A129BarCod = P0A4G3_A129BarCod[0] ;
         A396EmprCod = P0A4G3_A396EmprCod[0] ;
         A5253BarAcc = P0A4G3_A5253BarAcc[0] ;
         A3311BarManCod1 = P0A4G3_A3311BarManCod1[0] ;
         A135BarColNom = P0A4G3_A135BarColNom[0] ;
         A1909BarGraAca = P0A4G3_A1909BarGraAca[0] ;
         A125BarAncAca1 = P0A4G3_A125BarAncAca1[0] ;
         A252CliCod = P0A4G3_A252CliCod[0] ;
         n252CliCod = P0A4G3_n252CliCod[0] ;
         A4836BarAudSup = P0A4G3_A4836BarAudSup[0] ;
         A33AlbProEst = P0A4G3_A33AlbProEst[0] ;
         A39AlbProPri = P0A4G3_A39AlbProPri[0] ;
         A34AlbProfch = P0A4G3_A34AlbProfch[0] ;
         A1243GuiRemCli = P0A4G3_A1243GuiRemCli[0] ;
         A279CliNom = P0A4G3_A279CliNom[0] ;
         A166BarKgm = P0A4G3_A166BarKgm[0] ;
         n166BarKgm = P0A4G3_n166BarKgm[0] ;
         GXt_boolean1 = A14267Fase_618 ;
         GXv_boolean2[0] = GXt_boolean1 ;
         new app.pedidosclientesindetalle.fase_618(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_boolean2) ;
         penalizaciones_cargar_sdt.this.GXt_boolean1 = GXv_boolean2[0] ;
         A14267Fase_618 = GXt_boolean1 ;
         if ( ! A14267Fase_618 )
         {
            GXv_decimal3[0] = AV25Precio ;
            GXv_decimal4[0] = AV28Kilos ;
            GXv_char5[0] = AV19PMDDsc ;
            GXv_decimal6[0] = AV21PMDDtoTin ;
            GXv_decimal7[0] = AV20PMDDtoAca ;
            GXv_decimal8[0] = AV24PMDTinPrc ;
            GXv_decimal9[0] = AV18PMDAcaPrc ;
            GXv_decimal10[0] = AV22PMDKgmMinS ;
            GXv_int11[0] = AV17OkKgMin ;
            GXv_decimal12[0] = AV23PMDPreUni ;
            new app.pppmd21(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal3, GXv_decimal4, "T", GXv_char5, GXv_decimal6, GXv_decimal7, GXv_decimal8, GXv_decimal9, GXv_decimal10, GXv_int11, GXv_decimal12, A1262BarPreKgm) ;
            penalizaciones_cargar_sdt.this.AV25Precio = GXv_decimal3[0] ;
            penalizaciones_cargar_sdt.this.AV28Kilos = GXv_decimal4[0] ;
            penalizaciones_cargar_sdt.this.AV19PMDDsc = GXv_char5[0] ;
            penalizaciones_cargar_sdt.this.AV21PMDDtoTin = GXv_decimal6[0] ;
            penalizaciones_cargar_sdt.this.AV20PMDDtoAca = GXv_decimal7[0] ;
            penalizaciones_cargar_sdt.this.AV24PMDTinPrc = GXv_decimal8[0] ;
            penalizaciones_cargar_sdt.this.AV18PMDAcaPrc = GXv_decimal9[0] ;
            penalizaciones_cargar_sdt.this.AV22PMDKgmMinS = GXv_decimal10[0] ;
            penalizaciones_cargar_sdt.this.AV17OkKgMin = GXv_int11[0] ;
            penalizaciones_cargar_sdt.this.AV23PMDPreUni = GXv_decimal12[0] ;
            AV50BarGraAca = A5019AlbHdrgm2 ;
            AV51BarAncAca1 = A3271AlbHdrAnc ;
            if ( (0==AV50BarGraAca) )
            {
               AV50BarGraAca = A1909BarGraAca ;
            }
            if ( (0==AV51BarAncAca1) )
            {
               AV51BarAncAca1 = A125BarAncAca1 ;
            }
            AV52BarAlbKgmE = AV28Kilos ;
            AV32Seleccionar = false ;
            if ( ( ( A3311BarManCod1 > 0 ) ) || ( ( DecimalUtil.compareTo(AV25Precio, A1262BarPreKgm) != 0 ) ) || ( ( AV24PMDTinPrc.doubleValue() != 0 ) ) || ( ( AV18PMDAcaPrc.doubleValue() != 0 ) ) || ( ( AV22PMDKgmMinS.doubleValue() != 0 ) ) || ( ( AV17OkKgMin == 1 ) ) )
            {
               if ( ( DecimalUtil.compareTo(AV22PMDKgmMinS, AV52BarAlbKgmE) == 0 ) && ( AV17OkKgMin == 1 ) )
               {
                  AV49Ancho = DecimalUtil.doubleToDec(AV51BarAncAca1/ (double) (100)) ;
                  if ( (DecimalUtil.doubleToDec(AV50BarGraAca).multiply(AV49Ancho)).doubleValue() > 0 )
                  {
                     AV15MtsMinS = (AV52BarAlbKgmE.divide((DecimalUtil.doubleToDec(AV50BarGraAca).multiply(AV49Ancho)), 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(1000)) ;
                  }
                  else
                  {
                     AV15MtsMinS = AV53Metros ;
                  }
               }
               if ( A3311BarManCod1 == 0 )
               {
                  if ( AV16NoVerPen == 1 )
                  {
                     GXv_char5[0] = AV12Emprcod ;
                     GXv_int13[0] = A30AlbProCod ;
                     GXv_int14[0] = A129BarCod ;
                     GXv_int11[0] = A132BarCodReo ;
                     GXv_char15[0] = A130BarCodPar ;
                     GXv_decimal12[0] = AV21PMDDtoTin ;
                     GXv_decimal10[0] = AV20PMDDtoAca ;
                     GXv_decimal9[0] = AV25Precio ;
                     GXv_decimal8[0] = AV24PMDTinPrc ;
                     GXv_decimal7[0] = AV18PMDAcaPrc ;
                     GXv_decimal6[0] = AV22PMDKgmMinS ;
                     GXv_decimal4[0] = AV15MtsMinS ;
                     GXv_int16[0] = AV17OkKgMin ;
                     GXv_decimal3[0] = AV23PMDPreUni ;
                     new app.pppadto(remoteHandle, context).execute( GXv_char5, GXv_int13, GXv_int14, GXv_int11, GXv_char15, GXv_decimal12, GXv_decimal10, GXv_decimal9, GXv_decimal8, GXv_decimal7, GXv_decimal6, GXv_decimal4, GXv_int16, GXv_decimal3) ;
                     penalizaciones_cargar_sdt.this.AV12Emprcod = GXv_char5[0] ;
                     penalizaciones_cargar_sdt.this.A30AlbProCod = GXv_int13[0] ;
                     penalizaciones_cargar_sdt.this.A129BarCod = GXv_int14[0] ;
                     penalizaciones_cargar_sdt.this.A132BarCodReo = GXv_int11[0] ;
                     penalizaciones_cargar_sdt.this.A130BarCodPar = GXv_char15[0] ;
                     penalizaciones_cargar_sdt.this.AV21PMDDtoTin = GXv_decimal12[0] ;
                     penalizaciones_cargar_sdt.this.AV20PMDDtoAca = GXv_decimal10[0] ;
                     penalizaciones_cargar_sdt.this.AV25Precio = GXv_decimal9[0] ;
                     penalizaciones_cargar_sdt.this.AV24PMDTinPrc = GXv_decimal8[0] ;
                     penalizaciones_cargar_sdt.this.AV18PMDAcaPrc = GXv_decimal7[0] ;
                     penalizaciones_cargar_sdt.this.AV22PMDKgmMinS = GXv_decimal6[0] ;
                     penalizaciones_cargar_sdt.this.AV15MtsMinS = GXv_decimal4[0] ;
                     penalizaciones_cargar_sdt.this.AV17OkKgMin = GXv_int16[0] ;
                     penalizaciones_cargar_sdt.this.AV23PMDPreUni = GXv_decimal3[0] ;
                  }
                  else
                  {
                     AV32Seleccionar = true ;
                  }
               }
               else
               {
                  AV32Seleccionar = false ;
               }
               AV32Seleccionar = ((A3311BarManCod1==0)&&(AV16NoVerPen==0) ? true : false) ;
               AV29item_Penalizaciones_SDT = (app.facturacion.SdtPenalizaciones_SDT_Item)new app.facturacion.SdtPenalizaciones_SDT_Item(remoteHandle, context);
               AV29item_Penalizaciones_SDT.setgxTv_SdtPenalizaciones_SDT_Item_Seleccionar( AV32Seleccionar );
               AV29item_Penalizaciones_SDT.setgxTv_SdtPenalizaciones_SDT_Item_Clicod( A252CliCod );
               AV29item_Penalizaciones_SDT.setgxTv_SdtPenalizaciones_SDT_Item_Barmancod1( A3311BarManCod1 );
               AV29item_Penalizaciones_SDT.setgxTv_SdtPenalizaciones_SDT_Item_Barcolnum( A4836BarAudSup );
               AV29item_Penalizaciones_SDT.setgxTv_SdtPenalizaciones_SDT_Item_Barcolnom( A135BarColNom );
               AV29item_Penalizaciones_SDT.setgxTv_SdtPenalizaciones_SDT_Item_Barcod( A129BarCod );
               AV29item_Penalizaciones_SDT.setgxTv_SdtPenalizaciones_SDT_Item_Barcodreo( A132BarCodReo );
               AV29item_Penalizaciones_SDT.setgxTv_SdtPenalizaciones_SDT_Item_Barcodpar( A130BarCodPar );
               AV29item_Penalizaciones_SDT.setgxTv_SdtPenalizaciones_SDT_Item_Albprocod( A30AlbProCod );
               AV29item_Penalizaciones_SDT.setgxTv_SdtPenalizaciones_SDT_Item_Barkgm( A166BarKgm );
               AV29item_Penalizaciones_SDT.setgxTv_SdtPenalizaciones_SDT_Item_Baralbkgm( A1261BarAlbKgmE );
               AV29item_Penalizaciones_SDT.setgxTv_SdtPenalizaciones_SDT_Item_Pmddtotin( AV21PMDDtoTin );
               AV29item_Penalizaciones_SDT.setgxTv_SdtPenalizaciones_SDT_Item_Pmddtoaca( AV20PMDDtoAca );
               AV29item_Penalizaciones_SDT.setgxTv_SdtPenalizaciones_SDT_Item_Pmdtinprc( AV24PMDTinPrc );
               AV29item_Penalizaciones_SDT.setgxTv_SdtPenalizaciones_SDT_Item_Pmdacaprc( AV18PMDAcaPrc );
               AV29item_Penalizaciones_SDT.setgxTv_SdtPenalizaciones_SDT_Item_Precio( AV25Precio );
               AV29item_Penalizaciones_SDT.setgxTv_SdtPenalizaciones_SDT_Item_Barprekgm( A1262BarPreKgm );
               AV29item_Penalizaciones_SDT.setgxTv_SdtPenalizaciones_SDT_Item_Clinom( A279CliNom );
               AV29item_Penalizaciones_SDT.setgxTv_SdtPenalizaciones_SDT_Item_Pmddsc( AV19PMDDsc );
               AV29item_Penalizaciones_SDT.setgxTv_SdtPenalizaciones_SDT_Item_Okkgmin( AV17OkKgMin );
               AV29item_Penalizaciones_SDT.setgxTv_SdtPenalizaciones_SDT_Item_Pmdpreuni( AV23PMDPreUni );
               AV29item_Penalizaciones_SDT.setgxTv_SdtPenalizaciones_SDT_Item_Pmdkgmmins( AV22PMDKgmMinS );
               AV29item_Penalizaciones_SDT.setgxTv_SdtPenalizaciones_SDT_Item_Baracc( A5253BarAcc );
               AV29item_Penalizaciones_SDT.setgxTv_SdtPenalizaciones_SDT_Item_Fase_618( A14267Fase_618 );
               AV29item_Penalizaciones_SDT.setgxTv_SdtPenalizaciones_SDT_Item_Mtsmins( AV15MtsMinS );
               AV31Penalizaciones_SDT.add(AV29item_Penalizaciones_SDT, 0);
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV30Penalizaciones_json = AV31Penalizaciones_SDT.toJSonString(false) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP8[0] = penalizaciones_cargar_sdt.this.AV30Penalizaciones_json;
      this.aP9[0] = penalizaciones_cargar_sdt.this.AV31Penalizaciones_SDT;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV30Penalizaciones_json = "" ;
      AV31Penalizaciones_SDT = new GXBaseCollection<app.facturacion.SdtPenalizaciones_SDT_Item>(app.facturacion.SdtPenalizaciones_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A135BarColNom = "" ;
      A5253BarAcc = "" ;
      A39AlbProPri = "" ;
      A396EmprCod = "" ;
      P0A4G3_A33AlbProEst = new byte[1] ;
      P0A4G3_A39AlbProPri = new String[] {""} ;
      P0A4G3_A2395BarAlbExt = new int[1] ;
      P0A4G3_n2395BarAlbExt = new boolean[] {false} ;
      P0A4G3_A5253BarAcc = new String[] {""} ;
      P0A4G3_A3311BarManCod1 = new short[1] ;
      P0A4G3_A135BarColNom = new String[] {""} ;
      P0A4G3_A32AlbProEsp = new byte[1] ;
      P0A4G3_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P0A4G3_A1243GuiRemCli = new int[1] ;
      P0A4G3_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A4G3_A5019AlbHdrgm2 = new short[1] ;
      P0A4G3_A3271AlbHdrAnc = new short[1] ;
      P0A4G3_A1909BarGraAca = new short[1] ;
      P0A4G3_A125BarAncAca1 = new short[1] ;
      P0A4G3_A252CliCod = new int[1] ;
      P0A4G3_n252CliCod = new boolean[] {false} ;
      P0A4G3_A4836BarAudSup = new int[1] ;
      P0A4G3_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A4G3_A279CliNom = new String[] {""} ;
      P0A4G3_A30AlbProCod = new long[1] ;
      P0A4G3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A4G3_n166BarKgm = new boolean[] {false} ;
      P0A4G3_A130BarCodPar = new String[] {""} ;
      P0A4G3_A132BarCodReo = new byte[1] ;
      P0A4G3_A129BarCod = new int[1] ;
      P0A4G3_A396EmprCod = new String[] {""} ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A279CliNom = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      GXv_boolean2 = new boolean[1] ;
      AV25Precio = DecimalUtil.ZERO ;
      AV28Kilos = DecimalUtil.ZERO ;
      AV19PMDDsc = "" ;
      AV21PMDDtoTin = DecimalUtil.ZERO ;
      AV20PMDDtoAca = DecimalUtil.ZERO ;
      AV24PMDTinPrc = DecimalUtil.ZERO ;
      AV18PMDAcaPrc = DecimalUtil.ZERO ;
      AV22PMDKgmMinS = DecimalUtil.ZERO ;
      AV23PMDPreUni = DecimalUtil.ZERO ;
      AV52BarAlbKgmE = DecimalUtil.ZERO ;
      AV49Ancho = DecimalUtil.ZERO ;
      AV15MtsMinS = DecimalUtil.ZERO ;
      AV53Metros = DecimalUtil.ZERO ;
      GXv_char5 = new String[1] ;
      GXv_int13 = new long[1] ;
      GXv_int14 = new int[1] ;
      GXv_int11 = new byte[1] ;
      GXv_char15 = new String[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_decimal4 = new java.math.BigDecimal[1] ;
      GXv_int16 = new byte[1] ;
      GXv_decimal3 = new java.math.BigDecimal[1] ;
      AV29item_Penalizaciones_SDT = new app.facturacion.SdtPenalizaciones_SDT_Item(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.penalizaciones_cargar_sdt__default(),
         new Object[] {
             new Object[] {
            P0A4G3_A33AlbProEst, P0A4G3_A39AlbProPri, P0A4G3_A2395BarAlbExt, P0A4G3_n2395BarAlbExt, P0A4G3_A5253BarAcc, P0A4G3_A3311BarManCod1, P0A4G3_A135BarColNom, P0A4G3_A32AlbProEsp, P0A4G3_A34AlbProfch, P0A4G3_A1243GuiRemCli,
            P0A4G3_A1262BarPreKgm, P0A4G3_A5019AlbHdrgm2, P0A4G3_A3271AlbHdrAnc, P0A4G3_A1909BarGraAca, P0A4G3_A125BarAncAca1, P0A4G3_A252CliCod, P0A4G3_n252CliCod, P0A4G3_A4836BarAudSup, P0A4G3_A1261BarAlbKgmE, P0A4G3_A279CliNom,
            P0A4G3_A30AlbProCod, P0A4G3_A166BarKgm, P0A4G3_n166BarKgm, P0A4G3_A130BarCodPar, P0A4G3_A132BarCodReo, P0A4G3_A129BarCod, P0A4G3_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16NoVerPen ;
   private byte A32AlbProEsp ;
   private byte A33AlbProEst ;
   private byte A132BarCodReo ;
   private byte AV17OkKgMin ;
   private byte GXv_int11[] ;
   private byte GXv_int16[] ;
   private short AV14Inbarmancod1 ;
   private short A3311BarManCod1 ;
   private short A5019AlbHdrgm2 ;
   private short A3271AlbHdrAnc ;
   private short A1909BarGraAca ;
   private short A125BarAncAca1 ;
   private short AV50BarGraAca ;
   private short AV51BarAncAca1 ;
   private short Gx_err ;
   private int AV10Clicodfrom ;
   private int AV11Clicodto ;
   private int A1243GuiRemCli ;
   private int A2395BarAlbExt ;
   private int A252CliCod ;
   private int A4836BarAudSup ;
   private int A129BarCod ;
   private int GXv_int14[] ;
   private long A30AlbProCod ;
   private long GXv_int13[] ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV25Precio ;
   private java.math.BigDecimal AV28Kilos ;
   private java.math.BigDecimal AV21PMDDtoTin ;
   private java.math.BigDecimal AV20PMDDtoAca ;
   private java.math.BigDecimal AV24PMDTinPrc ;
   private java.math.BigDecimal AV18PMDAcaPrc ;
   private java.math.BigDecimal AV22PMDKgmMinS ;
   private java.math.BigDecimal AV23PMDPreUni ;
   private java.math.BigDecimal AV52BarAlbKgmE ;
   private java.math.BigDecimal AV49Ancho ;
   private java.math.BigDecimal AV15MtsMinS ;
   private java.math.BigDecimal AV53Metros ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal GXv_decimal4[] ;
   private java.math.BigDecimal GXv_decimal3[] ;
   private String AV12Emprcod ;
   private String AV13InBarcolnom ;
   private String scmdbuf ;
   private String A135BarColNom ;
   private String A5253BarAcc ;
   private String A39AlbProPri ;
   private String A396EmprCod ;
   private String A279CliNom ;
   private String A130BarCodPar ;
   private String AV19PMDDsc ;
   private String GXv_char5[] ;
   private String GXv_char15[] ;
   private java.util.Date AV8Albprofchfrom ;
   private java.util.Date AV9Albprofchto ;
   private java.util.Date A34AlbProfch ;
   private boolean A14267Fase_618 ;
   private boolean n2395BarAlbExt ;
   private boolean n252CliCod ;
   private boolean n166BarKgm ;
   private boolean GXt_boolean1 ;
   private boolean GXv_boolean2[] ;
   private boolean AV32Seleccionar ;
   private String AV30Penalizaciones_json ;
   private GXBaseCollection<app.facturacion.SdtPenalizaciones_SDT_Item>[] aP9 ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private byte[] P0A4G3_A33AlbProEst ;
   private String[] P0A4G3_A39AlbProPri ;
   private int[] P0A4G3_A2395BarAlbExt ;
   private boolean[] P0A4G3_n2395BarAlbExt ;
   private String[] P0A4G3_A5253BarAcc ;
   private short[] P0A4G3_A3311BarManCod1 ;
   private String[] P0A4G3_A135BarColNom ;
   private byte[] P0A4G3_A32AlbProEsp ;
   private java.util.Date[] P0A4G3_A34AlbProfch ;
   private int[] P0A4G3_A1243GuiRemCli ;
   private java.math.BigDecimal[] P0A4G3_A1262BarPreKgm ;
   private short[] P0A4G3_A5019AlbHdrgm2 ;
   private short[] P0A4G3_A3271AlbHdrAnc ;
   private short[] P0A4G3_A1909BarGraAca ;
   private short[] P0A4G3_A125BarAncAca1 ;
   private int[] P0A4G3_A252CliCod ;
   private boolean[] P0A4G3_n252CliCod ;
   private int[] P0A4G3_A4836BarAudSup ;
   private java.math.BigDecimal[] P0A4G3_A1261BarAlbKgmE ;
   private String[] P0A4G3_A279CliNom ;
   private long[] P0A4G3_A30AlbProCod ;
   private java.math.BigDecimal[] P0A4G3_A166BarKgm ;
   private boolean[] P0A4G3_n166BarKgm ;
   private String[] P0A4G3_A130BarCodPar ;
   private byte[] P0A4G3_A132BarCodReo ;
   private int[] P0A4G3_A129BarCod ;
   private String[] P0A4G3_A396EmprCod ;
   private GXBaseCollection<app.facturacion.SdtPenalizaciones_SDT_Item> AV31Penalizaciones_SDT ;
   private app.facturacion.SdtPenalizaciones_SDT_Item AV29item_Penalizaciones_SDT ;
}

final  class penalizaciones_cargar_sdt__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A4G3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV10Clicodfrom ,
                                          int AV11Clicodto ,
                                          java.util.Date AV8Albprofchfrom ,
                                          java.util.Date AV9Albprofchto ,
                                          String AV13InBarcolnom ,
                                          short AV14Inbarmancod1 ,
                                          int A1243GuiRemCli ,
                                          java.util.Date A34AlbProfch ,
                                          String A135BarColNom ,
                                          short A3311BarManCod1 ,
                                          byte A32AlbProEsp ,
                                          String A5253BarAcc ,
                                          byte A33AlbProEst ,
                                          String A39AlbProPri ,
                                          int A2395BarAlbExt ,
                                          boolean A14267Fase_618 ,
                                          String AV12Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[7];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT T3.AlbProEst, T3.AlbProPri, T1.BarAlbExt, T2.BarAcc, T2.BarManCod1, T2.BarColNom, T1.AlbProEsp, T3.AlbProfch, T3.GuiRemCli, T1.BarPreKgm, T1.AlbHdrgm2, T1.AlbHdrAnc," ;
      scmdbuf += " T2.BarGraAca, T2.BarAncAca1, T2.CliCod, T2.BarAudSup, T1.BarAlbKgmE, T4.CliNom, T1.AlbProCod, COALESCE( T5.BarKgm, 0) AS BarKgm, T1.BarCodPar, T1.BarCodReo, T1.BarCod," ;
      scmdbuf += " T1.EmprCod FROM ((((TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar =" ;
      scmdbuf += " T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T2.CliCod) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod =" ;
      scmdbuf += " T1.AlbProCod) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar )" ;
      scmdbuf += " T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbProEsp = 0 or T1.AlbProEsp > 9)");
      addWhere(sWhereString, "(T2.BarAcc <> 'S')");
      addWhere(sWhereString, "(T3.AlbProEst = 1)");
      addWhere(sWhereString, "(T3.AlbProPri = '1')");
      addWhere(sWhereString, "(T1.BarAlbExt = 0)");
      if ( ! (0==AV10Clicodfrom) )
      {
         addWhere(sWhereString, "(T3.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int17[1] = (byte)(1) ;
      }
      if ( ! (0==AV11Clicodto) )
      {
         addWhere(sWhereString, "(T3.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int17[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV8Albprofchfrom)) )
      {
         addWhere(sWhereString, "(T3.AlbProfch >= ?)");
      }
      else
      {
         GXv_int17[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV9Albprofchto)) )
      {
         addWhere(sWhereString, "(T3.AlbProfch <= ?)");
      }
      else
      {
         GXv_int17[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13InBarcolnom)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int17[5] = (byte)(1) ;
      }
      if ( ! (0==AV14Inbarmancod1) )
      {
         addWhere(sWhereString, "(T2.BarManCod1 = ?)");
      }
      else
      {
         GXv_int17[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T3.GuiRemCli, T3.AlbProEst, T1.AlbProCod" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P0A4G3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Boolean) dynConstraints[15]).booleanValue() , (String)dynConstraints[16] , (String)dynConstraints[17] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A4G3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,5);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((short[]) buf[14])[0] = rslt.getShort(14);
               ((int[]) buf[15])[0] = rslt.getInt(15);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(16);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(17,2);
               ((String[]) buf[19])[0] = rslt.getString(18, 30);
               ((long[]) buf[20])[0] = rslt.getLong(19);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(21, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(22);
               ((int[]) buf[25])[0] = rslt.getInt(23);
               ((String[]) buf[26])[0] = rslt.getString(24, 3);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[10]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[11]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 13);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[13]).shortValue());
               }
               return;
      }
   }

}

