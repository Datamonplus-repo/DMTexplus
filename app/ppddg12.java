package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppddg12 extends GXProcedure
{
   public ppddg12( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppddg12.class ), "" );
   }

   public ppddg12( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             short aP3 ,
                             short aP4 )
   {
      ppddg12.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        short aP3 ,
                        short aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             short aP3 ,
                             short aP4 ,
                             String[] aP5 )
   {
      ppddg12.this.A396EmprCod = aP0;
      ppddg12.this.A13026PedDGId = aP1;
      ppddg12.this.A758ProCod = aP2;
      ppddg12.this.A13045PedDGFasLi = aP3;
      ppddg12.this.A1664ParFasCod = aP4;
      ppddg12.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P05PA2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A13026PedDGId), A758ProCod, Short.valueOf(A13045PedDGFasLi), Short.valueOf(A1664ParFasCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13061PedDGParTx = P05PA2_A13061PedDGParTx[0] ;
         AV8Profasnot = A13061PedDGParTx ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = ppddg12.this.AV8Profasnot;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Profasnot = "" ;
      scmdbuf = "" ;
      P05PA2_A13061PedDGParTx = new String[] {""} ;
      P05PA2_A396EmprCod = new String[] {""} ;
      P05PA2_A13026PedDGId = new int[1] ;
      P05PA2_A758ProCod = new String[] {""} ;
      P05PA2_A13045PedDGFasLi = new short[1] ;
      P05PA2_A1664ParFasCod = new short[1] ;
      A13061PedDGParTx = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppddg12__default(),
         new Object[] {
             new Object[] {
            P05PA2_A13061PedDGParTx, P05PA2_A396EmprCod, P05PA2_A13026PedDGId, P05PA2_A758ProCod, P05PA2_A13045PedDGFasLi, P05PA2_A1664ParFasCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A13045PedDGFasLi ;
   private short A1664ParFasCod ;
   private short Gx_err ;
   private int A13026PedDGId ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String scmdbuf ;
   private String A13061PedDGParTx ;
   private String AV8Profasnot ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P05PA2_A13061PedDGParTx ;
   private String[] P05PA2_A396EmprCod ;
   private int[] P05PA2_A13026PedDGId ;
   private String[] P05PA2_A758ProCod ;
   private short[] P05PA2_A13045PedDGFasLi ;
   private short[] P05PA2_A1664ParFasCod ;
}

final  class ppddg12__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05PA2", "SELECT PedDGParTx, EmprCod, PedDGId, ProCod, PedDGFasLi, ParFasCod FROM TXPPEDDG8 WHERE EmprCod = ? and PedDGId = ? and ProCod = ? and PedDGFasLi = ? and ParFasCod = ? ORDER BY EmprCod, PedDGId, ProCod, PedDGFasLi, ParFasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
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
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

