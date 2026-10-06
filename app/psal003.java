package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psal003 extends GXProcedure
{
   public psal003( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psal003.class ), "" );
   }

   public psal003( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           String[] aP4 )
   {
      psal003.this.aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 )
   {
      psal003.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      psal003.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      psal003.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      psal003.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      psal003.this.Gx_msg = aP4[0];
      this.aP4 = aP4;
      psal003.this.AV9Flag = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = " " ;
      AV9Flag = (byte)(0) ;
      /* Using cursor P03TI2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A457FasCod = P03TI2_A457FasCod[0] ;
         A153BarFasEst = P03TI2_A153BarFasEst[0] ;
         A152BarFasCon = P03TI2_A152BarFasCon[0] ;
         A460FasDsc = P03TI2_A460FasDsc[0] ;
         A194BarOrdLin = P03TI2_A194BarOrdLin[0] ;
         A758ProCod = P03TI2_A758ProCod[0] ;
         A460FasDsc = P03TI2_A460FasDsc[0] ;
         if ( ( GXutil.strcmp(A152BarFasCon, httpContext.getMessage( "S", "")) == 0 ) && ( A153BarFasEst != 2 ) )
         {
            Gx_msg = httpContext.getMessage( "Faltan Fases por FINALIZAR, ", "") + GXutil.trim( A460FasDsc) ;
            AV9Flag = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ( GXutil.strcmp(A152BarFasCon, httpContext.getMessage( "S", "")) == 0 ) && ( A153BarFasEst == 2 ) )
         {
            Gx_msg = httpContext.getMessage( "Fases FINALIZADAS", "") ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = psal003.this.A396EmprCod;
      this.aP1[0] = psal003.this.A129BarCod;
      this.aP2[0] = psal003.this.A132BarCodReo;
      this.aP3[0] = psal003.this.A130BarCodPar;
      this.aP4[0] = psal003.this.Gx_msg;
      this.aP5[0] = psal003.this.AV9Flag;
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
      P03TI2_A457FasCod = new String[] {""} ;
      P03TI2_A396EmprCod = new String[] {""} ;
      P03TI2_A129BarCod = new int[1] ;
      P03TI2_A132BarCodReo = new byte[1] ;
      P03TI2_A130BarCodPar = new String[] {""} ;
      P03TI2_A153BarFasEst = new byte[1] ;
      P03TI2_A152BarFasCon = new String[] {""} ;
      P03TI2_A460FasDsc = new String[] {""} ;
      P03TI2_A194BarOrdLin = new short[1] ;
      P03TI2_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A152BarFasCon = "" ;
      A460FasDsc = "" ;
      A758ProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.psal003__default(),
         new Object[] {
             new Object[] {
            P03TI2_A457FasCod, P03TI2_A396EmprCod, P03TI2_A129BarCod, P03TI2_A132BarCodReo, P03TI2_A130BarCodPar, P03TI2_A153BarFasEst, P03TI2_A152BarFasCon, P03TI2_A460FasDsc, P03TI2_A194BarOrdLin, P03TI2_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV9Flag ;
   private byte A153BarFasEst ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A152BarFasCon ;
   private String A460FasDsc ;
   private String A758ProCod ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P03TI2_A457FasCod ;
   private String[] P03TI2_A396EmprCod ;
   private int[] P03TI2_A129BarCod ;
   private byte[] P03TI2_A132BarCodReo ;
   private String[] P03TI2_A130BarCodPar ;
   private byte[] P03TI2_A153BarFasEst ;
   private String[] P03TI2_A152BarFasCon ;
   private String[] P03TI2_A460FasDsc ;
   private short[] P03TI2_A194BarOrdLin ;
   private String[] P03TI2_A758ProCod ;
}

final  class psal003__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03TI2", "SELECT T1.FasCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasEst, T1.BarFasCon, T2.FasDsc, T1.BarOrdLin, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin DESC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 28);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
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
      }
   }

}

