package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcopfas extends GXProcedure
{
   public pcopfas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcopfas.class ), "" );
   }

   public pcopfas( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 )
   {
      pcopfas.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 )
   {
      pcopfas.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcopfas.this.AV15AlbProCod = aP1[0];
      this.aP1 = aP1;
      pcopfas.this.AV16BarCod = aP2[0];
      this.aP2 = aP2;
      pcopfas.this.AV17BarCodReo = aP3[0];
      this.aP3 = aP3;
      pcopfas.this.AV18BarCodPar = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV63Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pcopfas.this.GXt_char1 = GXv_char2[0] ;
      AV63Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV64EmprNom ;
      GXv_char4[0] = AV65UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV63Station, GXv_char2, GXv_char3, GXv_char4) ;
      pcopfas.this.A396EmprCod = GXv_char2[0] ;
      pcopfas.this.AV64EmprNom = GXv_char3[0] ;
      pcopfas.this.AV65UsurCod = GXv_char4[0] ;
      AV31Estamp = (byte)(0) ;
      GXv_int5[0] = AV31Estamp ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ESTAMP", ""), GXv_int5) ;
      pcopfas.this.AV31Estamp = GXv_int5[0] ;
      GXv_int5[0] = AV33F_nfases ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NFASES", ""), GXv_int5) ;
      pcopfas.this.AV33F_nfases = GXv_int5[0] ;
      GXv_int5[0] = AV34F_carvema ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int5) ;
      pcopfas.this.AV34F_carvema = GXv_int5[0] ;
      GXv_int5[0] = AV55Laminados ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "KLAMIN", ""), GXv_int5) ;
      pcopfas.this.AV55Laminados = GXv_int5[0] ;
      GXt_int6 = AV44Moda21 ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int5) ;
      pcopfas.this.GXt_int6 = GXv_int5[0] ;
      AV44Moda21 = GXt_int6 ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "GRAHDR", "") ;
      GXv_int7[0] = AV47ContVal ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int7) ;
      pcopfas.this.A396EmprCod = GXv_char4[0] ;
      pcopfas.this.AV47ContVal = GXv_int7[0] ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "PMLHDR", "") ;
      GXv_int7[0] = AV66ValPml ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int7) ;
      pcopfas.this.A396EmprCod = GXv_char4[0] ;
      pcopfas.this.AV66ValPml = GXv_int7[0] ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "PML500", "") ;
      GXv_int7[0] = AV73Pml500 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int7) ;
      pcopfas.this.A396EmprCod = GXv_char4[0] ;
      pcopfas.this.AV73Pml500 = GXv_int7[0] ;
      GXt_int6 = AV68Grm2Control ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ERGRM2", ""), GXv_int5) ;
      pcopfas.this.GXt_int6 = GXv_int5[0] ;
      AV68Grm2Control = GXt_int6 ;
      GXt_int8 = AV69vGrm2 ;
      GXv_int7[0] = GXt_int8 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ERGRM2", ""), GXv_int7) ;
      pcopfas.this.GXt_int8 = GXv_int7[0] ;
      AV69vGrm2 = (short)(GXt_int8) ;
      AV48GraHdr = (short)(AV47ContVal) ;
      GXt_int6 = AV56SinConFases ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SNFAS", ""), GXv_int5) ;
      pcopfas.this.GXt_int6 = GXv_int5[0] ;
      AV56SinConFases = GXt_int6 ;
      GXt_int6 = AV75PmlCliente ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PMLCLI", ""), GXv_int5) ;
      pcopfas.this.GXt_int6 = GXv_int5[0] ;
      AV75PmlCliente = GXt_int6 ;
      GXt_int6 = (byte)(AV84Tintutex) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINTUT", ""), GXv_int5) ;
      pcopfas.this.GXt_int6 = GXv_int5[0] ;
      AV84Tintutex = GXt_int6 ;
      AV50Entregas_p = (byte)(0) ;
      AV82Albaranmenor = 0 ;
      if ( AV44Moda21 == 1 )
      {
         /* Using cursor P00802 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A130BarCodPar = P00802_A130BarCodPar[0] ;
            A132BarCodReo = P00802_A132BarCodReo[0] ;
            A129BarCod = P00802_A129BarCod[0] ;
            A1261BarAlbKgmE = P00802_A1261BarAlbKgmE[0] ;
            A30AlbProCod = P00802_A30AlbProCod[0] ;
            if ( A30AlbProCod != AV15AlbProCod )
            {
               AV50Entregas_p = (byte)(AV50Entregas_p+1) ;
            }
            AV82Albaranmenor = (int)(((0==AV82Albaranmenor) ? A30AlbProCod : ((A30AlbProCod<AV82Albaranmenor) ? A30AlbProCod : AV82Albaranmenor))) ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
         AV50Entregas_p = (byte)(((0==AV50Entregas_p) ? 0 : ((AV15AlbProCod==AV82Albaranmenor) ? 0 : 1))) ;
      }
      AV36Kgs_lam = DecimalUtil.doubleToDec(0) ;
      AV37OrdLin = (short)(0) ;
      AV40BarAcc = httpContext.getMessage( "N", "") ;
      if ( AV55Laminados == 1 )
      {
         /* Using cursor P00803 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A130BarCodPar = P00803_A130BarCodPar[0] ;
            A132BarCodReo = P00803_A132BarCodReo[0] ;
            A129BarCod = P00803_A129BarCod[0] ;
            A1909BarGraAca = P00803_A1909BarGraAca[0] ;
            A2827BarKgsLot = P00803_A2827BarKgsLot[0] ;
            A5253BarAcc = P00803_A5253BarAcc[0] ;
            A361DisCod = P00803_A361DisCod[0] ;
            A2010BarTipDis = P00803_A2010BarTipDis[0] ;
            A252CliCod = P00803_A252CliCod[0] ;
            n252CliCod = P00803_n252CliCod[0] ;
            A212BarSer = P00803_A212BarSer[0] ;
            A135BarColNom = P00803_A135BarColNom[0] ;
            A136BarColNum = P00803_A136BarColNum[0] ;
            A218BarTipCol = P00803_A218BarTipCol[0] ;
            AV49BarGraAca = A1909BarGraAca ;
            AV36Kgs_lam = A2827BarKgsLot ;
            AV37OrdLin = (short)(9999) ;
            AV40BarAcc = A5253BarAcc ;
            AV41DisCod = A361DisCod ;
            AV53Bartipdis = A2010BarTipDis ;
            if ( ( AV34F_carvema == 1 ) && ( AV56SinConFases == 1 ) )
            {
               AV25CliCod = A252CliCod ;
               AV57Forser = A212BarSer ;
               AV58Forcolnom = A135BarColNom ;
               AV59Forcolnum = A136BarColNum ;
               AV60Tipcolcod = A218BarTipCol ;
               /* Execute user subroutine: 'CFORMU' */
               S141 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               AV62Inc_obs = httpContext.getMessage( "Control Color", "") + GXutil.newLine( ) + httpContext.getMessage( "Cliente=  ", "") + GXutil.trim( GXutil.str( AV25CliCod, 6, 0)) + GXutil.newLine( ) + httpContext.getMessage( "Articulo= ", "") + GXutil.trim( AV57Forser) + GXutil.newLine( ) + httpContext.getMessage( "Color   = ", "") + GXutil.trim( AV58Forcolnom) + " " + GXutil.trim( GXutil.str( AV59Forcolnum, 6, 0)) + GXutil.newLine( ) + httpContext.getMessage( "Tc      = ", "") + GXutil.trim( GXutil.str( AV60Tipcolcod, 2, 0)) + GXutil.newLine( ) + httpContext.getMessage( "&For_reo= ", "") + AV61For_reo + GXutil.newLine( ) ;
            }
            /* Execute user subroutine: 'DISPOS' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Using cursor P00804 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A150BarFacTin = P00804_A150BarFacTin[0] ;
               A194BarOrdLin = P00804_A194BarOrdLin[0] ;
               A758ProCod = P00804_A758ProCod[0] ;
               AV37OrdLin = A194BarOrdLin ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      if ( ( AV34F_carvema == 1 ) && ( AV56SinConFases == 1 ) && ( GXutil.strcmp(AV61For_reo, httpContext.getMessage( "N", "")) == 0 ) )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV91Pgmname, AV65UsurCod, AV63Station, AV62Inc_obs, AV16BarCod, AV17BarCodReo, AV18BarCodPar) ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( ( ( AV44Moda21 == 1 ) && ( GXutil.strcmp(AV40BarAcc, httpContext.getMessage( "S", "")) == 0 ) ) || ( ( AV44Moda21 == 1 ) && ( GXutil.strcmp(AV53Bartipdis, "L") == 0 ) && ( AV85DisPrePz.doubleValue() > 0 ) ) )
      {
         AV62Inc_obs = httpContext.getMessage( "MODA 21", "") + httpContext.getMessage( " Bartipdis= ", "") + AV53Bartipdis + httpContext.getMessage( " Precio Prenda= ", "") + localUtil.format( AV85DisPrePz, "ZZZZZZ9.99") + httpContext.getMessage( " &BarAcc= ", "") + AV40BarAcc ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV91Pgmname, AV65UsurCod, AV63Station, AV62Inc_obs, AV16BarCod, AV17BarCodReo, AV18BarCodPar) ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV20LinFas = (short)(0) ;
      /* Using cursor P00806 */
      pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(AV15AlbProCod), Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A130BarCodPar = P00806_A130BarCodPar[0] ;
         A132BarCodReo = P00806_A132BarCodReo[0] ;
         A129BarCod = P00806_A129BarCod[0] ;
         A30AlbProCod = P00806_A30AlbProCod[0] ;
         A1261BarAlbKgmE = P00806_A1261BarAlbKgmE[0] ;
         A1263BarAlbMtrE = P00806_A1263BarAlbMtrE[0] ;
         A12195BarAlbUnd = P00806_A12195BarAlbUnd[0] ;
         A1265BarAlbPie = P00806_A1265BarAlbPie[0] ;
         A5019AlbHdrgm2 = P00806_A5019AlbHdrgm2[0] ;
         A252CliCod = P00806_A252CliCod[0] ;
         n252CliCod = P00806_n252CliCod[0] ;
         A212BarSer = P00806_A212BarSer[0] ;
         A166BarKgm = P00806_A166BarKgm[0] ;
         A184BarMtr = P00806_A184BarMtr[0] ;
         A252CliCod = P00806_A252CliCod[0] ;
         n252CliCod = P00806_n252CliCod[0] ;
         A212BarSer = P00806_A212BarSer[0] ;
         A166BarKgm = P00806_A166BarKgm[0] ;
         A184BarMtr = P00806_A184BarMtr[0] ;
         AV78BarKgm = A166BarKgm ;
         AV79Barmtr = A184BarMtr ;
         AV27FasKgm = A1261BarAlbKgmE ;
         AV28FasMtr = A1263BarAlbMtrE ;
         AV70FasUnd = A12195BarAlbUnd ;
         AV35Pie_a = A1265BarAlbPie ;
         AV49BarGraAca = A5019AlbHdrgm2 ;
         AV67Pml = 0 ;
         if ( A1263BarAlbMtrE.doubleValue() > 0 )
         {
            AV67Pml = (int)(DecimalUtil.decToDouble(GXutil.roundDecimal( A1261BarAlbKgmE.multiply(DecimalUtil.doubleToDec(1000)).divide(A1263BarAlbMtrE, 18, java.math.RoundingMode.DOWN), 0))) ;
         }
         AV25CliCod = A252CliCod ;
         AV71Barser = A212BarSer ;
         /* Execute user subroutine: 'ARTICU' */
         S151 ();
         if ( returnInSub )
         {
            pr_default.close(3);
            pr_default.close(3);
            pr_default.close(3);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      /* Using cursor P00807 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A130BarCodPar = P00807_A130BarCodPar[0] ;
         A132BarCodReo = P00807_A132BarCodReo[0] ;
         A129BarCod = P00807_A129BarCod[0] ;
         A227BarUni = P00807_A227BarUni[0] ;
         A252CliCod = P00807_A252CliCod[0] ;
         n252CliCod = P00807_n252CliCod[0] ;
         A457FasCod = P00807_A457FasCod[0] ;
         A5648CliTipo = P00807_A5648CliTipo[0] ;
         A13291CliFacFm = P00807_A13291CliFacFm[0] ;
         A13292CliFacFmt = P00807_A13292CliFacFmt[0] ;
         A2010BarTipDis = P00807_A2010BarTipDis[0] ;
         A6173BarFasSec = P00807_A6173BarFasSec[0] ;
         n6173BarFasSec = P00807_n6173BarFasSec[0] ;
         A194BarOrdLin = P00807_A194BarOrdLin[0] ;
         A758ProCod = P00807_A758ProCod[0] ;
         A252CliCod = P00807_A252CliCod[0] ;
         n252CliCod = P00807_n252CliCod[0] ;
         A2010BarTipDis = P00807_A2010BarTipDis[0] ;
         A5648CliTipo = P00807_A5648CliTipo[0] ;
         A13291CliFacFm = P00807_A13291CliFacFm[0] ;
         A13292CliFacFmt = P00807_A13292CliFacFmt[0] ;
         AV25CliCod = A252CliCod ;
         AV24FasCod = A457FasCod ;
         AV74CliTipo = A5648CliTipo ;
         AV77CliFacFm = A13291CliFacFm ;
         AV76CliFacFmt = A13292CliFacFmt ;
         AV54Precio_Acc = (byte)(0) ;
         if ( AV44Moda21 == 1 )
         {
            /* Execute user subroutine: 'PREFAS' */
            S131 ();
            if ( returnInSub )
            {
               pr_default.close(4);
               pr_default.close(4);
               pr_default.close(4);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         AV38BarOrdLin = A194BarOrdLin ;
         AV53Bartipdis = A2010BarTipDis ;
         if ( ( ( AV44Moda21 == 1 ) && ( AV54Precio_Acc == 1 ) ) || ( GXutil.strcmp(A6173BarFasSec, "XX") == 0 ) )
         {
         }
         else
         {
            AV51Ok_precios = (byte)(1) ;
            if ( ( AV55Laminados == 1 ) && ( AV36Kgs_lam.doubleValue() > 0 ) )
            {
               AV51Ok_precios = (byte)(0) ;
               if ( ( AV38BarOrdLin < AV37OrdLin ) && ( AV50Entregas_p == 0 ) )
               {
                  AV51Ok_precios = (byte)(1) ;
               }
               if ( AV38BarOrdLin > AV37OrdLin )
               {
                  AV51Ok_precios = (byte)(1) ;
               }
            }
            if ( AV51Ok_precios == 1 )
            {
               /* Execute user subroutine: 'PRECIOS' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(4);
                  pr_default.close(4);
                  pr_default.close(4);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
      /* Using cursor P00808 */
      pr_default.execute(5, new Object[] {A396EmprCod, Long.valueOf(AV15AlbProCod), Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar, A396EmprCod, Long.valueOf(AV15AlbProCod), Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A130BarCodPar = P00808_A130BarCodPar[0] ;
         A132BarCodReo = P00808_A132BarCodReo[0] ;
         A129BarCod = P00808_A129BarCod[0] ;
         A30AlbProCod = P00808_A30AlbProCod[0] ;
         A1248GuiFasULin = P00808_A1248GuiFasULin[0] ;
         A6815BarPreFKg = P00808_A6815BarPreFKg[0] ;
         n6815BarPreFKg = P00808_n6815BarPreFKg[0] ;
         A6816BarPreFMt = P00808_A6816BarPreFMt[0] ;
         n6816BarPreFMt = P00808_n6816BarPreFMt[0] ;
         /* Using cursor P008010 */
         pr_default.execute(6, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(6) != 101) )
         {
            A6817AlbFasPKg = P008010_A6817AlbFasPKg[0] ;
            A6818AlbFasPMt = P008010_A6818AlbFasPMt[0] ;
         }
         else
         {
            A6817AlbFasPKg = DecimalUtil.doubleToDec(0) ;
            A6818AlbFasPMt = DecimalUtil.doubleToDec(0) ;
         }
         A1248GuiFasULin = AV20LinFas ;
         A6815BarPreFKg = A6817AlbFasPKg ;
         n6815BarPreFKg = false ;
         A6816BarPreFMt = A6818AlbFasPMt ;
         n6816BarPreFMt = false ;
         /* Using cursor P008011 */
         pr_default.execute(7, new Object[] {Short.valueOf(A1248GuiFasULin), Boolean.valueOf(n6815BarPreFKg), A6815BarPreFKg, Boolean.valueOf(n6816BarPreFMt), A6816BarPreFMt, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
      pr_default.close(6);
      if ( AV33F_nfases == 1 )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int9[0] = AV15AlbProCod ;
         GXv_int7[0] = AV16BarCod ;
         GXv_int5[0] = AV17BarCodReo ;
         GXv_char3[0] = AV18BarCodPar ;
         new app.pdalbfas(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_int7, GXv_int5, GXv_char3) ;
         pcopfas.this.A396EmprCod = GXv_char4[0] ;
         pcopfas.this.AV15AlbProCod = GXv_int9[0] ;
         pcopfas.this.AV16BarCod = GXv_int7[0] ;
         pcopfas.this.AV17BarCodReo = GXv_int5[0] ;
         pcopfas.this.AV18BarCodPar = GXv_char3[0] ;
      }
      AV83inc_obs2 = " " ;
      cleanup();
   }

   public void S111( )
   {
      /* 'PRECIOS' Routine */
      returnInSub = false ;
      /* Using cursor P008012 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(AV25CliCod), AV24FasCod});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A4903FasAcab = P008012_A4903FasAcab[0] ;
         n4903FasAcab = P008012_n4903FasAcab[0] ;
         A12577FasPreKgF = P008012_A12577FasPreKgF[0] ;
         n12577FasPreKgF = P008012_n12577FasPreKgF[0] ;
         A12576FasPreMt2 = P008012_A12576FasPreMt2[0] ;
         n12576FasPreMt2 = P008012_n12576FasPreMt2[0] ;
         A460FasDsc = P008012_A460FasDsc[0] ;
         A466FasPreKgm = P008012_A466FasPreKgm[0] ;
         n466FasPreKgm = P008012_n466FasPreKgm[0] ;
         A467FasPreMtr = P008012_A467FasPreMtr[0] ;
         n467FasPreMtr = P008012_n467FasPreMtr[0] ;
         A13587FasKgsEnt = P008012_A13587FasKgsEnt[0] ;
         n13587FasKgsEnt = P008012_n13587FasKgsEnt[0] ;
         A3615FasFacCod = P008012_A3615FasFacCod[0] ;
         n3615FasFacCod = P008012_n3615FasFacCod[0] ;
         A457FasCod = P008012_A457FasCod[0] ;
         A252CliCod = P008012_A252CliCod[0] ;
         n252CliCod = P008012_n252CliCod[0] ;
         A14258FasFactura = P008012_A14258FasFactura[0] ;
         A4903FasAcab = P008012_A4903FasAcab[0] ;
         n4903FasAcab = P008012_n4903FasAcab[0] ;
         A460FasDsc = P008012_A460FasDsc[0] ;
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A466FasPreKgm)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A467FasPreMtr)==0) && ( ( AV32FlagVt == 1 ) || ( AV39F_Tintwe == 1 ) || ( AV45Calvet.doubleValue() == 1 ) || ( AV46Magosa == 1 ) ) )
         {
            AV20LinFas = (short)(AV20LinFas+10) ;
            /*
               INSERT RECORD ON TABLE TXPALBFAS

            */
            A30AlbProCod = AV15AlbProCod ;
            A1240GuiFasLin = AV20LinFas ;
            A1241GuiFasPKg = A466FasPreKgm ;
            A1242GuiFasPMt = A467FasPreMtr ;
            if ( AV28FasMtr.doubleValue() == 0 )
            {
               A1242GuiFasPMt = DecimalUtil.doubleToDec(0) ;
            }
            if ( AV27FasKgm.doubleValue() == 0 )
            {
               A1241GuiFasPKg = DecimalUtil.doubleToDec(0) ;
            }
            A1275FasKgm = ((GXutil.strcmp(A13587FasKgsEnt, httpContext.getMessage( "S", ""))==0) ? AV78BarKgm : AV27FasKgm) ;
            A1276FasMtr = ((GXutil.strcmp(A13587FasKgsEnt, httpContext.getMessage( "S", ""))==0) ? AV79Barmtr : AV28FasMtr) ;
            A3272FasCodF = A3615FasFacCod ;
            n3272FasCodF = false ;
            /* Using cursor P008013 */
            pr_default.execute(9, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1240GuiFasLin), A457FasCod, A1241GuiFasPKg, A1242GuiFasPMt, A1275FasKgm, A1276FasMtr, Boolean.valueOf(n3272FasCodF), A3272FasCodF});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
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
            /* End Insert */
         }
         else
         {
            if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A466FasPreKgm)==0) || ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A467FasPreMtr)==0) )
            {
               if ( ( AV84Tintutex == 1 ) && ( GXutil.strcmp(A14258FasFactura, httpContext.getMessage( "N", "")) == 0 ) )
               {
               }
               else
               {
                  AV20LinFas = (short)(AV20LinFas+10) ;
                  /*
                     INSERT RECORD ON TABLE TXPALBFAS

                  */
                  A30AlbProCod = AV15AlbProCod ;
                  A1240GuiFasLin = AV20LinFas ;
                  A1241GuiFasPKg = A466FasPreKgm ;
                  A1242GuiFasPMt = A467FasPreMtr ;
                  if ( (0==AV31Estamp) )
                  {
                     if ( AV28FasMtr.doubleValue() == 0 )
                     {
                        A1242GuiFasPMt = DecimalUtil.doubleToDec(0) ;
                     }
                     if ( AV27FasKgm.doubleValue() == 0 )
                     {
                        A1241GuiFasPKg = DecimalUtil.doubleToDec(0) ;
                     }
                  }
                  if ( AV34F_carvema == 1 )
                  {
                     A1275FasKgm = DecimalUtil.doubleToDec(0) ;
                     A1276FasMtr = DecimalUtil.doubleToDec(0) ;
                     if ( A1241GuiFasPKg.doubleValue() > 0 )
                     {
                        A1275FasKgm = AV27FasKgm ;
                        if ( ( GXutil.strcmp(AV24FasCod, httpContext.getMessage( "EMBALAR", "")) == 0 ) && ( AV34F_carvema == 1 ) )
                        {
                           A1275FasKgm = DecimalUtil.doubleToDec(AV35Pie_a) ;
                        }
                     }
                     if ( A1242GuiFasPMt.doubleValue() > 0 )
                     {
                        A1276FasMtr = AV28FasMtr ;
                     }
                  }
                  else
                  {
                     A1275FasKgm = ((GXutil.strcmp(A13587FasKgsEnt, httpContext.getMessage( "S", ""))==0) ? AV78BarKgm : AV27FasKgm) ;
                     A1276FasMtr = ((GXutil.strcmp(A13587FasKgsEnt, httpContext.getMessage( "S", ""))==0) ? AV79Barmtr : AV28FasMtr) ;
                     AV83inc_obs2 = httpContext.getMessage( "Facturar kilos Entrada(FasKgsEnt)=", "") + A13587FasKgsEnt ;
                     AV83inc_obs2 += httpContext.getMessage( "/&BarKgm=", "") + GXutil.trim( GXutil.str( AV78BarKgm, 9, 2)) + httpContext.getMessage( "/&FasKgm=", "") + GXutil.trim( GXutil.str( AV27FasKgm, 9, 2)) ;
                     AV83inc_obs2 += httpContext.getMessage( "/&Barmtr=", "") + GXutil.trim( GXutil.str( AV79Barmtr, 9, 2)) + httpContext.getMessage( "/&FasMtr=", "") + GXutil.trim( GXutil.str( AV28FasMtr, 9, 2)) ;
                     AV83inc_obs2 += httpContext.getMessage( "/FasKgm=", "") + GXutil.trim( GXutil.str( A1275FasKgm, 9, 2)) + httpContext.getMessage( "/FasMtr=", "") + GXutil.trim( GXutil.str( A1276FasMtr, 9, 2)) ;
                     AV83inc_obs2 += httpContext.getMessage( "/&BarAcc=", "") + AV40BarAcc + httpContext.getMessage( "/FasAcab=", "") + A4903FasAcab ;
                  }
                  if ( ( AV55Laminados == 1 ) && ( AV36Kgs_lam.doubleValue() > 0 ) )
                  {
                     if ( AV38BarOrdLin < AV37OrdLin )
                     {
                        A1275FasKgm = AV36Kgs_lam ;
                     }
                  }
                  if ( ( AV44Moda21 == 1 ) && ( GXutil.strcmp(AV40BarAcc, httpContext.getMessage( "S", "")) == 0 ) )
                  {
                     A1241GuiFasPKg = AV42DisPreKgm ;
                     A1242GuiFasPMt = AV43DisPremtr ;
                  }
                  if ( ( AV44Moda21 == 1 ) && ( GXutil.strcmp(AV40BarAcc, httpContext.getMessage( "S", "")) != 0 ) )
                  {
                     if ( GXutil.strcmp(A4903FasAcab, httpContext.getMessage( "S", "")) == 0 )
                     {
                        if ( GXutil.strcmp(A12577FasPreKgF, httpContext.getMessage( "S", "")) == 0 )
                        {
                           A1275FasKgm = ((GXutil.strcmp(A13587FasKgsEnt, httpContext.getMessage( "S", ""))==0) ? AV78BarKgm : AV27FasKgm) ;
                           A1241GuiFasPKg = A466FasPreKgm ;
                           A1276FasMtr = DecimalUtil.doubleToDec(0) ;
                           A1242GuiFasPMt = DecimalUtil.doubleToDec(0) ;
                           if ( GXutil.strcmp(AV83inc_obs2, " ") == 0 )
                           {
                              AV83inc_obs2 = httpContext.getMessage( " &BarAcc=", "") + AV40BarAcc + "/" + httpContext.getMessage( "FasAcab=", "") + A4903FasAcab + "/" + httpContext.getMessage( "FasPreKgF=", "") + A12577FasPreKgF + "/" + httpContext.getMessage( "FasKgsEnt=", "") + A13587FasKgsEnt ;
                              AV83inc_obs2 += httpContext.getMessage( "/&BarKgm=", "") + GXutil.trim( GXutil.str( AV78BarKgm, 9, 2)) + httpContext.getMessage( "/&FasKgm=", "") + GXutil.trim( GXutil.str( AV27FasKgm, 9, 2)) + httpContext.getMessage( "/FasMtr=", "") + GXutil.str( A1276FasMtr, 9, 2) ;
                           }
                           else
                           {
                              AV83inc_obs2 += httpContext.getMessage( "/&BarAcc=", "") + AV40BarAcc + "/" + httpContext.getMessage( "FasAcab=", "") + A4903FasAcab + "/" + httpContext.getMessage( "FasPreKgF=", "") + A12577FasPreKgF + "/" + httpContext.getMessage( "FasKgsEnt=", "") + A13587FasKgsEnt ;
                              AV83inc_obs2 += httpContext.getMessage( "/&BarKgm=", "") + GXutil.trim( GXutil.str( AV78BarKgm, 9, 2)) + httpContext.getMessage( "/&FasKgm=", "") + GXutil.trim( GXutil.str( AV27FasKgm, 9, 2)) + httpContext.getMessage( "/FasMtr=", "") + GXutil.str( A1276FasMtr, 9, 2) ;
                           }
                        }
                        else
                        {
                           if ( ( AV67Pml <= AV66ValPml ) && ( AV66ValPml > 0 ) && ( AV67Pml > 0 ) )
                           {
                              A1275FasKgm = DecimalUtil.doubleToDec(0) ;
                              A1241GuiFasPKg = DecimalUtil.doubleToDec(0) ;
                              A1276FasMtr = ((GXutil.strcmp(A13587FasKgsEnt, httpContext.getMessage( "S", ""))==0) ? AV79Barmtr : AV28FasMtr) ;
                              A1242GuiFasPMt = A467FasPreMtr ;
                              if ( GXutil.strcmp(AV83inc_obs2, " ") == 0 )
                              {
                                 AV83inc_obs2 = httpContext.getMessage( "&Pml<=&ValPml and &ValPml>0 and &Pml>0/&BarAcc=", "") + AV40BarAcc + "/" + httpContext.getMessage( "FasAcab=", "") + A4903FasAcab + "/" + httpContext.getMessage( "FasPreKgF=", "") + A12577FasPreKgF + "/" + httpContext.getMessage( "FasKgsEnt=", "") + A13587FasKgsEnt ;
                                 AV83inc_obs2 += httpContext.getMessage( "/&BarKgm=", "") + GXutil.trim( GXutil.str( AV78BarKgm, 9, 2)) + httpContext.getMessage( "/&FasKgm=", "") + GXutil.trim( GXutil.str( AV27FasKgm, 9, 2)) + httpContext.getMessage( "/FasMtr=", "") + GXutil.str( A1276FasMtr, 9, 2) ;
                                 AV83inc_obs2 += httpContext.getMessage( "/&Pml=", "") + GXutil.trim( GXutil.str( AV67Pml, 8, 0)) + httpContext.getMessage( "/&ValPml=", "") + GXutil.trim( GXutil.str( AV66ValPml, 8, 0)) ;
                              }
                              else
                              {
                                 AV83inc_obs2 += httpContext.getMessage( "/&Pml<=&ValPml and &ValPml>0 and &Pml>0/&BarAcc=", "") + AV40BarAcc + "/" + httpContext.getMessage( "FasAcab=", "") + A4903FasAcab + "/" + httpContext.getMessage( "FasPreKgF=", "") + A12577FasPreKgF + "/" + httpContext.getMessage( "FasKgsEnt=", "") + A13587FasKgsEnt ;
                                 AV83inc_obs2 += httpContext.getMessage( "/&BarKgm=", "") + GXutil.trim( GXutil.str( AV78BarKgm, 9, 2)) + httpContext.getMessage( "/&FasKgm=", "") + GXutil.trim( GXutil.str( AV27FasKgm, 9, 2)) + httpContext.getMessage( "/FasMtr=", "") + GXutil.str( A1276FasMtr, 9, 2) ;
                                 AV83inc_obs2 += httpContext.getMessage( "/&Pml=", "") + GXutil.trim( GXutil.str( AV67Pml, 8, 0)) + httpContext.getMessage( "/&ValPml=", "") + GXutil.trim( GXutil.str( AV66ValPml, 8, 0)) ;
                              }
                           }
                           else
                           {
                              if ( ( ( AV75PmlCliente == 0 ) && ( AV67Pml >= AV73Pml500 ) && ( AV73Pml500 > 0 ) && ( AV67Pml > 0 ) && ( GXutil.strcmp(AV74CliTipo, httpContext.getMessage( "I", "")) == 0 ) ) || ( ( AV75PmlCliente == 1 ) && ( AV67Pml >= AV76CliFacFmt ) && ( AV76CliFacFmt > 0 ) && ( AV67Pml > 0 ) && ( GXutil.strcmp(AV77CliFacFm, httpContext.getMessage( "S", "")) == 0 ) ) )
                              {
                                 A1275FasKgm = DecimalUtil.doubleToDec(0) ;
                                 A1241GuiFasPKg = DecimalUtil.doubleToDec(0) ;
                                 A1276FasMtr = ((GXutil.strcmp(A13587FasKgsEnt, httpContext.getMessage( "S", ""))==0) ? AV79Barmtr : AV28FasMtr) ;
                                 A1242GuiFasPMt = A12576FasPreMt2 ;
                                 if ( GXutil.strcmp(AV83inc_obs2, " ") == 0 )
                                 {
                                    AV83inc_obs2 = httpContext.getMessage( "(&PmlCliente=0 and &Pml>=&Pml500 and &Pml500>0 and &Pml>0 and &CliTipo=I) or (&PmlCliente=1 and &Pml>=&CliFacFmt and &CliFacFmt>0 and &Pml>0 and &CliFacFm=S)", "") ;
                                    AV83inc_obs2 += httpContext.getMessage( "/&BarAcc=", "") + AV40BarAcc + "/" + httpContext.getMessage( "FasAcab=", "") + A4903FasAcab + "/" + httpContext.getMessage( "FasPreKgF=", "") + A12577FasPreKgF + "/" + httpContext.getMessage( "FasKgsEnt=", "") + A13587FasKgsEnt ;
                                    AV83inc_obs2 += httpContext.getMessage( "/&Barmtr=", "") + GXutil.trim( GXutil.str( AV79Barmtr, 9, 2)) + httpContext.getMessage( "/&FasMtr=", "") + GXutil.trim( GXutil.str( AV28FasMtr, 9, 2)) + httpContext.getMessage( "/FasMtr=", "") + GXutil.str( A1276FasMtr, 9, 2) + httpContext.getMessage( "/FasKgm=0", "") ;
                                    AV83inc_obs2 += httpContext.getMessage( "/&PmlCliente=", "") + GXutil.trim( GXutil.str( AV75PmlCliente, 1, 0)) + httpContext.getMessage( "/&Pml=", "") + GXutil.trim( GXutil.str( AV67Pml, 8, 0)) + httpContext.getMessage( "/&Pml500=", "") + GXutil.trim( GXutil.str( AV73Pml500, 8, 0)) + httpContext.getMessage( "/&CliTipo=", "") + AV74CliTipo ;
                                 }
                                 else
                                 {
                                    AV83inc_obs2 += "/" + httpContext.getMessage( "(&PmlCliente=0 and &Pml>=&Pml500 and &Pml500>0 and &Pml>0 and &CliTipo=I) or (&PmlCliente=1 and &Pml>=&CliFacFmt and &CliFacFmt>0 and &Pml>0 and &CliFacFm=S)", "") ;
                                    AV83inc_obs2 += httpContext.getMessage( "/&BarAcc=", "") + AV40BarAcc + "/" + httpContext.getMessage( "FasAcab=", "") + A4903FasAcab + "/" + httpContext.getMessage( "FasPreKgF=", "") + A12577FasPreKgF + "/" + httpContext.getMessage( "FasKgsEnt=", "") + A13587FasKgsEnt ;
                                    AV83inc_obs2 += httpContext.getMessage( "/&Barmtr=", "") + GXutil.trim( GXutil.str( AV79Barmtr, 9, 2)) + httpContext.getMessage( "/&FasMtr=", "") + GXutil.trim( GXutil.str( AV28FasMtr, 9, 2)) + httpContext.getMessage( "/FasMtr=", "") + GXutil.str( A1276FasMtr, 9, 2) + httpContext.getMessage( "/FasKgm=0", "") ;
                                    AV83inc_obs2 += httpContext.getMessage( "/&PmlCliente=", "") + GXutil.trim( GXutil.str( AV75PmlCliente, 1, 0)) + httpContext.getMessage( "/&Pml=", "") + GXutil.trim( GXutil.str( AV67Pml, 8, 0)) + httpContext.getMessage( "/&Pml500=", "") + GXutil.trim( GXutil.str( AV73Pml500, 8, 0)) + httpContext.getMessage( "/&CliTipo=", "") + AV74CliTipo ;
                                 }
                              }
                              else
                              {
                                 A1275FasKgm = ((GXutil.strcmp(A13587FasKgsEnt, httpContext.getMessage( "S", ""))==0) ? AV78BarKgm : AV27FasKgm) ;
                                 A1241GuiFasPKg = A466FasPreKgm ;
                                 A1276FasMtr = DecimalUtil.doubleToDec(0) ;
                                 A1242GuiFasPMt = DecimalUtil.doubleToDec(0) ;
                                 if ( GXutil.strcmp(AV83inc_obs2, " ") == 0 )
                                 {
                                    AV83inc_obs2 = httpContext.getMessage( "&BarAcc=", "") + AV40BarAcc + "/" + httpContext.getMessage( "FasAcab=", "") + A4903FasAcab + "/" + httpContext.getMessage( "FasPreKgF=", "") + A12577FasPreKgF + "/" + httpContext.getMessage( "FasKgsEnt=", "") + A13587FasKgsEnt ;
                                    AV83inc_obs2 += httpContext.getMessage( "/&BarKgm=", "") + GXutil.trim( GXutil.str( AV78BarKgm, 9, 2)) + httpContext.getMessage( "/&FasKgm=", "") + GXutil.trim( GXutil.str( AV27FasKgm, 9, 2)) + httpContext.getMessage( "/FasKgm=", "") + GXutil.str( A1275FasKgm, 9, 2) + httpContext.getMessage( "/FasMtr=0", "") ;
                                    AV83inc_obs2 += httpContext.getMessage( "/&PmlCliente=", "") + GXutil.trim( GXutil.str( AV75PmlCliente, 1, 0)) + httpContext.getMessage( "/&Pml=", "") + GXutil.trim( GXutil.str( AV67Pml, 8, 0)) + httpContext.getMessage( "/&Pml500=", "") + GXutil.trim( GXutil.str( AV73Pml500, 8, 0)) + httpContext.getMessage( "/&CliTipo=", "") + AV74CliTipo ;
                                 }
                                 else
                                 {
                                    AV83inc_obs2 += "/" + httpContext.getMessage( "&BarAcc=", "") + AV40BarAcc + "/" + httpContext.getMessage( "FasAcab=", "") + A4903FasAcab + "/" + httpContext.getMessage( "FasPreKgF=", "") + A12577FasPreKgF + "/" + httpContext.getMessage( "FasKgsEnt=", "") + A13587FasKgsEnt ;
                                    AV83inc_obs2 += httpContext.getMessage( "/&BarKgm=", "") + GXutil.trim( GXutil.str( AV78BarKgm, 9, 2)) + httpContext.getMessage( "/&FasKgm=", "") + GXutil.trim( GXutil.str( AV27FasKgm, 9, 2)) + httpContext.getMessage( "/FasKgm=", "") + GXutil.str( A1275FasKgm, 9, 2) + httpContext.getMessage( "/FasMtr=0", "") ;
                                    AV83inc_obs2 += httpContext.getMessage( "/&PmlCliente=", "") + GXutil.trim( GXutil.str( AV75PmlCliente, 1, 0)) + httpContext.getMessage( "/&Pml=", "") + GXutil.trim( GXutil.str( AV67Pml, 8, 0)) + httpContext.getMessage( "/&Pml500=", "") + GXutil.trim( GXutil.str( AV73Pml500, 8, 0)) + httpContext.getMessage( "/&CliTipo=", "") + AV74CliTipo ;
                                 }
                              }
                           }
                        }
                     }
                     else
                     {
                        A1275FasKgm = ((GXutil.strcmp(A13587FasKgsEnt, httpContext.getMessage( "S", ""))==0) ? AV78BarKgm : AV27FasKgm) ;
                        A1241GuiFasPKg = A466FasPreKgm ;
                        A1276FasMtr = DecimalUtil.doubleToDec(0) ;
                        A1242GuiFasPMt = DecimalUtil.doubleToDec(0) ;
                        if ( GXutil.strcmp(AV83inc_obs2, " ") == 0 )
                        {
                           AV83inc_obs2 = httpContext.getMessage( "&BarAcc=", "") + AV40BarAcc + "/" + httpContext.getMessage( "FasAcab=", "") + A4903FasAcab + "/" + httpContext.getMessage( "FasPreKgF=", "") + A12577FasPreKgF + "/" + httpContext.getMessage( "FasKgsEnt=", "") + A13587FasKgsEnt ;
                           AV83inc_obs2 += httpContext.getMessage( "/&BarKgm=", "") + GXutil.trim( GXutil.str( AV78BarKgm, 9, 2)) + httpContext.getMessage( "/&FasKgm=", "") + GXutil.trim( GXutil.str( AV27FasKgm, 9, 2)) + httpContext.getMessage( "/FasKgm=", "") + GXutil.str( A1275FasKgm, 9, 2) + httpContext.getMessage( "/FasMtr=0", "") ;
                           AV83inc_obs2 += httpContext.getMessage( "/&PmlCliente=", "") + GXutil.trim( GXutil.str( AV75PmlCliente, 1, 0)) + httpContext.getMessage( "/&Pml=", "") + GXutil.trim( GXutil.str( AV67Pml, 8, 0)) + httpContext.getMessage( "/&Pml500=", "") + GXutil.trim( GXutil.str( AV73Pml500, 8, 0)) + httpContext.getMessage( "/&CliTipo=", "") + AV74CliTipo ;
                        }
                        else
                        {
                           AV83inc_obs2 += "/" + httpContext.getMessage( "&BarAcc=", "") + AV40BarAcc + "/" + httpContext.getMessage( "FasAcab=", "") + A4903FasAcab + "/" + httpContext.getMessage( "FasPreKgF=", "") + A12577FasPreKgF + "/" + httpContext.getMessage( "FasKgsEnt=", "") + A13587FasKgsEnt ;
                           AV83inc_obs2 += httpContext.getMessage( "/&BarKgm=", "") + GXutil.trim( GXutil.str( AV78BarKgm, 9, 2)) + httpContext.getMessage( "/&FasKgm=", "") + GXutil.trim( GXutil.str( AV27FasKgm, 9, 2)) + httpContext.getMessage( "/FasKgm=", "") + GXutil.str( A1275FasKgm, 9, 2) + httpContext.getMessage( "/FasMtr=0", "") ;
                           AV83inc_obs2 += httpContext.getMessage( "/&PmlCliente=", "") + GXutil.trim( GXutil.str( AV75PmlCliente, 1, 0)) + httpContext.getMessage( "/&Pml=", "") + GXutil.trim( GXutil.str( AV67Pml, 8, 0)) + httpContext.getMessage( "/&Pml500=", "") + GXutil.trim( GXutil.str( AV73Pml500, 8, 0)) + httpContext.getMessage( "/&CliTipo=", "") + AV74CliTipo ;
                        }
                     }
                     if ( ( AV55Laminados == 1 ) && ( AV36Kgs_lam.doubleValue() > 0 ) )
                     {
                        if ( AV38BarOrdLin < AV37OrdLin )
                        {
                           A1275FasKgm = AV36Kgs_lam ;
                        }
                     }
                  }
                  A3272FasCodF = A3615FasFacCod ;
                  n3272FasCodF = false ;
                  if ( ( AV68Grm2Control == 1 ) && ( AV49BarGraAca > AV69vGrm2 ) )
                  {
                     A1276FasMtr = DecimalUtil.doubleToDec(0) ;
                     if ( GXutil.strcmp(AV83inc_obs2, " ") == 0 )
                     {
                        AV83inc_obs2 = httpContext.getMessage( "&Grm2Control=1 AND &BarGraAca>&vGrm2", "") ;
                        AV83inc_obs2 += httpContext.getMessage( "/FasMtr=0", "") ;
                     }
                     else
                     {
                        AV83inc_obs2 += "/" + httpContext.getMessage( "&Grm2Control=1 AND &BarGraAca>&vGrm2", "") ;
                        AV83inc_obs2 += httpContext.getMessage( "/FasMtr=0", "") ;
                     }
                  }
                  if ( ( AV68Grm2Control == 1 ) && ( AV49BarGraAca < AV69vGrm2 ) )
                  {
                     A1275FasKgm = DecimalUtil.doubleToDec(0) ;
                     if ( GXutil.strcmp(AV83inc_obs2, " ") == 0 )
                     {
                        AV83inc_obs2 = httpContext.getMessage( "&Grm2Control=1 AND &BarGraAca<&vGrm2", "") ;
                        AV83inc_obs2 += httpContext.getMessage( "/FasKgm=0", "") ;
                     }
                     else
                     {
                        AV83inc_obs2 += "/" + httpContext.getMessage( "&Grm2Control=1 AND &BarGraAca<&vGrm2", "") ;
                        AV83inc_obs2 += httpContext.getMessage( "/FasKgm=0", "") ;
                     }
                  }
                  A1275FasKgm = ((GXutil.strcmp(A13587FasKgsEnt, httpContext.getMessage( "S", ""))==0)&&(AV50Entregas_p>0) ? DecimalUtil.doubleToDec(0) : A1275FasKgm) ;
                  A1276FasMtr = ((GXutil.strcmp(A13587FasKgsEnt, httpContext.getMessage( "S", ""))==0)&&(AV50Entregas_p>0) ? DecimalUtil.doubleToDec(0) : A1276FasMtr) ;
                  if ( GXutil.strcmp(AV83inc_obs2, " ") == 0 )
                  {
                     AV83inc_obs2 = httpContext.getMessage( "FasKgsEnt=", "") + A13587FasKgsEnt ;
                     AV83inc_obs2 += httpContext.getMessage( "/&Entregas_p=", "") + GXutil.str( AV50Entregas_p, 2, 0) ;
                     AV83inc_obs2 += httpContext.getMessage( "/FasKgm=", "") + GXutil.str( A1275FasKgm, 9, 2) ;
                     AV83inc_obs2 += httpContext.getMessage( "/FasMtr=", "") + GXutil.str( A1276FasMtr, 9, 2) ;
                  }
                  else
                  {
                     AV83inc_obs2 += "/" + httpContext.getMessage( "FasKgsEnt=", "") + A13587FasKgsEnt ;
                     AV83inc_obs2 += httpContext.getMessage( "/&Entregas_p=", "") + GXutil.str( AV50Entregas_p, 2, 0) ;
                     AV83inc_obs2 += httpContext.getMessage( "/FasKgm=", "") + GXutil.str( A1275FasKgm, 9, 2) ;
                     AV83inc_obs2 += httpContext.getMessage( "/FasMtr=", "") + GXutil.str( A1276FasMtr, 9, 2) ;
                  }
                  AV62Inc_obs = httpContext.getMessage( "Precio Albaran-Fase.", "") ;
                  AV62Inc_obs += httpContext.getMessage( "Fase  = ", "") + A457FasCod + " " + A460FasDsc ;
                  AV62Inc_obs += httpContext.getMessage( "Kilos = ", "") + GXutil.str( A1275FasKgm, 9, 2) ;
                  AV62Inc_obs += httpContext.getMessage( "Precio= ", "") + GXutil.str( A1241GuiFasPKg, 13, 5) ;
                  AV62Inc_obs += httpContext.getMessage( "Metros= ", "") + GXutil.str( A1276FasMtr, 9, 2) ;
                  AV62Inc_obs += httpContext.getMessage( "Precio= ", "") + GXutil.str( A1242GuiFasPMt, 13, 5) ;
                  new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV91Pgmname, AV65UsurCod, AV63Station, AV62Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
                  AV62Inc_obs = " " ;
                  if ( ( GXutil.strcmp(AV83inc_obs2, " ") != 0 ) && ( AV44Moda21 == 1 ) )
                  {
                     new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV91Pgmname, AV65UsurCod, AV63Station, AV83inc_obs2, A129BarCod, A132BarCodReo, A130BarCodPar) ;
                     AV83inc_obs2 = " " ;
                  }
                  /* Using cursor P008014 */
                  pr_default.execute(10, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1240GuiFasLin), A457FasCod, A1241GuiFasPKg, A1242GuiFasPMt, A1275FasKgm, A1276FasMtr, Boolean.valueOf(n3272FasCodF), A3272FasCodF});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
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
                  /* End Insert */
               }
            }
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(8);
   }

   public void S121( )
   {
      /* 'DISPOS' Routine */
      returnInSub = false ;
      AV42DisPreKgm = DecimalUtil.doubleToDec(0) ;
      AV43DisPremtr = DecimalUtil.doubleToDec(0) ;
      AV85DisPrePz = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P008015 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(AV41DisCod)});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A361DisCod = P008015_A361DisCod[0] ;
         A388DisPreKgm = P008015_A388DisPreKgm[0] ;
         A389DisPreMtr = P008015_A389DisPreMtr[0] ;
         A14555DisPrePz = P008015_A14555DisPrePz[0] ;
         AV42DisPreKgm = A388DisPreKgm ;
         AV43DisPremtr = A389DisPreMtr ;
         AV85DisPrePz = A14555DisPrePz ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(11);
   }

   public void S131( )
   {
      /* 'PREFAS' Routine */
      returnInSub = false ;
      AV54Precio_Acc = (byte)(0) ;
      /* Using cursor P008016 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(AV25CliCod), AV24FasCod});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A457FasCod = P008016_A457FasCod[0] ;
         A252CliCod = P008016_A252CliCod[0] ;
         n252CliCod = P008016_n252CliCod[0] ;
         A10882FasPreU = P008016_A10882FasPreU[0] ;
         n10882FasPreU = P008016_n10882FasPreU[0] ;
         AV54Precio_Acc = A10882FasPreU ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(12);
   }

   public void S141( )
   {
      /* 'CFORMU' Routine */
      returnInSub = false ;
      AV61For_reo = " " ;
      /* Using cursor P008017 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(AV25CliCod), AV57Forser, AV58Forcolnom, Integer.valueOf(AV59Forcolnum), Byte.valueOf(AV60Tipcolcod)});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A831TipColCod = P008017_A831TipColCod[0] ;
         A483ForColNum = P008017_A483ForColNum[0] ;
         A482ForColNom = P008017_A482ForColNom[0] ;
         A494ForSer = P008017_A494ForSer[0] ;
         A252CliCod = P008017_A252CliCod[0] ;
         n252CliCod = P008017_n252CliCod[0] ;
         A9792For_Reo = P008017_A9792For_Reo[0] ;
         n9792For_Reo = P008017_n9792For_Reo[0] ;
         AV61For_reo = A9792For_Reo ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(13);
   }

   public void S151( )
   {
      /* 'ARTICU' Routine */
      returnInSub = false ;
      AV72ArtPreUnd = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P008018 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(AV25CliCod), AV71Barser});
      while ( (pr_default.getStatus(14) != 101) )
      {
         A65ArtCod = P008018_A65ArtCod[0] ;
         A252CliCod = P008018_A252CliCod[0] ;
         n252CliCod = P008018_n252CliCod[0] ;
         A12199ArtPreUnd = P008018_A12199ArtPreUnd[0] ;
         n12199ArtPreUnd = P008018_n12199ArtPreUnd[0] ;
         AV72ArtPreUnd = A12199ArtPreUnd ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(14);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcopfas.this.A396EmprCod;
      this.aP1[0] = pcopfas.this.AV15AlbProCod;
      this.aP2[0] = pcopfas.this.AV16BarCod;
      this.aP3[0] = pcopfas.this.AV17BarCodReo;
      this.aP4[0] = pcopfas.this.AV18BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcopfas");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV63Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV64EmprNom = "" ;
      AV65UsurCod = "" ;
      scmdbuf = "" ;
      P00802_A396EmprCod = new String[] {""} ;
      P00802_A130BarCodPar = new String[] {""} ;
      P00802_A132BarCodReo = new byte[1] ;
      P00802_A129BarCod = new int[1] ;
      P00802_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00802_A30AlbProCod = new long[1] ;
      A130BarCodPar = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      AV36Kgs_lam = DecimalUtil.ZERO ;
      AV40BarAcc = "" ;
      P00803_A396EmprCod = new String[] {""} ;
      P00803_A130BarCodPar = new String[] {""} ;
      P00803_A132BarCodReo = new byte[1] ;
      P00803_A129BarCod = new int[1] ;
      P00803_A1909BarGraAca = new short[1] ;
      P00803_A2827BarKgsLot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00803_A5253BarAcc = new String[] {""} ;
      P00803_A361DisCod = new int[1] ;
      P00803_A2010BarTipDis = new String[] {""} ;
      P00803_A252CliCod = new int[1] ;
      P00803_n252CliCod = new boolean[] {false} ;
      P00803_A212BarSer = new String[] {""} ;
      P00803_A135BarColNom = new String[] {""} ;
      P00803_A136BarColNum = new int[1] ;
      P00803_A218BarTipCol = new byte[1] ;
      A2827BarKgsLot = DecimalUtil.ZERO ;
      A5253BarAcc = "" ;
      A2010BarTipDis = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      AV53Bartipdis = "" ;
      AV57Forser = "" ;
      AV58Forcolnom = "" ;
      AV62Inc_obs = "" ;
      AV61For_reo = "" ;
      P00804_A396EmprCod = new String[] {""} ;
      P00804_A129BarCod = new int[1] ;
      P00804_A132BarCodReo = new byte[1] ;
      P00804_A130BarCodPar = new String[] {""} ;
      P00804_A150BarFacTin = new String[] {""} ;
      P00804_A194BarOrdLin = new short[1] ;
      P00804_A758ProCod = new String[] {""} ;
      A150BarFacTin = "" ;
      A758ProCod = "" ;
      AV91Pgmname = "" ;
      AV85DisPrePz = DecimalUtil.ZERO ;
      P00806_A396EmprCod = new String[] {""} ;
      P00806_A130BarCodPar = new String[] {""} ;
      P00806_A132BarCodReo = new byte[1] ;
      P00806_A129BarCod = new int[1] ;
      P00806_A30AlbProCod = new long[1] ;
      P00806_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00806_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00806_A12195BarAlbUnd = new int[1] ;
      P00806_A1265BarAlbPie = new int[1] ;
      P00806_A5019AlbHdrgm2 = new short[1] ;
      P00806_A252CliCod = new int[1] ;
      P00806_n252CliCod = new boolean[] {false} ;
      P00806_A212BarSer = new String[] {""} ;
      P00806_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00806_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      AV78BarKgm = DecimalUtil.ZERO ;
      AV79Barmtr = DecimalUtil.ZERO ;
      AV27FasKgm = DecimalUtil.ZERO ;
      AV28FasMtr = DecimalUtil.ZERO ;
      AV71Barser = "" ;
      P00807_A396EmprCod = new String[] {""} ;
      P00807_A130BarCodPar = new String[] {""} ;
      P00807_A132BarCodReo = new byte[1] ;
      P00807_A129BarCod = new int[1] ;
      P00807_A227BarUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00807_A252CliCod = new int[1] ;
      P00807_n252CliCod = new boolean[] {false} ;
      P00807_A457FasCod = new String[] {""} ;
      P00807_A5648CliTipo = new String[] {""} ;
      P00807_A13291CliFacFm = new String[] {""} ;
      P00807_A13292CliFacFmt = new short[1] ;
      P00807_A2010BarTipDis = new String[] {""} ;
      P00807_A6173BarFasSec = new String[] {""} ;
      P00807_n6173BarFasSec = new boolean[] {false} ;
      P00807_A194BarOrdLin = new short[1] ;
      P00807_A758ProCod = new String[] {""} ;
      A227BarUni = DecimalUtil.ZERO ;
      A457FasCod = "" ;
      A5648CliTipo = "" ;
      A13291CliFacFm = "" ;
      A6173BarFasSec = "" ;
      AV24FasCod = "" ;
      AV74CliTipo = "" ;
      AV77CliFacFm = "" ;
      P00808_A396EmprCod = new String[] {""} ;
      P00808_A130BarCodPar = new String[] {""} ;
      P00808_A132BarCodReo = new byte[1] ;
      P00808_A129BarCod = new int[1] ;
      P00808_A30AlbProCod = new long[1] ;
      P00808_A1248GuiFasULin = new short[1] ;
      P00808_A6815BarPreFKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00808_n6815BarPreFKg = new boolean[] {false} ;
      P00808_A6816BarPreFMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00808_n6816BarPreFMt = new boolean[] {false} ;
      A6815BarPreFKg = DecimalUtil.ZERO ;
      A6816BarPreFMt = DecimalUtil.ZERO ;
      P008010_A6817AlbFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008010_A6818AlbFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A6817AlbFasPKg = DecimalUtil.ZERO ;
      A6818AlbFasPMt = DecimalUtil.ZERO ;
      GXv_char4 = new String[1] ;
      GXv_int9 = new long[1] ;
      GXv_int7 = new int[1] ;
      GXv_int5 = new byte[1] ;
      GXv_char3 = new String[1] ;
      AV83inc_obs2 = "" ;
      P008012_A396EmprCod = new String[] {""} ;
      P008012_A4903FasAcab = new String[] {""} ;
      P008012_n4903FasAcab = new boolean[] {false} ;
      P008012_A12577FasPreKgF = new String[] {""} ;
      P008012_n12577FasPreKgF = new boolean[] {false} ;
      P008012_A12576FasPreMt2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008012_n12576FasPreMt2 = new boolean[] {false} ;
      P008012_A460FasDsc = new String[] {""} ;
      P008012_A466FasPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008012_n466FasPreKgm = new boolean[] {false} ;
      P008012_A467FasPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008012_n467FasPreMtr = new boolean[] {false} ;
      P008012_A13587FasKgsEnt = new String[] {""} ;
      P008012_n13587FasKgsEnt = new boolean[] {false} ;
      P008012_A3615FasFacCod = new String[] {""} ;
      P008012_n3615FasFacCod = new boolean[] {false} ;
      P008012_A457FasCod = new String[] {""} ;
      P008012_A252CliCod = new int[1] ;
      P008012_n252CliCod = new boolean[] {false} ;
      P008012_A14258FasFactura = new String[] {""} ;
      A4903FasAcab = "" ;
      A12577FasPreKgF = "" ;
      A12576FasPreMt2 = DecimalUtil.ZERO ;
      A460FasDsc = "" ;
      A466FasPreKgm = DecimalUtil.ZERO ;
      A467FasPreMtr = DecimalUtil.ZERO ;
      A13587FasKgsEnt = "" ;
      A3615FasFacCod = "" ;
      A14258FasFactura = "" ;
      AV45Calvet = DecimalUtil.ZERO ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A3272FasCodF = "" ;
      Gx_emsg = "" ;
      AV42DisPreKgm = DecimalUtil.ZERO ;
      AV43DisPremtr = DecimalUtil.ZERO ;
      P008015_A396EmprCod = new String[] {""} ;
      P008015_A361DisCod = new int[1] ;
      P008015_A388DisPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008015_A389DisPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008015_A14555DisPrePz = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A388DisPreKgm = DecimalUtil.ZERO ;
      A389DisPreMtr = DecimalUtil.ZERO ;
      A14555DisPrePz = DecimalUtil.ZERO ;
      P008016_A396EmprCod = new String[] {""} ;
      P008016_A457FasCod = new String[] {""} ;
      P008016_A252CliCod = new int[1] ;
      P008016_n252CliCod = new boolean[] {false} ;
      P008016_A10882FasPreU = new byte[1] ;
      P008016_n10882FasPreU = new boolean[] {false} ;
      P008017_A396EmprCod = new String[] {""} ;
      P008017_A831TipColCod = new byte[1] ;
      P008017_A483ForColNum = new int[1] ;
      P008017_A482ForColNom = new String[] {""} ;
      P008017_A494ForSer = new String[] {""} ;
      P008017_A252CliCod = new int[1] ;
      P008017_n252CliCod = new boolean[] {false} ;
      P008017_A9792For_Reo = new String[] {""} ;
      P008017_n9792For_Reo = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A9792For_Reo = "" ;
      AV72ArtPreUnd = DecimalUtil.ZERO ;
      P008018_A396EmprCod = new String[] {""} ;
      P008018_A65ArtCod = new String[] {""} ;
      P008018_A252CliCod = new int[1] ;
      P008018_n252CliCod = new boolean[] {false} ;
      P008018_A12199ArtPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008018_n12199ArtPreUnd = new boolean[] {false} ;
      A65ArtCod = "" ;
      A12199ArtPreUnd = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcopfas__default(),
         new Object[] {
             new Object[] {
            P00802_A396EmprCod, P00802_A130BarCodPar, P00802_A132BarCodReo, P00802_A129BarCod, P00802_A1261BarAlbKgmE, P00802_A30AlbProCod
            }
            , new Object[] {
            P00803_A396EmprCod, P00803_A130BarCodPar, P00803_A132BarCodReo, P00803_A129BarCod, P00803_A1909BarGraAca, P00803_A2827BarKgsLot, P00803_A5253BarAcc, P00803_A361DisCod, P00803_A2010BarTipDis, P00803_A252CliCod,
            P00803_n252CliCod, P00803_A212BarSer, P00803_A135BarColNom, P00803_A136BarColNum, P00803_A218BarTipCol
            }
            , new Object[] {
            P00804_A396EmprCod, P00804_A129BarCod, P00804_A132BarCodReo, P00804_A130BarCodPar, P00804_A150BarFacTin, P00804_A194BarOrdLin, P00804_A758ProCod
            }
            , new Object[] {
            P00806_A396EmprCod, P00806_A130BarCodPar, P00806_A132BarCodReo, P00806_A129BarCod, P00806_A30AlbProCod, P00806_A1261BarAlbKgmE, P00806_A1263BarAlbMtrE, P00806_A12195BarAlbUnd, P00806_A1265BarAlbPie, P00806_A5019AlbHdrgm2,
            P00806_A252CliCod, P00806_n252CliCod, P00806_A212BarSer, P00806_A166BarKgm, P00806_A184BarMtr
            }
            , new Object[] {
            P00807_A396EmprCod, P00807_A130BarCodPar, P00807_A132BarCodReo, P00807_A129BarCod, P00807_A227BarUni, P00807_A252CliCod, P00807_n252CliCod, P00807_A457FasCod, P00807_A5648CliTipo, P00807_A13291CliFacFm,
            P00807_A13292CliFacFmt, P00807_A2010BarTipDis, P00807_A6173BarFasSec, P00807_n6173BarFasSec, P00807_A194BarOrdLin, P00807_A758ProCod
            }
            , new Object[] {
            P00808_A396EmprCod, P00808_A130BarCodPar, P00808_A132BarCodReo, P00808_A129BarCod, P00808_A30AlbProCod, P00808_A1248GuiFasULin, P00808_A6815BarPreFKg, P00808_n6815BarPreFKg, P00808_A6816BarPreFMt, P00808_n6816BarPreFMt
            }
            , new Object[] {
            P008010_A6817AlbFasPKg, P008010_A6818AlbFasPMt
            }
            , new Object[] {
            }
            , new Object[] {
            P008012_A396EmprCod, P008012_A4903FasAcab, P008012_n4903FasAcab, P008012_A12577FasPreKgF, P008012_n12577FasPreKgF, P008012_A12576FasPreMt2, P008012_n12576FasPreMt2, P008012_A460FasDsc, P008012_A466FasPreKgm, P008012_n466FasPreKgm,
            P008012_A467FasPreMtr, P008012_n467FasPreMtr, P008012_A13587FasKgsEnt, P008012_n13587FasKgsEnt, P008012_A3615FasFacCod, P008012_n3615FasFacCod, P008012_A457FasCod, P008012_A252CliCod, P008012_A14258FasFactura
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P008015_A396EmprCod, P008015_A361DisCod, P008015_A388DisPreKgm, P008015_A389DisPreMtr, P008015_A14555DisPrePz
            }
            , new Object[] {
            P008016_A396EmprCod, P008016_A457FasCod, P008016_A252CliCod, P008016_A10882FasPreU, P008016_n10882FasPreU
            }
            , new Object[] {
            P008017_A396EmprCod, P008017_A831TipColCod, P008017_A483ForColNum, P008017_A482ForColNom, P008017_A494ForSer, P008017_A252CliCod, P008017_A9792For_Reo, P008017_n9792For_Reo
            }
            , new Object[] {
            P008018_A396EmprCod, P008018_A65ArtCod, P008018_A252CliCod, P008018_A12199ArtPreUnd, P008018_n12199ArtPreUnd
            }
         }
      );
      AV91Pgmname = "PCOPFAS" ;
      /* GeneXus formulas. */
      AV91Pgmname = "PCOPFAS" ;
      Gx_err = (short)(0) ;
   }

   private byte AV17BarCodReo ;
   private byte AV31Estamp ;
   private byte AV33F_nfases ;
   private byte AV34F_carvema ;
   private byte AV55Laminados ;
   private byte AV44Moda21 ;
   private byte AV68Grm2Control ;
   private byte AV56SinConFases ;
   private byte AV75PmlCliente ;
   private byte GXt_int6 ;
   private byte AV50Entregas_p ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte AV60Tipcolcod ;
   private byte AV54Precio_Acc ;
   private byte AV51Ok_precios ;
   private byte GXv_int5[] ;
   private byte AV32FlagVt ;
   private byte AV39F_Tintwe ;
   private byte AV46Magosa ;
   private byte A10882FasPreU ;
   private byte A831TipColCod ;
   private short AV69vGrm2 ;
   private short AV48GraHdr ;
   private short AV84Tintutex ;
   private short AV37OrdLin ;
   private short A1909BarGraAca ;
   private short AV49BarGraAca ;
   private short A194BarOrdLin ;
   private short AV20LinFas ;
   private short A5019AlbHdrgm2 ;
   private short A13292CliFacFmt ;
   private short AV76CliFacFmt ;
   private short AV38BarOrdLin ;
   private short A1248GuiFasULin ;
   private short A1240GuiFasLin ;
   private short Gx_err ;
   private int AV16BarCod ;
   private int AV47ContVal ;
   private int AV66ValPml ;
   private int AV73Pml500 ;
   private int GXt_int8 ;
   private int AV82Albaranmenor ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int AV41DisCod ;
   private int AV25CliCod ;
   private int AV59Forcolnum ;
   private int A12195BarAlbUnd ;
   private int A1265BarAlbPie ;
   private int AV70FasUnd ;
   private int AV35Pie_a ;
   private int AV67Pml ;
   private int GXv_int7[] ;
   private int GX_INS194 ;
   private int A483ForColNum ;
   private long AV15AlbProCod ;
   private long A30AlbProCod ;
   private long GXv_int9[] ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal AV36Kgs_lam ;
   private java.math.BigDecimal A2827BarKgsLot ;
   private java.math.BigDecimal AV85DisPrePz ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal AV78BarKgm ;
   private java.math.BigDecimal AV79Barmtr ;
   private java.math.BigDecimal AV27FasKgm ;
   private java.math.BigDecimal AV28FasMtr ;
   private java.math.BigDecimal A227BarUni ;
   private java.math.BigDecimal A6815BarPreFKg ;
   private java.math.BigDecimal A6816BarPreFMt ;
   private java.math.BigDecimal A6817AlbFasPKg ;
   private java.math.BigDecimal A6818AlbFasPMt ;
   private java.math.BigDecimal A12576FasPreMt2 ;
   private java.math.BigDecimal A466FasPreKgm ;
   private java.math.BigDecimal A467FasPreMtr ;
   private java.math.BigDecimal AV45Calvet ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal AV42DisPreKgm ;
   private java.math.BigDecimal AV43DisPremtr ;
   private java.math.BigDecimal A388DisPreKgm ;
   private java.math.BigDecimal A389DisPreMtr ;
   private java.math.BigDecimal A14555DisPrePz ;
   private java.math.BigDecimal AV72ArtPreUnd ;
   private java.math.BigDecimal A12199ArtPreUnd ;
   private String A396EmprCod ;
   private String AV18BarCodPar ;
   private String AV63Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV64EmprNom ;
   private String AV65UsurCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String AV40BarAcc ;
   private String A5253BarAcc ;
   private String A2010BarTipDis ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String AV53Bartipdis ;
   private String AV57Forser ;
   private String AV58Forcolnom ;
   private String AV61For_reo ;
   private String A150BarFacTin ;
   private String A758ProCod ;
   private String AV91Pgmname ;
   private String AV71Barser ;
   private String A457FasCod ;
   private String A5648CliTipo ;
   private String A13291CliFacFm ;
   private String A6173BarFasSec ;
   private String AV24FasCod ;
   private String AV74CliTipo ;
   private String AV77CliFacFm ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String A4903FasAcab ;
   private String A12577FasPreKgF ;
   private String A460FasDsc ;
   private String A13587FasKgsEnt ;
   private String A3615FasFacCod ;
   private String A14258FasFactura ;
   private String A3272FasCodF ;
   private String Gx_emsg ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A9792For_Reo ;
   private String A65ArtCod ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n6173BarFasSec ;
   private boolean n6815BarPreFKg ;
   private boolean n6816BarPreFMt ;
   private boolean n4903FasAcab ;
   private boolean n12577FasPreKgF ;
   private boolean n12576FasPreMt2 ;
   private boolean n466FasPreKgm ;
   private boolean n467FasPreMtr ;
   private boolean n13587FasKgsEnt ;
   private boolean n3615FasFacCod ;
   private boolean n3272FasCodF ;
   private boolean n10882FasPreU ;
   private boolean n9792For_Reo ;
   private boolean n12199ArtPreUnd ;
   private String AV62Inc_obs ;
   private String AV83inc_obs2 ;
   private String[] aP4 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P00802_A396EmprCod ;
   private String[] P00802_A130BarCodPar ;
   private byte[] P00802_A132BarCodReo ;
   private int[] P00802_A129BarCod ;
   private java.math.BigDecimal[] P00802_A1261BarAlbKgmE ;
   private long[] P00802_A30AlbProCod ;
   private String[] P00803_A396EmprCod ;
   private String[] P00803_A130BarCodPar ;
   private byte[] P00803_A132BarCodReo ;
   private int[] P00803_A129BarCod ;
   private short[] P00803_A1909BarGraAca ;
   private java.math.BigDecimal[] P00803_A2827BarKgsLot ;
   private String[] P00803_A5253BarAcc ;
   private int[] P00803_A361DisCod ;
   private String[] P00803_A2010BarTipDis ;
   private int[] P00803_A252CliCod ;
   private boolean[] P00803_n252CliCod ;
   private String[] P00803_A212BarSer ;
   private String[] P00803_A135BarColNom ;
   private int[] P00803_A136BarColNum ;
   private byte[] P00803_A218BarTipCol ;
   private String[] P00804_A396EmprCod ;
   private int[] P00804_A129BarCod ;
   private byte[] P00804_A132BarCodReo ;
   private String[] P00804_A130BarCodPar ;
   private String[] P00804_A150BarFacTin ;
   private short[] P00804_A194BarOrdLin ;
   private String[] P00804_A758ProCod ;
   private String[] P00806_A396EmprCod ;
   private String[] P00806_A130BarCodPar ;
   private byte[] P00806_A132BarCodReo ;
   private int[] P00806_A129BarCod ;
   private long[] P00806_A30AlbProCod ;
   private java.math.BigDecimal[] P00806_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P00806_A1263BarAlbMtrE ;
   private int[] P00806_A12195BarAlbUnd ;
   private int[] P00806_A1265BarAlbPie ;
   private short[] P00806_A5019AlbHdrgm2 ;
   private int[] P00806_A252CliCod ;
   private boolean[] P00806_n252CliCod ;
   private String[] P00806_A212BarSer ;
   private java.math.BigDecimal[] P00806_A166BarKgm ;
   private java.math.BigDecimal[] P00806_A184BarMtr ;
   private String[] P00807_A396EmprCod ;
   private String[] P00807_A130BarCodPar ;
   private byte[] P00807_A132BarCodReo ;
   private int[] P00807_A129BarCod ;
   private java.math.BigDecimal[] P00807_A227BarUni ;
   private int[] P00807_A252CliCod ;
   private boolean[] P00807_n252CliCod ;
   private String[] P00807_A457FasCod ;
   private String[] P00807_A5648CliTipo ;
   private String[] P00807_A13291CliFacFm ;
   private short[] P00807_A13292CliFacFmt ;
   private String[] P00807_A2010BarTipDis ;
   private String[] P00807_A6173BarFasSec ;
   private boolean[] P00807_n6173BarFasSec ;
   private short[] P00807_A194BarOrdLin ;
   private String[] P00807_A758ProCod ;
   private String[] P00808_A396EmprCod ;
   private String[] P00808_A130BarCodPar ;
   private byte[] P00808_A132BarCodReo ;
   private int[] P00808_A129BarCod ;
   private long[] P00808_A30AlbProCod ;
   private short[] P00808_A1248GuiFasULin ;
   private java.math.BigDecimal[] P00808_A6815BarPreFKg ;
   private boolean[] P00808_n6815BarPreFKg ;
   private java.math.BigDecimal[] P00808_A6816BarPreFMt ;
   private boolean[] P00808_n6816BarPreFMt ;
   private java.math.BigDecimal[] P008010_A6817AlbFasPKg ;
   private java.math.BigDecimal[] P008010_A6818AlbFasPMt ;
   private String[] P008012_A396EmprCod ;
   private String[] P008012_A4903FasAcab ;
   private boolean[] P008012_n4903FasAcab ;
   private String[] P008012_A12577FasPreKgF ;
   private boolean[] P008012_n12577FasPreKgF ;
   private java.math.BigDecimal[] P008012_A12576FasPreMt2 ;
   private boolean[] P008012_n12576FasPreMt2 ;
   private String[] P008012_A460FasDsc ;
   private java.math.BigDecimal[] P008012_A466FasPreKgm ;
   private boolean[] P008012_n466FasPreKgm ;
   private java.math.BigDecimal[] P008012_A467FasPreMtr ;
   private boolean[] P008012_n467FasPreMtr ;
   private String[] P008012_A13587FasKgsEnt ;
   private boolean[] P008012_n13587FasKgsEnt ;
   private String[] P008012_A3615FasFacCod ;
   private boolean[] P008012_n3615FasFacCod ;
   private String[] P008012_A457FasCod ;
   private int[] P008012_A252CliCod ;
   private boolean[] P008012_n252CliCod ;
   private String[] P008012_A14258FasFactura ;
   private String[] P008015_A396EmprCod ;
   private int[] P008015_A361DisCod ;
   private java.math.BigDecimal[] P008015_A388DisPreKgm ;
   private java.math.BigDecimal[] P008015_A389DisPreMtr ;
   private java.math.BigDecimal[] P008015_A14555DisPrePz ;
   private String[] P008016_A396EmprCod ;
   private String[] P008016_A457FasCod ;
   private int[] P008016_A252CliCod ;
   private boolean[] P008016_n252CliCod ;
   private byte[] P008016_A10882FasPreU ;
   private boolean[] P008016_n10882FasPreU ;
   private String[] P008017_A396EmprCod ;
   private byte[] P008017_A831TipColCod ;
   private int[] P008017_A483ForColNum ;
   private String[] P008017_A482ForColNom ;
   private String[] P008017_A494ForSer ;
   private int[] P008017_A252CliCod ;
   private boolean[] P008017_n252CliCod ;
   private String[] P008017_A9792For_Reo ;
   private boolean[] P008017_n9792For_Reo ;
   private String[] P008018_A396EmprCod ;
   private String[] P008018_A65ArtCod ;
   private int[] P008018_A252CliCod ;
   private boolean[] P008018_n252CliCod ;
   private java.math.BigDecimal[] P008018_A12199ArtPreUnd ;
   private boolean[] P008018_n12199ArtPreUnd ;
}

