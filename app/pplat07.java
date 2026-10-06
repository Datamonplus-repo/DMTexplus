package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pplat07 extends GXProcedure
{
   public pplat07( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pplat07.class ), "" );
   }

   public pplat07( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 ,
                             java.util.Date[] aP5 )
   {
      pplat07.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 ,
                        java.util.Date[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 ,
                             java.util.Date[] aP5 ,
                             String[] aP6 )
   {
      pplat07.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pplat07.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pplat07.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pplat07.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pplat07.this.aP4 = aP4;
      pplat07.this.aP5 = aP5;
      pplat07.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10BARFECRINI = GXutil.nullDate() ;
      AV11Maqcodbis = GXutil.space( (short)(6)) ;
      AV8BarFasEst = (byte)(9) ;
      AV10BARFECRINI = GXutil.nullDate() ;
      AV11Maqcodbis = GXutil.space( (short)(6)) ;
      /* Using cursor P01ST2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A150BarFacTin = P01ST2_A150BarFacTin[0] ;
         A153BarFasEst = P01ST2_A153BarFasEst[0] ;
         A160BarFecRea = P01ST2_A160BarFecRea[0] ;
         A603MaqCodBis = P01ST2_A603MaqCodBis[0] ;
         A194BarOrdLin = P01ST2_A194BarOrdLin[0] ;
         A758ProCod = P01ST2_A758ProCod[0] ;
         if ( GXutil.strcmp(A150BarFacTin, httpContext.getMessage( "S", "")) == 0 )
         {
            AV8BarFasEst = A153BarFasEst ;
            AV10BARFECRINI = A160BarFecRea ;
            AV11Maqcodbis = A603MaqCodBis ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pplat07.this.A396EmprCod;
      this.aP1[0] = pplat07.this.A129BarCod;
      this.aP2[0] = pplat07.this.A132BarCodReo;
      this.aP3[0] = pplat07.this.A130BarCodPar;
      this.aP4[0] = pplat07.this.AV8BarFasEst;
      this.aP5[0] = pplat07.this.AV10BARFECRINI;
      this.aP6[0] = pplat07.this.AV11Maqcodbis;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10BARFECRINI = GXutil.nullDate() ;
      AV11Maqcodbis = "" ;
      scmdbuf = "" ;
      P01ST2_A396EmprCod = new String[] {""} ;
      P01ST2_A129BarCod = new int[1] ;
      P01ST2_A132BarCodReo = new byte[1] ;
      P01ST2_A130BarCodPar = new String[] {""} ;
      P01ST2_A150BarFacTin = new String[] {""} ;
      P01ST2_A153BarFasEst = new byte[1] ;
      P01ST2_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P01ST2_A603MaqCodBis = new String[] {""} ;
      P01ST2_A194BarOrdLin = new short[1] ;
      P01ST2_A758ProCod = new String[] {""} ;
      A150BarFacTin = "" ;
      A160BarFecRea = GXutil.nullDate() ;
      A603MaqCodBis = "" ;
      A758ProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pplat07__default(),
         new Object[] {
             new Object[] {
            P01ST2_A396EmprCod, P01ST2_A129BarCod, P01ST2_A132BarCodReo, P01ST2_A130BarCodPar, P01ST2_A150BarFacTin, P01ST2_A153BarFasEst, P01ST2_A160BarFecRea, P01ST2_A603MaqCodBis, P01ST2_A194BarOrdLin, P01ST2_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV8BarFasEst ;
   private byte A153BarFasEst ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV11Maqcodbis ;
   private String scmdbuf ;
   private String A150BarFacTin ;
   private String A603MaqCodBis ;
   private String A758ProCod ;
   private java.util.Date AV10BARFECRINI ;
   private java.util.Date A160BarFecRea ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private byte[] aP4 ;
   private java.util.Date[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P01ST2_A396EmprCod ;
   private int[] P01ST2_A129BarCod ;
   private byte[] P01ST2_A132BarCodReo ;
   private String[] P01ST2_A130BarCodPar ;
   private String[] P01ST2_A150BarFacTin ;
   private byte[] P01ST2_A153BarFasEst ;
   private java.util.Date[] P01ST2_A160BarFecRea ;
   private String[] P01ST2_A603MaqCodBis ;
   private short[] P01ST2_A194BarOrdLin ;
   private String[] P01ST2_A758ProCod ;
}

final  class pplat07__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01ST2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarFacTin, BarFasEst, BarFecRea, MaqCodBis, BarOrdLin, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
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

