package app.trabajosexternos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class trabajoexterno_codigoatmanual extends GXProcedure
{
   public trabajoexterno_codigoatmanual( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trabajoexterno_codigoatmanual.class ), "" );
   }

   public trabajoexterno_codigoatmanual( int remoteHandle ,
                                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        byte aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             byte aP3 )
   {
      trabajoexterno_codigoatmanual.this.A396EmprCod = aP0;
      trabajoexterno_codigoatmanual.this.A2253SalExtAlb = aP1;
      trabajoexterno_codigoatmanual.this.AV16ALbLic = aP2;
      trabajoexterno_codigoatmanual.this.AV17AlbEnvFtp = aP3;
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
      trabajoexterno_codigoatmanual.this.GXt_char1 = GXv_char2[0] ;
      AV18Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV19EmprNom ;
      GXv_char4[0] = AV20UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char2, GXv_char3, GXv_char4) ;
      trabajoexterno_codigoatmanual.this.A396EmprCod = GXv_char2[0] ;
      trabajoexterno_codigoatmanual.this.AV19EmprNom = GXv_char3[0] ;
      trabajoexterno_codigoatmanual.this.AV20UsurCod = GXv_char4[0] ;
      AV21Inc_obs = "" ;
      /* Using cursor P0AJY2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10741SalEnvAT = P0AJY2_A10741SalEnvAT[0] ;
         A10742SalCodeID = P0AJY2_A10742SalCodeID[0] ;
         A10767SalExtAT = P0AJY2_A10767SalExtAT[0] ;
         A10080SalSts = P0AJY2_A10080SalSts[0] ;
         A10741SalEnvAT = AV17AlbEnvFtp ;
         A10742SalCodeID = AV16ALbLic ;
         A10767SalExtAT = "M" ;
         A10080SalSts = "F" ;
         AV21Inc_obs = httpContext.getMessage( "Act. Manual Cod. AT", "") + GXutil.newLine( ) ;
         AV21Inc_obs += httpContext.getMessage( "Cod. AT = ", "") + GXutil.trim( AV16ALbLic) + GXutil.newLine( ) ;
         AV21Inc_obs += httpContext.getMessage( "Estado  = ", "") + httpContext.getMessage( "M", "") + GXutil.newLine( ) ;
         AV21Inc_obs += httpContext.getMessage( "Tipo    = ", "") + httpContext.getMessage( "F", "") + GXutil.newLine( ) ;
         /* Using cursor P0AJY3 */
         pr_default.execute(1, new Object[] {Byte.valueOf(A10741SalEnvAT), A10742SalCodeID, A10767SalExtAT, A10080SalSts, A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXTSA");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV21Inc_obs, " ") != 0 )
      {
         new app.pinscrtinc(remoteHandle, context).execute( A396EmprCod, AV25Pgmname, AV20UsurCod, AV18Station, AV21Inc_obs, A2253SalExtAlb, (byte)(0), "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "trabajosexternos.trabajoexterno_codigoatmanual");
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
      P0AJY2_A396EmprCod = new String[] {""} ;
      P0AJY2_A2253SalExtAlb = new int[1] ;
      P0AJY2_A10741SalEnvAT = new byte[1] ;
      P0AJY2_A10742SalCodeID = new String[] {""} ;
      P0AJY2_A10767SalExtAT = new String[] {""} ;
      P0AJY2_A10080SalSts = new String[] {""} ;
      A10742SalCodeID = "" ;
      A10767SalExtAT = "" ;
      A10080SalSts = "" ;
      AV25Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.trabajoexterno_codigoatmanual__default(),
         new Object[] {
             new Object[] {
            P0AJY2_A396EmprCod, P0AJY2_A2253SalExtAlb, P0AJY2_A10741SalEnvAT, P0AJY2_A10742SalCodeID, P0AJY2_A10767SalExtAT, P0AJY2_A10080SalSts
            }
            , new Object[] {
            }
         }
      );
      AV25Pgmname = "TrabajosExternos.TrabajoExterno_CodigoATManual" ;
      /* GeneXus formulas. */
      AV25Pgmname = "TrabajosExternos.TrabajoExterno_CodigoATManual" ;
      Gx_err = (short)(0) ;
   }

   private byte AV17AlbEnvFtp ;
   private byte A10741SalEnvAT ;
   private short Gx_err ;
   private int A2253SalExtAlb ;
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
   private String A10742SalCodeID ;
   private String A10767SalExtAT ;
   private String A10080SalSts ;
   private String AV25Pgmname ;
   private String AV21Inc_obs ;
   private IDataStoreProvider pr_default ;
   private String[] P0AJY2_A396EmprCod ;
   private int[] P0AJY2_A2253SalExtAlb ;
   private byte[] P0AJY2_A10741SalEnvAT ;
   private String[] P0AJY2_A10742SalCodeID ;
   private String[] P0AJY2_A10767SalExtAT ;
   private String[] P0AJY2_A10080SalSts ;
}

final  class trabajoexterno_codigoatmanual__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AJY2", "SELECT EmprCod, SalExtAlb, SalEnvAT, SalCodeID, SalExtAT, SalSts FROM TXPCEXTSA WHERE EmprCod = ? and SalExtAlb = ? ORDER BY EmprCod, SalExtAlb ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P0AJY3", "UPDATE TXPCEXTSA SET SalEnvAT=?, SalCodeID=?, SalExtAT=?, SalSts=?  WHERE EmprCod = ? AND SalExtAlb = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCEXTSA")
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 20);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
      }
   }

}