final  class pcopfas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00802", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarAlbKgmE, AlbProCod FROM TXPALBBAR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00803", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarGraAca, BarKgsLot, BarAcc, DisCod, BarTipDis, CliCod, BarSer, BarColNom, BarColNum, BarTipCol FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00804", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarFacTin, BarOrdLin, ProCod FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarFacTin = 'S') ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00806", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.AlbProCod, T1.BarAlbKgmE, T1.BarAlbMtrE, T1.BarAlbUnd, T1.BarAlbPie, T1.AlbHdrgm2, T2.CliCod, T2.BarSer, COALESCE( T4.BarKgm, 0) AS BarKgm, COALESCE( T4.BarMtr, 0) AS BarMtr FROM (((TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod = T1.AlbProCod) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00807", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarUni, T2.CliCod, T1.FasCod, T3.CliTipo, T3.CliFacFm, T3.CliFacFmt, T2.BarTipDis, T1.BarFasSec, T1.BarOrdLin, T1.ProCod FROM ((TXPBARFAS T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00808", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, AlbProCod, GuiFasULin, BarPreFKg, BarPreFMt FROM TXPALBBAR WHERE (EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) AND (EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)  FOR UPDATE OF GuiFasULin, BarPreFKg, BarPreFMt NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P008010", "SELECT COALESCE( T1.AlbFasPKg, 0) AS AlbFasPKg, COALESCE( T1.AlbFasPMt, 0) AS AlbFasPMt FROM (SELECT SUM(GuiFasPKg) AS AlbFasPKg, EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, SUM(GuiFasPMt) AS AlbFasPMt FROM TXPALBFAS GROUP BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.AlbProCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P008011", "UPDATE TXPALBBAR SET GuiFasULin=?, BarPreFKg=?, BarPreFMt=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
         ,new ForEachCursor("P008012", "SELECT T1.EmprCod, T2.FasAcab, T1.FasPreKgF, T1.FasPreMt2, T2.FasDsc, T1.FasPreKgm, T1.FasPreMtr, T1.FasKgsEnt, T1.FasFacCod, T1.FasCod, T1.CliCod, T1.FasFactura FROM (TXPPREFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.FasCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P008013", "INSERT INTO TXPALBFAS(EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin, FasCod, GuiFasPKg, GuiFasPMt, FasKgm, FasMtr, FasCodF, FasPreDsK, FasPreDsM, F_TipPza, FasFacMaqC, ArtAdiCod, GuiFasPre, GuiFasDto, GuiFasRec, GuiFasCCo, GuiFasPBK, GuiFasPBM, GuiFasPB, FasUnd, FasPreUnd, GuiFasFecc, GuiFasUsuc, GuiFasHorc) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBFAS")
         ,new UpdateCursor("P008014", "INSERT INTO TXPALBFAS(EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin, FasCod, GuiFasPKg, GuiFasPMt, FasKgm, FasMtr, FasCodF, FasPreDsK, FasPreDsM, F_TipPza, FasFacMaqC, ArtAdiCod, GuiFasPre, GuiFasDto, GuiFasRec, GuiFasCCo, GuiFasPBK, GuiFasPBM, GuiFasPB, FasUnd, FasPreUnd, GuiFasFecc, GuiFasUsuc, GuiFasHorc) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBFAS")
         ,new ForEachCursor("P008015", "SELECT EmprCod, DisCod, DisPreKgm, DisPreMtr, DisPrePz FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P008016", "SELECT EmprCod, FasCod, CliCod, FasPreU FROM TXPPREFAS WHERE EmprCod = ? and CliCod = ? and FasCod = ? ORDER BY EmprCod, CliCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P008017", "SELECT EmprCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod, For_Reo FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P008018", "SELECT EmprCod, ArtCod, CliCod, ArtPreUnd FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 16);
               ((String[]) buf[12])[0] = rslt.getString(12, 13);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((byte[]) buf[14])[0] = rslt.getByte(14);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(12, 16);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((String[]) buf[12])[0] = rslt.getString(12, 2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(13);
               ((String[]) buf[15])[0] = rslt.getString(14, 8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 6 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 28);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(10, 8);
               ((int[]) buf[17])[0] = rslt.getInt(11);
               ((String[]) buf[18])[0] = rslt.getString(12, 1);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 3);
               stmt.setLong(7, ((Number) parms[6]).longValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 7 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[2], 5);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[4], 5);
               }
               stmt.setString(4, (String)parms[5], 3);
               stmt.setLong(5, ((Number) parms[6]).longValue());
               stmt.setInt(6, ((Number) parms[7]).intValue());
               stmt.setByte(7, ((Number) parms[8]).byteValue());
               stmt.setString(8, (String)parms[9], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 5);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 5);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 2);
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[12], 6);
               }
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 5);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 5);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 2);
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[12], 6);
               }
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

