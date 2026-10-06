package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class cpcc01 extends GXProcedure
{
   public cpcc01( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cpcc01.class ), "" );
   }

   public cpcc01( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String aP0 ,
                           int aP1 ,
                           byte aP2 ,
                           String aP3 ,
                           String aP4 ,
                           short aP5 ,
                           int aP6 )
   {
      cpcc01.this.aP7 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        String aP4 ,
                        short aP5 ,
                        int aP6 ,
                        byte[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             String aP4 ,
                             short aP5 ,
                             int aP6 ,
                             byte[] aP7 )
   {
      cpcc01.this.AV8EmprCod = aP0;
      cpcc01.this.AV9BarcodIN = aP1;
      cpcc01.this.AV10BarcodreoIN = aP2;
      cpcc01.this.AV11BarCodParIn = aP3;
      cpcc01.this.AV12ProCod = aP4;
      cpcc01.this.AV13BarOrdLin = aP5;
      cpcc01.this.AV14CctCod = aP6;
      cpcc01.this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15flag = (byte)(0) ;
      /* Using cursor P09UH2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4031CCTCod = P09UH2_A4031CCTCod[0] ;
         A194BarOrdLin = P09UH2_A194BarOrdLin[0] ;
         A758ProCod = P09UH2_A758ProCod[0] ;
         A130BarCodPar = P09UH2_A130BarCodPar[0] ;
         A132BarCodReo = P09UH2_A132BarCodReo[0] ;
         A129BarCod = P09UH2_A129BarCod[0] ;
         A396EmprCod = P09UH2_A396EmprCod[0] ;
         AV15flag = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP7[0] = cpcc01.this.AV15flag;
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
      P09UH2_A4031CCTCod = new int[1] ;
      P09UH2_A194BarOrdLin = new short[1] ;
      P09UH2_A758ProCod = new String[] {""} ;
      P09UH2_A130BarCodPar = new String[] {""} ;
      P09UH2_A132BarCodReo = new byte[1] ;
      P09UH2_A129BarCod = new int[1] ;
      P09UH2_A396EmprCod = new String[] {""} ;
      A758ProCod = "" ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.cpcc01__default(),
         new Object[] {
             new Object[] {
            P09UH2_A4031CCTCod, P09UH2_A194BarOrdLin, P09UH2_A758ProCod, P09UH2_A130BarCodPar, P09UH2_A132BarCodReo, P09UH2_A129BarCod, P09UH2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10BarcodreoIN ;
   private byte AV15flag ;
   private byte A132BarCodReo ;
   private short AV13BarOrdLin ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int AV9BarcodIN ;
   private int AV14CctCod ;
   private int A4031CCTCod ;
   private int A129BarCod ;
   private String AV8EmprCod ;
   private String AV11BarCodParIn ;
   private String AV12ProCod ;
   private String scmdbuf ;
   private String A758ProCod ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private byte[] aP7 ;
   private IDataStoreProvider pr_default ;
   private int[] P09UH2_A4031CCTCod ;
   private short[] P09UH2_A194BarOrdLin ;
   private String[] P09UH2_A758ProCod ;
   private String[] P09UH2_A130BarCodPar ;
   private byte[] P09UH2_A132BarCodReo ;
   private int[] P09UH2_A129BarCod ;
   private String[] P09UH2_A396EmprCod ;
}

final  class cpcc01__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09UH2", "SELECT CCTCod, BarOrdLin, ProCod, BarCodPar, BarCodReo, BarCod, EmprCod FROM TXPCC ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

