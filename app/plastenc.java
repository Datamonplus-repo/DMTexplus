package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plastenc extends GXProcedure
{
   public plastenc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plastenc.class ), "" );
   }

   public plastenc( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 )
   {
      plastenc.this.aP9 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 )
   {
      plastenc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      plastenc.this.AV8CliCod = aP1[0];
      this.aP1 = aP1;
      plastenc.this.AV9Albrdiscli = aP2[0];
      this.aP2 = aP2;
      plastenc.this.AV10Albref = aP3[0];
      this.aP3 = aP3;
      plastenc.this.AV15Albrent = aP4[0];
      this.aP4 = aP4;
      plastenc.this.AV13Albrlote = aP5[0];
      this.aP5 = aP5;
      plastenc.this.AV14Albrlu = aP6[0];
      this.aP6 = aP6;
      plastenc.this.AV11Albrmdlcod = aP7[0];
      this.aP7 = aP7;
      plastenc.this.AV12Albrtelar = aP8[0];
      this.aP8 = aP8;
      plastenc.this.AV16ALBDOCPRV = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10Albref = " " ;
      AV11Albrmdlcod = " " ;
      AV12Albrtelar = " " ;
      AV13Albrlote = " " ;
      AV14Albrlu = DecimalUtil.doubleToDec(0) ;
      AV15Albrent = " " ;
      /* Using cursor P02IJ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8CliCod), AV9Albrdiscli});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P02IJ2_A252CliCod[0] ;
         A3359AlbRDisCli = P02IJ2_A3359AlbRDisCli[0] ;
         A1211TipEntCod = P02IJ2_A1211TipEntCod[0] ;
         n1211TipEntCod = P02IJ2_n1211TipEntCod[0] ;
         A45AlbRef = P02IJ2_A45AlbRef[0] ;
         A4602AlbRMdlCod = P02IJ2_A4602AlbRMdlCod[0] ;
         A6464AlbRTelar = P02IJ2_A6464AlbRTelar[0] ;
         A6463AlbRLote = P02IJ2_A6463AlbRLote[0] ;
         A6465AlbRLu = P02IJ2_A6465AlbRLu[0] ;
         A46AlbREnt = P02IJ2_A46AlbREnt[0] ;
         A6488AlbDocPrv = P02IJ2_A6488AlbDocPrv[0] ;
         A44AlbRecCod = P02IJ2_A44AlbRecCod[0] ;
         AV10Albref = A45AlbRef ;
         AV11Albrmdlcod = A4602AlbRMdlCod ;
         AV12Albrtelar = A6464AlbRTelar ;
         AV13Albrlote = A6463AlbRLote ;
         AV14Albrlu = A6465AlbRLu ;
         AV15Albrent = A46AlbREnt ;
         AV16ALBDOCPRV = A6488AlbDocPrv ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = plastenc.this.A396EmprCod;
      this.aP1[0] = plastenc.this.AV8CliCod;
      this.aP2[0] = plastenc.this.AV9Albrdiscli;
      this.aP3[0] = plastenc.this.AV10Albref;
      this.aP4[0] = plastenc.this.AV15Albrent;
      this.aP5[0] = plastenc.this.AV13Albrlote;
      this.aP6[0] = plastenc.this.AV14Albrlu;
      this.aP7[0] = plastenc.this.AV11Albrmdlcod;
      this.aP8[0] = plastenc.this.AV12Albrtelar;
      this.aP9[0] = plastenc.this.AV16ALBDOCPRV;
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
      P02IJ2_A396EmprCod = new String[] {""} ;
      P02IJ2_A252CliCod = new int[1] ;
      P02IJ2_A3359AlbRDisCli = new String[] {""} ;
      P02IJ2_A1211TipEntCod = new short[1] ;
      P02IJ2_n1211TipEntCod = new boolean[] {false} ;
      P02IJ2_A45AlbRef = new String[] {""} ;
      P02IJ2_A4602AlbRMdlCod = new String[] {""} ;
      P02IJ2_A6464AlbRTelar = new String[] {""} ;
      P02IJ2_A6463AlbRLote = new String[] {""} ;
      P02IJ2_A6465AlbRLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02IJ2_A46AlbREnt = new String[] {""} ;
      P02IJ2_A6488AlbDocPrv = new String[] {""} ;
      P02IJ2_A44AlbRecCod = new int[1] ;
      A3359AlbRDisCli = "" ;
      A45AlbRef = "" ;
      A4602AlbRMdlCod = "" ;
      A6464AlbRTelar = "" ;
      A6463AlbRLote = "" ;
      A6465AlbRLu = DecimalUtil.ZERO ;
      A46AlbREnt = "" ;
      A6488AlbDocPrv = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.plastenc__default(),
         new Object[] {
             new Object[] {
            P02IJ2_A396EmprCod, P02IJ2_A252CliCod, P02IJ2_A3359AlbRDisCli, P02IJ2_A1211TipEntCod, P02IJ2_n1211TipEntCod, P02IJ2_A45AlbRef, P02IJ2_A4602AlbRMdlCod, P02IJ2_A6464AlbRTelar, P02IJ2_A6463AlbRLote, P02IJ2_A6465AlbRLu,
            P02IJ2_A46AlbREnt, P02IJ2_A6488AlbDocPrv, P02IJ2_A44AlbRecCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A1211TipEntCod ;
   private short Gx_err ;
   private int AV8CliCod ;
   private int A252CliCod ;
   private int A44AlbRecCod ;
   private java.math.BigDecimal AV14Albrlu ;
   private java.math.BigDecimal A6465AlbRLu ;
   private String A396EmprCod ;
   private String AV9Albrdiscli ;
   private String AV10Albref ;
   private String AV15Albrent ;
   private String AV13Albrlote ;
   private String AV11Albrmdlcod ;
   private String AV12Albrtelar ;
   private String AV16ALBDOCPRV ;
   private String scmdbuf ;
   private String A3359AlbRDisCli ;
   private String A45AlbRef ;
   private String A4602AlbRMdlCod ;
   private String A6464AlbRTelar ;
   private String A6463AlbRLote ;
   private String A46AlbREnt ;
   private String A6488AlbDocPrv ;
   private boolean n1211TipEntCod ;
   private String[] aP9 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P02IJ2_A396EmprCod ;
   private int[] P02IJ2_A252CliCod ;
   private String[] P02IJ2_A3359AlbRDisCli ;
   private short[] P02IJ2_A1211TipEntCod ;
   private boolean[] P02IJ2_n1211TipEntCod ;
   private String[] P02IJ2_A45AlbRef ;
   private String[] P02IJ2_A4602AlbRMdlCod ;
   private String[] P02IJ2_A6464AlbRTelar ;
   private String[] P02IJ2_A6463AlbRLote ;
   private java.math.BigDecimal[] P02IJ2_A6465AlbRLu ;
   private String[] P02IJ2_A46AlbREnt ;
   private String[] P02IJ2_A6488AlbDocPrv ;
   private int[] P02IJ2_A44AlbRecCod ;
}

final  class plastenc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02IJ2", "SELECT * FROM (SELECT EmprCod, CliCod, AlbRDisCli, TipEntCod, AlbRef, AlbRMdlCod, AlbRTelar, AlbRLote, AlbRLu, AlbREnt, AlbDocPrv, AlbRecCod FROM TXPALBREC WHERE (EmprCod = ? and CliCod = ? and AlbRDisCli = ?) AND (TipEntCod <> 9999) ORDER BY EmprCod, CliCod, AlbRDisCli, AlbRecCod DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((String[]) buf[7])[0] = rslt.getString(7, 20);
               ((String[]) buf[8])[0] = rslt.getString(8, 20);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[10])[0] = rslt.getString(10, 8);
               ((String[]) buf[11])[0] = rslt.getString(11, 10);
               ((int[]) buf[12])[0] = rslt.getInt(12);
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
               stmt.setString(3, (String)parms[2], 20);
               return;
      }
   }

}

