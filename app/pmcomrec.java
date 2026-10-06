package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmcomrec extends GXProcedure
{
   public pmcomrec( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmcomrec.class ), "" );
   }

   public pmcomrec( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 )
   {
      pmcomrec.this.aP1 = new long[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 )
   {
      pmcomrec.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmcomrec.this.A11055MComCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = httpContext.getMessage( "EC", "") ;
      GXv_int3[0] = AV8MTMovCod ;
      GXv_char4[0] = AV9MTMovNom ;
      new app.mantenimientomaquina.pmrmtesp(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3, GXv_char4) ;
      pmcomrec.this.A396EmprCod = GXv_char1[0] ;
      pmcomrec.this.AV8MTMovCod = GXv_int3[0] ;
      pmcomrec.this.AV9MTMovNom = GXv_char4[0] ;
      AV14ServerNow = GXutil.serverNow( context, remoteHandle, pr_default) ;
      /* Using cursor P04EQ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A11055MComCod), A396EmprCod, Long.valueOf(A11055MComCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11053MComEntCnt = P04EQ2_A11053MComEntCnt[0] ;
         A9492MRCod = P04EQ2_A9492MRCod[0] ;
         A11054MComEntPre = P04EQ2_A11054MComEntPre[0] ;
         /* Using cursor P04EQ3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A11055MComCod)});
         A11049MComEst = P04EQ3_A11049MComEst[0] ;
         AV15MComEntCnt = A11053MComEntCnt.negate() ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int3[0] = (int)(A11055MComCod) ;
         GXv_int5[0] = A9492MRCod ;
         GXv_int6[0] = AV8MTMovCod ;
         GXv_char2[0] = AV9MTMovNom ;
         GXv_int7[0] = (byte)(1) ;
         GXv_decimal8[0] = DecimalUtil.doubleToDec(0) ;
         GXv_decimal9[0] = AV15MComEntCnt ;
         GXv_char1[0] = httpContext.getMessage( "R", "") ;
         GXv_dtime10[0] = AV14ServerNow ;
         GXv_decimal11[0] = DecimalUtil.doubleToDec(0) ;
         new app.mantenimientomaquina.pmrepmov(remoteHandle, context).execute( GXv_char4, GXv_int3, GXv_int5, GXv_int6, GXv_char2, GXv_int7, GXv_decimal8, GXv_decimal9, GXv_char1, GXv_dtime10, GXv_decimal11) ;
         pmcomrec.this.A396EmprCod = GXv_char4[0] ;
         pmcomrec.this.A11055MComCod = GXv_int3[0] ;
         pmcomrec.this.A9492MRCod = GXv_int5[0] ;
         pmcomrec.this.AV8MTMovCod = GXv_int6[0] ;
         pmcomrec.this.AV9MTMovNom = GXv_char2[0] ;
         pmcomrec.this.AV15MComEntCnt = GXv_decimal9[0] ;
         pmcomrec.this.AV14ServerNow = GXv_dtime10[0] ;
         A11049MComEst = httpContext.getMessage( "R", "") ;
         AV12MRCod = A9492MRCod ;
         AV13MRStkPre = A11054MComEntPre ;
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
         /* Using cursor P04EQ4 */
         pr_default.execute(2, new Object[] {A11049MComEst, A396EmprCod, Long.valueOf(A11055MComCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMRepCo");
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
      /* Using cursor P04EQ5 */
      pr_default.execute(3, new Object[] {Boolean.valueOf(n9499MRStkPre), AV13MRStkPre, A396EmprCod, Integer.valueOf(AV12MRCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMREPUE");
      /* End optimized UPDATE. */
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmcomrec.this.A396EmprCod;
      this.aP1[0] = pmcomrec.this.A11055MComCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmcomrec");
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
      P04EQ2_A396EmprCod = new String[] {""} ;
      P04EQ2_A11055MComCod = new long[1] ;
      P04EQ2_A11053MComEntCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04EQ2_A9492MRCod = new int[1] ;
      P04EQ2_A11054MComEntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A11053MComEntCnt = DecimalUtil.ZERO ;
      A11054MComEntPre = DecimalUtil.ZERO ;
      P04EQ3_A11049MComEst = new String[] {""} ;
      A11049MComEst = "" ;
      AV15MComEntCnt = DecimalUtil.ZERO ;
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
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      AV13MRStkPre = DecimalUtil.ZERO ;
      A9499MRStkPre = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmcomrec__default(),
         new Object[] {
             new Object[] {
            P04EQ2_A396EmprCod, P04EQ2_A11055MComCod, P04EQ2_A11053MComEntCnt, P04EQ2_A9492MRCod, P04EQ2_A11054MComEntPre
            }
            , new Object[] {
            P04EQ3_A11049MComEst
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
   private int AV8MTMovCod ;
   private int A9492MRCod ;
   private int GXv_int3[] ;
   private int GXv_int5[] ;
   private int GXv_int6[] ;
   private int AV12MRCod ;
   private long A11055MComCod ;
   private java.math.BigDecimal A11053MComEntCnt ;
   private java.math.BigDecimal A11054MComEntPre ;
   private java.math.BigDecimal AV15MComEntCnt ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal AV13MRStkPre ;
   private java.math.BigDecimal A9499MRStkPre ;
   private String A396EmprCod ;
   private String AV9MTMovNom ;
   private String scmdbuf ;
   private String A11049MComEst ;
   private String GXv_char4[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private java.util.Date AV14ServerNow ;
   private java.util.Date GXv_dtime10[] ;
   private boolean returnInSub ;
   private boolean n9499MRStkPre ;
   private long[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P04EQ2_A396EmprCod ;
   private long[] P04EQ2_A11055MComCod ;
   private java.math.BigDecimal[] P04EQ2_A11053MComEntCnt ;
   private int[] P04EQ2_A9492MRCod ;
   private java.math.BigDecimal[] P04EQ2_A11054MComEntPre ;
   private String[] P04EQ3_A11049MComEst ;
}

final  class pmcomrec__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04EQ2", "SELECT EmprCod, MComCod, MComEntCnt, MRCod, MComEntPre FROM TXPMRepC1 WHERE (EmprCod = ? AND MComCod = ?) AND (EmprCod = ? and MComCod = ?) ORDER BY EmprCod, MComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04EQ3", "SELECT MComEst FROM TXPMRepCo WHERE EmprCod = ? AND MComCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04EQ4", "UPDATE TXPMRepCo SET MComEst=?  WHERE EmprCod = ? AND MComCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMRepCo")
         ,new UpdateCursor("P04EQ5", "UPDATE TXPMREPUE SET MRStkPre=?  WHERE EmprCod = ? and MRCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMREPUE")
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
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

