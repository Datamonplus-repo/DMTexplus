package app.trabajosexternos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexorden extends GXProcedure
{
   public pexorden( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexorden.class ), "" );
   }

   public pexorden( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 )
   {
      pexorden.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 )
   {
      pexorden.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pexorden.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pexorden.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pexorden.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pexorden.this.A194BarOrdLin = aP4[0];
      this.aP4 = aP4;
      pexorden.this.Gx_msg = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = "" ;
      AV5GXLvl2 = (byte)(0) ;
      /* Using cursor P0ABP2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A194BarOrdLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A758ProCod = P0ABP2_A758ProCod[0] ;
         AV5GXLvl2 = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV5GXLvl2 == 0 )
      {
         Gx_msg = httpContext.getMessage( "Error. NO existe el N Orden introducido", "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pexorden.this.A396EmprCod;
      this.aP1[0] = pexorden.this.A129BarCod;
      this.aP2[0] = pexorden.this.A132BarCodReo;
      this.aP3[0] = pexorden.this.A130BarCodPar;
      this.aP4[0] = pexorden.this.A194BarOrdLin;
      this.aP5[0] = pexorden.this.Gx_msg;
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
      P0ABP2_A396EmprCod = new String[] {""} ;
      P0ABP2_A129BarCod = new int[1] ;
      P0ABP2_A132BarCodReo = new byte[1] ;
      P0ABP2_A130BarCodPar = new String[] {""} ;
      P0ABP2_A194BarOrdLin = new short[1] ;
      P0ABP2_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.pexorden__default(),
         new Object[] {
             new Object[] {
            P0ABP2_A396EmprCod, P0ABP2_A129BarCod, P0ABP2_A132BarCodReo, P0ABP2_A130BarCodPar, P0ABP2_A194BarOrdLin, P0ABP2_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV5GXLvl2 ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A758ProCod ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ABP2_A396EmprCod ;
   private int[] P0ABP2_A129BarCod ;
   private byte[] P0ABP2_A132BarCodReo ;
   private String[] P0ABP2_A130BarCodPar ;
   private short[] P0ABP2_A194BarOrdLin ;
   private String[] P0ABP2_A758ProCod ;
}

final  class pexorden__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ABP2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

