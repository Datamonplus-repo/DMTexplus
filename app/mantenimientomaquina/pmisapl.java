package app.mantenimientomaquina ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmisapl extends GXProcedure
{
   public pmisapl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmisapl.class ), "" );
   }

   public pmisapl( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pmisapl.this.aP1 = new int[] {0};
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
      pmisapl.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmisapl.this.A9398MISCod = aP1[0];
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
      pmisapl.this.A396EmprCod = GXv_char1[0] ;
      pmisapl.this.AV8MTMovCod = GXv_int3[0] ;
      pmisapl.this.AV9MTMovNom = GXv_char4[0] ;
      AV11ServerNow = GXutil.serverNow( context, remoteHandle, pr_default) ;
      /* Using cursor P03MB2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A9398MISCod), A396EmprCod, Integer.valueOf(A9398MISCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9408MISRStkDif = P03MB2_A9408MISRStkDif[0] ;
         A9403MISRCod = P03MB2_A9403MISRCod[0] ;
         /* Using cursor P03MB3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A9398MISCod)});
         A9402MISEst = P03MB3_A9402MISEst[0] ;
         n9402MISEst = P03MB3_n9402MISEst[0] ;
         A11303MISFchApl = P03MB3_A11303MISFchApl[0] ;
         n11303MISFchApl = P03MB3_n11303MISFchApl[0] ;
         AV10MISRStkDif = A9408MISRStkDif.negate() ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int3[0] = A9398MISCod ;
         GXv_int5[0] = A9403MISRCod ;
         GXv_int6[0] = AV8MTMovCod ;
         GXv_char2[0] = AV9MTMovNom ;
         GXv_int7[0] = (byte)(1) ;
         GXv_decimal8[0] = AV10MISRStkDif ;
         GXv_decimal9[0] = DecimalUtil.doubleToDec(0) ;
         GXv_char1[0] = httpContext.getMessage( "R", "") ;
         GXv_dtime10[0] = AV11ServerNow ;
         new app.mantenimientomaquina.pmrepres(remoteHandle, context).execute( GXv_char4, GXv_int3, GXv_int5, GXv_int6, GXv_char2, GXv_int7, GXv_decimal8, GXv_decimal9, GXv_char1, GXv_dtime10) ;
         pmisapl.this.A396EmprCod = GXv_char4[0] ;
         pmisapl.this.A9398MISCod = GXv_int3[0] ;
         pmisapl.this.A9403MISRCod = GXv_int5[0] ;
         pmisapl.this.AV8MTMovCod = GXv_int6[0] ;
         pmisapl.this.AV9MTMovNom = GXv_char2[0] ;
         pmisapl.this.AV10MISRStkDif = GXv_decimal8[0] ;
         pmisapl.this.AV11ServerNow = GXv_dtime10[0] ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A9398MISCod ;
         GXv_int5[0] = A9403MISRCod ;
         GXv_int3[0] = AV8MTMovCod ;
         GXv_char2[0] = AV9MTMovNom ;
         GXv_int7[0] = (byte)(1) ;
         GXv_decimal9[0] = DecimalUtil.doubleToDec(0) ;
         GXv_decimal8[0] = AV10MISRStkDif ;
         GXv_char1[0] = httpContext.getMessage( "R", "") ;
         GXv_dtime10[0] = AV11ServerNow ;
         GXv_decimal11[0] = DecimalUtil.doubleToDec(0) ;
         new app.mantenimientomaquina.pmrepmov(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int5, GXv_int3, GXv_char2, GXv_int7, GXv_decimal9, GXv_decimal8, GXv_char1, GXv_dtime10, GXv_decimal11) ;
         pmisapl.this.A396EmprCod = GXv_char4[0] ;
         pmisapl.this.A9398MISCod = GXv_int6[0] ;
         pmisapl.this.A9403MISRCod = GXv_int5[0] ;
         pmisapl.this.AV8MTMovCod = GXv_int3[0] ;
         pmisapl.this.AV9MTMovNom = GXv_char2[0] ;
         pmisapl.this.AV10MISRStkDif = GXv_decimal8[0] ;
         pmisapl.this.AV11ServerNow = GXv_dtime10[0] ;
         A9402MISEst = httpContext.getMessage( "A", "") ;
         n9402MISEst = false ;
         A11303MISFchApl = GXutil.resetTime(GXutil.serverNow( context, remoteHandle, pr_default)) ;
         n11303MISFchApl = false ;
         /* Using cursor P03MB4 */
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
      this.aP0[0] = pmisapl.this.A396EmprCod;
      this.aP1[0] = pmisapl.this.A9398MISCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "mantenimientomaquina.pmisapl");
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
      AV11ServerNow = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      P03MB2_A396EmprCod = new String[] {""} ;
      P03MB2_A9398MISCod = new int[1] ;
      P03MB2_A9408MISRStkDif = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03MB2_A9403MISRCod = new int[1] ;
      A9408MISRStkDif = DecimalUtil.ZERO ;
      P03MB3_A9402MISEst = new String[] {""} ;
      P03MB3_n9402MISEst = new boolean[] {false} ;
      P03MB3_A11303MISFchApl = new java.util.Date[] {GXutil.nullDate()} ;
      P03MB3_n11303MISFchApl = new boolean[] {false} ;
      A9402MISEst = "" ;
      A11303MISFchApl = GXutil.nullDate() ;
      AV10MISRStkDif = DecimalUtil.ZERO ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int5 = new int[1] ;
      GXv_int3 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_int7 = new byte[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_char1 = new String[1] ;
      GXv_dtime10 = new java.util.Date[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.pmisapl__default(),
         new Object[] {
             new Object[] {
            P03MB2_A396EmprCod, P03MB2_A9398MISCod, P03MB2_A9408MISRStkDif, P03MB2_A9403MISRCod
            }
            , new Object[] {
            P03MB3_A9402MISEst, P03MB3_n9402MISEst, P03MB3_A11303MISFchApl, P03MB3_n11303MISFchApl
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
   private int A9398MISCod ;
   private int AV8MTMovCod ;
   private int A9403MISRCod ;
   private int GXv_int6[] ;
   private int GXv_int5[] ;
   private int GXv_int3[] ;
   private java.math.BigDecimal A9408MISRStkDif ;
   private java.math.BigDecimal AV10MISRStkDif ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private String A396EmprCod ;
   private String AV9MTMovNom ;
   private String scmdbuf ;
   private String A9402MISEst ;
   private String GXv_char4[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private java.util.Date AV11ServerNow ;
   private java.util.Date GXv_dtime10[] ;
   private java.util.Date A11303MISFchApl ;
   private boolean n9402MISEst ;
   private boolean n11303MISFchApl ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P03MB2_A396EmprCod ;
   private int[] P03MB2_A9398MISCod ;
   private java.math.BigDecimal[] P03MB2_A9408MISRStkDif ;
   private int[] P03MB2_A9403MISRCod ;
   private String[] P03MB3_A9402MISEst ;
   private boolean[] P03MB3_n9402MISEst ;
   private java.util.Date[] P03MB3_A11303MISFchApl ;
   private boolean[] P03MB3_n11303MISFchApl ;
}

final  class pmisapl__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03MB2", "SELECT EmprCod, MISCod, MISRStkDif, MISRCod FROM TXPMInSRe WHERE (EmprCod = ? AND MISCod = ?) AND (EmprCod = ? and MISCod = ?) ORDER BY EmprCod, MISCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03MB3", "SELECT MISEst, MISFchApl FROM TXPMINVST WHERE EmprCod = ? AND MISCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03MB4", "UPDATE TXPMINVST SET MISEst=?, MISFchApl=?  WHERE EmprCod = ? AND MISCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMINVST")
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
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

