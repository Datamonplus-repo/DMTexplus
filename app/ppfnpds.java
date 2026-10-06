package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppfnpds extends GXProcedure
{
   public ppfnpds( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppfnpds.class ), "" );
   }

   public ppfnpds( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 ,
                          String[] aP4 ,
                          short[] aP5 ,
                          String[] aP6 )
   {
      ppfnpds.this.aP7 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        String[] aP6 ,
                        int[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             String[] aP6 ,
                             int[] aP7 )
   {
      ppfnpds.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppfnpds.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      ppfnpds.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      ppfnpds.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      ppfnpds.this.A758ProCod = aP4[0];
      this.aP4 = aP4;
      ppfnpds.this.A194BarOrdLin = aP5[0];
      this.aP5 = aP5;
      ppfnpds.this.AV8Grupo = aP6[0];
      this.aP6 = aP6;
      ppfnpds.this.AV9Total_pdas = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9Total_pdas = 0 ;
      /* Optimized group. */
      /* Using cursor P028A2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), AV8Grupo});
      cV9Total_pdas = P028A2_AV9Total_pdas[0] ;
      pr_default.close(0);
      AV9Total_pdas = (int)(AV9Total_pdas+cV9Total_pdas*1) ;
      /* End optimized group. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppfnpds.this.A396EmprCod;
      this.aP1[0] = ppfnpds.this.A129BarCod;
      this.aP2[0] = ppfnpds.this.A132BarCodReo;
      this.aP3[0] = ppfnpds.this.A130BarCodPar;
      this.aP4[0] = ppfnpds.this.A758ProCod;
      this.aP5[0] = ppfnpds.this.A194BarOrdLin;
      this.aP6[0] = ppfnpds.this.AV8Grupo;
      this.aP7[0] = ppfnpds.this.AV9Total_pdas;
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
      P028A2_AV9Total_pdas = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppfnpds__default(),
         new Object[] {
             new Object[] {
            P028A2_AV9Total_pdas
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV9Total_pdas ;
   private int cV9Total_pdas ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String AV8Grupo ;
   private String scmdbuf ;
   private int[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private int[] P028A2_AV9Total_pdas ;
}

final  class ppfnpds__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P028A2", "SELECT COUNT(*) FROM TXPFASMAQ WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ?) AND (BarFasBot1 = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
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
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
      }
   }

}

