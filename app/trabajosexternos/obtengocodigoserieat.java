package app.trabajosexternos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class obtengocodigoserieat extends GXProcedure
{
   public obtengocodigoserieat( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( obtengocodigoserieat.class ), "" );
   }

   public obtengocodigoserieat( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 )
   {
      obtengocodigoserieat.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String[] aP2 )
   {
      obtengocodigoserieat.this.A396EmprCod = aP0;
      obtengocodigoserieat.this.A313ContCod = aP1;
      obtengocodigoserieat.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8ContIDSerNew = "" ;
      /* Using cursor P0AI82 */
      pr_default.execute(0, new Object[] {A396EmprCod, A313ContCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14181ContIDSerN = P0AI82_A14181ContIDSerN[0] ;
         n14181ContIDSerN = P0AI82_n14181ContIDSerN[0] ;
         AV8ContIDSerNew = A14181ContIDSerN ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = obtengocodigoserieat.this.AV8ContIDSerNew;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8ContIDSerNew = "" ;
      scmdbuf = "" ;
      P0AI82_A396EmprCod = new String[] {""} ;
      P0AI82_A313ContCod = new String[] {""} ;
      P0AI82_A14181ContIDSerN = new String[] {""} ;
      P0AI82_n14181ContIDSerN = new boolean[] {false} ;
      A14181ContIDSerN = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.obtengocodigoserieat__default(),
         new Object[] {
             new Object[] {
            P0AI82_A396EmprCod, P0AI82_A313ContCod, P0AI82_A14181ContIDSerN, P0AI82_n14181ContIDSerN
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String A396EmprCod ;
   private String A313ContCod ;
   private String AV8ContIDSerNew ;
   private String scmdbuf ;
   private String A14181ContIDSerN ;
   private boolean n14181ContIDSerN ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AI82_A396EmprCod ;
   private String[] P0AI82_A313ContCod ;
   private String[] P0AI82_A14181ContIDSerN ;
   private boolean[] P0AI82_n14181ContIDSerN ;
}

final  class obtengocodigoserieat__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AI82", "SELECT EmprCod, ContCod, ContIDSerN FROM TXPEMPLIN WHERE EmprCod = ? and ContCod = ? ORDER BY EmprCod, ContCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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

