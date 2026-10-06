package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfasanx extends GXProcedure
{
   public pfasanx( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfasanx.class ), "" );
   }

   public pfasanx( int remoteHandle ,
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
      pfasanx.this.aP5 = new String[] {""};
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
      pfasanx.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfasanx.this.AV15Barcod = aP1[0];
      this.aP1 = aP1;
      pfasanx.this.AV16Barcodreo = aP2[0];
      this.aP2 = aP2;
      pfasanx.this.AV17Barcodpar = aP3[0];
      this.aP3 = aP3;
      pfasanx.this.AV18Fascod = aP4[0];
      this.aP4 = aP4;
      pfasanx.this.Gx_msg = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV21FlagFin ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FINANT", ""), GXv_int1) ;
      pfasanx.this.AV21FlagFin = GXv_int1[0] ;
      GXv_int1[0] = AV22vContAbie ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HRABIE", ""), GXv_int1) ;
      pfasanx.this.AV22vContAbie = GXv_int1[0] ;
      Gx_msg = " " ;
      if ( ( AV21FlagFin == 1 ) && ( AV22vContAbie == 1 ) )
      {
         /* Using cursor P03M92 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15Barcod), Byte.valueOf(AV16Barcodreo), AV17Barcodpar, AV18Fascod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A153BarFasEst = P03M92_A153BarFasEst[0] ;
            A457FasCod = P03M92_A457FasCod[0] ;
            A130BarCodPar = P03M92_A130BarCodPar[0] ;
            A132BarCodReo = P03M92_A132BarCodReo[0] ;
            A129BarCod = P03M92_A129BarCod[0] ;
            A194BarOrdLin = P03M92_A194BarOrdLin[0] ;
            A758ProCod = P03M92_A758ProCod[0] ;
            AV19FinAnt = httpContext.getMessage( "N", "") ;
            GXv_char2[0] = A396EmprCod ;
            GXv_int3[0] = A129BarCod ;
            GXv_int1[0] = A132BarCodReo ;
            GXv_char4[0] = A130BarCodPar ;
            GXv_int5[0] = A194BarOrdLin ;
            GXv_char6[0] = AV19FinAnt ;
            GXv_char7[0] = AV20BarFasAnt ;
            new app.pfestan3(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_int1, GXv_char4, GXv_int5, GXv_char6, GXv_char7) ;
            pfasanx.this.A396EmprCod = GXv_char2[0] ;
            pfasanx.this.A129BarCod = GXv_int3[0] ;
            pfasanx.this.A132BarCodReo = GXv_int1[0] ;
            pfasanx.this.A130BarCodPar = GXv_char4[0] ;
            pfasanx.this.A194BarOrdLin = GXv_int5[0] ;
            pfasanx.this.AV19FinAnt = GXv_char6[0] ;
            pfasanx.this.AV20BarFasAnt = GXv_char7[0] ;
            if ( GXutil.strcmp(AV19FinAnt, httpContext.getMessage( "S", "")) == 0 )
            {
               Gx_msg = httpContext.getMessage( "La HDR ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + GXutil.newLine( ) + httpContext.getMessage( "tiene la Fase ", "") + AV20BarFasAnt + httpContext.getMessage( "NO finalizada ¡¡¡", "") ;
            }
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(0);
         }
         pr_default.close(0);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfasanx.this.A396EmprCod;
      this.aP1[0] = pfasanx.this.AV15Barcod;
      this.aP2[0] = pfasanx.this.AV16Barcodreo;
      this.aP3[0] = pfasanx.this.AV17Barcodpar;
      this.aP4[0] = pfasanx.this.AV18Fascod;
      this.aP5[0] = pfasanx.this.Gx_msg;
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
      P03M92_A396EmprCod = new String[] {""} ;
      P03M92_A153BarFasEst = new byte[1] ;
      P03M92_A457FasCod = new String[] {""} ;
      P03M92_A130BarCodPar = new String[] {""} ;
      P03M92_A132BarCodReo = new byte[1] ;
      P03M92_A129BarCod = new int[1] ;
      P03M92_A194BarOrdLin = new short[1] ;
      P03M92_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A130BarCodPar = "" ;
      A758ProCod = "" ;
      AV19FinAnt = "" ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_int1 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new short[1] ;
      GXv_char6 = new String[1] ;
      AV20BarFasAnt = "" ;
      GXv_char7 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfasanx__default(),
         new Object[] {
             new Object[] {
            P03M92_A396EmprCod, P03M92_A153BarFasEst, P03M92_A457FasCod, P03M92_A130BarCodPar, P03M92_A132BarCodReo, P03M92_A129BarCod, P03M92_A194BarOrdLin, P03M92_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16Barcodreo ;
   private byte AV21FlagFin ;
   private byte AV22vContAbie ;
   private byte A153BarFasEst ;
   private byte A132BarCodReo ;
   private byte GXv_int1[] ;
   private short A194BarOrdLin ;
   private short GXv_int5[] ;
   private short Gx_err ;
   private int AV15Barcod ;
   private int A129BarCod ;
   private int GXv_int3[] ;
   private String A396EmprCod ;
   private String AV17Barcodpar ;
   private String AV18Fascod ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String AV19FinAnt ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String GXv_char6[] ;
   private String AV20BarFasAnt ;
   private String GXv_char7[] ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P03M92_A396EmprCod ;
   private byte[] P03M92_A153BarFasEst ;
   private String[] P03M92_A457FasCod ;
   private String[] P03M92_A130BarCodPar ;
   private byte[] P03M92_A132BarCodReo ;
   private int[] P03M92_A129BarCod ;
   private short[] P03M92_A194BarOrdLin ;
   private String[] P03M92_A758ProCod ;
}

final  class pfasanx__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03M92", "SELECT * FROM (SELECT EmprCod, BarFasEst, FasCod, BarCodPar, BarCodReo, BarCod, BarOrdLin, ProCod FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (FasCod = ?) AND (BarFasEst = 0) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

