package app.mantenimientomaquina ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmmscan extends GXProcedure
{
   public pmmscan( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmmscan.class ), "" );
   }

   public pmmscan( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pmmscan.this.aP1 = new int[] {0};
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
      pmmscan.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmmscan.this.A9412MMSCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = httpContext.getMessage( "MS", "") ;
      GXv_int3[0] = AV8MTMovCod ;
      GXv_char4[0] = AV9MTMovNom ;
      new app.mantenimientomaquina.pmrmtesp(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3, GXv_char4) ;
      pmmscan.this.A396EmprCod = GXv_char1[0] ;
      pmmscan.this.AV8MTMovCod = GXv_int3[0] ;
      pmmscan.this.AV9MTMovNom = GXv_char4[0] ;
      AV10ServerNow = GXutil.serverNow( context, remoteHandle, pr_default) ;
      /* Using cursor P03MJ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A9412MMSCod), A396EmprCod, Integer.valueOf(A9412MMSCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9421MMSRCod = P03MJ2_A9421MMSRCod[0] ;
         A9409MMSRCnt = P03MJ2_A9409MMSRCnt[0] ;
         /* Using cursor P03MJ3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A9412MMSCod)});
         A9420MMSEst = P03MJ3_A9420MMSEst[0] ;
         n9420MMSEst = P03MJ3_n9420MMSEst[0] ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int3[0] = A9412MMSCod ;
         GXv_int5[0] = A9421MMSRCod ;
         GXv_int6[0] = AV8MTMovCod ;
         GXv_char2[0] = AV9MTMovNom ;
         GXv_int7[0] = (byte)(1) ;
         GXv_decimal8[0] = A9409MMSRCnt ;
         GXv_decimal9[0] = DecimalUtil.doubleToDec(0) ;
         GXv_char1[0] = httpContext.getMessage( "R", "") ;
         GXv_dtime10[0] = AV10ServerNow ;
         new app.mantenimientomaquina.pmrepres(remoteHandle, context).execute( GXv_char4, GXv_int3, GXv_int5, GXv_int6, GXv_char2, GXv_int7, GXv_decimal8, GXv_decimal9, GXv_char1, GXv_dtime10) ;
         pmmscan.this.A396EmprCod = GXv_char4[0] ;
         pmmscan.this.A9412MMSCod = GXv_int3[0] ;
         pmmscan.this.A9421MMSRCod = GXv_int5[0] ;
         pmmscan.this.AV8MTMovCod = GXv_int6[0] ;
         pmmscan.this.AV9MTMovNom = GXv_char2[0] ;
         pmmscan.this.A9409MMSRCnt = GXv_decimal8[0] ;
         pmmscan.this.AV10ServerNow = GXv_dtime10[0] ;
         A9420MMSEst = httpContext.getMessage( "C", "") ;
         n9420MMSEst = false ;
         /* Using cursor P03MJ4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n9420MMSEst), A9420MMSEst, A396EmprCod, Integer.valueOf(A9412MMSCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMMoStk");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmmscan.this.A396EmprCod;
      this.aP1[0] = pmmscan.this.A9412MMSCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "mantenimientomaquina.pmmscan");
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
      P03MJ2_A396EmprCod = new String[] {""} ;
      P03MJ2_A9412MMSCod = new int[1] ;
      P03MJ2_A9421MMSRCod = new int[1] ;
      P03MJ2_A9409MMSRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A9409MMSRCnt = DecimalUtil.ZERO ;
      P03MJ3_A9420MMSEst = new String[] {""} ;
      P03MJ3_n9420MMSEst = new boolean[] {false} ;
      A9420MMSEst = "" ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.pmmscan__default(),
         new Object[] {
             new Object[] {
            P03MJ2_A396EmprCod, P03MJ2_A9412MMSCod, P03MJ2_A9421MMSRCod, P03MJ2_A9409MMSRCnt
            }
            , new Object[] {
            P03MJ3_A9420MMSEst, P03MJ3_n9420MMSEst
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
   private int A9421MMSRCod ;
   private int GXv_int3[] ;
   private int GXv_int5[] ;
   private int GXv_int6[] ;
   private java.math.BigDecimal A9409MMSRCnt ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private String A396EmprCod ;
   private String AV9MTMovNom ;
   private String scmdbuf ;
   private String A9420MMSEst ;
   private String GXv_char4[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private java.util.Date AV10ServerNow ;
   private java.util.Date GXv_dtime10[] ;
   private boolean n9420MMSEst ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P03MJ2_A396EmprCod ;
   private int[] P03MJ2_A9412MMSCod ;
   private int[] P03MJ2_A9421MMSRCod ;
   private java.math.BigDecimal[] P03MJ2_A9409MMSRCnt ;
   private String[] P03MJ3_A9420MMSEst ;
   private boolean[] P03MJ3_n9420MMSEst ;
}

final  class pmmscan__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03MJ2", "SELECT EmprCod, MMSCod, MMSRCod, MMSRCnt FROM TXPMMoStR WHERE (EmprCod = ? AND MMSCod = ?) AND (EmprCod = ? and MMSCod = ?) ORDER BY EmprCod, MMSCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03MJ3", "SELECT MMSEst FROM TXPMMoStk WHERE EmprCod = ? AND MMSCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03MJ4", "UPDATE TXPMMoStk SET MMSEst=?  WHERE EmprCod = ? AND MMSCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMMoStk")
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
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
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
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
      }
   }

}

