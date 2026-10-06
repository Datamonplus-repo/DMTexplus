package app.core ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class faseanteriorcontrol_prc extends GXProcedure
{
   public faseanteriorcontrol_prc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( faseanteriorcontrol_prc.class ), "" );
   }

   public faseanteriorcontrol_prc( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            byte[] aP2 ,
                            String[] aP3 ,
                            short[] aP4 )
   {
      faseanteriorcontrol_prc.this.aP5 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        short[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             short[] aP5 )
   {
      faseanteriorcontrol_prc.this.AV10EmprCod = aP0[0];
      this.aP0 = aP0;
      faseanteriorcontrol_prc.this.AV11BarCod = aP1[0];
      this.aP1 = aP1;
      faseanteriorcontrol_prc.this.AV12BarCodReo = aP2[0];
      this.aP2 = aP2;
      faseanteriorcontrol_prc.this.AV13BarCodPar = aP3[0];
      this.aP3 = aP3;
      faseanteriorcontrol_prc.this.AV8BarOrdLin = aP4[0];
      this.aP4 = aP4;
      faseanteriorcontrol_prc.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9BarOrdAnt = (short)(AV8BarOrdLin-100) ;
      if ( AV9BarOrdAnt > 0 )
      {
         AV15FlagAnt = (short)(0) ;
         /* Using cursor P09882 */
         pr_default.execute(0, new Object[] {AV10EmprCod, Integer.valueOf(AV11BarCod), Byte.valueOf(AV12BarCodReo), AV13BarCodPar, Short.valueOf(AV9BarOrdAnt)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A194BarOrdLin = P09882_A194BarOrdLin[0] ;
            A130BarCodPar = P09882_A130BarCodPar[0] ;
            A132BarCodReo = P09882_A132BarCodReo[0] ;
            A129BarCod = P09882_A129BarCod[0] ;
            A396EmprCod = P09882_A396EmprCod[0] ;
            A153BarFasEst = P09882_A153BarFasEst[0] ;
            A758ProCod = P09882_A758ProCod[0] ;
            AV15FlagAnt = A153BarFasEst ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
         AV14EstS = (short)(0) ;
         /* Using cursor P09883 */
         pr_default.execute(1, new Object[] {AV10EmprCod, Integer.valueOf(AV11BarCod), Byte.valueOf(AV12BarCodReo), AV13BarCodPar, Short.valueOf(AV8BarOrdLin)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A152BarFasCon = P09883_A152BarFasCon[0] ;
            A194BarOrdLin = P09883_A194BarOrdLin[0] ;
            A130BarCodPar = P09883_A130BarCodPar[0] ;
            A132BarCodReo = P09883_A132BarCodReo[0] ;
            A129BarCod = P09883_A129BarCod[0] ;
            A396EmprCod = P09883_A396EmprCod[0] ;
            A153BarFasEst = P09883_A153BarFasEst[0] ;
            A758ProCod = P09883_A758ProCod[0] ;
            if ( GXutil.strcmp(A152BarFasCon, httpContext.getMessage( "S", "")) == 0 )
            {
               AV14EstS = ((A153BarFasEst>0) ? A153BarFasEst : AV14EstS) ;
               if ( AV14EstS > 0 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         AV15FlagAnt = (short)(((AV14EstS>0) ? 0 : AV15FlagAnt)) ;
      }
      else
      {
         AV15FlagAnt = (short)(2) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = faseanteriorcontrol_prc.this.AV10EmprCod;
      this.aP1[0] = faseanteriorcontrol_prc.this.AV11BarCod;
      this.aP2[0] = faseanteriorcontrol_prc.this.AV12BarCodReo;
      this.aP3[0] = faseanteriorcontrol_prc.this.AV13BarCodPar;
      this.aP4[0] = faseanteriorcontrol_prc.this.AV8BarOrdLin;
      this.aP5[0] = faseanteriorcontrol_prc.this.AV15FlagAnt;
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
      P09882_A194BarOrdLin = new short[1] ;
      P09882_A130BarCodPar = new String[] {""} ;
      P09882_A132BarCodReo = new byte[1] ;
      P09882_A129BarCod = new int[1] ;
      P09882_A396EmprCod = new String[] {""} ;
      P09882_A153BarFasEst = new byte[1] ;
      P09882_A758ProCod = new String[] {""} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A758ProCod = "" ;
      P09883_A152BarFasCon = new String[] {""} ;
      P09883_A194BarOrdLin = new short[1] ;
      P09883_A130BarCodPar = new String[] {""} ;
      P09883_A132BarCodReo = new byte[1] ;
      P09883_A129BarCod = new int[1] ;
      P09883_A396EmprCod = new String[] {""} ;
      P09883_A153BarFasEst = new byte[1] ;
      P09883_A758ProCod = new String[] {""} ;
      A152BarFasCon = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.core.faseanteriorcontrol_prc__default(),
         new Object[] {
             new Object[] {
            P09882_A194BarOrdLin, P09882_A130BarCodPar, P09882_A132BarCodReo, P09882_A129BarCod, P09882_A396EmprCod, P09882_A153BarFasEst, P09882_A758ProCod
            }
            , new Object[] {
            P09883_A152BarFasCon, P09883_A194BarOrdLin, P09883_A130BarCodPar, P09883_A132BarCodReo, P09883_A129BarCod, P09883_A396EmprCod, P09883_A153BarFasEst, P09883_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12BarCodReo ;
   private byte A132BarCodReo ;
   private byte A153BarFasEst ;
   private short AV8BarOrdLin ;
   private short AV15FlagAnt ;
   private short AV9BarOrdAnt ;
   private short A194BarOrdLin ;
   private short AV14EstS ;
   private short Gx_err ;
   private int AV11BarCod ;
   private int A129BarCod ;
   private String AV10EmprCod ;
   private String AV13BarCodPar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String A152BarFasCon ;
   private short[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private IDataStoreProvider pr_default ;
   private short[] P09882_A194BarOrdLin ;
   private String[] P09882_A130BarCodPar ;
   private byte[] P09882_A132BarCodReo ;
   private int[] P09882_A129BarCod ;
   private String[] P09882_A396EmprCod ;
   private byte[] P09882_A153BarFasEst ;
   private String[] P09882_A758ProCod ;
   private String[] P09883_A152BarFasCon ;
   private short[] P09883_A194BarOrdLin ;
   private String[] P09883_A130BarCodPar ;
   private byte[] P09883_A132BarCodReo ;
   private int[] P09883_A129BarCod ;
   private String[] P09883_A396EmprCod ;
   private byte[] P09883_A153BarFasEst ;
   private String[] P09883_A758ProCod ;
}

final  class faseanteriorcontrol_prc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09882", "SELECT BarOrdLin, BarCodPar, BarCodReo, BarCod, EmprCod, BarFasEst, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09883", "SELECT BarFasCon, BarOrdLin, BarCodPar, BarCodReo, BarCod, EmprCod, BarFasEst, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin > ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

