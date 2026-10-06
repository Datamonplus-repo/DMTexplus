package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusarp extends GXProcedure
{
   public pbusarp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusarp.class ), "" );
   }

   public pbusarp( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            String[] aP2 ,
                            byte[] aP3 ,
                            java.math.BigDecimal[] aP4 ,
                            short[] aP5 ,
                            short[] aP6 )
   {
      pbusarp.this.aP7 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        short[] aP5 ,
                        short[] aP6 ,
                        short[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             short[] aP5 ,
                             short[] aP6 ,
                             short[] aP7 )
   {
      pbusarp.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbusarp.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pbusarp.this.A65ArtCod = aP2[0];
      this.aP2 = aP2;
      pbusarp.this.aP3 = aP3;
      pbusarp.this.aP4 = aP4;
      pbusarp.this.aP5 = aP5;
      pbusarp.this.aP6 = aP6;
      pbusarp.this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV21DatosCrudo ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CRUPML", ""), GXv_int2) ;
      pbusarp.this.GXt_int1 = GXv_int2[0] ;
      AV21DatosCrudo = GXt_int1 ;
      /* Using cursor P010T2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A95ArtRen = P010T2_A95ArtRen[0] ;
         n95ArtRen = P010T2_n95ArtRen[0] ;
         A1148ArtPml = P010T2_A1148ArtPml[0] ;
         n1148ArtPml = P010T2_n1148ArtPml[0] ;
         A7415ArtPmlCru = P010T2_A7415ArtPmlCru[0] ;
         n7415ArtPmlCru = P010T2_n7415ArtPmlCru[0] ;
         A63ArtAcaMin = P010T2_A63ArtAcaMin[0] ;
         n63ArtAcaMin = P010T2_n63ArtAcaMin[0] ;
         A1903ArtGraAca = P010T2_A1903ArtGraAca[0] ;
         n1903ArtGraAca = P010T2_n1903ArtGraAca[0] ;
         AV18Flag = (byte)(1) ;
         AV19Rdto = A95ArtRen ;
         AV20Pesoml = ((AV21DatosCrudo==1) ? A7415ArtPmlCru : A1148ArtPml) ;
         AV22Anc = A63ArtAcaMin ;
         AV23grm2 = A1903ArtGraAca ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbusarp.this.A396EmprCod;
      this.aP1[0] = pbusarp.this.A252CliCod;
      this.aP2[0] = pbusarp.this.A65ArtCod;
      this.aP3[0] = pbusarp.this.AV18Flag;
      this.aP4[0] = pbusarp.this.AV19Rdto;
      this.aP5[0] = pbusarp.this.AV20Pesoml;
      this.aP6[0] = pbusarp.this.AV22Anc;
      this.aP7[0] = pbusarp.this.AV23grm2;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV19Rdto = DecimalUtil.ZERO ;
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P010T2_A396EmprCod = new String[] {""} ;
      P010T2_A252CliCod = new int[1] ;
      P010T2_A65ArtCod = new String[] {""} ;
      P010T2_A95ArtRen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P010T2_n95ArtRen = new boolean[] {false} ;
      P010T2_A1148ArtPml = new short[1] ;
      P010T2_n1148ArtPml = new boolean[] {false} ;
      P010T2_A7415ArtPmlCru = new short[1] ;
      P010T2_n7415ArtPmlCru = new boolean[] {false} ;
      P010T2_A63ArtAcaMin = new short[1] ;
      P010T2_n63ArtAcaMin = new boolean[] {false} ;
      P010T2_A1903ArtGraAca = new short[1] ;
      P010T2_n1903ArtGraAca = new boolean[] {false} ;
      A95ArtRen = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusarp__default(),
         new Object[] {
             new Object[] {
            P010T2_A396EmprCod, P010T2_A252CliCod, P010T2_A65ArtCod, P010T2_A95ArtRen, P010T2_n95ArtRen, P010T2_A1148ArtPml, P010T2_n1148ArtPml, P010T2_A7415ArtPmlCru, P010T2_n7415ArtPmlCru, P010T2_A63ArtAcaMin,
            P010T2_n63ArtAcaMin, P010T2_A1903ArtGraAca, P010T2_n1903ArtGraAca
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18Flag ;
   private byte AV21DatosCrudo ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private short AV20Pesoml ;
   private short AV22Anc ;
   private short AV23grm2 ;
   private short A1148ArtPml ;
   private short A7415ArtPmlCru ;
   private short A63ArtAcaMin ;
   private short A1903ArtGraAca ;
   private short Gx_err ;
   private int A252CliCod ;
   private java.math.BigDecimal AV19Rdto ;
   private java.math.BigDecimal A95ArtRen ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String scmdbuf ;
   private boolean n95ArtRen ;
   private boolean n1148ArtPml ;
   private boolean n7415ArtPmlCru ;
   private boolean n63ArtAcaMin ;
   private boolean n1903ArtGraAca ;
   private short[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private byte[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private short[] aP5 ;
   private short[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P010T2_A396EmprCod ;
   private int[] P010T2_A252CliCod ;
   private String[] P010T2_A65ArtCod ;
   private java.math.BigDecimal[] P010T2_A95ArtRen ;
   private boolean[] P010T2_n95ArtRen ;
   private short[] P010T2_A1148ArtPml ;
   private boolean[] P010T2_n1148ArtPml ;
   private short[] P010T2_A7415ArtPmlCru ;
   private boolean[] P010T2_n7415ArtPmlCru ;
   private short[] P010T2_A63ArtAcaMin ;
   private boolean[] P010T2_n63ArtAcaMin ;
   private short[] P010T2_A1903ArtGraAca ;
   private boolean[] P010T2_n1903ArtGraAca ;
}

final  class pbusarp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P010T2", "SELECT EmprCod, CliCod, ArtCod, ArtRen, ArtPml, ArtPmlCru, ArtAcaMin, ArtGraAca FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

