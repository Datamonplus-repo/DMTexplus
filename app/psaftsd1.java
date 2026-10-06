package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psaftsd1 extends GXProcedure
{
   public psaftsd1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psaftsd1.class ), "" );
   }

   public psaftsd1( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 )
   {
      psaftsd1.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 )
   {
      psaftsd1.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      psaftsd1.this.A14AlbComCod = aP1[0];
      this.aP1 = aP1;
      psaftsd1.this.AV16ALbLic = aP2[0];
      this.aP2 = aP2;
      psaftsd1.this.AV17AlbEnvFtp = aP3[0];
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
      psaftsd1.this.GXt_char1 = GXv_char2[0] ;
      AV18Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV19EmprNom ;
      GXv_char4[0] = AV20UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char2, GXv_char3, GXv_char4) ;
      psaftsd1.this.A396EmprCod = GXv_char2[0] ;
      psaftsd1.this.AV19EmprNom = GXv_char3[0] ;
      psaftsd1.this.AV20UsurCod = GXv_char4[0] ;
      AV21Inc_obs = "" ;
      /* Using cursor P041O2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10739AlbComEAT = P041O2_A10739AlbComEAT[0] ;
         A10740AlbComID = P041O2_A10740AlbComID[0] ;
         A10764AlbComAT = P041O2_A10764AlbComAT[0] ;
         A10738AlbComSt = P041O2_A10738AlbComSt[0] ;
         A10739AlbComEAT = AV17AlbEnvFtp ;
         A10740AlbComID = AV16ALbLic ;
         A10764AlbComAT = httpContext.getMessage( "M", "") ;
         A10738AlbComSt = "F" ;
         AV21Inc_obs = httpContext.getMessage( "Act. Manual Cod. AT", "") + GXutil.newLine( ) ;
         AV21Inc_obs += httpContext.getMessage( "Cod. AT = ", "") + GXutil.trim( AV16ALbLic) + GXutil.newLine( ) ;
         AV21Inc_obs += httpContext.getMessage( "Estado  = ", "") + httpContext.getMessage( "M", "") + GXutil.newLine( ) ;
         AV21Inc_obs += httpContext.getMessage( "Tipo    = ", "") + httpContext.getMessage( "F", "") + GXutil.newLine( ) ;
         /* Using cursor P041O3 */
         pr_default.execute(1, new Object[] {Byte.valueOf(A10739AlbComEAT), A10740AlbComID, A10764AlbComAT, A10738AlbComSt, A396EmprCod, Integer.valueOf(A14AlbComCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALCOM");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV21Inc_obs, " ") != 0 )
      {
         new app.pinscrtinc(remoteHandle, context).execute( A396EmprCod, AV25Pgmname, AV20UsurCod, AV18Station, AV21Inc_obs, A14AlbComCod, (byte)(0), "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = psaftsd1.this.A396EmprCod;
      this.aP1[0] = psaftsd1.this.A14AlbComCod;
      this.aP2[0] = psaftsd1.this.AV16ALbLic;
      this.aP3[0] = psaftsd1.this.AV17AlbEnvFtp;
      Application.commitDataStores(context, remoteHandle, pr_default, "psaftsd1");
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
      P041O2_A396EmprCod = new String[] {""} ;
      P041O2_A14AlbComCod = new int[1] ;
      P041O2_A10739AlbComEAT = new byte[1] ;
      P041O2_A10740AlbComID = new String[] {""} ;
      P041O2_A10764AlbComAT = new String[] {""} ;
      P041O2_A10738AlbComSt = new String[] {""} ;
      A10740AlbComID = "" ;
      A10764AlbComAT = "" ;
      A10738AlbComSt = "" ;
      AV25Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.psaftsd1__default(),
         new Object[] {
             new Object[] {
            P041O2_A396EmprCod, P041O2_A14AlbComCod, P041O2_A10739AlbComEAT, P041O2_A10740AlbComID, P041O2_A10764AlbComAT, P041O2_A10738AlbComSt
            }
            , new Object[] {
            }
         }
      );
      AV25Pgmname = "PSAFTSD1" ;
      /* GeneXus formulas. */
      AV25Pgmname = "PSAFTSD1" ;
      Gx_err = (short)(0) ;
   }

   private byte AV17AlbEnvFtp ;
   private byte A10739AlbComEAT ;
   private short Gx_err ;
   private int A14AlbComCod ;
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
   private String A10740AlbComID ;
   private String A10764AlbComAT ;
   private String A10738AlbComSt ;
   private String AV25Pgmname ;
   private String AV21Inc_obs ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P041O2_A396EmprCod ;
   private int[] P041O2_A14AlbComCod ;
   private byte[] P041O2_A10739AlbComEAT ;
   private String[] P041O2_A10740AlbComID ;
   private String[] P041O2_A10764AlbComAT ;
   private String[] P041O2_A10738AlbComSt ;
}

final  class psaftsd1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P041O2", "SELECT EmprCod, AlbComCod, AlbComEAT, AlbComID, AlbComAT, AlbComSt FROM TXPCALCOM WHERE EmprCod = ? and AlbComCod = ? ORDER BY EmprCod, AlbComCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P041O3", "UPDATE TXPCALCOM SET AlbComEAT=?, AlbComID=?, AlbComAT=?, AlbComSt=?  WHERE EmprCod = ? AND AlbComCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALCOM")
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

