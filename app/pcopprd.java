package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcopprd extends GXProcedure
{
   public pcopprd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcopprd.class ), "" );
   }

   public pcopprd( int remoteHandle ,
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
      pcopprd.this.aP4 = new String[] {""};
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
      pcopprd.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcopprd.this.AV15AlbProCod = aP1[0];
      this.aP1 = aP1;
      pcopprd.this.AV16BarCod = aP2[0];
      this.aP2 = aP2;
      pcopprd.this.AV17BarCodReo = aP3[0];
      this.aP3 = aP3;
      pcopprd.this.AV18BarCodPar = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV40FlagGua = (byte)(0) ;
      AV20LinPro = (short)(0) ;
      GXt_int1 = AV38Valor ;
      GXv_int2[0] = GXt_int1 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ALBPRO", ""), GXv_int2) ;
      pcopprd.this.GXt_int1 = GXv_int2[0] ;
      AV38Valor = GXt_int1 ;
      GXt_int3 = AV40FlagGua ;
      GXv_int4[0] = GXt_int3 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "GUASCH", ""), GXv_int4) ;
      pcopprd.this.GXt_int3 = GXv_int4[0] ;
      AV40FlagGua = GXt_int3 ;
      GXt_int3 = AV45Texknit ;
      GXv_int4[0] = GXt_int3 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TEXKNI", ""), GXv_int4) ;
      pcopprd.this.GXt_int3 = GXv_int4[0] ;
      AV45Texknit = GXt_int3 ;
      GXt_int3 = AV55Martex ;
      GXv_int4[0] = GXt_int3 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MARTEX", ""), GXv_int4) ;
      pcopprd.this.GXt_int3 = GXv_int4[0] ;
      AV55Martex = GXt_int3 ;
      GXt_int3 = AV56Utexta ;
      GXv_int4[0] = GXt_int3 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "UTEXTA", ""), GXv_int4) ;
      pcopprd.this.GXt_int3 = GXv_int4[0] ;
      AV56Utexta = GXt_int3 ;
      /* Using cursor P00A12 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(AV15AlbProCod), Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P00A12_A130BarCodPar[0] ;
         A132BarCodReo = P00A12_A132BarCodReo[0] ;
         A129BarCod = P00A12_A129BarCod[0] ;
         A30AlbProCod = P00A12_A30AlbProCod[0] ;
         A1261BarAlbKgmE = P00A12_A1261BarAlbKgmE[0] ;
         A1263BarAlbMtrE = P00A12_A1263BarAlbMtrE[0] ;
         AV50FasKgm = A1261BarAlbKgmE ;
         AV51FasMtr = A1263BarAlbMtrE ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P00A14 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A130BarCodPar = P00A14_A130BarCodPar[0] ;
         A132BarCodReo = P00A14_A132BarCodReo[0] ;
         A129BarCod = P00A14_A129BarCod[0] ;
         A228BarUniMed = P00A14_A228BarUniMed[0] ;
         A166BarKgm = P00A14_A166BarKgm[0] ;
         A184BarMtr = P00A14_A184BarMtr[0] ;
         A166BarKgm = P00A14_A166BarKgm[0] ;
         A184BarMtr = P00A14_A184BarMtr[0] ;
         if ( GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "K", "")) == 0 )
         {
            AV37Unidades = A166BarKgm ;
         }
         else
         {
            AV37Unidades = A184BarMtr ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      AV41Proceso = (byte)(0) ;
      /* Using cursor P00A15 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A758ProCod = P00A15_A758ProCod[0] ;
         n758ProCod = P00A15_n758ProCod[0] ;
         A130BarCodPar = P00A15_A130BarCodPar[0] ;
         A132BarCodReo = P00A15_A132BarCodReo[0] ;
         A129BarCod = P00A15_A129BarCod[0] ;
         A252CliCod = P00A15_A252CliCod[0] ;
         n252CliCod = P00A15_n252CliCod[0] ;
         A212BarSer = P00A15_A212BarSer[0] ;
         A135BarColNom = P00A15_A135BarColNom[0] ;
         A136BarColNum = P00A15_A136BarColNum[0] ;
         A218BarTipCol = P00A15_A218BarTipCol[0] ;
         A252CliCod = P00A15_A252CliCod[0] ;
         n252CliCod = P00A15_n252CliCod[0] ;
         A212BarSer = P00A15_A212BarSer[0] ;
         A135BarColNom = P00A15_A135BarColNom[0] ;
         A136BarColNum = P00A15_A136BarColNum[0] ;
         A218BarTipCol = P00A15_A218BarTipCol[0] ;
         AV25CliCod = A252CliCod ;
         AV26BarSer = A212BarSer ;
         AV24ProCod = A758ProCod ;
         AV28ForSer = A212BarSer ;
         AV29ForColNom = A135BarColNom ;
         AV30ForColNum = A136BarColNum ;
         AV31TipColCod = A218BarTipCol ;
         AV39ArtCod = GXutil.space( (short)(16)) ;
         if ( AV38Valor == 0 )
         {
            AV39ArtCod = A212BarSer ;
         }
         if ( AV38Valor == 0 )
         {
            /* Execute user subroutine: 'FORMULA' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               pr_default.close(2);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         else
         {
            AV27IntCod = (byte)(0) ;
         }
         if ( ( AV40FlagGua == 1 ) && ( AV41Proceso != 0 ) )
         {
            AV27IntCod = (byte)(99) ;
         }
         if ( AV56Utexta == 1 )
         {
            AV27IntCod = (byte)(99) ;
         }
         /* Execute user subroutine: 'PRECIOS' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            pr_default.close(2);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV43ProPreRec)==0) )
         {
            if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV33ProPreMtr)==0) )
            {
               AV44ProPorRec = GXutil.roundDecimal( (AV43ProPreRec.divide((AV33ProPreMtr.subtract(AV43ProPreRec)), 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)), 2) ;
            }
            else
            {
               AV44ProPorRec = GXutil.roundDecimal( (AV43ProPreRec.divide((AV32ProPreKgm.subtract(AV43ProPreRec)), 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)), 2) ;
            }
         }
         if ( ( GXutil.strcmp(AV48ExisPrePro, httpContext.getMessage( "N", "")) == 0 ) && ( ( AV45Texknit == 1 ) || ( AV55Martex == 1 ) ) )
         {
            /* Execute user subroutine: 'COPIAFASES' */
            S131 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               pr_default.close(2);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         else
         {
            AV20LinPro = (short)(AV20LinPro+1) ;
            /*
               INSERT RECORD ON TABLE TXPALBPRD

            */
            A30AlbProCod = AV15AlbProCod ;
            A1468AlbPrdLin = AV20LinPro ;
            A1469AlbPrdPKg = AV32ProPreKgm ;
            n1469AlbPrdPKg = false ;
            A1470AlbPrdPMt = AV33ProPreMtr ;
            n1470AlbPrdPMt = false ;
            A4332ProPreRec = AV43ProPreRec ;
            n4332ProPreRec = false ;
            A4333ProPorRec = AV44ProPorRec ;
            n4333ProPorRec = false ;
            /* Using cursor P00A16 */
            pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1468AlbPrdLin), Boolean.valueOf(n1469AlbPrdPKg), A1469AlbPrdPKg, Boolean.valueOf(n1470AlbPrdPMt), A1470AlbPrdPMt, Boolean.valueOf(n758ProCod), A758ProCod, Boolean.valueOf(n4332ProPreRec), A4332ProPreRec, Boolean.valueOf(n4333ProPorRec), A4333ProPorRec});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBPRD");
            if ( (pr_default.getStatus(3) == 1) )
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
            AV41Proceso = (byte)(AV41Proceso+1) ;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
      n583IntCod = false ;
      n1467AlbPrdULin = false ;
      /* Optimized UPDATE. */
      /* Using cursor P00A17 */
      pr_default.execute(4, new Object[] {Boolean.valueOf(n583IntCod), Byte.valueOf(AV27IntCod), Boolean.valueOf(n1467AlbPrdULin), Short.valueOf(AV20LinPro), A396EmprCod, Long.valueOf(AV15AlbProCod), Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
      /* End optimized UPDATE. */
      cleanup();
   }

   public void S111( )
   {
      /* 'PRECIOS' Routine */
      returnInSub = false ;
      AV32ProPreKgm = DecimalUtil.doubleToDec(0) ;
      AV33ProPreMtr = DecimalUtil.doubleToDec(0) ;
      AV43ProPreRec = DecimalUtil.doubleToDec(0) ;
      AV44ProPorRec = DecimalUtil.doubleToDec(0) ;
      AV48ExisPrePro = httpContext.getMessage( "N", "") ;
      /* Using cursor P00A18 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV25CliCod), AV24ProCod, AV39ArtCod, Byte.valueOf(AV27IntCod)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A583IntCod = P00A18_A583IntCod[0] ;
         n583IntCod = P00A18_n583IntCod[0] ;
         A65ArtCod = P00A18_A65ArtCod[0] ;
         A1504CliProCod = P00A18_A1504CliProCod[0] ;
         A252CliCod = P00A18_A252CliCod[0] ;
         n252CliCod = P00A18_n252CliCod[0] ;
         A1465ProPreKgm = P00A18_A1465ProPreKgm[0] ;
         n1465ProPreKgm = P00A18_n1465ProPreKgm[0] ;
         A1464ProPreMtr = P00A18_A1464ProPreMtr[0] ;
         n1464ProPreMtr = P00A18_n1464ProPreMtr[0] ;
         AV32ProPreKgm = A1465ProPreKgm ;
         AV33ProPreMtr = A1464ProPreMtr ;
         AV48ExisPrePro = httpContext.getMessage( "S", "") ;
         /* Using cursor P00A19 */
         pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A1504CliProCod, A65ArtCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod)});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A1726MaxPreUni = P00A19_A1726MaxPreUni[0] ;
            n1726MaxPreUni = P00A19_n1726MaxPreUni[0] ;
            A1731MinPreUni = P00A19_A1731MinPreUni[0] ;
            n1731MinPreUni = P00A19_n1731MinPreUni[0] ;
            A1727MinPreKgm = P00A19_A1727MinPreKgm[0] ;
            n1727MinPreKgm = P00A19_n1727MinPreKgm[0] ;
            A1729MinPreMtr = P00A19_A1729MinPreMtr[0] ;
            n1729MinPreMtr = P00A19_n1729MinPreMtr[0] ;
            A1728MinPreLin = P00A19_A1728MinPreLin[0] ;
            if ( ( DecimalUtil.compareTo(AV37Unidades, A1731MinPreUni) >= 0 ) && ( DecimalUtil.compareTo(AV37Unidades, A1726MaxPreUni) <= 0 ) )
            {
               AV32ProPreKgm = AV32ProPreKgm.add(A1727MinPreKgm) ;
               AV33ProPreMtr = AV33ProPreMtr.add(A1729MinPreMtr) ;
               if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A1729MinPreMtr)==0) )
               {
                  AV43ProPreRec = A1729MinPreMtr ;
               }
               else
               {
                  AV43ProPreRec = A1727MinPreKgm ;
               }
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(6);
         }
         pr_default.close(6);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
   }

   public void S121( )
   {
      /* 'FORMULA' Routine */
      returnInSub = false ;
      AV27IntCod = (byte)(99) ;
      /* Using cursor P00A110 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(AV25CliCod), AV28ForSer, AV29ForColNom, Integer.valueOf(AV30ForColNum), Byte.valueOf(AV31TipColCod)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A831TipColCod = P00A110_A831TipColCod[0] ;
         A483ForColNum = P00A110_A483ForColNum[0] ;
         A482ForColNom = P00A110_A482ForColNom[0] ;
         A494ForSer = P00A110_A494ForSer[0] ;
         A252CliCod = P00A110_A252CliCod[0] ;
         n252CliCod = P00A110_n252CliCod[0] ;
         A583IntCod = P00A110_A583IntCod[0] ;
         n583IntCod = P00A110_n583IntCod[0] ;
         AV27IntCod = A583IntCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(7);
   }

   public void S131( )
   {
      /* 'COPIAFASES' Routine */
      returnInSub = false ;
      /* Using cursor P00A111 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(AV25CliCod), AV24ProCod});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A457FasCod = P00A111_A457FasCod[0] ;
         A252CliCod = P00A111_A252CliCod[0] ;
         n252CliCod = P00A111_n252CliCod[0] ;
         A4589FFProCod = P00A111_A4589FFProCod[0] ;
         A3615FasFacCod = P00A111_A3615FasFacCod[0] ;
         n3615FasFacCod = P00A111_n3615FasFacCod[0] ;
         A4591FFFasCod = P00A111_A4591FFFasCod[0] ;
         A4817FFFasOrd = P00A111_A4817FFFasOrd[0] ;
         n4817FFFasOrd = P00A111_n4817FFFasOrd[0] ;
         A3615FasFacCod = P00A111_A3615FasFacCod[0] ;
         n3615FasFacCod = P00A111_n3615FasFacCod[0] ;
         AV49FasCod = A4591FFFasCod ;
         /* Execute user subroutine: 'PRECIOS_FASES' */
         S1410 ();
         if ( returnInSub )
         {
            pr_default.close(8);
            pr_default.close(8);
            returnInSub = true;
            if (true) return;
         }
         AV54Linfas = (short)(AV54Linfas+1) ;
         /*
            INSERT RECORD ON TABLE TXPALBFAS

         */
         W457FasCod = A457FasCod ;
         A30AlbProCod = AV15AlbProCod ;
         A1240GuiFasLin = AV54Linfas ;
         A457FasCod = AV49FasCod ;
         A1241GuiFasPKg = AV52FasPreKgm ;
         A1242GuiFasPMt = AV53FasPreMtr ;
         A1275FasKgm = AV50FasKgm ;
         A1276FasMtr = AV51FasMtr ;
         A3272FasCodF = A3615FasFacCod ;
         n3272FasCodF = false ;
         A4390FasPreDsK = AV24ProCod ;
         n4390FasPreDsK = false ;
         /* Using cursor P00A112 */
         pr_default.execute(9, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1240GuiFasLin), A457FasCod, A1241GuiFasPKg, A1242GuiFasPMt, A1275FasKgm, A1276FasMtr, Boolean.valueOf(n3272FasCodF), A3272FasCodF, Boolean.valueOf(n4390FasPreDsK), A4390FasPreDsK});
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
         A457FasCod = W457FasCod ;
         /* End Insert */
         pr_default.readNext(8);
      }
      pr_default.close(8);
      /* Optimized UPDATE. */
      /* Using cursor P00A113 */
      short AV54Linfas1248Aux;
      AV54Linfas1248Aux = AV54Linfas ;
      pr_default.execute(10, new Object[] {Short.valueOf(AV54Linfas1248Aux), A396EmprCod, Long.valueOf(AV15AlbProCod), Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
      /* End optimized UPDATE. */
   }

   public void S1410( )
   {
      /* 'PRECIOS_FASES' Routine */
      returnInSub = false ;
      AV52FasPreKgm = DecimalUtil.doubleToDec(0) ;
      AV53FasPreMtr = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P00A114 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(AV25CliCod), AV49FasCod});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A457FasCod = P00A114_A457FasCod[0] ;
         A252CliCod = P00A114_A252CliCod[0] ;
         n252CliCod = P00A114_n252CliCod[0] ;
         A466FasPreKgm = P00A114_A466FasPreKgm[0] ;
         n466FasPreKgm = P00A114_n466FasPreKgm[0] ;
         A467FasPreMtr = P00A114_A467FasPreMtr[0] ;
         n467FasPreMtr = P00A114_n467FasPreMtr[0] ;
         AV52FasPreKgm = A466FasPreKgm ;
         AV53FasPreMtr = A467FasPreMtr ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(11);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcopprd.this.A396EmprCod;
      this.aP1[0] = pcopprd.this.AV15AlbProCod;
      this.aP2[0] = pcopprd.this.AV16BarCod;
      this.aP3[0] = pcopprd.this.AV17BarCodReo;
      this.aP4[0] = pcopprd.this.AV18BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcopprd");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new int[1] ;
      GXv_int4 = new byte[1] ;
      scmdbuf = "" ;
      P00A12_A396EmprCod = new String[] {""} ;
      P00A12_A130BarCodPar = new String[] {""} ;
      P00A12_A132BarCodReo = new byte[1] ;
      P00A12_A129BarCod = new int[1] ;
      P00A12_A30AlbProCod = new long[1] ;
      P00A12_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00A12_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      AV50FasKgm = DecimalUtil.ZERO ;
      AV51FasMtr = DecimalUtil.ZERO ;
      P00A14_A396EmprCod = new String[] {""} ;
      P00A14_A130BarCodPar = new String[] {""} ;
      P00A14_A132BarCodReo = new byte[1] ;
      P00A14_A129BarCod = new int[1] ;
      P00A14_A228BarUniMed = new String[] {""} ;
      P00A14_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00A14_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A228BarUniMed = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      AV37Unidades = DecimalUtil.ZERO ;
      P00A15_A396EmprCod = new String[] {""} ;
      P00A15_A758ProCod = new String[] {""} ;
      P00A15_n758ProCod = new boolean[] {false} ;
      P00A15_A130BarCodPar = new String[] {""} ;
      P00A15_A132BarCodReo = new byte[1] ;
      P00A15_A129BarCod = new int[1] ;
      P00A15_A252CliCod = new int[1] ;
      P00A15_n252CliCod = new boolean[] {false} ;
      P00A15_A212BarSer = new String[] {""} ;
      P00A15_A135BarColNom = new String[] {""} ;
      P00A15_A136BarColNum = new int[1] ;
      P00A15_A218BarTipCol = new byte[1] ;
      A758ProCod = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      AV26BarSer = "" ;
      AV24ProCod = "" ;
      AV28ForSer = "" ;
      AV29ForColNom = "" ;
      AV39ArtCod = "" ;
      AV43ProPreRec = DecimalUtil.ZERO ;
      AV33ProPreMtr = DecimalUtil.ZERO ;
      AV44ProPorRec = DecimalUtil.ZERO ;
      AV32ProPreKgm = DecimalUtil.ZERO ;
      AV48ExisPrePro = "" ;
      A1469AlbPrdPKg = DecimalUtil.ZERO ;
      A1470AlbPrdPMt = DecimalUtil.ZERO ;
      A4332ProPreRec = DecimalUtil.ZERO ;
      A4333ProPorRec = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      P00A18_A396EmprCod = new String[] {""} ;
      P00A18_A583IntCod = new byte[1] ;
      P00A18_n583IntCod = new boolean[] {false} ;
      P00A18_A65ArtCod = new String[] {""} ;
      P00A18_A1504CliProCod = new String[] {""} ;
      P00A18_A252CliCod = new int[1] ;
      P00A18_n252CliCod = new boolean[] {false} ;
      P00A18_A1465ProPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00A18_n1465ProPreKgm = new boolean[] {false} ;
      P00A18_A1464ProPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00A18_n1464ProPreMtr = new boolean[] {false} ;
      A65ArtCod = "" ;
      A1504CliProCod = "" ;
      A1465ProPreKgm = DecimalUtil.ZERO ;
      A1464ProPreMtr = DecimalUtil.ZERO ;
      P00A19_A396EmprCod = new String[] {""} ;
      P00A19_A252CliCod = new int[1] ;
      P00A19_n252CliCod = new boolean[] {false} ;
      P00A19_A1504CliProCod = new String[] {""} ;
      P00A19_A65ArtCod = new String[] {""} ;
      P00A19_A583IntCod = new byte[1] ;
      P00A19_n583IntCod = new boolean[] {false} ;
      P00A19_A1726MaxPreUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00A19_n1726MaxPreUni = new boolean[] {false} ;
      P00A19_A1731MinPreUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00A19_n1731MinPreUni = new boolean[] {false} ;
      P00A19_A1727MinPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00A19_n1727MinPreKgm = new boolean[] {false} ;
      P00A19_A1729MinPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00A19_n1729MinPreMtr = new boolean[] {false} ;
      P00A19_A1728MinPreLin = new byte[1] ;
      A1726MaxPreUni = DecimalUtil.ZERO ;
      A1731MinPreUni = DecimalUtil.ZERO ;
      A1727MinPreKgm = DecimalUtil.ZERO ;
      A1729MinPreMtr = DecimalUtil.ZERO ;
      P00A110_A396EmprCod = new String[] {""} ;
      P00A110_A831TipColCod = new byte[1] ;
      P00A110_A483ForColNum = new int[1] ;
      P00A110_A482ForColNom = new String[] {""} ;
      P00A110_A494ForSer = new String[] {""} ;
      P00A110_A252CliCod = new int[1] ;
      P00A110_n252CliCod = new boolean[] {false} ;
      P00A110_A583IntCod = new byte[1] ;
      P00A110_n583IntCod = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      P00A111_A457FasCod = new String[] {""} ;
      P00A111_A396EmprCod = new String[] {""} ;
      P00A111_A252CliCod = new int[1] ;
      P00A111_n252CliCod = new boolean[] {false} ;
      P00A111_A4589FFProCod = new String[] {""} ;
      P00A111_A3615FasFacCod = new String[] {""} ;
      P00A111_n3615FasFacCod = new boolean[] {false} ;
      P00A111_A4591FFFasCod = new String[] {""} ;
      P00A111_A4817FFFasOrd = new byte[1] ;
      P00A111_n4817FFFasOrd = new boolean[] {false} ;
      A457FasCod = "" ;
      A4589FFProCod = "" ;
      A3615FasFacCod = "" ;
      A4591FFFasCod = "" ;
      AV49FasCod = "" ;
      W457FasCod = "" ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      AV52FasPreKgm = DecimalUtil.ZERO ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      AV53FasPreMtr = DecimalUtil.ZERO ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A3272FasCodF = "" ;
      A4390FasPreDsK = "" ;
      P00A114_A396EmprCod = new String[] {""} ;
      P00A114_A457FasCod = new String[] {""} ;
      P00A114_A252CliCod = new int[1] ;
      P00A114_n252CliCod = new boolean[] {false} ;
      P00A114_A466FasPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00A114_n466FasPreKgm = new boolean[] {false} ;
      P00A114_A467FasPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00A114_n467FasPreMtr = new boolean[] {false} ;
      A466FasPreKgm = DecimalUtil.ZERO ;
      A467FasPreMtr = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcopprd__default(),
         new Object[] {
             new Object[] {
            P00A12_A396EmprCod, P00A12_A130BarCodPar, P00A12_A132BarCodReo, P00A12_A129BarCod, P00A12_A30AlbProCod, P00A12_A1261BarAlbKgmE, P00A12_A1263BarAlbMtrE
            }
            , new Object[] {
            P00A14_A396EmprCod, P00A14_A130BarCodPar, P00A14_A132BarCodReo, P00A14_A129BarCod, P00A14_A228BarUniMed, P00A14_A166BarKgm, P00A14_A184BarMtr
            }
            , new Object[] {
            P00A15_A396EmprCod, P00A15_A758ProCod, P00A15_A130BarCodPar, P00A15_A132BarCodReo, P00A15_A129BarCod, P00A15_A252CliCod, P00A15_n252CliCod, P00A15_A212BarSer, P00A15_A135BarColNom, P00A15_A136BarColNum,
            P00A15_A218BarTipCol
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00A18_A396EmprCod, P00A18_A583IntCod, P00A18_A65ArtCod, P00A18_A1504CliProCod, P00A18_A252CliCod, P00A18_A1465ProPreKgm, P00A18_n1465ProPreKgm, P00A18_A1464ProPreMtr, P00A18_n1464ProPreMtr
            }
            , new Object[] {
            P00A19_A396EmprCod, P00A19_A252CliCod, P00A19_A1504CliProCod, P00A19_A65ArtCod, P00A19_A583IntCod, P00A19_A1726MaxPreUni, P00A19_n1726MaxPreUni, P00A19_A1731MinPreUni, P00A19_n1731MinPreUni, P00A19_A1727MinPreKgm,
            P00A19_n1727MinPreKgm, P00A19_A1729MinPreMtr, P00A19_n1729MinPreMtr, P00A19_A1728MinPreLin
            }
            , new Object[] {
            P00A110_A396EmprCod, P00A110_A831TipColCod, P00A110_A483ForColNum, P00A110_A482ForColNom, P00A110_A494ForSer, P00A110_A252CliCod, P00A110_A583IntCod
            }
            , new Object[] {
            P00A111_A457FasCod, P00A111_A396EmprCod, P00A111_A252CliCod, P00A111_A4589FFProCod, P00A111_A3615FasFacCod, P00A111_n3615FasFacCod, P00A111_A4591FFFasCod, P00A111_A4817FFFasOrd, P00A111_n4817FFFasOrd
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00A114_A396EmprCod, P00A114_A457FasCod, P00A114_A252CliCod, P00A114_A466FasPreKgm, P00A114_n466FasPreKgm, P00A114_A467FasPreMtr, P00A114_n467FasPreMtr
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17BarCodReo ;
   private byte AV40FlagGua ;
   private byte AV45Texknit ;
   private byte AV55Martex ;
   private byte AV56Utexta ;
   private byte GXt_int3 ;
   private byte GXv_int4[] ;
   private byte A132BarCodReo ;
   private byte AV41Proceso ;
   private byte A218BarTipCol ;
   private byte AV31TipColCod ;
   private byte AV27IntCod ;
   private byte A583IntCod ;
   private byte A1728MinPreLin ;
   private byte A831TipColCod ;
   private byte A4817FFFasOrd ;
   private short AV20LinPro ;
   private short A1468AlbPrdLin ;
   private short Gx_err ;
   private short A1467AlbPrdULin ;
   private short AV54Linfas ;
   private short A1240GuiFasLin ;
   private short A1248GuiFasULin ;
   private int AV16BarCod ;
   private int AV38Valor ;
   private int GXt_int1 ;
   private int GXv_int2[] ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int AV25CliCod ;
   private int AV30ForColNum ;
   private int GX_INS210 ;
   private int A483ForColNum ;
   private int GX_INS194 ;
   private long AV15AlbProCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal AV50FasKgm ;
   private java.math.BigDecimal AV51FasMtr ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal AV37Unidades ;
   private java.math.BigDecimal AV43ProPreRec ;
   private java.math.BigDecimal AV33ProPreMtr ;
   private java.math.BigDecimal AV44ProPorRec ;
   private java.math.BigDecimal AV32ProPreKgm ;
   private java.math.BigDecimal A1469AlbPrdPKg ;
   private java.math.BigDecimal A1470AlbPrdPMt ;
   private java.math.BigDecimal A4332ProPreRec ;
   private java.math.BigDecimal A4333ProPorRec ;
   private java.math.BigDecimal A1465ProPreKgm ;
   private java.math.BigDecimal A1464ProPreMtr ;
   private java.math.BigDecimal A1726MaxPreUni ;
   private java.math.BigDecimal A1731MinPreUni ;
   private java.math.BigDecimal A1727MinPreKgm ;
   private java.math.BigDecimal A1729MinPreMtr ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal AV52FasPreKgm ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal AV53FasPreMtr ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A466FasPreKgm ;
   private java.math.BigDecimal A467FasPreMtr ;
   private String A396EmprCod ;
   private String AV18BarCodPar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A228BarUniMed ;
   private String A758ProCod ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String AV26BarSer ;
   private String AV24ProCod ;
   private String AV28ForSer ;
   private String AV29ForColNom ;
   private String AV39ArtCod ;
   private String AV48ExisPrePro ;
   private String Gx_emsg ;
   private String A65ArtCod ;
   private String A1504CliProCod ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A457FasCod ;
   private String A4589FFProCod ;
   private String A3615FasFacCod ;
   private String A4591FFFasCod ;
   private String AV49FasCod ;
   private String W457FasCod ;
   private String A3272FasCodF ;
   private String A4390FasPreDsK ;
   private boolean n758ProCod ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n1469AlbPrdPKg ;
   private boolean n1470AlbPrdPMt ;
   private boolean n4332ProPreRec ;
   private boolean n4333ProPorRec ;
   private boolean n583IntCod ;
   private boolean n1467AlbPrdULin ;
   private boolean n1465ProPreKgm ;
   private boolean n1464ProPreMtr ;
   private boolean n1726MaxPreUni ;
   private boolean n1731MinPreUni ;
   private boolean n1727MinPreKgm ;
   private boolean n1729MinPreMtr ;
   private boolean n3615FasFacCod ;
   private boolean n4817FFFasOrd ;
   private boolean n3272FasCodF ;
   private boolean n4390FasPreDsK ;
   private boolean n466FasPreKgm ;
   private boolean n467FasPreMtr ;
   private String[] aP4 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P00A12_A396EmprCod ;
   private String[] P00A12_A130BarCodPar ;
   private byte[] P00A12_A132BarCodReo ;
   private int[] P00A12_A129BarCod ;
   private long[] P00A12_A30AlbProCod ;
   private java.math.BigDecimal[] P00A12_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P00A12_A1263BarAlbMtrE ;
   private String[] P00A14_A396EmprCod ;
   private String[] P00A14_A130BarCodPar ;
   private byte[] P00A14_A132BarCodReo ;
   private int[] P00A14_A129BarCod ;
   private String[] P00A14_A228BarUniMed ;
   private java.math.BigDecimal[] P00A14_A166BarKgm ;
   private java.math.BigDecimal[] P00A14_A184BarMtr ;
   private String[] P00A15_A396EmprCod ;
   private String[] P00A15_A758ProCod ;
   private boolean[] P00A15_n758ProCod ;
   private String[] P00A15_A130BarCodPar ;
   private byte[] P00A15_A132BarCodReo ;
   private int[] P00A15_A129BarCod ;
   private int[] P00A15_A252CliCod ;
   private boolean[] P00A15_n252CliCod ;
   private String[] P00A15_A212BarSer ;
   private String[] P00A15_A135BarColNom ;
   private int[] P00A15_A136BarColNum ;
   private byte[] P00A15_A218BarTipCol ;
   private String[] P00A18_A396EmprCod ;
   private byte[] P00A18_A583IntCod ;
   private boolean[] P00A18_n583IntCod ;
   private String[] P00A18_A65ArtCod ;
   private String[] P00A18_A1504CliProCod ;
   private int[] P00A18_A252CliCod ;
   private boolean[] P00A18_n252CliCod ;
   private java.math.BigDecimal[] P00A18_A1465ProPreKgm ;
   private boolean[] P00A18_n1465ProPreKgm ;
   private java.math.BigDecimal[] P00A18_A1464ProPreMtr ;
   private boolean[] P00A18_n1464ProPreMtr ;
   private String[] P00A19_A396EmprCod ;
   private int[] P00A19_A252CliCod ;
   private boolean[] P00A19_n252CliCod ;
   private String[] P00A19_A1504CliProCod ;
   private String[] P00A19_A65ArtCod ;
   private byte[] P00A19_A583IntCod ;
   private boolean[] P00A19_n583IntCod ;
   private java.math.BigDecimal[] P00A19_A1726MaxPreUni ;
   private boolean[] P00A19_n1726MaxPreUni ;
   private java.math.BigDecimal[] P00A19_A1731MinPreUni ;
   private boolean[] P00A19_n1731MinPreUni ;
   private java.math.BigDecimal[] P00A19_A1727MinPreKgm ;
   private boolean[] P00A19_n1727MinPreKgm ;
   private java.math.BigDecimal[] P00A19_A1729MinPreMtr ;
   private boolean[] P00A19_n1729MinPreMtr ;
   private byte[] P00A19_A1728MinPreLin ;
   private String[] P00A110_A396EmprCod ;
   private byte[] P00A110_A831TipColCod ;
   private int[] P00A110_A483ForColNum ;
   private String[] P00A110_A482ForColNom ;
   private String[] P00A110_A494ForSer ;
   private int[] P00A110_A252CliCod ;
   private boolean[] P00A110_n252CliCod ;
   private byte[] P00A110_A583IntCod ;
   private boolean[] P00A110_n583IntCod ;
   private String[] P00A111_A457FasCod ;
   private String[] P00A111_A396EmprCod ;
   private int[] P00A111_A252CliCod ;
   private boolean[] P00A111_n252CliCod ;
   private String[] P00A111_A4589FFProCod ;
   private String[] P00A111_A3615FasFacCod ;
   private boolean[] P00A111_n3615FasFacCod ;
   private String[] P00A111_A4591FFFasCod ;
   private byte[] P00A111_A4817FFFasOrd ;
   private boolean[] P00A111_n4817FFFasOrd ;
   private String[] P00A114_A396EmprCod ;
   private String[] P00A114_A457FasCod ;
   private int[] P00A114_A252CliCod ;
   private boolean[] P00A114_n252CliCod ;
   private java.math.BigDecimal[] P00A114_A466FasPreKgm ;
   private boolean[] P00A114_n466FasPreKgm ;
   private java.math.BigDecimal[] P00A114_A467FasPreMtr ;
   private boolean[] P00A114_n467FasPreMtr ;
}

final  class pcopprd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00A12", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, AlbProCod, BarAlbKgmE, BarAlbMtrE FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00A14", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarUniMed, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarMtr, 0) AS BarMtr FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00A15", "SELECT T1.EmprCod, T1.ProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.CliCod, T2.BarSer, T2.BarColNom, T2.BarColNum, T2.BarTipCol FROM (TXPBARPRO T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00A16", "INSERT INTO TXPALBPRD(EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPrdLin, AlbPrdPKg, AlbPrdPMt, ProCod, ProPreRec, ProPorRec, PrdKgm, PrdMtr, AlbPrdDcK, AlbPrdDcM, AlbPrdCli) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, ' ', ' ', 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBPRD")
         ,new UpdateCursor("P00A17", "UPDATE TXPALBBAR SET IntCod=?, AlbPrdULin=?  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
         ,new ForEachCursor("P00A18", "SELECT EmprCod, IntCod, ArtCod, CliProCod, CliCod, ProPreKgm, ProPreMtr FROM TXPLPREPR WHERE EmprCod = ? and CliCod = ? and CliProCod = ? and ArtCod = ? and IntCod = ? ORDER BY EmprCod, CliCod, CliProCod, ArtCod, IntCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00A19", "SELECT EmprCod, CliCod, CliProCod, ArtCod, IntCod, MaxPreUni, MinPreUni, MinPreKgm, MinPreMtr, MinPreLin FROM TXPRECPIL WHERE EmprCod = ? and CliCod = ? and CliProCod = ? and ArtCod = ? and IntCod = ? ORDER BY EmprCod, CliCod, CliProCod, ArtCod, IntCod, MinPreLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00A110", "SELECT EmprCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod, IntCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00A111", "SELECT T2.FasCod, T1.EmprCod, T1.CliCod, T1.FFProCod, T2.FasFacCod, T1.FFFasCod, T1.FFFasOrd FROM (TXPFasFC2 T1 INNER JOIN TXPPREFAS T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod AND T2.FasCod = T1.FFFasCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.FFProCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.FFProCod, T1.FFFasOrd ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00A112", "INSERT INTO TXPALBFAS(EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin, FasCod, GuiFasPKg, GuiFasPMt, FasKgm, FasMtr, FasCodF, FasPreDsK, FasPreDsM, F_TipPza, FasFacMaqC, ArtAdiCod, GuiFasPre, GuiFasDto, GuiFasRec, GuiFasCCo, GuiFasPBK, GuiFasPBM, GuiFasPB, FasUnd, FasPreUnd, GuiFasFecc, GuiFasUsuc, GuiFasHorc) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBFAS")
         ,new UpdateCursor("P00A113", "UPDATE TXPALBBAR SET GuiFasULin=?  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
         ,new ForEachCursor("P00A114", "SELECT EmprCod, FasCod, CliCod, FasPreKgm, FasPreMtr FROM TXPPREFAS WHERE EmprCod = ? and CliCod = ? and FasCod = ? ORDER BY EmprCod, CliCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(10);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
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
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[7], 5);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[9], 5);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[11], 8);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[13], 5);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[15], 2);
               }
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setLong(4, ((Number) parms[5]).longValue());
               stmt.setInt(5, ((Number) parms[6]).intValue());
               stmt.setByte(6, ((Number) parms[7]).byteValue());
               stmt.setString(7, (String)parms[8], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 8);
               stmt.setString(4, (String)parms[4], 16);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[6]).byteValue());
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
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
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[14], 40);
               }
               return;
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
      }
   }

}

