package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pctrve extends GXProcedure
{
   public pctrve( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pctrve.class ), "" );
   }

   public pctrve( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 )
   {
      pctrve.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             String[] aP8 )
   {
      pctrve.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pctrve.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pctrve.this.A65ArtCod = aP2[0];
      this.aP2 = aP2;
      pctrve.this.A10972Int_cod = aP3[0];
      this.aP3 = aP3;
      pctrve.this.A11043Int_Un = aP4[0];
      this.aP4 = aP4;
      pctrve.this.AV14Int_lin = aP5[0];
      this.aP5 = aP5;
      pctrve.this.AV15Int_pk = aP6[0];
      this.aP6 = aP6;
      pctrve.this.AV16Int_pm = aP7[0];
      this.aP7 = aP7;
      pctrve.this.AV17Msg_err1 = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18Int_pka = DecimalUtil.doubleToDec(0) ;
      AV19Int_pma = DecimalUtil.doubleToDec(0) ;
      AV17Msg_err1 = " " ;
      /* Using cursor P04CD2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A10972Int_cod), A11043Int_Un, Short.valueOf(AV14Int_lin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10971Int_Tp = P04CD2_A10971Int_Tp[0] ;
         n10971Int_Tp = P04CD2_n10971Int_Tp[0] ;
         A10966Int_Lin = P04CD2_A10966Int_Lin[0] ;
         A10969Int_Pk = P04CD2_A10969Int_Pk[0] ;
         n10969Int_Pk = P04CD2_n10969Int_Pk[0] ;
         A10970Int_Pm = P04CD2_A10970Int_Pm[0] ;
         n10970Int_Pm = P04CD2_n10970Int_Pm[0] ;
         if ( GXutil.strcmp(A10971Int_Tp, httpContext.getMessage( "T", "")) == 0 )
         {
            AV18Int_pka = A10969Int_Pk ;
            AV19Int_pma = A10970Int_Pm ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( ( AV15Int_pk.doubleValue() > 0 ) && ( DecimalUtil.compareTo(AV15Int_pk, AV18Int_pka) < 0 ) )
      {
         AV17Msg_err1 = httpContext.getMessage( "Error.Tipo=T.", "") + GXutil.chr( (short)(13)) ;
         AV17Msg_err1 += httpContext.getMessage( "Valor introducido ", "") + GXutil.trim( GXutil.str( AV15Int_pk, 13, 5)) + GXutil.chr( (short)(13)) ;
         AV17Msg_err1 += httpContext.getMessage( "Inferior", "") + GXutil.chr( (short)(13)) ;
         AV17Msg_err1 += httpContext.getMessage( "Valor Linea Anterior ", "") + GXutil.trim( GXutil.str( AV18Int_pka, 13, 5)) + GXutil.chr( (short)(13)) ;
      }
      if ( ( AV16Int_pm.doubleValue() > 0 ) && ( DecimalUtil.compareTo(AV16Int_pm, AV19Int_pma) < 0 ) )
      {
         AV17Msg_err1 = httpContext.getMessage( "Error.Tipo=T.", "") + GXutil.chr( (short)(13)) ;
         AV17Msg_err1 += httpContext.getMessage( "Valor introducido ", "") + GXutil.trim( GXutil.str( AV16Int_pm, 13, 5)) + GXutil.chr( (short)(13)) ;
         AV17Msg_err1 += httpContext.getMessage( "Inferior", "") + GXutil.chr( (short)(13)) ;
         AV17Msg_err1 += httpContext.getMessage( "Valor Linea Anterior ", "") + GXutil.trim( GXutil.str( AV19Int_pma, 13, 5)) + GXutil.chr( (short)(13)) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pctrve.this.A396EmprCod;
      this.aP1[0] = pctrve.this.A252CliCod;
      this.aP2[0] = pctrve.this.A65ArtCod;
      this.aP3[0] = pctrve.this.A10972Int_cod;
      this.aP4[0] = pctrve.this.A11043Int_Un;
      this.aP5[0] = pctrve.this.AV14Int_lin;
      this.aP6[0] = pctrve.this.AV15Int_pk;
      this.aP7[0] = pctrve.this.AV16Int_pm;
      this.aP8[0] = pctrve.this.AV17Msg_err1;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV18Int_pka = DecimalUtil.ZERO ;
      AV19Int_pma = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P04CD2_A396EmprCod = new String[] {""} ;
      P04CD2_A252CliCod = new int[1] ;
      P04CD2_A65ArtCod = new String[] {""} ;
      P04CD2_A10972Int_cod = new byte[1] ;
      P04CD2_A11043Int_Un = new String[] {""} ;
      P04CD2_A10971Int_Tp = new String[] {""} ;
      P04CD2_n10971Int_Tp = new boolean[] {false} ;
      P04CD2_A10966Int_Lin = new short[1] ;
      P04CD2_A10969Int_Pk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04CD2_n10969Int_Pk = new boolean[] {false} ;
      P04CD2_A10970Int_Pm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04CD2_n10970Int_Pm = new boolean[] {false} ;
      A10971Int_Tp = "" ;
      A10969Int_Pk = DecimalUtil.ZERO ;
      A10970Int_Pm = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pctrve__default(),
         new Object[] {
             new Object[] {
            P04CD2_A396EmprCod, P04CD2_A252CliCod, P04CD2_A65ArtCod, P04CD2_A10972Int_cod, P04CD2_A11043Int_Un, P04CD2_A10971Int_Tp, P04CD2_n10971Int_Tp, P04CD2_A10966Int_Lin, P04CD2_A10969Int_Pk, P04CD2_n10969Int_Pk,
            P04CD2_A10970Int_Pm, P04CD2_n10970Int_Pm
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A10972Int_cod ;
   private short AV14Int_lin ;
   private short A10966Int_Lin ;
   private short Gx_err ;
   private int A252CliCod ;
   private java.math.BigDecimal AV15Int_pk ;
   private java.math.BigDecimal AV16Int_pm ;
   private java.math.BigDecimal AV18Int_pka ;
   private java.math.BigDecimal AV19Int_pma ;
   private java.math.BigDecimal A10969Int_Pk ;
   private java.math.BigDecimal A10970Int_Pm ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String A11043Int_Un ;
   private String AV17Msg_err1 ;
   private String scmdbuf ;
   private String A10971Int_Tp ;
   private boolean n10971Int_Tp ;
   private boolean n10969Int_Pk ;
   private boolean n10970Int_Pm ;
   private String[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P04CD2_A396EmprCod ;
   private int[] P04CD2_A252CliCod ;
   private String[] P04CD2_A65ArtCod ;
   private byte[] P04CD2_A10972Int_cod ;
   private String[] P04CD2_A11043Int_Un ;
   private String[] P04CD2_A10971Int_Tp ;
   private boolean[] P04CD2_n10971Int_Tp ;
   private short[] P04CD2_A10966Int_Lin ;
   private java.math.BigDecimal[] P04CD2_A10969Int_Pk ;
   private boolean[] P04CD2_n10969Int_Pk ;
   private java.math.BigDecimal[] P04CD2_A10970Int_Pm ;
   private boolean[] P04CD2_n10970Int_Pm ;
}

final  class pctrve__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04CD2", "SELECT EmprCod, CliCod, ArtCod, Int_cod, Int_Un, Int_Tp, Int_Lin, Int_Pk, Int_Pm FROM TXPINCIN1 WHERE (EmprCod = ? and CliCod = ? and ArtCod = ? and Int_cod = ? and Int_Un = ?) AND (Int_Lin < ?) ORDER BY EmprCod, CliCod, ArtCod, Int_cod, Int_Un, Int_Lin DESC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
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
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
      }
   }

}

