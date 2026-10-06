package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcostext extends GXProcedure
{
   public pcostext( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcostext.class ), "" );
   }

   public pcostext( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 )
   {
      pcostext.this.aP2 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        java.math.BigDecimal[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             java.math.BigDecimal[] aP2 )
   {
      pcostext.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcostext.this.A7275Sup_Num = aP1[0];
      this.aP1 = aP1;
      pcostext.this.AV13Sup_difcos = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13Sup_difcos = DecimalUtil.doubleToDec(0) ;
      AV14Sup_CostL = DecimalUtil.doubleToDec(0) ;
      AV15Sup_PreExt = DecimalUtil.doubleToDec(0) ;
      AV16Sup_trnpu = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P02Z82 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A7275Sup_Num)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7281Sup_Und = P02Z82_A7281Sup_Und[0] ;
         n7281Sup_Und = P02Z82_n7281Sup_Und[0] ;
         A7286Sup_ConVap = P02Z82_A7286Sup_ConVap[0] ;
         n7286Sup_ConVap = P02Z82_n7286Sup_ConVap[0] ;
         A7299Sup_cacpp = P02Z82_A7299Sup_cacpp[0] ;
         n7299Sup_cacpp = P02Z82_n7299Sup_cacpp[0] ;
         A7612Sup_matipu = P02Z82_A7612Sup_matipu[0] ;
         n7612Sup_matipu = P02Z82_n7612Sup_matipu[0] ;
         A8426Sup_conmq = P02Z82_A8426Sup_conmq[0] ;
         n8426Sup_conmq = P02Z82_n8426Sup_conmq[0] ;
         A7613Sup_trnpu = P02Z82_A7613Sup_trnpu[0] ;
         n7613Sup_trnpu = P02Z82_n7613Sup_trnpu[0] ;
         AV16Sup_trnpu = A7613Sup_trnpu ;
         /* Using cursor P02Z83 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A7275Sup_Num)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A7657Sup_PreExt = P02Z83_A7657Sup_PreExt[0] ;
            n7657Sup_PreExt = P02Z83_n7657Sup_PreExt[0] ;
            A7342Sup_Lnf = P02Z83_A7342Sup_Lnf[0] ;
            A8425Sup_TmpC = P02Z83_A8425Sup_TmpC[0] ;
            n8425Sup_TmpC = P02Z83_n8425Sup_TmpC[0] ;
            A7614Sup_TmpA = P02Z83_A7614Sup_TmpA[0] ;
            n7614Sup_TmpA = P02Z83_n7614Sup_TmpA[0] ;
            A7351Sup_Tmp = P02Z83_A7351Sup_Tmp[0] ;
            n7351Sup_Tmp = P02Z83_n7351Sup_Tmp[0] ;
            A11932Sup_Nh2o = P02Z83_A11932Sup_Nh2o[0] ;
            n11932Sup_Nh2o = P02Z83_n11932Sup_Nh2o[0] ;
            A7615Sup_H20n = P02Z83_A7615Sup_H20n[0] ;
            n7615Sup_H20n = P02Z83_n7615Sup_H20n[0] ;
            A7349Sup_Vol = P02Z83_A7349Sup_Vol[0] ;
            n7349Sup_Vol = P02Z83_n7349Sup_Vol[0] ;
            A7617Sup_Reuso = P02Z83_A7617Sup_Reuso[0] ;
            n7617Sup_Reuso = P02Z83_n7617Sup_Reuso[0] ;
            A7608Sup_Scif = P02Z83_A7608Sup_Scif[0] ;
            n7608Sup_Scif = P02Z83_n7608Sup_Scif[0] ;
            A7607Sup_Smoi = P02Z83_A7607Sup_Smoi[0] ;
            n7607Sup_Smoi = P02Z83_n7607Sup_Smoi[0] ;
            A7346Sup_Cmaq = P02Z83_A7346Sup_Cmaq[0] ;
            n7346Sup_Cmaq = P02Z83_n7346Sup_Cmaq[0] ;
            A7347Sup_Tpp = P02Z83_A7347Sup_Tpp[0] ;
            n7347Sup_Tpp = P02Z83_n7347Sup_Tpp[0] ;
            A7606Sup_Smod = P02Z83_A7606Sup_Smod[0] ;
            n7606Sup_Smod = P02Z83_n7606Sup_Smod[0] ;
            A7357Sup_Tog = P02Z83_A7357Sup_Tog[0] ;
            n7357Sup_Tog = P02Z83_n7357Sup_Tog[0] ;
            A7609Sup_SProd = P02Z83_A7609Sup_SProd[0] ;
            n7609Sup_SProd = P02Z83_n7609Sup_SProd[0] ;
            if ( A7281Sup_Und == 0 )
            {
               A7352Sup_CVapor = DecimalUtil.doubleToDec(0) ;
            }
            else
            {
               if ( ( A7351Sup_Tmp - A7614Sup_TmpA ) <= 0 )
               {
                  A7352Sup_CVapor = DecimalUtil.doubleToDec(0) ;
               }
               else
               {
                  if ( ( A7281Sup_Und > 0 ) && ( ( A7351Sup_Tmp - A7614Sup_TmpA ) > 0 ) && ( A7349Sup_Vol > 0 ) )
                  {
                     A7352Sup_CVapor = (DecimalUtil.doubleToDec((A7351Sup_Tmp-A7614Sup_TmpA)).multiply(A7286Sup_ConVap).multiply(A7299Sup_cacpp).multiply(DecimalUtil.doubleToDec(A7349Sup_Vol))).divide(DecimalUtil.doubleToDec(A7281Sup_Und), 18, java.math.RoundingMode.DOWN) ;
                  }
                  else
                  {
                     if ( ( A8425Sup_TmpC > 0 ) && ( A7281Sup_Und > 0 ) )
                     {
                        A7352Sup_CVapor = (DecimalUtil.doubleToDec(A7281Sup_Und).multiply(A8426Sup_conmq).multiply(A7612Sup_matipu)).divide(DecimalUtil.doubleToDec(A7281Sup_Und), 18, java.math.RoundingMode.DOWN) ;
                     }
                     else
                     {
                        A7352Sup_CVapor = DecimalUtil.doubleToDec(0) ;
                     }
                  }
               }
            }
            if ( A7281Sup_Und == 0 )
            {
               A7350Sup_Ch2o = DecimalUtil.doubleToDec(0) ;
            }
            else
            {
               if ( GXutil.strcmp(A7617Sup_Reuso, httpContext.getMessage( "S", "")) == 0 )
               {
                  A7350Sup_Ch2o = DecimalUtil.doubleToDec(0) ;
               }
               else
               {
                  if ( ( A7281Sup_Und > 0 ) && ( GXutil.strcmp(A7617Sup_Reuso, httpContext.getMessage( "N", "")) == 0 ) )
                  {
                     A7350Sup_Ch2o = DecimalUtil.doubleToDec((A7349Sup_Vol/ (double) (A7281Sup_Und))).multiply(A7615Sup_H20n).multiply(DecimalUtil.doubleToDec(A11932Sup_Nh2o)) ;
                  }
                  else
                  {
                     A7350Sup_Ch2o = DecimalUtil.doubleToDec(0) ;
                  }
               }
            }
            getSup_SVal( A396EmprCod, A7275Sup_Num, A7342Sup_Lnf) ;
            if ( A7609Sup_SProd.doubleValue() == 0 )
            {
               A7610Sup_CMOD = DecimalUtil.doubleToDec(0) ;
            }
            else
            {
               if ( A7609Sup_SProd.doubleValue() > 0 )
               {
                  A7610Sup_CMOD = A7357Sup_Tog.multiply(A7606Sup_Smod).divide((A7609Sup_SProd.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)), 18, java.math.RoundingMode.DOWN) ;
               }
               else
               {
                  A7610Sup_CMOD = DecimalUtil.doubleToDec(0) ;
               }
            }
            A7627Sup_cifU = (A7608Sup_Scif.multiply(A7347Sup_Tpp)) ;
            A7626Sup_moiU = (A7607Sup_Smoi.multiply(A7347Sup_Tpp)) ;
            A7348Sup_TTF = A7347Sup_Tpp.multiply(A7346Sup_Cmaq) ;
            A7629Sup_CostL = A7610Sup_CMOD.add(A7361Sup_SVal).add(A7348Sup_TTF).add(A7626Sup_moiU).add(A7627Sup_cifU).add(A7350Sup_Ch2o).add(A7352Sup_CVapor) ;
            if ( A7657Sup_PreExt.doubleValue() == 0 )
            {
               AV14Sup_CostL = AV14Sup_CostL.add(A7629Sup_CostL) ;
            }
            if ( A7657Sup_PreExt.doubleValue() > 0 )
            {
               AV15Sup_PreExt = AV15Sup_PreExt.add(A7657Sup_PreExt) ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV13Sup_difcos = (AV14Sup_CostL.add(AV15Sup_PreExt).add(AV16Sup_trnpu)) ;
      cleanup();
   }

   public void getSup_SVal( String A396EmprCod ,
                            int A7275Sup_Num ,
                            int A7342Sup_Lnf )
   {
      /* Navigation */
      A7361Sup_SVal = DecimalUtil.ZERO ;
      /* Using cursor P02Z84 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A7275Sup_Num), Integer.valueOf(A7342Sup_Lnf)});
      while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P02Z84_A396EmprCod[0], A396EmprCod) == 0 ) && ( P02Z84_A7275Sup_Num[0] == A7275Sup_Num ) && ( P02Z84_A7342Sup_Lnf[0] == A7342Sup_Lnf ) )
      {
         if ( GXutil.strcmp(GXutil.substring( P02Z84_A7363Sup_Prdc[0], 1, 3), "OTR") != 0 )
         {
            A7367Sup_Val = (P02Z84_A7365Sup_Cant[0].multiply(P02Z84_A7366Sup_Prec[0])) ;
         }
         else
         {
            if ( GXutil.strcmp(GXutil.substring( P02Z84_A7363Sup_Prdc[0], 1, 3), "OTR") == 0 )
            {
               A7367Sup_Val = (P02Z84_A7365Sup_Cant[0].multiply(P02Z84_A7366Sup_Prec[0])) ;
            }
            else
            {
               A7367Sup_Val = DecimalUtil.doubleToDec(0) ;
            }
         }
         A7361Sup_SVal = A7361Sup_SVal.add(A7367Sup_Val) ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcostext.this.A396EmprCod;
      this.aP1[0] = pcostext.this.A7275Sup_Num;
      this.aP2[0] = pcostext.this.AV13Sup_difcos;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV14Sup_CostL = DecimalUtil.ZERO ;
      AV15Sup_PreExt = DecimalUtil.ZERO ;
      AV16Sup_trnpu = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P02Z82_A396EmprCod = new String[] {""} ;
      P02Z82_A7275Sup_Num = new int[1] ;
      P02Z82_A7281Sup_Und = new int[1] ;
      P02Z82_n7281Sup_Und = new boolean[] {false} ;
      P02Z82_A7286Sup_ConVap = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02Z82_n7286Sup_ConVap = new boolean[] {false} ;
      P02Z82_A7299Sup_cacpp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02Z82_n7299Sup_cacpp = new boolean[] {false} ;
      P02Z82_A7612Sup_matipu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02Z82_n7612Sup_matipu = new boolean[] {false} ;
      P02Z82_A8426Sup_conmq = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02Z82_n8426Sup_conmq = new boolean[] {false} ;
      P02Z82_A7613Sup_trnpu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02Z82_n7613Sup_trnpu = new boolean[] {false} ;
      A7286Sup_ConVap = DecimalUtil.ZERO ;
      A7299Sup_cacpp = DecimalUtil.ZERO ;
      A7612Sup_matipu = DecimalUtil.ZERO ;
      A8426Sup_conmq = DecimalUtil.ZERO ;
      A7613Sup_trnpu = DecimalUtil.ZERO ;
      P02Z83_A396EmprCod = new String[] {""} ;
      P02Z83_A7275Sup_Num = new int[1] ;
      P02Z83_A7657Sup_PreExt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02Z83_n7657Sup_PreExt = new boolean[] {false} ;
      P02Z83_A7342Sup_Lnf = new int[1] ;
      P02Z83_A8425Sup_TmpC = new short[1] ;
      P02Z83_n8425Sup_TmpC = new boolean[] {false} ;
      P02Z83_A7614Sup_TmpA = new short[1] ;
      P02Z83_n7614Sup_TmpA = new boolean[] {false} ;
      P02Z83_A7351Sup_Tmp = new short[1] ;
      P02Z83_n7351Sup_Tmp = new boolean[] {false} ;
      P02Z83_A11932Sup_Nh2o = new short[1] ;
      P02Z83_n11932Sup_Nh2o = new boolean[] {false} ;
      P02Z83_A7615Sup_H20n = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02Z83_n7615Sup_H20n = new boolean[] {false} ;
      P02Z83_A7349Sup_Vol = new int[1] ;
      P02Z83_n7349Sup_Vol = new boolean[] {false} ;
      P02Z83_A7617Sup_Reuso = new String[] {""} ;
      P02Z83_n7617Sup_Reuso = new boolean[] {false} ;
      P02Z83_A7608Sup_Scif = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02Z83_n7608Sup_Scif = new boolean[] {false} ;
      P02Z83_A7607Sup_Smoi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02Z83_n7607Sup_Smoi = new boolean[] {false} ;
      P02Z83_A7346Sup_Cmaq = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02Z83_n7346Sup_Cmaq = new boolean[] {false} ;
      P02Z83_A7347Sup_Tpp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02Z83_n7347Sup_Tpp = new boolean[] {false} ;
      P02Z83_A7606Sup_Smod = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02Z83_n7606Sup_Smod = new boolean[] {false} ;
      P02Z83_A7357Sup_Tog = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02Z83_n7357Sup_Tog = new boolean[] {false} ;
      P02Z83_A7609Sup_SProd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02Z83_n7609Sup_SProd = new boolean[] {false} ;
      A7657Sup_PreExt = DecimalUtil.ZERO ;
      A7615Sup_H20n = DecimalUtil.ZERO ;
      A7617Sup_Reuso = "" ;
      A7608Sup_Scif = DecimalUtil.ZERO ;
      A7607Sup_Smoi = DecimalUtil.ZERO ;
      A7346Sup_Cmaq = DecimalUtil.ZERO ;
      A7347Sup_Tpp = DecimalUtil.ZERO ;
      A7606Sup_Smod = DecimalUtil.ZERO ;
      A7357Sup_Tog = DecimalUtil.ZERO ;
      A7609Sup_SProd = DecimalUtil.ZERO ;
      A7352Sup_CVapor = DecimalUtil.ZERO ;
      A7350Sup_Ch2o = DecimalUtil.ZERO ;
      A7610Sup_CMOD = DecimalUtil.ZERO ;
      A7627Sup_cifU = DecimalUtil.ZERO ;
      A7626Sup_moiU = DecimalUtil.ZERO ;
      A7348Sup_TTF = DecimalUtil.ZERO ;
      A7629Sup_CostL = DecimalUtil.ZERO ;
      A7361Sup_SVal = DecimalUtil.ZERO ;
      P02Z84_A396EmprCod = new String[] {""} ;
      P02Z84_A7275Sup_Num = new int[1] ;
      P02Z84_A7342Sup_Lnf = new int[1] ;
      P02Z84_A7362Sup_Lp = new short[1] ;
      P02Z84_A7363Sup_Prdc = new String[] {""} ;
      P02Z84_n7363Sup_Prdc = new boolean[] {false} ;
      P02Z84_A7366Sup_Prec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02Z84_n7366Sup_Prec = new boolean[] {false} ;
      P02Z84_A7365Sup_Cant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02Z84_n7365Sup_Cant = new boolean[] {false} ;
      A7367Sup_Val = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcostext__default(),
         new Object[] {
             new Object[] {
            P02Z82_A396EmprCod, P02Z82_A7275Sup_Num, P02Z82_A7281Sup_Und, P02Z82_n7281Sup_Und, P02Z82_A7286Sup_ConVap, P02Z82_n7286Sup_ConVap, P02Z82_A7299Sup_cacpp, P02Z82_n7299Sup_cacpp, P02Z82_A7612Sup_matipu, P02Z82_n7612Sup_matipu,
            P02Z82_A8426Sup_conmq, P02Z82_n8426Sup_conmq, P02Z82_A7613Sup_trnpu, P02Z82_n7613Sup_trnpu
            }
            , new Object[] {
            P02Z83_A396EmprCod, P02Z83_A7275Sup_Num, P02Z83_A7657Sup_PreExt, P02Z83_n7657Sup_PreExt, P02Z83_A7342Sup_Lnf, P02Z83_A8425Sup_TmpC, P02Z83_n8425Sup_TmpC, P02Z83_A7614Sup_TmpA, P02Z83_n7614Sup_TmpA, P02Z83_A7351Sup_Tmp,
            P02Z83_n7351Sup_Tmp, P02Z83_A11932Sup_Nh2o, P02Z83_n11932Sup_Nh2o, P02Z83_A7615Sup_H20n, P02Z83_n7615Sup_H20n, P02Z83_A7349Sup_Vol, P02Z83_n7349Sup_Vol, P02Z83_A7617Sup_Reuso, P02Z83_n7617Sup_Reuso, P02Z83_A7608Sup_Scif,
            P02Z83_n7608Sup_Scif, P02Z83_A7607Sup_Smoi, P02Z83_n7607Sup_Smoi, P02Z83_A7346Sup_Cmaq, P02Z83_n7346Sup_Cmaq, P02Z83_A7347Sup_Tpp, P02Z83_n7347Sup_Tpp, P02Z83_A7606Sup_Smod, P02Z83_n7606Sup_Smod, P02Z83_A7357Sup_Tog,
            P02Z83_n7357Sup_Tog, P02Z83_A7609Sup_SProd, P02Z83_n7609Sup_SProd
            }
            , new Object[] {
            P02Z84_A396EmprCod, P02Z84_A7275Sup_Num, P02Z84_A7342Sup_Lnf, P02Z84_A7362Sup_Lp, P02Z84_A7363Sup_Prdc, P02Z84_n7363Sup_Prdc, P02Z84_A7366Sup_Prec, P02Z84_n7366Sup_Prec, P02Z84_A7365Sup_Cant, P02Z84_n7365Sup_Cant
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A8425Sup_TmpC ;
   private short A7614Sup_TmpA ;
   private short A7351Sup_Tmp ;
   private short A11932Sup_Nh2o ;
   private short Gx_err ;
   private int A7275Sup_Num ;
   private int A7281Sup_Und ;
   private int A7342Sup_Lnf ;
   private int A7349Sup_Vol ;
   private java.math.BigDecimal AV13Sup_difcos ;
   private java.math.BigDecimal AV14Sup_CostL ;
   private java.math.BigDecimal AV15Sup_PreExt ;
   private java.math.BigDecimal AV16Sup_trnpu ;
   private java.math.BigDecimal A7286Sup_ConVap ;
   private java.math.BigDecimal A7299Sup_cacpp ;
   private java.math.BigDecimal A7612Sup_matipu ;
   private java.math.BigDecimal A8426Sup_conmq ;
   private java.math.BigDecimal A7613Sup_trnpu ;
   private java.math.BigDecimal A7657Sup_PreExt ;
   private java.math.BigDecimal A7615Sup_H20n ;
   private java.math.BigDecimal A7608Sup_Scif ;
   private java.math.BigDecimal A7607Sup_Smoi ;
   private java.math.BigDecimal A7346Sup_Cmaq ;
   private java.math.BigDecimal A7347Sup_Tpp ;
   private java.math.BigDecimal A7606Sup_Smod ;
   private java.math.BigDecimal A7357Sup_Tog ;
   private java.math.BigDecimal A7609Sup_SProd ;
   private java.math.BigDecimal A7352Sup_CVapor ;
   private java.math.BigDecimal A7350Sup_Ch2o ;
   private java.math.BigDecimal A7610Sup_CMOD ;
   private java.math.BigDecimal A7627Sup_cifU ;
   private java.math.BigDecimal A7626Sup_moiU ;
   private java.math.BigDecimal A7348Sup_TTF ;
   private java.math.BigDecimal A7629Sup_CostL ;
   private java.math.BigDecimal A7361Sup_SVal ;
   private java.math.BigDecimal A7367Sup_Val ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A7617Sup_Reuso ;
   private boolean n7281Sup_Und ;
   private boolean n7286Sup_ConVap ;
   private boolean n7299Sup_cacpp ;
   private boolean n7612Sup_matipu ;
   private boolean n8426Sup_conmq ;
   private boolean n7613Sup_trnpu ;
   private boolean n7657Sup_PreExt ;
   private boolean n8425Sup_TmpC ;
   private boolean n7614Sup_TmpA ;
   private boolean n7351Sup_Tmp ;
   private boolean n11932Sup_Nh2o ;
   private boolean n7615Sup_H20n ;
   private boolean n7349Sup_Vol ;
   private boolean n7617Sup_Reuso ;
   private boolean n7608Sup_Scif ;
   private boolean n7607Sup_Smoi ;
   private boolean n7346Sup_Cmaq ;
   private boolean n7347Sup_Tpp ;
   private boolean n7606Sup_Smod ;
   private boolean n7357Sup_Tog ;
   private boolean n7609Sup_SProd ;
   private java.math.BigDecimal[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P02Z82_A396EmprCod ;
   private int[] P02Z82_A7275Sup_Num ;
   private int[] P02Z82_A7281Sup_Und ;
   private boolean[] P02Z82_n7281Sup_Und ;
   private java.math.BigDecimal[] P02Z82_A7286Sup_ConVap ;
   private boolean[] P02Z82_n7286Sup_ConVap ;
   private java.math.BigDecimal[] P02Z82_A7299Sup_cacpp ;
   private boolean[] P02Z82_n7299Sup_cacpp ;
   private java.math.BigDecimal[] P02Z82_A7612Sup_matipu ;
   private boolean[] P02Z82_n7612Sup_matipu ;
   private java.math.BigDecimal[] P02Z82_A8426Sup_conmq ;
   private boolean[] P02Z82_n8426Sup_conmq ;
   private java.math.BigDecimal[] P02Z82_A7613Sup_trnpu ;
   private boolean[] P02Z82_n7613Sup_trnpu ;
   private String[] P02Z83_A396EmprCod ;
   private int[] P02Z83_A7275Sup_Num ;
   private java.math.BigDecimal[] P02Z83_A7657Sup_PreExt ;
   private boolean[] P02Z83_n7657Sup_PreExt ;
   private int[] P02Z83_A7342Sup_Lnf ;
   private short[] P02Z83_A8425Sup_TmpC ;
   private boolean[] P02Z83_n8425Sup_TmpC ;
   private short[] P02Z83_A7614Sup_TmpA ;
   private boolean[] P02Z83_n7614Sup_TmpA ;
   private short[] P02Z83_A7351Sup_Tmp ;
   private boolean[] P02Z83_n7351Sup_Tmp ;
   private short[] P02Z83_A11932Sup_Nh2o ;
   private boolean[] P02Z83_n11932Sup_Nh2o ;
   private java.math.BigDecimal[] P02Z83_A7615Sup_H20n ;
   private boolean[] P02Z83_n7615Sup_H20n ;
   private int[] P02Z83_A7349Sup_Vol ;
   private boolean[] P02Z83_n7349Sup_Vol ;
   private String[] P02Z83_A7617Sup_Reuso ;
   private boolean[] P02Z83_n7617Sup_Reuso ;
   private java.math.BigDecimal[] P02Z83_A7608Sup_Scif ;
   private boolean[] P02Z83_n7608Sup_Scif ;
   private java.math.BigDecimal[] P02Z83_A7607Sup_Smoi ;
   private boolean[] P02Z83_n7607Sup_Smoi ;
   private java.math.BigDecimal[] P02Z83_A7346Sup_Cmaq ;
   private boolean[] P02Z83_n7346Sup_Cmaq ;
   private java.math.BigDecimal[] P02Z83_A7347Sup_Tpp ;
   private boolean[] P02Z83_n7347Sup_Tpp ;
   private java.math.BigDecimal[] P02Z83_A7606Sup_Smod ;
   private boolean[] P02Z83_n7606Sup_Smod ;
   private java.math.BigDecimal[] P02Z83_A7357Sup_Tog ;
   private boolean[] P02Z83_n7357Sup_Tog ;
   private java.math.BigDecimal[] P02Z83_A7609Sup_SProd ;
   private boolean[] P02Z83_n7609Sup_SProd ;
   private String[] P02Z84_A396EmprCod ;
   private int[] P02Z84_A7275Sup_Num ;
   private int[] P02Z84_A7342Sup_Lnf ;
   private short[] P02Z84_A7362Sup_Lp ;
   private String[] P02Z84_A7363Sup_Prdc ;
   private boolean[] P02Z84_n7363Sup_Prdc ;
   private java.math.BigDecimal[] P02Z84_A7366Sup_Prec ;
   private boolean[] P02Z84_n7366Sup_Prec ;
   private java.math.BigDecimal[] P02Z84_A7365Sup_Cant ;
   private boolean[] P02Z84_n7365Sup_Cant ;
}

final  class pcostext__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02Z82", "SELECT EmprCod, Sup_Num, Sup_Und, Sup_ConVap, Sup_cacpp, Sup_matipu, Sup_conmq, Sup_trnpu FROM TXPCOST00 WHERE EmprCod = ? and Sup_Num = ? ORDER BY EmprCod, Sup_Num ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02Z83", "SELECT EmprCod, Sup_Num, Sup_PreExt, Sup_Lnf, Sup_TmpC, Sup_TmpA, Sup_Tmp, Sup_Nh2o, Sup_H20n, Sup_Vol, Sup_Reuso, Sup_Scif, Sup_Smoi, Sup_Cmaq, Sup_Tpp, Sup_Smod, Sup_Tog, Sup_SProd FROM TXPCOST01 WHERE EmprCod = ? and Sup_Num = ? ORDER BY EmprCod, Sup_Num, Sup_Lnf ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02Z84", "SELECT EmprCod, Sup_Num, Sup_Lnf, Sup_Lp, Sup_Prdc, Sup_Prec, Sup_Cant FROM TXPCOST0p WHERE EmprCod = ? AND Sup_Num = ? AND Sup_Lnf = ? ORDER BY EmprCod, Sup_Num, Sup_Lnf ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,3);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(14,4);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

