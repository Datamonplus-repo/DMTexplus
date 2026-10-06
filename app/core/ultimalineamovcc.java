package app.core ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ultimalineamovcc extends GXProcedure
{
   public ultimalineamovcc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ultimalineamovcc.class ), "" );
   }

   public ultimalineamovcc( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String aP0 ,
                           String aP1 )
   {
      ultimalineamovcc.this.aP2 = new long[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        long[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             long[] aP2 )
   {
      ultimalineamovcc.this.A396EmprCod = aP0;
      ultimalineamovcc.this.A719PrdNum = aP1;
      ultimalineamovcc.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11CCStkLin = 0 ;
      /* Using cursor P09752 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3345TipMovCc = P09752_A3345TipMovCc[0] ;
         A3342CCStkLin = P09752_A3342CCStkLin[0] ;
         AV11CCStkLin = A3342CCStkLin ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = ultimalineamovcc.this.AV11CCStkLin;
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
      P09752_A396EmprCod = new String[] {""} ;
      P09752_A719PrdNum = new String[] {""} ;
      P09752_A3345TipMovCc = new String[] {""} ;
      P09752_A3342CCStkLin = new long[1] ;
      A3345TipMovCc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.core.ultimalineamovcc__default(),
         new Object[] {
             new Object[] {
            P09752_A396EmprCod, P09752_A719PrdNum, P09752_A3345TipMovCc, P09752_A3342CCStkLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long AV11CCStkLin ;
   private long A3342CCStkLin ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String scmdbuf ;
   private String A3345TipMovCc ;
   private long[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P09752_A396EmprCod ;
   private String[] P09752_A719PrdNum ;
   private String[] P09752_A3345TipMovCc ;
   private long[] P09752_A3342CCStkLin ;
}

final  class ultimalineamovcc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09752", "SELECT * FROM (SELECT EmprCod, PrdNum, TipMovCc, CCStkLin FROM TXPCCSTKS WHERE (EmprCod = ? and PrdNum = ?) AND (TipMovCc <> 'SR') ORDER BY EmprCod, PrdNum, CCStkLin DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((long[]) buf[3])[0] = rslt.getLong(4);
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

