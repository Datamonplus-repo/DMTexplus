package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfserpar extends GXProcedure
{
   public pfserpar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfserpar.class ), "" );
   }

   public pfserpar( int remoteHandle ,
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
      pfserpar.this.aP8 = new String[] {""};
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
      pfserpar.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfserpar.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pfserpar.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pfserpar.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pfserpar.this.A758ProCod = aP4[0];
      this.aP4 = aP4;
      pfserpar.this.A457FasCod = aP5[0];
      this.aP5 = aP5;
      pfserpar.this.A1664ParFasCod = aP6[0];
      this.aP6 = aP6;
      pfserpar.this.AV11ParFasObs = aP7[0];
      this.aP7 = aP7;
      pfserpar.this.AV12ParFasVal = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00LX2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P00LX2_A252CliCod[0] ;
         n252CliCod = P00LX2_n252CliCod[0] ;
         A212BarSer = P00LX2_A212BarSer[0] ;
         AV9vCliCod = A252CliCod ;
         AV8vArtCod = A212BarSer ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P00LX3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV9vCliCod), AV8vArtCod, A758ProCod, A457FasCod, Short.valueOf(A1664ParFasCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A65ArtCod = P00LX3_A65ArtCod[0] ;
         A252CliCod = P00LX3_A252CliCod[0] ;
         n252CliCod = P00LX3_n252CliCod[0] ;
         A1673ParFasObs = P00LX3_A1673ParFasObs[0] ;
         A1668ParFasVal = P00LX3_A1668ParFasVal[0] ;
         AV11ParFasObs = A1673ParFasObs ;
         AV12ParFasVal = A1668ParFasVal ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfserpar.this.A396EmprCod;
      this.aP1[0] = pfserpar.this.A129BarCod;
      this.aP2[0] = pfserpar.this.A132BarCodReo;
      this.aP3[0] = pfserpar.this.A130BarCodPar;
      this.aP4[0] = pfserpar.this.A758ProCod;
      this.aP5[0] = pfserpar.this.A457FasCod;
      this.aP6[0] = pfserpar.this.A1664ParFasCod;
      this.aP7[0] = pfserpar.this.AV11ParFasObs;
      this.aP8[0] = pfserpar.this.AV12ParFasVal;
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
      P00LX2_A396EmprCod = new String[] {""} ;
      P00LX2_A129BarCod = new int[1] ;
      P00LX2_A132BarCodReo = new byte[1] ;
      P00LX2_A130BarCodPar = new String[] {""} ;
      P00LX2_A252CliCod = new int[1] ;
      P00LX2_n252CliCod = new boolean[] {false} ;
      P00LX2_A212BarSer = new String[] {""} ;
      A212BarSer = "" ;
      AV8vArtCod = "" ;
      P00LX3_A396EmprCod = new String[] {""} ;
      P00LX3_A758ProCod = new String[] {""} ;
      P00LX3_A457FasCod = new String[] {""} ;
      P00LX3_A1664ParFasCod = new short[1] ;
      P00LX3_A65ArtCod = new String[] {""} ;
      P00LX3_A252CliCod = new int[1] ;
      P00LX3_n252CliCod = new boolean[] {false} ;
      P00LX3_A1673ParFasObs = new String[] {""} ;
      P00LX3_A1668ParFasVal = new String[] {""} ;
      A65ArtCod = "" ;
      A1673ParFasObs = "" ;
      A1668ParFasVal = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfserpar__default(),
         new Object[] {
             new Object[] {
            P00LX2_A396EmprCod, P00LX2_A129BarCod, P00LX2_A132BarCodReo, P00LX2_A130BarCodPar, P00LX2_A252CliCod, P00LX2_n252CliCod, P00LX2_A212BarSer
            }
            , new Object[] {
            P00LX3_A396EmprCod, P00LX3_A758ProCod, P00LX3_A457FasCod, P00LX3_A1664ParFasCod, P00LX3_A65ArtCod, P00LX3_A252CliCod, P00LX3_A1673ParFasObs, P00LX3_A1668ParFasVal
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
   private String A65ArtCod ;
   private String A1673ParFasObs ;
   private String A1668ParFasVal ;
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
   private String[] P00LX2_A396EmprCod ;
   private int[] P00LX2_A129BarCod ;
   private byte[] P00LX2_A132BarCodReo ;
   private String[] P00LX2_A130BarCodPar ;
   private int[] P00LX2_A252CliCod ;
   private boolean[] P00LX2_n252CliCod ;
   private String[] P00LX2_A212BarSer ;
   private String[] P00LX3_A396EmprCod ;
   private String[] P00LX3_A758ProCod ;
   private String[] P00LX3_A457FasCod ;
   private short[] P00LX3_A1664ParFasCod ;
   private String[] P00LX3_A65ArtCod ;
   private int[] P00LX3_A252CliCod ;
   private boolean[] P00LX3_n252CliCod ;
   private String[] P00LX3_A1673ParFasObs ;
   private String[] P00LX3_A1668ParFasVal ;
}

final  class pfserpar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00LX2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, CliCod, BarSer FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00LX3", "SELECT EmprCod, ProCod, FasCod, ParFasCod, ArtCod, CliCod, ParFasObs, ParFasVal FROM TXPSERPAR WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCod = ? and ParFasCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCod, ParFasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 60);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
      }
   }

}

