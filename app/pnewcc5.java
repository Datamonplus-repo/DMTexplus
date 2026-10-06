package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnewcc5 extends GXProcedure
{
   public pnewcc5( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnewcc5.class ), "" );
   }

   public pnewcc5( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     String[] aP1 ,
                                     short[] aP2 ,
                                     java.math.BigDecimal[] aP3 ,
                                     java.math.BigDecimal[] aP4 ,
                                     java.math.BigDecimal[] aP5 ,
                                     java.math.BigDecimal[] aP6 ,
                                     byte[] aP7 ,
                                     String[] aP8 ,
                                     java.math.BigDecimal[] aP9 )
   {
      pnewcc5.this.aP10 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        short[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        byte[] aP7 ,
                        String[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        java.util.Date[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             byte[] aP7 ,
                             String[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             java.util.Date[] aP10 )
   {
      pnewcc5.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnewcc5.this.AV9PrdNum = aP1[0];
      this.aP1 = aP1;
      pnewcc5.this.AV10CCStkLen = aP2[0];
      this.aP2 = aP2;
      pnewcc5.this.AV11CCStkCanE = aP3[0];
      this.aP3 = aP3;
      pnewcc5.this.AV13OldCanE = aP4[0];
      this.aP4 = aP4;
      pnewcc5.this.AV12CCSTkCanS = aP5[0];
      this.aP5 = aP5;
      pnewcc5.this.AV14OldCanS = aP6[0];
      this.aP6 = aP6;
      pnewcc5.this.AV8FlagEn = aP7[0];
      this.aP7 = aP7;
      pnewcc5.this.AV15AlbCCs = aP8[0];
      this.aP8 = aP8;
      pnewcc5.this.AV16PreciCCs = aP9[0];
      this.aP9 = aP9;
      pnewcc5.this.AV17Fecha = aP10[0];
      this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00VO2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV9PrdNum, Short.valueOf(AV10CCStkLen)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3345TipMovCc = P00VO2_A3345TipMovCc[0] ;
         A3358CCStkLen = P00VO2_A3358CCStkLen[0] ;
         A719PrdNum = P00VO2_A719PrdNum[0] ;
         A3343CCStkCanE = P00VO2_A3343CCStkCanE[0] ;
         A3354CCStkAlb = P00VO2_A3354CCStkAlb[0] ;
         A3349CCStkPre = P00VO2_A3349CCStkPre[0] ;
         A3348CCStkFec = P00VO2_A3348CCStkFec[0] ;
         A3342CCStkLin = P00VO2_A3342CCStkLin[0] ;
         if ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "EN", "")) == 0 )
         {
            A3343CCStkCanE = A3343CCStkCanE.subtract(AV13OldCanE).add(AV11CCStkCanE) ;
            A3354CCStkAlb = AV15AlbCCs ;
            A3349CCStkPre = AV16PreciCCs ;
            A3348CCStkFec = AV17Fecha ;
            AV8FlagEn = (byte)(1) ;
            /* Using cursor P00VO3 */
            pr_default.execute(1, new Object[] {A3343CCStkCanE, A3354CCStkAlb, A3349CCStkPre, A3348CCStkFec, A396EmprCod, A719PrdNum, Long.valueOf(A3342CCStkLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSTKS");
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P00VO4 */
      pr_default.execute(2, new Object[] {A396EmprCod, AV9PrdNum, Short.valueOf(AV10CCStkLen)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A3345TipMovCc = P00VO4_A3345TipMovCc[0] ;
         A3358CCStkLen = P00VO4_A3358CCStkLen[0] ;
         A719PrdNum = P00VO4_A719PrdNum[0] ;
         A3344CCStkCanS = P00VO4_A3344CCStkCanS[0] ;
         A3342CCStkLin = P00VO4_A3342CCStkLin[0] ;
         if ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SA", "")) == 0 )
         {
            A3344CCStkCanS = A3344CCStkCanS.subtract(AV14OldCanS).add(AV12CCSTkCanS) ;
            AV8FlagEn = (byte)(1) ;
            /* Using cursor P00VO5 */
            pr_default.execute(3, new Object[] {A3344CCStkCanS, A396EmprCod, A719PrdNum, Long.valueOf(A3342CCStkLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSTKS");
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnewcc5.this.A396EmprCod;
      this.aP1[0] = pnewcc5.this.AV9PrdNum;
      this.aP2[0] = pnewcc5.this.AV10CCStkLen;
      this.aP3[0] = pnewcc5.this.AV11CCStkCanE;
      this.aP4[0] = pnewcc5.this.AV13OldCanE;
      this.aP5[0] = pnewcc5.this.AV12CCSTkCanS;
      this.aP6[0] = pnewcc5.this.AV14OldCanS;
      this.aP7[0] = pnewcc5.this.AV8FlagEn;
      this.aP8[0] = pnewcc5.this.AV15AlbCCs;
      this.aP9[0] = pnewcc5.this.AV16PreciCCs;
      this.aP10[0] = pnewcc5.this.AV17Fecha;
      Application.commitDataStores(context, remoteHandle, pr_default, "pnewcc5");
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
      P00VO2_A396EmprCod = new String[] {""} ;
      P00VO2_A3345TipMovCc = new String[] {""} ;
      P00VO2_A3358CCStkLen = new short[1] ;
      P00VO2_A719PrdNum = new String[] {""} ;
      P00VO2_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00VO2_A3354CCStkAlb = new String[] {""} ;
      P00VO2_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00VO2_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P00VO2_A3342CCStkLin = new long[1] ;
      A3345TipMovCc = "" ;
      A719PrdNum = "" ;
      A3343CCStkCanE = DecimalUtil.ZERO ;
      A3354CCStkAlb = "" ;
      A3349CCStkPre = DecimalUtil.ZERO ;
      A3348CCStkFec = GXutil.nullDate() ;
      P00VO4_A396EmprCod = new String[] {""} ;
      P00VO4_A3345TipMovCc = new String[] {""} ;
      P00VO4_A3358CCStkLen = new short[1] ;
      P00VO4_A719PrdNum = new String[] {""} ;
      P00VO4_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00VO4_A3342CCStkLin = new long[1] ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnewcc5__default(),
         new Object[] {
             new Object[] {
            P00VO2_A396EmprCod, P00VO2_A3345TipMovCc, P00VO2_A3358CCStkLen, P00VO2_A719PrdNum, P00VO2_A3343CCStkCanE, P00VO2_A3354CCStkAlb, P00VO2_A3349CCStkPre, P00VO2_A3348CCStkFec, P00VO2_A3342CCStkLin
            }
            , new Object[] {
            }
            , new Object[] {
            P00VO4_A396EmprCod, P00VO4_A3345TipMovCc, P00VO4_A3358CCStkLen, P00VO4_A719PrdNum, P00VO4_A3344CCStkCanS, P00VO4_A3342CCStkLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8FlagEn ;
   private short AV10CCStkLen ;
   private short A3358CCStkLen ;
   private short Gx_err ;
   private long A3342CCStkLin ;
   private java.math.BigDecimal AV11CCStkCanE ;
   private java.math.BigDecimal AV13OldCanE ;
   private java.math.BigDecimal AV12CCSTkCanS ;
   private java.math.BigDecimal AV14OldCanS ;
   private java.math.BigDecimal AV16PreciCCs ;
   private java.math.BigDecimal A3343CCStkCanE ;
   private java.math.BigDecimal A3349CCStkPre ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private String A396EmprCod ;
   private String AV9PrdNum ;
   private String AV15AlbCCs ;
   private String scmdbuf ;
   private String A3345TipMovCc ;
   private String A719PrdNum ;
   private String A3354CCStkAlb ;
   private java.util.Date AV17Fecha ;
   private java.util.Date A3348CCStkFec ;
   private java.util.Date[] aP10 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private short[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private byte[] aP7 ;
   private String[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private IDataStoreProvider pr_default ;
   private String[] P00VO2_A396EmprCod ;
   private String[] P00VO2_A3345TipMovCc ;
   private short[] P00VO2_A3358CCStkLen ;
   private String[] P00VO2_A719PrdNum ;
   private java.math.BigDecimal[] P00VO2_A3343CCStkCanE ;
   private String[] P00VO2_A3354CCStkAlb ;
   private java.math.BigDecimal[] P00VO2_A3349CCStkPre ;
   private java.util.Date[] P00VO2_A3348CCStkFec ;
   private long[] P00VO2_A3342CCStkLin ;
   private String[] P00VO4_A396EmprCod ;
   private String[] P00VO4_A3345TipMovCc ;
   private short[] P00VO4_A3358CCStkLen ;
   private String[] P00VO4_A719PrdNum ;
   private java.math.BigDecimal[] P00VO4_A3344CCStkCanS ;
   private long[] P00VO4_A3342CCStkLin ;
}

final  class pnewcc5__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00VO2", "SELECT EmprCod, TipMovCc, CCStkLen, PrdNum, CCStkCanE, CCStkAlb, CCStkPre, CCStkFec, CCStkLin FROM TXPCCSTKS WHERE EmprCod = ? and PrdNum = ? and CCStkLen = ? ORDER BY EmprCod, PrdNum, CCStkLen ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00VO3", "UPDATE TXPCCSTKS SET CCStkCanE=?, CCStkAlb=?, CCStkPre=?, CCStkFec=?  WHERE EmprCod = ? AND PrdNum = ? AND CCStkLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCSTKS")
         ,new ForEachCursor("P00VO4", "SELECT EmprCod, TipMovCc, CCStkLen, PrdNum, CCStkCanS, CCStkLin FROM TXPCCSTKS WHERE EmprCod = ? and PrdNum = ? and CCStkLen = ? ORDER BY EmprCod, PrdNum, CCStkLen ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00VO5", "UPDATE TXPCCSTKS SET CCStkCanS=?  WHERE EmprCod = ? AND PrdNum = ? AND CCStkLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCSTKS")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((long[]) buf[8])[0] = rslt.getLong(9);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((long[]) buf[5])[0] = rslt.getLong(6);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 6);
               stmt.setLong(7, ((Number) parms[6]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 3 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
      }
   }

}

