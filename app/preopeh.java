package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class preopeh extends GXProcedure
{
   public preopeh( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( preopeh.class ), "" );
   }

   public preopeh( int remoteHandle ,
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
                                           int[] aP7 ,
                                           java.math.BigDecimal[] aP8 )
   {
      preopeh.this.aP9 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        int[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        java.math.BigDecimal[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             int[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 )
   {
      preopeh.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      preopeh.this.AV15BarCodOri = aP1[0];
      this.aP1 = aP1;
      preopeh.this.AV16BarReoOri = aP2[0];
      this.aP2 = aP2;
      preopeh.this.AV17BarParOri = aP3[0];
      this.aP3 = aP3;
      preopeh.this.AV18BarCodDes = aP4[0];
      this.aP4 = aP4;
      preopeh.this.AV19BarReoDes = aP5[0];
      this.aP5 = aP5;
      preopeh.this.AV20BarParDes = aP6[0];
      this.aP6 = aP6;
      preopeh.this.AV21Conos = aP7[0];
      this.aP7 = aP7;
      preopeh.this.AV22Kilos = aP8[0];
      this.aP8 = aP8;
      preopeh.this.AV23Metros = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV37Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      preopeh.this.GXt_char1 = GXv_char2[0] ;
      AV37Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV38EmprNom ;
      GXv_char4[0] = AV39UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV37Station, GXv_char2, GXv_char3, GXv_char4) ;
      preopeh.this.A396EmprCod = GXv_char2[0] ;
      preopeh.this.AV38EmprNom = GXv_char3[0] ;
      preopeh.this.AV39UsurCod = GXv_char4[0] ;
      AV30FlagJBurgo = (byte)(0) ;
      GXv_int5[0] = AV30FlagJBurgo ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "JBURGO", ""), GXv_int5) ;
      preopeh.this.AV30FlagJBurgo = GXv_int5[0] ;
      AV29Conos2 = AV21Conos ;
      AV27Metros2 = AV23Metros ;
      AV28Kilos2 = AV22Kilos ;
      /* Using cursor P006M2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15BarCodOri), Byte.valueOf(AV16BarReoOri), AV17BarParOri});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A129BarCod = P006M2_A129BarCod[0] ;
         A132BarCodReo = P006M2_A132BarCodReo[0] ;
         A130BarCodPar = P006M2_A130BarCodPar[0] ;
         A228BarUniMed = P006M2_A228BarUniMed[0] ;
         A213BarSit = P006M2_A213BarSit[0] ;
         A120BarAgrEst = P006M2_A120BarAgrEst[0] ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         AV32BarUniMed = A228BarUniMed ;
         AV33BarSitOri = A213BarSit ;
         AV35BarAgrEst = A120BarAgrEst ;
         /* Using cursor P006M3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A9800BarNPes = P006M3_A9800BarNPes[0] ;
            n9800BarNPes = P006M3_n9800BarNPes[0] ;
            A9798BarPz1 = P006M3_A9798BarPz1[0] ;
            n9798BarPz1 = P006M3_n9798BarPz1[0] ;
            A9795BarPieK1 = P006M3_A9795BarPieK1[0] ;
            n9795BarPieK1 = P006M3_n9795BarPieK1[0] ;
            A1501BarPiePie = P006M3_A1501BarPiePie[0] ;
            A205BarPieMet = P006M3_A205BarPieMet[0] ;
            A203BarPieKil = P006M3_A203BarPieKil[0] ;
            A13988BarPieVtx = P006M3_A13988BarPieVtx[0] ;
            A13519BarPieMq = P006M3_A13519BarPieMq[0] ;
            n13519BarPieMq = P006M3_n13519BarPieMq[0] ;
            A13518BarPieTurn = P006M3_A13518BarPieTurn[0] ;
            n13518BarPieTurn = P006M3_n13518BarPieTurn[0] ;
            A13109BarPieST = P006M3_A13109BarPieST[0] ;
            n13109BarPieST = P006M3_n13109BarPieST[0] ;
            A13108BarPieLote = P006M3_A13108BarPieLote[0] ;
            n13108BarPieLote = P006M3_n13108BarPieLote[0] ;
            A13107BarPieEmp = P006M3_A13107BarPieEmp[0] ;
            n13107BarPieEmp = P006M3_n13107BarPieEmp[0] ;
            A13004BarPieDest = P006M3_A13004BarPieDest[0] ;
            n13004BarPieDest = P006M3_n13004BarPieDest[0] ;
            A12992BarPieOpe = P006M3_A12992BarPieOpe[0] ;
            n12992BarPieOpe = P006M3_n12992BarPieOpe[0] ;
            A12936BarPieSecu = P006M3_A12936BarPieSecu[0] ;
            n12936BarPieSecu = P006M3_n12936BarPieSecu[0] ;
            A12935BarPieTono = P006M3_A12935BarPieTono[0] ;
            n12935BarPieTono = P006M3_n12935BarPieTono[0] ;
            A12928BarPieEncC = P006M3_A12928BarPieEncC[0] ;
            n12928BarPieEncC = P006M3_n12928BarPieEncC[0] ;
            A12927BarPieCoCN = P006M3_A12927BarPieCoCN[0] ;
            n12927BarPieCoCN = P006M3_n12927BarPieCoCN[0] ;
            A12926BarPieCoCI = P006M3_A12926BarPieCoCI[0] ;
            n12926BarPieCoCI = P006M3_n12926BarPieCoCI[0] ;
            A12925BarPieCliN = P006M3_A12925BarPieCliN[0] ;
            n12925BarPieCliN = P006M3_n12925BarPieCliN[0] ;
            A12924BarPieCliI = P006M3_A12924BarPieCliI[0] ;
            n12924BarPieCliI = P006M3_n12924BarPieCliI[0] ;
            A12923BarPieArtD = P006M3_A12923BarPieArtD[0] ;
            n12923BarPieArtD = P006M3_n12923BarPieArtD[0] ;
            A12922BarPieArtI = P006M3_A12922BarPieArtI[0] ;
            n12922BarPieArtI = P006M3_n12922BarPieArtI[0] ;
            A12921BarPieColN = P006M3_A12921BarPieColN[0] ;
            n12921BarPieColN = P006M3_n12921BarPieColN[0] ;
            A12920BarPieColD = P006M3_A12920BarPieColD[0] ;
            n12920BarPieColD = P006M3_n12920BarPieColD[0] ;
            A12912BarPieUltD = P006M3_A12912BarPieUltD[0] ;
            n12912BarPieUltD = P006M3_n12912BarPieUltD[0] ;
            A12911BarPieFep = P006M3_A12911BarPieFep[0] ;
            n12911BarPieFep = P006M3_n12911BarPieFep[0] ;
            A12780BarPieUsu = P006M3_A12780BarPieUsu[0] ;
            n12780BarPieUsu = P006M3_n12780BarPieUsu[0] ;
            A12779BarPieFdv = P006M3_A12779BarPieFdv[0] ;
            n12779BarPieFdv = P006M3_n12779BarPieFdv[0] ;
            A12113BarPieCLd = P006M3_A12113BarPieCLd[0] ;
            n12113BarPieCLd = P006M3_n12113BarPieCLd[0] ;
            A1642BarPieOrd = P006M3_A1642BarPieOrd[0] ;
            n1642BarPieOrd = P006M3_n1642BarPieOrd[0] ;
            A6473BarUniB = P006M3_A6473BarUniB[0] ;
            n6473BarUniB = P006M3_n6473BarUniB[0] ;
            A6472BarTara = P006M3_A6472BarTara[0] ;
            n6472BarTara = P006M3_n6472BarTara[0] ;
            A1919BarPieObs = P006M3_A1919BarPieObs[0] ;
            n1919BarPieObs = P006M3_n1919BarPieObs[0] ;
            A9984BarPiePda = P006M3_A9984BarPiePda[0] ;
            n9984BarPiePda = P006M3_n9984BarPiePda[0] ;
            A9846BarPieAncc = P006M3_A9846BarPieAncc[0] ;
            n9846BarPieAncc = P006M3_n9846BarPieAncc[0] ;
            A9799BarPz2 = P006M3_A9799BarPz2[0] ;
            n9799BarPz2 = P006M3_n9799BarPz2[0] ;
            A9796BarPieK2 = P006M3_A9796BarPieK2[0] ;
            n9796BarPieK2 = P006M3_n9796BarPieK2[0] ;
            A8907PzaB80 = P006M3_A8907PzaB80[0] ;
            n8907PzaB80 = P006M3_n8907PzaB80[0] ;
            A8838CodBarPz = P006M3_A8838CodBarPz[0] ;
            n8838CodBarPz = P006M3_n8838CodBarPz[0] ;
            A8707BapieObs = P006M3_A8707BapieObs[0] ;
            n8707BapieObs = P006M3_n8707BapieObs[0] ;
            A6489BarPieIdPz = P006M3_A6489BarPieIdPz[0] ;
            n6489BarPieIdPz = P006M3_n6489BarPieIdPz[0] ;
            A6116BarPieImp = P006M3_A6116BarPieImp[0] ;
            n6116BarPieImp = P006M3_n6116BarPieImp[0] ;
            A3277BarPieAut = P006M3_A3277BarPieAut[0] ;
            n3277BarPieAut = P006M3_n3277BarPieAut[0] ;
            A3276BarMtsAut = P006M3_A3276BarMtsAut[0] ;
            n3276BarMtsAut = P006M3_n3276BarMtsAut[0] ;
            A3275BarKgsAut = P006M3_A3275BarKgsAut[0] ;
            n3275BarKgsAut = P006M3_n3275BarKgsAut[0] ;
            A2186BarPieLoc = P006M3_A2186BarPieLoc[0] ;
            n2186BarPieLoc = P006M3_n2186BarPieLoc[0] ;
            A1691BarPieAnc = P006M3_A1691BarPieAnc[0] ;
            n1691BarPieAnc = P006M3_n1691BarPieAnc[0] ;
            A1271BarPieLzd = P006M3_A1271BarPieLzd[0] ;
            A908PieOriCod = P006M3_A908PieOriCod[0] ;
            A197BarPConTro = P006M3_A197BarPConTro[0] ;
            A183BarMetLan = P006M3_A183BarMetLan[0] ;
            A170BarKilLan = P006M3_A170BarKilLan[0] ;
            A201BarPieEst = P006M3_A201BarPieEst[0] ;
            A44AlbRecCod = P006M3_A44AlbRecCod[0] ;
            A200BarPieCod = P006M3_A200BarPieCod[0] ;
            W129BarCod = A129BarCod ;
            W132BarCodReo = A132BarCodReo ;
            W130BarCodPar = A130BarCodPar ;
            if ( DecimalUtil.compareTo(A203BarPieKil, AV28Kilos2) <= 0 )
            {
               if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A203BarPieKil)==0) )
               {
                  AV22Kilos = A203BarPieKil ;
                  AV28Kilos2 = AV28Kilos2.subtract(AV22Kilos) ;
                  if ( GXutil.strcmp(AV32BarUniMed, httpContext.getMessage( "K", "")) == 0 )
                  {
                     /* Using cursor P006M4 */
                     pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
                     AV36Inc_obs = httpContext.getMessage( "Preopeh.Delete BARPIE, Hdr Origen= ", "") + GXutil.str( AV15BarCodOri, 8, 0) + "-" + GXutil.str( AV16BarReoOri, 1, 0) + AV17BarParOri + GXutil.newLine( ) ;
                     AV36Inc_obs += httpContext.getMessage( "BarPiecod= ", "") + A200BarPieCod + httpContext.getMessage( " Nrecepcion= ", "") + GXutil.str( A44AlbRecCod, 8, 0) + httpContext.getMessage( " Kgs= ", "") + GXutil.str( A203BarPieKil, 9, 2) ;
                     new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV44Pgmname, AV39UsurCod, AV37Station, AV36Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
                  }
               }
            }
            else
            {
               AV36Inc_obs = httpContext.getMessage( "Preopeh.Update BARPIE, Hdr Origen= ", "") + GXutil.str( AV15BarCodOri, 8, 0) + "-" + GXutil.str( AV16BarReoOri, 1, 0) + AV17BarParOri + GXutil.newLine( ) ;
               AV36Inc_obs += httpContext.getMessage( "BarPiecod= ", "") + A200BarPieCod + httpContext.getMessage( " Nrecepcion= ", "") + GXutil.str( A44AlbRecCod, 8, 0) + httpContext.getMessage( " Kgs Origen= ", "") + GXutil.str( A203BarPieKil, 9, 2) + httpContext.getMessage( " Kgs a restar= ", "") + GXutil.str( AV22Kilos, 9, 2) ;
               AV22Kilos = AV28Kilos2 ;
               AV28Kilos2 = AV28Kilos2.subtract(AV22Kilos) ;
               A203BarPieKil = A203BarPieKil.subtract(AV22Kilos) ;
               new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV44Pgmname, AV39UsurCod, AV37Station, AV36Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
            }
            if ( DecimalUtil.compareTo(A205BarPieMet, AV27Metros2) <= 0 )
            {
               if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A205BarPieMet)==0) )
               {
                  AV23Metros = A205BarPieMet ;
                  AV27Metros2 = AV27Metros2.subtract(AV23Metros) ;
                  if ( GXutil.strcmp(AV32BarUniMed, httpContext.getMessage( "M", "")) == 0 )
                  {
                     /* Using cursor P006M5 */
                     pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
                     AV36Inc_obs = httpContext.getMessage( "Preopeh.Delete BARPIE, Hdr Origen= ", "") + GXutil.str( AV15BarCodOri, 8, 0) + "-" + GXutil.str( AV16BarReoOri, 1, 0) + AV17BarParOri + GXutil.newLine( ) ;
                     AV36Inc_obs += httpContext.getMessage( "BarPiecod= ", "") + A200BarPieCod + httpContext.getMessage( " Nrecepcion= ", "") + GXutil.str( A44AlbRecCod, 8, 0) + httpContext.getMessage( " Mts= ", "") + GXutil.str( A205BarPieMet, 9, 2) ;
                     new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV44Pgmname, AV39UsurCod, AV37Station, AV36Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
                  }
               }
            }
            else
            {
               AV36Inc_obs = httpContext.getMessage( "Preopeh.Update BARPIE, Hdr Origen= ", "") + GXutil.str( AV15BarCodOri, 8, 0) + "-" + GXutil.str( AV16BarReoOri, 1, 0) + AV17BarParOri + GXutil.newLine( ) ;
               AV36Inc_obs += httpContext.getMessage( "BarPiecod= ", "") + A200BarPieCod + httpContext.getMessage( " Nrecepcion= ", "") + GXutil.str( A44AlbRecCod, 8, 0) + httpContext.getMessage( " Mts Origen= ", "") + GXutil.str( A205BarPieMet, 9, 2) + httpContext.getMessage( " Mts a restar= ", "") + GXutil.str( AV23Metros, 9, 2) ;
               AV23Metros = AV27Metros2 ;
               AV27Metros2 = AV27Metros2.subtract(AV23Metros) ;
               A205BarPieMet = A205BarPieMet.subtract(AV23Metros) ;
               new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV44Pgmname, AV39UsurCod, AV37Station, AV36Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
            }
            if ( A1501BarPiePie <= AV29Conos2 )
            {
               if ( A1501BarPiePie > 1 )
               {
                  AV36Inc_obs = httpContext.getMessage( "1.Preopeh.Update BARPIE, Hdr Origen= ", "") + GXutil.str( AV15BarCodOri, 8, 0) + "-" + GXutil.str( AV16BarReoOri, 1, 0) + AV17BarParOri + GXutil.newLine( ) ;
                  AV36Inc_obs += httpContext.getMessage( "BarPiecod= ", "") + A200BarPieCod + httpContext.getMessage( " Nrecepcion= ", "") + GXutil.str( A44AlbRecCod, 8, 0) + httpContext.getMessage( " Pzs Origen= ", "") + GXutil.str( A1501BarPiePie, 6, 0) + httpContext.getMessage( " Pzs a restar= ", "") + GXutil.str( AV21Conos, 6, 0) ;
                  AV21Conos = A1501BarPiePie ;
                  AV29Conos2 = (int)(AV29Conos2-AV21Conos) ;
                  A1501BarPiePie = (int)(A1501BarPiePie-AV21Conos) ;
                  new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV44Pgmname, AV39UsurCod, AV37Station, AV36Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
               }
               else
               {
                  if ( A1501BarPiePie == 1 )
                  {
                     AV21Conos = 1 ;
                     AV29Conos2 = (int)(AV29Conos2-1) ;
                  }
               }
            }
            else
            {
               AV36Inc_obs = httpContext.getMessage( "2.Preopeh.Update BARPIE, Hdr Origen= ", "") + GXutil.str( AV15BarCodOri, 8, 0) + "-" + GXutil.str( AV16BarReoOri, 1, 0) + AV17BarParOri + GXutil.newLine( ) ;
               AV36Inc_obs += httpContext.getMessage( "BarPiecod= ", "") + A200BarPieCod + httpContext.getMessage( " Nrecepcion= ", "") + GXutil.str( A44AlbRecCod, 8, 0) + httpContext.getMessage( " Pzs Origen= ", "") + GXutil.str( A1501BarPiePie, 6, 0) + httpContext.getMessage( " Pzs a restar= ", "") + GXutil.str( AV21Conos, 6, 0) ;
               AV21Conos = AV29Conos2 ;
               AV29Conos2 = (int)(AV29Conos2-AV21Conos) ;
               A1501BarPiePie = (int)(A1501BarPiePie-AV21Conos) ;
               new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV44Pgmname, AV39UsurCod, AV37Station, AV36Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
            }
            /*
               INSERT RECORD ON TABLE TXPBARPIE

            */
            W129BarCod = A129BarCod ;
            W132BarCodReo = A132BarCodReo ;
            W130BarCodPar = A130BarCodPar ;
            W203BarPieKil = A203BarPieKil ;
            W205BarPieMet = A205BarPieMet ;
            W1501BarPiePie = A1501BarPiePie ;
            W9795BarPieK1 = A9795BarPieK1 ;
            n9795BarPieK1 = false ;
            W9798BarPz1 = A9798BarPz1 ;
            n9798BarPz1 = false ;
            W9800BarNPes = A9800BarNPes ;
            n9800BarNPes = false ;
            A129BarCod = AV18BarCodDes ;
            A132BarCodReo = AV19BarReoDes ;
            A130BarCodPar = AV20BarParDes ;
            A203BarPieKil = AV22Kilos ;
            A205BarPieMet = AV23Metros ;
            A1501BarPiePie = AV21Conos ;
            A9795BarPieK1 = AV22Kilos ;
            n9795BarPieK1 = false ;
            A9798BarPz1 = AV21Conos ;
            n9798BarPz1 = false ;
            A9800BarNPes = (byte)(1) ;
            n9800BarNPes = false ;
            AV36Inc_obs = httpContext.getMessage( "Preopeh.Insert BARPIE, Hdr Destino= ", "") + GXutil.str( AV18BarCodDes, 8, 0) + "-" + GXutil.str( AV19BarReoDes, 1, 0) + AV20BarParDes + GXutil.newLine( ) ;
            AV36Inc_obs += httpContext.getMessage( "BarPiecod= ", "") + A200BarPieCod + httpContext.getMessage( " Nrecepcion= ", "") + GXutil.str( A44AlbRecCod, 8, 0) + httpContext.getMessage( " Kgs = ", "") + GXutil.str( AV22Kilos, 9, 2) + httpContext.getMessage( " Mts= ", "") + GXutil.str( AV23Metros, 9, 2) + httpContext.getMessage( " Pzs= ", "") + GXutil.str( AV21Conos, 6, 0) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV44Pgmname, AV39UsurCod, AV37Station, AV36Inc_obs, AV15BarCodOri, AV16BarReoOri, AV17BarParOri) ;
            /* Using cursor P006M6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Integer.valueOf(A44AlbRecCod), A203BarPieKil, A205BarPieMet, Byte.valueOf(A201BarPieEst), A170BarKilLan, A183BarMetLan, Short.valueOf(A197BarPConTro), A908PieOriCod, Integer.valueOf(A1271BarPieLzd), Integer.valueOf(A1501BarPiePie), Boolean.valueOf(n1691BarPieAnc), Short.valueOf(A1691BarPieAnc), Boolean.valueOf(n2186BarPieLoc), A2186BarPieLoc, Boolean.valueOf(n3275BarKgsAut), A3275BarKgsAut, Boolean.valueOf(n3276BarMtsAut), A3276BarMtsAut, Boolean.valueOf(n3277BarPieAut), Short.valueOf(A3277BarPieAut), Boolean.valueOf(n6116BarPieImp), A6116BarPieImp, Boolean.valueOf(n6489BarPieIdPz), A6489BarPieIdPz, Boolean.valueOf(n8707BapieObs), A8707BapieObs, Boolean.valueOf(n8838CodBarPz), A8838CodBarPz, Boolean.valueOf(n8907PzaB80), A8907PzaB80, Boolean.valueOf(n9795BarPieK1), A9795BarPieK1, Boolean.valueOf(n9796BarPieK2), A9796BarPieK2, Boolean.valueOf(n9798BarPz1), Integer.valueOf(A9798BarPz1), Boolean.valueOf(n9799BarPz2), Integer.valueOf(A9799BarPz2), Boolean.valueOf(n9800BarNPes), Byte.valueOf(A9800BarNPes), Boolean.valueOf(n9846BarPieAncc), Short.valueOf(A9846BarPieAncc), Boolean.valueOf(n9984BarPiePda), A9984BarPiePda, Boolean.valueOf(n1919BarPieObs), A1919BarPieObs, Boolean.valueOf(n6472BarTara), A6472BarTara, Boolean.valueOf(n6473BarUniB), A6473BarUniB, Boolean.valueOf(n1642BarPieOrd), Integer.valueOf(A1642BarPieOrd), Boolean.valueOf(n12113BarPieCLd), Byte.valueOf(A12113BarPieCLd), Boolean.valueOf(n12779BarPieFdv), A12779BarPieFdv, Boolean.valueOf(n12780BarPieUsu), A12780BarPieUsu, Boolean.valueOf(n12911BarPieFep), A12911BarPieFep, Boolean.valueOf(n12912BarPieUltD), Short.valueOf(A12912BarPieUltD), Boolean.valueOf(n12920BarPieColD), A12920BarPieColD, Boolean.valueOf(n12921BarPieColN), Integer.valueOf(A12921BarPieColN), Boolean.valueOf(n12922BarPieArtI), A12922BarPieArtI, Boolean.valueOf(n12923BarPieArtD), A12923BarPieArtD, Boolean.valueOf(n12924BarPieCliI), Integer.valueOf(A12924BarPieCliI), Boolean.valueOf(n12925BarPieCliN), A12925BarPieCliN, Boolean.valueOf(n12926BarPieCoCI), A12926BarPieCoCI, Boolean.valueOf(n12927BarPieCoCN), Integer.valueOf(A12927BarPieCoCN), Boolean.valueOf(n12928BarPieEncC), A12928BarPieEncC, Boolean.valueOf(n12935BarPieTono), A12935BarPieTono, Boolean.valueOf(n12936BarPieSecu), A12936BarPieSecu, Boolean.valueOf(n12992BarPieOpe), Integer.valueOf(A12992BarPieOpe), Boolean.valueOf(n13004BarPieDest), Byte.valueOf(A13004BarPieDest), Boolean.valueOf(n13107BarPieEmp), Short.valueOf(A13107BarPieEmp), Boolean.valueOf(n13108BarPieLote), A13108BarPieLote, Boolean.valueOf(n13109BarPieST), A13109BarPieST, Boolean.valueOf(n13518BarPieTurn), Byte.valueOf(A13518BarPieTurn), Boolean.valueOf(n13519BarPieMq), A13519BarPieMq, A13988BarPieVtx});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
            if ( (pr_default.getStatus(4) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
               /* Using cursor P006M7 */
               pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
               while ( (pr_default.getStatus(5) != 101) )
               {
                  A396EmprCod = P006M7_A396EmprCod[0] ;
                  A129BarCod = P006M7_A129BarCod[0] ;
                  A132BarCodReo = P006M7_A132BarCodReo[0] ;
                  A130BarCodPar = P006M7_A130BarCodPar[0] ;
                  A200BarPieCod = P006M7_A200BarPieCod[0] ;
                  A203BarPieKil = P006M7_A203BarPieKil[0] ;
                  A205BarPieMet = P006M7_A205BarPieMet[0] ;
                  A1501BarPiePie = P006M7_A1501BarPiePie[0] ;
                  A44AlbRecCod = P006M7_A44AlbRecCod[0] ;
                  A203BarPieKil = A203BarPieKil.add(AV22Kilos) ;
                  A205BarPieMet = A205BarPieMet.add(AV23Metros) ;
                  A1501BarPiePie = (int)(A1501BarPiePie+AV21Conos) ;
                  AV36Inc_obs = httpContext.getMessage( "Preopeh.Duplicate BARPIE, Hdr Destino= ", "") + GXutil.str( AV18BarCodDes, 8, 0) + "-" + GXutil.str( AV19BarReoDes, 1, 0) + AV20BarParDes + GXutil.newLine( ) ;
                  AV36Inc_obs += httpContext.getMessage( "BarPiecod= ", "") + A200BarPieCod + httpContext.getMessage( " Nrecepcion= ", "") + GXutil.str( A44AlbRecCod, 8, 0) + httpContext.getMessage( " Kgs = ", "") + GXutil.str( AV22Kilos, 9, 2) + httpContext.getMessage( " Mts= ", "") + GXutil.str( AV23Metros, 9, 2) + httpContext.getMessage( " Pzs= ", "") + GXutil.str( AV21Conos, 6, 0) ;
                  new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV44Pgmname, AV39UsurCod, AV37Station, AV36Inc_obs, AV15BarCodOri, AV16BarReoOri, AV17BarParOri) ;
                  /* Using cursor P006M8 */
                  pr_default.execute(6, new Object[] {A203BarPieKil, A205BarPieMet, Integer.valueOf(A1501BarPiePie), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(5);
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A129BarCod = W129BarCod ;
            A132BarCodReo = W132BarCodReo ;
            A130BarCodPar = W130BarCodPar ;
            A203BarPieKil = W203BarPieKil ;
            A205BarPieMet = W205BarPieMet ;
            A1501BarPiePie = W1501BarPiePie ;
            A9795BarPieK1 = W9795BarPieK1 ;
            n9795BarPieK1 = false ;
            A9798BarPz1 = W9798BarPz1 ;
            n9798BarPz1 = false ;
            A9800BarNPes = W9800BarNPes ;
            n9800BarNPes = false ;
            /* End Insert */
            if ( ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV28Kilos2)==0) && ( GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "K", "")) == 0 ) ) || ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV27Metros2)==0) && ( GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "M", "")) == 0 ) ) )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               /* Using cursor P006M9 */
               pr_default.execute(7, new Object[] {Integer.valueOf(A1501BarPiePie), A205BarPieMet, A203BarPieKil, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
               if (true) break;
            }
            /* Using cursor P006M10 */
            pr_default.execute(8, new Object[] {Integer.valueOf(A1501BarPiePie), A205BarPieMet, A203BarPieKil, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
            A129BarCod = W129BarCod ;
            A132BarCodReo = W132BarCodReo ;
            A130BarCodPar = W130BarCodPar ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = preopeh.this.A396EmprCod;
      this.aP1[0] = preopeh.this.AV15BarCodOri;
      this.aP2[0] = preopeh.this.AV16BarReoOri;
      this.aP3[0] = preopeh.this.AV17BarParOri;
      this.aP4[0] = preopeh.this.AV18BarCodDes;
      this.aP5[0] = preopeh.this.AV19BarReoDes;
      this.aP6[0] = preopeh.this.AV20BarParDes;
      this.aP7[0] = preopeh.this.AV21Conos;
      this.aP8[0] = preopeh.this.AV22Kilos;
      this.aP9[0] = preopeh.this.AV23Metros;
      Application.commitDataStores(context, remoteHandle, pr_default, "preopeh");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV37Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV38EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV39UsurCod = "" ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new byte[1] ;
      AV27Metros2 = DecimalUtil.ZERO ;
      AV28Kilos2 = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P006M2_A396EmprCod = new String[] {""} ;
      P006M2_A129BarCod = new int[1] ;
      P006M2_A132BarCodReo = new byte[1] ;
      P006M2_A130BarCodPar = new String[] {""} ;
      P006M2_A228BarUniMed = new String[] {""} ;
      P006M2_A213BarSit = new byte[1] ;
      P006M2_A120BarAgrEst = new String[] {""} ;
      A130BarCodPar = "" ;
      A228BarUniMed = "" ;
      A120BarAgrEst = "" ;
      W130BarCodPar = "" ;
      AV32BarUniMed = "" ;
      AV35BarAgrEst = "" ;
      P006M3_A396EmprCod = new String[] {""} ;
      P006M3_A129BarCod = new int[1] ;
      P006M3_A132BarCodReo = new byte[1] ;
      P006M3_A130BarCodPar = new String[] {""} ;
      P006M3_A9800BarNPes = new byte[1] ;
      P006M3_n9800BarNPes = new boolean[] {false} ;
      P006M3_A9798BarPz1 = new int[1] ;
      P006M3_n9798BarPz1 = new boolean[] {false} ;
      P006M3_A9795BarPieK1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006M3_n9795BarPieK1 = new boolean[] {false} ;
      P006M3_A1501BarPiePie = new int[1] ;
      P006M3_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006M3_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006M3_A13988BarPieVtx = new String[] {""} ;
      P006M3_A13519BarPieMq = new String[] {""} ;
      P006M3_n13519BarPieMq = new boolean[] {false} ;
      P006M3_A13518BarPieTurn = new byte[1] ;
      P006M3_n13518BarPieTurn = new boolean[] {false} ;
      P006M3_A13109BarPieST = new String[] {""} ;
      P006M3_n13109BarPieST = new boolean[] {false} ;
      P006M3_A13108BarPieLote = new String[] {""} ;
      P006M3_n13108BarPieLote = new boolean[] {false} ;
      P006M3_A13107BarPieEmp = new short[1] ;
      P006M3_n13107BarPieEmp = new boolean[] {false} ;
      P006M3_A13004BarPieDest = new byte[1] ;
      P006M3_n13004BarPieDest = new boolean[] {false} ;
      P006M3_A12992BarPieOpe = new int[1] ;
      P006M3_n12992BarPieOpe = new boolean[] {false} ;
      P006M3_A12936BarPieSecu = new String[] {""} ;
      P006M3_n12936BarPieSecu = new boolean[] {false} ;
      P006M3_A12935BarPieTono = new String[] {""} ;
      P006M3_n12935BarPieTono = new boolean[] {false} ;
      P006M3_A12928BarPieEncC = new String[] {""} ;
      P006M3_n12928BarPieEncC = new boolean[] {false} ;
      P006M3_A12927BarPieCoCN = new int[1] ;
      P006M3_n12927BarPieCoCN = new boolean[] {false} ;
      P006M3_A12926BarPieCoCI = new String[] {""} ;
      P006M3_n12926BarPieCoCI = new boolean[] {false} ;
      P006M3_A12925BarPieCliN = new String[] {""} ;
      P006M3_n12925BarPieCliN = new boolean[] {false} ;
      P006M3_A12924BarPieCliI = new int[1] ;
      P006M3_n12924BarPieCliI = new boolean[] {false} ;
      P006M3_A12923BarPieArtD = new String[] {""} ;
      P006M3_n12923BarPieArtD = new boolean[] {false} ;
      P006M3_A12922BarPieArtI = new String[] {""} ;
      P006M3_n12922BarPieArtI = new boolean[] {false} ;
      P006M3_A12921BarPieColN = new int[1] ;
      P006M3_n12921BarPieColN = new boolean[] {false} ;
      P006M3_A12920BarPieColD = new String[] {""} ;
      P006M3_n12920BarPieColD = new boolean[] {false} ;
      P006M3_A12912BarPieUltD = new short[1] ;
      P006M3_n12912BarPieUltD = new boolean[] {false} ;
      P006M3_A12911BarPieFep = new java.util.Date[] {GXutil.nullDate()} ;
      P006M3_n12911BarPieFep = new boolean[] {false} ;
      P006M3_A12780BarPieUsu = new String[] {""} ;
      P006M3_n12780BarPieUsu = new boolean[] {false} ;
      P006M3_A12779BarPieFdv = new java.util.Date[] {GXutil.nullDate()} ;
      P006M3_n12779BarPieFdv = new boolean[] {false} ;
      P006M3_A12113BarPieCLd = new byte[1] ;
      P006M3_n12113BarPieCLd = new boolean[] {false} ;
      P006M3_A1642BarPieOrd = new int[1] ;
      P006M3_n1642BarPieOrd = new boolean[] {false} ;
      P006M3_A6473BarUniB = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006M3_n6473BarUniB = new boolean[] {false} ;
      P006M3_A6472BarTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006M3_n6472BarTara = new boolean[] {false} ;
      P006M3_A1919BarPieObs = new String[] {""} ;
      P006M3_n1919BarPieObs = new boolean[] {false} ;
      P006M3_A9984BarPiePda = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006M3_n9984BarPiePda = new boolean[] {false} ;
      P006M3_A9846BarPieAncc = new short[1] ;
      P006M3_n9846BarPieAncc = new boolean[] {false} ;
      P006M3_A9799BarPz2 = new int[1] ;
      P006M3_n9799BarPz2 = new boolean[] {false} ;
      P006M3_A9796BarPieK2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006M3_n9796BarPieK2 = new boolean[] {false} ;
      P006M3_A8907PzaB80 = new String[] {""} ;
      P006M3_n8907PzaB80 = new boolean[] {false} ;
      P006M3_A8838CodBarPz = new String[] {""} ;
      P006M3_n8838CodBarPz = new boolean[] {false} ;
      P006M3_A8707BapieObs = new String[] {""} ;
      P006M3_n8707BapieObs = new boolean[] {false} ;
      P006M3_A6489BarPieIdPz = new String[] {""} ;
      P006M3_n6489BarPieIdPz = new boolean[] {false} ;
      P006M3_A6116BarPieImp = new String[] {""} ;
      P006M3_n6116BarPieImp = new boolean[] {false} ;
      P006M3_A3277BarPieAut = new short[1] ;
      P006M3_n3277BarPieAut = new boolean[] {false} ;
      P006M3_A3276BarMtsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006M3_n3276BarMtsAut = new boolean[] {false} ;
      P006M3_A3275BarKgsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006M3_n3275BarKgsAut = new boolean[] {false} ;
      P006M3_A2186BarPieLoc = new String[] {""} ;
      P006M3_n2186BarPieLoc = new boolean[] {false} ;
      P006M3_A1691BarPieAnc = new short[1] ;
      P006M3_n1691BarPieAnc = new boolean[] {false} ;
      P006M3_A1271BarPieLzd = new int[1] ;
      P006M3_A908PieOriCod = new String[] {""} ;
      P006M3_A197BarPConTro = new short[1] ;
      P006M3_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006M3_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006M3_A201BarPieEst = new byte[1] ;
      P006M3_A44AlbRecCod = new int[1] ;
      P006M3_A200BarPieCod = new String[] {""} ;
      A9795BarPieK1 = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A13988BarPieVtx = "" ;
      A13519BarPieMq = "" ;
      A13109BarPieST = "" ;
      A13108BarPieLote = "" ;
      A12936BarPieSecu = "" ;
      A12935BarPieTono = "" ;
      A12928BarPieEncC = "" ;
      A12926BarPieCoCI = "" ;
      A12925BarPieCliN = "" ;
      A12923BarPieArtD = "" ;
      A12922BarPieArtI = "" ;
      A12920BarPieColD = "" ;
      A12911BarPieFep = GXutil.nullDate() ;
      A12780BarPieUsu = "" ;
      A12779BarPieFdv = GXutil.nullDate() ;
      A6473BarUniB = DecimalUtil.ZERO ;
      A6472BarTara = DecimalUtil.ZERO ;
      A1919BarPieObs = "" ;
      A9984BarPiePda = DecimalUtil.ZERO ;
      A9796BarPieK2 = DecimalUtil.ZERO ;
      A8907PzaB80 = "" ;
      A8838CodBarPz = "" ;
      A8707BapieObs = "" ;
      A6489BarPieIdPz = "" ;
      A6116BarPieImp = "" ;
      A3276BarMtsAut = DecimalUtil.ZERO ;
      A3275BarKgsAut = DecimalUtil.ZERO ;
      A2186BarPieLoc = "" ;
      A908PieOriCod = "" ;
      A183BarMetLan = DecimalUtil.ZERO ;
      A170BarKilLan = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      AV36Inc_obs = "" ;
      AV44Pgmname = "" ;
      W203BarPieKil = DecimalUtil.ZERO ;
      W205BarPieMet = DecimalUtil.ZERO ;
      W9795BarPieK1 = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      P006M7_A396EmprCod = new String[] {""} ;
      P006M7_A129BarCod = new int[1] ;
      P006M7_A132BarCodReo = new byte[1] ;
      P006M7_A130BarCodPar = new String[] {""} ;
      P006M7_A200BarPieCod = new String[] {""} ;
      P006M7_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006M7_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006M7_A1501BarPiePie = new int[1] ;
      P006M7_A44AlbRecCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.preopeh__default(),
         new Object[] {
             new Object[] {
            P006M2_A396EmprCod, P006M2_A129BarCod, P006M2_A132BarCodReo, P006M2_A130BarCodPar, P006M2_A228BarUniMed, P006M2_A213BarSit, P006M2_A120BarAgrEst
            }
            , new Object[] {
            P006M3_A396EmprCod, P006M3_A129BarCod, P006M3_A132BarCodReo, P006M3_A130BarCodPar, P006M3_A9800BarNPes, P006M3_n9800BarNPes, P006M3_A9798BarPz1, P006M3_n9798BarPz1, P006M3_A9795BarPieK1, P006M3_n9795BarPieK1,
            P006M3_A1501BarPiePie, P006M3_A205BarPieMet, P006M3_A203BarPieKil, P006M3_A13988BarPieVtx, P006M3_A13519BarPieMq, P006M3_n13519BarPieMq, P006M3_A13518BarPieTurn, P006M3_n13518BarPieTurn, P006M3_A13109BarPieST, P006M3_n13109BarPieST,
            P006M3_A13108BarPieLote, P006M3_n13108BarPieLote, P006M3_A13107BarPieEmp, P006M3_n13107BarPieEmp, P006M3_A13004BarPieDest, P006M3_n13004BarPieDest, P006M3_A12992BarPieOpe, P006M3_n12992BarPieOpe, P006M3_A12936BarPieSecu, P006M3_n12936BarPieSecu,
            P006M3_A12935BarPieTono, P006M3_n12935BarPieTono, P006M3_A12928BarPieEncC, P006M3_n12928BarPieEncC, P006M3_A12927BarPieCoCN, P006M3_n12927BarPieCoCN, P006M3_A12926BarPieCoCI, P006M3_n12926BarPieCoCI, P006M3_A12925BarPieCliN, P006M3_n12925BarPieCliN,
            P006M3_A12924BarPieCliI, P006M3_n12924BarPieCliI, P006M3_A12923BarPieArtD, P006M3_n12923BarPieArtD, P006M3_A12922BarPieArtI, P006M3_n12922BarPieArtI, P006M3_A12921BarPieColN, P006M3_n12921BarPieColN, P006M3_A12920BarPieColD, P006M3_n12920BarPieColD,
            P006M3_A12912BarPieUltD, P006M3_n12912BarPieUltD, P006M3_A12911BarPieFep, P006M3_n12911BarPieFep, P006M3_A12780BarPieUsu, P006M3_n12780BarPieUsu, P006M3_A12779BarPieFdv, P006M3_n12779BarPieFdv, P006M3_A12113BarPieCLd, P006M3_n12113BarPieCLd,
            P006M3_A1642BarPieOrd, P006M3_n1642BarPieOrd, P006M3_A6473BarUniB, P006M3_n6473BarUniB, P006M3_A6472BarTara, P006M3_n6472BarTara, P006M3_A1919BarPieObs, P006M3_n1919BarPieObs, P006M3_A9984BarPiePda, P006M3_n9984BarPiePda,
            P006M3_A9846BarPieAncc, P006M3_n9846BarPieAncc, P006M3_A9799BarPz2, P006M3_n9799BarPz2, P006M3_A9796BarPieK2, P006M3_n9796BarPieK2, P006M3_A8907PzaB80, P006M3_n8907PzaB80, P006M3_A8838CodBarPz, P006M3_n8838CodBarPz,
            P006M3_A8707BapieObs, P006M3_n8707BapieObs, P006M3_A6489BarPieIdPz, P006M3_n6489BarPieIdPz, P006M3_A6116BarPieImp, P006M3_n6116BarPieImp, P006M3_A3277BarPieAut, P006M3_n3277BarPieAut, P006M3_A3276BarMtsAut, P006M3_n3276BarMtsAut,
            P006M3_A3275BarKgsAut, P006M3_n3275BarKgsAut, P006M3_A2186BarPieLoc, P006M3_n2186BarPieLoc, P006M3_A1691BarPieAnc, P006M3_n1691BarPieAnc, P006M3_A1271BarPieLzd, P006M3_A908PieOriCod, P006M3_A197BarPConTro, P006M3_A183BarMetLan,
            P006M3_A170BarKilLan, P006M3_A201BarPieEst, P006M3_A44AlbRecCod, P006M3_A200BarPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P006M7_A396EmprCod, P006M7_A129BarCod, P006M7_A132BarCodReo, P006M7_A130BarCodPar, P006M7_A200BarPieCod, P006M7_A203BarPieKil, P006M7_A205BarPieMet, P006M7_A1501BarPiePie, P006M7_A44AlbRecCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      AV44Pgmname = "PREOPEH" ;
      /* GeneXus formulas. */
      AV44Pgmname = "PREOPEH" ;
      Gx_err = (short)(0) ;
   }

   private byte AV16BarReoOri ;
   private byte AV19BarReoDes ;
   private byte AV30FlagJBurgo ;
   private byte GXv_int5[] ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte W132BarCodReo ;
   private byte AV33BarSitOri ;
   private byte A9800BarNPes ;
   private byte A13518BarPieTurn ;
   private byte A13004BarPieDest ;
   private byte A12113BarPieCLd ;
   private byte A201BarPieEst ;
   private byte W9800BarNPes ;
   private short A13107BarPieEmp ;
   private short A12912BarPieUltD ;
   private short A9846BarPieAncc ;
   private short A3277BarPieAut ;
   private short A1691BarPieAnc ;
   private short A197BarPConTro ;
   private short Gx_err ;
   private int AV15BarCodOri ;
   private int AV18BarCodDes ;
   private int AV21Conos ;
   private int AV29Conos2 ;
   private int A129BarCod ;
   private int W129BarCod ;
   private int A9798BarPz1 ;
   private int A1501BarPiePie ;
   private int A12992BarPieOpe ;
   private int A12927BarPieCoCN ;
   private int A12924BarPieCliI ;
   private int A12921BarPieColN ;
   private int A1642BarPieOrd ;
   private int A9799BarPz2 ;
   private int A1271BarPieLzd ;
   private int A44AlbRecCod ;
   private int GX_INS18 ;
   private int W1501BarPiePie ;
   private int W9798BarPz1 ;
   private java.math.BigDecimal AV22Kilos ;
   private java.math.BigDecimal AV23Metros ;
   private java.math.BigDecimal AV27Metros2 ;
   private java.math.BigDecimal AV28Kilos2 ;
   private java.math.BigDecimal A9795BarPieK1 ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A6473BarUniB ;
   private java.math.BigDecimal A6472BarTara ;
   private java.math.BigDecimal A9984BarPiePda ;
   private java.math.BigDecimal A9796BarPieK2 ;
   private java.math.BigDecimal A3276BarMtsAut ;
   private java.math.BigDecimal A3275BarKgsAut ;
   private java.math.BigDecimal A183BarMetLan ;
   private java.math.BigDecimal A170BarKilLan ;
   private java.math.BigDecimal W203BarPieKil ;
   private java.math.BigDecimal W205BarPieMet ;
   private java.math.BigDecimal W9795BarPieK1 ;
   private String A396EmprCod ;
   private String AV17BarParOri ;
   private String AV20BarParDes ;
   private String AV37Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV38EmprNom ;
   private String GXv_char3[] ;
   private String AV39UsurCod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A228BarUniMed ;
   private String A120BarAgrEst ;
   private String W130BarCodPar ;
   private String AV32BarUniMed ;
   private String AV35BarAgrEst ;
   private String A13988BarPieVtx ;
   private String A13519BarPieMq ;
   private String A13109BarPieST ;
   private String A13108BarPieLote ;
   private String A12936BarPieSecu ;
   private String A12935BarPieTono ;
   private String A12928BarPieEncC ;
   private String A12926BarPieCoCI ;
   private String A12925BarPieCliN ;
   private String A12923BarPieArtD ;
   private String A12922BarPieArtI ;
   private String A12920BarPieColD ;
   private String A12780BarPieUsu ;
   private String A1919BarPieObs ;
   private String A8907PzaB80 ;
   private String A8838CodBarPz ;
   private String A8707BapieObs ;
   private String A6489BarPieIdPz ;
   private String A6116BarPieImp ;
   private String A2186BarPieLoc ;
   private String A908PieOriCod ;
   private String A200BarPieCod ;
   private String AV44Pgmname ;
   private String Gx_emsg ;
   private java.util.Date A12911BarPieFep ;
   private java.util.Date A12779BarPieFdv ;
   private boolean n9800BarNPes ;
   private boolean n9798BarPz1 ;
   private boolean n9795BarPieK1 ;
   private boolean n13519BarPieMq ;
   private boolean n13518BarPieTurn ;
   private boolean n13109BarPieST ;
   private boolean n13108BarPieLote ;
   private boolean n13107BarPieEmp ;
   private boolean n13004BarPieDest ;
   private boolean n12992BarPieOpe ;
   private boolean n12936BarPieSecu ;
   private boolean n12935BarPieTono ;
   private boolean n12928BarPieEncC ;
   private boolean n12927BarPieCoCN ;
   private boolean n12926BarPieCoCI ;
   private boolean n12925BarPieCliN ;
   private boolean n12924BarPieCliI ;
   private boolean n12923BarPieArtD ;
   private boolean n12922BarPieArtI ;
   private boolean n12921BarPieColN ;
   private boolean n12920BarPieColD ;
   private boolean n12912BarPieUltD ;
   private boolean n12911BarPieFep ;
   private boolean n12780BarPieUsu ;
   private boolean n12779BarPieFdv ;
   private boolean n12113BarPieCLd ;
   private boolean n1642BarPieOrd ;
   private boolean n6473BarUniB ;
   private boolean n6472BarTara ;
   private boolean n1919BarPieObs ;
   private boolean n9984BarPiePda ;
   private boolean n9846BarPieAncc ;
   private boolean n9799BarPz2 ;
   private boolean n9796BarPieK2 ;
   private boolean n8907PzaB80 ;
   private boolean n8838CodBarPz ;
   private boolean n8707BapieObs ;
   private boolean n6489BarPieIdPz ;
   private boolean n6116BarPieImp ;
   private boolean n3277BarPieAut ;
   private boolean n3276BarMtsAut ;
   private boolean n3275BarKgsAut ;
   private boolean n2186BarPieLoc ;
   private boolean n1691BarPieAnc ;
   private String AV36Inc_obs ;
   private java.math.BigDecimal[] aP9 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private int[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P006M2_A396EmprCod ;
   private int[] P006M2_A129BarCod ;
   private byte[] P006M2_A132BarCodReo ;
   private String[] P006M2_A130BarCodPar ;
   private String[] P006M2_A228BarUniMed ;
   private byte[] P006M2_A213BarSit ;
   private String[] P006M2_A120BarAgrEst ;
   private String[] P006M3_A396EmprCod ;
   private int[] P006M3_A129BarCod ;
   private byte[] P006M3_A132BarCodReo ;
   private String[] P006M3_A130BarCodPar ;
   private byte[] P006M3_A9800BarNPes ;
   private boolean[] P006M3_n9800BarNPes ;
   private int[] P006M3_A9798BarPz1 ;
   private boolean[] P006M3_n9798BarPz1 ;
   private java.math.BigDecimal[] P006M3_A9795BarPieK1 ;
   private boolean[] P006M3_n9795BarPieK1 ;
   private int[] P006M3_A1501BarPiePie ;
   private java.math.BigDecimal[] P006M3_A205BarPieMet ;
   private java.math.BigDecimal[] P006M3_A203BarPieKil ;
   private String[] P006M3_A13988BarPieVtx ;
   private String[] P006M3_A13519BarPieMq ;
   private boolean[] P006M3_n13519BarPieMq ;
   private byte[] P006M3_A13518BarPieTurn ;
   private boolean[] P006M3_n13518BarPieTurn ;
   private String[] P006M3_A13109BarPieST ;
   private boolean[] P006M3_n13109BarPieST ;
   private String[] P006M3_A13108BarPieLote ;
   private boolean[] P006M3_n13108BarPieLote ;
   private short[] P006M3_A13107BarPieEmp ;
   private boolean[] P006M3_n13107BarPieEmp ;
   private byte[] P006M3_A13004BarPieDest ;
   private boolean[] P006M3_n13004BarPieDest ;
   private int[] P006M3_A12992BarPieOpe ;
   private boolean[] P006M3_n12992BarPieOpe ;
   private String[] P006M3_A12936BarPieSecu ;
   private boolean[] P006M3_n12936BarPieSecu ;
   private String[] P006M3_A12935BarPieTono ;
   private boolean[] P006M3_n12935BarPieTono ;
   private String[] P006M3_A12928BarPieEncC ;
   private boolean[] P006M3_n12928BarPieEncC ;
   private int[] P006M3_A12927BarPieCoCN ;
   private boolean[] P006M3_n12927BarPieCoCN ;
   private String[] P006M3_A12926BarPieCoCI ;
   private boolean[] P006M3_n12926BarPieCoCI ;
   private String[] P006M3_A12925BarPieCliN ;
   private boolean[] P006M3_n12925BarPieCliN ;
   private int[] P006M3_A12924BarPieCliI ;
   private boolean[] P006M3_n12924BarPieCliI ;
   private String[] P006M3_A12923BarPieArtD ;
   private boolean[] P006M3_n12923BarPieArtD ;
   private String[] P006M3_A12922BarPieArtI ;
   private boolean[] P006M3_n12922BarPieArtI ;
   private int[] P006M3_A12921BarPieColN ;
   private boolean[] P006M3_n12921BarPieColN ;
   private String[] P006M3_A12920BarPieColD ;
   private boolean[] P006M3_n12920BarPieColD ;
   private short[] P006M3_A12912BarPieUltD ;
   private boolean[] P006M3_n12912BarPieUltD ;
   private java.util.Date[] P006M3_A12911BarPieFep ;
   private boolean[] P006M3_n12911BarPieFep ;
   private String[] P006M3_A12780BarPieUsu ;
   private boolean[] P006M3_n12780BarPieUsu ;
   private java.util.Date[] P006M3_A12779BarPieFdv ;
   private boolean[] P006M3_n12779BarPieFdv ;
   private byte[] P006M3_A12113BarPieCLd ;
   private boolean[] P006M3_n12113BarPieCLd ;
   private int[] P006M3_A1642BarPieOrd ;
   private boolean[] P006M3_n1642BarPieOrd ;
   private java.math.BigDecimal[] P006M3_A6473BarUniB ;
   private boolean[] P006M3_n6473BarUniB ;
   private java.math.BigDecimal[] P006M3_A6472BarTara ;
   private boolean[] P006M3_n6472BarTara ;
   private String[] P006M3_A1919BarPieObs ;
   private boolean[] P006M3_n1919BarPieObs ;
   private java.math.BigDecimal[] P006M3_A9984BarPiePda ;
   private boolean[] P006M3_n9984BarPiePda ;
   private short[] P006M3_A9846BarPieAncc ;
   private boolean[] P006M3_n9846BarPieAncc ;
   private int[] P006M3_A9799BarPz2 ;
   private boolean[] P006M3_n9799BarPz2 ;
   private java.math.BigDecimal[] P006M3_A9796BarPieK2 ;
   private boolean[] P006M3_n9796BarPieK2 ;
   private String[] P006M3_A8907PzaB80 ;
   private boolean[] P006M3_n8907PzaB80 ;
   private String[] P006M3_A8838CodBarPz ;
   private boolean[] P006M3_n8838CodBarPz ;
   private String[] P006M3_A8707BapieObs ;
   private boolean[] P006M3_n8707BapieObs ;
   private String[] P006M3_A6489BarPieIdPz ;
   private boolean[] P006M3_n6489BarPieIdPz ;
   private String[] P006M3_A6116BarPieImp ;
   private boolean[] P006M3_n6116BarPieImp ;
   private short[] P006M3_A3277BarPieAut ;
   private boolean[] P006M3_n3277BarPieAut ;
   private java.math.BigDecimal[] P006M3_A3276BarMtsAut ;
   private boolean[] P006M3_n3276BarMtsAut ;
   private java.math.BigDecimal[] P006M3_A3275BarKgsAut ;
   private boolean[] P006M3_n3275BarKgsAut ;
   private String[] P006M3_A2186BarPieLoc ;
   private boolean[] P006M3_n2186BarPieLoc ;
   private short[] P006M3_A1691BarPieAnc ;
   private boolean[] P006M3_n1691BarPieAnc ;
   private int[] P006M3_A1271BarPieLzd ;
   private String[] P006M3_A908PieOriCod ;
   private short[] P006M3_A197BarPConTro ;
   private java.math.BigDecimal[] P006M3_A183BarMetLan ;
   private java.math.BigDecimal[] P006M3_A170BarKilLan ;
   private byte[] P006M3_A201BarPieEst ;
   private int[] P006M3_A44AlbRecCod ;
   private String[] P006M3_A200BarPieCod ;
   private String[] P006M7_A396EmprCod ;
   private int[] P006M7_A129BarCod ;
   private byte[] P006M7_A132BarCodReo ;
   private String[] P006M7_A130BarCodPar ;
   private String[] P006M7_A200BarPieCod ;
   private java.math.BigDecimal[] P006M7_A203BarPieKil ;
   private java.math.BigDecimal[] P006M7_A205BarPieMet ;
   private int[] P006M7_A1501BarPiePie ;
   private int[] P006M7_A44AlbRecCod ;
}

final  class preopeh__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P006M2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarUniMed, BarSit, BarAgrEst FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P006M3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarNPes, BarPz1, BarPieK1, BarPiePie, BarPieMet, BarPieKil, BarPieVtx, BarPieMq, BarPieTurn, BarPieST, BarPieLote, BarPieEmp, BarPieDest, BarPieOpe, BarPieSecu, BarPieTono, BarPieEncC, BarPieCoCN, BarPieCoCI, BarPieCliN, BarPieCliI, BarPieArtD, BarPieArtI, BarPieColN, BarPieColD, BarPieUltD, BarPieFep, BarPieUsu, BarPieFdv, BarPieCLd, BarPieOrd, BarUniB, BarTara, BarPieObs, BarPiePda, BarPieAncc, BarPz2, BarPieK2, PzaB80, CodBarPz, BapieObs, BarPieIdPz, BarPieImp, BarPieAut, BarMtsAut, BarKgsAut, BarPieLoc, BarPieAnc, BarPieLzd, PieOriCod, BarPConTro, BarMetLan, BarKilLan, BarPieEst, AlbRecCod, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P006M4", "DELETE FROM TXPBARPIE  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P006M5", "DELETE FROM TXPBARPIE  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P006M6", "INSERT INTO TXPBARPIE(EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbRecCod, BarPieKil, BarPieMet, BarPieEst, BarKilLan, BarMetLan, BarPConTro, PieOriCod, BarPieLzd, BarPiePie, BarPieAnc, BarPieLoc, BarKgsAut, BarMtsAut, BarPieAut, BarPieImp, BarPieIdPz, BapieObs, CodBarPz, PzaB80, BarPieK1, BarPieK2, BarPz1, BarPz2, BarNPes, BarPieAncc, BarPiePda, BarPieObs, BarTara, BarUniB, BarPieOrd, BarPieCLd, BarPieFdv, BarPieUsu, BarPieFep, BarPieUltD, BarPieColD, BarPieColN, BarPieArtI, BarPieArtD, BarPieCliI, BarPieCliN, BarPieCoCI, BarPieCoCN, BarPieEncC, BarPieTono, BarPieSecu, BarPieOpe, BarPieDest, BarPieEmp, BarPieLote, BarPieST, BarPieTurn, BarPieMq, BarPieVtx) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new ForEachCursor("P006M7", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarPieKil, BarPieMet, BarPiePie, AlbRecCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P006M8", "UPDATE TXPBARPIE SET BarPieKil=?, BarPieMet=?, BarPiePie=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P006M9", "UPDATE TXPBARPIE SET BarPiePie=?, BarPieMet=?, BarPieKil=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P006M10", "UPDATE TXPBARPIE SET BarPiePie=?, BarPieMet=?, BarPieKil=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
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
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[13])[0] = rslt.getString(11, 20);
               ((String[]) buf[14])[0] = rslt.getString(12, 6);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(13);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(14, 20);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(15, 20);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(16);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((byte[]) buf[24])[0] = rslt.getByte(17);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((int[]) buf[26])[0] = rslt.getInt(18);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(19, 10);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(20, 10);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(21, 20);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((int[]) buf[34])[0] = rslt.getInt(22);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(23, 13);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(24, 60);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((int[]) buf[40])[0] = rslt.getInt(25);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(26, 26);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getString(27, 16);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((int[]) buf[46])[0] = rslt.getInt(28);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(29, 13);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((short[]) buf[50])[0] = rslt.getShort(30);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[52])[0] = rslt.getGXDate(31);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getString(32, 10);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[56])[0] = rslt.getGXDate(33);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((byte[]) buf[58])[0] = rslt.getByte(34);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((int[]) buf[60])[0] = rslt.getInt(35);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[62])[0] = rslt.getBigDecimal(36,2);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[64])[0] = rslt.getBigDecimal(37,2);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((String[]) buf[66])[0] = rslt.getString(38, 60);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[68])[0] = rslt.getBigDecimal(39,2);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((short[]) buf[70])[0] = rslt.getShort(40);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((int[]) buf[72])[0] = rslt.getInt(41);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[74])[0] = rslt.getBigDecimal(42,2);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((String[]) buf[76])[0] = rslt.getString(43, 9);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((String[]) buf[78])[0] = rslt.getString(44, 20);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((String[]) buf[80])[0] = rslt.getString(45, 40);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((String[]) buf[82])[0] = rslt.getString(46, 15);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((String[]) buf[84])[0] = rslt.getString(47, 1);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((short[]) buf[86])[0] = rslt.getShort(48);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[88])[0] = rslt.getBigDecimal(49,2);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[90])[0] = rslt.getBigDecimal(50,2);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((String[]) buf[92])[0] = rslt.getString(51, 10);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((short[]) buf[94])[0] = rslt.getShort(52);
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               ((int[]) buf[96])[0] = rslt.getInt(53);
               ((String[]) buf[97])[0] = rslt.getString(54, 9);
               ((short[]) buf[98])[0] = rslt.getShort(55);
               ((java.math.BigDecimal[]) buf[99])[0] = rslt.getBigDecimal(56,2);
               ((java.math.BigDecimal[]) buf[100])[0] = rslt.getBigDecimal(57,2);
               ((byte[]) buf[101])[0] = rslt.getByte(58);
               ((int[]) buf[102])[0] = rslt.getInt(59);
               ((String[]) buf[103])[0] = rslt.getString(60, 9);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 2);
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               stmt.setString(13, (String)parms[12], 9);
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setInt(15, ((Number) parms[14]).intValue());
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[16]).shortValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[18], 10);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[24]).shortValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[26], 1);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[28], 15);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[30], 40);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[32], 20);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[34], 9);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(26, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(27, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(28, ((Number) parms[40]).intValue());
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(29, ((Number) parms[42]).intValue());
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(30, ((Number) parms[44]).byteValue());
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(31, ((Number) parms[46]).shortValue());
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(32, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[50], 60);
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(34, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(35, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(36, ((Number) parms[56]).intValue());
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(37, ((Number) parms[58]).byteValue());
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.DATE );
               }
               else
               {
                  stmt.setDate(38, (java.util.Date)parms[60]);
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(39, (String)parms[62], 10);
               }
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.DATE );
               }
               else
               {
                  stmt.setDate(40, (java.util.Date)parms[64]);
               }
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(41, ((Number) parms[66]).shortValue());
               }
               if ( ((Boolean) parms[67]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(42, (String)parms[68], 13);
               }
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(43, ((Number) parms[70]).intValue());
               }
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(44, (String)parms[72], 16);
               }
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(45, (String)parms[74], 26);
               }
               if ( ((Boolean) parms[75]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(46, ((Number) parms[76]).intValue());
               }
               if ( ((Boolean) parms[77]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(47, (String)parms[78], 60);
               }
               if ( ((Boolean) parms[79]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(48, (String)parms[80], 13);
               }
               if ( ((Boolean) parms[81]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(49, ((Number) parms[82]).intValue());
               }
               if ( ((Boolean) parms[83]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(50, (String)parms[84], 20);
               }
               if ( ((Boolean) parms[85]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(51, (String)parms[86], 10);
               }
               if ( ((Boolean) parms[87]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(52, (String)parms[88], 10);
               }
               if ( ((Boolean) parms[89]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(53, ((Number) parms[90]).intValue());
               }
               if ( ((Boolean) parms[91]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(54, ((Number) parms[92]).byteValue());
               }
               if ( ((Boolean) parms[93]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(55, ((Number) parms[94]).shortValue());
               }
               if ( ((Boolean) parms[95]).booleanValue() )
               {
                  stmt.setNull( 56 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(56, (String)parms[96], 20);
               }
               if ( ((Boolean) parms[97]).booleanValue() )
               {
                  stmt.setNull( 57 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(57, (String)parms[98], 20);
               }
               if ( ((Boolean) parms[99]).booleanValue() )
               {
                  stmt.setNull( 58 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(58, ((Number) parms[100]).byteValue());
               }
               if ( ((Boolean) parms[101]).booleanValue() )
               {
                  stmt.setNull( 59 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(59, (String)parms[102], 6);
               }
               stmt.setString(60, (String)parms[103], 20);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 6 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 9);
               return;
            case 7 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 9);
               return;
            case 8 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 9);
               return;
      }
   }

}

