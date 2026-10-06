package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmultro extends GXProcedure
{
   public pmultro( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmultro.class ), "" );
   }

   public pmultro( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            byte[] aP2 ,
                            String[] aP3 ,
                            String[] aP4 )
   {
      pmultro.this.aP5 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 )
   {
      pmultro.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmultro.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pmultro.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pmultro.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pmultro.this.A200BarPieCod = aP4[0];
      this.aP4 = aP4;
      pmultro.this.AV17UltTrozo = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01LA2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A197BarPConTro = P01LA2_A197BarPConTro[0] ;
         A197BarPConTro = AV17UltTrozo ;
         Gx_msg = httpContext.getMessage( "Actualizo Ultimo Trozo.. ", "") + A200BarPieCod + " " + GXutil.str( AV17UltTrozo, 3, 0) ;
         System.out.println( Gx_msg );
         /* Using cursor P01LA3 */
         pr_default.execute(1, new Object[] {Short.valueOf(A197BarPConTro), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmultro.this.A396EmprCod;
      this.aP1[0] = pmultro.this.A129BarCod;
      this.aP2[0] = pmultro.this.A132BarCodReo;
      this.aP3[0] = pmultro.this.A130BarCodPar;
      this.aP4[0] = pmultro.this.A200BarPieCod;
      this.aP5[0] = pmultro.this.AV17UltTrozo;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmultro");
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
      P01LA2_A396EmprCod = new String[] {""} ;
      P01LA2_A129BarCod = new int[1] ;
      P01LA2_A132BarCodReo = new byte[1] ;
      P01LA2_A130BarCodPar = new String[] {""} ;
      P01LA2_A200BarPieCod = new String[] {""} ;
      P01LA2_A197BarPConTro = new short[1] ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmultro__default(),
         new Object[] {
             new Object[] {
            P01LA2_A396EmprCod, P01LA2_A129BarCod, P01LA2_A132BarCodReo, P01LA2_A130BarCodPar, P01LA2_A200BarPieCod, P01LA2_A197BarPConTro
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short AV17UltTrozo ;
   private short A197BarPConTro ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A200BarPieCod ;
   private String scmdbuf ;
   private String Gx_msg ;
   private short[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P01LA2_A396EmprCod ;
   private int[] P01LA2_A129BarCod ;
   private byte[] P01LA2_A132BarCodReo ;
   private String[] P01LA2_A130BarCodPar ;
   private String[] P01LA2_A200BarPieCod ;
   private short[] P01LA2_A197BarPConTro ;
}

final  class pmultro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01LA2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarPConTro FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01LA3", "UPDATE TXPBARPIE SET BarPConTro=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
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
               ((short[]) buf[5])[0] = rslt.getShort(6);
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
      }
   }

}

