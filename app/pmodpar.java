package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmodpar extends GXProcedure
{
   public pmodpar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmodpar.class ), "" );
   }

   public pmodpar( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     String[] aP1 ,
                                     int[] aP2 ,
                                     int[] aP3 ,
                                     short[] aP4 ,
                                     java.math.BigDecimal[] aP5 ,
                                     short[] aP6 ,
                                     java.math.BigDecimal[] aP7 ,
                                     String[] aP8 ,
                                     String[] aP9 ,
                                     int[] aP10 )
   {
      pmodpar.this.aP11 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 ,
                        short[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        short[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        int[] aP10 ,
                        java.util.Date[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 ,
                             short[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             short[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             int[] aP10 ,
                             java.util.Date[] aP11 )
   {
      pmodpar.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pmodpar.this.AV16PartCod = aP1[0];
      this.aP1 = aP1;
      pmodpar.this.AV17CliCod = aP2[0];
      this.aP2 = aP2;
      pmodpar.this.AV18PartAlbDis = aP3[0];
      this.aP3 = aP3;
      pmodpar.this.AV19ActCon = aP4[0];
      this.aP4 = aP4;
      pmodpar.this.AV20ActKgm = aP5[0];
      this.aP5 = aP5;
      pmodpar.this.AV21OldCon = aP6[0];
      this.aP6 = aP6;
      pmodpar.this.AV22OldKgm = aP7[0];
      this.aP7 = aP7;
      pmodpar.this.AV23PartTipLin = aP8[0];
      this.aP8 = aP8;
      pmodpar.this.AV24DisColNom = aP9[0];
      this.aP9 = aP9;
      pmodpar.this.AV25DisColNum = aP10[0];
      this.aP10 = aP10;
      pmodpar.this.AV26PartFecMov = aP11[0];
      this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV31FlagMag = (byte)(0) ;
      GXv_int1[0] = AV31FlagMag ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "MAGOSA", ""), GXv_int1) ;
      pmodpar.this.AV31FlagMag = GXv_int1[0] ;
      AV32FlagBros = (byte)(0) ;
      GXv_int1[0] = AV32FlagBros ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "BROS  ", ""), GXv_int1) ;
      pmodpar.this.AV32FlagBros = GXv_int1[0] ;
      AV34FlagSalt = (byte)(0) ;
      GXv_int1[0] = AV34FlagSalt ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "SALTIN", ""), GXv_int1) ;
      pmodpar.this.AV34FlagSalt = GXv_int1[0] ;
      AV35Pervaf = (byte)(0) ;
      GXv_int1[0] = AV35Pervaf ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "PERVAF", ""), GXv_int1) ;
      pmodpar.this.AV35Pervaf = GXv_int1[0] ;
      AV27DisRes = httpContext.getMessage( "N", "") ;
      AV29DispCli = "" ;
      AV33DisNumTen = "" ;
      if ( ( GXutil.strcmp(AV23PartTipLin, httpContext.getMessage( "B", "")) == 0 ) || ( GXutil.strcmp(AV23PartTipLin, httpContext.getMessage( "R", "")) == 0 ) )
      {
         /* Using cursor P006G2 */
         pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV18PartAlbDis)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A361DisCod = P006G2_A361DisCod[0] ;
            A396EmprCod = P006G2_A396EmprCod[0] ;
            A1968DisRes = P006G2_A1968DisRes[0] ;
            n1968DisRes = P006G2_n1968DisRes[0] ;
            A360DisCliNum = P006G2_A360DisCliNum[0] ;
            A2009DisTipDis = P006G2_A2009DisTipDis[0] ;
            n2009DisTipDis = P006G2_n2009DisTipDis[0] ;
            A1002DisNumTen = P006G2_A1002DisNumTen[0] ;
            n1002DisNumTen = P006G2_n1002DisNumTen[0] ;
            AV27DisRes = A1968DisRes ;
            AV29DispCli = A360DisCliNum ;
            AV30DisTipDis = A2009DisTipDis ;
            AV33DisNumTen = A1002DisNumTen ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
      }
      /* Using cursor P006G3 */
      pr_default.execute(1, new Object[] {AV15EmprCod, AV16PartCod, Integer.valueOf(AV17CliCod), Integer.valueOf(AV18PartAlbDis), AV23PartTipLin});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A980PartLinTip = P006G3_A980PartLinTip[0] ;
         n980PartLinTip = P006G3_n980PartLinTip[0] ;
         A981PartAlbDis = P006G3_A981PartAlbDis[0] ;
         n981PartAlbDis = P006G3_n981PartAlbDis[0] ;
         A252CliCod = P006G3_A252CliCod[0] ;
         A966PartCod = P006G3_A966PartCod[0] ;
         A396EmprCod = P006G3_A396EmprCod[0] ;
         A982PartSitDis = P006G3_A982PartSitDis[0] ;
         n982PartSitDis = P006G3_n982PartSitDis[0] ;
         A2246ParNumCli = P006G3_A2246ParNumCli[0] ;
         n2246ParNumCli = P006G3_n2246ParNumCli[0] ;
         A986KilUti = P006G3_A986KilUti[0] ;
         n986KilUti = P006G3_n986KilUti[0] ;
         A987ConUti = P006G3_A987ConUti[0] ;
         n987ConUti = P006G3_n987ConUti[0] ;
         A1966KilRes = P006G3_A1966KilRes[0] ;
         n1966KilRes = P006G3_n1966KilRes[0] ;
         A1967ConRes = P006G3_A1967ConRes[0] ;
         n1967ConRes = P006G3_n1967ConRes[0] ;
         A983PartFecMov = P006G3_A983PartFecMov[0] ;
         n983PartFecMov = P006G3_n983PartFecMov[0] ;
         A979PartLin = P006G3_A979PartLin[0] ;
         if ( ( GXutil.strcmp(AV23PartTipLin, httpContext.getMessage( "B", "")) == 0 ) || ( GXutil.strcmp(AV23PartTipLin, httpContext.getMessage( "R", "")) == 0 ) )
         {
            if ( ( AV32FlagBros == 1 ) || ( AV34FlagSalt == 1 ) )
            {
               A982PartSitDis = GXutil.concat( AV29DispCli, AV33DisNumTen, " / ") ;
               n982PartSitDis = false ;
            }
            else
            {
               A982PartSitDis = GXutil.concat( AV24DisColNom, GXutil.str( AV25DisColNum, 6, 0), " / ") ;
               n982PartSitDis = false ;
            }
            if ( AV35Pervaf == 1 )
            {
               A982PartSitDis = httpContext.getMessage( "T. ", "") + AV33DisNumTen ;
               n982PartSitDis = false ;
            }
            A2246ParNumCli = AV29DispCli ;
            n2246ParNumCli = false ;
         }
         if ( ( GXutil.strcmp(AV30DisTipDis, httpContext.getMessage( "P", "")) == 0 ) && ( AV31FlagMag == 1 ) )
         {
            A986KilUti = A986KilUti.add((AV20ActKgm.subtract(AV22OldKgm))) ;
            n986KilUti = false ;
            A987ConUti = (short)(A987ConUti+(AV19ActCon-AV21OldCon)) ;
            n987ConUti = false ;
         }
         else
         {
            if ( ( GXutil.strcmp(AV27DisRes, httpContext.getMessage( "S", "")) == 0 ) || ( GXutil.strcmp(AV23PartTipLin, httpContext.getMessage( "R", "")) == 0 ) )
            {
               A1966KilRes = A1966KilRes.add((AV20ActKgm.subtract(AV22OldKgm))) ;
               n1966KilRes = false ;
               A1967ConRes = (short)(A1967ConRes+(AV19ActCon-AV21OldCon)) ;
               n1967ConRes = false ;
            }
            else
            {
               A986KilUti = A986KilUti.add((AV20ActKgm.subtract(AV22OldKgm))) ;
               n986KilUti = false ;
               A987ConUti = (short)(A987ConUti+(AV19ActCon-AV21OldCon)) ;
               n987ConUti = false ;
            }
         }
         A983PartFecMov = AV26PartFecMov ;
         n983PartFecMov = false ;
         /* Using cursor P006G4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n982PartSitDis), A982PartSitDis, Boolean.valueOf(n2246ParNumCli), A2246ParNumCli, Boolean.valueOf(n986KilUti), A986KilUti, Boolean.valueOf(n987ConUti), Short.valueOf(A987ConUti), Boolean.valueOf(n1966KilRes), A1966KilRes, Boolean.valueOf(n1967ConRes), Short.valueOf(A1967ConRes), Boolean.valueOf(n983PartFecMov), A983PartFecMov, A396EmprCod, A966PartCod, Integer.valueOf(A252CliCod), Integer.valueOf(A979PartLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPARTI");
         pr_default.readNext(1);
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmodpar.this.AV15EmprCod;
      this.aP1[0] = pmodpar.this.AV16PartCod;
      this.aP2[0] = pmodpar.this.AV17CliCod;
      this.aP3[0] = pmodpar.this.AV18PartAlbDis;
      this.aP4[0] = pmodpar.this.AV19ActCon;
      this.aP5[0] = pmodpar.this.AV20ActKgm;
      this.aP6[0] = pmodpar.this.AV21OldCon;
      this.aP7[0] = pmodpar.this.AV22OldKgm;
      this.aP8[0] = pmodpar.this.AV23PartTipLin;
      this.aP9[0] = pmodpar.this.AV24DisColNom;
      this.aP10[0] = pmodpar.this.AV25DisColNum;
      this.aP11[0] = pmodpar.this.AV26PartFecMov;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmodpar");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      AV27DisRes = "" ;
      AV29DispCli = "" ;
      AV33DisNumTen = "" ;
      scmdbuf = "" ;
      P006G2_A361DisCod = new int[1] ;
      P006G2_A396EmprCod = new String[] {""} ;
      P006G2_A1968DisRes = new String[] {""} ;
      P006G2_n1968DisRes = new boolean[] {false} ;
      P006G2_A360DisCliNum = new String[] {""} ;
      P006G2_A2009DisTipDis = new String[] {""} ;
      P006G2_n2009DisTipDis = new boolean[] {false} ;
      P006G2_A1002DisNumTen = new String[] {""} ;
      P006G2_n1002DisNumTen = new boolean[] {false} ;
      A396EmprCod = "" ;
      A1968DisRes = "" ;
      A360DisCliNum = "" ;
      A2009DisTipDis = "" ;
      A1002DisNumTen = "" ;
      AV30DisTipDis = "" ;
      P006G3_A980PartLinTip = new String[] {""} ;
      P006G3_n980PartLinTip = new boolean[] {false} ;
      P006G3_A981PartAlbDis = new int[1] ;
      P006G3_n981PartAlbDis = new boolean[] {false} ;
      P006G3_A252CliCod = new int[1] ;
      P006G3_A966PartCod = new String[] {""} ;
      P006G3_A396EmprCod = new String[] {""} ;
      P006G3_A982PartSitDis = new String[] {""} ;
      P006G3_n982PartSitDis = new boolean[] {false} ;
      P006G3_A2246ParNumCli = new String[] {""} ;
      P006G3_n2246ParNumCli = new boolean[] {false} ;
      P006G3_A986KilUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006G3_n986KilUti = new boolean[] {false} ;
      P006G3_A987ConUti = new short[1] ;
      P006G3_n987ConUti = new boolean[] {false} ;
      P006G3_A1966KilRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006G3_n1966KilRes = new boolean[] {false} ;
      P006G3_A1967ConRes = new short[1] ;
      P006G3_n1967ConRes = new boolean[] {false} ;
      P006G3_A983PartFecMov = new java.util.Date[] {GXutil.nullDate()} ;
      P006G3_n983PartFecMov = new boolean[] {false} ;
      P006G3_A979PartLin = new int[1] ;
      A980PartLinTip = "" ;
      A966PartCod = "" ;
      A982PartSitDis = "" ;
      A2246ParNumCli = "" ;
      A986KilUti = DecimalUtil.ZERO ;
      A1966KilRes = DecimalUtil.ZERO ;
      A983PartFecMov = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmodpar__default(),
         new Object[] {
             new Object[] {
            P006G2_A361DisCod, P006G2_A396EmprCod, P006G2_A1968DisRes, P006G2_n1968DisRes, P006G2_A360DisCliNum, P006G2_A2009DisTipDis, P006G2_n2009DisTipDis, P006G2_A1002DisNumTen, P006G2_n1002DisNumTen
            }
            , new Object[] {
            P006G3_A980PartLinTip, P006G3_n980PartLinTip, P006G3_A981PartAlbDis, P006G3_n981PartAlbDis, P006G3_A252CliCod, P006G3_A966PartCod, P006G3_A396EmprCod, P006G3_A982PartSitDis, P006G3_n982PartSitDis, P006G3_A2246ParNumCli,
            P006G3_n2246ParNumCli, P006G3_A986KilUti, P006G3_n986KilUti, P006G3_A987ConUti, P006G3_n987ConUti, P006G3_A1966KilRes, P006G3_n1966KilRes, P006G3_A1967ConRes, P006G3_n1967ConRes, P006G3_A983PartFecMov,
            P006G3_n983PartFecMov, P006G3_A979PartLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV31FlagMag ;
   private byte AV32FlagBros ;
   private byte AV34FlagSalt ;
   private byte AV35Pervaf ;
   private byte GXv_int1[] ;
   private short AV19ActCon ;
   private short AV21OldCon ;
   private short A987ConUti ;
   private short A1967ConRes ;
   private short Gx_err ;
   private int AV17CliCod ;
   private int AV18PartAlbDis ;
   private int AV25DisColNum ;
   private int A361DisCod ;
   private int A981PartAlbDis ;
   private int A252CliCod ;
   private int A979PartLin ;
   private java.math.BigDecimal AV20ActKgm ;
   private java.math.BigDecimal AV22OldKgm ;
   private java.math.BigDecimal A986KilUti ;
   private java.math.BigDecimal A1966KilRes ;
   private String AV15EmprCod ;
   private String AV16PartCod ;
   private String AV23PartTipLin ;
   private String AV24DisColNom ;
   private String AV27DisRes ;
   private String AV29DispCli ;
   private String AV33DisNumTen ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A1968DisRes ;
   private String A360DisCliNum ;
   private String A2009DisTipDis ;
   private String A1002DisNumTen ;
   private String AV30DisTipDis ;
   private String A980PartLinTip ;
   private String A966PartCod ;
   private String A982PartSitDis ;
   private String A2246ParNumCli ;
   private java.util.Date AV26PartFecMov ;
   private java.util.Date A983PartFecMov ;
   private boolean n1968DisRes ;
   private boolean n2009DisTipDis ;
   private boolean n1002DisNumTen ;
   private boolean n980PartLinTip ;
   private boolean n981PartAlbDis ;
   private boolean n982PartSitDis ;
   private boolean n2246ParNumCli ;
   private boolean n986KilUti ;
   private boolean n987ConUti ;
   private boolean n1966KilRes ;
   private boolean n1967ConRes ;
   private boolean n983PartFecMov ;
   private java.util.Date[] aP11 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private int[] aP3 ;
   private short[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private short[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private int[] aP10 ;
   private IDataStoreProvider pr_default ;
   private int[] P006G2_A361DisCod ;
   private String[] P006G2_A396EmprCod ;
   private String[] P006G2_A1968DisRes ;
   private boolean[] P006G2_n1968DisRes ;
   private String[] P006G2_A360DisCliNum ;
   private String[] P006G2_A2009DisTipDis ;
   private boolean[] P006G2_n2009DisTipDis ;
   private String[] P006G2_A1002DisNumTen ;
   private boolean[] P006G2_n1002DisNumTen ;
   private String[] P006G3_A980PartLinTip ;
   private boolean[] P006G3_n980PartLinTip ;
   private int[] P006G3_A981PartAlbDis ;
   private boolean[] P006G3_n981PartAlbDis ;
   private int[] P006G3_A252CliCod ;
   private String[] P006G3_A966PartCod ;
   private String[] P006G3_A396EmprCod ;
   private String[] P006G3_A982PartSitDis ;
   private boolean[] P006G3_n982PartSitDis ;
   private String[] P006G3_A2246ParNumCli ;
   private boolean[] P006G3_n2246ParNumCli ;
   private java.math.BigDecimal[] P006G3_A986KilUti ;
   private boolean[] P006G3_n986KilUti ;
   private short[] P006G3_A987ConUti ;
   private boolean[] P006G3_n987ConUti ;
   private java.math.BigDecimal[] P006G3_A1966KilRes ;
   private boolean[] P006G3_n1966KilRes ;
   private short[] P006G3_A1967ConRes ;
   private boolean[] P006G3_n1967ConRes ;
   private java.util.Date[] P006G3_A983PartFecMov ;
   private boolean[] P006G3_n983PartFecMov ;
   private int[] P006G3_A979PartLin ;
}

final  class pmodpar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P006G2", "SELECT DisCod, EmprCod, DisRes, DisCliNum, DisTipDis, DisNumTen FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P006G3", "SELECT PartLinTip, PartAlbDis, CliCod, PartCod, EmprCod, PartSitDis, ParNumCli, KilUti, ConUti, KilRes, ConRes, PartFecMov, PartLin FROM TXPLPARTI WHERE (EmprCod = ? and PartCod = ? and CliCod = ?) AND (PartAlbDis = ?) AND (PartLinTip = ?) ORDER BY EmprCod, PartCod, CliCod, PartLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P006G4", "UPDATE TXPLPARTI SET PartSitDis=?, ParNumCli=?, KilUti=?, ConUti=?, KilRes=?, ConRes=?, PartFecMov=?  WHERE EmprCod = ? AND PartCod = ? AND CliCod = ? AND PartLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPARTI")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(3);
               ((String[]) buf[5])[0] = rslt.getString(4, 16);
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((String[]) buf[7])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(13);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 20);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 8);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DATE );
               }
               else
               {
                  stmt.setDate(7, (java.util.Date)parms[13]);
               }
               stmt.setString(8, (String)parms[14], 3);
               stmt.setString(9, (String)parms[15], 16);
               stmt.setInt(10, ((Number) parms[16]).intValue());
               stmt.setInt(11, ((Number) parms[17]).intValue());
               return;
      }
   }

}

