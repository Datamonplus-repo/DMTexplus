package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprimcol extends GXProcedure
{
   public pprimcol( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprimcol.class ), "" );
   }

   public pprimcol( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             int[] aP6 ,
                             byte[] aP7 )
   {
      pprimcol.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        int[] aP6 ,
                        byte[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             int[] aP6 ,
                             byte[] aP7 ,
                             String[] aP8 )
   {
      pprimcol.this.AV17EmprCod = aP0[0];
      this.aP0 = aP0;
      pprimcol.this.AV9CliCod = aP1[0];
      this.aP1 = aP1;
      pprimcol.this.AV12Forser = aP2[0];
      this.aP2 = aP2;
      pprimcol.this.AV10Forcolnom = aP3[0];
      this.aP3 = aP3;
      pprimcol.this.AV11ForColNum = aP4[0];
      this.aP4 = aP4;
      pprimcol.this.AV13TipColCod = aP5[0];
      this.aP5 = aP5;
      pprimcol.this.AV14BarCod = aP6[0];
      this.aP6 = aP6;
      pprimcol.this.AV15BarCodReo = aP7[0];
      this.aP7 = aP7;
      pprimcol.this.AV16BarCodPar = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02KS2 */
      pr_default.execute(0, new Object[] {AV17EmprCod, Integer.valueOf(AV9CliCod), AV12Forser, AV10Forcolnom, Integer.valueOf(AV11ForColNum), Byte.valueOf(AV13TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A831TipColCod = P02KS2_A831TipColCod[0] ;
         A483ForColNum = P02KS2_A483ForColNum[0] ;
         A482ForColNom = P02KS2_A482ForColNom[0] ;
         A494ForSer = P02KS2_A494ForSer[0] ;
         A252CliCod = P02KS2_A252CliCod[0] ;
         A396EmprCod = P02KS2_A396EmprCod[0] ;
         A129BarCod = P02KS2_A129BarCod[0] ;
         n129BarCod = P02KS2_n129BarCod[0] ;
         A132BarCodReo = P02KS2_A132BarCodReo[0] ;
         n132BarCodReo = P02KS2_n132BarCodReo[0] ;
         A130BarCodPar = P02KS2_A130BarCodPar[0] ;
         n130BarCodPar = P02KS2_n130BarCodPar[0] ;
         if ( A129BarCod == 0 )
         {
            A129BarCod = AV14BarCod ;
            n129BarCod = false ;
            A132BarCodReo = AV15BarCodReo ;
            n132BarCodReo = false ;
            A130BarCodPar = AV16BarCodPar ;
            n130BarCodPar = false ;
         }
         /* Using cursor P02KS3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprimcol.this.AV17EmprCod;
      this.aP1[0] = pprimcol.this.AV9CliCod;
      this.aP2[0] = pprimcol.this.AV12Forser;
      this.aP3[0] = pprimcol.this.AV10Forcolnom;
      this.aP4[0] = pprimcol.this.AV11ForColNum;
      this.aP5[0] = pprimcol.this.AV13TipColCod;
      this.aP6[0] = pprimcol.this.AV14BarCod;
      this.aP7[0] = pprimcol.this.AV15BarCodReo;
      this.aP8[0] = pprimcol.this.AV16BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pprimcol");
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
      P02KS2_A831TipColCod = new byte[1] ;
      P02KS2_A483ForColNum = new int[1] ;
      P02KS2_A482ForColNom = new String[] {""} ;
      P02KS2_A494ForSer = new String[] {""} ;
      P02KS2_A252CliCod = new int[1] ;
      P02KS2_A396EmprCod = new String[] {""} ;
      P02KS2_A129BarCod = new int[1] ;
      P02KS2_n129BarCod = new boolean[] {false} ;
      P02KS2_A132BarCodReo = new byte[1] ;
      P02KS2_n132BarCodReo = new boolean[] {false} ;
      P02KS2_A130BarCodPar = new String[] {""} ;
      P02KS2_n130BarCodPar = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprimcol__default(),
         new Object[] {
             new Object[] {
            P02KS2_A831TipColCod, P02KS2_A483ForColNum, P02KS2_A482ForColNom, P02KS2_A494ForSer, P02KS2_A252CliCod, P02KS2_A396EmprCod, P02KS2_A129BarCod, P02KS2_n129BarCod, P02KS2_A132BarCodReo, P02KS2_n132BarCodReo,
            P02KS2_A130BarCodPar, P02KS2_n130BarCodPar
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13TipColCod ;
   private byte AV15BarCodReo ;
   private byte A831TipColCod ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int AV9CliCod ;
   private int AV11ForColNum ;
   private int AV14BarCod ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private int A129BarCod ;
   private String AV17EmprCod ;
   private String AV12Forser ;
   private String AV10Forcolnom ;
   private String AV16BarCodPar ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private String[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private int[] aP6 ;
   private byte[] aP7 ;
   private IDataStoreProvider pr_default ;
   private byte[] P02KS2_A831TipColCod ;
   private int[] P02KS2_A483ForColNum ;
   private String[] P02KS2_A482ForColNom ;
   private String[] P02KS2_A494ForSer ;
   private int[] P02KS2_A252CliCod ;
   private String[] P02KS2_A396EmprCod ;
   private int[] P02KS2_A129BarCod ;
   private boolean[] P02KS2_n129BarCod ;
   private byte[] P02KS2_A132BarCodReo ;
   private boolean[] P02KS2_n132BarCodReo ;
   private String[] P02KS2_A130BarCodPar ;
   private boolean[] P02KS2_n130BarCodPar ;
}

final  class pprimcol__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02KS2", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02KS3", "UPDATE TXPCFORMU SET BarCod=?, BarCodReo=?, BarCodPar=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFORMU")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[3]).byteValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 1);
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setInt(5, ((Number) parms[7]).intValue());
               stmt.setString(6, (String)parms[8], 16);
               stmt.setString(7, (String)parms[9], 13);
               stmt.setInt(8, ((Number) parms[10]).intValue());
               stmt.setByte(9, ((Number) parms[11]).byteValue());
               return;
      }
   }

}

