package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pctrvf extends GXProcedure
{
   public pctrvf( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pctrvf.class ), "" );
   }

   public pctrvf( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           String[] aP2 ,
                                           byte[] aP3 ,
                                           String[] aP4 ,
                                           short[] aP5 ,
                                           java.math.BigDecimal[] aP6 ,
                                           java.math.BigDecimal[] aP7 ,
                                           java.math.BigDecimal[] aP8 )
   {
      pctrvf.this.aP9 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        java.math.BigDecimal[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 )
   {
      pctrvf.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pctrvf.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pctrvf.this.A65ArtCod = aP2[0];
      this.aP2 = aP2;
      pctrvf.this.A10972Int_cod = aP3[0];
      this.aP3 = aP3;
      pctrvf.this.A11043Int_Un = aP4[0];
      this.aP4 = aP4;
      pctrvf.this.AV14Int_lin = aP5[0];
      this.aP5 = aP5;
      pctrvf.this.AV12Int_vali = aP6[0];
      this.aP6 = aP6;
      pctrvf.this.AV13Int_valf = aP7[0];
      this.aP7 = aP7;
      pctrvf.this.AV15Int_pk = aP8[0];
      this.aP8 = aP8;
      pctrvf.this.AV16Int_pm = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12Int_vali = DecimalUtil.doubleToDec(0) ;
      AV13Int_valf = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P04C52 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A10972Int_cod), A11043Int_Un, Short.valueOf(AV14Int_lin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10966Int_Lin = P04C52_A10966Int_Lin[0] ;
         A10967Int_ValI = P04C52_A10967Int_ValI[0] ;
         n10967Int_ValI = P04C52_n10967Int_ValI[0] ;
         A10968Int_ValF = P04C52_A10968Int_ValF[0] ;
         n10968Int_ValF = P04C52_n10968Int_ValF[0] ;
         A10969Int_Pk = P04C52_A10969Int_Pk[0] ;
         n10969Int_Pk = P04C52_n10969Int_Pk[0] ;
         A10970Int_Pm = P04C52_A10970Int_Pm[0] ;
         n10970Int_Pm = P04C52_n10970Int_Pm[0] ;
         AV12Int_vali = A10967Int_ValI ;
         AV13Int_valf = A10968Int_ValF ;
         AV15Int_pk = A10969Int_Pk ;
         AV16Int_pm = A10970Int_Pm ;
         Gx_msg = httpContext.getMessage( "Linea Control=", "") + GXutil.str( AV14Int_lin, 4, 0) + GXutil.chr( (short)(13)) ;
         Gx_msg += httpContext.getMessage( "Linea=", "") + GXutil.str( A10966Int_Lin, 4, 0) + GXutil.chr( (short)(13)) ;
         Gx_msg += httpContext.getMessage( "Vinicial=", "") + GXutil.str( AV12Int_vali, 9, 2) + GXutil.chr( (short)(13)) ;
         Gx_msg += httpContext.getMessage( "Vfinal=", "") + GXutil.str( AV13Int_valf, 9, 2) + GXutil.chr( (short)(13)) ;
         System.out.println( Gx_msg );
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pctrvf.this.A396EmprCod;
      this.aP1[0] = pctrvf.this.A252CliCod;
      this.aP2[0] = pctrvf.this.A65ArtCod;
      this.aP3[0] = pctrvf.this.A10972Int_cod;
      this.aP4[0] = pctrvf.this.A11043Int_Un;
      this.aP5[0] = pctrvf.this.AV14Int_lin;
      this.aP6[0] = pctrvf.this.AV12Int_vali;
      this.aP7[0] = pctrvf.this.AV13Int_valf;
      this.aP8[0] = pctrvf.this.AV15Int_pk;
      this.aP9[0] = pctrvf.this.AV16Int_pm;
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
      P04C52_A396EmprCod = new String[] {""} ;
      P04C52_A252CliCod = new int[1] ;
      P04C52_A65ArtCod = new String[] {""} ;
      P04C52_A10972Int_cod = new byte[1] ;
      P04C52_A11043Int_Un = new String[] {""} ;
      P04C52_A10966Int_Lin = new short[1] ;
      P04C52_A10967Int_ValI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04C52_n10967Int_ValI = new boolean[] {false} ;
      P04C52_A10968Int_ValF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04C52_n10968Int_ValF = new boolean[] {false} ;
      P04C52_A10969Int_Pk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04C52_n10969Int_Pk = new boolean[] {false} ;
      P04C52_A10970Int_Pm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04C52_n10970Int_Pm = new boolean[] {false} ;
      A10967Int_ValI = DecimalUtil.ZERO ;
      A10968Int_ValF = DecimalUtil.ZERO ;
      A10969Int_Pk = DecimalUtil.ZERO ;
      A10970Int_Pm = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pctrvf__default(),
         new Object[] {
             new Object[] {
            P04C52_A396EmprCod, P04C52_A252CliCod, P04C52_A65ArtCod, P04C52_A10972Int_cod, P04C52_A11043Int_Un, P04C52_A10966Int_Lin, P04C52_A10967Int_ValI, P04C52_n10967Int_ValI, P04C52_A10968Int_ValF, P04C52_n10968Int_ValF,
            P04C52_A10969Int_Pk, P04C52_n10969Int_Pk, P04C52_A10970Int_Pm, P04C52_n10970Int_Pm
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
   private java.math.BigDecimal AV12Int_vali ;
   private java.math.BigDecimal AV13Int_valf ;
   private java.math.BigDecimal AV15Int_pk ;
   private java.math.BigDecimal AV16Int_pm ;
   private java.math.BigDecimal A10967Int_ValI ;
   private java.math.BigDecimal A10968Int_ValF ;
   private java.math.BigDecimal A10969Int_Pk ;
   private java.math.BigDecimal A10970Int_Pm ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String A11043Int_Un ;
   private String scmdbuf ;
   private String Gx_msg ;
   private boolean n10967Int_ValI ;
   private boolean n10968Int_ValF ;
   private boolean n10969Int_Pk ;
   private boolean n10970Int_Pm ;
   private java.math.BigDecimal[] aP9 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P04C52_A396EmprCod ;
   private int[] P04C52_A252CliCod ;
   private String[] P04C52_A65ArtCod ;
   private byte[] P04C52_A10972Int_cod ;
   private String[] P04C52_A11043Int_Un ;
   private short[] P04C52_A10966Int_Lin ;
   private java.math.BigDecimal[] P04C52_A10967Int_ValI ;
   private boolean[] P04C52_n10967Int_ValI ;
   private java.math.BigDecimal[] P04C52_A10968Int_ValF ;
   private boolean[] P04C52_n10968Int_ValF ;
   private java.math.BigDecimal[] P04C52_A10969Int_Pk ;
   private boolean[] P04C52_n10969Int_Pk ;
   private java.math.BigDecimal[] P04C52_A10970Int_Pm ;
   private boolean[] P04C52_n10970Int_Pm ;
}

final  class pctrvf__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04C52", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Int_cod, Int_Un, Int_Lin, Int_ValI, Int_ValF, Int_Pk, Int_Pm FROM TXPINCIN1 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and Int_cod = ? and Int_Un = ? and Int_Lin > ? ORDER BY EmprCod, CliCod, ArtCod, Int_cod, Int_Un, Int_Lin) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
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

