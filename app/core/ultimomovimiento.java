package app.core ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ultimomovimiento extends GXProcedure
{
   public ultimomovimiento( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ultimomovimiento.class ), "" );
   }

   public ultimomovimiento( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            String[] aP1 )
   {
      ultimomovimiento.this.aP2 = new short[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        short[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 )
   {
      ultimomovimiento.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ultimomovimiento.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      ultimomovimiento.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P096W2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3345TipMovCc = P096W2_A3345TipMovCc[0] ;
         A3348CCStkFec = P096W2_A3348CCStkFec[0] ;
         A3342CCStkLin = P096W2_A3342CCStkLin[0] ;
         AV8CCStkFec = A3348CCStkFec ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV10NumeroDias = (short)(0) ;
      AV10NumeroDias = (short)((GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV8CCStkFec)) ? 0 : GXutil.ddiff(GXutil.serverDate( context, remoteHandle, pr_default),AV8CCStkFec))) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ultimomovimiento.this.A396EmprCod;
      this.aP1[0] = ultimomovimiento.this.A719PrdNum;
      this.aP2[0] = ultimomovimiento.this.AV10NumeroDias;
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
      P096W2_A396EmprCod = new String[] {""} ;
      P096W2_A719PrdNum = new String[] {""} ;
      P096W2_A3345TipMovCc = new String[] {""} ;
      P096W2_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P096W2_A3342CCStkLin = new long[1] ;
      A3345TipMovCc = "" ;
      A3348CCStkFec = GXutil.nullDate() ;
      AV8CCStkFec = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.core.ultimomovimiento__default(),
         new Object[] {
             new Object[] {
            P096W2_A396EmprCod, P096W2_A719PrdNum, P096W2_A3345TipMovCc, P096W2_A3348CCStkFec, P096W2_A3342CCStkLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10NumeroDias ;
   private short Gx_err ;
   private long A3342CCStkLin ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String scmdbuf ;
   private String A3345TipMovCc ;
   private java.util.Date A3348CCStkFec ;
   private java.util.Date AV8CCStkFec ;
   private short[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P096W2_A396EmprCod ;
   private String[] P096W2_A719PrdNum ;
   private String[] P096W2_A3345TipMovCc ;
   private java.util.Date[] P096W2_A3348CCStkFec ;
   private long[] P096W2_A3342CCStkLin ;
}

final  class ultimomovimiento__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P096W2", "SELECT * FROM (SELECT EmprCod, PrdNum, TipMovCc, CCStkFec, CCStkLin FROM TXPCCSTKS WHERE (EmprCod = ? and PrdNum = ?) AND (TipMovCc <> 'SR') ORDER BY EmprCod, PrdNum, CCStkLin DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               return;
      }
   }

}

