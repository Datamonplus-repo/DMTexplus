package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pgserpar extends GXProcedure
{
   public pgserpar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pgserpar.class ), "" );
   }

   public pgserpar( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             short[] aP6 ,
                             String[] aP7 )
   {
      pgserpar.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        short[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             short[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 )
   {
      pgserpar.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pgserpar.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pgserpar.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pgserpar.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pgserpar.this.A758ProCod = aP4[0];
      this.aP4 = aP4;
      pgserpar.this.A457FasCod = aP5[0];
      this.aP5 = aP5;
      pgserpar.this.A1664ParFasCod = aP6[0];
      this.aP6 = aP6;
      pgserpar.this.AV11ParFasObs = aP7[0];
      this.aP7 = aP7;
      pgserpar.this.AV12ParFasVal = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00M02 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P00M02_A252CliCod[0] ;
         n252CliCod = P00M02_n252CliCod[0] ;
         A212BarSer = P00M02_A212BarSer[0] ;
         AV9vCliCod = A252CliCod ;
         AV8vArtCod = A212BarSer ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Optimized UPDATE. */
      /* Using cursor P00M03 */
      pr_default.execute(1, new Object[] {AV12ParFasVal, AV11ParFasObs, A396EmprCod, Integer.valueOf(AV9vCliCod), AV8vArtCod, A758ProCod, A457FasCod, Short.valueOf(A1664ParFasCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPSERPAR");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pgserpar.this.A396EmprCod;
      this.aP1[0] = pgserpar.this.A129BarCod;
      this.aP2[0] = pgserpar.this.A132BarCodReo;
      this.aP3[0] = pgserpar.this.A130BarCodPar;
      this.aP4[0] = pgserpar.this.A758ProCod;
      this.aP5[0] = pgserpar.this.A457FasCod;
      this.aP6[0] = pgserpar.this.A1664ParFasCod;
      this.aP7[0] = pgserpar.this.AV11ParFasObs;
      this.aP8[0] = pgserpar.this.AV12ParFasVal;
      Application.commitDataStores(context, remoteHandle, pr_default, "pgserpar");
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
      P00M02_A396EmprCod = new String[] {""} ;
      P00M02_A129BarCod = new int[1] ;
      P00M02_A132BarCodReo = new byte[1] ;
      P00M02_A130BarCodPar = new String[] {""} ;
      P00M02_A252CliCod = new int[1] ;
      P00M02_n252CliCod = new boolean[] {false} ;
      P00M02_A212BarSer = new String[] {""} ;
      A212BarSer = "" ;
      AV8vArtCod = "" ;
      A1668ParFasVal = "" ;
      A1673ParFasObs = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pgserpar__default(),
         new Object[] {
             new Object[] {
            P00M02_A396EmprCod, P00M02_A129BarCod, P00M02_A132BarCodReo, P00M02_A130BarCodPar, P00M02_A252CliCod, P00M02_n252CliCod, P00M02_A212BarSer
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A1664ParFasCod ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int AV9vCliCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String A457FasCod ;
   private String AV11ParFasObs ;
   private String AV12ParFasVal ;
   private String scmdbuf ;
   private String A212BarSer ;
   private String AV8vArtCod ;
   private String A1668ParFasVal ;
   private String A1673ParFasObs ;
   private boolean n252CliCod ;
   private String[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private short[] aP6 ;
   private String[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P00M02_A396EmprCod ;
   private int[] P00M02_A129BarCod ;
   private byte[] P00M02_A132BarCodReo ;
   private String[] P00M02_A130BarCodPar ;
   private int[] P00M02_A252CliCod ;
   private boolean[] P00M02_n252CliCod ;
   private String[] P00M02_A212BarSer ;
}

final  class pgserpar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00M02", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, CliCod, BarSer FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00M03", "UPDATE TXPSERPAR SET ParFasVal=?, ParFasObs=?  WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCod = ? and ParFasCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPSERPAR")
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
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
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
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 60);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 16);
               stmt.setString(6, (String)parms[5], 8);
               stmt.setString(7, (String)parms[6], 8);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
      }
   }

}

