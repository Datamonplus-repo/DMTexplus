package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pubitin extends GXProcedure
{
   public pubitin( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pubitin.class ), "" );
   }

   public pubitin( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           int[] aP2 ,
                           String[] aP3 ,
                           String[] aP4 ,
                           java.math.BigDecimal[] aP5 ,
                           int[] aP6 ,
                           String[] aP7 )
   {
      pubitin.this.aP8 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        int[] aP6 ,
                        String[] aP7 ,
                        byte[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             int[] aP6 ,
                             String[] aP7 ,
                             byte[] aP8 )
   {
      pubitin.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pubitin.this.A966PartCod = aP1[0];
      this.aP1 = aP1;
      pubitin.this.A252CliCod = aP2[0];
      this.aP2 = aP2;
      pubitin.this.AV9UbiCod = aP3[0];
      this.aP3 = aP3;
      pubitin.this.AV23UbiTip = aP4[0];
      this.aP4 = aP4;
      pubitin.this.AV26KgsHdr = aP5[0];
      this.aP5 = aP5;
      pubitin.this.AV27ConHdr = aP6[0];
      this.aP6 = aP6;
      pubitin.this.AV29Opcion = aP7[0];
      this.aP7 = aP7;
      pubitin.this.AV14Ok_StkTin = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14Ok_StkTin = (byte)(0) ;
      if ( GXutil.strcmp(AV29Opcion, httpContext.getMessage( "TI", "")) == 0 )
      {
         /* Optimized group. */
         /* Using cursor P020J2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A966PartCod, AV9UbiCod, AV23UbiTip});
         c5852UbiKilEnt = P020J2_A5852UbiKilEnt[0] ;
         n5852UbiKilEnt = P020J2_n5852UbiKilEnt[0] ;
         c5853UbiConEnt = P020J2_A5853UbiConEnt[0] ;
         n5853UbiConEnt = P020J2_n5853UbiConEnt[0] ;
         c5854UbiKilUti = P020J2_A5854UbiKilUti[0] ;
         n5854UbiKilUti = P020J2_n5854UbiKilUti[0] ;
         c5855UbiConUti = P020J2_A5855UbiConUti[0] ;
         n5855UbiConUti = P020J2_n5855UbiConUti[0] ;
         pr_default.close(0);
         AV12UbiKilEnt = AV12UbiKilEnt.add(c5852UbiKilEnt) ;
         AV13UbiConEnt = (short)(AV13UbiConEnt+c5853UbiConEnt) ;
         AV17UbiKilUti = AV17UbiKilUti.add(c5854UbiKilUti) ;
         AV18UbiConUti = (short)(AV18UbiConUti+c5855UbiConUti) ;
         /* End optimized group. */
      }
      else
      {
         /* Optimized group. */
         /* Using cursor P020J3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A966PartCod, AV23UbiTip});
         c5852UbiKilEnt = P020J3_A5852UbiKilEnt[0] ;
         n5852UbiKilEnt = P020J3_n5852UbiKilEnt[0] ;
         c5853UbiConEnt = P020J3_A5853UbiConEnt[0] ;
         n5853UbiConEnt = P020J3_n5853UbiConEnt[0] ;
         c5854UbiKilUti = P020J3_A5854UbiKilUti[0] ;
         n5854UbiKilUti = P020J3_n5854UbiKilUti[0] ;
         c5855UbiConUti = P020J3_A5855UbiConUti[0] ;
         n5855UbiConUti = P020J3_n5855UbiConUti[0] ;
         pr_default.close(1);
         AV12UbiKilEnt = AV12UbiKilEnt.add(c5852UbiKilEnt) ;
         AV13UbiConEnt = (short)(AV13UbiConEnt+c5853UbiConEnt) ;
         AV17UbiKilUti = AV17UbiKilUti.add(c5854UbiKilUti) ;
         AV18UbiConUti = (short)(AV18UbiConUti+c5855UbiConUti) ;
         /* End optimized group. */
      }
      AV24UbiKilSal = AV12UbiKilEnt.subtract(AV17UbiKilUti) ;
      AV25UbiConSal = (int)(AV13UbiConEnt-AV18UbiConUti) ;
      if ( ( DecimalUtil.compareTo(AV24UbiKilSal, AV26KgsHdr) >= 0 ) && ( AV25UbiConSal >= AV27ConHdr ) )
      {
         AV14Ok_StkTin = (byte)(1) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pubitin.this.A396EmprCod;
      this.aP1[0] = pubitin.this.A966PartCod;
      this.aP2[0] = pubitin.this.A252CliCod;
      this.aP3[0] = pubitin.this.AV9UbiCod;
      this.aP4[0] = pubitin.this.AV23UbiTip;
      this.aP5[0] = pubitin.this.AV26KgsHdr;
      this.aP6[0] = pubitin.this.AV27ConHdr;
      this.aP7[0] = pubitin.this.AV29Opcion;
      this.aP8[0] = pubitin.this.AV14Ok_StkTin;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      c5852UbiKilEnt = DecimalUtil.ZERO ;
      c5854UbiKilUti = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P020J2_A5852UbiKilEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P020J2_n5852UbiKilEnt = new boolean[] {false} ;
      P020J2_A5853UbiConEnt = new short[1] ;
      P020J2_n5853UbiConEnt = new boolean[] {false} ;
      P020J2_A5854UbiKilUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P020J2_n5854UbiKilUti = new boolean[] {false} ;
      P020J2_A5855UbiConUti = new short[1] ;
      P020J2_n5855UbiConUti = new boolean[] {false} ;
      AV12UbiKilEnt = DecimalUtil.ZERO ;
      AV17UbiKilUti = DecimalUtil.ZERO ;
      P020J3_A5852UbiKilEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P020J3_n5852UbiKilEnt = new boolean[] {false} ;
      P020J3_A5853UbiConEnt = new short[1] ;
      P020J3_n5853UbiConEnt = new boolean[] {false} ;
      P020J3_A5854UbiKilUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P020J3_n5854UbiKilUti = new boolean[] {false} ;
      P020J3_A5855UbiConUti = new short[1] ;
      P020J3_n5855UbiConUti = new boolean[] {false} ;
      AV24UbiKilSal = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pubitin__default(),
         new Object[] {
             new Object[] {
            P020J2_A5852UbiKilEnt, P020J2_n5852UbiKilEnt, P020J2_A5853UbiConEnt, P020J2_n5853UbiConEnt, P020J2_A5854UbiKilUti, P020J2_n5854UbiKilUti, P020J2_A5855UbiConUti, P020J2_n5855UbiConUti
            }
            , new Object[] {
            P020J3_A5852UbiKilEnt, P020J3_n5852UbiKilEnt, P020J3_A5853UbiConEnt, P020J3_n5853UbiConEnt, P020J3_A5854UbiKilUti, P020J3_n5854UbiKilUti, P020J3_A5855UbiConUti, P020J3_n5855UbiConUti
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV14Ok_StkTin ;
   private short c5853UbiConEnt ;
   private short c5855UbiConUti ;
   private short AV13UbiConEnt ;
   private short AV18UbiConUti ;
   private short Gx_err ;
   private int A252CliCod ;
   private int AV27ConHdr ;
   private int AV25UbiConSal ;
   private java.math.BigDecimal AV26KgsHdr ;
   private java.math.BigDecimal c5852UbiKilEnt ;
   private java.math.BigDecimal c5854UbiKilUti ;
   private java.math.BigDecimal AV12UbiKilEnt ;
   private java.math.BigDecimal AV17UbiKilUti ;
   private java.math.BigDecimal AV24UbiKilSal ;
   private String A396EmprCod ;
   private String A966PartCod ;
   private String AV9UbiCod ;
   private String AV23UbiTip ;
   private String AV29Opcion ;
   private String scmdbuf ;
   private boolean n5852UbiKilEnt ;
   private boolean n5853UbiConEnt ;
   private boolean n5854UbiKilUti ;
   private boolean n5855UbiConUti ;
   private byte[] aP8 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private int[] aP6 ;
   private String[] aP7 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P020J2_A5852UbiKilEnt ;
   private boolean[] P020J2_n5852UbiKilEnt ;
   private short[] P020J2_A5853UbiConEnt ;
   private boolean[] P020J2_n5853UbiConEnt ;
   private java.math.BigDecimal[] P020J2_A5854UbiKilUti ;
   private boolean[] P020J2_n5854UbiKilUti ;
   private short[] P020J2_A5855UbiConUti ;
   private boolean[] P020J2_n5855UbiConUti ;
   private java.math.BigDecimal[] P020J3_A5852UbiKilEnt ;
   private boolean[] P020J3_n5852UbiKilEnt ;
   private short[] P020J3_A5853UbiConEnt ;
   private boolean[] P020J3_n5853UbiConEnt ;
   private java.math.BigDecimal[] P020J3_A5854UbiKilUti ;
   private boolean[] P020J3_n5854UbiKilUti ;
   private short[] P020J3_A5855UbiConUti ;
   private boolean[] P020J3_n5855UbiConUti ;
}

final  class pubitin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P020J2", "SELECT SUM(UbiKilEnt), SUM(UbiConEnt), SUM(UbiKilUti), SUM(UbiConUti) FROM TXPUBIMTO WHERE (EmprCod = ? and CliCod = ? and PartCod = ? and UbiCod = ?) AND (UbiTip = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P020J3", "SELECT SUM(UbiKilEnt), SUM(UbiConEnt), SUM(UbiKilUti), SUM(UbiConUti) FROM TXPUBIMTO WHERE (EmprCod = ? and CliCod = ? and PartCod = ?) AND (UbiTip = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
               stmt.setString(4, (String)parms[3], 3);
               stmt.setString(5, (String)parms[4], 2);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 2);
               return;
      }
   }

}

