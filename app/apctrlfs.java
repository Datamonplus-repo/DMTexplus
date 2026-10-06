package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apctrlfs extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apctrlfs pgm = new apctrlfs (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String[] aP0 = new String[] {""};
      int[] aP1 = new int[] {0};
      byte[] aP2 = new byte[] {0};
      String[] aP3 = new String[] {""};
      String[] aP4 = new String[] {""};
      String[] aP5 = new String[] {""};

      try
      {
         aP0[0] = (String) args[0];
         aP1[0] = (int) GXutil.lval( args[1]);
         aP2[0] = (byte) GXutil.lval( args[2]);
         aP3[0] = (String) args[3];
         aP4[0] = (String) args[4];
         aP5[0] = (String) args[5];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   public apctrlfs( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apctrlfs.class ), "" );
   }

   public apctrlfs( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      apctrlfs.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      apctrlfs.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      apctrlfs.this.AV9Barcod = aP1[0];
      this.aP1 = aP1;
      apctrlfs.this.AV10Barcodreo = aP2[0];
      this.aP2 = aP2;
      apctrlfs.this.AV11Barcodpar = aP3[0];
      this.aP3 = aP3;
      apctrlfs.this.AV12fascod = aP4[0];
      this.aP4 = aP4;
      apctrlfs.this.AV8Ok = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Ok = httpContext.getMessage( "N", "") ;
      AV14OkFs = httpContext.getMessage( "N", "") ;
      AV16NextFs = (byte)(0) ;
      /* Using cursor P04DW2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV9Barcod), Byte.valueOf(AV10Barcodreo), AV11Barcodpar, AV12fascod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A153BarFasEst = P04DW2_A153BarFasEst[0] ;
         A457FasCod = P04DW2_A457FasCod[0] ;
         A130BarCodPar = P04DW2_A130BarCodPar[0] ;
         A132BarCodReo = P04DW2_A132BarCodReo[0] ;
         A129BarCod = P04DW2_A129BarCod[0] ;
         A194BarOrdLin = P04DW2_A194BarOrdLin[0] ;
         A758ProCod = P04DW2_A758ProCod[0] ;
         AV13BarOrdlin = A194BarOrdLin ;
         AV14OkFs = httpContext.getMessage( "S", "") ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P04DW3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV9Barcod), Byte.valueOf(AV10Barcodreo), AV11Barcodpar, Short.valueOf(AV13BarOrdlin)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A129BarCod = P04DW3_A129BarCod[0] ;
         A132BarCodReo = P04DW3_A132BarCodReo[0] ;
         A130BarCodPar = P04DW3_A130BarCodPar[0] ;
         A194BarOrdLin = P04DW3_A194BarOrdLin[0] ;
         A152BarFasCon = P04DW3_A152BarFasCon[0] ;
         A153BarFasEst = P04DW3_A153BarFasEst[0] ;
         A758ProCod = P04DW3_A758ProCod[0] ;
         if ( GXutil.strcmp(A152BarFasCon, httpContext.getMessage( "S", "")) == 0 )
         {
            AV15BarFasEst = A153BarFasEst ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      AV16NextFs = (byte)(0) ;
      /* Using cursor P04DW4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV9Barcod), Byte.valueOf(AV10Barcodreo), AV11Barcodpar, Short.valueOf(AV13BarOrdlin)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A194BarOrdLin = P04DW4_A194BarOrdLin[0] ;
         A152BarFasCon = P04DW4_A152BarFasCon[0] ;
         A130BarCodPar = P04DW4_A130BarCodPar[0] ;
         A132BarCodReo = P04DW4_A132BarCodReo[0] ;
         A129BarCod = P04DW4_A129BarCod[0] ;
         A153BarFasEst = P04DW4_A153BarFasEst[0] ;
         A758ProCod = P04DW4_A758ProCod[0] ;
         if ( GXutil.strcmp(A152BarFasCon, httpContext.getMessage( "S", "")) == 0 )
         {
            if ( A153BarFasEst > 0 )
            {
               AV16NextFs = (byte)(1) ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( GXutil.strcmp(AV14OkFs, httpContext.getMessage( "S", "")) == 0 )
      {
         if ( AV16NextFs == 1 )
         {
            AV8Ok = httpContext.getMessage( "N", "") ;
         }
         else
         {
            if ( AV15BarFasEst > 0 )
            {
               AV8Ok = httpContext.getMessage( "S", "") ;
            }
         }
      }
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pctrlfs.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      this.aP0[0] = apctrlfs.this.A396EmprCod;
      this.aP1[0] = apctrlfs.this.AV9Barcod;
      this.aP2[0] = apctrlfs.this.AV10Barcodreo;
      this.aP3[0] = apctrlfs.this.AV11Barcodpar;
      this.aP4[0] = apctrlfs.this.AV12fascod;
      this.aP5[0] = apctrlfs.this.AV8Ok;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV14OkFs = "" ;
      scmdbuf = "" ;
      P04DW2_A396EmprCod = new String[] {""} ;
      P04DW2_A153BarFasEst = new byte[1] ;
      P04DW2_A457FasCod = new String[] {""} ;
      P04DW2_A130BarCodPar = new String[] {""} ;
      P04DW2_A132BarCodReo = new byte[1] ;
      P04DW2_A129BarCod = new int[1] ;
      P04DW2_A194BarOrdLin = new short[1] ;
      P04DW2_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A130BarCodPar = "" ;
      A758ProCod = "" ;
      P04DW3_A396EmprCod = new String[] {""} ;
      P04DW3_A129BarCod = new int[1] ;
      P04DW3_A132BarCodReo = new byte[1] ;
      P04DW3_A130BarCodPar = new String[] {""} ;
      P04DW3_A194BarOrdLin = new short[1] ;
      P04DW3_A152BarFasCon = new String[] {""} ;
      P04DW3_A153BarFasEst = new byte[1] ;
      P04DW3_A758ProCod = new String[] {""} ;
      A152BarFasCon = "" ;
      P04DW4_A396EmprCod = new String[] {""} ;
      P04DW4_A194BarOrdLin = new short[1] ;
      P04DW4_A152BarFasCon = new String[] {""} ;
      P04DW4_A130BarCodPar = new String[] {""} ;
      P04DW4_A132BarCodReo = new byte[1] ;
      P04DW4_A129BarCod = new int[1] ;
      P04DW4_A153BarFasEst = new byte[1] ;
      P04DW4_A758ProCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apctrlfs__default(),
         new Object[] {
             new Object[] {
            P04DW2_A396EmprCod, P04DW2_A153BarFasEst, P04DW2_A457FasCod, P04DW2_A130BarCodPar, P04DW2_A132BarCodReo, P04DW2_A129BarCod, P04DW2_A194BarOrdLin, P04DW2_A758ProCod
            }
            , new Object[] {
            P04DW3_A396EmprCod, P04DW3_A129BarCod, P04DW3_A132BarCodReo, P04DW3_A130BarCodPar, P04DW3_A194BarOrdLin, P04DW3_A152BarFasCon, P04DW3_A153BarFasEst, P04DW3_A758ProCod
            }
            , new Object[] {
            P04DW4_A396EmprCod, P04DW4_A194BarOrdLin, P04DW4_A152BarFasCon, P04DW4_A130BarCodPar, P04DW4_A132BarCodReo, P04DW4_A129BarCod, P04DW4_A153BarFasEst, P04DW4_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10Barcodreo ;
   private byte AV16NextFs ;
   private byte A153BarFasEst ;
   private byte A132BarCodReo ;
   private byte AV15BarFasEst ;
   private short A194BarOrdLin ;
   private short AV13BarOrdlin ;
   private short Gx_err ;
   private int AV9Barcod ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String AV11Barcodpar ;
   private String AV12fascod ;
   private String AV8Ok ;
   private String AV14OkFs ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String A152BarFasCon ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P04DW2_A396EmprCod ;
   private byte[] P04DW2_A153BarFasEst ;
   private String[] P04DW2_A457FasCod ;
   private String[] P04DW2_A130BarCodPar ;
   private byte[] P04DW2_A132BarCodReo ;
   private int[] P04DW2_A129BarCod ;
   private short[] P04DW2_A194BarOrdLin ;
   private String[] P04DW2_A758ProCod ;
   private String[] P04DW3_A396EmprCod ;
   private int[] P04DW3_A129BarCod ;
   private byte[] P04DW3_A132BarCodReo ;
   private String[] P04DW3_A130BarCodPar ;
   private short[] P04DW3_A194BarOrdLin ;
   private String[] P04DW3_A152BarFasCon ;
   private byte[] P04DW3_A153BarFasEst ;
   private String[] P04DW3_A758ProCod ;
   private String[] P04DW4_A396EmprCod ;
   private short[] P04DW4_A194BarOrdLin ;
   private String[] P04DW4_A152BarFasCon ;
   private String[] P04DW4_A130BarCodPar ;
   private byte[] P04DW4_A132BarCodReo ;
   private int[] P04DW4_A129BarCod ;
   private byte[] P04DW4_A153BarFasEst ;
   private String[] P04DW4_A758ProCod ;
}

final  class apctrlfs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04DW2", "SELECT EmprCod, BarFasEst, FasCod, BarCodPar, BarCodReo, BarCod, BarOrdLin, ProCod FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (FasCod = ?) AND (BarFasEst = 0) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04DW3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, BarFasCon, BarFasEst, ProCod FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarOrdLin < ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin DESC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04DW4", "SELECT EmprCod, BarOrdLin, BarFasCon, BarCodPar, BarCodReo, BarCod, BarFasEst, ProCod FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarOrdLin > ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
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
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

