package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pccstk21 extends GXProcedure
{
   public pccstk21( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pccstk21.class ), "" );
   }

   public pccstk21( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             byte[] aP7 ,
                             String[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             java.util.Date[] aP10 ,
                             String[] aP11 )
   {
      pccstk21.this.aP12 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
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
                        java.util.Date[] aP10 ,
                        String[] aP11 ,
                        String[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
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
                             java.util.Date[] aP10 ,
                             String[] aP11 ,
                             String[] aP12 )
   {
      pccstk21.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pccstk21.this.AV9PrdNum = aP1[0];
      this.aP1 = aP1;
      pccstk21.this.AV10CCStkLen = aP2[0];
      this.aP2 = aP2;
      pccstk21.this.AV11CCStkCanE = aP3[0];
      this.aP3 = aP3;
      pccstk21.this.AV13OldCanE = aP4[0];
      this.aP4 = aP4;
      pccstk21.this.AV12CCSTkCanS = aP5[0];
      this.aP5 = aP5;
      pccstk21.this.AV14OldCanS = aP6[0];
      this.aP6 = aP6;
      pccstk21.this.AV8FlagEn = aP7[0];
      this.aP7 = aP7;
      pccstk21.this.AV15AlbCCs = aP8[0];
      this.aP8 = aP8;
      pccstk21.this.AV16PreciCCs = aP9[0];
      this.aP9 = aP9;
      pccstk21.this.AV17Fecha = aP10[0];
      this.aP10 = aP10;
      pccstk21.this.AV18CCstknalb = aP11[0];
      this.aP11 = aP11;
      pccstk21.this.AV19CCStkLot = aP12[0];
      this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P05K32 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV9PrdNum, Short.valueOf(AV10CCStkLen)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3358CCStkLen = P05K32_A3358CCStkLen[0] ;
         A719PrdNum = P05K32_A719PrdNum[0] ;
         A3345TipMovCc = P05K32_A3345TipMovCc[0] ;
         A3343CCStkCanE = P05K32_A3343CCStkCanE[0] ;
         A3354CCStkAlb = P05K32_A3354CCStkAlb[0] ;
         A3349CCStkPre = P05K32_A3349CCStkPre[0] ;
         A3348CCStkFec = P05K32_A3348CCStkFec[0] ;
         A12858CCStkNAlb = P05K32_A12858CCStkNAlb[0] ;
         A5722CCStkLot = P05K32_A5722CCStkLot[0] ;
         A3344CCStkCanS = P05K32_A3344CCStkCanS[0] ;
         A3342CCStkLin = P05K32_A3342CCStkLin[0] ;
         if ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "EN", "")) == 0 )
         {
            A3343CCStkCanE = A3343CCStkCanE.subtract(AV13OldCanE).add(AV11CCStkCanE) ;
            A3354CCStkAlb = AV15AlbCCs ;
            A3349CCStkPre = AV16PreciCCs ;
            A3348CCStkFec = AV17Fecha ;
            A12858CCStkNAlb = AV18CCstknalb ;
            A5722CCStkLot = AV19CCStkLot ;
         }
         else
         {
            A3344CCStkCanS = A3344CCStkCanS.subtract(AV14OldCanS).add(AV12CCSTkCanS) ;
         }
         AV8FlagEn = (byte)(1) ;
         /* Using cursor P05K33 */
         pr_default.execute(1, new Object[] {A3343CCStkCanE, A3354CCStkAlb, A3349CCStkPre, A3348CCStkFec, A12858CCStkNAlb, A5722CCStkLot, A3344CCStkCanS, A396EmprCod, A719PrdNum, Long.valueOf(A3342CCStkLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSTKS");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pccstk21.this.A396EmprCod;
      this.aP1[0] = pccstk21.this.AV9PrdNum;
      this.aP2[0] = pccstk21.this.AV10CCStkLen;
      this.aP3[0] = pccstk21.this.AV11CCStkCanE;
      this.aP4[0] = pccstk21.this.AV13OldCanE;
      this.aP5[0] = pccstk21.this.AV12CCSTkCanS;
      this.aP6[0] = pccstk21.this.AV14OldCanS;
      this.aP7[0] = pccstk21.this.AV8FlagEn;
      this.aP8[0] = pccstk21.this.AV15AlbCCs;
      this.aP9[0] = pccstk21.this.AV16PreciCCs;
      this.aP10[0] = pccstk21.this.AV17Fecha;
      this.aP11[0] = pccstk21.this.AV18CCstknalb;
      this.aP12[0] = pccstk21.this.AV19CCStkLot;
      Application.commitDataStores(context, remoteHandle, pr_default, "pccstk21");
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
      P05K32_A396EmprCod = new String[] {""} ;
      P05K32_A3358CCStkLen = new short[1] ;
      P05K32_A719PrdNum = new String[] {""} ;
      P05K32_A3345TipMovCc = new String[] {""} ;
      P05K32_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05K32_A3354CCStkAlb = new String[] {""} ;
      P05K32_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05K32_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P05K32_A12858CCStkNAlb = new String[] {""} ;
      P05K32_A5722CCStkLot = new String[] {""} ;
      P05K32_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05K32_A3342CCStkLin = new long[1] ;
      A719PrdNum = "" ;
      A3345TipMovCc = "" ;
      A3343CCStkCanE = DecimalUtil.ZERO ;
      A3354CCStkAlb = "" ;
      A3349CCStkPre = DecimalUtil.ZERO ;
      A3348CCStkFec = GXutil.nullDate() ;
      A12858CCStkNAlb = "" ;
      A5722CCStkLot = "" ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pccstk21__default(),
         new Object[] {
             new Object[] {
            P05K32_A396EmprCod, P05K32_A3358CCStkLen, P05K32_A719PrdNum, P05K32_A3345TipMovCc, P05K32_A3343CCStkCanE, P05K32_A3354CCStkAlb, P05K32_A3349CCStkPre, P05K32_A3348CCStkFec, P05K32_A12858CCStkNAlb, P05K32_A5722CCStkLot,
            P05K32_A3344CCStkCanS, P05K32_A3342CCStkLin
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
   private String AV18CCstknalb ;
   private String AV19CCStkLot ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A3345TipMovCc ;
   private String A3354CCStkAlb ;
   private String A12858CCStkNAlb ;
   private String A5722CCStkLot ;
   private java.util.Date AV17Fecha ;
   private java.util.Date A3348CCStkFec ;
   private String[] aP12 ;
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
   private java.util.Date[] aP10 ;
   private String[] aP11 ;
   private IDataStoreProvider pr_default ;
   private String[] P05K32_A396EmprCod ;
   private short[] P05K32_A3358CCStkLen ;
   private String[] P05K32_A719PrdNum ;
   private String[] P05K32_A3345TipMovCc ;
   private java.math.BigDecimal[] P05K32_A3343CCStkCanE ;
   private String[] P05K32_A3354CCStkAlb ;
   private java.math.BigDecimal[] P05K32_A3349CCStkPre ;
   private java.util.Date[] P05K32_A3348CCStkFec ;
   private String[] P05K32_A12858CCStkNAlb ;
   private String[] P05K32_A5722CCStkLot ;
   private java.math.BigDecimal[] P05K32_A3344CCStkCanS ;
   private long[] P05K32_A3342CCStkLin ;
}

final  class pccstk21__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05K32", "SELECT EmprCod, CCStkLen, PrdNum, TipMovCc, CCStkCanE, CCStkAlb, CCStkPre, CCStkFec, CCStkNAlb, CCStkLot, CCStkCanS, CCStkLin FROM TXPCCSTKS WHERE EmprCod = ? and PrdNum = ? and CCStkLen = ? ORDER BY EmprCod, PrdNum, CCStkLen ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05K33", "UPDATE TXPCCSTKS SET CCStkCanE=?, CCStkAlb=?, CCStkPre=?, CCStkFec=?, CCStkNAlb=?, CCStkLot=?, CCStkCanS=?  WHERE EmprCod = ? AND PrdNum = ? AND CCStkLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCSTKS")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,4);
               ((long[]) buf[11])[0] = rslt.getLong(12);
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
               stmt.setString(5, (String)parms[4], 20);
               stmt.setString(6, (String)parms[5], 26);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 4);
               stmt.setString(8, (String)parms[7], 3);
               stmt.setString(9, (String)parms[8], 6);
               stmt.setLong(10, ((Number) parms[9]).longValue());
               return;
      }
   }

}

