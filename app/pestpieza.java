package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pestpieza extends GXProcedure
{
   public pestpieza( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pestpieza.class ), "" );
   }

   public pestpieza( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pestpieza.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pestpieza.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pestpieza.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pestpieza.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pestpieza.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pestpieza.this.A200BarPieCod = aP4[0];
      this.aP4 = aP4;
      pestpieza.this.Gx_mode = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P05GU2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A201BarPieEst = P05GU2_A201BarPieEst[0] ;
         Gx_msg = httpContext.getMessage( "1.BarPieEst=", "") + GXutil.str( A201BarPieEst, 1, 0) + GXutil.newLine( ) ;
         A201BarPieEst = (byte)(((GXutil.strcmp(Gx_mode, httpContext.getMessage( "INS", ""))==0) ? 1 : ((GXutil.strcmp(Gx_mode, httpContext.getMessage( "DEL", ""))==0) ? 0 : A201BarPieEst))) ;
         Gx_msg += httpContext.getMessage( "2.BarPieEst=", "") + GXutil.str( A201BarPieEst, 1, 0) + GXutil.newLine( ) ;
         System.out.println( Gx_msg );
         /* Using cursor P05GU3 */
         pr_default.execute(1, new Object[] {Byte.valueOf(A201BarPieEst), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pestpieza.this.A396EmprCod;
      this.aP1[0] = pestpieza.this.A129BarCod;
      this.aP2[0] = pestpieza.this.A132BarCodReo;
      this.aP3[0] = pestpieza.this.A130BarCodPar;
      this.aP4[0] = pestpieza.this.A200BarPieCod;
      this.aP5[0] = pestpieza.this.Gx_mode;
      Application.commitDataStores(context, remoteHandle, pr_default, "pestpieza");
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
      P05GU2_A396EmprCod = new String[] {""} ;
      P05GU2_A129BarCod = new int[1] ;
      P05GU2_A132BarCodReo = new byte[1] ;
      P05GU2_A130BarCodPar = new String[] {""} ;
      P05GU2_A200BarPieCod = new String[] {""} ;
      P05GU2_A201BarPieEst = new byte[1] ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pestpieza__default(),
         new Object[] {
             new Object[] {
            P05GU2_A396EmprCod, P05GU2_A129BarCod, P05GU2_A132BarCodReo, P05GU2_A130BarCodPar, P05GU2_A200BarPieCod, P05GU2_A201BarPieEst
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A201BarPieEst ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A200BarPieCod ;
   private String Gx_mode ;
   private String scmdbuf ;
   private String Gx_msg ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P05GU2_A396EmprCod ;
   private int[] P05GU2_A129BarCod ;
   private byte[] P05GU2_A132BarCodReo ;
   private String[] P05GU2_A130BarCodPar ;
   private String[] P05GU2_A200BarPieCod ;
   private byte[] P05GU2_A201BarPieEst ;
}

final  class pestpieza__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05GU2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarPieEst FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P05GU3", "UPDATE TXPBARPIE SET BarPieEst=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
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
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
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
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 1 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
      }
   }

}

