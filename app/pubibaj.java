package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pubibaj extends GXProcedure
{
   public pubibaj( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pubibaj.class ), "" );
   }

   public pubibaj( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           int[] aP2 ,
                           int[] aP3 ,
                           String[] aP4 )
   {
      pubibaj.this.aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 ,
                        String[] aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 )
   {
      pubibaj.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pubibaj.this.A966PartCod = aP1[0];
      this.aP1 = aP1;
      pubibaj.this.A252CliCod = aP2[0];
      this.aP2 = aP2;
      pubibaj.this.AV30UbiAlbHdr = aP3[0];
      this.aP3 = aP3;
      pubibaj.this.AV23UbiTip = aP4[0];
      this.aP4 = aP4;
      pubibaj.this.AV22Ok_Baja = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV22Ok_Baja = (byte)(0) ;
      /* Using cursor P020V2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A966PartCod, Integer.valueOf(AV30UbiAlbHdr), AV23UbiTip});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5850UbiTip = P020V2_A5850UbiTip[0] ;
         n5850UbiTip = P020V2_n5850UbiTip[0] ;
         A5834UbiAlbHdr = P020V2_A5834UbiAlbHdr[0] ;
         n5834UbiAlbHdr = P020V2_n5834UbiAlbHdr[0] ;
         A5854UbiKilUti = P020V2_A5854UbiKilUti[0] ;
         n5854UbiKilUti = P020V2_n5854UbiKilUti[0] ;
         A5855UbiConUti = P020V2_A5855UbiConUti[0] ;
         n5855UbiConUti = P020V2_n5855UbiConUti[0] ;
         A2248ManCod = P020V2_A2248ManCod[0] ;
         n2248ManCod = P020V2_n2248ManCod[0] ;
         A457FasCod = P020V2_A457FasCod[0] ;
         n457FasCod = P020V2_n457FasCod[0] ;
         A5838UbiCod = P020V2_A5838UbiCod[0] ;
         n5838UbiCod = P020V2_n5838UbiCod[0] ;
         A5849UbiLin = P020V2_A5849UbiLin[0] ;
         AV31UbiKil = A5854UbiKilUti.multiply(DecimalUtil.doubleToDec((-1))) ;
         AV32UbiCon = (short)(A5855UbiConUti*(-1)) ;
         GXv_char1[0] = A396EmprCod ;
         GXv_char2[0] = A966PartCod ;
         GXv_int3[0] = A252CliCod ;
         GXv_int4[0] = A5834UbiAlbHdr ;
         GXv_date5[0] = Gx_date ;
         GXv_char6[0] = A5838UbiCod ;
         GXv_char7[0] = httpContext.getMessage( "TI", "") ;
         GXv_char8[0] = httpContext.getMessage( "S", "") ;
         GXv_decimal9[0] = DecimalUtil.doubleToDec(0) ;
         GXv_int10[0] = (short)(0) ;
         GXv_decimal11[0] = AV31UbiKil ;
         GXv_int12[0] = AV32UbiCon ;
         GXv_char13[0] = "" ;
         new app.pubiplt(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3, GXv_int4, GXv_date5, GXv_char6, GXv_char7, GXv_char8, GXv_decimal9, GXv_int10, GXv_decimal11, GXv_int12, GXv_char13) ;
         pubibaj.this.A396EmprCod = GXv_char1[0] ;
         pubibaj.this.A966PartCod = GXv_char2[0] ;
         pubibaj.this.A252CliCod = GXv_int3[0] ;
         pubibaj.this.A5834UbiAlbHdr = GXv_int4[0] ;
         pubibaj.this.Gx_date = GXv_date5[0] ;
         pubibaj.this.A5838UbiCod = GXv_char6[0] ;
         pubibaj.this.AV31UbiKil = GXv_decimal11[0] ;
         pubibaj.this.AV32UbiCon = GXv_int12[0] ;
         GXv_char13[0] = A396EmprCod ;
         GXv_char8[0] = A966PartCod ;
         GXv_int4[0] = A252CliCod ;
         GXv_int3[0] = A5834UbiAlbHdr ;
         GXv_date5[0] = Gx_date ;
         GXv_char7[0] = "999" ;
         GXv_char6[0] = httpContext.getMessage( "PT", "") ;
         GXv_char2[0] = httpContext.getMessage( "N", "") ;
         GXv_decimal11[0] = DecimalUtil.doubleToDec(0) ;
         GXv_int12[0] = (short)(0) ;
         GXv_decimal9[0] = AV31UbiKil ;
         GXv_int10[0] = AV32UbiCon ;
         GXv_char1[0] = "" ;
         new app.pubiplt(remoteHandle, context).execute( GXv_char13, GXv_char8, GXv_int4, GXv_int3, GXv_date5, GXv_char7, GXv_char6, GXv_char2, GXv_decimal11, GXv_int12, GXv_decimal9, GXv_int10, GXv_char1) ;
         pubibaj.this.A396EmprCod = GXv_char13[0] ;
         pubibaj.this.A966PartCod = GXv_char8[0] ;
         pubibaj.this.A252CliCod = GXv_int4[0] ;
         pubibaj.this.A5834UbiAlbHdr = GXv_int3[0] ;
         pubibaj.this.Gx_date = GXv_date5[0] ;
         pubibaj.this.AV31UbiKil = GXv_decimal9[0] ;
         pubibaj.this.AV32UbiCon = GXv_int10[0] ;
         GXv_char13[0] = A396EmprCod ;
         GXv_char8[0] = A966PartCod ;
         GXv_int4[0] = A252CliCod ;
         GXv_int3[0] = A5834UbiAlbHdr ;
         GXv_date5[0] = Gx_date ;
         GXv_char7[0] = httpContext.getMessage( "S", "") ;
         GXv_int14[0] = (byte)(2) ;
         GXv_char6[0] = A5838UbiCod ;
         GXv_decimal11[0] = DecimalUtil.doubleToDec(0) ;
         GXv_int12[0] = (short)(0) ;
         GXv_decimal9[0] = AV31UbiKil ;
         GXv_int10[0] = AV32UbiCon ;
         GXv_int15[0] = A2248ManCod ;
         GXv_char2[0] = A457FasCod ;
         GXv_char1[0] = httpContext.getMessage( "Baja Tintura Realizada", "") ;
         GXv_char16[0] = httpContext.getMessage( "B", "") ;
         new app.pubiact(remoteHandle, context).execute( GXv_char13, GXv_char8, GXv_int4, GXv_int3, GXv_date5, GXv_char7, GXv_int14, GXv_char6, GXv_decimal11, GXv_int12, GXv_decimal9, GXv_int10, GXv_int15, GXv_char2, GXv_char1, GXv_char16) ;
         pubibaj.this.A396EmprCod = GXv_char13[0] ;
         pubibaj.this.A966PartCod = GXv_char8[0] ;
         pubibaj.this.A252CliCod = GXv_int4[0] ;
         pubibaj.this.A5834UbiAlbHdr = GXv_int3[0] ;
         pubibaj.this.Gx_date = GXv_date5[0] ;
         pubibaj.this.A5838UbiCod = GXv_char6[0] ;
         pubibaj.this.AV31UbiKil = GXv_decimal9[0] ;
         pubibaj.this.AV32UbiCon = GXv_int10[0] ;
         pubibaj.this.A2248ManCod = GXv_int15[0] ;
         pubibaj.this.A457FasCod = GXv_char2[0] ;
         GXv_char16[0] = A396EmprCod ;
         GXv_int4[0] = A5834UbiAlbHdr ;
         GXv_int14[0] = (byte)(0) ;
         GXv_char13[0] = " " ;
         GXv_int17[0] = (byte)(0) ;
         new app.pactinc2(remoteHandle, context).execute( GXv_char16, GXv_int4, GXv_int14, GXv_char13, GXv_int17) ;
         pubibaj.this.A396EmprCod = GXv_char16[0] ;
         pubibaj.this.A5834UbiAlbHdr = GXv_int4[0] ;
         AV22Ok_Baja = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pubibaj.this.A396EmprCod;
      this.aP1[0] = pubibaj.this.A966PartCod;
      this.aP2[0] = pubibaj.this.A252CliCod;
      this.aP3[0] = pubibaj.this.AV30UbiAlbHdr;
      this.aP4[0] = pubibaj.this.AV23UbiTip;
      this.aP5[0] = pubibaj.this.AV22Ok_Baja;
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
      P020V2_A396EmprCod = new String[] {""} ;
      P020V2_A966PartCod = new String[] {""} ;
      P020V2_A252CliCod = new int[1] ;
      P020V2_A5850UbiTip = new String[] {""} ;
      P020V2_n5850UbiTip = new boolean[] {false} ;
      P020V2_A5834UbiAlbHdr = new int[1] ;
      P020V2_n5834UbiAlbHdr = new boolean[] {false} ;
      P020V2_A5854UbiKilUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P020V2_n5854UbiKilUti = new boolean[] {false} ;
      P020V2_A5855UbiConUti = new short[1] ;
      P020V2_n5855UbiConUti = new boolean[] {false} ;
      P020V2_A2248ManCod = new short[1] ;
      P020V2_n2248ManCod = new boolean[] {false} ;
      P020V2_A457FasCod = new String[] {""} ;
      P020V2_n457FasCod = new boolean[] {false} ;
      P020V2_A5838UbiCod = new String[] {""} ;
      P020V2_n5838UbiCod = new boolean[] {false} ;
      P020V2_A5849UbiLin = new short[1] ;
      A5850UbiTip = "" ;
      A5854UbiKilUti = DecimalUtil.ZERO ;
      A457FasCod = "" ;
      A5838UbiCod = "" ;
      AV31UbiKil = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      GXv_char8 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_date5 = new java.util.Date[1] ;
      GXv_char7 = new String[1] ;
      GXv_char6 = new String[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_int12 = new short[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_int10 = new short[1] ;
      GXv_int15 = new short[1] ;
      GXv_char2 = new String[1] ;
      GXv_char1 = new String[1] ;
      GXv_char16 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_int14 = new byte[1] ;
      GXv_char13 = new String[1] ;
      GXv_int17 = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pubibaj__default(),
         new Object[] {
             new Object[] {
            P020V2_A396EmprCod, P020V2_A966PartCod, P020V2_A252CliCod, P020V2_A5850UbiTip, P020V2_n5850UbiTip, P020V2_A5834UbiAlbHdr, P020V2_n5834UbiAlbHdr, P020V2_A5854UbiKilUti, P020V2_n5854UbiKilUti, P020V2_A5855UbiConUti,
            P020V2_n5855UbiConUti, P020V2_A2248ManCod, P020V2_n2248ManCod, P020V2_A457FasCod, P020V2_n457FasCod, P020V2_A5838UbiCod, P020V2_n5838UbiCod, P020V2_A5849UbiLin
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV22Ok_Baja ;
   private byte GXv_int14[] ;
   private byte GXv_int17[] ;
   private short A5855UbiConUti ;
   private short A2248ManCod ;
   private short A5849UbiLin ;
   private short AV32UbiCon ;
   private short GXv_int12[] ;
   private short GXv_int10[] ;
   private short GXv_int15[] ;
   private short Gx_err ;
   private int A252CliCod ;
   private int AV30UbiAlbHdr ;
   private int A5834UbiAlbHdr ;
   private int GXv_int3[] ;
   private int GXv_int4[] ;
   private java.math.BigDecimal A5854UbiKilUti ;
   private java.math.BigDecimal AV31UbiKil ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private String A396EmprCod ;
   private String A966PartCod ;
   private String AV23UbiTip ;
   private String scmdbuf ;
   private String A5850UbiTip ;
   private String A457FasCod ;
   private String A5838UbiCod ;
   private String GXv_char8[] ;
   private String GXv_char7[] ;
   private String GXv_char6[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String GXv_char16[] ;
   private String GXv_char13[] ;
   private java.util.Date Gx_date ;
   private java.util.Date GXv_date5[] ;
   private boolean n5850UbiTip ;
   private boolean n5834UbiAlbHdr ;
   private boolean n5854UbiKilUti ;
   private boolean n5855UbiConUti ;
   private boolean n2248ManCod ;
   private boolean n457FasCod ;
   private boolean n5838UbiCod ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private int[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P020V2_A396EmprCod ;
   private String[] P020V2_A966PartCod ;
   private int[] P020V2_A252CliCod ;
   private String[] P020V2_A5850UbiTip ;
   private boolean[] P020V2_n5850UbiTip ;
   private int[] P020V2_A5834UbiAlbHdr ;
   private boolean[] P020V2_n5834UbiAlbHdr ;
   private java.math.BigDecimal[] P020V2_A5854UbiKilUti ;
   private boolean[] P020V2_n5854UbiKilUti ;
   private short[] P020V2_A5855UbiConUti ;
   private boolean[] P020V2_n5855UbiConUti ;
   private short[] P020V2_A2248ManCod ;
   private boolean[] P020V2_n2248ManCod ;
   private String[] P020V2_A457FasCod ;
   private boolean[] P020V2_n457FasCod ;
   private String[] P020V2_A5838UbiCod ;
   private boolean[] P020V2_n5838UbiCod ;
   private short[] P020V2_A5849UbiLin ;
}

final  class pubibaj__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P020V2", "SELECT EmprCod, PartCod, CliCod, UbiTip, UbiAlbHdr, UbiKilUti, UbiConUti, ManCod, FasCod, UbiCod, UbiLin FROM TXPUBIMTO WHERE (EmprCod = ? and CliCod = ? and PartCod = ?) AND (UbiAlbHdr = ?) AND (UbiTip = ?) ORDER BY EmprCod, CliCod, PartCod, UbiCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(11);
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
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 2);
               return;
      }
   }

}

