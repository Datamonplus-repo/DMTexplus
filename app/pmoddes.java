package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmoddes extends GXProcedure
{
   public pmoddes( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmoddes.class ), "" );
   }

   public pmoddes( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      pmoddes.this.aP3 = new String[] {""};
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
      pmoddes.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmoddes.this.AV16BarCod = aP1[0];
      this.aP1 = aP1;
      pmoddes.this.AV17BarCodReo = aP2[0];
      this.aP2 = aP2;
      pmoddes.this.AV18BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00GS2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P00GS2_A130BarCodPar[0] ;
         A132BarCodReo = P00GS2_A132BarCodReo[0] ;
         A129BarCod = P00GS2_A129BarCod[0] ;
         A1652BarSerDsc = P00GS2_A1652BarSerDsc[0] ;
         AV15BarSerDsc = A1652BarSerDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Optimized UPDATE. */
      /* Using cursor P00GS3 */
      pr_default.execute(1, new Object[] {AV15BarSerDsc, A396EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAGR");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmoddes.this.A396EmprCod;
      this.aP1[0] = pmoddes.this.AV16BarCod;
      this.aP2[0] = pmoddes.this.AV17BarCodReo;
      this.aP3[0] = pmoddes.this.AV18BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmoddes");
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
      P00GS2_A396EmprCod = new String[] {""} ;
      P00GS2_A130BarCodPar = new String[] {""} ;
      P00GS2_A132BarCodReo = new byte[1] ;
      P00GS2_A129BarCod = new int[1] ;
      P00GS2_A1652BarSerDsc = new String[] {""} ;
      A130BarCodPar = "" ;
      A1652BarSerDsc = "" ;
      AV15BarSerDsc = "" ;
      A1507BarAgrDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmoddes__default(),
         new Object[] {
             new Object[] {
            P00GS2_A396EmprCod, P00GS2_A130BarCodPar, P00GS2_A132BarCodReo, P00GS2_A129BarCod, P00GS2_A1652BarSerDsc
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17BarCodReo ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int AV16BarCod ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String AV18BarCodPar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A1652BarSerDsc ;
   private String AV15BarSerDsc ;
   private String A1507BarAgrDsc ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P00GS2_A396EmprCod ;
   private String[] P00GS2_A130BarCodPar ;
   private byte[] P00GS2_A132BarCodReo ;
   private int[] P00GS2_A129BarCod ;
   private String[] P00GS2_A1652BarSerDsc ;
}

final  class pmoddes__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00GS2", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarSerDsc FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00GS3", "UPDATE TXPBARAGR SET BarAgrDsc=?  WHERE EmprCod = ? and BarAgrCod = ? and BarAgrReo = ? and BarAgrPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARAGR")
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
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
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
               stmt.setString(1, (String)parms[0], 26);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

