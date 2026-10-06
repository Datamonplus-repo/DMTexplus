package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdispaf extends GXProcedure
{
   public pdispaf( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdispaf.class ), "" );
   }

   public pdispaf( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             short[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 )
   {
      pdispaf.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        short[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             short[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      pdispaf.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdispaf.this.AV15DisCod = aP1[0];
      this.aP1 = aP1;
      pdispaf.this.AV8ProCod = aP2[0];
      this.aP2 = aP2;
      pdispaf.this.AV16DisFasLin = aP3[0];
      this.aP3 = aP3;
      pdispaf.this.AV10ParFasCod = aP4[0];
      this.aP4 = aP4;
      pdispaf.this.AV11ParFasVal = aP5[0];
      this.aP5 = aP5;
      pdispaf.this.AV12ParFasObs = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV17Noserpar ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NOSRPR", ""), GXv_int2) ;
      pdispaf.this.GXt_int1 = GXv_int2[0] ;
      AV17Noserpar = GXt_int1 ;
      if ( AV17Noserpar == 1 )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Using cursor P01FZ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15DisCod), AV8ProCod, Short.valueOf(AV16DisFasLin), Short.valueOf(AV10ParFasCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1664ParFasCod = P01FZ2_A1664ParFasCod[0] ;
         A368DisFasLin = P01FZ2_A368DisFasLin[0] ;
         A758ProCod = P01FZ2_A758ProCod[0] ;
         A361DisCod = P01FZ2_A361DisCod[0] ;
         A457FasCod = P01FZ2_A457FasCod[0] ;
         A252CliCod = P01FZ2_A252CliCod[0] ;
         A335DisArtCod = P01FZ2_A335DisArtCod[0] ;
         A252CliCod = P01FZ2_A252CliCod[0] ;
         A335DisArtCod = P01FZ2_A335DisArtCod[0] ;
         A457FasCod = P01FZ2_A457FasCod[0] ;
         AV9FasCod = A457FasCod ;
         AV13CliCod = A252CliCod ;
         AV14ArtCod = A335DisArtCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /*
         INSERT RECORD ON TABLE TXPSERPAR

      */
      A252CliCod = AV13CliCod ;
      A65ArtCod = AV14ArtCod ;
      A758ProCod = AV8ProCod ;
      A457FasCod = AV9FasCod ;
      A1664ParFasCod = AV10ParFasCod ;
      A1668ParFasVal = AV11ParFasVal ;
      A1673ParFasObs = AV12ParFasObs ;
      /* Using cursor P01FZ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A457FasCod, Short.valueOf(A1664ParFasCod), A1668ParFasVal, A1673ParFasObs});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPSERPAR");
      if ( (pr_default.getStatus(1) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         /* Optimized UPDATE. */
         /* Using cursor P01FZ4 */
         pr_default.execute(2, new Object[] {AV12ParFasObs, AV11ParFasVal, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A457FasCod, Short.valueOf(A1664ParFasCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPSERPAR");
         /* End optimized UPDATE. */
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdispaf.this.A396EmprCod;
      this.aP1[0] = pdispaf.this.AV15DisCod;
      this.aP2[0] = pdispaf.this.AV8ProCod;
      this.aP3[0] = pdispaf.this.AV16DisFasLin;
      this.aP4[0] = pdispaf.this.AV10ParFasCod;
      this.aP5[0] = pdispaf.this.AV11ParFasVal;
      this.aP6[0] = pdispaf.this.AV12ParFasObs;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdispaf");
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
      P01FZ2_A396EmprCod = new String[] {""} ;
      P01FZ2_A1664ParFasCod = new short[1] ;
      P01FZ2_A368DisFasLin = new short[1] ;
      P01FZ2_A758ProCod = new String[] {""} ;
      P01FZ2_A361DisCod = new int[1] ;
      P01FZ2_A457FasCod = new String[] {""} ;
      P01FZ2_A252CliCod = new int[1] ;
      P01FZ2_A335DisArtCod = new String[] {""} ;
      A758ProCod = "" ;
      A457FasCod = "" ;
      A335DisArtCod = "" ;
      AV9FasCod = "" ;
      AV14ArtCod = "" ;
      A65ArtCod = "" ;
      A1668ParFasVal = "" ;
      A1673ParFasObs = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdispaf__default(),
         new Object[] {
             new Object[] {
            P01FZ2_A396EmprCod, P01FZ2_A1664ParFasCod, P01FZ2_A368DisFasLin, P01FZ2_A758ProCod, P01FZ2_A361DisCod, P01FZ2_A457FasCod, P01FZ2_A252CliCod, P01FZ2_A335DisArtCod
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

   private byte AV17Noserpar ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private short AV16DisFasLin ;
   private short AV10ParFasCod ;
   private short A1664ParFasCod ;
   private short A368DisFasLin ;
   private short Gx_err ;
   private int AV15DisCod ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int AV13CliCod ;
   private int GX_INS477 ;
   private String A396EmprCod ;
   private String AV8ProCod ;
   private String AV11ParFasVal ;
   private String AV12ParFasObs ;
   private String scmdbuf ;
   private String A758ProCod ;
   private String A457FasCod ;
   private String A335DisArtCod ;
   private String AV9FasCod ;
   private String AV14ArtCod ;
   private String A65ArtCod ;
   private String A1668ParFasVal ;
   private String A1673ParFasObs ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private short[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P01FZ2_A396EmprCod ;
   private short[] P01FZ2_A1664ParFasCod ;
   private short[] P01FZ2_A368DisFasLin ;
   private String[] P01FZ2_A758ProCod ;
   private int[] P01FZ2_A361DisCod ;
   private String[] P01FZ2_A457FasCod ;
   private int[] P01FZ2_A252CliCod ;
   private String[] P01FZ2_A335DisArtCod ;
}

final  class pdispaf__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01FZ2", "SELECT T1.EmprCod, T1.ParFasCod, T1.DisFasLin, T1.ProCod, T1.DisCod, T3.FasCod, T2.CliCod, T2.DisArtCod FROM ((TXPDISPAR T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) INNER JOIN TXPDISFAS T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T1.DisCod AND T3.ProCod = T1.ProCod AND T3.DisFasLin = T1.DisFasLin) WHERE T1.EmprCod = ? and T1.DisCod = ? and T1.ProCod = ? and T1.DisFasLin = ? and T1.ParFasCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.ProCod, T1.DisFasLin, T1.ParFasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01FZ3", "INSERT INTO TXPSERPAR(EmprCod, CliCod, ArtCod, ProCod, FasCod, ParFasCod, ParFasVal, ParFasObs, ParFasVl2, ParOrden, ParFasVmx, ParFasVmn) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPSERPAR")
         ,new UpdateCursor("P01FZ4", "UPDATE TXPSERPAR SET ParFasObs=?, ParFasVal=?  WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCod = ? and ParFasCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPSERPAR")
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
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
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setString(8, (String)parms[7], 60);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 16);
               stmt.setString(6, (String)parms[5], 8);
               stmt.setString(7, (String)parms[6], 8);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
      }
   }

}

