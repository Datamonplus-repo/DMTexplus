package app.mantenimientomaquina ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmmsapl extends GXProcedure
{
   public pmmsapl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmmsapl.class ), "" );
   }

   public pmmsapl( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pmmsapl.this.aP1 = new int[] {0};
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
      pmmsapl.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmmsapl.this.A9412MMSCod = aP1[0];
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
      pmmsapl.this.A396EmprCod = GXv_char1[0] ;
      pmmsapl.this.AV8MTMovCod = GXv_int3[0] ;
      pmmsapl.this.AV9MTMovNom = GXv_char4[0] ;
      AV14ServerNow = GXutil.serverNow( context, remoteHandle, pr_default) ;
      /* Using cursor P03MI2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A9412MMSCod), A396EmprCod, Integer.valueOf(A9412MMSCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9409MMSRCnt = P03MI2_A9409MMSRCnt[0] ;
         A9421MMSRCod = P03MI2_A9421MMSRCod[0] ;
         A9424MMSRPre = P03MI2_A9424MMSRPre[0] ;
         /* Using cursor P03MI3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A9412MMSCod)});
         A9413MMSTpo = P03MI3_A9413MMSTpo[0] ;
         n9413MMSTpo = P03MI3_n9413MMSTpo[0] ;
         A9420MMSEst = P03MI3_A9420MMSEst[0] ;
         n9420MMSEst = P03MI3_n9420MMSEst[0] ;
         A11304MMSFchApl = P03MI3_A11304MMSFchApl[0] ;
         n11304MMSFchApl = P03MI3_n11304MMSFchApl[0] ;
         AV11eMMSRCnt = A9409MMSRCnt.multiply(((GXutil.strcmp(A9413MMSTpo, httpContext.getMessage( "E", ""))==0) ? DecimalUtil.doubleToDec(0) : DecimalUtil.doubleToDec(1))) ;
         AV10sMMSRCnt = A9409MMSRCnt.multiply(((GXutil.strcmp(A9413MMSTpo, httpContext.getMessage( "E", ""))==0) ? DecimalUtil.doubleToDec(1) : DecimalUtil.doubleToDec(0))) ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int3[0] = A9412MMSCod ;
         GXv_int5[0] = A9421MMSRCod ;
         GXv_int6[0] = AV8MTMovCod ;
         GXv_char2[0] = AV9MTMovNom ;
         GXv_int7[0] = (byte)(1) ;
         GXv_decimal8[0] = AV11eMMSRCnt ;
         GXv_decimal9[0] = AV10sMMSRCnt ;
         GXv_char1[0] = httpContext.getMessage( "R", "") ;
         GXv_dtime10[0] = AV14ServerNow ;
         new app.mantenimientomaquina.pmrepres(remoteHandle, context).execute( GXv_char4, GXv_int3, GXv_int5, GXv_int6, GXv_char2, GXv_int7, GXv_decimal8, GXv_decimal9, GXv_char1, GXv_dtime10) ;
         pmmsapl.this.A396EmprCod = GXv_char4[0] ;
         pmmsapl.this.A9412MMSCod = GXv_int3[0] ;
         pmmsapl.this.A9421MMSRCod = GXv_int5[0] ;
         pmmsapl.this.AV8MTMovCod = GXv_int6[0] ;
         pmmsapl.this.AV9MTMovNom = GXv_char2[0] ;
         pmmsapl.this.AV11eMMSRCnt = GXv_decimal8[0] ;
         pmmsapl.this.AV10sMMSRCnt = GXv_decimal9[0] ;
         pmmsapl.this.AV14ServerNow = GXv_dtime10[0] ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A9412MMSCod ;
         GXv_int5[0] = A9421MMSRCod ;
         GXv_int3[0] = AV8MTMovCod ;
         GXv_char2[0] = AV9MTMovNom ;
         GXv_int7[0] = (byte)(1) ;
         GXv_decimal9[0] = AV10sMMSRCnt ;
         GXv_decimal8[0] = AV11eMMSRCnt ;
         GXv_char1[0] = httpContext.getMessage( "R", "") ;
         GXv_dtime10[0] = AV14ServerNow ;
         GXv_decimal11[0] = DecimalUtil.doubleToDec(0) ;
         new app.mantenimientomaquina.pmrepmov(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int5, GXv_int3, GXv_char2, GXv_int7, GXv_decimal9, GXv_decimal8, GXv_char1, GXv_dtime10, GXv_decimal11) ;
         pmmsapl.this.A396EmprCod = GXv_char4[0] ;
         pmmsapl.this.A9412MMSCod = GXv_int6[0] ;
         pmmsapl.this.A9421MMSRCod = GXv_int5[0] ;
         pmmsapl.this.AV8MTMovCod = GXv_int3[0] ;
         pmmsapl.this.AV9MTMovNom = GXv_char2[0] ;
         pmmsapl.this.AV10sMMSRCnt = GXv_decimal9[0] ;
         pmmsapl.this.AV11eMMSRCnt = GXv_decimal8[0] ;
         pmmsapl.this.AV14ServerNow = GXv_dtime10[0] ;
         A9420MMSEst = httpContext.getMessage( "A", "") ;
         n9420MMSEst = false ;
         A11304MMSFchApl = AV14ServerNow ;
         n11304MMSFchApl = false ;
         AV12MRCod = A9421MMSRCod ;
         AV13MRStkPre = A9424MMSRPre ;
         /* Execute user subroutine: 'PRECIO' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Using cursor P03MI4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n9420MMSEst), A9420MMSEst, Boolean.valueOf(n11304MMSFchApl), A11304MMSFchApl, A396EmprCod, Integer.valueOf(A9412MMSCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMMoStk");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      pr_default.close(1);
      cleanup();
   }

   public void S111( )
   {
      /* 'PRECIO' Routine */
      returnInSub = false ;
      n9499MRStkPre = false ;
      /* Optimized UPDATE. */
      /* Using cursor P03MI5 */
      pr_default.execute(3, new Object[] {Boolean.valueOf(n9499MRStkPre), AV13MRStkPre, A396EmprCod, Integer.valueOf(AV12MRCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMREPUE");
      /* End optimized UPDATE. */
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmmsapl.this.A396EmprCod;
      this.aP1[0] = pmmsapl.this.A9412MMSCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "mantenimientomaquina.pmmsapl");
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
      AV14ServerNow = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      P03MI2_A396EmprCod = new String[] {""} ;
      P03MI2_A9412MMSCod = new int[1] ;
      P03MI2_A9409MMSRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03MI2_A9421MMSRCod = new int[1] ;
      P03MI2_A9424MMSRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A9409MMSRCnt = DecimalUtil.ZERO ;
      A9424MMSRPre = DecimalUtil.ZERO ;
      P03MI3_A9413MMSTpo = new String[] {""} ;
      P03MI3_n9413MMSTpo = new boolean[] {false} ;
      P03MI3_A9420MMSEst = new String[] {""} ;
      P03MI3_n9420MMSEst = new boolean[] {false} ;
      P03MI3_A11304MMSFchApl = new java.util.Date[] {GXutil.nullDate()} ;
      P03MI3_n11304MMSFchApl = new boolean[] {false} ;
      A9413MMSTpo = "" ;
      A9420MMSEst = "" ;
      A11304MMSFchApl = GXutil.resetTime( GXutil.nullDate() );
      AV11eMMSRCnt = DecimalUtil.ZERO ;
      AV10sMMSRCnt = DecimalUtil.ZERO ;
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
      AV13MRStkPre = DecimalUtil.ZERO ;
      A9499MRStkPre = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.pmmsapl__default(),
         new Object[] {
             new Object[] {
            P03MI2_A396EmprCod, P03MI2_A9412MMSCod, P03MI2_A9409MMSRCnt, P03MI2_A9421MMSRCod, P03MI2_A9424MMSRPre
            }
            , new Object[] {
            P03MI3_A9413MMSTpo, P03MI3_n9413MMSTpo, P03MI3_A9420MMSEst, P03MI3_n9420MMSEst, P03MI3_A11304MMSFchApl, P03MI3_n11304MMSFchApl
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

   private byte GXv_int7[] ;
   private short Gx_err ;
   private int A9412MMSCod ;
   private int AV8MTMovCod ;
   private int A9421MMSRCod ;
   private int GXv_int6[] ;
   private int GXv_int5[] ;
   private int GXv_int3[] ;
   private int AV12MRCod ;
   private java.math.BigDecimal A9409MMSRCnt ;
   private java.math.BigDecimal A9424MMSRPre ;
   private java.math.BigDecimal AV11eMMSRCnt ;
   private java.math.BigDecimal AV10sMMSRCnt ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal AV13MRStkPre ;
   private java.math.BigDecimal A9499MRStkPre ;
   private String A396EmprCod ;
   private String AV9MTMovNom ;
   private String scmdbuf ;
   private String A9413MMSTpo ;
   private String A9420MMSEst ;
   private String GXv_char4[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private java.util.Date AV14ServerNow ;
   private java.util.Date A11304MMSFchApl ;
   private java.util.Date GXv_dtime10[] ;
   private boolean n9413MMSTpo ;
   private boolean n9420MMSEst ;
   private boolean n11304MMSFchApl ;
   private boolean returnInSub ;
   private boolean n9499MRStkPre ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P03MI2_A396EmprCod ;
   private int[] P03MI2_A9412MMSCod ;
   private java.math.BigDecimal[] P03MI2_A9409MMSRCnt ;
   private int[] P03MI2_A9421MMSRCod ;
   private java.math.BigDecimal[] P03MI2_A9424MMSRPre ;
   private String[] P03MI3_A9413MMSTpo ;
   private boolean[] P03MI3_n9413MMSTpo ;
   private String[] P03MI3_A9420MMSEst ;
   private boolean[] P03MI3_n9420MMSEst ;
   private java.util.Date[] P03MI3_A11304MMSFchApl ;
   private boolean[] P03MI3_n11304MMSFchApl ;
}

final  class pmmsapl__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03MI2", "SELECT EmprCod, MMSCod, MMSRCnt, MMSRCod, MMSRPre FROM TXPMMoStR WHERE (EmprCod = ? AND MMSCod = ?) AND (EmprCod = ? and MMSCod = ?) ORDER BY EmprCod, MMSCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03MI3", "SELECT MMSTpo, MMSEst, MMSFchApl FROM TXPMMoStk WHERE EmprCod = ? AND MMSCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03MI4", "UPDATE TXPMMoStk SET MMSEst=?, MMSFchApl=?  WHERE EmprCod = ? AND MMSCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMMoStk")
         ,new UpdateCursor("P03MI5", "UPDATE TXPMREPUE SET MRStkPre=?  WHERE EmprCod = ? and MRCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMREPUE")
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
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
                  stmt.setNull( 2 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(2, (java.util.Date)parms[3], false);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 3);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
      }
   }

}

