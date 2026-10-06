package app.almacensindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psaftsm3 extends GXProcedure
{
   public psaftsm3( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psaftsm3.class ), "" );
   }

   public psaftsm3( int remoteHandle ,
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
      psaftsm3.this.A396EmprCod = aP0;
      psaftsm3.this.A11669DevCruId = aP1;
      psaftsm3.this.AV16ALbLic = aP2;
      psaftsm3.this.AV17AlbEnvFtp = aP3;
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
      psaftsm3.this.GXt_char1 = GXv_char2[0] ;
      AV18Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV19EmprNom ;
      GXv_char4[0] = AV20UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char2, GXv_char3, GXv_char4) ;
      psaftsm3.this.A396EmprCod = GXv_char2[0] ;
      psaftsm3.this.AV19EmprNom = GXv_char3[0] ;
      psaftsm3.this.AV20UsurCod = GXv_char4[0] ;
      AV21Inc_obs = "" ;
      /* Using cursor P04ZU2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11679DevCruEnvA = P04ZU2_A11679DevCruEnvA[0] ;
         A11680DevCruAtId = P04ZU2_A11680DevCruAtId[0] ;
         A11681DevCruAT = P04ZU2_A11681DevCruAT[0] ;
         A11678DevCruStt = P04ZU2_A11678DevCruStt[0] ;
         A11679DevCruEnvA = AV17AlbEnvFtp ;
         A11680DevCruAtId = AV16ALbLic ;
         A11681DevCruAT = "M" ;
         A11678DevCruStt = "F" ;
         AV21Inc_obs = httpContext.getMessage( "Act. Manual Cod. AT", "") + GXutil.newLine( ) ;
         AV21Inc_obs += httpContext.getMessage( "Cod. AT = ", "") + GXutil.trim( AV16ALbLic) + GXutil.newLine( ) ;
         AV21Inc_obs += httpContext.getMessage( "Estado  = ", "") + httpContext.getMessage( "M", "") + GXutil.newLine( ) ;
         AV21Inc_obs += httpContext.getMessage( "Tipo    = ", "") + httpContext.getMessage( "F", "") + GXutil.newLine( ) ;
         /* Using cursor P04ZU3 */
         pr_default.execute(1, new Object[] {Byte.valueOf(A11679DevCruEnvA), A11680DevCruAtId, A11681DevCruAT, A11678DevCruStt, A396EmprCod, Integer.valueOf(A11669DevCruId)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVCRU");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV21Inc_obs, " ") != 0 )
      {
         new app.pinscrtinc(remoteHandle, context).execute( A396EmprCod, AV25Pgmname, AV20UsurCod, AV18Station, AV21Inc_obs, A11669DevCruId, (byte)(0), "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "almacensindetalle.psaftsm3");
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
      P04ZU2_A396EmprCod = new String[] {""} ;
      P04ZU2_A11669DevCruId = new int[1] ;
      P04ZU2_A11679DevCruEnvA = new byte[1] ;
      P04ZU2_A11680DevCruAtId = new String[] {""} ;
      P04ZU2_A11681DevCruAT = new String[] {""} ;
      P04ZU2_A11678DevCruStt = new String[] {""} ;
      A11680DevCruAtId = "" ;
      A11681DevCruAT = "" ;
      A11678DevCruStt = "" ;
      AV25Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.psaftsm3__default(),
         new Object[] {
             new Object[] {
            P04ZU2_A396EmprCod, P04ZU2_A11669DevCruId, P04ZU2_A11679DevCruEnvA, P04ZU2_A11680DevCruAtId, P04ZU2_A11681DevCruAT, P04ZU2_A11678DevCruStt
            }
            , new Object[] {
            }
         }
      );
      AV25Pgmname = "AlmacenSinDetalle.PSAFTSm3" ;
      /* GeneXus formulas. */
      AV25Pgmname = "AlmacenSinDetalle.PSAFTSm3" ;
      Gx_err = (short)(0) ;
   }

   private byte AV17AlbEnvFtp ;
   private byte A11679DevCruEnvA ;
   private short Gx_err ;
   private int A11669DevCruId ;
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
   private String A11680DevCruAtId ;
   private String A11681DevCruAT ;
   private String A11678DevCruStt ;
   private String AV25Pgmname ;
   private String AV21Inc_obs ;
   private IDataStoreProvider pr_default ;
   private String[] P04ZU2_A396EmprCod ;
   private int[] P04ZU2_A11669DevCruId ;
   private byte[] P04ZU2_A11679DevCruEnvA ;
   private String[] P04ZU2_A11680DevCruAtId ;
   private String[] P04ZU2_A11681DevCruAT ;
   private String[] P04ZU2_A11678DevCruStt ;
}

final  class psaftsm3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04ZU2", "SELECT EmprCod, DevCruId, DevCruEnvA, DevCruAtId, DevCruAT, DevCruStt FROM TXPDEVCRU WHERE EmprCod = ? and DevCruId = ? ORDER BY EmprCod, DevCruId ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04ZU3", "UPDATE TXPDEVCRU SET DevCruEnvA=?, DevCruAtId=?, DevCruAT=?, DevCruStt=?  WHERE EmprCod = ? AND DevCruId = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDEVCRU")
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

