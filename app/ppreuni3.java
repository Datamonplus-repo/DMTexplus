package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppreuni3 extends GXProcedure
{
   public ppreuni3( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppreuni3.class ), "" );
   }

   public ppreuni3( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      ppreuni3.this.aP1 = new int[] {0};
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
      ppreuni3.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppreuni3.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV13SinCrudo ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SCRUDO", ""), GXv_int2) ;
      ppreuni3.this.GXt_int1 = GXv_int2[0] ;
      AV13SinCrudo = GXt_int1 ;
      GXt_int1 = AV14Erfoc ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ERFOC", ""), GXv_int2) ;
      ppreuni3.this.GXt_int1 = GXv_int2[0] ;
      AV14Erfoc = GXt_int1 ;
      if ( ( AV13SinCrudo == 1 ) || ( AV14Erfoc == 1 ) )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Using cursor P02D52 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5252DisAcc = P02D52_A5252DisAcc[0] ;
         AV10DisAcc = A5252DisAcc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Optimized UPDATE. */
      /* Using cursor P02D53 */
      pr_default.execute(1, new Object[] {AV10DisAcc, A396EmprCod, Integer.valueOf(A361DisCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppreuni3.this.A396EmprCod;
      this.aP1[0] = ppreuni3.this.A361DisCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "ppreuni3");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P02D52_A396EmprCod = new String[] {""} ;
      P02D52_A361DisCod = new int[1] ;
      P02D52_A5252DisAcc = new String[] {""} ;
      A5252DisAcc = "" ;
      AV10DisAcc = "" ;
      A5253BarAcc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppreuni3__default(),
         new Object[] {
             new Object[] {
            P02D52_A396EmprCod, P02D52_A361DisCod, P02D52_A5252DisAcc
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13SinCrudo ;
   private byte AV14Erfoc ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private short Gx_err ;
   private int A361DisCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A5252DisAcc ;
   private String AV10DisAcc ;
   private String A5253BarAcc ;
   private boolean returnInSub ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P02D52_A396EmprCod ;
   private int[] P02D52_A361DisCod ;
   private String[] P02D52_A5252DisAcc ;
}

final  class ppreuni3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02D52", "SELECT EmprCod, DisCod, DisAcc FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02D53", "UPDATE TXPBARCAD SET BarAcc=?  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
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
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

