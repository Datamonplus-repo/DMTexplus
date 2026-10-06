package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class almacentejidoencrudodistribucion_prc extends GXProcedure
{
   public almacentejidoencrudodistribucion_prc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( almacentejidoencrudodistribucion_prc.class ), "" );
   }

   public almacentejidoencrudodistribucion_prc( int remoteHandle ,
                                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 ,
                             java.util.Date[] aP4 ,
                             java.util.Date[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             short[] aP10 ,
                             short[] aP11 ,
                             short[] aP12 ,
                             String[] aP13 ,
                             int[] aP14 )
   {
      almacentejidoencrudodistribucion_prc.this.aP15 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
      return aP15[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 ,
                        java.util.Date[] aP4 ,
                        java.util.Date[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        short[] aP10 ,
                        short[] aP11 ,
                        short[] aP12 ,
                        String[] aP13 ,
                        int[] aP14 ,
                        String[] aP15 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 ,
                             java.util.Date[] aP4 ,
                             java.util.Date[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             short[] aP10 ,
                             short[] aP11 ,
                             short[] aP12 ,
                             String[] aP13 ,
                             int[] aP14 ,
                             String[] aP15 )
   {
      almacentejidoencrudodistribucion_prc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      almacentejidoencrudodistribucion_prc.this.AV45ImpCod = aP1[0];
      this.aP1 = aP1;
      almacentejidoencrudodistribucion_prc.this.AV51PCliente = aP2[0];
      this.aP2 = aP2;
      almacentejidoencrudodistribucion_prc.this.AV58UCliente = aP3[0];
      this.aP3 = aP3;
      almacentejidoencrudodistribucion_prc.this.AV52PFecha = aP4[0];
      this.aP4 = aP4;
      almacentejidoencrudodistribucion_prc.this.AV59UFecha = aP5[0];
      this.aP5 = aP5;
      almacentejidoencrudodistribucion_prc.this.AV15ALbRef_i = aP6[0];
      this.aP6 = aP6;
      almacentejidoencrudodistribucion_prc.this.AV14AlbRef_f = aP7[0];
      this.aP7 = aP7;
      almacentejidoencrudodistribucion_prc.this.AV18Albrenti = aP8[0];
      this.aP8 = aP8;
      almacentejidoencrudodistribucion_prc.this.AV17Albrentf = aP9[0];
      this.aP9 = aP9;
      almacentejidoencrudodistribucion_prc.this.AV56Tipentcodi = aP10[0];
      this.aP10 = aP10;
      almacentejidoencrudodistribucion_prc.this.AV54Tipartcod1 = aP11[0];
      this.aP11 = aP11;
      almacentejidoencrudodistribucion_prc.this.AV55Tipartcod2 = aP12[0];
      this.aP12 = aP12;
      almacentejidoencrudodistribucion_prc.this.AV44Estado_a = aP13[0];
      this.aP13 = aP13;
      almacentejidoencrudodistribucion_prc.this.AV11AlbRecCod = aP14[0];
      this.aP14 = aP14;
      almacentejidoencrudodistribucion_prc.this.aP15 = aP15;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_char1[0] = AV42ContDsc ;
      new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "EM0000", ""), GXv_char1) ;
      almacentejidoencrudodistribucion_prc.this.AV42ContDsc = GXv_char1[0] ;
      GXt_int2 = (byte)(AV49Moda21) ;
      GXv_int3[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int3) ;
      almacentejidoencrudodistribucion_prc.this.GXt_int2 = GXv_int3[0] ;
      AV49Moda21 = GXt_int2 ;
      GXt_int2 = (byte)(AV39Cli350) ;
      GXv_int3[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CLI350", ""), GXv_int3) ;
      almacentejidoencrudodistribucion_prc.this.GXt_int2 = GXv_int3[0] ;
      AV39Cli350 = GXt_int2 ;
      GXt_int4 = AV43ContVal ;
      GXv_int5[0] = GXt_int4 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CLI350", ""), GXv_int5) ;
      almacentejidoencrudodistribucion_prc.this.GXt_int4 = GXv_int5[0] ;
      AV43ContVal = GXt_int4 ;
      AV50PAlbRest = (byte)(0) ;
      AV57UALbRest = (byte)(1) ;
      if ( GXutil.strcmp(AV44Estado_a, "0") == 0 )
      {
         AV50PAlbRest = (byte)(0) ;
         AV57UALbRest = (byte)(0) ;
      }
      if ( GXutil.strcmp(AV44Estado_a, "1") == 0 )
      {
         AV50PAlbRest = (byte)(1) ;
         AV57UALbRest = (byte)(1) ;
      }
      AV23AlmacenTejidoencrudoDistribucion_SDT.clear();
      AV47Last_C = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV52PFecha ,
                                           AV59UFecha ,
                                           Integer.valueOf(AV51PCliente) ,
                                           Integer.valueOf(AV58UCliente) ,
                                           AV15ALbRef_i ,
                                           AV14AlbRef_f ,
                                           AV18Albrenti ,
                                           AV17Albrentf ,
                                           Short.valueOf(AV54Tipartcod1) ,
                                           Short.valueOf(AV55Tipartcod2) ,
                                           Byte.valueOf(AV50PAlbRest) ,
                                           Byte.valueOf(AV57UALbRest) ,
                                           Integer.valueOf(AV11AlbRecCod) ,
                                           A49AlbRFen ,
                                           Integer.valueOf(A252CliCod) ,
                                           A45AlbRef ,
                                           A46AlbREnt ,
                                           Short.valueOf(A6263AlbRTartC) ,
                                           Byte.valueOf(A47AlbREst) ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           Short.valueOf(A1211TipEntCod) ,
                                           Short.valueOf(AV56Tipentcodi) ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.BYTE,
                                           TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING
                                           }
      });
      /* Using cursor P0ATY2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(AV56Tipentcodi), Short.valueOf(AV56Tipentcodi), AV52PFecha, AV59UFecha, Integer.valueOf(AV51PCliente), Integer.valueOf(AV58UCliente), AV15ALbRef_i, AV14AlbRef_f, AV18Albrenti, AV17Albrentf, Short.valueOf(AV54Tipartcod1), Short.valueOf(AV55Tipartcod2), Byte.valueOf(AV50PAlbRest), Byte.valueOf(AV57UALbRest), Integer.valueOf(AV11AlbRecCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A44AlbRecCod = P0ATY2_A44AlbRecCod[0] ;
         A47AlbREst = P0ATY2_A47AlbREst[0] ;
         A6263AlbRTartC = P0ATY2_A6263AlbRTartC[0] ;
         n6263AlbRTartC = P0ATY2_n6263AlbRTartC[0] ;
         A1211TipEntCod = P0ATY2_A1211TipEntCod[0] ;
         n1211TipEntCod = P0ATY2_n1211TipEntCod[0] ;
         A46AlbREnt = P0ATY2_A46AlbREnt[0] ;
         A45AlbRef = P0ATY2_A45AlbRef[0] ;
         A252CliCod = P0ATY2_A252CliCod[0] ;
         A49AlbRFen = P0ATY2_A49AlbRFen[0] ;
         A5806AlbREnt2 = P0ATY2_A5806AlbREnt2[0] ;
         A279CliNom = P0ATY2_A279CliNom[0] ;
         A52AlbRPieEnt = P0ATY2_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = P0ATY2_A58AlbRUniEnt[0] ;
         A56AlbRUni = P0ATY2_A56AlbRUni[0] ;
         A279CliNom = P0ATY2_A279CliNom[0] ;
         AV16Albrent = ((GXutil.strcmp(A5806AlbREnt2, " ")!=0) ? A5806AlbREnt2 : A46AlbREnt) ;
         AV13albref = A45AlbRef ;
         AV12albreccodIN = A44AlbRecCod ;
         AV40clicod = A252CliCod ;
         AV41clinom = A279CliNom ;
         AV19albrfen = A49AlbRFen ;
         AV20albrpieent = A52AlbRPieEnt ;
         AV22albrunient = A58AlbRUniEnt ;
         AV21albruni = A56AlbRUni ;
         AV34barpiekil = DecimalUtil.doubleToDec(0) ;
         AV35barpiemet = DecimalUtil.doubleToDec(0) ;
         AV36barpiepie = 0 ;
         AV28Barcod = 0 ;
         AV30Barcodreo = (byte)(0) ;
         AV29barcodpar = "" ;
         AV31barcolnom = "" ;
         AV32barcolnum = 0 ;
         AV38bartipcol = (byte)(0) ;
         AV37barser = "" ;
         AV33barnhdr = "" ;
         AV9ALbprocod = 0 ;
         AV10Albprofch = GXutil.nullDate() ;
         AV25BarAlbKgm = DecimalUtil.ZERO ;
         AV26BarAlbMtr = DecimalUtil.ZERO ;
         AV27BarAlbPie = 0 ;
         if ( ( AV49Moda21 == 1 ) && ( A252CliCod == 350 ) && ( AV39Cli350 == 1 ) && ( AV43ContVal == 1 ) )
         {
         }
         else
         {
            AV69GXLvl93 = (byte)(0) ;
            /* Using cursor P0ATY4 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A200BarPieCod = P0ATY4_A200BarPieCod[0] ;
               A135BarColNom = P0ATY4_A135BarColNom[0] ;
               A136BarColNum = P0ATY4_A136BarColNum[0] ;
               A218BarTipCol = P0ATY4_A218BarTipCol[0] ;
               A212BarSer = P0ATY4_A212BarSer[0] ;
               A203BarPieKil = P0ATY4_A203BarPieKil[0] ;
               A205BarPieMet = P0ATY4_A205BarPieMet[0] ;
               A199BarPie1 = P0ATY4_A199BarPie1[0] ;
               A365DisDes = P0ATY4_A365DisDes[0] ;
               A898BarPieNDes = P0ATY4_A898BarPieNDes[0] ;
               A130BarCodPar = P0ATY4_A130BarCodPar[0] ;
               A132BarCodReo = P0ATY4_A132BarCodReo[0] ;
               A129BarCod = P0ATY4_A129BarCod[0] ;
               A135BarColNom = P0ATY4_A135BarColNom[0] ;
               A136BarColNum = P0ATY4_A136BarColNum[0] ;
               A218BarTipCol = P0ATY4_A218BarTipCol[0] ;
               A212BarSer = P0ATY4_A212BarSer[0] ;
               A365DisDes = P0ATY4_A365DisDes[0] ;
               A199BarPie1 = P0ATY4_A199BarPie1[0] ;
               A898BarPieNDes = P0ATY4_A898BarPieNDes[0] ;
               A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
               if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
               {
                  A198BarPie = A898BarPieNDes ;
               }
               else
               {
                  A198BarPie = A199BarPie1 ;
               }
               AV69GXLvl93 = (byte)(1) ;
               AV28Barcod = A129BarCod ;
               AV30Barcodreo = A132BarCodReo ;
               AV29barcodpar = A130BarCodPar ;
               AV31barcolnom = A135BarColNom ;
               AV32barcolnum = A136BarColNum ;
               AV38bartipcol = A218BarTipCol ;
               AV37barser = A212BarSer ;
               AV33barnhdr = A13696BarNHdr ;
               AV34barpiekil = A203BarPieKil ;
               AV35barpiemet = A205BarPieMet ;
               AV36barpiepie = A198BarPie ;
               /* Execute user subroutine: 'ALBBAR' */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  pr_default.close(1);
                  pr_default.close(1);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               pr_default.readNext(1);
            }
            pr_default.close(1);
            if ( AV69GXLvl93 == 0 )
            {
               AV24AlmacenTejidoencrudoDistribucion_SDTItem = (app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)new app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem(remoteHandle, context);
               AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Clicod( AV40clicod );
               AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Clinom( AV41clinom );
               AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albreccod( AV12albreccodIN );
               AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrfen( AV19albrfen );
               AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrent2( AV16Albrent );
               AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrunient( AV22albrunient );
               AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albruni( AV21albruni );
               AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrpieent( AV20albrpieent );
               AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barnhdr( AV33barnhdr );
               AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcod( AV28Barcod );
               AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcodreo( AV30Barcodreo );
               AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcodpar( AV29barcodpar );
               AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barser( AV37barser );
               AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcolnom( AV31barcolnom );
               AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcolnum( AV32barcolnum );
               AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Bartipcol( AV38bartipcol );
               AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiekil( AV34barpiekil );
               AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiemet( AV35barpiemet );
               AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiepie( AV36barpiepie );
               AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprocod( AV9ALbprocod );
               AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprofch( AV10Albprofch );
               AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbkgm( AV25BarAlbKgm );
               AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbmtr( AV26BarAlbMtr );
               AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbpie( AV27BarAlbPie );
               AV23AlmacenTejidoencrudoDistribucion_SDT.add(AV24AlmacenTejidoencrudoDistribucion_SDTItem, 0);
            }
            AV47Last_C = A252CliCod ;
            AV60Var_Albreccod = A44AlbRecCod ;
            AV63Var_ALbrUni = A56AlbRUni ;
            AV61Var_AlbRFen = A49AlbRFen ;
            AV64Var_AlbRUniEnt = A58AlbRUniEnt ;
            AV62Var_AlbRPieEnt = A52AlbRPieEnt ;
            AV34barpiekil = DecimalUtil.doubleToDec(0) ;
            AV35barpiemet = DecimalUtil.doubleToDec(0) ;
            AV36barpiepie = 0 ;
            AV28Barcod = 0 ;
            AV30Barcodreo = (byte)(0) ;
            AV29barcodpar = "" ;
            AV31barcolnom = "" ;
            AV32barcolnum = 0 ;
            AV38bartipcol = (byte)(0) ;
            AV37barser = "" ;
            AV33barnhdr = "" ;
            AV9ALbprocod = 0 ;
            AV10Albprofch = GXutil.nullDate() ;
            AV25BarAlbKgm = DecimalUtil.ZERO ;
            AV26BarAlbMtr = DecimalUtil.ZERO ;
            AV27BarAlbPie = 0 ;
            /* Execute user subroutine: 'DEVOLUCIONES' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV65AlmacenTejidoencrudoDistribucion_SDTJson = AV23AlmacenTejidoencrudoDistribucion_SDT.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'DEVOLUCIONES' Routine */
      returnInSub = false ;
      AV53tablaDevCru = (short)(0) ;
      AV70GXLvl174 = (byte)(0) ;
      /* Using cursor P0ATY5 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV60Var_Albreccod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A44AlbRecCod = P0ATY5_A44AlbRecCod[0] ;
         A11683DevCruUnd = P0ATY5_A11683DevCruUnd[0] ;
         A11669DevCruId = P0ATY5_A11669DevCruId[0] ;
         A11670DevCruFec = P0ATY5_A11670DevCruFec[0] ;
         A11684DevCruPzs = P0ATY5_A11684DevCruPzs[0] ;
         A11670DevCruFec = P0ATY5_A11670DevCruFec[0] ;
         AV70GXLvl174 = (byte)(1) ;
         AV46kilosdev = ((GXutil.strcmp(AV63Var_ALbrUni, httpContext.getMessage( "K", ""))==0) ? A11683DevCruUnd : DecimalUtil.doubleToDec(0)) ;
         AV48Metrosdev = ((GXutil.strcmp(AV63Var_ALbrUni, httpContext.getMessage( "M", ""))==0) ? A11683DevCruUnd : DecimalUtil.doubleToDec(0)) ;
         AV24AlmacenTejidoencrudoDistribucion_SDTItem = (app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)new app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem(remoteHandle, context);
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Clicod( AV40clicod );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Clinom( AV41clinom );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albreccod( AV12albreccodIN );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrfen( AV19albrfen );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrent2( AV16Albrent );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrunient( AV22albrunient );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albruni( AV21albruni );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrpieent( AV20albrpieent );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barnhdr( localUtil.format( DecimalUtil.doubleToDec(A11669DevCruId), "ZZZZZZZ9") );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcod( AV28Barcod );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcodreo( AV30Barcodreo );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcodpar( AV29barcodpar );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barser( AV13albref );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcolnom( AV31barcolnom );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcolnum( AV32barcolnum );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Bartipcol( AV38bartipcol );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiekil( AV34barpiekil );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiemet( AV35barpiemet );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiepie( AV36barpiepie );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprocod( AV9ALbprocod );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprofch( A11670DevCruFec );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbkgm( AV46kilosdev );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbmtr( AV48Metrosdev );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbpie( A11684DevCruPzs );
         AV23AlmacenTejidoencrudoDistribucion_SDT.add(AV24AlmacenTejidoencrudoDistribucion_SDTItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( AV70GXLvl174 == 0 )
      {
      }
   }

   public void S121( )
   {
      /* 'ALBBAR' Routine */
      returnInSub = false ;
      AV9ALbprocod = 0 ;
      AV10Albprofch = GXutil.nullDate() ;
      AV71GXLvl219 = (byte)(0) ;
      /* Using cursor P0ATY6 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV28Barcod), Byte.valueOf(AV30Barcodreo), AV29barcodpar});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A130BarCodPar = P0ATY6_A130BarCodPar[0] ;
         A132BarCodReo = P0ATY6_A132BarCodReo[0] ;
         A129BarCod = P0ATY6_A129BarCod[0] ;
         A30AlbProCod = P0ATY6_A30AlbProCod[0] ;
         A34AlbProfch = P0ATY6_A34AlbProfch[0] ;
         A1263BarAlbMtrE = P0ATY6_A1263BarAlbMtrE[0] ;
         A1261BarAlbKgmE = P0ATY6_A1261BarAlbKgmE[0] ;
         A1265BarAlbPie = P0ATY6_A1265BarAlbPie[0] ;
         A34AlbProfch = P0ATY6_A34AlbProfch[0] ;
         AV71GXLvl219 = (byte)(1) ;
         AV9ALbprocod = A30AlbProCod ;
         AV10Albprofch = A34AlbProfch ;
         AV26BarAlbMtr = A1263BarAlbMtrE ;
         AV25BarAlbKgm = A1261BarAlbKgmE ;
         AV27BarAlbPie = A1265BarAlbPie ;
         System.out.println( httpContext.getMessage( "&albprocod=", "")+localUtil.format( DecimalUtil.doubleToDec(AV9ALbprocod), "ZZZZZZZZZ9")+httpContext.getMessage( "&Albprofch=", "")+localUtil.format( AV10Albprofch, "99/99/99")+httpContext.getMessage( "&BarAlbKgm=", "")+localUtil.format( AV25BarAlbKgm, "ZZZZZ9.99") );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem = (app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)new app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem(remoteHandle, context);
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Clicod( AV40clicod );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Clinom( AV41clinom );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albreccod( AV12albreccodIN );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrfen( AV19albrfen );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrent2( AV16Albrent );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrunient( AV22albrunient );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albruni( AV21albruni );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrpieent( AV20albrpieent );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barnhdr( AV33barnhdr );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcod( AV28Barcod );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcodreo( AV30Barcodreo );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcodpar( AV29barcodpar );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barser( AV37barser );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcolnom( AV31barcolnom );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcolnum( AV32barcolnum );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Bartipcol( AV38bartipcol );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiekil( AV34barpiekil );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiemet( AV35barpiemet );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiepie( AV36barpiepie );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprocod( AV9ALbprocod );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprofch( AV10Albprofch );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbkgm( AV25BarAlbKgm );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbmtr( AV26BarAlbMtr );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbpie( AV27BarAlbPie );
         AV23AlmacenTejidoencrudoDistribucion_SDT.add(AV24AlmacenTejidoencrudoDistribucion_SDTItem, 0);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      if ( AV71GXLvl219 == 0 )
      {
         AV24AlmacenTejidoencrudoDistribucion_SDTItem = (app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)new app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem(remoteHandle, context);
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Clicod( AV40clicod );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Clinom( AV41clinom );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albreccod( AV12albreccodIN );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrfen( AV19albrfen );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrent2( AV16Albrent );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrunient( AV22albrunient );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albruni( AV21albruni );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrpieent( AV20albrpieent );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barnhdr( AV33barnhdr );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcod( AV28Barcod );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcodreo( AV30Barcodreo );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcodpar( AV29barcodpar );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barser( AV37barser );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcolnom( AV31barcolnom );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcolnum( AV32barcolnum );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Bartipcol( AV38bartipcol );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiekil( AV34barpiekil );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiemet( AV35barpiemet );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiepie( AV36barpiepie );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprocod( 0 );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprofch( AV10Albprofch );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbkgm( DecimalUtil.doubleToDec(0) );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbmtr( DecimalUtil.doubleToDec(0) );
         AV24AlmacenTejidoencrudoDistribucion_SDTItem.setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbpie( 0 );
         AV23AlmacenTejidoencrudoDistribucion_SDT.add(AV24AlmacenTejidoencrudoDistribucion_SDTItem, 0);
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = almacentejidoencrudodistribucion_prc.this.A396EmprCod;
      this.aP1[0] = almacentejidoencrudodistribucion_prc.this.AV45ImpCod;
      this.aP2[0] = almacentejidoencrudodistribucion_prc.this.AV51PCliente;
      this.aP3[0] = almacentejidoencrudodistribucion_prc.this.AV58UCliente;
      this.aP4[0] = almacentejidoencrudodistribucion_prc.this.AV52PFecha;
      this.aP5[0] = almacentejidoencrudodistribucion_prc.this.AV59UFecha;
      this.aP6[0] = almacentejidoencrudodistribucion_prc.this.AV15ALbRef_i;
      this.aP7[0] = almacentejidoencrudodistribucion_prc.this.AV14AlbRef_f;
      this.aP8[0] = almacentejidoencrudodistribucion_prc.this.AV18Albrenti;
      this.aP9[0] = almacentejidoencrudodistribucion_prc.this.AV17Albrentf;
      this.aP10[0] = almacentejidoencrudodistribucion_prc.this.AV56Tipentcodi;
      this.aP11[0] = almacentejidoencrudodistribucion_prc.this.AV54Tipartcod1;
      this.aP12[0] = almacentejidoencrudodistribucion_prc.this.AV55Tipartcod2;
      this.aP13[0] = almacentejidoencrudodistribucion_prc.this.AV44Estado_a;
      this.aP14[0] = almacentejidoencrudodistribucion_prc.this.AV11AlbRecCod;
      this.aP15[0] = almacentejidoencrudodistribucion_prc.this.AV65AlmacenTejidoencrudoDistribucion_SDTJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV65AlmacenTejidoencrudoDistribucion_SDTJson = "" ;
      AV42ContDsc = "" ;
      GXv_char1 = new String[1] ;
      GXv_int3 = new byte[1] ;
      GXv_int5 = new int[1] ;
      AV23AlmacenTejidoencrudoDistribucion_SDT = new GXBaseCollection<app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem>(app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem.class, "AlmacenTejidoencrudoDistribucion_SDTItem", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A45AlbRef = "" ;
      A46AlbREnt = "" ;
      P0ATY2_A396EmprCod = new String[] {""} ;
      P0ATY2_A44AlbRecCod = new int[1] ;
      P0ATY2_A47AlbREst = new byte[1] ;
      P0ATY2_A6263AlbRTartC = new short[1] ;
      P0ATY2_n6263AlbRTartC = new boolean[] {false} ;
      P0ATY2_A1211TipEntCod = new short[1] ;
      P0ATY2_n1211TipEntCod = new boolean[] {false} ;
      P0ATY2_A46AlbREnt = new String[] {""} ;
      P0ATY2_A45AlbRef = new String[] {""} ;
      P0ATY2_A252CliCod = new int[1] ;
      P0ATY2_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P0ATY2_A5806AlbREnt2 = new String[] {""} ;
      P0ATY2_A279CliNom = new String[] {""} ;
      P0ATY2_A52AlbRPieEnt = new int[1] ;
      P0ATY2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATY2_A56AlbRUni = new String[] {""} ;
      A5806AlbREnt2 = "" ;
      A279CliNom = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A56AlbRUni = "" ;
      AV16Albrent = "" ;
      AV13albref = "" ;
      AV41clinom = "" ;
      AV19albrfen = GXutil.nullDate() ;
      AV22albrunient = DecimalUtil.ZERO ;
      AV21albruni = "" ;
      AV34barpiekil = DecimalUtil.ZERO ;
      AV35barpiemet = DecimalUtil.ZERO ;
      AV29barcodpar = "" ;
      AV31barcolnom = "" ;
      AV37barser = "" ;
      AV33barnhdr = "" ;
      AV10Albprofch = GXutil.nullDate() ;
      AV25BarAlbKgm = DecimalUtil.ZERO ;
      AV26BarAlbMtr = DecimalUtil.ZERO ;
      P0ATY4_A396EmprCod = new String[] {""} ;
      P0ATY4_A44AlbRecCod = new int[1] ;
      P0ATY4_A200BarPieCod = new String[] {""} ;
      P0ATY4_A135BarColNom = new String[] {""} ;
      P0ATY4_A136BarColNum = new int[1] ;
      P0ATY4_A218BarTipCol = new byte[1] ;
      P0ATY4_A212BarSer = new String[] {""} ;
      P0ATY4_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATY4_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATY4_A199BarPie1 = new short[1] ;
      P0ATY4_A365DisDes = new String[] {""} ;
      P0ATY4_A898BarPieNDes = new int[1] ;
      P0ATY4_A130BarCodPar = new String[] {""} ;
      P0ATY4_A132BarCodReo = new byte[1] ;
      P0ATY4_A129BarCod = new int[1] ;
      A200BarPieCod = "" ;
      A135BarColNom = "" ;
      A212BarSer = "" ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      A130BarCodPar = "" ;
      A13696BarNHdr = "" ;
      AV24AlmacenTejidoencrudoDistribucion_SDTItem = new app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem(remoteHandle, context);
      AV63Var_ALbrUni = "" ;
      AV61Var_AlbRFen = GXutil.nullDate() ;
      AV64Var_AlbRUniEnt = DecimalUtil.ZERO ;
      A11683DevCruUnd = DecimalUtil.ZERO ;
      A11670DevCruFec = GXutil.nullDate() ;
      P0ATY5_A396EmprCod = new String[] {""} ;
      P0ATY5_A44AlbRecCod = new int[1] ;
      P0ATY5_A11683DevCruUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATY5_A11669DevCruId = new int[1] ;
      P0ATY5_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0ATY5_A11684DevCruPzs = new int[1] ;
      AV46kilosdev = DecimalUtil.ZERO ;
      AV48Metrosdev = DecimalUtil.ZERO ;
      A34AlbProfch = GXutil.nullDate() ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      P0ATY6_A396EmprCod = new String[] {""} ;
      P0ATY6_A130BarCodPar = new String[] {""} ;
      P0ATY6_A132BarCodReo = new byte[1] ;
      P0ATY6_A129BarCod = new int[1] ;
      P0ATY6_A30AlbProCod = new long[1] ;
      P0ATY6_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P0ATY6_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATY6_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATY6_A1265BarAlbPie = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.almacentejidoencrudodistribucion_prc__default(),
         new Object[] {
             new Object[] {
            P0ATY2_A396EmprCod, P0ATY2_A44AlbRecCod, P0ATY2_A47AlbREst, P0ATY2_A6263AlbRTartC, P0ATY2_n6263AlbRTartC, P0ATY2_A1211TipEntCod, P0ATY2_n1211TipEntCod, P0ATY2_A46AlbREnt, P0ATY2_A45AlbRef, P0ATY2_A252CliCod,
            P0ATY2_A49AlbRFen, P0ATY2_A5806AlbREnt2, P0ATY2_A279CliNom, P0ATY2_A52AlbRPieEnt, P0ATY2_A58AlbRUniEnt, P0ATY2_A56AlbRUni
            }
            , new Object[] {
            P0ATY4_A396EmprCod, P0ATY4_A44AlbRecCod, P0ATY4_A200BarPieCod, P0ATY4_A135BarColNom, P0ATY4_A136BarColNum, P0ATY4_A218BarTipCol, P0ATY4_A212BarSer, P0ATY4_A203BarPieKil, P0ATY4_A205BarPieMet, P0ATY4_A199BarPie1,
            P0ATY4_A365DisDes, P0ATY4_A898BarPieNDes, P0ATY4_A130BarCodPar, P0ATY4_A132BarCodReo, P0ATY4_A129BarCod
            }
            , new Object[] {
            P0ATY5_A396EmprCod, P0ATY5_A44AlbRecCod, P0ATY5_A11683DevCruUnd, P0ATY5_A11669DevCruId, P0ATY5_A11670DevCruFec, P0ATY5_A11684DevCruPzs
            }
            , new Object[] {
            P0ATY6_A396EmprCod, P0ATY6_A130BarCodPar, P0ATY6_A132BarCodReo, P0ATY6_A129BarCod, P0ATY6_A30AlbProCod, P0ATY6_A34AlbProfch, P0ATY6_A1263BarAlbMtrE, P0ATY6_A1261BarAlbKgmE, P0ATY6_A1265BarAlbPie
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte GXt_int2 ;
   private byte GXv_int3[] ;
   private byte AV50PAlbRest ;
   private byte AV57UALbRest ;
   private byte A47AlbREst ;
   private byte AV30Barcodreo ;
   private byte AV38bartipcol ;
   private byte AV69GXLvl93 ;
   private byte A218BarTipCol ;
   private byte A132BarCodReo ;
   private byte AV70GXLvl174 ;
   private byte AV71GXLvl219 ;
   private short AV56Tipentcodi ;
   private short AV54Tipartcod1 ;
   private short AV55Tipartcod2 ;
   private short AV49Moda21 ;
   private short AV39Cli350 ;
   private short A6263AlbRTartC ;
   private short A1211TipEntCod ;
   private short A199BarPie1 ;
   private short AV53tablaDevCru ;
   private short Gx_err ;
   private int AV51PCliente ;
   private int AV58UCliente ;
   private int AV11AlbRecCod ;
   private int AV43ContVal ;
   private int GXt_int4 ;
   private int GXv_int5[] ;
   private int AV47Last_C ;
   private int A252CliCod ;
   private int A44AlbRecCod ;
   private int A52AlbRPieEnt ;
   private int AV12albreccodIN ;
   private int AV40clicod ;
   private int AV20albrpieent ;
   private int AV36barpiepie ;
   private int AV28Barcod ;
   private int AV32barcolnum ;
   private int AV27BarAlbPie ;
   private int A136BarColNum ;
   private int A898BarPieNDes ;
   private int A129BarCod ;
   private int A198BarPie ;
   private int AV60Var_Albreccod ;
   private int AV62Var_AlbRPieEnt ;
   private int A11669DevCruId ;
   private int A11684DevCruPzs ;
   private int A1265BarAlbPie ;
   private long AV9ALbprocod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal AV22albrunient ;
   private java.math.BigDecimal AV34barpiekil ;
   private java.math.BigDecimal AV35barpiemet ;
   private java.math.BigDecimal AV25BarAlbKgm ;
   private java.math.BigDecimal AV26BarAlbMtr ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal AV64Var_AlbRUniEnt ;
   private java.math.BigDecimal A11683DevCruUnd ;
   private java.math.BigDecimal AV46kilosdev ;
   private java.math.BigDecimal AV48Metrosdev ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private String A396EmprCod ;
   private String AV45ImpCod ;
   private String AV15ALbRef_i ;
   private String AV14AlbRef_f ;
   private String AV18Albrenti ;
   private String AV17Albrentf ;
   private String AV44Estado_a ;
   private String AV42ContDsc ;
   private String GXv_char1[] ;
   private String scmdbuf ;
   private String A45AlbRef ;
   private String A46AlbREnt ;
   private String A5806AlbREnt2 ;
   private String A279CliNom ;
   private String A56AlbRUni ;
   private String AV16Albrent ;
   private String AV13albref ;
   private String AV41clinom ;
   private String AV21albruni ;
   private String AV29barcodpar ;
   private String AV31barcolnom ;
   private String AV37barser ;
   private String AV33barnhdr ;
   private String A200BarPieCod ;
   private String A135BarColNom ;
   private String A212BarSer ;
   private String A365DisDes ;
   private String A130BarCodPar ;
   private String A13696BarNHdr ;
   private String AV63Var_ALbrUni ;
   private java.util.Date AV52PFecha ;
   private java.util.Date AV59UFecha ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date AV19albrfen ;
   private java.util.Date AV10Albprofch ;
   private java.util.Date AV61Var_AlbRFen ;
   private java.util.Date A11670DevCruFec ;
   private java.util.Date A34AlbProfch ;
   private boolean n6263AlbRTartC ;
   private boolean n1211TipEntCod ;
   private boolean returnInSub ;
   private String AV65AlmacenTejidoencrudoDistribucion_SDTJson ;
   private String[] aP15 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private int[] aP3 ;
   private java.util.Date[] aP4 ;
   private java.util.Date[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private short[] aP10 ;
   private short[] aP11 ;
   private short[] aP12 ;
   private String[] aP13 ;
   private int[] aP14 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ATY2_A396EmprCod ;
   private int[] P0ATY2_A44AlbRecCod ;
   private byte[] P0ATY2_A47AlbREst ;
   private short[] P0ATY2_A6263AlbRTartC ;
   private boolean[] P0ATY2_n6263AlbRTartC ;
   private short[] P0ATY2_A1211TipEntCod ;
   private boolean[] P0ATY2_n1211TipEntCod ;
   private String[] P0ATY2_A46AlbREnt ;
   private String[] P0ATY2_A45AlbRef ;
   private int[] P0ATY2_A252CliCod ;
   private java.util.Date[] P0ATY2_A49AlbRFen ;
   private String[] P0ATY2_A5806AlbREnt2 ;
   private String[] P0ATY2_A279CliNom ;
   private int[] P0ATY2_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P0ATY2_A58AlbRUniEnt ;
   private String[] P0ATY2_A56AlbRUni ;
   private String[] P0ATY4_A396EmprCod ;
   private int[] P0ATY4_A44AlbRecCod ;
   private String[] P0ATY4_A200BarPieCod ;
   private String[] P0ATY4_A135BarColNom ;
   private int[] P0ATY4_A136BarColNum ;
   private byte[] P0ATY4_A218BarTipCol ;
   private String[] P0ATY4_A212BarSer ;
   private java.math.BigDecimal[] P0ATY4_A203BarPieKil ;
   private java.math.BigDecimal[] P0ATY4_A205BarPieMet ;
   private short[] P0ATY4_A199BarPie1 ;
   private String[] P0ATY4_A365DisDes ;
   private int[] P0ATY4_A898BarPieNDes ;
   private String[] P0ATY4_A130BarCodPar ;
   private byte[] P0ATY4_A132BarCodReo ;
   private int[] P0ATY4_A129BarCod ;
   private String[] P0ATY5_A396EmprCod ;
   private int[] P0ATY5_A44AlbRecCod ;
   private java.math.BigDecimal[] P0ATY5_A11683DevCruUnd ;
   private int[] P0ATY5_A11669DevCruId ;
   private java.util.Date[] P0ATY5_A11670DevCruFec ;
   private int[] P0ATY5_A11684DevCruPzs ;
   private String[] P0ATY6_A396EmprCod ;
   private String[] P0ATY6_A130BarCodPar ;
   private byte[] P0ATY6_A132BarCodReo ;
   private int[] P0ATY6_A129BarCod ;
   private long[] P0ATY6_A30AlbProCod ;
   private java.util.Date[] P0ATY6_A34AlbProfch ;
   private java.math.BigDecimal[] P0ATY6_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] P0ATY6_A1261BarAlbKgmE ;
   private int[] P0ATY6_A1265BarAlbPie ;
   private GXBaseCollection<app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem> AV23AlmacenTejidoencrudoDistribucion_SDT ;
   private app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem AV24AlmacenTejidoencrudoDistribucion_SDTItem ;
}

final  class almacentejidoencrudodistribucion_prc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0ATY2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV52PFecha ,
                                          java.util.Date AV59UFecha ,
                                          int AV51PCliente ,
                                          int AV58UCliente ,
                                          String AV15ALbRef_i ,
                                          String AV14AlbRef_f ,
                                          String AV18Albrenti ,
                                          String AV17Albrentf ,
                                          short AV54Tipartcod1 ,
                                          short AV55Tipartcod2 ,
                                          byte AV50PAlbRest ,
                                          byte AV57UALbRest ,
                                          int AV11AlbRecCod ,
                                          java.util.Date A49AlbRFen ,
                                          int A252CliCod ,
                                          String A45AlbRef ,
                                          String A46AlbREnt ,
                                          short A6263AlbRTartC ,
                                          byte A47AlbREst ,
                                          int A44AlbRecCod ,
                                          short A1211TipEntCod ,
                                          short AV56Tipentcodi ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[16];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbRecCod, T1.AlbREst, T1.AlbRTartC, T1.TipEntCod, T1.AlbREnt, T1.AlbRef, T1.CliCod, T1.AlbRFen, T1.AlbREnt2, T2.CliNom, T1.AlbRPieEnt, T1.AlbRUniEnt," ;
      scmdbuf += " T1.AlbRUni FROM (TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.TipEntCod <> 9999)");
      addWhere(sWhereString, "(T1.TipEntCod = ? or (? = 0))");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV52PFecha)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV59UFecha)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen <= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (0==AV51PCliente) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (0==AV58UCliente) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15ALbRef_i)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef >= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV14AlbRef_f)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef <= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV18Albrenti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt >= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17Albrentf)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt <= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV54Tipartcod1) )
      {
         addWhere(sWhereString, "(T1.AlbRTartC >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV55Tipartcod2) )
      {
         addWhere(sWhereString, "(T1.AlbRTartC <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV50PAlbRest) )
      {
         addWhere(sWhereString, "(T1.AlbREst >= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV57UALbRest) )
      {
         addWhere(sWhereString, "(T1.AlbREst <= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (0==AV11AlbRecCod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod, T1.AlbRef" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
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
                  return conditional_P0ATY2(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).intValue() , (java.util.Date)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ATY2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ATY4", "SELECT T1.EmprCod, T1.AlbRecCod, T1.BarPieCod, T2.BarColNom, T2.BarColNum, T2.BarTipCol, T2.BarSer, T1.BarPieKil, T1.BarPieMet, COALESCE( T3.BarPie1, 0) AS BarPie1, T2.DisDes, COALESCE( T3.BarPieNDes, 0) AS BarPieNDes, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM ((TXPBARPIE T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ATY5", "SELECT T1.EmprCod, T1.AlbRecCod, T1.DevCruUnd, T1.DevCruId, T2.DevCruFec, T1.DevCruPzs FROM (TXPDEVCR1 T1 INNER JOIN TXPDEVCRU T2 ON T2.EmprCod = T1.EmprCod AND T2.DevCruId = T1.DevCruId) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ATY6", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.AlbProCod, T2.AlbProfch, T1.BarAlbMtrE, T1.BarAlbKgmE, T1.BarAlbPie FROM (TXPALBBAR T1 INNER JOIN TXPCALPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 8);
               ((String[]) buf[8])[0] = rslt.getString(7, 16);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 20);
               ((String[]) buf[12])[0] = rslt.getString(11, 30);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[15])[0] = rslt.getString(14, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((int[]) buf[8])[0] = rslt.getInt(9);
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
                  stmt.setString(sIdx, (String)parms[16], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[17]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[18]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[19]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[20]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[29]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[30]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

