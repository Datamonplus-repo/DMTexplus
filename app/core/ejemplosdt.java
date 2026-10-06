package app.core ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ejemplosdt extends GXProcedure
{
   public ejemplosdt( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ejemplosdt.class ), "" );
   }

   public ejemplosdt( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXSimpleCollection<String> executeUdp( )
   {
      ejemplosdt.this.aP0 = new GXSimpleCollection[] {new GXSimpleCollection<String>(String.class, "internal", "")};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( GXSimpleCollection<String>[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( GXSimpleCollection<String>[] aP0 )
   {
      ejemplosdt.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P084S2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A602MaqCod = P084S2_A602MaqCod[0] ;
         A396EmprCod = P084S2_A396EmprCod[0] ;
         AV9Maquinas.add(A602MaqCod, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ejemplosdt.this.AV9Maquinas;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9Maquinas = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      P084S2_A602MaqCod = new String[] {""} ;
      P084S2_A396EmprCod = new String[] {""} ;
      A602MaqCod = "" ;
      A396EmprCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.core.ejemplosdt__default(),
         new Object[] {
             new Object[] {
            P084S2_A602MaqCod, P084S2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A396EmprCod ;
   private GXSimpleCollection<String>[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P084S2_A602MaqCod ;
   private String[] P084S2_A396EmprCod ;
   private GXSimpleCollection<String> AV9Maquinas ;
}

final  class ejemplosdt__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P084S2", "SELECT MaqCod, EmprCod FROM TXPMAQUIN ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

