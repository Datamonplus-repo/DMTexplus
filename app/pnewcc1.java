package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnewcc1 extends GXProcedure
{
   public pnewcc1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnewcc1.class ), "" );
   }

   public pnewcc1( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           short[] aP2 ,
                           java.math.BigDecimal[] aP3 ,
                           java.math.BigDecimal[] aP4 ,
                           java.math.BigDecimal[] aP5 ,
                           java.math.BigDecimal[] aP6 )
   {
      pnewcc1.this.aP7 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        short[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        byte[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             byte[] aP7 )
   {
      pnewcc1.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnewcc1.this.AV9PrdNum = aP1[0];
      this.aP1 = aP1;
      pnewcc1.this.AV10CCStkLen = aP2[0];
      this.aP2 = aP2;
      pnewcc1.this.AV11CCStkCanE = aP3[0];
      this.aP3 = aP3;
      pnewcc1.this.AV13OldCanE = aP4[0];
      this.aP4 = aP4;
      pnewcc1.this.AV12CCSTkCanS = aP5[0];
      this.aP5 = aP5;
      pnewcc1.this.AV14OldCanS = aP6[0];
      this.aP6 = aP6;
      pnewcc1.this.AV8FlagEn = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = (byte)(DecimalUtil.decToDouble(AV17Nclec)) ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NCLEC", ""), GXv_int1) ;
      pnewcc1.this.AV17Nclec = DecimalUtil.doubleToDec(GXv_int1[0]) ;
      /* Using cursor P00MU2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV9PrdNum, Short.valueOf(AV10CCStkLen)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3358CCStkLen = P00MU2_A3358CCStkLen[0] ;
         A719PrdNum = P00MU2_A719PrdNum[0] ;
         A3345TipMovCc = P00MU2_A3345TipMovCc[0] ;
         A3343CCStkCanE = P00MU2_A3343CCStkCanE[0] ;
         A3344CCStkCanS = P00MU2_A3344CCStkCanS[0] ;
         A3342CCStkLin = P00MU2_A3342CCStkLin[0] ;
         Gx_msg = AV9PrdNum + " " + httpContext.getMessage( " In PNEWCC1.Act CCSTKS", "") ;
         System.out.println( Gx_msg );
         if ( GXutil.strcmp(A3345TipMovCc, "EN") == 0 )
         {
            A3343CCStkCanE = A3343CCStkCanE.subtract(AV13OldCanE).add(AV11CCStkCanE) ;
         }
         else
         {
            A3344CCStkCanS = A3344CCStkCanS.subtract(AV14OldCanS).add(AV12CCSTkCanS) ;
         }
         AV8FlagEn = (byte)(1) ;
         Gx_msg = AV9PrdNum + " " + httpContext.getMessage( " end PNEWCC1.Act CCSTKS", "") ;
         System.out.println( Gx_msg );
         /* Using cursor P00MU3 */
         pr_default.execute(1, new Object[] {A3343CCStkCanE, A3344CCStkCanS, A396EmprCod, A719PrdNum, Long.valueOf(A3342CCStkLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSTKS");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV17Nclec.doubleValue() == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pnewcc1");
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnewcc1.this.A396EmprCod;
      this.aP1[0] = pnewcc1.this.AV9PrdNum;
      this.aP2[0] = pnewcc1.this.AV10CCStkLen;
      this.aP3[0] = pnewcc1.this.AV11CCStkCanE;
      this.aP4[0] = pnewcc1.this.AV13OldCanE;
      this.aP5[0] = pnewcc1.this.AV12CCSTkCanS;
      this.aP6[0] = pnewcc1.this.AV14OldCanS;
      this.aP7[0] = pnewcc1.this.AV8FlagEn;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV17Nclec = DecimalUtil.ZERO ;
      GXv_int1 = new byte[1] ;
      scmdbuf = "" ;
      P00MU2_A396EmprCod = new String[] {""} ;
      P00MU2_A3358CCStkLen = new short[1] ;
      P00MU2_A719PrdNum = new String[] {""} ;
      P00MU2_A3345TipMovCc = new String[] {""} ;
      P00MU2_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00MU2_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00MU2_A3342CCStkLin = new long[1] ;
      A719PrdNum = "" ;
      A3345TipMovCc = "" ;
      A3343CCStkCanE = DecimalUtil.ZERO ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pnewcc1__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pnewcc1__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pnewcc1__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnewcc1__default(),
         new Object[] {
             new Object[] {
            P00MU2_A396EmprCod, P00MU2_A3358CCStkLen, P00MU2_A719PrdNum, P00MU2_A3345TipMovCc, P00MU2_A3343CCStkCanE, P00MU2_A3344CCStkCanS, P00MU2_A3342CCStkLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8FlagEn ;
   private byte GXv_int1[] ;
   private short AV10CCStkLen ;
   private short A3358CCStkLen ;
   private short Gx_err ;
   private long A3342CCStkLin ;
   private java.math.BigDecimal AV11CCStkCanE ;
   private java.math.BigDecimal AV13OldCanE ;
   private java.math.BigDecimal AV12CCSTkCanS ;
   private java.math.BigDecimal AV14OldCanS ;
   private java.math.BigDecimal AV17Nclec ;
   private java.math.BigDecimal A3343CCStkCanE ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private String A396EmprCod ;
   private String AV9PrdNum ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A3345TipMovCc ;
   private String Gx_msg ;
   private byte[] aP7 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private short[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P00MU2_A396EmprCod ;
   private short[] P00MU2_A3358CCStkLen ;
   private String[] P00MU2_A719PrdNum ;
   private String[] P00MU2_A3345TipMovCc ;
   private java.math.BigDecimal[] P00MU2_A3343CCStkCanE ;
   private java.math.BigDecimal[] P00MU2_A3344CCStkCanS ;
   private long[] P00MU2_A3342CCStkLin ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pnewcc1__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class pnewcc1__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class pnewcc1__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class pnewcc1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00MU2", "SELECT EmprCod, CCStkLen, PrdNum, TipMovCc, CCStkCanE, CCStkCanS, CCStkLin FROM TXPCCSTKS WHERE EmprCod = ? and PrdNum = ? and CCStkLen = ? ORDER BY EmprCod, PrdNum, CCStkLen ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00MU3", "UPDATE TXPCCSTKS SET CCStkCanE=?, CCStkCanS=?  WHERE EmprCod = ? AND PrdNum = ? AND CCStkLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCSTKS")
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
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((long[]) buf[6])[0] = rslt.getLong(7);
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
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               return;
      }
   }

}

