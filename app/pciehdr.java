package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pciehdr extends GXProcedure
{
   public pciehdr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pciehdr.class ), "" );
   }

   public pciehdr( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     int[] aP1 ,
                                     byte[] aP2 ,
                                     String[] aP3 )
   {
      pciehdr.this.aP4 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.util.Date[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.util.Date[] aP4 )
   {
      pciehdr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pciehdr.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pciehdr.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pciehdr.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pciehdr.this.AV26FecSal = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV23FlagBlati ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "BLATI ", ""), GXv_int1) ;
      pciehdr.this.AV23FlagBlati = GXv_int1[0] ;
      GXv_int1[0] = AV24FlagFini ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FINITE", ""), GXv_int1) ;
      pciehdr.this.AV24FlagFini = GXv_int1[0] ;
      /* Using cursor P014J3 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P014J3_A252CliCod[0] ;
         n252CliCod = P014J3_n252CliCod[0] ;
         A212BarSer = P014J3_A212BarSer[0] ;
         A3133BarNumCor = P014J3_A3133BarNumCor[0] ;
         A213BarSit = P014J3_A213BarSit[0] ;
         A166BarKgm = P014J3_A166BarKgm[0] ;
         A184BarMtr = P014J3_A184BarMtr[0] ;
         A168BarKgmLan = P014J3_A168BarKgmLan[0] ;
         A186BarMtrLan = P014J3_A186BarMtrLan[0] ;
         A166BarKgm = P014J3_A166BarKgm[0] ;
         A184BarMtr = P014J3_A184BarMtr[0] ;
         A168BarKgmLan = P014J3_A168BarKgmLan[0] ;
         A186BarMtrLan = P014J3_A186BarMtrLan[0] ;
         GXv_char2[0] = A396EmprCod ;
         GXv_int3[0] = A252CliCod ;
         GXv_char4[0] = A212BarSer ;
         GXv_decimal5[0] = AV25ArtMer ;
         new app.pbusmer(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4, GXv_decimal5) ;
         pciehdr.this.A396EmprCod = GXv_char2[0] ;
         pciehdr.this.A252CliCod = GXv_int3[0] ;
         pciehdr.this.A212BarSer = GXv_char4[0] ;
         pciehdr.this.AV25ArtMer = GXv_decimal5[0] ;
         AV16BarKgm = A166BarKgm ;
         AV17BarMtr = A184BarMtr ;
         AV18BarKgmLan = A168BarKgmLan ;
         AV19BarMtrLan = A186BarMtrLan ;
         AV22vCortes = (short)(A3133BarNumCor+1) ;
         AV14BarSit = A213BarSit ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV20DifKgm = AV16BarKgm.subtract(AV18BarKgmLan) ;
      AV21DifMtr = AV17BarMtr.subtract(AV19BarMtrLan) ;
      AV15OK = " " ;
      if ( AV14BarSit != 9 )
      {
         while ( ( GXutil.strcmp(AV15OK, httpContext.getMessage( "N", "")) != 0 ) && ( GXutil.strcmp(AV15OK, httpContext.getMessage( "S", "")) != 0 ) )
         {
            if ( AV22vCortes == 1 )
            {
            }
            else
            {
            }
         }
         if ( GXutil.strcmp(AV15OK, httpContext.getMessage( "S", "")) == 0 )
         {
            GXv_char4[0] = A396EmprCod ;
            GXv_int3[0] = A129BarCod ;
            GXv_int1[0] = A132BarCodReo ;
            GXv_char2[0] = A130BarCodPar ;
            GXv_char6[0] = httpContext.getMessage( "C", "") ;
            new app.pciebar(remoteHandle, context).execute( GXv_char4, GXv_int3, GXv_int1, GXv_char2, GXv_char6) ;
            pciehdr.this.A396EmprCod = GXv_char4[0] ;
            pciehdr.this.A129BarCod = GXv_int3[0] ;
            pciehdr.this.A132BarCodReo = GXv_int1[0] ;
            pciehdr.this.A130BarCodPar = GXv_char2[0] ;
            if ( AV23FlagBlati == 1 )
            {
            }
            if ( AV24FlagFini == 1 )
            {
               GXv_char6[0] = A396EmprCod ;
               GXv_int3[0] = A129BarCod ;
               GXv_int1[0] = A132BarCodReo ;
               GXv_char4[0] = A130BarCodPar ;
               new app.pciefas(remoteHandle, context).execute( GXv_char6, GXv_int3, GXv_int1, GXv_char4) ;
               pciehdr.this.A396EmprCod = GXv_char6[0] ;
               pciehdr.this.A129BarCod = GXv_int3[0] ;
               pciehdr.this.A132BarCodReo = GXv_int1[0] ;
               pciehdr.this.A130BarCodPar = GXv_char4[0] ;
            }
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pciehdr.this.A396EmprCod;
      this.aP1[0] = pciehdr.this.A129BarCod;
      this.aP2[0] = pciehdr.this.A132BarCodReo;
      this.aP3[0] = pciehdr.this.A130BarCodPar;
      this.aP4[0] = pciehdr.this.AV26FecSal;
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
      P014J3_A396EmprCod = new String[] {""} ;
      P014J3_A129BarCod = new int[1] ;
      P014J3_A132BarCodReo = new byte[1] ;
      P014J3_A130BarCodPar = new String[] {""} ;
      P014J3_A252CliCod = new int[1] ;
      P014J3_n252CliCod = new boolean[] {false} ;
      P014J3_A212BarSer = new String[] {""} ;
      P014J3_A3133BarNumCor = new short[1] ;
      P014J3_A213BarSit = new byte[1] ;
      P014J3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P014J3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P014J3_A168BarKgmLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P014J3_A186BarMtrLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A212BarSer = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A168BarKgmLan = DecimalUtil.ZERO ;
      A186BarMtrLan = DecimalUtil.ZERO ;
      AV25ArtMer = DecimalUtil.ZERO ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      AV16BarKgm = DecimalUtil.ZERO ;
      AV17BarMtr = DecimalUtil.ZERO ;
      AV18BarKgmLan = DecimalUtil.ZERO ;
      AV19BarMtrLan = DecimalUtil.ZERO ;
      AV20DifKgm = DecimalUtil.ZERO ;
      AV21DifMtr = DecimalUtil.ZERO ;
      AV15OK = "" ;
      GXv_char2 = new String[1] ;
      GXv_char6 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_int1 = new byte[1] ;
      GXv_char4 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pciehdr__default(),
         new Object[] {
             new Object[] {
            P014J3_A396EmprCod, P014J3_A129BarCod, P014J3_A132BarCodReo, P014J3_A130BarCodPar, P014J3_A252CliCod, P014J3_n252CliCod, P014J3_A212BarSer, P014J3_A3133BarNumCor, P014J3_A213BarSit, P014J3_A166BarKgm,
            P014J3_A184BarMtr, P014J3_A168BarKgmLan, P014J3_A186BarMtrLan
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV23FlagBlati ;
   private byte AV24FlagFini ;
   private byte A213BarSit ;
   private byte AV14BarSit ;
   private byte GXv_int1[] ;
   private short A3133BarNumCor ;
   private short AV22vCortes ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int GXv_int3[] ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A168BarKgmLan ;
   private java.math.BigDecimal A186BarMtrLan ;
   private java.math.BigDecimal AV25ArtMer ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal AV16BarKgm ;
   private java.math.BigDecimal AV17BarMtr ;
   private java.math.BigDecimal AV18BarKgmLan ;
   private java.math.BigDecimal AV19BarMtrLan ;
   private java.math.BigDecimal AV20DifKgm ;
   private java.math.BigDecimal AV21DifMtr ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A212BarSer ;
   private String AV15OK ;
   private String GXv_char2[] ;
   private String GXv_char6[] ;
   private String GXv_char4[] ;
   private java.util.Date AV26FecSal ;
   private boolean n252CliCod ;
   private java.util.Date[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P014J3_A396EmprCod ;
   private int[] P014J3_A129BarCod ;
   private byte[] P014J3_A132BarCodReo ;
   private String[] P014J3_A130BarCodPar ;
   private int[] P014J3_A252CliCod ;
   private boolean[] P014J3_n252CliCod ;
   private String[] P014J3_A212BarSer ;
   private short[] P014J3_A3133BarNumCor ;
   private byte[] P014J3_A213BarSit ;
   private java.math.BigDecimal[] P014J3_A166BarKgm ;
   private java.math.BigDecimal[] P014J3_A184BarMtr ;
   private java.math.BigDecimal[] P014J3_A168BarKgmLan ;
   private java.math.BigDecimal[] P014J3_A186BarMtrLan ;
}

final  class pciehdr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P014J3", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.CliCod, T1.BarSer, T1.BarNumCor, T1.BarSit, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarKgmLan, 0) AS BarKgmLan, COALESCE( T2.BarMtrLan, 0) AS BarMtrLan FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, SUM(BarKilLan) AS BarKgmLan, SUM(BarMetLan) AS BarMtrLan FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
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

