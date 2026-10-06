package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pelidih extends GXProcedure
{
   public pelidih( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pelidih.class ), "" );
   }

   public pelidih( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pelidih.this.aP1 = new int[] {0};
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
      pelidih.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pelidih.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV20CliSKP ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CLISKP", ""), GXv_int2) ;
      pelidih.this.GXt_int1 = GXv_int2[0] ;
      AV20CliSKP = GXt_int1 ;
      if ( AV20CliSKP == 1 )
      {
         GXt_char3 = AV17Car6 ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char5[0] = httpContext.getMessage( "CLISKP", "") ;
         GXv_char6[0] = GXt_char3 ;
         new app.pbusdsc(remoteHandle, context).execute( GXv_char4, GXv_char5, GXv_char6) ;
         pelidih.this.A396EmprCod = GXv_char4[0] ;
         pelidih.this.GXt_char3 = GXv_char6[0] ;
         AV17Car6 = GXutil.trim( GXt_char3) ;
         AV19cliPropio = (int)(GXutil.lval( AV17Car6)) ;
      }
      /* Using cursor P006J2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P006J2_A252CliCod[0] ;
         A5252DisAcc = P006J2_A5252DisAcc[0] ;
         A966PartCod = P006J2_A966PartCod[0] ;
         n966PartCod = P006J2_n966PartCod[0] ;
         /* Using cursor P006J3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A758ProCod = P006J3_A758ProCod[0] ;
            A846UltFasLin = P006J3_A846UltFasLin[0] ;
            /* Optimized DELETE. */
            /* Using cursor P006J4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
            /* End optimized DELETE. */
            /* Using cursor P006J5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISLIN");
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Optimized DELETE. */
         /* Using cursor P006J6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSERV");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P006J7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISDEF");
         /* End optimized DELETE. */
         if ( AV20CliSKP == 0 )
         {
            AV18CliPar = A252CliCod ;
         }
         else
         {
            if ( GXutil.strcmp(A5252DisAcc, httpContext.getMessage( "P", "")) == 0 )
            {
               AV18CliPar = AV19cliPropio ;
            }
            else
            {
               AV18CliPar = A252CliCod ;
            }
         }
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A966PartCod ;
         GXv_int7[0] = AV18CliPar ;
         GXv_int8[0] = A361DisCod ;
         new app.pcampar(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_int7, GXv_int8) ;
         pelidih.this.A396EmprCod = GXv_char6[0] ;
         pelidih.this.A966PartCod = GXv_char5[0] ;
         pelidih.this.AV18CliPar = GXv_int7[0] ;
         pelidih.this.A361DisCod = GXv_int8[0] ;
         /* Using cursor P006J8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pelidih.this.A396EmprCod;
      this.aP1[0] = pelidih.this.A361DisCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pelidih");
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
      AV17Car6 = "" ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      scmdbuf = "" ;
      P006J2_A396EmprCod = new String[] {""} ;
      P006J2_A361DisCod = new int[1] ;
      P006J2_A252CliCod = new int[1] ;
      P006J2_A5252DisAcc = new String[] {""} ;
      P006J2_A966PartCod = new String[] {""} ;
      P006J2_n966PartCod = new boolean[] {false} ;
      A5252DisAcc = "" ;
      A966PartCod = "" ;
      P006J3_A396EmprCod = new String[] {""} ;
      P006J3_A361DisCod = new int[1] ;
      P006J3_A758ProCod = new String[] {""} ;
      P006J3_A846UltFasLin = new short[1] ;
      A758ProCod = "" ;
      GXv_char6 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int8 = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pelidih__default(),
         new Object[] {
             new Object[] {
            P006J2_A396EmprCod, P006J2_A361DisCod, P006J2_A252CliCod, P006J2_A5252DisAcc, P006J2_A966PartCod, P006J2_n966PartCod
            }
            , new Object[] {
            P006J3_A396EmprCod, P006J3_A361DisCod, P006J3_A758ProCod, P006J3_A846UltFasLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV20CliSKP ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private short A846UltFasLin ;
   private short Gx_err ;
   private int A361DisCod ;
   private int AV19cliPropio ;
   private int A252CliCod ;
   private int AV18CliPar ;
   private int GXv_int7[] ;
   private int GXv_int8[] ;
   private String A396EmprCod ;
   private String AV17Car6 ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A5252DisAcc ;
   private String A966PartCod ;
   private String A758ProCod ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private boolean n966PartCod ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P006J2_A396EmprCod ;
   private int[] P006J2_A361DisCod ;
   private int[] P006J2_A252CliCod ;
   private String[] P006J2_A5252DisAcc ;
   private String[] P006J2_A966PartCod ;
   private boolean[] P006J2_n966PartCod ;
   private String[] P006J3_A396EmprCod ;
   private int[] P006J3_A361DisCod ;
   private String[] P006J3_A758ProCod ;
   private short[] P006J3_A846UltFasLin ;
}

final  class pelidih__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P006J2", "SELECT EmprCod, DisCod, CliCod, DisAcc, PartCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P006J3", "SELECT EmprCod, DisCod, ProCod, UltFasLin FROM TXPDISLIN WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P006J4", "DELETE FROM TXPDISFAS  WHERE EmprCod = ? and DisCod = ? and ProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISFAS")
         ,new UpdateCursor("P006J5", "DELETE FROM TXPDISLIN  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISLIN")
         ,new UpdateCursor("P006J6", "DELETE FROM TXPOBSERV  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOBSERV")
         ,new UpdateCursor("P006J7", "DELETE FROM TXPDISDEF  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISDEF")
         ,new UpdateCursor("P006J8", "DELETE FROM TXPDISPOS  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

