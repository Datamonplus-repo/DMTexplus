package app.mantenimientomaquina ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmpremts extends GXProcedure
{
   public pmpremts( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmpremts.class ), "" );
   }

   public pmpremts( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String aP0 ,
                                           String aP1 ,
                                           java.util.Date aP2 )
   {
      pmpremts.this.aP3 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
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
      pmpremts.this.A396EmprCod = aP0;
      pmpremts.this.A602MaqCod = aP1;
      pmpremts.this.AV8Fecha = aP2;
      pmpremts.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10Hoy = GXutil.serverDate( context, remoteHandle, pr_default) ;
      /* Using cursor P05OK2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A602MaqCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11445MaqFch = P05OK2_A11445MaqFch[0] ;
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
      /* Optimized group. */
      /* Using cursor P05OK3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A602MaqCod, AV8Fecha, AV11Actual});
      c13014MaqUsoMts = P05OK3_A13014MaqUsoMts[0] ;
      pr_default.close(1);
      AV14PMUsoMts = AV14PMUsoMts.add(c13014MaqUsoMts) ;
      /* End optimized group. */
      while ( GXutil.resetTime(AV11Actual).before( GXutil.resetTime( AV10Hoy )) )
      {
         AV20GXLvl27 = (byte)(0) ;
         /* Using cursor P05OK4 */
         pr_default.execute(2, new Object[] {A396EmprCod, A602MaqCod, AV11Actual});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A11445MaqFch = P05OK4_A11445MaqFch[0] ;
            A13014MaqUsoMts = P05OK4_A13014MaqUsoMts[0] ;
            AV20GXLvl27 = (byte)(1) ;
            AV14PMUsoMts = AV14PMUsoMts.add(A13014MaqUsoMts) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         if ( AV20GXLvl27 == 0 )
         {
            AV15MaqUsoMts = DecimalUtil.doubleToDec(0) ;
            /* Optimized group. */
            /* Using cursor P05OK5 */
            pr_default.execute(3, new Object[] {A396EmprCod, A602MaqCod, AV11Actual});
            c1526HisProMtr = P05OK5_A1526HisProMtr[0] ;
            pr_default.close(3);
            AV15MaqUsoMts = AV15MaqUsoMts.add(c1526HisProMtr) ;
            /* End optimized group. */
            /*
               INSERT RECORD ON TABLE TXPMAQUSO

            */
            A11445MaqFch = AV11Actual ;
            A13014MaqUsoMts = AV15MaqUsoMts ;
            A11444MaqUso = DecimalUtil.doubleToDec(0) ;
            AV14PMUsoMts = AV14PMUsoMts.add(AV15MaqUsoMts) ;
            /* Using cursor P05OK6 */
            pr_default.execute(4, new Object[] {A396EmprCod, A602MaqCod, A11445MaqFch, A11444MaqUso, A13014MaqUsoMts});
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
      this.aP3[0] = pmpremts.this.AV14PMUsoMts;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV14PMUsoMts = DecimalUtil.ZERO ;
      AV10Hoy = GXutil.nullDate() ;
      scmdbuf = "" ;
      P05OK2_A396EmprCod = new String[] {""} ;
      P05OK2_A602MaqCod = new String[] {""} ;
      P05OK2_A11445MaqFch = new java.util.Date[] {GXutil.nullDate()} ;
      A11445MaqFch = GXutil.nullDate() ;
      AV11Actual = GXutil.nullDate() ;
      AV9Horas = DecimalUtil.ZERO ;
      c13014MaqUsoMts = DecimalUtil.ZERO ;
      P05OK3_A13014MaqUsoMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05OK4_A396EmprCod = new String[] {""} ;
      P05OK4_A602MaqCod = new String[] {""} ;
      P05OK4_A11445MaqFch = new java.util.Date[] {GXutil.nullDate()} ;
      P05OK4_A13014MaqUsoMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A13014MaqUsoMts = DecimalUtil.ZERO ;
      AV15MaqUsoMts = DecimalUtil.ZERO ;
      c1526HisProMtr = DecimalUtil.ZERO ;
      P05OK5_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A11444MaqUso = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.pmpremts__default(),
         new Object[] {
             new Object[] {
            P05OK2_A396EmprCod, P05OK2_A602MaqCod, P05OK2_A11445MaqFch
            }
            , new Object[] {
            P05OK3_A13014MaqUsoMts
            }
            , new Object[] {
            P05OK4_A396EmprCod, P05OK4_A602MaqCod, P05OK4_A11445MaqFch, P05OK4_A13014MaqUsoMts
            }
            , new Object[] {
            P05OK5_A1526HisProMtr
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV20GXLvl27 ;
   private short Gx_err ;
   private int GX_INS1522 ;
   private java.math.BigDecimal AV14PMUsoMts ;
   private java.math.BigDecimal AV9Horas ;
   private java.math.BigDecimal c13014MaqUsoMts ;
   private java.math.BigDecimal A13014MaqUsoMts ;
   private java.math.BigDecimal AV15MaqUsoMts ;
   private java.math.BigDecimal c1526HisProMtr ;
   private java.math.BigDecimal A11444MaqUso ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String scmdbuf ;
   private String Gx_emsg ;
   private java.util.Date AV8Fecha ;
   private java.util.Date AV10Hoy ;
   private java.util.Date A11445MaqFch ;
   private java.util.Date AV11Actual ;
   private boolean returnInSub ;
   private java.math.BigDecimal[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P05OK2_A396EmprCod ;
   private String[] P05OK2_A602MaqCod ;
   private java.util.Date[] P05OK2_A11445MaqFch ;
   private java.math.BigDecimal[] P05OK3_A13014MaqUsoMts ;
   private String[] P05OK4_A396EmprCod ;
   private String[] P05OK4_A602MaqCod ;
   private java.util.Date[] P05OK4_A11445MaqFch ;
   private java.math.BigDecimal[] P05OK4_A13014MaqUsoMts ;
   private java.math.BigDecimal[] P05OK5_A1526HisProMtr ;
}

final  class pmpremts__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05OK2", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqFch FROM TXPMAQUSO WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod DESC, MaqCod DESC, MaqFch DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05OK3", "SELECT SUM(MaqUsoMts) FROM TXPMAQUSO WHERE (EmprCod = ? and MaqCod = ? and MaqFch >= ?) AND (MaqFch <= ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05OK4", "SELECT EmprCod, MaqCod, MaqFch, MaqUsoMts FROM TXPMAQUSO WHERE EmprCod = ? and MaqCod = ? and MaqFch = ? ORDER BY EmprCod, MaqCod, MaqFch ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05OK5", "SELECT SUM(HisProMtr) FROM TXPLHIPRO WHERE (EmprCod = ? and MaqCod = ? and HisProFec = ?) AND (ParCod = 0) AND (HisProEst = 1) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05OK6", "INSERT INTO TXPMAQUSO(EmprCod, MaqCod, MaqFch, MaqUso, MaqUsoMts) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMAQUSO")
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
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
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
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               return;
      }
   }

}

