package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pconfor extends GXProcedure
{
   public pconfor( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pconfor.class ), "" );
   }

   public pconfor( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 )
   {
      pconfor.this.aP4 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 )
   {
      pconfor.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pconfor.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pconfor.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pconfor.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pconfor.this.AV15Sit = aP4[0];
      this.aP4 = aP4;
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
      pconfor.this.GXt_char1 = GXv_char2[0] ;
      AV18Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char2, GXv_char3, GXv_char4) ;
      pconfor.this.A396EmprCod = GXv_char2[0] ;
      pconfor.this.AV16EmprNom = GXv_char3[0] ;
      pconfor.this.AV17UsurCod = GXv_char4[0] ;
      /* Using cursor P00DE2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A213BarSit = P00DE2_A213BarSit[0] ;
         A147BarEstCol = P00DE2_A147BarEstCol[0] ;
         AV19Inc_obs = httpContext.getMessage( "Cambio Situacion= ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + GXutil.newLine( ) ;
         AV19Inc_obs += httpContext.getMessage( "Situacion ", "") + GXutil.str( A213BarSit, 2, 0) + " -> " + GXutil.str( AV15Sit, 2, 0) + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV23Pgmname, AV17UsurCod, AV18Station, AV19Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         A213BarSit = AV15Sit ;
         if ( AV15Sit == 1 )
         {
            A147BarEstCol = (byte)(1) ;
         }
         /* Using cursor P00DE3 */
         pr_default.execute(1, new Object[] {Byte.valueOf(A213BarSit), Byte.valueOf(A147BarEstCol), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pconfor.this.A396EmprCod;
      this.aP1[0] = pconfor.this.A129BarCod;
      this.aP2[0] = pconfor.this.A132BarCodReo;
      this.aP3[0] = pconfor.this.A130BarCodPar;
      this.aP4[0] = pconfor.this.AV15Sit;
      Application.commitDataStores(context, remoteHandle, pr_default, "pconfor");
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
      AV16EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV17UsurCod = "" ;
      GXv_char4 = new String[1] ;
      scmdbuf = "" ;
      P00DE2_A396EmprCod = new String[] {""} ;
      P00DE2_A129BarCod = new int[1] ;
      P00DE2_A132BarCodReo = new byte[1] ;
      P00DE2_A130BarCodPar = new String[] {""} ;
      P00DE2_A213BarSit = new byte[1] ;
      P00DE2_A147BarEstCol = new byte[1] ;
      AV19Inc_obs = "" ;
      AV23Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pconfor__default(),
         new Object[] {
             new Object[] {
            P00DE2_A396EmprCod, P00DE2_A129BarCod, P00DE2_A132BarCodReo, P00DE2_A130BarCodPar, P00DE2_A213BarSit, P00DE2_A147BarEstCol
            }
            , new Object[] {
            }
         }
      );
      AV23Pgmname = "PCONFOR" ;
      /* GeneXus formulas. */
      AV23Pgmname = "PCONFOR" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV15Sit ;
   private byte A213BarSit ;
   private byte A147BarEstCol ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV18Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV16EmprNom ;
   private String GXv_char3[] ;
   private String AV17UsurCod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String AV23Pgmname ;
   private String AV19Inc_obs ;
   private byte[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P00DE2_A396EmprCod ;
   private int[] P00DE2_A129BarCod ;
   private byte[] P00DE2_A132BarCodReo ;
   private String[] P00DE2_A130BarCodPar ;
   private byte[] P00DE2_A213BarSit ;
   private byte[] P00DE2_A147BarEstCol ;
}

final  class pconfor__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00DE2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarSit, BarEstCol FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00DE3", "UPDATE TXPBARCAD SET BarSit=?, BarEstCol=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((byte[]) buf[5])[0] = rslt.getByte(6);
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
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
      }
   }

}

