package app.pedidos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class entradacomorc extends GXProcedure
{
   public entradacomorc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( entradacomorc.class ), "" );
   }

   public entradacomorc( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 )
   {
      entradacomorc.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String[] aP2 )
   {
      entradacomorc.this.A396EmprCod = aP0;
      entradacomorc.this.A361DisCod = aP1;
      entradacomorc.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Rc = "N" ;
      /* Using cursor P09XQ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A55AlbRReo = P09XQ2_A55AlbRReo[0] ;
         A44AlbRecCod = P09XQ2_A44AlbRecCod[0] ;
         A55AlbRReo = P09XQ2_A55AlbRReo[0] ;
         AV8Rc = ((GXutil.strcmp(A55AlbRReo, "SI")==0) ? "S" : "N") ;
         if ( GXutil.strcmp(AV8Rc, "S") == 0 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = entradacomorc.this.AV8Rc;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Rc = "" ;
      scmdbuf = "" ;
      P09XQ2_A396EmprCod = new String[] {""} ;
      P09XQ2_A361DisCod = new int[1] ;
      P09XQ2_A55AlbRReo = new String[] {""} ;
      P09XQ2_A44AlbRecCod = new int[1] ;
      A55AlbRReo = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.entradacomorc__default(),
         new Object[] {
             new Object[] {
            P09XQ2_A396EmprCod, P09XQ2_A361DisCod, P09XQ2_A55AlbRReo, P09XQ2_A44AlbRecCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A361DisCod ;
   private int A44AlbRecCod ;
   private String A396EmprCod ;
   private String AV8Rc ;
   private String scmdbuf ;
   private String A55AlbRReo ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P09XQ2_A396EmprCod ;
   private int[] P09XQ2_A361DisCod ;
   private String[] P09XQ2_A55AlbRReo ;
   private int[] P09XQ2_A44AlbRecCod ;
}

final  class entradacomorc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09XQ2", "SELECT T1.EmprCod, T1.DisCod, T2.AlbRReo, T1.AlbRecCod FROM (TXPDISALB T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
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

