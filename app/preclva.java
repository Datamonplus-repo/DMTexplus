package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class preclva extends GXProcedure
{
   public preclva( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( preclva.class ), "" );
   }

   public preclva( int remoteHandle ,
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
      preclva.this.aP5 = new String[] {""};
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
      preclva.this.AV35EmprCod = aP0[0];
      this.aP0 = aP0;
      preclva.this.AV23BarCod = aP1[0];
      this.aP1 = aP1;
      preclva.this.AV24BarCodReo = aP2[0];
      this.aP2 = aP2;
      preclva.this.AV25BarCodPar = aP3[0];
      this.aP3 = aP3;
      preclva.this.AV26RecLinMaq = aP4[0];
      this.aP4 = aP4;
      preclva.this.AV36Recal = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV36Recal = httpContext.getMessage( "S", "") ;
      AV27Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV35EmprCod ;
      GXv_char2[0] = AV30EmprNom ;
      GXv_char3[0] = AV29Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV27Station, GXv_char1, GXv_char2, GXv_char3) ;
      preclva.this.AV35EmprCod = GXv_char1[0] ;
      preclva.this.AV30EmprNom = GXv_char2[0] ;
      preclva.this.AV29Usurcod = GXv_char3[0] ;
      AV31Tot_rgtos = (short)(0) ;
      GXv_char3[0] = AV35EmprCod ;
      GXv_int4[0] = AV23BarCod ;
      GXv_int5[0] = AV24BarCodReo ;
      GXv_char2[0] = AV25BarCodPar ;
      GXv_int6[0] = AV26RecLinMaq ;
      GXv_char1[0] = AV36Recal ;
      GXv_int7[0] = AV33RecOrdLin ;
      GXv_char8[0] = AV34ProCod ;
      GXv_decimal9[0] = AV32Kgs_for ;
      GXv_int10[0] = AV31Tot_rgtos ;
      new app.prelan1(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int5, GXv_char2, GXv_int6, GXv_char1, GXv_int7, GXv_char8, GXv_decimal9, GXv_int10) ;
      preclva.this.AV35EmprCod = GXv_char3[0] ;
      preclva.this.AV23BarCod = GXv_int4[0] ;
      preclva.this.AV24BarCodReo = GXv_int5[0] ;
      preclva.this.AV25BarCodPar = GXv_char2[0] ;
      preclva.this.AV26RecLinMaq = GXv_int6[0] ;
      preclva.this.AV36Recal = GXv_char1[0] ;
      preclva.this.AV33RecOrdLin = GXv_int7[0] ;
      preclva.this.AV34ProCod = GXv_char8[0] ;
      preclva.this.AV32Kgs_for = GXv_decimal9[0] ;
      preclva.this.AV31Tot_rgtos = GXv_int10[0] ;
      GXv_char8[0] = AV35EmprCod ;
      GXv_int4[0] = AV23BarCod ;
      GXv_int5[0] = AV24BarCodReo ;
      GXv_char3[0] = AV25BarCodPar ;
      GXv_int10[0] = AV26RecLinMaq ;
      new app.prelan2(remoteHandle, context).execute( GXv_char8, GXv_int4, GXv_int5, GXv_char3, GXv_int10) ;
      preclva.this.AV35EmprCod = GXv_char8[0] ;
      preclva.this.AV23BarCod = GXv_int4[0] ;
      preclva.this.AV24BarCodReo = GXv_int5[0] ;
      preclva.this.AV25BarCodPar = GXv_char3[0] ;
      preclva.this.AV26RecLinMaq = GXv_int10[0] ;
      GXv_char8[0] = AV35EmprCod ;
      GXv_int4[0] = AV23BarCod ;
      GXv_int5[0] = AV24BarCodReo ;
      GXv_char3[0] = AV25BarCodPar ;
      GXv_int10[0] = AV26RecLinMaq ;
      new app.preclva2(remoteHandle, context).execute( GXv_char8, GXv_int4, GXv_int5, GXv_char3, GXv_int10) ;
      preclva.this.AV35EmprCod = GXv_char8[0] ;
      preclva.this.AV23BarCod = GXv_int4[0] ;
      preclva.this.AV24BarCodReo = GXv_int5[0] ;
      preclva.this.AV25BarCodPar = GXv_char3[0] ;
      preclva.this.AV26RecLinMaq = GXv_int10[0] ;
      GXv_char8[0] = AV35EmprCod ;
      GXv_int4[0] = AV23BarCod ;
      GXv_int5[0] = AV24BarCodReo ;
      GXv_char3[0] = AV25BarCodPar ;
      GXv_int10[0] = AV26RecLinMaq ;
      GXv_char2[0] = AV27Station ;
      new app.prelan3(remoteHandle, context).execute( GXv_char8, GXv_int4, GXv_int5, GXv_char3, GXv_int10, GXv_char2) ;
      preclva.this.AV35EmprCod = GXv_char8[0] ;
      preclva.this.AV23BarCod = GXv_int4[0] ;
      preclva.this.AV24BarCodReo = GXv_int5[0] ;
      preclva.this.AV25BarCodPar = GXv_char3[0] ;
      preclva.this.AV26RecLinMaq = GXv_int10[0] ;
      preclva.this.AV27Station = GXv_char2[0] ;
      GXv_char8[0] = AV35EmprCod ;
      GXv_int4[0] = AV23BarCod ;
      GXv_int5[0] = AV24BarCodReo ;
      GXv_char3[0] = AV25BarCodPar ;
      GXv_int10[0] = AV26RecLinMaq ;
      new app.prelan4(remoteHandle, context).execute( GXv_char8, GXv_int4, GXv_int5, GXv_char3, GXv_int10) ;
      preclva.this.AV35EmprCod = GXv_char8[0] ;
      preclva.this.AV23BarCod = GXv_int4[0] ;
      preclva.this.AV24BarCodReo = GXv_int5[0] ;
      preclva.this.AV25BarCodPar = GXv_char3[0] ;
      preclva.this.AV26RecLinMaq = GXv_int10[0] ;
      AV37Dt0051 = (byte)(0) ;
      /* Using cursor P01DT2 */
      pr_default.execute(0, new Object[] {AV35EmprCod, Integer.valueOf(AV23BarCod), Byte.valueOf(AV24BarCodReo), AV25BarCodPar, AV34ProCod, Short.valueOf(AV33RecOrdLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A194BarOrdLin = P01DT2_A194BarOrdLin[0] ;
         A758ProCod = P01DT2_A758ProCod[0] ;
         A130BarCodPar = P01DT2_A130BarCodPar[0] ;
         A132BarCodReo = P01DT2_A132BarCodReo[0] ;
         A129BarCod = P01DT2_A129BarCod[0] ;
         A396EmprCod = P01DT2_A396EmprCod[0] ;
         A7944Dtb_ForLin = P01DT2_A7944Dtb_ForLin[0] ;
         A7934Dtb_Ordl = P01DT2_A7934Dtb_Ordl[0] ;
         AV37Dt0051 = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV37Dt0051 == 1 )
      {
         GXv_char8[0] = AV35EmprCod ;
         GXv_int4[0] = AV23BarCod ;
         GXv_int5[0] = AV24BarCodReo ;
         GXv_char3[0] = AV25BarCodPar ;
         GXv_int10[0] = AV26RecLinMaq ;
         GXv_char2[0] = AV34ProCod ;
         GXv_int7[0] = AV33RecOrdLin ;
         new app.pnwdt005(remoteHandle, context).execute( GXv_char8, GXv_int4, GXv_int5, GXv_char3, GXv_int10, GXv_char2, GXv_int7) ;
         preclva.this.AV35EmprCod = GXv_char8[0] ;
         preclva.this.AV23BarCod = GXv_int4[0] ;
         preclva.this.AV24BarCodReo = GXv_int5[0] ;
         preclva.this.AV25BarCodPar = GXv_char3[0] ;
         preclva.this.AV26RecLinMaq = GXv_int10[0] ;
         preclva.this.AV34ProCod = GXv_char2[0] ;
         preclva.this.AV33RecOrdLin = GXv_int7[0] ;
      }
      GXv_char8[0] = AV35EmprCod ;
      GXv_int4[0] = AV23BarCod ;
      GXv_int5[0] = AV24BarCodReo ;
      GXv_char3[0] = AV25BarCodPar ;
      GXv_int10[0] = AV26RecLinMaq ;
      GXv_char2[0] = AV34ProCod ;
      GXv_int7[0] = AV33RecOrdLin ;
      GXv_decimal9[0] = AV32Kgs_for ;
      new app.pcrecet(remoteHandle, context).execute( GXv_char8, GXv_int4, GXv_int5, GXv_char3, GXv_int10, GXv_char2, GXv_int7, GXv_decimal9) ;
      preclva.this.AV35EmprCod = GXv_char8[0] ;
      preclva.this.AV23BarCod = GXv_int4[0] ;
      preclva.this.AV24BarCodReo = GXv_int5[0] ;
      preclva.this.AV25BarCodPar = GXv_char3[0] ;
      preclva.this.AV26RecLinMaq = GXv_int10[0] ;
      preclva.this.AV34ProCod = GXv_char2[0] ;
      preclva.this.AV33RecOrdLin = GXv_int7[0] ;
      preclva.this.AV32Kgs_for = GXv_decimal9[0] ;
      GXv_char8[0] = AV35EmprCod ;
      GXv_int4[0] = AV23BarCod ;
      GXv_int5[0] = AV24BarCodReo ;
      GXv_char3[0] = AV25BarCodPar ;
      GXv_int10[0] = AV26RecLinMaq ;
      GXv_char2[0] = httpContext.getMessage( "N", "") ;
      new app.planref2(remoteHandle, context).execute( GXv_char8, GXv_int4, GXv_int5, GXv_char3, GXv_int10, GXv_char2) ;
      preclva.this.AV35EmprCod = GXv_char8[0] ;
      preclva.this.AV23BarCod = GXv_int4[0] ;
      preclva.this.AV24BarCodReo = GXv_int5[0] ;
      preclva.this.AV25BarCodPar = GXv_char3[0] ;
      preclva.this.AV26RecLinMaq = GXv_int10[0] ;
      GXv_char8[0] = AV35EmprCod ;
      GXv_int4[0] = AV23BarCod ;
      GXv_int5[0] = AV24BarCodReo ;
      GXv_char3[0] = AV25BarCodPar ;
      GXv_int10[0] = AV26RecLinMaq ;
      new app.pultlinpro(remoteHandle, context).execute( GXv_char8, GXv_int4, GXv_int5, GXv_char3, GXv_int10) ;
      preclva.this.AV35EmprCod = GXv_char8[0] ;
      preclva.this.AV23BarCod = GXv_int4[0] ;
      preclva.this.AV24BarCodReo = GXv_int5[0] ;
      preclva.this.AV25BarCodPar = GXv_char3[0] ;
      preclva.this.AV26RecLinMaq = GXv_int10[0] ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = preclva.this.AV35EmprCod;
      this.aP1[0] = preclva.this.AV23BarCod;
      this.aP2[0] = preclva.this.AV24BarCodReo;
      this.aP3[0] = preclva.this.AV25BarCodPar;
      this.aP4[0] = preclva.this.AV26RecLinMaq;
      this.aP5[0] = preclva.this.AV36Recal;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV27Station = "" ;
      AV30EmprNom = "" ;
      AV29Usurcod = "" ;
      GXv_int6 = new short[1] ;
      GXv_char1 = new String[1] ;
      AV34ProCod = "" ;
      AV32Kgs_for = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P01DT2_A194BarOrdLin = new short[1] ;
      P01DT2_A758ProCod = new String[] {""} ;
      P01DT2_A130BarCodPar = new String[] {""} ;
      P01DT2_A132BarCodReo = new byte[1] ;
      P01DT2_A129BarCod = new int[1] ;
      P01DT2_A396EmprCod = new String[] {""} ;
      P01DT2_A7944Dtb_ForLin = new short[1] ;
      P01DT2_A7934Dtb_Ordl = new short[1] ;
      A758ProCod = "" ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      GXv_int7 = new short[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_char2 = new String[1] ;
      GXv_char8 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_int5 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_int10 = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.preclva__default(),
         new Object[] {
             new Object[] {
            P01DT2_A194BarOrdLin, P01DT2_A758ProCod, P01DT2_A130BarCodPar, P01DT2_A132BarCodReo, P01DT2_A129BarCod, P01DT2_A396EmprCod, P01DT2_A7944Dtb_ForLin, P01DT2_A7934Dtb_Ordl
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV24BarCodReo ;
   private byte AV37Dt0051 ;
   private byte A132BarCodReo ;
   private byte GXv_int5[] ;
   private short AV26RecLinMaq ;
   private short AV31Tot_rgtos ;
   private short GXv_int6[] ;
   private short AV33RecOrdLin ;
   private short A194BarOrdLin ;
   private short A7944Dtb_ForLin ;
   private short A7934Dtb_Ordl ;
   private short GXv_int7[] ;
   private short GXv_int10[] ;
   private short Gx_err ;
   private int AV23BarCod ;
   private int A129BarCod ;
   private int GXv_int4[] ;
   private java.math.BigDecimal AV32Kgs_for ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private String AV35EmprCod ;
   private String AV25BarCodPar ;
   private String AV36Recal ;
   private String AV27Station ;
   private String AV30EmprNom ;
   private String AV29Usurcod ;
   private String GXv_char1[] ;
   private String AV34ProCod ;
   private String scmdbuf ;
   private String A758ProCod ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String GXv_char2[] ;
   private String GXv_char8[] ;
   private String GXv_char3[] ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private IDataStoreProvider pr_default ;
   private short[] P01DT2_A194BarOrdLin ;
   private String[] P01DT2_A758ProCod ;
   private String[] P01DT2_A130BarCodPar ;
   private byte[] P01DT2_A132BarCodReo ;
   private int[] P01DT2_A129BarCod ;
   private String[] P01DT2_A396EmprCod ;
   private short[] P01DT2_A7944Dtb_ForLin ;
   private short[] P01DT2_A7934Dtb_Ordl ;
}

final  class preclva__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01DT2", "SELECT BarOrdLin, ProCod, BarCodPar, BarCodReo, BarCod, EmprCod, Dtb_ForLin, Dtb_Ordl FROM TXPDT0051 WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Dtb_Ordl, Dtb_ForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
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
               return;
      }
   }

}

