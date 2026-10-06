package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prac004 extends GXProcedure
{
   public prac004( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prac004.class ), "" );
   }

   public prac004( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 )
   {
      prac004.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 )
   {
      prac004.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      prac004.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      prac004.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      prac004.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      prac004.this.A2804RecLinMaq = aP4[0];
      this.aP4 = aP4;
      prac004.this.AV93Imp_r = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV88FlagExiPro = (byte)(0) ;
      GXv_int1[0] = AV88FlagExiPro ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "EXIPRO", ""), GXv_int1) ;
      prac004.this.AV88FlagExiPro = GXv_int1[0] ;
      GXv_int1[0] = AV51ExiCon ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, "999999", GXv_int1) ;
      prac004.this.AV51ExiCon = GXv_int1[0] ;
      GXt_char2 = AV47msg0 ;
      GXv_char3[0] = GXt_char2 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG251_", ""), (byte)(99), GXv_char3) ;
      prac004.this.GXt_char2 = GXv_char3[0] ;
      AV47msg0 = GXt_char2 ;
      AV19TotKil = DecimalUtil.doubleToDec(0) ;
      GXv_char3[0] = A396EmprCod ;
      GXv_char4[0] = "030100" ;
      GXv_int5[0] = AV20ValCos ;
      new app.pbuscou(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_int5) ;
      prac004.this.A396EmprCod = GXv_char3[0] ;
      prac004.this.AV20ValCos = GXv_int5[0] ;
      GXv_int1[0] = AV38Flag1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, "037001", GXv_int1) ;
      prac004.this.AV38Flag1 = GXv_int1[0] ;
      GXv_int1[0] = AV39Flag2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, "038001", GXv_int1) ;
      prac004.this.AV39Flag2 = GXv_int1[0] ;
      AV85FlagRenNro = (byte)(0) ;
      GXv_int1[0] = AV85FlagRenNro ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "RENNRO", ""), GXv_int1) ;
      prac004.this.AV85FlagRenNro = GXv_int1[0] ;
      AV87FlagCen = (byte)(0) ;
      GXv_int1[0] = AV87FlagCen ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CENTRA", ""), GXv_int1) ;
      prac004.this.AV87FlagCen = GXv_int1[0] ;
      AV54FlagComp = (byte)(0) ;
      GXv_int5[0] = AV94Copias ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, "100003", GXv_int5) ;
      prac004.this.AV94Copias = GXv_int5[0] ;
      if ( AV94Copias == 0 )
      {
         AV94Copias = 1 ;
      }
      GXt_int6 = AV97FlagFo13 ;
      GXv_int1[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FO0013", ""), GXv_int1) ;
      prac004.this.GXt_int6 = GXv_int1[0] ;
      AV97FlagFo13 = GXt_int6 ;
      /* Using cursor P027V3 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2805RecVolPrd = P027V3_A2805RecVolPrd[0] ;
         A4268RecOrdLin = P027V3_A4268RecOrdLin[0] ;
         n4268RecOrdLin = P027V3_n4268RecOrdLin[0] ;
         A602MaqCod = P027V3_A602MaqCod[0] ;
         A9764RecLtsSR = P027V3_A9764RecLtsSR[0] ;
         n9764RecLtsSR = P027V3_n9764RecLtsSR[0] ;
         A2806RecFA = P027V3_A2806RecFA[0] ;
         A9811RecAbs2 = P027V3_A9811RecAbs2[0] ;
         n9811RecAbs2 = P027V3_n9811RecAbs2[0] ;
         A252CliCod = P027V3_A252CliCod[0] ;
         n252CliCod = P027V3_n252CliCod[0] ;
         A212BarSer = P027V3_A212BarSer[0] ;
         A135BarColNom = P027V3_A135BarColNom[0] ;
         A136BarColNum = P027V3_A136BarColNum[0] ;
         A218BarTipCol = P027V3_A218BarTipCol[0] ;
         A4271RecFagKgs = P027V3_A4271RecFagKgs[0] ;
         n4271RecFagKgs = P027V3_n4271RecFagKgs[0] ;
         A4259RecTotKgs = P027V3_A4259RecTotKgs[0] ;
         A252CliCod = P027V3_A252CliCod[0] ;
         n252CliCod = P027V3_n252CliCod[0] ;
         A212BarSer = P027V3_A212BarSer[0] ;
         A135BarColNom = P027V3_A135BarColNom[0] ;
         A136BarColNum = P027V3_A136BarColNum[0] ;
         A218BarTipCol = P027V3_A218BarTipCol[0] ;
         A4271RecFagKgs = P027V3_A4271RecFagKgs[0] ;
         n4271RecFagKgs = P027V3_n4271RecFagKgs[0] ;
         A4316RecMaqKgs = A4259RecTotKgs.add(A4271RecFagKgs) ;
         AV22LinRec = (short)(0) ;
         AV19TotKil = A4316RecMaqKgs ;
         AV24Flag = (byte)(0) ;
         AV34BarCod = A129BarCod ;
         AV35BarCodReo = A132BarCodReo ;
         AV36BarCodPar = A130BarCodPar ;
         AV17BarVol = A2805RecVolPrd ;
         AV59EmprCod = A396EmprCod ;
         AV62RecLinMaq = A2804RecLinMaq ;
         AV99RECORDLIN = A4268RecOrdLin ;
         AV98MaqCod = A602MaqCod ;
         /* Execute user subroutine: 'MAQUIN' */
         S151 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV101LtsRec = A9764RecLtsSR ;
         AV102Abs1 = A2806RecFA ;
         AV103Abs2 = A9811RecAbs2 ;
         AV104LtsIni = A2805RecVolPrd ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = A252CliCod ;
         GXv_char3[0] = A212BarSer ;
         GXv_char7[0] = A135BarColNom ;
         GXv_int8[0] = A136BarColNum ;
         GXv_int1[0] = A218BarTipCol ;
         GXv_int9[0] = AV21ForCon ;
         GXv_int10[0] = AV28NumColFor ;
         GXv_char11[0] = AV74BarNumTon ;
         new app.pmodfor(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3, GXv_char7, GXv_int8, GXv_int1, GXv_int9, GXv_int10, GXv_char11) ;
         prac004.this.A396EmprCod = GXv_char4[0] ;
         prac004.this.A252CliCod = GXv_int5[0] ;
         prac004.this.A212BarSer = GXv_char3[0] ;
         prac004.this.A135BarColNom = GXv_char7[0] ;
         prac004.this.A136BarColNum = GXv_int8[0] ;
         prac004.this.A218BarTipCol = GXv_int1[0] ;
         prac004.this.AV21ForCon = GXv_int9[0] ;
         prac004.this.AV28NumColFor = GXv_int10[0] ;
         prac004.this.AV74BarNumTon = GXv_char11[0] ;
         AV26FlagPro = (byte)(0) ;
         AV49Linea = (byte)(0) ;
         /* Using cursor P027V4 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A764ProForCod = P027V4_A764ProForCod[0] ;
            A1273RecLinPro = P027V4_A1273RecLinPro[0] ;
            AV26FlagPro = (byte)(1) ;
            AV54FlagComp = (byte)(0) ;
            AV67BarLinMaq = A2804RecLinMaq ;
            AV81RecLinPro = A1273RecLinPro ;
            AV49Linea = A1273RecLinPro ;
            AV37ProForCod = A764ProForCod ;
            /* Execute user subroutine: 'PROCESOS' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         AV90FecLan = GXutil.today( ) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'PROCESOS' Routine */
      returnInSub = false ;
      AV48FlagTemp = (byte)(0) ;
      /* Using cursor P027V5 */
      pr_default.execute(2, new Object[] {A396EmprCod, AV37ProForCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A764ProForCod = P027V5_A764ProForCod[0] ;
         A762ProForCan = P027V5_A762ProForCan[0] ;
         A490ForPrdUMe = P027V5_A490ForPrdUMe[0] ;
         A770ProForPrd = P027V5_A770ProForPrd[0] ;
         A765ProForDes = P027V5_A765ProForDes[0] ;
         A13111ProForDe2 = P027V5_A13111ProForDe2[0] ;
         A763ProForCla = P027V5_A763ProForCla[0] ;
         A488ForPrdDsc = P027V5_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P027V5_n488ForPrdDsc[0] ;
         A767ProForLin = P027V5_A767ProForLin[0] ;
         A488ForPrdDsc = P027V5_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P027V5_n488ForPrdDsc[0] ;
         AV105CantIni = A762ProForCan ;
         AV50ForPrdUme = A490ForPrdUMe ;
         if ( (GXutil.strcmp("", A770ProForPrd)==0) )
         {
            AV25PrdDesc = A765ProForDes ;
            AV27Producto = "" ;
            Gx_msg = httpContext.getMessage( "Procesando Producto=", "") + AV27Producto + " " + GXutil.trim( AV25PrdDesc) ;
            System.out.println( Gx_msg );
            GXv_char11[0] = A396EmprCod ;
            GXv_int10[0] = AV34BarCod ;
            GXv_int9[0] = AV35BarCodReo ;
            GXv_char7[0] = AV36BarCodPar ;
            GXv_int12[0] = AV22LinRec ;
            GXv_char4[0] = AV25PrdDesc ;
            GXv_char3[0] = AV27Producto ;
            GXv_decimal13[0] = DecimalUtil.doubleToDec(0) ;
            GXv_int1[0] = AV49Linea ;
            GXv_int14[0] = AV62RecLinMaq ;
            GXv_int15[0] = AV46RecLinIni ;
            GXv_char16[0] = A13111ProForDe2 ;
            new app.precli2(remoteHandle, context).execute( GXv_char11, GXv_int10, GXv_int9, GXv_char7, GXv_int12, GXv_char4, GXv_char3, GXv_decimal13, GXv_int1, GXv_int14, GXv_int15, GXv_char16) ;
            prac004.this.A396EmprCod = GXv_char11[0] ;
            prac004.this.AV34BarCod = GXv_int10[0] ;
            prac004.this.AV35BarCodReo = GXv_int9[0] ;
            prac004.this.AV36BarCodPar = GXv_char7[0] ;
            prac004.this.AV22LinRec = GXv_int12[0] ;
            prac004.this.AV25PrdDesc = GXv_char4[0] ;
            prac004.this.AV27Producto = GXv_char3[0] ;
            prac004.this.AV49Linea = GXv_int1[0] ;
            prac004.this.AV62RecLinMaq = GXv_int14[0] ;
            prac004.this.AV46RecLinIni = GXv_int15[0] ;
            prac004.this.A13111ProForDe2 = GXv_char16[0] ;
         }
         else
         {
            if ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "#") == 0 )
            {
               AV29NumOrd = (short)(GXutil.lval( GXutil.substring( A770ProForPrd, 2, 4))) ;
               AV27Producto = "" ;
               AV50ForPrdUme = (byte)(0) ;
               GXv_char16[0] = A396EmprCod ;
               GXv_int10[0] = AV28NumColFor ;
               GXv_int15[0] = AV29NumOrd ;
               GXv_char11[0] = AV27Producto ;
               GXv_decimal13[0] = AV43ForPrdCan ;
               GXv_int9[0] = AV50ForPrdUme ;
               new app.pprdesp(remoteHandle, context).execute( GXv_char16, GXv_int10, GXv_int15, GXv_char11, GXv_decimal13, GXv_int9) ;
               prac004.this.A396EmprCod = GXv_char16[0] ;
               prac004.this.AV28NumColFor = GXv_int10[0] ;
               prac004.this.AV29NumOrd = GXv_int15[0] ;
               prac004.this.AV27Producto = GXv_char11[0] ;
               prac004.this.AV43ForPrdCan = GXv_decimal13[0] ;
               prac004.this.AV50ForPrdUme = GXv_int9[0] ;
               if ( ! (GXutil.strcmp("", AV27Producto)==0) )
               {
                  GXv_char16[0] = A396EmprCod ;
                  GXv_char11[0] = AV27Producto ;
                  GXv_decimal13[0] = AV43ForPrdCan ;
                  GXv_int9[0] = AV50ForPrdUme ;
                  GXv_decimal17[0] = AV19TotKil ;
                  GXv_int10[0] = AV17BarVol ;
                  GXv_int8[0] = AV20ValCos ;
                  GXv_int15[0] = AV22LinRec ;
                  GXv_int5[0] = AV34BarCod ;
                  GXv_int1[0] = AV35BarCodReo ;
                  GXv_char7[0] = AV36BarCodPar ;
                  GXv_int18[0] = AV38Flag1 ;
                  GXv_int19[0] = AV39Flag2 ;
                  GXv_int14[0] = AV46RecLinIni ;
                  GXv_int20[0] = AV49Linea ;
                  GXv_int21[0] = AV51ExiCon ;
                  GXv_int22[0] = AV54FlagComp ;
                  GXv_int23[0] = AV63RecForNro ;
                  GXv_int12[0] = AV62RecLinMaq ;
                  GXv_int24[0] = AV71TanqueN ;
                  GXv_char4[0] = AV73ProForDes ;
                  GXv_decimal25[0] = AV105CantIni ;
                  new app.pexipro4(remoteHandle, context).execute( GXv_char16, GXv_char11, GXv_decimal13, GXv_int9, GXv_decimal17, GXv_int10, GXv_int8, GXv_int15, GXv_int5, GXv_int1, GXv_char7, GXv_int18, GXv_int19, GXv_int14, GXv_int20, GXv_int21, GXv_int22, GXv_int23, GXv_int12, GXv_int24, GXv_char4, GXv_decimal25) ;
                  prac004.this.A396EmprCod = GXv_char16[0] ;
                  prac004.this.AV27Producto = GXv_char11[0] ;
                  prac004.this.AV43ForPrdCan = GXv_decimal13[0] ;
                  prac004.this.AV50ForPrdUme = GXv_int9[0] ;
                  prac004.this.AV19TotKil = GXv_decimal17[0] ;
                  prac004.this.AV17BarVol = GXv_int10[0] ;
                  prac004.this.AV20ValCos = GXv_int8[0] ;
                  prac004.this.AV22LinRec = GXv_int15[0] ;
                  prac004.this.AV34BarCod = GXv_int5[0] ;
                  prac004.this.AV35BarCodReo = GXv_int1[0] ;
                  prac004.this.AV36BarCodPar = GXv_char7[0] ;
                  prac004.this.AV38Flag1 = GXv_int18[0] ;
                  prac004.this.AV39Flag2 = GXv_int19[0] ;
                  prac004.this.AV46RecLinIni = GXv_int14[0] ;
                  prac004.this.AV49Linea = GXv_int20[0] ;
                  prac004.this.AV51ExiCon = GXv_int21[0] ;
                  prac004.this.AV54FlagComp = GXv_int22[0] ;
                  prac004.this.AV63RecForNro = GXv_int23[0] ;
                  prac004.this.AV62RecLinMaq = GXv_int12[0] ;
                  prac004.this.AV71TanqueN = GXv_int24[0] ;
                  prac004.this.AV73ProForDes = GXv_char4[0] ;
                  prac004.this.AV105CantIni = GXv_decimal25[0] ;
               }
            }
            else
            {
               AV44Produc = GXutil.substring( A770ProForPrd, 3, 1) ;
               if ( GXutil.strcmp(AV44Produc, " ") == 0 )
               {
                  if ( A762ProForCan.doubleValue() == 0 )
                  {
                     AV31Cantidad = DecimalUtil.doubleToDec(1) ;
                  }
                  else
                  {
                     AV31Cantidad = A762ProForCan ;
                  }
                  AV44Produc = GXutil.substring( A770ProForPrd, 2, 1) ;
                  if ( GXutil.strcmp(AV44Produc, "") == 0 )
                  {
                     AV30Ncar = (byte)(1) ;
                  }
                  else
                  {
                     AV30Ncar = (byte)(2) ;
                  }
                  AV42ProForPrd = A770ProForPrd ;
                  /* Execute user subroutine: 'COLORANTES' */
                  S124 ();
                  if ( returnInSub )
                  {
                     pr_default.close(2);
                     pr_default.close(2);
                     returnInSub = true;
                     if (true) return;
                  }
               }
               else
               {
                  if ( (GXutil.strcmp("", A763ProForCla)==0) )
                  {
                     if ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "0") == 0 )
                     {
                        AV27Producto = A770ProForPrd ;
                        AV31Cantidad = A762ProForCan ;
                        AV50ForPrdUme = A490ForPrdUMe ;
                        AV54FlagComp = (byte)(0) ;
                        GXv_char16[0] = A396EmprCod ;
                        GXv_char11[0] = A770ProForPrd ;
                        GXv_decimal25[0] = A762ProForCan ;
                        GXv_int24[0] = A490ForPrdUMe ;
                        GXv_decimal17[0] = AV19TotKil ;
                        GXv_int10[0] = AV17BarVol ;
                        GXv_int8[0] = AV20ValCos ;
                        GXv_int15[0] = AV22LinRec ;
                        GXv_int5[0] = AV34BarCod ;
                        GXv_int23[0] = AV35BarCodReo ;
                        GXv_char7[0] = AV36BarCodPar ;
                        GXv_int22[0] = AV38Flag1 ;
                        GXv_int21[0] = AV39Flag2 ;
                        GXv_int14[0] = AV46RecLinIni ;
                        GXv_int20[0] = AV49Linea ;
                        GXv_int19[0] = AV51ExiCon ;
                        GXv_int18[0] = AV54FlagComp ;
                        GXv_int9[0] = AV63RecForNro ;
                        GXv_int12[0] = AV62RecLinMaq ;
                        GXv_int1[0] = AV71TanqueN ;
                        GXv_char4[0] = AV73ProForDes ;
                        GXv_decimal13[0] = AV105CantIni ;
                        new app.pexipro4(remoteHandle, context).execute( GXv_char16, GXv_char11, GXv_decimal25, GXv_int24, GXv_decimal17, GXv_int10, GXv_int8, GXv_int15, GXv_int5, GXv_int23, GXv_char7, GXv_int22, GXv_int21, GXv_int14, GXv_int20, GXv_int19, GXv_int18, GXv_int9, GXv_int12, GXv_int1, GXv_char4, GXv_decimal13) ;
                        prac004.this.A396EmprCod = GXv_char16[0] ;
                        prac004.this.A770ProForPrd = GXv_char11[0] ;
                        prac004.this.A762ProForCan = GXv_decimal25[0] ;
                        prac004.this.A490ForPrdUMe = GXv_int24[0] ;
                        prac004.this.AV19TotKil = GXv_decimal17[0] ;
                        prac004.this.AV17BarVol = GXv_int10[0] ;
                        prac004.this.AV20ValCos = GXv_int8[0] ;
                        prac004.this.AV22LinRec = GXv_int15[0] ;
                        prac004.this.AV34BarCod = GXv_int5[0] ;
                        prac004.this.AV35BarCodReo = GXv_int23[0] ;
                        prac004.this.AV36BarCodPar = GXv_char7[0] ;
                        prac004.this.AV38Flag1 = GXv_int22[0] ;
                        prac004.this.AV39Flag2 = GXv_int21[0] ;
                        prac004.this.AV46RecLinIni = GXv_int14[0] ;
                        prac004.this.AV49Linea = GXv_int20[0] ;
                        prac004.this.AV51ExiCon = GXv_int19[0] ;
                        prac004.this.AV54FlagComp = GXv_int18[0] ;
                        prac004.this.AV63RecForNro = GXv_int9[0] ;
                        prac004.this.AV62RecLinMaq = GXv_int12[0] ;
                        prac004.this.AV71TanqueN = GXv_int1[0] ;
                        prac004.this.AV73ProForDes = GXv_char4[0] ;
                        prac004.this.AV105CantIni = GXv_decimal13[0] ;
                        /* Execute user subroutine: 'COMPUESTOS' */
                        S134 ();
                        if ( returnInSub )
                        {
                           pr_default.close(2);
                           pr_default.close(2);
                           returnInSub = true;
                           if (true) return;
                        }
                        AV54FlagComp = (byte)(0) ;
                     }
                     else
                     {
                        if ( ( A490ForPrdUMe == 3 ) && ( GXutil.strcmp(A488ForPrdDsc, httpContext.getMessage( "%-G/K", "")) == 0 ) )
                        {
                           AV111Un = (byte)(1) ;
                        }
                        else
                        {
                           AV111Un = A490ForPrdUMe ;
                        }
                        AV109CantCal = AV105CantIni ;
                        if ( ( A490ForPrdUMe == 3 ) && ( GXutil.strcmp(A488ForPrdDsc, httpContext.getMessage( "%-G/K", "")) == 0 ) )
                        {
                           /* Execute user subroutine: 'RECALCANT' */
                           S144 ();
                           if ( returnInSub )
                           {
                              pr_default.close(2);
                              pr_default.close(2);
                              returnInSub = true;
                              if (true) return;
                           }
                        }
                        Gx_msg = httpContext.getMessage( "Procesando Producto=", "") + A770ProForPrd + " " + GXutil.trim( AV73ProForDes) ;
                        System.out.println( Gx_msg );
                        GXv_char16[0] = A396EmprCod ;
                        GXv_char11[0] = A770ProForPrd ;
                        GXv_decimal25[0] = AV109CantCal ;
                        GXv_int24[0] = AV111Un ;
                        GXv_decimal17[0] = AV19TotKil ;
                        GXv_int10[0] = AV17BarVol ;
                        GXv_int8[0] = AV20ValCos ;
                        GXv_int15[0] = AV22LinRec ;
                        GXv_int5[0] = AV34BarCod ;
                        GXv_int23[0] = AV35BarCodReo ;
                        GXv_char7[0] = AV36BarCodPar ;
                        GXv_int22[0] = AV38Flag1 ;
                        GXv_int21[0] = AV39Flag2 ;
                        GXv_int14[0] = AV46RecLinIni ;
                        GXv_int20[0] = AV49Linea ;
                        GXv_int19[0] = AV51ExiCon ;
                        GXv_int18[0] = AV54FlagComp ;
                        GXv_int9[0] = AV63RecForNro ;
                        GXv_int12[0] = AV62RecLinMaq ;
                        GXv_int1[0] = AV71TanqueN ;
                        GXv_char4[0] = AV73ProForDes ;
                        GXv_decimal13[0] = AV105CantIni ;
                        new app.pexipro4(remoteHandle, context).execute( GXv_char16, GXv_char11, GXv_decimal25, GXv_int24, GXv_decimal17, GXv_int10, GXv_int8, GXv_int15, GXv_int5, GXv_int23, GXv_char7, GXv_int22, GXv_int21, GXv_int14, GXv_int20, GXv_int19, GXv_int18, GXv_int9, GXv_int12, GXv_int1, GXv_char4, GXv_decimal13) ;
                        prac004.this.A396EmprCod = GXv_char16[0] ;
                        prac004.this.A770ProForPrd = GXv_char11[0] ;
                        prac004.this.AV109CantCal = GXv_decimal25[0] ;
                        prac004.this.AV111Un = GXv_int24[0] ;
                        prac004.this.AV19TotKil = GXv_decimal17[0] ;
                        prac004.this.AV17BarVol = GXv_int10[0] ;
                        prac004.this.AV20ValCos = GXv_int8[0] ;
                        prac004.this.AV22LinRec = GXv_int15[0] ;
                        prac004.this.AV34BarCod = GXv_int5[0] ;
                        prac004.this.AV35BarCodReo = GXv_int23[0] ;
                        prac004.this.AV36BarCodPar = GXv_char7[0] ;
                        prac004.this.AV38Flag1 = GXv_int22[0] ;
                        prac004.this.AV39Flag2 = GXv_int21[0] ;
                        prac004.this.AV46RecLinIni = GXv_int14[0] ;
                        prac004.this.AV49Linea = GXv_int20[0] ;
                        prac004.this.AV51ExiCon = GXv_int19[0] ;
                        prac004.this.AV54FlagComp = GXv_int18[0] ;
                        prac004.this.AV63RecForNro = GXv_int9[0] ;
                        prac004.this.AV62RecLinMaq = GXv_int12[0] ;
                        prac004.this.AV71TanqueN = GXv_int1[0] ;
                        prac004.this.AV73ProForDes = GXv_char4[0] ;
                        prac004.this.AV105CantIni = GXv_decimal13[0] ;
                     }
                  }
                  else
                  {
                     AV32PrdVal = (byte)(0) ;
                     AV25PrdDesc = A765ProForDes ;
                     AV27Producto = A770ProForPrd ;
                     GXv_char16[0] = A396EmprCod ;
                     GXv_char11[0] = AV27Producto ;
                     GXv_char7[0] = A763ProForCla ;
                     GXv_int24[0] = AV32PrdVal ;
                     GXv_int10[0] = AV34BarCod ;
                     GXv_int23[0] = AV35BarCodReo ;
                     GXv_char4[0] = AV36BarCodPar ;
                     GXv_decimal25[0] = AV19TotKil ;
                     GXv_char3[0] = AV25PrdDesc ;
                     GXv_char26[0] = AV33Accion ;
                     GXv_int15[0] = AV62RecLinMaq ;
                     new app.pclaesp(remoteHandle, context).execute( GXv_char16, GXv_char11, GXv_char7, GXv_int24, GXv_int10, GXv_int23, GXv_char4, GXv_decimal25, GXv_char3, GXv_char26, GXv_int15) ;
                     prac004.this.A396EmprCod = GXv_char16[0] ;
                     prac004.this.AV27Producto = GXv_char11[0] ;
                     prac004.this.A763ProForCla = GXv_char7[0] ;
                     prac004.this.AV32PrdVal = GXv_int24[0] ;
                     prac004.this.AV34BarCod = GXv_int10[0] ;
                     prac004.this.AV35BarCodReo = GXv_int23[0] ;
                     prac004.this.AV36BarCodPar = GXv_char4[0] ;
                     prac004.this.AV19TotKil = GXv_decimal25[0] ;
                     prac004.this.AV25PrdDesc = GXv_char3[0] ;
                     prac004.this.AV33Accion = GXv_char26[0] ;
                     prac004.this.AV62RecLinMaq = GXv_int15[0] ;
                     if ( AV32PrdVal == 1 )
                     {
                        if ( ( GXutil.strcmp(AV33Accion, httpContext.getMessage( "E", "")) == 0 ) || ( GXutil.strcmp(AV33Accion, httpContext.getMessage( "M", "")) == 0 ) )
                        {
                           GXv_char26[0] = A396EmprCod ;
                           GXv_int10[0] = AV34BarCod ;
                           GXv_int24[0] = AV35BarCodReo ;
                           GXv_char16[0] = AV36BarCodPar ;
                           GXv_int15[0] = AV22LinRec ;
                           GXv_int14[0] = AV46RecLinIni ;
                           GXv_int12[0] = AV62RecLinMaq ;
                           GXv_int23[0] = AV81RecLinPro ;
                           new app.pelirec(remoteHandle, context).execute( GXv_char26, GXv_int10, GXv_int24, GXv_char16, GXv_int15, GXv_int14, GXv_int12, GXv_int23) ;
                           prac004.this.A396EmprCod = GXv_char26[0] ;
                           prac004.this.AV34BarCod = GXv_int10[0] ;
                           prac004.this.AV35BarCodReo = GXv_int24[0] ;
                           prac004.this.AV36BarCodPar = GXv_char16[0] ;
                           prac004.this.AV22LinRec = GXv_int15[0] ;
                           prac004.this.AV46RecLinIni = GXv_int14[0] ;
                           prac004.this.AV62RecLinMaq = GXv_int12[0] ;
                           prac004.this.AV81RecLinPro = GXv_int23[0] ;
                        }
                        if ( ( GXutil.strcmp(AV33Accion, httpContext.getMessage( "A", "")) == 0 ) || ( GXutil.strcmp(AV33Accion, httpContext.getMessage( "M", "")) == 0 ) )
                        {
                           if ( GXutil.strcmp(GXutil.substring( A770ProForPrd, 1, 1), "0") == 0 )
                           {
                              AV27Producto = A770ProForPrd ;
                              AV31Cantidad = A762ProForCan ;
                              AV50ForPrdUme = A490ForPrdUMe ;
                              AV54FlagComp = (byte)(0) ;
                              Gx_msg = httpContext.getMessage( "Claves.Procesando Producto=", "") + A770ProForPrd + " " + GXutil.trim( AV73ProForDes) ;
                              System.out.println( Gx_msg );
                              GXv_char26[0] = A396EmprCod ;
                              GXv_char16[0] = A770ProForPrd ;
                              GXv_decimal25[0] = A762ProForCan ;
                              GXv_int24[0] = A490ForPrdUMe ;
                              GXv_decimal17[0] = AV19TotKil ;
                              GXv_int10[0] = AV17BarVol ;
                              GXv_int8[0] = AV20ValCos ;
                              GXv_int15[0] = AV22LinRec ;
                              GXv_int5[0] = AV34BarCod ;
                              GXv_int23[0] = AV35BarCodReo ;
                              GXv_char11[0] = AV36BarCodPar ;
                              GXv_int22[0] = AV38Flag1 ;
                              GXv_int21[0] = AV39Flag2 ;
                              GXv_int14[0] = AV46RecLinIni ;
                              GXv_int20[0] = AV49Linea ;
                              GXv_int19[0] = AV51ExiCon ;
                              GXv_int18[0] = AV54FlagComp ;
                              GXv_int9[0] = AV63RecForNro ;
                              GXv_int12[0] = AV62RecLinMaq ;
                              GXv_int1[0] = AV71TanqueN ;
                              GXv_char7[0] = AV73ProForDes ;
                              GXv_decimal13[0] = AV105CantIni ;
                              new app.pexipro4(remoteHandle, context).execute( GXv_char26, GXv_char16, GXv_decimal25, GXv_int24, GXv_decimal17, GXv_int10, GXv_int8, GXv_int15, GXv_int5, GXv_int23, GXv_char11, GXv_int22, GXv_int21, GXv_int14, GXv_int20, GXv_int19, GXv_int18, GXv_int9, GXv_int12, GXv_int1, GXv_char7, GXv_decimal13) ;
                              prac004.this.A396EmprCod = GXv_char26[0] ;
                              prac004.this.A770ProForPrd = GXv_char16[0] ;
                              prac004.this.A762ProForCan = GXv_decimal25[0] ;
                              prac004.this.A490ForPrdUMe = GXv_int24[0] ;
                              prac004.this.AV19TotKil = GXv_decimal17[0] ;
                              prac004.this.AV17BarVol = GXv_int10[0] ;
                              prac004.this.AV20ValCos = GXv_int8[0] ;
                              prac004.this.AV22LinRec = GXv_int15[0] ;
                              prac004.this.AV34BarCod = GXv_int5[0] ;
                              prac004.this.AV35BarCodReo = GXv_int23[0] ;
                              prac004.this.AV36BarCodPar = GXv_char11[0] ;
                              prac004.this.AV38Flag1 = GXv_int22[0] ;
                              prac004.this.AV39Flag2 = GXv_int21[0] ;
                              prac004.this.AV46RecLinIni = GXv_int14[0] ;
                              prac004.this.AV49Linea = GXv_int20[0] ;
                              prac004.this.AV51ExiCon = GXv_int19[0] ;
                              prac004.this.AV54FlagComp = GXv_int18[0] ;
                              prac004.this.AV63RecForNro = GXv_int9[0] ;
                              prac004.this.AV62RecLinMaq = GXv_int12[0] ;
                              prac004.this.AV71TanqueN = GXv_int1[0] ;
                              prac004.this.AV73ProForDes = GXv_char7[0] ;
                              prac004.this.AV105CantIni = GXv_decimal13[0] ;
                              /* Execute user subroutine: 'COMPUESTOS' */
                              S134 ();
                              if ( returnInSub )
                              {
                                 pr_default.close(2);
                                 pr_default.close(2);
                                 returnInSub = true;
                                 if (true) return;
                              }
                              AV54FlagComp = (byte)(0) ;
                           }
                           else
                           {
                              Gx_msg = httpContext.getMessage( "Procesando Producto=", "") + A770ProForPrd + " " + GXutil.trim( AV73ProForDes) ;
                              System.out.println( Gx_msg );
                              GXv_char26[0] = A396EmprCod ;
                              GXv_char16[0] = A770ProForPrd ;
                              GXv_decimal25[0] = A762ProForCan ;
                              GXv_int24[0] = A490ForPrdUMe ;
                              GXv_decimal17[0] = AV19TotKil ;
                              GXv_int10[0] = AV17BarVol ;
                              GXv_int8[0] = AV20ValCos ;
                              GXv_int15[0] = AV22LinRec ;
                              GXv_int5[0] = AV34BarCod ;
                              GXv_int23[0] = AV35BarCodReo ;
                              GXv_char11[0] = AV36BarCodPar ;
                              GXv_int22[0] = AV38Flag1 ;
                              GXv_int21[0] = AV39Flag2 ;
                              GXv_int14[0] = AV46RecLinIni ;
                              GXv_int20[0] = AV49Linea ;
                              GXv_int19[0] = AV51ExiCon ;
                              GXv_int18[0] = AV54FlagComp ;
                              GXv_int9[0] = AV63RecForNro ;
                              GXv_int12[0] = AV62RecLinMaq ;
                              GXv_int1[0] = AV71TanqueN ;
                              GXv_char7[0] = AV73ProForDes ;
                              GXv_decimal13[0] = AV105CantIni ;
                              new app.pexipro4(remoteHandle, context).execute( GXv_char26, GXv_char16, GXv_decimal25, GXv_int24, GXv_decimal17, GXv_int10, GXv_int8, GXv_int15, GXv_int5, GXv_int23, GXv_char11, GXv_int22, GXv_int21, GXv_int14, GXv_int20, GXv_int19, GXv_int18, GXv_int9, GXv_int12, GXv_int1, GXv_char7, GXv_decimal13) ;
                              prac004.this.A396EmprCod = GXv_char26[0] ;
                              prac004.this.A770ProForPrd = GXv_char16[0] ;
                              prac004.this.A762ProForCan = GXv_decimal25[0] ;
                              prac004.this.A490ForPrdUMe = GXv_int24[0] ;
                              prac004.this.AV19TotKil = GXv_decimal17[0] ;
                              prac004.this.AV17BarVol = GXv_int10[0] ;
                              prac004.this.AV20ValCos = GXv_int8[0] ;
                              prac004.this.AV22LinRec = GXv_int15[0] ;
                              prac004.this.AV34BarCod = GXv_int5[0] ;
                              prac004.this.AV35BarCodReo = GXv_int23[0] ;
                              prac004.this.AV36BarCodPar = GXv_char11[0] ;
                              prac004.this.AV38Flag1 = GXv_int22[0] ;
                              prac004.this.AV39Flag2 = GXv_int21[0] ;
                              prac004.this.AV46RecLinIni = GXv_int14[0] ;
                              prac004.this.AV49Linea = GXv_int20[0] ;
                              prac004.this.AV51ExiCon = GXv_int19[0] ;
                              prac004.this.AV54FlagComp = GXv_int18[0] ;
                              prac004.this.AV63RecForNro = GXv_int9[0] ;
                              prac004.this.AV62RecLinMaq = GXv_int12[0] ;
                              prac004.this.AV71TanqueN = GXv_int1[0] ;
                              prac004.this.AV73ProForDes = GXv_char7[0] ;
                              prac004.this.AV105CantIni = GXv_decimal13[0] ;
                           }
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S124( )
   {
      /* 'COLORANTES' Routine */
      returnInSub = false ;
      /* Using cursor P027V6 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV28NumColFor), Byte.valueOf(AV30Ncar), AV42ProForPrd, Byte.valueOf(AV30Ncar)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A719PrdNum = P027V6_A719PrdNum[0] ;
         A486ForNumCol = P027V6_A486ForNumCol[0] ;
         A718PrdNom = P027V6_A718PrdNom[0] ;
         A481ForCan = P027V6_A481ForCan[0] ;
         A490ForPrdUMe = P027V6_A490ForPrdUMe[0] ;
         A309ColLin = P027V6_A309ColLin[0] ;
         A718PrdNom = P027V6_A718PrdNom[0] ;
         Gx_msg = httpContext.getMessage( "Colorantes.Procesando Producto=", "") + A719PrdNum + " " + GXutil.trim( A718PrdNom) ;
         System.out.println( Gx_msg );
         GXv_char26[0] = A396EmprCod ;
         GXv_char16[0] = A719PrdNum ;
         GXv_decimal25[0] = A481ForCan ;
         GXv_int24[0] = A490ForPrdUMe ;
         GXv_decimal17[0] = AV19TotKil ;
         GXv_int10[0] = AV17BarVol ;
         GXv_int8[0] = AV20ValCos ;
         GXv_int15[0] = AV22LinRec ;
         GXv_int5[0] = AV34BarCod ;
         GXv_int23[0] = AV35BarCodReo ;
         GXv_char11[0] = AV36BarCodPar ;
         GXv_int22[0] = AV38Flag1 ;
         GXv_int21[0] = AV39Flag2 ;
         GXv_int14[0] = AV46RecLinIni ;
         GXv_int20[0] = AV49Linea ;
         GXv_int19[0] = AV51ExiCon ;
         GXv_int18[0] = AV54FlagComp ;
         GXv_int9[0] = AV63RecForNro ;
         GXv_int12[0] = AV62RecLinMaq ;
         GXv_int1[0] = AV71TanqueN ;
         GXv_char7[0] = AV73ProForDes ;
         GXv_decimal13[0] = AV105CantIni ;
         new app.pexipro4(remoteHandle, context).execute( GXv_char26, GXv_char16, GXv_decimal25, GXv_int24, GXv_decimal17, GXv_int10, GXv_int8, GXv_int15, GXv_int5, GXv_int23, GXv_char11, GXv_int22, GXv_int21, GXv_int14, GXv_int20, GXv_int19, GXv_int18, GXv_int9, GXv_int12, GXv_int1, GXv_char7, GXv_decimal13) ;
         prac004.this.A396EmprCod = GXv_char26[0] ;
         prac004.this.A719PrdNum = GXv_char16[0] ;
         prac004.this.A481ForCan = GXv_decimal25[0] ;
         prac004.this.A490ForPrdUMe = GXv_int24[0] ;
         prac004.this.AV19TotKil = GXv_decimal17[0] ;
         prac004.this.AV17BarVol = GXv_int10[0] ;
         prac004.this.AV20ValCos = GXv_int8[0] ;
         prac004.this.AV22LinRec = GXv_int15[0] ;
         prac004.this.AV34BarCod = GXv_int5[0] ;
         prac004.this.AV35BarCodReo = GXv_int23[0] ;
         prac004.this.AV36BarCodPar = GXv_char11[0] ;
         prac004.this.AV38Flag1 = GXv_int22[0] ;
         prac004.this.AV39Flag2 = GXv_int21[0] ;
         prac004.this.AV46RecLinIni = GXv_int14[0] ;
         prac004.this.AV49Linea = GXv_int20[0] ;
         prac004.this.AV51ExiCon = GXv_int19[0] ;
         prac004.this.AV54FlagComp = GXv_int18[0] ;
         prac004.this.AV63RecForNro = GXv_int9[0] ;
         prac004.this.AV62RecLinMaq = GXv_int12[0] ;
         prac004.this.AV71TanqueN = GXv_int1[0] ;
         prac004.this.AV73ProForDes = GXv_char7[0] ;
         prac004.this.AV105CantIni = GXv_decimal13[0] ;
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void S134( )
   {
      /* 'COMPUESTOS' Routine */
      returnInSub = false ;
   }

   public void S144( )
   {
      /* 'RECALCANT' Routine */
      returnInSub = false ;
      AV114Vol1 = (int)(AV104LtsIni+AV101LtsRec) ;
      if ( ( AV114Vol1 < AV112MaqVolmin ) && ( AV112MaqVolmin > 0 ) )
      {
         AV114Vol1 = AV112MaqVolmin ;
      }
      if ( AV101LtsRec > 0 )
      {
         AV109CantCal = DecimalUtil.doubleToDec(0) ;
         AV106FacCon1 = DecimalUtil.doubleToDec(0) ;
         if ( AV114Vol1 > 0 )
         {
            AV106FacCon1 = (AV105CantIni.divide(DecimalUtil.doubleToDec(AV114Vol1), 18, java.math.RoundingMode.DOWN)) ;
         }
         AV107FacCon2 = DecimalUtil.doubleToDec(0) ;
         if ( AV102Abs1.doubleValue() > 0 )
         {
            AV107FacCon2 = (DecimalUtil.doubleToDec(AV114Vol1).divide((AV102Abs1.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)), 18, java.math.RoundingMode.DOWN)) ;
         }
         AV110FacCon3 = DecimalUtil.doubleToDec(0) ;
         if ( AV103Abs2.doubleValue() > 0 )
         {
            AV110FacCon3 = (DecimalUtil.doubleToDec(AV101LtsRec).divide((AV103Abs2.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)), 18, java.math.RoundingMode.DOWN)) ;
         }
         AV109CantCal = AV106FacCon1.multiply((AV107FacCon2.subtract(AV110FacCon3))) ;
      }
      else
      {
         AV109CantCal = DecimalUtil.doubleToDec(0) ;
         if ( AV102Abs1.doubleValue() > 0 )
         {
            AV109CantCal = AV105CantIni.divide((AV102Abs1.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)), 18, java.math.RoundingMode.DOWN) ;
         }
      }
   }

   public void S151( )
   {
      /* 'MAQUIN' Routine */
      returnInSub = false ;
      AV112MaqVolmin = 0 ;
      /* Using cursor P027V7 */
      pr_default.execute(4, new Object[] {A396EmprCod, AV98MaqCod});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A602MaqCod = P027V7_A602MaqCod[0] ;
         A625MaqVolMin = P027V7_A625MaqVolMin[0] ;
         n625MaqVolMin = P027V7_n625MaqVolMin[0] ;
         AV112MaqVolmin = A625MaqVolMin ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP0[0] = prac004.this.A396EmprCod;
      this.aP1[0] = prac004.this.A129BarCod;
      this.aP2[0] = prac004.this.A132BarCodReo;
      this.aP3[0] = prac004.this.A130BarCodPar;
      this.aP4[0] = prac004.this.A2804RecLinMaq;
      this.aP5[0] = prac004.this.AV93Imp_r;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV47msg0 = "" ;
      GXt_char2 = "" ;
      AV19TotKil = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P027V3_A396EmprCod = new String[] {""} ;
      P027V3_A129BarCod = new int[1] ;
      P027V3_A132BarCodReo = new byte[1] ;
      P027V3_A130BarCodPar = new String[] {""} ;
      P027V3_A2804RecLinMaq = new short[1] ;
      P027V3_A2805RecVolPrd = new int[1] ;
      P027V3_A4268RecOrdLin = new short[1] ;
      P027V3_n4268RecOrdLin = new boolean[] {false} ;
      P027V3_A602MaqCod = new String[] {""} ;
      P027V3_A9764RecLtsSR = new int[1] ;
      P027V3_n9764RecLtsSR = new boolean[] {false} ;
      P027V3_A2806RecFA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P027V3_A9811RecAbs2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P027V3_n9811RecAbs2 = new boolean[] {false} ;
      P027V3_A252CliCod = new int[1] ;
      P027V3_n252CliCod = new boolean[] {false} ;
      P027V3_A212BarSer = new String[] {""} ;
      P027V3_A135BarColNom = new String[] {""} ;
      P027V3_A136BarColNum = new int[1] ;
      P027V3_A218BarTipCol = new byte[1] ;
      P027V3_A4271RecFagKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P027V3_n4271RecFagKgs = new boolean[] {false} ;
      P027V3_A4259RecTotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A602MaqCod = "" ;
      A2806RecFA = DecimalUtil.ZERO ;
      A9811RecAbs2 = DecimalUtil.ZERO ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A4271RecFagKgs = DecimalUtil.ZERO ;
      A4259RecTotKgs = DecimalUtil.ZERO ;
      A4316RecMaqKgs = DecimalUtil.ZERO ;
      AV36BarCodPar = "" ;
      AV59EmprCod = "" ;
      AV98MaqCod = "" ;
      AV102Abs1 = DecimalUtil.ZERO ;
      AV103Abs2 = DecimalUtil.ZERO ;
      AV74BarNumTon = "" ;
      P027V4_A396EmprCod = new String[] {""} ;
      P027V4_A129BarCod = new int[1] ;
      P027V4_A132BarCodReo = new byte[1] ;
      P027V4_A130BarCodPar = new String[] {""} ;
      P027V4_A2804RecLinMaq = new short[1] ;
      P027V4_A764ProForCod = new String[] {""} ;
      P027V4_A1273RecLinPro = new byte[1] ;
      A764ProForCod = "" ;
      AV37ProForCod = "" ;
      AV90FecLan = GXutil.nullDate() ;
      P027V5_A396EmprCod = new String[] {""} ;
      P027V5_A764ProForCod = new String[] {""} ;
      P027V5_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P027V5_A490ForPrdUMe = new byte[1] ;
      P027V5_A770ProForPrd = new String[] {""} ;
      P027V5_A765ProForDes = new String[] {""} ;
      P027V5_A13111ProForDe2 = new String[] {""} ;
      P027V5_A763ProForCla = new String[] {""} ;
      P027V5_A488ForPrdDsc = new String[] {""} ;
      P027V5_n488ForPrdDsc = new boolean[] {false} ;
      P027V5_A767ProForLin = new short[1] ;
      A762ProForCan = DecimalUtil.ZERO ;
      A770ProForPrd = "" ;
      A765ProForDes = "" ;
      A13111ProForDe2 = "" ;
      A763ProForCla = "" ;
      A488ForPrdDsc = "" ;
      AV105CantIni = DecimalUtil.ZERO ;
      AV25PrdDesc = "" ;
      AV27Producto = "" ;
      Gx_msg = "" ;
      AV43ForPrdCan = DecimalUtil.ZERO ;
      AV73ProForDes = "" ;
      AV44Produc = "" ;
      AV31Cantidad = DecimalUtil.ZERO ;
      AV42ProForPrd = "" ;
      AV109CantCal = DecimalUtil.ZERO ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      AV33Accion = "" ;
      P027V6_A396EmprCod = new String[] {""} ;
      P027V6_A719PrdNum = new String[] {""} ;
      P027V6_A486ForNumCol = new int[1] ;
      P027V6_A718PrdNom = new String[] {""} ;
      P027V6_A481ForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P027V6_A490ForPrdUMe = new byte[1] ;
      P027V6_A309ColLin = new short[1] ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A481ForCan = DecimalUtil.ZERO ;
      GXv_char26 = new String[1] ;
      GXv_char16 = new String[1] ;
      GXv_decimal25 = new java.math.BigDecimal[1] ;
      GXv_int24 = new byte[1] ;
      GXv_decimal17 = new java.math.BigDecimal[1] ;
      GXv_int10 = new int[1] ;
      GXv_int8 = new int[1] ;
      GXv_int15 = new short[1] ;
      GXv_int5 = new int[1] ;
      GXv_int23 = new byte[1] ;
      GXv_char11 = new String[1] ;
      GXv_int22 = new byte[1] ;
      GXv_int21 = new byte[1] ;
      GXv_int14 = new short[1] ;
      GXv_int20 = new byte[1] ;
      GXv_int19 = new byte[1] ;
      GXv_int18 = new byte[1] ;
      GXv_int9 = new byte[1] ;
      GXv_int12 = new short[1] ;
      GXv_int1 = new byte[1] ;
      GXv_char7 = new String[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      AV106FacCon1 = DecimalUtil.ZERO ;
      AV107FacCon2 = DecimalUtil.ZERO ;
      AV110FacCon3 = DecimalUtil.ZERO ;
      P027V7_A396EmprCod = new String[] {""} ;
      P027V7_A602MaqCod = new String[] {""} ;
      P027V7_A625MaqVolMin = new int[1] ;
      P027V7_n625MaqVolMin = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prac004__default(),
         new Object[] {
             new Object[] {
            P027V3_A396EmprCod, P027V3_A129BarCod, P027V3_A132BarCodReo, P027V3_A130BarCodPar, P027V3_A2804RecLinMaq, P027V3_A2805RecVolPrd, P027V3_A4268RecOrdLin, P027V3_n4268RecOrdLin, P027V3_A602MaqCod, P027V3_A9764RecLtsSR,
            P027V3_n9764RecLtsSR, P027V3_A2806RecFA, P027V3_A9811RecAbs2, P027V3_n9811RecAbs2, P027V3_A252CliCod, P027V3_n252CliCod, P027V3_A212BarSer, P027V3_A135BarColNom, P027V3_A136BarColNum, P027V3_A218BarTipCol,
            P027V3_A4271RecFagKgs, P027V3_n4271RecFagKgs, P027V3_A4259RecTotKgs
            }
            , new Object[] {
            P027V4_A396EmprCod, P027V4_A129BarCod, P027V4_A132BarCodReo, P027V4_A130BarCodPar, P027V4_A2804RecLinMaq, P027V4_A764ProForCod, P027V4_A1273RecLinPro
            }
            , new Object[] {
            P027V5_A396EmprCod, P027V5_A764ProForCod, P027V5_A762ProForCan, P027V5_A490ForPrdUMe, P027V5_A770ProForPrd, P027V5_A765ProForDes, P027V5_A13111ProForDe2, P027V5_A763ProForCla, P027V5_A488ForPrdDsc, P027V5_n488ForPrdDsc,
            P027V5_A767ProForLin
            }
            , new Object[] {
            P027V6_A396EmprCod, P027V6_A719PrdNum, P027V6_A486ForNumCol, P027V6_A718PrdNom, P027V6_A481ForCan, P027V6_A490ForPrdUMe, P027V6_A309ColLin
            }
            , new Object[] {
            P027V7_A396EmprCod, P027V7_A602MaqCod, P027V7_A625MaqVolMin, P027V7_n625MaqVolMin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV88FlagExiPro ;
   private byte AV51ExiCon ;
   private byte AV38Flag1 ;
   private byte AV39Flag2 ;
   private byte AV85FlagRenNro ;
   private byte AV87FlagCen ;
   private byte AV54FlagComp ;
   private byte AV97FlagFo13 ;
   private byte GXt_int6 ;
   private byte A218BarTipCol ;
   private byte AV24Flag ;
   private byte AV35BarCodReo ;
   private byte AV21ForCon ;
   private byte AV26FlagPro ;
   private byte AV49Linea ;
   private byte A1273RecLinPro ;
   private byte AV81RecLinPro ;
   private byte AV48FlagTemp ;
   private byte A490ForPrdUMe ;
   private byte AV50ForPrdUme ;
   private byte AV63RecForNro ;
   private byte AV71TanqueN ;
   private byte AV30Ncar ;
   private byte AV111Un ;
   private byte AV32PrdVal ;
   private byte GXv_int24[] ;
   private byte GXv_int23[] ;
   private byte GXv_int22[] ;
   private byte GXv_int21[] ;
   private byte GXv_int20[] ;
   private byte GXv_int19[] ;
   private byte GXv_int18[] ;
   private byte GXv_int9[] ;
   private byte GXv_int1[] ;
   private short A2804RecLinMaq ;
   private short A4268RecOrdLin ;
   private short AV22LinRec ;
   private short AV62RecLinMaq ;
   private short AV99RECORDLIN ;
   private short AV67BarLinMaq ;
   private short A767ProForLin ;
   private short AV46RecLinIni ;
   private short AV29NumOrd ;
   private short A309ColLin ;
   private short GXv_int15[] ;
   private short GXv_int14[] ;
   private short GXv_int12[] ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV20ValCos ;
   private int AV94Copias ;
   private int A2805RecVolPrd ;
   private int A9764RecLtsSR ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int AV34BarCod ;
   private int AV17BarVol ;
   private int AV101LtsRec ;
   private int AV104LtsIni ;
   private int AV28NumColFor ;
   private int A486ForNumCol ;
   private int GXv_int10[] ;
   private int GXv_int8[] ;
   private int GXv_int5[] ;
   private int AV114Vol1 ;
   private int AV112MaqVolmin ;
   private int A625MaqVolMin ;
   private java.math.BigDecimal AV19TotKil ;
   private java.math.BigDecimal A2806RecFA ;
   private java.math.BigDecimal A9811RecAbs2 ;
   private java.math.BigDecimal A4271RecFagKgs ;
   private java.math.BigDecimal A4259RecTotKgs ;
   private java.math.BigDecimal A4316RecMaqKgs ;
   private java.math.BigDecimal AV102Abs1 ;
   private java.math.BigDecimal AV103Abs2 ;
   private java.math.BigDecimal A762ProForCan ;
   private java.math.BigDecimal AV105CantIni ;
   private java.math.BigDecimal AV43ForPrdCan ;
   private java.math.BigDecimal AV31Cantidad ;
   private java.math.BigDecimal AV109CantCal ;
   private java.math.BigDecimal A481ForCan ;
   private java.math.BigDecimal GXv_decimal25[] ;
   private java.math.BigDecimal GXv_decimal17[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal AV106FacCon1 ;
   private java.math.BigDecimal AV107FacCon2 ;
   private java.math.BigDecimal AV110FacCon3 ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV93Imp_r ;
   private String AV47msg0 ;
   private String GXt_char2 ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String AV36BarCodPar ;
   private String AV59EmprCod ;
   private String AV98MaqCod ;
   private String AV74BarNumTon ;
   private String A764ProForCod ;
   private String AV37ProForCod ;
   private String A770ProForPrd ;
   private String A765ProForDes ;
   private String A13111ProForDe2 ;
   private String A763ProForCla ;
   private String A488ForPrdDsc ;
   private String AV25PrdDesc ;
   private String AV27Producto ;
   private String Gx_msg ;
   private String AV73ProForDes ;
   private String AV44Produc ;
   private String AV42ProForPrd ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String AV33Accion ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String GXv_char26[] ;
   private String GXv_char16[] ;
   private String GXv_char11[] ;
   private String GXv_char7[] ;
   private java.util.Date AV90FecLan ;
   private boolean n4268RecOrdLin ;
   private boolean n9764RecLtsSR ;
   private boolean n9811RecAbs2 ;
   private boolean n252CliCod ;
   private boolean n4271RecFagKgs ;
   private boolean returnInSub ;
   private boolean n488ForPrdDsc ;
   private boolean n625MaqVolMin ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P027V3_A396EmprCod ;
   private int[] P027V3_A129BarCod ;
   private byte[] P027V3_A132BarCodReo ;
   private String[] P027V3_A130BarCodPar ;
   private short[] P027V3_A2804RecLinMaq ;
   private int[] P027V3_A2805RecVolPrd ;
   private short[] P027V3_A4268RecOrdLin ;
   private boolean[] P027V3_n4268RecOrdLin ;
   private String[] P027V3_A602MaqCod ;
   private int[] P027V3_A9764RecLtsSR ;
   private boolean[] P027V3_n9764RecLtsSR ;
   private java.math.BigDecimal[] P027V3_A2806RecFA ;
   private java.math.BigDecimal[] P027V3_A9811RecAbs2 ;
   private boolean[] P027V3_n9811RecAbs2 ;
   private int[] P027V3_A252CliCod ;
   private boolean[] P027V3_n252CliCod ;
   private String[] P027V3_A212BarSer ;
   private String[] P027V3_A135BarColNom ;
   private int[] P027V3_A136BarColNum ;
   private byte[] P027V3_A218BarTipCol ;
   private java.math.BigDecimal[] P027V3_A4271RecFagKgs ;
   private boolean[] P027V3_n4271RecFagKgs ;
   private java.math.BigDecimal[] P027V3_A4259RecTotKgs ;
   private String[] P027V4_A396EmprCod ;
   private int[] P027V4_A129BarCod ;
   private byte[] P027V4_A132BarCodReo ;
   private String[] P027V4_A130BarCodPar ;
   private short[] P027V4_A2804RecLinMaq ;
   private String[] P027V4_A764ProForCod ;
   private byte[] P027V4_A1273RecLinPro ;
   private String[] P027V5_A396EmprCod ;
   private String[] P027V5_A764ProForCod ;
   private java.math.BigDecimal[] P027V5_A762ProForCan ;
   private byte[] P027V5_A490ForPrdUMe ;
   private String[] P027V5_A770ProForPrd ;
   private String[] P027V5_A765ProForDes ;
   private String[] P027V5_A13111ProForDe2 ;
   private String[] P027V5_A763ProForCla ;
   private String[] P027V5_A488ForPrdDsc ;
   private boolean[] P027V5_n488ForPrdDsc ;
   private short[] P027V5_A767ProForLin ;
   private String[] P027V6_A396EmprCod ;
   private String[] P027V6_A719PrdNum ;
   private int[] P027V6_A486ForNumCol ;
   private String[] P027V6_A718PrdNom ;
   private java.math.BigDecimal[] P027V6_A481ForCan ;
   private byte[] P027V6_A490ForPrdUMe ;
   private short[] P027V6_A309ColLin ;
   private String[] P027V7_A396EmprCod ;
   private String[] P027V7_A602MaqCod ;
   private int[] P027V7_A625MaqVolMin ;
   private boolean[] P027V7_n625MaqVolMin ;
}

final  class prac004__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P027V3", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecVolPrd, T1.RecOrdLin, T1.MaqCod, T1.RecLtsSR, T1.RecFA, T1.RecAbs2, T2.CliCod, T2.BarSer, T2.BarColNom, T2.BarColNum, T2.BarTipCol, COALESCE( T3.RecFagKgs, 0) AS RecFagKgs, T1.RecTotKgs FROM ((TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(RecAgrKgs) AS RecFagKgs, EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq FROM TXPRECFAG GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar AND T3.RecLinMaq = T1.RecLinMaq) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P027V4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, ProForCod, RecLinPro FROM TXPCRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P027V5", "SELECT T1.EmprCod, T1.ProForCod, T1.ProForCan, T1.ForPrdUMe, T1.ProForPrd, T1.ProForDes, T1.ProForDe2, T1.ProForCla, T2.ForPrdDsc, T1.ProForLin FROM (TXPLPROFO T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.ProForCod = ? ORDER BY T1.EmprCod, T1.ProForCod, T1.ProForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P027V6", "SELECT T1.EmprCod, T1.PrdNum, T1.ForNumCol, T2.PrdNom, T1.ForCan, T1.ForPrdUMe, T1.ColLin FROM (TXPLDFORM T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ? and T1.ForNumCol = ?) AND (SUBSTR(T1.PrdNum, 1, ?) = SUBSTR(?, 1, ?)) ORDER BY T1.EmprCod, T1.ForNumCol, T1.ColLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P027V7", "SELECT EmprCod, MaqCod, MaqVolMin FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(13, 16);
               ((String[]) buf[17])[0] = rslt.getString(14, 13);
               ((int[]) buf[18])[0] = rslt.getInt(15);
               ((byte[]) buf[19])[0] = rslt.getByte(16);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(18,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 40);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((String[]) buf[8])[0] = rslt.getString(9, 5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(10);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 6);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

