package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pget_diasprodsinmovimiento extends GXProcedure
{
   public pget_diasprodsinmovimiento( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pget_diasprodsinmovimiento.class ), "" );
   }

   public pget_diasprodsinmovimiento( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            String aP1 ,
                            int aP2 )
   {
      pget_diasprodsinmovimiento.this.aP3 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        int aP2 ,
                        short[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             int aP2 ,
                             short[] aP3 )
   {
      pget_diasprodsinmovimiento.this.AV13EmprCod = aP0;
      pget_diasprodsinmovimiento.this.AV9Prdnum = aP1;
      pget_diasprodsinmovimiento.this.AV10PrvNum = aP2;
      pget_diasprodsinmovimiento.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P09K52 */
      pr_default.execute(0, new Object[] {AV13EmprCod, AV9Prdnum, Integer.valueOf(AV10PrvNum)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A704PrdExiAlm = P09K52_A704PrdExiAlm[0] ;
         A795PrvNum = P09K52_A795PrvNum[0] ;
         A719PrdNum = P09K52_A719PrdNum[0] ;
         A396EmprCod = P09K52_A396EmprCod[0] ;
         AV8Ccstkfec = GXutil.nullDate() ;
         AV11TipMovcc = "" ;
         AV12PrdNumIN = A719PrdNum ;
         /* Execute user subroutine: 'CCSTKS' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV22Diff = (short)(0) ;
         if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV8Ccstkfec)) )
         {
            AV22Diff = (short)(GXutil.ddiff(GXutil.today( ),AV8Ccstkfec)) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'CCSTKS' Routine */
      returnInSub = false ;
      /* Using cursor P09K53 */
      pr_default.execute(1, new Object[] {AV13EmprCod, AV12PrdNumIN});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A396EmprCod = P09K53_A396EmprCod[0] ;
         A719PrdNum = P09K53_A719PrdNum[0] ;
         A3345TipMovCc = P09K53_A3345TipMovCc[0] ;
         A3348CCStkFec = P09K53_A3348CCStkFec[0] ;
         A3342CCStkLin = P09K53_A3342CCStkLin[0] ;
         AV8Ccstkfec = A3348CCStkFec ;
         AV11TipMovcc = A3345TipMovCc ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = pget_diasprodsinmovimiento.this.AV22Diff;
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
      P09K52_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09K52_A795PrvNum = new int[1] ;
      P09K52_A719PrdNum = new String[] {""} ;
      P09K52_A396EmprCod = new String[] {""} ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      AV8Ccstkfec = GXutil.nullDate() ;
      AV11TipMovcc = "" ;
      AV12PrdNumIN = "" ;
      P09K53_A396EmprCod = new String[] {""} ;
      P09K53_A719PrdNum = new String[] {""} ;
      P09K53_A3345TipMovCc = new String[] {""} ;
      P09K53_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09K53_A3342CCStkLin = new long[1] ;
      A3345TipMovCc = "" ;
      A3348CCStkFec = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pget_diasprodsinmovimiento__default(),
         new Object[] {
             new Object[] {
            P09K52_A704PrdExiAlm, P09K52_A795PrvNum, P09K52_A719PrdNum, P09K52_A396EmprCod
            }
            , new Object[] {
            P09K53_A396EmprCod, P09K53_A719PrdNum, P09K53_A3345TipMovCc, P09K53_A3348CCStkFec, P09K53_A3342CCStkLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV22Diff ;
   private short Gx_err ;
   private int AV10PrvNum ;
   private int A795PrvNum ;
   private long A3342CCStkLin ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private String AV13EmprCod ;
   private String AV9Prdnum ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private String AV11TipMovcc ;
   private String AV12PrdNumIN ;
   private String A3345TipMovCc ;
   private java.util.Date AV8Ccstkfec ;
   private java.util.Date A3348CCStkFec ;
   private boolean returnInSub ;
   private short[] aP3 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P09K52_A704PrdExiAlm ;
   private int[] P09K52_A795PrvNum ;
   private String[] P09K52_A719PrdNum ;
   private String[] P09K52_A396EmprCod ;
   private String[] P09K53_A396EmprCod ;
   private String[] P09K53_A719PrdNum ;
   private String[] P09K53_A3345TipMovCc ;
   private java.util.Date[] P09K53_A3348CCStkFec ;
   private long[] P09K53_A3342CCStkLin ;
}

final  class pget_diasprodsinmovimiento__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09K52", "SELECT PrdExiAlm, PrvNum, PrdNum, EmprCod FROM TXPPRODUC WHERE (EmprCod = ? and PrdNum = ?) AND (PrdExiAlm > 0) AND (PrvNum = ?) ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09K53", "SELECT * FROM (SELECT EmprCod, PrdNum, TipMovCc, CCStkFec, CCStkLin FROM TXPCCSTKS WHERE (EmprCod = ? and PrdNum = ?) AND (TipMovCc <> 'SR') ORDER BY EmprCod, PrdNum, CCStkLin DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

