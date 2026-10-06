package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phdrpes extends GXProcedure
{
   public phdrpes( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phdrpes.class ), "" );
   }

   public phdrpes( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      phdrpes.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      phdrpes.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      phdrpes.this.AV15BarCod = aP1[0];
      this.aP1 = aP1;
      phdrpes.this.AV16BarCodReo = aP2[0];
      this.aP2 = aP2;
      phdrpes.this.AV17BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00D02 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15BarCod), Byte.valueOf(AV16BarCodReo), AV17BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P00D02_A130BarCodPar[0] ;
         A132BarCodReo = P00D02_A132BarCodReo[0] ;
         A129BarCod = P00D02_A129BarCod[0] ;
         A146BarEst = P00D02_A146BarEst[0] ;
         if ( (0==A146BarEst) )
         {
            A146BarEst = (byte)(1) ;
         }
         /* Using cursor P00D03 */
         pr_default.execute(1, new Object[] {Byte.valueOf(A146BarEst), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = phdrpes.this.A396EmprCod;
      this.aP1[0] = phdrpes.this.AV15BarCod;
      this.aP2[0] = phdrpes.this.AV16BarCodReo;
      this.aP3[0] = phdrpes.this.AV17BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "phdrpes");
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
      P00D02_A396EmprCod = new String[] {""} ;
      P00D02_A130BarCodPar = new String[] {""} ;
      P00D02_A132BarCodReo = new byte[1] ;
      P00D02_A129BarCod = new int[1] ;
      P00D02_A146BarEst = new byte[1] ;
      A130BarCodPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.phdrpes__default(),
         new Object[] {
             new Object[] {
            P00D02_A396EmprCod, P00D02_A130BarCodPar, P00D02_A132BarCodReo, P00D02_A129BarCod, P00D02_A146BarEst
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16BarCodReo ;
   private byte A132BarCodReo ;
   private byte A146BarEst ;
   private short Gx_err ;
   private int AV15BarCod ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String AV17BarCodPar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P00D02_A396EmprCod ;
   private String[] P00D02_A130BarCodPar ;
   private byte[] P00D02_A132BarCodReo ;
   private int[] P00D02_A129BarCod ;
   private byte[] P00D02_A146BarEst ;
}

final  class phdrpes__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00D02", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarEst FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00D03", "UPDATE TXPBARCAD SET BarEst=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
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
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

