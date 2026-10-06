package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pactcil extends GXProcedure
{
   public pactcil( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pactcil.class ), "" );
   }

   public pactcil( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            int[] aP2 ,
                            String[] aP3 )
   {
      pactcil.this.aP4 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 )
   {
      pactcil.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pactcil.this.AV17CliCod = aP1[0];
      this.aP1 = aP1;
      pactcil.this.AV18DibInt = aP2[0];
      this.aP2 = aP2;
      pactcil.this.AV19DibCli = aP3[0];
      this.aP3 = aP3;
      pactcil.this.AV20DibLin = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02XJ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV19DibCli, Integer.valueOf(AV17CliCod), Integer.valueOf(AV18DibInt), Short.valueOf(AV20DibLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1807DibLinCil = P02XJ2_A1807DibLinCil[0] ;
         A1013DibCli = P02XJ2_A1013DibCli[0] ;
         A1014DibInt = P02XJ2_A1014DibInt[0] ;
         A252CliCod = P02XJ2_A252CliCod[0] ;
         A2089DibLinMol = P02XJ2_A2089DibLinMol[0] ;
         n2089DibLinMol = P02XJ2_n2089DibLinMol[0] ;
         A1030DibRelMC = P02XJ2_A1030DibRelMC[0] ;
         n1030DibRelMC = P02XJ2_n1030DibRelMC[0] ;
         A1808DibOrdCil = P02XJ2_A1808DibOrdCil[0] ;
         n1808DibOrdCil = P02XJ2_n1808DibOrdCil[0] ;
         A1826TipCilCod = P02XJ2_A1826TipCilCod[0] ;
         n1826TipCilCod = P02XJ2_n1826TipCilCod[0] ;
         A1827TipCilDsc = P02XJ2_A1827TipCilDsc[0] ;
         n1827TipCilDsc = P02XJ2_n1827TipCilDsc[0] ;
         A1810DibPosCil = P02XJ2_A1810DibPosCil[0] ;
         n1810DibPosCil = P02XJ2_n1810DibPosCil[0] ;
         A4860DibPrcCob = P02XJ2_A4860DibPrcCob[0] ;
         n4860DibPrcCob = P02XJ2_n4860DibPrcCob[0] ;
         A7026DibCilCod = P02XJ2_A7026DibCilCod[0] ;
         n7026DibCilCod = P02XJ2_n7026DibCilCod[0] ;
         A7027DibLinMalC = P02XJ2_A7027DibLinMalC[0] ;
         n7027DibLinMalC = P02XJ2_n7027DibLinMalC[0] ;
         A1827TipCilDsc = P02XJ2_A1827TipCilDsc[0] ;
         n1827TipCilDsc = P02XJ2_n1827TipCilDsc[0] ;
         AV8DibLinMol = A2089DibLinMol ;
         AV9DibRelMC = A1030DibRelMC ;
         AV10DibOrdCil = A1808DibOrdCil ;
         AV11TipCilCod = A1826TipCilCod ;
         AV12TipCilDsc = A1827TipCilDsc ;
         AV13DibPosCil = A1810DibPosCil ;
         AV14DibPrcCob = A4860DibPrcCob ;
         AV15DibCilCod = A7026DibCilCod ;
         AV16DibLinMalC = A7027DibLinMalC ;
         /* Execute user subroutine: 'COPIARAMEZCLAS' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'COPIARACOPIASDIRECTAS' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'COPIARACOPIASDIRECTAS' Routine */
      returnInSub = false ;
      /* Using cursor P02XJ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV19DibCli, A396EmprCod, AV19DibCli, Integer.valueOf(AV18DibInt), Short.valueOf(AV20DibLin)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A1807DibLinCil = P02XJ3_A1807DibLinCil[0] ;
         A1013DibCli = P02XJ3_A1013DibCli[0] ;
         A1014DibInt = P02XJ3_A1014DibInt[0] ;
         A252CliCod = P02XJ3_A252CliCod[0] ;
         A2089DibLinMol = P02XJ3_A2089DibLinMol[0] ;
         n2089DibLinMol = P02XJ3_n2089DibLinMol[0] ;
         A1030DibRelMC = P02XJ3_A1030DibRelMC[0] ;
         n1030DibRelMC = P02XJ3_n1030DibRelMC[0] ;
         A1808DibOrdCil = P02XJ3_A1808DibOrdCil[0] ;
         n1808DibOrdCil = P02XJ3_n1808DibOrdCil[0] ;
         A1826TipCilCod = P02XJ3_A1826TipCilCod[0] ;
         n1826TipCilCod = P02XJ3_n1826TipCilCod[0] ;
         A1810DibPosCil = P02XJ3_A1810DibPosCil[0] ;
         n1810DibPosCil = P02XJ3_n1810DibPosCil[0] ;
         A4860DibPrcCob = P02XJ3_A4860DibPrcCob[0] ;
         n4860DibPrcCob = P02XJ3_n4860DibPrcCob[0] ;
         A7026DibCilCod = P02XJ3_A7026DibCilCod[0] ;
         n7026DibCilCod = P02XJ3_n7026DibCilCod[0] ;
         A7027DibLinMalC = P02XJ3_A7027DibLinMalC[0] ;
         n7027DibLinMalC = P02XJ3_n7027DibLinMalC[0] ;
         if ( A1014DibInt == AV18DibInt )
         {
            if ( A1807DibLinCil == AV20DibLin )
            {
               /* Using cursor P02XJ4 */
               pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n1826TipCilCod), Byte.valueOf(A1826TipCilCod)});
               A1827TipCilDsc = P02XJ4_A1827TipCilDsc[0] ;
               n1827TipCilDsc = P02XJ4_n1827TipCilDsc[0] ;
               if ( A252CliCod != AV17CliCod )
               {
                  A2089DibLinMol = AV8DibLinMol ;
                  n2089DibLinMol = false ;
                  A1030DibRelMC = AV9DibRelMC ;
                  n1030DibRelMC = false ;
                  A1808DibOrdCil = AV10DibOrdCil ;
                  n1808DibOrdCil = false ;
                  A1826TipCilCod = AV11TipCilCod ;
                  n1826TipCilCod = false ;
                  A1827TipCilDsc = AV12TipCilDsc ;
                  n1827TipCilDsc = false ;
                  A1810DibPosCil = AV13DibPosCil ;
                  n1810DibPosCil = false ;
                  A4860DibPrcCob = AV14DibPrcCob ;
                  n4860DibPrcCob = false ;
                  A7026DibCilCod = AV15DibCilCod ;
                  n7026DibCilCod = false ;
                  A7027DibLinMalC = AV16DibLinMalC ;
                  n7027DibLinMalC = false ;
               }
               /* Using cursor P02XJ5 */
               pr_default.execute(3, new Object[] {Boolean.valueOf(n1827TipCilDsc), A1827TipCilDsc, A396EmprCod, Boolean.valueOf(n1826TipCilCod), Byte.valueOf(A1826TipCilCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTIPCAB");
               /* Using cursor P02XJ6 */
               pr_default.execute(4, new Object[] {Boolean.valueOf(n2089DibLinMol), Byte.valueOf(A2089DibLinMol), Boolean.valueOf(n1030DibRelMC), A1030DibRelMC, Boolean.valueOf(n1808DibOrdCil), Byte.valueOf(A1808DibOrdCil), Boolean.valueOf(n1826TipCilCod), Byte.valueOf(A1826TipCilCod), Boolean.valueOf(n1810DibPosCil), Byte.valueOf(A1810DibPosCil), Boolean.valueOf(n4860DibPrcCob), A4860DibPrcCob, Boolean.valueOf(n7026DibCilCod), A7026DibCilCod, Boolean.valueOf(n7027DibLinMalC), A7027DibLinMalC, A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A1807DibLinCil)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDIBUC");
            }
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      pr_default.close(2);
   }

   public void S121( )
   {
      /* 'COPIARAMEZCLAS' Routine */
      returnInSub = false ;
      /* Using cursor P02XJ7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(AV17CliCod), Integer.valueOf(AV18DibInt), AV19DibCli, Short.valueOf(AV20DibLin)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A10510DibOrgLi = P02XJ7_A10510DibOrgLi[0] ;
         n10510DibOrgLi = P02XJ7_n10510DibOrgLi[0] ;
         A10509DibOrgCl = P02XJ7_A10509DibOrgCl[0] ;
         n10509DibOrgCl = P02XJ7_n10509DibOrgCl[0] ;
         A10508DibOrgIn = P02XJ7_A10508DibOrgIn[0] ;
         n10508DibOrgIn = P02XJ7_n10508DibOrgIn[0] ;
         A10511DibOrgClid = P02XJ7_A10511DibOrgClid[0] ;
         n10511DibOrgClid = P02XJ7_n10511DibOrgClid[0] ;
         A2089DibLinMol = P02XJ7_A2089DibLinMol[0] ;
         n2089DibLinMol = P02XJ7_n2089DibLinMol[0] ;
         A1030DibRelMC = P02XJ7_A1030DibRelMC[0] ;
         n1030DibRelMC = P02XJ7_n1030DibRelMC[0] ;
         A1808DibOrdCil = P02XJ7_A1808DibOrdCil[0] ;
         n1808DibOrdCil = P02XJ7_n1808DibOrdCil[0] ;
         A1826TipCilCod = P02XJ7_A1826TipCilCod[0] ;
         n1826TipCilCod = P02XJ7_n1826TipCilCod[0] ;
         A1810DibPosCil = P02XJ7_A1810DibPosCil[0] ;
         n1810DibPosCil = P02XJ7_n1810DibPosCil[0] ;
         A4860DibPrcCob = P02XJ7_A4860DibPrcCob[0] ;
         n4860DibPrcCob = P02XJ7_n4860DibPrcCob[0] ;
         A7026DibCilCod = P02XJ7_A7026DibCilCod[0] ;
         n7026DibCilCod = P02XJ7_n7026DibCilCod[0] ;
         A7027DibLinMalC = P02XJ7_A7027DibLinMalC[0] ;
         n7027DibLinMalC = P02XJ7_n7027DibLinMalC[0] ;
         A1013DibCli = P02XJ7_A1013DibCli[0] ;
         A252CliCod = P02XJ7_A252CliCod[0] ;
         A1014DibInt = P02XJ7_A1014DibInt[0] ;
         A1807DibLinCil = P02XJ7_A1807DibLinCil[0] ;
         if ( A10511DibOrgClid == AV17CliCod )
         {
            if ( A10508DibOrgIn == AV18DibInt )
            {
               if ( GXutil.strcmp(A10509DibOrgCl, AV19DibCli) == 0 )
               {
                  if ( A10510DibOrgLi == AV20DibLin )
                  {
                     /* Using cursor P02XJ8 */
                     pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n1826TipCilCod), Byte.valueOf(A1826TipCilCod)});
                     A1827TipCilDsc = P02XJ8_A1827TipCilDsc[0] ;
                     n1827TipCilDsc = P02XJ8_n1827TipCilDsc[0] ;
                     A2089DibLinMol = AV8DibLinMol ;
                     n2089DibLinMol = false ;
                     A1030DibRelMC = AV9DibRelMC ;
                     n1030DibRelMC = false ;
                     A1808DibOrdCil = AV10DibOrdCil ;
                     n1808DibOrdCil = false ;
                     A1826TipCilCod = AV11TipCilCod ;
                     n1826TipCilCod = false ;
                     A1827TipCilDsc = AV12TipCilDsc ;
                     n1827TipCilDsc = false ;
                     A1810DibPosCil = AV13DibPosCil ;
                     n1810DibPosCil = false ;
                     A4860DibPrcCob = AV14DibPrcCob ;
                     n4860DibPrcCob = false ;
                     A7026DibCilCod = AV15DibCilCod ;
                     n7026DibCilCod = false ;
                     A7027DibLinMalC = AV16DibLinMalC ;
                     n7027DibLinMalC = false ;
                     /* Using cursor P02XJ9 */
                     pr_default.execute(7, new Object[] {Boolean.valueOf(n1827TipCilDsc), A1827TipCilDsc, A396EmprCod, Boolean.valueOf(n1826TipCilCod), Byte.valueOf(A1826TipCilCod)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTIPCAB");
                     /* Using cursor P02XJ10 */
                     pr_default.execute(8, new Object[] {Boolean.valueOf(n2089DibLinMol), Byte.valueOf(A2089DibLinMol), Boolean.valueOf(n1030DibRelMC), A1030DibRelMC, Boolean.valueOf(n1808DibOrdCil), Byte.valueOf(A1808DibOrdCil), Boolean.valueOf(n1826TipCilCod), Byte.valueOf(A1826TipCilCod), Boolean.valueOf(n1810DibPosCil), Byte.valueOf(A1810DibPosCil), Boolean.valueOf(n4860DibPrcCob), A4860DibPrcCob, Boolean.valueOf(n7026DibCilCod), A7026DibCilCod, Boolean.valueOf(n7027DibLinMalC), A7027DibLinMalC, A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A1807DibLinCil)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDIBUC");
                  }
               }
            }
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pactcil.this.A396EmprCod;
      this.aP1[0] = pactcil.this.AV17CliCod;
      this.aP2[0] = pactcil.this.AV18DibInt;
      this.aP3[0] = pactcil.this.AV19DibCli;
      this.aP4[0] = pactcil.this.AV20DibLin;
      Application.commitDataStores(context, remoteHandle, pr_default, "pactcil");
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
      P02XJ2_A396EmprCod = new String[] {""} ;
      P02XJ2_A1807DibLinCil = new short[1] ;
      P02XJ2_A1013DibCli = new String[] {""} ;
      P02XJ2_A1014DibInt = new int[1] ;
      P02XJ2_A252CliCod = new int[1] ;
      P02XJ2_A2089DibLinMol = new byte[1] ;
      P02XJ2_n2089DibLinMol = new boolean[] {false} ;
      P02XJ2_A1030DibRelMC = new String[] {""} ;
      P02XJ2_n1030DibRelMC = new boolean[] {false} ;
      P02XJ2_A1808DibOrdCil = new byte[1] ;
      P02XJ2_n1808DibOrdCil = new boolean[] {false} ;
      P02XJ2_A1826TipCilCod = new byte[1] ;
      P02XJ2_n1826TipCilCod = new boolean[] {false} ;
      P02XJ2_A1827TipCilDsc = new String[] {""} ;
      P02XJ2_n1827TipCilDsc = new boolean[] {false} ;
      P02XJ2_A1810DibPosCil = new byte[1] ;
      P02XJ2_n1810DibPosCil = new boolean[] {false} ;
      P02XJ2_A4860DibPrcCob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XJ2_n4860DibPrcCob = new boolean[] {false} ;
      P02XJ2_A7026DibCilCod = new String[] {""} ;
      P02XJ2_n7026DibCilCod = new boolean[] {false} ;
      P02XJ2_A7027DibLinMalC = new String[] {""} ;
      P02XJ2_n7027DibLinMalC = new boolean[] {false} ;
      A1013DibCli = "" ;
      A1030DibRelMC = "" ;
      A1827TipCilDsc = "" ;
      A4860DibPrcCob = DecimalUtil.ZERO ;
      A7026DibCilCod = "" ;
      A7027DibLinMalC = "" ;
      AV9DibRelMC = "" ;
      AV12TipCilDsc = "" ;
      AV14DibPrcCob = DecimalUtil.ZERO ;
      AV15DibCilCod = "" ;
      AV16DibLinMalC = "" ;
      P02XJ3_A396EmprCod = new String[] {""} ;
      P02XJ3_A1807DibLinCil = new short[1] ;
      P02XJ3_A1013DibCli = new String[] {""} ;
      P02XJ3_A1014DibInt = new int[1] ;
      P02XJ3_A252CliCod = new int[1] ;
      P02XJ3_A2089DibLinMol = new byte[1] ;
      P02XJ3_n2089DibLinMol = new boolean[] {false} ;
      P02XJ3_A1030DibRelMC = new String[] {""} ;
      P02XJ3_n1030DibRelMC = new boolean[] {false} ;
      P02XJ3_A1808DibOrdCil = new byte[1] ;
      P02XJ3_n1808DibOrdCil = new boolean[] {false} ;
      P02XJ3_A1826TipCilCod = new byte[1] ;
      P02XJ3_n1826TipCilCod = new boolean[] {false} ;
      P02XJ3_A1810DibPosCil = new byte[1] ;
      P02XJ3_n1810DibPosCil = new boolean[] {false} ;
      P02XJ3_A4860DibPrcCob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XJ3_n4860DibPrcCob = new boolean[] {false} ;
      P02XJ3_A7026DibCilCod = new String[] {""} ;
      P02XJ3_n7026DibCilCod = new boolean[] {false} ;
      P02XJ3_A7027DibLinMalC = new String[] {""} ;
      P02XJ3_n7027DibLinMalC = new boolean[] {false} ;
      P02XJ4_A1827TipCilDsc = new String[] {""} ;
      P02XJ4_n1827TipCilDsc = new boolean[] {false} ;
      P02XJ7_A396EmprCod = new String[] {""} ;
      P02XJ7_A10510DibOrgLi = new short[1] ;
      P02XJ7_n10510DibOrgLi = new boolean[] {false} ;
      P02XJ7_A10509DibOrgCl = new String[] {""} ;
      P02XJ7_n10509DibOrgCl = new boolean[] {false} ;
      P02XJ7_A10508DibOrgIn = new int[1] ;
      P02XJ7_n10508DibOrgIn = new boolean[] {false} ;
      P02XJ7_A10511DibOrgClid = new int[1] ;
      P02XJ7_n10511DibOrgClid = new boolean[] {false} ;
      P02XJ7_A2089DibLinMol = new byte[1] ;
      P02XJ7_n2089DibLinMol = new boolean[] {false} ;
      P02XJ7_A1030DibRelMC = new String[] {""} ;
      P02XJ7_n1030DibRelMC = new boolean[] {false} ;
      P02XJ7_A1808DibOrdCil = new byte[1] ;
      P02XJ7_n1808DibOrdCil = new boolean[] {false} ;
      P02XJ7_A1826TipCilCod = new byte[1] ;
      P02XJ7_n1826TipCilCod = new boolean[] {false} ;
      P02XJ7_A1810DibPosCil = new byte[1] ;
      P02XJ7_n1810DibPosCil = new boolean[] {false} ;
      P02XJ7_A4860DibPrcCob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XJ7_n4860DibPrcCob = new boolean[] {false} ;
      P02XJ7_A7026DibCilCod = new String[] {""} ;
      P02XJ7_n7026DibCilCod = new boolean[] {false} ;
      P02XJ7_A7027DibLinMalC = new String[] {""} ;
      P02XJ7_n7027DibLinMalC = new boolean[] {false} ;
      P02XJ7_A1013DibCli = new String[] {""} ;
      P02XJ7_A252CliCod = new int[1] ;
      P02XJ7_A1014DibInt = new int[1] ;
      P02XJ7_A1807DibLinCil = new short[1] ;
      A10509DibOrgCl = "" ;
      P02XJ8_A1827TipCilDsc = new String[] {""} ;
      P02XJ8_n1827TipCilDsc = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pactcil__default(),
         new Object[] {
             new Object[] {
            P02XJ2_A396EmprCod, P02XJ2_A1807DibLinCil, P02XJ2_A1013DibCli, P02XJ2_A1014DibInt, P02XJ2_A252CliCod, P02XJ2_A2089DibLinMol, P02XJ2_n2089DibLinMol, P02XJ2_A1030DibRelMC, P02XJ2_n1030DibRelMC, P02XJ2_A1808DibOrdCil,
            P02XJ2_n1808DibOrdCil, P02XJ2_A1826TipCilCod, P02XJ2_n1826TipCilCod, P02XJ2_A1827TipCilDsc, P02XJ2_n1827TipCilDsc, P02XJ2_A1810DibPosCil, P02XJ2_n1810DibPosCil, P02XJ2_A4860DibPrcCob, P02XJ2_n4860DibPrcCob, P02XJ2_A7026DibCilCod,
            P02XJ2_n7026DibCilCod, P02XJ2_A7027DibLinMalC, P02XJ2_n7027DibLinMalC
            }
            , new Object[] {
            P02XJ3_A396EmprCod, P02XJ3_A1807DibLinCil, P02XJ3_A1013DibCli, P02XJ3_A1014DibInt, P02XJ3_A252CliCod, P02XJ3_A2089DibLinMol, P02XJ3_n2089DibLinMol, P02XJ3_A1030DibRelMC, P02XJ3_n1030DibRelMC, P02XJ3_A1808DibOrdCil,
            P02XJ3_n1808DibOrdCil, P02XJ3_A1826TipCilCod, P02XJ3_n1826TipCilCod, P02XJ3_A1810DibPosCil, P02XJ3_n1810DibPosCil, P02XJ3_A4860DibPrcCob, P02XJ3_n4860DibPrcCob, P02XJ3_A7026DibCilCod, P02XJ3_n7026DibCilCod, P02XJ3_A7027DibLinMalC,
            P02XJ3_n7027DibLinMalC
            }
            , new Object[] {
            P02XJ4_A1827TipCilDsc, P02XJ4_n1827TipCilDsc
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P02XJ7_A396EmprCod, P02XJ7_A10510DibOrgLi, P02XJ7_n10510DibOrgLi, P02XJ7_A10509DibOrgCl, P02XJ7_n10509DibOrgCl, P02XJ7_A10508DibOrgIn, P02XJ7_n10508DibOrgIn, P02XJ7_A10511DibOrgClid, P02XJ7_n10511DibOrgClid, P02XJ7_A2089DibLinMol,
            P02XJ7_n2089DibLinMol, P02XJ7_A1030DibRelMC, P02XJ7_n1030DibRelMC, P02XJ7_A1808DibOrdCil, P02XJ7_n1808DibOrdCil, P02XJ7_A1826TipCilCod, P02XJ7_n1826TipCilCod, P02XJ7_A1810DibPosCil, P02XJ7_n1810DibPosCil, P02XJ7_A4860DibPrcCob,
            P02XJ7_n4860DibPrcCob, P02XJ7_A7026DibCilCod, P02XJ7_n7026DibCilCod, P02XJ7_A7027DibLinMalC, P02XJ7_n7027DibLinMalC, P02XJ7_A1013DibCli, P02XJ7_A252CliCod, P02XJ7_A1014DibInt, P02XJ7_A1807DibLinCil
            }
            , new Object[] {
            P02XJ8_A1827TipCilDsc, P02XJ8_n1827TipCilDsc
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

   private byte A2089DibLinMol ;
   private byte A1808DibOrdCil ;
   private byte A1826TipCilCod ;
   private byte A1810DibPosCil ;
   private byte AV8DibLinMol ;
   private byte AV10DibOrdCil ;
   private byte AV11TipCilCod ;
   private byte AV13DibPosCil ;
   private short AV20DibLin ;
   private short A1807DibLinCil ;
   private short A10510DibOrgLi ;
   private short Gx_err ;
   private int AV17CliCod ;
   private int AV18DibInt ;
   private int A1014DibInt ;
   private int A252CliCod ;
   private int A10508DibOrgIn ;
   private int A10511DibOrgClid ;
   private java.math.BigDecimal A4860DibPrcCob ;
   private java.math.BigDecimal AV14DibPrcCob ;
   private String A396EmprCod ;
   private String AV19DibCli ;
   private String scmdbuf ;
   private String A1013DibCli ;
   private String A1030DibRelMC ;
   private String A1827TipCilDsc ;
   private String A7026DibCilCod ;
   private String A7027DibLinMalC ;
   private String AV9DibRelMC ;
   private String AV12TipCilDsc ;
   private String AV15DibCilCod ;
   private String AV16DibLinMalC ;
   private String A10509DibOrgCl ;
   private boolean n2089DibLinMol ;
   private boolean n1030DibRelMC ;
   private boolean n1808DibOrdCil ;
   private boolean n1826TipCilCod ;
   private boolean n1827TipCilDsc ;
   private boolean n1810DibPosCil ;
   private boolean n4860DibPrcCob ;
   private boolean n7026DibCilCod ;
   private boolean n7027DibLinMalC ;
   private boolean returnInSub ;
   private boolean n10510DibOrgLi ;
   private boolean n10509DibOrgCl ;
   private boolean n10508DibOrgIn ;
   private boolean n10511DibOrgClid ;
   private short[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P02XJ2_A396EmprCod ;
   private short[] P02XJ2_A1807DibLinCil ;
   private String[] P02XJ2_A1013DibCli ;
   private int[] P02XJ2_A1014DibInt ;
   private int[] P02XJ2_A252CliCod ;
   private byte[] P02XJ2_A2089DibLinMol ;
   private boolean[] P02XJ2_n2089DibLinMol ;
   private String[] P02XJ2_A1030DibRelMC ;
   private boolean[] P02XJ2_n1030DibRelMC ;
   private byte[] P02XJ2_A1808DibOrdCil ;
   private boolean[] P02XJ2_n1808DibOrdCil ;
   private byte[] P02XJ2_A1826TipCilCod ;
   private boolean[] P02XJ2_n1826TipCilCod ;
   private String[] P02XJ2_A1827TipCilDsc ;
   private boolean[] P02XJ2_n1827TipCilDsc ;
   private byte[] P02XJ2_A1810DibPosCil ;
   private boolean[] P02XJ2_n1810DibPosCil ;
   private java.math.BigDecimal[] P02XJ2_A4860DibPrcCob ;
   private boolean[] P02XJ2_n4860DibPrcCob ;
   private String[] P02XJ2_A7026DibCilCod ;
   private boolean[] P02XJ2_n7026DibCilCod ;
   private String[] P02XJ2_A7027DibLinMalC ;
   private boolean[] P02XJ2_n7027DibLinMalC ;
   private String[] P02XJ3_A396EmprCod ;
   private short[] P02XJ3_A1807DibLinCil ;
   private String[] P02XJ3_A1013DibCli ;
   private int[] P02XJ3_A1014DibInt ;
   private int[] P02XJ3_A252CliCod ;
   private byte[] P02XJ3_A2089DibLinMol ;
   private boolean[] P02XJ3_n2089DibLinMol ;
   private String[] P02XJ3_A1030DibRelMC ;
   private boolean[] P02XJ3_n1030DibRelMC ;
   private byte[] P02XJ3_A1808DibOrdCil ;
   private boolean[] P02XJ3_n1808DibOrdCil ;
   private byte[] P02XJ3_A1826TipCilCod ;
   private boolean[] P02XJ3_n1826TipCilCod ;
   private byte[] P02XJ3_A1810DibPosCil ;
   private boolean[] P02XJ3_n1810DibPosCil ;
   private java.math.BigDecimal[] P02XJ3_A4860DibPrcCob ;
   private boolean[] P02XJ3_n4860DibPrcCob ;
   private String[] P02XJ3_A7026DibCilCod ;
   private boolean[] P02XJ3_n7026DibCilCod ;
   private String[] P02XJ3_A7027DibLinMalC ;
   private boolean[] P02XJ3_n7027DibLinMalC ;
   private String[] P02XJ4_A1827TipCilDsc ;
   private boolean[] P02XJ4_n1827TipCilDsc ;
   private String[] P02XJ7_A396EmprCod ;
   private short[] P02XJ7_A10510DibOrgLi ;
   private boolean[] P02XJ7_n10510DibOrgLi ;
   private String[] P02XJ7_A10509DibOrgCl ;
   private boolean[] P02XJ7_n10509DibOrgCl ;
   private int[] P02XJ7_A10508DibOrgIn ;
   private boolean[] P02XJ7_n10508DibOrgIn ;
   private int[] P02XJ7_A10511DibOrgClid ;
   private boolean[] P02XJ7_n10511DibOrgClid ;
   private byte[] P02XJ7_A2089DibLinMol ;
   private boolean[] P02XJ7_n2089DibLinMol ;
   private String[] P02XJ7_A1030DibRelMC ;
   private boolean[] P02XJ7_n1030DibRelMC ;
   private byte[] P02XJ7_A1808DibOrdCil ;
   private boolean[] P02XJ7_n1808DibOrdCil ;
   private byte[] P02XJ7_A1826TipCilCod ;
   private boolean[] P02XJ7_n1826TipCilCod ;
   private byte[] P02XJ7_A1810DibPosCil ;
   private boolean[] P02XJ7_n1810DibPosCil ;
   private java.math.BigDecimal[] P02XJ7_A4860DibPrcCob ;
   private boolean[] P02XJ7_n4860DibPrcCob ;
   private String[] P02XJ7_A7026DibCilCod ;
   private boolean[] P02XJ7_n7026DibCilCod ;
   private String[] P02XJ7_A7027DibLinMalC ;
   private boolean[] P02XJ7_n7027DibLinMalC ;
   private String[] P02XJ7_A1013DibCli ;
   private int[] P02XJ7_A252CliCod ;
   private int[] P02XJ7_A1014DibInt ;
   private short[] P02XJ7_A1807DibLinCil ;
   private String[] P02XJ8_A1827TipCilDsc ;
   private boolean[] P02XJ8_n1827TipCilDsc ;
}

final  class pactcil__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02XJ2", "SELECT T1.EmprCod, T1.DibLinCil, T1.DibCli, T1.DibInt, T1.CliCod, T1.DibLinMol, T1.DibRelMC, T1.DibOrdCil, T1.TipCilCod, T2.TipCilDsc, T1.DibPosCil, T1.DibPrcCob, T1.DibCilCod, T1.DibLinMalC FROM (TXPLDIBUC T1 LEFT JOIN TXPTIPCAB T2 ON T2.EmprCod = T1.EmprCod AND T2.TipCilCod = T1.TipCilCod) WHERE T1.EmprCod = ? and T1.DibCli = ? and T1.CliCod = ? and T1.DibInt = ? and T1.DibLinCil = ? ORDER BY T1.EmprCod, T1.DibCli, T1.CliCod, T1.DibInt, T1.DibLinCil ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02XJ3", "SELECT EmprCod, DibLinCil, DibCli, DibInt, CliCod, DibLinMol, DibRelMC, DibOrdCil, TipCilCod, DibPosCil, DibPrcCob, DibCilCod, DibLinMalC FROM TXPLDIBUC WHERE (EmprCod = ? AND DibCli = ?) AND ((EmprCod = ? and DibCli = ?) AND (DibInt = ?) AND (DibLinCil = ?)) ORDER BY EmprCod, DibCli ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02XJ4", "SELECT TipCilDsc FROM TXPTIPCAB WHERE EmprCod = ? AND TipCilCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02XJ5", "UPDATE TXPTIPCAB SET TipCilDsc=?  WHERE EmprCod = ? AND TipCilCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTIPCAB")
         ,new UpdateCursor("P02XJ6", "UPDATE TXPLDIBUC SET DibLinMol=?, DibRelMC=?, DibOrdCil=?, TipCilCod=?, DibPosCil=?, DibPrcCob=?, DibCilCod=?, DibLinMalC=?  WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? AND DibLinCil = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLDIBUC")
         ,new ForEachCursor("P02XJ7", "SELECT EmprCod, DibOrgLi, DibOrgCl, DibOrgIn, DibOrgClid, DibLinMol, DibRelMC, DibOrdCil, TipCilCod, DibPosCil, DibPrcCob, DibCilCod, DibLinMalC, DibCli, CliCod, DibInt, DibLinCil FROM TXPLDIBUC WHERE (EmprCod = ?) AND ((EmprCod = ?) AND (DibOrgClid = ?) AND (DibOrgIn = ?) AND (DibOrgCl = ?) AND (DibOrgLi = ?)) ORDER BY EmprCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02XJ8", "SELECT TipCilDsc FROM TXPTIPCAB WHERE EmprCod = ? AND TipCilCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02XJ9", "UPDATE TXPTIPCAB SET TipCilDsc=?  WHERE EmprCod = ? AND TipCilCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTIPCAB")
         ,new UpdateCursor("P02XJ10", "UPDATE TXPLDIBUC SET DibLinMol=?, DibRelMC=?, DibOrdCil=?, TipCilCod=?, DibPosCil=?, DibPrcCob=?, DibCilCod=?, DibLinMalC=?  WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? AND DibLinCil = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLDIBUC")
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 5);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(14, 10);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 5);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 10);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 20);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 5);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 10);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 16);
               ((int[]) buf[26])[0] = rslt.getInt(15);
               ((int[]) buf[27])[0] = rslt.getInt(16);
               ((short[]) buf[28])[0] = rslt.getShort(17);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 10);
               }
               stmt.setString(2, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 20);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[7]).byteValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[9]).byteValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 5);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 10);
               }
               stmt.setString(9, (String)parms[16], 3);
               stmt.setString(10, (String)parms[17], 16);
               stmt.setInt(11, ((Number) parms[18]).intValue());
               stmt.setInt(12, ((Number) parms[19]).intValue());
               stmt.setShort(13, ((Number) parms[20]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 16);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 10);
               }
               stmt.setString(2, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               return;
            case 8 :
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 20);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[7]).byteValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[9]).byteValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 5);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 10);
               }
               stmt.setString(9, (String)parms[16], 3);
               stmt.setString(10, (String)parms[17], 16);
               stmt.setInt(11, ((Number) parms[18]).intValue());
               stmt.setInt(12, ((Number) parms[19]).intValue());
               stmt.setShort(13, ((Number) parms[20]).shortValue());
               return;
      }
   }

}

