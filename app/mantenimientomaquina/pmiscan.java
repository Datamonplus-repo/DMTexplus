package app.mantenimientomaquina ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmiscan extends GXProcedure
{
   public pmiscan( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmiscan.class ), "" );
   }

   public pmiscan( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pmiscan.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      pmiscan.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmiscan.this.A9412MMSCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = httpContext.getMessage( "IS", "") ;
      GXv_int3[0] = AV8MTMovCod ;
      GXv_char4[0] = AV9MTMovNom ;
      new app.mantenimientomaquina.pmrmtesp(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3, GXv_char4) ;
      pmiscan.this.A396EmprCod = GXv_char1[0] ;
      pmiscan.this.AV8MTMovCod = GXv_int3[0] ;
      pmiscan.this.AV9MTMovNom = GXv_char4[0] ;
      AV10ServerNow = GXutil.serverNow( context, remoteHandle, pr_default) ;
      /* Using cursor P03MC2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9398MISCod = P03MC2_A9398MISCod[0] ;
         A9403MISRCod = P03MC2_A9403MISRCod[0] ;
         A9408MISRStkDif = P03MC2_A9408MISRStkDif[0] ;
         /* Using cursor P03MC3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A9398MISCod)});
         A9402MISEst = P03MC3_A9402MISEst[0] ;
         n9402MISEst = P03MC3_n9402MISEst[0] ;
         A11303MISFchApl = P03MC3_A11303MISFchApl[0] ;
         n11303MISFchApl = P03MC3_n11303MISFchApl[0] ;
         AV10ServerNow = GXutil.serverNow( context, remoteHandle, pr_default) ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int3[0] = A9398MISCod ;
         GXv_int5[0] = A9403MISRCod ;
         GXv_int6[0] = AV8MTMovCod ;
         GXv_char2[0] = AV9MTMovNom ;
         GXv_int7[0] = (byte)(1) ;
         GXv_decimal8[0] = A9408MISRStkDif ;
         GXv_decimal9[0] = DecimalUtil.doubleToDec(0) ;
         GXv_char1[0] = httpContext.getMessage( "R", "") ;
         GXv_dtime10[0] = AV10ServerNow ;
         new app.mantenimientomaquina.pmrepres(remoteHandle, context).execute( GXv_char4, GXv_int3, GXv_int5, GXv_int6, GXv_char2, GXv_int7, GXv_decimal8, GXv_decimal9, GXv_char1, GXv_dtime10) ;
         pmiscan.this.A396EmprCod = GXv_char4[0] ;
         pmiscan.this.A9398MISCod = GXv_int3[0] ;
         pmiscan.this.A9403MISRCod = GXv_int5[0] ;
         pmiscan.this.AV8MTMovCod = GXv_int6[0] ;
         pmiscan.this.AV9MTMovNom = GXv_char2[0] ;
         pmiscan.this.A9408MISRStkDif = GXv_decimal8[0] ;
         pmiscan.this.AV10ServerNow = GXv_dtime10[0] ;
         A9402MISEst = httpContext.getMessage( "C", "") ;
         n9402MISEst = false ;
         A11303MISFchApl = GXutil.resetTime(AV10ServerNow) ;
         n11303MISFchApl = false ;
         /* Using cursor P03MC4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n9402MISEst), A9402MISEst, Boolean.valueOf(n11303MISFchApl), A11303MISFchApl, A396EmprCod, Integer.valueOf(A9398MISCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMINVST");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmiscan.this.A396EmprCod;
      this.aP1[0] = pmiscan.this.A9412MMSCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "mantenimientomaquina.pmiscan");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9MTMovNom = "" ;
      AV10ServerNow = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      P03MC2_A396EmprCod = new String[] {""} ;
      P03MC2_A9398MISCod = new int[1] ;
      P03MC2_A9403MISRCod = new int[1] ;
      P03MC2_A9408MISRStkDif = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A9408MISRStkDif = DecimalUtil.ZERO ;
      P03MC3_A9402MISEst = new String[] {""} ;
      P03MC3_n9402MISEst = new boolean[] {false} ;
      P03MC3_A11303MISFchApl = new java.util.Date[] {GXutil.nullDate()} ;
      P03MC3_n11303MISFchApl = new boolean[] {false} ;
      A9402MISEst = "" ;
      A11303MISFchApl = GXutil.nullDate() ;
      GXv_char4 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_int7 = new byte[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_char1 = new String[1] ;
      GXv_dtime10 = new java.util.Date[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.pmiscan__default(),
         new Object[] {
             new Object[] {
            P03MC2_A396EmprCod, P03MC2_A9398MISCod, P03MC2_A9403MISRCod, P03MC2_A9408MISRStkDif
            }
            , new Object[] {
            P03MC3_A9402MISEst, P03MC3_n9402MISEst, P03MC3_A11303MISFchApl, P03MC3_n11303MISFchApl
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte GXv_int7[] ;
   private short Gx_err ;
   private int A9412MMSCod ;
   private int AV8MTMovCod ;
   private int A9398MISCod ;
   private int A9403MISRCod ;
   private int GXv_int3[] ;
   private int GXv_int5[] ;
   private int GXv_int6[] ;
   private java.math.BigDecimal A9408MISRStkDif ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private String A396EmprCod ;
   private String AV9MTMovNom ;
   private String scmdbuf ;
   private String A9402MISEst ;
   private String GXv_char4[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private java.util.Date AV10ServerNow ;
   private java.util.Date GXv_dtime10[] ;
   private java.util.Date A11303MISFchApl ;
   private boolean n9402MISEst ;
   private boolean n11303MISFchApl ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P03MC2_A396EmprCod ;
   private int[] P03MC2_A9398MISCod ;
   private int[] P03MC2_A9403MISRCod ;
   private java.math.BigDecimal[] P03MC2_A9408MISRStkDif ;
   private String[] P03MC3_A9402MISEst ;
   private boolean[] P03MC3_n9402MISEst ;
   private java.util.Date[] P03MC3_A11303MISFchApl ;
   private boolean[] P03MC3_n11303MISFchApl ;
}

final  class pmiscan__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03MC2", "SELECT EmprCod, MISCod, MISRCod, MISRStkDif FROM TXPMInSRe WHERE (EmprCod = ?) AND (EmprCod = ?) ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03MC3", "SELECT MISEst, MISFchApl FROM TXPMINVST WHERE EmprCod = ? AND MISCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03MC4", "UPDATE TXPMINVST SET MISEst=?, MISFchApl=?  WHERE EmprCod = ? AND MISCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMINVST")
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
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DATE );
               }
               else
               {
                  stmt.setDate(2, (java.util.Date)parms[3]);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               return;
      }
   }

}

