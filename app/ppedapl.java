package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppedapl extends GXProcedure
{
   public ppedapl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppedapl.class ), "" );
   }

   public ppedapl( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             String[] aP6 )
   {
      ppedapl.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        int[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 )
   {
      ppedapl.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppedapl.this.AV12PArtId = aP1[0];
      this.aP1 = aP1;
      ppedapl.this.AV11PACBarCod = aP2[0];
      this.aP2 = aP2;
      ppedapl.this.AV13PACBarReo = aP3[0];
      this.aP3 = aP3;
      ppedapl.this.AV14PACBarPar = aP4[0];
      this.aP4 = aP4;
      ppedapl.this.AV10PACAlbRec = aP5[0];
      this.aP5 = aP5;
      ppedapl.this.AV15PACAlbPie = aP6[0];
      this.aP6 = aP6;
      ppedapl.this.AV16PACLoc = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04M62 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV10PACAlbRec), AV15PACAlbPie});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2159AlbRecPie = P04M62_A2159AlbRecPie[0] ;
         A44AlbRecCod = P04M62_A44AlbRecCod[0] ;
         A50AlbRLoc = P04M62_A50AlbRLoc[0] ;
         A50AlbRLoc = P04M62_A50AlbRLoc[0] ;
         AV16PACLoc = A50AlbRLoc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppedapl.this.A396EmprCod;
      this.aP1[0] = ppedapl.this.AV12PArtId;
      this.aP2[0] = ppedapl.this.AV11PACBarCod;
      this.aP3[0] = ppedapl.this.AV13PACBarReo;
      this.aP4[0] = ppedapl.this.AV14PACBarPar;
      this.aP5[0] = ppedapl.this.AV10PACAlbRec;
      this.aP6[0] = ppedapl.this.AV15PACAlbPie;
      this.aP7[0] = ppedapl.this.AV16PACLoc;
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
      P04M62_A396EmprCod = new String[] {""} ;
      P04M62_A2159AlbRecPie = new String[] {""} ;
      P04M62_A44AlbRecCod = new int[1] ;
      P04M62_A50AlbRLoc = new String[] {""} ;
      A2159AlbRecPie = "" ;
      A50AlbRLoc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppedapl__default(),
         new Object[] {
             new Object[] {
            P04M62_A396EmprCod, P04M62_A2159AlbRecPie, P04M62_A44AlbRecCod, P04M62_A50AlbRLoc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13PACBarReo ;
   private short Gx_err ;
   private int AV12PArtId ;
   private int AV11PACBarCod ;
   private int AV10PACAlbRec ;
   private int A44AlbRecCod ;
   private String A396EmprCod ;
   private String AV14PACBarPar ;
   private String AV15PACAlbPie ;
   private String AV16PACLoc ;
   private String scmdbuf ;
   private String A2159AlbRecPie ;
   private String A50AlbRLoc ;
   private String[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private int[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P04M62_A396EmprCod ;
   private String[] P04M62_A2159AlbRecPie ;
   private int[] P04M62_A44AlbRecCod ;
   private String[] P04M62_A50AlbRLoc ;
}

final  class ppedapl__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04M62", "SELECT T1.EmprCod, T1.AlbRecPie, T1.AlbRecCod, T2.AlbRLoc FROM (TXPALBDET T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? and T1.AlbRecPie = ? ORDER BY T1.EmprCod, T1.AlbRecCod, T1.AlbRecPie ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 9);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
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
               stmt.setString(3, (String)parms[2], 9);
               return;
      }
   }

}

