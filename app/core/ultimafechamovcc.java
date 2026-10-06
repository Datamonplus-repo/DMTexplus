package app.core ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ultimafechamovcc extends GXProcedure
{
   public ultimafechamovcc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ultimafechamovcc.class ), "" );
   }

   public ultimafechamovcc( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     String[] aP1 )
   {
      ultimafechamovcc.this.aP2 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.util.Date[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.util.Date[] aP2 )
   {
      ultimafechamovcc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ultimafechamovcc.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      ultimafechamovcc.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8CCStkFec = GXutil.nullDate() ;
      /* Using cursor P09742 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3345TipMovCc = P09742_A3345TipMovCc[0] ;
         A3348CCStkFec = P09742_A3348CCStkFec[0] ;
         A3342CCStkLin = P09742_A3342CCStkLin[0] ;
         AV8CCStkFec = A3348CCStkFec ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ultimafechamovcc.this.A396EmprCod;
      this.aP1[0] = ultimafechamovcc.this.A719PrdNum;
      this.aP2[0] = ultimafechamovcc.this.AV8CCStkFec;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8CCStkFec = GXutil.nullDate() ;
      scmdbuf = "" ;
      P09742_A396EmprCod = new String[] {""} ;
      P09742_A719PrdNum = new String[] {""} ;
      P09742_A3345TipMovCc = new String[] {""} ;
      P09742_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09742_A3342CCStkLin = new long[1] ;
      A3345TipMovCc = "" ;
      A3348CCStkFec = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.core.ultimafechamovcc__default(),
         new Object[] {
             new Object[] {
            P09742_A396EmprCod, P09742_A719PrdNum, P09742_A3345TipMovCc, P09742_A3348CCStkFec, P09742_A3342CCStkLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long A3342CCStkLin ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String scmdbuf ;
   private String A3345TipMovCc ;
   private java.util.Date AV8CCStkFec ;
   private java.util.Date A3348CCStkFec ;
   private java.util.Date[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P09742_A396EmprCod ;
   private String[] P09742_A719PrdNum ;
   private String[] P09742_A3345TipMovCc ;
   private java.util.Date[] P09742_A3348CCStkFec ;
   private long[] P09742_A3342CCStkLin ;
}

final  class ultimafechamovcc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09742", "SELECT * FROM (SELECT EmprCod, PrdNum, TipMovCc, CCStkFec, CCStkLin FROM TXPCCSTKS WHERE (EmprCod = ? and PrdNum = ?) AND (TipMovCc <> 'SR') ORDER BY EmprCod, PrdNum, CCStkLin DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

