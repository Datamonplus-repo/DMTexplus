package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppiecalact extends GXProcedure
{
   public ppiecalact( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppiecalact.class ), "" );
   }

   public ppiecalact( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      ppiecalact.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      ppiecalact.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppiecalact.this.A44AlbRecCod = aP1[0];
      this.aP1 = aP1;
      ppiecalact.this.A2159AlbRecPie = aP2[0];
      this.aP2 = aP2;
      ppiecalact.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8AlRPieCal = "" ;
      /* Using cursor P01CR2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4795AlRPieCal = P01CR2_A4795AlRPieCal[0] ;
         AV8AlRPieCal = A4795AlRPieCal ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppiecalact.this.A396EmprCod;
      this.aP1[0] = ppiecalact.this.A44AlbRecCod;
      this.aP2[0] = ppiecalact.this.A2159AlbRecPie;
      this.aP3[0] = ppiecalact.this.AV8AlRPieCal;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8AlRPieCal = "" ;
      scmdbuf = "" ;
      P01CR2_A396EmprCod = new String[] {""} ;
      P01CR2_A44AlbRecCod = new int[1] ;
      P01CR2_A2159AlbRecPie = new String[] {""} ;
      P01CR2_A4795AlRPieCal = new String[] {""} ;
      A4795AlRPieCal = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppiecalact__default(),
         new Object[] {
             new Object[] {
            P01CR2_A396EmprCod, P01CR2_A44AlbRecCod, P01CR2_A2159AlbRecPie, P01CR2_A4795AlRPieCal
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A44AlbRecCod ;
   private String A396EmprCod ;
   private String A2159AlbRecPie ;
   private String AV8AlRPieCal ;
   private String scmdbuf ;
   private String A4795AlRPieCal ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P01CR2_A396EmprCod ;
   private int[] P01CR2_A44AlbRecCod ;
   private String[] P01CR2_A2159AlbRecPie ;
   private String[] P01CR2_A4795AlRPieCal ;
}

final  class ppiecalact__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01CR2", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRecPie, AlRPieCal FROM TXPALBDET WHERE EmprCod = ? and AlbRecCod = ? and AlbRecPie = ? ORDER BY EmprCod, AlbRecCod, AlbRecPie) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
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
               stmt.setString(3, (String)parms[2], 9);
               return;
      }
   }

}

