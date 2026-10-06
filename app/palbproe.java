package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class palbproe extends GXProcedure
{
   public palbproe( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( palbproe.class ), "" );
   }

   public palbproe( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 )
   {
      palbproe.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 )
   {
      palbproe.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      palbproe.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      palbproe.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      palbproe.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      palbproe.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01202 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A32AlbProEsp = P01202_A32AlbProEsp[0] ;
         if ( A32AlbProEsp < 10 )
         {
            A32AlbProEsp = (byte)(A32AlbProEsp+10) ;
         }
         /* Using cursor P01203 */
         pr_default.execute(1, new Object[] {Byte.valueOf(A32AlbProEsp), A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = palbproe.this.A396EmprCod;
      this.aP1[0] = palbproe.this.A30AlbProCod;
      this.aP2[0] = palbproe.this.A129BarCod;
      this.aP3[0] = palbproe.this.A132BarCodReo;
      this.aP4[0] = palbproe.this.A130BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "palbproe");
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
      P01202_A396EmprCod = new String[] {""} ;
      P01202_A30AlbProCod = new long[1] ;
      P01202_A129BarCod = new int[1] ;
      P01202_A132BarCodReo = new byte[1] ;
      P01202_A130BarCodPar = new String[] {""} ;
      P01202_A32AlbProEsp = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.palbproe__default(),
         new Object[] {
             new Object[] {
            P01202_A396EmprCod, P01202_A30AlbProCod, P01202_A129BarCod, P01202_A132BarCodReo, P01202_A130BarCodPar, P01202_A32AlbProEsp
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A32AlbProEsp ;
   private short Gx_err ;
   private int A129BarCod ;
   private long A30AlbProCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String[] aP4 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P01202_A396EmprCod ;
   private long[] P01202_A30AlbProCod ;
   private int[] P01202_A129BarCod ;
   private byte[] P01202_A132BarCodReo ;
   private String[] P01202_A130BarCodPar ;
   private byte[] P01202_A32AlbProEsp ;
}

final  class palbproe__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01202", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbProEsp FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01203", "UPDATE TXPALBBAR SET AlbProEsp=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 1 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
      }
   }

}

