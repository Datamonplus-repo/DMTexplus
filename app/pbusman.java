package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusman extends GXProcedure
{
   public pbusman( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusman.class ), "" );
   }

   public pbusman( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             short[] aP1 )
   {
      pbusman.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             String[] aP2 )
   {
      pbusman.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbusman.this.A2248ManCod = aP1[0];
      this.aP1 = aP1;
      pbusman.this.AV15BarManNom = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18GXLvl1 = (byte)(0) ;
      /* Using cursor P00EL2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2249ManNom = P00EL2_A2249ManNom[0] ;
         n2249ManNom = P00EL2_n2249ManNom[0] ;
         AV18GXLvl1 = (byte)(1) ;
         AV15BarManNom = A2249ManNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV18GXLvl1 == 0 )
      {
         AV15BarManNom = httpContext.getMessage( "Inexistente", "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbusman.this.A396EmprCod;
      this.aP1[0] = pbusman.this.A2248ManCod;
      this.aP2[0] = pbusman.this.AV15BarManNom;
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
      P00EL2_A396EmprCod = new String[] {""} ;
      P00EL2_A2248ManCod = new short[1] ;
      P00EL2_A2249ManNom = new String[] {""} ;
      P00EL2_n2249ManNom = new boolean[] {false} ;
      A2249ManNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusman__default(),
         new Object[] {
             new Object[] {
            P00EL2_A396EmprCod, P00EL2_A2248ManCod, P00EL2_A2249ManNom, P00EL2_n2249ManNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18GXLvl1 ;
   private short A2248ManCod ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV15BarManNom ;
   private String scmdbuf ;
   private String A2249ManNom ;
   private boolean n2249ManNom ;
   private String[] aP2 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P00EL2_A396EmprCod ;
   private short[] P00EL2_A2248ManCod ;
   private String[] P00EL2_A2249ManNom ;
   private boolean[] P00EL2_n2249ManNom ;
}

final  class pbusman__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00EL2", "SELECT EmprCod, ManCod, ManNom FROM TXPMANUFA WHERE EmprCod = ? and ManCod = ? ORDER BY EmprCod, ManCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

