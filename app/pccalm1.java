package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pccalm1 extends GXProcedure
{
   public pccalm1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pccalm1.class ), "" );
   }

   public pccalm1( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     String[] aP1 ,
                                     java.math.BigDecimal[] aP2 ,
                                     String[] aP3 ,
                                     java.math.BigDecimal[] aP4 ,
                                     String[] aP5 ,
                                     String[] aP6 ,
                                     java.util.Date[] aP7 )
   {
      pccalm1.this.aP8 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        java.util.Date[] aP7 ,
                        java.util.Date[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             java.util.Date[] aP7 ,
                             java.util.Date[] aP8 )
   {
      pccalm1.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pccalm1.this.AV8PrdNum = aP1[0];
      this.aP1 = aP1;
      pccalm1.this.AV9CCStkCanE = aP2[0];
      this.aP2 = aP2;
      pccalm1.this.AV11TipMovCc = aP3[0];
      this.aP3 = aP3;
      pccalm1.this.AV13CCStkPre = aP4[0];
      this.aP4 = aP4;
      pccalm1.this.AV19CCStkUsu = aP5[0];
      this.aP5 = aP5;
      pccalm1.this.AV20CCStkDsc = aP6[0];
      this.aP6 = aP6;
      pccalm1.this.AV33Recfec = aP7[0];
      this.aP7 = aP7;
      pccalm1.this.AV34Recfechr = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV36EliotLavanderia ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "LELIOT", ""), GXv_int2) ;
      pccalm1.this.GXt_int1 = GXv_int2[0] ;
      AV36EliotLavanderia = GXt_int1 ;
      GXv_int2[0] = AV31NCLec ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NCLEC", ""), GXv_int2) ;
      pccalm1.this.AV31NCLec = GXv_int2[0] ;
      /* Using cursor P03JR2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV8PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P03JR2_A719PrdNum[0] ;
         A8910CC_Ultln = P03JR2_A8910CC_Ultln[0] ;
         n8910CC_Ultln = P03JR2_n8910CC_Ultln[0] ;
         AV22CCStkULin = A8910CC_Ultln ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P03JR3 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV8PrdNum, AV33Recfec});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A8920CC_ExiReaC = P03JR3_A8920CC_ExiReaC[0] ;
         n8920CC_ExiReaC = P03JR3_n8920CC_ExiReaC[0] ;
         A8908CC_AlmCod = P03JR3_A8908CC_AlmCod[0] ;
         n8908CC_AlmCod = P03JR3_n8908CC_AlmCod[0] ;
         A810RecFec = P03JR3_A810RecFec[0] ;
         A719PrdNum = P03JR3_A719PrdNum[0] ;
         A8923CC_Estado = P03JR3_A8923CC_Estado[0] ;
         n8923CC_Estado = P03JR3_n8923CC_Estado[0] ;
         W719PrdNum = A719PrdNum ;
         AV22CCStkULin = (long)(AV22CCStkULin+5) ;
         /*
            INSERT RECORD ON TABLE TXPCCALM

         */
         W719PrdNum = A719PrdNum ;
         W8908CC_AlmCod = A8908CC_AlmCod ;
         n8908CC_AlmCod = false ;
         A719PrdNum = AV8PrdNum ;
         A8911CC_Lin = AV22CCStkULin ;
         A8915CC_Cant = A8920CC_ExiReaC ;
         n8915CC_Cant = false ;
         A3345TipMovCc = AV11TipMovCc ;
         n3345TipMovCc = false ;
         A8912CC_Fech = GXutil.serverNow( context, remoteHandle, pr_default) ;
         n8912CC_Fech = false ;
         A8917CC_Prec = AV13CCStkPre ;
         n8917CC_Prec = false ;
         n8908CC_AlmCod = false ;
         A8916CC_Desc = AV20CCStkDsc ;
         n8916CC_Desc = false ;
         GXt_char3 = A8914CC_Term ;
         GXv_char4[0] = GXt_char3 ;
         new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
         pccalm1.this.GXt_char3 = GXv_char4[0] ;
         A8914CC_Term = GXt_char3 ;
         n8914CC_Term = false ;
         A8913CC_Usu = AV19CCStkUsu ;
         n8913CC_Usu = false ;
         A8927CC_NumAlb = 99999999 ;
         n8927CC_NumAlb = false ;
         A8930CC_HDR = " " ;
         n8930CC_HDR = false ;
         A8931CC_Hdr1 = 0 ;
         n8931CC_Hdr1 = false ;
         A8932CC_Hdr2 = (byte)(0) ;
         n8932CC_Hdr2 = false ;
         A8933CC_Hdr3 = " " ;
         n8933CC_Hdr3 = false ;
         /* Using cursor P03JR4 */
         pr_default.execute(2, new Object[] {A396EmprCod, A719PrdNum, Long.valueOf(A8911CC_Lin), Boolean.valueOf(n8912CC_Fech), A8912CC_Fech, Boolean.valueOf(n8913CC_Usu), A8913CC_Usu, Boolean.valueOf(n8914CC_Term), A8914CC_Term, Boolean.valueOf(n8915CC_Cant), A8915CC_Cant, Boolean.valueOf(n8908CC_AlmCod), Byte.valueOf(A8908CC_AlmCod), Boolean.valueOf(n3345TipMovCc), A3345TipMovCc, Boolean.valueOf(n8916CC_Desc), A8916CC_Desc, Boolean.valueOf(n8917CC_Prec), A8917CC_Prec, Boolean.valueOf(n8927CC_NumAlb), Integer.valueOf(A8927CC_NumAlb), Boolean.valueOf(n8930CC_HDR), A8930CC_HDR, Boolean.valueOf(n8931CC_Hdr1), Integer.valueOf(A8931CC_Hdr1), Boolean.valueOf(n8932CC_Hdr2), Byte.valueOf(A8932CC_Hdr2), Boolean.valueOf(n8933CC_Hdr3), A8933CC_Hdr3});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCALM");
         if ( (pr_default.getStatus(2) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A719PrdNum = W719PrdNum ;
         A8908CC_AlmCod = W8908CC_AlmCod ;
         n8908CC_AlmCod = false ;
         /* End Insert */
         A8923CC_Estado = (byte)(1) ;
         n8923CC_Estado = false ;
         AV32CC_AlmCod = A8908CC_AlmCod ;
         AV35ExiReaCC = A8920CC_ExiReaC ;
         /* Execute user subroutine: 'INVALM' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'PRDALM' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( ( AV36EliotLavanderia == 1 ) && ( A8908CC_AlmCod == 8 ) )
         {
            GXv_char4[0] = A396EmprCod ;
            GXv_char5[0] = A719PrdNum ;
            new app.pdvrecuento(remoteHandle, context).execute( GXv_char4, GXv_char5) ;
            pccalm1.this.A396EmprCod = GXv_char4[0] ;
            pccalm1.this.A719PrdNum = GXv_char5[0] ;
            AV37EntFecent = GXutil.resetTime(GXutil.serverNow( context, remoteHandle, pr_default)) ;
            GXv_char5[0] = A396EmprCod ;
            GXv_char4[0] = A719PrdNum ;
            GXv_int6[0] = AV38DVUltLinEnt ;
            GXv_decimal7[0] = AV39DVPrdPreAct ;
            GXv_int8[0] = AV40DVPrvNum ;
            new app.preadproduc(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_int6, GXv_decimal7, GXv_int8) ;
            pccalm1.this.A396EmprCod = GXv_char5[0] ;
            pccalm1.this.A719PrdNum = GXv_char4[0] ;
            pccalm1.this.AV38DVUltLinEnt = GXv_int6[0] ;
            pccalm1.this.AV39DVPrdPreAct = GXv_decimal7[0] ;
            pccalm1.this.AV40DVPrvNum = GXv_int8[0] ;
            GXv_char5[0] = A396EmprCod ;
            GXv_char4[0] = A719PrdNum ;
            GXv_decimal7[0] = A8920CC_ExiReaC ;
            GXv_int9[0] = 0 ;
            GXv_date10[0] = AV37EntFecent ;
            GXv_char11[0] = httpContext.getMessage( "Movimiento creado desde Inventario de Insumos", "") ;
            GXv_char12[0] = httpContext.getMessage( "Entrada por Inventario", "") ;
            GXv_int6[0] = AV38DVUltLinEnt ;
            GXv_decimal13[0] = AV39DVPrdPreAct ;
            GXv_int8[0] = AV40DVPrvNum ;
            new app.pdventalm(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_decimal7, GXv_int9, GXv_date10, GXv_char11, GXv_char12, GXv_int6, GXv_decimal13, GXv_int8) ;
            pccalm1.this.A396EmprCod = GXv_char5[0] ;
            pccalm1.this.A719PrdNum = GXv_char4[0] ;
            pccalm1.this.A8920CC_ExiReaC = GXv_decimal7[0] ;
            pccalm1.this.AV37EntFecent = GXv_date10[0] ;
            pccalm1.this.AV38DVUltLinEnt = GXv_int6[0] ;
            pccalm1.this.AV39DVPrdPreAct = GXv_decimal13[0] ;
            pccalm1.this.AV40DVPrvNum = GXv_int8[0] ;
            GXv_char12[0] = A396EmprCod ;
            GXv_char11[0] = A719PrdNum ;
            GXv_decimal13[0] = A8920CC_ExiReaC ;
            GXv_int9[0] = 0 ;
            GXv_date10[0] = AV37EntFecent ;
            GXv_char5[0] = httpContext.getMessage( "Movimiento creado desde Inventario de Insumos", "") ;
            GXv_char4[0] = httpContext.getMessage( "Entrada por Inventario", "") ;
            new app.pdvccstks(remoteHandle, context).execute( GXv_char12, GXv_char11, GXv_decimal13, GXv_int9, GXv_date10, GXv_char5, GXv_char4) ;
            pccalm1.this.A396EmprCod = GXv_char12[0] ;
            pccalm1.this.A719PrdNum = GXv_char11[0] ;
            pccalm1.this.A8920CC_ExiReaC = GXv_decimal13[0] ;
            pccalm1.this.AV37EntFecent = GXv_date10[0] ;
         }
         /* Using cursor P03JR5 */
         pr_default.execute(3, new Object[] {Boolean.valueOf(n8923CC_Estado), Byte.valueOf(A8923CC_Estado), A396EmprCod, A719PrdNum, A810RecFec, Boolean.valueOf(n8908CC_AlmCod), Byte.valueOf(A8908CC_AlmCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECALM");
         A719PrdNum = W719PrdNum ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      n8910CC_Ultln = false ;
      /* Optimized UPDATE. */
      /* Using cursor P03JR6 */
      pr_default.execute(4, new Object[] {Boolean.valueOf(n8910CC_Ultln), Long.valueOf(AV22CCStkULin), A396EmprCod, AV8PrdNum});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
      /* End optimized UPDATE. */
      if ( AV31NCLec == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pccalm1");
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'PRDALM' Routine */
      returnInSub = false ;
      n8918CC_ExisCC = false ;
      /* Optimized UPDATE. */
      /* Using cursor P03JR7 */
      pr_default.execute(5, new Object[] {Boolean.valueOf(n8918CC_ExisCC), AV35ExiReaCC, A396EmprCod, AV8PrdNum, Byte.valueOf(AV32CC_AlmCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRDALM");
      /* End optimized UPDATE. */
   }

   public void S121( )
   {
      /* 'INVALM' Routine */
      returnInSub = false ;
      n8924Inv_Status = false ;
      /* Optimized UPDATE. */
      /* Using cursor P03JR8 */
      pr_default.execute(6, new Object[] {A396EmprCod, AV8PrdNum, AV34Recfechr, Byte.valueOf(AV32CC_AlmCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINVALM");
      /* End optimized UPDATE. */
   }

   protected void cleanup( )
   {
      this.aP0[0] = pccalm1.this.A396EmprCod;
      this.aP1[0] = pccalm1.this.AV8PrdNum;
      this.aP2[0] = pccalm1.this.AV9CCStkCanE;
      this.aP3[0] = pccalm1.this.AV11TipMovCc;
      this.aP4[0] = pccalm1.this.AV13CCStkPre;
      this.aP5[0] = pccalm1.this.AV19CCStkUsu;
      this.aP6[0] = pccalm1.this.AV20CCStkDsc;
      this.aP7[0] = pccalm1.this.AV33Recfec;
      this.aP8[0] = pccalm1.this.AV34Recfechr;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P03JR2_A396EmprCod = new String[] {""} ;
      P03JR2_A719PrdNum = new String[] {""} ;
      P03JR2_A8910CC_Ultln = new long[1] ;
      P03JR2_n8910CC_Ultln = new boolean[] {false} ;
      A719PrdNum = "" ;
      P03JR3_A396EmprCod = new String[] {""} ;
      P03JR3_A8920CC_ExiReaC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03JR3_n8920CC_ExiReaC = new boolean[] {false} ;
      P03JR3_A8908CC_AlmCod = new byte[1] ;
      P03JR3_n8908CC_AlmCod = new boolean[] {false} ;
      P03JR3_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P03JR3_A719PrdNum = new String[] {""} ;
      P03JR3_A8923CC_Estado = new byte[1] ;
      P03JR3_n8923CC_Estado = new boolean[] {false} ;
      A8920CC_ExiReaC = DecimalUtil.ZERO ;
      A810RecFec = GXutil.nullDate() ;
      W719PrdNum = "" ;
      A8915CC_Cant = DecimalUtil.ZERO ;
      A3345TipMovCc = "" ;
      A8912CC_Fech = GXutil.resetTime( GXutil.nullDate() );
      A8917CC_Prec = DecimalUtil.ZERO ;
      A8916CC_Desc = "" ;
      A8914CC_Term = "" ;
      GXt_char3 = "" ;
      A8913CC_Usu = "" ;
      A8930CC_HDR = "" ;
      A8933CC_Hdr3 = "" ;
      Gx_emsg = "" ;
      AV35ExiReaCC = DecimalUtil.ZERO ;
      AV37EntFecent = GXutil.nullDate() ;
      AV39DVPrdPreAct = DecimalUtil.ZERO ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_int6 = new short[1] ;
      GXv_int8 = new int[1] ;
      GXv_char12 = new String[1] ;
      GXv_char11 = new String[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_int9 = new long[1] ;
      GXv_date10 = new java.util.Date[1] ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      A8918CC_ExisCC = DecimalUtil.ZERO ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pccalm1__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pccalm1__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pccalm1__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pccalm1__default(),
         new Object[] {
             new Object[] {
            P03JR2_A396EmprCod, P03JR2_A719PrdNum, P03JR2_A8910CC_Ultln, P03JR2_n8910CC_Ultln
            }
            , new Object[] {
            P03JR3_A396EmprCod, P03JR3_A8920CC_ExiReaC, P03JR3_n8920CC_ExiReaC, P03JR3_A8908CC_AlmCod, P03JR3_A810RecFec, P03JR3_A719PrdNum, P03JR3_A8923CC_Estado, P03JR3_n8923CC_Estado
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
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

   private byte AV36EliotLavanderia ;
   private byte GXt_int1 ;
   private byte AV31NCLec ;
   private byte GXv_int2[] ;
   private byte A8908CC_AlmCod ;
   private byte A8923CC_Estado ;
   private byte W8908CC_AlmCod ;
   private byte A8932CC_Hdr2 ;
   private byte AV32CC_AlmCod ;
   private short Gx_err ;
   private short AV38DVUltLinEnt ;
   private short GXv_int6[] ;
   private int GX_INS1212 ;
   private int A8927CC_NumAlb ;
   private int A8931CC_Hdr1 ;
   private int AV40DVPrvNum ;
   private int GXv_int8[] ;
   private long A8910CC_Ultln ;
   private long AV22CCStkULin ;
   private long A8911CC_Lin ;
   private long GXv_int9[] ;
   private java.math.BigDecimal AV9CCStkCanE ;
   private java.math.BigDecimal AV13CCStkPre ;
   private java.math.BigDecimal A8920CC_ExiReaC ;
   private java.math.BigDecimal A8915CC_Cant ;
   private java.math.BigDecimal A8917CC_Prec ;
   private java.math.BigDecimal AV35ExiReaCC ;
   private java.math.BigDecimal AV39DVPrdPreAct ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal A8918CC_ExisCC ;
   private String A396EmprCod ;
   private String AV8PrdNum ;
   private String AV11TipMovCc ;
   private String AV19CCStkUsu ;
   private String AV20CCStkDsc ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String W719PrdNum ;
   private String A3345TipMovCc ;
   private String A8916CC_Desc ;
   private String A8914CC_Term ;
   private String GXt_char3 ;
   private String A8913CC_Usu ;
   private String A8930CC_HDR ;
   private String A8933CC_Hdr3 ;
   private String Gx_emsg ;
   private String GXv_char12[] ;
   private String GXv_char11[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private java.util.Date AV34Recfechr ;
   private java.util.Date A8912CC_Fech ;
   private java.util.Date AV33Recfec ;
   private java.util.Date A810RecFec ;
   private java.util.Date AV37EntFecent ;
   private java.util.Date GXv_date10[] ;
   private boolean n8910CC_Ultln ;
   private boolean n8920CC_ExiReaC ;
   private boolean n8908CC_AlmCod ;
   private boolean n8923CC_Estado ;
   private boolean n8915CC_Cant ;
   private boolean n3345TipMovCc ;
   private boolean n8912CC_Fech ;
   private boolean n8917CC_Prec ;
   private boolean n8916CC_Desc ;
   private boolean n8914CC_Term ;
   private boolean n8913CC_Usu ;
   private boolean n8927CC_NumAlb ;
   private boolean n8930CC_HDR ;
   private boolean n8931CC_Hdr1 ;
   private boolean n8932CC_Hdr2 ;
   private boolean n8933CC_Hdr3 ;
   private boolean returnInSub ;
   private boolean n8918CC_ExisCC ;
   private boolean n8924Inv_Status ;
   private java.util.Date[] aP8 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private java.util.Date[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P03JR2_A396EmprCod ;
   private String[] P03JR2_A719PrdNum ;
   private long[] P03JR2_A8910CC_Ultln ;
   private boolean[] P03JR2_n8910CC_Ultln ;
   private String[] P03JR3_A396EmprCod ;
   private java.math.BigDecimal[] P03JR3_A8920CC_ExiReaC ;
   private boolean[] P03JR3_n8920CC_ExiReaC ;
   private byte[] P03JR3_A8908CC_AlmCod ;
   private boolean[] P03JR3_n8908CC_AlmCod ;
   private java.util.Date[] P03JR3_A810RecFec ;
   private String[] P03JR3_A719PrdNum ;
   private byte[] P03JR3_A8923CC_Estado ;
   private boolean[] P03JR3_n8923CC_Estado ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pccalm1__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class pccalm1__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class pccalm1__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class pccalm1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03JR2", "SELECT EmprCod, PrdNum, CC_Ultln FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03JR3", "SELECT EmprCod, CC_ExiReaC, CC_AlmCod, RecFec, PrdNum, CC_Estado FROM TXPRECALM WHERE EmprCod = ? and PrdNum = ? and RecFec = ? ORDER BY EmprCod, PrdNum, RecFec, CC_AlmCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03JR4", "INSERT INTO TXPCCALM(EmprCod, PrdNum, CC_Lin, CC_Fech, CC_Usu, CC_Term, CC_Cant, CC_AlmCod, TipMovCc, CC_Desc, CC_Prec, CC_NumAlb, CC_HDR, CC_Hdr1, CC_Hdr2, CC_Hdr3) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCALM")
         ,new UpdateCursor("P03JR5", "UPDATE TXPRECALM SET CC_Estado=?  WHERE EmprCod = ? AND PrdNum = ? AND RecFec = ? AND CC_AlmCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECALM")
         ,new UpdateCursor("P03JR6", "UPDATE TXPPRODUC SET CC_Ultln=?  WHERE EmprCod = ? and PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
         ,new UpdateCursor("P03JR7", "UPDATE TXPPRDALM SET CC_ExisCC=?  WHERE EmprCod = ? and PrdNum = ? and CC_AlmCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRDALM")
         ,new UpdateCursor("P03JR8", "UPDATE TXPINVALM SET Inv_Status=1  WHERE EmprCod = ? and PrdNum = ? and RecFecHr = ? and CC_AlmCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPINVALM")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[4], false);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[6], 10);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 10);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[10], 4);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[12]).byteValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[14], 2);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[16], 40);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[18], 5);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(12, ((Number) parms[20]).intValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[22], 10);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(14, ((Number) parms[24]).intValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(15, ((Number) parms[26]).byteValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[28], 1);
               }
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 6);
               stmt.setDate(4, (java.util.Date)parms[4]);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[6]).byteValue());
               }
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 4);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 6);
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
      }
   }

}

