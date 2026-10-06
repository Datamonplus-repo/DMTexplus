package app.pedidosclientesindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class getbarordlinultimo extends GXProcedure
{
   public getbarordlinultimo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( getbarordlinultimo.class ), "" );
   }

   public getbarordlinultimo( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            int aP1 ,
                            byte aP2 ,
                            String aP3 ,
                            String aP4 )
   {
      getbarordlinultimo.this.aP5 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        String aP4 ,
                        short[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             String aP4 ,
                             short[] aP5 )
   {
      getbarordlinultimo.this.AV13emprcod = aP0;
      getbarordlinultimo.this.AV8barcod = aP1;
      getbarordlinultimo.this.AV9barcodreo = aP2;
      getbarordlinultimo.this.AV10barcodpar = aP3;
      getbarordlinultimo.this.AV11Procod = aP4;
      getbarordlinultimo.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12Barordlin = (short)(0) ;
      /* Using cursor P0AGR2 */
      pr_default.execute(0, new Object[] {AV13emprcod, Integer.valueOf(AV8barcod), Byte.valueOf(AV9barcodreo), AV10barcodpar, AV11Procod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P0AGR2_A396EmprCod[0] ;
         A129BarCod = P0AGR2_A129BarCod[0] ;
         A132BarCodReo = P0AGR2_A132BarCodReo[0] ;
         A130BarCodPar = P0AGR2_A130BarCodPar[0] ;
         A758ProCod = P0AGR2_A758ProCod[0] ;
         A194BarOrdLin = P0AGR2_A194BarOrdLin[0] ;
         AV12Barordlin = A194BarOrdLin ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV12Barordlin = (short)(AV12Barordlin+100) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = getbarordlinultimo.this.AV12Barordlin;
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
      P0AGR2_A396EmprCod = new String[] {""} ;
      P0AGR2_A129BarCod = new int[1] ;
      P0AGR2_A132BarCodReo = new byte[1] ;
      P0AGR2_A130BarCodPar = new String[] {""} ;
      P0AGR2_A758ProCod = new String[] {""} ;
      P0AGR2_A194BarOrdLin = new short[1] ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A758ProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.getbarordlinultimo__default(),
         new Object[] {
             new Object[] {
            P0AGR2_A396EmprCod, P0AGR2_A129BarCod, P0AGR2_A132BarCodReo, P0AGR2_A130BarCodPar, P0AGR2_A758ProCod, P0AGR2_A194BarOrdLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9barcodreo ;
   private byte A132BarCodReo ;
   private short AV12Barordlin ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int AV8barcod ;
   private int A129BarCod ;
   private String AV13emprcod ;
   private String AV10barcodpar ;
   private String AV11Procod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private short[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AGR2_A396EmprCod ;
   private int[] P0AGR2_A129BarCod ;
   private byte[] P0AGR2_A132BarCodReo ;
   private String[] P0AGR2_A130BarCodPar ;
   private String[] P0AGR2_A758ProCod ;
   private short[] P0AGR2_A194BarOrdLin ;
}

final  class getbarordlinultimo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AGR2", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
      }
   }

}

