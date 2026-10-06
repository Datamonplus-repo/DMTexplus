package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class busconumerocolor extends GXProcedure
{
   public busconumerocolor( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( busconumerocolor.class ), "" );
   }

   public busconumerocolor( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          String[] aP1 )
   {
      busconumerocolor.this.aP2 = new int[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 )
   {
      busconumerocolor.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      busconumerocolor.this.A313ContCod = aP1[0];
      this.aP1 = aP1;
      busconumerocolor.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P09S12 */
      pr_default.execute(0, new Object[] {A396EmprCod, A313ContCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A316ContVal = P09S12_A316ContVal[0] ;
         AV8Contador = (int)(A316ContVal+1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = busconumerocolor.this.A396EmprCod;
      this.aP1[0] = busconumerocolor.this.A313ContCod;
      this.aP2[0] = busconumerocolor.this.AV8Contador;
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
      P09S12_A396EmprCod = new String[] {""} ;
      P09S12_A313ContCod = new String[] {""} ;
      P09S12_A316ContVal = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.busconumerocolor__default(),
         new Object[] {
             new Object[] {
            P09S12_A396EmprCod, P09S12_A313ContCod, P09S12_A316ContVal
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV8Contador ;
   private int A316ContVal ;
   private String A396EmprCod ;
   private String A313ContCod ;
   private String scmdbuf ;
   private int[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P09S12_A396EmprCod ;
   private String[] P09S12_A313ContCod ;
   private int[] P09S12_A316ContVal ;
}

final  class busconumerocolor__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09S12", "SELECT EmprCod, ContCod, ContVal FROM TXPEMPLIN WHERE EmprCod = ? and ContCod = ? ORDER BY EmprCod, ContCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
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

