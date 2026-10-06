package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptotalbpr extends GXProcedure
{
   public ptotalbpr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptotalbpr.class ), "" );
   }

   public ptotalbpr( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           long[] aP1 )
   {
      ptotalbpr.this.aP2 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        java.math.BigDecimal[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             java.math.BigDecimal[] aP2 )
   {
      ptotalbpr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ptotalbpr.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      ptotalbpr.this.AV8TotAlb = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV10FlagEstamp ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ESTAMP", ""), GXv_int1) ;
      ptotalbpr.this.AV10FlagEstamp = GXv_int1[0] ;
      /* Using cursor P01JJ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P01JJ2_A130BarCodPar[0] ;
         A132BarCodReo = P01JJ2_A132BarCodReo[0] ;
         A129BarCod = P01JJ2_A129BarCod[0] ;
         A1263BarAlbMtrE = P01JJ2_A1263BarAlbMtrE[0] ;
         A1264BarPreMtr = P01JJ2_A1264BarPreMtr[0] ;
         A1261BarAlbKgmE = P01JJ2_A1261BarAlbKgmE[0] ;
         A1262BarPreKgm = P01JJ2_A1262BarPreKgm[0] ;
         A1206TubCod = P01JJ2_A1206TubCod[0] ;
         n1206TubCod = P01JJ2_n1206TubCod[0] ;
         A1266BarAlbTub = P01JJ2_A1266BarAlbTub[0] ;
         A1208TubPre = P01JJ2_A1208TubPre[0] ;
         n1208TubPre = P01JJ2_n1208TubPre[0] ;
         A1208TubPre = P01JJ2_A1208TubPre[0] ;
         n1208TubPre = P01JJ2_n1208TubPre[0] ;
         if ( AV10FlagEstamp == 0 )
         {
            AV9ImpLin = A1262BarPreKgm.multiply(A1261BarAlbKgmE).add(A1264BarPreMtr.multiply(A1263BarAlbMtrE)) ;
            AV8TotAlb = AV8TotAlb.add(AV9ImpLin) ;
         }
         else
         {
            /* Using cursor P01JJ3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A1533AlbEComM = P01JJ3_A1533AlbEComM[0] ;
               n1533AlbEComM = P01JJ3_n1533AlbEComM[0] ;
               A1536AlbEComPre = P01JJ3_A1536AlbEComPre[0] ;
               n1536AlbEComPre = P01JJ3_n1536AlbEComPre[0] ;
               A2524DisComLin = P01JJ3_A2524DisComLin[0] ;
               A1056DisComCod = P01JJ3_A1056DisComCod[0] ;
               A1032FonCod = P01JJ3_A1032FonCod[0] ;
               AV9ImpLin = A1536AlbEComPre.multiply(A1533AlbEComM) ;
               AV8TotAlb = AV8TotAlb.add(AV9ImpLin) ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
         }
         /* Using cursor P01JJ4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A1275FasKgm = P01JJ4_A1275FasKgm[0] ;
            A1241GuiFasPKg = P01JJ4_A1241GuiFasPKg[0] ;
            A1276FasMtr = P01JJ4_A1276FasMtr[0] ;
            A1242GuiFasPMt = P01JJ4_A1242GuiFasPMt[0] ;
            A1240GuiFasLin = P01JJ4_A1240GuiFasLin[0] ;
            AV9ImpLin = A1242GuiFasPMt.multiply(A1276FasMtr).add(A1241GuiFasPKg.multiply(A1275FasKgm)) ;
            AV8TotAlb = AV8TotAlb.add(AV9ImpLin) ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         /* Using cursor P01JJ5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A2765AlbHdrTxt = P01JJ5_A2765AlbHdrTxt[0] ;
            A2768AlbHdrKgs = P01JJ5_A2768AlbHdrKgs[0] ;
            A2767AlbHdrPKg = P01JJ5_A2767AlbHdrPKg[0] ;
            A2770ALbHdrMts = P01JJ5_A2770ALbHdrMts[0] ;
            A2769AlbHdrPMt = P01JJ5_A2769AlbHdrPMt[0] ;
            A2764AlbHdrLin = P01JJ5_A2764AlbHdrLin[0] ;
            AV9ImpLin = A2769AlbHdrPMt.multiply(A2770ALbHdrMts).add(A2767AlbHdrPKg.multiply(A2768AlbHdrKgs)) ;
            AV8TotAlb = AV8TotAlb.add(AV9ImpLin) ;
            pr_default.readNext(3);
         }
         pr_default.close(3);
         /* Using cursor P01JJ6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A1472PrdMtr = P01JJ6_A1472PrdMtr[0] ;
            n1472PrdMtr = P01JJ6_n1472PrdMtr[0] ;
            A1470AlbPrdPMt = P01JJ6_A1470AlbPrdPMt[0] ;
            n1470AlbPrdPMt = P01JJ6_n1470AlbPrdPMt[0] ;
            A1471PrdKgm = P01JJ6_A1471PrdKgm[0] ;
            n1471PrdKgm = P01JJ6_n1471PrdKgm[0] ;
            A1469AlbPrdPKg = P01JJ6_A1469AlbPrdPKg[0] ;
            n1469AlbPrdPKg = P01JJ6_n1469AlbPrdPKg[0] ;
            A1468AlbPrdLin = P01JJ6_A1468AlbPrdLin[0] ;
            AV9ImpLin = A1469AlbPrdPKg.multiply(A1471PrdKgm).add(A1470AlbPrdPMt.multiply(A1472PrdMtr)) ;
            AV8TotAlb = AV8TotAlb.add(AV9ImpLin) ;
            pr_default.readNext(4);
         }
         pr_default.close(4);
         if ( ! (0==A1266BarAlbTub) && ! (0==A1206TubCod) )
         {
            AV9ImpLin = A1208TubPre.multiply(DecimalUtil.doubleToDec(A1266BarAlbTub)) ;
            AV8TotAlb = AV8TotAlb.add(AV9ImpLin) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ptotalbpr.this.A396EmprCod;
      this.aP1[0] = ptotalbpr.this.A30AlbProCod;
      this.aP2[0] = ptotalbpr.this.AV8TotAlb;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      scmdbuf = "" ;
      P01JJ2_A396EmprCod = new String[] {""} ;
      P01JJ2_A30AlbProCod = new long[1] ;
      P01JJ2_A130BarCodPar = new String[] {""} ;
      P01JJ2_A132BarCodReo = new byte[1] ;
      P01JJ2_A129BarCod = new int[1] ;
      P01JJ2_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01JJ2_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01JJ2_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01JJ2_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01JJ2_A1206TubCod = new short[1] ;
      P01JJ2_n1206TubCod = new boolean[] {false} ;
      P01JJ2_A1266BarAlbTub = new int[1] ;
      P01JJ2_A1208TubPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01JJ2_n1208TubPre = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A1264BarPreMtr = DecimalUtil.ZERO ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A1208TubPre = DecimalUtil.ZERO ;
      AV9ImpLin = DecimalUtil.ZERO ;
      P01JJ3_A396EmprCod = new String[] {""} ;
      P01JJ3_A30AlbProCod = new long[1] ;
      P01JJ3_A129BarCod = new int[1] ;
      P01JJ3_A132BarCodReo = new byte[1] ;
      P01JJ3_A130BarCodPar = new String[] {""} ;
      P01JJ3_A1533AlbEComM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01JJ3_n1533AlbEComM = new boolean[] {false} ;
      P01JJ3_A1536AlbEComPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01JJ3_n1536AlbEComPre = new boolean[] {false} ;
      P01JJ3_A2524DisComLin = new byte[1] ;
      P01JJ3_A1056DisComCod = new String[] {""} ;
      P01JJ3_A1032FonCod = new String[] {""} ;
      A1533AlbEComM = DecimalUtil.ZERO ;
      A1536AlbEComPre = DecimalUtil.ZERO ;
      A1056DisComCod = "" ;
      A1032FonCod = "" ;
      P01JJ4_A396EmprCod = new String[] {""} ;
      P01JJ4_A30AlbProCod = new long[1] ;
      P01JJ4_A129BarCod = new int[1] ;
      P01JJ4_A132BarCodReo = new byte[1] ;
      P01JJ4_A130BarCodPar = new String[] {""} ;
      P01JJ4_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01JJ4_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01JJ4_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01JJ4_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01JJ4_A1240GuiFasLin = new short[1] ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      P01JJ5_A396EmprCod = new String[] {""} ;
      P01JJ5_A30AlbProCod = new long[1] ;
      P01JJ5_A129BarCod = new int[1] ;
      P01JJ5_A132BarCodReo = new byte[1] ;
      P01JJ5_A130BarCodPar = new String[] {""} ;
      P01JJ5_A2765AlbHdrTxt = new String[] {""} ;
      P01JJ5_A2768AlbHdrKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01JJ5_A2767AlbHdrPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01JJ5_A2770ALbHdrMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01JJ5_A2769AlbHdrPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01JJ5_A2764AlbHdrLin = new short[1] ;
      A2765AlbHdrTxt = "" ;
      A2768AlbHdrKgs = DecimalUtil.ZERO ;
      A2767AlbHdrPKg = DecimalUtil.ZERO ;
      A2770ALbHdrMts = DecimalUtil.ZERO ;
      A2769AlbHdrPMt = DecimalUtil.ZERO ;
      P01JJ6_A396EmprCod = new String[] {""} ;
      P01JJ6_A30AlbProCod = new long[1] ;
      P01JJ6_A129BarCod = new int[1] ;
      P01JJ6_A132BarCodReo = new byte[1] ;
      P01JJ6_A130BarCodPar = new String[] {""} ;
      P01JJ6_A1472PrdMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01JJ6_n1472PrdMtr = new boolean[] {false} ;
      P01JJ6_A1470AlbPrdPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01JJ6_n1470AlbPrdPMt = new boolean[] {false} ;
      P01JJ6_A1471PrdKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01JJ6_n1471PrdKgm = new boolean[] {false} ;
      P01JJ6_A1469AlbPrdPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01JJ6_n1469AlbPrdPKg = new boolean[] {false} ;
      P01JJ6_A1468AlbPrdLin = new short[1] ;
      A1472PrdMtr = DecimalUtil.ZERO ;
      A1470AlbPrdPMt = DecimalUtil.ZERO ;
      A1471PrdKgm = DecimalUtil.ZERO ;
      A1469AlbPrdPKg = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ptotalbpr__default(),
         new Object[] {
             new Object[] {
            P01JJ2_A396EmprCod, P01JJ2_A30AlbProCod, P01JJ2_A130BarCodPar, P01JJ2_A132BarCodReo, P01JJ2_A129BarCod, P01JJ2_A1263BarAlbMtrE, P01JJ2_A1264BarPreMtr, P01JJ2_A1261BarAlbKgmE, P01JJ2_A1262BarPreKgm, P01JJ2_A1206TubCod,
            P01JJ2_n1206TubCod, P01JJ2_A1266BarAlbTub, P01JJ2_A1208TubPre, P01JJ2_n1208TubPre
            }
            , new Object[] {
            P01JJ3_A396EmprCod, P01JJ3_A30AlbProCod, P01JJ3_A129BarCod, P01JJ3_A132BarCodReo, P01JJ3_A130BarCodPar, P01JJ3_A1533AlbEComM, P01JJ3_n1533AlbEComM, P01JJ3_A1536AlbEComPre, P01JJ3_n1536AlbEComPre, P01JJ3_A2524DisComLin,
            P01JJ3_A1056DisComCod, P01JJ3_A1032FonCod
            }
            , new Object[] {
            P01JJ4_A396EmprCod, P01JJ4_A30AlbProCod, P01JJ4_A129BarCod, P01JJ4_A132BarCodReo, P01JJ4_A130BarCodPar, P01JJ4_A1275FasKgm, P01JJ4_A1241GuiFasPKg, P01JJ4_A1276FasMtr, P01JJ4_A1242GuiFasPMt, P01JJ4_A1240GuiFasLin
            }
            , new Object[] {
            P01JJ5_A396EmprCod, P01JJ5_A30AlbProCod, P01JJ5_A129BarCod, P01JJ5_A132BarCodReo, P01JJ5_A130BarCodPar, P01JJ5_A2765AlbHdrTxt, P01JJ5_A2768AlbHdrKgs, P01JJ5_A2767AlbHdrPKg, P01JJ5_A2770ALbHdrMts, P01JJ5_A2769AlbHdrPMt,
            P01JJ5_A2764AlbHdrLin
            }
            , new Object[] {
            P01JJ6_A396EmprCod, P01JJ6_A30AlbProCod, P01JJ6_A129BarCod, P01JJ6_A132BarCodReo, P01JJ6_A130BarCodPar, P01JJ6_A1472PrdMtr, P01JJ6_n1472PrdMtr, P01JJ6_A1470AlbPrdPMt, P01JJ6_n1470AlbPrdPMt, P01JJ6_A1471PrdKgm,
            P01JJ6_n1471PrdKgm, P01JJ6_A1469AlbPrdPKg, P01JJ6_n1469AlbPrdPKg, P01JJ6_A1468AlbPrdLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10FlagEstamp ;
   private byte GXv_int1[] ;
   private byte A132BarCodReo ;
   private byte A2524DisComLin ;
   private short A1206TubCod ;
   private short A1240GuiFasLin ;
   private short A2764AlbHdrLin ;
   private short A1468AlbPrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A1266BarAlbTub ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV8TotAlb ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A1264BarPreMtr ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A1208TubPre ;
   private java.math.BigDecimal AV9ImpLin ;
   private java.math.BigDecimal A1533AlbEComM ;
   private java.math.BigDecimal A1536AlbEComPre ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal A2768AlbHdrKgs ;
   private java.math.BigDecimal A2767AlbHdrPKg ;
   private java.math.BigDecimal A2770ALbHdrMts ;
   private java.math.BigDecimal A2769AlbHdrPMt ;
   private java.math.BigDecimal A1472PrdMtr ;
   private java.math.BigDecimal A1470AlbPrdPMt ;
   private java.math.BigDecimal A1471PrdKgm ;
   private java.math.BigDecimal A1469AlbPrdPKg ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A1056DisComCod ;
   private String A1032FonCod ;
   private String A2765AlbHdrTxt ;
   private boolean n1206TubCod ;
   private boolean n1208TubPre ;
   private boolean n1533AlbEComM ;
   private boolean n1536AlbEComPre ;
   private boolean n1472PrdMtr ;
   private boolean n1470AlbPrdPMt ;
   private boolean n1471PrdKgm ;
   private boolean n1469AlbPrdPKg ;
   private java.math.BigDecimal[] aP2 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P01JJ2_A396EmprCod ;
   private long[] P01JJ2_A30AlbProCod ;
   private String[] P01JJ2_A130BarCodPar ;
   private byte[] P01JJ2_A132BarCodReo ;
   private int[] P01JJ2_A129BarCod ;
   private java.math.BigDecimal[] P01JJ2_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] P01JJ2_A1264BarPreMtr ;
   private java.math.BigDecimal[] P01JJ2_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P01JJ2_A1262BarPreKgm ;
   private short[] P01JJ2_A1206TubCod ;
   private boolean[] P01JJ2_n1206TubCod ;
   private int[] P01JJ2_A1266BarAlbTub ;
   private java.math.BigDecimal[] P01JJ2_A1208TubPre ;
   private boolean[] P01JJ2_n1208TubPre ;
   private String[] P01JJ3_A396EmprCod ;
   private long[] P01JJ3_A30AlbProCod ;
   private int[] P01JJ3_A129BarCod ;
   private byte[] P01JJ3_A132BarCodReo ;
   private String[] P01JJ3_A130BarCodPar ;
   private java.math.BigDecimal[] P01JJ3_A1533AlbEComM ;
   private boolean[] P01JJ3_n1533AlbEComM ;
   private java.math.BigDecimal[] P01JJ3_A1536AlbEComPre ;
   private boolean[] P01JJ3_n1536AlbEComPre ;
   private byte[] P01JJ3_A2524DisComLin ;
   private String[] P01JJ3_A1056DisComCod ;
   private String[] P01JJ3_A1032FonCod ;
   private String[] P01JJ4_A396EmprCod ;
   private long[] P01JJ4_A30AlbProCod ;
   private int[] P01JJ4_A129BarCod ;
   private byte[] P01JJ4_A132BarCodReo ;
   private String[] P01JJ4_A130BarCodPar ;
   private java.math.BigDecimal[] P01JJ4_A1275FasKgm ;
   private java.math.BigDecimal[] P01JJ4_A1241GuiFasPKg ;
   private java.math.BigDecimal[] P01JJ4_A1276FasMtr ;
   private java.math.BigDecimal[] P01JJ4_A1242GuiFasPMt ;
   private short[] P01JJ4_A1240GuiFasLin ;
   private String[] P01JJ5_A396EmprCod ;
   private long[] P01JJ5_A30AlbProCod ;
   private int[] P01JJ5_A129BarCod ;
   private byte[] P01JJ5_A132BarCodReo ;
   private String[] P01JJ5_A130BarCodPar ;
   private String[] P01JJ5_A2765AlbHdrTxt ;
   private java.math.BigDecimal[] P01JJ5_A2768AlbHdrKgs ;
   private java.math.BigDecimal[] P01JJ5_A2767AlbHdrPKg ;
   private java.math.BigDecimal[] P01JJ5_A2770ALbHdrMts ;
   private java.math.BigDecimal[] P01JJ5_A2769AlbHdrPMt ;
   private short[] P01JJ5_A2764AlbHdrLin ;
   private String[] P01JJ6_A396EmprCod ;
   private long[] P01JJ6_A30AlbProCod ;
   private int[] P01JJ6_A129BarCod ;
   private byte[] P01JJ6_A132BarCodReo ;
   private String[] P01JJ6_A130BarCodPar ;
   private java.math.BigDecimal[] P01JJ6_A1472PrdMtr ;
   private boolean[] P01JJ6_n1472PrdMtr ;
   private java.math.BigDecimal[] P01JJ6_A1470AlbPrdPMt ;
   private boolean[] P01JJ6_n1470AlbPrdPMt ;
   private java.math.BigDecimal[] P01JJ6_A1471PrdKgm ;
   private boolean[] P01JJ6_n1471PrdKgm ;
   private java.math.BigDecimal[] P01JJ6_A1469AlbPrdPKg ;
   private boolean[] P01JJ6_n1469AlbPrdPKg ;
   private short[] P01JJ6_A1468AlbPrdLin ;
}

final  class ptotalbpr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01JJ2", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarAlbMtrE, T1.BarPreMtr, T1.BarAlbKgmE, T1.BarPreKgm, T1.TubCod, T1.BarAlbTub, T2.TubPre FROM (TXPALBBAR T1 LEFT JOIN TXPTUBOS T2 ON T2.EmprCod = T1.EmprCod AND T2.TubCod = T1.TubCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01JJ3", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbEComM, AlbEComPre, DisComLin, DisComCod, FonCod FROM TXPALBEST WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01JJ4", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, FasKgm, GuiFasPKg, FasMtr, GuiFasPMt, GuiFasLin FROM TXPALBFAS WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01JJ5", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdrTxt, AlbHdrKgs, AlbHdrPKg, ALbHdrMts, AlbHdrPMt, AlbHdrLin FROM TXPALBTXT WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01JJ6", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, PrdMtr, AlbPrdPMt, PrdKgm, AlbPrdPKg, AlbPrdLin FROM TXPALBPRD WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,5);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 12);
               ((String[]) buf[11])[0] = rslt.getString(10, 12);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,5);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(10);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

