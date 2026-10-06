package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfasprda extends GXProcedure
{
   public pfasprda( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfasprda.class ), "" );
   }

   public pfasprda( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           long[] aP1 ,
                           String[] aP2 )
   {
      pfasprda.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 )
   {
      pfasprda.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfasprda.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pfasprda.this.AV16ALbLic = aP2[0];
      this.aP2 = aP2;
      pfasprda.this.AV17AlbEnvFtp = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV18Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pfasprda.this.GXt_char1 = GXv_char2[0] ;
      AV18Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV19EmprNom ;
      GXv_char4[0] = AV20UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char2, GXv_char3, GXv_char4) ;
      pfasprda.this.A396EmprCod = GXv_char2[0] ;
      pfasprda.this.AV19EmprNom = GXv_char3[0] ;
      pfasprda.this.AV20UsurCod = GXv_char4[0] ;
      AV21Inc_obs = "" ;
      /* Using cursor P022A2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5805AlbEnvFtp = P022A2_A5805AlbEnvFtp[0] ;
         A7101AlbLic = P022A2_A7101AlbLic[0] ;
         A10765AlbProAT = P022A2_A10765AlbProAT[0] ;
         A5140AlbMarca = P022A2_A5140AlbMarca[0] ;
         A5805AlbEnvFtp = AV17AlbEnvFtp ;
         A7101AlbLic = AV16ALbLic ;
         A10765AlbProAT = "M" ;
         A5140AlbMarca = "F" ;
         AV21Inc_obs = httpContext.getMessage( "Act. Manual Cod. AT", "") + GXutil.newLine( ) ;
         AV21Inc_obs += httpContext.getMessage( "Cod. AT = ", "") + GXutil.trim( AV16ALbLic) + GXutil.newLine( ) ;
         AV21Inc_obs += httpContext.getMessage( "Estado  = ", "") + httpContext.getMessage( "M", "") + GXutil.newLine( ) ;
         AV21Inc_obs += httpContext.getMessage( "Tipo    = ", "") + httpContext.getMessage( "F", "") + GXutil.newLine( ) ;
         /* Using cursor P022A3 */
         pr_default.execute(1, new Object[] {Byte.valueOf(A5805AlbEnvFtp), A7101AlbLic, A10765AlbProAT, A5140AlbMarca, A396EmprCod, Long.valueOf(A30AlbProCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV21Inc_obs, " ") != 0 )
      {
         new app.pinscrtinc(remoteHandle, context).execute( A396EmprCod, AV25Pgmname, AV20UsurCod, AV18Station, AV21Inc_obs, (int)(A30AlbProCod), (byte)(0), "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfasprda.this.A396EmprCod;
      this.aP1[0] = pfasprda.this.A30AlbProCod;
      this.aP2[0] = pfasprda.this.AV16ALbLic;
      this.aP3[0] = pfasprda.this.AV17AlbEnvFtp;
      Application.commitDataStores(context, remoteHandle, pr_default, "documentotransporteproduccion.pfasprda");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV18Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV19EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV20UsurCod = "" ;
      GXv_char4 = new String[1] ;
      AV21Inc_obs = "" ;
      scmdbuf = "" ;
      P022A2_A396EmprCod = new String[] {""} ;
      P022A2_A30AlbProCod = new long[1] ;
      P022A2_A5805AlbEnvFtp = new byte[1] ;
      P022A2_A7101AlbLic = new String[] {""} ;
      P022A2_A10765AlbProAT = new String[] {""} ;
      P022A2_A5140AlbMarca = new String[] {""} ;
      A7101AlbLic = "" ;
      A10765AlbProAT = "" ;
      A5140AlbMarca = "" ;
      AV25Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.pfasprda__default(),
         new Object[] {
             new Object[] {
            P022A2_A396EmprCod, P022A2_A30AlbProCod, P022A2_A5805AlbEnvFtp, P022A2_A7101AlbLic, P022A2_A10765AlbProAT, P022A2_A5140AlbMarca
            }
            , new Object[] {
            }
         }
      );
      AV25Pgmname = "DocumentoTransporteProduccion.PFASPRDA" ;
      /* GeneXus formulas. */
      AV25Pgmname = "DocumentoTransporteProduccion.PFASPRDA" ;
      Gx_err = (short)(0) ;
   }

   private byte AV17AlbEnvFtp ;
   private byte A5805AlbEnvFtp ;
   private short Gx_err ;
   private long A30AlbProCod ;
   private String A396EmprCod ;
   private String AV16ALbLic ;
   private String AV18Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV19EmprNom ;
   private String GXv_char3[] ;
   private String AV20UsurCod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A7101AlbLic ;
   private String A10765AlbProAT ;
   private String A5140AlbMarca ;
   private String AV25Pgmname ;
   private String AV21Inc_obs ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P022A2_A396EmprCod ;
   private long[] P022A2_A30AlbProCod ;
   private byte[] P022A2_A5805AlbEnvFtp ;
   private String[] P022A2_A7101AlbLic ;
   private String[] P022A2_A10765AlbProAT ;
   private String[] P022A2_A5140AlbMarca ;
}

final  class pfasprda__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P022A2", "SELECT EmprCod, AlbProCod, AlbEnvFtp, AlbLic, AlbProAT, AlbMarca FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P022A3", "UPDATE TXPCALPRD SET AlbEnvFtp=?, AlbLic=?, AlbProAT=?, AlbMarca=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 1 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 20);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               return;
      }
   }

}

