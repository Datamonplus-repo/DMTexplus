package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptixfi extends GXProcedure
{
   public ptixfi( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptixfi.class ), "" );
   }

   public ptixfi( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String[] aP0 ,
                        short aP1 ,
                        short aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             short aP1 ,
                             short aP2 )
   {
      ptixfi.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ptixfi.this.AV8TipArt_1 = aP1;
      ptixfi.this.AV9TipArt_2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10TIFI_UL = (short)(0) ;
      /* Using cursor P01YB2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(AV8TipArt_1)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4364GrdTipArt = P01YB2_A4364GrdTipArt[0] ;
         A5656Tifi_Ul = P01YB2_A5656Tifi_Ul[0] ;
         n5656Tifi_Ul = P01YB2_n5656Tifi_Ul[0] ;
         W396EmprCod = A396EmprCod ;
         W4364GrdTipArt = A4364GrdTipArt ;
         AV10TIFI_UL = A5656Tifi_Ul ;
         /* Using cursor P01YB3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A5661Tifi_f = P01YB3_A5661Tifi_f[0] ;
            n5661Tifi_f = P01YB3_n5661Tifi_f[0] ;
            A5660Tifi_t = P01YB3_A5660Tifi_t[0] ;
            n5660Tifi_t = P01YB3_n5660Tifi_t[0] ;
            A5659Tifi_vf = P01YB3_A5659Tifi_vf[0] ;
            n5659Tifi_vf = P01YB3_n5659Tifi_vf[0] ;
            A5658Tifi_vi = P01YB3_A5658Tifi_vi[0] ;
            n5658Tifi_vi = P01YB3_n5658Tifi_vi[0] ;
            A5657Tifi_l = P01YB3_A5657Tifi_l[0] ;
            W396EmprCod = A396EmprCod ;
            W4364GrdTipArt = A4364GrdTipArt ;
            /*
               INSERT RECORD ON TABLE TXPTIxFI

            */
            W396EmprCod = A396EmprCod ;
            W4364GrdTipArt = A4364GrdTipArt ;
            W5657Tifi_l = A5657Tifi_l ;
            W5658Tifi_vi = A5658Tifi_vi ;
            n5658Tifi_vi = false ;
            W5659Tifi_vf = A5659Tifi_vf ;
            n5659Tifi_vf = false ;
            W5660Tifi_t = A5660Tifi_t ;
            n5660Tifi_t = false ;
            W5661Tifi_f = A5661Tifi_f ;
            n5661Tifi_f = false ;
            A4364GrdTipArt = AV9TipArt_2 ;
            n5658Tifi_vi = false ;
            n5659Tifi_vf = false ;
            n5660Tifi_t = false ;
            n5661Tifi_f = false ;
            /* Using cursor P01YB4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt), Short.valueOf(A5657Tifi_l), Boolean.valueOf(n5658Tifi_vi), A5658Tifi_vi, Boolean.valueOf(n5659Tifi_vf), A5659Tifi_vf, Boolean.valueOf(n5660Tifi_t), Short.valueOf(A5660Tifi_t), Boolean.valueOf(n5661Tifi_f), A5661Tifi_f});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTIxFI");
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
            A396EmprCod = W396EmprCod ;
            A4364GrdTipArt = W4364GrdTipArt ;
            A5657Tifi_l = W5657Tifi_l ;
            A5658Tifi_vi = W5658Tifi_vi ;
            n5658Tifi_vi = false ;
            A5659Tifi_vf = W5659Tifi_vf ;
            n5659Tifi_vf = false ;
            A5660Tifi_t = W5660Tifi_t ;
            n5660Tifi_t = false ;
            A5661Tifi_f = W5661Tifi_f ;
            n5661Tifi_f = false ;
            /* End Insert */
            A396EmprCod = W396EmprCod ;
            A4364GrdTipArt = W4364GrdTipArt ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         A396EmprCod = W396EmprCod ;
         A4364GrdTipArt = W4364GrdTipArt ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      n5656Tifi_Ul = false ;
      /* Optimized UPDATE. */
      /* Using cursor P01YB5 */
      pr_default.execute(3, new Object[] {Boolean.valueOf(n5656Tifi_Ul), Short.valueOf(AV10TIFI_UL), A396EmprCod, Short.valueOf(AV9TipArt_2)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPGRDTIP");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ptixfi.this.A396EmprCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.ptixfi");
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
      P01YB2_A396EmprCod = new String[] {""} ;
      P01YB2_A4364GrdTipArt = new short[1] ;
      P01YB2_A5656Tifi_Ul = new short[1] ;
      P01YB2_n5656Tifi_Ul = new boolean[] {false} ;
      W396EmprCod = "" ;
      P01YB3_A396EmprCod = new String[] {""} ;
      P01YB3_A4364GrdTipArt = new short[1] ;
      P01YB3_A5661Tifi_f = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01YB3_n5661Tifi_f = new boolean[] {false} ;
      P01YB3_A5660Tifi_t = new short[1] ;
      P01YB3_n5660Tifi_t = new boolean[] {false} ;
      P01YB3_A5659Tifi_vf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01YB3_n5659Tifi_vf = new boolean[] {false} ;
      P01YB3_A5658Tifi_vi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01YB3_n5658Tifi_vi = new boolean[] {false} ;
      P01YB3_A5657Tifi_l = new short[1] ;
      A5661Tifi_f = DecimalUtil.ZERO ;
      A5659Tifi_vf = DecimalUtil.ZERO ;
      A5658Tifi_vi = DecimalUtil.ZERO ;
      W5658Tifi_vi = DecimalUtil.ZERO ;
      W5659Tifi_vf = DecimalUtil.ZERO ;
      W5661Tifi_f = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.ptixfi__default(),
         new Object[] {
             new Object[] {
            P01YB2_A396EmprCod, P01YB2_A4364GrdTipArt, P01YB2_A5656Tifi_Ul, P01YB2_n5656Tifi_Ul
            }
            , new Object[] {
            P01YB3_A396EmprCod, P01YB3_A4364GrdTipArt, P01YB3_A5661Tifi_f, P01YB3_n5661Tifi_f, P01YB3_A5660Tifi_t, P01YB3_n5660Tifi_t, P01YB3_A5659Tifi_vf, P01YB3_n5659Tifi_vf, P01YB3_A5658Tifi_vi, P01YB3_n5658Tifi_vi,
            P01YB3_A5657Tifi_l
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

   private short AV8TipArt_1 ;
   private short AV9TipArt_2 ;
   private short AV10TIFI_UL ;
   private short A4364GrdTipArt ;
   private short A5656Tifi_Ul ;
   private short W4364GrdTipArt ;
   private short A5660Tifi_t ;
   private short A5657Tifi_l ;
   private short W5657Tifi_l ;
   private short W5660Tifi_t ;
   private short Gx_err ;
   private int GX_INS836 ;
   private java.math.BigDecimal A5661Tifi_f ;
   private java.math.BigDecimal A5659Tifi_vf ;
   private java.math.BigDecimal A5658Tifi_vi ;
   private java.math.BigDecimal W5658Tifi_vi ;
   private java.math.BigDecimal W5659Tifi_vf ;
   private java.math.BigDecimal W5661Tifi_f ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String W396EmprCod ;
   private String Gx_emsg ;
   private boolean n5656Tifi_Ul ;
   private boolean n5661Tifi_f ;
   private boolean n5660Tifi_t ;
   private boolean n5659Tifi_vf ;
   private boolean n5658Tifi_vi ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P01YB2_A396EmprCod ;
   private short[] P01YB2_A4364GrdTipArt ;
   private short[] P01YB2_A5656Tifi_Ul ;
   private boolean[] P01YB2_n5656Tifi_Ul ;
   private String[] P01YB3_A396EmprCod ;
   private short[] P01YB3_A4364GrdTipArt ;
   private java.math.BigDecimal[] P01YB3_A5661Tifi_f ;
   private boolean[] P01YB3_n5661Tifi_f ;
   private short[] P01YB3_A5660Tifi_t ;
   private boolean[] P01YB3_n5660Tifi_t ;
   private java.math.BigDecimal[] P01YB3_A5659Tifi_vf ;
   private boolean[] P01YB3_n5659Tifi_vf ;
   private java.math.BigDecimal[] P01YB3_A5658Tifi_vi ;
   private boolean[] P01YB3_n5658Tifi_vi ;
   private short[] P01YB3_A5657Tifi_l ;
}

final  class ptixfi__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01YB2", "SELECT EmprCod, GrdTipArt, Tifi_Ul FROM TXPGRDTIP WHERE EmprCod = ? and GrdTipArt = ? ORDER BY EmprCod, GrdTipArt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01YB3", "SELECT EmprCod, GrdTipArt, Tifi_f, Tifi_t, Tifi_vf, Tifi_vi, Tifi_l FROM TXPTIxFI WHERE EmprCod = ? and GrdTipArt = ? ORDER BY EmprCod, GrdTipArt, Tifi_l ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01YB4", "INSERT INTO TXPTIxFI(EmprCod, GrdTipArt, Tifi_l, Tifi_vi, Tifi_vf, Tifi_t, Tifi_f) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTIxFI")
         ,new UpdateCursor("P01YB5", "UPDATE TXPGRDTIP SET Tifi_Ul=?  WHERE EmprCod = ? and GrdTipArt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPGRDTIP")
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 5);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[6], 5);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[8]).shortValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[10], 4);
               }
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
      }
   }

}

