package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcreagrr extends GXProcedure
{
   public pcreagrr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcreagrr.class ), "" );
   }

   public pcreagrr( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           byte[] aP2 ,
                                           String[] aP3 ,
                                           int[] aP4 ,
                                           byte[] aP5 ,
                                           String[] aP6 ,
                                           String[] aP7 ,
                                           int[] aP8 ,
                                           short[] aP9 ,
                                           java.math.BigDecimal[] aP10 )
   {
      pcreagrr.this.aP11 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        int[] aP8 ,
                        short[] aP9 ,
                        java.math.BigDecimal[] aP10 ,
                        java.math.BigDecimal[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             int[] aP8 ,
                             short[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             java.math.BigDecimal[] aP11 )
   {
      pcreagrr.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pcreagrr.this.AV16BarCod = aP1[0];
      this.aP1 = aP1;
      pcreagrr.this.AV17BarCodReo = aP2[0];
      this.aP2 = aP2;
      pcreagrr.this.AV18BarCodPar = aP3[0];
      this.aP3 = aP3;
      pcreagrr.this.AV19BarAgrCod = aP4[0];
      this.aP4 = aP4;
      pcreagrr.this.AV20BarAgrReo = aP5[0];
      this.aP5 = aP5;
      pcreagrr.this.AV21BarAgrPar = aP6[0];
      this.aP6 = aP6;
      pcreagrr.this.AV22BarMaqCod = aP7[0];
      this.aP7 = aP7;
      pcreagrr.this.AV23BarVolMaq = aP8[0];
      this.aP8 = aP8;
      pcreagrr.this.AV24PieAgr = aP9[0];
      this.aP9 = aP9;
      pcreagrr.this.AV25KgmAgr = aP10[0];
      this.aP10 = aP10;
      pcreagrr.this.AV26MtrAgr = aP11[0];
      this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02D82 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P02D82_A130BarCodPar[0] ;
         A132BarCodReo = P02D82_A132BarCodReo[0] ;
         A129BarCod = P02D82_A129BarCod[0] ;
         A396EmprCod = P02D82_A396EmprCod[0] ;
         A120BarAgrEst = P02D82_A120BarAgrEst[0] ;
         A212BarSer = P02D82_A212BarSer[0] ;
         A337DisArtDsc = P02D82_A337DisArtDsc[0] ;
         A252CliCod = P02D82_A252CliCod[0] ;
         n252CliCod = P02D82_n252CliCod[0] ;
         A361DisCod = P02D82_A361DisCod[0] ;
         A135BarColNom = P02D82_A135BarColNom[0] ;
         A136BarColNum = P02D82_A136BarColNum[0] ;
         A1234BarNomCli = P02D82_A1234BarNomCli[0] ;
         A1235BarNumCli = P02D82_A1235BarNumCli[0] ;
         A143BarDisNum = P02D82_A143BarDisNum[0] ;
         A3595BarMacCod = P02D82_A3595BarMacCod[0] ;
         A337DisArtDsc = P02D82_A337DisArtDsc[0] ;
         A120BarAgrEst = httpContext.getMessage( "S", "") ;
         AV30BarSer = A212BarSer ;
         AV32DisArtDsc = A337DisArtDsc ;
         AV33CliCod = A252CliCod ;
         AV34DisCod = A361DisCod ;
         AV35BarColNom = A135BarColNom ;
         AV36BarColNum = A136BarColNum ;
         AV37BarNomCli = A1234BarNomCli ;
         AV38BarNumCli = A1235BarNumCli ;
         AV46BarDisNum = A143BarDisNum ;
         AV48BarMacCod = A3595BarMacCod ;
         /* Using cursor P02D83 */
         pr_default.execute(1, new Object[] {A120BarAgrEst, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV49NumPda = 0 ;
      AV50HdrAgr = (byte)(0) ;
      /* Using cursor P02D84 */
      pr_default.execute(2, new Object[] {AV15EmprCod, Integer.valueOf(AV19BarAgrCod), Byte.valueOf(AV20BarAgrReo), AV21BarAgrPar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A130BarCodPar = P02D84_A130BarCodPar[0] ;
         A132BarCodReo = P02D84_A132BarCodReo[0] ;
         A129BarCod = P02D84_A129BarCod[0] ;
         A396EmprCod = P02D84_A396EmprCod[0] ;
         A120BarAgrEst = P02D84_A120BarAgrEst[0] ;
         A180BarMaqCod = P02D84_A180BarMaqCod[0] ;
         A2759BarMaqGru = P02D84_A2759BarMaqGru[0] ;
         A236BarVolMaq = P02D84_A236BarVolMaq[0] ;
         A3595BarMacCod = P02D84_A3595BarMacCod[0] ;
         A212BarSer = P02D84_A212BarSer[0] ;
         A337DisArtDsc = P02D84_A337DisArtDsc[0] ;
         A252CliCod = P02D84_A252CliCod[0] ;
         n252CliCod = P02D84_n252CliCod[0] ;
         A361DisCod = P02D84_A361DisCod[0] ;
         A135BarColNom = P02D84_A135BarColNom[0] ;
         A136BarColNum = P02D84_A136BarColNum[0] ;
         A1234BarNomCli = P02D84_A1234BarNomCli[0] ;
         A1235BarNumCli = P02D84_A1235BarNumCli[0] ;
         A143BarDisNum = P02D84_A143BarDisNum[0] ;
         A337DisArtDsc = P02D84_A337DisArtDsc[0] ;
         A120BarAgrEst = httpContext.getMessage( "S", "") ;
         A180BarMaqCod = AV22BarMaqCod ;
         A2759BarMaqGru = GXutil.substring( AV22BarMaqCod, 1, 4) ;
         A236BarVolMaq = AV23BarVolMaq ;
         AV49NumPda = A3595BarMacCod ;
         A3595BarMacCod = AV48BarMacCod ;
         AV31BarSer1 = A212BarSer ;
         AV39DisArtDsc1 = A337DisArtDsc ;
         AV40CliCod1 = A252CliCod ;
         AV41DisCod1 = A361DisCod ;
         AV42BarColNom1 = A135BarColNom ;
         AV43BarColNum1 = A136BarColNum ;
         AV44BarNomCli1 = A1234BarNomCli ;
         AV45BarNumCli1 = A1235BarNumCli ;
         AV47BarDisNum1 = A143BarDisNum ;
         AV50HdrAgr = (byte)(1) ;
         /* Using cursor P02D85 */
         pr_default.execute(3, new Object[] {A120BarAgrEst, A180BarMaqCod, A2759BarMaqGru, Integer.valueOf(A236BarVolMaq), Integer.valueOf(A3595BarMacCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      if ( ( AV49NumPda == 0 ) && ( AV48BarMacCod > 0 ) && ( AV50HdrAgr == 1 ) )
      {
         GXv_char1[0] = AV15EmprCod ;
         GXv_int2[0] = AV19BarAgrCod ;
         GXv_int3[0] = AV20BarAgrReo ;
         GXv_char4[0] = AV21BarAgrPar ;
         GXv_char5[0] = "" ;
         GXv_char6[0] = "" ;
         GXv_char7[0] = httpContext.getMessage( "ASP", "") ;
         new app.pvxgrain(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_char5, GXv_char6, GXv_char7) ;
         pcreagrr.this.AV15EmprCod = GXv_char1[0] ;
         pcreagrr.this.AV19BarAgrCod = GXv_int2[0] ;
         pcreagrr.this.AV20BarAgrReo = GXv_int3[0] ;
         pcreagrr.this.AV21BarAgrPar = GXv_char4[0] ;
      }
      n6285BarAgrMac = false ;
      /* Optimized UPDATE. */
      /* Using cursor P02D86 */
      pr_default.execute(4, new Object[] {Boolean.valueOf(n6285BarAgrMac), Integer.valueOf(AV48BarMacCod), AV47BarDisNum1, Integer.valueOf(AV45BarNumCli1), AV44BarNomCli1, Integer.valueOf(AV43BarColNum1), AV42BarColNom1, Integer.valueOf(AV41DisCod1), Integer.valueOf(AV40CliCod1), AV39DisArtDsc1, AV31BarSer1, AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar, Integer.valueOf(AV19BarAgrCod), Byte.valueOf(AV20BarAgrReo), AV21BarAgrPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAGR");
      /* End optimized UPDATE. */
      /* Using cursor P02D88 */
      pr_default.execute(5, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A130BarCodPar = P02D88_A130BarCodPar[0] ;
         A132BarCodReo = P02D88_A132BarCodReo[0] ;
         A129BarCod = P02D88_A129BarCod[0] ;
         A396EmprCod = P02D88_A396EmprCod[0] ;
         A166BarKgm = P02D88_A166BarKgm[0] ;
         A184BarMtr = P02D88_A184BarMtr[0] ;
         A199BarPie1 = P02D88_A199BarPie1[0] ;
         A365DisDes = P02D88_A365DisDes[0] ;
         A898BarPieNDes = P02D88_A898BarPieNDes[0] ;
         A166BarKgm = P02D88_A166BarKgm[0] ;
         A184BarMtr = P02D88_A184BarMtr[0] ;
         A199BarPie1 = P02D88_A199BarPie1[0] ;
         A898BarPieNDes = P02D88_A898BarPieNDes[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         /*
            INSERT RECORD ON TABLE TXPBARAGR

         */
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         A396EmprCod = AV15EmprCod ;
         A129BarCod = AV19BarAgrCod ;
         A132BarCodReo = AV20BarAgrReo ;
         A130BarCodPar = AV21BarAgrPar ;
         A119BarAgrCod = AV16BarCod ;
         A124BarAgrReo = AV17BarCodReo ;
         A122BarAgrPar = AV18BarCodPar ;
         A590KgmAgr = A166BarKgm ;
         A869MtrAgr = A184BarMtr ;
         A671PieAgr = (short)(A198BarPie) ;
         A1245BarAgrSer = AV30BarSer ;
         A1507BarAgrDsc = AV32DisArtDsc ;
         A1508CliCodAgr = AV33CliCod ;
         A1513DisCodAgr = AV34DisCod ;
         A1510ColNomAgr = AV35BarColNom ;
         A1512ColNumAgr = AV36BarColNum ;
         A1509ColNoCAgr = AV37BarNomCli ;
         A1511ColNuCAgr = AV38BarNumCli ;
         A1649BarAgrDNu = AV46BarDisNum ;
         A6285BarAgrMac = AV48BarMacCod ;
         n6285BarAgrMac = false ;
         /* Using cursor P02D89 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar, A590KgmAgr, Short.valueOf(A671PieAgr), A869MtrAgr, A1245BarAgrSer, A1507BarAgrDsc, Integer.valueOf(A1508CliCodAgr), Integer.valueOf(A1513DisCodAgr), A1510ColNomAgr, Integer.valueOf(A1512ColNumAgr), A1509ColNoCAgr, Integer.valueOf(A1511ColNuCAgr), A1649BarAgrDNu, Boolean.valueOf(n6285BarAgrMac), Integer.valueOf(A6285BarAgrMac)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAGR");
         if ( (pr_default.getStatus(6) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
      /* Using cursor P02D810 */
      pr_default.execute(7, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A6285BarAgrMac = P02D810_A6285BarAgrMac[0] ;
         n6285BarAgrMac = P02D810_n6285BarAgrMac[0] ;
         A1649BarAgrDNu = P02D810_A1649BarAgrDNu[0] ;
         A1511ColNuCAgr = P02D810_A1511ColNuCAgr[0] ;
         A1509ColNoCAgr = P02D810_A1509ColNoCAgr[0] ;
         A1512ColNumAgr = P02D810_A1512ColNumAgr[0] ;
         A1510ColNomAgr = P02D810_A1510ColNomAgr[0] ;
         A1513DisCodAgr = P02D810_A1513DisCodAgr[0] ;
         A1508CliCodAgr = P02D810_A1508CliCodAgr[0] ;
         A1507BarAgrDsc = P02D810_A1507BarAgrDsc[0] ;
         A1245BarAgrSer = P02D810_A1245BarAgrSer[0] ;
         A130BarCodPar = P02D810_A130BarCodPar[0] ;
         A132BarCodReo = P02D810_A132BarCodReo[0] ;
         A129BarCod = P02D810_A129BarCod[0] ;
         A396EmprCod = P02D810_A396EmprCod[0] ;
         A869MtrAgr = P02D810_A869MtrAgr[0] ;
         A671PieAgr = P02D810_A671PieAgr[0] ;
         A590KgmAgr = P02D810_A590KgmAgr[0] ;
         A122BarAgrPar = P02D810_A122BarAgrPar[0] ;
         A124BarAgrReo = P02D810_A124BarAgrReo[0] ;
         A119BarAgrCod = P02D810_A119BarAgrCod[0] ;
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         if ( ( A119BarAgrCod != AV19BarAgrCod ) || ( A124BarAgrReo != AV20BarAgrReo ) || ( GXutil.strcmp(A122BarAgrPar, AV21BarAgrPar) != 0 ) )
         {
            GXv_char7[0] = AV15EmprCod ;
            GXv_int2[0] = A119BarAgrCod ;
            GXv_int3[0] = A124BarAgrReo ;
            GXv_char6[0] = A122BarAgrPar ;
            GXv_char5[0] = AV22BarMaqCod ;
            GXv_int8[0] = AV23BarVolMaq ;
            GXv_char4[0] = AV30BarSer ;
            GXv_char1[0] = AV32DisArtDsc ;
            GXv_int9[0] = AV33CliCod ;
            GXv_int10[0] = AV34DisCod ;
            GXv_char11[0] = AV35BarColNom ;
            GXv_int12[0] = AV36BarColNum ;
            GXv_char13[0] = AV37BarNomCli ;
            GXv_int14[0] = AV38BarNumCli ;
            GXv_char15[0] = AV46BarDisNum ;
            new app.pmodmvo(remoteHandle, context).execute( GXv_char7, GXv_int2, GXv_int3, GXv_char6, GXv_char5, GXv_int8, GXv_char4, GXv_char1, GXv_int9, GXv_int10, GXv_char11, GXv_int12, GXv_char13, GXv_int14, GXv_char15) ;
            pcreagrr.this.AV15EmprCod = GXv_char7[0] ;
            pcreagrr.this.A119BarAgrCod = GXv_int2[0] ;
            pcreagrr.this.A124BarAgrReo = GXv_int3[0] ;
            pcreagrr.this.A122BarAgrPar = GXv_char6[0] ;
            pcreagrr.this.AV22BarMaqCod = GXv_char5[0] ;
            pcreagrr.this.AV23BarVolMaq = GXv_int8[0] ;
            pcreagrr.this.AV30BarSer = GXv_char4[0] ;
            pcreagrr.this.AV32DisArtDsc = GXv_char1[0] ;
            pcreagrr.this.AV33CliCod = GXv_int9[0] ;
            pcreagrr.this.AV34DisCod = GXv_int10[0] ;
            pcreagrr.this.AV35BarColNom = GXv_char11[0] ;
            pcreagrr.this.AV36BarColNum = GXv_int12[0] ;
            pcreagrr.this.AV37BarNomCli = GXv_char13[0] ;
            pcreagrr.this.AV38BarNumCli = GXv_int14[0] ;
            pcreagrr.this.AV46BarDisNum = GXv_char15[0] ;
            /*
               INSERT RECORD ON TABLE TXPBARAGR

            */
            W396EmprCod = A396EmprCod ;
            W129BarCod = A129BarCod ;
            W132BarCodReo = A132BarCodReo ;
            W130BarCodPar = A130BarCodPar ;
            W1245BarAgrSer = A1245BarAgrSer ;
            W1507BarAgrDsc = A1507BarAgrDsc ;
            W1508CliCodAgr = A1508CliCodAgr ;
            W1513DisCodAgr = A1513DisCodAgr ;
            W1510ColNomAgr = A1510ColNomAgr ;
            W1512ColNumAgr = A1512ColNumAgr ;
            W1509ColNoCAgr = A1509ColNoCAgr ;
            W1511ColNuCAgr = A1511ColNuCAgr ;
            W1649BarAgrDNu = A1649BarAgrDNu ;
            W6285BarAgrMac = A6285BarAgrMac ;
            n6285BarAgrMac = false ;
            A396EmprCod = AV15EmprCod ;
            A129BarCod = AV19BarAgrCod ;
            A132BarCodReo = AV20BarAgrReo ;
            A130BarCodPar = AV21BarAgrPar ;
            A1245BarAgrSer = AV30BarSer ;
            A1507BarAgrDsc = AV32DisArtDsc ;
            A1508CliCodAgr = AV33CliCod ;
            A1513DisCodAgr = AV34DisCod ;
            A1510ColNomAgr = AV35BarColNom ;
            A1512ColNumAgr = AV36BarColNum ;
            A1509ColNoCAgr = AV37BarNomCli ;
            A1511ColNuCAgr = AV38BarNumCli ;
            A1649BarAgrDNu = AV46BarDisNum ;
            A6285BarAgrMac = AV48BarMacCod ;
            n6285BarAgrMac = false ;
            /* Using cursor P02D811 */
            pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar, A590KgmAgr, Short.valueOf(A671PieAgr), A869MtrAgr, A1245BarAgrSer, A1507BarAgrDsc, Integer.valueOf(A1508CliCodAgr), Integer.valueOf(A1513DisCodAgr), A1510ColNomAgr, Integer.valueOf(A1512ColNumAgr), A1509ColNoCAgr, Integer.valueOf(A1511ColNuCAgr), A1649BarAgrDNu, Boolean.valueOf(n6285BarAgrMac), Integer.valueOf(A6285BarAgrMac)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAGR");
            if ( (pr_default.getStatus(8) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A396EmprCod = W396EmprCod ;
            A129BarCod = W129BarCod ;
            A132BarCodReo = W132BarCodReo ;
            A130BarCodPar = W130BarCodPar ;
            A1245BarAgrSer = W1245BarAgrSer ;
            A1507BarAgrDsc = W1507BarAgrDsc ;
            A1508CliCodAgr = W1508CliCodAgr ;
            A1513DisCodAgr = W1513DisCodAgr ;
            A1510ColNomAgr = W1510ColNomAgr ;
            A1512ColNumAgr = W1512ColNumAgr ;
            A1509ColNoCAgr = W1509ColNoCAgr ;
            A1511ColNuCAgr = W1511ColNuCAgr ;
            A1649BarAgrDNu = W1649BarAgrDNu ;
            A6285BarAgrMac = W6285BarAgrMac ;
            n6285BarAgrMac = false ;
            /* End Insert */
            /*
               INSERT RECORD ON TABLE TXPBARAGR

            */
            W396EmprCod = A396EmprCod ;
            W129BarCod = A129BarCod ;
            W132BarCodReo = A132BarCodReo ;
            W130BarCodPar = A130BarCodPar ;
            W119BarAgrCod = A119BarAgrCod ;
            W124BarAgrReo = A124BarAgrReo ;
            W122BarAgrPar = A122BarAgrPar ;
            W590KgmAgr = A590KgmAgr ;
            W869MtrAgr = A869MtrAgr ;
            W671PieAgr = A671PieAgr ;
            W1245BarAgrSer = A1245BarAgrSer ;
            W1507BarAgrDsc = A1507BarAgrDsc ;
            W1508CliCodAgr = A1508CliCodAgr ;
            W1513DisCodAgr = A1513DisCodAgr ;
            W1510ColNomAgr = A1510ColNomAgr ;
            W1512ColNumAgr = A1512ColNumAgr ;
            W1509ColNoCAgr = A1509ColNoCAgr ;
            W1511ColNuCAgr = A1511ColNuCAgr ;
            W1649BarAgrDNu = A1649BarAgrDNu ;
            W6285BarAgrMac = A6285BarAgrMac ;
            n6285BarAgrMac = false ;
            A396EmprCod = AV15EmprCod ;
            A129BarCod = A119BarAgrCod ;
            A132BarCodReo = A124BarAgrReo ;
            A130BarCodPar = A122BarAgrPar ;
            A119BarAgrCod = AV19BarAgrCod ;
            A124BarAgrReo = AV20BarAgrReo ;
            A122BarAgrPar = AV21BarAgrPar ;
            A590KgmAgr = AV25KgmAgr ;
            A869MtrAgr = AV26MtrAgr ;
            A671PieAgr = AV24PieAgr ;
            A1245BarAgrSer = AV31BarSer1 ;
            A1507BarAgrDsc = AV39DisArtDsc1 ;
            A1508CliCodAgr = AV40CliCod1 ;
            A1513DisCodAgr = AV41DisCod1 ;
            A1510ColNomAgr = AV42BarColNom1 ;
            A1512ColNumAgr = AV43BarColNum1 ;
            A1509ColNoCAgr = AV44BarNomCli1 ;
            A1511ColNuCAgr = AV45BarNumCli1 ;
            A1649BarAgrDNu = AV47BarDisNum1 ;
            A6285BarAgrMac = AV48BarMacCod ;
            n6285BarAgrMac = false ;
            /* Using cursor P02D812 */
            pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar, A590KgmAgr, Short.valueOf(A671PieAgr), A869MtrAgr, A1245BarAgrSer, A1507BarAgrDsc, Integer.valueOf(A1508CliCodAgr), Integer.valueOf(A1513DisCodAgr), A1510ColNomAgr, Integer.valueOf(A1512ColNumAgr), A1509ColNoCAgr, Integer.valueOf(A1511ColNuCAgr), A1649BarAgrDNu, Boolean.valueOf(n6285BarAgrMac), Integer.valueOf(A6285BarAgrMac)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAGR");
            if ( (pr_default.getStatus(9) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A396EmprCod = W396EmprCod ;
            A129BarCod = W129BarCod ;
            A132BarCodReo = W132BarCodReo ;
            A130BarCodPar = W130BarCodPar ;
            A119BarAgrCod = W119BarAgrCod ;
            A124BarAgrReo = W124BarAgrReo ;
            A122BarAgrPar = W122BarAgrPar ;
            A590KgmAgr = W590KgmAgr ;
            A869MtrAgr = W869MtrAgr ;
            A671PieAgr = W671PieAgr ;
            A1245BarAgrSer = W1245BarAgrSer ;
            A1507BarAgrDsc = W1507BarAgrDsc ;
            A1508CliCodAgr = W1508CliCodAgr ;
            A1513DisCodAgr = W1513DisCodAgr ;
            A1510ColNomAgr = W1510ColNomAgr ;
            A1512ColNumAgr = W1512ColNumAgr ;
            A1509ColNoCAgr = W1509ColNoCAgr ;
            A1511ColNuCAgr = W1511ColNuCAgr ;
            A1649BarAgrDNu = W1649BarAgrDNu ;
            A6285BarAgrMac = W6285BarAgrMac ;
            n6285BarAgrMac = false ;
            /* End Insert */
         }
         A396EmprCod = W396EmprCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         pr_default.readNext(7);
      }
      pr_default.close(7);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcreagrr.this.AV15EmprCod;
      this.aP1[0] = pcreagrr.this.AV16BarCod;
      this.aP2[0] = pcreagrr.this.AV17BarCodReo;
      this.aP3[0] = pcreagrr.this.AV18BarCodPar;
      this.aP4[0] = pcreagrr.this.AV19BarAgrCod;
      this.aP5[0] = pcreagrr.this.AV20BarAgrReo;
      this.aP6[0] = pcreagrr.this.AV21BarAgrPar;
      this.aP7[0] = pcreagrr.this.AV22BarMaqCod;
      this.aP8[0] = pcreagrr.this.AV23BarVolMaq;
      this.aP9[0] = pcreagrr.this.AV24PieAgr;
      this.aP10[0] = pcreagrr.this.AV25KgmAgr;
      this.aP11[0] = pcreagrr.this.AV26MtrAgr;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcreagrr");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P02D82_A130BarCodPar = new String[] {""} ;
      P02D82_A132BarCodReo = new byte[1] ;
      P02D82_A129BarCod = new int[1] ;
      P02D82_A396EmprCod = new String[] {""} ;
      P02D82_A120BarAgrEst = new String[] {""} ;
      P02D82_A212BarSer = new String[] {""} ;
      P02D82_A337DisArtDsc = new String[] {""} ;
      P02D82_A252CliCod = new int[1] ;
      P02D82_n252CliCod = new boolean[] {false} ;
      P02D82_A361DisCod = new int[1] ;
      P02D82_A135BarColNom = new String[] {""} ;
      P02D82_A136BarColNum = new int[1] ;
      P02D82_A1234BarNomCli = new String[] {""} ;
      P02D82_A1235BarNumCli = new int[1] ;
      P02D82_A143BarDisNum = new String[] {""} ;
      P02D82_A3595BarMacCod = new int[1] ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A120BarAgrEst = "" ;
      A212BarSer = "" ;
      A337DisArtDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A143BarDisNum = "" ;
      AV30BarSer = "" ;
      AV32DisArtDsc = "" ;
      AV35BarColNom = "" ;
      AV37BarNomCli = "" ;
      AV46BarDisNum = "" ;
      P02D84_A130BarCodPar = new String[] {""} ;
      P02D84_A132BarCodReo = new byte[1] ;
      P02D84_A129BarCod = new int[1] ;
      P02D84_A396EmprCod = new String[] {""} ;
      P02D84_A120BarAgrEst = new String[] {""} ;
      P02D84_A180BarMaqCod = new String[] {""} ;
      P02D84_A2759BarMaqGru = new String[] {""} ;
      P02D84_A236BarVolMaq = new int[1] ;
      P02D84_A3595BarMacCod = new int[1] ;
      P02D84_A212BarSer = new String[] {""} ;
      P02D84_A337DisArtDsc = new String[] {""} ;
      P02D84_A252CliCod = new int[1] ;
      P02D84_n252CliCod = new boolean[] {false} ;
      P02D84_A361DisCod = new int[1] ;
      P02D84_A135BarColNom = new String[] {""} ;
      P02D84_A136BarColNum = new int[1] ;
      P02D84_A1234BarNomCli = new String[] {""} ;
      P02D84_A1235BarNumCli = new int[1] ;
      P02D84_A143BarDisNum = new String[] {""} ;
      A180BarMaqCod = "" ;
      A2759BarMaqGru = "" ;
      AV31BarSer1 = "" ;
      AV39DisArtDsc1 = "" ;
      AV42BarColNom1 = "" ;
      AV44BarNomCli1 = "" ;
      AV47BarDisNum1 = "" ;
      A1649BarAgrDNu = "" ;
      A1509ColNoCAgr = "" ;
      A1510ColNomAgr = "" ;
      A1507BarAgrDsc = "" ;
      A1245BarAgrSer = "" ;
      P02D88_A130BarCodPar = new String[] {""} ;
      P02D88_A132BarCodReo = new byte[1] ;
      P02D88_A129BarCod = new int[1] ;
      P02D88_A396EmprCod = new String[] {""} ;
      P02D88_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02D88_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02D88_A199BarPie1 = new short[1] ;
      P02D88_A365DisDes = new String[] {""} ;
      P02D88_A898BarPieNDes = new int[1] ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      W396EmprCod = "" ;
      W130BarCodPar = "" ;
      A122BarAgrPar = "" ;
      A590KgmAgr = DecimalUtil.ZERO ;
      A869MtrAgr = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      P02D810_A6285BarAgrMac = new int[1] ;
      P02D810_n6285BarAgrMac = new boolean[] {false} ;
      P02D810_A1649BarAgrDNu = new String[] {""} ;
      P02D810_A1511ColNuCAgr = new int[1] ;
      P02D810_A1509ColNoCAgr = new String[] {""} ;
      P02D810_A1512ColNumAgr = new int[1] ;
      P02D810_A1510ColNomAgr = new String[] {""} ;
      P02D810_A1513DisCodAgr = new int[1] ;
      P02D810_A1508CliCodAgr = new int[1] ;
      P02D810_A1507BarAgrDsc = new String[] {""} ;
      P02D810_A1245BarAgrSer = new String[] {""} ;
      P02D810_A130BarCodPar = new String[] {""} ;
      P02D810_A132BarCodReo = new byte[1] ;
      P02D810_A129BarCod = new int[1] ;
      P02D810_A396EmprCod = new String[] {""} ;
      P02D810_A869MtrAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02D810_A671PieAgr = new short[1] ;
      P02D810_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02D810_A122BarAgrPar = new String[] {""} ;
      P02D810_A124BarAgrReo = new byte[1] ;
      P02D810_A119BarAgrCod = new int[1] ;
      GXv_char7 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char6 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_char1 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_int10 = new int[1] ;
      GXv_char11 = new String[1] ;
      GXv_int12 = new int[1] ;
      GXv_char13 = new String[1] ;
      GXv_int14 = new int[1] ;
      GXv_char15 = new String[1] ;
      W1245BarAgrSer = "" ;
      W1507BarAgrDsc = "" ;
      W1510ColNomAgr = "" ;
      W1509ColNoCAgr = "" ;
      W1649BarAgrDNu = "" ;
      W122BarAgrPar = "" ;
      W590KgmAgr = DecimalUtil.ZERO ;
      W869MtrAgr = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcreagrr__default(),
         new Object[] {
             new Object[] {
            P02D82_A130BarCodPar, P02D82_A132BarCodReo, P02D82_A129BarCod, P02D82_A396EmprCod, P02D82_A120BarAgrEst, P02D82_A212BarSer, P02D82_A337DisArtDsc, P02D82_A252CliCod, P02D82_n252CliCod, P02D82_A361DisCod,
            P02D82_A135BarColNom, P02D82_A136BarColNum, P02D82_A1234BarNomCli, P02D82_A1235BarNumCli, P02D82_A143BarDisNum, P02D82_A3595BarMacCod
            }
            , new Object[] {
            }
            , new Object[] {
            P02D84_A130BarCodPar, P02D84_A132BarCodReo, P02D84_A129BarCod, P02D84_A396EmprCod, P02D84_A120BarAgrEst, P02D84_A180BarMaqCod, P02D84_A2759BarMaqGru, P02D84_A236BarVolMaq, P02D84_A3595BarMacCod, P02D84_A212BarSer,
            P02D84_A337DisArtDsc, P02D84_A252CliCod, P02D84_n252CliCod, P02D84_A361DisCod, P02D84_A135BarColNom, P02D84_A136BarColNum, P02D84_A1234BarNomCli, P02D84_A1235BarNumCli, P02D84_A143BarDisNum
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P02D88_A130BarCodPar, P02D88_A132BarCodReo, P02D88_A129BarCod, P02D88_A396EmprCod, P02D88_A166BarKgm, P02D88_A184BarMtr, P02D88_A199BarPie1, P02D88_A365DisDes, P02D88_A898BarPieNDes
            }
            , new Object[] {
            }
            , new Object[] {
            P02D810_A6285BarAgrMac, P02D810_n6285BarAgrMac, P02D810_A1649BarAgrDNu, P02D810_A1511ColNuCAgr, P02D810_A1509ColNoCAgr, P02D810_A1512ColNumAgr, P02D810_A1510ColNomAgr, P02D810_A1513DisCodAgr, P02D810_A1508CliCodAgr, P02D810_A1507BarAgrDsc,
            P02D810_A1245BarAgrSer, P02D810_A130BarCodPar, P02D810_A132BarCodReo, P02D810_A129BarCod, P02D810_A396EmprCod, P02D810_A869MtrAgr, P02D810_A671PieAgr, P02D810_A590KgmAgr, P02D810_A122BarAgrPar, P02D810_A124BarAgrReo,
            P02D810_A119BarAgrCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17BarCodReo ;
   private byte AV20BarAgrReo ;
   private byte A132BarCodReo ;
   private byte AV50HdrAgr ;
   private byte W132BarCodReo ;
   private byte A124BarAgrReo ;
   private byte GXv_int3[] ;
   private byte W124BarAgrReo ;
   private short AV24PieAgr ;
   private short A199BarPie1 ;
   private short A671PieAgr ;
   private short Gx_err ;
   private short W671PieAgr ;
   private int AV16BarCod ;
   private int AV19BarAgrCod ;
   private int AV23BarVolMaq ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A361DisCod ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int A3595BarMacCod ;
   private int AV33CliCod ;
   private int AV34DisCod ;
   private int AV36BarColNum ;
   private int AV38BarNumCli ;
   private int AV48BarMacCod ;
   private int AV49NumPda ;
   private int A236BarVolMaq ;
   private int AV40CliCod1 ;
   private int AV41DisCod1 ;
   private int AV43BarColNum1 ;
   private int AV45BarNumCli1 ;
   private int A6285BarAgrMac ;
   private int A1511ColNuCAgr ;
   private int A1512ColNumAgr ;
   private int A1513DisCodAgr ;
   private int A1508CliCodAgr ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int W129BarCod ;
   private int GX_INS13 ;
   private int A119BarAgrCod ;
   private int GXv_int2[] ;
   private int GXv_int8[] ;
   private int GXv_int9[] ;
   private int GXv_int10[] ;
   private int GXv_int12[] ;
   private int GXv_int14[] ;
   private int W1508CliCodAgr ;
   private int W1513DisCodAgr ;
   private int W1512ColNumAgr ;
   private int W1511ColNuCAgr ;
   private int W6285BarAgrMac ;
   private int W119BarAgrCod ;
   private java.math.BigDecimal AV25KgmAgr ;
   private java.math.BigDecimal AV26MtrAgr ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A590KgmAgr ;
   private java.math.BigDecimal A869MtrAgr ;
   private java.math.BigDecimal W590KgmAgr ;
   private java.math.BigDecimal W869MtrAgr ;
   private String AV15EmprCod ;
   private String AV18BarCodPar ;
   private String AV21BarAgrPar ;
   private String AV22BarMaqCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A120BarAgrEst ;
   private String A212BarSer ;
   private String A337DisArtDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A143BarDisNum ;
   private String AV30BarSer ;
   private String AV32DisArtDsc ;
   private String AV35BarColNom ;
   private String AV37BarNomCli ;
   private String AV46BarDisNum ;
   private String A180BarMaqCod ;
   private String A2759BarMaqGru ;
   private String AV31BarSer1 ;
   private String AV39DisArtDsc1 ;
   private String AV42BarColNom1 ;
   private String AV44BarNomCli1 ;
   private String AV47BarDisNum1 ;
   private String A1649BarAgrDNu ;
   private String A1509ColNoCAgr ;
   private String A1510ColNomAgr ;
   private String A1507BarAgrDsc ;
   private String A1245BarAgrSer ;
   private String A365DisDes ;
   private String W396EmprCod ;
   private String W130BarCodPar ;
   private String A122BarAgrPar ;
   private String Gx_emsg ;
   private String GXv_char7[] ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char1[] ;
   private String GXv_char11[] ;
   private String GXv_char13[] ;
   private String GXv_char15[] ;
   private String W1245BarAgrSer ;
   private String W1507BarAgrDsc ;
   private String W1510ColNomAgr ;
   private String W1509ColNoCAgr ;
   private String W1649BarAgrDNu ;
   private String W122BarAgrPar ;
   private boolean n252CliCod ;
   private boolean n6285BarAgrMac ;
   private java.math.BigDecimal[] aP11 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private int[] aP8 ;
   private short[] aP9 ;
   private java.math.BigDecimal[] aP10 ;
   private IDataStoreProvider pr_default ;
   private String[] P02D82_A130BarCodPar ;
   private byte[] P02D82_A132BarCodReo ;
   private int[] P02D82_A129BarCod ;
   private String[] P02D82_A396EmprCod ;
   private String[] P02D82_A120BarAgrEst ;
   private String[] P02D82_A212BarSer ;
   private String[] P02D82_A337DisArtDsc ;
   private int[] P02D82_A252CliCod ;
   private boolean[] P02D82_n252CliCod ;
   private int[] P02D82_A361DisCod ;
   private String[] P02D82_A135BarColNom ;
   private int[] P02D82_A136BarColNum ;
   private String[] P02D82_A1234BarNomCli ;
   private int[] P02D82_A1235BarNumCli ;
   private String[] P02D82_A143BarDisNum ;
   private int[] P02D82_A3595BarMacCod ;
   private String[] P02D84_A130BarCodPar ;
   private byte[] P02D84_A132BarCodReo ;
   private int[] P02D84_A129BarCod ;
   private String[] P02D84_A396EmprCod ;
   private String[] P02D84_A120BarAgrEst ;
   private String[] P02D84_A180BarMaqCod ;
   private String[] P02D84_A2759BarMaqGru ;
   private int[] P02D84_A236BarVolMaq ;
   private int[] P02D84_A3595BarMacCod ;
   private String[] P02D84_A212BarSer ;
   private String[] P02D84_A337DisArtDsc ;
   private int[] P02D84_A252CliCod ;
   private boolean[] P02D84_n252CliCod ;
   private int[] P02D84_A361DisCod ;
   private String[] P02D84_A135BarColNom ;
   private int[] P02D84_A136BarColNum ;
   private String[] P02D84_A1234BarNomCli ;
   private int[] P02D84_A1235BarNumCli ;
   private String[] P02D84_A143BarDisNum ;
   private String[] P02D88_A130BarCodPar ;
   private byte[] P02D88_A132BarCodReo ;
   private int[] P02D88_A129BarCod ;
   private String[] P02D88_A396EmprCod ;
   private java.math.BigDecimal[] P02D88_A166BarKgm ;
   private java.math.BigDecimal[] P02D88_A184BarMtr ;
   private short[] P02D88_A199BarPie1 ;
   private String[] P02D88_A365DisDes ;
   private int[] P02D88_A898BarPieNDes ;
   private int[] P02D810_A6285BarAgrMac ;
   private boolean[] P02D810_n6285BarAgrMac ;
   private String[] P02D810_A1649BarAgrDNu ;
   private int[] P02D810_A1511ColNuCAgr ;
   private String[] P02D810_A1509ColNoCAgr ;
   private int[] P02D810_A1512ColNumAgr ;
   private String[] P02D810_A1510ColNomAgr ;
   private int[] P02D810_A1513DisCodAgr ;
   private int[] P02D810_A1508CliCodAgr ;
   private String[] P02D810_A1507BarAgrDsc ;
   private String[] P02D810_A1245BarAgrSer ;
   private String[] P02D810_A130BarCodPar ;
   private byte[] P02D810_A132BarCodReo ;
   private int[] P02D810_A129BarCod ;
   private String[] P02D810_A396EmprCod ;
   private java.math.BigDecimal[] P02D810_A869MtrAgr ;
   private short[] P02D810_A671PieAgr ;
   private java.math.BigDecimal[] P02D810_A590KgmAgr ;
   private String[] P02D810_A122BarAgrPar ;
   private byte[] P02D810_A124BarAgrReo ;
   private int[] P02D810_A119BarAgrCod ;
}

final  class pcreagrr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02D82", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.BarAgrEst, T1.BarSer, T2.DisArtDsc, T1.CliCod, T1.DisCod, T1.BarColNom, T1.BarColNum, T1.BarNomCli, T1.BarNumCli, T1.BarDisNum, T1.BarMacCod FROM (TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02D83", "UPDATE TXPBARCAD SET BarAgrEst=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P02D84", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.BarAgrEst, T1.BarMaqCod, T1.BarMaqGru, T1.BarVolMaq, T1.BarMacCod, T1.BarSer, T2.DisArtDsc, T1.CliCod, T1.DisCod, T1.BarColNom, T1.BarColNum, T1.BarNomCli, T1.BarNumCli, T1.BarDisNum FROM (TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02D85", "UPDATE TXPBARCAD SET BarAgrEst=?, BarMaqCod=?, BarMaqGru=?, BarVolMaq=?, BarMacCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new UpdateCursor("P02D86", "UPDATE TXPBARAGR SET BarAgrMac=?, BarAgrDNu=?, ColNuCAgr=?, ColNoCAgr=?, ColNumAgr=?, ColNomAgr=?, DisCodAgr=?, CliCodAgr=?, BarAgrDsc=?, BarAgrSer=?  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarAgrCod = ? and BarAgrReo = ? and BarAgrPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARAGR")
         ,new ForEachCursor("P02D88", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02D89", "INSERT INTO TXPBARAGR(EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar, KgmAgr, PieAgr, MtrAgr, BarAgrSer, BarAgrDsc, CliCodAgr, DisCodAgr, ColNomAgr, ColNumAgr, ColNoCAgr, ColNuCAgr, BarAgrDNu, BarAgrMac) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARAGR")
         ,new ForEachCursor("P02D810", "SELECT BarAgrMac, BarAgrDNu, ColNuCAgr, ColNoCAgr, ColNumAgr, ColNomAgr, DisCodAgr, CliCodAgr, BarAgrDsc, BarAgrSer, BarCodPar, BarCodReo, BarCod, EmprCod, MtrAgr, PieAgr, KgmAgr, BarAgrPar, BarAgrReo, BarAgrCod FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02D811", "INSERT INTO TXPBARAGR(EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar, KgmAgr, PieAgr, MtrAgr, BarAgrSer, BarAgrDsc, CliCodAgr, DisCodAgr, ColNomAgr, ColNumAgr, ColNoCAgr, ColNuCAgr, BarAgrDNu, BarAgrMac) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARAGR")
         ,new UpdateCursor("P02D812", "INSERT INTO TXPBARAGR(EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar, KgmAgr, PieAgr, MtrAgr, BarAgrSer, BarAgrDsc, CliCodAgr, DisCodAgr, ColNomAgr, ColNumAgr, ColNoCAgr, ColNuCAgr, BarAgrDNu, BarAgrMac) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARAGR")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 13);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 13);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 8);
               ((int[]) buf[15])[0] = rslt.getInt(15);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 4);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((String[]) buf[10])[0] = rslt.getString(11, 26);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 13);
               ((int[]) buf[15])[0] = rslt.getInt(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 13);
               ((int[]) buf[17])[0] = rslt.getInt(17);
               ((String[]) buf[18])[0] = rslt.getString(18, 8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 8);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 13);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 26);
               ((String[]) buf[10])[0] = rslt.getString(10, 16);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 3);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               ((short[]) buf[16])[0] = rslt.getShort(16);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((String[]) buf[18])[0] = rslt.getString(18, 1);
               ((byte[]) buf[19])[0] = rslt.getByte(19);
               ((int[]) buf[20])[0] = rslt.getInt(20);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 4);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 3);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 1);
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 8);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 13);
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setString(6, (String)parms[6], 13);
               stmt.setInt(7, ((Number) parms[7]).intValue());
               stmt.setInt(8, ((Number) parms[8]).intValue());
               stmt.setString(9, (String)parms[9], 26);
               stmt.setString(10, (String)parms[10], 16);
               stmt.setString(11, (String)parms[11], 3);
               stmt.setInt(12, ((Number) parms[12]).intValue());
               stmt.setByte(13, ((Number) parms[13]).byteValue());
               stmt.setString(14, (String)parms[14], 1);
               stmt.setInt(15, ((Number) parms[15]).intValue());
               stmt.setByte(16, ((Number) parms[16]).byteValue());
               stmt.setString(17, (String)parms[17], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
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
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 8 :
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
            case 9 :
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

