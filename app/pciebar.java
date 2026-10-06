package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pciebar extends GXProcedure
{
   public pciebar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pciebar.class ), "" );
   }

   public pciebar( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pciebar.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pciebar.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pciebar.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pciebar.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pciebar.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pciebar.this.AV15Opcion = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV19FlagValoHr = (byte)(0) ;
      GXv_int1[0] = AV19FlagValoHr ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VALOHR", ""), GXv_int1) ;
      pciebar.this.AV19FlagValoHr = GXv_int1[0] ;
      GXt_char2 = AV22Station ;
      GXv_char3[0] = GXt_char2 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char3) ;
      pciebar.this.GXt_char2 = GXv_char3[0] ;
      AV22Station = GXt_char2 ;
      GXv_char3[0] = A396EmprCod ;
      GXv_char4[0] = AV23EmprNom ;
      GXv_char5[0] = AV21UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char3, GXv_char4, GXv_char5) ;
      pciebar.this.A396EmprCod = GXv_char3[0] ;
      pciebar.this.AV23EmprNom = GXv_char4[0] ;
      pciebar.this.AV21UsurCod = GXv_char5[0] ;
      if ( GXutil.strcmp(AV15Opcion, httpContext.getMessage( "C", "")) == 0 )
      {
         /* Using cursor P00392 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A213BarSit = P00392_A213BarSit[0] ;
            /* Optimized UPDATE. */
            /* Using cursor P00393 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
            /* End optimized UPDATE. */
            AV20Inc_obs = httpContext.getMessage( "CIERRE HDR.OPCION= ", "") + AV15Opcion + GXutil.newLine( ) ;
            AV20Inc_obs += httpContext.getMessage( "Situacion Actual= ", "") + GXutil.str( A213BarSit, 2, 0) + GXutil.newLine( ) ;
            AV20Inc_obs += httpContext.getMessage( "Situacion Nueva = ", "") + "9" ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV28Pgmname, AV21UsurCod, AV22Station, AV20Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
            A213BarSit = (byte)(9) ;
            /* Using cursor P00394 */
            pr_default.execute(2, new Object[] {Byte.valueOf(A213BarSit), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( AV19FlagValoHr == 1 )
         {
            GXv_char5[0] = A396EmprCod ;
            GXv_int6[0] = A129BarCod ;
            GXv_int1[0] = A132BarCodReo ;
            GXv_char4[0] = A130BarCodPar ;
            GXv_char3[0] = httpContext.getMessage( "B", "") ;
            new app.pgenalm(remoteHandle, context).execute( GXv_char5, GXv_int6, GXv_int1, GXv_char4, GXv_char3) ;
            pciebar.this.A396EmprCod = GXv_char5[0] ;
            pciebar.this.A129BarCod = GXv_int6[0] ;
            pciebar.this.A132BarCodReo = GXv_int1[0] ;
            pciebar.this.A130BarCodPar = GXv_char4[0] ;
         }
      }
      else
      {
         AV16Flag = (byte)(1) ;
         /* Using cursor P00395 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A213BarSit = P00395_A213BarSit[0] ;
            /* Using cursor P00396 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A201BarPieEst = P00396_A201BarPieEst[0] ;
               A200BarPieCod = P00396_A200BarPieCod[0] ;
               if ( A201BarPieEst == 0 )
               {
                  AV16Flag = (byte)(0) ;
               }
               pr_default.readNext(4);
            }
            pr_default.close(4);
            if ( AV16Flag == 1 )
            {
               AV20Inc_obs = httpContext.getMessage( "CIERRE HDR.OPCION= ", "") + AV15Opcion + GXutil.newLine( ) ;
               AV20Inc_obs = httpContext.getMessage( "Controla BARPIE todos los registros BarPiest=1", "") + GXutil.newLine( ) ;
               AV20Inc_obs += httpContext.getMessage( "Situacion Actual= ", "") + GXutil.str( A213BarSit, 2, 0) + GXutil.newLine( ) ;
               AV20Inc_obs += httpContext.getMessage( "Situacion Nueva = ", "") + "9" ;
               new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV28Pgmname, AV21UsurCod, AV22Station, AV20Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
               A213BarSit = (byte)(9) ;
            }
            /* Using cursor P00397 */
            pr_default.execute(5, new Object[] {Byte.valueOf(A213BarSit), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pciebar.this.A396EmprCod;
      this.aP1[0] = pciebar.this.A129BarCod;
      this.aP2[0] = pciebar.this.A132BarCodReo;
      this.aP3[0] = pciebar.this.A130BarCodPar;
      this.aP4[0] = pciebar.this.AV15Opcion;
      Application.commitDataStores(context, remoteHandle, pr_default, "pciebar");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV22Station = "" ;
      GXt_char2 = "" ;
      AV23EmprNom = "" ;
      AV21UsurCod = "" ;
      scmdbuf = "" ;
      P00392_A396EmprCod = new String[] {""} ;
      P00392_A129BarCod = new int[1] ;
      P00392_A132BarCodReo = new byte[1] ;
      P00392_A130BarCodPar = new String[] {""} ;
      P00392_A213BarSit = new byte[1] ;
      AV20Inc_obs = "" ;
      AV28Pgmname = "" ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int1 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      P00395_A396EmprCod = new String[] {""} ;
      P00395_A129BarCod = new int[1] ;
      P00395_A132BarCodReo = new byte[1] ;
      P00395_A130BarCodPar = new String[] {""} ;
      P00395_A213BarSit = new byte[1] ;
      P00396_A396EmprCod = new String[] {""} ;
      P00396_A129BarCod = new int[1] ;
      P00396_A132BarCodReo = new byte[1] ;
      P00396_A130BarCodPar = new String[] {""} ;
      P00396_A201BarPieEst = new byte[1] ;
      P00396_A200BarPieCod = new String[] {""} ;
      A200BarPieCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pciebar__default(),
         new Object[] {
             new Object[] {
            P00392_A396EmprCod, P00392_A129BarCod, P00392_A132BarCodReo, P00392_A130BarCodPar, P00392_A213BarSit
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00395_A396EmprCod, P00395_A129BarCod, P00395_A132BarCodReo, P00395_A130BarCodPar, P00395_A213BarSit
            }
            , new Object[] {
            P00396_A396EmprCod, P00396_A129BarCod, P00396_A132BarCodReo, P00396_A130BarCodPar, P00396_A201BarPieEst, P00396_A200BarPieCod
            }
            , new Object[] {
            }
         }
      );
      AV28Pgmname = "PCIEBAR" ;
      /* GeneXus formulas. */
      AV28Pgmname = "PCIEBAR" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV19FlagValoHr ;
   private byte A213BarSit ;
   private byte GXv_int1[] ;
   private byte AV16Flag ;
   private byte A201BarPieEst ;
   private short Gx_err ;
   private int A129BarCod ;
   private int GXv_int6[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV15Opcion ;
   private String AV22Station ;
   private String GXt_char2 ;
   private String AV23EmprNom ;
   private String AV21UsurCod ;
   private String scmdbuf ;
   private String AV28Pgmname ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String A200BarPieCod ;
   private String AV20Inc_obs ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P00392_A396EmprCod ;
   private int[] P00392_A129BarCod ;
   private byte[] P00392_A132BarCodReo ;
   private String[] P00392_A130BarCodPar ;
   private byte[] P00392_A213BarSit ;
   private String[] P00395_A396EmprCod ;
   private int[] P00395_A129BarCod ;
   private byte[] P00395_A132BarCodReo ;
   private String[] P00395_A130BarCodPar ;
   private byte[] P00395_A213BarSit ;
   private String[] P00396_A396EmprCod ;
   private int[] P00396_A129BarCod ;
   private byte[] P00396_A132BarCodReo ;
   private String[] P00396_A130BarCodPar ;
   private byte[] P00396_A201BarPieEst ;
   private String[] P00396_A200BarPieCod ;
}

final  class pciebar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00392", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarSit FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00393", "UPDATE TXPBARPIE SET BarPieEst=1  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P00394", "UPDATE TXPBARCAD SET BarSit=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P00395", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarSit FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00396", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieEst, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00397", "UPDATE TXPBARCAD SET BarSit=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

