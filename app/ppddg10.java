package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppddg10 extends GXProcedure
{
   public ppddg10( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppddg10.class ), "" );
   }

   public ppddg10( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      ppddg10.this.aP2 = new String[] {""};
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
      ppddg10.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppddg10.this.A13026PedDGId = aP1[0];
      this.aP1 = aP1;
      ppddg10.this.A758ProCod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8PROFORCOD = " " ;
      /* Using cursor P05P82 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A13026PedDGId), A758ProCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A764ProForCod = P05P82_A764ProForCod[0] ;
         n764ProForCod = P05P82_n764ProForCod[0] ;
         A13057PedDGPQLin = P05P82_A13057PedDGPQLin[0] ;
         A13045PedDGFasLi = P05P82_A13045PedDGFasLi[0] ;
         AV8PROFORCOD = A764ProForCod ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppddg10.this.A396EmprCod;
      this.aP1[0] = ppddg10.this.A13026PedDGId;
      this.aP2[0] = ppddg10.this.A758ProCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8PROFORCOD = "" ;
      scmdbuf = "" ;
      P05P82_A396EmprCod = new String[] {""} ;
      P05P82_A13026PedDGId = new int[1] ;
      P05P82_A758ProCod = new String[] {""} ;
      P05P82_A764ProForCod = new String[] {""} ;
      P05P82_n764ProForCod = new boolean[] {false} ;
      P05P82_A13057PedDGPQLin = new short[1] ;
      P05P82_A13045PedDGFasLi = new short[1] ;
      A764ProForCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppddg10__default(),
         new Object[] {
             new Object[] {
            P05P82_A396EmprCod, P05P82_A13026PedDGId, P05P82_A758ProCod, P05P82_A764ProForCod, P05P82_n764ProForCod, P05P82_A13057PedDGPQLin, P05P82_A13045PedDGFasLi
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A13057PedDGPQLin ;
   private short A13045PedDGFasLi ;
   private short Gx_err ;
   private int A13026PedDGId ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String AV8PROFORCOD ;
   private String scmdbuf ;
   private String A764ProForCod ;
   private boolean n764ProForCod ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P05P82_A396EmprCod ;
   private int[] P05P82_A13026PedDGId ;
   private String[] P05P82_A758ProCod ;
   private String[] P05P82_A764ProForCod ;
   private boolean[] P05P82_n764ProForCod ;
   private short[] P05P82_A13057PedDGPQLin ;
   private short[] P05P82_A13045PedDGFasLi ;
}

final  class ppddg10__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05P82", "SELECT EmprCod, PedDGId, ProCod, ProForCod, PedDGPQLin, PedDGFasLi FROM TXPPEDDG7 WHERE EmprCod = ? and PedDGId = ? and ProCod = ? ORDER BY EmprCod, PedDGId, ProCod, PedDGFasLi, PedDGPQLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((short[]) buf[6])[0] = rslt.getShort(6);
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
               return;
      }
   }

}

