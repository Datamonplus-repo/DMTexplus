package app.mantenimientomaquina ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmpreprd extends GXProcedure
{
   public pmpreprd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmpreprd.class ), "" );
   }

   public pmpreprd( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String aP0 ,
                                           String aP1 ,
                                           java.util.Date aP2 )
   {
      pmpreprd.this.aP3 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        java.util.Date aP2 ,
                        java.math.BigDecimal[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             java.util.Date aP2 ,
                             java.math.BigDecimal[] aP3 )
   {
      pmpreprd.this.A396EmprCod = aP0;
      pmpreprd.this.A602MaqCod = aP1;
      pmpreprd.this.AV8Fecha = aP2;
      pmpreprd.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10Hoy = GXutil.serverDate( context, remoteHandle, pr_default) ;
      /* Using cursor P04JJ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A602MaqCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11445MaqFch = P04JJ2_A11445MaqFch[0] ;
         AV11Actual = A11445MaqFch ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV11Actual)) )
      {
         AV9Horas = DecimalUtil.doubleToDec(0) ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      Gx_msg += httpContext.getMessage( ", Hasta : ", "") + localUtil.dtoc( AV11Actual, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
      /* Optimized group. */
      /* Using cursor P04JJ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A602MaqCod, AV8Fecha, AV11Actual});
      c11444MaqUso = P04JJ3_A11444MaqUso[0] ;
      pr_default.close(1);
      AV9Horas = AV9Horas.add(c11444MaqUso) ;
      /* End optimized group. */
      while ( GXutil.resetTime(AV11Actual).before( GXutil.resetTime( AV10Hoy )) )
      {
         AV18GXLvl24 = (byte)(0) ;
         /* Using cursor P04JJ4 */
         pr_default.execute(2, new Object[] {A396EmprCod, A602MaqCod, AV11Actual});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A11445MaqFch = P04JJ4_A11445MaqFch[0] ;
            A11444MaqUso = P04JJ4_A11444MaqUso[0] ;
            AV18GXLvl24 = (byte)(1) ;
            AV9Horas = AV9Horas.add(A11444MaqUso) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         if ( AV18GXLvl24 == 0 )
         {
            AV12MaqUso = DecimalUtil.doubleToDec(0) ;
            /* Using cursor P04JJ5 */
            pr_default.execute(3, new Object[] {A396EmprCod, A602MaqCod, AV11Actual});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A556HisProEst = P04JJ5_A556HisProEst[0] ;
               A656ParCod = P04JJ5_A656ParCod[0] ;
               n656ParCod = P04JJ5_n656ParCod[0] ;
               A558HisProFec = P04JJ5_A558HisProFec[0] ;
               A4440HisProDTI = P04JJ5_A4440HisProDTI[0] ;
               n4440HisProDTI = P04JJ5_n4440HisProDTI[0] ;
               A4441HisProDTF = P04JJ5_A4441HisProDTF[0] ;
               n4441HisProDTF = P04JJ5_n4441HisProDTF[0] ;
               A561HisProLin = P04JJ5_A561HisProLin[0] ;
               AV12MaqUso = AV12MaqUso.add(DecimalUtil.doubleToDec((GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (3600)))) ;
               pr_default.readNext(3);
            }
            pr_default.close(3);
            /*
               INSERT RECORD ON TABLE TXPMAQUSO

            */
            A11445MaqFch = AV11Actual ;
            A11444MaqUso = AV12MaqUso ;
            AV9Horas = AV9Horas.add(AV12MaqUso) ;
            /* Using cursor P04JJ6 */
            pr_default.execute(4, new Object[] {A396EmprCod, A602MaqCod, A11445MaqFch, A11444MaqUso});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQUSO");
            if ( (pr_default.getStatus(4) == 1) )
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
         AV11Actual = GXutil.dadd(AV11Actual,+(1)) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = pmpreprd.this.AV9Horas;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9Horas = DecimalUtil.ZERO ;
      AV10Hoy = GXutil.nullDate() ;
      scmdbuf = "" ;
      P04JJ2_A396EmprCod = new String[] {""} ;
      P04JJ2_A602MaqCod = new String[] {""} ;
      P04JJ2_A11445MaqFch = new java.util.Date[] {GXutil.nullDate()} ;
      A11445MaqFch = GXutil.nullDate() ;
      AV11Actual = GXutil.nullDate() ;
      Gx_msg = "" ;
      c11444MaqUso = DecimalUtil.ZERO ;
      P04JJ3_A11444MaqUso = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04JJ4_A396EmprCod = new String[] {""} ;
      P04JJ4_A602MaqCod = new String[] {""} ;
      P04JJ4_A11445MaqFch = new java.util.Date[] {GXutil.nullDate()} ;
      P04JJ4_A11444MaqUso = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A11444MaqUso = DecimalUtil.ZERO ;
      AV12MaqUso = DecimalUtil.ZERO ;
      P04JJ5_A396EmprCod = new String[] {""} ;
      P04JJ5_A602MaqCod = new String[] {""} ;
      P04JJ5_A556HisProEst = new byte[1] ;
      P04JJ5_A656ParCod = new short[1] ;
      P04JJ5_n656ParCod = new boolean[] {false} ;
      P04JJ5_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P04JJ5_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P04JJ5_n4440HisProDTI = new boolean[] {false} ;
      P04JJ5_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P04JJ5_n4441HisProDTF = new boolean[] {false} ;
      P04JJ5_A561HisProLin = new int[1] ;
      A558HisProFec = GXutil.nullDate() ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.pmpreprd__default(),
         new Object[] {
             new Object[] {
            P04JJ2_A396EmprCod, P04JJ2_A602MaqCod, P04JJ2_A11445MaqFch
            }
            , new Object[] {
            P04JJ3_A11444MaqUso
            }
            , new Object[] {
            P04JJ4_A396EmprCod, P04JJ4_A602MaqCod, P04JJ4_A11445MaqFch, P04JJ4_A11444MaqUso
            }
            , new Object[] {
            P04JJ5_A396EmprCod, P04JJ5_A602MaqCod, P04JJ5_A556HisProEst, P04JJ5_A656ParCod, P04JJ5_n656ParCod, P04JJ5_A558HisProFec, P04JJ5_A4440HisProDTI, P04JJ5_n4440HisProDTI, P04JJ5_A4441HisProDTF, P04JJ5_n4441HisProDTF,
            P04JJ5_A561HisProLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18GXLvl24 ;
   private byte A556HisProEst ;
   private short A656ParCod ;
   private short Gx_err ;
   private int A561HisProLin ;
   private int GX_INS1522 ;
   private java.math.BigDecimal AV9Horas ;
   private java.math.BigDecimal c11444MaqUso ;
   private java.math.BigDecimal A11444MaqUso ;
   private java.math.BigDecimal AV12MaqUso ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String scmdbuf ;
   private String Gx_msg ;
   private String Gx_emsg ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date AV8Fecha ;
   private java.util.Date AV10Hoy ;
   private java.util.Date A11445MaqFch ;
   private java.util.Date AV11Actual ;
   private java.util.Date A558HisProFec ;
   private boolean returnInSub ;
   private boolean n656ParCod ;
   private boolean n4440HisProDTI ;
   private boolean n4441HisProDTF ;
   private java.math.BigDecimal[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P04JJ2_A396EmprCod ;
   private String[] P04JJ2_A602MaqCod ;
   private java.util.Date[] P04JJ2_A11445MaqFch ;
   private java.math.BigDecimal[] P04JJ3_A11444MaqUso ;
   private String[] P04JJ4_A396EmprCod ;
   private String[] P04JJ4_A602MaqCod ;
   private java.util.Date[] P04JJ4_A11445MaqFch ;
   private java.math.BigDecimal[] P04JJ4_A11444MaqUso ;
   private String[] P04JJ5_A396EmprCod ;
   private String[] P04JJ5_A602MaqCod ;
   private byte[] P04JJ5_A556HisProEst ;
   private short[] P04JJ5_A656ParCod ;
   private boolean[] P04JJ5_n656ParCod ;
   private java.util.Date[] P04JJ5_A558HisProFec ;
   private java.util.Date[] P04JJ5_A4440HisProDTI ;
   private boolean[] P04JJ5_n4440HisProDTI ;
   private java.util.Date[] P04JJ5_A4441HisProDTF ;
   private boolean[] P04JJ5_n4441HisProDTF ;
   private int[] P04JJ5_A561HisProLin ;
}

final  class pmpreprd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04JJ2", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqFch FROM TXPMAQUSO WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod DESC, MaqCod DESC, MaqFch DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04JJ3", "SELECT SUM(MaqUso) FROM TXPMAQUSO WHERE (EmprCod = ? and MaqCod = ? and MaqFch >= ?) AND (MaqFch <= ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04JJ4", "SELECT EmprCod, MaqCod, MaqFch, MaqUso FROM TXPMAQUSO WHERE EmprCod = ? and MaqCod = ? and MaqFch = ? ORDER BY EmprCod, MaqCod, MaqFch ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04JJ5", "SELECT EmprCod, MaqCod, HisProEst, ParCod, HisProFec, HisProDTI, HisProDTF, HisProLin FROM TXPLHIPRO WHERE (EmprCod = ? and MaqCod = ? and HisProFec = ?) AND (ParCod = 0) AND (HisProEst = 1) ORDER BY EmprCod, MaqCod, HisProFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04JJ6", "INSERT INTO TXPMAQUSO(EmprCod, MaqCod, MaqFch, MaqUso, MaqUsoMts) VALUES(?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMAQUSO")
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(8);
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
               stmt.setDate(4, (java.util.Date)parms[3]);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               return;
      }
   }

}

