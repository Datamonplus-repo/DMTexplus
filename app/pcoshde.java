package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcoshde extends GXProcedure
{
   public pcoshde( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcoshde.class ), "" );
   }

   public pcoshde( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 )
   {
      pcoshde.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pcoshde.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcoshde.this.A2809MetTerCod = aP1[0];
      this.aP1 = aP1;
      pcoshde.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pcoshde.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pcoshde.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      pcoshde.this.A2813MetPieCod = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV8Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pcoshde.this.GXt_char1 = GXv_char2[0] ;
      AV8Station = GXt_char1 ;
      AV11Inc_obs = "" ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV9Emprnom ;
      GXv_char4[0] = AV10Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV8Station, GXv_char2, GXv_char3, GXv_char4) ;
      pcoshde.this.A396EmprCod = GXv_char2[0] ;
      pcoshde.this.AV9Emprnom = GXv_char3[0] ;
      pcoshde.this.AV10Usurcod = GXv_char4[0] ;
      /* Using cursor P043L2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         /* Using cursor P043L3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMETPI");
         AV11Inc_obs = httpContext.getMessage( "Eliminacion N. PIEZA= ", "") + A2813MetPieCod + GXutil.newLine( ) ;
         AV11Inc_obs += httpContext.getMessage( "Hdr= ", "") + GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + GXutil.newLine( ) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( ! (GXutil.strcmp("", AV11Inc_obs)==0) )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV15Pgmname, AV10Usurcod, AV8Station, AV11Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcoshde.this.A396EmprCod;
      this.aP1[0] = pcoshde.this.A2809MetTerCod;
      this.aP2[0] = pcoshde.this.A129BarCod;
      this.aP3[0] = pcoshde.this.A132BarCodReo;
      this.aP4[0] = pcoshde.this.A130BarCodPar;
      this.aP5[0] = pcoshde.this.A2813MetPieCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcoshde");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Station = "" ;
      GXt_char1 = "" ;
      AV11Inc_obs = "" ;
      GXv_char2 = new String[1] ;
      AV9Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV10Usurcod = "" ;
      GXv_char4 = new String[1] ;
      scmdbuf = "" ;
      P043L2_A396EmprCod = new String[] {""} ;
      P043L2_A2809MetTerCod = new String[] {""} ;
      P043L2_A129BarCod = new int[1] ;
      P043L2_A132BarCodReo = new byte[1] ;
      P043L2_A130BarCodPar = new String[] {""} ;
      P043L2_A2813MetPieCod = new String[] {""} ;
      AV15Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcoshde__default(),
         new Object[] {
             new Object[] {
            P043L2_A396EmprCod, P043L2_A2809MetTerCod, P043L2_A129BarCod, P043L2_A132BarCodReo, P043L2_A130BarCodPar, P043L2_A2813MetPieCod
            }
            , new Object[] {
            }
         }
      );
      AV15Pgmname = "PCOSHDE" ;
      /* GeneXus formulas. */
      AV15Pgmname = "PCOSHDE" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A2809MetTerCod ;
   private String A130BarCodPar ;
   private String A2813MetPieCod ;
   private String AV8Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV9Emprnom ;
   private String GXv_char3[] ;
   private String AV10Usurcod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String AV15Pgmname ;
   private String AV11Inc_obs ;
   private String[] aP5 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P043L2_A396EmprCod ;
   private String[] P043L2_A2809MetTerCod ;
   private int[] P043L2_A129BarCod ;
   private byte[] P043L2_A132BarCodReo ;
   private String[] P043L2_A130BarCodPar ;
   private String[] P043L2_A2813MetPieCod ;
}

final  class pcoshde__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P043L2", "SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod FROM TXPLMETPI WHERE EmprCod = ? and MetTerCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and MetPieCod = ? ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P043L3", "DELETE FROM TXPLMETPI  WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLMETPI")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
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
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
      }
   }

}

