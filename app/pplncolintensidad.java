package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pplncolintensidad extends GXProcedure
{
   public pplncolintensidad( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pplncolintensidad.class ), "" );
   }

   public pplncolintensidad( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             byte[] aP1 ,
                             byte[] aP2 )
   {
      pplncolintensidad.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        byte[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             byte[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pplncolintensidad.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pplncolintensidad.this.A583IntCod = aP1[0];
      this.aP1 = aP1;
      pplncolintensidad.this.AV8PLNColor = aP2[0];
      this.aP2 = aP2;
      pplncolintensidad.this.AV9PLNColorDsc = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8PLNColor = (byte)(0) ;
      AV9PLNColorDsc = " " ;
      /* Using cursor P05SY2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Byte.valueOf(A583IntCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13183PLNColor = P05SY2_A13183PLNColor[0] ;
         A13186PLNColorDs = P05SY2_A13186PLNColorDs[0] ;
         n13186PLNColorDs = P05SY2_n13186PLNColorDs[0] ;
         A13186PLNColorDs = P05SY2_A13186PLNColorDs[0] ;
         n13186PLNColorDs = P05SY2_n13186PLNColorDs[0] ;
         AV8PLNColor = A13183PLNColor ;
         AV9PLNColorDsc = A13186PLNColorDs ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pplncolintensidad.this.A396EmprCod;
      this.aP1[0] = pplncolintensidad.this.A583IntCod;
      this.aP2[0] = pplncolintensidad.this.AV8PLNColor;
      this.aP3[0] = pplncolintensidad.this.AV9PLNColorDsc;
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
      P05SY2_A396EmprCod = new String[] {""} ;
      P05SY2_A583IntCod = new byte[1] ;
      P05SY2_A13183PLNColor = new byte[1] ;
      P05SY2_A13186PLNColorDs = new String[] {""} ;
      P05SY2_n13186PLNColorDs = new boolean[] {false} ;
      A13186PLNColorDs = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pplncolintensidad__default(),
         new Object[] {
             new Object[] {
            P05SY2_A396EmprCod, P05SY2_A583IntCod, P05SY2_A13183PLNColor, P05SY2_A13186PLNColorDs, P05SY2_n13186PLNColorDs
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A583IntCod ;
   private byte AV8PLNColor ;
   private byte A13183PLNColor ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV9PLNColorDsc ;
   private String scmdbuf ;
   private String A13186PLNColorDs ;
   private boolean n13186PLNColorDs ;
   private String[] aP3 ;
   private String[] aP0 ;
   private byte[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P05SY2_A396EmprCod ;
   private byte[] P05SY2_A583IntCod ;
   private byte[] P05SY2_A13183PLNColor ;
   private String[] P05SY2_A13186PLNColorDs ;
   private boolean[] P05SY2_n13186PLNColorDs ;
}

final  class pplncolintensidad__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05SY2", "SELECT T1.EmprCod, T1.IntCod, T1.PLNColor, T2.PLNColorDs FROM (TXPPLNCoI T1 INNER JOIN TXPPLNCol T2 ON T2.EmprCod = T1.EmprCod AND T2.PLNColor = T1.PLNColor) WHERE T1.EmprCod = ? and T1.IntCod = ? ORDER BY T1.EmprCod, T1.IntCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
      }
   }

}

