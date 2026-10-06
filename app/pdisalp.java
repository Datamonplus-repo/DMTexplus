package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdisalp extends GXProcedure
{
   public pdisalp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdisalp.class ), "" );
   }

   public pdisalp( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            int[] aP2 ,
                            String[] aP3 ,
                            java.math.BigDecimal[] aP4 ,
                            java.math.BigDecimal[] aP5 ,
                            String[] aP6 )
   {
      pdisalp.this.aP7 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        String[] aP6 ,
                        short[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             String[] aP6 ,
                             short[] aP7 )
   {
      pdisalp.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdisalp.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      pdisalp.this.A44AlbRecCod = aP2[0];
      this.aP2 = aP2;
      pdisalp.this.A380DisPieCod = aP3[0];
      this.aP3 = aP3;
      pdisalp.this.AV33DisPieKil = aP4[0];
      this.aP4 = aP4;
      pdisalp.this.AV34DisPieMet = aP5[0];
      this.aP5 = aP5;
      pdisalp.this.AV19UniMed = aP6[0];
      this.aP6 = aP6;
      pdisalp.this.AV21Peso = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV40DatosCrudo ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CRUPML", ""), GXv_int2) ;
      pdisalp.this.GXt_int1 = GXv_int2[0] ;
      AV40DatosCrudo = GXt_int1 ;
      AV38FlagMfR = (byte)(0) ;
      GXv_int2[0] = AV38FlagMfR ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MTSRDO", ""), GXv_int2) ;
      pdisalp.this.AV38FlagMfR = GXv_int2[0] ;
      AV43Barpes = AV21Peso ;
      /* Using cursor P01L92 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P01L92_A252CliCod[0] ;
         A335DisArtCod = P01L92_A335DisArtCod[0] ;
         AV41clicod = A252CliCod ;
         AV42ARtcod = A335DisArtCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P01L93 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV41clicod), AV42ARtcod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A65ArtCod = P01L93_A65ArtCod[0] ;
         A252CliCod = P01L93_A252CliCod[0] ;
         A7415ArtPmlCru = P01L93_A7415ArtPmlCru[0] ;
         n7415ArtPmlCru = P01L93_n7415ArtPmlCru[0] ;
         AV43Barpes = ((AV40DatosCrudo==1) ? A7415ArtPmlCru : AV21Peso) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      /* Using cursor P01L94 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), A380DisPieCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A350DisArtRdt = P01L94_A350DisArtRdt[0] ;
         A382DisPieKil = P01L94_A382DisPieKil[0] ;
         A384DisPieMet = P01L94_A384DisPieMet[0] ;
         A350DisArtRdt = P01L94_A350DisArtRdt[0] ;
         AV37Rdto = A350DisArtRdt ;
         if ( GXutil.strcmp(AV19UniMed, httpContext.getMessage( "K", "")) == 0 )
         {
            if ( AV38FlagMfR == 1 )
            {
               if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV37Rdto)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV34DisPieMet)==0) )
               {
                  A384DisPieMet = A382DisPieKil.multiply(AV37Rdto) ;
                  AV34DisPieMet = A384DisPieMet ;
               }
            }
            else
            {
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV34DisPieMet)==0) )
               {
                  AV34DisPieMet = DecimalUtil.doubleToDec(0) ;
               }
               A384DisPieMet = AV34DisPieMet ;
            }
         }
         else
         {
            if ( AV43Barpes != 0 )
            {
               A382DisPieKil = A384DisPieMet.multiply(DecimalUtil.doubleToDec(AV43Barpes)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV33DisPieKil)==0) )
               {
                  AV33DisPieKil = A382DisPieKil ;
               }
            }
         }
         /* Using cursor P01L95 */
         pr_default.execute(3, new Object[] {A382DisPieKil, A384DisPieMet, A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), A380DisPieCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdisalp.this.A396EmprCod;
      this.aP1[0] = pdisalp.this.A361DisCod;
      this.aP2[0] = pdisalp.this.A44AlbRecCod;
      this.aP3[0] = pdisalp.this.A380DisPieCod;
      this.aP4[0] = pdisalp.this.AV33DisPieKil;
      this.aP5[0] = pdisalp.this.AV34DisPieMet;
      this.aP6[0] = pdisalp.this.AV19UniMed;
      this.aP7[0] = pdisalp.this.AV21Peso;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdisalp");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P01L92_A396EmprCod = new String[] {""} ;
      P01L92_A361DisCod = new int[1] ;
      P01L92_A252CliCod = new int[1] ;
      P01L92_A335DisArtCod = new String[] {""} ;
      A335DisArtCod = "" ;
      AV42ARtcod = "" ;
      P01L93_A396EmprCod = new String[] {""} ;
      P01L93_A65ArtCod = new String[] {""} ;
      P01L93_A252CliCod = new int[1] ;
      P01L93_A7415ArtPmlCru = new short[1] ;
      P01L93_n7415ArtPmlCru = new boolean[] {false} ;
      A65ArtCod = "" ;
      P01L94_A396EmprCod = new String[] {""} ;
      P01L94_A361DisCod = new int[1] ;
      P01L94_A44AlbRecCod = new int[1] ;
      P01L94_A380DisPieCod = new String[] {""} ;
      P01L94_A350DisArtRdt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01L94_A382DisPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01L94_A384DisPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A350DisArtRdt = DecimalUtil.ZERO ;
      A382DisPieKil = DecimalUtil.ZERO ;
      A384DisPieMet = DecimalUtil.ZERO ;
      AV37Rdto = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdisalp__default(),
         new Object[] {
             new Object[] {
            P01L92_A396EmprCod, P01L92_A361DisCod, P01L92_A252CliCod, P01L92_A335DisArtCod
            }
            , new Object[] {
            P01L93_A396EmprCod, P01L93_A65ArtCod, P01L93_A252CliCod, P01L93_A7415ArtPmlCru, P01L93_n7415ArtPmlCru
            }
            , new Object[] {
            P01L94_A396EmprCod, P01L94_A361DisCod, P01L94_A44AlbRecCod, P01L94_A380DisPieCod, P01L94_A350DisArtRdt, P01L94_A382DisPieKil, P01L94_A384DisPieMet
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV40DatosCrudo ;
   private byte GXt_int1 ;
   private byte AV38FlagMfR ;
   private byte GXv_int2[] ;
   private short AV21Peso ;
   private short AV43Barpes ;
   private short A7415ArtPmlCru ;
   private short Gx_err ;
   private int A361DisCod ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int AV41clicod ;
   private java.math.BigDecimal AV33DisPieKil ;
   private java.math.BigDecimal AV34DisPieMet ;
   private java.math.BigDecimal A350DisArtRdt ;
   private java.math.BigDecimal A382DisPieKil ;
   private java.math.BigDecimal A384DisPieMet ;
   private java.math.BigDecimal AV37Rdto ;
   private String A396EmprCod ;
   private String A380DisPieCod ;
   private String AV19UniMed ;
   private String scmdbuf ;
   private String A335DisArtCod ;
   private String AV42ARtcod ;
   private String A65ArtCod ;
   private boolean n7415ArtPmlCru ;
   private short[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P01L92_A396EmprCod ;
   private int[] P01L92_A361DisCod ;
   private int[] P01L92_A252CliCod ;
   private String[] P01L92_A335DisArtCod ;
   private String[] P01L93_A396EmprCod ;
   private String[] P01L93_A65ArtCod ;
   private int[] P01L93_A252CliCod ;
   private short[] P01L93_A7415ArtPmlCru ;
   private boolean[] P01L93_n7415ArtPmlCru ;
   private String[] P01L94_A396EmprCod ;
   private int[] P01L94_A361DisCod ;
   private int[] P01L94_A44AlbRecCod ;
   private String[] P01L94_A380DisPieCod ;
   private java.math.BigDecimal[] P01L94_A350DisArtRdt ;
   private java.math.BigDecimal[] P01L94_A382DisPieKil ;
   private java.math.BigDecimal[] P01L94_A384DisPieMet ;
}

final  class pdisalp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01L92", "SELECT EmprCod, DisCod, CliCod, DisArtCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01L93", "SELECT EmprCod, ArtCod, CliCod, ArtPmlCru FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01L94", "SELECT T1.EmprCod, T1.DisCod, T1.AlbRecCod, T1.DisPieCod, T2.DisArtRdt, T1.DisPieKil, T1.DisPieMet FROM (TXPDISALD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) WHERE T1.EmprCod = ? and T1.DisCod = ? and T1.AlbRecCod = ? and T1.DisPieCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.AlbRecCod, T1.DisPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01L95", "UPDATE TXPDISALD SET DisPieKil=?, DisPieMet=?  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ? AND DisPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALD")
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 9);
               return;
            case 3 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 9);
               return;
      }
   }

}

