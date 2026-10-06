package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnumsv extends GXProcedure
{
   public pnumsv( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnumsv.class ), "" );
   }

   public pnumsv( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          String[] aP1 ,
                          String[] aP2 )
   {
      pnumsv.this.aP3 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 )
   {
      pnumsv.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnumsv.this.AV9Contcod = aP1[0];
      this.aP1 = aP1;
      pnumsv.this.AV10ArtCod8 = aP2[0];
      this.aP2 = aP2;
      pnumsv.this.AV11Artacafor = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10ArtCod8 = " " ;
      /* Using cursor P049Z2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV9Contcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A313ContCod = P049Z2_A313ContCod[0] ;
         A316ContVal = P049Z2_A316ContVal[0] ;
         AV8ContVal = (int)(A316ContVal+1) ;
         A316ContVal = (int)(A316ContVal+1) ;
         /* Using cursor P049Z3 */
         pr_default.execute(1, new Object[] {Integer.valueOf(A316ContVal), A396EmprCod, A313ContCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPLIN");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV10ArtCod8 = GXutil.trim( GXutil.str( AV8ContVal, 8, 0)) ;
      AV11Artacafor = (int)(GXutil.lval( GXutil.substring( AV10ArtCod8, 1, 8))) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnumsv.this.A396EmprCod;
      this.aP1[0] = pnumsv.this.AV9Contcod;
      this.aP2[0] = pnumsv.this.AV10ArtCod8;
      this.aP3[0] = pnumsv.this.AV11Artacafor;
      Application.commitDataStores(context, remoteHandle, pr_default, "pnumsv");
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
      P049Z2_A396EmprCod = new String[] {""} ;
      P049Z2_A313ContCod = new String[] {""} ;
      P049Z2_A316ContVal = new int[1] ;
      A313ContCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnumsv__default(),
         new Object[] {
             new Object[] {
            P049Z2_A396EmprCod, P049Z2_A313ContCod, P049Z2_A316ContVal
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV11Artacafor ;
   private int A316ContVal ;
   private int AV8ContVal ;
   private String A396EmprCod ;
   private String AV9Contcod ;
   private String AV10ArtCod8 ;
   private String scmdbuf ;
   private String A313ContCod ;
   private int[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P049Z2_A396EmprCod ;
   private String[] P049Z2_A313ContCod ;
   private int[] P049Z2_A316ContVal ;
}

final  class pnumsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P049Z2", "SELECT EmprCod, ContCod, ContVal FROM TXPEMPLIN WHERE EmprCod = ? and ContCod = ? ORDER BY EmprCod, ContCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P049Z3", "UPDATE TXPEMPLIN SET ContVal=?  WHERE EmprCod = ? AND ContCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPEMPLIN")
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
            case 1 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

