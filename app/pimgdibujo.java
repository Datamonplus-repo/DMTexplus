package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pimgdibujo extends GXProcedure
{
   public pimgdibujo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pimgdibujo.class ), "" );
   }

   public pimgdibujo( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      pimgdibujo.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pimgdibujo.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pimgdibujo.this.A1014DibInt = aP1[0];
      this.aP1 = aP1;
      pimgdibujo.this.AV9Dibbmp = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P05LC2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A1014DibInt)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7140DibBmp = P05LC2_A7140DibBmp[0] ;
         n7140DibBmp = P05LC2_n7140DibBmp[0] ;
         A1013DibCli = P05LC2_A1013DibCli[0] ;
         A252CliCod = P05LC2_A252CliCod[0] ;
         AV9Dibbmp = A7140DibBmp ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pimgdibujo.this.A396EmprCod;
      this.aP1[0] = pimgdibujo.this.A1014DibInt;
      this.aP2[0] = pimgdibujo.this.AV9Dibbmp;
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
      P05LC2_A396EmprCod = new String[] {""} ;
      P05LC2_A1014DibInt = new int[1] ;
      P05LC2_A7140DibBmp = new String[] {""} ;
      P05LC2_n7140DibBmp = new boolean[] {false} ;
      P05LC2_A1013DibCli = new String[] {""} ;
      P05LC2_A252CliCod = new int[1] ;
      A7140DibBmp = "" ;
      A1013DibCli = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pimgdibujo__default(),
         new Object[] {
             new Object[] {
            P05LC2_A396EmprCod, P05LC2_A1014DibInt, P05LC2_A7140DibBmp, P05LC2_n7140DibBmp, P05LC2_A1013DibCli, P05LC2_A252CliCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A1014DibInt ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String AV9Dibbmp ;
   private String scmdbuf ;
   private String A7140DibBmp ;
   private String A1013DibCli ;
   private boolean n7140DibBmp ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P05LC2_A396EmprCod ;
   private int[] P05LC2_A1014DibInt ;
   private String[] P05LC2_A7140DibBmp ;
   private boolean[] P05LC2_n7140DibBmp ;
   private String[] P05LC2_A1013DibCli ;
   private int[] P05LC2_A252CliCod ;
}

final  class pimgdibujo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05LC2", "SELECT * FROM (SELECT EmprCod, DibInt, DibBmp, DibCli, CliCod FROM TXPCDIBUJ WHERE (EmprCod = ? and DibInt = ?) AND (DibBmp <> ' ') ORDER BY EmprCod, DibInt) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 128);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((int[]) buf[5])[0] = rslt.getInt(5);
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
               return;
      }
   }

}

