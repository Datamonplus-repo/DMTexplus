package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprdlav extends GXProcedure
{
   public pprdlav( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprdlav.class ), "" );
   }

   public pprdlav( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      pprdlav.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      pprdlav.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprdlav.this.A313ContCod = aP1[0];
      this.aP1 = aP1;
      pprdlav.this.AV17ContValA = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01BN2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A313ContCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A316ContVal = P01BN2_A316ContVal[0] ;
         A316ContVal = (int)(A316ContVal+1) ;
         AV15ContVal = A316ContVal ;
         AV16Ceros8 = "00000000" ;
         AV17ContValA = GXutil.str( AV15ContVal, 8, 0) ;
         AV17ContValA = GXutil.ltrim( GXutil.rtrim( AV17ContValA)) ;
         AV18LenVar = (byte)(GXutil.len( AV17ContValA)) ;
         AV18LenVar = (byte)(8-AV18LenVar) ;
         AV17ContValA = GXutil.substring( AV16Ceros8, 1, AV18LenVar) + AV17ContValA ;
         /* Using cursor P01BN3 */
         pr_default.execute(1, new Object[] {Integer.valueOf(A316ContVal), A396EmprCod, A313ContCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPLIN");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprdlav.this.A396EmprCod;
      this.aP1[0] = pprdlav.this.A313ContCod;
      this.aP2[0] = pprdlav.this.AV17ContValA;
      Application.commitDataStores(context, remoteHandle, pr_default, "pprdlav");
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
      P01BN2_A396EmprCod = new String[] {""} ;
      P01BN2_A313ContCod = new String[] {""} ;
      P01BN2_A316ContVal = new int[1] ;
      AV16Ceros8 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprdlav__default(),
         new Object[] {
             new Object[] {
            P01BN2_A396EmprCod, P01BN2_A313ContCod, P01BN2_A316ContVal
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18LenVar ;
   private short Gx_err ;
   private int A316ContVal ;
   private int AV15ContVal ;
   private String A396EmprCod ;
   private String A313ContCod ;
   private String AV17ContValA ;
   private String scmdbuf ;
   private String AV16Ceros8 ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P01BN2_A396EmprCod ;
   private String[] P01BN2_A313ContCod ;
   private int[] P01BN2_A316ContVal ;
}

final  class pprdlav__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01BN2", "SELECT EmprCod, ContCod, ContVal FROM TXPEMPLIN WHERE EmprCod = ? and ContCod = ? ORDER BY EmprCod, ContCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01BN3", "UPDATE TXPEMPLIN SET ContVal=?  WHERE EmprCod = ? AND ContCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPEMPLIN")
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

