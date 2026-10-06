package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class recuperocomprasconsumosdevolucionesexistencias extends GXProcedure
{
   public recuperocomprasconsumosdevolucionesexistencias( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recuperocomprasconsumosdevolucionesexistencias.class ), "" );
   }

   public recuperocomprasconsumosdevolucionesexistencias( int remoteHandle ,
                                                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String aP0 ,
                                           String aP1 ,
                                           java.util.Date aP2 ,
                                           java.util.Date aP3 ,
                                           java.math.BigDecimal[] aP4 ,
                                           java.math.BigDecimal[] aP5 ,
                                           java.math.BigDecimal[] aP6 )
   {
      recuperocomprasconsumosdevolucionesexistencias.this.aP7 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        java.util.Date aP2 ,
                        java.util.Date aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             java.util.Date aP2 ,
                             java.util.Date aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 )
   {
      recuperocomprasconsumosdevolucionesexistencias.this.AV13EmprCod = aP0;
      recuperocomprasconsumosdevolucionesexistencias.this.AV14Prdnum = aP1;
      recuperocomprasconsumosdevolucionesexistencias.this.AV12CCStkFec = aP2;
      recuperocomprasconsumosdevolucionesexistencias.this.AV15CCStkFec_to = aP3;
      recuperocomprasconsumosdevolucionesexistencias.this.aP4 = aP4;
      recuperocomprasconsumosdevolucionesexistencias.this.aP5 = aP5;
      recuperocomprasconsumosdevolucionesexistencias.this.aP6 = aP6;
      recuperocomprasconsumosdevolucionesexistencias.this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8compras = DecimalUtil.ZERO ;
      AV9consumos = DecimalUtil.ZERO ;
      AV10devoluciones = DecimalUtil.ZERO ;
      AV11existencias = DecimalUtil.ZERO ;
      /* Using cursor P09462 */
      pr_default.execute(0, new Object[] {AV13EmprCod, AV14Prdnum, AV12CCStkFec, AV15CCStkFec_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P09462_A396EmprCod[0] ;
         A719PrdNum = P09462_A719PrdNum[0] ;
         A3345TipMovCc = P09462_A3345TipMovCc[0] ;
         A3348CCStkFec = P09462_A3348CCStkFec[0] ;
         A3343CCStkCanE = P09462_A3343CCStkCanE[0] ;
         A3344CCStkCanS = P09462_A3344CCStkCanS[0] ;
         A3356CCStkHor = P09462_A3356CCStkHor[0] ;
         A3342CCStkLin = P09462_A3342CCStkLin[0] ;
         if ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SR", "")) == 0 )
         {
            AV16Recfec = A3348CCStkFec ;
            /* Execute user subroutine: 'RECUENTO' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV11existencias = ((AV17EntSalInv==0) ? AV18RecExiRea : AV18RecExiRea.add(AV19ComprasInv).subtract(AV20ConsumosInv)) ;
         }
         if ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SR", "")) == 0 )
         {
            AV22Ccstkcane = DecimalUtil.doubleToDec(0) ;
            AV23Ccstkcans = DecimalUtil.doubleToDec(0) ;
         }
         AV22Ccstkcane = A3343CCStkCanE ;
         AV23Ccstkcans = A3344CCStkCanS ;
         AV11existencias = AV11existencias.add((AV22Ccstkcane.subtract(AV23Ccstkcans))) ;
         AV8compras = AV8compras.add((((GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "EN", ""))==0) ? AV22Ccstkcane : DecimalUtil.doubleToDec(0)))) ;
         AV9consumos = AV9consumos.add((((GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SC", ""))==0)||(GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SM", ""))==0) ? AV23Ccstkcans : DecimalUtil.doubleToDec(0)))) ;
         AV10devoluciones = AV10devoluciones.add((((GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SD", ""))==0) ? AV23Ccstkcans : DecimalUtil.doubleToDec(0)))) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'RECUENTO' Routine */
      returnInSub = false ;
      AV21Recexiteo = DecimalUtil.ZERO ;
      AV18RecExiRea = DecimalUtil.ZERO ;
      AV24RecExiTcc = DecimalUtil.ZERO ;
      AV25RecExiRcc = DecimalUtil.ZERO ;
      /* Using cursor P09463 */
      pr_default.execute(1, new Object[] {AV13EmprCod, AV14Prdnum, AV16Recfec});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A810RecFec = P09463_A810RecFec[0] ;
         A719PrdNum = P09463_A719PrdNum[0] ;
         A396EmprCod = P09463_A396EmprCod[0] ;
         A809RecExiTeo = P09463_A809RecExiTeo[0] ;
         A807RecExiRea = P09463_A807RecExiRea[0] ;
         A808RecExiTcc = P09463_A808RecExiTcc[0] ;
         A806RecExiRcc = P09463_A806RecExiRcc[0] ;
         AV21Recexiteo = A809RecExiTeo ;
         AV18RecExiRea = A807RecExiRea ;
         AV24RecExiTcc = A808RecExiTcc ;
         AV25RecExiRcc = A806RecExiRcc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      GXv_char1[0] = AV13EmprCod ;
      GXv_char2[0] = AV14Prdnum ;
      GXv_date3[0] = AV16Recfec ;
      GXv_decimal4[0] = AV19ComprasInv ;
      GXv_decimal5[0] = AV20ConsumosInv ;
      new app.pprc124(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_date3, GXv_decimal4, GXv_decimal5) ;
      recuperocomprasconsumosdevolucionesexistencias.this.AV13EmprCod = GXv_char1[0] ;
      recuperocomprasconsumosdevolucionesexistencias.this.AV14Prdnum = GXv_char2[0] ;
      recuperocomprasconsumosdevolucionesexistencias.this.AV16Recfec = GXv_date3[0] ;
      recuperocomprasconsumosdevolucionesexistencias.this.AV19ComprasInv = GXv_decimal4[0] ;
      recuperocomprasconsumosdevolucionesexistencias.this.AV20ConsumosInv = GXv_decimal5[0] ;
   }

   protected void cleanup( )
   {
      this.aP4[0] = recuperocomprasconsumosdevolucionesexistencias.this.AV8compras;
      this.aP5[0] = recuperocomprasconsumosdevolucionesexistencias.this.AV9consumos;
      this.aP6[0] = recuperocomprasconsumosdevolucionesexistencias.this.AV10devoluciones;
      this.aP7[0] = recuperocomprasconsumosdevolucionesexistencias.this.AV11existencias;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8compras = DecimalUtil.ZERO ;
      AV9consumos = DecimalUtil.ZERO ;
      AV10devoluciones = DecimalUtil.ZERO ;
      AV11existencias = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P09462_A396EmprCod = new String[] {""} ;
      P09462_A719PrdNum = new String[] {""} ;
      P09462_A3345TipMovCc = new String[] {""} ;
      P09462_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09462_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09462_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09462_A3356CCStkHor = new String[] {""} ;
      P09462_A3342CCStkLin = new long[1] ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      A3345TipMovCc = "" ;
      A3348CCStkFec = GXutil.nullDate() ;
      A3343CCStkCanE = DecimalUtil.ZERO ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      A3356CCStkHor = "" ;
      AV16Recfec = GXutil.nullDate() ;
      AV18RecExiRea = DecimalUtil.ZERO ;
      AV19ComprasInv = DecimalUtil.ZERO ;
      AV20ConsumosInv = DecimalUtil.ZERO ;
      AV22Ccstkcane = DecimalUtil.ZERO ;
      AV23Ccstkcans = DecimalUtil.ZERO ;
      AV21Recexiteo = DecimalUtil.ZERO ;
      AV24RecExiTcc = DecimalUtil.ZERO ;
      AV25RecExiRcc = DecimalUtil.ZERO ;
      P09463_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09463_A719PrdNum = new String[] {""} ;
      P09463_A396EmprCod = new String[] {""} ;
      P09463_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09463_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09463_A808RecExiTcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09463_A806RecExiRcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A810RecFec = GXutil.nullDate() ;
      A809RecExiTeo = DecimalUtil.ZERO ;
      A807RecExiRea = DecimalUtil.ZERO ;
      A808RecExiTcc = DecimalUtil.ZERO ;
      A806RecExiRcc = DecimalUtil.ZERO ;
      GXv_char1 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_date3 = new java.util.Date[1] ;
      GXv_decimal4 = new java.math.BigDecimal[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recuperocomprasconsumosdevolucionesexistencias__default(),
         new Object[] {
             new Object[] {
            P09462_A396EmprCod, P09462_A719PrdNum, P09462_A3345TipMovCc, P09462_A3348CCStkFec, P09462_A3343CCStkCanE, P09462_A3344CCStkCanS, P09462_A3356CCStkHor, P09462_A3342CCStkLin
            }
            , new Object[] {
            P09463_A810RecFec, P09463_A719PrdNum, P09463_A396EmprCod, P09463_A809RecExiTeo, P09463_A807RecExiRea, P09463_A808RecExiTcc, P09463_A806RecExiRcc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV17EntSalInv ;
   private short Gx_err ;
   private long A3342CCStkLin ;
   private java.math.BigDecimal AV8compras ;
   private java.math.BigDecimal AV9consumos ;
   private java.math.BigDecimal AV10devoluciones ;
   private java.math.BigDecimal AV11existencias ;
   private java.math.BigDecimal A3343CCStkCanE ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private java.math.BigDecimal AV18RecExiRea ;
   private java.math.BigDecimal AV19ComprasInv ;
   private java.math.BigDecimal AV20ConsumosInv ;
   private java.math.BigDecimal AV22Ccstkcane ;
   private java.math.BigDecimal AV23Ccstkcans ;
   private java.math.BigDecimal AV21Recexiteo ;
   private java.math.BigDecimal AV24RecExiTcc ;
   private java.math.BigDecimal AV25RecExiRcc ;
   private java.math.BigDecimal A809RecExiTeo ;
   private java.math.BigDecimal A807RecExiRea ;
   private java.math.BigDecimal A808RecExiTcc ;
   private java.math.BigDecimal A806RecExiRcc ;
   private java.math.BigDecimal GXv_decimal4[] ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private String AV13EmprCod ;
   private String AV14Prdnum ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String A3345TipMovCc ;
   private String A3356CCStkHor ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private java.util.Date AV12CCStkFec ;
   private java.util.Date AV15CCStkFec_to ;
   private java.util.Date A3348CCStkFec ;
   private java.util.Date AV16Recfec ;
   private java.util.Date A810RecFec ;
   private java.util.Date GXv_date3[] ;
   private boolean returnInSub ;
   private java.math.BigDecimal[] aP7 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P09462_A396EmprCod ;
   private String[] P09462_A719PrdNum ;
   private String[] P09462_A3345TipMovCc ;
   private java.util.Date[] P09462_A3348CCStkFec ;
   private java.math.BigDecimal[] P09462_A3343CCStkCanE ;
   private java.math.BigDecimal[] P09462_A3344CCStkCanS ;
   private String[] P09462_A3356CCStkHor ;
   private long[] P09462_A3342CCStkLin ;
   private java.util.Date[] P09463_A810RecFec ;
   private String[] P09463_A719PrdNum ;
   private String[] P09463_A396EmprCod ;
   private java.math.BigDecimal[] P09463_A809RecExiTeo ;
   private java.math.BigDecimal[] P09463_A807RecExiRea ;
   private java.math.BigDecimal[] P09463_A808RecExiTcc ;
   private java.math.BigDecimal[] P09463_A806RecExiRcc ;
}

final  class recuperocomprasconsumosdevolucionesexistencias__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09462", "SELECT EmprCod, PrdNum, TipMovCc, CCStkFec, CCStkCanE, CCStkCanS, CCStkHor, CCStkLin FROM TXPCCSTKS WHERE (EmprCod = ? and PrdNum = ? and CCStkFec >= ?) AND (TipMovCc <> 'EC') AND (CCStkFec <= ?) ORDER BY EmprCod, PrdNum, CCStkFec, CCStkHor ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09463", "SELECT RecFec, PrdNum, EmprCod, RecExiTeo, RecExiRea, RecExiTcc, RecExiRcc FROM TXPRECUEN WHERE EmprCod = ? and PrdNum = ? and RecFec = ? ORDER BY EmprCod, PrdNum, RecFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((long[]) buf[7])[0] = rslt.getLong(8);
               return;
            case 1 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
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
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
      }
   }

}

