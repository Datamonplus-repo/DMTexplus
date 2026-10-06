package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexidsc extends GXProcedure
{
   public pexidsc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexidsc.class ), "" );
   }

   public pexidsc( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 )
   {
      pexidsc.this.aP2 = new String[] {""};
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
      pexidsc.this.A396EmprCod = aP0;
      pexidsc.this.A313ContCod = aP1;
      pexidsc.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16ContDsc = " " ;
      /* Using cursor P00UO2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A313ContCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A314ContDsc = P00UO2_A314ContDsc[0] ;
         AV16ContDsc = A314ContDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = pexidsc.this.AV16ContDsc;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16ContDsc = "" ;
      scmdbuf = "" ;
      P00UO2_A396EmprCod = new String[] {""} ;
      P00UO2_A313ContCod = new String[] {""} ;
      P00UO2_A314ContDsc = new String[] {""} ;
      A314ContDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pexidsc__default(),
         new Object[] {
             new Object[] {
            P00UO2_A396EmprCod, P00UO2_A313ContCod, P00UO2_A314ContDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String A396EmprCod ;
   private String A313ContCod ;
   private String AV16ContDsc ;
   private String scmdbuf ;
   private String A314ContDsc ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P00UO2_A396EmprCod ;
   private String[] P00UO2_A313ContCod ;
   private String[] P00UO2_A314ContDsc ;
}

final  class pexidsc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00UO2", "SELECT EmprCod, ContCod, ContDsc FROM TXPEMPLIN WHERE EmprCod = ? and ContCod = ? ORDER BY EmprCod, ContCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

