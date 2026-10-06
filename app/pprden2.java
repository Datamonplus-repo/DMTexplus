package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprden2 extends GXProcedure
{
   public pprden2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprden2.class ), "" );
   }

   public pprden2( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 ,
                             byte[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             short[] aP7 ,
                             short[] aP8 ,
                             byte[] aP9 ,
                             byte[] aP10 ,
                             java.math.BigDecimal[] aP11 ,
                             java.util.Date[] aP12 ,
                             java.util.Date[] aP13 ,
                             String[] aP14 )
   {
      pprden2.this.aP15 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
      return aP15[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        short[] aP2 ,
                        byte[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        short[] aP7 ,
                        short[] aP8 ,
                        byte[] aP9 ,
                        byte[] aP10 ,
                        java.math.BigDecimal[] aP11 ,
                        java.util.Date[] aP12 ,
                        java.util.Date[] aP13 ,
                        String[] aP14 ,
                        String[] aP15 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 ,
                             byte[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             short[] aP7 ,
                             short[] aP8 ,
                             byte[] aP9 ,
                             byte[] aP10 ,
                             java.math.BigDecimal[] aP11 ,
                             java.util.Date[] aP12 ,
                             java.util.Date[] aP13 ,
                             String[] aP14 ,
                             String[] aP15 )
   {
      pprden2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprden2.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      pprden2.this.A681PrdAny = aP2[0];
      this.aP2 = aP2;
      pprden2.this.A720PrdNumMes = aP3[0];
      this.aP3 = aP3;
      pprden2.this.AV17Unidades = aP4[0];
      this.aP4 = aP4;
      pprden2.this.AV15UniOld = aP5[0];
      this.aP5 = aP5;
      pprden2.this.AV16Precio = aP6[0];
      this.aP6 = aP6;
      pprden2.this.AV18Year = aP7[0];
      this.aP7 = aP7;
      pprden2.this.AV19AnyAnt = aP8[0];
      this.aP8 = aP8;
      pprden2.this.AV20Mes = aP9[0];
      this.aP9 = aP9;
      pprden2.this.AV21MesAnt = aP10[0];
      this.aP10 = aP10;
      pprden2.this.AV22PrecAnt = aP11[0];
      this.aP11 = aP11;
      pprden2.this.AV23FecAct = aP12[0];
      this.aP12 = aP12;
      pprden2.this.AV24FecAnt = aP13[0];
      this.aP13 = aP13;
      pprden2.this.AV25PedPri = aP14[0];
      this.aP14 = aP14;
      pprden2.this.Gx_mode = aP15[0];
      this.aP15 = aP15;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "pPRDEN2", "") );
      /* Using cursor P01862 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3915EmpNumDec = P01862_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P01862_n3915EmpNumDec[0] ;
         AV28EmpNumDec = A3915EmpNumDec ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "INS", "")) == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPCPRDES

         */
         A331DifValConA = DecimalUtil.doubleToDec(0) ;
         n331DifValConA = false ;
         /* Using cursor P01863 */
         pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Boolean.valueOf(n331DifValConA), A331DifValConA});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPRDES");
         if ( (pr_default.getStatus(1) == 1) )
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
         /*
            INSERT RECORD ON TABLE TXPLPRDES

         */
         Gx_msg = httpContext.getMessage( "pPRDEN2.Producto= ", "") + A719PrdNum ;
         System.out.println( Gx_msg );
         A745PrdUniCprM = AV17Unidades ;
         A744PrdUniConM = DecimalUtil.doubleToDec(0) ;
         if ( AV28EmpNumDec == 0 )
         {
            A749PrdValCprM = GXutil.roundDecimal( AV16Precio.multiply(AV17Unidades), 0) ;
         }
         else
         {
            if ( AV28EmpNumDec == 2 )
            {
               A749PrdValCprM = GXutil.roundDecimal( AV16Precio.multiply(AV17Unidades), 2) ;
            }
         }
         A747PrdValConM = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P01864 */
         pr_default.execute(2, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Byte.valueOf(A720PrdNumMes), A745PrdUniCprM, A744PrdUniConM, A749PrdValCprM, A747PrdValConM});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRDES");
         if ( (pr_default.getStatus(2) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            /* Using cursor P01865 */
            pr_default.execute(3, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Byte.valueOf(A720PrdNumMes)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A396EmprCod = P01865_A396EmprCod[0] ;
               A719PrdNum = P01865_A719PrdNum[0] ;
               A681PrdAny = P01865_A681PrdAny[0] ;
               A720PrdNumMes = P01865_A720PrdNumMes[0] ;
               A745PrdUniCprM = P01865_A745PrdUniCprM[0] ;
               A749PrdValCprM = P01865_A749PrdValCprM[0] ;
               A745PrdUniCprM = A745PrdUniCprM.add((AV17Unidades.subtract(AV15UniOld))) ;
               if ( AV28EmpNumDec == 0 )
               {
                  A749PrdValCprM = A749PrdValCprM.add(GXutil.roundDecimal( AV16Precio.multiply((AV17Unidades.subtract(AV15UniOld))), 0)) ;
               }
               else
               {
                  if ( AV28EmpNumDec == 2 )
                  {
                     A749PrdValCprM = A749PrdValCprM.add(GXutil.roundDecimal( AV16Precio.multiply((AV17Unidades.subtract(AV15UniOld))), 2)) ;
                  }
               }
               /* Using cursor P01866 */
               pr_default.execute(4, new Object[] {A745PrdUniCprM, A749PrdValCprM, A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Byte.valueOf(A720PrdNumMes)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRDES");
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(3);
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
      }
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "UPD", "")) == 0 )
      {
         if ( !( GXutil.dateCompare(GXutil.resetTime(AV23FecAct), GXutil.resetTime(AV24FecAnt)) ) )
         {
            GXv_char1[0] = A396EmprCod ;
            GXv_char2[0] = A719PrdNum ;
            GXv_date3[0] = AV24FecAnt ;
            GXv_decimal4[0] = AV15UniOld ;
            GXv_decimal5[0] = AV22PrecAnt ;
            new app.pacespd(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_date3, GXv_decimal4, GXv_decimal5) ;
            pprden2.this.A396EmprCod = GXv_char1[0] ;
            pprden2.this.A719PrdNum = GXv_char2[0] ;
            pprden2.this.AV24FecAnt = GXv_date3[0] ;
            pprden2.this.AV15UniOld = GXv_decimal4[0] ;
            pprden2.this.AV22PrecAnt = GXv_decimal5[0] ;
            AV27FlagEnc = (byte)(0) ;
            /* Using cursor P01867 */
            pr_default.execute(5, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(AV18Year), Byte.valueOf(AV20Mes)});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A745PrdUniCprM = P01867_A745PrdUniCprM[0] ;
               A749PrdValCprM = P01867_A749PrdValCprM[0] ;
               A745PrdUniCprM = A745PrdUniCprM.add(AV17Unidades) ;
               if ( AV28EmpNumDec == 0 )
               {
                  A749PrdValCprM = A749PrdValCprM.add(GXutil.roundDecimal( AV16Precio.multiply(AV17Unidades), 0)) ;
               }
               else
               {
                  if ( AV28EmpNumDec == 2 )
                  {
                     A749PrdValCprM = A749PrdValCprM.add(GXutil.roundDecimal( AV16Precio.multiply(AV17Unidades), 2)) ;
                  }
               }
               AV27FlagEnc = (byte)(1) ;
               /* Using cursor P01868 */
               pr_default.execute(6, new Object[] {A745PrdUniCprM, A749PrdValCprM, A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Byte.valueOf(A720PrdNumMes)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRDES");
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(5);
            if ( AV27FlagEnc == 0 )
            {
               /*
                  INSERT RECORD ON TABLE TXPCPRDES

               */
               A331DifValConA = DecimalUtil.doubleToDec(0) ;
               n331DifValConA = false ;
               /* Using cursor P01869 */
               pr_default.execute(7, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Boolean.valueOf(n331DifValConA), A331DifValConA});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPRDES");
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
               /* End Insert */
               /*
                  INSERT RECORD ON TABLE TXPLPRDES

               */
               A745PrdUniCprM = AV17Unidades ;
               A744PrdUniConM = DecimalUtil.doubleToDec(0) ;
               if ( AV28EmpNumDec == 0 )
               {
                  A749PrdValCprM = GXutil.roundDecimal( AV16Precio.multiply(AV17Unidades), 0) ;
               }
               else
               {
                  if ( AV28EmpNumDec == 2 )
                  {
                     A749PrdValCprM = GXutil.roundDecimal( AV16Precio.multiply(AV17Unidades), 2) ;
                  }
               }
               A747PrdValConM = DecimalUtil.doubleToDec(0) ;
               /* Using cursor P018610 */
               pr_default.execute(8, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Byte.valueOf(A720PrdNumMes), A745PrdUniCprM, A744PrdUniConM, A749PrdValCprM, A747PrdValConM});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRDES");
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
               /* End Insert */
            }
         }
         else
         {
            /* Using cursor P018611 */
            pr_default.execute(9, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Byte.valueOf(A720PrdNumMes)});
            while ( (pr_default.getStatus(9) != 101) )
            {
               A745PrdUniCprM = P018611_A745PrdUniCprM[0] ;
               A749PrdValCprM = P018611_A749PrdValCprM[0] ;
               A745PrdUniCprM = A745PrdUniCprM.add((AV17Unidades.subtract(AV15UniOld))) ;
               if ( AV28EmpNumDec == 0 )
               {
                  A749PrdValCprM = A749PrdValCprM.subtract(GXutil.roundDecimal( AV22PrecAnt.multiply(AV15UniOld), 0)) ;
                  A749PrdValCprM = A749PrdValCprM.add(GXutil.roundDecimal( AV16Precio.multiply(AV17Unidades), 0)) ;
               }
               else
               {
                  if ( AV28EmpNumDec == 2 )
                  {
                     A749PrdValCprM = A749PrdValCprM.subtract(GXutil.roundDecimal( AV22PrecAnt.multiply(AV15UniOld), 2)) ;
                     A749PrdValCprM = A749PrdValCprM.add(GXutil.roundDecimal( AV16Precio.multiply(AV17Unidades), 2)) ;
                  }
               }
               /* Using cursor P018612 */
               pr_default.execute(10, new Object[] {A745PrdUniCprM, A749PrdValCprM, A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Byte.valueOf(A720PrdNumMes)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRDES");
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(9);
         }
      }
      System.out.println( httpContext.getMessage( "Return pPRDEN2", "") );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprden2.this.A396EmprCod;
      this.aP1[0] = pprden2.this.A719PrdNum;
      this.aP2[0] = pprden2.this.A681PrdAny;
      this.aP3[0] = pprden2.this.A720PrdNumMes;
      this.aP4[0] = pprden2.this.AV17Unidades;
      this.aP5[0] = pprden2.this.AV15UniOld;
      this.aP6[0] = pprden2.this.AV16Precio;
      this.aP7[0] = pprden2.this.AV18Year;
      this.aP8[0] = pprden2.this.AV19AnyAnt;
      this.aP9[0] = pprden2.this.AV20Mes;
      this.aP10[0] = pprden2.this.AV21MesAnt;
      this.aP11[0] = pprden2.this.AV22PrecAnt;
      this.aP12[0] = pprden2.this.AV23FecAct;
      this.aP13[0] = pprden2.this.AV24FecAnt;
      this.aP14[0] = pprden2.this.AV25PedPri;
      this.aP15[0] = pprden2.this.Gx_mode;
      Application.commitDataStores(context, remoteHandle, pr_default, "pprden2");
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
      P01862_A396EmprCod = new String[] {""} ;
      P01862_A3915EmpNumDec = new byte[1] ;
      P01862_n3915EmpNumDec = new boolean[] {false} ;
      A331DifValConA = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      Gx_msg = "" ;
      A745PrdUniCprM = DecimalUtil.ZERO ;
      A744PrdUniConM = DecimalUtil.ZERO ;
      A749PrdValCprM = DecimalUtil.ZERO ;
      A747PrdValConM = DecimalUtil.ZERO ;
      P01865_A396EmprCod = new String[] {""} ;
      P01865_A719PrdNum = new String[] {""} ;
      P01865_A681PrdAny = new short[1] ;
      P01865_A720PrdNumMes = new byte[1] ;
      P01865_A745PrdUniCprM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01865_A749PrdValCprM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      GXv_char1 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_date3 = new java.util.Date[1] ;
      GXv_decimal4 = new java.math.BigDecimal[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      P01867_A396EmprCod = new String[] {""} ;
      P01867_A719PrdNum = new String[] {""} ;
      P01867_A720PrdNumMes = new byte[1] ;
      P01867_A681PrdAny = new short[1] ;
      P01867_A745PrdUniCprM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01867_A749PrdValCprM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P018611_A396EmprCod = new String[] {""} ;
      P018611_A719PrdNum = new String[] {""} ;
      P018611_A681PrdAny = new short[1] ;
      P018611_A720PrdNumMes = new byte[1] ;
      P018611_A745PrdUniCprM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P018611_A749PrdValCprM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprden2__default(),
         new Object[] {
             new Object[] {
            P01862_A396EmprCod, P01862_A3915EmpNumDec, P01862_n3915EmpNumDec
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P01865_A396EmprCod, P01865_A719PrdNum, P01865_A681PrdAny, P01865_A720PrdNumMes, P01865_A745PrdUniCprM, P01865_A749PrdValCprM
            }
            , new Object[] {
            }
            , new Object[] {
            P01867_A396EmprCod, P01867_A719PrdNum, P01867_A720PrdNumMes, P01867_A681PrdAny, P01867_A745PrdUniCprM, P01867_A749PrdValCprM
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P018611_A396EmprCod, P018611_A719PrdNum, P018611_A681PrdAny, P018611_A720PrdNumMes, P018611_A745PrdUniCprM, P018611_A749PrdValCprM
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A720PrdNumMes ;
   private byte AV20Mes ;
   private byte AV21MesAnt ;
   private byte A3915EmpNumDec ;
   private byte AV28EmpNumDec ;
   private byte AV27FlagEnc ;
   private short A681PrdAny ;
   private short AV18Year ;
   private short AV19AnyAnt ;
   private short Gx_err ;
   private int GX_INS80 ;
   private int GX_INS81 ;
   private java.math.BigDecimal AV17Unidades ;
   private java.math.BigDecimal AV15UniOld ;
   private java.math.BigDecimal AV16Precio ;
   private java.math.BigDecimal AV22PrecAnt ;
   private java.math.BigDecimal A331DifValConA ;
   private java.math.BigDecimal A745PrdUniCprM ;
   private java.math.BigDecimal A744PrdUniConM ;
   private java.math.BigDecimal A749PrdValCprM ;
   private java.math.BigDecimal A747PrdValConM ;
   private java.math.BigDecimal GXv_decimal4[] ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String AV25PedPri ;
   private String Gx_mode ;
   private String scmdbuf ;
   private String Gx_emsg ;
   private String Gx_msg ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private java.util.Date AV23FecAct ;
   private java.util.Date AV24FecAnt ;
   private java.util.Date GXv_date3[] ;
   private boolean n3915EmpNumDec ;
   private boolean n331DifValConA ;
   private String[] aP15 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private short[] aP2 ;
   private byte[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private short[] aP7 ;
   private short[] aP8 ;
   private byte[] aP9 ;
   private byte[] aP10 ;
   private java.math.BigDecimal[] aP11 ;
   private java.util.Date[] aP12 ;
   private java.util.Date[] aP13 ;
   private String[] aP14 ;
   private IDataStoreProvider pr_default ;
   private String[] P01862_A396EmprCod ;
   private byte[] P01862_A3915EmpNumDec ;
   private boolean[] P01862_n3915EmpNumDec ;
   private String[] P01865_A396EmprCod ;
   private String[] P01865_A719PrdNum ;
   private short[] P01865_A681PrdAny ;
   private byte[] P01865_A720PrdNumMes ;
   private java.math.BigDecimal[] P01865_A745PrdUniCprM ;
   private java.math.BigDecimal[] P01865_A749PrdValCprM ;
   private String[] P01867_A396EmprCod ;
   private String[] P01867_A719PrdNum ;
   private byte[] P01867_A720PrdNumMes ;
   private short[] P01867_A681PrdAny ;
   private java.math.BigDecimal[] P01867_A745PrdUniCprM ;
   private java.math.BigDecimal[] P01867_A749PrdValCprM ;
   private String[] P018611_A396EmprCod ;
   private String[] P018611_A719PrdNum ;
   private short[] P018611_A681PrdAny ;
   private byte[] P018611_A720PrdNumMes ;
   private java.math.BigDecimal[] P018611_A745PrdUniCprM ;
   private java.math.BigDecimal[] P018611_A749PrdValCprM ;
}

final  class pprden2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01862", "SELECT EmprCod, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01863", "INSERT INTO TXPCPRDES(EmprCod, PrdNum, PrdAny, DifValConA, PrdAcuConA) VALUES(?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPRDES")
         ,new UpdateCursor("P01864", "INSERT INTO TXPLPRDES(EmprCod, PrdNum, PrdAny, PrdNumMes, PrdUniCprM, PrdUniConM, PrdValCprM, PrdValConM, PrdKilTin, PrdMtrTin) VALUES(?, ?, ?, ?, ?, ?, ?, ?, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPRDES")
         ,new ForEachCursor("P01865", "SELECT EmprCod, PrdNum, PrdAny, PrdNumMes, PrdUniCprM, PrdValCprM FROM TXPLPRDES WHERE EmprCod = ? and PrdNum = ? and PrdAny = ? and PrdNumMes = ? ORDER BY EmprCod, PrdNum, PrdAny, PrdNumMes  FOR UPDATE OF PrdUniCprM, PrdValCprM NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01866", "UPDATE TXPLPRDES SET PrdUniCprM=?, PrdValCprM=?  WHERE EmprCod = ? AND PrdNum = ? AND PrdAny = ? AND PrdNumMes = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPRDES")
         ,new ForEachCursor("P01867", "SELECT EmprCod, PrdNum, PrdNumMes, PrdAny, PrdUniCprM, PrdValCprM FROM TXPLPRDES WHERE EmprCod = ? and PrdNum = ? and PrdAny = ? and PrdNumMes = ? ORDER BY EmprCod, PrdNum, PrdAny, PrdNumMes  FOR UPDATE OF PrdUniCprM, PrdValCprM NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01868", "UPDATE TXPLPRDES SET PrdUniCprM=?, PrdValCprM=?  WHERE EmprCod = ? AND PrdNum = ? AND PrdAny = ? AND PrdNumMes = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPRDES")
         ,new UpdateCursor("P01869", "INSERT INTO TXPCPRDES(EmprCod, PrdNum, PrdAny, DifValConA, PrdAcuConA) VALUES(?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPRDES")
         ,new UpdateCursor("P018610", "INSERT INTO TXPLPRDES(EmprCod, PrdNum, PrdAny, PrdNumMes, PrdUniCprM, PrdUniConM, PrdValCprM, PrdValConM, PrdKilTin, PrdMtrTin) VALUES(?, ?, ?, ?, ?, ?, ?, ?, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPRDES")
         ,new ForEachCursor("P018611", "SELECT EmprCod, PrdNum, PrdAny, PrdNumMes, PrdUniCprM, PrdValCprM FROM TXPLPRDES WHERE EmprCod = ? and PrdNum = ? and PrdAny = ? and PrdNumMes = ? ORDER BY EmprCod, PrdNum, PrdAny, PrdNumMes  FOR UPDATE OF PrdUniCprM, PrdValCprM NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P018612", "UPDATE TXPLPRDES SET PrdUniCprM=?, PrdValCprM=?  WHERE EmprCod = ? AND PrdNum = ? AND PrdAny = ? AND PrdNumMes = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPRDES")
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 4);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 4 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 6 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 4);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 10 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

