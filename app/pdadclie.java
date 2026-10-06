package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdadclie extends GXProcedure
{
   public pdadclie( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdadclie.class ), "" );
   }

   public pdadclie( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 )
   {
      pdadclie.this.aP9 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 )
   {
      pdadclie.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdadclie.this.AV12CliCod = aP1[0];
      this.aP1 = aP1;
      pdadclie.this.AV22CliEnvlin = aP2[0];
      this.aP2 = aP2;
      pdadclie.this.AV13CliENom = aP3[0];
      this.aP3 = aP3;
      pdadclie.this.AV14CliEDom = aP4[0];
      this.aP4 = aP4;
      pdadclie.this.AV15CliECp = aP5[0];
      this.aP5 = aP5;
      pdadclie.this.AV21CliEPob = aP6[0];
      this.aP6 = aP6;
      pdadclie.this.AV19CliEPrv = aP7[0];
      this.aP7 = aP7;
      pdadclie.this.AV23ClienvNm2 = aP8[0];
      this.aP8 = aP8;
      pdadclie.this.AV24Clienvdm2 = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV20CliEnv = (byte)(GXutil.lval( AV22CliEnvlin)) ;
      AV13CliENom = "" ;
      AV14CliEDom = "" ;
      AV15CliECp = "" ;
      AV21CliEPob = "" ;
      AV19CliEPrv = "" ;
      AV24Clienvdm2 = " " ;
      AV23ClienvNm2 = " " ;
      /* Using cursor P03YM2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV12CliCod), Byte.valueOf(AV20CliEnv)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A266CliEnvLin = P03YM2_A266CliEnvLin[0] ;
         A252CliCod = P03YM2_A252CliCod[0] ;
         A267CliEnvNom = P03YM2_A267CliEnvNom[0] ;
         A5531CliEnvNm2 = P03YM2_A5531CliEnvNm2[0] ;
         A265CliEnvDom = P03YM2_A265CliEnvDom[0] ;
         A5530CliEnvDm2 = P03YM2_A5530CliEnvDm2[0] ;
         A264CliEnvCp = P03YM2_A264CliEnvCp[0] ;
         A268CliEnvPob = P03YM2_A268CliEnvPob[0] ;
         A270CliEnvPrv = P03YM2_A270CliEnvPrv[0] ;
         AV13CliENom = A267CliEnvNom ;
         AV23ClienvNm2 = A5531CliEnvNm2 ;
         AV14CliEDom = A265CliEnvDom ;
         AV24Clienvdm2 = A5530CliEnvDm2 ;
         AV15CliECp = A264CliEnvCp ;
         AV21CliEPob = A268CliEnvPob ;
         AV16CodPrv = A270CliEnvPrv ;
         /* Execute user subroutine: 'PROVIN' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'PROVIN' Routine */
      returnInSub = false ;
      /* Using cursor P03YM3 */
      pr_default.execute(1, new Object[] {Short.valueOf(AV16CodPrv)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A781PrvCod = P03YM3_A781PrvCod[0] ;
         A787PrvDsc = P03YM3_A787PrvDsc[0] ;
         n787PrvDsc = P03YM3_n787PrvDsc[0] ;
         AV19CliEPrv = A787PrvDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdadclie.this.A396EmprCod;
      this.aP1[0] = pdadclie.this.AV12CliCod;
      this.aP2[0] = pdadclie.this.AV22CliEnvlin;
      this.aP3[0] = pdadclie.this.AV13CliENom;
      this.aP4[0] = pdadclie.this.AV14CliEDom;
      this.aP5[0] = pdadclie.this.AV15CliECp;
      this.aP6[0] = pdadclie.this.AV21CliEPob;
      this.aP7[0] = pdadclie.this.AV19CliEPrv;
      this.aP8[0] = pdadclie.this.AV23ClienvNm2;
      this.aP9[0] = pdadclie.this.AV24Clienvdm2;
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
      P03YM2_A396EmprCod = new String[] {""} ;
      P03YM2_A266CliEnvLin = new byte[1] ;
      P03YM2_A252CliCod = new int[1] ;
      P03YM2_A267CliEnvNom = new String[] {""} ;
      P03YM2_A5531CliEnvNm2 = new String[] {""} ;
      P03YM2_A265CliEnvDom = new String[] {""} ;
      P03YM2_A5530CliEnvDm2 = new String[] {""} ;
      P03YM2_A264CliEnvCp = new String[] {""} ;
      P03YM2_A268CliEnvPob = new String[] {""} ;
      P03YM2_A270CliEnvPrv = new short[1] ;
      A267CliEnvNom = "" ;
      A5531CliEnvNm2 = "" ;
      A265CliEnvDom = "" ;
      A5530CliEnvDm2 = "" ;
      A264CliEnvCp = "" ;
      A268CliEnvPob = "" ;
      P03YM3_A781PrvCod = new short[1] ;
      P03YM3_A787PrvDsc = new String[] {""} ;
      P03YM3_n787PrvDsc = new boolean[] {false} ;
      A787PrvDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdadclie__default(),
         new Object[] {
             new Object[] {
            P03YM2_A396EmprCod, P03YM2_A266CliEnvLin, P03YM2_A252CliCod, P03YM2_A267CliEnvNom, P03YM2_A5531CliEnvNm2, P03YM2_A265CliEnvDom, P03YM2_A5530CliEnvDm2, P03YM2_A264CliEnvCp, P03YM2_A268CliEnvPob, P03YM2_A270CliEnvPrv
            }
            , new Object[] {
            P03YM3_A781PrvCod, P03YM3_A787PrvDsc, P03YM3_n787PrvDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV20CliEnv ;
   private byte A266CliEnvLin ;
   private short A270CliEnvPrv ;
   private short AV16CodPrv ;
   private short A781PrvCod ;
   private short Gx_err ;
   private int AV12CliCod ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String AV22CliEnvlin ;
   private String AV13CliENom ;
   private String AV14CliEDom ;
   private String AV15CliECp ;
   private String AV21CliEPob ;
   private String AV19CliEPrv ;
   private String AV23ClienvNm2 ;
   private String AV24Clienvdm2 ;
   private String scmdbuf ;
   private String A267CliEnvNom ;
   private String A5531CliEnvNm2 ;
   private String A265CliEnvDom ;
   private String A5530CliEnvDm2 ;
   private String A264CliEnvCp ;
   private String A268CliEnvPob ;
   private String A787PrvDsc ;
   private boolean returnInSub ;
   private boolean n787PrvDsc ;
   private String[] aP9 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P03YM2_A396EmprCod ;
   private byte[] P03YM2_A266CliEnvLin ;
   private int[] P03YM2_A252CliCod ;
   private String[] P03YM2_A267CliEnvNom ;
   private String[] P03YM2_A5531CliEnvNm2 ;
   private String[] P03YM2_A265CliEnvDom ;
   private String[] P03YM2_A5530CliEnvDm2 ;
   private String[] P03YM2_A264CliEnvCp ;
   private String[] P03YM2_A268CliEnvPob ;
   private short[] P03YM2_A270CliEnvPrv ;
   private short[] P03YM3_A781PrvCod ;
   private String[] P03YM3_A787PrvDsc ;
   private boolean[] P03YM3_n787PrvDsc ;
}

final  class pdadclie__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03YM2", "SELECT EmprCod, CliEnvLin, CliCod, CliEnvNom, CliEnvNm2, CliEnvDom, CliEnvDm2, CliEnvCp, CliEnvPob, CliEnvPrv FROM TXPCLIENV WHERE EmprCod = ? and CliCod = ? and CliEnvLin = ? ORDER BY EmprCod, CliCod, CliEnvLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03YM3", "SELECT PrvCod, PrvDsc FROM TXPPROVIN WHERE PrvCod = ? ORDER BY PrvCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 34);
               ((String[]) buf[6])[0] = rslt.getString(7, 34);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
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
               return;
            case 1 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
      }
   }

}

