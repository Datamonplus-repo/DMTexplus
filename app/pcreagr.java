package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcreagr extends GXProcedure
{
   public pcreagr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcreagr.class ), "" );
   }

   public pcreagr( int remoteHandle ,
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
      pcreagr.this.aP11 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
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
      pcreagr.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pcreagr.this.AV16BarCod = aP1[0];
      this.aP1 = aP1;
      pcreagr.this.AV17BarCodReo = aP2[0];
      this.aP2 = aP2;
      pcreagr.this.AV18BarCodPar = aP3[0];
      this.aP3 = aP3;
      pcreagr.this.AV19BarAgrCod = aP4[0];
      this.aP4 = aP4;
      pcreagr.this.AV20BarAgrReo = aP5[0];
      this.aP5 = aP5;
      pcreagr.this.AV21BarAgrPar = aP6[0];
      this.aP6 = aP6;
      pcreagr.this.AV22BarMaqCod = aP7[0];
      this.aP7 = aP7;
      pcreagr.this.AV23BarVolMaq = aP8[0];
      this.aP8 = aP8;
      pcreagr.this.AV24PieAgr = aP9[0];
      this.aP9 = aP9;
      pcreagr.this.AV25KgmAgr = aP10[0];
      this.aP10 = aP10;
      pcreagr.this.AV26MtrAgr = aP11[0];
      this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV49Inc_obs = " " ;
      GXt_char1 = AV50Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pcreagr.this.GXt_char1 = GXv_char2[0] ;
      AV50Station = GXt_char1 ;
      GXv_char2[0] = AV15EmprCod ;
      GXv_char3[0] = AV52EmprNom ;
      GXv_char4[0] = AV51Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV50Station, GXv_char2, GXv_char3, GXv_char4) ;
      pcreagr.this.AV15EmprCod = GXv_char2[0] ;
      pcreagr.this.AV52EmprNom = GXv_char3[0] ;
      pcreagr.this.AV51Usurcod = GXv_char4[0] ;
      /* Using cursor P00122 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P00122_A130BarCodPar[0] ;
         A132BarCodReo = P00122_A132BarCodReo[0] ;
         A129BarCod = P00122_A129BarCod[0] ;
         A396EmprCod = P00122_A396EmprCod[0] ;
         A120BarAgrEst = P00122_A120BarAgrEst[0] ;
         A212BarSer = P00122_A212BarSer[0] ;
         A1652BarSerDsc = P00122_A1652BarSerDsc[0] ;
         A252CliCod = P00122_A252CliCod[0] ;
         n252CliCod = P00122_n252CliCod[0] ;
         A361DisCod = P00122_A361DisCod[0] ;
         A135BarColNom = P00122_A135BarColNom[0] ;
         A136BarColNum = P00122_A136BarColNum[0] ;
         A1234BarNomCli = P00122_A1234BarNomCli[0] ;
         A1235BarNumCli = P00122_A1235BarNumCli[0] ;
         A143BarDisNum = P00122_A143BarDisNum[0] ;
         A3595BarMacCod = P00122_A3595BarMacCod[0] ;
         A120BarAgrEst = httpContext.getMessage( "S", "") ;
         AV30BarSer = A212BarSer ;
         AV32DisArtDsc = A1652BarSerDsc ;
         AV33CliCod = A252CliCod ;
         AV34DisCod = A361DisCod ;
         AV35BarColNom = A135BarColNom ;
         AV36BarColNum = A136BarColNum ;
         AV37BarNomCli = A1234BarNomCli ;
         AV38BarNumCli = A1235BarNumCli ;
         AV46BarDisNum = A143BarDisNum ;
         AV48BarMacCod = A3595BarMacCod ;
         AV49Inc_obs += httpContext.getMessage( "Actualizo BARCAD, BarAGrest=S,Barcod...=", "") + GXutil.str( AV16BarCod, 8, 0) + GXutil.str( AV17BarCodReo, 1, 0) + AV18BarCodPar ;
         /* Using cursor P00123 */
         pr_default.execute(1, new Object[] {A120BarAgrEst, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P00124 */
      pr_default.execute(2, new Object[] {AV15EmprCod, Integer.valueOf(AV19BarAgrCod), Byte.valueOf(AV20BarAgrReo), AV21BarAgrPar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A130BarCodPar = P00124_A130BarCodPar[0] ;
         A132BarCodReo = P00124_A132BarCodReo[0] ;
         A129BarCod = P00124_A129BarCod[0] ;
         A396EmprCod = P00124_A396EmprCod[0] ;
         A120BarAgrEst = P00124_A120BarAgrEst[0] ;
         A180BarMaqCod = P00124_A180BarMaqCod[0] ;
         A2759BarMaqGru = P00124_A2759BarMaqGru[0] ;
         A236BarVolMaq = P00124_A236BarVolMaq[0] ;
         A3595BarMacCod = P00124_A3595BarMacCod[0] ;
         A212BarSer = P00124_A212BarSer[0] ;
         A1652BarSerDsc = P00124_A1652BarSerDsc[0] ;
         A252CliCod = P00124_A252CliCod[0] ;
         n252CliCod = P00124_n252CliCod[0] ;
         A361DisCod = P00124_A361DisCod[0] ;
         A135BarColNom = P00124_A135BarColNom[0] ;
         A136BarColNum = P00124_A136BarColNum[0] ;
         A1234BarNomCli = P00124_A1234BarNomCli[0] ;
         A1235BarNumCli = P00124_A1235BarNumCli[0] ;
         A143BarDisNum = P00124_A143BarDisNum[0] ;
         A120BarAgrEst = httpContext.getMessage( "S", "") ;
         A180BarMaqCod = AV22BarMaqCod ;
         A2759BarMaqGru = GXutil.substring( AV22BarMaqCod, 1, 4) ;
         A236BarVolMaq = AV23BarVolMaq ;
         A3595BarMacCod = AV48BarMacCod ;
         AV31BarSer1 = A212BarSer ;
         AV39DisArtDsc1 = A1652BarSerDsc ;
         AV40CliCod1 = A252CliCod ;
         AV41DisCod1 = A361DisCod ;
         AV42BarColNom1 = A135BarColNom ;
         AV43BarColNum1 = A136BarColNum ;
         AV44BarNomCli1 = A1234BarNomCli ;
         AV45BarNumCli1 = A1235BarNumCli ;
         AV47BarDisNum1 = A143BarDisNum ;
         AV49Inc_obs += httpContext.getMessage( "Actualizo BARCAD, BarAGrest=S,Barcod...=", "") + GXutil.str( AV19BarAgrCod, 8, 0) + GXutil.str( AV20BarAgrReo, 1, 0) + AV21BarAgrPar ;
         /* Using cursor P00125 */
         pr_default.execute(3, new Object[] {A120BarAgrEst, A180BarMaqCod, A2759BarMaqGru, Integer.valueOf(A236BarVolMaq), Integer.valueOf(A3595BarMacCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      /* Using cursor P00126 */
      pr_default.execute(4, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar, Integer.valueOf(AV19BarAgrCod), Byte.valueOf(AV20BarAgrReo), AV21BarAgrPar});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A122BarAgrPar = P00126_A122BarAgrPar[0] ;
         A124BarAgrReo = P00126_A124BarAgrReo[0] ;
         A119BarAgrCod = P00126_A119BarAgrCod[0] ;
         A130BarCodPar = P00126_A130BarCodPar[0] ;
         A132BarCodReo = P00126_A132BarCodReo[0] ;
         A129BarCod = P00126_A129BarCod[0] ;
         A396EmprCod = P00126_A396EmprCod[0] ;
         A1245BarAgrSer = P00126_A1245BarAgrSer[0] ;
         A1507BarAgrDsc = P00126_A1507BarAgrDsc[0] ;
         A1508CliCodAgr = P00126_A1508CliCodAgr[0] ;
         A1513DisCodAgr = P00126_A1513DisCodAgr[0] ;
         A1510ColNomAgr = P00126_A1510ColNomAgr[0] ;
         A1512ColNumAgr = P00126_A1512ColNumAgr[0] ;
         A1509ColNoCAgr = P00126_A1509ColNoCAgr[0] ;
         A1511ColNuCAgr = P00126_A1511ColNuCAgr[0] ;
         A1649BarAgrDNu = P00126_A1649BarAgrDNu[0] ;
         A1245BarAgrSer = AV31BarSer1 ;
         A1507BarAgrDsc = AV39DisArtDsc1 ;
         A1508CliCodAgr = AV40CliCod1 ;
         A1513DisCodAgr = AV41DisCod1 ;
         A1510ColNomAgr = AV42BarColNom1 ;
         A1512ColNumAgr = AV43BarColNum1 ;
         A1509ColNoCAgr = AV44BarNomCli1 ;
         A1511ColNuCAgr = AV45BarNumCli1 ;
         A1649BarAgrDNu = AV47BarDisNum1 ;
         AV49Inc_obs += httpContext.getMessage( "Actualizo BARAGR, Barcod.. y BarAgrCod=", "") + GXutil.str( AV16BarCod, 8, 0) + GXutil.str( AV17BarCodReo, 1, 0) + AV18BarCodPar + " " + GXutil.str( AV19BarAgrCod, 8, 0) + GXutil.str( AV20BarAgrReo, 1, 0) + AV21BarAgrPar ;
         /* Using cursor P00127 */
         pr_default.execute(5, new Object[] {A1245BarAgrSer, A1507BarAgrDsc, Integer.valueOf(A1508CliCodAgr), Integer.valueOf(A1513DisCodAgr), A1510ColNomAgr, Integer.valueOf(A1512ColNumAgr), A1509ColNoCAgr, Integer.valueOf(A1511ColNuCAgr), A1649BarAgrDNu, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAGR");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
      /* Using cursor P00129 */
      pr_default.execute(6, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A130BarCodPar = P00129_A130BarCodPar[0] ;
         A132BarCodReo = P00129_A132BarCodReo[0] ;
         A129BarCod = P00129_A129BarCod[0] ;
         A396EmprCod = P00129_A396EmprCod[0] ;
         A166BarKgm = P00129_A166BarKgm[0] ;
         A184BarMtr = P00129_A184BarMtr[0] ;
         A199BarPie1 = P00129_A199BarPie1[0] ;
         A365DisDes = P00129_A365DisDes[0] ;
         A898BarPieNDes = P00129_A898BarPieNDes[0] ;
         A166BarKgm = P00129_A166BarKgm[0] ;
         A184BarMtr = P00129_A184BarMtr[0] ;
         A199BarPie1 = P00129_A199BarPie1[0] ;
         A898BarPieNDes = P00129_A898BarPieNDes[0] ;
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
         /* Using cursor P001210 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar, A590KgmAgr, Short.valueOf(A671PieAgr), A869MtrAgr, A1245BarAgrSer, A1507BarAgrDsc, Integer.valueOf(A1508CliCodAgr), Integer.valueOf(A1513DisCodAgr), A1510ColNomAgr, Integer.valueOf(A1512ColNumAgr), A1509ColNoCAgr, Integer.valueOf(A1511ColNuCAgr), A1649BarAgrDNu});
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
         A396EmprCod = W396EmprCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         /* End Insert */
         AV49Inc_obs += httpContext.getMessage( "INS BARAGR, BarAgrCod=", "") + GXutil.str( AV19BarAgrCod, 8, 0) + GXutil.str( AV20BarAgrReo, 1, 0) + AV21BarAgrPar ;
         A396EmprCod = W396EmprCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
      /* Using cursor P001211 */
      pr_default.execute(8, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A1649BarAgrDNu = P001211_A1649BarAgrDNu[0] ;
         A1511ColNuCAgr = P001211_A1511ColNuCAgr[0] ;
         A1509ColNoCAgr = P001211_A1509ColNoCAgr[0] ;
         A1512ColNumAgr = P001211_A1512ColNumAgr[0] ;
         A1510ColNomAgr = P001211_A1510ColNomAgr[0] ;
         A1513DisCodAgr = P001211_A1513DisCodAgr[0] ;
         A1508CliCodAgr = P001211_A1508CliCodAgr[0] ;
         A1507BarAgrDsc = P001211_A1507BarAgrDsc[0] ;
         A1245BarAgrSer = P001211_A1245BarAgrSer[0] ;
         A130BarCodPar = P001211_A130BarCodPar[0] ;
         A132BarCodReo = P001211_A132BarCodReo[0] ;
         A129BarCod = P001211_A129BarCod[0] ;
         A396EmprCod = P001211_A396EmprCod[0] ;
         A6285BarAgrMac = P001211_A6285BarAgrMac[0] ;
         n6285BarAgrMac = P001211_n6285BarAgrMac[0] ;
         A869MtrAgr = P001211_A869MtrAgr[0] ;
         A671PieAgr = P001211_A671PieAgr[0] ;
         A590KgmAgr = P001211_A590KgmAgr[0] ;
         A122BarAgrPar = P001211_A122BarAgrPar[0] ;
         A124BarAgrReo = P001211_A124BarAgrReo[0] ;
         A119BarAgrCod = P001211_A119BarAgrCod[0] ;
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         if ( ( A119BarAgrCod != AV19BarAgrCod ) || ( A124BarAgrReo != AV20BarAgrReo ) || ( GXutil.strcmp(A122BarAgrPar, AV21BarAgrPar) != 0 ) )
         {
            GXv_char4[0] = AV15EmprCod ;
            GXv_int5[0] = A119BarAgrCod ;
            GXv_int6[0] = A124BarAgrReo ;
            GXv_char3[0] = A122BarAgrPar ;
            GXv_char2[0] = AV22BarMaqCod ;
            GXv_int7[0] = AV23BarVolMaq ;
            GXv_char8[0] = AV30BarSer ;
            GXv_char9[0] = AV32DisArtDsc ;
            GXv_int10[0] = AV33CliCod ;
            GXv_int11[0] = AV34DisCod ;
            GXv_char12[0] = AV35BarColNom ;
            GXv_int13[0] = AV36BarColNum ;
            GXv_char14[0] = AV37BarNomCli ;
            GXv_int15[0] = AV38BarNumCli ;
            GXv_char16[0] = AV46BarDisNum ;
            new app.pmodmvo(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_char3, GXv_char2, GXv_int7, GXv_char8, GXv_char9, GXv_int10, GXv_int11, GXv_char12, GXv_int13, GXv_char14, GXv_int15, GXv_char16) ;
            pcreagr.this.AV15EmprCod = GXv_char4[0] ;
            pcreagr.this.A119BarAgrCod = GXv_int5[0] ;
            pcreagr.this.A124BarAgrReo = GXv_int6[0] ;
            pcreagr.this.A122BarAgrPar = GXv_char3[0] ;
            pcreagr.this.AV22BarMaqCod = GXv_char2[0] ;
            pcreagr.this.AV23BarVolMaq = GXv_int7[0] ;
            pcreagr.this.AV30BarSer = GXv_char8[0] ;
            pcreagr.this.AV32DisArtDsc = GXv_char9[0] ;
            pcreagr.this.AV33CliCod = GXv_int10[0] ;
            pcreagr.this.AV34DisCod = GXv_int11[0] ;
            pcreagr.this.AV35BarColNom = GXv_char12[0] ;
            pcreagr.this.AV36BarColNum = GXv_int13[0] ;
            pcreagr.this.AV37BarNomCli = GXv_char14[0] ;
            pcreagr.this.AV38BarNumCli = GXv_int15[0] ;
            pcreagr.this.AV46BarDisNum = GXv_char16[0] ;
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
            /* Using cursor P001212 */
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
            A1245BarAgrSer = W1245BarAgrSer ;
            A1507BarAgrDsc = W1507BarAgrDsc ;
            A1508CliCodAgr = W1508CliCodAgr ;
            A1513DisCodAgr = W1513DisCodAgr ;
            A1510ColNomAgr = W1510ColNomAgr ;
            A1512ColNumAgr = W1512ColNumAgr ;
            A1509ColNoCAgr = W1509ColNoCAgr ;
            A1511ColNuCAgr = W1511ColNuCAgr ;
            A1649BarAgrDNu = W1649BarAgrDNu ;
            /* End Insert */
            AV49Inc_obs += httpContext.getMessage( "INS BARAGR, BarAgrCod=", "") + GXutil.str( AV19BarAgrCod, 8, 0) + GXutil.str( AV20BarAgrReo, 1, 0) + AV21BarAgrPar ;
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
            /* Using cursor P001213 */
            pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar, A590KgmAgr, Short.valueOf(A671PieAgr), A869MtrAgr, A1245BarAgrSer, A1507BarAgrDsc, Integer.valueOf(A1508CliCodAgr), Integer.valueOf(A1513DisCodAgr), A1510ColNomAgr, Integer.valueOf(A1512ColNumAgr), A1509ColNoCAgr, Integer.valueOf(A1511ColNuCAgr), A1649BarAgrDNu, Boolean.valueOf(n6285BarAgrMac), Integer.valueOf(A6285BarAgrMac)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAGR");
            if ( (pr_default.getStatus(10) == 1) )
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
            /* End Insert */
            AV49Inc_obs += httpContext.getMessage( "INS BARAGR, BarAgrCod=", "") + GXutil.str( AV19BarAgrCod, 8, 0) + GXutil.str( AV20BarAgrReo, 1, 0) + AV21BarAgrPar ;
         }
         A396EmprCod = W396EmprCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         pr_default.readNext(8);
      }
      pr_default.close(8);
      if ( GXutil.strcmp(AV49Inc_obs, "") != 0 )
      {
         AV49Inc_obs += httpContext.getMessage( "Fin PCREAGR", "") ;
         new app.pctrinc(remoteHandle, context).execute( AV15EmprCod, AV60Pgmname, AV51Usurcod, AV50Station, AV49Inc_obs, AV16BarCod, AV17BarCodReo, AV18BarCodPar) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcreagr.this.AV15EmprCod;
      this.aP1[0] = pcreagr.this.AV16BarCod;
      this.aP2[0] = pcreagr.this.AV17BarCodReo;
      this.aP3[0] = pcreagr.this.AV18BarCodPar;
      this.aP4[0] = pcreagr.this.AV19BarAgrCod;
      this.aP5[0] = pcreagr.this.AV20BarAgrReo;
      this.aP6[0] = pcreagr.this.AV21BarAgrPar;
      this.aP7[0] = pcreagr.this.AV22BarMaqCod;
      this.aP8[0] = pcreagr.this.AV23BarVolMaq;
      this.aP9[0] = pcreagr.this.AV24PieAgr;
      this.aP10[0] = pcreagr.this.AV25KgmAgr;
      this.aP11[0] = pcreagr.this.AV26MtrAgr;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcreagr");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV49Inc_obs = "" ;
      AV50Station = "" ;
      GXt_char1 = "" ;
      AV52EmprNom = "" ;
      AV51Usurcod = "" ;
      scmdbuf = "" ;
      P00122_A130BarCodPar = new String[] {""} ;
      P00122_A132BarCodReo = new byte[1] ;
      P00122_A129BarCod = new int[1] ;
      P00122_A396EmprCod = new String[] {""} ;
      P00122_A120BarAgrEst = new String[] {""} ;
      P00122_A212BarSer = new String[] {""} ;
      P00122_A1652BarSerDsc = new String[] {""} ;
      P00122_A252CliCod = new int[1] ;
      P00122_n252CliCod = new boolean[] {false} ;
      P00122_A361DisCod = new int[1] ;
      P00122_A135BarColNom = new String[] {""} ;
      P00122_A136BarColNum = new int[1] ;
      P00122_A1234BarNomCli = new String[] {""} ;
      P00122_A1235BarNumCli = new int[1] ;
      P00122_A143BarDisNum = new String[] {""} ;
      P00122_A3595BarMacCod = new int[1] ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A120BarAgrEst = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A143BarDisNum = "" ;
      AV30BarSer = "" ;
      AV32DisArtDsc = "" ;
      AV35BarColNom = "" ;
      AV37BarNomCli = "" ;
      AV46BarDisNum = "" ;
      P00124_A130BarCodPar = new String[] {""} ;
      P00124_A132BarCodReo = new byte[1] ;
      P00124_A129BarCod = new int[1] ;
      P00124_A396EmprCod = new String[] {""} ;
      P00124_A120BarAgrEst = new String[] {""} ;
      P00124_A180BarMaqCod = new String[] {""} ;
      P00124_A2759BarMaqGru = new String[] {""} ;
      P00124_A236BarVolMaq = new int[1] ;
      P00124_A3595BarMacCod = new int[1] ;
      P00124_A212BarSer = new String[] {""} ;
      P00124_A1652BarSerDsc = new String[] {""} ;
      P00124_A252CliCod = new int[1] ;
      P00124_n252CliCod = new boolean[] {false} ;
      P00124_A361DisCod = new int[1] ;
      P00124_A135BarColNom = new String[] {""} ;
      P00124_A136BarColNum = new int[1] ;
      P00124_A1234BarNomCli = new String[] {""} ;
      P00124_A1235BarNumCli = new int[1] ;
      P00124_A143BarDisNum = new String[] {""} ;
      A180BarMaqCod = "" ;
      A2759BarMaqGru = "" ;
      AV31BarSer1 = "" ;
      AV39DisArtDsc1 = "" ;
      AV42BarColNom1 = "" ;
      AV44BarNomCli1 = "" ;
      AV47BarDisNum1 = "" ;
      P00126_A122BarAgrPar = new String[] {""} ;
      P00126_A124BarAgrReo = new byte[1] ;
      P00126_A119BarAgrCod = new int[1] ;
      P00126_A130BarCodPar = new String[] {""} ;
      P00126_A132BarCodReo = new byte[1] ;
      P00126_A129BarCod = new int[1] ;
      P00126_A396EmprCod = new String[] {""} ;
      P00126_A1245BarAgrSer = new String[] {""} ;
      P00126_A1507BarAgrDsc = new String[] {""} ;
      P00126_A1508CliCodAgr = new int[1] ;
      P00126_A1513DisCodAgr = new int[1] ;
      P00126_A1510ColNomAgr = new String[] {""} ;
      P00126_A1512ColNumAgr = new int[1] ;
      P00126_A1509ColNoCAgr = new String[] {""} ;
      P00126_A1511ColNuCAgr = new int[1] ;
      P00126_A1649BarAgrDNu = new String[] {""} ;
      A122BarAgrPar = "" ;
      A1245BarAgrSer = "" ;
      A1507BarAgrDsc = "" ;
      A1510ColNomAgr = "" ;
      A1509ColNoCAgr = "" ;
      A1649BarAgrDNu = "" ;
      P00129_A130BarCodPar = new String[] {""} ;
      P00129_A132BarCodReo = new byte[1] ;
      P00129_A129BarCod = new int[1] ;
      P00129_A396EmprCod = new String[] {""} ;
      P00129_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00129_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00129_A199BarPie1 = new short[1] ;
      P00129_A365DisDes = new String[] {""} ;
      P00129_A898BarPieNDes = new int[1] ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      W396EmprCod = "" ;
      W130BarCodPar = "" ;
      A590KgmAgr = DecimalUtil.ZERO ;
      A869MtrAgr = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      P001211_A1649BarAgrDNu = new String[] {""} ;
      P001211_A1511ColNuCAgr = new int[1] ;
      P001211_A1509ColNoCAgr = new String[] {""} ;
      P001211_A1512ColNumAgr = new int[1] ;
      P001211_A1510ColNomAgr = new String[] {""} ;
      P001211_A1513DisCodAgr = new int[1] ;
      P001211_A1508CliCodAgr = new int[1] ;
      P001211_A1507BarAgrDsc = new String[] {""} ;
      P001211_A1245BarAgrSer = new String[] {""} ;
      P001211_A130BarCodPar = new String[] {""} ;
      P001211_A132BarCodReo = new byte[1] ;
      P001211_A129BarCod = new int[1] ;
      P001211_A396EmprCod = new String[] {""} ;
      P001211_A6285BarAgrMac = new int[1] ;
      P001211_n6285BarAgrMac = new boolean[] {false} ;
      P001211_A869MtrAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001211_A671PieAgr = new short[1] ;
      P001211_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001211_A122BarAgrPar = new String[] {""} ;
      P001211_A124BarAgrReo = new byte[1] ;
      P001211_A119BarAgrCod = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_char8 = new String[1] ;
      GXv_char9 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_int11 = new int[1] ;
      GXv_char12 = new String[1] ;
      GXv_int13 = new int[1] ;
      GXv_char14 = new String[1] ;
      GXv_int15 = new int[1] ;
      GXv_char16 = new String[1] ;
      W1245BarAgrSer = "" ;
      W1507BarAgrDsc = "" ;
      W1510ColNomAgr = "" ;
      W1509ColNoCAgr = "" ;
      W1649BarAgrDNu = "" ;
      W122BarAgrPar = "" ;
      W590KgmAgr = DecimalUtil.ZERO ;
      W869MtrAgr = DecimalUtil.ZERO ;
      AV60Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcreagr__default(),
         new Object[] {
             new Object[] {
            P00122_A130BarCodPar, P00122_A132BarCodReo, P00122_A129BarCod, P00122_A396EmprCod, P00122_A120BarAgrEst, P00122_A212BarSer, P00122_A1652BarSerDsc, P00122_A252CliCod, P00122_n252CliCod, P00122_A361DisCod,
            P00122_A135BarColNom, P00122_A136BarColNum, P00122_A1234BarNomCli, P00122_A1235BarNumCli, P00122_A143BarDisNum, P00122_A3595BarMacCod
            }
            , new Object[] {
            }
            , new Object[] {
            P00124_A130BarCodPar, P00124_A132BarCodReo, P00124_A129BarCod, P00124_A396EmprCod, P00124_A120BarAgrEst, P00124_A180BarMaqCod, P00124_A2759BarMaqGru, P00124_A236BarVolMaq, P00124_A3595BarMacCod, P00124_A212BarSer,
            P00124_A1652BarSerDsc, P00124_A252CliCod, P00124_n252CliCod, P00124_A361DisCod, P00124_A135BarColNom, P00124_A136BarColNum, P00124_A1234BarNomCli, P00124_A1235BarNumCli, P00124_A143BarDisNum
            }
            , new Object[] {
            }
            , new Object[] {
            P00126_A122BarAgrPar, P00126_A124BarAgrReo, P00126_A119BarAgrCod, P00126_A130BarCodPar, P00126_A132BarCodReo, P00126_A129BarCod, P00126_A396EmprCod, P00126_A1245BarAgrSer, P00126_A1507BarAgrDsc, P00126_A1508CliCodAgr,
            P00126_A1513DisCodAgr, P00126_A1510ColNomAgr, P00126_A1512ColNumAgr, P00126_A1509ColNoCAgr, P00126_A1511ColNuCAgr, P00126_A1649BarAgrDNu
            }
            , new Object[] {
            }
            , new Object[] {
            P00129_A130BarCodPar, P00129_A132BarCodReo, P00129_A129BarCod, P00129_A396EmprCod, P00129_A166BarKgm, P00129_A184BarMtr, P00129_A199BarPie1, P00129_A365DisDes, P00129_A898BarPieNDes
            }
            , new Object[] {
            }
            , new Object[] {
            P001211_A1649BarAgrDNu, P001211_A1511ColNuCAgr, P001211_A1509ColNoCAgr, P001211_A1512ColNumAgr, P001211_A1510ColNomAgr, P001211_A1513DisCodAgr, P001211_A1508CliCodAgr, P001211_A1507BarAgrDsc, P001211_A1245BarAgrSer, P001211_A130BarCodPar,
            P001211_A132BarCodReo, P001211_A129BarCod, P001211_A396EmprCod, P001211_A6285BarAgrMac, P001211_n6285BarAgrMac, P001211_A869MtrAgr, P001211_A671PieAgr, P001211_A590KgmAgr, P001211_A122BarAgrPar, P001211_A124BarAgrReo,
            P001211_A119BarAgrCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      AV60Pgmname = "PCREAGR" ;
      /* GeneXus formulas. */
      AV60Pgmname = "PCREAGR" ;
      Gx_err = (short)(0) ;
   }

   private byte AV17BarCodReo ;
   private byte AV20BarAgrReo ;
   private byte A132BarCodReo ;
   private byte A124BarAgrReo ;
   private byte W132BarCodReo ;
   private byte GXv_int6[] ;
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
   private int A236BarVolMaq ;
   private int AV40CliCod1 ;
   private int AV41DisCod1 ;
   private int AV43BarColNum1 ;
   private int AV45BarNumCli1 ;
   private int A119BarAgrCod ;
   private int A1508CliCodAgr ;
   private int A1513DisCodAgr ;
   private int A1512ColNumAgr ;
   private int A1511ColNuCAgr ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int W129BarCod ;
   private int GX_INS13 ;
   private int A6285BarAgrMac ;
   private int GXv_int5[] ;
   private int GXv_int7[] ;
   private int GXv_int10[] ;
   private int GXv_int11[] ;
   private int GXv_int13[] ;
   private int GXv_int15[] ;
   private int W1508CliCodAgr ;
   private int W1513DisCodAgr ;
   private int W1512ColNumAgr ;
   private int W1511ColNuCAgr ;
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
   private String AV50Station ;
   private String GXt_char1 ;
   private String AV52EmprNom ;
   private String AV51Usurcod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A120BarAgrEst ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
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
   private String A122BarAgrPar ;
   private String A1245BarAgrSer ;
   private String A1507BarAgrDsc ;
   private String A1510ColNomAgr ;
   private String A1509ColNoCAgr ;
   private String A1649BarAgrDNu ;
   private String A365DisDes ;
   private String W396EmprCod ;
   private String W130BarCodPar ;
   private String Gx_emsg ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char8[] ;
   private String GXv_char9[] ;
   private String GXv_char12[] ;
   private String GXv_char14[] ;
   private String GXv_char16[] ;
   private String W1245BarAgrSer ;
   private String W1507BarAgrDsc ;
   private String W1510ColNomAgr ;
   private String W1509ColNoCAgr ;
   private String W1649BarAgrDNu ;
   private String W122BarAgrPar ;
   private String AV60Pgmname ;
   private boolean n252CliCod ;
   private boolean n6285BarAgrMac ;
   private String AV49Inc_obs ;
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
   private String[] P00122_A130BarCodPar ;
   private byte[] P00122_A132BarCodReo ;
   private int[] P00122_A129BarCod ;
   private String[] P00122_A396EmprCod ;
   private String[] P00122_A120BarAgrEst ;
   private String[] P00122_A212BarSer ;
   private String[] P00122_A1652BarSerDsc ;
   private int[] P00122_A252CliCod ;
   private boolean[] P00122_n252CliCod ;
   private int[] P00122_A361DisCod ;
   private String[] P00122_A135BarColNom ;
   private int[] P00122_A136BarColNum ;
   private String[] P00122_A1234BarNomCli ;
   private int[] P00122_A1235BarNumCli ;
   private String[] P00122_A143BarDisNum ;
   private int[] P00122_A3595BarMacCod ;
   private String[] P00124_A130BarCodPar ;
   private byte[] P00124_A132BarCodReo ;
   private int[] P00124_A129BarCod ;
   private String[] P00124_A396EmprCod ;
   private String[] P00124_A120BarAgrEst ;
   private String[] P00124_A180BarMaqCod ;
   private String[] P00124_A2759BarMaqGru ;
   private int[] P00124_A236BarVolMaq ;
   private int[] P00124_A3595BarMacCod ;
   private String[] P00124_A212BarSer ;
   private String[] P00124_A1652BarSerDsc ;
   private int[] P00124_A252CliCod ;
   private boolean[] P00124_n252CliCod ;
   private int[] P00124_A361DisCod ;
   private String[] P00124_A135BarColNom ;
   private int[] P00124_A136BarColNum ;
   private String[] P00124_A1234BarNomCli ;
   private int[] P00124_A1235BarNumCli ;
   private String[] P00124_A143BarDisNum ;
   private String[] P00126_A122BarAgrPar ;
   private byte[] P00126_A124BarAgrReo ;
   private int[] P00126_A119BarAgrCod ;
   private String[] P00126_A130BarCodPar ;
   private byte[] P00126_A132BarCodReo ;
   private int[] P00126_A129BarCod ;
   private String[] P00126_A396EmprCod ;
   private String[] P00126_A1245BarAgrSer ;
   private String[] P00126_A1507BarAgrDsc ;
   private int[] P00126_A1508CliCodAgr ;
   private int[] P00126_A1513DisCodAgr ;
   private String[] P00126_A1510ColNomAgr ;
   private int[] P00126_A1512ColNumAgr ;
   private String[] P00126_A1509ColNoCAgr ;
   private int[] P00126_A1511ColNuCAgr ;
   private String[] P00126_A1649BarAgrDNu ;
   private String[] P00129_A130BarCodPar ;
   private byte[] P00129_A132BarCodReo ;
   private int[] P00129_A129BarCod ;
   private String[] P00129_A396EmprCod ;
   private java.math.BigDecimal[] P00129_A166BarKgm ;
   private java.math.BigDecimal[] P00129_A184BarMtr ;
   private short[] P00129_A199BarPie1 ;
   private String[] P00129_A365DisDes ;
   private int[] P00129_A898BarPieNDes ;
   private String[] P001211_A1649BarAgrDNu ;
   private int[] P001211_A1511ColNuCAgr ;
   private String[] P001211_A1509ColNoCAgr ;
   private int[] P001211_A1512ColNumAgr ;
   private String[] P001211_A1510ColNomAgr ;
   private int[] P001211_A1513DisCodAgr ;
   private int[] P001211_A1508CliCodAgr ;
   private String[] P001211_A1507BarAgrDsc ;
   private String[] P001211_A1245BarAgrSer ;
   private String[] P001211_A130BarCodPar ;
   private byte[] P001211_A132BarCodReo ;
   private int[] P001211_A129BarCod ;
   private String[] P001211_A396EmprCod ;
   private int[] P001211_A6285BarAgrMac ;
   private boolean[] P001211_n6285BarAgrMac ;
   private java.math.BigDecimal[] P001211_A869MtrAgr ;
   private short[] P001211_A671PieAgr ;
   private java.math.BigDecimal[] P001211_A590KgmAgr ;
   private String[] P001211_A122BarAgrPar ;
   private byte[] P001211_A124BarAgrReo ;
   private int[] P001211_A119BarAgrCod ;
}

final  class pcreagr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00122", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarAgrEst, BarSer, BarSerDsc, CliCod, DisCod, BarColNom, BarColNum, BarNomCli, BarNumCli, BarDisNum, BarMacCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00123", "UPDATE TXPBARCAD SET BarAgrEst=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P00124", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarAgrEst, BarMaqCod, BarMaqGru, BarVolMaq, BarMacCod, BarSer, BarSerDsc, CliCod, DisCod, BarColNom, BarColNum, BarNomCli, BarNumCli, BarDisNum FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00125", "UPDATE TXPBARCAD SET BarAgrEst=?, BarMaqCod=?, BarMaqGru=?, BarVolMaq=?, BarMacCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P00126", "SELECT BarAgrPar, BarAgrReo, BarAgrCod, BarCodPar, BarCodReo, BarCod, EmprCod, BarAgrSer, BarAgrDsc, CliCodAgr, DisCodAgr, ColNomAgr, ColNumAgr, ColNoCAgr, ColNuCAgr, BarAgrDNu FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarAgrCod = ? and BarAgrReo = ? and BarAgrPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00127", "UPDATE TXPBARAGR SET BarAgrSer=?, BarAgrDsc=?, CliCodAgr=?, DisCodAgr=?, ColNomAgr=?, ColNumAgr=?, ColNoCAgr=?, ColNuCAgr=?, BarAgrDNu=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarAgrCod = ? AND BarAgrReo = ? AND BarAgrPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARAGR")
         ,new ForEachCursor("P00129", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P001210", "INSERT INTO TXPBARAGR(EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar, KgmAgr, PieAgr, MtrAgr, BarAgrSer, BarAgrDsc, CliCodAgr, DisCodAgr, ColNomAgr, ColNumAgr, ColNoCAgr, ColNuCAgr, BarAgrDNu, BarAgrMac) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARAGR")
         ,new ForEachCursor("P001211", "SELECT BarAgrDNu, ColNuCAgr, ColNoCAgr, ColNumAgr, ColNomAgr, DisCodAgr, CliCodAgr, BarAgrDsc, BarAgrSer, BarCodPar, BarCodReo, BarCod, EmprCod, BarAgrMac, MtrAgr, PieAgr, KgmAgr, BarAgrPar, BarAgrReo, BarAgrCod FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P001212", "INSERT INTO TXPBARAGR(EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar, KgmAgr, PieAgr, MtrAgr, BarAgrSer, BarAgrDsc, CliCodAgr, DisCodAgr, ColNomAgr, ColNumAgr, ColNoCAgr, ColNuCAgr, BarAgrDNu, BarAgrMac) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARAGR")
         ,new UpdateCursor("P001213", "INSERT INTO TXPBARAGR(EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar, KgmAgr, PieAgr, MtrAgr, BarAgrSer, BarAgrDsc, CliCodAgr, DisCodAgr, ColNomAgr, ColNumAgr, ColNoCAgr, ColNuCAgr, BarAgrDNu, BarAgrMac) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARAGR")
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
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 13);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 13);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 8);
               return;
            case 6 :
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
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 3);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 16);
               stmt.setString(2, (String)parms[1], 26);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 13);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setString(7, (String)parms[6], 13);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 8);
               stmt.setString(10, (String)parms[9], 3);
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setString(13, (String)parms[12], 1);
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setString(16, (String)parms[15], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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
            case 10 :
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

