package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusag3 extends GXProcedure
{
   public pbusag3( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusag3.class ), "" );
   }

   public pbusag3( int remoteHandle ,
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
                             short[] aP5 ,
                             String[] aP6 ,
                             byte[] aP7 )
   {
      pbusag3.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        String[] aP6 ,
                        byte[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             String[] aP6 ,
                             byte[] aP7 ,
                             String[] aP8 )
   {
      pbusag3.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbusag3.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pbusag3.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pbusag3.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pbusag3.this.AV15MaqCod = aP4[0];
      this.aP4 = aP4;
      pbusag3.this.AV16OrdLinAnt = aP5[0];
      this.aP5 = aP5;
      pbusag3.this.AV17FasCodAnt = aP6[0];
      this.aP6 = aP6;
      pbusag3.this.AV18FlagMFas = aP7[0];
      this.aP7 = aP7;
      pbusag3.this.AV19IniProd = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16OrdLinAnt = (short)(0) ;
      AV17FasCodAnt = "" ;
      AV18FlagMFas = (byte)(0) ;
      /* Using cursor P01IJ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A457FasCod = P01IJ2_A457FasCod[0] ;
         A153BarFasEst = P01IJ2_A153BarFasEst[0] ;
         A194BarOrdLin = P01IJ2_A194BarOrdLin[0] ;
         A758ProCod = P01IJ2_A758ProCod[0] ;
         /* Using cursor P01IJ3 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV15MaqCod, A457FasCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1142MaqFCod = P01IJ3_A1142MaqFCod[0] ;
            A602MaqCod = P01IJ3_A602MaqCod[0] ;
            AV18FlagMFas = (byte)(1) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         if ( AV18FlagMFas == 1 )
         {
            AV16OrdLinAnt = A194BarOrdLin ;
            AV17FasCodAnt = A457FasCod ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbusag3.this.A396EmprCod;
      this.aP1[0] = pbusag3.this.A129BarCod;
      this.aP2[0] = pbusag3.this.A132BarCodReo;
      this.aP3[0] = pbusag3.this.A130BarCodPar;
      this.aP4[0] = pbusag3.this.AV15MaqCod;
      this.aP5[0] = pbusag3.this.AV16OrdLinAnt;
      this.aP6[0] = pbusag3.this.AV17FasCodAnt;
      this.aP7[0] = pbusag3.this.AV18FlagMFas;
      this.aP8[0] = pbusag3.this.AV19IniProd;
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
      P01IJ2_A396EmprCod = new String[] {""} ;
      P01IJ2_A129BarCod = new int[1] ;
      P01IJ2_A132BarCodReo = new byte[1] ;
      P01IJ2_A130BarCodPar = new String[] {""} ;
      P01IJ2_A457FasCod = new String[] {""} ;
      P01IJ2_A153BarFasEst = new byte[1] ;
      P01IJ2_A194BarOrdLin = new short[1] ;
      P01IJ2_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      P01IJ3_A396EmprCod = new String[] {""} ;
      P01IJ3_A1142MaqFCod = new String[] {""} ;
      P01IJ3_A602MaqCod = new String[] {""} ;
      A1142MaqFCod = "" ;
      A602MaqCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusag3__default(),
         new Object[] {
             new Object[] {
            P01IJ2_A396EmprCod, P01IJ2_A129BarCod, P01IJ2_A132BarCodReo, P01IJ2_A130BarCodPar, P01IJ2_A457FasCod, P01IJ2_A153BarFasEst, P01IJ2_A194BarOrdLin, P01IJ2_A758ProCod
            }
            , new Object[] {
            P01IJ3_A396EmprCod, P01IJ3_A1142MaqFCod, P01IJ3_A602MaqCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV18FlagMFas ;
   private byte A153BarFasEst ;
   private short AV16OrdLinAnt ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV15MaqCod ;
   private String AV17FasCodAnt ;
   private String AV19IniProd ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String A1142MaqFCod ;
   private String A602MaqCod ;
   private String[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private String[] aP6 ;
   private byte[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P01IJ2_A396EmprCod ;
   private int[] P01IJ2_A129BarCod ;
   private byte[] P01IJ2_A132BarCodReo ;
   private String[] P01IJ2_A130BarCodPar ;
   private String[] P01IJ2_A457FasCod ;
   private byte[] P01IJ2_A153BarFasEst ;
   private short[] P01IJ2_A194BarOrdLin ;
   private String[] P01IJ2_A758ProCod ;
   private String[] P01IJ3_A396EmprCod ;
   private String[] P01IJ3_A1142MaqFCod ;
   private String[] P01IJ3_A602MaqCod ;
}

final  class pbusag3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01IJ2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, FasCod, BarFasEst, BarOrdLin, ProCod FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarFasEst <> 2) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01IJ3", "SELECT EmprCod, MaqFCod, MaqCod FROM TXPMAQFAS WHERE EmprCod = ? and MaqCod = ? and MaqFCod = ? ORDER BY EmprCod, MaqCod, MaqFCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 8);
               return;
      }
   }

}

