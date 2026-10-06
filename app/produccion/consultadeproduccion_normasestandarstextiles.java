package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class consultadeproduccion_normasestandarstextiles extends GXProcedure
{
   public consultadeproduccion_normasestandarstextiles( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultadeproduccion_normasestandarstextiles.class ), "" );
   }

   public consultadeproduccion_normasestandarstextiles( int remoteHandle ,
                                                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 )
   {
      consultadeproduccion_normasestandarstextiles.this.aP2 = new String[] {""};
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
      consultadeproduccion_normasestandarstextiles.this.A396EmprCod = aP0;
      consultadeproduccion_normasestandarstextiles.this.A361DisCod = aP1;
      consultadeproduccion_normasestandarstextiles.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8BarNormas = "" ;
      /* Using cursor P09DX2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13216DisNormDsc = P09DX2_A13216DisNormDsc[0] ;
         n13216DisNormDsc = P09DX2_n13216DisNormDsc[0] ;
         A13213DisNormID = P09DX2_A13213DisNormID[0] ;
         A13216DisNormDsc = P09DX2_A13216DisNormDsc[0] ;
         n13216DisNormDsc = P09DX2_n13216DisNormDsc[0] ;
         if ( (GXutil.strcmp("", AV8BarNormas)==0) )
         {
            AV8BarNormas = GXutil.trim( A13216DisNormDsc) ;
         }
         else
         {
            AV8BarNormas += "/" + GXutil.trim( A13213DisNormID) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = consultadeproduccion_normasestandarstextiles.this.AV8BarNormas;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8BarNormas = "" ;
      scmdbuf = "" ;
      P09DX2_A396EmprCod = new String[] {""} ;
      P09DX2_A361DisCod = new int[1] ;
      P09DX2_A13216DisNormDsc = new String[] {""} ;
      P09DX2_n13216DisNormDsc = new boolean[] {false} ;
      P09DX2_A13213DisNormID = new String[] {""} ;
      A13216DisNormDsc = "" ;
      A13213DisNormID = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.consultadeproduccion_normasestandarstextiles__default(),
         new Object[] {
             new Object[] {
            P09DX2_A396EmprCod, P09DX2_A361DisCod, P09DX2_A13216DisNormDsc, P09DX2_n13216DisNormDsc, P09DX2_A13213DisNormID
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A361DisCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A13216DisNormDsc ;
   private String A13213DisNormID ;
   private boolean n13216DisNormDsc ;
   private String AV8BarNormas ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P09DX2_A396EmprCod ;
   private int[] P09DX2_A361DisCod ;
   private String[] P09DX2_A13216DisNormDsc ;
   private boolean[] P09DX2_n13216DisNormDsc ;
   private String[] P09DX2_A13213DisNormID ;
}

final  class consultadeproduccion_normasestandarstextiles__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09DX2", "SELECT T1.EmprCod, T1.DisCod, T2.NormaDsc AS DisNormDsc, T1.DisNormID AS DisNormID FROM (TXPDISNOR T1 INNER JOIN TXPNORMAS T2 ON T2.EmprCod = T1.EmprCod AND T2.NormaID = T1.DisNormID) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.DisNormID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 4);
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

