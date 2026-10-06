package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprevdltguias extends GXProcedure
{
   public pprevdltguias( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprevdltguias.class ), "" );
   }

   public pprevdltguias( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 )
   {
      pprevdltguias.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pprevdltguias.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprevdltguias.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pprevdltguias.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pprevdltguias.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pprevdltguias.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      pprevdltguias.this.Gx_mode = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8ALbfas = (byte)(0) ;
      /* Using cursor P04YV2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1240GuiFasLin = P04YV2_A1240GuiFasLin[0] ;
         AV8ALbfas = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV8ALbfas == 1 )
      {
      }
      AV8ALbfas = (byte)(0) ;
      /* Using cursor P04YV3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A1240GuiFasLin = P04YV3_A1240GuiFasLin[0] ;
         AV8ALbfas = (byte)(1) ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      AV10Modo = ((GXutil.strcmp(Gx_mode, httpContext.getMessage( "INS", ""))==0) ? httpContext.getMessage( "UPD", "") : Gx_mode) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprevdltguias.this.A396EmprCod;
      this.aP1[0] = pprevdltguias.this.A30AlbProCod;
      this.aP2[0] = pprevdltguias.this.A129BarCod;
      this.aP3[0] = pprevdltguias.this.A132BarCodReo;
      this.aP4[0] = pprevdltguias.this.A130BarCodPar;
      this.aP5[0] = pprevdltguias.this.Gx_mode;
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
      P04YV2_A396EmprCod = new String[] {""} ;
      P04YV2_A30AlbProCod = new long[1] ;
      P04YV2_A129BarCod = new int[1] ;
      P04YV2_A132BarCodReo = new byte[1] ;
      P04YV2_A130BarCodPar = new String[] {""} ;
      P04YV2_A1240GuiFasLin = new short[1] ;
      P04YV3_A396EmprCod = new String[] {""} ;
      P04YV3_A30AlbProCod = new long[1] ;
      P04YV3_A129BarCod = new int[1] ;
      P04YV3_A132BarCodReo = new byte[1] ;
      P04YV3_A130BarCodPar = new String[] {""} ;
      P04YV3_A1240GuiFasLin = new short[1] ;
      AV10Modo = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprevdltguias__default(),
         new Object[] {
             new Object[] {
            P04YV2_A396EmprCod, P04YV2_A30AlbProCod, P04YV2_A129BarCod, P04YV2_A132BarCodReo, P04YV2_A130BarCodPar, P04YV2_A1240GuiFasLin
            }
            , new Object[] {
            P04YV3_A396EmprCod, P04YV3_A30AlbProCod, P04YV3_A129BarCod, P04YV3_A132BarCodReo, P04YV3_A130BarCodPar, P04YV3_A1240GuiFasLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV8ALbfas ;
   private short A1240GuiFasLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private long A30AlbProCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String Gx_mode ;
   private String scmdbuf ;
   private String AV10Modo ;
   private String[] aP5 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P04YV2_A396EmprCod ;
   private long[] P04YV2_A30AlbProCod ;
   private int[] P04YV2_A129BarCod ;
   private byte[] P04YV2_A132BarCodReo ;
   private String[] P04YV2_A130BarCodPar ;
   private short[] P04YV2_A1240GuiFasLin ;
   private String[] P04YV3_A396EmprCod ;
   private long[] P04YV3_A30AlbProCod ;
   private int[] P04YV3_A129BarCod ;
   private byte[] P04YV3_A132BarCodReo ;
   private String[] P04YV3_A130BarCodPar ;
   private short[] P04YV3_A1240GuiFasLin ;
}

final  class pprevdltguias__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04YV2", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin FROM TXPALBFAS WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04YV3", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin FROM TXPALBFAS WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

