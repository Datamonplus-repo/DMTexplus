package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class obtengomailcliente extends GXProcedure
{
   public obtengomailcliente( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( obtengomailcliente.class ), "" );
   }

   public obtengomailcliente( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      obtengomailcliente.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      obtengomailcliente.this.A396EmprCod = aP0;
      obtengomailcliente.this.A252CliCod = aP1;
      obtengomailcliente.this.aP2 = aP2;
      obtengomailcliente.this.aP3 = aP3;
      obtengomailcliente.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8CliMailGrE = "N" ;
      AV9CliMailPkE = "N" ;
      AV10CliMailGr = "" ;
      /* Using cursor P0AEY2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11622CliMailGrE = P0AEY2_A11622CliMailGrE[0] ;
         A11623CliMailPkE = P0AEY2_A11623CliMailPkE[0] ;
         A11620CliMailGr = P0AEY2_A11620CliMailGr[0] ;
         AV8CliMailGrE = A11622CliMailGrE ;
         AV9CliMailPkE = A11623CliMailPkE ;
         AV10CliMailGr = A11620CliMailGr ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = obtengomailcliente.this.AV8CliMailGrE;
      this.aP3[0] = obtengomailcliente.this.AV9CliMailPkE;
      this.aP4[0] = obtengomailcliente.this.AV10CliMailGr;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8CliMailGrE = "" ;
      AV9CliMailPkE = "" ;
      AV10CliMailGr = "" ;
      scmdbuf = "" ;
      P0AEY2_A396EmprCod = new String[] {""} ;
      P0AEY2_A252CliCod = new int[1] ;
      P0AEY2_A11622CliMailGrE = new String[] {""} ;
      P0AEY2_A11623CliMailPkE = new String[] {""} ;
      P0AEY2_A11620CliMailGr = new String[] {""} ;
      A11622CliMailGrE = "" ;
      A11623CliMailPkE = "" ;
      A11620CliMailGr = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.obtengomailcliente__default(),
         new Object[] {
             new Object[] {
            P0AEY2_A396EmprCod, P0AEY2_A252CliCod, P0AEY2_A11622CliMailGrE, P0AEY2_A11623CliMailPkE, P0AEY2_A11620CliMailGr
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String AV8CliMailGrE ;
   private String AV9CliMailPkE ;
   private String AV10CliMailGr ;
   private String scmdbuf ;
   private String A11622CliMailGrE ;
   private String A11623CliMailPkE ;
   private String A11620CliMailGr ;
   private String[] aP4 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AEY2_A396EmprCod ;
   private int[] P0AEY2_A252CliCod ;
   private String[] P0AEY2_A11622CliMailGrE ;
   private String[] P0AEY2_A11623CliMailPkE ;
   private String[] P0AEY2_A11620CliMailGr ;
}

final  class obtengomailcliente__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AEY2", "SELECT EmprCod, CliCod, CliMailGrE, CliMailPkE, CliMailGr FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 100);
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

