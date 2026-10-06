package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppdisest extends GXProcedure
{
   public ppdisest( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppdisest.class ), "" );
   }

   public ppdisest( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      ppdisest.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      ppdisest.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppdisest.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      ppdisest.this.AV9Usurcod = aP2[0];
      this.aP2 = aP2;
      ppdisest.this.AV10station = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04812 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A367DisEst = P04812_A367DisEst[0] ;
         A252CliCod = P04812_A252CliCod[0] ;
         A335DisArtCod = P04812_A335DisArtCod[0] ;
         A4477DisAcaBak = P04812_A4477DisAcaBak[0] ;
         A4479DisAcaMar = P04812_A4479DisAcaMar[0] ;
         if ( A367DisEst == 0 )
         {
            AV8Inc_obs = httpContext.getMessage( "Cambio DisEst,Valor=", "") + GXutil.str( A367DisEst, 1, 0) + GXutil.newLine( ) + httpContext.getMessage( "Valor New=", "") + "1" + GXutil.newLine( ) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV16Pgmname, AV9Usurcod, AV10station, AV8Inc_obs, A361DisCod, (byte)(0), " ") ;
            A367DisEst = (byte)(1) ;
         }
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A252CliCod ;
         GXv_char3[0] = A335DisArtCod ;
         GXv_char4[0] = AV11Disacabak ;
         GXv_char5[0] = AV12Disacamar ;
         new app.pacamaracabak(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3, GXv_char4, GXv_char5) ;
         ppdisest.this.A396EmprCod = GXv_char1[0] ;
         ppdisest.this.A252CliCod = GXv_int2[0] ;
         ppdisest.this.A335DisArtCod = GXv_char3[0] ;
         ppdisest.this.AV11Disacabak = GXv_char4[0] ;
         ppdisest.this.AV12Disacamar = GXv_char5[0] ;
         A4477DisAcaBak = AV11Disacabak ;
         A4479DisAcaMar = AV12Disacamar ;
         /* Using cursor P04813 */
         pr_default.execute(1, new Object[] {Byte.valueOf(A367DisEst), A4477DisAcaBak, A4479DisAcaMar, A396EmprCod, Integer.valueOf(A361DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppdisest.this.A396EmprCod;
      this.aP1[0] = ppdisest.this.A361DisCod;
      this.aP2[0] = ppdisest.this.AV9Usurcod;
      this.aP3[0] = ppdisest.this.AV10station;
      Application.commitDataStores(context, remoteHandle, pr_default, "ppdisest");
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
      P04812_A396EmprCod = new String[] {""} ;
      P04812_A361DisCod = new int[1] ;
      P04812_A367DisEst = new byte[1] ;
      P04812_A252CliCod = new int[1] ;
      P04812_A335DisArtCod = new String[] {""} ;
      P04812_A4477DisAcaBak = new String[] {""} ;
      P04812_A4479DisAcaMar = new String[] {""} ;
      A335DisArtCod = "" ;
      A4477DisAcaBak = "" ;
      A4479DisAcaMar = "" ;
      AV8Inc_obs = "" ;
      AV16Pgmname = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char3 = new String[1] ;
      AV11Disacabak = "" ;
      GXv_char4 = new String[1] ;
      AV12Disacamar = "" ;
      GXv_char5 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppdisest__default(),
         new Object[] {
             new Object[] {
            P04812_A396EmprCod, P04812_A361DisCod, P04812_A367DisEst, P04812_A252CliCod, P04812_A335DisArtCod, P04812_A4477DisAcaBak, P04812_A4479DisAcaMar
            }
            , new Object[] {
            }
         }
      );
      AV16Pgmname = "PPDISEST" ;
      /* GeneXus formulas. */
      AV16Pgmname = "PPDISEST" ;
      Gx_err = (short)(0) ;
   }

   private byte A367DisEst ;
   private short Gx_err ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int GXv_int2[] ;
   private String A396EmprCod ;
   private String AV9Usurcod ;
   private String AV10station ;
   private String scmdbuf ;
   private String A335DisArtCod ;
   private String A4477DisAcaBak ;
   private String A4479DisAcaMar ;
   private String AV16Pgmname ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String AV11Disacabak ;
   private String GXv_char4[] ;
   private String AV12Disacamar ;
   private String GXv_char5[] ;
   private String AV8Inc_obs ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P04812_A396EmprCod ;
   private int[] P04812_A361DisCod ;
   private byte[] P04812_A367DisEst ;
   private int[] P04812_A252CliCod ;
   private String[] P04812_A335DisArtCod ;
   private String[] P04812_A4477DisAcaBak ;
   private String[] P04812_A4479DisAcaMar ;
}

final  class ppdisest__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04812", "SELECT EmprCod, DisCod, DisEst, CliCod, DisArtCod, DisAcaBak, DisAcaMar FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04813", "UPDATE TXPDISPOS SET DisEst=?, DisAcaBak=?, DisAcaMar=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
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
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
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
               stmt.setString(2, (String)parms[1], 1);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
      }
   }

}

