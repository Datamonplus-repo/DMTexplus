package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnumtrozos extends GXProcedure
{
   public pnumtrozos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnumtrozos.class ), "" );
   }

   public pnumtrozos( int remoteHandle ,
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
      pnumtrozos.this.aP5 = new short[] {0};
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
      pnumtrozos.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnumtrozos.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pnumtrozos.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pnumtrozos.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pnumtrozos.this.A200BarPieCod = aP4[0];
      this.aP4 = aP4;
      pnumtrozos.this.AV9AlbPTroCod = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P05GC2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A197BarPConTro = P05GC2_A197BarPConTro[0] ;
         if ( A197BarPConTro <= 999 )
         {
            A197BarPConTro = (short)(A197BarPConTro+1) ;
            AV9AlbPTroCod = A197BarPConTro ;
         }
         else
         {
            AV9AlbPTroCod = (short)(999) ;
         }
         /* Using cursor P05GC3 */
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
      this.aP0[0] = pnumtrozos.this.A396EmprCod;
      this.aP1[0] = pnumtrozos.this.A129BarCod;
      this.aP2[0] = pnumtrozos.this.A132BarCodReo;
      this.aP3[0] = pnumtrozos.this.A130BarCodPar;
      this.aP4[0] = pnumtrozos.this.A200BarPieCod;
      this.aP5[0] = pnumtrozos.this.AV9AlbPTroCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pnumtrozos");
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
      P05GC2_A396EmprCod = new String[] {""} ;
      P05GC2_A129BarCod = new int[1] ;
      P05GC2_A132BarCodReo = new byte[1] ;
      P05GC2_A130BarCodPar = new String[] {""} ;
      P05GC2_A200BarPieCod = new String[] {""} ;
      P05GC2_A197BarPConTro = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnumtrozos__default(),
         new Object[] {
             new Object[] {
            P05GC2_A396EmprCod, P05GC2_A129BarCod, P05GC2_A132BarCodReo, P05GC2_A130BarCodPar, P05GC2_A200BarPieCod, P05GC2_A197BarPConTro
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short AV9AlbPTroCod ;
   private short A197BarPConTro ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A200BarPieCod ;
   private String scmdbuf ;
   private short[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P05GC2_A396EmprCod ;
   private int[] P05GC2_A129BarCod ;
   private byte[] P05GC2_A132BarCodReo ;
   private String[] P05GC2_A130BarCodPar ;
   private String[] P05GC2_A200BarPieCod ;
   private short[] P05GC2_A197BarPConTro ;
}

final  class pnumtrozos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05GC2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarPConTro FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P05GC3", "UPDATE TXPBARPIE SET BarPConTro=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
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

