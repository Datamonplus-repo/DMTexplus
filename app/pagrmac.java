package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pagrmac extends GXProcedure
{
   public pagrmac( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pagrmac.class ), "" );
   }

   public pagrmac( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pagrmac.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      pagrmac.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pagrmac.this.AV15MacCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV46PrintAcc ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "IMPACC", ""), GXv_int2) ;
      pagrmac.this.GXt_int1 = GXv_int2[0] ;
      AV46PrintAcc = GXt_int1 ;
      GXt_char3 = AV48Lit0 ;
      GXv_char4[0] = GXt_char3 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV65Pgmname, (byte)(99), GXv_char4) ;
      pagrmac.this.GXt_char3 = GXv_char4[0] ;
      AV48Lit0 = GXt_char3 ;
      AV49Lit1 = httpContext.getMessage( "Nº Macro", "") ;
      GXt_char3 = AV50Lit2 ;
      GXv_char4[0] = GXt_char3 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2189_", ""), (byte)(99), GXv_char4) ;
      pagrmac.this.GXt_char3 = GXv_char4[0] ;
      AV50Lit2 = GXt_char3 ;
      GXt_char3 = AV51Lit3 ;
      GXv_char4[0] = GXt_char3 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3023_", ""), (byte)(99), GXv_char4) ;
      pagrmac.this.GXt_char3 = GXv_char4[0] ;
      AV51Lit3 = GXt_char3 ;
      GXt_int1 = AV58FasMin ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FASMIN", ""), GXv_int2) ;
      pagrmac.this.GXt_int1 = GXv_int2[0] ;
      AV58FasMin = GXt_int1 ;
      GXt_char3 = AV62Station ;
      GXv_char4[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      pagrmac.this.GXt_char3 = GXv_char4[0] ;
      AV62Station = GXt_char3 ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char5[0] = AV60EmprNom ;
      GXv_char6[0] = AV61UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV62Station, GXv_char4, GXv_char5, GXv_char6) ;
      pagrmac.this.A396EmprCod = GXv_char4[0] ;
      pagrmac.this.AV60EmprNom = GXv_char5[0] ;
      pagrmac.this.AV61UsurCod = GXv_char6[0] ;
      AV47Imp_p = (byte)(0) ;
      AV29ContLin = (short)(0) ;
      AV45MacLin = (short)(0) ;
      /* Using cursor P007Z2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15MacCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1199MacCod = P007Z2_A1199MacCod[0] ;
         A1201MacLin = P007Z2_A1201MacLin[0] ;
         AV29ContLin = (short)(AV29ContLin+1) ;
         if ( AV29ContLin == 1 )
         {
            AV45MacLin = A1201MacLin ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV45MacLin = (short)(((AV45MacLin==0) ? 1 : AV45MacLin)) ;
      AV16Linea = AV45MacLin ;
      AV17Flag = httpContext.getMessage( "S", "") ;
      while ( GXutil.strcmp(AV17Flag, httpContext.getMessage( "S", "")) == 0 )
      {
         AV17Flag = httpContext.getMessage( "N", "") ;
         /* Using cursor P007Z3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV15MacCod), Short.valueOf(AV16Linea)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1205MacBarPar = P007Z3_A1205MacBarPar[0] ;
            A1204MacBarReo = P007Z3_A1204MacBarReo[0] ;
            A1203MacBarCod = P007Z3_A1203MacBarCod[0] ;
            A1201MacLin = P007Z3_A1201MacLin[0] ;
            A1199MacCod = P007Z3_A1199MacCod[0] ;
            AV17Flag = httpContext.getMessage( "S", "") ;
            AV22BarVolMaq = 0 ;
            AV21BarMaqCod = "" ;
            AV28BarSer = "" ;
            AV30BarSerDsc = "" ;
            AV31CliCod = 0 ;
            AV32DisCod = 0 ;
            AV33BarColNom = "" ;
            AV34BarColNum = 0 ;
            AV35BarNomCli = "" ;
            AV36BarNumCli = 0 ;
            AV44BarDisNum = "" ;
            AV52BarMacCod = 0 ;
            AV18BarCod = A1203MacBarCod ;
            AV19BarCodReo = A1204MacBarReo ;
            AV20BarCodPar = A1205MacBarPar ;
            /* Using cursor P007Z4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A1203MacBarCod), Byte.valueOf(A1204MacBarReo), A1205MacBarPar});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A129BarCod = P007Z4_A129BarCod[0] ;
               A132BarCodReo = P007Z4_A132BarCodReo[0] ;
               A130BarCodPar = P007Z4_A130BarCodPar[0] ;
               A120BarAgrEst = P007Z4_A120BarAgrEst[0] ;
               A180BarMaqCod = P007Z4_A180BarMaqCod[0] ;
               A236BarVolMaq = P007Z4_A236BarVolMaq[0] ;
               A212BarSer = P007Z4_A212BarSer[0] ;
               A1652BarSerDsc = P007Z4_A1652BarSerDsc[0] ;
               A252CliCod = P007Z4_A252CliCod[0] ;
               n252CliCod = P007Z4_n252CliCod[0] ;
               A361DisCod = P007Z4_A361DisCod[0] ;
               A135BarColNom = P007Z4_A135BarColNom[0] ;
               A136BarColNum = P007Z4_A136BarColNum[0] ;
               A1234BarNomCli = P007Z4_A1234BarNomCli[0] ;
               A1235BarNumCli = P007Z4_A1235BarNumCli[0] ;
               A143BarDisNum = P007Z4_A143BarDisNum[0] ;
               A3595BarMacCod = P007Z4_A3595BarMacCod[0] ;
               if ( AV29ContLin > 1 )
               {
                  A120BarAgrEst = httpContext.getMessage( "S", "") ;
               }
               AV21BarMaqCod = A180BarMaqCod ;
               AV22BarVolMaq = A236BarVolMaq ;
               AV28BarSer = A212BarSer ;
               AV30BarSerDsc = A1652BarSerDsc ;
               AV31CliCod = A252CliCod ;
               AV32DisCod = A361DisCod ;
               AV33BarColNom = A135BarColNom ;
               AV34BarColNum = A136BarColNum ;
               AV35BarNomCli = A1234BarNomCli ;
               AV36BarNumCli = A1235BarNumCli ;
               AV44BarDisNum = A143BarDisNum ;
               AV52BarMacCod = A3595BarMacCod ;
               /* Using cursor P007Z5 */
               pr_default.execute(3, new Object[] {A120BarAgrEst, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(2);
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( GXutil.strcmp(AV17Flag, httpContext.getMessage( "S", "")) == 0 )
         {
            AV59Inc_obs = httpContext.getMessage( "Agrupacion desde CMACRO_LMACRO", "") + GXutil.newLine( ) ;
            /* Using cursor P007Z6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV15MacCod), Short.valueOf(AV16Linea)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A1205MacBarPar = P007Z6_A1205MacBarPar[0] ;
               A1204MacBarReo = P007Z6_A1204MacBarReo[0] ;
               A1203MacBarCod = P007Z6_A1203MacBarCod[0] ;
               A1201MacLin = P007Z6_A1201MacLin[0] ;
               A1199MacCod = P007Z6_A1199MacCod[0] ;
               /* Using cursor P007Z8 */
               pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A1203MacBarCod), Byte.valueOf(A1204MacBarReo), A1205MacBarPar});
               while ( (pr_default.getStatus(5) != 101) )
               {
                  A129BarCod = P007Z8_A129BarCod[0] ;
                  A132BarCodReo = P007Z8_A132BarCodReo[0] ;
                  A130BarCodPar = P007Z8_A130BarCodPar[0] ;
                  A180BarMaqCod = P007Z8_A180BarMaqCod[0] ;
                  A236BarVolMaq = P007Z8_A236BarVolMaq[0] ;
                  A212BarSer = P007Z8_A212BarSer[0] ;
                  A1652BarSerDsc = P007Z8_A1652BarSerDsc[0] ;
                  A252CliCod = P007Z8_A252CliCod[0] ;
                  n252CliCod = P007Z8_n252CliCod[0] ;
                  A361DisCod = P007Z8_A361DisCod[0] ;
                  A135BarColNom = P007Z8_A135BarColNom[0] ;
                  A136BarColNum = P007Z8_A136BarColNum[0] ;
                  A1234BarNomCli = P007Z8_A1234BarNomCli[0] ;
                  A1235BarNumCli = P007Z8_A1235BarNumCli[0] ;
                  A143BarDisNum = P007Z8_A143BarDisNum[0] ;
                  A3595BarMacCod = P007Z8_A3595BarMacCod[0] ;
                  A166BarKgm = P007Z8_A166BarKgm[0] ;
                  A184BarMtr = P007Z8_A184BarMtr[0] ;
                  A199BarPie1 = P007Z8_A199BarPie1[0] ;
                  A365DisDes = P007Z8_A365DisDes[0] ;
                  A898BarPieNDes = P007Z8_A898BarPieNDes[0] ;
                  A166BarKgm = P007Z8_A166BarKgm[0] ;
                  A184BarMtr = P007Z8_A184BarMtr[0] ;
                  A199BarPie1 = P007Z8_A199BarPie1[0] ;
                  A898BarPieNDes = P007Z8_A898BarPieNDes[0] ;
                  if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                  {
                     A198BarPie = A898BarPieNDes ;
                  }
                  else
                  {
                     A198BarPie = A199BarPie1 ;
                  }
                  A180BarMaqCod = AV21BarMaqCod ;
                  A236BarVolMaq = AV22BarVolMaq ;
                  AV23BarKgm = A166BarKgm ;
                  AV24BarMtr = A184BarMtr ;
                  AV25BarPie = A198BarPie ;
                  AV28BarSer = A212BarSer ;
                  AV30BarSerDsc = A1652BarSerDsc ;
                  AV31CliCod = A252CliCod ;
                  AV32DisCod = A361DisCod ;
                  AV33BarColNom = A135BarColNom ;
                  AV34BarColNum = A136BarColNum ;
                  AV35BarNomCli = A1234BarNomCli ;
                  AV36BarNumCli = A1235BarNumCli ;
                  AV44BarDisNum = A143BarDisNum ;
                  AV52BarMacCod = A3595BarMacCod ;
                  /* Using cursor P007Z9 */
                  pr_default.execute(6, new Object[] {A180BarMaqCod, Integer.valueOf(A236BarVolMaq), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(5);
               if ( ! (0==AV18BarCod) && ! (0==A1203MacBarCod) )
               {
                  /*
                     INSERT RECORD ON TABLE TXPBARAGR

                  */
                  A129BarCod = AV18BarCod ;
                  A132BarCodReo = AV19BarCodReo ;
                  A130BarCodPar = AV20BarCodPar ;
                  A119BarAgrCod = A1203MacBarCod ;
                  A124BarAgrReo = A1204MacBarReo ;
                  A122BarAgrPar = A1205MacBarPar ;
                  A590KgmAgr = AV23BarKgm ;
                  A869MtrAgr = AV24BarMtr ;
                  A671PieAgr = (short)(AV25BarPie) ;
                  A1245BarAgrSer = AV28BarSer ;
                  A1507BarAgrDsc = AV30BarSerDsc ;
                  A1508CliCodAgr = AV31CliCod ;
                  A1513DisCodAgr = AV32DisCod ;
                  A1510ColNomAgr = AV33BarColNom ;
                  A1512ColNumAgr = AV34BarColNum ;
                  A1509ColNoCAgr = AV35BarNomCli ;
                  A1511ColNuCAgr = AV36BarNumCli ;
                  A1649BarAgrDNu = AV44BarDisNum ;
                  A6285BarAgrMac = AV52BarMacCod ;
                  n6285BarAgrMac = false ;
                  /* Using cursor P007Z10 */
                  pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar, A590KgmAgr, Short.valueOf(A671PieAgr), A869MtrAgr, A1245BarAgrSer, A1507BarAgrDsc, Integer.valueOf(A1508CliCodAgr), Integer.valueOf(A1513DisCodAgr), A1510ColNomAgr, Integer.valueOf(A1512ColNumAgr), A1509ColNoCAgr, Integer.valueOf(A1511ColNuCAgr), A1649BarAgrDNu, Boolean.valueOf(n6285BarAgrMac), Integer.valueOf(A6285BarAgrMac)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAGR");
                  if ( (pr_default.getStatus(7) == 1) )
                  {
                     Gx_err = (short)(1) ;
                     Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                  }
                  else
                  {
                     Gx_err = (short)(0) ;
                     Gx_emsg = "" ;
                  }
                  /* End Insert */
                  AV53MacBarCod = A1203MacBarCod ;
                  AV54MacBarReo = A1204MacBarReo ;
                  AV55MacBarPar = A1205MacBarPar ;
                  AV59Inc_obs += httpContext.getMessage( "Barcod-Barcodreo-Barcodpar   =", "") + GXutil.str( AV18BarCod, 8, 0) + GXutil.str( AV19BarCodReo, 1, 0) + AV20BarCodPar + GXutil.newLine( ) ;
                  AV59Inc_obs += httpContext.getMessage( "BarAgrcod-BarAgrreo-BarAgrpar=", "") + GXutil.str( A1203MacBarCod, 8, 0) + GXutil.str( A1204MacBarReo, 1, 0) + A1205MacBarPar + GXutil.newLine( ) ;
               }
               pr_default.readNext(4);
            }
            pr_default.close(4);
            AV16Linea = (short)(AV16Linea+1) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV59Inc_obs)==0) )
      {
      }
      if ( AV58FasMin == 1 )
      {
         GXv_char6[0] = A396EmprCod ;
         GXv_int7[0] = AV53MacBarCod ;
         GXv_int2[0] = AV54MacBarReo ;
         GXv_char5[0] = AV55MacBarPar ;
         new app.pcremag(remoteHandle, context).execute( GXv_char6, GXv_int7, GXv_int2, GXv_char5) ;
         pagrmac.this.A396EmprCod = GXv_char6[0] ;
         pagrmac.this.AV53MacBarCod = GXv_int7[0] ;
         pagrmac.this.AV54MacBarReo = GXv_int2[0] ;
         pagrmac.this.AV55MacBarPar = GXv_char5[0] ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pagrmac.this.A396EmprCod;
      this.aP1[0] = pagrmac.this.AV15MacCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pagrmac");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV48Lit0 = "" ;
      AV65Pgmname = "" ;
      AV49Lit1 = "" ;
      AV50Lit2 = "" ;
      AV51Lit3 = "" ;
      AV62Station = "" ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      AV60EmprNom = "" ;
      AV61UsurCod = "" ;
      scmdbuf = "" ;
      P007Z2_A396EmprCod = new String[] {""} ;
      P007Z2_A1199MacCod = new int[1] ;
      P007Z2_A1201MacLin = new short[1] ;
      AV17Flag = "" ;
      P007Z3_A396EmprCod = new String[] {""} ;
      P007Z3_A1205MacBarPar = new String[] {""} ;
      P007Z3_A1204MacBarReo = new byte[1] ;
      P007Z3_A1203MacBarCod = new int[1] ;
      P007Z3_A1201MacLin = new short[1] ;
      P007Z3_A1199MacCod = new int[1] ;
      A1205MacBarPar = "" ;
      AV21BarMaqCod = "" ;
      AV28BarSer = "" ;
      AV30BarSerDsc = "" ;
      AV33BarColNom = "" ;
      AV35BarNomCli = "" ;
      AV44BarDisNum = "" ;
      AV20BarCodPar = "" ;
      P007Z4_A396EmprCod = new String[] {""} ;
      P007Z4_A129BarCod = new int[1] ;
      P007Z4_A132BarCodReo = new byte[1] ;
      P007Z4_A130BarCodPar = new String[] {""} ;
      P007Z4_A120BarAgrEst = new String[] {""} ;
      P007Z4_A180BarMaqCod = new String[] {""} ;
      P007Z4_A236BarVolMaq = new int[1] ;
      P007Z4_A212BarSer = new String[] {""} ;
      P007Z4_A1652BarSerDsc = new String[] {""} ;
      P007Z4_A252CliCod = new int[1] ;
      P007Z4_n252CliCod = new boolean[] {false} ;
      P007Z4_A361DisCod = new int[1] ;
      P007Z4_A135BarColNom = new String[] {""} ;
      P007Z4_A136BarColNum = new int[1] ;
      P007Z4_A1234BarNomCli = new String[] {""} ;
      P007Z4_A1235BarNumCli = new int[1] ;
      P007Z4_A143BarDisNum = new String[] {""} ;
      P007Z4_A3595BarMacCod = new int[1] ;
      A130BarCodPar = "" ;
      A120BarAgrEst = "" ;
      A180BarMaqCod = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A143BarDisNum = "" ;
      AV59Inc_obs = "" ;
      P007Z6_A396EmprCod = new String[] {""} ;
      P007Z6_A1205MacBarPar = new String[] {""} ;
      P007Z6_A1204MacBarReo = new byte[1] ;
      P007Z6_A1203MacBarCod = new int[1] ;
      P007Z6_A1201MacLin = new short[1] ;
      P007Z6_A1199MacCod = new int[1] ;
      P007Z8_A396EmprCod = new String[] {""} ;
      P007Z8_A129BarCod = new int[1] ;
      P007Z8_A132BarCodReo = new byte[1] ;
      P007Z8_A130BarCodPar = new String[] {""} ;
      P007Z8_A180BarMaqCod = new String[] {""} ;
      P007Z8_A236BarVolMaq = new int[1] ;
      P007Z8_A212BarSer = new String[] {""} ;
      P007Z8_A1652BarSerDsc = new String[] {""} ;
      P007Z8_A252CliCod = new int[1] ;
      P007Z8_n252CliCod = new boolean[] {false} ;
      P007Z8_A361DisCod = new int[1] ;
      P007Z8_A135BarColNom = new String[] {""} ;
      P007Z8_A136BarColNum = new int[1] ;
      P007Z8_A1234BarNomCli = new String[] {""} ;
      P007Z8_A1235BarNumCli = new int[1] ;
      P007Z8_A143BarDisNum = new String[] {""} ;
      P007Z8_A3595BarMacCod = new int[1] ;
      P007Z8_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P007Z8_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P007Z8_A199BarPie1 = new short[1] ;
      P007Z8_A365DisDes = new String[] {""} ;
      P007Z8_A898BarPieNDes = new int[1] ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      AV23BarKgm = DecimalUtil.ZERO ;
      AV24BarMtr = DecimalUtil.ZERO ;
      A122BarAgrPar = "" ;
      A590KgmAgr = DecimalUtil.ZERO ;
      A869MtrAgr = DecimalUtil.ZERO ;
      A1245BarAgrSer = "" ;
      A1507BarAgrDsc = "" ;
      A1510ColNomAgr = "" ;
      A1509ColNoCAgr = "" ;
      A1649BarAgrDNu = "" ;
      Gx_emsg = "" ;
      AV55MacBarPar = "" ;
      GXv_char6 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int2 = new byte[1] ;
      GXv_char5 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pagrmac__default(),
         new Object[] {
             new Object[] {
            P007Z2_A396EmprCod, P007Z2_A1199MacCod, P007Z2_A1201MacLin
            }
            , new Object[] {
            P007Z3_A396EmprCod, P007Z3_A1205MacBarPar, P007Z3_A1204MacBarReo, P007Z3_A1203MacBarCod, P007Z3_A1201MacLin, P007Z3_A1199MacCod
            }
            , new Object[] {
            P007Z4_A396EmprCod, P007Z4_A129BarCod, P007Z4_A132BarCodReo, P007Z4_A130BarCodPar, P007Z4_A120BarAgrEst, P007Z4_A180BarMaqCod, P007Z4_A236BarVolMaq, P007Z4_A212BarSer, P007Z4_A1652BarSerDsc, P007Z4_A252CliCod,
            P007Z4_n252CliCod, P007Z4_A361DisCod, P007Z4_A135BarColNom, P007Z4_A136BarColNum, P007Z4_A1234BarNomCli, P007Z4_A1235BarNumCli, P007Z4_A143BarDisNum, P007Z4_A3595BarMacCod
            }
            , new Object[] {
            }
            , new Object[] {
            P007Z6_A396EmprCod, P007Z6_A1205MacBarPar, P007Z6_A1204MacBarReo, P007Z6_A1203MacBarCod, P007Z6_A1201MacLin, P007Z6_A1199MacCod
            }
            , new Object[] {
            P007Z8_A396EmprCod, P007Z8_A129BarCod, P007Z8_A132BarCodReo, P007Z8_A130BarCodPar, P007Z8_A180BarMaqCod, P007Z8_A236BarVolMaq, P007Z8_A212BarSer, P007Z8_A1652BarSerDsc, P007Z8_A252CliCod, P007Z8_n252CliCod,
            P007Z8_A361DisCod, P007Z8_A135BarColNom, P007Z8_A136BarColNum, P007Z8_A1234BarNomCli, P007Z8_A1235BarNumCli, P007Z8_A143BarDisNum, P007Z8_A3595BarMacCod, P007Z8_A166BarKgm, P007Z8_A184BarMtr, P007Z8_A199BarPie1,
            P007Z8_A365DisDes, P007Z8_A898BarPieNDes
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      AV65Pgmname = "PAGRMAC" ;
      /* GeneXus formulas. */
      AV65Pgmname = "PAGRMAC" ;
      Gx_err = (short)(0) ;
   }

   private byte AV46PrintAcc ;
   private byte AV58FasMin ;
   private byte GXt_int1 ;
   private byte AV47Imp_p ;
   private byte A1204MacBarReo ;
   private byte AV19BarCodReo ;
   private byte A132BarCodReo ;
   private byte A124BarAgrReo ;
   private byte AV54MacBarReo ;
   private byte GXv_int2[] ;
   private short AV29ContLin ;
   private short AV45MacLin ;
   private short A1201MacLin ;
   private short AV16Linea ;
   private short A199BarPie1 ;
   private short A671PieAgr ;
   private short Gx_err ;
   private int AV15MacCod ;
   private int A1199MacCod ;
   private int A1203MacBarCod ;
   private int AV22BarVolMaq ;
   private int AV31CliCod ;
   private int AV32DisCod ;
   private int AV34BarColNum ;
   private int AV36BarNumCli ;
   private int AV52BarMacCod ;
   private int AV18BarCod ;
   private int A129BarCod ;
   private int A236BarVolMaq ;
   private int A252CliCod ;
   private int A361DisCod ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int A3595BarMacCod ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int AV25BarPie ;
   private int GX_INS13 ;
   private int A119BarAgrCod ;
   private int A1508CliCodAgr ;
   private int A1513DisCodAgr ;
   private int A1512ColNumAgr ;
   private int A1511ColNuCAgr ;
   private int A6285BarAgrMac ;
   private int AV53MacBarCod ;
   private int GXv_int7[] ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal AV23BarKgm ;
   private java.math.BigDecimal AV24BarMtr ;
   private java.math.BigDecimal A590KgmAgr ;
   private java.math.BigDecimal A869MtrAgr ;
   private String A396EmprCod ;
   private String AV48Lit0 ;
   private String AV65Pgmname ;
   private String AV49Lit1 ;
   private String AV50Lit2 ;
   private String AV51Lit3 ;
   private String AV62Station ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String AV60EmprNom ;
   private String AV61UsurCod ;
   private String scmdbuf ;
   private String AV17Flag ;
   private String A1205MacBarPar ;
   private String AV21BarMaqCod ;
   private String AV28BarSer ;
   private String AV30BarSerDsc ;
   private String AV33BarColNom ;
   private String AV35BarNomCli ;
   private String AV44BarDisNum ;
   private String AV20BarCodPar ;
   private String A130BarCodPar ;
   private String A120BarAgrEst ;
   private String A180BarMaqCod ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A143BarDisNum ;
   private String A365DisDes ;
   private String A122BarAgrPar ;
   private String A1245BarAgrSer ;
   private String A1507BarAgrDsc ;
   private String A1510ColNomAgr ;
   private String A1509ColNoCAgr ;
   private String A1649BarAgrDNu ;
   private String Gx_emsg ;
   private String AV55MacBarPar ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private boolean n252CliCod ;
   private boolean n6285BarAgrMac ;
   private String AV59Inc_obs ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P007Z2_A396EmprCod ;
   private int[] P007Z2_A1199MacCod ;
   private short[] P007Z2_A1201MacLin ;
   private String[] P007Z3_A396EmprCod ;
   private String[] P007Z3_A1205MacBarPar ;
   private byte[] P007Z3_A1204MacBarReo ;
   private int[] P007Z3_A1203MacBarCod ;
   private short[] P007Z3_A1201MacLin ;
   private int[] P007Z3_A1199MacCod ;
   private String[] P007Z4_A396EmprCod ;
   private int[] P007Z4_A129BarCod ;
   private byte[] P007Z4_A132BarCodReo ;
   private String[] P007Z4_A130BarCodPar ;
   private String[] P007Z4_A120BarAgrEst ;
   private String[] P007Z4_A180BarMaqCod ;
   private int[] P007Z4_A236BarVolMaq ;
   private String[] P007Z4_A212BarSer ;
   private String[] P007Z4_A1652BarSerDsc ;
   private int[] P007Z4_A252CliCod ;
   private boolean[] P007Z4_n252CliCod ;
   private int[] P007Z4_A361DisCod ;
   private String[] P007Z4_A135BarColNom ;
   private int[] P007Z4_A136BarColNum ;
   private String[] P007Z4_A1234BarNomCli ;
   private int[] P007Z4_A1235BarNumCli ;
   private String[] P007Z4_A143BarDisNum ;
   private int[] P007Z4_A3595BarMacCod ;
   private String[] P007Z6_A396EmprCod ;
   private String[] P007Z6_A1205MacBarPar ;
   private byte[] P007Z6_A1204MacBarReo ;
   private int[] P007Z6_A1203MacBarCod ;
   private short[] P007Z6_A1201MacLin ;
   private int[] P007Z6_A1199MacCod ;
   private String[] P007Z8_A396EmprCod ;
   private int[] P007Z8_A129BarCod ;
   private byte[] P007Z8_A132BarCodReo ;
   private String[] P007Z8_A130BarCodPar ;
   private String[] P007Z8_A180BarMaqCod ;
   private int[] P007Z8_A236BarVolMaq ;
   private String[] P007Z8_A212BarSer ;
   private String[] P007Z8_A1652BarSerDsc ;
   private int[] P007Z8_A252CliCod ;
   private boolean[] P007Z8_n252CliCod ;
   private int[] P007Z8_A361DisCod ;
   private String[] P007Z8_A135BarColNom ;
   private int[] P007Z8_A136BarColNum ;
   private String[] P007Z8_A1234BarNomCli ;
   private int[] P007Z8_A1235BarNumCli ;
   private String[] P007Z8_A143BarDisNum ;
   private int[] P007Z8_A3595BarMacCod ;
   private java.math.BigDecimal[] P007Z8_A166BarKgm ;
   private java.math.BigDecimal[] P007Z8_A184BarMtr ;
   private short[] P007Z8_A199BarPie1 ;
   private String[] P007Z8_A365DisDes ;
   private int[] P007Z8_A898BarPieNDes ;
}

final  class pagrmac__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P007Z2", "SELECT EmprCod, MacCod, MacLin FROM TXPLMACRO WHERE EmprCod = ? and MacCod = ? ORDER BY EmprCod, MacCod, MacLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P007Z3", "SELECT * FROM (SELECT EmprCod, MacBarPar, MacBarReo, MacBarCod, MacLin, MacCod FROM TXPLMACRO WHERE EmprCod = ? and MacCod = ? and MacLin >= ? ORDER BY EmprCod, MacCod, MacLin) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P007Z4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrEst, BarMaqCod, BarVolMaq, BarSer, BarSerDsc, CliCod, DisCod, BarColNom, BarColNum, BarNomCli, BarNumCli, BarDisNum, BarMacCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P007Z5", "UPDATE TXPBARCAD SET BarAgrEst=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P007Z6", "SELECT EmprCod, MacBarPar, MacBarReo, MacBarCod, MacLin, MacCod FROM TXPLMACRO WHERE (EmprCod = ? and MacCod = ?) AND (MacLin <> ?) ORDER BY EmprCod, MacCod, MacLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P007Z8", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarMaqCod, T1.BarVolMaq, T1.BarSer, T1.BarSerDsc, T1.CliCod, T1.DisCod, T1.BarColNom, T1.BarColNum, T1.BarNomCli, T1.BarNumCli, T1.BarDisNum, T1.BarMacCod, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P007Z9", "UPDATE TXPBARCAD SET BarMaqCod=?, BarVolMaq=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new UpdateCursor("P007Z10", "INSERT INTO TXPBARAGR(EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar, KgmAgr, PieAgr, MtrAgr, BarAgrSer, BarAgrDsc, CliCodAgr, DisCodAgr, ColNomAgr, ColNumAgr, ColNoCAgr, ColNuCAgr, BarAgrDNu, BarAgrMac) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARAGR")
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 13);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 13);
               ((int[]) buf[15])[0] = rslt.getInt(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 8);
               ((int[]) buf[17])[0] = rslt.getInt(17);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 13);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 13);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((String[]) buf[15])[0] = rslt.getString(15, 8);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((short[]) buf[19])[0] = rslt.getShort(19);
               ((String[]) buf[20])[0] = rslt.getString(20, 1);
               ((int[]) buf[21])[0] = rslt.getInt(21);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setString(11, (String)parms[10], 16);
               stmt.setString(12, (String)parms[11], 26);
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setString(15, (String)parms[14], 13);
               stmt.setInt(16, ((Number) parms[15]).intValue());
               stmt.setString(17, (String)parms[16], 13);
               stmt.setInt(18, ((Number) parms[17]).intValue());
               stmt.setString(19, (String)parms[18], 8);
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(20, ((Number) parms[20]).intValue());
               }
               return;
      }
   }

}

