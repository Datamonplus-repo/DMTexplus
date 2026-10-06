package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmodesd extends GXProcedure
{
   public pmodesd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmodesd.class ), "" );
   }

   public pmodesd( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pmodesd.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      pmodesd.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmodesd.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV16EmprNom ;
      GXv_char3[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV15Station, GXv_char1, GXv_char2, GXv_char3) ;
      pmodesd.this.A396EmprCod = GXv_char1[0] ;
      pmodesd.this.AV16EmprNom = GXv_char2[0] ;
      pmodesd.this.AV17UsurCod = GXv_char3[0] ;
      /* Using cursor P00A42 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A367DisEst = P00A42_A367DisEst[0] ;
         if ( A367DisEst == 0 )
         {
            AV18Inc_obs = httpContext.getMessage( "N Disp= ", "") + GXutil.str( A361DisCod, 8, 0) + httpContext.getMessage( " Cambio Estado ", "") + GXutil.str( A367DisEst, 1, 0) + " -> " + "1" ;
            A367DisEst = (byte)(1) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV22Pgmname, AV17UsurCod, AV15Station, AV18Inc_obs, A361DisCod, (byte)(0), " ") ;
         }
         /* Using cursor P00A43 */
         pr_default.execute(1, new Object[] {Byte.valueOf(A367DisEst), A396EmprCod, Integer.valueOf(A361DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmodesd.this.A396EmprCod;
      this.aP1[0] = pmodesd.this.A361DisCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmodesd");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV15Station = "" ;
      GXv_char1 = new String[1] ;
      AV16EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV17UsurCod = "" ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P00A42_A396EmprCod = new String[] {""} ;
      P00A42_A361DisCod = new int[1] ;
      P00A42_A367DisEst = new byte[1] ;
      AV18Inc_obs = "" ;
      AV22Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmodesd__default(),
         new Object[] {
             new Object[] {
            P00A42_A396EmprCod, P00A42_A361DisCod, P00A42_A367DisEst
            }
            , new Object[] {
            }
         }
      );
      AV22Pgmname = "PMODESD" ;
      /* GeneXus formulas. */
      AV22Pgmname = "PMODESD" ;
      Gx_err = (short)(0) ;
   }

   private byte A367DisEst ;
   private short Gx_err ;
   private int A361DisCod ;
   private String A396EmprCod ;
   private String AV15Station ;
   private String GXv_char1[] ;
   private String AV16EmprNom ;
   private String GXv_char2[] ;
   private String AV17UsurCod ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String AV22Pgmname ;
   private String AV18Inc_obs ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P00A42_A396EmprCod ;
   private int[] P00A42_A361DisCod ;
   private byte[] P00A42_A367DisEst ;
}

final  class pmodesd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00A42", "SELECT EmprCod, DisCod, DisEst FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00A43", "UPDATE TXPDISPOS SET DisEst=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
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
            case 1 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

